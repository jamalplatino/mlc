package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000 \u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aR\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\nH\bø\u0001\u0000\u001a\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020#H\u0002\u001aê\u0001\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010'\u001a\u00020(2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u000e2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020#2\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u0010\u0003\u001a\u00020\u00042/\u00107\u001a+\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020:0\n¢\u0006\u0002\b;\u0012\u0004\u0012\u00020<08H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b=\u0010>\u001a$\u0010?\u001a\u00020\u0012*\u00020\u00022\u0006\u0010@\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000eH\u0002\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006A"}, d2 = {"calculateExtraItems", "", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "pinnedItems", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "measuredItemProvider", "Landroidx/compose/foundation/lazy/grid/LazyMeasuredItemProvider;", "itemProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "itemConstraints", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/ItemIndex;", "Landroidx/compose/ui/unit/Constraints;", "filter", "", "", "calculateItemsOffsets", "", "Landroidx/compose/foundation/lazy/grid/LazyGridPositionedItem;", "lines", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "itemsBefore", "itemsAfter", "layoutWidth", "layoutHeight", "finalMainAxisOffset", "maxOffset", "firstLineScrollOffset", "isVertical", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "reverseLayout", "density", "Landroidx/compose/ui/unit/Density;", "measureLazyGrid", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "itemsCount", "measuredLineProvider", "Landroidx/compose/foundation/lazy/grid/LazyMeasuredLineProvider;", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenLines", "firstVisibleLineIndex", "Landroidx/compose/foundation/lazy/grid/LineIndex;", "firstVisibleLineScrollOffset", "scrollToBeConsumed", "", "constraints", "placementAnimator", "Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "spanLayoutProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "layout", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/ui/layout/MeasureResult;", "measureLazyGrid-t5wl_D8", "(ILandroidx/compose/foundation/lazy/grid/LazyGridItemProvider;Landroidx/compose/foundation/lazy/grid/LazyMeasuredLineProvider;Landroidx/compose/foundation/lazy/grid/LazyMeasuredItemProvider;IIIIIIFJZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "positionExtraItem", "mainAxisOffset", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: LazyGridMeasure.kt */
public final class LazyGridMeasureKt {
    private static final int calculateItemsOffsets$reverseAware(int i, boolean z, int i2) {
        return !z ? i : (i2 - i) - 1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v21, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v7, resolved type: androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v18, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v19, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v20, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v22, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v42, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v49, resolved type: int} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: measureLazyGrid-t5wl_D8  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.foundation.lazy.grid.LazyGridMeasureResult m699measureLazyGridt5wl_D8(int r32, androidx.compose.foundation.lazy.grid.LazyGridItemProvider r33, androidx.compose.foundation.lazy.grid.LazyMeasuredLineProvider r34, androidx.compose.foundation.lazy.grid.LazyMeasuredItemProvider r35, int r36, int r37, int r38, int r39, int r40, int r41, float r42, long r43, boolean r45, androidx.compose.foundation.layout.Arrangement.Vertical r46, androidx.compose.foundation.layout.Arrangement.Horizontal r47, boolean r48, androidx.compose.ui.unit.Density r49, androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator r50, androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider r51, androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList r52, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super java.lang.Integer, ? super kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>, ? extends androidx.compose.ui.layout.MeasureResult> r53) {
        /*
            r9 = r32
            r0 = r33
            r1 = r34
            r2 = r36
            r3 = r37
            r4 = r43
            r6 = r52
            r7 = r53
            java.lang.String r8 = "itemProvider"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r8)
            java.lang.String r8 = "measuredLineProvider"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r8)
            java.lang.String r8 = "measuredItemProvider"
            r15 = r35
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r8)
            java.lang.String r8 = "density"
            r13 = r49
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r8)
            java.lang.String r8 = "placementAnimator"
            r14 = r50
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r8)
            java.lang.String r8 = "spanLayoutProvider"
            r12 = r51
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r8)
            java.lang.String r8 = "pinnedItems"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r8)
            java.lang.String r8 = "layout"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r8)
            java.lang.String r8 = "Failed requirement."
            if (r3 < 0) goto L_0x0452
            if (r38 < 0) goto L_0x0446
            if (r9 > 0) goto L_0x0092
            androidx.compose.foundation.lazy.grid.LazyGridMeasureResult r14 = new androidx.compose.foundation.lazy.grid.LazyGridMeasureResult
            r1 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            int r0 = androidx.compose.ui.unit.Constraints.m5572getMinWidthimpl(r43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r4 = androidx.compose.ui.unit.Constraints.m5571getMinHeightimpl(r43)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            androidx.compose.foundation.lazy.grid.LazyGridMeasureKt$measureLazyGrid$1 r5 = androidx.compose.foundation.lazy.grid.LazyGridMeasureKt$measureLazyGrid$1.INSTANCE
            java.lang.Object r0 = r7.invoke(r0, r4, r5)
            r5 = r0
            androidx.compose.ui.layout.MeasureResult r5 = (androidx.compose.ui.layout.MeasureResult) r5
            java.util.List r7 = kotlin.collections.CollectionsKt.emptyList()
            int r10 = -r3
            int r11 = r2 + r38
            r12 = 0
            if (r45 == 0) goto L_0x007c
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.Vertical
            goto L_0x007e
        L_0x007c:
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.Horizontal
        L_0x007e:
            r13 = r0
            r0 = r14
            r2 = r6
            r3 = r8
            r4 = r9
            r6 = r7
            r7 = r10
            r8 = r11
            r9 = r12
            r10 = r48
            r11 = r13
            r12 = r38
            r13 = r39
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r14
        L_0x0092:
            int r10 = kotlin.math.MathKt.roundToInt((float) r42)
            int r11 = r41 - r10
            r15 = 0
            int r12 = androidx.compose.foundation.lazy.grid.LineIndex.m721constructorimpl(r15)
            r15 = r40
            boolean r12 = androidx.compose.foundation.lazy.grid.LineIndex.m724equalsimpl0(r15, r12)
            if (r12 == 0) goto L_0x00a9
            if (r11 >= 0) goto L_0x00a9
            int r10 = r10 + r11
            r11 = 0
        L_0x00a9:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.List r12 = (java.util.List) r12
            int r15 = -r3
            if (r39 >= 0) goto L_0x00b6
            r16 = r39
            goto L_0x00b8
        L_0x00b6:
            r16 = 0
        L_0x00b8:
            int r13 = r15 + r16
            int r11 = r11 + r13
            r14 = r11
            r11 = r40
        L_0x00be:
            if (r14 >= 0) goto L_0x00e7
            r40 = 0
            int r16 = androidx.compose.foundation.lazy.grid.LineIndex.m721constructorimpl(r40)
            int r16 = r11 - r16
            if (r16 <= 0) goto L_0x00e7
            int r11 = r11 + -1
            int r11 = androidx.compose.foundation.lazy.grid.LineIndex.m721constructorimpl(r11)
            r16 = r15
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine r15 = r1.m717getAndMeasurebKFJvoY(r11)
            r17 = r11
            r11 = r40
            r12.add(r11, r15)
            int r11 = r15.getMainAxisSizeWithSpacings()
            int r14 = r14 + r11
            r15 = r16
            r11 = r17
            goto L_0x00be
        L_0x00e7:
            r16 = r15
            if (r14 >= r13) goto L_0x00ed
            int r10 = r10 + r14
            r14 = r13
        L_0x00ed:
            int r14 = r14 - r13
            int r15 = r2 + r38
            r17 = r8
            r40 = r11
            r11 = 0
            int r8 = kotlin.ranges.RangesKt.coerceAtLeast((int) r15, (int) r11)
            int r11 = -r14
            r18 = r11
            int r11 = r12.size()
            r20 = r40
            r19 = r14
            r14 = 0
        L_0x0105:
            if (r14 >= r11) goto L_0x011c
            java.lang.Object r21 = r12.get(r14)
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine r21 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine) r21
            int r20 = r20 + 1
            int r20 = androidx.compose.foundation.lazy.grid.LineIndex.m721constructorimpl(r20)
            int r21 = r21.getMainAxisSizeWithSpacings()
            int r18 = r18 + r21
            int r14 = r14 + 1
            goto L_0x0105
        L_0x011c:
            r14 = r18
            r11 = r20
        L_0x0120:
            if (r11 >= r9) goto L_0x017c
            if (r14 < r8) goto L_0x012c
            if (r14 <= 0) goto L_0x012c
            boolean r18 = r12.isEmpty()
            if (r18 == 0) goto L_0x017c
        L_0x012c:
            r18 = r8
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine r8 = r1.m717getAndMeasurebKFJvoY(r11)
            boolean r20 = r8.isEmpty()
            if (r20 == 0) goto L_0x0139
            goto L_0x017c
        L_0x0139:
            int r20 = r8.getMainAxisSizeWithSpacings()
            int r14 = r14 + r20
            if (r14 > r13) goto L_0x0164
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem[] r20 = r8.getItems()
            java.lang.Object r20 = kotlin.collections.ArraysKt.last((T[]) r20)
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem r20 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem) r20
            r21 = r13
            int r13 = r20.m701getIndexVZbfaAc()
            r20 = r14
            int r14 = r9 + -1
            if (r13 == r14) goto L_0x0168
            int r13 = r11 + 1
            int r13 = androidx.compose.foundation.lazy.grid.LineIndex.m721constructorimpl(r13)
            int r8 = r8.getMainAxisSizeWithSpacings()
            int r19 = r19 - r8
            goto L_0x016d
        L_0x0164:
            r21 = r13
            r20 = r14
        L_0x0168:
            r12.add(r8)
            r13 = r40
        L_0x016d:
            int r11 = r11 + 1
            int r11 = androidx.compose.foundation.lazy.grid.LineIndex.m721constructorimpl(r11)
            r40 = r13
            r8 = r18
            r14 = r20
            r13 = r21
            goto L_0x0120
        L_0x017c:
            if (r14 >= r2) goto L_0x01c0
            int r8 = r2 - r14
            int r19 = r19 - r8
            int r14 = r14 + r8
            r13 = r40
            r11 = r19
        L_0x0187:
            if (r11 >= r3) goto L_0x01b3
            r40 = 0
            int r18 = androidx.compose.foundation.lazy.grid.LineIndex.m721constructorimpl(r40)
            int r18 = r13 - r18
            if (r18 <= 0) goto L_0x01ae
            int r13 = r13 + -1
            int r13 = androidx.compose.foundation.lazy.grid.LineIndex.m721constructorimpl(r13)
            r41 = r15
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine r15 = r1.m717getAndMeasurebKFJvoY(r13)
            r7 = r40
            r12.add(r7, r15)
            int r15 = r15.getMainAxisSizeWithSpacings()
            int r11 = r11 + r15
            r15 = r41
            r7 = r53
            goto L_0x0187
        L_0x01ae:
            r7 = r40
            r41 = r15
            goto L_0x01b6
        L_0x01b3:
            r41 = r15
            r7 = 0
        L_0x01b6:
            int r10 = r10 + r8
            if (r11 >= 0) goto L_0x01bd
            int r10 = r10 + r11
            int r14 = r14 + r11
            r8 = r7
            goto L_0x01be
        L_0x01bd:
            r8 = r11
        L_0x01be:
            r15 = r14
            goto L_0x01c6
        L_0x01c0:
            r41 = r15
            r7 = 0
            r15 = r14
            r8 = r19
        L_0x01c6:
            int r11 = kotlin.math.MathKt.roundToInt((float) r42)
            int r11 = kotlin.math.MathKt.getSign((int) r11)
            int r13 = kotlin.math.MathKt.getSign((int) r10)
            if (r11 != r13) goto L_0x01e5
            int r11 = kotlin.math.MathKt.roundToInt((float) r42)
            int r11 = java.lang.Math.abs(r11)
            int r13 = java.lang.Math.abs(r10)
            if (r11 < r13) goto L_0x01e5
            float r10 = (float) r10
            r13 = r10
            goto L_0x01e7
        L_0x01e5:
            r13 = r42
        L_0x01e7:
            if (r8 < 0) goto L_0x043c
            int r14 = -r8
            java.lang.Object r10 = kotlin.collections.CollectionsKt.first(r12)
            r17 = r10
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine r17 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine) r17
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem[] r10 = r17.getItems()
            java.lang.Object r10 = kotlin.collections.ArraysKt.firstOrNull((T[]) r10)
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem r10 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem) r10
            if (r10 == 0) goto L_0x0204
            int r10 = r10.m701getIndexVZbfaAc()
            r11 = r10
            goto L_0x0205
        L_0x0204:
            r11 = r7
        L_0x0205:
            java.lang.Object r10 = kotlin.collections.CollectionsKt.lastOrNull(r12)
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine r10 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine) r10
            if (r10 == 0) goto L_0x0220
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem[] r10 = r10.getItems()
            if (r10 == 0) goto L_0x0220
            java.lang.Object r10 = kotlin.collections.ArraysKt.lastOrNull((T[]) r10)
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem r10 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem) r10
            if (r10 == 0) goto L_0x0220
            int r10 = r10.m701getIndexVZbfaAc()
            goto L_0x0221
        L_0x0220:
            r10 = r7
        L_0x0221:
            java.util.List r6 = (java.util.List) r6
            int r7 = r6.size()
            r18 = 0
            r19 = r15
            r20 = r18
            r15 = 0
        L_0x022e:
            if (r15 >= r7) goto L_0x02b6
            java.lang.Object r21 = r6.get(r15)
            androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList$PinnedItem r21 = (androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList.PinnedItem) r21
            r42 = r7
            r7 = r0
            androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider r7 = (androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider) r7
            r22 = r8
            java.lang.Object r8 = r21.getKey()
            r23 = r10
            int r10 = r21.getIndex()
            int r7 = androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt.findIndexByKey(r7, r8, r10)
            if (r7 < 0) goto L_0x028e
            if (r7 >= r11) goto L_0x028e
            int r7 = androidx.compose.foundation.lazy.grid.ItemIndex.m667constructorimpl(r7)
            long r24 = r1.m718itemConstraintsHZ0wssc(r7)
            r8 = 0
            r21 = 2
            r26 = 0
            r27 = r23
            r10 = r35
            r28 = r11
            r11 = r7
            r7 = r12
            r12 = r8
            r8 = r13
            r23 = r14
            r13 = r24
            r29 = r41
            r25 = r16
            r30 = r19
            r24 = 0
            r19 = r15
            r15 = r21
            r16 = r26
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem r10 = androidx.compose.foundation.lazy.grid.LazyMeasuredItemProvider.m714getAndMeasureednRnyU$default(r10, r11, r12, r13, r15, r16)
            if (r20 != 0) goto L_0x0286
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.List r11 = (java.util.List) r11
            goto L_0x0288
        L_0x0286:
            r11 = r20
        L_0x0288:
            r11.add(r10)
            r20 = r11
            goto L_0x02a0
        L_0x028e:
            r29 = r41
            r28 = r11
            r7 = r12
            r8 = r13
            r25 = r16
            r30 = r19
            r27 = r23
            r24 = 0
            r23 = r14
            r19 = r15
        L_0x02a0:
            int r15 = r19 + 1
            r12 = r7
            r13 = r8
            r8 = r22
            r14 = r23
            r16 = r25
            r10 = r27
            r11 = r28
            r41 = r29
            r19 = r30
            r7 = r42
            goto L_0x022e
        L_0x02b6:
            r29 = r41
            r22 = r8
            r27 = r10
            r28 = r11
            r7 = r12
            r8 = r13
            r23 = r14
            r25 = r16
            r30 = r19
            r24 = 0
            if (r20 != 0) goto L_0x02ce
            java.util.List r20 = kotlin.collections.CollectionsKt.emptyList()
        L_0x02ce:
            r26 = r20
            int r15 = r6.size()
            r13 = r24
        L_0x02d6:
            if (r13 >= r15) goto L_0x0334
            java.lang.Object r10 = r6.get(r13)
            androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList$PinnedItem r10 = (androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList.PinnedItem) r10
            r11 = r0
            androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider r11 = (androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider) r11
            java.lang.Object r12 = r10.getKey()
            int r10 = r10.getIndex()
            int r10 = androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt.findIndexByKey(r11, r12, r10)
            r14 = r27
            int r11 = r14 + 1
            if (r11 > r10) goto L_0x0327
            if (r10 >= r9) goto L_0x0327
            int r11 = androidx.compose.foundation.lazy.grid.ItemIndex.m667constructorimpl(r10)
            long r19 = r1.m718itemConstraintsHZ0wssc(r11)
            r12 = 0
            r16 = 2
            r21 = 0
            r10 = r35
            r27 = r13
            r31 = r14
            r13 = r19
            r19 = r15
            r15 = r16
            r16 = r21
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem r10 = androidx.compose.foundation.lazy.grid.LazyMeasuredItemProvider.m714getAndMeasureednRnyU$default(r10, r11, r12, r13, r15, r16)
            if (r18 != 0) goto L_0x031f
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r18 = r11
            java.util.List r18 = (java.util.List) r18
        L_0x031f:
            r11 = r18
            r11.add(r10)
            r18 = r11
            goto L_0x032d
        L_0x0327:
            r27 = r13
            r31 = r14
            r19 = r15
        L_0x032d:
            int r13 = r27 + 1
            r15 = r19
            r27 = r31
            goto L_0x02d6
        L_0x0334:
            r31 = r27
            if (r18 != 0) goto L_0x033c
            java.util.List r18 = kotlin.collections.CollectionsKt.emptyList()
        L_0x033c:
            r0 = r18
            if (r3 > 0) goto L_0x0348
            if (r39 >= 0) goto L_0x0343
            goto L_0x0348
        L_0x0343:
            r1 = r17
            r3 = r22
            goto L_0x0374
        L_0x0348:
            int r1 = r7.size()
            r3 = r22
            r15 = r24
        L_0x0350:
            if (r15 >= r1) goto L_0x0372
            java.lang.Object r6 = r7.get(r15)
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine r6 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine) r6
            int r6 = r6.getMainAxisSizeWithSpacings()
            if (r3 == 0) goto L_0x0372
            if (r6 > r3) goto L_0x0372
            int r10 = kotlin.collections.CollectionsKt.getLastIndex(r7)
            if (r15 == r10) goto L_0x0372
            int r3 = r3 - r6
            int r15 = r15 + 1
            java.lang.Object r6 = r7.get(r15)
            r17 = r6
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine r17 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine) r17
            goto L_0x0350
        L_0x0372:
            r1 = r17
        L_0x0374:
            if (r45 == 0) goto L_0x037f
            int r6 = androidx.compose.ui.unit.Constraints.m5570getMaxWidthimpl(r43)
            r27 = r6
            r6 = r30
            goto L_0x0387
        L_0x037f:
            r6 = r30
            int r10 = androidx.compose.ui.unit.ConstraintsKt.m5584constrainWidthK40F9xA(r4, r6)
            r27 = r10
        L_0x0387:
            if (r45 == 0) goto L_0x038e
            int r4 = androidx.compose.ui.unit.ConstraintsKt.m5583constrainHeightK40F9xA(r4, r6)
            goto L_0x0392
        L_0x038e:
            int r4 = androidx.compose.ui.unit.Constraints.m5569getMaxHeightimpl(r43)
        L_0x0392:
            r10 = r7
            r11 = r26
            r12 = r0
            r13 = r27
            r14 = r4
            r15 = r6
            r16 = r36
            r17 = r23
            r18 = r45
            r19 = r46
            r20 = r47
            r21 = r48
            r22 = r49
            java.util.List r5 = calculateItemsOffsets(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            int r11 = (int) r8
            r10 = r50
            r12 = r27
            r13 = r4
            r14 = r5
            r15 = r35
            r16 = r51
            r10.onMeasured(r11, r12, r13, r14, r15, r16)
            int r7 = r9 + -1
            r10 = r31
            if (r10 != r7) goto L_0x03c6
            if (r6 <= r2) goto L_0x03c3
            goto L_0x03c6
        L_0x03c3:
            r6 = r24
            goto L_0x03c8
        L_0x03c6:
            r2 = 1
            r6 = r2
        L_0x03c8:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r27)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            androidx.compose.foundation.lazy.grid.LazyGridMeasureKt$measureLazyGrid$3 r7 = new androidx.compose.foundation.lazy.grid.LazyGridMeasureKt$measureLazyGrid$3
            r7.<init>(r5)
            r11 = r53
            java.lang.Object r2 = r11.invoke(r2, r4, r7)
            r7 = r2
            androidx.compose.ui.layout.MeasureResult r7 = (androidx.compose.ui.layout.MeasureResult) r7
            boolean r2 = r26.isEmpty()
            if (r2 == 0) goto L_0x03ec
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x03ec
            r10 = r5
            goto L_0x041c
        L_0x03ec:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r2 = r5.size()
            r0.<init>(r2)
            int r2 = r5.size()
            r15 = r24
        L_0x03fb:
            if (r15 >= r2) goto L_0x0419
            java.lang.Object r4 = r5.get(r15)
            r11 = r4
            androidx.compose.foundation.lazy.grid.LazyGridPositionedItem r11 = (androidx.compose.foundation.lazy.grid.LazyGridPositionedItem) r11
            int r11 = r11.getIndex()
            r12 = r28
            if (r12 > r11) goto L_0x0414
            if (r11 > r10) goto L_0x0414
            r11 = r0
            java.util.Collection r11 = (java.util.Collection) r11
            r11.add(r4)
        L_0x0414:
            int r15 = r15 + 1
            r28 = r12
            goto L_0x03fb
        L_0x0419:
            java.util.List r0 = (java.util.List) r0
            r10 = r0
        L_0x041c:
            if (r45 == 0) goto L_0x0421
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.Vertical
            goto L_0x0423
        L_0x0421:
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.Horizontal
        L_0x0423:
            r11 = r0
            androidx.compose.foundation.lazy.grid.LazyGridMeasureResult r14 = new androidx.compose.foundation.lazy.grid.LazyGridMeasureResult
            r0 = r14
            r2 = r3
            r3 = r6
            r4 = r8
            r5 = r7
            r6 = r10
            r7 = r25
            r8 = r29
            r9 = r32
            r10 = r48
            r12 = r38
            r13 = r39
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r14
        L_0x043c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r17.toString()
            r0.<init>(r1)
            throw r0
        L_0x0446:
            r17 = r8
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r17.toString()
            r0.<init>(r1)
            throw r0
        L_0x0452:
            r17 = r8
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r17.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridMeasureKt.m699measureLazyGridt5wl_D8(int, androidx.compose.foundation.lazy.grid.LazyGridItemProvider, androidx.compose.foundation.lazy.grid.LazyMeasuredLineProvider, androidx.compose.foundation.lazy.grid.LazyMeasuredItemProvider, int, int, int, int, int, int, float, long, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, boolean, androidx.compose.ui.unit.Density, androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator, androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider, androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList, kotlin.jvm.functions.Function3):androidx.compose.foundation.lazy.grid.LazyGridMeasureResult");
    }

    private static final List<LazyGridMeasuredItem> calculateExtraItems(LazyLayoutPinnedItemList lazyLayoutPinnedItemList, LazyMeasuredItemProvider lazyMeasuredItemProvider, LazyGridItemProvider lazyGridItemProvider, Function1<? super ItemIndex, Constraints> function1, Function1<? super Integer, Boolean> function12) {
        List list = lazyLayoutPinnedItemList;
        int size = list.size();
        List<LazyGridMeasuredItem> list2 = null;
        for (int i = 0; i < size; i++) {
            LazyLayoutPinnedItemList.PinnedItem pinnedItem = (LazyLayoutPinnedItemList.PinnedItem) list.get(i);
            int findIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(lazyGridItemProvider, pinnedItem.getKey(), pinnedItem.getIndex());
            if (function12.invoke(Integer.valueOf(findIndexByKey)).booleanValue()) {
                int r8 = ItemIndex.m667constructorimpl(findIndexByKey);
                LazyGridMeasuredItem r4 = LazyMeasuredItemProvider.m714getAndMeasureednRnyU$default(lazyMeasuredItemProvider, r8, 0, function1.invoke(ItemIndex.m665boximpl(r8)).m5576unboximpl(), 2, (Object) null);
                if (list2 == null) {
                    list2 = new ArrayList<>();
                }
                list2.add(r4);
            } else {
                Function1<? super ItemIndex, Constraints> function13 = function1;
            }
        }
        return list2 == null ? CollectionsKt.emptyList() : list2;
    }

    private static final List<LazyGridPositionedItem> calculateItemsOffsets(List<LazyGridMeasuredLine> list, List<LazyGridMeasuredItem> list2, List<LazyGridMeasuredItem> list3, int i, int i2, int i3, int i4, int i5, boolean z, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z2, Density density) {
        List<LazyGridMeasuredLine> list4 = list;
        int i6 = i;
        int i7 = i2;
        Arrangement.Vertical vertical2 = vertical;
        boolean z3 = z2;
        int i8 = i4;
        int i9 = z ? i7 : i6;
        boolean z4 = i3 < Math.min(i9, i8);
        if (!z4 || i5 == 0) {
            int size = list.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                i10 += list.get(i11).getItems().length;
            }
            ArrayList arrayList = new ArrayList(i10);
            if (!z4) {
                int size2 = list2.size();
                int i12 = i5;
                for (int i13 = 0; i13 < size2; i13++) {
                    List<LazyGridMeasuredItem> list5 = list2;
                    LazyGridMeasuredItem lazyGridMeasuredItem = list2.get(i13);
                    i12 -= lazyGridMeasuredItem.getMainAxisSizeWithSpacings();
                    arrayList.add(positionExtraItem(lazyGridMeasuredItem, i12, i6, i7));
                }
                int size3 = list.size();
                int i14 = i5;
                for (int i15 = 0; i15 < size3; i15++) {
                    LazyGridMeasuredLine lazyGridMeasuredLine = list.get(i15);
                    arrayList.addAll(lazyGridMeasuredLine.position(i14, i6, i7));
                    i14 += lazyGridMeasuredLine.getMainAxisSizeWithSpacings();
                }
                int size4 = list3.size();
                for (int i16 = 0; i16 < size4; i16++) {
                    LazyGridMeasuredItem lazyGridMeasuredItem2 = list3.get(i16);
                    arrayList.add(positionExtraItem(lazyGridMeasuredItem2, i14, i6, i7));
                    i14 += lazyGridMeasuredItem2.getMainAxisSizeWithSpacings();
                }
            } else if (!list2.isEmpty() || !list3.isEmpty()) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            } else {
                int size5 = list.size();
                int[] iArr = new int[size5];
                for (int i17 = 0; i17 < size5; i17++) {
                    iArr[i17] = list.get(calculateItemsOffsets$reverseAware(i17, z3, size5)).getMainAxisSize();
                }
                int[] iArr2 = new int[size5];
                for (int i18 = 0; i18 < size5; i18++) {
                    iArr2[i18] = 0;
                }
                if (!z) {
                    Density density2 = density;
                    if (horizontal != null) {
                        horizontal.arrange(density, i9, iArr, LayoutDirection.Ltr, iArr2);
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } else if (vertical2 != null) {
                    vertical2.arrange(density, i9, iArr, iArr2);
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                IntProgression indices = ArraysKt.getIndices(iArr2);
                if (z3) {
                    indices = RangesKt.reversed(indices);
                }
                int first = indices.getFirst();
                int last = indices.getLast();
                int step = indices.getStep();
                if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                    while (true) {
                        int i19 = iArr2[first];
                        LazyGridMeasuredLine lazyGridMeasuredLine2 = list.get(calculateItemsOffsets$reverseAware(first, z3, size5));
                        if (z3) {
                            i19 = (i9 - i19) - lazyGridMeasuredLine2.getMainAxisSize();
                        }
                        arrayList.addAll(lazyGridMeasuredLine2.position(i19, i6, i7));
                        if (first == last) {
                            break;
                        }
                        first += step;
                    }
                }
            }
            return arrayList;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private static final LazyGridPositionedItem positionExtraItem(LazyGridMeasuredItem lazyGridMeasuredItem, int i, int i2, int i3) {
        return lazyGridMeasuredItem.position(i, 0, i2, i3, 0, 0);
    }
}
