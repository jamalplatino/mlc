package androidx.compose.foundation.pager;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\u0005J\u0011\u0010\t\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0002\u0010\nR\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/pager/AwaitLazyListStateSet;", "", "()V", "continuation", "Lkotlin/coroutines/Continuation;", "", "stateWasLoaded", "", "onStateLoaded", "waitFinalLazyListSetting", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: PagerState.kt */
final class AwaitLazyListStateSet {
    private Continuation<? super Unit> continuation;
    private boolean stateWasLoaded;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object waitFinalLazyListSetting(kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.pager.AwaitLazyListStateSet$waitFinalLazyListSetting$1
            if (r0 == 0) goto L_0x0014
            r0 = r5
            androidx.compose.foundation.pager.AwaitLazyListStateSet$waitFinalLazyListSetting$1 r0 = (androidx.compose.foundation.pager.AwaitLazyListStateSet$waitFinalLazyListSetting$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r5 = r0.label
            int r5 = r5 - r2
            r0.label = r5
            goto L_0x0019
        L_0x0014:
            androidx.compose.foundation.pager.AwaitLazyListStateSet$waitFinalLazyListSetting$1 r0 = new androidx.compose.foundation.pager.AwaitLazyListStateSet$waitFinalLazyListSetting$1
            r0.<init>(r4, r5)
        L_0x0019:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0032
            java.lang.Object r1 = r0.L$1
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.pager.AwaitLazyListStateSet r0 = (androidx.compose.foundation.pager.AwaitLazyListStateSet) r0
            kotlin.ResultKt.throwOnFailure(r5)
            goto L_0x006b
        L_0x0032:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x003b:
            kotlin.ResultKt.throwOnFailure(r5)
            boolean r5 = r4.stateWasLoaded
            if (r5 != 0) goto L_0x0078
            kotlin.coroutines.Continuation<? super kotlin.Unit> r5 = r4.continuation
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
            kotlin.coroutines.SafeContinuation r2 = new kotlin.coroutines.SafeContinuation
            kotlin.coroutines.Continuation r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)
            r2.<init>(r3)
            r3 = r2
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            r4.continuation = r3
            java.lang.Object r2 = r2.getOrThrow()
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 != r3) goto L_0x0067
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)
        L_0x0067:
            if (r2 != r1) goto L_0x006a
            return r1
        L_0x006a:
            r1 = r5
        L_0x006b:
            if (r1 == 0) goto L_0x0078
            kotlin.Result$Companion r5 = kotlin.Result.Companion
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            java.lang.Object r5 = kotlin.Result.m6005constructorimpl(r5)
            r1.resumeWith(r5)
        L_0x0078:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.AwaitLazyListStateSet.waitFinalLazyListSetting(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void onStateLoaded() {
        if (!this.stateWasLoaded) {
            this.stateWasLoaded = true;
            Continuation<? super Unit> continuation2 = this.continuation;
            if (continuation2 != null) {
                Result.Companion companion = Result.Companion;
                continuation2.resumeWith(Result.m6005constructorimpl(Unit.INSTANCE));
            }
            this.continuation = null;
        }
    }
}
