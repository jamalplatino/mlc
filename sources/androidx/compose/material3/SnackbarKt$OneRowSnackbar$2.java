package androidx.compose.material3;

import androidx.compose.material3.tokens.SnackbarTokens;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: Snackbar.kt */
final class SnackbarKt$OneRowSnackbar$2 implements MeasurePolicy {
    final /* synthetic */ String $actionTag;
    final /* synthetic */ String $dismissActionTag;
    final /* synthetic */ String $textTag;

    SnackbarKt$OneRowSnackbar$2(String str, String str2, String str3) {
        this.$actionTag = str;
        this.$dismissActionTag = str2;
        this.$textTag = str3;
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public final MeasureResult m1560measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        Placeable placeable;
        Object obj;
        Object obj2;
        int i;
        int i2;
        int i3;
        int i4;
        MeasureScope measureScope2 = measureScope;
        List<? extends Measurable> list2 = list;
        long j2 = j;
        Intrinsics.checkNotNullParameter(measureScope2, "$this$Layout");
        Intrinsics.checkNotNullParameter(list2, "measurables");
        int min = Math.min(Constraints.m5570getMaxWidthimpl(j), measureScope2.m5601roundToPx0680j_4(SnackbarKt.ContainerMaxWidth));
        Iterable<Measurable> iterable = list2;
        String str = this.$actionTag;
        Iterator it = iterable.iterator();
        while (true) {
            placeable = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) obj), (Object) str)) {
                break;
            }
        }
        Measurable measurable = (Measurable) obj;
        Placeable r15 = measurable != null ? measurable.m4520measureBRTryo0(j2) : null;
        String str2 = this.$dismissActionTag;
        Iterator it2 = iterable.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) obj2), (Object) str2)) {
                break;
            }
        }
        Measurable measurable2 = (Measurable) obj2;
        if (measurable2 != null) {
            placeable = measurable2.m4520measureBRTryo0(j2);
        }
        Placeable placeable2 = placeable;
        int width = r15 != null ? r15.getWidth() : 0;
        int height = r15 != null ? r15.getHeight() : 0;
        int width2 = placeable2 != null ? placeable2.getWidth() : 0;
        int height2 = placeable2 != null ? placeable2.getHeight() : 0;
        int coerceAtLeast = RangesKt.coerceAtLeast(((min - width) - width2) - (width2 == 0 ? measureScope2.m5601roundToPx0680j_4(SnackbarKt.TextEndExtraSpacing) : 0), Constraints.m5572getMinWidthimpl(j));
        String str3 = this.$textTag;
        for (Measurable measurable3 : iterable) {
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable3), (Object) str3)) {
                int i5 = height2;
                Placeable r2 = measurable3.m4520measureBRTryo0(Constraints.m5561copyZbe2FdA$default(j, 0, coerceAtLeast, 0, 0, 9, (Object) null));
                int i6 = r2.get(AlignmentLineKt.getFirstBaseline());
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = r2.get(AlignmentLineKt.getLastBaseline());
                    if (i7 != Integer.MIN_VALUE) {
                        boolean z = i6 == i7;
                        int i8 = min - width2;
                        int i9 = i8 - width;
                        if (z) {
                            int max = Math.max(measureScope2.m5601roundToPx0680j_4(SnackbarTokens.INSTANCE.m2306getSingleLineContainerHeightD9Ej5fM()), Math.max(height, i5));
                            int height3 = (max - r2.getHeight()) / 2;
                            i = (r15 == null || (i4 = r15.get(AlignmentLineKt.getFirstBaseline())) == Integer.MIN_VALUE) ? 0 : (i6 + height3) - i4;
                            i2 = height3;
                            i3 = max;
                        } else {
                            int r0 = measureScope2.m5601roundToPx0680j_4(SnackbarKt.HeightToFirstLine) - i6;
                            i3 = Math.max(measureScope2.m5601roundToPx0680j_4(SnackbarTokens.INSTANCE.m2307getTwoLinesContainerHeightD9Ej5fM()), r2.getHeight() + r0);
                            i2 = r0;
                            i = r15 != null ? (i3 - r15.getHeight()) / 2 : 0;
                        }
                        return MeasureScope.layout$default(measureScope, min, i3, (Map) null, new SnackbarKt$OneRowSnackbar$2$measure$4(r2, i2, placeable2, i8, placeable2 != null ? (i3 - placeable2.getHeight()) / 2 : 0, r15, i9, i), 4, (Object) null);
                    }
                    throw new IllegalArgumentException("No baselines for text".toString());
                }
                throw new IllegalArgumentException("No baselines for text".toString());
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
