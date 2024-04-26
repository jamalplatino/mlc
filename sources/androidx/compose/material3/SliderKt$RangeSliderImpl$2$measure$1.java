package androidx.compose.material3;

import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: Slider.kt */
final class SliderKt$RangeSliderImpl$2$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    final /* synthetic */ int $endThumbOffsetX;
    final /* synthetic */ int $endThumbOffsetY;
    final /* synthetic */ Placeable $endThumbPlaceable;
    final /* synthetic */ int $startThumbOffsetX;
    final /* synthetic */ int $startThumbOffsetY;
    final /* synthetic */ Placeable $startThumbPlaceable;
    final /* synthetic */ int $trackOffsetX;
    final /* synthetic */ int $trackOffsetY;
    final /* synthetic */ Placeable $trackPlaceable;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SliderKt$RangeSliderImpl$2$measure$1(Placeable placeable, int i, int i2, Placeable placeable2, int i3, int i4, Placeable placeable3, int i5, int i6) {
        super(1);
        this.$trackPlaceable = placeable;
        this.$trackOffsetX = i;
        this.$trackOffsetY = i2;
        this.$startThumbPlaceable = placeable2;
        this.$startThumbOffsetX = i3;
        this.$startThumbOffsetY = i4;
        this.$endThumbPlaceable = placeable3;
        this.$endThumbOffsetX = i5;
        this.$endThumbOffsetY = i6;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        Intrinsics.checkNotNullParameter(placementScope, "$this$layout");
        Placeable.PlacementScope placementScope2 = placementScope;
        Placeable.PlacementScope.placeRelative$default(placementScope2, this.$trackPlaceable, this.$trackOffsetX, this.$trackOffsetY, 0.0f, 4, (Object) null);
        Placeable.PlacementScope.placeRelative$default(placementScope2, this.$startThumbPlaceable, this.$startThumbOffsetX, this.$startThumbOffsetY, 0.0f, 4, (Object) null);
        Placeable.PlacementScope.placeRelative$default(placementScope2, this.$endThumbPlaceable, this.$endThumbOffsetX, this.$endThumbOffsetY, 0.0f, 4, (Object) null);
    }
}
