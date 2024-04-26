package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: SearchBar.kt */
final class SearchBarKt$SearchBarInputField$5 extends Lambda implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ TextFieldColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
    final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
    final /* synthetic */ String $query;
    final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SearchBarKt$SearchBarInputField$5(String str, boolean z, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, TextFieldColors textFieldColors, int i, int i2) {
        super(3);
        this.$query = str;
        this.$enabled = z;
        this.$interactionSource = mutableInteractionSource;
        this.$placeholder = function2;
        this.$leadingIcon = function22;
        this.$trailingIcon = function23;
        this.$colors = textFieldColors;
        this.$$dirty = i;
        this.$$dirty1 = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((Function2<? super Composer, ? super Integer, Unit>) (Function2) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i) {
        int i2;
        Function2<? super Composer, ? super Integer, Unit> function22 = function2;
        Composer composer2 = composer;
        Intrinsics.checkNotNullParameter(function22, "innerTextField");
        ComposerKt.sourceInformation(composer2, "C483@22406L15,469@21702L880:SearchBar.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = i | (composer2.changedInstance(function22) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 91) != 18 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(584727264, i2, -1, "androidx.compose.material3.SearchBarInputField.<anonymous> (SearchBar.kt:468)");
            }
            TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
            String str = this.$query;
            boolean z = this.$enabled;
            VisualTransformation none = VisualTransformation.Companion.getNone();
            InteractionSource interactionSource = this.$interactionSource;
            Function2<Composer, Integer, Unit> function23 = this.$placeholder;
            Function2<Composer, Integer, Unit> function24 = this.$leadingIcon;
            Function2 composableLambda = function24 != null ? ComposableLambdaKt.composableLambda(composer2, -967380630, true, new SearchBarKt$SearchBarInputField$5$1$1(function24)) : null;
            Function2<Composer, Integer, Unit> function25 = this.$trailingIcon;
            Function2 composableLambda2 = function25 != null ? ComposableLambdaKt.composableLambda(composer2, -2117865162, true, new SearchBarKt$SearchBarInputField$5$2$1(function25)) : null;
            Shape inputFieldShape = SearchBarDefaults.INSTANCE.getInputFieldShape(composer2, 6);
            TextFieldColors textFieldColors = this.$colors;
            PaddingValues r18 = TextFieldDefaults.m1687contentPaddingWithoutLabela9UjIt4$default(TextFieldDefaults.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, (Object) null);
            Function2<Composer, Integer, Unit> r19 = ComposableSingletons$SearchBarKt.INSTANCE.m1270getLambda1$material3_release();
            int i3 = this.$$dirty;
            int i4 = this.$$dirty1;
            textFieldDefaults.DecorationBox(str, function2, z, true, none, interactionSource, false, (Function2<? super Composer, ? super Integer, Unit>) null, function23, composableLambda, composableLambda2, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, inputFieldShape, textFieldColors, r18, r19, composer, ((i2 << 3) & 112) | (i3 & 14) | 27648 | ((i3 >> 12) & 896) | ((i4 << 12) & 458752) | ((i3 << 3) & 234881024), ((i4 << 15) & 458752) | 113246208, 14528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
