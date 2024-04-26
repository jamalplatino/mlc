package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000x\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0001\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001f\b\u0002\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n2\b\b\u0002\u0010\u000b\u001a\u00020\f21\u0010\r\u001a-\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0002\b\u0012¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u0013\u001a\u0001\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001f\b\u0002\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\u001521\u0010\r\u001a-\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0002\b\u0012¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u0016\u001aU\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2>\b\u0002\u0010\u001b\u001a8\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001f0\u000eH\u0007ø\u0001\u0000\u001a¬\u0001\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020 2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001f\b\u0002\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2%\b\u0002\u0010!\u001a\u001f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0003\u0012\u0006\u0012\u0004\u0018\u00010\"0\u000721\u0010\r\u001a-\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0002\b\u0012¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010#\u001a\u0015\u0010$\u001a\u00020\t*\u00020%2\u0006\u0010&\u001a\u00020'H\u0004\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"AnimatedContent", "", "S", "targetState", "modifier", "Landroidx/compose/ui/Modifier;", "transitionSpec", "Lkotlin/Function1;", "Landroidx/compose/animation/AnimatedContentScope;", "Landroidx/compose/animation/ContentTransform;", "Lkotlin/ExtensionFunctionType;", "contentAlignment", "Landroidx/compose/ui/Alignment;", "content", "Lkotlin/Function2;", "Landroidx/compose/animation/AnimatedVisibilityScope;", "Lkotlin/ParameterName;", "name", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "label", "", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Ljava/lang/String;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "SizeTransform", "Landroidx/compose/animation/SizeTransform;", "clip", "", "sizeAnimationSpec", "Landroidx/compose/ui/unit/IntSize;", "initialSize", "targetSize", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/animation/core/Transition;", "contentKey", "", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "with", "Landroidx/compose/animation/EnterTransition;", "exit", "Landroidx/compose/animation/ExitTransition;", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: AnimatedContent.kt */
public final class AnimatedContentKt {
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S> void AnimatedContent(S r18, androidx.compose.ui.Modifier r19, kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentScope<S>, androidx.compose.animation.ContentTransform> r20, androidx.compose.ui.Alignment r21, java.lang.String r22, kotlin.jvm.functions.Function4<? super androidx.compose.animation.AnimatedVisibilityScope, ? super S, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r23, androidx.compose.runtime.Composer r24, int r25, int r26) {
        /*
            r1 = r18
            r11 = r23
            r12 = r25
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = -802295584(0xffffffffd02df0e0, float:-1.16729774E10)
            r2 = r24
            androidx.compose.runtime.Composer r13 = r2.startRestartGroup(r0)
            java.lang.String r2 = "C(AnimatedContent)P(4,3,5,1,2)132@6756L58,133@6830L116:AnimatedContent.kt#xbi5r1"
            androidx.compose.runtime.ComposerKt.sourceInformation(r13, r2)
            r2 = r26 & 1
            if (r2 == 0) goto L_0x0021
            r2 = r12 | 6
            goto L_0x0031
        L_0x0021:
            r2 = r12 & 14
            if (r2 != 0) goto L_0x0030
            boolean r2 = r13.changed((java.lang.Object) r1)
            if (r2 == 0) goto L_0x002d
            r2 = 4
            goto L_0x002e
        L_0x002d:
            r2 = 2
        L_0x002e:
            r2 = r2 | r12
            goto L_0x0031
        L_0x0030:
            r2 = r12
        L_0x0031:
            r3 = r26 & 2
            if (r3 == 0) goto L_0x0038
            r2 = r2 | 48
            goto L_0x004b
        L_0x0038:
            r4 = r12 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x004b
            r4 = r19
            boolean r5 = r13.changed((java.lang.Object) r4)
            if (r5 == 0) goto L_0x0047
            r5 = 32
            goto L_0x0049
        L_0x0047:
            r5 = 16
        L_0x0049:
            r2 = r2 | r5
            goto L_0x004d
        L_0x004b:
            r4 = r19
        L_0x004d:
            r5 = r26 & 4
            if (r5 == 0) goto L_0x0054
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0067
        L_0x0054:
            r6 = r12 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0067
            r6 = r20
            boolean r7 = r13.changed((java.lang.Object) r6)
            if (r7 == 0) goto L_0x0063
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r2 = r2 | r7
            goto L_0x0069
        L_0x0067:
            r6 = r20
        L_0x0069:
            r7 = r26 & 8
            if (r7 == 0) goto L_0x0070
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x0083
        L_0x0070:
            r8 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0083
            r8 = r21
            boolean r9 = r13.changed((java.lang.Object) r8)
            if (r9 == 0) goto L_0x007f
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007f:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r2 = r2 | r9
            goto L_0x0085
        L_0x0083:
            r8 = r21
        L_0x0085:
            r9 = r26 & 16
            if (r9 == 0) goto L_0x008c
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a1
        L_0x008c:
            r10 = 57344(0xe000, float:8.0356E-41)
            r10 = r10 & r12
            if (r10 != 0) goto L_0x00a1
            r10 = r22
            boolean r14 = r13.changed((java.lang.Object) r10)
            if (r14 == 0) goto L_0x009d
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009f
        L_0x009d:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x009f:
            r2 = r2 | r14
            goto L_0x00a3
        L_0x00a1:
            r10 = r22
        L_0x00a3:
            r14 = r26 & 32
            r15 = 458752(0x70000, float:6.42848E-40)
            if (r14 == 0) goto L_0x00ad
            r14 = 196608(0x30000, float:2.75506E-40)
        L_0x00ab:
            r2 = r2 | r14
            goto L_0x00bd
        L_0x00ad:
            r14 = r12 & r15
            if (r14 != 0) goto L_0x00bd
            boolean r14 = r13.changed((java.lang.Object) r11)
            if (r14 == 0) goto L_0x00ba
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ab
        L_0x00ba:
            r14 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00ab
        L_0x00bd:
            r14 = 374491(0x5b6db, float:5.24774E-40)
            r14 = r14 & r2
            r15 = 74898(0x12492, float:1.04954E-40)
            if (r14 != r15) goto L_0x00d6
            boolean r14 = r13.getSkipping()
            if (r14 != 0) goto L_0x00cd
            goto L_0x00d6
        L_0x00cd:
            r13.skipToGroupEnd()
            r2 = r4
            r3 = r6
            r4 = r8
            r5 = r10
            goto L_0x0142
        L_0x00d6:
            if (r3 == 0) goto L_0x00de
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r3 = (androidx.compose.ui.Modifier) r3
            r14 = r3
            goto L_0x00df
        L_0x00de:
            r14 = r4
        L_0x00df:
            if (r5 == 0) goto L_0x00e7
            androidx.compose.animation.AnimatedContentKt$AnimatedContent$1 r3 = androidx.compose.animation.AnimatedContentKt$AnimatedContent$1.INSTANCE
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            r15 = r3
            goto L_0x00e8
        L_0x00e7:
            r15 = r6
        L_0x00e8:
            if (r7 == 0) goto L_0x00f3
            androidx.compose.ui.Alignment$Companion r3 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment r3 = r3.getTopStart()
            r16 = r3
            goto L_0x00f5
        L_0x00f3:
            r16 = r8
        L_0x00f5:
            if (r9 == 0) goto L_0x00fa
            java.lang.String r3 = "AnimatedContent"
            r10 = r3
        L_0x00fa:
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L_0x0107
            r3 = -1
            java.lang.String r4 = "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:120)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r2, r3, r4)
        L_0x0107:
            r0 = r2 & 8
            r3 = r2 & 14
            r0 = r0 | r3
            int r3 = r2 >> 9
            r3 = r3 & 112(0x70, float:1.57E-43)
            r0 = r0 | r3
            r3 = 0
            androidx.compose.animation.core.Transition r0 = androidx.compose.animation.core.TransitionKt.updateTransition(r1, (java.lang.String) r10, (androidx.compose.runtime.Composer) r13, (int) r0, (int) r3)
            r6 = 0
            r3 = r2 & 112(0x70, float:1.57E-43)
            r4 = r2 & 896(0x380, float:1.256E-42)
            r3 = r3 | r4
            r4 = r2 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | r4
            r4 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r4
            r9 = r3 | r2
            r17 = 8
            r2 = r0
            r3 = r14
            r4 = r15
            r5 = r16
            r7 = r23
            r8 = r13
            r0 = r10
            r10 = r17
            AnimatedContent(r2, (androidx.compose.ui.Modifier) r3, r4, (androidx.compose.ui.Alignment) r5, r6, r7, (androidx.compose.runtime.Composer) r8, (int) r9, (int) r10)
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x013d
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x013d:
            r5 = r0
            r2 = r14
            r3 = r15
            r4 = r16
        L_0x0142:
            androidx.compose.runtime.ScopeUpdateScope r9 = r13.endRestartGroup()
            if (r9 != 0) goto L_0x0149
            goto L_0x015c
        L_0x0149:
            androidx.compose.animation.AnimatedContentKt$AnimatedContent$2 r10 = new androidx.compose.animation.AnimatedContentKt$AnimatedContent$2
            r0 = r10
            r1 = r18
            r6 = r23
            r7 = r25
            r8 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            r9.updateScope(r10)
        L_0x015c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedContentKt.AnimatedContent(java.lang.Object, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.ui.Alignment, java.lang.String, kotlin.jvm.functions.Function4, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "AnimatedContent API now has a new label parameter added.")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void AnimatedContent(java.lang.Object r16, androidx.compose.ui.Modifier r17, kotlin.jvm.functions.Function1 r18, androidx.compose.ui.Alignment r19, kotlin.jvm.functions.Function4 r20, androidx.compose.runtime.Composer r21, int r22, int r23) {
        /*
            r9 = r20
            r10 = r22
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 2124549995(0x7ea20f6b, float:1.077075E38)
            r1 = r21
            androidx.compose.runtime.Composer r11 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(AnimatedContent)P(3,2,4,1)159@7603L154:AnimatedContent.kt#xbi5r1"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r1)
            r1 = r23 & 1
            if (r1 == 0) goto L_0x0021
            r1 = r10 | 6
            r12 = r16
            goto L_0x0033
        L_0x0021:
            r1 = r10 & 14
            r12 = r16
            if (r1 != 0) goto L_0x0032
            boolean r1 = r11.changed((java.lang.Object) r12)
            if (r1 == 0) goto L_0x002f
            r1 = 4
            goto L_0x0030
        L_0x002f:
            r1 = 2
        L_0x0030:
            r1 = r1 | r10
            goto L_0x0033
        L_0x0032:
            r1 = r10
        L_0x0033:
            r2 = r23 & 2
            if (r2 == 0) goto L_0x003a
            r1 = r1 | 48
            goto L_0x004d
        L_0x003a:
            r3 = r10 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x004d
            r3 = r17
            boolean r4 = r11.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x0049
            r4 = 32
            goto L_0x004b
        L_0x0049:
            r4 = 16
        L_0x004b:
            r1 = r1 | r4
            goto L_0x004f
        L_0x004d:
            r3 = r17
        L_0x004f:
            r4 = r23 & 4
            if (r4 == 0) goto L_0x0056
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0069
        L_0x0056:
            r5 = r10 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0069
            r5 = r18
            boolean r6 = r11.changed((java.lang.Object) r5)
            if (r6 == 0) goto L_0x0065
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0067
        L_0x0065:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0067:
            r1 = r1 | r6
            goto L_0x006b
        L_0x0069:
            r5 = r18
        L_0x006b:
            r6 = r23 & 8
            if (r6 == 0) goto L_0x0072
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0085
        L_0x0072:
            r7 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0085
            r7 = r19
            boolean r8 = r11.changed((java.lang.Object) r7)
            if (r8 == 0) goto L_0x0081
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0083
        L_0x0081:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0083:
            r1 = r1 | r8
            goto L_0x0087
        L_0x0085:
            r7 = r19
        L_0x0087:
            r8 = r23 & 16
            if (r8 == 0) goto L_0x008e
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a0
        L_0x008e:
            r8 = 57344(0xe000, float:8.0356E-41)
            r8 = r8 & r10
            if (r8 != 0) goto L_0x00a0
            boolean r8 = r11.changed((java.lang.Object) r9)
            if (r8 == 0) goto L_0x009d
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009f
        L_0x009d:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x009f:
            r1 = r1 | r8
        L_0x00a0:
            r8 = 46811(0xb6db, float:6.5596E-41)
            r8 = r8 & r1
            r13 = 9362(0x2492, float:1.3119E-41)
            if (r8 != r13) goto L_0x00b7
            boolean r8 = r11.getSkipping()
            if (r8 != 0) goto L_0x00af
            goto L_0x00b7
        L_0x00af:
            r11.skipToGroupEnd()
            r2 = r3
            r3 = r5
            r4 = r7
            goto L_0x0112
        L_0x00b7:
            if (r2 == 0) goto L_0x00bf
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r2 = (androidx.compose.ui.Modifier) r2
            r13 = r2
            goto L_0x00c0
        L_0x00bf:
            r13 = r3
        L_0x00c0:
            if (r4 == 0) goto L_0x00c8
            androidx.compose.animation.AnimatedContentKt$AnimatedContent$3 r2 = androidx.compose.animation.AnimatedContentKt$AnimatedContent$3.INSTANCE
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r14 = r2
            goto L_0x00c9
        L_0x00c8:
            r14 = r5
        L_0x00c9:
            if (r6 == 0) goto L_0x00d3
            androidx.compose.ui.Alignment$Companion r2 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment r2 = r2.getTopStart()
            r15 = r2
            goto L_0x00d4
        L_0x00d3:
            r15 = r7
        L_0x00d4:
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x00e1
            r2 = -1
            java.lang.String r3 = "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:148)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r1, r2, r3)
        L_0x00e1:
            java.lang.String r4 = "AnimatedContent"
            r0 = r1 & 8
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            r2 = r1 & 14
            r0 = r0 | r2
            r2 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            int r1 = r1 << 3
            r2 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r2
            r7 = r0 | r1
            r8 = 0
            r0 = r16
            r1 = r13
            r2 = r14
            r3 = r15
            r5 = r20
            r6 = r11
            AnimatedContent(r0, (androidx.compose.ui.Modifier) r1, r2, (androidx.compose.ui.Alignment) r3, (java.lang.String) r4, r5, (androidx.compose.runtime.Composer) r6, (int) r7, (int) r8)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x010f
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x010f:
            r2 = r13
            r3 = r14
            r4 = r15
        L_0x0112:
            androidx.compose.runtime.ScopeUpdateScope r8 = r11.endRestartGroup()
            if (r8 != 0) goto L_0x0119
            goto L_0x012c
        L_0x0119:
            androidx.compose.animation.AnimatedContentKt$AnimatedContent$4 r11 = new androidx.compose.animation.AnimatedContentKt$AnimatedContent$4
            r0 = r11
            r1 = r16
            r5 = r20
            r6 = r22
            r7 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            kotlin.jvm.functions.Function2 r11 = (kotlin.jvm.functions.Function2) r11
            r8.updateScope(r11)
        L_0x012c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedContentKt.AnimatedContent(java.lang.Object, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.ui.Alignment, kotlin.jvm.functions.Function4, androidx.compose.runtime.Composer, int, int):void");
    }

    public static /* synthetic */ SizeTransform SizeTransform$default(boolean z, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            function2 = AnimatedContentKt$SizeTransform$1.INSTANCE;
        }
        return SizeTransform(z, function2);
    }

