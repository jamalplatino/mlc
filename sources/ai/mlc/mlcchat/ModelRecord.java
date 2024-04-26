package ai.mlc.mlcchat;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J8\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001c"}, d2 = {"Lai/mlc/mlcchat/ModelRecord;", "", "modelUrl", "", "modelId", "estimatedVramBytes", "", "modelLib", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "getEstimatedVramBytes", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getModelId", "()Ljava/lang/String;", "getModelLib", "getModelUrl", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lai/mlc/mlcchat/ModelRecord;", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: AppViewModel.kt */
public final class ModelRecord {
    public static final int $stable = 0;
    @SerializedName("estimated_vram_bytes")
    private final Long estimatedVramBytes;
    @SerializedName("model_id")
    private final String modelId;
    @SerializedName("model_lib")
    private final String modelLib;
    @SerializedName("model_url")
    private final String modelUrl;

    public static /* synthetic */ ModelRecord copy$default(ModelRecord modelRecord, String str, String str2, Long l, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = modelRecord.modelUrl;
        }
        if ((i & 2) != 0) {
            str2 = modelRecord.modelId;
        }
        if ((i & 4) != 0) {
            l = modelRecord.estimatedVramBytes;
        }
        if ((i & 8) != 0) {
            str3 = modelRecord.modelLib;
        }
        return modelRecord.copy(str, str2, l, str3);
    }

    public final String component1() {
        return this.modelUrl;
    }

    public final String component2() {
        return this.modelId;
    }

    public final Long component3() {
        return this.estimatedVramBytes;
    }

    public final String component4() {
        return this.modelLib;
    }

    public final ModelRecord copy(String str, String str2, Long l, String str3) {
        Intrinsics.checkNotNullParameter(str, "modelUrl");
        Intrinsics.checkNotNullParameter(str2, "modelId");
        Intrinsics.checkNotNullParameter(str3, "modelLib");
        return new ModelRecord(str, str2, l, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModelRecord)) {
            return false;
        }
        ModelRecord modelRecord = (ModelRecord) obj;
        return Intrinsics.areEqual((Object) this.modelUrl, (Object) modelRecord.modelUrl) && Intrinsics.areEqual((Object) this.modelId, (Object) modelRecord.modelId) && Intrinsics.areEqual((Object) this.estimatedVramBytes, (Object) modelRecord.estimatedVramBytes) && Intrinsics.areEqual((Object) this.modelLib, (Object) modelRecord.modelLib);
    }

    public final Long getEstimatedVramBytes() {
        return this.estimatedVramBytes;
    }

    public final String getModelId() {
        return this.modelId;
    }

    public final String getModelLib() {
        return this.modelLib;
    }

    public final String getModelUrl() {
        return this.modelUrl;
    }

    public int hashCode() {
        int hashCode = ((this.modelUrl.hashCode() * 31) + this.modelId.hashCode()) * 31;
        Long l = this.estimatedVramBytes;
        return ((hashCode + (l == null ? 0 : l.hashCode())) * 31) + this.modelLib.hashCode();
    }

    public String toString() {
        return "ModelRecord(modelUrl=" + this.modelUrl + ", modelId=" + this.modelId + ", estimatedVramBytes=" + this.estimatedVramBytes + ", modelLib=" + this.modelLib + ')';
    }

    public ModelRecord(String str, String str2, Long l, String str3) {
        Intrinsics.checkNotNullParameter(str, "modelUrl");
        Intrinsics.checkNotNullParameter(str2, "modelId");
        Intrinsics.checkNotNullParameter(str3, "modelLib");
        this.modelUrl = str;
        this.modelId = str2;
        this.estimatedVramBytes = l;
        this.modelLib = str3;
    }
}
