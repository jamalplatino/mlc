package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.tokens.NavigationBarTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001ae\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\u001c\u0010\u001c\u001a\u0018\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00130\u001d¢\u0006\u0002\b\u001f¢\u0006\u0002\b H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001ak\u0010#\u001a\u00020\u00132\u0011\u0010$\u001a\r\u0012\u0004\u0012\u00020\u00130%¢\u0006\u0002\b\u001f2\u0011\u0010&\u001a\r\u0012\u0004\u0012\u00020\u00130%¢\u0006\u0002\b\u001f2\u0011\u0010'\u001a\r\u0012\u0004\u0012\u00020\u00130%¢\u0006\u0002\b\u001f2\u0013\u0010(\u001a\u000f\u0012\u0004\u0012\u00020\u0013\u0018\u00010%¢\u0006\u0002\b\u001f2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0003¢\u0006\u0002\u0010-\u001a\u0001\u0010.\u001a\u00020\u0013*\u00020\u001e2\u0006\u0010/\u001a\u00020*2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00130%2\u0011\u0010'\u001a\r\u0012\u0004\u0012\u00020\u00130%¢\u0006\u0002\b\u001f2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u00101\u001a\u00020*2\u0015\b\u0002\u0010(\u001a\u000f\u0012\u0004\u0012\u00020\u0013\u0018\u00010%¢\u0006\u0002\b\u001f2\b\b\u0002\u0010)\u001a\u00020*2\b\b\u0002\u00102\u001a\u0002032\b\b\u0002\u00104\u001a\u000205H\u0007¢\u0006\u0002\u00106\u001a;\u00107\u001a\u000208*\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020;2\b\u0010=\u001a\u0004\u0018\u00010;2\u0006\u0010>\u001a\u00020?H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b@\u0010A\u001aS\u0010B\u001a\u000208*\u0002092\u0006\u0010C\u001a\u00020;2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020;2\b\u0010=\u001a\u0004\u0018\u00010;2\u0006\u0010>\u001a\u00020?2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bD\u0010E\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u0013\u0010\u0002\u001a\u00020\u0003X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u000e\u0010\u0005\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u0013\u0010\u0007\u001a\u00020\u0003X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\b\u001a\u00020\u0003X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u0013\u0010\f\u001a\u00020\u0003X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0019\u0010\r\u001a\u00020\u0003X\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u000e\u0010\u000f\"\u0019\u0010\u0010\u001a\u00020\u0003X\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0011\u0010\u000f\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006F"}, d2 = {"IconLayoutIdTag", "", "IndicatorHorizontalPadding", "Landroidx/compose/ui/unit/Dp;", "F", "IndicatorLayoutIdTag", "IndicatorRippleLayoutIdTag", "IndicatorVerticalOffset", "IndicatorVerticalPadding", "ItemAnimationDurationMillis", "", "LabelLayoutIdTag", "NavigationBarHeight", "NavigationBarItemHorizontalPadding", "getNavigationBarItemHorizontalPadding", "()F", "NavigationBarItemVerticalPadding", "getNavigationBarItemVerticalPadding", "NavigationBar", "", "modifier", "Landroidx/compose/ui/Modifier;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "tonalElevation", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "NavigationBar-HsRjFd4", "(Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "NavigationBarItemBaselineLayout", "indicatorRipple", "Lkotlin/Function0;", "indicator", "icon", "label", "alwaysShowLabel", "", "animationProgress", "", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLandroidx/compose/runtime/Composer;I)V", "NavigationBarItem", "selected", "onClick", "enabled", "colors", "Landroidx/compose/material3/NavigationBarItemColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Landroidx/compose/foundation/layout/RowScope;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/NavigationBarItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "placeIcon", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "iconPlaceable", "Landroidx/compose/ui/layout/Placeable;", "indicatorRipplePlaceable", "indicatorPlaceable", "constraints", "Landroidx/compose/ui/unit/Constraints;", "placeIcon-X9ElhV4", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;", "placeLabelAndIcon", "labelPlaceable", "placeLabelAndIcon-zUg2_y0", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JZF)Landroidx/compose/ui/layout/MeasureResult;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: NavigationBar.kt */
public final class NavigationBarKt {
    private static final String IconLayoutIdTag = "icon";
    /* access modifiers changed from: private */
    public static final float IndicatorHorizontalPadding;
    private static final String IndicatorLayoutIdTag = "indicator";
    private static final String IndicatorRippleLayoutIdTag = "indicatorRipple";
    private static final float IndicatorVerticalOffset = Dp.m5626constructorimpl((float) 12);
    /* access modifiers changed from: private */
    public static final float IndicatorVerticalPadding;
    private static final int ItemAnimationDurationMillis = 100;
    private static final String LabelLayoutIdTag = "label";
    /* access modifiers changed from: private */
    public static final float NavigationBarHeight = NavigationBarTokens.INSTANCE.m2147getContainerHeightD9Ej5fM();
    private static final float NavigationBarItemHorizontalPadding = Dp.m5626constructorimpl((float) 8);
    private static final float NavigationBarItemVerticalPadding = Dp.m5626constructorimpl((float) 16);

    public static final float getNavigationBarItemHorizontalPadding() {
        return NavigationBarItemHorizontalPadding;
    }

