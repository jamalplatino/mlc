package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: TabRow.kt */
final class TabRowKt$TabRow$2$1$1 extends Lambda implements Function2<SubcomposeMeasureScope, Constraints, MeasureResult> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function2<Composer, Integer, Unit> $divider;
    final /* synthetic */ Function3<List<TabPosition>, Composer, Integer, Unit> $indicator;
    final /* synthetic */ Function2<Composer, Integer, Unit> $tabs;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TabRowKt$TabRow$2$1$1(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, int i) {
        super(2);
        this.$tabs = function2;
        this.$divider = function22;
        this.$indicator = function3;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m1685invoke0kLqBqw((SubcomposeMeasureScope) obj, ((Constraints) obj2).m5576unboximpl());
    }

    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
    public final MeasureResult m1685invoke0kLqBqw(SubcomposeMeasureScope subcomposeMeasureScope, long j) {
        SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
        Intrinsics.checkNotNullParameter(subcomposeMeasureScope2, "$this$SubcomposeLayout");
        int r13 = Constraints.m5570getMaxWidthimpl(j);
        List<Measurable> subcompose = subcomposeMeasureScope2.subcompose(TabSlots.Tabs, this.$tabs);
        int size = subcompose.size();
        final Ref.IntRef intRef = new Ref.IntRef();
        if (size > 0) {
            intRef.element = r13 / size;
        }
        Iterable<Measurable> iterable = subcompose;
        int i = 0;
        for (Measurable maxIntrinsicHeight : iterable) {
            i = Math.max(maxIntrinsicHeight.maxIntrinsicHeight(intRef.element), i);
        }
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (Measurable r15 : iterable) {
            arrayList.add(r15.m4520measureBRTryo0(Constraints.m5560copyZbe2FdA(j, intRef.element, intRef.element, i, i)));
        }
        List list = (List) arrayList;
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(new TabPosition(Dp.m5626constructorimpl(subcomposeMeasureScope2.m5604toDpu2uoSUM(intRef.element) * ((float) i2)), subcomposeMeasureScope2.m5604toDpu2uoSUM(intRef.element), (DefaultConstructorMarker) null));
        }
        final List list2 = arrayList2;
        Function2<Composer, Integer, Unit> function2 = this.$divider;
        final Function3<List<TabPosition>, Composer, Integer, Unit> function3 = this.$indicator;
        final int i3 = this.$$dirty;
        final List list3 = list;
        final SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope;
        final Function2<Composer, Integer, Unit> function22 = function2;
        final long j2 = j;
        final int i4 = i;
        final int i5 = r13;
        return MeasureScope.layout$default(subcomposeMeasureScope2, r13, i, (Map) null, new Function1<Placeable.PlacementScope, Unit>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Intrinsics.checkNotNullParameter(placementScope, "$this$layout");
                Ref.IntRef intRef = intRef;
                int i = 0;
                for (Object next : list3) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    int i3 = intRef.element * i;
                    Placeable.PlacementScope.placeRelative$default(placementScope, (Placeable) next, i3, 0, 0.0f, 4, (Object) null);
                    i = i2;
                }
                long j = j2;
                int i4 = i4;
                for (Measurable r2 : subcomposeMeasureScope3.subcompose(TabSlots.Divider, function22)) {
                    Placeable r3 = r2.m4520measureBRTryo0(Constraints.m5561copyZbe2FdA$default(j, 0, 0, 0, 0, 11, (Object) null));
                    Placeable.PlacementScope.placeRelative$default(placementScope, r3, 0, i4 - r3.getHeight(), 0.0f, 4, (Object) null);
                    i4 = i4;
                    j = j;
                }
                SubcomposeMeasureScope subcomposeMeasureScope = subcomposeMeasureScope3;
                TabSlots tabSlots = TabSlots.Indicator;
                final Function3<List<TabPosition>, Composer, Integer, Unit> function3 = function3;
                final List<TabPosition> list = list2;
                final int i5 = i3;
                int i6 = i5;
                int i7 = i4;
                for (Measurable r22 : subcomposeMeasureScope.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-976887453, true, new Function2<Composer, Integer, Unit>() {
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) {
                        ComposerKt.sourceInformation(composer, "C185@8506L23:TabRow.kt#uh7d8r");
                        if ((i & 11) != 2 || !composer.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-976887453, i, -1, "androidx.compose.material3.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:184)");
                            }
                            function3.invoke(list, composer, Integer.valueOf(((i5 >> 9) & 112) | 8));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer.skipToGroupEnd();
                    }
                }))) {
                    Placeable.PlacementScope.placeRelative$default(placementScope, r22.m4520measureBRTryo0(Constraints.Companion.m5578fixedJhjzzOo(i6, i7)), 0, 0, 0.0f, 4, (Object) null);
                }
            }
        }, 4, (Object) null);
    }
}
