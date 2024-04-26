package androidx.compose.material3;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aM\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0007¢\u0006\u0002\u0010\u0014\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u0013\u0010\u0002\u001a\u00020\u0003X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\u0005\u001a\u00020\u0003X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\u0006\u001a\u00020\u0003X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"RadioAnimationDuration", "", "RadioButtonDotSize", "Landroidx/compose/ui/unit/Dp;", "F", "RadioButtonPadding", "RadioStrokeWidth", "RadioButton", "", "selected", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "colors", "Landroidx/compose/material3/RadioButtonColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/RadioButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: RadioButton.kt */
public final class RadioButtonKt {
    private static final int RadioAnimationDuration = 100;
    private static final float RadioButtonDotSize = Dp.m5626constructorimpl((float) 12);
    private static final float RadioButtonPadding;
    /* access modifiers changed from: private */
    public static final float RadioStrokeWidth;

    /* JADX WARNING: Removed duplicated region for block: B:119:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void RadioButton(boolean r25, kotlin.jvm.functions.Function0<kotlin.Unit> r26, androidx.compose.ui.Modifier r27, boolean r28, androidx.compose.material3.RadioButtonColors r29, androidx.compose.foundation.interaction.MutableInteractionSource r30, androidx.compose.runtime.Composer r31, int r32, int r33) {
        /*
            r7 = r25
            r8 = r26
            r9 = r32
            r0 = 408580840(0x185a72e8, float:2.8233852E-24)
            r1 = r31
            androidx.compose.runtime.Composer r6 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(RadioButton)P(5,4,3,1)77@3761L8,78@3821L39,80@3885L164,84@4078L29,114@5054L415,101@4636L833:RadioButton.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r6, r1)
            r1 = r33 & 1
            r5 = 2
            if (r1 == 0) goto L_0x001c
            r1 = r9 | 6
            goto L_0x002c
        L_0x001c:
            r1 = r9 & 14
            if (r1 != 0) goto L_0x002b
            boolean r1 = r6.changed((boolean) r7)
            if (r1 == 0) goto L_0x0028
            r1 = 4
            goto L_0x0029
        L_0x0028:
            r1 = r5
        L_0x0029:
            r1 = r1 | r9
            goto L_0x002c
        L_0x002b:
            r1 = r9
        L_0x002c:
            r2 = r33 & 2
            if (r2 == 0) goto L_0x0033
            r1 = r1 | 48
            goto L_0x0043
        L_0x0033:
            r2 = r9 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0043
            boolean r2 = r6.changedInstance(r8)
            if (r2 == 0) goto L_0x0040
            r2 = 32
            goto L_0x0042
        L_0x0040:
            r2 = 16
        L_0x0042:
            r1 = r1 | r2
        L_0x0043:
            r2 = r33 & 4
            if (r2 == 0) goto L_0x004a
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x005d
        L_0x004a:
            r3 = r9 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x005d
            r3 = r27
            boolean r4 = r6.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x0059
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0059:
            r4 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r1 = r1 | r4
            goto L_0x005f
        L_0x005d:
            r3 = r27
        L_0x005f:
            r4 = r33 & 8
            if (r4 == 0) goto L_0x0066
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0079
        L_0x0066:
            r10 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r10 != 0) goto L_0x0079
            r10 = r28
            boolean r11 = r6.changed((boolean) r10)
            if (r11 == 0) goto L_0x0075
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0077
        L_0x0075:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0077:
            r1 = r1 | r11
            goto L_0x007b
        L_0x0079:
            r10 = r28
        L_0x007b:
            r11 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r9
            if (r11 != 0) goto L_0x0096
            r11 = r33 & 16
            if (r11 != 0) goto L_0x0090
            r11 = r29
            boolean r12 = r6.changed((java.lang.Object) r11)
            if (r12 == 0) goto L_0x0092
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0094
        L_0x0090:
            r11 = r29
        L_0x0092:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x0094:
            r1 = r1 | r12
            goto L_0x0098
        L_0x0096:
            r11 = r29
        L_0x0098:
            r22 = r33 & 32
            if (r22 == 0) goto L_0x00a2
            r12 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r12
            r15 = r30
            goto L_0x00b5
        L_0x00a2:
            r12 = 458752(0x70000, float:6.42848E-40)
            r12 = r12 & r9
            r15 = r30
            if (r12 != 0) goto L_0x00b5
            boolean r12 = r6.changed((java.lang.Object) r15)
            if (r12 == 0) goto L_0x00b2
            r12 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b4
        L_0x00b2:
            r12 = 65536(0x10000, float:9.18355E-41)
        L_0x00b4:
            r1 = r1 | r12
        L_0x00b5:
            r12 = 374491(0x5b6db, float:5.24774E-40)
            r12 = r12 & r1
            r13 = 74898(0x12492, float:1.04954E-40)
            if (r12 != r13) goto L_0x00ce
            boolean r12 = r6.getSkipping()
            if (r12 != 0) goto L_0x00c5
            goto L_0x00ce
        L_0x00c5:
            r6.skipToGroupEnd()
            r12 = r6
            r4 = r10
            r5 = r11
            r6 = r15
            goto L_0x026c
        L_0x00ce:
            r6.startDefaults()
            r12 = r9 & 1
            r23 = -57345(0xffffffffffff1fff, float:NaN)
            if (r12 == 0) goto L_0x00ee
            boolean r12 = r6.getDefaultsInvalid()
            if (r12 == 0) goto L_0x00df
            goto L_0x00ee
        L_0x00df:
            r6.skipToGroupEnd()
            r2 = r33 & 16
            if (r2 == 0) goto L_0x00e8
            r1 = r1 & r23
        L_0x00e8:
            r4 = r3
            r3 = r10
            r2 = r11
            r17 = r15
            goto L_0x0146
        L_0x00ee:
            if (r2 == 0) goto L_0x00f5
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r2 = (androidx.compose.ui.Modifier) r2
            goto L_0x00f6
        L_0x00f5:
            r2 = r3
        L_0x00f6:
            if (r4 == 0) goto L_0x00fa
            r3 = 1
            goto L_0x00fb
        L_0x00fa:
            r3 = r10
        L_0x00fb:
            r4 = r33 & 16
            if (r4 == 0) goto L_0x011a
            androidx.compose.material3.RadioButtonDefaults r10 = androidx.compose.material3.RadioButtonDefaults.INSTANCE
            r11 = 0
            r13 = 0
            r16 = 0
            r18 = 0
            r20 = 24576(0x6000, float:3.4438E-41)
            r21 = 15
            r15 = r16
            r17 = r18
            r19 = r6
            androidx.compose.material3.RadioButtonColors r4 = r10.m1511colorsro_MJ88(r11, r13, r15, r17, r19, r20, r21)
            r1 = r1 & r23
            r11 = r4
        L_0x011a:
            if (r22 == 0) goto L_0x0142
            r4 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r6.startReplaceableGroup(r4)
            java.lang.String r4 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r6, r4)
            java.lang.Object r4 = r6.rememberedValue()
            androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r10 = r10.getEmpty()
            if (r4 != r10) goto L_0x013a
            androidx.compose.foundation.interaction.MutableInteractionSource r4 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r6.updateRememberedValue(r4)
        L_0x013a:
            r6.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r4 = (androidx.compose.foundation.interaction.MutableInteractionSource) r4
            r17 = r4
            goto L_0x0144
        L_0x0142:
            r17 = r30
        L_0x0144:
            r4 = r2
            r2 = r11
        L_0x0146:
            r6.endDefaults()
            boolean r10 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r10 == 0) goto L_0x0156
            r10 = -1
            java.lang.String r11 = "androidx.compose.material3.RadioButton (RadioButton.kt:72)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r1, r10, r11)
        L_0x0156:
            r0 = 0
            if (r7 == 0) goto L_0x0162
            float r10 = RadioButtonDotSize
            float r11 = (float) r5
            float r10 = r10 / r11
            float r10 = androidx.compose.ui.unit.Dp.m5626constructorimpl(r10)
            goto L_0x0167
        L_0x0162:
            float r10 = (float) r0
            float r10 = androidx.compose.ui.unit.Dp.m5626constructorimpl(r10)
        L_0x0167:
            r11 = 100
            r15 = 0
            r14 = 6
            androidx.compose.animation.core.TweenSpec r11 = androidx.compose.animation.core.AnimationSpecKt.tween$default(r11, r0, r15, r14, r15)
            androidx.compose.animation.core.AnimationSpec r11 = (androidx.compose.animation.core.AnimationSpec) r11
            r12 = 0
            r13 = 0
            r16 = 48
            r18 = 12
            r19 = r14
            r14 = r6
            r15 = r16
            r16 = r18
            androidx.compose.runtime.State r15 = androidx.compose.animation.core.AnimateAsStateKt.m111animateDpAsStateAjpBEmI(r10, r11, r12, r13, r14, r15, r16)
            int r10 = r1 >> 9
            r10 = r10 & 14
            int r11 = r1 << 3
            r11 = r11 & 112(0x70, float:1.57E-43)
            r10 = r10 | r11
            int r1 = r1 >> 6
            r1 = r1 & 896(0x380, float:1.256E-42)
            r1 = r1 | r10
            androidx.compose.runtime.State r1 = r2.radioColor$material3_release(r3, r7, r6, r1)
            r10 = 735546407(0x2bd78c27, float:1.5315569E-12)
            r6.startReplaceableGroup(r10)
            java.lang.String r10 = "93@4433L136"
            androidx.compose.runtime.ComposerKt.sourceInformation(r6, r10)
            if (r8 == 0) goto L_0x01e5
            androidx.compose.ui.Modifier$Companion r18 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.semantics.Role$Companion r10 = androidx.compose.ui.semantics.Role.Companion
            int r19 = r10.m4974getRadioButtono7Vup1c()
            r10 = 0
            androidx.compose.material3.tokens.RadioButtonTokens r11 = androidx.compose.material3.tokens.RadioButtonTokens.INSTANCE
            float r11 = r11.m2280getStateLayerSizeD9Ej5fM()
            float r12 = (float) r5
            float r11 = r11 / r12
            float r11 = androidx.compose.ui.unit.Dp.m5626constructorimpl(r11)
            r12 = 0
            r16 = 54
            r20 = 4
            r14 = r6
            r24 = r15
            r15 = r16
            r16 = r20
            androidx.compose.foundation.Indication r10 = androidx.compose.material.ripple.RippleKt.m1106rememberRipple9IZ8Weo(r10, r11, r12, r14, r15, r16)
            r11 = r18
            androidx.compose.ui.Modifier r11 = (androidx.compose.ui.Modifier) r11
            androidx.compose.ui.semantics.Role r12 = androidx.compose.ui.semantics.Role.m4963boximpl(r19)
            r13 = r0
            r0 = r11
            r11 = r1
            r1 = r25
            r14 = r2
            r2 = r17
            r15 = r3
            r3 = r10
            r10 = r4
            r4 = r15
            r7 = r5
            r5 = r12
            r12 = r6
            r6 = r26
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.selection.SelectableKt.m812selectableO2vRcR0(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x01f2
        L_0x01e5:
            r13 = r0
            r11 = r1
            r14 = r2
            r10 = r4
            r7 = r5
            r12 = r6
            r24 = r15
            r15 = r3
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
        L_0x01f2:
            r12.endReplaceableGroup()
            if (r8 == 0) goto L_0x0200
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
            androidx.compose.ui.Modifier r1 = androidx.compose.material3.InteractiveComponentSizeKt.minimumInteractiveComponentSize(r1)
            goto L_0x0204
        L_0x0200:
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
        L_0x0204:
            androidx.compose.ui.Modifier r1 = r10.then(r1)
            androidx.compose.ui.Modifier r0 = r1.then(r0)
            androidx.compose.ui.Alignment$Companion r1 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment r1 = r1.getCenter()
            r2 = 0
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(r0, r1, r13, r7, r2)
            float r1 = RadioButtonPadding
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.PaddingKt.m493padding3ABfNKs(r0, r1)
            androidx.compose.material3.tokens.RadioButtonTokens r1 = androidx.compose.material3.tokens.RadioButtonTokens.INSTANCE
            float r1 = r1.m2279getIconSizeD9Ej5fM()
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.m555requiredSize3ABfNKs(r0, r1)
            r1 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r12.startReplaceableGroup(r1)
            java.lang.String r1 = "CC(remember)P(1,2):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r12, r1)
            boolean r1 = r12.changed((java.lang.Object) r11)
            r2 = r24
            boolean r3 = r12.changed((java.lang.Object) r2)
            r1 = r1 | r3
            java.lang.Object r3 = r12.rememberedValue()
            if (r1 != 0) goto L_0x024b
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r3 != r1) goto L_0x0256
        L_0x024b:
            androidx.compose.material3.RadioButtonKt$RadioButton$2$1 r1 = new androidx.compose.material3.RadioButtonKt$RadioButton$2$1
            r1.<init>(r11, r2)
            r3 = r1
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            r12.updateRememberedValue(r3)
        L_0x0256:
            r12.endReplaceableGroup()
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            androidx.compose.foundation.CanvasKt.Canvas(r0, r3, r12, r13)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0267
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0267:
            r3 = r10
            r5 = r14
            r4 = r15
            r6 = r17
        L_0x026c:
            androidx.compose.runtime.ScopeUpdateScope r10 = r12.endRestartGroup()
            if (r10 != 0) goto L_0x0273
            goto L_0x0286
        L_0x0273:
            androidx.compose.material3.RadioButtonKt$RadioButton$3 r11 = new androidx.compose.material3.RadioButtonKt$RadioButton$3
            r0 = r11
            r1 = r25
            r2 = r26
            r7 = r32
            r8 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            kotlin.jvm.functions.Function2 r11 = (kotlin.jvm.functions.Function2) r11
            r10.updateScope(r11)
        L_0x0286:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.RadioButtonKt.RadioButton(boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.material3.RadioButtonColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    static {
        float f = (float) 2;
        RadioButtonPadding = Dp.m5626constructorimpl(f);
        RadioStrokeWidth = Dp.m5626constructorimpl(f);
    }
}
