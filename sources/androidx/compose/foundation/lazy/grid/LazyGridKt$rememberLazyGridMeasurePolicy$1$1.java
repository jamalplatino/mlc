package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffsetKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: LazyGrid.kt */
final class LazyGridKt$rememberLazyGridMeasurePolicy$1$1 extends Lambda implements Function2<LazyLayoutMeasureScope, Constraints, LazyGridMeasureResult> {
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ Arrangement.Horizontal $horizontalArrangement;
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ LazyGridItemProvider $itemProvider;
    final /* synthetic */ LazyGridItemPlacementAnimator $placementAnimator;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ Function2<Density, Constraints, List<Integer>> $slotSizesSums;
    final /* synthetic */ LazyGridState $state;
    final /* synthetic */ Arrangement.Vertical $verticalArrangement;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyGridKt$rememberLazyGridMeasurePolicy$1$1(boolean z, PaddingValues paddingValues, boolean z2, LazyGridState lazyGridState, LazyGridItemProvider lazyGridItemProvider, Function2<? super Density, ? super Constraints, ? extends List<Integer>> function2, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator) {
        super(2);
        this.$isVertical = z;
        this.$contentPadding = paddingValues;
        this.$reverseLayout = z2;
        this.$state = lazyGridState;
        this.$itemProvider = lazyGridItemProvider;
        this.$slotSizesSums = function2;
        this.$verticalArrangement = vertical;
        this.$horizontalArrangement = horizontal;
        this.$placementAnimator = lazyGridItemPlacementAnimator;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m694invoke0kLqBqw((LazyLayoutMeasureScope) obj, ((Constraints) obj2).m5576unboximpl());
    }

    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
    public final LazyGridMeasureResult m694invoke0kLqBqw(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j) {
        int i;
        int i2;
        float f;
        float f2;
        int i3;
        long j2;
        Snapshot makeCurrent;
        int i4;
        int i5;
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
        int i6 = r4 + r5;
        int i7 = i + i2;
        boolean z = this.$isVertical;
        int i8 = z ? i6 : i7;
        int i9 = (!z || this.$reverseLayout) ? (!z || !this.$reverseLayout) ? (z || this.$reverseLayout) ? i2 : i : r5 : r4;
        int i10 = i8 - i9;
        long r26 = ConstraintsKt.m5586offsetNN6EwU(j3, -i7, -i6);
        this.$state.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(this.$itemProvider);
        LazyGridSpanLayoutProvider spanLayoutProvider = this.$itemProvider.getSpanLayoutProvider();
        List invoke = this.$slotSizesSums.invoke(lazyLayoutMeasureScope2, Constraints.m5558boximpl(j));
        spanLayoutProvider.setSlotsPerLine(invoke.size());
        Density density = lazyLayoutMeasureScope2;
        this.$state.setDensity$foundation_release(density);
        this.$state.setSlotsPerLine$foundation_release(invoke.size());
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
        int r8 = lazyLayoutMeasureScope2.m5601roundToPx0680j_4(f);
        if (this.$isVertical) {
            Arrangement.Horizontal horizontal2 = this.$horizontalArrangement;
            if (horizontal2 != null) {
                f2 = horizontal2.m418getSpacingD9Ej5fM();
            } else {
                f2 = Dp.m5626constructorimpl((float) 0);
            }
        } else {
            Arrangement.Vertical vertical2 = this.$verticalArrangement;
            if (vertical2 != null) {
                f2 = vertical2.m432getSpacingD9Ej5fM();
            } else {
                f2 = Dp.m5626constructorimpl((float) 0);
            }
        }
        int r6 = lazyLayoutMeasureScope2.m5601roundToPx0680j_4(f2);
        int itemCount = this.$itemProvider.getItemCount();
        if (this.$isVertical) {
            i3 = Constraints.m5569getMaxHeightimpl(j) - i6;
        } else {
            i3 = Constraints.m5570getMaxWidthimpl(j) - i7;
        }
        int i11 = i3;
        if (!this.$reverseLayout || i11 > 0) {
            j2 = IntOffsetKt.IntOffset(i, r4);
        } else {
            boolean z2 = this.$isVertical;
            if (!z2) {
                i += i11;
            }
            if (z2) {
                r4 += i11;
            }
            j2 = IntOffsetKt.IntOffset(i, r4);
        }
        int i12 = itemCount;
        int i13 = i6;
        int i14 = r6;
        int i15 = i7;
        int i16 = r8;
        Density density2 = density;
        LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider = spanLayoutProvider;
        List list = invoke;
        LazyMeasuredItemProvider lazyMeasuredItemProvider = new LazyMeasuredItemProvider(this.$itemProvider, lazyLayoutMeasureScope2, i16, new LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1(lazyLayoutMeasureScope, this.$isVertical, this.$reverseLayout, i9, i10, this.$placementAnimator, j2));
        final LazyMeasuredLineProvider lazyMeasuredLineProvider = new LazyMeasuredLineProvider(this.$isVertical, list, i14, i12, i16, lazyMeasuredItemProvider, lazyGridSpanLayoutProvider, new LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1(this.$isVertical, list, lazyLayoutMeasureScope2, i14));
        final LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider2 = lazyGridSpanLayoutProvider;
        this.$state.setPrefetchInfoRetriever$foundation_release(new Function1<LineIndex, ArrayList<Pair<? extends Integer, ? extends Constraints>>>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m695invokebKFJvoY(((LineIndex) obj).m731unboximpl());
            }

            /* renamed from: invoke-bKFJvoY  reason: not valid java name */
            public final ArrayList<Pair<Integer, Constraints>> m695invokebKFJvoY(int i) {
                LazyGridSpanLayoutProvider.LineConfiguration lineConfiguration = lazyGridSpanLayoutProvider2.getLineConfiguration(i);
                int r0 = ItemIndex.m667constructorimpl(lineConfiguration.getFirstItemIndex());
                ArrayList<Pair<Integer, Constraints>> arrayList = new ArrayList<>(lineConfiguration.getSpans().size());
                List<GridItemSpan> spans = lineConfiguration.getSpans();
                LazyMeasuredLineProvider lazyMeasuredLineProvider = lazyMeasuredLineProvider;
                int size = spans.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    int r6 = GridItemSpan.m661getCurrentLineSpanimpl(spans.get(i3).m664unboximpl());
                    arrayList.add(TuplesKt.to(Integer.valueOf(r0), Constraints.m5558boximpl(lazyMeasuredLineProvider.m716childConstraintsJhjzzOo$foundation_release(i2, r6))));
                    r0 = ItemIndex.m667constructorimpl(r0 + 1);
                    i2 += r6;
                }
                return arrayList;
            }
        });
        Snapshot.Companion companion = Snapshot.Companion;
        LazyGridState lazyGridState = this.$state;
        Snapshot createNonObservableSnapshot = companion.createNonObservableSnapshot();
        try {
            makeCurrent = createNonObservableSnapshot.makeCurrent();
            int i17 = i12;
            if (lazyGridState.getFirstVisibleItemIndex() >= i17) {
                if (i17 > 0) {
                    i5 = lazyGridSpanLayoutProvider2.m712getLineIndexOfItem_Ze7BM(i17 - 1);
                    i4 = 0;
                    Unit unit = Unit.INSTANCE;
                    createNonObservableSnapshot.restoreCurrent(makeCurrent);
                    createNonObservableSnapshot.dispose();
                    final LazyLayoutMeasureScope lazyLayoutMeasureScope3 = lazyLayoutMeasureScope;
                    final long j4 = j;
                    final int i18 = i15;
                    final int i19 = i13;
                    LazyGridMeasureResult r0 = LazyGridMeasureKt.m699measureLazyGridt5wl_D8(i17, this.$itemProvider, lazyMeasuredLineProvider, lazyMeasuredItemProvider, i11, i9, i10, i16, i5, i4, this.$state.getScrollToBeConsumed$foundation_release(), r26, this.$isVertical, this.$verticalArrangement, this.$horizontalArrangement, this.$reverseLayout, density2, this.$placementAnimator, lazyGridSpanLayoutProvider2, this.$state.getPinnedItems$foundation_release(), new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() {
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                            return invoke(((Number) obj).intValue(), ((Number) obj2).intValue(), (Function1<? super Placeable.PlacementScope, Unit>) (Function1) obj3);
                        }

                        public final MeasureResult invoke(int i, int i2, Function1<? super Placeable.PlacementScope, Unit> function1) {
                            Intrinsics.checkNotNullParameter(function1, "placement");
                            return lazyLayoutMeasureScope3.layout(ConstraintsKt.m5584constrainWidthK40F9xA(j4, i + i18), ConstraintsKt.m5583constrainHeightK40F9xA(j4, i2 + i19), MapsKt.emptyMap(), function1);
                        }
                    });
                    this.$state.applyMeasureResult$foundation_release(r0);
                    return r0;
                }
            }
            int r52 = lazyGridSpanLayoutProvider2.m712getLineIndexOfItem_Ze7BM(lazyGridState.getFirstVisibleItemIndex());
            i4 = lazyGridState.getFirstVisibleItemScrollOffset();
            i5 = r52;
            Unit unit2 = Unit.INSTANCE;
            createNonObservableSnapshot.restoreCurrent(makeCurrent);
            createNonObservableSnapshot.dispose();
            final LazyLayoutMeasureScope lazyLayoutMeasureScope32 = lazyLayoutMeasureScope;
            final long j42 = j;
            final int i182 = i15;
            final int i192 = i13;
            LazyGridMeasureResult r02 = LazyGridMeasureKt.m699measureLazyGridt5wl_D8(i17, this.$itemProvider, lazyMeasuredLineProvider, lazyMeasuredItemProvider, i11, i9, i10, i16, i5, i4, this.$state.getScrollToBeConsumed$foundation_release(), r26, this.$isVertical, this.$verticalArrangement, this.$horizontalArrangement, this.$reverseLayout, density2, this.$placementAnimator, lazyGridSpanLayoutProvider2, this.$state.getPinnedItems$foundation_release(), new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke(((Number) obj).intValue(), ((Number) obj2).intValue(), (Function1<? super Placeable.PlacementScope, Unit>) (Function1) obj3);
                }

                public final MeasureResult invoke(int i, int i2, Function1<? super Placeable.PlacementScope, Unit> function1) {
                    Intrinsics.checkNotNullParameter(function1, "placement");
                    return lazyLayoutMeasureScope32.layout(ConstraintsKt.m5584constrainWidthK40F9xA(j42, i + i182), ConstraintsKt.m5583constrainHeightK40F9xA(j42, i2 + i192), MapsKt.emptyMap(), function1);
                }
            });
            this.$state.applyMeasureResult$foundation_release(r02);
            return r02;
        } catch (Throwable th) {
            createNonObservableSnapshot.dispose();
            throw th;
        }
    }
}
