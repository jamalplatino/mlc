package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.snapshots.SnapshotApplyResult;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0015\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b \b\u0017\u0018\u00002\u00020\u0001BC\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0002\u0010\u000bJ\b\u0010.\u001a\u00020\tH\u0002J\r\u0010/\u001a\u00020\tH\u0000¢\u0006\u0002\b0J'\u0010/\u001a\u0002H1\"\u0004\b\u0000\u001012\f\u00102\u001a\b\u0012\u0004\u0012\u0002H103H\bø\u0001\u0000¢\u0006\u0004\b0\u00104J\b\u00105\u001a\u000206H\u0016J\r\u00107\u001a\u00020\tH\u0010¢\u0006\u0002\b8J\b\u00109\u001a\u00020\tH\u0016J\b\u0010:\u001a\u00020\rH\u0016J3\u0010;\u001a\u0002062\u0006\u0010<\u001a\u00020\u00032\u0014\u0010=\u001a\u0010\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020?\u0018\u00010>2\u0006\u0010@\u001a\u00020\u0005H\u0000¢\u0006\u0002\bAJ\u0015\u0010B\u001a\u00020\t2\u0006\u0010C\u001a\u00020\u0001H\u0010¢\u0006\u0002\bDJ\u0015\u0010E\u001a\u00020\t2\u0006\u0010C\u001a\u00020\u0001H\u0010¢\u0006\u0002\bFJ\r\u0010G\u001a\u00020\tH\u0010¢\u0006\u0002\bHJ\u0015\u0010I\u001a\u00020\t2\u0006\u0010J\u001a\u00020\u0014H\u0010¢\u0006\u0002\bKJ\u0015\u0010L\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¢\u0006\u0002\bMJ\u0015\u0010N\u001a\u00020\t2\u0006\u0010,\u001a\u00020\u0005H\u0000¢\u0006\u0002\bOJ\u0015\u0010P\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¢\u0006\u0002\bQJ\u0015\u0010R\u001a\u00020\t2\u0006\u0010S\u001a\u00020 H\u0000¢\u0006\u0002\bTJ\r\u0010U\u001a\u00020\tH\u0010¢\u0006\u0002\bVJ\r\u0010W\u001a\u00020\tH\u0000¢\u0006\u0002\bXJ8\u0010Y\u001a\u00020\u00002\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00072\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H\u0016J\u001e\u0010Z\u001a\u00020\u00012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H\u0016J\r\u0010[\u001a\u00020\tH\u0000¢\u0006\u0002\b\\J\r\u0010]\u001a\u00020\tH\u0000¢\u0006\u0002\b^R\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R4\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u000fR\u0014\u0010)\u001a\u00020\u00018VX\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u000e\u0010,\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\"\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010&\u0002\u0007\n\u0005\b20\u0001¨\u0006_"}, d2 = {"Landroidx/compose/runtime/snapshots/MutableSnapshot;", "Landroidx/compose/runtime/snapshots/Snapshot;", "id", "", "invalid", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "readObserver", "Lkotlin/Function1;", "", "", "writeObserver", "(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "applied", "", "getApplied$runtime_release", "()Z", "setApplied$runtime_release", "(Z)V", "<set-?>", "", "Landroidx/compose/runtime/snapshots/StateObject;", "modified", "getModified$runtime_release", "()Ljava/util/Set;", "setModified", "(Ljava/util/Set;)V", "previousIds", "getPreviousIds$runtime_release", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "setPreviousIds$runtime_release", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "previousPinnedSnapshots", "", "getPreviousPinnedSnapshots$runtime_release", "()[I", "setPreviousPinnedSnapshots$runtime_release", "([I)V", "getReadObserver$runtime_release", "()Lkotlin/jvm/functions/Function1;", "readOnly", "getReadOnly", "root", "getRoot", "()Landroidx/compose/runtime/snapshots/Snapshot;", "snapshots", "getWriteObserver$runtime_release", "abandon", "advance", "advance$runtime_release", "T", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "apply", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "closeLocked", "closeLocked$runtime_release", "dispose", "hasPendingChanges", "innerApplyLocked", "snapshotId", "optimisticMerges", "", "Landroidx/compose/runtime/snapshots/StateRecord;", "invalidSnapshots", "innerApplyLocked$runtime_release", "nestedActivated", "snapshot", "nestedActivated$runtime_release", "nestedDeactivated", "nestedDeactivated$runtime_release", "notifyObjectsInitialized", "notifyObjectsInitialized$runtime_release", "recordModified", "state", "recordModified$runtime_release", "recordPrevious", "recordPrevious$runtime_release", "recordPreviousList", "recordPreviousList$runtime_release", "recordPreviousPinnedSnapshot", "recordPreviousPinnedSnapshot$runtime_release", "recordPreviousPinnedSnapshots", "handles", "recordPreviousPinnedSnapshots$runtime_release", "releasePinnedSnapshotsForCloseLocked", "releasePinnedSnapshotsForCloseLocked$runtime_release", "releasePreviouslyPinnedSnapshotsLocked", "releasePreviouslyPinnedSnapshotsLocked$runtime_release", "takeNestedMutableSnapshot", "takeNestedSnapshot", "validateNotApplied", "validateNotApplied$runtime_release", "validateNotAppliedOrPinned", "validateNotAppliedOrPinned$runtime_release", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: Snapshot.kt */
public class MutableSnapshot extends Snapshot {
    public static final int $stable = 8;
    private boolean applied;
    private Set<StateObject> modified;
    private SnapshotIdSet previousIds = SnapshotIdSet.Companion.getEMPTY();
    private int[] previousPinnedSnapshots = new int[0];
    private final Function1<Object, Unit> readObserver;
    private int snapshots = 1;
    private final Function1<Object, Unit> writeObserver;

