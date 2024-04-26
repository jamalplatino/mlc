package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aP\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\f0\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0000\u001a+\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\u001a\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"hasEmojiCompat", "", "Landroidx/compose/ui/text/TextStyle;", "getHasEmojiCompat", "(Landroidx/compose/ui/text/TextStyle;)Z", "ActualParagraphIntrinsics", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "text", "", "style", "spanStyles", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "placeholders", "Landroidx/compose/ui/text/Placeholder;", "density", "Landroidx/compose/ui/unit/Density;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "resolveTextDirectionHeuristics", "", "textDirection", "Landroidx/compose/ui/text/style/TextDirection;", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", "resolveTextDirectionHeuristics-9GRLPo0", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: AndroidParagraphIntrinsics.android.kt */
public final class AndroidParagraphIntrinsics_androidKt {
    /* renamed from: resolveTextDirectionHeuristics-9GRLPo0$default  reason: not valid java name */
    public static /* synthetic */ int m5365resolveTextDirectionHeuristics9GRLPo0$default(TextDirection textDirection, LocaleList localeList, int i, Object obj) {
        if ((i & 1) != 0) {
            textDirection = null;
        }
        if ((i & 2) != 0) {
            localeList = null;
        }
        return m5364resolveTextDirectionHeuristics9GRLPo0(textDirection, localeList);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0069, code lost:
        if (r5 == null) goto L_0x006b;
     */
    /* renamed from: resolveTextDirectionHeuristics-9GRLPo0  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int m5364resolveTextDirectionHeuristics9GRLPo0(androidx.compose.ui.text.style.TextDirection r5, androidx.compose.ui.text.intl.LocaleList r6) {
        /*
            if (r5 == 0) goto L_0x0007
            int r5 = r5.m5518unboximpl()
            goto L_0x000d
        L_0x0007:
            androidx.compose.ui.text.style.TextDirection$Companion r5 = androidx.compose.ui.text.style.TextDirection.Companion
            int r5 = r5.m5519getContents_7Xco()
        L_0x000d:
            androidx.compose.ui.text.style.TextDirection$Companion r0 = androidx.compose.ui.text.style.TextDirection.Companion
            int r0 = r0.m5520getContentOrLtrs_7Xco()
            boolean r0 = androidx.compose.ui.text.style.TextDirection.m5515equalsimpl0(r5, r0)
            r1 = 2
            if (r0 == 0) goto L_0x001b
            goto L_0x0077
        L_0x001b:
            androidx.compose.ui.text.style.TextDirection$Companion r0 = androidx.compose.ui.text.style.TextDirection.Companion
            int r0 = r0.m5521getContentOrRtls_7Xco()
            boolean r0 = androidx.compose.ui.text.style.TextDirection.m5515equalsimpl0(r5, r0)
            r2 = 3
            if (r0 == 0) goto L_0x002a
        L_0x0028:
            r1 = r2
            goto L_0x0077
        L_0x002a:
            androidx.compose.ui.text.style.TextDirection$Companion r0 = androidx.compose.ui.text.style.TextDirection.Companion
            int r0 = r0.m5522getLtrs_7Xco()
            boolean r0 = androidx.compose.ui.text.style.TextDirection.m5515equalsimpl0(r5, r0)
            r3 = 0
            if (r0 == 0) goto L_0x0039
            r1 = r3
            goto L_0x0077
        L_0x0039:
            androidx.compose.ui.text.style.TextDirection$Companion r0 = androidx.compose.ui.text.style.TextDirection.Companion
            int r0 = r0.m5523getRtls_7Xco()
            boolean r0 = androidx.compose.ui.text.style.TextDirection.m5515equalsimpl0(r5, r0)
            r4 = 1
            if (r0 == 0) goto L_0x0048
            r1 = r4
            goto L_0x0077
        L_0x0048:
            androidx.compose.ui.text.style.TextDirection$Companion r0 = androidx.compose.ui.text.style.TextDirection.Companion
            int r0 = r0.m5519getContents_7Xco()
            boolean r5 = androidx.compose.ui.text.style.TextDirection.m5515equalsimpl0(r5, r0)
            if (r5 == 0) goto L_0x0078
            if (r6 == 0) goto L_0x006b
            androidx.compose.ui.text.intl.Locale r5 = r6.get(r3)
            androidx.compose.ui.text.intl.PlatformLocale r5 = r5.getPlatformLocale$ui_text_release()
            java.lang.String r6 = "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5, r6)
            androidx.compose.ui.text.intl.AndroidLocale r5 = (androidx.compose.ui.text.intl.AndroidLocale) r5
            java.util.Locale r5 = r5.getJavaLocale()
            if (r5 != 0) goto L_0x006f
        L_0x006b:
            java.util.Locale r5 = java.util.Locale.getDefault()
        L_0x006f:
            int r5 = androidx.core.text.TextUtilsCompat.getLayoutDirectionFromLocale(r5)
            if (r5 == 0) goto L_0x0077
            if (r5 == r4) goto L_0x0028
        L_0x0077:
            return r1
        L_0x0078:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Invalid TextDirection."
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.platform.AndroidParagraphIntrinsics_androidKt.m5364resolveTextDirectionHeuristics9GRLPo0(androidx.compose.ui.text.style.TextDirection, androidx.compose.ui.text.intl.LocaleList):int");
    }

    public static final ParagraphIntrinsics ActualParagraphIntrinsics(String str, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, Density density, FontFamily.Resolver resolver) {
        Intrinsics.checkNotNullParameter(str, "text");
        Intrinsics.checkNotNullParameter(textStyle, "style");
        Intrinsics.checkNotNullParameter(list, "spanStyles");
        Intrinsics.checkNotNullParameter(list2, "placeholders");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(resolver, "fontFamilyResolver");
        return new AndroidParagraphIntrinsics(str, textStyle, list, list2, resolver, density);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r1 = r1.getParagraphStyle();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean getHasEmojiCompat(androidx.compose.ui.text.TextStyle r1) {
        /*
            androidx.compose.ui.text.PlatformTextStyle r1 = r1.getPlatformStyle()
            if (r1 == 0) goto L_0x0015
            androidx.compose.ui.text.PlatformParagraphStyle r1 = r1.getParagraphStyle()
            if (r1 == 0) goto L_0x0015
            int r1 = r1.m5070getEmojiSupportMatch_3YsG6Y()
            androidx.compose.ui.text.EmojiSupportMatch r1 = androidx.compose.ui.text.EmojiSupportMatch.m5004boximpl(r1)
            goto L_0x0016
        L_0x0015:
            r1 = 0
        L_0x0016:
            androidx.compose.ui.text.EmojiSupportMatch$Companion r0 = androidx.compose.ui.text.EmojiSupportMatch.Companion
            int r0 = r0.m5012getNone_3YsG6Y()
            if (r1 != 0) goto L_0x0020
            r1 = 0
            goto L_0x0028
        L_0x0020:
            int r1 = r1.m5010unboximpl()
            boolean r1 = androidx.compose.ui.text.EmojiSupportMatch.m5007equalsimpl0(r1, r0)
        L_0x0028:
            r1 = r1 ^ 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.platform.AndroidParagraphIntrinsics_androidKt.getHasEmojiCompat(androidx.compose.ui.text.TextStyle):boolean");
    }
}
