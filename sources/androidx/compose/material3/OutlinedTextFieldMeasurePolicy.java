package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.MeasurePolicy;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B4\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0002\u0010\fJ<\u0010\r\u001a\u00020\u000e*\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u000e2\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0015H\u0002J<\u0010\u0016\u001a\u00020\u000e*\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0017\u001a\u00020\u000e2\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0015H\u0002J\"\u0010\u0018\u001a\u00020\u000e*\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J\"\u0010\u0019\u001a\u00020\u000e*\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0017\u001a\u00020\u000eH\u0016J/\u0010\u001a\u001a\u00020\u001b*\u00020\u001c2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00112\u0006\u0010\u001e\u001a\u00020\u001fH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!J\"\u0010\"\u001a\u00020\u000e*\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J\"\u0010#\u001a\u00020\u000e*\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0017\u001a\u00020\u000eH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "onLabelMeasured", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Size;", "", "singleLine", "", "animationProgress", "", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Lkotlin/jvm/functions/Function1;ZFLandroidx/compose/foundation/layout/PaddingValues;)V", "intrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "intrinsicMeasurer", "Lkotlin/Function2;", "intrinsicWidth", "height", "maxIntrinsicHeight", "maxIntrinsicWidth", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: OutlinedTextField.kt */
final class OutlinedTextFieldMeasurePolicy implements MeasurePolicy {
    /* access modifiers changed from: private */
    public final float animationProgress;
    private final Function1<Size, Unit> onLabelMeasured;
    /* access modifiers changed from: private */
    public final PaddingValues paddingValues;
    /* access modifiers changed from: private */
    public final boolean singleLine;

