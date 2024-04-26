package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001Br\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012*\u0010\u0004\u001a&\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015ø\u0001\u0000¢\u0006\u0002\u0010\u0017J2\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00162\b\u0010-\u001a\u0004\u0018\u00010)2\u0006\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\b2\u0006\u00100\u001a\u00020\u0006H\u0002J(\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u00062\u0006\u00103\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u00072\u0006\u00104\u001a\u000205H\u0002J3\u00106\u001a\u0002072\u0006\u00104\u001a\u0002052\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b<\u0010=J&\u0010>\u001a\u00020\n2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u0002072\u0006\u0010B\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\bJ\n\u0010\r\u001a\u00020\u0006*\u00020\u0016J\n\u0010C\u001a\u00020\u0006*\u00020\u0016R5\u0010\u0004\u001a&\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u000b\u001a\u00020\fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001b\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&R\u0018\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0\u0015X\u0004¢\u0006\u0004\n\u0002\u0010*\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006D"}, d2 = {"Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;", "", "orientation", "Landroidx/compose/foundation/layout/LayoutOrientation;", "arrangement", "Lkotlin/Function5;", "", "", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/Density;", "", "arrangementSpacing", "Landroidx/compose/ui/unit/Dp;", "crossAxisSize", "Landroidx/compose/foundation/layout/SizeMode;", "crossAxisAlignment", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "placeables", "", "Landroidx/compose/ui/layout/Placeable;", "(Landroidx/compose/foundation/layout/LayoutOrientation;Lkotlin/jvm/functions/Function5;FLandroidx/compose/foundation/layout/SizeMode;Landroidx/compose/foundation/layout/CrossAxisAlignment;Ljava/util/List;[Landroidx/compose/ui/layout/Placeable;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getArrangement", "()Lkotlin/jvm/functions/Function5;", "getArrangementSpacing-D9Ej5fM", "()F", "F", "getCrossAxisAlignment", "()Landroidx/compose/foundation/layout/CrossAxisAlignment;", "getCrossAxisSize", "()Landroidx/compose/foundation/layout/SizeMode;", "getMeasurables", "()Ljava/util/List;", "getOrientation", "()Landroidx/compose/foundation/layout/LayoutOrientation;", "getPlaceables", "()[Landroidx/compose/ui/layout/Placeable;", "[Landroidx/compose/ui/layout/Placeable;", "rowColumnParentData", "Landroidx/compose/foundation/layout/RowColumnParentData;", "[Landroidx/compose/foundation/layout/RowColumnParentData;", "getCrossAxisPosition", "placeable", "parentData", "crossAxisLayoutSize", "layoutDirection", "beforeCrossAxisAlignmentLine", "mainAxisPositions", "mainAxisLayoutSize", "childrenMainAxisSize", "measureScope", "Landroidx/compose/ui/layout/MeasureScope;", "measureWithoutPlacing", "Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "startIndex", "endIndex", "measureWithoutPlacing-_EkL_-Y", "(Landroidx/compose/ui/layout/MeasureScope;JII)Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;", "placeHelper", "placeableScope", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "measureResult", "crossAxisOffset", "mainAxisSize", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: RowColumnMeasurementHelper.kt */
public final class RowColumnMeasurementHelper {
    private final Function5<Integer, int[], LayoutDirection, Density, int[], Unit> arrangement;
    private final float arrangementSpacing;
    private final CrossAxisAlignment crossAxisAlignment;
    private final SizeMode crossAxisSize;
    private final List<Measurable> measurables;
    private final LayoutOrientation orientation;
    private final Placeable[] placeables;
    private final RowColumnParentData[] rowColumnParentData;

    public /* synthetic */ RowColumnMeasurementHelper(LayoutOrientation layoutOrientation, Function5 function5, float f, SizeMode sizeMode, CrossAxisAlignment crossAxisAlignment2, List list, Placeable[] placeableArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(layoutOrientation, function5, f, sizeMode, crossAxisAlignment2, list, placeableArr);
    }

    public final Function5<Integer, int[], LayoutDirection, Density, int[], Unit> getArrangement() {
        return this.arrangement;
    }

    /* renamed from: getArrangementSpacing-D9Ej5fM  reason: not valid java name */
    public final float m534getArrangementSpacingD9Ej5fM() {
        return this.arrangementSpacing;
    }

    public final CrossAxisAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    public final SizeMode getCrossAxisSize() {
        return this.crossAxisSize;
    }

    public final List<Measurable> getMeasurables() {
        return this.measurables;
    }

    public final LayoutOrientation getOrientation() {
        return this.orientation;
    }

    public final Placeable[] getPlaceables() {
        return this.placeables;
    }

    private RowColumnMeasurementHelper(LayoutOrientation layoutOrientation, Function5<? super Integer, ? super int[], ? super LayoutDirection, ? super Density, ? super int[], Unit> function5, float f, SizeMode sizeMode, CrossAxisAlignment crossAxisAlignment2, List<? extends Measurable> list, Placeable[] placeableArr) {
        this.orientation = layoutOrientation;
        this.arrangement = function5;
        this.arrangementSpacing = f;
        this.crossAxisSize = sizeMode;
        this.crossAxisAlignment = crossAxisAlignment2;
        this.measurables = list;
        this.placeables = placeableArr;
        int size = list.size();
        RowColumnParentData[] rowColumnParentDataArr = new RowColumnParentData[size];
        for (int i = 0; i < size; i++) {
            rowColumnParentDataArr[i] = RowColumnImplKt.getRowColumnParentData(this.measurables.get(i));
        }
        this.rowColumnParentData = rowColumnParentDataArr;
    }

    public final int mainAxisSize(Placeable placeable) {
        Intrinsics.checkNotNullParameter(placeable, "<this>");
        return this.orientation == LayoutOrientation.Horizontal ? placeable.getWidth() : placeable.getHeight();
    }

    public final int crossAxisSize(Placeable placeable) {
        Intrinsics.checkNotNullParameter(placeable, "<this>");
        return this.orientation == LayoutOrientation.Horizontal ? placeable.getHeight() : placeable.getWidth();
    }

    /* renamed from: measureWithoutPlacing-_EkL_-Y  reason: not valid java name */
    public final RowColumnMeasureHelperResult m535measureWithoutPlacing_EkL_Y(MeasureScope measureScope, long j, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        float f;
        int i10;
        int i11;
        int i12;
        int i13;
        MeasureScope measureScope2 = measureScope;
        int i14 = i2;
        Intrinsics.checkNotNullParameter(measureScope2, "measureScope");
        OrientationIndependentConstraints orientationIndependentConstraints = new OrientationIndependentConstraints(j, this.orientation, (DefaultConstructorMarker) null);
        int r3 = measureScope2.m5601roundToPx0680j_4(this.arrangementSpacing);
        int i15 = i14 - i;
        float f2 = 0.0f;
        int i16 = i;
        float f3 = 0.0f;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        boolean z = false;
        while (true) {
            i3 = Integer.MAX_VALUE;
            if (i16 >= i14) {
                break;
            }
            Measurable measurable = this.measurables.get(i16);
            RowColumnParentData rowColumnParentData2 = this.rowColumnParentData[i16];
            float weight = RowColumnImplKt.getWeight(rowColumnParentData2);
            if (weight > 0.0f) {
                f3 += weight;
                i19++;
                i11 = i16;
            } else {
                int mainAxisMax = orientationIndependentConstraints.getMainAxisMax();
                Placeable placeable = this.placeables[i16];
                if (placeable == null) {
                    i12 = mainAxisMax;
                    i13 = i18;
                    i11 = i16;
                    placeable = measurable.m4520measureBRTryo0(OrientationIndependentConstraints.copy$default(orientationIndependentConstraints, 0, mainAxisMax == Integer.MAX_VALUE ? Integer.MAX_VALUE : mainAxisMax - i20, 0, 0, 8, (Object) null).m485toBoxConstraintsOenEA2s(this.orientation));
                } else {
                    i12 = mainAxisMax;
                    i13 = i18;
                    i11 = i16;
                }
                int min = Math.min(r3, (i12 - i20) - mainAxisSize(placeable));
                i20 += mainAxisSize(placeable) + min;
                i18 = Math.max(i13, crossAxisSize(placeable));
                z = z || RowColumnImplKt.isRelative(rowColumnParentData2);
                this.placeables[i11] = placeable;
                i17 = min;
            }
            i16 = i11 + 1;
        }
        int i21 = i18;
        if (i19 == 0) {
            i20 -= i17;
            i5 = i21;
            i4 = 0;
        } else {
            int i22 = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
            if (i22 <= 0 || orientationIndependentConstraints.getMainAxisMax() == Integer.MAX_VALUE) {
                i9 = orientationIndependentConstraints.getMainAxisMin();
            } else {
                i9 = orientationIndependentConstraints.getMainAxisMax();
            }
            int i23 = r3 * (i19 - 1);
            int i24 = (i9 - i20) - i23;
            float f4 = i22 > 0 ? ((float) i24) / f3 : 0.0f;
            Iterator it = RangesKt.until(i, i2).iterator();
            int i25 = 0;
            while (it.hasNext()) {
                i25 += MathKt.roundToInt(RowColumnImplKt.getWeight(this.rowColumnParentData[((IntIterator) it).nextInt()]) * f4);
            }
            int i26 = i24 - i25;
            int i27 = i;
            i5 = i21;
            int i28 = 0;
            while (i27 < i14) {
                if (this.placeables[i27] == null) {
                    Measurable measurable2 = this.measurables.get(i27);
                    RowColumnParentData rowColumnParentData3 = this.rowColumnParentData[i27];
                    float weight2 = RowColumnImplKt.getWeight(rowColumnParentData3);
                    if (weight2 > f2) {
                        int sign = MathKt.getSign(i26);
                        int i29 = i26 - sign;
                        int max = Math.max(0, MathKt.roundToInt(weight2 * f4) + sign);
                        if (!RowColumnImplKt.getFill(rowColumnParentData3) || max == i3) {
                            f = f4;
                            i10 = 0;
                        } else {
                            f = f4;
                            i10 = max;
                        }
                        int i30 = i29;
                        Placeable r4 = measurable2.m4520measureBRTryo0(new OrientationIndependentConstraints(i10, max, 0, orientationIndependentConstraints.getCrossAxisMax()).m485toBoxConstraintsOenEA2s(this.orientation));
                        i28 += mainAxisSize(r4);
                        i5 = Math.max(i5, crossAxisSize(r4));
                        z = z || RowColumnImplKt.isRelative(rowColumnParentData3);
                        this.placeables[i27] = r4;
                        i26 = i30;
                    } else {
                        throw new IllegalStateException("All weights <= 0 should have placeables".toString());
                    }
                } else {
                    f = f4;
                }
                i27++;
                f4 = f;
                i3 = Integer.MAX_VALUE;
                f2 = 0.0f;
            }
            i4 = RangesKt.coerceAtMost(i28 + i23, orientationIndependentConstraints.getMainAxisMax() - i20);
        }
        if (z) {
            int i31 = 0;
            i7 = 0;
            for (int i32 = i; i32 < i14; i32++) {
                Placeable placeable2 = this.placeables[i32];
                Intrinsics.checkNotNull(placeable2);
                CrossAxisAlignment crossAxisAlignment2 = RowColumnImplKt.getCrossAxisAlignment(this.rowColumnParentData[i32]);
                Integer calculateAlignmentLinePosition$foundation_layout_release = crossAxisAlignment2 != null ? crossAxisAlignment2.calculateAlignmentLinePosition$foundation_layout_release(placeable2) : null;
                if (calculateAlignmentLinePosition$foundation_layout_release != null) {
                    Number number = calculateAlignmentLinePosition$foundation_layout_release;
                    int intValue = number.intValue();
                    if (intValue == Integer.MIN_VALUE) {
                        intValue = 0;
                    }
                    i31 = Math.max(i31, intValue);
                    int crossAxisSize2 = crossAxisSize(placeable2);
                    int intValue2 = number.intValue();
                    if (intValue2 == Integer.MIN_VALUE) {
                        intValue2 = crossAxisSize(placeable2);
                    }
                    i7 = Math.max(i7, crossAxisSize2 - intValue2);
                }
            }
            i6 = i31;
        } else {
            i7 = 0;
            i6 = 0;
        }
        int max2 = Math.max(i20 + i4, orientationIndependentConstraints.getMainAxisMin());
        if (orientationIndependentConstraints.getCrossAxisMax() == Integer.MAX_VALUE || this.crossAxisSize != SizeMode.Expand) {
            i8 = Math.max(i5, Math.max(orientationIndependentConstraints.getCrossAxisMin(), i7 + i6));
        } else {
            i8 = orientationIndependentConstraints.getCrossAxisMax();
        }
        int[] iArr = new int[i15];
        for (int i33 = 0; i33 < i15; i33++) {
            iArr[i33] = 0;
        }
        int[] iArr2 = new int[i15];
        for (int i34 = 0; i34 < i15; i34++) {
            Placeable placeable3 = this.placeables[i34 + i];
            Intrinsics.checkNotNull(placeable3);
            iArr2[i34] = mainAxisSize(placeable3);
        }
        return new RowColumnMeasureHelperResult(i8, max2, i, i2, i6, mainAxisPositions(max2, iArr2, iArr, measureScope2));
    }

    private final int[] mainAxisPositions(int i, int[] iArr, int[] iArr2, MeasureScope measureScope) {
        this.arrangement.invoke(Integer.valueOf(i), iArr, measureScope.getLayoutDirection(), measureScope, iArr2);
        return iArr2;
    }

    private final int getCrossAxisPosition(Placeable placeable, RowColumnParentData rowColumnParentData2, int i, LayoutDirection layoutDirection, int i2) {
        CrossAxisAlignment crossAxisAlignment2;
        if (rowColumnParentData2 == null || (crossAxisAlignment2 = rowColumnParentData2.getCrossAxisAlignment()) == null) {
            crossAxisAlignment2 = this.crossAxisAlignment;
        }
        int crossAxisSize2 = i - crossAxisSize(placeable);
        if (this.orientation == LayoutOrientation.Horizontal) {
            layoutDirection = LayoutDirection.Ltr;
        }
        return crossAxisAlignment2.align$foundation_layout_release(crossAxisSize2, layoutDirection, placeable, i2);
    }

    public final void placeHelper(Placeable.PlacementScope placementScope, RowColumnMeasureHelperResult rowColumnMeasureHelperResult, int i, LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(placementScope, "placeableScope");
        Intrinsics.checkNotNullParameter(rowColumnMeasureHelperResult, "measureResult");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        int endIndex = rowColumnMeasureHelperResult.getEndIndex();
        for (int startIndex = rowColumnMeasureHelperResult.getStartIndex(); startIndex < endIndex; startIndex++) {
            Placeable placeable = this.placeables[startIndex];
            Intrinsics.checkNotNull(placeable);
            int[] mainAxisPositions = rowColumnMeasureHelperResult.getMainAxisPositions();
            Object parentData = this.measurables.get(startIndex).getParentData();
            int crossAxisPosition = getCrossAxisPosition(placeable, parentData instanceof RowColumnParentData ? (RowColumnParentData) parentData : null, rowColumnMeasureHelperResult.getCrossAxisSize(), layoutDirection, rowColumnMeasureHelperResult.getBeforeCrossAxisAlignmentLine()) + i;
            if (this.orientation == LayoutOrientation.Horizontal) {
                Placeable.PlacementScope.place$default(placementScope, placeable, mainAxisPositions[startIndex - rowColumnMeasureHelperResult.getStartIndex()], crossAxisPosition, 0.0f, 4, (Object) null);
            } else {
                Placeable.PlacementScope.place$default(placementScope, placeable, crossAxisPosition, mainAxisPositions[startIndex - rowColumnMeasureHelperResult.getStartIndex()], 0.0f, 4, (Object) null);
            }
        }
    }
}
