package androidx.compose.ui.text.input;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0003\u001a\u001b\u001cB#\u0012\u001c\u0010\u0002\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\u0010\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0002J&\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00150\u0014\"\b\b\u0000\u0010\u0015*\u00020\u00062\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00150\u0004H\u0007J*\u0010\u0017\u001a\f\u0012\u0004\u0012\u0002H\u00150\nR\u00020\u0000\"\b\b\u0000\u0010\u0015*\u00020\u00062\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00150\u0004H\u0002J%\u0010\u0018\u001a\u0002H\u0015\"\b\b\u0000\u0010\u0015*\u00020\u00062\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00150\u0004H\u0017¢\u0006\u0002\u0010\u0019R&\u0010\b\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\f\u0012\n\u0012\u0002\b\u00030\nR\u00020\u00000\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R$\u0010\u0002\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\r\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl;", "Landroidx/compose/ui/text/input/PlatformTextInputPluginRegistry;", "factory", "Lkotlin/Function2;", "Landroidx/compose/ui/text/input/PlatformTextInputPlugin;", "Landroidx/compose/ui/text/input/PlatformTextInput;", "Landroidx/compose/ui/text/input/PlatformTextInputAdapter;", "(Lkotlin/jvm/functions/Function2;)V", "adaptersByPlugin", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "Landroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl$AdapterWithRefCount;", "adaptersMayNeedDisposal", "", "focusedAdapter", "getFocusedAdapter", "()Landroidx/compose/ui/text/input/PlatformTextInputAdapter;", "focusedPlugin", "disposeTombstonedAdapters", "", "getOrCreateAdapter", "Landroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl$AdapterHandle;", "T", "plugin", "instantiateAdapter", "rememberAdapter", "(Landroidx/compose/ui/text/input/PlatformTextInputPlugin;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/input/PlatformTextInputAdapter;", "AdapterHandle", "AdapterInput", "AdapterWithRefCount", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: PlatformTextInputAdapter.kt */
public final class PlatformTextInputPluginRegistryImpl implements PlatformTextInputPluginRegistry {
    public static final int $stable = 0;
    private final SnapshotStateMap<PlatformTextInputPlugin<?>, AdapterWithRefCount<?>> adaptersByPlugin = SnapshotStateKt.mutableStateMapOf();
    /* access modifiers changed from: private */
    public boolean adaptersMayNeedDisposal;
    private final Function2<PlatformTextInputPlugin<?>, PlatformTextInput, PlatformTextInputAdapter> factory;
    /* access modifiers changed from: private */
    public PlatformTextInputPlugin<?> focusedPlugin;

    public PlatformTextInputPluginRegistryImpl(Function2<? super PlatformTextInputPlugin<?>, ? super PlatformTextInput, ? extends PlatformTextInputAdapter> function2) {
        Intrinsics.checkNotNullParameter(function2, "factory");
        this.factory = function2;
    }

