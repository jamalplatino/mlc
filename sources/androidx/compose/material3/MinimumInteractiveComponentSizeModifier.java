package androidx.compose.material3;

import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.DpSize;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\b\u0010\f\u001a\u00020\rH\u0016J)\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/material3/MinimumInteractiveComponentSizeModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "size", "Landroidx/compose/ui/unit/DpSize;", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getSize-MYxV2XQ", "()J", "J", "equals", "", "other", "", "hashCode", "", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: InteractiveComponentSize.kt */
final class MinimumInteractiveComponentSizeModifier implements LayoutModifier {
    private final long size;

    public /* synthetic */ MinimumInteractiveComponentSizeModifier(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    /* renamed from: getSize-MYxV2XQ  reason: not valid java name */
    public final long m1433getSizeMYxV2XQ() {
        return this.size;
    }

    private MinimumInteractiveComponentSizeModifier(long j) {
        this.size = j;
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public MeasureResult m1434measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        Intrinsics.checkNotNullParameter(measureScope, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        Placeable r9 = measurable.m4520measureBRTryo0(j);
        int max = Math.max(r9.getWidth(), measureScope.m5601roundToPx0680j_4(DpSize.m5724getWidthD9Ej5fM(this.size)));
        int max2 = Math.max(r9.getHeight(), measureScope.m5601roundToPx0680j_4(DpSize.m5722getHeightD9Ej5fM(this.size)));
        return MeasureScope.layout$default(measureScope, max, max2, (Map) null, new MinimumInteractiveComponentSizeModifier$measure$1(max, r9, max2), 4, (Object) null);
    }

    public boolean equals(Object obj) {
        MinimumInteractiveComponentSizeModifier minimumInteractiveComponentSizeModifier = obj instanceof MinimumInteractiveComponentSizeModifier ? (MinimumInteractiveComponentSizeModifier) obj : null;
        if (minimumInteractiveComponentSizeModifier == null) {
            return false;
        }
        return DpSize.m5721equalsimpl0(this.size, minimumInteractiveComponentSizeModifier.size);
    }

    public int hashCode() {
        return DpSize.m5726hashCodeimpl(this.size);
    }
}
