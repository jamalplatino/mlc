package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: NavigationBar.kt */
final class NavigationBarKt$NavigationBarItem$2$1 extends Lambda implements Function1<IntSize, Unit> {
    final /* synthetic */ MutableState<Integer> $itemWidth$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NavigationBarKt$NavigationBarItem$2$1(MutableState<Integer> mutableState) {
        super(1);
        this.$itemWidth$delegate = mutableState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m1450invokeozmzZPI(((IntSize) obj).m5790unboximpl());
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-ozmzZPI  reason: not valid java name */
    public final void m1450invokeozmzZPI(long j) {
        NavigationBarKt.NavigationBarItem$lambda$4(this.$itemWidth$delegate, IntSize.m5786getWidthimpl(j));
    }
}
