package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import java.util.ArrayList;
import java.util.Iterator;
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

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001a\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u00162\b\b\u0002\u0010!\u001a\u00020\bH\u0002J;\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020\b2\u0006\u0010&\u001a\u00020\b2\u0006\u0010'\u001a\u00020\u001cø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010)J<\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\b2\u0006\u0010-\u001a\u00020\b2\u0006\u0010.\u001a\u00020\b2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00160\u00122\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203J\u0006\u00104\u001a\u00020+J\u0018\u00105\u001a\u00020+2\u0006\u0010 \u001a\u00020\u00162\u0006\u00106\u001a\u00020\rH\u0002J\u0014\u00107\u001a\u00020\u0005*\u00020\r2\u0006\u00108\u001a\u00020\bH\u0002J\u001c\u00109\u001a\u00020\u001c*\u00020\bH\u0002ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b:\u0010;R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b0\nX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u000fj\b\u0012\u0004\u0012\u00020\u0001`\u0010X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0012X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0018\u001a\u00020\b*\u00020\u00168BX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001b\u001a\u00020\b*\u00020\u001c8BX\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006<"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "isVertical", "", "(Lkotlinx/coroutines/CoroutineScope;Z)V", "firstVisibleIndex", "", "keyToIndexMap", "", "keyToItemInfoMap", "", "Landroidx/compose/foundation/lazy/grid/ItemInfo;", "movingAwayKeys", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "movingAwayToEndBound", "", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "movingAwayToStartBound", "movingInFromEndBound", "Landroidx/compose/foundation/lazy/grid/LazyGridPositionedItem;", "movingInFromStartBound", "line", "getLine", "(Landroidx/compose/foundation/lazy/grid/LazyGridPositionedItem;)I", "mainAxis", "Landroidx/compose/ui/unit/IntOffset;", "getMainAxis--gyyYBs", "(J)I", "createItemInfo", "item", "mainAxisOffset", "getAnimatedOffset", "key", "placeableIndex", "minOffset", "maxOffset", "rawOffset", "getAnimatedOffset-YT5a7pE", "(Ljava/lang/Object;IIIJ)J", "onMeasured", "", "consumedScroll", "layoutWidth", "layoutHeight", "positionedItems", "itemProvider", "Landroidx/compose/foundation/lazy/grid/LazyMeasuredItemProvider;", "spanLayoutProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "reset", "startAnimationsIfNeeded", "itemInfo", "isWithinBounds", "mainAxisLayoutSize", "toOffset", "toOffset-Bjo55l4", "(I)J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: LazyGridItemPlacementAnimator.kt */
public final class LazyGridItemPlacementAnimator {
    private int firstVisibleIndex;
    private final boolean isVertical;
    /* access modifiers changed from: private */
    public Map<Object, Integer> keyToIndexMap = MapsKt.emptyMap();
    private final Map<Object, ItemInfo> keyToItemInfoMap = new LinkedHashMap();
    private final LinkedHashSet<Object> movingAwayKeys = new LinkedHashSet<>();
    private final List<LazyGridMeasuredItem> movingAwayToEndBound = new ArrayList();
    private final List<LazyGridMeasuredItem> movingAwayToStartBound = new ArrayList();
    private final List<LazyGridPositionedItem> movingInFromEndBound = new ArrayList();
    private final List<LazyGridPositionedItem> movingInFromStartBound = new ArrayList();
    private final CoroutineScope scope;

    public LazyGridItemPlacementAnimator(CoroutineScope coroutineScope, boolean z) {
        Intrinsics.checkNotNullParameter(coroutineScope, "scope");
        this.scope = coroutineScope;
        this.isVertical = z;
    }

