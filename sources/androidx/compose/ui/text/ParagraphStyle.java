package androidx.compose.ui.text;

import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B8\b\u0017\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tø\u0001\u0000¢\u0006\u0002\u0010\nBP\b\u0017\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eø\u0001\u0000¢\u0006\u0002\u0010\u000fBh\b\u0016\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013ø\u0001\u0000¢\u0006\u0002\u0010\u0014Bt\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016ø\u0001\u0000¢\u0006\u0002\u0010\u0017JC\u00105\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b6\u00107J[\u00105\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b8\u00109Jq\u00105\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b:\u0010;J\u00105\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b<\u0010=J\u0013\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010A\u001a\u00020BH\u0016J\u0014\u0010C\u001a\u00020\u00002\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u0000H\u0007J\u0014\u0010D\u001a\u0004\u0018\u00010\f2\b\u0010@\u001a\u0004\u0018\u00010\fH\u0002J\u0011\u0010E\u001a\u00020\u00002\u0006\u0010@\u001a\u00020\u0000H\u0002J\b\u0010F\u001a\u00020GH\u0016R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\u001a\u001a\u00020\u0013X\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001f\u0010 \u001a\u00020\u0011X\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b!\u0010\u001cR\u001c\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u001f\u0010+\u001a\u00020\u0003X\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b,\u0010\u001cR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b1\u00102\u001a\u0004\b3\u00104\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006H"}, d2 = {"Landroidx/compose/ui/text/ParagraphStyle;", "", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", "textDirection", "Landroidx/compose/ui/text/style/TextDirection;", "lineHeight", "Landroidx/compose/ui/unit/TextUnit;", "textIndent", "Landroidx/compose/ui/text/style/TextIndent;", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "platformStyle", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "lineHeightStyle", "Landroidx/compose/ui/text/style/LineHeightStyle;", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "lineBreak", "Landroidx/compose/ui/text/style/LineBreak;", "hyphens", "Landroidx/compose/ui/text/style/Hyphens;", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "textMotion", "Landroidx/compose/ui/text/style/TextMotion;", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/style/TextMotion;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getHyphens-EaSxIns", "()Landroidx/compose/ui/text/style/Hyphens;", "hyphensOrDefault", "getHyphensOrDefault-vmbZdU8$ui_text_release", "()I", "I", "getLineBreak-LgCVezo", "()Landroidx/compose/ui/text/style/LineBreak;", "lineBreakOrDefault", "getLineBreakOrDefault-rAG3T2k$ui_text_release", "getLineHeight-XSAIIZE", "()J", "J", "getLineHeightStyle", "()Landroidx/compose/ui/text/style/LineHeightStyle;", "getPlatformStyle", "()Landroidx/compose/ui/text/PlatformParagraphStyle;", "getTextAlign-buA522U", "()Landroidx/compose/ui/text/style/TextAlign;", "textAlignOrDefault", "getTextAlignOrDefault-e0LSkKk$ui_text_release", "getTextDirection-mmuk1to", "()Landroidx/compose/ui/text/style/TextDirection;", "getTextIndent", "()Landroidx/compose/ui/text/style/TextIndent;", "getTextMotion$annotations", "()V", "getTextMotion", "()Landroidx/compose/ui/text/style/TextMotion;", "copy", "copy-Elsmlbk", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;)Landroidx/compose/ui/text/ParagraphStyle;", "copy-xPh5V4g", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;)Landroidx/compose/ui/text/ParagraphStyle;", "copy-ciSxzs0", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;)Landroidx/compose/ui/text/ParagraphStyle;", "copy-NH1kkwU", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/ParagraphStyle;", "equals", "", "other", "hashCode", "", "merge", "mergePlatformStyle", "plus", "toString", "", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: ParagraphStyle.kt */
public final class ParagraphStyle {
    public static final int $stable = 0;
    private final Hyphens hyphens;
    private final int hyphensOrDefault;
    private final LineBreak lineBreak;
    private final int lineBreakOrDefault;
    private final long lineHeight;
    private final LineHeightStyle lineHeightStyle;
    private final PlatformParagraphStyle platformStyle;
    private final TextAlign textAlign;
    private final int textAlignOrDefault;
    private final TextDirection textDirection;
    private final TextIndent textIndent;
    private final TextMotion textMotion;

