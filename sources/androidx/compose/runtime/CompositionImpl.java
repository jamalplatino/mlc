package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.collection.IdentityScopeMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010T\u001a\u00020\u001bH\u0002J\u001e\u0010U\u001a\u00020\u001b2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020.0W2\u0006\u0010X\u001a\u00020\u000fH\u0002J\b\u0010Y\u001a\u00020\u001bH\u0016Jc\u0010Z\u001a\u00020\u001b2Y\u0010\u0012\u001aU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0005¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u001b0\u0014j\u0002`\u001c0\u0013H\u0002J\b\u0010[\u001a\u00020\u001bH\u0016J\b\u0010\\\u001a\u00020\u001bH\u0016J\b\u0010]\u001a\u00020\u001bH\u0002J \u0010^\u001a\u00020\u001b2\u0011\u0010_\u001a\r\u0012\u0004\u0012\u00020\u001b0\u001e¢\u0006\u0002\b\u001fH\u0016¢\u0006\u0002\u0010#J3\u0010`\u001a\u0002Ha\"\u0004\b\u0000\u0010a2\b\u0010b\u001a\u0004\u0018\u00010\u00012\u0006\u0010c\u001a\u00020:2\f\u0010d\u001a\b\u0012\u0004\u0012\u0002Ha0\u001eH\u0016¢\u0006\u0002\u0010eJ\b\u0010f\u001a\u00020\u001bH\u0016J\u0010\u0010g\u001a\u00020\u001b2\u0006\u0010h\u001a\u00020iH\u0016J\b\u0010j\u001a\u00020\u001bH\u0002J\b\u0010k\u001a\u00020\u001bH\u0002J\"\u0010l\u001a\u0002Hm\"\u0004\b\u0000\u0010m2\f\u0010d\u001a\b\u0012\u0004\u0012\u0002Hm0\u001eH\b¢\u0006\u0002\u0010nJK\u0010o\u001a\u0002Hm\"\u0004\b\u0000\u0010m25\u0010d\u001a1\u0012'\u0012%\u0012\u0004\u0012\u00020)\u0012\f\u0012\n\u0012\u0004\u0012\u00020.\u0018\u00010=0<¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u0002Hm0pH\b¢\u0006\u0002\u0010qJ$\u0010r\u001a\u00020\u001b2\u001a\u0010s\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020u\u0012\u0006\u0012\u0004\u0018\u00010u0t0(H\u0016J\u0018\u0010v\u001a\u00020w2\u0006\u0010x\u001a\u00020)2\b\u0010y\u001a\u0004\u0018\u00010.J\b\u0010z\u001a\u00020\u001bH\u0016J\"\u0010{\u001a\u00020w2\u0006\u0010x\u001a\u00020)2\u0006\u0010|\u001a\u00020}2\b\u0010y\u001a\u0004\u0018\u00010.H\u0002J\u000e\u0010~\u001a\u00020\u001b2\u0006\u0010\u001a\u00020:J\u0012\u0010\u0001\u001a\u00020\u001b2\u0007\u0010\u0001\u001a\u00020.H\u0002J\u0017\u0010\u0001\u001a\u00020\u000f2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020.0WH\u0016J\u0017\u0010\u0001\u001a\u00020\u001b2\f\u0010d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001eH\u0016J\t\u0010\u0001\u001a\u00020\u000fH\u0016J\u0017\u0010\u0001\u001a\u00020\u001b2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020.0WH\u0016J\u0012\u0010\u0001\u001a\u00020\u001b2\u0007\u0010\u0001\u001a\u00020.H\u0016J\u0012\u0010\u0001\u001a\u00020\u001b2\u0007\u0010\u0001\u001a\u00020.H\u0016J\u001b\u0010\u0001\u001a\u00020\u001b2\n\u0010h\u001a\u0006\u0012\u0002\b\u000302H\u0000¢\u0006\u0003\b\u0001J\u001f\u0010\u0001\u001a\u00020\u001b2\u0006\u0010y\u001a\u00020.2\u0006\u0010x\u001a\u00020)H\u0000¢\u0006\u0003\b\u0001J!\u0010\u0001\u001a\u00020\u001b2\u0011\u0010_\u001a\r\u0012\u0004\u0012\u00020\u001b0\u001e¢\u0006\u0002\b\u001fH\u0016¢\u0006\u0002\u0010#J\u001d\u0010\u0001\u001a\u0016\u0012\u0004\u0012\u00020)\u0012\f\u0012\n\u0012\u0004\u0012\u00020.\u0018\u00010=0<H\u0002J#\u0010\u0001\u001a\u0002Hm\"\u0004\b\u0000\u0010m2\f\u0010d\u001a\b\u0012\u0004\u0012\u0002Hm0\u001eH\b¢\u0006\u0002\u0010nJ\u0011\u0010\u0001\u001a\u00020\u001b2\u0006\u0010P\u001a\u00020QH\u0002J\t\u0010\u0001\u001a\u00020\u001bH\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000f8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011Ra\u0010\u0012\u001aU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0005¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u001b0\u0014j\u0002`\u001c0\u0013X\u0004¢\u0006\u0002\n\u0000R'\u0010\u001d\u001a\r\u0012\u0004\u0012\u00020\u001b0\u001e¢\u0006\u0002\b\u001fX\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u000e\u0010%\u001a\u00020&X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(8@X\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u001e\u0010,\u001a\u0012\u0012\u0004\u0012\u00020)0\u000bj\b\u0012\u0004\u0012\u00020)`\rX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020.0(8@X\u0004¢\u0006\u0006\u001a\u0004\b/\u0010+R\u0018\u00100\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030201X\u0004¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u0014\u00104\u001a\u00020\u000f8VX\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u0011R\u0014\u00106\u001a\u00020\u000f8VX\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u0011R\u0010\u00108\u001a\u0004\u0018\u00010\u0000X\u000e¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020:X\u000e¢\u0006\u0002\n\u0000R\"\u0010;\u001a\u0016\u0012\u0004\u0012\u00020)\u0012\f\u0012\n\u0012\u0004\u0012\u00020.\u0018\u00010=0<X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010>\u001a\u00020\u000f8VX\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\u0011R\u0014\u0010?\u001a\u00020\u000f8VX\u0004¢\u0006\u0006\u001a\u0004\b?\u0010\u0011R\u0011\u0010@\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b@\u0010\u0011Ra\u0010A\u001aU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0005¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u001b0\u0014j\u0002`\u001c0\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020.X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010C\u001a\b\u0012\u0004\u0012\u00020)01X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010D\u001a\b\u0012\u0004\u0012\u00020)01X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020.0(8@X\u0004¢\u0006\u0006\u001a\u0004\bF\u0010+R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010G\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\u0011\"\u0004\bI\u0010JR\"\u0010K\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010.0Lj\n\u0012\u0006\u0012\u0004\u0018\u00010.`MX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0014\u0010P\u001a\u00020QX\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u0010S¨\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/CompositionImpl;", "Landroidx/compose/runtime/ControlledComposition;", "parent", "Landroidx/compose/runtime/CompositionContext;", "applier", "Landroidx/compose/runtime/Applier;", "recomposeContext", "Lkotlin/coroutines/CoroutineContext;", "(Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/Applier;Lkotlin/coroutines/CoroutineContext;)V", "_recomposeContext", "abandonSet", "Ljava/util/HashSet;", "Landroidx/compose/runtime/RememberObserver;", "Lkotlin/collections/HashSet;", "areChildrenComposing", "", "getAreChildrenComposing", "()Z", "changes", "", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "", "Landroidx/compose/runtime/Change;", "composable", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "getComposable", "()Lkotlin/jvm/functions/Function2;", "setComposable", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "composer", "Landroidx/compose/runtime/ComposerImpl;", "conditionalScopes", "", "Landroidx/compose/runtime/RecomposeScopeImpl;", "getConditionalScopes$runtime_release", "()Ljava/util/List;", "conditionallyInvalidatedScopes", "derivedStateDependencies", "", "getDerivedStateDependencies$runtime_release", "derivedStates", "Landroidx/compose/runtime/collection/IdentityScopeMap;", "Landroidx/compose/runtime/DerivedState;", "disposed", "hasInvalidations", "getHasInvalidations", "hasPendingChanges", "getHasPendingChanges", "invalidationDelegate", "invalidationDelegateGroup", "", "invalidations", "Landroidx/compose/runtime/collection/IdentityArrayMap;", "Landroidx/compose/runtime/collection/IdentityArraySet;", "isComposing", "isDisposed", "isRoot", "lateChanges", "lock", "observations", "observationsProcessed", "observedObjects", "getObservedObjects$runtime_release", "pendingInvalidScopes", "getPendingInvalidScopes$runtime_release", "setPendingInvalidScopes$runtime_release", "(Z)V", "pendingModifications", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/AtomicReference;", "getRecomposeContext", "()Lkotlin/coroutines/CoroutineContext;", "slotTable", "Landroidx/compose/runtime/SlotTable;", "getSlotTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "abandonChanges", "addPendingInvalidationsLocked", "values", "", "forgetConditionalScopes", "applyChanges", "applyChangesInLocked", "applyLateChanges", "changesApplied", "cleanUpDerivedStateObservations", "composeContent", "content", "delegateInvalidations", "R", "to", "groupIndex", "block", "(Landroidx/compose/runtime/ControlledComposition;ILkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "dispose", "disposeUnusedMovableContent", "state", "Landroidx/compose/runtime/MovableContentState;", "drainPendingModificationsForCompositionLocked", "drainPendingModificationsLocked", "guardChanges", "T", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "guardInvalidationsLocked", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "insertMovableContent", "references", "Lkotlin/Pair;", "Landroidx/compose/runtime/MovableContentStateReference;", "invalidate", "Landroidx/compose/runtime/InvalidationResult;", "scope", "instance", "invalidateAll", "invalidateChecked", "anchor", "Landroidx/compose/runtime/Anchor;", "invalidateGroupsWithKey", "key", "invalidateScopeOfLocked", "value", "observesAnyOf", "prepareCompose", "recompose", "recordModificationsOf", "recordReadOf", "recordWriteOf", "removeDerivedStateObservation", "removeDerivedStateObservation$runtime_release", "removeObservation", "removeObservation$runtime_release", "setContent", "takeInvalidations", "trackAbandonedValues", "validateRecomposeScopeAnchors", "verifyConsistent", "RememberEventDispatcher", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: Composition.kt */
public final class CompositionImpl implements ControlledComposition {
    private final CoroutineContext _recomposeContext;
    private final HashSet<RememberObserver> abandonSet;
    private final Applier<?> applier;
    private final List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> changes;
    private Function2<? super Composer, ? super Integer, Unit> composable;
    private final ComposerImpl composer;
    private final HashSet<RecomposeScopeImpl> conditionallyInvalidatedScopes;
    private final IdentityScopeMap<DerivedState<?>> derivedStates;
    private boolean disposed;
    private CompositionImpl invalidationDelegate;
    private int invalidationDelegateGroup;
    private IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> invalidations;
    private final boolean isRoot;
    private final List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> lateChanges;
    private final Object lock;
    private final IdentityScopeMap<RecomposeScopeImpl> observations;
    private final IdentityScopeMap<RecomposeScopeImpl> observationsProcessed;
    private final CompositionContext parent;
    private boolean pendingInvalidScopes;
    private final AtomicReference<Object> pendingModifications;
    private final SlotTable slotTable;

