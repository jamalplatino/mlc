package ai.mlc.mlcchat;

import ai.mlc.mlcchat.AppViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: AppViewModel.kt */
final class AppViewModel$ModelState$downloadParamsConfig$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ AppViewModel.ModelState this$0;
    final /* synthetic */ AppViewModel this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AppViewModel$ModelState$downloadParamsConfig$1(AppViewModel.ModelState modelState, AppViewModel appViewModel) {
        super(0);
        this.this$0 = modelState;
        this.this$1 = appViewModel;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00bc, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        kotlin.io.CloseableKt.closeFinally(r9, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c0, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c3, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        kotlin.io.CloseableKt.closeFinally(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c7, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ca, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00cb, code lost:
        kotlin.io.CloseableKt.closeFinally(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ce, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke() {
        /*
            r10 = this;
            java.net.URL r0 = new java.net.URL
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            ai.mlc.mlcchat.AppViewModel$ModelState r2 = r10.this$0
            java.lang.String r2 = r2.modelUrl
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "resolve/main/ndarray-cache.json"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "randomUUID().toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.io.File r2 = new java.io.File
            ai.mlc.mlcchat.AppViewModel$ModelState r3 = r10.this$0
            java.io.File r3 = r3.modelDirFile
            r2.<init>(r3, r1)
            java.io.InputStream r0 = r0.openStream()
            java.io.Closeable r0 = (java.io.Closeable) r0
            r1 = r0
            java.io.InputStream r1 = (java.io.InputStream) r1     // Catch:{ all -> 0x00c8 }
            java.nio.channels.ReadableByteChannel r1 = java.nio.channels.Channels.newChannel(r1)     // Catch:{ all -> 0x00c8 }
            java.io.Closeable r1 = (java.io.Closeable) r1     // Catch:{ all -> 0x00c8 }
            r4 = r1
            java.nio.channels.ReadableByteChannel r4 = (java.nio.channels.ReadableByteChannel) r4     // Catch:{ all -> 0x00c1 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x00c1 }
            r3.<init>(r2)     // Catch:{ all -> 0x00c1 }
            r9 = r3
            java.io.Closeable r9 = (java.io.Closeable) r9     // Catch:{ all -> 0x00c1 }
            r3 = r9
            java.io.FileOutputStream r3 = (java.io.FileOutputStream) r3     // Catch:{ all -> 0x00ba }
            java.nio.channels.FileChannel r3 = r3.getChannel()     // Catch:{ all -> 0x00ba }
            r5 = 0
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3.transferFrom(r4, r5, r7)     // Catch:{ all -> 0x00ba }
            r3 = 0
            kotlin.io.CloseableKt.closeFinally(r9, r3)     // Catch:{ all -> 0x00c1 }
            kotlin.io.CloseableKt.closeFinally(r1, r3)     // Catch:{ all -> 0x00c8 }
            kotlin.io.CloseableKt.closeFinally(r0, r3)
            boolean r0 = r2.exists()
            java.lang.String r1 = "Failed requirement."
            if (r0 == 0) goto L_0x00b0
            java.io.File r0 = new java.io.File
            ai.mlc.mlcchat.AppViewModel$ModelState r4 = r10.this$0
            java.io.File r4 = r4.modelDirFile
            java.lang.String r5 = "ndarray-cache.json"
            r0.<init>(r4, r5)
            r2.renameTo(r0)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x00a6
            ai.mlc.mlcchat.AppViewModel r0 = r10.this$1
            androidx.lifecycle.ViewModel r0 = (androidx.lifecycle.ViewModel) r0
            kotlinx.coroutines.CoroutineScope r4 = androidx.lifecycle.ViewModelKt.getViewModelScope(r0)
            r5 = 0
            r6 = 0
            ai.mlc.mlcchat.AppViewModel$ModelState$downloadParamsConfig$1$2 r0 = new ai.mlc.mlcchat.AppViewModel$ModelState$downloadParamsConfig$1$2
            ai.mlc.mlcchat.AppViewModel$ModelState r1 = r10.this$0
            r0.<init>(r1, r3)
            r7 = r0
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            r8 = 3
            r9 = 0
            kotlinx.coroutines.Job unused = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(r4, r5, r6, r7, r8, r9)
            return
        L_0x00a6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00b0:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00ba:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x00bc }
        L_0x00bc:
            r3 = move-exception
            kotlin.io.CloseableKt.closeFinally(r9, r2)     // Catch:{ all -> 0x00c1 }
            throw r3     // Catch:{ all -> 0x00c1 }
        L_0x00c1:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x00c3 }
        L_0x00c3:
            r3 = move-exception
            kotlin.io.CloseableKt.closeFinally(r1, r2)     // Catch:{ all -> 0x00c8 }
            throw r3     // Catch:{ all -> 0x00c8 }
        L_0x00c8:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00ca }
        L_0x00ca:
            r2 = move-exception
            kotlin.io.CloseableKt.closeFinally(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.mlc.mlcchat.AppViewModel$ModelState$downloadParamsConfig$1.invoke():void");
    }
}
