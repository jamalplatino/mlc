package ai.mlc.mlcchat;

import ai.mlc.mlcchat.AppViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: AppViewModel.kt */
final class AppViewModel$ModelState$handleNewDownload$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ DownloadTask $downloadTask;
    final /* synthetic */ AppViewModel.ModelState this$0;
    final /* synthetic */ AppViewModel this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AppViewModel$ModelState$handleNewDownload$1(AppViewModel.ModelState modelState, DownloadTask downloadTask, AppViewModel appViewModel) {
        super(0);
        this.this$0 = modelState;
        this.$downloadTask = downloadTask;
        this.this$1 = appViewModel;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a3, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        kotlin.io.CloseableKt.closeFinally(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a7, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00aa, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        kotlin.io.CloseableKt.closeFinally(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ae, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b1, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b2, code lost:
        kotlin.io.CloseableKt.closeFinally(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b5, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke() {
        /*
            r10 = this;
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "randomUUID().toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.io.File r1 = new java.io.File
            ai.mlc.mlcchat.AppViewModel$ModelState r2 = r10.this$0
            java.io.File r2 = r2.modelDirFile
            r1.<init>(r2, r0)
            ai.mlc.mlcchat.DownloadTask r0 = r10.$downloadTask
            java.net.URL r0 = r0.getUrl()
            java.io.InputStream r0 = r0.openStream()
            java.io.Closeable r0 = (java.io.Closeable) r0
            r2 = r0
            java.io.InputStream r2 = (java.io.InputStream) r2     // Catch:{ all -> 0x00af }
            java.nio.channels.ReadableByteChannel r2 = java.nio.channels.Channels.newChannel(r2)     // Catch:{ all -> 0x00af }
            java.io.Closeable r2 = (java.io.Closeable) r2     // Catch:{ all -> 0x00af }
            r4 = r2
            java.nio.channels.ReadableByteChannel r4 = (java.nio.channels.ReadableByteChannel) r4     // Catch:{ all -> 0x00a8 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x00a8 }
            r3.<init>(r1)     // Catch:{ all -> 0x00a8 }
            r9 = r3
            java.io.Closeable r9 = (java.io.Closeable) r9     // Catch:{ all -> 0x00a8 }
            r3 = r9
            java.io.FileOutputStream r3 = (java.io.FileOutputStream) r3     // Catch:{ all -> 0x00a1 }
            java.nio.channels.FileChannel r3 = r3.getChannel()     // Catch:{ all -> 0x00a1 }
            r5 = 0
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3.transferFrom(r4, r5, r7)     // Catch:{ all -> 0x00a1 }
            r3 = 0
            kotlin.io.CloseableKt.closeFinally(r9, r3)     // Catch:{ all -> 0x00a8 }
            kotlin.io.CloseableKt.closeFinally(r2, r3)     // Catch:{ all -> 0x00af }
            kotlin.io.CloseableKt.closeFinally(r0, r3)
            boolean r0 = r1.exists()
            java.lang.String r2 = "Failed requirement."
            if (r0 == 0) goto L_0x0097
            ai.mlc.mlcchat.DownloadTask r0 = r10.$downloadTask
            java.io.File r0 = r0.getFile()
            r1.renameTo(r0)
            ai.mlc.mlcchat.DownloadTask r0 = r10.$downloadTask
            java.io.File r0 = r0.getFile()
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x008d
            ai.mlc.mlcchat.AppViewModel r0 = r10.this$1
            androidx.lifecycle.ViewModel r0 = (androidx.lifecycle.ViewModel) r0
            kotlinx.coroutines.CoroutineScope r4 = androidx.lifecycle.ViewModelKt.getViewModelScope(r0)
            r5 = 0
            r6 = 0
            ai.mlc.mlcchat.AppViewModel$ModelState$handleNewDownload$1$2 r0 = new ai.mlc.mlcchat.AppViewModel$ModelState$handleNewDownload$1$2
            ai.mlc.mlcchat.AppViewModel$ModelState r1 = r10.this$0
            ai.mlc.mlcchat.DownloadTask r2 = r10.$downloadTask
            r0.<init>(r1, r2, r3)
            r7 = r0
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            r8 = 3
            r9 = 0
            kotlinx.coroutines.Job unused = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(r4, r5, r6, r7, r8, r9)
            return
        L_0x008d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x0097:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x00a1:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a3 }
        L_0x00a3:
            r3 = move-exception
            kotlin.io.CloseableKt.closeFinally(r9, r1)     // Catch:{ all -> 0x00a8 }
            throw r3     // Catch:{ all -> 0x00a8 }
        L_0x00a8:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00aa }
        L_0x00aa:
            r3 = move-exception
            kotlin.io.CloseableKt.closeFinally(r2, r1)     // Catch:{ all -> 0x00af }
            throw r3     // Catch:{ all -> 0x00af }
        L_0x00af:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00b1 }
        L_0x00b1:
            r2 = move-exception
            kotlin.io.CloseableKt.closeFinally(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.mlc.mlcchat.AppViewModel$ModelState$handleNewDownload$1.invoke():void");
    }
}
