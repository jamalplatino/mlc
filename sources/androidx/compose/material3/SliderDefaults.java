package androidx.compose.material3;

import androidx.compose.material3.tokens.SliderTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JE\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\u0014Jy\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u00162\b\b\u0002\u0010\u001d\u001a\u00020\u00162\b\b\u0002\u0010\u001e\u001a\u00020\u00162\b\b\u0002\u0010\u001f\u001a\u00020\u0016H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\""}, d2 = {"Landroidx/compose/material3/SliderDefaults;", "", "()V", "Thumb", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "modifier", "Landroidx/compose/ui/Modifier;", "colors", "Landroidx/compose/material3/SliderColors;", "enabled", "", "thumbSize", "Landroidx/compose/ui/unit/DpSize;", "Thumb-9LiSoMs", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZJLandroidx/compose/runtime/Composer;II)V", "Track", "sliderPositions", "Landroidx/compose/material3/SliderPositions;", "(Landroidx/compose/material3/SliderPositions;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZLandroidx/compose/runtime/Composer;II)V", "thumbColor", "Landroidx/compose/ui/graphics/Color;", "activeTrackColor", "activeTickColor", "inactiveTrackColor", "inactiveTickColor", "disabledThumbColor", "disabledActiveTrackColor", "disabledActiveTickColor", "disabledInactiveTrackColor", "disabledInactiveTickColor", "colors-q0g_0yA", "(JJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SliderColors;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: Slider.kt */
public final class SliderDefaults {
    public static final int $stable = 0;
    public static final SliderDefaults INSTANCE = new SliderDefaults();

    private SliderDefaults() {
    }

    /* renamed from: colors-q0g_0yA  reason: not valid java name */
    public final SliderColors m1547colorsq0g_0yA(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, Composer composer, int i, int i2, int i3) {
        Composer composer2 = composer;
        int i4 = i3;
        composer2.startReplaceableGroup(885588574);
        ComposerKt.sourceInformation(composer2, "C(colors)P(9:c#ui.graphics.Color,1:c#ui.graphics.Color,0:c#ui.graphics.Color,8:c#ui.graphics.Color,7:c#ui.graphics.Color,6:c#ui.graphics.Color,3:c#ui.graphics.Color,2:c#ui.graphics.Color,5:c#ui.graphics.Color,4:c#ui.graphics.Color)897@37512L9,898@37587L9,900@37687L9,902@37838L9,903@37929L9,906@38096L9,908@38209L11,911@38340L9,914@38521L9,918@38719L9,921@38892L9:Slider.kt#uh7d8r");
        long color = (i4 & 1) != 0 ? ColorSchemeKt.toColor(SliderTokens.INSTANCE.getHandleColor(), composer2, 6) : j;
        long color2 = (i4 & 2) != 0 ? ColorSchemeKt.toColor(SliderTokens.INSTANCE.getActiveTrackColor(), composer2, 6) : j2;
        long r12 = (i4 & 4) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(SliderTokens.INSTANCE.getTickMarksActiveContainerColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j3;
        long color3 = (i4 & 8) != 0 ? ColorSchemeKt.toColor(SliderTokens.INSTANCE.getInactiveTrackColor(), composer2, 6) : j4;
        long r16 = (i4 & 16) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(SliderTokens.INSTANCE.getTickMarksInactiveContainerColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j5;
        long r18 = (i4 & 32) != 0 ? ColorKt.m2866compositeOverOWjLjI(Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(SliderTokens.INSTANCE.getDisabledHandleColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null), MaterialTheme.INSTANCE.getColorScheme(composer2, 6).m1206getSurface0d7_KjU()) : j6;
        long r20 = (i4 & 64) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(SliderTokens.INSTANCE.getDisabledActiveTrackColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j7;
        long r22 = (i4 & 128) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(SliderTokens.INSTANCE.getTickMarksDisabledContainerColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j8;
        long r24 = (i4 & 256) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(SliderTokens.INSTANCE.getDisabledInactiveTrackColor(), composer2, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j9;
        long r26 = (i4 & 512) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(SliderTokens.INSTANCE.getTickMarksDisabledContainerColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j10;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(885588574, i, i2, "androidx.compose.material3.SliderDefaults.colors (Slider.kt:896)");
        }
        SliderColors sliderColors = new SliderColors(color, color2, r12, color3, r16, r18, r20, r22, r24, r26, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return sliderColors;
    }

    /* JADX WARNING: Removed duplicated region for block: B:112:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d6  */
    /* renamed from: Thumb-9LiSoMs  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m1546Thumb9LiSoMs(androidx.compose.foundation.interaction.MutableInteractionSource r39, androidx.compose.ui.Modifier r40, androidx.compose.material3.SliderColors r41, boolean r42, long r43, androidx.compose.runtime.Composer r45, int r46, int r47) {
        /*
            r38 = this;
            r2 = r39
            r8 = r46
            java.lang.String r0 = "interactionSource"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = -290277409(0xffffffffeeb2b7df, float:-2.765531E28)
            r1 = r45
            androidx.compose.runtime.Composer r1 = r1.startRestartGroup(r0)
            java.lang.String r3 = "C(Thumb)P(2,3!,4:c#ui.unit.DpSize)953@40405L8,957@40521L46,958@40610L658,958@40576L692,976@41467L9,983@41669L143,990@42011L19,978@41486L568:Slider.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r3)
            r3 = r47 & 1
            r4 = 2
            if (r3 == 0) goto L_0x0020
            r3 = r8 | 6
            goto L_0x0030
        L_0x0020:
            r3 = r8 & 14
            if (r3 != 0) goto L_0x002f
            boolean r3 = r1.changed((java.lang.Object) r2)
            if (r3 == 0) goto L_0x002c
            r3 = 4
            goto L_0x002d
        L_0x002c:
            r3 = r4
        L_0x002d:
            r3 = r3 | r8
            goto L_0x0030
        L_0x002f:
            r3 = r8
        L_0x0030:
            r5 = r47 & 2
            if (r5 == 0) goto L_0x0037
            r3 = r3 | 48
            goto L_0x004a
        L_0x0037:
            r6 = r8 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x004a
            r6 = r40
            boolean r7 = r1.changed((java.lang.Object) r6)
            if (r7 == 0) goto L_0x0046
            r7 = 32
            goto L_0x0048
        L_0x0046:
            r7 = 16
        L_0x0048:
            r3 = r3 | r7
            goto L_0x004c
        L_0x004a:
            r6 = r40
        L_0x004c:
            r7 = r8 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0065
            r7 = r47 & 4
            if (r7 != 0) goto L_0x005f
            r7 = r41
            boolean r9 = r1.changed((java.lang.Object) r7)
            if (r9 == 0) goto L_0x0061
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x005f:
            r7 = r41
        L_0x0061:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r3 = r3 | r9
            goto L_0x0067
        L_0x0065:
            r7 = r41
        L_0x0067:
            r34 = r47 & 8
            if (r34 == 0) goto L_0x006e
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0081
        L_0x006e:
            r9 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x0081
            r9 = r42
            boolean r10 = r1.changed((boolean) r9)
            if (r10 == 0) goto L_0x007d
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x007f
        L_0x007d:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x007f:
            r3 = r3 | r10
            goto L_0x0083
        L_0x0081:
            r9 = r42
        L_0x0083:
            r35 = r47 & 16
            if (r35 == 0) goto L_0x008c
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            r14 = r43
            goto L_0x00a0
        L_0x008c:
            r10 = 57344(0xe000, float:8.0356E-41)
            r10 = r10 & r8
            r14 = r43
            if (r10 != 0) goto L_0x00a0
            boolean r10 = r1.changed((long) r14)
            if (r10 == 0) goto L_0x009d
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009f
        L_0x009d:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x009f:
            r3 = r3 | r10
        L_0x00a0:
            r10 = r47 & 32
            if (r10 == 0) goto L_0x00aa
            r10 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r10
            r12 = r38
            goto L_0x00bd
        L_0x00aa:
            r10 = 458752(0x70000, float:6.42848E-40)
            r10 = r10 & r8
            r12 = r38
            if (r10 != 0) goto L_0x00bd
            boolean r10 = r1.changed((java.lang.Object) r12)
            if (r10 == 0) goto L_0x00ba
            r10 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bc
        L_0x00ba:
            r10 = 65536(0x10000, float:9.18355E-41)
        L_0x00bc:
            r3 = r3 | r10
        L_0x00bd:
            r10 = 374491(0x5b6db, float:5.24774E-40)
            r10 = r10 & r3
            r11 = 74898(0x12492, float:1.04954E-40)
            if (r10 != r11) goto L_0x00d6
            boolean r10 = r1.getSkipping()
            if (r10 != 0) goto L_0x00cd
            goto L_0x00d6
        L_0x00cd:
            r1.skipToGroupEnd()
            r3 = r6
            r4 = r7
            r5 = r9
            r6 = r14
            goto L_0x0242
        L_0x00d6:
            r1.startDefaults()
            r10 = r8 & 1
            r36 = 1
            if (r10 == 0) goto L_0x00f1
            boolean r10 = r1.getDefaultsInvalid()
            if (r10 == 0) goto L_0x00e6
            goto L_0x00f1
        L_0x00e6:
            r1.skipToGroupEnd()
            r5 = r47 & 4
            if (r5 == 0) goto L_0x00ef
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00ef:
            r5 = r9
            goto L_0x0134
        L_0x00f1:
            if (r5 == 0) goto L_0x00f8
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r5 = (androidx.compose.ui.Modifier) r5
            r6 = r5
        L_0x00f8:
            r5 = r47 & 4
            if (r5 == 0) goto L_0x0123
            r10 = 0
            r16 = 0
            r12 = r16
            r14 = r16
            r18 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r28 = 0
            r31 = 0
            int r5 = r3 >> 15
            r32 = r5 & 14
            r33 = 1023(0x3ff, float:1.434E-42)
            r9 = r38
            r30 = r1
            androidx.compose.material3.SliderColors r5 = r9.m1547colorsq0g_0yA(r10, r12, r14, r16, r18, r20, r22, r24, r26, r28, r30, r31, r32, r33)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
            r7 = r5
        L_0x0123:
            if (r34 == 0) goto L_0x0128
            r5 = r36
            goto L_0x012a
        L_0x0128:
            r5 = r42
        L_0x012a:
            if (r35 == 0) goto L_0x0132
            long r9 = androidx.compose.material3.SliderKt.ThumbSize
            r14 = r9
            goto L_0x0134
        L_0x0132:
            r14 = r43
        L_0x0134:
            r1.endDefaults()
            boolean r9 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r9 == 0) goto L_0x0144
            r9 = -1
            java.lang.String r10 = "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:950)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r3, r9, r10)
        L_0x0144:
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r1.startReplaceableGroup(r0)
            java.lang.String r0 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r0)
            java.lang.Object r0 = r1.rememberedValue()
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r9 = r9.getEmpty()
            if (r0 != r9) goto L_0x0162
            androidx.compose.runtime.snapshots.SnapshotStateList r0 = androidx.compose.runtime.SnapshotStateKt.mutableStateListOf()
            r1.updateRememberedValue(r0)
        L_0x0162:
            r1.endReplaceableGroup()
            androidx.compose.runtime.snapshots.SnapshotStateList r0 = (androidx.compose.runtime.snapshots.SnapshotStateList) r0
            r9 = r3 & 14
            r10 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r1.startReplaceableGroup(r10)
            java.lang.String r10 = "CC(remember)P(1,2):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r10)
            boolean r10 = r1.changed((java.lang.Object) r2)
            boolean r11 = r1.changed((java.lang.Object) r0)
            r10 = r10 | r11
            java.lang.Object r11 = r1.rememberedValue()
            r13 = 0
            if (r10 != 0) goto L_0x018c
            androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r10 = r10.getEmpty()
            if (r11 != r10) goto L_0x0197
        L_0x018c:
            androidx.compose.material3.SliderDefaults$Thumb$1$1 r10 = new androidx.compose.material3.SliderDefaults$Thumb$1$1
            r10.<init>(r2, r0, r13)
            r11 = r10
            kotlin.jvm.functions.Function2 r11 = (kotlin.jvm.functions.Function2) r11
            r1.updateRememberedValue(r11)
        L_0x0197:
            r1.endReplaceableGroup()
            kotlin.jvm.functions.Function2 r11 = (kotlin.jvm.functions.Function2) r11
            r9 = r9 | 64
            androidx.compose.runtime.EffectsKt.LaunchedEffect((java.lang.Object) r2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) r11, (androidx.compose.runtime.Composer) r1, (int) r9)
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01b0
            float r0 = androidx.compose.material3.SliderKt.ThumbPressedElevation
            goto L_0x01b4
        L_0x01b0:
            float r0 = androidx.compose.material3.SliderKt.ThumbDefaultElevation
        L_0x01b4:
            androidx.compose.material3.tokens.SliderTokens r9 = androidx.compose.material3.tokens.SliderTokens.INSTANCE
            androidx.compose.material3.tokens.ShapeKeyTokens r9 = r9.getHandleShape()
            r10 = 6
            androidx.compose.ui.graphics.Shape r11 = androidx.compose.material3.ShapesKt.toShape(r9, r1, r10)
            androidx.compose.ui.Modifier r12 = androidx.compose.foundation.layout.SizeKt.m564size6HolHcs(r6, r14)
            r10 = r2
            androidx.compose.foundation.interaction.InteractionSource r10 = (androidx.compose.foundation.interaction.InteractionSource) r10
            r9 = 0
            androidx.compose.material3.tokens.SliderTokens r16 = androidx.compose.material3.tokens.SliderTokens.INSTANCE
            float r16 = r16.m2301getStateLayerSizeD9Ej5fM()
            float r13 = (float) r4
            float r16 = r16 / r13
            float r13 = androidx.compose.ui.unit.Dp.m5626constructorimpl(r16)
            r16 = 0
            r18 = 54
            r19 = 4
            r4 = r10
            r10 = r13
            r13 = r11
            r37 = r12
            r11 = r16
            r41 = r13
            r13 = r1
            r26 = r14
            r14 = r18
            r15 = r19
            androidx.compose.foundation.Indication r9 = androidx.compose.material.ripple.RippleKt.m1106rememberRipple9IZ8Weo(r9, r10, r11, r13, r14, r15)
            r10 = r37
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.IndicationKt.indication(r10, r4, r9)
            r9 = 0
            r10 = 0
            r11 = 2
            androidx.compose.ui.Modifier r16 = androidx.compose.foundation.HoverableKt.hoverable$default(r4, r2, r9, r11, r10)
            if (r5 == 0) goto L_0x01fe
            goto L_0x0203
        L_0x01fe:
            float r0 = (float) r9
            float r0 = androidx.compose.ui.unit.Dp.m5626constructorimpl(r0)
        L_0x0203:
            r17 = r0
            r19 = 0
            r20 = 0
            r22 = 0
            r24 = 24
            r25 = 0
            r18 = r41
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.draw.ShadowKt.m2489shadows4CzXII$default(r16, r17, r18, r19, r20, r22, r24, r25)
            int r4 = r3 >> 9
            r4 = r4 & 14
            int r3 = r3 >> 3
            r3 = r3 & 112(0x70, float:1.57E-43)
            r3 = r3 | r4
            androidx.compose.runtime.State r3 = r7.thumbColor$material3_release(r5, r1, r3)
            java.lang.Object r3 = r3.getValue()
            androidx.compose.ui.graphics.Color r3 = (androidx.compose.ui.graphics.Color) r3
            long r3 = r3.m2831unboximpl()
            r10 = r41
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.BackgroundKt.m181backgroundbw27NRU(r0, r3, r10)
            androidx.compose.foundation.layout.SpacerKt.Spacer(r0, r1, r9)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x023e
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x023e:
            r3 = r6
            r4 = r7
            r6 = r26
        L_0x0242:
            androidx.compose.runtime.ScopeUpdateScope r10 = r1.endRestartGroup()
            if (r10 != 0) goto L_0x0249
            goto L_0x025c
        L_0x0249:
            androidx.compose.material3.SliderDefaults$Thumb$2 r11 = new androidx.compose.material3.SliderDefaults$Thumb$2
            r0 = r11
            r1 = r38
            r2 = r39
            r8 = r46
            r9 = r47
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r9)
            kotlin.jvm.functions.Function2 r11 = (kotlin.jvm.functions.Function2) r11
            r10.updateScope(r11)
        L_0x025c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderDefaults.m1546Thumb9LiSoMs(androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.Modifier, androidx.compose.material3.SliderColors, boolean, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Track(androidx.compose.material3.SliderPositions r35, androidx.compose.ui.Modifier r36, androidx.compose.material3.SliderColors r37, boolean r38, androidx.compose.runtime.Composer r39, int r40, int r41) {
        /*
            r34 = this;
            r6 = r35
            r7 = r40
            java.lang.String r0 = "sliderPositions"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = -1546713545(0xffffffffa3cf0637, float:-2.2445617E-17)
            r1 = r39
            androidx.compose.runtime.Composer r5 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(Track)P(3,2)1010@42874L8,1013@42965L35,1014@43039L34,1015@43113L34,1016@43185L33,1020@43314L1884,1017@43227L1971:Slider.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r5, r1)
            r1 = r41 & 1
            if (r1 == 0) goto L_0x001f
            r1 = r7 | 6
            goto L_0x002f
        L_0x001f:
            r1 = r7 & 14
            if (r1 != 0) goto L_0x002e
            boolean r1 = r5.changed((java.lang.Object) r6)
            if (r1 == 0) goto L_0x002b
            r1 = 4
            goto L_0x002c
        L_0x002b:
            r1 = 2
        L_0x002c:
            r1 = r1 | r7
            goto L_0x002f
        L_0x002e:
            r1 = r7
        L_0x002f:
            r2 = r41 & 2
            if (r2 == 0) goto L_0x0036
            r1 = r1 | 48
            goto L_0x0049
        L_0x0036:
            r3 = r7 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0049
            r3 = r36
            boolean r4 = r5.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x0045
            r4 = 32
            goto L_0x0047
        L_0x0045:
            r4 = 16
        L_0x0047:
            r1 = r1 | r4
            goto L_0x004b
        L_0x0049:
            r3 = r36
        L_0x004b:
            r4 = r7 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0064
            r4 = r41 & 4
            if (r4 != 0) goto L_0x005e
            r4 = r37
            boolean r8 = r5.changed((java.lang.Object) r4)
            if (r8 == 0) goto L_0x0060
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x005e:
            r4 = r37
        L_0x0060:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r1 = r1 | r8
            goto L_0x0066
        L_0x0064:
            r4 = r37
        L_0x0066:
            r33 = r41 & 8
            if (r33 == 0) goto L_0x006d
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0080
        L_0x006d:
            r8 = r7 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0080
            r8 = r38
            boolean r9 = r5.changed((boolean) r8)
            if (r9 == 0) goto L_0x007c
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x007e
        L_0x007c:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x007e:
            r1 = r1 | r9
            goto L_0x0082
        L_0x0080:
            r8 = r38
        L_0x0082:
            r9 = r41 & 16
            if (r9 == 0) goto L_0x008b
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            r15 = r34
            goto L_0x009f
        L_0x008b:
            r9 = 57344(0xe000, float:8.0356E-41)
            r9 = r9 & r7
            r15 = r34
            if (r9 != 0) goto L_0x009f
            boolean r9 = r5.changed((java.lang.Object) r15)
            if (r9 == 0) goto L_0x009c
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009c:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r1 = r1 | r9
        L_0x009f:
            r9 = 46811(0xb6db, float:6.5596E-41)
            r9 = r9 & r1
            r10 = 9362(0x2492, float:1.3119E-41)
            if (r9 != r10) goto L_0x00b5
            boolean r9 = r5.getSkipping()
            if (r9 != 0) goto L_0x00ae
            goto L_0x00b5
        L_0x00ae:
            r5.skipToGroupEnd()
            r15 = r5
            r5 = r8
            goto L_0x019b
        L_0x00b5:
            r5.startDefaults()
            r9 = r7 & 1
            r13 = 1
            if (r9 == 0) goto L_0x00d1
            boolean r9 = r5.getDefaultsInvalid()
            if (r9 == 0) goto L_0x00c4
            goto L_0x00d1
        L_0x00c4:
            r5.skipToGroupEnd()
            r2 = r41 & 4
            if (r2 == 0) goto L_0x00cd
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00cd:
            r9 = r4
            r10 = r8
            r8 = r3
            goto L_0x010f
        L_0x00d1:
            if (r2 == 0) goto L_0x00d8
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r2 = (androidx.compose.ui.Modifier) r2
            goto L_0x00d9
        L_0x00d8:
            r2 = r3
        L_0x00d9:
            r3 = r41 & 4
            if (r3 == 0) goto L_0x0104
            r9 = 0
            r11 = 0
            r3 = 0
            r13 = r3
            r15 = r3
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r30 = 0
            int r3 = r1 >> 12
            r31 = r3 & 14
            r32 = 1023(0x3ff, float:1.434E-42)
            r8 = r34
            r29 = r5
            androidx.compose.material3.SliderColors r3 = r8.m1547colorsq0g_0yA(r9, r11, r13, r15, r17, r19, r21, r23, r25, r27, r29, r30, r31, r32)
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x0105
        L_0x0104:
            r3 = r4
        L_0x0105:
            if (r33 == 0) goto L_0x010b
            r8 = r2
            r9 = r3
            r10 = 1
            goto L_0x010f
        L_0x010b:
            r10 = r38
            r8 = r2
            r9 = r3
        L_0x010f:
            r5.endDefaults()
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x011f
            r2 = -1
            java.lang.String r3 = "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1007)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r1, r2, r3)
        L_0x011f:
            int r0 = r1 >> 9
            r0 = r0 & 14
            r0 = r0 | 48
            r1 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            r11 = 0
            androidx.compose.runtime.State r1 = r9.trackColor$material3_release(r10, r11, r5, r0)
            r2 = 1
            androidx.compose.runtime.State r3 = r9.trackColor$material3_release(r10, r2, r5, r0)
            androidx.compose.runtime.State r4 = r9.tickColor$material3_release(r10, r11, r5, r0)
            androidx.compose.runtime.State r12 = r9.tickColor$material3_release(r10, r2, r5, r0)
            r0 = 0
            r13 = 0
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(r8, r0, r2, r13)
            float r2 = androidx.compose.material3.SliderKt.getTrackHeight()
            androidx.compose.ui.Modifier r13 = androidx.compose.foundation.layout.SizeKt.m549height3ABfNKs(r0, r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r6, r3, r4, r12}
            r2 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r5.startReplaceableGroup(r2)
            java.lang.String r2 = "CC(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r5, r2)
            r2 = r11
            r14 = r2
        L_0x0159:
            r15 = 5
            if (r2 >= r15) goto L_0x0166
            r15 = r0[r2]
            boolean r15 = r5.changed((java.lang.Object) r15)
            r14 = r14 | r15
            int r2 = r2 + 1
            goto L_0x0159
        L_0x0166:
            java.lang.Object r0 = r5.rememberedValue()
            if (r14 != 0) goto L_0x0177
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r0 != r2) goto L_0x0175
            goto L_0x0177
        L_0x0175:
            r15 = r5
            goto L_0x0187
        L_0x0177:
            androidx.compose.material3.SliderDefaults$Track$1$1 r14 = new androidx.compose.material3.SliderDefaults$Track$1$1
            r0 = r14
            r2 = r35
            r15 = r5
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = r14
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r15.updateRememberedValue(r0)
        L_0x0187:
            r15.endReplaceableGroup()
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            androidx.compose.foundation.CanvasKt.Canvas(r13, r0, r15, r11)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0198
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0198:
            r3 = r8
            r4 = r9
            r5 = r10
        L_0x019b:
            androidx.compose.runtime.ScopeUpdateScope r8 = r15.endRestartGroup()
            if (r8 != 0) goto L_0x01a2
            goto L_0x01b5
        L_0x01a2:
            androidx.compose.material3.SliderDefaults$Track$2 r9 = new androidx.compose.material3.SliderDefaults$Track$2
            r0 = r9
            r1 = r34
            r2 = r35
            r6 = r40
            r7 = r41
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
            r8.updateScope(r9)
        L_0x01b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderDefaults.Track(androidx.compose.material3.SliderPositions, androidx.compose.ui.Modifier, androidx.compose.material3.SliderColors, boolean, androidx.compose.runtime.Composer, int, int):void");
    }
}
