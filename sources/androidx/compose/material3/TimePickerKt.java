package androidx.compose.material3;

import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.tokens.TimeInputTokens;
import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000®\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u001a:\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00012\u0011\u0010\u001d\u001a\r\u0012\u0004\u0012\u00020\u00190\u001e¢\u0006\u0002\b\u001fH\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a\u001d\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0003¢\u0006\u0002\u0010'\u001a%\u0010(\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010)\u001a\u00020*H\u0001¢\u0006\u0002\u0010+\u001a%\u0010,\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$2\u0006\u0010-\u001a\u00020\u00072\u0006\u0010)\u001a\u00020*H\u0003¢\u0006\u0002\u0010.\u001a\u0015\u0010/\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0003¢\u0006\u0002\u00100\u001a\u001d\u00101\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0003¢\u0006\u0002\u0010'\u001a%\u00102\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0003¢\u0006\u0002\u00103\u001a1\u00104\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010%\u001a\u00020&2\u0006\u0010)\u001a\u00020*H\u0001¢\u0006\u0002\u00105\u001a=\u00106\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020:H\u0003¢\u0006\u0002\u0010<\u001a)\u0010=\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010%\u001a\u00020&H\u0007¢\u0006\u0002\u0010>\u001a%\u0010?\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020&2\u0006\u0010#\u001a\u00020$H\u0003¢\u0006\u0002\u0010@\u001a;\u0010A\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010B\u001a\u00020CH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bD\u0010E\u001ae\u0010F\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020G2\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\u00190I2\u0006\u0010#\u001a\u00020$2\u0006\u0010J\u001a\u00020K2\b\b\u0002\u0010L\u001a\u00020M2\b\b\u0002\u0010N\u001a\u00020O2\u0006\u0010%\u001a\u00020&H\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bP\u0010Q\u001a=\u0010R\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020\u00072\u0006\u0010#\u001a\u00020$2\u0006\u0010J\u001a\u00020K2\u0006\u0010%\u001a\u00020&H\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bS\u0010T\u001aQ\u0010U\u001a\u00020\u00192\u0006\u0010V\u001a\u00020*2\u0006\u0010W\u001a\u00020:2\f\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00190\u001e2\u0006\u0010%\u001a\u00020&2\u001c\u0010\u001d\u001a\u0018\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020\u00190I¢\u0006\u0002\b\u001f¢\u0006\u0002\bZH\u0003¢\u0006\u0002\u0010[\u001a\u001d\u0010\\\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0003¢\u0006\u0002\u0010'\u001a%\u0010]\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0003¢\u0006\u0002\u00103\u001a1\u0010^\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010%\u001a\u00020&2\u0006\u0010)\u001a\u00020*H\u0001¢\u0006\u0002\u00105\u001a\u0018\u0010_\u001a\u00020\t2\u0006\u0010`\u001a\u00020\t2\u0006\u0010a\u001a\u00020\tH\u0002\u001a(\u0010b\u001a\u00020\t2\u0006\u0010c\u001a\u00020\t2\u0006\u0010d\u001a\u00020\t2\u0006\u0010e\u001a\u00020\u00072\u0006\u0010f\u001a\u00020\u0007H\u0002\u001a-\u0010g\u001a\u00020h2\u0006\u0010J\u001a\u00020K2\u0006\u0010i\u001a\u00020*2\u0006\u0010j\u001a\u00020\u0007H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bk\u0010l\u001a+\u0010m\u001a\u00020$2\b\b\u0002\u0010n\u001a\u00020\u00072\b\b\u0002\u0010o\u001a\u00020\u00072\b\b\u0002\u0010i\u001a\u00020*H\u0007¢\u0006\u0002\u0010p\u001a`\u0010q\u001a\u00020\u00192\u0006\u0010J\u001a\u00020K2\u0006\u0010#\u001a\u00020$2\u0006\u0010-\u001a\u00020G2\u0006\u0010r\u001a\u00020G2\u0006\u0010s\u001a\u00020\u00072!\u0010t\u001a\u001d\u0012\u0013\u0012\u00110G¢\u0006\f\bu\u0012\b\bv\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020\u00190IH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bw\u0010x\u001a$\u0010y\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0z2\u0006\u0010{\u001a\u00020\t2\u0006\u0010|\u001a\u00020\tH\u0002\u001a\u001c\u0010}\u001a\u00020\u001b*\u00020\u001b2\u0006\u0010#\u001a\u00020$2\u0006\u0010)\u001a\u00020*H\u0002\u001a\u001c\u0010~\u001a\u00020\u001b*\u00020\u001b2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002\u001a\u0015\u0010\u001a\u00020h*\u00020\u00072\u0007\u0010\u0001\u001a\u00020\u0007H\u0002\u001a\u0016\u0010\u0001\u001a\u00020\u001b*\u00020\u001b2\u0007\u0010\u0001\u001a\u00020*H\u0003\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\tXT¢\u0006\u0002\n\u0000\"\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\u000b\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\f\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\r\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\u000f\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0010\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0011\u001a\u00020\u0012XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\tXT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\tXT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\tXT¢\u0006\u0002\n\u0000\"\u0013\u0010\u0016\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0017\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0001"}, d2 = {"ClockDisplayBottomMargin", "Landroidx/compose/ui/unit/Dp;", "F", "ClockFaceBottomMargin", "DisplaySeparatorWidth", "ExtraHours", "", "", "FullCircle", "", "Hours", "InnerCircleRadius", "MaxDistance", "MinimumInteractiveSize", "Minutes", "OuterCircleSizeRadius", "PeriodToggleMargin", "QuarterCircle", "", "RadiansPerHour", "RadiansPerMinute", "SeparatorZIndex", "SupportLabelTop", "TimeInputBottomPadding", "CircularLayout", "", "modifier", "Landroidx/compose/ui/Modifier;", "radius", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "CircularLayout-uFdPcIQ", "(Landroidx/compose/ui/Modifier;FLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ClockDisplayNumbers", "state", "Landroidx/compose/material3/TimePickerState;", "colors", "Landroidx/compose/material3/TimePickerColors;", "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V", "ClockFace", "autoSwitchToMinute", "", "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;ZLandroidx/compose/runtime/Composer;I)V", "ClockText", "value", "(Landroidx/compose/material3/TimePickerState;IZLandroidx/compose/runtime/Composer;I)V", "DisplaySeparator", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "HorizontalClockDisplay", "HorizontalPeriodToggle", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V", "HorizontalTimePicker", "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;ZLandroidx/compose/runtime/Composer;II)V", "PeriodToggleImpl", "measurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "startShape", "Landroidx/compose/ui/graphics/Shape;", "endShape", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;I)V", "TimeInput", "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;II)V", "TimeInputImpl", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/material3/TimePickerState;Landroidx/compose/runtime/Composer;I)V", "TimePicker", "layoutType", "Landroidx/compose/material3/TimePickerLayoutType;", "TimePicker-mT9BvqQ", "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;ILandroidx/compose/runtime/Composer;II)V", "TimePickerTextField", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "selection", "Landroidx/compose/material3/Selection;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "TimePickerTextField-lxUZ_iY", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/TimePickerState;ILandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;II)V", "TimeSelector", "TimeSelector-uXwN82Y", "(Landroidx/compose/ui/Modifier;ILandroidx/compose/material3/TimePickerState;ILandroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V", "ToggleItem", "checked", "shape", "onClick", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "(ZLandroidx/compose/ui/graphics/Shape;Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/TimePickerColors;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "VerticalClockDisplay", "VerticalPeriodToggle", "VerticalTimePicker", "atan", "y", "x", "dist", "x1", "y1", "x2", "y2", "numberContentDescription", "", "is24Hour", "number", "numberContentDescription-YKJpE6Y", "(IZILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "rememberTimePickerState", "initialHour", "initialMinute", "(IIZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/TimePickerState;", "timeInputOnChange", "prevValue", "max", "onNewValue", "Lkotlin/ParameterName;", "name", "timeInputOnChange-gIWD5Rc", "(ILandroidx/compose/material3/TimePickerState;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/TextFieldValue;ILkotlin/jvm/functions/Function1;)V", "valuesForAnimation", "Lkotlin/Pair;", "current", "new", "clockDial", "drawSelector", "toLocalString", "minDigits", "visible", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: TimePicker.kt */
public final class TimePickerKt {
    private static final float ClockDisplayBottomMargin = Dp.m5626constructorimpl((float) 36);
    private static final float ClockFaceBottomMargin;
    /* access modifiers changed from: private */
    public static final float DisplaySeparatorWidth;
    /* access modifiers changed from: private */
    public static final List<Integer> ExtraHours;
    private static final float FullCircle = 6.2831855f;
    /* access modifiers changed from: private */
    public static final List<Integer> Hours;
    /* access modifiers changed from: private */
    public static final float InnerCircleRadius = Dp.m5626constructorimpl((float) 69);
    /* access modifiers changed from: private */
    public static final float MaxDistance = Dp.m5626constructorimpl((float) 74);
    private static final float MinimumInteractiveSize = Dp.m5626constructorimpl((float) 48);
    /* access modifiers changed from: private */
    public static final List<Integer> Minutes = CollectionsKt.listOf(0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55);
    /* access modifiers changed from: private */
    public static final float OuterCircleSizeRadius = Dp.m5626constructorimpl((float) 101);
    private static final float PeriodToggleMargin = Dp.m5626constructorimpl((float) 12);
    private static final double QuarterCircle = 1.5707963267948966d;
    private static final float RadiansPerHour = 0.5235988f;
    private static final float RadiansPerMinute = 0.10471976f;
    private static final float SeparatorZIndex = 2.0f;
    private static final float SupportLabelTop = Dp.m5626constructorimpl((float) 7);
    private static final float TimeInputBottomPadding;

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* renamed from: TimePicker-mT9BvqQ  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1742TimePickermT9BvqQ(androidx.compose.material3.TimePickerState r42, androidx.compose.ui.Modifier r43, androidx.compose.material3.TimePickerColors r44, int r45, androidx.compose.runtime.Composer r46, int r47, int r48) {
        /*
            r7 = r42
            r8 = r47
            java.lang.String r0 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = -619286452(0xffffffffdb16704c, float:-4.2344718E16)
            r1 = r46
            androidx.compose.runtime.Composer r6 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(TimePicker)P(3,2!,1:c#material3.TimePickerLayoutType)191@10184L8,192@10252L12,194@10313L23:TimePicker.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r6, r1)
            r1 = r48 & 1
            if (r1 == 0) goto L_0x001f
            r1 = r8 | 6
            goto L_0x002f
        L_0x001f:
            r1 = r8 & 14
            if (r1 != 0) goto L_0x002e
            boolean r1 = r6.changed((java.lang.Object) r7)
            if (r1 == 0) goto L_0x002b
            r1 = 4
            goto L_0x002c
        L_0x002b:
            r1 = 2
        L_0x002c:
            r1 = r1 | r8
            goto L_0x002f
        L_0x002e:
            r1 = r8
        L_0x002f:
            r2 = r48 & 2
            if (r2 == 0) goto L_0x0036
            r1 = r1 | 48
            goto L_0x0049
        L_0x0036:
            r3 = r8 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0049
            r3 = r43
            boolean r4 = r6.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x0045
            r4 = 32
            goto L_0x0047
        L_0x0045:
            r4 = 16
        L_0x0047:
            r1 = r1 | r4
            goto L_0x004b
        L_0x0049:
            r3 = r43
        L_0x004b:
            r4 = r8 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0064
            r4 = r48 & 4
            if (r4 != 0) goto L_0x005e
            r4 = r44
            boolean r5 = r6.changed((java.lang.Object) r4)
            if (r5 == 0) goto L_0x0060
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x005e:
            r4 = r44
        L_0x0060:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r1 = r1 | r5
            goto L_0x0066
        L_0x0064:
            r4 = r44
        L_0x0066:
            r5 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x007f
            r5 = r48 & 8
            if (r5 != 0) goto L_0x0079
            r5 = r45
            boolean r9 = r6.changed((int) r5)
            if (r9 == 0) goto L_0x007b
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x0079:
            r5 = r45
        L_0x007b:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r1 = r1 | r9
            goto L_0x0081
        L_0x007f:
            r5 = r45
        L_0x0081:
            r9 = r1 & 5851(0x16db, float:8.199E-42)
            r10 = 1170(0x492, float:1.64E-42)
            if (r9 != r10) goto L_0x0097
            boolean r9 = r6.getSkipping()
            if (r9 != 0) goto L_0x008e
            goto L_0x0097
        L_0x008e:
            r6.skipToGroupEnd()
            r2 = r3
            r3 = r4
            r4 = r5
            r13 = r6
            goto L_0x0182
        L_0x0097:
            r6.startDefaults()
            r9 = r8 & 1
            if (r9 == 0) goto L_0x00b7
            boolean r9 = r6.getDefaultsInvalid()
            if (r9 == 0) goto L_0x00a5
            goto L_0x00b7
        L_0x00a5:
            r6.skipToGroupEnd()
            r2 = r48 & 4
            if (r2 == 0) goto L_0x00ae
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00ae:
            r2 = r48 & 8
            if (r2 == 0) goto L_0x00b4
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00b4:
            r9 = r3
            r10 = r4
            goto L_0x0104
        L_0x00b7:
            if (r2 == 0) goto L_0x00be
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r2 = (androidx.compose.ui.Modifier) r2
            goto L_0x00bf
        L_0x00be:
            r2 = r3
        L_0x00bf:
            r3 = r48 & 4
            if (r3 == 0) goto L_0x00f0
            androidx.compose.material3.TimePickerDefaults r9 = androidx.compose.material3.TimePickerDefaults.INSTANCE
            r10 = 0
            r12 = 0
            r14 = 0
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
            r36 = 0
            r39 = 0
            r40 = 24576(0x6000, float:3.4438E-41)
            r41 = 16383(0x3fff, float:2.2957E-41)
            r38 = r6
            androidx.compose.material3.TimePickerColors r3 = r9.m1739colorsu3YEpmA(r10, r12, r14, r16, r18, r20, r22, r24, r26, r28, r30, r32, r34, r36, r38, r39, r40, r41)
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x00f1
        L_0x00f0:
            r3 = r4
        L_0x00f1:
            r4 = r48 & 8
            if (r4 == 0) goto L_0x0102
            androidx.compose.material3.TimePickerDefaults r4 = androidx.compose.material3.TimePickerDefaults.INSTANCE
            r5 = 6
            int r4 = r4.m1740layoutTypesDNSZnc(r6, r5)
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
            r9 = r2
            r10 = r3
            r11 = r4
            goto L_0x0105
        L_0x0102:
            r9 = r2
            r10 = r3
        L_0x0104:
            r11 = r5
        L_0x0105:
            r6.endDefaults()
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x0115
            r2 = -1
            java.lang.String r3 = "androidx.compose.material3.TimePicker (TimePicker.kt:188)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r1, r2, r3)
        L_0x0115:
            r0 = 0
            androidx.compose.runtime.State r0 = androidx.compose.material3.TouchExplorationStateProvider_androidKt.touchExplorationState(r6, r0)
            androidx.compose.material3.TimePickerLayoutType$Companion r2 = androidx.compose.material3.TimePickerLayoutType.Companion
            int r2 = r2.m1768getVerticalQJTpgSE()
            boolean r2 = androidx.compose.material3.TimePickerLayoutType.m1763equalsimpl0(r11, r2)
            if (r2 == 0) goto L_0x014f
            r2 = 1318081657(0x4e905479, float:1.21072755E9)
            r6.startReplaceableGroup(r2)
            java.lang.String r2 = "197@10401L184"
            androidx.compose.runtime.ComposerKt.sourceInformation(r6, r2)
            boolean r0 = TimePicker_mT9BvqQ$lambda$0(r0)
            r3 = r0 ^ 1
            r0 = r1 & 14
            r2 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r1 = r1 & 896(0x380, float:1.256E-42)
            r5 = r0 | r1
            r12 = 0
            r0 = r42
            r1 = r9
            r2 = r10
            r4 = r6
            r13 = r6
            r6 = r12
            VerticalTimePicker(r0, r1, r2, r3, r4, r5, r6)
            r13.endReplaceableGroup()
            goto L_0x0176
        L_0x014f:
            r13 = r6
            r2 = 1318081863(0x4e905547, float:1.21075392E9)
            r13.startReplaceableGroup(r2)
            java.lang.String r2 = "204@10607L186"
            androidx.compose.runtime.ComposerKt.sourceInformation(r13, r2)
            boolean r0 = TimePicker_mT9BvqQ$lambda$0(r0)
            r3 = r0 ^ 1
            r0 = r1 & 14
            r2 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r1 = r1 & 896(0x380, float:1.256E-42)
            r5 = r0 | r1
            r6 = 0
            r0 = r42
            r1 = r9
            r2 = r10
            r4 = r13
            HorizontalTimePicker(r0, r1, r2, r3, r4, r5, r6)
            r13.endReplaceableGroup()
        L_0x0176:
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x017f
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x017f:
            r2 = r9
            r3 = r10
            r4 = r11
        L_0x0182:
            androidx.compose.runtime.ScopeUpdateScope r9 = r13.endRestartGroup()
            if (r9 != 0) goto L_0x0189
            goto L_0x019a
        L_0x0189:
            androidx.compose.material3.TimePickerKt$TimePicker$1 r10 = new androidx.compose.material3.TimePickerKt$TimePicker$1
            r0 = r10
            r1 = r42
            r5 = r47
            r6 = r48
            r0.<init>(r1, r2, r3, r4, r5, r6)
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            r9.updateScope(r10)
        L_0x019a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.m1742TimePickermT9BvqQ(androidx.compose.material3.TimePickerState, androidx.compose.ui.Modifier, androidx.compose.material3.TimePickerColors, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void TimeInput(androidx.compose.material3.TimePickerState r39, androidx.compose.ui.Modifier r40, androidx.compose.material3.TimePickerColors r41, androidx.compose.runtime.Composer r42, int r43, int r44) {
        /*
            r1 = r39
            r4 = r43
            java.lang.String r0 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = -760850373(0xffffffffd2a6583b, float:-3.57222416E11)
            r2 = r42
            androidx.compose.runtime.Composer r2 = r2.startRestartGroup(r0)
            java.lang.String r3 = "C(TimeInput)P(2,1)233@11683L8,235@11701L38:TimePicker.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r3)
            r3 = r44 & 1
            if (r3 == 0) goto L_0x001f
            r3 = r4 | 6
            goto L_0x002f
        L_0x001f:
            r3 = r4 & 14
            if (r3 != 0) goto L_0x002e
            boolean r3 = r2.changed((java.lang.Object) r1)
            if (r3 == 0) goto L_0x002b
            r3 = 4
            goto L_0x002c
        L_0x002b:
            r3 = 2
        L_0x002c:
            r3 = r3 | r4
            goto L_0x002f
        L_0x002e:
            r3 = r4
        L_0x002f:
            r5 = r44 & 2
            if (r5 == 0) goto L_0x0036
            r3 = r3 | 48
            goto L_0x0049
        L_0x0036:
            r6 = r4 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0049
            r6 = r40
            boolean r7 = r2.changed((java.lang.Object) r6)
            if (r7 == 0) goto L_0x0045
            r7 = 32
            goto L_0x0047
        L_0x0045:
            r7 = 16
        L_0x0047:
            r3 = r3 | r7
            goto L_0x004b
        L_0x0049:
            r6 = r40
        L_0x004b:
            r7 = r4 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0064
            r7 = r44 & 4
            if (r7 != 0) goto L_0x005e
            r7 = r41
            boolean r8 = r2.changed((java.lang.Object) r7)
            if (r8 == 0) goto L_0x0060
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x005e:
            r7 = r41
        L_0x0060:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r3 = r3 | r8
            goto L_0x0066
        L_0x0064:
            r7 = r41
        L_0x0066:
            r8 = r3 & 731(0x2db, float:1.024E-42)
            r9 = 146(0x92, float:2.05E-43)
            if (r8 != r9) goto L_0x0079
            boolean r8 = r2.getSkipping()
            if (r8 != 0) goto L_0x0073
            goto L_0x0079
        L_0x0073:
            r2.skipToGroupEnd()
        L_0x0076:
            r3 = r7
            goto L_0x00f9
        L_0x0079:
            r2.startDefaults()
            r8 = r4 & 1
            if (r8 == 0) goto L_0x0091
            boolean r8 = r2.getDefaultsInvalid()
            if (r8 == 0) goto L_0x0087
            goto L_0x0091
        L_0x0087:
            r2.skipToGroupEnd()
            r5 = r44 & 4
            if (r5 == 0) goto L_0x00cf
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x00cf
        L_0x0091:
            if (r5 == 0) goto L_0x009a
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r5 = (androidx.compose.ui.Modifier) r5
            r38 = r5
            goto L_0x009c
        L_0x009a:
            r38 = r6
        L_0x009c:
            r5 = r44 & 4
            if (r5 == 0) goto L_0x00cd
            androidx.compose.material3.TimePickerDefaults r5 = androidx.compose.material3.TimePickerDefaults.INSTANCE
            r6 = 0
            r8 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r16 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r28 = 0
            r30 = 0
            r32 = 0
            r35 = 0
            r36 = 24576(0x6000, float:3.4438E-41)
            r37 = 16383(0x3fff, float:2.2957E-41)
            r34 = r2
            androidx.compose.material3.TimePickerColors r5 = r5.m1739colorsu3YEpmA(r6, r8, r10, r12, r14, r16, r18, r20, r22, r24, r26, r28, r30, r32, r34, r35, r36, r37)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
            r7 = r5
        L_0x00cd:
            r6 = r38
        L_0x00cf:
            r2.endDefaults()
            boolean r5 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r5 == 0) goto L_0x00df
            r5 = -1
            java.lang.String r8 = "androidx.compose.material3.TimeInput (TimePicker.kt:230)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r3, r5, r8)
        L_0x00df:
            int r0 = r3 >> 3
            r5 = r0 & 14
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | r5
            int r3 = r3 << 6
            r3 = r3 & 896(0x380, float:1.256E-42)
            r0 = r0 | r3
            TimeInputImpl(r6, r7, r1, r2, r0)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0076
            androidx.compose.runtime.ComposerKt.traceEventEnd()
            goto L_0x0076
        L_0x00f9:
            androidx.compose.runtime.ScopeUpdateScope r7 = r2.endRestartGroup()
            if (r7 != 0) goto L_0x0100
            goto L_0x0112
        L_0x0100:
            androidx.compose.material3.TimePickerKt$TimeInput$1 r8 = new androidx.compose.material3.TimePickerKt$TimeInput$1
            r0 = r8
            r1 = r39
            r2 = r6
            r4 = r43
            r5 = r44
            r0.<init>(r1, r2, r3, r4, r5)
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            r7.updateScope(r8)
        L_0x0112:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.TimeInput(androidx.compose.material3.TimePickerState, androidx.compose.ui.Modifier, androidx.compose.material3.TimePickerColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.material3.TimePickerState rememberTimePickerState(int r10, int r11, boolean r12, androidx.compose.runtime.Composer r13, int r14, int r15) {
        /*
            r0 = 1237715277(0x49c6094d, float:1622313.6)
            r13.startReplaceableGroup(r0)
            java.lang.String r1 = "C(rememberTimePickerState)441@21331L14,444@21424L133,442@21368L189:TimePicker.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r13, r1)
            r1 = r15 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0011
            r10 = r2
        L_0x0011:
            r1 = r15 & 2
            if (r1 == 0) goto L_0x0016
            r11 = r2
        L_0x0016:
            r15 = r15 & 4
            if (r15 == 0) goto L_0x001e
            boolean r12 = androidx.compose.material3.TimeFormat_androidKt.is24HourFormat(r13, r2)
        L_0x001e:
            boolean r15 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r15 == 0) goto L_0x002b
            r15 = -1
            java.lang.String r1 = "androidx.compose.material3.rememberTimePickerState (TimePicker.kt:438)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r14, r15, r1)
        L_0x002b:
            java.lang.Object[] r3 = new java.lang.Object[r2]
            androidx.compose.material3.TimePickerState$Companion r14 = androidx.compose.material3.TimePickerState.Companion
            androidx.compose.runtime.saveable.Saver r4 = r14.Saver()
            r5 = 0
            java.lang.Integer r14 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r11)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)
            r1 = 1618982084(0x607fb4c4, float:7.370227E19)
            r13.startReplaceableGroup(r1)
            java.lang.String r1 = "CC(remember)P(1,2,3):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r13, r1)
            boolean r14 = r13.changed((java.lang.Object) r14)
            boolean r15 = r13.changed((java.lang.Object) r15)
            r14 = r14 | r15
            boolean r15 = r13.changed((java.lang.Object) r0)
            r14 = r14 | r15
            java.lang.Object r15 = r13.rememberedValue()
            if (r14 != 0) goto L_0x0067
            androidx.compose.runtime.Composer$Companion r14 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r14 = r14.getEmpty()
            if (r15 != r14) goto L_0x0072
        L_0x0067:
            androidx.compose.material3.TimePickerKt$rememberTimePickerState$1$1 r14 = new androidx.compose.material3.TimePickerKt$rememberTimePickerState$1$1
            r14.<init>(r10, r11, r12)
            r15 = r14
            kotlin.jvm.functions.Function0 r15 = (kotlin.jvm.functions.Function0) r15
            r13.updateRememberedValue(r15)
        L_0x0072:
            r13.endReplaceableGroup()
            r6 = r15
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r8 = 72
            r9 = 4
            r7 = r13
            java.lang.Object r10 = androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable((java.lang.Object[]) r3, r4, (java.lang.String) r5, r6, (androidx.compose.runtime.Composer) r7, (int) r8, (int) r9)
            androidx.compose.material3.TimePickerState r10 = (androidx.compose.material3.TimePickerState) r10
            boolean r11 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r11 == 0) goto L_0x008b
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x008b:
            r13.endReplaceableGroup()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.rememberTimePickerState(int, int, boolean, androidx.compose.runtime.Composer, int, int):androidx.compose.material3.TimePickerState");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void VerticalTimePicker(androidx.compose.material3.TimePickerState r40, androidx.compose.ui.Modifier r41, androidx.compose.material3.TimePickerColors r42, boolean r43, androidx.compose.runtime.Composer r44, int r45, int r46) {
        /*
            r1 = r40
            r4 = r43
            r5 = r45
            java.lang.String r0 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = 310683247(0x1284a66f, float:8.3714E-28)
            r2 = r44
            androidx.compose.runtime.Composer r2 = r2.startRestartGroup(r0)
            java.lang.String r3 = "C(VerticalTimePicker)P(3,2,1)664@28871L8,667@28921L319:TimePicker.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r3)
            r3 = r46 & 1
            if (r3 == 0) goto L_0x0021
            r3 = r5 | 6
            goto L_0x0031
        L_0x0021:
            r3 = r5 & 14
            if (r3 != 0) goto L_0x0030
            boolean r3 = r2.changed((java.lang.Object) r1)
            if (r3 == 0) goto L_0x002d
            r3 = 4
            goto L_0x002e
        L_0x002d:
            r3 = 2
        L_0x002e:
            r3 = r3 | r5
            goto L_0x0031
        L_0x0030:
            r3 = r5
        L_0x0031:
            r6 = r46 & 2
            if (r6 == 0) goto L_0x0038
            r3 = r3 | 48
            goto L_0x004b
        L_0x0038:
            r7 = r5 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x004b
            r7 = r41
            boolean r8 = r2.changed((java.lang.Object) r7)
            if (r8 == 0) goto L_0x0047
            r8 = 32
            goto L_0x0049
        L_0x0047:
            r8 = 16
        L_0x0049:
            r3 = r3 | r8
            goto L_0x004d
        L_0x004b:
            r7 = r41
        L_0x004d:
            r8 = r5 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x0066
            r8 = r46 & 4
            if (r8 != 0) goto L_0x0060
            r8 = r42
            boolean r9 = r2.changed((java.lang.Object) r8)
            if (r9 == 0) goto L_0x0062
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0060:
            r8 = r42
        L_0x0062:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r3 = r3 | r9
            goto L_0x0068
        L_0x0066:
            r8 = r42
        L_0x0068:
            r9 = r46 & 8
            if (r9 == 0) goto L_0x006f
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x007f
        L_0x006f:
            r9 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x007f
            boolean r9 = r2.changed((boolean) r4)
            if (r9 == 0) goto L_0x007c
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x007e
        L_0x007c:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x007e:
            r3 = r3 | r9
        L_0x007f:
            r9 = r3 & 5851(0x16db, float:8.199E-42)
            r10 = 1170(0x492, float:1.64E-42)
            if (r9 != r10) goto L_0x0092
            boolean r9 = r2.getSkipping()
            if (r9 != 0) goto L_0x008c
            goto L_0x0092
        L_0x008c:
            r2.skipToGroupEnd()
            r3 = r8
            goto L_0x0236
        L_0x0092:
            r2.startDefaults()
            r9 = r5 & 1
            if (r9 == 0) goto L_0x00ac
            boolean r9 = r2.getDefaultsInvalid()
            if (r9 == 0) goto L_0x00a0
            goto L_0x00ac
        L_0x00a0:
            r2.skipToGroupEnd()
            r6 = r46 & 4
            if (r6 == 0) goto L_0x00a9
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00a9:
            r39 = r7
            goto L_0x00e8
        L_0x00ac:
            if (r6 == 0) goto L_0x00b5
            androidx.compose.ui.Modifier$Companion r6 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r6 = (androidx.compose.ui.Modifier) r6
            r39 = r6
            goto L_0x00b7
        L_0x00b5:
            r39 = r7
        L_0x00b7:
            r6 = r46 & 4
            if (r6 == 0) goto L_0x00e8
            androidx.compose.material3.TimePickerDefaults r6 = androidx.compose.material3.TimePickerDefaults.INSTANCE
            r7 = 0
            r9 = 0
            r11 = 0
            r13 = 0
            r15 = 0
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r33 = 0
            r36 = 0
            r37 = 24576(0x6000, float:3.4438E-41)
            r38 = 16383(0x3fff, float:2.2957E-41)
            r35 = r2
            androidx.compose.material3.TimePickerColors r6 = r6.m1739colorsu3YEpmA(r7, r9, r11, r13, r15, r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r36, r37, r38)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
            r8 = r6
        L_0x00e8:
            r2.endDefaults()
            boolean r6 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r6 == 0) goto L_0x00f8
            r6 = -1
            java.lang.String r7 = "androidx.compose.material3.VerticalTimePicker (TimePicker.kt:661)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r3, r6, r7)
        L_0x00f8:
            androidx.compose.ui.Alignment$Companion r0 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment$Horizontal r0 = r0.getCenterHorizontally()
            int r6 = r3 >> 3
            r7 = r6 & 14
            r7 = r7 | 384(0x180, float:5.38E-43)
            r9 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r2.startReplaceableGroup(r9)
            java.lang.String r9 = "CC(Column)P(2,3,1)77@3913L61,78@3979L133:Column.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r9)
            androidx.compose.foundation.layout.Arrangement r9 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            androidx.compose.foundation.layout.Arrangement$Vertical r9 = r9.getTop()
            int r10 = r7 >> 3
            r11 = r10 & 14
            r10 = r10 & 112(0x70, float:1.57E-43)
            r10 = r10 | r11
            androidx.compose.ui.layout.MeasurePolicy r0 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(r9, r0, r2, r10)
            int r7 = r7 << 3
            r7 = r7 & 112(0x70, float:1.57E-43)
            r9 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r2.startReplaceableGroup(r9)
            java.lang.String r9 = "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh"
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r9)
            androidx.compose.runtime.ProvidableCompositionLocal r9 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r9 = (androidx.compose.runtime.CompositionLocal) r9
            r10 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r11 = "C:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r10, r11)
            java.lang.Object r9 = r2.consume(r9)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.ui.unit.Density r9 = (androidx.compose.ui.unit.Density) r9
            androidx.compose.runtime.ProvidableCompositionLocal r12 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            androidx.compose.runtime.CompositionLocal r12 = (androidx.compose.runtime.CompositionLocal) r12
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r10, r11)
            java.lang.Object r12 = r2.consume(r12)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.ui.unit.LayoutDirection r12 = (androidx.compose.ui.unit.LayoutDirection) r12
            androidx.compose.runtime.ProvidableCompositionLocal r13 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            androidx.compose.runtime.CompositionLocal r13 = (androidx.compose.runtime.CompositionLocal) r13
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r10, r11)
            java.lang.Object r10 = r2.consume(r13)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.ui.platform.ViewConfiguration r10 = (androidx.compose.ui.platform.ViewConfiguration) r10
            androidx.compose.ui.node.ComposeUiNode$Companion r11 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function0 r11 = r11.getConstructor()
            kotlin.jvm.functions.Function3 r13 = androidx.compose.ui.layout.LayoutKt.materializerOf(r39)
            int r7 = r7 << 9
            r7 = r7 & 7168(0x1c00, float:1.0045E-41)
            r14 = 6
            r7 = r7 | r14
            androidx.compose.runtime.Applier r15 = r2.getApplier()
            boolean r15 = r15 instanceof androidx.compose.runtime.Applier
            if (r15 != 0) goto L_0x0185
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x0185:
            r2.startReusableNode()
            boolean r15 = r2.getInserting()
            if (r15 == 0) goto L_0x0192
            r2.createNode(r11)
            goto L_0x0195
        L_0x0192:
            r2.useNode()
        L_0x0195:
            r2.disableReusing()
            androidx.compose.runtime.Composer r11 = androidx.compose.runtime.Updater.m2444constructorimpl(r2)
            androidx.compose.ui.node.ComposeUiNode$Companion r15 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r15 = r15.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r11, r0, r15)
            androidx.compose.ui.node.ComposeUiNode$Companion r0 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r0 = r0.getSetDensity()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r11, r9, r0)
            androidx.compose.ui.node.ComposeUiNode$Companion r0 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r0 = r0.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r11, r12, r0)
            androidx.compose.ui.node.ComposeUiNode$Companion r0 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r0 = r0.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r11, r10, r0)
            r2.enableReusing()
            androidx.compose.runtime.Composer r0 = androidx.compose.runtime.SkippableUpdater.m2436constructorimpl(r2)
            androidx.compose.runtime.SkippableUpdater r0 = androidx.compose.runtime.SkippableUpdater.m2435boximpl(r0)
            int r7 = r7 >> 3
            r7 = r7 & 112(0x70, float:1.57E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r13.invoke(r0, r2, r7)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r2.startReplaceableGroup(r0)
            r0 = 276693704(0x107e02c8, float:5.009481E-29)
            java.lang.String r7 = "C79@4027L9:Column.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r0, r7)
            androidx.compose.foundation.layout.ColumnScopeInstance r0 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE
            androidx.compose.foundation.layout.ColumnScope r0 = (androidx.compose.foundation.layout.ColumnScope) r0
            r0 = 37436160(0x23b3b00, float:1.3755522E-37)
            java.lang.String r7 = "C668@29011L35,669@29055L60,670@29124L44,671@29177L57:TimePicker.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r0, r7)
            r0 = r3 & 14
            r3 = r6 & 112(0x70, float:1.57E-43)
            r0 = r0 | r3
            VerticalClockDisplay(r1, r8, r2, r0)
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r3 = (androidx.compose.ui.Modifier) r3
            float r7 = ClockDisplayBottomMargin
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.SizeKt.m549height3ABfNKs(r3, r7)
            androidx.compose.foundation.layout.SpacerKt.Spacer(r3, r2, r14)
            r3 = r6 & 896(0x380, float:1.256E-42)
            r0 = r0 | r3
            ClockFace(r1, r8, r4, r2, r0)
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            float r3 = ClockFaceBottomMargin
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.m549height3ABfNKs(r0, r3)
            androidx.compose.foundation.layout.SpacerKt.Spacer(r0, r2, r14)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            r2.endReplaceableGroup()
            r2.endNode()
            r2.endReplaceableGroup()
            r2.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0233
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0233:
            r3 = r8
            r7 = r39
        L_0x0236:
            androidx.compose.runtime.ScopeUpdateScope r8 = r2.endRestartGroup()
            if (r8 != 0) goto L_0x023d
            goto L_0x0251
        L_0x023d:
            androidx.compose.material3.TimePickerKt$VerticalTimePicker$2 r9 = new androidx.compose.material3.TimePickerKt$VerticalTimePicker$2
            r0 = r9
            r1 = r40
            r2 = r7
            r4 = r43
            r5 = r45
            r6 = r46
            r0.<init>(r1, r2, r3, r4, r5, r6)
            kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
            r8.updateScope(r9)
        L_0x0251:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.VerticalTimePicker(androidx.compose.material3.TimePickerState, androidx.compose.ui.Modifier, androidx.compose.material3.TimePickerColors, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0229  */
    /* JADX WARNING: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void HorizontalTimePicker(androidx.compose.material3.TimePickerState r40, androidx.compose.ui.Modifier r41, androidx.compose.material3.TimePickerColors r42, boolean r43, androidx.compose.runtime.Composer r44, int r45, int r46) {
        /*
            r1 = r40
            r4 = r43
            r5 = r45
            java.lang.String r0 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = 5079681(0x4d8281, float:7.118149E-39)
            r2 = r44
            androidx.compose.runtime.Composer r2 = r2.startRestartGroup(r0)
            java.lang.String r3 = "C(HorizontalTimePicker)P(3,2,1)679@29404L8,682@29454L309:TimePicker.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r3)
            r3 = r46 & 1
            if (r3 == 0) goto L_0x0021
            r3 = r5 | 6
            goto L_0x0031
        L_0x0021:
            r3 = r5 & 14
            if (r3 != 0) goto L_0x0030
            boolean r3 = r2.changed((java.lang.Object) r1)
            if (r3 == 0) goto L_0x002d
            r3 = 4
            goto L_0x002e
        L_0x002d:
            r3 = 2
        L_0x002e:
            r3 = r3 | r5
            goto L_0x0031
        L_0x0030:
            r3 = r5
        L_0x0031:
            r6 = r46 & 2
            if (r6 == 0) goto L_0x0038
            r3 = r3 | 48
            goto L_0x004b
        L_0x0038:
            r7 = r5 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x004b
            r7 = r41
            boolean r8 = r2.changed((java.lang.Object) r7)
            if (r8 == 0) goto L_0x0047
            r8 = 32
            goto L_0x0049
        L_0x0047:
            r8 = 16
        L_0x0049:
            r3 = r3 | r8
            goto L_0x004d
        L_0x004b:
            r7 = r41
        L_0x004d:
            r8 = r5 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x0066
            r8 = r46 & 4
            if (r8 != 0) goto L_0x0060
            r8 = r42
            boolean r9 = r2.changed((java.lang.Object) r8)
            if (r9 == 0) goto L_0x0062
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0060:
            r8 = r42
        L_0x0062:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r3 = r3 | r9
            goto L_0x0068
        L_0x0066:
            r8 = r42
        L_0x0068:
            r9 = r46 & 8
            if (r9 == 0) goto L_0x006f
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x007f
        L_0x006f:
            r9 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x007f
            boolean r9 = r2.changed((boolean) r4)
            if (r9 == 0) goto L_0x007c
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x007e
        L_0x007c:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x007e:
            r3 = r3 | r9
        L_0x007f:
            r9 = r3 & 5851(0x16db, float:8.199E-42)
            r10 = 1170(0x492, float:1.64E-42)
            if (r9 != r10) goto L_0x0092
            boolean r9 = r2.getSkipping()
            if (r9 != 0) goto L_0x008c
            goto L_0x0092
        L_0x008c:
            r2.skipToGroupEnd()
            r3 = r8
            goto L_0x0222
        L_0x0092:
            r2.startDefaults()
            r9 = r5 & 1
            if (r9 == 0) goto L_0x00ac
            boolean r9 = r2.getDefaultsInvalid()
            if (r9 == 0) goto L_0x00a0
            goto L_0x00ac
        L_0x00a0:
            r2.skipToGroupEnd()
            r6 = r46 & 4
            if (r6 == 0) goto L_0x00a9
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00a9:
            r39 = r7
            goto L_0x00e8
        L_0x00ac:
            if (r6 == 0) goto L_0x00b5
            androidx.compose.ui.Modifier$Companion r6 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r6 = (androidx.compose.ui.Modifier) r6
            r39 = r6
            goto L_0x00b7
        L_0x00b5:
            r39 = r7
        L_0x00b7:
            r6 = r46 & 4
            if (r6 == 0) goto L_0x00e8
            androidx.compose.material3.TimePickerDefaults r6 = androidx.compose.material3.TimePickerDefaults.INSTANCE
            r7 = 0
            r9 = 0
            r11 = 0
            r13 = 0
            r15 = 0
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r33 = 0
            r36 = 0
            r37 = 24576(0x6000, float:3.4438E-41)
            r38 = 16383(0x3fff, float:2.2957E-41)
            r35 = r2
            androidx.compose.material3.TimePickerColors r6 = r6.m1739colorsu3YEpmA(r7, r9, r11, r13, r15, r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r36, r37, r38)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x00e9
        L_0x00e8:
            r6 = r8
        L_0x00e9:
            r2.endDefaults()
            boolean r7 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r7 == 0) goto L_0x00f9
            r7 = -1
            java.lang.String r8 = "androidx.compose.material3.HorizontalTimePicker (TimePicker.kt:676)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r3, r7, r8)
        L_0x00f9:
            r8 = 0
            r9 = 0
            r10 = 0
            float r11 = ClockFaceBottomMargin
            r12 = 7
            r13 = 0
            r7 = r39
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.PaddingKt.m497paddingqDBjuR0$default(r7, r8, r9, r10, r11, r12, r13)
            androidx.compose.ui.Alignment$Companion r7 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment$Vertical r7 = r7.getCenterVertically()
            r8 = 693286680(0x2952b718, float:4.6788176E-14)
            r2.startReplaceableGroup(r8)
            java.lang.String r8 = "CC(Row)P(2,1,3)78@3913L58,79@3976L130:Row.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r8)
            androidx.compose.foundation.layout.Arrangement r8 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            androidx.compose.foundation.layout.Arrangement$Horizontal r8 = r8.getStart()
            r9 = 48
            androidx.compose.ui.layout.MeasurePolicy r7 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(r8, r7, r2, r9)
            r8 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r2.startReplaceableGroup(r8)
            java.lang.String r8 = "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh"
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r8)
            androidx.compose.runtime.ProvidableCompositionLocal r8 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r8 = (androidx.compose.runtime.CompositionLocal) r8
            r9 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r10 = "C:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r9, r10)
            java.lang.Object r8 = r2.consume(r8)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.ui.unit.Density r8 = (androidx.compose.ui.unit.Density) r8
            androidx.compose.runtime.ProvidableCompositionLocal r11 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            androidx.compose.runtime.CompositionLocal r11 = (androidx.compose.runtime.CompositionLocal) r11
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r9, r10)
            java.lang.Object r11 = r2.consume(r11)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.ui.unit.LayoutDirection r11 = (androidx.compose.ui.unit.LayoutDirection) r11
            androidx.compose.runtime.ProvidableCompositionLocal r12 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            androidx.compose.runtime.CompositionLocal r12 = (androidx.compose.runtime.CompositionLocal) r12
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r9, r10)
            java.lang.Object r9 = r2.consume(r12)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.ui.platform.ViewConfiguration r9 = (androidx.compose.ui.platform.ViewConfiguration) r9
            androidx.compose.ui.node.ComposeUiNode$Companion r10 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function0 r10 = r10.getConstructor()
            kotlin.jvm.functions.Function3 r0 = androidx.compose.ui.layout.LayoutKt.materializerOf(r0)
            androidx.compose.runtime.Applier r12 = r2.getApplier()
            boolean r12 = r12 instanceof androidx.compose.runtime.Applier
            if (r12 != 0) goto L_0x017e
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x017e:
            r2.startReusableNode()
            boolean r12 = r2.getInserting()
            if (r12 == 0) goto L_0x018b
            r2.createNode(r10)
            goto L_0x018e
        L_0x018b:
            r2.useNode()
        L_0x018e:
            r2.disableReusing()
            androidx.compose.runtime.Composer r10 = androidx.compose.runtime.Updater.m2444constructorimpl(r2)
            androidx.compose.ui.node.ComposeUiNode$Companion r12 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r12 = r12.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r10, r7, r12)
            androidx.compose.ui.node.ComposeUiNode$Companion r7 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r7 = r7.getSetDensity()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r10, r8, r7)
            androidx.compose.ui.node.ComposeUiNode$Companion r7 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r7 = r7.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r10, r11, r7)
            androidx.compose.ui.node.ComposeUiNode$Companion r7 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r7 = r7.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r10, r9, r7)
            r2.enableReusing()
            androidx.compose.runtime.Composer r7 = androidx.compose.runtime.SkippableUpdater.m2436constructorimpl(r2)
            androidx.compose.runtime.SkippableUpdater r7 = androidx.compose.runtime.SkippableUpdater.m2435boximpl(r7)
            r8 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r0.invoke(r7, r2, r8)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r2.startReplaceableGroup(r0)
            r0 = -326682283(0xffffffffec873955, float:-1.3078058E27)
            java.lang.String r7 = "C80@4021L9:Row.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r0, r7)
            androidx.compose.foundation.layout.RowScopeInstance r0 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE
            androidx.compose.foundation.layout.RowScope r0 = (androidx.compose.foundation.layout.RowScope) r0
            r0 = -321635938(0xffffffffecd4399e, float:-2.0525149E27)
            java.lang.String r7 = "C686@29599L37,687@29645L59,688@29713L44:TimePicker.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r0, r7)
            r0 = r3 & 14
            int r3 = r3 >> 3
            r7 = r3 & 112(0x70, float:1.57E-43)
            r0 = r0 | r7
            HorizontalClockDisplay(r1, r6, r2, r0)
            androidx.compose.ui.Modifier$Companion r7 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r7 = (androidx.compose.ui.Modifier) r7
            float r8 = ClockDisplayBottomMargin
            androidx.compose.ui.Modifier r7 = androidx.compose.foundation.layout.SizeKt.m568width3ABfNKs(r7, r8)
            r8 = 6
            androidx.compose.foundation.layout.SpacerKt.Spacer(r7, r2, r8)
            r3 = r3 & 896(0x380, float:1.256E-42)
            r0 = r0 | r3
            ClockFace(r1, r6, r4, r2, r0)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            r2.endReplaceableGroup()
            r2.endNode()
            r2.endReplaceableGroup()
            r2.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x021f
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x021f:
            r3 = r6
            r7 = r39
        L_0x0222:
            androidx.compose.runtime.ScopeUpdateScope r8 = r2.endRestartGroup()
            if (r8 != 0) goto L_0x0229
            goto L_0x023d
        L_0x0229:
            androidx.compose.material3.TimePickerKt$HorizontalTimePicker$2 r9 = new androidx.compose.material3.TimePickerKt$HorizontalTimePicker$2
            r0 = r9
            r1 = r40
            r2 = r7
            r4 = r43
            r5 = r45
            r6 = r46
            r0.<init>(r1, r2, r3, r4, r5, r6)
            kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
            r8.updateScope(r9)
        L_0x023d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.HorizontalTimePicker(androidx.compose.material3.TimePickerState, androidx.compose.ui.Modifier, androidx.compose.material3.TimePickerColors, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: kotlin.jvm.functions.Function0} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void TimeInputImpl(androidx.compose.ui.Modifier r50, androidx.compose.material3.TimePickerColors r51, androidx.compose.material3.TimePickerState r52, androidx.compose.runtime.Composer r53, int r54) {
        /*
            r7 = r50
            r8 = r51
            r9 = r52
            r10 = r54
            r0 = -475657989(0xffffffffe3a608fb, float:-6.125613E21)
            r1 = r53
            androidx.compose.runtime.Composer r6 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(TimeInputImpl)P(1)698@29965L92,698@29913L144,701@30133L84,701@30081L136,705@30223L3592:TimePicker.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r6, r1)
            r1 = r10 & 14
            if (r1 != 0) goto L_0x0025
            boolean r1 = r6.changed((java.lang.Object) r7)
            if (r1 == 0) goto L_0x0022
            r1 = 4
            goto L_0x0023
        L_0x0022:
            r1 = 2
        L_0x0023:
            r1 = r1 | r10
            goto L_0x0026
        L_0x0025:
            r1 = r10
        L_0x0026:
            r2 = r10 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0036
            boolean r2 = r6.changed((java.lang.Object) r8)
            if (r2 == 0) goto L_0x0033
            r2 = 32
            goto L_0x0035
        L_0x0033:
            r2 = 16
        L_0x0035:
            r1 = r1 | r2
        L_0x0036:
            r2 = r10 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x0046
            boolean r2 = r6.changed((java.lang.Object) r9)
            if (r2 == 0) goto L_0x0043
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0045
        L_0x0043:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0045:
            r1 = r1 | r2
        L_0x0046:
            r5 = r1
            r1 = r5 & 731(0x2db, float:1.024E-42)
            r2 = 146(0x92, float:2.05E-43)
            if (r1 != r2) goto L_0x005a
            boolean r1 = r6.getSkipping()
            if (r1 != 0) goto L_0x0054
            goto L_0x005a
        L_0x0054:
            r6.skipToGroupEnd()
            r13 = r6
            goto L_0x03a3
        L_0x005a:
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x0067
            r1 = -1
            java.lang.String r2 = "androidx.compose.material3.TimeInputImpl (TimePicker.kt:693)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r5, r1, r2)
        L_0x0067:
            r4 = 0
            java.lang.Object[] r11 = new java.lang.Object[r4]
            androidx.compose.ui.text.input.TextFieldValue$Companion r0 = androidx.compose.ui.text.input.TextFieldValue.Companion
            androidx.compose.runtime.saveable.Saver r12 = r0.getSaver()
            r13 = 0
            r0 = 1157296644(0x44faf204, float:2007.563)
            r6.startReplaceableGroup(r0)
            java.lang.String r1 = "CC(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r6, r1)
            boolean r2 = r6.changed((java.lang.Object) r9)
            java.lang.Object r3 = r6.rememberedValue()
            if (r2 != 0) goto L_0x008e
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r3 != r2) goto L_0x0099
        L_0x008e:
            androidx.compose.material3.TimePickerKt$TimeInputImpl$hourValue$2$1 r2 = new androidx.compose.material3.TimePickerKt$TimeInputImpl$hourValue$2$1
            r2.<init>(r9)
            r3 = r2
            kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
            r6.updateRememberedValue(r3)
        L_0x0099:
            r6.endReplaceableGroup()
            r14 = r3
            kotlin.jvm.functions.Function0 r14 = (kotlin.jvm.functions.Function0) r14
            r16 = 72
            r17 = 4
            r15 = r6
            androidx.compose.runtime.MutableState r18 = androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable((java.lang.Object[]) r11, r12, (java.lang.String) r13, r14, (androidx.compose.runtime.Composer) r15, (int) r16, (int) r17)
            java.lang.Object[] r11 = new java.lang.Object[r4]
            androidx.compose.ui.text.input.TextFieldValue$Companion r2 = androidx.compose.ui.text.input.TextFieldValue.Companion
            androidx.compose.runtime.saveable.Saver r12 = r2.getSaver()
            r13 = 0
            r6.startReplaceableGroup(r0)
            androidx.compose.runtime.ComposerKt.sourceInformation(r6, r1)
            boolean r0 = r6.changed((java.lang.Object) r9)
            java.lang.Object r1 = r6.rememberedValue()
            if (r0 != 0) goto L_0x00c9
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r0 = r0.getEmpty()
            if (r1 != r0) goto L_0x00d4
        L_0x00c9:
            androidx.compose.material3.TimePickerKt$TimeInputImpl$minuteValue$2$1 r0 = new androidx.compose.material3.TimePickerKt$TimeInputImpl$minuteValue$2$1
            r0.<init>(r9)
            r1 = r0
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r6.updateRememberedValue(r1)
        L_0x00d4:
            r6.endReplaceableGroup()
            r14 = r1
            kotlin.jvm.functions.Function0 r14 = (kotlin.jvm.functions.Function0) r14
            r16 = 72
            r17 = 4
            r15 = r6
            androidx.compose.runtime.MutableState r11 = androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable((java.lang.Object[]) r11, r12, (java.lang.String) r13, r14, (androidx.compose.runtime.Composer) r15, (int) r16, (int) r17)
            r1 = 0
            r2 = 0
            r3 = 0
            float r12 = TimeInputBottomPadding
            r13 = 7
            r14 = 0
            r0 = r50
            r15 = r4
            r4 = r12
            r12 = r5
            r5 = r13
            r13 = r6
            r6 = r14
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.PaddingKt.m497paddingqDBjuR0$default(r0, r1, r2, r3, r4, r5, r6)
            androidx.compose.ui.Alignment$Companion r1 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment$Vertical r1 = r1.getTop()
            r2 = 693286680(0x2952b718, float:4.6788176E-14)
            r13.startReplaceableGroup(r2)
            java.lang.String r2 = "CC(Row)P(2,1,3)78@3913L58,79@3976L130:Row.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformation(r13, r2)
            androidx.compose.foundation.layout.Arrangement r2 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            androidx.compose.foundation.layout.Arrangement$Horizontal r2 = r2.getStart()
            r3 = 48
            androidx.compose.ui.layout.MeasurePolicy r1 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(r2, r1, r13, r3)
            r14 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r13.startReplaceableGroup(r14)
            java.lang.String r6 = "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh"
            androidx.compose.runtime.ComposerKt.sourceInformation(r13, r6)
            androidx.compose.runtime.ProvidableCompositionLocal r2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r2 = (androidx.compose.runtime.CompositionLocal) r2
            r5 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r4 = "C:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r13, r5, r4)
            java.lang.Object r2 = r13.consume(r2)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r13)
            androidx.compose.ui.unit.Density r2 = (androidx.compose.ui.unit.Density) r2
            androidx.compose.runtime.ProvidableCompositionLocal r3 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            androidx.compose.runtime.CompositionLocal r3 = (androidx.compose.runtime.CompositionLocal) r3
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r13, r5, r4)
            java.lang.Object r3 = r13.consume(r3)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r13)
            androidx.compose.ui.unit.LayoutDirection r3 = (androidx.compose.ui.unit.LayoutDirection) r3
            androidx.compose.runtime.ProvidableCompositionLocal r16 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            r14 = r16
            androidx.compose.runtime.CompositionLocal r14 = (androidx.compose.runtime.CompositionLocal) r14
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r13, r5, r4)
            java.lang.Object r14 = r13.consume(r14)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r13)
            androidx.compose.ui.platform.ViewConfiguration r14 = (androidx.compose.ui.platform.ViewConfiguration) r14
            androidx.compose.ui.node.ComposeUiNode$Companion r16 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function0 r5 = r16.getConstructor()
            kotlin.jvm.functions.Function3 r0 = androidx.compose.ui.layout.LayoutKt.materializerOf(r0)
            androidx.compose.runtime.Applier r15 = r13.getApplier()
            boolean r15 = r15 instanceof androidx.compose.runtime.Applier
            if (r15 != 0) goto L_0x0170
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x0170:
            r13.startReusableNode()
            boolean r15 = r13.getInserting()
            if (r15 == 0) goto L_0x017d
            r13.createNode(r5)
            goto L_0x0180
        L_0x017d:
            r13.useNode()
        L_0x0180:
            r13.disableReusing()
            androidx.compose.runtime.Composer r5 = androidx.compose.runtime.Updater.m2444constructorimpl(r13)
            androidx.compose.ui.node.ComposeUiNode$Companion r15 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r15 = r15.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r5, r1, r15)
            androidx.compose.ui.node.ComposeUiNode$Companion r1 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r1 = r1.getSetDensity()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r5, r2, r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r1 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r1 = r1.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r5, r3, r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r1 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r1 = r1.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r5, r14, r1)
            r13.enableReusing()
            androidx.compose.runtime.Composer r1 = androidx.compose.runtime.SkippableUpdater.m2436constructorimpl(r13)
            androidx.compose.runtime.SkippableUpdater r1 = androidx.compose.runtime.SkippableUpdater.m2435boximpl(r1)
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.invoke(r1, r13, r3)
            r14 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r13.startReplaceableGroup(r14)
            r0 = -326682283(0xffffffffec873955, float:-1.3078058E27)
            java.lang.String r1 = "C80@4021L9:Row.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r13, r0, r1)
            androidx.compose.foundation.layout.RowScopeInstance r0 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE
            androidx.compose.foundation.layout.RowScope r0 = (androidx.compose.foundation.layout.RowScope) r0
            r0 = -1230444741(0xffffffffb6a8e73b, float:-5.033709E-6)
            java.lang.String r1 = "C709@30386L10,715@30597L2787:TimePicker.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r13, r0, r1)
            androidx.compose.material3.MaterialTheme r0 = androidx.compose.material3.MaterialTheme.INSTANCE
            r15 = 6
            androidx.compose.material3.Typography r0 = r0.getTypography(r13, r15)
            androidx.compose.material3.tokens.TimeInputTokens r1 = androidx.compose.material3.tokens.TimeInputTokens.INSTANCE
            androidx.compose.material3.tokens.TypographyKeyTokens r1 = r1.getTimeFieldLabelTextFont()
            androidx.compose.ui.text.TextStyle r19 = androidx.compose.material3.TypographyKt.fromToken(r0, r1)
            androidx.compose.ui.text.style.TextAlign$Companion r0 = androidx.compose.ui.text.style.TextAlign.Companion
            int r0 = r0.m5506getCentere0LSkKk()
            r5 = 1
            long r20 = r8.m1738timeSelectorContentColorvNxB06k$material3_release(r5)
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r36 = 0
            r37 = 0
            androidx.compose.ui.text.style.TextAlign r38 = androidx.compose.ui.text.style.TextAlign.m5499boximpl(r0)
            r39 = 0
            r40 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r47 = 4177918(0x3fbffe, float:5.85451E-39)
            r48 = 0
            androidx.compose.ui.text.TextStyle r0 = androidx.compose.ui.text.TextStyle.m5139copyCXVQc50$default(r19, r20, r22, r24, r25, r26, r27, r28, r29, r31, r32, r33, r34, r36, r37, r38, r39, r40, r42, r43, r44, r45, r46, r47, r48)
            androidx.compose.runtime.ProvidedValue[] r3 = new androidx.compose.runtime.ProvidedValue[r5]
            androidx.compose.runtime.ProvidableCompositionLocal r1 = androidx.compose.material3.TextKt.getLocalTextStyle()
            androidx.compose.runtime.ProvidedValue r0 = r1.provides(r0)
            r1 = 0
            r3[r1] = r0
            androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1 r2 = new androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1
            r0 = r2
            r1 = r18
            r15 = r2
            r2 = r52
            r14 = r3
            r3 = r12
            r49 = r4
            r4 = r51
            r20 = r6
            r6 = r5
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = 1306700887(0x4de2ac57, float:4.7536816E8)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r13, r0, r6, r15)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1 = 56
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) r14, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) r0, (androidx.compose.runtime.Composer) r13, (int) r1)
            r0 = 565119480(0x21af09f8, float:1.18611E-18)
            r13.startReplaceableGroup(r0)
            java.lang.String r0 = "786@33429L370"
            androidx.compose.runtime.ComposerKt.sourceInformation(r13, r0)
            boolean r0 = r52.is24hour()
            if (r0 != 0) goto L_0x0385
            float r1 = PeriodToggleMargin
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 14
            r6 = 0
            r0 = r50
            r11 = r20
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.PaddingKt.m497paddingqDBjuR0$default(r0, r1, r2, r3, r4, r5, r6)
            r1 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r13.startReplaceableGroup(r1)
            java.lang.String r1 = "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformation(r13, r1)
            androidx.compose.ui.Alignment$Companion r1 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment r1 = r1.getTopStart()
            r2 = 0
            androidx.compose.ui.layout.MeasurePolicy r1 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(r1, r2, r13, r2)
            r2 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r13.startReplaceableGroup(r2)
            androidx.compose.runtime.ComposerKt.sourceInformation(r13, r11)
            androidx.compose.runtime.ProvidableCompositionLocal r2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r2 = (androidx.compose.runtime.CompositionLocal) r2
            r3 = r49
            r4 = 2023513938(0x789c5f52, float:2.5372864E34)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r13, r4, r3)
            java.lang.Object r2 = r13.consume(r2)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r13)
            androidx.compose.ui.unit.Density r2 = (androidx.compose.ui.unit.Density) r2
            androidx.compose.runtime.ProvidableCompositionLocal r5 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            androidx.compose.runtime.CompositionLocal r5 = (androidx.compose.runtime.CompositionLocal) r5
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r13, r4, r3)
            java.lang.Object r5 = r13.consume(r5)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r13)
            androidx.compose.ui.unit.LayoutDirection r5 = (androidx.compose.ui.unit.LayoutDirection) r5
            androidx.compose.runtime.ProvidableCompositionLocal r6 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            androidx.compose.runtime.CompositionLocal r6 = (androidx.compose.runtime.CompositionLocal) r6
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r13, r4, r3)
            java.lang.Object r3 = r13.consume(r6)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r13)
            androidx.compose.ui.platform.ViewConfiguration r3 = (androidx.compose.ui.platform.ViewConfiguration) r3
            androidx.compose.ui.node.ComposeUiNode$Companion r4 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function0 r4 = r4.getConstructor()
            kotlin.jvm.functions.Function3 r0 = androidx.compose.ui.layout.LayoutKt.materializerOf(r0)
            androidx.compose.runtime.Applier r6 = r13.getApplier()
            boolean r6 = r6 instanceof androidx.compose.runtime.Applier
            if (r6 != 0) goto L_0x02e9
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x02e9:
            r13.startReusableNode()
            boolean r6 = r13.getInserting()
            if (r6 == 0) goto L_0x02f6
            r13.createNode(r4)
            goto L_0x02f9
        L_0x02f6:
            r13.useNode()
        L_0x02f9:
            r13.disableReusing()
            androidx.compose.runtime.Composer r4 = androidx.compose.runtime.Updater.m2444constructorimpl(r13)
            androidx.compose.ui.node.ComposeUiNode$Companion r6 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r6 = r6.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r4, r1, r6)
            androidx.compose.ui.node.ComposeUiNode$Companion r1 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r1 = r1.getSetDensity()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r4, r2, r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r1 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r1 = r1.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r4, r5, r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r1 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r1 = r1.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r4, r3, r1)
            r13.enableReusing()
            androidx.compose.runtime.Composer r1 = androidx.compose.runtime.SkippableUpdater.m2436constructorimpl(r13)
            androidx.compose.runtime.SkippableUpdater r1 = androidx.compose.runtime.SkippableUpdater.m2435boximpl(r1)
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.invoke(r1, r13, r2)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r13.startReplaceableGroup(r0)
            r0 = -1253629305(0xffffffffb5472287, float:-7.418352E-7)
            java.lang.String r1 = "C72@3384L9:Box.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r13, r0, r1)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE
            androidx.compose.foundation.layout.BoxScope r0 = (androidx.compose.foundation.layout.BoxScope) r0
            r0 = -1645137119(0xffffffff9df13321, float:-6.3845035E-21)
            java.lang.String r1 = "C787@33497L288:TimePicker.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r13, r0, r1)
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            androidx.compose.material3.tokens.TimeInputTokens r1 = androidx.compose.material3.tokens.TimeInputTokens.INSTANCE
            float r1 = r1.m2336getPeriodSelectorContainerWidthD9Ej5fM()
            androidx.compose.material3.tokens.TimeInputTokens r2 = androidx.compose.material3.tokens.TimeInputTokens.INSTANCE
            float r2 = r2.m2335getPeriodSelectorContainerHeightD9Ej5fM()
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.m565sizeVpY3zN4(r0, r1, r2)
            int r1 = r12 >> 3
            r1 = r1 & 112(0x70, float:1.57E-43)
            r2 = 6
            r1 = r1 | r2
            int r2 = r12 << 3
            r2 = r2 & 896(0x380, float:1.256E-42)
            r1 = r1 | r2
            VerticalPeriodToggle(r0, r9, r8, r13, r1)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r13)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r13)
            r13.endReplaceableGroup()
            r13.endNode()
            r13.endReplaceableGroup()
            r13.endReplaceableGroup()
        L_0x0385:
            r13.endReplaceableGroup()
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r13)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r13)
            r13.endReplaceableGroup()
            r13.endNode()
            r13.endReplaceableGroup()
            r13.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x03a3
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x03a3:
            androidx.compose.runtime.ScopeUpdateScope r0 = r13.endRestartGroup()
            if (r0 != 0) goto L_0x03aa
            goto L_0x03b4
        L_0x03aa:
            androidx.compose.material3.TimePickerKt$TimeInputImpl$2 r1 = new androidx.compose.material3.TimePickerKt$TimeInputImpl$2
            r1.<init>(r7, r8, r9, r10)
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            r0.updateScope(r1)
        L_0x03b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.TimeInputImpl(androidx.compose.ui.Modifier, androidx.compose.material3.TimePickerColors, androidx.compose.material3.TimePickerState, androidx.compose.runtime.Composer, int):void");
    }

    /* access modifiers changed from: private */
    public static final TextFieldValue TimeInputImpl$lambda$5(MutableState<TextFieldValue> mutableState) {
        return (TextFieldValue) mutableState.getValue();
    }

    /* access modifiers changed from: private */
    public static final TextFieldValue TimeInputImpl$lambda$8(MutableState<TextFieldValue> mutableState) {
        return (TextFieldValue) mutableState.getValue();
    }

    /* access modifiers changed from: private */
    public static final void HorizontalClockDisplay(TimePickerState timePickerState, TimePickerColors timePickerColors, Composer composer, int i) {
        int i2;
        TimePickerState timePickerState2 = timePickerState;
        TimePickerColors timePickerColors2 = timePickerColors;
        int i3 = i;
        Composer startRestartGroup = composer.startRestartGroup(755539561);
        ComposerKt.sourceInformation(startRestartGroup, "C(HorizontalClockDisplay)P(1)802@33922L554:TimePicker.kt#uh7d8r");
        if ((i3 & 14) == 0) {
            i2 = (startRestartGroup.changed((Object) timePickerState2) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i3 & 112) == 0) {
            i2 |= startRestartGroup.changed((Object) timePickerColors2) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(755539561, i2, -1, "androidx.compose.material3.HorizontalClockDisplay (TimePicker.kt:801)");
            }
            startRestartGroup.startReplaceableGroup(-483455358);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)77@3913L61,78@3979L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.Companion.getStart(), startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density = (Density) consume;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection = (LayoutDirection) consume2;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume3 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(Modifier.Companion);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer r8 = Updater.m2444constructorimpl(startRestartGroup);
            Updater.m2451setimpl(r8, columnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2451setimpl(r8, density, ComposeUiNode.Companion.getSetDensity());
            Updater.m2451setimpl(r8, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2451setimpl(r8, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693704, "C79@4027L9:Column.kt#2w3rfo");
            ColumnScope columnScope = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -385990141, "C803@33981L34:TimePicker.kt#uh7d8r");
            ClockDisplayNumbers(timePickerState2, timePickerColors2, startRestartGroup, (i2 & 14) | (i2 & 112));
            startRestartGroup.startReplaceableGroup(-552398963);
            ComposerKt.sourceInformation(startRestartGroup, "805@34059L401");
            if (!timePickerState.is24hour()) {
                Modifier r6 = PaddingKt.m497paddingqDBjuR0$default(Modifier.Companion, 0.0f, PeriodToggleMargin, 0.0f, 0.0f, 13, (Object) null);
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume4 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density2 = (Density) consume4;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume5 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                LayoutDirection layoutDirection2 = (LayoutDirection) consume5;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume6 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume6;
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(r6);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer r12 = Updater.m2444constructorimpl(startRestartGroup);
                Updater.m2451setimpl(r12, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2451setimpl(r12, density2, ComposeUiNode.Companion.getSetDensity());
                Updater.m2451setimpl(r12, layoutDirection2, ComposeUiNode.Companion.getSetLayoutDirection());
                Updater.m2451setimpl(r12, viewConfiguration2, ComposeUiNode.Companion.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf2.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
                BoxScope boxScope = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 34966463, "C806@34136L310:TimePicker.kt#uh7d8r");
                int i4 = i2 << 3;
                HorizontalPeriodToggle(SizeKt.m565sizeVpY3zN4(Modifier.Companion, TimePickerTokens.INSTANCE.m2347getPeriodSelectorHorizontalContainerWidthD9Ej5fM(), TimePickerTokens.INSTANCE.m2346getPeriodSelectorHorizontalContainerHeightD9Ej5fM()), timePickerState2, timePickerColors2, startRestartGroup, (i4 & 896) | (i4 & 112) | 6);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TimePickerKt$HorizontalClockDisplay$2(timePickerState2, timePickerColors2, i3));
        }
    }

    /* access modifiers changed from: private */
    public static final void VerticalClockDisplay(TimePickerState timePickerState, TimePickerColors timePickerColors, Composer composer, int i) {
        int i2;
        TimePickerState timePickerState2 = timePickerState;
        TimePickerColors timePickerColors2 = timePickerColors;
        int i3 = i;
        Composer startRestartGroup = composer.startRestartGroup(2054675515);
        ComposerKt.sourceInformation(startRestartGroup, "C(VerticalClockDisplay)P(1)821@34581L549:TimePicker.kt#uh7d8r");
        if ((i3 & 14) == 0) {
            i2 = (startRestartGroup.changed((Object) timePickerState2) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i3 & 112) == 0) {
            i2 |= startRestartGroup.changed((Object) timePickerColors2) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2054675515, i2, -1, "androidx.compose.material3.VerticalClockDisplay (TimePicker.kt:820)");
            }
            startRestartGroup.startReplaceableGroup(693286680);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Row)P(2,1,3)78@3913L58,79@3976L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.Companion.getTop(), startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density = (Density) consume;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection = (LayoutDirection) consume2;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume3 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(Modifier.Companion);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer r8 = Updater.m2444constructorimpl(startRestartGroup);
            Updater.m2451setimpl(r8, rowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2451setimpl(r8, density, ComposeUiNode.Companion.getSetDensity());
            Updater.m2451setimpl(r8, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2451setimpl(r8, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -326682283, "C80@4021L9:Row.kt#2w3rfo");
            RowScope rowScope = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1085478083, "C822@34639L34:TimePicker.kt#uh7d8r");
            ClockDisplayNumbers(timePickerState2, timePickerColors2, startRestartGroup, (i2 & 14) | (i2 & 112));
            startRestartGroup.startReplaceableGroup(952907597);
            ComposerKt.sourceInformation(startRestartGroup, "824@34717L397");
            if (!timePickerState.is24hour()) {
                Modifier r6 = PaddingKt.m497paddingqDBjuR0$default(Modifier.Companion, PeriodToggleMargin, 0.0f, 0.0f, 0.0f, 14, (Object) null);
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume4 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density2 = (Density) consume4;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume5 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                LayoutDirection layoutDirection2 = (LayoutDirection) consume5;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume6 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume6;
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(r6);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer r12 = Updater.m2444constructorimpl(startRestartGroup);
                Updater.m2451setimpl(r12, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2451setimpl(r12, density2, ComposeUiNode.Companion.getSetDensity());
                Updater.m2451setimpl(r12, layoutDirection2, ComposeUiNode.Companion.getSetLayoutDirection());
                Updater.m2451setimpl(r12, viewConfiguration2, ComposeUiNode.Companion.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf2.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
                BoxScope boxScope = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1130526335, "C825@34796L304:TimePicker.kt#uh7d8r");
                int i4 = i2 << 3;
                VerticalPeriodToggle(SizeKt.m565sizeVpY3zN4(Modifier.Companion, TimePickerTokens.INSTANCE.m2350getPeriodSelectorVerticalContainerWidthD9Ej5fM(), TimePickerTokens.INSTANCE.m2349getPeriodSelectorVerticalContainerHeightD9Ej5fM()), timePickerState2, timePickerColors2, startRestartGroup, (i4 & 896) | (i4 & 112) | 6);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TimePickerKt$VerticalClockDisplay$2(timePickerState2, timePickerColors2, i3));
        }
    }

