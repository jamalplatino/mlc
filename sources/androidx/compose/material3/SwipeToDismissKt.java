package androidx.compose.material3;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ak\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0007¢\u0006\u0002\u0010\u0012\u001a]\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00170\b2.\b\u0002\u0010\u0018\u001a(\u0012\u0004\u0012\u00020\u001a\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u001b0\u0019¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0002\u0010\u001f\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"DismissThreshold", "Landroidx/compose/ui/unit/Dp;", "F", "SwipeToDismiss", "", "state", "Landroidx/compose/material3/DismissState;", "background", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "dismissContent", "modifier", "Landroidx/compose/ui/Modifier;", "directions", "", "Landroidx/compose/material3/DismissDirection;", "(Landroidx/compose/material3/DismissState;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Ljava/util/Set;Landroidx/compose/runtime/Composer;II)V", "rememberDismissState", "initialValue", "Landroidx/compose/material3/DismissValue;", "confirmValueChange", "", "positionalThreshold", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "", "Lkotlin/ParameterName;", "name", "totalDistance", "(Landroidx/compose/material3/DismissValue;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/DismissState;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: SwipeToDismiss.kt */
public final class SwipeToDismissKt {
    /* access modifiers changed from: private */
    public static final float DismissThreshold = Dp.m5626constructorimpl((float) 125);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.Density, ? super java.lang.Float, java.lang.Float>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: androidx.compose.runtime.saveable.Saver<androidx.compose.material3.DismissState, androidx.compose.material3.DismissValue>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.Density, ? super java.lang.Float, java.lang.Float>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: kotlin.jvm.functions.Function2<androidx.compose.ui.unit.Density, java.lang.Float, java.lang.Float>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.material3.DismissState rememberDismissState(androidx.compose.material3.DismissValue r7, kotlin.jvm.functions.Function1<? super androidx.compose.material3.DismissValue, java.lang.Boolean> r8, kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.Density, ? super java.lang.Float, java.lang.Float> r9, androidx.compose.runtime.Composer r10, int r11, int r12) {
        /*
            r0 = -263967123(0xfffffffff0442e6d, float:-2.4286075E29)
            r10.startReplaceableGroup(r0)
            java.lang.String r1 = "C(rememberDismissState)P(1)212@7855L83,211@7760L178:SwipeToDismiss.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r10, r1)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0011
            androidx.compose.material3.DismissValue r7 = androidx.compose.material3.DismissValue.Default
        L_0x0011:
            r1 = r12 & 2
            if (r1 == 0) goto L_0x0019
            androidx.compose.material3.SwipeToDismissKt$rememberDismissState$1 r8 = androidx.compose.material3.SwipeToDismissKt$rememberDismissState$1.INSTANCE
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
        L_0x0019:
            r12 = r12 & 4
            if (r12 == 0) goto L_0x0023
            androidx.compose.material3.SwipeToDismissDefaults r9 = androidx.compose.material3.SwipeToDismissDefaults.INSTANCE
            kotlin.jvm.functions.Function2 r9 = r9.getFixedPositionalThreshold()
        L_0x0023:
            boolean r12 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r12 == 0) goto L_0x0030
            r12 = -1
            java.lang.String r1 = "androidx.compose.material3.rememberDismissState (SwipeToDismiss.kt:205)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r11, r12, r1)
        L_0x0030:
            r11 = 0
            java.lang.Object[] r0 = new java.lang.Object[r11]
            androidx.compose.material3.DismissState$Companion r11 = androidx.compose.material3.DismissState.Companion
            androidx.compose.runtime.saveable.Saver r1 = r11.Saver(r8, r9)
            r2 = 0
            r11 = 1618982084(0x607fb4c4, float:7.370227E19)
            r10.startReplaceableGroup(r11)
            java.lang.String r11 = "CC(remember)P(1,2,3):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r10, r11)
            boolean r11 = r10.changed((java.lang.Object) r7)
            boolean r12 = r10.changed((java.lang.Object) r8)
            r11 = r11 | r12
            boolean r12 = r10.changed((java.lang.Object) r9)
            r11 = r11 | r12
            java.lang.Object r12 = r10.rememberedValue()
            if (r11 != 0) goto L_0x0061
            androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r11 = r11.getEmpty()
            if (r12 != r11) goto L_0x006c
        L_0x0061:
            androidx.compose.material3.SwipeToDismissKt$rememberDismissState$2$1 r11 = new androidx.compose.material3.SwipeToDismissKt$rememberDismissState$2$1
            r11.<init>(r7, r8, r9)
            r12 = r11
            kotlin.jvm.functions.Function0 r12 = (kotlin.jvm.functions.Function0) r12
            r10.updateRememberedValue(r12)
        L_0x006c:
            r10.endReplaceableGroup()
            r3 = r12
            kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
            r5 = 72
            r6 = 4
            r4 = r10
            java.lang.Object r7 = androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable((java.lang.Object[]) r0, r1, (java.lang.String) r2, r3, (androidx.compose.runtime.Composer) r4, (int) r5, (int) r6)
            androidx.compose.material3.DismissState r7 = (androidx.compose.material3.DismissState) r7
            boolean r8 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r8 == 0) goto L_0x0085
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0085:
            r10.endReplaceableGroup()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SwipeToDismissKt.rememberDismissState(androidx.compose.material3.DismissValue, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):androidx.compose.material3.DismissState");
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0483  */
    /* JADX WARNING: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void SwipeToDismiss(androidx.compose.material3.DismissState r27, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r28, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r29, androidx.compose.ui.Modifier r30, java.util.Set<? extends androidx.compose.material3.DismissDirection> r31, androidx.compose.runtime.Composer r32, int r33, int r34) {
        /*
            r1 = r27
            r2 = r28
            r3 = r29
            r6 = r33
            java.lang.String r0 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "background"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "dismissContent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = -373200705(0xffffffffe9c168bf, float:-2.9227167E25)
            r4 = r32
            androidx.compose.runtime.Composer r4 = r4.startRestartGroup(r0)
            java.lang.String r5 = "C(SwipeToDismiss)P(4!1,2,3)238@8860L7,240@8896L1089:SwipeToDismiss.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r4, r5)
            r5 = r34 & 1
            r7 = 2
            if (r5 == 0) goto L_0x0030
            r5 = r6 | 6
            goto L_0x0040
        L_0x0030:
            r5 = r6 & 14
            if (r5 != 0) goto L_0x003f
            boolean r5 = r4.changed((java.lang.Object) r1)
            if (r5 == 0) goto L_0x003c
            r5 = 4
            goto L_0x003d
        L_0x003c:
            r5 = r7
        L_0x003d:
            r5 = r5 | r6
            goto L_0x0040
        L_0x003f:
            r5 = r6
        L_0x0040:
            r8 = r34 & 2
            r9 = 16
            if (r8 == 0) goto L_0x0049
            r5 = r5 | 48
            goto L_0x0058
        L_0x0049:
            r8 = r6 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x0058
            boolean r8 = r4.changedInstance(r2)
            if (r8 == 0) goto L_0x0056
            r8 = 32
            goto L_0x0057
        L_0x0056:
            r8 = r9
        L_0x0057:
            r5 = r5 | r8
        L_0x0058:
            r8 = r34 & 4
            if (r8 == 0) goto L_0x005f
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x006f
        L_0x005f:
            r8 = r6 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x006f
            boolean r8 = r4.changedInstance(r3)
            if (r8 == 0) goto L_0x006c
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x006e
        L_0x006c:
            r8 = 128(0x80, float:1.794E-43)
        L_0x006e:
            r5 = r5 | r8
        L_0x006f:
            r8 = r34 & 8
            if (r8 == 0) goto L_0x0076
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            goto L_0x0089
        L_0x0076:
            r10 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r10 != 0) goto L_0x0089
            r10 = r30
            boolean r11 = r4.changed((java.lang.Object) r10)
            if (r11 == 0) goto L_0x0085
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0087
        L_0x0085:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0087:
            r5 = r5 | r11
            goto L_0x008b
        L_0x0089:
            r10 = r30
        L_0x008b:
            r11 = r34 & 16
            if (r11 == 0) goto L_0x0091
            r5 = r5 | 8192(0x2000, float:1.14794E-41)
        L_0x0091:
            if (r11 != r9) goto L_0x00aa
            r9 = 46811(0xb6db, float:6.5596E-41)
            r9 = r9 & r5
            r12 = 9362(0x2492, float:1.3119E-41)
            if (r9 != r12) goto L_0x00aa
            boolean r9 = r4.getSkipping()
            if (r9 != 0) goto L_0x00a2
            goto L_0x00aa
        L_0x00a2:
            r4.skipToGroupEnd()
            r19 = r31
            r5 = r3
            goto L_0x047c
        L_0x00aa:
            if (r8 == 0) goto L_0x00b1
            androidx.compose.ui.Modifier$Companion r8 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r8 = (androidx.compose.ui.Modifier) r8
            goto L_0x00b2
        L_0x00b1:
            r8 = r10
        L_0x00b2:
            r9 = 0
            r10 = 1
            if (r11 == 0) goto L_0x00c5
            androidx.compose.material3.DismissDirection[] r11 = new androidx.compose.material3.DismissDirection[r7]
            androidx.compose.material3.DismissDirection r12 = androidx.compose.material3.DismissDirection.EndToStart
            r11[r9] = r12
            androidx.compose.material3.DismissDirection r12 = androidx.compose.material3.DismissDirection.StartToEnd
            r11[r10] = r12
            java.util.Set r11 = kotlin.collections.SetsKt.setOf(r11)
            goto L_0x00c7
        L_0x00c5:
            r11 = r31
        L_0x00c7:
            boolean r12 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r12 == 0) goto L_0x00d4
            r12 = -1
            java.lang.String r13 = "androidx.compose.material3.SwipeToDismiss (SwipeToDismiss.kt:231)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r5, r12, r13)
        L_0x00d4:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            androidx.compose.runtime.CompositionLocal r0 = (androidx.compose.runtime.CompositionLocal) r0
            java.lang.String r12 = "CC:CompositionLocal.kt#9igjgp"
            r15 = 2023513938(0x789c5f52, float:2.5372864E34)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r4, r15, r12)
            java.lang.Object r0 = r4.consume(r0)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r4)
            androidx.compose.ui.unit.LayoutDirection r12 = androidx.compose.ui.unit.LayoutDirection.Rtl
            if (r0 != r12) goto L_0x00f0
            r16 = r10
            goto L_0x00f2
        L_0x00f0:
            r16 = r9
        L_0x00f2:
            androidx.compose.material3.SwipeableV2State r13 = r27.getSwipeableState$material3_release()
            androidx.compose.foundation.gestures.Orientation r14 = androidx.compose.foundation.gestures.Orientation.Horizontal
            androidx.compose.material3.DismissValue r0 = r27.getCurrentValue()
            androidx.compose.material3.DismissValue r12 = androidx.compose.material3.DismissValue.Default
            if (r0 != r12) goto L_0x0102
            r0 = r10
            goto L_0x0103
        L_0x0102:
            r0 = r9
        L_0x0103:
            r17 = 0
            r18 = 16
            r19 = 0
            r12 = r8
            r15 = r0
            androidx.compose.ui.Modifier r20 = androidx.compose.material3.SwipeableV2Kt.swipeableV2$default(r12, r13, r14, r15, r16, r17, r18, r19)
            androidx.compose.material3.SwipeableV2State r21 = r27.getSwipeableState$material3_release()
            r0 = 3
            androidx.compose.material3.DismissValue[] r12 = new androidx.compose.material3.DismissValue[r0]
            androidx.compose.material3.DismissValue r13 = androidx.compose.material3.DismissValue.Default
            r12[r9] = r13
            androidx.compose.material3.DismissValue r13 = androidx.compose.material3.DismissValue.DismissedToEnd
            r12[r10] = r13
            androidx.compose.material3.DismissValue r10 = androidx.compose.material3.DismissValue.DismissedToStart
            r12[r7] = r10
            java.util.Set r22 = kotlin.collections.SetsKt.setOf(r12)
            r23 = 0
            androidx.compose.material3.SwipeToDismissKt$SwipeToDismiss$1 r7 = new androidx.compose.material3.SwipeToDismissKt$SwipeToDismiss$1
            r7.<init>(r11)
            r24 = r7
            kotlin.jvm.functions.Function2 r24 = (kotlin.jvm.functions.Function2) r24
            r25 = 4
            r26 = 0
            androidx.compose.ui.Modifier r7 = androidx.compose.material3.SwipeableV2Kt.swipeAnchors$default(r20, r21, r22, r23, r24, r25, r26)
            r10 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r4.startReplaceableGroup(r10)
            java.lang.String r10 = "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformation(r4, r10)
            androidx.compose.ui.Alignment$Companion r10 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment r10 = r10.getTopStart()
            androidx.compose.ui.layout.MeasurePolicy r10 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(r10, r9, r4, r9)
            r12 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r4.startReplaceableGroup(r12)
            java.lang.String r13 = "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh"
            androidx.compose.runtime.ComposerKt.sourceInformation(r4, r13)
            androidx.compose.runtime.ProvidableCompositionLocal r14 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r14 = (androidx.compose.runtime.CompositionLocal) r14
            java.lang.String r15 = "C:CompositionLocal.kt#9igjgp"
            r0 = 2023513938(0x789c5f52, float:2.5372864E34)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r4, r0, r15)
            java.lang.Object r14 = r4.consume(r14)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r4)
            androidx.compose.ui.unit.Density r14 = (androidx.compose.ui.unit.Density) r14
            androidx.compose.runtime.ProvidableCompositionLocal r16 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            r12 = r16
            androidx.compose.runtime.CompositionLocal r12 = (androidx.compose.runtime.CompositionLocal) r12
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r4, r0, r15)
            java.lang.Object r12 = r4.consume(r12)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r4)
            androidx.compose.ui.unit.LayoutDirection r12 = (androidx.compose.ui.unit.LayoutDirection) r12
            androidx.compose.runtime.ProvidableCompositionLocal r16 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            r9 = r16
            androidx.compose.runtime.CompositionLocal r9 = (androidx.compose.runtime.CompositionLocal) r9
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r4, r0, r15)
            java.lang.Object r9 = r4.consume(r9)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r4)
            androidx.compose.ui.platform.ViewConfiguration r9 = (androidx.compose.ui.platform.ViewConfiguration) r9
            androidx.compose.ui.node.ComposeUiNode$Companion r16 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function0 r0 = r16.getConstructor()
            kotlin.jvm.functions.Function3 r7 = androidx.compose.ui.layout.LayoutKt.materializerOf(r7)
            androidx.compose.runtime.Applier r6 = r4.getApplier()
            boolean r6 = r6 instanceof androidx.compose.runtime.Applier
            if (r6 != 0) goto L_0x01ad
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x01ad:
            r4.startReusableNode()
            boolean r6 = r4.getInserting()
            if (r6 == 0) goto L_0x01ba
            r4.createNode(r0)
            goto L_0x01bd
        L_0x01ba:
            r4.useNode()
        L_0x01bd:
            r4.disableReusing()
            androidx.compose.runtime.Composer r0 = androidx.compose.runtime.Updater.m2444constructorimpl(r4)
            androidx.compose.ui.node.ComposeUiNode$Companion r6 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r6 = r6.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r0, r10, r6)
            androidx.compose.ui.node.ComposeUiNode$Companion r6 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r6 = r6.getSetDensity()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r0, r14, r6)
            androidx.compose.ui.node.ComposeUiNode$Companion r6 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r6 = r6.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r0, r12, r6)
            androidx.compose.ui.node.ComposeUiNode$Companion r6 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r6 = r6.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r0, r9, r6)
            r4.enableReusing()
            androidx.compose.runtime.Composer r0 = androidx.compose.runtime.SkippableUpdater.m2436constructorimpl(r4)
            androidx.compose.runtime.SkippableUpdater r0 = androidx.compose.runtime.SkippableUpdater.m2435boximpl(r0)
            r6 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7.invoke(r0, r4, r6)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r4.startReplaceableGroup(r0)
            r6 = -1253629305(0xffffffffb5472287, float:-7.418352E-7)
            java.lang.String r7 = "C72@3384L9:Box.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r4, r6, r7)
            androidx.compose.foundation.layout.BoxScopeInstance r6 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE
            androidx.compose.foundation.layout.BoxScope r6 = (androidx.compose.foundation.layout.BoxScope) r6
            r7 = 1356535017(0x50db14e9, float:2.94046454E10)
            java.lang.String r9 = "C260@9696L110,266@9909L52,264@9819L156:SwipeToDismiss.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r4, r7, r9)
            androidx.compose.ui.Modifier$Companion r7 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r7 = (androidx.compose.ui.Modifier) r7
            androidx.compose.ui.Modifier r6 = r6.matchParentSize(r7)
            int r7 = r5 << 6
            r7 = r7 & 7168(0x1c00, float:1.0045E-41)
            r9 = 693286680(0x2952b718, float:4.6788176E-14)
            r4.startReplaceableGroup(r9)
            java.lang.String r10 = "CC(Row)P(2,1,3)78@3913L58,79@3976L130:Row.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformation(r4, r10)
            androidx.compose.foundation.layout.Arrangement r12 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            androidx.compose.foundation.layout.Arrangement$Horizontal r12 = r12.getStart()
            androidx.compose.ui.Alignment$Companion r14 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment$Vertical r14 = r14.getTop()
            int r16 = r7 >> 3
            r17 = r16 & 14
            r16 = r16 & 112(0x70, float:1.57E-43)
            r9 = r17 | r16
            androidx.compose.ui.layout.MeasurePolicy r9 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(r12, r14, r4, r9)
            int r12 = r7 << 3
            r12 = r12 & 112(0x70, float:1.57E-43)
            r14 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r4.startReplaceableGroup(r14)
            androidx.compose.runtime.ComposerKt.sourceInformation(r4, r13)
            androidx.compose.runtime.ProvidableCompositionLocal r14 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r14 = (androidx.compose.runtime.CompositionLocal) r14
            r0 = 2023513938(0x789c5f52, float:2.5372864E34)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r4, r0, r15)
            java.lang.Object r14 = r4.consume(r14)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r4)
            androidx.compose.ui.unit.Density r14 = (androidx.compose.ui.unit.Density) r14
            androidx.compose.runtime.ProvidableCompositionLocal r17 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            r18 = r8
            r8 = r17
            androidx.compose.runtime.CompositionLocal r8 = (androidx.compose.runtime.CompositionLocal) r8
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r4, r0, r15)
            java.lang.Object r8 = r4.consume(r8)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r4)
            androidx.compose.ui.unit.LayoutDirection r8 = (androidx.compose.ui.unit.LayoutDirection) r8
            androidx.compose.runtime.ProvidableCompositionLocal r17 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            r19 = r11
            r11 = r17
            androidx.compose.runtime.CompositionLocal r11 = (androidx.compose.runtime.CompositionLocal) r11
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r4, r0, r15)
            java.lang.Object r0 = r4.consume(r11)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r4)
            androidx.compose.ui.platform.ViewConfiguration r0 = (androidx.compose.ui.platform.ViewConfiguration) r0
            androidx.compose.ui.node.ComposeUiNode$Companion r11 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function0 r11 = r11.getConstructor()
            kotlin.jvm.functions.Function3 r6 = androidx.compose.ui.layout.LayoutKt.materializerOf(r6)
            int r12 = r12 << 9
            r12 = r12 & 7168(0x1c00, float:1.0045E-41)
            r12 = r12 | 6
            androidx.compose.runtime.Applier r3 = r4.getApplier()
            boolean r3 = r3 instanceof androidx.compose.runtime.Applier
            if (r3 != 0) goto L_0x02ad
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x02ad:
            r4.startReusableNode()
            boolean r3 = r4.getInserting()
            if (r3 == 0) goto L_0x02ba
            r4.createNode(r11)
            goto L_0x02bd
        L_0x02ba:
            r4.useNode()
        L_0x02bd:
            r4.disableReusing()
            androidx.compose.runtime.Composer r3 = androidx.compose.runtime.Updater.m2444constructorimpl(r4)
            androidx.compose.ui.node.ComposeUiNode$Companion r11 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r11 = r11.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r3, r9, r11)
            androidx.compose.ui.node.ComposeUiNode$Companion r9 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r9 = r9.getSetDensity()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r3, r14, r9)
            androidx.compose.ui.node.ComposeUiNode$Companion r9 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r9 = r9.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r3, r8, r9)
            androidx.compose.ui.node.ComposeUiNode$Companion r8 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r8 = r8.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r3, r0, r8)
            r4.enableReusing()
            androidx.compose.runtime.Composer r0 = androidx.compose.runtime.SkippableUpdater.m2436constructorimpl(r4)
            androidx.compose.runtime.SkippableUpdater r0 = androidx.compose.runtime.SkippableUpdater.m2435boximpl(r0)
            r3 = 3
            int r8 = r12 >> 3
            r3 = r8 & 112(0x70, float:1.57E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6.invoke(r0, r4, r3)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r4.startReplaceableGroup(r0)
            r0 = -326682283(0xffffffffec873955, float:-1.3078058E27)
            java.lang.String r3 = "C80@4021L9:Row.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r4, r0, r3)
            androidx.compose.foundation.layout.RowScopeInstance r6 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE
            int r7 = r7 >> 6
            r7 = r7 & 112(0x70, float:1.57E-43)
            r7 = r7 | 6
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r2.invoke(r6, r4, r7)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r4)
            r4.endReplaceableGroup()
            r4.endNode()
            r4.endReplaceableGroup()
            r4.endReplaceableGroup()
            androidx.compose.ui.Modifier$Companion r6 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r6 = (androidx.compose.ui.Modifier) r6
            r7 = 1157296644(0x44faf204, float:2007.563)
            r4.startReplaceableGroup(r7)
            java.lang.String r7 = "CC(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r4, r7)
            boolean r7 = r4.changed((java.lang.Object) r1)
            java.lang.Object r8 = r4.rememberedValue()
            if (r7 != 0) goto L_0x034c
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r7 = r7.getEmpty()
            if (r8 != r7) goto L_0x0357
        L_0x034c:
            androidx.compose.material3.SwipeToDismissKt$SwipeToDismiss$2$1$1 r7 = new androidx.compose.material3.SwipeToDismissKt$SwipeToDismiss$2$1$1
            r7.<init>(r1)
            r8 = r7
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            r4.updateRememberedValue(r8)
        L_0x0357:
            r4.endReplaceableGroup()
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            androidx.compose.ui.Modifier r6 = androidx.compose.foundation.layout.OffsetKt.offset(r6, r8)
            r7 = 3
            int r5 = r5 << r7
            r5 = r5 & 7168(0x1c00, float:1.0045E-41)
            r7 = 693286680(0x2952b718, float:4.6788176E-14)
            r4.startReplaceableGroup(r7)
            androidx.compose.runtime.ComposerKt.sourceInformation(r4, r10)
            androidx.compose.foundation.layout.Arrangement r7 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            androidx.compose.foundation.layout.Arrangement$Horizontal r7 = r7.getStart()
            androidx.compose.ui.Alignment$Companion r8 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment$Vertical r8 = r8.getTop()
            int r9 = r5 >> 3
            r10 = r9 & 14
            r9 = r9 & 112(0x70, float:1.57E-43)
            r9 = r9 | r10
            androidx.compose.ui.layout.MeasurePolicy r7 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(r7, r8, r4, r9)
            int r8 = r5 << 3
            r8 = r8 & 112(0x70, float:1.57E-43)
            r9 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r4.startReplaceableGroup(r9)
            androidx.compose.runtime.ComposerKt.sourceInformation(r4, r13)
            androidx.compose.runtime.ProvidableCompositionLocal r9 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r9 = (androidx.compose.runtime.CompositionLocal) r9
            r10 = 2023513938(0x789c5f52, float:2.5372864E34)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r4, r10, r15)
            java.lang.Object r9 = r4.consume(r9)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r4)
            androidx.compose.ui.unit.Density r9 = (androidx.compose.ui.unit.Density) r9
            androidx.compose.runtime.ProvidableCompositionLocal r11 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            androidx.compose.runtime.CompositionLocal r11 = (androidx.compose.runtime.CompositionLocal) r11
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r4, r10, r15)
            java.lang.Object r11 = r4.consume(r11)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r4)
            androidx.compose.ui.unit.LayoutDirection r11 = (androidx.compose.ui.unit.LayoutDirection) r11
            androidx.compose.runtime.ProvidableCompositionLocal r12 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            androidx.compose.runtime.CompositionLocal r12 = (androidx.compose.runtime.CompositionLocal) r12
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r4, r10, r15)
            java.lang.Object r10 = r4.consume(r12)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r4)
            androidx.compose.ui.platform.ViewConfiguration r10 = (androidx.compose.ui.platform.ViewConfiguration) r10
            androidx.compose.ui.node.ComposeUiNode$Companion r12 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function0 r12 = r12.getConstructor()
            kotlin.jvm.functions.Function3 r6 = androidx.compose.ui.layout.LayoutKt.materializerOf(r6)
            int r8 = r8 << 9
            r8 = r8 & 7168(0x1c00, float:1.0045E-41)
            r8 = r8 | 6
            androidx.compose.runtime.Applier r13 = r4.getApplier()
            boolean r13 = r13 instanceof androidx.compose.runtime.Applier
            if (r13 != 0) goto L_0x03e5
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x03e5:
            r4.startReusableNode()
            boolean r13 = r4.getInserting()
            if (r13 == 0) goto L_0x03f2
            r4.createNode(r12)
            goto L_0x03f5
        L_0x03f2:
            r4.useNode()
        L_0x03f5:
            r4.disableReusing()
            androidx.compose.runtime.Composer r12 = androidx.compose.runtime.Updater.m2444constructorimpl(r4)
            androidx.compose.ui.node.ComposeUiNode$Companion r13 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r13 = r13.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r12, r7, r13)
            androidx.compose.ui.node.ComposeUiNode$Companion r7 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r7 = r7.getSetDensity()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r12, r9, r7)
            androidx.compose.ui.node.ComposeUiNode$Companion r7 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r7 = r7.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r12, r11, r7)
            androidx.compose.ui.node.ComposeUiNode$Companion r7 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r7 = r7.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r12, r10, r7)
            r4.enableReusing()
            androidx.compose.runtime.Composer r7 = androidx.compose.runtime.SkippableUpdater.m2436constructorimpl(r4)
            androidx.compose.runtime.SkippableUpdater r7 = androidx.compose.runtime.SkippableUpdater.m2435boximpl(r7)
            r9 = 3
            int r8 = r8 >> r9
            r8 = r8 & 112(0x70, float:1.57E-43)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r6.invoke(r7, r4, r8)
            r6 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r4.startReplaceableGroup(r6)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r4, r0, r3)
            androidx.compose.foundation.layout.RowScopeInstance r0 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE
            int r3 = r5 >> 6
            r3 = r3 & 112(0x70, float:1.57E-43)
            r3 = r3 | 6
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = r29
            r5.invoke(r0, r4, r3)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r4)
            r4.endReplaceableGroup()
            r4.endNode()
            r4.endReplaceableGroup()
            r4.endReplaceableGroup()
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r4)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r4)
            r4.endReplaceableGroup()
            r4.endNode()
            r4.endReplaceableGroup()
            r4.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x047a
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x047a:
            r10 = r18
        L_0x047c:
            androidx.compose.runtime.ScopeUpdateScope r8 = r4.endRestartGroup()
            if (r8 != 0) goto L_0x0483
            goto L_0x049b
        L_0x0483:
            androidx.compose.material3.SwipeToDismissKt$SwipeToDismiss$3 r9 = new androidx.compose.material3.SwipeToDismissKt$SwipeToDismiss$3
            r0 = r9
            r1 = r27
            r2 = r28
            r3 = r29
            r4 = r10
            r5 = r19
            r6 = r33
            r7 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
            r8.updateScope(r9)
        L_0x049b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SwipeToDismissKt.SwipeToDismiss(androidx.compose.material3.DismissState, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function3, androidx.compose.ui.Modifier, java.util.Set, androidx.compose.runtime.Composer, int, int):void");
    }
}
