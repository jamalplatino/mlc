package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007\u001ap\u0010\u0004\u001a\u00020\u0001\"\b\b\u0000\u0010\u0005*\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00050\b2\u0006\u0010\t\u001a\u00020\n2A\u0010\u000b\u001a=\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u0002H\u00050\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\f¢\u0006\u0002\b\u0014H\u0007¢\u0006\u0002\u0010\u0015\u001a\u001e\u0010\u0016\u001a\u00020\u0011*\u00020\u00012\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u0011H\u0001¨\u0006\u001a"}, d2 = {"DelegatingLazyLayoutItemProvider", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "delegate", "Landroidx/compose/runtime/State;", "LazyLayoutItemProvider", "T", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;", "intervals", "Landroidx/compose/foundation/lazy/layout/IntervalList;", "nearestItemsRange", "Lkotlin/ranges/IntRange;", "itemContent", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/IntervalList$Interval;", "Lkotlin/ParameterName;", "name", "interval", "", "index", "", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/foundation/lazy/layout/IntervalList;Lkotlin/ranges/IntRange;Lkotlin/jvm/functions/Function4;)Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "findIndexByKey", "key", "", "lastKnownIndex", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: LazyLayoutItemProvider.kt */
public final class LazyLayoutItemProviderKt {
    public static final <T extends LazyLayoutIntervalContent> LazyLayoutItemProvider LazyLayoutItemProvider(IntervalList<? extends T> intervalList, IntRange intRange, Function4<? super IntervalList.Interval<? extends T>, ? super Integer, ? super Composer, ? super Integer, Unit> function4) {
        Intrinsics.checkNotNullParameter(intervalList, "intervals");
        Intrinsics.checkNotNullParameter(intRange, "nearestItemsRange");
        Intrinsics.checkNotNullParameter(function4, "itemContent");
        return new DefaultLazyLayoutItemsProvider(function4, intervalList, intRange);
    }

    public static final LazyLayoutItemProvider DelegatingLazyLayoutItemProvider(State<? extends LazyLayoutItemProvider> state) {
        Intrinsics.checkNotNullParameter(state, "delegate");
        return new DefaultDelegatingLazyLayoutItemProvider(state);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        r1 = r1.getKeyToIndexMap().get(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int findIndexByKey(androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider r1, java.lang.Object r2, int r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            if (r2 != 0) goto L_0x0008
            return r3
        L_0x0008:
            int r0 = r1.getItemCount()
            if (r3 >= r0) goto L_0x0019
            java.lang.Object r0 = r1.getKey(r3)
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r0)
            if (r0 == 0) goto L_0x0019
            return r3
        L_0x0019:
            java.util.Map r1 = r1.getKeyToIndexMap()
            java.lang.Object r1 = r1.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L_0x002a
            int r1 = r1.intValue()
            return r1
        L_0x002a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt.findIndexByKey(androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider, java.lang.Object, int):int");
    }
}
