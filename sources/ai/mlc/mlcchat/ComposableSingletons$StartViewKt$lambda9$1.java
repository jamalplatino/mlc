package ai.mlc.mlcchat;

import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.ScheduleKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* renamed from: ai.mlc.mlcchat.ComposableSingletons$StartViewKt$lambda-9$1  reason: invalid class name */
/* compiled from: StartView.kt */
final class ComposableSingletons$StartViewKt$lambda9$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$StartViewKt$lambda9$1 INSTANCE = new ComposableSingletons$StartViewKt$lambda9$1();

    ComposableSingletons$StartViewKt$lambda9$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(904816718, i, -1, "ai.mlc.mlcchat.ComposableSingletons$StartViewKt.lambda-9.<anonymous> (StartView.kt:194)");
            }
            IconKt.m1389Iconww6aTOc(ScheduleKt.getSchedule(Icons.Outlined.INSTANCE), "pending", (Modifier) null, 0, composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
