package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.MeasureScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "totalSize", "", "size", "", "measureScope", "Landroidx/compose/ui/layout/MeasureScope;", "outPosition", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: FlowLayout.kt */
final class FlowLayoutKt$crossAxisRowArrangement$1 extends Lambda implements Function4<Integer, int[], MeasureScope, int[], Unit> {
    public static final FlowLayoutKt$crossAxisRowArrangement$1 INSTANCE = new FlowLayoutKt$crossAxisRowArrangement$1();

    FlowLayoutKt$crossAxisRowArrangement$1() {
        super(4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke(((Number) obj).intValue(), (int[]) obj2, (MeasureScope) obj3, (int[]) obj4);
        return Unit.INSTANCE;
    }

    public final void invoke(int i, int[] iArr, MeasureScope measureScope, int[] iArr2) {
        Intrinsics.checkNotNullParameter(iArr, "size");
        Intrinsics.checkNotNullParameter(measureScope, "measureScope");
        Intrinsics.checkNotNullParameter(iArr2, "outPosition");
        Arrangement.INSTANCE.getTop().arrange(measureScope, i, iArr, iArr2);
    }
}
