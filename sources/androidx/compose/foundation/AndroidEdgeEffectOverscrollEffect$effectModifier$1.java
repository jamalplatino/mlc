package androidx.compose.foundation;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1", f = "AndroidOverscroll.kt", i = {}, l = {316}, m = "invokeSuspend", n = {}, s = {})
/* compiled from: AndroidOverscroll.kt */
final class AndroidEdgeEffectOverscrollEffect$effectModifier$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidEdgeEffectOverscrollEffect this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidEdgeEffectOverscrollEffect$effectModifier$1(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, Continuation<? super AndroidEdgeEffectOverscrollEffect$effectModifier$1> continuation) {
        super(2, continuation);
        this.this$0 = androidEdgeEffectOverscrollEffect;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AndroidEdgeEffectOverscrollEffect$effectModifier$1 androidEdgeEffectOverscrollEffect$effectModifier$1 = new AndroidEdgeEffectOverscrollEffect$effectModifier$1(this.this$0, continuation);
        androidEdgeEffectOverscrollEffect$effectModifier$1.L$0 = obj;
        return androidEdgeEffectOverscrollEffect$effectModifier$1;
    }

    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((AndroidEdgeEffectOverscrollEffect$effectModifier$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1$1", f = "AndroidOverscroll.kt", i = {0, 1}, l = {317, 321}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture"}, s = {"L$0", "L$0"})
    /* renamed from: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1$1  reason: invalid class name */
    /* compiled from: AndroidOverscroll.kt */
    static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 r0 = new AnonymousClass1(androidEdgeEffectOverscrollEffect, continuation);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v12, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v19, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: androidx.compose.ui.input.pointer.AwaitPointerEventScope} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0071  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x008d  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x00ad  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00cb  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00d4  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00ff  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x00c6 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r14.label
                r2 = 2
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L_0x002b
                if (r1 == r4) goto L_0x0023
                if (r1 != r2) goto L_0x001a
                java.lang.Object r1 = r14.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.ResultKt.throwOnFailure(r15)
                r5 = r1
                r1 = r0
                r0 = r14
                goto L_0x0076
            L_0x001a:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L_0x0023:
                java.lang.Object r1 = r14.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.ResultKt.throwOnFailure(r15)
                goto L_0x0046
            L_0x002b:
                kotlin.ResultKt.throwOnFailure(r15)
                java.lang.Object r15 = r14.L$0
                r1 = r15
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                r6 = 0
                r7 = 0
                r8 = r14
                kotlin.coroutines.Continuation r8 = (kotlin.coroutines.Continuation) r8
                r9 = 2
                r10 = 0
                r14.L$0 = r1
                r14.label = r4
                r5 = r1
                java.lang.Object r15 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r5, r6, r7, r8, r9, r10)
                if (r15 != r0) goto L_0x0046
                return r0
            L_0x0046:
                androidx.compose.ui.input.pointer.PointerInputChange r15 = (androidx.compose.ui.input.pointer.PointerInputChange) r15
                androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r5 = r3
                long r6 = r15.m4323getIdJ3iCeTQ()
                androidx.compose.ui.input.pointer.PointerId r6 = androidx.compose.ui.input.pointer.PointerId.m4306boximpl(r6)
                r5.pointerId = r6
                androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r5 = r3
                long r6 = r15.m4324getPositionF1C5BW0()
                androidx.compose.ui.geometry.Offset r15 = androidx.compose.ui.geometry.Offset.m2561boximpl(r6)
                r5.pointerPosition = r15
                r15 = r14
            L_0x0063:
                r5 = r15
                kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
                r15.L$0 = r1
                r15.label = r2
                java.lang.Object r5 = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(r1, r3, r5, r4, r3)
                if (r5 != r0) goto L_0x0071
                return r0
            L_0x0071:
                r13 = r0
                r0 = r15
                r15 = r5
                r5 = r1
                r1 = r13
            L_0x0076:
                androidx.compose.ui.input.pointer.PointerEvent r15 = (androidx.compose.ui.input.pointer.PointerEvent) r15
                java.util.List r15 = r15.getChanges()
                java.util.ArrayList r6 = new java.util.ArrayList
                int r7 = r15.size()
                r6.<init>(r7)
                int r7 = r15.size()
                r8 = 0
                r9 = r8
            L_0x008b:
                if (r9 >= r7) goto L_0x00a3
                java.lang.Object r10 = r15.get(r9)
                r11 = r10
                androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11
                boolean r11 = r11.getPressed()
                if (r11 == 0) goto L_0x00a0
                r11 = r6
                java.util.Collection r11 = (java.util.Collection) r11
                r11.add(r10)
            L_0x00a0:
                int r9 = r9 + 1
                goto L_0x008b
            L_0x00a3:
                java.util.List r6 = (java.util.List) r6
                androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r15 = r3
                int r7 = r6.size()
            L_0x00ab:
                if (r8 >= r7) goto L_0x00c6
                java.lang.Object r9 = r6.get(r8)
                r10 = r9
                androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.ui.input.pointer.PointerInputChange) r10
                long r10 = r10.m4323getIdJ3iCeTQ()
                androidx.compose.ui.input.pointer.PointerId r12 = r15.pointerId
                boolean r10 = androidx.compose.ui.input.pointer.PointerId.m4308equalsimpl(r10, r12)
                if (r10 == 0) goto L_0x00c3
                goto L_0x00c7
            L_0x00c3:
                int r8 = r8 + 1
                goto L_0x00ab
            L_0x00c6:
                r9 = r3
            L_0x00c7:
                androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.ui.input.pointer.PointerInputChange) r9
                if (r9 != 0) goto L_0x00d2
                java.lang.Object r15 = kotlin.collections.CollectionsKt.firstOrNull(r6)
                r9 = r15
                androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.ui.input.pointer.PointerInputChange) r9
            L_0x00d2:
                if (r9 == 0) goto L_0x00ee
                androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r15 = r3
                long r7 = r9.m4323getIdJ3iCeTQ()
                androidx.compose.ui.input.pointer.PointerId r7 = androidx.compose.ui.input.pointer.PointerId.m4306boximpl(r7)
                r15.pointerId = r7
                androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r15 = r3
                long r7 = r9.m4324getPositionF1C5BW0()
                androidx.compose.ui.geometry.Offset r7 = androidx.compose.ui.geometry.Offset.m2561boximpl(r7)
                r15.pointerPosition = r7
            L_0x00ee:
                java.util.Collection r6 = (java.util.Collection) r6
                boolean r15 = r6.isEmpty()
                r15 = r15 ^ r4
                if (r15 != 0) goto L_0x00ff
                androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r15 = r3
                r15.pointerId = r3
                kotlin.Unit r15 = kotlin.Unit.INSTANCE
                return r15
            L_0x00ff:
                r15 = r0
                r0 = r1
                r1 = r5
                goto L_0x0063
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect = this.this$0;
            this.label = 1;
            if (ForEachGestureKt.awaitEachGesture((PointerInputScope) this.L$0, new AnonymousClass1((Continuation<? super AnonymousClass1>) null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
