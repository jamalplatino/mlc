package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000v\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052#\u0010\u0006\u001a\u001f\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0007¢\u0006\u0002\b\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0017\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00010\u001a¢\u0006\u0002\b\fH\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a\u001d\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010 \u001a\u0001\u0010!\u001a\u0019\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020#0\u0007¢\u0006\u0002\b\f2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0004\u001a\u00020\u00052#\u0010\u0006\u001a\u001f\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0007¢\u0006\u0002\b\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010$\u001a\u00020%H\u0003ø\u0001\u0000¢\u0006\u0002\u0010&\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, d2 = {"LazyGrid", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "slotSizesSums", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/Constraints;", "", "", "Lkotlin/ExtensionFunctionType;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "isVertical", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "userScrollEnabled", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "ScrollPositionUpdater", "itemProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/runtime/Composer;I)V", "rememberLazyGridMeasurePolicy", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/layout/MeasureResult;", "placementAnimator", "Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;Landroidx/compose/foundation/lazy/grid/LazyGridState;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function2;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: LazyGrid.kt */
public final class LazyGridKt {
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0377  */
    /* JADX WARNING: Removed duplicated region for block: B:166:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x013c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void LazyGrid(androidx.compose.ui.Modifier r35, androidx.compose.foundation.lazy.grid.LazyGridState r36, kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.Density, ? super androidx.compose.ui.unit.Constraints, ? extends java.util.List<java.lang.Integer>> r37, androidx.compose.foundation.layout.PaddingValues r38, boolean r39, boolean r40, androidx.compose.foundation.gestures.FlingBehavior r41, boolean r42, androidx.compose.foundation.layout.Arrangement.Vertical r43, androidx.compose.foundation.layout.Arrangement.Horizontal r44, kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.grid.LazyGridScope, kotlin.Unit> r45, androidx.compose.runtime.Composer r46, int r47, int r48, int r49) {
        /*
            r12 = r36
            r13 = r37
            r14 = r40
            r15 = r43
            r11 = r44
            r10 = r45
            r9 = r47
            r8 = r49
            java.lang.String r0 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "slotSizesSums"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "verticalArrangement"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "horizontalArrangement"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = 152645664(0x9193020, float:1.8439333E-33)
            r1 = r46
            androidx.compose.runtime.Composer r7 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(LazyGrid)P(5,8,7,1,6,4,2,9,10,3)65@3048L15,75@3489L18,77@3532L44,79@3602L51,81@3671L24,82@3724L92,87@3890L249,101@4180L42,108@4460L265,120@4999L7,104@4315L1163:LazyGrid.kt#7791vq"
            androidx.compose.runtime.ComposerKt.sourceInformation(r7, r1)
            r1 = r8 & 1
            if (r1 == 0) goto L_0x0046
            r4 = r9 | 6
            r5 = r4
            r4 = r35
            goto L_0x005a
        L_0x0046:
            r4 = r9 & 14
            if (r4 != 0) goto L_0x0057
            r4 = r35
            boolean r5 = r7.changed((java.lang.Object) r4)
            if (r5 == 0) goto L_0x0054
            r5 = 4
            goto L_0x0055
        L_0x0054:
            r5 = 2
        L_0x0055:
            r5 = r5 | r9
            goto L_0x005a
        L_0x0057:
            r4 = r35
            r5 = r9
        L_0x005a:
            r6 = r8 & 2
            if (r6 == 0) goto L_0x0061
            r5 = r5 | 48
            goto L_0x0071
        L_0x0061:
            r6 = r9 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0071
            boolean r6 = r7.changed((java.lang.Object) r12)
            if (r6 == 0) goto L_0x006e
            r6 = 32
            goto L_0x0070
        L_0x006e:
            r6 = 16
        L_0x0070:
            r5 = r5 | r6
        L_0x0071:
            r6 = r8 & 4
            if (r6 == 0) goto L_0x0078
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x0088
        L_0x0078:
            r6 = r9 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0088
            boolean r6 = r7.changedInstance(r13)
            if (r6 == 0) goto L_0x0085
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0087
        L_0x0085:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0087:
            r5 = r5 | r6
        L_0x0088:
            r6 = r8 & 8
            if (r6 == 0) goto L_0x008f
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            goto L_0x00a3
        L_0x008f:
            r2 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x00a3
            r2 = r38
            boolean r16 = r7.changed((java.lang.Object) r2)
            if (r16 == 0) goto L_0x009e
            r16 = 2048(0x800, float:2.87E-42)
            goto L_0x00a0
        L_0x009e:
            r16 = 1024(0x400, float:1.435E-42)
        L_0x00a0:
            r5 = r5 | r16
            goto L_0x00a5
        L_0x00a3:
            r2 = r38
        L_0x00a5:
            r16 = r8 & 16
            r17 = 57344(0xe000, float:8.0356E-41)
            if (r16 == 0) goto L_0x00b1
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
            r0 = r39
            goto L_0x00c4
        L_0x00b1:
            r18 = r9 & r17
            r0 = r39
            if (r18 != 0) goto L_0x00c4
            boolean r19 = r7.changed((boolean) r0)
            if (r19 == 0) goto L_0x00c0
            r19 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00c2
        L_0x00c0:
            r19 = 8192(0x2000, float:1.14794E-41)
        L_0x00c2:
            r5 = r5 | r19
        L_0x00c4:
            r19 = r8 & 32
            r20 = 458752(0x70000, float:6.42848E-40)
            if (r19 == 0) goto L_0x00cf
            r19 = 196608(0x30000, float:2.75506E-40)
        L_0x00cc:
            r5 = r5 | r19
            goto L_0x00df
        L_0x00cf:
            r19 = r9 & r20
            if (r19 != 0) goto L_0x00df
            boolean r19 = r7.changed((boolean) r14)
            if (r19 == 0) goto L_0x00dc
            r19 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00cc
        L_0x00dc:
            r19 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00cc
        L_0x00df:
            r19 = 3670016(0x380000, float:5.142788E-39)
            r21 = r9 & r19
            if (r21 != 0) goto L_0x00f9
            r21 = r8 & 64
            r3 = r41
            if (r21 != 0) goto L_0x00f4
            boolean r22 = r7.changed((java.lang.Object) r3)
            if (r22 == 0) goto L_0x00f4
            r22 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00f6
        L_0x00f4:
            r22 = 524288(0x80000, float:7.34684E-40)
        L_0x00f6:
            r5 = r5 | r22
            goto L_0x00fb
        L_0x00f9:
            r3 = r41
        L_0x00fb:
            r0 = r8 & 128(0x80, float:1.794E-43)
            r22 = 29360128(0x1c00000, float:7.052966E-38)
            if (r0 == 0) goto L_0x0105
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            r5 = r5 | r0
            goto L_0x0119
        L_0x0105:
            r0 = r9 & r22
            if (r0 != 0) goto L_0x0119
            r0 = r42
            boolean r23 = r7.changed((boolean) r0)
            if (r23 == 0) goto L_0x0114
            r23 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0116
        L_0x0114:
            r23 = 4194304(0x400000, float:5.877472E-39)
        L_0x0116:
            r5 = r5 | r23
            goto L_0x011b
        L_0x0119:
            r0 = r42
        L_0x011b:
            r0 = r8 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0123
            r0 = 100663296(0x6000000, float:2.4074124E-35)
        L_0x0121:
            r5 = r5 | r0
            goto L_0x0134
        L_0x0123:
            r0 = 234881024(0xe000000, float:1.5777218E-30)
            r0 = r0 & r9
            if (r0 != 0) goto L_0x0134
            boolean r0 = r7.changed((java.lang.Object) r15)
            if (r0 == 0) goto L_0x0131
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0121
        L_0x0131:
            r0 = 33554432(0x2000000, float:9.403955E-38)
            goto L_0x0121
        L_0x0134:
            r0 = r8 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x013c
            r0 = 805306368(0x30000000, float:4.656613E-10)
        L_0x013a:
            r5 = r5 | r0
            goto L_0x014d
        L_0x013c:
            r0 = 1879048192(0x70000000, float:1.58456325E29)
            r0 = r0 & r9
            if (r0 != 0) goto L_0x014d
            boolean r0 = r7.changed((java.lang.Object) r11)
            if (r0 == 0) goto L_0x014a
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x013a
        L_0x014a:
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x013a
        L_0x014d:
            r0 = r8 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0154
            r0 = r48 | 6
            goto L_0x0166
        L_0x0154:
            r0 = r48 & 14
            if (r0 != 0) goto L_0x0164
            boolean r0 = r7.changedInstance(r10)
            if (r0 == 0) goto L_0x0160
            r0 = 4
            goto L_0x0161
        L_0x0160:
            r0 = 2
        L_0x0161:
            r0 = r48 | r0
            goto L_0x0166
        L_0x0164:
            r0 = r48
        L_0x0166:
            r23 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r2 = r5 & r23
            r3 = 306783378(0x12492492, float:6.3469493E-28)
            if (r2 != r3) goto L_0x0189
            r2 = r0 & 11
            r3 = 2
            if (r2 != r3) goto L_0x0189
            boolean r2 = r7.getSkipping()
            if (r2 != 0) goto L_0x017c
            goto L_0x0189
        L_0x017c:
            r7.skipToGroupEnd()
            r5 = r39
            r1 = r4
            r9 = r7
            r4 = r38
            r7 = r41
            goto L_0x0370
        L_0x0189:
            r7.startDefaults()
            r2 = r9 & 1
            r3 = 6
            if (r2 == 0) goto L_0x01ac
            boolean r2 = r7.getDefaultsInvalid()
            if (r2 == 0) goto L_0x0198
            goto L_0x01ac
        L_0x0198:
            r7.skipToGroupEnd()
            r1 = r8 & 64
            if (r1 == 0) goto L_0x01a3
            r1 = -3670017(0xffffffffffc7ffff, float:NaN)
            r5 = r5 & r1
        L_0x01a3:
            r16 = r38
            r21 = r41
            r6 = r4
            r4 = r5
            r5 = r39
            goto L_0x01e5
        L_0x01ac:
            if (r1 == 0) goto L_0x01b3
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
            goto L_0x01b4
        L_0x01b3:
            r1 = r4
        L_0x01b4:
            r2 = 0
            if (r6 == 0) goto L_0x01c1
            float r4 = (float) r2
            float r4 = androidx.compose.ui.unit.Dp.m5626constructorimpl(r4)
            androidx.compose.foundation.layout.PaddingValues r4 = androidx.compose.foundation.layout.PaddingKt.m486PaddingValues0680j_4(r4)
            goto L_0x01c3
        L_0x01c1:
            r4 = r38
        L_0x01c3:
            if (r16 == 0) goto L_0x01c6
            goto L_0x01c8
        L_0x01c6:
            r2 = r39
        L_0x01c8:
            r6 = r8 & 64
            if (r6 == 0) goto L_0x01de
            androidx.compose.foundation.gestures.ScrollableDefaults r6 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE
            androidx.compose.foundation.gestures.FlingBehavior r6 = r6.flingBehavior(r7, r3)
            r16 = -3670017(0xffffffffffc7ffff, float:NaN)
            r5 = r5 & r16
            r16 = r4
            r4 = r5
            r21 = r6
            r6 = r1
            goto L_0x01e4
        L_0x01de:
            r21 = r41
            r6 = r1
            r16 = r4
            r4 = r5
        L_0x01e4:
            r5 = r2
        L_0x01e5:
            r7.endDefaults()
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x01f7
            java.lang.String r1 = "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:51)"
            r2 = 152645664(0x9193020, float:1.8439333E-33)
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r4, r0, r1)
        L_0x01f7:
            androidx.compose.foundation.gestures.ScrollableDefaults r1 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE
            androidx.compose.foundation.OverscrollEffect r3 = r1.overscrollEffect(r7, r3)
            int r1 = r4 >> 3
            r2 = r1 & 14
            int r0 = r0 << 3
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            androidx.compose.foundation.lazy.grid.LazyGridItemProvider r0 = androidx.compose.foundation.lazy.grid.LazyGridItemProviderKt.rememberLazyGridItemProvider(r12, r10, r7, r0)
            int r18 = r4 >> 9
            r23 = r18 & 112(0x70, float:1.57E-43)
            r2 = r2 | r23
            androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState r23 = androidx.compose.foundation.lazy.grid.LazySemanticsKt.rememberLazyGridSemanticState(r12, r5, r7, r2)
            r2 = 773894976(0x2e20b340, float:3.6538994E-11)
            r7.startReplaceableGroup(r2)
            java.lang.String r2 = "CC(rememberCoroutineScope)476@19869L144:Effects.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r7, r2)
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r7.startReplaceableGroup(r2)
            java.lang.String r2 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r7, r2)
            java.lang.Object r2 = r7.rememberedValue()
            androidx.compose.runtime.Composer$Companion r24 = androidx.compose.runtime.Composer.Companion
            r35 = r0
            java.lang.Object r0 = r24.getEmpty()
            if (r2 != r0) goto L_0x0248
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlin.coroutines.CoroutineContext r0 = (kotlin.coroutines.CoroutineContext) r0
            kotlinx.coroutines.CoroutineScope r0 = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(r0, r7)
            androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller r2 = new androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller
            r2.<init>(r0)
            r7.updateRememberedValue(r2)
        L_0x0248:
            r7.endReplaceableGroup()
            androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller r2 = (androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) r2
            kotlinx.coroutines.CoroutineScope r0 = r2.getCoroutineScope()
            r7.endReplaceableGroup()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r40)
            r38 = r3
            r3 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r7.startReplaceableGroup(r3)
            java.lang.String r3 = "CC(remember)P(1,2):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r7, r3)
            boolean r3 = r7.changed((java.lang.Object) r12)
            boolean r2 = r7.changed((java.lang.Object) r2)
            r2 = r2 | r3
            java.lang.Object r3 = r7.rememberedValue()
            if (r2 != 0) goto L_0x027c
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r3 != r2) goto L_0x0284
        L_0x027c:
            androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator r3 = new androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator
            r3.<init>(r0, r14)
            r7.updateRememberedValue(r3)
        L_0x0284:
            r7.endReplaceableGroup()
            androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator r3 = (androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator) r3
            r12.setPlacementAnimator$foundation_release(r3)
            r2 = r4 & 112(0x70, float:1.57E-43)
            r0 = 134217728(0x8000000, float:3.85186E-34)
            r0 = r0 | r2
            r39 = r2
            r2 = r4 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r2 = r4 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            r2 = r4 & r17
            r0 = r0 | r2
            r2 = r4 & r20
            r0 = r0 | r2
            r2 = r18 & r19
            r0 = r0 | r2
            r1 = r1 & r22
            r19 = r0 | r1
            r22 = 0
            r2 = r35
            r0 = r2
            r1 = r36
            r32 = r39
            r31 = r2
            r2 = r37
            r33 = r38
            r24 = r3
            r3 = r16
            r25 = r4
            r4 = r5
            r35 = r5
            r5 = r40
            r34 = r6
            r6 = r44
            r38 = r7
            r7 = r43
            r8 = r24
            r9 = r38
            r10 = r19
            r11 = r22
            kotlin.jvm.functions.Function2 r0 = rememberLazyGridMeasurePolicy(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.setVertical$foundation_release(r14)
            r1 = r31
            r2 = r32
            ScrollPositionUpdater(r1, r12, r9, r2)
            if (r14 == 0) goto L_0x02e3
            androidx.compose.foundation.gestures.Orientation r2 = androidx.compose.foundation.gestures.Orientation.Vertical
            goto L_0x02e5
        L_0x02e3:
            androidx.compose.foundation.gestures.Orientation r2 = androidx.compose.foundation.gestures.Orientation.Horizontal
        L_0x02e5:
            r10 = r2
            androidx.compose.ui.layout.RemeasurementModifier r2 = r36.getRemeasurementModifier$foundation_release()
            androidx.compose.ui.Modifier r2 = (androidx.compose.ui.Modifier) r2
            r11 = r34
            androidx.compose.ui.Modifier r2 = r11.then(r2)
            androidx.compose.foundation.lazy.AwaitFirstLayoutModifier r3 = r36.getAwaitLayoutModifier$foundation_release()
            androidx.compose.ui.Modifier r3 = (androidx.compose.ui.Modifier) r3
            androidx.compose.ui.Modifier r2 = r2.then(r3)
            r19 = r1
            androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider r19 = (androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider) r19
            r1 = r18 & r17
            int r3 = r25 << 3
            r3 = r3 & r20
            r8 = r1 | r3
            r1 = r2
            r2 = r19
            r3 = r23
            r4 = r10
            r5 = r42
            r6 = r35
            r7 = r9
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt.lazyLayoutSemantics(r1, r2, r3, r4, r5, r6, r7, r8)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.ClipScrollableContainerKt.clipScrollableContainer(r1, r10)
            r2 = r33
            androidx.compose.ui.Modifier r23 = androidx.compose.foundation.OverscrollKt.overscroll(r1, r2)
            androidx.compose.foundation.gestures.ScrollableDefaults r1 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE
            androidx.compose.runtime.ProvidableCompositionLocal r3 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            androidx.compose.runtime.CompositionLocal r3 = (androidx.compose.runtime.CompositionLocal) r3
            r4 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r5 = "CC:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r9, r4, r5)
            java.lang.Object r3 = r9.consume(r3)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r9)
            androidx.compose.ui.unit.LayoutDirection r3 = (androidx.compose.ui.unit.LayoutDirection) r3
            r8 = r35
            boolean r28 = r1.reverseDirection(r3, r10, r8)
            androidx.compose.foundation.interaction.MutableInteractionSource r30 = r36.getInternalInteractionSource$foundation_release()
            r24 = r12
            androidx.compose.foundation.gestures.ScrollableState r24 = (androidx.compose.foundation.gestures.ScrollableState) r24
            r25 = r10
            r26 = r2
            r27 = r42
            r29 = r21
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.gestures.ScrollableKt.scrollable(r23, r24, r25, r26, r27, r28, r29, r30)
            androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState r3 = r36.getPrefetchState$foundation_release()
            r6 = 0
            r7 = 0
            r1 = r19
            r4 = r0
            r5 = r9
            androidx.compose.foundation.lazy.layout.LazyLayoutKt.LazyLayout(r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x036a
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x036a:
            r5 = r8
            r1 = r11
            r4 = r16
            r7 = r21
        L_0x0370:
            androidx.compose.runtime.ScopeUpdateScope r11 = r9.endRestartGroup()
            if (r11 != 0) goto L_0x0377
            goto L_0x039a
        L_0x0377:
            androidx.compose.foundation.lazy.grid.LazyGridKt$LazyGrid$1 r16 = new androidx.compose.foundation.lazy.grid.LazyGridKt$LazyGrid$1
            r0 = r16
            r2 = r36
            r3 = r37
            r6 = r40
            r8 = r42
            r9 = r43
            r10 = r44
            r15 = r11
            r11 = r45
            r12 = r47
            r13 = r48
            r14 = r49
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = r16
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r15.updateScope(r0)
        L_0x039a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.grid.LazyGridState, kotlin.jvm.functions.Function2, androidx.compose.foundation.layout.PaddingValues, boolean, boolean, androidx.compose.foundation.gestures.FlingBehavior, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final void ScrollPositionUpdater(LazyGridItemProvider lazyGridItemProvider, LazyGridState lazyGridState, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(950944068);
        ComposerKt.sourceInformation(startRestartGroup, "C(ScrollPositionUpdater):LazyGrid.kt#7791vq");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed((Object) lazyGridItemProvider) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed((Object) lazyGridState) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(950944068, i, -1, "androidx.compose.foundation.lazy.grid.ScrollPositionUpdater (LazyGrid.kt:139)");
            }
            if (lazyGridItemProvider.getItemCount() > 0) {
                lazyGridState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyGridItemProvider);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new LazyGridKt$ScrollPositionUpdater$1(lazyGridItemProvider, lazyGridState, i));
        }
    }

    private static final Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyGridMeasurePolicy(LazyGridItemProvider lazyGridItemProvider, LazyGridState lazyGridState, Function2<? super Density, ? super Constraints, ? extends List<Integer>> function2, PaddingValues paddingValues, boolean z, boolean z2, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, Composer composer, int i, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        composer2.startReplaceableGroup(237903564);
        ComposerKt.sourceInformation(composer2, "C(rememberLazyGridMeasurePolicy)P(3,7,6!1,5,2!1,8)169@6864L8299:LazyGrid.kt#7791vq");
        Arrangement.Vertical vertical2 = null;
        Arrangement.Horizontal horizontal2 = (i3 & 64) != 0 ? null : horizontal;
        if ((i3 & 128) == 0) {
            vertical2 = vertical;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(237903564, i, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:150)");
        }
        Object[] objArr = {lazyGridState, function2, paddingValues, Boolean.valueOf(z), Boolean.valueOf(z2), horizontal2, vertical2, lazyGridItemPlacementAnimator};
        composer2.startReplaceableGroup(-568225417);
        ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean z3 = false;
        for (int i4 = 0; i4 < 8; i4++) {
            z3 |= composer2.changed(objArr[i4]);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z3 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LazyGridKt$rememberLazyGridMeasurePolicy$1$1(z2, paddingValues, z, lazyGridState, lazyGridItemProvider, function2, vertical2, horizontal2, lazyGridItemPlacementAnimator);
            composer2.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function22 = (Function2) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return function22;
    }
}
