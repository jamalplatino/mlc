package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: NavigationRail.kt */
final class NavigationRailKt$NavigationRailItemBaselineLayout$2 implements MeasurePolicy {
    final /* synthetic */ boolean $alwaysShowLabel;
    final /* synthetic */ float $animationProgress;
    final /* synthetic */ Function2<Composer, Integer, Unit> $label;

    NavigationRailKt$NavigationRailItemBaselineLayout$2(float f, Function2<? super Composer, ? super Integer, Unit> function2, boolean z) {
        this.$animationProgress = f;
        this.$label = function2;
        this.$alwaysShowLabel = z;
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public final MeasureResult m1471measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        float f;
        Object obj;
        Placeable placeable;
        Placeable placeable2;
        MeasureScope measureScope2 = measureScope;
        List<? extends Measurable> list2 = list;
        Intrinsics.checkNotNullParameter(measureScope2, "$this$Layout");
        Intrinsics.checkNotNullParameter(list2, "measurables");
        Iterable<Measurable> iterable = list2;
        for (Measurable measurable : iterable) {
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), (Object) "icon")) {
                Placeable r3 = measurable.m4520measureBRTryo0(j);
                float f2 = (float) 2;
                int width = r3.getWidth() + measureScope2.m5601roundToPx0680j_4(Dp.m5626constructorimpl(NavigationRailKt.IndicatorHorizontalPadding * f2));
                int roundToInt = MathKt.roundToInt(((float) width) * this.$animationProgress);
                if (this.$label == null) {
                    f = NavigationRailKt.IndicatorVerticalPaddingNoLabel;
                } else {
                    f = NavigationRailKt.IndicatorVerticalPaddingWithLabel;
                }
                int height = r3.getHeight() + measureScope2.m5601roundToPx0680j_4(Dp.m5626constructorimpl(f * f2));
                for (Measurable measurable2 : iterable) {
                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), (Object) "indicatorRipple")) {
                        Placeable r4 = measurable2.m4520measureBRTryo0(Constraints.Companion.m5578fixedJhjzzOo(width, height));
                        Iterator it = iterable.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) obj), (Object) "indicator")) {
                                break;
                            }
                        }
                        Measurable measurable3 = (Measurable) obj;
                        if (measurable3 != null) {
                            placeable = measurable3.m4520measureBRTryo0(Constraints.Companion.m5578fixedJhjzzOo(roundToInt, height));
                        } else {
                            placeable = null;
                        }
                        if (this.$label != null) {
                            for (Measurable measurable4 : iterable) {
                                if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable4), (Object) "label")) {
                                    placeable2 = measurable4.m4520measureBRTryo0(Constraints.m5561copyZbe2FdA$default(j, 0, 0, 0, 0, 11, (Object) null));
                                } else {
                                    long j2 = j;
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        placeable2 = null;
                        if (this.$label == null) {
                            return NavigationRailKt.m1469placeIconX9ElhV4(measureScope, r3, r4, placeable, j);
                        }
                        Intrinsics.checkNotNull(placeable2);
                        return NavigationRailKt.m1470placeLabelAndIconzUg2_y0(measureScope, placeable2, r3, r4, placeable, j, this.$alwaysShowLabel, this.$animationProgress);
                    }
                    long j3 = j;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
