package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Shape;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: TextFieldDefaults.kt */
final class TextFieldDefaults$TextFieldDecorationBox$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ TextFieldColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ InteractionSource $interactionSource;
    final /* synthetic */ boolean $isError;
    final /* synthetic */ Shape $shape;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextFieldDefaults$TextFieldDecorationBox$3(boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape, int i, int i2) {
        super(2);
        this.$enabled = z;
        this.$isError = z2;
        this.$interactionSource = interactionSource;
        this.$colors = textFieldColors;
        this.$shape = shape;
        this.$$dirty = i;
        this.$$dirty1 = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1271@71620L64:TextFieldDefaults.kt#uh7d8r");
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1171460386, i, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:1270)");
            }
            TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
            boolean z = this.$enabled;
            boolean z2 = this.$isError;
            InteractionSource interactionSource = this.$interactionSource;
            TextFieldColors textFieldColors = this.$colors;
            Shape shape = this.$shape;
            int i2 = this.$$dirty;
            int i3 = ((i2 >> 9) & 896) | ((i2 >> 6) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | ((i2 >> 15) & 112);
            int i4 = this.$$dirty1;
            textFieldDefaults.ContainerBox(z, z2, interactionSource, textFieldColors, shape, composer, i3 | (i4 & 7168) | ((i4 << 6) & 57344), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}