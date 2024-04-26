package androidx.compose.foundation.text.selection;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2", f = "TextSelectionMouseDetector.kt", i = {0, 0, 1, 1, 2, 2}, l = {89, 96, 111}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "clicksCounter", "$this$awaitEachGesture", "clicksCounter", "$this$awaitEachGesture", "clicksCounter"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
/* compiled from: TextSelectionMouseDetector.kt */
final class TextSelectionMouseDetectorKt$mouseSelectionDetector$2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MouseSelectionObserver $observer;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextSelectionMouseDetectorKt$mouseSelectionDetector$2(MouseSelectionObserver mouseSelectionObserver, Continuation<? super TextSelectionMouseDetectorKt$mouseSelectionDetector$2> continuation) {
        super(2, continuation);
        this.$observer = mouseSelectionObserver;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TextSelectionMouseDetectorKt$mouseSelectionDetector$2 textSelectionMouseDetectorKt$mouseSelectionDetector$2 = new TextSelectionMouseDetectorKt$mouseSelectionDetector$2(this.$observer, continuation);
        textSelectionMouseDetectorKt$mouseSelectionDetector$2.L$0 = obj;
        return textSelectionMouseDetectorKt$mouseSelectionDetector$2;
    }

    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
        return ((TextSelectionMouseDetectorKt$mouseSelectionDetector$2) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0055 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x009c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r12.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0035
            if (r1 == r4) goto L_0x0028
            if (r1 == r3) goto L_0x001b
            if (r1 != r2) goto L_0x0012
            goto L_0x001b
        L_0x0012:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x001b:
            java.lang.Object r1 = r12.L$1
            androidx.compose.foundation.text.selection.ClicksCounter r1 = (androidx.compose.foundation.text.selection.ClicksCounter) r1
            java.lang.Object r5 = r12.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
            kotlin.ResultKt.throwOnFailure(r13)
            r13 = r5
            goto L_0x0045
        L_0x0028:
            java.lang.Object r1 = r12.L$1
            androidx.compose.foundation.text.selection.ClicksCounter r1 = (androidx.compose.foundation.text.selection.ClicksCounter) r1
            java.lang.Object r5 = r12.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
            kotlin.ResultKt.throwOnFailure(r13)
            r6 = r12
            goto L_0x005a
        L_0x0035:
            kotlin.ResultKt.throwOnFailure(r13)
            java.lang.Object r13 = r12.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r13 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r13
            androidx.compose.foundation.text.selection.ClicksCounter r1 = new androidx.compose.foundation.text.selection.ClicksCounter
            androidx.compose.ui.platform.ViewConfiguration r5 = r13.getViewConfiguration()
            r1.<init>(r5)
        L_0x0045:
            r5 = r12
        L_0x0046:
            r6 = r5
            kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
            r5.L$0 = r13
            r5.L$1 = r1
            r5.label = r4
            java.lang.Object r6 = androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt.awaitMouseEventDown(r13, r6)
            if (r6 != r0) goto L_0x0056
            return r0
        L_0x0056:
            r11 = r5
            r5 = r13
            r13 = r6
            r6 = r11
        L_0x005a:
            androidx.compose.ui.input.pointer.PointerEvent r13 = (androidx.compose.ui.input.pointer.PointerEvent) r13
            r1.update(r13)
            java.util.List r7 = r13.getChanges()
            r8 = 0
            java.lang.Object r7 = r7.get(r8)
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
            boolean r13 = androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt.isShiftPressed(r13)
            if (r13 == 0) goto L_0x009c
            androidx.compose.foundation.text.selection.MouseSelectionObserver r13 = r6.$observer
            long r8 = r7.m4324getPositionF1C5BW0()
            boolean r13 = r13.m981onExtendk4lQ0M(r8)
            if (r13 == 0) goto L_0x00e4
            r7.consume()
            long r7 = r7.m4323getIdJ3iCeTQ()
            androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2$1 r13 = new androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2$1
            androidx.compose.foundation.text.selection.MouseSelectionObserver r9 = r6.$observer
            r13.<init>(r9)
            kotlin.jvm.functions.Function1 r13 = (kotlin.jvm.functions.Function1) r13
            r9 = r6
            kotlin.coroutines.Continuation r9 = (kotlin.coroutines.Continuation) r9
            r6.L$0 = r5
            r6.L$1 = r1
            r6.label = r3
            java.lang.Object r13 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m287dragjO51t88(r5, r7, r13, r9)
            if (r13 != r0) goto L_0x00e4
            return r0
        L_0x009c:
            int r13 = r1.getClicks()
            if (r13 == r4) goto L_0x00b2
            if (r13 == r3) goto L_0x00ab
            androidx.compose.foundation.text.selection.SelectionAdjustment$Companion r13 = androidx.compose.foundation.text.selection.SelectionAdjustment.Companion
            androidx.compose.foundation.text.selection.SelectionAdjustment r13 = r13.getParagraph()
            goto L_0x00b8
        L_0x00ab:
            androidx.compose.foundation.text.selection.SelectionAdjustment$Companion r13 = androidx.compose.foundation.text.selection.SelectionAdjustment.Companion
            androidx.compose.foundation.text.selection.SelectionAdjustment r13 = r13.getWord()
            goto L_0x00b8
        L_0x00b2:
            androidx.compose.foundation.text.selection.SelectionAdjustment$Companion r13 = androidx.compose.foundation.text.selection.SelectionAdjustment.Companion
            androidx.compose.foundation.text.selection.SelectionAdjustment r13 = r13.getNone()
        L_0x00b8:
            androidx.compose.foundation.text.selection.MouseSelectionObserver r8 = r6.$observer
            long r9 = r7.m4324getPositionF1C5BW0()
            boolean r8 = r8.m983onStart3MmeM6k(r9, r13)
            if (r8 == 0) goto L_0x00e4
            r7.consume()
            long r7 = r7.m4323getIdJ3iCeTQ()
            androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2$2 r9 = new androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2$2
            androidx.compose.foundation.text.selection.MouseSelectionObserver r10 = r6.$observer
            r9.<init>(r10, r13)
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            r13 = r6
            kotlin.coroutines.Continuation r13 = (kotlin.coroutines.Continuation) r13
            r6.L$0 = r5
            r6.L$1 = r1
            r6.label = r2
            java.lang.Object r13 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m287dragjO51t88(r5, r7, r9, r13)
            if (r13 != r0) goto L_0x00e4
            return r0
        L_0x00e4:
            r13 = r5
            r5 = r6
            goto L_0x0046
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
