package androidx.compose.foundation.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001au\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"canReuse", "", "Landroidx/compose/ui/text/TextLayoutResult;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "style", "Landroidx/compose/ui/text/TextStyle;", "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "maxLines", "", "softWrap", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "density", "Landroidx/compose/ui/unit/Density;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "canReuse-7_7YC6M", "(Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;IZILandroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/font/FontFamily$Resolver;J)Z", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: TextLayoutHelper.kt */
public final class TextLayoutHelperKt {
    /* renamed from: canReuse-7_7YC6M  reason: not valid java name */
    public static final boolean m961canReuse7_7YC6M(TextLayoutResult textLayoutResult, AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i, boolean z, int i2, Density density, LayoutDirection layoutDirection, FontFamily.Resolver resolver, long j) {
        Intrinsics.checkNotNullParameter(textLayoutResult, "$this$canReuse");
        Intrinsics.checkNotNullParameter(annotatedString, "text");
        Intrinsics.checkNotNullParameter(textStyle, "style");
        Intrinsics.checkNotNullParameter(list, "placeholders");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(resolver, "fontFamilyResolver");
        TextLayoutInput layoutInput = textLayoutResult.getLayoutInput();
        if (textLayoutResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts() || !Intrinsics.areEqual((Object) layoutInput.getText(), (Object) annotatedString) || !layoutInput.getStyle().hasSameLayoutAffectingAttributes(textStyle) || !Intrinsics.areEqual((Object) layoutInput.getPlaceholders(), (Object) list) || layoutInput.getMaxLines() != i || layoutInput.getSoftWrap() != z || !TextOverflow.m5548equalsimpl0(layoutInput.m5100getOverflowgIe3tQ8(), i2) || !Intrinsics.areEqual((Object) layoutInput.getDensity(), (Object) density) || layoutInput.getLayoutDirection() != layoutDirection || !Intrinsics.areEqual((Object) layoutInput.getFontFamilyResolver(), (Object) resolver) || Constraints.m5572getMinWidthimpl(j) != Constraints.m5572getMinWidthimpl(layoutInput.m5099getConstraintsmsEJaDk())) {
            return false;
        }
        if (!z && !TextOverflow.m5548equalsimpl0(i2, TextOverflow.Companion.m5556getEllipsisgIe3tQ8())) {
            return true;
        }
        if (Constraints.m5570getMaxWidthimpl(j) == Constraints.m5570getMaxWidthimpl(layoutInput.m5099getConstraintsmsEJaDk()) && Constraints.m5569getMaxHeightimpl(j) == Constraints.m5569getMaxHeightimpl(layoutInput.m5099getConstraintsmsEJaDk())) {
            return true;
        }
        return false;
    }
}