    public OutlinedTextFieldMeasurePolicy(Function1<? super Size, Unit> function1, boolean z, float f, PaddingValues paddingValues2) {
        Intrinsics.checkNotNullParameter(function1, "onLabelMeasured");
        Intrinsics.checkNotNullParameter(paddingValues2, "paddingValues");
        this.onLabelMeasured = function1;
        this.singleLine = z;
        this.animationProgress = f;
        this.paddingValues = paddingValues2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v5, resolved type: androidx.compose.ui.layout.Measurable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v7, resolved type: androidx.compose.ui.layout.Measurable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: measure-3p2s80s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.compose.ui.layout.MeasureResult m1485measure3p2s80s(androidx.compose.ui.layout.MeasureScope r47, java.util.List<? extends androidx.compose.ui.layout.Measurable> r48, long r49) {
        /*
            r46 = this;
            r14 = r46
            r15 = r47
            r0 = r48
            java.lang.String r1 = "$this$measure"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r1)
            java.lang.String r1 = "measurables"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            androidx.compose.foundation.layout.PaddingValues r1 = r14.paddingValues
            float r1 = r1.m503calculateBottomPaddingD9Ej5fM()
            int r1 = r15.m5601roundToPx0680j_4(r1)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 10
            r9 = 0
            r2 = r49
            long r2 = androidx.compose.ui.unit.Constraints.m5561copyZbe2FdA$default(r2, r4, r5, r6, r7, r8, r9)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r4 = r0.iterator()
        L_0x002e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0048
            java.lang.Object r5 = r4.next()
            r7 = r5
            androidx.compose.ui.layout.Measurable r7 = (androidx.compose.ui.layout.Measurable) r7
            java.lang.Object r7 = androidx.compose.ui.layout.LayoutIdKt.getLayoutId(r7)
            java.lang.String r8 = "Leading"
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)
            if (r7 == 0) goto L_0x002e
            goto L_0x0049
        L_0x0048:
            r5 = 0
        L_0x0049:
            androidx.compose.ui.layout.Measurable r5 = (androidx.compose.ui.layout.Measurable) r5
            if (r5 == 0) goto L_0x0052
            androidx.compose.ui.layout.Placeable r4 = r5.m4520measureBRTryo0(r2)
            goto L_0x0053
        L_0x0052:
            r4 = 0
        L_0x0053:
            int r5 = androidx.compose.material3.TextFieldImplKt.widthOrZero(r4)
            int r7 = androidx.compose.material3.TextFieldImplKt.heightOrZero(r4)
            r8 = 0
            int r7 = java.lang.Math.max(r8, r7)
            java.util.Iterator r9 = r0.iterator()
        L_0x0064:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x007e
            java.lang.Object r10 = r9.next()
            r11 = r10
            androidx.compose.ui.layout.Measurable r11 = (androidx.compose.ui.layout.Measurable) r11
            java.lang.Object r11 = androidx.compose.ui.layout.LayoutIdKt.getLayoutId(r11)
            java.lang.String r12 = "Trailing"
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r11, (java.lang.Object) r12)
            if (r11 == 0) goto L_0x0064
            goto L_0x007f
        L_0x007e:
            r10 = 0
        L_0x007f:
            androidx.compose.ui.layout.Measurable r10 = (androidx.compose.ui.layout.Measurable) r10
            if (r10 == 0) goto L_0x0097
            int r9 = -r5
            r19 = 0
            r20 = 2
            r21 = 0
            r16 = r2
            r18 = r9
            long r11 = androidx.compose.ui.unit.ConstraintsKt.m5587offsetNN6EwU$default(r16, r18, r19, r20, r21)
            androidx.compose.ui.layout.Placeable r9 = r10.m4520measureBRTryo0(r11)
            goto L_0x0098
        L_0x0097:
            r9 = 0
        L_0x0098:
            int r10 = androidx.compose.material3.TextFieldImplKt.widthOrZero(r9)
            int r5 = r5 + r10
            int r10 = androidx.compose.material3.TextFieldImplKt.heightOrZero(r9)
            int r7 = java.lang.Math.max(r7, r10)
            java.util.Iterator r10 = r0.iterator()
        L_0x00a9:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x00c3
            java.lang.Object r11 = r10.next()
            r12 = r11
            androidx.compose.ui.layout.Measurable r12 = (androidx.compose.ui.layout.Measurable) r12
            java.lang.Object r12 = androidx.compose.ui.layout.LayoutIdKt.getLayoutId(r12)
            java.lang.String r13 = "Prefix"
            boolean r12 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r12, (java.lang.Object) r13)
            if (r12 == 0) goto L_0x00a9
            goto L_0x00c4
        L_0x00c3:
            r11 = 0
        L_0x00c4:
            androidx.compose.ui.layout.Measurable r11 = (androidx.compose.ui.layout.Measurable) r11
            if (r11 == 0) goto L_0x00dc
            int r10 = -r5
            r19 = 0
            r20 = 2
            r21 = 0
            r16 = r2
            r18 = r10
            long r12 = androidx.compose.ui.unit.ConstraintsKt.m5587offsetNN6EwU$default(r16, r18, r19, r20, r21)
            androidx.compose.ui.layout.Placeable r10 = r11.m4520measureBRTryo0(r12)
            goto L_0x00dd
        L_0x00dc:
            r10 = 0
        L_0x00dd:
            int r11 = androidx.compose.material3.TextFieldImplKt.widthOrZero(r10)
            int r5 = r5 + r11
            int r11 = androidx.compose.material3.TextFieldImplKt.heightOrZero(r10)
            int r7 = java.lang.Math.max(r7, r11)
            java.util.Iterator r11 = r0.iterator()
        L_0x00ee:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0108
            java.lang.Object r12 = r11.next()
            r13 = r12
            androidx.compose.ui.layout.Measurable r13 = (androidx.compose.ui.layout.Measurable) r13
            java.lang.Object r13 = androidx.compose.ui.layout.LayoutIdKt.getLayoutId(r13)
            java.lang.String r6 = "Suffix"
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r6)
            if (r6 == 0) goto L_0x00ee
            goto L_0x0109
        L_0x0108:
            r12 = 0
        L_0x0109:
            androidx.compose.ui.layout.Measurable r12 = (androidx.compose.ui.layout.Measurable) r12
            if (r12 == 0) goto L_0x0122
            int r6 = -r5
            r19 = 0
            r20 = 2
            r21 = 0
            r16 = r2
            r18 = r6
            r11 = r9
            long r8 = androidx.compose.ui.unit.ConstraintsKt.m5587offsetNN6EwU$default(r16, r18, r19, r20, r21)
            androidx.compose.ui.layout.Placeable r8 = r12.m4520measureBRTryo0(r8)
            goto L_0x0124
        L_0x0122:
            r11 = r9
            r8 = 0
        L_0x0124:
            int r9 = androidx.compose.material3.TextFieldImplKt.widthOrZero(r8)
            int r5 = r5 + r9
            int r9 = androidx.compose.material3.TextFieldImplKt.heightOrZero(r8)
            int r7 = java.lang.Math.max(r7, r9)
            float r9 = r14.animationProgress
            r12 = 1065353216(0x3f800000, float:1.0)
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 >= 0) goto L_0x013d
            r9 = 1
            r23 = r9
            goto L_0x013f
        L_0x013d:
            r23 = 0
        L_0x013f:
            androidx.compose.foundation.layout.PaddingValues r9 = r14.paddingValues
            androidx.compose.ui.unit.LayoutDirection r12 = r47.getLayoutDirection()
            float r9 = r9.m504calculateLeftPaddingu2uoSUM(r12)
            int r9 = r15.m5601roundToPx0680j_4(r9)
            androidx.compose.foundation.layout.PaddingValues r12 = r14.paddingValues
            androidx.compose.ui.unit.LayoutDirection r13 = r47.getLayoutDirection()
            float r12 = r12.m505calculateRightPaddingu2uoSUM(r13)
            int r12 = r15.m5601roundToPx0680j_4(r12)
            int r9 = r9 + r12
            if (r23 == 0) goto L_0x0161
            int r12 = -r5
            int r12 = r12 - r9
            goto L_0x0162
        L_0x0161:
            int r12 = -r9
        L_0x0162:
            int r9 = -r1
            long r12 = androidx.compose.ui.unit.ConstraintsKt.m5586offsetNN6EwU(r2, r12, r9)
            java.util.Iterator r16 = r0.iterator()
        L_0x016b:
            boolean r17 = r16.hasNext()
            if (r17 == 0) goto L_0x018b
            java.lang.Object r17 = r16.next()
            r18 = r17
            androidx.compose.ui.layout.Measurable r18 = (androidx.compose.ui.layout.Measurable) r18
            java.lang.Object r6 = androidx.compose.ui.layout.LayoutIdKt.getLayoutId(r18)
            r28 = r8
            java.lang.String r8 = "Label"
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r8)
            if (r6 == 0) goto L_0x0188
            goto L_0x018f
        L_0x0188:
            r8 = r28
            goto L_0x016b
        L_0x018b:
            r28 = r8
            r17 = 0
        L_0x018f:
            r6 = r17
            androidx.compose.ui.layout.Measurable r6 = (androidx.compose.ui.layout.Measurable) r6
            if (r6 == 0) goto L_0x019b
            androidx.compose.ui.layout.Placeable r6 = r6.m4520measureBRTryo0(r12)
            r8 = r6
            goto L_0x019c
        L_0x019b:
            r8 = 0
        L_0x019c:
            if (r8 == 0) goto L_0x01b5
            kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Size, kotlin.Unit> r6 = r14.onLabelMeasured
            int r12 = r8.getWidth()
            float r12 = (float) r12
            int r13 = r8.getHeight()
            float r13 = (float) r13
            long r12 = androidx.compose.ui.geometry.SizeKt.Size(r12, r13)
            androidx.compose.ui.geometry.Size r12 = androidx.compose.ui.geometry.Size.m2629boximpl(r12)
            r6.invoke(r12)
        L_0x01b5:
            int r6 = androidx.compose.material3.TextFieldImplKt.heightOrZero(r8)
            int r6 = r6 / 2
            androidx.compose.foundation.layout.PaddingValues r12 = r14.paddingValues
            float r12 = r12.m506calculateTopPaddingD9Ej5fM()
            int r12 = r15.m5601roundToPx0680j_4(r12)
            int r6 = java.lang.Math.max(r6, r12)
            int r5 = -r5
            int r9 = r9 - r6
            r12 = r49
            long r29 = androidx.compose.ui.unit.ConstraintsKt.m5586offsetNN6EwU(r12, r5, r9)
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 11
            r36 = 0
            long r12 = androidx.compose.ui.unit.Constraints.m5561copyZbe2FdA$default(r29, r31, r32, r33, r34, r35, r36)
            java.util.Iterator r5 = r0.iterator()
        L_0x01e5:
            boolean r9 = r5.hasNext()
            java.lang.String r15 = "Collection contains no element matching the predicate."
            if (r9 == 0) goto L_0x0371
            java.lang.Object r9 = r5.next()
            androidx.compose.ui.layout.Measurable r9 = (androidx.compose.ui.layout.Measurable) r9
            r16 = r5
            java.lang.Object r5 = androidx.compose.ui.layout.LayoutIdKt.getLayoutId(r9)
            r45 = r15
            java.lang.String r15 = "TextField"
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r15)
            if (r5 == 0) goto L_0x036b
            androidx.compose.ui.layout.Placeable r9 = r9.m4520measureBRTryo0(r12)
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 14
            r44 = 0
            r37 = r12
            long r12 = androidx.compose.ui.unit.Constraints.m5561copyZbe2FdA$default(r37, r39, r40, r41, r42, r43, r44)
            java.util.Iterator r5 = r0.iterator()
        L_0x021d:
            boolean r15 = r5.hasNext()
            if (r15 == 0) goto L_0x0241
            java.lang.Object r15 = r5.next()
            r16 = r15
            androidx.compose.ui.layout.Measurable r16 = (androidx.compose.ui.layout.Measurable) r16
            r17 = r5
            java.lang.Object r5 = androidx.compose.ui.layout.LayoutIdKt.getLayoutId(r16)
            r16 = r15
            java.lang.String r15 = "Hint"
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r15)
            if (r5 == 0) goto L_0x023e
            r15 = r16
            goto L_0x0242
        L_0x023e:
            r5 = r17
            goto L_0x021d
        L_0x0241:
            r15 = 0
        L_0x0242:
            androidx.compose.ui.layout.Measurable r15 = (androidx.compose.ui.layout.Measurable) r15
            if (r15 == 0) goto L_0x024c
            androidx.compose.ui.layout.Placeable r5 = r15.m4520measureBRTryo0(r12)
            r12 = r5
            goto L_0x024d
        L_0x024c:
            r12 = 0
        L_0x024d:
            int r5 = androidx.compose.material3.TextFieldImplKt.heightOrZero(r9)
            int r13 = androidx.compose.material3.TextFieldImplKt.heightOrZero(r12)
            int r5 = java.lang.Math.max(r5, r13)
            int r5 = r5 + r6
            int r5 = r5 + r1
            int r1 = java.lang.Math.max(r7, r5)
            r18 = 0
            int r1 = -r1
            r20 = 1
            r21 = 0
            r16 = r2
            r19 = r1
            long r29 = androidx.compose.ui.unit.ConstraintsKt.m5587offsetNN6EwU$default(r16, r18, r19, r20, r21)
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 11
            r36 = 0
            long r1 = androidx.compose.ui.unit.Constraints.m5561copyZbe2FdA$default(r29, r31, r32, r33, r34, r35, r36)
            java.util.Iterator r3 = r0.iterator()
        L_0x0282:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x029c
            java.lang.Object r5 = r3.next()
            r6 = r5
            androidx.compose.ui.layout.Measurable r6 = (androidx.compose.ui.layout.Measurable) r6
            java.lang.Object r6 = androidx.compose.ui.layout.LayoutIdKt.getLayoutId(r6)
            java.lang.String r7 = "Supporting"
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r7)
            if (r6 == 0) goto L_0x0282
            goto L_0x029d
        L_0x029c:
            r5 = 0
        L_0x029d:
            androidx.compose.ui.layout.Measurable r5 = (androidx.compose.ui.layout.Measurable) r5
            if (r5 == 0) goto L_0x02a7
            androidx.compose.ui.layout.Placeable r1 = r5.m4520measureBRTryo0(r1)
            r13 = r1
            goto L_0x02a8
        L_0x02a7:
            r13 = 0
        L_0x02a8:
            int r1 = androidx.compose.material3.TextFieldImplKt.heightOrZero(r13)
            int r16 = androidx.compose.material3.TextFieldImplKt.widthOrZero(r4)
            int r17 = androidx.compose.material3.TextFieldImplKt.widthOrZero(r11)
            int r18 = androidx.compose.material3.TextFieldImplKt.widthOrZero(r10)
            int r19 = androidx.compose.material3.TextFieldImplKt.widthOrZero(r28)
            int r20 = r9.getWidth()
            int r21 = androidx.compose.material3.TextFieldImplKt.widthOrZero(r8)
            int r22 = androidx.compose.material3.TextFieldImplKt.widthOrZero(r12)
            float r26 = r47.getDensity()
            androidx.compose.foundation.layout.PaddingValues r2 = r14.paddingValues
            r24 = r49
            r27 = r2
            int r15 = androidx.compose.material3.OutlinedTextFieldKt.m1483calculateWidthDHJA7U0(r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r27)
            int r29 = androidx.compose.material3.TextFieldImplKt.heightOrZero(r4)
            int r30 = androidx.compose.material3.TextFieldImplKt.heightOrZero(r11)
            int r31 = androidx.compose.material3.TextFieldImplKt.heightOrZero(r10)
            int r32 = androidx.compose.material3.TextFieldImplKt.heightOrZero(r28)
            int r33 = r9.getHeight()
            int r34 = androidx.compose.material3.TextFieldImplKt.heightOrZero(r8)
            int r35 = androidx.compose.material3.TextFieldImplKt.heightOrZero(r12)
            int r36 = androidx.compose.material3.TextFieldImplKt.heightOrZero(r13)
            float r39 = r47.getDensity()
            androidx.compose.foundation.layout.PaddingValues r2 = r14.paddingValues
            r37 = r49
            r40 = r2
            int r16 = androidx.compose.material3.OutlinedTextFieldKt.m1482calculateHeightDHJA7U0(r29, r30, r31, r32, r33, r34, r35, r36, r37, r39, r40)
            int r1 = r16 - r1
            java.util.Iterator r0 = r0.iterator()
        L_0x030a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0363
            java.lang.Object r2 = r0.next()
            androidx.compose.ui.layout.Measurable r2 = (androidx.compose.ui.layout.Measurable) r2
            java.lang.Object r3 = androidx.compose.ui.layout.LayoutIdKt.getLayoutId(r2)
            java.lang.String r5 = "Container"
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r5)
            if (r3 == 0) goto L_0x030a
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r15 == r0) goto L_0x0329
            r3 = r15
            goto L_0x032a
        L_0x0329:
            r3 = 0
        L_0x032a:
            if (r1 == r0) goto L_0x032e
            r0 = r1
            goto L_0x032f
        L_0x032e:
            r0 = 0
        L_0x032f:
            long r0 = androidx.compose.ui.unit.ConstraintsKt.Constraints(r3, r15, r0, r1)
            androidx.compose.ui.layout.Placeable r17 = r2.m4520measureBRTryo0(r0)
            r18 = 0
            androidx.compose.material3.OutlinedTextFieldMeasurePolicy$measure$2 r19 = new androidx.compose.material3.OutlinedTextFieldMeasurePolicy$measure$2
            r0 = r19
            r1 = r16
            r2 = r15
            r3 = r4
            r4 = r11
            r5 = r10
            r6 = r28
            r7 = r9
            r9 = r12
            r10 = r17
            r11 = r13
            r12 = r46
            r13 = r47
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r4 = r19
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            r5 = 4
            r6 = 0
            r0 = r47
            r1 = r15
            r2 = r16
            r3 = r18
            androidx.compose.ui.layout.MeasureResult r0 = androidx.compose.ui.layout.MeasureScope.layout$default(r0, r1, r2, r3, r4, r5, r6)
            return r0
        L_0x0363:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r5 = r45
            r0.<init>(r5)
            throw r0
        L_0x036b:
            r15 = r47
            r5 = r16
            goto L_0x01e5
        L_0x0371:
            r5 = r15
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OutlinedTextFieldMeasurePolicy.m1485measure3p2s80s(androidx.compose.ui.layout.MeasureScope, java.util.List, long):androidx.compose.ui.layout.MeasureResult");
    }

    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        return intrinsicHeight(intrinsicMeasureScope, list, i, OutlinedTextFieldMeasurePolicy$maxIntrinsicHeight$1.INSTANCE);
    }

    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        return intrinsicHeight(intrinsicMeasureScope, list, i, OutlinedTextFieldMeasurePolicy$minIntrinsicHeight$1.INSTANCE);
    }

    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        return intrinsicWidth(intrinsicMeasureScope, list, i, OutlinedTextFieldMeasurePolicy$maxIntrinsicWidth$1.INSTANCE);
    }

    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        return intrinsicWidth(intrinsicMeasureScope, list, i, OutlinedTextFieldMeasurePolicy$minIntrinsicWidth$1.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int intrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope r17, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> r18, int r19, kotlin.jvm.functions.Function2<? super androidx.compose.ui.layout.IntrinsicMeasurable, ? super java.lang.Integer, java.lang.Integer> r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r20
            r2 = r18
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r3 = r2.iterator()
        L_0x000c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0187
            java.lang.Object r4 = r3.next()
            r5 = r4
            androidx.compose.ui.layout.IntrinsicMeasurable r5 = (androidx.compose.ui.layout.IntrinsicMeasurable) r5
            java.lang.Object r5 = androidx.compose.material3.TextFieldImplKt.getLayoutId(r5)
            java.lang.String r6 = "TextField"
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            if (r5 == 0) goto L_0x000c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r19)
            java.lang.Object r3 = r1.invoke(r4, r3)
            java.lang.Number r3 = (java.lang.Number) r3
            int r8 = r3.intValue()
            java.util.Iterator r3 = r2.iterator()
        L_0x0037:
            boolean r4 = r3.hasNext()
            r5 = 0
            if (r4 == 0) goto L_0x0052
            java.lang.Object r4 = r3.next()
            r6 = r4
            androidx.compose.ui.layout.IntrinsicMeasurable r6 = (androidx.compose.ui.layout.IntrinsicMeasurable) r6
            java.lang.Object r6 = androidx.compose.material3.TextFieldImplKt.getLayoutId(r6)
            java.lang.String r7 = "Label"
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r7)
            if (r6 == 0) goto L_0x0037
            goto L_0x0053
        L_0x0052:
            r4 = r5
        L_0x0053:
            androidx.compose.ui.layout.IntrinsicMeasurable r4 = (androidx.compose.ui.layout.IntrinsicMeasurable) r4
            r3 = 0
            if (r4 == 0) goto L_0x0068
            java.lang.Integer r6 = java.lang.Integer.valueOf(r19)
            java.lang.Object r4 = r1.invoke(r4, r6)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r9 = r4
            goto L_0x0069
        L_0x0068:
            r9 = r3
        L_0x0069:
            java.util.Iterator r4 = r2.iterator()
        L_0x006d:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0087
            java.lang.Object r6 = r4.next()
            r7 = r6
            androidx.compose.ui.layout.IntrinsicMeasurable r7 = (androidx.compose.ui.layout.IntrinsicMeasurable) r7
            java.lang.Object r7 = androidx.compose.material3.TextFieldImplKt.getLayoutId(r7)
            java.lang.String r10 = "Trailing"
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r10)
            if (r7 == 0) goto L_0x006d
            goto L_0x0088
        L_0x0087:
            r6 = r5
        L_0x0088:
            androidx.compose.ui.layout.IntrinsicMeasurable r6 = (androidx.compose.ui.layout.IntrinsicMeasurable) r6
            if (r6 == 0) goto L_0x009c
            java.lang.Integer r4 = java.lang.Integer.valueOf(r19)
            java.lang.Object r4 = r1.invoke(r6, r4)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r6 = r4
            goto L_0x009d
        L_0x009c:
            r6 = r3
        L_0x009d:
            java.util.Iterator r4 = r2.iterator()
        L_0x00a1:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x00bb
            java.lang.Object r7 = r4.next()
            r10 = r7
            androidx.compose.ui.layout.IntrinsicMeasurable r10 = (androidx.compose.ui.layout.IntrinsicMeasurable) r10
            java.lang.Object r10 = androidx.compose.material3.TextFieldImplKt.getLayoutId(r10)
            java.lang.String r11 = "Leading"
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r10, (java.lang.Object) r11)
            if (r10 == 0) goto L_0x00a1
            goto L_0x00bc
        L_0x00bb:
            r7 = r5
        L_0x00bc:
            androidx.compose.ui.layout.IntrinsicMeasurable r7 = (androidx.compose.ui.layout.IntrinsicMeasurable) r7
            if (r7 == 0) goto L_0x00cf
            java.lang.Integer r4 = java.lang.Integer.valueOf(r19)
            java.lang.Object r4 = r1.invoke(r7, r4)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            goto L_0x00d0
        L_0x00cf:
            r4 = r3
        L_0x00d0:
            java.util.Iterator r7 = r2.iterator()
        L_0x00d4:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x00ee
            java.lang.Object r10 = r7.next()
            r11 = r10
            androidx.compose.ui.layout.IntrinsicMeasurable r11 = (androidx.compose.ui.layout.IntrinsicMeasurable) r11
            java.lang.Object r11 = androidx.compose.material3.TextFieldImplKt.getLayoutId(r11)
            java.lang.String r12 = "Prefix"
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r11, (java.lang.Object) r12)
            if (r11 == 0) goto L_0x00d4
            goto L_0x00ef
        L_0x00ee:
            r10 = r5
        L_0x00ef:
            androidx.compose.ui.layout.IntrinsicMeasurable r10 = (androidx.compose.ui.layout.IntrinsicMeasurable) r10
            if (r10 == 0) goto L_0x0102
            java.lang.Integer r7 = java.lang.Integer.valueOf(r19)
            java.lang.Object r7 = r1.invoke(r10, r7)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            goto L_0x0103
        L_0x0102:
            r7 = r3
        L_0x0103:
            java.util.Iterator r10 = r2.iterator()
        L_0x0107:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0121
            java.lang.Object r11 = r10.next()
            r12 = r11
            androidx.compose.ui.layout.IntrinsicMeasurable r12 = (androidx.compose.ui.layout.IntrinsicMeasurable) r12
            java.lang.Object r12 = androidx.compose.material3.TextFieldImplKt.getLayoutId(r12)
            java.lang.String r13 = "Suffix"
            boolean r12 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r12, (java.lang.Object) r13)
            if (r12 == 0) goto L_0x0107
            goto L_0x0122
        L_0x0121:
            r11 = r5
        L_0x0122:
            androidx.compose.ui.layout.IntrinsicMeasurable r11 = (androidx.compose.ui.layout.IntrinsicMeasurable) r11
            if (r11 == 0) goto L_0x0135
            java.lang.Integer r10 = java.lang.Integer.valueOf(r19)
            java.lang.Object r10 = r1.invoke(r11, r10)
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            goto L_0x0136
        L_0x0135:
            r10 = r3
        L_0x0136:
            java.util.Iterator r2 = r2.iterator()
        L_0x013a:
            boolean r11 = r2.hasNext()
            if (r11 == 0) goto L_0x0154
            java.lang.Object r11 = r2.next()
            r12 = r11
            androidx.compose.ui.layout.IntrinsicMeasurable r12 = (androidx.compose.ui.layout.IntrinsicMeasurable) r12
            java.lang.Object r12 = androidx.compose.material3.TextFieldImplKt.getLayoutId(r12)
            java.lang.String r13 = "Hint"
            boolean r12 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r12, (java.lang.Object) r13)
            if (r12 == 0) goto L_0x013a
            r5 = r11
        L_0x0154:
            androidx.compose.ui.layout.IntrinsicMeasurable r5 = (androidx.compose.ui.layout.IntrinsicMeasurable) r5
            if (r5 == 0) goto L_0x0167
            java.lang.Integer r2 = java.lang.Integer.valueOf(r19)
            java.lang.Object r1 = r1.invoke(r5, r2)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            goto L_0x0168
        L_0x0167:
            r1 = r3
        L_0x0168:
            float r2 = r0.animationProgress
            r5 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x0173
            r2 = 1
            r11 = r2
            goto L_0x0174
        L_0x0173:
            r11 = r3
        L_0x0174:
            long r12 = androidx.compose.material3.TextFieldImplKt.getZeroConstraints()
            float r14 = r17.getDensity()
            androidx.compose.foundation.layout.PaddingValues r15 = r0.paddingValues
            r5 = r6
            r6 = r7
            r7 = r10
            r10 = r1
            int r1 = androidx.compose.material3.OutlinedTextFieldKt.m1483calculateWidthDHJA7U0(r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15)
            return r1
        L_0x0187:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r2 = "Collection contains no element matching the predicate."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OutlinedTextFieldMeasurePolicy.intrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope, java.util.List, int, kotlin.jvm.functions.Function2):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int intrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope r17, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> r18, int r19, kotlin.jvm.functions.Function2<? super androidx.compose.ui.layout.IntrinsicMeasurable, ? super java.lang.Integer, java.lang.Integer> r20) {
        /*
            r16 = this;
            r0 = r20
            r1 = r18
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r2 = r1.iterator()
        L_0x000a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01b3
            java.lang.Object r3 = r2.next()
            r4 = r3
            androidx.compose.ui.layout.IntrinsicMeasurable r4 = (androidx.compose.ui.layout.IntrinsicMeasurable) r4
            java.lang.Object r4 = androidx.compose.material3.TextFieldImplKt.getLayoutId(r4)
            java.lang.String r5 = "TextField"
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 == 0) goto L_0x01af
            java.lang.Integer r2 = java.lang.Integer.valueOf(r19)
            java.lang.Object r2 = r0.invoke(r3, r2)
            java.lang.Number r2 = (java.lang.Number) r2
            int r7 = r2.intValue()
            java.util.Iterator r2 = r1.iterator()
        L_0x0035:
            boolean r3 = r2.hasNext()
            r4 = 0
            if (r3 == 0) goto L_0x0050
            java.lang.Object r3 = r2.next()
            r5 = r3
            androidx.compose.ui.layout.IntrinsicMeasurable r5 = (androidx.compose.ui.layout.IntrinsicMeasurable) r5
            java.lang.Object r5 = androidx.compose.material3.TextFieldImplKt.getLayoutId(r5)
            java.lang.String r6 = "Label"
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            if (r5 == 0) goto L_0x0035
            goto L_0x0051
        L_0x0050:
            r3 = r4
        L_0x0051:
            androidx.compose.ui.layout.IntrinsicMeasurable r3 = (androidx.compose.ui.layout.IntrinsicMeasurable) r3
            r2 = 0
            if (r3 == 0) goto L_0x0066
            java.lang.Integer r5 = java.lang.Integer.valueOf(r19)
            java.lang.Object r3 = r0.invoke(r3, r5)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r8 = r3
            goto L_0x0067
        L_0x0066:
            r8 = r2
        L_0x0067:
            java.util.Iterator r3 = r1.iterator()
        L_0x006b:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0085
            java.lang.Object r5 = r3.next()
            r6 = r5
            androidx.compose.ui.layout.IntrinsicMeasurable r6 = (androidx.compose.ui.layout.IntrinsicMeasurable) r6
            java.lang.Object r6 = androidx.compose.material3.TextFieldImplKt.getLayoutId(r6)
            java.lang.String r9 = "Trailing"
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r9)
            if (r6 == 0) goto L_0x006b
            goto L_0x0086
        L_0x0085:
            r5 = r4
        L_0x0086:
            androidx.compose.ui.layout.IntrinsicMeasurable r5 = (androidx.compose.ui.layout.IntrinsicMeasurable) r5
            if (r5 == 0) goto L_0x009a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r19)
            java.lang.Object r3 = r0.invoke(r5, r3)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r5 = r3
            goto L_0x009b
        L_0x009a:
            r5 = r2
        L_0x009b:
            java.util.Iterator r3 = r1.iterator()
        L_0x009f:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x00b9
            java.lang.Object r6 = r3.next()
            r9 = r6
            androidx.compose.ui.layout.IntrinsicMeasurable r9 = (androidx.compose.ui.layout.IntrinsicMeasurable) r9
            java.lang.Object r9 = androidx.compose.material3.TextFieldImplKt.getLayoutId(r9)
            java.lang.String r10 = "Leading"
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r9 == 0) goto L_0x009f
            goto L_0x00ba
        L_0x00b9:
            r6 = r4
        L_0x00ba:
            androidx.compose.ui.layout.IntrinsicMeasurable r6 = (androidx.compose.ui.layout.IntrinsicMeasurable) r6
            if (r6 == 0) goto L_0x00cd
            java.lang.Integer r3 = java.lang.Integer.valueOf(r19)
            java.lang.Object r3 = r0.invoke(r6, r3)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            goto L_0x00ce
        L_0x00cd:
            r3 = r2
        L_0x00ce:
            java.util.Iterator r6 = r1.iterator()
        L_0x00d2:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x00ec
            java.lang.Object r9 = r6.next()
            r10 = r9
            androidx.compose.ui.layout.IntrinsicMeasurable r10 = (androidx.compose.ui.layout.IntrinsicMeasurable) r10
            java.lang.Object r10 = androidx.compose.material3.TextFieldImplKt.getLayoutId(r10)
            java.lang.String r11 = "Prefix"
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r10, (java.lang.Object) r11)
            if (r10 == 0) goto L_0x00d2
            goto L_0x00ed
        L_0x00ec:
            r9 = r4
        L_0x00ed:
            androidx.compose.ui.layout.IntrinsicMeasurable r9 = (androidx.compose.ui.layout.IntrinsicMeasurable) r9
            if (r9 == 0) goto L_0x0100
            java.lang.Integer r6 = java.lang.Integer.valueOf(r19)
            java.lang.Object r6 = r0.invoke(r9, r6)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            goto L_0x0101
        L_0x0100:
            r6 = r2
        L_0x0101:
            java.util.Iterator r9 = r1.iterator()
        L_0x0105:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x011f
            java.lang.Object r10 = r9.next()
            r11 = r10
            androidx.compose.ui.layout.IntrinsicMeasurable r11 = (androidx.compose.ui.layout.IntrinsicMeasurable) r11
            java.lang.Object r11 = androidx.compose.material3.TextFieldImplKt.getLayoutId(r11)
            java.lang.String r12 = "Suffix"
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r11, (java.lang.Object) r12)
            if (r11 == 0) goto L_0x0105
            goto L_0x0120
        L_0x011f:
            r10 = r4
        L_0x0120:
            androidx.compose.ui.layout.IntrinsicMeasurable r10 = (androidx.compose.ui.layout.IntrinsicMeasurable) r10
            if (r10 == 0) goto L_0x0133
            java.lang.Integer r9 = java.lang.Integer.valueOf(r19)
            java.lang.Object r9 = r0.invoke(r10, r9)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            goto L_0x0134
        L_0x0133:
            r9 = r2
        L_0x0134:
            java.util.Iterator r10 = r1.iterator()
        L_0x0138:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0152
            java.lang.Object r11 = r10.next()
            r12 = r11
            androidx.compose.ui.layout.IntrinsicMeasurable r12 = (androidx.compose.ui.layout.IntrinsicMeasurable) r12
            java.lang.Object r12 = androidx.compose.material3.TextFieldImplKt.getLayoutId(r12)
            java.lang.String r13 = "Hint"
            boolean r12 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r12, (java.lang.Object) r13)
            if (r12 == 0) goto L_0x0138
            goto L_0x0153
        L_0x0152:
            r11 = r4
        L_0x0153:
            androidx.compose.ui.layout.IntrinsicMeasurable r11 = (androidx.compose.ui.layout.IntrinsicMeasurable) r11
            if (r11 == 0) goto L_0x0166
            java.lang.Integer r10 = java.lang.Integer.valueOf(r19)
            java.lang.Object r10 = r0.invoke(r11, r10)
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            goto L_0x0167
        L_0x0166:
            r10 = r2
        L_0x0167:
            java.util.Iterator r1 = r1.iterator()
        L_0x016b:
            boolean r11 = r1.hasNext()
            if (r11 == 0) goto L_0x0185
            java.lang.Object r11 = r1.next()
            r12 = r11
            androidx.compose.ui.layout.IntrinsicMeasurable r12 = (androidx.compose.ui.layout.IntrinsicMeasurable) r12
            java.lang.Object r12 = androidx.compose.material3.TextFieldImplKt.getLayoutId(r12)
            java.lang.String r13 = "Supporting"
            boolean r12 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r12, (java.lang.Object) r13)
            if (r12 == 0) goto L_0x016b
            r4 = r11
        L_0x0185:
            androidx.compose.ui.layout.IntrinsicMeasurable r4 = (androidx.compose.ui.layout.IntrinsicMeasurable) r4
            if (r4 == 0) goto L_0x0198
            java.lang.Integer r1 = java.lang.Integer.valueOf(r19)
            java.lang.Object r0 = r0.invoke(r4, r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            goto L_0x0199
        L_0x0198:
            r0 = r2
        L_0x0199:
            long r11 = androidx.compose.material3.TextFieldImplKt.getZeroConstraints()
            float r13 = r17.getDensity()
            r15 = r16
            androidx.compose.foundation.layout.PaddingValues r14 = r15.paddingValues
            r4 = r5
            r5 = r6
            r6 = r9
            r9 = r10
            r10 = r0
            int r0 = androidx.compose.material3.OutlinedTextFieldKt.m1482calculateHeightDHJA7U0(r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14)
            return r0
        L_0x01af:
            r15 = r16
            goto L_0x000a
        L_0x01b3:
            r15 = r16
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "Collection contains no element matching the predicate."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OutlinedTextFieldMeasurePolicy.intrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope, java.util.List, int, kotlin.jvm.functions.Function2):int");
    }
}