    public /* synthetic */ ParagraphStyle(TextAlign textAlign2, TextDirection textDirection2, long j, TextIndent textIndent2, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle2, LineBreak lineBreak2, Hyphens hyphens2, TextMotion textMotion2, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAlign2, textDirection2, j, textIndent2, platformParagraphStyle, lineHeightStyle2, lineBreak2, hyphens2, textMotion2);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign2, TextDirection textDirection2, long j, TextIndent textIndent2, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle2, LineBreak lineBreak2, Hyphens hyphens2, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAlign2, textDirection2, j, textIndent2, platformParagraphStyle, lineHeightStyle2, lineBreak2, hyphens2);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable constructors.")
    public /* synthetic */ ParagraphStyle(TextAlign textAlign2, TextDirection textDirection2, long j, TextIndent textIndent2, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle2, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAlign2, textDirection2, j, textIndent2, platformParagraphStyle, lineHeightStyle2);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable constructor.")
    public /* synthetic */ ParagraphStyle(TextAlign textAlign2, TextDirection textDirection2, long j, TextIndent textIndent2, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAlign2, textDirection2, j, textIndent2);
    }

    public static /* synthetic */ void getTextMotion$annotations() {
    }

    /* renamed from: getHyphens-EaSxIns  reason: not valid java name */
    public final Hyphens m5043getHyphensEaSxIns() {
        return this.hyphens;
    }

    /* renamed from: getHyphensOrDefault-vmbZdU8$ui_text_release  reason: not valid java name */
    public final int m5044getHyphensOrDefaultvmbZdU8$ui_text_release() {
        return this.hyphensOrDefault;
    }

    /* renamed from: getLineBreak-LgCVezo  reason: not valid java name */
    public final LineBreak m5045getLineBreakLgCVezo() {
        return this.lineBreak;
    }

    /* renamed from: getLineBreakOrDefault-rAG3T2k$ui_text_release  reason: not valid java name */
    public final int m5046getLineBreakOrDefaultrAG3T2k$ui_text_release() {
        return this.lineBreakOrDefault;
    }

    /* renamed from: getLineHeight-XSAIIZE  reason: not valid java name */
    public final long m5047getLineHeightXSAIIZE() {
        return this.lineHeight;
    }

    public final LineHeightStyle getLineHeightStyle() {
        return this.lineHeightStyle;
    }

    public final PlatformParagraphStyle getPlatformStyle() {
        return this.platformStyle;
    }

    /* renamed from: getTextAlign-buA522U  reason: not valid java name */
    public final TextAlign m5048getTextAlignbuA522U() {
        return this.textAlign;
    }

    /* renamed from: getTextAlignOrDefault-e0LSkKk$ui_text_release  reason: not valid java name */
    public final int m5049getTextAlignOrDefaulte0LSkKk$ui_text_release() {
        return this.textAlignOrDefault;
    }

    /* renamed from: getTextDirection-mmuk1to  reason: not valid java name */
    public final TextDirection m5050getTextDirectionmmuk1to() {
        return this.textDirection;
    }

    public final TextIndent getTextIndent() {
        return this.textIndent;
    }

    public final TextMotion getTextMotion() {
        return this.textMotion;
    }

    private ParagraphStyle(TextAlign textAlign2, TextDirection textDirection2, long j, TextIndent textIndent2, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle2, LineBreak lineBreak2, Hyphens hyphens2, TextMotion textMotion2) {
        int i;
        this.textAlign = textAlign2;
        this.textDirection = textDirection2;
        this.lineHeight = j;
        this.textIndent = textIndent2;
        this.platformStyle = platformParagraphStyle;
        this.lineHeightStyle = lineHeightStyle2;
        this.lineBreak = lineBreak2;
        this.hyphens = hyphens2;
        this.textMotion = textMotion2;
        this.textAlignOrDefault = textAlign2 != null ? textAlign2.m5505unboximpl() : TextAlign.Companion.m5511getStarte0LSkKk();
        this.lineBreakOrDefault = lineBreak2 != null ? lineBreak2.m5435unboximpl() : LineBreak.Companion.m5438getSimplerAG3T2k();
        if (hyphens2 != null) {
            i = hyphens2.m5420unboximpl();
        } else {
            i = Hyphens.Companion.m5422getNonevmbZdU8();
        }
        this.hyphensOrDefault = i;
        if (!TextUnit.m5804equalsimpl0(j, TextUnit.Companion.m5818getUnspecifiedXSAIIZE()) && TextUnit.m5807getValueimpl(j) < 0.0f) {
            throw new IllegalStateException(("lineHeight can't be negative (" + TextUnit.m5807getValueimpl(j) + ')').toString());
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ParagraphStyle(androidx.compose.ui.text.style.TextAlign r12, androidx.compose.ui.text.style.TextDirection r13, long r14, androidx.compose.ui.text.style.TextIndent r16, androidx.compose.ui.text.PlatformParagraphStyle r17, androidx.compose.ui.text.style.LineHeightStyle r18, androidx.compose.ui.text.style.LineBreak r19, androidx.compose.ui.text.style.Hyphens r20, androidx.compose.ui.text.style.TextMotion r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
            r11 = this;
            r0 = r22
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r12
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r13
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x001c
            androidx.compose.ui.unit.TextUnit$Companion r4 = androidx.compose.ui.unit.TextUnit.Companion
            long r4 = r4.m5818getUnspecifiedXSAIIZE()
            goto L_0x001d
        L_0x001c:
            r4 = r14
        L_0x001d:
            r6 = r0 & 8
            if (r6 == 0) goto L_0x0023
            r6 = r2
            goto L_0x0025
        L_0x0023:
            r6 = r16
        L_0x0025:
            r7 = r0 & 16
            if (r7 == 0) goto L_0x002b
            r7 = r2
            goto L_0x002d
        L_0x002b:
            r7 = r17
        L_0x002d:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x0033
            r8 = r2
            goto L_0x0035
        L_0x0033:
            r8 = r18
        L_0x0035:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x003b
            r9 = r2
            goto L_0x003d
        L_0x003b:
            r9 = r19
        L_0x003d:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0043
            r10 = r2
            goto L_0x0045
        L_0x0043:
            r10 = r20
        L_0x0045:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x004a
            goto L_0x004c
        L_0x004a:
            r2 = r21
        L_0x004c:
            r0 = 0
            r12 = r11
            r13 = r1
            r14 = r3
            r15 = r4
            r17 = r6
            r18 = r7
            r19 = r8
            r20 = r9
            r21 = r10
            r22 = r2
            r23 = r0
            r12.<init>((androidx.compose.ui.text.style.TextAlign) r13, (androidx.compose.ui.text.style.TextDirection) r14, (long) r15, (androidx.compose.ui.text.style.TextIndent) r17, (androidx.compose.ui.text.PlatformParagraphStyle) r18, (androidx.compose.ui.text.style.LineHeightStyle) r19, (androidx.compose.ui.text.style.LineBreak) r20, (androidx.compose.ui.text.style.Hyphens) r21, (androidx.compose.ui.text.style.TextMotion) r22, (kotlin.jvm.internal.DefaultConstructorMarker) r23)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.ParagraphStyle.<init>(androidx.compose.ui.text.style.TextAlign, androidx.compose.ui.text.style.TextDirection, long, androidx.compose.ui.text.style.TextIndent, androidx.compose.ui.text.PlatformParagraphStyle, androidx.compose.ui.text.style.LineHeightStyle, androidx.compose.ui.text.style.LineBreak, androidx.compose.ui.text.style.Hyphens, androidx.compose.ui.text.style.TextMotion, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ParagraphStyle(TextAlign textAlign2, TextDirection textDirection2, long j, TextIndent textIndent2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : textAlign2, (i & 2) != 0 ? null : textDirection2, (i & 4) != 0 ? TextUnit.Companion.m5818getUnspecifiedXSAIIZE() : j, (i & 8) != 0 ? null : textIndent2, (DefaultConstructorMarker) null);
    }

    private ParagraphStyle(TextAlign textAlign2, TextDirection textDirection2, long j, TextIndent textIndent2) {
        this(textAlign2, textDirection2, j, textIndent2, (PlatformParagraphStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, (DefaultConstructorMarker) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ParagraphStyle(androidx.compose.ui.text.style.TextAlign r9, androidx.compose.ui.text.style.TextDirection r10, long r11, androidx.compose.ui.text.style.TextIndent r13, androidx.compose.ui.text.PlatformParagraphStyle r14, androidx.compose.ui.text.style.LineHeightStyle r15, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
        /*
            r8 = this;
            r0 = r16 & 1
            r1 = 0
            if (r0 == 0) goto L_0x0007
            r0 = r1
            goto L_0x0008
        L_0x0007:
            r0 = r9
        L_0x0008:
            r2 = r16 & 2
            if (r2 == 0) goto L_0x000e
            r2 = r1
            goto L_0x000f
        L_0x000e:
            r2 = r10
        L_0x000f:
            r3 = r16 & 4
            if (r3 == 0) goto L_0x001a
            androidx.compose.ui.unit.TextUnit$Companion r3 = androidx.compose.ui.unit.TextUnit.Companion
            long r3 = r3.m5818getUnspecifiedXSAIIZE()
            goto L_0x001b
        L_0x001a:
            r3 = r11
        L_0x001b:
            r5 = r16 & 8
            if (r5 == 0) goto L_0x0021
            r5 = r1
            goto L_0x0022
        L_0x0021:
            r5 = r13
        L_0x0022:
            r6 = r16 & 16
            if (r6 == 0) goto L_0x0028
            r6 = r1
            goto L_0x0029
        L_0x0028:
            r6 = r14
        L_0x0029:
            r7 = r16 & 32
            if (r7 == 0) goto L_0x002e
            goto L_0x002f
        L_0x002e:
            r1 = r15
        L_0x002f:
            r7 = 0
            r9 = r8
            r10 = r0
            r11 = r2
            r12 = r3
            r14 = r5
            r15 = r6
            r16 = r1
            r17 = r7
            r9.<init>(r10, r11, r12, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.ParagraphStyle.<init>(androidx.compose.ui.text.style.TextAlign, androidx.compose.ui.text.style.TextDirection, long, androidx.compose.ui.text.style.TextIndent, androidx.compose.ui.text.PlatformParagraphStyle, androidx.compose.ui.text.style.LineHeightStyle, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    private ParagraphStyle(TextAlign textAlign2, TextDirection textDirection2, long j, TextIndent textIndent2, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle2) {
        this(textAlign2, textDirection2, j, textIndent2, platformParagraphStyle, lineHeightStyle2, (LineBreak) null, (Hyphens) null, (TextMotion) null, (DefaultConstructorMarker) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ParagraphStyle(androidx.compose.ui.text.style.TextAlign r11, androidx.compose.ui.text.style.TextDirection r12, long r13, androidx.compose.ui.text.style.TextIndent r15, androidx.compose.ui.text.PlatformParagraphStyle r16, androidx.compose.ui.text.style.LineHeightStyle r17, androidx.compose.ui.text.style.LineBreak r18, androidx.compose.ui.text.style.Hyphens r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
        /*
            r10 = this;
            r0 = r20
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r11
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r12
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x001c
            androidx.compose.ui.unit.TextUnit$Companion r4 = androidx.compose.ui.unit.TextUnit.Companion
            long r4 = r4.m5818getUnspecifiedXSAIIZE()
            goto L_0x001d
        L_0x001c:
            r4 = r13
        L_0x001d:
            r6 = r0 & 8
            if (r6 == 0) goto L_0x0023
            r6 = r2
            goto L_0x0024
        L_0x0023:
            r6 = r15
        L_0x0024:
            r7 = r0 & 16
            if (r7 == 0) goto L_0x002a
            r7 = r2
            goto L_0x002c
        L_0x002a:
            r7 = r16
        L_0x002c:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x0032
            r8 = r2
            goto L_0x0034
        L_0x0032:
            r8 = r17
        L_0x0034:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x003a
            r9 = r2
            goto L_0x003c
        L_0x003a:
            r9 = r18
        L_0x003c:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0041
            goto L_0x0043
        L_0x0041:
            r2 = r19
        L_0x0043:
            r0 = 0
            r11 = r10
            r12 = r1
            r13 = r3
            r14 = r4
            r16 = r6
            r17 = r7
            r18 = r8
            r19 = r9
            r20 = r2
            r21 = r0
            r11.<init>((androidx.compose.ui.text.style.TextAlign) r12, (androidx.compose.ui.text.style.TextDirection) r13, (long) r14, (androidx.compose.ui.text.style.TextIndent) r16, (androidx.compose.ui.text.PlatformParagraphStyle) r17, (androidx.compose.ui.text.style.LineHeightStyle) r18, (androidx.compose.ui.text.style.LineBreak) r19, (androidx.compose.ui.text.style.Hyphens) r20, (kotlin.jvm.internal.DefaultConstructorMarker) r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.ParagraphStyle.<init>(androidx.compose.ui.text.style.TextAlign, androidx.compose.ui.text.style.TextDirection, long, androidx.compose.ui.text.style.TextIndent, androidx.compose.ui.text.PlatformParagraphStyle, androidx.compose.ui.text.style.LineHeightStyle, androidx.compose.ui.text.style.LineBreak, androidx.compose.ui.text.style.Hyphens, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    private ParagraphStyle(TextAlign textAlign2, TextDirection textDirection2, long j, TextIndent textIndent2, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle2, LineBreak lineBreak2, Hyphens hyphens2) {
        this(textAlign2, textDirection2, j, textIndent2, platformParagraphStyle, lineHeightStyle2, lineBreak2, hyphens2, (TextMotion) null, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ParagraphStyle merge$default(ParagraphStyle paragraphStyle, ParagraphStyle paragraphStyle2, int i, Object obj) {
        if ((i & 1) != 0) {
            paragraphStyle2 = null;
        }
        return paragraphStyle.merge(paragraphStyle2);
    }

    public final ParagraphStyle merge(ParagraphStyle paragraphStyle) {
        long j;
        if (paragraphStyle == null) {
            return this;
        }
        if (TextUnitKt.m5825isUnspecifiedR2X_6o(paragraphStyle.lineHeight)) {
            j = this.lineHeight;
        } else {
            j = paragraphStyle.lineHeight;
        }
        long j2 = j;
        TextIndent textIndent2 = paragraphStyle.textIndent;
        if (textIndent2 == null) {
            textIndent2 = this.textIndent;
        }
        TextIndent textIndent3 = textIndent2;
        TextAlign textAlign2 = paragraphStyle.textAlign;
        if (textAlign2 == null) {
            textAlign2 = this.textAlign;
        }
        TextAlign textAlign3 = textAlign2;
        TextDirection textDirection2 = paragraphStyle.textDirection;
        if (textDirection2 == null) {
            textDirection2 = this.textDirection;
        }
        TextDirection textDirection3 = textDirection2;
        PlatformParagraphStyle mergePlatformStyle = mergePlatformStyle(paragraphStyle.platformStyle);
        LineHeightStyle lineHeightStyle2 = paragraphStyle.lineHeightStyle;
        if (lineHeightStyle2 == null) {
            lineHeightStyle2 = this.lineHeightStyle;
        }
        LineHeightStyle lineHeightStyle3 = lineHeightStyle2;
        LineBreak lineBreak2 = paragraphStyle.lineBreak;
        if (lineBreak2 == null) {
            lineBreak2 = this.lineBreak;
        }
        LineBreak lineBreak3 = lineBreak2;
        Hyphens hyphens2 = paragraphStyle.hyphens;
        if (hyphens2 == null) {
            hyphens2 = this.hyphens;
        }
        Hyphens hyphens3 = hyphens2;
        TextMotion textMotion2 = paragraphStyle.textMotion;
        if (textMotion2 == null) {
            textMotion2 = this.textMotion;
        }
        return new ParagraphStyle(textAlign3, textDirection3, j2, textIndent3, mergePlatformStyle, lineHeightStyle3, lineBreak3, hyphens3, textMotion2, (DefaultConstructorMarker) null);
    }

    private final PlatformParagraphStyle mergePlatformStyle(PlatformParagraphStyle platformParagraphStyle) {
        PlatformParagraphStyle platformParagraphStyle2 = this.platformStyle;
        if (platformParagraphStyle2 == null) {
            return platformParagraphStyle;
        }
        return platformParagraphStyle == null ? platformParagraphStyle2 : platformParagraphStyle2.merge(platformParagraphStyle);
    }

    public final ParagraphStyle plus(ParagraphStyle paragraphStyle) {
        Intrinsics.checkNotNullParameter(paragraphStyle, "other");
        return merge(paragraphStyle);
    }

    /* renamed from: copy-Elsmlbk$default  reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m5035copyElsmlbk$default(ParagraphStyle paragraphStyle, TextAlign textAlign2, TextDirection textDirection2, long j, TextIndent textIndent2, int i, Object obj) {
        if ((i & 1) != 0) {
            textAlign2 = paragraphStyle.textAlign;
        }
        if ((i & 2) != 0) {
            textDirection2 = paragraphStyle.textDirection;
        }
        TextDirection textDirection3 = textDirection2;
        if ((i & 4) != 0) {
            j = paragraphStyle.lineHeight;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            textIndent2 = paragraphStyle.textIndent;
        }
        return paragraphStyle.m5039copyElsmlbk(textAlign2, textDirection3, j2, textIndent2);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle copy constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable copy constructor.")
    /* renamed from: copy-Elsmlbk  reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m5039copyElsmlbk(TextAlign textAlign2, TextDirection textDirection2, long j, TextIndent textIndent2) {
        return new ParagraphStyle(textAlign2, textDirection2, j, textIndent2, this.platformStyle, this.lineHeightStyle, this.lineBreak, this.hyphens, this.textMotion, (DefaultConstructorMarker) null);
    }

    /* renamed from: copy-xPh5V4g$default  reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m5038copyxPh5V4g$default(ParagraphStyle paragraphStyle, TextAlign textAlign2, TextDirection textDirection2, long j, TextIndent textIndent2, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle2, int i, Object obj) {
        if ((i & 1) != 0) {
            textAlign2 = paragraphStyle.textAlign;
        }
        if ((i & 2) != 0) {
            textDirection2 = paragraphStyle.textDirection;
        }
        TextDirection textDirection3 = textDirection2;
        if ((i & 4) != 0) {
            j = paragraphStyle.lineHeight;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            textIndent2 = paragraphStyle.textIndent;
        }
        TextIndent textIndent3 = textIndent2;
        if ((i & 16) != 0) {
            platformParagraphStyle = paragraphStyle.platformStyle;
        }
        PlatformParagraphStyle platformParagraphStyle2 = platformParagraphStyle;
        if ((i & 32) != 0) {
            lineHeightStyle2 = paragraphStyle.lineHeightStyle;
        }
        return paragraphStyle.m5042copyxPh5V4g(textAlign2, textDirection3, j2, textIndent3, platformParagraphStyle2, lineHeightStyle2);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle copy constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable copy constructor.")
    /* renamed from: copy-xPh5V4g  reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m5042copyxPh5V4g(TextAlign textAlign2, TextDirection textDirection2, long j, TextIndent textIndent2, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle2) {
        return new ParagraphStyle(textAlign2, textDirection2, j, textIndent2, platformParagraphStyle, lineHeightStyle2, this.lineBreak, this.hyphens, this.textMotion, (DefaultConstructorMarker) null);
    }

    /* renamed from: copy-ciSxzs0$default  reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m5037copyciSxzs0$default(ParagraphStyle paragraphStyle, TextAlign textAlign2, TextDirection textDirection2, long j, TextIndent textIndent2, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle2, LineBreak lineBreak2, Hyphens hyphens2, int i, Object obj) {
        Hyphens hyphens3;
        ParagraphStyle paragraphStyle2 = paragraphStyle;
        int i2 = i;
        TextAlign textAlign3 = (i2 & 1) != 0 ? paragraphStyle2.textAlign : textAlign2;
        TextDirection textDirection3 = (i2 & 2) != 0 ? paragraphStyle2.textDirection : textDirection2;
        long j2 = (i2 & 4) != 0 ? paragraphStyle2.lineHeight : j;
        TextIndent textIndent3 = (i2 & 8) != 0 ? paragraphStyle2.textIndent : textIndent2;
        PlatformParagraphStyle platformParagraphStyle2 = (i2 & 16) != 0 ? paragraphStyle2.platformStyle : platformParagraphStyle;
        LineHeightStyle lineHeightStyle3 = (i2 & 32) != 0 ? paragraphStyle2.lineHeightStyle : lineHeightStyle2;
        LineBreak lineBreak3 = (i2 & 64) != 0 ? paragraphStyle2.lineBreak : lineBreak2;
        if ((i2 & 128) != 0) {
            hyphens3 = paragraphStyle2.hyphens;
        } else {
            hyphens3 = hyphens2;
        }
        return paragraphStyle.m5041copyciSxzs0(textAlign3, textDirection3, j2, textIndent3, platformParagraphStyle2, lineHeightStyle3, lineBreak3, hyphens3);
    }

    /* renamed from: copy-ciSxzs0  reason: not valid java name */
    public final ParagraphStyle m5041copyciSxzs0(TextAlign textAlign2, TextDirection textDirection2, long j, TextIndent textIndent2, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle2, LineBreak lineBreak2, Hyphens hyphens2) {
        return new ParagraphStyle(textAlign2, textDirection2, j, textIndent2, platformParagraphStyle, lineHeightStyle2, lineBreak2, hyphens2, this.textMotion, (DefaultConstructorMarker) null);
    }

    /* renamed from: copy-NH1kkwU$default  reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m5036copyNH1kkwU$default(ParagraphStyle paragraphStyle, TextAlign textAlign2, TextDirection textDirection2, long j, TextIndent textIndent2, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle2, LineBreak lineBreak2, Hyphens hyphens2, TextMotion textMotion2, int i, Object obj) {
        TextMotion textMotion3;
        ParagraphStyle paragraphStyle2 = paragraphStyle;
        int i2 = i;
        TextAlign textAlign3 = (i2 & 1) != 0 ? paragraphStyle2.textAlign : textAlign2;
        TextDirection textDirection3 = (i2 & 2) != 0 ? paragraphStyle2.textDirection : textDirection2;
        long j2 = (i2 & 4) != 0 ? paragraphStyle2.lineHeight : j;
        TextIndent textIndent3 = (i2 & 8) != 0 ? paragraphStyle2.textIndent : textIndent2;
        PlatformParagraphStyle platformParagraphStyle2 = (i2 & 16) != 0 ? paragraphStyle2.platformStyle : platformParagraphStyle;
        LineHeightStyle lineHeightStyle3 = (i2 & 32) != 0 ? paragraphStyle2.lineHeightStyle : lineHeightStyle2;
        LineBreak lineBreak3 = (i2 & 64) != 0 ? paragraphStyle2.lineBreak : lineBreak2;
        Hyphens hyphens3 = (i2 & 128) != 0 ? paragraphStyle2.hyphens : hyphens2;
        if ((i2 & 256) != 0) {
            textMotion3 = paragraphStyle2.textMotion;
        } else {
            textMotion3 = textMotion2;
        }
        return paragraphStyle.m5040copyNH1kkwU(textAlign3, textDirection3, j2, textIndent3, platformParagraphStyle2, lineHeightStyle3, lineBreak3, hyphens3, textMotion3);
    }

    /* renamed from: copy-NH1kkwU  reason: not valid java name */
    public final ParagraphStyle m5040copyNH1kkwU(TextAlign textAlign2, TextDirection textDirection2, long j, TextIndent textIndent2, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle2, LineBreak lineBreak2, Hyphens hyphens2, TextMotion textMotion2) {
        return new ParagraphStyle(textAlign2, textDirection2, j, textIndent2, platformParagraphStyle, lineHeightStyle2, lineBreak2, hyphens2, textMotion2, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParagraphStyle)) {
            return false;
        }
        ParagraphStyle paragraphStyle = (ParagraphStyle) obj;
        return Intrinsics.areEqual((Object) this.textAlign, (Object) paragraphStyle.textAlign) && Intrinsics.areEqual((Object) this.textDirection, (Object) paragraphStyle.textDirection) && TextUnit.m5804equalsimpl0(this.lineHeight, paragraphStyle.lineHeight) && Intrinsics.areEqual((Object) this.textIndent, (Object) paragraphStyle.textIndent) && Intrinsics.areEqual((Object) this.platformStyle, (Object) paragraphStyle.platformStyle) && Intrinsics.areEqual((Object) this.lineHeightStyle, (Object) paragraphStyle.lineHeightStyle) && Intrinsics.areEqual((Object) this.lineBreak, (Object) paragraphStyle.lineBreak) && Intrinsics.areEqual((Object) this.hyphens, (Object) paragraphStyle.hyphens) && Intrinsics.areEqual((Object) this.textMotion, (Object) paragraphStyle.textMotion);
    }

    public int hashCode() {
        TextAlign textAlign2 = this.textAlign;
        int i = 0;
        int r0 = (textAlign2 != null ? TextAlign.m5503hashCodeimpl(textAlign2.m5505unboximpl()) : 0) * 31;
        TextDirection textDirection2 = this.textDirection;
        int r02 = (((r0 + (textDirection2 != null ? TextDirection.m5516hashCodeimpl(textDirection2.m5518unboximpl()) : 0)) * 31) + TextUnit.m5808hashCodeimpl(this.lineHeight)) * 31;
        TextIndent textIndent2 = this.textIndent;
        int hashCode = (r02 + (textIndent2 != null ? textIndent2.hashCode() : 0)) * 31;
        PlatformParagraphStyle platformParagraphStyle = this.platformStyle;
        int hashCode2 = (hashCode + (platformParagraphStyle != null ? platformParagraphStyle.hashCode() : 0)) * 31;
        LineHeightStyle lineHeightStyle2 = this.lineHeightStyle;
        int hashCode3 = (hashCode2 + (lineHeightStyle2 != null ? lineHeightStyle2.hashCode() : 0)) * 31;
        LineBreak lineBreak2 = this.lineBreak;
        int r03 = (hashCode3 + (lineBreak2 != null ? LineBreak.m5433hashCodeimpl(lineBreak2.m5435unboximpl()) : 0)) * 31;
        Hyphens hyphens2 = this.hyphens;
        int r04 = (r03 + (hyphens2 != null ? Hyphens.m5418hashCodeimpl(hyphens2.m5420unboximpl()) : 0)) * 31;
        TextMotion textMotion2 = this.textMotion;
        if (textMotion2 != null) {
            i = textMotion2.hashCode();
        }
        return r04 + i;
    }

    public String toString() {
        return "ParagraphStyle(textAlign=" + this.textAlign + ", textDirection=" + this.textDirection + ", lineHeight=" + TextUnit.m5814toStringimpl(this.lineHeight) + ", textIndent=" + this.textIndent + ", platformStyle=" + this.platformStyle + ", lineHeightStyle=" + this.lineHeightStyle + ", lineBreak=" + this.lineBreak + ", hyphens=" + this.hyphens + ", textMotion=" + this.textMotion + ')';
    }
}
