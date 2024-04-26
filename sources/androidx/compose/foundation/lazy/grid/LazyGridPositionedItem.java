package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B~\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0002\u0010\u0018J\u0019\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010,2\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000J\u0006\u0010-\u001a\u00020\u0005J\u0006\u0010.\u001a\u00020\u0005J\u0006\u0010)\u001a\u00020\u0005J\u000e\u0010)\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202J.\u00103\u001a\u00020\u0003*\u00020\u00032\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000505H\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b6\u00107R\u0014\u0010\t\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u000e\u0010\u0016\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0002\u001a\u00020\u0003X\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010$\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b%\u0010\u001aR\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u001f\u0010\n\u001a\u00020\u000bX\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010#\u001a\u0004\b'\u0010\"R\u0019\u0010\u0015\u001a\u00020\u0003X\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010#R\u0018\u0010(\u001a\u00020\u0005*\u00020\u00128BX\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00068"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridPositionedItem;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;", "offset", "Landroidx/compose/ui/unit/IntOffset;", "index", "", "key", "", "row", "column", "size", "Landroidx/compose/ui/unit/IntSize;", "minMainAxisOffset", "maxMainAxisOffset", "isVertical", "", "placeables", "", "Landroidx/compose/ui/layout/Placeable;", "placementAnimator", "Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "visualOffset", "mainAxisLayoutSize", "reverseLayout", "(JILjava/lang/Object;IIJIIZLjava/util/List;Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;JIZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getColumn", "()I", "hasAnimations", "getHasAnimations", "()Z", "getIndex", "getKey", "()Ljava/lang/Object;", "getOffset-nOcc-ac", "()J", "J", "placeablesCount", "getPlaceablesCount", "getRow", "getSize-YbymL2g", "mainAxisSize", "getMainAxisSize", "(Landroidx/compose/ui/layout/Placeable;)I", "getAnimationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "getCrossAxisOffset", "getCrossAxisSize", "place", "", "scope", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "copy", "mainAxisMap", "Lkotlin/Function1;", "copy-4Tuh3kE", "(JLkotlin/jvm/functions/Function1;)J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: LazyGridMeasuredItem.kt */
public final class LazyGridPositionedItem implements LazyGridItemInfo {
    private final int column;
    private final boolean hasAnimations;
    private final int index;
    private final boolean isVertical;
    private final Object key;
    private final int mainAxisLayoutSize;
    private final int maxMainAxisOffset;
    private final int minMainAxisOffset;
    private final long offset;
    private final List<Placeable> placeables;
    private final LazyGridItemPlacementAnimator placementAnimator;
    private final boolean reverseLayout;
    private final int row;
    private final long size;
    private final long visualOffset;

