package ai.mlc.mlcchat;

import ai.mlc.mlcllm.ChatModule;
import android.app.Application;
import android.content.ClipData;
import android.content.ClipboardManager;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.google.gson.Gson;
import java.io.File;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.concurrent.ThreadsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 52\u00020\u0001:\u0003456B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u001dH\u0002J\u0006\u0010$\u001a\u00020\u001fJ\u0010\u0010%\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u0007H\u0002J\u0006\u0010'\u001a\u00020\u001fJ \u0010(\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\u001dH\u0002J\u0006\u0010*\u001a\u00020\u0007J\u0010\u0010+\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!H\u0002J\u0006\u0010,\u001a\u00020\u001dJ\u0010\u0010-\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020\u0007H\u0002J\b\u0010/\u001a\u00020\u001fH\u0002J\u000e\u00100\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u0007J\u0016\u00101\u001a\u00020\u001f2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u001f03H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0015\u0010\f\u001a\u00060\rR\u00020\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\f\u0012\b\u0012\u00060\u0016R\u00020\u00000\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0006X\u000e¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lai/mlc/mlcchat/AppViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "alertMessage", "Landroidx/compose/runtime/MutableState;", "", "appConfig", "Lai/mlc/mlcchat/AppConfig;", "appDirFile", "Ljava/io/File;", "chatState", "Lai/mlc/mlcchat/AppViewModel$ChatState;", "getChatState", "()Lai/mlc/mlcchat/AppViewModel$ChatState;", "gson", "Lcom/google/gson/Gson;", "modelIdSet", "", "modelList", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Lai/mlc/mlcchat/AppViewModel$ModelState;", "getModelList", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", "modelSampleList", "Lai/mlc/mlcchat/ModelRecord;", "getModelSampleList", "showAlert", "", "addModelConfig", "", "modelConfig", "Lai/mlc/mlcchat/ModelConfig;", "modelUrl", "isBuiltin", "copyError", "deleteModel", "modelId", "dismissAlert", "downloadModelConfig", "modelRecord", "errorMessage", "isModelConfigAllowed", "isShowingAlert", "issueAlert", "error", "loadAppConfig", "requestDeleteModel", "updateAppConfig", "action", "Lkotlin/Function0;", "ChatState", "Companion", "ModelState", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: AppViewModel.kt */
public final class AppViewModel extends AndroidViewModel {
    public static final int $stable = 8;
    public static final String AppConfigFilename = "app-config.json";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String ModelConfigFilename = "mlc-chat-config.json";
    public static final String ModelUrlSuffix = "resolve/main/";
    public static final String ParamsConfigFilename = "ndarray-cache.json";
    private MutableState<String> alertMessage = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
    /* access modifiers changed from: private */
    public AppConfig appConfig = new AppConfig(CollectionsKt.toMutableList(CollectionsKt.emptyList()), CollectionsKt.toMutableList(CollectionsKt.emptyList()));
    /* access modifiers changed from: private */
    public final File appDirFile;
    /* access modifiers changed from: private */
    public final Application application = getApplication();
    private final ChatState chatState = new ChatState();
    /* access modifiers changed from: private */
    public final Gson gson;
    /* access modifiers changed from: private */
    public final Set<String> modelIdSet;
    private final SnapshotStateList<ModelState> modelList = SnapshotStateKt.toMutableStateList(CollectionsKt.emptyList());
    private final SnapshotStateList<ModelRecord> modelSampleList = SnapshotStateKt.toMutableStateList(CollectionsKt.emptyList());
    private MutableState<Boolean> showAlert = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);

    public final ChatState getChatState() {
        return this.chatState;
    }

    public final SnapshotStateList<ModelState> getModelList() {
        return this.modelList;
    }

    public final SnapshotStateList<ModelRecord> getModelSampleList() {
        return this.modelSampleList;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppViewModel(Application application2) {
        super(application2);
        Intrinsics.checkNotNullParameter(application2, "application");
        this.appDirFile = application2.getExternalFilesDir("");
        this.gson = new Gson();
        this.modelIdSet = CollectionsKt.toMutableSet(SetsKt.emptySet());
        loadAppConfig();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lai/mlc/mlcchat/AppViewModel$Companion;", "", "()V", "AppConfigFilename", "", "ModelConfigFilename", "ModelUrlSuffix", "ParamsConfigFilename", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: AppViewModel.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final boolean isShowingAlert() {
        return this.showAlert.getValue().booleanValue();
    }

    public final String errorMessage() {
        return this.alertMessage.getValue();
    }

    public final void dismissAlert() {
        if (this.showAlert.getValue().booleanValue()) {
            this.showAlert.setValue(false);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final void copyError() {
        if (this.showAlert.getValue().booleanValue()) {
            Object systemService = this.application.getSystemService("clipboard");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("MLCChat", errorMessage()));
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* access modifiers changed from: private */
    public final void issueAlert(String str) {
        this.showAlert.setValue(true);
        this.alertMessage.setValue(str);
    }

    public final void requestDeleteModel(String str) {
        Intrinsics.checkNotNullParameter(str, "modelId");
        deleteModel(str);
        issueAlert("Model: " + str + " has been deleted");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004c, code lost:
        kotlin.io.CloseableKt.closeFinally(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004f, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void loadAppConfig() {
        /*
            r8 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = r8.appDirFile
            java.lang.String r2 = "app-config.json"
            r0.<init>(r1, r2)
            boolean r1 = r0.exists()
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L_0x0050
            android.app.Application r0 = r8.application
            android.content.res.AssetManager r0 = r0.getAssets()
            java.io.InputStream r0 = r0.open(r2)
            java.lang.String r1 = "application.assets.open(AppConfigFilename)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.nio.charset.Charset r1 = kotlin.text.Charsets.UTF_8
            java.io.InputStreamReader r2 = new java.io.InputStreamReader
            r2.<init>(r0, r1)
            java.io.Reader r2 = (java.io.Reader) r2
            boolean r0 = r2 instanceof java.io.BufferedReader
            if (r0 == 0) goto L_0x0032
            java.io.BufferedReader r2 = (java.io.BufferedReader) r2
            goto L_0x003a
        L_0x0032:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            r1 = 8192(0x2000, float:1.14794E-41)
            r0.<init>(r2, r1)
            r2 = r0
        L_0x003a:
            java.io.Closeable r2 = (java.io.Closeable) r2
            r0 = r2
            java.io.BufferedReader r0 = (java.io.BufferedReader) r0     // Catch:{ all -> 0x0049 }
            java.io.Reader r0 = (java.io.Reader) r0     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = kotlin.io.TextStreamsKt.readText(r0)     // Catch:{ all -> 0x0049 }
            kotlin.io.CloseableKt.closeFinally(r2, r4)
            goto L_0x0054
        L_0x0049:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004b }
        L_0x004b:
            r1 = move-exception
            kotlin.io.CloseableKt.closeFinally(r2, r0)
            throw r1
        L_0x0050:
            java.lang.String r0 = kotlin.io.FilesKt.readText$default(r0, r4, r3, r4)
        L_0x0054:
            com.google.gson.Gson r1 = r8.gson
            java.lang.Class<ai.mlc.mlcchat.AppConfig> r2 = ai.mlc.mlcchat.AppConfig.class
            java.lang.Object r0 = r1.fromJson((java.lang.String) r0, r2)
            java.lang.String r1 = "gson.fromJson(jsonString, AppConfig::class.java)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            ai.mlc.mlcchat.AppConfig r0 = (ai.mlc.mlcchat.AppConfig) r0
            r8.appConfig = r0
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.List r1 = kotlin.collections.CollectionsKt.toMutableList(r1)
            r0.setModelLibs(r1)
            androidx.compose.runtime.snapshots.SnapshotStateList<ai.mlc.mlcchat.AppViewModel$ModelState> r0 = r8.modelList
            r0.clear()
            java.util.Set<java.lang.String> r0 = r8.modelIdSet
            r0.clear()
            androidx.compose.runtime.snapshots.SnapshotStateList<ai.mlc.mlcchat.ModelRecord> r0 = r8.modelSampleList
            r0.clear()
            ai.mlc.mlcchat.AppConfig r0 = r8.appConfig
            java.util.List r0 = r0.getModelList()
            java.util.Iterator r0 = r0.iterator()
        L_0x008c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x011e
            java.lang.Object r1 = r0.next()
            ai.mlc.mlcchat.ModelRecord r1 = (ai.mlc.mlcchat.ModelRecord) r1
            ai.mlc.mlcchat.AppConfig r2 = r8.appConfig
            java.util.List r2 = r2.getModelLibs()
            java.lang.String r5 = r1.getModelLib()
            r2.add(r5)
            java.io.File r2 = new java.io.File
            java.io.File r5 = r8.appDirFile
            java.lang.String r6 = r1.getModelId()
            r2.<init>(r5, r6)
            java.io.File r5 = new java.io.File
            java.lang.String r6 = "mlc-chat-config.json"
            r5.<init>(r2, r6)
            boolean r2 = r5.exists()
            if (r2 == 0) goto L_0x00ef
            java.lang.String r2 = kotlin.io.FilesKt.readText$default(r5, r4, r3, r4)
            com.google.gson.Gson r5 = r8.gson
            java.lang.Class<ai.mlc.mlcchat.ModelConfig> r6 = ai.mlc.mlcchat.ModelConfig.class
            java.lang.Object r2 = r5.fromJson((java.lang.String) r2, r6)
            ai.mlc.mlcchat.ModelConfig r2 = (ai.mlc.mlcchat.ModelConfig) r2
            java.lang.String r5 = r1.getModelId()
            r2.setModelId(r5)
            java.lang.String r5 = r1.getModelLib()
            r2.setModelLib(r5)
            java.lang.Long r5 = r1.getEstimatedVramBytes()
            r2.setEstimatedVramBytes(r5)
            java.lang.String r5 = "modelConfig"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
            java.lang.String r1 = r1.getModelUrl()
            r8.addModelConfig(r2, r1, r3)
            goto L_0x008c
        L_0x00ef:
            java.lang.String r2 = r1.getModelUrl()
            r5 = 0
            r6 = 2
            java.lang.String r7 = "/"
            boolean r2 = kotlin.text.StringsKt.endsWith$default(r2, r7, r5, r6, r4)
            if (r2 == 0) goto L_0x0102
            java.lang.String r2 = r1.getModelUrl()
            goto L_0x0119
        L_0x0102:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = r1.getModelUrl()
            java.lang.StringBuilder r2 = r2.append(r5)
            r5 = 47
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r2 = r2.toString()
        L_0x0119:
            r8.downloadModelConfig(r2, r1, r3)
            goto L_0x008c
        L_0x011e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.mlc.mlcchat.AppViewModel.loadAppConfig():void");
    }

    private final void updateAppConfig(Function0<Unit> function0) {
        function0.invoke();
        String json = this.gson.toJson((Object) this.appConfig);
        File file = new File(this.appDirFile, AppConfigFilename);
        Intrinsics.checkNotNullExpressionValue(json, "jsonString");
        FilesKt.writeText$default(file, json, (Charset) null, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void addModelConfig(ModelConfig modelConfig, String str, boolean z) {
        if (!this.modelIdSet.contains(modelConfig.getModelId())) {
            this.modelIdSet.add(modelConfig.getModelId());
            SnapshotStateList<ModelState> snapshotStateList = this.modelList;
            StringBuilder append = new StringBuilder().append(str);
            String str2 = "/";
            if (StringsKt.endsWith$default(str, str2, false, 2, (Object) null)) {
                str2 = "";
            }
            snapshotStateList.add(new ModelState(this, modelConfig, append.append(str2).toString(), new File(this.appDirFile, modelConfig.getModelId())));
            if (!z) {
                updateAppConfig(new AppViewModel$addModelConfig$1(this, str, modelConfig));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    private final void deleteModel(String str) {
        File file = new File(this.appDirFile, str);
        FilesKt.deleteRecursively(file);
        if (!file.exists()) {
            this.modelIdSet.remove(str);
            this.modelList.removeIf(new AppViewModel$$ExternalSyntheticLambda0(new AppViewModel$deleteModel$1(str)));
            updateAppConfig(new AppViewModel$deleteModel$2(this, str));
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* access modifiers changed from: private */
    public static final boolean deleteModel$lambda$1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    /* access modifiers changed from: private */
    public final boolean isModelConfigAllowed(ModelConfig modelConfig) {
        if (this.appConfig.getModelLibs().contains(modelConfig.getModelLib())) {
            return true;
        }
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new AppViewModel$isModelConfigAllowed$1(this, modelConfig, (Continuation<? super AppViewModel$isModelConfigAllowed$1>) null), 3, (Object) null);
        return false;
    }

    private final void downloadModelConfig(String str, ModelRecord modelRecord, boolean z) {
        ThreadsKt.thread$default(true, false, (ClassLoader) null, (String) null, 0, new AppViewModel$downloadModelConfig$1(str, this, modelRecord, z), 30, (Object) null);
    }

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020%H\u0002J\b\u0010'\u001a\u00020%H\u0002J\u0006\u0010(\u001a\u00020%J\u0006\u0010)\u001a\u00020%J\u0010\u0010*\u001a\u00020%2\u0006\u0010+\u001a\u00020\u000bH\u0002J\u0010\u0010,\u001a\u00020%2\u0006\u0010+\u001a\u00020\u000bH\u0002J\b\u0010-\u001a\u00020%H\u0002J\u0006\u0010.\u001a\u00020%J\u0006\u0010/\u001a\u00020%J\b\u00100\u001a\u00020%H\u0002J\u0006\u00101\u001a\u00020%J\b\u00102\u001a\u00020%H\u0002J\b\u00103\u001a\u00020%H\u0002J\b\u00104\u001a\u00020%H\u0002J\b\u00105\u001a\u00020%H\u0002J\b\u00106\u001a\u00020%H\u0002J\b\u00107\u001a\u00020%H\u0002J\b\u00108\u001a\u00020%H\u0002J\b\u00109\u001a\u00020%H\u0002R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013XD¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00130\u0017¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00130\u0017¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001a¨\u0006:"}, d2 = {"Lai/mlc/mlcchat/AppViewModel$ModelState;", "", "modelConfig", "Lai/mlc/mlcchat/ModelConfig;", "modelUrl", "", "modelDirFile", "Ljava/io/File;", "(Lai/mlc/mlcchat/AppViewModel;Lai/mlc/mlcchat/ModelConfig;Ljava/lang/String;Ljava/io/File;)V", "downloadingTasks", "", "Lai/mlc/mlcchat/DownloadTask;", "gson", "Lcom/google/gson/Gson;", "id", "Ljava/util/UUID;", "getId", "()Ljava/util/UUID;", "maxDownloadTasks", "", "getModelConfig", "()Lai/mlc/mlcchat/ModelConfig;", "modelInitState", "Landroidx/compose/runtime/MutableState;", "Lai/mlc/mlcchat/ModelInitState;", "getModelInitState", "()Landroidx/compose/runtime/MutableState;", "setModelInitState", "(Landroidx/compose/runtime/MutableState;)V", "paramsConfig", "Lai/mlc/mlcchat/ParamsConfig;", "progress", "getProgress", "remainingTasks", "total", "getTotal", "clear", "", "delete", "downloadParamsConfig", "handleClear", "handleDelete", "handleFinishDownload", "downloadTask", "handleNewDownload", "handleNextDownload", "handlePause", "handleStart", "loadParamsConfig", "startChat", "switchToClearing", "switchToDeleting", "switchToDownloading", "switchToFinished", "switchToIndexing", "switchToInitializing", "switchToPaused", "switchToPausing", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: AppViewModel.kt */
    public final class ModelState {
        private final Set<DownloadTask> downloadingTasks;
        private final Gson gson;
        private final UUID id;
        private final int maxDownloadTasks;
        private final ModelConfig modelConfig;
        /* access modifiers changed from: private */
        public final File modelDirFile;
        private MutableState<ModelInitState> modelInitState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ModelInitState.Initializing, (SnapshotMutationPolicy) null, 2, (Object) null);
        /* access modifiers changed from: private */
        public final String modelUrl;
        private ParamsConfig paramsConfig = new ParamsConfig(CollectionsKt.emptyList());
        private final MutableState<Integer> progress = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, (SnapshotMutationPolicy) null, 2, (Object) null);
        private final Set<DownloadTask> remainingTasks;
        final /* synthetic */ AppViewModel this$0;
        private final MutableState<Integer> total = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(1, (SnapshotMutationPolicy) null, 2, (Object) null);

        public final UUID getId() {
            return this.id;
        }

        public final ModelConfig getModelConfig() {
            return this.modelConfig;
        }

        public final MutableState<ModelInitState> getModelInitState() {
            return this.modelInitState;
        }

        public final MutableState<Integer> getProgress() {
            return this.progress;
        }

        public final MutableState<Integer> getTotal() {
            return this.total;
        }

        public final void setModelInitState(MutableState<ModelInitState> mutableState) {
            Intrinsics.checkNotNullParameter(mutableState, "<set-?>");
            this.modelInitState = mutableState;
        }

        public ModelState(AppViewModel appViewModel, ModelConfig modelConfig2, String str, File file) {
            Intrinsics.checkNotNullParameter(modelConfig2, "modelConfig");
            Intrinsics.checkNotNullParameter(str, "modelUrl");
            Intrinsics.checkNotNullParameter(file, "modelDirFile");
            this.this$0 = appViewModel;
            this.modelConfig = modelConfig2;
            this.modelUrl = str;
            this.modelDirFile = file;
            UUID randomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID()");
            this.id = randomUUID;
            this.remainingTasks = CollectionsKt.toMutableSet(SetsKt.emptySet());
            this.downloadingTasks = CollectionsKt.toMutableSet(SetsKt.emptySet());
            this.maxDownloadTasks = 3;
            this.gson = new Gson();
            switchToInitializing();
        }

        private final void switchToInitializing() {
            if (new File(this.modelDirFile, AppViewModel.ParamsConfigFilename).exists()) {
                loadParamsConfig();
                switchToIndexing();
                return;
            }
            downloadParamsConfig();
        }

        /* access modifiers changed from: private */
        public final void loadParamsConfig() {
            File file = new File(this.modelDirFile, AppViewModel.ParamsConfigFilename);
            if (file.exists()) {
                Object fromJson = this.gson.fromJson(FilesKt.readText$default(file, (Charset) null, 1, (Object) null), ParamsConfig.class);
                Intrinsics.checkNotNullExpressionValue(fromJson, "gson.fromJson(jsonString…ParamsConfig::class.java)");
                this.paramsConfig = (ParamsConfig) fromJson;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        private final void downloadParamsConfig() {
            ThreadsKt.thread$default(true, false, (ClassLoader) null, (String) null, 0, new AppViewModel$ModelState$downloadParamsConfig$1(this, this.this$0), 30, (Object) null);
        }

        public final void handleStart() {
            switchToDownloading();
        }

        public final void handlePause() {
            switchToPausing();
        }

        public final void handleClear() {
            if (this.modelInitState.getValue() == ModelInitState.Downloading || this.modelInitState.getValue() == ModelInitState.Paused || this.modelInitState.getValue() == ModelInitState.Finished) {
                switchToClearing();
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        private final void switchToClearing() {
            if (this.modelInitState.getValue() == ModelInitState.Paused) {
                this.modelInitState.setValue(ModelInitState.Clearing);
                clear();
            } else if (this.modelInitState.getValue() == ModelInitState.Finished) {
                this.modelInitState.setValue(ModelInitState.Clearing);
                if (Intrinsics.areEqual((Object) this.this$0.getChatState().getModelName().getValue(), (Object) this.modelConfig.getModelId())) {
                    this.this$0.getChatState().requestTerminateChat(new AppViewModel$ModelState$switchToClearing$1(this));
                } else {
                    clear();
                }
            } else {
                this.modelInitState.setValue(ModelInitState.Clearing);
            }
        }

        public final void handleDelete() {
            if (this.modelInitState.getValue() == ModelInitState.Downloading || this.modelInitState.getValue() == ModelInitState.Paused || this.modelInitState.getValue() == ModelInitState.Finished) {
                switchToDeleting();
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        private final void switchToDeleting() {
            if (this.modelInitState.getValue() == ModelInitState.Paused) {
                this.modelInitState.setValue(ModelInitState.Deleting);
                delete();
            } else if (this.modelInitState.getValue() == ModelInitState.Finished) {
                this.modelInitState.setValue(ModelInitState.Deleting);
                if (Intrinsics.areEqual((Object) this.this$0.getChatState().getModelName().getValue(), (Object) this.modelConfig.getModelId())) {
                    this.this$0.getChatState().requestTerminateChat(new AppViewModel$ModelState$switchToDeleting$1(this));
                } else {
                    delete();
                }
            } else {
                this.modelInitState.setValue(ModelInitState.Deleting);
            }
        }

        /* access modifiers changed from: private */
        public final void switchToIndexing() {
            this.modelInitState.setValue(ModelInitState.Indexing);
            this.progress.setValue(0);
            this.total.setValue(Integer.valueOf(this.modelConfig.getTokenizerFiles().size() + this.paramsConfig.getParamsRecords().size()));
            for (String next : this.modelConfig.getTokenizerFiles()) {
                File file = new File(this.modelDirFile, next);
                if (file.exists()) {
                    MutableState<Integer> mutableState = this.progress;
                    mutableState.setValue(Integer.valueOf(mutableState.getValue().intValue() + 1));
                    mutableState.getValue();
                } else {
                    this.remainingTasks.add(new DownloadTask(new URL(this.modelUrl + AppViewModel.ModelUrlSuffix + next), file));
                }
            }
            for (ParamsRecord next2 : this.paramsConfig.getParamsRecords()) {
                File file2 = new File(this.modelDirFile, next2.getDataPath());
                if (file2.exists()) {
                    MutableState<Integer> mutableState2 = this.progress;
                    mutableState2.setValue(Integer.valueOf(mutableState2.getValue().intValue() + 1));
                    mutableState2.getValue();
                } else {
                    this.remainingTasks.add(new DownloadTask(new URL(this.modelUrl + AppViewModel.ModelUrlSuffix + next2.getDataPath()), file2));
                }
            }
            if (this.progress.getValue().intValue() < this.total.getValue().intValue()) {
                switchToPaused();
            } else {
                switchToFinished();
            }
        }

        private final void switchToDownloading() {
            this.modelInitState.setValue(ModelInitState.Downloading);
            for (DownloadTask next : this.remainingTasks) {
                if (this.downloadingTasks.size() < this.maxDownloadTasks) {
                    handleNewDownload(next);
                } else {
                    return;
                }
            }
        }

        private final void handleNewDownload(DownloadTask downloadTask) {
            if (this.modelInitState.getValue() != ModelInitState.Downloading) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            } else if (!this.downloadingTasks.contains(downloadTask)) {
                this.downloadingTasks.add(downloadTask);
                ThreadsKt.thread$default(true, false, (ClassLoader) null, (String) null, 0, new AppViewModel$ModelState$handleNewDownload$1(this, downloadTask, this.this$0), 30, (Object) null);
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }

        private final void handleNextDownload() {
            if (this.modelInitState.getValue() == ModelInitState.Downloading) {
                for (DownloadTask next : this.remainingTasks) {
                    if (!this.downloadingTasks.contains(next)) {
                        handleNewDownload(next);
                        return;
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* access modifiers changed from: private */
        public final void handleFinishDownload(DownloadTask downloadTask) {
            this.remainingTasks.remove(downloadTask);
            this.downloadingTasks.remove(downloadTask);
            MutableState<Integer> mutableState = this.progress;
            mutableState.setValue(Integer.valueOf(mutableState.getValue().intValue() + 1));
            mutableState.getValue();
            if (this.modelInitState.getValue() != ModelInitState.Downloading && this.modelInitState.getValue() != ModelInitState.Pausing && this.modelInitState.getValue() != ModelInitState.Clearing && this.modelInitState.getValue() != ModelInitState.Deleting) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            } else if (this.modelInitState.getValue() == ModelInitState.Downloading) {
                if (!this.remainingTasks.isEmpty()) {
                    handleNextDownload();
                } else if (this.downloadingTasks.isEmpty()) {
                    switchToFinished();
                }
            } else if (this.modelInitState.getValue() == ModelInitState.Pausing) {
                if (this.downloadingTasks.isEmpty()) {
                    switchToPaused();
                }
            } else if (this.modelInitState.getValue() == ModelInitState.Clearing) {
                if (this.downloadingTasks.isEmpty()) {
                    clear();
                }
            } else if (this.modelInitState.getValue() == ModelInitState.Deleting && this.downloadingTasks.isEmpty()) {
                delete();
            }
        }

        /* access modifiers changed from: private */
        public final void clear() {
            File[] listFiles = this.modelDirFile.listFiles(new AppViewModel$ModelState$$ExternalSyntheticLambda0(this));
            if (listFiles != null) {
                Intrinsics.checkNotNullExpressionValue(listFiles, "files");
                int length = listFiles.length;
                int i = 0;
                while (i < length) {
                    File file = listFiles[i];
                    Intrinsics.checkNotNullExpressionValue(file, "file");
                    FilesKt.deleteRecursively(file);
                    if (!file.exists()) {
                        i++;
                    } else {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                }
                if (new File(this.modelDirFile, AppViewModel.ModelConfigFilename).exists()) {
                    switchToIndexing();
                    return;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* access modifiers changed from: private */
        public static final boolean clear$lambda$0(ModelState modelState, File file, String str) {
            Intrinsics.checkNotNullParameter(modelState, "this$0");
            return !Intrinsics.areEqual((Object) file, (Object) modelState.modelDirFile) || !Intrinsics.areEqual((Object) str, (Object) AppViewModel.ModelConfigFilename);
        }

        /* access modifiers changed from: private */
        public final void delete() {
            FilesKt.deleteRecursively(this.modelDirFile);
            if (!this.modelDirFile.exists()) {
                this.this$0.requestDeleteModel(this.modelConfig.getModelId());
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        private final void switchToPausing() {
            this.modelInitState.setValue(ModelInitState.Pausing);
        }

        private final void switchToPaused() {
            this.modelInitState.setValue(ModelInitState.Paused);
        }

        private final void switchToFinished() {
            this.modelInitState.setValue(ModelInitState.Finished);
        }

        public final void startChat() {
            ChatState chatState = this.this$0.getChatState();
            ModelConfig modelConfig2 = this.modelConfig;
            String absolutePath = this.modelDirFile.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "modelDirFile.absolutePath");
            chatState.requestReloadChat(modelConfig2, absolutePath);
        }
    }

    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012H\u0002J\u0016\u0010\u001e\u001a\u00020\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001a0!H\u0002J\u0006\u0010\"\u001a\u00020\u001fJ\b\u0010#\u001a\u00020\u001aH\u0002J$\u0010$\u001a\u00020\u001a2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001a0!2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001a0!H\u0002J\u0006\u0010'\u001a\u00020\u001fJ\u0018\u0010(\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020*2\u0006\u0010\u0016\u001a\u00020\u0012H\u0002J\b\u0010+\u001a\u00020\u001aH\u0002J\u0016\u0010,\u001a\u00020\u001a2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001a0!H\u0002J\u000e\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\u0012J\u0016\u0010/\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020*2\u0006\u0010\u0016\u001a\u00020\u0012J\u0006\u00100\u001a\u00020\u001aJ\u0014\u00101\u001a\u00020\u001a2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001a0!J\b\u00102\u001a\u00020\u001aH\u0002J\b\u00103\u001a\u00020\u001aH\u0002J\b\u00104\u001a\u00020\u001aH\u0002J\b\u00105\u001a\u00020\u001aH\u0002J\b\u00106\u001a\u00020\u001aH\u0002J\b\u00107\u001a\u00020\u001aH\u0002J\u0018\u00108\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8B@BX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015¨\u00069"}, d2 = {"Lai/mlc/mlcchat/AppViewModel$ChatState;", "", "(Lai/mlc/mlcchat/AppViewModel;)V", "backend", "Lai/mlc/mlcllm/ChatModule;", "executorService", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "messages", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Lai/mlc/mlcchat/MessageData;", "getMessages", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", "<set-?>", "Landroidx/compose/runtime/MutableState;", "Lai/mlc/mlcchat/ModelChatState;", "modelChatState", "modelLib", "", "modelName", "getModelName", "()Landroidx/compose/runtime/MutableState;", "modelPath", "report", "getReport", "appendMessage", "", "role", "Lai/mlc/mlcchat/MessageRole;", "text", "callBackend", "", "callback", "Lkotlin/Function0;", "chatable", "clearHistory", "interruptChat", "prologue", "epilogue", "interruptable", "mainReloadChat", "modelConfig", "Lai/mlc/mlcchat/ModelConfig;", "mainResetChat", "mainTerminateChat", "requestGenerate", "prompt", "requestReloadChat", "requestResetChat", "requestTerminateChat", "switchToFailed", "switchToGenerating", "switchToReady", "switchToReloading", "switchToResetting", "switchToTerminating", "updateMessage", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: AppViewModel.kt */
    public final class ChatState {
        /* access modifiers changed from: private */
        public final ChatModule backend = new ChatModule();
        private final ExecutorService executorService = Executors.newSingleThreadExecutor();
        private final SnapshotStateList<MessageData> messages = SnapshotStateKt.toMutableStateList(CollectionsKt.emptyList());
        /* access modifiers changed from: private */
        public MutableState<ModelChatState> modelChatState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ModelChatState.Ready, (SnapshotMutationPolicy) null, 2, (Object) null);
        private String modelLib = "";
        private final MutableState<String> modelName = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
        private String modelPath = "";
        private final MutableState<String> report = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);

        public final SnapshotStateList<MessageData> getMessages() {
            return this.messages;
        }

        public final MutableState<String> getModelName() {
            return this.modelName;
        }

        public final MutableState<String> getReport() {
            return this.report;
        }

        public ChatState() {
        }

        /* access modifiers changed from: private */
        public final void mainResetChat() {
            this.executorService.submit(new AppViewModel$ChatState$$ExternalSyntheticLambda0(this, AppViewModel.this));
        }

        /* access modifiers changed from: private */
        public static final void mainResetChat$lambda$0(ChatState chatState, AppViewModel appViewModel) {
            Intrinsics.checkNotNullParameter(chatState, "this$0");
            Intrinsics.checkNotNullParameter(appViewModel, "this$1");
            chatState.callBackend(new AppViewModel$ChatState$mainResetChat$1$1(chatState));
            Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(appViewModel), (CoroutineContext) null, (CoroutineStart) null, new AppViewModel$ChatState$mainResetChat$1$2(chatState, (Continuation<? super AppViewModel$ChatState$mainResetChat$1$2>) null), 3, (Object) null);
        }

        /* access modifiers changed from: private */
        public final void clearHistory() {
            this.messages.clear();
            this.report.setValue("");
        }

        /* access modifiers changed from: private */
        public final void switchToResetting() {
            this.modelChatState.setValue(ModelChatState.Resetting);
        }

        private final void switchToGenerating() {
            this.modelChatState.setValue(ModelChatState.Generating);
        }

        /* access modifiers changed from: private */
        public final void switchToReloading() {
            this.modelChatState.setValue(ModelChatState.Reloading);
        }

        /* access modifiers changed from: private */
        public final void switchToReady() {
            this.modelChatState.setValue(ModelChatState.Ready);
        }

        /* access modifiers changed from: private */
        public final void switchToFailed() {
            this.modelChatState.setValue(ModelChatState.Falied);
        }

        private final boolean callBackend(Function0<Unit> function0) {
            try {
                function0.invoke();
                return true;
            } catch (Exception e) {
                Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(AppViewModel.this), (CoroutineContext) null, (CoroutineStart) null, new AppViewModel$ChatState$callBackend$1(e, this, (Continuation<? super AppViewModel$ChatState$callBackend$1>) null), 3, (Object) null);
                return false;
            }
        }

        public final void requestResetChat() {
            if (interruptable()) {
                interruptChat(new AppViewModel$ChatState$requestResetChat$1(this), new AppViewModel$ChatState$requestResetChat$2(this));
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        private final void interruptChat(Function0<Unit> function0, Function0<Unit> function02) {
            if (!interruptable()) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            } else if (this.modelChatState.getValue() == ModelChatState.Ready) {
                function0.invoke();
                function02.invoke();
            } else if (this.modelChatState.getValue() == ModelChatState.Generating) {
                function0.invoke();
                this.executorService.submit(new AppViewModel$ChatState$$ExternalSyntheticLambda1(AppViewModel.this, function02));
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }

        /* access modifiers changed from: private */
        public static final void interruptChat$lambda$1(AppViewModel appViewModel, Function0 function0) {
            Intrinsics.checkNotNullParameter(appViewModel, "this$0");
            Intrinsics.checkNotNullParameter(function0, "$epilogue");
            Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(appViewModel), (CoroutineContext) null, (CoroutineStart) null, new AppViewModel$ChatState$interruptChat$1$1(function0, (Continuation<? super AppViewModel$ChatState$interruptChat$1$1>) null), 3, (Object) null);
        }

        public final void requestTerminateChat(Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(function0, "callback");
            if (interruptable()) {
                interruptChat(new AppViewModel$ChatState$requestTerminateChat$1(this), new AppViewModel$ChatState$requestTerminateChat$2(this, function0));
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* access modifiers changed from: private */
        public final void mainTerminateChat(Function0<Unit> function0) {
            this.executorService.submit(new AppViewModel$ChatState$$ExternalSyntheticLambda4(this, AppViewModel.this, function0));
        }

        /* access modifiers changed from: private */
        public static final void mainTerminateChat$lambda$2(ChatState chatState, AppViewModel appViewModel, Function0 function0) {
            Intrinsics.checkNotNullParameter(chatState, "this$0");
            Intrinsics.checkNotNullParameter(appViewModel, "this$1");
            Intrinsics.checkNotNullParameter(function0, "$callback");
            chatState.callBackend(new AppViewModel$ChatState$mainTerminateChat$1$1(chatState));
            Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(appViewModel), (CoroutineContext) null, (CoroutineStart) null, new AppViewModel$ChatState$mainTerminateChat$1$2(chatState, function0, (Continuation<? super AppViewModel$ChatState$mainTerminateChat$1$2>) null), 3, (Object) null);
        }

        /* access modifiers changed from: private */
        public final void switchToTerminating() {
            this.modelChatState.setValue(ModelChatState.Terminating);
        }

        public final void requestReloadChat(ModelConfig modelConfig, String str) {
            Intrinsics.checkNotNullParameter(modelConfig, "modelConfig");
            Intrinsics.checkNotNullParameter(str, "modelPath");
            if (Intrinsics.areEqual((Object) this.modelName.getValue(), (Object) modelConfig.getModelId()) && Intrinsics.areEqual((Object) this.modelLib, (Object) modelConfig.getModelLib()) && Intrinsics.areEqual((Object) this.modelPath, (Object) str)) {
                return;
            }
            if (interruptable()) {
                interruptChat(new AppViewModel$ChatState$requestReloadChat$1(this), new AppViewModel$ChatState$requestReloadChat$2(this, modelConfig, str));
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* access modifiers changed from: private */
        public final void mainReloadChat(ModelConfig modelConfig, String str) {
            clearHistory();
            this.modelName.setValue(modelConfig.getModelId());
            this.modelLib = modelConfig.getModelLib();
            this.modelPath = str;
            this.executorService.submit(new AppViewModel$ChatState$$ExternalSyntheticLambda2(AppViewModel.this, this, modelConfig, str));
        }

        /* access modifiers changed from: private */
        public static final void mainReloadChat$lambda$3(AppViewModel appViewModel, ChatState chatState, ModelConfig modelConfig, String str) {
            Intrinsics.checkNotNullParameter(appViewModel, "this$0");
            Intrinsics.checkNotNullParameter(chatState, "this$1");
            Intrinsics.checkNotNullParameter(modelConfig, "$modelConfig");
            Intrinsics.checkNotNullParameter(str, "$modelPath");
            ViewModel viewModel = appViewModel;
            Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(viewModel), (CoroutineContext) null, (CoroutineStart) null, new AppViewModel$ChatState$mainReloadChat$1$1(appViewModel, (Continuation<? super AppViewModel$ChatState$mainReloadChat$1$1>) null), 3, (Object) null);
            if (chatState.callBackend(new AppViewModel$ChatState$mainReloadChat$1$2(chatState, modelConfig, str))) {
                Job unused2 = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(viewModel), (CoroutineContext) null, (CoroutineStart) null, new AppViewModel$ChatState$mainReloadChat$1$3(appViewModel, chatState, (Continuation<? super AppViewModel$ChatState$mainReloadChat$1$3>) null), 3, (Object) null);
            }
        }

        public final void requestGenerate(String str) {
            Intrinsics.checkNotNullParameter(str, "prompt");
            if (chatable()) {
                switchToGenerating();
                this.executorService.submit(new AppViewModel$ChatState$$ExternalSyntheticLambda3(this, str, AppViewModel.this));
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:5:0x0033  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static final void requestGenerate$lambda$4(ai.mlc.mlcchat.AppViewModel.ChatState r6, java.lang.String r7, ai.mlc.mlcchat.AppViewModel r8) {
            /*
                java.lang.String r0 = "this$0"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                java.lang.String r0 = "$prompt"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                java.lang.String r0 = "this$1"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                ai.mlc.mlcchat.MessageRole r0 = ai.mlc.mlcchat.MessageRole.User
                r6.appendMessage(r0, r7)
                ai.mlc.mlcchat.MessageRole r0 = ai.mlc.mlcchat.MessageRole.Bot
                java.lang.String r1 = ""
                r6.appendMessage(r0, r1)
                ai.mlc.mlcchat.AppViewModel$ChatState$requestGenerate$1$1 r0 = new ai.mlc.mlcchat.AppViewModel$ChatState$requestGenerate$1$1
                r0.<init>(r6, r7)
                kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
                boolean r7 = r6.callBackend(r0)
                if (r7 != 0) goto L_0x002b
                return
            L_0x002b:
                ai.mlc.mlcllm.ChatModule r7 = r6.backend
                boolean r7 = r7.stopped()
                if (r7 != 0) goto L_0x004c
                ai.mlc.mlcchat.AppViewModel$ChatState$requestGenerate$1$2 r7 = new ai.mlc.mlcchat.AppViewModel$ChatState$requestGenerate$1$2
                r7.<init>(r6, r8)
                kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
                boolean r7 = r6.callBackend(r7)
                if (r7 != 0) goto L_0x0041
                return
            L_0x0041:
                androidx.compose.runtime.MutableState<ai.mlc.mlcchat.ModelChatState> r7 = r6.modelChatState
                java.lang.Object r7 = r7.getValue()
                ai.mlc.mlcchat.ModelChatState r0 = ai.mlc.mlcchat.ModelChatState.Generating
                if (r7 == r0) goto L_0x002b
                return
            L_0x004c:
                ai.mlc.mlcllm.ChatModule r7 = r6.backend
                java.lang.String r7 = r7.runtimeStatsText()
                androidx.lifecycle.ViewModel r8 = (androidx.lifecycle.ViewModel) r8
                kotlinx.coroutines.CoroutineScope r0 = androidx.lifecycle.ViewModelKt.getViewModelScope(r8)
                r1 = 0
                r2 = 0
                ai.mlc.mlcchat.AppViewModel$ChatState$requestGenerate$1$3 r8 = new ai.mlc.mlcchat.AppViewModel$ChatState$requestGenerate$1$3
                r3 = 0
                r8.<init>(r6, r7, r3)
                r3 = r8
                kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
                r4 = 3
                r5 = 0
                kotlinx.coroutines.Job unused = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(r0, r1, r2, r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.mlc.mlcchat.AppViewModel.ChatState.requestGenerate$lambda$4(ai.mlc.mlcchat.AppViewModel$ChatState, java.lang.String, ai.mlc.mlcchat.AppViewModel):void");
        }

        /* access modifiers changed from: private */
        public final void appendMessage(MessageRole messageRole, String str) {
            this.messages.add(new MessageData(messageRole, str, (UUID) null, 4, (DefaultConstructorMarker) null));
        }

        /* access modifiers changed from: private */
        public final void updateMessage(MessageRole messageRole, String str) {
            SnapshotStateList<MessageData> snapshotStateList = this.messages;
            snapshotStateList.set(snapshotStateList.size() - 1, new MessageData(messageRole, str, (UUID) null, 4, (DefaultConstructorMarker) null));
        }

        public final boolean chatable() {
            return this.modelChatState.getValue() == ModelChatState.Ready;
        }

        public final boolean interruptable() {
            return this.modelChatState.getValue() == ModelChatState.Ready || this.modelChatState.getValue() == ModelChatState.Generating || this.modelChatState.getValue() == ModelChatState.Falied;
        }
    }
}
