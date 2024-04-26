package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: ModalBottomSheet.android.kt */
final class ModalBottomSheet_androidKt$ModalBottomSheet$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ AnchorChangeHandler<SheetValue> $anchorChangeHandler;
    final /* synthetic */ Function0<Unit> $animateToDismiss;
    final /* synthetic */ long $containerColor;
    final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> $content;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ Function2<Composer, Integer, Unit> $dragHandle;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ long $scrimColor;
    final /* synthetic */ Function1<Float, Unit> $settleToDismiss;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ SheetState $sheetState;
    final /* synthetic */ int $systemBarHeight;
    final /* synthetic */ float $tonalElevation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ModalBottomSheet_androidKt$ModalBottomSheet$2(long j, Function0<Unit> function0, SheetState sheetState, int i, Modifier modifier, AnchorChangeHandler<SheetValue> anchorChangeHandler, int i2, Function1<? super Float, Unit> function1, Shape shape, long j2, long j3, float f, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, CoroutineScope coroutineScope) {
        super(2);
        this.$scrimColor = j;
        this.$animateToDismiss = function0;
        this.$sheetState = sheetState;
        this.$$dirty = i;
        this.$modifier = modifier;
        this.$anchorChangeHandler = anchorChangeHandler;
        this.$systemBarHeight = i2;
        this.$settleToDismiss = function1;
        this.$shape = shape;
        this.$containerColor = j2;
        this.$contentColor = j3;
        this.$tonalElevation = f;
        this.$dragHandle = function2;
        this.$content = function3;
        this.$scope = coroutineScope;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        int i2 = i;
        ComposerKt.sourceInformation(composer, "C141@6524L4163:ModalBottomSheet.android.kt#uh7d8r");
        if ((i2 & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-620400863, i2, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.android.kt:140)");
            }
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null);
            final long j = this.$scrimColor;
            final Function0<Unit> function0 = this.$animateToDismiss;
            final SheetState sheetState = this.$sheetState;
            final int i3 = this.$$dirty;
            final Modifier modifier = this.$modifier;
            final AnchorChangeHandler<SheetValue> anchorChangeHandler = this.$anchorChangeHandler;
            final int i4 = this.$systemBarHeight;
            AnonymousClass1 r2 = r6;
            final Function1<Float, Unit> function1 = this.$settleToDismiss;
            final Shape shape = this.$shape;
            final long j2 = this.$containerColor;
            final long j3 = this.$contentColor;
            final float f = this.$tonalElevation;
            final Function2<Composer, Integer, Unit> function2 = this.$dragHandle;
            final Function3<ColumnScope, Composer, Integer, Unit> function3 = this.$content;
            final CoroutineScope coroutineScope = this.$scope;
            AnonymousClass1 r6 = new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return Unit.INSTANCE;
                }

                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: kotlin.jvm.functions.Function2} */
                /* JADX WARNING: Multi-variable type inference failed */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void invoke(androidx.compose.foundation.layout.BoxWithConstraintsScope r21, androidx.compose.runtime.Composer r22, int r23) {
                    /*
                        r20 = this;
                        r0 = r20
                        r1 = r21
                        r11 = r22
                        r2 = r23
                        java.lang.String r3 = "$this$BoxWithConstraints"
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
                        java.lang.String r3 = "C143@6632L168,153@7026L244,162@7330L348,175@8033L75,148@6813L3864:ModalBottomSheet.android.kt#uh7d8r"
                        androidx.compose.runtime.ComposerKt.sourceInformation(r11, r3)
                        r3 = r2 & 14
                        r8 = 2
                        if (r3 != 0) goto L_0x0022
                        boolean r3 = r11.changed((java.lang.Object) r1)
                        if (r3 == 0) goto L_0x001f
                        r3 = 4
                        goto L_0x0020
                    L_0x001f:
                        r3 = r8
                    L_0x0020:
                        r3 = r3 | r2
                        goto L_0x0023
                    L_0x0022:
                        r3 = r2
                    L_0x0023:
                        r3 = r3 & 91
                        r4 = 18
                        if (r3 != r4) goto L_0x0035
                        boolean r3 = r22.getSkipping()
                        if (r3 != 0) goto L_0x0030
                        goto L_0x0035
                    L_0x0030:
                        r22.skipToGroupEnd()
                        goto L_0x0182
                    L_0x0035:
                        boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                        if (r3 == 0) goto L_0x0045
                        r3 = -1
                        java.lang.String r4 = "androidx.compose.material3.ModalBottomSheet.<anonymous>.<anonymous> (ModalBottomSheet.android.kt:141)"
                        r5 = -868170889(0xffffffffcc40c377, float:-5.0531804E7)
                        androidx.compose.runtime.ComposerKt.traceEventStart(r5, r2, r3, r4)
                    L_0x0045:
                        long r2 = r21.m447getConstraintsmsEJaDk()
                        int r9 = androidx.compose.ui.unit.Constraints.m5569getMaxHeightimpl(r2)
                        long r2 = r7
                        kotlin.jvm.functions.Function0<kotlin.Unit> r4 = r9
                        androidx.compose.material3.SheetState r5 = r10
                        androidx.compose.material3.SheetValue r5 = r5.getTargetValue()
                        androidx.compose.material3.SheetValue r6 = androidx.compose.material3.SheetValue.Hidden
                        r10 = 1
                        if (r5 == r6) goto L_0x005e
                        r5 = r10
                        goto L_0x005f
                    L_0x005e:
                        r5 = 0
                    L_0x005f:
                        int r6 = r11
                        int r6 = r6 >> 21
                        r7 = r6 & 14
                        r6 = r22
                        androidx.compose.material3.ModalBottomSheet_androidKt.m1436Scrim3JVO9M(r2, r4, r5, r6, r7)
                        androidx.compose.ui.Modifier r2 = r12
                        float r3 = androidx.compose.material3.SheetDefaultsKt.getBottomSheetMaxWidth()
                        r4 = 0
                        r5 = 0
                        androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.m570widthInVpY3zN4$default(r2, r4, r3, r10, r5)
                        androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(r2, r4, r10, r5)
                        androidx.compose.ui.Alignment$Companion r3 = androidx.compose.ui.Alignment.Companion
                        androidx.compose.ui.Alignment r3 = r3.getTopCenter()
                        androidx.compose.ui.Modifier r1 = r1.align(r2, r3)
                        androidx.compose.material3.SheetState r2 = r10
                        r3 = 1157296644(0x44faf204, float:2007.563)
                        r11.startReplaceableGroup(r3)
                        java.lang.String r4 = "CC(remember)P(1):Composables.kt#9igjgp"
                        androidx.compose.runtime.ComposerKt.sourceInformation(r11, r4)
                        boolean r6 = r11.changed((java.lang.Object) r2)
                        java.lang.Object r7 = r22.rememberedValue()
                        if (r6 != 0) goto L_0x00a3
                        androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.Companion
                        java.lang.Object r6 = r6.getEmpty()
                        if (r7 != r6) goto L_0x00ae
                    L_0x00a3:
                        androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$2$1$1$1 r6 = new androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$2$1$1$1
                        r6.<init>(r2)
                        r7 = r6
                        kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
                        r11.updateRememberedValue(r7)
                    L_0x00ae:
                        r22.endReplaceableGroup()
                        kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
                        androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.OffsetKt.offset(r1, r7)
                        androidx.compose.material3.SheetState r2 = r10
                        kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit> r6 = r15
                        r11.startReplaceableGroup(r3)
                        androidx.compose.runtime.ComposerKt.sourceInformation(r11, r4)
                        boolean r7 = r11.changed((java.lang.Object) r2)
                        java.lang.Object r12 = r22.rememberedValue()
                        if (r7 != 0) goto L_0x00d3
                        androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.Companion
                        java.lang.Object r7 = r7.getEmpty()
                        if (r12 != r7) goto L_0x00dc
                    L_0x00d3:
                        androidx.compose.foundation.gestures.Orientation r7 = androidx.compose.foundation.gestures.Orientation.Vertical
                        androidx.compose.ui.input.nestedscroll.NestedScrollConnection r12 = androidx.compose.material3.SheetDefaultsKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(r2, r7, r6)
                        r11.updateRememberedValue(r12)
                    L_0x00dc:
                        r22.endReplaceableGroup()
                        androidx.compose.ui.input.nestedscroll.NestedScrollConnection r12 = (androidx.compose.ui.input.nestedscroll.NestedScrollConnection) r12
                        androidx.compose.ui.Modifier r13 = androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt.nestedScroll$default(r1, r12, r5, r8, r5)
                        androidx.compose.material3.SheetState r14 = r10
                        androidx.compose.material3.AnchorChangeHandler<androidx.compose.material3.SheetValue> r15 = r13
                        float r1 = (float) r9
                        int r2 = r14
                        float r2 = (float) r2
                        kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit> r5 = r15
                        r11.startReplaceableGroup(r3)
                        androidx.compose.runtime.ComposerKt.sourceInformation(r11, r4)
                        boolean r3 = r11.changed((java.lang.Object) r5)
                        java.lang.Object r4 = r22.rememberedValue()
                        if (r3 != 0) goto L_0x0107
                        androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.Companion
                        java.lang.Object r3 = r3.getEmpty()
                        if (r4 != r3) goto L_0x0112
                    L_0x0107:
                        androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$2$1$3$1 r3 = new androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$2$1$3$1
                        r3.<init>(r5)
                        r4 = r3
                        kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
                        r11.updateRememberedValue(r4)
                    L_0x0112:
                        r22.endReplaceableGroup()
                        r18 = r4
                        kotlin.jvm.functions.Function2 r18 = (kotlin.jvm.functions.Function2) r18
                        r16 = r1
                        r17 = r2
                        androidx.compose.ui.Modifier r1 = androidx.compose.material3.ModalBottomSheet_androidKt.modalBottomSheetSwipeable(r13, r14, r15, r16, r17, r18)
                        androidx.compose.ui.graphics.Shape r2 = r16
                        long r3 = r17
                        long r5 = r19
                        float r7 = r21
                        androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$2$1$4 r15 = new androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$2$1$4
                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> r13 = r22
                        kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> r14 = r23
                        int r12 = r11
                        androidx.compose.material3.SheetState r9 = r10
                        kotlin.jvm.functions.Function0<kotlin.Unit> r8 = r9
                        kotlinx.coroutines.CoroutineScope r10 = r24
                        r16 = r12
                        r12 = r15
                        r19 = r7
                        r7 = r15
                        r15 = r16
                        r16 = r9
                        r17 = r8
                        r18 = r10
                        r12.<init>(r13, r14, r15, r16, r17, r18)
                        r8 = -14815598(0xffffffffff1dee92, float:-2.0992752E38)
                        r9 = 1
                        androidx.compose.runtime.internal.ComposableLambda r7 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r11, r8, r9, r7)
                        r10 = r7
                        kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
                        int r7 = r11
                        int r8 = r7 >> 6
                        r8 = r8 & 112(0x70, float:1.57E-43)
                        r9 = 12582912(0xc00000, float:1.7632415E-38)
                        r8 = r8 | r9
                        int r9 = r7 >> 6
                        r9 = r9 & 896(0x380, float:1.256E-42)
                        r8 = r8 | r9
                        int r9 = r7 >> 6
                        r9 = r9 & 7168(0x1c00, float:1.0045E-41)
                        r8 = r8 | r9
                        r9 = 57344(0xe000, float:8.0356E-41)
                        int r7 = r7 >> 6
                        r7 = r7 & r9
                        r12 = r8 | r7
                        r13 = 96
                        r7 = r19
                        r8 = 0
                        r9 = 0
                        r11 = r22
                        androidx.compose.material3.SurfaceKt.m1641SurfaceT9BRK9s(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12, r13)
                        boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                        if (r1 == 0) goto L_0x0182
                        androidx.compose.runtime.ComposerKt.traceEventEnd()
                    L_0x0182:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$2.AnonymousClass1.invoke(androidx.compose.foundation.layout.BoxWithConstraintsScope, androidx.compose.runtime.Composer, int):void");
                }
            };
            Composer composer2 = composer;
            BoxWithConstraintsKt.BoxWithConstraints(fillMaxSize$default, (Alignment) null, false, ComposableLambdaKt.composableLambda(composer2, -868170889, true, r2), composer2, 3078, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
