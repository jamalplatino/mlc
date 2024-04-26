package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.MeasurePolicy;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ8\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\n2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0010H\u0002J<\u0010\u0011\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0013\u001a\u00020\n2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0010H\u0002J\"\u0010\u0014\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0013\u001a\u00020\nH\u0016J\"\u0010\u0015\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\nH\u0016J/\u0010\u0016\u001a\u00020\u0017*\u00020\u00182\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00190\f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010\u001e\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0013\u001a\u00020\nH\u0016J\"\u0010\u001f\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006 "}, d2 = {"Landroidx/compose/material3/TextFieldMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "singleLine", "", "animationProgress", "", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(ZFLandroidx/compose/foundation/layout/PaddingValues;)V", "intrinsicWidth", "", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "height", "intrinsicMeasurer", "Lkotlin/Function2;", "intrinsicHeight", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "width", "maxIntrinsicHeight", "maxIntrinsicWidth", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: TextField.kt */
final class TextFieldMeasurePolicy implements MeasurePolicy {
    /* access modifiers changed from: private */
    public final float animationProgress;
    /* access modifiers changed from: private */
    public final PaddingValues paddingValues;
    /* access modifiers changed from: private */
    public final boolean singleLine;

    public TextFieldMeasurePolicy(boolean z, float f, PaddingValues paddingValues2) {
        Intrinsics.checkNotNullParameter(paddingValues2, "paddingValues");
        this.singleLine = z;
        this.animationProgress = f;
        this.paddingValues = paddingValues2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v5, resolved type: androidx.compose.ui.layout.Measurable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v7, resolved type: androidx.compose.ui.layout.Measurable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: measure-3p2s80s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.compose.ui.layout.MeasureResult m1724measure3p2s80s(androidx.compose.ui.layout.MeasureScope r46, java.util.List<? extends androidx.compose.ui.layout.Measurable> r47, long r48) {
        /*
            r45 = this;
            r15 = r45
            r14 = r46
            r0 = r47
            java.lang.String r1 = "$this$measure"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r1)
            java.lang.String r1 = "measurables"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            androidx.compose.foundation.layout.PaddingValues r1 = r15.paddingValues
            float r1 = r1.m506calculateTopPaddingD9Ej5fM()
            int r13 = r14.m5601roundToPx0680j_4(r1)
            androidx.compose.foundation.layout.PaddingValues r1 = r15.paddingValues
            float r1 = r1.m503calculateBottomPaddingD9Ej5fM()
            int r1 = r14.m5601roundToPx0680j_4(r1)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 10
            r9 = 0
            r2 = r48
            long r2 = androidx.compose.ui.unit.Constraints.m5561copyZbe2FdA$default(r2, r4, r5, r6, r7, r8, r9)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r4 = r0.iterator()
        L_0x0038:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0052
            java.lang.Object r5 = r4.next()
            r7 = r5
            androidx.compose.ui.layout.Measurable r7 = (androidx.compose.ui.layout.Measurable) r7
            java.lang.Object r7 = androidx.compose.ui.layout.LayoutIdKt.getLayoutId(r7)
            java.lang.String r8 = "Leading"
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)
            if (r7 == 0) goto L_0x0038
            goto L_0x0053
        L_0x0052:
            r5 = 0
        L_0x0053:
            androidx.compose.ui.layout.Measurable r5 = (androidx.compose.ui.layout.Measurable) r5
            if (r5 == 0) goto L_0x005d
            androidx.compose.ui.layout.Placeable r4 = r5.m4520measureBRTryo0(r2)
            r7 = r4
            goto L_0x005e
        L_0x005d:
            r7 = 0
        L_0x005e:
            int r4 = androidx.compose.material3.TextFieldImplKt.widthOrZero(r7)
            int r5 = androidx.compose.material3.TextFieldImplKt.heightOrZero(r7)
            r8 = 0
            int r5 = java.lang.Math.max(r8, r5)
            java.util.Iterator r9 = r0.iterator()
        L_0x006f:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0089
            java.lang.Object r10 = r9.next()
            r11 = r10
            androidx.compose.ui.layout.Measurable r11 = (androidx.compose.ui.layout.Measurable) r11
            java.lang.Object r11 = androidx.compose.ui.layout.LayoutIdKt.getLayoutId(r11)
            java.lang.String r12 = "Trailing"
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r11, (java.lang.Object) r12)
            if (r11 == 0) goto L_0x006f
            goto L_0x008a
        L_0x0089:
            r10 = 0
        L_0x008a:
            androidx.compose.ui.layout.Measurable r10 = (androidx.compose.ui.layout.Measurable) r10
            if (r10 == 0) goto L_0x00a2
            int r9 = -r4
            r19 = 0
            r20 = 2
            r21 = 0
            r16 = r2
            r18 = r9
            long r11 = androidx.compose.ui.unit.ConstraintsKt.m5587offsetNN6EwU$default(r16, r18, r19, r20, r21)
            androidx.compose.ui.layout.Placeable r9 = r10.m4520measureBRTryo0(r11)
            goto L_0x00a3
        L_0x00a2:
            r9 = 0
        L_0x00a3:
            int r10 = androidx.compose.material3.TextFieldImplKt.widthOrZero(r9)
            int r4 = r4 + r10
            int r10 = androidx.compose.material3.TextFieldImplKt.heightOrZero(r9)
            int r5 = java.lang.Math.max(r5, r10)
            java.util.Iterator r10 = r0.iterator()
        L_0x00b4:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x00ce
            java.lang.Object r11 = r10.next()
            r12 = r11
            androidx.compose.ui.layout.Measurable r12 = (androidx.compose.ui.layout.Measurable) r12
            java.lang.Object r12 = androidx.compose.ui.layout.LayoutIdKt.getLayoutId(r12)
            java.lang.String r6 = "Prefix"
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r12, (java.lang.Object) r6)
            if (r6 == 0) goto L_0x00b4
            goto L_0x00cf
        L_0x00ce:
            r11 = 0
        L_0x00cf:
            androidx.compose.ui.layout.Measurable r11 = (androidx.compose.ui.layout.Measurable) r11
            if (r11 == 0) goto L_0x00e8
            int r6 = -r4
            r19 = 0
            r20 = 2
            r21 = 0
            r16 = r2
            r18 = r6
            r10 = r9
            long r8 = androidx.compose.ui.unit.ConstraintsKt.m5587offsetNN6EwU$default(r16, r18, r19, r20, r21)
            androidx.compose.ui.layout.Placeable r8 = r11.m4520measureBRTryo0(r8)
            goto L_0x00ea
        L_0x00e8:
            r10 = r9
            r8 = 0
        L_0x00ea:
            int r9 = androidx.compose.material3.TextFieldImplKt.widthOrZero(r8)
            int r4 = r4 + r9
            int r9 = androidx.compose.material3.TextFieldImplKt.heightOrZero(r8)
            int r5 = java.lang.Math.max(r5, r9)
            java.util.Iterator r9 = r0.iterator()
        L_0x00fb:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x0115
            java.lang.Object r11 = r9.next()
            r12 = r11
            androidx.compose.ui.layout.Measurable r12 = (androidx.compose.ui.layout.Measurable) r12
            java.lang.Object r12 = androidx.compose.ui.layout.LayoutIdKt.getLayoutId(r12)
            java.lang.String r6 = "Suffix"
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r12, (java.lang.Object) r6)
            if (r6 == 0) goto L_0x00fb
            goto L_0x0116
        L_0x0115:
            r11 = 0
        L_0x0116:
            androidx.compose.ui.layout.Measurable r11 = (androidx.compose.ui.layout.Measurable) r11
            if (r11 == 0) goto L_0x012f
            int r6 = -r4
            r19 = 0
            r20 = 2
            r21 = 0
            r16 = r2
            r18 = r6
            long r14 = androidx.compose.ui.unit.ConstraintsKt.m5587offsetNN6EwU$default(r16, r18, r19, r20, r21)
            androidx.compose.ui.layout.Placeable r6 = r11.m4520measureBRTryo0(r14)
            r9 = r6
            goto L_0x0130
        L_0x012f:
            r9 = 0
        L_0x0130:
            int r6 = androidx.compose.material3.TextFieldImplKt.widthOrZero(r9)
            int r4 = r4 + r6
            int r6 = androidx.compose.material3.TextFieldImplKt.heightOrZero(r9)
            int r5 = java.lang.Math.max(r5, r6)
            int r6 = -r1
            int r4 = -r4
            long r11 = androidx.compose.ui.unit.ConstraintsKt.m5586offsetNN6EwU(r2, r4, r6)
            java.util.Iterator r6 = r0.iterator()
        L_0x0147:
            boolean r14 = r6.hasNext()
            if (r14 == 0) goto L_0x0166
            java.lang.Object r14 = r6.next()
            r15 = r14
            androidx.compose.ui.layout.Measurable r15 = (androidx.compose.ui.layout.Measurable) r15
            java.lang.Object r15 = androidx.compose.ui.layout.LayoutIdKt.getLayoutId(r15)
            r16 = r6
            java.lang.String r6 = "Label"
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r15, (java.lang.Object) r6)
            if (r6 == 0) goto L_0x0163
            goto L_0x0167
        L_0x0163:
            r6 = r16
            goto L_0x0147
        L_0x0166:
            r14 = 0
        L_0x0167:
            androidx.compose.ui.layout.Measurable r14 = (androidx.compose.ui.layout.Measurable) r14
            if (r14 == 0) goto L_0x0170
            androidx.compose.ui.layout.Placeable r6 = r14.m4520measureBRTryo0(r11)
            goto L_0x0171
        L_0x0170:
            r6 = 0
        L_0x0171:
            int r11 = androidx.compose.material3.TextFieldImplKt.heightOrZero(r6)
            int r11 = r11 + r13
            int r12 = -r11
            int r12 = r12 - r1
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 11
            r21 = 0
            r14 = r48
            long r14 = androidx.compose.ui.unit.Constraints.m5561copyZbe2FdA$default(r14, r16, r17, r18, r19, r20, r21)
            long r14 = androidx.compose.ui.unit.ConstraintsKt.m5586offsetNN6EwU(r14, r4, r12)
            java.util.Iterator r4 = r0.iterator()
        L_0x0192:
            boolean r12 = r4.hasNext()
            r30 = r13
            java.lang.String r13 = "Collection contains no element matching the predicate."
            if (r12 == 0) goto L_0x0327
            java.lang.Object r12 = r4.next()
            androidx.compose.ui.layout.Measurable r12 = (androidx.compose.ui.layout.Measurable) r12
            r16 = r4
            java.lang.Object r4 = androidx.compose.ui.layout.LayoutIdKt.getLayoutId(r12)
            r31 = r13
            java.lang.String r13 = "TextField"
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r13)
            if (r4 == 0) goto L_0x0321
            androidx.compose.ui.layout.Placeable r4 = r12.m4520measureBRTryo0(r14)
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 14
            r29 = 0
            r22 = r14
            long r12 = androidx.compose.ui.unit.Constraints.m5561copyZbe2FdA$default(r22, r24, r25, r26, r27, r28, r29)
            java.util.Iterator r14 = r0.iterator()
        L_0x01cc:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L_0x01f0
            java.lang.Object r15 = r14.next()
            r16 = r15
            androidx.compose.ui.layout.Measurable r16 = (androidx.compose.ui.layout.Measurable) r16
            r17 = r14
            java.lang.Object r14 = androidx.compose.ui.layout.LayoutIdKt.getLayoutId(r16)
            r16 = r15
            java.lang.String r15 = "Hint"
            boolean r14 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r14, (java.lang.Object) r15)
            if (r14 == 0) goto L_0x01ed
            r15 = r16
            goto L_0x01f1
        L_0x01ed:
            r14 = r17
            goto L_0x01cc
        L_0x01f0:
            r15 = 0
        L_0x01f1:
            androidx.compose.ui.layout.Measurable r15 = (androidx.compose.ui.layout.Measurable) r15
            if (r15 == 0) goto L_0x01fa
            androidx.compose.ui.layout.Placeable r12 = r15.m4520measureBRTryo0(r12)
            goto L_0x01fb
        L_0x01fa:
            r12 = 0
        L_0x01fb:
            int r13 = androidx.compose.material3.TextFieldImplKt.heightOrZero(r4)
            int r14 = androidx.compose.material3.TextFieldImplKt.heightOrZero(r12)
            int r13 = java.lang.Math.max(r13, r14)
            int r13 = r13 + r11
            int r13 = r13 + r1
            int r1 = java.lang.Math.max(r5, r13)
            r18 = 0
            int r1 = -r1
            r20 = 1
            r21 = 0
            r16 = r2
            r19 = r1
            long r22 = androidx.compose.ui.unit.ConstraintsKt.m5587offsetNN6EwU$default(r16, r18, r19, r20, r21)
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 11
            r29 = 0
            long r1 = androidx.compose.ui.unit.Constraints.m5561copyZbe2FdA$default(r22, r24, r25, r26, r27, r28, r29)
            java.util.Iterator r3 = r0.iterator()
        L_0x0230:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x024a
            java.lang.Object r5 = r3.next()
            r11 = r5
            androidx.compose.ui.layout.Measurable r11 = (androidx.compose.ui.layout.Measurable) r11
            java.lang.Object r11 = androidx.compose.ui.layout.LayoutIdKt.getLayoutId(r11)
            java.lang.String r13 = "Supporting"
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r11, (java.lang.Object) r13)
            if (r11 == 0) goto L_0x0230
            goto L_0x024b
        L_0x024a:
            r5 = 0
        L_0x024b:
            androidx.compose.ui.layout.Measurable r5 = (androidx.compose.ui.layout.Measurable) r5
            if (r5 == 0) goto L_0x0255
            androidx.compose.ui.layout.Placeable r1 = r5.m4520measureBRTryo0(r1)
            r11 = r1
            goto L_0x0256
        L_0x0255:
            r11 = 0
        L_0x0256:
            int r1 = androidx.compose.material3.TextFieldImplKt.heightOrZero(r11)
            int r13 = androidx.compose.material3.TextFieldImplKt.widthOrZero(r7)
            int r14 = androidx.compose.material3.TextFieldImplKt.widthOrZero(r10)
            int r15 = androidx.compose.material3.TextFieldImplKt.widthOrZero(r8)
            int r16 = androidx.compose.material3.TextFieldImplKt.widthOrZero(r9)
            int r17 = r4.getWidth()
            int r18 = androidx.compose.material3.TextFieldImplKt.widthOrZero(r6)
            int r19 = androidx.compose.material3.TextFieldImplKt.widthOrZero(r12)
            r20 = r48
            int r15 = androidx.compose.material3.TextFieldKt.m1723calculateWidthyeHjK3Y(r13, r14, r15, r16, r17, r18, r19, r20)
            int r32 = r4.getHeight()
            int r33 = androidx.compose.material3.TextFieldImplKt.heightOrZero(r6)
            int r34 = androidx.compose.material3.TextFieldImplKt.heightOrZero(r7)
            int r35 = androidx.compose.material3.TextFieldImplKt.heightOrZero(r10)
            int r36 = androidx.compose.material3.TextFieldImplKt.heightOrZero(r8)
            int r37 = androidx.compose.material3.TextFieldImplKt.heightOrZero(r9)
            int r38 = androidx.compose.material3.TextFieldImplKt.heightOrZero(r12)
            int r39 = androidx.compose.material3.TextFieldImplKt.heightOrZero(r11)
            r14 = r45
            float r2 = r14.animationProgress
            r3 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x02aa
            r2 = 1
            r40 = r2
            goto L_0x02ac
        L_0x02aa:
            r40 = 0
        L_0x02ac:
            float r43 = r46.getDensity()
            androidx.compose.foundation.layout.PaddingValues r2 = r14.paddingValues
            r41 = r48
            r44 = r2
            int r16 = androidx.compose.material3.TextFieldKt.m1722calculateHeightmKXJcVc(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r43, r44)
            int r1 = r16 - r1
            java.util.Iterator r0 = r0.iterator()
        L_0x02c0:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0319
            java.lang.Object r2 = r0.next()
            androidx.compose.ui.layout.Measurable r2 = (androidx.compose.ui.layout.Measurable) r2
            java.lang.Object r3 = androidx.compose.ui.layout.LayoutIdKt.getLayoutId(r2)
            java.lang.String r5 = "Container"
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r5)
            if (r3 == 0) goto L_0x0316
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r15 == r0) goto L_0x02df
            r3 = r15
            goto L_0x02e0
        L_0x02df:
            r3 = 0
        L_0x02e0:
            if (r1 == r0) goto L_0x02e4
            r0 = r1
            goto L_0x02e5
        L_0x02e4:
            r0 = 0
        L_0x02e5:
            long r0 = androidx.compose.ui.unit.ConstraintsKt.Constraints(r3, r15, r0, r1)
            androidx.compose.ui.layout.Placeable r13 = r2.m4520measureBRTryo0(r0)
            r17 = 0
            androidx.compose.material3.TextFieldMeasurePolicy$measure$1 r18 = new androidx.compose.material3.TextFieldMeasurePolicy$measure$1
            r0 = r18
            r1 = r6
            r2 = r15
            r3 = r16
            r5 = r12
            r6 = r7
            r7 = r10
            r10 = r13
            r12 = r45
            r13 = r30
            r14 = r46
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r4 = r18
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            r5 = 4
            r6 = 0
            r0 = r46
            r1 = r15
            r2 = r16
            r3 = r17
            androidx.compose.ui.layout.MeasureResult r0 = androidx.compose.ui.layout.MeasureScope.layout$default(r0, r1, r2, r3, r4, r5, r6)
            return r0
        L_0x0316:
            r14 = r45
            goto L_0x02c0
        L_0x0319:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r4 = r31
            r0.<init>(r4)
            throw r0
        L_0x0321:
            r4 = r16
            r13 = r30
            goto L_0x0192
        L_0x0327:
            r4 = r13
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldMeasurePolicy.m1724measure3p2s80s(androidx.compose.ui.layout.MeasureScope, java.util.List, long):androidx.compose.ui.layout.MeasureResult");
    }

    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        return intrinsicHeight(intrinsicMeasureScope, list, i, TextFieldMeasurePolicy$maxIntrinsicHeight$1.INSTANCE);
    }

    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        return intrinsicHeight(intrinsicMeasureScope, list, i, TextFieldMeasurePolicy$minIntrinsicHeight$1.INSTANCE);
    }

    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        return intrinsicWidth(list, i, TextFieldMeasurePolicy$maxIntrinsicWidth$1.INSTANCE);
    }

    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        return intrinsicWidth(list, i, TextFieldMeasurePolicy$minIntrinsicWidth$1.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int intrinsicWidth(java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> r12, int r13, kotlin.jvm.functions.Function2<? super androidx.compose.ui.layout.IntrinsicMeasurable, ? super java.lang.Integer, java.lang.Integer> r14) {
        /*
            r11 = this;
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.Iterator r0 = r12.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0171
            java.lang.Object r1 = r0.next()
            r2 = r1
            androidx.compose.ui.layout.IntrinsicMeasurable r2 = (androidx.compose.ui.layout.IntrinsicMeasurable) r2
            java.lang.Object r2 = androidx.compose.material3.TextFieldImplKt.getLayoutId(r2)
            java.lang.String r3 = "TextField"
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r3)
            if (r2 == 0) goto L_0x0006
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            java.lang.Object r0 = r14.invoke(r1, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r5 = r0.intValue()
            java.util.Iterator r0 = r12.iterator()
        L_0x0031:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x004c
            java.lang.Object r1 = r0.next()
            r3 = r1
            androidx.compose.ui.layout.IntrinsicMeasurable r3 = (androidx.compose.ui.layout.IntrinsicMeasurable) r3
            java.lang.Object r3 = androidx.compose.material3.TextFieldImplKt.getLayoutId(r3)
            java.lang.String r4 = "Label"
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r3 == 0) goto L_0x0031
            goto L_0x004d
        L_0x004c:
            r1 = r2
        L_0x004d:
            androidx.compose.ui.layout.IntrinsicMeasurable r1 = (androidx.compose.ui.layout.IntrinsicMeasurable) r1
            r0 = 0
            if (r1 == 0) goto L_0x0062
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
            java.lang.Object r1 = r14.invoke(r1, r3)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r6 = r1
            goto L_0x0063
        L_0x0062:
            r6 = r0
        L_0x0063:
            java.util.Iterator r1 = r12.iterator()
        L_0x0067:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0081
            java.lang.Object r3 = r1.next()
            r4 = r3
            androidx.compose.ui.layout.IntrinsicMeasurable r4 = (androidx.compose.ui.layout.IntrinsicMeasurable) r4
            java.lang.Object r4 = androidx.compose.material3.TextFieldImplKt.getLayoutId(r4)
            java.lang.String r7 = "Trailing"
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r7)
            if (r4 == 0) goto L_0x0067
            goto L_0x0082
        L_0x0081:
            r3 = r2
        L_0x0082:
            androidx.compose.ui.layout.IntrinsicMeasurable r3 = (androidx.compose.ui.layout.IntrinsicMeasurable) r3
            if (r3 == 0) goto L_0x0096
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            java.lang.Object r1 = r14.invoke(r3, r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r3 = r1
            goto L_0x0097
        L_0x0096:
            r3 = r0
        L_0x0097:
            java.util.Iterator r1 = r12.iterator()
        L_0x009b:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x00b5
            java.lang.Object r4 = r1.next()
            r7 = r4
            androidx.compose.ui.layout.IntrinsicMeasurable r7 = (androidx.compose.ui.layout.IntrinsicMeasurable) r7
            java.lang.Object r7 = androidx.compose.material3.TextFieldImplKt.getLayoutId(r7)
            java.lang.String r8 = "Prefix"
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)
            if (r7 == 0) goto L_0x009b
            goto L_0x00b6
        L_0x00b5:
            r4 = r2
        L_0x00b6:
            androidx.compose.ui.layout.IntrinsicMeasurable r4 = (androidx.compose.ui.layout.IntrinsicMeasurable) r4
            if (r4 == 0) goto L_0x00ca
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            java.lang.Object r1 = r14.invoke(r4, r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r4 = r1
            goto L_0x00cb
        L_0x00ca:
            r4 = r0
        L_0x00cb:
            java.util.Iterator r1 = r12.iterator()
        L_0x00cf:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x00e9
            java.lang.Object r7 = r1.next()
            r8 = r7
            androidx.compose.ui.layout.IntrinsicMeasurable r8 = (androidx.compose.ui.layout.IntrinsicMeasurable) r8
            java.lang.Object r8 = androidx.compose.material3.TextFieldImplKt.getLayoutId(r8)
            java.lang.String r9 = "Suffix"
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r9)
            if (r8 == 0) goto L_0x00cf
            goto L_0x00ea
        L_0x00e9:
            r7 = r2
        L_0x00ea:
            androidx.compose.ui.layout.IntrinsicMeasurable r7 = (androidx.compose.ui.layout.IntrinsicMeasurable) r7
            if (r7 == 0) goto L_0x00fe
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            java.lang.Object r1 = r14.invoke(r7, r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r7 = r1
            goto L_0x00ff
        L_0x00fe:
            r7 = r0
        L_0x00ff:
            java.util.Iterator r1 = r12.iterator()
        L_0x0103:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto L_0x011d
            java.lang.Object r8 = r1.next()
            r9 = r8
            androidx.compose.ui.layout.IntrinsicMeasurable r9 = (androidx.compose.ui.layout.IntrinsicMeasurable) r9
            java.lang.Object r9 = androidx.compose.material3.TextFieldImplKt.getLayoutId(r9)
            java.lang.String r10 = "Leading"
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r9 == 0) goto L_0x0103
            goto L_0x011e
        L_0x011d:
            r8 = r2
        L_0x011e:
            androidx.compose.ui.layout.IntrinsicMeasurable r8 = (androidx.compose.ui.layout.IntrinsicMeasurable) r8
            if (r8 == 0) goto L_0x0131
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            java.lang.Object r1 = r14.invoke(r8, r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            goto L_0x0132
        L_0x0131:
            r1 = r0
        L_0x0132:
            java.util.Iterator r12 = r12.iterator()
        L_0x0136:
            boolean r8 = r12.hasNext()
            if (r8 == 0) goto L_0x0150
            java.lang.Object r8 = r12.next()
            r9 = r8
            androidx.compose.ui.layout.IntrinsicMeasurable r9 = (androidx.compose.ui.layout.IntrinsicMeasurable) r9
            java.lang.Object r9 = androidx.compose.material3.TextFieldImplKt.getLayoutId(r9)
            java.lang.String r10 = "Hint"
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r9 == 0) goto L_0x0136
            r2 = r8
        L_0x0150:
            androidx.compose.ui.layout.IntrinsicMeasurable r2 = (androidx.compose.ui.layout.IntrinsicMeasurable) r2
            if (r2 == 0) goto L_0x0163
            java.lang.Integer r12 = java.lang.Integer.valueOf(r13)
            java.lang.Object r12 = r14.invoke(r2, r12)
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            goto L_0x0164
        L_0x0163:
            r12 = r0
        L_0x0164:
            long r8 = androidx.compose.material3.TextFieldImplKt.getZeroConstraints()
            r2 = r3
            r3 = r4
            r4 = r7
            r7 = r12
            int r12 = androidx.compose.material3.TextFieldKt.m1723calculateWidthyeHjK3Y(r1, r2, r3, r4, r5, r6, r7, r8)
            return r12
        L_0x0171:
            java.util.NoSuchElementException r12 = new java.util.NoSuchElementException
            java.lang.String r13 = "Collection contains no element matching the predicate."
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldMeasurePolicy.intrinsicWidth(java.util.List, int, kotlin.jvm.functions.Function2):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int intrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope r18, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> r19, int r20, kotlin.jvm.functions.Function2<? super androidx.compose.ui.layout.IntrinsicMeasurable, ? super java.lang.Integer, java.lang.Integer> r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r21
            r2 = r19
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r3 = r2.iterator()
        L_0x000c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x01bb
            java.lang.Object r4 = r3.next()
            r5 = r4
            androidx.compose.ui.layout.IntrinsicMeasurable r5 = (androidx.compose.ui.layout.IntrinsicMeasurable) r5
            java.lang.Object r5 = androidx.compose.material3.TextFieldImplKt.getLayoutId(r5)
            java.lang.String r6 = "TextField"
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            if (r5 == 0) goto L_0x000c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r20)
            java.lang.Object r3 = r1.invoke(r4, r3)
            java.lang.Number r3 = (java.lang.Number) r3
            int r4 = r3.intValue()
            java.util.Iterator r3 = r2.iterator()
        L_0x0037:
            boolean r5 = r3.hasNext()
            r6 = 0
            if (r5 == 0) goto L_0x0052
            java.lang.Object r5 = r3.next()
            r7 = r5
            androidx.compose.ui.layout.IntrinsicMeasurable r7 = (androidx.compose.ui.layout.IntrinsicMeasurable) r7
            java.lang.Object r7 = androidx.compose.material3.TextFieldImplKt.getLayoutId(r7)
            java.lang.String r8 = "Label"
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)
            if (r7 == 0) goto L_0x0037
            goto L_0x0053
        L_0x0052:
            r5 = r6
        L_0x0053:
            androidx.compose.ui.layout.IntrinsicMeasurable r5 = (androidx.compose.ui.layout.IntrinsicMeasurable) r5
            r3 = 0
            if (r5 == 0) goto L_0x0067
            java.lang.Integer r7 = java.lang.Integer.valueOf(r20)
            java.lang.Object r5 = r1.invoke(r5, r7)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            goto L_0x0068
        L_0x0067:
            r5 = r3
        L_0x0068:
            java.util.Iterator r7 = r2.iterator()
        L_0x006c:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0086
            java.lang.Object r8 = r7.next()
            r9 = r8
            androidx.compose.ui.layout.IntrinsicMeasurable r9 = (androidx.compose.ui.layout.IntrinsicMeasurable) r9
            java.lang.Object r9 = androidx.compose.material3.TextFieldImplKt.getLayoutId(r9)
            java.lang.String r10 = "Trailing"
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r9 == 0) goto L_0x006c
            goto L_0x0087
        L_0x0086:
            r8 = r6
        L_0x0087:
            androidx.compose.ui.layout.IntrinsicMeasurable r8 = (androidx.compose.ui.layout.IntrinsicMeasurable) r8
            if (r8 == 0) goto L_0x009a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r20)
            java.lang.Object r7 = r1.invoke(r8, r7)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            goto L_0x009b
        L_0x009a:
            r7 = r3
        L_0x009b:
            java.util.Iterator r8 = r2.iterator()
        L_0x009f:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00b9
            java.lang.Object r9 = r8.next()
            r10 = r9
            androidx.compose.ui.layout.IntrinsicMeasurable r10 = (androidx.compose.ui.layout.IntrinsicMeasurable) r10
            java.lang.Object r10 = androidx.compose.material3.TextFieldImplKt.getLayoutId(r10)
            java.lang.String r11 = "Leading"
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r10, (java.lang.Object) r11)
            if (r10 == 0) goto L_0x009f
            goto L_0x00ba
        L_0x00b9:
            r9 = r6
        L_0x00ba:
            androidx.compose.ui.layout.IntrinsicMeasurable r9 = (androidx.compose.ui.layout.IntrinsicMeasurable) r9
            if (r9 == 0) goto L_0x00cd
            java.lang.Integer r8 = java.lang.Integer.valueOf(r20)
            java.lang.Object r8 = r1.invoke(r9, r8)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            goto L_0x00ce
        L_0x00cd:
            r8 = r3
        L_0x00ce:
            java.util.Iterator r9 = r2.iterator()
        L_0x00d2:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x00ec
            java.lang.Object r10 = r9.next()
            r11 = r10
            androidx.compose.ui.layout.IntrinsicMeasurable r11 = (androidx.compose.ui.layout.IntrinsicMeasurable) r11
            java.lang.Object r11 = androidx.compose.material3.TextFieldImplKt.getLayoutId(r11)
            java.lang.String r12 = "Prefix"
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r11, (java.lang.Object) r12)
            if (r11 == 0) goto L_0x00d2
            goto L_0x00ed
        L_0x00ec:
            r10 = r6
        L_0x00ed:
            androidx.compose.ui.layout.IntrinsicMeasurable r10 = (androidx.compose.ui.layout.IntrinsicMeasurable) r10
            if (r10 == 0) goto L_0x0100
            java.lang.Integer r9 = java.lang.Integer.valueOf(r20)
            java.lang.Object r9 = r1.invoke(r10, r9)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            goto L_0x0101
        L_0x0100:
            r9 = r3
        L_0x0101:
            java.util.Iterator r10 = r2.iterator()
        L_0x0105:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x011f
            java.lang.Object r11 = r10.next()
            r12 = r11
            androidx.compose.ui.layout.IntrinsicMeasurable r12 = (androidx.compose.ui.layout.IntrinsicMeasurable) r12
            java.lang.Object r12 = androidx.compose.material3.TextFieldImplKt.getLayoutId(r12)
            java.lang.String r13 = "Suffix"
            boolean r12 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r12, (java.lang.Object) r13)
            if (r12 == 0) goto L_0x0105
            goto L_0x0120
        L_0x011f:
            r11 = r6
        L_0x0120:
            androidx.compose.ui.layout.IntrinsicMeasurable r11 = (androidx.compose.ui.layout.IntrinsicMeasurable) r11
            if (r11 == 0) goto L_0x0133
            java.lang.Integer r10 = java.lang.Integer.valueOf(r20)
            java.lang.Object r10 = r1.invoke(r11, r10)
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            goto L_0x0134
        L_0x0133:
            r10 = r3
        L_0x0134:
            java.util.Iterator r11 = r2.iterator()
        L_0x0138:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0152
            java.lang.Object r12 = r11.next()
            r13 = r12
            androidx.compose.ui.layout.IntrinsicMeasurable r13 = (androidx.compose.ui.layout.IntrinsicMeasurable) r13
            java.lang.Object r13 = androidx.compose.material3.TextFieldImplKt.getLayoutId(r13)
            java.lang.String r14 = "Hint"
            boolean r13 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r14)
            if (r13 == 0) goto L_0x0138
            goto L_0x0153
        L_0x0152:
            r12 = r6
        L_0x0153:
            androidx.compose.ui.layout.IntrinsicMeasurable r12 = (androidx.compose.ui.layout.IntrinsicMeasurable) r12
            if (r12 == 0) goto L_0x0166
            java.lang.Integer r11 = java.lang.Integer.valueOf(r20)
            java.lang.Object r11 = r1.invoke(r12, r11)
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            goto L_0x0167
        L_0x0166:
            r11 = r3
        L_0x0167:
            java.util.Iterator r2 = r2.iterator()
        L_0x016b:
            boolean r12 = r2.hasNext()
            if (r12 == 0) goto L_0x0185
            java.lang.Object r12 = r2.next()
            r13 = r12
            androidx.compose.ui.layout.IntrinsicMeasurable r13 = (androidx.compose.ui.layout.IntrinsicMeasurable) r13
            java.lang.Object r13 = androidx.compose.material3.TextFieldImplKt.getLayoutId(r13)
            java.lang.String r14 = "Supporting"
            boolean r13 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r14)
            if (r13 == 0) goto L_0x016b
            r6 = r12
        L_0x0185:
            androidx.compose.ui.layout.IntrinsicMeasurable r6 = (androidx.compose.ui.layout.IntrinsicMeasurable) r6
            if (r6 == 0) goto L_0x0198
            java.lang.Integer r2 = java.lang.Integer.valueOf(r20)
            java.lang.Object r1 = r1.invoke(r6, r2)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            goto L_0x0199
        L_0x0198:
            r1 = r3
        L_0x0199:
            float r2 = r0.animationProgress
            r6 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x01a4
            r2 = 1
            r12 = r2
            goto L_0x01a5
        L_0x01a4:
            r12 = r3
        L_0x01a5:
            long r13 = androidx.compose.material3.TextFieldImplKt.getZeroConstraints()
            float r15 = r18.getDensity()
            androidx.compose.foundation.layout.PaddingValues r2 = r0.paddingValues
            r6 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r1
            r16 = r2
            int r1 = androidx.compose.material3.TextFieldKt.m1722calculateHeightmKXJcVc(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r16)
            return r1
        L_0x01bb:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r2 = "Collection contains no element matching the predicate."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldMeasurePolicy.intrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope, java.util.List, int, kotlin.jvm.functions.Function2):int");
    }
}