    public final Function2<Composer, Integer, Unit> getComposable() {
        return this.composable;
    }

    public final boolean getPendingInvalidScopes$runtime_release() {
        return this.pendingInvalidScopes;
    }

    public final SlotTable getSlotTable$runtime_release() {
        return this.slotTable;
    }

    public boolean isDisposed() {
        return this.disposed;
    }

    public final boolean isRoot() {
        return this.isRoot;
    }

    public final void setComposable(Function2<? super Composer, ? super Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.composable = function2;
    }

    public final void setPendingInvalidScopes$runtime_release(boolean z) {
        this.pendingInvalidScopes = z;
    }

    public CompositionImpl(CompositionContext compositionContext, Applier<?> applier2, CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(compositionContext, "parent");
        Intrinsics.checkNotNullParameter(applier2, "applier");
        this.parent = compositionContext;
        this.applier = applier2;
        this.pendingModifications = new AtomicReference<>((Object) null);
        this.lock = new Object();
        HashSet<RememberObserver> hashSet = new HashSet<>();
        this.abandonSet = hashSet;
        SlotTable slotTable2 = new SlotTable();
        this.slotTable = slotTable2;
        this.observations = new IdentityScopeMap<>();
        this.conditionallyInvalidatedScopes = new HashSet<>();
        this.derivedStates = new IdentityScopeMap<>();
        List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> arrayList = new ArrayList<>();
        this.changes = arrayList;
        List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> arrayList2 = new ArrayList<>();
        this.lateChanges = arrayList2;
        this.observationsProcessed = new IdentityScopeMap<>();
        this.invalidations = new IdentityArrayMap<>(0, 1, (DefaultConstructorMarker) null);
        ComposerImpl composerImpl = new ComposerImpl(applier2, compositionContext, slotTable2, hashSet, arrayList, arrayList2, this);
        compositionContext.registerComposer$runtime_release(composerImpl);
        this.composer = composerImpl;
        this._recomposeContext = coroutineContext;
        this.isRoot = compositionContext instanceof Recomposer;
        this.composable = ComposableSingletons$CompositionKt.INSTANCE.m2419getLambda1$runtime_release();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CompositionImpl(CompositionContext compositionContext, Applier applier2, CoroutineContext coroutineContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(compositionContext, applier2, (i & 4) != 0 ? null : coroutineContext);
    }

    public final List<Object> getObservedObjects$runtime_release() {
        return ArraysKt.filterNotNull(this.observations.getValues());
    }

    public final List<Object> getDerivedStateDependencies$runtime_release() {
        return ArraysKt.filterNotNull(this.derivedStates.getValues());
    }

    public final List<RecomposeScopeImpl> getConditionalScopes$runtime_release() {
        return CollectionsKt.toList(this.conditionallyInvalidatedScopes);
    }

    public final CoroutineContext getRecomposeContext() {
        CoroutineContext coroutineContext = this._recomposeContext;
        return coroutineContext == null ? this.parent.getRecomposeCoroutineContext$runtime_release() : coroutineContext;
    }

    private final boolean getAreChildrenComposing() {
        return this.composer.getAreChildrenComposing$runtime_release();
    }

    public boolean isComposing() {
        return this.composer.isComposing$runtime_release();
    }

    public void setContent(Function2<? super Composer, ? super Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "content");
        if (!this.disposed) {
            this.composable = function2;
            this.parent.composeInitial$runtime_release(this, function2);
            return;
        }
        throw new IllegalStateException("The composition is disposed".toString());
    }

