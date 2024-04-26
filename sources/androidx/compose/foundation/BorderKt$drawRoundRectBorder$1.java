package androidx.compose.foundation;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Stroke;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: Border.kt */
final class BorderKt$drawRoundRectBorder$1 extends Lambda implements Function1<ContentDrawScope, Unit> {
    final /* synthetic */ long $borderSize;
    final /* synthetic */ Stroke $borderStroke;
    final /* synthetic */ Brush $brush;
    final /* synthetic */ long $cornerRadius;
    final /* synthetic */ boolean $fillArea;
    final /* synthetic */ float $halfStroke;
    final /* synthetic */ float $strokeWidth;
    final /* synthetic */ long $topLeft;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BorderKt$drawRoundRectBorder$1(boolean z, Brush brush, long j, float f, float f2, long j2, long j3, Stroke stroke) {
        super(1);
        this.$fillArea = z;
        this.$brush = brush;
        this.$cornerRadius = j;
        this.$halfStroke = f;
        this.$strokeWidth = f2;
        this.$topLeft = j2;
        this.$borderSize = j3;
        this.$borderStroke = stroke;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ContentDrawScope) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(ContentDrawScope contentDrawScope) {
        ContentDrawScope contentDrawScope2 = contentDrawScope;
        Intrinsics.checkNotNullParameter(contentDrawScope2, "$this$onDrawWithContent");
        contentDrawScope.drawContent();
        if (this.$fillArea) {
            DrawScope.m3406drawRoundRectZuiqVtQ$default(contentDrawScope2, this.$brush, 0, 0, this.$cornerRadius, 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 246, (Object) null);
            return;
        }
        float r2 = CornerRadius.m2547getXimpl(this.$cornerRadius);
        float f = this.$halfStroke;
        if (r2 < f) {
            DrawScope drawScope = contentDrawScope2;
            float f2 = this.$strokeWidth;
            float r8 = Size.m2641getWidthimpl(contentDrawScope.m3429getSizeNHjbRc()) - this.$strokeWidth;
            float r9 = Size.m2638getHeightimpl(contentDrawScope.m3429getSizeNHjbRc()) - this.$strokeWidth;
            int r10 = ClipOp.Companion.m2809getDifferencertfAjoo();
            Brush brush = this.$brush;
            long j = this.$cornerRadius;
            DrawContext drawContext = drawScope.getDrawContext();
            long r13 = drawContext.m3372getSizeNHjbRc();
            drawContext.getCanvas().save();
            drawContext.getTransform().m3484clipRectN_I0leg(f2, f2, r8, r9, r10);
            DrawContext drawContext2 = drawContext;
            DrawScope.m3406drawRoundRectZuiqVtQ$default(drawScope, brush, 0, 0, j, 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 246, (Object) null);
            drawContext2.getCanvas().restore();
            drawContext2.m3373setSizeuvyYCjk(r13);
            return;
        }
        DrawScope.m3406drawRoundRectZuiqVtQ$default(contentDrawScope2, this.$brush, this.$topLeft, this.$borderSize, BorderKt.m197shrinkKibmq7A(this.$cornerRadius, f), 0.0f, this.$borderStroke, (ColorFilter) null, 0, 208, (Object) null);
    }
}
