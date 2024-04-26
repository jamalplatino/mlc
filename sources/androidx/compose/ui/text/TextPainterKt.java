package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDrawStyleKt;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002\u001ak\u0010\n\u001a\u00020\u0006*\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0001H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001am\u0010\n\u001a\u00020\u0006*\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0001H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0001\u0010\n\u001a\u00020\u0006*\u00020\u000b2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*2\u0014\b\u0002\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-0,2\b\b\u0002\u0010/\u001a\u0002002\b\b\u0002\u0010\u0018\u001a\u00020\u0001H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u00102\u001ao\u0010\n\u001a\u00020\u0006*\u00020\u000b2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u0002032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*2\b\b\u0002\u0010/\u001a\u0002002\b\b\u0002\u0010\u0018\u001a\u00020\u0001H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001a)\u00106\u001a\u000207*\u00020\u000b2\u0006\u0010/\u001a\u0002002\u0006\u0010\u000e\u001a\u00020\u000fH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b8\u00109\"\u0019\u0010\u0000\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006:"}, d2 = {"DefaultTextBlendMode", "Landroidx/compose/ui/graphics/BlendMode;", "getDefaultTextBlendMode", "()I", "I", "clip", "", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "drawText", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "brush", "Landroidx/compose/ui/graphics/Brush;", "topLeft", "Landroidx/compose/ui/geometry/Offset;", "alpha", "", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "blendMode", "drawText-LVfH_YU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/graphics/Brush;JFLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "color", "Landroidx/compose/ui/graphics/Color;", "drawText-d8-rzKo", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextLayoutResult;JJFLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "textMeasurer", "Landroidx/compose/ui/text/TextMeasurer;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "style", "Landroidx/compose/ui/text/TextStyle;", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "", "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "size", "Landroidx/compose/ui/geometry/Size;", "drawText-JFhB2K4", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextMeasurer;Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextStyle;IZILjava/util/List;JI)V", "", "drawText-TPWCCtM", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextMeasurer;Ljava/lang/String;JLandroidx/compose/ui/text/TextStyle;IZIJI)V", "textLayoutConstraints", "Landroidx/compose/ui/unit/Constraints;", "textLayoutConstraints-v_w8tDc", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJ)J", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: TextPainter.kt */
public final class TextPainterKt {
    private static final int DefaultTextBlendMode = BlendMode.Companion.m2754getSrcOver0nO6VwU();

    public static final int getDefaultTextBlendMode() {
        return DefaultTextBlendMode;
    }

    /* renamed from: drawText-JFhB2K4$default  reason: not valid java name */
    public static /* synthetic */ void m5111drawTextJFhB2K4$default(DrawScope drawScope, TextMeasurer textMeasurer, AnnotatedString annotatedString, long j, TextStyle textStyle, int i, boolean z, int i2, List list, long j2, int i3, int i4, Object obj) {
        int i5 = i4;
        m5110drawTextJFhB2K4(drawScope, textMeasurer, annotatedString, (i5 & 4) != 0 ? Offset.Companion.m2588getZeroF1C5BW0() : j, (i5 & 8) != 0 ? TextStyle.Companion.getDefault() : textStyle, (i5 & 16) != 0 ? TextOverflow.Companion.m5555getClipgIe3tQ8() : i, (i5 & 32) != 0 ? true : z, (i5 & 64) != 0 ? Integer.MAX_VALUE : i2, (i5 & 128) != 0 ? CollectionsKt.emptyList() : list, (i5 & 256) != 0 ? Size.Companion.m2649getUnspecifiedNHjbRc() : j2, (i5 & 512) != 0 ? DrawScope.Companion.m3430getDefaultBlendMode0nO6VwU() : i3);
    }

