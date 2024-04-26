package androidx.compose.ui.text;

import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextIndentKt;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007\u001a&\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0000\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"DefaultLineHeight", "Landroidx/compose/ui/unit/TextUnit;", "J", "lerp", "Landroidx/compose/ui/text/ParagraphStyle;", "start", "stop", "fraction", "", "lerpPlatformStyle", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "resolveParagraphStyleDefaults", "style", "direction", "Landroidx/compose/ui/unit/LayoutDirection;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: ParagraphStyle.kt */
public final class ParagraphStyleKt {
    private static final long DefaultLineHeight = TextUnit.Companion.m5818getUnspecifiedXSAIIZE();

    public static final ParagraphStyle lerp(ParagraphStyle paragraphStyle, ParagraphStyle paragraphStyle2, float f) {
        Intrinsics.checkNotNullParameter(paragraphStyle, "start");
        Intrinsics.checkNotNullParameter(paragraphStyle2, "stop");
        TextAlign textAlign = (TextAlign) SpanStyleKt.lerpDiscrete(paragraphStyle.m5048getTextAlignbuA522U(), paragraphStyle2.m5048getTextAlignbuA522U(), f);
        TextDirection textDirection = (TextDirection) SpanStyleKt.lerpDiscrete(paragraphStyle.m5050getTextDirectionmmuk1to(), paragraphStyle2.m5050getTextDirectionmmuk1to(), f);
        long r4 = SpanStyleKt.m5096lerpTextUnitInheritableC3pnCVY(paragraphStyle.m5047getLineHeightXSAIIZE(), paragraphStyle2.m5047getLineHeightXSAIIZE(), f);
        TextIndent textIndent = paragraphStyle.getTextIndent();
        if (textIndent == null) {
            textIndent = TextIndent.Companion.getNone();
        }
        TextIndent textIndent2 = paragraphStyle2.getTextIndent();
        if (textIndent2 == null) {
            textIndent2 = TextIndent.Companion.getNone();
        }
        return new ParagraphStyle(textAlign, textDirection, r4, TextIndentKt.lerp(textIndent, textIndent2, f), lerpPlatformStyle(paragraphStyle.getPlatformStyle(), paragraphStyle2.getPlatformStyle(), f), (LineHeightStyle) SpanStyleKt.lerpDiscrete(paragraphStyle.getLineHeightStyle(), paragraphStyle2.getLineHeightStyle(), f), (LineBreak) SpanStyleKt.lerpDiscrete(paragraphStyle.m5045getLineBreakLgCVezo(), paragraphStyle2.m5045getLineBreakLgCVezo(), f), (Hyphens) SpanStyleKt.lerpDiscrete(paragraphStyle.m5043getHyphensEaSxIns(), paragraphStyle2.m5043getHyphensEaSxIns(), f), (TextMotion) SpanStyleKt.lerpDiscrete(paragraphStyle.getTextMotion(), paragraphStyle2.getTextMotion(), f), (DefaultConstructorMarker) null);
    }

    private static final PlatformParagraphStyle lerpPlatformStyle(PlatformParagraphStyle platformParagraphStyle, PlatformParagraphStyle platformParagraphStyle2, float f) {
        if (platformParagraphStyle == null && platformParagraphStyle2 == null) {
            return null;
        }
        if (platformParagraphStyle == null) {
            platformParagraphStyle = PlatformParagraphStyle.Companion.getDefault();
        }
        if (platformParagraphStyle2 == null) {
            platformParagraphStyle2 = PlatformParagraphStyle.Companion.getDefault();
        }
        return AndroidTextStyle_androidKt.lerp(platformParagraphStyle, platformParagraphStyle2, f);
    }

    public static final ParagraphStyle resolveParagraphStyleDefaults(ParagraphStyle paragraphStyle, LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(paragraphStyle, "style");
        Intrinsics.checkNotNullParameter(layoutDirection, "direction");
        TextAlign r2 = TextAlign.m5499boximpl(paragraphStyle.m5049getTextAlignOrDefaulte0LSkKk$ui_text_release());
        TextDirection r3 = TextDirection.m5512boximpl(TextStyleKt.m5161resolveTextDirectionYj3eThk(layoutDirection, paragraphStyle.m5050getTextDirectionmmuk1to()));
        long r4 = TextUnitKt.m5825isUnspecifiedR2X_6o(paragraphStyle.m5047getLineHeightXSAIIZE()) ? DefaultLineHeight : paragraphStyle.m5047getLineHeightXSAIIZE();
        TextIndent textIndent = paragraphStyle.getTextIndent();
        if (textIndent == null) {
            textIndent = TextIndent.Companion.getNone();
        }
        TextIndent textIndent2 = textIndent;
        PlatformParagraphStyle platformStyle = paragraphStyle.getPlatformStyle();
        LineHeightStyle lineHeightStyle = paragraphStyle.getLineHeightStyle();
        LineBreak r9 = LineBreak.m5423boximpl(paragraphStyle.m5046getLineBreakOrDefaultrAG3T2k$ui_text_release());
        Hyphens r10 = Hyphens.m5414boximpl(paragraphStyle.m5044getHyphensOrDefaultvmbZdU8$ui_text_release());
        TextMotion textMotion = paragraphStyle.getTextMotion();
        if (textMotion == null) {
            textMotion = TextMotion.Companion.getStatic();
        }
        return new ParagraphStyle(r2, r3, r4, textIndent2, platformStyle, lineHeightStyle, r9, r10, textMotion, (DefaultConstructorMarker) null);
    }
}
