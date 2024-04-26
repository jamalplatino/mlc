package androidx.compose.material3;

import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ao\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u0017H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001aQ\u0010\u001a\u001a\u00020\b2\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\b0\u001c¢\u0006\u0002\b\u00162\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\b0\u001c¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010!\u001am\u0010\"\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u0017H\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001ao\u0010%\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u0017H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010\u0019\u001ac\u0010'\u001a\u00020\b2\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\b0\u001c¢\u0006\u0002\b\u00162\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010(\u001a\u00020\u000e2\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\b0\u001c¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a\u0001\u0010+\u001a\u00020\b2\u0011\u0010,\u001a\r\u0012\u0004\u0012\u00020\b0\u001c¢\u0006\u0002\b\u00162\u0006\u0010-\u001a\u00020 2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\b0\u001c2\b\b\u0002\u0010\t\u001a\u00020\n2\u0015\b\u0002\u0010/\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\u001c¢\u0006\u0002\b\u00162\u0015\b\u0002\u00100\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\u001c¢\u0006\u0002\b\u00162\b\b\u0002\u00101\u001a\u00020\f2\b\b\u0002\u00102\u001a\u0002032\b\b\u0002\u00104\u001a\u000205H\u0007¢\u0006\u0002\u00106\u001ao\u00107\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u0017H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b8\u0010\u0019\u001a=\u00109\u001a\u00020\b2\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\b0\u001c¢\u0006\u0002\b\u00162\b\b\u0002\u0010\t\u001a\u00020\n2\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\b0\u001c¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010:\u001aA\u0010;\u001a\u00020\b2\u0006\u0010<\u001a\u00020 2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\b0\u001c2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c2\u0006\u0010?\u001a\u00020\u000eH\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b@\u0010A\u001a \u0010B\u001a\u00020\u00022\u0006\u0010C\u001a\u00020\u00022\u0006\u0010D\u001a\u00020\u00022\u0006\u0010E\u001a\u00020\u0002H\u0002\u001a+\u0010F\u001a\u00020\u001e2\u0006\u0010G\u001a\u00020H2\u0014\b\u0002\u0010I\u001a\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020 0\u0014H\u0007¢\u0006\u0002\u0010J\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\u0003\u001a\u00020\u0004X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0013\u0010\u0006\u001a\u00020\u0004X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006K"}, d2 = {"AnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "", "DrawerVelocityThreshold", "Landroidx/compose/ui/unit/Dp;", "F", "MinimumDrawerWidth", "DismissibleDrawerSheet", "", "modifier", "Landroidx/compose/ui/Modifier;", "drawerShape", "Landroidx/compose/ui/graphics/Shape;", "drawerContainerColor", "Landroidx/compose/ui/graphics/Color;", "drawerContentColor", "drawerTonalElevation", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "DismissibleDrawerSheet-afqeVBk", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DismissibleNavigationDrawer", "drawerContent", "Lkotlin/Function0;", "drawerState", "Landroidx/compose/material3/DrawerState;", "gesturesEnabled", "", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DrawerState;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "DrawerSheet", "DrawerSheet-vywBR7E", "(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ModalDrawerSheet", "ModalDrawerSheet-afqeVBk", "ModalNavigationDrawer", "scrimColor", "ModalNavigationDrawer-FHprtrg", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DrawerState;ZJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "NavigationDrawerItem", "label", "selected", "onClick", "icon", "badge", "shape", "colors", "Landroidx/compose/material3/NavigationDrawerItemColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/NavigationDrawerItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "PermanentDrawerSheet", "PermanentDrawerSheet-afqeVBk", "PermanentNavigationDrawer", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Scrim", "open", "onClose", "fraction", "color", "Scrim-Bx497Mc", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;JLandroidx/compose/runtime/Composer;I)V", "calculateFraction", "a", "b", "pos", "rememberDrawerState", "initialValue", "Landroidx/compose/material3/DrawerValue;", "confirmStateChange", "(Landroidx/compose/material3/DrawerValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/DrawerState;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: NavigationDrawer.kt */
public final class NavigationDrawerKt {
    /* access modifiers changed from: private */
    public static final TweenSpec<Float> AnimationSpec = new TweenSpec(256, 0, (Easing) null, 6, (DefaultConstructorMarker) null);
    private static final float DrawerVelocityThreshold = Dp.m5626constructorimpl((float) 400);
    /* access modifiers changed from: private */
    public static final float MinimumDrawerWidth = Dp.m5626constructorimpl((float) 240);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: androidx.compose.runtime.saveable.Saver<androidx.compose.material3.DrawerState, androidx.compose.material3.DrawerValue>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.material3.DrawerState rememberDrawerState(androidx.compose.material3.DrawerValue r7, kotlin.jvm.functions.Function1<? super androidx.compose.material3.DrawerValue, java.lang.Boolean> r8, androidx.compose.runtime.Composer r9, int r10, int r11) {
        /*
            java.lang.String r0 = "initialValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 2098699222(0x7d179bd6, float:1.2595161E37)
            r9.startReplaceableGroup(r0)
            java.lang.String r1 = "C(rememberDrawerState)P(1)227@8145L61,227@8081L125:NavigationDrawer.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r9, r1)
            r11 = r11 & 2
            if (r11 == 0) goto L_0x0019
            androidx.compose.material3.NavigationDrawerKt$rememberDrawerState$1 r8 = androidx.compose.material3.NavigationDrawerKt$rememberDrawerState$1.INSTANCE
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
        L_0x0019:
            boolean r11 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r11 == 0) goto L_0x0026
            r11 = -1
            java.lang.String r1 = "androidx.compose.material3.rememberDrawerState (NavigationDrawer.kt:223)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r10, r11, r1)
        L_0x0026:
            r10 = 0
            java.lang.Object[] r0 = new java.lang.Object[r10]
            androidx.compose.material3.DrawerState$Companion r10 = androidx.compose.material3.DrawerState.Companion
            androidx.compose.runtime.saveable.Saver r1 = r10.Saver(r8)
            r2 = 0
            r10 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r9.startReplaceableGroup(r10)
            java.lang.String r10 = "CC(remember)P(1,2):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r9, r10)
            boolean r10 = r9.changed((java.lang.Object) r7)
            boolean r11 = r9.changed((java.lang.Object) r8)
            r10 = r10 | r11
            java.lang.Object r11 = r9.rememberedValue()
            if (r10 != 0) goto L_0x0052
            androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r10 = r10.getEmpty()
            if (r11 != r10) goto L_0x005d
        L_0x0052:
            androidx.compose.material3.NavigationDrawerKt$rememberDrawerState$2$1 r10 = new androidx.compose.material3.NavigationDrawerKt$rememberDrawerState$2$1
            r10.<init>(r7, r8)
            r11 = r10
            kotlin.jvm.functions.Function0 r11 = (kotlin.jvm.functions.Function0) r11
            r9.updateRememberedValue(r11)
        L_0x005d:
            r9.endReplaceableGroup()
            r3 = r11
            kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
            r5 = 72
            r6 = 4
            r4 = r9
            java.lang.Object r7 = androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable((java.lang.Object[]) r0, r1, (java.lang.String) r2, r3, (androidx.compose.runtime.Composer) r4, (int) r5, (int) r6)
            androidx.compose.material3.DrawerState r7 = (androidx.compose.material3.DrawerState) r7
            boolean r8 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r8 == 0) goto L_0x0076
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0076:
            r9.endReplaceableGroup()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.rememberDrawerState(androidx.compose.material3.DrawerValue, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):androidx.compose.material3.DrawerState");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v35, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00f5, code lost:
        if ((r41 & 16) != 0) goto L_0x00f7;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0282  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0355  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0361  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0365  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x04f3  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x04ff  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0503  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0591  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x05a1  */
    /* JADX WARNING: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01d8  */
    /* renamed from: ModalNavigationDrawer-FHprtrg  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1456ModalNavigationDrawerFHprtrg(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r32, androidx.compose.ui.Modifier r33, androidx.compose.material3.DrawerState r34, boolean r35, long r36, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r38, androidx.compose.runtime.Composer r39, int r40, int r41) {
        /*
            r1 = r32
            r7 = r38
            r8 = r40
            java.lang.String r0 = "drawerContent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = -1169303680(0xffffffffba4dd780, float:-7.8522414E-4)
            r2 = r39
            androidx.compose.runtime.Composer r2 = r2.startRestartGroup(r0)
            java.lang.String r3 = "C(ModalNavigationDrawer)P(1,4,2,3,5:c#ui.graphics.Color)256@9399L39,258@9516L10,261@9584L24,262@9634L33,*263@9706L7,267@9910L7,268@9945L1722:NavigationDrawer.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r3)
            r3 = r41 & 1
            r4 = 2
            if (r3 == 0) goto L_0x0028
            r3 = r8 | 6
            goto L_0x0038
        L_0x0028:
            r3 = r8 & 14
            if (r3 != 0) goto L_0x0037
            boolean r3 = r2.changedInstance(r1)
            if (r3 == 0) goto L_0x0034
            r3 = 4
            goto L_0x0035
        L_0x0034:
            r3 = r4
        L_0x0035:
            r3 = r3 | r8
            goto L_0x0038
        L_0x0037:
            r3 = r8
        L_0x0038:
            r5 = r41 & 2
            if (r5 == 0) goto L_0x003f
            r3 = r3 | 48
            goto L_0x0052
        L_0x003f:
            r6 = r8 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0052
            r6 = r33
            boolean r9 = r2.changed((java.lang.Object) r6)
            if (r9 == 0) goto L_0x004e
            r9 = 32
            goto L_0x0050
        L_0x004e:
            r9 = 16
        L_0x0050:
            r3 = r3 | r9
            goto L_0x0054
        L_0x0052:
            r6 = r33
        L_0x0054:
            r9 = r8 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x006d
            r9 = r41 & 4
            if (r9 != 0) goto L_0x0067
            r9 = r34
            boolean r10 = r2.changed((java.lang.Object) r9)
            if (r10 == 0) goto L_0x0069
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x006b
        L_0x0067:
            r9 = r34
        L_0x0069:
            r10 = 128(0x80, float:1.794E-43)
        L_0x006b:
            r3 = r3 | r10
            goto L_0x006f
        L_0x006d:
            r9 = r34
        L_0x006f:
            r10 = r41 & 8
            if (r10 == 0) goto L_0x0076
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0089
        L_0x0076:
            r11 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r11 != 0) goto L_0x0089
            r11 = r35
            boolean r12 = r2.changed((boolean) r11)
            if (r12 == 0) goto L_0x0085
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0087
        L_0x0085:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0087:
            r3 = r3 | r12
            goto L_0x008b
        L_0x0089:
            r11 = r35
        L_0x008b:
            r12 = 57344(0xe000, float:8.0356E-41)
            r12 = r12 & r8
            if (r12 != 0) goto L_0x00a6
            r12 = r41 & 16
            if (r12 != 0) goto L_0x00a0
            r12 = r36
            boolean r14 = r2.changed((long) r12)
            if (r14 == 0) goto L_0x00a2
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a4
        L_0x00a0:
            r12 = r36
        L_0x00a2:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x00a4:
            r3 = r3 | r14
            goto L_0x00a8
        L_0x00a6:
            r12 = r36
        L_0x00a8:
            r14 = r41 & 32
            if (r14 == 0) goto L_0x00b0
            r14 = 196608(0x30000, float:2.75506E-40)
        L_0x00ae:
            r3 = r3 | r14
            goto L_0x00c1
        L_0x00b0:
            r14 = 458752(0x70000, float:6.42848E-40)
            r14 = r14 & r8
            if (r14 != 0) goto L_0x00c1
            boolean r14 = r2.changedInstance(r7)
            if (r14 == 0) goto L_0x00be
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ae
        L_0x00be:
            r14 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00ae
        L_0x00c1:
            r14 = 374491(0x5b6db, float:5.24774E-40)
            r14 = r14 & r3
            r15 = 74898(0x12492, float:1.04954E-40)
            if (r14 != r15) goto L_0x00d8
            boolean r14 = r2.getSkipping()
            if (r14 != 0) goto L_0x00d1
            goto L_0x00d8
        L_0x00d1:
            r2.skipToGroupEnd()
            r3 = r9
            r4 = r11
            goto L_0x059a
        L_0x00d8:
            r2.startDefaults()
            r14 = r8 & 1
            r15 = -57345(0xffffffffffff1fff, float:NaN)
            r0 = 1
            if (r14 == 0) goto L_0x00fe
            boolean r14 = r2.getDefaultsInvalid()
            if (r14 == 0) goto L_0x00ea
            goto L_0x00fe
        L_0x00ea:
            r2.skipToGroupEnd()
            r5 = r41 & 4
            if (r5 == 0) goto L_0x00f3
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00f3:
            r5 = r41 & 16
            if (r5 == 0) goto L_0x00f8
        L_0x00f7:
            r3 = r3 & r15
        L_0x00f8:
            r15 = r3
            r3 = r9
            r5 = r11
            r29 = r12
            goto L_0x0123
        L_0x00fe:
            if (r5 == 0) goto L_0x0105
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r5 = (androidx.compose.ui.Modifier) r5
            r6 = r5
        L_0x0105:
            r5 = r41 & 4
            if (r5 == 0) goto L_0x0114
            androidx.compose.material3.DrawerValue r5 = androidx.compose.material3.DrawerValue.Closed
            r9 = 0
            r14 = 6
            androidx.compose.material3.DrawerState r5 = rememberDrawerState(r5, r9, r2, r14, r4)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
            r9 = r5
        L_0x0114:
            if (r10 == 0) goto L_0x0117
            r11 = r0
        L_0x0117:
            r5 = r41 & 16
            if (r5 == 0) goto L_0x00f8
            androidx.compose.material3.DrawerDefaults r5 = androidx.compose.material3.DrawerDefaults.INSTANCE
            r10 = 6
            long r12 = r5.getScrimColor(r2, r10)
            goto L_0x00f7
        L_0x0123:
            r2.endDefaults()
            boolean r9 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r9 == 0) goto L_0x0136
            r9 = -1
            java.lang.String r10 = "androidx.compose.material3.ModalNavigationDrawer (NavigationDrawer.kt:253)"
            r11 = -1169303680(0xffffffffba4dd780, float:-7.8522414E-4)
            androidx.compose.runtime.ComposerKt.traceEventStart(r11, r15, r9, r10)
        L_0x0136:
            r9 = 773894976(0x2e20b340, float:3.6538994E-11)
            r2.startReplaceableGroup(r9)
            java.lang.String r9 = "CC(rememberCoroutineScope)476@19869L144:Effects.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r9)
            r9 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r2.startReplaceableGroup(r9)
            java.lang.String r9 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r9)
            java.lang.Object r9 = r2.rememberedValue()
            androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r10 = r10.getEmpty()
            if (r9 != r10) goto L_0x0169
            kotlin.coroutines.EmptyCoroutineContext r9 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlin.coroutines.CoroutineContext r9 = (kotlin.coroutines.CoroutineContext) r9
            kotlinx.coroutines.CoroutineScope r9 = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(r9, r2)
            androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller r10 = new androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller
            r10.<init>(r9)
            r2.updateRememberedValue(r10)
            r9 = r10
        L_0x0169:
            r2.endReplaceableGroup()
            androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller r9 = (androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) r9
            kotlinx.coroutines.CoroutineScope r14 = r9.getCoroutineScope()
            r2.endReplaceableGroup()
            androidx.compose.material3.Strings$Companion r9 = androidx.compose.material3.Strings.Companion
            int r9 = r9.m1612getNavigationMenuadMyvUU()
            r10 = 6
            java.lang.String r12 = androidx.compose.material3.Strings_androidKt.m1632getStringNWtq28(r9, r2, r10)
            androidx.compose.runtime.ProvidableCompositionLocal r9 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r9 = (androidx.compose.runtime.CompositionLocal) r9
            java.lang.String r10 = "CC:CompositionLocal.kt#9igjgp"
            r13 = 2023513938(0x789c5f52, float:2.5372864E34)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r13, r10)
            java.lang.Object r9 = r2.consume(r9)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.ui.unit.Density r9 = (androidx.compose.ui.unit.Density) r9
            androidx.compose.material3.tokens.NavigationDrawerTokens r10 = androidx.compose.material3.tokens.NavigationDrawerTokens.INSTANCE
            float r10 = r10.m2151getContainerWidthD9Ej5fM()
            float r9 = r9.m5607toPx0680j_4(r10)
            float r9 = -r9
            kotlin.Pair[] r4 = new kotlin.Pair[r4]
            java.lang.Float r10 = java.lang.Float.valueOf(r9)
            androidx.compose.material3.DrawerValue r11 = androidx.compose.material3.DrawerValue.Closed
            kotlin.Pair r10 = kotlin.TuplesKt.to(r10, r11)
            r11 = 0
            r4[r11] = r10
            r10 = 0
            java.lang.Float r11 = java.lang.Float.valueOf(r10)
            androidx.compose.material3.DrawerValue r10 = androidx.compose.material3.DrawerValue.Open
            kotlin.Pair r10 = kotlin.TuplesKt.to(r11, r10)
            r4[r0] = r10
            java.util.Map r19 = kotlin.collections.MapsKt.mapOf(r4)
            androidx.compose.runtime.ProvidableCompositionLocal r4 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            androidx.compose.runtime.CompositionLocal r4 = (androidx.compose.runtime.CompositionLocal) r4
            java.lang.String r10 = "CC:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r13, r10)
            java.lang.Object r4 = r2.consume(r4)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.ui.unit.LayoutDirection r10 = androidx.compose.ui.unit.LayoutDirection.Rtl
            if (r4 != r10) goto L_0x01db
            r22 = r0
            goto L_0x01dd
        L_0x01db:
            r22 = 0
        L_0x01dd:
            r4 = 0
            r10 = 0
            androidx.compose.ui.Modifier r17 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(r6, r4, r0, r10)
            androidx.compose.material3.SwipeableState r18 = r3.getSwipeableState$material3_release()
            androidx.compose.foundation.gestures.Orientation r20 = androidx.compose.foundation.gestures.Orientation.Horizontal
            float r26 = DrawerVelocityThreshold
            r23 = 0
            androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$1 r4 = androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$1.INSTANCE
            r24 = r4
            kotlin.jvm.functions.Function2 r24 = (kotlin.jvm.functions.Function2) r24
            r25 = 0
            r27 = 32
            r28 = 0
            r21 = r5
            androidx.compose.ui.Modifier r4 = androidx.compose.material3.SwipeableKt.m1656swipeablepPrIpRY$default(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r11 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r2.startReplaceableGroup(r11)
            java.lang.String r10 = "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r10)
            androidx.compose.ui.Alignment$Companion r16 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment r0 = r16.getTopStart()
            r11 = 0
            androidx.compose.ui.layout.MeasurePolicy r0 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(r0, r11, r2, r11)
            r11 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r2.startReplaceableGroup(r11)
            java.lang.String r11 = "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh"
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r11)
            androidx.compose.runtime.ProvidableCompositionLocal r16 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            r17 = r6
            r6 = r16
            androidx.compose.runtime.CompositionLocal r6 = (androidx.compose.runtime.CompositionLocal) r6
            java.lang.String r8 = "C:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r13, r8)
            java.lang.Object r6 = r2.consume(r6)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.ui.unit.Density r6 = (androidx.compose.ui.unit.Density) r6
            androidx.compose.runtime.ProvidableCompositionLocal r16 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            r37 = r12
            r12 = r16
            androidx.compose.runtime.CompositionLocal r12 = (androidx.compose.runtime.CompositionLocal) r12
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r13, r8)
            java.lang.Object r12 = r2.consume(r12)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.ui.unit.LayoutDirection r12 = (androidx.compose.ui.unit.LayoutDirection) r12
            androidx.compose.runtime.ProvidableCompositionLocal r16 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            r1 = r16
            androidx.compose.runtime.CompositionLocal r1 = (androidx.compose.runtime.CompositionLocal) r1
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r13, r8)
            java.lang.Object r1 = r2.consume(r1)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.ui.platform.ViewConfiguration r1 = (androidx.compose.ui.platform.ViewConfiguration) r1
            androidx.compose.ui.node.ComposeUiNode$Companion r16 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function0 r13 = r16.getConstructor()
            kotlin.jvm.functions.Function3 r4 = androidx.compose.ui.layout.LayoutKt.materializerOf(r4)
            r16 = r9
            androidx.compose.runtime.Applier r9 = r2.getApplier()
            boolean r9 = r9 instanceof androidx.compose.runtime.Applier
            if (r9 != 0) goto L_0x0279
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x0279:
            r2.startReusableNode()
            boolean r9 = r2.getInserting()
            if (r9 == 0) goto L_0x0286
            r2.createNode(r13)
            goto L_0x0289
        L_0x0286:
            r2.useNode()
        L_0x0289:
            r2.disableReusing()
            androidx.compose.runtime.Composer r9 = androidx.compose.runtime.Updater.m2444constructorimpl(r2)
            androidx.compose.ui.node.ComposeUiNode$Companion r13 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r13 = r13.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r9, r0, r13)
            androidx.compose.ui.node.ComposeUiNode$Companion r0 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r0 = r0.getSetDensity()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r9, r6, r0)
            androidx.compose.ui.node.ComposeUiNode$Companion r0 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r0 = r0.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r9, r12, r0)
            androidx.compose.ui.node.ComposeUiNode$Companion r0 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r0 = r0.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r9, r1, r0)
            r2.enableReusing()
            androidx.compose.runtime.Composer r0 = androidx.compose.runtime.SkippableUpdater.m2436constructorimpl(r2)
            androidx.compose.runtime.SkippableUpdater r0 = androidx.compose.runtime.SkippableUpdater.m2435boximpl(r0)
            r1 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            r4.invoke(r0, r2, r6)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r2.startReplaceableGroup(r0)
            r1 = -1253629305(0xffffffffb5472287, float:-7.418352E-7)
            java.lang.String r4 = "C72@3384L9:Box.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r1, r4)
            androidx.compose.foundation.layout.BoxScopeInstance r6 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE
            androidx.compose.foundation.layout.BoxScope r6 = (androidx.compose.foundation.layout.BoxScope) r6
            r6 = 2009205847(0x77c20c57, float:7.87153E33)
            java.lang.String r9 = "C282@10437L37,295@10832L95,285@10483L486,302@11028L55,300@10978L683:NavigationDrawer.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r6, r9)
            r6 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r2.startReplaceableGroup(r6)
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r10)
            androidx.compose.ui.Modifier$Companion r9 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r9 = (androidx.compose.ui.Modifier) r9
            androidx.compose.ui.Alignment$Companion r12 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment r12 = r12.getTopStart()
            r13 = 0
            androidx.compose.ui.layout.MeasurePolicy r12 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(r12, r13, r2, r13)
            r13 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r2.startReplaceableGroup(r13)
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r11)
            androidx.compose.runtime.ProvidableCompositionLocal r19 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            r6 = r19
            androidx.compose.runtime.CompositionLocal r6 = (androidx.compose.runtime.CompositionLocal) r6
            r13 = 2023513938(0x789c5f52, float:2.5372864E34)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r13, r8)
            java.lang.Object r6 = r2.consume(r6)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.ui.unit.Density r6 = (androidx.compose.ui.unit.Density) r6
            androidx.compose.runtime.ProvidableCompositionLocal r18 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            r1 = r18
            androidx.compose.runtime.CompositionLocal r1 = (androidx.compose.runtime.CompositionLocal) r1
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r13, r8)
            java.lang.Object r1 = r2.consume(r1)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.ui.unit.LayoutDirection r1 = (androidx.compose.ui.unit.LayoutDirection) r1
            androidx.compose.runtime.ProvidableCompositionLocal r18 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            r0 = r18
            androidx.compose.runtime.CompositionLocal r0 = (androidx.compose.runtime.CompositionLocal) r0
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r13, r8)
            java.lang.Object r0 = r2.consume(r0)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.ui.platform.ViewConfiguration r0 = (androidx.compose.ui.platform.ViewConfiguration) r0
            androidx.compose.ui.node.ComposeUiNode$Companion r18 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function0 r13 = r18.getConstructor()
            kotlin.jvm.functions.Function3 r9 = androidx.compose.ui.layout.LayoutKt.materializerOf(r9)
            r18 = r10
            androidx.compose.runtime.Applier r10 = r2.getApplier()
            boolean r10 = r10 instanceof androidx.compose.runtime.Applier
            if (r10 != 0) goto L_0x0358
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x0358:
            r2.startReusableNode()
            boolean r10 = r2.getInserting()
            if (r10 == 0) goto L_0x0365
            r2.createNode(r13)
            goto L_0x0368
        L_0x0365:
            r2.useNode()
        L_0x0368:
            r2.disableReusing()
            androidx.compose.runtime.Composer r10 = androidx.compose.runtime.Updater.m2444constructorimpl(r2)
            androidx.compose.ui.node.ComposeUiNode$Companion r13 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r13 = r13.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r10, r12, r13)
            androidx.compose.ui.node.ComposeUiNode$Companion r12 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r12 = r12.getSetDensity()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r10, r6, r12)
            androidx.compose.ui.node.ComposeUiNode$Companion r6 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r6 = r6.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r10, r1, r6)
            androidx.compose.ui.node.ComposeUiNode$Companion r1 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r1 = r1.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r10, r0, r1)
            r2.enableReusing()
            androidx.compose.runtime.Composer r0 = androidx.compose.runtime.SkippableUpdater.m2436constructorimpl(r2)
            androidx.compose.runtime.SkippableUpdater r0 = androidx.compose.runtime.SkippableUpdater.m2435boximpl(r0)
            r1 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            r9.invoke(r0, r2, r6)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r2.startReplaceableGroup(r0)
            r0 = -1253629305(0xffffffffb5472287, float:-7.418352E-7)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r0, r4)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE
            androidx.compose.foundation.layout.BoxScope r0 = (androidx.compose.foundation.layout.BoxScope) r0
            r0 = -860470390(0xffffffffccb6438a, float:-9.5558736E7)
            java.lang.String r6 = "C283@10455L9:NavigationDrawer.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r0, r6)
            int r0 = r15 >> 15
            r0 = r0 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7.invoke(r2, r0)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            r2.endReplaceableGroup()
            r2.endNode()
            r2.endReplaceableGroup()
            r2.endReplaceableGroup()
            boolean r9 = r3.isOpen()
            androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$2 r0 = new androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$2
            r0.<init>(r5, r3, r14)
            r10 = r0
            kotlin.jvm.functions.Function0 r10 = (kotlin.jvm.functions.Function0) r10
            java.lang.Float r0 = java.lang.Float.valueOf(r16)
            r6 = 0
            java.lang.Float r12 = java.lang.Float.valueOf(r6)
            r6 = 1618982084(0x607fb4c4, float:7.370227E19)
            r2.startReplaceableGroup(r6)
            java.lang.String r6 = "CC(remember)P(1,2,3):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r6)
            boolean r0 = r2.changed((java.lang.Object) r0)
            boolean r6 = r2.changed((java.lang.Object) r12)
            r0 = r0 | r6
            boolean r6 = r2.changed((java.lang.Object) r3)
            r0 = r0 | r6
            java.lang.Object r6 = r2.rememberedValue()
            if (r0 != 0) goto L_0x0417
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r0 = r0.getEmpty()
            if (r6 != r0) goto L_0x0425
        L_0x0417:
            androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$3$1 r0 = new androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$3$1
            r6 = r16
            r12 = 0
            r0.<init>(r6, r12, r3)
            r6 = r0
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r2.updateRememberedValue(r6)
        L_0x0425:
            r2.endReplaceableGroup()
            r0 = r6
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            int r6 = r15 >> 3
            r6 = r6 & 7168(0x1c00, float:1.0045E-41)
            r12 = r18
            r33 = r5
            r13 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r5 = r1
            r1 = r11
            r11 = r0
            r0 = r37
            r31 = r12
            r12 = r29
            r5 = r14
            r14 = r2
            r18 = r15
            r15 = r6
            m1458ScrimBx497Mc(r9, r10, r11, r12, r14, r15)
            androidx.compose.ui.Modifier$Companion r6 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r6 = (androidx.compose.ui.Modifier) r6
            r9 = 1157296644(0x44faf204, float:2007.563)
            r2.startReplaceableGroup(r9)
            java.lang.String r9 = "CC(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r9)
            boolean r9 = r2.changed((java.lang.Object) r3)
            java.lang.Object r10 = r2.rememberedValue()
            if (r9 != 0) goto L_0x0468
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r9 = r9.getEmpty()
            if (r10 != r9) goto L_0x0473
        L_0x0468:
            androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$4$1 r9 = new androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$4$1
            r9.<init>(r3)
            r10 = r9
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            r2.updateRememberedValue(r10)
        L_0x0473:
            r2.endReplaceableGroup()
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            androidx.compose.ui.Modifier r6 = androidx.compose.foundation.layout.OffsetKt.offset(r6, r10)
            androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$5 r9 = new androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$5
            r9.<init>(r0, r3, r5)
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            r0 = 0
            r5 = 0
            r10 = 1
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(r6, r5, r9, r10, r0)
            r6 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r2.startReplaceableGroup(r6)
            r6 = r31
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r6)
            androidx.compose.ui.Alignment$Companion r6 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment r6 = r6.getTopStart()
            androidx.compose.ui.layout.MeasurePolicy r6 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(r6, r5, r2, r5)
            r5 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r2.startReplaceableGroup(r5)
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r1)
            androidx.compose.runtime.ProvidableCompositionLocal r1 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r1 = (androidx.compose.runtime.CompositionLocal) r1
            r5 = 2023513938(0x789c5f52, float:2.5372864E34)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r5, r8)
            java.lang.Object r1 = r2.consume(r1)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.ui.unit.Density r1 = (androidx.compose.ui.unit.Density) r1
            androidx.compose.runtime.ProvidableCompositionLocal r9 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            androidx.compose.runtime.CompositionLocal r9 = (androidx.compose.runtime.CompositionLocal) r9
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r5, r8)
            java.lang.Object r9 = r2.consume(r9)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.ui.unit.LayoutDirection r9 = (androidx.compose.ui.unit.LayoutDirection) r9
            androidx.compose.runtime.ProvidableCompositionLocal r10 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            androidx.compose.runtime.CompositionLocal r10 = (androidx.compose.runtime.CompositionLocal) r10
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r5, r8)
            java.lang.Object r5 = r2.consume(r10)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.ui.platform.ViewConfiguration r5 = (androidx.compose.ui.platform.ViewConfiguration) r5
            androidx.compose.ui.node.ComposeUiNode$Companion r8 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function0 r8 = r8.getConstructor()
            kotlin.jvm.functions.Function3 r0 = androidx.compose.ui.layout.LayoutKt.materializerOf(r0)
            androidx.compose.runtime.Applier r10 = r2.getApplier()
            boolean r10 = r10 instanceof androidx.compose.runtime.Applier
            if (r10 != 0) goto L_0x04f6
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x04f6:
            r2.startReusableNode()
            boolean r10 = r2.getInserting()
            if (r10 == 0) goto L_0x0503
            r2.createNode(r8)
            goto L_0x0506
        L_0x0503:
            r2.useNode()
        L_0x0506:
            r2.disableReusing()
            androidx.compose.runtime.Composer r8 = androidx.compose.runtime.Updater.m2444constructorimpl(r2)
            androidx.compose.ui.node.ComposeUiNode$Companion r10 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r10 = r10.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r8, r6, r10)
            androidx.compose.ui.node.ComposeUiNode$Companion r6 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r6 = r6.getSetDensity()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r8, r1, r6)
            androidx.compose.ui.node.ComposeUiNode$Companion r1 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r1 = r1.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r8, r9, r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r1 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r1 = r1.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r8, r5, r1)
            r2.enableReusing()
            androidx.compose.runtime.Composer r1 = androidx.compose.runtime.SkippableUpdater.m2436constructorimpl(r2)
            androidx.compose.runtime.SkippableUpdater r1 = androidx.compose.runtime.SkippableUpdater.m2435boximpl(r1)
            r5 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.invoke(r1, r2, r5)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r2.startReplaceableGroup(r0)
            r0 = -1253629305(0xffffffffb5472287, float:-7.418352E-7)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r0, r4)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE
            androidx.compose.foundation.layout.BoxScope r0 = (androidx.compose.foundation.layout.BoxScope) r0
            r0 = -860469209(0xffffffffccb64827, float:-9.5568184E7)
            java.lang.String r1 = "C317@11636L15:NavigationDrawer.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r0, r1)
            r0 = r18 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = r32
            r1.invoke(r2, r0)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            r2.endReplaceableGroup()
            r2.endNode()
            r2.endReplaceableGroup()
            r2.endReplaceableGroup()
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            r2.endReplaceableGroup()
            r2.endNode()
            r2.endReplaceableGroup()
            r2.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0594
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0594:
            r4 = r33
            r6 = r17
            r12 = r29
        L_0x059a:
            androidx.compose.runtime.ScopeUpdateScope r10 = r2.endRestartGroup()
            if (r10 != 0) goto L_0x05a1
            goto L_0x05b6
        L_0x05a1:
            androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$3 r11 = new androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$3
            r0 = r11
            r1 = r32
            r2 = r6
            r5 = r12
            r7 = r38
            r8 = r40
            r9 = r41
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9)
            kotlin.jvm.functions.Function2 r11 = (kotlin.jvm.functions.Function2) r11
            r10.updateScope(r11)
        L_0x05b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.m1456ModalNavigationDrawerFHprtrg(kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, androidx.compose.material3.DrawerState, boolean, long, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:117:0x0581  */
    /* JADX WARNING: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void DismissibleNavigationDrawer(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r28, androidx.compose.ui.Modifier r29, androidx.compose.material3.DrawerState r30, boolean r31, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r32, androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            r1 = r28
            r5 = r32
            r6 = r34
            java.lang.String r0 = "drawerContent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 398812198(0x17c56426, float:1.2756108E-24)
            r2 = r33
            androidx.compose.runtime.Composer r2 = r2.startRestartGroup(r0)
            java.lang.String r3 = "C(DismissibleNavigationDrawer)P(1,4,2,3)347@12931L39,*352@13151L7,356@13256L24,357@13306L33,360@13464L7,361@13499L1566:NavigationDrawer.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r3)
            r3 = r35 & 1
            r4 = 2
            if (r3 == 0) goto L_0x0028
            r3 = r6 | 6
            goto L_0x0038
        L_0x0028:
            r3 = r6 & 14
            if (r3 != 0) goto L_0x0037
            boolean r3 = r2.changedInstance(r1)
            if (r3 == 0) goto L_0x0034
            r3 = 4
            goto L_0x0035
        L_0x0034:
            r3 = r4
        L_0x0035:
            r3 = r3 | r6
            goto L_0x0038
        L_0x0037:
            r3 = r6
        L_0x0038:
            r7 = r35 & 2
            if (r7 == 0) goto L_0x003f
            r3 = r3 | 48
            goto L_0x0052
        L_0x003f:
            r8 = r6 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x0052
            r8 = r29
            boolean r9 = r2.changed((java.lang.Object) r8)
            if (r9 == 0) goto L_0x004e
            r9 = 32
            goto L_0x0050
        L_0x004e:
            r9 = 16
        L_0x0050:
            r3 = r3 | r9
            goto L_0x0054
        L_0x0052:
            r8 = r29
        L_0x0054:
            r9 = r6 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x006d
            r9 = r35 & 4
            if (r9 != 0) goto L_0x0067
            r9 = r30
            boolean r10 = r2.changed((java.lang.Object) r9)
            if (r10 == 0) goto L_0x0069
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x006b
        L_0x0067:
            r9 = r30
        L_0x0069:
            r10 = 128(0x80, float:1.794E-43)
        L_0x006b:
            r3 = r3 | r10
            goto L_0x006f
        L_0x006d:
            r9 = r30
        L_0x006f:
            r10 = r35 & 8
            if (r10 == 0) goto L_0x0076
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0089
        L_0x0076:
            r11 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r11 != 0) goto L_0x0089
            r11 = r31
            boolean r12 = r2.changed((boolean) r11)
            if (r12 == 0) goto L_0x0085
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0087
        L_0x0085:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0087:
            r3 = r3 | r12
            goto L_0x008b
        L_0x0089:
            r11 = r31
        L_0x008b:
            r12 = r35 & 16
            if (r12 == 0) goto L_0x0092
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a4
        L_0x0092:
            r12 = 57344(0xe000, float:8.0356E-41)
            r12 = r12 & r6
            if (r12 != 0) goto L_0x00a4
            boolean r12 = r2.changedInstance(r5)
            if (r12 == 0) goto L_0x00a1
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a3
        L_0x00a1:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x00a3:
            r3 = r3 | r12
        L_0x00a4:
            r12 = 46811(0xb6db, float:6.5596E-41)
            r12 = r12 & r3
            r13 = 9362(0x2492, float:1.3119E-41)
            if (r12 != r13) goto L_0x00ba
            boolean r12 = r2.getSkipping()
            if (r12 != 0) goto L_0x00b3
            goto L_0x00ba
        L_0x00b3:
            r2.skipToGroupEnd()
            r3 = r9
            r4 = r11
            goto L_0x057a
        L_0x00ba:
            r2.startDefaults()
            r12 = r6 & 1
            r13 = 0
            r14 = 6
            r15 = 1
            if (r12 == 0) goto L_0x00d5
            boolean r12 = r2.getDefaultsInvalid()
            if (r12 == 0) goto L_0x00cb
            goto L_0x00d5
        L_0x00cb:
            r2.skipToGroupEnd()
            r7 = r35 & 4
            if (r7 == 0) goto L_0x00ec
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x00ec
        L_0x00d5:
            if (r7 == 0) goto L_0x00dc
            androidx.compose.ui.Modifier$Companion r7 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r7 = (androidx.compose.ui.Modifier) r7
            r8 = r7
        L_0x00dc:
            r7 = r35 & 4
            if (r7 == 0) goto L_0x00e9
            androidx.compose.material3.DrawerValue r7 = androidx.compose.material3.DrawerValue.Closed
            androidx.compose.material3.DrawerState r7 = rememberDrawerState(r7, r13, r2, r14, r4)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
            r9 = r7
        L_0x00e9:
            if (r10 == 0) goto L_0x00ec
            r11 = r15
        L_0x00ec:
            r2.endDefaults()
            boolean r7 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r7 == 0) goto L_0x00fc
            r7 = -1
            java.lang.String r10 = "androidx.compose.material3.DismissibleNavigationDrawer (NavigationDrawer.kt:344)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r3, r7, r10)
        L_0x00fc:
            androidx.compose.material3.tokens.NavigationDrawerTokens r0 = androidx.compose.material3.tokens.NavigationDrawerTokens.INSTANCE
            float r0 = r0.m2151getContainerWidthD9Ej5fM()
            androidx.compose.runtime.ProvidableCompositionLocal r7 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r7 = (androidx.compose.runtime.CompositionLocal) r7
            r10 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r12 = "CC:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r10, r12)
            java.lang.Object r7 = r2.consume(r7)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.ui.unit.Density r7 = (androidx.compose.ui.unit.Density) r7
            float r0 = r7.m5607toPx0680j_4(r0)
            float r0 = -r0
            r7 = 773894976(0x2e20b340, float:3.6538994E-11)
            r2.startReplaceableGroup(r7)
            java.lang.String r7 = "CC(rememberCoroutineScope)476@19869L144:Effects.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r7)
            r7 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r2.startReplaceableGroup(r7)
            java.lang.String r7 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r7)
            java.lang.Object r7 = r2.rememberedValue()
            androidx.compose.runtime.Composer$Companion r16 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r13 = r16.getEmpty()
            if (r7 != r13) goto L_0x0151
            kotlin.coroutines.EmptyCoroutineContext r7 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlin.coroutines.CoroutineContext r7 = (kotlin.coroutines.CoroutineContext) r7
            kotlinx.coroutines.CoroutineScope r7 = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(r7, r2)
            androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller r13 = new androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller
            r13.<init>(r7)
            r2.updateRememberedValue(r13)
            r7 = r13
        L_0x0151:
            r2.endReplaceableGroup()
            androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller r7 = (androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) r7
            kotlinx.coroutines.CoroutineScope r7 = r7.getCoroutineScope()
            r2.endReplaceableGroup()
            androidx.compose.material3.Strings$Companion r13 = androidx.compose.material3.Strings.Companion
            int r13 = r13.m1612getNavigationMenuadMyvUU()
            java.lang.String r13 = androidx.compose.material3.Strings_androidKt.m1632getStringNWtq28(r13, r2, r14)
            kotlin.Pair[] r4 = new kotlin.Pair[r4]
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            androidx.compose.material3.DrawerValue r14 = androidx.compose.material3.DrawerValue.Closed
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r14)
            r14 = 0
            r4[r14] = r0
            r0 = 0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            androidx.compose.material3.DrawerValue r14 = androidx.compose.material3.DrawerValue.Open
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r14)
            r4[r15] = r0
            java.util.Map r18 = kotlin.collections.MapsKt.mapOf(r4)
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            androidx.compose.runtime.CompositionLocal r0 = (androidx.compose.runtime.CompositionLocal) r0
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r10, r12)
            java.lang.Object r0 = r2.consume(r0)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.ui.unit.LayoutDirection r4 = androidx.compose.ui.unit.LayoutDirection.Rtl
            if (r0 != r4) goto L_0x019e
            r21 = r15
            goto L_0x01a0
        L_0x019e:
            r21 = 0
        L_0x01a0:
            androidx.compose.material3.SwipeableState r17 = r9.getSwipeableState$material3_release()
            androidx.compose.foundation.gestures.Orientation r19 = androidx.compose.foundation.gestures.Orientation.Horizontal
            float r25 = DrawerVelocityThreshold
            r22 = 0
            androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$1 r0 = androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$1.INSTANCE
            r23 = r0
            kotlin.jvm.functions.Function2 r23 = (kotlin.jvm.functions.Function2) r23
            r24 = 0
            r26 = 32
            r27 = 0
            r16 = r8
            r20 = r11
            androidx.compose.ui.Modifier r0 = androidx.compose.material3.SwipeableKt.m1656swipeablepPrIpRY$default(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r4 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r2.startReplaceableGroup(r4)
            java.lang.String r14 = "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r14)
            androidx.compose.ui.Alignment$Companion r16 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment r4 = r16.getTopStart()
            r15 = 0
            androidx.compose.ui.layout.MeasurePolicy r4 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(r4, r15, r2, r15)
            r15 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r2.startReplaceableGroup(r15)
            java.lang.String r15 = "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh"
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r15)
            androidx.compose.runtime.ProvidableCompositionLocal r17 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            r6 = r17
            androidx.compose.runtime.CompositionLocal r6 = (androidx.compose.runtime.CompositionLocal) r6
            r17 = r8
            java.lang.String r8 = "C:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r10, r8)
            java.lang.Object r6 = r2.consume(r6)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.ui.unit.Density r6 = (androidx.compose.ui.unit.Density) r6
            androidx.compose.runtime.ProvidableCompositionLocal r18 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            r19 = r11
            r11 = r18
            androidx.compose.runtime.CompositionLocal r11 = (androidx.compose.runtime.CompositionLocal) r11
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r10, r8)
            java.lang.Object r11 = r2.consume(r11)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.ui.unit.LayoutDirection r11 = (androidx.compose.ui.unit.LayoutDirection) r11
            androidx.compose.runtime.ProvidableCompositionLocal r18 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            r5 = r18
            androidx.compose.runtime.CompositionLocal r5 = (androidx.compose.runtime.CompositionLocal) r5
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r10, r8)
            java.lang.Object r5 = r2.consume(r5)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.ui.platform.ViewConfiguration r5 = (androidx.compose.ui.platform.ViewConfiguration) r5
            androidx.compose.ui.node.ComposeUiNode$Companion r18 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function0 r10 = r18.getConstructor()
            kotlin.jvm.functions.Function3 r0 = androidx.compose.ui.layout.LayoutKt.materializerOf(r0)
            androidx.compose.runtime.Applier r1 = r2.getApplier()
            boolean r1 = r1 instanceof androidx.compose.runtime.Applier
            if (r1 != 0) goto L_0x0236
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x0236:
            r2.startReusableNode()
            boolean r1 = r2.getInserting()
            if (r1 == 0) goto L_0x0243
            r2.createNode(r10)
            goto L_0x0246
        L_0x0243:
            r2.useNode()
        L_0x0246:
            r2.disableReusing()
            androidx.compose.runtime.Composer r1 = androidx.compose.runtime.Updater.m2444constructorimpl(r2)
            androidx.compose.ui.node.ComposeUiNode$Companion r10 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r10 = r10.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r1, r4, r10)
            androidx.compose.ui.node.ComposeUiNode$Companion r4 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r4 = r4.getSetDensity()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r1, r6, r4)
            androidx.compose.ui.node.ComposeUiNode$Companion r4 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r4 = r4.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r1, r11, r4)
            androidx.compose.ui.node.ComposeUiNode$Companion r4 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r4 = r4.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r1, r5, r4)
            r2.enableReusing()
            androidx.compose.runtime.Composer r1 = androidx.compose.runtime.SkippableUpdater.m2436constructorimpl(r2)
            androidx.compose.runtime.SkippableUpdater r1 = androidx.compose.runtime.SkippableUpdater.m2435boximpl(r1)
            r4 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r0.invoke(r1, r2, r5)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r2.startReplaceableGroup(r0)
            r1 = -1253629305(0xffffffffb5472287, float:-7.418352E-7)
            java.lang.String r4 = "C72@3384L9:Box.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r1, r4)
            androidx.compose.foundation.layout.BoxScopeInstance r5 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE
            androidx.compose.foundation.layout.BoxScope r5 = (androidx.compose.foundation.layout.BoxScope) r5
            r5 = 973028062(0x39ff3ade, float:4.868125E-4)
            java.lang.String r6 = "C373@13915L1144:NavigationDrawer.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r5, r6)
            androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$2 r5 = new androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$2
            r5.<init>(r9)
            androidx.compose.ui.layout.MeasurePolicy r5 = (androidx.compose.ui.layout.MeasurePolicy) r5
            r6 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r2.startReplaceableGroup(r6)
            java.lang.String r6 = "CC(Layout)P(!1,2)73@2855L7,74@2910L7,75@2969L7,76@2981L460:Layout.kt#80mrfh"
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r6)
            androidx.compose.ui.Modifier$Companion r6 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r6 = (androidx.compose.ui.Modifier) r6
            androidx.compose.runtime.ProvidableCompositionLocal r10 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r10 = (androidx.compose.runtime.CompositionLocal) r10
            r11 = 2023513938(0x789c5f52, float:2.5372864E34)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r11, r12)
            java.lang.Object r10 = r2.consume(r10)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.ui.unit.Density r10 = (androidx.compose.ui.unit.Density) r10
            androidx.compose.runtime.ProvidableCompositionLocal r18 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            r1 = r18
            androidx.compose.runtime.CompositionLocal r1 = (androidx.compose.runtime.CompositionLocal) r1
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r11, r12)
            java.lang.Object r1 = r2.consume(r1)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.ui.unit.LayoutDirection r1 = (androidx.compose.ui.unit.LayoutDirection) r1
            androidx.compose.runtime.ProvidableCompositionLocal r18 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            r0 = r18
            androidx.compose.runtime.CompositionLocal r0 = (androidx.compose.runtime.CompositionLocal) r0
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r11, r12)
            java.lang.Object r0 = r2.consume(r0)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.ui.platform.ViewConfiguration r0 = (androidx.compose.ui.platform.ViewConfiguration) r0
            androidx.compose.ui.node.ComposeUiNode$Companion r11 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function0 r11 = r11.getConstructor()
            kotlin.jvm.functions.Function3 r6 = androidx.compose.ui.layout.LayoutKt.materializerOf(r6)
            androidx.compose.runtime.Applier r12 = r2.getApplier()
            boolean r12 = r12 instanceof androidx.compose.runtime.Applier
            if (r12 != 0) goto L_0x0306
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x0306:
            r2.startReusableNode()
            boolean r12 = r2.getInserting()
            if (r12 == 0) goto L_0x0313
            r2.createNode(r11)
            goto L_0x0316
        L_0x0313:
            r2.useNode()
        L_0x0316:
            androidx.compose.runtime.Composer r11 = androidx.compose.runtime.Updater.m2444constructorimpl(r2)
            androidx.compose.ui.node.ComposeUiNode$Companion r12 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r12 = r12.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r11, r5, r12)
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r5 = r5.getSetDensity()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r11, r10, r5)
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r5 = r5.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r11, r1, r5)
            androidx.compose.ui.node.ComposeUiNode$Companion r1 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r1 = r1.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r11, r0, r1)
            androidx.compose.runtime.Composer r0 = androidx.compose.runtime.SkippableUpdater.m2436constructorimpl(r2)
            androidx.compose.runtime.SkippableUpdater r0 = androidx.compose.runtime.SkippableUpdater.m2435boximpl(r0)
            r1 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r6.invoke(r0, r2, r5)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r2.startReplaceableGroup(r0)
            r0 = 94146718(0x59c909e, float:1.4723293E-35)
            java.lang.String r5 = "C374@13946L523,389@14482L45:NavigationDrawer.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r0, r5)
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$1$1 r5 = new androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$1$1
            r5.<init>(r13, r9, r7)
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            r6 = 0
            r7 = 1
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(r0, r1, r5, r7, r6)
            r5 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r2.startReplaceableGroup(r5)
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r14)
            androidx.compose.ui.Alignment$Companion r5 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment r5 = r5.getTopStart()
            androidx.compose.ui.layout.MeasurePolicy r5 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(r5, r1, r2, r1)
            r1 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r2.startReplaceableGroup(r1)
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r15)
            androidx.compose.runtime.ProvidableCompositionLocal r1 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r1 = (androidx.compose.runtime.CompositionLocal) r1
            r6 = 2023513938(0x789c5f52, float:2.5372864E34)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r6, r8)
            java.lang.Object r1 = r2.consume(r1)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.ui.unit.Density r1 = (androidx.compose.ui.unit.Density) r1
            androidx.compose.runtime.ProvidableCompositionLocal r7 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            androidx.compose.runtime.CompositionLocal r7 = (androidx.compose.runtime.CompositionLocal) r7
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r6, r8)
            java.lang.Object r7 = r2.consume(r7)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.ui.unit.LayoutDirection r7 = (androidx.compose.ui.unit.LayoutDirection) r7
            androidx.compose.runtime.ProvidableCompositionLocal r10 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            androidx.compose.runtime.CompositionLocal r10 = (androidx.compose.runtime.CompositionLocal) r10
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r6, r8)
            java.lang.Object r6 = r2.consume(r10)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.ui.platform.ViewConfiguration r6 = (androidx.compose.ui.platform.ViewConfiguration) r6
            androidx.compose.ui.node.ComposeUiNode$Companion r10 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function0 r10 = r10.getConstructor()
            kotlin.jvm.functions.Function3 r0 = androidx.compose.ui.layout.LayoutKt.materializerOf(r0)
            androidx.compose.runtime.Applier r11 = r2.getApplier()
            boolean r11 = r11 instanceof androidx.compose.runtime.Applier
            if (r11 != 0) goto L_0x03d7
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x03d7:
            r2.startReusableNode()
            boolean r11 = r2.getInserting()
            if (r11 == 0) goto L_0x03e4
            r2.createNode(r10)
            goto L_0x03e7
        L_0x03e4:
            r2.useNode()
        L_0x03e7:
            r2.disableReusing()
            androidx.compose.runtime.Composer r10 = androidx.compose.runtime.Updater.m2444constructorimpl(r2)
            androidx.compose.ui.node.ComposeUiNode$Companion r11 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r11 = r11.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r10, r5, r11)
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r5 = r5.getSetDensity()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r10, r1, r5)
            androidx.compose.ui.node.ComposeUiNode$Companion r1 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r1 = r1.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r10, r7, r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r1 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r1 = r1.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r10, r6, r1)
            r2.enableReusing()
            androidx.compose.runtime.Composer r1 = androidx.compose.runtime.SkippableUpdater.m2436constructorimpl(r2)
            androidx.compose.runtime.SkippableUpdater r1 = androidx.compose.runtime.SkippableUpdater.m2435boximpl(r1)
            r5 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r0.invoke(r1, r2, r6)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r2.startReplaceableGroup(r0)
            r0 = -1253629305(0xffffffffb5472287, float:-7.418352E-7)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r0, r4)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE
            androidx.compose.foundation.layout.BoxScope r0 = (androidx.compose.foundation.layout.BoxScope) r0
            r0 = -817267027(0xffffffffcf497ead, float:-3.38052224E9)
            java.lang.String r1 = "C387@14440L15:NavigationDrawer.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r0, r1)
            r0 = r3 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = r28
            r1.invoke(r2, r0)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            r2.endReplaceableGroup()
            r2.endNode()
            r2.endReplaceableGroup()
            r2.endReplaceableGroup()
            r0 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r2.startReplaceableGroup(r0)
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r14)
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            androidx.compose.ui.Alignment$Companion r5 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment r5 = r5.getTopStart()
            r6 = 0
            androidx.compose.ui.layout.MeasurePolicy r5 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(r5, r6, r2, r6)
            r6 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r2.startReplaceableGroup(r6)
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r15)
            androidx.compose.runtime.ProvidableCompositionLocal r6 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r6 = (androidx.compose.runtime.CompositionLocal) r6
            r7 = 2023513938(0x789c5f52, float:2.5372864E34)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r7, r8)
            java.lang.Object r6 = r2.consume(r6)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.ui.unit.Density r6 = (androidx.compose.ui.unit.Density) r6
            androidx.compose.runtime.ProvidableCompositionLocal r10 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            androidx.compose.runtime.CompositionLocal r10 = (androidx.compose.runtime.CompositionLocal) r10
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r7, r8)
            java.lang.Object r10 = r2.consume(r10)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.ui.unit.LayoutDirection r10 = (androidx.compose.ui.unit.LayoutDirection) r10
            androidx.compose.runtime.ProvidableCompositionLocal r11 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            androidx.compose.runtime.CompositionLocal r11 = (androidx.compose.runtime.CompositionLocal) r11
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r7, r8)
            java.lang.Object r7 = r2.consume(r11)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.ui.platform.ViewConfiguration r7 = (androidx.compose.ui.platform.ViewConfiguration) r7
            androidx.compose.ui.node.ComposeUiNode$Companion r8 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function0 r8 = r8.getConstructor()
            kotlin.jvm.functions.Function3 r0 = androidx.compose.ui.layout.LayoutKt.materializerOf(r0)
            androidx.compose.runtime.Applier r11 = r2.getApplier()
            boolean r11 = r11 instanceof androidx.compose.runtime.Applier
            if (r11 != 0) goto L_0x04c9
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x04c9:
            r2.startReusableNode()
            boolean r11 = r2.getInserting()
            if (r11 == 0) goto L_0x04d6
            r2.createNode(r8)
            goto L_0x04d9
        L_0x04d6:
            r2.useNode()
        L_0x04d9:
            r2.disableReusing()
            androidx.compose.runtime.Composer r8 = androidx.compose.runtime.Updater.m2444constructorimpl(r2)
            androidx.compose.ui.node.ComposeUiNode$Companion r11 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r11 = r11.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r8, r5, r11)
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r5 = r5.getSetDensity()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r8, r6, r5)
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r5 = r5.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r8, r10, r5)
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r5 = r5.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r8, r7, r5)
            r2.enableReusing()
            androidx.compose.runtime.Composer r5 = androidx.compose.runtime.SkippableUpdater.m2436constructorimpl(r2)
            androidx.compose.runtime.SkippableUpdater r5 = androidx.compose.runtime.SkippableUpdater.m2435boximpl(r5)
            r6 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r0.invoke(r5, r2, r6)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r2.startReplaceableGroup(r0)
            r0 = -1253629305(0xffffffffb5472287, float:-7.418352E-7)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r0, r4)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE
            androidx.compose.foundation.layout.BoxScope r0 = (androidx.compose.foundation.layout.BoxScope) r0
            r0 = -817266963(0xffffffffcf497eed, float:-3.38053862E9)
            java.lang.String r4 = "C390@14504L9:NavigationDrawer.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r0, r4)
            int r0 = r3 >> 12
            r0 = r0 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5 = r32
            r5.invoke(r2, r0)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            r2.endReplaceableGroup()
            r2.endNode()
            r2.endReplaceableGroup()
            r2.endReplaceableGroup()
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            r2.endReplaceableGroup()
            r2.endNode()
            r2.endReplaceableGroup()
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            r2.endReplaceableGroup()
            r2.endNode()
            r2.endReplaceableGroup()
            r2.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0575
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0575:
            r3 = r9
            r8 = r17
            r4 = r19
        L_0x057a:
            androidx.compose.runtime.ScopeUpdateScope r9 = r2.endRestartGroup()
            if (r9 != 0) goto L_0x0581
            goto L_0x0595
        L_0x0581:
            androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$3 r10 = new androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$3
            r0 = r10
            r1 = r28
            r2 = r8
            r5 = r32
            r6 = r34
            r7 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            r9.updateScope(r10)
        L_0x0595:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.DismissibleNavigationDrawer(kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, androidx.compose.material3.DrawerState, boolean, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void PermanentNavigationDrawer(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r17, androidx.compose.ui.Modifier r18, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r19, androidx.compose.runtime.Composer r20, int r21, int r22) {
        /*
            r1 = r17
            r3 = r19
            r4 = r21
            java.lang.String r0 = "drawerContent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = -276843608(0xffffffffef7fb3a8, float:-7.913587E28)
            r2 = r20
            androidx.compose.runtime.Composer r2 = r2.startRestartGroup(r0)
            java.lang.String r5 = "C(PermanentNavigationDrawer)P(1,2)429@16096L105:NavigationDrawer.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r5)
            r5 = r22 & 1
            if (r5 == 0) goto L_0x0027
            r5 = r4 | 6
            goto L_0x0037
        L_0x0027:
            r5 = r4 & 14
            if (r5 != 0) goto L_0x0036
            boolean r5 = r2.changedInstance(r1)
            if (r5 == 0) goto L_0x0033
            r5 = 4
            goto L_0x0034
        L_0x0033:
            r5 = 2
        L_0x0034:
            r5 = r5 | r4
            goto L_0x0037
        L_0x0036:
            r5 = r4
        L_0x0037:
            r6 = r22 & 2
            if (r6 == 0) goto L_0x003e
            r5 = r5 | 48
            goto L_0x0051
        L_0x003e:
            r7 = r4 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x0051
            r7 = r18
            boolean r8 = r2.changed((java.lang.Object) r7)
            if (r8 == 0) goto L_0x004d
            r8 = 32
            goto L_0x004f
        L_0x004d:
            r8 = 16
        L_0x004f:
            r5 = r5 | r8
            goto L_0x0053
        L_0x0051:
            r7 = r18
        L_0x0053:
            r8 = r22 & 4
            if (r8 == 0) goto L_0x005a
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x006a
        L_0x005a:
            r8 = r4 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x006a
            boolean r8 = r2.changedInstance(r3)
            if (r8 == 0) goto L_0x0067
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0069
        L_0x0067:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0069:
            r5 = r5 | r8
        L_0x006a:
            r8 = r5 & 731(0x2db, float:1.024E-42)
            r9 = 146(0x92, float:2.05E-43)
            if (r8 != r9) goto L_0x007d
            boolean r8 = r2.getSkipping()
            if (r8 != 0) goto L_0x0077
            goto L_0x007d
        L_0x0077:
            r2.skipToGroupEnd()
            r6 = r7
            goto L_0x028c
        L_0x007d:
            if (r6 == 0) goto L_0x0084
            androidx.compose.ui.Modifier$Companion r6 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r6 = (androidx.compose.ui.Modifier) r6
            goto L_0x0085
        L_0x0084:
            r6 = r7
        L_0x0085:
            boolean r7 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r7 == 0) goto L_0x0092
            r7 = -1
            java.lang.String r8 = "androidx.compose.material3.PermanentNavigationDrawer (NavigationDrawer.kt:424)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r5, r7, r8)
        L_0x0092:
            r0 = 0
            r7 = 0
            r8 = 1
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(r6, r0, r8, r7)
            r7 = 693286680(0x2952b718, float:4.6788176E-14)
            r2.startReplaceableGroup(r7)
            java.lang.String r7 = "CC(Row)P(2,1,3)78@3913L58,79@3976L130:Row.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r7)
            androidx.compose.foundation.layout.Arrangement r7 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            androidx.compose.foundation.layout.Arrangement$Horizontal r7 = r7.getStart()
            androidx.compose.ui.Alignment$Companion r8 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment$Vertical r8 = r8.getTop()
            r9 = 0
            androidx.compose.ui.layout.MeasurePolicy r7 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(r7, r8, r2, r9)
            r8 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r2.startReplaceableGroup(r8)
            java.lang.String r10 = "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh"
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r10)
            androidx.compose.runtime.ProvidableCompositionLocal r11 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r11 = (androidx.compose.runtime.CompositionLocal) r11
            r12 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r13 = "C:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r12, r13)
            java.lang.Object r11 = r2.consume(r11)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.ui.unit.Density r11 = (androidx.compose.ui.unit.Density) r11
            androidx.compose.runtime.ProvidableCompositionLocal r14 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            androidx.compose.runtime.CompositionLocal r14 = (androidx.compose.runtime.CompositionLocal) r14
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r12, r13)
            java.lang.Object r14 = r2.consume(r14)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.ui.unit.LayoutDirection r14 = (androidx.compose.ui.unit.LayoutDirection) r14
            androidx.compose.runtime.ProvidableCompositionLocal r15 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            androidx.compose.runtime.CompositionLocal r15 = (androidx.compose.runtime.CompositionLocal) r15
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r12, r13)
            java.lang.Object r15 = r2.consume(r15)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.ui.platform.ViewConfiguration r15 = (androidx.compose.ui.platform.ViewConfiguration) r15
            androidx.compose.ui.node.ComposeUiNode$Companion r16 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function0 r12 = r16.getConstructor()
            kotlin.jvm.functions.Function3 r0 = androidx.compose.ui.layout.LayoutKt.materializerOf(r0)
            androidx.compose.runtime.Applier r8 = r2.getApplier()
            boolean r8 = r8 instanceof androidx.compose.runtime.Applier
            if (r8 != 0) goto L_0x0110
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x0110:
            r2.startReusableNode()
            boolean r8 = r2.getInserting()
            if (r8 == 0) goto L_0x011d
            r2.createNode(r12)
            goto L_0x0120
        L_0x011d:
            r2.useNode()
        L_0x0120:
            r2.disableReusing()
            androidx.compose.runtime.Composer r8 = androidx.compose.runtime.Updater.m2444constructorimpl(r2)
            androidx.compose.ui.node.ComposeUiNode$Companion r12 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r12 = r12.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r8, r7, r12)
            androidx.compose.ui.node.ComposeUiNode$Companion r7 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r7 = r7.getSetDensity()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r8, r11, r7)
            androidx.compose.ui.node.ComposeUiNode$Companion r7 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r7 = r7.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r8, r14, r7)
            androidx.compose.ui.node.ComposeUiNode$Companion r7 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r7 = r7.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r8, r15, r7)
            r2.enableReusing()
            androidx.compose.runtime.Composer r7 = androidx.compose.runtime.SkippableUpdater.m2436constructorimpl(r2)
            androidx.compose.runtime.SkippableUpdater r7 = androidx.compose.runtime.SkippableUpdater.m2435boximpl(r7)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
            r0.invoke(r7, r2, r8)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r2.startReplaceableGroup(r0)
            r7 = -326682283(0xffffffffec873955, float:-1.3078058E27)
            java.lang.String r8 = "C80@4021L9:Row.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r7, r8)
            androidx.compose.foundation.layout.RowScopeInstance r7 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE
            androidx.compose.foundation.layout.RowScope r7 = (androidx.compose.foundation.layout.RowScope) r7
            r7 = -1153996105(0xffffffffbb376ab7, float:-0.002798719)
            java.lang.String r8 = "C430@16134L15,431@16158L37:NavigationDrawer.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r7, r8)
            r7 = r5 & 14
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r1.invoke(r2, r7)
            r7 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r2.startReplaceableGroup(r7)
            java.lang.String r7 = "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r7)
            androidx.compose.ui.Modifier$Companion r7 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r7 = (androidx.compose.ui.Modifier) r7
            androidx.compose.ui.Alignment$Companion r8 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment r8 = r8.getTopStart()
            androidx.compose.ui.layout.MeasurePolicy r8 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(r8, r9, r2, r9)
            r11 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r2.startReplaceableGroup(r11)
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r10)
            androidx.compose.runtime.ProvidableCompositionLocal r10 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r10 = (androidx.compose.runtime.CompositionLocal) r10
            r11 = 2023513938(0x789c5f52, float:2.5372864E34)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r11, r13)
            java.lang.Object r10 = r2.consume(r10)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.ui.unit.Density r10 = (androidx.compose.ui.unit.Density) r10
            androidx.compose.runtime.ProvidableCompositionLocal r12 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            androidx.compose.runtime.CompositionLocal r12 = (androidx.compose.runtime.CompositionLocal) r12
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r11, r13)
            java.lang.Object r12 = r2.consume(r12)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.ui.unit.LayoutDirection r12 = (androidx.compose.ui.unit.LayoutDirection) r12
            androidx.compose.runtime.ProvidableCompositionLocal r14 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            androidx.compose.runtime.CompositionLocal r14 = (androidx.compose.runtime.CompositionLocal) r14
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r11, r13)
            java.lang.Object r11 = r2.consume(r14)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.ui.platform.ViewConfiguration r11 = (androidx.compose.ui.platform.ViewConfiguration) r11
            androidx.compose.ui.node.ComposeUiNode$Companion r13 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function0 r13 = r13.getConstructor()
            kotlin.jvm.functions.Function3 r7 = androidx.compose.ui.layout.LayoutKt.materializerOf(r7)
            androidx.compose.runtime.Applier r14 = r2.getApplier()
            boolean r14 = r14 instanceof androidx.compose.runtime.Applier
            if (r14 != 0) goto L_0x01f0
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x01f0:
            r2.startReusableNode()
            boolean r14 = r2.getInserting()
            if (r14 == 0) goto L_0x01fd
            r2.createNode(r13)
            goto L_0x0200
        L_0x01fd:
            r2.useNode()
        L_0x0200:
            r2.disableReusing()
            androidx.compose.runtime.Composer r13 = androidx.compose.runtime.Updater.m2444constructorimpl(r2)
            androidx.compose.ui.node.ComposeUiNode$Companion r14 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r14 = r14.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r13, r8, r14)
            androidx.compose.ui.node.ComposeUiNode$Companion r8 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r8 = r8.getSetDensity()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r13, r10, r8)
            androidx.compose.ui.node.ComposeUiNode$Companion r8 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r8 = r8.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r13, r12, r8)
            androidx.compose.ui.node.ComposeUiNode$Companion r8 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r8 = r8.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r13, r11, r8)
            r2.enableReusing()
            androidx.compose.runtime.Composer r8 = androidx.compose.runtime.SkippableUpdater.m2436constructorimpl(r2)
            androidx.compose.runtime.SkippableUpdater r8 = androidx.compose.runtime.SkippableUpdater.m2435boximpl(r8)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r7.invoke(r8, r2, r9)
            r2.startReplaceableGroup(r0)
            r0 = -1253629305(0xffffffffb5472287, float:-7.418352E-7)
            java.lang.String r7 = "C72@3384L9:Box.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r0, r7)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE
            androidx.compose.foundation.layout.BoxScope r0 = (androidx.compose.foundation.layout.BoxScope) r0
            r0 = 1146973058(0x445d6b82, float:885.6798)
            java.lang.String r7 = "C432@16176L9:NavigationDrawer.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r0, r7)
            int r0 = r5 >> 6
            r0 = r0 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.invoke(r2, r0)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            r2.endReplaceableGroup()
            r2.endNode()
            r2.endReplaceableGroup()
            r2.endReplaceableGroup()
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            r2.endReplaceableGroup()
            r2.endNode()
            r2.endReplaceableGroup()
            r2.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x028c
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x028c:
            androidx.compose.runtime.ScopeUpdateScope r7 = r2.endRestartGroup()
            if (r7 != 0) goto L_0x0293
            goto L_0x02a7
        L_0x0293:
            androidx.compose.material3.NavigationDrawerKt$PermanentNavigationDrawer$2 r8 = new androidx.compose.material3.NavigationDrawerKt$PermanentNavigationDrawer$2
            r0 = r8
            r1 = r17
            r2 = r6
            r3 = r19
            r4 = r21
            r5 = r22
            r0.<init>(r1, r2, r3, r4, r5)
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            r7.updateScope(r8)
        L_0x02a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.PermanentNavigationDrawer(kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:124:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00f9  */
    /* renamed from: ModalDrawerSheet-afqeVBk  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1455ModalDrawerSheetafqeVBk(androidx.compose.ui.Modifier r25, androidx.compose.ui.graphics.Shape r26, long r27, long r29, float r31, androidx.compose.foundation.layout.WindowInsets r32, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r33, androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            r12 = r33
            r13 = r35
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = 1001163336(0x3bac8a48, float:0.005265508)
            r1 = r34
            androidx.compose.runtime.Composer r14 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(ModalDrawerSheet)P(5,3,1:c#ui.graphics.Color,2:c#ui.graphics.Color,4:c#ui.unit.Dp,6)456@17304L5,457@17359L11,458@17412L37,460@17567L12,463@17637L183:NavigationDrawer.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r1)
            r1 = r36 & 1
            if (r1 == 0) goto L_0x0022
            r2 = r13 | 6
            r3 = r2
            r2 = r25
            goto L_0x0036
        L_0x0022:
            r2 = r13 & 14
            if (r2 != 0) goto L_0x0033
            r2 = r25
            boolean r3 = r14.changed((java.lang.Object) r2)
            if (r3 == 0) goto L_0x0030
            r3 = 4
            goto L_0x0031
        L_0x0030:
            r3 = 2
        L_0x0031:
            r3 = r3 | r13
            goto L_0x0036
        L_0x0033:
            r2 = r25
            r3 = r13
        L_0x0036:
            r4 = r13 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x004f
            r4 = r36 & 2
            if (r4 != 0) goto L_0x0049
            r4 = r26
            boolean r5 = r14.changed((java.lang.Object) r4)
            if (r5 == 0) goto L_0x004b
            r5 = 32
            goto L_0x004d
        L_0x0049:
            r4 = r26
        L_0x004b:
            r5 = 16
        L_0x004d:
            r3 = r3 | r5
            goto L_0x0051
        L_0x004f:
            r4 = r26
        L_0x0051:
            r5 = r13 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x006a
            r5 = r36 & 4
            if (r5 != 0) goto L_0x0064
            r5 = r27
            boolean r7 = r14.changed((long) r5)
            if (r7 == 0) goto L_0x0066
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0068
        L_0x0064:
            r5 = r27
        L_0x0066:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0068:
            r3 = r3 | r7
            goto L_0x006c
        L_0x006a:
            r5 = r27
        L_0x006c:
            r7 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0085
            r7 = r36 & 8
            if (r7 != 0) goto L_0x007f
            r7 = r29
            boolean r9 = r14.changed((long) r7)
            if (r9 == 0) goto L_0x0081
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0083
        L_0x007f:
            r7 = r29
        L_0x0081:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0083:
            r3 = r3 | r9
            goto L_0x0087
        L_0x0085:
            r7 = r29
        L_0x0087:
            r9 = r36 & 16
            r10 = 57344(0xe000, float:8.0356E-41)
            if (r9 == 0) goto L_0x0091
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a4
        L_0x0091:
            r11 = r13 & r10
            if (r11 != 0) goto L_0x00a4
            r11 = r31
            boolean r15 = r14.changed((float) r11)
            if (r15 == 0) goto L_0x00a0
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a2
        L_0x00a0:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x00a2:
            r3 = r3 | r15
            goto L_0x00a6
        L_0x00a4:
            r11 = r31
        L_0x00a6:
            r15 = 458752(0x70000, float:6.42848E-40)
            r16 = r13 & r15
            if (r16 != 0) goto L_0x00c0
            r16 = r36 & 32
            r15 = r32
            if (r16 != 0) goto L_0x00bb
            boolean r16 = r14.changed((java.lang.Object) r15)
            if (r16 == 0) goto L_0x00bb
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bd
        L_0x00bb:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00bd:
            r3 = r3 | r16
            goto L_0x00c2
        L_0x00c0:
            r15 = r32
        L_0x00c2:
            r16 = r36 & 64
            r17 = 3670016(0x380000, float:5.142788E-39)
            if (r16 == 0) goto L_0x00cd
            r16 = 1572864(0x180000, float:2.204052E-39)
        L_0x00ca:
            r3 = r3 | r16
            goto L_0x00dd
        L_0x00cd:
            r16 = r13 & r17
            if (r16 != 0) goto L_0x00dd
            boolean r16 = r14.changedInstance(r12)
            if (r16 == 0) goto L_0x00da
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ca
        L_0x00da:
            r16 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00ca
        L_0x00dd:
            r16 = 2995931(0x2db6db, float:4.198194E-39)
            r10 = r3 & r16
            r0 = 599186(0x92492, float:8.39638E-40)
            if (r10 != r0) goto L_0x00f9
            boolean r0 = r14.getSkipping()
            if (r0 != 0) goto L_0x00ee
            goto L_0x00f9
        L_0x00ee:
            r14.skipToGroupEnd()
            r1 = r2
            r2 = r4
            r3 = r5
            r5 = r7
            r7 = r11
            r8 = r15
            goto L_0x01e6
        L_0x00f9:
            r14.startDefaults()
            r0 = r13 & 1
            r10 = -458753(0xfffffffffff8ffff, float:NaN)
            if (r0 == 0) goto L_0x0131
            boolean r0 = r14.getDefaultsInvalid()
            if (r0 == 0) goto L_0x010a
            goto L_0x0131
        L_0x010a:
            r14.skipToGroupEnd()
            r0 = r36 & 2
            if (r0 == 0) goto L_0x0113
            r3 = r3 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0113:
            r0 = r36 & 4
            if (r0 == 0) goto L_0x0119
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0119:
            r0 = r36 & 8
            if (r0 == 0) goto L_0x011f
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x011f:
            r0 = r36 & 32
            if (r0 == 0) goto L_0x0124
            r3 = r3 & r10
        L_0x0124:
            r18 = r4
            r19 = r5
            r21 = r7
            r23 = r11
            r24 = r15
            r15 = r2
            goto L_0x0191
        L_0x0131:
            if (r1 == 0) goto L_0x0138
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            goto L_0x0139
        L_0x0138:
            r0 = r2
        L_0x0139:
            r1 = r36 & 2
            r2 = 6
            if (r1 == 0) goto L_0x0147
            androidx.compose.material3.DrawerDefaults r1 = androidx.compose.material3.DrawerDefaults.INSTANCE
            androidx.compose.ui.graphics.Shape r1 = r1.getShape(r14, r2)
            r3 = r3 & -113(0xffffffffffffff8f, float:NaN)
            r4 = r1
        L_0x0147:
            r1 = r36 & 4
            if (r1 == 0) goto L_0x0157
            androidx.compose.material3.MaterialTheme r1 = androidx.compose.material3.MaterialTheme.INSTANCE
            androidx.compose.material3.ColorScheme r1 = r1.getColorScheme(r14, r2)
            long r5 = r1.m1206getSurface0d7_KjU()
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0157:
            r1 = r36 & 8
            if (r1 == 0) goto L_0x0166
            int r1 = r3 >> 6
            r1 = r1 & 14
            long r7 = androidx.compose.material3.ColorSchemeKt.m1242contentColorForek8zF_U(r5, r14, r1)
            r1 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            r3 = r1
        L_0x0166:
            if (r9 == 0) goto L_0x016f
            androidx.compose.material3.DrawerDefaults r1 = androidx.compose.material3.DrawerDefaults.INSTANCE
            float r1 = r1.m1329getModalDrawerElevationD9Ej5fM()
            r11 = r1
        L_0x016f:
            r1 = r36 & 32
            if (r1 == 0) goto L_0x0186
            androidx.compose.material3.DrawerDefaults r1 = androidx.compose.material3.DrawerDefaults.INSTANCE
            androidx.compose.foundation.layout.WindowInsets r1 = r1.getWindowInsets(r14, r2)
            r3 = r3 & r10
            r15 = r0
            r24 = r1
            r18 = r4
            r19 = r5
            r21 = r7
            r23 = r11
            goto L_0x0191
        L_0x0186:
            r18 = r4
            r19 = r5
            r21 = r7
            r23 = r11
            r24 = r15
            r15 = r0
        L_0x0191:
            r14.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01a4
            r0 = -1
            java.lang.String r1 = "androidx.compose.material3.ModalDrawerSheet (NavigationDrawer.kt:454)"
            r2 = 1001163336(0x3bac8a48, float:0.005265508)
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r3, r0, r1)
        L_0x01a4:
            int r0 = r3 >> 15
            r0 = r0 & 14
            int r1 = r3 << 3
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
            r1 = r1 & r2
            r0 = r0 | r1
            r1 = r3 & r17
            r10 = r0 | r1
            r11 = 0
            r0 = r24
            r1 = r15
            r2 = r18
            r3 = r19
            r5 = r21
            r7 = r23
            r8 = r33
            r9 = r14
            m1454DrawerSheetvywBR7E(r0, r1, r2, r3, r5, r7, r8, r9, r10, r11)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01db
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x01db:
            r1 = r15
            r2 = r18
            r3 = r19
            r5 = r21
            r7 = r23
            r8 = r24
        L_0x01e6:
            androidx.compose.runtime.ScopeUpdateScope r14 = r14.endRestartGroup()
            if (r14 != 0) goto L_0x01ed
            goto L_0x01fe
        L_0x01ed:
            androidx.compose.material3.NavigationDrawerKt$ModalDrawerSheet$1 r15 = new androidx.compose.material3.NavigationDrawerKt$ModalDrawerSheet$1
            r0 = r15
            r9 = r33
            r10 = r35
            r11 = r36
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11)
            kotlin.jvm.functions.Function2 r15 = (kotlin.jvm.functions.Function2) r15
            r14.updateScope(r15)
        L_0x01fe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.m1455ModalDrawerSheetafqeVBk(androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, float, androidx.compose.foundation.layout.WindowInsets, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00fc  */
    /* renamed from: DismissibleDrawerSheet-afqeVBk  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1453DismissibleDrawerSheetafqeVBk(androidx.compose.ui.Modifier r25, androidx.compose.ui.graphics.Shape r26, long r27, long r29, float r31, androidx.compose.foundation.layout.WindowInsets r32, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r33, androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            r12 = r33
            r13 = r35
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = -588600583(0xffffffffdceaaaf9, float:-5.28425048E17)
            r1 = r34
            androidx.compose.runtime.Composer r14 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(DismissibleDrawerSheet)P(5,3,1:c#ui.graphics.Color,2:c#ui.graphics.Color,4:c#ui.unit.Dp,6)494@18990L11,495@19043L37,497@19204L12,500@19274L183:NavigationDrawer.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r1)
            r1 = r36 & 1
            if (r1 == 0) goto L_0x0022
            r2 = r13 | 6
            r3 = r2
            r2 = r25
            goto L_0x0036
        L_0x0022:
            r2 = r13 & 14
            if (r2 != 0) goto L_0x0033
            r2 = r25
            boolean r3 = r14.changed((java.lang.Object) r2)
            if (r3 == 0) goto L_0x0030
            r3 = 4
            goto L_0x0031
        L_0x0030:
            r3 = 2
        L_0x0031:
            r3 = r3 | r13
            goto L_0x0036
        L_0x0033:
            r2 = r25
            r3 = r13
        L_0x0036:
            r4 = r36 & 2
            if (r4 == 0) goto L_0x003d
            r3 = r3 | 48
            goto L_0x0050
        L_0x003d:
            r5 = r13 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0050
            r5 = r26
            boolean r6 = r14.changed((java.lang.Object) r5)
            if (r6 == 0) goto L_0x004c
            r6 = 32
            goto L_0x004e
        L_0x004c:
            r6 = 16
        L_0x004e:
            r3 = r3 | r6
            goto L_0x0052
        L_0x0050:
            r5 = r26
        L_0x0052:
            r6 = r13 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x006b
            r6 = r36 & 4
            if (r6 != 0) goto L_0x0065
            r6 = r27
            boolean r8 = r14.changed((long) r6)
            if (r8 == 0) goto L_0x0067
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0069
        L_0x0065:
            r6 = r27
        L_0x0067:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0069:
            r3 = r3 | r8
            goto L_0x006d
        L_0x006b:
            r6 = r27
        L_0x006d:
            r8 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0086
            r8 = r36 & 8
            if (r8 != 0) goto L_0x0080
            r8 = r29
            boolean r10 = r14.changed((long) r8)
            if (r10 == 0) goto L_0x0082
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0084
        L_0x0080:
            r8 = r29
        L_0x0082:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0084:
            r3 = r3 | r10
            goto L_0x0088
        L_0x0086:
            r8 = r29
        L_0x0088:
            r10 = r36 & 16
            r11 = 57344(0xe000, float:8.0356E-41)
            if (r10 == 0) goto L_0x0092
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a6
        L_0x0092:
            r15 = r13 & r11
            if (r15 != 0) goto L_0x00a6
            r15 = r31
            boolean r16 = r14.changed((float) r15)
            if (r16 == 0) goto L_0x00a1
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a3
        L_0x00a1:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x00a3:
            r3 = r3 | r16
            goto L_0x00a8
        L_0x00a6:
            r15 = r31
        L_0x00a8:
            r16 = 458752(0x70000, float:6.42848E-40)
            r17 = r13 & r16
            if (r17 != 0) goto L_0x00c2
            r17 = r36 & 32
            r11 = r32
            if (r17 != 0) goto L_0x00bd
            boolean r17 = r14.changed((java.lang.Object) r11)
            if (r17 == 0) goto L_0x00bd
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bf
        L_0x00bd:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x00bf:
            r3 = r3 | r17
            goto L_0x00c4
        L_0x00c2:
            r11 = r32
        L_0x00c4:
            r17 = r36 & 64
            r18 = 3670016(0x380000, float:5.142788E-39)
            if (r17 == 0) goto L_0x00cf
            r17 = 1572864(0x180000, float:2.204052E-39)
        L_0x00cc:
            r3 = r3 | r17
            goto L_0x00df
        L_0x00cf:
            r17 = r13 & r18
            if (r17 != 0) goto L_0x00df
            boolean r17 = r14.changedInstance(r12)
            if (r17 == 0) goto L_0x00dc
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cc
        L_0x00dc:
            r17 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00cc
        L_0x00df:
            r17 = 2995931(0x2db6db, float:4.198194E-39)
            r0 = r3 & r17
            r2 = 599186(0x92492, float:8.39638E-40)
            if (r0 != r2) goto L_0x00fc
            boolean r0 = r14.getSkipping()
            if (r0 != 0) goto L_0x00f0
            goto L_0x00fc
        L_0x00f0:
            r14.skipToGroupEnd()
            r1 = r25
            r2 = r5
            r3 = r6
            r5 = r8
            r8 = r11
            r7 = r15
            goto L_0x01da
        L_0x00fc:
            r14.startDefaults()
            r0 = r13 & 1
            r2 = -458753(0xfffffffffff8ffff, float:NaN)
            if (r0 == 0) goto L_0x012e
            boolean r0 = r14.getDefaultsInvalid()
            if (r0 == 0) goto L_0x010d
            goto L_0x012e
        L_0x010d:
            r14.skipToGroupEnd()
            r0 = r36 & 4
            if (r0 == 0) goto L_0x0116
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0116:
            r0 = r36 & 8
            if (r0 == 0) goto L_0x011c
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x011c:
            r0 = r36 & 32
            if (r0 == 0) goto L_0x0121
            r3 = r3 & r2
        L_0x0121:
            r17 = r5
            r19 = r6
            r21 = r8
            r24 = r11
            r23 = r15
            r15 = r25
            goto L_0x0186
        L_0x012e:
            if (r1 == 0) goto L_0x0135
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            goto L_0x0137
        L_0x0135:
            r0 = r25
        L_0x0137:
            if (r4 == 0) goto L_0x013e
            androidx.compose.ui.graphics.Shape r1 = androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape()
            r5 = r1
        L_0x013e:
            r1 = r36 & 4
            r4 = 6
            if (r1 == 0) goto L_0x014f
            androidx.compose.material3.MaterialTheme r1 = androidx.compose.material3.MaterialTheme.INSTANCE
            androidx.compose.material3.ColorScheme r1 = r1.getColorScheme(r14, r4)
            long r6 = r1.m1206getSurface0d7_KjU()
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x014f:
            r1 = r36 & 8
            if (r1 == 0) goto L_0x015e
            int r1 = r3 >> 6
            r1 = r1 & 14
            long r8 = androidx.compose.material3.ColorSchemeKt.m1242contentColorForek8zF_U(r6, r14, r1)
            r1 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            r3 = r1
        L_0x015e:
            if (r10 == 0) goto L_0x0167
            androidx.compose.material3.DrawerDefaults r1 = androidx.compose.material3.DrawerDefaults.INSTANCE
            float r1 = r1.m1327getDismissibleDrawerElevationD9Ej5fM()
            r15 = r1
        L_0x0167:
            r1 = r36 & 32
            if (r1 == 0) goto L_0x017b
            androidx.compose.material3.DrawerDefaults r1 = androidx.compose.material3.DrawerDefaults.INSTANCE
            androidx.compose.foundation.layout.WindowInsets r1 = r1.getWindowInsets(r14, r4)
            r3 = r3 & r2
            r24 = r1
            r17 = r5
            r19 = r6
            r21 = r8
            goto L_0x0183
        L_0x017b:
            r17 = r5
            r19 = r6
            r21 = r8
            r24 = r11
        L_0x0183:
            r23 = r15
            r15 = r0
        L_0x0186:
            r14.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0199
            r0 = -1
            java.lang.String r1 = "androidx.compose.material3.DismissibleDrawerSheet (NavigationDrawer.kt:491)"
            r2 = -588600583(0xffffffffdceaaaf9, float:-5.28425048E17)
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r3, r0, r1)
        L_0x0199:
            int r0 = r3 >> 15
            r0 = r0 & 14
            int r1 = r3 << 3
            r2 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r1
            r0 = r0 | r2
            r1 = r1 & r16
            r0 = r0 | r1
            r1 = r3 & r18
            r10 = r0 | r1
            r11 = 0
            r0 = r24
            r1 = r15
            r2 = r17
            r3 = r19
            r5 = r21
            r7 = r23
            r8 = r33
            r9 = r14
            m1454DrawerSheetvywBR7E(r0, r1, r2, r3, r5, r7, r8, r9, r10, r11)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01cf
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x01cf:
            r1 = r15
            r2 = r17
            r3 = r19
            r5 = r21
            r7 = r23
            r8 = r24
        L_0x01da:
            androidx.compose.runtime.ScopeUpdateScope r14 = r14.endRestartGroup()
            if (r14 != 0) goto L_0x01e1
            goto L_0x01f2
        L_0x01e1:
            androidx.compose.material3.NavigationDrawerKt$DismissibleDrawerSheet$1 r15 = new androidx.compose.material3.NavigationDrawerKt$DismissibleDrawerSheet$1
            r0 = r15
            r9 = r33
            r10 = r35
            r11 = r36
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11)
            kotlin.jvm.functions.Function2 r15 = (kotlin.jvm.functions.Function2) r15
            r14.updateScope(r15)
        L_0x01f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.m1453DismissibleDrawerSheetafqeVBk(androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, float, androidx.compose.foundation.layout.WindowInsets, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:126:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00fc  */
    /* renamed from: PermanentDrawerSheet-afqeVBk  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1457PermanentDrawerSheetafqeVBk(androidx.compose.ui.Modifier r25, androidx.compose.ui.graphics.Shape r26, long r27, long r29, float r31, androidx.compose.foundation.layout.WindowInsets r32, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r33, androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            r12 = r33
            r13 = r35
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = -1733353241(0xffffffff98af20e7, float:-4.5269663E-24)
            r1 = r34
            androidx.compose.runtime.Composer r14 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(PermanentDrawerSheet)P(5,3,1:c#ui.graphics.Color,2:c#ui.graphics.Color,4:c#ui.unit.Dp,6)531@20618L11,532@20671L37,534@20830L12,537@20921L33,540@21021L50,538@20959L244:NavigationDrawer.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r1)
            r1 = r36 & 1
            if (r1 == 0) goto L_0x0022
            r2 = r13 | 6
            r3 = r2
            r2 = r25
            goto L_0x0036
        L_0x0022:
            r2 = r13 & 14
            if (r2 != 0) goto L_0x0033
            r2 = r25
            boolean r3 = r14.changed((java.lang.Object) r2)
            if (r3 == 0) goto L_0x0030
            r3 = 4
            goto L_0x0031
        L_0x0030:
            r3 = 2
        L_0x0031:
            r3 = r3 | r13
            goto L_0x0036
        L_0x0033:
            r2 = r25
            r3 = r13
        L_0x0036:
            r4 = r36 & 2
            if (r4 == 0) goto L_0x003d
            r3 = r3 | 48
            goto L_0x0050
        L_0x003d:
            r5 = r13 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0050
            r5 = r26
            boolean r6 = r14.changed((java.lang.Object) r5)
            if (r6 == 0) goto L_0x004c
            r6 = 32
            goto L_0x004e
        L_0x004c:
            r6 = 16
        L_0x004e:
            r3 = r3 | r6
            goto L_0x0052
        L_0x0050:
            r5 = r26
        L_0x0052:
            r6 = r13 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x006b
            r6 = r36 & 4
            if (r6 != 0) goto L_0x0065
            r6 = r27
            boolean r8 = r14.changed((long) r6)
            if (r8 == 0) goto L_0x0067
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0069
        L_0x0065:
            r6 = r27
        L_0x0067:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0069:
            r3 = r3 | r8
            goto L_0x006d
        L_0x006b:
            r6 = r27
        L_0x006d:
            r8 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0086
            r8 = r36 & 8
            if (r8 != 0) goto L_0x0080
            r8 = r29
            boolean r10 = r14.changed((long) r8)
            if (r10 == 0) goto L_0x0082
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0084
        L_0x0080:
            r8 = r29
        L_0x0082:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0084:
            r3 = r3 | r10
            goto L_0x0088
        L_0x0086:
            r8 = r29
        L_0x0088:
            r10 = r36 & 16
            r11 = 57344(0xe000, float:8.0356E-41)
            if (r10 == 0) goto L_0x0092
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a6
        L_0x0092:
            r15 = r13 & r11
            if (r15 != 0) goto L_0x00a6
            r15 = r31
            boolean r16 = r14.changed((float) r15)
            if (r16 == 0) goto L_0x00a1
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a3
        L_0x00a1:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x00a3:
            r3 = r3 | r16
            goto L_0x00a8
        L_0x00a6:
            r15 = r31
        L_0x00a8:
            r16 = 458752(0x70000, float:6.42848E-40)
            r17 = r13 & r16
            if (r17 != 0) goto L_0x00c2
            r17 = r36 & 32
            r11 = r32
            if (r17 != 0) goto L_0x00bd
            boolean r17 = r14.changed((java.lang.Object) r11)
            if (r17 == 0) goto L_0x00bd
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bf
        L_0x00bd:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x00bf:
            r3 = r3 | r17
            goto L_0x00c4
        L_0x00c2:
            r11 = r32
        L_0x00c4:
            r17 = r36 & 64
            r18 = 3670016(0x380000, float:5.142788E-39)
            if (r17 == 0) goto L_0x00cf
            r17 = 1572864(0x180000, float:2.204052E-39)
        L_0x00cc:
            r3 = r3 | r17
            goto L_0x00df
        L_0x00cf:
            r17 = r13 & r18
            if (r17 != 0) goto L_0x00df
            boolean r17 = r14.changedInstance(r12)
            if (r17 == 0) goto L_0x00dc
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cc
        L_0x00dc:
            r17 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00cc
        L_0x00df:
            r17 = 2995931(0x2db6db, float:4.198194E-39)
            r0 = r3 & r17
            r2 = 599186(0x92492, float:8.39638E-40)
            if (r0 != r2) goto L_0x00fc
            boolean r0 = r14.getSkipping()
            if (r0 != 0) goto L_0x00f0
            goto L_0x00fc
        L_0x00f0:
            r14.skipToGroupEnd()
            r1 = r25
            r2 = r5
            r3 = r6
            r5 = r8
            r8 = r11
            r7 = r15
            goto L_0x0217
        L_0x00fc:
            r14.startDefaults()
            r0 = r13 & 1
            r2 = 6
            if (r0 == 0) goto L_0x012f
            boolean r0 = r14.getDefaultsInvalid()
            if (r0 == 0) goto L_0x010b
            goto L_0x012f
        L_0x010b:
            r14.skipToGroupEnd()
            r0 = r36 & 4
            if (r0 == 0) goto L_0x0114
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0114:
            r0 = r36 & 8
            if (r0 == 0) goto L_0x011a
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x011a:
            r0 = r36 & 32
            if (r0 == 0) goto L_0x0122
            r0 = -458753(0xfffffffffff8ffff, float:NaN)
            r3 = r3 & r0
        L_0x0122:
            r17 = r5
            r19 = r6
            r21 = r8
            r24 = r11
            r23 = r15
            r15 = r25
            goto L_0x0189
        L_0x012f:
            if (r1 == 0) goto L_0x0136
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            goto L_0x0138
        L_0x0136:
            r0 = r25
        L_0x0138:
            if (r4 == 0) goto L_0x013f
            androidx.compose.ui.graphics.Shape r1 = androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape()
            r5 = r1
        L_0x013f:
            r1 = r36 & 4
            if (r1 == 0) goto L_0x014f
            androidx.compose.material3.MaterialTheme r1 = androidx.compose.material3.MaterialTheme.INSTANCE
            androidx.compose.material3.ColorScheme r1 = r1.getColorScheme(r14, r2)
            long r6 = r1.m1206getSurface0d7_KjU()
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x014f:
            r1 = r36 & 8
            if (r1 == 0) goto L_0x015e
            int r1 = r3 >> 6
            r1 = r1 & 14
            long r8 = androidx.compose.material3.ColorSchemeKt.m1242contentColorForek8zF_U(r6, r14, r1)
            r1 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            r3 = r1
        L_0x015e:
            if (r10 == 0) goto L_0x0167
            androidx.compose.material3.DrawerDefaults r1 = androidx.compose.material3.DrawerDefaults.INSTANCE
            float r1 = r1.m1330getPermanentDrawerElevationD9Ej5fM()
            r15 = r1
        L_0x0167:
            r1 = r36 & 32
            if (r1 == 0) goto L_0x017e
            androidx.compose.material3.DrawerDefaults r1 = androidx.compose.material3.DrawerDefaults.INSTANCE
            androidx.compose.foundation.layout.WindowInsets r1 = r1.getWindowInsets(r14, r2)
            r4 = -458753(0xfffffffffff8ffff, float:NaN)
            r3 = r3 & r4
            r24 = r1
            r17 = r5
            r19 = r6
            r21 = r8
            goto L_0x0186
        L_0x017e:
            r17 = r5
            r19 = r6
            r21 = r8
            r24 = r11
        L_0x0186:
            r23 = r15
            r15 = r0
        L_0x0189:
            r14.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x019c
            r0 = -1
            java.lang.String r1 = "androidx.compose.material3.PermanentDrawerSheet (NavigationDrawer.kt:528)"
            r4 = -1733353241(0xffffffff98af20e7, float:-4.5269663E-24)
            androidx.compose.runtime.ComposerKt.traceEventStart(r4, r3, r0, r1)
        L_0x019c:
            androidx.compose.material3.Strings$Companion r0 = androidx.compose.material3.Strings.Companion
            int r0 = r0.m1612getNavigationMenuadMyvUU()
            java.lang.String r0 = androidx.compose.material3.Strings_androidKt.m1632getStringNWtq28(r0, r14, r2)
            r1 = 1157296644(0x44faf204, float:2007.563)
            r14.startReplaceableGroup(r1)
            java.lang.String r1 = "CC(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r1)
            boolean r1 = r14.changed((java.lang.Object) r0)
            java.lang.Object r2 = r14.rememberedValue()
            if (r1 != 0) goto L_0x01c3
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r2 != r1) goto L_0x01ce
        L_0x01c3:
            androidx.compose.material3.NavigationDrawerKt$PermanentDrawerSheet$1$1 r1 = new androidx.compose.material3.NavigationDrawerKt$PermanentDrawerSheet$1$1
            r1.<init>(r0)
            r2 = r1
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r14.updateRememberedValue(r2)
        L_0x01ce:
            r14.endReplaceableGroup()
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r0 = 0
            r1 = 0
            r4 = 1
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(r15, r1, r2, r4, r0)
            int r0 = r3 >> 15
            r0 = r0 & 14
            int r2 = r3 << 3
            r4 = r2 & 896(0x380, float:1.256E-42)
            r0 = r0 | r4
            r4 = r2 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r4
            r4 = 57344(0xe000, float:8.0356E-41)
            r4 = r4 & r2
            r0 = r0 | r4
            r2 = r2 & r16
            r0 = r0 | r2
            r2 = r3 & r18
            r10 = r0 | r2
            r11 = 0
            r0 = r24
            r2 = r17
            r3 = r19
            r5 = r21
            r7 = r23
            r8 = r33
            r9 = r14
            m1454DrawerSheetvywBR7E(r0, r1, r2, r3, r5, r7, r8, r9, r10, r11)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x020c
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x020c:
            r1 = r15
            r2 = r17
            r3 = r19
            r5 = r21
            r7 = r23
            r8 = r24
        L_0x0217:
            androidx.compose.runtime.ScopeUpdateScope r14 = r14.endRestartGroup()
            if (r14 != 0) goto L_0x021e
            goto L_0x022f
        L_0x021e:
            androidx.compose.material3.NavigationDrawerKt$PermanentDrawerSheet$2 r15 = new androidx.compose.material3.NavigationDrawerKt$PermanentDrawerSheet$2
            r0 = r15
            r9 = r33
            r10 = r35
            r11 = r36
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11)
            kotlin.jvm.functions.Function2 r15 = (kotlin.jvm.functions.Function2) r15
            r14.updateScope(r15)
        L_0x022f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.m1457PermanentDrawerSheetafqeVBk(androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, float, androidx.compose.foundation.layout.WindowInsets, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00f1  */
    /* renamed from: DrawerSheet-vywBR7E  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1454DrawerSheetvywBR7E(androidx.compose.foundation.layout.WindowInsets r26, androidx.compose.ui.Modifier r27, androidx.compose.ui.graphics.Shape r28, long r29, long r31, float r33, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r34, androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            r1 = r26
            r9 = r34
            r10 = r36
            r0 = 175072821(0xa6f6635, float:1.15266544E-32)
            r2 = r35
            androidx.compose.runtime.Composer r2 = r2.startRestartGroup(r0)
            java.lang.String r3 = "C(DrawerSheet)P(6,5,3,1:c#ui.graphics.Color,2:c#ui.graphics.Color,4:c#ui.unit.Dp)556@21400L11,557@21453L37,561@21620L667:NavigationDrawer.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r3)
            r3 = r37 & 1
            if (r3 == 0) goto L_0x001b
            r3 = r10 | 6
            goto L_0x002b
        L_0x001b:
            r3 = r10 & 14
            if (r3 != 0) goto L_0x002a
            boolean r3 = r2.changed((java.lang.Object) r1)
            if (r3 == 0) goto L_0x0027
            r3 = 4
            goto L_0x0028
        L_0x0027:
            r3 = 2
        L_0x0028:
            r3 = r3 | r10
            goto L_0x002b
        L_0x002a:
            r3 = r10
        L_0x002b:
            r4 = r37 & 2
            if (r4 == 0) goto L_0x0032
            r3 = r3 | 48
            goto L_0x0045
        L_0x0032:
            r5 = r10 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0045
            r5 = r27
            boolean r6 = r2.changed((java.lang.Object) r5)
            if (r6 == 0) goto L_0x0041
            r6 = 32
            goto L_0x0043
        L_0x0041:
            r6 = 16
        L_0x0043:
            r3 = r3 | r6
            goto L_0x0047
        L_0x0045:
            r5 = r27
        L_0x0047:
            r6 = r37 & 4
            if (r6 == 0) goto L_0x004e
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0061
        L_0x004e:
            r7 = r10 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0061
            r7 = r28
            boolean r8 = r2.changed((java.lang.Object) r7)
            if (r8 == 0) goto L_0x005d
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005d:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r3 = r3 | r8
            goto L_0x0063
        L_0x0061:
            r7 = r28
        L_0x0063:
            r8 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x007a
            r8 = r37 & 8
            r11 = r29
            if (r8 != 0) goto L_0x0076
            boolean r8 = r2.changed((long) r11)
            if (r8 == 0) goto L_0x0076
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0078
        L_0x0076:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0078:
            r3 = r3 | r8
            goto L_0x007c
        L_0x007a:
            r11 = r29
        L_0x007c:
            r8 = 57344(0xe000, float:8.0356E-41)
            r13 = r10 & r8
            if (r13 != 0) goto L_0x0098
            r13 = r37 & 16
            if (r13 != 0) goto L_0x0092
            r13 = r31
            boolean r15 = r2.changed((long) r13)
            if (r15 == 0) goto L_0x0094
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0092:
            r13 = r31
        L_0x0094:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r3 = r3 | r15
            goto L_0x009a
        L_0x0098:
            r13 = r31
        L_0x009a:
            r15 = r37 & 32
            if (r15 == 0) goto L_0x00a5
            r16 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r16
            r8 = r33
            goto L_0x00ba
        L_0x00a5:
            r16 = 458752(0x70000, float:6.42848E-40)
            r16 = r10 & r16
            r8 = r33
            if (r16 != 0) goto L_0x00ba
            boolean r16 = r2.changed((float) r8)
            if (r16 == 0) goto L_0x00b6
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b8
        L_0x00b6:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b8:
            r3 = r3 | r16
        L_0x00ba:
            r16 = r37 & 64
            if (r16 == 0) goto L_0x00c3
            r16 = 1572864(0x180000, float:2.204052E-39)
        L_0x00c0:
            r3 = r3 | r16
            goto L_0x00d5
        L_0x00c3:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r10 & r16
            if (r16 != 0) goto L_0x00d5
            boolean r16 = r2.changedInstance(r9)
            if (r16 == 0) goto L_0x00d2
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c0
        L_0x00d2:
            r16 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00c0
        L_0x00d5:
            r16 = 2995931(0x2db6db, float:4.198194E-39)
            r0 = r3 & r16
            r5 = 599186(0x92492, float:8.39638E-40)
            if (r0 != r5) goto L_0x00f1
            boolean r0 = r2.getSkipping()
            if (r0 != 0) goto L_0x00e6
            goto L_0x00f1
        L_0x00e6:
            r2.skipToGroupEnd()
            r3 = r27
            r4 = r7
            r6 = r11
            r24 = r13
            goto L_0x01cb
        L_0x00f1:
            r2.startDefaults()
            r0 = r10 & 1
            r5 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x0117
            boolean r0 = r2.getDefaultsInvalid()
            if (r0 == 0) goto L_0x0102
            goto L_0x0117
        L_0x0102:
            r2.skipToGroupEnd()
            r0 = r37 & 8
            if (r0 == 0) goto L_0x010b
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x010b:
            r0 = r37 & 16
            if (r0 == 0) goto L_0x0110
            r3 = r3 & r5
        L_0x0110:
            r0 = r27
            r4 = r7
            r6 = r11
            r24 = r13
            goto L_0x0155
        L_0x0117:
            if (r4 == 0) goto L_0x011e
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            goto L_0x0120
        L_0x011e:
            r0 = r27
        L_0x0120:
            if (r6 == 0) goto L_0x0127
            androidx.compose.ui.graphics.Shape r4 = androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape()
            goto L_0x0128
        L_0x0127:
            r4 = r7
        L_0x0128:
            r6 = r37 & 8
            if (r6 == 0) goto L_0x013a
            androidx.compose.material3.MaterialTheme r6 = androidx.compose.material3.MaterialTheme.INSTANCE
            r7 = 6
            androidx.compose.material3.ColorScheme r6 = r6.getColorScheme(r2, r7)
            long r6 = r6.m1206getSurface0d7_KjU()
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x013b
        L_0x013a:
            r6 = r11
        L_0x013b:
            r11 = r37 & 16
            if (r11 == 0) goto L_0x0149
            int r11 = r3 >> 9
            r11 = r11 & 14
            long r11 = androidx.compose.material3.ColorSchemeKt.m1242contentColorForek8zF_U(r6, r2, r11)
            r3 = r3 & r5
            goto L_0x014a
        L_0x0149:
            r11 = r13
        L_0x014a:
            if (r15 == 0) goto L_0x0153
            androidx.compose.material3.DrawerDefaults r5 = androidx.compose.material3.DrawerDefaults.INSTANCE
            float r5 = r5.m1330getPermanentDrawerElevationD9Ej5fM()
            r8 = r5
        L_0x0153:
            r24 = r11
        L_0x0155:
            r2.endDefaults()
            boolean r5 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r5 == 0) goto L_0x0168
            r5 = -1
            java.lang.String r11 = "androidx.compose.material3.DrawerSheet (NavigationDrawer.kt:552)"
            r12 = 175072821(0xa6f6635, float:1.15266544E-32)
            androidx.compose.runtime.ComposerKt.traceEventStart(r12, r3, r5, r11)
        L_0x0168:
            float r5 = MinimumDrawerWidth
            r11 = 0
            androidx.compose.material3.DrawerDefaults r12 = androidx.compose.material3.DrawerDefaults.INSTANCE
            float r12 = r12.m1328getMaximumDrawerWidthD9Ej5fM()
            r13 = 0
            r14 = 10
            r15 = 0
            r27 = r0
            r28 = r5
            r29 = r11
            r30 = r12
            r31 = r13
            r32 = r14
            r33 = r15
            androidx.compose.ui.Modifier r5 = androidx.compose.foundation.layout.SizeKt.m567sizeInqDBjuR0$default(r27, r28, r29, r30, r31, r32, r33)
            r12 = 0
            r13 = 1
            androidx.compose.ui.Modifier r11 = androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(r5, r11, r13, r12)
            r18 = 0
            r19 = 0
            androidx.compose.material3.NavigationDrawerKt$DrawerSheet$1 r5 = new androidx.compose.material3.NavigationDrawerKt$DrawerSheet$1
            r5.<init>(r1, r9, r3)
            r12 = 959363152(0x392eb850, float:1.6662595E-4)
            androidx.compose.runtime.internal.ComposableLambda r5 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r2, r12, r13, r5)
            r20 = r5
            kotlin.jvm.functions.Function2 r20 = (kotlin.jvm.functions.Function2) r20
            int r3 = r3 >> 3
            r5 = r3 & 112(0x70, float:1.57E-43)
            r12 = 12582912(0xc00000, float:1.7632415E-38)
            r5 = r5 | r12
            r12 = r3 & 896(0x380, float:1.256E-42)
            r5 = r5 | r12
            r12 = r3 & 7168(0x1c00, float:1.0045E-41)
            r5 = r5 | r12
            r12 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r12
            r22 = r5 | r3
            r23 = 96
            r12 = r4
            r13 = r6
            r15 = r24
            r17 = r8
            r21 = r2
            androidx.compose.material3.SurfaceKt.m1641SurfaceT9BRK9s(r11, r12, r13, r15, r17, r18, r19, r20, r21, r22, r23)
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L_0x01ca
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x01ca:
            r3 = r0
        L_0x01cb:
            androidx.compose.runtime.ScopeUpdateScope r12 = r2.endRestartGroup()
            if (r12 != 0) goto L_0x01d2
            goto L_0x01ea
        L_0x01d2:
            androidx.compose.material3.NavigationDrawerKt$DrawerSheet$2 r13 = new androidx.compose.material3.NavigationDrawerKt$DrawerSheet$2
            r0 = r13
            r1 = r26
            r2 = r3
            r3 = r4
            r4 = r6
            r6 = r24
            r9 = r34
            r10 = r36
            r11 = r37
            r0.<init>(r1, r2, r3, r4, r6, r8, r9, r10, r11)
            kotlin.jvm.functions.Function2 r13 = (kotlin.jvm.functions.Function2) r13
            r12.updateScope(r13)
        L_0x01ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.m1454DrawerSheetvywBR7E(androidx.compose.foundation.layout.WindowInsets, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, float, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0298  */
    /* JADX WARNING: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0106  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void NavigationDrawerItem(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r36, boolean r37, kotlin.jvm.functions.Function0<kotlin.Unit> r38, androidx.compose.ui.Modifier r39, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r40, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r41, androidx.compose.ui.graphics.Shape r42, androidx.compose.material3.NavigationDrawerItemColors r43, androidx.compose.foundation.interaction.MutableInteractionSource r44, androidx.compose.runtime.Composer r45, int r46, int r47) {
        /*
            r1 = r36
            r0 = r37
            r14 = r38
            r6 = r46
            r3 = r47
            java.lang.String r2 = "label"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.lang.String r2 = "onClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r2)
            r2 = -1304626543(0xffffffffb23cfa91, float:-1.10000125E-8)
            r4 = r45
            androidx.compose.runtime.Composer r13 = r4.startRestartGroup(r2)
            java.lang.String r4 = "C(NavigationDrawerItem)P(4,7,6,5,2!1,8)657@25365L9,658@25446L8,659@25506L39,668@25818L24,661@25554L1233:NavigationDrawer.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r13, r4)
            r4 = r3 & 1
            if (r4 == 0) goto L_0x002b
            r4 = r6 | 6
            goto L_0x003b
        L_0x002b:
            r4 = r6 & 14
            if (r4 != 0) goto L_0x003a
            boolean r4 = r13.changedInstance(r1)
            if (r4 == 0) goto L_0x0037
            r4 = 4
            goto L_0x0038
        L_0x0037:
            r4 = 2
        L_0x0038:
            r4 = r4 | r6
            goto L_0x003b
        L_0x003a:
            r4 = r6
        L_0x003b:
            r5 = r3 & 2
            if (r5 == 0) goto L_0x0042
            r4 = r4 | 48
            goto L_0x0052
        L_0x0042:
            r5 = r6 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0052
            boolean r5 = r13.changed((boolean) r0)
            if (r5 == 0) goto L_0x004f
            r5 = 32
            goto L_0x0051
        L_0x004f:
            r5 = 16
        L_0x0051:
            r4 = r4 | r5
        L_0x0052:
            r5 = r3 & 4
            if (r5 == 0) goto L_0x0059
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x0069
        L_0x0059:
            r5 = r6 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0069
            boolean r5 = r13.changedInstance(r14)
            if (r5 == 0) goto L_0x0066
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0068
        L_0x0066:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0068:
            r4 = r4 | r5
        L_0x0069:
            r5 = r3 & 8
            if (r5 == 0) goto L_0x0070
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x0083
        L_0x0070:
            r7 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0083
            r7 = r39
            boolean r8 = r13.changed((java.lang.Object) r7)
            if (r8 == 0) goto L_0x007f
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007f:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r4 = r4 | r8
            goto L_0x0085
        L_0x0083:
            r7 = r39
        L_0x0085:
            r8 = r3 & 16
            r35 = 57344(0xe000, float:8.0356E-41)
            if (r8 == 0) goto L_0x008f
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a2
        L_0x008f:
            r9 = r6 & r35
            if (r9 != 0) goto L_0x00a2
            r9 = r40
            boolean r10 = r13.changedInstance(r9)
            if (r10 == 0) goto L_0x009e
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a0
        L_0x009e:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x00a0:
            r4 = r4 | r10
            goto L_0x00a4
        L_0x00a2:
            r9 = r40
        L_0x00a4:
            r10 = r3 & 32
            if (r10 == 0) goto L_0x00ac
            r11 = 196608(0x30000, float:2.75506E-40)
            r4 = r4 | r11
            goto L_0x00c0
        L_0x00ac:
            r11 = 458752(0x70000, float:6.42848E-40)
            r11 = r11 & r6
            if (r11 != 0) goto L_0x00c0
            r11 = r41
            boolean r12 = r13.changedInstance(r11)
            if (r12 == 0) goto L_0x00bc
            r12 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00be
        L_0x00bc:
            r12 = 65536(0x10000, float:9.18355E-41)
        L_0x00be:
            r4 = r4 | r12
            goto L_0x00c2
        L_0x00c0:
            r11 = r41
        L_0x00c2:
            r12 = 3670016(0x380000, float:5.142788E-39)
            r12 = r12 & r6
            if (r12 != 0) goto L_0x00dc
            r12 = r3 & 64
            if (r12 != 0) goto L_0x00d6
            r12 = r42
            boolean r15 = r13.changed((java.lang.Object) r12)
            if (r15 == 0) goto L_0x00d8
            r15 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00da
        L_0x00d6:
            r12 = r42
        L_0x00d8:
            r15 = 524288(0x80000, float:7.34684E-40)
        L_0x00da:
            r4 = r4 | r15
            goto L_0x00de
        L_0x00dc:
            r12 = r42
        L_0x00de:
            r15 = 29360128(0x1c00000, float:7.052966E-38)
            r15 = r15 & r6
            if (r15 != 0) goto L_0x00f9
            r15 = r3 & 128(0x80, float:1.794E-43)
            if (r15 != 0) goto L_0x00f2
            r15 = r43
            boolean r16 = r13.changed((java.lang.Object) r15)
            if (r16 == 0) goto L_0x00f4
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f6
        L_0x00f2:
            r15 = r43
        L_0x00f4:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f6:
            r4 = r4 | r16
            goto L_0x00fb
        L_0x00f9:
            r15 = r43
        L_0x00fb:
            r2 = r3 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x0106
            r16 = 100663296(0x6000000, float:2.4074124E-35)
            r4 = r4 | r16
            r1 = r44
            goto L_0x011b
        L_0x0106:
            r16 = 234881024(0xe000000, float:1.5777218E-30)
            r16 = r6 & r16
            r1 = r44
            if (r16 != 0) goto L_0x011b
            boolean r16 = r13.changed((java.lang.Object) r1)
            if (r16 == 0) goto L_0x0117
            r16 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0119
        L_0x0117:
            r16 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0119:
            r4 = r4 | r16
        L_0x011b:
            r16 = 191739611(0xb6db6db, float:4.5782105E-32)
            r1 = r4 & r16
            r7 = 38347922(0x2492492, float:1.4777643E-37)
            if (r1 != r7) goto L_0x013b
            boolean r1 = r13.getSkipping()
            if (r1 != 0) goto L_0x012c
            goto L_0x013b
        L_0x012c:
            r13.skipToGroupEnd()
            r4 = r39
            r5 = r9
            r6 = r11
            r7 = r12
            r24 = r13
            r8 = r15
            r9 = r44
            goto L_0x0291
        L_0x013b:
            r13.startDefaults()
            r1 = r6 & 1
            r16 = -3670017(0xffffffffffc7ffff, float:NaN)
            r7 = 0
            if (r1 == 0) goto L_0x016c
            boolean r1 = r13.getDefaultsInvalid()
            if (r1 == 0) goto L_0x014d
            goto L_0x016c
        L_0x014d:
            r13.skipToGroupEnd()
            r1 = r3 & 64
            if (r1 == 0) goto L_0x0156
            r4 = r4 & r16
        L_0x0156:
            r1 = r3 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x015e
            r1 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r4 = r4 & r1
        L_0x015e:
            r1 = r39
            r23 = r44
            r20 = r9
            r21 = r11
            r22 = r12
            r2 = r15
            r15 = r4
            goto L_0x01e6
        L_0x016c:
            if (r5 == 0) goto L_0x0173
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
            goto L_0x0175
        L_0x0173:
            r1 = r39
        L_0x0175:
            if (r8 == 0) goto L_0x0178
            r9 = r7
        L_0x0178:
            if (r10 == 0) goto L_0x017b
            r11 = r7
        L_0x017b:
            r5 = r3 & 64
            if (r5 == 0) goto L_0x018d
            androidx.compose.material3.tokens.NavigationDrawerTokens r5 = androidx.compose.material3.tokens.NavigationDrawerTokens.INSTANCE
            androidx.compose.material3.tokens.ShapeKeyTokens r5 = r5.getActiveIndicatorShape()
            r8 = 6
            androidx.compose.ui.graphics.Shape r5 = androidx.compose.material3.ShapesKt.toShape(r5, r13, r8)
            r4 = r4 & r16
            goto L_0x018e
        L_0x018d:
            r5 = r12
        L_0x018e:
            r8 = r3 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x01b3
            androidx.compose.material3.NavigationDrawerItemDefaults r15 = androidx.compose.material3.NavigationDrawerItemDefaults.INSTANCE
            r16 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r28 = 0
            r30 = 0
            r33 = 100663296(0x6000000, float:2.4074124E-35)
            r34 = 255(0xff, float:3.57E-43)
            r32 = r13
            androidx.compose.material3.NavigationDrawerItemColors r8 = r15.m1452colorsoq7We08(r16, r18, r20, r22, r24, r26, r28, r30, r32, r33, r34)
            r10 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r4 = r4 & r10
            goto L_0x01b4
        L_0x01b3:
            r8 = r15
        L_0x01b4:
            if (r2 == 0) goto L_0x01dc
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r13.startReplaceableGroup(r2)
            java.lang.String r2 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r13, r2)
            java.lang.Object r2 = r13.rememberedValue()
            androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r10 = r10.getEmpty()
            if (r2 != r10) goto L_0x01d4
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r13.updateRememberedValue(r2)
        L_0x01d4:
            r13.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = (androidx.compose.foundation.interaction.MutableInteractionSource) r2
            r23 = r2
            goto L_0x01de
        L_0x01dc:
            r23 = r44
        L_0x01de:
            r15 = r4
            r22 = r5
            r2 = r8
            r20 = r9
            r21 = r11
        L_0x01e6:
            r13.endDefaults()
            boolean r4 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r4 == 0) goto L_0x01f9
            r4 = -1
            java.lang.String r5 = "androidx.compose.material3.NavigationDrawerItem (NavigationDrawer.kt:650)"
            r8 = -1304626543(0xffffffffb23cfa91, float:-1.10000125E-8)
            androidx.compose.runtime.ComposerKt.traceEventStart(r8, r15, r4, r5)
        L_0x01f9:
            androidx.compose.material3.NavigationDrawerKt$NavigationDrawerItem$2 r4 = androidx.compose.material3.NavigationDrawerKt$NavigationDrawerItem$2.INSTANCE
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            r5 = 0
            r12 = 1
            androidx.compose.ui.Modifier r4 = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(r1, r5, r4, r12, r7)
            androidx.compose.material3.tokens.NavigationDrawerTokens r5 = androidx.compose.material3.tokens.NavigationDrawerTokens.INSTANCE
            float r5 = r5.m2149getActiveIndicatorHeightD9Ej5fM()
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.SizeKt.m549height3ABfNKs(r4, r5)
            r5 = 0
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(r4, r5, r12, r7)
            r5 = 0
            int r16 = r15 >> 3
            r17 = r16 & 14
            int r7 = r15 >> 18
            r7 = r7 & 112(0x70, float:1.57E-43)
            r7 = r17 | r7
            androidx.compose.runtime.State r7 = r2.containerColor(r0, r13, r7)
            java.lang.Object r7 = r7.getValue()
            androidx.compose.ui.graphics.Color r7 = (androidx.compose.ui.graphics.Color) r7
            long r7 = r7.m2831unboximpl()
            r9 = 0
            r11 = 0
            r18 = 0
            r5 = r12
            r12 = r18
            r18 = 0
            r9 = r13
            r13 = r18
            androidx.compose.material3.NavigationDrawerKt$NavigationDrawerItem$3 r10 = new androidx.compose.material3.NavigationDrawerKt$NavigationDrawerItem$3
            r39 = r10
            r40 = r20
            r41 = r2
            r42 = r37
            r43 = r15
            r44 = r21
            r45 = r36
            r39.<init>(r40, r41, r42, r43, r44, r45)
            r11 = 191488423(0xb69e1a7, float:4.504393E-32)
            androidx.compose.runtime.internal.ComposableLambda r5 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r9, r11, r5, r10)
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            r10 = r15
            r15 = r5
            r5 = r16 & 112(0x70, float:1.57E-43)
            r5 = r17 | r5
            int r11 = r10 >> 6
            r11 = r11 & r35
            r17 = r5 | r11
            int r5 = r10 >> 24
            r5 = r5 & 14
            r18 = r5 | 48
            r19 = 968(0x3c8, float:1.356E-42)
            r27 = r2
            r2 = r37
            r3 = r38
            r6 = r22
            r14 = r23
            r16 = r9
            r24 = r9
            r5 = 0
            r9 = 0
            r11 = 0
            androidx.compose.material3.SurfaceKt.m1642Surfaced85dljk((boolean) r2, (kotlin.jvm.functions.Function0<kotlin.Unit>) r3, (androidx.compose.ui.Modifier) r4, (boolean) r5, (androidx.compose.ui.graphics.Shape) r6, (long) r7, (long) r9, (float) r11, (float) r12, (androidx.compose.foundation.BorderStroke) r13, (androidx.compose.foundation.interaction.MutableInteractionSource) r14, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) r15, (androidx.compose.runtime.Composer) r16, (int) r17, (int) r18, (int) r19)
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x0286
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0286:
            r4 = r1
            r5 = r20
            r6 = r21
            r7 = r22
            r9 = r23
            r8 = r27
        L_0x0291:
            androidx.compose.runtime.ScopeUpdateScope r12 = r24.endRestartGroup()
            if (r12 != 0) goto L_0x0298
            goto L_0x02ad
        L_0x0298:
            androidx.compose.material3.NavigationDrawerKt$NavigationDrawerItem$4 r13 = new androidx.compose.material3.NavigationDrawerKt$NavigationDrawerItem$4
            r0 = r13
            r1 = r36
            r2 = r37
            r3 = r38
            r10 = r46
            r11 = r47
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            kotlin.jvm.functions.Function2 r13 = (kotlin.jvm.functions.Function2) r13
            r12.updateScope(r13)
        L_0x02ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.NavigationDrawerItem(kotlin.jvm.functions.Function2, boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.ui.graphics.Shape, androidx.compose.material3.NavigationDrawerItemColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final float calculateFraction(float f, float f2, float f3) {
        return RangesKt.coerceIn((f3 - f) / (f2 - f), 0.0f, 1.0f);
    }

    /* access modifiers changed from: private */
    /* renamed from: Scrim-Bx497Mc  reason: not valid java name */
    public static final void m1458ScrimBx497Mc(boolean z, Function0<Unit> function0, Function0<Float> function02, long j, Composer composer, int i) {
        int i2;
        Modifier modifier;
        Composer startRestartGroup = composer.startRestartGroup(2106487387);
        ComposerKt.sourceInformation(startRestartGroup, "C(Scrim)P(3,2,1,0:c#ui.graphics.Color)848@32851L30,864@33295L51,860@33204L142:NavigationDrawer.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(j) ? 2048 : 1024;
        }
        if ((i2 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2106487387, i2, -1, "androidx.compose.material3.Scrim (NavigationDrawer.kt:842)");
            }
            String r0 = Strings_androidKt.m1632getStringNWtq28(Strings.Companion.m1574getCloseDraweradMyvUU(), startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1858703321);
            ComposerKt.sourceInformation(startRestartGroup, "851@32970L35,852@33054L108");
            if (z) {
                Modifier modifier2 = Modifier.Companion;
                startRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                boolean changed = startRestartGroup.changed((Object) function0);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new NavigationDrawerKt$Scrim$dismissDrawer$1$1(function0, (Continuation<? super NavigationDrawerKt$Scrim$dismissDrawer$1$1>) null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(modifier2, (Object) function0, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) (Function2) rememberedValue);
                startRestartGroup.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                boolean changed2 = startRestartGroup.changed((Object) r0) | startRestartGroup.changed((Object) function0);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new NavigationDrawerKt$Scrim$dismissDrawer$2$1(r0, function0);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceableGroup();
                modifier = SemanticsModifierKt.semantics(pointerInput, true, (Function1) rememberedValue2);
            } else {
                modifier = Modifier.Companion;
            }
            startRestartGroup.endReplaceableGroup();
            Modifier then = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null).then(modifier);
            Color r3 = Color.m2811boximpl(j);
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
            boolean changed3 = startRestartGroup.changed((Object) r3) | startRestartGroup.changed((Object) function02);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new NavigationDrawerKt$Scrim$1$1(j, function02);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(then, (Function1) rememberedValue3, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new NavigationDrawerKt$Scrim$2(z, function0, function02, j, i));
        }
    }
}
