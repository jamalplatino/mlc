package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a´\u0001\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0013\b\u0002\u0010\f\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\u000e2\u0013\b\u0002\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\u000e2\u0013\b\u0002\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\u000e2\u0013\b\u0002\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0017\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\t0\u001a¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0001\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u00132\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\u000e2\u0017\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\t0\u001a¢\u0006\u0002\b\u000e2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\u000e2\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\u000e2\u0006\u0010\u0017\u001a\u00020\u00182\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\u000eH\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u001c\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"FabSpacing", "Landroidx/compose/ui/unit/Dp;", "F", "LocalFabPlacement", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material3/FabPlacement;", "getLocalFabPlacement", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "Scaffold", "", "modifier", "Landroidx/compose/ui/Modifier;", "topBar", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "bottomBar", "snackbarHost", "floatingActionButton", "floatingActionButtonPosition", "Landroidx/compose/material3/FabPosition;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "contentWindowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/PaddingValues;", "Scaffold-TvnljyQ", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;IJJLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ScaffoldLayout", "fabPosition", "snackbar", "fab", "ScaffoldLayout-FMILGgc", "(ILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Scaffold.kt */
public final class ScaffoldKt {
    /* access modifiers changed from: private */
    public static final float FabSpacing = Dp.m5626constructorimpl((float) 16);
    private static final ProvidableCompositionLocal<FabPlacement> LocalFabPlacement = CompositionLocalKt.staticCompositionLocalOf(ScaffoldKt$LocalFabPlacement$1.INSTANCE);

    public static final ProvidableCompositionLocal<FabPlacement> getLocalFabPlacement() {
        return LocalFabPlacement;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0287  */
    /* JADX WARNING: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0127  */
    /* renamed from: Scaffold-TvnljyQ  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1517ScaffoldTvnljyQ(androidx.compose.ui.Modifier r28, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r29, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r30, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r31, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r32, int r33, long r34, long r36, androidx.compose.foundation.layout.WindowInsets r38, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.PaddingValues, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r39, androidx.compose.runtime.Composer r40, int r41, int r42) {
        /*
            r12 = r39
            r13 = r41
            r14 = r42
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = -1219521777(0xffffffffb74f930f, float:-1.2372401E-5)
            r1 = r40
            androidx.compose.runtime.Composer r1 = r1.startRestartGroup(r0)
            java.lang.String r2 = "C(Scaffold)P(7,9!1,8,5,6:c#material3.FabPosition,1:c#ui.graphics.Color,3:c#ui.graphics.Color,4)80@4062L11,81@4112L31,82@4202L19,85@4280L405:Scaffold.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r2)
            r2 = r14 & 1
            if (r2 == 0) goto L_0x0024
            r3 = r13 | 6
            r4 = r3
            r3 = r28
            goto L_0x0038
        L_0x0024:
            r3 = r13 & 14
            if (r3 != 0) goto L_0x0035
            r3 = r28
            boolean r4 = r1.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x0032
            r4 = 4
            goto L_0x0033
        L_0x0032:
            r4 = 2
        L_0x0033:
            r4 = r4 | r13
            goto L_0x0038
        L_0x0035:
            r3 = r28
            r4 = r13
        L_0x0038:
            r5 = r14 & 2
            if (r5 == 0) goto L_0x003f
            r4 = r4 | 48
            goto L_0x0052
        L_0x003f:
            r6 = r13 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0052
            r6 = r29
            boolean r7 = r1.changedInstance(r6)
            if (r7 == 0) goto L_0x004e
            r7 = 32
            goto L_0x0050
        L_0x004e:
            r7 = 16
        L_0x0050:
            r4 = r4 | r7
            goto L_0x0054
        L_0x0052:
            r6 = r29
        L_0x0054:
            r7 = r14 & 4
            if (r7 == 0) goto L_0x005b
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x006e
        L_0x005b:
            r8 = r13 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x006e
            r8 = r30
            boolean r9 = r1.changedInstance(r8)
            if (r9 == 0) goto L_0x006a
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x006c
        L_0x006a:
            r9 = 128(0x80, float:1.794E-43)
        L_0x006c:
            r4 = r4 | r9
            goto L_0x0070
        L_0x006e:
            r8 = r30
        L_0x0070:
            r9 = r14 & 8
            if (r9 == 0) goto L_0x0077
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x008a
        L_0x0077:
            r10 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r10 != 0) goto L_0x008a
            r10 = r31
            boolean r11 = r1.changedInstance(r10)
            if (r11 == 0) goto L_0x0086
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0088
        L_0x0086:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0088:
            r4 = r4 | r11
            goto L_0x008c
        L_0x008a:
            r10 = r31
        L_0x008c:
            r11 = r14 & 16
            if (r11 == 0) goto L_0x0093
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a9
        L_0x0093:
            r15 = 57344(0xe000, float:8.0356E-41)
            r15 = r15 & r13
            if (r15 != 0) goto L_0x00a9
            r15 = r32
            boolean r16 = r1.changedInstance(r15)
            if (r16 == 0) goto L_0x00a4
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a6
        L_0x00a4:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x00a6:
            r4 = r4 | r16
            goto L_0x00ab
        L_0x00a9:
            r15 = r32
        L_0x00ab:
            r16 = r14 & 32
            if (r16 == 0) goto L_0x00b6
            r17 = 196608(0x30000, float:2.75506E-40)
            r4 = r4 | r17
            r0 = r33
            goto L_0x00cb
        L_0x00b6:
            r17 = 458752(0x70000, float:6.42848E-40)
            r17 = r13 & r17
            r0 = r33
            if (r17 != 0) goto L_0x00cb
            boolean r18 = r1.changed((int) r0)
            if (r18 == 0) goto L_0x00c7
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c9
        L_0x00c7:
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x00c9:
            r4 = r4 | r18
        L_0x00cb:
            r18 = 3670016(0x380000, float:5.142788E-39)
            r18 = r13 & r18
            if (r18 != 0) goto L_0x00e7
            r18 = r14 & 64
            r40 = r11
            r10 = r34
            if (r18 != 0) goto L_0x00e2
            boolean r18 = r1.changed((long) r10)
            if (r18 == 0) goto L_0x00e2
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e4
        L_0x00e2:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x00e4:
            r4 = r4 | r18
            goto L_0x00eb
        L_0x00e7:
            r40 = r11
            r10 = r34
        L_0x00eb:
            r18 = 29360128(0x1c00000, float:7.052966E-38)
            r18 = r13 & r18
            if (r18 != 0) goto L_0x0104
            r0 = r14 & 128(0x80, float:1.794E-43)
            r10 = r36
            if (r0 != 0) goto L_0x0100
            boolean r0 = r1.changed((long) r10)
            if (r0 == 0) goto L_0x0100
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0102
        L_0x0100:
            r0 = 4194304(0x400000, float:5.877472E-39)
        L_0x0102:
            r4 = r4 | r0
            goto L_0x0106
        L_0x0104:
            r10 = r36
        L_0x0106:
            r0 = 234881024(0xe000000, float:1.5777218E-30)
            r0 = r0 & r13
            if (r0 != 0) goto L_0x0121
            r0 = r14 & 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L_0x011a
            r0 = r38
            boolean r18 = r1.changed((java.lang.Object) r0)
            if (r18 == 0) goto L_0x011c
            r18 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011e
        L_0x011a:
            r0 = r38
        L_0x011c:
            r18 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011e:
            r4 = r4 | r18
            goto L_0x0123
        L_0x0121:
            r0 = r38
        L_0x0123:
            r0 = r14 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x012b
            r0 = 805306368(0x30000000, float:4.656613E-10)
        L_0x0129:
            r4 = r4 | r0
            goto L_0x013c
        L_0x012b:
            r0 = 1879048192(0x70000000, float:1.58456325E29)
            r0 = r0 & r13
            if (r0 != 0) goto L_0x013c
            boolean r0 = r1.changedInstance(r12)
            if (r0 == 0) goto L_0x0139
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0129
        L_0x0139:
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0129
        L_0x013c:
            r0 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r0 = r0 & r4
            r3 = 306783378(0x12492492, float:6.3469493E-28)
            if (r0 != r3) goto L_0x015e
            boolean r0 = r1.getSkipping()
            if (r0 != 0) goto L_0x014c
            goto L_0x015e
        L_0x014c:
            r1.skipToGroupEnd()
            r2 = r28
            r4 = r31
            r13 = r38
            r3 = r8
            r11 = r10
            r5 = r15
            r8 = r33
            r9 = r34
            goto L_0x0280
        L_0x015e:
            r1.startDefaults()
            r0 = r13 & 1
            r3 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r18 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r19 = -3670017(0xffffffffffc7ffff, float:NaN)
            if (r0 == 0) goto L_0x0199
            boolean r0 = r1.getDefaultsInvalid()
            if (r0 == 0) goto L_0x0175
            goto L_0x0199
        L_0x0175:
            r1.skipToGroupEnd()
            r0 = r14 & 64
            if (r0 == 0) goto L_0x017e
            r4 = r4 & r19
        L_0x017e:
            r0 = r14 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0184
            r4 = r4 & r18
        L_0x0184:
            r0 = r14 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0189
            r4 = r4 & r3
        L_0x0189:
            r0 = r28
            r9 = r38
            r2 = r6
            r5 = r8
            r7 = r15
            r6 = r31
            r8 = r33
            r15 = r4
            r3 = r34
            goto L_0x0217
        L_0x0199:
            if (r2 == 0) goto L_0x01a0
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            goto L_0x01a2
        L_0x01a0:
            r0 = r28
        L_0x01a2:
            if (r5 == 0) goto L_0x01ab
            androidx.compose.material3.ComposableSingletons$ScaffoldKt r2 = androidx.compose.material3.ComposableSingletons$ScaffoldKt.INSTANCE
            kotlin.jvm.functions.Function2 r2 = r2.m1266getLambda1$material3_release()
            goto L_0x01ac
        L_0x01ab:
            r2 = r6
        L_0x01ac:
            if (r7 == 0) goto L_0x01b5
            androidx.compose.material3.ComposableSingletons$ScaffoldKt r5 = androidx.compose.material3.ComposableSingletons$ScaffoldKt.INSTANCE
            kotlin.jvm.functions.Function2 r5 = r5.m1267getLambda2$material3_release()
            goto L_0x01b6
        L_0x01b5:
            r5 = r8
        L_0x01b6:
            if (r9 == 0) goto L_0x01bf
            androidx.compose.material3.ComposableSingletons$ScaffoldKt r6 = androidx.compose.material3.ComposableSingletons$ScaffoldKt.INSTANCE
            kotlin.jvm.functions.Function2 r6 = r6.m1268getLambda3$material3_release()
            goto L_0x01c1
        L_0x01bf:
            r6 = r31
        L_0x01c1:
            if (r40 == 0) goto L_0x01ca
            androidx.compose.material3.ComposableSingletons$ScaffoldKt r7 = androidx.compose.material3.ComposableSingletons$ScaffoldKt.INSTANCE
            kotlin.jvm.functions.Function2 r7 = r7.m1269getLambda4$material3_release()
            goto L_0x01cb
        L_0x01ca:
            r7 = r15
        L_0x01cb:
            if (r16 == 0) goto L_0x01d4
            androidx.compose.material3.FabPosition$Companion r8 = androidx.compose.material3.FabPosition.Companion
            int r8 = r8.m1358getEndERTFSPs()
            goto L_0x01d6
        L_0x01d4:
            r8 = r33
        L_0x01d6:
            r9 = r14 & 64
            r15 = 6
            if (r9 == 0) goto L_0x01eb
            androidx.compose.material3.MaterialTheme r9 = androidx.compose.material3.MaterialTheme.INSTANCE
            androidx.compose.material3.ColorScheme r9 = r9.getColorScheme(r1, r15)
            long r20 = r9.m1182getBackground0d7_KjU()
            r4 = r4 & r19
            r9 = r4
            r3 = r20
            goto L_0x01ee
        L_0x01eb:
            r9 = r4
            r3 = r34
        L_0x01ee:
            r15 = r14 & 128(0x80, float:1.794E-43)
            if (r15 == 0) goto L_0x01fc
            int r10 = r9 >> 18
            r10 = r10 & 14
            long r10 = androidx.compose.material3.ColorSchemeKt.m1242contentColorForek8zF_U(r3, r1, r10)
            r9 = r9 & r18
        L_0x01fc:
            r15 = r14 & 256(0x100, float:3.59E-43)
            if (r15 == 0) goto L_0x0212
            androidx.compose.material3.ScaffoldDefaults r15 = androidx.compose.material3.ScaffoldDefaults.INSTANCE
            r16 = r0
            r0 = 6
            androidx.compose.foundation.layout.WindowInsets r0 = r15.getContentWindowInsets(r1, r0)
            r15 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r9 = r9 & r15
            r15 = r9
            r9 = r0
            r0 = r16
            goto L_0x0217
        L_0x0212:
            r16 = r0
            r15 = r9
            r9 = r38
        L_0x0217:
            r1.endDefaults()
            boolean r16 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r16 == 0) goto L_0x022a
            r12 = -1
            java.lang.String r13 = "androidx.compose.material3.Scaffold (Scaffold.kt:73)"
            r14 = -1219521777(0xffffffffb74f930f, float:-1.2372401E-5)
            androidx.compose.runtime.ComposerKt.traceEventStart(r14, r15, r12, r13)
        L_0x022a:
            r16 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            androidx.compose.material3.ScaffoldKt$Scaffold$1 r12 = new androidx.compose.material3.ScaffoldKt$Scaffold$1
            r28 = r12
            r29 = r8
            r30 = r2
            r31 = r39
            r32 = r6
            r33 = r7
            r34 = r9
            r35 = r5
            r36 = r15
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36)
            r13 = -1979205334(0xffffffff8a07b92a, float:-6.534839E-33)
            r14 = 1
            androidx.compose.runtime.internal.ComposableLambda r12 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r1, r13, r14, r12)
            r24 = r12
            kotlin.jvm.functions.Function2 r24 = (kotlin.jvm.functions.Function2) r24
            r12 = r15 & 14
            r13 = 12582912(0xc00000, float:1.7632415E-38)
            r12 = r12 | r13
            int r13 = r15 >> 12
            r14 = r13 & 896(0x380, float:1.256E-42)
            r12 = r12 | r14
            r13 = r13 & 7168(0x1c00, float:1.0045E-41)
            r26 = r12 | r13
            r27 = 114(0x72, float:1.6E-43)
            r15 = r0
            r17 = r3
            r19 = r10
            r25 = r1
            androidx.compose.material3.SurfaceKt.m1641SurfaceT9BRK9s(r15, r16, r17, r19, r21, r22, r23, r24, r25, r26, r27)
            boolean r12 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r12 == 0) goto L_0x0278
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0278:
            r13 = r9
            r11 = r10
            r9 = r3
            r3 = r5
            r4 = r6
            r5 = r7
            r6 = r2
            r2 = r0
        L_0x0280:
            androidx.compose.runtime.ScopeUpdateScope r15 = r1.endRestartGroup()
            if (r15 != 0) goto L_0x0287
            goto L_0x02a1
        L_0x0287:
            androidx.compose.material3.ScaffoldKt$Scaffold$2 r16 = new androidx.compose.material3.ScaffoldKt$Scaffold$2
            r0 = r16
            r1 = r2
            r2 = r6
            r6 = r8
            r7 = r9
            r9 = r11
            r11 = r13
            r12 = r39
            r13 = r41
            r14 = r42
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r11, r12, r13, r14)
            r0 = r16
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r15.updateScope(r0)
        L_0x02a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ScaffoldKt.m1517ScaffoldTvnljyQ(androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, int, long, long, androidx.compose.foundation.layout.WindowInsets, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: ScaffoldLayout-FMILGgc  reason: not valid java name */
    public static final void m1518ScaffoldLayoutFMILGgc(int i, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, WindowInsets windowInsets, Function2<? super Composer, ? super Integer, Unit> function24, Composer composer, int i2) {
        int i3;
        int i4;
        int i5 = i2;
        Composer startRestartGroup = composer.startRestartGroup(-975511942);
        ComposerKt.sourceInformation(startRestartGroup, "C(ScaffoldLayout)P(4:c#material3.FabPosition,6,1,5,3,2)121@5603L6544,121@5586L6561:Scaffold.kt#uh7d8r");
        if ((i5 & 14) == 0) {
            i3 = (startRestartGroup.changed(i) ? 4 : 2) | i5;
        } else {
            int i6 = i;
            i3 = i5;
        }
        if ((i5 & 112) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        } else {
            Function2<? super Composer, ? super Integer, Unit> function25 = function2;
        }
        if ((i5 & 896) == 0) {
            i3 |= startRestartGroup.changedInstance(function3) ? 256 : 128;
        } else {
            Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function32 = function3;
        }
        if ((i5 & 7168) == 0) {
            i3 |= startRestartGroup.changedInstance(function22) ? 2048 : 1024;
        } else {
            Function2<? super Composer, ? super Integer, Unit> function26 = function22;
        }
        if ((57344 & i5) == 0) {
            i3 |= startRestartGroup.changedInstance(function23) ? 16384 : 8192;
        } else {
            Function2<? super Composer, ? super Integer, Unit> function27 = function23;
        }
        WindowInsets windowInsets2 = windowInsets;
        if ((458752 & i5) == 0) {
            i3 |= startRestartGroup.changed((Object) windowInsets2) ? 131072 : 65536;
        }
        Function2<? super Composer, ? super Integer, Unit> function28 = function24;
        if ((3670016 & i5) == 0) {
            i3 |= startRestartGroup.changedInstance(function28) ? 1048576 : 524288;
        }
        if ((2995931 & i3) != 599186 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-975511942, i3, -1, "androidx.compose.material3.ScaffoldLayout (Scaffold.kt:111)");
            }
            Object[] objArr = {function2, function22, windowInsets, function23, FabPosition.m1350boximpl(i), function24, function3};
            startRestartGroup.startReplaceableGroup(-568225417);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean z = false;
            for (int i7 = 0; i7 < 7; i7++) {
                z |= startRestartGroup.changed(objArr[i7]);
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.Companion.getEmpty()) {
                i4 = 0;
                rememberedValue = new ScaffoldKt$ScaffoldLayout$1$1(function2, function22, function23, i, windowInsets, function24, i3, function3);
                startRestartGroup.updateRememberedValue(rememberedValue);
            } else {
                i4 = 0;
            }
            startRestartGroup.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout((Modifier) null, (Function2) rememberedValue, startRestartGroup, i4, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ScaffoldKt$ScaffoldLayout$2(i, function2, function3, function22, function23, windowInsets, function24, i2));
        }
    }
}
