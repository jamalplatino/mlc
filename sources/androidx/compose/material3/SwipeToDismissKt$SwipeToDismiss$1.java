package androidx.compose.material3;

import androidx.compose.ui.unit.IntSize;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: SwipeToDismiss.kt */
final class SwipeToDismissKt$SwipeToDismiss$1 extends Lambda implements Function2<DismissValue, IntSize, Float> {
    final /* synthetic */ Set<DismissDirection> $directions;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* compiled from: SwipeToDismiss.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.compose.material3.DismissValue[] r0 = androidx.compose.material3.DismissValue.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.material3.DismissValue r1 = androidx.compose.material3.DismissValue.DismissedToEnd     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.material3.DismissValue r1 = androidx.compose.material3.DismissValue.DismissedToStart     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.material3.DismissValue r1 = androidx.compose.material3.DismissValue.Default     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SwipeToDismissKt$SwipeToDismiss$1.WhenMappings.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SwipeToDismissKt$SwipeToDismiss$1(Set<? extends DismissDirection> set) {
        super(2);
        this.$directions = set;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m1652invokeO0kMr_c((DismissValue) obj, ((IntSize) obj2).m5790unboximpl());
    }

    /* renamed from: invoke-O0kMr_c  reason: not valid java name */
    public final Float m1652invokeO0kMr_c(DismissValue dismissValue, long j) {
        Intrinsics.checkNotNullParameter(dismissValue, "value");
        float r3 = (float) IntSize.m5786getWidthimpl(j);
        int i = WhenMappings.$EnumSwitchMapping$0[dismissValue.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return Float.valueOf(0.0f);
                }
                throw new NoWhenBranchMatchedException();
            } else if (this.$directions.contains(DismissDirection.EndToStart)) {
                return Float.valueOf(-r3);
            } else {
                return null;
            }
        } else if (this.$directions.contains(DismissDirection.StartToEnd)) {
            return Float.valueOf(r3);
        } else {
            return null;
        }
    }
}
