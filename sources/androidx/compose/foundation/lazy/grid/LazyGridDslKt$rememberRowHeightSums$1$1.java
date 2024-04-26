package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: LazyGridDsl.kt */
final class LazyGridDslKt$rememberRowHeightSums$1$1 extends Lambda implements Function2<Density, Constraints, List<Integer>> {
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ GridCells $rows;
    final /* synthetic */ Arrangement.Vertical $verticalArrangement;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyGridDslKt$rememberRowHeightSums$1$1(PaddingValues paddingValues, GridCells gridCells, Arrangement.Vertical vertical) {
        super(2);
        this.$contentPadding = paddingValues;
        this.$rows = gridCells;
        this.$verticalArrangement = vertical;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m685invoke0kLqBqw((Density) obj, ((Constraints) obj2).m5576unboximpl());
    }

    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
    public final List<Integer> m685invoke0kLqBqw(Density density, long j) {
        Intrinsics.checkNotNullParameter(density, "$this$null");
        if (Constraints.m5569getMaxHeightimpl(j) != Integer.MAX_VALUE) {
            List<Integer> mutableList = CollectionsKt.toMutableList(this.$rows.calculateCrossAxisCellSizes(density, Constraints.m5569getMaxHeightimpl(j) - density.m5601roundToPx0680j_4(Dp.m5626constructorimpl(this.$contentPadding.m506calculateTopPaddingD9Ej5fM() + this.$contentPadding.m503calculateBottomPaddingD9Ej5fM())), density.m5601roundToPx0680j_4(this.$verticalArrangement.m432getSpacingD9Ej5fM())));
            int size = mutableList.size();
            for (int i = 1; i < size; i++) {
                mutableList.set(i, Integer.valueOf(mutableList.get(i).intValue() + mutableList.get(i - 1).intValue()));
            }
            return mutableList;
        }
        throw new IllegalArgumentException("LazyHorizontalGrid's height should be bound by parent.".toString());
    }
}
