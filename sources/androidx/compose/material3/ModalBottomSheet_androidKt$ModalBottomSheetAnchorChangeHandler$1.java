package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H\n"}, d2 = {"<anonymous>", "", "previousTarget", "Landroidx/compose/material3/SheetValue;", "previousAnchors", "", "", "newAnchors"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: ModalBottomSheet.android.kt */
final class ModalBottomSheet_androidKt$ModalBottomSheetAnchorChangeHandler$1 implements AnchorChangeHandler<SheetValue> {
    final /* synthetic */ Function2<SheetValue, Float, Unit> $animateTo;
    final /* synthetic */ Function1<SheetValue, Unit> $snapTo;
    final /* synthetic */ SheetState $state;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* compiled from: ModalBottomSheet.android.kt */
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
                androidx.compose.material3.SheetValue r1 = androidx.compose.material3.SheetValue.Hidden     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.material3.SheetValue r1 = androidx.compose.material3.SheetValue.PartiallyExpanded     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.material3.SheetValue r1 = androidx.compose.material3.SheetValue.Expanded     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheetAnchorChangeHandler$1.WhenMappings.<clinit>():void");
        }
    }

    ModalBottomSheet_androidKt$ModalBottomSheetAnchorChangeHandler$1(SheetState sheetState, Function2<? super SheetValue, ? super Float, Unit> function2, Function1<? super SheetValue, Unit> function1) {
        this.$state = sheetState;
        this.$animateTo = function2;
        this.$snapTo = function1;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.util.Map<androidx.compose.material3.SheetValue, java.lang.Float>, java.util.Map, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAnchorsChanged(androidx.compose.material3.SheetValue r3, java.util.Map<androidx.compose.material3.SheetValue, java.lang.Float> r4, java.util.Map<androidx.compose.material3.SheetValue, java.lang.Float> r5) {
        /*
            r2 = this;
            java.lang.String r0 = "previousTarget"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "previousAnchors"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "newAnchors"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.Object r0 = r4.get(r3)
            java.lang.Float r0 = (java.lang.Float) r0
            int[] r1 = androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheetAnchorChangeHandler$1.WhenMappings.$EnumSwitchMapping$0
            int r3 = r3.ordinal()
            r3 = r1[r3]
            r1 = 1
            if (r3 == r1) goto L_0x0049
            r1 = 2
            if (r3 == r1) goto L_0x0030
            r1 = 3
            if (r3 != r1) goto L_0x002a
            goto L_0x0030
        L_0x002a:
            kotlin.NoWhenBranchMatchedException r3 = new kotlin.NoWhenBranchMatchedException
            r3.<init>()
            throw r3
        L_0x0030:
            androidx.compose.material3.SheetValue r3 = androidx.compose.material3.SheetValue.PartiallyExpanded
            boolean r3 = r5.containsKey(r3)
            if (r3 == 0) goto L_0x003b
            androidx.compose.material3.SheetValue r3 = androidx.compose.material3.SheetValue.PartiallyExpanded
            goto L_0x004b
        L_0x003b:
            androidx.compose.material3.SheetValue r3 = androidx.compose.material3.SheetValue.Expanded
            boolean r3 = r5.containsKey(r3)
            if (r3 == 0) goto L_0x0046
            androidx.compose.material3.SheetValue r3 = androidx.compose.material3.SheetValue.Expanded
            goto L_0x004b
        L_0x0046:
            androidx.compose.material3.SheetValue r3 = androidx.compose.material3.SheetValue.Hidden
            goto L_0x004b
        L_0x0049:
            androidx.compose.material3.SheetValue r3 = androidx.compose.material3.SheetValue.Hidden
        L_0x004b:
            java.lang.Object r5 = kotlin.collections.MapsKt.getValue(r5, r3)
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((float) r5, (java.lang.Float) r0)
            if (r5 != 0) goto L_0x0087
            androidx.compose.material3.SheetState r5 = r2.$state
            androidx.compose.material3.SwipeableV2State r5 = r5.getSwipeableState$material3_release()
            boolean r5 = r5.isAnimationRunning()
            if (r5 != 0) goto L_0x0074
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x006e
            goto L_0x0074
        L_0x006e:
            kotlin.jvm.functions.Function1<androidx.compose.material3.SheetValue, kotlin.Unit> r4 = r2.$snapTo
            r4.invoke(r3)
            goto L_0x0087
        L_0x0074:
            kotlin.jvm.functions.Function2<androidx.compose.material3.SheetValue, java.lang.Float, kotlin.Unit> r4 = r2.$animateTo
            androidx.compose.material3.SheetState r5 = r2.$state
            androidx.compose.material3.SwipeableV2State r5 = r5.getSwipeableState$material3_release()
            float r5 = r5.getLastVelocity()
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r4.invoke(r3, r5)
        L_0x0087:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheetAnchorChangeHandler$1.onAnchorsChanged(androidx.compose.material3.SheetValue, java.util.Map, java.util.Map):void");
    }
}
