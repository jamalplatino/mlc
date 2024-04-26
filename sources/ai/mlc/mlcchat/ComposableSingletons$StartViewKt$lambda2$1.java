package ai.mlc.mlcchat;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.material3.TopAppBarScrollBehavior;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* renamed from: ai.mlc.mlcchat.ComposableSingletons$StartViewKt$lambda-2$1  reason: invalid class name */
/* compiled from: StartView.kt */
final class ComposableSingletons$StartViewKt$lambda2$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$StartViewKt$lambda2$1 INSTANCE = new ComposableSingletons$StartViewKt$lambda2$1();

    ComposableSingletons$StartViewKt$lambda2$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        int i2 = i;
        if ((i2 & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(218380220, i2, -1, "ai.mlc.mlcchat.ComposableSingletons$StartViewKt.lambda-2.<anonymous> (StartView.kt:57)");
            }
            Composer composer2 = composer;
            AppBarKt.TopAppBar(ComposableSingletons$StartViewKt.INSTANCE.m12getLambda1$app_release(), (Modifier) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function3<? super RowScope, ? super Composer, ? super Integer, Unit>) null, (WindowInsets) null, TopAppBarDefaults.INSTANCE.m1854topAppBarColorszjMxDiM(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).m1201getPrimary0d7_KjU(), 0, 0, 0, 0, composer2, TopAppBarDefaults.$stable << 15, 30), (TopAppBarScrollBehavior) null, composer, 6, 94);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
