package androidx.compose.ui.window;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a8\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0002\u0010\b\u001a*\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0007H\u0003¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Dialog", "", "onDismissRequest", "Lkotlin/Function0;", "properties", "Landroidx/compose/ui/window/DialogProperties;", "content", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/DialogProperties;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "DialogLayout", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: AndroidDialog.android.kt */
public final class AndroidDialog_androidKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: androidx.compose.ui.window.DialogWrapper} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: androidx.compose.ui.window.DialogWrapper} */
    /* JADX WARNING: type inference failed for: r12v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void Dialog(kotlin.jvm.functions.Function0<kotlin.Unit> r19, androidx.compose.ui.window.DialogProperties r20, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r21, androidx.compose.runtime.Composer r22, int r23, int r24) {
        /*
            r7 = r19
            r8 = r21
            r9 = r23
            java.lang.String r0 = "onDismissRequest"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = -2032877254(0xffffffff86d4c13a, float:-8.002946E-35)
            r1 = r22
            androidx.compose.runtime.Composer r6 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(Dialog)P(1,2)155@6564L7,156@6603L7,157@6658L7,158@6688L28,159@6743L29,160@6792L38,161@6848L616,182@7470L154,191@7630L193:AndroidDialog.android.kt#2oxthz"
            androidx.compose.runtime.ComposerKt.sourceInformation(r6, r1)
            r1 = r24 & 1
            if (r1 == 0) goto L_0x0025
            r1 = r9 | 6
            goto L_0x0035
        L_0x0025:
            r1 = r9 & 14
            if (r1 != 0) goto L_0x0034
            boolean r1 = r6.changedInstance(r7)
            if (r1 == 0) goto L_0x0031
            r1 = 4
            goto L_0x0032
        L_0x0031:
            r1 = 2
        L_0x0032:
            r1 = r1 | r9
            goto L_0x0035
        L_0x0034:
            r1 = r9
        L_0x0035:
            r2 = r24 & 2
            if (r2 == 0) goto L_0x003c
            r1 = r1 | 48
            goto L_0x004f
        L_0x003c:
            r3 = r9 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x004f
            r3 = r20
            boolean r4 = r6.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x004b
            r4 = 32
            goto L_0x004d
        L_0x004b:
            r4 = 16
        L_0x004d:
            r1 = r1 | r4
            goto L_0x0051
        L_0x004f:
            r3 = r20
        L_0x0051:
            r4 = r24 & 4
            if (r4 == 0) goto L_0x0058
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0068
        L_0x0058:
            r4 = r9 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0068
            boolean r4 = r6.changedInstance(r8)
            if (r4 == 0) goto L_0x0065
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0067
        L_0x0065:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0067:
            r1 = r1 | r4
        L_0x0068:
            r4 = r1 & 731(0x2db, float:1.024E-42)
            r5 = 146(0x92, float:2.05E-43)
            if (r4 != r5) goto L_0x007c
            boolean r4 = r6.getSkipping()
            if (r4 != 0) goto L_0x0075
            goto L_0x007c
        L_0x0075:
            r6.skipToGroupEnd()
            r2 = r3
            r11 = r6
            goto L_0x0177
        L_0x007c:
            if (r2 == 0) goto L_0x008b
            androidx.compose.ui.window.DialogProperties r2 = new androidx.compose.ui.window.DialogProperties
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 7
            r15 = 0
            r10 = r2
            r10.<init>((boolean) r11, (boolean) r12, (androidx.compose.ui.window.SecureFlagPolicy) r13, (int) r14, (kotlin.jvm.internal.DefaultConstructorMarker) r15)
            r5 = r2
            goto L_0x008c
        L_0x008b:
            r5 = r3
        L_0x008c:
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x0098
            r2 = -1
            java.lang.String r3 = "androidx.compose.ui.window.Dialog (AndroidDialog.android.kt:150)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r1, r2, r3)
        L_0x0098:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalView()
            androidx.compose.runtime.CompositionLocal r0 = (androidx.compose.runtime.CompositionLocal) r0
            r2 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r3 = "CC:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r6, r2, r3)
            java.lang.Object r0 = r6.consume(r0)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r6)
            r4 = r0
            android.view.View r4 = (android.view.View) r4
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r0 = (androidx.compose.runtime.CompositionLocal) r0
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r6, r2, r3)
            java.lang.Object r0 = r6.consume(r0)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r6)
            androidx.compose.ui.unit.Density r0 = (androidx.compose.ui.unit.Density) r0
            androidx.compose.runtime.ProvidableCompositionLocal r10 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            androidx.compose.runtime.CompositionLocal r10 = (androidx.compose.runtime.CompositionLocal) r10
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r6, r2, r3)
            java.lang.Object r2 = r6.consume(r10)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r6)
            r3 = r2
            androidx.compose.ui.unit.LayoutDirection r3 = (androidx.compose.ui.unit.LayoutDirection) r3
            r2 = 0
            androidx.compose.runtime.CompositionContext r15 = androidx.compose.runtime.ComposablesKt.rememberCompositionContext(r6, r2)
            int r1 = r1 >> 6
            r1 = r1 & 14
            androidx.compose.runtime.State r1 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(r8, r6, r1)
            java.lang.Object[] r10 = new java.lang.Object[r2]
            r11 = 0
            r12 = 0
            androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialogId$1 r13 = androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialogId$1.INSTANCE
            kotlin.jvm.functions.Function0 r13 = (kotlin.jvm.functions.Function0) r13
            r16 = 3080(0xc08, float:4.316E-42)
            r17 = 6
            r14 = r6
            r18 = r15
            r15 = r16
            r16 = r17
            java.lang.Object r10 = androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable((java.lang.Object[]) r10, r11, (java.lang.String) r12, r13, (androidx.compose.runtime.Composer) r14, (int) r15, (int) r16)
            java.util.UUID r10 = (java.util.UUID) r10
            r11 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r6.startReplaceableGroup(r11)
            java.lang.String r11 = "CC(remember)P(1,2):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r6, r11)
            boolean r11 = r6.changed((java.lang.Object) r4)
            boolean r12 = r6.changed((java.lang.Object) r0)
            r11 = r11 | r12
            java.lang.Object r12 = r6.rememberedValue()
            if (r11 != 0) goto L_0x0122
            androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r11 = r11.getEmpty()
            if (r12 != r11) goto L_0x011e
            goto L_0x0122
        L_0x011e:
            r15 = r3
            r14 = r5
            r11 = r6
            goto L_0x0151
        L_0x0122:
            androidx.compose.ui.window.DialogWrapper r12 = new androidx.compose.ui.window.DialogWrapper
            java.lang.String r11 = "dialogId"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r11)
            r11 = r0
            r0 = r12
            r13 = r1
            r1 = r19
            r14 = r2
            r2 = r5
            r15 = r3
            r3 = r4
            r4 = r15
            r14 = r5
            r5 = r11
            r11 = r6
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialog$1$1$1 r0 = new androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialog$1$1$1
            r0.<init>(r13)
            r1 = 488261145(0x1d1a4619, float:2.041797E-21)
            r2 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(r1, r2, r0)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1 = r18
            r12.setContent(r1, r0)
            r11.updateRememberedValue(r12)
        L_0x0151:
            r11.endReplaceableGroup()
            androidx.compose.ui.window.DialogWrapper r12 = (androidx.compose.ui.window.DialogWrapper) r12
            androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$1 r0 = new androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$1
            r0.<init>(r12)
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r1 = 8
            androidx.compose.runtime.EffectsKt.DisposableEffect((java.lang.Object) r12, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) r0, (androidx.compose.runtime.Composer) r11, (int) r1)
            androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$2 r0 = new androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$2
            r0.<init>(r12, r7, r14, r15)
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            r1 = 0
            androidx.compose.runtime.EffectsKt.SideEffect(r0, r11, r1)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0176
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0176:
            r2 = r14
        L_0x0177:
            androidx.compose.runtime.ScopeUpdateScope r6 = r11.endRestartGroup()
            if (r6 != 0) goto L_0x017e
            goto L_0x0191
        L_0x017e:
            androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$3 r10 = new androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$3
            r0 = r10
            r1 = r19
            r3 = r21
            r4 = r23
            r5 = r24
            r0.<init>(r1, r2, r3, r4, r5)
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            r6.updateScope(r10)
        L_0x0191:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.AndroidDialog_androidKt.Dialog(kotlin.jvm.functions.Function0, androidx.compose.ui.window.DialogProperties, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final void DialogLayout(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i, int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-1177876616);
        ComposerKt.sourceInformation(startRestartGroup, "C(DialogLayout)P(1)443@17404L455:AndroidDialog.android.kt#2oxthz");
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed((Object) modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i3 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1177876616, i3, -1, "androidx.compose.ui.window.DialogLayout (AndroidDialog.android.kt:439)");
            }
            MeasurePolicy measurePolicy = AndroidDialog_androidKt$DialogLayout$1.INSTANCE;
            int i5 = ((i3 >> 3) & 14) | ((i3 << 3) & 112);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)73@2855L7,74@2910L7,75@2969L7,76@2981L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density = (Density) consume;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection = (LayoutDirection) consume2;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume3 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(modifier);
            int i6 = ((i5 << 9) & 7168) | 6;
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer r4 = Updater.m2444constructorimpl(startRestartGroup);
            Updater.m2451setimpl(r4, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2451setimpl(r4, density, ComposeUiNode.Companion.getSetDensity());
            Updater.m2451setimpl(r4, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2451setimpl(r4, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
            materializerOf.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i6 >> 3) & 112));
            startRestartGroup.startReplaceableGroup(2058660585);
            function2.invoke(startRestartGroup, Integer.valueOf((i6 >> 9) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new AndroidDialog_androidKt$DialogLayout$2(modifier, function2, i, i2));
        }
    }

    /* access modifiers changed from: private */
    public static final Function2<Composer, Integer, Unit> Dialog$lambda$0(State<? extends Function2<? super Composer, ? super Integer, Unit>> state) {
        return (Function2) state.getValue();
    }
}
