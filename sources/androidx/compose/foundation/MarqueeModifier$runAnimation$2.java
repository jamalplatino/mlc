package androidx.compose.foundation;

import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.MarqueeModifier$runAnimation$2", f = "BasicMarquee.kt", i = {}, l = {272}, m = "invokeSuspend", n = {}, s = {})
/* compiled from: BasicMarquee.kt */
final class MarqueeModifier$runAnimation$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MarqueeModifier this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MarqueeModifier$runAnimation$2(MarqueeModifier marqueeModifier, Continuation<? super MarqueeModifier$runAnimation$2> continuation) {
        super(2, continuation);
        this.this$0 = marqueeModifier;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarqueeModifier$runAnimation$2(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarqueeModifier$runAnimation$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final MarqueeModifier marqueeModifier = this.this$0;
            Flow snapshotFlow = SnapshotStateKt.snapshotFlow(new Function0<Float>() {
                public final Float invoke() {
                    if (marqueeModifier.getContentWidth() <= marqueeModifier.getContainerWidth()) {
                        return null;
                    }
                    if (!MarqueeAnimationMode.m237equalsimpl0(marqueeModifier.m245getAnimationModeZbEOnfQ(), MarqueeAnimationMode.Companion.m244getWhileFocusedZbEOnfQ()) || marqueeModifier.getHasFocus()) {
                        return Float.valueOf((float) (marqueeModifier.getContentWidth() + marqueeModifier.getSpacingPx()));
                    }
                    return null;
                }
            });
            final MarqueeModifier marqueeModifier2 = this.this$0;
            this.label = 1;
            if (FlowKt.collectLatest(snapshotFlow, new AnonymousClass2((Continuation<? super AnonymousClass2>) null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H@"}, d2 = {"<anonymous>", "", "contentWithSpacingWidth", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.MarqueeModifier$runAnimation$2$2", f = "BasicMarquee.kt", i = {0, 0}, l = {285, 287, 289, 289}, m = "invokeSuspend", n = {"contentWithSpacingWidth", "spec"}, s = {"L$0", "L$1"})
    /* renamed from: androidx.compose.foundation.MarqueeModifier$runAnimation$2$2  reason: invalid class name */
    /* compiled from: BasicMarquee.kt */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<Float, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        Object L$1;
        int label;

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 r0 = new AnonymousClass2(marqueeModifier2, continuation);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(Float f, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(f, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:28:0x00c4 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                r18 = this;
                r1 = r18
                java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r1.label
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                r7 = 0
                r8 = 0
                if (r0 == 0) goto L_0x0045
                if (r0 == r6) goto L_0x0037
                if (r0 == r5) goto L_0x002f
                if (r0 == r4) goto L_0x002a
                if (r0 == r3) goto L_0x0021
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x0021:
                java.lang.Object r0 = r1.L$0
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                kotlin.ResultKt.throwOnFailure(r19)
                goto L_0x00e2
            L_0x002a:
                kotlin.ResultKt.throwOnFailure(r19)
                goto L_0x00c5
            L_0x002f:
                kotlin.ResultKt.throwOnFailure(r19)     // Catch:{ all -> 0x0034 }
                goto L_0x00af
            L_0x0034:
                r0 = move-exception
                goto L_0x00c8
            L_0x0037:
                java.lang.Object r0 = r1.L$1
                androidx.compose.animation.core.AnimationSpec r0 = (androidx.compose.animation.core.AnimationSpec) r0
                java.lang.Object r6 = r1.L$0
                java.lang.Float r6 = (java.lang.Float) r6
                kotlin.ResultKt.throwOnFailure(r19)
                r12 = r0
                r11 = r6
                goto L_0x0093
            L_0x0045:
                kotlin.ResultKt.throwOnFailure(r19)
                java.lang.Object r0 = r1.L$0
                java.lang.Float r0 = (java.lang.Float) r0
                if (r0 != 0) goto L_0x0051
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L_0x0051:
                androidx.compose.foundation.MarqueeModifier r9 = r3
                int r10 = r9.iterations
                float r11 = r0.floatValue()
                androidx.compose.foundation.MarqueeModifier r9 = r3
                int r12 = r9.initialDelayMillis
                androidx.compose.foundation.MarqueeModifier r9 = r3
                int r13 = r9.delayMillis
                androidx.compose.foundation.MarqueeModifier r9 = r3
                float r14 = r9.velocity
                androidx.compose.foundation.MarqueeModifier r9 = r3
                androidx.compose.ui.unit.Density r15 = r9.density
                androidx.compose.animation.core.AnimationSpec r9 = androidx.compose.foundation.BasicMarqueeKt.m187createMarqueeAnimationSpecZ4HSEVQ(r10, r11, r12, r13, r14, r15)
                androidx.compose.foundation.MarqueeModifier r10 = r3
                androidx.compose.animation.core.Animatable r10 = r10.offset
                java.lang.Float r11 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r8)
                r12 = r1
                kotlin.coroutines.Continuation r12 = (kotlin.coroutines.Continuation) r12
                r1.L$0 = r0
                r1.L$1 = r9
                r1.label = r6
                java.lang.Object r6 = r10.snapTo(r11, r12)
                if (r6 != r2) goto L_0x0091
                return r2
            L_0x0091:
                r11 = r0
                r12 = r9
            L_0x0093:
                androidx.compose.foundation.MarqueeModifier r0 = r3     // Catch:{ all -> 0x0034 }
                androidx.compose.animation.core.Animatable r10 = r0.offset     // Catch:{ all -> 0x0034 }
                r13 = 0
                r14 = 0
                r15 = r1
                kotlin.coroutines.Continuation r15 = (kotlin.coroutines.Continuation) r15     // Catch:{ all -> 0x0034 }
                r16 = 12
                r17 = 0
                r1.L$0 = r7     // Catch:{ all -> 0x0034 }
                r1.L$1 = r7     // Catch:{ all -> 0x0034 }
                r1.label = r5     // Catch:{ all -> 0x0034 }
                java.lang.Object r0 = androidx.compose.animation.core.Animatable.animateTo$default(r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0034 }
                if (r0 != r2) goto L_0x00af
                return r2
            L_0x00af:
                androidx.compose.foundation.MarqueeModifier r0 = r3
                androidx.compose.animation.core.Animatable r0 = r0.offset
                java.lang.Float r3 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r8)
                r5 = r1
                kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
                r1.label = r4
                java.lang.Object r0 = r0.snapTo(r3, r5)
                if (r0 != r2) goto L_0x00c5
                return r2
            L_0x00c5:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L_0x00c8:
                androidx.compose.foundation.MarqueeModifier r4 = r3
                androidx.compose.animation.core.Animatable r4 = r4.offset
                java.lang.Float r5 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r8)
                r6 = r1
                kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
                r1.L$0 = r0
                r1.L$1 = r7
                r1.label = r3
                java.lang.Object r3 = r4.snapTo(r5, r6)
                if (r3 != r2) goto L_0x00e2
                return r2
            L_0x00e2:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MarqueeModifier$runAnimation$2.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }
}
