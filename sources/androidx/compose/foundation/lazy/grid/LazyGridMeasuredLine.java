package androidx.compose.foundation.lazy.grid;

import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BT\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\rø\u0001\u0000¢\u0006\u0002\u0010\u0012J\u0006\u0010\u001d\u001a\u00020\u000bJ$\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\b2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\rR\u000e\u0010\u0011\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0019\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\u001b\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u000e\u0010\u0010\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "", "index", "Landroidx/compose/foundation/lazy/grid/LineIndex;", "items", "", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "spans", "", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "isVertical", "", "slotsPerLine", "", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "mainAxisSpacing", "crossAxisSpacing", "(I[Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;Ljava/util/List;ZILandroidx/compose/ui/unit/LayoutDirection;IILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getIndex-hA7yfN8", "()I", "I", "getItems", "()[Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "[Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "mainAxisSize", "getMainAxisSize", "mainAxisSizeWithSpacings", "getMainAxisSizeWithSpacings", "isEmpty", "position", "Landroidx/compose/foundation/lazy/grid/LazyGridPositionedItem;", "offset", "layoutWidth", "layoutHeight", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: LazyGridMeasuredLine.kt */
public final class LazyGridMeasuredLine {
    private final int crossAxisSpacing;
    private final int index;
    private final boolean isVertical;
    private final LazyGridMeasuredItem[] items;
    private final LayoutDirection layoutDirection;
    private final int mainAxisSize;
    private final int mainAxisSizeWithSpacings;
    private final int mainAxisSpacing;
    private final int slotsPerLine;
    private final List<GridItemSpan> spans;

    public /* synthetic */ LazyGridMeasuredLine(int i, LazyGridMeasuredItem[] lazyGridMeasuredItemArr, List list, boolean z, int i2, LayoutDirection layoutDirection2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, lazyGridMeasuredItemArr, list, z, i2, layoutDirection2, i3, i4);
    }

    /* renamed from: getIndex-hA7yfN8  reason: not valid java name */
    public final int m702getIndexhA7yfN8() {
        return this.index;
    }

    public final LazyGridMeasuredItem[] getItems() {
        return this.items;
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    public final int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    private LazyGridMeasuredLine(int i, LazyGridMeasuredItem[] lazyGridMeasuredItemArr, List<GridItemSpan> list, boolean z, int i2, LayoutDirection layoutDirection2, int i3, int i4) {
        this.index = i;
        this.items = lazyGridMeasuredItemArr;
        this.spans = list;
        this.isVertical = z;
        this.slotsPerLine = i2;
        this.layoutDirection = layoutDirection2;
        this.mainAxisSpacing = i3;
        this.crossAxisSpacing = i4;
        int i5 = 0;
        for (LazyGridMeasuredItem mainAxisSize2 : lazyGridMeasuredItemArr) {
            i5 = Math.max(i5, mainAxisSize2.getMainAxisSize());
        }
        this.mainAxisSize = i5;
        this.mainAxisSizeWithSpacings = RangesKt.coerceAtLeast(i5 + this.mainAxisSpacing, 0);
    }

    public final boolean isEmpty() {
        return this.items.length == 0;
    }

    public final List<LazyGridPositionedItem> position(int i, int i2, int i3) {
        LazyGridMeasuredItem[] lazyGridMeasuredItemArr = this.items;
        Collection arrayList = new ArrayList(lazyGridMeasuredItemArr.length);
        int length = lazyGridMeasuredItemArr.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i4 < length) {
            LazyGridMeasuredItem lazyGridMeasuredItem = lazyGridMeasuredItemArr[i4];
            int i8 = i5 + 1;
            int r5 = GridItemSpan.m661getCurrentLineSpanimpl(this.spans.get(i5).m664unboximpl());
            int i9 = this.layoutDirection == LayoutDirection.Rtl ? (this.slotsPerLine - i6) - r5 : i6;
            boolean z = this.isVertical;
            int i10 = z ? this.index : i9;
            if (!z) {
                i9 = this.index;
            }
            LazyGridPositionedItem position = lazyGridMeasuredItem.position(i, i7, i2, i3, i10, i9);
            i7 += lazyGridMeasuredItem.getCrossAxisSize() + this.crossAxisSpacing;
            i6 += r5;
            arrayList.add(position);
            i4++;
            i5 = i8;
        }
        return (List) arrayList;
    }
}
