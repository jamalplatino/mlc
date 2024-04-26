package androidx.compose.material3;

import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: BottomSheetScaffold.kt */
final class BottomSheetScaffoldKt$StandardBottomSheet$2$1 extends Lambda implements Function2<SheetValue, IntSize, Float> {
    final /* synthetic */ float $layoutHeight;
    final /* synthetic */ float $peekHeightPx;
    final /* synthetic */ SheetState $state;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* compiled from: BottomSheetScaffold.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.compose.material3.SheetValue[] r0 = androidx.compose.material3.SheetValue.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.material3.SheetValue r1 = androidx.compose.material3.SheetValue.PartiallyExpanded     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.material3.SheetValue r1 = androidx.compose.material3.SheetValue.Expanded     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.material3.SheetValue r1 = androidx.compose.material3.SheetValue.Hidden     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1.WhenMappings.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BottomSheetScaffoldKt$StandardBottomSheet$2$1(SheetState sheetState, float f, float f2) {
        super(2);
        this.$state = sheetState;
        this.$layoutHeight = f;
        this.$peekHeightPx = f2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m1149invokeO0kMr_c((SheetValue) obj, ((IntSize) obj2).m5790unboximpl());
    }

    /* renamed from: invoke-O0kMr_c  reason: not valid java name */
    public final Float m1149invokeO0kMr_c(SheetValue sheetValue, long j) {
        Intrinsics.checkNotNullParameter(sheetValue, "value");
        int i = WhenMappings.$EnumSwitchMapping$0[sheetValue.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                } else if (this.$state.getSkipHiddenState$material3_release()) {
                    return null;
                } else {
                    return Float.valueOf(this.$layoutHeight);
                }
            } else if (IntSize.m5785getHeightimpl(j) == MathKt.roundToInt(this.$peekHeightPx)) {
                return null;
            } else {
                return Float.valueOf(Float.max(0.0f, this.$layoutHeight - ((float) IntSize.m5785getHeightimpl(j))));
            }
        } else if (this.$state.getSkipPartiallyExpanded$material3_release()) {
            return null;
        } else {
            return Float.valueOf(this.$layoutHeight - this.$peekHeightPx);
        }
    }
}
