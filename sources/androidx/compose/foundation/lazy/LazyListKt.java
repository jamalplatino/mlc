package androidx.compose.foundation.lazy;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\u0019¢\u0006\u0002\b\u001bH\u0001¢\u0006\u0002\u0010\u001c\u001a\u001d\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010 \u001a\u0001\u0010!\u001a\u0019\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0\"¢\u0006\u0002\b\u001b2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010&\u001a\u00020'2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010(\u001a\u00020)H\u0003ø\u0001\u0000¢\u0006\u0002\u0010*\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, d2 = {"LazyList", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/LazyListState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "isVertical", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "userScrollEnabled", "beyondBoundsItemCount", "", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyListScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;ZILandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "ScrollPositionUpdater", "itemProvider", "Landroidx/compose/foundation/lazy/LazyListItemProvider;", "(Landroidx/compose/foundation/lazy/LazyListItemProvider;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/runtime/Composer;I)V", "rememberLazyListMeasurePolicy", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "beyondBoundsInfo", "Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;", "placementAnimator", "Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;", "(Landroidx/compose/foundation/lazy/LazyListItemProvider;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;Landroidx/compose/foundation/layout/PaddingValues;ZZILandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;Landroidx/compose/runtime/Composer;III)Lkotlin/jvm/functions/Function2;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: LazyList.kt */
public final class LazyListKt {
    /* JADX WARNING: Removed duplicated region for block: B:104:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x03cd  */
    /* JADX WARNING: Removed duplicated region for block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0143  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void LazyList(androidx.compose.ui.Modifier r33, androidx.compose.foundation.lazy.LazyListState r34, androidx.compose.foundation.layout.PaddingValues r35, boolean r36, boolean r37, androidx.compose.foundation.gestures.FlingBehavior r38, boolean r39, int r40, androidx.compose.ui.Alignment.Horizontal r41, androidx.compose.foundation.layout.Arrangement.Vertical r42, androidx.compose.ui.Alignment.Vertical r43, androidx.compose.foundation.layout.Arrangement.Horizontal r44, kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.LazyListScope, kotlin.Unit> r45, androidx.compose.runtime.Composer r46, int r47, int r48, int r49) {
        /*
            r1 = r33
            r0 = r34
            r15 = r35
            r14 = r36
            r13 = r37
            r12 = r38
            r11 = r45
            r10 = r47
            r9 = r48
            r8 = r49
            java.lang.String r2 = "modifier"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.lang.String r2 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            java.lang.String r2 = "contentPadding"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r2)
            java.lang.String r2 = "flingBehavior"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r2)
            java.lang.String r2 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r2)
            r2 = 620764179(0x25001c13, float:1.1111742E-16)
            r3 = r46
            androidx.compose.runtime.Composer r7 = r3.startRestartGroup(r2)
            java.lang.String r3 = "C(LazyList)P(7,9,2,8,6,3,10!1,4,12,11,5)77@3628L18,78@3670L44,79@3739L48,80@3815L39,81@3871L24,82@3924L92,87@4090L340,102@4436L42,109@4716L265,117@5045L81,122@5350L7,105@4571L1258:LazyList.kt#428nma"
            androidx.compose.runtime.ComposerKt.sourceInformation(r7, r3)
            r3 = r8 & 1
            if (r3 == 0) goto L_0x0047
            r3 = r10 | 6
            goto L_0x0057
        L_0x0047:
            r3 = r10 & 14
            if (r3 != 0) goto L_0x0056
            boolean r3 = r7.changed((java.lang.Object) r1)
            if (r3 == 0) goto L_0x0053
            r3 = 4
            goto L_0x0054
        L_0x0053:
            r3 = 2
        L_0x0054:
            r3 = r3 | r10
            goto L_0x0057
        L_0x0056:
            r3 = r10
        L_0x0057:
            r6 = r8 & 2
            r16 = 32
            r17 = 16
            if (r6 == 0) goto L_0x0062
            r3 = r3 | 48
            goto L_0x0072
        L_0x0062:
            r6 = r10 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0072
            boolean r6 = r7.changed((java.lang.Object) r0)
            if (r6 == 0) goto L_0x006f
            r6 = r16
            goto L_0x0071
        L_0x006f:
            r6 = r17
        L_0x0071:
            r3 = r3 | r6
        L_0x0072:
            r6 = r8 & 4
            r18 = 256(0x100, float:3.59E-43)
            r19 = 128(0x80, float:1.794E-43)
            if (r6 == 0) goto L_0x007d
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x008d
        L_0x007d:
            r6 = r10 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x008d
            boolean r6 = r7.changed((java.lang.Object) r15)
            if (r6 == 0) goto L_0x008a
            r6 = r18
            goto L_0x008c
        L_0x008a:
            r6 = r19
        L_0x008c:
            r3 = r3 | r6
        L_0x008d:
            r6 = r8 & 8
            if (r6 == 0) goto L_0x0094
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x00a4
        L_0x0094:
            r6 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r6 != 0) goto L_0x00a4
            boolean r6 = r7.changed((boolean) r14)
            if (r6 == 0) goto L_0x00a1
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x00a3
        L_0x00a1:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x00a3:
            r3 = r3 | r6
        L_0x00a4:
            r6 = r8 & 16
            r20 = 57344(0xe000, float:8.0356E-41)
            if (r6 == 0) goto L_0x00ae
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00be
        L_0x00ae:
            r6 = r10 & r20
            if (r6 != 0) goto L_0x00be
            boolean r6 = r7.changed((boolean) r13)
            if (r6 == 0) goto L_0x00bb
            r6 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00bd
        L_0x00bb:
            r6 = 8192(0x2000, float:1.14794E-41)
        L_0x00bd:
            r3 = r3 | r6
        L_0x00be:
            r6 = r8 & 32
            r21 = 458752(0x70000, float:6.42848E-40)
            if (r6 == 0) goto L_0x00c8
            r6 = 196608(0x30000, float:2.75506E-40)
        L_0x00c6:
            r3 = r3 | r6
            goto L_0x00d8
        L_0x00c8:
            r6 = r10 & r21
            if (r6 != 0) goto L_0x00d8
            boolean r6 = r7.changed((java.lang.Object) r12)
            if (r6 == 0) goto L_0x00d5
            r6 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c6
        L_0x00d5:
            r6 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00c6
        L_0x00d8:
            r6 = r8 & 64
            r22 = 3670016(0x380000, float:5.142788E-39)
            if (r6 == 0) goto L_0x00e2
            r6 = 1572864(0x180000, float:2.204052E-39)
            r3 = r3 | r6
            goto L_0x00f6
        L_0x00e2:
            r6 = r10 & r22
            if (r6 != 0) goto L_0x00f6
            r6 = r39
            boolean r23 = r7.changed((boolean) r6)
            if (r23 == 0) goto L_0x00f1
            r23 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00f3
        L_0x00f1:
            r23 = 524288(0x80000, float:7.34684E-40)
        L_0x00f3:
            r3 = r3 | r23
            goto L_0x00f8
        L_0x00f6:
            r6 = r39
        L_0x00f8:
            r4 = r8 & 128(0x80, float:1.794E-43)
            if (r4 == 0) goto L_0x0103
            r23 = 12582912(0xc00000, float:1.7632415E-38)
            r3 = r3 | r23
            r5 = r40
            goto L_0x0118
        L_0x0103:
            r23 = 29360128(0x1c00000, float:7.052966E-38)
            r23 = r10 & r23
            r5 = r40
            if (r23 != 0) goto L_0x0118
            boolean r24 = r7.changed((int) r5)
            if (r24 == 0) goto L_0x0114
            r24 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0116
        L_0x0114:
            r24 = 4194304(0x400000, float:5.877472E-39)
        L_0x0116:
            r3 = r3 | r24
        L_0x0118:
            r2 = r8 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x0123
            r25 = 100663296(0x6000000, float:2.4074124E-35)
            r3 = r3 | r25
            r5 = r41
            goto L_0x0138
        L_0x0123:
            r25 = 234881024(0xe000000, float:1.5777218E-30)
            r25 = r10 & r25
            r5 = r41
            if (r25 != 0) goto L_0x0138
            boolean r25 = r7.changed((java.lang.Object) r5)
            if (r25 == 0) goto L_0x0134
            r25 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0136
        L_0x0134:
            r25 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0136:
            r3 = r3 | r25
        L_0x0138:
            r5 = r8 & 512(0x200, float:7.175E-43)
            if (r5 == 0) goto L_0x0143
            r25 = 805306368(0x30000000, float:4.656613E-10)
            r3 = r3 | r25
            r6 = r42
            goto L_0x0158
        L_0x0143:
            r25 = 1879048192(0x70000000, float:1.58456325E29)
            r25 = r10 & r25
            r6 = r42
            if (r25 != 0) goto L_0x0158
            boolean r25 = r7.changed((java.lang.Object) r6)
            if (r25 == 0) goto L_0x0154
            r25 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0156
        L_0x0154:
            r25 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0156:
            r3 = r3 | r25
        L_0x0158:
            r6 = r8 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L_0x0161
            r23 = r9 | 6
            r10 = r43
            goto L_0x0177
        L_0x0161:
            r25 = r9 & 14
            r10 = r43
            if (r25 != 0) goto L_0x0175
            boolean r25 = r7.changed((java.lang.Object) r10)
            if (r25 == 0) goto L_0x0170
            r23 = 4
            goto L_0x0172
        L_0x0170:
            r23 = 2
        L_0x0172:
            r23 = r9 | r23
            goto L_0x0177
        L_0x0175:
            r23 = r9
        L_0x0177:
            r10 = r8 & 2048(0x800, float:2.87E-42)
            if (r10 == 0) goto L_0x017e
            r23 = r23 | 48
            goto L_0x018f
        L_0x017e:
            r25 = r9 & 112(0x70, float:1.57E-43)
            r12 = r44
            if (r25 != 0) goto L_0x018f
            boolean r25 = r7.changed((java.lang.Object) r12)
            if (r25 == 0) goto L_0x018b
            goto L_0x018d
        L_0x018b:
            r16 = r17
        L_0x018d:
            r23 = r23 | r16
        L_0x018f:
            r12 = r23
            r14 = r8 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0198
            r12 = r12 | 384(0x180, float:5.38E-43)
            goto L_0x01a7
        L_0x0198:
            r14 = r9 & 896(0x380, float:1.256E-42)
            if (r14 != 0) goto L_0x01a7
            boolean r14 = r7.changedInstance(r11)
            if (r14 == 0) goto L_0x01a3
            goto L_0x01a5
        L_0x01a3:
            r18 = r19
        L_0x01a5:
            r12 = r12 | r18
        L_0x01a7:
            r14 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r14 = r14 & r3
            r8 = 306783378(0x12492492, float:6.3469493E-28)
            if (r14 != r8) goto L_0x01cf
            r8 = r12 & 731(0x2db, float:1.024E-42)
            r14 = 146(0x92, float:2.05E-43)
            if (r8 != r14) goto L_0x01cf
            boolean r8 = r7.getSkipping()
            if (r8 != 0) goto L_0x01bd
            goto L_0x01cf
        L_0x01bd:
            r7.skipToGroupEnd()
            r12 = r36
            r8 = r40
            r9 = r41
            r10 = r42
            r25 = r43
            r26 = r44
            r11 = r7
            goto L_0x03c6
        L_0x01cf:
            if (r4 == 0) goto L_0x01d5
            r4 = 0
            r18 = r4
            goto L_0x01d7
        L_0x01d5:
            r18 = r40
        L_0x01d7:
            r4 = 0
            if (r2 == 0) goto L_0x01dd
            r19 = r4
            goto L_0x01df
        L_0x01dd:
            r19 = r41
        L_0x01df:
            if (r5 == 0) goto L_0x01e4
            r23 = r4
            goto L_0x01e6
        L_0x01e4:
            r23 = r42
        L_0x01e6:
            if (r6 == 0) goto L_0x01eb
            r25 = r4
            goto L_0x01ed
        L_0x01eb:
            r25 = r43
        L_0x01ed:
            if (r10 == 0) goto L_0x01f2
            r26 = r4
            goto L_0x01f4
        L_0x01f2:
            r26 = r44
        L_0x01f4:
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x0203
            java.lang.String r2 = "androidx.compose.foundation.lazy.LazyList (LazyList.kt:49)"
            r4 = 620764179(0x25001c13, float:1.1111742E-16)
            androidx.compose.runtime.ComposerKt.traceEventStart(r4, r3, r12, r2)
        L_0x0203:
            androidx.compose.foundation.gestures.ScrollableDefaults r2 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE
            r14 = 6
            androidx.compose.foundation.OverscrollEffect r10 = r2.overscrollEffect(r7, r14)
            int r2 = r3 >> 3
            r4 = r2 & 14
            int r5 = r12 >> 3
            r5 = r5 & 112(0x70, float:1.57E-43)
            r5 = r5 | r4
            androidx.compose.foundation.lazy.LazyListItemProvider r8 = androidx.compose.foundation.lazy.LazyListItemProviderKt.rememberLazyListItemProvider(r0, r11, r7, r5)
            int r5 = r3 >> 9
            r5 = r5 & 112(0x70, float:1.57E-43)
            r4 = r4 | r5
            androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState r24 = androidx.compose.foundation.lazy.LazyListSemanticsKt.rememberLazyListSemanticState(r0, r13, r7, r4)
            r4 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r7.startReplaceableGroup(r4)
            java.lang.String r4 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r7, r4)
            java.lang.Object r4 = r7.rememberedValue()
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r5 = r5.getEmpty()
            if (r4 != r5) goto L_0x023f
            androidx.compose.foundation.lazy.LazyListBeyondBoundsInfo r4 = new androidx.compose.foundation.lazy.LazyListBeyondBoundsInfo
            r4.<init>()
            r7.updateRememberedValue(r4)
        L_0x023f:
            r7.endReplaceableGroup()
            r27 = r4
            androidx.compose.foundation.lazy.LazyListBeyondBoundsInfo r27 = (androidx.compose.foundation.lazy.LazyListBeyondBoundsInfo) r27
            r4 = 773894976(0x2e20b340, float:3.6538994E-11)
            r7.startReplaceableGroup(r4)
            java.lang.String r4 = "CC(rememberCoroutineScope)476@19869L144:Effects.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r7, r4)
            r4 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r7.startReplaceableGroup(r4)
            java.lang.String r4 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r7, r4)
            java.lang.Object r4 = r7.rememberedValue()
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r5 = r5.getEmpty()
            if (r4 != r5) goto L_0x0279
            kotlin.coroutines.EmptyCoroutineContext r4 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlin.coroutines.CoroutineContext r4 = (kotlin.coroutines.CoroutineContext) r4
            kotlinx.coroutines.CoroutineScope r4 = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(r4, r7)
            androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller r5 = new androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller
            r5.<init>(r4)
            r7.updateRememberedValue(r5)
            r4 = r5
        L_0x0279:
            r7.endReplaceableGroup()
            androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller r4 = (androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) r4
            kotlinx.coroutines.CoroutineScope r4 = r4.getCoroutineScope()
            r7.endReplaceableGroup()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r37)
            r6 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r7.startReplaceableGroup(r6)
            java.lang.String r6 = "CC(remember)P(1,2):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r7, r6)
            boolean r6 = r7.changed((java.lang.Object) r0)
            boolean r5 = r7.changed((java.lang.Object) r5)
            r5 = r5 | r6
            java.lang.Object r6 = r7.rememberedValue()
            if (r5 != 0) goto L_0x02ab
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r5 = r5.getEmpty()
            if (r6 != r5) goto L_0x02b3
        L_0x02ab:
            androidx.compose.foundation.lazy.LazyListItemPlacementAnimator r6 = new androidx.compose.foundation.lazy.LazyListItemPlacementAnimator
            r6.<init>(r4, r13)
            r7.updateRememberedValue(r6)
        L_0x02b3:
            r7.endReplaceableGroup()
            androidx.compose.foundation.lazy.LazyListItemPlacementAnimator r6 = (androidx.compose.foundation.lazy.LazyListItemPlacementAnimator) r6
            r0.setPlacementAnimator$foundation_release(r6)
            r5 = r3 & 112(0x70, float:1.57E-43)
            int r4 = androidx.compose.runtime.collection.MutableVector.$stable
            int r4 = r4 << r14
            r4 = r4 | r5
            int r14 = r3 << 3
            r41 = r5
            r5 = r14 & 7168(0x1c00, float:1.0045E-41)
            r4 = r4 | r5
            r5 = r14 & r20
            r4 = r4 | r5
            r5 = r14 & r21
            r4 = r4 | r5
            r5 = r2 & r22
            r4 = r4 | r5
            r5 = 29360128(0x1c00000, float:7.052966E-38)
            r2 = r2 & r5
            r2 = r2 | r4
            int r4 = r12 << 24
            r5 = 234881024(0xe000000, float:1.5777218E-30)
            r5 = r5 & r4
            r2 = r2 | r5
            r5 = 1879048192(0x70000000, float:1.58456325E29)
            r4 = r4 & r5
            r16 = r2 | r4
            int r2 = r3 >> 27
            r2 = r2 & 14
            r17 = r2 | 64
            r22 = 0
            r2 = r8
            r14 = r3
            r3 = r34
            r4 = r27
            r12 = r41
            r5 = r35
            r28 = r6
            r6 = r36
            r41 = r7
            r7 = r37
            r1 = r8
            r8 = r18
            r9 = r19
            r29 = r10
            r10 = r25
            r11 = r26
            r30 = r12
            r12 = r23
            r13 = r28
            r31 = r14
            r28 = 6
            r14 = r41
            r15 = r16
            r16 = r17
            r17 = r22
            kotlin.jvm.functions.Function2 r10 = rememberLazyListMeasurePolicy(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r11 = r41
            r12 = r30
            ScrollPositionUpdater(r1, r0, r11, r12)
            if (r37 == 0) goto L_0x0327
            androidx.compose.foundation.gestures.Orientation r2 = androidx.compose.foundation.gestures.Orientation.Vertical
            goto L_0x0329
        L_0x0327:
            androidx.compose.foundation.gestures.Orientation r2 = androidx.compose.foundation.gestures.Orientation.Horizontal
        L_0x0329:
            r13 = r2
            androidx.compose.ui.layout.RemeasurementModifier r2 = r34.getRemeasurementModifier$foundation_release()
            androidx.compose.ui.Modifier r2 = (androidx.compose.ui.Modifier) r2
            r3 = r1
            r1 = r33
            androidx.compose.ui.Modifier r2 = r1.then(r2)
            androidx.compose.foundation.lazy.AwaitFirstLayoutModifier r4 = r34.getAwaitLayoutModifier$foundation_release()
            androidx.compose.ui.Modifier r4 = (androidx.compose.ui.Modifier) r4
            androidx.compose.ui.Modifier r2 = r2.then(r4)
            r14 = r3
            androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider r14 = (androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider) r14
            r15 = r31
            int r3 = r15 >> 6
            r3 = r3 & r20
            int r4 = r15 << 6
            r4 = r4 & r21
            r9 = r3 | r4
            r3 = r14
            r4 = r24
            r5 = r13
            r6 = r39
            r7 = r36
            r8 = r11
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt.lazyLayoutSemantics(r2, r3, r4, r5, r6, r7, r8, r9)
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.ClipScrollableContainerKt.clipScrollableContainer(r2, r13)
            int r3 = androidx.compose.runtime.collection.MutableVector.$stable
            int r3 = r3 << 6
            r3 = r3 | r12
            r4 = r15 & 7168(0x1c00, float:1.0045E-41)
            r8 = r3 | r4
            r3 = r34
            r4 = r27
            r5 = r36
            r6 = r13
            r7 = r11
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.lazy.LazyListBeyondBoundsModifierKt.lazyListBeyondBoundsModifier(r2, r3, r4, r5, r6, r7, r8)
            r5 = r29
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.OverscrollKt.overscroll(r2, r5)
            androidx.compose.foundation.gestures.ScrollableDefaults r3 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE
            androidx.compose.runtime.ProvidableCompositionLocal r4 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            androidx.compose.runtime.CompositionLocal r4 = (androidx.compose.runtime.CompositionLocal) r4
            r6 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r7 = "CC:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r11, r6, r7)
            java.lang.Object r4 = r11.consume(r4)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r11)
            androidx.compose.ui.unit.LayoutDirection r4 = (androidx.compose.ui.unit.LayoutDirection) r4
            r12 = r36
            boolean r7 = r3.reverseDirection(r4, r13, r12)
            androidx.compose.foundation.interaction.MutableInteractionSource r9 = r34.getInternalInteractionSource$foundation_release()
            r3 = r0
            androidx.compose.foundation.gestures.ScrollableState r3 = (androidx.compose.foundation.gestures.ScrollableState) r3
            r4 = r13
            r6 = r39
            r8 = r38
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.gestures.ScrollableKt.scrollable(r2, r3, r4, r5, r6, r7, r8, r9)
            androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState r5 = r34.getPrefetchState$foundation_release()
            r8 = 0
            r9 = 0
            r3 = r14
            r6 = r10
            r7 = r11
            androidx.compose.foundation.lazy.layout.LazyLayoutKt.LazyLayout(r3, r4, r5, r6, r7, r8, r9)
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x03c0
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x03c0:
            r8 = r18
            r9 = r19
            r10 = r23
        L_0x03c6:
            androidx.compose.runtime.ScopeUpdateScope r15 = r11.endRestartGroup()
            if (r15 != 0) goto L_0x03cd
            goto L_0x03f9
        L_0x03cd:
            androidx.compose.foundation.lazy.LazyListKt$LazyList$1 r17 = new androidx.compose.foundation.lazy.LazyListKt$LazyList$1
            r0 = r17
            r1 = r33
            r2 = r34
            r3 = r35
            r4 = r36
            r5 = r37
            r6 = r38
            r7 = r39
            r11 = r25
            r12 = r26
            r13 = r45
            r14 = r47
            r32 = r15
            r15 = r48
            r16 = r49
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0 = r17
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1 = r32
            r1.updateScope(r0)
        L_0x03f9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListKt.LazyList(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, boolean, androidx.compose.foundation.gestures.FlingBehavior, boolean, int, androidx.compose.ui.Alignment$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final void ScrollPositionUpdater(LazyListItemProvider lazyListItemProvider, LazyListState lazyListState, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(3173830);
        ComposerKt.sourceInformation(startRestartGroup, "C(ScrollPositionUpdater):LazyList.kt#428nma");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed((Object) lazyListItemProvider) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed((Object) lazyListState) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(3173830, i, -1, "androidx.compose.foundation.lazy.ScrollPositionUpdater (LazyList.kt:141)");
            }
            if (lazyListItemProvider.getItemCount() > 0) {
                lazyListState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyListItemProvider);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new LazyListKt$ScrollPositionUpdater$1(lazyListItemProvider, lazyListState, i));
        }
    }

    private static final Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyListMeasurePolicy(LazyListItemProvider lazyListItemProvider, LazyListState lazyListState, LazyListBeyondBoundsInfo lazyListBeyondBoundsInfo, PaddingValues paddingValues, boolean z, boolean z2, int i, Alignment.Horizontal horizontal, Alignment.Vertical vertical, Arrangement.Horizontal horizontal2, Arrangement.Vertical vertical2, LazyListItemPlacementAnimator lazyListItemPlacementAnimator, Composer composer, int i2, int i3, int i4) {
        Composer composer2 = composer;
        int i5 = i4;
        composer2.startReplaceableGroup(-966179815);
        ComposerKt.sourceInformation(composer2, "C(rememberLazyListMeasurePolicy)P(6,9!1,2,8,5!2,10!1,11)177@7597L6680:LazyList.kt#428nma");
        Arrangement.Vertical vertical3 = null;
        Alignment.Horizontal horizontal3 = (i5 & 128) != 0 ? null : horizontal;
        Alignment.Vertical vertical4 = (i5 & 256) != 0 ? null : vertical;
        Arrangement.Horizontal horizontal4 = (i5 & 512) != 0 ? null : horizontal2;
        if ((i5 & 1024) == 0) {
            vertical3 = vertical2;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-966179815, i2, i3, "androidx.compose.foundation.lazy.rememberLazyListMeasurePolicy (LazyList.kt:152)");
        }
        Object[] objArr = {lazyListState, lazyListBeyondBoundsInfo, paddingValues, Boolean.valueOf(z), Boolean.valueOf(z2), horizontal3, vertical4, horizontal4, vertical3, lazyListItemPlacementAnimator};
        composer2.startReplaceableGroup(-568225417);
        ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean z3 = false;
        for (int i6 = 0; i6 < 10; i6++) {
            z3 |= composer2.changed(objArr[i6]);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z3 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LazyListKt$rememberLazyListMeasurePolicy$1$1(z2, paddingValues, z, lazyListState, lazyListItemProvider, vertical3, horizontal4, lazyListItemPlacementAnimator, lazyListBeyondBoundsInfo, i, horizontal3, vertical4);
            composer2.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2 = (Function2) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return function2;
    }
}
