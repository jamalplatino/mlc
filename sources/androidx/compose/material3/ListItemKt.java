package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.tokens.ListTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
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

@Metadata(d1 = {"\u0000^\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a¬\u0001\u0010\b\u001a\u00020\t2\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0002\b\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b¢\u0006\u0002\b\f2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b¢\u0006\u0002\b\f2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b¢\u0006\u0002\b\f2\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u0001H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u0015\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020 2\u001c\u0010!\u001a\u0018\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\t0\"¢\u0006\u0002\b\f¢\u0006\u0002\b$H\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001a8\u0010'\u001a\u00020\t2\u0006\u0010(\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020*2\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0002\b\fH\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a<\u0010-\u001a\u00020\t*\u00020#2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020/2\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0002\b\fH\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001a<\u00102\u001a\u00020\t*\u00020#2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020/2\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0002\b\fH\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b3\u00101\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0005\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0006\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0007\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00064"}, d2 = {"ContentEndPadding", "Landroidx/compose/ui/unit/Dp;", "F", "LeadingContentEndPadding", "ListItemHorizontalPadding", "ListItemThreeLineVerticalPadding", "ListItemVerticalPadding", "TrailingHorizontalPadding", "ListItem", "", "headlineContent", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "modifier", "Landroidx/compose/ui/Modifier;", "overlineContent", "supportingContent", "leadingContent", "trailingContent", "colors", "Landroidx/compose/material3/ListItemColors;", "tonalElevation", "shadowElevation", "ListItem-HXNGIdc", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/ListItemColors;FFLandroidx/compose/runtime/Composer;II)V", "shape", "Landroidx/compose/ui/graphics/Shape;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "minHeight", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "ListItem-xOgov6c", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFFLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ProvideTextStyleFromToken", "color", "textToken", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "ProvideTextStyleFromToken-3J-VO9M", "(JLandroidx/compose/material3/tokens/TypographyKeyTokens;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "LeadingContent", "topAlign", "", "LeadingContent-3IgeMak", "(Landroidx/compose/foundation/layout/RowScope;JZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "TrailingContent", "TrailingContent-3IgeMak", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: ListItem.kt */
public final class ListItemKt {
    private static final float ContentEndPadding;
    /* access modifiers changed from: private */
    public static final float LeadingContentEndPadding;
    private static final float ListItemHorizontalPadding;
    private static final float ListItemThreeLineVerticalPadding;
    private static final float ListItemVerticalPadding;
    private static final float TrailingHorizontalPadding;

    /* JADX WARNING: Removed duplicated region for block: B:102:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0399  */
    /* JADX WARNING: Removed duplicated region for block: B:192:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x010e  */
    /* renamed from: ListItem-HXNGIdc  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1410ListItemHXNGIdc(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r40, androidx.compose.ui.Modifier r41, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r42, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r43, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r44, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r45, androidx.compose.material3.ListItemColors r46, float r47, float r48, androidx.compose.runtime.Composer r49, int r50, int r51) {
        /*
            r1 = r40
            r10 = r50
            r11 = r51
            java.lang.String r0 = "headlineContent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = -1647707763(0xffffffff9dc9f98d, float:-5.3462286E-21)
            r2 = r49
            androidx.compose.runtime.Composer r2 = r2.startRestartGroup(r0)
            java.lang.String r3 = "C(ListItem)P(1,3,4,6,2,8!1,7:c#ui.unit.Dp,5:c#ui.unit.Dp)80@3784L8,155@6557L16,156@6611L29,153@6486L1021:ListItem.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r3)
            r3 = r11 & 1
            if (r3 == 0) goto L_0x0021
            r3 = r10 | 6
            goto L_0x0031
        L_0x0021:
            r3 = r10 & 14
            if (r3 != 0) goto L_0x0030
            boolean r3 = r2.changedInstance(r1)
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
            r4 = r11 & 2
            if (r4 == 0) goto L_0x0038
            r3 = r3 | 48
            goto L_0x004b
        L_0x0038:
            r5 = r10 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x004b
            r5 = r41
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
            r5 = r41
        L_0x004d:
            r6 = r11 & 4
            if (r6 == 0) goto L_0x0054
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0067
        L_0x0054:
            r7 = r10 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0067
            r7 = r42
            boolean r8 = r2.changedInstance(r7)
            if (r8 == 0) goto L_0x0063
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r3 = r3 | r8
            goto L_0x0069
        L_0x0067:
            r7 = r42
        L_0x0069:
            r8 = r11 & 8
            if (r8 == 0) goto L_0x0070
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0083
        L_0x0070:
            r9 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x0083
            r9 = r43
            boolean r12 = r2.changedInstance(r9)
            if (r12 == 0) goto L_0x007f
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007f:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r3 = r3 | r12
            goto L_0x0085
        L_0x0083:
            r9 = r43
        L_0x0085:
            r12 = r11 & 16
            r34 = 57344(0xe000, float:8.0356E-41)
            if (r12 == 0) goto L_0x008f
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a2
        L_0x008f:
            r13 = r10 & r34
            if (r13 != 0) goto L_0x00a2
            r13 = r44
            boolean r14 = r2.changedInstance(r13)
            if (r14 == 0) goto L_0x009e
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a0
        L_0x009e:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x00a0:
            r3 = r3 | r14
            goto L_0x00a4
        L_0x00a2:
            r13 = r44
        L_0x00a4:
            r14 = r11 & 32
            r35 = 458752(0x70000, float:6.42848E-40)
            if (r14 == 0) goto L_0x00ae
            r15 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r15
            goto L_0x00c2
        L_0x00ae:
            r15 = r10 & r35
            if (r15 != 0) goto L_0x00c2
            r15 = r45
            boolean r16 = r2.changedInstance(r15)
            if (r16 == 0) goto L_0x00bd
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bf
        L_0x00bd:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00bf:
            r3 = r3 | r16
            goto L_0x00c4
        L_0x00c2:
            r15 = r45
        L_0x00c4:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r10 & r16
            if (r16 != 0) goto L_0x00de
            r16 = r11 & 64
            r0 = r46
            if (r16 != 0) goto L_0x00d9
            boolean r16 = r2.changed((java.lang.Object) r0)
            if (r16 == 0) goto L_0x00d9
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00db
        L_0x00d9:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00db:
            r3 = r3 | r16
            goto L_0x00e0
        L_0x00de:
            r0 = r46
        L_0x00e0:
            r15 = r11 & 128(0x80, float:1.794E-43)
            if (r15 == 0) goto L_0x00e9
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            r3 = r3 | r16
            goto L_0x0101
        L_0x00e9:
            r16 = 29360128(0x1c00000, float:7.052966E-38)
            r16 = r10 & r16
            if (r16 != 0) goto L_0x0101
            r16 = r15
            r15 = r47
            boolean r17 = r2.changed((float) r15)
            if (r17 == 0) goto L_0x00fc
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fe
        L_0x00fc:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fe:
            r3 = r3 | r17
            goto L_0x0105
        L_0x0101:
            r16 = r15
            r15 = r47
        L_0x0105:
            r15 = r11 & 256(0x100, float:3.59E-43)
            r36 = 100663296(0x6000000, float:2.4074124E-35)
            if (r15 == 0) goto L_0x010e
            r3 = r3 | r36
            goto L_0x0126
        L_0x010e:
            r17 = 234881024(0xe000000, float:1.5777218E-30)
            r17 = r10 & r17
            if (r17 != 0) goto L_0x0126
            r17 = r15
            r15 = r48
            boolean r18 = r2.changed((float) r15)
            if (r18 == 0) goto L_0x0121
            r18 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0123
        L_0x0121:
            r18 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0123:
            r3 = r3 | r18
            goto L_0x012a
        L_0x0126:
            r17 = r15
            r15 = r48
        L_0x012a:
            r18 = 191739611(0xb6db6db, float:4.5782105E-32)
            r0 = r3 & r18
            r5 = 38347922(0x2492492, float:1.4777643E-37)
            if (r0 != r5) goto L_0x014a
            boolean r0 = r2.getSkipping()
            if (r0 != 0) goto L_0x013b
            goto L_0x014a
        L_0x013b:
            r2.skipToGroupEnd()
            r3 = r41
            r6 = r45
            r8 = r46
            r4 = r9
            r5 = r13
            r9 = r47
            goto L_0x0392
        L_0x014a:
            r2.startDefaults()
            r0 = r10 & 1
            r5 = -3670017(0xffffffffffc7ffff, float:NaN)
            r37 = 0
            if (r0 == 0) goto L_0x0172
            boolean r0 = r2.getDefaultsInvalid()
            if (r0 == 0) goto L_0x015d
            goto L_0x0172
        L_0x015d:
            r2.skipToGroupEnd()
            r0 = r11 & 64
            if (r0 == 0) goto L_0x0165
            r3 = r3 & r5
        L_0x0165:
            r0 = r41
            r6 = r45
            r5 = r47
            r12 = r3
            r4 = r13
            r8 = r15
            r3 = r46
            goto L_0x01db
        L_0x0172:
            if (r4 == 0) goto L_0x0179
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            goto L_0x017b
        L_0x0179:
            r0 = r41
        L_0x017b:
            if (r6 == 0) goto L_0x017f
            r7 = r37
        L_0x017f:
            if (r8 == 0) goto L_0x0183
            r9 = r37
        L_0x0183:
            if (r12 == 0) goto L_0x0188
            r4 = r37
            goto L_0x0189
        L_0x0188:
            r4 = r13
        L_0x0189:
            if (r14 == 0) goto L_0x018e
            r6 = r37
            goto L_0x0190
        L_0x018e:
            r6 = r45
        L_0x0190:
            r8 = r11 & 64
            if (r8 == 0) goto L_0x01ba
            androidx.compose.material3.ListItemDefaults r12 = androidx.compose.material3.ListItemDefaults.INSTANCE
            r13 = 0
            r18 = 0
            r8 = r16
            r38 = r17
            r15 = r18
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r29 = 0
            r32 = 805306368(0x30000000, float:4.656613E-10)
            r33 = 511(0x1ff, float:7.16E-43)
            r31 = r2
            androidx.compose.material3.ListItemColors r12 = r12.m1407colorsJ08w3E(r13, r15, r17, r19, r21, r23, r25, r27, r29, r31, r32, r33)
            r3 = r3 & r5
            goto L_0x01c0
        L_0x01ba:
            r8 = r16
            r38 = r17
            r12 = r46
        L_0x01c0:
            if (r8 == 0) goto L_0x01c9
            androidx.compose.material3.ListItemDefaults r5 = androidx.compose.material3.ListItemDefaults.INSTANCE
            float r5 = r5.m1408getElevationD9Ej5fM()
            goto L_0x01cb
        L_0x01c9:
            r5 = r47
        L_0x01cb:
            if (r38 == 0) goto L_0x01d4
            androidx.compose.material3.ListItemDefaults r8 = androidx.compose.material3.ListItemDefaults.INSTANCE
            float r8 = r8.m1408getElevationD9Ej5fM()
            goto L_0x01d6
        L_0x01d4:
            r8 = r48
        L_0x01d6:
            r39 = r12
            r12 = r3
            r3 = r39
        L_0x01db:
            r2.endDefaults()
            boolean r13 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r13 == 0) goto L_0x01ee
            r13 = -1
            java.lang.String r14 = "androidx.compose.material3.ListItem (ListItem.kt:73)"
            r15 = -1647707763(0xffffffff9dc9f98d, float:-5.3462286E-21)
            androidx.compose.runtime.ComposerKt.traceEventStart(r15, r12, r13, r14)
        L_0x01ee:
            androidx.compose.material3.ListItemKt$ListItem$decoratedHeadlineContent$1 r13 = new androidx.compose.material3.ListItemKt$ListItem$decoratedHeadlineContent$1
            r13.<init>(r3, r12, r1)
            r14 = -403249643(0xffffffffe7f6e615, float:-2.3318928E24)
            r15 = 1
            androidx.compose.runtime.internal.ComposableLambda r13 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r2, r14, r15, r13)
            kotlin.jvm.functions.Function2 r13 = (kotlin.jvm.functions.Function2) r13
            if (r9 == 0) goto L_0x020e
            androidx.compose.material3.ListItemKt$ListItem$decoratedSupportingContent$1$1 r14 = new androidx.compose.material3.ListItemKt$ListItem$decoratedSupportingContent$1$1
            r14.<init>(r3, r12, r9)
            r1 = -1020860251(0xffffffffc326e8a5, float:-166.90877)
            androidx.compose.runtime.internal.ComposableLambda r1 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r2, r1, r15, r14)
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            goto L_0x0210
        L_0x020e:
            r1 = r37
        L_0x0210:
            if (r7 == 0) goto L_0x0223
            androidx.compose.material3.ListItemKt$ListItem$decoratedOverlineContent$1$1 r14 = new androidx.compose.material3.ListItemKt$ListItem$decoratedOverlineContent$1$1
            r14.<init>(r3, r12, r7)
            r26 = r7
            r7 = -764441232(0xffffffffd26f8d70, float:-2.57217528E11)
            androidx.compose.runtime.internal.ComposableLambda r7 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r2, r7, r15, r14)
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            goto L_0x0227
        L_0x0223:
            r26 = r7
            r7 = r37
        L_0x0227:
            androidx.compose.material3.ListItemType$Companion r14 = androidx.compose.material3.ListItemType.Companion
            if (r7 == 0) goto L_0x022d
            r15 = 1
            goto L_0x022e
        L_0x022d:
            r15 = 0
        L_0x022e:
            r27 = r9
            if (r1 == 0) goto L_0x0234
            r9 = 1
            goto L_0x0235
        L_0x0234:
            r9 = 0
        L_0x0235:
            int r9 = r14.m1427getListItemType7AlIA9s$material3_release(r15, r9)
            if (r4 == 0) goto L_0x024d
            androidx.compose.material3.ListItemKt$ListItem$decoratedLeadingContent$1$1 r14 = new androidx.compose.material3.ListItemKt$ListItem$decoratedLeadingContent$1$1
            r14.<init>(r3, r12, r9, r4)
            r15 = 1673725255(0x63c30547, float:7.194991E21)
            r28 = r4
            r4 = 1
            androidx.compose.runtime.internal.ComposableLambda r14 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r2, r15, r4, r14)
            kotlin.jvm.functions.Function3 r14 = (kotlin.jvm.functions.Function3) r14
            goto L_0x0252
        L_0x024d:
            r28 = r4
            r4 = 1
            r14 = r37
        L_0x0252:
            if (r6 == 0) goto L_0x0267
            androidx.compose.material3.ListItemKt$ListItem$decoratedTrailingContent$1$1 r15 = new androidx.compose.material3.ListItemKt$ListItem$decoratedTrailingContent$1$1
            r15.<init>(r3, r12, r9, r6)
            r29 = r6
            r6 = 1392069445(0x52f94b45, float:5.35354835E11)
            androidx.compose.runtime.internal.ComposableLambda r6 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r2, r6, r4, r15)
            r37 = r6
            kotlin.jvm.functions.Function3 r37 = (kotlin.jvm.functions.Function3) r37
            goto L_0x0269
        L_0x0267:
            r29 = r6
        L_0x0269:
            androidx.compose.material3.ListItemType$Companion r4 = androidx.compose.material3.ListItemType.Companion
            int r4 = r4.m1428getOneLineAlXitO8()
            boolean r4 = androidx.compose.material3.ListItemType.m1422equalsimpl0(r9, r4)
            if (r4 == 0) goto L_0x027e
            androidx.compose.material3.tokens.ListTokens r4 = androidx.compose.material3.tokens.ListTokens.INSTANCE
            float r4 = r4.m2135getListItemOneLineContainerHeightD9Ej5fM()
        L_0x027b:
            r20 = r4
            goto L_0x0298
        L_0x027e:
            androidx.compose.material3.ListItemType$Companion r4 = androidx.compose.material3.ListItemType.Companion
            int r4 = r4.m1430getTwoLineAlXitO8()
            boolean r4 = androidx.compose.material3.ListItemType.m1422equalsimpl0(r9, r4)
            if (r4 == 0) goto L_0x0291
            androidx.compose.material3.tokens.ListTokens r4 = androidx.compose.material3.tokens.ListTokens.INSTANCE
            float r4 = r4.m2139getListItemTwoLineContainerHeightD9Ej5fM()
            goto L_0x027b
        L_0x0291:
            androidx.compose.material3.tokens.ListTokens r4 = androidx.compose.material3.tokens.ListTokens.INSTANCE
            float r4 = r4.m2137getListItemThreeLineContainerHeightD9Ej5fM()
            goto L_0x027b
        L_0x0298:
            float r4 = ListItemHorizontalPadding
            androidx.compose.material3.ListItemType$Companion r6 = androidx.compose.material3.ListItemType.Companion
            int r6 = r6.m1429getThreeLineAlXitO8()
            boolean r6 = androidx.compose.material3.ListItemType.m1422equalsimpl0(r9, r6)
            if (r6 == 0) goto L_0x02a9
            float r6 = ListItemThreeLineVerticalPadding
            goto L_0x02ab
        L_0x02a9:
            float r6 = ListItemVerticalPadding
        L_0x02ab:
            androidx.compose.foundation.layout.PaddingValues r21 = androidx.compose.foundation.layout.PaddingKt.m487PaddingValuesYgX7TsA(r4, r6)
            r4 = 0
            r6 = 0
            androidx.compose.material3.ListItemType$Companion r15 = androidx.compose.material3.ListItemType.Companion
            int r15 = r15.m1429getThreeLineAlXitO8()
            boolean r15 = androidx.compose.material3.ListItemType.m1422equalsimpl0(r9, r15)
            if (r15 == 0) goto L_0x02c0
            float r15 = ContentEndPadding
            goto L_0x02c6
        L_0x02c0:
            r15 = 0
            float r15 = (float) r15
            float r15 = androidx.compose.ui.unit.Dp.m5626constructorimpl(r15)
        L_0x02c6:
            r17 = 0
            r18 = 11
            r19 = 0
            r42 = r4
            r43 = r6
            r44 = r15
            r45 = r17
            r46 = r18
            r47 = r19
            androidx.compose.foundation.layout.PaddingValues r4 = androidx.compose.foundation.layout.PaddingKt.m490PaddingValuesa9UjIt4$default(r42, r43, r44, r45, r46, r47)
            androidx.compose.material3.ListItemType$Companion r6 = androidx.compose.material3.ListItemType.Companion
            int r6 = r6.m1429getThreeLineAlXitO8()
            boolean r6 = androidx.compose.material3.ListItemType.m1422equalsimpl0(r9, r6)
            if (r6 == 0) goto L_0x02ef
            androidx.compose.foundation.layout.Arrangement r6 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            androidx.compose.foundation.layout.Arrangement$Vertical r6 = r6.getTop()
            goto L_0x02f7
        L_0x02ef:
            androidx.compose.foundation.layout.Arrangement r6 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical r6 = r6.getCenter()
            androidx.compose.foundation.layout.Arrangement$Vertical r6 = (androidx.compose.foundation.layout.Arrangement.Vertical) r6
        L_0x02f7:
            androidx.compose.material3.ListItemType$Companion r15 = androidx.compose.material3.ListItemType.Companion
            int r15 = r15.m1429getThreeLineAlXitO8()
            boolean r9 = androidx.compose.material3.ListItemType.m1422equalsimpl0(r9, r15)
            if (r9 == 0) goto L_0x030a
            androidx.compose.ui.Alignment$Companion r9 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment$Vertical r9 = r9.getTop()
            goto L_0x0310
        L_0x030a:
            androidx.compose.ui.Alignment$Companion r9 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment$Vertical r9 = r9.getCenterVertically()
        L_0x0310:
            int r17 = r12 >> 18
            r15 = r17 & 14
            androidx.compose.runtime.State r15 = r3.containerColor$material3_release(r2, r15)
            java.lang.Object r15 = r15.getValue()
            androidx.compose.ui.graphics.Color r15 = (androidx.compose.ui.graphics.Color) r15
            long r22 = r15.m2831unboximpl()
            int r15 = r12 >> 15
            r15 = r15 & 112(0x70, float:1.57E-43)
            r15 = r15 | 6
            r10 = 1
            androidx.compose.runtime.State r15 = r3.headlineColor$material3_release(r10, r2, r15)
            java.lang.Object r10 = r15.getValue()
            androidx.compose.ui.graphics.Color r10 = (androidx.compose.ui.graphics.Color) r10
            long r24 = r10.m2831unboximpl()
            androidx.compose.material3.ListItemKt$ListItem$1 r10 = new androidx.compose.material3.ListItemKt$ListItem$1
            r41 = r10
            r42 = r14
            r43 = r4
            r44 = r9
            r45 = r6
            r46 = r37
            r47 = r7
            r48 = r13
            r49 = r1
            r41.<init>(r42, r43, r44, r45, r46, r47, r48, r49)
            r1 = -1813277157(0xffffffff93eb961b, float:-5.9470355E-27)
            r4 = 1
            androidx.compose.runtime.internal.ComposableLambda r1 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r2, r1, r4, r10)
            kotlin.jvm.functions.Function3 r1 = (kotlin.jvm.functions.Function3) r1
            int r4 = r12 >> 3
            r4 = r4 & 14
            r4 = r4 | r36
            int r6 = r12 >> 9
            r7 = r6 & r34
            r4 = r4 | r7
            r6 = r6 & r35
            r4 = r4 | r6
            r6 = 2
            r12 = r0
            r7 = 0
            r13 = r7
            r14 = r22
            r16 = r24
            r18 = r5
            r19 = r8
            r22 = r1
            r23 = r2
            r24 = r4
            r25 = r6
            m1411ListItemxOgov6c(r12, r13, r14, r16, r18, r19, r20, r21, r22, r23, r24, r25)
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x0386
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0386:
            r9 = r5
            r15 = r8
            r7 = r26
            r4 = r27
            r5 = r28
            r6 = r29
            r8 = r3
            r3 = r0
        L_0x0392:
            androidx.compose.runtime.ScopeUpdateScope r12 = r2.endRestartGroup()
            if (r12 != 0) goto L_0x0399
            goto L_0x03af
        L_0x0399:
            androidx.compose.material3.ListItemKt$ListItem$2 r13 = new androidx.compose.material3.ListItemKt$ListItem$2
            r0 = r13
            r1 = r40
            r2 = r3
            r3 = r7
            r7 = r8
            r8 = r9
            r9 = r15
            r10 = r50
            r11 = r51
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            kotlin.jvm.functions.Function2 r13 = (kotlin.jvm.functions.Function2) r13
            r12.updateScope(r13)
        L_0x03af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ListItemKt.m1410ListItemHXNGIdc(kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.material3.ListItemColors, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x012e  */
    /* renamed from: ListItem-xOgov6c  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1411ListItemxOgov6c(androidx.compose.ui.Modifier r29, androidx.compose.ui.graphics.Shape r30, long r31, long r33, float r35, float r36, float r37, androidx.compose.foundation.layout.PaddingValues r38, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r39, androidx.compose.runtime.Composer r40, int r41, int r42) {
        /*
            r9 = r37
            r10 = r38
            r11 = r39
            r12 = r41
            r13 = r42
            r0 = 1069030861(0x3fb81dcd, float:1.4384094)
            r1 = r40
            androidx.compose.runtime.Composer r1 = r1.startRestartGroup(r0)
            java.lang.String r2 = "C(ListItem)P(4,7,0:c#ui.graphics.Color,2:c#ui.graphics.Color,8:c#ui.unit.Dp,6:c#ui.unit.Dp,3:c#ui.unit.Dp,5)204@8376L5,205@8428L14,206@8487L12,213@8715L451:ListItem.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r2)
            r2 = r13 & 1
            if (r2 == 0) goto L_0x0022
            r3 = r12 | 6
            r4 = r3
            r3 = r29
            goto L_0x0036
        L_0x0022:
            r3 = r12 & 14
            if (r3 != 0) goto L_0x0033
            r3 = r29
            boolean r4 = r1.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x0030
            r4 = 4
            goto L_0x0031
        L_0x0030:
            r4 = 2
        L_0x0031:
            r4 = r4 | r12
            goto L_0x0036
        L_0x0033:
            r3 = r29
            r4 = r12
        L_0x0036:
            r5 = r12 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x004f
            r5 = r13 & 2
            if (r5 != 0) goto L_0x0049
            r5 = r30
            boolean r6 = r1.changed((java.lang.Object) r5)
            if (r6 == 0) goto L_0x004b
            r6 = 32
            goto L_0x004d
        L_0x0049:
            r5 = r30
        L_0x004b:
            r6 = 16
        L_0x004d:
            r4 = r4 | r6
            goto L_0x0051
        L_0x004f:
            r5 = r30
        L_0x0051:
            r6 = r12 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x006a
            r6 = r13 & 4
            if (r6 != 0) goto L_0x0064
            r6 = r31
            boolean r8 = r1.changed((long) r6)
            if (r8 == 0) goto L_0x0066
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0068
        L_0x0064:
            r6 = r31
        L_0x0066:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0068:
            r4 = r4 | r8
            goto L_0x006c
        L_0x006a:
            r6 = r31
        L_0x006c:
            r8 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0083
            r8 = r13 & 8
            r14 = r33
            if (r8 != 0) goto L_0x007f
            boolean r8 = r1.changed((long) r14)
            if (r8 == 0) goto L_0x007f
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007f:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r4 = r4 | r8
            goto L_0x0085
        L_0x0083:
            r14 = r33
        L_0x0085:
            r8 = r13 & 16
            r16 = 57344(0xe000, float:8.0356E-41)
            if (r8 == 0) goto L_0x0091
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            r0 = r35
            goto L_0x00a4
        L_0x0091:
            r17 = r12 & r16
            r0 = r35
            if (r17 != 0) goto L_0x00a4
            boolean r18 = r1.changed((float) r0)
            if (r18 == 0) goto L_0x00a0
            r18 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a2
        L_0x00a0:
            r18 = 8192(0x2000, float:1.14794E-41)
        L_0x00a2:
            r4 = r4 | r18
        L_0x00a4:
            r18 = r13 & 32
            r19 = 458752(0x70000, float:6.42848E-40)
            if (r18 == 0) goto L_0x00b1
            r20 = 196608(0x30000, float:2.75506E-40)
            r4 = r4 | r20
            r0 = r36
            goto L_0x00c4
        L_0x00b1:
            r20 = r12 & r19
            r0 = r36
            if (r20 != 0) goto L_0x00c4
            boolean r20 = r1.changed((float) r0)
            if (r20 == 0) goto L_0x00c0
            r20 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c2
        L_0x00c0:
            r20 = 65536(0x10000, float:9.18355E-41)
        L_0x00c2:
            r4 = r4 | r20
        L_0x00c4:
            r20 = r13 & 64
            if (r20 == 0) goto L_0x00cd
            r20 = 1572864(0x180000, float:2.204052E-39)
        L_0x00ca:
            r4 = r4 | r20
            goto L_0x00df
        L_0x00cd:
            r20 = 3670016(0x380000, float:5.142788E-39)
            r20 = r12 & r20
            if (r20 != 0) goto L_0x00df
            boolean r20 = r1.changed((float) r9)
            if (r20 == 0) goto L_0x00dc
            r20 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ca
        L_0x00dc:
            r20 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00ca
        L_0x00df:
            r0 = r13 & 128(0x80, float:1.794E-43)
            r20 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00e8
            r4 = r4 | r20
            goto L_0x00f9
        L_0x00e8:
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r0 & r12
            if (r0 != 0) goto L_0x00f9
            boolean r0 = r1.changed((java.lang.Object) r10)
            if (r0 == 0) goto L_0x00f6
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f8
        L_0x00f6:
            r0 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f8:
            r4 = r4 | r0
        L_0x00f9:
            r0 = r13 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0101
            r0 = 100663296(0x6000000, float:2.4074124E-35)
        L_0x00ff:
            r4 = r4 | r0
            goto L_0x0112
        L_0x0101:
            r0 = 234881024(0xe000000, float:1.5777218E-30)
            r0 = r0 & r12
            if (r0 != 0) goto L_0x0112
            boolean r0 = r1.changedInstance(r11)
            if (r0 == 0) goto L_0x010f
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x00ff
        L_0x010f:
            r0 = 33554432(0x2000000, float:9.403955E-38)
            goto L_0x00ff
        L_0x0112:
            r0 = 191739611(0xb6db6db, float:4.5782105E-32)
            r0 = r0 & r4
            r3 = 38347922(0x2492492, float:1.4777643E-37)
            if (r0 != r3) goto L_0x012e
            boolean r0 = r1.getSkipping()
            if (r0 != 0) goto L_0x0122
            goto L_0x012e
        L_0x0122:
            r1.skipToGroupEnd()
            r2 = r29
            r8 = r36
            r3 = r6
            r7 = r35
            goto L_0x0203
        L_0x012e:
            r1.startDefaults()
            r0 = r12 & 1
            if (r0 == 0) goto L_0x015f
            boolean r0 = r1.getDefaultsInvalid()
            if (r0 == 0) goto L_0x013c
            goto L_0x015f
        L_0x013c:
            r1.skipToGroupEnd()
            r0 = r13 & 2
            if (r0 == 0) goto L_0x0145
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0145:
            r0 = r13 & 4
            if (r0 == 0) goto L_0x014b
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x014b:
            r0 = r13 & 8
            if (r0 == 0) goto L_0x0151
            r4 = r4 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0151:
            r0 = r29
            r8 = r36
            r2 = r5
            r5 = r6
            r7 = r35
        L_0x0159:
            r27 = r14
            r14 = r4
            r3 = r27
            goto L_0x01ab
        L_0x015f:
            if (r2 == 0) goto L_0x0166
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            goto L_0x0168
        L_0x0166:
            r0 = r29
        L_0x0168:
            r2 = r13 & 2
            r3 = 6
            if (r2 == 0) goto L_0x0176
            androidx.compose.material3.ListItemDefaults r2 = androidx.compose.material3.ListItemDefaults.INSTANCE
            androidx.compose.ui.graphics.Shape r2 = r2.getShape(r1, r3)
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x0177
        L_0x0176:
            r2 = r5
        L_0x0177:
            r5 = r13 & 4
            if (r5 == 0) goto L_0x0184
            androidx.compose.material3.ListItemDefaults r5 = androidx.compose.material3.ListItemDefaults.INSTANCE
            long r5 = r5.getContainerColor(r1, r3)
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x0185
        L_0x0184:
            r5 = r6
        L_0x0185:
            r7 = r13 & 8
            if (r7 == 0) goto L_0x0192
            androidx.compose.material3.ListItemDefaults r7 = androidx.compose.material3.ListItemDefaults.INSTANCE
            long r14 = r7.getContentColor(r1, r3)
            r3 = r4 & -7169(0xffffffffffffe3ff, float:NaN)
            r4 = r3
        L_0x0192:
            if (r8 == 0) goto L_0x019b
            androidx.compose.material3.ListItemDefaults r3 = androidx.compose.material3.ListItemDefaults.INSTANCE
            float r3 = r3.m1408getElevationD9Ej5fM()
            goto L_0x019d
        L_0x019b:
            r3 = r35
        L_0x019d:
            if (r18 == 0) goto L_0x01a7
            androidx.compose.material3.ListItemDefaults r7 = androidx.compose.material3.ListItemDefaults.INSTANCE
            float r7 = r7.m1408getElevationD9Ej5fM()
            r8 = r7
            goto L_0x01a9
        L_0x01a7:
            r8 = r36
        L_0x01a9:
            r7 = r3
            goto L_0x0159
        L_0x01ab:
            r1.endDefaults()
            boolean r15 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r15 == 0) goto L_0x01be
            r15 = -1
            java.lang.String r12 = "androidx.compose.material3.ListItem (ListItem.kt:202)"
            r13 = 1069030861(0x3fb81dcd, float:1.4384094)
            androidx.compose.runtime.ComposerKt.traceEventStart(r13, r14, r15, r12)
        L_0x01be:
            r22 = 0
            androidx.compose.material3.ListItemKt$ListItem$3 r12 = new androidx.compose.material3.ListItemKt$ListItem$3
            r12.<init>(r9, r10, r11, r14)
            r13 = 1393735016(0x5312b568, float:6.3010872E11)
            r15 = 1
            androidx.compose.runtime.internal.ComposableLambda r12 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r1, r13, r15, r12)
            r23 = r12
            kotlin.jvm.functions.Function2 r23 = (kotlin.jvm.functions.Function2) r23
            r12 = r14 & 14
            r12 = r12 | r20
            r13 = r14 & 112(0x70, float:1.57E-43)
            r12 = r12 | r13
            r13 = r14 & 896(0x380, float:1.256E-42)
            r12 = r12 | r13
            r13 = r14 & 7168(0x1c00, float:1.0045E-41)
            r12 = r12 | r13
            r13 = r14 & r16
            r12 = r12 | r13
            r13 = r14 & r19
            r25 = r12 | r13
            r26 = 64
            r14 = r0
            r15 = r2
            r16 = r5
            r18 = r3
            r20 = r7
            r21 = r8
            r24 = r1
            androidx.compose.material3.SurfaceKt.m1641SurfaceT9BRK9s(r14, r15, r16, r18, r20, r21, r22, r23, r24, r25, r26)
            boolean r12 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r12 == 0) goto L_0x01ff
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x01ff:
            r14 = r3
            r3 = r5
            r5 = r2
            r2 = r0
        L_0x0203:
            androidx.compose.runtime.ScopeUpdateScope r13 = r1.endRestartGroup()
            if (r13 != 0) goto L_0x020a
            goto L_0x0226
        L_0x020a:
            androidx.compose.material3.ListItemKt$ListItem$4 r16 = new androidx.compose.material3.ListItemKt$ListItem$4
            r0 = r16
            r1 = r2
            r2 = r5
            r5 = r14
            r9 = r37
            r10 = r38
            r11 = r39
            r12 = r41
            r14 = r13
            r13 = r42
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12, r13)
            r0 = r16
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r14.updateScope(r0)
        L_0x0226:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ListItemKt.m1411ListItemxOgov6c(androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, float, float, float, androidx.compose.foundation.layout.PaddingValues, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: LeadingContent-3IgeMak  reason: not valid java name */
    public static final void m1409LeadingContent3IgeMak(RowScope rowScope, long j, boolean z, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(1383930970);
        ComposerKt.sourceInformation(startRestartGroup, "C(LeadingContent)P(1:c#ui.graphics.Color,2)236@9308L274:ListItem.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed((Object) rowScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if ((i2 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1383930970, i2, -1, "androidx.compose.material3.LeadingContent (ListItem.kt:232)");
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2811boximpl(j))}, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(startRestartGroup, 315166618, true, new ListItemKt$LeadingContent$1(z, rowScope, function2, i2)), startRestartGroup, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ListItemKt$LeadingContent$2(rowScope, j, z, function2, i));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: TrailingContent-3IgeMak  reason: not valid java name */
    public static final void m1413TrailingContent3IgeMak(RowScope rowScope, long j, boolean z, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(1404787004);
        ComposerKt.sourceInformation(startRestartGroup, "C(TrailingContent)P(1:c#ui.graphics.Color,2)249@9723L316:ListItem.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed((Object) rowScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if ((i2 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1404787004, i2, -1, "androidx.compose.material3.TrailingContent (ListItem.kt:245)");
            }
            Modifier r0 = PaddingKt.m495paddingVpY3zN4$default(Modifier.Companion, TrailingHorizontalPadding, 0.0f, 2, (Object) null);
            Modifier modifier = Modifier.Companion;
            if (!z) {
                modifier = rowScope.align(modifier, Alignment.Companion.getCenterVertically());
            }
            Modifier then = r0.then(modifier);
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
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
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(then);
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
            Composer r6 = Updater.m2444constructorimpl(startRestartGroup);
            Updater.m2451setimpl(r6, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2451setimpl(r6, density, ComposeUiNode.Companion.getSetDensity());
            Updater.m2451setimpl(r6, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2451setimpl(r6, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
            BoxScope boxScope = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1419469451, "C254@9892L141:ListItem.kt#uh7d8r");
            int i3 = i2 >> 3;
            m1412ProvideTextStyleFromToken3JVO9M(j, ListTokens.INSTANCE.getListItemTrailingSupportingTextFont(), function2, startRestartGroup, (i3 & 14) | 48 | (i3 & 896));
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
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ListItemKt$TrailingContent$2(rowScope, j, z, function2, i));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ProvideTextStyleFromToken-3J-VO9M  reason: not valid java name */
    public static final void m1412ProvideTextStyleFromToken3JVO9M(long j, TypographyKeyTokens typographyKeyTokens, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(1133967795);
        ComposerKt.sourceInformation(startRestartGroup, "C(ProvideTextStyleFromToken)P(0:c#ui.graphics.Color,2)394@15546L10,395@15582L111:ListItem.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed((Object) typographyKeyTokens) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1133967795, i2, -1, "androidx.compose.material3.ProvideTextStyleFromToken (ListItem.kt:389)");
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2811boximpl(j))}, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(startRestartGroup, -514310925, true, new ListItemKt$ProvideTextStyleFromToken$1(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), typographyKeyTokens), function2, i2)), startRestartGroup, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ListItemKt$ProvideTextStyleFromToken$2(j, typographyKeyTokens, function2, i));
        }
    }

    static {
        float f = (float) 8;
        ListItemVerticalPadding = Dp.m5626constructorimpl(f);
        float f2 = (float) 16;
        ListItemThreeLineVerticalPadding = Dp.m5626constructorimpl(f2);
        ListItemHorizontalPadding = Dp.m5626constructorimpl(f2);
        LeadingContentEndPadding = Dp.m5626constructorimpl(f2);
        ContentEndPadding = Dp.m5626constructorimpl(f);
        TrailingHorizontalPadding = Dp.m5626constructorimpl(f);
    }
}
