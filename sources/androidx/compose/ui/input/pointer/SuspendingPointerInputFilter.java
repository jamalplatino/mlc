package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.IntSize;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;

@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001cB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0002\u0010\bJ@\u0010/\u001a\u0002H0\"\u0004\b\u0000\u001002'\u00101\u001a#\b\u0001\u0012\u0004\u0012\u000203\u0012\n\u0012\b\u0012\u0004\u0012\u0002H004\u0012\u0006\u0012\u0004\u0018\u00010502¢\u0006\u0002\b6H@ø\u0001\u0000¢\u0006\u0002\u00107J\u0018\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u00152\u0006\u0010;\u001a\u00020<H\u0002J-\u0010=\u001a\u0002092\u0006\u0010;\u001a\u00020<2\u001a\u00101\u001a\u0016\u0012\f\u0012\n\u0012\u0002\b\u00030\u001bR\u00020\u0000\u0012\u0004\u0012\u0002090>H\bJ\b\u0010?\u001a\u000209H\u0016J-\u0010@\u001a\u0002092\u0006\u0010:\u001a\u00020\u00152\u0006\u0010;\u001a\u00020<2\u0006\u0010A\u001a\u00020\nH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bB\u0010CJ\u001a\u0010D\u001a\u00020E*\u00020FH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bG\u0010HJ\u001a\u0010D\u001a\u00020E*\u00020IH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bJ\u0010KJ\u001a\u0010L\u001a\u00020F*\u00020IH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bM\u0010NJ\u001d\u0010L\u001a\u00020F*\u00020\u0016H\u0001ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bO\u0010PJ\u001d\u0010L\u001a\u00020F*\u00020EH\u0001ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bO\u0010QJ\u001a\u0010R\u001a\u00020S*\u00020\u001dH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bT\u0010UJ\u001a\u0010V\u001a\u00020\u0016*\u00020FH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bW\u0010PJ\u001a\u0010V\u001a\u00020\u0016*\u00020IH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bX\u0010NJ\r\u0010Y\u001a\u00020Z*\u00020[H\u0001J\u001a\u0010\\\u001a\u00020\u001d*\u00020SH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b]\u0010UJ\u001a\u0010^\u001a\u00020I*\u00020FH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b_\u0010`J\u001d\u0010^\u001a\u00020I*\u00020\u0016H\u0001ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\ba\u0010`J\u001d\u0010^\u001a\u00020I*\u00020EH\u0001ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\ba\u0010bR\u0019\u0010\t\u001a\u00020\nX\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u000bR \u0010\f\u001a\u00020\rX\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00168\u0016X\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u00030\u001bR\u00020\u00000\u001aX\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u001c\u001a\u00020\u001d8VX\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00168\u0016X\u0005¢\u0006\u0006\u001a\u0004\b!\u0010\u0018R\u001a\u0010\"\u001a\u00020#X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0010\u0010(\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010)\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u00030\u001bR\u00020\u00000\u001aX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\u00020\u00018VX\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006d"}, d2 = {"Landroidx/compose/ui/input/pointer/SuspendingPointerInputFilter;", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "Landroidx/compose/ui/input/pointer/PointerInputModifier;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "Landroidx/compose/ui/unit/Density;", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "density", "(Landroidx/compose/ui/platform/ViewConfiguration;Landroidx/compose/ui/unit/Density;)V", "boundsSize", "Landroidx/compose/ui/unit/IntSize;", "J", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope$annotations", "()V", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "setCoroutineScope", "(Lkotlinx/coroutines/CoroutineScope;)V", "currentEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "", "getDensity", "()F", "dispatchingPointerHandlers", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputFilter$PointerEventHandlerCoroutine;", "extendedTouchPadding", "Landroidx/compose/ui/geometry/Size;", "getExtendedTouchPadding-NH-jbRc", "()J", "fontScale", "getFontScale", "interceptOutOfBoundsChildEvents", "", "getInterceptOutOfBoundsChildEvents", "()Z", "setInterceptOutOfBoundsChildEvents", "(Z)V", "lastPointerEvent", "pointerHandlers", "pointerInputFilter", "getPointerInputFilter", "()Landroidx/compose/ui/input/pointer/PointerInputFilter;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "awaitPointerEventScope", "R", "block", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatchPointerEvent", "", "pointerEvent", "pass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "forEachCurrentPointerHandler", "Lkotlin/Function1;", "onCancel", "onPointerEvent", "bounds", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "roundToPx", "", "Landroidx/compose/ui/unit/Dp;", "roundToPx-0680j_4", "(F)I", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp", "toDp-GaN1DYA", "(J)F", "toDp-u2uoSUM", "(F)F", "(I)F", "toDpSize", "Landroidx/compose/ui/unit/DpSize;", "toDpSize-k-rfVVM", "(J)J", "toPx", "toPx-0680j_4", "toPx--R2X_6o", "toRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/DpRect;", "toSize", "toSize-XkaWNTQ", "toSp", "toSp-0xMU5do", "(F)J", "toSp-kPz2Gy4", "(I)J", "PointerEventHandlerCoroutine", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: SuspendingPointerInputFilter.kt */
public final class SuspendingPointerInputFilter extends PointerInputFilter implements PointerInputModifier, PointerInputScope, Density {
    private final /* synthetic */ Density $$delegate_0;
    /* access modifiers changed from: private */
    public long boundsSize;
    private CoroutineScope coroutineScope;
    /* access modifiers changed from: private */
    public PointerEvent currentEvent;
    private final MutableVector<PointerEventHandlerCoroutine<?>> dispatchingPointerHandlers;
    private boolean interceptOutOfBoundsChildEvents;
    private PointerEvent lastPointerEvent;
    /* access modifiers changed from: private */
    public final MutableVector<PointerEventHandlerCoroutine<?>> pointerHandlers;
    private final ViewConfiguration viewConfiguration;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* compiled from: SuspendingPointerInputFilter.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.compose.ui.input.pointer.PointerEventPass[] r0 = androidx.compose.ui.input.pointer.PointerEventPass.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.ui.input.pointer.PointerEventPass.Initial     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.ui.input.pointer.PointerEventPass.Final     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.ui.input.pointer.PointerEventPass.Main     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputFilter.WhenMappings.<clinit>():void");
        }
    }

    public static /* synthetic */ void getCoroutineScope$annotations() {
    }

    public final CoroutineScope getCoroutineScope() {
        return this.coroutineScope;
    }

    public float getDensity() {
        return this.$$delegate_0.getDensity();
    }

    public float getFontScale() {
        return this.$$delegate_0.getFontScale();
    }

    public boolean getInterceptOutOfBoundsChildEvents() {
        return this.interceptOutOfBoundsChildEvents;
    }

    public ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }

    /* renamed from: roundToPx--R2X_6o  reason: not valid java name */
    public int m4418roundToPxR2X_6o(long j) {
        return this.$$delegate_0.m5600roundToPxR2X_6o(j);
    }

    /* renamed from: roundToPx-0680j_4  reason: not valid java name */
    public int m4419roundToPx0680j_4(float f) {
        return this.$$delegate_0.m5601roundToPx0680j_4(f);
    }

    public final void setCoroutineScope(CoroutineScope coroutineScope2) {
        Intrinsics.checkNotNullParameter(coroutineScope2, "<set-?>");
        this.coroutineScope = coroutineScope2;
    }

    public void setInterceptOutOfBoundsChildEvents(boolean z) {
        this.interceptOutOfBoundsChildEvents = z;
    }

    /* renamed from: toDp-GaN1DYA  reason: not valid java name */
    public float m4420toDpGaN1DYA(long j) {
        return this.$$delegate_0.m5602toDpGaN1DYA(j);
    }

    /* renamed from: toDp-u2uoSUM  reason: not valid java name */
    public float m4421toDpu2uoSUM(float f) {
        return this.$$delegate_0.m5603toDpu2uoSUM(f);
    }

    /* renamed from: toDp-u2uoSUM  reason: not valid java name */
    public float m4422toDpu2uoSUM(int i) {
        return this.$$delegate_0.m5604toDpu2uoSUM(i);
    }

    /* renamed from: toDpSize-k-rfVVM  reason: not valid java name */
    public long m4423toDpSizekrfVVM(long j) {
        return this.$$delegate_0.m5605toDpSizekrfVVM(j);
    }

    /* renamed from: toPx--R2X_6o  reason: not valid java name */
    public float m4424toPxR2X_6o(long j) {
        return this.$$delegate_0.m5606toPxR2X_6o(j);
    }

    /* renamed from: toPx-0680j_4  reason: not valid java name */
    public float m4425toPx0680j_4(float f) {
        return this.$$delegate_0.m5607toPx0680j_4(f);
    }

    public Rect toRect(DpRect dpRect) {
        Intrinsics.checkNotNullParameter(dpRect, "<this>");
        return this.$$delegate_0.toRect(dpRect);
    }

    /* renamed from: toSize-XkaWNTQ  reason: not valid java name */
    public long m4426toSizeXkaWNTQ(long j) {
        return this.$$delegate_0.m5608toSizeXkaWNTQ(j);
    }

    /* renamed from: toSp-0xMU5do  reason: not valid java name */
    public long m4427toSp0xMU5do(float f) {
        return this.$$delegate_0.m5609toSp0xMU5do(f);
    }

    /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
    public long m4428toSpkPz2Gy4(float f) {
        return this.$$delegate_0.m5610toSpkPz2Gy4(f);
    }

    /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
    public long m4429toSpkPz2Gy4(int i) {
        return this.$$delegate_0.m5611toSpkPz2Gy4(i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SuspendingPointerInputFilter(ViewConfiguration viewConfiguration2, Density density, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewConfiguration2, (i & 2) != 0 ? DensityKt.Density$default(1.0f, 0.0f, 2, (Object) null) : density);
    }

    public SuspendingPointerInputFilter(ViewConfiguration viewConfiguration2, Density density) {
        Intrinsics.checkNotNullParameter(viewConfiguration2, "viewConfiguration");
        Intrinsics.checkNotNullParameter(density, "density");
        this.viewConfiguration = viewConfiguration2;
        this.$$delegate_0 = density;
        this.currentEvent = SuspendingPointerInputFilterKt.EmptyPointerEvent;
        this.pointerHandlers = new MutableVector<>(new PointerEventHandlerCoroutine[16], 0);
        this.dispatchingPointerHandlers = new MutableVector<>(new PointerEventHandlerCoroutine[16], 0);
        this.boundsSize = IntSize.Companion.m5791getZeroYbymL2g();
        this.coroutineScope = GlobalScope.INSTANCE;
    }

    public PointerInputFilter getPointerInputFilter() {
        return this;
    }

    /* renamed from: getExtendedTouchPadding-NH-jbRc  reason: not valid java name */
    public long m4416getExtendedTouchPaddingNHjbRc() {
        long r0 = m4426toSizeXkaWNTQ(getViewConfiguration().m4939getMinimumTouchTargetSizeMYxV2XQ());
        long r2 = m4344getSizeYbymL2g();
        return SizeKt.Size(Math.max(0.0f, Size.m2641getWidthimpl(r0) - ((float) IntSize.m5786getWidthimpl(r2))) / 2.0f, Math.max(0.0f, Size.m2638getHeightimpl(r0) - ((float) IntSize.m5785getHeightimpl(r2))) / 2.0f);
    }

    /* renamed from: onPointerEvent-H0pRuoY  reason: not valid java name */
    public void m4417onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        Intrinsics.checkNotNullParameter(pointerEvent, "pointerEvent");
        Intrinsics.checkNotNullParameter(pointerEventPass, "pass");
        this.boundsSize = j;
        if (pointerEventPass == PointerEventPass.Initial) {
            this.currentEvent = pointerEvent;
        }
        dispatchPointerEvent(pointerEvent, pointerEventPass);
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            } else if (!PointerEventKt.changedToUpIgnoreConsumed(changes.get(i))) {
                break;
            } else {
                i++;
            }
        }
        if (!(!z)) {
            pointerEvent = null;
        }
        this.lastPointerEvent = pointerEvent;
    }

    public void onCancel() {
        PointerEvent pointerEvent = this.lastPointerEvent;
        if (pointerEvent != null) {
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            for (int i = 0; i < size; i++) {
                if (!(!changes.get(i).getPressed())) {
                    List<PointerInputChange> changes2 = pointerEvent.getChanges();
                    ArrayList arrayList = new ArrayList(changes2.size());
                    int size2 = changes2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        PointerInputChange pointerInputChange = changes2.get(i2);
                        Collection collection = arrayList;
                        collection.add(new PointerInputChange(pointerInputChange.m4323getIdJ3iCeTQ(), pointerInputChange.getUptimeMillis(), pointerInputChange.m4324getPositionF1C5BW0(), false, pointerInputChange.getPressure(), pointerInputChange.getUptimeMillis(), pointerInputChange.m4324getPositionF1C5BW0(), pointerInputChange.getPressed(), pointerInputChange.getPressed(), 0, 0, 1536, (DefaultConstructorMarker) null));
                    }
                    PointerEvent pointerEvent2 = new PointerEvent(arrayList);
                    this.currentEvent = pointerEvent2;
                    dispatchPointerEvent(pointerEvent2, PointerEventPass.Initial);
                    dispatchPointerEvent(pointerEvent2, PointerEventPass.Main);
                    dispatchPointerEvent(pointerEvent2, PointerEventPass.Final);
                    this.lastPointerEvent = null;
                    return;
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u0013\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0006J\u0019\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\bH@ø\u0001\u0000¢\u0006\u0002\u0010&J\u0010\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*J\u0016\u0010+\u001a\u00020(2\u0006\u0010,\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\bJ\u001e\u0010-\u001a\u00020(2\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000/H\u0016ø\u0001\u0000¢\u0006\u0002\u00100JH\u00101\u001a\u0002H2\"\u0004\b\u0001\u001022\u0006\u00103\u001a\u0002042'\u00105\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H20\u0004\u0012\u0006\u0012\u0004\u0018\u00010706¢\u0006\u0002\b8H@ø\u0001\u0000¢\u0006\u0002\u00109JJ\u0010:\u001a\u0004\u0018\u0001H2\"\u0004\b\u0001\u001022\u0006\u00103\u001a\u0002042'\u00105\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H20\u0004\u0012\u0006\u0012\u0004\u0018\u00010706¢\u0006\u0002\b8H@ø\u0001\u0000¢\u0006\u0002\u00109J\u001a\u0010;\u001a\u00020<*\u00020=H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b>\u0010?J\u001a\u0010;\u001a\u00020<*\u00020@H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bA\u0010BJ\u001a\u0010C\u001a\u00020=*\u00020@H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bD\u0010EJ\u001d\u0010C\u001a\u00020=*\u00020\u0012H\u0001ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bF\u0010GJ\u001d\u0010C\u001a\u00020=*\u00020<H\u0001ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bF\u0010HJ\u001a\u0010I\u001a\u00020J*\u00020\u0016H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bK\u0010LJ\u001a\u0010M\u001a\u00020\u0012*\u00020=H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bN\u0010GJ\u001a\u0010M\u001a\u00020\u0012*\u00020@H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bO\u0010EJ\r\u0010P\u001a\u00020Q*\u00020RH\u0001J\u001a\u0010S\u001a\u00020\u0016*\u00020JH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bT\u0010LJ\u001a\u0010U\u001a\u00020@*\u00020=H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bV\u0010WJ\u001d\u0010U\u001a\u00020@*\u00020\u0012H\u0001ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bX\u0010WJ\u001d\u0010U\u001a\u00020@*\u00020<H\u0001ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bX\u0010YR\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128\u0016X\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0015\u001a\u00020\u00168VX\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00128\u0016X\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0014R\u0016\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u001d\u001a\u00020\u001e8VX\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0018R\u0014\u0010 \u001a\u00020!8VX\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Z"}, d2 = {"Landroidx/compose/ui/input/pointer/SuspendingPointerInputFilter$PointerEventHandlerCoroutine;", "R", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/coroutines/Continuation;", "completion", "(Landroidx/compose/ui/input/pointer/SuspendingPointerInputFilter;Lkotlin/coroutines/Continuation;)V", "awaitPass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "currentEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "getCurrentEvent", "()Landroidx/compose/ui/input/pointer/PointerEvent;", "density", "", "getDensity", "()F", "extendedTouchPadding", "Landroidx/compose/ui/geometry/Size;", "getExtendedTouchPadding-NH-jbRc", "()J", "fontScale", "getFontScale", "pointerAwaiter", "Lkotlinx/coroutines/CancellableContinuation;", "size", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "awaitPointerEvent", "pass", "(Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancel", "", "cause", "", "offerPointerEvent", "event", "resumeWith", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "withTimeout", "T", "timeMillis", "", "block", "Lkotlin/Function2;", "", "Lkotlin/ExtensionFunctionType;", "(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withTimeoutOrNull", "roundToPx", "", "Landroidx/compose/ui/unit/Dp;", "roundToPx-0680j_4", "(F)I", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp", "toDp-GaN1DYA", "(J)F", "toDp-u2uoSUM", "(F)F", "(I)F", "toDpSize", "Landroidx/compose/ui/unit/DpSize;", "toDpSize-k-rfVVM", "(J)J", "toPx", "toPx-0680j_4", "toPx--R2X_6o", "toRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/DpRect;", "toSize", "toSize-XkaWNTQ", "toSp", "toSp-0xMU5do", "(F)J", "toSp-kPz2Gy4", "(I)J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: SuspendingPointerInputFilter.kt */
    private final class PointerEventHandlerCoroutine<R> implements AwaitPointerEventScope, Density, Continuation<R> {
        private final /* synthetic */ SuspendingPointerInputFilter $$delegate_0;
        /* access modifiers changed from: private */
        public PointerEventPass awaitPass = PointerEventPass.Main;
        private final Continuation<R> completion;
        private final CoroutineContext context = EmptyCoroutineContext.INSTANCE;
        /* access modifiers changed from: private */
        public CancellableContinuation<? super PointerEvent> pointerAwaiter;
        final /* synthetic */ SuspendingPointerInputFilter this$0;

        public CoroutineContext getContext() {
            return this.context;
        }

        public float getDensity() {
            return this.$$delegate_0.getDensity();
        }

        public float getFontScale() {
            return this.$$delegate_0.getFontScale();
        }

        /* renamed from: roundToPx--R2X_6o  reason: not valid java name */
        public int m4432roundToPxR2X_6o(long j) {
            return this.$$delegate_0.m4418roundToPxR2X_6o(j);
        }

        /* renamed from: roundToPx-0680j_4  reason: not valid java name */
        public int m4433roundToPx0680j_4(float f) {
            return this.$$delegate_0.m4419roundToPx0680j_4(f);
        }

        /* renamed from: toDp-GaN1DYA  reason: not valid java name */
        public float m4434toDpGaN1DYA(long j) {
            return this.$$delegate_0.m4420toDpGaN1DYA(j);
        }

        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public float m4435toDpu2uoSUM(float f) {
            return this.$$delegate_0.m4421toDpu2uoSUM(f);
        }

        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public float m4436toDpu2uoSUM(int i) {
            return this.$$delegate_0.m4422toDpu2uoSUM(i);
        }

        /* renamed from: toDpSize-k-rfVVM  reason: not valid java name */
        public long m4437toDpSizekrfVVM(long j) {
            return this.$$delegate_0.m4423toDpSizekrfVVM(j);
        }

        /* renamed from: toPx--R2X_6o  reason: not valid java name */
        public float m4438toPxR2X_6o(long j) {
            return this.$$delegate_0.m4424toPxR2X_6o(j);
        }

        /* renamed from: toPx-0680j_4  reason: not valid java name */
        public float m4439toPx0680j_4(float f) {
            return this.$$delegate_0.m4425toPx0680j_4(f);
        }

        public Rect toRect(DpRect dpRect) {
            Intrinsics.checkNotNullParameter(dpRect, "<this>");
            return this.$$delegate_0.toRect(dpRect);
        }

        /* renamed from: toSize-XkaWNTQ  reason: not valid java name */
        public long m4440toSizeXkaWNTQ(long j) {
            return this.$$delegate_0.m4426toSizeXkaWNTQ(j);
        }

        /* renamed from: toSp-0xMU5do  reason: not valid java name */
        public long m4441toSp0xMU5do(float f) {
            return this.$$delegate_0.m4427toSp0xMU5do(f);
        }

        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public long m4442toSpkPz2Gy4(float f) {
            return this.$$delegate_0.m4428toSpkPz2Gy4(f);
        }

        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public long m4443toSpkPz2Gy4(int i) {
            return this.$$delegate_0.m4429toSpkPz2Gy4(i);
        }

        public PointerEventHandlerCoroutine(SuspendingPointerInputFilter suspendingPointerInputFilter, Continuation<? super R> continuation) {
            Intrinsics.checkNotNullParameter(continuation, "completion");
            this.this$0 = suspendingPointerInputFilter;
            this.completion = continuation;
            this.$$delegate_0 = suspendingPointerInputFilter;
        }

        public PointerEvent getCurrentEvent() {
            return this.this$0.currentEvent;
        }

        /* renamed from: getSize-YbymL2g  reason: not valid java name */
        public long m4431getSizeYbymL2g() {
            return this.this$0.boundsSize;
        }

        public ViewConfiguration getViewConfiguration() {
            return this.this$0.getViewConfiguration();
        }

        /* renamed from: getExtendedTouchPadding-NH-jbRc  reason: not valid java name */
        public long m4430getExtendedTouchPaddingNHjbRc() {
            return this.this$0.m4416getExtendedTouchPaddingNHjbRc();
        }

        public final void offerPointerEvent(PointerEvent pointerEvent, PointerEventPass pointerEventPass) {
            CancellableContinuation<? super PointerEvent> cancellableContinuation;
            Intrinsics.checkNotNullParameter(pointerEvent, NotificationCompat.CATEGORY_EVENT);
            Intrinsics.checkNotNullParameter(pointerEventPass, "pass");
            if (pointerEventPass == this.awaitPass && (cancellableContinuation = this.pointerAwaiter) != null) {
                this.pointerAwaiter = null;
                Result.Companion companion = Result.Companion;
                cancellableContinuation.resumeWith(Result.m6005constructorimpl(pointerEvent));
            }
        }

        public final void cancel(Throwable th) {
            CancellableContinuation<? super PointerEvent> cancellableContinuation = this.pointerAwaiter;
            if (cancellableContinuation != null) {
                cancellableContinuation.cancel(th);
            }
            this.pointerAwaiter = null;
        }

        public void resumeWith(Object obj) {
            MutableVector access$getPointerHandlers$p = this.this$0.pointerHandlers;
            SuspendingPointerInputFilter suspendingPointerInputFilter = this.this$0;
            synchronized (access$getPointerHandlers$p) {
                suspendingPointerInputFilter.pointerHandlers.remove(this);
                Unit unit = Unit.INSTANCE;
            }
            this.completion.resumeWith(obj);
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0033  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public <T> java.lang.Object withTimeoutOrNull(long r5, kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.AwaitPointerEventScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r7, kotlin.coroutines.Continuation<? super T> r8) {
            /*
                r4 = this;
                boolean r0 = r8 instanceof androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1
                if (r0 == 0) goto L_0x0014
                r0 = r8
                androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1 r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r1 & r2
                if (r1 == 0) goto L_0x0014
                int r8 = r0.label
                int r8 = r8 - r2
                r0.label = r8
                goto L_0x0019
            L_0x0014:
                androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1 r0 = new androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1
                r0.<init>(r4, r8)
            L_0x0019:
                java.lang.Object r8 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L_0x0033
                if (r2 != r3) goto L_0x002a
                kotlin.ResultKt.throwOnFailure(r8)     // Catch:{ PointerEventTimeoutCancellationException -> 0x003f }
                goto L_0x0040
            L_0x002a:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L_0x0033:
                kotlin.ResultKt.throwOnFailure(r8)
                r0.label = r3     // Catch:{ PointerEventTimeoutCancellationException -> 0x003f }
                java.lang.Object r8 = r4.withTimeout(r5, r7, r0)     // Catch:{ PointerEventTimeoutCancellationException -> 0x003f }
                if (r8 != r1) goto L_0x0040
                return r1
            L_0x003f:
                r8 = 0
            L_0x0040:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputFilter.PointerEventHandlerCoroutine.withTimeoutOrNull(long, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x003a  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public <T> java.lang.Object withTimeout(long r12, kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.AwaitPointerEventScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r14, kotlin.coroutines.Continuation<? super T> r15) {
            /*
                r11 = this;
                boolean r0 = r15 instanceof androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1
                if (r0 == 0) goto L_0x0014
                r0 = r15
                androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1 r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r1 & r2
                if (r1 == 0) goto L_0x0014
                int r15 = r0.label
                int r15 = r15 - r2
                r0.label = r15
                goto L_0x0019
            L_0x0014:
                androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1 r0 = new androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1
                r0.<init>(r11, r15)
            L_0x0019:
                java.lang.Object r15 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L_0x003a
                if (r2 != r3) goto L_0x0031
                java.lang.Object r12 = r0.L$0
                kotlinx.coroutines.Job r12 = (kotlinx.coroutines.Job) r12
                kotlin.ResultKt.throwOnFailure(r15)     // Catch:{ all -> 0x002f }
                goto L_0x007e
            L_0x002f:
                r13 = move-exception
                goto L_0x0082
            L_0x0031:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L_0x003a:
                kotlin.ResultKt.throwOnFailure(r15)
                r5 = 0
                int r15 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
                if (r15 > 0) goto L_0x005d
                kotlinx.coroutines.CancellableContinuation<? super androidx.compose.ui.input.pointer.PointerEvent> r15 = r11.pointerAwaiter
                if (r15 == 0) goto L_0x005d
                kotlin.coroutines.Continuation r15 = (kotlin.coroutines.Continuation) r15
                kotlin.Result$Companion r2 = kotlin.Result.Companion
                androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r2 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
                r2.<init>(r12)
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                java.lang.Object r2 = kotlin.ResultKt.createFailure(r2)
                java.lang.Object r2 = kotlin.Result.m6005constructorimpl(r2)
                r15.resumeWith(r2)
            L_0x005d:
                androidx.compose.ui.input.pointer.SuspendingPointerInputFilter r15 = r11.this$0
                kotlinx.coroutines.CoroutineScope r5 = r15.getCoroutineScope()
                r6 = 0
                r7 = 0
                androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1 r15 = new androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1
                r15.<init>(r12, r11, r4)
                r8 = r15
                kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
                r9 = 3
                r10 = 0
                kotlinx.coroutines.Job r12 = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(r5, r6, r7, r8, r9, r10)
                r0.L$0 = r12     // Catch:{ all -> 0x002f }
                r0.label = r3     // Catch:{ all -> 0x002f }
                java.lang.Object r15 = r14.invoke(r11, r0)     // Catch:{ all -> 0x002f }
                if (r15 != r1) goto L_0x007e
                return r1
            L_0x007e:
                kotlinx.coroutines.Job.DefaultImpls.cancel$default((kotlinx.coroutines.Job) r12, (java.util.concurrent.CancellationException) r4, (int) r3, (java.lang.Object) r4)
                return r15
            L_0x0082:
                kotlinx.coroutines.Job.DefaultImpls.cancel$default((kotlinx.coroutines.Job) r12, (java.util.concurrent.CancellationException) r4, (int) r3, (java.lang.Object) r4)
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputFilter.PointerEventHandlerCoroutine.withTimeout(long, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
        }

        public Object awaitPointerEvent(PointerEventPass pointerEventPass, Continuation<? super PointerEvent> continuation) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            this.awaitPass = pointerEventPass;
            this.pointerAwaiter = cancellableContinuationImpl;
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result;
        }
    }

    /* JADX INFO: finally extract failed */
    private final void forEachCurrentPointerHandler(PointerEventPass pointerEventPass, Function1<? super PointerEventHandlerCoroutine<?>, Unit> function1) {
        synchronized (this.pointerHandlers) {
            try {
                MutableVector<PointerEventHandlerCoroutine<?>> mutableVector = this.dispatchingPointerHandlers;
                mutableVector.addAll(mutableVector.getSize(), this.pointerHandlers);
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
        try {
            int i = WhenMappings.$EnumSwitchMapping$0[pointerEventPass.ordinal()];
            if (i == 1 || i == 2) {
                MutableVector<PointerEventHandlerCoroutine<?>> mutableVector2 = this.dispatchingPointerHandlers;
                int size = mutableVector2.getSize();
                if (size > 0) {
                    Object[] content = mutableVector2.getContent();
                    int i2 = 0;
                    do {
                        function1.invoke(content[i2]);
                        i2++;
                    } while (i2 < size);
                }
            } else if (i == 3) {
                MutableVector<PointerEventHandlerCoroutine<?>> mutableVector3 = this.dispatchingPointerHandlers;
                int size2 = mutableVector3.getSize();
                if (size2 > 0) {
                    int i3 = size2 - 1;
                    Object[] content2 = mutableVector3.getContent();
                    do {
                        function1.invoke(content2[i3]);
                        i3--;
                    } while (i3 >= 0);
                }
            }
        } finally {
            InlineMarker.finallyStart(1);
            this.dispatchingPointerHandlers.clear();
            InlineMarker.finallyEnd(1);
        }
    }

    private final void dispatchPointerEvent(PointerEvent pointerEvent, PointerEventPass pointerEventPass) {
        synchronized (this.pointerHandlers) {
            MutableVector<PointerEventHandlerCoroutine<?>> mutableVector = this.dispatchingPointerHandlers;
            mutableVector.addAll(mutableVector.getSize(), this.pointerHandlers);
        }
        try {
            int i = WhenMappings.$EnumSwitchMapping$0[pointerEventPass.ordinal()];
            if (i == 1 || i == 2) {
                MutableVector<PointerEventHandlerCoroutine<?>> mutableVector2 = this.dispatchingPointerHandlers;
                int size = mutableVector2.getSize();
                if (size > 0) {
                    Object[] content = mutableVector2.getContent();
                    int i2 = 0;
                    do {
                        ((PointerEventHandlerCoroutine) content[i2]).offerPointerEvent(pointerEvent, pointerEventPass);
                        i2++;
                    } while (i2 < size);
                }
            } else if (i == 3) {
                MutableVector<PointerEventHandlerCoroutine<?>> mutableVector3 = this.dispatchingPointerHandlers;
                int size2 = mutableVector3.getSize();
                if (size2 > 0) {
                    int i3 = size2 - 1;
                    Object[] content2 = mutableVector3.getContent();
                    do {
                        ((PointerEventHandlerCoroutine) content2[i3]).offerPointerEvent(pointerEvent, pointerEventPass);
                        i3--;
                    } while (i3 >= 0);
                }
            }
        } finally {
            this.dispatchingPointerHandlers.clear();
        }
    }

    public <R> Object awaitPointerEventScope(Function2<? super AwaitPointerEventScope, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        CancellableContinuation cancellableContinuation = cancellableContinuationImpl;
        PointerEventHandlerCoroutine pointerEventHandlerCoroutine = new PointerEventHandlerCoroutine(this, cancellableContinuation);
        synchronized (this.pointerHandlers) {
            this.pointerHandlers.add(pointerEventHandlerCoroutine);
            Continuation<Unit> createCoroutine = ContinuationKt.createCoroutine(function2, pointerEventHandlerCoroutine, pointerEventHandlerCoroutine);
            Result.Companion companion = Result.Companion;
            createCoroutine.resumeWith(Result.m6005constructorimpl(Unit.INSTANCE));
            Unit unit = Unit.INSTANCE;
        }
        cancellableContinuation.invokeOnCancellation(new SuspendingPointerInputFilter$awaitPointerEventScope$2$2(pointerEventHandlerCoroutine));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
