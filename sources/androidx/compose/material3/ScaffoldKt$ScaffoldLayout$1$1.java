package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: Scaffold.kt */
final class ScaffoldKt$ScaffoldLayout$1$1 extends Lambda implements Function2<SubcomposeMeasureScope, Constraints, MeasureResult> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function2<Composer, Integer, Unit> $bottomBar;
    final /* synthetic */ Function3<PaddingValues, Composer, Integer, Unit> $content;
    final /* synthetic */ WindowInsets $contentWindowInsets;
    final /* synthetic */ Function2<Composer, Integer, Unit> $fab;
    final /* synthetic */ int $fabPosition;
    final /* synthetic */ Function2<Composer, Integer, Unit> $snackbar;
    final /* synthetic */ Function2<Composer, Integer, Unit> $topBar;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScaffoldKt$ScaffoldLayout$1$1(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, int i, WindowInsets windowInsets, Function2<? super Composer, ? super Integer, Unit> function24, int i2, Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3) {
        super(2);
        this.$topBar = function2;
        this.$snackbar = function22;
        this.$fab = function23;
        this.$fabPosition = i;
        this.$contentWindowInsets = windowInsets;
        this.$bottomBar = function24;
        this.$$dirty = i2;
        this.$content = function3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m1520invoke0kLqBqw((SubcomposeMeasureScope) obj, ((Constraints) obj2).m5576unboximpl());
    }

    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
    public final MeasureResult m1520invoke0kLqBqw(SubcomposeMeasureScope subcomposeMeasureScope, long j) {
        final SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
        Intrinsics.checkNotNullParameter(subcomposeMeasureScope2, "$this$SubcomposeLayout");
        int r15 = Constraints.m5570getMaxWidthimpl(j);
        int r16 = Constraints.m5569getMaxHeightimpl(j);
        final long r9 = Constraints.m5561copyZbe2FdA$default(j, 0, 0, 0, 0, 10, (Object) null);
        final Function2<Composer, Integer, Unit> function2 = this.$topBar;
        final Function2<Composer, Integer, Unit> function22 = this.$snackbar;
        final Function2<Composer, Integer, Unit> function23 = this.$fab;
        final int i = this.$fabPosition;
        final WindowInsets windowInsets = this.$contentWindowInsets;
        final Function2<Composer, Integer, Unit> function24 = this.$bottomBar;
        final int i2 = this.$$dirty;
        final Function3<PaddingValues, Composer, Integer, Unit> function3 = this.$content;
        final int i3 = r15;
        final int i4 = r16;
        return MeasureScope.layout$default(subcomposeMeasureScope2, r15, r16, (Map) null, new Function1<Placeable.PlacementScope, Unit>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Object obj;
                Object obj2;
                Object obj3;
                FabPlacement fabPlacement;
                Object obj4;
                Integer num;
                int i;
                int i2;
                Object obj5;
                Object obj6;
                int i3;
                Intrinsics.checkNotNullParameter(placementScope, "$this$layout");
                Iterable<Measurable> subcompose = subcomposeMeasureScope2.subcompose(ScaffoldLayoutContent.TopBar, function2);
                long j = r9;
                Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(subcompose, 10));
                for (Measurable r6 : subcompose) {
                    arrayList.add(r6.m4520measureBRTryo0(j));
                }
                List list = (List) arrayList;
                Iterable<Placeable> iterable = list;
                Iterator it = iterable.iterator();
                if (!it.hasNext()) {
                    obj = null;
                } else {
                    obj = it.next();
                    if (it.hasNext()) {
                        int height = ((Placeable) obj).getHeight();
                        do {
                            Object next = it.next();
                            int height2 = ((Placeable) next).getHeight();
                            if (height < height2) {
                                obj = next;
                                height = height2;
                            }
                        } while (it.hasNext());
                    }
                }
                Placeable placeable = (Placeable) obj;
                int height3 = placeable != null ? placeable.getHeight() : 0;
                Iterable<Measurable> subcompose2 = subcomposeMeasureScope2.subcompose(ScaffoldLayoutContent.Snackbar, function22);
                WindowInsets windowInsets = windowInsets;
                SubcomposeMeasureScope subcomposeMeasureScope = subcomposeMeasureScope2;
                long j2 = r9;
                Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(subcompose2, 10));
                for (Measurable r11 : subcompose2) {
                    Density density = subcomposeMeasureScope;
                    arrayList2.add(r11.m4520measureBRTryo0(ConstraintsKt.m5586offsetNN6EwU(j2, (-windowInsets.getLeft(density, subcomposeMeasureScope.getLayoutDirection())) - windowInsets.getRight(density, subcomposeMeasureScope.getLayoutDirection()), -windowInsets.getBottom(density))));
                    subcomposeMeasureScope = subcomposeMeasureScope;
                }
                Iterable<Placeable> iterable2 = (List) arrayList2;
                Iterator it2 = iterable2.iterator();
                if (!it2.hasNext()) {
                    obj2 = null;
                } else {
                    obj2 = it2.next();
                    if (it2.hasNext()) {
                        int height4 = ((Placeable) obj2).getHeight();
                        do {
                            Object next2 = it2.next();
                            int height5 = ((Placeable) next2).getHeight();
                            if (height4 < height5) {
                                obj2 = next2;
                                height4 = height5;
                            }
                        } while (it2.hasNext());
                    }
                }
                Placeable placeable2 = (Placeable) obj2;
                int height6 = placeable2 != null ? placeable2.getHeight() : 0;
                Iterator it3 = iterable2.iterator();
                if (!it3.hasNext()) {
                    obj3 = null;
                } else {
                    obj3 = it3.next();
                    if (it3.hasNext()) {
                        int width = ((Placeable) obj3).getWidth();
                        do {
                            Object next3 = it3.next();
                            int width2 = ((Placeable) next3).getWidth();
                            if (width < width2) {
                                obj3 = next3;
                                width = width2;
                            }
                        } while (it3.hasNext());
                    }
                }
                Placeable placeable3 = (Placeable) obj3;
                int width3 = placeable3 != null ? placeable3.getWidth() : 0;
                WindowInsets windowInsets2 = windowInsets;
                SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope2;
                long j3 = r9;
                Collection arrayList3 = new ArrayList();
                for (Measurable r10 : subcomposeMeasureScope2.subcompose(ScaffoldLayoutContent.Fab, function23)) {
                    Density density2 = subcomposeMeasureScope2;
                    Placeable r102 = r10.m4520measureBRTryo0(ConstraintsKt.m5586offsetNN6EwU(j3, (-windowInsets2.getLeft(density2, subcomposeMeasureScope2.getLayoutDirection())) - windowInsets2.getRight(density2, subcomposeMeasureScope2.getLayoutDirection()), -windowInsets2.getBottom(density2)));
                    if (r102.getHeight() == 0 || r102.getWidth() == 0) {
                        r102 = null;
                    }
                    if (r102 != null) {
                        arrayList3.add(r102);
                    }
                }
                List<Placeable> list2 = (List) arrayList3;
                if (!list2.isEmpty()) {
                    Iterable iterable3 = list2;
                    Iterator it4 = iterable3.iterator();
                    if (!it4.hasNext()) {
                        obj5 = null;
                    } else {
                        obj5 = it4.next();
                        if (it4.hasNext()) {
                            int width4 = ((Placeable) obj5).getWidth();
                            do {
                                Object next4 = it4.next();
                                int width5 = ((Placeable) next4).getWidth();
                                if (width4 < width5) {
                                    obj5 = next4;
                                    width4 = width5;
                                }
                            } while (it4.hasNext());
                        }
                    }
                    Intrinsics.checkNotNull(obj5);
                    int width6 = ((Placeable) obj5).getWidth();
                    Iterator it5 = iterable3.iterator();
                    if (!it5.hasNext()) {
                        obj6 = null;
                    } else {
                        obj6 = it5.next();
                        if (it5.hasNext()) {
                            int height7 = ((Placeable) obj6).getHeight();
                            do {
                                Object next5 = it5.next();
                                int height8 = ((Placeable) next5).getHeight();
                                if (height7 < height8) {
                                    obj6 = next5;
                                    height7 = height8;
                                }
                            } while (it5.hasNext());
                        }
                    }
                    Intrinsics.checkNotNull(obj6);
                    int height9 = ((Placeable) obj6).getHeight();
                    if (!FabPosition.m1353equalsimpl0(i, FabPosition.Companion.m1358getEndERTFSPs())) {
                        i3 = (i3 - width6) / 2;
                    } else if (subcomposeMeasureScope2.getLayoutDirection() == LayoutDirection.Ltr) {
                        i3 = (i3 - subcomposeMeasureScope2.m5601roundToPx0680j_4(ScaffoldKt.FabSpacing)) - width6;
                    } else {
                        i3 = subcomposeMeasureScope2.m5601roundToPx0680j_4(ScaffoldKt.FabSpacing);
                    }
                    fabPlacement = new FabPlacement(i3, width6, height9);
                } else {
                    fabPlacement = null;
                }
                Iterable<Measurable> subcompose3 = subcomposeMeasureScope2.subcompose(ScaffoldLayoutContent.BottomBar, ComposableLambdaKt.composableLambdaInstance(-1455477816, true, new ScaffoldKt$ScaffoldLayout$1$1$1$bottomBarPlaceables$1(fabPlacement, function24, i2)));
                long j4 = r9;
                Collection arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(subcompose3, 10));
                for (Measurable r103 : subcompose3) {
                    arrayList4.add(r103.m4520measureBRTryo0(j4));
                }
                List list3 = (List) arrayList4;
                Iterable<Placeable> iterable4 = list3;
                Iterator it6 = iterable4.iterator();
                if (!it6.hasNext()) {
                    obj4 = null;
                } else {
                    obj4 = it6.next();
                    if (it6.hasNext()) {
                        int height10 = ((Placeable) obj4).getHeight();
                        do {
                            Object next6 = it6.next();
                            int height11 = ((Placeable) next6).getHeight();
                            if (height10 < height11) {
                                obj4 = next6;
                                height10 = height11;
                            }
                        } while (it6.hasNext());
                    }
                }
                Placeable placeable4 = (Placeable) obj4;
                Integer valueOf = placeable4 != null ? Integer.valueOf(placeable4.getHeight()) : null;
                if (fabPlacement != null) {
                    SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope2;
                    WindowInsets windowInsets3 = windowInsets;
                    if (valueOf == null) {
                        i2 = fabPlacement.getHeight() + subcomposeMeasureScope3.m5601roundToPx0680j_4(ScaffoldKt.FabSpacing) + windowInsets3.getBottom(subcomposeMeasureScope3);
                    } else {
                        i2 = valueOf.intValue() + fabPlacement.getHeight() + subcomposeMeasureScope3.m5601roundToPx0680j_4(ScaffoldKt.FabSpacing);
                    }
                    num = Integer.valueOf(i2);
                } else {
                    num = null;
                }
                if (height6 != 0) {
                    i = height6 + (num != null ? num.intValue() : valueOf != null ? valueOf.intValue() : windowInsets.getBottom(subcomposeMeasureScope2));
                } else {
                    i = 0;
                }
                Iterable<Measurable> subcompose4 = subcomposeMeasureScope2.subcompose(ScaffoldLayoutContent.MainContent, ComposableLambdaKt.composableLambdaInstance(1643221465, true, new ScaffoldKt$ScaffoldLayout$1$1$1$bodyContentPlaceables$1(windowInsets, subcomposeMeasureScope2, list, height3, list3, valueOf, function3, i2)));
                long j5 = r9;
                Collection arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(subcompose4, 10));
                for (Measurable r62 : subcompose4) {
                    arrayList5.add(r62.m4520measureBRTryo0(j5));
                }
                for (Placeable place$default : (List) arrayList5) {
                    Placeable.PlacementScope.place$default(placementScope, place$default, 0, 0, 0.0f, 4, (Object) null);
                    fabPlacement = fabPlacement;
                }
                FabPlacement fabPlacement2 = fabPlacement;
                for (Placeable place$default2 : iterable) {
                    Placeable.PlacementScope.place$default(placementScope, place$default2, 0, 0, 0.0f, 4, (Object) null);
                }
                int i4 = i3;
                WindowInsets windowInsets4 = windowInsets;
                SubcomposeMeasureScope subcomposeMeasureScope4 = subcomposeMeasureScope2;
                int i5 = i4;
                for (Placeable place$default3 : iterable2) {
                    Placeable.PlacementScope.place$default(placementScope, place$default3, windowInsets4.getLeft(subcomposeMeasureScope4, subcomposeMeasureScope4.getLayoutDirection()) + ((i4 - width3) / 2), i5 - i, 0.0f, 4, (Object) null);
                }
                int i6 = i4;
                for (Placeable place$default4 : iterable4) {
                    Placeable.PlacementScope.place$default(placementScope, place$default4, 0, i6 - (valueOf != null ? valueOf.intValue() : 0), 0.0f, 4, (Object) null);
                }
                if (fabPlacement2 != null) {
                    int i7 = i4;
                    for (Placeable place$default5 : list2) {
                        int left = fabPlacement2.getLeft();
                        Intrinsics.checkNotNull(num);
                        Placeable.PlacementScope.place$default(placementScope, place$default5, left, i7 - num.intValue(), 0.0f, 4, (Object) null);
                    }
                    Unit unit = Unit.INSTANCE;
                    Unit unit2 = Unit.INSTANCE;
                }
            }
        }, 4, (Object) null);
    }
}