    /* renamed from: drawText-JFhB2K4  reason: not valid java name */
    public static final void m5110drawTextJFhB2K4(DrawScope drawScope, TextMeasurer textMeasurer, AnnotatedString annotatedString, long j, TextStyle textStyle, int i, boolean z, int i2, List<AnnotatedString.Range<Placeholder>> list, long j2, int i3) {
        DrawScope drawScope2 = drawScope;
        Intrinsics.checkNotNullParameter(drawScope2, "$this$drawText");
        TextMeasurer textMeasurer2 = textMeasurer;
        Intrinsics.checkNotNullParameter(textMeasurer2, "textMeasurer");
        AnnotatedString annotatedString2 = annotatedString;
        Intrinsics.checkNotNullParameter(annotatedString2, "text");
        TextStyle textStyle2 = textStyle;
        Intrinsics.checkNotNullParameter(textStyle2, "style");
        List<AnnotatedString.Range<Placeholder>> list2 = list;
        Intrinsics.checkNotNullParameter(list2, "placeholders");
        int i4 = i;
        boolean z2 = z;
        int i5 = i2;
        TextLayoutResult r1 = TextMeasurer.m5107measurexDpz5zY$default(textMeasurer2, annotatedString2, textStyle2, i4, z2, i5, list2, m5118textLayoutConstraintsv_w8tDc(drawScope2, j2, j), drawScope.getLayoutDirection(), drawScope2, (FontFamily.Resolver) null, false, 1536, (Object) null);
        DrawContext drawContext = drawScope.getDrawContext();
        long r3 = drawContext.m3372getSizeNHjbRc();
        drawContext.getCanvas().save();
        DrawTransform transform = drawContext.getTransform();
        transform.translate(Offset.m2572getXimpl(j), Offset.m2573getYimpl(j));
        clip(transform, r1);
        MultiParagraph.m5013paintLG529CI$default(r1.getMultiParagraph(), drawScope.getDrawContext().getCanvas(), 0, (Shadow) null, (TextDecoration) null, (DrawStyle) null, i3, 30, (Object) null);
        drawContext.getCanvas().restore();
        drawContext.m3373setSizeuvyYCjk(r3);
    }

    /* renamed from: drawText-TPWCCtM$default  reason: not valid java name */
    public static /* synthetic */ void m5115drawTextTPWCCtM$default(DrawScope drawScope, TextMeasurer textMeasurer, String str, long j, TextStyle textStyle, int i, boolean z, int i2, long j2, int i3, int i4, Object obj) {
        int i5 = i4;
        m5114drawTextTPWCCtM(drawScope, textMeasurer, str, (i5 & 4) != 0 ? Offset.Companion.m2588getZeroF1C5BW0() : j, (i5 & 8) != 0 ? TextStyle.Companion.getDefault() : textStyle, (i5 & 16) != 0 ? TextOverflow.Companion.m5555getClipgIe3tQ8() : i, (i5 & 32) != 0 ? true : z, (i5 & 64) != 0 ? Integer.MAX_VALUE : i2, (i5 & 128) != 0 ? Size.Companion.m2649getUnspecifiedNHjbRc() : j2, (i5 & 256) != 0 ? DrawScope.Companion.m3430getDefaultBlendMode0nO6VwU() : i3);
    }

    /* renamed from: drawText-TPWCCtM  reason: not valid java name */
    public static final void m5114drawTextTPWCCtM(DrawScope drawScope, TextMeasurer textMeasurer, String str, long j, TextStyle textStyle, int i, boolean z, int i2, long j2, int i3) {
        DrawScope drawScope2 = drawScope;
        Intrinsics.checkNotNullParameter(drawScope2, "$this$drawText");
        TextMeasurer textMeasurer2 = textMeasurer;
        Intrinsics.checkNotNullParameter(textMeasurer2, "textMeasurer");
        String str2 = str;
        Intrinsics.checkNotNullParameter(str2, "text");
        Intrinsics.checkNotNullParameter(textStyle, "style");
        TextLayoutResult r1 = TextMeasurer.m5107measurexDpz5zY$default(textMeasurer2, new AnnotatedString(str2, (List) null, (List) null, 6, (DefaultConstructorMarker) null), textStyle, i, z, i2, (List) null, m5118textLayoutConstraintsv_w8tDc(drawScope2, j2, j), drawScope.getLayoutDirection(), drawScope2, (FontFamily.Resolver) null, false, 1568, (Object) null);
        DrawContext drawContext = drawScope.getDrawContext();
        long r3 = drawContext.m3372getSizeNHjbRc();
        drawContext.getCanvas().save();
        DrawTransform transform = drawContext.getTransform();
        transform.translate(Offset.m2572getXimpl(j), Offset.m2573getYimpl(j));
        clip(transform, r1);
        MultiParagraph.m5013paintLG529CI$default(r1.getMultiParagraph(), drawScope.getDrawContext().getCanvas(), 0, (Shadow) null, (TextDecoration) null, (DrawStyle) null, i3, 30, (Object) null);
        drawContext.getCanvas().restore();
        drawContext.m3373setSizeuvyYCjk(r3);
    }