    /* renamed from: getAnimatedOffset-YT5a7pE  reason: not valid java name */
    public final long m690getAnimatedOffsetYT5a7pE(Object obj, int i, int i2, int i3, long j) {
        Intrinsics.checkNotNullParameter(obj, "key");
        ItemInfo itemInfo = this.keyToItemInfoMap.get(obj);
        if (itemInfo == null) {
            return j;
        }
        PlaceableInfo placeableInfo = itemInfo.getPlaceables().get(i);
        long r11 = placeableInfo.getAnimatedOffset().getValue().m5753unboximpl();
        long r0 = itemInfo.m678getNotAnimatableDeltanOccac();
        long IntOffset = IntOffsetKt.IntOffset(IntOffset.m5744getXimpl(r11) + IntOffset.m5744getXimpl(r0), IntOffset.m5745getYimpl(r11) + IntOffset.m5745getYimpl(r0));
        long r02 = placeableInfo.m734getTargetOffsetnOccac();
        long r2 = itemInfo.m678getNotAnimatableDeltanOccac();
        long IntOffset2 = IntOffsetKt.IntOffset(IntOffset.m5744getXimpl(r02) + IntOffset.m5744getXimpl(r2), IntOffset.m5745getYimpl(r02) + IntOffset.m5745getYimpl(r2));
        if (placeableInfo.getInProgress() && ((m688getMainAxisgyyYBs(IntOffset2) <= i2 && m688getMainAxisgyyYBs(IntOffset) < i2) || (m688getMainAxisgyyYBs(IntOffset2) >= i3 && m688getMainAxisgyyYBs(IntOffset) > i3))) {
            Job unused = BuildersKt__Builders_commonKt.launch$default(this.scope, (CoroutineContext) null, (CoroutineStart) null, new LazyGridItemPlacementAnimator$getAnimatedOffset$1(placeableInfo, (Continuation<? super LazyGridItemPlacementAnimator$getAnimatedOffset$1>) null), 3, (Object) null);
        }
        return IntOffset;
    }

    public final void reset() {
        this.keyToItemInfoMap.clear();
        this.keyToIndexMap = MapsKt.emptyMap();
        this.firstVisibleIndex = -1;
    }

