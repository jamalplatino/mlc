package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aT\u0010\r\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142#\b\u0002\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00170\u0016H\u0007ø\u0001\u0000\u001aT\u0010\u001b\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u001c2\b\b\u0002\u0010\u0013\u001a\u00020\u00142#\b\u0002\u0010\u001d\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\b0\u0016H\u0007ø\u0001\u0000\u001aT\u0010\u001f\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\b\b\u0002\u0010\u0011\u001a\u00020 2\b\b\u0002\u0010\u0013\u001a\u00020\u00142#\b\u0002\u0010!\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00170\u0016H\u0007ø\u0001\u0000\u001a\"\u0010#\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\b\b\u0002\u0010$\u001a\u00020\u0002H\u0007\u001a\"\u0010%\u001a\u00020&2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\b\b\u0002\u0010'\u001a\u00020\u0002H\u0007\u001a9\u0010(\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\b\b\u0002\u0010)\u001a\u00020\u00022\b\b\u0002\u0010*\u001a\u00020\u000bH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a9\u0010-\u001a\u00020&2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\b\b\u0002\u0010.\u001a\u00020\u00022\b\b\u0002\u0010*\u001a\u00020\u000bH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u00100\u001aT\u00101\u001a\u00020&2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\b\b\u0002\u00102\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142#\b\u0002\u00103\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00170\u0016H\u0007ø\u0001\u0000\u001aT\u00104\u001a\u00020&2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\b\b\u0002\u00102\u001a\u00020\u001c2\b\b\u0002\u0010\u0013\u001a\u00020\u00142#\b\u0002\u00105\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\b0\u0016H\u0007ø\u0001\u0000\u001aT\u00106\u001a\u00020&2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\b\b\u0002\u00102\u001a\u00020 2\b\b\u0002\u0010\u0013\u001a\u00020\u00142#\b\u0002\u00107\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00170\u0016H\u0007ø\u0001\u0000\u001a>\u00108\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102!\u00109\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00060\u0016H\u0007ø\u0001\u0000\u001a@\u0010:\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102#\b\u0002\u0010;\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00170\u0016H\u0007ø\u0001\u0000\u001a@\u0010<\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102#\b\u0002\u0010=\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00170\u0016H\u0007ø\u0001\u0000\u001a>\u0010>\u001a\u00020&2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102!\u0010?\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00060\u0016H\u0007ø\u0001\u0000\u001a@\u0010@\u001a\u00020&2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102#\b\u0002\u0010A\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00170\u0016H\u0007ø\u0001\u0000\u001a@\u0010B\u001a\u00020&2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102#\b\u0002\u0010C\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00170\u0016H\u0007ø\u0001\u0000\u001a/\u0010D\u001a\u00020E*\b\u0012\u0004\u0012\u00020G0F2\u0006\u0010H\u001a\u00020\u000e2\u0006\u0010I\u001a\u00020&2\u0006\u0010J\u001a\u00020KH\u0001¢\u0006\u0002\u0010L\u001aB\u0010M\u001a\u00020E*\u00020E2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020G0F2\u000e\u0010O\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010Q0P2\u000e\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010Q0P2\u0006\u0010S\u001a\u00020KH\u0002\u001aB\u0010T\u001a\u00020E*\u00020E2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020G0F2\u000e\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010U0P2\u000e\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010U0P2\u0006\u0010S\u001a\u00020KH\u0002\u001a\f\u0010V\u001a\u00020\u001c*\u00020\u0012H\u0002\u001a\f\u0010V\u001a\u00020\u001c*\u00020 H\u0002\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004X\u0004¢\u0006\u0002\n\u0000\"\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004X\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000\"\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0004X\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000\"\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006W"}, d2 = {"DefaultAlpha", "Landroidx/compose/runtime/MutableState;", "", "DefaultAlphaAndScaleSpring", "Landroidx/compose/animation/core/SpringSpec;", "DefaultOffsetAnimationSpec", "Landroidx/compose/ui/unit/IntOffset;", "DefaultSizeAnimationSpec", "Landroidx/compose/ui/unit/IntSize;", "TransformOriginVectorConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/graphics/TransformOrigin;", "Landroidx/compose/animation/core/AnimationVector2D;", "expandHorizontally", "Landroidx/compose/animation/EnterTransition;", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "expandFrom", "Landroidx/compose/ui/Alignment$Horizontal;", "clip", "", "initialWidth", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "fullWidth", "expandIn", "Landroidx/compose/ui/Alignment;", "initialSize", "fullSize", "expandVertically", "Landroidx/compose/ui/Alignment$Vertical;", "initialHeight", "fullHeight", "fadeIn", "initialAlpha", "fadeOut", "Landroidx/compose/animation/ExitTransition;", "targetAlpha", "scaleIn", "initialScale", "transformOrigin", "scaleIn-L8ZKh-E", "(Landroidx/compose/animation/core/FiniteAnimationSpec;FJ)Landroidx/compose/animation/EnterTransition;", "scaleOut", "targetScale", "scaleOut-L8ZKh-E", "(Landroidx/compose/animation/core/FiniteAnimationSpec;FJ)Landroidx/compose/animation/ExitTransition;", "shrinkHorizontally", "shrinkTowards", "targetWidth", "shrinkOut", "targetSize", "shrinkVertically", "targetHeight", "slideIn", "initialOffset", "slideInHorizontally", "initialOffsetX", "slideInVertically", "initialOffsetY", "slideOut", "targetOffset", "slideOutHorizontally", "targetOffsetX", "slideOutVertically", "targetOffsetY", "createModifier", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "enter", "exit", "label", "", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "shrinkExpand", "transition", "expand", "Landroidx/compose/runtime/State;", "Landroidx/compose/animation/ChangeSize;", "shrink", "labelPrefix", "slideInOut", "Landroidx/compose/animation/Slide;", "toAlignment", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: EnterExitTransition.kt */
public final class EnterExitTransitionKt {
    private static final MutableState<Float> DefaultAlpha = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(1.0f), (SnapshotMutationPolicy) null, 2, (Object) null);
    /* access modifiers changed from: private */
    public static final SpringSpec<Float> DefaultAlphaAndScaleSpring = AnimationSpecKt.spring$default(0.0f, 400.0f, (Object) null, 5, (Object) null);
    /* access modifiers changed from: private */
    public static final SpringSpec<IntOffset> DefaultOffsetAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m5735boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, (Object) null);
    /* access modifiers changed from: private */
    public static final SpringSpec<IntSize> DefaultSizeAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m5778boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, (Object) null);
    private static final TwoWayConverter<TransformOrigin, AnimationVector2D> TransformOriginVectorConverter = VectorConvertersKt.TwoWayConverter(EnterExitTransitionKt$TransformOriginVectorConverter$1.INSTANCE, EnterExitTransitionKt$TransformOriginVectorConverter$2.INSTANCE);

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
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.EnterExitTransitionKt.WhenMappings.<clinit>():void");
        }
    }

    public static /* synthetic */ EnterTransition fadeIn$default(FiniteAnimationSpec finiteAnimationSpec, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, (Object) null, 5, (Object) null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return fadeIn(finiteAnimationSpec, f);
    }

    public static final EnterTransition fadeIn(FiniteAnimationSpec<Float> finiteAnimationSpec, float f) {
        Intrinsics.checkNotNullParameter(finiteAnimationSpec, "animationSpec");
        return new EnterTransitionImpl(new TransitionData(new Fade(f, finiteAnimationSpec), (Slide) null, (ChangeSize) null, (Scale) null, 14, (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ ExitTransition fadeOut$default(FiniteAnimationSpec finiteAnimationSpec, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, (Object) null, 5, (Object) null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return fadeOut(finiteAnimationSpec, f);
    }

    public static final ExitTransition fadeOut(FiniteAnimationSpec<Float> finiteAnimationSpec, float f) {
        Intrinsics.checkNotNullParameter(finiteAnimationSpec, "animationSpec");
        return new ExitTransitionImpl(new TransitionData(new Fade(f, finiteAnimationSpec), (Slide) null, (ChangeSize) null, (Scale) null, 14, (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ EnterTransition slideIn$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m5735boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, (Object) null);
        }
        return slideIn(finiteAnimationSpec, function1);
    }

    public static final EnterTransition slideIn(FiniteAnimationSpec<IntOffset> finiteAnimationSpec, Function1<? super IntSize, IntOffset> function1) {
        Intrinsics.checkNotNullParameter(finiteAnimationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(function1, "initialOffset");
        return new EnterTransitionImpl(new TransitionData((Fade) null, new Slide(function1, finiteAnimationSpec), (ChangeSize) null, (Scale) null, 13, (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ ExitTransition slideOut$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m5735boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, (Object) null);
        }
        return slideOut(finiteAnimationSpec, function1);
    }

    public static final ExitTransition slideOut(FiniteAnimationSpec<IntOffset> finiteAnimationSpec, Function1<? super IntSize, IntOffset> function1) {
        Intrinsics.checkNotNullParameter(finiteAnimationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(function1, "targetOffset");
        return new ExitTransitionImpl(new TransitionData((Fade) null, new Slide(function1, finiteAnimationSpec), (ChangeSize) null, (Scale) null, 13, (DefaultConstructorMarker) null));
    }

    /* renamed from: scaleIn-L8ZKh-E$default  reason: not valid java name */
    public static /* synthetic */ EnterTransition m70scaleInL8ZKhE$default(FiniteAnimationSpec finiteAnimationSpec, float f, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, (Object) null, 5, (Object) null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            j = TransformOrigin.Companion.m3243getCenterSzJe1aQ();
        }
        return m69scaleInL8ZKhE(finiteAnimationSpec, f, j);
    }

    /* renamed from: scaleIn-L8ZKh-E  reason: not valid java name */
    public static final EnterTransition m69scaleInL8ZKhE(FiniteAnimationSpec<Float> finiteAnimationSpec, float f, long j) {
        Intrinsics.checkNotNullParameter(finiteAnimationSpec, "animationSpec");
        return new EnterTransitionImpl(new TransitionData((Fade) null, (Slide) null, (ChangeSize) null, new Scale(f, j, finiteAnimationSpec, (DefaultConstructorMarker) null), 7, (DefaultConstructorMarker) null));
    }

    /* renamed from: scaleOut-L8ZKh-E$default  reason: not valid java name */
    public static /* synthetic */ ExitTransition m72scaleOutL8ZKhE$default(FiniteAnimationSpec finiteAnimationSpec, float f, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, (Object) null, 5, (Object) null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            j = TransformOrigin.Companion.m3243getCenterSzJe1aQ();
        }
        return m71scaleOutL8ZKhE(finiteAnimationSpec, f, j);
    }

    /* renamed from: scaleOut-L8ZKh-E  reason: not valid java name */
    public static final ExitTransition m71scaleOutL8ZKhE(FiniteAnimationSpec<Float> finiteAnimationSpec, float f, long j) {
        Intrinsics.checkNotNullParameter(finiteAnimationSpec, "animationSpec");
        return new ExitTransitionImpl(new TransitionData((Fade) null, (Slide) null, (ChangeSize) null, new Scale(f, j, finiteAnimationSpec, (DefaultConstructorMarker) null), 7, (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ EnterTransition expandIn$default(FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m5778boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, (Object) null);
        }
        if ((i & 2) != 0) {
            alignment = Alignment.Companion.getBottomEnd();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function1 = EnterExitTransitionKt$expandIn$1.INSTANCE;
        }
        return expandIn(finiteAnimationSpec, alignment, z, function1);
    }

    public static final EnterTransition expandIn(FiniteAnimationSpec<IntSize> finiteAnimationSpec, Alignment alignment, boolean z, Function1<? super IntSize, IntSize> function1) {
        Intrinsics.checkNotNullParameter(finiteAnimationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(alignment, "expandFrom");
        Intrinsics.checkNotNullParameter(function1, "initialSize");
        return new EnterTransitionImpl(new TransitionData((Fade) null, (Slide) null, new ChangeSize(alignment, function1, finiteAnimationSpec, z), (Scale) null, 11, (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ ExitTransition shrinkOut$default(FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m5778boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, (Object) null);
        }
        if ((i & 2) != 0) {
            alignment = Alignment.Companion.getBottomEnd();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function1 = EnterExitTransitionKt$shrinkOut$1.INSTANCE;
        }
        return shrinkOut(finiteAnimationSpec, alignment, z, function1);
    }

    public static final ExitTransition shrinkOut(FiniteAnimationSpec<IntSize> finiteAnimationSpec, Alignment alignment, boolean z, Function1<? super IntSize, IntSize> function1) {
        Intrinsics.checkNotNullParameter(finiteAnimationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(alignment, "shrinkTowards");
        Intrinsics.checkNotNullParameter(function1, "targetSize");
        return new ExitTransitionImpl(new TransitionData((Fade) null, (Slide) null, new ChangeSize(alignment, function1, finiteAnimationSpec, z), (Scale) null, 11, (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ EnterTransition expandHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m5778boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, (Object) null);
        }
        if ((i & 2) != 0) {
            horizontal = Alignment.Companion.getEnd();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function1 = EnterExitTransitionKt$expandHorizontally$1.INSTANCE;
        }
        return expandHorizontally(finiteAnimationSpec, horizontal, z, function1);
    }

    public static final EnterTransition expandHorizontally(FiniteAnimationSpec<IntSize> finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z, Function1<? super Integer, Integer> function1) {
        Intrinsics.checkNotNullParameter(finiteAnimationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(horizontal, "expandFrom");
        Intrinsics.checkNotNullParameter(function1, "initialWidth");
        return expandIn(finiteAnimationSpec, toAlignment(horizontal), z, new EnterExitTransitionKt$expandHorizontally$2(function1));
    }

    public static /* synthetic */ EnterTransition expandVertically$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Vertical vertical, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m5778boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, (Object) null);
        }
        if ((i & 2) != 0) {
            vertical = Alignment.Companion.getBottom();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function1 = EnterExitTransitionKt$expandVertically$1.INSTANCE;
        }
        return expandVertically(finiteAnimationSpec, vertical, z, function1);
    }

    public static final EnterTransition expandVertically(FiniteAnimationSpec<IntSize> finiteAnimationSpec, Alignment.Vertical vertical, boolean z, Function1<? super Integer, Integer> function1) {
        Intrinsics.checkNotNullParameter(finiteAnimationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(vertical, "expandFrom");
        Intrinsics.checkNotNullParameter(function1, "initialHeight");
        return expandIn(finiteAnimationSpec, toAlignment(vertical), z, new EnterExitTransitionKt$expandVertically$2(function1));
    }

    public static /* synthetic */ ExitTransition shrinkHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m5778boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, (Object) null);
        }
        if ((i & 2) != 0) {
            horizontal = Alignment.Companion.getEnd();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function1 = EnterExitTransitionKt$shrinkHorizontally$1.INSTANCE;
        }
        return shrinkHorizontally(finiteAnimationSpec, horizontal, z, function1);
    }

    public static final ExitTransition shrinkHorizontally(FiniteAnimationSpec<IntSize> finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z, Function1<? super Integer, Integer> function1) {
        Intrinsics.checkNotNullParameter(finiteAnimationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(horizontal, "shrinkTowards");
        Intrinsics.checkNotNullParameter(function1, "targetWidth");
        return shrinkOut(finiteAnimationSpec, toAlignment(horizontal), z, new EnterExitTransitionKt$shrinkHorizontally$2(function1));
    }

    public static /* synthetic */ ExitTransition shrinkVertically$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Vertical vertical, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m5778boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, (Object) null);
        }
        if ((i & 2) != 0) {
            vertical = Alignment.Companion.getBottom();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function1 = EnterExitTransitionKt$shrinkVertically$1.INSTANCE;
        }
        return shrinkVertically(finiteAnimationSpec, vertical, z, function1);
    }

    public static final ExitTransition shrinkVertically(FiniteAnimationSpec<IntSize> finiteAnimationSpec, Alignment.Vertical vertical, boolean z, Function1<? super Integer, Integer> function1) {
        Intrinsics.checkNotNullParameter(finiteAnimationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(vertical, "shrinkTowards");
        Intrinsics.checkNotNullParameter(function1, "targetHeight");
        return shrinkOut(finiteAnimationSpec, toAlignment(vertical), z, new EnterExitTransitionKt$shrinkVertically$2(function1));
    }

    public static /* synthetic */ EnterTransition slideInHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m5735boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, (Object) null);
        }
        if ((i & 2) != 0) {
            function1 = EnterExitTransitionKt$slideInHorizontally$1.INSTANCE;
        }
        return slideInHorizontally(finiteAnimationSpec, function1);
    }

    public static final EnterTransition slideInHorizontally(FiniteAnimationSpec<IntOffset> finiteAnimationSpec, Function1<? super Integer, Integer> function1) {
        Intrinsics.checkNotNullParameter(finiteAnimationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(function1, "initialOffsetX");
        return slideIn(finiteAnimationSpec, new EnterExitTransitionKt$slideInHorizontally$2(function1));
    }

    public static /* synthetic */ EnterTransition slideInVertically$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m5735boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, (Object) null);
        }
        if ((i & 2) != 0) {
            function1 = EnterExitTransitionKt$slideInVertically$1.INSTANCE;
        }
        return slideInVertically(finiteAnimationSpec, function1);
    }

    public static final EnterTransition slideInVertically(FiniteAnimationSpec<IntOffset> finiteAnimationSpec, Function1<? super Integer, Integer> function1) {
        Intrinsics.checkNotNullParameter(finiteAnimationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(function1, "initialOffsetY");
        return slideIn(finiteAnimationSpec, new EnterExitTransitionKt$slideInVertically$2(function1));
    }

    public static /* synthetic */ ExitTransition slideOutHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m5735boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, (Object) null);
        }
        if ((i & 2) != 0) {
            function1 = EnterExitTransitionKt$slideOutHorizontally$1.INSTANCE;
        }
        return slideOutHorizontally(finiteAnimationSpec, function1);
    }

    public static final ExitTransition slideOutHorizontally(FiniteAnimationSpec<IntOffset> finiteAnimationSpec, Function1<? super Integer, Integer> function1) {
        Intrinsics.checkNotNullParameter(finiteAnimationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(function1, "targetOffsetX");
        return slideOut(finiteAnimationSpec, new EnterExitTransitionKt$slideOutHorizontally$2(function1));
    }

    public static /* synthetic */ ExitTransition slideOutVertically$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m5735boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, (Object) null);
        }
        if ((i & 2) != 0) {
            function1 = EnterExitTransitionKt$slideOutVertically$1.INSTANCE;
        }
        return slideOutVertically(finiteAnimationSpec, function1);
    }

    public static final ExitTransition slideOutVertically(FiniteAnimationSpec<IntOffset> finiteAnimationSpec, Function1<? super Integer, Integer> function1) {
        Intrinsics.checkNotNullParameter(finiteAnimationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(function1, "targetOffsetY");
        return slideOut(finiteAnimationSpec, new EnterExitTransitionKt$slideOutVertically$2(function1));
    }

    private static final Alignment toAlignment(Alignment.Horizontal horizontal) {
        if (Intrinsics.areEqual((Object) horizontal, (Object) Alignment.Companion.getStart())) {
            return Alignment.Companion.getCenterStart();
        }
        if (Intrinsics.areEqual((Object) horizontal, (Object) Alignment.Companion.getEnd())) {
            return Alignment.Companion.getCenterEnd();
        }
        return Alignment.Companion.getCenter();
    }

    private static final Alignment toAlignment(Alignment.Vertical vertical) {
        if (Intrinsics.areEqual((Object) vertical, (Object) Alignment.Companion.getTop())) {
            return Alignment.Companion.getTopCenter();
        }
        if (Intrinsics.areEqual((Object) vertical, (Object) Alignment.Companion.getBottom())) {
            return Alignment.Companion.getBottomCenter();
        }
        return Alignment.Companion.getCenter();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: androidx.compose.runtime.MutableState} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x03a2  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x03be  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x03d0  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x03fa  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0401  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0446  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0464  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x04b0  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x04c2  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x050c  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x050f  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0514  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0520  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x053c  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x054e  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0599  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x059e  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x05aa  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0267  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.ui.Modifier createModifier(androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r29, androidx.compose.animation.EnterTransition r30, androidx.compose.animation.ExitTransition r31, java.lang.String r32, androidx.compose.runtime.Composer r33, int r34) {
        /*
            r8 = r29
            r9 = r30
            r10 = r31
            r11 = r32
            r12 = r33
            r0 = r34
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r1)
            java.lang.String r1 = "enter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            java.lang.String r1 = "exit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r1)
            java.lang.String r1 = "label"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r1)
            r1 = 914000546(0x367a8aa2, float:3.7333598E-6)
            r12.startReplaceableGroup(r1)
            java.lang.String r2 = "C(createModifier)832@36300L38,833@36348L37,837@36443L43,838@36496L42,845@36867L40,846@36938L40:EnterExitTransition.kt#xbi5r1"
            androidx.compose.runtime.ComposerKt.sourceInformation(r12, r2)
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            r13 = -1
            if (r2 == 0) goto L_0x003b
            java.lang.String r2 = "androidx.compose.animation.createModifier (EnterExitTransition.kt:820)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r1, r0, r13, r2)
        L_0x003b:
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
            androidx.compose.animation.TransitionData r2 = r30.getData$animation_release()
            androidx.compose.animation.Slide r2 = r2.getSlide()
            r3 = 0
            androidx.compose.runtime.State r2 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(r2, r12, r3)
            androidx.compose.animation.TransitionData r4 = r31.getData$animation_release()
            androidx.compose.animation.Slide r4 = r4.getSlide()
            androidx.compose.runtime.State r4 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(r4, r12, r3)
            androidx.compose.ui.Modifier r1 = slideInOut(r1, r8, r2, r4, r11)
            androidx.compose.animation.TransitionData r2 = r30.getData$animation_release()
            androidx.compose.animation.ChangeSize r2 = r2.getChangeSize()
            androidx.compose.runtime.State r2 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(r2, r12, r3)
            androidx.compose.animation.TransitionData r4 = r31.getData$animation_release()
            androidx.compose.animation.ChangeSize r4 = r4.getChangeSize()
            androidx.compose.runtime.State r4 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(r4, r12, r3)
            androidx.compose.ui.Modifier r14 = shrinkExpand(r1, r8, r2, r4, r11)
            r15 = r0 & 14
            r7 = 1157296644(0x44faf204, float:2007.563)
            r12.startReplaceableGroup(r7)
            java.lang.String r6 = "C(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r12, r6)
            boolean r0 = r12.changed((java.lang.Object) r8)
            java.lang.Object r1 = r33.rememberedValue()
            r5 = 2
            r4 = 0
            if (r0 != 0) goto L_0x0099
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r0 = r0.getEmpty()
            if (r1 != r0) goto L_0x00a4
        L_0x0099:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            androidx.compose.runtime.MutableState r1 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r0, r4, r5, r4)
            r12.updateRememberedValue(r1)
        L_0x00a4:
            r33.endReplaceableGroup()
            r2 = r1
            androidx.compose.runtime.MutableState r2 = (androidx.compose.runtime.MutableState) r2
            r12.startReplaceableGroup(r7)
            androidx.compose.runtime.ComposerKt.sourceInformation(r12, r6)
            boolean r0 = r12.changed((java.lang.Object) r8)
            java.lang.Object r1 = r33.rememberedValue()
            if (r0 != 0) goto L_0x00c2
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r0 = r0.getEmpty()
            if (r1 != r0) goto L_0x00cd
        L_0x00c2:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            androidx.compose.runtime.MutableState r1 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r0, r4, r5, r4)
            r12.updateRememberedValue(r1)
        L_0x00cd:
            r33.endReplaceableGroup()
            androidx.compose.runtime.MutableState r1 = (androidx.compose.runtime.MutableState) r1
            java.lang.Object r0 = r29.getCurrentState()
            java.lang.Object r4 = r29.getTargetState()
            r5 = 1
            if (r0 != r4) goto L_0x00ea
            boolean r0 = r29.isSeeking()
            if (r0 != 0) goto L_0x00ea
            createModifier$lambda$2(r2, r3)
            createModifier$lambda$5(r1, r3)
            goto L_0x0118
        L_0x00ea:
            androidx.compose.animation.TransitionData r0 = r30.getData$animation_release()
            androidx.compose.animation.Fade r0 = r0.getFade()
            if (r0 != 0) goto L_0x00fe
            androidx.compose.animation.TransitionData r0 = r31.getData$animation_release()
            androidx.compose.animation.Fade r0 = r0.getFade()
            if (r0 == 0) goto L_0x0101
        L_0x00fe:
            createModifier$lambda$2(r2, r5)
        L_0x0101:
            androidx.compose.animation.TransitionData r0 = r30.getData$animation_release()
            androidx.compose.animation.Scale r0 = r0.getScale()
            if (r0 != 0) goto L_0x0115
            androidx.compose.animation.TransitionData r0 = r31.getData$animation_release()
            androidx.compose.animation.Scale r0 = r0.getScale()
            if (r0 == 0) goto L_0x0118
        L_0x0115:
            createModifier$lambda$5(r1, r5)
        L_0x0118:
            r0 = 1657241561(0x62c77fd9, float:1.8400572E21)
            r12.startReplaceableGroup(r0)
            java.lang.String r0 = "870@37922L27,860@37401L796"
            androidx.compose.runtime.ComposerKt.sourceInformation(r12, r0)
            boolean r0 = createModifier$lambda$1(r2)
            r17 = 458752(0x70000, float:6.42848E-40)
            java.lang.String r4 = "CC(animateValue)P(3,2)856@34079L32,857@34134L31,858@34190L23,860@34226L89:Transition.kt#pdpnli"
            r18 = 57344(0xe000, float:8.0356E-41)
            java.lang.String r5 = "C:EnterExitTransition.kt#xbi5r1"
            r20 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x02ba
            androidx.compose.animation.EnterExitTransitionKt$createModifier$alpha$2 r0 = new androidx.compose.animation.EnterExitTransitionKt$createModifier$alpha$2
            r0.<init>(r9, r10)
            kotlin.jvm.functions.Function3 r0 = (kotlin.jvm.functions.Function3) r0
            r7 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r12.startReplaceableGroup(r7)
            java.lang.String r7 = "C(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r12, r7)
            java.lang.Object r7 = r33.rememberedValue()
            androidx.compose.runtime.Composer$Companion r21 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r3 = r21.getEmpty()
            if (r7 != r3) goto L_0x0168
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r11)
            java.lang.String r7 = " alpha"
            java.lang.StringBuilder r3 = r3.append(r7)
            java.lang.String r7 = r3.toString()
            r12.updateRememberedValue(r7)
        L_0x0168:
            r33.endReplaceableGroup()
            java.lang.String r7 = (java.lang.String) r7
            r3 = r15 | 384(0x180, float:5.38E-43)
            r13 = -1338768149(0xffffffffb03404eb, float:-6.549061E-10)
            r12.startReplaceableGroup(r13)
            java.lang.String r13 = "CC(animateFloat)P(2)938@37489L78:Transition.kt#pdpnli"
            androidx.compose.runtime.ComposerKt.sourceInformation(r12, r13)
            kotlin.jvm.internal.FloatCompanionObject r13 = kotlin.jvm.internal.FloatCompanionObject.INSTANCE
            androidx.compose.animation.core.TwoWayConverter r13 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter((kotlin.jvm.internal.FloatCompanionObject) r13)
            r23 = r3 & 14
            r21 = 3
            int r3 = r3 << 3
            r24 = r1
            r1 = r3 & 896(0x380, float:1.256E-42)
            r1 = r23 | r1
            r23 = r2
            r2 = r3 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r2
            r2 = r3 & r18
            r1 = r1 | r2
            r3 = -142660079(0xfffffffff77f2e11, float:-5.1756642E33)
            r12.startReplaceableGroup(r3)
            androidx.compose.runtime.ComposerKt.sourceInformation(r12, r4)
            java.lang.Object r2 = r29.getCurrentState()
            int r22 = r1 >> 9
            r3 = r22 & 112(0x70, float:1.57E-43)
            androidx.compose.animation.EnterExitState r2 = (androidx.compose.animation.EnterExitState) r2
            r22 = r4
            r4 = 755689166(0x2d0ae6ce, float:7.895641E-12)
            r12.startReplaceableGroup(r4)
            androidx.compose.runtime.ComposerKt.sourceInformation(r12, r5)
            boolean r25 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r25 == 0) goto L_0x01c2
            r25 = r6
            java.lang.String r6 = "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:871)"
            r8 = -1
            androidx.compose.runtime.ComposerKt.traceEventStart(r4, r3, r8, r6)
            goto L_0x01c4
        L_0x01c2:
            r25 = r6
        L_0x01c4:
            int[] r6 = androidx.compose.animation.EnterExitTransitionKt.WhenMappings.$EnumSwitchMapping$0
            int r2 = r2.ordinal()
            r2 = r6[r2]
            r6 = 1
            if (r2 == r6) goto L_0x01f9
            r6 = 2
            if (r2 == r6) goto L_0x01ea
            r6 = 3
            if (r2 != r6) goto L_0x01e4
            androidx.compose.animation.TransitionData r2 = r31.getData$animation_release()
            androidx.compose.animation.Fade r2 = r2.getFade()
            if (r2 == 0) goto L_0x01f9
            float r2 = r2.getAlpha()
            goto L_0x01fb
        L_0x01e4:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01ea:
            androidx.compose.animation.TransitionData r2 = r30.getData$animation_release()
            androidx.compose.animation.Fade r2 = r2.getFade()
            if (r2 == 0) goto L_0x01f9
            float r2 = r2.getAlpha()
            goto L_0x01fb
        L_0x01f9:
            r2 = r20
        L_0x01fb:
            boolean r6 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r6 == 0) goto L_0x0204
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0204:
            r33.endReplaceableGroup()
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.Object r6 = r29.getTargetState()
            androidx.compose.animation.EnterExitState r6 = (androidx.compose.animation.EnterExitState) r6
            r12.startReplaceableGroup(r4)
            androidx.compose.runtime.ComposerKt.sourceInformation(r12, r5)
            boolean r8 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r8 == 0) goto L_0x0227
            java.lang.String r8 = "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:871)"
            r26 = r5
            r5 = -1
            androidx.compose.runtime.ComposerKt.traceEventStart(r4, r3, r5, r8)
            goto L_0x0229
        L_0x0227:
            r26 = r5
        L_0x0229:
            int[] r3 = androidx.compose.animation.EnterExitTransitionKt.WhenMappings.$EnumSwitchMapping$0
            int r4 = r6.ordinal()
            r3 = r3[r4]
            r5 = 1
            if (r3 == r5) goto L_0x025e
            r6 = 2
            if (r3 == r6) goto L_0x024f
            r4 = 3
            if (r3 != r4) goto L_0x0249
            androidx.compose.animation.TransitionData r3 = r31.getData$animation_release()
            androidx.compose.animation.Fade r3 = r3.getFade()
            if (r3 == 0) goto L_0x025f
            float r3 = r3.getAlpha()
            goto L_0x0261
        L_0x0249:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x024f:
            androidx.compose.animation.TransitionData r3 = r30.getData$animation_release()
            androidx.compose.animation.Fade r3 = r3.getFade()
            if (r3 == 0) goto L_0x025f
            float r3 = r3.getAlpha()
            goto L_0x0261
        L_0x025e:
            r6 = 2
        L_0x025f:
            r3 = r20
        L_0x0261:
            boolean r4 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r4 == 0) goto L_0x026a
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x026a:
            r33.endReplaceableGroup()
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            androidx.compose.animation.core.Transition$Segment r4 = r29.getSegment()
            int r8 = r1 >> 3
            r8 = r8 & 112(0x70, float:1.57E-43)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Object r0 = r0.invoke(r4, r12, r8)
            r4 = r0
            androidx.compose.animation.core.FiniteAnimationSpec r4 = (androidx.compose.animation.core.FiniteAnimationSpec) r4
            r0 = r1 & 14
            int r8 = r1 << 9
            r8 = r8 & r18
            r0 = r0 | r8
            int r1 = r1 << 6
            r1 = r1 & r17
            r8 = r0 | r1
            r0 = r29
            r16 = r24
            r1 = r2
            r19 = r23
            r2 = r3
            r23 = r14
            r14 = -142660079(0xfffffffff77f2e11, float:-5.1756642E33)
            r3 = r4
            r27 = r22
            r22 = 0
            r4 = r13
            r6 = r5
            r13 = r26
            r5 = r7
            r7 = r25
            r6 = r33
            r28 = r7
            r7 = r8
            androidx.compose.runtime.State r0 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(r0, r1, r2, r3, r4, r5, r6, r7)
            r33.endReplaceableGroup()
            r33.endReplaceableGroup()
            goto L_0x02ce
        L_0x02ba:
            r16 = r1
            r19 = r2
            r27 = r4
            r13 = r5
            r28 = r6
            r23 = r14
            r14 = -142660079(0xfffffffff77f2e11, float:-5.1756642E33)
            r22 = 0
            androidx.compose.runtime.MutableState<java.lang.Float> r0 = DefaultAlpha
            androidx.compose.runtime.State r0 = (androidx.compose.runtime.State) r0
        L_0x02ce:
            r8 = r0
            r33.endReplaceableGroup()
            boolean r0 = createModifier$lambda$4(r16)
            if (r0 == 0) goto L_0x0625
            r0 = 1657242461(0x62c7835d, float:1.8401839E21)
            r12.startReplaceableGroup(r0)
            java.lang.String r0 = "893@38813L27,883@38290L800,909@39583L536,922@40163L157"
            androidx.compose.runtime.ComposerKt.sourceInformation(r12, r0)
            androidx.compose.animation.EnterExitTransitionKt$createModifier$scale$2 r0 = new androidx.compose.animation.EnterExitTransitionKt$createModifier$scale$2
            r0.<init>(r9, r10)
            kotlin.jvm.functions.Function3 r0 = (kotlin.jvm.functions.Function3) r0
            r1 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r12.startReplaceableGroup(r1)
            java.lang.String r1 = "C(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r12, r1)
            java.lang.Object r1 = r33.rememberedValue()
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r1 != r2) goto L_0x0317
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r2 = " scale"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r12.updateRememberedValue(r1)
        L_0x0317:
            r33.endReplaceableGroup()
            r5 = r1
            java.lang.String r5 = (java.lang.String) r5
            r1 = r15 | 384(0x180, float:5.38E-43)
            r2 = -1338768149(0xffffffffb03404eb, float:-6.549061E-10)
            r12.startReplaceableGroup(r2)
            java.lang.String r2 = "CC(animateFloat)P(2)938@37489L78:Transition.kt#pdpnli"
            androidx.compose.runtime.ComposerKt.sourceInformation(r12, r2)
            kotlin.jvm.internal.FloatCompanionObject r2 = kotlin.jvm.internal.FloatCompanionObject.INSTANCE
            androidx.compose.animation.core.TwoWayConverter r4 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter((kotlin.jvm.internal.FloatCompanionObject) r2)
            r2 = r1 & 14
            r3 = 3
            int r1 = r1 << r3
            r3 = r1 & 896(0x380, float:1.256E-42)
            r2 = r2 | r3
            r3 = r1 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r3
            r1 = r1 & r18
            r1 = r1 | r2
            r12.startReplaceableGroup(r14)
            r11 = r27
            androidx.compose.runtime.ComposerKt.sourceInformation(r12, r11)
            java.lang.Object r2 = r29.getCurrentState()
            int r3 = r1 >> 9
            r3 = r3 & 112(0x70, float:1.57E-43)
            androidx.compose.animation.EnterExitState r2 = (androidx.compose.animation.EnterExitState) r2
            r6 = -596129937(0xffffffffdc77c76f, float:-2.78974395E17)
            r12.startReplaceableGroup(r6)
            androidx.compose.runtime.ComposerKt.sourceInformation(r12, r13)
            boolean r7 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r7 == 0) goto L_0x0365
            java.lang.String r7 = "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:894)"
            r14 = -1
            androidx.compose.runtime.ComposerKt.traceEventStart(r6, r3, r14, r7)
        L_0x0365:
            int[] r7 = androidx.compose.animation.EnterExitTransitionKt.WhenMappings.$EnumSwitchMapping$0
            int r2 = r2.ordinal()
            r2 = r7[r2]
            r14 = 1
            if (r2 == r14) goto L_0x039a
            r7 = 2
            if (r2 == r7) goto L_0x038b
            r7 = 3
            if (r2 != r7) goto L_0x0385
            androidx.compose.animation.TransitionData r2 = r31.getData$animation_release()
            androidx.compose.animation.Scale r2 = r2.getScale()
            if (r2 == 0) goto L_0x039a
            float r2 = r2.getScale()
            goto L_0x039c
        L_0x0385:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x038b:
            androidx.compose.animation.TransitionData r2 = r30.getData$animation_release()
            androidx.compose.animation.Scale r2 = r2.getScale()
            if (r2 == 0) goto L_0x039a
            float r2 = r2.getScale()
            goto L_0x039c
        L_0x039a:
            r2 = r20
        L_0x039c:
            boolean r7 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r7 == 0) goto L_0x03a5
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x03a5:
            r33.endReplaceableGroup()
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.Object r7 = r29.getTargetState()
            androidx.compose.animation.EnterExitState r7 = (androidx.compose.animation.EnterExitState) r7
            r12.startReplaceableGroup(r6)
            androidx.compose.runtime.ComposerKt.sourceInformation(r12, r13)
            boolean r16 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r16 == 0) goto L_0x03c5
            java.lang.String r14 = "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:894)"
            r9 = -1
            androidx.compose.runtime.ComposerKt.traceEventStart(r6, r3, r9, r14)
        L_0x03c5:
            int[] r3 = androidx.compose.animation.EnterExitTransitionKt.WhenMappings.$EnumSwitchMapping$0
            int r6 = r7.ordinal()
            r3 = r3[r6]
            r6 = 1
            if (r3 == r6) goto L_0x03fa
            r7 = 2
            if (r3 == r7) goto L_0x03eb
            r6 = 3
            if (r3 != r6) goto L_0x03e5
            androidx.compose.animation.TransitionData r3 = r31.getData$animation_release()
            androidx.compose.animation.Scale r3 = r3.getScale()
            if (r3 == 0) goto L_0x03fb
            float r20 = r3.getScale()
            goto L_0x03fb
        L_0x03e5:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x03eb:
            androidx.compose.animation.TransitionData r3 = r30.getData$animation_release()
            androidx.compose.animation.Scale r3 = r3.getScale()
            if (r3 == 0) goto L_0x03fb
            float r20 = r3.getScale()
            goto L_0x03fb
        L_0x03fa:
            r7 = 2
        L_0x03fb:
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L_0x0404
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0404:
            r33.endReplaceableGroup()
            java.lang.Float r3 = java.lang.Float.valueOf(r20)
            androidx.compose.animation.core.Transition$Segment r6 = r29.getSegment()
            int r9 = r1 >> 3
            r9 = r9 & 112(0x70, float:1.57E-43)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object r0 = r0.invoke(r6, r12, r9)
            r6 = r0
            androidx.compose.animation.core.FiniteAnimationSpec r6 = (androidx.compose.animation.core.FiniteAnimationSpec) r6
            r0 = r1 & 14
            int r9 = r1 << 9
            r9 = r9 & r18
            r0 = r0 | r9
            int r1 = r1 << 6
            r1 = r1 & r17
            r9 = r0 | r1
            r0 = r29
            r1 = r2
            r2 = r3
            r3 = r6
            r6 = r33
            r14 = r7
            r7 = r9
            androidx.compose.runtime.State r9 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(r0, r1, r2, r3, r4, r5, r6, r7)
            r33.endReplaceableGroup()
            r33.endReplaceableGroup()
            java.lang.Object r0 = r29.getCurrentState()
            androidx.compose.animation.EnterExitState r1 = androidx.compose.animation.EnterExitState.PreEnter
            if (r0 != r1) goto L_0x0464
            androidx.compose.animation.TransitionData r0 = r30.getData$animation_release()
            androidx.compose.animation.Scale r0 = r0.getScale()
            if (r0 == 0) goto L_0x0459
        L_0x0450:
            long r0 = r0.m93getTransformOriginSzJe1aQ()
            androidx.compose.ui.graphics.TransformOrigin r4 = androidx.compose.ui.graphics.TransformOrigin.m3230boximpl(r0)
            goto L_0x0484
        L_0x0459:
            androidx.compose.animation.TransitionData r0 = r31.getData$animation_release()
            androidx.compose.animation.Scale r0 = r0.getScale()
            if (r0 == 0) goto L_0x0482
            goto L_0x0450
        L_0x0464:
            androidx.compose.animation.TransitionData r0 = r31.getData$animation_release()
            androidx.compose.animation.Scale r0 = r0.getScale()
            if (r0 == 0) goto L_0x0477
        L_0x046e:
            long r0 = r0.m93getTransformOriginSzJe1aQ()
            androidx.compose.ui.graphics.TransformOrigin r4 = androidx.compose.ui.graphics.TransformOrigin.m3230boximpl(r0)
            goto L_0x0484
        L_0x0477:
            androidx.compose.animation.TransitionData r0 = r30.getData$animation_release()
            androidx.compose.animation.Scale r0 = r0.getScale()
            if (r0 == 0) goto L_0x0482
            goto L_0x046e
        L_0x0482:
            r4 = r22
        L_0x0484:
            androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.graphics.TransformOrigin, androidx.compose.animation.core.AnimationVector2D> r5 = TransformOriginVectorConverter
            java.lang.String r6 = "TransformOriginInterruptionHandling"
            r0 = r15 | 3136(0xc40, float:4.394E-42)
            r1 = -142660079(0xfffffffff77f2e11, float:-5.1756642E33)
            r12.startReplaceableGroup(r1)
            androidx.compose.runtime.ComposerKt.sourceInformation(r12, r11)
            androidx.compose.animation.EnterExitTransitionKt$createModifier$$inlined$animateValue$1 r1 = androidx.compose.animation.EnterExitTransitionKt$createModifier$$inlined$animateValue$1.INSTANCE
            kotlin.jvm.functions.Function3 r1 = (kotlin.jvm.functions.Function3) r1
            java.lang.Object r2 = r29.getCurrentState()
            int r3 = r0 >> 9
            r3 = r3 & 112(0x70, float:1.57E-43)
            androidx.compose.animation.EnterExitState r2 = (androidx.compose.animation.EnterExitState) r2
            r7 = -288165413(0xffffffffeed2f1db, float:-3.2642119E28)
            r12.startReplaceableGroup(r7)
            androidx.compose.runtime.ComposerKt.sourceInformation(r12, r13)
            boolean r11 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r11 == 0) goto L_0x04b7
            java.lang.String r11 = "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:912)"
            r15 = -1
            androidx.compose.runtime.ComposerKt.traceEventStart(r7, r3, r15, r11)
        L_0x04b7:
            int[] r11 = androidx.compose.animation.EnterExitTransitionKt.WhenMappings.$EnumSwitchMapping$0
            int r2 = r2.ordinal()
            r2 = r11[r2]
            r11 = 1
            if (r2 == r11) goto L_0x050c
            if (r2 == r14) goto L_0x04eb
            r11 = 3
            if (r2 != r11) goto L_0x04e5
            androidx.compose.animation.TransitionData r2 = r31.getData$animation_release()
            androidx.compose.animation.Scale r2 = r2.getScale()
            if (r2 == 0) goto L_0x04da
        L_0x04d1:
            long r15 = r2.m93getTransformOriginSzJe1aQ()
            androidx.compose.ui.graphics.TransformOrigin r2 = androidx.compose.ui.graphics.TransformOrigin.m3230boximpl(r15)
            goto L_0x050d
        L_0x04da:
            androidx.compose.animation.TransitionData r2 = r30.getData$animation_release()
            androidx.compose.animation.Scale r2 = r2.getScale()
            if (r2 == 0) goto L_0x0509
            goto L_0x04d1
        L_0x04e5:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x04eb:
            androidx.compose.animation.TransitionData r2 = r30.getData$animation_release()
            androidx.compose.animation.Scale r2 = r2.getScale()
            if (r2 == 0) goto L_0x04fe
        L_0x04f5:
            long r15 = r2.m93getTransformOriginSzJe1aQ()
            androidx.compose.ui.graphics.TransformOrigin r2 = androidx.compose.ui.graphics.TransformOrigin.m3230boximpl(r15)
            goto L_0x050d
        L_0x04fe:
            androidx.compose.animation.TransitionData r2 = r31.getData$animation_release()
            androidx.compose.animation.Scale r2 = r2.getScale()
            if (r2 == 0) goto L_0x0509
            goto L_0x04f5
        L_0x0509:
            r2 = r22
            goto L_0x050d
        L_0x050c:
            r2 = r4
        L_0x050d:
            if (r2 == 0) goto L_0x0514
            long r15 = r2.m3242unboximpl()
            goto L_0x051a
        L_0x0514:
            androidx.compose.ui.graphics.TransformOrigin$Companion r2 = androidx.compose.ui.graphics.TransformOrigin.Companion
            long r15 = r2.m3243getCenterSzJe1aQ()
        L_0x051a:
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x0523
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0523:
            r33.endReplaceableGroup()
            androidx.compose.ui.graphics.TransformOrigin r2 = androidx.compose.ui.graphics.TransformOrigin.m3230boximpl(r15)
            java.lang.Object r11 = r29.getTargetState()
            androidx.compose.animation.EnterExitState r11 = (androidx.compose.animation.EnterExitState) r11
            r12.startReplaceableGroup(r7)
            androidx.compose.runtime.ComposerKt.sourceInformation(r12, r13)
            boolean r13 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r13 == 0) goto L_0x0543
            java.lang.String r13 = "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:912)"
            r15 = -1
            androidx.compose.runtime.ComposerKt.traceEventStart(r7, r3, r15, r13)
        L_0x0543:
            int[] r3 = androidx.compose.animation.EnterExitTransitionKt.WhenMappings.$EnumSwitchMapping$0
            int r7 = r11.ordinal()
            r3 = r3[r7]
            r7 = 1
            if (r3 == r7) goto L_0x0597
            if (r3 == r14) goto L_0x0577
            r4 = 3
            if (r3 != r4) goto L_0x0571
            androidx.compose.animation.TransitionData r3 = r31.getData$animation_release()
            androidx.compose.animation.Scale r3 = r3.getScale()
            if (r3 == 0) goto L_0x0566
        L_0x055d:
            long r3 = r3.m93getTransformOriginSzJe1aQ()
            androidx.compose.ui.graphics.TransformOrigin r4 = androidx.compose.ui.graphics.TransformOrigin.m3230boximpl(r3)
            goto L_0x0597
        L_0x0566:
            androidx.compose.animation.TransitionData r3 = r30.getData$animation_release()
            androidx.compose.animation.Scale r3 = r3.getScale()
            if (r3 == 0) goto L_0x0595
            goto L_0x055d
        L_0x0571:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0577:
            androidx.compose.animation.TransitionData r3 = r30.getData$animation_release()
            androidx.compose.animation.Scale r3 = r3.getScale()
            if (r3 == 0) goto L_0x058a
        L_0x0581:
            long r3 = r3.m93getTransformOriginSzJe1aQ()
            androidx.compose.ui.graphics.TransformOrigin r4 = androidx.compose.ui.graphics.TransformOrigin.m3230boximpl(r3)
            goto L_0x0597
        L_0x058a:
            androidx.compose.animation.TransitionData r3 = r31.getData$animation_release()
            androidx.compose.animation.Scale r3 = r3.getScale()
            if (r3 == 0) goto L_0x0595
            goto L_0x0581
        L_0x0595:
            r4 = r22
        L_0x0597:
            if (r4 == 0) goto L_0x059e
            long r3 = r4.m3242unboximpl()
            goto L_0x05a4
        L_0x059e:
            androidx.compose.ui.graphics.TransformOrigin$Companion r3 = androidx.compose.ui.graphics.TransformOrigin.Companion
            long r3 = r3.m3243getCenterSzJe1aQ()
        L_0x05a4:
            boolean r7 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r7 == 0) goto L_0x05ad
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x05ad:
            r33.endReplaceableGroup()
            androidx.compose.ui.graphics.TransformOrigin r3 = androidx.compose.ui.graphics.TransformOrigin.m3230boximpl(r3)
            androidx.compose.animation.core.Transition$Segment r4 = r29.getSegment()
            int r7 = r0 >> 3
            r7 = r7 & 112(0x70, float:1.57E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object r1 = r1.invoke(r4, r12, r7)
            r4 = r1
            androidx.compose.animation.core.FiniteAnimationSpec r4 = (androidx.compose.animation.core.FiniteAnimationSpec) r4
            r1 = r0 & 14
            int r7 = r0 << 9
            r7 = r7 & r18
            r1 = r1 | r7
            int r0 = r0 << 6
            r0 = r0 & r17
            r7 = r1 | r0
            r0 = r29
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r33
            androidx.compose.runtime.State r0 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(r0, r1, r2, r3, r4, r5, r6, r7)
            r33.endReplaceableGroup()
            r1 = 1618982084(0x607fb4c4, float:7.370227E19)
            r12.startReplaceableGroup(r1)
            java.lang.String r1 = "C(remember)P(1,2,3):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r12, r1)
            boolean r1 = r12.changed((java.lang.Object) r8)
            boolean r2 = r12.changed((java.lang.Object) r9)
            r1 = r1 | r2
            boolean r2 = r12.changed((java.lang.Object) r0)
            r1 = r1 | r2
            java.lang.Object r2 = r33.rememberedValue()
            if (r1 != 0) goto L_0x060b
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r2 != r1) goto L_0x0616
        L_0x060b:
            androidx.compose.animation.EnterExitTransitionKt$createModifier$1$1 r1 = new androidx.compose.animation.EnterExitTransitionKt$createModifier$1$1
            r1.<init>(r8, r9, r0)
            r2 = r1
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r12.updateRememberedValue(r2)
        L_0x0616:
            r33.endReplaceableGroup()
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r0 = r23
            androidx.compose.ui.Modifier r14 = androidx.compose.ui.graphics.GraphicsLayerModifierKt.graphicsLayer(r0, r2)
            r33.endReplaceableGroup()
            goto L_0x0677
        L_0x0625:
            r0 = r23
            boolean r1 = createModifier$lambda$1(r19)
            if (r1 == 0) goto L_0x066d
            r1 = 1657244550(0x62c78b86, float:1.8404779E21)
            r12.startReplaceableGroup(r1)
            java.lang.String r1 = "929@40400L42"
            androidx.compose.runtime.ComposerKt.sourceInformation(r12, r1)
            r1 = 1157296644(0x44faf204, float:2007.563)
            r12.startReplaceableGroup(r1)
            r1 = r28
            androidx.compose.runtime.ComposerKt.sourceInformation(r12, r1)
            boolean r1 = r12.changed((java.lang.Object) r8)
            java.lang.Object r2 = r33.rememberedValue()
            if (r1 != 0) goto L_0x0655
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r2 != r1) goto L_0x0660
        L_0x0655:
            androidx.compose.animation.EnterExitTransitionKt$createModifier$2$1 r1 = new androidx.compose.animation.EnterExitTransitionKt$createModifier$2$1
            r1.<init>(r8)
            r2 = r1
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r12.updateRememberedValue(r2)
        L_0x0660:
            r33.endReplaceableGroup()
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            androidx.compose.ui.Modifier r14 = androidx.compose.ui.graphics.GraphicsLayerModifierKt.graphicsLayer(r0, r2)
            r33.endReplaceableGroup()
            goto L_0x0677
        L_0x066d:
            r1 = 1657244642(0x62c78be2, float:1.8404908E21)
            r12.startReplaceableGroup(r1)
            r33.endReplaceableGroup()
            r14 = r0
        L_0x0677:
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0680
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0680:
            r33.endReplaceableGroup()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.EnterExitTransitionKt.createModifier(androidx.compose.animation.core.Transition, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, androidx.compose.runtime.Composer, int):androidx.compose.ui.Modifier");
    }

    private static final boolean createModifier$lambda$1(MutableState<Boolean> mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    private static final void createModifier$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean createModifier$lambda$4(MutableState<Boolean> mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    private static final void createModifier$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final Modifier slideInOut(Modifier modifier, Transition<EnterExitState> transition, State<Slide> state, State<Slide> state2, String str) {
        return ComposedModifierKt.composed$default(modifier, (Function1) null, new EnterExitTransitionKt$slideInOut$1(transition, state, state2, str), 1, (Object) null);
    }

    private static final Modifier shrinkExpand(Modifier modifier, Transition<EnterExitState> transition, State<ChangeSize> state, State<ChangeSize> state2, String str) {
        return ComposedModifierKt.composed$default(modifier, (Function1) null, new EnterExitTransitionKt$shrinkExpand$1(transition, state, state2, str), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final float createModifier$lambda$8(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* access modifiers changed from: private */
    public static final float createModifier$lambda$11(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* access modifiers changed from: private */
    public static final long createModifier$lambda$13(State<TransformOrigin> state) {
        return state.getValue().m3242unboximpl();
    }
}
