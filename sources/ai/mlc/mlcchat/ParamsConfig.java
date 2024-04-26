package ai.mlc.mlcchat;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lai/mlc/mlcchat/ParamsConfig;", "", "paramsRecords", "", "Lai/mlc/mlcchat/ParamsRecord;", "(Ljava/util/List;)V", "getParamsRecords", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: AppViewModel.kt */
public final class ParamsConfig {
    public static final int $stable = 8;
    @SerializedName("records")
    private final List<ParamsRecord> paramsRecords;

    public static /* synthetic */ ParamsConfig copy$default(ParamsConfig paramsConfig, List<ParamsRecord> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = paramsConfig.paramsRecords;
        }
        return paramsConfig.copy(list);
    }

    public final List<ParamsRecord> component1() {
        return this.paramsRecords;
    }

    public final ParamsConfig copy(List<ParamsRecord> list) {
        Intrinsics.checkNotNullParameter(list, "paramsRecords");
        return new ParamsConfig(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ParamsConfig) && Intrinsics.areEqual((Object) this.paramsRecords, (Object) ((ParamsConfig) obj).paramsRecords);
    }

    public final List<ParamsRecord> getParamsRecords() {
        return this.paramsRecords;
    }

    public int hashCode() {
        return this.paramsRecords.hashCode();
    }

    public String toString() {
        return "ParamsConfig(paramsRecords=" + this.paramsRecords + ')';
    }

    public ParamsConfig(List<ParamsRecord> list) {
        Intrinsics.checkNotNullParameter(list, "paramsRecords");
        this.paramsRecords = list;
    }
}
