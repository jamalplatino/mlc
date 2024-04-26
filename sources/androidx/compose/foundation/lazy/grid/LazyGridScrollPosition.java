package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J#\u0010\u0016\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0005J%\u0010\u0019\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0003H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0005J\u000e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R4\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@BX\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000R+\u0010\u0012\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00038F@BX\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000e\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridScrollPosition;", "", "initialIndex", "", "initialScrollOffset", "(II)V", "hadFirstNotEmptyLayout", "", "<set-?>", "Landroidx/compose/foundation/lazy/grid/ItemIndex;", "index", "getIndex-VZbfaAc", "()I", "setIndex-YGsSkvE", "(I)V", "index$delegate", "Landroidx/compose/runtime/MutableState;", "lastKnownFirstItemKey", "scrollOffset", "getScrollOffset", "setScrollOffset", "scrollOffset$delegate", "requestPosition", "", "requestPosition-yO3Fmg4", "update", "update-yO3Fmg4", "updateFromMeasureResult", "measureResult", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "updateScrollPositionIfTheFirstItemWasMoved", "itemProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: LazyGridScrollPosition.kt */
public final class LazyGridScrollPosition {
    private boolean hadFirstNotEmptyLayout;
    private final MutableState index$delegate;
    private Object lastKnownFirstItemKey;
    private final MutableState scrollOffset$delegate;

    public LazyGridScrollPosition() {
        this(0, 0, 3, (DefaultConstructorMarker) null);
    }

    public LazyGridScrollPosition(int i, int i2) {
        this.index$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ItemIndex.m665boximpl(ItemIndex.m667constructorimpl(i)), (SnapshotMutationPolicy) null, 2, (Object) null);
        this.scrollOffset$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(i2), (SnapshotMutationPolicy) null, 2, (Object) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LazyGridScrollPosition(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    /* renamed from: setIndex-YGsSkvE  reason: not valid java name */
    private final void m708setIndexYGsSkvE(int i) {
        this.index$delegate.setValue(ItemIndex.m665boximpl(i));
    }

    /* renamed from: getIndex-VZbfaAc  reason: not valid java name */
    public final int m710getIndexVZbfaAc() {
        return ((ItemIndex) this.index$delegate.getValue()).m677unboximpl();
    }

    private final void setScrollOffset(int i) {
        this.scrollOffset$delegate.setValue(Integer.valueOf(i));
    }

    public final int getScrollOffset() {
        return ((Number) this.scrollOffset$delegate.getValue()).intValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        r0 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem) kotlin.collections.ArraysKt.firstOrNull((T[]) (r0 = r0.getItems()));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void updateFromMeasureResult(androidx.compose.foundation.lazy.grid.LazyGridMeasureResult r4) {
        /*
            r3 = this;
            java.lang.String r0 = "measureResult"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine r0 = r4.getFirstVisibleLine()
            if (r0 == 0) goto L_0x001f
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem[] r0 = r0.getItems()
            if (r0 == 0) goto L_0x001f
            java.lang.Object r0 = kotlin.collections.ArraysKt.firstOrNull((T[]) r0)
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem r0 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem) r0
            if (r0 == 0) goto L_0x001f
            java.lang.Object r0 = r0.getKey()
            goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            r3.lastKnownFirstItemKey = r0
            boolean r0 = r3.hadFirstNotEmptyLayout
            if (r0 != 0) goto L_0x002c
            int r0 = r4.getTotalItemsCount()
            if (r0 <= 0) goto L_0x006c
        L_0x002c:
            r0 = 1
            r3.hadFirstNotEmptyLayout = r0
            int r0 = r4.getFirstVisibleLineScrollOffset()
            float r1 = (float) r0
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L_0x0077
            androidx.compose.runtime.snapshots.Snapshot$Companion r1 = androidx.compose.runtime.snapshots.Snapshot.Companion
            androidx.compose.runtime.snapshots.Snapshot r1 = r1.createNonObservableSnapshot()
            androidx.compose.runtime.snapshots.Snapshot r2 = r1.makeCurrent()     // Catch:{ all -> 0x0072 }
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine r4 = r4.getFirstVisibleLine()     // Catch:{ all -> 0x006d }
            if (r4 == 0) goto L_0x005c
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem[] r4 = r4.getItems()     // Catch:{ all -> 0x006d }
            if (r4 == 0) goto L_0x005c
            java.lang.Object r4 = kotlin.collections.ArraysKt.firstOrNull((T[]) r4)     // Catch:{ all -> 0x006d }
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem r4 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem) r4     // Catch:{ all -> 0x006d }
            if (r4 == 0) goto L_0x005c
            int r4 = r4.m701getIndexVZbfaAc()     // Catch:{ all -> 0x006d }
            goto L_0x005d
        L_0x005c:
            r4 = 0
        L_0x005d:
            int r4 = androidx.compose.foundation.lazy.grid.ItemIndex.m667constructorimpl(r4)     // Catch:{ all -> 0x006d }
            r3.m709updateyO3Fmg4(r4, r0)     // Catch:{ all -> 0x006d }
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x006d }
            r1.restoreCurrent(r2)     // Catch:{ all -> 0x0072 }
            r1.dispose()
        L_0x006c:
            return
        L_0x006d:
            r4 = move-exception
            r1.restoreCurrent(r2)     // Catch:{ all -> 0x0072 }
            throw r4     // Catch:{ all -> 0x0072 }
        L_0x0072:
            r4 = move-exception
            r1.dispose()
            throw r4
        L_0x0077:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r1 = "scrollOffset should be non-negative ("
            r4.<init>(r1)
            java.lang.StringBuilder r4 = r4.append(r0)
            r0 = 41
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridScrollPosition.updateFromMeasureResult(androidx.compose.foundation.lazy.grid.LazyGridMeasureResult):void");
    }

    /* renamed from: requestPosition-yO3Fmg4  reason: not valid java name */
    public final void m711requestPositionyO3Fmg4(int i, int i2) {
        m709updateyO3Fmg4(i, i2);
        this.lastKnownFirstItemKey = null;
    }

    public final void updateScrollPositionIfTheFirstItemWasMoved(LazyGridItemProvider lazyGridItemProvider) {
        Snapshot makeCurrent;
        Intrinsics.checkNotNullParameter(lazyGridItemProvider, "itemProvider");
        Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
        try {
            makeCurrent = createNonObservableSnapshot.makeCurrent();
            m709updateyO3Fmg4(ItemIndex.m667constructorimpl(LazyLayoutItemProviderKt.findIndexByKey(lazyGridItemProvider, this.lastKnownFirstItemKey, m710getIndexVZbfaAc())), getScrollOffset());
            Unit unit = Unit.INSTANCE;
            createNonObservableSnapshot.restoreCurrent(makeCurrent);
            createNonObservableSnapshot.dispose();
        } catch (Throwable th) {
            createNonObservableSnapshot.dispose();
            throw th;
        }
    }

    /* renamed from: update-yO3Fmg4  reason: not valid java name */
    private final void m709updateyO3Fmg4(int i, int i2) {
        if (((float) i) >= 0.0f) {
            if (!ItemIndex.m670equalsimpl0(i, m710getIndexVZbfaAc())) {
                m708setIndexYGsSkvE(i);
            }
            if (i2 != getScrollOffset()) {
                setScrollOffset(i2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("Index should be non-negative (" + i + ')').toString());
    }
}
