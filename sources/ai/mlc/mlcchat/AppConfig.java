package ai.mlc.mlcchat;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\u0010\u0007J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001R$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0016"}, d2 = {"Lai/mlc/mlcchat/AppConfig;", "", "modelLibs", "", "", "modelList", "Lai/mlc/mlcchat/ModelRecord;", "(Ljava/util/List;Ljava/util/List;)V", "getModelLibs", "()Ljava/util/List;", "setModelLibs", "(Ljava/util/List;)V", "getModelList", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: AppViewModel.kt */
public final class AppConfig {
    public static final int $stable = 8;
    @SerializedName("model_libs")
    private List<String> modelLibs;
    @SerializedName("model_list")
    private final List<ModelRecord> modelList;

    public static /* synthetic */ AppConfig copy$default(AppConfig appConfig, List<String> list, List<ModelRecord> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = appConfig.modelLibs;
        }
        if ((i & 2) != 0) {
            list2 = appConfig.modelList;
        }
        return appConfig.copy(list, list2);
    }

    public final List<String> component1() {
        return this.modelLibs;
    }

    public final List<ModelRecord> component2() {
        return this.modelList;
    }

    public final AppConfig copy(List<String> list, List<ModelRecord> list2) {
        Intrinsics.checkNotNullParameter(list, "modelLibs");
        Intrinsics.checkNotNullParameter(list2, "modelList");
        return new AppConfig(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppConfig)) {
            return false;
        }
        AppConfig appConfig = (AppConfig) obj;
        return Intrinsics.areEqual((Object) this.modelLibs, (Object) appConfig.modelLibs) && Intrinsics.areEqual((Object) this.modelList, (Object) appConfig.modelList);
    }

    public final List<String> getModelLibs() {
        return this.modelLibs;
    }

    public final List<ModelRecord> getModelList() {
        return this.modelList;
    }

    public int hashCode() {
        return (this.modelLibs.hashCode() * 31) + this.modelList.hashCode();
    }

    public final void setModelLibs(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.modelLibs = list;
    }

    public String toString() {
        return "AppConfig(modelLibs=" + this.modelLibs + ", modelList=" + this.modelList + ')';
    }

    public AppConfig(List<String> list, List<ModelRecord> list2) {
        Intrinsics.checkNotNullParameter(list, "modelLibs");
        Intrinsics.checkNotNullParameter(list2, "modelList");
        this.modelLibs = list;
        this.modelList = list2;
    }
}
