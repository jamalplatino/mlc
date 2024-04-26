package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: Tab.kt */
final class TabKt$TabBaselineLayout$2 implements MeasurePolicy {
    final /* synthetic */ Function2<Composer, Integer, Unit> $icon;
    final /* synthetic */ Function2<Composer, Integer, Unit> $text;

    TabKt$TabBaselineLayout$2(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22) {
        this.$text = function2;
        this.$icon = function22;
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public final MeasureResult m1677measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        Placeable placeable;
        Placeable placeable2;
        float f;
        MeasureScope measureScope2 = measureScope;
        List<? extends Measurable> list2 = list;
        Intrinsics.checkNotNullParameter(measureScope2, "$this$Layout");
        Intrinsics.checkNotNullParameter(list2, "measurables");
        if (this.$text != null) {
            for (Measurable measurable : list2) {
                if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), (Object) "text")) {
                    placeable = measurable.m4520measureBRTryo0(Constraints.m5561copyZbe2FdA$default(j, 0, 0, 0, 0, 11, (Object) null));
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        placeable = null;
        if (this.$icon != null) {
            for (Measurable measurable2 : list2) {
                if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), (Object) "icon")) {
                    placeable2 = measurable2.m4520measureBRTryo0(j);
                } else {
                    long j2 = j;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        placeable2 = null;
        int i = 0;
        int max = Math.max(placeable != null ? placeable.getWidth() : 0, placeable2 != null ? placeable2.getWidth() : 0);
        if (placeable == null || placeable2 == null) {
            f = TabKt.SmallTabHeight;
        } else {
            f = TabKt.LargeTabHeight;
        }
        int r5 = measureScope2.m5601roundToPx0680j_4(f);
        int height = placeable2 != null ? placeable2.getHeight() : 0;
        if (placeable != null) {
            i = placeable.getHeight();
        }
        int max2 = Math.max(r5, height + i + measureScope2.m5600roundToPxR2X_6o(TabKt.IconDistanceFromBaseline));
        return MeasureScope.layout$default(measureScope, max, max2, (Map) null, new TabKt$TabBaselineLayout$2$measure$1(placeable, placeable2, measureScope, max, max2, placeable != null ? Integer.valueOf(placeable.get(AlignmentLineKt.getFirstBaseline())) : null, placeable != null ? Integer.valueOf(placeable.get(AlignmentLineKt.getLastBaseline())) : null), 4, (Object) null);
    }
}
