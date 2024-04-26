package androidx.compose.material3;

import androidx.compose.material.ripple.RippleAlpha;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a>\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00050\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0002\u0010\u000f\u001a\u0015\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\u0012\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003XT¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"DefaultRippleAlpha", "Landroidx/compose/material/ripple/RippleAlpha;", "TextSelectionBackgroundOpacity", "", "MaterialTheme", "", "colorScheme", "Landroidx/compose/material3/ColorScheme;", "shapes", "Landroidx/compose/material3/Shapes;", "typography", "Landroidx/compose/material3/Typography;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/Shapes;Landroidx/compose/material3/Typography;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "rememberTextSelectionColors", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/text/selection/TextSelectionColors;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: MaterialTheme.kt */
public final class MaterialThemeKt {
    /* access modifiers changed from: private */
    public static final RippleAlpha DefaultRippleAlpha = new RippleAlpha(0.16f, 0.12f, 0.08f, 0.12f);
    public static final float TextSelectionBackgroundOpacity = 0.4f;

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00b5, code lost:
        if ((r84 & 4) != 0) goto L_0x00da;
     */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void MaterialTheme(androidx.compose.material3.ColorScheme r78, androidx.compose.material3.Shapes r79, androidx.compose.material3.Typography r80, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r81, androidx.compose.runtime.Composer r82, int r83, int r84) {
        /*
            r4 = r81
            r5 = r83
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = -2127166334(0xffffffff81360482, float:-3.3431355E-38)
            r1 = r82
            androidx.compose.runtime.Composer r1 = r1.startRestartGroup(r0)
            java.lang.String r2 = "C(MaterialTheme)P(!1,2,3)58@2824L11,59@2872L6,60@2923L10,*63@3007L194,70@3286L16,71@3329L50,72@3384L417:MaterialTheme.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r2)
            r2 = r5 & 14
            r3 = 4
            r13 = 2
            if (r2 != 0) goto L_0x0031
            r2 = r84 & 1
            if (r2 != 0) goto L_0x002c
            r2 = r78
            boolean r6 = r1.changed((java.lang.Object) r2)
            if (r6 == 0) goto L_0x002e
            r6 = r3
            goto L_0x002f
        L_0x002c:
            r2 = r78
        L_0x002e:
            r6 = r13
        L_0x002f:
            r6 = r6 | r5
            goto L_0x0034
        L_0x0031:
            r2 = r78
            r6 = r5
        L_0x0034:
            r7 = r5 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x004d
            r7 = r84 & 2
            if (r7 != 0) goto L_0x0047
            r7 = r79
            boolean r8 = r1.changed((java.lang.Object) r7)
            if (r8 == 0) goto L_0x0049
            r8 = 32
            goto L_0x004b
        L_0x0047:
            r7 = r79
        L_0x0049:
            r8 = 16
        L_0x004b:
            r6 = r6 | r8
            goto L_0x004f
        L_0x004d:
            r7 = r79
        L_0x004f:
            r8 = r5 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x0068
            r8 = r84 & 4
            if (r8 != 0) goto L_0x0062
            r8 = r80
            boolean r9 = r1.changed((java.lang.Object) r8)
            if (r9 == 0) goto L_0x0064
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0062:
            r8 = r80
        L_0x0064:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r6 = r6 | r9
            goto L_0x006a
        L_0x0068:
            r8 = r80
        L_0x006a:
            r9 = r84 & 8
            if (r9 == 0) goto L_0x0071
            r6 = r6 | 3072(0xc00, float:4.305E-42)
            goto L_0x0081
        L_0x0071:
            r9 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x0081
            boolean r9 = r1.changedInstance(r4)
            if (r9 == 0) goto L_0x007e
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007e:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r6 = r6 | r9
        L_0x0081:
            r9 = r6 & 5851(0x16db, float:8.199E-42)
            r10 = 1170(0x492, float:1.64E-42)
            if (r9 != r10) goto L_0x0095
            boolean r9 = r1.getSkipping()
            if (r9 != 0) goto L_0x008e
            goto L_0x0095
        L_0x008e:
            r1.skipToGroupEnd()
            r15 = r7
        L_0x0092:
            r3 = r8
            goto L_0x01d3
        L_0x0095:
            r1.startDefaults()
            r9 = r5 & 1
            r14 = 6
            if (r9 == 0) goto L_0x00b8
            boolean r9 = r1.getDefaultsInvalid()
            if (r9 == 0) goto L_0x00a4
            goto L_0x00b8
        L_0x00a4:
            r1.skipToGroupEnd()
            r9 = r84 & 1
            if (r9 == 0) goto L_0x00ad
            r6 = r6 & -15
        L_0x00ad:
            r9 = r84 & 2
            if (r9 == 0) goto L_0x00b3
            r6 = r6 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00b3:
            r9 = r84 & 4
            if (r9 == 0) goto L_0x00dc
            goto L_0x00da
        L_0x00b8:
            r9 = r84 & 1
            if (r9 == 0) goto L_0x00c4
            androidx.compose.material3.MaterialTheme r2 = androidx.compose.material3.MaterialTheme.INSTANCE
            androidx.compose.material3.ColorScheme r2 = r2.getColorScheme(r1, r14)
            r6 = r6 & -15
        L_0x00c4:
            r9 = r84 & 2
            if (r9 == 0) goto L_0x00d0
            androidx.compose.material3.MaterialTheme r7 = androidx.compose.material3.MaterialTheme.INSTANCE
            androidx.compose.material3.Shapes r7 = r7.getShapes(r1, r14)
            r6 = r6 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00d0:
            r9 = r84 & 4
            if (r9 == 0) goto L_0x00dc
            androidx.compose.material3.MaterialTheme r8 = androidx.compose.material3.MaterialTheme.INSTANCE
            androidx.compose.material3.Typography r8 = r8.getTypography(r1, r14)
        L_0x00da:
            r6 = r6 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00dc:
            r10 = r6
            r12 = r7
            r11 = r8
            r1.endDefaults()
            boolean r6 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r6 == 0) goto L_0x00ef
            r6 = -1
            java.lang.String r7 = "androidx.compose.material3.MaterialTheme (MaterialTheme.kt:57)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r10, r6, r7)
        L_0x00ef:
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r1.startReplaceableGroup(r0)
            java.lang.String r0 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r0)
            java.lang.Object r0 = r1.rememberedValue()
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r6 = r6.getEmpty()
            if (r0 != r6) goto L_0x014d
            r16 = 0
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
            r42 = 0
            r44 = 0
            r46 = 0
            r48 = 0
            r50 = 0
            r52 = 0
            r54 = 0
            r56 = 0
            r58 = 0
            r60 = 0
            r62 = 0
            r64 = 0
            r66 = 0
            r68 = 0
            r70 = 0
            r72 = 0
            r74 = 536870911(0x1fffffff, float:1.0842021E-19)
            r75 = 0
            r15 = r2
            androidx.compose.material3.ColorScheme r0 = androidx.compose.material3.ColorScheme.m1180copyG1PFcw$default(r15, r16, r18, r20, r22, r24, r26, r28, r30, r32, r34, r36, r38, r40, r42, r44, r46, r48, r50, r52, r54, r56, r58, r60, r62, r64, r66, r68, r70, r72, r74, r75)
            r1.updateRememberedValue(r0)
        L_0x014d:
            r1.endReplaceableGroup()
            androidx.compose.material3.ColorScheme r0 = (androidx.compose.material3.ColorScheme) r0
            androidx.compose.material3.ColorSchemeKt.updateColorSchemeFrom(r0, r2)
            r6 = 0
            r7 = 0
            r8 = 0
            r15 = 0
            r16 = 7
            r76 = r10
            r10 = r1
            r77 = r11
            r11 = r15
            r15 = r12
            r12 = r16
            androidx.compose.foundation.Indication r6 = androidx.compose.material.ripple.RippleKt.m1106rememberRipple9IZ8Weo(r6, r7, r8, r10, r11, r12)
            r7 = 0
            androidx.compose.foundation.text.selection.TextSelectionColors r8 = rememberTextSelectionColors(r0, r1, r7)
            androidx.compose.runtime.ProvidedValue[] r9 = new androidx.compose.runtime.ProvidedValue[r14]
            androidx.compose.runtime.ProvidableCompositionLocal r10 = androidx.compose.material3.ColorSchemeKt.getLocalColorScheme()
            androidx.compose.runtime.ProvidedValue r0 = r10.provides(r0)
            r9[r7] = r0
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.foundation.IndicationKt.getLocalIndication()
            androidx.compose.runtime.ProvidedValue r0 = r0.provides(r6)
            r6 = 1
            r9[r6] = r0
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.material.ripple.RippleThemeKt.getLocalRippleTheme()
            androidx.compose.material3.MaterialRippleTheme r7 = androidx.compose.material3.MaterialRippleTheme.INSTANCE
            androidx.compose.runtime.ProvidedValue r0 = r0.provides(r7)
            r9[r13] = r0
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.material3.ShapesKt.getLocalShapes()
            androidx.compose.runtime.ProvidedValue r0 = r0.provides(r15)
            r7 = 3
            r9[r7] = r0
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.foundation.text.selection.TextSelectionColorsKt.getLocalTextSelectionColors()
            androidx.compose.runtime.ProvidedValue r0 = r0.provides(r8)
            r9[r3] = r0
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.material3.TypographyKt.getLocalTypography()
            r8 = r77
            androidx.compose.runtime.ProvidedValue r0 = r0.provides(r8)
            r3 = 5
            r9[r3] = r0
            androidx.compose.material3.MaterialThemeKt$MaterialTheme$1 r0 = new androidx.compose.material3.MaterialThemeKt$MaterialTheme$1
            r3 = r76
            r0.<init>(r8, r4, r3)
            r3 = -1066563262(0xffffffffc06d8942, float:-3.7115026)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r1, r3, r6, r0)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r3 = 56
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) r9, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) r0, (androidx.compose.runtime.Composer) r1, (int) r3)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0092
            androidx.compose.runtime.ComposerKt.traceEventEnd()
            goto L_0x0092
        L_0x01d3:
            androidx.compose.runtime.ScopeUpdateScope r7 = r1.endRestartGroup()
            if (r7 != 0) goto L_0x01da
            goto L_0x01ed
        L_0x01da:
            androidx.compose.material3.MaterialThemeKt$MaterialTheme$2 r8 = new androidx.compose.material3.MaterialThemeKt$MaterialTheme$2
            r0 = r8
            r1 = r2
            r2 = r15
            r4 = r81
            r5 = r83
            r6 = r84
            r0.<init>(r1, r2, r3, r4, r5, r6)
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            r7.updateScope(r8)
        L_0x01ed:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.MaterialThemeKt.MaterialTheme(androidx.compose.material3.ColorScheme, androidx.compose.material3.Shapes, androidx.compose.material3.Typography, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: androidx.compose.foundation.text.selection.TextSelectionColors} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: androidx.compose.foundation.text.selection.TextSelectionColors} */
    /* JADX WARNING: type inference failed for: r13v4 */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0041, code lost:
        if (r13 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L_0x0043;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.foundation.text.selection.TextSelectionColors rememberTextSelectionColors(androidx.compose.material3.ColorScheme r11, androidx.compose.runtime.Composer r12, int r13) {
        /*
            java.lang.String r0 = "colorScheme"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = 1866455512(0x6f3fd9d8, float:5.9374994E28)
            r12.startReplaceableGroup(r0)
            java.lang.String r1 = "C(rememberTextSelectionColors)134@5274L198:MaterialTheme.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r12, r1)
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x001e
            r1 = -1
            java.lang.String r2 = "androidx.compose.material3.rememberTextSelectionColors (MaterialTheme.kt:132)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r13, r1, r2)
        L_0x001e:
            long r0 = r11.m1201getPrimary0d7_KjU()
            androidx.compose.ui.graphics.Color r11 = androidx.compose.ui.graphics.Color.m2811boximpl(r0)
            r13 = 1157296644(0x44faf204, float:2007.563)
            r12.startReplaceableGroup(r13)
            java.lang.String r13 = "CC(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r12, r13)
            boolean r11 = r12.changed((java.lang.Object) r11)
            java.lang.Object r13 = r12.rememberedValue()
            if (r11 != 0) goto L_0x0043
            androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r11 = r11.getEmpty()
            if (r13 != r11) goto L_0x005c
        L_0x0043:
            androidx.compose.foundation.text.selection.TextSelectionColors r13 = new androidx.compose.foundation.text.selection.TextSelectionColors
            r5 = 1053609165(0x3ecccccd, float:0.4)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 14
            r10 = 0
            r3 = r0
            long r6 = androidx.compose.ui.graphics.Color.m2820copywmQWz5c$default(r3, r5, r6, r7, r8, r9, r10)
            r8 = 0
            r3 = r13
            r4 = r0
            r3.<init>(r4, r6, r8)
            r12.updateRememberedValue(r13)
        L_0x005c:
            r12.endReplaceableGroup()
            androidx.compose.foundation.text.selection.TextSelectionColors r13 = (androidx.compose.foundation.text.selection.TextSelectionColors) r13
            boolean r11 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r11 == 0) goto L_0x006a
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x006a:
            r12.endReplaceableGroup()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.MaterialThemeKt.rememberTextSelectionColors(androidx.compose.material3.ColorScheme, androidx.compose.runtime.Composer, int):androidx.compose.foundation.text.selection.TextSelectionColors");
    }
}
