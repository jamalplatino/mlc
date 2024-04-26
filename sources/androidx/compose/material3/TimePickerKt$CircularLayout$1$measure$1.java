package androidx.compose.material3;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: TimePicker.kt */
final class TimePickerKt$CircularLayout$1$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    final /* synthetic */ long $constraints;
    final /* synthetic */ Placeable $innerCirclePlaceable;
    final /* synthetic */ List<Placeable> $placeables;
    final /* synthetic */ float $radiusPx;
    final /* synthetic */ Placeable $selectorPlaceable;
    final /* synthetic */ float $theta;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TimePickerKt$CircularLayout$1$measure$1(Placeable placeable, List<? extends Placeable> list, Placeable placeable2, long j, float f, float f2) {
        super(1);
        this.$selectorPlaceable = placeable;
        this.$placeables = list;
        this.$innerCirclePlaceable = placeable2;
        this.$constraints = j;
        this.$radiusPx = f;
        this.$theta = f2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        Intrinsics.checkNotNullParameter(placementScope, "$this$layout");
        Placeable placeable = this.$selectorPlaceable;
        if (placeable != null) {
            Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, (Object) null);
        }
        long j = this.$constraints;
        float f = this.$radiusPx;
        float f2 = this.$theta;
        Iterator it = this.$placeables.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Placeable placeable2 = (Placeable) next;
            double d = (double) f;
            Iterator it2 = it;
            double d2 = ((double) (((float) i) * f2)) - 1.5707963267948966d;
            Placeable.PlacementScope placementScope2 = placementScope;
            Placeable.PlacementScope.place$default(placementScope2, placeable2, MathKt.roundToInt((Math.cos(d2) * d) + ((double) ((Constraints.m5570getMaxWidthimpl(j) / 2) - (placeable2.getWidth() / 2)))), MathKt.roundToInt((d * Math.sin(d2)) + ((double) ((Constraints.m5569getMaxHeightimpl(j) / 2) - (placeable2.getHeight() / 2)))), 0.0f, 4, (Object) null);
            Placeable.PlacementScope placementScope3 = placementScope;
            i = i2;
            it = it2;
        }
        Placeable placeable3 = this.$innerCirclePlaceable;
        if (placeable3 != null) {
            Placeable.PlacementScope.place$default(placementScope, placeable3, (Constraints.m5572getMinWidthimpl(this.$constraints) - this.$innerCirclePlaceable.getWidth()) / 2, (Constraints.m5571getMinHeightimpl(this.$constraints) - this.$innerCirclePlaceable.getHeight()) / 2, 0.0f, 4, (Object) null);
        }
    }
}
