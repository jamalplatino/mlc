package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.tokens.PrimaryNavigationTabTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata(d1 = {"\u0000p\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0001\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00142\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00100\u0014¢\u0006\u0002\b\u00162\u0011\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00100\u0014¢\u0006\u0002\b\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001fH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a\u0001\u0010\"\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00122\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0014¢\u0006\u0002\b\u00162\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0014¢\u0006\u0002\b\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001fH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a{\u0010\"\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\u001c\u0010%\u001a\u0018\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00100&¢\u0006\u0002\b\u0016¢\u0006\u0002\b(H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a7\u0010+\u001a\u00020\u00102\u0013\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0014¢\u0006\u0002\b\u00162\u0013\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0014¢\u0006\u0002\b\u0016H\u0003¢\u0006\u0002\u0010,\u001a@\u0010-\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u00122\u0011\u0010%\u001a\r\u0012\u0004\u0012\u00020\u00100\u0014¢\u0006\u0002\b\u0016H\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001aD\u00102\u001a\u00020\u0010*\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020\u000bH\u0002\u001a\u001c\u0010=\u001a\u00020\u0010*\u0002032\u0006\u0010>\u001a\u0002072\u0006\u0010:\u001a\u00020\u000bH\u0002\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0005X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\"\u0013\u0010\u0007\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\b\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\t\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\n\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000\"\u0013\u0010\u000e\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006?"}, d2 = {"DoubleLineTextBaselineWithIcon", "Landroidx/compose/ui/unit/Dp;", "F", "HorizontalTextPadding", "IconDistanceFromBaseline", "Landroidx/compose/ui/unit/TextUnit;", "J", "LargeTabHeight", "SingleLineTextBaselineWithIcon", "SmallTabHeight", "TabFadeInAnimationDelay", "", "TabFadeInAnimationDuration", "TabFadeOutAnimationDuration", "TextDistanceFromLeadingIcon", "LeadingIconTab", "", "selected", "", "onClick", "Lkotlin/Function0;", "text", "Landroidx/compose/runtime/Composable;", "icon", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "selectedContentColor", "Landroidx/compose/ui/graphics/Color;", "unselectedContentColor", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "LeadingIconTab-wqdebIU", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZJJLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "Tab", "Tab-wqdebIU", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;JJLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "Tab-bogVsAg", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZJJLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "TabBaselineLayout", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "TabTransition", "activeColor", "inactiveColor", "TabTransition-Klgx-Pg", "(JJZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "placeTextAndIcon", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "density", "Landroidx/compose/ui/unit/Density;", "textPlaceable", "Landroidx/compose/ui/layout/Placeable;", "iconPlaceable", "tabWidth", "tabHeight", "firstBaseline", "lastBaseline", "placeTextOrIcon", "textOrIconPlaceable", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Tab.kt */
public final class TabKt {
    private static final float DoubleLineTextBaselineWithIcon = Dp.m5626constructorimpl((float) 6);
    /* access modifiers changed from: private */
    public static final float HorizontalTextPadding = Dp.m5626constructorimpl((float) 16);
    /* access modifiers changed from: private */
    public static final long IconDistanceFromBaseline = TextUnitKt.getSp(20);
    /* access modifiers changed from: private */
    public static final float LargeTabHeight = Dp.m5626constructorimpl((float) 72);
    private static final float SingleLineTextBaselineWithIcon = Dp.m5626constructorimpl((float) 14);
    /* access modifiers changed from: private */
    public static final float SmallTabHeight = PrimaryNavigationTabTokens.INSTANCE.m2275getContainerHeightD9Ej5fM();
    private static final int TabFadeInAnimationDelay = 100;
    private static final int TabFadeInAnimationDuration = 150;
    private static final int TabFadeOutAnimationDuration = 100;
    /* access modifiers changed from: private */
    public static final float TextDistanceFromLeadingIcon = Dp.m5626constructorimpl((float) 8);

    /* JADX WARNING: Removed duplicated region for block: B:147:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x013e  */
    /* renamed from: Tab-wqdebIU  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1674TabwqdebIU(boolean r27, kotlin.jvm.functions.Function0<kotlin.Unit> r28, androidx.compose.ui.Modifier r29, boolean r30, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r31, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r32, long r33, long r35, androidx.compose.foundation.interaction.MutableInteractionSource r37, androidx.compose.runtime.Composer r38, int r39, int r40) {
        /*
            r13 = r28
            r14 = r39
            r15 = r40
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r0 = -350627181(0xffffffffeb19da93, float:-1.8599784E26)
            r1 = r38
            androidx.compose.runtime.Composer r12 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(Tab)P(5,4,3!1,7!1,6:c#ui.graphics.Color,8:c#ui.graphics.Color)99@4497L7,101@4614L39,111@4981L234:Tab.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r12, r1)
            r1 = r15 & 1
            if (r1 == 0) goto L_0x0023
            r1 = r14 | 6
            r11 = r27
            goto L_0x0035
        L_0x0023:
            r1 = r14 & 14
            r11 = r27
            if (r1 != 0) goto L_0x0034
            boolean r1 = r12.changed((boolean) r11)
            if (r1 == 0) goto L_0x0031
            r1 = 4
            goto L_0x0032
        L_0x0031:
            r1 = 2
        L_0x0032:
            r1 = r1 | r14
            goto L_0x0035
        L_0x0034:
            r1 = r14
        L_0x0035:
            r2 = r15 & 2
            if (r2 == 0) goto L_0x003c
            r1 = r1 | 48
            goto L_0x004c
        L_0x003c:
            r2 = r14 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x004c
            boolean r2 = r12.changedInstance(r13)
            if (r2 == 0) goto L_0x0049
            r2 = 32
            goto L_0x004b
        L_0x0049:
            r2 = 16
        L_0x004b:
            r1 = r1 | r2
        L_0x004c:
            r2 = r15 & 4
            if (r2 == 0) goto L_0x0053
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0066
        L_0x0053:
            r3 = r14 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x0066
            r3 = r29
            boolean r4 = r12.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x0062
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r1 = r1 | r4
            goto L_0x0068
        L_0x0066:
            r3 = r29
        L_0x0068:
            r4 = r15 & 8
            if (r4 == 0) goto L_0x006f
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0082
        L_0x006f:
            r5 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x0082
            r5 = r30
            boolean r6 = r12.changed((boolean) r5)
            if (r6 == 0) goto L_0x007e
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007e:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r1 = r1 | r6
            goto L_0x0084
        L_0x0082:
            r5 = r30
        L_0x0084:
            r6 = r15 & 16
            r7 = 57344(0xe000, float:8.0356E-41)
            if (r6 == 0) goto L_0x008e
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a1
        L_0x008e:
            r8 = r14 & r7
            if (r8 != 0) goto L_0x00a1
            r8 = r31
            boolean r9 = r12.changedInstance(r8)
            if (r9 == 0) goto L_0x009d
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009f
        L_0x009d:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x009f:
            r1 = r1 | r9
            goto L_0x00a3
        L_0x00a1:
            r8 = r31
        L_0x00a3:
            r9 = r15 & 32
            r10 = 458752(0x70000, float:6.42848E-40)
            if (r9 == 0) goto L_0x00b0
            r16 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r16
            r10 = r32
            goto L_0x00c3
        L_0x00b0:
            r16 = r14 & r10
            r10 = r32
            if (r16 != 0) goto L_0x00c3
            boolean r16 = r12.changedInstance(r10)
            if (r16 == 0) goto L_0x00bf
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c1
        L_0x00bf:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00c1:
            r1 = r1 | r16
        L_0x00c3:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r17 = r14 & r16
            if (r17 != 0) goto L_0x00dd
            r17 = r15 & 64
            r7 = r33
            if (r17 != 0) goto L_0x00d8
            boolean r18 = r12.changed((long) r7)
            if (r18 == 0) goto L_0x00d8
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00da
        L_0x00d8:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x00da:
            r1 = r1 | r18
            goto L_0x00df
        L_0x00dd:
            r7 = r33
        L_0x00df:
            r18 = 29360128(0x1c00000, float:7.052966E-38)
            r18 = r14 & r18
            if (r18 != 0) goto L_0x00f8
            r0 = r15 & 128(0x80, float:1.794E-43)
            r7 = r35
            if (r0 != 0) goto L_0x00f4
            boolean r0 = r12.changed((long) r7)
            if (r0 == 0) goto L_0x00f4
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f6
        L_0x00f4:
            r0 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f6:
            r1 = r1 | r0
            goto L_0x00fa
        L_0x00f8:
            r7 = r35
        L_0x00fa:
            r0 = r15 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0105
            r19 = 100663296(0x6000000, float:2.4074124E-35)
            r1 = r1 | r19
            r3 = r37
            goto L_0x011a
        L_0x0105:
            r19 = 234881024(0xe000000, float:1.5777218E-30)
            r19 = r14 & r19
            r3 = r37
            if (r19 != 0) goto L_0x011a
            boolean r19 = r12.changed((java.lang.Object) r3)
            if (r19 == 0) goto L_0x0116
            r19 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0118
        L_0x0116:
            r19 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0118:
            r1 = r1 | r19
        L_0x011a:
            r19 = 191739611(0xb6db6db, float:4.5782105E-32)
            r3 = r1 & r19
            r5 = 38347922(0x2492492, float:1.4777643E-37)
            if (r3 != r5) goto L_0x013e
            boolean r3 = r12.getSkipping()
            if (r3 != 0) goto L_0x012b
            goto L_0x013e
        L_0x012b:
            r12.skipToGroupEnd()
            r3 = r29
            r4 = r30
            r5 = r31
            r11 = r37
            r6 = r10
            r16 = r12
            r9 = r7
            r7 = r33
            goto L_0x027a
        L_0x013e:
            r12.startDefaults()
            r3 = r14 & 1
            r19 = -3670017(0xffffffffffc7ffff, float:NaN)
            r20 = 0
            if (r3 == 0) goto L_0x0171
            boolean r3 = r12.getDefaultsInvalid()
            if (r3 == 0) goto L_0x0151
            goto L_0x0171
        L_0x0151:
            r12.skipToGroupEnd()
            r0 = r15 & 64
            if (r0 == 0) goto L_0x015a
            r1 = r1 & r19
        L_0x015a:
            r0 = r15 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0162
            r0 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r1 = r1 & r0
        L_0x0162:
            r19 = r29
            r21 = r30
            r22 = r33
            r26 = r37
            r24 = r7
            r9 = r10
            r10 = r31
            goto L_0x01ec
        L_0x0171:
            if (r2 == 0) goto L_0x0178
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r2 = (androidx.compose.ui.Modifier) r2
            goto L_0x017a
        L_0x0178:
            r2 = r29
        L_0x017a:
            if (r4 == 0) goto L_0x017e
            r3 = 1
            goto L_0x0180
        L_0x017e:
            r3 = r30
        L_0x0180:
            if (r6 == 0) goto L_0x0185
            r4 = r20
            goto L_0x0187
        L_0x0185:
            r4 = r31
        L_0x0187:
            if (r9 == 0) goto L_0x018b
            r10 = r20
        L_0x018b:
            r6 = r15 & 64
            if (r6 == 0) goto L_0x01ad
            androidx.compose.runtime.ProvidableCompositionLocal r6 = androidx.compose.material3.ContentColorKt.getLocalContentColor()
            androidx.compose.runtime.CompositionLocal r6 = (androidx.compose.runtime.CompositionLocal) r6
            r9 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r5 = "CC:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r12, r9, r5)
            java.lang.Object r5 = r12.consume(r6)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r12)
            androidx.compose.ui.graphics.Color r5 = (androidx.compose.ui.graphics.Color) r5
            long r5 = r5.m2831unboximpl()
            r1 = r1 & r19
            goto L_0x01af
        L_0x01ad:
            r5 = r33
        L_0x01af:
            r9 = r15 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x01b8
            r9 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r1 = r1 & r9
            r7 = r5
        L_0x01b8:
            if (r0 == 0) goto L_0x01e0
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r12.startReplaceableGroup(r0)
            java.lang.String r0 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r12, r0)
            java.lang.Object r0 = r12.rememberedValue()
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r9 = r9.getEmpty()
            if (r0 != r9) goto L_0x01d8
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r12.updateRememberedValue(r0)
        L_0x01d8:
            r12.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = (androidx.compose.foundation.interaction.MutableInteractionSource) r0
            r26 = r0
            goto L_0x01e2
        L_0x01e0:
            r26 = r37
        L_0x01e2:
            r19 = r2
            r21 = r3
            r22 = r5
            r24 = r7
            r9 = r10
            r10 = r4
        L_0x01ec:
            r12.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01ff
            r0 = -1
            java.lang.String r2 = "androidx.compose.material3.Tab (Tab.kt:92)"
            r3 = -350627181(0xffffffffeb19da93, float:-1.8599784E26)
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r1, r0, r2)
        L_0x01ff:
            if (r10 == 0) goto L_0x0213
            androidx.compose.material3.TabKt$Tab$styledText$1$1 r0 = new androidx.compose.material3.TabKt$Tab$styledText$1$1
            r0.<init>(r10, r1)
            r2 = 708874428(0x2a4090bc, float:1.710324E-13)
            r3 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r12, r2, r3, r0)
            r20 = r0
            kotlin.jvm.functions.Function2 r20 = (kotlin.jvm.functions.Function2) r20
            goto L_0x0214
        L_0x0213:
            r3 = 1
        L_0x0214:
            r0 = r20
            androidx.compose.material3.TabKt$Tab$2 r2 = new androidx.compose.material3.TabKt$Tab$2
            r2.<init>(r0, r9, r1)
            r0 = 1540996038(0x5bd9bbc6, float:1.22573058E17)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r12, r0, r3, r2)
            r18 = r0
            kotlin.jvm.functions.Function3 r18 = (kotlin.jvm.functions.Function3) r18
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            r2 = r1 & 14
            r0 = r0 | r2
            r2 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            int r1 = r1 >> 6
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r1
            r0 = r0 | r2
            r2 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r1
            r0 = r0 | r2
            r1 = r1 & r16
            r16 = r0 | r1
            r17 = 0
            r0 = r27
            r1 = r28
            r2 = r19
            r3 = r21
            r4 = r22
            r6 = r24
            r8 = r26
            r20 = r9
            r9 = r18
            r18 = r10
            r10 = r12
            r11 = r16
            r16 = r12
            r12 = r17
            m1673TabbogVsAg(r0, r1, r2, r3, r4, r6, r8, r9, r10, r11, r12)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x026c
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x026c:
            r5 = r18
            r3 = r19
            r6 = r20
            r4 = r21
            r7 = r22
            r9 = r24
            r11 = r26
        L_0x027a:
            androidx.compose.runtime.ScopeUpdateScope r12 = r16.endRestartGroup()
            if (r12 != 0) goto L_0x0281
            goto L_0x0299
        L_0x0281:
            androidx.compose.material3.TabKt$Tab$3 r16 = new androidx.compose.material3.TabKt$Tab$3
            r0 = r16
            r1 = r27
            r2 = r28
            r13 = r12
            r12 = r39
            r14 = r13
            r13 = r40
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r11, r12, r13)
            r0 = r16
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r14.updateScope(r0)
        L_0x0299:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabKt.m1674TabwqdebIU(boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, long, long, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:137:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0140  */
    /* renamed from: LeadingIconTab-wqdebIU  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1672LeadingIconTabwqdebIU(boolean r24, kotlin.jvm.functions.Function0<kotlin.Unit> r25, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r26, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r27, androidx.compose.ui.Modifier r28, boolean r29, long r30, long r32, androidx.compose.foundation.interaction.MutableInteractionSource r34, androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            r10 = r25
            r11 = r26
            r12 = r27
            r13 = r36
            r14 = r37
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "icon"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = -777316544(0xffffffffd1ab1740, float:-9.1853685E10)
            r1 = r35
            androidx.compose.runtime.Composer r15 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(LeadingIconTab)P(5,4,7,1,3!1,6:c#ui.graphics.Color,8:c#ui.graphics.Color)161@6997L7,163@7114L39,168@7394L60,170@7460L991:Tab.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r15, r1)
            r1 = r14 & 1
            if (r1 == 0) goto L_0x0033
            r1 = r13 | 6
            r9 = r24
            goto L_0x0045
        L_0x0033:
            r1 = r13 & 14
            r9 = r24
            if (r1 != 0) goto L_0x0044
            boolean r1 = r15.changed((boolean) r9)
            if (r1 == 0) goto L_0x0041
            r1 = 4
            goto L_0x0042
        L_0x0041:
            r1 = 2
        L_0x0042:
            r1 = r1 | r13
            goto L_0x0045
        L_0x0044:
            r1 = r13
        L_0x0045:
            r2 = r14 & 2
            if (r2 == 0) goto L_0x004c
            r1 = r1 | 48
            goto L_0x005c
        L_0x004c:
            r2 = r13 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x005c
            boolean r2 = r15.changedInstance(r10)
            if (r2 == 0) goto L_0x0059
            r2 = 32
            goto L_0x005b
        L_0x0059:
            r2 = 16
        L_0x005b:
            r1 = r1 | r2
        L_0x005c:
            r2 = r14 & 4
            if (r2 == 0) goto L_0x0063
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0073
        L_0x0063:
            r2 = r13 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x0073
            boolean r2 = r15.changedInstance(r11)
            if (r2 == 0) goto L_0x0070
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0072
        L_0x0070:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0072:
            r1 = r1 | r2
        L_0x0073:
            r2 = r14 & 8
            if (r2 == 0) goto L_0x007a
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x008a
        L_0x007a:
            r2 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x008a
            boolean r2 = r15.changedInstance(r12)
            if (r2 == 0) goto L_0x0087
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x0089
        L_0x0087:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0089:
            r1 = r1 | r2
        L_0x008a:
            r2 = r14 & 16
            if (r2 == 0) goto L_0x0091
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a6
        L_0x0091:
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r13
            if (r3 != 0) goto L_0x00a6
            r3 = r28
            boolean r4 = r15.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x00a2
            r4 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a4
        L_0x00a2:
            r4 = 8192(0x2000, float:1.14794E-41)
        L_0x00a4:
            r1 = r1 | r4
            goto L_0x00a8
        L_0x00a6:
            r3 = r28
        L_0x00a8:
            r4 = r14 & 32
            if (r4 == 0) goto L_0x00b0
            r5 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r5
            goto L_0x00c4
        L_0x00b0:
            r5 = 458752(0x70000, float:6.42848E-40)
            r5 = r5 & r13
            if (r5 != 0) goto L_0x00c4
            r5 = r29
            boolean r6 = r15.changed((boolean) r5)
            if (r6 == 0) goto L_0x00c0
            r6 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c2
        L_0x00c0:
            r6 = 65536(0x10000, float:9.18355E-41)
        L_0x00c2:
            r1 = r1 | r6
            goto L_0x00c6
        L_0x00c4:
            r5 = r29
        L_0x00c6:
            r6 = 3670016(0x380000, float:5.142788E-39)
            r6 = r6 & r13
            if (r6 != 0) goto L_0x00e0
            r6 = r14 & 64
            if (r6 != 0) goto L_0x00da
            r6 = r30
            boolean r8 = r15.changed((long) r6)
            if (r8 == 0) goto L_0x00dc
            r8 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00de
        L_0x00da:
            r6 = r30
        L_0x00dc:
            r8 = 524288(0x80000, float:7.34684E-40)
        L_0x00de:
            r1 = r1 | r8
            goto L_0x00e2
        L_0x00e0:
            r6 = r30
        L_0x00e2:
            r8 = 29360128(0x1c00000, float:7.052966E-38)
            r8 = r8 & r13
            if (r8 != 0) goto L_0x00fd
            r8 = r14 & 128(0x80, float:1.794E-43)
            r35 = r1
            r0 = r32
            if (r8 != 0) goto L_0x00f8
            boolean r16 = r15.changed((long) r0)
            if (r16 == 0) goto L_0x00f8
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fa
        L_0x00f8:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fa:
            r16 = r35 | r16
            goto L_0x0103
        L_0x00fd:
            r35 = r1
            r0 = r32
            r16 = r35
        L_0x0103:
            r8 = r14 & 256(0x100, float:3.59E-43)
            if (r8 == 0) goto L_0x010e
            r17 = 100663296(0x6000000, float:2.4074124E-35)
            r16 = r16 | r17
            r0 = r34
            goto L_0x0123
        L_0x010e:
            r17 = 234881024(0xe000000, float:1.5777218E-30)
            r17 = r13 & r17
            r0 = r34
            if (r17 != 0) goto L_0x0123
            boolean r1 = r15.changed((java.lang.Object) r0)
            if (r1 == 0) goto L_0x011f
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0121
        L_0x011f:
            r1 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0121:
            r16 = r16 | r1
        L_0x0123:
            r1 = 191739611(0xb6db6db, float:4.5782105E-32)
            r1 = r16 & r1
            r0 = 38347922(0x2492492, float:1.4777643E-37)
            if (r1 != r0) goto L_0x0140
            boolean r0 = r15.getSkipping()
            if (r0 != 0) goto L_0x0134
            goto L_0x0140
        L_0x0134:
            r15.skipToGroupEnd()
            r9 = r32
            r11 = r34
            r7 = r6
            r6 = r5
            r5 = r3
            goto L_0x025f
        L_0x0140:
            r15.startDefaults()
            r0 = r13 & 1
            r17 = -3670017(0xffffffffffc7ffff, float:NaN)
            r1 = 1
            if (r0 == 0) goto L_0x0172
            boolean r0 = r15.getDefaultsInvalid()
            if (r0 == 0) goto L_0x0152
            goto L_0x0172
        L_0x0152:
            r15.skipToGroupEnd()
            r0 = r14 & 64
            if (r0 == 0) goto L_0x015b
            r16 = r16 & r17
        L_0x015b:
            r0 = r14 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0164
            r0 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r16 = r16 & r0
        L_0x0164:
            r20 = r32
            r22 = r34
            r17 = r5
            r18 = r6
            r8 = r16
            r16 = r3
            goto L_0x01e1
        L_0x0172:
            if (r2 == 0) goto L_0x0179
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            r3 = r0
        L_0x0179:
            if (r4 == 0) goto L_0x017c
            r5 = r1
        L_0x017c:
            r0 = r14 & 64
            if (r0 == 0) goto L_0x019d
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.material3.ContentColorKt.getLocalContentColor()
            androidx.compose.runtime.CompositionLocal r0 = (androidx.compose.runtime.CompositionLocal) r0
            r2 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r4 = "CC:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r15, r2, r4)
            java.lang.Object r0 = r15.consume(r0)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r15)
            androidx.compose.ui.graphics.Color r0 = (androidx.compose.ui.graphics.Color) r0
            long r6 = r0.m2831unboximpl()
            r16 = r16 & r17
        L_0x019d:
            r0 = r14 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x01a9
            r0 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r0 = r16 & r0
            r16 = r6
            goto L_0x01ad
        L_0x01a9:
            r0 = r16
            r16 = r32
        L_0x01ad:
            if (r8 == 0) goto L_0x01d6
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r15.startReplaceableGroup(r2)
            java.lang.String r2 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r15, r2)
            java.lang.Object r2 = r15.rememberedValue()
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r4 = r4.getEmpty()
            if (r2 != r4) goto L_0x01cd
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r15.updateRememberedValue(r2)
        L_0x01cd:
            r15.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = (androidx.compose.foundation.interaction.MutableInteractionSource) r2
            r8 = r0
            r22 = r2
            goto L_0x01d9
        L_0x01d6:
            r22 = r34
            r8 = r0
        L_0x01d9:
            r18 = r6
            r20 = r16
            r16 = r3
            r17 = r5
        L_0x01e1:
            r15.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01f4
            r0 = -1
            java.lang.String r2 = "androidx.compose.material3.LeadingIconTab (Tab.kt:154)"
            r3 = -777316544(0xffffffffd1ab1740, float:-9.1853685E10)
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r8, r0, r2)
        L_0x01f4:
            r0 = 1
            r2 = 0
            int r3 = r8 >> 12
            r3 = r3 & 896(0x380, float:1.256E-42)
            r3 = r3 | 6
            r4 = 2
            r28 = r0
            r29 = r2
            r30 = r18
            r32 = r15
            r33 = r3
            r34 = r4
            androidx.compose.foundation.Indication r4 = androidx.compose.material.ripple.RippleKt.m1106rememberRipple9IZ8Weo(r28, r29, r30, r32, r33, r34)
            androidx.compose.material3.TabKt$LeadingIconTab$2 r7 = new androidx.compose.material3.TabKt$LeadingIconTab$2
            r0 = r7
            r6 = r1
            r1 = r16
            r2 = r24
            r3 = r22
            r5 = r17
            r10 = r6
            r6 = r25
            r11 = r7
            r7 = r27
            r23 = r8
            r9 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = -429037564(0xffffffffe66d6804, float:-2.802799E23)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r15, r0, r10, r11)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            int r1 = r23 >> 18
            r2 = r1 & 14
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            r1 = r1 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            int r2 = r23 << 6
            r2 = r2 & 896(0x380, float:1.256E-42)
            r1 = r1 | r2
            r28 = r18
            r30 = r20
            r32 = r24
            r33 = r0
            r34 = r15
            r35 = r1
            m1675TabTransitionKlgxPg(r28, r30, r32, r33, r34, r35)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0255
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0255:
            r5 = r16
            r6 = r17
            r7 = r18
            r9 = r20
            r11 = r22
        L_0x025f:
            androidx.compose.runtime.ScopeUpdateScope r15 = r15.endRestartGroup()
            if (r15 != 0) goto L_0x0266
            goto L_0x0280
        L_0x0266:
            androidx.compose.material3.TabKt$LeadingIconTab$3 r16 = new androidx.compose.material3.TabKt$LeadingIconTab$3
            r0 = r16
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r12 = r36
            r13 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r11, r12, r13)
            r0 = r16
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r15.updateScope(r0)
        L_0x0280:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabKt.m1672LeadingIconTabwqdebIU(boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, boolean, long, long, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:127:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x011d  */
    /* renamed from: Tab-bogVsAg  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1673TabbogVsAg(boolean r23, kotlin.jvm.functions.Function0<kotlin.Unit> r24, androidx.compose.ui.Modifier r25, boolean r26, long r27, long r29, androidx.compose.foundation.interaction.MutableInteractionSource r31, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r32, androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            r9 = r24
            r10 = r32
            r11 = r34
            r12 = r35
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = -202735880(0xfffffffff3ea7ef8, float:-3.715737E31)
            r1 = r33
            androidx.compose.runtime.Composer r13 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(Tab)P(5,4,3,1,6:c#ui.graphics.Color,7:c#ui.graphics.Color,2)231@10212L7,233@10329L39,239@10655L60,241@10721L618:Tab.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r13, r1)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x002b
            r1 = r11 | 6
            r14 = r23
            goto L_0x003d
        L_0x002b:
            r1 = r11 & 14
            r14 = r23
            if (r1 != 0) goto L_0x003c
            boolean r1 = r13.changed((boolean) r14)
            if (r1 == 0) goto L_0x0039
            r1 = 4
            goto L_0x003a
        L_0x0039:
            r1 = 2
        L_0x003a:
            r1 = r1 | r11
            goto L_0x003d
        L_0x003c:
            r1 = r11
        L_0x003d:
            r2 = r12 & 2
            if (r2 == 0) goto L_0x0044
            r1 = r1 | 48
            goto L_0x0054
        L_0x0044:
            r2 = r11 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0054
            boolean r2 = r13.changedInstance(r9)
            if (r2 == 0) goto L_0x0051
            r2 = 32
            goto L_0x0053
        L_0x0051:
            r2 = 16
        L_0x0053:
            r1 = r1 | r2
        L_0x0054:
            r2 = r12 & 4
            if (r2 == 0) goto L_0x005b
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x006e
        L_0x005b:
            r3 = r11 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x006e
            r3 = r25
            boolean r4 = r13.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x006a
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x006c
        L_0x006a:
            r4 = 128(0x80, float:1.794E-43)
        L_0x006c:
            r1 = r1 | r4
            goto L_0x0070
        L_0x006e:
            r3 = r25
        L_0x0070:
            r4 = r12 & 8
            if (r4 == 0) goto L_0x0077
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x008a
        L_0x0077:
            r5 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x008a
            r5 = r26
            boolean r6 = r13.changed((boolean) r5)
            if (r6 == 0) goto L_0x0086
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x0088
        L_0x0086:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x0088:
            r1 = r1 | r6
            goto L_0x008c
        L_0x008a:
            r5 = r26
        L_0x008c:
            r6 = 57344(0xe000, float:8.0356E-41)
            r6 = r6 & r11
            if (r6 != 0) goto L_0x00a7
            r6 = r12 & 16
            if (r6 != 0) goto L_0x00a1
            r6 = r27
            boolean r8 = r13.changed((long) r6)
            if (r8 == 0) goto L_0x00a3
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a5
        L_0x00a1:
            r6 = r27
        L_0x00a3:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x00a5:
            r1 = r1 | r8
            goto L_0x00a9
        L_0x00a7:
            r6 = r27
        L_0x00a9:
            r8 = 458752(0x70000, float:6.42848E-40)
            r8 = r8 & r11
            if (r8 != 0) goto L_0x00c4
            r8 = r12 & 32
            r33 = r1
            r0 = r29
            if (r8 != 0) goto L_0x00bf
            boolean r15 = r13.changed((long) r0)
            if (r15 == 0) goto L_0x00bf
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c1
        L_0x00bf:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00c1:
            r15 = r33 | r15
            goto L_0x00ca
        L_0x00c4:
            r33 = r1
            r0 = r29
            r15 = r33
        L_0x00ca:
            r16 = r12 & 64
            if (r16 == 0) goto L_0x00d5
            r17 = 1572864(0x180000, float:2.204052E-39)
            r15 = r15 | r17
            r8 = r31
            goto L_0x00ea
        L_0x00d5:
            r17 = 3670016(0x380000, float:5.142788E-39)
            r17 = r11 & r17
            r8 = r31
            if (r17 != 0) goto L_0x00ea
            boolean r17 = r13.changed((java.lang.Object) r8)
            if (r17 == 0) goto L_0x00e6
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e8
        L_0x00e6:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00e8:
            r15 = r15 | r17
        L_0x00ea:
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00f2
            r0 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x00f0:
            r15 = r15 | r0
            goto L_0x0103
        L_0x00f2:
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r0 & r11
            if (r0 != 0) goto L_0x0103
            boolean r0 = r13.changedInstance(r10)
            if (r0 == 0) goto L_0x0100
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f0
        L_0x0100:
            r0 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x00f0
        L_0x0103:
            r0 = 23967451(0x16db6db, float:4.3661218E-38)
            r0 = r0 & r15
            r1 = 4793490(0x492492, float:6.71711E-39)
            if (r0 != r1) goto L_0x011d
            boolean r0 = r13.getSkipping()
            if (r0 != 0) goto L_0x0113
            goto L_0x011d
        L_0x0113:
            r13.skipToGroupEnd()
            r4 = r5
            r5 = r6
            r9 = r8
            r7 = r29
            goto L_0x0230
        L_0x011d:
            r13.startDefaults()
            r0 = r11 & 1
            r17 = -57345(0xffffffffffff1fff, float:NaN)
            r1 = 1
            if (r0 == 0) goto L_0x014c
            boolean r0 = r13.getDefaultsInvalid()
            if (r0 == 0) goto L_0x012f
            goto L_0x014c
        L_0x012f:
            r13.skipToGroupEnd()
            r0 = r12 & 16
            if (r0 == 0) goto L_0x0138
            r15 = r15 & r17
        L_0x0138:
            r0 = r12 & 32
            if (r0 == 0) goto L_0x0140
            r0 = -458753(0xfffffffffff8ffff, float:NaN)
            r15 = r15 & r0
        L_0x0140:
            r19 = r29
            r16 = r5
            r17 = r6
            r21 = r8
            r8 = r15
            r15 = r3
            goto L_0x01b9
        L_0x014c:
            if (r2 == 0) goto L_0x0153
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            r3 = r0
        L_0x0153:
            if (r4 == 0) goto L_0x0156
            r5 = r1
        L_0x0156:
            r0 = r12 & 16
            if (r0 == 0) goto L_0x0177
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.material3.ContentColorKt.getLocalContentColor()
            androidx.compose.runtime.CompositionLocal r0 = (androidx.compose.runtime.CompositionLocal) r0
            r2 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r4 = "CC:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r13, r2, r4)
            java.lang.Object r0 = r13.consume(r0)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r13)
            androidx.compose.ui.graphics.Color r0 = (androidx.compose.ui.graphics.Color) r0
            long r6 = r0.m2831unboximpl()
            r15 = r15 & r17
        L_0x0177:
            r0 = r12 & 32
            if (r0 == 0) goto L_0x0183
            r0 = -458753(0xfffffffffff8ffff, float:NaN)
            r0 = r0 & r15
            r15 = r0
            r17 = r6
            goto L_0x0185
        L_0x0183:
            r17 = r29
        L_0x0185:
            if (r16 == 0) goto L_0x01af
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r13.startReplaceableGroup(r0)
            java.lang.String r0 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r13, r0)
            java.lang.Object r0 = r13.rememberedValue()
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r0 != r2) goto L_0x01a5
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r13.updateRememberedValue(r0)
        L_0x01a5:
            r13.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = (androidx.compose.foundation.interaction.MutableInteractionSource) r0
            r21 = r0
            r16 = r5
            goto L_0x01b3
        L_0x01af:
            r16 = r5
            r21 = r8
        L_0x01b3:
            r8 = r15
            r19 = r17
            r15 = r3
            r17 = r6
        L_0x01b9:
            r13.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01cc
            r0 = -1
            java.lang.String r2 = "androidx.compose.material3.Tab (Tab.kt:226)"
            r3 = -202735880(0xfffffffff3ea7ef8, float:-3.715737E31)
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r8, r0, r2)
        L_0x01cc:
            r0 = 1
            r2 = 0
            int r3 = r8 >> 6
            r3 = r3 & 896(0x380, float:1.256E-42)
            r3 = r3 | 6
            r4 = 2
            r25 = r0
            r26 = r2
            r27 = r17
            r29 = r13
            r30 = r3
            r31 = r4
            androidx.compose.foundation.Indication r4 = androidx.compose.material.ripple.RippleKt.m1106rememberRipple9IZ8Weo(r25, r26, r27, r29, r30, r31)
            androidx.compose.material3.TabKt$Tab$5 r7 = new androidx.compose.material3.TabKt$Tab$5
            r0 = r7
            r6 = r1
            r1 = r15
            r2 = r23
            r3 = r21
            r5 = r16
            r9 = r6
            r6 = r24
            r10 = r7
            r7 = r32
            r22 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = -551896140(0xffffffffdf1abbb4, float:-1.1149703E19)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r13, r0, r9, r10)
            r6 = r0
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            int r0 = r22 >> 12
            r1 = r0 & 14
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            int r1 = r22 << 6
            r1 = r1 & 896(0x380, float:1.256E-42)
            r8 = r0 | r1
            r1 = r17
            r3 = r19
            r5 = r23
            r7 = r13
            m1675TabTransitionKlgxPg(r1, r3, r5, r6, r7, r8)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0227
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0227:
            r3 = r15
            r4 = r16
            r5 = r17
            r7 = r19
            r9 = r21
        L_0x0230:
            androidx.compose.runtime.ScopeUpdateScope r13 = r13.endRestartGroup()
            if (r13 != 0) goto L_0x0237
            goto L_0x024c
        L_0x0237:
            androidx.compose.material3.TabKt$Tab$6 r15 = new androidx.compose.material3.TabKt$Tab$6
            r0 = r15
            r1 = r23
            r2 = r24
            r10 = r32
            r11 = r34
            r12 = r35
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r10, r11, r12)
            kotlin.jvm.functions.Function2 r15 = (kotlin.jvm.functions.Function2) r15
            r13.updateScope(r15)
        L_0x024c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabKt.m1673TabbogVsAg(boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, long, long, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: androidx.compose.animation.core.TwoWayConverter} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: TabTransition-Klgx-Pg  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1675TabTransitionKlgxPg(long r18, long r20, boolean r22, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r23, androidx.compose.runtime.Composer r24, int r25) {
        /*
            r6 = r23
            r7 = r25
            r0 = 735731848(0x2bda6088, float:1.5516624E-12)
            r1 = r24
            androidx.compose.runtime.Composer r1 = r1.startRestartGroup(r0)
            java.lang.String r2 = "C(TabTransition)P(0:c#ui.graphics.Color,2:c#ui.graphics.Color,3)272@11770L26,273@11825L550,291@12380L99:Tab.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r2)
            r2 = r7 & 14
            r3 = 2
            r4 = r18
            if (r2 != 0) goto L_0x0024
            boolean r2 = r1.changed((long) r4)
            if (r2 == 0) goto L_0x0021
            r2 = 4
            goto L_0x0022
        L_0x0021:
            r2 = r3
        L_0x0022:
            r2 = r2 | r7
            goto L_0x0025
        L_0x0024:
            r2 = r7
        L_0x0025:
            r8 = r7 & 112(0x70, float:1.57E-43)
            r14 = r20
            if (r8 != 0) goto L_0x0037
            boolean r8 = r1.changed((long) r14)
            if (r8 == 0) goto L_0x0034
            r8 = 32
            goto L_0x0036
        L_0x0034:
            r8 = 16
        L_0x0036:
            r2 = r2 | r8
        L_0x0037:
            r8 = r7 & 896(0x380, float:1.256E-42)
            r13 = r22
            if (r8 != 0) goto L_0x0049
            boolean r8 = r1.changed((boolean) r13)
            if (r8 == 0) goto L_0x0046
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0048
        L_0x0046:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0048:
            r2 = r2 | r8
        L_0x0049:
            r8 = r7 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0059
            boolean r8 = r1.changedInstance(r6)
            if (r8 == 0) goto L_0x0056
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0058
        L_0x0056:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0058:
            r2 = r2 | r8
        L_0x0059:
            r8 = r2 & 5851(0x16db, float:8.199E-42)
            r9 = 1170(0x492, float:1.64E-42)
            if (r8 != r9) goto L_0x006b
            boolean r8 = r1.getSkipping()
            if (r8 != 0) goto L_0x0066
            goto L_0x006b
        L_0x0066:
            r1.skipToGroupEnd()
            goto L_0x01ba
        L_0x006b:
            boolean r8 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            r9 = -1
            if (r8 == 0) goto L_0x0078
            java.lang.String r8 = "androidx.compose.material3.TabTransition (Tab.kt:266)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r2, r9, r8)
        L_0x0078:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r22)
            int r2 = r2 >> 6
            r8 = r2 & 14
            r10 = 0
            androidx.compose.animation.core.Transition r8 = androidx.compose.animation.core.TransitionKt.updateTransition(r0, (java.lang.String) r10, (androidx.compose.runtime.Composer) r1, (int) r8, (int) r3)
            androidx.compose.material3.TabKt$TabTransition$color$2 r0 = androidx.compose.material3.TabKt$TabTransition$color$2.INSTANCE
            kotlin.jvm.functions.Function3 r0 = (kotlin.jvm.functions.Function3) r0
            r3 = -1939694975(0xffffffff8c629a81, float:-1.7456901E-31)
            r1.startReplaceableGroup(r3)
            java.lang.String r3 = "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1"
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r3)
            java.lang.String r3 = "ColorAnimation"
            java.lang.Object r10 = r8.getTargetState()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            r11 = -1997025499(0xffffffff88f7cf25, float:-1.4914471E-33)
            r1.startReplaceableGroup(r11)
            java.lang.String r12 = "C:Tab.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r12)
            boolean r16 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            java.lang.String r9 = "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:288)"
            r15 = 0
            if (r16 == 0) goto L_0x00b9
            r14 = -1
            androidx.compose.runtime.ComposerKt.traceEventStart(r11, r15, r14, r9)
        L_0x00b9:
            if (r10 == 0) goto L_0x00be
            r16 = r4
            goto L_0x00c0
        L_0x00be:
            r16 = r20
        L_0x00c0:
            boolean r10 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r10 == 0) goto L_0x00c9
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x00c9:
            r1.endReplaceableGroup()
            androidx.compose.ui.graphics.colorspace.ColorSpace r10 = androidx.compose.ui.graphics.Color.m2825getColorSpaceimpl(r16)
            r14 = 1157296644(0x44faf204, float:2007.563)
            r1.startReplaceableGroup(r14)
            java.lang.String r14 = "C(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r14)
            boolean r14 = r1.changed((java.lang.Object) r10)
            java.lang.Object r15 = r1.rememberedValue()
            if (r14 != 0) goto L_0x00ed
            androidx.compose.runtime.Composer$Companion r14 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r14 = r14.getEmpty()
            if (r15 != r14) goto L_0x00fd
        L_0x00ed:
            androidx.compose.ui.graphics.Color$Companion r14 = androidx.compose.ui.graphics.Color.Companion
            kotlin.jvm.functions.Function1 r14 = androidx.compose.animation.ColorVectorConverterKt.getVectorConverter(r14)
            java.lang.Object r10 = r14.invoke(r10)
            r15 = r10
            androidx.compose.animation.core.TwoWayConverter r15 = (androidx.compose.animation.core.TwoWayConverter) r15
            r1.updateRememberedValue(r15)
        L_0x00fd:
            r1.endReplaceableGroup()
            r14 = r15
            androidx.compose.animation.core.TwoWayConverter r14 = (androidx.compose.animation.core.TwoWayConverter) r14
            r10 = -142660079(0xfffffffff77f2e11, float:-5.1756642E33)
            r1.startReplaceableGroup(r10)
            java.lang.String r10 = "CC(animateValue)P(3,2)856@34079L32,857@34134L31,858@34190L23,860@34226L89:Transition.kt#pdpnli"
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r10)
            java.lang.Object r10 = r8.getCurrentState()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            r1.startReplaceableGroup(r11)
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r12)
            boolean r15 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r15 == 0) goto L_0x0129
            r4 = 0
            r15 = -1
            androidx.compose.runtime.ComposerKt.traceEventStart(r11, r4, r15, r9)
        L_0x0129:
            if (r10 == 0) goto L_0x012e
            r4 = r18
            goto L_0x0130
        L_0x012e:
            r4 = r20
        L_0x0130:
            boolean r10 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r10 == 0) goto L_0x0139
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0139:
            r1.endReplaceableGroup()
            androidx.compose.ui.graphics.Color r4 = androidx.compose.ui.graphics.Color.m2811boximpl(r4)
            java.lang.Object r5 = r8.getTargetState()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r1.startReplaceableGroup(r11)
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r12)
            boolean r10 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r10 == 0) goto L_0x015b
            r10 = -1
            r12 = 0
            androidx.compose.runtime.ComposerKt.traceEventStart(r11, r12, r10, r9)
        L_0x015b:
            if (r5 == 0) goto L_0x0160
            r9 = r18
            goto L_0x0162
        L_0x0160:
            r9 = r20
        L_0x0162:
            boolean r5 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r5 == 0) goto L_0x016b
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x016b:
            r1.endReplaceableGroup()
            androidx.compose.ui.graphics.Color r10 = androidx.compose.ui.graphics.Color.m2811boximpl(r9)
            androidx.compose.animation.core.Transition$Segment r5 = r8.getSegment()
            r15 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r15)
            java.lang.Object r0 = r0.invoke(r5, r1, r9)
            r11 = r0
            androidx.compose.animation.core.FiniteAnimationSpec r11 = (androidx.compose.animation.core.FiniteAnimationSpec) r11
            r0 = 32768(0x8000, float:4.5918E-41)
            r9 = r4
            r12 = r14
            r13 = r3
            r14 = r1
            r3 = r15
            r15 = r0
            androidx.compose.runtime.State r0 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(r8, r9, r10, r11, r12, r13, r14, r15)
            r1.endReplaceableGroup()
            r1.endReplaceableGroup()
            r4 = 1
            androidx.compose.runtime.ProvidedValue[] r4 = new androidx.compose.runtime.ProvidedValue[r4]
            androidx.compose.runtime.ProvidableCompositionLocal r5 = androidx.compose.material3.ContentColorKt.getLocalContentColor()
            long r8 = TabTransition_Klgx_Pg$lambda$5(r0)
            androidx.compose.ui.graphics.Color r0 = androidx.compose.ui.graphics.Color.m2811boximpl(r8)
            androidx.compose.runtime.ProvidedValue r0 = r5.provides(r0)
            r4[r3] = r0
            r0 = r2 & 112(0x70, float:1.57E-43)
            r0 = r0 | 8
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) r4, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) r6, (androidx.compose.runtime.Composer) r1, (int) r0)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01ba
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x01ba:
            androidx.compose.runtime.ScopeUpdateScope r8 = r1.endRestartGroup()
            if (r8 != 0) goto L_0x01c1
            goto L_0x01d6
        L_0x01c1:
            androidx.compose.material3.TabKt$TabTransition$1 r9 = new androidx.compose.material3.TabKt$TabTransition$1
            r0 = r9
            r1 = r18
            r3 = r20
            r5 = r22
            r6 = r23
            r7 = r25
            r0.<init>(r1, r3, r5, r6, r7)
            kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
            r8.updateScope(r9)
        L_0x01d6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabKt.m1675TabTransitionKlgxPg(long, long, boolean, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int):void");
    }

    /* access modifiers changed from: private */
    public static final void TabBaselineLayout(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, int i) {
        int i2;
        Function2<? super Composer, ? super Integer, Unit> function23 = function2;
        Function2<? super Composer, ? super Integer, Unit> function24 = function22;
        int i3 = i;
        Composer startRestartGroup = composer.startRestartGroup(514131524);
        ComposerKt.sourceInformation(startRestartGroup, "C(TabBaselineLayout)P(1)307@12887L2151:Tab.kt#uh7d8r");
        if ((i3 & 14) == 0) {
            i2 = (startRestartGroup.changedInstance(function23) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i3 & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(function24) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(514131524, i2, -1, "androidx.compose.material3.TabBaselineLayout (Tab.kt:303)");
            }
            MeasurePolicy tabKt$TabBaselineLayout$2 = new TabKt$TabBaselineLayout$2(function23, function24);
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
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer r13 = Updater.m2444constructorimpl(startRestartGroup);
            Updater.m2451setimpl(r13, tabKt$TabBaselineLayout$2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2451setimpl(r13, density, ComposeUiNode.Companion.getSetDensity());
            Updater.m2451setimpl(r13, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2451setimpl(r13, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
            materializerOf.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 720851189, "C:Tab.kt#uh7d8r");
            startRestartGroup.startReplaceableGroup(720851189);
            ComposerKt.sourceInformation(startRestartGroup, "310@12953L173");
            if (function23 != null) {
                Modifier r3 = PaddingKt.m495paddingVpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, "text"), HorizontalTextPadding, 0.0f, 2, (Object) null);
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
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume6 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume6;
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(r3);
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
                Composer r9 = Updater.m2444constructorimpl(startRestartGroup);
                Updater.m2451setimpl(r9, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2451setimpl(r9, density2, ComposeUiNode.Companion.getSetDensity());
                Updater.m2451setimpl(r9, layoutDirection2, ComposeUiNode.Companion.getSetLayoutDirection());
                Updater.m2451setimpl(r9, viewConfiguration2, ComposeUiNode.Companion.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf2.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
                BoxScope boxScope = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -978021409, "C314@13118L6:Tab.kt#uh7d8r");
                function23.invoke(startRestartGroup, Integer.valueOf(i2 & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(150513216);
            ComposerKt.sourceInformation(startRestartGroup, "317@13189L41");
            if (function24 != null) {
                Modifier layoutId = LayoutIdKt.layoutId(Modifier.Companion, "icon");
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
                Composer r11 = Updater.m2444constructorimpl(startRestartGroup);
                Updater.m2451setimpl(r11, rememberBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2451setimpl(r11, density3, ComposeUiNode.Companion.getSetDensity());
                Updater.m2451setimpl(r11, layoutDirection3, ComposeUiNode.Companion.getSetLayoutDirection());
                Updater.m2451setimpl(r11, viewConfiguration3, ComposeUiNode.Companion.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf3.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
                BoxScope boxScope2 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -978021305, "C317@13222L6:Tab.kt#uh7d8r");
                function24.invoke(startRestartGroup, Integer.valueOf((i2 >> 3) & 14));
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
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TabKt$TabBaselineLayout$3(function23, function24, i3));
        }
    }

    /* access modifiers changed from: private */
    public static final void placeTextOrIcon(Placeable.PlacementScope placementScope, Placeable placeable, int i) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, (i - placeable.getHeight()) / 2, 0.0f, 4, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final void placeTextAndIcon(Placeable.PlacementScope placementScope, Density density, Placeable placeable, Placeable placeable2, int i, int i2, int i3, int i4) {
        Density density2 = density;
        int i5 = i3;
        int i6 = i4;
        int r3 = density.m5601roundToPx0680j_4(i5 == i6 ? SingleLineTextBaselineWithIcon : DoubleLineTextBaselineWithIcon) + density.m5601roundToPx0680j_4(PrimaryNavigationTabTokens.INSTANCE.m2273getActiveIndicatorHeightD9Ej5fM());
        int height = (placeable2.getHeight() + density.m5600roundToPxR2X_6o(IconDistanceFromBaseline)) - i5;
        int i7 = (i2 - i6) - r3;
        Placeable.PlacementScope placementScope2 = placementScope;
        Placeable.PlacementScope.placeRelative$default(placementScope2, placeable, (i - placeable.getWidth()) / 2, i7, 0.0f, 4, (Object) null);
        Placeable.PlacementScope.placeRelative$default(placementScope2, placeable2, (i - placeable2.getWidth()) / 2, i7 - height, 0.0f, 4, (Object) null);
    }

    private static final long TabTransition_Klgx_Pg$lambda$5(State<Color> state) {
        return state.getValue().m2831unboximpl();
    }
}
