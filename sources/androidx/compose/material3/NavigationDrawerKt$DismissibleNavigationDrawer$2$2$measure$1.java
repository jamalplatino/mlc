package androidx.compose.material3;

import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: NavigationDrawer.kt */
final class NavigationDrawerKt$DismissibleNavigationDrawer$2$2$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    final /* synthetic */ Placeable $contentPlaceable;
    final /* synthetic */ DrawerState $drawerState;
    final /* synthetic */ Placeable $sheetPlaceable;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NavigationDrawerKt$DismissibleNavigationDrawer$2$2$measure$1(Placeable placeable, Placeable placeable2, DrawerState drawerState) {
        super(1);
        this.$contentPlaceable = placeable;
        this.$sheetPlaceable = placeable2;
        this.$drawerState = drawerState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        Intrinsics.checkNotNullParameter(placementScope, "$this$layout");
        Placeable.PlacementScope placementScope2 = placementScope;
        Placeable.PlacementScope.placeRelative$default(placementScope2, this.$contentPlaceable, this.$sheetPlaceable.getWidth() + MathKt.roundToInt(this.$drawerState.getOffset().getValue().floatValue()), 0, 0.0f, 4, (Object) null);
        Placeable.PlacementScope.placeRelative$default(placementScope2, this.$sheetPlaceable, MathKt.roundToInt(this.$drawerState.getOffset().getValue().floatValue()), 0, 0.0f, 4, (Object) null);
    }
}