    /* renamed from: drawText-d8-rzKo$default  reason: not valid java name */
    public static /* synthetic */ void m5117drawTextd8rzKo$default(DrawScope drawScope, TextLayoutResult textLayoutResult, long j, long j2, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i, int i2, Object obj) {
        int i3 = i2;
        long r1 = (i3 & 2) != 0 ? Color.Companion.m2857getUnspecified0d7_KjU() : j;
        long r3 = (i3 & 4) != 0 ? Offset.Companion.m2588getZeroF1C5BW0() : j2;
        float f2 = (i3 & 8) != 0 ? Float.NaN : f;
        DrawStyle drawStyle2 = null;
        Shadow shadow2 = (i3 & 16) != 0 ? null : shadow;
        TextDecoration textDecoration2 = (i3 & 32) != 0 ? null : textDecoration;
        if ((i3 & 64) == 0) {
            drawStyle2 = drawStyle;
        }
        m5116drawTextd8rzKo(drawScope, textLayoutResult, r1, r3, f2, shadow2, textDecoration2, drawStyle2, (i3 & 128) != 0 ? DrawScope.Companion.m3430getDefaultBlendMode0nO6VwU() : i);
    }

    /* renamed from: drawText-d8-rzKo  reason: not valid java name */
    public static final void m5116drawTextd8rzKo(DrawScope drawScope, TextLayoutResult textLayoutResult, long j, long j2, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i) {
        TextLayoutResult textLayoutResult2 = textLayoutResult;
        DrawScope drawScope2 = drawScope;
        Intrinsics.checkNotNullParameter(drawScope, "$this$drawText");
        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        Shadow shadow2 = shadow == null ? textLayoutResult.getLayoutInput().getStyle().getShadow() : shadow;
        TextDecoration textDecoration2 = textDecoration == null ? textLayoutResult.getLayoutInput().getStyle().getTextDecoration() : textDecoration;
        DrawStyle drawStyle2 = drawStyle == null ? textLayoutResult.getLayoutInput().getStyle().getDrawStyle() : drawStyle;
        DrawContext drawContext = drawScope.getDrawContext();
        long r6 = drawContext.m3372getSizeNHjbRc();
        drawContext.getCanvas().save();
        DrawTransform transform = drawContext.getTransform();
        transform.translate(Offset.m2572getXimpl(j2), Offset.m2573getYimpl(j2));
        clip(transform, textLayoutResult);
        Brush brush = textLayoutResult.getLayoutInput().getStyle().getBrush();
        if (brush == null || j != Color.Companion.m2857getUnspecified0d7_KjU()) {
            textLayoutResult.getMultiParagraph().m5018paintLG529CI(drawScope.getDrawContext().getCanvas(), TextDrawStyleKt.m5524modulateDxMtmZc(j != Color.Companion.m2857getUnspecified0d7_KjU() ? j : textLayoutResult.getLayoutInput().getStyle().m5151getColor0d7_KjU(), f), shadow2, textDecoration2, drawStyle2, i);
        } else {
            textLayoutResult.getMultiParagraph().m5020painthn5TExg(drawScope.getDrawContext().getCanvas(), brush, !Float.isNaN(f) ? f : textLayoutResult.getLayoutInput().getStyle().getAlpha(), shadow2, textDecoration2, drawStyle2, i);
        }
        drawContext.getCanvas().restore();
        drawContext.m3373setSizeuvyYCjk(r6);
    }

