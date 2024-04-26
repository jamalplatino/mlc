package androidx.compose.foundation.lazy;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001bH\u0002\u001aL\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\b2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020'H\u0002\u001aS\u0010(\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020*2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020'H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010,\u001aø\u0001\u0010-\u001a\u00020.2\u0006\u0010$\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020#2\u0006\u0010 \u001a\u00020!2\u0006\u0010/\u001a\u00020\u00022\u0006\u00100\u001a\u00020\u00022\u0006\u00101\u001a\u00020\u00022\u0006\u00102\u001a\u00020\u00022\u0006\u00103\u001a\u00020*2\u0006\u00104\u001a\u00020\u00022\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u0010\u0014\u001a\u00020\u00042\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010:\u001a\u00020;2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020'2/\u0010<\u001a+\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020@0>¢\u0006\u0002\bA\u0012\u0004\u0012\u00020B0=H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bC\u0010D\"\u001a\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001X\u0004¢\u0006\u0002\n\u0000\"\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00028BX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006E"}, d2 = {"EmptyRange", "Lkotlin/Pair;", "", "notInEmptyRange", "", "getNotInEmptyRange", "(I)Z", "calculateItemsOffsets", "", "Landroidx/compose/foundation/lazy/LazyListPositionedItem;", "items", "", "Landroidx/compose/foundation/lazy/LazyMeasuredItem;", "extraItemsBefore", "extraItemsAfter", "layoutWidth", "layoutHeight", "finalMainAxisOffset", "maxOffset", "itemsScrollOffset", "isVertical", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "reverseLayout", "density", "Landroidx/compose/ui/unit/Density;", "createItemsAfterList", "beyondBoundsInfo", "Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;", "visibleItems", "measuredItemProvider", "Landroidx/compose/foundation/lazy/LazyMeasuredItemProvider;", "itemProvider", "Landroidx/compose/foundation/lazy/LazyListItemProvider;", "itemsCount", "beyondBoundsItemCount", "pinnedItems", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "createItemsBeforeList", "currentFirstItemIndex", "Landroidx/compose/foundation/lazy/DataIndex;", "createItemsBeforeList-tv8sHfA", "(Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;ILandroidx/compose/foundation/lazy/LazyMeasuredItemProvider;Landroidx/compose/foundation/lazy/LazyListItemProvider;IILandroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;)Ljava/util/List;", "measureLazyList", "Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenItems", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "scrollToBeConsumed", "", "constraints", "Landroidx/compose/ui/unit/Constraints;", "headerIndexes", "placementAnimator", "Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;", "layout", "Lkotlin/Function3;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/ui/layout/MeasureResult;", "measureLazyList-Hh3qtAg", "(ILandroidx/compose/foundation/lazy/LazyListItemProvider;Landroidx/compose/foundation/lazy/LazyMeasuredItemProvider;IIIIIIFJZLjava/util/List;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;ILandroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: LazyListMeasure.kt */
public final class LazyListMeasureKt {
    private static final Pair<Integer, Integer> EmptyRange = TuplesKt.to(Integer.MIN_VALUE, Integer.MIN_VALUE);

    private static final int calculateItemsOffsets$reverseAware(int i, boolean z, int i2) {
        return !z ? i : (i2 - i) - 1;
    }

