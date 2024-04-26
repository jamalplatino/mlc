package androidx.compose.material3;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001JK\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0017¢\u0006\u0002\u0010\u000fJ\u0016\u0010\u0010\u001a\u00020\t*\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u0005H&J\f\u0010\u0012\u001a\u00020\t*\u00020\tH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Landroidx/compose/material3/ExposedDropdownMenuBoxScope;", "", "ExposedDropdownMenu", "", "expanded", "", "onDismissRequest", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "exposedDropdownSize", "matchTextFieldWidth", "menuAnchor", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: ExposedDropdownMenu.kt */
public interface ExposedDropdownMenuBoxScope {
    Modifier exposedDropdownSize(Modifier modifier, boolean z);

    Modifier menuAnchor(Modifier modifier);

    static /* synthetic */ Modifier exposedDropdownSize$default(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, Modifier modifier, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = true;
            }
            return exposedDropdownMenuBoxScope.exposedDropdownSize(modifier, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: exposedDropdownSize");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: kotlin.jvm.functions.Function2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void ExposedDropdownMenu(boolean r24, kotlin.jvm.functions.Function0<kotlin.Unit> r25, androidx.compose.ui.Modifier r26, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r27, androidx.compose.runtime.Composer r28, int r29, int r30) {
        /*
            r23 = this;
            r6 = r25
            r14 = r27
            r15 = r29
            java.lang.String r0 = "onDismissRequest"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            r0 = -1658683708(0xffffffff9d227ec4, float:-2.1506058E-21)
            r1 = r28
            androidx.compose.runtime.Composer r5 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(ExposedDropdownMenu)P(1,3,2)259@10868L42,263@11070L51,264@11161L7,268@11308L139,272@11461L444:ExposedDropdownMenu.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r5, r1)
            r1 = r30 & 1
            r2 = 2
            if (r1 == 0) goto L_0x002a
            r1 = r15 | 6
            r4 = r24
            goto L_0x003c
        L_0x002a:
            r1 = r15 & 14
            r4 = r24
            if (r1 != 0) goto L_0x003b
            boolean r1 = r5.changed((boolean) r4)
            if (r1 == 0) goto L_0x0038
            r1 = 4
            goto L_0x0039
        L_0x0038:
            r1 = r2
        L_0x0039:
            r1 = r1 | r15
            goto L_0x003c
        L_0x003b:
            r1 = r15
        L_0x003c:
            r3 = r30 & 2
            if (r3 == 0) goto L_0x0043
            r1 = r1 | 48
            goto L_0x0053
        L_0x0043:
            r3 = r15 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0053
            boolean r3 = r5.changedInstance(r6)
            if (r3 == 0) goto L_0x0050
            r3 = 32
            goto L_0x0052
        L_0x0050:
            r3 = 16
        L_0x0052:
            r1 = r1 | r3
        L_0x0053:
            r3 = r30 & 4
            if (r3 == 0) goto L_0x005a
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x006d
        L_0x005a:
            r7 = r15 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x006d
            r7 = r26
            boolean r8 = r5.changed((java.lang.Object) r7)
            if (r8 == 0) goto L_0x0069
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x006b
        L_0x0069:
            r8 = 128(0x80, float:1.794E-43)
        L_0x006b:
            r1 = r1 | r8
            goto L_0x006f
        L_0x006d:
            r7 = r26
        L_0x006f:
            r8 = r30 & 8
            if (r8 == 0) goto L_0x0076
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0086
        L_0x0076:
            r8 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0086
            boolean r8 = r5.changedInstance(r14)
            if (r8 == 0) goto L_0x0083
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0085
        L_0x0083:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0085:
            r1 = r1 | r8
        L_0x0086:
            r8 = r30 & 16
            if (r8 == 0) goto L_0x008f
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            r13 = r23
            goto L_0x00a3
        L_0x008f:
            r8 = 57344(0xe000, float:8.0356E-41)
            r8 = r8 & r15
            r13 = r23
            if (r8 != 0) goto L_0x00a3
            boolean r8 = r5.changed((java.lang.Object) r13)
            if (r8 == 0) goto L_0x00a0
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a2
        L_0x00a0:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x00a2:
            r1 = r1 | r8
        L_0x00a3:
            r8 = 46811(0xb6db, float:6.5596E-41)
            r8 = r8 & r1
            r9 = 9362(0x2492, float:1.3119E-41)
            if (r8 != r9) goto L_0x00b9
            boolean r8 = r5.getSkipping()
            if (r8 != 0) goto L_0x00b2
            goto L_0x00b9
        L_0x00b2:
            r5.skipToGroupEnd()
            r4 = r7
            r7 = r5
            goto L_0x01d7
        L_0x00b9:
            if (r3 == 0) goto L_0x00c2
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r3 = (androidx.compose.ui.Modifier) r3
            r16 = r3
            goto L_0x00c4
        L_0x00c2:
            r16 = r7
        L_0x00c4:
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L_0x00d1
            r3 = -1
            java.lang.String r7 = "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:244)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r1, r3, r7)
        L_0x00d1:
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r5.startReplaceableGroup(r0)
            java.lang.String r3 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r5, r3)
            java.lang.Object r7 = r5.rememberedValue()
            androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r8 = r8.getEmpty()
            if (r7 != r8) goto L_0x00f5
            androidx.compose.animation.core.MutableTransitionState r7 = new androidx.compose.animation.core.MutableTransitionState
            r8 = 0
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r7.<init>(r8)
            r5.updateRememberedValue(r7)
        L_0x00f5:
            r5.endReplaceableGroup()
            r8 = r7
            androidx.compose.animation.core.MutableTransitionState r8 = (androidx.compose.animation.core.MutableTransitionState) r8
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r24)
            r8.setTargetState(r7)
            java.lang.Object r7 = r8.getCurrentState()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L_0x011e
            java.lang.Object r7 = r8.getTargetState()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x011b
            goto L_0x011e
        L_0x011b:
            r7 = r5
            goto L_0x01cc
        L_0x011e:
            r5.startReplaceableGroup(r0)
            androidx.compose.runtime.ComposerKt.sourceInformation(r5, r3)
            java.lang.Object r0 = r5.rememberedValue()
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r3 = r3.getEmpty()
            if (r0 != r3) goto L_0x0142
            androidx.compose.ui.graphics.TransformOrigin$Companion r0 = androidx.compose.ui.graphics.TransformOrigin.Companion
            long r9 = r0.m3243getCenterSzJe1aQ()
            androidx.compose.ui.graphics.TransformOrigin r0 = androidx.compose.ui.graphics.TransformOrigin.m3230boximpl(r9)
            r3 = 0
            androidx.compose.runtime.MutableState r0 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r0, r3, r2, r3)
            r5.updateRememberedValue(r0)
        L_0x0142:
            r5.endReplaceableGroup()
            r9 = r0
            androidx.compose.runtime.MutableState r9 = (androidx.compose.runtime.MutableState) r9
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r0 = (androidx.compose.runtime.CompositionLocal) r0
            r2 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r3 = "CC:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r5, r2, r3)
            java.lang.Object r0 = r5.consume(r0)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r5)
            r20 = r0
            androidx.compose.ui.unit.Density r20 = (androidx.compose.ui.unit.Density) r20
            androidx.compose.ui.unit.DpOffset$Companion r0 = androidx.compose.ui.unit.DpOffset.Companion
            long r18 = r0.m5697getZeroRKDOV3M()
            r0 = 1157296644(0x44faf204, float:2007.563)
            r5.startReplaceableGroup(r0)
            java.lang.String r0 = "CC(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r5, r0)
            boolean r0 = r5.changed((java.lang.Object) r9)
            java.lang.Object r2 = r5.rememberedValue()
            if (r0 != 0) goto L_0x0184
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r0 = r0.getEmpty()
            if (r2 != r0) goto L_0x018f
        L_0x0184:
            androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1 r0 = new androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
            r0.<init>(r9)
            r2 = r0
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            r5.updateRememberedValue(r2)
        L_0x018f:
            r5.endReplaceableGroup()
            r21 = r2
            kotlin.jvm.functions.Function2 r21 = (kotlin.jvm.functions.Function2) r21
            r22 = 0
            androidx.compose.material3.DropdownMenuPositionProvider r0 = new androidx.compose.material3.DropdownMenuPositionProvider
            r17 = r0
            r17.<init>(r18, r20, r21, r22)
            r2 = r0
            androidx.compose.ui.window.PopupPositionProvider r2 = (androidx.compose.ui.window.PopupPositionProvider) r2
            androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1 r0 = new androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1
            r7 = r0
            r10 = r23
            r11 = r16
            r12 = r27
            r13 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r3 = 395026654(0x178ba0de, float:9.023273E-25)
            r7 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r5, r3, r7, r0)
            r3 = r0
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
            int r0 = r1 >> 3
            r0 = r0 & 14
            r7 = r0 | 384(0x180, float:5.38E-43)
            r8 = 0
            r0 = r25
            r1 = r2
            r2 = r3
            r3 = r5
            r4 = r7
            r7 = r5
            r5 = r8
            androidx.compose.material3.internal.ExposedDropdownMenuPopupKt.ExposedDropdownMenuPopup(r0, r1, r2, r3, r4, r5)
        L_0x01cc:
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01d5
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x01d5:
            r4 = r16
        L_0x01d7:
            androidx.compose.runtime.ScopeUpdateScope r8 = r7.endRestartGroup()
            if (r8 != 0) goto L_0x01de
            goto L_0x01f5
        L_0x01de:
            androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2 r9 = new androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
            r0 = r9
            r1 = r23
            r2 = r24
            r3 = r25
            r5 = r27
            r6 = r29
            r7 = r30
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
            r8.updateScope(r9)
        L_0x01f5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu(boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }
}
