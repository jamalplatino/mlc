package ai.mlc.mlcchat;

import java.io.File;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lai/mlc/mlcchat/DownloadTask;", "", "url", "Ljava/net/URL;", "file", "Ljava/io/File;", "(Ljava/net/URL;Ljava/io/File;)V", "getFile", "()Ljava/io/File;", "getUrl", "()Ljava/net/URL;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: AppViewModel.kt */
public final class DownloadTask {
    public static final int $stable = 8;
    private final File file;
    private final URL url;

    public static /* synthetic */ DownloadTask copy$default(DownloadTask downloadTask, URL url2, File file2, int i, Object obj) {
        if ((i & 1) != 0) {
            url2 = downloadTask.url;
        }
        if ((i & 2) != 0) {
            file2 = downloadTask.file;
        }
        return downloadTask.copy(url2, file2);
    }

    public final URL component1() {
        return this.url;
    }

    public final File component2() {
        return this.file;
    }

    public final DownloadTask copy(URL url2, File file2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(file2, "file");
        return new DownloadTask(url2, file2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownloadTask)) {
            return false;
        }
        DownloadTask downloadTask = (DownloadTask) obj;
        return Intrinsics.areEqual((Object) this.url, (Object) downloadTask.url) && Intrinsics.areEqual((Object) this.file, (Object) downloadTask.file);
    }

    public final File getFile() {
        return this.file;
    }

    public final URL getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (this.url.hashCode() * 31) + this.file.hashCode();
    }

    public String toString() {
        return "DownloadTask(url=" + this.url + ", file=" + this.file + ')';
    }

    public DownloadTask(URL url2, File file2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(file2, "file");
        this.url = url2;
        this.file = file2;
    }
}
