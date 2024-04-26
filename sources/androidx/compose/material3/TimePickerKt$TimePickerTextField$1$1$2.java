package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.tokens.TimeInputTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: TimePicker.kt */
final class TimePickerKt$TimePickerTextField$1$1$2 extends Lambda implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ TextFieldColors $textFieldColors;
    final /* synthetic */ TextFieldValue $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TimePickerKt$TimePickerTextField$1$1$2(TextFieldValue textFieldValue, MutableInteractionSource mutableInteractionSource, TextFieldColors textFieldColors) {
        super(3);
        this.$value = textFieldValue;
        this.$interactionSource = mutableInteractionSource;
        this.$textFieldColors = textFieldColors;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((Function2<? super Composer, ? super Integer, Unit>) (Function2) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i) {
        int i2;
        Function2<? super Composer, ? super Integer, Unit> function22 = function2;
        Composer composer2 = composer;
        Intrinsics.checkNotNullParameter(function22, "it");
        ComposerKt.sourceInformation(composer2, "C1448@55094L864:TimePicker.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = i | (composer2.changedInstance(function22) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 91) != 18 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2133555260, i2, -1, "androidx.compose.material3.TimePickerTextField.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1447)");
            }
            OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.INSTANCE;
            String text = this.$value.getText();
            VisualTransformation none = VisualTransformation.Companion.getNone();
            PaddingValues r17 = PaddingKt.m486PaddingValues0680j_4(Dp.m5626constructorimpl((float) 0));
            final MutableInteractionSource mutableInteractionSource = this.$interactionSource;
            final TextFieldColors textFieldColors = this.$textFieldColors;
            outlinedTextFieldDefaults.DecorationBox(text, function2, true, true, none, this.$interactionSource, false, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, this.$textFieldColors, r17, ComposableLambdaKt.composableLambda(composer2, -968963953, true, new Function2<Composer, Integer, Unit>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    ComposerKt.sourceInformation(composer, "C1462@55828L9,1458@55582L336:TimePicker.kt#uh7d8r");
                    if ((i & 11) != 2 || !composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-968963953, i, -1, "androidx.compose.material3.TimePickerTextField.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1457)");
                        }
                        OutlinedTextFieldDefaults.INSTANCE.m1473ContainerBoxnbWgWpA(true, false, mutableInteractionSource, textFieldColors, ShapesKt.toShape(TimeInputTokens.INSTANCE.getTimeFieldContainerShape(), composer, 6), 0.0f, 0.0f, composer, 12583350, 96);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer.skipToGroupEnd();
                }
            }), composer, ((i2 << 3) & 112) | 224640, 14352384, 16320);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
