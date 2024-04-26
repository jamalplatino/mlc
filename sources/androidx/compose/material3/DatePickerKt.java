package androidx.compose.material3;

import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.profileinstaller.ProfileVerifier;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000¼\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0001\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0013\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0018¢\u0006\u0002\b\u00192\u0013\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0018¢\u0006\u0002\b\u00192\u0013\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0018¢\u0006\u0002\b\u00192\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00032\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\u00140\u0018¢\u0006\u0002\b\u0019H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a\u0001\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020&2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010'\u001a\u00020(2\u0014\b\u0002\u0010)\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0*2\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0018¢\u0006\u0002\b\u00192\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0018¢\u0006\u0002\b\u00192\b\b\u0002\u0010-\u001a\u00020,2\b\b\u0002\u0010\u001c\u001a\u00020\u001dH\u0007¢\u0006\u0002\u0010.\u001a9\u0010/\u001a\u00020\u00142\u0006\u00100\u001a\u0002012\u0006\u0010'\u001a\u00020(2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0*2\u0006\u0010\u001c\u001a\u00020\u001dH\u0003¢\u0006\u0002\u00102\u001a]\u00103\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0013\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0018¢\u0006\u0002\b\u00192\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u00020\u00032\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\u00140\u0018¢\u0006\u0002\b\u0019H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b8\u00109\u001an\u0010:\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010;\u001a\u00020,2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00140\u00182\u0006\u0010=\u001a\u00020,2\u0006\u0010>\u001a\u00020,2\u0006\u0010?\u001a\u00020,2\u0006\u0010@\u001a\u00020,2\u0006\u0010A\u001a\u00020B2\u0006\u0010\u001c\u001a\u00020\u001d2\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\u00140\u0018¢\u0006\u0002\b\u0019H\u0003¢\u0006\u0002\u0010C\u001a9\u0010D\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010E\u001a\u00020F2\u0012\u0010G\u001a\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020\u00140*H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bH\u0010I\u001ad\u0010J\u001a\u00020\u00142!\u0010K\u001a\u001d\u0012\u0013\u0012\u00110+¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(N\u0012\u0004\u0012\u00020\u00140*2\u0006\u00100\u001a\u0002012\u0006\u0010O\u001a\u00020P2\u0006\u0010'\u001a\u00020(2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0*2\u0006\u0010\u001c\u001a\u00020\u001dH\u0003¢\u0006\u0002\u0010Q\u001at\u0010R\u001a\u00020\u00142\u0006\u0010S\u001a\u00020T2!\u0010K\u001a\u001d\u0012\u0013\u0012\u00110+¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(N\u0012\u0004\u0012\u00020\u00140*2\u0006\u0010?\u001a\u00020U2\u0006\u00100\u001a\u0002012\u0006\u0010V\u001a\u00020,2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0*2\u0006\u0010'\u001a\u00020(2\u0006\u0010\u001c\u001a\u00020\u001dH\u0001¢\u0006\u0002\u0010W\u001a_\u0010X\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010Y\u001a\u00020,2\u0006\u0010Z\u001a\u00020,2\u0006\u0010[\u001a\u00020,2\u0006\u0010\\\u001a\u00020B2\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00140\u00182\f\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00140\u00182\f\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00140\u0018H\u0003¢\u0006\u0002\u0010`\u001a9\u0010a\u001a\u00020\u00142\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0*2\u0006\u0010\u001c\u001a\u00020\u001dH\u0003¢\u0006\u0002\u0010b\u001a\u001d\u0010c\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010d\u001a\u00020eH\u0001¢\u0006\u0002\u0010f\u001aV\u0010g\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010;\u001a\u00020,2\u0006\u0010h\u001a\u00020,2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00140\u00182\u0006\u0010A\u001a\u00020B2\u0006\u0010\u001c\u001a\u00020\u001d2\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\u00140\u0018¢\u0006\u0002\b\u0019H\u0003¢\u0006\u0002\u0010i\u001aH\u0010j\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162!\u0010k\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(l\u0012\u0004\u0012\u00020\u00140*2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u00100\u001a\u000201H\u0003¢\u0006\u0002\u0010m\u001a@\u0010n\u001a\u00020\u00142\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00140\u00182\u0006\u0010o\u001a\u00020,2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\u00140\u0018¢\u0006\u0002\b\u0019H\u0003¢\u0006\u0002\u0010p\u001a.\u0010q\u001a\b\u0012\u0004\u0012\u00020s0r2\u0006\u0010%\u001a\u00020t2\u0006\u0010u\u001a\u00020v2\u0006\u0010w\u001a\u00020B2\u0006\u0010x\u001a\u00020BH\u0002\u001a7\u0010y\u001a\u0004\u0018\u00010B2\u0006\u0010V\u001a\u00020,2\u0006\u0010z\u001a\u00020,2\u0006\u0010{\u001a\u00020,2\u0006\u0010|\u001a\u00020,2\u0006\u0010}\u001a\u00020,H\u0003¢\u0006\u0002\u0010~\u001aH\u0010\u001a\u00020&2\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010+2\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010\u0001\u001a\u00030\u00012\t\b\u0002\u0010\u0001\u001a\u00020FH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0001\u0010\u0001\u001a#\u0010\u0001\u001a\u00020\u00142\u0006\u0010O\u001a\u00020P2\u0006\u00100\u001a\u000201H@ø\u0001\u0000¢\u0006\u0003\u0010\u0001\u001a\r\u0010\u0001\u001a\u00020B*\u00020\fH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000\"\u0019\u0010\u0002\u001a\u00020\u0003X\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\"\u000e\u0010\n\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\fXT¢\u0006\u0002\n\u0000\"\u0019\u0010\r\u001a\u00020\u0003X\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u000e\u0010\u0005\"\u0019\u0010\u000f\u001a\u00020\u0003X\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0010\u0010\u0005\"\u000e\u0010\u0011\u001a\u00020\fXT¢\u0006\u0002\n\u0000\"\u0013\u0010\u0012\u001a\u00020\u0003X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0001"}, d2 = {"DatePickerHeadlinePadding", "Landroidx/compose/foundation/layout/PaddingValues;", "DatePickerHorizontalPadding", "Landroidx/compose/ui/unit/Dp;", "getDatePickerHorizontalPadding", "()F", "F", "DatePickerModeTogglePadding", "getDatePickerModeTogglePadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "DatePickerTitlePadding", "MaxCalendarRows", "", "MonthYearHeight", "getMonthYearHeight", "RecommendedSizeForAccessibility", "getRecommendedSizeForAccessibility", "YearsInRow", "YearsVerticalPadding", "DateEntryContainer", "", "modifier", "Landroidx/compose/ui/Modifier;", "title", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "headline", "modeToggleButton", "colors", "Landroidx/compose/material3/DatePickerColors;", "headlineTextStyle", "Landroidx/compose/ui/text/TextStyle;", "headerMinHeight", "content", "DateEntryContainer-au3_HiA", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/ui/text/TextStyle;FLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "DatePicker", "state", "Landroidx/compose/material3/DatePickerState;", "dateFormatter", "Landroidx/compose/material3/DatePickerFormatter;", "dateValidator", "Lkotlin/Function1;", "", "", "showModeToggle", "(Landroidx/compose/material3/DatePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DatePickerFormatter;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;II)V", "DatePickerContent", "stateData", "Landroidx/compose/material3/StateData;", "(Landroidx/compose/material3/StateData;Landroidx/compose/material3/DatePickerFormatter;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "DatePickerHeader", "titleContentColor", "Landroidx/compose/ui/graphics/Color;", "headlineContentColor", "minHeight", "DatePickerHeader-pc5RIQQ", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;JJFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Day", "selected", "onClick", "animateChecked", "enabled", "today", "inRange", "description", "", "(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;ZZZZLjava/lang/String;Landroidx/compose/material3/DatePickerColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "DisplayModeToggleButton", "displayMode", "Landroidx/compose/material3/DisplayMode;", "onDisplayModeChange", "DisplayModeToggleButton-tER2X8s", "(Landroidx/compose/ui/Modifier;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "HorizontalMonthsList", "onDateSelected", "Lkotlin/ParameterName;", "name", "dateInMillis", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/StateData;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/material3/DatePickerFormatter;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "Month", "month", "Landroidx/compose/material3/CalendarMonth;", "Landroidx/compose/material3/CalendarDate;", "rangeSelectionEnabled", "(Landroidx/compose/material3/CalendarMonth;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/CalendarDate;Landroidx/compose/material3/StateData;ZLkotlin/jvm/functions/Function1;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "MonthsNavigation", "nextAvailable", "previousAvailable", "yearPickerVisible", "yearPickerText", "onNextClicked", "onPreviousClicked", "onYearPickerButtonClicked", "(Landroidx/compose/ui/Modifier;ZZZLjava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "SwitchableDateEntryContent", "(Landroidx/compose/material3/DatePickerState;Landroidx/compose/material3/DatePickerFormatter;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "WeekDays", "calendarModel", "Landroidx/compose/material3/CalendarModel;", "(Landroidx/compose/material3/DatePickerColors;Landroidx/compose/material3/CalendarModel;Landroidx/compose/runtime/Composer;I)V", "Year", "currentYear", "(Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/material3/DatePickerColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "YearPicker", "onYearSelected", "year", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/material3/StateData;Landroidx/compose/runtime/Composer;I)V", "YearPickerMenuButton", "expanded", "(Lkotlin/jvm/functions/Function0;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "customScrollActions", "", "Landroidx/compose/ui/semantics/CustomAccessibilityAction;", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "scrollUpLabel", "scrollDownLabel", "dayContentDescription", "isToday", "isStartDate", "isEndDate", "isInRange", "(ZZZZZLandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "rememberDatePickerState", "initialSelectedDateMillis", "initialDisplayedMonthMillis", "yearRange", "Lkotlin/ranges/IntRange;", "initialDisplayMode", "rememberDatePickerState-NVmSL94", "(Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/IntRange;ILandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/DatePickerState;", "updateDisplayedMonth", "(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/material3/StateData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toLocalString", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: DatePicker.kt */
public final class DatePickerKt {
    /* access modifiers changed from: private */
    public static final PaddingValues DatePickerHeadlinePadding;
    private static final float DatePickerHorizontalPadding;
    private static final PaddingValues DatePickerModeTogglePadding;
    /* access modifiers changed from: private */
    public static final PaddingValues DatePickerTitlePadding;
    private static final int MaxCalendarRows = 6;
    private static final float MonthYearHeight = Dp.m5626constructorimpl((float) 56);
    private static final float RecommendedSizeForAccessibility = Dp.m5626constructorimpl((float) 48);
    private static final int YearsInRow = 3;
    /* access modifiers changed from: private */
    public static final float YearsVerticalPadding;

    public static final float getDatePickerHorizontalPadding() {
        return DatePickerHorizontalPadding;
    }

    public static final PaddingValues getDatePickerModeTogglePadding() {
        return DatePickerModeTogglePadding;
    }

    public static final float getMonthYearHeight() {
        return MonthYearHeight;
    }

    public static final float getRecommendedSizeForAccessibility() {
        return RecommendedSizeForAccessibility;
    }

    /* JADX WARNING: Removed duplicated region for block: B:127:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0274  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0282  */
    /* JADX WARNING: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0120  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void DatePicker(androidx.compose.material3.DatePickerState r56, androidx.compose.ui.Modifier r57, androidx.compose.material3.DatePickerFormatter r58, kotlin.jvm.functions.Function1<? super java.lang.Long, java.lang.Boolean> r59, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r60, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r61, boolean r62, androidx.compose.material3.DatePickerColors r63, androidx.compose.runtime.Composer r64, int r65, int r66) {
        /*
            r1 = r56
            r9 = r65
            r10 = r66
            java.lang.String r0 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = -1765097918(0xffffffff96cabe42, float:-3.275493E-25)
            r2 = r64
            androidx.compose.runtime.Composer r2 = r2.startRestartGroup(r0)
            java.lang.String r3 = "C(DatePicker)P(6,4,1,2,7,3,5)152@7324L34,168@7901L8,189@8580L10,170@7918L1043:DatePicker.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r3)
            r3 = r10 & 1
            if (r3 == 0) goto L_0x0021
            r3 = r9 | 6
            goto L_0x0031
        L_0x0021:
            r3 = r9 & 14
            if (r3 != 0) goto L_0x0030
            boolean r3 = r2.changed((java.lang.Object) r1)
            if (r3 == 0) goto L_0x002d
            r3 = 4
            goto L_0x002e
        L_0x002d:
            r3 = 2
        L_0x002e:
            r3 = r3 | r9
            goto L_0x0031
        L_0x0030:
            r3 = r9
        L_0x0031:
            r4 = r10 & 2
            if (r4 == 0) goto L_0x0038
            r3 = r3 | 48
            goto L_0x004b
        L_0x0038:
            r5 = r9 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x004b
            r5 = r57
            boolean r6 = r2.changed((java.lang.Object) r5)
            if (r6 == 0) goto L_0x0047
            r6 = 32
            goto L_0x0049
        L_0x0047:
            r6 = 16
        L_0x0049:
            r3 = r3 | r6
            goto L_0x004d
        L_0x004b:
            r5 = r57
        L_0x004d:
            r6 = r10 & 4
            if (r6 == 0) goto L_0x0054
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0067
        L_0x0054:
            r7 = r9 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0067
            r7 = r58
            boolean r8 = r2.changed((java.lang.Object) r7)
            if (r8 == 0) goto L_0x0063
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r3 = r3 | r8
            goto L_0x0069
        L_0x0067:
            r7 = r58
        L_0x0069:
            r8 = r10 & 8
            if (r8 == 0) goto L_0x0070
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0083
        L_0x0070:
            r11 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r11 != 0) goto L_0x0083
            r11 = r59
            boolean r12 = r2.changedInstance(r11)
            if (r12 == 0) goto L_0x007f
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007f:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r3 = r3 | r12
            goto L_0x0085
        L_0x0083:
            r11 = r59
        L_0x0085:
            r12 = r10 & 16
            r54 = 57344(0xe000, float:8.0356E-41)
            if (r12 == 0) goto L_0x008f
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a2
        L_0x008f:
            r13 = r9 & r54
            if (r13 != 0) goto L_0x00a2
            r13 = r60
            boolean r14 = r2.changedInstance(r13)
            if (r14 == 0) goto L_0x009e
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a0
        L_0x009e:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x00a0:
            r3 = r3 | r14
            goto L_0x00a4
        L_0x00a2:
            r13 = r60
        L_0x00a4:
            r14 = r10 & 32
            if (r14 == 0) goto L_0x00ac
            r15 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r15
            goto L_0x00c1
        L_0x00ac:
            r15 = 458752(0x70000, float:6.42848E-40)
            r15 = r15 & r9
            if (r15 != 0) goto L_0x00c1
            r15 = r61
            boolean r16 = r2.changedInstance(r15)
            if (r16 == 0) goto L_0x00bc
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00be
        L_0x00bc:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00be:
            r3 = r3 | r16
            goto L_0x00c3
        L_0x00c1:
            r15 = r61
        L_0x00c3:
            r16 = r10 & 64
            if (r16 == 0) goto L_0x00ce
            r17 = 1572864(0x180000, float:2.204052E-39)
            r3 = r3 | r17
            r0 = r62
            goto L_0x00e3
        L_0x00ce:
            r17 = 3670016(0x380000, float:5.142788E-39)
            r17 = r9 & r17
            r0 = r62
            if (r17 != 0) goto L_0x00e3
            boolean r17 = r2.changed((boolean) r0)
            if (r17 == 0) goto L_0x00df
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e1
        L_0x00df:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00e1:
            r3 = r3 | r17
        L_0x00e3:
            r17 = 29360128(0x1c00000, float:7.052966E-38)
            r17 = r9 & r17
            if (r17 != 0) goto L_0x00ff
            r0 = r10 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x00f8
            r0 = r63
            boolean r17 = r2.changed((java.lang.Object) r0)
            if (r17 == 0) goto L_0x00fa
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fc
        L_0x00f8:
            r0 = r63
        L_0x00fa:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fc:
            r3 = r3 | r17
            goto L_0x0101
        L_0x00ff:
            r0 = r63
        L_0x0101:
            r17 = 23967451(0x16db6db, float:4.3661218E-38)
            r0 = r3 & r17
            r5 = 4793490(0x492492, float:6.71711E-39)
            if (r0 != r5) goto L_0x0120
            boolean r0 = r2.getSkipping()
            if (r0 != 0) goto L_0x0112
            goto L_0x0120
        L_0x0112:
            r2.skipToGroupEnd()
            r3 = r57
            r55 = r62
            r8 = r63
            r4 = r11
            r5 = r13
            r6 = r15
            goto L_0x027b
        L_0x0120:
            r2.startDefaults()
            r0 = r9 & 1
            r5 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r15 = 1
            if (r0 == 0) goto L_0x0147
            boolean r0 = r2.getDefaultsInvalid()
            if (r0 == 0) goto L_0x0132
            goto L_0x0147
        L_0x0132:
            r2.skipToGroupEnd()
            r0 = r10 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x013a
            r3 = r3 & r5
        L_0x013a:
            r0 = r57
            r8 = r61
            r55 = r62
            r5 = r3
            r4 = r11
            r6 = r13
        L_0x0143:
            r3 = r63
            goto L_0x01f7
        L_0x0147:
            if (r4 == 0) goto L_0x014e
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            goto L_0x0150
        L_0x014e:
            r0 = r57
        L_0x0150:
            if (r6 == 0) goto L_0x0183
            r4 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r2.startReplaceableGroup(r4)
            java.lang.String r4 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r4)
            java.lang.Object r4 = r2.rememberedValue()
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r6 = r6.getEmpty()
            if (r4 != r6) goto L_0x017d
            androidx.compose.material3.DatePickerFormatter r4 = new androidx.compose.material3.DatePickerFormatter
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 7
            r22 = 0
            r17 = r4
            r17.<init>(r18, r19, r20, r21, r22)
            r2.updateRememberedValue(r4)
        L_0x017d:
            r2.endReplaceableGroup()
            androidx.compose.material3.DatePickerFormatter r4 = (androidx.compose.material3.DatePickerFormatter) r4
            r7 = r4
        L_0x0183:
            if (r8 == 0) goto L_0x018a
            androidx.compose.material3.DatePickerKt$DatePicker$2 r4 = androidx.compose.material3.DatePickerKt$DatePicker$2.INSTANCE
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            goto L_0x018b
        L_0x018a:
            r4 = r11
        L_0x018b:
            if (r12 == 0) goto L_0x019c
            androidx.compose.material3.DatePickerKt$DatePicker$3 r6 = new androidx.compose.material3.DatePickerKt$DatePicker$3
            r6.<init>(r1, r3)
            r8 = 448469326(0x1abb194e, float:7.738227E-23)
            androidx.compose.runtime.internal.ComposableLambda r6 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r2, r8, r15, r6)
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            goto L_0x019d
        L_0x019c:
            r6 = r13
        L_0x019d:
            if (r14 == 0) goto L_0x01ae
            androidx.compose.material3.DatePickerKt$DatePicker$4 r8 = new androidx.compose.material3.DatePickerKt$DatePicker$4
            r8.<init>(r1, r7, r3)
            r11 = 1578326756(0x5e135ae4, float:2.65451244E18)
            androidx.compose.runtime.internal.ComposableLambda r8 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r2, r11, r15, r8)
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            goto L_0x01b0
        L_0x01ae:
            r8 = r61
        L_0x01b0:
            if (r16 == 0) goto L_0x01b5
            r55 = r15
            goto L_0x01b7
        L_0x01b5:
            r55 = r62
        L_0x01b7:
            r11 = r10 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x01f4
            androidx.compose.material3.DatePickerDefaults r11 = androidx.compose.material3.DatePickerDefaults.INSTANCE
            r12 = 0
            r16 = 0
            r14 = r16
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
            r38 = 0
            r40 = 0
            r42 = 0
            r44 = 0
            r46 = 0
            r48 = 0
            r51 = 0
            r52 = 805306368(0x30000000, float:4.656613E-10)
            r53 = 524287(0x7ffff, float:7.34683E-40)
            r50 = r2
            androidx.compose.material3.DatePickerColors r11 = r11.m1287colors1m2CgY(r12, r14, r16, r18, r20, r22, r24, r26, r28, r30, r32, r34, r36, r38, r40, r42, r44, r46, r48, r50, r51, r52, r53)
            r3 = r3 & r5
            r5 = r3
            r3 = r11
            goto L_0x01f7
        L_0x01f4:
            r5 = r3
            goto L_0x0143
        L_0x01f7:
            r2.endDefaults()
            boolean r11 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r11 == 0) goto L_0x020a
            r11 = -1
            java.lang.String r12 = "androidx.compose.material3.DatePicker (DatePicker.kt:149)"
            r13 = -1765097918(0xffffffff96cabe42, float:-3.275493E-25)
            androidx.compose.runtime.ComposerKt.traceEventStart(r13, r5, r11, r12)
        L_0x020a:
            if (r55 == 0) goto L_0x021c
            androidx.compose.material3.DatePickerKt$DatePicker$5 r11 = new androidx.compose.material3.DatePickerKt$DatePicker$5
            r11.<init>(r1, r5)
            r12 = -1702543532(0xffffffff9a853f54, float:-5.510982E-23)
            r13 = 1
            androidx.compose.runtime.internal.ComposableLambda r11 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r2, r12, r13, r11)
            kotlin.jvm.functions.Function2 r11 = (kotlin.jvm.functions.Function2) r11
            goto L_0x021e
        L_0x021c:
            r13 = 1
            r11 = 0
        L_0x021e:
            r14 = r11
            androidx.compose.material3.MaterialTheme r11 = androidx.compose.material3.MaterialTheme.INSTANCE
            r12 = 6
            androidx.compose.material3.Typography r11 = r11.getTypography(r2, r12)
            androidx.compose.material3.tokens.DatePickerModalTokens r12 = androidx.compose.material3.tokens.DatePickerModalTokens.INSTANCE
            androidx.compose.material3.tokens.TypographyKeyTokens r12 = r12.getHeaderHeadlineFont()
            androidx.compose.ui.text.TextStyle r16 = androidx.compose.material3.TypographyKt.fromToken(r11, r12)
            androidx.compose.material3.tokens.DatePickerModalTokens r11 = androidx.compose.material3.tokens.DatePickerModalTokens.INSTANCE
            float r17 = r11.m1970getHeaderContainerHeightD9Ej5fM()
            androidx.compose.material3.DatePickerKt$DatePicker$6 r11 = new androidx.compose.material3.DatePickerKt$DatePicker$6
            r57 = r11
            r58 = r56
            r59 = r7
            r60 = r4
            r61 = r3
            r62 = r5
            r57.<init>(r58, r59, r60, r61, r62)
            r12 = 173769747(0xa5b8413, float:1.0569307E-32)
            androidx.compose.runtime.internal.ComposableLambda r11 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r2, r12, r13, r11)
            r18 = r11
            kotlin.jvm.functions.Function2 r18 = (kotlin.jvm.functions.Function2) r18
            int r11 = r5 >> 3
            r11 = r11 & 14
            r12 = 14155776(0xd80000, float:1.9836467E-38)
            r11 = r11 | r12
            int r5 = r5 >> 9
            r12 = r5 & 112(0x70, float:1.57E-43)
            r11 = r11 | r12
            r12 = r5 & 896(0x380, float:1.256E-42)
            r11 = r11 | r12
            r5 = r5 & r54
            r20 = r11 | r5
            r11 = r0
            r12 = r6
            r13 = r8
            r15 = r3
            r19 = r2
            m1290DateEntryContainerau3_HiA(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            boolean r5 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r5 == 0) goto L_0x0277
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0277:
            r5 = r6
            r6 = r8
            r8 = r3
            r3 = r0
        L_0x027b:
            androidx.compose.runtime.ScopeUpdateScope r11 = r2.endRestartGroup()
            if (r11 != 0) goto L_0x0282
            goto L_0x0297
        L_0x0282:
            androidx.compose.material3.DatePickerKt$DatePicker$7 r12 = new androidx.compose.material3.DatePickerKt$DatePicker$7
            r0 = r12
            r1 = r56
            r2 = r3
            r3 = r7
            r7 = r55
            r9 = r65
            r10 = r66
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            kotlin.jvm.functions.Function2 r12 = (kotlin.jvm.functions.Function2) r12
            r11.updateScope(r12)
        L_0x0297:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerKt.DatePicker(androidx.compose.material3.DatePickerState, androidx.compose.ui.Modifier, androidx.compose.material3.DatePickerFormatter, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.material3.DatePickerColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: rememberDatePickerState-NVmSL94  reason: not valid java name */
    public static final DatePickerState m1293rememberDatePickerStateNVmSL94(Long l, Long l2, IntRange intRange, int i, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(1574672255);
        ComposerKt.sourceInformation(composer, "C(rememberDatePickerState)P(2,1,3,0:c#material3.DisplayMode)224@10177L295:DatePicker.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            l = null;
        }
        if ((i3 & 2) != 0) {
            l2 = l;
        }
        if ((i3 & 4) != 0) {
            intRange = DatePickerDefaults.INSTANCE.getYearRange();
        }
        if ((i3 & 8) != 0) {
            i = DisplayMode.Companion.m1320getPickerjFl4v0();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1574672255, i2, -1, "androidx.compose.material3.rememberDatePickerState (DatePicker.kt:219)");
        }
        DatePickerState datePickerState = (DatePickerState) RememberSaveableKt.rememberSaveable(new Object[0], DatePickerState.Companion.Saver(), (String) null, new DatePickerKt$rememberDatePickerState$1(l, l2, intRange, i), composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return datePickerState;
    }

    /* renamed from: DateEntryContainer-au3_HiA  reason: not valid java name */
    public static final void m1290DateEntryContainerau3_HiA(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, DatePickerColors datePickerColors, TextStyle textStyle, float f, Function2<? super Composer, ? super Integer, Unit> function24, Composer composer, int i) {
        int i2;
        Composer composer2;
        Modifier modifier2 = modifier;
        DatePickerColors datePickerColors2 = datePickerColors;
        TextStyle textStyle2 = textStyle;
        Function2<? super Composer, ? super Integer, Unit> function25 = function24;
        int i3 = i;
        Intrinsics.checkNotNullParameter(modifier2, "modifier");
        Intrinsics.checkNotNullParameter(datePickerColors2, "colors");
        Intrinsics.checkNotNullParameter(textStyle2, "headlineTextStyle");
        Intrinsics.checkNotNullParameter(function25, "content");
        Composer startRestartGroup = composer.startRestartGroup(1507356255);
        ComposerKt.sourceInformation(startRestartGroup, "C(DateEntryContainer)P(6,7,3,5!1,4,2:c#ui.unit.Dp)1021@43152L1610:DatePicker.kt#uh7d8r");
        if ((i3 & 14) == 0) {
            i2 = (startRestartGroup.changed((Object) modifier2) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        Function2<? super Composer, ? super Integer, Unit> function26 = function2;
        if ((i3 & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(function26) ? 32 : 16;
        }
        Function2<? super Composer, ? super Integer, Unit> function27 = function22;
        if ((i3 & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(function27) ? 256 : 128;
        }
        Function2<? super Composer, ? super Integer, Unit> function28 = function23;
        if ((i3 & 7168) == 0) {
            i2 |= startRestartGroup.changedInstance(function28) ? 2048 : 1024;
        }
        if ((i3 & 57344) == 0) {
            i2 |= startRestartGroup.changed((Object) datePickerColors2) ? 16384 : 8192;
        }
        if ((458752 & i3) == 0) {
            i2 |= startRestartGroup.changed((Object) textStyle2) ? 131072 : 65536;
        }
        float f2 = f;
        if ((3670016 & i3) == 0) {
            i2 |= startRestartGroup.changed(f2) ? 1048576 : 524288;
        }
        if ((29360128 & i3) == 0) {
            i2 |= startRestartGroup.changedInstance(function25) ? 8388608 : 4194304;
        }
        int i4 = i2;
        if ((23967451 & i4) != 4793490 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1507356255, i4, -1, "androidx.compose.material3.DateEntryContainer (DatePicker.kt:1011)");
            }
            int i5 = i4;
            Modifier semantics$default = SemanticsModifierKt.semantics$default(SizeKt.m567sizeInqDBjuR0$default(modifier, DatePickerModalTokens.INSTANCE.m1964getContainerWidthD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, (Object) null), false, DatePickerKt$DateEntryContainer$1.INSTANCE, 1, (Object) null);
            startRestartGroup.startReplaceableGroup(-483455358);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)77@3913L61,78@3979L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
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
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(semantics$default);
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
            Composer r4 = Updater.m2444constructorimpl(startRestartGroup);
            Updater.m2451setimpl(r4, columnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2451setimpl(r4, density, ComposeUiNode.Companion.getSetDensity());
            Updater.m2451setimpl(r4, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2451setimpl(r4, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693704, "C79@4027L9:Column.kt#2w3rfo");
            ColumnScope columnScope = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -916081480, "C1026@43319L1419,1059@44747L9:DatePicker.kt#uh7d8r");
            long r17 = datePickerColors.m1284getTitleContentColor0d7_KjU$material3_release();
            long r19 = datePickerColors.m1282getHeadlineContentColor0d7_KjU$material3_release();
            DatePickerKt$DateEntryContainer$2$1 datePickerKt$DateEntryContainer$2$1 = r0;
            DatePickerKt$DateEntryContainer$2$1 datePickerKt$DateEntryContainer$2$12 = new DatePickerKt$DateEntryContainer$2$1(function22, function23, function2, textStyle, i5);
            composer2 = startRestartGroup;
            m1291DatePickerHeaderpc5RIQQ(Modifier.Companion, function2, r17, r19, f, ComposableLambdaKt.composableLambda(startRestartGroup, -229007058, true, datePickerKt$DateEntryContainer$2$1), composer2, 196614 | (i5 & 112) | ((i5 >> 6) & 57344));
            function25.invoke(composer2, Integer.valueOf((i5 >> 21) & 14));
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
            endRestartGroup.updateScope(new DatePickerKt$DateEntryContainer$3(modifier, function2, function22, function23, datePickerColors, textStyle, f, function24, i));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: DisplayModeToggleButton-tER2X8s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1292DisplayModeToggleButtontER2X8s(androidx.compose.ui.Modifier r10, int r11, kotlin.jvm.functions.Function1<? super androidx.compose.material3.DisplayMode, kotlin.Unit> r12, androidx.compose.runtime.Composer r13, int r14) {
        /*
            java.lang.String r0 = "modifier"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "onDisplayModeChange"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = 1393846115(0x53146763, float:6.373897E11)
            androidx.compose.runtime.Composer r13 = r13.startRestartGroup(r0)
            java.lang.String r1 = "C(DisplayModeToggleButton)P(1,0:c#material3.DisplayMode):DatePicker.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r13, r1)
            r1 = r14 & 14
            if (r1 != 0) goto L_0x0027
            boolean r1 = r13.changed((java.lang.Object) r10)
            if (r1 == 0) goto L_0x0024
            r1 = 4
            goto L_0x0025
        L_0x0024:
            r1 = 2
        L_0x0025:
            r1 = r1 | r14
            goto L_0x0028
        L_0x0027:
            r1 = r14
        L_0x0028:
            r2 = r14 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0038
            boolean r2 = r13.changed((int) r11)
            if (r2 == 0) goto L_0x0035
            r2 = 32
            goto L_0x0037
        L_0x0035:
            r2 = 16
        L_0x0037:
            r1 = r1 | r2
        L_0x0038:
            r2 = r14 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x0048
            boolean r2 = r13.changedInstance(r12)
            if (r2 == 0) goto L_0x0045
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0047
        L_0x0045:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0047:
            r1 = r1 | r2
        L_0x0048:
            r2 = r1 & 731(0x2db, float:1.024E-42)
            r3 = 146(0x92, float:2.05E-43)
            if (r2 != r3) goto L_0x005a
            boolean r2 = r13.getSkipping()
            if (r2 != 0) goto L_0x0055
            goto L_0x005a
        L_0x0055:
            r13.skipToGroupEnd()
            goto L_0x0120
        L_0x005a:
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x0067
            r2 = -1
            java.lang.String r3 = "androidx.compose.material3.DisplayModeToggleButton (DatePicker.kt:1065)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r1, r2, r3)
        L_0x0067:
            androidx.compose.material3.DisplayMode$Companion r0 = androidx.compose.material3.DisplayMode.Companion
            int r0 = r0.m1320getPickerjFl4v0()
            boolean r0 = androidx.compose.material3.DisplayMode.m1315equalsimpl0(r11, r0)
            r2 = 196608(0x30000, float:2.75506E-40)
            java.lang.String r3 = "CC(remember)P(1):Composables.kt#9igjgp"
            r4 = 1157296644(0x44faf204, float:2007.563)
            if (r0 == 0) goto L_0x00c9
            r0 = -1814971324(0xffffffff93d1bc44, float:-5.294466E-27)
            r13.startReplaceableGroup(r0)
            java.lang.String r0 = "1071@45035L42,1071@45014L262"
            androidx.compose.runtime.ComposerKt.sourceInformation(r13, r0)
            r13.startReplaceableGroup(r4)
            androidx.compose.runtime.ComposerKt.sourceInformation(r13, r3)
            boolean r0 = r13.changed((java.lang.Object) r12)
            java.lang.Object r3 = r13.rememberedValue()
            if (r0 != 0) goto L_0x009d
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r0 = r0.getEmpty()
            if (r3 != r0) goto L_0x00a8
        L_0x009d:
            androidx.compose.material3.DatePickerKt$DisplayModeToggleButton$1$1 r0 = new androidx.compose.material3.DatePickerKt$DisplayModeToggleButton$1$1
            r0.<init>(r12)
            r3 = r0
            kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
            r13.updateRememberedValue(r3)
        L_0x00a8:
            r13.endReplaceableGroup()
            r0 = r3
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            r3 = 0
            r4 = 0
            r5 = 0
            androidx.compose.material3.ComposableSingletons$DatePickerKt r6 = androidx.compose.material3.ComposableSingletons$DatePickerKt.INSTANCE
            kotlin.jvm.functions.Function2 r6 = r6.m1262getLambda1$material3_release()
            int r1 = r1 << 3
            r1 = r1 & 112(0x70, float:1.57E-43)
            r8 = r1 | r2
            r9 = 28
            r1 = r0
            r2 = r10
            r7 = r13
            androidx.compose.material3.IconButtonKt.IconButton(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r13.endReplaceableGroup()
            goto L_0x0117
        L_0x00c9:
            r0 = -1814971040(0xffffffff93d1bd60, float:-5.2945756E-27)
            r13.startReplaceableGroup(r0)
            java.lang.String r0 = "1078@45319L43,1078@45298L271"
            androidx.compose.runtime.ComposerKt.sourceInformation(r13, r0)
            r13.startReplaceableGroup(r4)
            androidx.compose.runtime.ComposerKt.sourceInformation(r13, r3)
            boolean r0 = r13.changed((java.lang.Object) r12)
            java.lang.Object r3 = r13.rememberedValue()
            if (r0 != 0) goto L_0x00ec
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r0 = r0.getEmpty()
            if (r3 != r0) goto L_0x00f7
        L_0x00ec:
            androidx.compose.material3.DatePickerKt$DisplayModeToggleButton$2$1 r0 = new androidx.compose.material3.DatePickerKt$DisplayModeToggleButton$2$1
            r0.<init>(r12)
            r3 = r0
            kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
            r13.updateRememberedValue(r3)
        L_0x00f7:
            r13.endReplaceableGroup()
            r0 = r3
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            r3 = 0
            r4 = 0
            r5 = 0
            androidx.compose.material3.ComposableSingletons$DatePickerKt r6 = androidx.compose.material3.ComposableSingletons$DatePickerKt.INSTANCE
            kotlin.jvm.functions.Function2 r6 = r6.m1263getLambda2$material3_release()
            int r1 = r1 << 3
            r1 = r1 & 112(0x70, float:1.57E-43)
            r8 = r1 | r2
            r9 = 28
            r1 = r0
            r2 = r10
            r7 = r13
            androidx.compose.material3.IconButtonKt.IconButton(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r13.endReplaceableGroup()
        L_0x0117:
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0120
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0120:
            androidx.compose.runtime.ScopeUpdateScope r13 = r13.endRestartGroup()
            if (r13 != 0) goto L_0x0127
            goto L_0x0131
        L_0x0127:
            androidx.compose.material3.DatePickerKt$DisplayModeToggleButton$3 r0 = new androidx.compose.material3.DatePickerKt$DisplayModeToggleButton$3
            r0.<init>(r10, r11, r12, r14)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r13.updateScope(r0)
        L_0x0131:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerKt.m1292DisplayModeToggleButtontER2X8s(androidx.compose.ui.Modifier, int, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }

    /* access modifiers changed from: private */
    public static final void SwitchableDateEntryContent(DatePickerState datePickerState, DatePickerFormatter datePickerFormatter, Function1<? super Long, Boolean> function1, DatePickerColors datePickerColors, Composer composer, int i) {
        int i2;
        int i3 = i;
        Composer startRestartGroup = composer.startRestartGroup(1613036224);
        ComposerKt.sourceInformation(startRestartGroup, "C(SwitchableDateEntryContent)P(3,1,2)1101@46104L638:DatePicker.kt#uh7d8r");
        if ((i3 & 14) == 0) {
            i2 = (startRestartGroup.changed((Object) datePickerState) ? 4 : 2) | i3;
        } else {
            DatePickerState datePickerState2 = datePickerState;
            i2 = i3;
        }
        if ((i3 & 112) == 0) {
            i2 |= startRestartGroup.changed((Object) datePickerFormatter) ? 32 : 16;
        } else {
            DatePickerFormatter datePickerFormatter2 = datePickerFormatter;
        }
        Function1<? super Long, Boolean> function12 = function1;
        if ((i3 & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        DatePickerColors datePickerColors2 = datePickerColors;
        if ((i3 & 7168) == 0) {
            i2 |= startRestartGroup.changed((Object) datePickerColors2) ? 2048 : 1024;
        }
        int i4 = i2;
        if ((i4 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1613036224, i4, -1, "androidx.compose.material3.SwitchableDateEntryContent (DatePicker.kt:1093)");
            }
            int r0 = datePickerState.m1296getDisplayModejFl4v0();
            SpringSpec spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, (Object) null, 7, (Object) null);
            Modifier semantics$default = SemanticsModifierKt.semantics$default(Modifier.Companion, false, DatePickerKt$SwitchableDateEntryContent$1.INSTANCE, 1, (Object) null);
            DisplayMode r02 = DisplayMode.m1312boximpl(r0);
            DatePickerKt$SwitchableDateEntryContent$2 datePickerKt$SwitchableDateEntryContent$2 = r6;
            DatePickerKt$SwitchableDateEntryContent$2 datePickerKt$SwitchableDateEntryContent$22 = new DatePickerKt$SwitchableDateEntryContent$2(datePickerState, datePickerFormatter, function1, datePickerColors, i4);
            CrossfadeKt.Crossfade(r02, semantics$default, (FiniteAnimationSpec<Float>) spring$default, (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, 1854706084, true, datePickerKt$SwitchableDateEntryContent$2), startRestartGroup, 24960, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DatePickerKt$SwitchableDateEntryContent$3(datePickerState, datePickerFormatter, function1, datePickerColors, i));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: kotlin.jvm.functions.Function1} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void DatePickerContent(androidx.compose.material3.StateData r28, androidx.compose.material3.DatePickerFormatter r29, kotlin.jvm.functions.Function1<? super java.lang.Long, java.lang.Boolean> r30, androidx.compose.material3.DatePickerColors r31, androidx.compose.runtime.Composer r32, int r33) {
        /*
            r8 = r28
            r9 = r29
            r10 = r31
            r11 = r33
            r0 = -1512850300(0xffffffffa5d3bc84, float:-3.6730408E-16)
            r1 = r32
            androidx.compose.runtime.Composer r15 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(DatePickerContent)P(3,1,2)1131@47000L83,1132@47109L24,1134@47160L140,1139@47331L42,1140@47398L15,1141@47418L4106:DatePicker.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r15, r1)
            r1 = r11 & 14
            r14 = 2
            if (r1 != 0) goto L_0x0026
            boolean r1 = r15.changed((java.lang.Object) r8)
            if (r1 == 0) goto L_0x0023
            r1 = 4
            goto L_0x0024
        L_0x0023:
            r1 = r14
        L_0x0024:
            r1 = r1 | r11
            goto L_0x0027
        L_0x0026:
            r1 = r11
        L_0x0027:
            r2 = r11 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0037
            boolean r2 = r15.changed((java.lang.Object) r9)
            if (r2 == 0) goto L_0x0034
            r2 = 32
            goto L_0x0036
        L_0x0034:
            r2 = 16
        L_0x0036:
            r1 = r1 | r2
        L_0x0037:
            r2 = r11 & 896(0x380, float:1.256E-42)
            r13 = r30
            if (r2 != 0) goto L_0x0049
            boolean r2 = r15.changedInstance(r13)
            if (r2 == 0) goto L_0x0046
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0048
        L_0x0046:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0048:
            r1 = r1 | r2
        L_0x0049:
            r2 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x0059
            boolean r2 = r15.changed((java.lang.Object) r10)
            if (r2 == 0) goto L_0x0056
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x0058
        L_0x0056:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0058:
            r1 = r1 | r2
        L_0x0059:
            r12 = r1
            r1 = r12 & 5851(0x16db, float:8.199E-42)
            r2 = 1170(0x492, float:1.64E-42)
            if (r1 != r2) goto L_0x006d
            boolean r1 = r15.getSkipping()
            if (r1 != 0) goto L_0x0067
            goto L_0x006d
        L_0x0067:
            r15.skipToGroupEnd()
            r1 = r15
            goto L_0x0513
        L_0x006d:
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x007a
            r1 = -1
            java.lang.String r2 = "androidx.compose.material3.DatePickerContent (DatePicker.kt:1124)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r12, r1, r2)
        L_0x007a:
            int r0 = r28.getDisplayedMonthIndex()
            r7 = 0
            androidx.compose.foundation.lazy.LazyListState r0 = androidx.compose.foundation.lazy.LazyListStateKt.rememberLazyListState(r0, r7, r15, r7, r14)
            r1 = 773894976(0x2e20b340, float:3.6538994E-11)
            r15.startReplaceableGroup(r1)
            java.lang.String r1 = "CC(rememberCoroutineScope)476@19869L144:Effects.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r15, r1)
            r1 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r15.startReplaceableGroup(r1)
            java.lang.String r1 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r15, r1)
            java.lang.Object r1 = r15.rememberedValue()
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r1 != r2) goto L_0x00b6
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlin.coroutines.CoroutineContext r1 = (kotlin.coroutines.CoroutineContext) r1
            kotlinx.coroutines.CoroutineScope r1 = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(r1, r15)
            androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller r2 = new androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller
            r2.<init>(r1)
            r15.updateRememberedValue(r2)
            r1 = r2
        L_0x00b6:
            r15.endReplaceableGroup()
            androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller r1 = (androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) r1
            kotlinx.coroutines.CoroutineScope r6 = r1.getCoroutineScope()
            r15.endReplaceableGroup()
            r5 = 1157296644(0x44faf204, float:2007.563)
            r15.startReplaceableGroup(r5)
            java.lang.String r4 = "CC(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r15, r4)
            boolean r1 = r15.changed((java.lang.Object) r8)
            java.lang.Object r2 = r15.rememberedValue()
            if (r1 != 0) goto L_0x00df
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r2 != r1) goto L_0x00ea
        L_0x00df:
            androidx.compose.material3.DatePickerKt$DatePickerContent$onDateSelected$1$1 r1 = new androidx.compose.material3.DatePickerKt$DatePickerContent$onDateSelected$1$1
            r1.<init>(r8)
            r2 = r1
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r15.updateRememberedValue(r2)
        L_0x00ea:
            r15.endReplaceableGroup()
            r22 = r2
            kotlin.jvm.functions.Function1 r22 = (kotlin.jvm.functions.Function1) r22
            java.lang.Object[] r1 = new java.lang.Object[r7]
            r2 = 0
            r3 = 0
            androidx.compose.material3.DatePickerKt$DatePickerContent$yearPickerVisible$2 r16 = androidx.compose.material3.DatePickerKt$DatePickerContent$yearPickerVisible$2.INSTANCE
            kotlin.jvm.functions.Function0 r16 = (kotlin.jvm.functions.Function0) r16
            r17 = 3080(0xc08, float:4.316E-42)
            r18 = 6
            r23 = r4
            r4 = r16
            r5 = r15
            r25 = r6
            r6 = r17
            r14 = r7
            r7 = r18
            java.lang.Object r1 = androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable((java.lang.Object[]) r1, r2, (java.lang.String) r3, r4, (androidx.compose.runtime.Composer) r5, (int) r6, (int) r7)
            r7 = r1
            androidx.compose.runtime.MutableState r7 = (androidx.compose.runtime.MutableState) r7
            java.util.Locale r1 = androidx.compose.material3.CalendarModel_androidKt.defaultLocale(r15, r14)
            r2 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r15.startReplaceableGroup(r2)
            java.lang.String r3 = "CC(Column)P(2,3,1)77@3913L61,78@3979L133:Column.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformation(r15, r3)
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r4 = (androidx.compose.ui.Modifier) r4
            androidx.compose.foundation.layout.Arrangement r5 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            androidx.compose.foundation.layout.Arrangement$Vertical r5 = r5.getTop()
            androidx.compose.ui.Alignment$Companion r6 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment$Horizontal r6 = r6.getStart()
            androidx.compose.ui.layout.MeasurePolicy r5 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(r5, r6, r15, r14)
            r6 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r15.startReplaceableGroup(r6)
            java.lang.String r2 = "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh"
            androidx.compose.runtime.ComposerKt.sourceInformation(r15, r2)
            androidx.compose.runtime.ProvidableCompositionLocal r16 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            r6 = r16
            androidx.compose.runtime.CompositionLocal r6 = (androidx.compose.runtime.CompositionLocal) r6
            r14 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r8 = "C:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r15, r14, r8)
            java.lang.Object r6 = r15.consume(r6)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r15)
            androidx.compose.ui.unit.Density r6 = (androidx.compose.ui.unit.Density) r6
            androidx.compose.runtime.ProvidableCompositionLocal r17 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            r11 = r17
            androidx.compose.runtime.CompositionLocal r11 = (androidx.compose.runtime.CompositionLocal) r11
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r15, r14, r8)
            java.lang.Object r11 = r15.consume(r11)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r15)
            androidx.compose.ui.unit.LayoutDirection r11 = (androidx.compose.ui.unit.LayoutDirection) r11
            androidx.compose.runtime.ProvidableCompositionLocal r17 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            r18 = r12
            r12 = r17
            androidx.compose.runtime.CompositionLocal r12 = (androidx.compose.runtime.CompositionLocal) r12
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r15, r14, r8)
            java.lang.Object r12 = r15.consume(r12)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r15)
            androidx.compose.ui.platform.ViewConfiguration r12 = (androidx.compose.ui.platform.ViewConfiguration) r12
            androidx.compose.ui.node.ComposeUiNode$Companion r17 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function0 r14 = r17.getConstructor()
            kotlin.jvm.functions.Function3 r4 = androidx.compose.ui.layout.LayoutKt.materializerOf(r4)
            androidx.compose.runtime.Applier r13 = r15.getApplier()
            boolean r13 = r13 instanceof androidx.compose.runtime.Applier
            if (r13 != 0) goto L_0x0196
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x0196:
            r15.startReusableNode()
            boolean r13 = r15.getInserting()
            if (r13 == 0) goto L_0x01a3
            r15.createNode(r14)
            goto L_0x01a6
        L_0x01a3:
            r15.useNode()
        L_0x01a6:
            r15.disableReusing()
            androidx.compose.runtime.Composer r13 = androidx.compose.runtime.Updater.m2444constructorimpl(r15)
            androidx.compose.ui.node.ComposeUiNode$Companion r14 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r14 = r14.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r13, r5, r14)
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r5 = r5.getSetDensity()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r13, r6, r5)
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r5 = r5.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r13, r11, r5)
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r5 = r5.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r13, r12, r5)
            r15.enableReusing()
            androidx.compose.runtime.Composer r5 = androidx.compose.runtime.SkippableUpdater.m2436constructorimpl(r15)
            androidx.compose.runtime.SkippableUpdater r5 = androidx.compose.runtime.SkippableUpdater.m2435boximpl(r5)
            r6 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            r4.invoke(r5, r15, r11)
            r4 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r15.startReplaceableGroup(r4)
            r5 = 276693704(0x107e02c8, float:5.009481E-29)
            java.lang.String r11 = "C79@4027L9:Column.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r15, r5, r11)
            androidx.compose.foundation.layout.ColumnScopeInstance r12 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE
            androidx.compose.foundation.layout.ColumnScope r12 = (androidx.compose.foundation.layout.ColumnScope) r12
            r12 = -269675982(0xffffffffefed1232, float:-1.4673989E29)
            java.lang.String r13 = "C1166@48484L42,1142@47435L1101,1169@48546L2972:DatePicker.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r15, r12, r13)
            androidx.compose.ui.Modifier$Companion r12 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r12 = (androidx.compose.ui.Modifier) r12
            float r14 = DatePickerHorizontalPadding
            r13 = 0
            r5 = 0
            r6 = 2
            androidx.compose.ui.Modifier r12 = androidx.compose.foundation.layout.PaddingKt.m495paddingVpY3zN4$default(r12, r14, r13, r6, r5)
            boolean r17 = r0.getCanScrollForward()
            boolean r20 = r0.getCanScrollBackward()
            boolean r21 = DatePickerContent$lambda$5(r7)
            androidx.compose.material3.CalendarMonth r6 = r28.getDisplayedMonth()
            androidx.compose.material3.CalendarModel r13 = r28.getCalendarModel()
            java.lang.String r1 = r9.formatMonthYear$material3_release(r6, r13, r1)
            if (r1 != 0) goto L_0x0227
            java.lang.String r1 = "-"
        L_0x0227:
            androidx.compose.material3.DatePickerKt$DatePickerContent$1$1 r6 = new androidx.compose.material3.DatePickerKt$DatePickerContent$1$1
            r13 = r25
            r6.<init>(r13, r0)
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            androidx.compose.material3.DatePickerKt$DatePickerContent$1$2 r5 = new androidx.compose.material3.DatePickerKt$DatePickerContent$1$2
            r5.<init>(r13, r0)
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            r4 = 1157296644(0x44faf204, float:2007.563)
            r15.startReplaceableGroup(r4)
            r4 = r23
            androidx.compose.runtime.ComposerKt.sourceInformation(r15, r4)
            boolean r4 = r15.changed((java.lang.Object) r7)
            r23 = r0
            java.lang.Object r0 = r15.rememberedValue()
            if (r4 != 0) goto L_0x0256
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r4 = r4.getEmpty()
            if (r0 != r4) goto L_0x0260
        L_0x0256:
            androidx.compose.material3.DatePickerKt$DatePickerContent$1$3$1 r0 = new androidx.compose.material3.DatePickerKt$DatePickerContent$1$3$1
            r0.<init>(r7)
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            r15.updateRememberedValue(r0)
        L_0x0260:
            r15.endReplaceableGroup()
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            r4 = 6
            r24 = r18
            r26 = r13
            r13 = r17
            r27 = r14
            r14 = r20
            r32 = r15
            r15 = r21
            r16 = r1
            r17 = r6
            r18 = r5
            r19 = r0
            r20 = r32
            r21 = r4
            MonthsNavigation(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r0 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r15 = r32
            r15.startReplaceableGroup(r0)
            java.lang.String r0 = "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformation(r15, r0)
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            androidx.compose.ui.Alignment$Companion r1 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment r1 = r1.getTopStart()
            r4 = 0
            androidx.compose.ui.layout.MeasurePolicy r1 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(r1, r4, r15, r4)
            r5 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r15.startReplaceableGroup(r5)
            androidx.compose.runtime.ComposerKt.sourceInformation(r15, r2)
            androidx.compose.runtime.ProvidableCompositionLocal r5 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r5 = (androidx.compose.runtime.CompositionLocal) r5
            r6 = 2023513938(0x789c5f52, float:2.5372864E34)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r15, r6, r8)
            java.lang.Object r5 = r15.consume(r5)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r15)
            androidx.compose.ui.unit.Density r5 = (androidx.compose.ui.unit.Density) r5
            androidx.compose.runtime.ProvidableCompositionLocal r12 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            androidx.compose.runtime.CompositionLocal r12 = (androidx.compose.runtime.CompositionLocal) r12
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r15, r6, r8)
            java.lang.Object r12 = r15.consume(r12)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r15)
            androidx.compose.ui.unit.LayoutDirection r12 = (androidx.compose.ui.unit.LayoutDirection) r12
            androidx.compose.runtime.ProvidableCompositionLocal r13 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            androidx.compose.runtime.CompositionLocal r13 = (androidx.compose.runtime.CompositionLocal) r13
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r15, r6, r8)
            java.lang.Object r13 = r15.consume(r13)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r15)
            androidx.compose.ui.platform.ViewConfiguration r13 = (androidx.compose.ui.platform.ViewConfiguration) r13
            androidx.compose.ui.node.ComposeUiNode$Companion r14 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function0 r14 = r14.getConstructor()
            kotlin.jvm.functions.Function3 r0 = androidx.compose.ui.layout.LayoutKt.materializerOf(r0)
            androidx.compose.runtime.Applier r6 = r15.getApplier()
            boolean r6 = r6 instanceof androidx.compose.runtime.Applier
            if (r6 != 0) goto L_0x02f6
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x02f6:
            r15.startReusableNode()
            boolean r6 = r15.getInserting()
            if (r6 == 0) goto L_0x0303
            r15.createNode(r14)
            goto L_0x0306
        L_0x0303:
            r15.useNode()
        L_0x0306:
            r15.disableReusing()
            androidx.compose.runtime.Composer r6 = androidx.compose.runtime.Updater.m2444constructorimpl(r15)
            androidx.compose.ui.node.ComposeUiNode$Companion r14 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r14 = r14.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r6, r1, r14)
            androidx.compose.ui.node.ComposeUiNode$Companion r1 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r1 = r1.getSetDensity()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r6, r5, r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r1 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r1 = r1.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r6, r12, r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r1 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r1 = r1.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r6, r13, r1)
            r15.enableReusing()
            androidx.compose.runtime.Composer r1 = androidx.compose.runtime.SkippableUpdater.m2436constructorimpl(r15)
            androidx.compose.runtime.SkippableUpdater r1 = androidx.compose.runtime.SkippableUpdater.m2435boximpl(r1)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r0.invoke(r1, r15, r5)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r15.startReplaceableGroup(r0)
            r0 = -1253629305(0xffffffffb5472287, float:-7.418352E-7)
            java.lang.String r1 = "C72@3384L9:Box.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r15, r0, r1)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE
            androidx.compose.foundation.layout.BoxScope r0 = (androidx.compose.foundation.layout.BoxScope) r0
            r0 = 1767568956(0x695af63c, float:1.654429E25)
            java.lang.String r1 = "C1170@48564L494,1181@49098L2410:DatePicker.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r15, r0, r1)
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            r1 = r27
            r5 = 2
            r6 = 0
            r12 = 0
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.PaddingKt.m495paddingVpY3zN4$default(r0, r1, r12, r5, r6)
            r1 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r15.startReplaceableGroup(r1)
            androidx.compose.runtime.ComposerKt.sourceInformation(r15, r3)
            androidx.compose.foundation.layout.Arrangement r1 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            androidx.compose.foundation.layout.Arrangement$Vertical r1 = r1.getTop()
            androidx.compose.ui.Alignment$Companion r3 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment$Horizontal r3 = r3.getStart()
            androidx.compose.ui.layout.MeasurePolicy r1 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(r1, r3, r15, r4)
            r3 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r15.startReplaceableGroup(r3)
            androidx.compose.runtime.ComposerKt.sourceInformation(r15, r2)
            androidx.compose.runtime.ProvidableCompositionLocal r2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r2 = (androidx.compose.runtime.CompositionLocal) r2
            r3 = 2023513938(0x789c5f52, float:2.5372864E34)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r15, r3, r8)
            java.lang.Object r2 = r15.consume(r2)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r15)
            androidx.compose.ui.unit.Density r2 = (androidx.compose.ui.unit.Density) r2
            androidx.compose.runtime.ProvidableCompositionLocal r5 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            androidx.compose.runtime.CompositionLocal r5 = (androidx.compose.runtime.CompositionLocal) r5
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r15, r3, r8)
            java.lang.Object r5 = r15.consume(r5)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r15)
            androidx.compose.ui.unit.LayoutDirection r5 = (androidx.compose.ui.unit.LayoutDirection) r5
            androidx.compose.runtime.ProvidableCompositionLocal r13 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            androidx.compose.runtime.CompositionLocal r13 = (androidx.compose.runtime.CompositionLocal) r13
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r15, r3, r8)
            java.lang.Object r3 = r15.consume(r13)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r15)
            androidx.compose.ui.platform.ViewConfiguration r3 = (androidx.compose.ui.platform.ViewConfiguration) r3
            androidx.compose.ui.node.ComposeUiNode$Companion r8 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function0 r8 = r8.getConstructor()
            kotlin.jvm.functions.Function3 r0 = androidx.compose.ui.layout.LayoutKt.materializerOf(r0)
            androidx.compose.runtime.Applier r13 = r15.getApplier()
            boolean r13 = r13 instanceof androidx.compose.runtime.Applier
            if (r13 != 0) goto L_0x03da
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x03da:
            r15.startReusableNode()
            boolean r13 = r15.getInserting()
            if (r13 == 0) goto L_0x03e7
            r15.createNode(r8)
            goto L_0x03ea
        L_0x03e7:
            r15.useNode()
        L_0x03ea:
            r15.disableReusing()
            androidx.compose.runtime.Composer r8 = androidx.compose.runtime.Updater.m2444constructorimpl(r15)
            androidx.compose.ui.node.ComposeUiNode$Companion r13 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r13 = r13.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r8, r1, r13)
            androidx.compose.ui.node.ComposeUiNode$Companion r1 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r1 = r1.getSetDensity()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r8, r2, r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r1 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r1 = r1.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r8, r5, r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r1 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r1 = r1.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r8, r3, r1)
            r15.enableReusing()
            androidx.compose.runtime.Composer r1 = androidx.compose.runtime.SkippableUpdater.m2436constructorimpl(r15)
            androidx.compose.runtime.SkippableUpdater r1 = androidx.compose.runtime.SkippableUpdater.m2435boximpl(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r0.invoke(r1, r15, r2)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r15.startReplaceableGroup(r0)
            r0 = 276693704(0x107e02c8, float:5.009481E-29)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r15, r0, r11)
            androidx.compose.foundation.layout.ColumnScopeInstance r0 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE
            androidx.compose.foundation.layout.ColumnScope r0 = (androidx.compose.foundation.layout.ColumnScope) r0
            r0 = 1247374525(0x4a596cbd, float:3562287.2)
            java.lang.String r1 = "C1171@48660L41,1172@48718L326:DatePicker.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r15, r0, r1)
            androidx.compose.material3.CalendarModel r0 = r28.getCalendarModel()
            int r1 = r24 >> 9
            r1 = r1 & 14
            WeekDays(r10, r0, r15, r1)
            int r0 = r24 << 3
            r0 = r0 & 112(0x70, float:1.57E-43)
            int r1 = r24 << 6
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r1
            r0 = r0 | r2
            r2 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r2
            r8 = r0 | r1
            r11 = r23
            r0 = r22
            r1 = r28
            r2 = r11
            r3 = r29
            r4 = r30
            r13 = r6
            r5 = r31
            r6 = r15
            r14 = r7
            r7 = r8
            HorizontalMonthsList(r0, r1, r2, r3, r4, r5, r6, r7)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r15)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r15)
            r15.endReplaceableGroup()
            r15.endNode()
            r15.endReplaceableGroup()
            r15.endReplaceableGroup()
            boolean r7 = DatePickerContent$lambda$5(r14)
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            androidx.compose.ui.Modifier r8 = androidx.compose.ui.draw.ClipKt.clipToBounds(r0)
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 15
            r5 = 0
            androidx.compose.animation.EnterTransition r0 = androidx.compose.animation.EnterExitTransitionKt.expandVertically$default(r0, r1, r2, r3, r4, r5)
            r1 = 1058642330(0x3f19999a, float:0.6)
            r6 = 1
            androidx.compose.animation.EnterTransition r1 = androidx.compose.animation.EnterExitTransitionKt.fadeIn$default(r13, r1, r6, r13)
            androidx.compose.animation.EnterTransition r16 = r0.plus(r1)
            r0 = 0
            r1 = 0
            androidx.compose.animation.ExitTransition r0 = androidx.compose.animation.EnterExitTransitionKt.shrinkVertically$default(r0, r1, r2, r3, r4, r5)
            r1 = 3
            androidx.compose.animation.ExitTransition r1 = androidx.compose.animation.EnterExitTransitionKt.fadeOut$default(r13, r12, r1, r13)
            androidx.compose.animation.ExitTransition r17 = r0.plus(r1)
            r18 = 0
            androidx.compose.material3.DatePickerKt$DatePickerContent$1$4$2 r12 = new androidx.compose.material3.DatePickerKt$DatePickerContent$1$4$2
            r0 = r12
            r1 = r31
            r2 = r28
            r3 = r24
            r4 = r26
            r5 = r14
            r13 = r6
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = 760161496(0x2d4f24d8, float:1.1774769E-11)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r15, r0, r13, r12)
            kotlin.jvm.functions.Function3 r0 = (kotlin.jvm.functions.Function3) r0
            r19 = 200112(0x30db0, float:2.80417E-40)
            r20 = 16
            r12 = r7
            r13 = r8
            r14 = r16
            r1 = r15
            r15 = r17
            r16 = r18
            r17 = r0
            r18 = r1
            androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility((boolean) r12, (androidx.compose.ui.Modifier) r13, (androidx.compose.animation.EnterTransition) r14, (androidx.compose.animation.ExitTransition) r15, (java.lang.String) r16, (kotlin.jvm.functions.Function3<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) r17, (androidx.compose.runtime.Composer) r18, (int) r19, (int) r20)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r1)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r1)
            r1.endReplaceableGroup()
            r1.endNode()
            r1.endReplaceableGroup()
            r1.endReplaceableGroup()
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r1)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r1)
            r1.endReplaceableGroup()
            r1.endNode()
            r1.endReplaceableGroup()
            r1.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0513
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0513:
            androidx.compose.runtime.ScopeUpdateScope r6 = r1.endRestartGroup()
            if (r6 != 0) goto L_0x051a
            goto L_0x052f
        L_0x051a:
            androidx.compose.material3.DatePickerKt$DatePickerContent$2 r7 = new androidx.compose.material3.DatePickerKt$DatePickerContent$2
            r0 = r7
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r31
            r5 = r33
            r0.<init>(r1, r2, r3, r4, r5)
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            r6.updateScope(r7)
        L_0x052f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerKt.DatePickerContent(androidx.compose.material3.StateData, androidx.compose.material3.DatePickerFormatter, kotlin.jvm.functions.Function1, androidx.compose.material3.DatePickerColors, androidx.compose.runtime.Composer, int):void");
    }

    /* access modifiers changed from: private */
    public static final boolean DatePickerContent$lambda$5(MutableState<Boolean> mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* access modifiers changed from: private */
    public static final void DatePickerContent$lambda$6(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* renamed from: DatePickerHeader-pc5RIQQ  reason: not valid java name */
    public static final void m1291DatePickerHeaderpc5RIQQ(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, long j, long j2, float f, Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Modifier modifier3 = modifier;
        Function2<? super Composer, ? super Integer, Unit> function23 = function2;
        float f2 = f;
        Function2<? super Composer, ? super Integer, Unit> function24 = function22;
        int i3 = i;
        Intrinsics.checkNotNullParameter(modifier3, "modifier");
        Intrinsics.checkNotNullParameter(function24, "content");
        Composer startRestartGroup = composer.startRestartGroup(-996037719);
        ComposerKt.sourceInformation(startRestartGroup, "C(DatePickerHeader)P(3,4,5:c#ui.graphics.Color,1:c#ui.graphics.Color,2:c#ui.unit.Dp)1243@51983L784:DatePicker.kt#uh7d8r");
        if ((i3 & 14) == 0) {
            i2 = (startRestartGroup.changed((Object) modifier3) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i3 & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(function23) ? 32 : 16;
        }
        if ((i3 & 896) == 0) {
            i2 |= startRestartGroup.changed(j) ? 256 : 128;
        } else {
            long j3 = j;
        }
        if ((i3 & 7168) == 0) {
            i2 |= startRestartGroup.changed(j2) ? 2048 : 1024;
        } else {
            long j4 = j2;
        }
        if ((57344 & i3) == 0) {
            i2 |= startRestartGroup.changed(f2) ? 16384 : 8192;
        }
        if ((458752 & i3) == 0) {
            i2 |= startRestartGroup.changedInstance(function24) ? 131072 : 65536;
        }
        if ((374491 & i2) != 74898 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-996037719, i2, -1, "androidx.compose.material3.DatePickerHeader (DatePicker.kt:1228)");
            }
            if (function23 != null) {
                modifier2 = SizeKt.m548defaultMinSizeVpY3zN4$default(Modifier.Companion, 0.0f, f2, 1, (Object) null);
            } else {
                modifier2 = Modifier.Companion;
            }
            Modifier then = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, (Object) null).then(modifier2);
            startRestartGroup.startReplaceableGroup(-483455358);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)77@3913L61,78@3979L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.Companion.getStart(), startRestartGroup, 6);
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
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(then);
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
            Composer r6 = Updater.m2444constructorimpl(startRestartGroup);
            Updater.m2451setimpl(r6, columnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2451setimpl(r6, density, ComposeUiNode.Companion.getSetDensity());
            Updater.m2451setimpl(r6, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2451setimpl(r6, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693704, "C79@4027L9:Column.kt#2w3rfo");
            ColumnScope columnScope = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1127524835, "C1262@52647L114:DatePicker.kt#uh7d8r");
            startRestartGroup.startReplaceableGroup(1127524835);
            ComposerKt.sourceInformation(startRestartGroup, "1250@52175L453");
            if (function23 != null) {
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2811boximpl(j))}, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(startRestartGroup, 1005061498, true, new DatePickerKt$DatePickerHeader$1$1(function23, i2)), startRestartGroup, 56);
            }
            startRestartGroup.endReplaceableGroup();
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2811boximpl(j2))}, function24, startRestartGroup, ((i2 >> 12) & 112) | 8);
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
            endRestartGroup.updateScope(new DatePickerKt$DatePickerHeader$2(modifier, function2, j, j2, f, function22, i));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: androidx.compose.material3.CalendarMonth} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void HorizontalMonthsList(kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> r27, androidx.compose.material3.StateData r28, androidx.compose.foundation.lazy.LazyListState r29, androidx.compose.material3.DatePickerFormatter r30, kotlin.jvm.functions.Function1<? super java.lang.Long, java.lang.Boolean> r31, androidx.compose.material3.DatePickerColors r32, androidx.compose.runtime.Composer r33, int r34) {
        /*
            r9 = r28
            r15 = r29
            r14 = r34
            r0 = 1933363608(0x733cc998, float:1.4957285E31)
            r1 = r33
            androidx.compose.runtime.Composer r13 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(HorizontalMonthsList)P(4,5,3,1,2)1282@53204L168,1298@53968L40,1299@54015L738,1288@53377L1376,1323@54789L62,1323@54759L92:DatePicker.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r13, r1)
            r1 = r14 & 14
            r12 = r27
            if (r1 != 0) goto L_0x0025
            boolean r1 = r13.changedInstance(r12)
            if (r1 == 0) goto L_0x0022
            r1 = 4
            goto L_0x0023
        L_0x0022:
            r1 = 2
        L_0x0023:
            r1 = r1 | r14
            goto L_0x0026
        L_0x0025:
            r1 = r14
        L_0x0026:
            r2 = r14 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0036
            boolean r2 = r13.changed((java.lang.Object) r9)
            if (r2 == 0) goto L_0x0033
            r2 = 32
            goto L_0x0035
        L_0x0033:
            r2 = 16
        L_0x0035:
            r1 = r1 | r2
        L_0x0036:
            r2 = r14 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x0046
            boolean r2 = r13.changed((java.lang.Object) r15)
            if (r2 == 0) goto L_0x0043
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0045
        L_0x0043:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0045:
            r1 = r1 | r2
        L_0x0046:
            r2 = r14 & 7168(0x1c00, float:1.0045E-41)
            r11 = r30
            if (r2 != 0) goto L_0x0058
            boolean r2 = r13.changed((java.lang.Object) r11)
            if (r2 == 0) goto L_0x0055
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x0057
        L_0x0055:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0057:
            r1 = r1 | r2
        L_0x0058:
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r14
            r10 = r31
            if (r2 != 0) goto L_0x006c
            boolean r2 = r13.changedInstance(r10)
            if (r2 == 0) goto L_0x0069
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L_0x006b
        L_0x0069:
            r2 = 8192(0x2000, float:1.14794E-41)
        L_0x006b:
            r1 = r1 | r2
        L_0x006c:
            r2 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r14
            r8 = r32
            if (r2 != 0) goto L_0x007f
            boolean r2 = r13.changed((java.lang.Object) r8)
            if (r2 == 0) goto L_0x007c
            r2 = 131072(0x20000, float:1.83671E-40)
            goto L_0x007e
        L_0x007c:
            r2 = 65536(0x10000, float:9.18355E-41)
        L_0x007e:
            r1 = r1 | r2
        L_0x007f:
            r7 = r1
            r1 = 374491(0x5b6db, float:5.24774E-40)
            r1 = r1 & r7
            r2 = 74898(0x12492, float:1.04954E-40)
            if (r1 != r2) goto L_0x0097
            boolean r1 = r13.getSkipping()
            if (r1 != 0) goto L_0x0090
            goto L_0x0097
        L_0x0090:
            r13.skipToGroupEnd()
            r3 = r13
            r4 = r15
            goto L_0x01e5
        L_0x0097:
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x00a4
            r1 = -1
            java.lang.String r2 = "androidx.compose.material3.HorizontalMonthsList (DatePicker.kt:1273)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r7, r1, r2)
        L_0x00a4:
            androidx.compose.material3.CalendarModel r0 = r28.getCalendarModel()
            androidx.compose.material3.CalendarDate r16 = r0.getToday()
            kotlin.ranges.IntRange r0 = r28.getYearRange()
            r1 = 1157296644(0x44faf204, float:2007.563)
            r13.startReplaceableGroup(r1)
            java.lang.String r6 = "CC(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r13, r6)
            boolean r0 = r13.changed((java.lang.Object) r0)
            java.lang.Object r1 = r13.rememberedValue()
            r2 = 1
            if (r0 != 0) goto L_0x00ce
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r0 = r0.getEmpty()
            if (r1 != r0) goto L_0x00e1
        L_0x00ce:
            androidx.compose.material3.CalendarModel r0 = r28.getCalendarModel()
            kotlin.ranges.IntRange r1 = r28.getYearRange()
            int r1 = r1.getFirst()
            androidx.compose.material3.CalendarMonth r1 = r0.getMonth(r1, r2)
            r13.updateRememberedValue(r1)
        L_0x00e1:
            r13.endReplaceableGroup()
            r17 = r1
            androidx.compose.material3.CalendarMonth r17 = (androidx.compose.material3.CalendarMonth) r17
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            androidx.compose.material3.DatePickerKt$HorizontalMonthsList$1 r1 = androidx.compose.material3.DatePickerKt$HorizontalMonthsList$1.INSTANCE
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            r5 = 0
            r4 = 0
            androidx.compose.ui.Modifier r18 = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(r0, r5, r1, r2, r4)
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            androidx.compose.material3.DatePickerDefaults r0 = androidx.compose.material3.DatePickerDefaults.INSTANCE
            r2 = 0
            int r1 = r7 >> 6
            r3 = r1 & 14
            r1 = r3 | 384(0x180, float:5.38E-43)
            r23 = 2
            r24 = r1
            r1 = r29
            r25 = r3
            r3 = r13
            r4 = r24
            r24 = r5
            r5 = r23
            androidx.compose.foundation.gestures.FlingBehavior r23 = r0.rememberSnapFlingBehavior$material3_release(r1, r2, r3, r4, r5)
            r26 = 0
            r0 = r28
            r1 = r17
            r2 = r27
            r3 = r16
            r4 = r31
            r5 = r30
            r33 = r7
            r7 = r6
            r6 = r32
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2, r3, r4, r5, r6}
            r1 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r13.startReplaceableGroup(r1)
            androidx.compose.runtime.ComposerKt.sourceInformation(r13, r7)
            r5 = r24
        L_0x013c:
            r1 = 7
            if (r5 >= r1) goto L_0x014a
            r1 = r0[r5]
            boolean r1 = r13.changed((java.lang.Object) r1)
            r24 = r24 | r1
            int r5 = r5 + 1
            goto L_0x013c
        L_0x014a:
            java.lang.Object r0 = r13.rememberedValue()
            if (r24 != 0) goto L_0x015c
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r0 != r1) goto L_0x0159
            goto L_0x015c
        L_0x0159:
            r16 = r33
            goto L_0x017c
        L_0x015c:
            androidx.compose.material3.DatePickerKt$HorizontalMonthsList$2$1 r24 = new androidx.compose.material3.DatePickerKt$HorizontalMonthsList$2$1
            r0 = r24
            r1 = r28
            r2 = r17
            r3 = r27
            r4 = r16
            r5 = r31
            r6 = r30
            r16 = r33
            r7 = r32
            r8 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = r24
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r13.updateRememberedValue(r0)
        L_0x017c:
            r13.endReplaceableGroup()
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            int r1 = r16 >> 3
            r1 = r1 & 112(0x70, float:1.57E-43)
            r2 = 188(0xbc, float:2.63E-43)
            r10 = r18
            r11 = r29
            r12 = r19
            r3 = r13
            r13 = r20
            r14 = r21
            r4 = r15
            r15 = r22
            r16 = r23
            r17 = r26
            r18 = r0
            r19 = r3
            r20 = r1
            r21 = r2
            androidx.compose.foundation.lazy.LazyDslKt.LazyRow(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r0 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r3.startReplaceableGroup(r0)
            java.lang.String r0 = "CC(remember)P(1,2):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r3, r0)
            boolean r0 = r3.changed((java.lang.Object) r4)
            boolean r1 = r3.changed((java.lang.Object) r9)
            r0 = r0 | r1
            java.lang.Object r1 = r3.rememberedValue()
            if (r0 != 0) goto L_0x01c6
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r0 = r0.getEmpty()
            if (r1 != r0) goto L_0x01d2
        L_0x01c6:
            androidx.compose.material3.DatePickerKt$HorizontalMonthsList$3$1 r0 = new androidx.compose.material3.DatePickerKt$HorizontalMonthsList$3$1
            r1 = 0
            r0.<init>(r4, r9, r1)
            r1 = r0
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            r3.updateRememberedValue(r1)
        L_0x01d2:
            r3.endReplaceableGroup()
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            r0 = r25 | 64
            androidx.compose.runtime.EffectsKt.LaunchedEffect((java.lang.Object) r4, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) r1, (androidx.compose.runtime.Composer) r3, (int) r0)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01e5
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x01e5:
            androidx.compose.runtime.ScopeUpdateScope r8 = r3.endRestartGroup()
            if (r8 != 0) goto L_0x01ec
            goto L_0x0205
        L_0x01ec:
            androidx.compose.material3.DatePickerKt$HorizontalMonthsList$4 r10 = new androidx.compose.material3.DatePickerKt$HorizontalMonthsList$4
            r0 = r10
            r1 = r27
            r2 = r28
            r3 = r29
            r4 = r30
            r5 = r31
            r6 = r32
            r7 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            r8.updateScope(r10)
        L_0x0205:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerKt.HorizontalMonthsList(kotlin.jvm.functions.Function1, androidx.compose.material3.StateData, androidx.compose.foundation.lazy.LazyListState, androidx.compose.material3.DatePickerFormatter, kotlin.jvm.functions.Function1, androidx.compose.material3.DatePickerColors, androidx.compose.runtime.Composer, int):void");
    }

    public static final Object updateDisplayedMonth(LazyListState lazyListState, StateData stateData, Continuation<? super Unit> continuation) {
        Object collect = SnapshotStateKt.snapshotFlow(new DatePickerKt$updateDisplayedMonth$2(lazyListState)).collect(new DatePickerKt$updateDisplayedMonth$3(lazyListState, stateData), continuation);
        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
    }

    public static final void WeekDays(DatePickerColors datePickerColors, CalendarModel calendarModel, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(datePickerColors, "colors");
        Intrinsics.checkNotNullParameter(calendarModel, "calendarModel");
        Composer startRestartGroup = composer.startRestartGroup(-1849465391);
        ComposerKt.sourceInformation(startRestartGroup, "C(WeekDays)P(1)1365@56132L1363:DatePicker.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed((Object) datePickerColors) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed((Object) calendarModel) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1849465391, i, -1, "androidx.compose.material3.WeekDays (DatePicker.kt:1354)");
            }
            int firstDayOfWeek = calendarModel.getFirstDayOfWeek();
            List<Pair<String, String>> weekdayNames = calendarModel.getWeekdayNames();
            ArrayList arrayList = new ArrayList();
            int i3 = firstDayOfWeek - 1;
            int size = weekdayNames.size();
            for (int i4 = i3; i4 < size; i4++) {
                arrayList.add(weekdayNames.get(i4));
            }
            for (int i5 = 0; i5 < i3; i5++) {
                arrayList.add(weekdayNames.get(i5));
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2811boximpl(datePickerColors.m1286getWeekdayContentColor0d7_KjU$material3_release()))}, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(startRestartGroup, -1445541615, true, new DatePickerKt$WeekDays$1(arrayList)), startRestartGroup, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DatePickerKt$WeekDays$2(datePickerColors, calendarModel, i));
        }
    }

    public static final void Month(CalendarMonth calendarMonth, Function1<? super Long, Unit> function1, CalendarDate calendarDate, StateData stateData, boolean z, Function1<? super Long, Boolean> function12, DatePickerFormatter datePickerFormatter, DatePickerColors datePickerColors, Composer composer, int i) {
        int i2;
        Composer composer2;
        Modifier modifier;
        CalendarMonth calendarMonth2 = calendarMonth;
        Function1<? super Long, Unit> function13 = function1;
        CalendarDate calendarDate2 = calendarDate;
        StateData stateData2 = stateData;
        boolean z2 = z;
        Function1<? super Long, Boolean> function14 = function12;
        DatePickerFormatter datePickerFormatter2 = datePickerFormatter;
        DatePickerColors datePickerColors2 = datePickerColors;
        int i3 = i;
        Intrinsics.checkNotNullParameter(calendarMonth2, "month");
        Intrinsics.checkNotNullParameter(function13, "onDateSelected");
        Intrinsics.checkNotNullParameter(calendarDate2, "today");
        Intrinsics.checkNotNullParameter(stateData2, "stateData");
        Intrinsics.checkNotNullParameter(function14, "dateValidator");
        Intrinsics.checkNotNullParameter(datePickerFormatter2, "dateFormatter");
        Intrinsics.checkNotNullParameter(datePickerColors2, "colors");
        Composer startRestartGroup = composer.startRestartGroup(-1561090804);
        ComposerKt.sourceInformation(startRestartGroup, "C(Month)P(3,4,7,6,5,2,1)1414@57986L377,1439@58703L15,1443@58865L10,1442@58825L5037:DatePicker.kt#uh7d8r");
        if ((i3 & 14) == 0) {
            i2 = (startRestartGroup.changed((Object) calendarMonth2) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i3 & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(function13) ? 32 : 16;
        }
        if ((i3 & 896) == 0) {
            i2 |= startRestartGroup.changed((Object) calendarDate2) ? 256 : 128;
        }
        if ((i3 & 7168) == 0) {
            i2 |= startRestartGroup.changed((Object) stateData2) ? 2048 : 1024;
        }
        if ((57344 & i3) == 0) {
            i2 |= startRestartGroup.changed(z2) ? 16384 : 8192;
        }
        if ((458752 & i3) == 0) {
            i2 |= startRestartGroup.changedInstance(function14) ? 131072 : 65536;
        }
        if ((3670016 & i3) == 0) {
            i2 |= startRestartGroup.changed((Object) datePickerFormatter2) ? 1048576 : 524288;
        }
        if ((29360128 & i3) == 0) {
            i2 |= startRestartGroup.changed((Object) datePickerColors2) ? 8388608 : 4194304;
        }
        int i4 = i2;
        if ((23967451 & i4) != 4793490 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1561090804, i4, -1, "androidx.compose.material3.Month (DatePicker.kt:1404)");
            }
            Boolean valueOf = Boolean.valueOf(z);
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed((Object) valueOf);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = SnapshotStateKt.derivedStateOf(new DatePickerKt$Month$rangeSelectionInfo$1$1(z2, calendarMonth2, stateData2));
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            State state = (State) rememberedValue;
            startRestartGroup.startReplaceableGroup(-2019479227);
            ComposerKt.sourceInformation(startRestartGroup, "1429@58464L177");
            if (z2) {
                Modifier modifier2 = Modifier.Companion;
                startRestartGroup.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                boolean changed2 = startRestartGroup.changed((Object) state) | startRestartGroup.changed((Object) datePickerColors2);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new DatePickerKt$Month$rangeSelectionDrawModifier$1$1(state, datePickerColors2);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceableGroup();
                modifier = DrawModifierKt.drawWithContent(modifier2, (Function1) rememberedValue2);
            } else {
                modifier = Modifier.Companion;
            }
            startRestartGroup.endReplaceableGroup();
            Locale defaultLocale = CalendarModel_androidKt.defaultLocale(startRestartGroup, 0);
            MutableState<CalendarDate> selectedStartDate = stateData.getSelectedStartDate();
            DatePickerKt$Month$1 datePickerKt$Month$1 = r0;
            int i5 = i4;
            MutableState<CalendarDate> selectedEndDate = stateData.getSelectedEndDate();
            TextStyle fromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), DatePickerModalTokens.INSTANCE.getDateLabelTextFont());
            composer2 = startRestartGroup;
            DatePickerKt$Month$1 datePickerKt$Month$12 = new DatePickerKt$Month$1(modifier, calendarMonth, calendarDate, selectedStartDate, selectedEndDate, z, i5, datePickerFormatter, defaultLocale, function1, datePickerColors, stateData, function12);
            TextKt.ProvideTextStyle(fromToken, ComposableLambdaKt.composableLambda(composer2, -1776200645, true, datePickerKt$Month$1), composer2, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DatePickerKt$Month$2(calendarMonth, function1, calendarDate, stateData, z, function12, datePickerFormatter, datePickerColors, i));
        }
    }

    /* access modifiers changed from: private */
    public static final String dayContentDescription(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Composer composer, int i) {
        composer.startReplaceableGroup(502032503);
        ComposerKt.sourceInformation(composer, "C(dayContentDescription)P(4,3,2)1563@64712L54:DatePicker.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(502032503, i, -1, "androidx.compose.material3.dayContentDescription (DatePicker.kt:1538)");
        }
        StringBuilder sb = new StringBuilder();
        composer.startReplaceableGroup(-852204210);
        ComposerKt.sourceInformation(composer, "");
        if (z) {
            if (z3) {
                composer.startReplaceableGroup(-852204120);
                ComposerKt.sourceInformation(composer, "1549@64220L56");
                sb.append(Strings_androidKt.m1632getStringNWtq28(Strings.Companion.m1605getDateRangePickerStartHeadlineadMyvUU(), composer, 6));
                composer.endReplaceableGroup();
            } else if (z4) {
                composer.startReplaceableGroup(-852203980);
                ComposerKt.sourceInformation(composer, "1553@64360L54");
                sb.append(Strings_androidKt.m1632getStringNWtq28(Strings.Companion.m1602getDateRangePickerEndHeadlineadMyvUU(), composer, 6));
                composer.endReplaceableGroup();
            } else if (z5) {
                composer.startReplaceableGroup(-852203842);
                ComposerKt.sourceInformation(composer, "1557@64498L53");
                sb.append(Strings_androidKt.m1632getStringNWtq28(Strings.Companion.m1601getDateRangePickerDayInRangeadMyvUU(), composer, 6));
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-852203741);
                composer.endReplaceableGroup();
            }
        }
        composer.endReplaceableGroup();
        if (z2) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(Strings_androidKt.m1632getStringNWtq28(Strings.Companion.m1597getDatePickerTodayDescriptionadMyvUU(), composer, 6));
        }
        String sb2 = sb.length() == 0 ? null : sb.toString();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return sb2;
    }

    /* access modifiers changed from: private */
    public static final void Day(Modifier modifier, boolean z, Function0<Unit> function0, boolean z2, boolean z3, boolean z4, boolean z5, String str, DatePickerColors datePickerColors, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i) {
        int i2;
        Composer composer2;
        boolean z6 = z;
        boolean z7 = z4;
        String str2 = str;
        Function2<? super Composer, ? super Integer, Unit> function22 = function2;
        int i3 = i;
        Composer startRestartGroup = composer.startRestartGroup(-1434777861);
        ComposerKt.sourceInformation(startRestartGroup, "C(Day)P(6,8,7!1,4,9,5,3)1594@65783L102,1599@65971L9,1600@66005L129,1605@66172L150,1582@65195L1472:DatePicker.kt#uh7d8r");
        Modifier modifier2 = modifier;
        if ((i3 & 14) == 0) {
            i2 = (startRestartGroup.changed((Object) modifier2) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i3 & 112) == 0) {
            i2 |= startRestartGroup.changed(z6) ? 32 : 16;
        }
        Function0<Unit> function02 = function0;
        if ((i3 & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        boolean z8 = z2;
        if ((i3 & 7168) == 0) {
            i2 |= startRestartGroup.changed(z8) ? 2048 : 1024;
        }
        boolean z9 = z3;
        if ((i3 & 57344) == 0) {
            i2 |= startRestartGroup.changed(z9) ? 16384 : 8192;
        }
        if ((458752 & i3) == 0) {
            i2 |= startRestartGroup.changed(z7) ? 131072 : 65536;
        }
        boolean z10 = z5;
        if ((3670016 & i3) == 0) {
            i2 |= startRestartGroup.changed(z10) ? 1048576 : 524288;
        }
        if ((29360128 & i3) == 0) {
            i2 |= startRestartGroup.changed((Object) str2) ? 8388608 : 4194304;
        }
        DatePickerColors datePickerColors2 = datePickerColors;
        if ((234881024 & i3) == 0) {
            i2 |= startRestartGroup.changed((Object) datePickerColors2) ? 67108864 : 33554432;
        }
        if ((1879048192 & i3) == 0) {
            i2 |= startRestartGroup.changedInstance(function22) ? 536870912 : 268435456;
        }
        int i4 = i2;
        if ((1533916891 & i4) != 306783378 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1434777861, i4, -1, "androidx.compose.material3.Day (DatePicker.kt:1570)");
            }
            Modifier r0 = SizeKt.m557requiredSizeVpY3zN4(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier), DatePickerModalTokens.INSTANCE.m1968getDateStateLayerWidthD9Ej5fM(), DatePickerModalTokens.INSTANCE.m1967getDateStateLayerHeightD9Ej5fM());
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed((Object) str2);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new DatePickerKt$Day$1$1(str2);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier semantics = SemanticsModifierKt.semantics(r0, true, (Function1) rememberedValue);
            Shape shape = ShapesKt.toShape(DatePickerModalTokens.INSTANCE.getDateContainerShape(), startRestartGroup, 6);
            int i5 = i4 >> 3;
            int i6 = i5 & 14;
            int i7 = i4 >> 15;
            int i8 = i4;
            long r20 = datePickerColors.dayContainerColor$material3_release(z, z3, z2, startRestartGroup, i6 | ((i4 >> 9) & 112) | (i5 & 896) | (i7 & 7168)).getValue().m2831unboximpl();
            int i9 = i8 >> 12;
            int i10 = i5 & 7168;
            composer2 = startRestartGroup;
            SurfaceKt.m1642Surfaced85dljk(z, function0, semantics, z3, shape, r20, datePickerColors.dayContentColor$material3_release(z4, z, z5, z3, startRestartGroup, (i7 & 14) | (i8 & 112) | (i9 & 896) | i10 | (i9 & 57344)).getValue().m2831unboximpl(), 0.0f, 0.0f, (!z7 || z6) ? null : BorderStrokeKt.m201BorderStrokecXLIe8U(DatePickerModalTokens.INSTANCE.m1969getDateTodayContainerOutlineWidthD9Ej5fM(), datePickerColors.m1285getTodayDateBorderColor0d7_KjU$material3_release()), (MutableInteractionSource) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(startRestartGroup, -2031780827, true, new DatePickerKt$Day$2(function22, i8)), composer2, i6 | (i5 & 112) | i10, 48, 1408);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DatePickerKt$Day$3(modifier, z, function0, z2, z3, z4, z5, str, datePickerColors, function2, i));
        }
    }

    /* access modifiers changed from: private */
    public static final void YearPicker(Modifier modifier, Function1<? super Integer, Unit> function1, DatePickerColors datePickerColors, StateData stateData, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1038904873);
        ComposerKt.sourceInformation(startRestartGroup, "C(YearPicker)P(1,2)1635@66923L10,1634@66875L4042:DatePicker.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed((Object) modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed((Object) datePickerColors) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed((Object) stateData) ? 2048 : 1024;
        }
        int i3 = i2;
        if ((i3 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1038904873, i3, -1, "androidx.compose.material3.YearPicker (DatePicker.kt:1628)");
            }
            TextKt.ProvideTextStyle(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), DatePickerModalTokens.INSTANCE.getSelectionYearLabelTextFont()), ComposableLambdaKt.composableLambda(startRestartGroup, -145469688, true, new DatePickerKt$YearPicker$1(stateData, datePickerColors, modifier, function1, i3)), startRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DatePickerKt$YearPicker$2(modifier, function1, datePickerColors, stateData, i));
        }
    }

    /* access modifiers changed from: private */
    public static final void Year(Modifier modifier, boolean z, boolean z2, Function0<Unit> function0, String str, DatePickerColors datePickerColors, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i) {
        int i2;
        Composer composer2;
        BorderStroke borderStroke;
        Modifier modifier2 = modifier;
        boolean z3 = z;
        boolean z4 = z2;
        String str2 = str;
        DatePickerColors datePickerColors2 = datePickerColors;
        Function2<? super Composer, ? super Integer, Unit> function22 = function2;
        int i3 = i;
        Composer startRestartGroup = composer.startRestartGroup(-1441573940);
        ComposerKt.sourceInformation(startRestartGroup, "C(Year)P(4,6,2,5,3)1725@71201L353,1742@71917L90,1746@72076L9,1747@72110L39,1748@72187L98,1736@71559L891:DatePicker.kt#uh7d8r");
        if ((i3 & 14) == 0) {
            i2 = (startRestartGroup.changed((Object) modifier2) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i3 & 112) == 0) {
            i2 |= startRestartGroup.changed(z3) ? 32 : 16;
        }
        if ((i3 & 896) == 0) {
            i2 |= startRestartGroup.changed(z4) ? 256 : 128;
        }
        Function0<Unit> function02 = function0;
        if ((i3 & 7168) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
        }
        if ((57344 & i3) == 0) {
            i2 |= startRestartGroup.changed((Object) str2) ? 16384 : 8192;
        }
        if ((458752 & i3) == 0) {
            i2 |= startRestartGroup.changed((Object) datePickerColors2) ? 131072 : 65536;
        }
        if ((3670016 & i3) == 0) {
            i2 |= startRestartGroup.changedInstance(function22) ? 1048576 : 524288;
        }
        int i4 = i2;
        if ((2995931 & i4) != 599186 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1441573940, i4, -1, "androidx.compose.material3.Year (DatePicker.kt:1716)");
            }
            Boolean valueOf = Boolean.valueOf(z2);
            Boolean valueOf2 = Boolean.valueOf(z);
            int i5 = i4 >> 6;
            int i6 = (i5 & 14) | (i4 & 112);
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed((Object) valueOf) | startRestartGroup.changed((Object) valueOf2);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                if (!z4 || z3) {
                    borderStroke = null;
                } else {
                    borderStroke = BorderStrokeKt.m201BorderStrokecXLIe8U(DatePickerModalTokens.INSTANCE.m1969getDateTodayContainerOutlineWidthD9Ej5fM(), datePickerColors.m1285getTodayDateBorderColor0d7_KjU$material3_release());
                }
                rememberedValue = borderStroke;
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            BorderStroke borderStroke2 = (BorderStroke) rememberedValue;
            int i7 = i4 >> 12;
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed2 = startRestartGroup.changed((Object) str2);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new DatePickerKt$Year$1$1(str2);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            int i8 = (i4 >> 3) & 14;
            Composer composer3 = startRestartGroup;
            composer2 = composer3;
            SurfaceKt.m1642Surfaced85dljk(z, function0, SemanticsModifierKt.semantics(modifier2, true, (Function1) rememberedValue2), false, ShapesKt.toShape(DatePickerModalTokens.INSTANCE.getSelectionYearStateLayerShape(), startRestartGroup, 6), datePickerColors2.yearContainerColor$material3_release(z3, startRestartGroup, i8 | (i7 & 112)).getValue().m2831unboximpl(), datePickerColors2.yearContentColor$material3_release(z4, z3, startRestartGroup, ((i4 >> 9) & 896) | i6).getValue().m2831unboximpl(), 0.0f, 0.0f, borderStroke2, (MutableInteractionSource) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composer3, -68753950, true, new DatePickerKt$Year$2(function22, i4)), composer3, i8 | (i5 & 112), 48, 1416);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DatePickerKt$Year$3(modifier, z, z2, function0, str, datePickerColors, function2, i));
        }
    }

    /* access modifiers changed from: private */
    public static final void MonthsNavigation(Modifier modifier, boolean z, boolean z2, boolean z3, String str, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Composer composer, int i) {
        int i2;
        Composer composer2;
        Arrangement.Horizontal horizontal;
        Modifier modifier2 = modifier;
        boolean z4 = z3;
        String str2 = str;
        int i3 = i;
        Composer startRestartGroup = composer.startRestartGroup(-1127095896);
        ComposerKt.sourceInformation(startRestartGroup, "C(MonthsNavigation)P(!2,5,7,6)1775@72887L2078:DatePicker.kt#uh7d8r");
        if ((i3 & 14) == 0) {
            i2 = (startRestartGroup.changed((Object) modifier2) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        boolean z5 = z;
        if ((i3 & 112) == 0) {
            i2 |= startRestartGroup.changed(z5) ? 32 : 16;
        }
        boolean z6 = z2;
        if ((i3 & 896) == 0) {
            i2 |= startRestartGroup.changed(z6) ? 256 : 128;
        }
        if ((i3 & 7168) == 0) {
            i2 |= startRestartGroup.changed(z4) ? 2048 : 1024;
        }
        if ((57344 & i3) == 0) {
            i2 |= startRestartGroup.changed((Object) str2) ? 16384 : 8192;
        }
        Function0<Unit> function04 = function0;
        if ((458752 & i3) == 0) {
            i2 |= startRestartGroup.changedInstance(function04) ? 131072 : 65536;
        }
        Function0<Unit> function05 = function02;
        if ((3670016 & i3) == 0) {
            i2 |= startRestartGroup.changedInstance(function05) ? 1048576 : 524288;
        }
        Function0<Unit> function06 = function03;
        if ((29360128 & i3) == 0) {
            i2 |= startRestartGroup.changedInstance(function06) ? 8388608 : 4194304;
        }
        int i4 = i2;
        if ((23967451 & i4) != 4793490 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1127095896, i4, -1, "androidx.compose.material3.MonthsNavigation (DatePicker.kt:1765)");
            }
            Modifier r0 = SizeKt.m552requiredHeight3ABfNKs(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, (Object) null), MonthYearHeight);
            if (z4) {
                horizontal = Arrangement.INSTANCE.getStart();
            } else {
                horizontal = Arrangement.INSTANCE.getSpaceBetween();
            }
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            startRestartGroup.startReplaceableGroup(693286680);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Row)P(2,1,3)78@3913L58,79@3976L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(horizontal, centerVertically, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            String str3 = "CC(Row)P(2,1,3)78@3913L58,79@3976L130:Row.kt#2w3rfo";
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density = (Density) consume;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection = (LayoutDirection) consume2;
            String str4 = "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh";
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume3 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(r0);
            String str5 = "C:CompositionLocal.kt#9igjgp";
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
            Composer r5 = Updater.m2444constructorimpl(startRestartGroup);
            Updater.m2451setimpl(r5, rowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2451setimpl(r5, density, ComposeUiNode.Companion.getSetDensity());
            Updater.m2451setimpl(r5, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2451setimpl(r5, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -326682283, "C80@4021L9:Row.kt#2w3rfo");
            RowScope rowScope = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1911928903, "C1787@73264L536:DatePicker.kt#uh7d8r");
            String str6 = str4;
            String str7 = "C80@4021L9:Row.kt#2w3rfo";
            String str8 = str5;
            int i5 = i4;
            String str9 = str3;
            YearPickerMenuButton(function03, z3, (Modifier) null, ComposableLambdaKt.composableLambda(startRestartGroup, -1156508456, true, new DatePickerKt$MonthsNavigation$1$1(str2, i4)), startRestartGroup, ((i4 >> 21) & 14) | 3072 | ((i4 >> 6) & 112), 4);
            startRestartGroup.startReplaceableGroup(979007906);
            ComposerKt.sourceInformation(startRestartGroup, "1801@73938L1011");
            if (!z4) {
                startRestartGroup.startReplaceableGroup(693286680);
                ComposerKt.sourceInformation(startRestartGroup, str9);
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, str6);
                String str10 = str8;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, str10);
                Object consume4 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density2 = (Density) consume4;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, str10);
                Object consume5 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                LayoutDirection layoutDirection2 = (LayoutDirection) consume5;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, str10);
                Object consume6 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume6;
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(Modifier.Companion);
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
                Composer r7 = Updater.m2444constructorimpl(startRestartGroup);
                Updater.m2451setimpl(r7, rowMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2451setimpl(r7, density2, ComposeUiNode.Companion.getSetDensity());
                Updater.m2451setimpl(r7, layoutDirection2, ComposeUiNode.Companion.getSetLayoutDirection());
                Updater.m2451setimpl(r7, viewConfiguration2, ComposeUiNode.Companion.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf2.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -326682283, str7);
                RowScope rowScope2 = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 479941280, "C1802@73991L7,1803@74038L446,1813@74501L434:DatePicker.kt#uh7d8r");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume7 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                boolean z7 = consume7 == LayoutDirection.Rtl;
                int i6 = i5;
                composer2 = startRestartGroup;
                Composer composer3 = composer2;
                IconButtonKt.IconButton(function02, (Modifier) null, z2, (IconButtonColors) null, (MutableInteractionSource) null, ComposableLambdaKt.composableLambda(startRestartGroup, -1143715416, true, new DatePickerKt$MonthsNavigation$1$2$1(z7)), composer3, ((i5 >> 18) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i5 & 896), 26);
                IconButtonKt.IconButton(function0, (Modifier) null, z, (IconButtonColors) null, (MutableInteractionSource) null, ComposableLambdaKt.composableLambda(composer2, 1336532191, true, new DatePickerKt$MonthsNavigation$1$2$2(z7)), composer3, ((i6 >> 15) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | ((i6 << 3) & 896), 26);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
            } else {
                composer2 = startRestartGroup;
            }
            composer2.endReplaceableGroup();
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
            endRestartGroup.updateScope(new DatePickerKt$MonthsNavigation$2(modifier, z, z2, z3, str, function0, function02, function03, i));
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void YearPickerMenuButton(kotlin.jvm.functions.Function0<kotlin.Unit> r20, boolean r21, androidx.compose.ui.Modifier r22, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r23, androidx.compose.runtime.Composer r24, int r25, int r26) {
        /*
            r2 = r21
            r4 = r23
            r5 = r25
            r0 = 409654418(0x186ad492, float:3.0351112E-24)
            r1 = r24
            androidx.compose.runtime.Composer r1 = r1.startRestartGroup(r0)
            java.lang.String r3 = "C(YearPickerMenuButton)P(3,1,2)1841@75389L11,1841@75343L75,1836@75206L690:DatePicker.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r3)
            r3 = r26 & 1
            if (r3 == 0) goto L_0x001e
            r3 = r5 | 6
            r6 = r3
            r3 = r20
            goto L_0x0032
        L_0x001e:
            r3 = r5 & 14
            if (r3 != 0) goto L_0x002f
            r3 = r20
            boolean r6 = r1.changedInstance(r3)
            if (r6 == 0) goto L_0x002c
            r6 = 4
            goto L_0x002d
        L_0x002c:
            r6 = 2
        L_0x002d:
            r6 = r6 | r5
            goto L_0x0032
        L_0x002f:
            r3 = r20
            r6 = r5
        L_0x0032:
            r7 = r26 & 2
            if (r7 == 0) goto L_0x0039
            r6 = r6 | 48
            goto L_0x0049
        L_0x0039:
            r7 = r5 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x0049
            boolean r7 = r1.changed((boolean) r2)
            if (r7 == 0) goto L_0x0046
            r7 = 32
            goto L_0x0048
        L_0x0046:
            r7 = 16
        L_0x0048:
            r6 = r6 | r7
        L_0x0049:
            r7 = r26 & 4
            if (r7 == 0) goto L_0x0050
            r6 = r6 | 384(0x180, float:5.38E-43)
            goto L_0x0063
        L_0x0050:
            r8 = r5 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x0063
            r8 = r22
            boolean r9 = r1.changed((java.lang.Object) r8)
            if (r9 == 0) goto L_0x005f
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r6 = r6 | r9
            goto L_0x0065
        L_0x0063:
            r8 = r22
        L_0x0065:
            r9 = r26 & 8
            if (r9 == 0) goto L_0x006c
            r6 = r6 | 3072(0xc00, float:4.305E-42)
            goto L_0x007c
        L_0x006c:
            r9 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x007c
            boolean r9 = r1.changedInstance(r4)
            if (r9 == 0) goto L_0x0079
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r6 = r6 | r9
        L_0x007c:
            r15 = r6
            r6 = r15 & 5851(0x16db, float:8.199E-42)
            r9 = 1170(0x492, float:1.64E-42)
            if (r6 != r9) goto L_0x0091
            boolean r6 = r1.getSkipping()
            if (r6 != 0) goto L_0x008a
            goto L_0x0091
        L_0x008a:
            r1.skipToGroupEnd()
            r19 = r8
            goto L_0x0106
        L_0x0091:
            if (r7 == 0) goto L_0x009a
            androidx.compose.ui.Modifier$Companion r6 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r6 = (androidx.compose.ui.Modifier) r6
            r19 = r6
            goto L_0x009c
        L_0x009a:
            r19 = r8
        L_0x009c:
            boolean r6 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r6 == 0) goto L_0x00a9
            r6 = -1
            java.lang.String r7 = "androidx.compose.material3.YearPickerMenuButton (DatePicker.kt:1830)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r15, r6, r7)
        L_0x00a9:
            androidx.compose.foundation.shape.RoundedCornerShape r6 = androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape()
            r18 = r6
            androidx.compose.ui.graphics.Shape r18 = (androidx.compose.ui.graphics.Shape) r18
            androidx.compose.material3.ButtonDefaults r6 = androidx.compose.material3.ButtonDefaults.INSTANCE
            r7 = 0
            androidx.compose.material3.MaterialTheme r9 = androidx.compose.material3.MaterialTheme.INSTANCE
            r10 = 6
            androidx.compose.material3.ColorScheme r9 = r9.getColorScheme(r1, r10)
            long r9 = r9.m1196getOnSurfaceVariant0d7_KjU()
            r11 = 0
            r13 = 0
            r16 = 24576(0x6000, float:3.4438E-41)
            r17 = 13
            r0 = r15
            r15 = r1
            androidx.compose.material3.ButtonColors r10 = r6.m1161textButtonColorsro_MJ88(r7, r9, r11, r13, r15, r16, r17)
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            androidx.compose.material3.DatePickerKt$YearPickerMenuButton$1 r6 = new androidx.compose.material3.DatePickerKt$YearPickerMenuButton$1
            r6.<init>(r4, r0, r2)
            r7 = 1899012021(0x71309fb5, float:8.74599E29)
            r8 = 1
            androidx.compose.runtime.internal.ComposableLambda r6 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r1, r7, r8, r6)
            r15 = r6
            kotlin.jvm.functions.Function3 r15 = (kotlin.jvm.functions.Function3) r15
            r6 = 807075840(0x301b0000, float:5.638867E-10)
            r7 = r0 & 14
            r6 = r6 | r7
            int r0 = r0 >> 3
            r0 = r0 & 112(0x70, float:1.57E-43)
            r17 = r6 | r0
            r0 = 388(0x184, float:5.44E-43)
            r6 = r20
            r7 = r19
            r8 = 0
            r9 = r18
            r16 = r1
            r18 = r0
            androidx.compose.material3.ButtonKt.TextButton(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0106
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0106:
            androidx.compose.runtime.ScopeUpdateScope r7 = r1.endRestartGroup()
            if (r7 != 0) goto L_0x010d
            goto L_0x0124
        L_0x010d:
            androidx.compose.material3.DatePickerKt$YearPickerMenuButton$2 r8 = new androidx.compose.material3.DatePickerKt$YearPickerMenuButton$2
            r0 = r8
            r1 = r20
            r2 = r21
            r3 = r19
            r4 = r23
            r5 = r25
            r6 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6)
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            r7.updateScope(r8)
        L_0x0124:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerKt.YearPickerMenuButton(kotlin.jvm.functions.Function0, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final List<CustomAccessibilityAction> customScrollActions(LazyGridState lazyGridState, CoroutineScope coroutineScope, String str, String str2) {
        return CollectionsKt.listOf(new CustomAccessibilityAction(str, new DatePickerKt$customScrollActions$scrollUpAction$1(lazyGridState, coroutineScope)), new CustomAccessibilityAction(str2, new DatePickerKt$customScrollActions$scrollDownAction$1(lazyGridState, coroutineScope)));
    }

    public static final String toLocalString(int i) {
        NumberFormat integerInstance = NumberFormat.getIntegerInstance();
        integerInstance.setGroupingUsed(false);
        String format = integerInstance.format(Integer.valueOf(i));
        Intrinsics.checkNotNullExpressionValue(format, "formatter.format(this)");
        return format;
    }

    static {
        float f = (float) 12;
        DatePickerHorizontalPadding = Dp.m5626constructorimpl(f);
        DatePickerModeTogglePadding = PaddingKt.m490PaddingValuesa9UjIt4$default(0.0f, 0.0f, Dp.m5626constructorimpl(f), Dp.m5626constructorimpl(f), 3, (Object) null);
        float f2 = (float) 24;
        float f3 = (float) 16;
        DatePickerTitlePadding = PaddingKt.m490PaddingValuesa9UjIt4$default(Dp.m5626constructorimpl(f2), Dp.m5626constructorimpl(f3), Dp.m5626constructorimpl(f), 0.0f, 8, (Object) null);
        DatePickerHeadlinePadding = PaddingKt.m490PaddingValuesa9UjIt4$default(Dp.m5626constructorimpl(f2), 0.0f, Dp.m5626constructorimpl(f), Dp.m5626constructorimpl(f), 2, (Object) null);
        YearsVerticalPadding = Dp.m5626constructorimpl(f3);
    }
}
