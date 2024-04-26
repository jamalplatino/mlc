package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: AppBar.kt */
final class AppBarKt$TopAppBarLayout$2 implements MeasurePolicy {
    final /* synthetic */ float $heightPx;
    final /* synthetic */ int $titleBottomPadding;
    final /* synthetic */ Arrangement.Horizontal $titleHorizontalArrangement;
    final /* synthetic */ Arrangement.Vertical $titleVerticalArrangement;

    AppBarKt$TopAppBarLayout$2(float f, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, int i) {
        this.$heightPx = f;
        this.$titleHorizontalArrangement = horizontal;
        this.$titleVerticalArrangement = vertical;
        this.$titleBottomPadding = i;
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public final MeasureResult m1129measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        int i;
        List<? extends Measurable> list2 = list;
        Intrinsics.checkNotNullParameter(measureScope, "$this$Layout");
        Intrinsics.checkNotNullParameter(list2, "measurables");
        Iterable<Measurable> iterable = list2;
        for (Measurable measurable : iterable) {
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), (Object) "navigationIcon")) {
                Placeable r2 = measurable.m4520measureBRTryo0(Constraints.m5561copyZbe2FdA$default(j, 0, 0, 0, 0, 14, (Object) null));
                for (Measurable measurable2 : iterable) {
                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), (Object) "actionIcons")) {
                        Placeable r10 = measurable2.m4520measureBRTryo0(Constraints.m5561copyZbe2FdA$default(j, 0, 0, 0, 0, 14, (Object) null));
                        if (Constraints.m5570getMaxWidthimpl(j) == Integer.MAX_VALUE) {
                            i = Constraints.m5570getMaxWidthimpl(j);
                        } else {
                            i = RangesKt.coerceAtLeast((Constraints.m5570getMaxWidthimpl(j) - r2.getWidth()) - r10.getWidth(), 0);
                        }
                        int i2 = i;
                        for (Measurable measurable3 : iterable) {
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable3), (Object) "title")) {
                                Placeable r1 = measurable3.m4520measureBRTryo0(Constraints.m5561copyZbe2FdA$default(j, 0, i2, 0, 0, 12, (Object) null));
                                int i3 = r1.get(AlignmentLineKt.getLastBaseline()) != Integer.MIN_VALUE ? r1.get(AlignmentLineKt.getLastBaseline()) : 0;
                                Placeable placeable = r2;
                                int roundToInt = MathKt.roundToInt(this.$heightPx);
                                return MeasureScope.layout$default(measureScope, Constraints.m5570getMaxWidthimpl(j), roundToInt, (Map) null, new AppBarKt$TopAppBarLayout$2$measure$1(placeable, roundToInt, r1, this.$titleHorizontalArrangement, j, r10, measureScope, this.$titleVerticalArrangement, this.$titleBottomPadding, i3), 4, (Object) null);
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
