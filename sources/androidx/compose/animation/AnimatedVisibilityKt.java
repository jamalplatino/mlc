package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000h\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001ak\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0003¢\u0006\u0002\u0010\u0012\u001aR\u0010\u0000\u001a\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\b¢\u0006\u0002\u0010\u0014\u001aa\u0010\u0015\u001a\u00020\u00012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00172\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010\u001a\u001aJ\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u00072\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u001c¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u001d\u001a[\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010\u001e\u001am\u0010\u0015\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010\u001f\u001ae\u0010\u0015\u001a\u00020\u0001*\u00020 2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00172\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010!\u001a_\u0010\u0015\u001a\u00020\u0001*\u00020 2\u0006\u0010\u0005\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010\"\u001ae\u0010\u0015\u001a\u00020\u0001*\u00020#2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00172\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010$\u001a_\u0010\u0015\u001a\u00020\u0001*\u00020#2\u0006\u0010\u0005\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010%\u001a9\u0010&\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010'\u001a\u0002H\u0002H\u0003¢\u0006\u0002\u0010(¨\u0006)"}, d2 = {"AnimatedEnterExitImpl", "", "T", "transition", "Landroidx/compose/animation/core/Transition;", "visible", "Lkotlin/Function1;", "", "modifier", "Landroidx/compose/ui/Modifier;", "enter", "Landroidx/compose/animation/EnterTransition;", "exit", "Landroidx/compose/animation/ExitTransition;", "content", "Landroidx/compose/animation/AnimatedVisibilityScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/animation/EnterExitState;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "AnimatedVisibility", "visibleState", "Landroidx/compose/animation/core/MutableTransitionState;", "label", "", "(Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "initiallyVisible", "Lkotlin/Function0;", "(ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "(ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/ColumnScope;", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/foundation/layout/ColumnScope;ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/RowScope;", "(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/foundation/layout/RowScope;ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "targetEnterExit", "targetState", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/EnterExitState;", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: AnimatedVisibility.kt */
public final class AnimatedVisibilityKt {
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void AnimatedVisibility(boolean r24, androidx.compose.ui.Modifier r25, androidx.compose.animation.EnterTransition r26, androidx.compose.animation.ExitTransition r27, java.lang.String r28, kotlin.jvm.functions.Function3<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            r8 = r29
            r9 = r31
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 2088733774(0x7c7f8c4e, float:5.3075257E36)
            r1 = r30
            androidx.compose.runtime.Composer r10 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(AnimatedVisibility)P(5,4,1,2,3)127@6727L32,128@6764L73:AnimatedVisibility.kt#xbi5r1"
            androidx.compose.runtime.ComposerKt.sourceInformation(r10, r1)
            r1 = r32 & 1
            if (r1 == 0) goto L_0x0021
            r1 = r9 | 6
            r11 = r24
            goto L_0x0033
        L_0x0021:
            r1 = r9 & 14
            r11 = r24
            if (r1 != 0) goto L_0x0032
            boolean r1 = r10.changed((boolean) r11)
            if (r1 == 0) goto L_0x002f
            r1 = 4
            goto L_0x0030
        L_0x002f:
            r1 = 2
        L_0x0030:
            r1 = r1 | r9
            goto L_0x0033
        L_0x0032:
            r1 = r9
        L_0x0033:
            r2 = r32 & 2
            if (r2 == 0) goto L_0x003a
            r1 = r1 | 48
            goto L_0x004d
        L_0x003a:
            r3 = r9 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x004d
            r3 = r25
            boolean r4 = r10.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x0049
            r4 = 32
            goto L_0x004b
        L_0x0049:
            r4 = 16
        L_0x004b:
            r1 = r1 | r4
            goto L_0x004f
        L_0x004d:
            r3 = r25
        L_0x004f:
            r4 = r32 & 4
            if (r4 == 0) goto L_0x0056
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0069
        L_0x0056:
            r5 = r9 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0069
            r5 = r26
            boolean r6 = r10.changed((java.lang.Object) r5)
            if (r6 == 0) goto L_0x0065
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0067
        L_0x0065:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0067:
            r1 = r1 | r6
            goto L_0x006b
        L_0x0069:
            r5 = r26
        L_0x006b:
            r6 = r32 & 8
            if (r6 == 0) goto L_0x0072
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0085
        L_0x0072:
            r7 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0085
            r7 = r27
            boolean r12 = r10.changed((java.lang.Object) r7)
            if (r12 == 0) goto L_0x0081
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0083
        L_0x0081:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0083:
            r1 = r1 | r12
            goto L_0x0087
        L_0x0085:
            r7 = r27
        L_0x0087:
            r12 = r32 & 16
            r13 = 57344(0xe000, float:8.0356E-41)
            if (r12 == 0) goto L_0x0091
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a4
        L_0x0091:
            r14 = r9 & r13
            if (r14 != 0) goto L_0x00a4
            r14 = r28
            boolean r15 = r10.changed((java.lang.Object) r14)
            if (r15 == 0) goto L_0x00a0
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a2
        L_0x00a0:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x00a2:
            r1 = r1 | r15
            goto L_0x00a6
        L_0x00a4:
            r14 = r28
        L_0x00a6:
            r15 = r32 & 32
            r16 = 458752(0x70000, float:6.42848E-40)
            if (r15 == 0) goto L_0x00b0
            r15 = 196608(0x30000, float:2.75506E-40)
        L_0x00ae:
            r1 = r1 | r15
            goto L_0x00c0
        L_0x00b0:
            r15 = r9 & r16
            if (r15 != 0) goto L_0x00c0
            boolean r15 = r10.changed((java.lang.Object) r8)
            if (r15 == 0) goto L_0x00bd
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ae
        L_0x00bd:
            r15 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00ae
        L_0x00c0:
            r15 = 374491(0x5b6db, float:5.24774E-40)
            r15 = r15 & r1
            r13 = 74898(0x12492, float:1.04954E-40)
            if (r15 != r13) goto L_0x00d9
            boolean r13 = r10.getSkipping()
            if (r13 != 0) goto L_0x00d0
            goto L_0x00d9
        L_0x00d0:
            r10.skipToGroupEnd()
            r2 = r3
            r3 = r5
            r4 = r7
            r5 = r14
            goto L_0x0172
        L_0x00d9:
            if (r2 == 0) goto L_0x00e1
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r2 = (androidx.compose.ui.Modifier) r2
            r13 = r2
            goto L_0x00e2
        L_0x00e1:
            r13 = r3
        L_0x00e2:
            r2 = 0
            r3 = 3
            r15 = 0
            if (r4 == 0) goto L_0x0102
            androidx.compose.animation.EnterTransition r4 = androidx.compose.animation.EnterExitTransitionKt.fadeIn$default(r15, r2, r3, r15)
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 15
            r22 = 0
            androidx.compose.animation.EnterTransition r5 = androidx.compose.animation.EnterExitTransitionKt.expandIn$default(r17, r18, r19, r20, r21, r22)
            androidx.compose.animation.EnterTransition r4 = r4.plus(r5)
            r17 = r4
            goto L_0x0104
        L_0x0102:
            r17 = r5
        L_0x0104:
            if (r6 == 0) goto L_0x0120
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 15
            r23 = 0
            androidx.compose.animation.ExitTransition r4 = androidx.compose.animation.EnterExitTransitionKt.shrinkOut$default(r18, r19, r20, r21, r22, r23)
            androidx.compose.animation.ExitTransition r2 = androidx.compose.animation.EnterExitTransitionKt.fadeOut$default(r15, r2, r3, r15)
            androidx.compose.animation.ExitTransition r2 = r4.plus(r2)
            r15 = r2
            goto L_0x0121
        L_0x0120:
            r15 = r7
        L_0x0121:
            if (r12 == 0) goto L_0x0126
            java.lang.String r2 = "AnimatedVisibility"
            r14 = r2
        L_0x0126:
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x0133
            r2 = -1
            java.lang.String r3 = "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r1, r2, r3)
        L_0x0133:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r24)
            r2 = r1 & 14
            int r3 = r1 >> 9
            r3 = r3 & 112(0x70, float:1.57E-43)
            r2 = r2 | r3
            r3 = 0
            androidx.compose.animation.core.Transition r0 = androidx.compose.animation.core.TransitionKt.updateTransition(r0, (java.lang.String) r14, (androidx.compose.runtime.Composer) r10, (int) r2, (int) r3)
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1 r2 = androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1.INSTANCE
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            int r3 = r1 << 3
            r4 = r3 & 896(0x380, float:1.256E-42)
            r4 = r4 | 48
            r5 = r3 & 7168(0x1c00, float:1.0045E-41)
            r4 = r4 | r5
            r5 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r5
            r3 = r3 | r4
            r1 = r1 & r16
            r7 = r3 | r1
            r1 = r2
            r2 = r13
            r3 = r17
            r4 = r15
            r5 = r29
            r6 = r10
            AnimatedEnterExitImpl(r0, r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x016d
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x016d:
            r2 = r13
            r5 = r14
            r4 = r15
            r3 = r17
        L_0x0172:
            androidx.compose.runtime.ScopeUpdateScope r10 = r10.endRestartGroup()
            if (r10 != 0) goto L_0x0179
            goto L_0x018c
        L_0x0179:
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2 r12 = new androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
            r0 = r12
            r1 = r24
            r6 = r29
            r7 = r31
            r8 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            kotlin.jvm.functions.Function2 r12 = (kotlin.jvm.functions.Function2) r12
            r10.updateScope(r12)
        L_0x018c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(boolean, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void AnimatedVisibility(androidx.compose.foundation.layout.RowScope r24, boolean r25, androidx.compose.ui.Modifier r26, androidx.compose.animation.EnterTransition r27, androidx.compose.animation.ExitTransition r28, java.lang.String r29, kotlin.jvm.functions.Function3<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r30, androidx.compose.runtime.Composer r31, int r32, int r33) {
        /*
            r8 = r30
            r9 = r32
            java.lang.String r0 = "<this>"
            r10 = r24
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = -1741346906(0xffffffff983527a6, float:-2.341372E-24)
            r1 = r31
            androidx.compose.runtime.Composer r11 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(AnimatedVisibility)P(5,4,1,2,3)202@11021L32,203@11058L73:AnimatedVisibility.kt#xbi5r1"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r1)
            r1 = r33 & 1
            if (r1 == 0) goto L_0x0028
            r1 = r9 | 48
            r12 = r25
            goto L_0x003c
        L_0x0028:
            r1 = r9 & 112(0x70, float:1.57E-43)
            r12 = r25
            if (r1 != 0) goto L_0x003b
            boolean r1 = r11.changed((boolean) r12)
            if (r1 == 0) goto L_0x0037
            r1 = 32
            goto L_0x0039
        L_0x0037:
            r1 = 16
        L_0x0039:
            r1 = r1 | r9
            goto L_0x003c
        L_0x003b:
            r1 = r9
        L_0x003c:
            r2 = r33 & 2
            if (r2 == 0) goto L_0x0043
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0056
        L_0x0043:
            r3 = r9 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x0056
            r3 = r26
            boolean r4 = r11.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x0052
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0054
        L_0x0052:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0054:
            r1 = r1 | r4
            goto L_0x0058
        L_0x0056:
            r3 = r26
        L_0x0058:
            r4 = r33 & 4
            if (r4 == 0) goto L_0x005f
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0072
        L_0x005f:
            r5 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x0072
            r5 = r27
            boolean r6 = r11.changed((java.lang.Object) r5)
            if (r6 == 0) goto L_0x006e
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x0070
        L_0x006e:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x0070:
            r1 = r1 | r6
            goto L_0x0074
        L_0x0072:
            r5 = r27
        L_0x0074:
            r6 = r33 & 8
            r7 = 57344(0xe000, float:8.0356E-41)
            if (r6 == 0) goto L_0x007e
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0091
        L_0x007e:
            r13 = r9 & r7
            if (r13 != 0) goto L_0x0091
            r13 = r28
            boolean r14 = r11.changed((java.lang.Object) r13)
            if (r14 == 0) goto L_0x008d
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008f
        L_0x008d:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x008f:
            r1 = r1 | r14
            goto L_0x0093
        L_0x0091:
            r13 = r28
        L_0x0093:
            r14 = r33 & 16
            r15 = 458752(0x70000, float:6.42848E-40)
            if (r14 == 0) goto L_0x00a0
            r16 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r16
            r15 = r29
            goto L_0x00b3
        L_0x00a0:
            r16 = r9 & r15
            r15 = r29
            if (r16 != 0) goto L_0x00b3
            boolean r16 = r11.changed((java.lang.Object) r15)
            if (r16 == 0) goto L_0x00af
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b1
        L_0x00af:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b1:
            r1 = r1 | r16
        L_0x00b3:
            r16 = r33 & 32
            if (r16 == 0) goto L_0x00bc
            r16 = 1572864(0x180000, float:2.204052E-39)
        L_0x00b9:
            r1 = r1 | r16
            goto L_0x00ce
        L_0x00bc:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r9 & r16
            if (r16 != 0) goto L_0x00ce
            boolean r16 = r11.changed((java.lang.Object) r8)
            if (r16 == 0) goto L_0x00cb
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00b9
        L_0x00cb:
            r16 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00b9
        L_0x00ce:
            r16 = 2995921(0x2db6d1, float:4.19818E-39)
            r7 = r1 & r16
            r0 = 599184(0x92490, float:8.39636E-40)
            if (r7 != r0) goto L_0x00e7
            boolean r0 = r11.getSkipping()
            if (r0 != 0) goto L_0x00df
            goto L_0x00e7
        L_0x00df:
            r11.skipToGroupEnd()
            r4 = r5
            r5 = r13
            r6 = r15
            goto L_0x0181
        L_0x00e7:
            if (r2 == 0) goto L_0x00f0
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            r17 = r0
            goto L_0x00f2
        L_0x00f0:
            r17 = r3
        L_0x00f2:
            r0 = 0
            r2 = 3
            r3 = 0
            if (r4 == 0) goto L_0x0112
            androidx.compose.animation.EnterTransition r4 = androidx.compose.animation.EnterExitTransitionKt.fadeIn$default(r3, r0, r2, r3)
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 15
            r23 = 0
            androidx.compose.animation.EnterTransition r5 = androidx.compose.animation.EnterExitTransitionKt.expandHorizontally$default(r18, r19, r20, r21, r22, r23)
            androidx.compose.animation.EnterTransition r4 = r4.plus(r5)
            r18 = r4
            goto L_0x0114
        L_0x0112:
            r18 = r5
        L_0x0114:
            if (r6 == 0) goto L_0x012a
            androidx.compose.animation.ExitTransition r0 = androidx.compose.animation.EnterExitTransitionKt.fadeOut$default(r3, r0, r2, r3)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 15
            r7 = 0
            androidx.compose.animation.ExitTransition r2 = androidx.compose.animation.EnterExitTransitionKt.shrinkHorizontally$default(r2, r3, r4, r5, r6, r7)
            androidx.compose.animation.ExitTransition r0 = r0.plus(r2)
            r13 = r0
        L_0x012a:
            if (r14 == 0) goto L_0x012f
            java.lang.String r0 = "AnimatedVisibility"
            r15 = r0
        L_0x012f:
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x013f
            r0 = -1
            java.lang.String r2 = "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)"
            r3 = -1741346906(0xffffffff983527a6, float:-2.341372E-24)
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r1, r0, r2)
        L_0x013f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r25)
            int r2 = r1 >> 3
            r3 = r2 & 14
            int r4 = r1 >> 12
            r4 = r4 & 112(0x70, float:1.57E-43)
            r3 = r3 | r4
            r4 = 0
            androidx.compose.animation.core.Transition r0 = androidx.compose.animation.core.TransitionKt.updateTransition(r0, (java.lang.String) r15, (androidx.compose.runtime.Composer) r11, (int) r3, (int) r4)
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3 r3 = androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3.INSTANCE
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            r4 = r1 & 896(0x380, float:1.256E-42)
            r4 = r4 | 48
            r5 = r1 & 7168(0x1c00, float:1.0045E-41)
            r4 = r4 | r5
            r5 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r5
            r1 = r1 | r4
            r4 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r4
            r7 = r1 | r2
            r1 = r3
            r2 = r17
            r3 = r18
            r4 = r13
            r5 = r30
            r6 = r11
            AnimatedEnterExitImpl(r0, r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x017b
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x017b:
            r5 = r13
            r6 = r15
            r3 = r17
            r4 = r18
        L_0x0181:
            androidx.compose.runtime.ScopeUpdateScope r11 = r11.endRestartGroup()
            if (r11 != 0) goto L_0x0188
            goto L_0x019d
        L_0x0188:
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$4 r13 = new androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$4
            r0 = r13
            r1 = r24
            r2 = r25
            r7 = r30
            r8 = r32
            r9 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            kotlin.jvm.functions.Function2 r13 = (kotlin.jvm.functions.Function2) r13
            r11.updateScope(r13)
        L_0x019d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(androidx.compose.foundation.layout.RowScope, boolean, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void AnimatedVisibility(androidx.compose.foundation.layout.ColumnScope r24, boolean r25, androidx.compose.ui.Modifier r26, androidx.compose.animation.EnterTransition r27, androidx.compose.animation.ExitTransition r28, java.lang.String r29, kotlin.jvm.functions.Function3<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r30, androidx.compose.runtime.Composer r31, int r32, int r33) {
        /*
            r8 = r30
            r9 = r32
            java.lang.String r0 = "<this>"
            r10 = r24
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 1766503102(0x694ab2be, float:1.5315444E25)
            r1 = r31
            androidx.compose.runtime.Composer r11 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(AnimatedVisibility)P(5,4,1,2,3)275@15293L32,276@15330L73:AnimatedVisibility.kt#xbi5r1"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r1)
            r1 = r33 & 1
            if (r1 == 0) goto L_0x0028
            r1 = r9 | 48
            r12 = r25
            goto L_0x003c
        L_0x0028:
            r1 = r9 & 112(0x70, float:1.57E-43)
            r12 = r25
            if (r1 != 0) goto L_0x003b
            boolean r1 = r11.changed((boolean) r12)
            if (r1 == 0) goto L_0x0037
            r1 = 32
            goto L_0x0039
        L_0x0037:
            r1 = 16
        L_0x0039:
            r1 = r1 | r9
            goto L_0x003c
        L_0x003b:
            r1 = r9
        L_0x003c:
            r2 = r33 & 2
            if (r2 == 0) goto L_0x0043
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0056
        L_0x0043:
            r3 = r9 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x0056
            r3 = r26
            boolean r4 = r11.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x0052
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0054
        L_0x0052:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0054:
            r1 = r1 | r4
            goto L_0x0058
        L_0x0056:
            r3 = r26
        L_0x0058:
            r4 = r33 & 4
            if (r4 == 0) goto L_0x005f
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0072
        L_0x005f:
            r5 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x0072
            r5 = r27
            boolean r6 = r11.changed((java.lang.Object) r5)
            if (r6 == 0) goto L_0x006e
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x0070
        L_0x006e:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x0070:
            r1 = r1 | r6
            goto L_0x0074
        L_0x0072:
            r5 = r27
        L_0x0074:
            r6 = r33 & 8
            r7 = 57344(0xe000, float:8.0356E-41)
            if (r6 == 0) goto L_0x007e
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0091
        L_0x007e:
            r13 = r9 & r7
            if (r13 != 0) goto L_0x0091
            r13 = r28
            boolean r14 = r11.changed((java.lang.Object) r13)
            if (r14 == 0) goto L_0x008d
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008f
        L_0x008d:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x008f:
            r1 = r1 | r14
            goto L_0x0093
        L_0x0091:
            r13 = r28
        L_0x0093:
            r14 = r33 & 16
            r15 = 458752(0x70000, float:6.42848E-40)
            if (r14 == 0) goto L_0x00a0
            r16 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r16
            r15 = r29
            goto L_0x00b3
        L_0x00a0:
            r16 = r9 & r15
            r15 = r29
            if (r16 != 0) goto L_0x00b3
            boolean r16 = r11.changed((java.lang.Object) r15)
            if (r16 == 0) goto L_0x00af
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b1
        L_0x00af:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b1:
            r1 = r1 | r16
        L_0x00b3:
            r16 = r33 & 32
            if (r16 == 0) goto L_0x00bc
            r16 = 1572864(0x180000, float:2.204052E-39)
        L_0x00b9:
            r1 = r1 | r16
            goto L_0x00ce
        L_0x00bc:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r9 & r16
            if (r16 != 0) goto L_0x00ce
            boolean r16 = r11.changed((java.lang.Object) r8)
            if (r16 == 0) goto L_0x00cb
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00b9
        L_0x00cb:
            r16 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00b9
        L_0x00ce:
            r16 = 2995921(0x2db6d1, float:4.19818E-39)
            r7 = r1 & r16
            r0 = 599184(0x92490, float:8.39636E-40)
            if (r7 != r0) goto L_0x00e7
            boolean r0 = r11.getSkipping()
            if (r0 != 0) goto L_0x00df
            goto L_0x00e7
        L_0x00df:
            r11.skipToGroupEnd()
            r4 = r5
            r5 = r13
            r6 = r15
            goto L_0x0181
        L_0x00e7:
            if (r2 == 0) goto L_0x00f0
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            r17 = r0
            goto L_0x00f2
        L_0x00f0:
            r17 = r3
        L_0x00f2:
            r0 = 0
            r2 = 3
            r3 = 0
            if (r4 == 0) goto L_0x0112
            androidx.compose.animation.EnterTransition r4 = androidx.compose.animation.EnterExitTransitionKt.fadeIn$default(r3, r0, r2, r3)
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 15
            r23 = 0
            androidx.compose.animation.EnterTransition r5 = androidx.compose.animation.EnterExitTransitionKt.expandVertically$default(r18, r19, r20, r21, r22, r23)
            androidx.compose.animation.EnterTransition r4 = r4.plus(r5)
            r18 = r4
            goto L_0x0114
        L_0x0112:
            r18 = r5
        L_0x0114:
            if (r6 == 0) goto L_0x012a
            androidx.compose.animation.ExitTransition r0 = androidx.compose.animation.EnterExitTransitionKt.fadeOut$default(r3, r0, r2, r3)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 15
            r7 = 0
            androidx.compose.animation.ExitTransition r2 = androidx.compose.animation.EnterExitTransitionKt.shrinkVertically$default(r2, r3, r4, r5, r6, r7)
            androidx.compose.animation.ExitTransition r0 = r0.plus(r2)
            r13 = r0
        L_0x012a:
            if (r14 == 0) goto L_0x012f
            java.lang.String r0 = "AnimatedVisibility"
            r15 = r0
        L_0x012f:
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x013f
            r0 = -1
            java.lang.String r2 = "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)"
            r3 = 1766503102(0x694ab2be, float:1.5315444E25)
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r1, r0, r2)
        L_0x013f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r25)
            int r2 = r1 >> 3
            r3 = r2 & 14
            int r4 = r1 >> 12
            r4 = r4 & 112(0x70, float:1.57E-43)
            r3 = r3 | r4
            r4 = 0
            androidx.compose.animation.core.Transition r0 = androidx.compose.animation.core.TransitionKt.updateTransition(r0, (java.lang.String) r15, (androidx.compose.runtime.Composer) r11, (int) r3, (int) r4)
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5 r3 = androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5.INSTANCE
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            r4 = r1 & 896(0x380, float:1.256E-42)
            r4 = r4 | 48
            r5 = r1 & 7168(0x1c00, float:1.0045E-41)
            r4 = r4 | r5
            r5 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r5
            r1 = r1 | r4
            r4 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r4
            r7 = r1 | r2
            r1 = r3
            r2 = r17
            r3 = r18
            r4 = r13
            r5 = r30
            r6 = r11
            AnimatedEnterExitImpl(r0, r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x017b
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x017b:
            r5 = r13
            r6 = r15
            r3 = r17
            r4 = r18
        L_0x0181:
            androidx.compose.runtime.ScopeUpdateScope r11 = r11.endRestartGroup()
            if (r11 != 0) goto L_0x0188
            goto L_0x019d
        L_0x0188:
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6 r13 = new androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
            r0 = r13
            r1 = r24
            r2 = r25
            r7 = r30
            r8 = r32
            r9 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            kotlin.jvm.functions.Function2 r13 = (kotlin.jvm.functions.Function2) r13
            r11.updateScope(r13)
        L_0x019d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(androidx.compose.foundation.layout.ColumnScope, boolean, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void AnimatedVisibility(androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean> r24, androidx.compose.ui.Modifier r25, androidx.compose.animation.EnterTransition r26, androidx.compose.animation.ExitTransition r27, java.lang.String r28, kotlin.jvm.functions.Function3<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            r1 = r24
            r10 = r29
            r11 = r31
            java.lang.String r0 = "visibleState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = -222898426(0xfffffffff2b6d706, float:-7.243036E30)
            r2 = r30
            androidx.compose.runtime.Composer r12 = r2.startRestartGroup(r0)
            java.lang.String r2 = "C(AnimatedVisibility)P(5,4,1,2,3)381@20708L37,382@20750L73:AnimatedVisibility.kt#xbi5r1"
            androidx.compose.runtime.ComposerKt.sourceInformation(r12, r2)
            r2 = r32 & 1
            if (r2 == 0) goto L_0x0027
            r2 = r11 | 6
            goto L_0x0037
        L_0x0027:
            r2 = r11 & 14
            if (r2 != 0) goto L_0x0036
            boolean r2 = r12.changed((java.lang.Object) r1)
            if (r2 == 0) goto L_0x0033
            r2 = 4
            goto L_0x0034
        L_0x0033:
            r2 = 2
        L_0x0034:
            r2 = r2 | r11
            goto L_0x0037
        L_0x0036:
            r2 = r11
        L_0x0037:
            r3 = r32 & 2
            if (r3 == 0) goto L_0x003e
            r2 = r2 | 48
            goto L_0x0051
        L_0x003e:
            r4 = r11 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0051
            r4 = r25
            boolean r5 = r12.changed((java.lang.Object) r4)
            if (r5 == 0) goto L_0x004d
            r5 = 32
            goto L_0x004f
        L_0x004d:
            r5 = 16
        L_0x004f:
            r2 = r2 | r5
            goto L_0x0053
        L_0x0051:
            r4 = r25
        L_0x0053:
            r5 = r32 & 4
            if (r5 == 0) goto L_0x005a
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x006d
        L_0x005a:
            r6 = r11 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x006d
            r6 = r26
            boolean r7 = r12.changed((java.lang.Object) r6)
            if (r7 == 0) goto L_0x0069
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x006b
        L_0x0069:
            r7 = 128(0x80, float:1.794E-43)
        L_0x006b:
            r2 = r2 | r7
            goto L_0x006f
        L_0x006d:
            r6 = r26
        L_0x006f:
            r7 = r32 & 8
            if (r7 == 0) goto L_0x0076
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x0089
        L_0x0076:
            r8 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0089
            r8 = r27
            boolean r9 = r12.changed((java.lang.Object) r8)
            if (r9 == 0) goto L_0x0085
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0087
        L_0x0085:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0087:
            r2 = r2 | r9
            goto L_0x008b
        L_0x0089:
            r8 = r27
        L_0x008b:
            r9 = r32 & 16
            r13 = 57344(0xe000, float:8.0356E-41)
            if (r9 == 0) goto L_0x0095
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a8
        L_0x0095:
            r14 = r11 & r13
            if (r14 != 0) goto L_0x00a8
            r14 = r28
            boolean r15 = r12.changed((java.lang.Object) r14)
            if (r15 == 0) goto L_0x00a4
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a6
        L_0x00a4:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x00a6:
            r2 = r2 | r15
            goto L_0x00aa
        L_0x00a8:
            r14 = r28
        L_0x00aa:
            r15 = r32 & 32
            r16 = 458752(0x70000, float:6.42848E-40)
            if (r15 == 0) goto L_0x00b4
            r15 = 196608(0x30000, float:2.75506E-40)
        L_0x00b2:
            r2 = r2 | r15
            goto L_0x00c4
        L_0x00b4:
            r15 = r11 & r16
            if (r15 != 0) goto L_0x00c4
            boolean r15 = r12.changed((java.lang.Object) r10)
            if (r15 == 0) goto L_0x00c1
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b2
        L_0x00c1:
            r15 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00b2
        L_0x00c4:
            r15 = 374491(0x5b6db, float:5.24774E-40)
            r15 = r15 & r2
            r13 = 74898(0x12492, float:1.04954E-40)
            if (r15 != r13) goto L_0x00dd
            boolean r13 = r12.getSkipping()
            if (r13 != 0) goto L_0x00d4
            goto L_0x00dd
        L_0x00d4:
            r12.skipToGroupEnd()
            r2 = r4
            r3 = r6
            r4 = r8
            r5 = r14
            goto L_0x0175
        L_0x00dd:
            if (r3 == 0) goto L_0x00e5
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r3 = (androidx.compose.ui.Modifier) r3
            r13 = r3
            goto L_0x00e6
        L_0x00e5:
            r13 = r4
        L_0x00e6:
            r3 = 0
            r4 = 3
            r15 = 0
            if (r5 == 0) goto L_0x0106
            androidx.compose.animation.EnterTransition r5 = androidx.compose.animation.EnterExitTransitionKt.fadeIn$default(r15, r3, r4, r15)
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 15
            r22 = 0
            androidx.compose.animation.EnterTransition r6 = androidx.compose.animation.EnterExitTransitionKt.expandIn$default(r17, r18, r19, r20, r21, r22)
            androidx.compose.animation.EnterTransition r5 = r5.plus(r6)
            r17 = r5
            goto L_0x0108
        L_0x0106:
            r17 = r6
        L_0x0108:
            if (r7 == 0) goto L_0x0124
            androidx.compose.animation.ExitTransition r3 = androidx.compose.animation.EnterExitTransitionKt.fadeOut$default(r15, r3, r4, r15)
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 15
            r23 = 0
            androidx.compose.animation.ExitTransition r4 = androidx.compose.animation.EnterExitTransitionKt.shrinkOut$default(r18, r19, r20, r21, r22, r23)
            androidx.compose.animation.ExitTransition r3 = r3.plus(r4)
            r15 = r3
            goto L_0x0125
        L_0x0124:
            r15 = r8
        L_0x0125:
            if (r9 == 0) goto L_0x012a
            java.lang.String r3 = "AnimatedVisibility"
            r14 = r3
        L_0x012a:
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L_0x0137
            r3 = -1
            java.lang.String r4 = "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r2, r3, r4)
        L_0x0137:
            int r0 = androidx.compose.animation.core.MutableTransitionState.$stable
            r3 = r2 & 14
            r0 = r0 | r3
            int r3 = r2 >> 9
            r3 = r3 & 112(0x70, float:1.57E-43)
            r0 = r0 | r3
            r3 = 0
            androidx.compose.animation.core.Transition r0 = androidx.compose.animation.core.TransitionKt.updateTransition(r1, (java.lang.String) r14, (androidx.compose.runtime.Composer) r12, (int) r0, (int) r3)
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7 r3 = androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7.INSTANCE
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            int r4 = r2 << 3
            r5 = r4 & 896(0x380, float:1.256E-42)
            r5 = r5 | 48
            r6 = r4 & 7168(0x1c00, float:1.0045E-41)
            r5 = r5 | r6
            r6 = 57344(0xe000, float:8.0356E-41)
            r4 = r4 & r6
            r4 = r4 | r5
            r2 = r2 & r16
            r9 = r4 | r2
            r2 = r0
            r4 = r13
            r5 = r17
            r6 = r15
            r7 = r29
            r8 = r12
            AnimatedEnterExitImpl(r2, r3, r4, r5, r6, r7, r8, r9)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0170
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0170:
            r2 = r13
            r5 = r14
            r4 = r15
            r3 = r17
        L_0x0175:
            androidx.compose.runtime.ScopeUpdateScope r9 = r12.endRestartGroup()
            if (r9 != 0) goto L_0x017c
            goto L_0x018f
        L_0x017c:
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8 r12 = new androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
            r0 = r12
            r1 = r24
            r6 = r29
            r7 = r31
            r8 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            kotlin.jvm.functions.Function2 r12 = (kotlin.jvm.functions.Function2) r12
            r9.updateScope(r12)
        L_0x018f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(androidx.compose.animation.core.MutableTransitionState, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void AnimatedVisibility(androidx.compose.foundation.layout.RowScope r24, androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean> r25, androidx.compose.ui.Modifier r26, androidx.compose.animation.EnterTransition r27, androidx.compose.animation.ExitTransition r28, java.lang.String r29, kotlin.jvm.functions.Function3<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r30, androidx.compose.runtime.Composer r31, int r32, int r33) {
        /*
            r2 = r25
            r11 = r30
            r12 = r32
            java.lang.String r0 = "<this>"
            r1 = r24
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "visibleState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = 836509870(0x31dc20ae, float:6.406558E-9)
            r3 = r31
            androidx.compose.runtime.Composer r13 = r3.startRestartGroup(r0)
            java.lang.String r3 = "C(AnimatedVisibility)P(5,4,1,2,3)456@25058L37,457@25100L73:AnimatedVisibility.kt#xbi5r1"
            androidx.compose.runtime.ComposerKt.sourceInformation(r13, r3)
            r3 = r33 & 1
            if (r3 == 0) goto L_0x002e
            r3 = r12 | 48
            goto L_0x0040
        L_0x002e:
            r3 = r12 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x003f
            boolean r3 = r13.changed((java.lang.Object) r2)
            if (r3 == 0) goto L_0x003b
            r3 = 32
            goto L_0x003d
        L_0x003b:
            r3 = 16
        L_0x003d:
            r3 = r3 | r12
            goto L_0x0040
        L_0x003f:
            r3 = r12
        L_0x0040:
            r4 = r33 & 2
            if (r4 == 0) goto L_0x0047
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x005a
        L_0x0047:
            r5 = r12 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x005a
            r5 = r26
            boolean r6 = r13.changed((java.lang.Object) r5)
            if (r6 == 0) goto L_0x0056
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0058
        L_0x0056:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0058:
            r3 = r3 | r6
            goto L_0x005c
        L_0x005a:
            r5 = r26
        L_0x005c:
            r6 = r33 & 4
            if (r6 == 0) goto L_0x0063
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0076
        L_0x0063:
            r7 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0076
            r7 = r27
            boolean r8 = r13.changed((java.lang.Object) r7)
            if (r8 == 0) goto L_0x0072
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0074
        L_0x0072:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0074:
            r3 = r3 | r8
            goto L_0x0078
        L_0x0076:
            r7 = r27
        L_0x0078:
            r8 = r33 & 8
            r9 = 57344(0xe000, float:8.0356E-41)
            if (r8 == 0) goto L_0x0082
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0095
        L_0x0082:
            r10 = r12 & r9
            if (r10 != 0) goto L_0x0095
            r10 = r28
            boolean r14 = r13.changed((java.lang.Object) r10)
            if (r14 == 0) goto L_0x0091
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0093
        L_0x0091:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x0093:
            r3 = r3 | r14
            goto L_0x0097
        L_0x0095:
            r10 = r28
        L_0x0097:
            r14 = r33 & 16
            r15 = 458752(0x70000, float:6.42848E-40)
            if (r14 == 0) goto L_0x00a4
            r16 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r16
            r15 = r29
            goto L_0x00b7
        L_0x00a4:
            r16 = r12 & r15
            r15 = r29
            if (r16 != 0) goto L_0x00b7
            boolean r16 = r13.changed((java.lang.Object) r15)
            if (r16 == 0) goto L_0x00b3
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b5
        L_0x00b3:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b5:
            r3 = r3 | r16
        L_0x00b7:
            r16 = r33 & 32
            if (r16 == 0) goto L_0x00c0
            r16 = 1572864(0x180000, float:2.204052E-39)
        L_0x00bd:
            r3 = r3 | r16
            goto L_0x00d2
        L_0x00c0:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r12 & r16
            if (r16 != 0) goto L_0x00d2
            boolean r16 = r13.changed((java.lang.Object) r11)
            if (r16 == 0) goto L_0x00cf
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00bd
        L_0x00cf:
            r16 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00bd
        L_0x00d2:
            r16 = 2995921(0x2db6d1, float:4.19818E-39)
            r9 = r3 & r16
            r0 = 599184(0x92490, float:8.39636E-40)
            if (r9 != r0) goto L_0x00ec
            boolean r0 = r13.getSkipping()
            if (r0 != 0) goto L_0x00e3
            goto L_0x00ec
        L_0x00e3:
            r13.skipToGroupEnd()
            r3 = r5
            r4 = r7
            r5 = r10
            r6 = r15
            goto L_0x018c
        L_0x00ec:
            if (r4 == 0) goto L_0x00f3
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            goto L_0x00f4
        L_0x00f3:
            r0 = r5
        L_0x00f4:
            r4 = 0
            r5 = 3
            r9 = 0
            if (r6 == 0) goto L_0x0114
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 15
            r22 = 0
            androidx.compose.animation.EnterTransition r6 = androidx.compose.animation.EnterExitTransitionKt.expandHorizontally$default(r17, r18, r19, r20, r21, r22)
            androidx.compose.animation.EnterTransition r7 = androidx.compose.animation.EnterExitTransitionKt.fadeIn$default(r9, r4, r5, r9)
            androidx.compose.animation.EnterTransition r6 = r6.plus(r7)
            r17 = r6
            goto L_0x0116
        L_0x0114:
            r17 = r7
        L_0x0116:
            if (r8 == 0) goto L_0x0133
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 15
            r23 = 0
            androidx.compose.animation.ExitTransition r6 = androidx.compose.animation.EnterExitTransitionKt.shrinkHorizontally$default(r18, r19, r20, r21, r22, r23)
            androidx.compose.animation.ExitTransition r4 = androidx.compose.animation.EnterExitTransitionKt.fadeOut$default(r9, r4, r5, r9)
            androidx.compose.animation.ExitTransition r4 = r6.plus(r4)
            r18 = r4
            goto L_0x0135
        L_0x0133:
            r18 = r10
        L_0x0135:
            if (r14 == 0) goto L_0x013a
            java.lang.String r4 = "AnimatedVisibility"
            r15 = r4
        L_0x013a:
            boolean r4 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r4 == 0) goto L_0x014a
            r4 = -1
            java.lang.String r5 = "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)"
            r6 = 836509870(0x31dc20ae, float:6.406558E-9)
            androidx.compose.runtime.ComposerKt.traceEventStart(r6, r3, r4, r5)
        L_0x014a:
            int r4 = androidx.compose.animation.core.MutableTransitionState.$stable
            int r5 = r3 >> 3
            r6 = r5 & 14
            r4 = r4 | r6
            int r6 = r3 >> 12
            r6 = r6 & 112(0x70, float:1.57E-43)
            r4 = r4 | r6
            r6 = 0
            androidx.compose.animation.core.Transition r4 = androidx.compose.animation.core.TransitionKt.updateTransition(r2, (java.lang.String) r15, (androidx.compose.runtime.Composer) r13, (int) r4, (int) r6)
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9 r6 = androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9.INSTANCE
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            r7 = r3 & 896(0x380, float:1.256E-42)
            r7 = r7 | 48
            r8 = r3 & 7168(0x1c00, float:1.0045E-41)
            r7 = r7 | r8
            r8 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r8
            r3 = r3 | r7
            r7 = 458752(0x70000, float:6.42848E-40)
            r5 = r5 & r7
            r10 = r3 | r5
            r3 = r4
            r4 = r6
            r5 = r0
            r6 = r17
            r7 = r18
            r8 = r30
            r9 = r13
            AnimatedEnterExitImpl(r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L_0x0186
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0186:
            r3 = r0
            r6 = r15
            r4 = r17
            r5 = r18
        L_0x018c:
            androidx.compose.runtime.ScopeUpdateScope r10 = r13.endRestartGroup()
            if (r10 != 0) goto L_0x0193
            goto L_0x01a8
        L_0x0193:
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$10 r13 = new androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$10
            r0 = r13
            r1 = r24
            r2 = r25
            r7 = r30
            r8 = r32
            r9 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            kotlin.jvm.functions.Function2 r13 = (kotlin.jvm.functions.Function2) r13
            r10.updateScope(r13)
        L_0x01a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(androidx.compose.foundation.layout.RowScope, androidx.compose.animation.core.MutableTransitionState, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void AnimatedVisibility(androidx.compose.foundation.layout.ColumnScope r24, androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean> r25, androidx.compose.ui.Modifier r26, androidx.compose.animation.EnterTransition r27, androidx.compose.animation.ExitTransition r28, java.lang.String r29, kotlin.jvm.functions.Function3<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r30, androidx.compose.runtime.Composer r31, int r32, int r33) {
        /*
            r2 = r25
            r11 = r30
            r12 = r32
            java.lang.String r0 = "<this>"
            r1 = r24
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "visibleState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = -850656618(0xffffffffcd4c0296, float:-2.13920096E8)
            r3 = r31
            androidx.compose.runtime.Composer r13 = r3.startRestartGroup(r0)
            java.lang.String r3 = "C(AnimatedVisibility)P(5,4,1,2,3)532@29500L37,533@29542L73:AnimatedVisibility.kt#xbi5r1"
            androidx.compose.runtime.ComposerKt.sourceInformation(r13, r3)
            r3 = r33 & 1
            if (r3 == 0) goto L_0x002e
            r3 = r12 | 48
            goto L_0x0040
        L_0x002e:
            r3 = r12 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x003f
            boolean r3 = r13.changed((java.lang.Object) r2)
            if (r3 == 0) goto L_0x003b
            r3 = 32
            goto L_0x003d
        L_0x003b:
            r3 = 16
        L_0x003d:
            r3 = r3 | r12
            goto L_0x0040
        L_0x003f:
            r3 = r12
        L_0x0040:
            r4 = r33 & 2
            if (r4 == 0) goto L_0x0047
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x005a
        L_0x0047:
            r5 = r12 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x005a
            r5 = r26
            boolean r6 = r13.changed((java.lang.Object) r5)
            if (r6 == 0) goto L_0x0056
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0058
        L_0x0056:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0058:
            r3 = r3 | r6
            goto L_0x005c
        L_0x005a:
            r5 = r26
        L_0x005c:
            r6 = r33 & 4
            if (r6 == 0) goto L_0x0063
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0076
        L_0x0063:
            r7 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0076
            r7 = r27
            boolean r8 = r13.changed((java.lang.Object) r7)
            if (r8 == 0) goto L_0x0072
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0074
        L_0x0072:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0074:
            r3 = r3 | r8
            goto L_0x0078
        L_0x0076:
            r7 = r27
        L_0x0078:
            r8 = r33 & 8
            r9 = 57344(0xe000, float:8.0356E-41)
            if (r8 == 0) goto L_0x0082
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0095
        L_0x0082:
            r10 = r12 & r9
            if (r10 != 0) goto L_0x0095
            r10 = r28
            boolean r14 = r13.changed((java.lang.Object) r10)
            if (r14 == 0) goto L_0x0091
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0093
        L_0x0091:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x0093:
            r3 = r3 | r14
            goto L_0x0097
        L_0x0095:
            r10 = r28
        L_0x0097:
            r14 = r33 & 16
            r15 = 458752(0x70000, float:6.42848E-40)
            if (r14 == 0) goto L_0x00a4
            r16 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r16
            r15 = r29
            goto L_0x00b7
        L_0x00a4:
            r16 = r12 & r15
            r15 = r29
            if (r16 != 0) goto L_0x00b7
            boolean r16 = r13.changed((java.lang.Object) r15)
            if (r16 == 0) goto L_0x00b3
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b5
        L_0x00b3:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b5:
            r3 = r3 | r16
        L_0x00b7:
            r16 = r33 & 32
            if (r16 == 0) goto L_0x00c0
            r16 = 1572864(0x180000, float:2.204052E-39)
        L_0x00bd:
            r3 = r3 | r16
            goto L_0x00d2
        L_0x00c0:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r12 & r16
            if (r16 != 0) goto L_0x00d2
            boolean r16 = r13.changed((java.lang.Object) r11)
            if (r16 == 0) goto L_0x00cf
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00bd
        L_0x00cf:
            r16 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00bd
        L_0x00d2:
            r16 = 2995921(0x2db6d1, float:4.19818E-39)
            r9 = r3 & r16
            r0 = 599184(0x92490, float:8.39636E-40)
            if (r9 != r0) goto L_0x00ec
            boolean r0 = r13.getSkipping()
            if (r0 != 0) goto L_0x00e3
            goto L_0x00ec
        L_0x00e3:
            r13.skipToGroupEnd()
            r3 = r5
            r4 = r7
            r5 = r10
            r6 = r15
            goto L_0x018c
        L_0x00ec:
            if (r4 == 0) goto L_0x00f3
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            goto L_0x00f4
        L_0x00f3:
            r0 = r5
        L_0x00f4:
            r4 = 0
            r5 = 3
            r9 = 0
            if (r6 == 0) goto L_0x0114
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 15
            r22 = 0
            androidx.compose.animation.EnterTransition r6 = androidx.compose.animation.EnterExitTransitionKt.expandVertically$default(r17, r18, r19, r20, r21, r22)
            androidx.compose.animation.EnterTransition r7 = androidx.compose.animation.EnterExitTransitionKt.fadeIn$default(r9, r4, r5, r9)
            androidx.compose.animation.EnterTransition r6 = r6.plus(r7)
            r17 = r6
            goto L_0x0116
        L_0x0114:
            r17 = r7
        L_0x0116:
            if (r8 == 0) goto L_0x0133
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 15
            r23 = 0
            androidx.compose.animation.ExitTransition r6 = androidx.compose.animation.EnterExitTransitionKt.shrinkVertically$default(r18, r19, r20, r21, r22, r23)
            androidx.compose.animation.ExitTransition r4 = androidx.compose.animation.EnterExitTransitionKt.fadeOut$default(r9, r4, r5, r9)
            androidx.compose.animation.ExitTransition r4 = r6.plus(r4)
            r18 = r4
            goto L_0x0135
        L_0x0133:
            r18 = r10
        L_0x0135:
            if (r14 == 0) goto L_0x013a
            java.lang.String r4 = "AnimatedVisibility"
            r15 = r4
        L_0x013a:
            boolean r4 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r4 == 0) goto L_0x014a
            r4 = -1
            java.lang.String r5 = "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)"
            r6 = -850656618(0xffffffffcd4c0296, float:-2.13920096E8)
            androidx.compose.runtime.ComposerKt.traceEventStart(r6, r3, r4, r5)
        L_0x014a:
            int r4 = androidx.compose.animation.core.MutableTransitionState.$stable
            int r5 = r3 >> 3
            r6 = r5 & 14
            r4 = r4 | r6
            int r6 = r3 >> 12
            r6 = r6 & 112(0x70, float:1.57E-43)
            r4 = r4 | r6
            r6 = 0
            androidx.compose.animation.core.Transition r4 = androidx.compose.animation.core.TransitionKt.updateTransition(r2, (java.lang.String) r15, (androidx.compose.runtime.Composer) r13, (int) r4, (int) r6)
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11 r6 = androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11.INSTANCE
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            r7 = r3 & 896(0x380, float:1.256E-42)
            r7 = r7 | 48
            r8 = r3 & 7168(0x1c00, float:1.0045E-41)
            r7 = r7 | r8
            r8 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r8
            r3 = r3 | r7
            r7 = 458752(0x70000, float:6.42848E-40)
            r5 = r5 & r7
            r10 = r3 | r5
            r3 = r4
            r4 = r6
            r5 = r0
            r6 = r17
            r7 = r18
            r8 = r30
            r9 = r13
            AnimatedEnterExitImpl(r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L_0x0186
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0186:
            r3 = r0
            r6 = r15
            r4 = r17
            r5 = r18
        L_0x018c:
            androidx.compose.runtime.ScopeUpdateScope r10 = r13.endRestartGroup()
            if (r10 != 0) goto L_0x0193
            goto L_0x01a8
        L_0x0193:
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12 r13 = new androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12
            r0 = r13
            r1 = r24
            r2 = r25
            r7 = r30
            r8 = r32
            r9 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            kotlin.jvm.functions.Function2 r13 = (kotlin.jvm.functions.Function2) r13
            r10.updateScope(r13)
        L_0x01a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(androidx.compose.foundation.layout.ColumnScope, androidx.compose.animation.core.MutableTransitionState, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void AnimatedVisibility(androidx.compose.animation.core.Transition<T> r23, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r24, androidx.compose.ui.Modifier r25, androidx.compose.animation.EnterTransition r26, androidx.compose.animation.ExitTransition r27, kotlin.jvm.functions.Function3<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r28, androidx.compose.runtime.Composer r29, int r30, int r31) {
        /*
            r8 = r23
            r9 = r24
            r10 = r28
            r11 = r30
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "visible"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = 1031950689(0x3d825161, float:0.06363178)
            r1 = r29
            androidx.compose.runtime.Composer r12 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(AnimatedVisibility)P(4,3,1,2)606@33860L68:AnimatedVisibility.kt#xbi5r1"
            androidx.compose.runtime.ComposerKt.sourceInformation(r12, r1)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r31 & r1
            if (r1 == 0) goto L_0x0030
            r1 = r11 | 6
            goto L_0x0040
        L_0x0030:
            r1 = r11 & 14
            if (r1 != 0) goto L_0x003f
            boolean r1 = r12.changed((java.lang.Object) r8)
            if (r1 == 0) goto L_0x003c
            r1 = 4
            goto L_0x003d
        L_0x003c:
            r1 = 2
        L_0x003d:
            r1 = r1 | r11
            goto L_0x0040
        L_0x003f:
            r1 = r11
        L_0x0040:
            r2 = r31 & 1
            if (r2 == 0) goto L_0x0047
            r1 = r1 | 48
            goto L_0x0057
        L_0x0047:
            r2 = r11 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0057
            boolean r2 = r12.changed((java.lang.Object) r9)
            if (r2 == 0) goto L_0x0054
            r2 = 32
            goto L_0x0056
        L_0x0054:
            r2 = 16
        L_0x0056:
            r1 = r1 | r2
        L_0x0057:
            r2 = r31 & 2
            if (r2 == 0) goto L_0x005e
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0071
        L_0x005e:
            r3 = r11 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x0071
            r3 = r25
            boolean r4 = r12.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x006d
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x006f
        L_0x006d:
            r4 = 128(0x80, float:1.794E-43)
        L_0x006f:
            r1 = r1 | r4
            goto L_0x0073
        L_0x0071:
            r3 = r25
        L_0x0073:
            r4 = r31 & 4
            if (r4 == 0) goto L_0x007a
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x008d
        L_0x007a:
            r5 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x008d
            r5 = r26
            boolean r6 = r12.changed((java.lang.Object) r5)
            if (r6 == 0) goto L_0x0089
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x008b
        L_0x0089:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x008b:
            r1 = r1 | r6
            goto L_0x008f
        L_0x008d:
            r5 = r26
        L_0x008f:
            r6 = r31 & 8
            r7 = 57344(0xe000, float:8.0356E-41)
            if (r6 == 0) goto L_0x0099
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00ac
        L_0x0099:
            r13 = r11 & r7
            if (r13 != 0) goto L_0x00ac
            r13 = r27
            boolean r14 = r12.changed((java.lang.Object) r13)
            if (r14 == 0) goto L_0x00a8
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00aa
        L_0x00a8:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x00aa:
            r1 = r1 | r14
            goto L_0x00ae
        L_0x00ac:
            r13 = r27
        L_0x00ae:
            r14 = r31 & 16
            r15 = 458752(0x70000, float:6.42848E-40)
            if (r14 == 0) goto L_0x00b8
            r14 = 196608(0x30000, float:2.75506E-40)
        L_0x00b6:
            r1 = r1 | r14
            goto L_0x00c8
        L_0x00b8:
            r14 = r11 & r15
            if (r14 != 0) goto L_0x00c8
            boolean r14 = r12.changed((java.lang.Object) r10)
            if (r14 == 0) goto L_0x00c5
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b6
        L_0x00c5:
            r14 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00b6
        L_0x00c8:
            r14 = 374491(0x5b6db, float:5.24774E-40)
            r14 = r14 & r1
            r15 = 74898(0x12492, float:1.04954E-40)
            if (r14 != r15) goto L_0x00df
            boolean r14 = r12.getSkipping()
            if (r14 != 0) goto L_0x00d8
            goto L_0x00df
        L_0x00d8:
            r12.skipToGroupEnd()
            r4 = r5
            r5 = r13
            goto L_0x0160
        L_0x00df:
            if (r2 == 0) goto L_0x00e7
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r2 = (androidx.compose.ui.Modifier) r2
            r14 = r2
            goto L_0x00e8
        L_0x00e7:
            r14 = r3
        L_0x00e8:
            r2 = 3
            r3 = 0
            r15 = 0
            if (r4 == 0) goto L_0x0108
            androidx.compose.animation.EnterTransition r4 = androidx.compose.animation.EnterExitTransitionKt.fadeIn$default(r15, r3, r2, r15)
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 15
            r21 = 0
            androidx.compose.animation.EnterTransition r5 = androidx.compose.animation.EnterExitTransitionKt.expandIn$default(r16, r17, r18, r19, r20, r21)
            androidx.compose.animation.EnterTransition r4 = r4.plus(r5)
            r16 = r4
            goto L_0x010a
        L_0x0108:
            r16 = r5
        L_0x010a:
            if (r6 == 0) goto L_0x0125
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 15
            r22 = 0
            androidx.compose.animation.ExitTransition r4 = androidx.compose.animation.EnterExitTransitionKt.shrinkOut$default(r17, r18, r19, r20, r21, r22)
            androidx.compose.animation.ExitTransition r2 = androidx.compose.animation.EnterExitTransitionKt.fadeOut$default(r15, r3, r2, r15)
            androidx.compose.animation.ExitTransition r2 = r4.plus(r2)
            r13 = r2
        L_0x0125:
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x0132
            r2 = -1
            java.lang.String r3 = "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r1, r2, r3)
        L_0x0132:
            r0 = r1 & 14
            r2 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            r2 = r1 & r7
            r0 = r0 | r2
            r2 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r2
            r7 = r0 | r1
            r0 = r23
            r1 = r24
            r2 = r14
            r3 = r16
            r4 = r13
            r5 = r28
            r6 = r12
            AnimatedEnterExitImpl(r0, r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x015c
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x015c:
            r5 = r13
            r3 = r14
            r4 = r16
        L_0x0160:
            androidx.compose.runtime.ScopeUpdateScope r12 = r12.endRestartGroup()
            if (r12 != 0) goto L_0x0167
            goto L_0x017c
        L_0x0167:
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$13 r13 = new androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$13
            r0 = r13
            r1 = r23
            r2 = r24
            r6 = r28
            r7 = r30
            r8 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            kotlin.jvm.functions.Function2 r13 = (kotlin.jvm.functions.Function2) r13
            r12.updateScope(r13)
        L_0x017c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(androidx.compose.animation.core.Transition, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    @kotlin.Deprecated(message = "AnimatedVisibility no longer accepts initiallyVisible as a parameter, please use AnimatedVisibility(MutableTransitionState, Modifier, ...) API instead", replaceWith = @kotlin.ReplaceWith(expression = "AnimatedVisibility(transitionState = remember { MutableTransitionState(initiallyVisible) }\n.apply { targetState = visible },\nmodifier = modifier,\nenter = enter,\nexit = exit) {\ncontent() \n}", imports = {"androidx.compose.animation.core.MutableTransitionState"}))
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void AnimatedVisibility(boolean r17, androidx.compose.ui.Modifier r18, androidx.compose.animation.EnterTransition r19, androidx.compose.animation.ExitTransition r20, boolean r21, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r22, androidx.compose.runtime.Composer r23, int r24, int r25) {
        /*
            r9 = r19
            r10 = r20
            r11 = r22
            r12 = r24
            java.lang.String r0 = "enter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "exit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = 1121582420(0x42d9fd54, float:108.99478)
            r1 = r23
            androidx.compose.runtime.Composer r13 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(AnimatedVisibility)P(5,4,1,2,3)*709@38686L53,708@38647L214:AnimatedVisibility.kt#xbi5r1"
            androidx.compose.runtime.ComposerKt.sourceInformation(r13, r1)
            r1 = r25 & 1
            if (r1 == 0) goto L_0x0031
            r1 = r12 | 6
            r14 = r17
            goto L_0x0043
        L_0x0031:
            r1 = r12 & 14
            r14 = r17
            if (r1 != 0) goto L_0x0042
            boolean r1 = r13.changed((boolean) r14)
            if (r1 == 0) goto L_0x003f
            r1 = 4
            goto L_0x0040
        L_0x003f:
            r1 = 2
        L_0x0040:
            r1 = r1 | r12
            goto L_0x0043
        L_0x0042:
            r1 = r12
        L_0x0043:
            r2 = r25 & 2
            if (r2 == 0) goto L_0x004a
            r1 = r1 | 48
            goto L_0x005d
        L_0x004a:
            r3 = r12 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x005d
            r3 = r18
            boolean r4 = r13.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x0059
            r4 = 32
            goto L_0x005b
        L_0x0059:
            r4 = 16
        L_0x005b:
            r1 = r1 | r4
            goto L_0x005f
        L_0x005d:
            r3 = r18
        L_0x005f:
            r4 = r25 & 4
            if (r4 == 0) goto L_0x0066
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0076
        L_0x0066:
            r4 = r12 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0076
            boolean r4 = r13.changed((java.lang.Object) r9)
            if (r4 == 0) goto L_0x0073
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0075
        L_0x0073:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0075:
            r1 = r1 | r4
        L_0x0076:
            r4 = r25 & 8
            if (r4 == 0) goto L_0x007d
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x008d
        L_0x007d:
            r4 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r4 != 0) goto L_0x008d
            boolean r4 = r13.changed((java.lang.Object) r10)
            if (r4 == 0) goto L_0x008a
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x008c
        L_0x008a:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x008c:
            r1 = r1 | r4
        L_0x008d:
            r4 = r25 & 16
            if (r4 == 0) goto L_0x0096
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            r15 = r21
            goto L_0x00aa
        L_0x0096:
            r4 = 57344(0xe000, float:8.0356E-41)
            r4 = r4 & r12
            r15 = r21
            if (r4 != 0) goto L_0x00aa
            boolean r4 = r13.changed((boolean) r15)
            if (r4 == 0) goto L_0x00a7
            r4 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a9
        L_0x00a7:
            r4 = 8192(0x2000, float:1.14794E-41)
        L_0x00a9:
            r1 = r1 | r4
        L_0x00aa:
            r4 = r25 & 32
            r5 = 196608(0x30000, float:2.75506E-40)
            if (r4 == 0) goto L_0x00b2
            r1 = r1 | r5
            goto L_0x00c3
        L_0x00b2:
            r4 = 458752(0x70000, float:6.42848E-40)
            r4 = r4 & r12
            if (r4 != 0) goto L_0x00c3
            boolean r4 = r13.changed((java.lang.Object) r11)
            if (r4 == 0) goto L_0x00c0
            r4 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c2
        L_0x00c0:
            r4 = 65536(0x10000, float:9.18355E-41)
        L_0x00c2:
            r1 = r1 | r4
        L_0x00c3:
            r4 = 374491(0x5b6db, float:5.24774E-40)
            r4 = r4 & r1
            r6 = 74898(0x12492, float:1.04954E-40)
            if (r4 != r6) goto L_0x00d9
            boolean r4 = r13.getSkipping()
            if (r4 != 0) goto L_0x00d3
            goto L_0x00d9
        L_0x00d3:
            r13.skipToGroupEnd()
            r2 = r3
            goto L_0x0156
        L_0x00d9:
            if (r2 == 0) goto L_0x00e2
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r2 = (androidx.compose.ui.Modifier) r2
            r16 = r2
            goto L_0x00e4
        L_0x00e2:
            r16 = r3
        L_0x00e4:
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x00f1
            r2 = -1
            java.lang.String r3 = "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:701)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r1, r2, r3)
        L_0x00f1:
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r13.startReplaceableGroup(r0)
            java.lang.String r0 = "C(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r13, r0)
            java.lang.Object r0 = r13.rememberedValue()
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r0 != r2) goto L_0x0114
            androidx.compose.animation.core.MutableTransitionState r0 = new androidx.compose.animation.core.MutableTransitionState
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r21)
            r0.<init>(r2)
            r13.updateRememberedValue(r0)
        L_0x0114:
            r13.endReplaceableGroup()
            androidx.compose.animation.core.MutableTransitionState r0 = (androidx.compose.animation.core.MutableTransitionState) r0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r17)
            r0.setTargetState(r2)
            r4 = 0
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$16 r2 = new androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$16
            r2.<init>(r11, r1)
            r3 = 1996320812(0x76fd702c, float:2.5701684E33)
            r6 = 1
            androidx.compose.runtime.internal.ComposableLambda r2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r13, r3, r6, r2)
            r6 = r2
            kotlin.jvm.functions.Function3 r6 = (kotlin.jvm.functions.Function3) r6
            int r2 = androidx.compose.animation.core.MutableTransitionState.$stable
            r2 = r2 | r5
            r3 = r1 & 112(0x70, float:1.57E-43)
            r2 = r2 | r3
            r3 = r1 & 896(0x380, float:1.256E-42)
            r2 = r2 | r3
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r7 = r2 | r1
            r8 = 16
            r1 = r16
            r2 = r19
            r3 = r20
            r5 = r6
            r6 = r13
            AnimatedVisibility((androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean>) r0, (androidx.compose.ui.Modifier) r1, (androidx.compose.animation.EnterTransition) r2, (androidx.compose.animation.ExitTransition) r3, (java.lang.String) r4, (kotlin.jvm.functions.Function3<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) r5, (androidx.compose.runtime.Composer) r6, (int) r7, (int) r8)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0154
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0154:
            r2 = r16
        L_0x0156:
            androidx.compose.runtime.ScopeUpdateScope r13 = r13.endRestartGroup()
            if (r13 != 0) goto L_0x015d
            goto L_0x0179
        L_0x015d:
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$17 r16 = new androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$17
            r0 = r16
            r1 = r17
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r24
            r8 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = r16
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r13.updateScope(r0)
        L_0x0179:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(boolean, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, boolean, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final <T> void AnimatedEnterExitImpl(Transition<T> transition, Function1<? super T, Boolean> function1, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i) {
        int i2;
        Composer composer2;
        Transition<T> transition2 = transition;
        Function1<? super T, Boolean> function12 = function1;
        Modifier modifier2 = modifier;
        Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> function32 = function3;
        int i3 = i;
        Composer startRestartGroup = composer.startRestartGroup(808253933);
        ComposerKt.sourceInformation(startRestartGroup, "C(AnimatedEnterExitImpl)P(4,5,3,1,2)734@39380L85,739@39603L116,743@39761L270,743@39729L302,752@40041L165:AnimatedVisibility.kt#xbi5r1");
        if ((i3 & 14) == 0) {
            i2 = (startRestartGroup.changed((Object) transition2) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i3 & 112) == 0) {
            i2 |= startRestartGroup.changed((Object) function12) ? 32 : 16;
        }
        if ((i3 & 896) == 0) {
            i2 |= startRestartGroup.changed((Object) modifier2) ? 256 : 128;
        }
        EnterTransition enterTransition2 = enterTransition;
        if ((i3 & 7168) == 0) {
            i2 |= startRestartGroup.changed((Object) enterTransition2) ? 2048 : 1024;
        }
        ExitTransition exitTransition2 = exitTransition;
        if ((i3 & 57344) == 0) {
            i2 |= startRestartGroup.changed((Object) exitTransition2) ? 16384 : 8192;
        }
        if ((458752 & i3) == 0) {
            i2 |= startRestartGroup.changed((Object) function32) ? 131072 : 65536;
        }
        int i4 = i2;
        if ((374491 & i4) != 74898 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(808253933, i4, -1, "androidx.compose.animation.AnimatedEnterExitImpl (AnimatedVisibility.kt:726)");
            }
            int i5 = i4 & 14;
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed((Object) transition2);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(function12.invoke(transition.getCurrentState()), (SnapshotMutationPolicy) null, 2, (Object) null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            MutableState mutableState = (MutableState) rememberedValue;
            if (function12.invoke(transition.getTargetState()).booleanValue() || ((Boolean) mutableState.getValue()).booleanValue() || transition.isSeeking()) {
                int i6 = i5 | 48;
                startRestartGroup.startReplaceableGroup(1215497572);
                ComposerKt.sourceInformation(startRestartGroup, "CC(createChildTransition)785@31111L36,786@31171L74,787@31268L39,788@31319L63:Transition.kt#pdpnli");
                int i7 = i6 & 14;
                startRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                boolean changed2 = startRestartGroup.changed((Object) transition2);
                T rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = transition.getCurrentState();
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceableGroup();
                if (transition.isSeeking()) {
                    rememberedValue2 = transition.getCurrentState();
                }
                int i8 = (i6 >> 3) & 112;
                String str = "C(remember)P(1):Composables.kt#9igjgp";
                startRestartGroup.startReplaceableGroup(-1220581778);
                ComposerKt.sourceInformation(startRestartGroup, "C740@39681L28:AnimatedVisibility.kt#xbi5r1");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1220581778, i8, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:739)");
                }
                int i9 = i5 | (i4 & 112) | ((i8 << 6) & 896);
                EnterExitState targetEnterExit = targetEnterExit(transition2, function12, rememberedValue2, startRestartGroup, i9);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                startRestartGroup.endReplaceableGroup();
                T targetState = transition.getTargetState();
                startRestartGroup.startReplaceableGroup(-1220581778);
                ComposerKt.sourceInformation(startRestartGroup, "C740@39681L28:AnimatedVisibility.kt#xbi5r1");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1220581778, i8, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:739)");
                }
                EnterExitState targetEnterExit2 = targetEnterExit(transition2, function12, targetState, startRestartGroup, i9);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                startRestartGroup.endReplaceableGroup();
                String str2 = str;
                Transition<T> createChildTransitionInternal = TransitionKt.createChildTransitionInternal(transition, targetEnterExit, targetEnterExit2, "EnterExitTransition", startRestartGroup, i7 | ((i6 << 6) & 7168));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
                boolean changed3 = startRestartGroup.changed((Object) createChildTransitionInternal) | startRestartGroup.changed((Object) mutableState);
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                    rememberedValue3 = new AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1(createChildTransitionInternal, mutableState, (Continuation<? super AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1>) null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                startRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect((Object) createChildTransitionInternal, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) (Function2) rememberedValue3, startRestartGroup, 64);
                int i10 = i4 >> 3;
                int i11 = (i10 & 57344) | (i10 & 112) | (i10 & 896) | (i10 & 7168);
                startRestartGroup.startReplaceableGroup(-1967270694);
                ComposerKt.sourceInformation(startRestartGroup, "CC(AnimatedEnterExitImpl)P(4,3,1,2)777@40847L64,780@41019L39,781@41089L50,778@40920L229:AnimatedVisibility.kt#xbi5r1");
                if (createChildTransitionInternal.getCurrentState() == EnterExitState.Visible || createChildTransitionInternal.getTargetState() == EnterExitState.Visible) {
                    int i12 = i11 & 14;
                    startRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(startRestartGroup, str2);
                    boolean changed4 = startRestartGroup.changed((Object) createChildTransitionInternal);
                    Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if (changed4 || rememberedValue4 == Composer.Companion.getEmpty()) {
                        rememberedValue4 = new AnimatedVisibilityScopeImpl(createChildTransitionInternal);
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    startRestartGroup.endReplaceableGroup();
                    AnimatedVisibilityScopeImpl animatedVisibilityScopeImpl = (AnimatedVisibilityScopeImpl) rememberedValue4;
                    int i13 = i11 >> 3;
                    composer2 = startRestartGroup;
                    Modifier then = modifier2.then(EnterExitTransitionKt.createModifier(createChildTransitionInternal, enterTransition, exitTransition, "Built-in", startRestartGroup, i12 | 3072 | (i13 & 112) | (i13 & 896)));
                    composer2.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(composer2, "C(remember):Composables.kt#9igjgp");
                    Object rememberedValue5 = composer2.rememberedValue();
                    if (rememberedValue5 == Composer.Companion.getEmpty()) {
                        rememberedValue5 = new AnimatedEnterExitMeasurePolicy(animatedVisibilityScopeImpl);
                        composer2.updateRememberedValue(rememberedValue5);
                    }
                    composer2.endReplaceableGroup();
                    MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue5;
                    composer2.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume = composer2.consume(CompositionLocalsKt.getLocalDensity());
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    Density density = (Density) consume;
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume2 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    LayoutDirection layoutDirection = (LayoutDirection) consume2;
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume3 = composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                    Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(then);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composer2.disableReusing();
                    Composer r11 = Updater.m2444constructorimpl(composer2);
                    Updater.m2451setimpl(r11, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m2451setimpl(r11, density, ComposeUiNode.Companion.getSetDensity());
                    Updater.m2451setimpl(r11, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
                    Updater.m2451setimpl(r11, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
                    composer2.enableReusing();
                    materializerOf.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composer2, -174037743, "C779@40958L9:AnimatedVisibility.kt#xbi5r1");
                    function32.invoke(animatedVisibilityScopeImpl, composer2, Integer.valueOf(((i11 >> 9) & 112) | 8));
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                } else {
                    composer2 = startRestartGroup;
                }
                composer2.endReplaceableGroup();
            } else {
                composer2 = startRestartGroup;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new AnimatedVisibilityKt$AnimatedEnterExitImpl$2(transition, function1, modifier, enterTransition, exitTransition, function3, i));
        }
    }

    private static final void AnimatedEnterExitImpl(Transition<EnterExitState> transition, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i) {
        composer.startReplaceableGroup(-1967270694);
        ComposerKt.sourceInformation(composer, "CC(AnimatedEnterExitImpl)P(4,3,1,2)777@40847L64,780@41019L39,781@41089L50,778@40920L229:AnimatedVisibility.kt#xbi5r1");
        if (transition.getCurrentState() == EnterExitState.Visible || transition.getTargetState() == EnterExitState.Visible) {
            int i2 = i & 14;
            composer.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composer, "C(remember)P(1):Composables.kt#9igjgp");
            boolean changed = composer.changed((Object) transition);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new AnimatedVisibilityScopeImpl(transition);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            AnimatedVisibilityScopeImpl animatedVisibilityScopeImpl = (AnimatedVisibilityScopeImpl) rememberedValue;
            int i3 = i >> 3;
            Modifier then = modifier.then(EnterExitTransitionKt.createModifier(transition, enterTransition, exitTransition, "Built-in", composer, i2 | 3072 | (i3 & 112) | (i3 & 896)));
            composer.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new AnimatedEnterExitMeasurePolicy(animatedVisibilityScopeImpl);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue2;
            composer.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(composer);
            Density density = (Density) consume;
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(composer);
            LayoutDirection layoutDirection = (LayoutDirection) consume2;
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume3 = composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(composer);
            ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(then);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            composer.disableReusing();
            Composer r0 = Updater.m2444constructorimpl(composer);
            Updater.m2451setimpl(r0, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2451setimpl(r0, density, ComposeUiNode.Companion.getSetDensity());
            Updater.m2451setimpl(r0, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2451setimpl(r0, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
            composer.enableReusing();
            materializerOf.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composer, -174037743, "C779@40958L9:AnimatedVisibility.kt#xbi5r1");
            function3.invoke(animatedVisibilityScopeImpl, composer, Integer.valueOf(((i >> 9) & 112) | 8));
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
        }
        composer.endReplaceableGroup();
    }

    private static final <T> EnterExitState targetEnterExit(Transition<T> transition, Function1<? super T, Boolean> function1, T t, Composer composer, int i) {
        EnterExitState enterExitState;
        composer.startReplaceableGroup(361571134);
        ComposerKt.sourceInformation(composer, "C(targetEnterExit)P(1):AnimatedVisibility.kt#xbi5r1");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(361571134, i, -1, "androidx.compose.animation.targetEnterExit (AnimatedVisibility.kt:830)");
        }
        composer.startMovableGroup(-721837504, transition);
        ComposerKt.sourceInformation(composer, "846@43297L34");
        if (!transition.isSeeking()) {
            composer.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            MutableState mutableState = (MutableState) rememberedValue;
            if (function1.invoke(transition.getCurrentState()).booleanValue()) {
                mutableState.setValue(true);
            }
            if (function1.invoke(t).booleanValue()) {
                enterExitState = EnterExitState.Visible;
            } else if (((Boolean) mutableState.getValue()).booleanValue()) {
                enterExitState = EnterExitState.PostExit;
            } else {
                enterExitState = EnterExitState.PreEnter;
            }
        } else if (function1.invoke(t).booleanValue()) {
            enterExitState = EnterExitState.Visible;
        } else if (function1.invoke(transition.getCurrentState()).booleanValue()) {
            enterExitState = EnterExitState.PostExit;
        } else {
            enterExitState = EnterExitState.PreEnter;
        }
        composer.endMovableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return enterExitState;
    }
}
