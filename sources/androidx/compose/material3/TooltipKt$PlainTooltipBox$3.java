package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: Tooltip.kt */
final class TooltipKt$PlainTooltipBox$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $containerColor;
    final /* synthetic */ Function3<TooltipBoxScope, Composer, Integer, Unit> $content;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ Function2<Composer, Integer, Unit> $tooltip;
    final /* synthetic */ PlainTooltipState $tooltipState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TooltipKt$PlainTooltipBox$3(Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, PlainTooltipState plainTooltipState, Shape shape, long j, long j2, Function3<? super TooltipBoxScope, ? super Composer, ? super Integer, Unit> function3, int i, int i2) {
        super(2);
        this.$tooltip = function2;
        this.$modifier = modifier;
        this.$tooltipState = plainTooltipState;
        this.$shape = shape;
        this.$containerColor = j;
        this.$contentColor = j2;
        this.$content = function3;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        TooltipKt.m1841PlainTooltipBoxnBX6wN0(this.$tooltip, this.$modifier, this.$tooltipState, this.$shape, this.$containerColor, this.$contentColor, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
