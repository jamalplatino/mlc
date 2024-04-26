package androidx.compose.material3;

import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001ah\u0010\n\u001a\u00020\u000b2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0002\b\u000e2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0002\b\u000e2\u0013\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001aj\u0010\u0018\u001a\u00020\u000b2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0002\b\u000e2\u0013\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u000e2\u0013\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0014H\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0017\u001am\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\u00142\b\b\u0002\u0010&\u001a\u00020\u00142\b\b\u0002\u0010'\u001a\u00020\u00142\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001a\u0001\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020 2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u000e2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u000e2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\u00142\b\b\u0002\u0010&\u001a\u00020\u00142\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0011\u0010*\u001a\r\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010,\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0005\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0006\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0007\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\b\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\t\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"ContainerMaxWidth", "Landroidx/compose/ui/unit/Dp;", "F", "HeightToFirstLine", "HorizontalSpacing", "HorizontalSpacingButtonSide", "LongButtonVerticalOffset", "SeparateButtonExtraY", "SnackbarVerticalPadding", "TextEndExtraSpacing", "NewLineButtonSnackbar", "", "text", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "action", "dismissAction", "actionTextStyle", "Landroidx/compose/ui/text/TextStyle;", "actionContentColor", "Landroidx/compose/ui/graphics/Color;", "dismissActionContentColor", "NewLineButtonSnackbar-kKq0p4A", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JJLandroidx/compose/runtime/Composer;I)V", "OneRowSnackbar", "actionTextColor", "dismissActionColor", "OneRowSnackbar-kKq0p4A", "Snackbar", "snackbarData", "Landroidx/compose/material3/SnackbarData;", "modifier", "Landroidx/compose/ui/Modifier;", "actionOnNewLine", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "containerColor", "contentColor", "actionColor", "Snackbar-sDKtq54", "(Landroidx/compose/material3/SnackbarData;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJJJJLandroidx/compose/runtime/Composer;II)V", "content", "Snackbar-eQBnUkQ", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/graphics/Shape;JJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Snackbar.kt */
public final class SnackbarKt {
    /* access modifiers changed from: private */
    public static final float ContainerMaxWidth = Dp.m5626constructorimpl((float) 600);
    /* access modifiers changed from: private */
    public static final float HeightToFirstLine = Dp.m5626constructorimpl((float) 30);
    private static final float HorizontalSpacing = Dp.m5626constructorimpl((float) 16);
    private static final float HorizontalSpacingButtonSide;
    private static final float LongButtonVerticalOffset = Dp.m5626constructorimpl((float) 12);
    private static final float SeparateButtonExtraY = Dp.m5626constructorimpl((float) 2);
    private static final float SnackbarVerticalPadding = Dp.m5626constructorimpl((float) 6);
    /* access modifiers changed from: private */
    public static final float TextEndExtraSpacing;

