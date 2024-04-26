package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001BN\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u0011J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#J\b\u0010$\u001a\u00020%H\u0016J.\u0010&\u001a\u00020\u0003*\u00020\u00032\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050(H\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u000e\u0010\u0010\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0002\u001a\u00020\u0003X\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\t\u001a\u00020\nX\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\u001b\u001a\u00020\u0005*\u00020\r8Â\u0002X\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridPositionedItem;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemInfo;", "offset", "Landroidx/compose/ui/unit/IntOffset;", "index", "", "lane", "key", "", "size", "Landroidx/compose/ui/unit/IntSize;", "placeables", "", "Landroidx/compose/ui/layout/Placeable;", "isVertical", "", "mainAxisLayoutSize", "(JIILjava/lang/Object;JLjava/util/List;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getIndex", "()I", "getKey", "()Ljava/lang/Object;", "getLane", "getOffset-nOcc-ac", "()J", "J", "getSize-YbymL2g", "mainAxisSize", "getMainAxisSize", "(Landroidx/compose/ui/layout/Placeable;)I", "place", "", "scope", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "context", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;", "toString", "", "copy", "mainAxisMap", "Lkotlin/Function1;", "copy-4Tuh3kE", "(JLkotlin/jvm/functions/Function1;)J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: LazyStaggeredGridMeasure.kt */
final class LazyStaggeredGridPositionedItem implements LazyStaggeredGridItemInfo {
    private final int index;
    private final boolean isVertical;
    private final Object key;
    private final int lane;
    private final int mainAxisLayoutSize;
    private final long offset;
    private final List<Placeable> placeables;
    private final long size;

    public /* synthetic */ LazyStaggeredGridPositionedItem(long j, int i, int i2, Object obj, long j2, List list, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i, i2, obj, j2, list, z, i3);
    }

    public int getIndex() {
        return this.index;
    }

    public Object getKey() {
        return this.key;
    }

    public int getLane() {
        return this.lane;
    }

    /* renamed from: getOffset-nOcc-ac  reason: not valid java name */
    public long m791getOffsetnOccac() {
        return this.offset;
    }

    /* renamed from: getSize-YbymL2g  reason: not valid java name */
    public long m792getSizeYbymL2g() {
        return this.size;
    }

    private LazyStaggeredGridPositionedItem(long j, int i, int i2, Object obj, long j2, List<? extends Placeable> list, boolean z, int i3) {
        this.offset = j;
        this.index = i;
        this.lane = i2;
        this.key = obj;
        this.size = j2;
        this.placeables = list;
        this.isVertical = z;
        this.mainAxisLayoutSize = i3;
    }

    private final int getMainAxisSize(Placeable placeable) {
        return this.isVertical ? placeable.getHeight() : placeable.getWidth();
    }

    /* renamed from: copy-4Tuh3kE  reason: not valid java name */
    private final long m790copy4Tuh3kE(long j, Function1<? super Integer, Integer> function1) {
        int r0 = this.isVertical ? IntOffset.m5744getXimpl(j) : function1.invoke(Integer.valueOf(IntOffset.m5744getXimpl(j))).intValue();
        boolean z = this.isVertical;
        int r3 = IntOffset.m5745getYimpl(j);
        if (z) {
            r3 = function1.invoke(Integer.valueOf(r3)).intValue();
        }
        return IntOffsetKt.IntOffset(r0, r3);
    }

    public String toString() {
        return super.toString();
    }

    public final void place(Placeable.PlacementScope placementScope, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext) {
        long j;
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(placementScope, "scope");
        Intrinsics.checkNotNullParameter(lazyStaggeredGridMeasureContext, "context");
        List<Placeable> list = this.placeables;
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            Placeable placeable = list.get(i3);
            if (lazyStaggeredGridMeasureContext.getReverseLayout()) {
                long r3 = m791getOffsetnOccac();
                if (this.isVertical) {
                    i = IntOffset.m5744getXimpl(r3);
                } else {
                    i = (this.mainAxisLayoutSize - IntOffset.m5744getXimpl(r3)) - (this.isVertical ? placeable.getHeight() : placeable.getWidth());
                }
                if (this.isVertical) {
                    i2 = (this.mainAxisLayoutSize - IntOffset.m5745getYimpl(r3)) - (this.isVertical ? placeable.getHeight() : placeable.getWidth());
                } else {
                    i2 = IntOffset.m5745getYimpl(r3);
                }
                j = IntOffsetKt.IntOffset(i, i2);
            } else {
                j = m791getOffsetnOccac();
            }
            long r6 = lazyStaggeredGridMeasureContext.m778getContentOffsetnOccac();
            Placeable.PlacementScope.m4562placeRelativeWithLayeraW9wM$default(placementScope, placeable, IntOffsetKt.IntOffset(IntOffset.m5744getXimpl(j) + IntOffset.m5744getXimpl(r6), IntOffset.m5745getYimpl(j) + IntOffset.m5745getYimpl(r6)), 0.0f, (Function1) null, 6, (Object) null);
        }
    }
}
