package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.ScrollScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2", f = "LazyAnimateScroll.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1}, l = {137, 233}, m = "invokeSuspend", n = {"$this$scroll", "loop", "anim", "loops", "targetDistancePx", "boundDistancePx", "minDistancePx", "forward", "$this$scroll"}, s = {"L$0", "L$1", "L$2", "L$3", "F$0", "F$1", "F$2", "I$0", "L$0"})
/* compiled from: LazyAnimateScroll.kt */
final class LazyAnimateScrollKt$animateScrollToItem$2 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $index;
    final /* synthetic */ int $scrollOffset;
    final /* synthetic */ LazyAnimateScrollScope $this_animateScrollToItem;
    float F$0;
    float F$1;
    float F$2;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyAnimateScrollKt$animateScrollToItem$2(int i, LazyAnimateScrollScope lazyAnimateScrollScope, int i2, Continuation<? super LazyAnimateScrollKt$animateScrollToItem$2> continuation) {
        super(2, continuation);
        this.$index = i;
        this.$this_animateScrollToItem = lazyAnimateScrollScope;
        this.$scrollOffset = i2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LazyAnimateScrollKt$animateScrollToItem$2 lazyAnimateScrollKt$animateScrollToItem$2 = new LazyAnimateScrollKt$animateScrollToItem$2(this.$index, this.$this_animateScrollToItem, this.$scrollOffset, continuation);
        lazyAnimateScrollKt$animateScrollToItem$2.L$0 = obj;
        return lazyAnimateScrollKt$animateScrollToItem$2;
    }

    public final Object invoke(ScrollScope scrollScope, Continuation<? super Unit> continuation) {
        return ((LazyAnimateScrollKt$animateScrollToItem$2) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: androidx.compose.foundation.gestures.ScrollScope} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00f4 A[SYNTHETIC, Splitter:B:35:0x00f4] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0149 A[Catch:{ ItemFoundInScroll -> 0x01ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x014c A[Catch:{ ItemFoundInScroll -> 0x01ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0156 A[Catch:{ ItemFoundInScroll -> 0x01ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0159 A[Catch:{ ItemFoundInScroll -> 0x01ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0248 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r36) {
        /*
            r35 = this;
            r1 = r35
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r1.label
            r3 = 2
            r4 = 0
            r6 = 1
            if (r0 == 0) goto L_0x0054
            if (r0 == r6) goto L_0x0024
            if (r0 != r3) goto L_0x001b
            java.lang.Object r0 = r1.L$0
            androidx.compose.foundation.gestures.ScrollScope r0 = (androidx.compose.foundation.gestures.ScrollScope) r0
            kotlin.ResultKt.throwOnFailure(r36)
            r9 = r1
            goto L_0x0249
        L_0x001b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0024:
            int r0 = r1.I$0
            float r7 = r1.F$2
            float r8 = r1.F$1
            float r9 = r1.F$0
            java.lang.Object r10 = r1.L$3
            kotlin.jvm.internal.Ref$IntRef r10 = (kotlin.jvm.internal.Ref.IntRef) r10
            java.lang.Object r11 = r1.L$2
            kotlin.jvm.internal.Ref$ObjectRef r11 = (kotlin.jvm.internal.Ref.ObjectRef) r11
            java.lang.Object r12 = r1.L$1
            kotlin.jvm.internal.Ref$BooleanRef r12 = (kotlin.jvm.internal.Ref.BooleanRef) r12
            java.lang.Object r13 = r1.L$0
            androidx.compose.foundation.gestures.ScrollScope r13 = (androidx.compose.foundation.gestures.ScrollScope) r13
            kotlin.ResultKt.throwOnFailure(r36)     // Catch:{ ItemFoundInScroll -> 0x004e }
            r15 = r8
            r14 = r9
            r9 = r1
            r33 = r13
            r13 = r10
            r10 = r33
            r34 = r12
            r12 = r11
            r11 = r34
            goto L_0x01b3
        L_0x004e:
            r0 = move-exception
            r9 = r1
            r1 = r0
            r0 = r13
            goto L_0x01e8
        L_0x0054:
            kotlin.ResultKt.throwOnFailure(r36)
            java.lang.Object r0 = r1.L$0
            r7 = r0
            androidx.compose.foundation.gestures.ScrollScope r7 = (androidx.compose.foundation.gestures.ScrollScope) r7
            int r0 = r1.$index
            float r8 = (float) r0
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r8 < 0) goto L_0x0065
            r8 = r6
            goto L_0x0066
        L_0x0065:
            r8 = 0
        L_0x0066:
            if (r8 == 0) goto L_0x0255
            androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope r0 = r1.$this_animateScrollToItem     // Catch:{ ItemFoundInScroll -> 0x01e3 }
            androidx.compose.ui.unit.Density r0 = r0.getDensity()     // Catch:{ ItemFoundInScroll -> 0x01e3 }
            float r8 = androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt.TargetDistance     // Catch:{ ItemFoundInScroll -> 0x01e3 }
            float r0 = r0.m5607toPx0680j_4(r8)     // Catch:{ ItemFoundInScroll -> 0x01e3 }
            androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope r8 = r1.$this_animateScrollToItem     // Catch:{ ItemFoundInScroll -> 0x01e3 }
            androidx.compose.ui.unit.Density r8 = r8.getDensity()     // Catch:{ ItemFoundInScroll -> 0x01e3 }
            float r9 = androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt.BoundDistance     // Catch:{ ItemFoundInScroll -> 0x01e3 }
            float r8 = r8.m5607toPx0680j_4(r9)     // Catch:{ ItemFoundInScroll -> 0x01e3 }
            androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope r9 = r1.$this_animateScrollToItem     // Catch:{ ItemFoundInScroll -> 0x01e3 }
            androidx.compose.ui.unit.Density r9 = r9.getDensity()     // Catch:{ ItemFoundInScroll -> 0x01e3 }
            float r10 = androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt.MinimumDistance     // Catch:{ ItemFoundInScroll -> 0x01e3 }
            float r9 = r9.m5607toPx0680j_4(r10)     // Catch:{ ItemFoundInScroll -> 0x01e3 }
            kotlin.jvm.internal.Ref$BooleanRef r10 = new kotlin.jvm.internal.Ref$BooleanRef     // Catch:{ ItemFoundInScroll -> 0x01e3 }
            r10.<init>()     // Catch:{ ItemFoundInScroll -> 0x01e3 }
            r10.element = r6     // Catch:{ ItemFoundInScroll -> 0x01e3 }
            kotlin.jvm.internal.Ref$ObjectRef r11 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch:{ ItemFoundInScroll -> 0x01e3 }
            r11.<init>()     // Catch:{ ItemFoundInScroll -> 0x01e3 }
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r18 = 0
            r19 = 30
            r20 = 0
            androidx.compose.animation.core.AnimationState r12 = androidx.compose.animation.core.AnimationStateKt.AnimationState$default(r12, r13, r14, r16, r18, r19, r20)     // Catch:{ ItemFoundInScroll -> 0x01e3 }
            r11.element = r12     // Catch:{ ItemFoundInScroll -> 0x01e3 }
            androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope r12 = r1.$this_animateScrollToItem     // Catch:{ ItemFoundInScroll -> 0x01e3 }
            int r13 = r1.$index     // Catch:{ ItemFoundInScroll -> 0x01e3 }
            java.lang.Integer r12 = r12.getTargetItemOffset(r13)     // Catch:{ ItemFoundInScroll -> 0x01e3 }
            if (r12 != 0) goto L_0x01d5
            int r12 = r1.$index     // Catch:{ ItemFoundInScroll -> 0x01e3 }
            androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope r13 = r1.$this_animateScrollToItem     // Catch:{ ItemFoundInScroll -> 0x01e3 }
            int r13 = r13.getFirstVisibleItemIndex()     // Catch:{ ItemFoundInScroll -> 0x01e3 }
            if (r12 <= r13) goto L_0x00c6
            r12 = r6
            goto L_0x00c7
        L_0x00c6:
            r12 = 0
        L_0x00c7:
            kotlin.jvm.internal.Ref$IntRef r13 = new kotlin.jvm.internal.Ref$IntRef     // Catch:{ ItemFoundInScroll -> 0x01e3 }
            r13.<init>()     // Catch:{ ItemFoundInScroll -> 0x01e3 }
            r13.element = r6     // Catch:{ ItemFoundInScroll -> 0x01e3 }
            r14 = r0
            r15 = r8
            r0 = r12
            r12 = r11
            r11 = r10
            r10 = r7
            r7 = r9
            r9 = r1
        L_0x00d6:
            boolean r8 = r11.element     // Catch:{ ItemFoundInScroll -> 0x01ce }
            if (r8 == 0) goto L_0x0252
            androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope r8 = r9.$this_animateScrollToItem     // Catch:{ ItemFoundInScroll -> 0x01ce }
            int r8 = r8.getItemCount()     // Catch:{ ItemFoundInScroll -> 0x01ce }
            if (r8 <= 0) goto L_0x0252
            androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope r8 = r9.$this_animateScrollToItem     // Catch:{ ItemFoundInScroll -> 0x01ce }
            int r5 = r9.$index     // Catch:{ ItemFoundInScroll -> 0x01ce }
            int r3 = r9.$scrollOffset     // Catch:{ ItemFoundInScroll -> 0x01ce }
            float r3 = r8.expectedDistanceTo(r5, r3)     // Catch:{ ItemFoundInScroll -> 0x01ce }
            float r5 = java.lang.Math.abs(r3)     // Catch:{ ItemFoundInScroll -> 0x01ce }
            int r5 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r5 >= 0) goto L_0x0101
            float r3 = java.lang.Math.abs(r3)     // Catch:{ ItemFoundInScroll -> 0x01c0 }
            float r3 = java.lang.Math.max(r3, r7)     // Catch:{ ItemFoundInScroll -> 0x01c0 }
            if (r0 == 0) goto L_0x00ff
            goto L_0x0106
        L_0x00ff:
            float r3 = -r3
            goto L_0x0106
        L_0x0101:
            if (r0 == 0) goto L_0x0105
            r3 = r14
            goto L_0x0106
        L_0x0105:
            float r3 = -r14
        L_0x0106:
            int r5 = r9.$index     // Catch:{ ItemFoundInScroll -> 0x01ce }
            int r5 = r9.$scrollOffset     // Catch:{ ItemFoundInScroll -> 0x01ce }
            androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope r5 = r9.$this_animateScrollToItem     // Catch:{ ItemFoundInScroll -> 0x01ce }
            T r5 = r12.element     // Catch:{ ItemFoundInScroll -> 0x01ce }
            r21 = r5
            androidx.compose.animation.core.AnimationState r21 = (androidx.compose.animation.core.AnimationState) r21     // Catch:{ ItemFoundInScroll -> 0x01ce }
            r22 = 0
            r23 = 0
            r24 = 0
            r26 = 0
            r28 = 0
            r29 = 30
            r30 = 0
            androidx.compose.animation.core.AnimationState r5 = androidx.compose.animation.core.AnimationStateKt.copy$default((androidx.compose.animation.core.AnimationState) r21, (float) r22, (float) r23, (long) r24, (long) r26, (boolean) r28, (int) r29, (java.lang.Object) r30)     // Catch:{ ItemFoundInScroll -> 0x01ce }
            r12.element = r5     // Catch:{ ItemFoundInScroll -> 0x01ce }
            kotlin.jvm.internal.Ref$FloatRef r5 = new kotlin.jvm.internal.Ref$FloatRef     // Catch:{ ItemFoundInScroll -> 0x01ce }
            r5.<init>()     // Catch:{ ItemFoundInScroll -> 0x01ce }
            T r8 = r12.element     // Catch:{ ItemFoundInScroll -> 0x01ce }
            r21 = r8
            androidx.compose.animation.core.AnimationState r21 = (androidx.compose.animation.core.AnimationState) r21     // Catch:{ ItemFoundInScroll -> 0x01ce }
            java.lang.Float r22 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r3)     // Catch:{ ItemFoundInScroll -> 0x01ce }
            r23 = 0
            T r8 = r12.element     // Catch:{ ItemFoundInScroll -> 0x01ce }
            androidx.compose.animation.core.AnimationState r8 = (androidx.compose.animation.core.AnimationState) r8     // Catch:{ ItemFoundInScroll -> 0x01ce }
            java.lang.Object r8 = r8.getVelocity()     // Catch:{ ItemFoundInScroll -> 0x01ce }
            java.lang.Number r8 = (java.lang.Number) r8     // Catch:{ ItemFoundInScroll -> 0x01ce }
            float r8 = r8.floatValue()     // Catch:{ ItemFoundInScroll -> 0x01ce }
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r8 != 0) goto L_0x014c
            r24 = 0
            goto L_0x014e
        L_0x014c:
            r24 = r6
        L_0x014e:
            androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2$3 r25 = new androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2$3     // Catch:{ ItemFoundInScroll -> 0x01ce }
            androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope r8 = r9.$this_animateScrollToItem     // Catch:{ ItemFoundInScroll -> 0x01ce }
            int r4 = r9.$index     // Catch:{ ItemFoundInScroll -> 0x01ce }
            if (r0 == 0) goto L_0x0159
            r16 = r6
            goto L_0x015b
        L_0x0159:
            r16 = 0
        L_0x015b:
            int r6 = r9.$scrollOffset     // Catch:{ ItemFoundInScroll -> 0x01ce }
            r17 = r8
            r8 = r25
            r1 = r9
            r9 = r17
            r36 = r10
            r10 = r4
            r4 = r11
            r11 = r3
            r3 = r12
            r12 = r5
            r5 = r13
            r13 = r36
            r31 = r2
            r2 = r14
            r14 = r4
            r32 = r15
            r15 = r16
            r16 = r32
            r17 = r5
            r18 = r6
            r19 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ ItemFoundInScroll -> 0x01c6 }
            kotlin.jvm.functions.Function1 r25 = (kotlin.jvm.functions.Function1) r25     // Catch:{ ItemFoundInScroll -> 0x01c6 }
            r26 = r1
            kotlin.coroutines.Continuation r26 = (kotlin.coroutines.Continuation) r26     // Catch:{ ItemFoundInScroll -> 0x01c6 }
            r27 = 2
            r28 = 0
            r6 = r36
            r1.L$0 = r6     // Catch:{ ItemFoundInScroll -> 0x01c4 }
            r1.L$1 = r4     // Catch:{ ItemFoundInScroll -> 0x01c4 }
            r1.L$2 = r3     // Catch:{ ItemFoundInScroll -> 0x01c4 }
            r1.L$3 = r5     // Catch:{ ItemFoundInScroll -> 0x01c4 }
            r1.F$0 = r2     // Catch:{ ItemFoundInScroll -> 0x01c4 }
            r8 = r32
            r1.F$1 = r8     // Catch:{ ItemFoundInScroll -> 0x01c4 }
            r1.F$2 = r7     // Catch:{ ItemFoundInScroll -> 0x01c4 }
            r1.I$0 = r0     // Catch:{ ItemFoundInScroll -> 0x01c4 }
            r9 = 1
            r1.label = r9     // Catch:{ ItemFoundInScroll -> 0x01c4 }
            java.lang.Object r9 = androidx.compose.animation.core.SuspendAnimationKt.animateTo$default(r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ ItemFoundInScroll -> 0x01c4 }
            r10 = r31
            if (r9 != r10) goto L_0x01ab
            return r10
        L_0x01ab:
            r9 = r1
            r14 = r2
            r12 = r3
            r11 = r4
            r13 = r5
            r15 = r8
            r2 = r10
            r10 = r6
        L_0x01b3:
            int r1 = r13.element     // Catch:{ ItemFoundInScroll -> 0x01c0 }
            r3 = 1
            int r1 = r1 + r3
            r13.element = r1     // Catch:{ ItemFoundInScroll -> 0x01c0 }
            r1 = r35
            r3 = 2
            r4 = 0
            r6 = 1
            goto L_0x00d6
        L_0x01c0:
            r0 = move-exception
            r1 = r0
            r0 = r10
            goto L_0x01e8
        L_0x01c4:
            r0 = move-exception
            goto L_0x01c9
        L_0x01c6:
            r0 = move-exception
            r6 = r36
        L_0x01c9:
            r10 = r31
            r9 = r1
            r2 = r10
            goto L_0x01d2
        L_0x01ce:
            r0 = move-exception
            r1 = r9
            r6 = r10
            r10 = r2
        L_0x01d2:
            r1 = r0
            r0 = r6
            goto L_0x01e8
        L_0x01d5:
            androidx.compose.foundation.lazy.layout.ItemFoundInScroll r0 = new androidx.compose.foundation.lazy.layout.ItemFoundInScroll     // Catch:{ ItemFoundInScroll -> 0x01e3 }
            int r1 = r12.intValue()     // Catch:{ ItemFoundInScroll -> 0x01e3 }
            T r3 = r11.element     // Catch:{ ItemFoundInScroll -> 0x01e3 }
            androidx.compose.animation.core.AnimationState r3 = (androidx.compose.animation.core.AnimationState) r3     // Catch:{ ItemFoundInScroll -> 0x01e3 }
            r0.<init>(r1, r3)     // Catch:{ ItemFoundInScroll -> 0x01e3 }
            throw r0     // Catch:{ ItemFoundInScroll -> 0x01e3 }
        L_0x01e3:
            r0 = move-exception
            r9 = r35
            r1 = r0
            r0 = r7
        L_0x01e8:
            androidx.compose.animation.core.AnimationState r10 = r1.getPreviousAnimation()
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r17 = 0
            r18 = 30
            r19 = 0
            androidx.compose.animation.core.AnimationState r21 = androidx.compose.animation.core.AnimationStateKt.copy$default((androidx.compose.animation.core.AnimationState) r10, (float) r11, (float) r12, (long) r13, (long) r15, (boolean) r17, (int) r18, (java.lang.Object) r19)
            int r1 = r1.getItemOffset()
            int r3 = r9.$scrollOffset
            int r1 = r1 + r3
            float r1 = (float) r1
            kotlin.jvm.internal.Ref$FloatRef r3 = new kotlin.jvm.internal.Ref$FloatRef
            r3.<init>()
            java.lang.Float r22 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r1)
            r23 = 0
            java.lang.Object r4 = r21.getVelocity()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L_0x0221
            r4 = 1
            r5 = 1
            goto L_0x0223
        L_0x0221:
            r4 = 1
            r5 = 0
        L_0x0223:
            r24 = r5 ^ 1
            androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2$5 r4 = new androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2$5
            r4.<init>(r1, r3, r0)
            r25 = r4
            kotlin.jvm.functions.Function1 r25 = (kotlin.jvm.functions.Function1) r25
            r26 = r9
            kotlin.coroutines.Continuation r26 = (kotlin.coroutines.Continuation) r26
            r27 = 2
            r28 = 0
            r9.L$0 = r0
            r1 = 0
            r9.L$1 = r1
            r9.L$2 = r1
            r9.L$3 = r1
            r1 = 2
            r9.label = r1
            java.lang.Object r1 = androidx.compose.animation.core.SuspendAnimationKt.animateTo$default(r21, r22, r23, r24, r25, r26, r27, r28)
            if (r1 != r2) goto L_0x0249
            return r2
        L_0x0249:
            androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope r1 = r9.$this_animateScrollToItem
            int r2 = r9.$index
            int r3 = r9.$scrollOffset
            r1.snapToItem(r0, r2, r3)
        L_0x0252:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0255:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Index should be non-negative ("
            r1.<init>(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            r1 = 41
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public static final boolean invokeSuspend$isOvershot(boolean z, LazyAnimateScrollScope lazyAnimateScrollScope, int i, int i2) {
        if (z) {
            if (lazyAnimateScrollScope.getFirstVisibleItemIndex() <= i && (lazyAnimateScrollScope.getFirstVisibleItemIndex() != i || lazyAnimateScrollScope.getFirstVisibleItemScrollOffset() <= i2)) {
                return false;
            }
        } else if (lazyAnimateScrollScope.getFirstVisibleItemIndex() >= i && (lazyAnimateScrollScope.getFirstVisibleItemIndex() != i || lazyAnimateScrollScope.getFirstVisibleItemScrollOffset() >= i2)) {
            return false;
        }
        return true;
    }
}