    static /* synthetic */ ItemInfo createItemInfo$default(LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, LazyGridPositionedItem lazyGridPositionedItem, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = lazyGridItemPlacementAnimator.m688getMainAxisgyyYBs(lazyGridPositionedItem.m704getOffsetnOccac());
        }
        return lazyGridItemPlacementAnimator.createItemInfo(lazyGridPositionedItem, i);
    }

    private final ItemInfo createItemInfo(LazyGridPositionedItem lazyGridPositionedItem, int i) {
        long j;
        ItemInfo itemInfo = new ItemInfo(lazyGridPositionedItem.getCrossAxisSize(), lazyGridPositionedItem.getCrossAxisOffset());
        if (this.isVertical) {
            j = IntOffset.m5740copyiSbpLlY$default(lazyGridPositionedItem.m704getOffsetnOccac(), 0, i, 1, (Object) null);
        } else {
            j = IntOffset.m5740copyiSbpLlY$default(lazyGridPositionedItem.m704getOffsetnOccac(), i, 0, 2, (Object) null);
        }
        int placeablesCount = lazyGridPositionedItem.getPlaceablesCount();
        for (int i2 = 0; i2 < placeablesCount; i2++) {
            itemInfo.getPlaceables().add(new PlaceableInfo(j, lazyGridPositionedItem.getMainAxisSize(i2), (DefaultConstructorMarker) null));
        }
        return itemInfo;
    }

    private final void startAnimationsIfNeeded(LazyGridPositionedItem lazyGridPositionedItem, ItemInfo itemInfo) {
        LazyGridPositionedItem lazyGridPositionedItem2 = lazyGridPositionedItem;
        while (itemInfo.getPlaceables().size() > lazyGridPositionedItem.getPlaceablesCount()) {
            CollectionsKt.removeLast(itemInfo.getPlaceables());
        }
        while (itemInfo.getPlaceables().size() < lazyGridPositionedItem.getPlaceablesCount()) {
            int size = itemInfo.getPlaceables().size();
            long r4 = lazyGridPositionedItem.m704getOffsetnOccac();
            List<PlaceableInfo> placeables = itemInfo.getPlaceables();
            long r7 = itemInfo.m678getNotAnimatableDeltanOccac();
            placeables.add(new PlaceableInfo(IntOffsetKt.IntOffset(IntOffset.m5744getXimpl(r4) - IntOffset.m5744getXimpl(r7), IntOffset.m5745getYimpl(r4) - IntOffset.m5745getYimpl(r7)), lazyGridPositionedItem2.getMainAxisSize(size), (DefaultConstructorMarker) null));
        }
        List<PlaceableInfo> placeables2 = itemInfo.getPlaceables();
        int size2 = placeables2.size();
        for (int i = 0; i < size2; i++) {
            PlaceableInfo placeableInfo = placeables2.get(i);
            long r6 = placeableInfo.m734getTargetOffsetnOccac();
            long r8 = itemInfo.m678getNotAnimatableDeltanOccac();
            long IntOffset = IntOffsetKt.IntOffset(IntOffset.m5744getXimpl(r6) + IntOffset.m5744getXimpl(r8), IntOffset.m5745getYimpl(r6) + IntOffset.m5745getYimpl(r8));
            long r82 = lazyGridPositionedItem.m704getOffsetnOccac();
            placeableInfo.setMainAxisSize(lazyGridPositionedItem2.getMainAxisSize(i));
            FiniteAnimationSpec<IntOffset> animationSpec = lazyGridPositionedItem2.getAnimationSpec(i);
            if (!IntOffset.m5743equalsimpl0(IntOffset, r82)) {
                long r62 = itemInfo.m678getNotAnimatableDeltanOccac();
                placeableInfo.m735setTargetOffsetgyyYBs(IntOffsetKt.IntOffset(IntOffset.m5744getXimpl(r82) - IntOffset.m5744getXimpl(r62), IntOffset.m5745getYimpl(r82) - IntOffset.m5745getYimpl(r62)));
                if (animationSpec != null) {
                    placeableInfo.setInProgress(true);
                    Job unused = BuildersKt__Builders_commonKt.launch$default(this.scope, (CoroutineContext) null, (CoroutineStart) null, new LazyGridItemPlacementAnimator$startAnimationsIfNeeded$1$1(placeableInfo, animationSpec, (Continuation<? super LazyGridItemPlacementAnimator$startAnimationsIfNeeded$1$1>) null), 3, (Object) null);
                }
            }
        }
    }

    private final boolean isWithinBounds(ItemInfo itemInfo, int i) {
        List<PlaceableInfo> placeables = itemInfo.getPlaceables();
        int size = placeables.size();
        for (int i2 = 0; i2 < size; i2++) {
            PlaceableInfo placeableInfo = placeables.get(i2);
            long r5 = placeableInfo.m734getTargetOffsetnOccac();
            long r7 = itemInfo.m678getNotAnimatableDeltanOccac();
            long IntOffset = IntOffsetKt.IntOffset(IntOffset.m5744getXimpl(r5) + IntOffset.m5744getXimpl(r7), IntOffset.m5745getYimpl(r5) + IntOffset.m5745getYimpl(r7));
            if (m688getMainAxisgyyYBs(IntOffset) + placeableInfo.getMainAxisSize() > 0 && m688getMainAxisgyyYBs(IntOffset) < i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: toOffset-Bjo55l4  reason: not valid java name */
    private final long m689toOffsetBjo55l4(int i) {
        boolean z = this.isVertical;
        int i2 = z ? 0 : i;
        if (!z) {
            i = 0;
        }
        return IntOffsetKt.IntOffset(i2, i);
    }

    /* renamed from: getMainAxis--gyyYBs  reason: not valid java name */
    private final int m688getMainAxisgyyYBs(long j) {
        return this.isVertical ? IntOffset.m5745getYimpl(j) : IntOffset.m5744getXimpl(j);
    }

    private final int getLine(LazyGridPositionedItem lazyGridPositionedItem) {
        return this.isVertical ? lazyGridPositionedItem.getRow() : lazyGridPositionedItem.getColumn();
    }

    public final void onMeasured(int i, int i2, int i3, List<LazyGridPositionedItem> list, LazyMeasuredItemProvider lazyMeasuredItemProvider, LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider) {
        Map<Object, Integer> map;
        boolean z;
        Iterator it;
        long j;
        Map<Object, Integer> map2;
        int i4;
        List<LazyGridPositionedItem> list2 = list;
        LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider2 = lazyGridSpanLayoutProvider;
        Intrinsics.checkNotNullParameter(list2, "positionedItems");
        Intrinsics.checkNotNullParameter(lazyMeasuredItemProvider, "itemProvider");
        Intrinsics.checkNotNullParameter(lazyGridSpanLayoutProvider2, "spanLayoutProvider");
        int size = list.size();
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i6 < size) {
                if (list2.get(i6).getHasAnimations()) {
                    break;
                }
                i6++;
            } else if (this.keyToItemInfoMap.isEmpty()) {
                reset();
                return;
            }
        }
        int i7 = this.firstVisibleIndex;
        LazyGridPositionedItem lazyGridPositionedItem = (LazyGridPositionedItem) CollectionsKt.firstOrNull(list);
        this.firstVisibleIndex = lazyGridPositionedItem != null ? lazyGridPositionedItem.getIndex() : 0;
        Map<Object, Integer> map3 = this.keyToIndexMap;
        this.keyToIndexMap = lazyMeasuredItemProvider.getKeyToIndexMap();
        int i8 = this.isVertical ? i3 : i2;
        long r4 = m689toOffsetBjo55l4(i);
        this.movingAwayKeys.addAll(this.keyToItemInfoMap.keySet());
        int size2 = list.size();
        int i9 = 0;
        while (i9 < size2) {
            LazyGridPositionedItem lazyGridPositionedItem2 = list2.get(i9);
            this.movingAwayKeys.remove(lazyGridPositionedItem2.getKey());
            if (lazyGridPositionedItem2.getHasAnimations()) {
                ItemInfo itemInfo = this.keyToItemInfoMap.get(lazyGridPositionedItem2.getKey());
                if (itemInfo == null) {
                    Integer num = map3.get(lazyGridPositionedItem2.getKey());
                    if (num == null || lazyGridPositionedItem2.getIndex() == num.intValue()) {
                        i4 = i7;
                        this.keyToItemInfoMap.put(lazyGridPositionedItem2.getKey(), createItemInfo$default(this, lazyGridPositionedItem2, i5, 2, (Object) null));
                    } else {
                        if (num.intValue() < i7) {
                            this.movingInFromStartBound.add(lazyGridPositionedItem2);
                        } else {
                            this.movingInFromEndBound.add(lazyGridPositionedItem2);
                        }
                        i4 = i7;
                    }
                    map2 = map3;
                } else {
                    i4 = i7;
                    long r17 = itemInfo.m678getNotAnimatableDeltanOccac();
                    map2 = map3;
                    itemInfo.m679setNotAnimatableDeltagyyYBs(IntOffsetKt.IntOffset(IntOffset.m5744getXimpl(r17) + IntOffset.m5744getXimpl(r4), IntOffset.m5745getYimpl(r17) + IntOffset.m5745getYimpl(r4)));
                    itemInfo.setCrossAxisSize(lazyGridPositionedItem2.getCrossAxisSize());
                    itemInfo.setCrossAxisOffset(lazyGridPositionedItem2.getCrossAxisOffset());
                    startAnimationsIfNeeded(lazyGridPositionedItem2, itemInfo);
                }
            } else {
                i4 = i7;
                map2 = map3;
                this.keyToItemInfoMap.remove(lazyGridPositionedItem2.getKey());
            }
            i9++;
            i7 = i4;
            map3 = map2;
            i5 = 0;
        }
        Map<Object, Integer> map4 = map3;
        List<LazyGridPositionedItem> list3 = this.movingInFromStartBound;
        if (list3.size() > 1) {
            map = map4;
            CollectionsKt.sortWith(list3, new LazyGridItemPlacementAnimator$onMeasured$$inlined$sortByDescending$1(map));
        } else {
            map = map4;
        }
        List<LazyGridPositionedItem> list4 = this.movingInFromStartBound;
        int size3 = list4.size();
        int i10 = -1;
        int i11 = -1;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < size3) {
            LazyGridPositionedItem lazyGridPositionedItem3 = list4.get(i12);
            int line = getLine(lazyGridPositionedItem3);
            if (line == i10 || line != i11) {
                i13 += i14;
                i14 = lazyGridPositionedItem3.getMainAxisSize();
                i11 = line;
            } else {
                i14 = Math.max(i14, lazyGridPositionedItem3.getMainAxisSize());
            }
            ItemInfo createItemInfo = createItemInfo(lazyGridPositionedItem3, (0 - i13) - lazyGridPositionedItem3.getMainAxisSize());
            this.keyToItemInfoMap.put(lazyGridPositionedItem3.getKey(), createItemInfo);
            startAnimationsIfNeeded(lazyGridPositionedItem3, createItemInfo);
            i12++;
            i10 = -1;
        }
        List<LazyGridPositionedItem> list5 = this.movingInFromEndBound;
        if (list5.size() > 1) {
            CollectionsKt.sortWith(list5, new LazyGridItemPlacementAnimator$onMeasured$$inlined$sortBy$1(map));
        }
        List<LazyGridPositionedItem> list6 = this.movingInFromEndBound;
        int size4 = list6.size();
        int i15 = -1;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < size4; i18++) {
            LazyGridPositionedItem lazyGridPositionedItem4 = list6.get(i18);
            int line2 = getLine(lazyGridPositionedItem4);
            if (line2 == -1 || line2 != i15) {
                i16 += i17;
                i17 = lazyGridPositionedItem4.getMainAxisSize();
                i15 = line2;
            } else {
                i17 = Math.max(i17, lazyGridPositionedItem4.getMainAxisSize());
            }
            ItemInfo createItemInfo2 = createItemInfo(lazyGridPositionedItem4, i8 + i16);
            this.keyToItemInfoMap.put(lazyGridPositionedItem4.getKey(), createItemInfo2);
            startAnimationsIfNeeded(lazyGridPositionedItem4, createItemInfo2);
        }
        Iterator it2 = this.movingAwayKeys.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            ItemInfo itemInfo2 = (ItemInfo) MapsKt.getValue(this.keyToItemInfoMap, next);
            Integer num2 = this.keyToIndexMap.get(next);
            List<PlaceableInfo> placeables = itemInfo2.getPlaceables();
            int size5 = placeables.size();
            int i19 = 0;
            while (true) {
                if (i19 >= size5) {
                    z = false;
                    break;
                } else if (placeables.get(i19).getInProgress()) {
                    z = true;
                    break;
                } else {
                    i19++;
                }
            }
            if (itemInfo2.getPlaceables().isEmpty() || num2 == null || ((!z && Intrinsics.areEqual((Object) num2, (Object) map.get(next))) || (!z && !isWithinBounds(itemInfo2, i8)))) {
                it = it2;
                this.keyToItemInfoMap.remove(next);
            } else {
                int r6 = ItemIndex.m667constructorimpl(num2.intValue());
                if (this.isVertical) {
                    j = Constraints.Companion.m5580fixedWidthOenEA2s(itemInfo2.getCrossAxisSize());
                } else {
                    j = Constraints.Companion.m5579fixedHeightOenEA2s(itemInfo2.getCrossAxisSize());
                }
                it = it2;
                LazyGridMeasuredItem r42 = LazyMeasuredItemProvider.m714getAndMeasureednRnyU$default(lazyMeasuredItemProvider, r6, 0, j, 2, (Object) null);
                if (num2.intValue() < this.firstVisibleIndex) {
                    this.movingAwayToStartBound.add(r42);
                } else {
                    this.movingAwayToEndBound.add(r42);
                }
            }
            it2 = it;
        }
        List<LazyGridMeasuredItem> list7 = this.movingAwayToStartBound;
        if (list7.size() > 1) {
            CollectionsKt.sortWith(list7, new LazyGridItemPlacementAnimator$onMeasured$$inlined$sortByDescending$2(this));
        }
        List<LazyGridMeasuredItem> list8 = this.movingAwayToStartBound;
        int size6 = list8.size();
        int i20 = -1;
        int i21 = 0;
        int i22 = 0;
        for (int i23 = 0; i23 < size6; i23++) {
            LazyGridMeasuredItem lazyGridMeasuredItem = list8.get(i23);
            int r9 = lazyGridSpanLayoutProvider2.m712getLineIndexOfItem_Ze7BM(lazyGridMeasuredItem.m701getIndexVZbfaAc());
            if (r9 == -1 || r9 != i20) {
                i21 += i22;
                i22 = lazyGridMeasuredItem.getMainAxisSize();
                i20 = r9;
            } else {
                i22 = Math.max(i22, lazyGridMeasuredItem.getMainAxisSize());
            }
            int mainAxisSize = (0 - i21) - lazyGridMeasuredItem.getMainAxisSize();
            ItemInfo itemInfo3 = (ItemInfo) MapsKt.getValue(this.keyToItemInfoMap, lazyGridMeasuredItem.getKey());
            LazyGridPositionedItem position = lazyGridMeasuredItem.position(mainAxisSize, itemInfo3.getCrossAxisOffset(), i2, i3, -1, -1);
            list2.add(position);
            startAnimationsIfNeeded(position, itemInfo3);
        }
        List<LazyGridMeasuredItem> list9 = this.movingAwayToEndBound;
        if (list9.size() > 1) {
            CollectionsKt.sortWith(list9, new LazyGridItemPlacementAnimator$onMeasured$$inlined$sortBy$2(this));
        }
        List<LazyGridMeasuredItem> list10 = this.movingAwayToEndBound;
        int size7 = list10.size();
        int i24 = -1;
        int i25 = 0;
        int i26 = 0;
        for (int i27 = 0; i27 < size7; i27++) {
            LazyGridMeasuredItem lazyGridMeasuredItem2 = list10.get(i27);
            int r8 = lazyGridSpanLayoutProvider2.m712getLineIndexOfItem_Ze7BM(lazyGridMeasuredItem2.m701getIndexVZbfaAc());
            if (r8 == -1 || r8 != i24) {
                i25 += i26;
                i26 = lazyGridMeasuredItem2.getMainAxisSize();
                i24 = r8;
            } else {
                i26 = Math.max(i26, lazyGridMeasuredItem2.getMainAxisSize());
            }
            ItemInfo itemInfo4 = (ItemInfo) MapsKt.getValue(this.keyToItemInfoMap, lazyGridMeasuredItem2.getKey());
            LazyGridPositionedItem position2 = lazyGridMeasuredItem2.position(i8 + i25, itemInfo4.getCrossAxisOffset(), i2, i3, -1, -1);
            list2.add(position2);
            startAnimationsIfNeeded(position2, itemInfo4);
        }
        this.movingInFromStartBound.clear();
        this.movingInFromEndBound.clear();
        this.movingAwayToStartBound.clear();
        this.movingAwayToEndBound.clear();
        this.movingAwayKeys.clear();
    }
}
