package androidx.compose.foundation.layout;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u000f\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00112\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005J$\u0010\u0014\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00112\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005J$\u0010\u0016\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00112\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005J\"\u0010\u0018\u001a\u00020\u0005*\u00020\u00192\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00112\u0006\u0010\u001a\u001a\u00020\u0005H\u0016J\"\u0010\u001b\u001a\u00020\u0005*\u00020\u00192\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00112\u0006\u0010\u0015\u001a\u00020\u0005H\u0016J/\u0010\u001c\u001a\u00020\u001d*\u00020\u001e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00112\u0006\u0010 \u001a\u00020!H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#J\"\u0010$\u001a\u00020\u0005*\u00020\u00192\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00112\u0006\u0010\u001a\u001a\u00020\u0005H\u0016J\"\u0010%\u001a\u00020\u0005*\u00020\u00192\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00112\u0006\u0010\u0015\u001a\u00020\u0005H\u0016R.\u0010\u0002\u001a\u001f\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR.\u0010\t\u001a\u001f\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR.\u0010\u000b\u001a\u001f\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR.\u0010\r\u001a\u001f\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\b\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006&"}, d2 = {"androidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1", "Landroidx/compose/ui/layout/MeasurePolicy;", "maxCrossAxisIntrinsicItemSize", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "Lkotlin/ExtensionFunctionType;", "getMaxCrossAxisIntrinsicItemSize", "()Lkotlin/jvm/functions/Function3;", "maxMainAxisIntrinsicItemSize", "getMaxMainAxisIntrinsicItemSize", "minCrossAxisIntrinsicItemSize", "getMinCrossAxisIntrinsicItemSize", "minMainAxisIntrinsicItemSize", "getMinMainAxisIntrinsicItemSize", "intrinsicCrossAxisSize", "measurables", "", "mainAxisAvailable", "arrangementSpacing", "maxIntrinsicMainAxisSize", "height", "minIntrinsicMainAxisSize", "crossAxisAvailable", "maxIntrinsicHeight", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "width", "maxIntrinsicWidth", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: FlowLayout.kt */
public final class FlowLayoutKt$flowMeasurePolicy$1 implements MeasurePolicy {
    final /* synthetic */ float $arrangementSpacing;
    final /* synthetic */ CrossAxisAlignment $crossAxisAlignment;
    final /* synthetic */ Function4<Integer, int[], MeasureScope, int[], Unit> $crossAxisArrangement;
    final /* synthetic */ SizeMode $crossAxisSize;
    final /* synthetic */ Function5<Integer, int[], LayoutDirection, Density, int[], Unit> $mainAxisArrangement;
    final /* synthetic */ int $maxItemsInMainAxis;
    final /* synthetic */ LayoutOrientation $orientation;
    private final Function3<IntrinsicMeasurable, Integer, Integer, Integer> maxCrossAxisIntrinsicItemSize;
    private final Function3<IntrinsicMeasurable, Integer, Integer, Integer> maxMainAxisIntrinsicItemSize;
    private final Function3<IntrinsicMeasurable, Integer, Integer, Integer> minCrossAxisIntrinsicItemSize;
    private final Function3<IntrinsicMeasurable, Integer, Integer, Integer> minMainAxisIntrinsicItemSize;

    public final Function3<IntrinsicMeasurable, Integer, Integer, Integer> getMaxCrossAxisIntrinsicItemSize() {
        return this.maxCrossAxisIntrinsicItemSize;
    }

    public final Function3<IntrinsicMeasurable, Integer, Integer, Integer> getMaxMainAxisIntrinsicItemSize() {
        return this.maxMainAxisIntrinsicItemSize;
    }

    public final Function3<IntrinsicMeasurable, Integer, Integer, Integer> getMinCrossAxisIntrinsicItemSize() {
        return this.minCrossAxisIntrinsicItemSize;
    }

    public final Function3<IntrinsicMeasurable, Integer, Integer, Integer> getMinMainAxisIntrinsicItemSize() {
        return this.minMainAxisIntrinsicItemSize;
    }

    FlowLayoutKt$flowMeasurePolicy$1(LayoutOrientation layoutOrientation, Function5<? super Integer, ? super int[], ? super LayoutDirection, ? super Density, ? super int[], Unit> function5, float f, SizeMode sizeMode, CrossAxisAlignment crossAxisAlignment, int i, Function4<? super Integer, ? super int[], ? super MeasureScope, ? super int[], Unit> function4) {
        Function3<IntrinsicMeasurable, Integer, Integer, Integer> function3;
        Function3<IntrinsicMeasurable, Integer, Integer, Integer> function32;
        Function3<IntrinsicMeasurable, Integer, Integer, Integer> function33;
        Function3<IntrinsicMeasurable, Integer, Integer, Integer> function34;
        this.$orientation = layoutOrientation;
        this.$mainAxisArrangement = function5;
        this.$arrangementSpacing = f;
        this.$crossAxisSize = sizeMode;
        this.$crossAxisAlignment = crossAxisAlignment;
        this.$maxItemsInMainAxis = i;
        this.$crossAxisArrangement = function4;
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            function3 = FlowLayoutKt$flowMeasurePolicy$1$maxMainAxisIntrinsicItemSize$1.INSTANCE;
        } else {
            function3 = FlowLayoutKt$flowMeasurePolicy$1$maxMainAxisIntrinsicItemSize$2.INSTANCE;
        }
        this.maxMainAxisIntrinsicItemSize = function3;
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            function32 = FlowLayoutKt$flowMeasurePolicy$1$maxCrossAxisIntrinsicItemSize$1.INSTANCE;
        } else {
            function32 = FlowLayoutKt$flowMeasurePolicy$1$maxCrossAxisIntrinsicItemSize$2.INSTANCE;
        }
        this.maxCrossAxisIntrinsicItemSize = function32;
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            function33 = FlowLayoutKt$flowMeasurePolicy$1$minCrossAxisIntrinsicItemSize$1.INSTANCE;
        } else {
            function33 = FlowLayoutKt$flowMeasurePolicy$1$minCrossAxisIntrinsicItemSize$2.INSTANCE;
        }
        this.minCrossAxisIntrinsicItemSize = function33;
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            function34 = FlowLayoutKt$flowMeasurePolicy$1$minMainAxisIntrinsicItemSize$1.INSTANCE;
        } else {
            function34 = FlowLayoutKt$flowMeasurePolicy$1$minMainAxisIntrinsicItemSize$2.INSTANCE;
        }
        this.minMainAxisIntrinsicItemSize = function34;
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public MeasureResult m464measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(measureScope, "$this$measure");
        Intrinsics.checkNotNullParameter(list, "measurables");
        RowColumnMeasurementHelper rowColumnMeasurementHelper = new RowColumnMeasurementHelper(this.$orientation, this.$mainAxisArrangement, this.$arrangementSpacing, this.$crossAxisSize, this.$crossAxisAlignment, list, new Placeable[list.size()], (DefaultConstructorMarker) null);
        FlowResult breakDownItems = FlowLayoutKt.breakDownItems(measureScope, rowColumnMeasurementHelper, this.$orientation, new OrientationIndependentConstraints(j, this.$orientation, (DefaultConstructorMarker) null), this.$maxItemsInMainAxis);
        int crossAxisTotalSize = breakDownItems.getCrossAxisTotalSize();
        MutableVector<RowColumnMeasureHelperResult> items = breakDownItems.getItems();
        int size = items.getSize();
        int[] iArr = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr[i3] = ((RowColumnMeasureHelperResult) items.getContent()[i3]).getCrossAxisSize();
        }
        int[] iArr2 = new int[size];
        this.$crossAxisArrangement.invoke(Integer.valueOf(crossAxisTotalSize), iArr, measureScope, iArr2);
        if (this.$orientation == LayoutOrientation.Horizontal) {
            i2 = breakDownItems.getMainAxisTotalSize();
            i = breakDownItems.getCrossAxisTotalSize();
        } else {
            i2 = breakDownItems.getCrossAxisTotalSize();
            i = breakDownItems.getMainAxisTotalSize();
        }
        return MeasureScope.layout$default(measureScope, ConstraintsKt.m5584constrainWidthK40F9xA(j, i2), ConstraintsKt.m5583constrainHeightK40F9xA(j, i), (Map) null, new FlowLayoutKt$flowMeasurePolicy$1$measure$1(breakDownItems, rowColumnMeasurementHelper, iArr2, measureScope), 4, (Object) null);
    }

    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        if (this.$orientation == LayoutOrientation.Horizontal) {
            return minIntrinsicMainAxisSize(list, i, intrinsicMeasureScope.m5601roundToPx0680j_4(this.$arrangementSpacing));
        }
        return intrinsicCrossAxisSize(list, i, intrinsicMeasureScope.m5601roundToPx0680j_4(this.$arrangementSpacing));
    }

    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        if (this.$orientation == LayoutOrientation.Horizontal) {
            return intrinsicCrossAxisSize(list, i, intrinsicMeasureScope.m5601roundToPx0680j_4(this.$arrangementSpacing));
        }
        return minIntrinsicMainAxisSize(list, i, intrinsicMeasureScope.m5601roundToPx0680j_4(this.$arrangementSpacing));
    }

    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        if (this.$orientation == LayoutOrientation.Horizontal) {
            return intrinsicCrossAxisSize(list, i, intrinsicMeasureScope.m5601roundToPx0680j_4(this.$arrangementSpacing));
        }
        return maxIntrinsicMainAxisSize(list, i, intrinsicMeasureScope.m5601roundToPx0680j_4(this.$arrangementSpacing));
    }

    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        if (this.$orientation == LayoutOrientation.Horizontal) {
            return maxIntrinsicMainAxisSize(list, i, intrinsicMeasureScope.m5601roundToPx0680j_4(this.$arrangementSpacing));
        }
        return intrinsicCrossAxisSize(list, i, intrinsicMeasureScope.m5601roundToPx0680j_4(this.$arrangementSpacing));
    }

    public final int minIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, int i, int i2) {
        Intrinsics.checkNotNullParameter(list, "measurables");
        return FlowLayoutKt.minIntrinsicMainAxisSize(list, this.minMainAxisIntrinsicItemSize, this.minCrossAxisIntrinsicItemSize, i, i2, this.$maxItemsInMainAxis);
    }

    public final int maxIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, int i, int i2) {
        Intrinsics.checkNotNullParameter(list, "measurables");
        return FlowLayoutKt.maxIntrinsicMainAxisSize(list, this.maxMainAxisIntrinsicItemSize, i, i2, this.$maxItemsInMainAxis);
    }

    public final int intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, int i, int i2) {
        Intrinsics.checkNotNullParameter(list, "measurables");
        return FlowLayoutKt.intrinsicCrossAxisSize(list, (Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer>) this.minMainAxisIntrinsicItemSize, (Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer>) this.minCrossAxisIntrinsicItemSize, i, i2, this.$maxItemsInMainAxis);
    }
}