    public final PlatformTextInputAdapter getFocusedAdapter() {
        AdapterWithRefCount adapterWithRefCount = (AdapterWithRefCount) this.adaptersByPlugin.get(this.focusedPlugin);
        if (adapterWithRefCount != null) {
            return adapterWithRefCount.getAdapter();
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [androidx.compose.ui.text.input.PlatformTextInputPlugin<T>, androidx.compose.ui.text.input.PlatformTextInputPlugin, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T extends androidx.compose.ui.text.input.PlatformTextInputAdapter> T rememberAdapter(androidx.compose.ui.text.input.PlatformTextInputPlugin<T> r4, androidx.compose.runtime.Composer r5, int r6) {
        /*
            r3 = this;
            java.lang.String r0 = "plugin"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = -845039128(0xffffffffcda1b9e8, float:-3.39164416E8)
            r5.startReplaceableGroup(r0)
            java.lang.String r1 = "C(rememberAdapter)166@6812L47,171@7094L24,172@7127L1452:PlatformTextInputAdapter.kt#n30j42"
            androidx.compose.runtime.ComposerKt.sourceInformation(r5, r1)
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x001c
            r1 = -1
            java.lang.String r2 = "androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl.rememberAdapter (PlatformTextInputAdapter.kt:161)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r6, r1, r2)
        L_0x001c:
            r6 = 1157296644(0x44faf204, float:2007.563)
            r5.startReplaceableGroup(r6)
            java.lang.String r6 = "C(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r5, r6)
            boolean r6 = r5.changed((java.lang.Object) r4)
            java.lang.Object r0 = r5.rememberedValue()
            if (r6 != 0) goto L_0x0039
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r6 = r6.getEmpty()
            if (r0 != r6) goto L_0x0040
        L_0x0039:
            androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl$AdapterHandle r0 = r3.getOrCreateAdapter(r4)
            r5.updateRememberedValue(r0)
        L_0x0040:
            r5.endReplaceableGroup()
            androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl$AdapterHandle r0 = (androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl.AdapterHandle) r0
            r4 = 773894976(0x2e20b340, float:3.6538994E-11)
            r5.startReplaceableGroup(r4)
            java.lang.String r4 = "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r5, r4)
            r4 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r5.startReplaceableGroup(r4)
            java.lang.String r4 = "C(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r5, r4)
            java.lang.Object r4 = r5.rememberedValue()
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r6 = r6.getEmpty()
            if (r4 != r6) goto L_0x0078
            kotlin.coroutines.EmptyCoroutineContext r4 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlin.coroutines.CoroutineContext r4 = (kotlin.coroutines.CoroutineContext) r4
            kotlinx.coroutines.CoroutineScope r4 = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(r4, r5)
            androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller r6 = new androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller
            r6.<init>(r4)
            r5.updateRememberedValue(r6)
            r4 = r6
        L_0x0078:
            r5.endReplaceableGroup()
            androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller r4 = (androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) r4
            kotlinx.coroutines.CoroutineScope r4 = r4.getCoroutineScope()
            r5.endReplaceableGroup()
            androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl$rememberAdapter$1 r6 = new androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl$rememberAdapter$1
            r6.<init>(r0, r4, r3)
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            r4 = 8
            androidx.compose.runtime.EffectsKt.DisposableEffect((java.lang.Object) r0, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) r6, (androidx.compose.runtime.Composer) r5, (int) r4)
            androidx.compose.ui.text.input.PlatformTextInputAdapter r4 = r0.getAdapter()
            boolean r6 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r6 == 0) goto L_0x009d
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x009d:
            r5.endReplaceableGroup()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl.rememberAdapter(androidx.compose.ui.text.input.PlatformTextInputPlugin, androidx.compose.runtime.Composer, int):androidx.compose.ui.text.input.PlatformTextInputAdapter");
    }

    public final <T extends PlatformTextInputAdapter> AdapterHandle<T> getOrCreateAdapter(PlatformTextInputPlugin<T> platformTextInputPlugin) {
        Intrinsics.checkNotNullParameter(platformTextInputPlugin, "plugin");
        AdapterWithRefCount<T> adapterWithRefCount = this.adaptersByPlugin.get(platformTextInputPlugin);
        if (adapterWithRefCount == null) {
            adapterWithRefCount = instantiateAdapter(platformTextInputPlugin);
        }
        adapterWithRefCount.incrementRefCount();
        return new AdapterHandle<>(adapterWithRefCount.getAdapter(), new PlatformTextInputPluginRegistryImpl$getOrCreateAdapter$1(adapterWithRefCount));
    }

    /* access modifiers changed from: private */
    public final void disposeTombstonedAdapters() {
        if (this.adaptersMayNeedDisposal) {
            this.adaptersMayNeedDisposal = false;
            Collection arrayList = new ArrayList();
            for (Object next : this.adaptersByPlugin.entrySet()) {
                if (((AdapterWithRefCount) ((Map.Entry) next).getValue()).isRefCountZero()) {
                    arrayList.add(next);
                }
            }
            List list = (List) arrayList;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Map.Entry entry = (Map.Entry) list.get(i);
                PlatformTextInputPlugin platformTextInputPlugin = (PlatformTextInputPlugin) entry.getKey();
                AdapterWithRefCount adapterWithRefCount = (AdapterWithRefCount) entry.getValue();
                if (Intrinsics.areEqual((Object) this.focusedPlugin, (Object) platformTextInputPlugin)) {
                    this.focusedPlugin = null;
                }
                this.adaptersByPlugin.remove(platformTextInputPlugin);
                PlatformTextInputAdapter_androidKt.dispose(adapterWithRefCount.getAdapter());
            }
        }
    }

    private final <T extends PlatformTextInputAdapter> AdapterWithRefCount<T> instantiateAdapter(PlatformTextInputPlugin<T> platformTextInputPlugin) {
        PlatformTextInputAdapter invoke = this.factory.invoke(platformTextInputPlugin, new AdapterInput(this, platformTextInputPlugin));
        Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type T of androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl.instantiateAdapter");
        AdapterWithRefCount<T> adapterWithRefCount = new AdapterWithRefCount<>(this, invoke);
        this.adaptersByPlugin.put(platformTextInputPlugin, adapterWithRefCount);
        return adapterWithRefCount;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u001b\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\u0006\u0010\r\u001a\u00020\u0007R\u0013\u0010\u0004\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u000e\u0010\f\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl$AdapterHandle;", "T", "Landroidx/compose/ui/text/input/PlatformTextInputAdapter;", "", "adapter", "onDispose", "Lkotlin/Function0;", "", "(Landroidx/compose/ui/text/input/PlatformTextInputAdapter;Lkotlin/jvm/functions/Function0;)V", "getAdapter", "()Landroidx/compose/ui/text/input/PlatformTextInputAdapter;", "Landroidx/compose/ui/text/input/PlatformTextInputAdapter;", "disposed", "dispose", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: PlatformTextInputAdapter.kt */
    public static final class AdapterHandle<T extends PlatformTextInputAdapter> {
        public static final int $stable = 8;
        private final T adapter;
        private boolean disposed;
        private final Function0<Boolean> onDispose;

        public final T getAdapter() {
            return this.adapter;
        }

        public AdapterHandle(T t, Function0<Boolean> function0) {
            Intrinsics.checkNotNullParameter(t, "adapter");
            Intrinsics.checkNotNullParameter(function0, "onDispose");
            this.adapter = t;
            this.onDispose = function0;
        }

        public final boolean dispose() {
            if (!this.disposed) {
                this.disposed = true;
                return this.onDispose.invoke().booleanValue();
            }
            throw new IllegalStateException("AdapterHandle already disposed".toString());
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0015\u001a\u00020\nJ\u0006\u0010\u0016\u001a\u00020\u0017R\u0013\u0010\u0004\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\t\u0010\u000bR+\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8B@BX\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl$AdapterWithRefCount;", "T", "Landroidx/compose/ui/text/input/PlatformTextInputAdapter;", "", "adapter", "(Landroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl;Landroidx/compose/ui/text/input/PlatformTextInputAdapter;)V", "getAdapter", "()Landroidx/compose/ui/text/input/PlatformTextInputAdapter;", "Landroidx/compose/ui/text/input/PlatformTextInputAdapter;", "isRefCountZero", "", "()Z", "<set-?>", "", "refCount", "getRefCount", "()I", "setRefCount", "(I)V", "refCount$delegate", "Landroidx/compose/runtime/MutableState;", "decrementRefCount", "incrementRefCount", "", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: PlatformTextInputAdapter.kt */
    private final class AdapterWithRefCount<T extends PlatformTextInputAdapter> {
        private final T adapter;
        private final MutableState refCount$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, (SnapshotMutationPolicy) null, 2, (Object) null);
        final /* synthetic */ PlatformTextInputPluginRegistryImpl this$0;

        public final T getAdapter() {
            return this.adapter;
        }

        public AdapterWithRefCount(PlatformTextInputPluginRegistryImpl platformTextInputPluginRegistryImpl, T t) {
            Intrinsics.checkNotNullParameter(t, "adapter");
            this.this$0 = platformTextInputPluginRegistryImpl;
            this.adapter = t;
        }

        private final int getRefCount() {
            return ((Number) this.refCount$delegate.getValue()).intValue();
        }

        private final void setRefCount(int i) {
            this.refCount$delegate.setValue(Integer.valueOf(i));
        }

        public final boolean isRefCountZero() {
            return getRefCount() == 0;
        }

        public final void incrementRefCount() {
            setRefCount(getRefCount() + 1);
        }

        public final boolean decrementRefCount() {
            setRefCount(getRefCount() - 1);
            if (getRefCount() < 0) {
                throw new IllegalStateException(("AdapterWithRefCount.decrementRefCount called too many times (refCount=" + getRefCount() + ')').toString());
            } else if (getRefCount() != 0) {
                return false;
            } else {
                this.this$0.adaptersMayNeedDisposal = true;
                return true;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0012\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl$AdapterInput;", "Landroidx/compose/ui/text/input/PlatformTextInput;", "plugin", "Landroidx/compose/ui/text/input/PlatformTextInputPlugin;", "(Landroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl;Landroidx/compose/ui/text/input/PlatformTextInputPlugin;)V", "releaseInputFocus", "", "requestInputFocus", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: PlatformTextInputAdapter.kt */
    private final class AdapterInput implements PlatformTextInput {
        private final PlatformTextInputPlugin<?> plugin;
        final /* synthetic */ PlatformTextInputPluginRegistryImpl this$0;

        public AdapterInput(PlatformTextInputPluginRegistryImpl platformTextInputPluginRegistryImpl, PlatformTextInputPlugin<?> platformTextInputPlugin) {
            Intrinsics.checkNotNullParameter(platformTextInputPlugin, "plugin");
            this.this$0 = platformTextInputPluginRegistryImpl;
            this.plugin = platformTextInputPlugin;
        }

        public void requestInputFocus() {
            this.this$0.focusedPlugin = this.plugin;
        }

        public void releaseInputFocus() {
            if (Intrinsics.areEqual((Object) this.this$0.focusedPlugin, (Object) this.plugin)) {
                this.this$0.focusedPlugin = null;
            }
        }
    }
}