    /* renamed from: drawText-LVfH_YU$default  reason: not valid java name */
    public static /* synthetic */ void m5113drawTextLVfH_YU$default(DrawScope drawScope, TextLayoutResult textLayoutResult, Brush brush, long j, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i, int i2, Object obj) {
        int i3 = i2;
        m5112drawTextLVfH_YU(drawScope, textLayoutResult, brush, (i3 & 4) != 0 ? Offset.Companion.m2588getZeroF1C5BW0() : j, (i3 & 8) != 0 ? Float.NaN : f, (i3 & 16) != 0 ? null : shadow, (i3 & 32) != 0 ? null : textDecoration, (i3 & 64) != 0 ? null : drawStyle, (i3 & 128) != 0 ? DrawScope.Companion.m3430getDefaultBlendMode0nO6VwU() : i);
    }

    /* renamed from: drawText-LVfH_YU  reason: not valid java name */
    public static final void m5112drawTextLVfH_YU(DrawScope drawScope, TextLayoutResult textLayoutResult, Brush brush, long j, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i) {
        TextLayoutResult textLayoutResult2 = textLayoutResult;
        DrawScope drawScope2 = drawScope;
        Intrinsics.checkNotNullParameter(drawScope, "$this$drawText");
        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        Brush brush2 = brush;
        Intrinsics.checkNotNullParameter(brush, "brush");
        Shadow shadow2 = shadow == null ? textLayoutResult.getLayoutInput().getStyle().getShadow() : shadow;
        TextDecoration textDecoration2 = textDecoration == null ? textLayoutResult.getLayoutInput().getStyle().getTextDecoration() : textDecoration;
        DrawStyle drawStyle2 = drawStyle == null ? textLayoutResult.getLayoutInput().getStyle().getDrawStyle() : drawStyle;
        DrawContext drawContext = drawScope.getDrawContext();
        long r10 = drawContext.m3372getSizeNHjbRc();
        drawContext.getCanvas().save();
        DrawTransform transform = drawContext.getTransform();
        transform.translate(Offset.m2572getXimpl(j), Offset.m2573getYimpl(j));
        clip(transform, textLayoutResult);
        textLayoutResult.getMultiParagraph().m5020painthn5TExg(drawScope.getDrawContext().getCanvas(), brush, !Float.isNaN(f) ? f : textLayoutResult.getLayoutInput().getStyle().getAlpha(), shadow2, textDecoration2, drawStyle2, i);
        drawContext.getCanvas().restore();
        drawContext.m3373setSizeuvyYCjk(r10);
    }

    private static final void clip(DrawTransform drawTransform, TextLayoutResult textLayoutResult) {
        if (textLayoutResult.getHasVisualOverflow() && !TextOverflow.m5548equalsimpl0(textLayoutResult.getLayoutInput().m5100getOverflowgIe3tQ8(), TextOverflow.Companion.m5557getVisiblegIe3tQ8())) {
            DrawTransform.m3480clipRectN_I0leg$default(drawTransform, 0.0f, 0.0f, (float) IntSize.m5786getWidthimpl(textLayoutResult.m5104getSizeYbymL2g()), (float) IntSize.m5785getHeightimpl(textLayoutResult.m5104getSizeYbymL2g()), 0, 16, (Object) null);
        }
    }

    /* renamed from: textLayoutConstraints-v_w8tDc  reason: not valid java name */
    private static final long m5118textLayoutConstraintsv_w8tDc(DrawScope drawScope, long j, long j2) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (j != Size.Companion.m2649getUnspecifiedNHjbRc() && !Float.isNaN(Size.m2641getWidthimpl(j))) {
            i2 = MathKt.roundToInt((float) Math.ceil((double) Size.m2641getWidthimpl(j)));
            i = i2;
        } else {
            i = MathKt.roundToInt((float) Math.ceil((double) (Size.m2641getWidthimpl(drawScope.m3429getSizeNHjbRc()) - Offset.m2572getXimpl(j2))));
            i2 = 0;
        }
        if (j != Size.Companion.m2649getUnspecifiedNHjbRc() && !Float.isNaN(Size.m2638getHeightimpl(j))) {
            i4 = MathKt.roundToInt((float) Math.ceil((double) Size.m2638getHeightimpl(j)));
            i3 = i4;
        } else {
            i3 = MathKt.roundToInt((float) Math.ceil((double) (Size.m2638getHeightimpl(drawScope.m3429getSizeNHjbRc()) - Offset.m2573getYimpl(j2))));
        }
        return ConstraintsKt.Constraints(i2, i, i4, i3);
    }
}
