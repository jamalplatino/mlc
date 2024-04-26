package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001Bn\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0015J\u0019\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010'2\u0006\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000J\u000e\u0010$\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\u001e\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u000e\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-J.\u0010.\u001a\u00020\u0012*\u00020\u00122\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000300H\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u00102R\u0011\u0010\u0016\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u0014\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\u001e\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001aR\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0019\u0010\u0011\u001a\u00020\u0012X\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010!R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\"\u001a\u00020\u0003*\u00020#8BX\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00063"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListPositionedItem;", "Landroidx/compose/foundation/lazy/LazyListItemInfo;", "offset", "", "index", "key", "", "size", "minMainAxisOffset", "maxMainAxisOffset", "isVertical", "", "wrappers", "", "Landroidx/compose/foundation/lazy/LazyListPlaceableWrapper;", "placementAnimator", "Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;", "visualOffset", "Landroidx/compose/ui/unit/IntOffset;", "reverseLayout", "mainAxisLayoutSize", "(IILjava/lang/Object;IIIZLjava/util/List;Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V", "hasAnimations", "getHasAnimations", "()Z", "getIndex", "()I", "getKey", "()Ljava/lang/Object;", "getOffset", "placeablesCount", "getPlaceablesCount", "getSize", "J", "mainAxisSize", "Landroidx/compose/ui/layout/Placeable;", "getMainAxisSize", "(Landroidx/compose/ui/layout/Placeable;)I", "getAnimationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "getOffset-Bjo55l4", "(I)J", "place", "", "scope", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "copy", "mainAxisMap", "Lkotlin/Function1;", "copy-4Tuh3kE", "(JLkotlin/jvm/functions/Function1;)J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: LazyMeasuredItem.kt */
public final class LazyListPositionedItem implements LazyListItemInfo {
    private final boolean hasAnimations;
    private final int index;
    private final boolean isVertical;
    private final Object key;
    private final int mainAxisLayoutSize;
    private final int maxMainAxisOffset;
    private final int minMainAxisOffset;
    private final int offset;
    private final LazyListItemPlacementAnimator placementAnimator;
    private final boolean reverseLayout;
    private final int size;
    private final long visualOffset;
    private final List<LazyListPlaceableWrapper> wrappers;

    public /* synthetic */ LazyListPositionedItem(int i, int i2, Object obj, int i3, int i4, int i5, boolean z, List list, LazyListItemPlacementAnimator lazyListItemPlacementAnimator, long j, boolean z2, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, obj, i3, i4, i5, z, list, lazyListItemPlacementAnimator, j, z2, i6);
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

    public int getOffset() {
        return this.offset;
    }

    public int getSize() {
        return this.size;
    }

    private LazyListPositionedItem(int i, int i2, Object obj, int i3, int i4, int i5, boolean z, List<LazyListPlaceableWrapper> list, LazyListItemPlacementAnimator lazyListItemPlacementAnimator, long j, boolean z2, int i6) {
        this.offset = i;
        this.index = i2;
        this.key = obj;
        this.size = i3;
        this.minMainAxisOffset = i4;
        this.maxMainAxisOffset = i5;
        this.isVertical = z;
        this.wrappers = list;
        this.placementAnimator = lazyListItemPlacementAnimator;
        this.visualOffset = j;
        this.reverseLayout = z2;
        this.mainAxisLayoutSize = i6;
        LazyListPositionedItem lazyListPositionedItem = this;
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
        return this.wrappers.size();
    }

    /* renamed from: getOffset-Bjo55l4  reason: not valid java name */
    public final long m643getOffsetBjo55l4(int i) {
        return this.wrappers.get(i).m641getOffsetnOccac();
    }

    public final int getMainAxisSize(int i) {
        return getMainAxisSize(this.wrappers.get(i).getPlaceable());
    }

    public final FiniteAnimationSpec<IntOffset> getAnimationSpec(int i) {
        Object parentData = this.wrappers.get(i).getPlaceable().getParentData();
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
            Placeable placeable = this.wrappers.get(i3).getPlaceable();
            int mainAxisSize = this.minMainAxisOffset - getMainAxisSize(placeable);
            int i4 = this.maxMainAxisOffset;
            if (getAnimationSpec(i3) != null) {
                j = this.placementAnimator.m632getAnimatedOffsetYT5a7pE(getKey(), i3, mainAxisSize, i4, m643getOffsetBjo55l4(i3));
            } else {
                j = m643getOffsetBjo55l4(i3);
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
    private final long m642copy4Tuh3kE(long j, Function1<? super Integer, Integer> function1) {
        int r0 = this.isVertical ? IntOffset.m5744getXimpl(j) : function1.invoke(Integer.valueOf(IntOffset.m5744getXimpl(j))).intValue();
        boolean z = this.isVertical;
        int r3 = IntOffset.m5745getYimpl(j);
        if (z) {
            r3 = function1.invoke(Integer.valueOf(r3)).intValue();
        }
        return IntOffsetKt.IntOffset(r0, r3);
    }
}
