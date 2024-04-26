package androidx.compose.ui.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.android.style.IndentationFixSpan;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a\u001d\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\t\u001a\u001d\u0010\n\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\r\u001a\u001d\u0010\u000e\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\u0011\u001a\u001d\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\u0015\u001a\u001d\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\u0019\u001a\f\u0010\u001a\u001a\u00020\u001b*\u00020\u001bH\u0002\u001a\u0014\u0010\u001c\u001a\u00020\u0006*\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0006H\u0002\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"shouldAttachIndentationFixSpan", "", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "ellipsis", "toLayoutAlign", "", "align", "Landroidx/compose/ui/text/style/TextAlign;", "toLayoutAlign-AMY3VfE", "toLayoutBreakStrategy", "breakStrategy", "Landroidx/compose/ui/text/style/LineBreak$Strategy;", "toLayoutBreakStrategy-u6PBz3U", "toLayoutHyphenationFrequency", "hyphens", "Landroidx/compose/ui/text/style/Hyphens;", "toLayoutHyphenationFrequency-0_XeFpE", "toLayoutLineBreakStyle", "lineBreakStrictness", "Landroidx/compose/ui/text/style/LineBreak$Strictness;", "toLayoutLineBreakStyle-4a2g8L8", "toLayoutLineBreakWordStyle", "lineBreakWordStyle", "Landroidx/compose/ui/text/style/LineBreak$WordBreak;", "toLayoutLineBreakWordStyle-gvcdTPQ", "attachIndentationFixSpan", "", "numberOfLinesThatFitMaxHeight", "Landroidx/compose/ui/text/android/TextLayout;", "maxHeight", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: AndroidParagraph.android.kt */
public final class AndroidParagraph_androidKt {
    /* access modifiers changed from: private */
    /* renamed from: toLayoutAlign-AMY3VfE  reason: not valid java name */
    public static final int m4998toLayoutAlignAMY3VfE(TextAlign textAlign) {
        int r0 = TextAlign.Companion.m5509getLefte0LSkKk();
        if (textAlign != null && TextAlign.m5502equalsimpl0(textAlign.m5505unboximpl(), r0)) {
            return 3;
        }
        int r02 = TextAlign.Companion.m5510getRighte0LSkKk();
        if (textAlign != null && TextAlign.m5502equalsimpl0(textAlign.m5505unboximpl(), r02)) {
            return 4;
        }
        int r03 = TextAlign.Companion.m5506getCentere0LSkKk();
        if (textAlign != null && TextAlign.m5502equalsimpl0(textAlign.m5505unboximpl(), r03)) {
            return 2;
        }
        int r04 = TextAlign.Companion.m5511getStarte0LSkKk();
        if (textAlign == null || !TextAlign.m5502equalsimpl0(textAlign.m5505unboximpl(), r04)) {
            int r05 = TextAlign.Companion.m5507getEnde0LSkKk();
            if (textAlign != null && TextAlign.m5502equalsimpl0(textAlign.m5505unboximpl(), r05)) {
                return 1;
            }
        }
        return 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: toLayoutHyphenationFrequency-0_XeFpE  reason: not valid java name */
    public static final int m5000toLayoutHyphenationFrequency0_XeFpE(Hyphens hyphens) {
        int r0 = Hyphens.Companion.m5421getAutovmbZdU8();
        if (hyphens != null && Hyphens.m5417equalsimpl0(hyphens.m5420unboximpl(), r0)) {
            return Build.VERSION.SDK_INT <= 32 ? 1 : 3;
        }
        int r02 = Hyphens.Companion.m5422getNonevmbZdU8();
        if (hyphens != null) {
            boolean r2 = Hyphens.m5417equalsimpl0(hyphens.m5420unboximpl(), r02);
        }
        return 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: toLayoutBreakStrategy-u6PBz3U  reason: not valid java name */
    public static final int m4999toLayoutBreakStrategyu6PBz3U(LineBreak.Strategy strategy) {
        int r0 = LineBreak.Strategy.Companion.m5448getSimplefcGXIks();
        if (strategy != null && LineBreak.Strategy.m5442equalsimpl0(strategy.m5445unboximpl(), r0)) {
            return 0;
        }
        int r02 = LineBreak.Strategy.Companion.m5447getHighQualityfcGXIks();
        if (strategy != null && LineBreak.Strategy.m5442equalsimpl0(strategy.m5445unboximpl(), r02)) {
            return 1;
        }
        int r03 = LineBreak.Strategy.Companion.m5446getBalancedfcGXIks();
        if (strategy != null && LineBreak.Strategy.m5442equalsimpl0(strategy.m5445unboximpl(), r03)) {
            return 2;
        }
        return 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: toLayoutLineBreakStyle-4a2g8L8  reason: not valid java name */
    public static final int m5001toLayoutLineBreakStyle4a2g8L8(LineBreak.Strictness strictness) {
        int r0 = LineBreak.Strictness.Companion.m5456getDefaultusljTpc();
        if (strictness != null && LineBreak.Strictness.m5452equalsimpl0(strictness.m5455unboximpl(), r0)) {
            return 0;
        }
        int r02 = LineBreak.Strictness.Companion.m5457getLooseusljTpc();
        if (strictness != null && LineBreak.Strictness.m5452equalsimpl0(strictness.m5455unboximpl(), r02)) {
            return 1;
        }
        int r03 = LineBreak.Strictness.Companion.m5458getNormalusljTpc();
        if (strictness != null && LineBreak.Strictness.m5452equalsimpl0(strictness.m5455unboximpl(), r03)) {
            return 2;
        }
        int r04 = LineBreak.Strictness.Companion.m5459getStrictusljTpc();
        if (strictness != null && LineBreak.Strictness.m5452equalsimpl0(strictness.m5455unboximpl(), r04)) {
            return 3;
        }
        return 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: toLayoutLineBreakWordStyle-gvcdTPQ  reason: not valid java name */
    public static final int m5002toLayoutLineBreakWordStylegvcdTPQ(LineBreak.WordBreak wordBreak) {
        int r0 = LineBreak.WordBreak.Companion.m5467getDefaultjp8hJ3c();
        if (wordBreak != null && LineBreak.WordBreak.m5463equalsimpl0(wordBreak.m5466unboximpl(), r0)) {
            return 0;
        }
        int r02 = LineBreak.WordBreak.Companion.m5468getPhrasejp8hJ3c();
        if (wordBreak != null && LineBreak.WordBreak.m5463equalsimpl0(wordBreak.m5466unboximpl(), r02)) {
            return 1;
        }
        return 0;
    }

    /* access modifiers changed from: private */
    public static final int numberOfLinesThatFitMaxHeight(TextLayout textLayout, int i) {
        int lineCount = textLayout.getLineCount();
        for (int i2 = 0; i2 < lineCount; i2++) {
            if (textLayout.getLineBottom(i2) > ((float) i)) {
                return i2;
            }
        }
        return textLayout.getLineCount();
    }

    /* access modifiers changed from: private */
    public static final boolean shouldAttachIndentationFixSpan(TextStyle textStyle, boolean z) {
        if (!z || TextUnit.m5804equalsimpl0(textStyle.m5156getLetterSpacingXSAIIZE(), TextUnitKt.getSp(0)) || TextUnit.m5804equalsimpl0(textStyle.m5156getLetterSpacingXSAIIZE(), TextUnit.Companion.m5818getUnspecifiedXSAIIZE()) || textStyle.m5159getTextAlignbuA522U() == null) {
            return false;
        }
        TextAlign r6 = textStyle.m5159getTextAlignbuA522U();
        int r1 = TextAlign.Companion.m5511getStarte0LSkKk();
        if (r6 != null && TextAlign.m5502equalsimpl0(r6.m5505unboximpl(), r1)) {
            return false;
        }
        TextAlign r5 = textStyle.m5159getTextAlignbuA522U();
        int r62 = TextAlign.Companion.m5508getJustifye0LSkKk();
        if (r5 != null && TextAlign.m5502equalsimpl0(r5.m5505unboximpl(), r62)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static final CharSequence attachIndentationFixSpan(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return charSequence;
        }
        Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
        SpannableExtensions_androidKt.setSpan(spannableString, new IndentationFixSpan(), spannableString.length() - 1, spannableString.length() - 1);
        return spannableString;
    }
}
