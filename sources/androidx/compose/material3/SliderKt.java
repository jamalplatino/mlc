package androidx.compose.material3;

import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.SliderTokens;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.IntIterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000ª\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001aä\u0001\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\u0018\u0010\u0019\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0018\u0012\u0004\u0012\u00020\u00160\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00012\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020$2\u0019\b\u0002\u0010&\u001a\u0013\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00160\u001a¢\u0006\u0002\b(2\u0019\b\u0002\u0010)\u001a\u0013\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00160\u001a¢\u0006\u0002\b(2\u0019\b\u0002\u0010*\u001a\u0013\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00160\u001a¢\u0006\u0002\b(2\b\b\u0002\u0010+\u001a\u00020,H\u0007¢\u0006\u0002\u0010-\u001a\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\u0018\u0010\u0019\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0018\u0012\u0004\u0012\u00020\u00160\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00012\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\b\b\u0002\u0010+\u001a\u00020,2\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010 2\b\b\u0002\u0010!\u001a\u00020\"H\u0007¢\u0006\u0002\u0010.\u001aÈ\u0001\u0010/\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\u0018\u0010\u0019\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0018\u0012\u0004\u0012\u00020\u00160\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\b\b\u0002\u0010+\u001a\u00020,2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010 2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\u0017\u0010&\u001a\u0013\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00160\u001a¢\u0006\u0002\b(2\u0017\u0010)\u001a\u0013\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00160\u001a¢\u0006\u0002\b(2\u0017\u0010*\u001a\u0013\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00160\u001a¢\u0006\u0002\b(H\u0003¢\u0006\u0002\u00100\u001a³\u0001\u00101\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\b2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00160\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00012\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u00102\u001a\u00020$2\u0019\b\u0002\u00103\u001a\u0013\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00160\u001a¢\u0006\u0002\b(2\u0019\b\u0002\u0010*\u001a\u0013\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00160\u001a¢\u0006\u0002\b(2\b\b\u0002\u0010+\u001a\u00020,H\u0007¢\u0006\u0002\u00104\u001a}\u00101\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\b2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00160\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00012\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\b\b\u0002\u0010+\u001a\u00020,2\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u00102\u001a\u00020$H\u0007¢\u0006\u0002\u00105\u001a\u0001\u00106\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u00102\u001a\u00020$2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00160\u001a2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010 2\u0006\u0010+\u001a\u00020,2\u0006\u0010\u0017\u001a\u00020\b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\u0017\u00103\u001a\u0013\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00160\u001a¢\u0006\u0002\b(2\u0017\u0010*\u001a\u0013\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00160\u001a¢\u0006\u0002\b(H\u0003¢\u0006\u0002\u00107\u001a1\u00108\u001a\u00020\u00162\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\b2\u0006\u0010<\u001a\u00020\b2\u0006\u0010=\u001a\u00020\bH@ø\u0001\u0000¢\u0006\u0002\u0010>\u001a \u0010?\u001a\u00020\b2\u0006\u0010@\u001a\u00020\b2\u0006\u0010A\u001a\u00020\b2\u0006\u0010B\u001a\u00020\bH\u0002\u001a0\u0010C\u001a\u00020\b2\u0006\u0010D\u001a\u00020\b2\u0006\u0010E\u001a\u00020\b2\u0006\u0010F\u001a\u00020\b2\u0006\u0010G\u001a\u00020\b2\u0006\u0010H\u001a\u00020\bH\u0002\u001a<\u0010C\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\u0006\u0010D\u001a\u00020\b2\u0006\u0010E\u001a\u00020\b2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\u0006\u0010G\u001a\u00020\b2\u0006\u0010H\u001a\u00020\bH\u0002\u001a(\u0010J\u001a\u00020\b2\u0006\u0010;\u001a\u00020\b2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020\b2\u0006\u0010N\u001a\u00020\bH\u0002\u001a\u0010\u0010O\u001a\u00020L2\u0006\u0010+\u001a\u00020,H\u0002\u001a;\u0010P\u001a\u0010\u0012\u0004\u0012\u00020R\u0012\u0004\u0012\u00020\b\u0018\u00010Q*\u00020S2\u0006\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020WH@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\bX\u0010Y\u001a\u0001\u0010Z\u001a\u00020\u0001*\u00020\u00012\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020\b0\\2\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\b0\\2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010^\u001a\u00020\u001d2\u0006\u0010N\u001a\u00020,2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\u0018\u0010_\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00160\u001a0\\2\u001e\u0010`\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00160a0\\H\u0002\u001a\\\u0010b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00160\u001a2\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010 2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\b\b\u0002\u0010+\u001a\u00020,H\u0002\u001ad\u0010c\u001a\u00020\u0001*\u00020\u00012\u0006\u00109\u001a\u00020:2\u0006\u00102\u001a\u00020$2\u0006\u0010N\u001a\u00020,2\u0006\u0010^\u001a\u00020\u001d2\f\u0010d\u001a\b\u0012\u0004\u0012\u00020\b0\\2\u0012\u0010_\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160 0\\2\f\u0010e\u001a\b\u0012\u0004\u0012\u00020\b0f2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\u0002\u001a\u00020\u0003X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\u0005\u001a\u00020\u0003X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\t\u001a\u00020\u0003X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\n\u001a\u00020\u0003X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\u000b\u001a\u00020\u0003X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\f\u001a\u00020\rX\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u000e\"\u0019\u0010\u000f\u001a\u00020\u0003X\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0010\u0010\u0011\"\u0013\u0010\u0012\u001a\u00020\u0003X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0019\u0010\u0013\u001a\u00020\u0003X\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0014\u0010\u0011\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006g"}, d2 = {"DefaultSliderConstraints", "Landroidx/compose/ui/Modifier;", "SliderHeight", "Landroidx/compose/ui/unit/Dp;", "F", "SliderMinWidth", "SliderToTickAnimation", "Landroidx/compose/animation/core/TweenSpec;", "", "ThumbDefaultElevation", "ThumbHeight", "ThumbPressedElevation", "ThumbSize", "Landroidx/compose/ui/unit/DpSize;", "J", "ThumbWidth", "getThumbWidth", "()F", "TickSize", "TrackHeight", "getTrackHeight", "RangeSlider", "", "value", "Lkotlin/ranges/ClosedFloatingPointRange;", "onValueChange", "Lkotlin/Function1;", "modifier", "enabled", "", "valueRange", "onValueChangeFinished", "Lkotlin/Function0;", "colors", "Landroidx/compose/material3/SliderColors;", "startInteractionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "endInteractionSource", "startThumb", "Landroidx/compose/material3/SliderPositions;", "Landroidx/compose/runtime/Composable;", "endThumb", "track", "steps", "", "(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;ILandroidx/compose/runtime/Composer;III)V", "(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/material3/SliderColors;Landroidx/compose/runtime/Composer;II)V", "RangeSliderImpl", "(Landroidx/compose/ui/Modifier;Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function1;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "Slider", "interactionSource", "thumb", "(FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;ILandroidx/compose/runtime/Composer;III)V", "(FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "SliderImpl", "(Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;IFLkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "animateToTarget", "draggableState", "Landroidx/compose/foundation/gestures/DraggableState;", "current", "target", "velocity", "(Landroidx/compose/foundation/gestures/DraggableState;FFFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "calcFraction", "a", "b", "pos", "scale", "a1", "b1", "x1", "a2", "b2", "x", "snapValueToTick", "tickFractions", "", "minPx", "maxPx", "stepsToTickFractions", "awaitSlop", "Lkotlin/Pair;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "id", "Landroidx/compose/ui/input/pointer/PointerId;", "type", "Landroidx/compose/ui/input/pointer/PointerType;", "awaitSlop-8vUncbI", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rangeSliderPressDragModifier", "rawOffsetStart", "Landroidx/compose/runtime/State;", "rawOffsetEnd", "isRtl", "gestureEndAction", "onDrag", "Lkotlin/Function2;", "sliderSemantics", "sliderTapModifier", "rawOffset", "pressOffset", "Landroidx/compose/runtime/MutableState;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Slider.kt */
public final class SliderKt {
    private static final Modifier DefaultSliderConstraints;
    private static final float SliderHeight;
    private static final float SliderMinWidth;
    /* access modifiers changed from: private */
    public static final TweenSpec<Float> SliderToTickAnimation = new TweenSpec(100, 0, (Easing) null, 6, (DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final float ThumbDefaultElevation = Dp.m5626constructorimpl((float) 1);
    private static final float ThumbHeight;
    /* access modifiers changed from: private */
    public static final float ThumbPressedElevation = Dp.m5626constructorimpl((float) 6);
    /* access modifiers changed from: private */
    public static final long ThumbSize;
    private static final float ThumbWidth;
    /* access modifiers changed from: private */
    public static final float TickSize = SliderTokens.INSTANCE.m2302getTickMarksContainerSizeD9Ej5fM();
    private static final float TrackHeight = SliderTokens.INSTANCE.m2297getInactiveTrackHeightD9Ej5fM();

    public static final float getThumbWidth() {
        return ThumbWidth;
    }

    public static final float getTrackHeight() {
        return TrackHeight;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0299  */
    /* JADX WARNING: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x010b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void Slider(float r42, kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r43, androidx.compose.ui.Modifier r44, boolean r45, kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> r46, int r47, kotlin.jvm.functions.Function0<kotlin.Unit> r48, androidx.compose.material3.SliderColors r49, androidx.compose.foundation.interaction.MutableInteractionSource r50, androidx.compose.runtime.Composer r51, int r52, int r53) {
        /*
            r12 = r43
            r13 = r52
            r14 = r53
            java.lang.String r0 = "onValueChange"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = -202044027(0xfffffffff3f50d85, float:-3.8830168E31)
            r1 = r51
            androidx.compose.runtime.Composer r11 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(Slider)P(7,4,3,1,8,6,5)155@7443L8,156@7503L39,160@7603L705:Slider.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r1)
            r1 = r14 & 1
            if (r1 == 0) goto L_0x0023
            r1 = r13 | 6
            r10 = r42
            goto L_0x0035
        L_0x0023:
            r1 = r13 & 14
            r10 = r42
            if (r1 != 0) goto L_0x0034
            boolean r1 = r11.changed((float) r10)
            if (r1 == 0) goto L_0x0031
            r1 = 4
            goto L_0x0032
        L_0x0031:
            r1 = 2
        L_0x0032:
            r1 = r1 | r13
            goto L_0x0035
        L_0x0034:
            r1 = r13
        L_0x0035:
            r2 = r14 & 2
            if (r2 == 0) goto L_0x003c
            r1 = r1 | 48
            goto L_0x004c
        L_0x003c:
            r2 = r13 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x004c
            boolean r2 = r11.changedInstance(r12)
            if (r2 == 0) goto L_0x0049
            r2 = 32
            goto L_0x004b
        L_0x0049:
            r2 = 16
        L_0x004b:
            r1 = r1 | r2
        L_0x004c:
            r2 = r14 & 4
            if (r2 == 0) goto L_0x0053
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0066
        L_0x0053:
            r3 = r13 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x0066
            r3 = r44
            boolean r4 = r11.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x0062
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r1 = r1 | r4
            goto L_0x0068
        L_0x0066:
            r3 = r44
        L_0x0068:
            r4 = r14 & 8
            if (r4 == 0) goto L_0x006f
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0082
        L_0x006f:
            r5 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x0082
            r5 = r45
            boolean r6 = r11.changed((boolean) r5)
            if (r6 == 0) goto L_0x007e
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007e:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r1 = r1 | r6
            goto L_0x0084
        L_0x0082:
            r5 = r45
        L_0x0084:
            r6 = 57344(0xe000, float:8.0356E-41)
            r7 = r13 & r6
            if (r7 != 0) goto L_0x00a0
            r7 = r14 & 16
            if (r7 != 0) goto L_0x009a
            r7 = r46
            boolean r8 = r11.changed((java.lang.Object) r7)
            if (r8 == 0) goto L_0x009c
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009a:
            r7 = r46
        L_0x009c:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r1 = r1 | r8
            goto L_0x00a2
        L_0x00a0:
            r7 = r46
        L_0x00a2:
            r8 = r14 & 32
            r9 = 458752(0x70000, float:6.42848E-40)
            if (r8 == 0) goto L_0x00ac
            r15 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r15
            goto L_0x00c0
        L_0x00ac:
            r15 = r13 & r9
            if (r15 != 0) goto L_0x00c0
            r15 = r47
            boolean r16 = r11.changed((int) r15)
            if (r16 == 0) goto L_0x00bb
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bd
        L_0x00bb:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00bd:
            r1 = r1 | r16
            goto L_0x00c2
        L_0x00c0:
            r15 = r47
        L_0x00c2:
            r16 = r14 & 64
            r40 = 3670016(0x380000, float:5.142788E-39)
            if (r16 == 0) goto L_0x00cf
            r17 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r17
            r9 = r48
            goto L_0x00e2
        L_0x00cf:
            r17 = r13 & r40
            r9 = r48
            if (r17 != 0) goto L_0x00e2
            boolean r17 = r11.changedInstance(r9)
            if (r17 == 0) goto L_0x00de
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e0
        L_0x00de:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00e0:
            r1 = r1 | r17
        L_0x00e2:
            r41 = 29360128(0x1c00000, float:7.052966E-38)
            r17 = r13 & r41
            if (r17 != 0) goto L_0x00fe
            r6 = r14 & 128(0x80, float:1.794E-43)
            if (r6 != 0) goto L_0x00f7
            r6 = r49
            boolean r17 = r11.changed((java.lang.Object) r6)
            if (r17 == 0) goto L_0x00f9
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fb
        L_0x00f7:
            r6 = r49
        L_0x00f9:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fb:
            r1 = r1 | r17
            goto L_0x0100
        L_0x00fe:
            r6 = r49
        L_0x0100:
            r0 = r14 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x010b
            r17 = 100663296(0x6000000, float:2.4074124E-35)
            r1 = r1 | r17
            r3 = r50
            goto L_0x0120
        L_0x010b:
            r17 = 234881024(0xe000000, float:1.5777218E-30)
            r17 = r13 & r17
            r3 = r50
            if (r17 != 0) goto L_0x0120
            boolean r17 = r11.changed((java.lang.Object) r3)
            if (r17 == 0) goto L_0x011c
            r17 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011e
        L_0x011c:
            r17 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011e:
            r1 = r1 | r17
        L_0x0120:
            r17 = 191739611(0xb6db6db, float:4.5782105E-32)
            r3 = r1 & r17
            r5 = 38347922(0x2492492, float:1.4777643E-37)
            if (r3 != r5) goto L_0x0142
            boolean r3 = r11.getSkipping()
            if (r3 != 0) goto L_0x0131
            goto L_0x0142
        L_0x0131:
            r11.skipToGroupEnd()
            r3 = r44
            r4 = r45
            r8 = r6
            r5 = r7
            r7 = r9
            r20 = r11
            r6 = r15
            r9 = r50
            goto L_0x0292
        L_0x0142:
            r11.startDefaults()
            r3 = r13 & 1
            r17 = -57345(0xffffffffffff1fff, float:NaN)
            r5 = 1
            if (r3 == 0) goto L_0x0174
            boolean r3 = r11.getDefaultsInvalid()
            if (r3 == 0) goto L_0x0154
            goto L_0x0174
        L_0x0154:
            r11.skipToGroupEnd()
            r0 = r14 & 16
            if (r0 == 0) goto L_0x015d
            r1 = r1 & r17
        L_0x015d:
            r0 = r14 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0165
            r0 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r1 = r1 & r0
        L_0x0165:
            r8 = r6
            r16 = r7
            r18 = r9
            r17 = r15
            r15 = r44
            r9 = r45
            r7 = r50
            goto L_0x0200
        L_0x0174:
            if (r2 == 0) goto L_0x017b
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r2 = (androidx.compose.ui.Modifier) r2
            goto L_0x017d
        L_0x017b:
            r2 = r44
        L_0x017d:
            if (r4 == 0) goto L_0x0181
            r3 = r5
            goto L_0x0183
        L_0x0181:
            r3 = r45
        L_0x0183:
            r4 = r14 & 16
            if (r4 == 0) goto L_0x0191
            r4 = 0
            r7 = 1065353216(0x3f800000, float:1.0)
            kotlin.ranges.ClosedFloatingPointRange r4 = kotlin.ranges.RangesKt.rangeTo((float) r4, (float) r7)
            r1 = r1 & r17
            goto L_0x0192
        L_0x0191:
            r4 = r7
        L_0x0192:
            if (r8 == 0) goto L_0x0196
            r7 = 0
            goto L_0x0197
        L_0x0196:
            r7 = r15
        L_0x0197:
            if (r16 == 0) goto L_0x019b
            r8 = 0
            goto L_0x019c
        L_0x019b:
            r8 = r9
        L_0x019c:
            r9 = r14 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x01c6
            androidx.compose.material3.SliderDefaults r15 = androidx.compose.material3.SliderDefaults.INSTANCE
            r16 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r28 = 0
            r30 = 0
            r32 = 0
            r34 = 0
            r37 = 0
            r38 = 6
            r39 = 1023(0x3ff, float:1.434E-42)
            r36 = r11
            androidx.compose.material3.SliderColors r6 = r15.m1547colorsq0g_0yA(r16, r18, r20, r22, r24, r26, r28, r30, r32, r34, r36, r37, r38, r39)
            r9 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r1 = r1 & r9
        L_0x01c6:
            if (r0 == 0) goto L_0x01f5
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r11.startReplaceableGroup(r0)
            java.lang.String r0 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r0)
            java.lang.Object r0 = r11.rememberedValue()
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r9 = r9.getEmpty()
            if (r0 != r9) goto L_0x01e6
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r11.updateRememberedValue(r0)
        L_0x01e6:
            r11.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = (androidx.compose.foundation.interaction.MutableInteractionSource) r0
            r15 = r2
            r9 = r3
            r16 = r4
            r17 = r7
            r18 = r8
            r7 = r0
            goto L_0x01ff
        L_0x01f5:
            r15 = r2
            r9 = r3
            r16 = r4
            r17 = r7
            r18 = r8
            r7 = r50
        L_0x01ff:
            r8 = r6
        L_0x0200:
            r11.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0213
            r0 = -1
            java.lang.String r2 = "androidx.compose.material3.Slider (Slider.kt:146)"
            r3 = -202044027(0xfffffffff3f50d85, float:-3.8830168E31)
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r1, r0, r2)
        L_0x0213:
            if (r17 < 0) goto L_0x02b0
            androidx.compose.material3.SliderKt$Slider$3 r0 = new androidx.compose.material3.SliderKt$Slider$3
            r0.<init>(r7, r8, r9, r1)
            r2 = -1522452856(0xffffffffa5413688, float:-1.6758557E-16)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r11, r2, r5, r0)
            r19 = r0
            kotlin.jvm.functions.Function3 r19 = (kotlin.jvm.functions.Function3) r19
            androidx.compose.material3.SliderKt$Slider$4 r0 = new androidx.compose.material3.SliderKt$Slider$4
            r0.<init>(r8, r9, r1)
            r2 = 686671625(0x28edc709, float:2.6398603E-14)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r11, r2, r5, r0)
            r20 = r0
            kotlin.jvm.functions.Function3 r20 = (kotlin.jvm.functions.Function3) r20
            int r0 = r1 >> 6
            r2 = r0 & 14
            r3 = 905969664(0x36000000, float:1.9073486E-6)
            r2 = r2 | r3
            r3 = r0 & 112(0x70, float:1.57E-43)
            r2 = r2 | r3
            int r3 = r1 >> 18
            r3 = r3 & 896(0x380, float:1.256E-42)
            r2 = r2 | r3
            int r3 = r1 << 6
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r3
            r3 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r3
            r0 = r0 | r2
            r2 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r1
            r0 = r0 | r2
            int r2 = r1 << 18
            r2 = r2 & r40
            r0 = r0 | r2
            int r1 = r1 << 9
            r1 = r1 & r41
            r21 = r0 | r1
            r0 = r15
            r1 = r9
            r2 = r7
            r3 = r43
            r4 = r18
            r5 = r17
            r6 = r42
            r22 = r7
            r7 = r16
            r23 = r8
            r8 = r19
            r19 = r9
            r9 = r20
            r10 = r11
            r20 = r11
            r11 = r21
            SliderImpl(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0285
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0285:
            r3 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r4 = r19
            r9 = r22
            r8 = r23
        L_0x0292:
            androidx.compose.runtime.ScopeUpdateScope r15 = r20.endRestartGroup()
            if (r15 != 0) goto L_0x0299
            goto L_0x02af
        L_0x0299:
            androidx.compose.material3.SliderKt$Slider$5 r16 = new androidx.compose.material3.SliderKt$Slider$5
            r0 = r16
            r1 = r42
            r2 = r43
            r10 = r52
            r11 = r53
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = r16
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r15.updateScope(r0)
        L_0x02af:
            return
        L_0x02b0:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "steps should be >= 0"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.Slider(float, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, kotlin.ranges.ClosedFloatingPointRange, int, kotlin.jvm.functions.Function0, androidx.compose.material3.SliderColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x012b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void Slider(float r45, kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r46, androidx.compose.ui.Modifier r47, boolean r48, kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> r49, kotlin.jvm.functions.Function0<kotlin.Unit> r50, androidx.compose.material3.SliderColors r51, androidx.compose.foundation.interaction.MutableInteractionSource r52, kotlin.jvm.functions.Function3<? super androidx.compose.material3.SliderPositions, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r53, kotlin.jvm.functions.Function3<? super androidx.compose.material3.SliderPositions, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r54, int r55, androidx.compose.runtime.Composer r56, int r57, int r58, int r59) {
        /*
            r12 = r46
            r13 = r57
            r14 = r59
            java.lang.String r0 = "onValueChange"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = 251663723(0xf00156b, float:6.315012E-30)
            r1 = r56
            androidx.compose.runtime.Composer r11 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(Slider)P(9,4,3,1,10,5!2,7,8)250@11737L8,251@11797L39,271@12381L338:Slider.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r1)
            r1 = r14 & 1
            if (r1 == 0) goto L_0x0023
            r1 = r13 | 6
            r10 = r45
            goto L_0x0035
        L_0x0023:
            r1 = r13 & 14
            r10 = r45
            if (r1 != 0) goto L_0x0034
            boolean r1 = r11.changed((float) r10)
            if (r1 == 0) goto L_0x0031
            r1 = 4
            goto L_0x0032
        L_0x0031:
            r1 = 2
        L_0x0032:
            r1 = r1 | r13
            goto L_0x0035
        L_0x0034:
            r1 = r13
        L_0x0035:
            r4 = r14 & 2
            if (r4 == 0) goto L_0x003c
            r1 = r1 | 48
            goto L_0x004c
        L_0x003c:
            r4 = r13 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x004c
            boolean r4 = r11.changedInstance(r12)
            if (r4 == 0) goto L_0x0049
            r4 = 32
            goto L_0x004b
        L_0x0049:
            r4 = 16
        L_0x004b:
            r1 = r1 | r4
        L_0x004c:
            r4 = r14 & 4
            if (r4 == 0) goto L_0x0053
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0066
        L_0x0053:
            r5 = r13 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0066
            r5 = r47
            boolean r6 = r11.changed((java.lang.Object) r5)
            if (r6 == 0) goto L_0x0062
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r1 = r1 | r6
            goto L_0x0068
        L_0x0066:
            r5 = r47
        L_0x0068:
            r6 = r14 & 8
            if (r6 == 0) goto L_0x006f
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0082
        L_0x006f:
            r7 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0082
            r7 = r48
            boolean r8 = r11.changed((boolean) r7)
            if (r8 == 0) goto L_0x007e
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007e:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r1 = r1 | r8
            goto L_0x0084
        L_0x0082:
            r7 = r48
        L_0x0084:
            r8 = 57344(0xe000, float:8.0356E-41)
            r9 = r13 & r8
            if (r9 != 0) goto L_0x00a0
            r9 = r14 & 16
            if (r9 != 0) goto L_0x009a
            r9 = r49
            boolean r15 = r11.changed((java.lang.Object) r9)
            if (r15 == 0) goto L_0x009c
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009a:
            r9 = r49
        L_0x009c:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r1 = r1 | r15
            goto L_0x00a2
        L_0x00a0:
            r9 = r49
        L_0x00a2:
            r15 = r14 & 32
            r40 = 458752(0x70000, float:6.42848E-40)
            if (r15 == 0) goto L_0x00af
            r16 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r16
            r2 = r50
            goto L_0x00c2
        L_0x00af:
            r16 = r13 & r40
            r2 = r50
            if (r16 != 0) goto L_0x00c2
            boolean r16 = r11.changedInstance(r2)
            if (r16 == 0) goto L_0x00be
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c0
        L_0x00be:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00c0:
            r1 = r1 | r16
        L_0x00c2:
            r41 = 3670016(0x380000, float:5.142788E-39)
            r16 = r13 & r41
            if (r16 != 0) goto L_0x00dc
            r16 = r14 & 64
            r8 = r51
            if (r16 != 0) goto L_0x00d7
            boolean r16 = r11.changed((java.lang.Object) r8)
            if (r16 == 0) goto L_0x00d7
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d9
        L_0x00d7:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00d9:
            r1 = r1 | r16
            goto L_0x00de
        L_0x00dc:
            r8 = r51
        L_0x00de:
            r0 = r14 & 128(0x80, float:1.794E-43)
            r42 = 29360128(0x1c00000, float:7.052966E-38)
            if (r0 == 0) goto L_0x00eb
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r16
            r3 = r52
            goto L_0x00fe
        L_0x00eb:
            r16 = r13 & r42
            r3 = r52
            if (r16 != 0) goto L_0x00fe
            boolean r17 = r11.changed((java.lang.Object) r3)
            if (r17 == 0) goto L_0x00fa
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fc
        L_0x00fa:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fc:
            r1 = r1 | r17
        L_0x00fe:
            r2 = r14 & 256(0x100, float:3.59E-43)
            r43 = 234881024(0xe000000, float:1.5777218E-30)
            if (r2 == 0) goto L_0x010b
            r17 = 100663296(0x6000000, float:2.4074124E-35)
            r1 = r1 | r17
            r3 = r53
            goto L_0x011e
        L_0x010b:
            r17 = r13 & r43
            r3 = r53
            if (r17 != 0) goto L_0x011e
            boolean r17 = r11.changedInstance(r3)
            if (r17 == 0) goto L_0x011a
            r17 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011c
        L_0x011a:
            r17 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011c:
            r1 = r1 | r17
        L_0x011e:
            r3 = r14 & 512(0x200, float:7.175E-43)
            r44 = 1879048192(0x70000000, float:1.58456325E29)
            if (r3 == 0) goto L_0x012b
            r17 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r1 | r17
            r5 = r54
            goto L_0x013e
        L_0x012b:
            r17 = r13 & r44
            r5 = r54
            if (r17 != 0) goto L_0x013e
            boolean r17 = r11.changedInstance(r5)
            if (r17 == 0) goto L_0x013a
            r17 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x013c
        L_0x013a:
            r17 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x013c:
            r1 = r1 | r17
        L_0x013e:
            r5 = r14 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L_0x0147
            r17 = r58 | 6
        L_0x0144:
            r7 = r17
            goto L_0x015d
        L_0x0147:
            r17 = r58 & 14
            r7 = r55
            if (r17 != 0) goto L_0x015b
            boolean r17 = r11.changed((int) r7)
            if (r17 == 0) goto L_0x0156
            r17 = 4
            goto L_0x0158
        L_0x0156:
            r17 = 2
        L_0x0158:
            r17 = r58 | r17
            goto L_0x0144
        L_0x015b:
            r7 = r58
        L_0x015d:
            r17 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r8 = r1 & r17
            r9 = 306783378(0x12492492, float:6.3469493E-28)
            if (r8 != r9) goto L_0x018c
            r8 = r7 & 11
            r9 = 2
            if (r8 != r9) goto L_0x018c
            boolean r8 = r11.getSkipping()
            if (r8 != 0) goto L_0x0173
            goto L_0x018c
        L_0x0173:
            r11.skipToGroupEnd()
            r3 = r47
            r4 = r48
            r5 = r49
            r6 = r50
            r7 = r51
            r8 = r52
            r9 = r53
            r10 = r54
            r25 = r11
            r11 = r55
            goto L_0x02ff
        L_0x018c:
            r11.startDefaults()
            r8 = r13 & 1
            r9 = -57345(0xffffffffffff1fff, float:NaN)
            if (r8 == 0) goto L_0x01c1
            boolean r8 = r11.getDefaultsInvalid()
            if (r8 == 0) goto L_0x019d
            goto L_0x01c1
        L_0x019d:
            r11.skipToGroupEnd()
            r0 = r14 & 16
            if (r0 == 0) goto L_0x01a5
            r1 = r1 & r9
        L_0x01a5:
            r0 = r14 & 64
            if (r0 == 0) goto L_0x01ad
            r0 = -3670017(0xffffffffffc7ffff, float:NaN)
            r1 = r1 & r0
        L_0x01ad:
            r15 = r47
            r16 = r48
            r17 = r49
            r18 = r50
            r19 = r51
            r20 = r52
            r21 = r53
            r22 = r54
            r23 = r55
            goto L_0x0288
        L_0x01c1:
            if (r4 == 0) goto L_0x01c8
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r4 = (androidx.compose.ui.Modifier) r4
            goto L_0x01ca
        L_0x01c8:
            r4 = r47
        L_0x01ca:
            if (r6 == 0) goto L_0x01ce
            r6 = 1
            goto L_0x01d0
        L_0x01ce:
            r6 = r48
        L_0x01d0:
            r16 = r14 & 16
            if (r16 == 0) goto L_0x01df
            r8 = 0
            r56 = r4
            r4 = 1065353216(0x3f800000, float:1.0)
            kotlin.ranges.ClosedFloatingPointRange r4 = kotlin.ranges.RangesKt.rangeTo((float) r8, (float) r4)
            r1 = r1 & r9
            goto L_0x01e3
        L_0x01df:
            r56 = r4
            r4 = r49
        L_0x01e3:
            if (r15 == 0) goto L_0x01e7
            r8 = 0
            goto L_0x01e9
        L_0x01e7:
            r8 = r50
        L_0x01e9:
            r9 = r14 & 64
            if (r9 == 0) goto L_0x0214
            androidx.compose.material3.SliderDefaults r15 = androidx.compose.material3.SliderDefaults.INSTANCE
            r16 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r28 = 0
            r30 = 0
            r32 = 0
            r34 = 0
            r37 = 0
            r38 = 6
            r39 = 1023(0x3ff, float:1.434E-42)
            r36 = r11
            androidx.compose.material3.SliderColors r9 = r15.m1547colorsq0g_0yA(r16, r18, r20, r22, r24, r26, r28, r30, r32, r34, r36, r37, r38, r39)
            r15 = -3670017(0xffffffffffc7ffff, float:NaN)
            r1 = r1 & r15
            goto L_0x0216
        L_0x0214:
            r9 = r51
        L_0x0216:
            if (r0 == 0) goto L_0x023c
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r11.startReplaceableGroup(r0)
            java.lang.String r0 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r0)
            java.lang.Object r0 = r11.rememberedValue()
            androidx.compose.runtime.Composer$Companion r15 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r15 = r15.getEmpty()
            if (r0 != r15) goto L_0x0236
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r11.updateRememberedValue(r0)
        L_0x0236:
            r11.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = (androidx.compose.foundation.interaction.MutableInteractionSource) r0
            goto L_0x023e
        L_0x023c:
            r0 = r52
        L_0x023e:
            if (r2 == 0) goto L_0x0252
            androidx.compose.material3.SliderKt$Slider$7 r2 = new androidx.compose.material3.SliderKt$Slider$7
            r2.<init>(r0, r9, r6, r1)
            r15 = 1998248322(0x771ad982, float:3.1407238E33)
            r16 = r0
            r0 = 1
            androidx.compose.runtime.internal.ComposableLambda r2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r11, r15, r0, r2)
            kotlin.jvm.functions.Function3 r2 = (kotlin.jvm.functions.Function3) r2
            goto L_0x0257
        L_0x0252:
            r16 = r0
            r0 = 1
            r2 = r53
        L_0x0257:
            if (r3 == 0) goto L_0x0268
            androidx.compose.material3.SliderKt$Slider$8 r3 = new androidx.compose.material3.SliderKt$Slider$8
            r3.<init>(r9, r6, r1)
            r15 = 1543282935(0x5bfca0f7, float:1.42217354E17)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r11, r15, r0, r3)
            kotlin.jvm.functions.Function3 r0 = (kotlin.jvm.functions.Function3) r0
            goto L_0x026a
        L_0x0268:
            r0 = r54
        L_0x026a:
            if (r5 == 0) goto L_0x0276
            r3 = 0
            r15 = r56
            r22 = r0
            r21 = r2
            r23 = r3
            goto L_0x027e
        L_0x0276:
            r23 = r55
            r15 = r56
            r22 = r0
            r21 = r2
        L_0x027e:
            r17 = r4
            r18 = r8
            r19 = r9
            r20 = r16
            r16 = r6
        L_0x0288:
            r11.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x029a
            java.lang.String r0 = "androidx.compose.material3.Slider (Slider.kt:243)"
            r2 = 251663723(0xf00156b, float:6.315012E-30)
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r1, r7, r0)
        L_0x029a:
            if (r23 < 0) goto L_0x031f
            int r0 = r1 >> 6
            r2 = r0 & 14
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            int r2 = r1 >> 15
            r2 = r2 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            int r2 = r1 << 6
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            int r2 = r1 >> 3
            r3 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r3
            r0 = r0 | r2
            int r2 = r7 << 15
            r2 = r2 & r40
            r0 = r0 | r2
            int r2 = r1 << 18
            r2 = r2 & r41
            r0 = r0 | r2
            int r2 = r1 << 9
            r2 = r2 & r42
            r0 = r0 | r2
            r2 = r1 & r43
            r0 = r0 | r2
            r1 = r1 & r44
            r24 = r0 | r1
            r0 = r15
            r1 = r16
            r2 = r20
            r3 = r46
            r4 = r18
            r5 = r23
            r6 = r45
            r7 = r17
            r8 = r21
            r9 = r22
            r10 = r11
            r25 = r11
            r11 = r24
            SliderImpl(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x02ee
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x02ee:
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r11 = r23
        L_0x02ff:
            androidx.compose.runtime.ScopeUpdateScope r15 = r25.endRestartGroup()
            if (r15 != 0) goto L_0x0306
            goto L_0x031e
        L_0x0306:
            androidx.compose.material3.SliderKt$Slider$10 r16 = new androidx.compose.material3.SliderKt$Slider$10
            r0 = r16
            r1 = r45
            r2 = r46
            r12 = r57
            r13 = r58
            r14 = r59
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = r16
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r15.updateScope(r0)
        L_0x031e:
            return
        L_0x031f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "steps should be >= 0"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.Slider(float, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, kotlin.ranges.ClosedFloatingPointRange, kotlin.jvm.functions.Function0, androidx.compose.material3.SliderColors, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function3, int, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0123  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void RangeSlider(kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> r42, kotlin.jvm.functions.Function1<? super kotlin.ranges.ClosedFloatingPointRange<java.lang.Float>, kotlin.Unit> r43, androidx.compose.ui.Modifier r44, boolean r45, kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> r46, int r47, kotlin.jvm.functions.Function0<kotlin.Unit> r48, androidx.compose.material3.SliderColors r49, androidx.compose.runtime.Composer r50, int r51, int r52) {
        /*
            r15 = r42
            r14 = r43
            r13 = r51
            r12 = r52
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "onValueChange"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            r0 = -743091416(0xffffffffd3b55328, float:-1.55756842E12)
            r1 = r50
            androidx.compose.runtime.Composer r11 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(RangeSlider)P(6,3,2,1,7,5,4)328@15054L8,330@15126L39,331@15223L39,335@15320L988:Slider.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r1)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0029
            r1 = r13 | 6
            goto L_0x0039
        L_0x0029:
            r1 = r13 & 14
            if (r1 != 0) goto L_0x0038
            boolean r1 = r11.changed((java.lang.Object) r15)
            if (r1 == 0) goto L_0x0035
            r1 = 4
            goto L_0x0036
        L_0x0035:
            r1 = 2
        L_0x0036:
            r1 = r1 | r13
            goto L_0x0039
        L_0x0038:
            r1 = r13
        L_0x0039:
            r2 = r12 & 2
            if (r2 == 0) goto L_0x0040
            r1 = r1 | 48
            goto L_0x0050
        L_0x0040:
            r2 = r13 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0050
            boolean r2 = r11.changedInstance(r14)
            if (r2 == 0) goto L_0x004d
            r2 = 32
            goto L_0x004f
        L_0x004d:
            r2 = 16
        L_0x004f:
            r1 = r1 | r2
        L_0x0050:
            r2 = r12 & 4
            if (r2 == 0) goto L_0x0057
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x006a
        L_0x0057:
            r3 = r13 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x006a
            r3 = r44
            boolean r4 = r11.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x0066
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0068
        L_0x0066:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0068:
            r1 = r1 | r4
            goto L_0x006c
        L_0x006a:
            r3 = r44
        L_0x006c:
            r4 = r12 & 8
            if (r4 == 0) goto L_0x0073
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0086
        L_0x0073:
            r5 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x0086
            r5 = r45
            boolean r6 = r11.changed((boolean) r5)
            if (r6 == 0) goto L_0x0082
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x0084
        L_0x0082:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x0084:
            r1 = r1 | r6
            goto L_0x0088
        L_0x0086:
            r5 = r45
        L_0x0088:
            r6 = 57344(0xe000, float:8.0356E-41)
            r7 = r13 & r6
            if (r7 != 0) goto L_0x00a4
            r7 = r12 & 16
            if (r7 != 0) goto L_0x009e
            r7 = r46
            boolean r8 = r11.changed((java.lang.Object) r7)
            if (r8 == 0) goto L_0x00a0
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a2
        L_0x009e:
            r7 = r46
        L_0x00a0:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x00a2:
            r1 = r1 | r8
            goto L_0x00a6
        L_0x00a4:
            r7 = r46
        L_0x00a6:
            r8 = r12 & 32
            r9 = 458752(0x70000, float:6.42848E-40)
            if (r8 == 0) goto L_0x00b0
            r10 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r10
            goto L_0x00c4
        L_0x00b0:
            r10 = r13 & r9
            if (r10 != 0) goto L_0x00c4
            r10 = r47
            boolean r16 = r11.changed((int) r10)
            if (r16 == 0) goto L_0x00bf
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c1
        L_0x00bf:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00c1:
            r1 = r1 | r16
            goto L_0x00c6
        L_0x00c4:
            r10 = r47
        L_0x00c6:
            r16 = r12 & 64
            r41 = 3670016(0x380000, float:5.142788E-39)
            if (r16 == 0) goto L_0x00d3
            r17 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r17
            r9 = r48
            goto L_0x00e6
        L_0x00d3:
            r17 = r13 & r41
            r9 = r48
            if (r17 != 0) goto L_0x00e6
            boolean r17 = r11.changedInstance(r9)
            if (r17 == 0) goto L_0x00e2
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e4
        L_0x00e2:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00e4:
            r1 = r1 | r17
        L_0x00e6:
            r17 = 29360128(0x1c00000, float:7.052966E-38)
            r17 = r13 & r17
            if (r17 != 0) goto L_0x0102
            r6 = r12 & 128(0x80, float:1.794E-43)
            if (r6 != 0) goto L_0x00fb
            r6 = r49
            boolean r17 = r11.changed((java.lang.Object) r6)
            if (r17 == 0) goto L_0x00fd
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ff
        L_0x00fb:
            r6 = r49
        L_0x00fd:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ff:
            r1 = r1 | r17
            goto L_0x0104
        L_0x0102:
            r6 = r49
        L_0x0104:
            r17 = 23967451(0x16db6db, float:4.3661218E-38)
            r0 = r1 & r17
            r3 = 4793490(0x492492, float:6.71711E-39)
            if (r0 != r3) goto L_0x0123
            boolean r0 = r11.getSkipping()
            if (r0 != 0) goto L_0x0115
            goto L_0x0123
        L_0x0115:
            r11.skipToGroupEnd()
            r3 = r44
            r4 = r5
            r8 = r6
            r5 = r7
            r7 = r9
            r6 = r10
            r21 = r11
            goto L_0x028f
        L_0x0123:
            r11.startDefaults()
            r0 = r13 & 1
            r17 = -57345(0xffffffffffff1fff, float:NaN)
            r3 = 1
            if (r0 == 0) goto L_0x0151
            boolean r0 = r11.getDefaultsInvalid()
            if (r0 == 0) goto L_0x0135
            goto L_0x0151
        L_0x0135:
            r11.skipToGroupEnd()
            r0 = r12 & 16
            if (r0 == 0) goto L_0x013e
            r1 = r1 & r17
        L_0x013e:
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0146
            r0 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r1 = r1 & r0
        L_0x0146:
            r16 = r44
        L_0x0148:
            r17 = r7
            r19 = r9
            r18 = r10
            r10 = r5
            r9 = r6
            goto L_0x01ab
        L_0x0151:
            if (r2 == 0) goto L_0x0158
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            goto L_0x015a
        L_0x0158:
            r0 = r44
        L_0x015a:
            if (r4 == 0) goto L_0x015d
            r5 = r3
        L_0x015d:
            r2 = r12 & 16
            if (r2 == 0) goto L_0x016b
            r2 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            kotlin.ranges.ClosedFloatingPointRange r2 = kotlin.ranges.RangesKt.rangeTo((float) r2, (float) r4)
            r1 = r1 & r17
            r7 = r2
        L_0x016b:
            if (r8 == 0) goto L_0x016f
            r2 = 0
            r10 = r2
        L_0x016f:
            if (r16 == 0) goto L_0x0173
            r2 = 0
            r9 = r2
        L_0x0173:
            r2 = r12 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x01a8
            androidx.compose.material3.SliderDefaults r16 = androidx.compose.material3.SliderDefaults.INSTANCE
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r33 = 0
            r35 = 0
            r38 = 0
            r39 = 6
            r40 = 1023(0x3ff, float:1.434E-42)
            r37 = r11
            androidx.compose.material3.SliderColors r2 = r16.m1547colorsq0g_0yA(r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r38, r39, r40)
            r4 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r1 = r1 & r4
            r16 = r0
            r17 = r7
            r19 = r9
            r18 = r10
            r9 = r2
            r10 = r5
            goto L_0x01ab
        L_0x01a8:
            r16 = r0
            goto L_0x0148
        L_0x01ab:
            r11.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01be
            r0 = -1
            java.lang.String r2 = "androidx.compose.material3.RangeSlider (Slider.kt:319)"
            r4 = -743091416(0xffffffffd3b55328, float:-1.55756842E12)
            androidx.compose.runtime.ComposerKt.traceEventStart(r4, r1, r0, r2)
        L_0x01be:
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r11.startReplaceableGroup(r0)
            java.lang.String r2 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r2)
            java.lang.Object r4 = r11.rememberedValue()
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r5 = r5.getEmpty()
            if (r4 != r5) goto L_0x01dc
            androidx.compose.foundation.interaction.MutableInteractionSource r4 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r11.updateRememberedValue(r4)
        L_0x01dc:
            r11.endReplaceableGroup()
            r7 = r4
            androidx.compose.foundation.interaction.MutableInteractionSource r7 = (androidx.compose.foundation.interaction.MutableInteractionSource) r7
            r11.startReplaceableGroup(r0)
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r2)
            java.lang.Object r0 = r11.rememberedValue()
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r0 != r2) goto L_0x01fb
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r11.updateRememberedValue(r0)
        L_0x01fb:
            r11.endReplaceableGroup()
            r8 = r0
            androidx.compose.foundation.interaction.MutableInteractionSource r8 = (androidx.compose.foundation.interaction.MutableInteractionSource) r8
            if (r18 < 0) goto L_0x02aa
            androidx.compose.material3.SliderKt$RangeSlider$2 r0 = new androidx.compose.material3.SliderKt$RangeSlider$2
            r0.<init>(r7, r9, r10, r1)
            r2 = 1361279243(0x5123790b, float:4.3881902E10)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r11, r2, r3, r0)
            r20 = r0
            kotlin.jvm.functions.Function3 r20 = (kotlin.jvm.functions.Function3) r20
            androidx.compose.material3.SliderKt$RangeSlider$3 r0 = new androidx.compose.material3.SliderKt$RangeSlider$3
            r0.<init>(r8, r9, r10, r1)
            r2 = 741565023(0x2c33625f, float:2.5492037E-12)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r11, r2, r3, r0)
            r21 = r0
            kotlin.jvm.functions.Function3 r21 = (kotlin.jvm.functions.Function3) r21
            androidx.compose.material3.SliderKt$RangeSlider$4 r0 = new androidx.compose.material3.SliderKt$RangeSlider$4
            r0.<init>(r9, r10, r1)
            r2 = -298726816(0xffffffffee31ca60, float:-1.3755876E28)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r11, r2, r3, r0)
            r22 = r0
            kotlin.jvm.functions.Function3 r22 = (kotlin.jvm.functions.Function3) r22
            int r0 = r1 >> 6
            r0 = r0 & 14
            r2 = 918552576(0x36c00000, float:5.722046E-6)
            r0 = r0 | r2
            int r2 = r1 << 3
            r3 = r2 & 112(0x70, float:1.57E-43)
            r0 = r0 | r3
            r2 = r2 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r1
            r0 = r0 | r2
            r2 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r1
            r0 = r0 | r2
            r1 = r1 & r41
            r23 = r0 | r1
            r24 = 54
            r25 = 0
            r0 = r16
            r1 = r42
            r2 = r43
            r3 = r10
            r4 = r17
            r5 = r18
            r6 = r19
            r26 = r9
            r9 = r20
            r20 = r10
            r10 = r21
            r21 = r11
            r11 = r22
            r12 = r21
            r13 = r23
            r14 = r24
            r15 = r25
            RangeSliderImpl(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0283
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0283:
            r3 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r4 = r20
            r8 = r26
        L_0x028f:
            androidx.compose.runtime.ScopeUpdateScope r11 = r21.endRestartGroup()
            if (r11 != 0) goto L_0x0296
            goto L_0x02a9
        L_0x0296:
            androidx.compose.material3.SliderKt$RangeSlider$5 r12 = new androidx.compose.material3.SliderKt$RangeSlider$5
            r0 = r12
            r1 = r42
            r2 = r43
            r9 = r51
            r10 = r52
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            kotlin.jvm.functions.Function2 r12 = (kotlin.jvm.functions.Function2) r12
            r11.updateScope(r12)
        L_0x02a9:
            return
        L_0x02aa:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "steps should be >= 0"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.RangeSlider(kotlin.ranges.ClosedFloatingPointRange, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, kotlin.ranges.ClosedFloatingPointRange, int, kotlin.jvm.functions.Function0, androidx.compose.material3.SliderColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x03b7  */
    /* JADX WARNING: Removed duplicated region for block: B:209:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0130  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void RangeSlider(kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> r46, kotlin.jvm.functions.Function1<? super kotlin.ranges.ClosedFloatingPointRange<java.lang.Float>, kotlin.Unit> r47, androidx.compose.ui.Modifier r48, boolean r49, kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> r50, kotlin.jvm.functions.Function0<kotlin.Unit> r51, androidx.compose.material3.SliderColors r52, androidx.compose.foundation.interaction.MutableInteractionSource r53, androidx.compose.foundation.interaction.MutableInteractionSource r54, kotlin.jvm.functions.Function3<? super androidx.compose.material3.SliderPositions, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r55, kotlin.jvm.functions.Function3<? super androidx.compose.material3.SliderPositions, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r56, kotlin.jvm.functions.Function3<? super androidx.compose.material3.SliderPositions, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r57, int r58, androidx.compose.runtime.Composer r59, int r60, int r61, int r62) {
        /*
            r15 = r46
            r14 = r47
            r13 = r60
            r12 = r61
            r11 = r62
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "onValueChange"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            r0 = -1048796133(0xffffffffc17ca41b, float:-15.790065)
            r1 = r59
            androidx.compose.runtime.Composer r10 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(RangeSlider)P(11,5,4,1,12,6!1,7!1,8!1,10)435@20161L8,436@20226L39,437@20320L39,464@21150L445:Slider.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r10, r1)
            r1 = r11 & 1
            if (r1 == 0) goto L_0x002b
            r1 = r13 | 6
            goto L_0x003b
        L_0x002b:
            r1 = r13 & 14
            if (r1 != 0) goto L_0x003a
            boolean r1 = r10.changed((java.lang.Object) r15)
            if (r1 == 0) goto L_0x0037
            r1 = 4
            goto L_0x0038
        L_0x0037:
            r1 = 2
        L_0x0038:
            r1 = r1 | r13
            goto L_0x003b
        L_0x003a:
            r1 = r13
        L_0x003b:
            r4 = r11 & 2
            if (r4 == 0) goto L_0x0042
            r1 = r1 | 48
            goto L_0x0052
        L_0x0042:
            r4 = r13 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0052
            boolean r4 = r10.changedInstance(r14)
            if (r4 == 0) goto L_0x004f
            r4 = 32
            goto L_0x0051
        L_0x004f:
            r4 = 16
        L_0x0051:
            r1 = r1 | r4
        L_0x0052:
            r4 = r11 & 4
            if (r4 == 0) goto L_0x0059
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x006d
        L_0x0059:
            r9 = r13 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x006d
            r9 = r48
            boolean r16 = r10.changed((java.lang.Object) r9)
            if (r16 == 0) goto L_0x0068
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x006a
        L_0x0068:
            r16 = 128(0x80, float:1.794E-43)
        L_0x006a:
            r1 = r1 | r16
            goto L_0x006f
        L_0x006d:
            r9 = r48
        L_0x006f:
            r16 = r11 & 8
            if (r16 == 0) goto L_0x0076
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x008a
        L_0x0076:
            r2 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x008a
            r2 = r49
            boolean r17 = r10.changed((boolean) r2)
            if (r17 == 0) goto L_0x0085
            r17 = 2048(0x800, float:2.87E-42)
            goto L_0x0087
        L_0x0085:
            r17 = 1024(0x400, float:1.435E-42)
        L_0x0087:
            r1 = r1 | r17
            goto L_0x008c
        L_0x008a:
            r2 = r49
        L_0x008c:
            r41 = 57344(0xe000, float:8.0356E-41)
            r17 = r13 & r41
            if (r17 != 0) goto L_0x00a7
            r17 = r11 & 16
            r3 = r50
            if (r17 != 0) goto L_0x00a2
            boolean r18 = r10.changed((java.lang.Object) r3)
            if (r18 == 0) goto L_0x00a2
            r18 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a4
        L_0x00a2:
            r18 = 8192(0x2000, float:1.14794E-41)
        L_0x00a4:
            r1 = r1 | r18
            goto L_0x00a9
        L_0x00a7:
            r3 = r50
        L_0x00a9:
            r18 = r11 & 32
            r42 = 458752(0x70000, float:6.42848E-40)
            if (r18 == 0) goto L_0x00b6
            r19 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r19
            r5 = r51
            goto L_0x00c9
        L_0x00b6:
            r19 = r13 & r42
            r5 = r51
            if (r19 != 0) goto L_0x00c9
            boolean r20 = r10.changedInstance(r5)
            if (r20 == 0) goto L_0x00c5
            r20 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c7
        L_0x00c5:
            r20 = 65536(0x10000, float:9.18355E-41)
        L_0x00c7:
            r1 = r1 | r20
        L_0x00c9:
            r43 = 3670016(0x380000, float:5.142788E-39)
            r20 = r13 & r43
            if (r20 != 0) goto L_0x00e3
            r20 = r11 & 64
            r6 = r52
            if (r20 != 0) goto L_0x00de
            boolean r21 = r10.changed((java.lang.Object) r6)
            if (r21 == 0) goto L_0x00de
            r21 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e0
        L_0x00de:
            r21 = 524288(0x80000, float:7.34684E-40)
        L_0x00e0:
            r1 = r1 | r21
            goto L_0x00e5
        L_0x00e3:
            r6 = r52
        L_0x00e5:
            r7 = r11 & 128(0x80, float:1.794E-43)
            r44 = 29360128(0x1c00000, float:7.052966E-38)
            if (r7 == 0) goto L_0x00f2
            r22 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r22
            r8 = r53
            goto L_0x0105
        L_0x00f2:
            r22 = r13 & r44
            r8 = r53
            if (r22 != 0) goto L_0x0105
            boolean r23 = r10.changed((java.lang.Object) r8)
            if (r23 == 0) goto L_0x0101
            r23 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0103
        L_0x0101:
            r23 = 4194304(0x400000, float:5.877472E-39)
        L_0x0103:
            r1 = r1 | r23
        L_0x0105:
            r0 = r11 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0110
            r23 = 100663296(0x6000000, float:2.4074124E-35)
            r1 = r1 | r23
            r2 = r54
            goto L_0x0125
        L_0x0110:
            r23 = 234881024(0xe000000, float:1.5777218E-30)
            r23 = r13 & r23
            r2 = r54
            if (r23 != 0) goto L_0x0125
            boolean r23 = r10.changed((java.lang.Object) r2)
            if (r23 == 0) goto L_0x0121
            r23 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0123
        L_0x0121:
            r23 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0123:
            r1 = r1 | r23
        L_0x0125:
            r2 = r11 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x0130
            r23 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r1 | r23
            r3 = r55
            goto L_0x0145
        L_0x0130:
            r23 = 1879048192(0x70000000, float:1.58456325E29)
            r23 = r13 & r23
            r3 = r55
            if (r23 != 0) goto L_0x0145
            boolean r23 = r10.changedInstance(r3)
            if (r23 == 0) goto L_0x0141
            r23 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0143
        L_0x0141:
            r23 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0143:
            r1 = r1 | r23
        L_0x0145:
            r3 = r11 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x014e
            r17 = r12 | 6
            r5 = r56
            goto L_0x0164
        L_0x014e:
            r23 = r12 & 14
            r5 = r56
            if (r23 != 0) goto L_0x0162
            boolean r23 = r10.changedInstance(r5)
            if (r23 == 0) goto L_0x015d
            r17 = 4
            goto L_0x015f
        L_0x015d:
            r17 = 2
        L_0x015f:
            r17 = r12 | r17
            goto L_0x0164
        L_0x0162:
            r17 = r12
        L_0x0164:
            r5 = r11 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x016b
            r17 = r17 | 48
            goto L_0x017e
        L_0x016b:
            r23 = r12 & 112(0x70, float:1.57E-43)
            r6 = r57
            if (r23 != 0) goto L_0x017e
            boolean r23 = r10.changedInstance(r6)
            if (r23 == 0) goto L_0x017a
            r19 = 32
            goto L_0x017c
        L_0x017a:
            r19 = 16
        L_0x017c:
            r17 = r17 | r19
        L_0x017e:
            r6 = r17
            r8 = r11 & 4096(0x1000, float:5.74E-42)
            if (r8 == 0) goto L_0x0187
            r6 = r6 | 384(0x180, float:5.38E-43)
            goto L_0x019b
        L_0x0187:
            r9 = r12 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x019b
            r9 = r58
            boolean r17 = r10.changed((int) r9)
            if (r17 == 0) goto L_0x0196
            r21 = 256(0x100, float:3.59E-43)
            goto L_0x0198
        L_0x0196:
            r21 = 128(0x80, float:1.794E-43)
        L_0x0198:
            r6 = r6 | r21
            goto L_0x019d
        L_0x019b:
            r9 = r58
        L_0x019d:
            r17 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r9 = r1 & r17
            r12 = 306783378(0x12492492, float:6.3469493E-28)
            if (r9 != r12) goto L_0x01d1
            r9 = r6 & 731(0x2db, float:1.024E-42)
            r12 = 146(0x92, float:2.05E-43)
            if (r9 != r12) goto L_0x01d1
            boolean r9 = r10.getSkipping()
            if (r9 != 0) goto L_0x01b4
            goto L_0x01d1
        L_0x01b4:
            r10.skipToGroupEnd()
            r3 = r48
            r4 = r49
            r5 = r50
            r6 = r51
            r7 = r52
            r8 = r53
            r9 = r54
            r11 = r56
            r12 = r57
            r13 = r58
            r30 = r10
            r10 = r55
            goto L_0x03b0
        L_0x01d1:
            r10.startDefaults()
            r9 = r13 & 1
            if (r9 == 0) goto L_0x020a
            boolean r9 = r10.getDefaultsInvalid()
            if (r9 == 0) goto L_0x01df
            goto L_0x020a
        L_0x01df:
            r10.skipToGroupEnd()
            r0 = r11 & 16
            if (r0 == 0) goto L_0x01ea
            r0 = -57345(0xffffffffffff1fff, float:NaN)
            r1 = r1 & r0
        L_0x01ea:
            r0 = r11 & 64
            if (r0 == 0) goto L_0x01f2
            r0 = -3670017(0xffffffffffc7ffff, float:NaN)
            r1 = r1 & r0
        L_0x01f2:
            r16 = r48
            r17 = r49
            r18 = r50
            r19 = r51
            r20 = r52
            r21 = r53
            r22 = r54
            r23 = r55
            r24 = r56
            r25 = r57
            r26 = r58
            goto L_0x032a
        L_0x020a:
            if (r4 == 0) goto L_0x0211
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r4 = (androidx.compose.ui.Modifier) r4
            goto L_0x0213
        L_0x0211:
            r4 = r48
        L_0x0213:
            if (r16 == 0) goto L_0x0217
            r12 = 1
            goto L_0x0219
        L_0x0217:
            r12 = r49
        L_0x0219:
            r16 = r11 & 16
            if (r16 == 0) goto L_0x022b
            r9 = 0
            r59 = r4
            r4 = 1065353216(0x3f800000, float:1.0)
            kotlin.ranges.ClosedFloatingPointRange r4 = kotlin.ranges.RangesKt.rangeTo((float) r9, (float) r4)
            r9 = -57345(0xffffffffffff1fff, float:NaN)
            r1 = r1 & r9
            goto L_0x022f
        L_0x022b:
            r59 = r4
            r4 = r50
        L_0x022f:
            if (r18 == 0) goto L_0x0233
            r9 = 0
            goto L_0x0235
        L_0x0233:
            r9 = r51
        L_0x0235:
            r16 = r11 & 64
            if (r16 == 0) goto L_0x0266
            androidx.compose.material3.SliderDefaults r16 = androidx.compose.material3.SliderDefaults.INSTANCE
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r33 = 0
            r35 = 0
            r38 = 0
            r39 = 6
            r40 = 1023(0x3ff, float:1.434E-42)
            r37 = r10
            androidx.compose.material3.SliderColors r16 = r16.m1547colorsq0g_0yA(r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r38, r39, r40)
            r17 = -3670017(0xffffffffffc7ffff, float:NaN)
            r1 = r1 & r17
            r49 = r4
            r4 = r1
            r1 = r16
            goto L_0x026b
        L_0x0266:
            r49 = r4
            r4 = r1
            r1 = r52
        L_0x026b:
            if (r7 == 0) goto L_0x0293
            r7 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r10.startReplaceableGroup(r7)
            java.lang.String r7 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r10, r7)
            java.lang.Object r7 = r10.rememberedValue()
            androidx.compose.runtime.Composer$Companion r16 = androidx.compose.runtime.Composer.Companion
            r50 = r9
            java.lang.Object r9 = r16.getEmpty()
            if (r7 != r9) goto L_0x028d
            androidx.compose.foundation.interaction.MutableInteractionSource r7 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r10.updateRememberedValue(r7)
        L_0x028d:
            r10.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r7 = (androidx.compose.foundation.interaction.MutableInteractionSource) r7
            goto L_0x0297
        L_0x0293:
            r50 = r9
            r7 = r53
        L_0x0297:
            if (r0 == 0) goto L_0x02bd
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r10.startReplaceableGroup(r0)
            java.lang.String r0 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r10, r0)
            java.lang.Object r0 = r10.rememberedValue()
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r9 = r9.getEmpty()
            if (r0 != r9) goto L_0x02b7
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r10.updateRememberedValue(r0)
        L_0x02b7:
            r10.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = (androidx.compose.foundation.interaction.MutableInteractionSource) r0
            goto L_0x02bf
        L_0x02bd:
            r0 = r54
        L_0x02bf:
            if (r2 == 0) goto L_0x02d3
            androidx.compose.material3.SliderKt$RangeSlider$8 r2 = new androidx.compose.material3.SliderKt$RangeSlider$8
            r2.<init>(r7, r1, r12, r4)
            r9 = 585242822(0x22e218c6, float:6.1283653E-18)
            r16 = r7
            r7 = 1
            androidx.compose.runtime.internal.ComposableLambda r2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r10, r9, r7, r2)
            kotlin.jvm.functions.Function3 r2 = (kotlin.jvm.functions.Function3) r2
            goto L_0x02d8
        L_0x02d3:
            r16 = r7
            r7 = 1
            r2 = r55
        L_0x02d8:
            if (r3 == 0) goto L_0x02e9
            androidx.compose.material3.SliderKt$RangeSlider$9 r3 = new androidx.compose.material3.SliderKt$RangeSlider$9
            r3.<init>(r0, r1, r12, r4)
            r9 = 1397395775(0x534a913f, float:8.7002022E11)
            androidx.compose.runtime.internal.ComposableLambda r3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r10, r9, r7, r3)
            kotlin.jvm.functions.Function3 r3 = (kotlin.jvm.functions.Function3) r3
            goto L_0x02eb
        L_0x02e9:
            r3 = r56
        L_0x02eb:
            if (r5 == 0) goto L_0x02fc
            androidx.compose.material3.SliderKt$RangeSlider$10 r5 = new androidx.compose.material3.SliderKt$RangeSlider$10
            r5.<init>(r1, r12, r4)
            r9 = -2139066097(0xffffffff8080710f, float:-1.1795501E-38)
            androidx.compose.runtime.internal.ComposableLambda r5 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r10, r9, r7, r5)
            kotlin.jvm.functions.Function3 r5 = (kotlin.jvm.functions.Function3) r5
            goto L_0x02fe
        L_0x02fc:
            r5 = r57
        L_0x02fe:
            if (r8 == 0) goto L_0x0313
            r7 = 0
            r18 = r49
            r19 = r50
            r22 = r0
            r20 = r1
            r23 = r2
            r24 = r3
            r1 = r4
            r25 = r5
            r26 = r7
            goto L_0x0324
        L_0x0313:
            r18 = r49
            r19 = r50
            r26 = r58
            r22 = r0
            r20 = r1
            r23 = r2
            r24 = r3
            r1 = r4
            r25 = r5
        L_0x0324:
            r17 = r12
            r21 = r16
            r16 = r59
        L_0x032a:
            r10.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x033c
            java.lang.String r0 = "androidx.compose.material3.RangeSlider (Slider.kt:428)"
            r2 = -1048796133(0xffffffffc17ca41b, float:-15.790065)
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r1, r6, r0)
        L_0x033c:
            if (r26 < 0) goto L_0x03d4
            int r0 = r1 >> 6
            r0 = r0 & 14
            int r2 = r1 << 3
            r3 = r2 & 112(0x70, float:1.57E-43)
            r0 = r0 | r3
            r3 = r2 & 896(0x380, float:1.256E-42)
            r0 = r0 | r3
            r3 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r3
            r3 = r1 & r41
            r0 = r0 | r3
            int r3 = r6 << 9
            r3 = r3 & r42
            r0 = r0 | r3
            r2 = r2 & r43
            r0 = r0 | r2
            r2 = r1 & r44
            r0 = r0 | r2
            r2 = 234881024(0xe000000, float:1.5777218E-30)
            r2 = r2 & r1
            r0 = r0 | r2
            r2 = 1879048192(0x70000000, float:1.58456325E29)
            r1 = r1 & r2
            r27 = r0 | r1
            r0 = r6 & 14
            r1 = r6 & 112(0x70, float:1.57E-43)
            r28 = r0 | r1
            r29 = 0
            r0 = r16
            r1 = r46
            r2 = r47
            r3 = r17
            r4 = r18
            r5 = r26
            r6 = r19
            r7 = r21
            r8 = r22
            r9 = r23
            r30 = r10
            r10 = r24
            r11 = r25
            r12 = r30
            r13 = r27
            r14 = r28
            r15 = r29
            RangeSliderImpl(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x039a
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x039a:
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r11 = r24
            r12 = r25
            r13 = r26
        L_0x03b0:
            androidx.compose.runtime.ScopeUpdateScope r15 = r30.endRestartGroup()
            if (r15 != 0) goto L_0x03b7
            goto L_0x03d3
        L_0x03b7:
            androidx.compose.material3.SliderKt$RangeSlider$12 r17 = new androidx.compose.material3.SliderKt$RangeSlider$12
            r0 = r17
            r1 = r46
            r2 = r47
            r14 = r60
            r45 = r15
            r15 = r61
            r16 = r62
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0 = r17
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1 = r45
            r1.updateScope(r0)
        L_0x03d3:
            return
        L_0x03d4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "steps should be >= 0"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.RangeSlider(kotlin.ranges.ClosedFloatingPointRange, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, kotlin.ranges.ClosedFloatingPointRange, kotlin.jvm.functions.Function0, androidx.compose.material3.SliderColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function3, int, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v18, resolved type: kotlin.jvm.functions.Function3} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void SliderImpl(androidx.compose.ui.Modifier r28, boolean r29, androidx.compose.foundation.interaction.MutableInteractionSource r30, kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r31, kotlin.jvm.functions.Function0<kotlin.Unit> r32, int r33, float r34, kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> r35, kotlin.jvm.functions.Function3<? super androidx.compose.material3.SliderPositions, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r36, kotlin.jvm.functions.Function3<? super androidx.compose.material3.SliderPositions, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r37, androidx.compose.runtime.Composer r38, int r39) {
        /*
            r11 = r29
            r12 = r30
            r13 = r31
            r14 = r32
            r15 = r34
            r10 = r35
            r9 = r36
            r8 = r37
            r7 = r39
            r0 = 851260148(0x32bd32f4, float:2.2025667E-8)
            r1 = r38
            androidx.compose.runtime.Composer r6 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(SliderImpl)P(2!5,8,9)493@22061L74,493@22023L112,499@22161L59,503@22243L45,504@22310L30,512@22682L7,513@22733L57,514@22813L31,518@23040L77,524@23249L492,535@23770L217,558@24427L40,563@24569L2021:Slider.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r6, r1)
            r1 = r7 & 14
            r5 = r28
            if (r1 != 0) goto L_0x0031
            boolean r1 = r6.changed((java.lang.Object) r5)
            if (r1 == 0) goto L_0x002e
            r1 = 4
            goto L_0x002f
        L_0x002e:
            r1 = 2
        L_0x002f:
            r1 = r1 | r7
            goto L_0x0032
        L_0x0031:
            r1 = r7
        L_0x0032:
            r3 = r7 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0042
            boolean r3 = r6.changed((boolean) r11)
            if (r3 == 0) goto L_0x003f
            r3 = 32
            goto L_0x0041
        L_0x003f:
            r3 = 16
        L_0x0041:
            r1 = r1 | r3
        L_0x0042:
            r3 = r7 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x0052
            boolean r3 = r6.changed((java.lang.Object) r12)
            if (r3 == 0) goto L_0x004f
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0051
        L_0x004f:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0051:
            r1 = r1 | r3
        L_0x0052:
            r3 = r7 & 7168(0x1c00, float:1.0045E-41)
            if (r3 != 0) goto L_0x0062
            boolean r3 = r6.changedInstance(r13)
            if (r3 == 0) goto L_0x005f
            r3 = 2048(0x800, float:2.87E-42)
            goto L_0x0061
        L_0x005f:
            r3 = 1024(0x400, float:1.435E-42)
        L_0x0061:
            r1 = r1 | r3
        L_0x0062:
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r7
            if (r3 != 0) goto L_0x0074
            boolean r3 = r6.changedInstance(r14)
            if (r3 == 0) goto L_0x0071
            r3 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0073
        L_0x0071:
            r3 = 8192(0x2000, float:1.14794E-41)
        L_0x0073:
            r1 = r1 | r3
        L_0x0074:
            r3 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r7
            r4 = r33
            if (r3 != 0) goto L_0x0087
            boolean r3 = r6.changed((int) r4)
            if (r3 == 0) goto L_0x0084
            r3 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0086
        L_0x0084:
            r3 = 65536(0x10000, float:9.18355E-41)
        L_0x0086:
            r1 = r1 | r3
        L_0x0087:
            r3 = 3670016(0x380000, float:5.142788E-39)
            r3 = r3 & r7
            if (r3 != 0) goto L_0x0098
            boolean r3 = r6.changed((float) r15)
            if (r3 == 0) goto L_0x0095
            r3 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0097
        L_0x0095:
            r3 = 524288(0x80000, float:7.34684E-40)
        L_0x0097:
            r1 = r1 | r3
        L_0x0098:
            r3 = 29360128(0x1c00000, float:7.052966E-38)
            r3 = r3 & r7
            if (r3 != 0) goto L_0x00a9
            boolean r3 = r6.changed((java.lang.Object) r10)
            if (r3 == 0) goto L_0x00a6
            r3 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00a8
        L_0x00a6:
            r3 = 4194304(0x400000, float:5.877472E-39)
        L_0x00a8:
            r1 = r1 | r3
        L_0x00a9:
            r3 = 234881024(0xe000000, float:1.5777218E-30)
            r3 = r3 & r7
            if (r3 != 0) goto L_0x00ba
            boolean r3 = r6.changedInstance(r9)
            if (r3 == 0) goto L_0x00b7
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x00b9
        L_0x00b7:
            r3 = 33554432(0x2000000, float:9.403955E-38)
        L_0x00b9:
            r1 = r1 | r3
        L_0x00ba:
            r3 = 1879048192(0x70000000, float:1.58456325E29)
            r3 = r3 & r7
            if (r3 != 0) goto L_0x00cb
            boolean r3 = r6.changedInstance(r8)
            if (r3 == 0) goto L_0x00c8
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x00ca
        L_0x00c8:
            r3 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x00ca:
            r1 = r1 | r3
        L_0x00cb:
            r3 = r1
            r1 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r1 = r1 & r3
            r2 = 306783378(0x12492492, float:6.3469493E-28)
            if (r1 != r2) goto L_0x00e5
            boolean r1 = r6.getSkipping()
            if (r1 != 0) goto L_0x00dc
            goto L_0x00e5
        L_0x00dc:
            r6.skipToGroupEnd()
            r1 = r6
            r13 = r8
            r10 = r9
            r2 = r11
            goto L_0x066a
        L_0x00e5:
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x00f2
            r1 = -1
            java.lang.String r2 = "androidx.compose.material3.SliderImpl (Slider.kt:481)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r3, r1, r2)
        L_0x00f2:
            java.lang.Float r0 = java.lang.Float.valueOf(r34)
            r1 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r6.startReplaceableGroup(r1)
            java.lang.String r1 = "CC(remember)P(1,2):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r6, r1)
            boolean r0 = r6.changed((java.lang.Object) r0)
            boolean r1 = r6.changed((java.lang.Object) r13)
            r0 = r0 | r1
            java.lang.Object r1 = r6.rememberedValue()
            if (r0 != 0) goto L_0x0118
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r0 = r0.getEmpty()
            if (r1 != r0) goto L_0x0123
        L_0x0118:
            androidx.compose.material3.SliderKt$SliderImpl$onValueChangeState$1$1 r0 = new androidx.compose.material3.SliderKt$SliderImpl$onValueChangeState$1$1
            r0.<init>(r15, r13)
            r1 = r0
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            r6.updateRememberedValue(r1)
        L_0x0123:
            r6.endReplaceableGroup()
            r2 = 0
            androidx.compose.runtime.State r16 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(r1, r6, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r33)
            r1 = 1157296644(0x44faf204, float:2007.563)
            r6.startReplaceableGroup(r1)
            java.lang.String r1 = "CC(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r6, r1)
            boolean r0 = r6.changed((java.lang.Object) r0)
            java.lang.Object r2 = r6.rememberedValue()
            if (r0 != 0) goto L_0x014c
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r0 = r0.getEmpty()
            if (r2 != r0) goto L_0x0153
        L_0x014c:
            float[] r2 = stepsToTickFractions(r33)
            r6.updateRememberedValue(r2)
        L_0x0153:
            r6.endReplaceableGroup()
            float[] r2 = (float[]) r2
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r6.startReplaceableGroup(r0)
            java.lang.String r0 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r6, r0)
            java.lang.Object r4 = r6.rememberedValue()
            androidx.compose.runtime.Composer$Companion r20 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r5 = r20.getEmpty()
            r9 = 0
            if (r4 != r5) goto L_0x0180
            float r4 = getThumbWidth()
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r5 = 2
            androidx.compose.runtime.MutableState r4 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r4, r9, r5, r9)
            r6.updateRememberedValue(r4)
        L_0x0180:
            r6.endReplaceableGroup()
            r5 = r4
            androidx.compose.runtime.MutableState r5 = (androidx.compose.runtime.MutableState) r5
            r4 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r6.startReplaceableGroup(r4)
            androidx.compose.runtime.ComposerKt.sourceInformation(r6, r0)
            java.lang.Object r4 = r6.rememberedValue()
            androidx.compose.runtime.Composer$Companion r20 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r9 = r20.getEmpty()
            if (r4 != r9) goto L_0x01a9
            r9 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
            r7 = 0
            r9 = 2
            androidx.compose.runtime.MutableState r4 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r4, r7, r9, r7)
            r6.updateRememberedValue(r4)
        L_0x01a9:
            r6.endReplaceableGroup()
            r9 = r4
            androidx.compose.runtime.MutableState r9 = (androidx.compose.runtime.MutableState) r9
            androidx.compose.runtime.ProvidableCompositionLocal r4 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            androidx.compose.runtime.CompositionLocal r4 = (androidx.compose.runtime.CompositionLocal) r4
            r7 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r13 = "CC:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r6, r7, r13)
            java.lang.Object r4 = r6.consume(r4)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r6)
            androidx.compose.ui.unit.LayoutDirection r7 = androidx.compose.ui.unit.LayoutDirection.Rtl
            if (r4 != r7) goto L_0x01cf
            r4 = 1
            r21 = r4
            r4 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            goto L_0x01d4
        L_0x01cf:
            r4 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r21 = 0
        L_0x01d4:
            r6.startReplaceableGroup(r4)
            androidx.compose.runtime.ComposerKt.sourceInformation(r6, r0)
            java.lang.Object r4 = r6.rememberedValue()
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r7 = r7.getEmpty()
            r8 = 0
            if (r4 != r7) goto L_0x01f8
            float r4 = SliderImpl$scaleToOffset(r10, r8, r8, r15)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r7 = 2
            r8 = 0
            androidx.compose.runtime.MutableState r4 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r4, r8, r7, r8)
            r6.updateRememberedValue(r4)
        L_0x01f8:
            r6.endReplaceableGroup()
            r8 = r4
            androidx.compose.runtime.MutableState r8 = (androidx.compose.runtime.MutableState) r8
            r4 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r6.startReplaceableGroup(r4)
            androidx.compose.runtime.ComposerKt.sourceInformation(r6, r0)
            java.lang.Object r4 = r6.rememberedValue()
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r7 = r7.getEmpty()
            if (r4 != r7) goto L_0x0224
            r7 = 0
            java.lang.Float r4 = java.lang.Float.valueOf(r7)
            r38 = r13
            r7 = 2
            r13 = 0
            androidx.compose.runtime.MutableState r4 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r4, r13, r7, r13)
            r6.updateRememberedValue(r4)
            goto L_0x0226
        L_0x0224:
            r38 = r13
        L_0x0226:
            r6.endReplaceableGroup()
            r13 = r4
            androidx.compose.runtime.MutableState r13 = (androidx.compose.runtime.MutableState) r13
            java.lang.Comparable r4 = r35.getStart()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            java.lang.Comparable r7 = r35.getEndInclusive()
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            float r4 = kotlin.ranges.RangesKt.coerceIn((float) r15, (float) r4, (float) r7)
            java.lang.Comparable r7 = r35.getStart()
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            java.lang.Comparable r23 = r35.getEndInclusive()
            java.lang.Number r23 = (java.lang.Number) r23
            float r15 = r23.floatValue()
            float r15 = calcFraction(r7, r15, r4)
            r4 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r6.startReplaceableGroup(r4)
            androidx.compose.runtime.ComposerKt.sourceInformation(r6, r0)
            java.lang.Object r0 = r6.rememberedValue()
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r4 = r4.getEmpty()
            if (r0 != r4) goto L_0x027f
            androidx.compose.material3.SliderPositions r0 = new androidx.compose.material3.SliderPositions
            r4 = 0
            kotlin.ranges.ClosedFloatingPointRange r7 = kotlin.ranges.RangesKt.rangeTo((float) r4, (float) r15)
            r0.<init>(r7, r2)
            r6.updateRememberedValue(r0)
            goto L_0x0280
        L_0x027f:
            r4 = 0
        L_0x0280:
            r6.endReplaceableGroup()
            r7 = r0
            androidx.compose.material3.SliderPositions r7 = (androidx.compose.material3.SliderPositions) r7
            kotlin.ranges.ClosedFloatingPointRange r0 = kotlin.ranges.RangesKt.rangeTo((float) r4, (float) r15)
            r7.setActiveRange$material3_release(r0)
            r7.setTickFractions$material3_release(r2)
            int r19 = r3 >> 21
            r4 = 1157296644(0x44faf204, float:2007.563)
            r6.startReplaceableGroup(r4)
            androidx.compose.runtime.ComposerKt.sourceInformation(r6, r1)
            boolean r0 = r6.changed((java.lang.Object) r10)
            java.lang.Object r4 = r6.rememberedValue()
            if (r0 != 0) goto L_0x02b9
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r0 = r0.getEmpty()
            if (r4 != r0) goto L_0x02ae
            goto L_0x02b9
        L_0x02ae:
            r10 = r1
            r24 = r3
            r25 = r5
            r11 = r6
            r26 = r7
            r17 = r15
            goto L_0x02e8
        L_0x02b9:
            androidx.compose.material3.SliderDraggableState r4 = new androidx.compose.material3.SliderDraggableState
            androidx.compose.material3.SliderKt$SliderImpl$draggableState$1$1 r22 = new androidx.compose.material3.SliderKt$SliderImpl$draggableState$1$1
            r0 = r22
            r10 = r1
            r17 = r15
            r15 = 1157296644(0x44faf204, float:2007.563)
            r1 = r9
            r18 = r2
            r15 = 0
            r2 = r5
            r24 = r3
            r3 = r8
            r15 = r4
            r4 = r13
            r25 = r5
            r5 = r18
            r11 = r6
            r6 = r16
            r26 = r7
            r7 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = r22
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r15.<init>(r0)
            r11.updateRememberedValue(r15)
            r4 = r15
        L_0x02e8:
            r11.endReplaceableGroup()
            r15 = r4
            androidx.compose.material3.SliderDraggableState r15 = (androidx.compose.material3.SliderDraggableState) r15
            androidx.compose.material3.SliderKt$SliderImpl$gestureEndAction$1 r0 = new androidx.compose.material3.SliderKt$SliderImpl$gestureEndAction$1
            r0.<init>(r15, r14)
            r1 = 0
            androidx.compose.runtime.State r7 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(r0, r11, r1)
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            r16 = r15
            androidx.compose.foundation.gestures.DraggableState r16 = (androidx.compose.foundation.gestures.DraggableState) r16
            java.lang.Object r1 = r9.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            int r3 = r1.intValue()
            r5 = r8
            androidx.compose.runtime.State r5 = (androidx.compose.runtime.State) r5
            r1 = r16
            r2 = r30
            r4 = r21
            r6 = r7
            r8 = r7
            r7 = r13
            r13 = r37
            r18 = r9
            r9 = r8
            r8 = r29
            androidx.compose.ui.Modifier r8 = sliderTapModifier(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.foundation.gestures.Orientation r2 = androidx.compose.foundation.gestures.Orientation.Horizontal
            boolean r5 = r15.isDragging()
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            r6 = 0
            r1 = 1157296644(0x44faf204, float:2007.563)
            r11.startReplaceableGroup(r1)
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r10)
            boolean r1 = r11.changed((java.lang.Object) r9)
            java.lang.Object r3 = r11.rememberedValue()
            if (r1 != 0) goto L_0x0347
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r3 != r1) goto L_0x0353
        L_0x0347:
            androidx.compose.material3.SliderKt$SliderImpl$drag$1$1 r1 = new androidx.compose.material3.SliderKt$SliderImpl$drag$1$1
            r3 = 0
            r1.<init>(r9, r3)
            r3 = r1
            kotlin.jvm.functions.Function3 r3 = (kotlin.jvm.functions.Function3) r3
            r11.updateRememberedValue(r3)
        L_0x0353:
            r11.endReplaceableGroup()
            r7 = r3
            kotlin.jvm.functions.Function3 r7 = (kotlin.jvm.functions.Function3) r7
            r9 = 32
            r10 = 0
            r1 = r16
            r3 = r29
            r4 = r30
            r15 = r8
            r8 = r21
            r27 = r18
            androidx.compose.ui.Modifier r7 = androidx.compose.foundation.gestures.DraggableKt.draggable$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            androidx.compose.ui.Modifier r0 = androidx.compose.material3.InteractiveComponentSizeKt.minimumInteractiveComponentSize(r28)
            androidx.compose.material3.tokens.SliderTokens r1 = androidx.compose.material3.tokens.SliderTokens.INSTANCE
            float r1 = r1.m2296getHandleWidthD9Ej5fM()
            androidx.compose.material3.tokens.SliderTokens r2 = androidx.compose.material3.tokens.SliderTokens.INSTANCE
            float r2 = r2.m2295getHandleHeightD9Ej5fM()
            r3 = 0
            r4 = 0
            r5 = 12
            r6 = 0
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.m559requiredSizeInqDBjuR0$default(r0, r1, r2, r3, r4, r5, r6)
            r1 = r34
            r2 = r29
            r3 = r31
            r4 = r32
            r5 = r35
            r6 = r33
            androidx.compose.ui.Modifier r0 = sliderSemantics(r0, r1, r2, r3, r4, r5, r6)
            r1 = r11
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.FocusableKt.focusable(r0, r2, r12)
            androidx.compose.ui.Modifier r0 = r0.then(r15)
            androidx.compose.ui.Modifier r0 = r0.then(r7)
            androidx.compose.material3.SliderKt$SliderImpl$2 r3 = new androidx.compose.material3.SliderKt$SliderImpl$2
            r6 = r17
            r4 = r25
            r5 = r27
            r3.<init>(r4, r5, r6)
            androidx.compose.ui.layout.MeasurePolicy r3 = (androidx.compose.ui.layout.MeasurePolicy) r3
            r4 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1.startReplaceableGroup(r4)
            java.lang.String r5 = "CC(Layout)P(!1,2)73@2855L7,74@2910L7,75@2969L7,76@2981L460:Layout.kt#80mrfh"
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r5)
            androidx.compose.runtime.ProvidableCompositionLocal r5 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r5 = (androidx.compose.runtime.CompositionLocal) r5
            r6 = r38
            r7 = 2023513938(0x789c5f52, float:2.5372864E34)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r1, r7, r6)
            java.lang.Object r5 = r1.consume(r5)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r1)
            androidx.compose.ui.unit.Density r5 = (androidx.compose.ui.unit.Density) r5
            androidx.compose.runtime.ProvidableCompositionLocal r8 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            androidx.compose.runtime.CompositionLocal r8 = (androidx.compose.runtime.CompositionLocal) r8
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r1, r7, r6)
            java.lang.Object r8 = r1.consume(r8)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r1)
            androidx.compose.ui.unit.LayoutDirection r8 = (androidx.compose.ui.unit.LayoutDirection) r8
            androidx.compose.runtime.ProvidableCompositionLocal r9 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            androidx.compose.runtime.CompositionLocal r9 = (androidx.compose.runtime.CompositionLocal) r9
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r1, r7, r6)
            java.lang.Object r6 = r1.consume(r9)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r1)
            androidx.compose.ui.platform.ViewConfiguration r6 = (androidx.compose.ui.platform.ViewConfiguration) r6
            androidx.compose.ui.node.ComposeUiNode$Companion r9 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function0 r9 = r9.getConstructor()
            kotlin.jvm.functions.Function3 r0 = androidx.compose.ui.layout.LayoutKt.materializerOf(r0)
            androidx.compose.runtime.Applier r10 = r1.getApplier()
            boolean r10 = r10 instanceof androidx.compose.runtime.Applier
            if (r10 != 0) goto L_0x0409
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x0409:
            r1.startReusableNode()
            boolean r10 = r1.getInserting()
            if (r10 == 0) goto L_0x0416
            r1.createNode(r9)
            goto L_0x0419
        L_0x0416:
            r1.useNode()
        L_0x0419:
            androidx.compose.runtime.Composer r9 = androidx.compose.runtime.Updater.m2444constructorimpl(r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r10 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r10 = r10.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r9, r3, r10)
            androidx.compose.ui.node.ComposeUiNode$Companion r3 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r3 = r3.getSetDensity()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r9, r5, r3)
            androidx.compose.ui.node.ComposeUiNode$Companion r3 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r3 = r3.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r9, r8, r3)
            androidx.compose.ui.node.ComposeUiNode$Companion r3 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r3 = r3.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r9, r6, r3)
            androidx.compose.runtime.Composer r3 = androidx.compose.runtime.SkippableUpdater.m2436constructorimpl(r1)
            androidx.compose.runtime.SkippableUpdater r3 = androidx.compose.runtime.SkippableUpdater.m2435boximpl(r3)
            r5 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r0.invoke(r3, r1, r6)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r1.startReplaceableGroup(r0)
            r3 = 1541256180(0x5bddb3f4, float:1.24807661E17)
            java.lang.String r5 = "C565@24599L84,566@24696L84:Slider.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r1, r3, r5)
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r3 = (androidx.compose.ui.Modifier) r3
            androidx.compose.material3.SliderComponents r5 = androidx.compose.material3.SliderComponents.THUMB
            androidx.compose.ui.Modifier r3 = androidx.compose.ui.layout.LayoutIdKt.layoutId(r3, r5)
            r5 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r1.startReplaceableGroup(r5)
            java.lang.String r6 = "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r6)
            androidx.compose.ui.Alignment$Companion r8 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment r8 = r8.getTopStart()
            r9 = 0
            androidx.compose.ui.layout.MeasurePolicy r8 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(r8, r9, r1, r9)
            r1.startReplaceableGroup(r4)
            java.lang.String r9 = "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh"
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r9)
            androidx.compose.runtime.ProvidableCompositionLocal r10 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r10 = (androidx.compose.runtime.CompositionLocal) r10
            java.lang.String r11 = "C:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r1, r7, r11)
            java.lang.Object r10 = r1.consume(r10)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r1)
            androidx.compose.ui.unit.Density r10 = (androidx.compose.ui.unit.Density) r10
            androidx.compose.runtime.ProvidableCompositionLocal r15 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            androidx.compose.runtime.CompositionLocal r15 = (androidx.compose.runtime.CompositionLocal) r15
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r1, r7, r11)
            java.lang.Object r15 = r1.consume(r15)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r1)
            androidx.compose.ui.unit.LayoutDirection r15 = (androidx.compose.ui.unit.LayoutDirection) r15
            androidx.compose.runtime.ProvidableCompositionLocal r16 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            r4 = r16
            androidx.compose.runtime.CompositionLocal r4 = (androidx.compose.runtime.CompositionLocal) r4
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r1, r7, r11)
            java.lang.Object r4 = r1.consume(r4)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r1)
            androidx.compose.ui.platform.ViewConfiguration r4 = (androidx.compose.ui.platform.ViewConfiguration) r4
            androidx.compose.ui.node.ComposeUiNode$Companion r16 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function0 r7 = r16.getConstructor()
            kotlin.jvm.functions.Function3 r3 = androidx.compose.ui.layout.LayoutKt.materializerOf(r3)
            androidx.compose.runtime.Applier r5 = r1.getApplier()
            boolean r5 = r5 instanceof androidx.compose.runtime.Applier
            if (r5 != 0) goto L_0x04d6
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x04d6:
            r1.startReusableNode()
            boolean r5 = r1.getInserting()
            if (r5 == 0) goto L_0x04e3
            r1.createNode(r7)
            goto L_0x04e6
        L_0x04e3:
            r1.useNode()
        L_0x04e6:
            r1.disableReusing()
            androidx.compose.runtime.Composer r5 = androidx.compose.runtime.Updater.m2444constructorimpl(r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r7 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r7 = r7.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r5, r8, r7)
            androidx.compose.ui.node.ComposeUiNode$Companion r7 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r7 = r7.getSetDensity()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r5, r10, r7)
            androidx.compose.ui.node.ComposeUiNode$Companion r7 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r7 = r7.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r5, r15, r7)
            androidx.compose.ui.node.ComposeUiNode$Companion r7 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r7 = r7.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r5, r4, r7)
            r1.enableReusing()
            androidx.compose.runtime.Composer r4 = androidx.compose.runtime.SkippableUpdater.m2436constructorimpl(r1)
            androidx.compose.runtime.SkippableUpdater r4 = androidx.compose.runtime.SkippableUpdater.m2435boximpl(r4)
            r5 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r3.invoke(r4, r1, r7)
            r1.startReplaceableGroup(r0)
            r3 = -1253629305(0xffffffffb5472287, float:-7.418352E-7)
            java.lang.String r4 = "C72@3384L9:Box.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r1, r3, r4)
            androidx.compose.foundation.layout.BoxScopeInstance r5 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE
            androidx.compose.foundation.layout.BoxScope r5 = (androidx.compose.foundation.layout.BoxScope) r5
            r5 = -1819487535(0xffffffff938cd2d1, float:-3.554885E-27)
            java.lang.String r7 = "C565@24659L22:Slider.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r1, r5, r7)
            r5 = r19 & 112(0x70, float:1.57E-43)
            r5 = r5 | 6
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r10 = r36
            r7 = r26
            r10.invoke(r7, r1, r5)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r1)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r1)
            r1.endReplaceableGroup()
            r1.endNode()
            r1.endReplaceableGroup()
            r1.endReplaceableGroup()
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r5 = (androidx.compose.ui.Modifier) r5
            androidx.compose.material3.SliderComponents r8 = androidx.compose.material3.SliderComponents.TRACK
            androidx.compose.ui.Modifier r5 = androidx.compose.ui.layout.LayoutIdKt.layoutId(r5, r8)
            r8 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r1.startReplaceableGroup(r8)
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r6)
            androidx.compose.ui.Alignment$Companion r6 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment r6 = r6.getTopStart()
            r8 = 0
            androidx.compose.ui.layout.MeasurePolicy r6 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(r6, r8, r1, r8)
            r8 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1.startReplaceableGroup(r8)
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r9)
            androidx.compose.runtime.ProvidableCompositionLocal r8 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r8 = (androidx.compose.runtime.CompositionLocal) r8
            r9 = 2023513938(0x789c5f52, float:2.5372864E34)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r1, r9, r11)
            java.lang.Object r8 = r1.consume(r8)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r1)
            androidx.compose.ui.unit.Density r8 = (androidx.compose.ui.unit.Density) r8
            androidx.compose.runtime.ProvidableCompositionLocal r15 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            androidx.compose.runtime.CompositionLocal r15 = (androidx.compose.runtime.CompositionLocal) r15
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r1, r9, r11)
            java.lang.Object r15 = r1.consume(r15)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r1)
            androidx.compose.ui.unit.LayoutDirection r15 = (androidx.compose.ui.unit.LayoutDirection) r15
            androidx.compose.runtime.ProvidableCompositionLocal r16 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            r3 = r16
            androidx.compose.runtime.CompositionLocal r3 = (androidx.compose.runtime.CompositionLocal) r3
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r1, r9, r11)
            java.lang.Object r3 = r1.consume(r3)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r1)
            androidx.compose.ui.platform.ViewConfiguration r3 = (androidx.compose.ui.platform.ViewConfiguration) r3
            androidx.compose.ui.node.ComposeUiNode$Companion r9 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function0 r9 = r9.getConstructor()
            kotlin.jvm.functions.Function3 r5 = androidx.compose.ui.layout.LayoutKt.materializerOf(r5)
            androidx.compose.runtime.Applier r11 = r1.getApplier()
            boolean r11 = r11 instanceof androidx.compose.runtime.Applier
            if (r11 != 0) goto L_0x05d3
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x05d3:
            r1.startReusableNode()
            boolean r11 = r1.getInserting()
            if (r11 == 0) goto L_0x05e0
            r1.createNode(r9)
            goto L_0x05e3
        L_0x05e0:
            r1.useNode()
        L_0x05e3:
            r1.disableReusing()
            androidx.compose.runtime.Composer r9 = androidx.compose.runtime.Updater.m2444constructorimpl(r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r11 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r11 = r11.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r9, r6, r11)
            androidx.compose.ui.node.ComposeUiNode$Companion r6 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r6 = r6.getSetDensity()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r9, r8, r6)
            androidx.compose.ui.node.ComposeUiNode$Companion r6 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r6 = r6.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r9, r15, r6)
            androidx.compose.ui.node.ComposeUiNode$Companion r6 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r6 = r6.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r9, r3, r6)
            r1.enableReusing()
            androidx.compose.runtime.Composer r3 = androidx.compose.runtime.SkippableUpdater.m2436constructorimpl(r1)
            androidx.compose.runtime.SkippableUpdater r3 = androidx.compose.runtime.SkippableUpdater.m2435boximpl(r3)
            r6 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5.invoke(r3, r1, r6)
            r1.startReplaceableGroup(r0)
            r0 = -1253629305(0xffffffffb5472287, float:-7.418352E-7)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r1, r0, r4)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE
            androidx.compose.foundation.layout.BoxScope r0 = (androidx.compose.foundation.layout.BoxScope) r0
            r0 = -1819487438(0xffffffff938cd332, float:-3.5549223E-27)
            java.lang.String r3 = "C566@24756L22:Slider.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r1, r0, r3)
            int r0 = r24 >> 24
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | 6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r13.invoke(r7, r1, r0)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r1)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r1)
            r1.endReplaceableGroup()
            r1.endNode()
            r1.endReplaceableGroup()
            r1.endReplaceableGroup()
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r1)
            r1.endReplaceableGroup()
            r1.endNode()
            r1.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x066a
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x066a:
            androidx.compose.runtime.ScopeUpdateScope r15 = r1.endRestartGroup()
            if (r15 != 0) goto L_0x0671
            goto L_0x0695
        L_0x0671:
            androidx.compose.material3.SliderKt$SliderImpl$3 r16 = new androidx.compose.material3.SliderKt$SliderImpl$3
            r0 = r16
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r31
            r5 = r32
            r6 = r33
            r7 = r34
            r8 = r35
            r9 = r36
            r10 = r37
            r11 = r39
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = r16
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r15.updateScope(r0)
        L_0x0695:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.SliderImpl(androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, int, float, kotlin.ranges.ClosedFloatingPointRange, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int):void");
    }

    /* access modifiers changed from: private */
    public static final float SliderImpl$scaleToUserValue(ClosedFloatingPointRange<Float> closedFloatingPointRange, float f, float f2, float f3) {
        return scale(f, f2, f3, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
    }

    /* access modifiers changed from: private */
    public static final float SliderImpl$scaleToOffset(ClosedFloatingPointRange<Float> closedFloatingPointRange, float f, float f2, float f3) {
        return scale(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), f3, f, f2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: kotlin.jvm.functions.Function1} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x01be, code lost:
        if (r5 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L_0x01c3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x09b6  */
    /* JADX WARNING: Removed duplicated region for block: B:235:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void RangeSliderImpl(androidx.compose.ui.Modifier r35, kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> r36, kotlin.jvm.functions.Function1<? super kotlin.ranges.ClosedFloatingPointRange<java.lang.Float>, kotlin.Unit> r37, boolean r38, kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> r39, int r40, kotlin.jvm.functions.Function0<kotlin.Unit> r41, androidx.compose.foundation.interaction.MutableInteractionSource r42, androidx.compose.foundation.interaction.MutableInteractionSource r43, kotlin.jvm.functions.Function3<? super androidx.compose.material3.SliderPositions, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r44, kotlin.jvm.functions.Function3<? super androidx.compose.material3.SliderPositions, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r45, kotlin.jvm.functions.Function3<? super androidx.compose.material3.SliderPositions, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r46, androidx.compose.runtime.Composer r47, int r48, int r49, int r50) {
        /*
            r11 = r36
            r12 = r37
            r13 = r38
            r14 = r41
            r15 = r42
            r10 = r43
            r9 = r44
            r8 = r45
            r7 = r46
            r6 = r48
            r5 = r50
            r0 = 2067530570(0x7b3c034a, float:9.762185E35)
            r1 = r47
            androidx.compose.runtime.Composer r4 = r1.startRestartGroup(r0)
            java.lang.String r0 = "C(RangeSliderImpl)P(3,10,4!1,11,8,5,6!1,7)641@27264L74,641@27200L138,647@27364L59,651@27452L45,652@27523L45,653@27591L30,655@27660L7,665@28240L34,666@28300L31,667@28355L31,669@28455L47,669@28415L87,673@28521L1112,718@30413L133,733@30914L73,741@31182L75,747@31395L35,748@31463L33,750@31502L4199:Slider.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r4, r0)
            r0 = r5 & 1
            if (r0 == 0) goto L_0x002d
            r0 = r6 | 6
            r3 = r35
            goto L_0x003f
        L_0x002d:
            r0 = r6 & 14
            r3 = r35
            if (r0 != 0) goto L_0x003e
            boolean r0 = r4.changed((java.lang.Object) r3)
            if (r0 == 0) goto L_0x003b
            r0 = 4
            goto L_0x003c
        L_0x003b:
            r0 = 2
        L_0x003c:
            r0 = r0 | r6
            goto L_0x003f
        L_0x003e:
            r0 = r6
        L_0x003f:
            r16 = r5 & 2
            r17 = 32
            r18 = 16
            if (r16 == 0) goto L_0x004a
            r0 = r0 | 48
            goto L_0x005b
        L_0x004a:
            r16 = r6 & 112(0x70, float:1.57E-43)
            if (r16 != 0) goto L_0x005b
            boolean r16 = r4.changed((java.lang.Object) r11)
            if (r16 == 0) goto L_0x0057
            r16 = r17
            goto L_0x0059
        L_0x0057:
            r16 = r18
        L_0x0059:
            r0 = r0 | r16
        L_0x005b:
            r16 = r5 & 4
            if (r16 == 0) goto L_0x0062
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x0072
        L_0x0062:
            r1 = r6 & 896(0x380, float:1.256E-42)
            if (r1 != 0) goto L_0x0072
            boolean r1 = r4.changedInstance(r12)
            if (r1 == 0) goto L_0x006f
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x0071
        L_0x006f:
            r1 = 128(0x80, float:1.794E-43)
        L_0x0071:
            r0 = r0 | r1
        L_0x0072:
            r1 = r5 & 8
            if (r1 == 0) goto L_0x0079
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x0089
        L_0x0079:
            r1 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r1 != 0) goto L_0x0089
            boolean r1 = r4.changed((boolean) r13)
            if (r1 == 0) goto L_0x0086
            r1 = 2048(0x800, float:2.87E-42)
            goto L_0x0088
        L_0x0086:
            r1 = 1024(0x400, float:1.435E-42)
        L_0x0088:
            r0 = r0 | r1
        L_0x0089:
            r1 = r5 & 16
            if (r1 == 0) goto L_0x0090
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a6
        L_0x0090:
            r1 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r6
            if (r1 != 0) goto L_0x00a6
            r1 = r39
            boolean r16 = r4.changed((java.lang.Object) r1)
            if (r16 == 0) goto L_0x00a1
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a3
        L_0x00a1:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x00a3:
            r0 = r0 | r16
            goto L_0x00a8
        L_0x00a6:
            r1 = r39
        L_0x00a8:
            r16 = r5 & 32
            if (r16 == 0) goto L_0x00b3
            r19 = 196608(0x30000, float:2.75506E-40)
            r0 = r0 | r19
            r2 = r40
            goto L_0x00c8
        L_0x00b3:
            r19 = 458752(0x70000, float:6.42848E-40)
            r19 = r6 & r19
            r2 = r40
            if (r19 != 0) goto L_0x00c8
            boolean r20 = r4.changed((int) r2)
            if (r20 == 0) goto L_0x00c4
            r20 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c6
        L_0x00c4:
            r20 = 65536(0x10000, float:9.18355E-41)
        L_0x00c6:
            r0 = r0 | r20
        L_0x00c8:
            r20 = r5 & 64
            if (r20 == 0) goto L_0x00d1
            r20 = 1572864(0x180000, float:2.204052E-39)
        L_0x00ce:
            r0 = r0 | r20
            goto L_0x00e3
        L_0x00d1:
            r20 = 3670016(0x380000, float:5.142788E-39)
            r20 = r6 & r20
            if (r20 != 0) goto L_0x00e3
            boolean r20 = r4.changedInstance(r14)
            if (r20 == 0) goto L_0x00e0
            r20 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ce
        L_0x00e0:
            r20 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00ce
        L_0x00e3:
            r1 = r5 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x00eb
            r1 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x00e9:
            r0 = r0 | r1
            goto L_0x00fc
        L_0x00eb:
            r1 = 29360128(0x1c00000, float:7.052966E-38)
            r1 = r1 & r6
            if (r1 != 0) goto L_0x00fc
            boolean r1 = r4.changed((java.lang.Object) r15)
            if (r1 == 0) goto L_0x00f9
            r1 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e9
        L_0x00f9:
            r1 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x00e9
        L_0x00fc:
            r1 = r5 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0104
            r1 = 100663296(0x6000000, float:2.4074124E-35)
        L_0x0102:
            r0 = r0 | r1
            goto L_0x0115
        L_0x0104:
            r1 = 234881024(0xe000000, float:1.5777218E-30)
            r1 = r1 & r6
            if (r1 != 0) goto L_0x0115
            boolean r1 = r4.changed((java.lang.Object) r10)
            if (r1 == 0) goto L_0x0112
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0102
        L_0x0112:
            r1 = 33554432(0x2000000, float:9.403955E-38)
            goto L_0x0102
        L_0x0115:
            r1 = r5 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x011d
            r1 = 805306368(0x30000000, float:4.656613E-10)
        L_0x011b:
            r0 = r0 | r1
            goto L_0x012e
        L_0x011d:
            r1 = 1879048192(0x70000000, float:1.58456325E29)
            r1 = r1 & r6
            if (r1 != 0) goto L_0x012e
            boolean r1 = r4.changedInstance(r9)
            if (r1 == 0) goto L_0x012b
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x011b
        L_0x012b:
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x011b
        L_0x012e:
            r1 = r0
            r0 = r5 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0136
            r0 = r49 | 6
            goto L_0x0148
        L_0x0136:
            r0 = r49 & 14
            if (r0 != 0) goto L_0x0146
            boolean r0 = r4.changedInstance(r8)
            if (r0 == 0) goto L_0x0142
            r0 = 4
            goto L_0x0143
        L_0x0142:
            r0 = 2
        L_0x0143:
            r0 = r49 | r0
            goto L_0x0148
        L_0x0146:
            r0 = r49
        L_0x0148:
            r2 = r5 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L_0x014f
            r0 = r0 | 48
            goto L_0x015e
        L_0x014f:
            r2 = r49 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x015e
            boolean r2 = r4.changedInstance(r7)
            if (r2 == 0) goto L_0x015a
            goto L_0x015c
        L_0x015a:
            r17 = r18
        L_0x015c:
            r0 = r0 | r17
        L_0x015e:
            r2 = r0
            r0 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r0 = r0 & r1
            r3 = 306783378(0x12492492, float:6.3469493E-28)
            if (r0 != r3) goto L_0x0186
            r0 = r2 & 91
            r3 = 18
            if (r0 != r3) goto L_0x0186
            boolean r0 = r4.getSkipping()
            if (r0 != 0) goto L_0x0175
            goto L_0x0186
        L_0x0175:
            r4.skipToGroupEnd()
            r6 = r40
            r11 = r4
            r12 = r8
            r5 = r13
            r8 = r15
            r13 = r7
            r34 = r10
            r10 = r9
            r9 = r34
            goto L_0x09af
        L_0x0186:
            if (r16 == 0) goto L_0x018a
            r0 = 0
            goto L_0x018c
        L_0x018a:
            r0 = r40
        L_0x018c:
            boolean r16 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r16 == 0) goto L_0x019b
            r3 = 2067530570(0x7b3c034a, float:9.762185E35)
            java.lang.String r5 = "androidx.compose.material3.RangeSliderImpl (Slider.kt:627)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r1, r2, r5)
        L_0x019b:
            r5 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r4.startReplaceableGroup(r5)
            java.lang.String r3 = "CC(remember)P(1,2):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r4, r3)
            boolean r16 = r4.changed((java.lang.Object) r11)
            boolean r17 = r4.changed((java.lang.Object) r12)
            r16 = r16 | r17
            java.lang.Object r5 = r4.rememberedValue()
            if (r16 != 0) goto L_0x01c1
            androidx.compose.runtime.Composer$Companion r16 = androidx.compose.runtime.Composer.Companion
            r17 = r1
            java.lang.Object r1 = r16.getEmpty()
            if (r5 != r1) goto L_0x01ce
            goto L_0x01c3
        L_0x01c1:
            r17 = r1
        L_0x01c3:
            androidx.compose.material3.SliderKt$RangeSliderImpl$onValueChangeState$1$1 r1 = new androidx.compose.material3.SliderKt$RangeSliderImpl$onValueChangeState$1$1
            r1.<init>(r11, r12)
            r5 = r1
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            r4.updateRememberedValue(r5)
        L_0x01ce:
            r4.endReplaceableGroup()
            r1 = 0
            androidx.compose.runtime.State r5 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(r5, r4, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r11 = 1157296644(0x44faf204, float:2007.563)
            r4.startReplaceableGroup(r11)
            java.lang.String r11 = "CC(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r4, r11)
            boolean r1 = r4.changed((java.lang.Object) r1)
            r18 = r2
            java.lang.Object r2 = r4.rememberedValue()
            if (r1 != 0) goto L_0x01f9
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r2 != r1) goto L_0x0200
        L_0x01f9:
            float[] r2 = stepsToTickFractions(r0)
            r4.updateRememberedValue(r2)
        L_0x0200:
            r4.endReplaceableGroup()
            float[] r2 = (float[]) r2
            r1 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r4.startReplaceableGroup(r1)
            java.lang.String r1 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r4, r1)
            r21 = r0
            java.lang.Object r0 = r4.rememberedValue()
            androidx.compose.runtime.Composer$Companion r22 = androidx.compose.runtime.Composer.Companion
            r23 = r2
            java.lang.Object r2 = r22.getEmpty()
            r22 = r3
            r3 = 0
            if (r0 != r2) goto L_0x0233
            float r0 = getThumbWidth()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r2 = 2
            androidx.compose.runtime.MutableState r0 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r0, r3, r2, r3)
            r4.updateRememberedValue(r0)
        L_0x0233:
            r4.endReplaceableGroup()
            r24 = r0
            androidx.compose.runtime.MutableState r24 = (androidx.compose.runtime.MutableState) r24
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r4.startReplaceableGroup(r0)
            androidx.compose.runtime.ComposerKt.sourceInformation(r4, r1)
            java.lang.Object r0 = r4.rememberedValue()
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r0 != r2) goto L_0x025f
            float r0 = getThumbWidth()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r2 = 2
            androidx.compose.runtime.MutableState r0 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r0, r3, r2, r3)
            r4.updateRememberedValue(r0)
        L_0x025f:
            r4.endReplaceableGroup()
            r25 = r0
            androidx.compose.runtime.MutableState r25 = (androidx.compose.runtime.MutableState) r25
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r4.startReplaceableGroup(r0)
            androidx.compose.runtime.ComposerKt.sourceInformation(r4, r1)
            java.lang.Object r0 = r4.rememberedValue()
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r0 != r2) goto L_0x0288
            r2 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r2 = 2
            androidx.compose.runtime.MutableState r0 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r0, r3, r2, r3)
            r4.updateRememberedValue(r0)
        L_0x0288:
            r4.endReplaceableGroup()
            r26 = r0
            androidx.compose.runtime.MutableState r26 = (androidx.compose.runtime.MutableState) r26
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            androidx.compose.runtime.CompositionLocal r0 = (androidx.compose.runtime.CompositionLocal) r0
            r2 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r3 = "CC:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r4, r2, r3)
            java.lang.Object r0 = r4.consume(r0)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r4)
            androidx.compose.ui.unit.LayoutDirection r2 = androidx.compose.ui.unit.LayoutDirection.Rtl
            if (r0 != r2) goto L_0x02ab
            r29 = 1
            goto L_0x02ad
        L_0x02ab:
            r29 = 0
        L_0x02ad:
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r4.startReplaceableGroup(r0)
            androidx.compose.runtime.ComposerKt.sourceInformation(r4, r1)
            java.lang.Object r0 = r4.rememberedValue()
            androidx.compose.runtime.Composer$Companion r30 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r12 = r30.getEmpty()
            if (r0 != r12) goto L_0x02d8
            r12 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)
            r30 = r3
            r3 = 0
            r12 = 2
            androidx.compose.runtime.MutableState r0 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r0, r3, r12, r3)
            r4.updateRememberedValue(r0)
            goto L_0x02da
        L_0x02d8:
            r30 = r3
        L_0x02da:
            r4.endReplaceableGroup()
            r2.element = r0
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r4.startReplaceableGroup(r0)
            androidx.compose.runtime.ComposerKt.sourceInformation(r4, r1)
            java.lang.Object r0 = r4.rememberedValue()
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r3 = r3.getEmpty()
            if (r0 != r3) goto L_0x0302
            r0 = 0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r3 = 2
            r12 = 0
            androidx.compose.runtime.MutableState r0 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r0, r12, r3, r12)
            r4.updateRememberedValue(r0)
        L_0x0302:
            r4.endReplaceableGroup()
            r12 = r0
            androidx.compose.runtime.MutableState r12 = (androidx.compose.runtime.MutableState) r12
            r3 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r4.startReplaceableGroup(r3)
            androidx.compose.runtime.ComposerKt.sourceInformation(r4, r1)
            java.lang.Object r0 = r4.rememberedValue()
            androidx.compose.runtime.Composer$Companion r20 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r3 = r20.getEmpty()
            if (r0 != r3) goto L_0x032e
            r0 = 0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r19 = r1
            r1 = 0
            r3 = 2
            androidx.compose.runtime.MutableState r0 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r0, r1, r3, r1)
            r4.updateRememberedValue(r0)
            goto L_0x0330
        L_0x032e:
            r19 = r1
        L_0x0330:
            r4.endReplaceableGroup()
            r20 = r0
            androidx.compose.runtime.MutableState r20 = (androidx.compose.runtime.MutableState) r20
            r0 = 1157296644(0x44faf204, float:2007.563)
            r4.startReplaceableGroup(r0)
            androidx.compose.runtime.ComposerKt.sourceInformation(r4, r11)
            boolean r0 = r4.changed((java.lang.Object) r14)
            java.lang.Object r1 = r4.rememberedValue()
            if (r0 != 0) goto L_0x0352
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r0 = r0.getEmpty()
            if (r1 != r0) goto L_0x035d
        L_0x0352:
            androidx.compose.material3.SliderKt$RangeSliderImpl$gestureEndAction$1$1 r0 = new androidx.compose.material3.SliderKt$RangeSliderImpl$gestureEndAction$1$1
            r0.<init>(r14)
            r1 = r0
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            r4.updateRememberedValue(r1)
        L_0x035d:
            r4.endReplaceableGroup()
            r3 = 0
            androidx.compose.runtime.State r27 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(r1, r4, r3)
            androidx.compose.material3.SliderKt$RangeSliderImpl$onDrag$1 r1 = new androidx.compose.material3.SliderKt$RangeSliderImpl$onDrag$1
            r14 = r21
            r0 = r1
            r10 = r1
            r13 = r19
            r15 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r1 = r12
            r19 = r2
            r2 = r20
            r15 = r3
            r31 = r22
            r32 = r30
            r3 = r36
            r47 = r11
            r11 = r4
            r4 = r23
            r40 = r5
            r6 = r26
            r7 = r25
            r8 = r24
            r9 = r39
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            androidx.compose.runtime.State r10 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(r10, r11, r15)
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            r3 = r12
            androidx.compose.runtime.State r3 = (androidx.compose.runtime.State) r3
            r4 = r20
            androidx.compose.runtime.State r4 = (androidx.compose.runtime.State) r4
            int r7 = RangeSliderImpl$lambda$31(r26)
            r1 = r42
            r2 = r43
            r5 = r38
            r6 = r29
            r8 = r39
            r9 = r27
            androidx.compose.ui.Modifier r7 = rangeSliderPressDragModifier(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Comparable r0 = r36.getStart()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            java.lang.Comparable r1 = r39.getStart()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            java.lang.Comparable r2 = r36.getEndInclusive()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r8 = kotlin.ranges.RangesKt.coerceIn((float) r0, (float) r1, (float) r2)
            java.lang.Comparable r0 = r36.getEndInclusive()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            java.lang.Comparable r1 = r36.getStart()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            java.lang.Comparable r2 = r39.getEndInclusive()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r9 = kotlin.ranges.RangesKt.coerceIn((float) r0, (float) r1, (float) r2)
            java.lang.Comparable r0 = r39.getStart()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            java.lang.Comparable r1 = r39.getEndInclusive()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r10 = calcFraction(r0, r1, r8)
            java.lang.Comparable r0 = r39.getStart()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            java.lang.Comparable r1 = r39.getEndInclusive()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r6 = calcFraction(r0, r1, r9)
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r11.startReplaceableGroup(r0)
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r13)
            java.lang.Object r0 = r11.rememberedValue()
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r0 != r1) goto L_0x0449
            androidx.compose.material3.SliderPositions r0 = new androidx.compose.material3.SliderPositions
            kotlin.ranges.ClosedFloatingPointRange r1 = kotlin.ranges.RangesKt.rangeTo((float) r10, (float) r6)
            r2 = r23
            r0.<init>(r1, r2)
            r11.updateRememberedValue(r0)
            goto L_0x044b
        L_0x0449:
            r2 = r23
        L_0x044b:
            r11.endReplaceableGroup()
            r13 = r0
            androidx.compose.material3.SliderPositions r13 = (androidx.compose.material3.SliderPositions) r13
            kotlin.ranges.ClosedFloatingPointRange r0 = kotlin.ranges.RangesKt.rangeTo((float) r10, (float) r6)
            r13.setActiveRange$material3_release(r0)
            r13.setTickFractions$material3_release(r2)
            float r0 = (float) r14
            float r1 = r0 * r6
            double r1 = (double) r1
            double r1 = java.lang.Math.floor(r1)
            float r1 = (float) r1
            int r5 = (int) r1
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r10
            float r0 = r0 * r1
            double r0 = (double) r0
            double r0 = java.lang.Math.floor(r0)
            float r0 = (float) r0
            int r4 = (int) r0
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            java.lang.Float r1 = java.lang.Float.valueOf(r9)
            r3 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r11.startReplaceableGroup(r3)
            r2 = r31
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r2)
            r15 = r40
            boolean r22 = r11.changed((java.lang.Object) r15)
            boolean r1 = r11.changed((java.lang.Object) r1)
            r1 = r22 | r1
            java.lang.Object r3 = r11.rememberedValue()
            if (r1 != 0) goto L_0x049d
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r3 != r1) goto L_0x04a8
        L_0x049d:
            androidx.compose.material3.SliderKt$RangeSliderImpl$startThumbSemantics$1$1 r1 = new androidx.compose.material3.SliderKt$RangeSliderImpl$startThumbSemantics$1$1
            r1.<init>(r15, r9)
            r3 = r1
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            r11.updateRememberedValue(r3)
        L_0x04a8:
            r11.endReplaceableGroup()
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            java.lang.Comparable r1 = r39.getStart()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            kotlin.ranges.ClosedFloatingPointRange r22 = kotlin.ranges.RangesKt.rangeTo((float) r1, (float) r9)
            r1 = r8
            r23 = r14
            r14 = r2
            r2 = r38
            r40 = r13
            r13 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r27 = r4
            r4 = r41
            r28 = r5
            r5 = r22
            r22 = r6
            r6 = r28
            androidx.compose.ui.Modifier r6 = sliderSemantics(r0, r1, r2, r3, r4, r5, r6)
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            java.lang.Float r1 = java.lang.Float.valueOf(r8)
            r11.startReplaceableGroup(r13)
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r14)
            boolean r2 = r11.changed((java.lang.Object) r15)
            boolean r1 = r11.changed((java.lang.Object) r1)
            r1 = r1 | r2
            java.lang.Object r2 = r11.rememberedValue()
            if (r1 != 0) goto L_0x04fb
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r2 != r1) goto L_0x0506
        L_0x04fb:
            androidx.compose.material3.SliderKt$RangeSliderImpl$endThumbSemantics$1$1 r1 = new androidx.compose.material3.SliderKt$RangeSliderImpl$endThumbSemantics$1$1
            r1.<init>(r15, r8)
            r2 = r1
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r11.updateRememberedValue(r2)
        L_0x0506:
            r11.endReplaceableGroup()
            r3 = r2
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            java.lang.Comparable r1 = r39.getEndInclusive()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            kotlin.ranges.ClosedFloatingPointRange r5 = kotlin.ranges.RangesKt.rangeTo((float) r8, (float) r1)
            r1 = r9
            r2 = r38
            r4 = r41
            r13 = r6
            r6 = r27
            androidx.compose.ui.Modifier r14 = sliderSemantics(r0, r1, r2, r3, r4, r5, r6)
            androidx.compose.material3.Strings$Companion r0 = androidx.compose.material3.Strings.Companion
            int r0 = r0.m1615getSliderRangeStartadMyvUU()
            r15 = 6
            java.lang.String r9 = androidx.compose.material3.Strings_androidKt.m1632getStringNWtq28(r0, r11, r15)
            androidx.compose.material3.Strings$Companion r0 = androidx.compose.material3.Strings.Companion
            int r0 = r0.m1614getSliderRangeEndadMyvUU()
            java.lang.String r8 = androidx.compose.material3.Strings_androidKt.m1632getStringNWtq28(r0, r11, r15)
            androidx.compose.ui.Modifier r0 = androidx.compose.material3.InteractiveComponentSizeKt.minimumInteractiveComponentSize(r35)
            androidx.compose.material3.tokens.SliderTokens r1 = androidx.compose.material3.tokens.SliderTokens.INSTANCE
            float r1 = r1.m2296getHandleWidthD9Ej5fM()
            androidx.compose.material3.tokens.SliderTokens r2 = androidx.compose.material3.tokens.SliderTokens.INSTANCE
            float r2 = r2.m2295getHandleHeightD9Ej5fM()
            r3 = 0
            r4 = 0
            r5 = 12
            r6 = 0
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.m559requiredSizeInqDBjuR0$default(r0, r1, r2, r3, r4, r5, r6)
            androidx.compose.ui.Modifier r27 = r0.then(r7)
            androidx.compose.material3.SliderKt$RangeSliderImpl$2 r28 = new androidx.compose.material3.SliderKt$RangeSliderImpl$2
            r0 = r28
            r1 = r19
            r2 = r12
            r3 = r36
            r4 = r20
            r5 = r10
            r6 = r22
            r7 = r24
            r12 = r8
            r8 = r25
            r10 = r9
            r9 = r26
            r15 = r10
            r10 = r39
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = r28
            androidx.compose.ui.layout.MeasurePolicy r0 = (androidx.compose.ui.layout.MeasurePolicy) r0
            r1 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r11.startReplaceableGroup(r1)
            java.lang.String r2 = "CC(Layout)P(!1,2)73@2855L7,74@2910L7,75@2969L7,76@2981L460:Layout.kt#80mrfh"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r2)
            androidx.compose.runtime.ProvidableCompositionLocal r2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r2 = (androidx.compose.runtime.CompositionLocal) r2
            r3 = r32
            r4 = 2023513938(0x789c5f52, float:2.5372864E34)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r11, r4, r3)
            java.lang.Object r2 = r11.consume(r2)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r11)
            androidx.compose.ui.unit.Density r2 = (androidx.compose.ui.unit.Density) r2
            androidx.compose.runtime.ProvidableCompositionLocal r5 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            androidx.compose.runtime.CompositionLocal r5 = (androidx.compose.runtime.CompositionLocal) r5
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r11, r4, r3)
            java.lang.Object r5 = r11.consume(r5)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r11)
            androidx.compose.ui.unit.LayoutDirection r5 = (androidx.compose.ui.unit.LayoutDirection) r5
            androidx.compose.runtime.ProvidableCompositionLocal r6 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            androidx.compose.runtime.CompositionLocal r6 = (androidx.compose.runtime.CompositionLocal) r6
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r11, r4, r3)
            java.lang.Object r3 = r11.consume(r6)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r11)
            androidx.compose.ui.platform.ViewConfiguration r3 = (androidx.compose.ui.platform.ViewConfiguration) r3
            androidx.compose.ui.node.ComposeUiNode$Companion r6 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function0 r6 = r6.getConstructor()
            kotlin.jvm.functions.Function3 r7 = androidx.compose.ui.layout.LayoutKt.materializerOf(r27)
            androidx.compose.runtime.Applier r8 = r11.getApplier()
            boolean r8 = r8 instanceof androidx.compose.runtime.Applier
            if (r8 != 0) goto L_0x05d3
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x05d3:
            r11.startReusableNode()
            boolean r8 = r11.getInserting()
            if (r8 == 0) goto L_0x05e0
            r11.createNode(r6)
            goto L_0x05e3
        L_0x05e0:
            r11.useNode()
        L_0x05e3:
            androidx.compose.runtime.Composer r6 = androidx.compose.runtime.Updater.m2444constructorimpl(r11)
            androidx.compose.ui.node.ComposeUiNode$Companion r8 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r8 = r8.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r6, r0, r8)
            androidx.compose.ui.node.ComposeUiNode$Companion r0 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r0 = r0.getSetDensity()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r6, r2, r0)
            androidx.compose.ui.node.ComposeUiNode$Companion r0 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r0 = r0.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r6, r5, r0)
            androidx.compose.ui.node.ComposeUiNode$Companion r0 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r0 = r0.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r6, r3, r0)
            androidx.compose.runtime.Composer r0 = androidx.compose.runtime.SkippableUpdater.m2436constructorimpl(r11)
            androidx.compose.runtime.SkippableUpdater r0 = androidx.compose.runtime.SkippableUpdater.m2435boximpl(r0)
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r7.invoke(r0, r11, r3)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r11.startReplaceableGroup(r0)
            r2 = -2040262222(0xffffffff866411b2, float:-4.2895034E-35)
            java.lang.String r3 = "C754@31668L84,752@31532L369,762@32048L82,760@31914L359,768@32286L117:Slider.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r11, r2, r3)
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r2 = (androidx.compose.ui.Modifier) r2
            androidx.compose.material3.RangeSliderComponents r3 = androidx.compose.material3.RangeSliderComponents.STARTTHUMB
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.layout.LayoutIdKt.layoutId(r2, r3)
            r3 = 1157296644(0x44faf204, float:2007.563)
            r11.startReplaceableGroup(r3)
            r3 = r47
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r3)
            boolean r5 = r11.changed((java.lang.Object) r15)
            java.lang.Object r6 = r11.rememberedValue()
            if (r5 != 0) goto L_0x0650
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r5 = r5.getEmpty()
            if (r6 != r5) goto L_0x065b
        L_0x0650:
            androidx.compose.material3.SliderKt$RangeSliderImpl$1$1$1 r5 = new androidx.compose.material3.SliderKt$RangeSliderImpl$1$1$1
            r5.<init>(r15)
            r6 = r5
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            r11.updateRememberedValue(r6)
        L_0x065b:
            r11.endReplaceableGroup()
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            r5 = 1
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.semantics.SemanticsModifierKt.semantics(r2, r5, r6)
            r5 = r38
            r8 = r42
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.FocusableKt.focusable(r2, r5, r8)
            androidx.compose.ui.Modifier r2 = r2.then(r13)
            r6 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r11.startReplaceableGroup(r6)
            java.lang.String r7 = "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r7)
            androidx.compose.ui.Alignment$Companion r9 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment r9 = r9.getTopStart()
            r10 = 0
            androidx.compose.ui.layout.MeasurePolicy r9 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(r9, r10, r11, r10)
            r11.startReplaceableGroup(r1)
            java.lang.String r10 = "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r10)
            androidx.compose.runtime.ProvidableCompositionLocal r10 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r10 = (androidx.compose.runtime.CompositionLocal) r10
            java.lang.String r13 = "C:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r11, r4, r13)
            java.lang.Object r10 = r11.consume(r10)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r11)
            androidx.compose.ui.unit.Density r10 = (androidx.compose.ui.unit.Density) r10
            androidx.compose.runtime.ProvidableCompositionLocal r15 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            androidx.compose.runtime.CompositionLocal r15 = (androidx.compose.runtime.CompositionLocal) r15
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r11, r4, r13)
            java.lang.Object r15 = r11.consume(r15)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r11)
            androidx.compose.ui.unit.LayoutDirection r15 = (androidx.compose.ui.unit.LayoutDirection) r15
            androidx.compose.runtime.ProvidableCompositionLocal r20 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            r1 = r20
            androidx.compose.runtime.CompositionLocal r1 = (androidx.compose.runtime.CompositionLocal) r1
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r11, r4, r13)
            java.lang.Object r1 = r11.consume(r1)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r11)
            androidx.compose.ui.platform.ViewConfiguration r1 = (androidx.compose.ui.platform.ViewConfiguration) r1
            androidx.compose.ui.node.ComposeUiNode$Companion r20 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function0 r4 = r20.getConstructor()
            kotlin.jvm.functions.Function3 r2 = androidx.compose.ui.layout.LayoutKt.materializerOf(r2)
            androidx.compose.runtime.Applier r6 = r11.getApplier()
            boolean r6 = r6 instanceof androidx.compose.runtime.Applier
            if (r6 != 0) goto L_0x06de
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x06de:
            r11.startReusableNode()
            boolean r6 = r11.getInserting()
            if (r6 == 0) goto L_0x06eb
            r11.createNode(r4)
            goto L_0x06ee
        L_0x06eb:
            r11.useNode()
        L_0x06ee:
            r11.disableReusing()
            androidx.compose.runtime.Composer r4 = androidx.compose.runtime.Updater.m2444constructorimpl(r11)
            androidx.compose.ui.node.ComposeUiNode$Companion r6 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r6 = r6.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r4, r9, r6)
            androidx.compose.ui.node.ComposeUiNode$Companion r6 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r6 = r6.getSetDensity()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r4, r10, r6)
            androidx.compose.ui.node.ComposeUiNode$Companion r6 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r6 = r6.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r4, r15, r6)
            androidx.compose.ui.node.ComposeUiNode$Companion r6 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r6 = r6.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r4, r1, r6)
            r11.enableReusing()
            androidx.compose.runtime.Composer r1 = androidx.compose.runtime.SkippableUpdater.m2436constructorimpl(r11)
            androidx.compose.runtime.SkippableUpdater r1 = androidx.compose.runtime.SkippableUpdater.m2435boximpl(r1)
            r4 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r2.invoke(r1, r11, r6)
            r11.startReplaceableGroup(r0)
            r1 = -1253629305(0xffffffffb5472287, float:-7.418352E-7)
            java.lang.String r2 = "C72@3384L9:Box.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r11, r1, r2)
            androidx.compose.foundation.layout.BoxScopeInstance r1 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE
            androidx.compose.foundation.layout.BoxScope r1 = (androidx.compose.foundation.layout.BoxScope) r1
            r1 = 1631550503(0x613f7c27, float:2.2076714E20)
            java.lang.String r2 = "C759@31872L27:Slider.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r11, r1, r2)
            int r1 = r17 >> 24
            r1 = r1 & 112(0x70, float:1.57E-43)
            r2 = 6
            r1 = r1 | r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = r40
            r10 = r44
            r10.invoke(r2, r11, r1)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r11)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r11)
            r11.endReplaceableGroup()
            r11.endNode()
            r11.endReplaceableGroup()
            r11.endReplaceableGroup()
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
            androidx.compose.material3.RangeSliderComponents r4 = androidx.compose.material3.RangeSliderComponents.ENDTHUMB
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.layout.LayoutIdKt.layoutId(r1, r4)
            r4 = 1157296644(0x44faf204, float:2007.563)
            r11.startReplaceableGroup(r4)
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r3)
            boolean r3 = r11.changed((java.lang.Object) r12)
            java.lang.Object r4 = r11.rememberedValue()
            if (r3 != 0) goto L_0x078b
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r3 = r3.getEmpty()
            if (r4 != r3) goto L_0x0796
        L_0x078b:
            androidx.compose.material3.SliderKt$RangeSliderImpl$1$3$1 r3 = new androidx.compose.material3.SliderKt$RangeSliderImpl$1$3$1
            r3.<init>(r12)
            r4 = r3
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            r11.updateRememberedValue(r4)
        L_0x0796:
            r11.endReplaceableGroup()
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            r3 = 1
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.semantics.SemanticsModifierKt.semantics(r1, r3, r4)
            r9 = r43
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.FocusableKt.focusable(r1, r5, r9)
            androidx.compose.ui.Modifier r1 = r1.then(r14)
            r3 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r11.startReplaceableGroup(r3)
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r7)
            androidx.compose.ui.Alignment$Companion r3 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment r3 = r3.getTopStart()
            r4 = 0
            androidx.compose.ui.layout.MeasurePolicy r3 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(r3, r4, r11, r4)
            r4 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r11.startReplaceableGroup(r4)
            java.lang.String r4 = "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r4)
            androidx.compose.runtime.ProvidableCompositionLocal r4 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r4 = (androidx.compose.runtime.CompositionLocal) r4
            r6 = 2023513938(0x789c5f52, float:2.5372864E34)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r11, r6, r13)
            java.lang.Object r4 = r11.consume(r4)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r11)
            androidx.compose.ui.unit.Density r4 = (androidx.compose.ui.unit.Density) r4
            androidx.compose.runtime.ProvidableCompositionLocal r12 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            androidx.compose.runtime.CompositionLocal r12 = (androidx.compose.runtime.CompositionLocal) r12
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r11, r6, r13)
            java.lang.Object r12 = r11.consume(r12)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r11)
            androidx.compose.ui.unit.LayoutDirection r12 = (androidx.compose.ui.unit.LayoutDirection) r12
            androidx.compose.runtime.ProvidableCompositionLocal r14 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            androidx.compose.runtime.CompositionLocal r14 = (androidx.compose.runtime.CompositionLocal) r14
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r11, r6, r13)
            java.lang.Object r6 = r11.consume(r14)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r11)
            androidx.compose.ui.platform.ViewConfiguration r6 = (androidx.compose.ui.platform.ViewConfiguration) r6
            androidx.compose.ui.node.ComposeUiNode$Companion r14 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function0 r14 = r14.getConstructor()
            kotlin.jvm.functions.Function3 r1 = androidx.compose.ui.layout.LayoutKt.materializerOf(r1)
            androidx.compose.runtime.Applier r15 = r11.getApplier()
            boolean r15 = r15 instanceof androidx.compose.runtime.Applier
            if (r15 != 0) goto L_0x0817
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x0817:
            r11.startReusableNode()
            boolean r15 = r11.getInserting()
            if (r15 == 0) goto L_0x0824
            r11.createNode(r14)
            goto L_0x0827
        L_0x0824:
            r11.useNode()
        L_0x0827:
            r11.disableReusing()
            androidx.compose.runtime.Composer r14 = androidx.compose.runtime.Updater.m2444constructorimpl(r11)
            androidx.compose.ui.node.ComposeUiNode$Companion r15 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r15 = r15.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r14, r3, r15)
            androidx.compose.ui.node.ComposeUiNode$Companion r3 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r3 = r3.getSetDensity()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r14, r4, r3)
            androidx.compose.ui.node.ComposeUiNode$Companion r3 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r3 = r3.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r14, r12, r3)
            androidx.compose.ui.node.ComposeUiNode$Companion r3 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r3 = r3.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r14, r6, r3)
            r11.enableReusing()
            androidx.compose.runtime.Composer r3 = androidx.compose.runtime.SkippableUpdater.m2436constructorimpl(r11)
            androidx.compose.runtime.SkippableUpdater r3 = androidx.compose.runtime.SkippableUpdater.m2435boximpl(r3)
            r4 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r1.invoke(r3, r11, r6)
            r11.startReplaceableGroup(r0)
            r1 = -1253629305(0xffffffffb5472287, float:-7.418352E-7)
            java.lang.String r3 = "C72@3384L9:Box.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r11, r1, r3)
            androidx.compose.foundation.layout.BoxScopeInstance r1 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE
            androidx.compose.foundation.layout.BoxScope r1 = (androidx.compose.foundation.layout.BoxScope) r1
            r1 = 1631550877(0x613f7d9d, float:2.2077372E20)
            java.lang.String r3 = "C767@32246L25:Slider.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r11, r1, r3)
            int r1 = r18 << 3
            r1 = r1 & 112(0x70, float:1.57E-43)
            r3 = 6
            r1 = r1 | r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r12 = r45
            r12.invoke(r2, r11, r1)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r11)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r11)
            r11.endReplaceableGroup()
            r11.endNode()
            r11.endReplaceableGroup()
            r11.endReplaceableGroup()
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
            androidx.compose.material3.RangeSliderComponents r3 = androidx.compose.material3.RangeSliderComponents.TRACK
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.layout.LayoutIdKt.layoutId(r1, r3)
            r3 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r11.startReplaceableGroup(r3)
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r7)
            androidx.compose.ui.Alignment$Companion r3 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment r3 = r3.getTopStart()
            r4 = 0
            androidx.compose.ui.layout.MeasurePolicy r3 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(r3, r4, r11, r4)
            r4 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r11.startReplaceableGroup(r4)
            java.lang.String r4 = "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r4)
            androidx.compose.runtime.ProvidableCompositionLocal r4 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r4 = (androidx.compose.runtime.CompositionLocal) r4
            r6 = 2023513938(0x789c5f52, float:2.5372864E34)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r11, r6, r13)
            java.lang.Object r4 = r11.consume(r4)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r11)
            androidx.compose.ui.unit.Density r4 = (androidx.compose.ui.unit.Density) r4
            androidx.compose.runtime.ProvidableCompositionLocal r7 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            androidx.compose.runtime.CompositionLocal r7 = (androidx.compose.runtime.CompositionLocal) r7
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r11, r6, r13)
            java.lang.Object r7 = r11.consume(r7)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r11)
            androidx.compose.ui.unit.LayoutDirection r7 = (androidx.compose.ui.unit.LayoutDirection) r7
            androidx.compose.runtime.ProvidableCompositionLocal r14 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            androidx.compose.runtime.CompositionLocal r14 = (androidx.compose.runtime.CompositionLocal) r14
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r11, r6, r13)
            java.lang.Object r6 = r11.consume(r14)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r11)
            androidx.compose.ui.platform.ViewConfiguration r6 = (androidx.compose.ui.platform.ViewConfiguration) r6
            androidx.compose.ui.node.ComposeUiNode$Companion r13 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function0 r13 = r13.getConstructor()
            kotlin.jvm.functions.Function3 r1 = androidx.compose.ui.layout.LayoutKt.materializerOf(r1)
            androidx.compose.runtime.Applier r14 = r11.getApplier()
            boolean r14 = r14 instanceof androidx.compose.runtime.Applier
            if (r14 != 0) goto L_0x0914
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x0914:
            r11.startReusableNode()
            boolean r14 = r11.getInserting()
            if (r14 == 0) goto L_0x0921
            r11.createNode(r13)
            goto L_0x0924
        L_0x0921:
            r11.useNode()
        L_0x0924:
            r11.disableReusing()
            androidx.compose.runtime.Composer r13 = androidx.compose.runtime.Updater.m2444constructorimpl(r11)
            androidx.compose.ui.node.ComposeUiNode$Companion r14 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r14 = r14.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r13, r3, r14)
            androidx.compose.ui.node.ComposeUiNode$Companion r3 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r3 = r3.getSetDensity()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r13, r4, r3)
            androidx.compose.ui.node.ComposeUiNode$Companion r3 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r3 = r3.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r13, r7, r3)
            androidx.compose.ui.node.ComposeUiNode$Companion r3 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r3 = r3.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r13, r6, r3)
            r11.enableReusing()
            androidx.compose.runtime.Composer r3 = androidx.compose.runtime.SkippableUpdater.m2436constructorimpl(r11)
            androidx.compose.runtime.SkippableUpdater r3 = androidx.compose.runtime.SkippableUpdater.m2435boximpl(r3)
            r4 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.invoke(r3, r11, r4)
            r11.startReplaceableGroup(r0)
            r0 = -1253629305(0xffffffffb5472287, float:-7.418352E-7)
            java.lang.String r1 = "C72@3384L9:Box.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r11, r0, r1)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE
            androidx.compose.foundation.layout.BoxScope r0 = (androidx.compose.foundation.layout.BoxScope) r0
            r0 = 1631550998(0x613f7e16, float:2.2077585E20)
            java.lang.String r1 = "C769@32367L22:Slider.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r11, r0, r1)
            r0 = r18 & 112(0x70, float:1.57E-43)
            r1 = 6
            r0 = r0 | r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r13 = r46
            r13.invoke(r2, r11, r0)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r11)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r11)
            r11.endReplaceableGroup()
            r11.endNode()
            r11.endReplaceableGroup()
            r11.endReplaceableGroup()
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r11)
            r11.endReplaceableGroup()
            r11.endNode()
            r11.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x09ad
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x09ad:
            r6 = r23
        L_0x09af:
            androidx.compose.runtime.ScopeUpdateScope r15 = r11.endRestartGroup()
            if (r15 != 0) goto L_0x09b6
            goto L_0x09e4
        L_0x09b6:
            androidx.compose.material3.SliderKt$RangeSliderImpl$3 r16 = new androidx.compose.material3.SliderKt$RangeSliderImpl$3
            r0 = r16
            r1 = r35
            r2 = r36
            r3 = r37
            r4 = r38
            r5 = r39
            r7 = r41
            r8 = r42
            r9 = r43
            r10 = r44
            r11 = r45
            r12 = r46
            r13 = r48
            r14 = r49
            r33 = r15
            r15 = r50
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0 = r16
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1 = r33
            r1.updateScope(r0)
        L_0x09e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.RangeSliderImpl(androidx.compose.ui.Modifier, kotlin.ranges.ClosedFloatingPointRange, kotlin.jvm.functions.Function1, boolean, kotlin.ranges.ClosedFloatingPointRange, int, kotlin.jvm.functions.Function0, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final float RangeSliderImpl$lambda$25(MutableState<Float> mutableState) {
        return ((Number) mutableState.getValue()).floatValue();
    }

    /* access modifiers changed from: private */
    public static final void RangeSliderImpl$lambda$26(MutableState<Float> mutableState, float f) {
        mutableState.setValue(Float.valueOf(f));
    }

    /* access modifiers changed from: private */
    public static final float RangeSliderImpl$lambda$28(MutableState<Float> mutableState) {
        return ((Number) mutableState.getValue()).floatValue();
    }

    /* access modifiers changed from: private */
    public static final void RangeSliderImpl$lambda$29(MutableState<Float> mutableState, float f) {
        mutableState.setValue(Float.valueOf(f));
    }

    /* access modifiers changed from: private */
    public static final int RangeSliderImpl$lambda$31(MutableState<Integer> mutableState) {
        return ((Number) mutableState.getValue()).intValue();
    }

    /* access modifiers changed from: private */
    public static final void RangeSliderImpl$lambda$32(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* access modifiers changed from: private */
    public static final ClosedFloatingPointRange<Float> RangeSliderImpl$scaleToUserValue$33(ClosedFloatingPointRange<Float> closedFloatingPointRange, float f, float f2, ClosedFloatingPointRange<Float> closedFloatingPointRange2) {
        return scale(f, f2, closedFloatingPointRange2, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
    }

    /* access modifiers changed from: private */
    public static final float RangeSliderImpl$scaleToOffset$34(ClosedFloatingPointRange<Float> closedFloatingPointRange, float f, float f2, float f3) {
        return scale(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), f3, f, f2);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0068 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: awaitSlop-8vUncbI  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m1549awaitSlop8vUncbI(androidx.compose.ui.input.pointer.AwaitPointerEventScope r8, long r9, int r11, kotlin.coroutines.Continuation<? super kotlin.Pair<androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Float>> r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.material3.SliderKt$awaitSlop$1
            if (r0 == 0) goto L_0x0014
            r0 = r12
            androidx.compose.material3.SliderKt$awaitSlop$1 r0 = (androidx.compose.material3.SliderKt$awaitSlop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r12 = r0.label
            int r12 = r12 - r2
            r0.label = r12
            goto L_0x0019
        L_0x0014:
            androidx.compose.material3.SliderKt$awaitSlop$1 r0 = new androidx.compose.material3.SliderKt$awaitSlop$1
            r0.<init>(r12)
        L_0x0019:
            r6 = r0
            java.lang.Object r12 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L_0x0038
            if (r1 != r2) goto L_0x002f
            java.lang.Object r8 = r6.L$0
            kotlin.jvm.internal.Ref$FloatRef r8 = (kotlin.jvm.internal.Ref.FloatRef) r8
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x0059
        L_0x002f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0038:
            kotlin.ResultKt.throwOnFailure(r12)
            kotlin.jvm.internal.Ref$FloatRef r12 = new kotlin.jvm.internal.Ref$FloatRef
            r12.<init>()
            androidx.compose.material3.SliderKt$awaitSlop$postPointerSlop$1 r1 = new androidx.compose.material3.SliderKt$awaitSlop$postPointerSlop$1
            r1.<init>(r12)
            r5 = r1
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            r6.L$0 = r12
            r6.label = r2
            r1 = r8
            r2 = r9
            r4 = r11
            java.lang.Object r8 = androidx.compose.material3.DragGestureDetectorCopyKt.m1323awaitHorizontalPointerSlopOrCancellationgDDlDlE(r1, r2, r4, r5, r6)
            if (r8 != r0) goto L_0x0056
            return r0
        L_0x0056:
            r7 = r12
            r12 = r8
            r8 = r7
        L_0x0059:
            androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.ui.input.pointer.PointerInputChange) r12
            if (r12 == 0) goto L_0x0068
            float r8 = r8.element
            java.lang.Float r8 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r8)
            kotlin.Pair r8 = kotlin.TuplesKt.to(r12, r8)
            goto L_0x0069
        L_0x0068:
            r8 = 0
        L_0x0069:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.m1549awaitSlop8vUncbI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public static final float[] stepsToTickFractions(int i) {
        if (i == 0) {
            return new float[0];
        }
        int i2 = i + 2;
        float[] fArr = new float[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            fArr[i3] = ((float) i3) / ((float) (i + 1));
        }
        return fArr;
    }

    private static final float scale(float f, float f2, float f3, float f4, float f5) {
        return MathHelpersKt.lerp(f4, f5, calcFraction(f, f2, f3));
    }

    private static final ClosedFloatingPointRange<Float> scale(float f, float f2, ClosedFloatingPointRange<Float> closedFloatingPointRange, float f3, float f4) {
        return RangesKt.rangeTo(scale(f, f2, closedFloatingPointRange.getStart().floatValue(), f3, f4), scale(f, f2, closedFloatingPointRange.getEndInclusive().floatValue(), f3, f4));
    }

    private static final float calcFraction(float f, float f2, float f3) {
        float f4 = f2 - f;
        return RangesKt.coerceIn(f4 == 0.0f ? 0.0f : (f3 - f) / f4, 0.0f, 1.0f);
    }

    static /* synthetic */ Modifier sliderSemantics$default(Modifier modifier, float f, boolean z, Function1 function1, Function0 function0, ClosedFloatingPointRange<Float> closedFloatingPointRange, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            function0 = null;
        }
        Function0 function02 = function0;
        if ((i2 & 16) != 0) {
            closedFloatingPointRange = RangesKt.rangeTo(0.0f, 1.0f);
        }
        ClosedFloatingPointRange<Float> closedFloatingPointRange2 = closedFloatingPointRange;
        if ((i2 & 32) != 0) {
            i = 0;
        }
        return sliderSemantics(modifier, f, z, function1, function02, closedFloatingPointRange2, i);
    }

    private static final Modifier sliderSemantics(Modifier modifier, float f, boolean z, Function1<? super Float, Unit> function1, Function0<Unit> function0, ClosedFloatingPointRange<Float> closedFloatingPointRange, int i) {
        return ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(modifier, false, new SliderKt$sliderSemantics$1(z, closedFloatingPointRange, i, RangesKt.coerceIn(f, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue()), function1, function0), 1, (Object) null), f, closedFloatingPointRange, i);
    }

    /* access modifiers changed from: private */
    public static final Object animateToTarget(DraggableState draggableState, float f, float f2, float f3, Continuation<? super Unit> continuation) {
        Object drag$default = DraggableState.drag$default(draggableState, (MutatePriority) null, new SliderKt$animateToTarget$2(f, f2, f3, (Continuation<? super SliderKt$animateToTarget$2>) null), continuation, 1, (Object) null);
        return drag$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? drag$default : Unit.INSTANCE;
    }

    private static final Modifier rangeSliderPressDragModifier(Modifier modifier, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, State<Float> state, State<Float> state2, boolean z, boolean z2, int i, ClosedFloatingPointRange<Float> closedFloatingPointRange, State<? extends Function1<? super Boolean, Unit>> state3, State<? extends Function2<? super Boolean, ? super Float, Unit>> state4) {
        if (!z) {
            return modifier;
        }
        Modifier modifier2 = modifier;
        return SuspendingPointerInputFilterKt.pointerInput(modifier, new Object[]{mutableInteractionSource, mutableInteractionSource2, Integer.valueOf(i), Boolean.valueOf(z2), closedFloatingPointRange}, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) new SliderKt$rangeSliderPressDragModifier$1(mutableInteractionSource, mutableInteractionSource2, state, state2, state4, z2, i, state3, (Continuation<? super SliderKt$rangeSliderPressDragModifier$1>) null));
    }

    static {
        float r0 = SliderTokens.INSTANCE.m2296getHandleWidthD9Ej5fM();
        ThumbWidth = r0;
        float r1 = SliderTokens.INSTANCE.m2295getHandleHeightD9Ej5fM();
        ThumbHeight = r1;
        ThumbSize = DpKt.m5648DpSizeYgX7TsA(r0, r1);
        float r12 = Dp.m5626constructorimpl((float) 48);
        SliderHeight = r12;
        float r2 = Dp.m5626constructorimpl((float) 144);
        SliderMinWidth = r2;
        DefaultSliderConstraints = SizeKt.m551heightInVpY3zN4$default(SizeKt.m570widthInVpY3zN4$default(Modifier.Companion, r2, 0.0f, 2, (Object) null), 0.0f, r12, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final float snapValueToTick(float f, float[] fArr, float f2, float f3) {
        Float f4;
        if (fArr.length == 0) {
            f4 = null;
        } else {
            float f5 = fArr[0];
            int lastIndex = ArraysKt.getLastIndex(fArr);
            if (lastIndex == 0) {
                f4 = Float.valueOf(f5);
            } else {
                float abs = Math.abs(MathHelpersKt.lerp(f2, f3, f5) - f);
                IntIterator it = new IntRange(1, lastIndex).iterator();
                while (it.hasNext()) {
                    float f6 = fArr[it.nextInt()];
                    float abs2 = Math.abs(MathHelpersKt.lerp(f2, f3, f6) - f);
                    if (Float.compare(abs, abs2) > 0) {
                        f5 = f6;
                        abs = abs2;
                    }
                }
                f4 = Float.valueOf(f5);
            }
        }
        return f4 != null ? MathHelpersKt.lerp(f2, f3, f4.floatValue()) : f;
    }

    private static final Modifier sliderTapModifier(Modifier modifier, DraggableState draggableState, MutableInteractionSource mutableInteractionSource, int i, boolean z, State<Float> state, State<? extends Function0<Unit>> state2, MutableState<Float> mutableState, boolean z2) {
        Modifier modifier2 = modifier;
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SliderKt$sliderTapModifier$$inlined$debugInspectorInfo$1(draggableState, mutableInteractionSource, i, z, state, state2, mutableState, z2) : InspectableValueKt.getNoInspectorInfo(), new SliderKt$sliderTapModifier$2(z2, draggableState, mutableInteractionSource, i, z, mutableState, state, state2));
    }
}
