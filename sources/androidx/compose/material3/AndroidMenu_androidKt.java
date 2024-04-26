package androidx.compose.material3;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ag\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0001\u0010\u0013\u001a\u00020\u00012\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\u0002\b\u000f2\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\u0002\b\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001eH\u0007¢\u0006\u0002\u0010\u001f\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006 "}, d2 = {"DropdownMenu", "", "expanded", "", "onDismissRequest", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "offset", "Landroidx/compose/ui/unit/DpOffset;", "properties", "Landroidx/compose/ui/window/PopupProperties;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "DropdownMenu-ILWXrKs", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DropdownMenuItem", "text", "onClick", "leadingIcon", "trailingIcon", "enabled", "colors", "Landroidx/compose/material3/MenuItemColors;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/MenuItemColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: AndroidMenu.android.kt */
public final class AndroidMenu_androidKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: kotlin.jvm.functions.Function2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d9  */
    /* renamed from: DropdownMenu-ILWXrKs  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1118DropdownMenuILWXrKs(boolean r26, kotlin.jvm.functions.Function0<kotlin.Unit> r27, androidx.compose.ui.Modifier r28, long r29, androidx.compose.ui.window.PopupProperties r31, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r32, androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            r7 = r27
            r8 = r32
            r9 = r34
            java.lang.String r0 = "onDismissRequest"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 354826666(0x152639aa, float:3.3568922E-26)
            r1 = r33
            androidx.compose.runtime.Composer r10 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(DropdownMenu)P(1,4,2,3:c#ui.unit.DpOffset,5)81@4015L42,85@4205L51,86@4292L7,90@4416L131,94@4557L400:AndroidMenu.android.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r10, r1)
            r1 = r35 & 1
            if (r1 == 0) goto L_0x0029
            r1 = r9 | 6
            r11 = r26
            goto L_0x003b
        L_0x0029:
            r1 = r9 & 14
            r11 = r26
            if (r1 != 0) goto L_0x003a
            boolean r1 = r10.changed((boolean) r11)
            if (r1 == 0) goto L_0x0037
            r1 = 4
            goto L_0x0038
        L_0x0037:
            r1 = 2
        L_0x0038:
            r1 = r1 | r9
            goto L_0x003b
        L_0x003a:
            r1 = r9
        L_0x003b:
            r3 = r35 & 2
            if (r3 == 0) goto L_0x0042
            r1 = r1 | 48
            goto L_0x0052
        L_0x0042:
            r3 = r9 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0052
            boolean r3 = r10.changedInstance(r7)
            if (r3 == 0) goto L_0x004f
            r3 = 32
            goto L_0x0051
        L_0x004f:
            r3 = 16
        L_0x0051:
            r1 = r1 | r3
        L_0x0052:
            r3 = r35 & 4
            if (r3 == 0) goto L_0x0059
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x006c
        L_0x0059:
            r4 = r9 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x006c
            r4 = r28
            boolean r5 = r10.changed((java.lang.Object) r4)
            if (r5 == 0) goto L_0x0068
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x006a
        L_0x0068:
            r5 = 128(0x80, float:1.794E-43)
        L_0x006a:
            r1 = r1 | r5
            goto L_0x006e
        L_0x006c:
            r4 = r28
        L_0x006e:
            r5 = r35 & 8
            if (r5 == 0) goto L_0x0077
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            r12 = r29
            goto L_0x0089
        L_0x0077:
            r6 = r9 & 7168(0x1c00, float:1.0045E-41)
            r12 = r29
            if (r6 != 0) goto L_0x0089
            boolean r6 = r10.changed((long) r12)
            if (r6 == 0) goto L_0x0086
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x0088
        L_0x0086:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x0088:
            r1 = r1 | r6
        L_0x0089:
            r6 = r35 & 16
            if (r6 == 0) goto L_0x0090
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a5
        L_0x0090:
            r14 = 57344(0xe000, float:8.0356E-41)
            r14 = r14 & r9
            if (r14 != 0) goto L_0x00a5
            r14 = r31
            boolean r15 = r10.changed((java.lang.Object) r14)
            if (r15 == 0) goto L_0x00a1
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a3
        L_0x00a1:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x00a3:
            r1 = r1 | r15
            goto L_0x00a7
        L_0x00a5:
            r14 = r31
        L_0x00a7:
            r15 = r35 & 32
            if (r15 == 0) goto L_0x00af
            r15 = 196608(0x30000, float:2.75506E-40)
        L_0x00ad:
            r1 = r1 | r15
            goto L_0x00c0
        L_0x00af:
            r15 = 458752(0x70000, float:6.42848E-40)
            r15 = r15 & r9
            if (r15 != 0) goto L_0x00c0
            boolean r15 = r10.changedInstance(r8)
            if (r15 == 0) goto L_0x00bd
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ad
        L_0x00bd:
            r15 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00ad
        L_0x00c0:
            r15 = r1
            r1 = 374491(0x5b6db, float:5.24774E-40)
            r1 = r1 & r15
            r2 = 74898(0x12492, float:1.04954E-40)
            if (r1 != r2) goto L_0x00d9
            boolean r1 = r10.getSkipping()
            if (r1 != 0) goto L_0x00d1
            goto L_0x00d9
        L_0x00d1:
            r10.skipToGroupEnd()
            r3 = r4
            r4 = r12
            r6 = r14
            goto L_0x021d
        L_0x00d9:
            if (r3 == 0) goto L_0x00e2
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
            r16 = r1
            goto L_0x00e4
        L_0x00e2:
            r16 = r4
        L_0x00e4:
            r1 = 0
            if (r5 == 0) goto L_0x00f5
            float r2 = (float) r1
            float r3 = androidx.compose.ui.unit.Dp.m5626constructorimpl(r2)
            float r2 = androidx.compose.ui.unit.Dp.m5626constructorimpl(r2)
            long r2 = androidx.compose.ui.unit.DpKt.m5647DpOffsetYgX7TsA(r3, r2)
            r12 = r2
        L_0x00f5:
            if (r6 == 0) goto L_0x010f
            androidx.compose.ui.window.PopupProperties r2 = new androidx.compose.ui.window.PopupProperties
            r18 = 1
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 62
            r25 = 0
            r17 = r2
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)
            r14 = r2
        L_0x010f:
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x011c
            r2 = -1
            java.lang.String r3 = "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:73)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r15, r2, r3)
        L_0x011c:
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r10.startReplaceableGroup(r0)
            java.lang.String r2 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r10, r2)
            java.lang.Object r3 = r10.rememberedValue()
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r4 = r4.getEmpty()
            if (r3 != r4) goto L_0x013f
            androidx.compose.animation.core.MutableTransitionState r3 = new androidx.compose.animation.core.MutableTransitionState
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r3.<init>(r1)
            r10.updateRememberedValue(r3)
        L_0x013f:
            r10.endReplaceableGroup()
            r1 = r3
            androidx.compose.animation.core.MutableTransitionState r1 = (androidx.compose.animation.core.MutableTransitionState) r1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r26)
            r1.setTargetState(r3)
            java.lang.Object r3 = r1.getCurrentState()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L_0x0164
            java.lang.Object r3 = r1.getTargetState()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0210
        L_0x0164:
            r10.startReplaceableGroup(r0)
            androidx.compose.runtime.ComposerKt.sourceInformation(r10, r2)
            java.lang.Object r0 = r10.rememberedValue()
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r0 != r2) goto L_0x0189
            androidx.compose.ui.graphics.TransformOrigin$Companion r0 = androidx.compose.ui.graphics.TransformOrigin.Companion
            long r2 = r0.m3243getCenterSzJe1aQ()
            androidx.compose.ui.graphics.TransformOrigin r0 = androidx.compose.ui.graphics.TransformOrigin.m3230boximpl(r2)
            r2 = 0
            r3 = 2
            androidx.compose.runtime.MutableState r0 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r0, r2, r3, r2)
            r10.updateRememberedValue(r0)
        L_0x0189:
            r10.endReplaceableGroup()
            r2 = r0
            androidx.compose.runtime.MutableState r2 = (androidx.compose.runtime.MutableState) r2
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r0 = (androidx.compose.runtime.CompositionLocal) r0
            r3 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r4 = "CC:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r10, r3, r4)
            java.lang.Object r0 = r10.consume(r0)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r10)
            r20 = r0
            androidx.compose.ui.unit.Density r20 = (androidx.compose.ui.unit.Density) r20
            r0 = 1157296644(0x44faf204, float:2007.563)
            r10.startReplaceableGroup(r0)
            java.lang.String r0 = "CC(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r10, r0)
            boolean r0 = r10.changed((java.lang.Object) r2)
            java.lang.Object r3 = r10.rememberedValue()
            if (r0 != 0) goto L_0x01c5
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r0 = r0.getEmpty()
            if (r3 != r0) goto L_0x01d0
        L_0x01c5:
            androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1 r0 = new androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
            r0.<init>(r2)
            r3 = r0
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
            r10.updateRememberedValue(r3)
        L_0x01d0:
            r10.endReplaceableGroup()
            r21 = r3
            kotlin.jvm.functions.Function2 r21 = (kotlin.jvm.functions.Function2) r21
            r22 = 0
            androidx.compose.material3.DropdownMenuPositionProvider r0 = new androidx.compose.material3.DropdownMenuPositionProvider
            r17 = r0
            r18 = r12
            r17.<init>(r18, r20, r21, r22)
            r6 = r0
            androidx.compose.ui.window.PopupPositionProvider r6 = (androidx.compose.ui.window.PopupPositionProvider) r6
            androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1 r5 = new androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
            r0 = r5
            r3 = r16
            r4 = r32
            r7 = r5
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = -1192563503(0xffffffffb8eaecd1, float:-1.12021E-4)
            r1 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r10, r0, r1, r7)
            r3 = r0
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
            r0 = r15 & 112(0x70, float:1.57E-43)
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            int r1 = r15 >> 6
            r1 = r1 & 896(0x380, float:1.256E-42)
            r5 = r0 | r1
            r7 = 0
            r0 = r6
            r1 = r27
            r2 = r14
            r4 = r10
            r6 = r7
            androidx.compose.ui.window.AndroidPopup_androidKt.Popup(r0, r1, r2, r3, r4, r5, r6)
        L_0x0210:
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0219
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0219:
            r4 = r12
            r6 = r14
            r3 = r16
        L_0x021d:
            androidx.compose.runtime.ScopeUpdateScope r10 = r10.endRestartGroup()
            if (r10 != 0) goto L_0x0224
            goto L_0x0239
        L_0x0224:
            androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$2 r12 = new androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$2
            r0 = r12
            r1 = r26
            r2 = r27
            r7 = r32
            r8 = r34
            r9 = r35
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9)
            kotlin.jvm.functions.Function2 r12 = (kotlin.jvm.functions.Function2) r12
            r10.updateScope(r12)
        L_0x0239:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AndroidMenu_androidKt.m1118DropdownMenuILWXrKs(boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, long, androidx.compose.ui.window.PopupProperties, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0134  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void DropdownMenuItem(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r35, kotlin.jvm.functions.Function0<kotlin.Unit> r36, androidx.compose.ui.Modifier r37, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r38, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r39, boolean r40, androidx.compose.material3.MenuItemColors r41, androidx.compose.foundation.layout.PaddingValues r42, androidx.compose.foundation.interaction.MutableInteractionSource r43, androidx.compose.runtime.Composer r44, int r45, int r46) {
        /*
            r11 = r35
            r12 = r36
            r13 = r45
            r14 = r46
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = 1826340448(0x6cdbbe60, float:2.1252302E27)
            r1 = r44
            androidx.compose.runtime.Composer r10 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(DropdownMenuItem)P(7,6,5,4,8,2)144@6904L12,146@7049L39,148@7098L319:AndroidMenu.android.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r10, r1)
            r1 = r14 & 1
            if (r1 == 0) goto L_0x0029
            r1 = r13 | 6
            goto L_0x0039
        L_0x0029:
            r1 = r13 & 14
            if (r1 != 0) goto L_0x0038
            boolean r1 = r10.changedInstance(r11)
            if (r1 == 0) goto L_0x0035
            r1 = 4
            goto L_0x0036
        L_0x0035:
            r1 = 2
        L_0x0036:
            r1 = r1 | r13
            goto L_0x0039
        L_0x0038:
            r1 = r13
        L_0x0039:
            r2 = r14 & 2
            if (r2 == 0) goto L_0x0040
            r1 = r1 | 48
            goto L_0x0050
        L_0x0040:
            r2 = r13 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0050
            boolean r2 = r10.changedInstance(r12)
            if (r2 == 0) goto L_0x004d
            r2 = 32
            goto L_0x004f
        L_0x004d:
            r2 = 16
        L_0x004f:
            r1 = r1 | r2
        L_0x0050:
            r2 = r14 & 4
            if (r2 == 0) goto L_0x0057
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x006a
        L_0x0057:
            r3 = r13 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x006a
            r3 = r37
            boolean r4 = r10.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x0066
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0068
        L_0x0066:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0068:
            r1 = r1 | r4
            goto L_0x006c
        L_0x006a:
            r3 = r37
        L_0x006c:
            r4 = r14 & 8
            if (r4 == 0) goto L_0x0073
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0086
        L_0x0073:
            r5 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x0086
            r5 = r38
            boolean r6 = r10.changedInstance(r5)
            if (r6 == 0) goto L_0x0082
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x0084
        L_0x0082:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x0084:
            r1 = r1 | r6
            goto L_0x0088
        L_0x0086:
            r5 = r38
        L_0x0088:
            r6 = r14 & 16
            r7 = 57344(0xe000, float:8.0356E-41)
            if (r6 == 0) goto L_0x0092
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a5
        L_0x0092:
            r8 = r13 & r7
            if (r8 != 0) goto L_0x00a5
            r8 = r39
            boolean r9 = r10.changedInstance(r8)
            if (r9 == 0) goto L_0x00a1
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a3
        L_0x00a1:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x00a3:
            r1 = r1 | r9
            goto L_0x00a7
        L_0x00a5:
            r8 = r39
        L_0x00a7:
            r9 = r14 & 32
            r31 = 458752(0x70000, float:6.42848E-40)
            if (r9 == 0) goto L_0x00b1
            r15 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r15
            goto L_0x00c5
        L_0x00b1:
            r15 = r13 & r31
            if (r15 != 0) goto L_0x00c5
            r15 = r40
            boolean r16 = r10.changed((boolean) r15)
            if (r16 == 0) goto L_0x00c0
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c2
        L_0x00c0:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00c2:
            r1 = r1 | r16
            goto L_0x00c7
        L_0x00c5:
            r15 = r40
        L_0x00c7:
            r32 = 3670016(0x380000, float:5.142788E-39)
            r16 = r13 & r32
            if (r16 != 0) goto L_0x00e1
            r16 = r14 & 64
            r7 = r41
            if (r16 != 0) goto L_0x00dc
            boolean r16 = r10.changed((java.lang.Object) r7)
            if (r16 == 0) goto L_0x00dc
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00de
        L_0x00dc:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00de:
            r1 = r1 | r16
            goto L_0x00e3
        L_0x00e1:
            r7 = r41
        L_0x00e3:
            r0 = r14 & 128(0x80, float:1.794E-43)
            r33 = 29360128(0x1c00000, float:7.052966E-38)
            if (r0 == 0) goto L_0x00f0
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r16
            r3 = r42
            goto L_0x0103
        L_0x00f0:
            r16 = r13 & r33
            r3 = r42
            if (r16 != 0) goto L_0x0103
            boolean r16 = r10.changed((java.lang.Object) r3)
            if (r16 == 0) goto L_0x00ff
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0101
        L_0x00ff:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x0101:
            r1 = r1 | r16
        L_0x0103:
            r3 = r14 & 256(0x100, float:3.59E-43)
            r34 = 234881024(0xe000000, float:1.5777218E-30)
            if (r3 == 0) goto L_0x0110
            r16 = 100663296(0x6000000, float:2.4074124E-35)
            r1 = r1 | r16
            r5 = r43
            goto L_0x0123
        L_0x0110:
            r16 = r13 & r34
            r5 = r43
            if (r16 != 0) goto L_0x0123
            boolean r16 = r10.changed((java.lang.Object) r5)
            if (r16 == 0) goto L_0x011f
            r16 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0121
        L_0x011f:
            r16 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0121:
            r1 = r1 | r16
        L_0x0123:
            r16 = 191739611(0xb6db6db, float:4.5782105E-32)
            r5 = r1 & r16
            r7 = 38347922(0x2492492, float:1.4777643E-37)
            if (r5 != r7) goto L_0x0147
            boolean r5 = r10.getSkipping()
            if (r5 != 0) goto L_0x0134
            goto L_0x0147
        L_0x0134:
            r10.skipToGroupEnd()
            r3 = r37
            r4 = r38
            r7 = r41
            r9 = r43
            r5 = r8
            r23 = r10
            r6 = r15
            r8 = r42
            goto L_0x024b
        L_0x0147:
            r10.startDefaults()
            r5 = r13 & 1
            r7 = -3670017(0xffffffffffc7ffff, float:NaN)
            if (r5 == 0) goto L_0x0170
            boolean r5 = r10.getDefaultsInvalid()
            if (r5 == 0) goto L_0x0158
            goto L_0x0170
        L_0x0158:
            r10.skipToGroupEnd()
            r0 = r14 & 64
            if (r0 == 0) goto L_0x0160
            r1 = r1 & r7
        L_0x0160:
            r16 = r38
            r19 = r41
            r20 = r42
            r21 = r43
            r17 = r8
            r18 = r15
            r15 = r37
            goto L_0x01ec
        L_0x0170:
            if (r2 == 0) goto L_0x0177
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r2 = (androidx.compose.ui.Modifier) r2
            goto L_0x0179
        L_0x0177:
            r2 = r37
        L_0x0179:
            r5 = 0
            if (r4 == 0) goto L_0x017e
            r4 = r5
            goto L_0x0180
        L_0x017e:
            r4 = r38
        L_0x0180:
            if (r6 == 0) goto L_0x0183
            goto L_0x0184
        L_0x0183:
            r5 = r8
        L_0x0184:
            if (r9 == 0) goto L_0x0188
            r6 = 1
            goto L_0x0189
        L_0x0188:
            r6 = r15
        L_0x0189:
            r8 = r14 & 64
            if (r8 == 0) goto L_0x01a7
            androidx.compose.material3.MenuDefaults r15 = androidx.compose.material3.MenuDefaults.INSTANCE
            r16 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r29 = 1572864(0x180000, float:2.204052E-39)
            r30 = 63
            r28 = r10
            androidx.compose.material3.MenuItemColors r8 = r15.m1432itemColors5tl4gsc(r16, r18, r20, r22, r24, r26, r28, r29, r30)
            r1 = r1 & r7
            goto L_0x01a9
        L_0x01a7:
            r8 = r41
        L_0x01a9:
            if (r0 == 0) goto L_0x01b2
            androidx.compose.material3.MenuDefaults r0 = androidx.compose.material3.MenuDefaults.INSTANCE
            androidx.compose.foundation.layout.PaddingValues r0 = r0.getDropdownMenuItemContentPadding()
            goto L_0x01b4
        L_0x01b2:
            r0 = r42
        L_0x01b4:
            if (r3 == 0) goto L_0x01df
            r3 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r10.startReplaceableGroup(r3)
            java.lang.String r3 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r10, r3)
            java.lang.Object r3 = r10.rememberedValue()
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r7 = r7.getEmpty()
            if (r3 != r7) goto L_0x01d4
            androidx.compose.foundation.interaction.MutableInteractionSource r3 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r10.updateRememberedValue(r3)
        L_0x01d4:
            r10.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r3 = (androidx.compose.foundation.interaction.MutableInteractionSource) r3
            r20 = r0
            r15 = r2
            r21 = r3
            goto L_0x01e4
        L_0x01df:
            r21 = r43
            r20 = r0
            r15 = r2
        L_0x01e4:
            r16 = r4
            r17 = r5
            r18 = r6
            r19 = r8
        L_0x01ec:
            r10.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01ff
            r0 = -1
            java.lang.String r2 = "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:137)"
            r3 = 1826340448(0x6cdbbe60, float:2.1252302E27)
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r1, r0, r2)
        L_0x01ff:
            r0 = r1 & 14
            r2 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r1
            r0 = r0 | r2
            r2 = r1 & r31
            r0 = r0 | r2
            r2 = r1 & r32
            r0 = r0 | r2
            r2 = r1 & r33
            r0 = r0 | r2
            r1 = r1 & r34
            r22 = r0 | r1
            r0 = r35
            r1 = r36
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r10
            r23 = r10
            r10 = r22
            androidx.compose.material3.MenuKt.DropdownMenuItemContent(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x023e
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x023e:
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
        L_0x024b:
            androidx.compose.runtime.ScopeUpdateScope r15 = r23.endRestartGroup()
            if (r15 != 0) goto L_0x0252
            goto L_0x0268
        L_0x0252:
            androidx.compose.material3.AndroidMenu_androidKt$DropdownMenuItem$2 r16 = new androidx.compose.material3.AndroidMenu_androidKt$DropdownMenuItem$2
            r0 = r16
            r1 = r35
            r2 = r36
            r10 = r45
            r11 = r46
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = r16
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r15.updateScope(r0)
        L_0x0268:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AndroidMenu_androidKt.DropdownMenuItem(kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.material3.MenuItemColors, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }
}
