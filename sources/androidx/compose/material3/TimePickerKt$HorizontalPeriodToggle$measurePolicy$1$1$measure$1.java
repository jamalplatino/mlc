package androidx.compose.material3;

import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: TimePicker.kt */
final class TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    final /* synthetic */ List<Placeable> $items;
    final /* synthetic */ Placeable $spacerPlaceable;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1$measure$1(List<? extends Placeable> list, Placeable placeable) {
        super(1);
        this.$items = list;
        this.$spacerPlaceable = placeable;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        Intrinsics.checkNotNullParameter(placementScope, "$this$layout");
        Placeable.PlacementScope.place$default(placementScope, this.$items.get(0), 0, 0, 0.0f, 4, (Object) null);
        Placeable.PlacementScope.place$default(placementScope, this.$items.get(1), this.$items.get(0).getWidth(), 0, 0.0f, 4, (Object) null);
        Placeable.PlacementScope.place$default(placementScope, this.$spacerPlaceable, this.$items.get(0).getWidth() - (this.$spacerPlaceable.getWidth() / 2), 0, 0.0f, 4, (Object) null);
    }
}