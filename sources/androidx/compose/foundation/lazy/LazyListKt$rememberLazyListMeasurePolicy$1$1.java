package androidx.compose.foundation.lazy;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: LazyList.kt */
final class LazyListKt$rememberLazyListMeasurePolicy$1$1 extends Lambda implements Function2<LazyLayoutMeasureScope, Constraints, LazyListMeasureResult> {
    final /* synthetic */ LazyListBeyondBoundsInfo $beyondBoundsInfo;
    final /* synthetic */ int $beyondBoundsItemCount;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ Alignment.Horizontal $horizontalAlignment;
    final /* synthetic */ Arrangement.Horizontal $horizontalArrangement;
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ LazyListItemProvider $itemProvider;
    final /* synthetic */ LazyListItemPlacementAnimator $placementAnimator;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ LazyListState $state;
    final /* synthetic */ Alignment.Vertical $verticalAlignment;
    final /* synthetic */ Arrangement.Vertical $verticalArrangement;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyListKt$rememberLazyListMeasurePolicy$1$1(boolean z, PaddingValues paddingValues, boolean z2, LazyListState lazyListState, LazyListItemProvider lazyListItemProvider, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, LazyListItemPlacementAnimator lazyListItemPlacementAnimator, LazyListBeyondBoundsInfo lazyListBeyondBoundsInfo, int i, Alignment.Horizontal horizontal2, Alignment.Vertical vertical2) {
        super(2);
        this.$isVertical = z;
        this.$contentPadding = paddingValues;
        this.$reverseLayout = z2;
        this.$state = lazyListState;
        this.$itemProvider = lazyListItemProvider;
        this.$verticalArrangement = vertical;
        this.$horizontalArrangement = horizontal;
        this.$placementAnimator = lazyListItemPlacementAnimator;
        this.$beyondBoundsInfo = lazyListBeyondBoundsInfo;
        this.$beyondBoundsItemCount = i;
        this.$horizontalAlignment = horizontal2;
        this.$verticalAlignment = vertical2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m633invoke0kLqBqw((LazyLayoutMeasureScope) obj, ((Constraints) obj2).m5576unboximpl());
    }

    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
    public final LazyListMeasureResult m633invoke0kLqBqw(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j) {
        int i;
        int i2;
        float f;
        int i3;
        long j2;
        Snapshot makeCurrent;
        LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
        long j3 = j;
        Intrinsics.checkNotNullParameter(lazyLayoutMeasureScope2, "$this$null");
        CheckScrollableContainerConstraintsKt.m202checkScrollableContainerConstraintsK40F9xA(j3, this.$isVertical ? Orientation.Vertical : Orientation.Horizontal);
        if (this.$isVertical) {
            i = lazyLayoutMeasureScope2.m5601roundToPx0680j_4(this.$contentPadding.m504calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
        } else {
            i = lazyLayoutMeasureScope2.m5601roundToPx0680j_4(PaddingKt.calculateStartPadding(this.$contentPadding, lazyLayoutMeasureScope.getLayoutDirection()));
        }
        if (this.$isVertical) {
            i2 = lazyLayoutMeasureScope2.m5601roundToPx0680j_4(this.$contentPadding.m505calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
        } else {
            i2 = lazyLayoutMeasureScope2.m5601roundToPx0680j_4(PaddingKt.calculateEndPadding(this.$contentPadding, lazyLayoutMeasureScope.getLayoutDirection()));
        }
        int r4 = lazyLayoutMeasureScope2.m5601roundToPx0680j_4(this.$contentPadding.m506calculateTopPaddingD9Ej5fM());
        int r5 = lazyLayoutMeasureScope2.m5601roundToPx0680j_4(this.$contentPadding.m503calculateBottomPaddingD9Ej5fM());
        int i4 = r4 + r5;
        int i5 = i + i2;
        boolean z = this.$isVertical;
        int i6 = z ? i4 : i5;
        int i7 = (!z || this.$reverseLayout) ? (!z || !this.$reverseLayout) ? (z || this.$reverseLayout) ? i2 : i : r5 : r4;
        int i8 = i6 - i7;
        long r26 = ConstraintsKt.m5586offsetNN6EwU(j3, -i5, -i4);
        this.$state.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(this.$itemProvider);
        Density density = lazyLayoutMeasureScope2;
        this.$state.setDensity$foundation_release(density);
        this.$itemProvider.getItemScope().setMaxSize(Constraints.m5570getMaxWidthimpl(r26), Constraints.m5569getMaxHeightimpl(r26));
        if (this.$isVertical) {
            Arrangement.Vertical vertical = this.$verticalArrangement;
            if (vertical != null) {
                f = vertical.m432getSpacingD9Ej5fM();
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        } else {
            Arrangement.Horizontal horizontal = this.$horizontalArrangement;
            if (horizontal != null) {
                f = horizontal.m418getSpacingD9Ej5fM();
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        int r22 = lazyLayoutMeasureScope2.m5601roundToPx0680j_4(f);
        int itemCount = this.$itemProvider.getItemCount();
        if (this.$isVertical) {
            i3 = Constraints.m5569getMaxHeightimpl(j) - i4;
        } else {
            i3 = Constraints.m5570getMaxWidthimpl(j) - i5;
        }
        int i9 = i3;
        if (!this.$reverseLayout || i9 > 0) {
            j2 = IntOffsetKt.IntOffset(i, r4);
        } else {
            boolean z2 = this.$isVertical;
            if (!z2) {
                i += i9;
            }
            if (z2) {
                r4 += i9;
            }
            j2 = IntOffsetKt.IntOffset(i, r4);
        }
        Density density2 = density;
        int i10 = i5;
        LazyMeasuredItemProvider lazyMeasuredItemProvider = new LazyMeasuredItemProvider(r26, this.$isVertical, this.$itemProvider, lazyLayoutMeasureScope, new LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1(itemCount, r22, lazyLayoutMeasureScope, this.$isVertical, this.$horizontalAlignment, this.$verticalAlignment, this.$reverseLayout, i7, i8, this.$placementAnimator, j2), (DefaultConstructorMarker) null);
        this.$state.m649setPremeasureConstraintsBRTryo0$foundation_release(lazyMeasuredItemProvider.m651getChildConstraintsmsEJaDk());
        Snapshot.Companion companion = Snapshot.Companion;
        LazyListState lazyListState = this.$state;
        Snapshot createNonObservableSnapshot = companion.createNonObservableSnapshot();
        try {
            makeCurrent = createNonObservableSnapshot.makeCurrent();
            int r8 = DataIndex.m616constructorimpl(lazyListState.getFirstVisibleItemIndex());
            int firstVisibleItemScrollOffset = lazyListState.getFirstVisibleItemScrollOffset();
            Unit unit = Unit.INSTANCE;
            createNonObservableSnapshot.restoreCurrent(makeCurrent);
            createNonObservableSnapshot.dispose();
            final LazyLayoutMeasureScope lazyLayoutMeasureScope3 = lazyLayoutMeasureScope;
            final long j4 = j;
            final int i11 = i10;
            final int i12 = i4;
            LazyListMeasureResult r0 = LazyListMeasureKt.m639measureLazyListHh3qtAg(itemCount, this.$itemProvider, lazyMeasuredItemProvider, i9, i7, i8, r22, r8, firstVisibleItemScrollOffset, this.$state.getScrollToBeConsumed$foundation_release(), r26, this.$isVertical, this.$itemProvider.getHeaderIndexes(), this.$verticalArrangement, this.$horizontalArrangement, this.$reverseLayout, density2, this.$placementAnimator, this.$beyondBoundsInfo, this.$beyondBoundsItemCount, this.$state.getPinnedItems$foundation_release(), new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke(((Number) obj).intValue(), ((Number) obj2).intValue(), (Function1<? super Placeable.PlacementScope, Unit>) (Function1) obj3);
                }

                public final MeasureResult invoke(int i, int i2, Function1<? super Placeable.PlacementScope, Unit> function1) {
                    Intrinsics.checkNotNullParameter(function1, "placement");
                    return lazyLayoutMeasureScope3.layout(ConstraintsKt.m5584constrainWidthK40F9xA(j4, i + i11), ConstraintsKt.m5583constrainHeightK40F9xA(j4, i2 + i12), MapsKt.emptyMap(), function1);
                }
            });
            this.$state.applyMeasureResult$foundation_release(r0);
            return r0;
        } catch (Throwable th) {
            createNonObservableSnapshot.dispose();
            throw th;
        }
    }
}
