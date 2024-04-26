package androidx.compose.material3;

import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "value", "Landroidx/compose/material3/SheetValue;", "sheetSize", "Landroidx/compose/ui/unit/IntSize;", "invoke-O0kMr_c", "(Landroidx/compose/material3/SheetValue;J)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: ModalBottomSheet.android.kt */
final class ModalBottomSheet_androidKt$modalBottomSheetSwipeable$2 extends Lambda implements Function2<SheetValue, IntSize, Float> {
    final /* synthetic */ float $bottomPadding;
    final /* synthetic */ float $screenHeight;
    final /* synthetic */ SheetState $sheetState;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* compiled from: ModalBottomSheet.android.kt */
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
                androidx.compose.material3.SheetValue r1 = androidx.compose.material3.SheetValue.Hidden     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.material3.SheetValue r1 = androidx.compose.material3.SheetValue.PartiallyExpanded     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.material3.SheetValue r1 = androidx.compose.material3.SheetValue.Expanded     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ModalBottomSheet_androidKt$modalBottomSheetSwipeable$2.WhenMappings.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ModalBottomSheet_androidKt$modalBottomSheetSwipeable$2(float f, float f2, SheetState sheetState) {
        super(2);
        this.$screenHeight = f;
        this.$bottomPadding = f2;
        this.$sheetState = sheetState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m1440invokeO0kMr_c((SheetValue) obj, ((IntSize) obj2).m5790unboximpl());
    }

    /* renamed from: invoke-O0kMr_c  reason: not valid java name */
    public final Float m1440invokeO0kMr_c(SheetValue sheetValue, long j) {
        Intrinsics.checkNotNullParameter(sheetValue, "value");
        int i = WhenMappings.$EnumSwitchMapping$0[sheetValue.ordinal()];
        if (i == 1) {
            return Float.valueOf(this.$screenHeight + this.$bottomPadding);
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            } else if (IntSize.m5785getHeightimpl(j) != 0) {
                return Float.valueOf(Math.max(0.0f, this.$screenHeight - ((float) IntSize.m5785getHeightimpl(j))));
            } else {
                return null;
            }
        } else if (((float) IntSize.m5785getHeightimpl(j)) >= this.$screenHeight / ((float) 2) && !this.$sheetState.getSkipPartiallyExpanded$material3_release()) {
            return Float.valueOf(this.$screenHeight / 2.0f);
        } else {
            return null;
        }
    }
}
