package androidx.compose.material3;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: NavigationDrawer.kt */
final class NavigationDrawerKt$ModalNavigationDrawer$2$4$1 extends Lambda implements Function1<Density, IntOffset> {
    final /* synthetic */ DrawerState $drawerState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NavigationDrawerKt$ModalNavigationDrawer$2$4$1(DrawerState drawerState) {
        super(1);
        this.$drawerState = drawerState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return IntOffset.m5735boximpl(m1462invokeBjo55l4((Density) obj));
    }

    /* renamed from: invoke-Bjo55l4  reason: not valid java name */
    public final long m1462invokeBjo55l4(Density density) {
        Intrinsics.checkNotNullParameter(density, "$this$offset");
        return IntOffsetKt.IntOffset(MathKt.roundToInt(this.$drawerState.getOffset().getValue().floatValue()), 0);
    }
}
