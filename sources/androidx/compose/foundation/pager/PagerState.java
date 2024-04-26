package androidx.compose.foundation.pager;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 y2\u00020\u0001:\u0001yB\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J3\u0010\\\u001a\u00020]2\u0006\u0010^\u001a\u00020\u00032\b\b\u0002\u0010_\u001a\u00020\u00052\u000e\b\u0002\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00050aH@ø\u0001\u0000¢\u0006\u0002\u0010bJ\u0011\u0010c\u001a\u00020]H@ø\u0001\u0000¢\u0006\u0002\u0010dJ\u0010\u0010e\u001a\u00020\u00052\u0006\u0010f\u001a\u00020\u0005H\u0016J\u0015\u0010g\u001a\u00020]2\u0006\u0010h\u001a\u000206H\u0000¢\u0006\u0002\biJB\u0010j\u001a\u00020]2\u0006\u0010k\u001a\u00020l2'\u0010m\u001a#\b\u0001\u0012\u0004\u0012\u00020o\u0012\n\u0012\b\u0012\u0004\u0012\u00020]0p\u0012\u0006\u0012\u0004\u0018\u00010q0n¢\u0006\u0002\brH@ø\u0001\u0000¢\u0006\u0002\u0010sJ#\u0010t\u001a\u00020]2\u0006\u0010^\u001a\u00020\u00032\b\b\u0002\u0010_\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0002\u0010uJ\r\u0010v\u001a\u00020]H\u0000¢\u0006\u0002\bwJ\f\u0010x\u001a\u00020\u0003*\u00020\u0003H\u0002R+\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00038B@BX\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00188BX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001b\u001a\u00020\u00038FX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\nR\u001b\u0010\u001f\u001a\u00020\u00058FX\u0002¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b \u0010!R\u0014\u0010#\u001a\u00020$8BX\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00058BX\u0004¢\u0006\u0006\u001a\u0004\b(\u0010!R\u0016\u0010)\u001a\u0004\u0018\u00010\u00188@X\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010!R\u0011\u0010-\u001a\u00020.8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00101\u001a\u00020\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u0014R\u0014\u00102\u001a\u0002038@X\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R/\u00107\u001a\u0004\u0018\u0001062\b\u0010\u0007\u001a\u0004\u0018\u0001068B@BX\u0002¢\u0006\u0012\n\u0004\b<\u0010\u000e\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020\u00038BX\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\nR\u0014\u0010?\u001a\u00020\u00038@X\u0004¢\u0006\u0006\u001a\u0004\b@\u0010\nR\u0014\u0010A\u001a\u00020\u00038@X\u0004¢\u0006\u0006\u001a\u0004\bB\u0010\nR+\u0010C\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00038@@@X\u0002¢\u0006\u0012\n\u0004\bF\u0010\u000e\u001a\u0004\bD\u0010\n\"\u0004\bE\u0010\fR\u0014\u0010G\u001a\u00020\u00058BX\u0004¢\u0006\u0006\u001a\u0004\bH\u0010!R\u001b\u0010I\u001a\u00020\u00038FX\u0002¢\u0006\f\n\u0004\bK\u0010\u001e\u001a\u0004\bJ\u0010\nR+\u0010L\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00038B@BX\u0002¢\u0006\u0012\n\u0004\bO\u0010\u000e\u001a\u0004\bM\u0010\n\"\u0004\bN\u0010\fR+\u0010P\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00058@@@X\u0002¢\u0006\u0012\n\u0004\bT\u0010\u000e\u001a\u0004\bQ\u0010!\"\u0004\bR\u0010SR\u001b\u0010U\u001a\u00020\u00038FX\u0002¢\u0006\f\n\u0004\bW\u0010\u001e\u001a\u0004\bV\u0010\nR\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00180Y8BX\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[\u0002\u0004\n\u0002\b\u0019¨\u0006z"}, d2 = {"Landroidx/compose/foundation/pager/PagerState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "initialPage", "", "initialPageOffsetFraction", "", "(IF)V", "<set-?>", "animationTargetPage", "getAnimationTargetPage", "()I", "setAnimationTargetPage", "(I)V", "animationTargetPage$delegate", "Landroidx/compose/runtime/MutableState;", "awaitLazyListStateSet", "Landroidx/compose/foundation/pager/AwaitLazyListStateSet;", "canScrollBackward", "", "getCanScrollBackward", "()Z", "canScrollForward", "getCanScrollForward", "closestPageToSnappedPosition", "Landroidx/compose/foundation/lazy/LazyListItemInfo;", "getClosestPageToSnappedPosition", "()Landroidx/compose/foundation/lazy/LazyListItemInfo;", "currentPage", "getCurrentPage", "currentPage$delegate", "Landroidx/compose/runtime/State;", "currentPageOffsetFraction", "getCurrentPageOffsetFraction", "()F", "currentPageOffsetFraction$delegate", "density", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "distanceToSnapPosition", "getDistanceToSnapPosition", "firstVisiblePage", "getFirstVisiblePage$foundation_release", "getInitialPage", "getInitialPageOffsetFraction", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/InteractionSource;", "isScrollInProgress", "layoutInfo", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "getLayoutInfo$foundation_release", "()Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "Landroidx/compose/foundation/lazy/LazyListState;", "lazyListState", "getLazyListState", "()Landroidx/compose/foundation/lazy/LazyListState;", "setLazyListState", "(Landroidx/compose/foundation/lazy/LazyListState;)V", "lazyListState$delegate", "pageAvailableSpace", "getPageAvailableSpace", "pageCount", "getPageCount$foundation_release", "pageSize", "getPageSize$foundation_release", "pageSpacing", "getPageSpacing$foundation_release", "setPageSpacing$foundation_release", "pageSpacing$delegate", "positionThresholdFraction", "getPositionThresholdFraction", "settledPage", "getSettledPage", "settledPage$delegate", "settledPageState", "getSettledPageState", "setSettledPageState", "settledPageState$delegate", "snapRemainingScrollOffset", "getSnapRemainingScrollOffset$foundation_release", "setSnapRemainingScrollOffset$foundation_release", "(F)V", "snapRemainingScrollOffset$delegate", "targetPage", "getTargetPage", "targetPage$delegate", "visiblePages", "", "getVisiblePages", "()Ljava/util/List;", "animateScrollToPage", "", "page", "pageOffsetFraction", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "(IFLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitScrollDependencies", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatchRawDelta", "delta", "loadNewState", "newState", "loadNewState$foundation_release", "scroll", "scrollPriority", "Landroidx/compose/foundation/MutatePriority;", "block", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scrollToPage", "(IFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateOnScrollStopped", "updateOnScrollStopped$foundation_release", "coerceInPageRange", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: PagerState.kt */
public final class PagerState implements ScrollableState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final Saver<PagerState, ?> Saver = ListSaverKt.listSaver(PagerState$Companion$Saver$1.INSTANCE, PagerState$Companion$Saver$2.INSTANCE);
    private final MutableState animationTargetPage$delegate;
    private final AwaitLazyListStateSet awaitLazyListStateSet;
    private final State currentPage$delegate;
    private final State currentPageOffsetFraction$delegate;
    private final int initialPage;
    private final float initialPageOffsetFraction;
    private final MutableState lazyListState$delegate;
    private final MutableState pageSpacing$delegate;
    private final State settledPage$delegate;
    private final MutableState settledPageState$delegate;
    private final MutableState snapRemainingScrollOffset$delegate;
    private final State targetPage$delegate;

    public PagerState() {
        this(0, 0.0f, 3, (DefaultConstructorMarker) null);
    }

    public final int getInitialPage() {
        return this.initialPage;
    }

    public final float getInitialPageOffsetFraction() {
        return this.initialPageOffsetFraction;
    }

    public PagerState(int i, float f) {
        this.initialPage = i;
        this.initialPageOffsetFraction = f;
        double d = (double) f;
        if (-0.5d > d || d > 0.5d) {
            throw new IllegalArgumentException(("initialPageOffsetFraction " + f + " is not within the range -0.5 to 0.5").toString());
        }
        this.snapRemainingScrollOffset$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), (SnapshotMutationPolicy) null, 2, (Object) null);
        this.lazyListState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.pageSpacing$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.awaitLazyListStateSet = new AwaitLazyListStateSet();
        this.currentPage$delegate = SnapshotStateKt.derivedStateOf(new PagerState$currentPage$2(this));
        this.animationTargetPage$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(-1, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.settledPageState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(i), (SnapshotMutationPolicy) null, 2, (Object) null);
        this.settledPage$delegate = SnapshotStateKt.derivedStateOf(new PagerState$settledPage$2(this));
        this.targetPage$delegate = SnapshotStateKt.derivedStateOf(new PagerState$targetPage$2(this));
        this.currentPageOffsetFraction$delegate = SnapshotStateKt.derivedStateOf(new PagerState$currentPageOffsetFraction$2(this));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PagerState(int i, float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0.0f : f);
    }

    public final float getSnapRemainingScrollOffset$foundation_release() {
        return ((Number) this.snapRemainingScrollOffset$delegate.getValue()).floatValue();
    }

    public final void setSnapRemainingScrollOffset$foundation_release(float f) {
        this.snapRemainingScrollOffset$delegate.setValue(Float.valueOf(f));
    }

    private final LazyListState getLazyListState() {
        return (LazyListState) this.lazyListState$delegate.getValue();
    }

    public final int getPageSpacing$foundation_release() {
        return ((Number) this.pageSpacing$delegate.getValue()).intValue();
    }

    public final void setPageSpacing$foundation_release(int i) {
        this.pageSpacing$delegate.setValue(Integer.valueOf(i));
    }

    public final int getPageSize$foundation_release() {
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) CollectionsKt.firstOrNull(getVisiblePages());
        if (lazyListItemInfo != null) {
            return lazyListItemInfo.getSize();
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.getDensity$foundation_release();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final androidx.compose.ui.unit.Density getDensity() {
        /*
            r1 = this;
            androidx.compose.foundation.lazy.LazyListState r0 = r1.getLazyListState()
            if (r0 == 0) goto L_0x000c
            androidx.compose.ui.unit.Density r0 = r0.getDensity$foundation_release()
            if (r0 != 0) goto L_0x0012
        L_0x000c:
            androidx.compose.foundation.pager.PagerStateKt$UnitDensity$1 r0 = androidx.compose.foundation.pager.PagerStateKt.UnitDensity
            androidx.compose.ui.unit.Density r0 = (androidx.compose.ui.unit.Density) r0
        L_0x0012:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerState.getDensity():androidx.compose.ui.unit.Density");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.getLayoutInfo();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.foundation.lazy.LazyListLayoutInfo getLayoutInfo$foundation_release() {
        /*
            r1 = this;
            androidx.compose.foundation.lazy.LazyListState r0 = r1.getLazyListState()
            if (r0 == 0) goto L_0x000c
            androidx.compose.foundation.lazy.LazyListLayoutInfo r0 = r0.getLayoutInfo()
            if (r0 != 0) goto L_0x0012
        L_0x000c:
            androidx.compose.foundation.pager.PagerStateKt$EmptyLayoutInfo$1 r0 = androidx.compose.foundation.pager.PagerStateKt.EmptyLayoutInfo
            androidx.compose.foundation.lazy.LazyListLayoutInfo r0 = (androidx.compose.foundation.lazy.LazyListLayoutInfo) r0
        L_0x0012:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerState.getLayoutInfo$foundation_release():androidx.compose.foundation.lazy.LazyListLayoutInfo");
    }

    private final List<LazyListItemInfo> getVisiblePages() {
        return getLayoutInfo$foundation_release().getVisibleItemsInfo();
    }

    /* access modifiers changed from: private */
    public final int getPageAvailableSpace() {
        return getPageSize$foundation_release() + getPageSpacing$foundation_release();
    }

    /* access modifiers changed from: private */
    public final float getPositionThresholdFraction() {
        return Math.min(getDensity().m5607toPx0680j_4(PagerStateKt.getDefaultPositionThreshold()), ((float) getPageSize$foundation_release()) / 2.0f) / ((float) getPageSize$foundation_release());
    }

    public final int getPageCount$foundation_release() {
        return getLayoutInfo$foundation_release().getTotalItemsCount();
    }

    /* access modifiers changed from: private */
    public final LazyListItemInfo getClosestPageToSnappedPosition() {
        LazyListItemInfo lazyListItemInfo;
        List<LazyListItemInfo> visiblePages = getVisiblePages();
        if (visiblePages.isEmpty()) {
            lazyListItemInfo = null;
        } else {
            LazyListItemInfo lazyListItemInfo2 = visiblePages.get(0);
            float f = -Math.abs(LazyListSnapLayoutInfoProviderKt.calculateDistanceToDesiredSnapPosition(getDensity(), getLayoutInfo$foundation_release(), lazyListItemInfo2, PagerStateKt.getSnapAlignmentStartToStart()));
            int lastIndex = CollectionsKt.getLastIndex(visiblePages);
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    LazyListItemInfo lazyListItemInfo3 = visiblePages.get(i);
                    float f2 = -Math.abs(LazyListSnapLayoutInfoProviderKt.calculateDistanceToDesiredSnapPosition(getDensity(), getLayoutInfo$foundation_release(), lazyListItemInfo3, PagerStateKt.getSnapAlignmentStartToStart()));
                    if (Float.compare(f, f2) < 0) {
                        lazyListItemInfo2 = lazyListItemInfo3;
                        f = f2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            lazyListItemInfo = lazyListItemInfo2;
        }
        return lazyListItemInfo;
    }

    public final LazyListItemInfo getFirstVisiblePage$foundation_release() {
        LazyListItemInfo lazyListItemInfo;
        List<LazyListItemInfo> visiblePages = getVisiblePages();
        ListIterator<LazyListItemInfo> listIterator = visiblePages.listIterator(visiblePages.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                lazyListItemInfo = null;
                break;
            }
            lazyListItemInfo = listIterator.previous();
            if (LazyListSnapLayoutInfoProviderKt.calculateDistanceToDesiredSnapPosition(getDensity(), getLayoutInfo$foundation_release(), lazyListItemInfo, PagerStateKt.getSnapAlignmentStartToStart()) <= 0.0f) {
                break;
            }
        }
        return lazyListItemInfo;
    }

    private final float getDistanceToSnapPosition() {
        LazyListItemInfo closestPageToSnappedPosition = getClosestPageToSnappedPosition();
        if (closestPageToSnappedPosition != null) {
            return LazyListSnapLayoutInfoProviderKt.calculateDistanceToDesiredSnapPosition(getDensity(), getLayoutInfo$foundation_release(), closestPageToSnappedPosition, PagerStateKt.getSnapAlignmentStartToStart());
        }
        return 0.0f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.getInteractionSource();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.foundation.interaction.InteractionSource getInteractionSource() {
        /*
            r1 = this;
            androidx.compose.foundation.lazy.LazyListState r0 = r1.getLazyListState()
            if (r0 == 0) goto L_0x000c
            androidx.compose.foundation.interaction.InteractionSource r0 = r0.getInteractionSource()
            if (r0 != 0) goto L_0x0012
        L_0x000c:
            androidx.compose.foundation.pager.PagerStateKt$EmptyInteractionSources$1 r0 = androidx.compose.foundation.pager.PagerStateKt.EmptyInteractionSources
            androidx.compose.foundation.interaction.InteractionSource r0 = (androidx.compose.foundation.interaction.InteractionSource) r0
        L_0x0012:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerState.getInteractionSource():androidx.compose.foundation.interaction.InteractionSource");
    }

    /* access modifiers changed from: private */
    public final int getAnimationTargetPage() {
        return ((Number) this.animationTargetPage$delegate.getValue()).intValue();
    }

    private final void setAnimationTargetPage(int i) {
        this.animationTargetPage$delegate.setValue(Integer.valueOf(i));
    }

    /* access modifiers changed from: private */
    public final int getSettledPageState() {
        return ((Number) this.settledPageState$delegate.getValue()).intValue();
    }

    private final void setSettledPageState(int i) {
        this.settledPageState$delegate.setValue(Integer.valueOf(i));
    }

    public static /* synthetic */ Object scrollToPage$default(PagerState pagerState, int i, float f, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        return pagerState.scrollToPage(i, f, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object scrollToPage(int r9, float r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof androidx.compose.foundation.pager.PagerState$scrollToPage$1
            if (r0 == 0) goto L_0x0014
            r0 = r11
            androidx.compose.foundation.pager.PagerState$scrollToPage$1 r0 = (androidx.compose.foundation.pager.PagerState$scrollToPage$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r11 = r0.label
            int r11 = r11 - r2
            r0.label = r11
            goto L_0x0019
        L_0x0014:
            androidx.compose.foundation.pager.PagerState$scrollToPage$1 r0 = new androidx.compose.foundation.pager.PagerState$scrollToPage$1
            r0.<init>(r8, r11)
        L_0x0019:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0042
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002d
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0082
        L_0x002d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0036:
            float r10 = r0.F$0
            int r9 = r0.I$0
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.pager.PagerState r2 = (androidx.compose.foundation.pager.PagerState) r2
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0055
        L_0x0042:
            kotlin.ResultKt.throwOnFailure(r11)
            r0.L$0 = r8
            r0.I$0 = r9
            r0.F$0 = r10
            r0.label = r4
            java.lang.Object r11 = r8.awaitScrollDependencies(r0)
            if (r11 != r1) goto L_0x0054
            return r1
        L_0x0054:
            r2 = r8
        L_0x0055:
            double r4 = (double) r10
            r6 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            int r11 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r11 > 0) goto L_0x0091
            r6 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r11 > 0) goto L_0x0091
            int r9 = r2.coerceInPageRange(r9)
            int r11 = r2.getPageAvailableSpace()
            float r11 = (float) r11
            float r11 = r11 * r10
            int r10 = kotlin.math.MathKt.roundToInt((float) r11)
            androidx.compose.foundation.lazy.LazyListState r11 = r2.getLazyListState()
            if (r11 == 0) goto L_0x0085
            r2 = 0
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r9 = r11.scrollToItem(r9, r10, r0)
            if (r9 != r1) goto L_0x0082
            return r1
        L_0x0082:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        L_0x0085:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Required value was null."
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x0091:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r11 = "pageOffsetFraction "
            r9.<init>(r11)
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r10 = " is not within the range -0.5 to 0.5"
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerState.scrollToPage(int, float, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object animateScrollToPage(int r12, float r13, androidx.compose.animation.core.AnimationSpec<java.lang.Float> r14, kotlin.coroutines.Continuation<? super kotlin.Unit> r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof androidx.compose.foundation.pager.PagerState$animateScrollToPage$1
            if (r0 == 0) goto L_0x0014
            r0 = r15
            androidx.compose.foundation.pager.PagerState$animateScrollToPage$1 r0 = (androidx.compose.foundation.pager.PagerState$animateScrollToPage$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r15 = r0.label
            int r15 = r15 - r2
            r0.label = r15
            goto L_0x0019
        L_0x0014:
            androidx.compose.foundation.pager.PagerState$animateScrollToPage$1 r0 = new androidx.compose.foundation.pager.PagerState$animateScrollToPage$1
            r0.<init>(r11, r15)
        L_0x0019:
            java.lang.Object r15 = r0.result
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r0.label
            java.lang.String r8 = "Required value was null."
            r2 = 2
            r3 = 1
            r9 = 3
            if (r1 == 0) goto L_0x0064
            if (r1 == r3) goto L_0x0053
            if (r1 == r2) goto L_0x0040
            if (r1 != r9) goto L_0x0037
            java.lang.Object r12 = r0.L$0
            androidx.compose.foundation.pager.PagerState r12 = (androidx.compose.foundation.pager.PagerState) r12
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x0154
        L_0x0037:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0040:
            int r12 = r0.I$1
            int r13 = r0.I$0
            float r14 = r0.F$0
            java.lang.Object r1 = r0.L$1
            androidx.compose.animation.core.AnimationSpec r1 = (androidx.compose.animation.core.AnimationSpec) r1
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.pager.PagerState r2 = (androidx.compose.foundation.pager.PagerState) r2
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x0115
        L_0x0053:
            float r13 = r0.F$0
            int r12 = r0.I$0
            java.lang.Object r14 = r0.L$1
            androidx.compose.animation.core.AnimationSpec r14 = (androidx.compose.animation.core.AnimationSpec) r14
            java.lang.Object r1 = r0.L$0
            androidx.compose.foundation.pager.PagerState r1 = (androidx.compose.foundation.pager.PagerState) r1
            kotlin.ResultKt.throwOnFailure(r15)
            r15 = r1
            goto L_0x0082
        L_0x0064:
            kotlin.ResultKt.throwOnFailure(r15)
            int r15 = r11.getCurrentPage()
            if (r12 != r15) goto L_0x0070
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        L_0x0070:
            r0.L$0 = r11
            r0.L$1 = r14
            r0.I$0 = r12
            r0.F$0 = r13
            r0.label = r3
            java.lang.Object r15 = r11.awaitScrollDependencies(r0)
            if (r15 != r7) goto L_0x0081
            return r7
        L_0x0081:
            r15 = r11
        L_0x0082:
            double r3 = (double) r13
            r5 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x0165
            r5 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 > 0) goto L_0x0165
            int r1 = r15.getCurrentPage()
            int r10 = r15.coerceInPageRange(r12)
            r15.setAnimationTargetPage(r10)
            java.util.List r3 = r15.getVisiblePages()
            java.lang.Object r3 = kotlin.collections.CollectionsKt.first(r3)
            androidx.compose.foundation.lazy.LazyListItemInfo r3 = (androidx.compose.foundation.lazy.LazyListItemInfo) r3
            int r3 = r3.getIndex()
            java.util.List r4 = r15.getVisiblePages()
            java.lang.Object r4 = kotlin.collections.CollectionsKt.last(r4)
            androidx.compose.foundation.lazy.LazyListItemInfo r4 = (androidx.compose.foundation.lazy.LazyListItemInfo) r4
            int r4 = r4.getIndex()
            int r5 = r15.getCurrentPage()
            if (r12 <= r5) goto L_0x00be
            if (r12 > r4) goto L_0x00c6
        L_0x00be:
            int r4 = r15.getCurrentPage()
            if (r12 >= r4) goto L_0x0125
            if (r12 >= r3) goto L_0x0125
        L_0x00c6:
            int r3 = r15.getCurrentPage()
            int r3 = r12 - r3
            int r3 = java.lang.Math.abs(r3)
            if (r3 < r9) goto L_0x0125
            int r3 = r15.getCurrentPage()
            if (r12 <= r3) goto L_0x00e6
            java.util.List r3 = r15.getVisiblePages()
            int r3 = r3.size()
            int r12 = r12 - r3
            int r12 = kotlin.ranges.RangesKt.coerceAtLeast((int) r12, (int) r1)
            goto L_0x00f3
        L_0x00e6:
            java.util.List r3 = r15.getVisiblePages()
            int r3 = r3.size()
            int r1 = kotlin.ranges.RangesKt.coerceAtMost((int) r3, (int) r1)
            int r12 = r12 + r1
        L_0x00f3:
            androidx.compose.foundation.lazy.LazyListState r1 = r15.getLazyListState()
            if (r1 == 0) goto L_0x011b
            r3 = 0
            r5 = 2
            r6 = 0
            r0.L$0 = r15
            r0.L$1 = r14
            r0.F$0 = r13
            r0.I$0 = r10
            r0.I$1 = r12
            r0.label = r2
            r2 = r12
            r4 = r0
            java.lang.Object r1 = androidx.compose.foundation.lazy.LazyListState.scrollToItem$default(r1, r2, r3, r4, r5, r6)
            if (r1 != r7) goto L_0x0111
            return r7
        L_0x0111:
            r1 = r14
            r2 = r15
            r14 = r13
            r13 = r10
        L_0x0115:
            r10 = r13
            r13 = r14
            r14 = r1
            r1 = r12
            r12 = r2
            goto L_0x0126
        L_0x011b:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = r8.toString()
            r12.<init>(r13)
            throw r12
        L_0x0125:
            r12 = r15
        L_0x0126:
            int r15 = r12.getPageAvailableSpace()
            int r10 = r10 * r15
            int r15 = r12.getPageAvailableSpace()
            int r1 = r1 * r15
            float r15 = r12.getDistanceToSnapPosition()
            int r2 = r12.getPageAvailableSpace()
            float r2 = (float) r2
            float r13 = r13 * r2
            float r15 = r15 + r13
            int r10 = r10 - r1
            float r13 = (float) r10
            float r13 = r13 + r15
            androidx.compose.foundation.lazy.LazyListState r15 = r12.getLazyListState()
            if (r15 == 0) goto L_0x015b
            androidx.compose.foundation.gestures.ScrollableState r15 = (androidx.compose.foundation.gestures.ScrollableState) r15
            r0.L$0 = r12
            r1 = 0
            r0.L$1 = r1
            r0.label = r9
            java.lang.Object r13 = androidx.compose.foundation.gestures.ScrollExtensionsKt.animateScrollBy(r15, r13, r14, r0)
            if (r13 != r7) goto L_0x0154
            return r7
        L_0x0154:
            r13 = -1
            r12.setAnimationTargetPage(r13)
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        L_0x015b:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = r8.toString()
            r12.<init>(r13)
            throw r12
        L_0x0165:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r14 = "pageOffsetFraction "
            r12.<init>(r14)
            java.lang.StringBuilder r12 = r12.append(r13)
            java.lang.String r13 = " is not within the range -0.5 to 0.5"
            java.lang.StringBuilder r12 = r12.append(r13)
            java.lang.String r12 = r12.toString()
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r12 = r12.toString()
            r13.<init>(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerState.animateScrollToPage(int, float, androidx.compose.animation.core.AnimationSpec, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object animateScrollToPage$default(PagerState pagerState, int i, float f, AnimationSpec animationSpec, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        if ((i2 & 4) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, (Object) null, 5, (Object) null);
        }
        return pagerState.animateScrollToPage(i, f, animationSpec, continuation);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object awaitScrollDependencies(kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.pager.PagerState$awaitScrollDependencies$1
            if (r0 == 0) goto L_0x0014
            r0 = r6
            androidx.compose.foundation.pager.PagerState$awaitScrollDependencies$1 r0 = (androidx.compose.foundation.pager.PagerState$awaitScrollDependencies$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L_0x0019
        L_0x0014:
            androidx.compose.foundation.pager.PagerState$awaitScrollDependencies$1 r0 = new androidx.compose.foundation.pager.PagerState$awaitScrollDependencies$1
            r0.<init>(r5, r6)
        L_0x0019:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002d
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0065
        L_0x002d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0036:
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.pager.PagerState r2 = (androidx.compose.foundation.pager.PagerState) r2
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x004f
        L_0x003e:
            kotlin.ResultKt.throwOnFailure(r6)
            androidx.compose.foundation.pager.AwaitLazyListStateSet r6 = r5.awaitLazyListStateSet
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r6.waitFinalLazyListSetting(r0)
            if (r6 != r1) goto L_0x004e
            return r1
        L_0x004e:
            r2 = r5
        L_0x004f:
            androidx.compose.foundation.lazy.LazyListState r6 = r2.getLazyListState()
            if (r6 == 0) goto L_0x0068
            androidx.compose.foundation.lazy.AwaitFirstLayoutModifier r6 = r6.getAwaitLayoutModifier$foundation_release()
            r2 = 0
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r6 = r6.waitForFirstLayout(r0)
            if (r6 != r1) goto L_0x0065
            return r1
        L_0x0065:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L_0x0068:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerState.awaitScrollDependencies(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public Object scroll(MutatePriority mutatePriority, Function2<? super ScrollScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        LazyListState lazyListState = getLazyListState();
        if (lazyListState == null) {
            return Unit.INSTANCE;
        }
        Object scroll = lazyListState.scroll(mutatePriority, function2, continuation);
        return scroll == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? scroll : Unit.INSTANCE;
    }

    public float dispatchRawDelta(float f) {
        LazyListState lazyListState = getLazyListState();
        if (lazyListState != null) {
            return lazyListState.dispatchRawDelta(f);
        }
        return 0.0f;
    }

    public boolean isScrollInProgress() {
        LazyListState lazyListState = getLazyListState();
        if (lazyListState != null) {
            return lazyListState.isScrollInProgress();
        }
        return false;
    }

    public boolean getCanScrollForward() {
        LazyListState lazyListState = getLazyListState();
        if (lazyListState != null) {
            return lazyListState.getCanScrollForward();
        }
        return true;
    }

    public boolean getCanScrollBackward() {
        LazyListState lazyListState = getLazyListState();
        if (lazyListState != null) {
            return lazyListState.getCanScrollBackward();
        }
        return true;
    }

    /* access modifiers changed from: private */
    public final int coerceInPageRange(int i) {
        if (getPageCount$foundation_release() > 0) {
            return RangesKt.coerceIn(i, 0, getPageCount$foundation_release() - 1);
        }
        return 0;
    }

    public final void updateOnScrollStopped$foundation_release() {
        setSettledPageState(getCurrentPage());
    }

    public final void loadNewState$foundation_release(LazyListState lazyListState) {
        Intrinsics.checkNotNullParameter(lazyListState, "newState");
        setLazyListState(lazyListState);
        this.awaitLazyListStateSet.onStateLoaded();
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/pager/PagerState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/pager/PagerState;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: PagerState.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Saver<PagerState, ?> getSaver() {
            return PagerState.Saver;
        }
    }

    private final void setLazyListState(LazyListState lazyListState) {
        this.lazyListState$delegate.setValue(lazyListState);
    }

    public final int getCurrentPage() {
        return ((Number) this.currentPage$delegate.getValue()).intValue();
    }

    public final int getSettledPage() {
        return ((Number) this.settledPage$delegate.getValue()).intValue();
    }

    public final int getTargetPage() {
        return ((Number) this.targetPage$delegate.getValue()).intValue();
    }

    public final float getCurrentPageOffsetFraction() {
        return ((Number) this.currentPageOffsetFraction$delegate.getValue()).floatValue();
    }
}
