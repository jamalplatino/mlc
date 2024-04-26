package androidx.compose.foundation.gestures;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: Transformable.kt */
final class TransformableKt$transformable$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ boolean $lockRotationOnZoomPan;
    final /* synthetic */ TransformableState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TransformableKt$transformable$2(boolean z, boolean z2, TransformableState transformableState) {
        super(3);
        this.$lockRotationOnZoomPan = z;
        this.$enabled = z2;
        this.$state = transformableState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    public final Modifier invoke(Modifier modifier, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(modifier, "$this$composed");
        composer.startReplaceableGroup(1509335853);
        ComposerKt.sourceInformation(composer, "C66@2992L43,67@3058L66,88@4051L509:Transformable.kt#8bwon0");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1509335853, i, -1, "androidx.compose.foundation.gestures.transformable.<anonymous> (Transformable.kt:65)");
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(this.$lockRotationOnZoomPan), composer, 0);
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = ChannelKt.Channel$default(Integer.MAX_VALUE, (BufferOverflow) null, (Function1) null, 6, (Object) null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        final Channel channel = (Channel) rememberedValue;
        composer.startReplaceableGroup(-2015617726);
        ComposerKt.sourceInformation(composer, "69@3160L822");
        if (this.$enabled) {
            TransformableState transformableState = this.$state;
            final TransformableState transformableState2 = this.$state;
            EffectsKt.LaunchedEffect((Object) transformableState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) new AnonymousClass1((Continuation<? super AnonymousClass1>) null), composer, 64);
        }
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new TransformableKt$transformable$2$block$1$1(rememberUpdatedState, channel, (Continuation<? super TransformableKt$transformable$2$block$1$1>) null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        Modifier pointerInput = this.$enabled ? SuspendingPointerInputFilterKt.pointerInput((Modifier) Modifier.Companion, (Object) Unit.INSTANCE, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) (Function2) rememberedValue2) : Modifier.Companion;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return pointerInput;
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableKt$transformable$2$1", f = "Transformable.kt", i = {0, 0, 1}, l = {72, 75}, m = "invokeSuspend", n = {"$this$LaunchedEffect", "event", "$this$LaunchedEffect"}, s = {"L$0", "L$1", "L$0"})
    /* renamed from: androidx.compose.foundation.gestures.TransformableKt$transformable$2$1  reason: invalid class name */
    /* compiled from: Transformable.kt */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 r0 = new AnonymousClass1(channel, transformableState2, continuation);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0067 A[SYNTHETIC, Splitter:B:22:0x0067] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(T r12) {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r11.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0032
                if (r1 == r3) goto L_0x0020
                if (r1 != r2) goto L_0x0017
                java.lang.Object r1 = r11.L$0
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                kotlin.ResultKt.throwOnFailure(r12)     // Catch:{ CancellationException -> 0x0015 }
            L_0x0015:
                r12 = r1
                goto L_0x0039
            L_0x0017:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L_0x0020:
                java.lang.Object r1 = r11.L$2
                kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
                java.lang.Object r4 = r11.L$1
                kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref.ObjectRef) r4
                java.lang.Object r5 = r11.L$0
                kotlinx.coroutines.CoroutineScope r5 = (kotlinx.coroutines.CoroutineScope) r5
                kotlin.ResultKt.throwOnFailure(r12)
                r6 = r4
                r4 = r11
                goto L_0x005f
            L_0x0032:
                kotlin.ResultKt.throwOnFailure(r12)
                java.lang.Object r12 = r11.L$0
                kotlinx.coroutines.CoroutineScope r12 = (kotlinx.coroutines.CoroutineScope) r12
            L_0x0039:
                r1 = r11
            L_0x003a:
                boolean r4 = kotlinx.coroutines.CoroutineScopeKt.isActive(r12)
                if (r4 == 0) goto L_0x008a
                kotlin.jvm.internal.Ref$ObjectRef r4 = new kotlin.jvm.internal.Ref$ObjectRef
                r4.<init>()
                kotlinx.coroutines.channels.Channel<androidx.compose.foundation.gestures.TransformEvent> r5 = r1
                r6 = r1
                kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
                r1.L$0 = r12
                r1.L$1 = r4
                r1.L$2 = r4
                r1.label = r3
                java.lang.Object r5 = r5.receive(r6)
                if (r5 != r0) goto L_0x0059
                return r0
            L_0x0059:
                r6 = r4
                r4 = r1
                r1 = r6
                r10 = r5
                r5 = r12
                r12 = r10
            L_0x005f:
                r1.element = r12
                T r12 = r6.element
                boolean r12 = r12 instanceof androidx.compose.foundation.gestures.TransformEvent.TransformStarted
                if (r12 == 0) goto L_0x0087
                androidx.compose.foundation.gestures.TransformableState r12 = r5     // Catch:{ CancellationException -> 0x0087 }
                androidx.compose.foundation.MutatePriority r1 = androidx.compose.foundation.MutatePriority.UserInput     // Catch:{ CancellationException -> 0x0087 }
                androidx.compose.foundation.gestures.TransformableKt$transformable$2$1$1 r7 = new androidx.compose.foundation.gestures.TransformableKt$transformable$2$1$1     // Catch:{ CancellationException -> 0x0087 }
                kotlinx.coroutines.channels.Channel<androidx.compose.foundation.gestures.TransformEvent> r8 = r1     // Catch:{ CancellationException -> 0x0087 }
                r9 = 0
                r7.<init>(r6, r8, r9)     // Catch:{ CancellationException -> 0x0087 }
                kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7     // Catch:{ CancellationException -> 0x0087 }
                r6 = r4
                kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6     // Catch:{ CancellationException -> 0x0087 }
                r4.L$0 = r5     // Catch:{ CancellationException -> 0x0087 }
                r4.L$1 = r9     // Catch:{ CancellationException -> 0x0087 }
                r4.L$2 = r9     // Catch:{ CancellationException -> 0x0087 }
                r4.label = r2     // Catch:{ CancellationException -> 0x0087 }
                java.lang.Object r12 = r12.transform(r1, r7, r6)     // Catch:{ CancellationException -> 0x0087 }
                if (r12 != r0) goto L_0x0087
                return r0
            L_0x0087:
                r1 = r4
                r12 = r5
                goto L_0x003a
            L_0x008a:
                kotlin.Unit r12 = kotlin.Unit.INSTANCE
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt$transformable$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }
}
