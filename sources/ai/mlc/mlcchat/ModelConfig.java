package ai.mlc.mlcchat;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0002\u0010\fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003JR\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\nHÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000eR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006*"}, d2 = {"Lai/mlc/mlcchat/ModelConfig;", "", "modelLib", "", "modelId", "estimatedVramBytes", "", "tokenizerFiles", "", "contextWindowSize", "", "prefillChunkSize", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;II)V", "getContextWindowSize", "()I", "getEstimatedVramBytes", "()Ljava/lang/Long;", "setEstimatedVramBytes", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getModelId", "()Ljava/lang/String;", "setModelId", "(Ljava/lang/String;)V", "getModelLib", "setModelLib", "getPrefillChunkSize", "getTokenizerFiles", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;II)Lai/mlc/mlcchat/ModelConfig;", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: AppViewModel.kt */
public final class ModelConfig {
    public static final int $stable = 8;
    @SerializedName("context_window_size")
    private final int contextWindowSize;
    @SerializedName("estimated_vram_bytes")
    private Long estimatedVramBytes;
    @SerializedName("model_id")
    private String modelId;
    @SerializedName("model_lib")
    private String modelLib;
    @SerializedName("prefill_chunk_size")
    private final int prefillChunkSize;
    @SerializedName("tokenizer_files")
    private final List<String> tokenizerFiles;

    public static /* synthetic */ ModelConfig copy$default(ModelConfig modelConfig, String str, String str2, Long l, List<String> list, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = modelConfig.modelLib;
        }
        if ((i3 & 2) != 0) {
            str2 = modelConfig.modelId;
        }
        String str3 = str2;
        if ((i3 & 4) != 0) {
            l = modelConfig.estimatedVramBytes;
        }
        Long l2 = l;
        if ((i3 & 8) != 0) {
            list = modelConfig.tokenizerFiles;
        }
        List<String> list2 = list;
        if ((i3 & 16) != 0) {
            i = modelConfig.contextWindowSize;
        }
        int i4 = i;
        if ((i3 & 32) != 0) {
            i2 = modelConfig.prefillChunkSize;
        }
        return modelConfig.copy(str, str3, l2, list2, i4, i2);
    }

    public final String component1() {
        return this.modelLib;
    }

    public final String component2() {
        return this.modelId;
    }

    public final Long component3() {
        return this.estimatedVramBytes;
    }

    public final List<String> component4() {
        return this.tokenizerFiles;
    }

    public final int component5() {
        return this.contextWindowSize;
    }

    public final int component6() {
        return this.prefillChunkSize;
    }

    public final ModelConfig copy(String str, String str2, Long l, List<String> list, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "modelLib");
        Intrinsics.checkNotNullParameter(str2, "modelId");
        Intrinsics.checkNotNullParameter(list, "tokenizerFiles");
        return new ModelConfig(str, str2, l, list, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModelConfig)) {
            return false;
        }
        ModelConfig modelConfig = (ModelConfig) obj;
        return Intrinsics.areEqual((Object) this.modelLib, (Object) modelConfig.modelLib) && Intrinsics.areEqual((Object) this.modelId, (Object) modelConfig.modelId) && Intrinsics.areEqual((Object) this.estimatedVramBytes, (Object) modelConfig.estimatedVramBytes) && Intrinsics.areEqual((Object) this.tokenizerFiles, (Object) modelConfig.tokenizerFiles) && this.contextWindowSize == modelConfig.contextWindowSize && this.prefillChunkSize == modelConfig.prefillChunkSize;
    }

    public final int getContextWindowSize() {
        return this.contextWindowSize;
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

    public final int getPrefillChunkSize() {
        return this.prefillChunkSize;
    }

    public final List<String> getTokenizerFiles() {
        return this.tokenizerFiles;
    }

    public int hashCode() {
        int hashCode = ((this.modelLib.hashCode() * 31) + this.modelId.hashCode()) * 31;
        Long l = this.estimatedVramBytes;
        return ((((((hashCode + (l == null ? 0 : l.hashCode())) * 31) + this.tokenizerFiles.hashCode()) * 31) + Integer.hashCode(this.contextWindowSize)) * 31) + Integer.hashCode(this.prefillChunkSize);
    }

    public final void setEstimatedVramBytes(Long l) {
        this.estimatedVramBytes = l;
    }

    public final void setModelId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.modelId = str;
    }

    public final void setModelLib(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.modelLib = str;
    }

    public String toString() {
        return "ModelConfig(modelLib=" + this.modelLib + ", modelId=" + this.modelId + ", estimatedVramBytes=" + this.estimatedVramBytes + ", tokenizerFiles=" + this.tokenizerFiles + ", contextWindowSize=" + this.contextWindowSize + ", prefillChunkSize=" + this.prefillChunkSize + ')';
    }

    public ModelConfig(String str, String str2, Long l, List<String> list, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "modelLib");
        Intrinsics.checkNotNullParameter(str2, "modelId");
        Intrinsics.checkNotNullParameter(list, "tokenizerFiles");
        this.modelLib = str;
        this.modelId = str2;
        this.estimatedVramBytes = l;
        this.tokenizerFiles = list;
        this.contextWindowSize = i;
        this.prefillChunkSize = i2;
    }
}
