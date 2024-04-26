package androidx.compose.ui.text.platform.extensions;

import android.graphics.Typeface;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000`\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a9\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u001aS\u0010\u000f\u001a\u0004\u0018\u00010\u0004*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00042&\u0010\u0012\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00132\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0000ø\u0001\u0001\u001a\f\u0010\u001b\u001a\u00020\b*\u00020\u0004H\u0000\u001a\u0016\u0010\u001c\u001a\u00020\u001d*\u00020\u00102\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0000\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006 "}, d2 = {"correctBlurRadius", "", "blurRadius", "generateFallbackSpanStyle", "Landroidx/compose/ui/text/SpanStyle;", "letterSpacing", "Landroidx/compose/ui/unit/TextUnit;", "requiresLetterSpacing", "", "background", "Landroidx/compose/ui/graphics/Color;", "baselineShift", "Landroidx/compose/ui/text/style/BaselineShift;", "generateFallbackSpanStyle-62GTOB8", "(JZJLandroidx/compose/ui/text/style/BaselineShift;)Landroidx/compose/ui/text/SpanStyle;", "applySpanStyle", "Landroidx/compose/ui/text/platform/AndroidTextPaint;", "style", "resolveTypeface", "Lkotlin/Function4;", "Landroidx/compose/ui/text/font/FontFamily;", "Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "Landroidx/compose/ui/text/font/FontSynthesis;", "Landroid/graphics/Typeface;", "density", "Landroidx/compose/ui/unit/Density;", "hasFontAttributes", "setTextMotion", "", "textMotion", "Landroidx/compose/ui/text/style/TextMotion;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: TextPaintExtensions.android.kt */
public final class TextPaintExtensions_androidKt {
    public static final float correctBlurRadius(float f) {
        if (f == 0.0f) {
            return Float.MIN_VALUE;
        }
        return f;
    }

    public static /* synthetic */ SpanStyle applySpanStyle$default(AndroidTextPaint androidTextPaint, SpanStyle spanStyle, Function4 function4, Density density, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return applySpanStyle(androidTextPaint, spanStyle, function4, density, z);
    }

    public static final SpanStyle applySpanStyle(AndroidTextPaint androidTextPaint, SpanStyle spanStyle, Function4<? super FontFamily, ? super FontWeight, ? super FontStyle, ? super FontSynthesis, ? extends Typeface> function4, Density density, boolean z) {
        Intrinsics.checkNotNullParameter(androidTextPaint, "<this>");
        Intrinsics.checkNotNullParameter(spanStyle, "style");
        Intrinsics.checkNotNullParameter(function4, "resolveTypeface");
        Intrinsics.checkNotNullParameter(density, "density");
        long r0 = TextUnit.m5806getTypeUIouoOA(spanStyle.m5092getFontSizeXSAIIZE());
        if (TextUnitType.m5835equalsimpl0(r0, TextUnitType.Companion.m5840getSpUIouoOA())) {
            androidTextPaint.setTextSize(density.m5606toPxR2X_6o(spanStyle.m5092getFontSizeXSAIIZE()));
        } else if (TextUnitType.m5835equalsimpl0(r0, TextUnitType.Companion.m5839getEmUIouoOA())) {
            androidTextPaint.setTextSize(androidTextPaint.getTextSize() * TextUnit.m5807getValueimpl(spanStyle.m5092getFontSizeXSAIIZE()));
        }
        if (hasFontAttributes(spanStyle)) {
            FontFamily fontFamily = spanStyle.getFontFamily();
            FontWeight fontWeight = spanStyle.getFontWeight();
            if (fontWeight == null) {
                fontWeight = FontWeight.Companion.getNormal();
            }
            FontStyle r2 = spanStyle.m5093getFontStyle4Lr2A7w();
            FontStyle r22 = FontStyle.m5217boximpl(r2 != null ? r2.m5223unboximpl() : FontStyle.Companion.m5225getNormal_LCdwA());
            FontSynthesis r3 = spanStyle.m5094getFontSynthesisZQGJjVo();
            androidTextPaint.setTypeface((Typeface) function4.invoke(fontFamily, fontWeight, r22, FontSynthesis.m5226boximpl(r3 != null ? r3.m5234unboximpl() : FontSynthesis.Companion.m5235getAllGVVA2EU())));
        }
        if (spanStyle.getLocaleList() != null && !Intrinsics.areEqual((Object) spanStyle.getLocaleList(), (Object) LocaleList.Companion.getCurrent())) {
            LocaleListHelperMethods.INSTANCE.setTextLocales(androidTextPaint, spanStyle.getLocaleList());
        }
        if (spanStyle.getFontFeatureSettings() != null && !Intrinsics.areEqual((Object) spanStyle.getFontFeatureSettings(), (Object) "")) {
            androidTextPaint.setFontFeatureSettings(spanStyle.getFontFeatureSettings());
        }
        if (spanStyle.getTextGeometricTransform() != null && !Intrinsics.areEqual((Object) spanStyle.getTextGeometricTransform(), (Object) TextGeometricTransform.Companion.getNone$ui_text_release())) {
            androidTextPaint.setTextScaleX(androidTextPaint.getTextScaleX() * spanStyle.getTextGeometricTransform().getScaleX());
            androidTextPaint.setTextSkewX(androidTextPaint.getTextSkewX() + spanStyle.getTextGeometricTransform().getSkewX());
        }
        androidTextPaint.m5373setColor8_81llA(spanStyle.m5091getColor0d7_KjU());
        androidTextPaint.m5372setBrush12SF9DM(spanStyle.getBrush(), Size.Companion.m2649getUnspecifiedNHjbRc(), spanStyle.getAlpha());
        androidTextPaint.setShadow(spanStyle.getShadow());
        androidTextPaint.setTextDecoration(spanStyle.getTextDecoration());
        androidTextPaint.setDrawStyle(spanStyle.getDrawStyle());
        if (TextUnitType.m5835equalsimpl0(TextUnit.m5806getTypeUIouoOA(spanStyle.m5095getLetterSpacingXSAIIZE()), TextUnitType.Companion.m5840getSpUIouoOA()) && TextUnit.m5807getValueimpl(spanStyle.m5095getLetterSpacingXSAIIZE()) != 0.0f) {
            float textSize = androidTextPaint.getTextSize() * androidTextPaint.getTextScaleX();
            float r9 = density.m5606toPxR2X_6o(spanStyle.m5095getLetterSpacingXSAIIZE());
            if (textSize != 0.0f) {
                androidTextPaint.setLetterSpacing(r9 / textSize);
            }
        } else if (TextUnitType.m5835equalsimpl0(TextUnit.m5806getTypeUIouoOA(spanStyle.m5095getLetterSpacingXSAIIZE()), TextUnitType.Companion.m5839getEmUIouoOA())) {
            androidTextPaint.setLetterSpacing(TextUnit.m5807getValueimpl(spanStyle.m5095getLetterSpacingXSAIIZE()));
        }
        return m5389generateFallbackSpanStyle62GTOB8(spanStyle.m5095getLetterSpacingXSAIIZE(), z, spanStyle.m5089getBackground0d7_KjU(), spanStyle.m5090getBaselineShift5SSeXJ0());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
        if (androidx.compose.ui.text.style.BaselineShift.m5397equalsimpl0(r34.m5400unboximpl(), androidx.compose.ui.text.style.BaselineShift.Companion.m5404getNoney9eOQZs()) == false) goto L_0x0052;
     */
    /* renamed from: generateFallbackSpanStyle-62GTOB8  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final androidx.compose.ui.text.SpanStyle m5389generateFallbackSpanStyle62GTOB8(long r29, boolean r31, long r32, androidx.compose.ui.text.style.BaselineShift r34) {
        /*
            r0 = r32
            r2 = 1
            r3 = 0
            if (r31 == 0) goto L_0x0022
            long r4 = androidx.compose.ui.unit.TextUnit.m5806getTypeUIouoOA(r29)
            androidx.compose.ui.unit.TextUnitType$Companion r6 = androidx.compose.ui.unit.TextUnitType.Companion
            long r6 = r6.m5840getSpUIouoOA()
            boolean r4 = androidx.compose.ui.unit.TextUnitType.m5835equalsimpl0(r4, r6)
            if (r4 == 0) goto L_0x0022
            float r4 = androidx.compose.ui.unit.TextUnit.m5807getValueimpl(r29)
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r4 = r2
            goto L_0x0023
        L_0x0022:
            r4 = r3
        L_0x0023:
            androidx.compose.ui.graphics.Color$Companion r5 = androidx.compose.ui.graphics.Color.Companion
            long r5 = r5.m2857getUnspecified0d7_KjU()
            boolean r5 = androidx.compose.ui.graphics.Color.m2822equalsimpl0(r0, r5)
            if (r5 != 0) goto L_0x003d
            androidx.compose.ui.graphics.Color$Companion r5 = androidx.compose.ui.graphics.Color.Companion
            long r5 = r5.m2856getTransparent0d7_KjU()
            boolean r5 = androidx.compose.ui.graphics.Color.m2822equalsimpl0(r0, r5)
            if (r5 != 0) goto L_0x003d
            r5 = r2
            goto L_0x003e
        L_0x003d:
            r5 = r3
        L_0x003e:
            if (r34 == 0) goto L_0x0051
            androidx.compose.ui.text.style.BaselineShift$Companion r6 = androidx.compose.ui.text.style.BaselineShift.Companion
            float r6 = r6.m5404getNoney9eOQZs()
            float r7 = r34.m5400unboximpl()
            boolean r6 = androidx.compose.ui.text.style.BaselineShift.m5397equalsimpl0(r7, r6)
            if (r6 != 0) goto L_0x0051
            goto L_0x0052
        L_0x0051:
            r2 = r3
        L_0x0052:
            r3 = 0
            if (r4 != 0) goto L_0x005a
            if (r5 != 0) goto L_0x005a
            if (r2 != 0) goto L_0x005a
            goto L_0x0096
        L_0x005a:
            if (r4 == 0) goto L_0x005f
            r18 = r29
            goto L_0x0067
        L_0x005f:
            androidx.compose.ui.unit.TextUnit$Companion r4 = androidx.compose.ui.unit.TextUnit.Companion
            long r6 = r4.m5818getUnspecifiedXSAIIZE()
            r18 = r6
        L_0x0067:
            if (r5 == 0) goto L_0x006a
            goto L_0x0070
        L_0x006a:
            androidx.compose.ui.graphics.Color$Companion r0 = androidx.compose.ui.graphics.Color.Companion
            long r0 = r0.m2857getUnspecified0d7_KjU()
        L_0x0070:
            r23 = r0
            if (r2 == 0) goto L_0x0077
            r20 = r34
            goto L_0x0079
        L_0x0077:
            r20 = r3
        L_0x0079:
            androidx.compose.ui.text.SpanStyle r3 = new androidx.compose.ui.text.SpanStyle
            r8 = r3
            r9 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r21 = 0
            r22 = 0
            r25 = 0
            r26 = 0
            r27 = 13951(0x367f, float:1.955E-41)
            r28 = 0
            r8.<init>((long) r9, (long) r11, (androidx.compose.ui.text.font.FontWeight) r13, (androidx.compose.ui.text.font.FontStyle) r14, (androidx.compose.ui.text.font.FontSynthesis) r15, (androidx.compose.ui.text.font.FontFamily) r16, (java.lang.String) r17, (long) r18, (androidx.compose.ui.text.style.BaselineShift) r20, (androidx.compose.ui.text.style.TextGeometricTransform) r21, (androidx.compose.ui.text.intl.LocaleList) r22, (long) r23, (androidx.compose.ui.text.style.TextDecoration) r25, (androidx.compose.ui.graphics.Shadow) r26, (int) r27, (kotlin.jvm.internal.DefaultConstructorMarker) r28)
        L_0x0096:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.platform.extensions.TextPaintExtensions_androidKt.m5389generateFallbackSpanStyle62GTOB8(long, boolean, long, androidx.compose.ui.text.style.BaselineShift):androidx.compose.ui.text.SpanStyle");
    }

    public static final void setTextMotion(AndroidTextPaint androidTextPaint, TextMotion textMotion) {
        int i;
        Intrinsics.checkNotNullParameter(androidTextPaint, "<this>");
        if (textMotion == null) {
            textMotion = TextMotion.Companion.getStatic();
        }
        if (textMotion.getSubpixelTextPositioning$ui_text_release()) {
            i = androidTextPaint.getFlags() | 128;
        } else {
            i = androidTextPaint.getFlags() & -129;
        }
        androidTextPaint.setFlags(i);
        int r3 = textMotion.m5534getLinearity4e0Vf04$ui_text_release();
        if (TextMotion.Linearity.m5538equalsimpl0(r3, TextMotion.Linearity.Companion.m5543getLinear4e0Vf04())) {
            androidTextPaint.setFlags(androidTextPaint.getFlags() | 64);
            androidTextPaint.setHinting(0);
        } else if (TextMotion.Linearity.m5538equalsimpl0(r3, TextMotion.Linearity.Companion.m5542getFontHinting4e0Vf04())) {
            androidTextPaint.getFlags();
            androidTextPaint.setHinting(1);
        } else if (TextMotion.Linearity.m5538equalsimpl0(r3, TextMotion.Linearity.Companion.m5544getNone4e0Vf04())) {
            androidTextPaint.getFlags();
            androidTextPaint.setHinting(0);
        } else {
            androidTextPaint.getFlags();
        }
    }

    public static final boolean hasFontAttributes(SpanStyle spanStyle) {
        Intrinsics.checkNotNullParameter(spanStyle, "<this>");
        return (spanStyle.getFontFamily() == null && spanStyle.m5093getFontStyle4Lr2A7w() == null && spanStyle.getFontWeight() == null) ? false : true;
    }
}