    /* JADX WARNING: Removed duplicated region for block: B:109:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0119  */
    /* renamed from: Snackbar-eQBnUkQ  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1556SnackbareQBnUkQ(androidx.compose.ui.Modifier r24, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r25, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r26, boolean r27, androidx.compose.ui.graphics.Shape r28, long r29, long r31, long r33, long r35, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r37, androidx.compose.runtime.Composer r38, int r39, int r40) {
        /*
            r14 = r37
            r15 = r39
            r12 = r40
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            r0 = -1235788955(0xffffffffb6575b65, float:-3.2090695E-6)
            r1 = r38
            androidx.compose.runtime.Composer r1 = r1.startRestartGroup(r0)
            java.lang.String r2 = "C(Snackbar)P(8!1,6,2,9,3:c#ui.graphics.Color,5:c#ui.graphics.Color,1:c#ui.graphics.Color,7:c#ui.graphics.Color)99@4842L5,100@4894L5,101@4944L12,102@5007L18,103@5083L25,106@5154L1420:Snackbar.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r2)
            r2 = r12 & 1
            if (r2 == 0) goto L_0x0024
            r3 = r15 | 6
            r4 = r3
            r3 = r24
            goto L_0x0038
        L_0x0024:
            r3 = r15 & 14
            if (r3 != 0) goto L_0x0035
            r3 = r24
            boolean r4 = r1.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x0032
            r4 = 4
            goto L_0x0033
        L_0x0032:
            r4 = 2
        L_0x0033:
            r4 = r4 | r15
            goto L_0x0038
        L_0x0035:
            r3 = r24
            r4 = r15
        L_0x0038:
            r5 = r12 & 2
            if (r5 == 0) goto L_0x003f
            r4 = r4 | 48
            goto L_0x0052
        L_0x003f:
            r6 = r15 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0052
            r6 = r25
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
            r6 = r25
        L_0x0054:
            r7 = r12 & 4
            if (r7 == 0) goto L_0x005b
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x006e
        L_0x005b:
            r8 = r15 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x006e
            r8 = r26
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
            r8 = r26
        L_0x0070:
            r9 = r12 & 8
            if (r9 == 0) goto L_0x0077
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x008a
        L_0x0077:
            r10 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r10 != 0) goto L_0x008a
            r10 = r27
            boolean r11 = r1.changed((boolean) r10)
            if (r11 == 0) goto L_0x0086
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0088
        L_0x0086:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0088:
            r4 = r4 | r11
            goto L_0x008c
        L_0x008a:
            r10 = r27
        L_0x008c:
            r11 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r15
            if (r11 != 0) goto L_0x00a7
            r11 = r12 & 16
            if (r11 != 0) goto L_0x00a1
            r11 = r28
            boolean r13 = r1.changed((java.lang.Object) r11)
            if (r13 == 0) goto L_0x00a3
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a5
        L_0x00a1:
            r11 = r28
        L_0x00a3:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x00a5:
            r4 = r4 | r13
            goto L_0x00a9
        L_0x00a7:
            r11 = r28
        L_0x00a9:
            r13 = 458752(0x70000, float:6.42848E-40)
            r13 = r13 & r15
            if (r13 != 0) goto L_0x00c1
            r13 = r12 & 32
            r10 = r29
            if (r13 != 0) goto L_0x00bd
            boolean r13 = r1.changed((long) r10)
            if (r13 == 0) goto L_0x00bd
            r13 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bf
        L_0x00bd:
            r13 = 65536(0x10000, float:9.18355E-41)
        L_0x00bf:
            r4 = r4 | r13
            goto L_0x00c3
        L_0x00c1:
            r10 = r29
        L_0x00c3:
            r13 = 3670016(0x380000, float:5.142788E-39)
            r13 = r13 & r15
            if (r13 != 0) goto L_0x00db
            r13 = r12 & 64
            r10 = r31
            if (r13 != 0) goto L_0x00d7
            boolean r13 = r1.changed((long) r10)
            if (r13 == 0) goto L_0x00d7
            r13 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d9
        L_0x00d7:
            r13 = 524288(0x80000, float:7.34684E-40)
        L_0x00d9:
            r4 = r4 | r13
            goto L_0x00dd
        L_0x00db:
            r10 = r31
        L_0x00dd:
            r13 = 29360128(0x1c00000, float:7.052966E-38)
            r13 = r13 & r15
            if (r13 != 0) goto L_0x00f5
            r13 = r12 & 128(0x80, float:1.794E-43)
            r10 = r33
            if (r13 != 0) goto L_0x00f1
            boolean r13 = r1.changed((long) r10)
            if (r13 == 0) goto L_0x00f1
            r13 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f3
        L_0x00f1:
            r13 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f3:
            r4 = r4 | r13
            goto L_0x00f7
        L_0x00f5:
            r10 = r33
        L_0x00f7:
            r13 = 234881024(0xe000000, float:1.5777218E-30)
            r13 = r13 & r15
            if (r13 != 0) goto L_0x010f
            r13 = r12 & 256(0x100, float:3.59E-43)
            r10 = r35
            if (r13 != 0) goto L_0x010b
            boolean r13 = r1.changed((long) r10)
            if (r13 == 0) goto L_0x010b
            r13 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010d
        L_0x010b:
            r13 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010d:
            r4 = r4 | r13
            goto L_0x0111
        L_0x010f:
            r10 = r35
        L_0x0111:
            r13 = r12 & 512(0x200, float:7.175E-43)
            if (r13 == 0) goto L_0x0119
            r13 = 805306368(0x30000000, float:4.656613E-10)
        L_0x0117:
            r4 = r4 | r13
            goto L_0x012a
        L_0x0119:
            r13 = 1879048192(0x70000000, float:1.58456325E29)
            r13 = r13 & r15
            if (r13 != 0) goto L_0x012a
            boolean r13 = r1.changedInstance(r14)
            if (r13 == 0) goto L_0x0127
            r13 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0117
        L_0x0127:
            r13 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0117
        L_0x012a:
            r13 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r13 = r13 & r4
            r0 = 306783378(0x12492492, float:6.3469493E-28)
            if (r13 != r0) goto L_0x014b
            boolean r0 = r1.getSkipping()
            if (r0 != 0) goto L_0x013a
            goto L_0x014b
        L_0x013a:
            r1.skipToGroupEnd()
            r4 = r27
            r5 = r28
            r19 = r31
            r2 = r6
            r12 = r10
            r6 = r29
            r10 = r33
            goto L_0x0270
        L_0x014b:
            r1.startDefaults()
            r0 = r15 & 1
            r13 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r17 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r18 = -3670017(0xffffffffffc7ffff, float:NaN)
            r19 = -458753(0xfffffffffff8ffff, float:NaN)
            r20 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x0196
            boolean r0 = r1.getDefaultsInvalid()
            if (r0 == 0) goto L_0x0168
            goto L_0x0196
        L_0x0168:
            r1.skipToGroupEnd()
            r0 = r12 & 16
            if (r0 == 0) goto L_0x0171
            r4 = r4 & r20
        L_0x0171:
            r0 = r12 & 32
            if (r0 == 0) goto L_0x0177
            r4 = r4 & r19
        L_0x0177:
            r0 = r12 & 64
            if (r0 == 0) goto L_0x017d
            r4 = r4 & r18
        L_0x017d:
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0183
            r4 = r4 & r17
        L_0x0183:
            r0 = r12 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0188
            r4 = r4 & r13
        L_0x0188:
            r5 = r28
            r19 = r31
            r21 = r33
            r0 = r3
            r2 = r8
            r3 = r27
            r8 = r29
            goto L_0x01f7
        L_0x0196:
            if (r2 == 0) goto L_0x019d
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            goto L_0x019e
        L_0x019d:
            r0 = r3
        L_0x019e:
            r2 = 0
            if (r5 == 0) goto L_0x01a2
            r6 = r2
        L_0x01a2:
            if (r7 == 0) goto L_0x01a5
            goto L_0x01a6
        L_0x01a5:
            r2 = r8
        L_0x01a6:
            if (r9 == 0) goto L_0x01aa
            r3 = 0
            goto L_0x01ac
        L_0x01aa:
            r3 = r27
        L_0x01ac:
            r5 = r12 & 16
            r7 = 6
            if (r5 == 0) goto L_0x01ba
            androidx.compose.material3.SnackbarDefaults r5 = androidx.compose.material3.SnackbarDefaults.INSTANCE
            androidx.compose.ui.graphics.Shape r5 = r5.getShape(r1, r7)
            r4 = r4 & r20
            goto L_0x01bc
        L_0x01ba:
            r5 = r28
        L_0x01bc:
            r8 = r12 & 32
            if (r8 == 0) goto L_0x01c9
            androidx.compose.material3.SnackbarDefaults r8 = androidx.compose.material3.SnackbarDefaults.INSTANCE
            long r8 = r8.getColor(r1, r7)
            r4 = r4 & r19
            goto L_0x01cb
        L_0x01c9:
            r8 = r29
        L_0x01cb:
            r19 = r12 & 64
            if (r19 == 0) goto L_0x01d8
            androidx.compose.material3.SnackbarDefaults r13 = androidx.compose.material3.SnackbarDefaults.INSTANCE
            long r19 = r13.getContentColor(r1, r7)
            r4 = r4 & r18
            goto L_0x01da
        L_0x01d8:
            r19 = r31
        L_0x01da:
            r13 = r12 & 128(0x80, float:1.794E-43)
            if (r13 == 0) goto L_0x01e7
            androidx.compose.material3.SnackbarDefaults r13 = androidx.compose.material3.SnackbarDefaults.INSTANCE
            long r21 = r13.getActionContentColor(r1, r7)
            r4 = r4 & r17
            goto L_0x01e9
        L_0x01e7:
            r21 = r33
        L_0x01e9:
            r13 = r12 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L_0x01f7
            androidx.compose.material3.SnackbarDefaults r10 = androidx.compose.material3.SnackbarDefaults.INSTANCE
            long r10 = r10.getDismissActionContentColor(r1, r7)
            r7 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r4 = r4 & r7
        L_0x01f7:
            r1.endDefaults()
            boolean r7 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r7 == 0) goto L_0x020a
            r7 = -1
            java.lang.String r13 = "androidx.compose.material3.Snackbar (Snackbar.kt:94)"
            r12 = -1235788955(0xffffffffb6575b65, float:-3.2090695E-6)
            androidx.compose.runtime.ComposerKt.traceEventStart(r12, r4, r7, r13)
        L_0x020a:
            androidx.compose.material3.tokens.SnackbarTokens r12 = androidx.compose.material3.tokens.SnackbarTokens.INSTANCE
            float r12 = r12.m2304getContainerElevationD9Ej5fM()
            androidx.compose.material3.SnackbarKt$Snackbar$1 r13 = new androidx.compose.material3.SnackbarKt$Snackbar$1
            r24 = r13
            r25 = r6
            r26 = r37
            r27 = r2
            r28 = r21
            r30 = r10
            r32 = r4
            r33 = r3
            r24.<init>(r25, r26, r27, r28, r30, r32, r33)
            r7 = -1829663446(0xffffffff92f18d2a, float:-1.5244038E-27)
            r38 = r2
            r2 = 1
            androidx.compose.runtime.internal.ComposableLambda r2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r1, r7, r2, r13)
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            r7 = 12779520(0xc30000, float:1.7907922E-38)
            r13 = r4 & 14
            r7 = r7 | r13
            int r4 = r4 >> 9
            r13 = r4 & 112(0x70, float:1.57E-43)
            r7 = r7 | r13
            r13 = r4 & 896(0x380, float:1.256E-42)
            r7 = r7 | r13
            r4 = r4 & 7168(0x1c00, float:1.0045E-41)
            r4 = r4 | r7
            r7 = 80
            r24 = r0
            r25 = r5
            r26 = r8
            r28 = r19
            r13 = 0
            r30 = r13
            r31 = r12
            r12 = 0
            r32 = r12
            r33 = r2
            r34 = r1
            r35 = r4
            r36 = r7
            androidx.compose.material3.SurfaceKt.m1641SurfaceT9BRK9s(r24, r25, r26, r28, r30, r31, r32, r33, r34, r35, r36)
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x0267
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0267:
            r4 = r3
            r2 = r6
            r6 = r8
            r12 = r10
            r10 = r21
            r8 = r38
            r3 = r0
        L_0x0270:
            androidx.compose.runtime.ScopeUpdateScope r9 = r1.endRestartGroup()
            if (r9 != 0) goto L_0x0277
            goto L_0x0293
        L_0x0277:
            androidx.compose.material3.SnackbarKt$Snackbar$2 r17 = new androidx.compose.material3.SnackbarKt$Snackbar$2
            r0 = r17
            r1 = r3
            r3 = r8
            r23 = r9
            r8 = r19
            r14 = r37
            r15 = r39
            r16 = r40
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r10, r12, r14, r15, r16)
            r0 = r17
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1 = r23
            r1.updateScope(r0)
        L_0x0293:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnackbarKt.m1556SnackbareQBnUkQ(androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.ui.graphics.Shape, long, long, long, long, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x02a4  */
    /* JADX WARNING: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0120  */
    /* renamed from: Snackbar-sDKtq54  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1557SnackbarsDKtq54(androidx.compose.material3.SnackbarData r38, androidx.compose.ui.Modifier r39, boolean r40, androidx.compose.ui.graphics.Shape r41, long r42, long r44, long r46, long r48, long r50, androidx.compose.runtime.Composer r52, int r53, int r54) {
        /*
            r1 = r38
            r15 = r53
            r13 = r54
            java.lang.String r0 = "snackbarData"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = 274621471(0x105e641f, float:4.385891E-29)
            r2 = r52
            androidx.compose.runtime.Composer r2 = r2.startRestartGroup(r0)
            java.lang.String r3 = "C(Snackbar)P(8,6,2,7,3:c#ui.graphics.Color,4:c#ui.graphics.Color,0:c#ui.graphics.Color,1:c#ui.graphics.Color,5:c#ui.graphics.Color)201@9465L5,202@9517L5,203@9567L12,204@9623L11,205@9685L18,206@9761L25,236@10774L456:Snackbar.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r3)
            r3 = r13 & 1
            if (r3 == 0) goto L_0x0021
            r3 = r15 | 6
            goto L_0x0031
        L_0x0021:
            r3 = r15 & 14
            if (r3 != 0) goto L_0x0030
            boolean r3 = r2.changed((java.lang.Object) r1)
            if (r3 == 0) goto L_0x002d
            r3 = 4
            goto L_0x002e
        L_0x002d:
            r3 = 2
        L_0x002e:
            r3 = r3 | r15
            goto L_0x0031
        L_0x0030:
            r3 = r15
        L_0x0031:
            r4 = r13 & 2
            if (r4 == 0) goto L_0x0038
            r3 = r3 | 48
            goto L_0x004b
        L_0x0038:
            r5 = r15 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x004b
            r5 = r39
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
            r5 = r39
        L_0x004d:
            r6 = r13 & 4
            if (r6 == 0) goto L_0x0054
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0067
        L_0x0054:
            r7 = r15 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0067
            r7 = r40
            boolean r8 = r2.changed((boolean) r7)
            if (r8 == 0) goto L_0x0063
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r3 = r3 | r8
            goto L_0x0069
        L_0x0067:
            r7 = r40
        L_0x0069:
            r8 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0082
            r8 = r13 & 8
            if (r8 != 0) goto L_0x007c
            r8 = r41
            boolean r9 = r2.changed((java.lang.Object) r8)
            if (r9 == 0) goto L_0x007e
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007c:
            r8 = r41
        L_0x007e:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r3 = r3 | r9
            goto L_0x0084
        L_0x0082:
            r8 = r41
        L_0x0084:
            r9 = 57344(0xe000, float:8.0356E-41)
            r10 = r15 & r9
            if (r10 != 0) goto L_0x00a0
            r10 = r13 & 16
            if (r10 != 0) goto L_0x009a
            r10 = r42
            boolean r12 = r2.changed((long) r10)
            if (r12 == 0) goto L_0x009c
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009a:
            r10 = r42
        L_0x009c:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r3 = r3 | r12
            goto L_0x00a2
        L_0x00a0:
            r10 = r42
        L_0x00a2:
            r12 = 458752(0x70000, float:6.42848E-40)
            r14 = r15 & r12
            if (r14 != 0) goto L_0x00bb
            r14 = r13 & 32
            r9 = r44
            if (r14 != 0) goto L_0x00b7
            boolean r11 = r2.changed((long) r9)
            if (r11 == 0) goto L_0x00b7
            r11 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b9
        L_0x00b7:
            r11 = 65536(0x10000, float:9.18355E-41)
        L_0x00b9:
            r3 = r3 | r11
            goto L_0x00bd
        L_0x00bb:
            r9 = r44
        L_0x00bd:
            r11 = 3670016(0x380000, float:5.142788E-39)
            r14 = r15 & r11
            if (r14 != 0) goto L_0x00d7
            r14 = r13 & 64
            r11 = r46
            if (r14 != 0) goto L_0x00d2
            boolean r16 = r2.changed((long) r11)
            if (r16 == 0) goto L_0x00d2
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d4
        L_0x00d2:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00d4:
            r3 = r3 | r16
            goto L_0x00d9
        L_0x00d7:
            r11 = r46
        L_0x00d9:
            r18 = 29360128(0x1c00000, float:7.052966E-38)
            r16 = r15 & r18
            if (r16 != 0) goto L_0x00f3
            r14 = r13 & 128(0x80, float:1.794E-43)
            r0 = r48
            if (r14 != 0) goto L_0x00ee
            boolean r16 = r2.changed((long) r0)
            if (r16 == 0) goto L_0x00ee
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f0
        L_0x00ee:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f0:
            r3 = r3 | r16
            goto L_0x00f5
        L_0x00f3:
            r0 = r48
        L_0x00f5:
            r20 = 234881024(0xe000000, float:1.5777218E-30)
            r16 = r15 & r20
            if (r16 != 0) goto L_0x010e
            r14 = r13 & 256(0x100, float:3.59E-43)
            r0 = r50
            if (r14 != 0) goto L_0x010a
            boolean r14 = r2.changed((long) r0)
            if (r14 == 0) goto L_0x010a
            r14 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010c
        L_0x010a:
            r14 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010c:
            r3 = r3 | r14
            goto L_0x0110
        L_0x010e:
            r0 = r50
        L_0x0110:
            r14 = 191739611(0xb6db6db, float:4.5782105E-32)
            r14 = r14 & r3
            r0 = 38347922(0x2492492, float:1.4777643E-37)
            if (r14 != r0) goto L_0x012f
            boolean r0 = r2.getSkipping()
            if (r0 != 0) goto L_0x0120
            goto L_0x012f
        L_0x0120:
            r2.skipToGroupEnd()
            r6 = r38
            r33 = r48
            r35 = r50
            r3 = r7
            r4 = r8
            r7 = r42
            goto L_0x029d
        L_0x012f:
            r2.startDefaults()
            r0 = r15 & 1
            r1 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r14 = -3670017(0xffffffffffc7ffff, float:NaN)
            r21 = -458753(0xfffffffffff8ffff, float:NaN)
            r22 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x017b
            boolean r0 = r2.getDefaultsInvalid()
            if (r0 == 0) goto L_0x0149
            goto L_0x017b
        L_0x0149:
            r2.skipToGroupEnd()
            r0 = r13 & 8
            if (r0 == 0) goto L_0x0152
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0152:
            r0 = r13 & 16
            if (r0 == 0) goto L_0x0158
            r3 = r3 & r22
        L_0x0158:
            r0 = r13 & 32
            if (r0 == 0) goto L_0x015e
            r3 = r3 & r21
        L_0x015e:
            r0 = r13 & 64
            if (r0 == 0) goto L_0x0163
            r3 = r3 & r14
        L_0x0163:
            r0 = r13 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0168
            r3 = r3 & r1
        L_0x0168:
            r0 = r13 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0170
            r0 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r3 = r3 & r0
        L_0x0170:
            r33 = r48
            r35 = r50
            r0 = r5
            r4 = r7
            r5 = r8
            r7 = r42
            goto L_0x01e3
        L_0x017b:
            if (r4 == 0) goto L_0x0182
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            goto L_0x0183
        L_0x0182:
            r0 = r5
        L_0x0183:
            if (r6 == 0) goto L_0x0187
            r4 = 0
            goto L_0x0188
        L_0x0187:
            r4 = r7
        L_0x0188:
            r5 = r13 & 8
            r6 = 6
            if (r5 == 0) goto L_0x0196
            androidx.compose.material3.SnackbarDefaults r5 = androidx.compose.material3.SnackbarDefaults.INSTANCE
            androidx.compose.ui.graphics.Shape r5 = r5.getShape(r2, r6)
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x0197
        L_0x0196:
            r5 = r8
        L_0x0197:
            r7 = r13 & 16
            if (r7 == 0) goto L_0x01a4
            androidx.compose.material3.SnackbarDefaults r7 = androidx.compose.material3.SnackbarDefaults.INSTANCE
            long r7 = r7.getColor(r2, r6)
            r3 = r3 & r22
            goto L_0x01a6
        L_0x01a4:
            r7 = r42
        L_0x01a6:
            r22 = r13 & 32
            if (r22 == 0) goto L_0x01b2
            androidx.compose.material3.SnackbarDefaults r9 = androidx.compose.material3.SnackbarDefaults.INSTANCE
            long r9 = r9.getContentColor(r2, r6)
            r3 = r3 & r21
        L_0x01b2:
            r21 = r13 & 64
            if (r21 == 0) goto L_0x01bd
            androidx.compose.material3.SnackbarDefaults r11 = androidx.compose.material3.SnackbarDefaults.INSTANCE
            long r11 = r11.getActionColor(r2, r6)
            r3 = r3 & r14
        L_0x01bd:
            r14 = r13 & 128(0x80, float:1.794E-43)
            if (r14 == 0) goto L_0x01ca
            androidx.compose.material3.SnackbarDefaults r14 = androidx.compose.material3.SnackbarDefaults.INSTANCE
            long r21 = r14.getActionContentColor(r2, r6)
            r1 = r1 & r3
            r3 = r1
            goto L_0x01cc
        L_0x01ca:
            r21 = r48
        L_0x01cc:
            r1 = r13 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x01df
            androidx.compose.material3.SnackbarDefaults r1 = androidx.compose.material3.SnackbarDefaults.INSTANCE
            long r23 = r1.getDismissActionContentColor(r2, r6)
            r1 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r3 = r3 & r1
            r33 = r21
            r35 = r23
            goto L_0x01e3
        L_0x01df:
            r35 = r50
            r33 = r21
        L_0x01e3:
            r2.endDefaults()
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x01f6
            r1 = -1
            java.lang.String r6 = "androidx.compose.material3.Snackbar (Snackbar.kt:197)"
            r14 = 274621471(0x105e641f, float:4.385891E-29)
            androidx.compose.runtime.ComposerKt.traceEventStart(r14, r3, r1, r6)
        L_0x01f6:
            androidx.compose.material3.SnackbarVisuals r1 = r38.getVisuals()
            java.lang.String r1 = r1.getActionLabel()
            r6 = 1
            if (r1 == 0) goto L_0x021a
            androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1 r14 = new androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1
            r39 = r14
            r40 = r11
            r42 = r3
            r43 = r38
            r44 = r1
            r39.<init>(r40, r42, r43, r44)
            r1 = -1378313599(0xffffffffadd89a81, float:-2.462497E-11)
            androidx.compose.runtime.internal.ComposableLambda r1 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r2, r1, r6, r14)
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            goto L_0x021b
        L_0x021a:
            r1 = 0
        L_0x021b:
            androidx.compose.material3.SnackbarVisuals r14 = r38.getVisuals()
            boolean r14 = r14.getWithDismissAction()
            if (r14 == 0) goto L_0x0239
            androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1 r14 = new androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1
            r6 = r38
            r14.<init>(r6, r3)
            r40 = r11
            r11 = -1812633777(0xffffffff93f5674f, float:-6.1948565E-27)
            r12 = 1
            androidx.compose.runtime.internal.ComposableLambda r11 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r2, r11, r12, r14)
            kotlin.jvm.functions.Function2 r11 = (kotlin.jvm.functions.Function2) r11
            goto L_0x023e
        L_0x0239:
            r6 = r38
            r40 = r11
            r11 = 0
        L_0x023e:
            r12 = 12
            float r12 = (float) r12
            float r12 = androidx.compose.ui.unit.Dp.m5626constructorimpl(r12)
            androidx.compose.ui.Modifier r16 = androidx.compose.foundation.layout.PaddingKt.m493padding3ABfNKs(r0, r12)
            androidx.compose.material3.SnackbarKt$Snackbar$3 r12 = new androidx.compose.material3.SnackbarKt$Snackbar$3
            r12.<init>(r6)
            r14 = -1266389126(0xffffffffb4846f7a, float:-2.4668026E-7)
            r42 = r0
            r0 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r2, r14, r0, r12)
            r29 = r0
            kotlin.jvm.functions.Function2 r29 = (kotlin.jvm.functions.Function2) r29
            int r0 = r3 << 3
            r12 = r0 & 7168(0x1c00, float:1.0045E-41)
            r14 = 805306368(0x30000000, float:4.656613E-10)
            r12 = r12 | r14
            r14 = 57344(0xe000, float:8.0356E-41)
            r14 = r14 & r0
            r12 = r12 | r14
            r14 = 458752(0x70000, float:6.42848E-40)
            r14 = r14 & r0
            r12 = r12 | r14
            r14 = 3670016(0x380000, float:5.142788E-39)
            r0 = r0 & r14
            r0 = r0 | r12
            r12 = r3 & r18
            r0 = r0 | r12
            r3 = r3 & r20
            r31 = r0 | r3
            r32 = 0
            r17 = r1
            r18 = r11
            r19 = r4
            r20 = r5
            r21 = r7
            r23 = r9
            r25 = r33
            r27 = r35
            r30 = r2
            m1556SnackbareQBnUkQ(r16, r17, r18, r19, r20, r21, r23, r25, r27, r29, r30, r31, r32)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0297
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0297:
            r11 = r40
            r3 = r4
            r4 = r5
            r5 = r42
        L_0x029d:
            androidx.compose.runtime.ScopeUpdateScope r14 = r2.endRestartGroup()
            if (r14 != 0) goto L_0x02a4
            goto L_0x02c4
        L_0x02a4:
            androidx.compose.material3.SnackbarKt$Snackbar$4 r17 = new androidx.compose.material3.SnackbarKt$Snackbar$4
            r0 = r17
            r1 = r38
            r2 = r5
            r5 = r7
            r7 = r9
            r9 = r11
            r11 = r33
            r37 = r14
            r13 = r35
            r15 = r53
            r16 = r54
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r11, r13, r15, r16)
            r0 = r17
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1 = r37
            r1.updateScope(r0)
        L_0x02c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnackbarKt.m1557SnackbarsDKtq54(androidx.compose.material3.SnackbarData, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, long, long, long, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: NewLineButtonSnackbar-kKq0p4A  reason: not valid java name */
    public static final void m1554NewLineButtonSnackbarkKq0p4A(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, TextStyle textStyle, long j, long j2, Composer composer, int i) {
        int i2;
        Function2<? super Composer, ? super Integer, Unit> function24 = function2;
        Function2<? super Composer, ? super Integer, Unit> function25 = function22;
        Function2<? super Composer, ? super Integer, Unit> function26 = function23;
        TextStyle textStyle2 = textStyle;
        int i3 = i;
        Composer startRestartGroup = composer.startRestartGroup(-1332496681);
        ComposerKt.sourceInformation(startRestartGroup, "C(NewLineButtonSnackbar)P(5!1,3,2,1:c#ui.graphics.Color,4:c#ui.graphics.Color)259@11505L1173:Snackbar.kt#uh7d8r");
        if ((i3 & 14) == 0) {
            i2 = (startRestartGroup.changedInstance(function24) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i3 & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(function25) ? 32 : 16;
        }
        if ((i3 & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(function26) ? 256 : 128;
        }
        if ((i3 & 7168) == 0) {
            i2 |= startRestartGroup.changed((Object) textStyle2) ? 2048 : 1024;
        }
        long j3 = j;
        if ((57344 & i3) == 0) {
            i2 |= startRestartGroup.changed(j3) ? 16384 : 8192;
        }
        long j4 = j2;
        if ((458752 & i3) == 0) {
            i2 |= startRestartGroup.changed(j4) ? 131072 : 65536;
        }
        if ((374491 & i2) != 74898 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1332496681, i2, -1, "androidx.compose.material3.NewLineButtonSnackbar (Snackbar.kt:251)");
            }
            Modifier r0 = PaddingKt.m497paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(SizeKt.m570widthInVpY3zN4$default(Modifier.Companion, 0.0f, ContainerMaxWidth, 1, (Object) null), 0.0f, 1, (Object) null), HorizontalSpacing, 0.0f, 0.0f, SeparateButtonExtraY, 6, (Object) null);
            startRestartGroup.startReplaceableGroup(-483455358);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)77@3913L61,78@3979L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density = (Density) consume;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection = (LayoutDirection) consume2;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume3 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(r0);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer r12 = Updater.m2444constructorimpl(startRestartGroup);
            Updater.m2451setimpl(r12, columnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2451setimpl(r12, density, ComposeUiNode.Companion.getSetDensity());
            Updater.m2451setimpl(r12, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2451setimpl(r12, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693704, "C79@4027L9:Column.kt#2w3rfo");
            ColumnScope columnScope = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -916592099, "C269@11812L171,274@11993L679:Snackbar.kt#uh7d8r");
            Modifier r21 = AlignmentLineKt.m390paddingFromBaselineVpY3zN4(Modifier.Companion, HeightToFirstLine, LongButtonVerticalOffset);
            float f = HorizontalSpacingButtonSide;
            Modifier r10 = PaddingKt.m497paddingqDBjuR0$default(r21, 0.0f, 0.0f, f, 0.0f, 11, (Object) null);
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume4 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density2 = (Density) consume4;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume5 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection2 = (LayoutDirection) consume5;
            float f2 = f;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume6 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume6;
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(r10);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer r2 = Updater.m2444constructorimpl(startRestartGroup);
            Updater.m2451setimpl(r2, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2451setimpl(r2, density2, ComposeUiNode.Companion.getSetDensity());
            Updater.m2451setimpl(r2, layoutDirection2, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2451setimpl(r2, viewConfiguration2, ComposeUiNode.Companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf2.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
            BoxScope boxScope = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 302366561, "C272@11975L6:Snackbar.kt#uh7d8r");
            function24.invoke(startRestartGroup, Integer.valueOf(i2 & 14));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            Modifier r7 = PaddingKt.m497paddingqDBjuR0$default(columnScope.align(Modifier.Companion, Alignment.Companion.getEnd()), 0.0f, 0.0f, function26 == null ? f2 : Dp.m5626constructorimpl((float) 0), 0.0f, 11, (Object) null);
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume7 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density3 = (Density) consume7;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume8 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection3 = (LayoutDirection) consume8;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume9 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration3 = (ViewConfiguration) consume9;
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(r7);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor3);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer r13 = Updater.m2444constructorimpl(startRestartGroup);
            Updater.m2451setimpl(r13, rememberBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2451setimpl(r13, density3, ComposeUiNode.Companion.getSetDensity());
            Updater.m2451setimpl(r13, layoutDirection3, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2451setimpl(r13, viewConfiguration3, ComposeUiNode.Companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf3.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
            BoxScope boxScope2 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 302366747, "C278@12161L501:Snackbar.kt#uh7d8r");
            startRestartGroup.startReplaceableGroup(693286680);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Row)P(2,1,3)78@3913L58,79@3976L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume10 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density4 = (Density) consume10;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume11 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection4 = (LayoutDirection) consume11;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume12 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration4 = (ViewConfiguration) consume12;
            Function0<ComposeUiNode> constructor4 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf4 = LayoutKt.materializerOf(Modifier.Companion);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor4);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer r9 = Updater.m2444constructorimpl(startRestartGroup);
            Updater.m2451setimpl(r9, rowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2451setimpl(r9, density4, ComposeUiNode.Companion.getSetDensity());
            Updater.m2451setimpl(r9, layoutDirection4, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2451setimpl(r9, viewConfiguration4, ComposeUiNode.Companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf4.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -326682283, "C80@4021L9:Row.kt#2w3rfo");
            RowScope rowScope = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 435596114, "C279@12183L208:Snackbar.kt#uh7d8r");
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2811boximpl(j)), TextKt.getLocalTextStyle().provides(textStyle2)}, function22, startRestartGroup, (i2 & 112) | 8);
            startRestartGroup.startReplaceableGroup(302366994);
            ComposerKt.sourceInformation(startRestartGroup, "285@12457L173");
            if (function26 != null) {
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2811boximpl(j2))}, function26, startRestartGroup, ((i2 >> 3) & 112) | 8);
            }
            startRestartGroup.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            Function2<? super Composer, ? super Integer, Unit> function27 = function25;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SnackbarKt$NewLineButtonSnackbar$2(function2, function22, function23, textStyle, j, j2, i));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: OneRowSnackbar-kKq0p4A  reason: not valid java name */
    public static final void m1555OneRowSnackbarkKq0p4A(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, TextStyle textStyle, long j, long j2, Composer composer, int i) {
        int i2;
        Function2<? super Composer, ? super Integer, Unit> function24 = function2;
        Function2<? super Composer, ? super Integer, Unit> function25 = function22;
        Function2<? super Composer, ? super Integer, Unit> function26 = function23;
        TextStyle textStyle2 = textStyle;
        int i3 = i;
        Composer startRestartGroup = composer.startRestartGroup(-903235475);
        ComposerKt.sourceInformation(startRestartGroup, "C(OneRowSnackbar)P(5!1,3,2,1:c#ui.graphics.Color,4:c#ui.graphics.Color)307@13036L4435:Snackbar.kt#uh7d8r");
        if ((i3 & 14) == 0) {
            i2 = (startRestartGroup.changedInstance(function24) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i3 & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(function25) ? 32 : 16;
        }
        if ((i3 & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(function26) ? 256 : 128;
        }
        if ((i3 & 7168) == 0) {
            i2 |= startRestartGroup.changed((Object) textStyle2) ? 2048 : 1024;
        }
        long j3 = j;
        if ((57344 & i3) == 0) {
            i2 |= startRestartGroup.changed(j3) ? 16384 : 8192;
        }
        long j4 = j2;
        if ((458752 & i3) == 0) {
            i2 |= startRestartGroup.changed(j4) ? 131072 : 65536;
        }
        if ((374491 & i2) != 74898 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-903235475, i2, -1, "androidx.compose.material3.OneRowSnackbar (Snackbar.kt:296)");
            }
            Modifier r8 = PaddingKt.m497paddingqDBjuR0$default(Modifier.Companion, HorizontalSpacing, 0.0f, function26 == null ? HorizontalSpacingButtonSide : Dp.m5626constructorimpl((float) 0), 0.0f, 10, (Object) null);
            MeasurePolicy snackbarKt$OneRowSnackbar$2 = new SnackbarKt$OneRowSnackbar$2("action", "dismissAction", "text");
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
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(r8);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer r10 = Updater.m2444constructorimpl(startRestartGroup);
            Updater.m2451setimpl(r10, snackbarKt$OneRowSnackbar$2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2451setimpl(r10, density, ComposeUiNode.Companion.getSetDensity());
            Updater.m2451setimpl(r10, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2451setimpl(r10, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
            materializerOf.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -167734449, "C309@13066L86:Snackbar.kt#uh7d8r");
            Modifier r0 = PaddingKt.m495paddingVpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, "text"), 0.0f, SnackbarVerticalPadding, 1, (Object) null);
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume4 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density2 = (Density) consume4;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume5 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection2 = (LayoutDirection) consume5;
            Object obj = "dismissAction";
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume6 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume6;
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(r0);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer r3 = Updater.m2444constructorimpl(startRestartGroup);
            Updater.m2451setimpl(r3, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2451setimpl(r3, density2, ComposeUiNode.Companion.getSetDensity());
            Updater.m2451setimpl(r3, layoutDirection2, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2451setimpl(r3, viewConfiguration2, ComposeUiNode.Companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf2.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
            BoxScope boxScope = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 448288318, "C309@13144L6:Snackbar.kt#uh7d8r");
            function24.invoke(startRestartGroup, Integer.valueOf(i2 & 14));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-167734350);
            ComposerKt.sourceInformation(startRestartGroup, "311@13203L295");
            if (function25 != null) {
                Modifier layoutId = LayoutIdKt.layoutId(Modifier.Companion, "action");
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume7 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density3 = (Density) consume7;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume8 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                LayoutDirection layoutDirection3 = (LayoutDirection) consume8;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume9 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) consume9;
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(layoutId);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor3);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer r02 = Updater.m2444constructorimpl(startRestartGroup);
                Updater.m2451setimpl(r02, rememberBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2451setimpl(r02, density3, ComposeUiNode.Companion.getSetDensity());
                Updater.m2451setimpl(r02, layoutDirection3, ComposeUiNode.Companion.getSetLayoutDirection());
                Updater.m2451setimpl(r02, viewConfiguration3, ComposeUiNode.Companion.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf3.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
                BoxScope boxScope2 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 448288433, "C312@13259L221:Snackbar.kt#uh7d8r");
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2811boximpl(j)), TextKt.getLocalTextStyle().provides(textStyle2)}, function25, startRestartGroup, (i2 & 112) | 8);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(44738809);
            ComposerKt.sourceInformation(startRestartGroup, "320@13570L247");
            Function2<? super Composer, ? super Integer, Unit> function27 = function23;
            if (function27 != null) {
                Modifier layoutId2 = LayoutIdKt.layoutId(Modifier.Companion, obj);
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume10 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density4 = (Density) consume10;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume11 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                LayoutDirection layoutDirection4 = (LayoutDirection) consume11;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume12 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ViewConfiguration viewConfiguration4 = (ViewConfiguration) consume12;
                Function0<ComposeUiNode> constructor4 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf4 = LayoutKt.materializerOf(layoutId2);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor4);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer r12 = Updater.m2444constructorimpl(startRestartGroup);
                Updater.m2451setimpl(r12, rememberBoxMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2451setimpl(r12, density4, ComposeUiNode.Companion.getSetDensity());
                Updater.m2451setimpl(r12, layoutDirection4, ComposeUiNode.Companion.getSetLayoutDirection());
                Updater.m2451setimpl(r12, viewConfiguration4, ComposeUiNode.Companion.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf4.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
                BoxScope boxScope3 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 448288807, "C321@13633L166:Snackbar.kt#uh7d8r");
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2811boximpl(j2))}, function27, startRestartGroup, ((i2 >> 3) & 112) | 8);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            Function2<? super Composer, ? super Integer, Unit> function28 = function26;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SnackbarKt$OneRowSnackbar$3(function2, function22, function23, textStyle, j, j2, i));
        }
    }

    static {
        float f = (float) 8;
        HorizontalSpacingButtonSide = Dp.m5626constructorimpl(f);
        TextEndExtraSpacing = Dp.m5626constructorimpl(f);
    }
}
