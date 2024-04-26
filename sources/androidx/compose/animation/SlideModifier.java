package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.State;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001BF\u0012\u001c\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003R\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tø\u0001\u0000¢\u0006\u0002\u0010\fJ#\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001cø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010\u001f\u001a\u00020 *\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010'R*\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003R\b\u0012\u0004\u0012\u00020\u00070\u0006ø\u0001\u0000¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R1\u0010\u0012\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00150\u0013¢\u0006\u0002\b\u0016ø\u0001\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"Landroidx/compose/animation/SlideModifier;", "Landroidx/compose/animation/LayoutModifierWithPassThroughIntrinsics;", "lazyAnimation", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Landroidx/compose/ui/unit/IntOffset;", "Landroidx/compose/animation/core/AnimationVector2D;", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "slideIn", "Landroidx/compose/runtime/State;", "Landroidx/compose/animation/Slide;", "slideOut", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;)V", "getLazyAnimation", "()Landroidx/compose/animation/core/Transition$DeferredAnimation;", "getSlideIn", "()Landroidx/compose/runtime/State;", "getSlideOut", "transitionSpec", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Lkotlin/ExtensionFunctionType;", "getTransitionSpec", "()Lkotlin/jvm/functions/Function1;", "targetValueByState", "targetState", "fullSize", "Landroidx/compose/ui/unit/IntSize;", "targetValueByState-oFUgxo0", "(Landroidx/compose/animation/EnterExitState;J)J", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: EnterExitTransition.kt */
final class SlideModifier extends LayoutModifierWithPassThroughIntrinsics {
    private final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> lazyAnimation;
    private final State<Slide> slideIn;
    private final State<Slide> slideOut;
    private final Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>> transitionSpec = new SlideModifier$transitionSpec$1(this);

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* compiled from: EnterExitTransition.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.compose.animation.EnterExitState[] r0 = androidx.compose.animation.EnterExitState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.animation.EnterExitState r1 = androidx.compose.animation.EnterExitState.Visible     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.animation.EnterExitState r1 = androidx.compose.animation.EnterExitState.PreEnter     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.animation.EnterExitState r1 = androidx.compose.animation.EnterExitState.PostExit     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.SlideModifier.WhenMappings.<clinit>():void");
        }
    }

    public final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> getLazyAnimation() {
        return this.lazyAnimation;
    }

    public final State<Slide> getSlideIn() {
        return this.slideIn;
    }

    public final State<Slide> getSlideOut() {
        return this.slideOut;
    }

    public final Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>> getTransitionSpec() {
        return this.transitionSpec;
    }

    public SlideModifier(Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation, State<Slide> state, State<Slide> state2) {
        Intrinsics.checkNotNullParameter(deferredAnimation, "lazyAnimation");
        Intrinsics.checkNotNullParameter(state, "slideIn");
        Intrinsics.checkNotNullParameter(state2, "slideOut");
        this.lazyAnimation = deferredAnimation;
        this.slideIn = state;
        this.slideOut = state2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
        r0 = r0.getSlideOffset();
     */
    /* renamed from: targetValueByState-oFUgxo0  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long m107targetValueByStateoFUgxo0(androidx.compose.animation.EnterExitState r4, long r5) {
        /*
            r3 = this;
            java.lang.String r0 = "targetState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            androidx.compose.runtime.State<androidx.compose.animation.Slide> r0 = r3.slideIn
            java.lang.Object r0 = r0.getValue()
            androidx.compose.animation.Slide r0 = (androidx.compose.animation.Slide) r0
            if (r0 == 0) goto L_0x0025
            kotlin.jvm.functions.Function1 r0 = r0.getSlideOffset()
            if (r0 == 0) goto L_0x0025
            androidx.compose.ui.unit.IntSize r1 = androidx.compose.ui.unit.IntSize.m5778boximpl(r5)
            java.lang.Object r0 = r0.invoke(r1)
            androidx.compose.ui.unit.IntOffset r0 = (androidx.compose.ui.unit.IntOffset) r0
            long r0 = r0.m5753unboximpl()
            goto L_0x002b
        L_0x0025:
            androidx.compose.ui.unit.IntOffset$Companion r0 = androidx.compose.ui.unit.IntOffset.Companion
            long r0 = r0.m5754getZeronOccac()
        L_0x002b:
            androidx.compose.runtime.State<androidx.compose.animation.Slide> r2 = r3.slideOut
            java.lang.Object r2 = r2.getValue()
            androidx.compose.animation.Slide r2 = (androidx.compose.animation.Slide) r2
            if (r2 == 0) goto L_0x004a
            kotlin.jvm.functions.Function1 r2 = r2.getSlideOffset()
            if (r2 == 0) goto L_0x004a
            androidx.compose.ui.unit.IntSize r5 = androidx.compose.ui.unit.IntSize.m5778boximpl(r5)
            java.lang.Object r5 = r2.invoke(r5)
            androidx.compose.ui.unit.IntOffset r5 = (androidx.compose.ui.unit.IntOffset) r5
            long r5 = r5.m5753unboximpl()
            goto L_0x0050
        L_0x004a:
            androidx.compose.ui.unit.IntOffset$Companion r5 = androidx.compose.ui.unit.IntOffset.Companion
            long r5 = r5.m5754getZeronOccac()
        L_0x0050:
            int[] r2 = androidx.compose.animation.SlideModifier.WhenMappings.$EnumSwitchMapping$0
            int r4 = r4.ordinal()
            r4 = r2[r4]
            r2 = 1
            if (r4 == r2) goto L_0x0069
            r2 = 2
            if (r4 == r2) goto L_0x006f
            r0 = 3
            if (r4 != r0) goto L_0x0063
            r0 = r5
            goto L_0x006f
        L_0x0063:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        L_0x0069:
            androidx.compose.ui.unit.IntOffset$Companion r4 = androidx.compose.ui.unit.IntOffset.Companion
            long r0 = r4.m5754getZeronOccac()
        L_0x006f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.SlideModifier.m107targetValueByStateoFUgxo0(androidx.compose.animation.EnterExitState, long):long");
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public MeasureResult m106measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        Intrinsics.checkNotNullParameter(measureScope, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        Placeable r9 = measurable.m4520measureBRTryo0(j);
        return MeasureScope.layout$default(measureScope, r9.getWidth(), r9.getHeight(), (Map) null, new SlideModifier$measure$1(this, r9, IntSizeKt.IntSize(r9.getWidth(), r9.getHeight())), 4, (Object) null);
    }
}