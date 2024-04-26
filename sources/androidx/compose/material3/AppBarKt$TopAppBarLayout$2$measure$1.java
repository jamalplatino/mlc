package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: AppBar.kt */
final class AppBarKt$TopAppBarLayout$2$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    final /* synthetic */ Placeable $actionIconsPlaceable;
    final /* synthetic */ long $constraints;
    final /* synthetic */ int $layoutHeight;
    final /* synthetic */ Placeable $navigationIconPlaceable;
    final /* synthetic */ MeasureScope $this_Layout;
    final /* synthetic */ int $titleBaseline;
    final /* synthetic */ int $titleBottomPadding;
    final /* synthetic */ Arrangement.Horizontal $titleHorizontalArrangement;
    final /* synthetic */ Placeable $titlePlaceable;
    final /* synthetic */ Arrangement.Vertical $titleVerticalArrangement;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AppBarKt$TopAppBarLayout$2$measure$1(Placeable placeable, int i, Placeable placeable2, Arrangement.Horizontal horizontal, long j, Placeable placeable3, MeasureScope measureScope, Arrangement.Vertical vertical, int i2, int i3) {
        super(1);
        this.$navigationIconPlaceable = placeable;
        this.$layoutHeight = i;
        this.$titlePlaceable = placeable2;
        this.$titleHorizontalArrangement = horizontal;
        this.$constraints = j;
        this.$actionIconsPlaceable = placeable3;
        this.$this_Layout = measureScope;
        this.$titleVerticalArrangement = vertical;
        this.$titleBottomPadding = i2;
        this.$titleBaseline = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        int max;
        int i;
        int i2;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(placementScope, "$this$layout");
        Placeable placeable = this.$navigationIconPlaceable;
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, (this.$layoutHeight - placeable.getHeight()) / 2, 0.0f, 4, (Object) null);
        Placeable placeable2 = this.$titlePlaceable;
        Arrangement.Horizontal horizontal = this.$titleHorizontalArrangement;
        if (Intrinsics.areEqual((Object) horizontal, (Object) Arrangement.INSTANCE.getCenter())) {
            max = (Constraints.m5570getMaxWidthimpl(this.$constraints) - this.$titlePlaceable.getWidth()) / 2;
        } else if (Intrinsics.areEqual((Object) horizontal, (Object) Arrangement.INSTANCE.getEnd())) {
            max = (Constraints.m5570getMaxWidthimpl(this.$constraints) - this.$titlePlaceable.getWidth()) - this.$actionIconsPlaceable.getWidth();
        } else {
            max = Math.max(this.$this_Layout.m5601roundToPx0680j_4(AppBarKt.TopAppBarTitleInset), this.$navigationIconPlaceable.getWidth());
        }
        int i5 = max;
        Arrangement.Vertical vertical = this.$titleVerticalArrangement;
        if (Intrinsics.areEqual((Object) vertical, (Object) Arrangement.INSTANCE.getCenter())) {
            i4 = (this.$layoutHeight - this.$titlePlaceable.getHeight()) / 2;
        } else if (Intrinsics.areEqual((Object) vertical, (Object) Arrangement.INSTANCE.getBottom())) {
            if (this.$titleBottomPadding == 0) {
                i3 = this.$layoutHeight;
                i2 = this.$titlePlaceable.getHeight();
            } else {
                i3 = this.$layoutHeight - this.$titlePlaceable.getHeight();
                i2 = Math.max(0, (this.$titleBottomPadding - this.$titlePlaceable.getHeight()) + this.$titleBaseline);
            }
            i4 = i3 - i2;
        } else {
            i = 0;
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i5, i, 0.0f, 4, (Object) null);
            Placeable.PlacementScope.placeRelative$default(placementScope, this.$actionIconsPlaceable, Constraints.m5570getMaxWidthimpl(this.$constraints) - this.$actionIconsPlaceable.getWidth(), (this.$layoutHeight - this.$actionIconsPlaceable.getHeight()) / 2, 0.0f, 4, (Object) null);
        }
        i = i4;
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i5, i, 0.0f, 4, (Object) null);
        Placeable.PlacementScope.placeRelative$default(placementScope, this.$actionIconsPlaceable, Constraints.m5570getMaxWidthimpl(this.$constraints) - this.$actionIconsPlaceable.getWidth(), (this.$layoutHeight - this.$actionIconsPlaceable.getHeight()) / 2, 0.0f, 4, (Object) null);
    }
}
