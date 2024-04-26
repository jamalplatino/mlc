package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001a\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00162\b\b\u0002\u0010\u001e\u001a\u00020\bH\u0002J;\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u0019ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b%\u0010&J4\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020\b2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00160\u00122\u0006\u0010-\u001a\u00020.J\u0006\u0010/\u001a\u00020(J\u0018\u00100\u001a\u00020(2\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u00101\u001a\u00020\rH\u0002J\u0014\u00102\u001a\u00020\u0005*\u00020\r2\u0006\u00103\u001a\u00020\bH\u0002J\u001c\u00104\u001a\u00020\u0019*\u00020\bH\u0002ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b5\u00106R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b0\nX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u000fj\b\u0012\u0004\u0012\u00020\u0001`\u0010X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0012X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0018\u001a\u00020\b*\u00020\u00198BX\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00067"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "isVertical", "", "(Lkotlinx/coroutines/CoroutineScope;Z)V", "firstVisibleIndex", "", "keyToIndexMap", "", "keyToItemInfoMap", "", "Landroidx/compose/foundation/lazy/ItemInfo;", "movingAwayKeys", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "movingAwayToEndBound", "", "Landroidx/compose/foundation/lazy/LazyMeasuredItem;", "movingAwayToStartBound", "movingInFromEndBound", "Landroidx/compose/foundation/lazy/LazyListPositionedItem;", "movingInFromStartBound", "mainAxis", "Landroidx/compose/ui/unit/IntOffset;", "getMainAxis--gyyYBs", "(J)I", "createItemInfo", "item", "mainAxisOffset", "getAnimatedOffset", "key", "placeableIndex", "minOffset", "maxOffset", "rawOffset", "getAnimatedOffset-YT5a7pE", "(Ljava/lang/Object;IIIJ)J", "onMeasured", "", "consumedScroll", "layoutWidth", "layoutHeight", "positionedItems", "itemProvider", "Landroidx/compose/foundation/lazy/LazyMeasuredItemProvider;", "reset", "startAnimationsIfNeeded", "itemInfo", "isWithinBounds", "mainAxisLayoutSize", "toOffset", "toOffset-Bjo55l4", "(I)J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: LazyListItemPlacementAnimator.kt */
public final class LazyListItemPlacementAnimator {
    private int firstVisibleIndex;
    private final boolean isVertical;
    /* access modifiers changed from: private */
    public Map<Object, Integer> keyToIndexMap = MapsKt.emptyMap();
    private final Map<Object, ItemInfo> keyToItemInfoMap = new LinkedHashMap();
    private final LinkedHashSet<Object> movingAwayKeys = new LinkedHashSet<>();
    private final List<LazyMeasuredItem> movingAwayToEndBound = new ArrayList();
    private final List<LazyMeasuredItem> movingAwayToStartBound = new ArrayList();
    private final List<LazyListPositionedItem> movingInFromEndBound = new ArrayList();
    private final List<LazyListPositionedItem> movingInFromStartBound = new ArrayList();
    private final CoroutineScope scope;

    public LazyListItemPlacementAnimator(CoroutineScope coroutineScope, boolean z) {
        Intrinsics.checkNotNullParameter(coroutineScope, "scope");
        this.scope = coroutineScope;
        this.isVertical = z;
    }

    /* renamed from: getAnimatedOffset-YT5a7pE  reason: not valid java name */
    public final long m632getAnimatedOffsetYT5a7pE(Object obj, int i, int i2, int i3, long j) {
        Intrinsics.checkNotNullParameter(obj, "key");
        ItemInfo itemInfo = this.keyToItemInfoMap.get(obj);
        if (itemInfo == null) {
            return j;
        }
        PlaceableInfo placeableInfo = itemInfo.getPlaceables().get(i);
        long r11 = placeableInfo.getAnimatedOffset().getValue().m5753unboximpl();
        long r0 = itemInfo.m628getNotAnimatableDeltanOccac();
        long IntOffset = IntOffsetKt.IntOffset(IntOffset.m5744getXimpl(r11) + IntOffset.m5744getXimpl(r0), IntOffset.m5745getYimpl(r11) + IntOffset.m5745getYimpl(r0));
        long r02 = placeableInfo.m654getTargetOffsetnOccac();
        long r2 = itemInfo.m628getNotAnimatableDeltanOccac();
        long IntOffset2 = IntOffsetKt.IntOffset(IntOffset.m5744getXimpl(r02) + IntOffset.m5744getXimpl(r2), IntOffset.m5745getYimpl(r02) + IntOffset.m5745getYimpl(r2));
        if (placeableInfo.getInProgress() && ((m630getMainAxisgyyYBs(IntOffset2) <= i2 && m630getMainAxisgyyYBs(IntOffset) <= i2) || (m630getMainAxisgyyYBs(IntOffset2) >= i3 && m630getMainAxisgyyYBs(IntOffset) >= i3))) {
            Job unused = BuildersKt__Builders_commonKt.launch$default(this.scope, (CoroutineContext) null, (CoroutineStart) null, new LazyListItemPlacementAnimator$getAnimatedOffset$1(placeableInfo, (Continuation<? super LazyListItemPlacementAnimator$getAnimatedOffset$1>) null), 3, (Object) null);
        }
        return IntOffset;
    }

    public final void reset() {
        this.keyToItemInfoMap.clear();
        this.keyToIndexMap = MapsKt.emptyMap();
        this.firstVisibleIndex = -1;
    }

    static /* synthetic */ ItemInfo createItemInfo$default(LazyListItemPlacementAnimator lazyListItemPlacementAnimator, LazyListPositionedItem lazyListPositionedItem, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = lazyListItemPlacementAnimator.m630getMainAxisgyyYBs(lazyListPositionedItem.m643getOffsetBjo55l4(0));
        }
        return lazyListItemPlacementAnimator.createItemInfo(lazyListPositionedItem, i);
    }

    private final ItemInfo createItemInfo(LazyListPositionedItem lazyListPositionedItem, int i) {
        long j;
        ItemInfo itemInfo = new ItemInfo();
        long r8 = lazyListPositionedItem.m643getOffsetBjo55l4(0);
        if (this.isVertical) {
            j = IntOffset.m5740copyiSbpLlY$default(r8, 0, i, 1, (Object) null);
        } else {
            j = IntOffset.m5740copyiSbpLlY$default(r8, i, 0, 2, (Object) null);
        }
        int placeablesCount = lazyListPositionedItem.getPlaceablesCount();
        for (int i2 = 0; i2 < placeablesCount; i2++) {
            long r4 = lazyListPositionedItem.m643getOffsetBjo55l4(i2);
            long IntOffset = IntOffsetKt.IntOffset(IntOffset.m5744getXimpl(r4) - IntOffset.m5744getXimpl(r8), IntOffset.m5745getYimpl(r4) - IntOffset.m5745getYimpl(r8));
            itemInfo.getPlaceables().add(new PlaceableInfo(IntOffsetKt.IntOffset(IntOffset.m5744getXimpl(j) + IntOffset.m5744getXimpl(IntOffset), IntOffset.m5745getYimpl(j) + IntOffset.m5745getYimpl(IntOffset)), lazyListPositionedItem.getMainAxisSize(i2), (DefaultConstructorMarker) null));
        }
        return itemInfo;
    }

    private final void startAnimationsIfNeeded(LazyListPositionedItem lazyListPositionedItem, ItemInfo itemInfo) {
        LazyListPositionedItem lazyListPositionedItem2 = lazyListPositionedItem;
        while (itemInfo.getPlaceables().size() > lazyListPositionedItem.getPlaceablesCount()) {
            CollectionsKt.removeLast(itemInfo.getPlaceables());
        }
        while (itemInfo.getPlaceables().size() < lazyListPositionedItem.getPlaceablesCount()) {
            int size = itemInfo.getPlaceables().size();
            long r4 = lazyListPositionedItem2.m643getOffsetBjo55l4(size);
            List<PlaceableInfo> placeables = itemInfo.getPlaceables();
            long r7 = itemInfo.m628getNotAnimatableDeltanOccac();
            placeables.add(new PlaceableInfo(IntOffsetKt.IntOffset(IntOffset.m5744getXimpl(r4) - IntOffset.m5744getXimpl(r7), IntOffset.m5745getYimpl(r4) - IntOffset.m5745getYimpl(r7)), lazyListPositionedItem2.getMainAxisSize(size), (DefaultConstructorMarker) null));
        }
        List<PlaceableInfo> placeables2 = itemInfo.getPlaceables();
        int size2 = placeables2.size();
        for (int i = 0; i < size2; i++) {
            PlaceableInfo placeableInfo = placeables2.get(i);
            long r6 = placeableInfo.m654getTargetOffsetnOccac();
            long r8 = itemInfo.m628getNotAnimatableDeltanOccac();
            long IntOffset = IntOffsetKt.IntOffset(IntOffset.m5744getXimpl(r6) + IntOffset.m5744getXimpl(r8), IntOffset.m5745getYimpl(r6) + IntOffset.m5745getYimpl(r8));
            long r82 = lazyListPositionedItem2.m643getOffsetBjo55l4(i);
            placeableInfo.setMainAxisSize(lazyListPositionedItem2.getMainAxisSize(i));
            FiniteAnimationSpec<IntOffset> animationSpec = lazyListPositionedItem2.getAnimationSpec(i);
            if (!IntOffset.m5743equalsimpl0(IntOffset, r82)) {
                long r62 = itemInfo.m628getNotAnimatableDeltanOccac();
                placeableInfo.m655setTargetOffsetgyyYBs(IntOffsetKt.IntOffset(IntOffset.m5744getXimpl(r82) - IntOffset.m5744getXimpl(r62), IntOffset.m5745getYimpl(r82) - IntOffset.m5745getYimpl(r62)));
                if (animationSpec != null) {
                    placeableInfo.setInProgress(true);
                    Job unused = BuildersKt__Builders_commonKt.launch$default(this.scope, (CoroutineContext) null, (CoroutineStart) null, new LazyListItemPlacementAnimator$startAnimationsIfNeeded$1$1(placeableInfo, animationSpec, (Continuation<? super LazyListItemPlacementAnimator$startAnimationsIfNeeded$1$1>) null), 3, (Object) null);
                }
            }
        }
    }

    private final boolean isWithinBounds(ItemInfo itemInfo, int i) {
        List<PlaceableInfo> placeables = itemInfo.getPlaceables();
        int size = placeables.size();
        for (int i2 = 0; i2 < size; i2++) {
            PlaceableInfo placeableInfo = placeables.get(i2);
            long r5 = placeableInfo.m654getTargetOffsetnOccac();
            long r7 = itemInfo.m628getNotAnimatableDeltanOccac();
            long IntOffset = IntOffsetKt.IntOffset(IntOffset.m5744getXimpl(r5) + IntOffset.m5744getXimpl(r7), IntOffset.m5745getYimpl(r5) + IntOffset.m5745getYimpl(r7));
            if (m630getMainAxisgyyYBs(IntOffset) + placeableInfo.getMainAxisSize() > 0 && m630getMainAxisgyyYBs(IntOffset) < i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: toOffset-Bjo55l4  reason: not valid java name */
    private final long m631toOffsetBjo55l4(int i) {
        boolean z = this.isVertical;
        int i2 = z ? 0 : i;
        if (!z) {
            i = 0;
        }
        return IntOffsetKt.IntOffset(i2, i);
    }

    /* renamed from: getMainAxis--gyyYBs  reason: not valid java name */
    private final int m630getMainAxisgyyYBs(long j) {
        return this.isVertical ? IntOffset.m5745getYimpl(j) : IntOffset.m5744getXimpl(j);
    }

    public final void onMeasured(int i, int i2, int i3, List<LazyListPositionedItem> list, LazyMeasuredItemProvider lazyMeasuredItemProvider) {
        boolean z;
        int i4;
        int i5;
        int i6 = i2;
        int i7 = i3;
        List<LazyListPositionedItem> list2 = list;
        LazyMeasuredItemProvider lazyMeasuredItemProvider2 = lazyMeasuredItemProvider;
        Intrinsics.checkNotNullParameter(list2, "positionedItems");
        Intrinsics.checkNotNullParameter(lazyMeasuredItemProvider2, "itemProvider");
        int size = list.size();
        int i8 = 0;
        while (true) {
            if (i8 < size) {
                if (list2.get(i8).getHasAnimations()) {
                    break;
                }
                i8++;
            } else if (this.keyToItemInfoMap.isEmpty()) {
                reset();
                return;
            }
        }
        int i9 = this.firstVisibleIndex;
        LazyListPositionedItem lazyListPositionedItem = (LazyListPositionedItem) CollectionsKt.firstOrNull(list);
        this.firstVisibleIndex = lazyListPositionedItem != null ? lazyListPositionedItem.getIndex() : 0;
        Map<Object, Integer> map = this.keyToIndexMap;
        this.keyToIndexMap = lazyMeasuredItemProvider.getKeyToIndexMap();
        int i10 = this.isVertical ? i7 : i6;
        long r9 = m631toOffsetBjo55l4(i);
        this.movingAwayKeys.addAll(this.keyToItemInfoMap.keySet());
        int size2 = list.size();
        int i11 = 0;
        while (i11 < size2) {
            LazyListPositionedItem lazyListPositionedItem2 = list2.get(i11);
            this.movingAwayKeys.remove(lazyListPositionedItem2.getKey());
            if (lazyListPositionedItem2.getHasAnimations()) {
                ItemInfo itemInfo = this.keyToItemInfoMap.get(lazyListPositionedItem2.getKey());
                if (itemInfo == null) {
                    Integer num = map.get(lazyListPositionedItem2.getKey());
                    if (num == null || lazyListPositionedItem2.getIndex() == num.intValue()) {
                        i5 = i9;
                        i4 = size2;
                        this.keyToItemInfoMap.put(lazyListPositionedItem2.getKey(), createItemInfo$default(this, lazyListPositionedItem2, 0, 2, (Object) null));
                    } else {
                        if (num.intValue() < i9) {
                            this.movingInFromStartBound.add(lazyListPositionedItem2);
                        } else {
                            this.movingInFromEndBound.add(lazyListPositionedItem2);
                        }
                        i5 = i9;
                        i4 = size2;
                    }
                } else {
                    i5 = i9;
                    i4 = size2;
                    long r5 = itemInfo.m628getNotAnimatableDeltanOccac();
                    itemInfo.m629setNotAnimatableDeltagyyYBs(IntOffsetKt.IntOffset(IntOffset.m5744getXimpl(r5) + IntOffset.m5744getXimpl(r9), IntOffset.m5745getYimpl(r5) + IntOffset.m5745getYimpl(r9)));
                    startAnimationsIfNeeded(lazyListPositionedItem2, itemInfo);
                }
            } else {
                i5 = i9;
                i4 = size2;
                this.keyToItemInfoMap.remove(lazyListPositionedItem2.getKey());
            }
            i11++;
            size2 = i4;
            i9 = i5;
        }
        List<LazyListPositionedItem> list3 = this.movingInFromStartBound;
        if (list3.size() > 1) {
            CollectionsKt.sortWith(list3, new LazyListItemPlacementAnimator$onMeasured$$inlined$sortByDescending$1(map));
        }
        List<LazyListPositionedItem> list4 = this.movingInFromStartBound;
        int size3 = list4.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size3; i13++) {
            LazyListPositionedItem lazyListPositionedItem3 = list4.get(i13);
            int size4 = (0 - i12) - lazyListPositionedItem3.getSize();
            i12 += lazyListPositionedItem3.getSize();
            ItemInfo createItemInfo = createItemInfo(lazyListPositionedItem3, size4);
            this.keyToItemInfoMap.put(lazyListPositionedItem3.getKey(), createItemInfo);
            startAnimationsIfNeeded(lazyListPositionedItem3, createItemInfo);
        }
        List<LazyListPositionedItem> list5 = this.movingInFromEndBound;
        if (list5.size() > 1) {
            CollectionsKt.sortWith(list5, new LazyListItemPlacementAnimator$onMeasured$$inlined$sortBy$1(map));
        }
        List<LazyListPositionedItem> list6 = this.movingInFromEndBound;
        int size5 = list6.size();
        int i14 = 0;
        for (int i15 = 0; i15 < size5; i15++) {
            LazyListPositionedItem lazyListPositionedItem4 = list6.get(i15);
            int i16 = i10 + i14;
            i14 += lazyListPositionedItem4.getSize();
            ItemInfo createItemInfo2 = createItemInfo(lazyListPositionedItem4, i16);
            this.keyToItemInfoMap.put(lazyListPositionedItem4.getKey(), createItemInfo2);
            startAnimationsIfNeeded(lazyListPositionedItem4, createItemInfo2);
        }
        for (Object next : this.movingAwayKeys) {
            ItemInfo itemInfo2 = (ItemInfo) MapsKt.getValue(this.keyToItemInfoMap, next);
            Integer num2 = this.keyToIndexMap.get(next);
            List<PlaceableInfo> placeables = itemInfo2.getPlaceables();
            int size6 = placeables.size();
            int i17 = 0;
            while (true) {
                if (i17 >= size6) {
                    z = false;
                    break;
                } else if (placeables.get(i17).getInProgress()) {
                    z = true;
                    break;
                } else {
                    i17++;
                }
            }
            if (itemInfo2.getPlaceables().isEmpty() || num2 == null || ((!z && Intrinsics.areEqual((Object) num2, (Object) map.get(next))) || (!z && !isWithinBounds(itemInfo2, i10)))) {
                this.keyToItemInfoMap.remove(next);
            } else {
                LazyMeasuredItem r6 = lazyMeasuredItemProvider2.m650getAndMeasureZjPyQlc(DataIndex.m616constructorimpl(num2.intValue()));
                if (num2.intValue() < this.firstVisibleIndex) {
                    this.movingAwayToStartBound.add(r6);
                } else {
                    this.movingAwayToEndBound.add(r6);
                }
            }
        }
        List<LazyMeasuredItem> list7 = this.movingAwayToStartBound;
        if (list7.size() > 1) {
            CollectionsKt.sortWith(list7, new LazyListItemPlacementAnimator$onMeasured$$inlined$sortByDescending$2(this));
        }
        List<LazyMeasuredItem> list8 = this.movingAwayToStartBound;
        int size7 = list8.size();
        int i18 = 0;
        for (int i19 = 0; i19 < size7; i19++) {
            LazyMeasuredItem lazyMeasuredItem = list8.get(i19);
            int size8 = (0 - i18) - lazyMeasuredItem.getSize();
            i18 += lazyMeasuredItem.getSize();
            LazyListPositionedItem position = lazyMeasuredItem.position(size8, i6, i7);
            list2.add(position);
            startAnimationsIfNeeded(position, (ItemInfo) MapsKt.getValue(this.keyToItemInfoMap, lazyMeasuredItem.getKey()));
        }
        List<LazyMeasuredItem> list9 = this.movingAwayToEndBound;
        if (list9.size() > 1) {
            CollectionsKt.sortWith(list9, new LazyListItemPlacementAnimator$onMeasured$$inlined$sortBy$2(this));
        }
        List<LazyMeasuredItem> list10 = this.movingAwayToEndBound;
        int size9 = list10.size();
        int i20 = 0;
        for (int i21 = 0; i21 < size9; i21++) {
            LazyMeasuredItem lazyMeasuredItem2 = list10.get(i21);
            int i22 = i10 + i20;
            i20 += lazyMeasuredItem2.getSize();
            LazyListPositionedItem position2 = lazyMeasuredItem2.position(i22, i6, i7);
            list2.add(position2);
            startAnimationsIfNeeded(position2, (ItemInfo) MapsKt.getValue(this.keyToItemInfoMap, lazyMeasuredItem2.getKey()));
        }
        this.movingInFromStartBound.clear();
        this.movingInFromEndBound.clear();
        this.movingAwayToStartBound.clear();
        this.movingAwayToEndBound.clear();
        this.movingAwayKeys.clear();
    }
}
