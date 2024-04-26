package androidx.compose.material3;

import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000`\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\u001a}\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u001c\u0010\u0019\u001a\u0018\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000b0\u001a¢\u0006\u0002\b\u001c¢\u0006\u0002\b\u001dH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0001\u0010\n\u001a\u00020\u000b2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0002\b\u001c2\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0002\b\u001c2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001ar\u0010&\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0002\b\u001cH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001ar\u0010)\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0002\b\u001cH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b*\u0010(\u001ar\u0010+\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0002\b\u001cH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b,\u0010(\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\u0002\u001a\u00020\u0003X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\u0007\u001a\u00020\u0003X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\b\u001a\u00020\u0003X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\t\u001a\u00020\u0003X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"ExtendedFabCollapseAnimation", "Landroidx/compose/animation/ExitTransition;", "ExtendedFabEndIconPadding", "Landroidx/compose/ui/unit/Dp;", "F", "ExtendedFabExpandAnimation", "Landroidx/compose/animation/EnterTransition;", "ExtendedFabMinimumWidth", "ExtendedFabStartIconPadding", "ExtendedFabTextPadding", "ExtendedFloatingActionButton", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "shape", "Landroidx/compose/ui/graphics/Shape;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "elevation", "Landroidx/compose/material3/FloatingActionButtonElevation;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "ExtendedFloatingActionButton-X-z6DiA", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "text", "icon", "expanded", "", "ExtendedFloatingActionButton-ElI5-7k", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "FloatingActionButton", "FloatingActionButton-X-z6DiA", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "LargeFloatingActionButton", "LargeFloatingActionButton-X-z6DiA", "SmallFloatingActionButton", "SmallFloatingActionButton-X-z6DiA", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: FloatingActionButton.kt */
public final class FloatingActionButtonKt {
    /* access modifiers changed from: private */
    public static final ExitTransition ExtendedFabCollapseAnimation = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, 0, MotionTokens.INSTANCE.getEasingLinearCubicBezier(), 2, (Object) null), 0.0f, 2, (Object) null).plus(EnterExitTransitionKt.shrinkHorizontally$default(AnimationSpecKt.tween$default(500, 0, MotionTokens.INSTANCE.getEasingEmphasizedCubicBezier(), 2, (Object) null), Alignment.Companion.getStart(), false, (Function1) null, 12, (Object) null));
    /* access modifiers changed from: private */
    public static final float ExtendedFabEndIconPadding = Dp.m5626constructorimpl((float) 12);
    /* access modifiers changed from: private */
    public static final EnterTransition ExtendedFabExpandAnimation = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween(200, 100, MotionTokens.INSTANCE.getEasingLinearCubicBezier()), 0.0f, 2, (Object) null).plus(EnterExitTransitionKt.expandHorizontally$default(AnimationSpecKt.tween$default(500, 0, MotionTokens.INSTANCE.getEasingEmphasizedCubicBezier(), 2, (Object) null), Alignment.Companion.getStart(), false, (Function1) null, 12, (Object) null));
    /* access modifiers changed from: private */
    public static final float ExtendedFabMinimumWidth = Dp.m5626constructorimpl((float) 80);
    /* access modifiers changed from: private */
    public static final float ExtendedFabStartIconPadding = Dp.m5626constructorimpl((float) 16);
    /* access modifiers changed from: private */
    public static final float ExtendedFabTextPadding = Dp.m5626constructorimpl((float) 20);

    /* JADX WARNING: Removed duplicated region for block: B:139:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x011c  */
    /* renamed from: FloatingActionButton-X-z6DiA  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1376FloatingActionButtonXz6DiA(kotlin.jvm.functions.Function0<kotlin.Unit> r26, androidx.compose.ui.Modifier r27, androidx.compose.ui.graphics.Shape r28, long r29, long r31, androidx.compose.material3.FloatingActionButtonElevation r33, androidx.compose.foundation.interaction.MutableInteractionSource r34, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r35, androidx.compose.runtime.Composer r36, int r37, int r38) {
        /*
            r13 = r26
            r11 = r35
            r6 = r37
            r7 = r38
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = -731723913(0xffffffffd462c777, float:-3.89603629E12)
            r1 = r36
            androidx.compose.runtime.Composer r4 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(FloatingActionButton)P(6,5,7,0:c#ui.graphics.Color,2:c#ui.graphics.Color,3,4)98@4887L5,99@4951L14,100@4993L31,101@5102L11,102@5165L39,111@5476L53,112@5573L54,105@5251L1386:FloatingActionButton.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r4, r1)
            r1 = r7 & 1
            if (r1 == 0) goto L_0x0029
            r1 = r6 | 6
            goto L_0x0039
        L_0x0029:
            r1 = r6 & 14
            if (r1 != 0) goto L_0x0038
            boolean r1 = r4.changedInstance(r13)
            if (r1 == 0) goto L_0x0035
            r1 = 4
            goto L_0x0036
        L_0x0035:
            r1 = 2
        L_0x0036:
            r1 = r1 | r6
            goto L_0x0039
        L_0x0038:
            r1 = r6
        L_0x0039:
            r2 = r7 & 2
            if (r2 == 0) goto L_0x0040
            r1 = r1 | 48
            goto L_0x0053
        L_0x0040:
            r3 = r6 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0053
            r3 = r27
            boolean r5 = r4.changed((java.lang.Object) r3)
            if (r5 == 0) goto L_0x004f
            r5 = 32
            goto L_0x0051
        L_0x004f:
            r5 = 16
        L_0x0051:
            r1 = r1 | r5
            goto L_0x0055
        L_0x0053:
            r3 = r27
        L_0x0055:
            r5 = r6 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x006e
            r5 = r7 & 4
            if (r5 != 0) goto L_0x0068
            r5 = r28
            boolean r8 = r4.changed((java.lang.Object) r5)
            if (r8 == 0) goto L_0x006a
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x006c
        L_0x0068:
            r5 = r28
        L_0x006a:
            r8 = 128(0x80, float:1.794E-43)
        L_0x006c:
            r1 = r1 | r8
            goto L_0x0070
        L_0x006e:
            r5 = r28
        L_0x0070:
            r8 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0089
            r8 = r7 & 8
            if (r8 != 0) goto L_0x0083
            r8 = r29
            boolean r10 = r4.changed((long) r8)
            if (r10 == 0) goto L_0x0085
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0087
        L_0x0083:
            r8 = r29
        L_0x0085:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0087:
            r1 = r1 | r10
            goto L_0x008b
        L_0x0089:
            r8 = r29
        L_0x008b:
            r22 = 57344(0xe000, float:8.0356E-41)
            r10 = r6 & r22
            if (r10 != 0) goto L_0x00a5
            r10 = r7 & 16
            r14 = r31
            if (r10 != 0) goto L_0x00a1
            boolean r10 = r4.changed((long) r14)
            if (r10 == 0) goto L_0x00a1
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a3
        L_0x00a1:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x00a3:
            r1 = r1 | r10
            goto L_0x00a7
        L_0x00a5:
            r14 = r31
        L_0x00a7:
            r23 = 458752(0x70000, float:6.42848E-40)
            r10 = r6 & r23
            if (r10 != 0) goto L_0x00c2
            r10 = r7 & 32
            if (r10 != 0) goto L_0x00bc
            r10 = r33
            boolean r12 = r4.changed((java.lang.Object) r10)
            if (r12 == 0) goto L_0x00be
            r12 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c0
        L_0x00bc:
            r10 = r33
        L_0x00be:
            r12 = 65536(0x10000, float:9.18355E-41)
        L_0x00c0:
            r1 = r1 | r12
            goto L_0x00c4
        L_0x00c2:
            r10 = r33
        L_0x00c4:
            r12 = r7 & 64
            if (r12 == 0) goto L_0x00cf
            r16 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r16
            r0 = r34
            goto L_0x00e4
        L_0x00cf:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r6 & r16
            r0 = r34
            if (r16 != 0) goto L_0x00e4
            boolean r16 = r4.changed((java.lang.Object) r0)
            if (r16 == 0) goto L_0x00e0
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e2
        L_0x00e0:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00e2:
            r1 = r1 | r16
        L_0x00e4:
            r0 = r7 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00ec
            r0 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x00ea:
            r1 = r1 | r0
            goto L_0x00fd
        L_0x00ec:
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r0 & r6
            if (r0 != 0) goto L_0x00fd
            boolean r0 = r4.changedInstance(r11)
            if (r0 == 0) goto L_0x00fa
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ea
        L_0x00fa:
            r0 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x00ea
        L_0x00fd:
            r0 = 23967451(0x16db6db, float:4.3661218E-38)
            r0 = r0 & r1
            r3 = 4793490(0x492492, float:6.71711E-39)
            if (r0 != r3) goto L_0x011c
            boolean r0 = r4.getSkipping()
            if (r0 != 0) goto L_0x010d
            goto L_0x011c
        L_0x010d:
            r4.skipToGroupEnd()
            r2 = r27
            r24 = r4
            r3 = r5
            r4 = r8
            r8 = r10
            r6 = r14
            r9 = r34
            goto L_0x027a
        L_0x011c:
            r4.startDefaults()
            r0 = r6 & 1
            r3 = -458753(0xfffffffffff8ffff, float:NaN)
            r16 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x0156
            boolean r0 = r4.getDefaultsInvalid()
            if (r0 == 0) goto L_0x0130
            goto L_0x0156
        L_0x0130:
            r4.skipToGroupEnd()
            r0 = r7 & 4
            if (r0 == 0) goto L_0x0139
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0139:
            r0 = r7 & 8
            if (r0 == 0) goto L_0x013f
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x013f:
            r0 = r7 & 16
            if (r0 == 0) goto L_0x0145
            r1 = r1 & r16
        L_0x0145:
            r0 = r7 & 32
            if (r0 == 0) goto L_0x014a
            r1 = r1 & r3
        L_0x014a:
            r20 = r34
            r0 = r1
            r17 = r5
            r18 = r8
            r3 = r10
            r5 = r27
            goto L_0x01dd
        L_0x0156:
            if (r2 == 0) goto L_0x015d
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            goto L_0x015f
        L_0x015d:
            r0 = r27
        L_0x015f:
            r2 = r7 & 4
            r3 = 6
            if (r2 == 0) goto L_0x016d
            androidx.compose.material3.FloatingActionButtonDefaults r2 = androidx.compose.material3.FloatingActionButtonDefaults.INSTANCE
            androidx.compose.ui.graphics.Shape r2 = r2.getShape(r4, r3)
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
            r5 = r2
        L_0x016d:
            r2 = r7 & 8
            if (r2 == 0) goto L_0x017a
            androidx.compose.material3.FloatingActionButtonDefaults r2 = androidx.compose.material3.FloatingActionButtonDefaults.INSTANCE
            long r2 = r2.getContainerColor(r4, r3)
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
            r8 = r2
        L_0x017a:
            r2 = r7 & 16
            if (r2 == 0) goto L_0x0189
            int r2 = r1 >> 9
            r2 = r2 & 14
            long r2 = androidx.compose.material3.ColorSchemeKt.m1242contentColorForek8zF_U(r8, r4, r2)
            r1 = r1 & r16
            goto L_0x018a
        L_0x0189:
            r2 = r14
        L_0x018a:
            r14 = r7 & 32
            if (r14 == 0) goto L_0x01a5
            androidx.compose.material3.FloatingActionButtonDefaults r14 = androidx.compose.material3.FloatingActionButtonDefaults.INSTANCE
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 24576(0x6000, float:3.4438E-41)
            r21 = 15
            r19 = r4
            androidx.compose.material3.FloatingActionButtonElevation r10 = r14.m1371elevationxZ9QkE(r15, r16, r17, r18, r19, r20, r21)
            r14 = -458753(0xfffffffffff8ffff, float:NaN)
            r1 = r1 & r14
        L_0x01a5:
            if (r12 == 0) goto L_0x01d3
            r12 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r4.startReplaceableGroup(r12)
            java.lang.String r12 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r4, r12)
            java.lang.Object r12 = r4.rememberedValue()
            androidx.compose.runtime.Composer$Companion r14 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r14 = r14.getEmpty()
            if (r12 != r14) goto L_0x01c5
            androidx.compose.foundation.interaction.MutableInteractionSource r12 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r4.updateRememberedValue(r12)
        L_0x01c5:
            r4.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r12 = (androidx.compose.foundation.interaction.MutableInteractionSource) r12
            r14 = r2
            r17 = r5
            r18 = r8
            r3 = r10
            r20 = r12
            goto L_0x01db
        L_0x01d3:
            r20 = r34
            r14 = r2
            r17 = r5
            r18 = r8
            r3 = r10
        L_0x01db:
            r5 = r0
            r0 = r1
        L_0x01dd:
            r4.endDefaults()
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x01f0
            r1 = -1
            java.lang.String r2 = "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:95)"
            r8 = -731723913(0xffffffffd462c777, float:-3.89603629E12)
            androidx.compose.runtime.ComposerKt.traceEventStart(r8, r0, r1, r2)
        L_0x01f0:
            androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$2 r1 = androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$2.INSTANCE
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            r2 = 0
            r8 = 0
            r12 = 1
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(r5, r8, r1, r12, r2)
            r2 = 0
            r9 = r20
            androidx.compose.foundation.interaction.InteractionSource r9 = (androidx.compose.foundation.interaction.InteractionSource) r9
            int r8 = r0 >> 18
            r8 = r8 & 14
            int r10 = r0 >> 12
            r10 = r10 & 112(0x70, float:1.57E-43)
            r10 = r10 | r8
            androidx.compose.runtime.State r8 = r3.tonalElevation$material3_release(r9, r4, r10)
            java.lang.Object r8 = r8.getValue()
            androidx.compose.ui.unit.Dp r8 = (androidx.compose.ui.unit.Dp) r8
            float r8 = r8.m5640unboximpl()
            androidx.compose.runtime.State r9 = r3.shadowElevation$material3_release(r9, r4, r10)
            java.lang.Object r9 = r9.getValue()
            androidx.compose.ui.unit.Dp r9 = (androidx.compose.ui.unit.Dp) r9
            float r9 = r9.m5640unboximpl()
            r10 = 0
            androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$3 r2 = new androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$3
            r2.<init>(r14, r11, r0)
            r10 = 1249316354(0x4a770e02, float:4047744.5)
            androidx.compose.runtime.internal.ComposableLambda r2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r4, r10, r12, r2)
            r12 = r2
            kotlin.jvm.functions.Function2 r12 = (kotlin.jvm.functions.Function2) r12
            r2 = r0 & 14
            int r10 = r0 << 3
            r21 = r3
            r3 = r10 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r3
            r3 = r10 & r22
            r2 = r2 | r3
            r3 = r10 & r23
            r2 = r2 | r3
            r3 = 1879048192(0x70000000, float:1.58456325E29)
            int r0 = r0 << 9
            r0 = r0 & r3
            r0 = r0 | r2
            r22 = r14
            r14 = r0
            r15 = 6
            r16 = 260(0x104, float:3.64E-43)
            r0 = r26
            r3 = r17
            r24 = r4
            r25 = r5
            r4 = r18
            r6 = r22
            r11 = r20
            r13 = r24
            r2 = 0
            r10 = 0
            androidx.compose.material3.SurfaceKt.m1644Surfaceo_FOJdg(r0, r1, r2, r3, r4, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x026e
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x026e:
            r3 = r17
            r4 = r18
            r9 = r20
            r8 = r21
            r6 = r22
            r2 = r25
        L_0x027a:
            androidx.compose.runtime.ScopeUpdateScope r13 = r24.endRestartGroup()
            if (r13 != 0) goto L_0x0281
            goto L_0x0294
        L_0x0281:
            androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$4 r14 = new androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$4
            r0 = r14
            r1 = r26
            r10 = r35
            r11 = r37
            r12 = r38
            r0.<init>(r1, r2, r3, r4, r6, r8, r9, r10, r11, r12)
            kotlin.jvm.functions.Function2 r14 = (kotlin.jvm.functions.Function2) r14
            r13.updateScope(r14)
        L_0x0294:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.FloatingActionButtonKt.m1376FloatingActionButtonXz6DiA(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.material3.FloatingActionButtonElevation, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:135:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x011c  */
    /* renamed from: SmallFloatingActionButton-X-z6DiA  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1378SmallFloatingActionButtonXz6DiA(kotlin.jvm.functions.Function0<kotlin.Unit> r28, androidx.compose.ui.Modifier r29, androidx.compose.ui.graphics.Shape r30, long r31, long r33, androidx.compose.material3.FloatingActionButtonElevation r35, androidx.compose.foundation.interaction.MutableInteractionSource r36, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r37, androidx.compose.runtime.Composer r38, int r39, int r40) {
        /*
            r13 = r28
            r14 = r37
            r15 = r39
            r12 = r40
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            r0 = 1444748300(0x561d1c0c, float:4.3185946E13)
            r1 = r38
            androidx.compose.runtime.Composer r11 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(SmallFloatingActionButton)P(6,5,7,0:c#ui.graphics.Color,2:c#ui.graphics.Color,3,4)166@8483L10,167@8552L14,168@8594L31,169@8703L11,170@8766L39,173@8852L431:FloatingActionButton.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r1)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0029
            r1 = r15 | 6
            goto L_0x0039
        L_0x0029:
            r1 = r15 & 14
            if (r1 != 0) goto L_0x0038
            boolean r1 = r11.changedInstance(r13)
            if (r1 == 0) goto L_0x0035
            r1 = 4
            goto L_0x0036
        L_0x0035:
            r1 = 2
        L_0x0036:
            r1 = r1 | r15
            goto L_0x0039
        L_0x0038:
            r1 = r15
        L_0x0039:
            r2 = r12 & 2
            if (r2 == 0) goto L_0x0040
            r1 = r1 | 48
            goto L_0x0053
        L_0x0040:
            r3 = r15 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0053
            r3 = r29
            boolean r4 = r11.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x004f
            r4 = 32
            goto L_0x0051
        L_0x004f:
            r4 = 16
        L_0x0051:
            r1 = r1 | r4
            goto L_0x0055
        L_0x0053:
            r3 = r29
        L_0x0055:
            r4 = r15 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x006e
            r4 = r12 & 4
            if (r4 != 0) goto L_0x0068
            r4 = r30
            boolean r5 = r11.changed((java.lang.Object) r4)
            if (r5 == 0) goto L_0x006a
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x006c
        L_0x0068:
            r4 = r30
        L_0x006a:
            r5 = 128(0x80, float:1.794E-43)
        L_0x006c:
            r1 = r1 | r5
            goto L_0x0070
        L_0x006e:
            r4 = r30
        L_0x0070:
            r5 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x0089
            r5 = r12 & 8
            if (r5 != 0) goto L_0x0083
            r5 = r31
            boolean r7 = r11.changed((long) r5)
            if (r7 == 0) goto L_0x0085
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x0087
        L_0x0083:
            r5 = r31
        L_0x0085:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x0087:
            r1 = r1 | r7
            goto L_0x008b
        L_0x0089:
            r5 = r31
        L_0x008b:
            r9 = 57344(0xe000, float:8.0356E-41)
            r7 = r15 & r9
            if (r7 != 0) goto L_0x00a7
            r7 = r12 & 16
            if (r7 != 0) goto L_0x00a1
            r7 = r33
            boolean r10 = r11.changed((long) r7)
            if (r10 == 0) goto L_0x00a3
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a5
        L_0x00a1:
            r7 = r33
        L_0x00a3:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x00a5:
            r1 = r1 | r10
            goto L_0x00a9
        L_0x00a7:
            r7 = r33
        L_0x00a9:
            r10 = 458752(0x70000, float:6.42848E-40)
            r16 = r15 & r10
            if (r16 != 0) goto L_0x00c3
            r16 = r12 & 32
            r10 = r35
            if (r16 != 0) goto L_0x00be
            boolean r16 = r11.changed((java.lang.Object) r10)
            if (r16 == 0) goto L_0x00be
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c0
        L_0x00be:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00c0:
            r1 = r1 | r16
            goto L_0x00c5
        L_0x00c3:
            r10 = r35
        L_0x00c5:
            r16 = r12 & 64
            r17 = 3670016(0x380000, float:5.142788E-39)
            if (r16 == 0) goto L_0x00d2
            r18 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r18
            r9 = r36
            goto L_0x00e5
        L_0x00d2:
            r18 = r15 & r17
            r9 = r36
            if (r18 != 0) goto L_0x00e5
            boolean r19 = r11.changed((java.lang.Object) r9)
            if (r19 == 0) goto L_0x00e1
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e3
        L_0x00e1:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x00e3:
            r1 = r1 | r19
        L_0x00e5:
            r0 = r12 & 128(0x80, float:1.794E-43)
            r20 = 29360128(0x1c00000, float:7.052966E-38)
            if (r0 == 0) goto L_0x00ef
            r0 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x00ed:
            r1 = r1 | r0
            goto L_0x00ff
        L_0x00ef:
            r0 = r15 & r20
            if (r0 != 0) goto L_0x00ff
            boolean r0 = r11.changedInstance(r14)
            if (r0 == 0) goto L_0x00fc
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ed
        L_0x00fc:
            r0 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x00ed
        L_0x00ff:
            r0 = 23967451(0x16db6db, float:4.3661218E-38)
            r0 = r0 & r1
            r3 = 4793490(0x492492, float:6.71711E-39)
            if (r0 != r3) goto L_0x011c
            boolean r0 = r11.getSkipping()
            if (r0 != 0) goto L_0x010f
            goto L_0x011c
        L_0x010f:
            r11.skipToGroupEnd()
            r2 = r29
            r3 = r4
            r4 = r5
            r6 = r7
            r8 = r10
            r19 = r11
            goto L_0x0267
        L_0x011c:
            r11.startDefaults()
            r0 = r15 & 1
            r21 = -458753(0xfffffffffff8ffff, float:NaN)
            r3 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x0158
            boolean r0 = r11.getDefaultsInvalid()
            if (r0 == 0) goto L_0x0130
            goto L_0x0158
        L_0x0130:
            r11.skipToGroupEnd()
            r0 = r12 & 4
            if (r0 == 0) goto L_0x0139
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0139:
            r0 = r12 & 8
            if (r0 == 0) goto L_0x013f
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x013f:
            r0 = r12 & 16
            if (r0 == 0) goto L_0x0144
            r1 = r1 & r3
        L_0x0144:
            r0 = r12 & 32
            if (r0 == 0) goto L_0x014a
            r1 = r1 & r21
        L_0x014a:
            r16 = r29
            r23 = r4
            r26 = r5
            r24 = r7
        L_0x0152:
            r22 = r9
        L_0x0154:
            r21 = r10
            goto L_0x01e9
        L_0x0158:
            if (r2 == 0) goto L_0x015f
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            goto L_0x0161
        L_0x015f:
            r0 = r29
        L_0x0161:
            r2 = r12 & 4
            r3 = 6
            if (r2 == 0) goto L_0x0171
            androidx.compose.material3.FloatingActionButtonDefaults r2 = androidx.compose.material3.FloatingActionButtonDefaults.INSTANCE
            androidx.compose.ui.graphics.Shape r2 = r2.getSmallShape(r11, r3)
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
            r23 = r2
            goto L_0x0173
        L_0x0171:
            r23 = r4
        L_0x0173:
            r2 = r12 & 8
            if (r2 == 0) goto L_0x0180
            androidx.compose.material3.FloatingActionButtonDefaults r2 = androidx.compose.material3.FloatingActionButtonDefaults.INSTANCE
            long r2 = r2.getContainerColor(r11, r3)
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
            r5 = r2
        L_0x0180:
            r2 = r12 & 16
            if (r2 == 0) goto L_0x0195
            int r2 = r1 >> 9
            r2 = r2 & 14
            long r2 = androidx.compose.material3.ColorSchemeKt.m1242contentColorForek8zF_U(r5, r11, r2)
            r4 = -57345(0xffffffffffff1fff, float:NaN)
            r1 = r1 & r4
            r22 = r1
            r24 = r2
            goto L_0x0199
        L_0x0195:
            r22 = r1
            r24 = r7
        L_0x0199:
            r1 = r12 & 32
            if (r1 == 0) goto L_0x01b6
            androidx.compose.material3.FloatingActionButtonDefaults r1 = androidx.compose.material3.FloatingActionButtonDefaults.INSTANCE
            r2 = 0
            r3 = 0
            r4 = 0
            r7 = 0
            r8 = 24576(0x6000, float:3.4438E-41)
            r10 = 15
            r26 = r5
            r5 = r7
            r6 = r11
            r7 = r8
            r8 = r10
            androidx.compose.material3.FloatingActionButtonElevation r1 = r1.m1371elevationxZ9QkE(r2, r3, r4, r5, r6, r7, r8)
            r2 = r22 & r21
            r10 = r1
            r1 = r2
            goto L_0x01ba
        L_0x01b6:
            r26 = r5
            r1 = r22
        L_0x01ba:
            if (r16 == 0) goto L_0x01e5
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r11.startReplaceableGroup(r2)
            java.lang.String r2 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r2)
            java.lang.Object r2 = r11.rememberedValue()
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r3 = r3.getEmpty()
            if (r2 != r3) goto L_0x01da
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r11.updateRememberedValue(r2)
        L_0x01da:
            r11.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = (androidx.compose.foundation.interaction.MutableInteractionSource) r2
            r16 = r0
            r22 = r2
            goto L_0x0154
        L_0x01e5:
            r16 = r0
            goto L_0x0152
        L_0x01e9:
            r11.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01fc
            r0 = -1
            java.lang.String r2 = "androidx.compose.material3.SmallFloatingActionButton (FloatingActionButton.kt:163)"
            r3 = 1444748300(0x561d1c0c, float:4.3185946E13)
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r1, r0, r2)
        L_0x01fc:
            androidx.compose.material3.tokens.FabPrimarySmallTokens r0 = androidx.compose.material3.tokens.FabPrimarySmallTokens.INSTANCE
            float r0 = r0.m2025getContainerWidthD9Ej5fM()
            androidx.compose.material3.tokens.FabPrimarySmallTokens r2 = androidx.compose.material3.tokens.FabPrimarySmallTokens.INSTANCE
            float r2 = r2.m2024getContainerHeightD9Ej5fM()
            r3 = 0
            r4 = 0
            r5 = 12
            r6 = 0
            r29 = r16
            r30 = r0
            r31 = r2
            r32 = r3
            r33 = r4
            r34 = r5
            r35 = r6
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.m567sizeInqDBjuR0$default(r29, r30, r31, r32, r33, r34, r35)
            r0 = r1 & 14
            r3 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r3
            r3 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r3
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r1
            r0 = r0 | r3
            r3 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r1
            r0 = r0 | r3
            r3 = r1 & r17
            r0 = r0 | r3
            r1 = r1 & r20
            r17 = r0 | r1
            r18 = 0
            r0 = r28
            r1 = r2
            r2 = r23
            r3 = r26
            r5 = r24
            r7 = r21
            r8 = r22
            r9 = r37
            r10 = r11
            r19 = r11
            r11 = r17
            r12 = r18
            m1376FloatingActionButtonXz6DiA(r0, r1, r2, r3, r5, r7, r8, r9, r10, r11, r12)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x025b
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x025b:
            r2 = r16
            r8 = r21
            r9 = r22
            r3 = r23
            r6 = r24
            r4 = r26
        L_0x0267:
            androidx.compose.runtime.ScopeUpdateScope r12 = r19.endRestartGroup()
            if (r12 != 0) goto L_0x026e
            goto L_0x0285
        L_0x026e:
            androidx.compose.material3.FloatingActionButtonKt$SmallFloatingActionButton$2 r16 = new androidx.compose.material3.FloatingActionButtonKt$SmallFloatingActionButton$2
            r0 = r16
            r1 = r28
            r10 = r37
            r11 = r39
            r13 = r12
            r12 = r40
            r0.<init>(r1, r2, r3, r4, r6, r8, r9, r10, r11, r12)
            r0 = r16
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r13.updateScope(r0)
        L_0x0285:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.FloatingActionButtonKt.m1378SmallFloatingActionButtonXz6DiA(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.material3.FloatingActionButtonElevation, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:135:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x011c  */
    /* renamed from: LargeFloatingActionButton-X-z6DiA  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1377LargeFloatingActionButtonXz6DiA(kotlin.jvm.functions.Function0<kotlin.Unit> r28, androidx.compose.ui.Modifier r29, androidx.compose.ui.graphics.Shape r30, long r31, long r33, androidx.compose.material3.FloatingActionButtonElevation r35, androidx.compose.foundation.interaction.MutableInteractionSource r36, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r37, androidx.compose.runtime.Composer r38, int r39, int r40) {
        /*
            r13 = r28
            r14 = r37
            r15 = r39
            r12 = r40
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            r0 = -1650866856(0xffffffff9d99c558, float:-4.070281E-21)
            r1 = r38
            androidx.compose.runtime.Composer r11 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(LargeFloatingActionButton)P(6,5,7,0:c#ui.graphics.Color,2:c#ui.graphics.Color,3,4)218@11129L10,219@11198L14,220@11240L31,221@11349L11,222@11412L39,225@11498L431:FloatingActionButton.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r1)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0029
            r1 = r15 | 6
            goto L_0x0039
        L_0x0029:
            r1 = r15 & 14
            if (r1 != 0) goto L_0x0038
            boolean r1 = r11.changedInstance(r13)
            if (r1 == 0) goto L_0x0035
            r1 = 4
            goto L_0x0036
        L_0x0035:
            r1 = 2
        L_0x0036:
            r1 = r1 | r15
            goto L_0x0039
        L_0x0038:
            r1 = r15
        L_0x0039:
            r2 = r12 & 2
            if (r2 == 0) goto L_0x0040
            r1 = r1 | 48
            goto L_0x0053
        L_0x0040:
            r3 = r15 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0053
            r3 = r29
            boolean r4 = r11.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x004f
            r4 = 32
            goto L_0x0051
        L_0x004f:
            r4 = 16
        L_0x0051:
            r1 = r1 | r4
            goto L_0x0055
        L_0x0053:
            r3 = r29
        L_0x0055:
            r4 = r15 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x006e
            r4 = r12 & 4
            if (r4 != 0) goto L_0x0068
            r4 = r30
            boolean r5 = r11.changed((java.lang.Object) r4)
            if (r5 == 0) goto L_0x006a
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x006c
        L_0x0068:
            r4 = r30
        L_0x006a:
            r5 = 128(0x80, float:1.794E-43)
        L_0x006c:
            r1 = r1 | r5
            goto L_0x0070
        L_0x006e:
            r4 = r30
        L_0x0070:
            r5 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x0089
            r5 = r12 & 8
            if (r5 != 0) goto L_0x0083
            r5 = r31
            boolean r7 = r11.changed((long) r5)
            if (r7 == 0) goto L_0x0085
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x0087
        L_0x0083:
            r5 = r31
        L_0x0085:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x0087:
            r1 = r1 | r7
            goto L_0x008b
        L_0x0089:
            r5 = r31
        L_0x008b:
            r9 = 57344(0xe000, float:8.0356E-41)
            r7 = r15 & r9
            if (r7 != 0) goto L_0x00a7
            r7 = r12 & 16
            if (r7 != 0) goto L_0x00a1
            r7 = r33
            boolean r10 = r11.changed((long) r7)
            if (r10 == 0) goto L_0x00a3
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a5
        L_0x00a1:
            r7 = r33
        L_0x00a3:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x00a5:
            r1 = r1 | r10
            goto L_0x00a9
        L_0x00a7:
            r7 = r33
        L_0x00a9:
            r10 = 458752(0x70000, float:6.42848E-40)
            r16 = r15 & r10
            if (r16 != 0) goto L_0x00c3
            r16 = r12 & 32
            r10 = r35
            if (r16 != 0) goto L_0x00be
            boolean r16 = r11.changed((java.lang.Object) r10)
            if (r16 == 0) goto L_0x00be
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c0
        L_0x00be:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00c0:
            r1 = r1 | r16
            goto L_0x00c5
        L_0x00c3:
            r10 = r35
        L_0x00c5:
            r16 = r12 & 64
            r17 = 3670016(0x380000, float:5.142788E-39)
            if (r16 == 0) goto L_0x00d2
            r18 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r18
            r9 = r36
            goto L_0x00e5
        L_0x00d2:
            r18 = r15 & r17
            r9 = r36
            if (r18 != 0) goto L_0x00e5
            boolean r19 = r11.changed((java.lang.Object) r9)
            if (r19 == 0) goto L_0x00e1
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e3
        L_0x00e1:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x00e3:
            r1 = r1 | r19
        L_0x00e5:
            r0 = r12 & 128(0x80, float:1.794E-43)
            r20 = 29360128(0x1c00000, float:7.052966E-38)
            if (r0 == 0) goto L_0x00ef
            r0 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x00ed:
            r1 = r1 | r0
            goto L_0x00ff
        L_0x00ef:
            r0 = r15 & r20
            if (r0 != 0) goto L_0x00ff
            boolean r0 = r11.changedInstance(r14)
            if (r0 == 0) goto L_0x00fc
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ed
        L_0x00fc:
            r0 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x00ed
        L_0x00ff:
            r0 = 23967451(0x16db6db, float:4.3661218E-38)
            r0 = r0 & r1
            r3 = 4793490(0x492492, float:6.71711E-39)
            if (r0 != r3) goto L_0x011c
            boolean r0 = r11.getSkipping()
            if (r0 != 0) goto L_0x010f
            goto L_0x011c
        L_0x010f:
            r11.skipToGroupEnd()
            r2 = r29
            r3 = r4
            r4 = r5
            r6 = r7
            r8 = r10
            r19 = r11
            goto L_0x0267
        L_0x011c:
            r11.startDefaults()
            r0 = r15 & 1
            r21 = -458753(0xfffffffffff8ffff, float:NaN)
            r3 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x0158
            boolean r0 = r11.getDefaultsInvalid()
            if (r0 == 0) goto L_0x0130
            goto L_0x0158
        L_0x0130:
            r11.skipToGroupEnd()
            r0 = r12 & 4
            if (r0 == 0) goto L_0x0139
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0139:
            r0 = r12 & 8
            if (r0 == 0) goto L_0x013f
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x013f:
            r0 = r12 & 16
            if (r0 == 0) goto L_0x0144
            r1 = r1 & r3
        L_0x0144:
            r0 = r12 & 32
            if (r0 == 0) goto L_0x014a
            r1 = r1 & r21
        L_0x014a:
            r16 = r29
            r23 = r4
            r26 = r5
            r24 = r7
        L_0x0152:
            r22 = r9
        L_0x0154:
            r21 = r10
            goto L_0x01e9
        L_0x0158:
            if (r2 == 0) goto L_0x015f
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            goto L_0x0161
        L_0x015f:
            r0 = r29
        L_0x0161:
            r2 = r12 & 4
            r3 = 6
            if (r2 == 0) goto L_0x0171
            androidx.compose.material3.FloatingActionButtonDefaults r2 = androidx.compose.material3.FloatingActionButtonDefaults.INSTANCE
            androidx.compose.ui.graphics.Shape r2 = r2.getLargeShape(r11, r3)
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
            r23 = r2
            goto L_0x0173
        L_0x0171:
            r23 = r4
        L_0x0173:
            r2 = r12 & 8
            if (r2 == 0) goto L_0x0180
            androidx.compose.material3.FloatingActionButtonDefaults r2 = androidx.compose.material3.FloatingActionButtonDefaults.INSTANCE
            long r2 = r2.getContainerColor(r11, r3)
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
            r5 = r2
        L_0x0180:
            r2 = r12 & 16
            if (r2 == 0) goto L_0x0195
            int r2 = r1 >> 9
            r2 = r2 & 14
            long r2 = androidx.compose.material3.ColorSchemeKt.m1242contentColorForek8zF_U(r5, r11, r2)
            r4 = -57345(0xffffffffffff1fff, float:NaN)
            r1 = r1 & r4
            r22 = r1
            r24 = r2
            goto L_0x0199
        L_0x0195:
            r22 = r1
            r24 = r7
        L_0x0199:
            r1 = r12 & 32
            if (r1 == 0) goto L_0x01b6
            androidx.compose.material3.FloatingActionButtonDefaults r1 = androidx.compose.material3.FloatingActionButtonDefaults.INSTANCE
            r2 = 0
            r3 = 0
            r4 = 0
            r7 = 0
            r8 = 24576(0x6000, float:3.4438E-41)
            r10 = 15
            r26 = r5
            r5 = r7
            r6 = r11
            r7 = r8
            r8 = r10
            androidx.compose.material3.FloatingActionButtonElevation r1 = r1.m1371elevationxZ9QkE(r2, r3, r4, r5, r6, r7, r8)
            r2 = r22 & r21
            r10 = r1
            r1 = r2
            goto L_0x01ba
        L_0x01b6:
            r26 = r5
            r1 = r22
        L_0x01ba:
            if (r16 == 0) goto L_0x01e5
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r11.startReplaceableGroup(r2)
            java.lang.String r2 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r2)
            java.lang.Object r2 = r11.rememberedValue()
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r3 = r3.getEmpty()
            if (r2 != r3) goto L_0x01da
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r11.updateRememberedValue(r2)
        L_0x01da:
            r11.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = (androidx.compose.foundation.interaction.MutableInteractionSource) r2
            r16 = r0
            r22 = r2
            goto L_0x0154
        L_0x01e5:
            r16 = r0
            goto L_0x0152
        L_0x01e9:
            r11.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01fc
            r0 = -1
            java.lang.String r2 = "androidx.compose.material3.LargeFloatingActionButton (FloatingActionButton.kt:215)"
            r3 = -1650866856(0xffffffff9d99c558, float:-4.070281E-21)
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r1, r0, r2)
        L_0x01fc:
            androidx.compose.material3.tokens.FabPrimaryLargeTokens r0 = androidx.compose.material3.tokens.FabPrimaryLargeTokens.INSTANCE
            float r0 = r0.m2014getContainerWidthD9Ej5fM()
            androidx.compose.material3.tokens.FabPrimaryLargeTokens r2 = androidx.compose.material3.tokens.FabPrimaryLargeTokens.INSTANCE
            float r2 = r2.m2013getContainerHeightD9Ej5fM()
            r3 = 0
            r4 = 0
            r5 = 12
            r6 = 0
            r29 = r16
            r30 = r0
            r31 = r2
            r32 = r3
            r33 = r4
            r34 = r5
            r35 = r6
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.m567sizeInqDBjuR0$default(r29, r30, r31, r32, r33, r34, r35)
            r0 = r1 & 14
            r3 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r3
            r3 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r3
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r1
            r0 = r0 | r3
            r3 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r1
            r0 = r0 | r3
            r3 = r1 & r17
            r0 = r0 | r3
            r1 = r1 & r20
            r17 = r0 | r1
            r18 = 0
            r0 = r28
            r1 = r2
            r2 = r23
            r3 = r26
            r5 = r24
            r7 = r21
            r8 = r22
            r9 = r37
            r10 = r11
            r19 = r11
            r11 = r17
            r12 = r18
            m1376FloatingActionButtonXz6DiA(r0, r1, r2, r3, r5, r7, r8, r9, r10, r11, r12)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x025b
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x025b:
            r2 = r16
            r8 = r21
            r9 = r22
            r3 = r23
            r6 = r24
            r4 = r26
        L_0x0267:
            androidx.compose.runtime.ScopeUpdateScope r12 = r19.endRestartGroup()
            if (r12 != 0) goto L_0x026e
            goto L_0x0285
        L_0x026e:
            androidx.compose.material3.FloatingActionButtonKt$LargeFloatingActionButton$2 r16 = new androidx.compose.material3.FloatingActionButtonKt$LargeFloatingActionButton$2
            r0 = r16
            r1 = r28
            r10 = r37
            r11 = r39
            r13 = r12
            r12 = r40
            r0.<init>(r1, r2, r3, r4, r6, r8, r9, r10, r11, r12)
            r0 = r16
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r13.updateScope(r0)
        L_0x0285:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.FloatingActionButtonKt.m1377LargeFloatingActionButtonXz6DiA(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.material3.FloatingActionButtonElevation, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:135:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x025c  */
    /* JADX WARNING: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x011c  */
    /* renamed from: ExtendedFloatingActionButton-X-z6DiA  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1375ExtendedFloatingActionButtonXz6DiA(kotlin.jvm.functions.Function0<kotlin.Unit> r28, androidx.compose.ui.Modifier r29, androidx.compose.ui.graphics.Shape r30, long r31, long r33, androidx.compose.material3.FloatingActionButtonElevation r35, androidx.compose.foundation.interaction.MutableInteractionSource r36, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r37, androidx.compose.runtime.Composer r38, int r39, int r40) {
        /*
            r13 = r28
            r14 = r37
            r15 = r39
            r12 = r40
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            r0 = -326283107(0xffffffffec8d509d, float:-1.3667138E27)
            r1 = r38
            androidx.compose.runtime.Composer r11 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(ExtendedFloatingActionButton)P(6,5,7,0:c#ui.graphics.Color,2:c#ui.graphics.Color,3,4)273@13913L16,274@13988L14,275@14030L31,276@14139L11,277@14202L39,280@14297L595:FloatingActionButton.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r1)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0029
            r1 = r15 | 6
            goto L_0x0039
        L_0x0029:
            r1 = r15 & 14
            if (r1 != 0) goto L_0x0038
            boolean r1 = r11.changedInstance(r13)
            if (r1 == 0) goto L_0x0035
            r1 = 4
            goto L_0x0036
        L_0x0035:
            r1 = 2
        L_0x0036:
            r1 = r1 | r15
            goto L_0x0039
        L_0x0038:
            r1 = r15
        L_0x0039:
            r2 = r12 & 2
            if (r2 == 0) goto L_0x0040
            r1 = r1 | 48
            goto L_0x0053
        L_0x0040:
            r3 = r15 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0053
            r3 = r29
            boolean r4 = r11.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x004f
            r4 = 32
            goto L_0x0051
        L_0x004f:
            r4 = 16
        L_0x0051:
            r1 = r1 | r4
            goto L_0x0055
        L_0x0053:
            r3 = r29
        L_0x0055:
            r4 = r15 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x006e
            r4 = r12 & 4
            if (r4 != 0) goto L_0x0068
            r4 = r30
            boolean r5 = r11.changed((java.lang.Object) r4)
            if (r5 == 0) goto L_0x006a
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x006c
        L_0x0068:
            r4 = r30
        L_0x006a:
            r5 = 128(0x80, float:1.794E-43)
        L_0x006c:
            r1 = r1 | r5
            goto L_0x0070
        L_0x006e:
            r4 = r30
        L_0x0070:
            r5 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x0089
            r5 = r12 & 8
            if (r5 != 0) goto L_0x0083
            r5 = r31
            boolean r7 = r11.changed((long) r5)
            if (r7 == 0) goto L_0x0085
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x0087
        L_0x0083:
            r5 = r31
        L_0x0085:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x0087:
            r1 = r1 | r7
            goto L_0x008b
        L_0x0089:
            r5 = r31
        L_0x008b:
            r9 = 57344(0xe000, float:8.0356E-41)
            r7 = r15 & r9
            if (r7 != 0) goto L_0x00a7
            r7 = r12 & 16
            if (r7 != 0) goto L_0x00a1
            r7 = r33
            boolean r10 = r11.changed((long) r7)
            if (r10 == 0) goto L_0x00a3
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a5
        L_0x00a1:
            r7 = r33
        L_0x00a3:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x00a5:
            r1 = r1 | r10
            goto L_0x00a9
        L_0x00a7:
            r7 = r33
        L_0x00a9:
            r10 = 458752(0x70000, float:6.42848E-40)
            r16 = r15 & r10
            if (r16 != 0) goto L_0x00c3
            r16 = r12 & 32
            r10 = r35
            if (r16 != 0) goto L_0x00be
            boolean r16 = r11.changed((java.lang.Object) r10)
            if (r16 == 0) goto L_0x00be
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c0
        L_0x00be:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00c0:
            r1 = r1 | r16
            goto L_0x00c5
        L_0x00c3:
            r10 = r35
        L_0x00c5:
            r16 = r12 & 64
            r17 = 3670016(0x380000, float:5.142788E-39)
            if (r16 == 0) goto L_0x00d2
            r18 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r18
            r9 = r36
            goto L_0x00e5
        L_0x00d2:
            r18 = r15 & r17
            r9 = r36
            if (r18 != 0) goto L_0x00e5
            boolean r19 = r11.changed((java.lang.Object) r9)
            if (r19 == 0) goto L_0x00e1
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e3
        L_0x00e1:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x00e3:
            r1 = r1 | r19
        L_0x00e5:
            r0 = r12 & 128(0x80, float:1.794E-43)
            r20 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00ee
            r1 = r1 | r20
            goto L_0x00ff
        L_0x00ee:
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r0 & r15
            if (r0 != 0) goto L_0x00ff
            boolean r0 = r11.changedInstance(r14)
            if (r0 == 0) goto L_0x00fc
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fe
        L_0x00fc:
            r0 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fe:
            r1 = r1 | r0
        L_0x00ff:
            r0 = 23967451(0x16db6db, float:4.3661218E-38)
            r0 = r0 & r1
            r3 = 4793490(0x492492, float:6.71711E-39)
            if (r0 != r3) goto L_0x011c
            boolean r0 = r11.getSkipping()
            if (r0 != 0) goto L_0x010f
            goto L_0x011c
        L_0x010f:
            r11.skipToGroupEnd()
            r2 = r29
            r3 = r4
            r4 = r5
            r6 = r7
            r8 = r10
            r19 = r11
            goto L_0x0255
        L_0x011c:
            r11.startDefaults()
            r0 = r15 & 1
            r21 = -458753(0xfffffffffff8ffff, float:NaN)
            r3 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x0158
            boolean r0 = r11.getDefaultsInvalid()
            if (r0 == 0) goto L_0x0130
            goto L_0x0158
        L_0x0130:
            r11.skipToGroupEnd()
            r0 = r12 & 4
            if (r0 == 0) goto L_0x0139
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0139:
            r0 = r12 & 8
            if (r0 == 0) goto L_0x013f
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x013f:
            r0 = r12 & 16
            if (r0 == 0) goto L_0x0144
            r1 = r1 & r3
        L_0x0144:
            r0 = r12 & 32
            if (r0 == 0) goto L_0x014a
            r1 = r1 & r21
        L_0x014a:
            r16 = r29
            r23 = r4
            r26 = r5
            r24 = r7
        L_0x0152:
            r22 = r9
        L_0x0154:
            r21 = r10
            goto L_0x01e9
        L_0x0158:
            if (r2 == 0) goto L_0x015f
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            goto L_0x0161
        L_0x015f:
            r0 = r29
        L_0x0161:
            r2 = r12 & 4
            r3 = 6
            if (r2 == 0) goto L_0x0171
            androidx.compose.material3.FloatingActionButtonDefaults r2 = androidx.compose.material3.FloatingActionButtonDefaults.INSTANCE
            androidx.compose.ui.graphics.Shape r2 = r2.getExtendedFabShape(r11, r3)
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
            r23 = r2
            goto L_0x0173
        L_0x0171:
            r23 = r4
        L_0x0173:
            r2 = r12 & 8
            if (r2 == 0) goto L_0x0180
            androidx.compose.material3.FloatingActionButtonDefaults r2 = androidx.compose.material3.FloatingActionButtonDefaults.INSTANCE
            long r2 = r2.getContainerColor(r11, r3)
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
            r5 = r2
        L_0x0180:
            r2 = r12 & 16
            if (r2 == 0) goto L_0x0195
            int r2 = r1 >> 9
            r2 = r2 & 14
            long r2 = androidx.compose.material3.ColorSchemeKt.m1242contentColorForek8zF_U(r5, r11, r2)
            r4 = -57345(0xffffffffffff1fff, float:NaN)
            r1 = r1 & r4
            r22 = r1
            r24 = r2
            goto L_0x0199
        L_0x0195:
            r22 = r1
            r24 = r7
        L_0x0199:
            r1 = r12 & 32
            if (r1 == 0) goto L_0x01b6
            androidx.compose.material3.FloatingActionButtonDefaults r1 = androidx.compose.material3.FloatingActionButtonDefaults.INSTANCE
            r2 = 0
            r3 = 0
            r4 = 0
            r7 = 0
            r8 = 24576(0x6000, float:3.4438E-41)
            r10 = 15
            r26 = r5
            r5 = r7
            r6 = r11
            r7 = r8
            r8 = r10
            androidx.compose.material3.FloatingActionButtonElevation r1 = r1.m1371elevationxZ9QkE(r2, r3, r4, r5, r6, r7, r8)
            r2 = r22 & r21
            r10 = r1
            r1 = r2
            goto L_0x01ba
        L_0x01b6:
            r26 = r5
            r1 = r22
        L_0x01ba:
            if (r16 == 0) goto L_0x01e5
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r11.startReplaceableGroup(r2)
            java.lang.String r2 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r2)
            java.lang.Object r2 = r11.rememberedValue()
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r3 = r3.getEmpty()
            if (r2 != r3) goto L_0x01da
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r11.updateRememberedValue(r2)
        L_0x01da:
            r11.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = (androidx.compose.foundation.interaction.MutableInteractionSource) r2
            r16 = r0
            r22 = r2
            goto L_0x0154
        L_0x01e5:
            r16 = r0
            goto L_0x0152
        L_0x01e9:
            r11.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01fc
            r0 = -1
            java.lang.String r2 = "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:270)"
            r3 = -326283107(0xffffffffec8d509d, float:-1.3667138E27)
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r1, r0, r2)
        L_0x01fc:
            androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$2 r0 = new androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$2
            r0.<init>(r14, r1)
            r2 = 398457247(0x17bff99f, float:1.2406099E-24)
            r3 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r11, r2, r3, r0)
            r9 = r0
            kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
            r0 = r1 & 14
            r0 = r0 | r20
            r2 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r1
            r0 = r0 | r2
            r2 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r1
            r0 = r0 | r2
            r1 = r1 & r17
            r17 = r0 | r1
            r18 = 0
            r0 = r28
            r1 = r16
            r2 = r23
            r3 = r26
            r5 = r24
            r7 = r21
            r8 = r22
            r10 = r11
            r19 = r11
            r11 = r17
            r12 = r18
            m1376FloatingActionButtonXz6DiA(r0, r1, r2, r3, r5, r7, r8, r9, r10, r11, r12)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0249
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0249:
            r2 = r16
            r8 = r21
            r9 = r22
            r3 = r23
            r6 = r24
            r4 = r26
        L_0x0255:
            androidx.compose.runtime.ScopeUpdateScope r12 = r19.endRestartGroup()
            if (r12 != 0) goto L_0x025c
            goto L_0x0273
        L_0x025c:
            androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$3 r16 = new androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$3
            r0 = r16
            r1 = r28
            r10 = r37
            r11 = r39
            r13 = r12
            r12 = r40
            r0.<init>(r1, r2, r3, r4, r6, r8, r9, r10, r11, r12)
            r0 = r16
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r13.updateScope(r0)
        L_0x0273:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.FloatingActionButtonKt.m1375ExtendedFloatingActionButtonXz6DiA(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.material3.FloatingActionButtonElevation, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0128  */
    /* renamed from: ExtendedFloatingActionButton-ElI5-7k  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1374ExtendedFloatingActionButtonElI57k(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r30, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r31, kotlin.jvm.functions.Function0<kotlin.Unit> r32, androidx.compose.ui.Modifier r33, boolean r34, androidx.compose.ui.graphics.Shape r35, long r36, long r38, androidx.compose.material3.FloatingActionButtonElevation r40, androidx.compose.foundation.interaction.MutableInteractionSource r41, androidx.compose.runtime.Composer r42, int r43, int r44) {
        /*
            r1 = r30
            r2 = r31
            r0 = r32
            r15 = r43
            r14 = r44
            java.lang.String r3 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            java.lang.String r3 = "icon"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            java.lang.String r3 = "onClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            r3 = -1387401842(0xffffffffad4ded8e, float:-1.1705649E-11)
            r4 = r42
            androidx.compose.runtime.Composer r13 = r4.startRestartGroup(r3)
            java.lang.String r4 = "C(ExtendedFloatingActionButton)P(9,4,7,6,3,8,0:c#ui.graphics.Color,1:c#ui.graphics.Color)343@17455L16,344@17530L14,345@17572L31,346@17681L11,347@17744L39,349@17793L1269:FloatingActionButton.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r13, r4)
            r4 = r14 & 1
            if (r4 == 0) goto L_0x0031
            r4 = r15 | 6
            goto L_0x0041
        L_0x0031:
            r4 = r15 & 14
            if (r4 != 0) goto L_0x0040
            boolean r4 = r13.changedInstance(r1)
            if (r4 == 0) goto L_0x003d
            r4 = 4
            goto L_0x003e
        L_0x003d:
            r4 = 2
        L_0x003e:
            r4 = r4 | r15
            goto L_0x0041
        L_0x0040:
            r4 = r15
        L_0x0041:
            r5 = r14 & 2
            if (r5 == 0) goto L_0x0048
            r4 = r4 | 48
            goto L_0x0058
        L_0x0048:
            r5 = r15 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0058
            boolean r5 = r13.changedInstance(r2)
            if (r5 == 0) goto L_0x0055
            r5 = 32
            goto L_0x0057
        L_0x0055:
            r5 = 16
        L_0x0057:
            r4 = r4 | r5
        L_0x0058:
            r5 = r14 & 4
            if (r5 == 0) goto L_0x005f
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x006f
        L_0x005f:
            r5 = r15 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x006f
            boolean r5 = r13.changedInstance(r0)
            if (r5 == 0) goto L_0x006c
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x006e
        L_0x006c:
            r5 = 128(0x80, float:1.794E-43)
        L_0x006e:
            r4 = r4 | r5
        L_0x006f:
            r5 = r14 & 8
            if (r5 == 0) goto L_0x0076
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x0089
        L_0x0076:
            r6 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r6 != 0) goto L_0x0089
            r6 = r33
            boolean r7 = r13.changed((java.lang.Object) r6)
            if (r7 == 0) goto L_0x0085
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x0087
        L_0x0085:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x0087:
            r4 = r4 | r7
            goto L_0x008b
        L_0x0089:
            r6 = r33
        L_0x008b:
            r7 = r14 & 16
            r8 = 57344(0xe000, float:8.0356E-41)
            if (r7 == 0) goto L_0x0095
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a8
        L_0x0095:
            r9 = r15 & r8
            if (r9 != 0) goto L_0x00a8
            r9 = r34
            boolean r10 = r13.changed((boolean) r9)
            if (r10 == 0) goto L_0x00a4
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a6
        L_0x00a4:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x00a6:
            r4 = r4 | r10
            goto L_0x00aa
        L_0x00a8:
            r9 = r34
        L_0x00aa:
            r10 = 458752(0x70000, float:6.42848E-40)
            r11 = r15 & r10
            if (r11 != 0) goto L_0x00c5
            r11 = r14 & 32
            if (r11 != 0) goto L_0x00bf
            r11 = r35
            boolean r12 = r13.changed((java.lang.Object) r11)
            if (r12 == 0) goto L_0x00c1
            r12 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c3
        L_0x00bf:
            r11 = r35
        L_0x00c1:
            r12 = 65536(0x10000, float:9.18355E-41)
        L_0x00c3:
            r4 = r4 | r12
            goto L_0x00c7
        L_0x00c5:
            r11 = r35
        L_0x00c7:
            r12 = 3670016(0x380000, float:5.142788E-39)
            r16 = r15 & r12
            if (r16 != 0) goto L_0x00e1
            r16 = r14 & 64
            r10 = r36
            if (r16 != 0) goto L_0x00dc
            boolean r16 = r13.changed((long) r10)
            if (r16 == 0) goto L_0x00dc
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00de
        L_0x00dc:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00de:
            r4 = r4 | r16
            goto L_0x00e3
        L_0x00e1:
            r10 = r36
        L_0x00e3:
            r16 = 29360128(0x1c00000, float:7.052966E-38)
            r16 = r15 & r16
            if (r16 != 0) goto L_0x00fd
            r12 = r14 & 128(0x80, float:1.794E-43)
            r8 = r38
            if (r12 != 0) goto L_0x00f8
            boolean r17 = r13.changed((long) r8)
            if (r17 == 0) goto L_0x00f8
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fa
        L_0x00f8:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fa:
            r4 = r4 | r17
            goto L_0x00ff
        L_0x00fd:
            r8 = r38
        L_0x00ff:
            r17 = 234881024(0xe000000, float:1.5777218E-30)
            r17 = r15 & r17
            if (r17 != 0) goto L_0x011b
            r12 = r14 & 256(0x100, float:3.59E-43)
            if (r12 != 0) goto L_0x0114
            r12 = r40
            boolean r18 = r13.changed((java.lang.Object) r12)
            if (r18 == 0) goto L_0x0116
            r18 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0118
        L_0x0114:
            r12 = r40
        L_0x0116:
            r18 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0118:
            r4 = r4 | r18
            goto L_0x011d
        L_0x011b:
            r12 = r40
        L_0x011d:
            r3 = r14 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x0128
            r19 = 805306368(0x30000000, float:4.656613E-10)
            r4 = r4 | r19
            r0 = r41
            goto L_0x013d
        L_0x0128:
            r19 = 1879048192(0x70000000, float:1.58456325E29)
            r19 = r15 & r19
            r0 = r41
            if (r19 != 0) goto L_0x013d
            boolean r19 = r13.changed((java.lang.Object) r0)
            if (r19 == 0) goto L_0x0139
            r19 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x013b
        L_0x0139:
            r19 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x013b:
            r4 = r4 | r19
        L_0x013d:
            r19 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r0 = r4 & r19
            r6 = 306783378(0x12492492, float:6.3469493E-28)
            if (r0 != r6) goto L_0x0166
            boolean r0 = r13.getSkipping()
            if (r0 != 0) goto L_0x014e
            goto L_0x0166
        L_0x014e:
            r13.skipToGroupEnd()
            r4 = r33
            r5 = r34
            r6 = r35
            r18 = r13
            r27 = r12
            r12 = r41
            r28 = r10
            r11 = r27
            r9 = r8
            r7 = r28
            goto L_0x02b7
        L_0x0166:
            r13.startDefaults()
            r0 = r15 & 1
            r19 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r20 = -3670017(0xffffffffffc7ffff, float:NaN)
            r21 = -458753(0xfffffffffff8ffff, float:NaN)
            if (r0 == 0) goto L_0x01aa
            boolean r0 = r13.getDefaultsInvalid()
            if (r0 == 0) goto L_0x017d
            goto L_0x01aa
        L_0x017d:
            r13.skipToGroupEnd()
            r0 = r14 & 32
            if (r0 == 0) goto L_0x0186
            r4 = r4 & r21
        L_0x0186:
            r0 = r14 & 64
            if (r0 == 0) goto L_0x018c
            r4 = r4 & r20
        L_0x018c:
            r0 = r14 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0192
            r4 = r4 & r19
        L_0x0192:
            r0 = r14 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x019a
            r0 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r4 = r4 & r0
        L_0x019a:
            r0 = r33
            r19 = r35
            r26 = r41
            r24 = r8
            r20 = r10
            r22 = r12
            r12 = r34
            goto L_0x0241
        L_0x01aa:
            if (r5 == 0) goto L_0x01b1
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            goto L_0x01b3
        L_0x01b1:
            r0 = r33
        L_0x01b3:
            if (r7 == 0) goto L_0x01b7
            r5 = 1
            goto L_0x01b9
        L_0x01b7:
            r5 = r34
        L_0x01b9:
            r7 = r14 & 32
            r6 = 6
            if (r7 == 0) goto L_0x01c7
            androidx.compose.material3.FloatingActionButtonDefaults r7 = androidx.compose.material3.FloatingActionButtonDefaults.INSTANCE
            androidx.compose.ui.graphics.Shape r7 = r7.getExtendedFabShape(r13, r6)
            r4 = r4 & r21
            goto L_0x01c9
        L_0x01c7:
            r7 = r35
        L_0x01c9:
            r21 = r14 & 64
            if (r21 == 0) goto L_0x01d5
            androidx.compose.material3.FloatingActionButtonDefaults r10 = androidx.compose.material3.FloatingActionButtonDefaults.INSTANCE
            long r10 = r10.getContainerColor(r13, r6)
            r4 = r4 & r20
        L_0x01d5:
            r6 = r14 & 128(0x80, float:1.794E-43)
            if (r6 == 0) goto L_0x01e3
            int r6 = r4 >> 18
            r6 = r6 & 14
            long r8 = androidx.compose.material3.ColorSchemeKt.m1242contentColorForek8zF_U(r10, r13, r6)
            r4 = r4 & r19
        L_0x01e3:
            r6 = r14 & 256(0x100, float:3.59E-43)
            if (r6 == 0) goto L_0x020d
            androidx.compose.material3.FloatingActionButtonDefaults r6 = androidx.compose.material3.FloatingActionButtonDefaults.INSTANCE
            r12 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r24 = 24576(0x6000, float:3.4438E-41)
            r25 = 15
            r33 = r6
            r34 = r12
            r35 = r19
            r36 = r20
            r37 = r21
            r38 = r13
            r39 = r24
            r40 = r25
            androidx.compose.material3.FloatingActionButtonElevation r6 = r33.m1371elevationxZ9QkE(r34, r35, r36, r37, r38, r39, r40)
            r12 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r4 = r4 & r12
            goto L_0x020e
        L_0x020d:
            r6 = r12
        L_0x020e:
            if (r3 == 0) goto L_0x0236
            r3 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r13.startReplaceableGroup(r3)
            java.lang.String r3 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r13, r3)
            java.lang.Object r3 = r13.rememberedValue()
            androidx.compose.runtime.Composer$Companion r12 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r12 = r12.getEmpty()
            if (r3 != r12) goto L_0x022e
            androidx.compose.foundation.interaction.MutableInteractionSource r3 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r13.updateRememberedValue(r3)
        L_0x022e:
            r13.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r3 = (androidx.compose.foundation.interaction.MutableInteractionSource) r3
            r26 = r3
            goto L_0x0238
        L_0x0236:
            r26 = r41
        L_0x0238:
            r12 = r5
            r22 = r6
            r19 = r7
            r24 = r8
            r20 = r10
        L_0x0241:
            r13.endDefaults()
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L_0x0254
            r3 = -1
            java.lang.String r5 = "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:337)"
            r6 = -1387401842(0xffffffffad4ded8e, float:-1.1705649E-11)
            androidx.compose.runtime.ComposerKt.traceEventStart(r6, r4, r3, r5)
        L_0x0254:
            androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$5 r3 = new androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$5
            r3.<init>(r12, r2, r4, r1)
            r5 = 1172118032(0x45dd1a10, float:7075.258)
            r6 = 1
            androidx.compose.runtime.internal.ComposableLambda r3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r13, r5, r6, r3)
            r18 = r3
            kotlin.jvm.functions.Function2 r18 = (kotlin.jvm.functions.Function2) r18
            int r3 = r4 >> 6
            r5 = r3 & 14
            r6 = 12582912(0xc00000, float:1.7632415E-38)
            r5 = r5 | r6
            r3 = r3 & 112(0x70, float:1.57E-43)
            r3 = r3 | r5
            int r4 = r4 >> 9
            r5 = r4 & 896(0x380, float:1.256E-42)
            r3 = r3 | r5
            r5 = r4 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | r5
            r5 = 57344(0xe000, float:8.0356E-41)
            r5 = r5 & r4
            r3 = r3 | r5
            r5 = 458752(0x70000, float:6.42848E-40)
            r5 = r5 & r4
            r3 = r3 | r5
            r5 = 3670016(0x380000, float:5.142788E-39)
            r4 = r4 & r5
            r16 = r3 | r4
            r17 = 0
            r3 = r32
            r4 = r0
            r5 = r19
            r6 = r20
            r8 = r24
            r10 = r22
            r11 = r26
            r23 = r12
            r12 = r18
            r18 = r13
            r14 = r16
            r15 = r17
            m1376FloatingActionButtonXz6DiA(r3, r4, r5, r6, r8, r10, r11, r12, r13, r14, r15)
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L_0x02aa
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x02aa:
            r4 = r0
            r6 = r19
            r7 = r20
            r11 = r22
            r5 = r23
            r9 = r24
            r12 = r26
        L_0x02b7:
            androidx.compose.runtime.ScopeUpdateScope r15 = r18.endRestartGroup()
            if (r15 != 0) goto L_0x02be
            goto L_0x02d6
        L_0x02be:
            androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$6 r16 = new androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$6
            r0 = r16
            r1 = r30
            r2 = r31
            r3 = r32
            r13 = r43
            r14 = r44
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r11, r12, r13, r14)
            r0 = r16
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r15.updateScope(r0)
        L_0x02d6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.FloatingActionButtonKt.m1374ExtendedFloatingActionButtonElI57k(kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.material3.FloatingActionButtonElevation, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }
}
