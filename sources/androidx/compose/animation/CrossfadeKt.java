package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u001aN\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0002\u0010\f\u001aX\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0002\u0010\u000f\u001a\u0001\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00102\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072%\b\u0002\u0010\u0011\u001a\u001f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00140\n2&\u0010\t\u001a\"\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0002\u0010\u0015¨\u0006\u0016"}, d2 = {"Crossfade", "", "T", "targetState", "modifier", "Landroidx/compose/ui/Modifier;", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "content", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "label", "", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/animation/core/Transition;", "contentKey", "Lkotlin/ParameterName;", "name", "", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Crossfade.kt */
public final class CrossfadeKt {
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void Crossfade(T r16, androidx.compose.ui.Modifier r17, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> r18, java.lang.String r19, kotlin.jvm.functions.Function3<? super T, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r20, androidx.compose.runtime.Composer r21, int r22, int r23) {
        /*
            r1 = r16
            r10 = r20
            r11 = r22
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = -310686752(0xffffffffed7b4be0, float:-4.860779E27)
            r2 = r21
            androidx.compose.runtime.Composer r12 = r2.startRestartGroup(r0)
            java.lang.String r2 = "C(Crossfade)P(4,3!1,2)55@2280L36,56@2332L53:Crossfade.kt#xbi5r1"
            androidx.compose.runtime.ComposerKt.sourceInformation(r12, r2)
            r2 = r23 & 1
            r3 = 4
            if (r2 == 0) goto L_0x0022
            r2 = r11 | 6
            goto L_0x0032
        L_0x0022:
            r2 = r11 & 14
            if (r2 != 0) goto L_0x0031
            boolean r2 = r12.changed((java.lang.Object) r1)
            if (r2 == 0) goto L_0x002e
            r2 = r3
            goto L_0x002f
        L_0x002e:
            r2 = 2
        L_0x002f:
            r2 = r2 | r11
            goto L_0x0032
        L_0x0031:
            r2 = r11
        L_0x0032:
            r4 = r23 & 2
            if (r4 == 0) goto L_0x0039
            r2 = r2 | 48
            goto L_0x004c
        L_0x0039:
            r5 = r11 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x004c
            r5 = r17
            boolean r6 = r12.changed((java.lang.Object) r5)
            if (r6 == 0) goto L_0x0048
            r6 = 32
            goto L_0x004a
        L_0x0048:
            r6 = 16
        L_0x004a:
            r2 = r2 | r6
            goto L_0x004e
        L_0x004c:
            r5 = r17
        L_0x004e:
            r6 = r23 & 4
            if (r6 == 0) goto L_0x0054
            r2 = r2 | 128(0x80, float:1.794E-43)
        L_0x0054:
            r7 = r23 & 8
            if (r7 == 0) goto L_0x005b
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x006e
        L_0x005b:
            r8 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x006e
            r8 = r19
            boolean r9 = r12.changed((java.lang.Object) r8)
            if (r9 == 0) goto L_0x006a
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x006c
        L_0x006a:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x006c:
            r2 = r2 | r9
            goto L_0x0070
        L_0x006e:
            r8 = r19
        L_0x0070:
            r9 = r23 & 16
            r13 = 57344(0xe000, float:8.0356E-41)
            if (r9 == 0) goto L_0x007a
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            goto L_0x008a
        L_0x007a:
            r9 = r11 & r13
            if (r9 != 0) goto L_0x008a
            boolean r9 = r12.changed((java.lang.Object) r10)
            if (r9 == 0) goto L_0x0087
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0089
        L_0x0087:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x0089:
            r2 = r2 | r9
        L_0x008a:
            if (r6 != r3) goto L_0x00a4
            r3 = 46811(0xb6db, float:6.5596E-41)
            r3 = r3 & r2
            r9 = 9362(0x2492, float:1.3119E-41)
            if (r3 != r9) goto L_0x00a4
            boolean r3 = r12.getSkipping()
            if (r3 != 0) goto L_0x009b
            goto L_0x00a4
        L_0x009b:
            r12.skipToGroupEnd()
            r3 = r18
            r2 = r5
            r4 = r8
            goto L_0x00fe
        L_0x00a4:
            if (r4 == 0) goto L_0x00ac
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r3 = (androidx.compose.ui.Modifier) r3
            r14 = r3
            goto L_0x00ad
        L_0x00ac:
            r14 = r5
        L_0x00ad:
            r3 = 0
            if (r6 == 0) goto L_0x00ba
            r4 = 7
            r5 = 0
            androidx.compose.animation.core.TweenSpec r4 = androidx.compose.animation.core.AnimationSpecKt.tween$default(r3, r3, r5, r4, r5)
            androidx.compose.animation.core.FiniteAnimationSpec r4 = (androidx.compose.animation.core.FiniteAnimationSpec) r4
            r15 = r4
            goto L_0x00bc
        L_0x00ba:
            r15 = r18
        L_0x00bc:
            if (r7 == 0) goto L_0x00c2
            java.lang.String r4 = "Crossfade"
            r9 = r4
            goto L_0x00c3
        L_0x00c2:
            r9 = r8
        L_0x00c3:
            boolean r4 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r4 == 0) goto L_0x00d0
            r4 = -1
            java.lang.String r5 = "androidx.compose.animation.Crossfade (Crossfade.kt:48)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r2, r4, r5)
        L_0x00d0:
            r0 = r2 & 8
            r4 = r2 & 14
            r0 = r0 | r4
            int r4 = r2 >> 6
            r4 = r4 & 112(0x70, float:1.57E-43)
            r0 = r0 | r4
            androidx.compose.animation.core.Transition r0 = androidx.compose.animation.core.TransitionKt.updateTransition(r1, (java.lang.String) r9, (androidx.compose.runtime.Composer) r12, (int) r0, (int) r3)
            r5 = 0
            r3 = r2 & 112(0x70, float:1.57E-43)
            r3 = r3 | 512(0x200, float:7.175E-43)
            r2 = r2 & r13
            r8 = r3 | r2
            r13 = 4
            r2 = r0
            r3 = r14
            r4 = r15
            r6 = r20
            r7 = r12
            r0 = r9
            r9 = r13
            Crossfade(r2, (androidx.compose.ui.Modifier) r3, (androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float>) r4, r5, r6, (androidx.compose.runtime.Composer) r7, (int) r8, (int) r9)
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x00fb
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x00fb:
            r4 = r0
            r2 = r14
            r3 = r15
        L_0x00fe:
            androidx.compose.runtime.ScopeUpdateScope r8 = r12.endRestartGroup()
            if (r8 != 0) goto L_0x0105
            goto L_0x0118
        L_0x0105:
            androidx.compose.animation.CrossfadeKt$Crossfade$1 r9 = new androidx.compose.animation.CrossfadeKt$Crossfade$1
            r0 = r9
            r1 = r16
            r5 = r20
            r6 = r22
            r7 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
            r8.updateScope(r9)
        L_0x0118:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.CrossfadeKt.Crossfade(java.lang.Object, androidx.compose.ui.Modifier, androidx.compose.animation.core.FiniteAnimationSpec, java.lang.String, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Crossfade API now has a new label parameter added.")
    public static final /* synthetic */ void Crossfade(Object obj, Modifier modifier, FiniteAnimationSpec finiteAnimationSpec, Function3 function3, Composer composer, int i, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(function3, "content");
        Composer startRestartGroup = composer.startRestartGroup(523603005);
        ComposerKt.sourceInformation(startRestartGroup, "C(Crossfade)P(3,2)71@2743L29,72@2788L53:Crossfade.kt#xbi5r1");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(obj) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed((Object) modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changed((Object) function3) ? 2048 : 1024;
        }
        if (i5 == 4 && (i3 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            if (i5 != 0) {
                finiteAnimationSpec = AnimationSpecKt.tween$default(0, 0, (Easing) null, 7, (Object) null);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(523603005, i3, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:65)");
            }
            Crossfade(TransitionKt.updateTransition(obj, (String) null, startRestartGroup, (i3 & 8) | (i3 & 14), 2), modifier, (FiniteAnimationSpec<Float>) finiteAnimationSpec, (Function1) null, function3, startRestartGroup, (i3 & 112) | 512 | ((i3 << 3) & 57344), 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        Modifier modifier2 = modifier;
        FiniteAnimationSpec finiteAnimationSpec2 = finiteAnimationSpec;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new CrossfadeKt$Crossfade$2(obj, modifier2, finiteAnimationSpec2, function3, i, i2));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:123:0x0382  */
    /* JADX WARNING: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void Crossfade(androidx.compose.animation.core.Transition<T> r20, androidx.compose.ui.Modifier r21, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> r22, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Object> r23, kotlin.jvm.functions.Function3<? super T, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r24, androidx.compose.runtime.Composer r25, int r26, int r27) {
        /*
            r6 = r20
            r7 = r24
            r8 = r26
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 679005231(0x2878cc2f, float:1.3811041E-14)
            r1 = r25
            androidx.compose.runtime.Composer r9 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(Crossfade)P(3!1,2)103@4375L64,104@4461L66,138@5750L159:Crossfade.kt#xbi5r1"
            androidx.compose.runtime.ComposerKt.sourceInformation(r9, r1)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r27 & r1
            r10 = 2
            if (r1 == 0) goto L_0x0029
            r1 = r8 | 6
            goto L_0x0039
        L_0x0029:
            r1 = r8 & 14
            if (r1 != 0) goto L_0x0038
            boolean r1 = r9.changed((java.lang.Object) r6)
            if (r1 == 0) goto L_0x0035
            r1 = 4
            goto L_0x0036
        L_0x0035:
            r1 = r10
        L_0x0036:
            r1 = r1 | r8
            goto L_0x0039
        L_0x0038:
            r1 = r8
        L_0x0039:
            r2 = r27 & 1
            if (r2 == 0) goto L_0x0040
            r1 = r1 | 48
            goto L_0x0053
        L_0x0040:
            r3 = r8 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0053
            r3 = r21
            boolean r4 = r9.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x004f
            r4 = 32
            goto L_0x0051
        L_0x004f:
            r4 = 16
        L_0x0051:
            r1 = r1 | r4
            goto L_0x0055
        L_0x0053:
            r3 = r21
        L_0x0055:
            r4 = r27 & 2
            if (r4 == 0) goto L_0x005b
            r1 = r1 | 128(0x80, float:1.794E-43)
        L_0x005b:
            r5 = r27 & 4
            if (r5 == 0) goto L_0x0062
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0075
        L_0x0062:
            r11 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r11 != 0) goto L_0x0075
            r11 = r23
            boolean r12 = r9.changed((java.lang.Object) r11)
            if (r12 == 0) goto L_0x0071
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0073
        L_0x0071:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0073:
            r1 = r1 | r12
            goto L_0x0077
        L_0x0075:
            r11 = r23
        L_0x0077:
            r12 = r27 & 8
            if (r12 == 0) goto L_0x007e
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0090
        L_0x007e:
            r12 = 57344(0xe000, float:8.0356E-41)
            r12 = r12 & r8
            if (r12 != 0) goto L_0x0090
            boolean r12 = r9.changed((java.lang.Object) r7)
            if (r12 == 0) goto L_0x008d
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008f
        L_0x008d:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x008f:
            r1 = r1 | r12
        L_0x0090:
            r12 = r1
            if (r4 != r10) goto L_0x00ab
            r1 = 46811(0xb6db, float:6.5596E-41)
            r1 = r1 & r12
            r13 = 9362(0x2492, float:1.3119E-41)
            if (r1 != r13) goto L_0x00ab
            boolean r1 = r9.getSkipping()
            if (r1 != 0) goto L_0x00a2
            goto L_0x00ab
        L_0x00a2:
            r9.skipToGroupEnd()
            r2 = r3
            r4 = r11
            r3 = r22
            goto L_0x037b
        L_0x00ab:
            if (r2 == 0) goto L_0x00b3
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
            r13 = r1
            goto L_0x00b4
        L_0x00b3:
            r13 = r3
        L_0x00b4:
            r14 = 0
            if (r4 == 0) goto L_0x00c1
            r1 = 7
            r2 = 0
            androidx.compose.animation.core.TweenSpec r1 = androidx.compose.animation.core.AnimationSpecKt.tween$default(r14, r14, r2, r1, r2)
            androidx.compose.animation.core.FiniteAnimationSpec r1 = (androidx.compose.animation.core.FiniteAnimationSpec) r1
            r15 = r1
            goto L_0x00c3
        L_0x00c1:
            r15 = r22
        L_0x00c3:
            if (r5 == 0) goto L_0x00ca
            androidx.compose.animation.CrossfadeKt$Crossfade$3 r1 = androidx.compose.animation.CrossfadeKt$Crossfade$3.INSTANCE
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            r11 = r1
        L_0x00ca:
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            r2 = -1
            if (r1 == 0) goto L_0x00d7
            java.lang.String r1 = "androidx.compose.animation.Crossfade (Crossfade.kt:97)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r12, r2, r1)
        L_0x00d7:
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r9.startReplaceableGroup(r0)
            java.lang.String r1 = "C(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r9, r1)
            java.lang.Object r3 = r9.rememberedValue()
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r4 = r4.getEmpty()
            if (r3 != r4) goto L_0x00fc
            androidx.compose.runtime.snapshots.SnapshotStateList r3 = androidx.compose.runtime.SnapshotStateKt.mutableStateListOf()
            java.lang.Object r4 = r20.getCurrentState()
            r3.add(r4)
            r9.updateRememberedValue(r3)
        L_0x00fc:
            r9.endReplaceableGroup()
            r5 = r3
            androidx.compose.runtime.snapshots.SnapshotStateList r5 = (androidx.compose.runtime.snapshots.SnapshotStateList) r5
            r9.startReplaceableGroup(r0)
            androidx.compose.runtime.ComposerKt.sourceInformation(r9, r1)
            java.lang.Object r0 = r9.rememberedValue()
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r0 != r1) goto L_0x011e
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Map r0 = (java.util.Map) r0
            r9.updateRememberedValue(r0)
        L_0x011e:
            r9.endReplaceableGroup()
            r4 = r0
            java.util.Map r4 = (java.util.Map) r4
            r0 = -1621449213(0xffffffff9f5aa603, float:-4.6300617E-20)
            r9.startReplaceableGroup(r0)
            java.lang.String r0 = "111@4841L21"
            androidx.compose.runtime.ComposerKt.sourceInformation(r9, r0)
            java.lang.Object r0 = r20.getCurrentState()
            java.lang.Object r1 = r20.getTargetState()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            r3 = 1
            if (r0 == 0) goto L_0x0188
            int r0 = r5.size()
            if (r0 != r3) goto L_0x0152
            java.lang.Object r0 = r5.get(r14)
            java.lang.Object r1 = r20.getTargetState()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            if (r0 != 0) goto L_0x0188
        L_0x0152:
            r0 = r5
            java.util.List r0 = (java.util.List) r0
            r1 = 1157296644(0x44faf204, float:2007.563)
            r9.startReplaceableGroup(r1)
            java.lang.String r1 = "C(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r9, r1)
            boolean r1 = r9.changed((java.lang.Object) r6)
            java.lang.Object r3 = r9.rememberedValue()
            if (r1 != 0) goto L_0x0172
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r3 != r1) goto L_0x017d
        L_0x0172:
            androidx.compose.animation.CrossfadeKt$Crossfade$4$1 r1 = new androidx.compose.animation.CrossfadeKt$Crossfade$4$1
            r1.<init>(r6)
            r3 = r1
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            r9.updateRememberedValue(r3)
        L_0x017d:
            r9.endReplaceableGroup()
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            kotlin.collections.CollectionsKt.removeAll(r0, r3)
            r4.clear()
        L_0x0188:
            r9.endReplaceableGroup()
            java.lang.Object r0 = r20.getTargetState()
            boolean r0 = r4.containsKey(r0)
            if (r0 != 0) goto L_0x0211
            r3 = r5
            java.util.List r3 = (java.util.List) r3
            java.util.Iterator r0 = r3.iterator()
            r1 = r14
        L_0x019d:
            boolean r16 = r0.hasNext()
            if (r16 == 0) goto L_0x01bf
            java.lang.Object r10 = r0.next()
            java.lang.Object r10 = r11.invoke(r10)
            java.lang.Object r14 = r20.getTargetState()
            java.lang.Object r14 = r11.invoke(r14)
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r10, (java.lang.Object) r14)
            if (r10 == 0) goto L_0x01ba
            goto L_0x01c0
        L_0x01ba:
            int r1 = r1 + 1
            r10 = 2
            r14 = 0
            goto L_0x019d
        L_0x01bf:
            r1 = r2
        L_0x01c0:
            if (r1 != r2) goto L_0x01ca
            java.lang.Object r0 = r20.getTargetState()
            r5.add(r0)
            goto L_0x01d1
        L_0x01ca:
            java.lang.Object r0 = r20.getTargetState()
            r5.set(r1, r0)
        L_0x01d1:
            r4.clear()
            int r10 = r3.size()
            r14 = 0
        L_0x01d9:
            if (r14 >= r10) goto L_0x0211
            java.lang.Object r2 = r3.get(r14)
            androidx.compose.animation.CrossfadeKt$Crossfade$5$1 r1 = new androidx.compose.animation.CrossfadeKt$Crossfade$5$1
            r0 = r1
            r6 = r1
            r1 = r20
            r22 = r2
            r2 = r12
            r17 = r3
            r7 = 1
            r3 = r15
            r18 = r4
            r4 = r22
            r19 = r5
            r5 = r24
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = -1426421288(0xffffffffaafa89d8, float:-4.450457E-13)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r9, r0, r7, r6)
            r2 = r22
            r1 = r18
            r1.put(r2, r0)
            int r14 = r14 + 1
            r6 = r20
            r7 = r24
            r4 = r1
            r3 = r17
            r5 = r19
            goto L_0x01d9
        L_0x0211:
            r1 = r4
            r19 = r5
            int r0 = r12 >> 3
            r0 = r0 & 14
            r2 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r9.startReplaceableGroup(r2)
            java.lang.String r2 = "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformation(r9, r2)
            androidx.compose.ui.Alignment$Companion r2 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment r2 = r2.getTopStart()
            int r3 = r0 >> 3
            r4 = r3 & 14
            r3 = r3 & 112(0x70, float:1.57E-43)
            r3 = r3 | r4
            r4 = 0
            androidx.compose.ui.layout.MeasurePolicy r2 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(r2, r4, r9, r3)
            int r0 = r0 << 3
            r0 = r0 & 112(0x70, float:1.57E-43)
            r3 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r9.startReplaceableGroup(r3)
            java.lang.String r3 = "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh"
            androidx.compose.runtime.ComposerKt.sourceInformation(r9, r3)
            androidx.compose.runtime.ProvidableCompositionLocal r3 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r3 = (androidx.compose.runtime.CompositionLocal) r3
            r4 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r5 = "C:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r9, r4, r5)
            java.lang.Object r3 = r9.consume(r3)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r9)
            androidx.compose.ui.unit.Density r3 = (androidx.compose.ui.unit.Density) r3
            androidx.compose.runtime.ProvidableCompositionLocal r6 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            androidx.compose.runtime.CompositionLocal r6 = (androidx.compose.runtime.CompositionLocal) r6
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r9, r4, r5)
            java.lang.Object r6 = r9.consume(r6)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r9)
            androidx.compose.ui.unit.LayoutDirection r6 = (androidx.compose.ui.unit.LayoutDirection) r6
            androidx.compose.runtime.ProvidableCompositionLocal r7 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            androidx.compose.runtime.CompositionLocal r7 = (androidx.compose.runtime.CompositionLocal) r7
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r9, r4, r5)
            java.lang.Object r4 = r9.consume(r7)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r9)
            androidx.compose.ui.platform.ViewConfiguration r4 = (androidx.compose.ui.platform.ViewConfiguration) r4
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function0 r5 = r5.getConstructor()
            kotlin.jvm.functions.Function3 r7 = androidx.compose.ui.layout.LayoutKt.materializerOf(r13)
            int r0 = r0 << 9
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | 6
            androidx.compose.runtime.Applier r10 = r9.getApplier()
            boolean r10 = r10 instanceof androidx.compose.runtime.Applier
            if (r10 != 0) goto L_0x029a
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x029a:
            r9.startReusableNode()
            boolean r10 = r9.getInserting()
            if (r10 == 0) goto L_0x02a7
            r9.createNode(r5)
            goto L_0x02aa
        L_0x02a7:
            r9.useNode()
        L_0x02aa:
            r9.disableReusing()
            androidx.compose.runtime.Composer r5 = androidx.compose.runtime.Updater.m2444constructorimpl(r9)
            androidx.compose.ui.node.ComposeUiNode$Companion r10 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r10 = r10.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r5, r2, r10)
            androidx.compose.ui.node.ComposeUiNode$Companion r2 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r2 = r2.getSetDensity()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r5, r3, r2)
            androidx.compose.ui.node.ComposeUiNode$Companion r2 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r2 = r2.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r5, r6, r2)
            androidx.compose.ui.node.ComposeUiNode$Companion r2 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r2 = r2.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r5, r4, r2)
            r9.enableReusing()
            androidx.compose.runtime.Composer r2 = androidx.compose.runtime.SkippableUpdater.m2436constructorimpl(r9)
            androidx.compose.runtime.SkippableUpdater r2 = androidx.compose.runtime.SkippableUpdater.m2435boximpl(r2)
            int r3 = r0 >> 3
            r3 = r3 & 112(0x70, float:1.57E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r7.invoke(r2, r9, r3)
            r2 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r9.startReplaceableGroup(r2)
            int r0 = r0 >> 9
            r2 = -2137368960(0xffffffff809a5680, float:-1.4173697E-38)
            r9.startReplaceableGroup(r2)
            java.lang.String r2 = "C72@3384L9:Box.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformation(r9, r2)
            r0 = r0 & 10
            r2 = 2
            if (r0 != r2) goto L_0x030e
            boolean r0 = r9.getSkipping()
            if (r0 != 0) goto L_0x030a
            goto L_0x030e
        L_0x030a:
            r9.skipToGroupEnd()
            goto L_0x0360
        L_0x030e:
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE
            androidx.compose.foundation.layout.BoxScope r0 = (androidx.compose.foundation.layout.BoxScope) r0
            r0 = 2072161918(0x7b82ae7e, float:1.3570754E36)
            java.lang.String r2 = "C:Crossfade.kt#xbi5r1"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r9, r0, r2)
            r0 = -1621447954(0xffffffff9f5aaaee, float:-4.6304685E-20)
            r9.startReplaceableGroup(r0)
            java.lang.String r0 = ""
            androidx.compose.runtime.ComposerKt.sourceInformation(r9, r0)
            r5 = r19
            java.util.List r5 = (java.util.List) r5
            int r0 = r5.size()
            r4 = 0
        L_0x032e:
            if (r4 >= r0) goto L_0x035a
            java.lang.Object r2 = r5.get(r4)
            r3 = -450541366(0xffffffffe52548ca, float:-4.8783324E22)
            java.lang.Object r6 = r11.invoke(r2)
            r9.startMovableGroup(r3, r6)
            java.lang.String r3 = "141@5871L8"
            androidx.compose.runtime.ComposerKt.sourceInformation(r9, r3)
            java.lang.Object r2 = r1.get(r2)
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            r3 = 0
            if (r2 != 0) goto L_0x034d
            goto L_0x0354
        L_0x034d:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            r2.invoke(r9, r6)
        L_0x0354:
            r9.endMovableGroup()
            int r4 = r4 + 1
            goto L_0x032e
        L_0x035a:
            r9.endReplaceableGroup()
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r9)
        L_0x0360:
            r9.endReplaceableGroup()
            r9.endReplaceableGroup()
            r9.endNode()
            r9.endReplaceableGroup()
            r9.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0378
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0378:
            r4 = r11
            r2 = r13
            r3 = r15
        L_0x037b:
            androidx.compose.runtime.ScopeUpdateScope r9 = r9.endRestartGroup()
            if (r9 != 0) goto L_0x0382
            goto L_0x0395
        L_0x0382:
            androidx.compose.animation.CrossfadeKt$Crossfade$7 r10 = new androidx.compose.animation.CrossfadeKt$Crossfade$7
            r0 = r10
            r1 = r20
            r5 = r24
            r6 = r26
            r7 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            r9.updateScope(r10)
        L_0x0395:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.CrossfadeKt.Crossfade(androidx.compose.animation.core.Transition, androidx.compose.ui.Modifier, androidx.compose.animation.core.FiniteAnimationSpec, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }
}
