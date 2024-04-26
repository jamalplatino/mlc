package androidx.compose.foundation.pager;

import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt;
import androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\u0007H\u0016J\f\u0010\n\u001a\u00020\u0007*\u00020\bH\u0016J\u0012\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\f*\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\r"}, d2 = {"androidx/compose/foundation/pager/PagerKt$SnapLayoutInfoProvider$1", "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "layoutInfo", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "getLayoutInfo", "()Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "calculateApproachOffset", "", "Landroidx/compose/ui/unit/Density;", "initialVelocity", "calculateSnapStepSize", "calculateSnappingOffsetBounds", "Lkotlin/ranges/ClosedFloatingPointRange;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: Pager.kt */
public final class PagerKt$SnapLayoutInfoProvider$1 implements SnapLayoutInfoProvider {
    final /* synthetic */ DecayAnimationSpec<Float> $decayAnimationSpec;
    final /* synthetic */ PagerSnapDistance $pagerSnapDistance;
    final /* synthetic */ PagerState $pagerState;

    PagerKt$SnapLayoutInfoProvider$1(PagerState pagerState, DecayAnimationSpec<Float> decayAnimationSpec, PagerSnapDistance pagerSnapDistance) {
        this.$pagerState = pagerState;
        this.$decayAnimationSpec = decayAnimationSpec;
        this.$pagerSnapDistance = pagerSnapDistance;
    }

    public final LazyListLayoutInfo getLayoutInfo() {
        return this.$pagerState.getLayoutInfo$foundation_release();
    }

    public ClosedFloatingPointRange<Float> calculateSnappingOffsetBounds(Density density) {
        Intrinsics.checkNotNullParameter(density, "<this>");
        List<LazyListItemInfo> visibleItemsInfo = getLayoutInfo().getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        float f = Float.NEGATIVE_INFINITY;
        float f2 = Float.POSITIVE_INFINITY;
        for (int i = 0; i < size; i++) {
            float calculateDistanceToDesiredSnapPosition = LazyListSnapLayoutInfoProviderKt.calculateDistanceToDesiredSnapPosition(density, getLayoutInfo(), visibleItemsInfo.get(i), PagerStateKt.getSnapAlignmentStartToStart());
            if (calculateDistanceToDesiredSnapPosition <= 0.0f && calculateDistanceToDesiredSnapPosition > f) {
                f = calculateDistanceToDesiredSnapPosition;
            }
            if (calculateDistanceToDesiredSnapPosition >= 0.0f && calculateDistanceToDesiredSnapPosition < f2) {
                f2 = calculateDistanceToDesiredSnapPosition;
            }
        }
        return RangesKt.rangeTo(f, f2);
    }

    public float calculateSnapStepSize(Density density) {
        Intrinsics.checkNotNullParameter(density, "<this>");
        LazyListLayoutInfo layoutInfo = getLayoutInfo();
        if (!(!layoutInfo.getVisibleItemsInfo().isEmpty())) {
            return 0.0f;
        }
        List<LazyListItemInfo> visibleItemsInfo = layoutInfo.getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += visibleItemsInfo.get(i2).getSize();
        }
        return ((float) i) / ((float) layoutInfo.getVisibleItemsInfo().size());
    }

    public float calculateApproachOffset(Density density, float f) {
        int i;
        LazyListItemInfo lazyListItemInfo;
        double d;
        Intrinsics.checkNotNullParameter(density, "<this>");
        int pageSize$foundation_release = this.$pagerState.getPageSize$foundation_release() + this.$pagerState.getPageSpacing$foundation_release();
        float calculateTargetValue = DecayAnimationSpecKt.calculateTargetValue(this.$decayAnimationSpec, 0.0f, f);
        LazyListItemInfo firstVisiblePage$foundation_release = this.$pagerState.getFirstVisiblePage$foundation_release();
        if (firstVisiblePage$foundation_release != null) {
            int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            i = firstVisiblePage$foundation_release.getIndex();
            if (i2 < 0) {
                i++;
            }
        } else {
            i = this.$pagerState.getCurrentPage();
        }
        List<LazyListItemInfo> visibleItemsInfo = getLayoutInfo().getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                lazyListItemInfo = null;
                break;
            }
            lazyListItemInfo = visibleItemsInfo.get(i3);
            if (lazyListItemInfo.getIndex() == i) {
                break;
            }
            i3++;
        }
        LazyListItemInfo lazyListItemInfo2 = lazyListItemInfo;
        int offset = lazyListItemInfo2 != null ? lazyListItemInfo2.getOffset() : 0;
        float f2 = (((float) (i * pageSize$foundation_release)) + calculateTargetValue) / ((float) pageSize$foundation_release);
        if (f > 0.0f) {
            d = Math.ceil((double) f2);
        } else {
            d = Math.floor((double) f2);
        }
        int coerceAtLeast = RangesKt.coerceAtLeast(Math.abs((RangesKt.coerceIn(this.$pagerSnapDistance.calculateTargetPage(i, RangesKt.coerceIn((int) ((float) d), 0, this.$pagerState.getPageCount$foundation_release()), f, this.$pagerState.getPageSize$foundation_release(), this.$pagerState.getPageSpacing$foundation_release()), 0, this.$pagerState.getPageCount$foundation_release()) - i) * pageSize$foundation_release) - Math.abs(offset), 0);
        if (coerceAtLeast == 0) {
            return (float) coerceAtLeast;
        }
        return ((float) coerceAtLeast) * Math.signum(f);
    }
}