    private static final boolean getNotInEmptyRange(int i) {
        return i != Integer.MIN_VALUE;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:75:0x022f, code lost:
        r17 = r5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x032e  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0330  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0378  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x037b  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0394  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01ec  */
    /* renamed from: measureLazyList-Hh3qtAg  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.foundation.lazy.LazyListMeasureResult m639measureLazyListHh3qtAg(int r32, androidx.compose.foundation.lazy.LazyListItemProvider r33, androidx.compose.foundation.lazy.LazyMeasuredItemProvider r34, int r35, int r36, int r37, int r38, int r39, int r40, float r41, long r42, boolean r44, java.util.List<java.lang.Integer> r45, androidx.compose.foundation.layout.Arrangement.Vertical r46, androidx.compose.foundation.layout.Arrangement.Horizontal r47, boolean r48, androidx.compose.ui.unit.Density r49, androidx.compose.foundation.lazy.LazyListItemPlacementAnimator r50, androidx.compose.foundation.lazy.LazyListBeyondBoundsInfo r51, int r52, androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList r53, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super java.lang.Integer, ? super kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>, ? extends androidx.compose.ui.layout.MeasureResult> r54) {
        /*
            r9 = r32
            r7 = r34
            r8 = r35
            r15 = r36
            r10 = r42
            r14 = r45
            r13 = r54
            java.lang.String r0 = "itemProvider"
            r12 = r33
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "measuredItemProvider"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "headerIndexes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "density"
            r6 = r49
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "placementAnimator"
            r5 = r50
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "beyondBoundsInfo"
            r4 = r51
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "pinnedItems"
            r3 = r53
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "layout"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "Failed requirement."
            if (r15 < 0) goto L_0x03a8
            if (r37 < 0) goto L_0x039e
            if (r9 > 0) goto L_0x008a
            androidx.compose.foundation.lazy.LazyListMeasureResult r14 = new androidx.compose.foundation.lazy.LazyListMeasureResult
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            int r0 = androidx.compose.ui.unit.Constraints.m5572getMinWidthimpl(r42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r5 = androidx.compose.ui.unit.Constraints.m5571getMinHeightimpl(r42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$1 r6 = androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$1.INSTANCE
            java.lang.Object r0 = r13.invoke(r0, r5, r6)
            r5 = r0
            androidx.compose.ui.layout.MeasureResult r5 = (androidx.compose.ui.layout.MeasureResult) r5
            java.util.List r6 = kotlin.collections.CollectionsKt.emptyList()
            int r7 = -r15
            int r8 = r8 + r37
            r9 = 0
            if (r44 == 0) goto L_0x007c
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.Vertical
            goto L_0x007e
        L_0x007c:
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.Horizontal
        L_0x007e:
            r11 = r0
            r0 = r14
            r10 = r48
            r12 = r37
            r13 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r14
        L_0x008a:
            r2 = 0
            r1 = r39
            if (r1 < r9) goto L_0x0098
            int r1 = r9 + -1
            int r1 = androidx.compose.foundation.lazy.DataIndex.m616constructorimpl(r1)
            r16 = r2
            goto L_0x009a
        L_0x0098:
            r16 = r40
        L_0x009a:
            int r17 = kotlin.math.MathKt.roundToInt((float) r41)
            int r16 = r16 - r17
            int r3 = androidx.compose.foundation.lazy.DataIndex.m616constructorimpl(r2)
            boolean r3 = androidx.compose.foundation.lazy.DataIndex.m619equalsimpl0(r1, r3)
            if (r3 == 0) goto L_0x00b0
            if (r16 >= 0) goto L_0x00b0
            int r17 = r17 + r16
            r16 = r2
        L_0x00b0:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.List r3 = (java.util.List) r3
            int r2 = -r15
            if (r38 >= 0) goto L_0x00bf
            r19 = r38
            r20 = r1
            goto L_0x00c3
        L_0x00bf:
            r20 = r1
            r19 = 0
        L_0x00c3:
            int r1 = r2 + r19
            int r16 = r16 + r1
            r4 = 0
            r31 = r16
            r16 = r2
            r2 = r31
        L_0x00ce:
            if (r2 >= 0) goto L_0x00ff
            r39 = 0
            int r18 = androidx.compose.foundation.lazy.DataIndex.m616constructorimpl(r39)
            int r18 = r20 - r18
            if (r18 <= 0) goto L_0x00ff
            int r20 = r20 + -1
            int r5 = androidx.compose.foundation.lazy.DataIndex.m616constructorimpl(r20)
            androidx.compose.foundation.lazy.LazyMeasuredItem r6 = r7.m650getAndMeasureZjPyQlc(r5)
            r40 = r5
            r5 = r39
            r3.add(r5, r6)
            int r5 = r6.getCrossAxisSize()
            int r4 = java.lang.Math.max(r4, r5)
            int r5 = r6.getSizeWithSpacings()
            int r2 = r2 + r5
            r20 = r40
            r6 = r49
            r5 = r50
            goto L_0x00ce
        L_0x00ff:
            if (r2 >= r1) goto L_0x0104
            int r17 = r17 + r2
            r2 = r1
        L_0x0104:
            int r2 = r2 - r1
            int r6 = r8 + r37
            r19 = r4
            r5 = 0
            int r4 = kotlin.ranges.RangesKt.coerceAtLeast((int) r6, (int) r5)
            int r5 = -r2
            r39 = r2
            int r2 = r3.size()
            r21 = r5
            r22 = r20
            r5 = 0
        L_0x011a:
            if (r5 >= r2) goto L_0x0131
            java.lang.Object r23 = r3.get(r5)
            androidx.compose.foundation.lazy.LazyMeasuredItem r23 = (androidx.compose.foundation.lazy.LazyMeasuredItem) r23
            int r22 = r22 + 1
            int r22 = androidx.compose.foundation.lazy.DataIndex.m616constructorimpl(r22)
            int r23 = r23.getSizeWithSpacings()
            int r21 = r21 + r23
            int r5 = r5 + 1
            goto L_0x011a
        L_0x0131:
            r2 = r39
            r39 = r6
            r5 = r19
            r6 = r21
            r14 = r22
        L_0x013b:
            if (r14 >= r9) goto L_0x0182
            if (r6 < r4) goto L_0x0147
            if (r6 <= 0) goto L_0x0147
            boolean r19 = r3.isEmpty()
            if (r19 == 0) goto L_0x0182
        L_0x0147:
            r40 = r4
            androidx.compose.foundation.lazy.LazyMeasuredItem r4 = r7.m650getAndMeasureZjPyQlc(r14)
            int r19 = r4.getSizeWithSpacings()
            int r6 = r6 + r19
            if (r6 > r1) goto L_0x0169
            r19 = r1
            int r1 = r9 + -1
            if (r14 == r1) goto L_0x016b
            int r1 = r14 + 1
            int r1 = androidx.compose.foundation.lazy.DataIndex.m616constructorimpl(r1)
            int r4 = r4.getSizeWithSpacings()
            int r2 = r2 - r4
            r20 = r1
            goto L_0x0177
        L_0x0169:
            r19 = r1
        L_0x016b:
            int r1 = r4.getCrossAxisSize()
            int r1 = java.lang.Math.max(r5, r1)
            r3.add(r4)
            r5 = r1
        L_0x0177:
            int r14 = r14 + 1
            int r14 = androidx.compose.foundation.lazy.DataIndex.m616constructorimpl(r14)
            r4 = r40
            r1 = r19
            goto L_0x013b
        L_0x0182:
            if (r6 >= r8) goto L_0x01c3
            int r1 = r8 - r6
            int r2 = r2 - r1
            int r6 = r6 + r1
        L_0x0188:
            if (r2 >= r15) goto L_0x01b4
            r4 = 0
            int r18 = androidx.compose.foundation.lazy.DataIndex.m616constructorimpl(r4)
            int r18 = r20 - r18
            if (r18 <= 0) goto L_0x01b4
            int r20 = r20 + -1
            int r12 = androidx.compose.foundation.lazy.DataIndex.m616constructorimpl(r20)
            androidx.compose.foundation.lazy.LazyMeasuredItem r13 = r7.m650getAndMeasureZjPyQlc(r12)
            r3.add(r4, r13)
            int r4 = r13.getCrossAxisSize()
            int r5 = java.lang.Math.max(r5, r4)
            int r4 = r13.getSizeWithSpacings()
            int r2 = r2 + r4
            r13 = r54
            r20 = r12
            r12 = r33
            goto L_0x0188
        L_0x01b4:
            int r17 = r17 + r1
            if (r2 >= 0) goto L_0x01c3
            int r17 = r17 + r2
            int r6 = r6 + r2
            r12 = r5
            r13 = r6
            r4 = r17
            r1 = r20
            r2 = 0
            goto L_0x01c9
        L_0x01c3:
            r12 = r5
            r13 = r6
            r4 = r17
            r1 = r20
        L_0x01c9:
            int r5 = kotlin.math.MathKt.roundToInt((float) r41)
            int r5 = kotlin.math.MathKt.getSign((int) r5)
            int r6 = kotlin.math.MathKt.getSign((int) r4)
            if (r5 != r6) goto L_0x01e8
            int r5 = kotlin.math.MathKt.roundToInt((float) r41)
            int r5 = java.lang.Math.abs(r5)
            int r6 = java.lang.Math.abs(r4)
            if (r5 < r6) goto L_0x01e8
            float r4 = (float) r4
            r6 = r4
            goto L_0x01ea
        L_0x01e8:
            r6 = r41
        L_0x01ea:
            if (r2 < 0) goto L_0x0394
            int r5 = -r2
            java.lang.Object r0 = kotlin.collections.CollectionsKt.first(r3)
            androidx.compose.foundation.lazy.LazyMeasuredItem r0 = (androidx.compose.foundation.lazy.LazyMeasuredItem) r0
            if (r15 > 0) goto L_0x01fe
            if (r38 >= 0) goto L_0x01f8
            goto L_0x01fe
        L_0x01f8:
            r23 = r2
            r17 = r5
            r5 = r0
            goto L_0x0235
        L_0x01fe:
            int r4 = r3.size()
            r40 = r0
            r0 = 0
        L_0x0205:
            if (r0 >= r4) goto L_0x022f
            java.lang.Object r17 = r3.get(r0)
            androidx.compose.foundation.lazy.LazyMeasuredItem r17 = (androidx.compose.foundation.lazy.LazyMeasuredItem) r17
            r41 = r4
            int r4 = r17.getSizeWithSpacings()
            if (r2 == 0) goto L_0x022f
            if (r4 > r2) goto L_0x022f
            r17 = r5
            int r5 = kotlin.collections.CollectionsKt.getLastIndex(r3)
            if (r0 == r5) goto L_0x0231
            int r2 = r2 - r4
            int r0 = r0 + 1
            java.lang.Object r4 = r3.get(r0)
            androidx.compose.foundation.lazy.LazyMeasuredItem r4 = (androidx.compose.foundation.lazy.LazyMeasuredItem) r4
            r40 = r4
            r5 = r17
            r4 = r41
            goto L_0x0205
        L_0x022f:
            r17 = r5
        L_0x0231:
            r5 = r40
            r23 = r2
        L_0x0235:
            r0 = r51
            r25 = r16
            r24 = 0
            r2 = r34
            r26 = r3
            r3 = r33
            r4 = r32
            r7 = r5
            r5 = r52
            r27 = r39
            r8 = r6
            r6 = r53
            java.util.List r6 = m638createItemsBeforeListtv8sHfA(r0, r1, r2, r3, r4, r5, r6)
            int r0 = r6.size()
            r2 = r24
        L_0x0255:
            if (r2 >= r0) goto L_0x0268
            java.lang.Object r1 = r6.get(r2)
            androidx.compose.foundation.lazy.LazyMeasuredItem r1 = (androidx.compose.foundation.lazy.LazyMeasuredItem) r1
            int r1 = r1.getCrossAxisSize()
            int r12 = java.lang.Math.max(r12, r1)
            int r2 = r2 + 1
            goto L_0x0255
        L_0x0268:
            r0 = r51
            r1 = r26
            r2 = r34
            r3 = r33
            r4 = r32
            r5 = r52
            r16 = r6
            r6 = r53
            java.util.List r0 = createItemsAfterList(r0, r1, r2, r3, r4, r5, r6)
            int r1 = r0.size()
            r2 = r24
        L_0x0282:
            if (r2 >= r1) goto L_0x0295
            java.lang.Object r3 = r0.get(r2)
            androidx.compose.foundation.lazy.LazyMeasuredItem r3 = (androidx.compose.foundation.lazy.LazyMeasuredItem) r3
            int r3 = r3.getCrossAxisSize()
            int r12 = java.lang.Math.max(r12, r3)
            int r2 = r2 + 1
            goto L_0x0282
        L_0x0295:
            java.lang.Object r1 = kotlin.collections.CollectionsKt.first(r26)
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r1)
            r6 = 1
            if (r1 == 0) goto L_0x02af
            boolean r1 = r16.isEmpty()
            if (r1 == 0) goto L_0x02af
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x02af
            r28 = r6
            goto L_0x02b1
        L_0x02af:
            r28 = r24
        L_0x02b1:
            if (r44 == 0) goto L_0x02b5
            r1 = r12
            goto L_0x02b6
        L_0x02b5:
            r1 = r13
        L_0x02b6:
            int r29 = androidx.compose.ui.unit.ConstraintsKt.m5584constrainWidthK40F9xA(r10, r1)
            if (r44 == 0) goto L_0x02bd
            r12 = r13
        L_0x02bd:
            int r30 = androidx.compose.ui.unit.ConstraintsKt.m5583constrainHeightK40F9xA(r10, r12)
            r10 = r26
            r11 = r16
            r12 = r0
            r5 = r54
            r4 = r13
            r13 = r29
            r3 = r14
            r14 = r30
            r15 = r4
            r16 = r35
            r18 = r44
            r19 = r46
            r20 = r47
            r21 = r48
            r22 = r49
            java.util.List r10 = calculateItemsOffsets(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            int r1 = (int) r8
            r0 = r50
            r2 = r29
            r14 = r3
            r3 = r30
            r11 = r4
            r4 = r10
            r12 = r5
            r5 = r34
            r0.onMeasured(r1, r2, r3, r4, r5)
            r0 = r45
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r6
            if (r0 == 0) goto L_0x030a
            r0 = r10
            r1 = r34
            r2 = r45
            r3 = r36
            r4 = r29
            r5 = r30
            androidx.compose.foundation.lazy.LazyListPositionedItem r0 = androidx.compose.foundation.lazy.LazyListHeadersKt.findOrComposeLazyListHeader(r0, r1, r2, r3, r4, r5)
            goto L_0x030b
        L_0x030a:
            r0 = 0
        L_0x030b:
            if (r14 < r9) goto L_0x0316
            r1 = r35
            r4 = r8
            if (r11 <= r1) goto L_0x0313
            goto L_0x0317
        L_0x0313:
            r3 = r24
            goto L_0x0318
        L_0x0316:
            r4 = r8
        L_0x0317:
            r3 = r6
        L_0x0318:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r29)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r30)
            androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$5 r5 = new androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$5
            r5.<init>(r10, r0)
            java.lang.Object r1 = r12.invoke(r1, r2, r5)
            r5 = r1
            androidx.compose.ui.layout.MeasureResult r5 = (androidx.compose.ui.layout.MeasureResult) r5
            if (r28 == 0) goto L_0x0330
            r6 = r10
            goto L_0x0376
        L_0x0330:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r10.size()
            r1.<init>(r2)
            int r2 = r10.size()
            r6 = r24
        L_0x033f:
            if (r6 >= r2) goto L_0x0373
            java.lang.Object r8 = r10.get(r6)
            r11 = r8
            androidx.compose.foundation.lazy.LazyListPositionedItem r11 = (androidx.compose.foundation.lazy.LazyListPositionedItem) r11
            int r12 = r11.getIndex()
            java.lang.Object r13 = kotlin.collections.CollectionsKt.first(r26)
            androidx.compose.foundation.lazy.LazyMeasuredItem r13 = (androidx.compose.foundation.lazy.LazyMeasuredItem) r13
            int r13 = r13.getIndex()
            if (r12 < r13) goto L_0x0368
            int r12 = r11.getIndex()
            java.lang.Object r13 = kotlin.collections.CollectionsKt.last(r26)
            androidx.compose.foundation.lazy.LazyMeasuredItem r13 = (androidx.compose.foundation.lazy.LazyMeasuredItem) r13
            int r13 = r13.getIndex()
            if (r12 <= r13) goto L_0x036a
        L_0x0368:
            if (r11 != r0) goto L_0x0370
        L_0x036a:
            r11 = r1
            java.util.Collection r11 = (java.util.Collection) r11
            r11.add(r8)
        L_0x0370:
            int r6 = r6 + 1
            goto L_0x033f
        L_0x0373:
            java.util.List r1 = (java.util.List) r1
            r6 = r1
        L_0x0376:
            if (r44 == 0) goto L_0x037b
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.Vertical
            goto L_0x037d
        L_0x037b:
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.Horizontal
        L_0x037d:
            r11 = r0
            androidx.compose.foundation.lazy.LazyListMeasureResult r14 = new androidx.compose.foundation.lazy.LazyListMeasureResult
            r0 = r14
            r1 = r7
            r2 = r23
            r7 = r25
            r8 = r27
            r9 = r32
            r10 = r48
            r12 = r37
            r13 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r14
        L_0x0394:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x039e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x03a8:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListMeasureKt.m639measureLazyListHh3qtAg(int, androidx.compose.foundation.lazy.LazyListItemProvider, androidx.compose.foundation.lazy.LazyMeasuredItemProvider, int, int, int, int, int, int, float, long, boolean, java.util.List, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, boolean, androidx.compose.ui.unit.Density, androidx.compose.foundation.lazy.LazyListItemPlacementAnimator, androidx.compose.foundation.lazy.LazyListBeyondBoundsInfo, int, androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList, kotlin.jvm.functions.Function3):androidx.compose.foundation.lazy.LazyListMeasureResult");
    }

    private static final int createItemsAfterList$endIndex(LazyListBeyondBoundsInfo lazyListBeyondBoundsInfo, int i) {
        return Math.min(lazyListBeyondBoundsInfo.getEnd(), i - 1);
    }

    private static final List<LazyMeasuredItem> createItemsAfterList(LazyListBeyondBoundsInfo lazyListBeyondBoundsInfo, List<LazyMeasuredItem> list, LazyMeasuredItemProvider lazyMeasuredItemProvider, LazyListItemProvider lazyListItemProvider, int i, int i2, LazyLayoutPinnedItemList lazyLayoutPinnedItemList) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        int index = ((LazyMeasuredItem) CollectionsKt.last(list)).getIndex();
        if (lazyListBeyondBoundsInfo.hasIntervals()) {
            index = Math.max(createItemsAfterList$endIndex(lazyListBeyondBoundsInfo, i), index);
        }
        int min = Math.min(index + i2, i - 1);
        int index2 = ((LazyMeasuredItem) CollectionsKt.last(list)).getIndex() + 1;
        if (index2 <= min) {
            while (true) {
                createItemsAfterList$addItem(objectRef, lazyMeasuredItemProvider, index2);
                if (index2 == min) {
                    break;
                }
                index2++;
            }
        }
        List list2 = lazyLayoutPinnedItemList;
        int size = list2.size();
        for (int i3 = 0; i3 < size; i3++) {
            LazyLayoutPinnedItemList.PinnedItem pinnedItem = (LazyLayoutPinnedItemList.PinnedItem) list2.get(i3);
            int findIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(lazyListItemProvider, pinnedItem.getKey(), pinnedItem.getIndex());
            if (findIndexByKey > min && findIndexByKey < i) {
                createItemsAfterList$addItem(objectRef, lazyMeasuredItemProvider, findIndexByKey);
            }
        }
        List<LazyMeasuredItem> list3 = (List) objectRef.element;
        return list3 == null ? CollectionsKt.emptyList() : list3;
    }

    private static final void createItemsAfterList$addItem(Ref.ObjectRef<List<LazyMeasuredItem>> objectRef, LazyMeasuredItemProvider lazyMeasuredItemProvider, int i) {
        if (objectRef.element == null) {
            objectRef.element = (List) new ArrayList();
        }
        T t = objectRef.element;
        if (t != null) {
            ((List) t).add(lazyMeasuredItemProvider.m650getAndMeasureZjPyQlc(DataIndex.m616constructorimpl(i)));
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    private static final int createItemsBeforeList_tv8sHfA$startIndex(LazyListBeyondBoundsInfo lazyListBeyondBoundsInfo, int i) {
        return Math.min(lazyListBeyondBoundsInfo.getStart(), i - 1);
    }

    /* renamed from: createItemsBeforeList-tv8sHfA  reason: not valid java name */
    private static final List<LazyMeasuredItem> m638createItemsBeforeListtv8sHfA(LazyListBeyondBoundsInfo lazyListBeyondBoundsInfo, int i, LazyMeasuredItemProvider lazyMeasuredItemProvider, LazyListItemProvider lazyListItemProvider, int i2, int i3, LazyLayoutPinnedItemList lazyLayoutPinnedItemList) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        int min = lazyListBeyondBoundsInfo.hasIntervals() ? Math.min(createItemsBeforeList_tv8sHfA$startIndex(lazyListBeyondBoundsInfo, i2), i) : i;
        int max = Math.max(0, min - i3);
        int i4 = i - 1;
        if (max <= i4) {
            while (true) {
                createItemsBeforeList_tv8sHfA$addItem$5(objectRef, lazyMeasuredItemProvider, i4);
                if (i4 == max) {
                    break;
                }
                i4--;
            }
        }
        List list = lazyLayoutPinnedItemList;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            LazyLayoutPinnedItemList.PinnedItem pinnedItem = (LazyLayoutPinnedItemList.PinnedItem) list.get(i5);
            int findIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(lazyListItemProvider, pinnedItem.getKey(), pinnedItem.getIndex());
            if (findIndexByKey < max) {
                createItemsBeforeList_tv8sHfA$addItem$5(objectRef, lazyMeasuredItemProvider, findIndexByKey);
            }
        }
        List<LazyMeasuredItem> list2 = (List) objectRef.element;
        return list2 == null ? CollectionsKt.emptyList() : list2;
    }

    private static final void createItemsBeforeList_tv8sHfA$addItem$5(Ref.ObjectRef<List<LazyMeasuredItem>> objectRef, LazyMeasuredItemProvider lazyMeasuredItemProvider, int i) {
        if (objectRef.element == null) {
            objectRef.element = (List) new ArrayList();
        }
        T t = objectRef.element;
        if (t != null) {
            ((List) t).add(lazyMeasuredItemProvider.m650getAndMeasureZjPyQlc(DataIndex.m616constructorimpl(i)));
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    private static final List<LazyListPositionedItem> calculateItemsOffsets(List<LazyMeasuredItem> list, List<LazyMeasuredItem> list2, List<LazyMeasuredItem> list3, int i, int i2, int i3, int i4, int i5, boolean z, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z2, Density density) {
        List<LazyMeasuredItem> list4 = list;
        int i6 = i;
        int i7 = i2;
        Arrangement.Vertical vertical2 = vertical;
        boolean z3 = z2;
        int i8 = i4;
        int i9 = z ? i7 : i6;
        boolean z4 = i3 < Math.min(i9, i8);
        if (!z4 || i5 == 0) {
            ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
            if (!z4) {
                int size = list2.size();
                int i10 = i5;
                for (int i11 = 0; i11 < size; i11++) {
                    List<LazyMeasuredItem> list5 = list2;
                    LazyMeasuredItem lazyMeasuredItem = list2.get(i11);
                    i10 -= lazyMeasuredItem.getSizeWithSpacings();
                    arrayList.add(lazyMeasuredItem.position(i10, i6, i7));
                }
                int size2 = list.size();
                int i12 = i5;
                for (int i13 = 0; i13 < size2; i13++) {
                    LazyMeasuredItem lazyMeasuredItem2 = list.get(i13);
                    arrayList.add(lazyMeasuredItem2.position(i12, i6, i7));
                    i12 += lazyMeasuredItem2.getSizeWithSpacings();
                }
                int size3 = list3.size();
                for (int i14 = 0; i14 < size3; i14++) {
                    LazyMeasuredItem lazyMeasuredItem3 = list3.get(i14);
                    arrayList.add(lazyMeasuredItem3.position(i12, i6, i7));
                    i12 += lazyMeasuredItem3.getSizeWithSpacings();
                }
            } else if (!list2.isEmpty() || !list3.isEmpty()) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            } else {
                int size4 = list.size();
                int[] iArr = new int[size4];
                for (int i15 = 0; i15 < size4; i15++) {
                    iArr[i15] = list.get(calculateItemsOffsets$reverseAware(i15, z3, size4)).getSize();
                }
                int[] iArr2 = new int[size4];
                for (int i16 = 0; i16 < size4; i16++) {
                    iArr2[i16] = 0;
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
                        int i17 = iArr2[first];
                        LazyMeasuredItem lazyMeasuredItem4 = list.get(calculateItemsOffsets$reverseAware(first, z3, size4));
                        if (z3) {
                            i17 = (i9 - i17) - lazyMeasuredItem4.getSize();
                        }
                        arrayList.add(lazyMeasuredItem4.position(i17, i6, i7));
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
}