    public static final SizeTransform SizeTransform(boolean z, Function2<? super IntSize, ? super IntSize, ? extends FiniteAnimationSpec<IntSize>> function2) {
        Intrinsics.checkNotNullParameter(function2, "sizeAnimationSpec");
        return new SizeTransformImpl(z, function2);
    }

    public static final ContentTransform with(EnterTransition enterTransition, ExitTransition exitTransition) {
        Intrinsics.checkNotNullParameter(enterTransition, "<this>");
        Intrinsics.checkNotNullParameter(exitTransition, "exit");
        return new ContentTransform(enterTransition, exitTransition, 0.0f, (SizeTransform) null, 12, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: androidx.compose.runtime.snapshots.SnapshotStateList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: androidx.compose.animation.ContentTransform} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v33, resolved type: androidx.compose.animation.ContentTransform} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0455  */
    /* JADX WARNING: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00dd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S> void AnimatedContent(androidx.compose.animation.core.Transition<S> r25, androidx.compose.ui.Modifier r26, kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentScope<S>, androidx.compose.animation.ContentTransform> r27, androidx.compose.ui.Alignment r28, kotlin.jvm.functions.Function1<? super S, ? extends java.lang.Object> r29, kotlin.jvm.functions.Function4<? super androidx.compose.animation.AnimatedVisibilityScope, ? super S, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r30, androidx.compose.runtime.Composer r31, int r32, int r33) {
        /*
            r8 = r25
            r9 = r30
            r10 = r32
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = -114689412(0xfffffffff929fa7c, float:-5.516116E34)
            r1 = r31
            androidx.compose.runtime.Composer r11 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(AnimatedContent)P(3,4,1,2)616@28718L7,617@28746L92,622@28927L51,623@29000L62,706@33066L58,707@33158L45,717@33473L52,708@33208L323:AnimatedContent.kt#xbi5r1"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r1)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r33 & r1
            if (r1 == 0) goto L_0x0028
            r1 = r10 | 6
            goto L_0x0038
        L_0x0028:
            r1 = r10 & 14
            if (r1 != 0) goto L_0x0037
            boolean r1 = r11.changed((java.lang.Object) r8)
            if (r1 == 0) goto L_0x0034
            r1 = 4
            goto L_0x0035
        L_0x0034:
            r1 = 2
        L_0x0035:
            r1 = r1 | r10
            goto L_0x0038
        L_0x0037:
            r1 = r10
        L_0x0038:
            r2 = r33 & 1
            if (r2 == 0) goto L_0x003f
            r1 = r1 | 48
            goto L_0x0052
        L_0x003f:
            r3 = r10 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0052
            r3 = r26
            boolean r4 = r11.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x004e
            r4 = 32
            goto L_0x0050
        L_0x004e:
            r4 = 16
        L_0x0050:
            r1 = r1 | r4
            goto L_0x0054
        L_0x0052:
            r3 = r26
        L_0x0054:
            r4 = r33 & 2
            if (r4 == 0) goto L_0x005b
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x006e
        L_0x005b:
            r5 = r10 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x006e
            r5 = r27
            boolean r6 = r11.changed((java.lang.Object) r5)
            if (r6 == 0) goto L_0x006a
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x006c
        L_0x006a:
            r6 = 128(0x80, float:1.794E-43)
        L_0x006c:
            r1 = r1 | r6
            goto L_0x0070
        L_0x006e:
            r5 = r27
        L_0x0070:
            r6 = r33 & 4
            if (r6 == 0) goto L_0x0077
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x008a
        L_0x0077:
            r7 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x008a
            r7 = r28
            boolean r12 = r11.changed((java.lang.Object) r7)
            if (r12 == 0) goto L_0x0086
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0088
        L_0x0086:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0088:
            r1 = r1 | r12
            goto L_0x008c
        L_0x008a:
            r7 = r28
        L_0x008c:
            r12 = r33 & 8
            if (r12 == 0) goto L_0x0093
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a8
        L_0x0093:
            r13 = 57344(0xe000, float:8.0356E-41)
            r13 = r13 & r10
            if (r13 != 0) goto L_0x00a8
            r13 = r29
            boolean r14 = r11.changed((java.lang.Object) r13)
            if (r14 == 0) goto L_0x00a4
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a6
        L_0x00a4:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x00a6:
            r1 = r1 | r14
            goto L_0x00aa
        L_0x00a8:
            r13 = r29
        L_0x00aa:
            r14 = r33 & 16
            if (r14 == 0) goto L_0x00b2
            r14 = 196608(0x30000, float:2.75506E-40)
        L_0x00b0:
            r1 = r1 | r14
            goto L_0x00c3
        L_0x00b2:
            r14 = 458752(0x70000, float:6.42848E-40)
            r14 = r14 & r10
            if (r14 != 0) goto L_0x00c3
            boolean r14 = r11.changed((java.lang.Object) r9)
            if (r14 == 0) goto L_0x00c0
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b0
        L_0x00c0:
            r14 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00b0
        L_0x00c3:
            r14 = r1
            r1 = 374491(0x5b6db, float:5.24774E-40)
            r1 = r1 & r14
            r15 = 74898(0x12492, float:1.04954E-40)
            if (r1 != r15) goto L_0x00dd
            boolean r1 = r11.getSkipping()
            if (r1 != 0) goto L_0x00d4
            goto L_0x00dd
        L_0x00d4:
            r11.skipToGroupEnd()
            r2 = r3
            r3 = r5
            r4 = r7
            r5 = r13
            goto L_0x044e
        L_0x00dd:
            if (r2 == 0) goto L_0x00e5
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
            r15 = r1
            goto L_0x00e6
        L_0x00e5:
            r15 = r3
        L_0x00e6:
            if (r4 == 0) goto L_0x00ed
            androidx.compose.animation.AnimatedContentKt$AnimatedContent$5 r1 = androidx.compose.animation.AnimatedContentKt$AnimatedContent$5.INSTANCE
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            r5 = r1
        L_0x00ed:
            if (r6 == 0) goto L_0x00f6
            androidx.compose.ui.Alignment$Companion r1 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment r1 = r1.getTopStart()
            r7 = r1
        L_0x00f6:
            if (r12 == 0) goto L_0x00fd
            androidx.compose.animation.AnimatedContentKt$AnimatedContent$6 r1 = androidx.compose.animation.AnimatedContentKt$AnimatedContent$6.INSTANCE
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            r13 = r1
        L_0x00fd:
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            r2 = -1
            if (r1 == 0) goto L_0x010a
            java.lang.String r1 = "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:605)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r14, r2, r1)
        L_0x010a:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            androidx.compose.runtime.CompositionLocal r0 = (androidx.compose.runtime.CompositionLocal) r0
            r12 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r6 = "C:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r11, r12, r6)
            java.lang.Object r0 = r11.consume(r0)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r11)
            androidx.compose.ui.unit.LayoutDirection r0 = (androidx.compose.ui.unit.LayoutDirection) r0
            r1 = 1157296644(0x44faf204, float:2007.563)
            r11.startReplaceableGroup(r1)
            java.lang.String r3 = "C(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r3)
            boolean r4 = r11.changed((java.lang.Object) r8)
            java.lang.Object r12 = r11.rememberedValue()
            if (r4 != 0) goto L_0x013e
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r4 = r4.getEmpty()
            if (r12 != r4) goto L_0x0146
        L_0x013e:
            androidx.compose.animation.AnimatedContentScope r12 = new androidx.compose.animation.AnimatedContentScope
            r12.<init>(r8, r7, r0)
            r11.updateRememberedValue(r12)
        L_0x0146:
            r11.endReplaceableGroup()
            androidx.compose.animation.AnimatedContentScope r12 = (androidx.compose.animation.AnimatedContentScope) r12
            r11.startReplaceableGroup(r1)
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r3)
            boolean r4 = r11.changed((java.lang.Object) r8)
            java.lang.Object r2 = r11.rememberedValue()
            if (r4 != 0) goto L_0x0163
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r4 = r4.getEmpty()
            if (r2 != r4) goto L_0x0172
        L_0x0163:
            java.lang.Object r2 = r25.getCurrentState()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            androidx.compose.runtime.snapshots.SnapshotStateList r2 = androidx.compose.runtime.SnapshotStateKt.mutableStateListOf(r2)
            r11.updateRememberedValue(r2)
        L_0x0172:
            r11.endReplaceableGroup()
            r4 = r2
            androidx.compose.runtime.snapshots.SnapshotStateList r4 = (androidx.compose.runtime.snapshots.SnapshotStateList) r4
            r11.startReplaceableGroup(r1)
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r3)
            boolean r1 = r11.changed((java.lang.Object) r8)
            java.lang.Object r2 = r11.rememberedValue()
            if (r1 != 0) goto L_0x0190
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r2 != r1) goto L_0x019b
        L_0x0190:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r2 = r1
            java.util.Map r2 = (java.util.Map) r2
            r11.updateRememberedValue(r2)
        L_0x019b:
            r11.endReplaceableGroup()
            r3 = r2
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Object r1 = r25.getCurrentState()
            boolean r1 = r4.contains(r1)
            if (r1 != 0) goto L_0x01b5
            r4.clear()
            java.lang.Object r1 = r25.getCurrentState()
            r4.add(r1)
        L_0x01b5:
            java.lang.Object r1 = r25.getCurrentState()
            java.lang.Object r2 = r25.getTargetState()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            r2 = 1
            if (r1 == 0) goto L_0x01fd
            int r1 = r4.size()
            if (r1 != r2) goto L_0x01d9
            r1 = 0
            java.lang.Object r2 = r4.get(r1)
            java.lang.Object r1 = r25.getCurrentState()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r1)
            if (r1 != 0) goto L_0x01e3
        L_0x01d9:
            r4.clear()
            java.lang.Object r1 = r25.getCurrentState()
            r4.add(r1)
        L_0x01e3:
            int r1 = r3.size()
            r2 = 1
            if (r1 != r2) goto L_0x01f4
            java.lang.Object r1 = r25.getCurrentState()
            boolean r1 = r3.containsKey(r1)
            if (r1 == 0) goto L_0x01f7
        L_0x01f4:
            r3.clear()
        L_0x01f7:
            r12.setContentAlignment$animation_release(r7)
            r12.setLayoutDirection$animation_release(r0)
        L_0x01fd:
            java.lang.Object r0 = r25.getCurrentState()
            java.lang.Object r1 = r25.getTargetState()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            if (r0 != 0) goto L_0x0256
            java.lang.Object r0 = r25.getTargetState()
            boolean r0 = r4.contains(r0)
            if (r0 != 0) goto L_0x0256
            r0 = r4
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L_0x021d:
            boolean r16 = r0.hasNext()
            if (r16 == 0) goto L_0x0243
            java.lang.Object r2 = r0.next()
            java.lang.Object r2 = r13.invoke(r2)
            r31 = r0
            java.lang.Object r0 = r25.getTargetState()
            java.lang.Object r0 = r13.invoke(r0)
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r0)
            if (r0 == 0) goto L_0x023d
            r0 = -1
            goto L_0x0245
        L_0x023d:
            int r1 = r1 + 1
            r0 = r31
            r2 = 1
            goto L_0x021d
        L_0x0243:
            r0 = -1
            r1 = -1
        L_0x0245:
            if (r1 != r0) goto L_0x024f
            java.lang.Object r0 = r25.getTargetState()
            r4.add(r0)
            goto L_0x0256
        L_0x024f:
            java.lang.Object r0 = r25.getTargetState()
            r4.set(r1, r0)
        L_0x0256:
            java.lang.Object r0 = r25.getTargetState()
            boolean r0 = r3.containsKey(r0)
            if (r0 == 0) goto L_0x0278
            java.lang.Object r0 = r25.getCurrentState()
            boolean r0 = r3.containsKey(r0)
            if (r0 != 0) goto L_0x026b
            goto L_0x0278
        L_0x026b:
            r2 = r3
            r21 = r4
            r22 = r5
            r23 = r6
            r24 = r7
            r19 = 0
            goto L_0x02d0
        L_0x0278:
            r3.clear()
            r2 = r4
            java.util.List r2 = (java.util.List) r2
            int r1 = r2.size()
            r0 = 0
        L_0x0283:
            if (r0 >= r1) goto L_0x026b
            java.lang.Object r8 = r2.get(r0)
            androidx.compose.animation.AnimatedContentKt$AnimatedContent$7$1 r9 = new androidx.compose.animation.AnimatedContentKt$AnimatedContent$7$1
            r16 = r0
            r0 = r9
            r17 = r1
            r18 = 0
            r1 = r25
            r19 = r18
            r10 = 1
            r18 = r2
            r2 = r8
            r20 = r3
            r3 = r14
            r21 = r4
            r4 = r5
            r22 = r5
            r5 = r12
            r23 = r6
            r6 = r30
            r24 = r7
            r7 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = 885640742(0x34c9ce26, float:3.758916E-7)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r11, r0, r10, r9)
            r2 = r20
            r2.put(r8, r0)
            int r0 = r16 + 1
            r8 = r25
            r9 = r30
            r10 = r32
            r3 = r2
            r1 = r17
            r2 = r18
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            goto L_0x0283
        L_0x02d0:
            androidx.compose.animation.core.Transition$Segment r0 = r25.getSegment()
            r1 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r11.startReplaceableGroup(r1)
            java.lang.String r1 = "C(remember)P(1,2):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r1)
            boolean r1 = r11.changed((java.lang.Object) r12)
            boolean r0 = r11.changed((java.lang.Object) r0)
            r0 = r0 | r1
            java.lang.Object r1 = r11.rememberedValue()
            if (r0 != 0) goto L_0x02fb
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r0 = r0.getEmpty()
            if (r1 != r0) goto L_0x02f7
            goto L_0x02fb
        L_0x02f7:
            r0 = r1
            r1 = r22
            goto L_0x0306
        L_0x02fb:
            r1 = r22
            java.lang.Object r0 = r1.invoke(r12)
            androidx.compose.animation.ContentTransform r0 = (androidx.compose.animation.ContentTransform) r0
            r11.updateRememberedValue(r0)
        L_0x0306:
            r11.endReplaceableGroup()
            androidx.compose.animation.ContentTransform r0 = (androidx.compose.animation.ContentTransform) r0
            r3 = 72
            androidx.compose.ui.Modifier r0 = r12.createSizeAnimationModifier$animation_release(r0, r11, r3)
            androidx.compose.ui.Modifier r0 = r15.then(r0)
            r3 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r11.startReplaceableGroup(r3)
            java.lang.String r3 = "C(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r3)
            java.lang.Object r3 = r11.rememberedValue()
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r4 = r4.getEmpty()
            if (r3 != r4) goto L_0x0334
            androidx.compose.animation.AnimatedContentMeasurePolicy r3 = new androidx.compose.animation.AnimatedContentMeasurePolicy
            r3.<init>(r12)
            r11.updateRememberedValue(r3)
        L_0x0334:
            r11.endReplaceableGroup()
            androidx.compose.animation.AnimatedContentMeasurePolicy r3 = (androidx.compose.animation.AnimatedContentMeasurePolicy) r3
            r4 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r11.startReplaceableGroup(r4)
            java.lang.String r4 = "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r4)
            androidx.compose.runtime.ProvidableCompositionLocal r4 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r4 = (androidx.compose.runtime.CompositionLocal) r4
            r5 = r23
            r6 = 2023513938(0x789c5f52, float:2.5372864E34)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r11, r6, r5)
            java.lang.Object r4 = r11.consume(r4)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r11)
            androidx.compose.ui.unit.Density r4 = (androidx.compose.ui.unit.Density) r4
            androidx.compose.runtime.ProvidableCompositionLocal r7 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            androidx.compose.runtime.CompositionLocal r7 = (androidx.compose.runtime.CompositionLocal) r7
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r11, r6, r5)
            java.lang.Object r7 = r11.consume(r7)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r11)
            androidx.compose.ui.unit.LayoutDirection r7 = (androidx.compose.ui.unit.LayoutDirection) r7
            androidx.compose.runtime.ProvidableCompositionLocal r8 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            androidx.compose.runtime.CompositionLocal r8 = (androidx.compose.runtime.CompositionLocal) r8
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r11, r6, r5)
            java.lang.Object r5 = r11.consume(r8)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r11)
            androidx.compose.ui.platform.ViewConfiguration r5 = (androidx.compose.ui.platform.ViewConfiguration) r5
            androidx.compose.ui.node.ComposeUiNode$Companion r6 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function0 r6 = r6.getConstructor()
            kotlin.jvm.functions.Function3 r0 = androidx.compose.ui.layout.LayoutKt.materializerOf(r0)
            androidx.compose.runtime.Applier r8 = r11.getApplier()
            boolean r8 = r8 instanceof androidx.compose.runtime.Applier
            if (r8 != 0) goto L_0x0394
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x0394:
            r11.startReusableNode()
            boolean r8 = r11.getInserting()
            if (r8 == 0) goto L_0x03a1
            r11.createNode(r6)
            goto L_0x03a4
        L_0x03a1:
            r11.useNode()
        L_0x03a4:
            r11.disableReusing()
            androidx.compose.runtime.Composer r6 = androidx.compose.runtime.Updater.m2444constructorimpl(r11)
            androidx.compose.ui.layout.MeasurePolicy r3 = (androidx.compose.ui.layout.MeasurePolicy) r3
            androidx.compose.ui.node.ComposeUiNode$Companion r8 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r8 = r8.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r6, r3, r8)
            androidx.compose.ui.node.ComposeUiNode$Companion r3 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r3 = r3.getSetDensity()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r6, r4, r3)
            androidx.compose.ui.node.ComposeUiNode$Companion r3 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r3 = r3.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r6, r7, r3)
            androidx.compose.ui.node.ComposeUiNode$Companion r3 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r3 = r3.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r6, r5, r3)
            r11.enableReusing()
            androidx.compose.runtime.Composer r3 = androidx.compose.runtime.SkippableUpdater.m2436constructorimpl(r11)
            androidx.compose.runtime.SkippableUpdater r3 = androidx.compose.runtime.SkippableUpdater.m2435boximpl(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r19)
            r0.invoke(r3, r11, r4)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r11.startReplaceableGroup(r0)
            r0 = -740841114(0xffffffffd3d7a966, float:-1.85252001E12)
            java.lang.String r3 = "C:AnimatedContent.kt#xbi5r1"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r11, r0, r3)
            r0 = -441512234(0xffffffffe5af0ed6, float:-1.0333598E23)
            r11.startReplaceableGroup(r0)
            java.lang.String r0 = ""
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r0)
            r4 = r21
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r0 = r4.iterator()
        L_0x0404:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0431
            java.lang.Object r3 = r0.next()
            r4 = -1739564366(0xffffffff98505ab2, float:-2.692916E-24)
            java.lang.Object r5 = r13.invoke(r3)
            r11.startMovableGroup(r4, r5)
            java.lang.String r4 = "713@33397L8"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r4)
            java.lang.Object r3 = r2.get(r3)
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
            if (r3 != 0) goto L_0x0426
            goto L_0x042d
        L_0x0426:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r19)
            r3.invoke(r11, r4)
        L_0x042d:
            r11.endMovableGroup()
            goto L_0x0404
        L_0x0431:
            r11.endReplaceableGroup()
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r11)
            r11.endReplaceableGroup()
            r11.endNode()
            r11.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0449
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0449:
            r3 = r1
            r5 = r13
            r2 = r15
            r4 = r24
        L_0x044e:
            androidx.compose.runtime.ScopeUpdateScope r9 = r11.endRestartGroup()
            if (r9 != 0) goto L_0x0455
            goto L_0x0468
        L_0x0455:
            androidx.compose.animation.AnimatedContentKt$AnimatedContent$10 r10 = new androidx.compose.animation.AnimatedContentKt$AnimatedContent$10
            r0 = r10
            r1 = r25
            r6 = r30
            r7 = r32
            r8 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            r9.updateScope(r10)
        L_0x0468:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedContentKt.AnimatedContent(androidx.compose.animation.core.Transition, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.ui.Alignment, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function4, androidx.compose.runtime.Composer, int, int):void");
    }
}
