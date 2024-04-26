package androidx.compose.material3;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: BottomSheetScaffold.kt */
final class BottomSheetScaffoldKt$BottomSheetScaffold$1 extends Lambda implements Function3<Integer, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ BottomSheetScaffoldState $scaffoldState;
    final /* synthetic */ long $sheetContainerColor;
    final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> $sheetContent;
    final /* synthetic */ long $sheetContentColor;
    final /* synthetic */ Function2<Composer, Integer, Unit> $sheetDragHandle;
    final /* synthetic */ float $sheetPeekHeight;
    final /* synthetic */ float $sheetShadowElevation;
    final /* synthetic */ Shape $sheetShape;
    final /* synthetic */ boolean $sheetSwipeEnabled;
    final /* synthetic */ float $sheetTonalElevation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BottomSheetScaffoldKt$BottomSheetScaffold$1(BottomSheetScaffoldState bottomSheetScaffoldState, float f, boolean z, Shape shape, long j, long j2, float f2, float f3, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, int i, int i2) {
        super(3);
        this.$scaffoldState = bottomSheetScaffoldState;
        this.$sheetPeekHeight = f;
        this.$sheetSwipeEnabled = z;
        this.$sheetShape = shape;
        this.$sheetContainerColor = j;
        this.$sheetContentColor = j2;
        this.$sheetTonalElevation = f2;
        this.$sheetShadowElevation = f3;
        this.$sheetDragHandle = function2;
        this.$sheetContent = function3;
        this.$$dirty = i;
        this.$$dirty1 = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke(((Number) obj).intValue(), (Composer) obj2, ((Number) obj3).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i, Composer composer, int i2) {
        int i3;
        int i4 = i;
        Composer composer2 = composer;
        int i5 = i2;
        ComposerKt.sourceInformation(composer2, "C127@6516L581:BottomSheetScaffold.kt#uh7d8r");
        if ((i5 & 14) == 0) {
            i3 = (composer2.changed(i4) ? 4 : 2) | i5;
        } else {
            i3 = i5;
        }
        if ((i3 & 91) != 18 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(106433656, i5, -1, "androidx.compose.material3.BottomSheetScaffold.<anonymous> (BottomSheetScaffold.kt:126)");
            }
            SheetState bottomSheetState = this.$scaffoldState.getBottomSheetState();
            float f = this.$sheetPeekHeight;
            boolean z = this.$sheetSwipeEnabled;
            float f2 = (float) i4;
            Shape shape = this.$sheetShape;
            long j = this.$sheetContainerColor;
            long j2 = this.$sheetContentColor;
            float f3 = this.$sheetTonalElevation;
            float f4 = this.$sheetShadowElevation;
            Function2<Composer, Integer, Unit> function2 = this.$sheetDragHandle;
            Function3<ColumnScope, Composer, Integer, Unit> function3 = this.$sheetContent;
            int i6 = this.$$dirty;
            BottomSheetScaffoldKt.m1145StandardBottomSheet8oydGBM(bottomSheetState, f, z, f2, shape, j, j2, f3, f4, function2, function3, composer, ((i6 >> 6) & 112) | ((this.$$dirty1 << 6) & 896) | (i6 & 57344) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128) | (i6 & 234881024) | (i6 & 1879048192), i6 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
