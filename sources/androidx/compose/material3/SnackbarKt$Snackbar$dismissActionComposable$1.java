package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: Snackbar.kt */
final class SnackbarKt$Snackbar$dismissActionComposable$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ SnackbarData $snackbarData;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnackbarKt$Snackbar$dismissActionComposable$1(SnackbarData snackbarData, int i) {
        super(2);
        this.$snackbarData = snackbarData;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.runtime.Composer r12, int r13) {
        /*
            r11 = this;
            java.lang.String r0 = "C224@10423L26,223@10381L330:Snackbar.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r12, r0)
            r0 = r13 & 11
            r1 = 2
            if (r0 != r1) goto L_0x0015
            boolean r0 = r12.getSkipping()
            if (r0 != 0) goto L_0x0011
            goto L_0x0015
        L_0x0011:
            r12.skipToGroupEnd()
            goto L_0x0070
        L_0x0015:
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0025
            r0 = -1
            java.lang.String r1 = "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:222)"
            r2 = -1812633777(0xffffffff93f5674f, float:-6.1948565E-27)
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r13, r0, r1)
        L_0x0025:
            androidx.compose.material3.SnackbarData r13 = r11.$snackbarData
            r0 = 1157296644(0x44faf204, float:2007.563)
            r12.startReplaceableGroup(r0)
            java.lang.String r0 = "CC(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r12, r0)
            boolean r0 = r12.changed((java.lang.Object) r13)
            java.lang.Object r1 = r12.rememberedValue()
            if (r0 != 0) goto L_0x0044
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r0 = r0.getEmpty()
            if (r1 != r0) goto L_0x004f
        L_0x0044:
            androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1$1$1 r0 = new androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1$1$1
            r0.<init>(r13)
            r1 = r0
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r12.updateRememberedValue(r1)
        L_0x004f:
            r12.endReplaceableGroup()
            r2 = r1
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            androidx.compose.material3.ComposableSingletons$SnackbarKt r13 = androidx.compose.material3.ComposableSingletons$SnackbarKt.INSTANCE
            kotlin.jvm.functions.Function2 r7 = r13.m1272getLambda1$material3_release()
            r9 = 196608(0x30000, float:2.75506E-40)
            r10 = 30
            r8 = r12
            androidx.compose.material3.IconButtonKt.IconButton(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r12 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r12 == 0) goto L_0x0070
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1.invoke(androidx.compose.runtime.Composer, int):void");
    }
}
