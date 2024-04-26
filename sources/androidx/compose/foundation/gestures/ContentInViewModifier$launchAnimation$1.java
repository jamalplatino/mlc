package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ContentInViewModifier;
import androidx.compose.ui.geometry.Rect;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.ContentInViewModifier$launchAnimation$1", f = "ContentInViewModifier.kt", i = {}, l = {193}, m = "invokeSuspend", n = {}, s = {})
/* compiled from: ContentInViewModifier.kt */
final class ContentInViewModifier$launchAnimation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ContentInViewModifier this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ContentInViewModifier$launchAnimation$1(ContentInViewModifier contentInViewModifier, Continuation<? super ContentInViewModifier$launchAnimation$1> continuation) {
        super(2, continuation);
        this.this$0 = contentInViewModifier;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ContentInViewModifier$launchAnimation$1 contentInViewModifier$launchAnimation$1 = new ContentInViewModifier$launchAnimation$1(this.this$0, continuation);
        contentInViewModifier$launchAnimation$1.L$0 = obj;
        return contentInViewModifier$launchAnimation$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ContentInViewModifier$launchAnimation$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        CancellationException cancellationException;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final Job job = JobKt.getJob(((CoroutineScope) this.L$0).getCoroutineContext());
            this.this$0.isAnimationRunning = true;
            ScrollableState access$getScrollState$p = this.this$0.scrollState;
            final ContentInViewModifier contentInViewModifier = this.this$0;
            this.label = 1;
            if (ScrollableState.scroll$default(access$getScrollState$p, (MutatePriority) null, new AnonymousClass1((Continuation<? super AnonymousClass1>) null), this, 1, (Object) null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            try {
                ResultKt.throwOnFailure(obj);
            } catch (CancellationException e) {
                cancellationException = e;
                throw cancellationException;
            } catch (Throwable th) {
                this.this$0.isAnimationRunning = false;
                this.this$0.bringIntoViewRequests.cancelAndRemoveAll(cancellationException);
                this.this$0.trackingFocusedChild = false;
                throw th;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.this$0.bringIntoViewRequests.resumeAndRemoveAll();
        this.this$0.isAnimationRunning = false;
        this.this$0.bringIntoViewRequests.cancelAndRemoveAll((Throwable) null);
        this.this$0.trackingFocusedChild = false;
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ContentInViewModifier$launchAnimation$1$1", f = "ContentInViewModifier.kt", i = {}, l = {198}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.gestures.ContentInViewModifier$launchAnimation$1$1  reason: invalid class name */
    /* compiled from: ContentInViewModifier.kt */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 r0 = new AnonymousClass1(contentInViewModifier, job, continuation);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(ScrollScope scrollScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final ScrollScope scrollScope = (ScrollScope) this.L$0;
                contentInViewModifier.animationState.setValue(contentInViewModifier.calculateScrollDelta());
                UpdatableAnimationState access$getAnimationState$p = contentInViewModifier.animationState;
                final ContentInViewModifier contentInViewModifier = contentInViewModifier;
                final Job job = job;
                final ContentInViewModifier contentInViewModifier2 = contentInViewModifier;
                this.label = 1;
                if (access$getAnimationState$p.animateToZero(new Function1<Float, Unit>() {
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke(((Number) obj).floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(float f) {
                        float f2 = contentInViewModifier.reverseDirection ? 1.0f : -1.0f;
                        float scrollBy = f2 * scrollScope.scrollBy(f2 * f);
                        if (scrollBy < f) {
                            JobKt__JobKt.cancel$default(job, "Scroll animation cancelled because scroll was not consumed (" + scrollBy + " < " + f + ')', (Throwable) null, 2, (Object) null);
                        }
                    }
                }, new Function0<Unit>() {
                    public final void invoke() {
                        Rect access$getFocusedChildBounds;
                        BringIntoViewRequestPriorityQueue access$getBringIntoViewRequests$p = contentInViewModifier2.bringIntoViewRequests;
                        ContentInViewModifier contentInViewModifier = contentInViewModifier2;
                        while (access$getBringIntoViewRequests$p.requests.isNotEmpty() && ((r2 = ((ContentInViewModifier.Request) access$getBringIntoViewRequests$p.requests.last()).getCurrentBounds().invoke()) == null || ContentInViewModifier.m264isMaxVisibleO0kMr_c$default(contentInViewModifier, r2, 0, 1, (Object) null))) {
                            Unit unit = Unit.INSTANCE;
                            Result.Companion companion = Result.Companion;
                            ((ContentInViewModifier.Request) access$getBringIntoViewRequests$p.requests.removeAt(access$getBringIntoViewRequests$p.requests.getSize() - 1)).getContinuation().resumeWith(Result.m6005constructorimpl(unit));
                        }
                        if (contentInViewModifier2.trackingFocusedChild && (access$getFocusedChildBounds = contentInViewModifier2.getFocusedChildBounds()) != null && ContentInViewModifier.m264isMaxVisibleO0kMr_c$default(contentInViewModifier2, access$getFocusedChildBounds, 0, 1, (Object) null)) {
                            contentInViewModifier2.trackingFocusedChild = false;
                        }
                        contentInViewModifier2.animationState.setValue(contentInViewModifier2.calculateScrollDelta());
                    }
                }, this) == coroutine_suspended) {
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
}
