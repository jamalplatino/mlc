package androidx.compose.material3.tokens;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.GenericFontFamily;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0011\u0010\u0011\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0011\u0010\u0013\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0011\u0010\u0015\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0011\u0010\u0017\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0006R\u0011\u0010\u0019\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0006R\u0011\u0010\u001b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0006R\u0011\u0010\u001d\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0006R\u0011\u0010\u001f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0006R\u0011\u0010!\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0006¨\u0006#"}, d2 = {"Landroidx/compose/material3/tokens/TypographyTokens;", "", "()V", "BodyLarge", "Landroidx/compose/ui/text/TextStyle;", "getBodyLarge", "()Landroidx/compose/ui/text/TextStyle;", "BodyMedium", "getBodyMedium", "BodySmall", "getBodySmall", "DisplayLarge", "getDisplayLarge", "DisplayMedium", "getDisplayMedium", "DisplaySmall", "getDisplaySmall", "HeadlineLarge", "getHeadlineLarge", "HeadlineMedium", "getHeadlineMedium", "HeadlineSmall", "getHeadlineSmall", "LabelLarge", "getLabelLarge", "LabelMedium", "getLabelMedium", "LabelSmall", "getLabelSmall", "TitleLarge", "getTitleLarge", "TitleMedium", "getTitleMedium", "TitleSmall", "getTitleSmall", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: TypographyTokens.kt */
public final class TypographyTokens {
    private static final TextStyle BodyLarge;
    private static final TextStyle BodyMedium;
    private static final TextStyle BodySmall;
    private static final TextStyle DisplayLarge;
    private static final TextStyle DisplayMedium;
    private static final TextStyle DisplaySmall;
    private static final TextStyle HeadlineLarge;
    private static final TextStyle HeadlineMedium;
    private static final TextStyle HeadlineSmall;
    public static final TypographyTokens INSTANCE = new TypographyTokens();
    private static final TextStyle LabelLarge;
    private static final TextStyle LabelMedium;
    private static final TextStyle LabelSmall;
    private static final TextStyle TitleLarge;
    private static final TextStyle TitleMedium;
    private static final TextStyle TitleSmall;

    public final TextStyle getBodyLarge() {
        return BodyLarge;
    }

    public final TextStyle getBodyMedium() {
        return BodyMedium;
    }

    public final TextStyle getBodySmall() {
        return BodySmall;
    }

    public final TextStyle getDisplayLarge() {
        return DisplayLarge;
    }

    public final TextStyle getDisplayMedium() {
        return DisplayMedium;
    }

    public final TextStyle getDisplaySmall() {
        return DisplaySmall;
    }

    public final TextStyle getHeadlineLarge() {
        return HeadlineLarge;
    }

    public final TextStyle getHeadlineMedium() {
        return HeadlineMedium;
    }

    public final TextStyle getHeadlineSmall() {
        return HeadlineSmall;
    }

    public final TextStyle getLabelLarge() {
        return LabelLarge;
    }

    public final TextStyle getLabelMedium() {
        return LabelMedium;
    }

    public final TextStyle getLabelSmall() {
        return LabelSmall;
    }

    public final TextStyle getTitleLarge() {
        return TitleLarge;
    }

    public final TextStyle getTitleMedium() {
        return TitleMedium;
    }

    public final TextStyle getTitleSmall() {
        return TitleSmall;
    }

    private TypographyTokens() {
    }

