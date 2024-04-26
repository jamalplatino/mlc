package androidx.compose.ui.draw;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ScaleFactorKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B?\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\u001d\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020,H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010/J\u001d\u00100\u001a\u0002012\u0006\u00102\u001a\u000201H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b3\u0010/J\b\u00104\u001a\u000205H\u0016J\f\u00106\u001a\u000207*\u000208H\u0016J\u0019\u00109\u001a\u00020\u0007*\u00020,H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b:\u0010;J\u0019\u0010<\u001a\u00020\u0007*\u00020,H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b=\u0010;J\u001c\u0010>\u001a\u00020?*\u00020@2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020?H\u0016J\u001c\u0010D\u001a\u00020?*\u00020@2\u0006\u0010A\u001a\u00020B2\u0006\u0010E\u001a\u00020?H\u0016J)\u0010F\u001a\u00020G*\u00020H2\u0006\u0010A\u001a\u00020I2\u0006\u00102\u001a\u000201H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bJ\u0010KJ\u001c\u0010L\u001a\u00020?*\u00020@2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020?H\u0016J\u001c\u0010M\u001a\u00020?*\u00020@2\u0006\u0010A\u001a\u00020B2\u0006\u0010E\u001a\u00020?H\u0016R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u00078BX\u0004¢\u0006\u0006\u001a\u0004\b*\u0010&\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006N"}, d2 = {"Landroidx/compose/ui/draw/PainterModifierNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "sizeToIntrinsics", "", "alignment", "Landroidx/compose/ui/Alignment;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "(Landroidx/compose/ui/graphics/painter/Painter;ZLandroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;)V", "getAlignment", "()Landroidx/compose/ui/Alignment;", "setAlignment", "(Landroidx/compose/ui/Alignment;)V", "getAlpha", "()F", "setAlpha", "(F)V", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "getContentScale", "()Landroidx/compose/ui/layout/ContentScale;", "setContentScale", "(Landroidx/compose/ui/layout/ContentScale;)V", "getPainter", "()Landroidx/compose/ui/graphics/painter/Painter;", "setPainter", "(Landroidx/compose/ui/graphics/painter/Painter;)V", "getSizeToIntrinsics", "()Z", "setSizeToIntrinsics", "(Z)V", "useIntrinsicSize", "getUseIntrinsicSize", "calculateScaledSize", "Landroidx/compose/ui/geometry/Size;", "dstSize", "calculateScaledSize-E7KxVPU", "(J)J", "modifyConstraints", "Landroidx/compose/ui/unit/Constraints;", "constraints", "modifyConstraints-ZezNO4M", "toString", "", "draw", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "hasSpecifiedAndFiniteHeight", "hasSpecifiedAndFiniteHeight-uvyYCjk", "(J)Z", "hasSpecifiedAndFiniteWidth", "hasSpecifiedAndFiniteWidth-uvyYCjk", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: PainterModifier.kt */
final class PainterModifierNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode {
    private Alignment alignment;
    private float alpha;
    private ColorFilter colorFilter;
    private ContentScale contentScale;
    private Painter painter;
    private boolean sizeToIntrinsics;

    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    public final ContentScale getContentScale() {
        return this.contentScale;
    }

    public final Painter getPainter() {
        return this.painter;
    }

    public final boolean getSizeToIntrinsics() {
        return this.sizeToIntrinsics;
    }

    public final void setAlignment(Alignment alignment2) {
        Intrinsics.checkNotNullParameter(alignment2, "<set-?>");
        this.alignment = alignment2;
    }

    public final void setAlpha(float f) {
        this.alpha = f;
    }

    public final void setColorFilter(ColorFilter colorFilter2) {
        this.colorFilter = colorFilter2;
    }

    public final void setContentScale(ContentScale contentScale2) {
        Intrinsics.checkNotNullParameter(contentScale2, "<set-?>");
        this.contentScale = contentScale2;
    }

    public final void setPainter(Painter painter2) {
        Intrinsics.checkNotNullParameter(painter2, "<set-?>");
        this.painter = painter2;
    }

