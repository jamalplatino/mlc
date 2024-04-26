package ai.mlc.mlcchat;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: StartView.kt */
final class StartViewKt$AlertDialog$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function0<Unit> $onDismissRequest;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StartViewKt$AlertDialog$3(Function0<Unit> function0, int i) {
        super(2);
        this.$onDismissRequest = function0;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.runtime.Composer r15, int r16) {
        /*
            r14 = this;
            r10 = r15
            r0 = r16
            r1 = r0 & 11
            r2 = 2
            if (r1 != r2) goto L_0x0014
            boolean r1 = r15.getSkipping()
            if (r1 != 0) goto L_0x000f
            goto L_0x0014
        L_0x000f:
            r15.skipToGroupEnd()
            r13 = r14
            goto L_0x0074
        L_0x0014:
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x0024
            r1 = -1
            java.lang.String r2 = "ai.mlc.mlcchat.AlertDialog.<anonymous> (StartView.kt:113)"
            r3 = -1437319786(0xffffffffaa543d96, float:-1.885075E-13)
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r0, r1, r2)
        L_0x0024:
            r13 = r14
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r13.$onDismissRequest
            r1 = 1157296644(0x44faf204, float:2007.563)
            r15.startReplaceableGroup(r1)
            java.lang.String r1 = "CC(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r15, r1)
            boolean r1 = r15.changed((java.lang.Object) r0)
            java.lang.Object r2 = r15.rememberedValue()
            if (r1 != 0) goto L_0x0044
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r2 != r1) goto L_0x004f
        L_0x0044:
            ai.mlc.mlcchat.StartViewKt$AlertDialog$3$1$1 r1 = new ai.mlc.mlcchat.StartViewKt$AlertDialog$3$1$1
            r1.<init>(r0)
            r2 = r1
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            r15.updateRememberedValue(r2)
        L_0x004f:
            r15.endReplaceableGroup()
            r0 = r2
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            ai.mlc.mlcchat.ComposableSingletons$StartViewKt r9 = ai.mlc.mlcchat.ComposableSingletons$StartViewKt.INSTANCE
            kotlin.jvm.functions.Function3 r9 = r9.m19getLambda4$app_release()
            r11 = 805306368(0x30000000, float:4.656613E-10)
            r12 = 510(0x1fe, float:7.15E-43)
            r10 = r15
            androidx.compose.material3.ButtonKt.TextButton(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0074
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0074:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.mlc.mlcchat.StartViewKt$AlertDialog$3.invoke(androidx.compose.runtime.Composer, int):void");
    }
}
