package androidx.compose.foundation.gestures;

import androidx.compose.foundation.FocusedBoundsKt;
import androidx.compose.foundation.relocation.BringIntoViewResponder;
import androidx.compose.foundation.relocation.BringIntoViewResponderKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.OnPlacedModifier;
import androidx.compose.ui.layout.OnRemeasuredModifier;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001EB%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ!\u0010\u001f\u001a\u00020 2\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\"H@ø\u0001\u0000¢\u0006\u0002\u0010#J\u0010\u0010$\u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u0015H\u0016J\b\u0010%\u001a\u00020&H\u0002J%\u0010'\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u001dH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b*\u0010+J\n\u0010,\u001a\u0004\u0018\u00010\u0015H\u0002J\n\u0010-\u001a\u0004\u0018\u00010\u0015H\u0002J\b\u0010.\u001a\u00020 H\u0002J\u0010\u0010/\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001d\u00100\u001a\u00020 2\u0006\u00101\u001a\u00020\u001dH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b2\u00103J \u00104\u001a\u00020&2\u0006\u00105\u001a\u00020&2\u0006\u00106\u001a\u00020&2\u0006\u0010)\u001a\u00020&H\u0002J%\u00107\u001a\u0002082\u0006\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u001dH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b9\u0010:J\"\u0010;\u001a\u00020<*\u00020=2\u0006\u0010>\u001a\u00020=H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b?\u0010@J\"\u0010;\u001a\u00020<*\u00020\u001d2\u0006\u0010>\u001a\u00020\u001dH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bA\u0010@J#\u0010B\u001a\u00020\u000b*\u00020\u00152\b\b\u0002\u00101\u001a\u00020\u001dH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bC\u0010DR\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0019\u0010\u001c\u001a\u00020\u001dX\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u001e\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006F"}, d2 = {"Landroidx/compose/foundation/gestures/ContentInViewModifier;", "Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "Landroidx/compose/ui/layout/OnRemeasuredModifier;", "Landroidx/compose/ui/layout/OnPlacedModifier;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "scrollState", "Landroidx/compose/foundation/gestures/ScrollableState;", "reverseDirection", "", "(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/gestures/ScrollableState;Z)V", "animationState", "Landroidx/compose/foundation/gestures/UpdatableAnimationState;", "bringIntoViewRequests", "Landroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue;", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "focusedChild", "focusedChildBoundsFromPreviousRemeasure", "Landroidx/compose/ui/geometry/Rect;", "isAnimationRunning", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "trackingFocusedChild", "viewportSize", "Landroidx/compose/ui/unit/IntSize;", "J", "bringChildIntoView", "", "localRect", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "calculateRectForParent", "calculateScrollDelta", "", "computeDestination", "childBounds", "containerSize", "computeDestination-O0kMr_c", "(Landroidx/compose/ui/geometry/Rect;J)Landroidx/compose/ui/geometry/Rect;", "findBringIntoViewRequest", "getFocusedChildBounds", "launchAnimation", "onPlaced", "onRemeasured", "size", "onRemeasured-ozmzZPI", "(J)V", "relocationDistance", "leadingEdge", "trailingEdge", "relocationOffset", "Landroidx/compose/ui/geometry/Offset;", "relocationOffset-BMxPBkI", "(Landroidx/compose/ui/geometry/Rect;J)J", "compareTo", "", "Landroidx/compose/ui/geometry/Size;", "other", "compareTo-iLBOSCw", "(JJ)I", "compareTo-TemP2vQ", "isMaxVisible", "isMaxVisible-O0kMr_c", "(Landroidx/compose/ui/geometry/Rect;J)Z", "Request", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: ContentInViewModifier.kt */
public final class ContentInViewModifier implements BringIntoViewResponder, OnRemeasuredModifier, OnPlacedModifier {
    /* access modifiers changed from: private */
    public final UpdatableAnimationState animationState = new UpdatableAnimationState();
    /* access modifiers changed from: private */
    public final BringIntoViewRequestPriorityQueue bringIntoViewRequests = new BringIntoViewRequestPriorityQueue();
    private LayoutCoordinates coordinates;
    /* access modifiers changed from: private */
    public LayoutCoordinates focusedChild;
    private Rect focusedChildBoundsFromPreviousRemeasure;
    /* access modifiers changed from: private */
    public boolean isAnimationRunning;
    private final Modifier modifier = BringIntoViewResponderKt.bringIntoViewResponder(FocusedBoundsKt.onFocusedBoundsChanged(this, new ContentInViewModifier$modifier$1(this)), this);
    private final Orientation orientation;
    /* access modifiers changed from: private */
    public final boolean reverseDirection;
    private final CoroutineScope scope;
    /* access modifiers changed from: private */
    public final ScrollableState scrollState;
    /* access modifiers changed from: private */
    public boolean trackingFocusedChild;
    private long viewportSize = IntSize.Companion.m5791getZeroYbymL2g();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* compiled from: ContentInViewModifier.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                androidx.compose.foundation.gestures.Orientation[] r0 = androidx.compose.foundation.gestures.Orientation.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.foundation.gestures.Orientation r1 = androidx.compose.foundation.gestures.Orientation.Vertical     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.foundation.gestures.Orientation r1 = androidx.compose.foundation.gestures.Orientation.Horizontal     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ContentInViewModifier.WhenMappings.<clinit>():void");
        }
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    public void onPlaced(LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "coordinates");
        this.coordinates = layoutCoordinates;
    }

    public ContentInViewModifier(CoroutineScope coroutineScope, Orientation orientation2, ScrollableState scrollableState, boolean z) {
        Intrinsics.checkNotNullParameter(coroutineScope, "scope");
        Intrinsics.checkNotNullParameter(orientation2, "orientation");
        Intrinsics.checkNotNullParameter(scrollableState, "scrollState");
        this.scope = coroutineScope;
        this.orientation = orientation2;
        this.scrollState = scrollableState;
        this.reverseDirection = z;
    }

    public Rect calculateRectForParent(Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "localRect");
        if (!IntSize.m5784equalsimpl0(this.viewportSize, IntSize.Companion.m5791getZeroYbymL2g())) {
            return m262computeDestinationO0kMr_c(rect, this.viewportSize);
        }
        throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.".toString());
    }

    public Object bringChildIntoView(Function0<Rect> function0, Continuation<? super Unit> continuation) {
        Rect invoke = function0.invoke();
        if (invoke == null || m264isMaxVisibleO0kMr_c$default(this, invoke, 0, 1, (Object) null)) {
            return Unit.INSTANCE;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        if (this.bringIntoViewRequests.enqueue(new Request(function0, cancellableContinuationImpl)) && !this.isAnimationRunning) {
            launchAnimation();
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return result;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: onRemeasured-ozmzZPI  reason: not valid java name */
    public void m266onRemeasuredozmzZPI(long j) {
        Rect focusedChildBounds;
        long j2 = this.viewportSize;
        this.viewportSize = j;
        if (m260compareToTemP2vQ(j, j2) < 0 && (focusedChildBounds = getFocusedChildBounds()) != null) {
            Rect rect = this.focusedChildBoundsFromPreviousRemeasure;
            if (rect == null) {
                rect = focusedChildBounds;
            }
            if (!this.isAnimationRunning && !this.trackingFocusedChild && m263isMaxVisibleO0kMr_c(rect, j2) && !m263isMaxVisibleO0kMr_c(focusedChildBounds, j)) {
                this.trackingFocusedChild = true;
                launchAnimation();
            }
            this.focusedChildBoundsFromPreviousRemeasure = focusedChildBounds;
        }
    }

    /* access modifiers changed from: private */
    public final Rect getFocusedChildBounds() {
        LayoutCoordinates layoutCoordinates;
        LayoutCoordinates layoutCoordinates2 = this.coordinates;
        if (layoutCoordinates2 != null) {
            if (!layoutCoordinates2.isAttached()) {
                layoutCoordinates2 = null;
            }
            if (!(layoutCoordinates2 == null || (layoutCoordinates = this.focusedChild) == null)) {
                if (!layoutCoordinates.isAttached()) {
                    layoutCoordinates = null;
                }
                if (layoutCoordinates != null) {
                    return layoutCoordinates2.localBoundingBoxOf(layoutCoordinates, false);
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public final void launchAnimation() {
        if (!this.isAnimationRunning) {
            Job unused = BuildersKt__Builders_commonKt.launch$default(this.scope, (CoroutineContext) null, CoroutineStart.UNDISPATCHED, new ContentInViewModifier$launchAnimation$1(this, (Continuation<? super ContentInViewModifier$launchAnimation$1>) null), 1, (Object) null);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* access modifiers changed from: private */
    public final float calculateScrollDelta() {
        if (IntSize.m5784equalsimpl0(this.viewportSize, IntSize.Companion.m5791getZeroYbymL2g())) {
            return 0.0f;
        }
        Rect findBringIntoViewRequest = findBringIntoViewRequest();
        if (findBringIntoViewRequest == null) {
            findBringIntoViewRequest = this.trackingFocusedChild ? getFocusedChildBounds() : null;
            if (findBringIntoViewRequest == null) {
                return 0.0f;
            }
        }
        long r1 = IntSizeKt.m5796toSizeozmzZPI(this.viewportSize);
        int i = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i == 1) {
            return relocationDistance(findBringIntoViewRequest.getTop(), findBringIntoViewRequest.getBottom(), Size.m2638getHeightimpl(r1));
        }
        if (i == 2) {
            return relocationDistance(findBringIntoViewRequest.getLeft(), findBringIntoViewRequest.getRight(), Size.m2641getWidthimpl(r1));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: computeDestination-O0kMr_c  reason: not valid java name */
    private final Rect m262computeDestinationO0kMr_c(Rect rect, long j) {
        return rect.m2609translatek4lQ0M(Offset.m2581unaryMinusF1C5BW0(m265relocationOffsetBMxPBkI(rect, j)));
    }

    /* renamed from: isMaxVisible-O0kMr_c$default  reason: not valid java name */
    static /* synthetic */ boolean m264isMaxVisibleO0kMr_c$default(ContentInViewModifier contentInViewModifier, Rect rect, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = contentInViewModifier.viewportSize;
        }
        return contentInViewModifier.m263isMaxVisibleO0kMr_c(rect, j);
    }

    /* renamed from: isMaxVisible-O0kMr_c  reason: not valid java name */
    private final boolean m263isMaxVisibleO0kMr_c(Rect rect, long j) {
        return Offset.m2569equalsimpl0(m265relocationOffsetBMxPBkI(rect, j), Offset.Companion.m2588getZeroF1C5BW0());
    }

    /* renamed from: relocationOffset-BMxPBkI  reason: not valid java name */
    private final long m265relocationOffsetBMxPBkI(Rect rect, long j) {
        long r5 = IntSizeKt.m5796toSizeozmzZPI(j);
        int i = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i == 1) {
            return OffsetKt.Offset(0.0f, relocationDistance(rect.getTop(), rect.getBottom(), Size.m2638getHeightimpl(r5)));
        }
        if (i == 2) {
            return OffsetKt.Offset(relocationDistance(rect.getLeft(), rect.getRight(), Size.m2641getWidthimpl(r5)), 0.0f);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final float relocationDistance(float f, float f2, float f3) {
        if ((f >= 0.0f && f2 <= f3) || (f < 0.0f && f2 > f3)) {
            return 0.0f;
        }
        float f4 = f2 - f3;
        return Math.abs(f) < Math.abs(f4) ? f : f4;
    }

    /* renamed from: compareTo-TemP2vQ  reason: not valid java name */
    private final int m260compareToTemP2vQ(long j, long j2) {
        int i = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i == 1) {
            return Intrinsics.compare(IntSize.m5785getHeightimpl(j), IntSize.m5785getHeightimpl(j2));
        }
        if (i == 2) {
            return Intrinsics.compare(IntSize.m5786getWidthimpl(j), IntSize.m5786getWidthimpl(j2));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: compareTo-iLBOSCw  reason: not valid java name */
    private final int m261compareToiLBOSCw(long j, long j2) {
        int i = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i == 1) {
            return Float.compare(Size.m2638getHeightimpl(j), Size.m2638getHeightimpl(j2));
        }
        if (i == 2) {
            return Float.compare(Size.m2641getWidthimpl(j), Size.m2641getWidthimpl(j2));
        }
        throw new NoWhenBranchMatchedException();
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/gestures/ContentInViewModifier$Request;", "", "currentBounds", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Rect;", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "", "(Lkotlin/jvm/functions/Function0;Lkotlinx/coroutines/CancellableContinuation;)V", "getContinuation", "()Lkotlinx/coroutines/CancellableContinuation;", "getCurrentBounds", "()Lkotlin/jvm/functions/Function0;", "toString", "", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: ContentInViewModifier.kt */
    public static final class Request {
        private final CancellableContinuation<Unit> continuation;
        private final Function0<Rect> currentBounds;

        public final CancellableContinuation<Unit> getContinuation() {
            return this.continuation;
        }

        public final Function0<Rect> getCurrentBounds() {
            return this.currentBounds;
        }

        public Request(Function0<Rect> function0, CancellableContinuation<? super Unit> cancellableContinuation) {
            Intrinsics.checkNotNullParameter(function0, "currentBounds");
            Intrinsics.checkNotNullParameter(cancellableContinuation, "continuation");
            this.currentBounds = function0;
            this.continuation = cancellableContinuation;
        }

        public String toString() {
            String str;
            CoroutineName coroutineName = (CoroutineName) this.continuation.getContext().get(CoroutineName.Key);
            String name = coroutineName != null ? coroutineName.getName() : null;
            StringBuilder sb = new StringBuilder("Request@");
            String num = Integer.toString(hashCode(), CharsKt.checkRadix(16));
            Intrinsics.checkNotNullExpressionValue(num, "toString(this, checkRadix(radix))");
            StringBuilder append = sb.append(num);
            if (name == null || (str = "[" + name + "](") == null) {
                str = "(";
            }
            return append.append(str).append("currentBounds()=").append(this.currentBounds.invoke()).append(", continuation=").append(this.continuation).append(')').toString();
        }
    }

    private final Rect findBringIntoViewRequest() {
        MutableVector access$getRequests$p = this.bringIntoViewRequests.requests;
        int size = access$getRequests$p.getSize();
        Rect rect = null;
        if (size > 0) {
            int i = size - 1;
            Object[] content = access$getRequests$p.getContent();
            do {
                Rect invoke = ((Request) content[i]).getCurrentBounds().invoke();
                if (invoke != null) {
                    if (m261compareToiLBOSCw(invoke.m2605getSizeNHjbRc(), IntSizeKt.m5796toSizeozmzZPI(this.viewportSize)) > 0) {
                        return rect;
                    }
                    rect = invoke;
                }
                i--;
            } while (i >= 0);
        }
        return rect;
    }
}