    public final void setSizeToIntrinsics(boolean z) {
        this.sizeToIntrinsics = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PainterModifierNode(Painter painter2, boolean z, Alignment alignment2, ContentScale contentScale2, float f, ColorFilter colorFilter2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(painter2, z, (i & 4) != 0 ? Alignment.Companion.getCenter() : alignment2, (i & 8) != 0 ? ContentScale.Companion.getInside() : contentScale2, (i & 16) != 0 ? 1.0f : f, (i & 32) != 0 ? null : colorFilter2);
    }

    public PainterModifierNode(Painter painter2, boolean z, Alignment alignment2, ContentScale contentScale2, float f, ColorFilter colorFilter2) {
        Intrinsics.checkNotNullParameter(painter2, "painter");
        Intrinsics.checkNotNullParameter(alignment2, "alignment");
        Intrinsics.checkNotNullParameter(contentScale2, "contentScale");
        this.painter = painter2;
        this.sizeToIntrinsics = z;
        this.alignment = alignment2;
        this.contentScale = contentScale2;
        this.alpha = f;
        this.colorFilter = colorFilter2;
    }

    private final boolean getUseIntrinsicSize() {
        return this.sizeToIntrinsics && this.painter.m3524getIntrinsicSizeNHjbRc() != Size.Companion.m2649getUnspecifiedNHjbRc();
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public MeasureResult m2487measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        Intrinsics.checkNotNullParameter(measureScope, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        Placeable r9 = measurable.m4520measureBRTryo0(m2486modifyConstraintsZezNO4M(j));
        return MeasureScope.layout$default(measureScope, r9.getWidth(), r9.getHeight(), (Map) null, new PainterModifierNode$measure$1(r9), 4, (Object) null);
    }

    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(intrinsicMeasurable, "measurable");
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.minIntrinsicWidth(i);
        }
        long r0 = m2486modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i, 7, (Object) null));
        return Math.max(Constraints.m5572getMinWidthimpl(r0), intrinsicMeasurable.minIntrinsicWidth(i));
    }

    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(intrinsicMeasurable, "measurable");
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.maxIntrinsicWidth(i);
        }
        long r0 = m2486modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i, 7, (Object) null));
        return Math.max(Constraints.m5572getMinWidthimpl(r0), intrinsicMeasurable.maxIntrinsicWidth(i));
    }

    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(intrinsicMeasurable, "measurable");
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.minIntrinsicHeight(i);
        }
        long r0 = m2486modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i, 0, 0, 13, (Object) null));
        return Math.max(Constraints.m5571getMinHeightimpl(r0), intrinsicMeasurable.minIntrinsicHeight(i));
    }

    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(intrinsicMeasurable, "measurable");
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.maxIntrinsicHeight(i);
        }
        long r0 = m2486modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i, 0, 0, 13, (Object) null));
        return Math.max(Constraints.m5571getMinHeightimpl(r0), intrinsicMeasurable.maxIntrinsicHeight(i));
    }

    /* renamed from: calculateScaledSize-E7KxVPU  reason: not valid java name */
    private final long m2483calculateScaledSizeE7KxVPU(long j) {
        float f;
        float f2;
        if (!getUseIntrinsicSize()) {
            return j;
        }
        if (!m2485hasSpecifiedAndFiniteWidthuvyYCjk(this.painter.m3524getIntrinsicSizeNHjbRc())) {
            f = Size.m2641getWidthimpl(j);
        } else {
            f = Size.m2641getWidthimpl(this.painter.m3524getIntrinsicSizeNHjbRc());
        }
        if (!m2484hasSpecifiedAndFiniteHeightuvyYCjk(this.painter.m3524getIntrinsicSizeNHjbRc())) {
            f2 = Size.m2638getHeightimpl(j);
        } else {
            f2 = Size.m2638getHeightimpl(this.painter.m3524getIntrinsicSizeNHjbRc());
        }
        long Size = SizeKt.Size(f, f2);
        if (Size.m2641getWidthimpl(j) == 0.0f || Size.m2638getHeightimpl(j) == 0.0f) {
            return Size.Companion.m2650getZeroNHjbRc();
        }
        return ScaleFactorKt.m4595timesUQTWf7w(Size, this.contentScale.m4463computeScaleFactorH7hwNQA(Size, j));
    }

    /* renamed from: modifyConstraints-ZezNO4M  reason: not valid java name */
    private final long m2486modifyConstraintsZezNO4M(long j) {
        int i;
        int i2;
        boolean z = true;
        boolean z2 = Constraints.m5566getHasBoundedWidthimpl(j) && Constraints.m5565getHasBoundedHeightimpl(j);
        if (!Constraints.m5568getHasFixedWidthimpl(j) || !Constraints.m5567getHasFixedHeightimpl(j)) {
            z = false;
        }
        if ((getUseIntrinsicSize() || !z2) && !z) {
            long r0 = this.painter.m3524getIntrinsicSizeNHjbRc();
            if (m2485hasSpecifiedAndFiniteWidthuvyYCjk(r0)) {
                i = MathKt.roundToInt(Size.m2641getWidthimpl(r0));
            } else {
                i = Constraints.m5572getMinWidthimpl(j);
            }
            if (m2484hasSpecifiedAndFiniteHeightuvyYCjk(r0)) {
                i2 = MathKt.roundToInt(Size.m2638getHeightimpl(r0));
            } else {
                i2 = Constraints.m5571getMinHeightimpl(j);
            }
            long r02 = m2483calculateScaledSizeE7KxVPU(SizeKt.Size((float) ConstraintsKt.m5584constrainWidthK40F9xA(j, i), (float) ConstraintsKt.m5583constrainHeightK40F9xA(j, i2)));
            return Constraints.m5561copyZbe2FdA$default(j, ConstraintsKt.m5584constrainWidthK40F9xA(j, MathKt.roundToInt(Size.m2641getWidthimpl(r02))), 0, ConstraintsKt.m5583constrainHeightK40F9xA(j, MathKt.roundToInt(Size.m2638getHeightimpl(r02))), 0, 10, (Object) null);
        }
        return Constraints.m5561copyZbe2FdA$default(j, Constraints.m5570getMaxWidthimpl(j), 0, Constraints.m5569getMaxHeightimpl(j), 0, 10, (Object) null);
    }

    public void draw(ContentDrawScope contentDrawScope) {
        float f;
        float f2;
        long j;
        Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
        long r0 = this.painter.m3524getIntrinsicSizeNHjbRc();
        if (m2485hasSpecifiedAndFiniteWidthuvyYCjk(r0)) {
            f = Size.m2641getWidthimpl(r0);
        } else {
            f = Size.m2641getWidthimpl(contentDrawScope.m3429getSizeNHjbRc());
        }
        if (m2484hasSpecifiedAndFiniteHeightuvyYCjk(r0)) {
            f2 = Size.m2638getHeightimpl(r0);
        } else {
            f2 = Size.m2638getHeightimpl(contentDrawScope.m3429getSizeNHjbRc());
        }
        long Size = SizeKt.Size(f, f2);
        if (Size.m2641getWidthimpl(contentDrawScope.m3429getSizeNHjbRc()) == 0.0f || Size.m2638getHeightimpl(contentDrawScope.m3429getSizeNHjbRc()) == 0.0f) {
            j = Size.Companion.m2650getZeroNHjbRc();
        } else {
            j = ScaleFactorKt.m4595timesUQTWf7w(Size, this.contentScale.m4463computeScaleFactorH7hwNQA(Size, contentDrawScope.m3429getSizeNHjbRc()));
        }
        long j2 = j;
        long r02 = this.alignment.m2462alignKFBX0sM(IntSizeKt.IntSize(MathKt.roundToInt(Size.m2641getWidthimpl(j2)), MathKt.roundToInt(Size.m2638getHeightimpl(j2))), IntSizeKt.IntSize(MathKt.roundToInt(Size.m2641getWidthimpl(contentDrawScope.m3429getSizeNHjbRc())), MathKt.roundToInt(Size.m2638getHeightimpl(contentDrawScope.m3429getSizeNHjbRc()))), contentDrawScope.getLayoutDirection());
        float r8 = (float) IntOffset.m5744getXimpl(r02);
        float r03 = (float) IntOffset.m5745getYimpl(r02);
        DrawScope drawScope = contentDrawScope;
        drawScope.getDrawContext().getTransform().translate(r8, r03);
        this.painter.m3523drawx_KDEd0(drawScope, j2, this.alpha, this.colorFilter);
        drawScope.getDrawContext().getTransform().translate(-r8, -r03);
        contentDrawScope.drawContent();
    }

    /* renamed from: hasSpecifiedAndFiniteWidth-uvyYCjk  reason: not valid java name */
    private final boolean m2485hasSpecifiedAndFiniteWidthuvyYCjk(long j) {
        if (!Size.m2637equalsimpl0(j, Size.Companion.m2649getUnspecifiedNHjbRc())) {
            float r3 = Size.m2641getWidthimpl(j);
            return !Float.isInfinite(r3) && !Float.isNaN(r3);
        }
    }

    /* renamed from: hasSpecifiedAndFiniteHeight-uvyYCjk  reason: not valid java name */
    private final boolean m2484hasSpecifiedAndFiniteHeightuvyYCjk(long j) {
        if (!Size.m2637equalsimpl0(j, Size.Companion.m2649getUnspecifiedNHjbRc())) {
            float r3 = Size.m2638getHeightimpl(j);
            return !Float.isInfinite(r3) && !Float.isNaN(r3);
        }
    }

    public String toString() {
        return "PainterModifier(painter=" + this.painter + ", sizeToIntrinsics=" + this.sizeToIntrinsics + ", alignment=" + this.alignment + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }
}