    public static final float getNavigationBarItemVerticalPadding() {
        return NavigationBarItemVerticalPadding;
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d4  */
    /* renamed from: NavigationBar-HsRjFd4  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1445NavigationBarHsRjFd4(androidx.compose.ui.Modifier r25, long r26, long r28, float r30, androidx.compose.foundation.layout.WindowInsets r31, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r32, androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            r8 = r32
            r9 = r34
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 1596802123(0x5f2d444b, float:1.2485187E19)
            r1 = r33
            androidx.compose.runtime.Composer r1 = r1.startRestartGroup(r0)
            java.lang.String r2 = "C(NavigationBar)P(3,0:c#ui.graphics.Color,2:c#ui.graphics.Color,4:c#ui.unit.Dp,5)100@4715L14,101@4771L11,103@4929L12,106@4996L503:NavigationBar.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r2)
            r2 = r35 & 1
            if (r2 == 0) goto L_0x0022
            r3 = r9 | 6
            r4 = r3
            r3 = r25
            goto L_0x0036
        L_0x0022:
            r3 = r9 & 14
            if (r3 != 0) goto L_0x0033
            r3 = r25
            boolean r4 = r1.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x0030
            r4 = 4
            goto L_0x0031
        L_0x0030:
            r4 = 2
        L_0x0031:
            r4 = r4 | r9
            goto L_0x0036
        L_0x0033:
            r3 = r25
            r4 = r9
        L_0x0036:
            r5 = r9 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x004f
            r5 = r35 & 2
            if (r5 != 0) goto L_0x0049
            r5 = r26
            boolean r7 = r1.changed((long) r5)
            if (r7 == 0) goto L_0x004b
            r7 = 32
            goto L_0x004d
        L_0x0049:
            r5 = r26
        L_0x004b:
            r7 = 16
        L_0x004d:
            r4 = r4 | r7
            goto L_0x0051
        L_0x004f:
            r5 = r26
        L_0x0051:
            r7 = r9 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0068
            r7 = r35 & 4
            r10 = r28
            if (r7 != 0) goto L_0x0064
            boolean r7 = r1.changed((long) r10)
            if (r7 == 0) goto L_0x0064
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r4 = r4 | r7
            goto L_0x006a
        L_0x0068:
            r10 = r28
        L_0x006a:
            r7 = r35 & 8
            if (r7 == 0) goto L_0x0071
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x0084
        L_0x0071:
            r12 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r12 != 0) goto L_0x0084
            r12 = r30
            boolean r13 = r1.changed((float) r12)
            if (r13 == 0) goto L_0x0080
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x0082
        L_0x0080:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x0082:
            r4 = r4 | r13
            goto L_0x0086
        L_0x0084:
            r12 = r30
        L_0x0086:
            r13 = 57344(0xe000, float:8.0356E-41)
            r14 = r9 & r13
            if (r14 != 0) goto L_0x00a2
            r14 = r35 & 16
            if (r14 != 0) goto L_0x009c
            r14 = r31
            boolean r15 = r1.changed((java.lang.Object) r14)
            if (r15 == 0) goto L_0x009e
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a0
        L_0x009c:
            r14 = r31
        L_0x009e:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x00a0:
            r4 = r4 | r15
            goto L_0x00a4
        L_0x00a2:
            r14 = r31
        L_0x00a4:
            r15 = r35 & 32
            if (r15 == 0) goto L_0x00ac
            r15 = 196608(0x30000, float:2.75506E-40)
        L_0x00aa:
            r4 = r4 | r15
            goto L_0x00bd
        L_0x00ac:
            r15 = 458752(0x70000, float:6.42848E-40)
            r15 = r15 & r9
            if (r15 != 0) goto L_0x00bd
            boolean r15 = r1.changedInstance(r8)
            if (r15 == 0) goto L_0x00ba
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00aa
        L_0x00ba:
            r15 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00aa
        L_0x00bd:
            r15 = 374491(0x5b6db, float:5.24774E-40)
            r15 = r15 & r4
            r13 = 74898(0x12492, float:1.04954E-40)
            if (r15 != r13) goto L_0x00d4
            boolean r13 = r1.getSkipping()
            if (r13 != 0) goto L_0x00cd
            goto L_0x00d4
        L_0x00cd:
            r1.skipToGroupEnd()
            r2 = r3
            r7 = r12
            goto L_0x018e
        L_0x00d4:
            r1.startDefaults()
            r13 = r9 & 1
            r15 = -57345(0xffffffffffff1fff, float:NaN)
            if (r13 == 0) goto L_0x0101
            boolean r13 = r1.getDefaultsInvalid()
            if (r13 == 0) goto L_0x00e5
            goto L_0x0101
        L_0x00e5:
            r1.skipToGroupEnd()
            r2 = r35 & 2
            if (r2 == 0) goto L_0x00ee
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00ee:
            r2 = r35 & 4
            if (r2 == 0) goto L_0x00f4
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00f4:
            r2 = r35 & 16
            if (r2 == 0) goto L_0x00f9
            r4 = r4 & r15
        L_0x00f9:
            r2 = r3
        L_0x00fa:
            r7 = r12
            r23 = r10
            r10 = r4
            r3 = r23
            goto L_0x013d
        L_0x0101:
            if (r2 == 0) goto L_0x0108
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r2 = (androidx.compose.ui.Modifier) r2
            goto L_0x0109
        L_0x0108:
            r2 = r3
        L_0x0109:
            r3 = r35 & 2
            r13 = 6
            if (r3 == 0) goto L_0x0116
            androidx.compose.material3.NavigationBarDefaults r3 = androidx.compose.material3.NavigationBarDefaults.INSTANCE
            long r5 = r3.getContainerColor(r1, r13)
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0116:
            r3 = r35 & 4
            if (r3 == 0) goto L_0x0127
            androidx.compose.material3.MaterialTheme r3 = androidx.compose.material3.MaterialTheme.INSTANCE
            androidx.compose.material3.ColorScheme r3 = r3.getColorScheme(r1, r13)
            long r10 = androidx.compose.material3.ColorSchemeKt.m1241contentColorFor4WTKRHQ(r3, r5)
            r3 = r4 & -897(0xfffffffffffffc7f, float:NaN)
            r4 = r3
        L_0x0127:
            if (r7 == 0) goto L_0x0130
            androidx.compose.material3.NavigationBarDefaults r3 = androidx.compose.material3.NavigationBarDefaults.INSTANCE
            float r3 = r3.m1441getElevationD9Ej5fM()
            r12 = r3
        L_0x0130:
            r3 = r35 & 16
            if (r3 == 0) goto L_0x00fa
            androidx.compose.material3.NavigationBarDefaults r3 = androidx.compose.material3.NavigationBarDefaults.INSTANCE
            androidx.compose.foundation.layout.WindowInsets r3 = r3.getWindowInsets(r1, r13)
            r4 = r4 & r15
            r14 = r3
            goto L_0x00fa
        L_0x013d:
            r1.endDefaults()
            boolean r11 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r11 == 0) goto L_0x014d
            r11 = -1
            java.lang.String r12 = "androidx.compose.material3.NavigationBar (NavigationBar.kt:98)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r10, r11, r12)
        L_0x014d:
            r11 = 0
            r17 = 0
            r18 = 0
            androidx.compose.material3.NavigationBarKt$NavigationBar$1 r0 = new androidx.compose.material3.NavigationBarKt$NavigationBar$1
            r0.<init>(r14, r8, r10)
            r12 = 105663120(0x64c4a90, float:3.8422915E-35)
            r13 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r1, r12, r13, r0)
            r19 = r0
            kotlin.jvm.functions.Function2 r19 = (kotlin.jvm.functions.Function2) r19
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            r12 = r10 & 14
            r0 = r0 | r12
            int r10 = r10 << 3
            r12 = r10 & 896(0x380, float:1.256E-42)
            r0 = r0 | r12
            r12 = r10 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r12
            r12 = 57344(0xe000, float:8.0356E-41)
            r10 = r10 & r12
            r21 = r0 | r10
            r22 = 98
            r10 = r2
            r12 = r5
            r0 = r14
            r14 = r3
            r16 = r7
            r20 = r1
            androidx.compose.material3.SurfaceKt.m1641SurfaceT9BRK9s(r10, r11, r12, r14, r16, r17, r18, r19, r20, r21, r22)
            boolean r10 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r10 == 0) goto L_0x018c
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x018c:
            r14 = r0
            r10 = r3
        L_0x018e:
            androidx.compose.runtime.ScopeUpdateScope r12 = r1.endRestartGroup()
            if (r12 != 0) goto L_0x0195
            goto L_0x01ab
        L_0x0195:
            androidx.compose.material3.NavigationBarKt$NavigationBar$2 r13 = new androidx.compose.material3.NavigationBarKt$NavigationBar$2
            r0 = r13
            r1 = r2
            r2 = r5
            r4 = r10
            r6 = r7
            r7 = r14
            r8 = r32
            r9 = r34
            r10 = r35
            r0.<init>(r1, r2, r4, r6, r7, r8, r9, r10)
            kotlin.jvm.functions.Function2 r13 = (kotlin.jvm.functions.Function2) r13
            r12.updateScope(r13)
        L_0x01ab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationBarKt.m1445NavigationBarHsRjFd4(androidx.compose.ui.Modifier, long, long, float, androidx.compose.foundation.layout.WindowInsets, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x04a3  */
    /* JADX WARNING: Removed duplicated region for block: B:179:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x012d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void NavigationBarItem(androidx.compose.foundation.layout.RowScope r36, boolean r37, kotlin.jvm.functions.Function0<kotlin.Unit> r38, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r39, androidx.compose.ui.Modifier r40, boolean r41, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r42, boolean r43, androidx.compose.material3.NavigationBarItemColors r44, androidx.compose.foundation.interaction.MutableInteractionSource r45, androidx.compose.runtime.Composer r46, int r47, int r48) {
        /*
            r1 = r36
            r10 = r37
            r11 = r38
            r12 = r39
            r13 = r47
            r14 = r48
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "icon"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = -663510974(0xffffffffd873a042, float:-1.07147851E15)
            r2 = r46
            androidx.compose.runtime.Composer r9 = r2.startRestartGroup(r0)
            java.lang.String r2 = "C(NavigationBarItem)P(8,7,3,6,2,5)167@7728L8,168@7788L39,189@8761L30,202@9139L52,191@8797L2501:NavigationBar.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r9, r2)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r14
            if (r2 == 0) goto L_0x0033
            r2 = r13 | 6
            goto L_0x0043
        L_0x0033:
            r2 = r13 & 14
            if (r2 != 0) goto L_0x0042
            boolean r2 = r9.changed((java.lang.Object) r1)
            if (r2 == 0) goto L_0x003f
            r2 = 4
            goto L_0x0040
        L_0x003f:
            r2 = 2
        L_0x0040:
            r2 = r2 | r13
            goto L_0x0043
        L_0x0042:
            r2 = r13
        L_0x0043:
            r3 = r14 & 1
            if (r3 == 0) goto L_0x004a
            r2 = r2 | 48
            goto L_0x005a
        L_0x004a:
            r3 = r13 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x005a
            boolean r3 = r9.changed((boolean) r10)
            if (r3 == 0) goto L_0x0057
            r3 = 32
            goto L_0x0059
        L_0x0057:
            r3 = 16
        L_0x0059:
            r2 = r2 | r3
        L_0x005a:
            r3 = r14 & 2
            if (r3 == 0) goto L_0x0061
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0071
        L_0x0061:
            r3 = r13 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x0071
            boolean r3 = r9.changedInstance(r11)
            if (r3 == 0) goto L_0x006e
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0070
        L_0x006e:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0070:
            r2 = r2 | r3
        L_0x0071:
            r3 = r14 & 4
            if (r3 == 0) goto L_0x0078
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x0088
        L_0x0078:
            r3 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r3 != 0) goto L_0x0088
            boolean r3 = r9.changedInstance(r12)
            if (r3 == 0) goto L_0x0085
            r3 = 2048(0x800, float:2.87E-42)
            goto L_0x0087
        L_0x0085:
            r3 = 1024(0x400, float:1.435E-42)
        L_0x0087:
            r2 = r2 | r3
        L_0x0088:
            r3 = r14 & 8
            r33 = 57344(0xe000, float:8.0356E-41)
            if (r3 == 0) goto L_0x0092
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a5
        L_0x0092:
            r4 = r13 & r33
            if (r4 != 0) goto L_0x00a5
            r4 = r40
            boolean r5 = r9.changed((java.lang.Object) r4)
            if (r5 == 0) goto L_0x00a1
            r5 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a3
        L_0x00a1:
            r5 = 8192(0x2000, float:1.14794E-41)
        L_0x00a3:
            r2 = r2 | r5
            goto L_0x00a7
        L_0x00a5:
            r4 = r40
        L_0x00a7:
            r5 = r14 & 16
            if (r5 == 0) goto L_0x00af
            r6 = 196608(0x30000, float:2.75506E-40)
            r2 = r2 | r6
            goto L_0x00c3
        L_0x00af:
            r6 = 458752(0x70000, float:6.42848E-40)
            r6 = r6 & r13
            if (r6 != 0) goto L_0x00c3
            r6 = r41
            boolean r7 = r9.changed((boolean) r6)
            if (r7 == 0) goto L_0x00bf
            r7 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c1
        L_0x00bf:
            r7 = 65536(0x10000, float:9.18355E-41)
        L_0x00c1:
            r2 = r2 | r7
            goto L_0x00c5
        L_0x00c3:
            r6 = r41
        L_0x00c5:
            r7 = r14 & 32
            if (r7 == 0) goto L_0x00cd
            r15 = 1572864(0x180000, float:2.204052E-39)
            r2 = r2 | r15
            goto L_0x00e2
        L_0x00cd:
            r15 = 3670016(0x380000, float:5.142788E-39)
            r15 = r15 & r13
            if (r15 != 0) goto L_0x00e2
            r15 = r42
            boolean r16 = r9.changedInstance(r15)
            if (r16 == 0) goto L_0x00dd
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00df
        L_0x00dd:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00df:
            r2 = r2 | r16
            goto L_0x00e4
        L_0x00e2:
            r15 = r42
        L_0x00e4:
            r16 = r14 & 64
            if (r16 == 0) goto L_0x00ef
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            r2 = r2 | r17
            r8 = r43
            goto L_0x0104
        L_0x00ef:
            r17 = 29360128(0x1c00000, float:7.052966E-38)
            r17 = r13 & r17
            r8 = r43
            if (r17 != 0) goto L_0x0104
            boolean r17 = r9.changed((boolean) r8)
            if (r17 == 0) goto L_0x0100
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0102
        L_0x0100:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x0102:
            r2 = r2 | r17
        L_0x0104:
            r17 = 234881024(0xe000000, float:1.5777218E-30)
            r17 = r13 & r17
            if (r17 != 0) goto L_0x0120
            r0 = r14 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x0119
            r0 = r44
            boolean r17 = r9.changed((java.lang.Object) r0)
            if (r17 == 0) goto L_0x011b
            r17 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011d
        L_0x0119:
            r0 = r44
        L_0x011b:
            r17 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011d:
            r2 = r2 | r17
            goto L_0x0122
        L_0x0120:
            r0 = r44
        L_0x0122:
            r0 = r14 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x012d
            r17 = 805306368(0x30000000, float:4.656613E-10)
            r2 = r2 | r17
            r1 = r45
            goto L_0x0142
        L_0x012d:
            r17 = 1879048192(0x70000000, float:1.58456325E29)
            r17 = r13 & r17
            r1 = r45
            if (r17 != 0) goto L_0x0142
            boolean r17 = r9.changed((java.lang.Object) r1)
            if (r17 == 0) goto L_0x013e
            r17 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0140
        L_0x013e:
            r17 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0140:
            r2 = r2 | r17
        L_0x0142:
            r17 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r1 = r2 & r17
            r4 = 306783378(0x12492492, float:6.3469493E-28)
            if (r1 != r4) goto L_0x0160
            boolean r1 = r9.getSkipping()
            if (r1 != 0) goto L_0x0153
            goto L_0x0160
        L_0x0153:
            r9.skipToGroupEnd()
            r5 = r40
            r11 = r45
            r13 = r9
            r7 = r15
            r9 = r44
            goto L_0x049c
        L_0x0160:
            r9.startDefaults()
            r1 = r13 & 1
            java.lang.String r4 = "CC(remember):Composables.kt#9igjgp"
            r34 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r11 = 1
            if (r1 == 0) goto L_0x0189
            boolean r1 = r9.getDefaultsInvalid()
            if (r1 == 0) goto L_0x0174
            goto L_0x0189
        L_0x0174:
            r9.skipToGroupEnd()
            r0 = r14 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x017d
            r2 = r2 & r34
        L_0x017d:
            r1 = r40
            r7 = r45
            r0 = r6
            r16 = r8
            r8 = r44
            r6 = r2
            goto L_0x01ed
        L_0x0189:
            if (r3 == 0) goto L_0x0190
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
            goto L_0x0192
        L_0x0190:
            r1 = r40
        L_0x0192:
            if (r5 == 0) goto L_0x0195
            r6 = r11
        L_0x0195:
            if (r7 == 0) goto L_0x0199
            r3 = 0
            goto L_0x019a
        L_0x0199:
            r3 = r15
        L_0x019a:
            if (r16 == 0) goto L_0x019d
            r8 = r11
        L_0x019d:
            r5 = r14 & 128(0x80, float:1.794E-43)
            if (r5 == 0) goto L_0x01be
            androidx.compose.material3.NavigationBarItemDefaults r15 = androidx.compose.material3.NavigationBarItemDefaults.INSTANCE
            r16 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r28 = 0
            r31 = 12582912(0xc00000, float:1.7632415E-38)
            r32 = 127(0x7f, float:1.78E-43)
            r30 = r9
            androidx.compose.material3.NavigationBarItemColors r5 = r15.m1443colors69fazGs(r16, r18, r20, r22, r24, r26, r28, r30, r31, r32)
            r2 = r2 & r34
            goto L_0x01c0
        L_0x01be:
            r5 = r44
        L_0x01c0:
            if (r0 == 0) goto L_0x01e5
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r9.startReplaceableGroup(r0)
            androidx.compose.runtime.ComposerKt.sourceInformation(r9, r4)
            java.lang.Object r0 = r9.rememberedValue()
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r7 = r7.getEmpty()
            if (r0 != r7) goto L_0x01de
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r9.updateRememberedValue(r0)
        L_0x01de:
            r9.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = (androidx.compose.foundation.interaction.MutableInteractionSource) r0
            r7 = r0
            goto L_0x01e7
        L_0x01e5:
            r7 = r45
        L_0x01e7:
            r15 = r3
            r0 = r6
            r16 = r8
            r6 = r2
            r8 = r5
        L_0x01ed:
            r9.endDefaults()
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x0200
            r2 = -1
            java.lang.String r3 = "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:159)"
            r5 = -663510974(0xffffffffd873a042, float:-1.07147851E15)
            androidx.compose.runtime.ComposerKt.traceEventStart(r5, r6, r2, r3)
        L_0x0200:
            androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledIcon$1 r5 = new androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledIcon$1
            r2 = r5
            r3 = r8
            r35 = r4
            r4 = r37
            r12 = r5
            r5 = r0
            r17 = r6
            r18 = r7
            r7 = r15
            r19 = r8
            r8 = r16
            r13 = r9
            r9 = r39
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r2 = -1419576100(0xffffffffab62fcdc, float:-8.064224E-13)
            androidx.compose.runtime.internal.ComposableLambda r2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r13, r2, r11, r12)
            r12 = r2
            kotlin.jvm.functions.Function2 r12 = (kotlin.jvm.functions.Function2) r12
            if (r15 == 0) goto L_0x0245
            androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledLabel$1$1 r2 = new androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledLabel$1$1
            r40 = r2
            r41 = r19
            r42 = r37
            r43 = r0
            r44 = r17
            r45 = r15
            r40.<init>(r41, r42, r43, r44, r45)
            r3 = 1644987592(0x620c84c8, float:6.48028E20)
            androidx.compose.runtime.internal.ComposableLambda r2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r13, r3, r11, r2)
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            r20 = r2
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            goto L_0x024a
        L_0x0245:
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r20 = 0
        L_0x024a:
            r13.startReplaceableGroup(r2)
            r2 = r35
            androidx.compose.runtime.ComposerKt.sourceInformation(r13, r2)
            java.lang.Object r2 = r13.rememberedValue()
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r3 = r3.getEmpty()
            r4 = 0
            if (r2 != r3) goto L_0x026d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r3 = 0
            r9 = 2
            androidx.compose.runtime.MutableState r2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r2, r3, r9, r3)
            r13.updateRememberedValue(r2)
            goto L_0x026e
        L_0x026d:
            r9 = 2
        L_0x026e:
            r13.endReplaceableGroup()
            r8 = r2
            androidx.compose.runtime.MutableState r8 = (androidx.compose.runtime.MutableState) r8
            androidx.compose.ui.semantics.Role$Companion r2 = androidx.compose.ui.semantics.Role.Companion
            int r2 = r2.m4976getTabo7Vup1c()
            r3 = 0
            androidx.compose.ui.semantics.Role r2 = androidx.compose.ui.semantics.Role.m4963boximpl(r2)
            r40 = r1
            r41 = r37
            r42 = r18
            r43 = r3
            r44 = r0
            r45 = r2
            r46 = r38
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.selection.SelectableKt.m812selectableO2vRcR0(r40, r41, r42, r43, r44, r45, r46)
            r3 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            r6 = 2
            r7 = 0
            r40 = r36
            r41 = r2
            r42 = r3
            r43 = r5
            r44 = r6
            r45 = r7
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.RowScope.weight$default(r40, r41, r42, r43, r44, r45)
            r3 = 1157296644(0x44faf204, float:2007.563)
            r13.startReplaceableGroup(r3)
            java.lang.String r3 = "CC(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r13, r3)
            boolean r3 = r13.changed((java.lang.Object) r8)
            java.lang.Object r5 = r13.rememberedValue()
            if (r3 != 0) goto L_0x02c3
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r3 = r3.getEmpty()
            if (r5 != r3) goto L_0x02ce
        L_0x02c3:
            androidx.compose.material3.NavigationBarKt$NavigationBarItem$2$1 r3 = new androidx.compose.material3.NavigationBarKt$NavigationBarItem$2$1
            r3.<init>(r8)
            r5 = r3
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            r13.updateRememberedValue(r5)
        L_0x02ce:
            r13.endReplaceableGroup()
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.layout.OnRemeasuredModifierKt.onSizeChanged(r2, r5)
            androidx.compose.ui.Alignment$Companion r3 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment r3 = r3.getCenter()
            r5 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r13.startReplaceableGroup(r5)
            java.lang.String r5 = "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformation(r13, r5)
            r5 = 6
            androidx.compose.ui.layout.MeasurePolicy r3 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(r3, r4, r13, r5)
            r6 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r13.startReplaceableGroup(r6)
            java.lang.String r6 = "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh"
            androidx.compose.runtime.ComposerKt.sourceInformation(r13, r6)
            androidx.compose.runtime.ProvidableCompositionLocal r6 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r6 = (androidx.compose.runtime.CompositionLocal) r6
            r7 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r9 = "C:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r13, r7, r9)
            java.lang.Object r6 = r13.consume(r6)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r13)
            androidx.compose.ui.unit.Density r6 = (androidx.compose.ui.unit.Density) r6
            androidx.compose.runtime.ProvidableCompositionLocal r21 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            r11 = r21
            androidx.compose.runtime.CompositionLocal r11 = (androidx.compose.runtime.CompositionLocal) r11
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r13, r7, r9)
            java.lang.Object r11 = r13.consume(r11)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r13)
            androidx.compose.ui.unit.LayoutDirection r11 = (androidx.compose.ui.unit.LayoutDirection) r11
            androidx.compose.runtime.ProvidableCompositionLocal r21 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            r5 = r21
            androidx.compose.runtime.CompositionLocal r5 = (androidx.compose.runtime.CompositionLocal) r5
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r13, r7, r9)
            java.lang.Object r5 = r13.consume(r5)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r13)
            androidx.compose.ui.platform.ViewConfiguration r5 = (androidx.compose.ui.platform.ViewConfiguration) r5
            androidx.compose.ui.node.ComposeUiNode$Companion r9 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function0 r9 = r9.getConstructor()
            kotlin.jvm.functions.Function3 r2 = androidx.compose.ui.layout.LayoutKt.materializerOf(r2)
            androidx.compose.runtime.Applier r7 = r13.getApplier()
            boolean r7 = r7 instanceof androidx.compose.runtime.Applier
            if (r7 != 0) goto L_0x034c
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x034c:
            r13.startReusableNode()
            boolean r7 = r13.getInserting()
            if (r7 == 0) goto L_0x0359
            r13.createNode(r9)
            goto L_0x035c
        L_0x0359:
            r13.useNode()
        L_0x035c:
            r13.disableReusing()
            androidx.compose.runtime.Composer r7 = androidx.compose.runtime.Updater.m2444constructorimpl(r13)
            androidx.compose.ui.node.ComposeUiNode$Companion r9 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r9 = r9.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r7, r3, r9)
            androidx.compose.ui.node.ComposeUiNode$Companion r3 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r3 = r3.getSetDensity()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r7, r6, r3)
            androidx.compose.ui.node.ComposeUiNode$Companion r3 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r3 = r3.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r7, r11, r3)
            androidx.compose.ui.node.ComposeUiNode$Companion r3 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r3 = r3.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r7, r5, r3)
            r13.enableReusing()
            androidx.compose.runtime.Composer r3 = androidx.compose.runtime.SkippableUpdater.m2436constructorimpl(r13)
            androidx.compose.runtime.SkippableUpdater r3 = androidx.compose.runtime.SkippableUpdater.m2435boximpl(r3)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r2.invoke(r3, r13, r5)
            r2 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r13.startReplaceableGroup(r2)
            r2 = -1253629305(0xffffffffb5472287, float:-7.418352E-7)
            java.lang.String r3 = "C72@3384L9:Box.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r13, r2, r3)
            androidx.compose.foundation.layout.BoxScopeInstance r2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE
            androidx.compose.foundation.layout.BoxScope r2 = (androidx.compose.foundation.layout.BoxScope) r2
            r2 = 1035149591(0x3db32117, float:0.08746546)
            java.lang.String r3 = "C207@9285L145,*216@9714L7,223@10014L120,248@11007L285:NavigationBar.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r13, r2, r3)
            if (r10 == 0) goto L_0x03b8
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x03b9
        L_0x03b8:
            r2 = 0
        L_0x03b9:
            r3 = 100
            r5 = 6
            r6 = 0
            androidx.compose.animation.core.TweenSpec r3 = androidx.compose.animation.core.AnimationSpecKt.tween$default(r3, r4, r6, r5, r6)
            androidx.compose.animation.core.AnimationSpec r3 = (androidx.compose.animation.core.AnimationSpec) r3
            r4 = 0
            r5 = 0
            r6 = 0
            r9 = 48
            r11 = 28
            r7 = r13
            r21 = r8
            r8 = r9
            r40 = r0
            r0 = 2
            r9 = r11
            androidx.compose.runtime.State r2 = androidx.compose.animation.core.AnimateAsStateKt.animateFloatAsState(r2, r3, r4, r5, r6, r7, r8, r9)
            androidx.compose.runtime.ProvidableCompositionLocal r3 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r3 = (androidx.compose.runtime.CompositionLocal) r3
            java.lang.String r4 = "CC:CompositionLocal.kt#9igjgp"
            r5 = 2023513938(0x789c5f52, float:2.5372864E34)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r13, r5, r4)
            java.lang.Object r3 = r13.consume(r3)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r13)
            androidx.compose.ui.unit.Density r3 = (androidx.compose.ui.unit.Density) r3
            androidx.compose.material3.tokens.NavigationBarTokens r4 = androidx.compose.material3.tokens.NavigationBarTokens.INSTANCE
            float r4 = r4.m2145getActiveIndicatorWidthD9Ej5fM()
            int r4 = r3.m5601roundToPx0680j_4(r4)
            int r5 = NavigationBarItem$lambda$3(r21)
            int r5 = r5 - r4
            float r4 = (float) r5
            float r0 = (float) r0
            float r4 = r4 / r0
            float r0 = IndicatorVerticalOffset
            float r0 = r3.m5607toPx0680j_4(r0)
            long r3 = androidx.compose.ui.geometry.OffsetKt.Offset(r4, r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            androidx.compose.ui.geometry.Offset r0 = androidx.compose.ui.geometry.Offset.m2561boximpl(r3)
            r5 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r13.startReplaceableGroup(r5)
            java.lang.String r5 = "CC(remember)P(1,2):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r13, r5)
            r11 = r18
            boolean r5 = r13.changed((java.lang.Object) r11)
            boolean r0 = r13.changed((java.lang.Object) r0)
            r0 = r0 | r5
            java.lang.Object r5 = r13.rememberedValue()
            if (r0 != 0) goto L_0x0433
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r0 = r0.getEmpty()
            if (r5 != r0) goto L_0x043f
        L_0x0433:
            androidx.compose.material3.MappedInteractionSource r5 = new androidx.compose.material3.MappedInteractionSource
            r7 = r11
            androidx.compose.foundation.interaction.InteractionSource r7 = (androidx.compose.foundation.interaction.InteractionSource) r7
            r0 = 0
            r5.<init>(r7, r3, r0)
            r13.updateRememberedValue(r5)
        L_0x043f:
            r13.endReplaceableGroup()
            androidx.compose.material3.MappedInteractionSource r5 = (androidx.compose.material3.MappedInteractionSource) r5
            androidx.compose.material3.NavigationBarKt$NavigationBarItem$3$indicatorRipple$1 r0 = new androidx.compose.material3.NavigationBarKt$NavigationBarItem$3$indicatorRipple$1
            r0.<init>(r5)
            r3 = 691730997(0x293afa35, float:4.1517317E-14)
            r4 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r13, r3, r4, r0)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            androidx.compose.material3.NavigationBarKt$NavigationBarItem$3$indicator$1 r3 = new androidx.compose.material3.NavigationBarKt$NavigationBarItem$3$indicator$1
            r9 = r19
            r3.<init>(r9, r2)
            r5 = -474426875(0xffffffffe3b8d205, float:-6.818669E21)
            androidx.compose.runtime.internal.ComposableLambda r3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r13, r5, r4, r3)
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
            float r7 = NavigationBarItem$lambda$9$lambda$6(r2)
            int r2 = r17 >> 9
            r2 = r2 & r33
            r8 = r2 | 438(0x1b6, float:6.14E-43)
            r2 = r0
            r4 = r12
            r5 = r20
            r6 = r16
            r0 = r8
            r8 = r13
            r12 = r9
            r9 = r0
            NavigationBarItemBaselineLayout(r2, r3, r4, r5, r6, r7, r8, r9)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r13)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r13)
            r13.endReplaceableGroup()
            r13.endNode()
            r13.endReplaceableGroup()
            r13.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0495
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0495:
            r6 = r40
            r5 = r1
            r9 = r12
            r7 = r15
            r8 = r16
        L_0x049c:
            androidx.compose.runtime.ScopeUpdateScope r13 = r13.endRestartGroup()
            if (r13 != 0) goto L_0x04a3
            goto L_0x04bb
        L_0x04a3:
            androidx.compose.material3.NavigationBarKt$NavigationBarItem$4 r15 = new androidx.compose.material3.NavigationBarKt$NavigationBarItem$4
            r0 = r15
            r1 = r36
            r2 = r37
            r3 = r38
            r4 = r39
            r10 = r11
            r11 = r47
            r12 = r48
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            kotlin.jvm.functions.Function2 r15 = (kotlin.jvm.functions.Function2) r15
            r13.updateScope(r15)
        L_0x04bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationBarKt.NavigationBarItem(androidx.compose.foundation.layout.RowScope, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function2, boolean, androidx.compose.material3.NavigationBarItemColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final int NavigationBarItem$lambda$3(MutableState<Integer> mutableState) {
        return ((Number) mutableState.getValue()).intValue();
    }

    /* access modifiers changed from: private */
    public static final void NavigationBarItem$lambda$4(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* access modifiers changed from: private */
    public static final void NavigationBarItemBaselineLayout(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, boolean z, float f, Composer composer, int i) {
        int i2;
        Function2<? super Composer, ? super Integer, Unit> function25 = function2;
        Function2<? super Composer, ? super Integer, Unit> function26 = function22;
        Function2<? super Composer, ? super Integer, Unit> function27 = function23;
        Function2<? super Composer, ? super Integer, Unit> function28 = function24;
        boolean z2 = z;
        float f2 = f;
        int i3 = i;
        Composer startRestartGroup = composer.startRestartGroup(591111291);
        ComposerKt.sourceInformation(startRestartGroup, "C(NavigationBarItemBaselineLayout)P(4,3,2,5)434@18867L2465:NavigationBar.kt#uh7d8r");
        if ((i3 & 14) == 0) {
            i2 = (startRestartGroup.changedInstance(function25) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i3 & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(function26) ? 32 : 16;
        }
        if ((i3 & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(function27) ? 256 : 128;
        }
        if ((i3 & 7168) == 0) {
            i2 |= startRestartGroup.changedInstance(function28) ? 2048 : 1024;
        }
        if ((57344 & i3) == 0) {
            i2 |= startRestartGroup.changed(z2) ? 16384 : 8192;
        }
        if ((458752 & i3) == 0) {
            i2 |= startRestartGroup.changed(f2) ? 131072 : 65536;
        }
        if ((374491 & i2) != 74898 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(591111291, i2, -1, "androidx.compose.material3.NavigationBarItemBaselineLayout (NavigationBar.kt:426)");
            }
            MeasurePolicy navigationBarKt$NavigationBarItemBaselineLayout$2 = new NavigationBarKt$NavigationBarItemBaselineLayout$2(f2, function28, z2);
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
            Composer r14 = Updater.m2444constructorimpl(startRestartGroup);
            Updater.m2451setimpl(r14, navigationBarKt$NavigationBarItemBaselineLayout$2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2451setimpl(r14, density, ComposeUiNode.Companion.getSetDensity());
            Updater.m2451setimpl(r14, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2451setimpl(r14, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
            materializerOf.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -311734425, "C435@18884L17,440@18982L50:NavigationBar.kt#uh7d8r");
            function25.invoke(startRestartGroup, Integer.valueOf(i2 & 14));
            startRestartGroup.startReplaceableGroup(-311734399);
            ComposerKt.sourceInformation(startRestartGroup, "437@18951L11");
            if (f2 > 0.0f) {
                function26.invoke(startRestartGroup, Integer.valueOf((i2 >> 3) & 14));
            }
            startRestartGroup.endReplaceableGroup();
            Modifier layoutId = LayoutIdKt.layoutId(Modifier.Companion, IconLayoutIdTag);
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
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(layoutId);
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
            Composer r6 = Updater.m2444constructorimpl(startRestartGroup);
            Updater.m2451setimpl(r6, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2451setimpl(r6, density2, ComposeUiNode.Companion.getSetDensity());
            Updater.m2451setimpl(r6, layoutDirection2, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2451setimpl(r6, viewConfiguration2, ComposeUiNode.Companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf2.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
            BoxScope boxScope = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1248851348, "C440@19024L6:NavigationBar.kt#uh7d8r");
            function27.invoke(startRestartGroup, Integer.valueOf((i2 >> 6) & 14));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(1204551908);
            ComposerKt.sourceInformation(startRestartGroup, "443@19075L260");
            if (function28 != null) {
                Modifier r62 = PaddingKt.m495paddingVpY3zN4$default(AlphaKt.alpha(LayoutIdKt.layoutId(Modifier.Companion, LabelLayoutIdTag), z2 ? 1.0f : f), Dp.m5626constructorimpl(NavigationBarItemHorizontalPadding / ((float) 2)), 0.0f, 2, (Object) null);
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
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(r62);
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
                Composer r12 = Updater.m2444constructorimpl(startRestartGroup);
                Updater.m2451setimpl(r12, rememberBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2451setimpl(r12, density3, ComposeUiNode.Companion.getSetDensity());
                Updater.m2451setimpl(r12, layoutDirection3, ComposeUiNode.Companion.getSetLayoutDirection());
                Updater.m2451setimpl(r12, viewConfiguration3, ComposeUiNode.Companion.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf3.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
                BoxScope boxScope2 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1248851650, "C448@19326L7:NavigationBar.kt#uh7d8r");
                function28.invoke(startRestartGroup, Integer.valueOf((i2 >> 9) & 14));
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
            endRestartGroup.updateScope(new NavigationBarKt$NavigationBarItemBaselineLayout$3(function2, function22, function23, function24, z, f, i));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: placeIcon-X9ElhV4  reason: not valid java name */
    public static final MeasureResult m1448placeIconX9ElhV4(MeasureScope measureScope, Placeable placeable, Placeable placeable2, Placeable placeable3, long j) {
        int r10 = Constraints.m5570getMaxWidthimpl(j);
        int r11 = Constraints.m5569getMaxHeightimpl(j);
        return MeasureScope.layout$default(measureScope, r10, r11, (Map) null, new NavigationBarKt$placeIcon$1(placeable3, placeable, (r10 - placeable.getWidth()) / 2, (r11 - placeable.getHeight()) / 2, placeable2, (r10 - placeable2.getWidth()) / 2, (r11 - placeable2.getHeight()) / 2, r10, r11), 4, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: placeLabelAndIcon-zUg2_y0  reason: not valid java name */
    public static final MeasureResult m1449placeLabelAndIconzUg2_y0(MeasureScope measureScope, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, long j, boolean z, float f) {
        int i;
        MeasureScope measureScope2 = measureScope;
        int r16 = Constraints.m5569getMaxHeightimpl(j);
        float f2 = NavigationBarItemVerticalPadding;
        int height = (r16 - placeable.getHeight()) - measureScope2.m5601roundToPx0680j_4(f2);
        int r10 = measureScope2.m5601roundToPx0680j_4(f2);
        if (z) {
            i = r10;
        } else {
            i = (r16 - placeable2.getHeight()) / 2;
        }
        int roundToInt = MathKt.roundToInt(((float) (i - r10)) * (((float) 1) - f));
        int r17 = Constraints.m5570getMaxWidthimpl(j);
        return MeasureScope.layout$default(measureScope, r17, r16, (Map) null, new NavigationBarKt$placeLabelAndIcon$1(placeable4, z, f, placeable, (r17 - placeable.getWidth()) / 2, height, roundToInt, placeable2, (r17 - placeable2.getWidth()) / 2, r10, placeable3, (r17 - placeable3.getWidth()) / 2, r10 - measureScope2.m5601roundToPx0680j_4(IndicatorVerticalPadding), r17, measureScope), 4, (Object) null);
    }

    static {
        float f = (float) 2;
        IndicatorHorizontalPadding = Dp.m5626constructorimpl(Dp.m5626constructorimpl(NavigationBarTokens.INSTANCE.m2145getActiveIndicatorWidthD9Ej5fM() - NavigationBarTokens.INSTANCE.m2148getIconSizeD9Ej5fM()) / f);
        IndicatorVerticalPadding = Dp.m5626constructorimpl(Dp.m5626constructorimpl(NavigationBarTokens.INSTANCE.m2144getActiveIndicatorHeightD9Ej5fM() - NavigationBarTokens.INSTANCE.m2148getIconSizeD9Ej5fM()) / f);
    }

    /* access modifiers changed from: private */
    public static final float NavigationBarItem$lambda$9$lambda$6(State<Float> state) {
        return state.getValue().floatValue();
    }
}