    public final boolean getApplied$runtime_release() {
        return this.applied;
    }

    public Set<StateObject> getModified$runtime_release() {
        return this.modified;
    }

    public final SnapshotIdSet getPreviousIds$runtime_release() {
        return this.previousIds;
    }

    public final int[] getPreviousPinnedSnapshots$runtime_release() {
        return this.previousPinnedSnapshots;
    }

    public Function1<Object, Unit> getReadObserver$runtime_release() {
        return this.readObserver;
    }

    public boolean getReadOnly() {
        return false;
    }

    public Function1<Object, Unit> getWriteObserver$runtime_release() {
        return this.writeObserver;
    }

    public void nestedActivated$runtime_release(Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        this.snapshots++;
    }

    public final void setApplied$runtime_release(boolean z) {
        this.applied = z;
    }

    public void setModified(Set<StateObject> set) {
        this.modified = set;
    }

    public final void setPreviousIds$runtime_release(SnapshotIdSet snapshotIdSet) {
        Intrinsics.checkNotNullParameter(snapshotIdSet, "<set-?>");
        this.previousIds = snapshotIdSet;
    }

    public final void setPreviousPinnedSnapshots$runtime_release(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<set-?>");
        this.previousPinnedSnapshots = iArr;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MutableSnapshot(int i, SnapshotIdSet snapshotIdSet, Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
        super(i, snapshotIdSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(snapshotIdSet, "invalid");
        this.readObserver = function1;
        this.writeObserver = function12;
    }

    public boolean hasPendingChanges() {
        Set<StateObject> modified$runtime_release = getModified$runtime_release();
        return modified$runtime_release != null && (modified$runtime_release.isEmpty() ^ true);
    }

    public static /* synthetic */ MutableSnapshot takeNestedMutableSnapshot$default(MutableSnapshot mutableSnapshot, Function1 function1, Function1 function12, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                function1 = null;
            }
            if ((i & 2) != 0) {
                function12 = null;
            }
            return mutableSnapshot.takeNestedMutableSnapshot(function1, function12);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takeNestedMutableSnapshot");
    }

    public MutableSnapshot takeNestedMutableSnapshot(Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
        NestedMutableSnapshot nestedMutableSnapshot;
        validateNotDisposed$runtime_release();
        validateNotAppliedOrPinned$runtime_release();
        recordPrevious$runtime_release(getId());
        synchronized (SnapshotKt.getLock()) {
            int access$getNextSnapshotId$p = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId = access$getNextSnapshotId$p + 1;
            SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(access$getNextSnapshotId$p);
            SnapshotIdSet invalid$runtime_release = getInvalid$runtime_release();
            setInvalid$runtime_release(invalid$runtime_release.set(access$getNextSnapshotId$p));
            nestedMutableSnapshot = new NestedMutableSnapshot(access$getNextSnapshotId$p, SnapshotKt.addRange(invalid$runtime_release, getId() + 1, access$getNextSnapshotId$p), SnapshotKt.mergedReadObserver$default(function1, getReadObserver$runtime_release(), false, 4, (Object) null), SnapshotKt.mergedWriteObserver(function12, getWriteObserver$runtime_release()), this);
        }
        if (!getApplied$runtime_release() && !getDisposed$runtime_release()) {
            int id = getId();
            synchronized (SnapshotKt.getLock()) {
                int access$getNextSnapshotId$p2 = SnapshotKt.nextSnapshotId;
                SnapshotKt.nextSnapshotId = access$getNextSnapshotId$p2 + 1;
                setId$runtime_release(access$getNextSnapshotId$p2);
                SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(getId());
                Unit unit = Unit.INSTANCE;
            }
            setInvalid$runtime_release(SnapshotKt.addRange(getInvalid$runtime_release(), id + 1, getId()));
        }
        return nestedMutableSnapshot;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00e1, code lost:
        r2 = (java.util.List) r1.component1();
        r1 = (java.util.Set) r1.component2();
        r9.applied = true;
        r3 = r1;
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00f3, code lost:
        if (r3 == null) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00f9, code lost:
        if (r3.isEmpty() == false) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00fc, code lost:
        r3 = r2.size();
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0101, code lost:
        if (r5 >= r3) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0103, code lost:
        ((kotlin.jvm.functions.Function2) r2.get(r5)).invoke(r1, r9);
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x010f, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0112, code lost:
        if (r3 == null) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0118, code lost:
        if (r3.isEmpty() == false) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x011b, code lost:
        r3 = r2.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x011f, code lost:
        if (r4 >= r3) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0121, code lost:
        ((kotlin.jvm.functions.Function2) r2.get(r4)).invoke(r0, r9);
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x012d, code lost:
        r2 = androidx.compose.runtime.snapshots.SnapshotKt.getLock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0131, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        releasePinnedSnapshotsForCloseLocked$runtime_release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0135, code lost:
        if (r1 == null) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0137, code lost:
        r1 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0141, code lost:
        if (r1.hasNext() == false) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0143, code lost:
        boolean unused = androidx.compose.runtime.snapshots.SnapshotKt.overwriteUnusedRecordsLocked((androidx.compose.runtime.snapshots.StateObject) r1.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x014d, code lost:
        if (r0 == null) goto L_0x0167;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x014f, code lost:
        r0 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0159, code lost:
        if (r0.hasNext() == false) goto L_0x0165;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x015b, code lost:
        boolean unused = androidx.compose.runtime.snapshots.SnapshotKt.overwriteUnusedRecordsLocked((androidx.compose.runtime.snapshots.StateObject) r0.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0165, code lost:
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0167, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x016c, code lost:
        return androidx.compose.runtime.snapshots.SnapshotApplyResult.Success.INSTANCE;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.compose.runtime.snapshots.SnapshotApplyResult apply() {
        /*
            r9 = this;
            java.util.Set r0 = r9.getModified$runtime_release()
            r1 = 0
            if (r0 == 0) goto L_0x0032
            java.util.concurrent.atomic.AtomicReference r2 = androidx.compose.runtime.snapshots.SnapshotKt.currentGlobalSnapshot
            java.lang.Object r2 = r2.get()
            java.lang.String r3 = "currentGlobalSnapshot.get()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            androidx.compose.runtime.snapshots.MutableSnapshot r2 = (androidx.compose.runtime.snapshots.MutableSnapshot) r2
            androidx.compose.runtime.snapshots.SnapshotIdSet r3 = androidx.compose.runtime.snapshots.SnapshotKt.openSnapshots
            java.util.concurrent.atomic.AtomicReference r4 = androidx.compose.runtime.snapshots.SnapshotKt.currentGlobalSnapshot
            java.lang.Object r4 = r4.get()
            androidx.compose.runtime.snapshots.GlobalSnapshot r4 = (androidx.compose.runtime.snapshots.GlobalSnapshot) r4
            int r4 = r4.getId()
            androidx.compose.runtime.snapshots.SnapshotIdSet r3 = r3.clear(r4)
            java.util.Map r2 = androidx.compose.runtime.snapshots.SnapshotKt.optimisticMerges(r2, r9, r3)
            goto L_0x0033
        L_0x0032:
            r2 = r1
        L_0x0033:
            java.lang.Object r3 = androidx.compose.runtime.snapshots.SnapshotKt.getLock()
            monitor-enter(r3)
            r4 = r9
            androidx.compose.runtime.snapshots.Snapshot r4 = (androidx.compose.runtime.snapshots.Snapshot) r4     // Catch:{ all -> 0x0170 }
            androidx.compose.runtime.snapshots.SnapshotKt.validateOpen(r4)     // Catch:{ all -> 0x0170 }
            r4 = 1
            if (r0 == 0) goto L_0x009c
            int r5 = r0.size()     // Catch:{ all -> 0x0170 }
            if (r5 != 0) goto L_0x0048
            goto L_0x009c
        L_0x0048:
            java.util.concurrent.atomic.AtomicReference r5 = androidx.compose.runtime.snapshots.SnapshotKt.currentGlobalSnapshot     // Catch:{ all -> 0x0170 }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x0170 }
            androidx.compose.runtime.snapshots.GlobalSnapshot r5 = (androidx.compose.runtime.snapshots.GlobalSnapshot) r5     // Catch:{ all -> 0x0170 }
            int r6 = androidx.compose.runtime.snapshots.SnapshotKt.nextSnapshotId     // Catch:{ all -> 0x0170 }
            androidx.compose.runtime.snapshots.SnapshotIdSet r7 = androidx.compose.runtime.snapshots.SnapshotKt.openSnapshots     // Catch:{ all -> 0x0170 }
            int r8 = r5.getId()     // Catch:{ all -> 0x0170 }
            androidx.compose.runtime.snapshots.SnapshotIdSet r7 = r7.clear(r8)     // Catch:{ all -> 0x0170 }
            androidx.compose.runtime.snapshots.SnapshotApplyResult r2 = r9.innerApplyLocked$runtime_release(r6, r2, r7)     // Catch:{ all -> 0x0170 }
            androidx.compose.runtime.snapshots.SnapshotApplyResult$Success r6 = androidx.compose.runtime.snapshots.SnapshotApplyResult.Success.INSTANCE     // Catch:{ all -> 0x0170 }
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r6)     // Catch:{ all -> 0x0170 }
            if (r6 != 0) goto L_0x0070
            monitor-exit(r3)
            return r2
        L_0x0070:
            r9.closeLocked$runtime_release()     // Catch:{ all -> 0x0170 }
            java.lang.String r2 = "previousGlobalSnapshot"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r2)     // Catch:{ all -> 0x0170 }
            r2 = r5
            androidx.compose.runtime.snapshots.Snapshot r2 = (androidx.compose.runtime.snapshots.Snapshot) r2     // Catch:{ all -> 0x0170 }
            kotlin.jvm.functions.Function1 r6 = androidx.compose.runtime.snapshots.SnapshotKt.emptyLambda     // Catch:{ all -> 0x0170 }
            java.lang.Object unused = androidx.compose.runtime.snapshots.SnapshotKt.takeNewGlobalSnapshot(r2, r6)     // Catch:{ all -> 0x0170 }
            java.util.Set r2 = r5.getModified$runtime_release()     // Catch:{ all -> 0x0170 }
            r9.setModified(r1)     // Catch:{ all -> 0x0170 }
            r5.setModified(r1)     // Catch:{ all -> 0x0170 }
            java.util.List r1 = androidx.compose.runtime.snapshots.SnapshotKt.applyObservers     // Catch:{ all -> 0x0170 }
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ all -> 0x0170 }
            java.util.List r1 = kotlin.collections.CollectionsKt.toMutableList(r1)     // Catch:{ all -> 0x0170 }
            kotlin.Pair r1 = kotlin.TuplesKt.to(r1, r2)     // Catch:{ all -> 0x0170 }
            goto L_0x00e0
        L_0x009c:
            r9.closeLocked$runtime_release()     // Catch:{ all -> 0x0170 }
            java.util.concurrent.atomic.AtomicReference r2 = androidx.compose.runtime.snapshots.SnapshotKt.currentGlobalSnapshot     // Catch:{ all -> 0x0170 }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0170 }
            androidx.compose.runtime.snapshots.GlobalSnapshot r2 = (androidx.compose.runtime.snapshots.GlobalSnapshot) r2     // Catch:{ all -> 0x0170 }
            java.lang.String r5 = "previousGlobalSnapshot"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)     // Catch:{ all -> 0x0170 }
            r5 = r2
            androidx.compose.runtime.snapshots.Snapshot r5 = (androidx.compose.runtime.snapshots.Snapshot) r5     // Catch:{ all -> 0x0170 }
            kotlin.jvm.functions.Function1 r6 = androidx.compose.runtime.snapshots.SnapshotKt.emptyLambda     // Catch:{ all -> 0x0170 }
            java.lang.Object unused = androidx.compose.runtime.snapshots.SnapshotKt.takeNewGlobalSnapshot(r5, r6)     // Catch:{ all -> 0x0170 }
            java.util.Set r2 = r2.getModified$runtime_release()     // Catch:{ all -> 0x0170 }
            if (r2 == 0) goto L_0x00d8
            r5 = r2
            java.util.Collection r5 = (java.util.Collection) r5     // Catch:{ all -> 0x0170 }
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x0170 }
            r5 = r5 ^ r4
            if (r5 == 0) goto L_0x00d8
            java.util.List r1 = androidx.compose.runtime.snapshots.SnapshotKt.applyObservers     // Catch:{ all -> 0x0170 }
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ all -> 0x0170 }
            java.util.List r1 = kotlin.collections.CollectionsKt.toMutableList(r1)     // Catch:{ all -> 0x0170 }
            kotlin.Pair r1 = kotlin.TuplesKt.to(r1, r2)     // Catch:{ all -> 0x0170 }
            goto L_0x00e0
        L_0x00d8:
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()     // Catch:{ all -> 0x0170 }
            kotlin.Pair r1 = kotlin.TuplesKt.to(r2, r1)     // Catch:{ all -> 0x0170 }
        L_0x00e0:
            monitor-exit(r3)
            java.lang.Object r2 = r1.component1()
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r1 = r1.component2()
            java.util.Set r1 = (java.util.Set) r1
            r9.applied = r4
            r3 = r1
            java.util.Collection r3 = (java.util.Collection) r3
            r4 = 0
            if (r3 == 0) goto L_0x010f
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x00fc
            goto L_0x010f
        L_0x00fc:
            int r3 = r2.size()
            r5 = r4
        L_0x0101:
            if (r5 >= r3) goto L_0x010f
            java.lang.Object r6 = r2.get(r5)
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            r6.invoke(r1, r9)
            int r5 = r5 + 1
            goto L_0x0101
        L_0x010f:
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            if (r3 == 0) goto L_0x012d
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x011b
            goto L_0x012d
        L_0x011b:
            int r3 = r2.size()
        L_0x011f:
            if (r4 >= r3) goto L_0x012d
            java.lang.Object r5 = r2.get(r4)
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            r5.invoke(r0, r9)
            int r4 = r4 + 1
            goto L_0x011f
        L_0x012d:
            java.lang.Object r2 = androidx.compose.runtime.snapshots.SnapshotKt.getLock()
            monitor-enter(r2)
            r9.releasePinnedSnapshotsForCloseLocked$runtime_release()     // Catch:{ all -> 0x016d }
            if (r1 == 0) goto L_0x014d
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ all -> 0x016d }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x016d }
        L_0x013d:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x016d }
            if (r3 == 0) goto L_0x014d
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x016d }
            androidx.compose.runtime.snapshots.StateObject r3 = (androidx.compose.runtime.snapshots.StateObject) r3     // Catch:{ all -> 0x016d }
            boolean unused = androidx.compose.runtime.snapshots.SnapshotKt.overwriteUnusedRecordsLocked(r3)     // Catch:{ all -> 0x016d }
            goto L_0x013d
        L_0x014d:
            if (r0 == 0) goto L_0x0167
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ all -> 0x016d }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x016d }
        L_0x0155:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x016d }
            if (r1 == 0) goto L_0x0165
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x016d }
            androidx.compose.runtime.snapshots.StateObject r1 = (androidx.compose.runtime.snapshots.StateObject) r1     // Catch:{ all -> 0x016d }
            boolean unused = androidx.compose.runtime.snapshots.SnapshotKt.overwriteUnusedRecordsLocked(r1)     // Catch:{ all -> 0x016d }
            goto L_0x0155
        L_0x0165:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x016d }
        L_0x0167:
            monitor-exit(r2)
            androidx.compose.runtime.snapshots.SnapshotApplyResult$Success r0 = androidx.compose.runtime.snapshots.SnapshotApplyResult.Success.INSTANCE
            androidx.compose.runtime.snapshots.SnapshotApplyResult r0 = (androidx.compose.runtime.snapshots.SnapshotApplyResult) r0
            return r0
        L_0x016d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0170:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.MutableSnapshot.apply():androidx.compose.runtime.snapshots.SnapshotApplyResult");
    }

    public Snapshot getRoot() {
        return this;
    }

    public void dispose() {
        if (!getDisposed$runtime_release()) {
            super.dispose();
            nestedDeactivated$runtime_release(this);
        }
    }

    public Snapshot takeNestedSnapshot(Function1<Object, Unit> function1) {
        NestedReadonlySnapshot nestedReadonlySnapshot;
        validateNotDisposed$runtime_release();
        validateNotAppliedOrPinned$runtime_release();
        int id = getId();
        recordPrevious$runtime_release(getId());
        synchronized (SnapshotKt.getLock()) {
            int access$getNextSnapshotId$p = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId = access$getNextSnapshotId$p + 1;
            SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(access$getNextSnapshotId$p);
            nestedReadonlySnapshot = new NestedReadonlySnapshot(access$getNextSnapshotId$p, SnapshotKt.addRange(getInvalid$runtime_release(), id + 1, access$getNextSnapshotId$p), function1, this);
        }
        if (!getApplied$runtime_release() && !getDisposed$runtime_release()) {
            int id2 = getId();
            synchronized (SnapshotKt.getLock()) {
                int access$getNextSnapshotId$p2 = SnapshotKt.nextSnapshotId;
                SnapshotKt.nextSnapshotId = access$getNextSnapshotId$p2 + 1;
                setId$runtime_release(access$getNextSnapshotId$p2);
                SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(getId());
                Unit unit = Unit.INSTANCE;
            }
            setInvalid$runtime_release(SnapshotKt.addRange(getInvalid$runtime_release(), id2 + 1, getId()));
        }
        return nestedReadonlySnapshot;
    }

    public void nestedDeactivated$runtime_release(Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        int i = this.snapshots;
        if (i > 0) {
            int i2 = i - 1;
            this.snapshots = i2;
            if (i2 == 0 && !this.applied) {
                abandon();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public void notifyObjectsInitialized$runtime_release() {
        if (!this.applied && !getDisposed$runtime_release()) {
            advance$runtime_release();
        }
    }

    public void closeLocked$runtime_release() {
        SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.clear(getId()).andNot(this.previousIds);
    }

    public void releasePinnedSnapshotsForCloseLocked$runtime_release() {
        releasePreviouslyPinnedSnapshotsLocked$runtime_release();
        super.releasePinnedSnapshotsForCloseLocked$runtime_release();
    }

    public final void validateNotApplied$runtime_release() {
        if (!(!this.applied)) {
            throw new IllegalStateException("Unsupported operation on a snapshot that has been applied".toString());
        }
    }

    public final void validateNotAppliedOrPinned$runtime_release() {
        if (this.applied && this.pinningTrackingHandle < 0) {
            throw new IllegalStateException("Unsupported operation on a disposed or applied snapshot".toString());
        }
    }

    private final void abandon() {
        Set<StateObject> modified$runtime_release = getModified$runtime_release();
        if (modified$runtime_release != null) {
            validateNotApplied$runtime_release();
            setModified((Set<StateObject>) null);
            int id = getId();
            for (StateObject firstStateRecord : modified$runtime_release) {
                for (StateRecord firstStateRecord2 = firstStateRecord.getFirstStateRecord(); firstStateRecord2 != null; firstStateRecord2 = firstStateRecord2.getNext$runtime_release()) {
                    if (firstStateRecord2.getSnapshotId$runtime_release() == id || CollectionsKt.contains(this.previousIds, Integer.valueOf(firstStateRecord2.getSnapshotId$runtime_release()))) {
                        firstStateRecord2.setSnapshotId$runtime_release(0);
                    }
                }
            }
        }
        closeAndReleasePinning$runtime_release();
    }

    public final SnapshotApplyResult innerApplyLocked$runtime_release(int i, Map<StateRecord, ? extends StateRecord> map, SnapshotIdSet snapshotIdSet) {
        StateRecord access$readable;
        StateRecord stateRecord;
        Pair pair;
        Intrinsics.checkNotNullParameter(snapshotIdSet, "invalidSnapshots");
        SnapshotIdSet or = getInvalid$runtime_release().set(getId()).or(this.previousIds);
        Set<StateObject> modified$runtime_release = getModified$runtime_release();
        Intrinsics.checkNotNull(modified$runtime_release);
        List list = null;
        List list2 = null;
        for (StateObject next : modified$runtime_release) {
            StateRecord firstStateRecord = next.getFirstStateRecord();
            StateRecord access$readable2 = SnapshotKt.readable(firstStateRecord, i, snapshotIdSet);
            if (!(access$readable2 == null || (access$readable = SnapshotKt.readable(firstStateRecord, getId(), or)) == null || Intrinsics.areEqual((Object) access$readable2, (Object) access$readable))) {
                StateRecord access$readable3 = SnapshotKt.readable(firstStateRecord, getId(), getInvalid$runtime_release());
                if (access$readable3 != null) {
                    if (map == null || (stateRecord = (StateRecord) map.get(access$readable2)) == null) {
                        MutableSnapshot mutableSnapshot = this;
                        stateRecord = next.mergeRecords(access$readable, access$readable2, access$readable3);
                    }
                    if (stateRecord == null) {
                        return new SnapshotApplyResult.Failure(this);
                    }
                    if (!Intrinsics.areEqual((Object) stateRecord, (Object) access$readable3)) {
                        if (Intrinsics.areEqual((Object) stateRecord, (Object) access$readable2)) {
                            if (list == null) {
                                list = new ArrayList();
                            }
                            list.add(TuplesKt.to(next, access$readable2.create()));
                            if (list2 == null) {
                                list2 = new ArrayList();
                            }
                            list2.add(next);
                        } else {
                            if (list == null) {
                                list = new ArrayList();
                            }
                            if (!Intrinsics.areEqual((Object) stateRecord, (Object) access$readable)) {
                                pair = TuplesKt.to(next, stateRecord);
                            } else {
                                pair = TuplesKt.to(next, access$readable.create());
                            }
                            list.add(pair);
                        }
                    }
                } else {
                    Void unused = SnapshotKt.readError();
                    throw new KotlinNothingValueException();
                }
            }
        }
        if (list != null) {
            advance$runtime_release();
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Pair pair2 = (Pair) list.get(i2);
                StateObject stateObject = (StateObject) pair2.component1();
                StateRecord stateRecord2 = (StateRecord) pair2.component2();
                stateRecord2.setSnapshotId$runtime_release(getId());
                synchronized (SnapshotKt.getLock()) {
                    stateRecord2.setNext$runtime_release(stateObject.getFirstStateRecord());
                    stateObject.prependStateRecord(stateRecord2);
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
        if (list2 != null) {
            modified$runtime_release.removeAll(list2);
        }
        return SnapshotApplyResult.Success.INSTANCE;
    }

    public final <T> T advance$runtime_release(Function0<? extends T> function0) {
        Intrinsics.checkNotNullParameter(function0, "block");
        recordPrevious$runtime_release(getId());
        T invoke = function0.invoke();
        if (!getApplied$runtime_release() && !getDisposed$runtime_release()) {
            int id = getId();
            synchronized (SnapshotKt.getLock()) {
                try {
                    int access$getNextSnapshotId$p = SnapshotKt.nextSnapshotId;
                    SnapshotKt.nextSnapshotId = access$getNextSnapshotId$p + 1;
                    setId$runtime_release(access$getNextSnapshotId$p);
                    SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(getId());
                    Unit unit = Unit.INSTANCE;
                    InlineMarker.finallyStart(1);
                } catch (Throwable th) {
                    InlineMarker.finallyStart(1);
                    InlineMarker.finallyEnd(1);
                    throw th;
                }
            }
            InlineMarker.finallyEnd(1);
            setInvalid$runtime_release(SnapshotKt.addRange(getInvalid$runtime_release(), id + 1, getId()));
        }
        return invoke;
    }

    public final void recordPreviousPinnedSnapshot$runtime_release(int i) {
        if (i >= 0) {
            this.previousPinnedSnapshots = ArraysKt.plus(this.previousPinnedSnapshots, i);
        }
    }

    public final void recordPreviousPinnedSnapshots$runtime_release(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "handles");
        if (iArr.length != 0) {
            int[] iArr2 = this.previousPinnedSnapshots;
            if (iArr2.length == 0) {
                this.previousPinnedSnapshots = iArr;
            } else {
                this.previousPinnedSnapshots = ArraysKt.plus(iArr2, iArr);
            }
        }
    }

    public final void releasePreviouslyPinnedSnapshotsLocked$runtime_release() {
        for (int releasePinningLocked : this.previousPinnedSnapshots) {
            SnapshotKt.releasePinningLocked(releasePinningLocked);
        }
    }

    public void recordModified$runtime_release(StateObject stateObject) {
        Intrinsics.checkNotNullParameter(stateObject, "state");
        Set<StateObject> modified$runtime_release = getModified$runtime_release();
        if (modified$runtime_release == null) {
            modified$runtime_release = new HashSet<>();
            setModified(modified$runtime_release);
        }
        modified$runtime_release.add(stateObject);
    }

    public final void advance$runtime_release() {
        recordPrevious$runtime_release(getId());
        Unit unit = Unit.INSTANCE;
        if (!getApplied$runtime_release() && !getDisposed$runtime_release()) {
            int id = getId();
            synchronized (SnapshotKt.getLock()) {
                int access$getNextSnapshotId$p = SnapshotKt.nextSnapshotId;
                SnapshotKt.nextSnapshotId = access$getNextSnapshotId$p + 1;
                setId$runtime_release(access$getNextSnapshotId$p);
                SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(getId());
                Unit unit2 = Unit.INSTANCE;
            }
            setInvalid$runtime_release(SnapshotKt.addRange(getInvalid$runtime_release(), id + 1, getId()));
        }
    }

    public final void recordPrevious$runtime_release(int i) {
        synchronized (SnapshotKt.getLock()) {
            this.previousIds = this.previousIds.set(i);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void recordPreviousList$runtime_release(SnapshotIdSet snapshotIdSet) {
        Intrinsics.checkNotNullParameter(snapshotIdSet, "snapshots");
        synchronized (SnapshotKt.getLock()) {
            this.previousIds = this.previousIds.or(snapshotIdSet);
            Unit unit = Unit.INSTANCE;
        }
    }
}
