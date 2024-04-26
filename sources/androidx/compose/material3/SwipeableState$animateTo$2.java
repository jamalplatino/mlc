package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\u00020\u0004H@"}, d2 = {"<anonymous>", "", "T", "anchors", "", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: Swipeable.kt */
final class SwipeableState$animateTo$2 implements FlowCollector<Map<Float, ? extends T>> {
    final /* synthetic */ AnimationSpec<Float> $anim;
    final /* synthetic */ T $targetValue;
    final /* synthetic */ SwipeableState<T> this$0;

    SwipeableState$animateTo$2(T t, SwipeableState<T> swipeableState, AnimationSpec<Float> animationSpec) {
        this.$targetValue = t;
        this.this$0 = swipeableState;
        this.$anim = animationSpec;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object emit(java.util.Map<java.lang.Float, ? extends T> r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.compose.material3.SwipeableState$animateTo$2$emit$1
            if (r0 == 0) goto L_0x0014
            r0 = r8
            androidx.compose.material3.SwipeableState$animateTo$2$emit$1 r0 = (androidx.compose.material3.SwipeableState$animateTo$2$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r8 = r0.label
            int r8 = r8 - r2
            r0.label = r8
            goto L_0x0019
        L_0x0014:
            androidx.compose.material3.SwipeableState$animateTo$2$emit$1 r0 = new androidx.compose.material3.SwipeableState$animateTo$2$emit$1
            r0.<init>(r6, r8)
        L_0x0019:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 != r4) goto L_0x0037
            java.lang.Object r7 = r0.L$1
            java.util.Map r7 = (java.util.Map) r7
            java.lang.Object r0 = r0.L$0
            androidx.compose.material3.SwipeableState$animateTo$2 r0 = (androidx.compose.material3.SwipeableState$animateTo$2) r0
            kotlin.ResultKt.throwOnFailure(r8)     // Catch:{ all -> 0x0034 }
            goto L_0x0061
        L_0x0034:
            r8 = move-exception
            goto L_0x00d3
        L_0x0037:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0040:
            kotlin.ResultKt.throwOnFailure(r8)
            T r8 = r6.$targetValue     // Catch:{ all -> 0x00d1 }
            java.lang.Float r8 = androidx.compose.material3.SwipeableKt.getOffset(r7, r8)     // Catch:{ all -> 0x00d1 }
            if (r8 == 0) goto L_0x00c5
            androidx.compose.material3.SwipeableState<T> r2 = r6.this$0     // Catch:{ all -> 0x00d1 }
            float r8 = r8.floatValue()     // Catch:{ all -> 0x00d1 }
            androidx.compose.animation.core.AnimationSpec<java.lang.Float> r5 = r6.$anim     // Catch:{ all -> 0x00d1 }
            r0.L$0 = r6     // Catch:{ all -> 0x00d1 }
            r0.L$1 = r7     // Catch:{ all -> 0x00d1 }
            r0.label = r4     // Catch:{ all -> 0x00d1 }
            java.lang.Object r8 = r2.animateInternalToOffset(r8, r5, r0)     // Catch:{ all -> 0x00d1 }
            if (r8 != r1) goto L_0x0060
            return r1
        L_0x0060:
            r0 = r6
        L_0x0061:
            androidx.compose.material3.SwipeableState<T> r8 = r0.this$0
            androidx.compose.runtime.MutableState r8 = r8.absoluteOffset
            java.lang.Object r8 = r8.getValue()
            java.lang.Number r8 = (java.lang.Number) r8
            float r8 = r8.floatValue()
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x007e:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x00a9
            java.lang.Object r2 = r7.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r4 = r2.getKey()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            float r4 = r4 - r8
            float r4 = java.lang.Math.abs(r4)
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 >= 0) goto L_0x007e
            java.lang.Object r4 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            r1.put(r4, r2)
            goto L_0x007e
        L_0x00a9:
            java.util.Map r1 = (java.util.Map) r1
            java.util.Collection r7 = r1.values()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.lang.Object r7 = kotlin.collections.CollectionsKt.firstOrNull(r7)
            if (r7 != 0) goto L_0x00bd
            androidx.compose.material3.SwipeableState<T> r7 = r0.this$0
            java.lang.Object r7 = r7.getCurrentValue()
        L_0x00bd:
            androidx.compose.material3.SwipeableState<T> r8 = r0.this$0
            r8.setCurrentValue(r7)
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L_0x00c5:
            java.lang.String r8 = "The target value must have an associated anchor."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00d1 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x00d1 }
            r0.<init>(r8)     // Catch:{ all -> 0x00d1 }
            throw r0     // Catch:{ all -> 0x00d1 }
        L_0x00d1:
            r8 = move-exception
            r0 = r6
        L_0x00d3:
            androidx.compose.material3.SwipeableState<T> r1 = r0.this$0
            androidx.compose.runtime.MutableState r1 = r1.absoluteOffset
            java.lang.Object r1 = r1.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x00f0:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L_0x011b
            java.lang.Object r4 = r7.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            float r5 = r5 - r1
            float r5 = java.lang.Math.abs(r5)
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x00f0
            java.lang.Object r5 = r4.getKey()
            java.lang.Object r4 = r4.getValue()
            r2.put(r5, r4)
            goto L_0x00f0
        L_0x011b:
            java.util.Map r2 = (java.util.Map) r2
            java.util.Collection r7 = r2.values()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.lang.Object r7 = kotlin.collections.CollectionsKt.firstOrNull(r7)
            if (r7 != 0) goto L_0x012f
            androidx.compose.material3.SwipeableState<T> r7 = r0.this$0
            java.lang.Object r7 = r7.getCurrentValue()
        L_0x012f:
            androidx.compose.material3.SwipeableState<T> r0 = r0.this$0
            r0.setCurrentValue(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SwipeableState$animateTo$2.emit(java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
