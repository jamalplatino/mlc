package androidx.compose.material3;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\rH\u0000\u001aA\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00150\r2\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u0015H\u0001¢\u0006\u0002\u0010\u001a\"\u0019\u0010\u0000\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\"\u0013\u0010\u0005\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"BottomSheetMaxWidth", "Landroidx/compose/ui/unit/Dp;", "getBottomSheetMaxWidth", "()F", "F", "DragHandleVerticalPadding", "ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "sheetState", "Landroidx/compose/material3/SheetState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "onFling", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "velocity", "", "rememberSheetState", "skipPartiallyExpanded", "", "confirmValueChange", "Landroidx/compose/material3/SheetValue;", "initialValue", "skipHiddenState", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/material3/SheetValue;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: SheetDefaults.kt */
public final class SheetDefaultsKt {
    private static final float BottomSheetMaxWidth = Dp.m5626constructorimpl((float) 640);
    /* access modifiers changed from: private */
    public static final float DragHandleVerticalPadding = Dp.m5626constructorimpl((float) 22);

    public static final float getBottomSheetMaxWidth() {
        return BottomSheetMaxWidth;
    }

    public static final NestedScrollConnection ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(SheetState sheetState, Orientation orientation, Function1<? super Float, Unit> function1) {
        Intrinsics.checkNotNullParameter(sheetState, "sheetState");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(function1, "onFling");
        return new SheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1(sheetState, function1, orientation);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: androidx.compose.runtime.saveable.Saver<androidx.compose.material3.SheetState, androidx.compose.material3.SheetValue>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.material3.SheetState rememberSheetState(boolean r12, kotlin.jvm.functions.Function1<? super androidx.compose.material3.SheetValue, java.lang.Boolean> r13, androidx.compose.material3.SheetValue r14, boolean r15, androidx.compose.runtime.Composer r16, int r17, int r18) {
        /*
            r7 = r16
            r0 = 1032784200(0x3d8f0948, float:0.06984192)
            r7.startReplaceableGroup(r0)
            java.lang.String r1 = "C(rememberSheetState)P(3)403@14455L100,397@14225L330:SheetDefaults.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r7, r1)
            r1 = r18 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0014
            r1 = r2
            goto L_0x0015
        L_0x0014:
            r1 = r12
        L_0x0015:
            r3 = r18 & 2
            if (r3 == 0) goto L_0x001e
            androidx.compose.material3.SheetDefaultsKt$rememberSheetState$1 r3 = androidx.compose.material3.SheetDefaultsKt$rememberSheetState$1.INSTANCE
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            goto L_0x001f
        L_0x001e:
            r3 = r13
        L_0x001f:
            r4 = r18 & 4
            if (r4 == 0) goto L_0x0026
            androidx.compose.material3.SheetValue r4 = androidx.compose.material3.SheetValue.Hidden
            goto L_0x0027
        L_0x0026:
            r4 = r14
        L_0x0027:
            r5 = r18 & 8
            if (r5 == 0) goto L_0x002d
            r5 = r2
            goto L_0x002e
        L_0x002d:
            r5 = r15
        L_0x002e:
            boolean r6 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r6 == 0) goto L_0x003d
            r6 = -1
            java.lang.String r8 = "androidx.compose.material3.rememberSheetState (SheetDefaults.kt:391)"
            r9 = r17
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r9, r6, r8)
        L_0x003d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r3}
            androidx.compose.material3.SheetState$Companion r6 = androidx.compose.material3.SheetState.Companion
            androidx.compose.runtime.saveable.Saver r6 = r6.Saver(r1, r3)
            r8 = 0
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r1)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r5)
            java.lang.Object[] r9 = new java.lang.Object[]{r9, r4, r3, r10}
            r10 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r7.startReplaceableGroup(r10)
            java.lang.String r10 = "CC(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r7, r10)
            r10 = r2
        L_0x0064:
            r11 = 4
            if (r2 >= r11) goto L_0x0071
            r11 = r9[r2]
            boolean r11 = r7.changed((java.lang.Object) r11)
            r10 = r10 | r11
            int r2 = r2 + 1
            goto L_0x0064
        L_0x0071:
            java.lang.Object r2 = r16.rememberedValue()
            if (r10 != 0) goto L_0x007f
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r9 = r9.getEmpty()
            if (r2 != r9) goto L_0x0089
        L_0x007f:
            androidx.compose.material3.SheetDefaultsKt$rememberSheetState$2$1 r2 = new androidx.compose.material3.SheetDefaultsKt$rememberSheetState$2$1
            r2.<init>(r1, r4, r3, r5)
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            r7.updateRememberedValue(r2)
        L_0x0089:
            r16.endReplaceableGroup()
            r3 = r2
            kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
            r5 = 72
            r9 = 4
            r1 = r6
            r2 = r8
            r4 = r16
            r6 = r9
            java.lang.Object r0 = androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable((java.lang.Object[]) r0, r1, (java.lang.String) r2, r3, (androidx.compose.runtime.Composer) r4, (int) r5, (int) r6)
            androidx.compose.material3.SheetState r0 = (androidx.compose.material3.SheetState) r0
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x00a6
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x00a6:
            r16.endReplaceableGroup()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SheetDefaultsKt.rememberSheetState(boolean, kotlin.jvm.functions.Function1, androidx.compose.material3.SheetValue, boolean, androidx.compose.runtime.Composer, int, int):androidx.compose.material3.SheetState");
    }
}
