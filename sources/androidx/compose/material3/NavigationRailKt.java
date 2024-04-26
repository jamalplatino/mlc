package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.material3.tokens.NavigationRailTokens;
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
import androidx.compose.ui.unit.ConstraintsKt;
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

@Metadata(d1 = {"\u0000\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a}\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2 \b\u0002\u0010\u001d\u001a\u001a\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001e¢\u0006\u0002\b ¢\u0006\u0002\b!2\b\b\u0002\u0010\"\u001a\u00020#2\u001c\u0010$\u001a\u0018\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00170\u001e¢\u0006\u0002\b ¢\u0006\u0002\b!H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001a\u0010'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020)2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00170+2\u0011\u0010,\u001a\r\u0012\u0004\u0012\u00020\u00170+¢\u0006\u0002\b 2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010-\u001a\u00020)2\u0015\b\u0002\u0010.\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u00010+¢\u0006\u0002\b 2\b\b\u0002\u0010/\u001a\u00020)2\b\b\u0002\u00100\u001a\u0002012\b\b\u0002\u00102\u001a\u000203H\u0007¢\u0006\u0002\u00104\u001ak\u00105\u001a\u00020\u00172\u0011\u00106\u001a\r\u0012\u0004\u0012\u00020\u00170+¢\u0006\u0002\b 2\u0011\u00107\u001a\r\u0012\u0004\u0012\u00020\u00170+¢\u0006\u0002\b 2\u0011\u0010,\u001a\r\u0012\u0004\u0012\u00020\u00170+¢\u0006\u0002\b 2\u0013\u0010.\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u00010+¢\u0006\u0002\b 2\u0006\u0010/\u001a\u00020)2\u0006\u00108\u001a\u000209H\u0003¢\u0006\u0002\u0010:\u001a;\u0010;\u001a\u00020<*\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020?2\b\u0010A\u001a\u0004\u0018\u00010?2\u0006\u0010B\u001a\u00020CH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bD\u0010E\u001aS\u0010F\u001a\u00020<*\u00020=2\u0006\u0010G\u001a\u00020?2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020?2\b\u0010A\u001a\u0004\u0018\u00010?2\u0006\u0010B\u001a\u00020C2\u0006\u0010/\u001a\u00020)2\u0006\u00108\u001a\u000209H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bH\u0010I\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u0013\u0010\u0002\u001a\u00020\u0003X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u000e\u0010\u0005\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u0013\u0010\u0007\u001a\u00020\u0003X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\b\u001a\u00020\u0003X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u0013\u0010\f\u001a\u00020\u0003X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0019\u0010\r\u001a\u00020\u0003X\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u000e\u0010\u000f\"\u0019\u0010\u0010\u001a\u00020\u0003X\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0011\u0010\u000f\"\u0019\u0010\u0012\u001a\u00020\u0003X\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0013\u0010\u000f\"\u0019\u0010\u0014\u001a\u00020\u0003X\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0015\u0010\u000f\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006J"}, d2 = {"IconLayoutIdTag", "", "IndicatorHorizontalPadding", "Landroidx/compose/ui/unit/Dp;", "F", "IndicatorLayoutIdTag", "IndicatorRippleLayoutIdTag", "IndicatorVerticalPaddingNoLabel", "IndicatorVerticalPaddingWithLabel", "ItemAnimationDurationMillis", "", "LabelLayoutIdTag", "NavigationRailHeaderPadding", "NavigationRailItemHeight", "getNavigationRailItemHeight", "()F", "NavigationRailItemVerticalPadding", "getNavigationRailItemVerticalPadding", "NavigationRailItemWidth", "getNavigationRailItemWidth", "NavigationRailVerticalPadding", "getNavigationRailVerticalPadding", "NavigationRail", "", "modifier", "Landroidx/compose/ui/Modifier;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "header", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "content", "NavigationRail-qi6gXK8", "(Landroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "NavigationRailItem", "selected", "", "onClick", "Lkotlin/Function0;", "icon", "enabled", "label", "alwaysShowLabel", "colors", "Landroidx/compose/material3/NavigationRailItemColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/NavigationRailItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "NavigationRailItemBaselineLayout", "indicatorRipple", "indicator", "animationProgress", "", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLandroidx/compose/runtime/Composer;I)V", "placeIcon", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "iconPlaceable", "Landroidx/compose/ui/layout/Placeable;", "indicatorRipplePlaceable", "indicatorPlaceable", "constraints", "Landroidx/compose/ui/unit/Constraints;", "placeIcon-X9ElhV4", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;", "placeLabelAndIcon", "labelPlaceable", "placeLabelAndIcon-zUg2_y0", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JZF)Landroidx/compose/ui/layout/MeasureResult;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: NavigationRail.kt */
public final class NavigationRailKt {
    private static final String IconLayoutIdTag = "icon";
    /* access modifiers changed from: private */
    public static final float IndicatorHorizontalPadding;
    private static final String IndicatorLayoutIdTag = "indicator";
    private static final String IndicatorRippleLayoutIdTag = "indicatorRipple";
    /* access modifiers changed from: private */
    public static final float IndicatorVerticalPaddingNoLabel;
    /* access modifiers changed from: private */
    public static final float IndicatorVerticalPaddingWithLabel;
    private static final int ItemAnimationDurationMillis = 150;
    private static final String LabelLayoutIdTag = "label";
    /* access modifiers changed from: private */
    public static final float NavigationRailHeaderPadding = Dp.m5626constructorimpl((float) 8);
    private static final float NavigationRailItemHeight = NavigationRailTokens.INSTANCE.m2161getNoLabelActiveIndicatorHeightD9Ej5fM();
    private static final float NavigationRailItemVerticalPadding;
    private static final float NavigationRailItemWidth = NavigationRailTokens.INSTANCE.m2158getContainerWidthD9Ej5fM();
    private static final float NavigationRailVerticalPadding;

    public static final float getNavigationRailItemHeight() {
        return NavigationRailItemHeight;
    }

    public static final float getNavigationRailItemVerticalPadding() {
        return NavigationRailItemVerticalPadding;
    }

    public static final float getNavigationRailItemWidth() {
        return NavigationRailItemWidth;
    }

    public static final float getNavigationRailVerticalPadding() {
        return NavigationRailVerticalPadding;
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d3  */
    /* renamed from: NavigationRail-qi6gXK8  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1466NavigationRailqi6gXK8(androidx.compose.ui.Modifier r25, long r26, long r28, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r30, androidx.compose.foundation.layout.WindowInsets r31, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r32, androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            r8 = r32
            r9 = r34
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 118552648(0x710f848, float:1.0906319E-34)
            r1 = r33
            androidx.compose.runtime.Composer r1 = r1.startRestartGroup(r0)
            java.lang.String r2 = "C(NavigationRail)P(4,0:c#ui.graphics.Color,2:c#ui.graphics.Color,3,5)102@4774L14,103@4816L31,105@4963L12,108@5033L748:NavigationRail.kt#uh7d8r"
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
            boolean r13 = r1.changedInstance(r12)
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
            r13 = r13 & r9
            if (r13 != 0) goto L_0x00a1
            r13 = r35 & 16
            if (r13 != 0) goto L_0x009b
            r13 = r31
            boolean r14 = r1.changed((java.lang.Object) r13)
            if (r14 == 0) goto L_0x009d
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009f
        L_0x009b:
            r13 = r31
        L_0x009d:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x009f:
            r4 = r4 | r14
            goto L_0x00a3
        L_0x00a1:
            r13 = r31
        L_0x00a3:
            r14 = r35 & 32
            if (r14 == 0) goto L_0x00ab
            r14 = 196608(0x30000, float:2.75506E-40)
        L_0x00a9:
            r4 = r4 | r14
            goto L_0x00bc
        L_0x00ab:
            r14 = 458752(0x70000, float:6.42848E-40)
            r14 = r14 & r9
            if (r14 != 0) goto L_0x00bc
            boolean r14 = r1.changedInstance(r8)
            if (r14 == 0) goto L_0x00b9
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a9
        L_0x00b9:
            r14 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00a9
        L_0x00bc:
            r14 = 374491(0x5b6db, float:5.24774E-40)
            r14 = r14 & r4
            r15 = 74898(0x12492, float:1.04954E-40)
            if (r14 != r15) goto L_0x00d3
            boolean r14 = r1.getSkipping()
            if (r14 != 0) goto L_0x00cc
            goto L_0x00d3
        L_0x00cc:
            r1.skipToGroupEnd()
            r2 = r3
            r7 = r12
            goto L_0x0183
        L_0x00d3:
            r1.startDefaults()
            r14 = r9 & 1
            r15 = -57345(0xffffffffffff1fff, float:NaN)
            if (r14 == 0) goto L_0x0101
            boolean r14 = r1.getDefaultsInvalid()
            if (r14 == 0) goto L_0x00e4
            goto L_0x0101
        L_0x00e4:
            r1.skipToGroupEnd()
            r2 = r35 & 2
            if (r2 == 0) goto L_0x00ed
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00ed:
            r2 = r35 & 4
            if (r2 == 0) goto L_0x00f3
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00f3:
            r2 = r35 & 16
            if (r2 == 0) goto L_0x00f8
            r4 = r4 & r15
        L_0x00f8:
            r2 = r3
        L_0x00f9:
            r7 = r12
            r14 = r13
        L_0x00fb:
            r23 = r10
            r10 = r4
            r3 = r23
            goto L_0x0137
        L_0x0101:
            if (r2 == 0) goto L_0x0108
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r2 = (androidx.compose.ui.Modifier) r2
            goto L_0x0109
        L_0x0108:
            r2 = r3
        L_0x0109:
            r3 = r35 & 2
            r14 = 6
            if (r3 == 0) goto L_0x0116
            androidx.compose.material3.NavigationRailDefaults r3 = androidx.compose.material3.NavigationRailDefaults.INSTANCE
            long r5 = r3.getContainerColor(r1, r14)
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0116:
            r3 = r35 & 4
            if (r3 == 0) goto L_0x0125
            int r3 = r4 >> 3
            r3 = r3 & 14
            long r10 = androidx.compose.material3.ColorSchemeKt.m1242contentColorForek8zF_U(r5, r1, r3)
            r3 = r4 & -897(0xfffffffffffffc7f, float:NaN)
            r4 = r3
        L_0x0125:
            if (r7 == 0) goto L_0x0129
            r3 = 0
            r12 = r3
        L_0x0129:
            r3 = r35 & 16
            if (r3 == 0) goto L_0x00f9
            androidx.compose.material3.NavigationRailDefaults r3 = androidx.compose.material3.NavigationRailDefaults.INSTANCE
            androidx.compose.foundation.layout.WindowInsets r3 = r3.getWindowInsets(r1, r14)
            r4 = r4 & r15
            r14 = r3
            r7 = r12
            goto L_0x00fb
        L_0x0137:
            r1.endDefaults()
            boolean r11 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r11 == 0) goto L_0x0147
            r11 = -1
            java.lang.String r12 = "androidx.compose.material3.NavigationRail (NavigationRail.kt:100)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r10, r11, r12)
        L_0x0147:
            r11 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            androidx.compose.material3.NavigationRailKt$NavigationRail$1 r0 = new androidx.compose.material3.NavigationRailKt$NavigationRail$1
            r0.<init>(r14, r7, r10, r8)
            r12 = -2092683357(0xffffffff83442fa3, float:-5.7653907E-37)
            r13 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r1, r12, r13, r0)
            r19 = r0
            kotlin.jvm.functions.Function2 r19 = (kotlin.jvm.functions.Function2) r19
            r0 = r10 & 14
            r12 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r0 | r12
            int r10 = r10 << 3
            r12 = r10 & 896(0x380, float:1.256E-42)
            r0 = r0 | r12
            r10 = r10 & 7168(0x1c00, float:1.0045E-41)
            r21 = r0 | r10
            r22 = 114(0x72, float:1.6E-43)
            r10 = r2
            r12 = r5
            r0 = r14
            r14 = r3
            r20 = r1
            androidx.compose.material3.SurfaceKt.m1641SurfaceT9BRK9s(r10, r11, r12, r14, r16, r17, r18, r19, r20, r21, r22)
            boolean r10 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r10 == 0) goto L_0x0181
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0181:
            r13 = r0
            r10 = r3
        L_0x0183:
            androidx.compose.runtime.ScopeUpdateScope r12 = r1.endRestartGroup()
            if (r12 != 0) goto L_0x018a
            goto L_0x01a0
        L_0x018a:
            androidx.compose.material3.NavigationRailKt$NavigationRail$2 r14 = new androidx.compose.material3.NavigationRailKt$NavigationRail$2
            r0 = r14
            r1 = r2
            r2 = r5
            r4 = r10
            r6 = r7
            r7 = r13
            r8 = r32
            r9 = r34
            r10 = r35
            r0.<init>(r1, r2, r4, r6, r7, r8, r9, r10)
            kotlin.jvm.functions.Function2 r14 = (kotlin.jvm.functions.Function2) r14
            r12.updateScope(r14)
        L_0x01a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationRailKt.m1466NavigationRailqi6gXK8(androidx.compose.ui.Modifier, long, long, kotlin.jvm.functions.Function3, androidx.compose.foundation.layout.WindowInsets, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x045f  */
    /* JADX WARNING: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0109  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void NavigationRailItem(boolean r32, kotlin.jvm.functions.Function0<kotlin.Unit> r33, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r34, androidx.compose.ui.Modifier r35, boolean r36, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r37, boolean r38, androidx.compose.material3.NavigationRailItemColors r39, androidx.compose.foundation.interaction.MutableInteractionSource r40, androidx.compose.runtime.Composer r41, int r42, int r43) {
        /*
            r8 = r32
            r9 = r33
            r10 = r34
            r11 = r42
            r12 = r43
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "icon"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = -1533971045(0xffffffffa491759b, float:-6.308296E-17)
            r1 = r41
            androidx.compose.runtime.Composer r7 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(NavigationRailItem)P(8,7,3,6,2,5)168@7563L8,169@7623L39,190@8581L2637:NavigationRail.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r7, r1)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x002b
            r1 = r11 | 6
            goto L_0x003b
        L_0x002b:
            r1 = r11 & 14
            if (r1 != 0) goto L_0x003a
            boolean r1 = r7.changed((boolean) r8)
            if (r1 == 0) goto L_0x0037
            r1 = 4
            goto L_0x0038
        L_0x0037:
            r1 = 2
        L_0x0038:
            r1 = r1 | r11
            goto L_0x003b
        L_0x003a:
            r1 = r11
        L_0x003b:
            r2 = r12 & 2
            if (r2 == 0) goto L_0x0042
            r1 = r1 | 48
            goto L_0x0052
        L_0x0042:
            r2 = r11 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0052
            boolean r2 = r7.changedInstance(r9)
            if (r2 == 0) goto L_0x004f
            r2 = 32
            goto L_0x0051
        L_0x004f:
            r2 = 16
        L_0x0051:
            r1 = r1 | r2
        L_0x0052:
            r2 = r12 & 4
            if (r2 == 0) goto L_0x0059
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0069
        L_0x0059:
            r2 = r11 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x0069
            boolean r2 = r7.changedInstance(r10)
            if (r2 == 0) goto L_0x0066
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0068
        L_0x0066:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0068:
            r1 = r1 | r2
        L_0x0069:
            r2 = r12 & 8
            if (r2 == 0) goto L_0x0070
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0083
        L_0x0070:
            r3 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r3 != 0) goto L_0x0083
            r3 = r35
            boolean r4 = r7.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x007f
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007f:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r1 = r1 | r4
            goto L_0x0085
        L_0x0083:
            r3 = r35
        L_0x0085:
            r4 = r12 & 16
            r31 = 57344(0xe000, float:8.0356E-41)
            if (r4 == 0) goto L_0x008f
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a2
        L_0x008f:
            r5 = r11 & r31
            if (r5 != 0) goto L_0x00a2
            r5 = r36
            boolean r13 = r7.changed((boolean) r5)
            if (r13 == 0) goto L_0x009e
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a0
        L_0x009e:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x00a0:
            r1 = r1 | r13
            goto L_0x00a4
        L_0x00a2:
            r5 = r36
        L_0x00a4:
            r13 = r12 & 32
            if (r13 == 0) goto L_0x00ac
            r14 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r14
            goto L_0x00c0
        L_0x00ac:
            r14 = 458752(0x70000, float:6.42848E-40)
            r14 = r14 & r11
            if (r14 != 0) goto L_0x00c0
            r14 = r37
            boolean r15 = r7.changedInstance(r14)
            if (r15 == 0) goto L_0x00bc
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00be
        L_0x00bc:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00be:
            r1 = r1 | r15
            goto L_0x00c2
        L_0x00c0:
            r14 = r37
        L_0x00c2:
            r15 = r12 & 64
            if (r15 == 0) goto L_0x00cd
            r16 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r16
            r6 = r38
            goto L_0x00e2
        L_0x00cd:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r11 & r16
            r6 = r38
            if (r16 != 0) goto L_0x00e2
            boolean r16 = r7.changed((boolean) r6)
            if (r16 == 0) goto L_0x00de
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e0
        L_0x00de:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00e0:
            r1 = r1 | r16
        L_0x00e2:
            r16 = 29360128(0x1c00000, float:7.052966E-38)
            r16 = r11 & r16
            if (r16 != 0) goto L_0x00fe
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x00f7
            r0 = r39
            boolean r16 = r7.changed((java.lang.Object) r0)
            if (r16 == 0) goto L_0x00f9
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fb
        L_0x00f7:
            r0 = r39
        L_0x00f9:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fb:
            r1 = r1 | r16
            goto L_0x0100
        L_0x00fe:
            r0 = r39
        L_0x0100:
            r14 = r12 & 256(0x100, float:3.59E-43)
            if (r14 == 0) goto L_0x0109
            r16 = 100663296(0x6000000, float:2.4074124E-35)
            r1 = r1 | r16
            goto L_0x0121
        L_0x0109:
            r16 = 234881024(0xe000000, float:1.5777218E-30)
            r16 = r11 & r16
            if (r16 != 0) goto L_0x0121
            r16 = r14
            r14 = r40
            boolean r17 = r7.changed((java.lang.Object) r14)
            if (r17 == 0) goto L_0x011c
            r17 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011e
        L_0x011c:
            r17 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011e:
            r1 = r1 | r17
            goto L_0x0125
        L_0x0121:
            r16 = r14
            r14 = r40
        L_0x0125:
            r17 = 191739611(0xb6db6db, float:4.5782105E-32)
            r0 = r1 & r17
            r3 = 38347922(0x2492492, float:1.4777643E-37)
            if (r0 != r3) goto L_0x0143
            boolean r0 = r7.getSkipping()
            if (r0 != 0) goto L_0x0136
            goto L_0x0143
        L_0x0136:
            r7.skipToGroupEnd()
            r4 = r35
            r9 = r39
            r10 = r7
            r7 = r6
            r6 = r37
            goto L_0x0458
        L_0x0143:
            r7.startDefaults()
            r0 = r11 & 1
            r3 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r14 = 1
            if (r0 == 0) goto L_0x016c
            boolean r0 = r7.getDefaultsInvalid()
            if (r0 == 0) goto L_0x0155
            goto L_0x016c
        L_0x0155:
            r7.skipToGroupEnd()
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x015d
            r1 = r1 & r3
        L_0x015d:
            r21 = r35
            r23 = r37
            r15 = r39
            r14 = r40
            r13 = r1
            r22 = r5
            r24 = r6
            goto L_0x01de
        L_0x016c:
            if (r2 == 0) goto L_0x0173
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            goto L_0x0175
        L_0x0173:
            r0 = r35
        L_0x0175:
            if (r4 == 0) goto L_0x0178
            r5 = r14
        L_0x0178:
            if (r13 == 0) goto L_0x017c
            r2 = 0
            goto L_0x017e
        L_0x017c:
            r2 = r37
        L_0x017e:
            if (r15 == 0) goto L_0x0181
            r6 = r14
        L_0x0181:
            r4 = r12 & 128(0x80, float:1.794E-43)
            if (r4 == 0) goto L_0x01a3
            androidx.compose.material3.NavigationRailItemDefaults r13 = androidx.compose.material3.NavigationRailItemDefaults.INSTANCE
            r18 = 0
            r4 = r16
            r14 = r18
            r16 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r29 = 12582912(0xc00000, float:1.7632415E-38)
            r30 = 127(0x7f, float:1.78E-43)
            r28 = r7
            androidx.compose.material3.NavigationRailItemColors r13 = r13.m1464colors69fazGs(r14, r16, r18, r20, r22, r24, r26, r28, r29, r30)
            r1 = r1 & r3
            goto L_0x01a7
        L_0x01a3:
            r4 = r16
            r13 = r39
        L_0x01a7:
            if (r4 == 0) goto L_0x01d2
            r3 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r7.startReplaceableGroup(r3)
            java.lang.String r3 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r7, r3)
            java.lang.Object r3 = r7.rememberedValue()
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r4 = r4.getEmpty()
            if (r3 != r4) goto L_0x01c7
            androidx.compose.foundation.interaction.MutableInteractionSource r3 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r7.updateRememberedValue(r3)
        L_0x01c7:
            r7.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r3 = (androidx.compose.foundation.interaction.MutableInteractionSource) r3
            r21 = r0
            r23 = r2
            r14 = r3
            goto L_0x01d8
        L_0x01d2:
            r14 = r40
            r21 = r0
            r23 = r2
        L_0x01d8:
            r22 = r5
            r24 = r6
            r15 = r13
            r13 = r1
        L_0x01de:
            r7.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01f1
            r0 = -1
            java.lang.String r1 = "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)"
            r2 = -1533971045(0xffffffffa491759b, float:-6.308296E-17)
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r13, r0, r1)
        L_0x01f1:
            androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1 r6 = new androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1
            r0 = r6
            r1 = r15
            r2 = r32
            r3 = r22
            r4 = r13
            r5 = r23
            r9 = r6
            r10 = 2
            r6 = r24
            r10 = r7
            r7 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = -1023357515(0xffffffffc300cdb5, float:-128.80354)
            r1 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r10, r0, r1, r9)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            if (r23 == 0) goto L_0x022d
            androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1 r2 = new androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1
            r35 = r2
            r36 = r15
            r37 = r32
            r38 = r22
            r39 = r13
            r40 = r23
            r35.<init>(r36, r37, r38, r39, r40)
            r3 = -105269599(0xfffffffff9b9b6a1, float:-1.2053488E35)
            androidx.compose.runtime.internal.ComposableLambda r2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r10, r3, r1, r2)
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            goto L_0x022e
        L_0x022d:
            r2 = 0
        L_0x022e:
            androidx.compose.ui.semantics.Role$Companion r3 = androidx.compose.ui.semantics.Role.Companion
            int r3 = r3.m4976getTabo7Vup1c()
            r4 = 0
            androidx.compose.ui.semantics.Role r3 = androidx.compose.ui.semantics.Role.m4963boximpl(r3)
            r35 = r21
            r36 = r32
            r37 = r14
            r38 = r4
            r39 = r22
            r40 = r3
            r41 = r33
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.selection.SelectableKt.m812selectableO2vRcR0(r35, r36, r37, r38, r39, r40, r41)
            float r4 = NavigationRailItemHeight
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.SizeKt.m549height3ABfNKs(r3, r4)
            float r4 = NavigationRailItemWidth
            r5 = 0
            r6 = 2
            r7 = 0
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.SizeKt.m570widthInVpY3zN4$default(r3, r4, r5, r6, r7)
            androidx.compose.ui.Alignment$Companion r6 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment r6 = r6.getCenter()
            r9 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r10.startReplaceableGroup(r9)
            java.lang.String r9 = "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformation(r10, r9)
            r9 = 0
            r1 = 6
            androidx.compose.ui.layout.MeasurePolicy r6 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(r6, r9, r10, r1)
            r5 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r10.startReplaceableGroup(r5)
            java.lang.String r5 = "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh"
            androidx.compose.runtime.ComposerKt.sourceInformation(r10, r5)
            androidx.compose.runtime.ProvidableCompositionLocal r5 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r5 = (androidx.compose.runtime.CompositionLocal) r5
            r36 = r15
            r15 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r1 = "C:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r10, r15, r1)
            java.lang.Object r5 = r10.consume(r5)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r10)
            androidx.compose.ui.unit.Density r5 = (androidx.compose.ui.unit.Density) r5
            androidx.compose.runtime.ProvidableCompositionLocal r16 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            r7 = r16
            androidx.compose.runtime.CompositionLocal r7 = (androidx.compose.runtime.CompositionLocal) r7
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r10, r15, r1)
            java.lang.Object r7 = r10.consume(r7)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r10)
            androidx.compose.ui.unit.LayoutDirection r7 = (androidx.compose.ui.unit.LayoutDirection) r7
            androidx.compose.runtime.ProvidableCompositionLocal r16 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            r9 = r16
            androidx.compose.runtime.CompositionLocal r9 = (androidx.compose.runtime.CompositionLocal) r9
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r10, r15, r1)
            java.lang.Object r1 = r10.consume(r9)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r10)
            androidx.compose.ui.platform.ViewConfiguration r1 = (androidx.compose.ui.platform.ViewConfiguration) r1
            androidx.compose.ui.node.ComposeUiNode$Companion r9 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function0 r9 = r9.getConstructor()
            kotlin.jvm.functions.Function3 r3 = androidx.compose.ui.layout.LayoutKt.materializerOf(r3)
            androidx.compose.runtime.Applier r15 = r10.getApplier()
            boolean r15 = r15 instanceof androidx.compose.runtime.Applier
            if (r15 != 0) goto L_0x02d2
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x02d2:
            r10.startReusableNode()
            boolean r15 = r10.getInserting()
            if (r15 == 0) goto L_0x02df
            r10.createNode(r9)
            goto L_0x02e2
        L_0x02df:
            r10.useNode()
        L_0x02e2:
            r10.disableReusing()
            androidx.compose.runtime.Composer r9 = androidx.compose.runtime.Updater.m2444constructorimpl(r10)
            androidx.compose.ui.node.ComposeUiNode$Companion r15 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r15 = r15.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r9, r6, r15)
            androidx.compose.ui.node.ComposeUiNode$Companion r6 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r6 = r6.getSetDensity()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r9, r5, r6)
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r5 = r5.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r9, r7, r5)
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r5 = r5.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r9, r1, r5)
            r10.enableReusing()
            androidx.compose.runtime.Composer r1 = androidx.compose.runtime.SkippableUpdater.m2436constructorimpl(r10)
            androidx.compose.runtime.SkippableUpdater r1 = androidx.compose.runtime.SkippableUpdater.m2435boximpl(r1)
            r5 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r3.invoke(r1, r10, r6)
            r1 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r10.startReplaceableGroup(r1)
            r1 = -1253629305(0xffffffffb5472287, float:-7.418352E-7)
            java.lang.String r3 = "C72@3384L9:Box.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r10, r1, r3)
            androidx.compose.foundation.layout.BoxScopeInstance r1 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE
            androidx.compose.foundation.layout.BoxScope r1 = (androidx.compose.foundation.layout.BoxScope) r1
            r1 = 1104516053(0x41d593d5, float:26.697184)
            java.lang.String r3 = "C204@9072L145,*213@9501L7,218@9792L120,249@10925L287:NavigationRail.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r10, r1, r3)
            if (r8 == 0) goto L_0x033f
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0340
        L_0x033f:
            r1 = 0
        L_0x0340:
            r3 = 150(0x96, float:2.1E-43)
            r5 = 0
            r6 = 0
            r7 = 6
            androidx.compose.animation.core.TweenSpec r3 = androidx.compose.animation.core.AnimationSpecKt.tween$default(r3, r5, r6, r7, r6)
            androidx.compose.animation.core.AnimationSpec r3 = (androidx.compose.animation.core.AnimationSpec) r3
            r15 = 0
            r16 = 0
            r17 = 0
            r19 = 48
            r20 = 28
            r5 = r13
            r13 = r1
            r1 = r14
            r14 = r3
            r3 = r36
            r6 = 2023513938(0x789c5f52, float:2.5372864E34)
            r18 = r10
            androidx.compose.runtime.State r7 = androidx.compose.animation.core.AnimateAsStateKt.animateFloatAsState(r13, r14, r15, r16, r17, r18, r19, r20)
            androidx.compose.runtime.ProvidableCompositionLocal r9 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r9 = (androidx.compose.runtime.CompositionLocal) r9
            java.lang.String r13 = "CC:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r10, r6, r13)
            java.lang.Object r6 = r10.consume(r9)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r10)
            androidx.compose.ui.unit.Density r6 = (androidx.compose.ui.unit.Density) r6
            int r4 = r6.m5601roundToPx0680j_4(r4)
            androidx.compose.material3.tokens.NavigationRailTokens r9 = androidx.compose.material3.tokens.NavigationRailTokens.INSTANCE
            float r9 = r9.m2156getActiveIndicatorWidthD9Ej5fM()
            int r6 = r6.m5601roundToPx0680j_4(r9)
            int r4 = r4 - r6
            float r4 = (float) r4
            r6 = 2
            float r6 = (float) r6
            float r4 = r4 / r6
            r6 = 0
            long r13 = androidx.compose.ui.geometry.OffsetKt.Offset(r4, r6)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            androidx.compose.ui.geometry.Offset r4 = androidx.compose.ui.geometry.Offset.m2561boximpl(r13)
            r6 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r10.startReplaceableGroup(r6)
            java.lang.String r6 = "CC(remember)P(1,2):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r10, r6)
            boolean r6 = r10.changed((java.lang.Object) r1)
            boolean r4 = r10.changed((java.lang.Object) r4)
            r4 = r4 | r6
            java.lang.Object r6 = r10.rememberedValue()
            if (r4 != 0) goto L_0x03b7
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r4 = r4.getEmpty()
            if (r6 != r4) goto L_0x03c3
        L_0x03b7:
            androidx.compose.material3.MappedInteractionSource r6 = new androidx.compose.material3.MappedInteractionSource
            r4 = r1
            androidx.compose.foundation.interaction.InteractionSource r4 = (androidx.compose.foundation.interaction.InteractionSource) r4
            r9 = 0
            r6.<init>(r4, r13, r9)
            r10.updateRememberedValue(r6)
        L_0x03c3:
            r10.endReplaceableGroup()
            androidx.compose.material3.MappedInteractionSource r6 = (androidx.compose.material3.MappedInteractionSource) r6
            if (r23 == 0) goto L_0x03e4
            r4 = 1104516975(0x41d5976f, float:26.698942)
            r10.startReplaceableGroup(r4)
            java.lang.String r4 = "223@10018L9"
            androidx.compose.runtime.ComposerKt.sourceInformation(r10, r4)
            androidx.compose.material3.tokens.NavigationRailTokens r4 = androidx.compose.material3.tokens.NavigationRailTokens.INSTANCE
            androidx.compose.material3.tokens.ShapeKeyTokens r4 = r4.getActiveIndicatorShape()
            r9 = 6
            androidx.compose.ui.graphics.Shape r4 = androidx.compose.material3.ShapesKt.toShape(r4, r10, r9)
            r10.endReplaceableGroup()
            goto L_0x03fd
        L_0x03e4:
            r9 = 6
            r4 = 1104517056(0x41d597c0, float:26.699097)
            r10.startReplaceableGroup(r4)
            java.lang.String r4 = "225@10106L9"
            androidx.compose.runtime.ComposerKt.sourceInformation(r10, r4)
            androidx.compose.material3.tokens.NavigationRailTokens r4 = androidx.compose.material3.tokens.NavigationRailTokens.INSTANCE
            androidx.compose.material3.tokens.ShapeKeyTokens r4 = r4.getNoLabelActiveIndicatorShape()
            androidx.compose.ui.graphics.Shape r4 = androidx.compose.material3.ShapesKt.toShape(r4, r10, r9)
            r10.endReplaceableGroup()
        L_0x03fd:
            androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicatorRipple$1 r9 = new androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicatorRipple$1
            r9.<init>(r4, r6)
            r6 = 211026382(0xc9401ce, float:2.2804097E-31)
            r13 = 1
            androidx.compose.runtime.internal.ComposableLambda r6 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r10, r6, r13, r9)
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicator$1 r9 = new androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicator$1
            r9.<init>(r3, r5, r4, r7)
            r4 = -1862011490(0xffffffff9103f59e, float:-1.0409764E-28)
            androidx.compose.runtime.internal.ComposableLambda r4 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r10, r4, r13, r9)
            r14 = r4
            kotlin.jvm.functions.Function2 r14 = (kotlin.jvm.functions.Function2) r14
            float r18 = NavigationRailItem$lambda$5$lambda$2(r7)
            r4 = 6
            int r4 = r5 >> 6
            r4 = r4 & r31
            r4 = r4 | 438(0x1b6, float:6.14E-43)
            r13 = r6
            r15 = r0
            r16 = r2
            r17 = r24
            r19 = r10
            r20 = r4
            NavigationRailItemBaselineLayout(r13, r14, r15, r16, r17, r18, r19, r20)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r10)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r10)
            r10.endReplaceableGroup()
            r10.endNode()
            r10.endReplaceableGroup()
            r10.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x044e
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x044e:
            r14 = r1
            r9 = r3
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
        L_0x0458:
            androidx.compose.runtime.ScopeUpdateScope r13 = r10.endRestartGroup()
            if (r13 != 0) goto L_0x045f
            goto L_0x0476
        L_0x045f:
            androidx.compose.material3.NavigationRailKt$NavigationRailItem$3 r15 = new androidx.compose.material3.NavigationRailKt$NavigationRailItem$3
            r0 = r15
            r1 = r32
            r2 = r33
            r3 = r34
            r8 = r9
            r9 = r14
            r10 = r42
            r11 = r43
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            kotlin.jvm.functions.Function2 r15 = (kotlin.jvm.functions.Function2) r15
            r13.updateScope(r15)
        L_0x0476:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationRailKt.NavigationRailItem(boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function2, boolean, androidx.compose.material3.NavigationRailItemColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final void NavigationRailItemBaselineLayout(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, boolean z, float f, Composer composer, int i) {
        int i2;
        Function2<? super Composer, ? super Integer, Unit> function25 = function2;
        Function2<? super Composer, ? super Integer, Unit> function26 = function22;
        Function2<? super Composer, ? super Integer, Unit> function27 = function23;
        Function2<? super Composer, ? super Integer, Unit> function28 = function24;
        boolean z2 = z;
        float f2 = f;
        int i3 = i;
        Composer startRestartGroup = composer.startRestartGroup(-876426901);
        ComposerKt.sourceInformation(startRestartGroup, "C(NavigationRailItemBaselineLayout)P(4,3,2,5)434@18778L2562:NavigationRail.kt#uh7d8r");
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
                ComposerKt.traceEventStart(-876426901, i2, -1, "androidx.compose.material3.NavigationRailItemBaselineLayout (NavigationRail.kt:426)");
            }
            MeasurePolicy navigationRailKt$NavigationRailItemBaselineLayout$2 = new NavigationRailKt$NavigationRailItemBaselineLayout$2(f2, function28, z2);
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
            Updater.m2451setimpl(r13, navigationRailKt$NavigationRailItemBaselineLayout$2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2451setimpl(r13, density, ComposeUiNode.Companion.getSetDensity());
            Updater.m2451setimpl(r13, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2451setimpl(r13, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
            materializerOf.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 935757153, "C435@18795L17,440@18893L50:NavigationRail.kt#uh7d8r");
            function25.invoke(startRestartGroup, Integer.valueOf(i2 & 14));
            startRestartGroup.startReplaceableGroup(935757179);
            ComposerKt.sourceInformation(startRestartGroup, "437@18862L11");
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -601536754, "C440@18935L6:NavigationRail.kt#uh7d8r");
            function27.invoke(startRestartGroup, Integer.valueOf((i2 >> 6) & 14));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-853550242);
            ComposerKt.sourceInformation(startRestartGroup, "443@18986L178");
            if (function28 != null) {
                Modifier alpha = AlphaKt.alpha(LayoutIdKt.layoutId(Modifier.Companion, LabelLayoutIdTag), z2 ? 1.0f : f);
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
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(alpha);
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
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -601536534, "C447@19155L7:NavigationRail.kt#uh7d8r");
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
            endRestartGroup.updateScope(new NavigationRailKt$NavigationRailItemBaselineLayout$3(function2, function22, function23, function24, z, f, i));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: placeIcon-X9ElhV4  reason: not valid java name */
    public static final MeasureResult m1469placeIconX9ElhV4(MeasureScope measureScope, Placeable placeable, Placeable placeable2, Placeable placeable3, long j) {
        int r0 = ConstraintsKt.m5584constrainWidthK40F9xA(j, Math.max(placeable.getWidth(), Math.max(placeable2.getWidth(), placeable3 != null ? placeable3.getWidth() : 0)));
        int r12 = Constraints.m5569getMaxHeightimpl(j);
        return MeasureScope.layout$default(measureScope, r0, r12, (Map) null, new NavigationRailKt$placeIcon$1(placeable3, placeable, (r0 - placeable.getWidth()) / 2, (r12 - placeable.getHeight()) / 2, placeable2, (r0 - placeable2.getWidth()) / 2, (r12 - placeable2.getHeight()) / 2, r0, r12), 4, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: placeLabelAndIcon-zUg2_y0  reason: not valid java name */
    public static final MeasureResult m1470placeLabelAndIconzUg2_y0(MeasureScope measureScope, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, long j, boolean z, float f) {
        int i;
        MeasureScope measureScope2 = measureScope;
        int r16 = Constraints.m5569getMaxHeightimpl(j);
        float f2 = NavigationRailItemVerticalPadding;
        int height = (r16 - placeable.getHeight()) - measureScope2.m5601roundToPx0680j_4(f2);
        int r10 = measureScope2.m5601roundToPx0680j_4(f2);
        if (z) {
            i = r10;
        } else {
            i = (r16 - placeable2.getHeight()) / 2;
        }
        int roundToInt = MathKt.roundToInt(((float) (i - r10)) * (((float) 1) - f));
        int r17 = ConstraintsKt.m5584constrainWidthK40F9xA(j, Math.max(placeable2.getWidth(), Math.max(placeable.getWidth(), placeable4 != null ? placeable4.getWidth() : 0)));
        return MeasureScope.layout$default(measureScope, r17, r16, (Map) null, new NavigationRailKt$placeLabelAndIcon$1(placeable4, z, f, placeable, (r17 - placeable.getWidth()) / 2, height, roundToInt, placeable2, (r17 - placeable2.getWidth()) / 2, r10, placeable3, (r17 - placeable3.getWidth()) / 2, r10 - measureScope2.m5601roundToPx0680j_4(IndicatorVerticalPaddingWithLabel), r17, measureScope), 4, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final float NavigationRailItem$lambda$5$lambda$2(State<Float> state) {
        return state.getValue().floatValue();
    }

    static {
        float f = (float) 4;
        NavigationRailVerticalPadding = Dp.m5626constructorimpl(f);
        NavigationRailItemVerticalPadding = Dp.m5626constructorimpl(f);
        float f2 = (float) 2;
        IndicatorHorizontalPadding = Dp.m5626constructorimpl(Dp.m5626constructorimpl(NavigationRailTokens.INSTANCE.m2156getActiveIndicatorWidthD9Ej5fM() - NavigationRailTokens.INSTANCE.m2159getIconSizeD9Ej5fM()) / f2);
        IndicatorVerticalPaddingWithLabel = Dp.m5626constructorimpl(Dp.m5626constructorimpl(NavigationRailTokens.INSTANCE.m2155getActiveIndicatorHeightD9Ej5fM() - NavigationRailTokens.INSTANCE.m2159getIconSizeD9Ej5fM()) / f2);
        IndicatorVerticalPaddingNoLabel = Dp.m5626constructorimpl(Dp.m5626constructorimpl(NavigationRailTokens.INSTANCE.m2161getNoLabelActiveIndicatorHeightD9Ej5fM() - NavigationRailTokens.INSTANCE.m2159getIconSizeD9Ej5fM()) / f2);
    }
}
