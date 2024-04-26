package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.ClipScrollableContainerKt;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.OverscrollKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000`\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a£\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u001d\u0010\u0006\u001a\u0019\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0002\b\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\u0019¢\u0006\u0002\b\u000bH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001d\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010 \u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006!"}, d2 = {"LazyStaggeredGrid", "", "state", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "slotSizesSums", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/Constraints;", "", "Lkotlin/ExtensionFunctionType;", "modifier", "Landroidx/compose/ui/Modifier;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "userScrollEnabled", "mainAxisSpacing", "Landroidx/compose/ui/unit/Dp;", "crossAxisSpacing", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;", "LazyStaggeredGrid-LJWHXA8", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/FlingBehavior;ZFFLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "ScrollPositionUpdater", "itemProvider", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/runtime/Composer;I)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: LazyStaggeredGrid.kt */
public final class LazyStaggeredGridKt {
    /* renamed from: LazyStaggeredGrid-LJWHXA8  reason: not valid java name */
    public static final void m775LazyStaggeredGridLJWHXA8(LazyStaggeredGridState lazyStaggeredGridState, Orientation orientation, Function2<? super Density, ? super Constraints, int[]> function2, Modifier modifier, PaddingValues paddingValues, boolean z, FlingBehavior flingBehavior, boolean z2, float f, float f2, Function1<? super LazyStaggeredGridScope, Unit> function1, Composer composer, int i, int i2, int i3) {
        Modifier modifier2;
        FlingBehavior flingBehavior2;
        int i4;
        float f3;
        LazyStaggeredGridState lazyStaggeredGridState2 = lazyStaggeredGridState;
        Orientation orientation2 = orientation;
        Function1<? super LazyStaggeredGridScope, Unit> function12 = function1;
        int i5 = i2;
        int i6 = i3;
        Intrinsics.checkNotNullParameter(lazyStaggeredGridState2, "state");
        Intrinsics.checkNotNullParameter(orientation2, "orientation");
        Intrinsics.checkNotNullParameter(function2, "slotSizesSums");
        Intrinsics.checkNotNullParameter(function12, "content");
        Composer startRestartGroup = composer.startRestartGroup(1320541636);
        ComposerKt.sourceInformation(startRestartGroup, "C(LazyStaggeredGrid)P(9,6,8,5,1,7,3,10,4:c#ui.unit.Dp,2:c#ui.unit.Dp)53@2434L15,63@2850L18,65@2893L49,66@2967L219,76@3211L60,78@3277L42,88@3685L7,98@4050L265,80@3325L1117:LazyStaggeredGrid.kt#fzvcnm");
        if ((i6 & 8) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        PaddingValues r16 = (i6 & 16) != 0 ? PaddingKt.m486PaddingValues0680j_4(Dp.m5626constructorimpl((float) 0)) : paddingValues;
        boolean z3 = (i6 & 32) != 0 ? false : z;
        if ((i6 & 64) != 0) {
            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
            i4 = i & -3670017;
        } else {
            flingBehavior2 = flingBehavior;
            i4 = i;
        }
        boolean z4 = (i6 & 128) != 0 ? true : z2;
        float r19 = (i6 & 256) != 0 ? Dp.m5626constructorimpl((float) 0) : f;
        if ((i6 & 512) != 0) {
            f3 = Dp.m5626constructorimpl((float) 0);
        } else {
            f3 = f2;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1320541636, i4, i5, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGrid (LazyStaggeredGrid.kt:39)");
        }
        OverscrollEffect overscrollEffect = ScrollableDefaults.INSTANCE.overscrollEffect(startRestartGroup, 6);
        LazyStaggeredGridItemProvider rememberStaggeredGridItemProvider = LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProvider(lazyStaggeredGridState2, function12, startRestartGroup, ((i5 << 3) & 112) | 8);
        int i7 = i4 >> 6;
        int i8 = i4 >> 9;
        OverscrollEffect overscrollEffect2 = overscrollEffect;
        int i9 = i4;
        boolean z5 = z3;
        Modifier modifier3 = modifier2;
        Composer composer2 = startRestartGroup;
        Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult> r8 = LazyStaggeredGridMeasurePolicyKt.m785rememberStaggeredGridMeasurePolicynbWgWpA(lazyStaggeredGridState, rememberStaggeredGridItemProvider, r16, z3, orientation, r19, f3, function2, startRestartGroup, (i7 & 7168) | (i7 & 896) | 8 | ((i4 << 9) & 57344) | (i8 & 458752) | (i8 & 3670016) | ((i4 << 15) & 29360128));
        LazyLayoutSemanticState rememberLazyStaggeredGridSemanticState = LazyStaggeredGridSemanticsKt.rememberLazyStaggeredGridSemanticState(lazyStaggeredGridState2, z5, composer2, ((i9 >> 12) & 112) | 8);
        LazyLayoutItemProvider lazyLayoutItemProvider = rememberStaggeredGridItemProvider;
        ScrollPositionUpdater(lazyLayoutItemProvider, lazyStaggeredGridState2, composer2, 64);
        Modifier overscroll = OverscrollKt.overscroll(ClipScrollableContainerKt.clipScrollableContainer(modifier3.then(lazyStaggeredGridState.getRemeasurementModifier$foundation_release()), orientation2), overscrollEffect2);
        ScrollableDefaults scrollableDefaults = ScrollableDefaults.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ComposerKt.sourceInformationMarkerEnd(composer2);
        boolean z6 = z4;
        LazyLayoutItemProvider lazyLayoutItemProvider2 = lazyLayoutItemProvider;
        LazyLayoutKt.LazyLayout(lazyLayoutItemProvider2, LazyLayoutSemanticsKt.lazyLayoutSemantics(ScrollableKt.scrollable(overscroll, lazyStaggeredGridState2, orientation, overscrollEffect2, z6, scrollableDefaults.reverseDirection((LayoutDirection) consume, orientation2, z5), flingBehavior2, lazyStaggeredGridState.getMutableInteractionSource$foundation_release()), lazyLayoutItemProvider2, rememberLazyStaggeredGridSemanticState, orientation, z6, z5, composer2, ((i9 << 6) & 7168) | (i8 & 57344) | (i9 & 458752)), lazyStaggeredGridState.getPrefetchState$foundation_release(), r8, composer2, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new LazyStaggeredGridKt$LazyStaggeredGrid$1(lazyStaggeredGridState, orientation, function2, modifier3, r16, z5, flingBehavior2, z4, r19, f3, function1, i, i2, i3));
        }
    }

    /* access modifiers changed from: private */
    public static final void ScrollPositionUpdater(LazyLayoutItemProvider lazyLayoutItemProvider, LazyStaggeredGridState lazyStaggeredGridState, Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(231106410);
        ComposerKt.sourceInformation(startRestartGroup, "C(ScrollPositionUpdater):LazyStaggeredGrid.kt#fzvcnm");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(231106410, i, -1, "androidx.compose.foundation.lazy.staggeredgrid.ScrollPositionUpdater (LazyStaggeredGrid.kt:114)");
        }
        if (lazyLayoutItemProvider.getItemCount() > 0) {
            lazyStaggeredGridState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyLayoutItemProvider);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new LazyStaggeredGridKt$ScrollPositionUpdater$1(lazyLayoutItemProvider, lazyStaggeredGridState, i));
        }
    }
}
