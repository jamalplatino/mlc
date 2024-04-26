package androidx.compose.material3;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.PlainTooltipTokens;
import androidx.compose.material3.tokens.RichTooltipTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001ax\u0010\u001a\u001a\u00020\u001b2\u0011\u0010\u001c\u001a\r\u0012\u0004\u0012\u00020\u001b0\u001d¢\u0006\u0002\b\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020&2\u001c\u0010(\u001a\u0018\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u001b0)¢\u0006\u0002\b\u001e¢\u0006\u0002\b+H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001a0\u0010.\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020&2\u0011\u0010(\u001a\r\u0012\u0004\u0012\u00020\u001b0\u001d¢\u0006\u0002\b\u001eH\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001a\u0001\u00102\u001a\u00020\u001b2\u0011\u00103\u001a\r\u0012\u0004\u0012\u00020\u001b0\u001d¢\u0006\u0002\b\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u0002042\u0015\b\u0002\u00105\u001a\u000f\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001d¢\u0006\u0002\b\u001e2\u0015\b\u0002\u00106\u001a\u000f\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001d¢\u0006\u0002\b\u001e2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u00107\u001a\u0002082\u001c\u0010(\u001a\u0018\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u001b0)¢\u0006\u0002\b\u001e¢\u0006\u0002\b+H\u0007¢\u0006\u0002\u00109\u001aR\u0010:\u001a\u00020\u001b2\u0006\u00107\u001a\u0002082\u0011\u00103\u001a\r\u0012\u0004\u0012\u00020\u001b0\u001d¢\u0006\u0002\b\u001e2\u0013\u00105\u001a\u000f\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001d¢\u0006\u0002\b\u001e2\u0013\u00106\u001a\u000f\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001d¢\u0006\u0002\b\u001eH\u0003¢\u0006\u0002\u0010;\u001a~\u0010<\u001a\u00020\u001b2\u0011\u0010=\u001a\r\u0012\u0004\u0012\u00020\u001b0\u001d¢\u0006\u0002\b\u001e2\u0006\u0010>\u001a\u00020?2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010#\u001a\u00020$2\u0006\u0010!\u001a\u00020@2\u0006\u0010%\u001a\u00020&2\u0006\u0010A\u001a\u00020\u00012\u0006\u0010B\u001a\u00020\u00012\u001c\u0010(\u001a\u0018\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u001b0)¢\u0006\u0002\b\u001e¢\u0006\u0002\b+H\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bC\u0010D\u001a\u001a\u0010E\u001a\u00020 *\u00020 2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020H0GH\u0002\u001a\u001c\u0010I\u001a\u00020 *\u00020 2\u0006\u0010J\u001a\u00020H2\u0006\u0010K\u001a\u00020HH\u0002\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0005\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\b\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\t\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\n\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0019\u0010\u000b\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0002\u001a\u0004\b\f\u0010\r\"\u0013\u0010\u000e\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u000f\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0010\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0011\u001a\u00020\u0012XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0014XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0014XT¢\u0006\u0002\n\u0000\"\u0019\u0010\u0016\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0002\u001a\u0004\b\u0017\u0010\r\"\u0019\u0010\u0018\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0002\u001a\u0004\b\u0019\u0010\r\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006L"}, d2 = {"ActionLabelBottomPadding", "Landroidx/compose/ui/unit/Dp;", "F", "ActionLabelMinHeight", "HeightFromSubheadToTextFirstLine", "HeightToSubheadFirstLine", "PlainTooltipContentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "PlainTooltipHorizontalPadding", "PlainTooltipMaxWidth", "PlainTooltipVerticalPadding", "RichTooltipHorizontalPadding", "getRichTooltipHorizontalPadding", "()F", "RichTooltipMaxWidth", "TextBottomPadding", "TooltipAnchorPadding", "TooltipDuration", "", "TooltipFadeInDuration", "", "TooltipFadeOutDuration", "TooltipMinHeight", "getTooltipMinHeight", "TooltipMinWidth", "getTooltipMinWidth", "PlainTooltipBox", "", "tooltip", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "modifier", "Landroidx/compose/ui/Modifier;", "tooltipState", "Landroidx/compose/material3/PlainTooltipState;", "shape", "Landroidx/compose/ui/graphics/Shape;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "content", "Lkotlin/Function1;", "Landroidx/compose/material3/TooltipBoxScope;", "Lkotlin/ExtensionFunctionType;", "PlainTooltipBox-nBX6wN0", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/PlainTooltipState;Landroidx/compose/ui/graphics/Shape;JJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "PlainTooltipImpl", "textColor", "PlainTooltipImpl-Iv8Zu3U", "(JLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "RichTooltipBox", "text", "Landroidx/compose/material3/RichTooltipState;", "title", "action", "colors", "Landroidx/compose/material3/RichTooltipColors;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/RichTooltipState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/RichTooltipColors;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "RichTooltipImpl", "(Landroidx/compose/material3/RichTooltipColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "TooltipBox", "tooltipContent", "tooltipPositionProvider", "Landroidx/compose/ui/window/PopupPositionProvider;", "Landroidx/compose/material3/TooltipState;", "elevation", "maxWidth", "TooltipBox-XDn_Kpo", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/window/PopupPositionProvider;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TooltipState;JFFLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "animateTooltip", "transition", "Landroidx/compose/animation/core/Transition;", "", "textVerticalPadding", "subheadExists", "actionExists", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Tooltip.kt */
public final class TooltipKt {
    private static final float ActionLabelBottomPadding;
    private static final float ActionLabelMinHeight = Dp.m5626constructorimpl((float) 36);
    private static final float HeightFromSubheadToTextFirstLine;
    private static final float HeightToSubheadFirstLine = Dp.m5626constructorimpl((float) 28);
    private static final PaddingValues PlainTooltipContentPadding;
    private static final float PlainTooltipHorizontalPadding;
    private static final float PlainTooltipMaxWidth = Dp.m5626constructorimpl((float) 200);
    private static final float PlainTooltipVerticalPadding;
    private static final float RichTooltipHorizontalPadding;
    private static final float RichTooltipMaxWidth = Dp.m5626constructorimpl((float) 320);
    private static final float TextBottomPadding;
    private static final float TooltipAnchorPadding;
    public static final long TooltipDuration = 1500;
    public static final int TooltipFadeInDuration = 150;
    private static final int TooltipFadeOutDuration = 75;
    private static final float TooltipMinHeight;
    private static final float TooltipMinWidth = Dp.m5626constructorimpl((float) 40);

    public static final float getRichTooltipHorizontalPadding() {
        return RichTooltipHorizontalPadding;
    }

    public static final float getTooltipMinHeight() {
        return TooltipMinHeight;
    }

    public static final float getTooltipMinWidth() {
        return TooltipMinWidth;
    }

    /* JADX WARNING: Removed duplicated region for block: B:125:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00fe  */
    /* renamed from: PlainTooltipBox-nBX6wN0  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1841PlainTooltipBoxnBX6wN0(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r23, androidx.compose.ui.Modifier r24, androidx.compose.material3.PlainTooltipState r25, androidx.compose.ui.graphics.Shape r26, long r27, long r29, kotlin.jvm.functions.Function3<? super androidx.compose.material3.TooltipBoxScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r31, androidx.compose.runtime.Composer r32, int r33, int r34) {
        /*
            r1 = r23
            r14 = r31
            r15 = r33
            java.lang.String r0 = "tooltip"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            r0 = -531325137(0xffffffffe0549f2f, float:-6.1284065E19)
            r2 = r32
            androidx.compose.runtime.Composer r13 = r2.startRestartGroup(r0)
            java.lang.String r2 = "C(PlainTooltipBox)P(5,3,6,4,0:c#ui.graphics.Color,2:c#ui.graphics.Color)97@4379L32,98@4448L26,99@4520L26,100@4590L24,*103@4721L7,104@4794L63,106@4863L450:Tooltip.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r13, r2)
            r2 = r34 & 1
            if (r2 == 0) goto L_0x0027
            r2 = r15 | 6
            goto L_0x0037
        L_0x0027:
            r2 = r15 & 14
            if (r2 != 0) goto L_0x0036
            boolean r2 = r13.changedInstance(r1)
            if (r2 == 0) goto L_0x0033
            r2 = 4
            goto L_0x0034
        L_0x0033:
            r2 = 2
        L_0x0034:
            r2 = r2 | r15
            goto L_0x0037
        L_0x0036:
            r2 = r15
        L_0x0037:
            r3 = r34 & 2
            if (r3 == 0) goto L_0x003e
            r2 = r2 | 48
            goto L_0x0051
        L_0x003e:
            r4 = r15 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0051
            r4 = r24
            boolean r5 = r13.changed((java.lang.Object) r4)
            if (r5 == 0) goto L_0x004d
            r5 = 32
            goto L_0x004f
        L_0x004d:
            r5 = 16
        L_0x004f:
            r2 = r2 | r5
            goto L_0x0053
        L_0x0051:
            r4 = r24
        L_0x0053:
            r5 = r34 & 4
            if (r5 == 0) goto L_0x005a
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x006d
        L_0x005a:
            r6 = r15 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x006d
            r6 = r25
            boolean r7 = r13.changed((java.lang.Object) r6)
            if (r7 == 0) goto L_0x0069
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x006b
        L_0x0069:
            r7 = 128(0x80, float:1.794E-43)
        L_0x006b:
            r2 = r2 | r7
            goto L_0x006f
        L_0x006d:
            r6 = r25
        L_0x006f:
            r7 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0088
            r7 = r34 & 8
            if (r7 != 0) goto L_0x0082
            r7 = r26
            boolean r8 = r13.changed((java.lang.Object) r7)
            if (r8 == 0) goto L_0x0084
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0086
        L_0x0082:
            r7 = r26
        L_0x0084:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0086:
            r2 = r2 | r8
            goto L_0x008a
        L_0x0088:
            r7 = r26
        L_0x008a:
            r8 = 57344(0xe000, float:8.0356E-41)
            r9 = r15 & r8
            if (r9 != 0) goto L_0x00a6
            r9 = r34 & 16
            if (r9 != 0) goto L_0x00a0
            r9 = r27
            boolean r11 = r13.changed((long) r9)
            if (r11 == 0) goto L_0x00a2
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a4
        L_0x00a0:
            r9 = r27
        L_0x00a2:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x00a4:
            r2 = r2 | r11
            goto L_0x00a8
        L_0x00a6:
            r9 = r27
        L_0x00a8:
            r11 = 458752(0x70000, float:6.42848E-40)
            r12 = r15 & r11
            if (r12 != 0) goto L_0x00c4
            r12 = r34 & 32
            if (r12 != 0) goto L_0x00bd
            r11 = r29
            boolean r16 = r13.changed((long) r11)
            if (r16 == 0) goto L_0x00bf
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c1
        L_0x00bd:
            r11 = r29
        L_0x00bf:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00c1:
            r2 = r2 | r16
            goto L_0x00c6
        L_0x00c4:
            r11 = r29
        L_0x00c6:
            r16 = r34 & 64
            if (r16 == 0) goto L_0x00cf
            r16 = 1572864(0x180000, float:2.204052E-39)
        L_0x00cc:
            r2 = r2 | r16
            goto L_0x00e1
        L_0x00cf:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r15 & r16
            if (r16 != 0) goto L_0x00e1
            boolean r16 = r13.changedInstance(r14)
            if (r16 == 0) goto L_0x00de
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cc
        L_0x00de:
            r16 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00cc
        L_0x00e1:
            r16 = 2995931(0x2db6db, float:4.198194E-39)
            r8 = r2 & r16
            r0 = 599186(0x92492, float:8.39638E-40)
            if (r8 != r0) goto L_0x00fe
            boolean r0 = r13.getSkipping()
            if (r0 != 0) goto L_0x00f2
            goto L_0x00fe
        L_0x00f2:
            r13.skipToGroupEnd()
            r2 = r4
            r3 = r6
            r4 = r7
            r5 = r9
            r7 = r11
            r20 = r13
            goto L_0x0235
        L_0x00fe:
            r13.startDefaults()
            r0 = r15 & 1
            r18 = -57345(0xffffffffffff1fff, float:NaN)
            java.lang.String r8 = "CC(remember):Composables.kt#9igjgp"
            r4 = 6
            if (r0 == 0) goto L_0x0132
            boolean r0 = r13.getDefaultsInvalid()
            if (r0 == 0) goto L_0x0112
            goto L_0x0132
        L_0x0112:
            r13.skipToGroupEnd()
            r0 = r34 & 8
            if (r0 == 0) goto L_0x011b
            r2 = r2 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x011b:
            r0 = r34 & 16
            if (r0 == 0) goto L_0x0121
            r2 = r2 & r18
        L_0x0121:
            r0 = r34 & 32
            if (r0 == 0) goto L_0x0129
            r0 = -458753(0xfffffffffff8ffff, float:NaN)
            r2 = r2 & r0
        L_0x0129:
            r0 = r24
        L_0x012b:
            r18 = r6
            r19 = r7
            r21 = r9
            goto L_0x0188
        L_0x0132:
            if (r3 == 0) goto L_0x0139
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            goto L_0x013b
        L_0x0139:
            r0 = r24
        L_0x013b:
            if (r5 == 0) goto L_0x0160
            r3 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r13.startReplaceableGroup(r3)
            androidx.compose.runtime.ComposerKt.sourceInformation(r13, r8)
            java.lang.Object r3 = r13.rememberedValue()
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r5 = r5.getEmpty()
            if (r3 != r5) goto L_0x015a
            androidx.compose.material3.PlainTooltipState r3 = new androidx.compose.material3.PlainTooltipState
            r3.<init>()
            r13.updateRememberedValue(r3)
        L_0x015a:
            r13.endReplaceableGroup()
            androidx.compose.material3.PlainTooltipState r3 = (androidx.compose.material3.PlainTooltipState) r3
            r6 = r3
        L_0x0160:
            r3 = r34 & 8
            if (r3 == 0) goto L_0x016d
            androidx.compose.material3.TooltipDefaults r3 = androidx.compose.material3.TooltipDefaults.INSTANCE
            androidx.compose.ui.graphics.Shape r3 = r3.getPlainTooltipContainerShape(r13, r4)
            r2 = r2 & -7169(0xffffffffffffe3ff, float:NaN)
            r7 = r3
        L_0x016d:
            r3 = r34 & 16
            if (r3 == 0) goto L_0x0179
            androidx.compose.material3.TooltipDefaults r3 = androidx.compose.material3.TooltipDefaults.INSTANCE
            long r9 = r3.getPlainTooltipContainerColor(r13, r4)
            r2 = r2 & r18
        L_0x0179:
            r3 = r34 & 32
            if (r3 == 0) goto L_0x012b
            androidx.compose.material3.TooltipDefaults r3 = androidx.compose.material3.TooltipDefaults.INSTANCE
            long r11 = r3.getPlainTooltipContentColor(r13, r4)
            r3 = -458753(0xfffffffffff8ffff, float:NaN)
            r2 = r2 & r3
            goto L_0x012b
        L_0x0188:
            r13.endDefaults()
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L_0x019b
            r3 = -1
            java.lang.String r5 = "androidx.compose.material3.PlainTooltipBox (Tooltip.kt:94)"
            r6 = -531325137(0xffffffffe0549f2f, float:-6.1284065E19)
            androidx.compose.runtime.ComposerKt.traceEventStart(r6, r2, r3, r5)
        L_0x019b:
            androidx.compose.runtime.ProvidableCompositionLocal r3 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r3 = (androidx.compose.runtime.CompositionLocal) r3
            r5 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r6 = "CC:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r13, r5, r6)
            java.lang.Object r3 = r13.consume(r3)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r13)
            androidx.compose.ui.unit.Density r3 = (androidx.compose.ui.unit.Density) r3
            float r5 = TooltipAnchorPadding
            int r3 = r3.m5601roundToPx0680j_4(r5)
            r5 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r13.startReplaceableGroup(r5)
            androidx.compose.runtime.ComposerKt.sourceInformation(r13, r8)
            java.lang.Object r5 = r13.rememberedValue()
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r6 = r6.getEmpty()
            if (r5 != r6) goto L_0x01d5
            androidx.compose.material3.PlainTooltipPositionProvider r5 = new androidx.compose.material3.PlainTooltipPositionProvider
            r5.<init>(r3)
            r13.updateRememberedValue(r5)
        L_0x01d5:
            r13.endReplaceableGroup()
            androidx.compose.material3.PlainTooltipPositionProvider r5 = (androidx.compose.material3.PlainTooltipPositionProvider) r5
            r3 = 0
            float r3 = (float) r3
            float r9 = androidx.compose.ui.unit.Dp.m5626constructorimpl(r3)
            float r10 = PlainTooltipMaxWidth
            androidx.compose.material3.TooltipKt$PlainTooltipBox$2 r3 = new androidx.compose.material3.TooltipKt$PlainTooltipBox$2
            r3.<init>(r11, r1, r2)
            r6 = -785135750(0xffffffffd133c77a, float:-4.8259113E10)
            r7 = 1
            androidx.compose.runtime.internal.ComposableLambda r3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r13, r6, r7, r3)
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
            androidx.compose.ui.window.PopupPositionProvider r5 = (androidx.compose.ui.window.PopupPositionProvider) r5
            r6 = r18
            androidx.compose.material3.TooltipState r6 = (androidx.compose.material3.TooltipState) r6
            int r7 = r2 << 3
            r8 = r7 & 896(0x380, float:1.256E-42)
            r16 = 14155830(0xd80036, float:1.9836543E-38)
            r8 = r8 | r16
            r1 = r2 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r8
            int r2 = r2 << r4
            r4 = 57344(0xe000, float:8.0356E-41)
            r4 = r4 & r2
            r1 = r1 | r4
            r4 = 458752(0x70000, float:6.42848E-40)
            r4 = r4 & r7
            r1 = r1 | r4
            r4 = 234881024(0xe000000, float:1.5777218E-30)
            r2 = r2 & r4
            r1 = r1 | r2
            r2 = r3
            r3 = r5
            r4 = r0
            r5 = r19
            r7 = r21
            r16 = r11
            r11 = r31
            r12 = r13
            r20 = r13
            r13 = r1
            m1843TooltipBoxXDn_Kpo(r2, r3, r4, r5, r6, r7, r9, r10, r11, r12, r13)
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x022c
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x022c:
            r2 = r0
            r7 = r16
            r3 = r18
            r4 = r19
            r5 = r21
        L_0x0235:
            androidx.compose.runtime.ScopeUpdateScope r12 = r20.endRestartGroup()
            if (r12 != 0) goto L_0x023c
            goto L_0x024f
        L_0x023c:
            androidx.compose.material3.TooltipKt$PlainTooltipBox$3 r13 = new androidx.compose.material3.TooltipKt$PlainTooltipBox$3
            r0 = r13
            r1 = r23
            r9 = r31
            r10 = r33
            r11 = r34
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r10, r11)
            kotlin.jvm.functions.Function2 r13 = (kotlin.jvm.functions.Function2) r13
            r12.updateScope(r13)
        L_0x024f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TooltipKt.m1841PlainTooltipBoxnBX6wN0(kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, androidx.compose.material3.PlainTooltipState, androidx.compose.ui.graphics.Shape, long, long, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:124:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0297  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x02ab  */
    /* JADX WARNING: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x011c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void RichTooltipBox(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r28, androidx.compose.ui.Modifier r29, androidx.compose.material3.RichTooltipState r30, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r31, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r32, androidx.compose.ui.graphics.Shape r33, androidx.compose.material3.RichTooltipColors r34, kotlin.jvm.functions.Function3<? super androidx.compose.material3.TooltipBoxScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r35, androidx.compose.runtime.Composer r36, int r37, int r38) {
        /*
            r1 = r28
            r14 = r35
            r15 = r37
            r0 = r38
            java.lang.String r2 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.lang.String r2 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r2)
            r2 = 180959998(0xac93afe, float:1.9377786E-32)
            r3 = r36
            androidx.compose.runtime.Composer r13 = r3.startRestartGroup(r2)
            java.lang.String r3 = "C(RichTooltipBox)P(5,3,7,6!1,4)151@6531L31,154@6690L25,155@6765L19,*158@6891L7,159@6964L62,161@7043L130,161@7032L141,166@7179L536:Tooltip.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r13, r3)
            r3 = r0 & 1
            if (r3 == 0) goto L_0x0029
            r3 = r15 | 6
            goto L_0x0039
        L_0x0029:
            r3 = r15 & 14
            if (r3 != 0) goto L_0x0038
            boolean r3 = r13.changedInstance(r1)
            if (r3 == 0) goto L_0x0035
            r3 = 4
            goto L_0x0036
        L_0x0035:
            r3 = 2
        L_0x0036:
            r3 = r3 | r15
            goto L_0x0039
        L_0x0038:
            r3 = r15
        L_0x0039:
            r4 = r0 & 2
            if (r4 == 0) goto L_0x0040
            r3 = r3 | 48
            goto L_0x0053
        L_0x0040:
            r5 = r15 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0053
            r5 = r29
            boolean r6 = r13.changed((java.lang.Object) r5)
            if (r6 == 0) goto L_0x004f
            r6 = 32
            goto L_0x0051
        L_0x004f:
            r6 = 16
        L_0x0051:
            r3 = r3 | r6
            goto L_0x0055
        L_0x0053:
            r5 = r29
        L_0x0055:
            r6 = r0 & 4
            if (r6 == 0) goto L_0x005c
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x006f
        L_0x005c:
            r7 = r15 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x006f
            r7 = r30
            boolean r8 = r13.changed((java.lang.Object) r7)
            if (r8 == 0) goto L_0x006b
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x006d
        L_0x006b:
            r8 = 128(0x80, float:1.794E-43)
        L_0x006d:
            r3 = r3 | r8
            goto L_0x0071
        L_0x006f:
            r7 = r30
        L_0x0071:
            r8 = r0 & 8
            if (r8 == 0) goto L_0x0078
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x008b
        L_0x0078:
            r9 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x008b
            r9 = r31
            boolean r10 = r13.changedInstance(r9)
            if (r10 == 0) goto L_0x0087
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0089
        L_0x0087:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0089:
            r3 = r3 | r10
            goto L_0x008d
        L_0x008b:
            r9 = r31
        L_0x008d:
            r10 = r0 & 16
            r11 = 57344(0xe000, float:8.0356E-41)
            if (r10 == 0) goto L_0x0097
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00ab
        L_0x0097:
            r12 = r15 & r11
            if (r12 != 0) goto L_0x00ab
            r12 = r32
            boolean r16 = r13.changedInstance(r12)
            if (r16 == 0) goto L_0x00a6
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a8
        L_0x00a6:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x00a8:
            r3 = r3 | r16
            goto L_0x00ad
        L_0x00ab:
            r12 = r32
        L_0x00ad:
            r16 = 458752(0x70000, float:6.42848E-40)
            r16 = r15 & r16
            if (r16 != 0) goto L_0x00c7
            r16 = r0 & 32
            r11 = r33
            if (r16 != 0) goto L_0x00c2
            boolean r16 = r13.changed((java.lang.Object) r11)
            if (r16 == 0) goto L_0x00c2
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c4
        L_0x00c2:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00c4:
            r3 = r3 | r16
            goto L_0x00c9
        L_0x00c7:
            r11 = r33
        L_0x00c9:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r15 & r16
            if (r16 != 0) goto L_0x00e3
            r16 = r0 & 64
            r2 = r34
            if (r16 != 0) goto L_0x00de
            boolean r16 = r13.changed((java.lang.Object) r2)
            if (r16 == 0) goto L_0x00de
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e0
        L_0x00de:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00e0:
            r3 = r3 | r16
            goto L_0x00e5
        L_0x00e3:
            r2 = r34
        L_0x00e5:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x00ed
            r1 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x00eb:
            r3 = r3 | r1
            goto L_0x00fe
        L_0x00ed:
            r1 = 29360128(0x1c00000, float:7.052966E-38)
            r1 = r1 & r15
            if (r1 != 0) goto L_0x00fe
            boolean r1 = r13.changedInstance(r14)
            if (r1 == 0) goto L_0x00fb
            r1 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00eb
        L_0x00fb:
            r1 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x00eb
        L_0x00fe:
            r1 = 23967451(0x16db6db, float:4.3661218E-38)
            r1 = r1 & r3
            r2 = 4793490(0x492492, float:6.71711E-39)
            if (r1 != r2) goto L_0x011c
            boolean r1 = r13.getSkipping()
            if (r1 != 0) goto L_0x010e
            goto L_0x011c
        L_0x010e:
            r13.skipToGroupEnd()
            r2 = r5
            r3 = r7
            r4 = r9
            r6 = r11
            r5 = r12
            r21 = r13
            r7 = r34
            goto L_0x02a4
        L_0x011c:
            r13.startDefaults()
            r1 = r15 & 1
            r16 = -458753(0xfffffffffff8ffff, float:NaN)
            java.lang.String r2 = "CC(remember):Composables.kt#9igjgp"
            r5 = 6
            if (r1 == 0) goto L_0x014c
            boolean r1 = r13.getDefaultsInvalid()
            if (r1 == 0) goto L_0x0130
            goto L_0x014c
        L_0x0130:
            r13.skipToGroupEnd()
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0139
            r3 = r3 & r16
        L_0x0139:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0141
            r1 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = r3 & r1
        L_0x0141:
            r1 = r29
        L_0x0143:
            r18 = r34
        L_0x0145:
            r16 = r9
            r17 = r11
            r11 = r12
            r12 = r7
            goto L_0x01ad
        L_0x014c:
            if (r4 == 0) goto L_0x0153
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
            goto L_0x0155
        L_0x0153:
            r1 = r29
        L_0x0155:
            if (r6 == 0) goto L_0x017a
            r4 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r13.startReplaceableGroup(r4)
            androidx.compose.runtime.ComposerKt.sourceInformation(r13, r2)
            java.lang.Object r4 = r13.rememberedValue()
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r6 = r6.getEmpty()
            if (r4 != r6) goto L_0x0174
            androidx.compose.material3.RichTooltipState r4 = new androidx.compose.material3.RichTooltipState
            r4.<init>()
            r13.updateRememberedValue(r4)
        L_0x0174:
            r13.endReplaceableGroup()
            androidx.compose.material3.RichTooltipState r4 = (androidx.compose.material3.RichTooltipState) r4
            r7 = r4
        L_0x017a:
            r4 = 0
            if (r8 == 0) goto L_0x017e
            r9 = r4
        L_0x017e:
            if (r10 == 0) goto L_0x0181
            r12 = r4
        L_0x0181:
            r4 = r0 & 32
            if (r4 == 0) goto L_0x018e
            androidx.compose.material3.TooltipDefaults r4 = androidx.compose.material3.TooltipDefaults.INSTANCE
            androidx.compose.ui.graphics.Shape r4 = r4.getRichTooltipContainerShape(r13, r5)
            r3 = r3 & r16
            r11 = r4
        L_0x018e:
            r4 = r0 & 64
            if (r4 == 0) goto L_0x0143
            androidx.compose.material3.TooltipDefaults r16 = androidx.compose.material3.TooltipDefaults.INSTANCE
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r26 = 24576(0x6000, float:3.4438E-41)
            r27 = 15
            r25 = r13
            androidx.compose.material3.RichTooltipColors r4 = r16.m1840richTooltipColorsro_MJ88(r17, r19, r21, r23, r25, r26, r27)
            r6 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = r3 & r6
            r18 = r4
            goto L_0x0145
        L_0x01ad:
            r13.endDefaults()
            boolean r4 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r4 == 0) goto L_0x01c0
            r4 = -1
            java.lang.String r6 = "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)"
            r7 = 180959998(0xac93afe, float:1.9377786E-32)
            androidx.compose.runtime.ComposerKt.traceEventStart(r7, r3, r4, r6)
        L_0x01c0:
            androidx.compose.runtime.ProvidableCompositionLocal r4 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r4 = (androidx.compose.runtime.CompositionLocal) r4
            r6 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r7 = "CC:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r13, r6, r7)
            java.lang.Object r4 = r13.consume(r4)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r13)
            androidx.compose.ui.unit.Density r4 = (androidx.compose.ui.unit.Density) r4
            float r6 = TooltipAnchorPadding
            int r4 = r4.m5601roundToPx0680j_4(r6)
            r6 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r13.startReplaceableGroup(r6)
            androidx.compose.runtime.ComposerKt.sourceInformation(r13, r2)
            java.lang.Object r2 = r13.rememberedValue()
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r6 = r6.getEmpty()
            if (r2 != r6) goto L_0x01fa
            androidx.compose.material3.RichTooltipPositionProvider r2 = new androidx.compose.material3.RichTooltipPositionProvider
            r2.<init>(r4)
            r13.updateRememberedValue(r2)
        L_0x01fa:
            r13.endReplaceableGroup()
            androidx.compose.material3.RichTooltipPositionProvider r2 = (androidx.compose.material3.RichTooltipPositionProvider) r2
            int r4 = r3 >> 6
            r6 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r13.startReplaceableGroup(r6)
            java.lang.String r6 = "CC(remember)P(1,2):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r13, r6)
            boolean r6 = r13.changed((java.lang.Object) r12)
            boolean r7 = r13.changed((java.lang.Object) r11)
            r6 = r6 | r7
            java.lang.Object r7 = r13.rememberedValue()
            if (r6 != 0) goto L_0x0223
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r6 = r6.getEmpty()
            if (r7 != r6) goto L_0x022e
        L_0x0223:
            androidx.compose.material3.TooltipKt$RichTooltipBox$2$1 r6 = new androidx.compose.material3.TooltipKt$RichTooltipBox$2$1
            r6.<init>(r12, r11)
            r7 = r6
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            r13.updateRememberedValue(r7)
        L_0x022e:
            r13.endReplaceableGroup()
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            r6 = 0
            androidx.compose.runtime.EffectsKt.SideEffect(r7, r13, r6)
            long r7 = r18.m1513getContainerColor0d7_KjU()
            androidx.compose.material3.tokens.RichTooltipTokens r6 = androidx.compose.material3.tokens.RichTooltipTokens.INSTANCE
            float r9 = r6.m2281getContainerElevationD9Ej5fM()
            float r10 = RichTooltipMaxWidth
            androidx.compose.material3.TooltipKt$RichTooltipBox$3 r6 = new androidx.compose.material3.TooltipKt$RichTooltipBox$3
            r29 = r6
            r30 = r18
            r31 = r28
            r32 = r16
            r33 = r11
            r34 = r3
            r29.<init>(r30, r31, r32, r33, r34)
            r5 = 1423372873(0x54d6f249, float:7.385503E12)
            r0 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r13, r5, r0, r6)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r5 = r2
            androidx.compose.ui.window.PopupPositionProvider r5 = (androidx.compose.ui.window.PopupPositionProvider) r5
            r6 = r12
            androidx.compose.material3.TooltipState r6 = (androidx.compose.material3.TooltipState) r6
            int r2 = r3 << 3
            r20 = r11
            r11 = r2 & 896(0x380, float:1.256E-42)
            r21 = 14155830(0xd80036, float:1.9836543E-38)
            r11 = r11 | r21
            r4 = r4 & 7168(0x1c00, float:1.0045E-41)
            r4 = r4 | r11
            r11 = 6
            int r3 = r3 << r11
            r11 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r11
            r3 = r3 | r4
            r4 = 234881024(0xe000000, float:1.5777218E-30)
            r2 = r2 & r4
            r19 = r3 | r2
            r2 = r0
            r3 = r5
            r4 = r1
            r5 = r17
            r0 = r20
            r11 = r35
            r20 = r12
            r12 = r13
            r21 = r13
            r13 = r19
            m1843TooltipBoxXDn_Kpo(r2, r3, r4, r5, r6, r7, r9, r10, r11, r12, r13)
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x029a
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x029a:
            r5 = r0
            r2 = r1
            r4 = r16
            r6 = r17
            r7 = r18
            r3 = r20
        L_0x02a4:
            androidx.compose.runtime.ScopeUpdateScope r11 = r21.endRestartGroup()
            if (r11 != 0) goto L_0x02ab
            goto L_0x02be
        L_0x02ab:
            androidx.compose.material3.TooltipKt$RichTooltipBox$4 r12 = new androidx.compose.material3.TooltipKt$RichTooltipBox$4
            r0 = r12
            r1 = r28
            r8 = r35
            r9 = r37
            r10 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            kotlin.jvm.functions.Function2 r12 = (kotlin.jvm.functions.Function2) r12
            r11.updateScope(r12)
        L_0x02be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TooltipKt.RichTooltipBox(kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, androidx.compose.material3.RichTooltipState, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.ui.graphics.Shape, androidx.compose.material3.RichTooltipColors, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: TooltipBox-XDn_Kpo  reason: not valid java name */
    public static final void m1843TooltipBoxXDn_Kpo(Function2<? super Composer, ? super Integer, Unit> function2, PopupPositionProvider popupPositionProvider, Modifier modifier, Shape shape, TooltipState tooltipState, long j, float f, float f2, Function3<? super TooltipBoxScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i) {
        int i2;
        PopupPositionProvider popupPositionProvider2 = popupPositionProvider;
        TooltipState tooltipState2 = tooltipState;
        Function3<? super TooltipBoxScope, ? super Composer, ? super Integer, Unit> function32 = function3;
        int i3 = i;
        Composer startRestartGroup = composer.startRestartGroup(-1415647894);
        ComposerKt.sourceInformation(startRestartGroup, "C(TooltipBox)P(6,7,4,5,8,0:c#ui.graphics.Color,2:c#ui.unit.Dp,3:c#ui.unit.Dp)199@8111L24,200@8161L49,202@8228L1804,245@10038L1263:Tooltip.kt#uh7d8r");
        if ((i3 & 14) == 0) {
            i2 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i3;
        } else {
            Function2<? super Composer, ? super Integer, Unit> function22 = function2;
            i2 = i3;
        }
        if ((i3 & 112) == 0) {
            i2 |= startRestartGroup.changed((Object) popupPositionProvider2) ? 32 : 16;
        }
        if ((i3 & 896) == 0) {
            i2 |= startRestartGroup.changed((Object) modifier) ? 256 : 128;
        } else {
            Modifier modifier2 = modifier;
        }
        if ((i3 & 7168) == 0) {
            i2 |= startRestartGroup.changed((Object) shape) ? 2048 : 1024;
        } else {
            Shape shape2 = shape;
        }
        if ((57344 & i3) == 0) {
            i2 |= startRestartGroup.changed((Object) tooltipState2) ? 16384 : 8192;
        }
        if ((458752 & i3) == 0) {
            i2 |= startRestartGroup.changed(j) ? 131072 : 65536;
        } else {
            long j2 = j;
        }
        float f3 = f;
        if ((3670016 & i3) == 0) {
            i2 |= startRestartGroup.changed(f3) ? 1048576 : 524288;
        }
        float f4 = f2;
        if ((29360128 & i3) == 0) {
            i2 |= startRestartGroup.changed(f4) ? 8388608 : 4194304;
        }
        if ((234881024 & i3) == 0) {
            i2 |= startRestartGroup.changedInstance(function32) ? 67108864 : 33554432;
        }
        if ((191739611 & i2) != 38347922 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1415647894, i2, -1, "androidx.compose.material3.TooltipBox (Tooltip.kt:188)");
            }
            startRestartGroup.startReplaceableGroup(773894976);
            ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)476@19869L144:Effects.kt#9igjgp");
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            startRestartGroup.endReplaceableGroup();
            String r13 = Strings_androidKt.m1632getStringNWtq28(Strings.Companion.m1630getTooltipLongPressLabeladMyvUU(), startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new TooltipKt$TooltipBox$scope$1$1(tooltipState2, coroutineScope, r13);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            TooltipKt$TooltipBox$scope$1$1 tooltipKt$TooltipBox$scope$1$1 = (TooltipKt$TooltipBox$scope$1$1) rememberedValue2;
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
            startRestartGroup.disableReusing();
            Composer r8 = Updater.m2444constructorimpl(startRestartGroup);
            Updater.m2451setimpl(r8, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2451setimpl(r8, density, ComposeUiNode.Companion.getSetDensity());
            Updater.m2451setimpl(r8, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2451setimpl(r8, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
            BoxScope boxScope = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1995827622, "C246@10069L70,275@11286L9:Tooltip.kt#uh7d8r");
            Transition updateTransition = TransitionKt.updateTransition(Boolean.valueOf(tooltipState.isVisible()), "Tooltip transition", startRestartGroup, 48, 0);
            startRestartGroup.startReplaceableGroup(-1995827526);
            ComposerKt.sourceInformation(startRestartGroup, "248@10246L41,249@10300L960");
            if (((Boolean) updateTransition.getCurrentState()).booleanValue() || ((Boolean) updateTransition.getTargetState()).booleanValue()) {
                TooltipPopup_androidKt.TooltipPopup(popupPositionProvider2, new TooltipKt$TooltipBox$1$1(tooltipState2, coroutineScope), ComposableLambdaKt.composableLambda(startRestartGroup, -442150991, true, new TooltipKt$TooltipBox$1$2(modifier, f2, updateTransition, Strings_androidKt.m1632getStringNWtq28(Strings.Companion.m1631getTooltipPaneDescriptionadMyvUU(), startRestartGroup, 6), shape, j, f, function2, i2)), startRestartGroup, ((i2 >> 3) & 14) | 384);
            }
            startRestartGroup.endReplaceableGroup();
            function32.invoke(tooltipKt$TooltipBox$scope$1$1, startRestartGroup, Integer.valueOf(((i2 >> 21) & 112) | 6));
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
            endRestartGroup.updateScope(new TooltipKt$TooltipBox$2(function2, popupPositionProvider, modifier, shape, tooltipState, j, f, f2, function3, i));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: PlainTooltipImpl-Iv8Zu3U  reason: not valid java name */
    public static final void m1842PlainTooltipImplIv8Zu3U(long j, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(893340370);
        ComposerKt.sourceInformation(startRestartGroup, "C(PlainTooltipImpl)P(1:c#ui.graphics.Color)284@11413L337:Tooltip.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(893340370, i2, -1, "androidx.compose.material3.PlainTooltipImpl (Tooltip.kt:280)");
            }
            Modifier padding = PaddingKt.padding(Modifier.Companion, PlainTooltipContentPadding);
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
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(padding);
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
            Composer r7 = Updater.m2444constructorimpl(startRestartGroup);
            Updater.m2451setimpl(r7, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2451setimpl(r7, density, ComposeUiNode.Companion.getSetDensity());
            Updater.m2451setimpl(r7, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2451setimpl(r7, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
            BoxScope boxScope = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1000468479, "C285@11514L10,286@11582L162:Tooltip.kt#uh7d8r");
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2811boximpl(j)), TextKt.getLocalTextStyle().provides(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), PlainTooltipTokens.INSTANCE.getSupportingTextFont()))}, function2, startRestartGroup, (i2 & 112) | 8);
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
            endRestartGroup.updateScope(new TooltipKt$PlainTooltipImpl$2(j, function2, i));
        }
    }

    /* access modifiers changed from: private */
    public static final void RichTooltipImpl(RichTooltipColors richTooltipColors, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Composer composer, int i) {
        int i2;
        int i3;
        Function2<? super Composer, ? super Integer, Unit> function24 = function2;
        Function2<? super Composer, ? super Integer, Unit> function25 = function22;
        Function2<? super Composer, ? super Integer, Unit> function26 = function23;
        int i4 = i;
        Composer startRestartGroup = composer.startRestartGroup(-878950288);
        ComposerKt.sourceInformation(startRestartGroup, "C(RichTooltipImpl)P(1,2,3)303@12033L10,305@12142L10,307@12246L10,308@12309L1298:Tooltip.kt#uh7d8r");
        if ((i4 & 14) == 0) {
            i2 = (startRestartGroup.changed((Object) richTooltipColors) ? 4 : 2) | i4;
        } else {
            RichTooltipColors richTooltipColors2 = richTooltipColors;
            i2 = i4;
        }
        if ((i4 & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(function24) ? 32 : 16;
        }
        if ((i4 & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(function25) ? 256 : 128;
        }
        if ((i4 & 7168) == 0) {
            i2 |= startRestartGroup.changedInstance(function26) ? 2048 : 1024;
        }
        if ((i2 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-878950288, i2, -1, "androidx.compose.material3.RichTooltipImpl (Tooltip.kt:296)");
            }
            TextStyle fromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), RichTooltipTokens.INSTANCE.getActionLabelTextFont());
            TextStyle fromToken2 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), RichTooltipTokens.INSTANCE.getSubheadFont());
            TextStyle fromToken3 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), RichTooltipTokens.INSTANCE.getSupportingTextFont());
            Modifier r11 = PaddingKt.m495paddingVpY3zN4$default(Modifier.Companion, RichTooltipHorizontalPadding, 0.0f, 2, (Object) null);
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
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(r11);
            TextStyle textStyle = fromToken;
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
            Composer r0 = Updater.m2444constructorimpl(startRestartGroup);
            Updater.m2451setimpl(r0, columnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2451setimpl(r0, density, ComposeUiNode.Companion.getSetDensity());
            Updater.m2451setimpl(r0, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2451setimpl(r0, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693704, "C79@4027L9:Column.kt#2w3rfo");
            ColumnScope columnScope = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 51873561, "C322@12806L317:Tooltip.kt#uh7d8r");
            startRestartGroup.startReplaceableGroup(51873568);
            ComposerKt.sourceInformation(startRestartGroup, "*312@12437L350");
            if (function25 == null) {
                i3 = i2;
            } else {
                Modifier r5 = AlignmentLineKt.m391paddingFromBaselineVpY3zN4$default(Modifier.Companion, HeightToSubheadFirstLine, 0.0f, 2, (Object) null);
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
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(r5);
                i3 = i2;
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
                Composer r8 = Updater.m2444constructorimpl(startRestartGroup);
                Updater.m2451setimpl(r8, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2451setimpl(r8, density2, ComposeUiNode.Companion.getSetDensity());
                Updater.m2451setimpl(r8, layoutDirection2, ComposeUiNode.Companion.getSetLayoutDirection());
                Updater.m2451setimpl(r8, viewConfiguration2, ComposeUiNode.Companion.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf2.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
                BoxScope boxScope = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1242326159, "C315@12562L211:Tooltip.kt#uh7d8r");
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2811boximpl(richTooltipColors.m1515getTitleContentColor0d7_KjU())), TextKt.getLocalTextStyle().provides(fromToken2)}, function25, startRestartGroup, 8);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                Unit unit = Unit.INSTANCE;
                Unit unit2 = Unit.INSTANCE;
            }
            startRestartGroup.endReplaceableGroup();
            Modifier textVerticalPadding = textVerticalPadding(Modifier.Companion, function25 != null, function26 != null);
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
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(textVerticalPadding);
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
            Composer r112 = Updater.m2444constructorimpl(startRestartGroup);
            Updater.m2451setimpl(r112, rememberBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2451setimpl(r112, density3, ComposeUiNode.Companion.getSetDensity());
            Updater.m2451setimpl(r112, layoutDirection3, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2451setimpl(r112, viewConfiguration3, ComposeUiNode.Companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf3.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
            BoxScope boxScope2 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 471369652, "C325@12918L195:Tooltip.kt#uh7d8r");
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2811boximpl(richTooltipColors.m1514getContentColor0d7_KjU())), TextKt.getLocalTextStyle().provides(fromToken3)}, function2, startRestartGroup, (i3 & 112) | 8);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(75391440);
            ComposerKt.sourceInformation(startRestartGroup, "*332@13158L433");
            if (function26 != null) {
                Modifier r02 = PaddingKt.m497paddingqDBjuR0$default(SizeKt.m554requiredHeightInVpY3zN4$default(Modifier.Companion, ActionLabelMinHeight, 0.0f, 2, (Object) null), 0.0f, 0.0f, 0.0f, ActionLabelBottomPadding, 7, (Object) null);
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
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf4 = LayoutKt.materializerOf(r02);
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
                Updater.m2451setimpl(r9, rememberBoxMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2451setimpl(r9, density4, ComposeUiNode.Companion.getSetDensity());
                Updater.m2451setimpl(r9, layoutDirection4, ComposeUiNode.Companion.getSetLayoutDirection());
                Updater.m2451setimpl(r9, viewConfiguration4, ComposeUiNode.Companion.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf4.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
                BoxScope boxScope3 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1242325360, "C337@13361L216:Tooltip.kt#uh7d8r");
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2811boximpl(richTooltipColors.m1512getActionContentColor0d7_KjU())), TextKt.getLocalTextStyle().provides(textStyle)}, function26, startRestartGroup, 8);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                Unit unit3 = Unit.INSTANCE;
                Unit unit4 = Unit.INSTANCE;
            }
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
            Function2<? super Composer, ? super Integer, Unit> function27 = function24;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TooltipKt$RichTooltipImpl$2(richTooltipColors, function2, function22, function23, i));
        }
    }

    private static final Modifier textVerticalPadding(Modifier modifier, boolean z, boolean z2) {
        if (z || z2) {
            return PaddingKt.m497paddingqDBjuR0$default(AlignmentLineKt.m391paddingFromBaselineVpY3zN4$default(modifier, HeightFromSubheadToTextFirstLine, 0.0f, 2, (Object) null), 0.0f, 0.0f, 0.0f, TextBottomPadding, 7, (Object) null);
        }
        return PaddingKt.m495paddingVpY3zN4$default(modifier, 0.0f, PlainTooltipVerticalPadding, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final Modifier animateTooltip(Modifier modifier, Transition<Boolean> transition) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new TooltipKt$animateTooltip$$inlined$debugInspectorInfo$1(transition) : InspectableValueKt.getNoInspectorInfo(), new TooltipKt$animateTooltip$2(transition));
    }

    static {
        float f = (float) 4;
        TooltipAnchorPadding = Dp.m5626constructorimpl(f);
        float f2 = (float) 24;
        TooltipMinHeight = Dp.m5626constructorimpl(f2);
        float r0 = Dp.m5626constructorimpl(f);
        PlainTooltipVerticalPadding = r0;
        float f3 = (float) 8;
        float r3 = Dp.m5626constructorimpl(f3);
        PlainTooltipHorizontalPadding = r3;
        PlainTooltipContentPadding = PaddingKt.m487PaddingValuesYgX7TsA(r3, r0);
        float f4 = (float) 16;
        RichTooltipHorizontalPadding = Dp.m5626constructorimpl(f4);
        HeightFromSubheadToTextFirstLine = Dp.m5626constructorimpl(f2);
        TextBottomPadding = Dp.m5626constructorimpl(f4);
        ActionLabelBottomPadding = Dp.m5626constructorimpl(f3);
    }
}
