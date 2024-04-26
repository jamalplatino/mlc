package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: BottomSheetScaffold.kt */
final class BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1 extends Lambda implements Function2<SubcomposeMeasureScope, Constraints, MeasureResult> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function3<PaddingValues, Composer, Integer, Unit> $body;
    final /* synthetic */ Function3<Integer, Composer, Integer, Unit> $bottomSheet;
    final /* synthetic */ long $containerColor;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function0<Float> $sheetOffset;
    final /* synthetic */ float $sheetPeekHeight;
    final /* synthetic */ SheetState $sheetState;
    final /* synthetic */ Function2<Composer, Integer, Unit> $snackbarHost;
    final /* synthetic */ Function2<Composer, Integer, Unit> $topBar;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* compiled from: BottomSheetScaffold.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.compose.material3.SheetValue[] r0 = androidx.compose.material3.SheetValue.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.material3.SheetValue r1 = androidx.compose.material3.SheetValue.PartiallyExpanded     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.material3.SheetValue r1 = androidx.compose.material3.SheetValue.Expanded     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.material3.SheetValue r1 = androidx.compose.material3.SheetValue.Hidden     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1.WhenMappings.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1(Function0<Float> function0, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, SheetState sheetState, Function3<? super Integer, ? super Composer, ? super Integer, Unit> function3, int i, Modifier modifier, long j, long j2, Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function32, float f) {
        super(2);
        this.$sheetOffset = function0;
        this.$topBar = function2;
        this.$snackbarHost = function22;
        this.$sheetState = sheetState;
        this.$bottomSheet = function3;
        this.$$dirty = i;
        this.$modifier = modifier;
        this.$containerColor = j;
        this.$contentColor = j2;
        this.$body = function32;
        this.$sheetPeekHeight = f;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m1148invoke0kLqBqw((SubcomposeMeasureScope) obj, ((Constraints) obj2).m5576unboximpl());
    }

    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
    public final MeasureResult m1148invoke0kLqBqw(SubcomposeMeasureScope subcomposeMeasureScope, long j) {
        int i;
        SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
        Intrinsics.checkNotNullParameter(subcomposeMeasureScope2, "$this$SubcomposeLayout");
        int r4 = Constraints.m5570getMaxWidthimpl(j);
        int r5 = Constraints.m5569getMaxHeightimpl(j);
        long r2 = Constraints.m5561copyZbe2FdA$default(j, 0, 0, 0, 0, 10, (Object) null);
        Placeable r6 = subcomposeMeasureScope2.subcompose(BottomSheetScaffoldLayoutSlot.Sheet, ComposableLambdaKt.composableLambdaInstance(-1192048628, true, new BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$sheetPlaceable$1(this.$bottomSheet, r5, this.$$dirty))).get(0).m4520measureBRTryo0(r2);
        int roundToInt = MathKt.roundToInt(this.$sheetOffset.invoke().floatValue());
        int max = Integer.max(0, (r4 - r6.getWidth()) / 2);
        Function2<Composer, Integer, Unit> function2 = this.$topBar;
        Placeable r13 = function2 != null ? subcomposeMeasureScope2.subcompose(BottomSheetScaffoldLayoutSlot.TopBar, ComposableLambdaKt.composableLambdaInstance(-873203005, true, new BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$topBarPlaceable$1$1(function2, this.$$dirty))).get(0).m4520measureBRTryo0(r2) : null;
        int height = r13 != null ? r13.getHeight() : 0;
        int i2 = height;
        Placeable placeable = r13;
        Placeable placeable2 = r6;
        int i3 = roundToInt;
        int i4 = r5;
        final Placeable r11 = subcomposeMeasureScope2.subcompose(BottomSheetScaffoldLayoutSlot.Body, ComposableLambdaKt.composableLambdaInstance(-1459220575, true, new BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$bodyPlaceable$1(this.$modifier, this.$containerColor, this.$contentColor, this.$$dirty, this.$body, this.$sheetPeekHeight))).get(0).m4520measureBRTryo0(Constraints.m5561copyZbe2FdA$default(r2, 0, 0, 0, r5 - height, 7, (Object) null));
        final Placeable r17 = subcomposeMeasureScope2.subcompose(BottomSheetScaffoldLayoutSlot.Snackbar, this.$snackbarHost).get(0).m4520measureBRTryo0(r2);
        int width = (r4 - r17.getWidth()) / 2;
        int i5 = WhenMappings.$EnumSwitchMapping$0[this.$sheetState.getCurrentValue().ordinal()];
        if (i5 == 1) {
            i = i3 - r17.getHeight();
        } else if (i5 == 2 || i5 == 3) {
            i = i4 - r17.getHeight();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        final int i6 = i2;
        final Placeable placeable3 = placeable;
        final Placeable placeable4 = placeable2;
        final int i7 = max;
        final int i8 = i3;
        final int i9 = width;
        final int i10 = i;
        return MeasureScope.layout$default(subcomposeMeasureScope2, r4, i4, (Map) null, new Function1<Placeable.PlacementScope, Unit>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Intrinsics.checkNotNullParameter(placementScope, "$this$layout");
                Placeable.PlacementScope.placeRelative$default(placementScope, r11, 0, i6, 0.0f, 4, (Object) null);
                Placeable placeable = placeable3;
                if (placeable != null) {
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, 0, 0.0f, 4, (Object) null);
                }
                Placeable.PlacementScope placementScope2 = placementScope;
                Placeable.PlacementScope.placeRelative$default(placementScope2, placeable4, i7, i8, 0.0f, 4, (Object) null);
                Placeable.PlacementScope.placeRelative$default(placementScope2, r17, i9, i10, 0.0f, 4, (Object) null);
            }
        }, 4, (Object) null);
    }
}
