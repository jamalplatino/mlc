package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.FontVariation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u001aE\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\f\u0010\u0012\u001a\u00020\u0013*\u00020\u0001H\u0007\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Font", "Landroidx/compose/ui/text/font/Font;", "resId", "", "weight", "Landroidx/compose/ui/text/font/FontWeight;", "style", "Landroidx/compose/ui/text/font/FontStyle;", "Font-RetOiIg", "(ILandroidx/compose/ui/text/font/FontWeight;I)Landroidx/compose/ui/text/font/Font;", "loadingStrategy", "Landroidx/compose/ui/text/font/FontLoadingStrategy;", "Font-YpTlLL0", "(ILandroidx/compose/ui/text/font/FontWeight;II)Landroidx/compose/ui/text/font/Font;", "variationSettings", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "Font-F3nL8kk", "(ILandroidx/compose/ui/text/font/FontWeight;IILandroidx/compose/ui/text/font/FontVariation$Settings;)Landroidx/compose/ui/text/font/Font;", "toFontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Font.kt */
public final class FontKt {
    /* renamed from: Font-RetOiIg$default  reason: not valid java name */
    public static /* synthetic */ Font m5201FontRetOiIg$default(int i, FontWeight fontWeight, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i3 & 4) != 0) {
            i2 = FontStyle.Companion.m5225getNormal_LCdwA();
        }
        return Intrinsics.checkNotNullParameter(fontWeight, "weight");
    }

    /* renamed from: Font-YpTlLL0$default  reason: not valid java name */
    public static /* synthetic */ Font m5203FontYpTlLL0$default(int i, FontWeight fontWeight, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i4 & 4) != 0) {
            i2 = FontStyle.Companion.m5225getNormal_LCdwA();
        }
        if ((i4 & 8) != 0) {
            i3 = FontLoadingStrategy.Companion.m5212getBlockingPKNRLFQ();
        }
        return m5202FontYpTlLL0(i, fontWeight, i2, i3);
    }

    /* renamed from: Font-YpTlLL0  reason: not valid java name */
    public static final Font m5202FontYpTlLL0(int i, FontWeight fontWeight, int i2, int i3) {
        Intrinsics.checkNotNullParameter(fontWeight, "weight");
        return new ResourceFont(i, fontWeight, i2, new FontVariation.Settings(new FontVariation.Setting[0]), i3, (DefaultConstructorMarker) null);
    }

    /* renamed from: Font-F3nL8kk$default  reason: not valid java name */
    public static /* synthetic */ Font m5199FontF3nL8kk$default(int i, FontWeight fontWeight, int i2, int i3, FontVariation.Settings settings, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i4 & 4) != 0) {
            i2 = FontStyle.Companion.m5225getNormal_LCdwA();
        }
        if ((i4 & 8) != 0) {
            i3 = FontLoadingStrategy.Companion.m5212getBlockingPKNRLFQ();
        }
        if ((i4 & 16) != 0) {
            settings = FontVariation.INSTANCE.m5240Settings6EWAqTQ(fontWeight, i2, new FontVariation.Setting[0]);
        }
        return m5198FontF3nL8kk(i, fontWeight, i2, i3, settings);
    }

    /* renamed from: Font-F3nL8kk  reason: not valid java name */
    public static final Font m5198FontF3nL8kk(int i, FontWeight fontWeight, int i2, int i3, FontVariation.Settings settings) {
        Intrinsics.checkNotNullParameter(fontWeight, "weight");
        Intrinsics.checkNotNullParameter(settings, "variationSettings");
        return new ResourceFont(i, fontWeight, i2, settings, i3, (DefaultConstructorMarker) null);
    }

    public static final FontFamily toFontFamily(Font font) {
        Intrinsics.checkNotNullParameter(font, "<this>");
        return FontFamilyKt.FontFamily(font);
    }
}
