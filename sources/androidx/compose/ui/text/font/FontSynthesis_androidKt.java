package androidx.compose.ui.text.font;

import android.graphics.Typeface;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\f"}, d2 = {"synthesizeTypeface", "", "Landroidx/compose/ui/text/font/FontSynthesis;", "typeface", "font", "Landroidx/compose/ui/text/font/Font;", "requestedWeight", "Landroidx/compose/ui/text/font/FontWeight;", "requestedStyle", "Landroidx/compose/ui/text/font/FontStyle;", "synthesizeTypeface-FxwP2eA", "(ILjava/lang/Object;Landroidx/compose/ui/text/font/Font;Landroidx/compose/ui/text/font/FontWeight;I)Ljava/lang/Object;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: FontSynthesis.android.kt */
public final class FontSynthesis_androidKt {
    /* renamed from: synthesizeTypeface-FxwP2eA  reason: not valid java name */
    public static final Object m5239synthesizeTypefaceFxwP2eA(int i, Object obj, Font font, FontWeight fontWeight, int i2) {
        Typeface typeface;
        int i3;
        boolean z;
        Intrinsics.checkNotNullParameter(obj, "typeface");
        Intrinsics.checkNotNullParameter(font, "font");
        Intrinsics.checkNotNullParameter(fontWeight, "requestedWeight");
        if (!(obj instanceof Typeface)) {
            return obj;
        }
        boolean z2 = true;
        boolean z3 = FontSynthesis.m5232isWeightOnimpl$ui_text_release(i) && !Intrinsics.areEqual((Object) font.getWeight(), (Object) fontWeight) && fontWeight.compareTo(AndroidFontUtils_androidKt.getAndroidBold(FontWeight.Companion)) >= 0 && font.getWeight().compareTo(AndroidFontUtils_androidKt.getAndroidBold(FontWeight.Companion)) < 0;
        boolean z4 = FontSynthesis.m5231isStyleOnimpl$ui_text_release(i) && !FontStyle.m5220equalsimpl0(i2, font.m5192getStyle_LCdwA());
        if (!z4 && !z3) {
            return obj;
        }
        if (Build.VERSION.SDK_INT < 28) {
            if (!z4 || !FontStyle.m5220equalsimpl0(i2, FontStyle.Companion.m5224getItalic_LCdwA())) {
                z2 = false;
            }
            typeface = Typeface.create((Typeface) obj, AndroidFontUtils_androidKt.getAndroidTypefaceStyle(z3, z2));
        } else {
            if (z3) {
                i3 = fontWeight.getWeight();
            } else {
                i3 = font.getWeight().getWeight();
            }
            if (z4) {
                z = FontStyle.m5220equalsimpl0(i2, FontStyle.Companion.m5224getItalic_LCdwA());
            } else {
                z = FontStyle.m5220equalsimpl0(font.m5192getStyle_LCdwA(), FontStyle.Companion.m5224getItalic_LCdwA());
            }
            typeface = TypefaceHelperMethodsApi28.INSTANCE.create((Typeface) obj, i3, z);
        }
        Intrinsics.checkNotNullExpressionValue(typeface, "if (Build.VERSION.SDK_IN…ht, finalFontStyle)\n    }");
        return typeface;
    }
}
