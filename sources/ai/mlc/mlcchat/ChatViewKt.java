package ai.mlc.mlcchat;

import ai.mlc.mlcchat.AppViewModel;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.text.selection.SelectionContainerKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.navigation.NavController;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005R\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007\u001a\u0015\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b\u001a\u0019\u0010\f\u001a\u00020\u00012\n\u0010\u0004\u001a\u00060\u0005R\u00020\u0006H\u0007¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"ChatView", "", "navController", "Landroidx/navigation/NavController;", "chatState", "Lai/mlc/mlcchat/AppViewModel$ChatState;", "Lai/mlc/mlcchat/AppViewModel;", "(Landroidx/navigation/NavController;Lai/mlc/mlcchat/AppViewModel$ChatState;Landroidx/compose/runtime/Composer;I)V", "MessageView", "messageData", "Lai/mlc/mlcchat/MessageData;", "(Lai/mlc/mlcchat/MessageData;Landroidx/compose/runtime/Composer;I)V", "SendMessageView", "(Lai/mlc/mlcchat/AppViewModel$ChatState;Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: ChatView.kt */
public final class ChatViewKt {
    public static final void ChatView(NavController navController, AppViewModel.ChatState chatState, Composer composer, int i) {
        NavController navController2 = navController;
        AppViewModel.ChatState chatState2 = chatState;
        int i2 = i;
        Intrinsics.checkNotNullParameter(navController2, "navController");
        Intrinsics.checkNotNullParameter(chatState2, "chatState");
        Composer startRestartGroup = composer.startRestartGroup(2097304218);
        ComposerKt.sourceInformation(startRestartGroup, "C(ChatView)P(1)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2097304218, i2, -1, "ai.mlc.mlcchat.ChatView (ChatView.kt:52)");
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Composer composer2 = startRestartGroup;
        ScaffoldKt.m1517ScaffoldTvnljyQ(SuspendingPointerInputFilterKt.pointerInput((Modifier) Modifier.Companion, (Object) Unit.INSTANCE, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) new ChatViewKt$ChatView$1((FocusManager) consume, (Continuation<? super ChatViewKt$ChatView$1>) null)), ComposableLambdaKt.composableLambda(startRestartGroup, 58179934, true, new ChatViewKt$ChatView$2(chatState2, navController2)), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, 0, 0, 0, (WindowInsets) null, ComposableLambdaKt.composableLambda(startRestartGroup, 1365483433, true, new ChatViewKt$ChatView$3(chatState2)), composer2, 805306416, 508);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ChatViewKt$ChatView$4(navController2, chatState2, i2));
        }
    }

    public static final void MessageView(MessageData messageData, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(messageData, "messageData");
        Composer startRestartGroup = composer.startRestartGroup(933426146);
        ComposerKt.sourceInformation(startRestartGroup, "C(MessageView)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(933426146, i, -1, "ai.mlc.mlcchat.MessageView (ChatView.kt:136)");
        }
        SelectionContainerKt.SelectionContainer((Modifier) null, ComposableLambdaKt.composableLambda(startRestartGroup, -451816481, true, new ChatViewKt$MessageView$1(messageData)), startRestartGroup, 48, 1);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ChatViewKt$MessageView$2(messageData, i));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void SendMessageView(ai.mlc.mlcchat.AppViewModel.ChatState r35, androidx.compose.runtime.Composer r36, int r37) {
        /*
            r0 = r35
            r1 = r37
            java.lang.String r2 = "chatState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            r2 = -1505911230(0xffffffffa63d9e42, float:-6.5787027E-16)
            r3 = r36
            androidx.compose.runtime.Composer r15 = r3.startRestartGroup(r2)
            java.lang.String r3 = "C(SendMessageView)"
            androidx.compose.runtime.ComposerKt.sourceInformation(r15, r3)
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L_0x0025
            r3 = -1
            java.lang.String r4 = "ai.mlc.mlcchat.SendMessageView (ChatView.kt:184)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r1, r3, r4)
        L_0x0025:
            androidx.compose.runtime.ProvidableCompositionLocal r2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalFocusManager()
            androidx.compose.runtime.CompositionLocal r2 = (androidx.compose.runtime.CompositionLocal) r2
            java.lang.String r3 = "CC:CompositionLocal.kt#9igjgp"
            r4 = 2023513938(0x789c5f52, float:2.5372864E34)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r15, r4, r3)
            java.lang.Object r2 = r15.consume(r2)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r15)
            androidx.compose.ui.focus.FocusManager r2 = (androidx.compose.ui.focus.FocusManager) r2
            androidx.compose.foundation.layout.Arrangement r3 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            r5 = 5
            float r5 = (float) r5
            float r6 = androidx.compose.ui.unit.Dp.m5626constructorimpl(r5)
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical r3 = r3.m410spacedBy0680j_4(r6)
            androidx.compose.ui.Alignment$Companion r6 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment$Vertical r6 = r6.getCenterVertically()
            androidx.compose.ui.Modifier$Companion r7 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r7 = (androidx.compose.ui.Modifier) r7
            androidx.compose.foundation.layout.IntrinsicSize r8 = androidx.compose.foundation.layout.IntrinsicSize.Max
            androidx.compose.ui.Modifier r7 = androidx.compose.foundation.layout.IntrinsicKt.height(r7, r8)
            r8 = 0
            r14 = 1
            r13 = 0
            androidx.compose.ui.Modifier r16 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(r7, r8, r14, r13)
            r17 = 0
            r18 = 0
            r19 = 0
            float r20 = androidx.compose.ui.unit.Dp.m5626constructorimpl(r5)
            r21 = 7
            r22 = 0
            androidx.compose.ui.Modifier r5 = androidx.compose.foundation.layout.PaddingKt.m497paddingqDBjuR0$default(r16, r17, r18, r19, r20, r21, r22)
            r7 = 693286680(0x2952b718, float:4.6788176E-14)
            r15.startReplaceableGroup(r7)
            java.lang.String r7 = "CC(Row)P(2,1,3)78@3913L58,79@3976L130:Row.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformation(r15, r7)
            androidx.compose.foundation.layout.Arrangement$Horizontal r3 = (androidx.compose.foundation.layout.Arrangement.Horizontal) r3
            r7 = 54
            androidx.compose.ui.layout.MeasurePolicy r3 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(r3, r6, r15, r7)
            r6 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r15.startReplaceableGroup(r6)
            java.lang.String r6 = "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh"
            androidx.compose.runtime.ComposerKt.sourceInformation(r15, r6)
            androidx.compose.runtime.ProvidableCompositionLocal r6 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r6 = (androidx.compose.runtime.CompositionLocal) r6
            java.lang.String r7 = "C:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r15, r4, r7)
            java.lang.Object r6 = r15.consume(r6)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r15)
            androidx.compose.ui.unit.Density r6 = (androidx.compose.ui.unit.Density) r6
            androidx.compose.runtime.ProvidableCompositionLocal r8 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            androidx.compose.runtime.CompositionLocal r8 = (androidx.compose.runtime.CompositionLocal) r8
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r15, r4, r7)
            java.lang.Object r8 = r15.consume(r8)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r15)
            androidx.compose.ui.unit.LayoutDirection r8 = (androidx.compose.ui.unit.LayoutDirection) r8
            androidx.compose.runtime.ProvidableCompositionLocal r9 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            androidx.compose.runtime.CompositionLocal r9 = (androidx.compose.runtime.CompositionLocal) r9
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r15, r4, r7)
            java.lang.Object r4 = r15.consume(r9)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r15)
            androidx.compose.ui.platform.ViewConfiguration r4 = (androidx.compose.ui.platform.ViewConfiguration) r4
            androidx.compose.ui.node.ComposeUiNode$Companion r7 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function0 r7 = r7.getConstructor()
            kotlin.jvm.functions.Function3 r5 = androidx.compose.ui.layout.LayoutKt.materializerOf(r5)
            androidx.compose.runtime.Applier r9 = r15.getApplier()
            boolean r9 = r9 instanceof androidx.compose.runtime.Applier
            if (r9 != 0) goto L_0x00dc
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x00dc:
            r15.startReusableNode()
            boolean r9 = r15.getInserting()
            if (r9 == 0) goto L_0x00e9
            r15.createNode(r7)
            goto L_0x00ec
        L_0x00e9:
            r15.useNode()
        L_0x00ec:
            r15.disableReusing()
            androidx.compose.runtime.Composer r7 = androidx.compose.runtime.Updater.m2444constructorimpl(r15)
            androidx.compose.ui.node.ComposeUiNode$Companion r9 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r9 = r9.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r7, r3, r9)
            androidx.compose.ui.node.ComposeUiNode$Companion r3 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r3 = r3.getSetDensity()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r7, r6, r3)
            androidx.compose.ui.node.ComposeUiNode$Companion r3 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r3 = r3.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r7, r8, r3)
            androidx.compose.ui.node.ComposeUiNode$Companion r3 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r3 = r3.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r7, r4, r3)
            r15.enableReusing()
            androidx.compose.runtime.Composer r3 = androidx.compose.runtime.SkippableUpdater.m2436constructorimpl(r15)
            androidx.compose.runtime.SkippableUpdater r3 = androidx.compose.runtime.SkippableUpdater.m2435boximpl(r3)
            r12 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)
            r5.invoke(r3, r15, r4)
            r3 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r15.startReplaceableGroup(r3)
            r3 = -326682283(0xffffffffec873955, float:-1.3078058E27)
            java.lang.String r4 = "C80@4021L9:Row.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r15, r3, r4)
            androidx.compose.foundation.layout.RowScopeInstance r3 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE
            r31 = r3
            androidx.compose.foundation.layout.RowScope r31 = (androidx.compose.foundation.layout.RowScope) r31
            java.lang.Object[] r3 = new java.lang.Object[r12]
            r4 = 0
            r5 = 0
            ai.mlc.mlcchat.ChatViewKt$SendMessageView$1$text$2 r6 = ai.mlc.mlcchat.ChatViewKt$SendMessageView$1$text$2.INSTANCE
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r8 = 3080(0xc08, float:4.316E-42)
            r9 = 6
            r7 = r15
            java.lang.Object r3 = androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable((java.lang.Object[]) r3, r4, (java.lang.String) r5, r6, (androidx.compose.runtime.Composer) r7, (int) r8, (int) r9)
            androidx.compose.runtime.MutableState r3 = (androidx.compose.runtime.MutableState) r3
            java.lang.String r26 = SendMessageView$lambda$3$lambda$0(r3)
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.Companion
            r5 = r4
            androidx.compose.ui.Modifier r5 = (androidx.compose.ui.Modifier) r5
            r6 = 1091567616(0x41100000, float:9.0)
            r7 = 0
            r8 = 2
            r9 = 0
            r4 = r31
            androidx.compose.ui.Modifier r5 = androidx.compose.foundation.layout.RowScope.weight$default(r4, r5, r6, r7, r8, r9)
            r4 = 1157296644(0x44faf204, float:2007.563)
            r15.startReplaceableGroup(r4)
            java.lang.String r4 = "CC(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r15, r4)
            boolean r4 = r15.changed((java.lang.Object) r3)
            java.lang.Object r6 = r15.rememberedValue()
            if (r4 != 0) goto L_0x0181
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r4 = r4.getEmpty()
            if (r6 != r4) goto L_0x018c
        L_0x0181:
            ai.mlc.mlcchat.ChatViewKt$SendMessageView$1$1$1 r4 = new ai.mlc.mlcchat.ChatViewKt$SendMessageView$1$1$1
            r4.<init>(r3)
            r6 = r4
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            r15.updateRememberedValue(r6)
        L_0x018c:
            r15.endReplaceableGroup()
            r4 = r6
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            r6 = 0
            r7 = 0
            r8 = 0
            ai.mlc.mlcchat.ComposableSingletons$ChatViewKt r9 = ai.mlc.mlcchat.ComposableSingletons$ChatViewKt.INSTANCE
            kotlin.jvm.functions.Function2 r9 = r9.m7getLambda4$app_release()
            r10 = 0
            r11 = 0
            r16 = 0
            r12 = r16
            r13 = r16
            r32 = r14
            r14 = r16
            r33 = r15
            r15 = r16
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = 1572864(0x180000, float:2.204052E-39)
            r28 = 0
            r29 = 0
            r30 = 8388536(0x7fffb8, float:1.1754843E-38)
            r34 = r3
            r3 = r26
            r26 = r33
            androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField((java.lang.String) r3, (kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>) r4, (androidx.compose.ui.Modifier) r5, (boolean) r6, (boolean) r7, (androidx.compose.ui.text.TextStyle) r8, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) r9, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) r10, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) r11, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) r12, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) r13, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) r14, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) r15, (boolean) r16, (androidx.compose.ui.text.input.VisualTransformation) r17, (androidx.compose.foundation.text.KeyboardOptions) r18, (androidx.compose.foundation.text.KeyboardActions) r19, (boolean) r20, (int) r21, (int) r22, (androidx.compose.foundation.interaction.MutableInteractionSource) r23, (androidx.compose.ui.graphics.Shape) r24, (androidx.compose.material3.TextFieldColors) r25, (androidx.compose.runtime.Composer) r26, (int) r27, (int) r28, (int) r29, (int) r30)
            ai.mlc.mlcchat.ChatViewKt$SendMessageView$1$2 r3 = new ai.mlc.mlcchat.ChatViewKt$SendMessageView$1$2
            r10 = r34
            r3.<init>(r2, r0, r10)
            kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r2 = (androidx.compose.ui.Modifier) r2
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 2
            r6 = 0
            r11 = 0
            androidx.compose.ui.Modifier r5 = androidx.compose.foundation.layout.AspectRatioKt.aspectRatio$default(r2, r4, r11, r5, r6)
            r6 = 1065353216(0x3f800000, float:1.0)
            r8 = 2
            r9 = 0
            r4 = r31
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.RowScope.weight$default(r4, r5, r6, r7, r8, r9)
            java.lang.String r2 = SendMessageView$lambda$3$lambda$0(r10)
            java.lang.String r5 = ""
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r5)
            if (r2 != 0) goto L_0x0206
            boolean r2 = r35.chatable()
            if (r2 == 0) goto L_0x0206
            r5 = r32
            goto L_0x0207
        L_0x0206:
            r5 = r11
        L_0x0207:
            r6 = 0
            r7 = 0
            ai.mlc.mlcchat.ComposableSingletons$ChatViewKt r2 = ai.mlc.mlcchat.ComposableSingletons$ChatViewKt.INSTANCE
            kotlin.jvm.functions.Function2 r8 = r2.m8getLambda5$app_release()
            r10 = 196608(0x30000, float:2.75506E-40)
            r11 = 24
            r9 = r33
            androidx.compose.material3.IconButtonKt.IconButton(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r33)
            r33.endReplaceableGroup()
            r33.endNode()
            r33.endReplaceableGroup()
            r33.endReplaceableGroup()
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x0230
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0230:
            androidx.compose.runtime.ScopeUpdateScope r2 = r33.endRestartGroup()
            if (r2 != 0) goto L_0x0237
            goto L_0x0241
        L_0x0237:
            ai.mlc.mlcchat.ChatViewKt$SendMessageView$2 r3 = new ai.mlc.mlcchat.ChatViewKt$SendMessageView$2
            r3.<init>(r0, r1)
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
            r2.updateScope(r3)
        L_0x0241:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.mlc.mlcchat.ChatViewKt.SendMessageView(ai.mlc.mlcchat.AppViewModel$ChatState, androidx.compose.runtime.Composer, int):void");
    }

    /* access modifiers changed from: private */
    public static final String SendMessageView$lambda$3$lambda$0(MutableState<String> mutableState) {
        return (String) mutableState.getValue();
    }

    /* access modifiers changed from: private */
    public static final void SendMessageView$lambda$3$lambda$1(MutableState<String> mutableState, String str) {
        mutableState.setValue(str);
    }
}
