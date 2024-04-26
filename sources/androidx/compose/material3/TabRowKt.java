package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.ItemTouchHelper;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00012.\b\u0002\u0010\u0011\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\b0\u0012¢\u0006\u0002\b\u00182\u0013\b\u0002\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\b0\u001a¢\u0006\u0002\b\u00182\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\b0\u001a¢\u0006\u0002\b\u0018H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0001\u0010\u001e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2.\b\u0002\u0010\u0011\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\b0\u0012¢\u0006\u0002\b\u00182\u0013\b\u0002\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\b0\u001a¢\u0006\u0002\b\u00182\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\b0\u001a¢\u0006\u0002\b\u0018H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \"\u0013\u0010\u0000\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"ScrollableTabRowMinimumTabWidth", "Landroidx/compose/ui/unit/Dp;", "F", "ScrollableTabRowPadding", "ScrollableTabRowScrollSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "ScrollableTabRow", "", "selectedTabIndex", "", "modifier", "Landroidx/compose/ui/Modifier;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "edgePadding", "indicator", "Lkotlin/Function1;", "", "Landroidx/compose/material3/TabPosition;", "Lkotlin/ParameterName;", "name", "tabPositions", "Landroidx/compose/runtime/Composable;", "divider", "Lkotlin/Function0;", "tabs", "ScrollableTabRow-sKfQg0A", "(ILandroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "TabRow", "TabRow-pAZo6Ak", "(ILandroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: TabRow.kt */
public final class TabRowKt {
    /* access modifiers changed from: private */
    public static final float ScrollableTabRowMinimumTabWidth = Dp.m5626constructorimpl((float) 90);
    private static final float ScrollableTabRowPadding = Dp.m5626constructorimpl((float) 52);
    /* access modifiers changed from: private */
    public static final AnimationSpec<Float> ScrollableTabRowScrollSpec = AnimationSpecKt.tween$default(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 0, EasingKt.getFastOutSlowInEasing(), 2, (Object) null);

    /* JADX WARNING: Removed duplicated region for block: B:109:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00f2  */
    /* renamed from: TabRow-pAZo6Ak  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1683TabRowpAZo6Ak(int r25, androidx.compose.ui.Modifier r26, long r27, long r29, kotlin.jvm.functions.Function3<? super java.util.List<androidx.compose.material3.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r31, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r32, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r33, androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            r1 = r25
            r9 = r33
            r10 = r35
            java.lang.String r0 = "tabs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = -1199178586(0xffffffffb885fca6, float:-6.388994E-5)
            r2 = r34
            androidx.compose.runtime.Composer r2 = r2.startRestartGroup(r0)
            java.lang.String r3 = "C(TabRow)P(5,4,0:c#ui.graphics.Color,1:c#ui.graphics.Color,3)128@6357L14,129@6414L12,142@6844L1858:TabRow.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r3)
            r3 = r36 & 1
            if (r3 == 0) goto L_0x0021
            r3 = r10 | 6
            goto L_0x0031
        L_0x0021:
            r3 = r10 & 14
            if (r3 != 0) goto L_0x0030
            boolean r3 = r2.changed((int) r1)
            if (r3 == 0) goto L_0x002d
            r3 = 4
            goto L_0x002e
        L_0x002d:
            r3 = 2
        L_0x002e:
            r3 = r3 | r10
            goto L_0x0031
        L_0x0030:
            r3 = r10
        L_0x0031:
            r4 = r36 & 2
            if (r4 == 0) goto L_0x0038
            r3 = r3 | 48
            goto L_0x004b
        L_0x0038:
            r5 = r10 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x004b
            r5 = r26
            boolean r6 = r2.changed((java.lang.Object) r5)
            if (r6 == 0) goto L_0x0047
            r6 = 32
            goto L_0x0049
        L_0x0047:
            r6 = 16
        L_0x0049:
            r3 = r3 | r6
            goto L_0x004d
        L_0x004b:
            r5 = r26
        L_0x004d:
            r6 = r10 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0066
            r6 = r36 & 4
            if (r6 != 0) goto L_0x0060
            r6 = r27
            boolean r8 = r2.changed((long) r6)
            if (r8 == 0) goto L_0x0062
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0060:
            r6 = r27
        L_0x0062:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r3 = r3 | r8
            goto L_0x0068
        L_0x0066:
            r6 = r27
        L_0x0068:
            r8 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x007f
            r8 = r36 & 8
            r11 = r29
            if (r8 != 0) goto L_0x007b
            boolean r8 = r2.changed((long) r11)
            if (r8 == 0) goto L_0x007b
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r3 = r3 | r8
            goto L_0x0081
        L_0x007f:
            r11 = r29
        L_0x0081:
            r8 = r36 & 16
            if (r8 == 0) goto L_0x0088
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009d
        L_0x0088:
            r13 = 57344(0xe000, float:8.0356E-41)
            r13 = r13 & r10
            if (r13 != 0) goto L_0x009d
            r13 = r31
            boolean r14 = r2.changedInstance(r13)
            if (r14 == 0) goto L_0x0099
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009b
        L_0x0099:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x009b:
            r3 = r3 | r14
            goto L_0x009f
        L_0x009d:
            r13 = r31
        L_0x009f:
            r14 = r36 & 32
            if (r14 == 0) goto L_0x00a7
            r15 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r15
            goto L_0x00bc
        L_0x00a7:
            r15 = 458752(0x70000, float:6.42848E-40)
            r15 = r15 & r10
            if (r15 != 0) goto L_0x00bc
            r15 = r32
            boolean r16 = r2.changedInstance(r15)
            if (r16 == 0) goto L_0x00b7
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b9
        L_0x00b7:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b9:
            r3 = r3 | r16
            goto L_0x00be
        L_0x00bc:
            r15 = r32
        L_0x00be:
            r16 = r36 & 64
            if (r16 == 0) goto L_0x00c7
            r16 = 1572864(0x180000, float:2.204052E-39)
        L_0x00c4:
            r3 = r3 | r16
            goto L_0x00d9
        L_0x00c7:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r10 & r16
            if (r16 != 0) goto L_0x00d9
            boolean r16 = r2.changedInstance(r9)
            if (r16 == 0) goto L_0x00d6
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c4
        L_0x00d6:
            r16 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00c4
        L_0x00d9:
            r16 = 2995931(0x2db6db, float:4.198194E-39)
            r0 = r3 & r16
            r5 = 599186(0x92492, float:8.39638E-40)
            if (r0 != r5) goto L_0x00f2
            boolean r0 = r2.getSkipping()
            if (r0 != 0) goto L_0x00ea
            goto L_0x00f2
        L_0x00ea:
            r2.skipToGroupEnd()
            r3 = r26
            r8 = r13
            goto L_0x01a8
        L_0x00f2:
            r2.startDefaults()
            r0 = r10 & 1
            if (r0 == 0) goto L_0x0116
            boolean r0 = r2.getDefaultsInvalid()
            if (r0 == 0) goto L_0x0100
            goto L_0x0116
        L_0x0100:
            r2.skipToGroupEnd()
            r0 = r36 & 4
            if (r0 == 0) goto L_0x0109
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0109:
            r0 = r36 & 8
            if (r0 == 0) goto L_0x010f
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x010f:
            r0 = r26
            r4 = r11
            r8 = r13
        L_0x0113:
            r11 = r3
            r3 = r15
            goto L_0x015a
        L_0x0116:
            if (r4 == 0) goto L_0x011d
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            goto L_0x011f
        L_0x011d:
            r0 = r26
        L_0x011f:
            r4 = r36 & 4
            r5 = 6
            if (r4 == 0) goto L_0x012c
            androidx.compose.material3.TabRowDefaults r4 = androidx.compose.material3.TabRowDefaults.INSTANCE
            long r6 = r4.getContainerColor(r2, r5)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x012c:
            r4 = r36 & 8
            if (r4 == 0) goto L_0x0139
            androidx.compose.material3.TabRowDefaults r4 = androidx.compose.material3.TabRowDefaults.INSTANCE
            long r4 = r4.getContentColor(r2, r5)
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x013a
        L_0x0139:
            r4 = r11
        L_0x013a:
            if (r8 == 0) goto L_0x014c
            androidx.compose.material3.TabRowKt$TabRow$1 r8 = new androidx.compose.material3.TabRowKt$TabRow$1
            r8.<init>(r1)
            r11 = -2052073983(0xffffffff85afd601, float:-1.6535534E-35)
            r12 = 1
            androidx.compose.runtime.internal.ComposableLambda r8 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r2, r11, r12, r8)
            kotlin.jvm.functions.Function3 r8 = (kotlin.jvm.functions.Function3) r8
            goto L_0x014d
        L_0x014c:
            r8 = r13
        L_0x014d:
            if (r14 == 0) goto L_0x0113
            androidx.compose.material3.ComposableSingletons$TabRowKt r11 = androidx.compose.material3.ComposableSingletons$TabRowKt.INSTANCE
            kotlin.jvm.functions.Function2 r11 = r11.m1273getLambda1$material3_release()
            r24 = r11
            r11 = r3
            r3 = r24
        L_0x015a:
            r2.endDefaults()
            boolean r12 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r12 == 0) goto L_0x016d
            r12 = -1
            java.lang.String r13 = "androidx.compose.material3.TabRow (TabRow.kt:125)"
            r14 = -1199178586(0xffffffffb885fca6, float:-6.388994E-5)
            androidx.compose.runtime.ComposerKt.traceEventStart(r14, r11, r12, r13)
        L_0x016d:
            androidx.compose.ui.Modifier r12 = androidx.compose.foundation.selection.SelectableGroupKt.selectableGroup(r0)
            r17 = 0
            r18 = 0
            r19 = 0
            androidx.compose.material3.TabRowKt$TabRow$2 r14 = new androidx.compose.material3.TabRowKt$TabRow$2
            r14.<init>(r9, r3, r8, r11)
            r15 = 1273256619(0x4be45aab, float:2.9930838E7)
            r13 = 1
            androidx.compose.runtime.internal.ComposableLambda r13 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r2, r15, r13, r14)
            r20 = r13
            kotlin.jvm.functions.Function2 r20 = (kotlin.jvm.functions.Function2) r20
            r13 = 12582912(0xc00000, float:1.7632415E-38)
            r14 = r11 & 896(0x380, float:1.256E-42)
            r13 = r13 | r14
            r11 = r11 & 7168(0x1c00, float:1.0045E-41)
            r22 = r13 | r11
            r23 = 114(0x72, float:1.6E-43)
            r11 = r12
            r12 = 0
            r13 = r6
            r15 = r4
            r21 = r2
            androidx.compose.material3.SurfaceKt.m1641SurfaceT9BRK9s(r11, r12, r13, r15, r17, r18, r19, r20, r21, r22, r23)
            boolean r11 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r11 == 0) goto L_0x01a5
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x01a5:
            r15 = r3
            r11 = r4
            r3 = r0
        L_0x01a8:
            androidx.compose.runtime.ScopeUpdateScope r13 = r2.endRestartGroup()
            if (r13 != 0) goto L_0x01af
            goto L_0x01c7
        L_0x01af:
            androidx.compose.material3.TabRowKt$TabRow$3 r14 = new androidx.compose.material3.TabRowKt$TabRow$3
            r0 = r14
            r1 = r25
            r2 = r3
            r3 = r6
            r5 = r11
            r7 = r8
            r8 = r15
            r9 = r33
            r10 = r35
            r11 = r36
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11)
            kotlin.jvm.functions.Function2 r14 = (kotlin.jvm.functions.Function2) r14
            r13.updateScope(r14)
        L_0x01c7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabRowKt.m1683TabRowpAZo6Ak(int, androidx.compose.ui.Modifier, long, long, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:123:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0118  */
    /* renamed from: ScrollableTabRow-sKfQg0A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1682ScrollableTabRowsKfQg0A(int r27, androidx.compose.ui.Modifier r28, long r29, long r31, float r33, kotlin.jvm.functions.Function3<? super java.util.List<androidx.compose.material3.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r34, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r35, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r36, androidx.compose.runtime.Composer r37, int r38, int r39) {
        /*
            r1 = r27
            r10 = r36
            r11 = r38
            r12 = r39
            java.lang.String r0 = "tabs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = -497821003(0xffffffffe253dab5, float:-9.770056E20)
            r2 = r37
            androidx.compose.runtime.Composer r2 = r2.startRestartGroup(r0)
            java.lang.String r3 = "C(ScrollableTabRow)P(6,5,0:c#ui.graphics.Color,1:c#ui.graphics.Color,3:c#ui.unit.Dp,4)230@11025L14,231@11082L12,243@11485L3289:TabRow.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r3)
            r3 = r12 & 1
            if (r3 == 0) goto L_0x0023
            r3 = r11 | 6
            goto L_0x0033
        L_0x0023:
            r3 = r11 & 14
            if (r3 != 0) goto L_0x0032
            boolean r3 = r2.changed((int) r1)
            if (r3 == 0) goto L_0x002f
            r3 = 4
            goto L_0x0030
        L_0x002f:
            r3 = 2
        L_0x0030:
            r3 = r3 | r11
            goto L_0x0033
        L_0x0032:
            r3 = r11
        L_0x0033:
            r4 = r12 & 2
            if (r4 == 0) goto L_0x003a
            r3 = r3 | 48
            goto L_0x004d
        L_0x003a:
            r5 = r11 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x004d
            r5 = r28
            boolean r6 = r2.changed((java.lang.Object) r5)
            if (r6 == 0) goto L_0x0049
            r6 = 32
            goto L_0x004b
        L_0x0049:
            r6 = 16
        L_0x004b:
            r3 = r3 | r6
            goto L_0x004f
        L_0x004d:
            r5 = r28
        L_0x004f:
            r6 = r11 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0068
            r6 = r12 & 4
            if (r6 != 0) goto L_0x0062
            r6 = r29
            boolean r8 = r2.changed((long) r6)
            if (r8 == 0) goto L_0x0064
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0062:
            r6 = r29
        L_0x0064:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r3 = r3 | r8
            goto L_0x006a
        L_0x0068:
            r6 = r29
        L_0x006a:
            r8 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0083
            r8 = r12 & 8
            if (r8 != 0) goto L_0x007d
            r8 = r31
            boolean r13 = r2.changed((long) r8)
            if (r13 == 0) goto L_0x007f
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007d:
            r8 = r31
        L_0x007f:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r3 = r3 | r13
            goto L_0x0085
        L_0x0083:
            r8 = r31
        L_0x0085:
            r13 = r12 & 16
            if (r13 == 0) goto L_0x008c
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a1
        L_0x008c:
            r14 = 57344(0xe000, float:8.0356E-41)
            r14 = r14 & r11
            if (r14 != 0) goto L_0x00a1
            r14 = r33
            boolean r15 = r2.changed((float) r14)
            if (r15 == 0) goto L_0x009d
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009f
        L_0x009d:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x009f:
            r3 = r3 | r15
            goto L_0x00a3
        L_0x00a1:
            r14 = r33
        L_0x00a3:
            r15 = r12 & 32
            if (r15 == 0) goto L_0x00ae
            r16 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r16
            r0 = r34
            goto L_0x00c3
        L_0x00ae:
            r16 = 458752(0x70000, float:6.42848E-40)
            r16 = r11 & r16
            r0 = r34
            if (r16 != 0) goto L_0x00c3
            boolean r17 = r2.changedInstance(r0)
            if (r17 == 0) goto L_0x00bf
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c1
        L_0x00bf:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x00c1:
            r3 = r3 | r17
        L_0x00c3:
            r17 = r12 & 64
            if (r17 == 0) goto L_0x00ce
            r18 = 1572864(0x180000, float:2.204052E-39)
            r3 = r3 | r18
            r0 = r35
            goto L_0x00e3
        L_0x00ce:
            r18 = 3670016(0x380000, float:5.142788E-39)
            r18 = r11 & r18
            r0 = r35
            if (r18 != 0) goto L_0x00e3
            boolean r18 = r2.changedInstance(r0)
            if (r18 == 0) goto L_0x00df
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e1
        L_0x00df:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x00e1:
            r3 = r3 | r18
        L_0x00e3:
            r0 = r12 & 128(0x80, float:1.794E-43)
            r18 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00ec
            r3 = r3 | r18
            goto L_0x00fd
        L_0x00ec:
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r0 & r11
            if (r0 != 0) goto L_0x00fd
            boolean r0 = r2.changedInstance(r10)
            if (r0 == 0) goto L_0x00fa
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fc
        L_0x00fa:
            r0 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fc:
            r3 = r3 | r0
        L_0x00fd:
            r0 = 23967451(0x16db6db, float:4.3661218E-38)
            r0 = r0 & r3
            r5 = 4793490(0x492492, float:6.71711E-39)
            if (r0 != r5) goto L_0x0118
            boolean r0 = r2.getSkipping()
            if (r0 != 0) goto L_0x010d
            goto L_0x0118
        L_0x010d:
            r2.skipToGroupEnd()
            r3 = r28
            r13 = r34
            r15 = r35
            goto L_0x01ed
        L_0x0118:
            r2.startDefaults()
            r0 = r11 & 1
            if (r0 == 0) goto L_0x013f
            boolean r0 = r2.getDefaultsInvalid()
            if (r0 == 0) goto L_0x0126
            goto L_0x013f
        L_0x0126:
            r2.skipToGroupEnd()
            r0 = r12 & 4
            if (r0 == 0) goto L_0x012f
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x012f:
            r0 = r12 & 8
            if (r0 == 0) goto L_0x0135
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0135:
            r0 = r28
            r13 = r3
            r4 = r8
            r8 = r14
            r9 = r34
        L_0x013c:
            r3 = r35
            goto L_0x018d
        L_0x013f:
            if (r4 == 0) goto L_0x0146
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            goto L_0x0148
        L_0x0146:
            r0 = r28
        L_0x0148:
            r4 = r12 & 4
            r5 = 6
            if (r4 == 0) goto L_0x0155
            androidx.compose.material3.TabRowDefaults r4 = androidx.compose.material3.TabRowDefaults.INSTANCE
            long r6 = r4.getContainerColor(r2, r5)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0155:
            r4 = r12 & 8
            if (r4 == 0) goto L_0x0162
            androidx.compose.material3.TabRowDefaults r4 = androidx.compose.material3.TabRowDefaults.INSTANCE
            long r4 = r4.getContentColor(r2, r5)
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x0163
        L_0x0162:
            r4 = r8
        L_0x0163:
            if (r13 == 0) goto L_0x0168
            float r8 = ScrollableTabRowPadding
            goto L_0x0169
        L_0x0168:
            r8 = r14
        L_0x0169:
            if (r15 == 0) goto L_0x017b
            androidx.compose.material3.TabRowKt$ScrollableTabRow$1 r9 = new androidx.compose.material3.TabRowKt$ScrollableTabRow$1
            r9.<init>(r1)
            r13 = -913748678(0xffffffffc9894d3a, float:-1124775.2)
            r14 = 1
            androidx.compose.runtime.internal.ComposableLambda r9 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r2, r13, r14, r9)
            kotlin.jvm.functions.Function3 r9 = (kotlin.jvm.functions.Function3) r9
            goto L_0x017d
        L_0x017b:
            r9 = r34
        L_0x017d:
            if (r17 == 0) goto L_0x018b
            androidx.compose.material3.ComposableSingletons$TabRowKt r13 = androidx.compose.material3.ComposableSingletons$TabRowKt.INSTANCE
            kotlin.jvm.functions.Function2 r13 = r13.m1274getLambda2$material3_release()
            r26 = r13
            r13 = r3
            r3 = r26
            goto L_0x018d
        L_0x018b:
            r13 = r3
            goto L_0x013c
        L_0x018d:
            r2.endDefaults()
            boolean r14 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r14 == 0) goto L_0x01a0
            r14 = -1
            java.lang.String r15 = "androidx.compose.material3.ScrollableTabRow (TabRow.kt:227)"
            r1 = -497821003(0xffffffffe253dab5, float:-9.770056E20)
            androidx.compose.runtime.ComposerKt.traceEventStart(r1, r13, r14, r15)
        L_0x01a0:
            r19 = 0
            r20 = 0
            r21 = 0
            androidx.compose.material3.TabRowKt$ScrollableTabRow$2 r1 = new androidx.compose.material3.TabRowKt$ScrollableTabRow$2
            r28 = r1
            r29 = r8
            r30 = r36
            r31 = r3
            r32 = r27
            r33 = r9
            r34 = r13
            r28.<init>(r29, r30, r31, r32, r33, r34)
            r15 = 286469328(0x11132cd0, float:1.1610064E-28)
            r14 = 1
            androidx.compose.runtime.internal.ComposableLambda r1 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r2, r15, r14, r1)
            r22 = r1
            kotlin.jvm.functions.Function2 r22 = (kotlin.jvm.functions.Function2) r22
            int r1 = r13 >> 3
            r1 = r1 & 14
            r1 = r1 | r18
            r14 = r13 & 896(0x380, float:1.256E-42)
            r1 = r1 | r14
            r13 = r13 & 7168(0x1c00, float:1.0045E-41)
            r24 = r1 | r13
            r25 = 114(0x72, float:1.6E-43)
            r13 = r0
            r1 = 0
            r14 = r1
            r15 = r6
            r17 = r4
            r23 = r2
            androidx.compose.material3.SurfaceKt.m1641SurfaceT9BRK9s(r13, r14, r15, r17, r19, r20, r21, r22, r23, r24, r25)
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x01e8
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x01e8:
            r15 = r3
            r14 = r8
            r13 = r9
            r3 = r0
            r8 = r4
        L_0x01ed:
            androidx.compose.runtime.ScopeUpdateScope r5 = r2.endRestartGroup()
            if (r5 != 0) goto L_0x01f4
            goto L_0x0213
        L_0x01f4:
            androidx.compose.material3.TabRowKt$ScrollableTabRow$3 r16 = new androidx.compose.material3.TabRowKt$ScrollableTabRow$3
            r0 = r16
            r1 = r27
            r2 = r3
            r3 = r6
            r7 = r5
            r5 = r8
            r9 = r7
            r7 = r14
            r8 = r13
            r13 = r9
            r9 = r15
            r10 = r36
            r11 = r38
            r12 = r39
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12)
            r0 = r16
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r13.updateScope(r0)
        L_0x0213:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabRowKt.m1682ScrollableTabRowsKfQg0A(int, androidx.compose.ui.Modifier, long, long, float, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }
}
