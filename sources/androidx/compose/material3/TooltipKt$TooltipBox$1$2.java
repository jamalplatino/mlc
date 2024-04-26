package androidx.compose.material3;

import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: Tooltip.kt */
final class TooltipKt$TooltipBox$1$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ long $containerColor;
    final /* synthetic */ float $elevation;
    final /* synthetic */ float $maxWidth;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ Function2<Composer, Integer, Unit> $tooltipContent;
    final /* synthetic */ String $tooltipPaneDescription;
    final /* synthetic */ Transition<Boolean> $transition;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TooltipKt$TooltipBox$1$2(Modifier modifier, float f, Transition<Boolean> transition, String str, Shape shape, long j, float f2, Function2<? super Composer, ? super Integer, Unit> function2, int i) {
        super(2);
        this.$modifier = modifier;
        this.$maxWidth = f;
        this.$transition = transition;
        this.$tooltipPaneDescription = str;
        this.$shape = shape;
        this.$containerColor = j;
        this.$elevation = f2;
        this.$tooltipContent = function2;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        Composer composer2 = composer;
        int i2 = i;
        ComposerKt.sourceInformation(composer2, "C265@10968L38,257@10611L635:Tooltip.kt#uh7d8r");
        if ((i2 & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-442150991, i2, -1, "androidx.compose.material3.TooltipBox.<anonymous>.<anonymous> (Tooltip.kt:256)");
            }
            Modifier access$animateTooltip = TooltipKt.animateTooltip(SizeKt.m567sizeInqDBjuR0$default(this.$modifier, TooltipKt.getTooltipMinWidth(), TooltipKt.getTooltipMinHeight(), this.$maxWidth, 0.0f, 8, (Object) null), this.$transition);
            String str = this.$tooltipPaneDescription;
            composer2.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed = composer2.changed((Object) str);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new TooltipKt$TooltipBox$1$2$1$1(str);
                composer2.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            Modifier semantics$default = SemanticsModifierKt.semantics$default(access$animateTooltip, false, (Function1) rememberedValue, 1, (Object) null);
            Shape shape = this.$shape;
            long j = this.$containerColor;
            float f = this.$elevation;
            Function2<Composer, Integer, Unit> function2 = this.$tooltipContent;
            int i3 = this.$$dirty;
            SurfaceKt.m1641SurfaceT9BRK9s(semantics$default, shape, j, 0, f, f, (BorderStroke) null, function2, composer, ((i3 >> 6) & 112) | ((i3 >> 9) & 896) | (57344 & (i3 >> 6)) | ((i3 >> 3) & 458752) | ((i3 << 21) & 29360128), 72);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