    static {
        TextStyle defaultTextStyle = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily bodyLargeFont = TypeScaleTokens.INSTANCE.getBodyLargeFont();
        FontWeight bodyLargeWeight = TypeScaleTokens.INSTANCE.getBodyLargeWeight();
        FontFamily fontFamily = bodyLargeFont;
        BodyLarge = TextStyle.m5139copyCXVQc50$default(defaultTextStyle, 0, TypeScaleTokens.INSTANCE.m2374getBodyLargeSizeXSAIIZE(), bodyLargeWeight, (FontStyle) null, (FontSynthesis) null, fontFamily, (String) null, TypeScaleTokens.INSTANCE.m2375getBodyLargeTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, TypeScaleTokens.INSTANCE.m2373getBodyLargeLineHeightXSAIIZE(), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, 4128601, (Object) null);
        TextStyle defaultTextStyle2 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily bodyMediumFont = TypeScaleTokens.INSTANCE.getBodyMediumFont();
        FontWeight bodyMediumWeight = TypeScaleTokens.INSTANCE.getBodyMediumWeight();
        FontFamily fontFamily2 = bodyMediumFont;
        BodyMedium = TextStyle.m5139copyCXVQc50$default(defaultTextStyle2, 0, TypeScaleTokens.INSTANCE.m2377getBodyMediumSizeXSAIIZE(), bodyMediumWeight, (FontStyle) null, (FontSynthesis) null, fontFamily2, (String) null, TypeScaleTokens.INSTANCE.m2378getBodyMediumTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, TypeScaleTokens.INSTANCE.m2376getBodyMediumLineHeightXSAIIZE(), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, 4128601, (Object) null);
        TextStyle defaultTextStyle3 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily bodySmallFont = TypeScaleTokens.INSTANCE.getBodySmallFont();
        FontWeight bodySmallWeight = TypeScaleTokens.INSTANCE.getBodySmallWeight();
        FontFamily fontFamily3 = bodySmallFont;
        BodySmall = TextStyle.m5139copyCXVQc50$default(defaultTextStyle3, 0, TypeScaleTokens.INSTANCE.m2380getBodySmallSizeXSAIIZE(), bodySmallWeight, (FontStyle) null, (FontSynthesis) null, fontFamily3, (String) null, TypeScaleTokens.INSTANCE.m2381getBodySmallTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, TypeScaleTokens.INSTANCE.m2379getBodySmallLineHeightXSAIIZE(), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, 4128601, (Object) null);
        TextStyle defaultTextStyle4 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily displayLargeFont = TypeScaleTokens.INSTANCE.getDisplayLargeFont();
        FontWeight displayLargeWeight = TypeScaleTokens.INSTANCE.getDisplayLargeWeight();
        FontFamily fontFamily4 = displayLargeFont;
        DisplayLarge = TextStyle.m5139copyCXVQc50$default(defaultTextStyle4, 0, TypeScaleTokens.INSTANCE.m2383getDisplayLargeSizeXSAIIZE(), displayLargeWeight, (FontStyle) null, (FontSynthesis) null, fontFamily4, (String) null, TypeScaleTokens.INSTANCE.m2384getDisplayLargeTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, TypeScaleTokens.INSTANCE.m2382getDisplayLargeLineHeightXSAIIZE(), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, 4128601, (Object) null);
        TextStyle defaultTextStyle5 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily displayMediumFont = TypeScaleTokens.INSTANCE.getDisplayMediumFont();
        FontWeight displayMediumWeight = TypeScaleTokens.INSTANCE.getDisplayMediumWeight();
        FontFamily fontFamily5 = displayMediumFont;
        DisplayMedium = TextStyle.m5139copyCXVQc50$default(defaultTextStyle5, 0, TypeScaleTokens.INSTANCE.m2386getDisplayMediumSizeXSAIIZE(), displayMediumWeight, (FontStyle) null, (FontSynthesis) null, fontFamily5, (String) null, TypeScaleTokens.INSTANCE.m2387getDisplayMediumTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, TypeScaleTokens.INSTANCE.m2385getDisplayMediumLineHeightXSAIIZE(), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, 4128601, (Object) null);
        TextStyle defaultTextStyle6 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily displaySmallFont = TypeScaleTokens.INSTANCE.getDisplaySmallFont();
        FontWeight displaySmallWeight = TypeScaleTokens.INSTANCE.getDisplaySmallWeight();
        FontFamily fontFamily6 = displaySmallFont;
        DisplaySmall = TextStyle.m5139copyCXVQc50$default(defaultTextStyle6, 0, TypeScaleTokens.INSTANCE.m2389getDisplaySmallSizeXSAIIZE(), displaySmallWeight, (FontStyle) null, (FontSynthesis) null, fontFamily6, (String) null, TypeScaleTokens.INSTANCE.m2390getDisplaySmallTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, TypeScaleTokens.INSTANCE.m2388getDisplaySmallLineHeightXSAIIZE(), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, 4128601, (Object) null);
        TextStyle defaultTextStyle7 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily headlineLargeFont = TypeScaleTokens.INSTANCE.getHeadlineLargeFont();
        FontWeight headlineLargeWeight = TypeScaleTokens.INSTANCE.getHeadlineLargeWeight();
        FontFamily fontFamily7 = headlineLargeFont;
        HeadlineLarge = TextStyle.m5139copyCXVQc50$default(defaultTextStyle7, 0, TypeScaleTokens.INSTANCE.m2392getHeadlineLargeSizeXSAIIZE(), headlineLargeWeight, (FontStyle) null, (FontSynthesis) null, fontFamily7, (String) null, TypeScaleTokens.INSTANCE.m2393getHeadlineLargeTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, TypeScaleTokens.INSTANCE.m2391getHeadlineLargeLineHeightXSAIIZE(), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, 4128601, (Object) null);
        TextStyle defaultTextStyle8 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily headlineMediumFont = TypeScaleTokens.INSTANCE.getHeadlineMediumFont();
        FontWeight headlineMediumWeight = TypeScaleTokens.INSTANCE.getHeadlineMediumWeight();
        FontFamily fontFamily8 = headlineMediumFont;
        HeadlineMedium = TextStyle.m5139copyCXVQc50$default(defaultTextStyle8, 0, TypeScaleTokens.INSTANCE.m2395getHeadlineMediumSizeXSAIIZE(), headlineMediumWeight, (FontStyle) null, (FontSynthesis) null, fontFamily8, (String) null, TypeScaleTokens.INSTANCE.m2396getHeadlineMediumTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, TypeScaleTokens.INSTANCE.m2394getHeadlineMediumLineHeightXSAIIZE(), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, 4128601, (Object) null);
        TextStyle defaultTextStyle9 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily headlineSmallFont = TypeScaleTokens.INSTANCE.getHeadlineSmallFont();
        FontWeight headlineSmallWeight = TypeScaleTokens.INSTANCE.getHeadlineSmallWeight();
        FontFamily fontFamily9 = headlineSmallFont;
        HeadlineSmall = TextStyle.m5139copyCXVQc50$default(defaultTextStyle9, 0, TypeScaleTokens.INSTANCE.m2398getHeadlineSmallSizeXSAIIZE(), headlineSmallWeight, (FontStyle) null, (FontSynthesis) null, fontFamily9, (String) null, TypeScaleTokens.INSTANCE.m2399getHeadlineSmallTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, TypeScaleTokens.INSTANCE.m2397getHeadlineSmallLineHeightXSAIIZE(), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, 4128601, (Object) null);
        TextStyle defaultTextStyle10 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily labelLargeFont = TypeScaleTokens.INSTANCE.getLabelLargeFont();
        FontWeight labelLargeWeight = TypeScaleTokens.INSTANCE.getLabelLargeWeight();
        FontFamily fontFamily10 = labelLargeFont;
        LabelLarge = TextStyle.m5139copyCXVQc50$default(defaultTextStyle10, 0, TypeScaleTokens.INSTANCE.m2401getLabelLargeSizeXSAIIZE(), labelLargeWeight, (FontStyle) null, (FontSynthesis) null, fontFamily10, (String) null, TypeScaleTokens.INSTANCE.m2402getLabelLargeTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, TypeScaleTokens.INSTANCE.m2400getLabelLargeLineHeightXSAIIZE(), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, 4128601, (Object) null);
        TextStyle defaultTextStyle11 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily labelMediumFont = TypeScaleTokens.INSTANCE.getLabelMediumFont();
        FontWeight labelMediumWeight = TypeScaleTokens.INSTANCE.getLabelMediumWeight();
        FontFamily fontFamily11 = labelMediumFont;
        LabelMedium = TextStyle.m5139copyCXVQc50$default(defaultTextStyle11, 0, TypeScaleTokens.INSTANCE.m2404getLabelMediumSizeXSAIIZE(), labelMediumWeight, (FontStyle) null, (FontSynthesis) null, fontFamily11, (String) null, TypeScaleTokens.INSTANCE.m2405getLabelMediumTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, TypeScaleTokens.INSTANCE.m2403getLabelMediumLineHeightXSAIIZE(), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, 4128601, (Object) null);
        TextStyle defaultTextStyle12 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily labelSmallFont = TypeScaleTokens.INSTANCE.getLabelSmallFont();
        FontWeight labelSmallWeight = TypeScaleTokens.INSTANCE.getLabelSmallWeight();
        FontFamily fontFamily12 = labelSmallFont;
        LabelSmall = TextStyle.m5139copyCXVQc50$default(defaultTextStyle12, 0, TypeScaleTokens.INSTANCE.m2407getLabelSmallSizeXSAIIZE(), labelSmallWeight, (FontStyle) null, (FontSynthesis) null, fontFamily12, (String) null, TypeScaleTokens.INSTANCE.m2408getLabelSmallTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, TypeScaleTokens.INSTANCE.m2406getLabelSmallLineHeightXSAIIZE(), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, 4128601, (Object) null);
        TextStyle defaultTextStyle13 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily titleLargeFont = TypeScaleTokens.INSTANCE.getTitleLargeFont();
        FontWeight titleLargeWeight = TypeScaleTokens.INSTANCE.getTitleLargeWeight();
        FontFamily fontFamily13 = titleLargeFont;
        TitleLarge = TextStyle.m5139copyCXVQc50$default(defaultTextStyle13, 0, TypeScaleTokens.INSTANCE.m2410getTitleLargeSizeXSAIIZE(), titleLargeWeight, (FontStyle) null, (FontSynthesis) null, fontFamily13, (String) null, TypeScaleTokens.INSTANCE.m2411getTitleLargeTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, TypeScaleTokens.INSTANCE.m2409getTitleLargeLineHeightXSAIIZE(), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, 4128601, (Object) null);
        TextStyle defaultTextStyle14 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily titleMediumFont = TypeScaleTokens.INSTANCE.getTitleMediumFont();
        FontWeight titleMediumWeight = TypeScaleTokens.INSTANCE.getTitleMediumWeight();
        FontFamily fontFamily14 = titleMediumFont;
        TitleMedium = TextStyle.m5139copyCXVQc50$default(defaultTextStyle14, 0, TypeScaleTokens.INSTANCE.m2413getTitleMediumSizeXSAIIZE(), titleMediumWeight, (FontStyle) null, (FontSynthesis) null, fontFamily14, (String) null, TypeScaleTokens.INSTANCE.m2414getTitleMediumTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, TypeScaleTokens.INSTANCE.m2412getTitleMediumLineHeightXSAIIZE(), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, 4128601, (Object) null);
        TextStyle defaultTextStyle15 = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily titleSmallFont = TypeScaleTokens.INSTANCE.getTitleSmallFont();
        FontWeight titleSmallWeight = TypeScaleTokens.INSTANCE.getTitleSmallWeight();
        FontFamily fontFamily15 = titleSmallFont;
        TitleSmall = TextStyle.m5139copyCXVQc50$default(defaultTextStyle15, 0, TypeScaleTokens.INSTANCE.m2416getTitleSmallSizeXSAIIZE(), titleSmallWeight, (FontStyle) null, (FontSynthesis) null, fontFamily15, (String) null, TypeScaleTokens.INSTANCE.m2417getTitleSmallTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, TypeScaleTokens.INSTANCE.m2415getTitleSmallLineHeightXSAIIZE(), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, 4128601, (Object) null);
    }
}