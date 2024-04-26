package ai.mlc.mlcchat;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: AppViewModel.kt */
final class AppViewModel$downloadModelConfig$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ boolean $isBuiltin;
    final /* synthetic */ ModelRecord $modelRecord;
    final /* synthetic */ String $modelUrl;
    final /* synthetic */ AppViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AppViewModel$downloadModelConfig$1(String str, AppViewModel appViewModel, ModelRecord modelRecord, boolean z) {
        super(0);
        this.$modelUrl = str;
        this.this$0 = appViewModel;
        this.$modelRecord = modelRecord;
        this.$isBuiltin = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a7, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        kotlin.io.CloseableKt.closeFinally(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ab, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ae, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        kotlin.io.CloseableKt.closeFinally(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b2, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b5, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        kotlin.io.CloseableKt.closeFinally(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b9, code lost:
        throw r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke() {
        /*
            r12 = this;
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x00ba }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ba }
            r2.<init>()     // Catch:{ Exception -> 0x00ba }
            java.lang.String r3 = r12.$modelUrl     // Catch:{ Exception -> 0x00ba }
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch:{ Exception -> 0x00ba }
            java.lang.String r3 = "resolve/main/mlc-chat-config.json"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch:{ Exception -> 0x00ba }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00ba }
            r1.<init>(r2)     // Catch:{ Exception -> 0x00ba }
            java.util.UUID r2 = java.util.UUID.randomUUID()     // Catch:{ Exception -> 0x00ba }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00ba }
            java.lang.String r3 = "randomUUID().toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)     // Catch:{ Exception -> 0x00ba }
            java.io.File r5 = new java.io.File     // Catch:{ Exception -> 0x00ba }
            ai.mlc.mlcchat.AppViewModel r3 = r12.this$0     // Catch:{ Exception -> 0x00ba }
            android.app.Application r3 = r3.application     // Catch:{ Exception -> 0x00ba }
            java.lang.String r4 = android.os.Environment.DIRECTORY_DOWNLOADS     // Catch:{ Exception -> 0x00ba }
            java.io.File r3 = r3.getExternalFilesDir(r4)     // Catch:{ Exception -> 0x00ba }
            r5.<init>(r3, r2)     // Catch:{ Exception -> 0x00ba }
            java.io.InputStream r1 = r1.openStream()     // Catch:{ Exception -> 0x00ba }
            java.io.Closeable r1 = (java.io.Closeable) r1     // Catch:{ Exception -> 0x00ba }
            r2 = r1
            java.io.InputStream r2 = (java.io.InputStream) r2     // Catch:{ all -> 0x00b3 }
            java.nio.channels.ReadableByteChannel r2 = java.nio.channels.Channels.newChannel(r2)     // Catch:{ all -> 0x00b3 }
            java.io.Closeable r2 = (java.io.Closeable) r2     // Catch:{ all -> 0x00b3 }
            r7 = r2
            java.nio.channels.ReadableByteChannel r7 = (java.nio.channels.ReadableByteChannel) r7     // Catch:{ all -> 0x00ac }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x00ac }
            r3.<init>(r5)     // Catch:{ all -> 0x00ac }
            java.io.Closeable r3 = (java.io.Closeable) r3     // Catch:{ all -> 0x00ac }
            r4 = r3
            java.io.FileOutputStream r4 = (java.io.FileOutputStream) r4     // Catch:{ all -> 0x00a5 }
            java.nio.channels.FileChannel r6 = r4.getChannel()     // Catch:{ all -> 0x00a5 }
            r8 = 0
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6.transferFrom(r7, r8, r10)     // Catch:{ all -> 0x00a5 }
            kotlin.io.CloseableKt.closeFinally(r3, r0)     // Catch:{ all -> 0x00ac }
            kotlin.io.CloseableKt.closeFinally(r2, r0)     // Catch:{ all -> 0x00b3 }
            kotlin.io.CloseableKt.closeFinally(r1, r0)     // Catch:{ Exception -> 0x00ba }
            boolean r1 = r5.exists()     // Catch:{ Exception -> 0x00ba }
            if (r1 == 0) goto L_0x0099
            ai.mlc.mlcchat.AppViewModel r1 = r12.this$0     // Catch:{ Exception -> 0x00ba }
            androidx.lifecycle.ViewModel r1 = (androidx.lifecycle.ViewModel) r1     // Catch:{ Exception -> 0x00ba }
            kotlinx.coroutines.CoroutineScope r1 = androidx.lifecycle.ViewModelKt.getViewModelScope(r1)     // Catch:{ Exception -> 0x00ba }
            r2 = 0
            r3 = 0
            ai.mlc.mlcchat.AppViewModel$downloadModelConfig$1$2 r11 = new ai.mlc.mlcchat.AppViewModel$downloadModelConfig$1$2     // Catch:{ Exception -> 0x00ba }
            ai.mlc.mlcchat.AppViewModel r6 = r12.this$0     // Catch:{ Exception -> 0x00ba }
            ai.mlc.mlcchat.ModelRecord r7 = r12.$modelRecord     // Catch:{ Exception -> 0x00ba }
            java.lang.String r8 = r12.$modelUrl     // Catch:{ Exception -> 0x00ba }
            boolean r9 = r12.$isBuiltin     // Catch:{ Exception -> 0x00ba }
            r10 = 0
            r4 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x00ba }
            r9 = r11
            kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9     // Catch:{ Exception -> 0x00ba }
            r10 = 3
            r11 = 0
            r6 = r1
            r7 = r2
            r8 = r3
            kotlinx.coroutines.Job unused = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x00ba }
            goto L_0x00d4
        L_0x0099:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x00ba }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00ba }
            r2.<init>(r1)     // Catch:{ Exception -> 0x00ba }
            throw r2     // Catch:{ Exception -> 0x00ba }
        L_0x00a5:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x00a7 }
        L_0x00a7:
            r5 = move-exception
            kotlin.io.CloseableKt.closeFinally(r3, r4)     // Catch:{ all -> 0x00ac }
            throw r5     // Catch:{ all -> 0x00ac }
        L_0x00ac:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x00ae }
        L_0x00ae:
            r4 = move-exception
            kotlin.io.CloseableKt.closeFinally(r2, r3)     // Catch:{ all -> 0x00b3 }
            throw r4     // Catch:{ all -> 0x00b3 }
        L_0x00b3:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x00b5 }
        L_0x00b5:
            r3 = move-exception
            kotlin.io.CloseableKt.closeFinally(r1, r2)     // Catch:{ Exception -> 0x00ba }
            throw r3     // Catch:{ Exception -> 0x00ba }
        L_0x00ba:
            r1 = move-exception
            ai.mlc.mlcchat.AppViewModel r2 = r12.this$0
            androidx.lifecycle.ViewModel r2 = (androidx.lifecycle.ViewModel) r2
            kotlinx.coroutines.CoroutineScope r3 = androidx.lifecycle.ViewModelKt.getViewModelScope(r2)
            r4 = 0
            r5 = 0
            ai.mlc.mlcchat.AppViewModel$downloadModelConfig$1$3 r2 = new ai.mlc.mlcchat.AppViewModel$downloadModelConfig$1$3
            ai.mlc.mlcchat.AppViewModel r6 = r12.this$0
            r2.<init>(r6, r1, r0)
            r6 = r2
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            r7 = 3
            r8 = 0
            kotlinx.coroutines.Job unused = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(r3, r4, r5, r6, r7, r8)
        L_0x00d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.mlc.mlcchat.AppViewModel$downloadModelConfig$1.invoke():void");
    }
}