    public /* synthetic */ LazyGridPositionedItem(long j, int i, Object obj, int i2, int i3, long j2, int i4, int i5, boolean z, List list, LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, long j3, int i6, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i, obj, i2, i3, j2, i4, i5, z, list, lazyGridItemPlacementAnimator, j3, i6, z2);
    }

    public int getColumn() {
        return this.column;
    }

    public final boolean getHasAnimations() {
        return this.hasAnimations;
    }

    public int getIndex() {
        return this.index;
    }

    public Object getKey() {
        return this.key;
    }

    /* renamed from: getOffset-nOcc-ac  reason: not valid java name */
    public long m704getOffsetnOccac() {
        return this.offset;
    }

    public int getRow() {
        return this.row;
    }

    /* renamed from: getSize-YbymL2g  reason: not valid java name */
    public long m705getSizeYbymL2g() {
        return this.size;
    }

    private LazyGridPositionedItem(long j, int i, Object obj, int i2, int i3, long j2, int i4, int i5, boolean z, List<? extends Placeable> list, LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, long j3, int i6, boolean z2) {
        this.offset = j;
        this.index = i;
        this.key = obj;
        this.row = i2;
        this.column = i3;
        this.size = j2;
        this.minMainAxisOffset = i4;
        this.maxMainAxisOffset = i5;
        this.isVertical = z;
        this.placeables = list;
        this.placementAnimator = lazyGridItemPlacementAnimator;
        this.visualOffset = j3;
        this.mainAxisLayoutSize = i6;
        this.reverseLayout = z2;
        LazyGridPositionedItem lazyGridPositionedItem = this;
        int placeablesCount = getPlaceablesCount();
        boolean z3 = false;
        int i7 = 0;
        while (true) {
            if (i7 >= placeablesCount) {
                break;
            } else if (getAnimationSpec(i7) != null) {
                z3 = true;
                break;
            } else {
                i7++;
            }
        }
        this.hasAnimations = z3;
    }

    public final int getPlaceablesCount() {
        return this.placeables.size();
    }

    public final int getMainAxisSize(int i) {
        return getMainAxisSize(this.placeables.get(i));
    }

    public final int getMainAxisSize() {
        return this.isVertical ? IntSize.m5785getHeightimpl(m705getSizeYbymL2g()) : IntSize.m5786getWidthimpl(m705getSizeYbymL2g());
    }

    public final int getCrossAxisSize() {
        return this.isVertical ? IntSize.m5786getWidthimpl(m705getSizeYbymL2g()) : IntSize.m5785getHeightimpl(m705getSizeYbymL2g());
    }

    public final int getCrossAxisOffset() {
        return this.isVertical ? IntOffset.m5744getXimpl(m704getOffsetnOccac()) : IntOffset.m5745getYimpl(m704getOffsetnOccac());
    }

    public final FiniteAnimationSpec<IntOffset> getAnimationSpec(int i) {
        Object parentData = this.placeables.get(i).getParentData();
        if (parentData instanceof FiniteAnimationSpec) {
            return (FiniteAnimationSpec) parentData;
        }
        return null;
    }

    public final void place(Placeable.PlacementScope placementScope) {
        long j;
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(placementScope, "scope");
        int placeablesCount = getPlaceablesCount();
        for (int i3 = 0; i3 < placeablesCount; i3++) {
            Placeable placeable = this.placeables.get(i3);
            int mainAxisSize = this.minMainAxisOffset - getMainAxisSize(placeable);
            int i4 = this.maxMainAxisOffset;
            if (getAnimationSpec(i3) != null) {
                j = this.placementAnimator.m690getAnimatedOffsetYT5a7pE(getKey(), i3, mainAxisSize, i4, m704getOffsetnOccac());
            } else {
                j = m704getOffsetnOccac();
            }
            if (this.reverseLayout) {
                if (this.isVertical) {
                    i = IntOffset.m5744getXimpl(j);
                } else {
                    i = (this.mainAxisLayoutSize - IntOffset.m5744getXimpl(j)) - getMainAxisSize(placeable);
                }
                if (this.isVertical) {
                    i2 = (this.mainAxisLayoutSize - IntOffset.m5745getYimpl(j)) - getMainAxisSize(placeable);
                } else {
                    i2 = IntOffset.m5745getYimpl(j);
                }
                j = IntOffsetKt.IntOffset(i, i2);
            }
            if (this.isVertical) {
                long j2 = this.visualOffset;
                Placeable.PlacementScope.m4563placeWithLayeraW9wM$default(placementScope, placeable, IntOffsetKt.IntOffset(IntOffset.m5744getXimpl(j) + IntOffset.m5744getXimpl(j2), IntOffset.m5745getYimpl(j) + IntOffset.m5745getYimpl(j2)), 0.0f, (Function1) null, 6, (Object) null);
            } else {
                long j3 = this.visualOffset;
                Placeable.PlacementScope.m4562placeRelativeWithLayeraW9wM$default(placementScope, placeable, IntOffsetKt.IntOffset(IntOffset.m5744getXimpl(j) + IntOffset.m5744getXimpl(j3), IntOffset.m5745getYimpl(j) + IntOffset.m5745getYimpl(j3)), 0.0f, (Function1) null, 6, (Object) null);
            }
        }
    }

    private final int getMainAxisSize(Placeable placeable) {
        return this.isVertical ? placeable.getHeight() : placeable.getWidth();
    }

    /* renamed from: copy-4Tuh3kE  reason: not valid java name */
    private final long m703copy4Tuh3kE(long j, Function1<? super Integer, Integer> function1) {
        int r0 = this.isVertical ? IntOffset.m5744getXimpl(j) : function1.invoke(Integer.valueOf(IntOffset.m5744getXimpl(j))).intValue();
        boolean z = this.isVertical;
        int r3 = IntOffset.m5745getYimpl(j);
        if (z) {
            r3 = function1.invoke(Integer.valueOf(r3)).intValue();
        }
        return IntOffsetKt.IntOffset(r0, r3);
    }
}
