package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0016J\"\u0010\t\u001a\u00020\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\u0003H\u0016J/\u0010\u000b\u001a\u00020\f*\u00020\r2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\u0013\u001a\u00020\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0016J\"\u0010\u0014\u001a\u00020\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\u0003H\u0016\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"androidx/compose/foundation/layout/RowColumnImplKt$rowColumnMeasurePolicy$1", "Landroidx/compose/ui/layout/MeasurePolicy;", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: RowColumnImpl.kt */
public final class RowColumnImplKt$rowColumnMeasurePolicy$1 implements MeasurePolicy {
    final /* synthetic */ Function5<Integer, int[], LayoutDirection, Density, int[], Unit> $arrangement;
    final /* synthetic */ float $arrangementSpacing;
    final /* synthetic */ CrossAxisAlignment $crossAxisAlignment;
    final /* synthetic */ SizeMode $crossAxisSize;
    final /* synthetic */ LayoutOrientation $orientation;

    RowColumnImplKt$rowColumnMeasurePolicy$1(LayoutOrientation layoutOrientation, Function5<? super Integer, ? super int[], ? super LayoutDirection, ? super Density, ? super int[], Unit> function5, float f, SizeMode sizeMode, CrossAxisAlignment crossAxisAlignment) {
        this.$orientation = layoutOrientation;
        this.$arrangement = function5;
        this.$arrangementSpacing = f;
        this.$crossAxisSize = sizeMode;
        this.$crossAxisAlignment = crossAxisAlignment;
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public MeasureResult m533measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(measureScope, "$this$measure");
        Intrinsics.checkNotNullParameter(list, "measurables");
        RowColumnMeasurementHelper rowColumnMeasurementHelper = new RowColumnMeasurementHelper(this.$orientation, this.$arrangement, this.$arrangementSpacing, this.$crossAxisSize, this.$crossAxisAlignment, list, new Placeable[list.size()], (DefaultConstructorMarker) null);
        RowColumnMeasureHelperResult r13 = rowColumnMeasurementHelper.m535measureWithoutPlacing_EkL_Y(measureScope, j, 0, list.size());
        if (this.$orientation == LayoutOrientation.Horizontal) {
            i2 = r13.getMainAxisSize();
            i = r13.getCrossAxisSize();
        } else {
            i2 = r13.getCrossAxisSize();
            i = r13.getMainAxisSize();
        }
        return MeasureScope.layout$default(measureScope, i2, i, (Map) null, new RowColumnImplKt$rowColumnMeasurePolicy$1$measure$1(rowColumnMeasurementHelper, r13, measureScope), 4, (Object) null);
    }

    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        return ((Number) RowColumnImplKt.MinIntrinsicWidthMeasureBlock(this.$orientation).invoke(list, Integer.valueOf(i), Integer.valueOf(intrinsicMeasureScope.m5601roundToPx0680j_4(this.$arrangementSpacing)))).intValue();
    }

    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        return ((Number) RowColumnImplKt.MinIntrinsicHeightMeasureBlock(this.$orientation).invoke(list, Integer.valueOf(i), Integer.valueOf(intrinsicMeasureScope.m5601roundToPx0680j_4(this.$arrangementSpacing)))).intValue();
    }

    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        return ((Number) RowColumnImplKt.MaxIntrinsicWidthMeasureBlock(this.$orientation).invoke(list, Integer.valueOf(i), Integer.valueOf(intrinsicMeasureScope.m5601roundToPx0680j_4(this.$arrangementSpacing)))).intValue();
    }

    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        return ((Number) RowColumnImplKt.MaxIntrinsicHeightMeasureBlock(this.$orientation).invoke(list, Integer.valueOf(i), Integer.valueOf(intrinsicMeasureScope.m5601roundToPx0680j_4(this.$arrangementSpacing)))).intValue();
    }
}
