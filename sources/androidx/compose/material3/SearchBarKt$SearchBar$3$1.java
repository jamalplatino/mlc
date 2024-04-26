package androidx.compose.material3;

import androidx.compose.runtime.State;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.util.MathHelpersKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: SearchBar.kt */
final class SearchBarKt$SearchBar$3$1 extends Lambda implements Function3<MeasureScope, Measurable, Constraints, MeasureResult> {
    final /* synthetic */ State<Float> $animationProgress;
    final /* synthetic */ State<Dp> $topPadding;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SearchBarKt$SearchBar$3$1(State<Dp> state, State<Float> state2) {
        super(3);
        this.$topPadding = state;
        this.$animationProgress = state2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m1530invoke3p2s80s((MeasureScope) obj, (Measurable) obj2, ((Constraints) obj3).m5576unboximpl());
    }

    /* renamed from: invoke-3p2s80s  reason: not valid java name */
    public final MeasureResult m1530invoke3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        Measurable measurable2 = measurable;
        Intrinsics.checkNotNullParameter(measureScope, "$this$layout");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        final int r3 = measureScope.m5601roundToPx0680j_4(DpKt.m5669lerpMdfbLM(this.$topPadding.getValue().m5640unboximpl(), Dp.m5626constructorimpl((float) 0), this.$animationProgress.getValue().floatValue()));
        int coerceAtMost = RangesKt.coerceAtMost(Math.max(Constraints.m5572getMinWidthimpl(j), measureScope.m5601roundToPx0680j_4(SearchBarKt.getSearchBarMinWidth())), Math.min(Constraints.m5570getMaxWidthimpl(j), measureScope.m5601roundToPx0680j_4(SearchBarKt.SearchBarMaxWidth)));
        int coerceAtMost2 = RangesKt.coerceAtMost(Math.max(Constraints.m5571getMinHeightimpl(j), measureScope.m5601roundToPx0680j_4(SearchBarDefaults.INSTANCE.m1525getInputFieldHeightD9Ej5fM())), Constraints.m5569getMaxHeightimpl(j));
        int r6 = Constraints.m5570getMaxWidthimpl(j);
        int r7 = Constraints.m5569getMaxHeightimpl(j);
        int lerp = MathHelpersKt.lerp(coerceAtMost, r6, this.$animationProgress.getValue().floatValue());
        int lerp2 = MathHelpersKt.lerp(coerceAtMost2, r7, this.$animationProgress.getValue().floatValue()) + r3;
        final Placeable r2 = measurable.m4520measureBRTryo0(ConstraintsKt.m5587offsetNN6EwU$default(Constraints.Companion.m5578fixedJhjzzOo(lerp, lerp2), 0, -r3, 1, (Object) null));
        return MeasureScope.layout$default(measureScope, lerp, lerp2, (Map) null, new Function1<Placeable.PlacementScope, Unit>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Intrinsics.checkNotNullParameter(placementScope, "$this$layout");
                Placeable.PlacementScope.placeRelative$default(placementScope, r2, 0, r3, 0.0f, 4, (Object) null);
            }
        }, 4, (Object) null);
    }
}
