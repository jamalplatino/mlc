package androidx.compose.material3;

import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteractionKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.material3.tokens.SwitchTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000^\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aj\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0017¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001dH\u0007¢\u0006\u0002\u0010\u001e\u001a|\u0010\u001f\u001a\u00020\u000f*\u00020 2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\"2\u0013\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0006\u0010\u001c\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0004H\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010*\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\u0003\u001a\u00020\u0004X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0013\u0010\u0006\u001a\u00020\u0004X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0019\u0010\u0007\u001a\u00020\u0004X\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\b\u0010\t\"\u0013\u0010\n\u001a\u00020\u0004X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0013\u0010\u000b\u001a\u00020\u0004X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0019\u0010\f\u001a\u00020\u0004X\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\r\u0010\t\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006+"}, d2 = {"AnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "", "SwitchHeight", "Landroidx/compose/ui/unit/Dp;", "F", "SwitchWidth", "ThumbDiameter", "getThumbDiameter", "()F", "ThumbPadding", "ThumbPathLength", "UncheckedThumbDiameter", "getUncheckedThumbDiameter", "Switch", "", "checked", "", "onCheckedChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "thumbContent", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "enabled", "colors", "Landroidx/compose/material3/SwitchColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/SwitchColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "SwitchImpl", "Landroidx/compose/foundation/layout/BoxScope;", "thumbValue", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/interaction/InteractionSource;", "thumbShape", "Landroidx/compose/ui/graphics/Shape;", "uncheckedThumbDiameter", "minBound", "maxBound", "SwitchImpl-0DmnUew", "(Landroidx/compose/foundation/layout/BoxScope;ZZLandroidx/compose/material3/SwitchColors;Landroidx/compose/runtime/State;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/ui/graphics/Shape;FFFLandroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Switch.kt */
public final class SwitchKt {
    /* access modifiers changed from: private */
    public static final TweenSpec<Float> AnimationSpec = new TweenSpec(100, 0, (Easing) null, 6, (DefaultConstructorMarker) null);
    private static final float SwitchHeight;
    private static final float SwitchWidth;
    private static final float ThumbDiameter;
    private static final float ThumbPadding;
    private static final float ThumbPathLength;
    private static final float UncheckedThumbDiameter = SwitchTokens.INSTANCE.m2330getUnselectedHandleWidthD9Ej5fM();

    public static final float getThumbDiameter() {
        return ThumbDiameter;
    }

    public static final float getUncheckedThumbDiameter() {
        return UncheckedThumbDiameter;
    }

    /* JADX WARNING: Removed duplicated region for block: B:147:0x0456  */
    /* JADX WARNING: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00f1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void Switch(boolean r52, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r53, androidx.compose.ui.Modifier r54, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r55, boolean r56, androidx.compose.material3.SwitchColors r57, androidx.compose.foundation.interaction.MutableInteractionSource r58, androidx.compose.runtime.Composer r59, int r60, int r61) {
        /*
            r7 = r53
            r8 = r60
            r0 = 1580463220(0x5e33f474, float:3.24177919E18)
            r1 = r59
            androidx.compose.runtime.Composer r6 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(Switch)P(!1,5,4,6,2)96@4503L8,97@4563L39,*106@4851L7,107@4926L7,108@4986L111,113@5161L36,114@5214L24,116@5244L156,121@5406L216,145@6082L848:Switch.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r6, r1)
            r1 = r61 & 1
            if (r1 == 0) goto L_0x001b
            r1 = r8 | 6
            r4 = r52
            goto L_0x002d
        L_0x001b:
            r1 = r8 & 14
            r4 = r52
            if (r1 != 0) goto L_0x002c
            boolean r1 = r6.changed((boolean) r4)
            if (r1 == 0) goto L_0x0029
            r1 = 4
            goto L_0x002a
        L_0x0029:
            r1 = 2
        L_0x002a:
            r1 = r1 | r8
            goto L_0x002d
        L_0x002c:
            r1 = r8
        L_0x002d:
            r2 = r61 & 2
            if (r2 == 0) goto L_0x0034
            r1 = r1 | 48
            goto L_0x0044
        L_0x0034:
            r2 = r8 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0044
            boolean r2 = r6.changedInstance(r7)
            if (r2 == 0) goto L_0x0041
            r2 = 32
            goto L_0x0043
        L_0x0041:
            r2 = 16
        L_0x0043:
            r1 = r1 | r2
        L_0x0044:
            r2 = r61 & 4
            if (r2 == 0) goto L_0x004b
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x005e
        L_0x004b:
            r3 = r8 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x005e
            r3 = r54
            boolean r9 = r6.changed((java.lang.Object) r3)
            if (r9 == 0) goto L_0x005a
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x005c
        L_0x005a:
            r9 = 128(0x80, float:1.794E-43)
        L_0x005c:
            r1 = r1 | r9
            goto L_0x0060
        L_0x005e:
            r3 = r54
        L_0x0060:
            r9 = r61 & 8
            if (r9 == 0) goto L_0x0067
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x007a
        L_0x0067:
            r10 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r10 != 0) goto L_0x007a
            r10 = r55
            boolean r11 = r6.changedInstance(r10)
            if (r11 == 0) goto L_0x0076
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0078
        L_0x0076:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0078:
            r1 = r1 | r11
            goto L_0x007c
        L_0x007a:
            r10 = r55
        L_0x007c:
            r11 = r61 & 16
            if (r11 == 0) goto L_0x0083
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0098
        L_0x0083:
            r12 = 57344(0xe000, float:8.0356E-41)
            r12 = r12 & r8
            if (r12 != 0) goto L_0x0098
            r12 = r56
            boolean r13 = r6.changed((boolean) r12)
            if (r13 == 0) goto L_0x0094
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0094:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r1 = r1 | r13
            goto L_0x009a
        L_0x0098:
            r12 = r56
        L_0x009a:
            r46 = 458752(0x70000, float:6.42848E-40)
            r13 = r8 & r46
            if (r13 != 0) goto L_0x00b5
            r13 = r61 & 32
            if (r13 != 0) goto L_0x00af
            r13 = r57
            boolean r14 = r6.changed((java.lang.Object) r13)
            if (r14 == 0) goto L_0x00b1
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b3
        L_0x00af:
            r13 = r57
        L_0x00b1:
            r14 = 65536(0x10000, float:9.18355E-41)
        L_0x00b3:
            r1 = r1 | r14
            goto L_0x00b7
        L_0x00b5:
            r13 = r57
        L_0x00b7:
            r47 = r61 & 64
            r48 = 3670016(0x380000, float:5.142788E-39)
            if (r47 == 0) goto L_0x00c1
            r14 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r14
            goto L_0x00d4
        L_0x00c1:
            r14 = r8 & r48
            if (r14 != 0) goto L_0x00d4
            r14 = r58
            boolean r15 = r6.changed((java.lang.Object) r14)
            if (r15 == 0) goto L_0x00d0
            r15 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d2
        L_0x00d0:
            r15 = 524288(0x80000, float:7.34684E-40)
        L_0x00d2:
            r1 = r1 | r15
            goto L_0x00d6
        L_0x00d4:
            r14 = r58
        L_0x00d6:
            r15 = 2995931(0x2db6db, float:4.198194E-39)
            r15 = r15 & r1
            r5 = 599186(0x92492, float:8.39638E-40)
            if (r15 != r5) goto L_0x00f1
            boolean r5 = r6.getSkipping()
            if (r5 != 0) goto L_0x00e6
            goto L_0x00f1
        L_0x00e6:
            r6.skipToGroupEnd()
            r2 = r6
            r4 = r10
            r5 = r12
            r6 = r13
            r25 = r14
            goto L_0x044f
        L_0x00f1:
            r6.startDefaults()
            r5 = r8 & 1
            r49 = -458753(0xfffffffffff8ffff, float:NaN)
            java.lang.String r15 = "CC(remember):Composables.kt#9igjgp"
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            if (r5 == 0) goto L_0x011e
            boolean r5 = r6.getDefaultsInvalid()
            if (r5 == 0) goto L_0x0107
            goto L_0x011e
        L_0x0107:
            r6.skipToGroupEnd()
            r2 = r61 & 32
            if (r2 == 0) goto L_0x0110
            r1 = r1 & r49
        L_0x0110:
            r9 = r1
            r23 = r10
            r50 = r12
            r24 = r13
            r25 = r14
            r3 = r15
            r15 = r54
            goto L_0x019d
        L_0x011e:
            if (r2 == 0) goto L_0x0125
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r2 = (androidx.compose.ui.Modifier) r2
            goto L_0x0127
        L_0x0125:
            r2 = r54
        L_0x0127:
            if (r9 == 0) goto L_0x012b
            r5 = 0
            goto L_0x012c
        L_0x012b:
            r5 = r10
        L_0x012c:
            if (r11 == 0) goto L_0x0132
            r9 = 1
            r50 = r9
            goto L_0x0134
        L_0x0132:
            r50 = r12
        L_0x0134:
            r9 = r61 & 32
            if (r9 == 0) goto L_0x016b
            androidx.compose.material3.SwitchDefaults r9 = androidx.compose.material3.SwitchDefaults.INSTANCE
            r10 = 0
            r12 = 0
            r16 = 0
            r3 = r15
            r14 = r16
            r18 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r28 = 0
            r30 = 0
            r32 = 0
            r34 = 0
            r36 = 0
            r38 = 0
            r40 = 0
            r43 = 0
            r44 = 1572864(0x180000, float:2.204052E-39)
            r45 = 65535(0xffff, float:9.1834E-41)
            r42 = r6
            androidx.compose.material3.SwitchColors r9 = r9.m1667colorsV1nXRL4(r10, r12, r14, r16, r18, r20, r22, r24, r26, r28, r30, r32, r34, r36, r38, r40, r42, r43, r44, r45)
            r1 = r1 & r49
            goto L_0x016d
        L_0x016b:
            r3 = r15
            r9 = r13
        L_0x016d:
            if (r47 == 0) goto L_0x0195
            r6.startReplaceableGroup(r0)
            androidx.compose.runtime.ComposerKt.sourceInformation(r6, r3)
            java.lang.Object r10 = r6.rememberedValue()
            androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r11 = r11.getEmpty()
            if (r10 != r11) goto L_0x0188
            androidx.compose.foundation.interaction.MutableInteractionSource r10 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r6.updateRememberedValue(r10)
        L_0x0188:
            r6.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r10 = (androidx.compose.foundation.interaction.MutableInteractionSource) r10
            r15 = r2
            r23 = r5
            r24 = r9
            r25 = r10
            goto L_0x019c
        L_0x0195:
            r25 = r58
            r15 = r2
            r23 = r5
            r24 = r9
        L_0x019c:
            r9 = r1
        L_0x019d:
            r6.endDefaults()
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x01b0
            r1 = -1
            java.lang.String r2 = "androidx.compose.material3.Switch (Switch.kt:90)"
            r5 = 1580463220(0x5e33f474, float:3.24177919E18)
            androidx.compose.runtime.ComposerKt.traceEventStart(r5, r9, r1, r2)
        L_0x01b0:
            if (r23 != 0) goto L_0x01b5
            float r1 = UncheckedThumbDiameter
            goto L_0x01b7
        L_0x01b5:
            float r1 = ThumbDiameter
        L_0x01b7:
            r17 = r1
            float r10 = SwitchHeight
            float r1 = r10 - r17
            float r1 = androidx.compose.ui.unit.Dp.m5626constructorimpl(r1)
            r2 = 2
            float r5 = (float) r2
            float r1 = r1 / r5
            float r14 = androidx.compose.ui.unit.Dp.m5626constructorimpl(r1)
            androidx.compose.runtime.ProvidableCompositionLocal r1 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r1 = (androidx.compose.runtime.CompositionLocal) r1
            r11 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r2 = "CC:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r6, r11, r2)
            java.lang.Object r1 = r6.consume(r1)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r6)
            androidx.compose.ui.unit.Density r1 = (androidx.compose.ui.unit.Density) r1
            float r1 = r1.m5607toPx0680j_4(r14)
            androidx.compose.runtime.ProvidableCompositionLocal r5 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r5 = (androidx.compose.runtime.CompositionLocal) r5
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r6, r11, r2)
            java.lang.Object r2 = r6.consume(r5)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r6)
            androidx.compose.ui.unit.Density r2 = (androidx.compose.ui.unit.Density) r2
            float r13 = ThumbPathLength
            float r2 = r2.m5607toPx0680j_4(r13)
            java.lang.Float r5 = java.lang.Float.valueOf(r1)
            java.lang.Float r12 = java.lang.Float.valueOf(r2)
            r11 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r6.startReplaceableGroup(r11)
            java.lang.String r11 = "CC(remember)P(1,2):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r6, r11)
            boolean r5 = r6.changed((java.lang.Object) r5)
            boolean r11 = r6.changed((java.lang.Object) r12)
            r5 = r5 | r11
            java.lang.Object r11 = r6.rememberedValue()
            if (r5 != 0) goto L_0x0225
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r5 = r5.getEmpty()
            if (r11 != r5) goto L_0x0230
        L_0x0225:
            androidx.compose.material3.SwitchKt$Switch$valueToOffset$1$1 r5 = new androidx.compose.material3.SwitchKt$Switch$valueToOffset$1$1
            r5.<init>(r2, r1)
            r11 = r5
            kotlin.jvm.functions.Function1 r11 = (kotlin.jvm.functions.Function1) r11
            r6.updateRememberedValue(r11)
        L_0x0230:
            r6.endReplaceableGroup()
            kotlin.jvm.functions.Function1 r11 = (kotlin.jvm.functions.Function1) r11
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r52)
            java.lang.Object r2 = r11.invoke(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r6.startReplaceableGroup(r0)
            androidx.compose.runtime.ComposerKt.sourceInformation(r6, r3)
            java.lang.Object r5 = r6.rememberedValue()
            androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r11 = r11.getEmpty()
            if (r5 != r11) goto L_0x0260
            r5 = 0
            r11 = 0
            r12 = 2
            androidx.compose.animation.core.Animatable r5 = androidx.compose.animation.core.AnimatableKt.Animatable$default(r2, r5, r12, r11)
            r6.updateRememberedValue(r5)
            goto L_0x0262
        L_0x0260:
            r11 = 0
            r12 = 2
        L_0x0262:
            r6.endReplaceableGroup()
            androidx.compose.animation.core.Animatable r5 = (androidx.compose.animation.core.Animatable) r5
            r11 = 773894976(0x2e20b340, float:3.6538994E-11)
            r6.startReplaceableGroup(r11)
            java.lang.String r11 = "CC(rememberCoroutineScope)476@19869L144:Effects.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r6, r11)
            r6.startReplaceableGroup(r0)
            androidx.compose.runtime.ComposerKt.sourceInformation(r6, r3)
            java.lang.Object r0 = r6.rememberedValue()
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r3 = r3.getEmpty()
            if (r0 != r3) goto L_0x0295
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlin.coroutines.CoroutineContext r0 = (kotlin.coroutines.CoroutineContext) r0
            kotlinx.coroutines.CoroutineScope r0 = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(r0, r6)
            androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller r3 = new androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller
            r3.<init>(r0)
            r6.updateRememberedValue(r3)
            r0 = r3
        L_0x0295:
            r6.endReplaceableGroup()
            androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller r0 = (androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) r0
            kotlinx.coroutines.CoroutineScope r0 = r0.getCoroutineScope()
            r6.endReplaceableGroup()
            androidx.compose.material3.SwitchKt$Switch$2 r3 = new androidx.compose.material3.SwitchKt$Switch$2
            r3.<init>(r5, r1)
            kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
            r11 = 0
            androidx.compose.runtime.EffectsKt.SideEffect(r3, r6, r11)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r52)
            androidx.compose.material3.SwitchKt$Switch$3 r3 = new androidx.compose.material3.SwitchKt$Switch$3
            r3.<init>(r5, r2, r0)
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            r0 = r9 & 14
            androidx.compose.runtime.EffectsKt.DisposableEffect((java.lang.Object) r1, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) r3, (androidx.compose.runtime.Composer) r6, (int) r0)
            if (r7 == 0) goto L_0x02e1
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.semantics.Role$Companion r1 = androidx.compose.ui.semantics.Role.Companion
            int r1 = r1.m4975getSwitcho7Vup1c()
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            r3 = 0
            androidx.compose.ui.semantics.Role r16 = androidx.compose.ui.semantics.Role.m4963boximpl(r1)
            r1 = r52
            r2 = r25
            r12 = 0
            r4 = r50
            r18 = r5
            r5 = r16
            r51 = r6
            r6 = r53
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.selection.ToggleableKt.m816toggleableO2vRcR0(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x02ea
        L_0x02e1:
            r18 = r5
            r51 = r6
            r12 = 0
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
        L_0x02ea:
            if (r7 == 0) goto L_0x02f5
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
            androidx.compose.ui.Modifier r1 = androidx.compose.material3.InteractiveComponentSizeKt.minimumInteractiveComponentSize(r1)
            goto L_0x02f9
        L_0x02f5:
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
        L_0x02f9:
            androidx.compose.ui.Modifier r1 = r15.then(r1)
            androidx.compose.ui.Modifier r0 = r1.then(r0)
            androidx.compose.ui.Alignment$Companion r1 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment r1 = r1.getCenter()
            r2 = 2
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(r0, r1, r11, r2, r12)
            float r1 = SwitchWidth
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.m557requiredSizeVpY3zN4(r0, r1, r10)
            r1 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r2 = r51
            r2.startReplaceableGroup(r1)
            java.lang.String r1 = "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r1)
            androidx.compose.ui.Alignment$Companion r1 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment r1 = r1.getTopStart()
            androidx.compose.ui.layout.MeasurePolicy r1 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(r1, r11, r2, r11)
            r3 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r2.startReplaceableGroup(r3)
            java.lang.String r3 = "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh"
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r3)
            androidx.compose.runtime.ProvidableCompositionLocal r3 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r3 = (androidx.compose.runtime.CompositionLocal) r3
            java.lang.String r4 = "C:CompositionLocal.kt#9igjgp"
            r5 = 2023513938(0x789c5f52, float:2.5372864E34)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r5, r4)
            java.lang.Object r3 = r2.consume(r3)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.ui.unit.Density r3 = (androidx.compose.ui.unit.Density) r3
            androidx.compose.runtime.ProvidableCompositionLocal r6 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            androidx.compose.runtime.CompositionLocal r6 = (androidx.compose.runtime.CompositionLocal) r6
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r5, r4)
            java.lang.Object r6 = r2.consume(r6)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.ui.unit.LayoutDirection r6 = (androidx.compose.ui.unit.LayoutDirection) r6
            androidx.compose.runtime.ProvidableCompositionLocal r10 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            androidx.compose.runtime.CompositionLocal r10 = (androidx.compose.runtime.CompositionLocal) r10
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r5, r4)
            java.lang.Object r4 = r2.consume(r10)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.ui.platform.ViewConfiguration r4 = (androidx.compose.ui.platform.ViewConfiguration) r4
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function0 r5 = r5.getConstructor()
            kotlin.jvm.functions.Function3 r0 = androidx.compose.ui.layout.LayoutKt.materializerOf(r0)
            androidx.compose.runtime.Applier r10 = r2.getApplier()
            boolean r10 = r10 instanceof androidx.compose.runtime.Applier
            if (r10 != 0) goto L_0x0384
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x0384:
            r2.startReusableNode()
            boolean r10 = r2.getInserting()
            if (r10 == 0) goto L_0x0391
            r2.createNode(r5)
            goto L_0x0394
        L_0x0391:
            r2.useNode()
        L_0x0394:
            r2.disableReusing()
            androidx.compose.runtime.Composer r5 = androidx.compose.runtime.Updater.m2444constructorimpl(r2)
            androidx.compose.ui.node.ComposeUiNode$Companion r10 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r10 = r10.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r5, r1, r10)
            androidx.compose.ui.node.ComposeUiNode$Companion r1 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r1 = r1.getSetDensity()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r5, r3, r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r1 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r1 = r1.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r5, r6, r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r1 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r1 = r1.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r5, r4, r1)
            r2.enableReusing()
            androidx.compose.runtime.Composer r1 = androidx.compose.runtime.SkippableUpdater.m2436constructorimpl(r2)
            androidx.compose.runtime.SkippableUpdater r1 = androidx.compose.runtime.SkippableUpdater.m2435boximpl(r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            r0.invoke(r1, r2, r3)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r2.startReplaceableGroup(r0)
            r0 = -1253629305(0xffffffffb5472287, float:-7.418352E-7)
            java.lang.String r1 = "C72@3384L9:Box.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r0, r1)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE
            androidx.compose.foundation.layout.BoxScope r0 = (androidx.compose.foundation.layout.BoxScope) r0
            r1 = -1873061389(0xffffffff905b59f3, float:-4.325943E-29)
            java.lang.String r3 = "C164@6720L9,158@6473L451:Switch.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r1, r3)
            androidx.compose.runtime.State r1 = r18.asState()
            androidx.compose.material3.tokens.SwitchTokens r3 = androidx.compose.material3.tokens.SwitchTokens.INSTANCE
            androidx.compose.material3.tokens.ShapeKeyTokens r3 = r3.getHandleShape()
            r4 = 6
            androidx.compose.ui.graphics.Shape r16 = androidx.compose.material3.ShapesKt.toShape(r3, r2, r4)
            r3 = r25
            androidx.compose.foundation.interaction.InteractionSource r3 = (androidx.compose.foundation.interaction.InteractionSource) r3
            int r5 = r9 << 3
            r5 = r5 & 112(0x70, float:1.57E-43)
            r4 = r4 | r5
            int r5 = r9 >> 6
            r6 = r5 & 896(0x380, float:1.256E-42)
            r4 = r4 | r6
            r5 = r5 & 7168(0x1c00, float:1.0045E-41)
            r4 = r4 | r5
            int r5 = r9 << 6
            r5 = r5 & r46
            r4 = r4 | r5
            r5 = r9 & r48
            r21 = r4 | r5
            r22 = 6
            r9 = r0
            r10 = r52
            r11 = r50
            r12 = r24
            r0 = r13
            r13 = r1
            r1 = r14
            r14 = r23
            r4 = r15
            r15 = r3
            r18 = r1
            r19 = r0
            r20 = r2
            m1669SwitchImpl0DmnUew(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            r2.endReplaceableGroup()
            r2.endNode()
            r2.endReplaceableGroup()
            r2.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0448
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0448:
            r3 = r4
            r4 = r23
            r6 = r24
            r5 = r50
        L_0x044f:
            androidx.compose.runtime.ScopeUpdateScope r10 = r2.endRestartGroup()
            if (r10 != 0) goto L_0x0456
            goto L_0x046b
        L_0x0456:
            androidx.compose.material3.SwitchKt$Switch$5 r11 = new androidx.compose.material3.SwitchKt$Switch$5
            r0 = r11
            r1 = r52
            r2 = r53
            r7 = r25
            r8 = r60
            r9 = r61
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            kotlin.jvm.functions.Function2 r11 = (kotlin.jvm.functions.Function2) r11
            r10.updateScope(r11)
        L_0x046b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SwitchKt.Switch(boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, boolean, androidx.compose.material3.SwitchColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: SwitchImpl-0DmnUew  reason: not valid java name */
    public static final void m1669SwitchImpl0DmnUew(BoxScope boxScope, boolean z, boolean z2, SwitchColors switchColors, State<Float> state, Function2<? super Composer, ? super Integer, Unit> function2, InteractionSource interactionSource, Shape shape, float f, float f2, float f3, Composer composer, int i, int i2) {
        int i3;
        int i4;
        float f4;
        float f5;
        float f6;
        BoxScope boxScope2 = boxScope;
        boolean z3 = z;
        boolean z4 = z2;
        SwitchColors switchColors2 = switchColors;
        Function2<? super Composer, ? super Integer, Unit> function22 = function2;
        InteractionSource interactionSource2 = interactionSource;
        Shape shape2 = shape;
        float f7 = f;
        float f8 = f2;
        float f9 = f3;
        int i5 = i;
        Composer startRestartGroup = composer.startRestartGroup(-1968109941);
        ComposerKt.sourceInformation(startRestartGroup, "C(SwitchImpl)P(!1,2!1,8,6!1,7,9:c#ui.unit.Dp,5:c#ui.unit.Dp,4:c#ui.unit.Dp)187@7372L28,188@7440L25,*190@7508L7,210@8141L9,217@8350L29,222@8469L951:Switch.kt#uh7d8r");
        if ((i5 & 14) == 0) {
            i3 = (startRestartGroup.changed((Object) boxScope2) ? 4 : 2) | i5;
        } else {
            i3 = i5;
        }
        if ((i5 & 112) == 0) {
            i3 |= startRestartGroup.changed(z3) ? 32 : 16;
        }
        if ((i5 & 896) == 0) {
            i3 |= startRestartGroup.changed(z4) ? 256 : 128;
        }
        if ((i5 & 7168) == 0) {
            i3 |= startRestartGroup.changed((Object) switchColors2) ? 2048 : 1024;
        }
        if ((57344 & i5) == 0) {
            i3 |= startRestartGroup.changed((Object) state) ? 16384 : 8192;
        } else {
            State<Float> state2 = state;
        }
        if ((i5 & 458752) == 0) {
            i3 |= startRestartGroup.changedInstance(function22) ? 131072 : 65536;
        }
        if ((i5 & 3670016) == 0) {
            i3 |= startRestartGroup.changed((Object) interactionSource2) ? 1048576 : 524288;
        }
        if ((i5 & 29360128) == 0) {
            i3 |= startRestartGroup.changed((Object) shape2) ? 8388608 : 4194304;
        }
        if ((i5 & 234881024) == 0) {
            i3 |= startRestartGroup.changed(f7) ? 67108864 : 33554432;
        }
        if ((i5 & 1879048192) == 0) {
            i3 |= startRestartGroup.changed(f8) ? 536870912 : 268435456;
        }
        if ((i2 & 14) == 0) {
            i4 = i2 | (startRestartGroup.changed(f9) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i3 & 1533916891) == 306783378 && (i4 & 11) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            Function2<? super Composer, ? super Integer, Unit> function23 = function22;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1968109941, i3, i4, "androidx.compose.material3.SwitchImpl (Switch.kt:175)");
            }
            int i6 = ((i3 >> 6) & 14) | (i3 & 112) | ((i3 >> 3) & 896);
            State<Color> trackColor$material3_release = switchColors2.trackColor$material3_release(z4, z3, startRestartGroup, i6);
            State<Boolean> collectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(interactionSource2, startRestartGroup, (i3 >> 18) & 14);
            int i7 = i3;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            float r6 = ((Density) consume).m5603toDpu2uoSUM(state.getValue().floatValue());
            if (SwitchImpl_0DmnUew$lambda$7(collectIsPressedAsState)) {
                f4 = SwitchTokens.INSTANCE.m2321getPressedHandleWidthD9Ej5fM();
            } else {
                f4 = Dp.m5626constructorimpl(Dp.m5626constructorimpl(Dp.m5626constructorimpl(ThumbDiameter - f7) * (Dp.m5626constructorimpl(r6 - f8) / Dp.m5626constructorimpl(f9 - f8))) + f7);
            }
            startRestartGroup.startReplaceableGroup(-993794105);
            ComposerKt.sourceInformation(startRestartGroup, "*199@7849L7");
            if (SwitchImpl_0DmnUew$lambda$7(collectIsPressedAsState)) {
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume2 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density = (Density) consume2;
                if (z3) {
                    f6 = Dp.m5626constructorimpl(ThumbPathLength - SwitchTokens.INSTANCE.m2327getTrackOutlineWidthD9Ej5fM());
                } else {
                    f6 = SwitchTokens.INSTANCE.m2327getTrackOutlineWidthD9Ej5fM();
                }
                f5 = density.m5607toPx0680j_4(f6);
            } else {
                f5 = state.getValue().floatValue();
            }
            startRestartGroup.endReplaceableGroup();
            Shape shape3 = ShapesKt.toShape(SwitchTokens.INSTANCE.getTrackShape(), startRestartGroup, 6);
            Modifier r9 = BackgroundKt.m181backgroundbw27NRU(BorderKt.m192borderxT4_qwU(SizeKt.m549height3ABfNKs(SizeKt.m568width3ABfNKs(boxScope2.align(Modifier.Companion, Alignment.Companion.getCenter()), SwitchWidth), SwitchHeight), SwitchTokens.INSTANCE.m2327getTrackOutlineWidthD9Ej5fM(), switchColors2.borderColor$material3_release(z4, z3, startRestartGroup, i6).getValue().m2831unboximpl(), shape3), SwitchImpl_0DmnUew$lambda$6(trackColor$material3_release), shape3);
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume3 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density2 = (Density) consume3;
            String str = "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh";
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume4 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection = (LayoutDirection) consume4;
            String str2 = "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo";
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume5 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(r9);
            String str3 = "C:CompositionLocal.kt#9igjgp";
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer r11 = Updater.m2444constructorimpl(startRestartGroup);
            Updater.m2451setimpl(r11, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2451setimpl(r11, density2, ComposeUiNode.Companion.getSetDensity());
            Updater.m2451setimpl(r11, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2451setimpl(r11, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1420969751, "C223@8518L28,228@8706L42,231@8870L64,225@8599L815:Switch.kt#uh7d8r");
            long SwitchImpl_0DmnUew$lambda$13$lambda$10 = SwitchImpl_0DmnUew$lambda$13$lambda$10(switchColors2.thumbColor$material3_release(z4, z3, startRestartGroup, i6));
            Modifier align = BoxScopeInstance.INSTANCE.align(Modifier.Companion, Alignment.Companion.getCenterStart());
            Float valueOf = Float.valueOf(f5);
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed((Object) valueOf);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new SwitchKt$SwitchImpl$1$1$1(f5);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            int i8 = i7;
            Modifier r1 = BackgroundKt.m181backgroundbw27NRU(SizeKt.m555requiredSize3ABfNKs(IndicationKt.indication(OffsetKt.offset(align, (Function1) rememberedValue), interactionSource2, RippleKt.m1106rememberRipple9IZ8Weo(false, Dp.m5626constructorimpl(SwitchTokens.INSTANCE.m2325getStateLayerSizeD9Ej5fM() / ((float) 2)), 0, startRestartGroup, 54, 4)), f4), SwitchImpl_0DmnUew$lambda$13$lambda$10, shape2);
            Alignment center = Alignment.Companion.getCenter();
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, str2);
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, str);
            String str4 = str3;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, str4);
            Object consume6 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density3 = (Density) consume6;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, str4);
            Object consume7 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection2 = (LayoutDirection) consume7;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, str4);
            Object consume8 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume8;
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(r1);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer r12 = Updater.m2444constructorimpl(startRestartGroup);
            Updater.m2451setimpl(r12, rememberBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2451setimpl(r12, density3, ComposeUiNode.Companion.getSetDensity());
            Updater.m2451setimpl(r12, layoutDirection2, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2451setimpl(r12, viewConfiguration2, ComposeUiNode.Companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf2.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
            BoxScope boxScope3 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2040677196, "C:Switch.kt#uh7d8r");
            startRestartGroup.startReplaceableGroup(1420970387);
            ComposerKt.sourceInformation(startRestartGroup, "238@9196L27,239@9240L150");
            Function2<? super Composer, ? super Integer, Unit> function24 = function2;
            boolean z5 = z;
            if (function24 != null) {
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(switchColors2.iconColor$material3_release(z4, z5, startRestartGroup, i6).getValue())}, function24, startRestartGroup, ((i8 >> 12) & 112) | 8);
            }
            startRestartGroup.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SwitchKt$SwitchImpl$2(boxScope, z, z2, switchColors, state, function2, interactionSource, shape, f, f2, f3, i, i2));
        }
    }

    static {
        float r0 = SwitchTokens.INSTANCE.m2323getSelectedHandleWidthD9Ej5fM();
        ThumbDiameter = r0;
        float r1 = SwitchTokens.INSTANCE.m2328getTrackWidthD9Ej5fM();
        SwitchWidth = r1;
        float r2 = SwitchTokens.INSTANCE.m2326getTrackHeightD9Ej5fM();
        SwitchHeight = r2;
        float r22 = Dp.m5626constructorimpl(Dp.m5626constructorimpl(r2 - r0) / ((float) 2));
        ThumbPadding = r22;
        ThumbPathLength = Dp.m5626constructorimpl(Dp.m5626constructorimpl(r1 - r0) - r22);
    }

    private static final long SwitchImpl_0DmnUew$lambda$6(State<Color> state) {
        return state.getValue().m2831unboximpl();
    }

    private static final boolean SwitchImpl_0DmnUew$lambda$7(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final long SwitchImpl_0DmnUew$lambda$13$lambda$10(State<Color> state) {
        return state.getValue().m2831unboximpl();
    }
}
