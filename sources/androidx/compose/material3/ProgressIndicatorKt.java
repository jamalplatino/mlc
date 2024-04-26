package androidx.compose.material3;

import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.material3.tokens.CircularProgressIndicatorTokens;
import androidx.compose.material3.tokens.LinearProgressIndicatorTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\u001a3\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020\u0005H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001aG\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020\u00052\b\b\u0002\u0010+\u001a\u00020'2\b\b\u0002\u0010,\u001a\u00020-H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b.\u0010/\u001a;\u0010\"\u001a\u00020#2\u0006\u00100\u001a\u00020\u00012\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020\u0005H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u00102\u001aO\u0010\"\u001a\u00020#2\u0006\u00100\u001a\u00020\u00012\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020\u00052\b\b\u0002\u0010+\u001a\u00020'2\b\b\u0002\u0010,\u001a\u00020-H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b3\u00104\u001a3\u00105\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010+\u001a\u00020'H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b6\u00107\u001a=\u00105\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010+\u001a\u00020'2\b\b\u0002\u0010,\u001a\u00020-H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b8\u00109\u001a;\u00105\u001a\u00020#2\u0006\u00100\u001a\u00020\u00012\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010+\u001a\u00020'H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b:\u0010;\u001aE\u00105\u001a\u00020#2\u0006\u00100\u001a\u00020\u00012\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010+\u001a\u00020'2\b\b\u0002\u0010,\u001a\u00020-H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b<\u0010=\u001a9\u0010>\u001a\u00020#*\u00020?2\u0006\u0010@\u001a\u00020\u00012\u0006\u0010A\u001a\u00020\u00012\u0006\u0010&\u001a\u00020'2\u0006\u0010B\u001a\u00020CH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bD\u0010E\u001a)\u0010F\u001a\u00020#*\u00020?2\u0006\u0010&\u001a\u00020'2\u0006\u0010B\u001a\u00020CH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bG\u0010H\u001a9\u0010I\u001a\u00020#*\u00020?2\u0006\u0010@\u001a\u00020\u00012\u0006\u0010A\u001a\u00020\u00012\u0006\u0010&\u001a\u00020'2\u0006\u0010B\u001a\u00020CH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bJ\u0010E\u001aA\u0010K\u001a\u00020#*\u00020?2\u0006\u0010@\u001a\u00020\u00012\u0006\u0010(\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u00012\u0006\u0010&\u001a\u00020'2\u0006\u0010B\u001a\u00020CH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bL\u0010M\u001aA\u0010N\u001a\u00020#*\u00020?2\u0006\u0010O\u001a\u00020\u00012\u0006\u0010P\u001a\u00020\u00012\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00012\u0006\u0010,\u001a\u00020-H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bQ\u0010R\u001a1\u0010S\u001a\u00020#*\u00020?2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00012\u0006\u0010,\u001a\u00020-H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bT\u0010U\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000\"\u0019\u0010\u0004\u001a\u00020\u0005X\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\"\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\nXT¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\nXT¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\nXT¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\nXT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\nXT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\nXT¢\u0006\u0002\n\u0000\"\u0019\u0010\u0014\u001a\u00020\u0005X\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0015\u0010\u0007\"\u0019\u0010\u0016\u001a\u00020\u0005X\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0017\u0010\u0007\"\u000e\u0010\u0018\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\nXT¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\nXT¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\nXT¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\nXT¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\nXT¢\u0006\u0002\n\u0000\"\u000e\u0010\u001f\u001a\u00020\nXT¢\u0006\u0002\n\u0000\"\u000e\u0010 \u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010!\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006V"}, d2 = {"BaseRotationAngle", "", "CircularEasing", "Landroidx/compose/animation/core/CubicBezierEasing;", "CircularIndicatorDiameter", "Landroidx/compose/ui/unit/Dp;", "getCircularIndicatorDiameter", "()F", "F", "FirstLineHeadDelay", "", "FirstLineHeadDuration", "FirstLineHeadEasing", "FirstLineTailDelay", "FirstLineTailDuration", "FirstLineTailEasing", "HeadAndTailAnimationDuration", "HeadAndTailDelayDuration", "JumpRotationAngle", "LinearAnimationDuration", "LinearIndicatorHeight", "getLinearIndicatorHeight", "LinearIndicatorWidth", "getLinearIndicatorWidth", "RotationAngleOffset", "RotationDuration", "RotationsPerCycle", "SecondLineHeadDelay", "SecondLineHeadDuration", "SecondLineHeadEasing", "SecondLineTailDelay", "SecondLineTailDuration", "SecondLineTailEasing", "StartAngleOffset", "CircularProgressIndicator", "", "modifier", "Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", "strokeWidth", "CircularProgressIndicator-aM-cp0Q", "(Landroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", "trackColor", "strokeCap", "Landroidx/compose/ui/graphics/StrokeCap;", "CircularProgressIndicator-LxG7B9w", "(Landroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V", "progress", "CircularProgressIndicator-MBs18nI", "(FLandroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", "CircularProgressIndicator-DUhRLBM", "(FLandroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator", "LinearProgressIndicator-RIQooxk", "(Landroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-2cYBFYY", "(Landroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-eaDK9VM", "(FLandroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-_5eSR-E", "(FLandroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V", "drawCircularIndicator", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "startAngle", "sweep", "stroke", "Landroidx/compose/ui/graphics/drawscope/Stroke;", "drawCircularIndicator-42QJj7c", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawCircularIndicatorTrack", "drawCircularIndicatorTrack-bw27NRU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawDeterminateCircularIndicator", "drawDeterminateCircularIndicator-42QJj7c", "drawIndeterminateCircularIndicator", "drawIndeterminateCircularIndicator-hrjfTZI", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawLinearIndicator", "startFraction", "endFraction", "drawLinearIndicator-qYKTg0g", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJFI)V", "drawLinearIndicatorTrack", "drawLinearIndicatorTrack-AZGd3zU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFI)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: ProgressIndicator.kt */
public final class ProgressIndicatorKt {
    private static final float BaseRotationAngle = 286.0f;
    /* access modifiers changed from: private */
    public static final CubicBezierEasing CircularEasing = new CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);
    private static final float CircularIndicatorDiameter = Dp.m5626constructorimpl(CircularProgressIndicatorTokens.INSTANCE.m1898getSizeD9Ej5fM() - Dp.m5626constructorimpl(CircularProgressIndicatorTokens.INSTANCE.m1897getActiveIndicatorWidthD9Ej5fM() * ((float) 2)));
    private static final int FirstLineHeadDelay = 0;
    private static final int FirstLineHeadDuration = 750;
    /* access modifiers changed from: private */
    public static final CubicBezierEasing FirstLineHeadEasing = new CubicBezierEasing(0.2f, 0.0f, 0.8f, 1.0f);
    private static final int FirstLineTailDelay = 333;
    private static final int FirstLineTailDuration = 850;
    /* access modifiers changed from: private */
    public static final CubicBezierEasing FirstLineTailEasing = new CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);
    private static final int HeadAndTailAnimationDuration = 666;
    private static final int HeadAndTailDelayDuration = 666;
    private static final float JumpRotationAngle = 290.0f;
    private static final int LinearAnimationDuration = 1800;
    private static final float LinearIndicatorHeight = LinearProgressIndicatorTokens.INSTANCE.m2126getTrackHeightD9Ej5fM();
    private static final float LinearIndicatorWidth = Dp.m5626constructorimpl((float) 240);
    private static final float RotationAngleOffset = 216.0f;
    private static final int RotationDuration = 1332;
    private static final int RotationsPerCycle = 5;
    private static final int SecondLineHeadDelay = 1000;
    private static final int SecondLineHeadDuration = 567;
    /* access modifiers changed from: private */
    public static final CubicBezierEasing SecondLineHeadEasing = new CubicBezierEasing(0.0f, 0.0f, 0.65f, 1.0f);
    private static final int SecondLineTailDelay = 1267;
    private static final int SecondLineTailDuration = 533;
    /* access modifiers changed from: private */
    public static final CubicBezierEasing SecondLineTailEasing = new CubicBezierEasing(0.1f, 0.0f, 0.45f, 1.0f);
    private static final float StartAngleOffset = -90.0f;

    public static final float getCircularIndicatorDiameter() {
        return CircularIndicatorDiameter;
    }

    public static final float getLinearIndicatorHeight() {
        return LinearIndicatorHeight;
    }

    public static final float getLinearIndicatorWidth() {
        return LinearIndicatorWidth;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* renamed from: LinearProgressIndicator-_5eSR-E  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1498LinearProgressIndicator_5eSRE(float r16, androidx.compose.ui.Modifier r17, long r18, long r20, int r22, androidx.compose.runtime.Composer r23, int r24, int r25) {
        /*
            r1 = r16
            r8 = r24
            r0 = 905419617(0x35f79b61, float:1.8448155E-6)
            r2 = r23
            androidx.compose.runtime.Composer r2 = r2.startRestartGroup(r0)
            java.lang.String r3 = "C(LinearProgressIndicator)P(2,1,0:c#ui.graphics.Color,4:c#ui.graphics.Color,3:c#ui.graphics.StrokeCap)75@3530L11,76@3593L16,84@3883L194,80@3741L336:ProgressIndicator.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r3)
            r3 = r25 & 1
            r4 = 4
            if (r3 == 0) goto L_0x001a
            r3 = r8 | 6
            goto L_0x002a
        L_0x001a:
            r3 = r8 & 14
            if (r3 != 0) goto L_0x0029
            boolean r3 = r2.changed((float) r1)
            if (r3 == 0) goto L_0x0026
            r3 = r4
            goto L_0x0027
        L_0x0026:
            r3 = 2
        L_0x0027:
            r3 = r3 | r8
            goto L_0x002a
        L_0x0029:
            r3 = r8
        L_0x002a:
            r5 = r25 & 2
            if (r5 == 0) goto L_0x0031
            r3 = r3 | 48
            goto L_0x0044
        L_0x0031:
            r6 = r8 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0044
            r6 = r17
            boolean r7 = r2.changed((java.lang.Object) r6)
            if (r7 == 0) goto L_0x0040
            r7 = 32
            goto L_0x0042
        L_0x0040:
            r7 = 16
        L_0x0042:
            r3 = r3 | r7
            goto L_0x0046
        L_0x0044:
            r6 = r17
        L_0x0046:
            r7 = r8 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x005d
            r7 = r25 & 4
            r9 = r18
            if (r7 != 0) goto L_0x0059
            boolean r7 = r2.changed((long) r9)
            if (r7 == 0) goto L_0x0059
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0059:
            r7 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r3 = r3 | r7
            goto L_0x005f
        L_0x005d:
            r9 = r18
        L_0x005f:
            r7 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0076
            r7 = r25 & 8
            r11 = r20
            if (r7 != 0) goto L_0x0072
            boolean r7 = r2.changed((long) r11)
            if (r7 == 0) goto L_0x0072
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x0074
        L_0x0072:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x0074:
            r3 = r3 | r7
            goto L_0x0078
        L_0x0076:
            r11 = r20
        L_0x0078:
            r7 = r25 & 16
            if (r7 == 0) goto L_0x007f
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0094
        L_0x007f:
            r13 = 57344(0xe000, float:8.0356E-41)
            r13 = r13 & r8
            if (r13 != 0) goto L_0x0094
            r13 = r22
            boolean r14 = r2.changed((int) r13)
            if (r14 == 0) goto L_0x0090
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0092
        L_0x0090:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x0092:
            r3 = r3 | r14
            goto L_0x0096
        L_0x0094:
            r13 = r22
        L_0x0096:
            r14 = 46811(0xb6db, float:6.5596E-41)
            r3 = r3 & r14
            r14 = 9362(0x2492, float:1.3119E-41)
            if (r3 != r14) goto L_0x00ac
            boolean r3 = r2.getSkipping()
            if (r3 != 0) goto L_0x00a5
            goto L_0x00ac
        L_0x00a5:
            r2.skipToGroupEnd()
        L_0x00a8:
            r3 = r9
            r7 = r13
            goto L_0x017a
        L_0x00ac:
            r2.startDefaults()
            r3 = r8 & 1
            if (r3 == 0) goto L_0x00be
            boolean r3 = r2.getDefaultsInvalid()
            if (r3 == 0) goto L_0x00ba
            goto L_0x00be
        L_0x00ba:
            r2.skipToGroupEnd()
            goto L_0x00e3
        L_0x00be:
            if (r5 == 0) goto L_0x00c5
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r3 = (androidx.compose.ui.Modifier) r3
            r6 = r3
        L_0x00c5:
            r3 = r25 & 4
            r5 = 6
            if (r3 == 0) goto L_0x00d0
            androidx.compose.material3.ProgressIndicatorDefaults r3 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE
            long r9 = r3.getLinearColor(r2, r5)
        L_0x00d0:
            r3 = r25 & 8
            if (r3 == 0) goto L_0x00da
            androidx.compose.material3.ProgressIndicatorDefaults r3 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE
            long r11 = r3.getLinearTrackColor(r2, r5)
        L_0x00da:
            if (r7 == 0) goto L_0x00e3
            androidx.compose.material3.ProgressIndicatorDefaults r3 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE
            int r3 = r3.m1491getLinearStrokeCapKaPHkGw()
            r13 = r3
        L_0x00e3:
            r2.endDefaults()
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L_0x00f3
            r3 = -1
            java.lang.String r5 = "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:72)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r8, r3, r5)
        L_0x00f3:
            r0 = 0
            r3 = 1065353216(0x3f800000, float:1.0)
            float r0 = kotlin.ranges.RangesKt.coerceIn((float) r1, (float) r0, (float) r3)
            r3 = 0
            r5 = 0
            r7 = 6
            r14 = 0
            r17 = r6
            r18 = r0
            r19 = r3
            r20 = r5
            r21 = r7
            r22 = r14
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.ProgressSemanticsKt.progressSemantics$default(r17, r18, r19, r20, r21, r22)
            float r5 = LinearIndicatorWidth
            float r7 = LinearIndicatorHeight
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.SizeKt.m565sizeVpY3zN4(r3, r5, r7)
            androidx.compose.ui.graphics.Color r5 = androidx.compose.ui.graphics.Color.m2811boximpl(r11)
            androidx.compose.ui.graphics.StrokeCap r7 = androidx.compose.ui.graphics.StrokeCap.m3197boximpl(r13)
            java.lang.Float r14 = java.lang.Float.valueOf(r0)
            androidx.compose.ui.graphics.Color r15 = androidx.compose.ui.graphics.Color.m2811boximpl(r9)
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r7, r14, r15}
            r7 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r2.startReplaceableGroup(r7)
            java.lang.String r7 = "CC(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r7)
            r7 = 0
            r14 = r7
            r15 = r14
        L_0x0138:
            if (r14 >= r4) goto L_0x0145
            r4 = r5[r14]
            boolean r4 = r2.changed((java.lang.Object) r4)
            r15 = r15 | r4
            int r14 = r14 + 1
            r4 = 4
            goto L_0x0138
        L_0x0145:
            java.lang.Object r4 = r2.rememberedValue()
            if (r15 != 0) goto L_0x0153
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r5 = r5.getEmpty()
            if (r4 != r5) goto L_0x0167
        L_0x0153:
            androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$1$1 r4 = new androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$1$1
            r17 = r4
            r18 = r11
            r20 = r13
            r21 = r0
            r22 = r9
            r17.<init>(r18, r20, r21, r22)
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            r2.updateRememberedValue(r4)
        L_0x0167:
            r2.endReplaceableGroup()
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            androidx.compose.foundation.CanvasKt.Canvas(r3, r4, r2, r7)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x00a8
            androidx.compose.runtime.ComposerKt.traceEventEnd()
            goto L_0x00a8
        L_0x017a:
            androidx.compose.runtime.ScopeUpdateScope r10 = r2.endRestartGroup()
            if (r10 != 0) goto L_0x0181
            goto L_0x0194
        L_0x0181:
            androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$2 r13 = new androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$2
            r0 = r13
            r1 = r16
            r2 = r6
            r5 = r11
            r8 = r24
            r9 = r25
            r0.<init>(r1, r2, r3, r5, r7, r8, r9)
            kotlin.jvm.functions.Function2 r13 = (kotlin.jvm.functions.Function2) r13
            r10.updateScope(r13)
        L_0x0194:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.m1498LinearProgressIndicator_5eSRE(float, androidx.compose.ui.Modifier, long, long, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01e9 A[LOOP:0: B:70:0x01e6->B:72:0x01e9, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0231  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* renamed from: LinearProgressIndicator-2cYBFYY  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1496LinearProgressIndicator2cYBFYY(androidx.compose.ui.Modifier r21, long r22, long r24, int r26, androidx.compose.runtime.Composer r27, int r28, int r29) {
        /*
            r7 = r28
            r0 = -476865359(0xffffffffe3939cb1, float:-5.4459244E21)
            r1 = r27
            androidx.compose.runtime.Composer r1 = r1.startRestartGroup(r0)
            java.lang.String r2 = "C(LinearProgressIndicator)P(1,0:c#ui.graphics.Color,3:c#ui.graphics.Color,2:c#ui.graphics.StrokeCap)109@5065L11,110@5128L16,113@5249L28,117@5531L319,128@5894L319,139@6258L323,150@6626L323,165@7081L660,161@6954L787:ProgressIndicator.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r2)
            r2 = r29 & 1
            if (r2 == 0) goto L_0x001a
            r3 = r7 | 6
            r4 = r3
            r3 = r21
            goto L_0x002e
        L_0x001a:
            r3 = r7 & 14
            if (r3 != 0) goto L_0x002b
            r3 = r21
            boolean r4 = r1.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x0028
            r4 = 4
            goto L_0x0029
        L_0x0028:
            r4 = 2
        L_0x0029:
            r4 = r4 | r7
            goto L_0x002e
        L_0x002b:
            r3 = r21
            r4 = r7
        L_0x002e:
            r5 = r7 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0047
            r5 = r29 & 2
            if (r5 != 0) goto L_0x0041
            r5 = r22
            boolean r8 = r1.changed((long) r5)
            if (r8 == 0) goto L_0x0043
            r8 = 32
            goto L_0x0045
        L_0x0041:
            r5 = r22
        L_0x0043:
            r8 = 16
        L_0x0045:
            r4 = r4 | r8
            goto L_0x0049
        L_0x0047:
            r5 = r22
        L_0x0049:
            r8 = r7 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x0062
            r8 = r29 & 4
            if (r8 != 0) goto L_0x005c
            r8 = r24
            boolean r10 = r1.changed((long) r8)
            if (r10 == 0) goto L_0x005e
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005c:
            r8 = r24
        L_0x005e:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r4 = r4 | r10
            goto L_0x0064
        L_0x0062:
            r8 = r24
        L_0x0064:
            r10 = r29 & 8
            if (r10 == 0) goto L_0x006b
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x007e
        L_0x006b:
            r11 = r7 & 7168(0x1c00, float:1.0045E-41)
            if (r11 != 0) goto L_0x007e
            r11 = r26
            boolean r12 = r1.changed((int) r11)
            if (r12 == 0) goto L_0x007a
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x007c
        L_0x007a:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x007c:
            r4 = r4 | r12
            goto L_0x0080
        L_0x007e:
            r11 = r26
        L_0x0080:
            r4 = r4 & 5851(0x16db, float:8.199E-42)
            r12 = 1170(0x492, float:1.64E-42)
            if (r4 != r12) goto L_0x0092
            boolean r4 = r1.getSkipping()
            if (r4 != 0) goto L_0x008d
            goto L_0x0092
        L_0x008d:
            r1.skipToGroupEnd()
            goto L_0x0239
        L_0x0092:
            r1.startDefaults()
            r4 = r7 & 1
            if (r4 == 0) goto L_0x00a8
            boolean r4 = r1.getDefaultsInvalid()
            if (r4 == 0) goto L_0x00a0
            goto L_0x00a8
        L_0x00a0:
            r1.skipToGroupEnd()
            r2 = r3
        L_0x00a4:
            r3 = r8
            r18 = r11
            goto L_0x00d1
        L_0x00a8:
            if (r2 == 0) goto L_0x00af
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r2 = (androidx.compose.ui.Modifier) r2
            goto L_0x00b0
        L_0x00af:
            r2 = r3
        L_0x00b0:
            r3 = r29 & 2
            r4 = 6
            if (r3 == 0) goto L_0x00bb
            androidx.compose.material3.ProgressIndicatorDefaults r3 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE
            long r5 = r3.getLinearColor(r1, r4)
        L_0x00bb:
            r3 = r29 & 4
            if (r3 == 0) goto L_0x00c6
            androidx.compose.material3.ProgressIndicatorDefaults r3 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE
            long r3 = r3.getLinearTrackColor(r1, r4)
            r8 = r3
        L_0x00c6:
            if (r10 == 0) goto L_0x00a4
            androidx.compose.material3.ProgressIndicatorDefaults r3 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE
            int r3 = r3.m1491getLinearStrokeCapKaPHkGw()
            r18 = r3
            r3 = r8
        L_0x00d1:
            r1.endDefaults()
            boolean r8 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r8 == 0) goto L_0x00e1
            r8 = -1
            java.lang.String r9 = "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:107)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r7, r8, r9)
        L_0x00e1:
            r0 = 0
            r15 = 0
            r8 = 1
            androidx.compose.animation.core.InfiniteTransition r0 = androidx.compose.animation.core.InfiniteTransitionKt.rememberInfiniteTransition(r0, r1, r15, r8)
            r9 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$1 r8 = androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$1.INSTANCE
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            androidx.compose.animation.core.KeyframesSpec r8 = androidx.compose.animation.core.AnimationSpecKt.keyframes(r8)
            androidx.compose.animation.core.DurationBasedAnimationSpec r8 = (androidx.compose.animation.core.DurationBasedAnimationSpec) r8
            r11 = 0
            r12 = 0
            r14 = 6
            r16 = 0
            r21 = r8
            r22 = r11
            r23 = r12
            r25 = r14
            r26 = r16
            androidx.compose.animation.core.InfiniteRepeatableSpec r11 = androidx.compose.animation.core.AnimationSpecKt.m122infiniteRepeatable9IiC70o$default(r21, r22, r23, r25, r26)
            r12 = 0
            int r8 = androidx.compose.animation.core.InfiniteTransition.$stable
            r8 = r8 | 432(0x1b0, float:6.05E-43)
            int r13 = androidx.compose.animation.core.InfiniteRepeatableSpec.$stable
            int r13 = r13 << 9
            r14 = r8 | r13
            r16 = 8
            r8 = r0
            r13 = r1
            r7 = r15
            r15 = r16
            androidx.compose.runtime.State r16 = androidx.compose.animation.core.InfiniteTransitionKt.animateFloat(r8, r9, r10, r11, r12, r13, r14, r15)
            androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$firstLineTail$1 r8 = androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$firstLineTail$1.INSTANCE
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            androidx.compose.animation.core.KeyframesSpec r8 = androidx.compose.animation.core.AnimationSpecKt.keyframes(r8)
            androidx.compose.animation.core.DurationBasedAnimationSpec r8 = (androidx.compose.animation.core.DurationBasedAnimationSpec) r8
            r11 = 0
            r12 = 0
            r14 = 6
            r15 = 0
            r21 = r8
            r22 = r11
            r23 = r12
            r25 = r14
            r26 = r15
            androidx.compose.animation.core.InfiniteRepeatableSpec r11 = androidx.compose.animation.core.AnimationSpecKt.m122infiniteRepeatable9IiC70o$default(r21, r22, r23, r25, r26)
            r12 = 0
            int r8 = androidx.compose.animation.core.InfiniteTransition.$stable
            r8 = r8 | 432(0x1b0, float:6.05E-43)
            int r13 = androidx.compose.animation.core.InfiniteRepeatableSpec.$stable
            int r13 = r13 << 9
            r14 = r8 | r13
            r15 = 8
            r8 = r0
            r13 = r1
            androidx.compose.runtime.State r17 = androidx.compose.animation.core.InfiniteTransitionKt.animateFloat(r8, r9, r10, r11, r12, r13, r14, r15)
            androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$secondLineHead$1 r8 = androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$secondLineHead$1.INSTANCE
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            androidx.compose.animation.core.KeyframesSpec r8 = androidx.compose.animation.core.AnimationSpecKt.keyframes(r8)
            androidx.compose.animation.core.DurationBasedAnimationSpec r8 = (androidx.compose.animation.core.DurationBasedAnimationSpec) r8
            r11 = 0
            r12 = 0
            r14 = 6
            r15 = 0
            r21 = r8
            r22 = r11
            r23 = r12
            r25 = r14
            r26 = r15
            androidx.compose.animation.core.InfiniteRepeatableSpec r11 = androidx.compose.animation.core.AnimationSpecKt.m122infiniteRepeatable9IiC70o$default(r21, r22, r23, r25, r26)
            r12 = 0
            int r8 = androidx.compose.animation.core.InfiniteTransition.$stable
            r8 = r8 | 432(0x1b0, float:6.05E-43)
            int r13 = androidx.compose.animation.core.InfiniteRepeatableSpec.$stable
            int r13 = r13 << 9
            r14 = r8 | r13
            r15 = 8
            r8 = r0
            r13 = r1
            androidx.compose.runtime.State r19 = androidx.compose.animation.core.InfiniteTransitionKt.animateFloat(r8, r9, r10, r11, r12, r13, r14, r15)
            androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$1 r8 = androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$1.INSTANCE
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            androidx.compose.animation.core.KeyframesSpec r8 = androidx.compose.animation.core.AnimationSpecKt.keyframes(r8)
            androidx.compose.animation.core.DurationBasedAnimationSpec r8 = (androidx.compose.animation.core.DurationBasedAnimationSpec) r8
            r11 = 0
            r12 = 0
            r14 = 6
            r15 = 0
            r21 = r8
            r22 = r11
            r23 = r12
            r25 = r14
            r26 = r15
            androidx.compose.animation.core.InfiniteRepeatableSpec r11 = androidx.compose.animation.core.AnimationSpecKt.m122infiniteRepeatable9IiC70o$default(r21, r22, r23, r25, r26)
            r12 = 0
            int r8 = androidx.compose.animation.core.InfiniteTransition.$stable
            r8 = r8 | 432(0x1b0, float:6.05E-43)
            int r13 = androidx.compose.animation.core.InfiniteRepeatableSpec.$stable
            int r13 = r13 << 9
            r14 = r8 | r13
            r15 = 8
            r8 = r0
            r13 = r1
            androidx.compose.runtime.State r0 = androidx.compose.animation.core.InfiniteTransitionKt.animateFloat(r8, r9, r10, r11, r12, r13, r14, r15)
            androidx.compose.ui.Modifier r8 = androidx.compose.foundation.ProgressSemanticsKt.progressSemantics(r2)
            float r9 = LinearIndicatorWidth
            float r10 = LinearIndicatorHeight
            androidx.compose.ui.Modifier r14 = androidx.compose.foundation.layout.SizeKt.m565sizeVpY3zN4(r8, r9, r10)
            androidx.compose.ui.graphics.Color r8 = androidx.compose.ui.graphics.Color.m2811boximpl(r3)
            androidx.compose.ui.graphics.StrokeCap r9 = androidx.compose.ui.graphics.StrokeCap.m3197boximpl(r18)
            androidx.compose.ui.graphics.Color r10 = androidx.compose.ui.graphics.Color.m2811boximpl(r5)
            r21 = r8
            r22 = r9
            r23 = r16
            r24 = r17
            r25 = r10
            r26 = r19
            r27 = r0
            java.lang.Object[] r8 = new java.lang.Object[]{r21, r22, r23, r24, r25, r26, r27}
            r9 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r1.startReplaceableGroup(r9)
            java.lang.String r9 = "CC(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r9)
            r9 = r7
            r15 = r9
        L_0x01e6:
            r10 = 7
            if (r15 >= r10) goto L_0x01f3
            r10 = r8[r15]
            boolean r10 = r1.changed((java.lang.Object) r10)
            r9 = r9 | r10
            int r15 = r15 + 1
            goto L_0x01e6
        L_0x01f3:
            java.lang.Object r8 = r1.rememberedValue()
            if (r9 != 0) goto L_0x0206
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r9 = r9.getEmpty()
            if (r8 != r9) goto L_0x0202
            goto L_0x0206
        L_0x0202:
            r21 = r2
            r2 = r14
            goto L_0x0223
        L_0x0206:
            androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$3$1 r20 = new androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$3$1
            r8 = r20
            r9 = r3
            r11 = r18
            r12 = r16
            r13 = r17
            r21 = r2
            r2 = r14
            r14 = r5
            r16 = r19
            r17 = r0
            r8.<init>(r9, r11, r12, r13, r14, r16, r17)
            r8 = r20
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            r1.updateRememberedValue(r8)
        L_0x0223:
            r1.endReplaceableGroup()
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            androidx.compose.foundation.CanvasKt.Canvas(r2, r8, r1, r7)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0234
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0234:
            r8 = r3
            r11 = r18
            r3 = r21
        L_0x0239:
            androidx.compose.runtime.ScopeUpdateScope r10 = r1.endRestartGroup()
            if (r10 != 0) goto L_0x0240
            goto L_0x0253
        L_0x0240:
            androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$4 r12 = new androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$4
            r0 = r12
            r1 = r3
            r2 = r5
            r4 = r8
            r6 = r11
            r7 = r28
            r8 = r29
            r0.<init>(r1, r2, r4, r6, r7, r8)
            kotlin.jvm.functions.Function2 r12 = (kotlin.jvm.functions.Function2) r12
            r10.updateScope(r12)
        L_0x0253:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.m1496LinearProgressIndicator2cYBFYY(androidx.compose.ui.Modifier, long, long, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: LinearProgressIndicator-eaDK9VM  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void m1499LinearProgressIndicatoreaDK9VM(float r20, androidx.compose.ui.Modifier r21, long r22, long r24, androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            r7 = r27
            r0 = -372717133(0xffffffffe9c8c9b3, float:-3.0342208E25)
            r1 = r26
            androidx.compose.runtime.Composer r1 = r1.startRestartGroup(r0)
            java.lang.String r2 = "C(LinearProgressIndicator)P(2,1,0:c#ui.graphics.Color,3:c#ui.graphics.Color)194@7971L11,195@8034L16,196@8056L140:ProgressIndicator.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r2)
            r2 = r28 & 1
            if (r2 == 0) goto L_0x001a
            r2 = r7 | 6
            r3 = r2
            r2 = r20
            goto L_0x002e
        L_0x001a:
            r2 = r7 & 14
            if (r2 != 0) goto L_0x002b
            r2 = r20
            boolean r3 = r1.changed((float) r2)
            if (r3 == 0) goto L_0x0028
            r3 = 4
            goto L_0x0029
        L_0x0028:
            r3 = 2
        L_0x0029:
            r3 = r3 | r7
            goto L_0x002e
        L_0x002b:
            r2 = r20
            r3 = r7
        L_0x002e:
            r4 = r28 & 2
            if (r4 == 0) goto L_0x0035
            r3 = r3 | 48
            goto L_0x0048
        L_0x0035:
            r5 = r7 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0048
            r5 = r21
            boolean r6 = r1.changed((java.lang.Object) r5)
            if (r6 == 0) goto L_0x0044
            r6 = 32
            goto L_0x0046
        L_0x0044:
            r6 = 16
        L_0x0046:
            r3 = r3 | r6
            goto L_0x004a
        L_0x0048:
            r5 = r21
        L_0x004a:
            r6 = r7 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0061
            r6 = r28 & 4
            r8 = r22
            if (r6 != 0) goto L_0x005d
            boolean r6 = r1.changed((long) r8)
            if (r6 == 0) goto L_0x005d
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005d:
            r6 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r3 = r3 | r6
            goto L_0x0063
        L_0x0061:
            r8 = r22
        L_0x0063:
            r6 = r7 & 7168(0x1c00, float:1.0045E-41)
            if (r6 != 0) goto L_0x007a
            r6 = r28 & 8
            r10 = r24
            if (r6 != 0) goto L_0x0076
            boolean r6 = r1.changed((long) r10)
            if (r6 == 0) goto L_0x0076
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x0078
        L_0x0076:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x0078:
            r3 = r3 | r6
            goto L_0x007c
        L_0x007a:
            r10 = r24
        L_0x007c:
            r6 = r3 & 5851(0x16db, float:8.199E-42)
            r12 = 1170(0x492, float:1.64E-42)
            if (r6 != r12) goto L_0x0090
            boolean r6 = r1.getSkipping()
            if (r6 != 0) goto L_0x0089
            goto L_0x0090
        L_0x0089:
            r1.skipToGroupEnd()
            r4 = r5
            r5 = r10
            goto L_0x0113
        L_0x0090:
            r1.startDefaults()
            r6 = r7 & 1
            if (r6 == 0) goto L_0x00af
            boolean r6 = r1.getDefaultsInvalid()
            if (r6 == 0) goto L_0x009e
            goto L_0x00af
        L_0x009e:
            r1.skipToGroupEnd()
            r4 = r28 & 4
            if (r4 == 0) goto L_0x00a7
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00a7:
            r4 = r28 & 8
            if (r4 == 0) goto L_0x00ad
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00ad:
            r4 = r5
            goto L_0x00d4
        L_0x00af:
            if (r4 == 0) goto L_0x00b6
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r4 = (androidx.compose.ui.Modifier) r4
            goto L_0x00b7
        L_0x00b6:
            r4 = r5
        L_0x00b7:
            r5 = r28 & 4
            r6 = 6
            if (r5 == 0) goto L_0x00c4
            androidx.compose.material3.ProgressIndicatorDefaults r5 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE
            long r8 = r5.getLinearColor(r1, r6)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00c4:
            r5 = r28 & 8
            if (r5 == 0) goto L_0x00d4
            androidx.compose.material3.ProgressIndicatorDefaults r5 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE
            long r5 = r5.getLinearTrackColor(r1, r6)
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            r18 = r5
            r5 = r8
            goto L_0x00d7
        L_0x00d4:
            r5 = r8
            r18 = r10
        L_0x00d7:
            r1.endDefaults()
            boolean r8 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r8 == 0) goto L_0x00e7
            r8 = -1
            java.lang.String r9 = "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:191)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r3, r8, r9)
        L_0x00e7:
            androidx.compose.material3.ProgressIndicatorDefaults r0 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE
            int r14 = r0.m1491getLinearStrokeCapKaPHkGw()
            r0 = r3 & 14
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            r8 = r3 & 112(0x70, float:1.57E-43)
            r0 = r0 | r8
            r8 = r3 & 896(0x380, float:1.256E-42)
            r0 = r0 | r8
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r16 = r0 | r3
            r17 = 0
            r8 = r20
            r9 = r4
            r10 = r5
            r12 = r18
            r15 = r1
            m1498LinearProgressIndicator_5eSRE(r8, r9, r10, r12, r14, r15, r16, r17)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0110
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0110:
            r8 = r5
            r5 = r18
        L_0x0113:
            androidx.compose.runtime.ScopeUpdateScope r10 = r1.endRestartGroup()
            if (r10 != 0) goto L_0x011a
            goto L_0x012d
        L_0x011a:
            androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$5 r11 = new androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$5
            r0 = r11
            r1 = r20
            r2 = r4
            r3 = r8
            r7 = r27
            r8 = r28
            r0.<init>(r1, r2, r3, r5, r7, r8)
            kotlin.jvm.functions.Function2 r11 = (kotlin.jvm.functions.Function2) r11
            r10.updateScope(r11)
        L_0x012d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.m1499LinearProgressIndicatoreaDK9VM(float, androidx.compose.ui.Modifier, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: LinearProgressIndicator-RIQooxk  reason: not valid java name */
    public static final /* synthetic */ void m1497LinearProgressIndicatorRIQooxk(Modifier modifier, long j, long j2, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        long j3;
        long j4;
        long j5;
        Modifier modifier3;
        int i4 = i;
        Composer startRestartGroup = composer.startRestartGroup(585576195);
        ComposerKt.sourceInformation(startRestartGroup, "C(LinearProgressIndicator)P(1,0:c#ui.graphics.Color,2:c#ui.graphics.Color)208@8403L11,209@8466L16,210@8488L126:ProgressIndicator.kt#uh7d8r");
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i4 | 6;
            modifier2 = modifier;
        } else if ((i4 & 14) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed((Object) modifier2) ? 4 : 2) | i4;
        } else {
            modifier2 = modifier;
            i3 = i4;
        }
        if ((i4 & 112) == 0) {
            j3 = j;
            i3 |= ((i2 & 2) != 0 || !startRestartGroup.changed(j3)) ? 16 : 32;
        } else {
            j3 = j;
        }
        if ((i4 & 896) == 0) {
            j4 = j2;
            i3 |= ((i2 & 4) != 0 || !startRestartGroup.changed(j4)) ? 128 : 256;
        } else {
            j4 = j2;
        }
        if ((i3 & 731) != 146 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startDefaults();
            if ((i4 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                modifier3 = i5 != 0 ? Modifier.Companion : modifier2;
                if ((i2 & 2) != 0) {
                    j3 = ProgressIndicatorDefaults.INSTANCE.getLinearColor(startRestartGroup, 6);
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    j4 = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(startRestartGroup, 6);
                    i3 &= -897;
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                modifier3 = modifier2;
            }
            int i6 = i3;
            j5 = j3;
            long j6 = j4;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(585576195, i6, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:206)");
            }
            m1496LinearProgressIndicator2cYBFYY(modifier3, j5, j6, ProgressIndicatorDefaults.INSTANCE.m1491getLinearStrokeCapKaPHkGw(), startRestartGroup, (i6 & 14) | 3072 | (i6 & 112) | (i6 & 896), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            j4 = j6;
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            j5 = j3;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ProgressIndicatorKt$LinearProgressIndicator$6(modifier3, j5, j4, i, i2));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: drawLinearIndicator-qYKTg0g  reason: not valid java name */
    public static final void m1509drawLinearIndicatorqYKTg0g(DrawScope drawScope, float f, float f2, long j, float f3, int i) {
        float r0 = Size.m2641getWidthimpl(drawScope.m3429getSizeNHjbRc());
        float r1 = Size.m2638getHeightimpl(drawScope.m3429getSizeNHjbRc());
        float f4 = (float) 2;
        float f5 = r1 / f4;
        boolean z = drawScope.getLayoutDirection() == LayoutDirection.Ltr;
        float f6 = (z ? f : 1.0f - f2) * r0;
        float f7 = (z ? f2 : 1.0f - f) * r0;
        if (StrokeCap.m3200equalsimpl0(i, StrokeCap.Companion.m3204getButtKaPHkGw()) || r1 > r0) {
            DrawScope.m3397drawLineNGM6Ib0$default(drawScope, j, OffsetKt.Offset(f6, f5), OffsetKt.Offset(f7, f5), f3, 0, (PathEffect) null, 0.0f, (ColorFilter) null, 0, 496, (Object) null);
            return;
        }
        float f8 = f3 / f4;
        ClosedFloatingPointRange rangeTo = RangesKt.rangeTo(f8, r0 - f8);
        float floatValue = ((Number) RangesKt.coerceIn(Float.valueOf(f6), rangeTo)).floatValue();
        float floatValue2 = ((Number) RangesKt.coerceIn(Float.valueOf(f7), rangeTo)).floatValue();
        if (Math.abs(f2 - f) > 0.0f) {
            DrawScope.m3397drawLineNGM6Ib0$default(drawScope, j, OffsetKt.Offset(floatValue, f5), OffsetKt.Offset(floatValue2, f5), f3, i, (PathEffect) null, 0.0f, (ColorFilter) null, 0, 480, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: drawLinearIndicatorTrack-AZGd3zU  reason: not valid java name */
    public static final void m1510drawLinearIndicatorTrackAZGd3zU(DrawScope drawScope, long j, float f, int i) {
        m1509drawLinearIndicatorqYKTg0g(drawScope, 0.0f, 1.0f, j, f, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* renamed from: CircularProgressIndicator-DUhRLBM  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1492CircularProgressIndicatorDUhRLBM(float r18, androidx.compose.ui.Modifier r19, long r20, float r22, long r23, int r25, androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            r1 = r18
            r9 = r27
            r0 = -1472321743(0xffffffffa83e2731, float:-1.0555617E-14)
            r2 = r26
            androidx.compose.runtime.Composer r2 = r2.startRestartGroup(r0)
            java.lang.String r3 = "C(CircularProgressIndicator)P(2,1,0:c#ui.graphics.Color,4:c#ui.unit.Dp,5:c#ui.graphics.Color,3:c#ui.graphics.StrokeCap)289@11687L13,291@11821L18,*295@12015L7,298@12096L365:ProgressIndicator.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r3)
            r3 = r28 & 1
            if (r3 == 0) goto L_0x0019
            r3 = r9 | 6
            goto L_0x0029
        L_0x0019:
            r3 = r9 & 14
            if (r3 != 0) goto L_0x0028
            boolean r3 = r2.changed((float) r1)
            if (r3 == 0) goto L_0x0025
            r3 = 4
            goto L_0x0026
        L_0x0025:
            r3 = 2
        L_0x0026:
            r3 = r3 | r9
            goto L_0x0029
        L_0x0028:
            r3 = r9
        L_0x0029:
            r4 = r28 & 2
            if (r4 == 0) goto L_0x0030
            r3 = r3 | 48
            goto L_0x0043
        L_0x0030:
            r5 = r9 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0043
            r5 = r19
            boolean r6 = r2.changed((java.lang.Object) r5)
            if (r6 == 0) goto L_0x003f
            r6 = 32
            goto L_0x0041
        L_0x003f:
            r6 = 16
        L_0x0041:
            r3 = r3 | r6
            goto L_0x0045
        L_0x0043:
            r5 = r19
        L_0x0045:
            r6 = r9 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x005e
            r6 = r28 & 4
            if (r6 != 0) goto L_0x0058
            r6 = r20
            boolean r8 = r2.changed((long) r6)
            if (r8 == 0) goto L_0x005a
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005c
        L_0x0058:
            r6 = r20
        L_0x005a:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005c:
            r3 = r3 | r8
            goto L_0x0060
        L_0x005e:
            r6 = r20
        L_0x0060:
            r8 = r28 & 8
            if (r8 == 0) goto L_0x0067
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x007a
        L_0x0067:
            r10 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r10 != 0) goto L_0x007a
            r10 = r22
            boolean r11 = r2.changed((float) r10)
            if (r11 == 0) goto L_0x0076
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0078
        L_0x0076:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0078:
            r3 = r3 | r11
            goto L_0x007c
        L_0x007a:
            r10 = r22
        L_0x007c:
            r11 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r9
            if (r11 != 0) goto L_0x0097
            r11 = r28 & 16
            if (r11 != 0) goto L_0x0091
            r11 = r23
            boolean r13 = r2.changed((long) r11)
            if (r13 == 0) goto L_0x0093
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0095
        L_0x0091:
            r11 = r23
        L_0x0093:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0095:
            r3 = r3 | r13
            goto L_0x0099
        L_0x0097:
            r11 = r23
        L_0x0099:
            r13 = r28 & 32
            if (r13 == 0) goto L_0x00a1
            r14 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r14
            goto L_0x00b5
        L_0x00a1:
            r14 = 458752(0x70000, float:6.42848E-40)
            r14 = r14 & r9
            if (r14 != 0) goto L_0x00b5
            r14 = r25
            boolean r15 = r2.changed((int) r14)
            if (r15 == 0) goto L_0x00b1
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b3
        L_0x00b1:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00b3:
            r3 = r3 | r15
            goto L_0x00b7
        L_0x00b5:
            r14 = r25
        L_0x00b7:
            r15 = 374491(0x5b6db, float:5.24774E-40)
            r3 = r3 & r15
            r15 = 74898(0x12492, float:1.04954E-40)
            if (r3 != r15) goto L_0x00cf
            boolean r3 = r2.getSkipping()
            if (r3 != 0) goto L_0x00c7
            goto L_0x00cf
        L_0x00c7:
            r2.skipToGroupEnd()
        L_0x00ca:
            r3 = r6
            r6 = r11
            r8 = r14
            goto L_0x0193
        L_0x00cf:
            r2.startDefaults()
            r3 = r9 & 1
            if (r3 == 0) goto L_0x00e1
            boolean r3 = r2.getDefaultsInvalid()
            if (r3 == 0) goto L_0x00dd
            goto L_0x00e1
        L_0x00dd:
            r2.skipToGroupEnd()
            goto L_0x0110
        L_0x00e1:
            if (r4 == 0) goto L_0x00e8
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r3 = (androidx.compose.ui.Modifier) r3
            r5 = r3
        L_0x00e8:
            r3 = r28 & 4
            r4 = 6
            if (r3 == 0) goto L_0x00f3
            androidx.compose.material3.ProgressIndicatorDefaults r3 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE
            long r6 = r3.getCircularColor(r2, r4)
        L_0x00f3:
            if (r8 == 0) goto L_0x00fc
            androidx.compose.material3.ProgressIndicatorDefaults r3 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE
            float r3 = r3.m1490getCircularStrokeWidthD9Ej5fM()
            r10 = r3
        L_0x00fc:
            r3 = r28 & 16
            if (r3 == 0) goto L_0x0107
            androidx.compose.material3.ProgressIndicatorDefaults r3 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE
            long r3 = r3.getCircularTrackColor(r2, r4)
            r11 = r3
        L_0x0107:
            if (r13 == 0) goto L_0x0110
            androidx.compose.material3.ProgressIndicatorDefaults r3 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE
            int r3 = r3.m1488getCircularDeterminateStrokeCapKaPHkGw()
            r14 = r3
        L_0x0110:
            r2.endDefaults()
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L_0x0120
            r3 = -1
            java.lang.String r4 = "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:286)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r9, r3, r4)
        L_0x0120:
            r0 = 0
            r3 = 1065353216(0x3f800000, float:1.0)
            float r0 = kotlin.ranges.RangesKt.coerceIn((float) r1, (float) r0, (float) r3)
            androidx.compose.runtime.ProvidableCompositionLocal r3 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r3 = (androidx.compose.runtime.CompositionLocal) r3
            r4 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r8 = "CC:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r4, r8)
            java.lang.Object r3 = r2.consume(r3)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.ui.unit.Density r3 = (androidx.compose.ui.unit.Density) r3
            androidx.compose.ui.graphics.drawscope.Stroke r4 = new androidx.compose.ui.graphics.drawscope.Stroke
            float r3 = r3.m5607toPx0680j_4(r10)
            r8 = 0
            r13 = 0
            r15 = 0
            r16 = 26
            r17 = 0
            r19 = r4
            r20 = r3
            r21 = r8
            r22 = r14
            r23 = r13
            r24 = r15
            r25 = r16
            r26 = r17
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)
            r3 = 0
            r8 = 0
            r13 = 6
            r19 = r5
            r20 = r0
            r21 = r3
            r22 = r8
            r23 = r13
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.ProgressSemanticsKt.progressSemantics$default(r19, r20, r21, r22, r23, r24)
            float r8 = CircularIndicatorDiameter
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.SizeKt.m563size3ABfNKs(r3, r8)
            androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$1 r8 = new androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$1
            r19 = r8
            r21 = r11
            r23 = r4
            r24 = r6
            r19.<init>(r20, r21, r23, r24)
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            r0 = 0
            androidx.compose.foundation.CanvasKt.Canvas(r3, r8, r2, r0)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x00ca
            androidx.compose.runtime.ComposerKt.traceEventEnd()
            goto L_0x00ca
        L_0x0193:
            androidx.compose.runtime.ScopeUpdateScope r11 = r2.endRestartGroup()
            if (r11 != 0) goto L_0x019a
            goto L_0x01ad
        L_0x019a:
            androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$2 r12 = new androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$2
            r0 = r12
            r1 = r18
            r2 = r5
            r5 = r10
            r9 = r27
            r10 = r28
            r0.<init>(r1, r2, r3, r5, r6, r8, r9, r10)
            kotlin.jvm.functions.Function2 r12 = (kotlin.jvm.functions.Function2) r12
            r11.updateScope(r12)
        L_0x01ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.m1492CircularProgressIndicatorDUhRLBM(float, androidx.compose.ui.Modifier, long, float, long, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* renamed from: CircularProgressIndicator-LxG7B9w  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1493CircularProgressIndicatorLxG7B9w(androidx.compose.ui.Modifier r23, long r24, float r26, long r27, int r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            r8 = r31
            r0 = -115871647(0xfffffffff917f061, float:-4.930702E34)
            r1 = r30
            androidx.compose.runtime.Composer r1 = r1.startRestartGroup(r0)
            java.lang.String r2 = "C(CircularProgressIndicator)P(1,0:c#ui.graphics.Color,3:c#ui.unit.Dp,4:c#ui.graphics.Color,2:c#ui.graphics.StrokeCap)330@13521L13,332@13655L18,*335@13799L7,339@13898L28,341@14055L278,353@14447L230,364@14794L345,375@15172L354,386@15531L737:ProgressIndicator.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r2)
            r2 = r32 & 1
            r3 = 2
            if (r2 == 0) goto L_0x001b
            r4 = r8 | 6
            r5 = r4
            r4 = r23
            goto L_0x002f
        L_0x001b:
            r4 = r8 & 14
            if (r4 != 0) goto L_0x002c
            r4 = r23
            boolean r5 = r1.changed((java.lang.Object) r4)
            if (r5 == 0) goto L_0x0029
            r5 = 4
            goto L_0x002a
        L_0x0029:
            r5 = r3
        L_0x002a:
            r5 = r5 | r8
            goto L_0x002f
        L_0x002c:
            r4 = r23
            r5 = r8
        L_0x002f:
            r6 = r8 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0048
            r6 = r32 & 2
            if (r6 != 0) goto L_0x0042
            r6 = r24
            boolean r9 = r1.changed((long) r6)
            if (r9 == 0) goto L_0x0044
            r9 = 32
            goto L_0x0046
        L_0x0042:
            r6 = r24
        L_0x0044:
            r9 = 16
        L_0x0046:
            r5 = r5 | r9
            goto L_0x004a
        L_0x0048:
            r6 = r24
        L_0x004a:
            r9 = r32 & 4
            if (r9 == 0) goto L_0x0051
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x0064
        L_0x0051:
            r10 = r8 & 896(0x380, float:1.256E-42)
            if (r10 != 0) goto L_0x0064
            r10 = r26
            boolean r11 = r1.changed((float) r10)
            if (r11 == 0) goto L_0x0060
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r11 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r5 = r5 | r11
            goto L_0x0066
        L_0x0064:
            r10 = r26
        L_0x0066:
            r11 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r11 != 0) goto L_0x007f
            r11 = r32 & 8
            if (r11 != 0) goto L_0x0079
            r11 = r27
            boolean r13 = r1.changed((long) r11)
            if (r13 == 0) goto L_0x007b
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x0079:
            r11 = r27
        L_0x007b:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r5 = r5 | r13
            goto L_0x0081
        L_0x007f:
            r11 = r27
        L_0x0081:
            r13 = r32 & 16
            if (r13 == 0) goto L_0x0088
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009d
        L_0x0088:
            r14 = 57344(0xe000, float:8.0356E-41)
            r14 = r14 & r8
            if (r14 != 0) goto L_0x009d
            r14 = r29
            boolean r15 = r1.changed((int) r14)
            if (r15 == 0) goto L_0x0099
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009b
        L_0x0099:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x009b:
            r5 = r5 | r15
            goto L_0x009f
        L_0x009d:
            r14 = r29
        L_0x009f:
            r15 = 46811(0xb6db, float:6.5596E-41)
            r5 = r5 & r15
            r15 = 9362(0x2492, float:1.3119E-41)
            if (r5 != r15) goto L_0x00b6
            boolean r5 = r1.getSkipping()
            if (r5 != 0) goto L_0x00ae
            goto L_0x00b6
        L_0x00ae:
            r1.skipToGroupEnd()
            r2 = r6
            r5 = r11
            r7 = r14
            goto L_0x0281
        L_0x00b6:
            r1.startDefaults()
            r5 = r8 & 1
            if (r5 == 0) goto L_0x00cd
            boolean r5 = r1.getDefaultsInvalid()
            if (r5 == 0) goto L_0x00c4
            goto L_0x00cd
        L_0x00c4:
            r1.skipToGroupEnd()
            r2 = r4
        L_0x00c8:
            r4 = r10
            r20 = r11
            r5 = r14
            goto L_0x0100
        L_0x00cd:
            if (r2 == 0) goto L_0x00d4
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r2 = (androidx.compose.ui.Modifier) r2
            goto L_0x00d5
        L_0x00d4:
            r2 = r4
        L_0x00d5:
            r4 = r32 & 2
            r5 = 6
            if (r4 == 0) goto L_0x00e0
            androidx.compose.material3.ProgressIndicatorDefaults r4 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE
            long r6 = r4.getCircularColor(r1, r5)
        L_0x00e0:
            if (r9 == 0) goto L_0x00e9
            androidx.compose.material3.ProgressIndicatorDefaults r4 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE
            float r4 = r4.m1490getCircularStrokeWidthD9Ej5fM()
            r10 = r4
        L_0x00e9:
            r4 = r32 & 8
            if (r4 == 0) goto L_0x00f4
            androidx.compose.material3.ProgressIndicatorDefaults r4 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE
            long r4 = r4.getCircularTrackColor(r1, r5)
            r11 = r4
        L_0x00f4:
            if (r13 == 0) goto L_0x00c8
            androidx.compose.material3.ProgressIndicatorDefaults r4 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE
            int r4 = r4.m1489getCircularIndeterminateStrokeCapKaPHkGw()
            r5 = r4
            r4 = r10
            r20 = r11
        L_0x0100:
            r1.endDefaults()
            boolean r9 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r9 == 0) goto L_0x0110
            r9 = -1
            java.lang.String r10 = "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:328)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r8, r9, r10)
        L_0x0110:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r0 = (androidx.compose.runtime.CompositionLocal) r0
            r9 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r10 = "CC:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r1, r9, r10)
            java.lang.Object r0 = r1.consume(r0)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r1)
            androidx.compose.ui.unit.Density r0 = (androidx.compose.ui.unit.Density) r0
            androidx.compose.ui.graphics.drawscope.Stroke r18 = new androidx.compose.ui.graphics.drawscope.Stroke
            float r0 = r0.m5607toPx0680j_4(r4)
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 26
            r13 = 0
            r23 = r18
            r24 = r0
            r25 = r9
            r26 = r5
            r27 = r10
            r28 = r11
            r29 = r12
            r30 = r13
            r23.<init>(r24, r25, r26, r27, r28, r29, r30)
            r0 = 0
            r15 = 0
            r9 = 1
            androidx.compose.animation.core.InfiniteTransition r19 = androidx.compose.animation.core.InfiniteTransitionKt.rememberInfiniteTransition(r0, r1, r15, r9)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r15)
            r9 = 5
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            kotlin.jvm.internal.IntCompanionObject r9 = kotlin.jvm.internal.IntCompanionObject.INSTANCE
            androidx.compose.animation.core.TwoWayConverter r12 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter((kotlin.jvm.internal.IntCompanionObject) r9)
            r9 = 6660(0x1a04, float:9.333E-42)
            androidx.compose.animation.core.Easing r13 = androidx.compose.animation.core.EasingKt.getLinearEasing()
            androidx.compose.animation.core.TweenSpec r9 = androidx.compose.animation.core.AnimationSpecKt.tween$default(r9, r15, r13, r3, r0)
            androidx.compose.animation.core.DurationBasedAnimationSpec r9 = (androidx.compose.animation.core.DurationBasedAnimationSpec) r9
            r13 = 0
            r16 = 0
            r14 = 6
            r22 = 0
            r23 = r9
            r24 = r13
            r25 = r16
            r27 = r14
            r28 = r22
            androidx.compose.animation.core.InfiniteRepeatableSpec r13 = androidx.compose.animation.core.AnimationSpecKt.m122infiniteRepeatable9IiC70o$default(r23, r24, r25, r27, r28)
            r14 = 0
            int r9 = androidx.compose.animation.core.InfiniteTransition.$stable
            r9 = r9 | 4528(0x11b0, float:6.345E-42)
            int r16 = androidx.compose.animation.core.InfiniteRepeatableSpec.$stable
            int r16 = r16 << 12
            r16 = r9 | r16
            r17 = 16
            r9 = r19
            r15 = r1
            androidx.compose.runtime.State r13 = androidx.compose.animation.core.InfiniteTransitionKt.animateValue(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r9 = 0
            r10 = 1133445120(0x438f0000, float:286.0)
            r11 = 1332(0x534, float:1.867E-42)
            androidx.compose.animation.core.Easing r12 = androidx.compose.animation.core.EasingKt.getLinearEasing()
            r15 = 0
            androidx.compose.animation.core.TweenSpec r0 = androidx.compose.animation.core.AnimationSpecKt.tween$default(r11, r15, r12, r3, r0)
            androidx.compose.animation.core.DurationBasedAnimationSpec r0 = (androidx.compose.animation.core.DurationBasedAnimationSpec) r0
            r3 = 0
            r11 = 0
            r14 = 6
            r16 = 0
            r23 = r0
            r24 = r3
            r25 = r11
            r27 = r14
            r28 = r16
            androidx.compose.animation.core.InfiniteRepeatableSpec r0 = androidx.compose.animation.core.AnimationSpecKt.m122infiniteRepeatable9IiC70o$default(r23, r24, r25, r27, r28)
            int r11 = androidx.compose.animation.core.InfiniteTransition.$stable
            r11 = r11 | 432(0x1b0, float:6.05E-43)
            int r12 = androidx.compose.animation.core.InfiniteRepeatableSpec.$stable
            int r12 = r12 << 9
            r11 = r11 | r12
            r12 = 8
            r23 = r19
            r24 = r9
            r25 = r10
            r26 = r0
            r27 = r3
            r28 = r1
            r29 = r11
            r30 = r12
            androidx.compose.runtime.State r16 = androidx.compose.animation.core.InfiniteTransitionKt.animateFloat(r23, r24, r25, r26, r27, r28, r29, r30)
            r0 = 0
            r3 = 1133576192(0x43910000, float:290.0)
            androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$endAngle$1 r9 = androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$endAngle$1.INSTANCE
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            androidx.compose.animation.core.KeyframesSpec r9 = androidx.compose.animation.core.AnimationSpecKt.keyframes(r9)
            androidx.compose.animation.core.DurationBasedAnimationSpec r9 = (androidx.compose.animation.core.DurationBasedAnimationSpec) r9
            r10 = 0
            r11 = 0
            r17 = 0
            r23 = r9
            r24 = r10
            r25 = r11
            r27 = r14
            r28 = r17
            androidx.compose.animation.core.InfiniteRepeatableSpec r9 = androidx.compose.animation.core.AnimationSpecKt.m122infiniteRepeatable9IiC70o$default(r23, r24, r25, r27, r28)
            int r11 = androidx.compose.animation.core.InfiniteTransition.$stable
            r11 = r11 | 432(0x1b0, float:6.05E-43)
            int r12 = androidx.compose.animation.core.InfiniteRepeatableSpec.$stable
            int r12 = r12 << 9
            r11 = r11 | r12
            r12 = 8
            r23 = r19
            r24 = r0
            r25 = r3
            r26 = r9
            r27 = r10
            r28 = r1
            r29 = r11
            r30 = r12
            androidx.compose.runtime.State r14 = androidx.compose.animation.core.InfiniteTransitionKt.animateFloat(r23, r24, r25, r26, r27, r28, r29, r30)
            androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$startAngle$1 r9 = androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$startAngle$1.INSTANCE
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            androidx.compose.animation.core.KeyframesSpec r9 = androidx.compose.animation.core.AnimationSpecKt.keyframes(r9)
            androidx.compose.animation.core.DurationBasedAnimationSpec r9 = (androidx.compose.animation.core.DurationBasedAnimationSpec) r9
            r11 = 0
            r17 = 6
            r23 = r9
            r24 = r10
            r25 = r11
            r27 = r17
            r28 = r22
            androidx.compose.animation.core.InfiniteRepeatableSpec r9 = androidx.compose.animation.core.AnimationSpecKt.m122infiniteRepeatable9IiC70o$default(r23, r24, r25, r27, r28)
            int r11 = androidx.compose.animation.core.InfiniteTransition.$stable
            r11 = r11 | 432(0x1b0, float:6.05E-43)
            int r12 = androidx.compose.animation.core.InfiniteRepeatableSpec.$stable
            int r12 = r12 << 9
            r11 = r11 | r12
            r12 = 8
            r23 = r19
            r24 = r0
            r25 = r3
            r26 = r9
            r27 = r10
            r28 = r1
            r29 = r11
            r30 = r12
            androidx.compose.runtime.State r0 = androidx.compose.animation.core.InfiniteTransitionKt.animateFloat(r23, r24, r25, r26, r27, r28, r29, r30)
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.ProgressSemanticsKt.progressSemantics(r2)
            float r9 = CircularIndicatorDiameter
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.SizeKt.m563size3ABfNKs(r3, r9)
            androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$3 r22 = new androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$3
            r9 = r22
            r10 = r20
            r12 = r18
            r23 = r2
            r2 = r15
            r15 = r0
            r17 = r4
            r18 = r6
            r9.<init>(r10, r12, r13, r14, r15, r16, r17, r18)
            r0 = r22
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            androidx.compose.foundation.CanvasKt.Canvas(r3, r0, r1, r2)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x027a
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x027a:
            r10 = r4
            r2 = r6
            r4 = r23
            r7 = r5
            r5 = r20
        L_0x0281:
            androidx.compose.runtime.ScopeUpdateScope r11 = r1.endRestartGroup()
            if (r11 != 0) goto L_0x0288
            goto L_0x0299
        L_0x0288:
            androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$4 r12 = new androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$4
            r0 = r12
            r1 = r4
            r4 = r10
            r8 = r31
            r9 = r32
            r0.<init>(r1, r2, r4, r5, r7, r8, r9)
            kotlin.jvm.functions.Function2 r12 = (kotlin.jvm.functions.Function2) r12
            r11.updateScope(r12)
        L_0x0299:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.m1493CircularProgressIndicatorLxG7B9w(androidx.compose.ui.Modifier, long, float, long, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: CircularProgressIndicator-MBs18nI  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void m1494CircularProgressIndicatorMBs18nI(float r20, androidx.compose.ui.Modifier r21, long r22, float r24, androidx.compose.runtime.Composer r25, int r26, int r27) {
        /*
            r6 = r26
            r0 = 402841196(0x1802de6c, float:1.69144E-24)
            r1 = r25
            androidx.compose.runtime.Composer r1 = r1.startRestartGroup(r0)
            java.lang.String r2 = "C(CircularProgressIndicator)P(2,1,0:c#ui.graphics.Color,3:c#ui.unit.Dp)415@16500L13,422@16713L18,417@16587L219:ProgressIndicator.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r2)
            r2 = r27 & 1
            if (r2 == 0) goto L_0x001a
            r2 = r6 | 6
            r3 = r2
            r2 = r20
            goto L_0x002e
        L_0x001a:
            r2 = r6 & 14
            if (r2 != 0) goto L_0x002b
            r2 = r20
            boolean r3 = r1.changed((float) r2)
            if (r3 == 0) goto L_0x0028
            r3 = 4
            goto L_0x0029
        L_0x0028:
            r3 = 2
        L_0x0029:
            r3 = r3 | r6
            goto L_0x002e
        L_0x002b:
            r2 = r20
            r3 = r6
        L_0x002e:
            r4 = r27 & 2
            if (r4 == 0) goto L_0x0035
            r3 = r3 | 48
            goto L_0x0048
        L_0x0035:
            r5 = r6 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0048
            r5 = r21
            boolean r7 = r1.changed((java.lang.Object) r5)
            if (r7 == 0) goto L_0x0044
            r7 = 32
            goto L_0x0046
        L_0x0044:
            r7 = 16
        L_0x0046:
            r3 = r3 | r7
            goto L_0x004a
        L_0x0048:
            r5 = r21
        L_0x004a:
            r7 = r6 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0063
            r7 = r27 & 4
            if (r7 != 0) goto L_0x005d
            r7 = r22
            boolean r9 = r1.changed((long) r7)
            if (r9 == 0) goto L_0x005f
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005d:
            r7 = r22
        L_0x005f:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r3 = r3 | r9
            goto L_0x0065
        L_0x0063:
            r7 = r22
        L_0x0065:
            r9 = r27 & 8
            if (r9 == 0) goto L_0x006c
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x007f
        L_0x006c:
            r10 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r10 != 0) goto L_0x007f
            r10 = r24
            boolean r11 = r1.changed((float) r10)
            if (r11 == 0) goto L_0x007b
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r3 = r3 | r11
            goto L_0x0081
        L_0x007f:
            r10 = r24
        L_0x0081:
            r11 = r3 & 5851(0x16db, float:8.199E-42)
            r12 = 1170(0x492, float:1.64E-42)
            if (r11 != r12) goto L_0x0097
            boolean r11 = r1.getSkipping()
            if (r11 != 0) goto L_0x008e
            goto L_0x0097
        L_0x008e:
            r1.skipToGroupEnd()
            r4 = r5
            r18 = r7
            r5 = r10
            goto L_0x0112
        L_0x0097:
            r1.startDefaults()
            r11 = r6 & 1
            r12 = 6
            if (r11 == 0) goto L_0x00b4
            boolean r11 = r1.getDefaultsInvalid()
            if (r11 == 0) goto L_0x00a6
            goto L_0x00b4
        L_0x00a6:
            r1.skipToGroupEnd()
            r4 = r27 & 4
            if (r4 == 0) goto L_0x00af
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00af:
            r4 = r5
        L_0x00b0:
            r18 = r7
            r5 = r10
            goto L_0x00d2
        L_0x00b4:
            if (r4 == 0) goto L_0x00bb
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r4 = (androidx.compose.ui.Modifier) r4
            goto L_0x00bc
        L_0x00bb:
            r4 = r5
        L_0x00bc:
            r5 = r27 & 4
            if (r5 == 0) goto L_0x00c8
            androidx.compose.material3.ProgressIndicatorDefaults r5 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE
            long r7 = r5.getCircularColor(r1, r12)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00c8:
            if (r9 == 0) goto L_0x00b0
            androidx.compose.material3.ProgressIndicatorDefaults r5 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE
            float r5 = r5.m1490getCircularStrokeWidthD9Ej5fM()
            r18 = r7
        L_0x00d2:
            r1.endDefaults()
            boolean r7 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r7 == 0) goto L_0x00e2
            r7 = -1
            java.lang.String r8 = "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:412)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r3, r7, r8)
        L_0x00e2:
            androidx.compose.material3.ProgressIndicatorDefaults r0 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE
            long r12 = r0.getCircularTrackColor(r1, r12)
            androidx.compose.material3.ProgressIndicatorDefaults r0 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE
            int r14 = r0.m1488getCircularDeterminateStrokeCapKaPHkGw()
            r0 = 196608(0x30000, float:2.75506E-40)
            r7 = r3 & 14
            r0 = r0 | r7
            r7 = r3 & 112(0x70, float:1.57E-43)
            r0 = r0 | r7
            r7 = r3 & 896(0x380, float:1.256E-42)
            r0 = r0 | r7
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r16 = r0 | r3
            r17 = 0
            r7 = r20
            r8 = r4
            r9 = r18
            r11 = r5
            r15 = r1
            m1492CircularProgressIndicatorDUhRLBM(r7, r8, r9, r11, r12, r14, r15, r16, r17)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0112
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0112:
            androidx.compose.runtime.ScopeUpdateScope r8 = r1.endRestartGroup()
            if (r8 != 0) goto L_0x0119
            goto L_0x012d
        L_0x0119:
            androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$5 r9 = new androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$5
            r0 = r9
            r1 = r20
            r2 = r4
            r3 = r18
            r6 = r26
            r7 = r27
            r0.<init>(r1, r2, r3, r5, r6, r7)
            kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
            r8.updateScope(r9)
        L_0x012d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.m1494CircularProgressIndicatorMBs18nI(float, androidx.compose.ui.Modifier, long, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: CircularProgressIndicator-aM-cp0Q  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void m1495CircularProgressIndicatoraMcp0Q(androidx.compose.ui.Modifier r19, long r20, float r22, androidx.compose.runtime.Composer r23, int r24, int r25) {
        /*
            r5 = r24
            r0 = 947193756(0x3875079c, float:5.841964E-5)
            r1 = r23
            androidx.compose.runtime.Composer r1 = r1.startRestartGroup(r0)
            java.lang.String r2 = "C(CircularProgressIndicator)P(1,0:c#ui.graphics.Color,2:c#ui.unit.Dp)430@17015L13,436@17214L18,432@17102L207:ProgressIndicator.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r2)
            r2 = r25 & 1
            if (r2 == 0) goto L_0x001a
            r3 = r5 | 6
            r4 = r3
            r3 = r19
            goto L_0x002e
        L_0x001a:
            r3 = r5 & 14
            if (r3 != 0) goto L_0x002b
            r3 = r19
            boolean r4 = r1.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x0028
            r4 = 4
            goto L_0x0029
        L_0x0028:
            r4 = 2
        L_0x0029:
            r4 = r4 | r5
            goto L_0x002e
        L_0x002b:
            r3 = r19
            r4 = r5
        L_0x002e:
            r6 = r5 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0047
            r6 = r25 & 2
            if (r6 != 0) goto L_0x0041
            r6 = r20
            boolean r8 = r1.changed((long) r6)
            if (r8 == 0) goto L_0x0043
            r8 = 32
            goto L_0x0045
        L_0x0041:
            r6 = r20
        L_0x0043:
            r8 = 16
        L_0x0045:
            r4 = r4 | r8
            goto L_0x0049
        L_0x0047:
            r6 = r20
        L_0x0049:
            r8 = r25 & 4
            if (r8 == 0) goto L_0x0050
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x0063
        L_0x0050:
            r9 = r5 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x0063
            r9 = r22
            boolean r10 = r1.changed((float) r9)
            if (r10 == 0) goto L_0x005f
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r4 = r4 | r10
            goto L_0x0065
        L_0x0063:
            r9 = r22
        L_0x0065:
            r10 = r4 & 731(0x2db, float:1.024E-42)
            r11 = 146(0x92, float:2.05E-43)
            if (r10 != r11) goto L_0x0079
            boolean r10 = r1.getSkipping()
            if (r10 != 0) goto L_0x0072
            goto L_0x0079
        L_0x0072:
            r1.skipToGroupEnd()
            r2 = r3
            r3 = r6
            goto L_0x00f4
        L_0x0079:
            r1.startDefaults()
            r10 = r5 & 1
            r11 = 6
            if (r10 == 0) goto L_0x009a
            boolean r10 = r1.getDefaultsInvalid()
            if (r10 == 0) goto L_0x0088
            goto L_0x009a
        L_0x0088:
            r1.skipToGroupEnd()
            r2 = r25 & 2
            if (r2 == 0) goto L_0x0091
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0091:
            r2 = r3
        L_0x0092:
            r16 = r9
        L_0x0094:
            r17 = r6
            r6 = r4
            r3 = r17
            goto L_0x00b9
        L_0x009a:
            if (r2 == 0) goto L_0x00a1
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r2 = (androidx.compose.ui.Modifier) r2
            goto L_0x00a2
        L_0x00a1:
            r2 = r3
        L_0x00a2:
            r3 = r25 & 2
            if (r3 == 0) goto L_0x00ae
            androidx.compose.material3.ProgressIndicatorDefaults r3 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE
            long r6 = r3.getCircularColor(r1, r11)
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00ae:
            if (r8 == 0) goto L_0x0092
            androidx.compose.material3.ProgressIndicatorDefaults r3 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE
            float r3 = r3.m1490getCircularStrokeWidthD9Ej5fM()
            r16 = r3
            goto L_0x0094
        L_0x00b9:
            r1.endDefaults()
            boolean r7 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r7 == 0) goto L_0x00c9
            r7 = -1
            java.lang.String r8 = "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:428)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r6, r7, r8)
        L_0x00c9:
            androidx.compose.material3.ProgressIndicatorDefaults r0 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE
            long r10 = r0.getCircularTrackColor(r1, r11)
            androidx.compose.material3.ProgressIndicatorDefaults r0 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE
            int r12 = r0.m1489getCircularIndeterminateStrokeCapKaPHkGw()
            r0 = r6 & 14
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            r7 = r6 & 112(0x70, float:1.57E-43)
            r0 = r0 | r7
            r6 = r6 & 896(0x380, float:1.256E-42)
            r14 = r0 | r6
            r15 = 0
            r6 = r2
            r7 = r3
            r9 = r16
            r13 = r1
            m1493CircularProgressIndicatorLxG7B9w(r6, r7, r9, r10, r12, r13, r14, r15)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x00f2
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x00f2:
            r9 = r16
        L_0x00f4:
            androidx.compose.runtime.ScopeUpdateScope r7 = r1.endRestartGroup()
            if (r7 != 0) goto L_0x00fb
            goto L_0x010d
        L_0x00fb:
            androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$6 r8 = new androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$6
            r0 = r8
            r1 = r2
            r2 = r3
            r4 = r9
            r5 = r24
            r6 = r25
            r0.<init>(r1, r2, r4, r5, r6)
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            r7.updateScope(r8)
        L_0x010d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.m1495CircularProgressIndicatoraMcp0Q(androidx.compose.ui.Modifier, long, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: drawCircularIndicator-42QJj7c  reason: not valid java name */
    private static final void m1505drawCircularIndicator42QJj7c(DrawScope drawScope, float f, float f2, long j, Stroke stroke) {
        float f3 = (float) 2;
        float width = stroke.getWidth() / f3;
        float r2 = Size.m2641getWidthimpl(drawScope.m3429getSizeNHjbRc()) - (f3 * width);
        DrawScope.m3390drawArcyD3GUKo$default(drawScope, j, f, f2, false, OffsetKt.Offset(width, width), SizeKt.Size(r2, r2), 0.0f, stroke, (ColorFilter) null, 0, 832, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: drawCircularIndicatorTrack-bw27NRU  reason: not valid java name */
    public static final void m1506drawCircularIndicatorTrackbw27NRU(DrawScope drawScope, long j, Stroke stroke) {
        m1505drawCircularIndicator42QJj7c(drawScope, 0.0f, 360.0f, j, stroke);
    }

    /* access modifiers changed from: private */
    /* renamed from: drawDeterminateCircularIndicator-42QJj7c  reason: not valid java name */
    public static final void m1507drawDeterminateCircularIndicator42QJj7c(DrawScope drawScope, float f, float f2, long j, Stroke stroke) {
        m1505drawCircularIndicator42QJj7c(drawScope, f, f2, j, stroke);
    }

    /* access modifiers changed from: private */
    /* renamed from: drawIndeterminateCircularIndicator-hrjfTZI  reason: not valid java name */
    public static final void m1508drawIndeterminateCircularIndicatorhrjfTZI(DrawScope drawScope, float f, float f2, float f3, long j, Stroke stroke) {
        float f4;
        if (StrokeCap.m3200equalsimpl0(stroke.m3509getCapKaPHkGw(), StrokeCap.Companion.m3204getButtKaPHkGw())) {
            f4 = 0.0f;
        } else {
            f4 = ((f2 / Dp.m5626constructorimpl(CircularIndicatorDiameter / ((float) 2))) * 57.29578f) / 2.0f;
        }
        m1505drawCircularIndicator42QJj7c(drawScope, f + f4, Math.max(f3, 0.1f), j, stroke);
    }
}
