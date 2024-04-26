package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: LazyStaggeredGridMeasurePolicy.kt */
final class LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1 extends Lambda implements Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult> {
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ float $crossAxisSpacing;
    final /* synthetic */ LazyStaggeredGridItemProvider $itemProvider;
    final /* synthetic */ float $mainAxisSpacing;
    final /* synthetic */ Orientation $orientation;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ Function2<Density, Constraints, int[]> $slotSizesSums;
    final /* synthetic */ LazyStaggeredGridState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1(Orientation orientation, Function2<? super Density, ? super Constraints, int[]> function2, LazyStaggeredGridState lazyStaggeredGridState, LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, PaddingValues paddingValues, boolean z, float f, float f2) {
        super(2);
        this.$orientation = orientation;
        this.$slotSizesSums = function2;
        this.$state = lazyStaggeredGridState;
        this.$itemProvider = lazyStaggeredGridItemProvider;
        this.$contentPadding = paddingValues;
        this.$reverseLayout = z;
        this.$mainAxisSpacing = f;
        this.$crossAxisSpacing = f2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m786invoke0kLqBqw((LazyLayoutMeasureScope) obj, ((Constraints) obj2).m5576unboximpl());
    }

    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
    public final LazyStaggeredGridMeasureResult m786invoke0kLqBqw(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j) {
        long j2;
        LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
        long j3 = j;
        Intrinsics.checkNotNullParameter(lazyLayoutMeasureScope2, "$this$null");
        CheckScrollableContainerConstraintsKt.m202checkScrollableContainerConstraintsK40F9xA(j3, this.$orientation);
        int[] invoke = this.$slotSizesSums.invoke(lazyLayoutMeasureScope2, Constraints.m5558boximpl(j));
        boolean z = this.$orientation == Orientation.Vertical;
        this.$state.setLaneWidthsPrefixSum$foundation_release(invoke);
        this.$state.setVertical$foundation_release(z);
        this.$state.setSpanProvider$foundation_release(this.$itemProvider.getSpanProvider());
        int r14 = lazyLayoutMeasureScope2.m5601roundToPx0680j_4(LazyStaggeredGridMeasurePolicyKt.beforePadding(this.$contentPadding, this.$orientation, this.$reverseLayout, lazyLayoutMeasureScope.getLayoutDirection()));
        int r15 = lazyLayoutMeasureScope2.m5601roundToPx0680j_4(LazyStaggeredGridMeasurePolicyKt.afterPadding(this.$contentPadding, this.$orientation, this.$reverseLayout, lazyLayoutMeasureScope.getLayoutDirection()));
        int r4 = lazyLayoutMeasureScope2.m5601roundToPx0680j_4(LazyStaggeredGridMeasurePolicyKt.startPadding(this.$contentPadding, this.$orientation, lazyLayoutMeasureScope.getLayoutDirection()));
        int r12 = ((z ? Constraints.m5569getMaxHeightimpl(j) : Constraints.m5570getMaxWidthimpl(j)) - r14) - r15;
        if (z) {
            j2 = IntOffsetKt.IntOffset(r4, r14);
        } else {
            j2 = IntOffsetKt.IntOffset(r14, r4);
        }
        long j4 = j2;
        PaddingValues paddingValues = this.$contentPadding;
        int r42 = lazyLayoutMeasureScope2.m5601roundToPx0680j_4(Dp.m5626constructorimpl(PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()) + PaddingKt.calculateEndPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection())));
        PaddingValues paddingValues2 = this.$contentPadding;
        LazyStaggeredGridMeasureResult r1 = LazyStaggeredGridMeasureKt.m784measureStaggeredGridBTfHGGE(lazyLayoutMeasureScope, this.$state, this.$itemProvider, invoke, Constraints.m5561copyZbe2FdA$default(j, ConstraintsKt.m5584constrainWidthK40F9xA(j3, r42), 0, ConstraintsKt.m5583constrainHeightK40F9xA(j3, lazyLayoutMeasureScope2.m5601roundToPx0680j_4(Dp.m5626constructorimpl(paddingValues2.m506calculateTopPaddingD9Ej5fM() + paddingValues2.m503calculateBottomPaddingD9Ej5fM()))), 0, 10, (Object) null), z, this.$reverseLayout, j4, r12, lazyLayoutMeasureScope2.m5601roundToPx0680j_4(this.$mainAxisSpacing), lazyLayoutMeasureScope2.m5601roundToPx0680j_4(this.$crossAxisSpacing), r14, r15);
        this.$state.applyMeasureResult$foundation_release(r1);
        return r1;
    }
}
