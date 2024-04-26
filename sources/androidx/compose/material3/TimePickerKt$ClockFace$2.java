package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutIdKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: TimePicker.kt */
final class TimePickerKt$ClockFace$2 extends Lambda implements Function3<List<? extends Integer>, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ boolean $autoSwitchToMinute;
    final /* synthetic */ TimePickerColors $colors;
    final /* synthetic */ TimePickerState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TimePickerKt$ClockFace$2(TimePickerState timePickerState, boolean z, TimePickerColors timePickerColors, int i) {
        super(3);
        this.$state = timePickerState;
        this.$autoSwitchToMinute = z;
        this.$colors = timePickerColors;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((List<Integer>) (List) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(List<Integer> list, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(list, "screen");
        ComposerKt.sourceInformation(composer, "C1141@44425L1479:TimePicker.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1628166511, i, -1, "androidx.compose.material3.ClockFace.<anonymous> (TimePicker.kt:1140)");
        }
        Modifier access$drawSelector = TimePickerKt.drawSelector(SizeKt.m563size3ABfNKs(TimePickerKt.clockDial(Modifier.Companion, this.$state, this.$autoSwitchToMinute), TimePickerTokens.INSTANCE.m2341getClockDialContainerSizeD9Ej5fM()), this.$state, this.$colors);
        float access$getOuterCircleSizeRadius$p = TimePickerKt.OuterCircleSizeRadius;
        final TimePickerColors timePickerColors = this.$colors;
        final TimePickerState timePickerState = this.$state;
        final boolean z = this.$autoSwitchToMinute;
        final int i2 = this.$$dirty;
        final List<Integer> list2 = list;
        TimePickerKt.m1741CircularLayoutuFdPcIQ(access$drawSelector, access$getOuterCircleSizeRadius$p, ComposableLambdaKt.composableLambda(composer, -1385633737, true, new Function2<Composer, Integer, Unit>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                ComposerKt.sourceInformation(composer, "C1148@44687L1207:TimePicker.kt#uh7d8r");
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1385633737, i, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous> (TimePicker.kt:1147)");
                    }
                    ProvidedValue[] providedValueArr = {ContentColorKt.getLocalContentColor().provides(Color.m2811boximpl(timePickerColors.m1730clockDialContentColorvNxB06k$material3_release(false)))};
                    final List<Integer> list = list2;
                    final TimePickerState timePickerState = timePickerState;
                    final boolean z = z;
                    final int i2 = i2;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composer, -2018362505, true, new Function2<Composer, Integer, Unit>() {
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer, int i) {
                            int i2;
                            ComposerKt.sourceInformation(composer, "C1161@45270L592:TimePicker.kt#uh7d8r");
                            if ((i & 11) != 2 || !composer.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2018362505, i, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1150)");
                                }
                                composer.startReplaceableGroup(-504302349);
                                ComposerKt.sourceInformation(composer, "*1157@45091L64");
                                int size = list.size();
                                TimePickerState timePickerState = timePickerState;
                                List<Integer> list = list;
                                boolean z = z;
                                int i3 = i2;
                                for (int i4 = 0; i4 < size; i4++) {
                                    if (!timePickerState.is24hour() || Selection.m1536equalsimpl0(timePickerState.m1770getSelectionJiIwxys$material3_release(), Selection.Companion.m1541getMinuteJiIwxys())) {
                                        i2 = list.get(i4).intValue();
                                    } else {
                                        i2 = list.get(i4).intValue() % 12;
                                    }
                                    TimePickerKt.ClockText(timePickerState, i2, z, composer, (i3 & 14) | (i3 & 896));
                                }
                                composer.endReplaceableGroup();
                                if (Selection.m1536equalsimpl0(timePickerState.m1770getSelectionJiIwxys$material3_release(), Selection.Companion.m1540getHourJiIwxys()) && timePickerState.is24hour()) {
                                    Modifier r3 = BackgroundKt.m181backgroundbw27NRU(SizeKt.m563size3ABfNKs(LayoutIdKt.layoutId(Modifier.Companion, LayoutId.InnerCircle), TimePickerTokens.INSTANCE.m2341getClockDialContainerSizeD9Ej5fM()), Color.Companion.m2856getTransparent0d7_KjU(), RoundedCornerShapeKt.getCircleShape());
                                    float access$getInnerCircleRadius$p = TimePickerKt.InnerCircleRadius;
                                    final TimePickerState timePickerState2 = timePickerState;
                                    final boolean z2 = z;
                                    final int i5 = i2;
                                    TimePickerKt.m1741CircularLayoutuFdPcIQ(r3, access$getInnerCircleRadius$p, ComposableLambdaKt.composableLambda(composer, -448649404, true, new Function2<Composer, Integer, Unit>() {
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                            invoke((Composer) obj, ((Number) obj2).intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer, int i) {
                                            ComposerKt.sourceInformation(composer, "C*1170@45750L64:TimePicker.kt#uh7d8r");
                                            if ((i & 11) != 2 || !composer.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-448649404, i, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1167)");
                                                }
                                                int size = TimePickerKt.ExtraHours.size();
                                                TimePickerState timePickerState = timePickerState2;
                                                boolean z = z2;
                                                int i2 = i5;
                                                for (int i3 = 0; i3 < size; i3++) {
                                                    TimePickerKt.ClockText(timePickerState, ((Number) TimePickerKt.ExtraHours.get(i3)).intValue(), z, composer, (i2 & 14) | (i2 & 896));
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer.skipToGroupEnd();
                                        }
                                    }), composer, 432, 0);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer.skipToGroupEnd();
                        }
                    }), composer, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }
        }), composer, 432, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