    private final void drainPendingModificationsForCompositionLocked() {
        Object andSet = this.pendingModifications.getAndSet(CompositionKt.PendingApplyNoModifications);
        if (andSet == null) {
            return;
        }
        if (Intrinsics.areEqual(andSet, CompositionKt.PendingApplyNoModifications)) {
            ComposerKt.composeRuntimeError("pending composition has not been applied");
            throw new KotlinNothingValueException();
        } else if (andSet instanceof Set) {
            addPendingInvalidationsLocked((Set) andSet, true);
        } else if (andSet instanceof Object[]) {
            for (Set addPendingInvalidationsLocked : (Set[]) andSet) {
                addPendingInvalidationsLocked(addPendingInvalidationsLocked, true);
            }
        } else {
            ComposerKt.composeRuntimeError("corrupt pendingModifications drain: " + this.pendingModifications);
            throw new KotlinNothingValueException();
        }
    }

    private final void drainPendingModificationsLocked() {
        Object andSet = this.pendingModifications.getAndSet((Object) null);
        if (Intrinsics.areEqual(andSet, CompositionKt.PendingApplyNoModifications)) {
            return;
        }
        if (andSet instanceof Set) {
            addPendingInvalidationsLocked((Set) andSet, false);
        } else if (andSet instanceof Object[]) {
            for (Set addPendingInvalidationsLocked : (Set[]) andSet) {
                addPendingInvalidationsLocked(addPendingInvalidationsLocked, false);
            }
        } else if (andSet == null) {
            ComposerKt.composeRuntimeError("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new KotlinNothingValueException();
        } else {
            ComposerKt.composeRuntimeError("corrupt pendingModifications drain: " + this.pendingModifications);
            throw new KotlinNothingValueException();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.util.Set<? extends java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.util.Set<? extends java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: java.util.Set<? extends java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: java.util.Set<? extends java.lang.Object>} */
    /* JADX WARNING: type inference failed for: r1v14, types: [java.util.Set[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void recordModificationsOf(java.util.Set<? extends java.lang.Object> r5) {
        /*
            r4 = this;
            java.lang.String r0 = "values"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
        L_0x0006:
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r4.pendingModifications
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L_0x000f
            goto L_0x0019
        L_0x000f:
            java.lang.Object r1 = androidx.compose.runtime.CompositionKt.PendingApplyNoModifications
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            if (r1 == 0) goto L_0x001b
        L_0x0019:
            r1 = r5
            goto L_0x003d
        L_0x001b:
            boolean r1 = r0 instanceof java.util.Set
            if (r1 == 0) goto L_0x002c
            r1 = 2
            java.util.Set[] r1 = new java.util.Set[r1]
            r2 = 0
            r3 = r0
            java.util.Set r3 = (java.util.Set) r3
            r1[r2] = r3
            r2 = 1
            r1[r2] = r5
            goto L_0x003d
        L_0x002c:
            boolean r1 = r0 instanceof java.lang.Object[]
            if (r1 == 0) goto L_0x0055
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            r1 = r0
            java.util.Set[] r1 = (java.util.Set[]) r1
            java.lang.Object[] r1 = kotlin.collections.ArraysKt.plus((T[]) r1, r5)
        L_0x003d:
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r2 = r4.pendingModifications
            boolean r1 = androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(r2, r0, r1)
            if (r1 == 0) goto L_0x0006
            if (r0 != 0) goto L_0x0054
            java.lang.Object r5 = r4.lock
            monitor-enter(r5)
            r4.drainPendingModificationsLocked()     // Catch:{ all -> 0x0051 }
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0051 }
            monitor-exit(r5)
            goto L_0x0054
        L_0x0051:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0054:
            return
        L_0x0055:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "corrupt pendingModifications: "
            r0.<init>(r1)
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r1 = r4.pendingModifications
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.recordModificationsOf(java.util.Set):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0010  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean observesAnyOf(java.util.Set<? extends java.lang.Object> r3) {
        /*
            r2 = this;
            java.lang.String r0 = "values"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.Iterator r3 = r3.iterator()
        L_0x000a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0026
            java.lang.Object r0 = r3.next()
            androidx.compose.runtime.collection.IdentityScopeMap<androidx.compose.runtime.RecomposeScopeImpl> r1 = r2.observations
            boolean r1 = r1.contains(r0)
            if (r1 != 0) goto L_0x0024
            androidx.compose.runtime.collection.IdentityScopeMap<androidx.compose.runtime.DerivedState<?>> r1 = r2.derivedStates
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x000a
        L_0x0024:
            r3 = 1
            return r3
        L_0x0026:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.observesAnyOf(java.util.Set):boolean");
    }

    public void prepareCompose(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "block");
        this.composer.prepareCompose$runtime_release(function0);
    }

    private final void addPendingInvalidationsLocked(Set<? extends Object> set, boolean z) {
        HashSet hashSet;
        boolean z2 = z;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        for (Object next : set) {
            if (next instanceof RecomposeScopeImpl) {
                ((RecomposeScopeImpl) next).invalidateForResult((Object) null);
            } else {
                addPendingInvalidationsLocked$invalidate(this, z2, objectRef, next);
                IdentityScopeMap<DerivedState<?>> identityScopeMap = this.derivedStates;
                int access$find = identityScopeMap.find(next);
                if (access$find >= 0) {
                    IdentityArraySet access$scopeSetAt = identityScopeMap.scopeSetAt(access$find);
                    int size = access$scopeSetAt.size();
                    for (int i = 0; i < size; i++) {
                        addPendingInvalidationsLocked$invalidate(this, z2, objectRef, (DerivedState) access$scopeSetAt.get(i));
                    }
                }
            }
        }
        if (!z2 || !(!this.conditionallyInvalidatedScopes.isEmpty())) {
            HashSet hashSet2 = (HashSet) objectRef.element;
            if (hashSet2 != null) {
                IdentityScopeMap<RecomposeScopeImpl> identityScopeMap2 = this.observations;
                int size2 = identityScopeMap2.getSize();
                int i2 = 0;
                for (int i3 = 0; i3 < size2; i3++) {
                    int i4 = identityScopeMap2.getValueOrder()[i3];
                    IdentityArraySet identityArraySet = identityScopeMap2.getScopeSets()[i4];
                    Intrinsics.checkNotNull(identityArraySet);
                    int size3 = identityArraySet.size();
                    int i5 = 0;
                    for (int i6 = 0; i6 < size3; i6++) {
                        Object obj = identityArraySet.getValues()[i6];
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                        if (!hashSet2.contains((RecomposeScopeImpl) obj)) {
                            if (i5 != i6) {
                                identityArraySet.getValues()[i5] = obj;
                            }
                            i5++;
                        }
                    }
                    int size4 = identityArraySet.size();
                    for (int i7 = i5; i7 < size4; i7++) {
                        identityArraySet.getValues()[i7] = null;
                    }
                    identityArraySet.setSize(i5);
                    if (identityArraySet.size() > 0) {
                        if (i2 != i3) {
                            int i8 = identityScopeMap2.getValueOrder()[i2];
                            identityScopeMap2.getValueOrder()[i2] = i4;
                            identityScopeMap2.getValueOrder()[i3] = i8;
                        }
                        i2++;
                    }
                }
                int size5 = identityScopeMap2.getSize();
                for (int i9 = i2; i9 < size5; i9++) {
                    identityScopeMap2.getValues()[identityScopeMap2.getValueOrder()[i9]] = null;
                }
                identityScopeMap2.setSize(i2);
                cleanUpDerivedStateObservations();
                return;
            }
            return;
        }
        IdentityScopeMap<RecomposeScopeImpl> identityScopeMap3 = this.observations;
        int size6 = identityScopeMap3.getSize();
        int i10 = 0;
        for (int i11 = 0; i11 < size6; i11++) {
            int i12 = identityScopeMap3.getValueOrder()[i11];
            IdentityArraySet identityArraySet2 = identityScopeMap3.getScopeSets()[i12];
            Intrinsics.checkNotNull(identityArraySet2);
            int size7 = identityArraySet2.size();
            int i13 = 0;
            for (int i14 = 0; i14 < size7; i14++) {
                Object obj2 = identityArraySet2.getValues()[i14];
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj2;
                if (!this.conditionallyInvalidatedScopes.contains(recomposeScopeImpl) && ((hashSet = (HashSet) objectRef.element) == null || !hashSet.contains(recomposeScopeImpl))) {
                    if (i13 != i14) {
                        identityArraySet2.getValues()[i13] = obj2;
                    }
                    i13++;
                }
            }
            int size8 = identityArraySet2.size();
            for (int i15 = i13; i15 < size8; i15++) {
                identityArraySet2.getValues()[i15] = null;
            }
            identityArraySet2.setSize(i13);
            if (identityArraySet2.size() > 0) {
                if (i10 != i11) {
                    int i16 = identityScopeMap3.getValueOrder()[i10];
                    identityScopeMap3.getValueOrder()[i10] = i12;
                    identityScopeMap3.getValueOrder()[i11] = i16;
                }
                i10++;
            }
        }
        int size9 = identityScopeMap3.getSize();
        for (int i17 = i10; i17 < size9; i17++) {
            identityScopeMap3.getValues()[identityScopeMap3.getValueOrder()[i17]] = null;
        }
        identityScopeMap3.setSize(i10);
        cleanUpDerivedStateObservations();
        this.conditionallyInvalidatedScopes.clear();
    }

    private static final void addPendingInvalidationsLocked$invalidate(CompositionImpl compositionImpl, boolean z, Ref.ObjectRef<HashSet<RecomposeScopeImpl>> objectRef, Object obj) {
        IdentityScopeMap<RecomposeScopeImpl> identityScopeMap = compositionImpl.observations;
        int access$find = identityScopeMap.find(obj);
        if (access$find >= 0) {
            IdentityArraySet access$scopeSetAt = identityScopeMap.scopeSetAt(access$find);
            int size = access$scopeSetAt.size();
            for (int i = 0; i < size; i++) {
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) access$scopeSetAt.get(i);
                if (!compositionImpl.observationsProcessed.remove(obj, recomposeScopeImpl) && recomposeScopeImpl.invalidateForResult(obj) != InvalidationResult.IGNORED) {
                    if (!recomposeScopeImpl.isConditional() || z) {
                        T t = (HashSet) objectRef.element;
                        if (t == null) {
                            t = new HashSet();
                            objectRef.element = t;
                        }
                        t.add(recomposeScopeImpl);
                    } else {
                        compositionImpl.conditionallyInvalidatedScopes.add(recomposeScopeImpl);
                    }
                }
            }
        }
    }

    public void recordReadOf(Object obj) {
        RecomposeScopeImpl currentRecomposeScope$runtime_release;
        Intrinsics.checkNotNullParameter(obj, "value");
        if (!getAreChildrenComposing() && (currentRecomposeScope$runtime_release = this.composer.getCurrentRecomposeScope$runtime_release()) != null) {
            currentRecomposeScope$runtime_release.setUsed(true);
            this.observations.add(obj, currentRecomposeScope$runtime_release);
            if (obj instanceof DerivedState) {
                this.derivedStates.removeScope(obj);
                for (Object obj2 : ((DerivedState) obj).getDependencies()) {
                    if (obj2 == null) {
                        break;
                    }
                    this.derivedStates.add(obj2, obj);
                }
            }
            currentRecomposeScope$runtime_release.recordRead(obj);
        }
    }

    /* JADX INFO: finally extract failed */
    public void disposeUnusedMovableContent(MovableContentState movableContentState) {
        Intrinsics.checkNotNullParameter(movableContentState, "state");
        RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.abandonSet);
        SlotWriter openWriter = movableContentState.getSlotTable$runtime_release().openWriter();
        try {
            ComposerKt.removeCurrentGroup(openWriter, rememberEventDispatcher);
            Unit unit = Unit.INSTANCE;
            openWriter.close();
            rememberEventDispatcher.dispatchRememberObservers();
            rememberEventDispatcher.dispatchNodeCallbacks();
        } catch (Throwable th) {
            openWriter.close();
            throw th;
        }
    }

    private final void applyChangesInLocked(List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> list) {
        SlotWriter openWriter;
        Object beginSection;
        RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.abandonSet);
        try {
            if (!list.isEmpty()) {
                Object beginSection2 = Trace.INSTANCE.beginSection("Compose:applyChanges");
                try {
                    this.applier.onBeginChanges();
                    openWriter = this.slotTable.openWriter();
                    Applier<?> applier2 = this.applier;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        list.get(i).invoke(applier2, openWriter, rememberEventDispatcher);
                    }
                    list.clear();
                    Unit unit = Unit.INSTANCE;
                    openWriter.close();
                    this.applier.onEndChanges();
                    Unit unit2 = Unit.INSTANCE;
                    Trace.INSTANCE.endSection(beginSection2);
                    rememberEventDispatcher.dispatchRememberObservers();
                    rememberEventDispatcher.dispatchNodeCallbacks();
                    rememberEventDispatcher.dispatchSideEffects();
                    if (this.pendingInvalidScopes) {
                        beginSection = Trace.INSTANCE.beginSection("Compose:unobserve");
                        this.pendingInvalidScopes = false;
                        IdentityScopeMap<RecomposeScopeImpl> identityScopeMap = this.observations;
                        int size2 = identityScopeMap.getSize();
                        int i2 = 0;
                        for (int i3 = 0; i3 < size2; i3++) {
                            int i4 = identityScopeMap.getValueOrder()[i3];
                            IdentityArraySet identityArraySet = identityScopeMap.getScopeSets()[i4];
                            Intrinsics.checkNotNull(identityArraySet);
                            int size3 = identityArraySet.size();
                            int i5 = 0;
                            for (int i6 = 0; i6 < size3; i6++) {
                                Object obj = identityArraySet.getValues()[i6];
                                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                if (!(!((RecomposeScopeImpl) obj).getValid())) {
                                    if (i5 != i6) {
                                        identityArraySet.getValues()[i5] = obj;
                                    }
                                    i5++;
                                }
                            }
                            int size4 = identityArraySet.size();
                            for (int i7 = i5; i7 < size4; i7++) {
                                identityArraySet.getValues()[i7] = null;
                            }
                            identityArraySet.setSize(i5);
                            if (identityArraySet.size() > 0) {
                                if (i2 != i3) {
                                    int i8 = identityScopeMap.getValueOrder()[i2];
                                    identityScopeMap.getValueOrder()[i2] = i4;
                                    identityScopeMap.getValueOrder()[i3] = i8;
                                }
                                i2++;
                            }
                        }
                        int size5 = identityScopeMap.getSize();
                        for (int i9 = i2; i9 < size5; i9++) {
                            identityScopeMap.getValues()[identityScopeMap.getValueOrder()[i9]] = null;
                        }
                        identityScopeMap.setSize(i2);
                        cleanUpDerivedStateObservations();
                        Unit unit3 = Unit.INSTANCE;
                        Trace.INSTANCE.endSection(beginSection);
                    }
                    if (this.lateChanges.isEmpty()) {
                        rememberEventDispatcher.dispatchAbandons();
                    }
                } catch (Throwable th) {
                    Trace.INSTANCE.endSection(beginSection2);
                    throw th;
                }
            } else if (this.lateChanges.isEmpty()) {
                rememberEventDispatcher.dispatchAbandons();
            }
        } catch (Throwable th2) {
            if (this.lateChanges.isEmpty()) {
                rememberEventDispatcher.dispatchAbandons();
            }
            throw th2;
        }
    }

    private final <T> T guardInvalidationsLocked(Function1<? super IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>>, ? extends T> function1) {
        IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> takeInvalidations = takeInvalidations();
        try {
            return function1.invoke(takeInvalidations);
        } catch (Exception e) {
            this.invalidations = takeInvalidations;
            throw e;
        }
    }

    private final void abandonChanges() {
        this.pendingModifications.set((Object) null);
        this.changes.clear();
        this.lateChanges.clear();
        this.abandonSet.clear();
    }

    public <R> R delegateInvalidations(ControlledComposition controlledComposition, int i, Function0<? extends R> function0) {
        Intrinsics.checkNotNullParameter(function0, "block");
        if (controlledComposition == null || Intrinsics.areEqual((Object) controlledComposition, (Object) this) || i < 0) {
            return function0.invoke();
        }
        this.invalidationDelegate = (CompositionImpl) controlledComposition;
        this.invalidationDelegateGroup = i;
        try {
            return function0.invoke();
        } finally {
            this.invalidationDelegate = null;
            this.invalidationDelegateGroup = 0;
        }
    }

    public final InvalidationResult invalidate(RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        Intrinsics.checkNotNullParameter(recomposeScopeImpl, "scope");
        if (recomposeScopeImpl.getDefaultsInScope()) {
            recomposeScopeImpl.setDefaultsInvalid(true);
        }
        Anchor anchor = recomposeScopeImpl.getAnchor();
        if (anchor == null || !this.slotTable.ownsAnchor(anchor) || !anchor.getValid()) {
            return InvalidationResult.IGNORED;
        }
        if (!anchor.getValid()) {
            return InvalidationResult.IGNORED;
        }
        if (!recomposeScopeImpl.getCanRecompose()) {
            return InvalidationResult.IGNORED;
        }
        return invalidateChecked(recomposeScopeImpl, anchor, obj);
    }

    public final void removeObservation$runtime_release(Object obj, RecomposeScopeImpl recomposeScopeImpl) {
        Intrinsics.checkNotNullParameter(obj, "instance");
        Intrinsics.checkNotNullParameter(recomposeScopeImpl, "scope");
        this.observations.remove(obj, recomposeScopeImpl);
    }

    public final void removeDerivedStateObservation$runtime_release(DerivedState<?> derivedState) {
        Intrinsics.checkNotNullParameter(derivedState, "state");
        if (!this.observations.contains(derivedState)) {
            this.derivedStates.removeScope(derivedState);
        }
    }

    private final IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> takeInvalidations() {
        IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> identityArrayMap = this.invalidations;
        this.invalidations = new IdentityArrayMap<>(0, 1, (DefaultConstructorMarker) null);
        return identityArrayMap;
    }

    private final void validateRecomposeScopeAnchors(SlotTable slotTable2) {
        Object[] slots = slotTable2.getSlots();
        Collection arrayList = new ArrayList();
        int i = 0;
        for (Object obj : slots) {
            RecomposeScopeImpl recomposeScopeImpl = obj instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) obj : null;
            if (recomposeScopeImpl != null) {
                arrayList.add(recomposeScopeImpl);
            }
        }
        List list = (List) arrayList;
        int size = list.size();
        while (i < size) {
            RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) list.get(i);
            Anchor anchor = recomposeScopeImpl2.getAnchor();
            if (anchor == null || slotTable2.slotsOf$runtime_release(anchor.toIndexFor(slotTable2)).contains(recomposeScopeImpl2)) {
                i++;
            } else {
                throw new IllegalStateException(("Misaligned anchor " + anchor + " in scope " + recomposeScopeImpl2 + " encountered, scope found at " + ArraysKt.indexOf((T[]) slotTable2.getSlots(), recomposeScopeImpl2)).toString());
            }
        }
    }

    private final <T> T trackAbandonedValues(Function0<? extends T> function0) {
        try {
            T invoke = function0.invoke();
            InlineMarker.finallyStart(1);
            InlineMarker.finallyEnd(1);
            return invoke;
        } catch (Throwable th) {
            InlineMarker.finallyStart(1);
            if (!this.abandonSet.isEmpty()) {
                new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
            }
            InlineMarker.finallyEnd(1);
            throw th;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0016J\u0006\u0010\u0010\u001a\u00020\u000eJ\u0006\u0010\u0011\u001a\u00020\u000eJ\u0006\u0010\u0012\u001a\u00020\u000eJ\u0006\u0010\u0013\u001a\u00020\u000eJ\u0010\u0010\t\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016J\u0016\u0010\u0014\u001a\u00020\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/CompositionImpl$RememberEventDispatcher;", "Landroidx/compose/runtime/RememberManager;", "abandoning", "", "Landroidx/compose/runtime/RememberObserver;", "(Ljava/util/Set;)V", "deactivating", "", "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;", "forgetting", "releasing", "remembering", "sideEffects", "Lkotlin/Function0;", "", "instance", "dispatchAbandons", "dispatchNodeCallbacks", "dispatchRememberObservers", "dispatchSideEffects", "sideEffect", "effect", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: Composition.kt */
    private static final class RememberEventDispatcher implements RememberManager {
        private final Set<RememberObserver> abandoning;
        private List<ComposeNodeLifecycleCallback> deactivating;
        private final List<RememberObserver> forgetting = new ArrayList();
        private List<ComposeNodeLifecycleCallback> releasing;
        private final List<RememberObserver> remembering = new ArrayList();
        private final List<Function0<Unit>> sideEffects = new ArrayList();

        public RememberEventDispatcher(Set<RememberObserver> set) {
            Intrinsics.checkNotNullParameter(set, "abandoning");
            this.abandoning = set;
        }

        public void remembering(RememberObserver rememberObserver) {
            Intrinsics.checkNotNullParameter(rememberObserver, "instance");
            int lastIndexOf = this.forgetting.lastIndexOf(rememberObserver);
            if (lastIndexOf >= 0) {
                this.forgetting.remove(lastIndexOf);
                this.abandoning.remove(rememberObserver);
                return;
            }
            this.remembering.add(rememberObserver);
        }

        public void forgetting(RememberObserver rememberObserver) {
            Intrinsics.checkNotNullParameter(rememberObserver, "instance");
            int lastIndexOf = this.remembering.lastIndexOf(rememberObserver);
            if (lastIndexOf >= 0) {
                this.remembering.remove(lastIndexOf);
                this.abandoning.remove(rememberObserver);
                return;
            }
            this.forgetting.add(rememberObserver);
        }

        public void sideEffect(Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(function0, "effect");
            this.sideEffects.add(function0);
        }

        public void deactivating(ComposeNodeLifecycleCallback composeNodeLifecycleCallback) {
            Intrinsics.checkNotNullParameter(composeNodeLifecycleCallback, "instance");
            List<ComposeNodeLifecycleCallback> list = this.deactivating;
            if (list == null) {
                list = new ArrayList<>();
                this.deactivating = list;
            }
            list.add(composeNodeLifecycleCallback);
        }

        public void releasing(ComposeNodeLifecycleCallback composeNodeLifecycleCallback) {
            Intrinsics.checkNotNullParameter(composeNodeLifecycleCallback, "instance");
            List<ComposeNodeLifecycleCallback> list = this.releasing;
            if (list == null) {
                list = new ArrayList<>();
                this.releasing = list;
            }
            list.add(composeNodeLifecycleCallback);
        }

        public final void dispatchRememberObservers() {
            if (!this.forgetting.isEmpty()) {
                Object beginSection = Trace.INSTANCE.beginSection("Compose:onForgotten");
                try {
                    for (int size = this.forgetting.size() - 1; -1 < size; size--) {
                        RememberObserver rememberObserver = this.forgetting.get(size);
                        if (!this.abandoning.contains(rememberObserver)) {
                            rememberObserver.onForgotten();
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                } finally {
                    Trace.INSTANCE.endSection(beginSection);
                }
            }
            if (!this.remembering.isEmpty()) {
                Object beginSection2 = Trace.INSTANCE.beginSection("Compose:onRemembered");
                try {
                    List<RememberObserver> list = this.remembering;
                    int size2 = list.size();
                    for (int i = 0; i < size2; i++) {
                        RememberObserver rememberObserver2 = list.get(i);
                        this.abandoning.remove(rememberObserver2);
                        rememberObserver2.onRemembered();
                    }
                    Unit unit2 = Unit.INSTANCE;
                } finally {
                    Trace.INSTANCE.endSection(beginSection2);
                }
            }
        }

        public final void dispatchSideEffects() {
            if (!this.sideEffects.isEmpty()) {
                Object beginSection = Trace.INSTANCE.beginSection("Compose:sideeffects");
                try {
                    List<Function0<Unit>> list = this.sideEffects;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        list.get(i).invoke();
                    }
                    this.sideEffects.clear();
                    Unit unit = Unit.INSTANCE;
                } finally {
                    Trace.INSTANCE.endSection(beginSection);
                }
            }
        }

        public final void dispatchAbandons() {
            if (!this.abandoning.isEmpty()) {
                Object beginSection = Trace.INSTANCE.beginSection("Compose:abandons");
                try {
                    Iterator<RememberObserver> it = this.abandoning.iterator();
                    while (it.hasNext()) {
                        it.remove();
                        it.next().onAbandoned();
                    }
                    Unit unit = Unit.INSTANCE;
                } finally {
                    Trace.INSTANCE.endSection(beginSection);
                }
            }
        }

        /* JADX INFO: finally extract failed */
        public final void dispatchNodeCallbacks() {
            List<ComposeNodeLifecycleCallback> list = this.deactivating;
            Collection collection = list;
            if (collection != null && !collection.isEmpty()) {
                Object beginSection = Trace.INSTANCE.beginSection("Compose:deactivations");
                try {
                    for (int size = list.size() - 1; -1 < size; size--) {
                        list.get(size).onDeactivate();
                    }
                    Unit unit = Unit.INSTANCE;
                    Trace.INSTANCE.endSection(beginSection);
                    list.clear();
                } catch (Throwable th) {
                    Trace.INSTANCE.endSection(beginSection);
                    throw th;
                }
            }
            List<ComposeNodeLifecycleCallback> list2 = this.releasing;
            Collection collection2 = list2;
            if (collection2 != null && !collection2.isEmpty()) {
                Object beginSection2 = Trace.INSTANCE.beginSection("Compose:releases");
                try {
                    for (int size2 = list2.size() - 1; -1 < size2; size2--) {
                        list2.get(size2).onRelease();
                    }
                    Unit unit2 = Unit.INSTANCE;
                    Trace.INSTANCE.endSection(beginSection2);
                    list2.clear();
                } catch (Throwable th2) {
                    Trace.INSTANCE.endSection(beginSection2);
                    throw th2;
                }
            }
        }
    }

    public boolean getHasPendingChanges() {
        boolean hasPendingChanges$runtime_release;
        synchronized (this.lock) {
            hasPendingChanges$runtime_release = this.composer.getHasPendingChanges$runtime_release();
        }
        return hasPendingChanges$runtime_release;
    }

    public final void invalidateGroupsWithKey(int i) {
        List<RecomposeScopeImpl> invalidateGroupsWithKey$runtime_release;
        synchronized (this.lock) {
            invalidateGroupsWithKey$runtime_release = this.slotTable.invalidateGroupsWithKey$runtime_release(i);
        }
        if (invalidateGroupsWithKey$runtime_release != null) {
            int size = invalidateGroupsWithKey$runtime_release.size();
            int i2 = 0;
            while (i2 < size) {
                if (invalidateGroupsWithKey$runtime_release.get(i2).invalidateForResult((Object) null) != InvalidationResult.IGNORED) {
                    i2++;
                }
            }
            return;
        }
        if (this.composer.forceRecomposeScopes$runtime_release()) {
            this.parent.invalidate$runtime_release(this);
        }
    }

    public void composeContent(Function2<? super Composer, ? super Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "content");
        try {
            synchronized (this.lock) {
                drainPendingModificationsForCompositionLocked();
                IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> takeInvalidations = takeInvalidations();
                try {
                    this.composer.composeContent$runtime_release(takeInvalidations, function2);
                    Unit unit = Unit.INSTANCE;
                    Unit unit2 = Unit.INSTANCE;
                } catch (Exception e) {
                    this.invalidations = takeInvalidations;
                    throw e;
                }
            }
            Unit unit3 = Unit.INSTANCE;
        } catch (Throwable th) {
            try {
                if (!this.abandonSet.isEmpty()) {
                    new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                }
                throw th;
            } catch (Exception e2) {
                abandonChanges();
                throw e2;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public void dispose() {
        synchronized (this.lock) {
            if (!this.disposed) {
                this.disposed = true;
                this.composable = ComposableSingletons$CompositionKt.INSTANCE.m2420getLambda2$runtime_release();
                List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> deferredChanges$runtime_release = this.composer.getDeferredChanges$runtime_release();
                if (deferredChanges$runtime_release != null) {
                    applyChangesInLocked(deferredChanges$runtime_release);
                }
                boolean z = this.slotTable.getGroupsSize() > 0;
                if (z || (true ^ this.abandonSet.isEmpty())) {
                    RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.abandonSet);
                    if (z) {
                        SlotWriter openWriter = this.slotTable.openWriter();
                        try {
                            ComposerKt.removeCurrentGroup(openWriter, rememberEventDispatcher);
                            Unit unit = Unit.INSTANCE;
                            openWriter.close();
                            this.applier.clear();
                            rememberEventDispatcher.dispatchRememberObservers();
                            rememberEventDispatcher.dispatchNodeCallbacks();
                        } catch (Throwable th) {
                            openWriter.close();
                            throw th;
                        }
                    }
                    rememberEventDispatcher.dispatchAbandons();
                }
                this.composer.dispose$runtime_release();
            }
            Unit unit2 = Unit.INSTANCE;
        }
        this.parent.unregisterComposition$runtime_release(this);
    }

    public boolean getHasInvalidations() {
        boolean z;
        synchronized (this.lock) {
            z = this.invalidations.getSize$runtime_release() > 0;
        }
        return z;
    }

    private final void cleanUpDerivedStateObservations() {
        IdentityScopeMap<DerivedState<?>> identityScopeMap = this.derivedStates;
        int size = identityScopeMap.getSize();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int i3 = identityScopeMap.getValueOrder()[i2];
            IdentityArraySet identityArraySet = identityScopeMap.getScopeSets()[i3];
            Intrinsics.checkNotNull(identityArraySet);
            int size2 = identityArraySet.size();
            int i4 = 0;
            for (int i5 = 0; i5 < size2; i5++) {
                Object obj = identityArraySet.getValues()[i5];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                if (!(!this.observations.contains((DerivedState) obj))) {
                    if (i4 != i5) {
                        identityArraySet.getValues()[i4] = obj;
                    }
                    i4++;
                }
            }
            int size3 = identityArraySet.size();
            for (int i6 = i4; i6 < size3; i6++) {
                identityArraySet.getValues()[i6] = null;
            }
            identityArraySet.setSize(i4);
            if (identityArraySet.size() > 0) {
                if (i != i2) {
                    int i7 = identityScopeMap.getValueOrder()[i];
                    identityScopeMap.getValueOrder()[i] = i3;
                    identityScopeMap.getValueOrder()[i2] = i7;
                }
                i++;
            }
        }
        int size4 = identityScopeMap.getSize();
        for (int i8 = i; i8 < size4; i8++) {
            identityScopeMap.getValues()[identityScopeMap.getValueOrder()[i8]] = null;
        }
        identityScopeMap.setSize(i);
        Iterator<RecomposeScopeImpl> it = this.conditionallyInvalidatedScopes.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator()");
        while (it.hasNext()) {
            if (!it.next().isConditional()) {
                it.remove();
            }
        }
    }

    private final void invalidateScopeOfLocked(Object obj) {
        IdentityScopeMap<RecomposeScopeImpl> identityScopeMap = this.observations;
        int access$find = identityScopeMap.find(obj);
        if (access$find >= 0) {
            IdentityArraySet access$scopeSetAt = identityScopeMap.scopeSetAt(access$find);
            int size = access$scopeSetAt.size();
            for (int i = 0; i < size; i++) {
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) access$scopeSetAt.get(i);
                if (recomposeScopeImpl.invalidateForResult(obj) == InvalidationResult.IMMINENT) {
                    this.observationsProcessed.add(obj, recomposeScopeImpl);
                }
            }
        }
    }

    public void recordWriteOf(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "value");
        synchronized (this.lock) {
            invalidateScopeOfLocked(obj);
            IdentityScopeMap<DerivedState<?>> identityScopeMap = this.derivedStates;
            int access$find = identityScopeMap.find(obj);
            if (access$find >= 0) {
                IdentityArraySet access$scopeSetAt = identityScopeMap.scopeSetAt(access$find);
                int size = access$scopeSetAt.size();
                for (int i = 0; i < size; i++) {
                    invalidateScopeOfLocked((DerivedState) access$scopeSetAt.get(i));
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public boolean recompose() {
        IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> takeInvalidations;
        boolean recompose$runtime_release;
        synchronized (this.lock) {
            drainPendingModificationsForCompositionLocked();
            try {
                takeInvalidations = takeInvalidations();
                recompose$runtime_release = this.composer.recompose$runtime_release(takeInvalidations);
                if (!recompose$runtime_release) {
                    drainPendingModificationsLocked();
                }
            } catch (Exception e) {
                this.invalidations = takeInvalidations;
                throw e;
            } catch (Throwable th) {
                try {
                    if (!this.abandonSet.isEmpty()) {
                        new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                    }
                    throw th;
                } catch (Exception e2) {
                    abandonChanges();
                    throw e2;
                }
            }
        }
        return recompose$runtime_release;
    }

    public void insertMovableContent(List<Pair<MovableContentStateReference, MovableContentStateReference>> list) {
        Intrinsics.checkNotNullParameter(list, "references");
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            } else if (!Intrinsics.areEqual((Object) ((MovableContentStateReference) list.get(i).getFirst()).getComposition$runtime_release(), (Object) this)) {
                break;
            } else {
                i++;
            }
        }
        ComposerKt.runtimeCheck(z);
        try {
            this.composer.insertMovableContentReferences(list);
            Unit unit = Unit.INSTANCE;
        } catch (Exception e) {
            abandonChanges();
            throw e;
        } catch (Throwable th) {
            if (!this.abandonSet.isEmpty()) {
                new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
            }
            throw th;
        }
    }

    public void applyChanges() {
        synchronized (this.lock) {
            try {
                applyChangesInLocked(this.changes);
                drainPendingModificationsLocked();
                Unit unit = Unit.INSTANCE;
                Unit unit2 = Unit.INSTANCE;
            } catch (Exception e) {
                abandonChanges();
                throw e;
            } catch (Throwable th) {
                if (!this.abandonSet.isEmpty()) {
                    new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                }
                throw th;
            }
        }
    }

    public void applyLateChanges() {
        synchronized (this.lock) {
            try {
                if (!this.lateChanges.isEmpty()) {
                    applyChangesInLocked(this.lateChanges);
                }
                Unit unit = Unit.INSTANCE;
                Unit unit2 = Unit.INSTANCE;
            } catch (Exception e) {
                abandonChanges();
                throw e;
            } catch (Throwable th) {
                if (!this.abandonSet.isEmpty()) {
                    new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                }
                throw th;
            }
        }
    }

    public void changesApplied() {
        synchronized (this.lock) {
            try {
                this.composer.changesApplied$runtime_release();
                if (!this.abandonSet.isEmpty()) {
                    new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                }
                Unit unit = Unit.INSTANCE;
                Unit unit2 = Unit.INSTANCE;
            } catch (Exception e) {
                abandonChanges();
                throw e;
            } catch (Throwable th) {
                if (!this.abandonSet.isEmpty()) {
                    new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                }
                throw th;
            }
        }
    }

    private final <T> T guardChanges(Function0<? extends T> function0) {
        try {
            T invoke = function0.invoke();
            InlineMarker.finallyStart(1);
            InlineMarker.finallyEnd(1);
            return invoke;
        } catch (Exception e) {
            abandonChanges();
            throw e;
        } catch (Throwable th) {
            InlineMarker.finallyStart(1);
            if (!this.abandonSet.isEmpty()) {
                new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
            }
            InlineMarker.finallyEnd(1);
            throw th;
        }
    }

    public void invalidateAll() {
        synchronized (this.lock) {
            for (Object obj : this.slotTable.getSlots()) {
                RecomposeScopeImpl recomposeScopeImpl = obj instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) obj : null;
                if (recomposeScopeImpl != null) {
                    recomposeScopeImpl.invalidate();
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public void verifyConsistent() {
        synchronized (this.lock) {
            if (!isComposing()) {
                this.composer.verifyConsistent$runtime_release();
                this.slotTable.verifyWellFormed();
                validateRecomposeScopeAnchors(this.slotTable);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0036, code lost:
        if (r1 == null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003c, code lost:
        return r1.invalidateChecked(r6, r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003d, code lost:
        r5.parent.invalidate$runtime_release(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
        if (isComposing() == false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return androidx.compose.runtime.InvalidationResult.SCHEDULED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return androidx.compose.runtime.InvalidationResult.DEFERRED;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final androidx.compose.runtime.InvalidationResult invalidateChecked(androidx.compose.runtime.RecomposeScopeImpl r6, androidx.compose.runtime.Anchor r7, java.lang.Object r8) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.lock
            monitor-enter(r0)
            androidx.compose.runtime.CompositionImpl r1 = r5.invalidationDelegate     // Catch:{ all -> 0x0051 }
            r2 = 0
            if (r1 == 0) goto L_0x0013
            androidx.compose.runtime.SlotTable r3 = r5.slotTable     // Catch:{ all -> 0x0051 }
            int r4 = r5.invalidationDelegateGroup     // Catch:{ all -> 0x0051 }
            boolean r3 = r3.groupContainsAnchor(r4, r7)     // Catch:{ all -> 0x0051 }
            if (r3 == 0) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r1 = r2
        L_0x0014:
            if (r1 != 0) goto L_0x0035
            boolean r3 = r5.isComposing()     // Catch:{ all -> 0x0051 }
            if (r3 == 0) goto L_0x0028
            androidx.compose.runtime.ComposerImpl r3 = r5.composer     // Catch:{ all -> 0x0051 }
            boolean r3 = r3.tryImminentInvalidation$runtime_release(r6, r8)     // Catch:{ all -> 0x0051 }
            if (r3 == 0) goto L_0x0028
            androidx.compose.runtime.InvalidationResult r6 = androidx.compose.runtime.InvalidationResult.IMMINENT     // Catch:{ all -> 0x0051 }
            monitor-exit(r0)
            return r6
        L_0x0028:
            if (r8 != 0) goto L_0x0030
            androidx.compose.runtime.collection.IdentityArrayMap<androidx.compose.runtime.RecomposeScopeImpl, androidx.compose.runtime.collection.IdentityArraySet<java.lang.Object>> r3 = r5.invalidations     // Catch:{ all -> 0x0051 }
            r3.set(r6, r2)     // Catch:{ all -> 0x0051 }
            goto L_0x0035
        L_0x0030:
            androidx.compose.runtime.collection.IdentityArrayMap<androidx.compose.runtime.RecomposeScopeImpl, androidx.compose.runtime.collection.IdentityArraySet<java.lang.Object>> r2 = r5.invalidations     // Catch:{ all -> 0x0051 }
            androidx.compose.runtime.CompositionKt.addValue(r2, r6, r8)     // Catch:{ all -> 0x0051 }
        L_0x0035:
            monitor-exit(r0)
            if (r1 == 0) goto L_0x003d
            androidx.compose.runtime.InvalidationResult r6 = r1.invalidateChecked(r6, r7, r8)
            return r6
        L_0x003d:
            androidx.compose.runtime.CompositionContext r6 = r5.parent
            r7 = r5
            androidx.compose.runtime.ControlledComposition r7 = (androidx.compose.runtime.ControlledComposition) r7
            r6.invalidate$runtime_release(r7)
            boolean r6 = r5.isComposing()
            if (r6 == 0) goto L_0x004e
            androidx.compose.runtime.InvalidationResult r6 = androidx.compose.runtime.InvalidationResult.DEFERRED
            goto L_0x0050
        L_0x004e:
            androidx.compose.runtime.InvalidationResult r6 = androidx.compose.runtime.InvalidationResult.SCHEDULED
        L_0x0050:
            return r6
        L_0x0051:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.invalidateChecked(androidx.compose.runtime.RecomposeScopeImpl, androidx.compose.runtime.Anchor, java.lang.Object):androidx.compose.runtime.InvalidationResult");
    }
}
