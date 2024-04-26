package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: LazyStaggeredGridDsl.kt */
final class LazyStaggeredGridDslKt$rememberColumnWidthSums$1$1 extends Lambda implements Function2<Density, Constraints, int[]> {
    final /* synthetic */ StaggeredGridCells $columns;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ Arrangement.Horizontal $horizontalArrangement;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyStaggeredGridDslKt$rememberColumnWidthSums$1$1(PaddingValues paddingValues, StaggeredGridCells staggeredGridCells, Arrangement.Horizontal horizontal) {
        super(2);
        this.$contentPadding = paddingValues;
        this.$columns = staggeredGridCells;
        this.$horizontalArrangement = horizontal;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m771invoke0kLqBqw((Density) obj, ((Constraints) obj2).m5576unboximpl());
    }

    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
    public final int[] m771invoke0kLqBqw(Density density, long j) {
        Intrinsics.checkNotNullParameter(density, "$this$null");
        if (Constraints.m5570getMaxWidthimpl(j) != Integer.MAX_VALUE) {
            List<Integer> calculateCrossAxisCellSizes = this.$columns.calculateCrossAxisCellSizes(density, Constraints.m5570getMaxWidthimpl(j) - density.m5601roundToPx0680j_4(Dp.m5626constructorimpl(PaddingKt.calculateStartPadding(this.$contentPadding, LayoutDirection.Ltr) + PaddingKt.calculateEndPadding(this.$contentPadding, LayoutDirection.Ltr))), density.m5601roundToPx0680j_4(this.$horizontalArrangement.m418getSpacingD9Ej5fM()));
            int size = calculateCrossAxisCellSizes.size();
            int[] iArr = new int[size];
            for (int i = 0; i < size; i++) {
                iArr[i] = calculateCrossAxisCellSizes.get(i).intValue();
            }
            int size2 = calculateCrossAxisCellSizes.size();
            for (int i2 = 1; i2 < size2; i2++) {
                iArr[i2] = iArr[i2] + iArr[i2 - 1];
            }
            return iArr;
        }
        throw new IllegalArgumentException("LazyVerticalStaggeredGrid's width should be bound by parent.".toString());
    }
}
