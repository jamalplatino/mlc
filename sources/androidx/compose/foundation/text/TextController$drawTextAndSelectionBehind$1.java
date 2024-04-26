package androidx.compose.foundation.text;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: CoreText.kt */
final class TextController$drawTextAndSelectionBehind$1 extends Lambda implements Function1<DrawScope, Unit> {
    final /* synthetic */ TextController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextController$drawTextAndSelectionBehind$1(TextController textController) {
        super(1);
        this.this$0 = textController;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DrawScope) obj);
        return Unit.INSTANCE;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0024, code lost:
        r3 = r3.getSubselections();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.ui.graphics.drawscope.DrawScope r22) {
        /*
            r21 = this;
            r0 = r21
            java.lang.String r1 = "$this$drawBehind"
            r12 = r22
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r1)
            androidx.compose.foundation.text.TextController r1 = r0.this$0
            androidx.compose.foundation.text.TextState r1 = r1.getState()
            androidx.compose.ui.text.TextLayoutResult r1 = r1.getLayoutResult()
            if (r1 == 0) goto L_0x011b
            androidx.compose.foundation.text.TextController r2 = r0.this$0
            androidx.compose.foundation.text.TextState r3 = r2.getState()
            r3.getDrawScopeInvalidation()
            androidx.compose.foundation.text.selection.SelectionRegistrar r3 = r2.selectionRegistrar
            if (r3 == 0) goto L_0x003d
            java.util.Map r3 = r3.getSubselections()
            if (r3 == 0) goto L_0x003d
            androidx.compose.foundation.text.TextState r4 = r2.getState()
            long r4 = r4.getSelectableId()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.Object r3 = r3.get(r4)
            androidx.compose.foundation.text.selection.Selection r3 = (androidx.compose.foundation.text.selection.Selection) r3
            goto L_0x003e
        L_0x003d:
            r3 = 0
        L_0x003e:
            androidx.compose.foundation.text.TextState r4 = r2.getState()
            androidx.compose.foundation.text.selection.Selectable r4 = r4.getSelectable()
            r5 = 0
            if (r4 == 0) goto L_0x004e
            int r4 = r4.getLastVisibleOffset()
            goto L_0x004f
        L_0x004e:
            r4 = r5
        L_0x004f:
            if (r3 == 0) goto L_0x010e
            boolean r6 = r3.getHandlesCrossed()
            if (r6 != 0) goto L_0x0060
            androidx.compose.foundation.text.selection.Selection$AnchorInfo r6 = r3.getStart()
            int r6 = r6.getOffset()
            goto L_0x0068
        L_0x0060:
            androidx.compose.foundation.text.selection.Selection$AnchorInfo r6 = r3.getEnd()
            int r6 = r6.getOffset()
        L_0x0068:
            int r6 = kotlin.ranges.RangesKt.coerceIn((int) r6, (int) r5, (int) r4)
            boolean r7 = r3.getHandlesCrossed()
            if (r7 != 0) goto L_0x007b
            androidx.compose.foundation.text.selection.Selection$AnchorInfo r3 = r3.getEnd()
            int r3 = r3.getOffset()
            goto L_0x0083
        L_0x007b:
            androidx.compose.foundation.text.selection.Selection$AnchorInfo r3 = r3.getStart()
            int r3 = r3.getOffset()
        L_0x0083:
            int r3 = kotlin.ranges.RangesKt.coerceIn((int) r3, (int) r5, (int) r4)
            if (r6 == r3) goto L_0x010e
            androidx.compose.ui.text.MultiParagraph r4 = r1.getMultiParagraph()
            androidx.compose.ui.graphics.Path r3 = r4.getPathForRange(r6, r3)
            androidx.compose.ui.text.TextLayoutInput r4 = r1.getLayoutInput()
            int r4 = r4.m5100getOverflowgIe3tQ8()
            androidx.compose.ui.text.style.TextOverflow$Companion r5 = androidx.compose.ui.text.style.TextOverflow.Companion
            int r5 = r5.m5557getVisiblegIe3tQ8()
            boolean r4 = androidx.compose.ui.text.style.TextOverflow.m5548equalsimpl0(r4, r5)
            if (r4 == 0) goto L_0x00ba
            androidx.compose.foundation.text.TextState r2 = r2.getState()
            long r4 = r2.m970getSelectionBackgroundColor0d7_KjU()
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 60
            r11 = 0
            r2 = r22
            androidx.compose.ui.graphics.drawscope.DrawScope.m3401drawPathLG529CI$default(r2, r3, r4, r6, r7, r8, r9, r10, r11)
            goto L_0x010e
        L_0x00ba:
            r14 = 0
            r15 = 0
            long r4 = r22.m3429getSizeNHjbRc()
            float r16 = androidx.compose.ui.geometry.Size.m2641getWidthimpl(r4)
            long r4 = r22.m3429getSizeNHjbRc()
            float r17 = androidx.compose.ui.geometry.Size.m2638getHeightimpl(r4)
            androidx.compose.ui.graphics.ClipOp$Companion r4 = androidx.compose.ui.graphics.ClipOp.Companion
            int r18 = r4.m2810getIntersectrtfAjoo()
            androidx.compose.ui.graphics.drawscope.DrawContext r11 = r22.getDrawContext()
            long r9 = r11.m3372getSizeNHjbRc()
            androidx.compose.ui.graphics.Canvas r4 = r11.getCanvas()
            r4.save()
            androidx.compose.ui.graphics.drawscope.DrawTransform r13 = r11.getTransform()
            r13.m3484clipRectN_I0leg(r14, r15, r16, r17, r18)
            androidx.compose.foundation.text.TextState r2 = r2.getState()
            long r4 = r2.m970getSelectionBackgroundColor0d7_KjU()
            r6 = 0
            r7 = 0
            r8 = 0
            r13 = 0
            r14 = 60
            r15 = 0
            r2 = r22
            r19 = r9
            r9 = r13
            r10 = r14
            r13 = r11
            r11 = r15
            androidx.compose.ui.graphics.drawscope.DrawScope.m3401drawPathLG529CI$default(r2, r3, r4, r6, r7, r8, r9, r10, r11)
            androidx.compose.ui.graphics.Canvas r2 = r13.getCanvas()
            r2.restore()
            r2 = r19
            r13.m3373setSizeuvyYCjk(r2)
        L_0x010e:
            androidx.compose.ui.graphics.drawscope.DrawContext r2 = r22.getDrawContext()
            androidx.compose.ui.graphics.Canvas r2 = r2.getCanvas()
            androidx.compose.foundation.text.TextDelegate$Companion r3 = androidx.compose.foundation.text.TextDelegate.Companion
            r3.paint(r2, r1)
        L_0x011b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextController$drawTextAndSelectionBehind$1.invoke(androidx.compose.ui.graphics.drawscope.DrawScope):void");
    }
}
