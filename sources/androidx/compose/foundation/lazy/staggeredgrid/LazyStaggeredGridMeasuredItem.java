package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ&\u0010!\u001a\u00020\"2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0003R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0012\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0010R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0010¨\u0006&"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "", "index", "", "key", "placeables", "", "Landroidx/compose/ui/layout/Placeable;", "isVertical", "", "spacing", "lane", "span", "(ILjava/lang/Object;Ljava/util/List;ZIII)V", "crossAxisSize", "getCrossAxisSize", "()I", "getIndex", "()Z", "isVisible", "setVisible", "(Z)V", "getKey", "()Ljava/lang/Object;", "getLane", "mainAxisSize", "getMainAxisSize", "getPlaceables", "()Ljava/util/List;", "sizeWithSpacings", "getSizeWithSpacings", "getSpacing", "getSpan", "position", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridPositionedItem;", "mainAxis", "crossAxis", "mainAxisLayoutSize", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: LazyStaggeredGridMeasure.kt */
final class LazyStaggeredGridMeasuredItem {
    private final int crossAxisSize;
    private final int index;
    private final boolean isVertical;
    private boolean isVisible = true;
    private final Object key;
    private final int lane;
    private final int mainAxisSize;
    private final List<Placeable> placeables;
    private final int sizeWithSpacings;
    private final int spacing;
    private final int span;

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    public final int getIndex() {
        return this.index;
    }

    public final Object getKey() {
        return this.key;
    }

    public final int getLane() {
        return this.lane;
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    public final List<Placeable> getPlaceables() {
        return this.placeables;
    }

    public final int getSizeWithSpacings() {
        return this.sizeWithSpacings;
    }

    public final int getSpacing() {
        return this.spacing;
    }

    public final int getSpan() {
        return this.span;
    }

    public final boolean isVertical() {
        return this.isVertical;
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public final void setVisible(boolean z) {
        this.isVisible = z;
    }

    public LazyStaggeredGridMeasuredItem(int i, Object obj, List<? extends Placeable> list, boolean z, int i2, int i3, int i4) {
        Comparable comparable;
        int i5;
        int i6;
        int i7;
        Intrinsics.checkNotNullParameter(obj, "key");
        Intrinsics.checkNotNullParameter(list, "placeables");
        this.index = i;
        this.key = obj;
        this.placeables = list;
        this.isVertical = z;
        this.spacing = i2;
        this.lane = i3;
        this.span = i4;
        int i8 = 1;
        int i9 = 0;
        int i10 = 0;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            Placeable placeable = (Placeable) list.get(i11);
            int intValue = i10.intValue();
            if (this.isVertical) {
                i7 = placeable.getHeight();
            } else {
                i7 = placeable.getWidth();
            }
            i10 = Integer.valueOf(intValue + i7);
        }
        int intValue2 = i10.intValue();
        this.mainAxisSize = intValue2;
        this.sizeWithSpacings = RangesKt.coerceAtLeast(intValue2 + this.spacing, 0);
        List<Placeable> list2 = this.placeables;
        if (list2.isEmpty()) {
            comparable = null;
        } else {
            Placeable placeable2 = list2.get(0);
            if (this.isVertical) {
                i5 = placeable2.getWidth();
            } else {
                i5 = placeable2.getHeight();
            }
            Comparable valueOf = Integer.valueOf(i5);
            int lastIndex = CollectionsKt.getLastIndex(list2);
            if (1 <= lastIndex) {
                while (true) {
                    Placeable placeable3 = list2.get(i8);
                    if (this.isVertical) {
                        i6 = placeable3.getWidth();
                    } else {
                        i6 = placeable3.getHeight();
                    }
                    Comparable valueOf2 = Integer.valueOf(i6);
                    valueOf = valueOf2.compareTo(valueOf) > 0 ? valueOf2 : valueOf;
                    if (i8 == lastIndex) {
                        break;
                    }
                    i8++;
                }
            }
            comparable = valueOf;
        }
        Integer num = (Integer) comparable;
        this.crossAxisSize = num != null ? num.intValue() : i9;
    }

    public final LazyStaggeredGridPositionedItem position(int i, int i2, int i3, int i4) {
        long j;
        long j2;
        if (this.isVertical) {
            j = IntOffsetKt.IntOffset(i3, i2);
        } else {
            int i5 = i2;
            int i6 = i3;
            j = IntOffsetKt.IntOffset(i2, i3);
        }
        long j3 = j;
        int i7 = this.index;
        Object obj = this.key;
        if (this.isVertical) {
            j2 = IntSizeKt.IntSize(this.crossAxisSize, this.sizeWithSpacings);
        } else {
            j2 = IntSizeKt.IntSize(this.sizeWithSpacings, this.crossAxisSize);
        }
        return new LazyStaggeredGridPositionedItem(j3, i7, i, obj, j2, this.placeables, this.isVertical, i4, (DefaultConstructorMarker) null);
    }
}
