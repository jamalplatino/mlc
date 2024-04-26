package androidx.compose.foundation.lazy;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\u001aF\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0000¨\u0006\f"}, d2 = {"findOrComposeLazyListHeader", "Landroidx/compose/foundation/lazy/LazyListPositionedItem;", "composedVisibleItems", "", "itemProvider", "Landroidx/compose/foundation/lazy/LazyMeasuredItemProvider;", "headerIndexes", "", "", "beforeContentPadding", "layoutWidth", "layoutHeight", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: LazyListHeaders.kt */
public final class LazyListHeadersKt {
    public static final LazyListPositionedItem findOrComposeLazyListHeader(List<LazyListPositionedItem> list, LazyMeasuredItemProvider lazyMeasuredItemProvider, List<Integer> list2, int i, int i2, int i3) {
        List<LazyListPositionedItem> list3 = list;
        LazyMeasuredItemProvider lazyMeasuredItemProvider2 = lazyMeasuredItemProvider;
        List<Integer> list4 = list2;
        int i4 = i;
        Intrinsics.checkNotNullParameter(list, "composedVisibleItems");
        Intrinsics.checkNotNullParameter(lazyMeasuredItemProvider2, "itemProvider");
        Intrinsics.checkNotNullParameter(list4, "headerIndexes");
        int index = ((LazyListPositionedItem) CollectionsKt.first(list)).getIndex();
        int size = list2.size();
        int i5 = -1;
        int i6 = -1;
        int i7 = 0;
        while (i7 < size && list4.get(i7).intValue() <= index) {
            i5 = list4.get(i7).intValue();
            i7++;
            i6 = ((i7 < 0 || i7 > CollectionsKt.getLastIndex(list2)) ? -1 : list4.get(i7)).intValue();
        }
        int size2 = list.size();
        int i8 = Integer.MIN_VALUE;
        int i9 = Integer.MIN_VALUE;
        int i10 = -1;
        for (int i11 = 0; i11 < size2; i11++) {
            LazyListPositionedItem lazyListPositionedItem = list.get(i11);
            if (lazyListPositionedItem.getIndex() == i5) {
                i8 = lazyListPositionedItem.getOffset();
                i10 = i11;
            } else if (lazyListPositionedItem.getIndex() == i6) {
                i9 = lazyListPositionedItem.getOffset();
            }
        }
        if (i5 == -1) {
            return null;
        }
        LazyMeasuredItem r1 = lazyMeasuredItemProvider2.m650getAndMeasureZjPyQlc(DataIndex.m616constructorimpl(i5));
        int max = i8 != Integer.MIN_VALUE ? Math.max(-i4, i8) : -i4;
        if (i9 != Integer.MIN_VALUE) {
            max = Math.min(max, i9 - r1.getSize());
        }
        LazyListPositionedItem position = r1.position(max, i2, i3);
        if (i10 != -1) {
            list.set(i10, position);
        } else {
            list.add(0, position);
        }
        return position;
    }
}
