package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a©\u0001\u0010\f\u001a\u00020\r2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\r0\u000f¢\u0006\u0002\b\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u0013\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000f¢\u0006\u0002\b\u00102\u0013\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000f¢\u0006\u0002\b\u00102\u0013\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000f¢\u0006\u0002\b\u00102\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u0019H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a8\u0010!\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u00012\u0011\u0010$\u001a\r\u0012\u0004\u0012\u00020\r0\u000f¢\u0006\u0002\b\u0010H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b%\u0010&\"\u0019\u0010\u0000\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\"\u0019\u0010\u0005\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0006\u0010\u0003\"\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006'"}, d2 = {"DialogMaxWidth", "Landroidx/compose/ui/unit/Dp;", "getDialogMaxWidth", "()F", "F", "DialogMinWidth", "getDialogMinWidth", "DialogPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "IconPadding", "TextPadding", "TitlePadding", "AlertDialogContent", "", "buttons", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "modifier", "Landroidx/compose/ui/Modifier;", "icon", "title", "text", "shape", "Landroidx/compose/ui/graphics/Shape;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "tonalElevation", "buttonContentColor", "iconContentColor", "titleContentColor", "textContentColor", "AlertDialogContent-4hvqGtA", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JFJJJJLandroidx/compose/runtime/Composer;III)V", "AlertDialogFlowRow", "mainAxisSpacing", "crossAxisSpacing", "content", "AlertDialogFlowRow-ixp7dh8", "(FFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: AlertDialog.kt */
public final class AlertDialogKt {
    private static final float DialogMaxWidth = Dp.m5626constructorimpl((float) 560);
    private static final float DialogMinWidth = Dp.m5626constructorimpl((float) 280);
    /* access modifiers changed from: private */
    public static final PaddingValues DialogPadding;
    /* access modifiers changed from: private */
    public static final PaddingValues IconPadding;
    /* access modifiers changed from: private */
    public static final PaddingValues TextPadding;
    /* access modifiers changed from: private */
    public static final PaddingValues TitlePadding;

    public static final float getDialogMaxWidth() {
        return DialogMaxWidth;
    }

    public static final float getDialogMinWidth() {
        return DialogMinWidth;
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0137  */
    /* renamed from: AlertDialogContent-4hvqGtA  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1114AlertDialogContent4hvqGtA(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r25, androidx.compose.ui.Modifier r26, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r27, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r28, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r29, androidx.compose.ui.graphics.Shape r30, long r31, float r33, long r34, long r36, long r38, long r40, androidx.compose.runtime.Composer r42, int r43, int r44, int r45) {
        /*
            r14 = r25
            r15 = r30
            r13 = r43
            r11 = r45
            java.lang.String r0 = "buttons"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "shape"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            r0 = 1522575799(0x5ac0a9b7, float:2.71148995E16)
            r1 = r42
            androidx.compose.runtime.Composer r12 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(AlertDialogContent)P(1,5,3,9,7,6,2:c#ui.graphics.Color,11:c#ui.unit.Dp,0:c#ui.graphics.Color,4:c#ui.graphics.Color,10:c#ui.graphics.Color,8:c#ui.graphics.Color)51@1823L2647:AlertDialog.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r12, r1)
            r1 = r11 & 1
            if (r1 == 0) goto L_0x0029
            r1 = r13 | 6
            goto L_0x0039
        L_0x0029:
            r1 = r13 & 14
            if (r1 != 0) goto L_0x0038
            boolean r1 = r12.changedInstance(r14)
            if (r1 == 0) goto L_0x0035
            r1 = 4
            goto L_0x0036
        L_0x0035:
            r1 = 2
        L_0x0036:
            r1 = r1 | r13
            goto L_0x0039
        L_0x0038:
            r1 = r13
        L_0x0039:
            r4 = r11 & 2
            if (r4 == 0) goto L_0x0040
            r1 = r1 | 48
            goto L_0x0053
        L_0x0040:
            r7 = r13 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x0053
            r7 = r26
            boolean r8 = r12.changed((java.lang.Object) r7)
            if (r8 == 0) goto L_0x004f
            r8 = 32
            goto L_0x0051
        L_0x004f:
            r8 = 16
        L_0x0051:
            r1 = r1 | r8
            goto L_0x0055
        L_0x0053:
            r7 = r26
        L_0x0055:
            r8 = r11 & 4
            if (r8 == 0) goto L_0x005e
            r1 = r1 | 384(0x180, float:5.38E-43)
            r9 = r27
            goto L_0x0070
        L_0x005e:
            r8 = r13 & 896(0x380, float:1.256E-42)
            r9 = r27
            if (r8 != 0) goto L_0x0070
            boolean r8 = r12.changedInstance(r9)
            if (r8 == 0) goto L_0x006d
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x006f
        L_0x006d:
            r8 = 128(0x80, float:1.794E-43)
        L_0x006f:
            r1 = r1 | r8
        L_0x0070:
            r8 = r11 & 8
            if (r8 == 0) goto L_0x0079
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            r10 = r28
            goto L_0x008b
        L_0x0079:
            r8 = r13 & 7168(0x1c00, float:1.0045E-41)
            r10 = r28
            if (r8 != 0) goto L_0x008b
            boolean r8 = r12.changedInstance(r10)
            if (r8 == 0) goto L_0x0088
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x008a
        L_0x0088:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x008a:
            r1 = r1 | r8
        L_0x008b:
            r8 = r11 & 16
            r16 = 57344(0xe000, float:8.0356E-41)
            if (r8 == 0) goto L_0x0095
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a9
        L_0x0095:
            r8 = r13 & r16
            if (r8 != 0) goto L_0x00a9
            r8 = r29
            boolean r17 = r12.changedInstance(r8)
            if (r17 == 0) goto L_0x00a4
            r17 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a6
        L_0x00a4:
            r17 = 8192(0x2000, float:1.14794E-41)
        L_0x00a6:
            r1 = r1 | r17
            goto L_0x00ab
        L_0x00a9:
            r8 = r29
        L_0x00ab:
            r17 = r11 & 32
            if (r17 == 0) goto L_0x00b4
            r17 = 196608(0x30000, float:2.75506E-40)
        L_0x00b1:
            r1 = r1 | r17
            goto L_0x00c6
        L_0x00b4:
            r17 = 458752(0x70000, float:6.42848E-40)
            r17 = r13 & r17
            if (r17 != 0) goto L_0x00c6
            boolean r17 = r12.changed((java.lang.Object) r15)
            if (r17 == 0) goto L_0x00c3
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b1
        L_0x00c3:
            r17 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00b1
        L_0x00c6:
            r17 = r11 & 64
            if (r17 == 0) goto L_0x00d3
            r17 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r17
            r18 = r1
            r0 = r31
            goto L_0x00ed
        L_0x00d3:
            r17 = 3670016(0x380000, float:5.142788E-39)
            r17 = r13 & r17
            r42 = r1
            r0 = r31
            if (r17 != 0) goto L_0x00eb
            boolean r18 = r12.changed((long) r0)
            if (r18 == 0) goto L_0x00e6
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e8
        L_0x00e6:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x00e8:
            r18 = r42 | r18
            goto L_0x00ed
        L_0x00eb:
            r18 = r42
        L_0x00ed:
            r2 = r11 & 128(0x80, float:1.794E-43)
            r19 = 12582912(0xc00000, float:1.7632415E-38)
            if (r2 == 0) goto L_0x00f6
            r18 = r18 | r19
            goto L_0x010b
        L_0x00f6:
            r2 = 29360128(0x1c00000, float:7.052966E-38)
            r2 = r2 & r13
            if (r2 != 0) goto L_0x010b
            r2 = r33
            boolean r20 = r12.changed((float) r2)
            if (r20 == 0) goto L_0x0106
            r20 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0108
        L_0x0106:
            r20 = 4194304(0x400000, float:5.877472E-39)
        L_0x0108:
            r18 = r18 | r20
            goto L_0x010d
        L_0x010b:
            r2 = r33
        L_0x010d:
            r3 = r11 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x0118
            r3 = 100663296(0x6000000, float:2.4074124E-35)
            r18 = r18 | r3
            r14 = r34
            goto L_0x012c
        L_0x0118:
            r3 = 234881024(0xe000000, float:1.5777218E-30)
            r3 = r3 & r13
            r14 = r34
            if (r3 != 0) goto L_0x012c
            boolean r3 = r12.changed((long) r14)
            if (r3 == 0) goto L_0x0128
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x012a
        L_0x0128:
            r3 = 33554432(0x2000000, float:9.403955E-38)
        L_0x012a:
            r18 = r18 | r3
        L_0x012c:
            r3 = r11 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x0137
            r3 = 805306368(0x30000000, float:4.656613E-10)
            r18 = r18 | r3
            r14 = r36
            goto L_0x014b
        L_0x0137:
            r3 = 1879048192(0x70000000, float:1.58456325E29)
            r3 = r3 & r13
            r14 = r36
            if (r3 != 0) goto L_0x014b
            boolean r3 = r12.changed((long) r14)
            if (r3 == 0) goto L_0x0147
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0149
        L_0x0147:
            r3 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0149:
            r18 = r18 | r3
        L_0x014b:
            r3 = r18
            r5 = r11 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L_0x0156
            r5 = r44 | 6
            r14 = r38
            goto L_0x016c
        L_0x0156:
            r5 = r44 & 14
            r14 = r38
            if (r5 != 0) goto L_0x016a
            boolean r5 = r12.changed((long) r14)
            if (r5 == 0) goto L_0x0165
            r20 = 4
            goto L_0x0167
        L_0x0165:
            r20 = 2
        L_0x0167:
            r5 = r44 | r20
            goto L_0x016c
        L_0x016a:
            r5 = r44
        L_0x016c:
            r6 = r11 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x0175
            r5 = r5 | 48
            r14 = r40
            goto L_0x0188
        L_0x0175:
            r6 = r44 & 112(0x70, float:1.57E-43)
            r14 = r40
            if (r6 != 0) goto L_0x0188
            boolean r6 = r12.changed((long) r14)
            if (r6 == 0) goto L_0x0184
            r18 = 32
            goto L_0x0186
        L_0x0184:
            r18 = 16
        L_0x0186:
            r5 = r5 | r18
        L_0x0188:
            r6 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r6 = r6 & r3
            r0 = 306783378(0x12492492, float:6.3469493E-28)
            if (r6 != r0) goto L_0x01a5
            r0 = r5 & 91
            r1 = 18
            if (r0 != r1) goto L_0x01a5
            boolean r0 = r12.getSkipping()
            if (r0 != 0) goto L_0x019e
            goto L_0x01a5
        L_0x019e:
            r12.skipToGroupEnd()
            r2 = r7
            r15 = r12
            goto L_0x021f
        L_0x01a5:
            if (r4 == 0) goto L_0x01ae
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            r18 = r0
            goto L_0x01b0
        L_0x01ae:
            r18 = r7
        L_0x01b0:
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01bf
            java.lang.String r0 = "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:37)"
            r1 = 1522575799(0x5ac0a9b7, float:2.71148995E16)
            androidx.compose.runtime.ComposerKt.traceEventStart(r1, r3, r5, r0)
        L_0x01bf:
            r20 = 0
            r17 = 0
            r22 = 0
            androidx.compose.material3.AlertDialogKt$AlertDialogContent$1 r7 = new androidx.compose.material3.AlertDialogKt$AlertDialogContent$1
            r0 = r7
            r1 = r27
            r2 = r28
            r23 = r3
            r3 = r29
            r4 = r36
            r6 = r23
            r14 = r7
            r7 = r38
            r9 = r40
            r15 = r12
            r11 = r34
            r13 = r25
            r0.<init>(r1, r2, r3, r4, r6, r7, r9, r11, r13)
            r0 = -2126308228(0xffffffff81431c7c, float:-3.583628E-38)
            r1 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r15, r0, r1, r14)
            r9 = r0
            kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
            int r0 = r23 >> 3
            r0 = r0 & 14
            r0 = r0 | r19
            int r1 = r23 >> 12
            r2 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r1 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            int r1 = r23 >> 9
            r1 = r1 & r16
            r11 = r0 | r1
            r12 = 104(0x68, float:1.46E-43)
            r0 = r18
            r1 = r30
            r2 = r31
            r4 = r20
            r6 = r33
            r7 = r17
            r8 = r22
            r10 = r15
            androidx.compose.material3.SurfaceKt.m1641SurfaceT9BRK9s(r0, r1, r2, r4, r6, r7, r8, r9, r10, r11, r12)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x021d
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x021d:
            r2 = r18
        L_0x021f:
            androidx.compose.runtime.ScopeUpdateScope r14 = r15.endRestartGroup()
            if (r14 != 0) goto L_0x0226
            goto L_0x0254
        L_0x0226:
            androidx.compose.material3.AlertDialogKt$AlertDialogContent$2 r21 = new androidx.compose.material3.AlertDialogKt$AlertDialogContent$2
            r0 = r21
            r1 = r25
            r3 = r27
            r4 = r28
            r5 = r29
            r6 = r30
            r7 = r31
            r9 = r33
            r10 = r34
            r12 = r36
            r24 = r14
            r14 = r38
            r16 = r40
            r18 = r43
            r19 = r44
            r20 = r45
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r10, r12, r14, r16, r18, r19, r20)
            r0 = r21
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1 = r24
            r1.updateScope(r0)
        L_0x0254:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AlertDialogKt.m1114AlertDialogContent4hvqGtA(kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.ui.graphics.Shape, long, float, long, long, long, long, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* renamed from: AlertDialogFlowRow-ixp7dh8  reason: not valid java name */
    public static final void m1115AlertDialogFlowRowixp7dh8(float f, float f2, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(function2, "content");
        Composer startRestartGroup = composer.startRestartGroup(586821353);
        ComposerKt.sourceInformation(startRestartGroup, "C(AlertDialogFlowRow)P(2:c#ui.unit.Dp,1:c#ui.unit.Dp)129@4728L3185:AlertDialog.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(f2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(586821353, i2, -1, "androidx.compose.material3.AlertDialogFlowRow (AlertDialog.kt:124)");
            }
            MeasurePolicy alertDialogKt$AlertDialogFlowRow$1 = new AlertDialogKt$AlertDialogFlowRow$1(f, f2);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)73@2855L7,74@2910L7,75@2969L7,76@2981L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density = (Density) consume;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection = (LayoutDirection) consume2;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume3 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(Modifier.Companion);
            int i3 = ((((i2 >> 6) & 14) << 9) & 7168) | 6;
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer r5 = Updater.m2444constructorimpl(startRestartGroup);
            Updater.m2451setimpl(r5, alertDialogKt$AlertDialogFlowRow$1, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2451setimpl(r5, density, ComposeUiNode.Companion.getSetDensity());
            Updater.m2451setimpl(r5, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2451setimpl(r5, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
            materializerOf.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i3 >> 3) & 112));
            startRestartGroup.startReplaceableGroup(2058660585);
            function2.invoke(startRestartGroup, Integer.valueOf((i3 >> 9) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new AlertDialogKt$AlertDialogFlowRow$2(f, f2, function2, i));
        }
    }

    static {
        float f = (float) 24;
        DialogPadding = PaddingKt.m486PaddingValues0680j_4(Dp.m5626constructorimpl(f));
        float f2 = (float) 16;
        IconPadding = PaddingKt.m490PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m5626constructorimpl(f2), 7, (Object) null);
        TitlePadding = PaddingKt.m490PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m5626constructorimpl(f2), 7, (Object) null);
        TextPadding = PaddingKt.m490PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m5626constructorimpl(f), 7, (Object) null);
    }
}
