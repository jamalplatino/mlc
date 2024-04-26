package androidx.compose.material3;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: NavigationDrawer.kt */
final class NavigationDrawerKt$DismissibleNavigationDrawer$2$2 implements MeasurePolicy {
    final /* synthetic */ DrawerState $drawerState;

    NavigationDrawerKt$DismissibleNavigationDrawer$2$2(DrawerState drawerState) {
        this.$drawerState = drawerState;
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public final MeasureResult m1461measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        Intrinsics.checkNotNullParameter(measureScope, "$this$Layout");
        Intrinsics.checkNotNullParameter(list, "measurables");
        Placeable r0 = ((Measurable) list.get(0)).m4520measureBRTryo0(j);
        Placeable r10 = ((Measurable) list.get(1)).m4520measureBRTryo0(j);
        return MeasureScope.layout$default(measureScope, r10.getWidth(), r10.getHeight(), (Map) null, new NavigationDrawerKt$DismissibleNavigationDrawer$2$2$measure$1(r10, r0, this.$drawerState), 4, (Object) null);
    }
}