    /* access modifiers changed from: private */
    public static final void ClockDisplayNumbers(TimePickerState timePickerState, TimePickerColors timePickerColors, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-934561141);
        ComposerKt.sourceInformation(startRestartGroup, "C(ClockDisplayNumbers)P(1)844@35316L10,843@35244L1047:TimePicker.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed((Object) timePickerState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed((Object) timePickerColors) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-934561141, i2, -1, "androidx.compose.material3.ClockDisplayNumbers (TimePicker.kt:839)");
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{TextKt.getLocalTextStyle().provides(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), TimePickerTokens.INSTANCE.getTimeSelectorLabelTextFont()))}, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(startRestartGroup, -477913269, true, new TimePickerKt$ClockDisplayNumbers$1(timePickerState, timePickerColors, i2)), startRestartGroup, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TimePickerKt$ClockDisplayNumbers$2(timePickerState, timePickerColors, i));
        }
    }

    /* access modifiers changed from: private */
    public static final void HorizontalPeriodToggle(Modifier modifier, TimePickerState timePickerState, TimePickerColors timePickerColors, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(1261215927);
        ComposerKt.sourceInformation(startRestartGroup, "C(HorizontalPeriodToggle)P(1,2)883@36453L904,908@37404L9,910@37439L206:TimePicker.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed((Object) modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed((Object) timePickerState) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed((Object) timePickerColors) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1261215927, i2, -1, "androidx.compose.material3.HorizontalPeriodToggle (TimePicker.kt:878)");
            }
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1.INSTANCE;
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            Shape shape = ShapesKt.toShape(TimePickerTokens.INSTANCE.getPeriodSelectorContainerShape(), startRestartGroup, 6);
            Intrinsics.checkNotNull(shape, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            CornerBasedShape cornerBasedShape = (CornerBasedShape) shape;
            PeriodToggleImpl(modifier, timePickerState, timePickerColors, (MeasurePolicy) rememberedValue, ShapesKt.start(cornerBasedShape), ShapesKt.end(cornerBasedShape), startRestartGroup, (i2 & 14) | 3072 | (i2 & 112) | (i2 & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TimePickerKt$HorizontalPeriodToggle$1(modifier, timePickerState, timePickerColors, i));
        }
    }

    /* access modifiers changed from: private */
    public static final void VerticalPeriodToggle(Modifier modifier, TimePickerState timePickerState, TimePickerColors timePickerColors, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1898918107);
        ComposerKt.sourceInformation(startRestartGroup, "C(VerticalPeriodToggle)P(1,2)926@37805L911,951@38763L9,953@38798L207:TimePicker.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed((Object) modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed((Object) timePickerState) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed((Object) timePickerColors) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1898918107, i2, -1, "androidx.compose.material3.VerticalPeriodToggle (TimePicker.kt:921)");
            }
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1.INSTANCE;
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            Shape shape = ShapesKt.toShape(TimePickerTokens.INSTANCE.getPeriodSelectorContainerShape(), startRestartGroup, 6);
            Intrinsics.checkNotNull(shape, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            CornerBasedShape cornerBasedShape = (CornerBasedShape) shape;
            PeriodToggleImpl(modifier, timePickerState, timePickerColors, (MeasurePolicy) rememberedValue, ShapesKt.top(cornerBasedShape), ShapesKt.bottom(cornerBasedShape), startRestartGroup, (i2 & 14) | 3072 | (i2 & 112) | (i2 & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TimePickerKt$VerticalPeriodToggle$1(modifier, timePickerState, timePickerColors, i));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: kotlin.jvm.functions.Function0} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void PeriodToggleImpl(androidx.compose.ui.Modifier r25, androidx.compose.material3.TimePickerState r26, androidx.compose.material3.TimePickerColors r27, androidx.compose.ui.layout.MeasurePolicy r28, androidx.compose.ui.graphics.Shape r29, androidx.compose.ui.graphics.Shape r30, androidx.compose.runtime.Composer r31, int r32) {
        /*
            r1 = r25
            r2 = r26
            r4 = r28
            r7 = r32
            r0 = 1374241901(0x51e9446d, float:1.25234422E11)
            r3 = r31
            androidx.compose.runtime.Composer r3 = r3.startRestartGroup(r0)
            java.lang.String r5 = "C(PeriodToggleImpl)P(3,5!1,2,4)977@39398L9,978@39457L41,981@39562L111,979@39503L1257:TimePicker.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r3, r5)
            r5 = r7 & 14
            if (r5 != 0) goto L_0x0025
            boolean r5 = r3.changed((java.lang.Object) r1)
            if (r5 == 0) goto L_0x0022
            r5 = 4
            goto L_0x0023
        L_0x0022:
            r5 = 2
        L_0x0023:
            r5 = r5 | r7
            goto L_0x0026
        L_0x0025:
            r5 = r7
        L_0x0026:
            r6 = r7 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0036
            boolean r6 = r3.changed((java.lang.Object) r2)
            if (r6 == 0) goto L_0x0033
            r6 = 32
            goto L_0x0035
        L_0x0033:
            r6 = 16
        L_0x0035:
            r5 = r5 | r6
        L_0x0036:
            r6 = r7 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0049
            r6 = r27
            boolean r8 = r3.changed((java.lang.Object) r6)
            if (r8 == 0) goto L_0x0045
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0047
        L_0x0045:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0047:
            r5 = r5 | r8
            goto L_0x004b
        L_0x0049:
            r6 = r27
        L_0x004b:
            r8 = r7 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x005b
            boolean r8 = r3.changed((java.lang.Object) r4)
            if (r8 == 0) goto L_0x0058
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x005a
        L_0x0058:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x005a:
            r5 = r5 | r8
        L_0x005b:
            r8 = 57344(0xe000, float:8.0356E-41)
            r8 = r8 & r7
            r15 = r29
            if (r8 != 0) goto L_0x006f
            boolean r8 = r3.changed((java.lang.Object) r15)
            if (r8 == 0) goto L_0x006c
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L_0x006e
        L_0x006c:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x006e:
            r5 = r5 | r8
        L_0x006f:
            r8 = 458752(0x70000, float:6.42848E-40)
            r8 = r8 & r7
            r14 = r30
            if (r8 != 0) goto L_0x0082
            boolean r8 = r3.changed((java.lang.Object) r14)
            if (r8 == 0) goto L_0x007f
            r8 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0081
        L_0x007f:
            r8 = 65536(0x10000, float:9.18355E-41)
        L_0x0081:
            r5 = r5 | r8
        L_0x0082:
            r8 = 374491(0x5b6db, float:5.24774E-40)
            r8 = r8 & r5
            r9 = 74898(0x12492, float:1.04954E-40)
            if (r8 != r9) goto L_0x0097
            boolean r8 = r3.getSkipping()
            if (r8 != 0) goto L_0x0092
            goto L_0x0097
        L_0x0092:
            r3.skipToGroupEnd()
            goto L_0x02b2
        L_0x0097:
            boolean r8 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r8 == 0) goto L_0x00a4
            r8 = -1
            java.lang.String r9 = "androidx.compose.material3.PeriodToggleImpl (TimePicker.kt:964)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r5, r8, r9)
        L_0x00a4:
            androidx.compose.material3.tokens.TimePickerTokens r0 = androidx.compose.material3.tokens.TimePickerTokens.INSTANCE
            float r0 = r0.m2348getPeriodSelectorOutlineWidthD9Ej5fM()
            long r8 = r27.m1733getPeriodSelectorBorderColor0d7_KjU$material3_release()
            androidx.compose.foundation.BorderStroke r0 = androidx.compose.foundation.BorderStrokeKt.m201BorderStrokecXLIe8U(r0, r8)
            androidx.compose.material3.tokens.TimePickerTokens r8 = androidx.compose.material3.tokens.TimePickerTokens.INSTANCE
            androidx.compose.material3.tokens.ShapeKeyTokens r8 = r8.getPeriodSelectorContainerShape()
            r13 = 6
            androidx.compose.ui.graphics.Shape r8 = androidx.compose.material3.ShapesKt.toShape(r8, r3, r13)
            java.lang.String r9 = "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8, r9)
            androidx.compose.foundation.shape.CornerBasedShape r8 = (androidx.compose.foundation.shape.CornerBasedShape) r8
            androidx.compose.material3.Strings$Companion r9 = androidx.compose.material3.Strings.Companion
            int r9 = r9.m1629getTimePickerPeriodToggleadMyvUU()
            java.lang.String r9 = androidx.compose.material3.Strings_androidKt.m1632getStringNWtq28(r9, r3, r13)
            r12 = 1157296644(0x44faf204, float:2007.563)
            r3.startReplaceableGroup(r12)
            java.lang.String r11 = "CC(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r3, r11)
            boolean r10 = r3.changed((java.lang.Object) r9)
            java.lang.Object r12 = r3.rememberedValue()
            if (r10 != 0) goto L_0x00ec
            androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r10 = r10.getEmpty()
            if (r12 != r10) goto L_0x00f7
        L_0x00ec:
            androidx.compose.material3.TimePickerKt$PeriodToggleImpl$1$1 r10 = new androidx.compose.material3.TimePickerKt$PeriodToggleImpl$1$1
            r10.<init>(r9)
            r12 = r10
            kotlin.jvm.functions.Function1 r12 = (kotlin.jvm.functions.Function1) r12
            r3.updateRememberedValue(r12)
        L_0x00f7:
            r3.endReplaceableGroup()
            kotlin.jvm.functions.Function1 r12 = (kotlin.jvm.functions.Function1) r12
            r10 = 0
            r9 = 1
            r13 = 0
            androidx.compose.ui.Modifier r12 = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(r1, r10, r12, r9, r13)
            androidx.compose.ui.Modifier r12 = androidx.compose.foundation.selection.SelectableGroupKt.selectableGroup(r12)
            androidx.compose.ui.Modifier r12 = r12.then(r1)
            androidx.compose.ui.graphics.Shape r8 = (androidx.compose.ui.graphics.Shape) r8
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.BorderKt.border(r12, r0, r8)
            int r8 = r5 >> 3
            r8 = r8 & 896(0x380, float:1.256E-42)
            r12 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r3.startReplaceableGroup(r12)
            java.lang.String r12 = "CC(Layout)P(!1,2)73@2855L7,74@2910L7,75@2969L7,76@2981L460:Layout.kt#80mrfh"
            androidx.compose.runtime.ComposerKt.sourceInformation(r3, r12)
            androidx.compose.runtime.ProvidableCompositionLocal r12 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r12 = (androidx.compose.runtime.CompositionLocal) r12
            r10 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r13 = "CC:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r3, r10, r13)
            java.lang.Object r12 = r3.consume(r12)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r3)
            androidx.compose.ui.unit.Density r12 = (androidx.compose.ui.unit.Density) r12
            androidx.compose.runtime.ProvidableCompositionLocal r17 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            r9 = r17
            androidx.compose.runtime.CompositionLocal r9 = (androidx.compose.runtime.CompositionLocal) r9
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r3, r10, r13)
            java.lang.Object r9 = r3.consume(r9)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r3)
            androidx.compose.ui.unit.LayoutDirection r9 = (androidx.compose.ui.unit.LayoutDirection) r9
            androidx.compose.runtime.ProvidableCompositionLocal r17 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            r1 = r17
            androidx.compose.runtime.CompositionLocal r1 = (androidx.compose.runtime.CompositionLocal) r1
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r3, r10, r13)
            java.lang.Object r1 = r3.consume(r1)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r3)
            androidx.compose.ui.platform.ViewConfiguration r1 = (androidx.compose.ui.platform.ViewConfiguration) r1
            androidx.compose.ui.node.ComposeUiNode$Companion r10 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function0 r10 = r10.getConstructor()
            kotlin.jvm.functions.Function3 r0 = androidx.compose.ui.layout.LayoutKt.materializerOf(r0)
            int r8 = r8 << 9
            r8 = r8 & 7168(0x1c00, float:1.0045E-41)
            r13 = 6
            r8 = r8 | r13
            androidx.compose.runtime.Applier r13 = r3.getApplier()
            boolean r13 = r13 instanceof androidx.compose.runtime.Applier
            if (r13 != 0) goto L_0x017a
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x017a:
            r3.startReusableNode()
            boolean r13 = r3.getInserting()
            if (r13 == 0) goto L_0x0187
            r3.createNode(r10)
            goto L_0x018a
        L_0x0187:
            r3.useNode()
        L_0x018a:
            androidx.compose.runtime.Composer r10 = androidx.compose.runtime.Updater.m2444constructorimpl(r3)
            androidx.compose.ui.node.ComposeUiNode$Companion r13 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r13 = r13.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r10, r4, r13)
            androidx.compose.ui.node.ComposeUiNode$Companion r13 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r13 = r13.getSetDensity()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r10, r12, r13)
            androidx.compose.ui.node.ComposeUiNode$Companion r12 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r12 = r12.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r10, r9, r12)
            androidx.compose.ui.node.ComposeUiNode$Companion r9 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r9 = r9.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r10, r1, r9)
            androidx.compose.runtime.Composer r1 = androidx.compose.runtime.SkippableUpdater.m2436constructorimpl(r3)
            androidx.compose.runtime.SkippableUpdater r1 = androidx.compose.runtime.SkippableUpdater.m2435boximpl(r1)
            int r8 = r8 >> 3
            r8 = r8 & 112(0x70, float:1.57E-43)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r0.invoke(r1, r3, r8)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r3.startReplaceableGroup(r0)
            r0 = 1654470848(0x629d38c0, float:1.450114E21)
            java.lang.String r1 = "C993@39989L71,990@39863L303,1003@40399L9,998@40179L244,1009@40575L70,1005@40436L308:TimePicker.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r3, r0, r1)
            boolean r0 = r26.isAfternoonToggle$material3_release()
            r1 = 1
            r8 = r0 ^ 1
            r0 = 1157296644(0x44faf204, float:2007.563)
            r3.startReplaceableGroup(r0)
            androidx.compose.runtime.ComposerKt.sourceInformation(r3, r11)
            boolean r9 = r3.changed((java.lang.Object) r2)
            java.lang.Object r10 = r3.rememberedValue()
            if (r9 != 0) goto L_0x01f5
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r9 = r9.getEmpty()
            if (r10 != r9) goto L_0x0200
        L_0x01f5:
            androidx.compose.material3.TimePickerKt$PeriodToggleImpl$2$1$1 r9 = new androidx.compose.material3.TimePickerKt$PeriodToggleImpl$2$1$1
            r9.<init>(r2)
            r10 = r9
            kotlin.jvm.functions.Function0 r10 = (kotlin.jvm.functions.Function0) r10
            r3.updateRememberedValue(r10)
        L_0x0200:
            r3.endReplaceableGroup()
            kotlin.jvm.functions.Function0 r10 = (kotlin.jvm.functions.Function0) r10
            androidx.compose.material3.ComposableSingletons$TimePickerKt r9 = androidx.compose.material3.ComposableSingletons$TimePickerKt.INSTANCE
            kotlin.jvm.functions.Function3 r12 = r9.m1275getLambda1$material3_release()
            int r9 = r5 >> 9
            r9 = r9 & 112(0x70, float:1.57E-43)
            r9 = r9 | 24576(0x6000, float:3.4438E-41)
            int r13 = r5 << 3
            r13 = r13 & 7168(0x1c00, float:1.0045E-41)
            r17 = r9 | r13
            r9 = r29
            r0 = 0
            r18 = r11
            r11 = r27
            r16 = r13
            r0 = 0
            r13 = r3
            r14 = r17
            ToggleItem(r8, r9, r10, r11, r12, r13, r14)
            androidx.compose.ui.Modifier$Companion r8 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r8 = (androidx.compose.ui.Modifier) r8
            java.lang.String r9 = "Spacer"
            androidx.compose.ui.Modifier r8 = androidx.compose.ui.layout.LayoutIdKt.layoutId(r8, r9)
            r9 = 1073741824(0x40000000, float:2.0)
            androidx.compose.ui.Modifier r8 = androidx.compose.ui.ZIndexModifierKt.zIndex(r8, r9)
            r9 = 0
            androidx.compose.ui.Modifier r19 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(r8, r9, r1, r0)
            androidx.compose.material3.tokens.TimePickerTokens r0 = androidx.compose.material3.tokens.TimePickerTokens.INSTANCE
            androidx.compose.material3.tokens.ColorSchemeKeyTokens r0 = r0.getPeriodSelectorOutlineColor()
            r1 = 6
            long r20 = androidx.compose.material3.ColorSchemeKt.toColor(r0, r3, r1)
            r22 = 0
            r23 = 2
            r24 = 0
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.BackgroundKt.m182backgroundbw27NRU$default(r19, r20, r22, r23, r24)
            r1 = 0
            androidx.compose.foundation.layout.SpacerKt.Spacer(r0, r3, r1)
            boolean r8 = r26.isAfternoonToggle$material3_release()
            r0 = 1157296644(0x44faf204, float:2007.563)
            r3.startReplaceableGroup(r0)
            r0 = r18
            androidx.compose.runtime.ComposerKt.sourceInformation(r3, r0)
            boolean r0 = r3.changed((java.lang.Object) r2)
            java.lang.Object r1 = r3.rememberedValue()
            if (r0 != 0) goto L_0x0276
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r0 = r0.getEmpty()
            if (r1 != r0) goto L_0x0281
        L_0x0276:
            androidx.compose.material3.TimePickerKt$PeriodToggleImpl$2$2$1 r0 = new androidx.compose.material3.TimePickerKt$PeriodToggleImpl$2$2$1
            r0.<init>(r2)
            r1 = r0
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r3.updateRememberedValue(r1)
        L_0x0281:
            r3.endReplaceableGroup()
            r10 = r1
            kotlin.jvm.functions.Function0 r10 = (kotlin.jvm.functions.Function0) r10
            androidx.compose.material3.ComposableSingletons$TimePickerKt r0 = androidx.compose.material3.ComposableSingletons$TimePickerKt.INSTANCE
            kotlin.jvm.functions.Function3 r12 = r0.m1276getLambda2$material3_release()
            int r0 = r5 >> 12
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            r14 = r0 | r16
            r9 = r30
            r11 = r27
            r13 = r3
            ToggleItem(r8, r9, r10, r11, r12, r13, r14)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r3)
            r3.endReplaceableGroup()
            r3.endNode()
            r3.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x02b2
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x02b2:
            androidx.compose.runtime.ScopeUpdateScope r8 = r3.endRestartGroup()
            if (r8 != 0) goto L_0x02b9
            goto L_0x02d2
        L_0x02b9:
            androidx.compose.material3.TimePickerKt$PeriodToggleImpl$3 r9 = new androidx.compose.material3.TimePickerKt$PeriodToggleImpl$3
            r0 = r9
            r1 = r25
            r2 = r26
            r3 = r27
            r4 = r28
            r5 = r29
            r6 = r30
            r7 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
            r8.updateScope(r9)
        L_0x02d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.PeriodToggleImpl(androidx.compose.ui.Modifier, androidx.compose.material3.TimePickerState, androidx.compose.material3.TimePickerColors, androidx.compose.ui.layout.MeasurePolicy, androidx.compose.ui.graphics.Shape, androidx.compose.ui.graphics.Shape, androidx.compose.runtime.Composer, int):void");
    }

    /* access modifiers changed from: private */
    public static final void ToggleItem(boolean z, Shape shape, Function0<Unit> function0, TimePickerColors timePickerColors, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i) {
        int i2;
        boolean z2 = z;
        TimePickerColors timePickerColors2 = timePickerColors;
        int i3 = i;
        Composer startRestartGroup = composer.startRestartGroup(-1937408098);
        ComposerKt.sourceInformation(startRestartGroup, "C(ToggleItem)P(!1,4,3)1033@41221L22,1038@41400L112,1029@41086L432:TimePicker.kt#uh7d8r");
        if ((i3 & 14) == 0) {
            i2 = (startRestartGroup.changed(z2) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i3 & 112) == 0) {
            i2 |= startRestartGroup.changed((Object) shape) ? 32 : 16;
        } else {
            Shape shape2 = shape;
        }
        Function0<Unit> function02 = function0;
        if ((i3 & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if ((i3 & 7168) == 0) {
            i2 |= startRestartGroup.changed((Object) timePickerColors2) ? 2048 : 1024;
        }
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32 = function3;
        if ((57344 & i3) == 0) {
            i2 |= startRestartGroup.changedInstance(function32) ? 16384 : 8192;
        }
        if ((46811 & i2) != 9362 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1937408098, i2, -1, "androidx.compose.material3.ToggleItem (TimePicker.kt:1019)");
            }
            long r10 = timePickerColors2.m1736periodSelectorContentColorvNxB06k$material3_release(z2);
            long r8 = timePickerColors2.m1735periodSelectorContainerColorvNxB06k$material3_release(z2);
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(ZIndexModifierKt.zIndex(Modifier.Companion, z2 ? 0.0f : 1.0f), 0.0f, 1, (Object) null);
            Boolean valueOf = Boolean.valueOf(z);
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed((Object) valueOf);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new TimePickerKt$ToggleItem$1$1(z2);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            ButtonKt.TextButton(function0, SemanticsModifierKt.semantics$default(fillMaxSize$default, false, (Function1) rememberedValue, 1, (Object) null), false, shape, ButtonDefaults.INSTANCE.m1161textButtonColorsro_MJ88(r8, r10, 0, 0, startRestartGroup, 24576, 12), (ButtonElevation) null, (BorderStroke) null, PaddingKt.m486PaddingValues0680j_4(Dp.m5626constructorimpl((float) 0)), (MutableInteractionSource) null, function3, startRestartGroup, ((i2 >> 6) & 14) | 12582912 | ((i2 << 6) & 7168) | ((i2 << 15) & 1879048192), 356);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TimePickerKt$ToggleItem$2(z, shape, function0, timePickerColors, function3, i));
        }
    }

    /* access modifiers changed from: private */
    public static final void DisplaySeparator(Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composer2;
        Modifier modifier2 = modifier;
        int i3 = i;
        Composer startRestartGroup = composer.startRestartGroup(2100674302);
        ComposerKt.sourceInformation(startRestartGroup, "C(DisplaySeparator)1048@41655L7,1056@41916L245:TimePicker.kt#uh7d8r");
        if ((i3 & 14) == 0) {
            i2 = (startRestartGroup.changed((Object) modifier2) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2100674302, i3, -1, "androidx.compose.material3.DisplaySeparator (TimePicker.kt:1046)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(TextKt.getLocalTextStyle());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            TextAlign r35 = TextAlign.m5499boximpl(TextAlign.Companion.m5506getCentere0LSkKk());
            LineHeightStyle lineHeightStyle = r2;
            LineHeightStyle lineHeightStyle2 = new LineHeightStyle(LineHeightStyle.Alignment.Companion.m5483getCenterPIaL0Z0(), LineHeightStyle.Trim.Companion.m5495getBothEVpEnUU(), (DefaultConstructorMarker) null);
            TextStyle copyAndSetFontPadding = IncludeFontPaddingHelper_androidKt.copyAndSetFontPadding(TextStyle.m5139copyCXVQc50$default((TextStyle) consume, 0, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, r35, (TextDirection) null, 0, (TextIndent) null, (PlatformTextStyle) null, lineHeightStyle, (LineBreak) null, (Hyphens) null, 3653631, (Object) null), false);
            Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(modifier2, TimePickerKt$DisplaySeparator$1.INSTANCE);
            Alignment center = Alignment.Companion.getCenter();
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density = (Density) consume2;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume3 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection = (LayoutDirection) consume3;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume4 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration = (ViewConfiguration) consume4;
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(clearAndSetSemantics);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer r8 = Updater.m2444constructorimpl(startRestartGroup);
            Updater.m2451setimpl(r8, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2451setimpl(r8, density, ComposeUiNode.Companion.getSetDensity());
            Updater.m2451setimpl(r8, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2451setimpl(r8, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
            BoxScope boxScope = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -617594898, "C1062@42109L9,1060@42035L120:TimePicker.kt#uh7d8r");
            composer2 = startRestartGroup;
            TextKt.m1727Text4IGK_g(":", (Modifier) null, ColorSchemeKt.toColor(TimeInputTokens.INSTANCE.getTimeFieldSeparatorColor(), startRestartGroup, 6), 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, copyAndSetFontPadding, composer2, 6, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TimePickerKt$DisplaySeparator$3(modifier2, i3));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: TimeSelector-uXwN82Y  reason: not valid java name */
    public static final void m1744TimeSelectoruXwN82Y(Modifier modifier, int i, TimePickerState timePickerState, int i2, TimePickerColors timePickerColors, Composer composer, int i3) {
        int i4;
        Composer composer2;
        int i5;
        Modifier modifier2 = modifier;
        TimePickerState timePickerState2 = timePickerState;
        int i6 = i2;
        TimePickerColors timePickerColors2 = timePickerColors;
        int i7 = i3;
        Composer startRestartGroup = composer.startRestartGroup(21099367);
        ComposerKt.sourceInformation(startRestartGroup, "C(TimeSelector)P(1,4,3,2:c#material3.Selection)1078@42456L176,1088@42784L24,1091@42898L124,1104@43327L9,1089@42813L1060:TimePicker.kt#uh7d8r");
        if ((i7 & 14) == 0) {
            i4 = (startRestartGroup.changed((Object) modifier2) ? 4 : 2) | i7;
        } else {
            i4 = i7;
        }
        int i8 = i;
        if ((i7 & 112) == 0) {
            i4 |= startRestartGroup.changed(i8) ? 32 : 16;
        }
        if ((i7 & 896) == 0) {
            i4 |= startRestartGroup.changed((Object) timePickerState2) ? 256 : 128;
        }
        if ((i7 & 7168) == 0) {
            i4 |= startRestartGroup.changed(i6) ? 2048 : 1024;
        }
        if ((57344 & i7) == 0) {
            i4 |= startRestartGroup.changed((Object) timePickerColors2) ? 16384 : 8192;
        }
        int i9 = i4;
        if ((46811 & i9) != 9362 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(21099367, i9, -1, "androidx.compose.material3.TimeSelector (TimePicker.kt:1070)");
            }
            boolean r0 = Selection.m1536equalsimpl0(timePickerState.m1770getSelectionJiIwxys$material3_release(), i6);
            if (Selection.m1536equalsimpl0(i6, Selection.Companion.m1540getHourJiIwxys())) {
                i5 = Strings.Companion.m1621getTimePickerHourSelectionadMyvUU();
            } else {
                i5 = Strings.Companion.m1625getTimePickerMinuteSelectionadMyvUU();
            }
            String r2 = Strings_androidKt.m1632getStringNWtq28(i5, startRestartGroup, 0);
            long r18 = timePickerColors2.m1737timeSelectorContainerColorvNxB06k$material3_release(r0);
            long r26 = timePickerColors2.m1738timeSelectorContentColorvNxB06k$material3_release(r0);
            startRestartGroup.startReplaceableGroup(773894976);
            ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)476@19869L144:Effects.kt#9igjgp");
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            startRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed((Object) r2);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new TimePickerKt$TimeSelector$1$1(r2);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier semantics = SemanticsModifierKt.semantics(modifier2, true, (Function1) rememberedValue2);
            Shape shape = ShapesKt.toShape(TimePickerTokens.INSTANCE.getTimeSelectorContainerShape(), startRestartGroup, 6);
            TimePickerKt$TimeSelector$3 timePickerKt$TimeSelector$3 = r2;
            TimePickerKt$TimeSelector$3 timePickerKt$TimeSelector$32 = new TimePickerKt$TimeSelector$3(i2, timePickerState, i, i9, r26);
            composer2 = startRestartGroup;
            SurfaceKt.m1642Surfaced85dljk(r0, (Function0<Unit>) new TimePickerKt$TimeSelector$2(i6, timePickerState2, coroutineScope), semantics, false, shape, r18, 0, 0.0f, 0.0f, (BorderStroke) null, (MutableInteractionSource) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(startRestartGroup, -1338709103, true, timePickerKt$TimeSelector$3), composer2, 0, 48, 1992);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TimePickerKt$TimeSelector$4(modifier, i, timePickerState, i2, timePickerColors, i3));
        }
    }

    public static final void ClockFace(TimePickerState timePickerState, TimePickerColors timePickerColors, boolean z, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(timePickerState, "state");
        Intrinsics.checkNotNullParameter(timePickerColors, "colors");
        Composer startRestartGroup = composer.startRestartGroup(-1525091100);
        ComposerKt.sourceInformation(startRestartGroup, "C(ClockFace)P(2,1)1130@44011L1899:TimePicker.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed((Object) timePickerState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed((Object) timePickerColors) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1525091100, i2, -1, "androidx.compose.material3.ClockFace (TimePicker.kt:1125)");
            }
            CrossfadeKt.Crossfade(timePickerState.getValues$material3_release(), SemanticsModifierKt.semantics$default(SizeKt.m563size3ABfNKs(BackgroundKt.m181backgroundbw27NRU(Modifier.Companion, timePickerColors.m1731getClockDialColor0d7_KjU$material3_release(), RoundedCornerShapeKt.getCircleShape()), TimePickerTokens.INSTANCE.m2341getClockDialContainerSizeD9Ej5fM()), false, TimePickerKt$ClockFace$1.INSTANCE, 1, (Object) null), (FiniteAnimationSpec<Float>) AnimationSpecKt.tween$default(350, 0, (Easing) null, 6, (Object) null), (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, 1628166511, true, new TimePickerKt$ClockFace$2(timePickerState, z, timePickerColors, i2)), startRestartGroup, 24584, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TimePickerKt$ClockFace$3(timePickerState, timePickerColors, z, i));
        }
    }

    /* access modifiers changed from: private */
    public static final Modifier drawSelector(Modifier modifier, TimePickerState timePickerState, TimePickerColors timePickerColors) {
        return DrawModifierKt.drawWithContent(modifier, new TimePickerKt$drawSelector$1(timePickerState, timePickerColors));
    }

    /* access modifiers changed from: private */
    public static final void ClockText(TimePickerState timePickerState, int i, boolean z, Composer composer, int i2) {
        int i3;
        Composer composer2;
        boolean z2;
        TimePickerState timePickerState2 = timePickerState;
        int i4 = i;
        boolean z3 = z;
        int i5 = i2;
        Composer startRestartGroup = composer.startRestartGroup(-1317232110);
        ComposerKt.sourceInformation(startRestartGroup, "C(ClockText)P(1,2)*1287@49593L10,1291@49736L7,1292@49786L40,1293@49843L24,1295@49905L142,1313@50500L39,1308@50299L758:TimePicker.kt#uh7d8r");
        if ((i5 & 14) == 0) {
            i3 = (startRestartGroup.changed((Object) timePickerState2) ? 4 : 2) | i5;
        } else {
            i3 = i5;
        }
        if ((i5 & 112) == 0) {
            i3 |= startRestartGroup.changed(i4) ? 32 : 16;
        }
        if ((i5 & 896) == 0) {
            i3 |= startRestartGroup.changed(z3) ? 256 : 128;
        }
        if ((i3 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1317232110, i3, -1, "androidx.compose.material3.ClockText (TimePicker.kt:1286)");
            }
            TextStyle copyAndSetFontPadding = IncludeFontPaddingHelper_androidKt.copyAndSetFontPadding(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), TimePickerTokens.INSTANCE.getClockDialLabelTextFont()), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            float r4 = ((Density) consume).m5607toPx0680j_4(MaxDistance);
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m2561boximpl(Offset.Companion.m2588getZeroF1C5BW0()), (SnapshotMutationPolicy) null, 2, (Object) null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            MutableState mutableState = (MutableState) rememberedValue;
            startRestartGroup.startReplaceableGroup(773894976);
            ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)476@19869L144:Effects.kt#9igjgp");
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.Companion.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue2 = compositionScopedCoroutineScopeCanceller;
            }
            startRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
            startRestartGroup.endReplaceableGroup();
            String r3 = m1749numberContentDescriptionYKJpE6Y(timePickerState.m1770getSelectionJiIwxys$material3_release(), timePickerState.is24hour(), i4, startRestartGroup, (i3 << 3) & 896);
            String localString = toLocalString(i4, 1);
            if (Selection.m1536equalsimpl0(timePickerState.m1770getSelectionJiIwxys$material3_release(), Selection.Companion.m1541getMinuteJiIwxys())) {
                z2 = Intrinsics.areEqual((Object) toLocalString(timePickerState.getMinute(), 1), (Object) localString);
            } else {
                z2 = Intrinsics.areEqual((Object) toLocalString(timePickerState.getHour(), 1), (Object) localString);
            }
            Alignment center = Alignment.Companion.getCenter();
            Modifier r1 = SizeKt.m563size3ABfNKs(InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.Companion), MinimumInteractiveSize);
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed((Object) mutableState);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new TimePickerKt$ClockText$1$1(mutableState);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier focusable$default = FocusableKt.focusable$default(OnGloballyPositionedModifierKt.onGloballyPositioned(r1, (Function1) rememberedValue3), false, (MutableInteractionSource) null, 3, (Object) null);
            String str = localString;
            boolean z4 = z2;
            String str2 = r3;
            Modifier semantics = SemanticsModifierKt.semantics(focusable$default, true, new TimePickerKt$ClockText$2(z4, coroutineScope, timePickerState, r4, z, mutableState));
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density = (Density) consume2;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume3 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection = (LayoutDirection) consume3;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume4 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration = (ViewConfiguration) consume4;
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(semantics);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer r42 = Updater.m2444constructorimpl(startRestartGroup);
            Updater.m2451setimpl(r42, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2451setimpl(r42, density, ComposeUiNode.Companion.getSetDensity());
            Updater.m2451setimpl(r42, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2451setimpl(r42, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
            BoxScope boxScope = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 859623406, "C1324@50912L76,1323@50853L198:TimePicker.kt#uh7d8r");
            Modifier modifier = Modifier.Companion;
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed2 = startRestartGroup.changed((Object) str2);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue4 == Composer.Companion.getEmpty()) {
                rememberedValue4 = new TimePickerKt$ClockText$3$1$1(str2);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(modifier, (Function1) rememberedValue4);
            composer2 = startRestartGroup;
            TextKt.m1727Text4IGK_g(str, clearAndSetSemantics, 0, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, copyAndSetFontPadding, composer2, 0, 0, 65532);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TimePickerKt$ClockText$4(timePickerState, i4, z3, i5));
        }
    }

    /* access modifiers changed from: private */
    public static final long ClockText$lambda$29(MutableState<Offset> mutableState) {
        return ((Offset) mutableState.getValue()).m2582unboximpl();
    }

    /* access modifiers changed from: private */
    public static final void ClockText$lambda$30(MutableState<Offset> mutableState, long j) {
        mutableState.setValue(Offset.m2561boximpl(j));
    }

    /* access modifiers changed from: private */
    /* renamed from: timeInputOnChange-gIWD5Rc  reason: not valid java name */
    public static final void m1750timeInputOnChangegIWD5Rc(int i, TimePickerState timePickerState, TextFieldValue textFieldValue, TextFieldValue textFieldValue2, int i2, Function1<? super TextFieldValue, Unit> function1) {
        int i3;
        if (Intrinsics.areEqual((Object) textFieldValue.getText(), (Object) textFieldValue2.getText())) {
            function1.invoke(textFieldValue);
        } else if (textFieldValue.getText().length() == 0) {
            if (Selection.m1536equalsimpl0(i, Selection.Companion.m1540getHourJiIwxys())) {
                timePickerState.setHour$material3_release(0);
            } else {
                timePickerState.setMinute$material3_release(0);
            }
            function1.invoke(TextFieldValue.m5348copy3r_uNRQ$default(textFieldValue, "", 0, (TextRange) null, 6, (Object) null));
        } else {
            try {
                if (textFieldValue.getText().length() == 3 && TextRange.m5131getStartimpl(textFieldValue.m5352getSelectiond9O1mEE()) == 1) {
                    i3 = CharsKt.digitToInt(textFieldValue.getText().charAt(0));
                } else {
                    i3 = Integer.parseInt(textFieldValue.getText());
                }
                if (i3 <= i2) {
                    if (Selection.m1536equalsimpl0(i, Selection.Companion.m1540getHourJiIwxys())) {
                        timePickerState.setHour$material3_release(i3);
                        if (i3 > 1 && !timePickerState.is24hour()) {
                            timePickerState.m1773setSelectioniHAOin8$material3_release(Selection.Companion.m1541getMinuteJiIwxys());
                        }
                    } else {
                        timePickerState.setMinute$material3_release(i3);
                    }
                    if (textFieldValue.getText().length() > 2) {
                        textFieldValue = TextFieldValue.m5348copy3r_uNRQ$default(textFieldValue, String.valueOf(textFieldValue.getText().charAt(0)), 0, (TextRange) null, 6, (Object) null);
                    }
                    function1.invoke(textFieldValue);
                }
            } catch (IllegalArgumentException | NumberFormatException unused) {
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: int} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x06b5  */
    /* JADX WARNING: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x010c  */
    /* renamed from: TimePickerTextField-lxUZ_iY  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1743TimePickerTextFieldlxUZ_iY(androidx.compose.ui.Modifier r115, androidx.compose.ui.text.input.TextFieldValue r116, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> r117, androidx.compose.material3.TimePickerState r118, int r119, androidx.compose.foundation.text.KeyboardOptions r120, androidx.compose.foundation.text.KeyboardActions r121, androidx.compose.material3.TimePickerColors r122, androidx.compose.runtime.Composer r123, int r124, int r125) {
        /*
            r13 = r116
            r7 = r118
            r15 = r119
            r12 = r122
            r11 = r124
            r10 = r125
            r0 = -367523658(0xffffffffea1808b6, float:-4.5949465E25)
            r1 = r123
            androidx.compose.runtime.Composer r9 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(TimePickerTextField)P(3,7,4,6,5:c#material3.Selection,2,1)1396@52868L39,1397@52933L29,1398@53015L227,1404@53295L3274,1488@56607L103,1488@56575L135:TimePicker.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r9, r1)
            r1 = r10 & 1
            if (r1 == 0) goto L_0x0023
            r1 = r11 | 6
            r6 = r115
            goto L_0x0035
        L_0x0023:
            r1 = r11 & 14
            r6 = r115
            if (r1 != 0) goto L_0x0034
            boolean r1 = r9.changed((java.lang.Object) r6)
            if (r1 == 0) goto L_0x0031
            r1 = 4
            goto L_0x0032
        L_0x0031:
            r1 = 2
        L_0x0032:
            r1 = r1 | r11
            goto L_0x0035
        L_0x0034:
            r1 = r11
        L_0x0035:
            r2 = r10 & 2
            if (r2 == 0) goto L_0x003c
            r1 = r1 | 48
            goto L_0x004c
        L_0x003c:
            r2 = r11 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x004c
            boolean r2 = r9.changed((java.lang.Object) r13)
            if (r2 == 0) goto L_0x0049
            r2 = 32
            goto L_0x004b
        L_0x0049:
            r2 = 16
        L_0x004b:
            r1 = r1 | r2
        L_0x004c:
            r2 = r10 & 4
            if (r2 == 0) goto L_0x0055
            r1 = r1 | 384(0x180, float:5.38E-43)
            r5 = r117
            goto L_0x0067
        L_0x0055:
            r2 = r11 & 896(0x380, float:1.256E-42)
            r5 = r117
            if (r2 != 0) goto L_0x0067
            boolean r2 = r9.changedInstance(r5)
            if (r2 == 0) goto L_0x0064
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r1 = r1 | r2
        L_0x0067:
            r2 = r10 & 8
            if (r2 == 0) goto L_0x006e
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x007e
        L_0x006e:
            r2 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x007e
            boolean r2 = r9.changed((java.lang.Object) r7)
            if (r2 == 0) goto L_0x007b
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r1 = r1 | r2
        L_0x007e:
            r2 = r10 & 16
            r3 = 57344(0xe000, float:8.0356E-41)
            if (r2 == 0) goto L_0x0088
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0098
        L_0x0088:
            r2 = r11 & r3
            if (r2 != 0) goto L_0x0098
            boolean r2 = r9.changed((int) r15)
            if (r2 == 0) goto L_0x0095
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0097
        L_0x0095:
            r2 = 8192(0x2000, float:1.14794E-41)
        L_0x0097:
            r1 = r1 | r2
        L_0x0098:
            r2 = r10 & 32
            if (r2 == 0) goto L_0x00a0
            r4 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r4
            goto L_0x00b5
        L_0x00a0:
            r4 = 458752(0x70000, float:6.42848E-40)
            r4 = r4 & r11
            if (r4 != 0) goto L_0x00b5
            r4 = r120
            boolean r16 = r9.changed((java.lang.Object) r4)
            if (r16 == 0) goto L_0x00b0
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b2
        L_0x00b0:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b2:
            r1 = r1 | r16
            goto L_0x00b7
        L_0x00b5:
            r4 = r120
        L_0x00b7:
            r16 = r10 & 64
            r110 = 3670016(0x380000, float:5.142788E-39)
            if (r16 == 0) goto L_0x00c4
            r17 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r17
            r8 = r121
            goto L_0x00d7
        L_0x00c4:
            r17 = r11 & r110
            r8 = r121
            if (r17 != 0) goto L_0x00d7
            boolean r17 = r9.changed((java.lang.Object) r8)
            if (r17 == 0) goto L_0x00d3
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d5
        L_0x00d3:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00d5:
            r1 = r1 | r17
        L_0x00d7:
            r14 = r10 & 128(0x80, float:1.794E-43)
            r111 = 29360128(0x1c00000, float:7.052966E-38)
            if (r14 == 0) goto L_0x00e1
            r14 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x00df:
            r1 = r1 | r14
            goto L_0x00f1
        L_0x00e1:
            r14 = r11 & r111
            if (r14 != 0) goto L_0x00f1
            boolean r14 = r9.changed((java.lang.Object) r12)
            if (r14 == 0) goto L_0x00ee
            r14 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00df
        L_0x00ee:
            r14 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x00df
        L_0x00f1:
            r14 = r1
            r1 = 23967451(0x16db6db, float:4.3661218E-38)
            r1 = r1 & r14
            r3 = 4793490(0x492492, float:6.71711E-39)
            if (r1 != r3) goto L_0x010c
            boolean r1 = r9.getSkipping()
            if (r1 != 0) goto L_0x0102
            goto L_0x010c
        L_0x0102:
            r9.skipToGroupEnd()
            r6 = r4
            r5 = r7
            r7 = r8
            r4 = r9
            r0 = r15
            goto L_0x06ae
        L_0x010c:
            if (r2 == 0) goto L_0x0117
            androidx.compose.foundation.text.KeyboardOptions$Companion r1 = androidx.compose.foundation.text.KeyboardOptions.Companion
            androidx.compose.foundation.text.KeyboardOptions r1 = r1.getDefault()
            r112 = r1
            goto L_0x0119
        L_0x0117:
            r112 = r4
        L_0x0119:
            if (r16 == 0) goto L_0x0124
            androidx.compose.foundation.text.KeyboardActions$Companion r1 = androidx.compose.foundation.text.KeyboardActions.Companion
            androidx.compose.foundation.text.KeyboardActions r1 = r1.getDefault()
            r113 = r1
            goto L_0x0126
        L_0x0124:
            r113 = r8
        L_0x0126:
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x0133
            r1 = -1
            java.lang.String r2 = "androidx.compose.material3.TimePickerTextField (TimePicker.kt:1386)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r14, r1, r2)
        L_0x0133:
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r9.startReplaceableGroup(r0)
            java.lang.String r1 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r9, r1)
            java.lang.Object r1 = r9.rememberedValue()
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r1 != r2) goto L_0x0151
            androidx.compose.foundation.interaction.MutableInteractionSource r1 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r9.updateRememberedValue(r1)
        L_0x0151:
            r9.endReplaceableGroup()
            r8 = r1
            androidx.compose.foundation.interaction.MutableInteractionSource r8 = (androidx.compose.foundation.interaction.MutableInteractionSource) r8
            r9.startReplaceableGroup(r0)
            java.lang.String r0 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r9, r0)
            java.lang.Object r0 = r9.rememberedValue()
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r0 != r1) goto L_0x0173
            androidx.compose.ui.focus.FocusRequester r0 = new androidx.compose.ui.focus.FocusRequester
            r0.<init>()
            r9.updateRememberedValue(r0)
        L_0x0173:
            r9.endReplaceableGroup()
            r4 = r0
            androidx.compose.ui.focus.FocusRequester r4 = (androidx.compose.ui.focus.FocusRequester) r4
            androidx.compose.material3.OutlinedTextFieldDefaults r16 = androidx.compose.material3.OutlinedTextFieldDefaults.INSTANCE
            r3 = 1
            long r25 = r12.m1737timeSelectorContainerColorvNxB06k$material3_release(r3)
            long r27 = r12.m1737timeSelectorContainerColorvNxB06k$material3_release(r3)
            long r17 = r12.m1738timeSelectorContentColorvNxB06k$material3_release(r3)
            r19 = 0
            r21 = 0
            r23 = 0
            r29 = 0
            r31 = 0
            r33 = 0
            r35 = 0
            r37 = 0
            r38 = 0
            r40 = 0
            r42 = 0
            r44 = 0
            r46 = 0
            r48 = 0
            r50 = 0
            r52 = 0
            r54 = 0
            r56 = 0
            r58 = 0
            r60 = 0
            r62 = 0
            r64 = 0
            r66 = 0
            r68 = 0
            r70 = 0
            r72 = 0
            r74 = 0
            r76 = 0
            r78 = 0
            r80 = 0
            r82 = 0
            r84 = 0
            r86 = 0
            r88 = 0
            r90 = 0
            r92 = 0
            r94 = 0
            r96 = 0
            r98 = 0
            r100 = 0
            r103 = 0
            r104 = 0
            r105 = 0
            r106 = 0
            r107 = 3072(0xc00, float:4.305E-42)
            r108 = 2147483598(0x7fffffce, float:NaN)
            r109 = 4095(0xfff, float:5.738E-42)
            r102 = r9
            androidx.compose.material3.TextFieldColors r2 = r16.m1474colors0hiis_0(r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r38, r40, r42, r44, r46, r48, r50, r52, r54, r56, r58, r60, r62, r64, r66, r68, r70, r72, r74, r76, r78, r80, r82, r84, r86, r88, r90, r92, r94, r96, r98, r100, r102, r103, r104, r105, r106, r107, r108, r109)
            int r0 = r118.m1770getSelectionJiIwxys$material3_release()
            boolean r1 = androidx.compose.material3.Selection.m1536equalsimpl0(r15, r0)
            r0 = r14 & 14
            r3 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r9.startReplaceableGroup(r3)
            java.lang.String r3 = "CC(Column)P(2,3,1)77@3913L61,78@3979L133:Column.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformation(r9, r3)
            androidx.compose.foundation.layout.Arrangement r3 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            androidx.compose.foundation.layout.Arrangement$Vertical r3 = r3.getTop()
            androidx.compose.ui.Alignment$Companion r16 = androidx.compose.ui.Alignment.Companion
            r121 = r2
            androidx.compose.ui.Alignment$Horizontal r2 = r16.getStart()
            int r16 = r0 >> 3
            r17 = r16 & 14
            r16 = r16 & 112(0x70, float:1.57E-43)
            r18 = r4
            r4 = r17 | r16
            androidx.compose.ui.layout.MeasurePolicy r2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(r3, r2, r9, r4)
            r16 = 3
            int r0 = r0 << 3
            r0 = r0 & 112(0x70, float:1.57E-43)
            r3 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r9.startReplaceableGroup(r3)
            java.lang.String r3 = "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh"
            androidx.compose.runtime.ComposerKt.sourceInformation(r9, r3)
            androidx.compose.runtime.ProvidableCompositionLocal r3 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r3 = (androidx.compose.runtime.CompositionLocal) r3
            r4 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r7 = "C:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r9, r4, r7)
            java.lang.Object r3 = r9.consume(r3)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r9)
            androidx.compose.ui.unit.Density r3 = (androidx.compose.ui.unit.Density) r3
            androidx.compose.runtime.ProvidableCompositionLocal r17 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            r5 = r17
            androidx.compose.runtime.CompositionLocal r5 = (androidx.compose.runtime.CompositionLocal) r5
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r9, r4, r7)
            java.lang.Object r5 = r9.consume(r5)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r9)
            androidx.compose.ui.unit.LayoutDirection r5 = (androidx.compose.ui.unit.LayoutDirection) r5
            androidx.compose.runtime.ProvidableCompositionLocal r17 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            r6 = r17
            androidx.compose.runtime.CompositionLocal r6 = (androidx.compose.runtime.CompositionLocal) r6
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r9, r4, r7)
            java.lang.Object r6 = r9.consume(r6)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r9)
            androidx.compose.ui.platform.ViewConfiguration r6 = (androidx.compose.ui.platform.ViewConfiguration) r6
            androidx.compose.ui.node.ComposeUiNode$Companion r17 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function0 r4 = r17.getConstructor()
            r17 = r8
            kotlin.jvm.functions.Function3 r8 = androidx.compose.ui.layout.LayoutKt.materializerOf(r115)
            int r0 = r0 << 9
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r12 = 6
            r0 = r0 | r12
            androidx.compose.runtime.Applier r12 = r9.getApplier()
            boolean r12 = r12 instanceof androidx.compose.runtime.Applier
            if (r12 != 0) goto L_0x028b
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x028b:
            r9.startReusableNode()
            boolean r12 = r9.getInserting()
            if (r12 == 0) goto L_0x0298
            r9.createNode(r4)
            goto L_0x029b
        L_0x0298:
            r9.useNode()
        L_0x029b:
            r9.disableReusing()
            androidx.compose.runtime.Composer r4 = androidx.compose.runtime.Updater.m2444constructorimpl(r9)
            androidx.compose.ui.node.ComposeUiNode$Companion r12 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r12 = r12.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r4, r2, r12)
            androidx.compose.ui.node.ComposeUiNode$Companion r2 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r2 = r2.getSetDensity()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r4, r3, r2)
            androidx.compose.ui.node.ComposeUiNode$Companion r2 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r2 = r2.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r4, r5, r2)
            androidx.compose.ui.node.ComposeUiNode$Companion r2 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r2 = r2.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r4, r6, r2)
            r9.enableReusing()
            androidx.compose.runtime.Composer r2 = androidx.compose.runtime.SkippableUpdater.m2436constructorimpl(r9)
            androidx.compose.runtime.SkippableUpdater r2 = androidx.compose.runtime.SkippableUpdater.m2435boximpl(r2)
            int r0 = r0 >> 3
            r0 = r0 & 112(0x70, float:1.57E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.invoke(r2, r9, r0)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r9.startReplaceableGroup(r0)
            r0 = 276693704(0x107e02c8, float:5.009481E-29)
            java.lang.String r2 = "C79@4027L9:Column.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r9, r0, r2)
            androidx.compose.foundation.layout.ColumnScopeInstance r0 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE
            androidx.compose.foundation.layout.ColumnScope r0 = (androidx.compose.foundation.layout.ColumnScope) r0
            r0 = 896149831(0x356a2947, float:8.723186E-7)
            java.lang.String r2 = "C1415@53727L202,1423@53939L2043,1474@56136L206,1481@56409L9,1483@56471L10,1470@55992L571:TimePicker.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r9, r0, r2)
            r9.startReplaceableGroup(r0)
            java.lang.String r0 = "1406@53362L320"
            androidx.compose.runtime.ComposerKt.sourceInformation(r9, r0)
            if (r1 != 0) goto L_0x0350
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            androidx.compose.material3.tokens.TimeInputTokens r2 = androidx.compose.material3.tokens.TimeInputTokens.INSTANCE
            float r2 = r2.m2339getTimeFieldContainerWidthD9Ej5fM()
            androidx.compose.material3.tokens.TimeInputTokens r3 = androidx.compose.material3.tokens.TimeInputTokens.INSTANCE
            float r3 = r3.m2338getTimeFieldContainerHeightD9Ej5fM()
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.m565sizeVpY3zN4(r0, r2, r3)
            androidx.compose.material3.Selection$Companion r2 = androidx.compose.material3.Selection.Companion
            int r2 = r2.m1540getHourJiIwxys()
            boolean r2 = androidx.compose.material3.Selection.m1536equalsimpl0(r15, r2)
            if (r2 == 0) goto L_0x0325
            int r2 = r118.getHourForDisplay$material3_release()
            goto L_0x0329
        L_0x0325:
            int r2 = r118.getMinute()
        L_0x0329:
            int r3 = r14 >> 3
            r4 = r3 & 896(0x380, float:1.256E-42)
            r5 = 6
            r4 = r4 | r5
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | r4
            int r4 = r14 >> 9
            r5 = 57344(0xe000, float:8.0356E-41)
            r4 = r4 & r5
            r6 = r3 | r4
            r8 = r1
            r1 = r2
            r12 = r121
            r2 = r118
            r5 = 1
            r3 = r119
            r12 = r18
            r10 = 2023513938(0x789c5f52, float:2.5372864E34)
            r4 = r122
            r11 = r5
            r5 = r9
            m1744TimeSelectoruXwN82Y(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0357
        L_0x0350:
            r8 = r1
            r12 = r18
            r10 = 2023513938(0x789c5f52, float:2.5372864E34)
            r11 = 1
        L_0x0357:
            r9.endReplaceableGroup()
            androidx.compose.material3.Selection$Companion r0 = androidx.compose.material3.Selection.Companion
            int r0 = r0.m1541getMinuteJiIwxys()
            boolean r0 = androidx.compose.material3.Selection.m1536equalsimpl0(r15, r0)
            if (r0 == 0) goto L_0x036d
            androidx.compose.material3.Strings$Companion r0 = androidx.compose.material3.Strings.Companion
            int r0 = r0.m1627getTimePickerMinuteTextFieldadMyvUU()
            goto L_0x0373
        L_0x036d:
            androidx.compose.material3.Strings$Companion r0 = androidx.compose.material3.Strings.Companion
            int r0 = r0.m1623getTimePickerHourTextFieldadMyvUU()
        L_0x0373:
            r6 = 0
            java.lang.String r0 = androidx.compose.material3.Strings_androidKt.m1632getStringNWtq28(r0, r9, r6)
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
            androidx.compose.ui.Modifier r1 = visible(r1, r8)
            r2 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r9.startReplaceableGroup(r2)
            java.lang.String r2 = "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformation(r9, r2)
            androidx.compose.ui.Alignment$Companion r2 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment r2 = r2.getTopStart()
            androidx.compose.ui.layout.MeasurePolicy r2 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(r2, r6, r9, r6)
            r3 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r9.startReplaceableGroup(r3)
            java.lang.String r3 = "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh"
            androidx.compose.runtime.ComposerKt.sourceInformation(r9, r3)
            androidx.compose.runtime.ProvidableCompositionLocal r3 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r3 = (androidx.compose.runtime.CompositionLocal) r3
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r9, r10, r7)
            java.lang.Object r3 = r9.consume(r3)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r9)
            androidx.compose.ui.unit.Density r3 = (androidx.compose.ui.unit.Density) r3
            androidx.compose.runtime.ProvidableCompositionLocal r4 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            androidx.compose.runtime.CompositionLocal r4 = (androidx.compose.runtime.CompositionLocal) r4
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r9, r10, r7)
            java.lang.Object r4 = r9.consume(r4)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r9)
            androidx.compose.ui.unit.LayoutDirection r4 = (androidx.compose.ui.unit.LayoutDirection) r4
            androidx.compose.runtime.ProvidableCompositionLocal r5 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            androidx.compose.runtime.CompositionLocal r5 = (androidx.compose.runtime.CompositionLocal) r5
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r9, r10, r7)
            java.lang.Object r5 = r9.consume(r5)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r9)
            androidx.compose.ui.platform.ViewConfiguration r5 = (androidx.compose.ui.platform.ViewConfiguration) r5
            androidx.compose.ui.node.ComposeUiNode$Companion r7 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function0 r7 = r7.getConstructor()
            kotlin.jvm.functions.Function3 r1 = androidx.compose.ui.layout.LayoutKt.materializerOf(r1)
            androidx.compose.runtime.Applier r8 = r9.getApplier()
            boolean r8 = r8 instanceof androidx.compose.runtime.Applier
            if (r8 != 0) goto L_0x03eb
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x03eb:
            r9.startReusableNode()
            boolean r8 = r9.getInserting()
            if (r8 == 0) goto L_0x03f8
            r9.createNode(r7)
            goto L_0x03fb
        L_0x03f8:
            r9.useNode()
        L_0x03fb:
            r9.disableReusing()
            androidx.compose.runtime.Composer r7 = androidx.compose.runtime.Updater.m2444constructorimpl(r9)
            androidx.compose.ui.node.ComposeUiNode$Companion r8 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r8 = r8.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r7, r2, r8)
            androidx.compose.ui.node.ComposeUiNode$Companion r2 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r2 = r2.getSetDensity()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r7, r3, r2)
            androidx.compose.ui.node.ComposeUiNode$Companion r2 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r2 = r2.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r7, r4, r2)
            androidx.compose.ui.node.ComposeUiNode$Companion r2 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r2 = r2.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r7, r5, r2)
            r9.enableReusing()
            androidx.compose.runtime.Composer r2 = androidx.compose.runtime.SkippableUpdater.m2436constructorimpl(r9)
            androidx.compose.runtime.SkippableUpdater r2 = androidx.compose.runtime.SkippableUpdater.m2435boximpl(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            r1.invoke(r2, r9, r3)
            r1 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r9.startReplaceableGroup(r1)
            r1 = -1253629305(0xffffffffb5472287, float:-7.418352E-7)
            java.lang.String r2 = "C72@3384L9:Box.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r9, r1, r2)
            androidx.compose.foundation.layout.BoxScopeInstance r1 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE
            androidx.compose.foundation.layout.BoxScope r1 = (androidx.compose.foundation.layout.BoxScope) r1
            r1 = -1694936332(0xffffffff9af952f4, float:-1.03118004E-22)
            java.lang.String r2 = "C1430@54275L92,1436@54569L7,1442@54838L11,1443@54902L11,1424@53985L1987:TimePicker.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r9, r1, r2)
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.focus.FocusRequesterModifierKt.focusRequester(r1, r12)
            androidx.compose.material3.tokens.TimeInputTokens r2 = androidx.compose.material3.tokens.TimeInputTokens.INSTANCE
            float r2 = r2.m2339getTimeFieldContainerWidthD9Ej5fM()
            androidx.compose.material3.tokens.TimeInputTokens r3 = androidx.compose.material3.tokens.TimeInputTokens.INSTANCE
            float r3 = r3.m2338getTimeFieldContainerHeightD9Ej5fM()
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.m565sizeVpY3zN4(r1, r2, r3)
            r2 = 1157296644(0x44faf204, float:2007.563)
            r9.startReplaceableGroup(r2)
            java.lang.String r2 = "CC(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r9, r2)
            boolean r2 = r9.changed((java.lang.Object) r0)
            java.lang.Object r3 = r9.rememberedValue()
            if (r2 != 0) goto L_0x0487
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r3 != r2) goto L_0x0492
        L_0x0487:
            androidx.compose.material3.TimePickerKt$TimePickerTextField$1$1$1$1 r2 = new androidx.compose.material3.TimePickerKt$TimePickerTextField$1$1$1$1
            r2.<init>(r0)
            r3 = r2
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            r9.updateRememberedValue(r3)
        L_0x0492:
            r9.endReplaceableGroup()
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            r7 = 0
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(r1, r6, r3, r11, r7)
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.material3.TextKt.getLocalTextStyle()
            androidx.compose.runtime.CompositionLocal r0 = (androidx.compose.runtime.CompositionLocal) r0
            java.lang.String r1 = "CC:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r9, r10, r1)
            java.lang.Object r0 = r9.consume(r0)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r9)
            r5 = r0
            androidx.compose.ui.text.TextStyle r5 = (androidx.compose.ui.text.TextStyle) r5
            androidx.compose.ui.graphics.Brush$Companion r21 = androidx.compose.ui.graphics.Brush.Companion
            r0 = 6
            kotlin.Pair[] r1 = new kotlin.Pair[r0]
            r0 = 0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            androidx.compose.ui.graphics.Color$Companion r3 = androidx.compose.ui.graphics.Color.Companion
            long r3 = r3.m2856getTransparent0d7_KjU()
            androidx.compose.ui.graphics.Color r3 = androidx.compose.ui.graphics.Color.m2811boximpl(r3)
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r3)
            r1[r6] = r0
            r0 = 1036831949(0x3dcccccd, float:0.1)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            androidx.compose.ui.graphics.Color$Companion r3 = androidx.compose.ui.graphics.Color.Companion
            long r3 = r3.m2856getTransparent0d7_KjU()
            androidx.compose.ui.graphics.Color r3 = androidx.compose.ui.graphics.Color.m2811boximpl(r3)
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r3)
            r1[r11] = r0
            r0 = 1036831949(0x3dcccccd, float:0.1)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            androidx.compose.material3.MaterialTheme r3 = androidx.compose.material3.MaterialTheme.INSTANCE
            r10 = 6
            androidx.compose.material3.ColorScheme r3 = r3.getColorScheme(r9, r10)
            long r3 = r3.m1201getPrimary0d7_KjU()
            androidx.compose.ui.graphics.Color r3 = androidx.compose.ui.graphics.Color.m2811boximpl(r3)
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r3)
            r3 = 2
            r1[r3] = r0
            r0 = 1063675494(0x3f666666, float:0.9)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            androidx.compose.material3.MaterialTheme r3 = androidx.compose.material3.MaterialTheme.INSTANCE
            androidx.compose.material3.ColorScheme r3 = r3.getColorScheme(r9, r10)
            long r3 = r3.m1201getPrimary0d7_KjU()
            androidx.compose.ui.graphics.Color r3 = androidx.compose.ui.graphics.Color.m2811boximpl(r3)
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r3)
            r1[r16] = r0
            r0 = 1063675494(0x3f666666, float:0.9)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            androidx.compose.ui.graphics.Color$Companion r3 = androidx.compose.ui.graphics.Color.Companion
            long r3 = r3.m2856getTransparent0d7_KjU()
            androidx.compose.ui.graphics.Color r3 = androidx.compose.ui.graphics.Color.m2811boximpl(r3)
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r3)
            r3 = 4
            r1[r3] = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            androidx.compose.ui.graphics.Color$Companion r3 = androidx.compose.ui.graphics.Color.Companion
            long r3 = r3.m2856getTransparent0d7_KjU()
            androidx.compose.ui.graphics.Color r3 = androidx.compose.ui.graphics.Color.m2811boximpl(r3)
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r3)
            r3 = 5
            r1[r3] = r0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 14
            r27 = 0
            r22 = r1
            androidx.compose.ui.graphics.Brush r0 = androidx.compose.ui.graphics.Brush.Companion.m2769verticalGradient8A3gB4$default((androidx.compose.ui.graphics.Brush.Companion) r21, (kotlin.Pair[]) r22, (float) r23, (float) r24, (int) r25, (int) r26, (java.lang.Object) r27)
            r1 = r14
            r14 = r0
            r3 = 1
            r4 = 0
            r8 = 1
            r0 = r17
            r17 = 0
            r3 = r9
            r9 = r17
            r18 = r10
            r10 = r17
            r17 = 0
            r4 = r11
            r11 = r17
            r6 = r121
            r114 = r12
            r12 = r17
            androidx.compose.material3.TimePickerKt$TimePickerTextField$1$1$2 r7 = new androidx.compose.material3.TimePickerKt$TimePickerTextField$1$1$2
            r7.<init>(r13, r0, r6)
            r6 = 2133555260(0x7f2b783c, float:2.2792228E38)
            androidx.compose.runtime.internal.ComposableLambda r6 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r3, r6, r4, r7)
            kotlin.jvm.functions.Function3 r6 = (kotlin.jvm.functions.Function3) r6
            r7 = r15
            r15 = r6
            int r6 = r1 >> 3
            r17 = r6 & 14
            r18 = 100666368(0x6000c00, float:2.408294E-35)
            r17 = r17 | r18
            r6 = r6 & 112(0x70, float:1.57E-43)
            r6 = r17 | r6
            int r1 = r1 << 3
            r16 = r1 & r110
            r6 = r6 | r16
            r1 = r1 & r111
            r17 = r6 | r1
            r18 = 199680(0x30c00, float:2.79811E-40)
            r19 = 7696(0x1e10, float:1.0784E-41)
            r16 = r0
            r0 = r116
            r1 = r117
            r6 = r112
            r7 = r113
            r13 = r16
            r16 = r3
            r121 = r3
            r3 = 1
            r4 = 0
            androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField((androidx.compose.ui.text.input.TextFieldValue) r0, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit>) r1, (androidx.compose.ui.Modifier) r2, (boolean) r3, (boolean) r4, (androidx.compose.ui.text.TextStyle) r5, (androidx.compose.foundation.text.KeyboardOptions) r6, (androidx.compose.foundation.text.KeyboardActions) r7, (boolean) r8, (int) r9, (int) r10, (androidx.compose.ui.text.input.VisualTransformation) r11, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) r12, (androidx.compose.foundation.interaction.MutableInteractionSource) r13, (androidx.compose.ui.graphics.Brush) r14, (kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) r15, (androidx.compose.runtime.Composer) r16, (int) r17, (int) r18, (int) r19)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r121)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r121)
            r121.endReplaceableGroup()
            r121.endNode()
            r121.endReplaceableGroup()
            r121.endReplaceableGroup()
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            r1 = 0
            float r2 = SupportLabelTop
            r3 = 1
            r14 = 0
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.OffsetKt.m480offsetVpY3zN4$default(r0, r1, r2, r3, r14)
            androidx.compose.material3.TimePickerKt$TimePickerTextField$1$2 r1 = androidx.compose.material3.TimePickerKt$TimePickerTextField$1$2.INSTANCE
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.semantics.SemanticsModifierKt.clearAndSetSemantics(r0, r1)
            androidx.compose.material3.Selection$Companion r0 = androidx.compose.material3.Selection.Companion
            int r0 = r0.m1540getHourJiIwxys()
            r15 = r119
            boolean r0 = androidx.compose.material3.Selection.m1536equalsimpl0(r15, r0)
            if (r0 == 0) goto L_0x05f1
            androidx.compose.material3.Strings$Companion r0 = androidx.compose.material3.Strings.Companion
            int r0 = r0.m1620getTimePickerHouradMyvUU()
            goto L_0x05f7
        L_0x05f1:
            androidx.compose.material3.Strings$Companion r0 = androidx.compose.material3.Strings.Companion
            int r0 = r0.m1624getTimePickerMinuteadMyvUU()
        L_0x05f7:
            r13 = r121
            r1 = 0
            java.lang.String r1 = androidx.compose.material3.Strings_androidKt.m1632getStringNWtq28(r0, r13, r1)
            androidx.compose.material3.tokens.TimeInputTokens r0 = androidx.compose.material3.tokens.TimeInputTokens.INSTANCE
            androidx.compose.material3.tokens.ColorSchemeKeyTokens r0 = r0.getTimeFieldSupportingTextColor()
            r5 = 6
            long r3 = androidx.compose.material3.ColorSchemeKt.toColor(r0, r13, r5)
            androidx.compose.material3.MaterialTheme r0 = androidx.compose.material3.MaterialTheme.INSTANCE
            androidx.compose.material3.Typography r0 = r0.getTypography(r13, r5)
            androidx.compose.material3.tokens.TimeInputTokens r5 = androidx.compose.material3.tokens.TimeInputTokens.INSTANCE
            androidx.compose.material3.tokens.TypographyKeyTokens r5 = r5.getTimeFieldSupportingTextFont()
            androidx.compose.ui.text.TextStyle r21 = androidx.compose.material3.TypographyKt.fromToken(r0, r5)
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r0 = 0
            r121 = r13
            r13 = r0
            r16 = 0
            r0 = r15
            r14 = r16
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r23 = 0
            r24 = 0
            r25 = 65528(0xfff8, float:9.1824E-41)
            r22 = r121
            androidx.compose.material3.TextKt.m1727Text4IGK_g((java.lang.String) r1, (androidx.compose.ui.Modifier) r2, (long) r3, (long) r5, (androidx.compose.ui.text.font.FontStyle) r7, (androidx.compose.ui.text.font.FontWeight) r8, (androidx.compose.ui.text.font.FontFamily) r9, (long) r10, (androidx.compose.ui.text.style.TextDecoration) r12, (androidx.compose.ui.text.style.TextAlign) r13, (long) r14, (int) r16, (boolean) r17, (int) r18, (int) r19, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) r20, (androidx.compose.ui.text.TextStyle) r21, (androidx.compose.runtime.Composer) r22, (int) r23, (int) r24, (int) r25)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r121)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r121)
            r121.endReplaceableGroup()
            r121.endNode()
            r121.endReplaceableGroup()
            r121.endReplaceableGroup()
            int r1 = r118.m1770getSelectionJiIwxys$material3_release()
            androidx.compose.material3.Selection r1 = androidx.compose.material3.Selection.m1533boximpl(r1)
            androidx.compose.material3.Selection r2 = androidx.compose.material3.Selection.m1533boximpl(r119)
            r3 = 1618982084(0x607fb4c4, float:7.370227E19)
            r4 = r121
            r4.startReplaceableGroup(r3)
            java.lang.String r3 = "CC(remember)P(1,2,3):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r4, r3)
            r5 = r118
            boolean r3 = r4.changed((java.lang.Object) r5)
            boolean r2 = r4.changed((java.lang.Object) r2)
            r2 = r2 | r3
            r3 = r114
            boolean r6 = r4.changed((java.lang.Object) r3)
            r2 = r2 | r6
            java.lang.Object r6 = r4.rememberedValue()
            if (r2 != 0) goto L_0x068b
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r6 != r2) goto L_0x0697
        L_0x068b:
            androidx.compose.material3.TimePickerKt$TimePickerTextField$2$1 r2 = new androidx.compose.material3.TimePickerKt$TimePickerTextField$2$1
            r6 = 0
            r2.<init>(r5, r0, r3, r6)
            r6 = r2
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            r4.updateRememberedValue(r6)
        L_0x0697:
            r4.endReplaceableGroup()
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            r2 = 64
            androidx.compose.runtime.EffectsKt.LaunchedEffect((java.lang.Object) r1, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) r6, (androidx.compose.runtime.Composer) r4, (int) r2)
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x06aa
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x06aa:
            r6 = r112
            r7 = r113
        L_0x06ae:
            androidx.compose.runtime.ScopeUpdateScope r11 = r4.endRestartGroup()
            if (r11 != 0) goto L_0x06b5
            goto L_0x06d0
        L_0x06b5:
            androidx.compose.material3.TimePickerKt$TimePickerTextField$3 r12 = new androidx.compose.material3.TimePickerKt$TimePickerTextField$3
            r0 = r12
            r1 = r115
            r2 = r116
            r3 = r117
            r4 = r118
            r5 = r119
            r8 = r122
            r9 = r124
            r10 = r125
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            kotlin.jvm.functions.Function2 r12 = (kotlin.jvm.functions.Function2) r12
            r11.updateScope(r12)
        L_0x06d0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.m1743TimePickerTextFieldlxUZ_iY(androidx.compose.ui.Modifier, androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.material3.TimePickerState, int, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, androidx.compose.material3.TimePickerColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: CircularLayout-uFdPcIQ  reason: not valid java name */
    public static final void m1741CircularLayoutuFdPcIQ(Modifier modifier, float f, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i, int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(1548175696);
        ComposerKt.sourceInformation(startRestartGroup, "C(CircularLayout)P(1,2:c#ui.unit.Dp)1502@56908L1669:TimePicker.kt#uh7d8r");
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed((Object) modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i3 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1548175696, i3, -1, "androidx.compose.material3.CircularLayout (TimePicker.kt:1497)");
            }
            MeasurePolicy timePickerKt$CircularLayout$1 = new TimePickerKt$CircularLayout$1(f);
            int i5 = ((i3 >> 6) & 14) | ((i3 << 3) & 112);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)73@2855L7,74@2910L7,75@2969L7,76@2981L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density = (Density) consume;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection = (LayoutDirection) consume2;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume3 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(modifier);
            int i6 = ((i5 << 9) & 7168) | 6;
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer r4 = Updater.m2444constructorimpl(startRestartGroup);
            Updater.m2451setimpl(r4, timePickerKt$CircularLayout$1, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2451setimpl(r4, density, ComposeUiNode.Companion.getSetDensity());
            Updater.m2451setimpl(r4, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2451setimpl(r4, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
            materializerOf.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i6 >> 3) & 112));
            startRestartGroup.startReplaceableGroup(2058660585);
            function2.invoke(startRestartGroup, Integer.valueOf((i6 >> 9) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TimePickerKt$CircularLayout$2(modifier2, f, function2, i, i2));
        }
    }

    /* renamed from: numberContentDescription-YKJpE6Y  reason: not valid java name */
    public static final String m1749numberContentDescriptionYKJpE6Y(int i, boolean z, int i2, Composer composer, int i3) {
        int i4;
        ComposerKt.sourceInformationMarkerStart(composer, 1826155772, "C(numberContentDescription)P(2:c#material3.Selection)1555@58952L21:TimePicker.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1826155772, i3, -1, "androidx.compose.material3.numberContentDescription (TimePicker.kt:1542)");
        }
        if (Selection.m1536equalsimpl0(i, Selection.Companion.m1541getMinuteJiIwxys())) {
            i4 = Strings.Companion.m1626getTimePickerMinuteSuffixadMyvUU();
        } else if (z) {
            i4 = Strings.Companion.m1618getTimePicker24HourSuffixadMyvUU();
        } else {
            i4 = Strings.Companion.m1622getTimePickerHourSuffixadMyvUU();
        }
        String r3 = Strings_androidKt.m1633getStringiSCLEhQ(i4, new Object[]{Integer.valueOf(i2)}, composer, 64);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return r3;
    }

    /* access modifiers changed from: private */
    public static final Pair<Float, Float> valuesForAnimation(float f, float f2) {
        if (((double) Math.abs(f - f2)) <= 3.141592653589793d) {
            return new Pair<>(Float.valueOf(f), Float.valueOf(f2));
        }
        double d = (double) f;
        if (d > 3.141592653589793d && ((double) f2) < 3.141592653589793d) {
            f2 += FullCircle;
        } else if (d < 3.141592653589793d && ((double) f2) > 3.141592653589793d) {
            f += FullCircle;
        }
        return new Pair<>(Float.valueOf(f), Float.valueOf(f2));
    }

    /* access modifiers changed from: private */
    public static final float dist(float f, float f2, int i, int i2) {
        return (float) Math.hypot((double) (((float) i) - f), (double) (((float) i2) - f2));
    }

    /* access modifiers changed from: private */
    public static final float atan(float f, float f2) {
        float atan2 = ((float) Math.atan2((double) f, (double) f2)) - 1.5707964f;
        return atan2 < 0.0f ? atan2 + FullCircle : atan2;
    }

    private static final Modifier visible(Modifier modifier, boolean z) {
        return modifier.then(new VisibleModifier(z, InspectableValueKt.isDebugInspectorInfoEnabled() ? new TimePickerKt$visible$$inlined$debugInspectorInfo$1(z) : InspectableValueKt.getNoInspectorInfo()));
    }

    /* access modifiers changed from: private */
    public static final String toLocalString(int i, int i2) {
        NumberFormat integerInstance = NumberFormat.getIntegerInstance();
        integerInstance.setGroupingUsed(false);
        integerInstance.setMinimumIntegerDigits(i2);
        String format = integerInstance.format(Integer.valueOf(i));
        Intrinsics.checkNotNullExpressionValue(format, "formatter.format(this)");
        return format;
    }

    /* access modifiers changed from: private */
    public static final Modifier clockDial(Modifier modifier, TimePickerState timePickerState, boolean z) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new TimePickerKt$clockDial$$inlined$debugInspectorInfo$1(timePickerState) : InspectableValueKt.getNoInspectorInfo(), new TimePickerKt$clockDial$2(timePickerState, z));
    }

    private static final boolean TimePicker_mT9BvqQ$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final void TimeInputImpl$lambda$6(MutableState<TextFieldValue> mutableState, TextFieldValue textFieldValue) {
        mutableState.setValue(textFieldValue);
    }

    /* access modifiers changed from: private */
    public static final void TimeInputImpl$lambda$9(MutableState<TextFieldValue> mutableState, TextFieldValue textFieldValue) {
        mutableState.setValue(textFieldValue);
    }

    static {
        float f = (float) 24;
        ClockFaceBottomMargin = Dp.m5626constructorimpl(f);
        DisplaySeparatorWidth = Dp.m5626constructorimpl(f);
        TimeInputBottomPadding = Dp.m5626constructorimpl(f);
        List<Integer> listOf = CollectionsKt.listOf(12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        Hours = listOf;
        Iterable<Number> iterable = listOf;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (Number intValue : iterable) {
            arrayList.add(Integer.valueOf((intValue.intValue() % 12) + 12));
        }
        ExtraHours = (List) arrayList;
    }
}
