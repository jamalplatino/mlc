package ai.mlc.mlcchat;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.navigation.NavController;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a1\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007\u001a)\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\fR\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u000f\u001a\u001d\u0010\u0010\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"AlertDialog", "", "onDismissRequest", "Lkotlin/Function0;", "onConfirmation", "error", "", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "ModelView", "navController", "Landroidx/navigation/NavController;", "modelState", "Lai/mlc/mlcchat/AppViewModel$ModelState;", "Lai/mlc/mlcchat/AppViewModel;", "appViewModel", "(Landroidx/navigation/NavController;Lai/mlc/mlcchat/AppViewModel$ModelState;Lai/mlc/mlcchat/AppViewModel;Landroidx/compose/runtime/Composer;I)V", "StartView", "(Landroidx/navigation/NavController;Lai/mlc/mlcchat/AppViewModel;Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: StartView.kt */
public final class StartViewKt {
    public static final void StartView(NavController navController, AppViewModel appViewModel, Composer composer, int i) {
        NavController navController2 = navController;
        AppViewModel appViewModel2 = appViewModel;
        int i2 = i;
        Intrinsics.checkNotNullParameter(navController2, "navController");
        Intrinsics.checkNotNullParameter(appViewModel2, "appViewModel");
        Composer startRestartGroup = composer.startRestartGroup(-825291776);
        ComposerKt.sourceInformation(startRestartGroup, "C(StartView)P(1)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-825291776, i2, -1, "ai.mlc.mlcchat.StartView (StartView.kt:51)");
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Composer composer2 = startRestartGroup;
        ScaffoldKt.m1517ScaffoldTvnljyQ(SuspendingPointerInputFilterKt.pointerInput((Modifier) Modifier.Companion, (Object) Unit.INSTANCE, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) new StartViewKt$StartView$1((FocusManager) consume, (Continuation<? super StartViewKt$StartView$1>) null)), ComposableSingletons$StartViewKt.INSTANCE.m17getLambda2$app_release(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, 0, 0, 0, (WindowInsets) null, ComposableLambdaKt.composableLambda(startRestartGroup, 231641169, true, new StartViewKt$StartView$2(appViewModel2, navController2)), composer2, 805306416, 508);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new StartViewKt$StartView$3(navController2, appViewModel2, i2));
        }
    }

    public static final void AlertDialog(Function0<Unit> function0, Function0<Unit> function02, String str, Composer composer, int i) {
        int i2;
        Composer composer2;
        Function0<Unit> function03 = function0;
        Function0<Unit> function04 = function02;
        String str2 = str;
        int i3 = i;
        Intrinsics.checkNotNullParameter(function03, "onDismissRequest");
        Intrinsics.checkNotNullParameter(function04, "onConfirmation");
        Intrinsics.checkNotNullParameter(str2, "error");
        Composer startRestartGroup = composer.startRestartGroup(376268492);
        ComposerKt.sourceInformation(startRestartGroup, "C(AlertDialog)P(2,1)");
        if ((i3 & 14) == 0) {
            i2 = (startRestartGroup.changedInstance(function03) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i3 & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(function04) ? 32 : 16;
        }
        if ((i3 & 896) == 0) {
            i2 |= startRestartGroup.changed((Object) str2) ? 256 : 128;
        }
        int i4 = i2;
        if ((i4 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(376268492, i4, -1, "ai.mlc.mlcchat.AlertDialog (StartView.kt:101)");
            }
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed((Object) function03);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new StartViewKt$AlertDialog$1$1(function03);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            composer2 = startRestartGroup;
            AndroidAlertDialog_androidKt.m1117AlertDialogOix01E0((Function0) rememberedValue, ComposableLambdaKt.composableLambda(startRestartGroup, 596074260, true, new StartViewKt$AlertDialog$2(function04, i4)), (Modifier) null, ComposableLambdaKt.composableLambda(startRestartGroup, -1437319786, true, new StartViewKt$AlertDialog$3(function03, i4)), (Function2<? super Composer, ? super Integer, Unit>) null, ComposableSingletons$StartViewKt.INSTANCE.m20getLambda5$app_release(), ComposableLambdaKt.composableLambda(startRestartGroup, 1955040089, true, new StartViewKt$AlertDialog$4(str2, i4)), (Shape) null, 0, 0, 0, 0, 0.0f, (DialogProperties) null, composer2, 1772592, 0, 16276);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new StartViewKt$AlertDialog$5(function03, function04, str2, i3));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v67, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v77, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void ModelView(androidx.navigation.NavController r39, ai.mlc.mlcchat.AppViewModel.ModelState r40, ai.mlc.mlcchat.AppViewModel r41, androidx.compose.runtime.Composer r42, int r43) {
        /*
            r0 = r39
            r1 = r40
            r2 = r41
            r3 = r43
            java.lang.String r4 = "navController"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r4)
            java.lang.String r4 = "modelState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r4)
            java.lang.String r4 = "appViewModel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            r4 = -934273229(0xffffffffc8501f33, float:-213116.8)
            r5 = r42
            androidx.compose.runtime.Composer r14 = r5.startRestartGroup(r4)
            java.lang.String r5 = "C(ModelView)P(2,1)"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r5)
            boolean r5 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r5 == 0) goto L_0x0035
            r5 = -1
            java.lang.String r6 = "ai.mlc.mlcchat.ModelView (StartView.kt:120)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r4, r3, r5, r6)
        L_0x0035:
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r6 = 0
            r7 = 0
            ai.mlc.mlcchat.StartViewKt$ModelView$isDeletingModel$2 r8 = ai.mlc.mlcchat.StartViewKt$ModelView$isDeletingModel$2.INSTANCE
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            r10 = 3080(0xc08, float:4.316E-42)
            r11 = 6
            r9 = r14
            java.lang.Object r5 = androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable((java.lang.Object[]) r5, r6, (java.lang.String) r7, r8, (androidx.compose.runtime.Composer) r9, (int) r10, (int) r11)
            r15 = r5
            androidx.compose.runtime.MutableState r15 = (androidx.compose.runtime.MutableState) r15
            androidx.compose.foundation.layout.Arrangement r5 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical r5 = r5.getSpaceBetween()
            androidx.compose.ui.Modifier$Companion r6 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r6 = (androidx.compose.ui.Modifier) r6
            r13 = 0
            r12 = 3
            androidx.compose.ui.Modifier r6 = androidx.compose.foundation.layout.SizeKt.wrapContentHeight$default(r6, r13, r4, r12, r13)
            r7 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r14.startReplaceableGroup(r7)
            java.lang.String r7 = "CC(Column)P(2,3,1)77@3913L61,78@3979L133:Column.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r7)
            androidx.compose.ui.Alignment$Companion r7 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment$Horizontal r7 = r7.getStart()
            androidx.compose.foundation.layout.Arrangement$Vertical r5 = (androidx.compose.foundation.layout.Arrangement.Vertical) r5
            r8 = 6
            androidx.compose.ui.layout.MeasurePolicy r5 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(r5, r7, r14, r8)
            r11 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r14.startReplaceableGroup(r11)
            java.lang.String r9 = "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r9)
            androidx.compose.runtime.ProvidableCompositionLocal r7 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r7 = (androidx.compose.runtime.CompositionLocal) r7
            r10 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r8 = "C:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r14, r10, r8)
            java.lang.Object r7 = r14.consume(r7)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r14)
            androidx.compose.ui.unit.Density r7 = (androidx.compose.ui.unit.Density) r7
            androidx.compose.runtime.ProvidableCompositionLocal r16 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            r11 = r16
            androidx.compose.runtime.CompositionLocal r11 = (androidx.compose.runtime.CompositionLocal) r11
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r14, r10, r8)
            java.lang.Object r11 = r14.consume(r11)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r14)
            androidx.compose.ui.unit.LayoutDirection r11 = (androidx.compose.ui.unit.LayoutDirection) r11
            androidx.compose.runtime.ProvidableCompositionLocal r16 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            r12 = r16
            androidx.compose.runtime.CompositionLocal r12 = (androidx.compose.runtime.CompositionLocal) r12
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r14, r10, r8)
            java.lang.Object r12 = r14.consume(r12)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r14)
            androidx.compose.ui.platform.ViewConfiguration r12 = (androidx.compose.ui.platform.ViewConfiguration) r12
            androidx.compose.ui.node.ComposeUiNode$Companion r16 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function0 r10 = r16.getConstructor()
            kotlin.jvm.functions.Function3 r6 = androidx.compose.ui.layout.LayoutKt.materializerOf(r6)
            androidx.compose.runtime.Applier r13 = r14.getApplier()
            boolean r13 = r13 instanceof androidx.compose.runtime.Applier
            if (r13 != 0) goto L_0x00d0
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x00d0:
            r14.startReusableNode()
            boolean r13 = r14.getInserting()
            if (r13 == 0) goto L_0x00dd
            r14.createNode(r10)
            goto L_0x00e0
        L_0x00dd:
            r14.useNode()
        L_0x00e0:
            r14.disableReusing()
            androidx.compose.runtime.Composer r10 = androidx.compose.runtime.Updater.m2444constructorimpl(r14)
            androidx.compose.ui.node.ComposeUiNode$Companion r13 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r13 = r13.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r10, r5, r13)
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r5 = r5.getSetDensity()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r10, r7, r5)
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r5 = r5.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r10, r11, r5)
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r5 = r5.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r10, r12, r5)
            r14.enableReusing()
            androidx.compose.runtime.Composer r5 = androidx.compose.runtime.SkippableUpdater.m2436constructorimpl(r14)
            androidx.compose.runtime.SkippableUpdater r5 = androidx.compose.runtime.SkippableUpdater.m2435boximpl(r5)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            r6.invoke(r5, r14, r7)
            r13 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r14.startReplaceableGroup(r13)
            r5 = 276693704(0x107e02c8, float:5.009481E-29)
            java.lang.String r6 = "C79@4027L9:Column.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r14, r5, r6)
            androidx.compose.foundation.layout.ColumnScopeInstance r5 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE
            androidx.compose.foundation.layout.ColumnScope r5 = (androidx.compose.foundation.layout.ColumnScope) r5
            androidx.compose.foundation.layout.Arrangement r5 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            r6 = 5
            float r6 = (float) r6
            float r6 = androidx.compose.ui.unit.Dp.m5626constructorimpl(r6)
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical r5 = r5.m410spacedBy0680j_4(r6)
            androidx.compose.ui.Alignment$Companion r6 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment$Vertical r6 = r6.getCenterVertically()
            androidx.compose.ui.Modifier$Companion r7 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r7 = (androidx.compose.ui.Modifier) r7
            r12 = 0
            r11 = 1
            r10 = 0
            androidx.compose.ui.Modifier r7 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(r7, r12, r11, r10)
            r11 = 3
            androidx.compose.ui.Modifier r7 = androidx.compose.foundation.layout.SizeKt.wrapContentHeight$default(r7, r10, r4, r11, r10)
            r11 = 693286680(0x2952b718, float:4.6788176E-14)
            r14.startReplaceableGroup(r11)
            java.lang.String r10 = "CC(Row)P(2,1,3)78@3913L58,79@3976L130:Row.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r10)
            androidx.compose.foundation.layout.Arrangement$Horizontal r5 = (androidx.compose.foundation.layout.Arrangement.Horizontal) r5
            r20 = r15
            r15 = 54
            androidx.compose.ui.layout.MeasurePolicy r5 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(r5, r6, r14, r15)
            r6 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r14.startReplaceableGroup(r6)
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r9)
            androidx.compose.runtime.ProvidableCompositionLocal r21 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            r6 = r21
            androidx.compose.runtime.CompositionLocal r6 = (androidx.compose.runtime.CompositionLocal) r6
            r11 = 2023513938(0x789c5f52, float:2.5372864E34)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r14, r11, r8)
            java.lang.Object r6 = r14.consume(r6)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r14)
            androidx.compose.ui.unit.Density r6 = (androidx.compose.ui.unit.Density) r6
            androidx.compose.runtime.ProvidableCompositionLocal r18 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            r12 = r18
            androidx.compose.runtime.CompositionLocal r12 = (androidx.compose.runtime.CompositionLocal) r12
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r14, r11, r8)
            java.lang.Object r12 = r14.consume(r12)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r14)
            androidx.compose.ui.unit.LayoutDirection r12 = (androidx.compose.ui.unit.LayoutDirection) r12
            androidx.compose.runtime.ProvidableCompositionLocal r18 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            r15 = r18
            androidx.compose.runtime.CompositionLocal r15 = (androidx.compose.runtime.CompositionLocal) r15
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r14, r11, r8)
            java.lang.Object r15 = r14.consume(r15)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r14)
            androidx.compose.ui.platform.ViewConfiguration r15 = (androidx.compose.ui.platform.ViewConfiguration) r15
            androidx.compose.ui.node.ComposeUiNode$Companion r18 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function0 r11 = r18.getConstructor()
            kotlin.jvm.functions.Function3 r7 = androidx.compose.ui.layout.LayoutKt.materializerOf(r7)
            androidx.compose.runtime.Applier r13 = r14.getApplier()
            boolean r13 = r13 instanceof androidx.compose.runtime.Applier
            if (r13 != 0) goto L_0x01c3
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x01c3:
            r14.startReusableNode()
            boolean r13 = r14.getInserting()
            if (r13 == 0) goto L_0x01d0
            r14.createNode(r11)
            goto L_0x01d3
        L_0x01d0:
            r14.useNode()
        L_0x01d3:
            r14.disableReusing()
            androidx.compose.runtime.Composer r11 = androidx.compose.runtime.Updater.m2444constructorimpl(r14)
            androidx.compose.ui.node.ComposeUiNode$Companion r13 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r13 = r13.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r11, r5, r13)
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r5 = r5.getSetDensity()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r11, r6, r5)
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r5 = r5.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r11, r12, r5)
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r5 = r5.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r11, r15, r5)
            r14.enableReusing()
            androidx.compose.runtime.Composer r5 = androidx.compose.runtime.SkippableUpdater.m2436constructorimpl(r14)
            androidx.compose.runtime.SkippableUpdater r5 = androidx.compose.runtime.SkippableUpdater.m2435boximpl(r5)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r7.invoke(r5, r14, r6)
            r13 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r14.startReplaceableGroup(r13)
            r15 = -326682283(0xffffffffec873955, float:-1.3078058E27)
            java.lang.String r12 = "C80@4021L9:Row.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r14, r15, r12)
            androidx.compose.foundation.layout.RowScopeInstance r5 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE
            r31 = r5
            androidx.compose.foundation.layout.RowScope r31 = (androidx.compose.foundation.layout.RowScope) r31
            ai.mlc.mlcchat.ModelConfig r5 = r40.getModelConfig()
            java.lang.String r5 = r5.getModelId()
            androidx.compose.ui.text.style.TextAlign$Companion r6 = androidx.compose.ui.text.style.TextAlign.Companion
            int r18 = r6.m5509getLefte0LSkKk()
            androidx.compose.ui.Modifier$Companion r6 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r6 = (androidx.compose.ui.Modifier) r6
            r7 = 0
            r11 = 3
            androidx.compose.ui.Modifier r26 = androidx.compose.foundation.layout.SizeKt.wrapContentHeight$default(r6, r7, r4, r11, r7)
            r27 = 1090519040(0x41000000, float:8.0)
            r28 = 0
            r29 = 2
            r30 = 0
            r25 = r31
            androidx.compose.ui.Modifier r6 = androidx.compose.foundation.layout.RowScope.weight$default(r25, r26, r27, r28, r29, r30)
            r16 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r25 = 0
            r17 = r7
            r32 = r8
            r7 = r25
            r34 = r9
            r33 = r10
            r9 = r25
            r24 = 0
            r16 = r11
            r4 = 1
            r11 = r24
            r19 = 0
            r35 = r12
            r12 = r19
            r16 = 0
            r13 = r16
            r16 = 0
            r36 = r14
            r37 = r20
            r14 = r16
            r16 = 0
            androidx.compose.ui.text.style.TextAlign r17 = androidx.compose.ui.text.style.TextAlign.m5499boximpl(r18)
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r29 = 130556(0x1fdfc, float:1.82948E-40)
            r26 = r36
            androidx.compose.material3.TextKt.m1727Text4IGK_g((java.lang.String) r5, (androidx.compose.ui.Modifier) r6, (long) r7, (long) r9, (androidx.compose.ui.text.font.FontStyle) r11, (androidx.compose.ui.text.font.FontWeight) r12, (androidx.compose.ui.text.font.FontFamily) r13, (long) r14, (androidx.compose.ui.text.style.TextDecoration) r16, (androidx.compose.ui.text.style.TextAlign) r17, (long) r18, (int) r20, (boolean) r21, (int) r22, (int) r23, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) r24, (androidx.compose.ui.text.TextStyle) r25, (androidx.compose.runtime.Composer) r26, (int) r27, (int) r28, (int) r29)
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r5 = (androidx.compose.ui.Modifier) r5
            r6 = 20
            float r6 = (float) r6
            float r6 = androidx.compose.ui.unit.Dp.m5626constructorimpl(r6)
            androidx.compose.ui.Modifier r5 = androidx.compose.foundation.layout.SizeKt.m549height3ABfNKs(r5, r6)
            float r6 = (float) r4
            float r6 = androidx.compose.ui.unit.Dp.m5626constructorimpl(r6)
            androidx.compose.ui.Modifier r5 = androidx.compose.foundation.layout.SizeKt.m568width3ABfNKs(r5, r6)
            r6 = 0
            r7 = 0
            r10 = 6
            r11 = 6
            r9 = r36
            androidx.compose.material3.DividerKt.m1322Divider9IZ8Weo(r5, r6, r7, r9, r10, r11)
            androidx.compose.runtime.MutableState r5 = r40.getModelInitState()
            java.lang.Object r5 = r5.getValue()
            ai.mlc.mlcchat.ModelInitState r6 = ai.mlc.mlcchat.ModelInitState.Paused
            r14 = 2
            r15 = 1065353216(0x3f800000, float:1.0)
            if (r5 != r6) goto L_0x0303
            r5 = -1106591313(0xffffffffbe0ac1af, float:-0.13550447)
            r13 = r36
            r13.startReplaceableGroup(r5)
            ai.mlc.mlcchat.StartViewKt$ModelView$1$1$1 r5 = new ai.mlc.mlcchat.StartViewKt$ModelView$1$1$1
            r5.<init>(r1)
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            androidx.compose.ui.Modifier$Companion r6 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r6 = (androidx.compose.ui.Modifier) r6
            r7 = 0
            r12 = 0
            androidx.compose.ui.Modifier r26 = androidx.compose.foundation.layout.AspectRatioKt.aspectRatio$default(r6, r15, r7, r14, r12)
            r27 = 1065353216(0x3f800000, float:1.0)
            r28 = 0
            r29 = 2
            r30 = 0
            r25 = r31
            androidx.compose.ui.Modifier r6 = androidx.compose.foundation.layout.RowScope.weight$default(r25, r26, r27, r28, r29, r30)
            r7 = 0
            r8 = 0
            r9 = 0
            ai.mlc.mlcchat.ComposableSingletons$StartViewKt r10 = ai.mlc.mlcchat.ComposableSingletons$StartViewKt.INSTANCE
            kotlin.jvm.functions.Function2 r10 = r10.m21getLambda6$app_release()
            r16 = 196608(0x30000, float:2.75506E-40)
            r17 = 28
            r11 = r13
            r4 = r12
            r12 = r16
            r13 = r17
            androidx.compose.material3.IconButtonKt.IconButton(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r36.endReplaceableGroup()
            goto L_0x03d8
        L_0x0303:
            r4 = 0
            androidx.compose.runtime.MutableState r5 = r40.getModelInitState()
            java.lang.Object r5 = r5.getValue()
            ai.mlc.mlcchat.ModelInitState r6 = ai.mlc.mlcchat.ModelInitState.Downloading
            if (r5 != r6) goto L_0x034e
            r5 = -1106590824(0xffffffffbe0ac398, float:-0.13551176)
            r13 = r36
            r13.startReplaceableGroup(r5)
            ai.mlc.mlcchat.StartViewKt$ModelView$1$1$2 r5 = new ai.mlc.mlcchat.StartViewKt$ModelView$1$1$2
            r5.<init>(r1)
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            androidx.compose.ui.Modifier$Companion r6 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r6 = (androidx.compose.ui.Modifier) r6
            r7 = 0
            androidx.compose.ui.Modifier r26 = androidx.compose.foundation.layout.AspectRatioKt.aspectRatio$default(r6, r15, r7, r14, r4)
            r27 = 1065353216(0x3f800000, float:1.0)
            r28 = 0
            r29 = 2
            r30 = 0
            r25 = r31
            androidx.compose.ui.Modifier r6 = androidx.compose.foundation.layout.RowScope.weight$default(r25, r26, r27, r28, r29, r30)
            r7 = 0
            r8 = 0
            r9 = 0
            ai.mlc.mlcchat.ComposableSingletons$StartViewKt r10 = ai.mlc.mlcchat.ComposableSingletons$StartViewKt.INSTANCE
            kotlin.jvm.functions.Function2 r10 = r10.m22getLambda7$app_release()
            r12 = 196608(0x30000, float:2.75506E-40)
            r16 = 28
            r11 = r13
            r13 = r16
            androidx.compose.material3.IconButtonKt.IconButton(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r36.endReplaceableGroup()
            goto L_0x03d8
        L_0x034e:
            androidx.compose.runtime.MutableState r5 = r40.getModelInitState()
            java.lang.Object r5 = r5.getValue()
            ai.mlc.mlcchat.ModelInitState r6 = ai.mlc.mlcchat.ModelInitState.Finished
            if (r5 != r6) goto L_0x039e
            r5 = -1106590342(0xffffffffbe0ac57a, float:-0.13551894)
            r13 = r36
            r13.startReplaceableGroup(r5)
            ai.mlc.mlcchat.AppViewModel$ChatState r5 = r41.getChatState()
            boolean r7 = r5.interruptable()
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r5 = (androidx.compose.ui.Modifier) r5
            r6 = 0
            androidx.compose.ui.Modifier r26 = androidx.compose.foundation.layout.AspectRatioKt.aspectRatio$default(r5, r15, r6, r14, r4)
            r27 = 1065353216(0x3f800000, float:1.0)
            r28 = 0
            r29 = 2
            r30 = 0
            r25 = r31
            androidx.compose.ui.Modifier r6 = androidx.compose.foundation.layout.RowScope.weight$default(r25, r26, r27, r28, r29, r30)
            ai.mlc.mlcchat.StartViewKt$ModelView$1$1$3 r5 = new ai.mlc.mlcchat.StartViewKt$ModelView$1$1$3
            r5.<init>(r1, r0)
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            r8 = 0
            r9 = 0
            ai.mlc.mlcchat.ComposableSingletons$StartViewKt r10 = ai.mlc.mlcchat.ComposableSingletons$StartViewKt.INSTANCE
            kotlin.jvm.functions.Function2 r10 = r10.m23getLambda8$app_release()
            r12 = 196608(0x30000, float:2.75506E-40)
            r16 = 24
            r11 = r13
            r13 = r16
            androidx.compose.material3.IconButtonKt.IconButton(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r36.endReplaceableGroup()
            goto L_0x03d8
        L_0x039e:
            r5 = -1106589741(0xffffffffbe0ac7d3, float:-0.1355279)
            r13 = r36
            r13.startReplaceableGroup(r5)
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r5 = (androidx.compose.ui.Modifier) r5
            r6 = 0
            androidx.compose.ui.Modifier r26 = androidx.compose.foundation.layout.AspectRatioKt.aspectRatio$default(r5, r15, r6, r14, r4)
            r27 = 1065353216(0x3f800000, float:1.0)
            r28 = 0
            r29 = 2
            r30 = 0
            r25 = r31
            androidx.compose.ui.Modifier r6 = androidx.compose.foundation.layout.RowScope.weight$default(r25, r26, r27, r28, r29, r30)
            ai.mlc.mlcchat.StartViewKt$ModelView$1$1$4 r5 = ai.mlc.mlcchat.StartViewKt$ModelView$1$1$4.INSTANCE
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            r7 = 0
            r8 = 0
            r9 = 0
            ai.mlc.mlcchat.ComposableSingletons$StartViewKt r10 = ai.mlc.mlcchat.ComposableSingletons$StartViewKt.INSTANCE
            kotlin.jvm.functions.Function2 r10 = r10.m24getLambda9$app_release()
            r12 = 196998(0x30186, float:2.76053E-40)
            r16 = 24
            r11 = r13
            r13 = r16
            androidx.compose.material3.IconButtonKt.IconButton(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r36.endReplaceableGroup()
        L_0x03d8:
            r5 = -970400053(0xffffffffc628decb, float:-10807.698)
            r13 = r36
            r13.startReplaceableGroup(r5)
            androidx.compose.runtime.MutableState r5 = r40.getModelInitState()
            java.lang.Object r5 = r5.getValue()
            ai.mlc.mlcchat.ModelInitState r6 = ai.mlc.mlcchat.ModelInitState.Downloading
            java.lang.String r12 = "CC(remember)P(1):Composables.kt#9igjgp"
            r11 = 1157296644(0x44faf204, float:2007.563)
            if (r5 == r6) goto L_0x040f
            androidx.compose.runtime.MutableState r5 = r40.getModelInitState()
            java.lang.Object r5 = r5.getValue()
            ai.mlc.mlcchat.ModelInitState r6 = ai.mlc.mlcchat.ModelInitState.Paused
            if (r5 == r6) goto L_0x040f
            androidx.compose.runtime.MutableState r5 = r40.getModelInitState()
            java.lang.Object r5 = r5.getValue()
            ai.mlc.mlcchat.ModelInitState r6 = ai.mlc.mlcchat.ModelInitState.Finished
            if (r5 != r6) goto L_0x040a
            goto L_0x040f
        L_0x040a:
            r14 = r11
            r38 = r12
            r15 = r13
            goto L_0x046c
        L_0x040f:
            r13.startReplaceableGroup(r11)
            androidx.compose.runtime.ComposerKt.sourceInformation(r13, r12)
            r10 = r37
            boolean r5 = r13.changed((java.lang.Object) r10)
            java.lang.Object r6 = r13.rememberedValue()
            if (r5 != 0) goto L_0x0429
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r5 = r5.getEmpty()
            if (r6 != r5) goto L_0x0434
        L_0x0429:
            ai.mlc.mlcchat.StartViewKt$ModelView$1$1$5$1 r5 = new ai.mlc.mlcchat.StartViewKt$ModelView$1$1$5$1
            r5.<init>(r10)
            r6 = r5
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r13.updateRememberedValue(r6)
        L_0x0434:
            r13.endReplaceableGroup()
            r5 = r6
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            androidx.compose.ui.Modifier$Companion r6 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r6 = (androidx.compose.ui.Modifier) r6
            r7 = 0
            androidx.compose.ui.Modifier r26 = androidx.compose.foundation.layout.AspectRatioKt.aspectRatio$default(r6, r15, r7, r14, r4)
            r27 = 1065353216(0x3f800000, float:1.0)
            r28 = 0
            r29 = 2
            r30 = 0
            r25 = r31
            androidx.compose.ui.Modifier r6 = androidx.compose.foundation.layout.RowScope.weight$default(r25, r26, r27, r28, r29, r30)
            r7 = 0
            r8 = 0
            r9 = 0
            ai.mlc.mlcchat.ComposableSingletons$StartViewKt r14 = ai.mlc.mlcchat.ComposableSingletons$StartViewKt.INSTANCE
            kotlin.jvm.functions.Function2 r14 = r14.m13getLambda10$app_release()
            r15 = 196608(0x30000, float:2.75506E-40)
            r16 = 28
            r37 = r10
            r10 = r14
            r14 = r11
            r11 = r13
            r38 = r12
            r12 = r15
            r15 = r13
            r13 = r16
            androidx.compose.material3.IconButtonKt.IconButton(r5, r6, r7, r8, r9, r10, r11, r12, r13)
        L_0x046c:
            r15.endReplaceableGroup()
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r15)
            r15.endReplaceableGroup()
            r15.endNode()
            r15.endReplaceableGroup()
            r15.endReplaceableGroup()
            androidx.compose.runtime.MutableState r5 = r40.getProgress()
            java.lang.Object r5 = r5.getValue()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            float r5 = (float) r5
            androidx.compose.runtime.MutableState r6 = r40.getTotal()
            java.lang.Object r6 = r6.getValue()
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            float r5 = r5 / r6
            androidx.compose.ui.Modifier$Companion r6 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r6 = (androidx.compose.ui.Modifier) r6
            r7 = 1
            r13 = 0
            androidx.compose.ui.Modifier r6 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(r6, r13, r7, r4)
            r7 = 0
            r9 = 0
            r11 = 0
            r16 = 48
            r17 = 28
            r12 = r15
            r13 = r16
            r14 = r17
            androidx.compose.material3.ProgressIndicatorKt.m1498LinearProgressIndicator_5eSRE(r5, r6, r7, r9, r11, r12, r13, r14)
            r5 = -273887676(0xffffffffefacce44, float:-1.0696156E29)
            r15.startReplaceableGroup(r5)
            boolean r5 = ModelView$lambda$1(r37)
            if (r5 == 0) goto L_0x0622
            androidx.compose.foundation.layout.Arrangement r5 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            androidx.compose.foundation.layout.Arrangement$Horizontal r5 = r5.getEnd()
            androidx.compose.ui.Alignment$Companion r6 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment$Vertical r6 = r6.getCenterVertically()
            androidx.compose.ui.Modifier$Companion r7 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r7 = (androidx.compose.ui.Modifier) r7
            r8 = 0
            r9 = 1
            androidx.compose.ui.Modifier r7 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(r7, r8, r9, r4)
            r8 = 3
            r9 = 0
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.SizeKt.wrapContentHeight$default(r7, r4, r9, r8, r4)
            r7 = 693286680(0x2952b718, float:4.6788176E-14)
            r15.startReplaceableGroup(r7)
            r7 = r33
            androidx.compose.runtime.ComposerKt.sourceInformation(r15, r7)
            r7 = 54
            androidx.compose.ui.layout.MeasurePolicy r5 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(r5, r6, r15, r7)
            r6 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r15.startReplaceableGroup(r6)
            r6 = r34
            androidx.compose.runtime.ComposerKt.sourceInformation(r15, r6)
            androidx.compose.runtime.ProvidableCompositionLocal r6 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r6 = (androidx.compose.runtime.CompositionLocal) r6
            r7 = r32
            r8 = 2023513938(0x789c5f52, float:2.5372864E34)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r15, r8, r7)
            java.lang.Object r6 = r15.consume(r6)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r15)
            androidx.compose.ui.unit.Density r6 = (androidx.compose.ui.unit.Density) r6
            androidx.compose.runtime.ProvidableCompositionLocal r9 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            androidx.compose.runtime.CompositionLocal r9 = (androidx.compose.runtime.CompositionLocal) r9
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r15, r8, r7)
            java.lang.Object r9 = r15.consume(r9)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r15)
            androidx.compose.ui.unit.LayoutDirection r9 = (androidx.compose.ui.unit.LayoutDirection) r9
            androidx.compose.runtime.ProvidableCompositionLocal r10 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            androidx.compose.runtime.CompositionLocal r10 = (androidx.compose.runtime.CompositionLocal) r10
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r15, r8, r7)
            java.lang.Object r7 = r15.consume(r10)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r15)
            androidx.compose.ui.platform.ViewConfiguration r7 = (androidx.compose.ui.platform.ViewConfiguration) r7
            androidx.compose.ui.node.ComposeUiNode$Companion r8 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function0 r8 = r8.getConstructor()
            kotlin.jvm.functions.Function3 r4 = androidx.compose.ui.layout.LayoutKt.materializerOf(r4)
            androidx.compose.runtime.Applier r10 = r15.getApplier()
            boolean r10 = r10 instanceof androidx.compose.runtime.Applier
            if (r10 != 0) goto L_0x054b
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x054b:
            r15.startReusableNode()
            boolean r10 = r15.getInserting()
            if (r10 == 0) goto L_0x0558
            r15.createNode(r8)
            goto L_0x055b
        L_0x0558:
            r15.useNode()
        L_0x055b:
            r15.disableReusing()
            androidx.compose.runtime.Composer r8 = androidx.compose.runtime.Updater.m2444constructorimpl(r15)
            androidx.compose.ui.node.ComposeUiNode$Companion r10 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r10 = r10.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r8, r5, r10)
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r5 = r5.getSetDensity()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r8, r6, r5)
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r5 = r5.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r8, r9, r5)
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r5 = r5.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r8, r7, r5)
            r15.enableReusing()
            androidx.compose.runtime.Composer r5 = androidx.compose.runtime.SkippableUpdater.m2436constructorimpl(r15)
            androidx.compose.runtime.SkippableUpdater r5 = androidx.compose.runtime.SkippableUpdater.m2435boximpl(r5)
            r6 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.invoke(r5, r15, r6)
            r4 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r15.startReplaceableGroup(r4)
            r4 = r35
            r5 = -326682283(0xffffffffec873955, float:-1.3078058E27)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r15, r5, r4)
            androidx.compose.foundation.layout.RowScopeInstance r4 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE
            androidx.compose.foundation.layout.RowScope r4 = (androidx.compose.foundation.layout.RowScope) r4
            r4 = 1157296644(0x44faf204, float:2007.563)
            r15.startReplaceableGroup(r4)
            r4 = r38
            androidx.compose.runtime.ComposerKt.sourceInformation(r15, r4)
            r4 = r37
            boolean r5 = r15.changed((java.lang.Object) r4)
            java.lang.Object r6 = r15.rememberedValue()
            if (r5 != 0) goto L_0x05ca
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r5 = r5.getEmpty()
            if (r6 != r5) goto L_0x05d5
        L_0x05ca:
            ai.mlc.mlcchat.StartViewKt$ModelView$1$2$1$1 r5 = new ai.mlc.mlcchat.StartViewKt$ModelView$1$2$1$1
            r5.<init>(r4)
            r6 = r5
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r15.updateRememberedValue(r6)
        L_0x05d5:
            r15.endReplaceableGroup()
            r5 = r6
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            ai.mlc.mlcchat.ComposableSingletons$StartViewKt r14 = ai.mlc.mlcchat.ComposableSingletons$StartViewKt.INSTANCE
            kotlin.jvm.functions.Function3 r14 = r14.m14getLambda11$app_release()
            r16 = 805306368(0x30000000, float:4.656613E-10)
            r17 = 510(0x1fe, float:7.15E-43)
            r18 = r15
            androidx.compose.material3.ButtonKt.TextButton(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            ai.mlc.mlcchat.StartViewKt$ModelView$1$2$2 r5 = new ai.mlc.mlcchat.StartViewKt$ModelView$1$2$2
            r5.<init>(r1, r4)
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            ai.mlc.mlcchat.ComposableSingletons$StartViewKt r14 = ai.mlc.mlcchat.ComposableSingletons$StartViewKt.INSTANCE
            kotlin.jvm.functions.Function3 r14 = r14.m15getLambda12$app_release()
            androidx.compose.material3.ButtonKt.TextButton(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            ai.mlc.mlcchat.StartViewKt$ModelView$1$2$3 r5 = new ai.mlc.mlcchat.StartViewKt$ModelView$1$2$3
            r5.<init>(r1, r4)
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            ai.mlc.mlcchat.ComposableSingletons$StartViewKt r4 = ai.mlc.mlcchat.ComposableSingletons$StartViewKt.INSTANCE
            kotlin.jvm.functions.Function3 r14 = r4.m16getLambda13$app_release()
            androidx.compose.material3.ButtonKt.TextButton(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r18)
            r18.endReplaceableGroup()
            r18.endNode()
            r18.endReplaceableGroup()
            r18.endReplaceableGroup()
            goto L_0x0624
        L_0x0622:
            r18 = r15
        L_0x0624:
            r18.endReplaceableGroup()
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r18)
            r18.endReplaceableGroup()
            r18.endNode()
            r18.endReplaceableGroup()
            r18.endReplaceableGroup()
            boolean r4 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r4 == 0) goto L_0x063f
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x063f:
            androidx.compose.runtime.ScopeUpdateScope r4 = r18.endRestartGroup()
            if (r4 != 0) goto L_0x0646
            goto L_0x0650
        L_0x0646:
            ai.mlc.mlcchat.StartViewKt$ModelView$2 r5 = new ai.mlc.mlcchat.StartViewKt$ModelView$2
            r5.<init>(r0, r1, r2, r3)
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            r4.updateScope(r5)
        L_0x0650:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.mlc.mlcchat.StartViewKt.ModelView(androidx.navigation.NavController, ai.mlc.mlcchat.AppViewModel$ModelState, ai.mlc.mlcchat.AppViewModel, androidx.compose.runtime.Composer, int):void");
    }

    private static final boolean ModelView$lambda$1(MutableState<Boolean> mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* access modifiers changed from: private */
    public static final void ModelView$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }
}
