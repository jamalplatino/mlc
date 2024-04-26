package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0001\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0002\b\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t¢\u0006\u0002\b\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00070\u0017¢\u0006\u0002\b\u000b¢\u0006\u0002\b\u0019H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"DialogButtonsCrossAxisSpacing", "Landroidx/compose/ui/unit/Dp;", "F", "DialogButtonsMainAxisSpacing", "DialogButtonsPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "DatePickerDialog", "", "onDismissRequest", "Lkotlin/Function0;", "confirmButton", "Landroidx/compose/runtime/Composable;", "modifier", "Landroidx/compose/ui/Modifier;", "dismissButton", "shape", "Landroidx/compose/ui/graphics/Shape;", "tonalElevation", "colors", "Landroidx/compose/material3/DatePickerColors;", "properties", "Landroidx/compose/ui/window/DialogProperties;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "DatePickerDialog-GmEhDVc", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;FLandroidx/compose/material3/DatePickerColors;Landroidx/compose/ui/window/DialogProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: DatePickerDialog.android.kt */
public final class DatePickerDialog_androidKt {
    /* access modifiers changed from: private */
    public static final float DialogButtonsCrossAxisSpacing = Dp.m5626constructorimpl((float) 12);
    /* access modifiers changed from: private */
    public static final float DialogButtonsMainAxisSpacing;
    /* access modifiers changed from: private */
    public static final PaddingValues DialogButtonsPadding;

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0110  */
    /* renamed from: DatePickerDialog-GmEhDVc  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1289DatePickerDialogGmEhDVc(kotlin.jvm.functions.Function0<kotlin.Unit> r54, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r55, androidx.compose.ui.Modifier r56, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r57, androidx.compose.ui.graphics.Shape r58, float r59, androidx.compose.material3.DatePickerColors r60, androidx.compose.ui.window.DialogProperties r61, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r62, androidx.compose.runtime.Composer r63, int r64, int r65) {
        /*
            r7 = r54
            r6 = r55
            r5 = r62
            r4 = r64
            r3 = r65
            java.lang.String r0 = "onDismissRequest"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "confirmButton"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = -36517340(0xfffffffffdd2ca24, float:-3.5023432E37)
            r1 = r63
            androidx.compose.runtime.Composer r2 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(DatePickerDialog)P(5,1,4,3,7,8:c#ui.unit.Dp!1,6)69@3485L5,71@3602L8,75@3754L1602:DatePickerDialog.android.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r1)
            r1 = r3 & 1
            if (r1 == 0) goto L_0x0031
            r1 = r4 | 6
            goto L_0x0041
        L_0x0031:
            r1 = r4 & 14
            if (r1 != 0) goto L_0x0040
            boolean r1 = r2.changedInstance(r7)
            if (r1 == 0) goto L_0x003d
            r1 = 4
            goto L_0x003e
        L_0x003d:
            r1 = 2
        L_0x003e:
            r1 = r1 | r4
            goto L_0x0041
        L_0x0040:
            r1 = r4
        L_0x0041:
            r8 = r3 & 2
            if (r8 == 0) goto L_0x0048
            r1 = r1 | 48
            goto L_0x0058
        L_0x0048:
            r8 = r4 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x0058
            boolean r8 = r2.changedInstance(r6)
            if (r8 == 0) goto L_0x0055
            r8 = 32
            goto L_0x0057
        L_0x0055:
            r8 = 16
        L_0x0057:
            r1 = r1 | r8
        L_0x0058:
            r8 = r3 & 4
            if (r8 == 0) goto L_0x005f
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0072
        L_0x005f:
            r9 = r4 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x0072
            r9 = r56
            boolean r10 = r2.changed((java.lang.Object) r9)
            if (r10 == 0) goto L_0x006e
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0070
        L_0x006e:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0070:
            r1 = r1 | r10
            goto L_0x0074
        L_0x0072:
            r9 = r56
        L_0x0074:
            r10 = r3 & 8
            if (r10 == 0) goto L_0x007b
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x008e
        L_0x007b:
            r11 = r4 & 7168(0x1c00, float:1.0045E-41)
            if (r11 != 0) goto L_0x008e
            r11 = r57
            boolean r12 = r2.changedInstance(r11)
            if (r12 == 0) goto L_0x008a
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x008c
        L_0x008a:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x008c:
            r1 = r1 | r12
            goto L_0x0090
        L_0x008e:
            r11 = r57
        L_0x0090:
            r12 = 57344(0xe000, float:8.0356E-41)
            r12 = r12 & r4
            if (r12 != 0) goto L_0x00ab
            r12 = r3 & 16
            if (r12 != 0) goto L_0x00a5
            r12 = r58
            boolean r13 = r2.changed((java.lang.Object) r12)
            if (r13 == 0) goto L_0x00a7
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a9
        L_0x00a5:
            r12 = r58
        L_0x00a7:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x00a9:
            r1 = r1 | r13
            goto L_0x00ad
        L_0x00ab:
            r12 = r58
        L_0x00ad:
            r13 = r3 & 32
            if (r13 == 0) goto L_0x00b5
            r14 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r14
            goto L_0x00c9
        L_0x00b5:
            r14 = 458752(0x70000, float:6.42848E-40)
            r14 = r14 & r4
            if (r14 != 0) goto L_0x00c9
            r14 = r59
            boolean r15 = r2.changed((float) r14)
            if (r15 == 0) goto L_0x00c5
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c7
        L_0x00c5:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00c7:
            r1 = r1 | r15
            goto L_0x00cb
        L_0x00c9:
            r14 = r59
        L_0x00cb:
            r15 = 3670016(0x380000, float:5.142788E-39)
            r15 = r15 & r4
            if (r15 != 0) goto L_0x00e6
            r15 = r3 & 64
            if (r15 != 0) goto L_0x00df
            r15 = r60
            boolean r16 = r2.changed((java.lang.Object) r15)
            if (r16 == 0) goto L_0x00e1
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e3
        L_0x00df:
            r15 = r60
        L_0x00e1:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00e3:
            r1 = r1 | r16
            goto L_0x00e8
        L_0x00e6:
            r15 = r60
        L_0x00e8:
            r0 = r3 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00f3
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r16
            r15 = r61
            goto L_0x0108
        L_0x00f3:
            r16 = 29360128(0x1c00000, float:7.052966E-38)
            r16 = r4 & r16
            r15 = r61
            if (r16 != 0) goto L_0x0108
            boolean r16 = r2.changed((java.lang.Object) r15)
            if (r16 == 0) goto L_0x0104
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0106
        L_0x0104:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x0106:
            r1 = r1 | r16
        L_0x0108:
            r6 = r3 & 256(0x100, float:3.59E-43)
            if (r6 == 0) goto L_0x0110
            r6 = 100663296(0x6000000, float:2.4074124E-35)
        L_0x010e:
            r1 = r1 | r6
            goto L_0x0121
        L_0x0110:
            r6 = 234881024(0xe000000, float:1.5777218E-30)
            r6 = r6 & r4
            if (r6 != 0) goto L_0x0121
            boolean r6 = r2.changedInstance(r5)
            if (r6 == 0) goto L_0x011e
            r6 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010e
        L_0x011e:
            r6 = 33554432(0x2000000, float:9.403955E-38)
            goto L_0x010e
        L_0x0121:
            r6 = 191739611(0xb6db6db, float:4.5782105E-32)
            r6 = r6 & r1
            r5 = 38347922(0x2492492, float:1.4777643E-37)
            if (r6 != r5) goto L_0x013e
            boolean r5 = r2.getSkipping()
            if (r5 != 0) goto L_0x0131
            goto L_0x013e
        L_0x0131:
            r2.skipToGroupEnd()
            r17 = r60
            r3 = r9
            r4 = r11
            r5 = r12
            r6 = r14
            r8 = r15
            r11 = r2
            goto L_0x0260
        L_0x013e:
            r2.startDefaults()
            r5 = r4 & 1
            r6 = -3670017(0xffffffffffc7ffff, float:NaN)
            r16 = -57345(0xffffffffffff1fff, float:NaN)
            r15 = 0
            if (r5 == 0) goto L_0x016e
            boolean r5 = r2.getDefaultsInvalid()
            if (r5 == 0) goto L_0x0153
            goto L_0x016e
        L_0x0153:
            r2.skipToGroupEnd()
            r0 = r3 & 16
            if (r0 == 0) goto L_0x015c
            r1 = r1 & r16
        L_0x015c:
            r0 = r3 & 64
            if (r0 == 0) goto L_0x0161
            r1 = r1 & r6
        L_0x0161:
            r17 = r60
            r18 = r61
            r6 = r9
            r51 = r11
            r16 = r12
            r53 = r14
            goto L_0x01fd
        L_0x016e:
            if (r8 == 0) goto L_0x0175
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r5 = (androidx.compose.ui.Modifier) r5
            goto L_0x0176
        L_0x0175:
            r5 = r9
        L_0x0176:
            if (r10 == 0) goto L_0x017b
            r51 = r15
            goto L_0x017d
        L_0x017b:
            r51 = r11
        L_0x017d:
            r8 = r3 & 16
            if (r8 == 0) goto L_0x018e
            androidx.compose.material3.DatePickerDefaults r8 = androidx.compose.material3.DatePickerDefaults.INSTANCE
            r9 = 6
            androidx.compose.ui.graphics.Shape r8 = r8.getShape(r2, r9)
            r1 = r1 & r16
            r52 = r1
            r1 = r8
            goto L_0x0191
        L_0x018e:
            r52 = r1
            r1 = r12
        L_0x0191:
            if (r13 == 0) goto L_0x019c
            androidx.compose.material3.DatePickerDefaults r8 = androidx.compose.material3.DatePickerDefaults.INSTANCE
            float r8 = r8.m1288getTonalElevationD9Ej5fM()
            r53 = r8
            goto L_0x019e
        L_0x019c:
            r53 = r14
        L_0x019e:
            r8 = r3 & 64
            if (r8 == 0) goto L_0x01de
            androidx.compose.material3.DatePickerDefaults r8 = androidx.compose.material3.DatePickerDefaults.INSTANCE
            r9 = 0
            r11 = 0
            r13 = 0
            r16 = 0
            r15 = r16
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r33 = 0
            r35 = 0
            r37 = 0
            r39 = 0
            r41 = 0
            r43 = 0
            r45 = 0
            r48 = 0
            r49 = 805306368(0x30000000, float:4.656613E-10)
            r50 = 524287(0x7ffff, float:7.34683E-40)
            r47 = r2
            androidx.compose.material3.DatePickerColors r8 = r8.m1287colors1m2CgY(r9, r11, r13, r15, r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r48, r49, r50)
            r6 = r52 & r6
            r52 = r6
            goto L_0x01e0
        L_0x01de:
            r8 = r60
        L_0x01e0:
            if (r0 == 0) goto L_0x01f4
            androidx.compose.ui.window.DialogProperties r0 = new androidx.compose.ui.window.DialogProperties
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 23
            r16 = 0
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r18 = r0
            goto L_0x01f6
        L_0x01f4:
            r18 = r61
        L_0x01f6:
            r16 = r1
            r6 = r5
            r17 = r8
            r1 = r52
        L_0x01fd:
            r2.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0210
            r0 = -1
            java.lang.String r5 = "androidx.compose.material3.DatePickerDialog (DatePickerDialog.android.kt:64)"
            r8 = -36517340(0xfffffffffdd2ca24, float:-3.5023432E37)
            androidx.compose.runtime.ComposerKt.traceEventStart(r8, r1, r0, r5)
        L_0x0210:
            r0 = 0
            r5 = 3
            r8 = 0
            androidx.compose.ui.Modifier r5 = androidx.compose.foundation.layout.SizeKt.wrapContentHeight$default(r6, r8, r0, r5, r8)
            androidx.compose.material3.DatePickerDialog_androidKt$DatePickerDialog$1 r0 = new androidx.compose.material3.DatePickerDialog_androidKt$DatePickerDialog$1
            r8 = r0
            r9 = r16
            r10 = r17
            r11 = r53
            r12 = r1
            r13 = r62
            r14 = r51
            r15 = r55
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r8 = -476003174(0xffffffffe3a0c49a, float:-5.9312914E21)
            r9 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r2, r8, r9, r0)
            r8 = r0
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            r0 = r1 & 14
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            int r1 = r1 >> 15
            r1 = r1 & 896(0x380, float:1.256E-42)
            r9 = r0 | r1
            r10 = 0
            r0 = r54
            r1 = r5
            r11 = r2
            r2 = r18
            r3 = r8
            r4 = r11
            r5 = r9
            r9 = r6
            r6 = r10
            androidx.compose.material3.AndroidAlertDialog_androidKt.AlertDialog(r0, r1, r2, r3, r4, r5, r6)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0257
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0257:
            r3 = r9
            r5 = r16
            r8 = r18
            r4 = r51
            r6 = r53
        L_0x0260:
            androidx.compose.runtime.ScopeUpdateScope r12 = r11.endRestartGroup()
            if (r12 != 0) goto L_0x0267
            goto L_0x027e
        L_0x0267:
            androidx.compose.material3.DatePickerDialog_androidKt$DatePickerDialog$2 r13 = new androidx.compose.material3.DatePickerDialog_androidKt$DatePickerDialog$2
            r0 = r13
            r1 = r54
            r2 = r55
            r7 = r17
            r9 = r62
            r10 = r64
            r11 = r65
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            kotlin.jvm.functions.Function2 r13 = (kotlin.jvm.functions.Function2) r13
            r12.updateScope(r13)
        L_0x027e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerDialog_androidKt.m1289DatePickerDialogGmEhDVc(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, androidx.compose.ui.graphics.Shape, float, androidx.compose.material3.DatePickerColors, androidx.compose.ui.window.DialogProperties, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    static {
        float f = (float) 8;
        DialogButtonsPadding = PaddingKt.m490PaddingValuesa9UjIt4$default(0.0f, 0.0f, Dp.m5626constructorimpl((float) 6), Dp.m5626constructorimpl(f), 3, (Object) null);
        DialogButtonsMainAxisSpacing = Dp.m5626constructorimpl(f);
    }
}
