package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: LazyGrid.kt */
final class LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 implements MeasuredLineFactory {
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ List<Integer> $resolvedSlotSizesSums;
    final /* synthetic */ int $spaceBetweenSlots;
    final /* synthetic */ LazyLayoutMeasureScope $this_null;

    LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1(boolean z, List<Integer> list, LazyLayoutMeasureScope lazyLayoutMeasureScope, int i) {
        this.$isVertical = z;
        this.$resolvedSlotSizesSums = list;
        this.$this_null = lazyLayoutMeasureScope;
        this.$spaceBetweenSlots = i;
    }

    /* renamed from: createLine-H9FfpSk  reason: not valid java name */
    public final LazyGridMeasuredLine m697createLineH9FfpSk(int i, LazyGridMeasuredItem[] lazyGridMeasuredItemArr, List<GridItemSpan> list, int i2) {
        Intrinsics.checkNotNullParameter(lazyGridMeasuredItemArr, "items");
        Intrinsics.checkNotNullParameter(list, "spans");
        return new LazyGridMeasuredLine(i, lazyGridMeasuredItemArr, list, this.$isVertical, this.$resolvedSlotSizesSums.size(), this.$this_null.getLayoutDirection(), i2, this.$spaceBetweenSlots, (DefaultConstructorMarker) null);
    }
}
