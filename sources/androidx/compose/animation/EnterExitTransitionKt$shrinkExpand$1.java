package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: EnterExitTransition.kt */
final class EnterExitTransitionKt$shrinkExpand$1 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ State<ChangeSize> $expand;
    final /* synthetic */ String $labelPrefix;
    final /* synthetic */ State<ChangeSize> $shrink;
    final /* synthetic */ Transition<EnterExitState> $transition;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    EnterExitTransitionKt$shrinkExpand$1(Transition<EnterExitState> transition, State<ChangeSize> state, State<ChangeSize> state2, String str) {
        super(3);
        this.$transition = transition;
        this.$expand = state;
        this.$shrink = state2;
        this.$labelPrefix = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    private static final boolean invoke$lambda$1(MutableState<Boolean> mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    private static final void invoke$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: androidx.compose.animation.ExpandShrinkModifier} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: androidx.compose.animation.ExpandShrinkModifier} */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x019e, code lost:
        if (r6 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L_0x01a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01f2, code lost:
        r2 = r0.$shrink.getValue();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0207  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.ui.Modifier invoke(androidx.compose.ui.Modifier r22, androidx.compose.runtime.Composer r23, int r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r8 = r23
            java.lang.String r2 = "$this$composed"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r2 = -140634085(0xfffffffff79e181b, float:-6.413061E33)
            r8.startReplaceableGroup(r2)
            java.lang.String r3 = "C1037@44387L46,1047@44741L396,1060@45251L41,1058@45177L125,1069@45612L218:EnterExitTransition.kt#xbi5r1"
            androidx.compose.runtime.ComposerKt.sourceInformation(r8, r3)
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L_0x0025
            r3 = -1
            java.lang.String r4 = "androidx.compose.animation.shrinkExpand.<anonymous> (EnterExitTransition.kt:1033)"
            r5 = r24
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r5, r3, r4)
        L_0x0025:
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r2 = r0.$transition
            r9 = 1157296644(0x44faf204, float:2007.563)
            r8.startReplaceableGroup(r9)
            java.lang.String r10 = "C(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r8, r10)
            boolean r2 = r8.changed((java.lang.Object) r2)
            java.lang.Object r3 = r23.rememberedValue()
            r11 = 0
            r12 = 0
            if (r2 != 0) goto L_0x0046
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r3 != r2) goto L_0x0052
        L_0x0046:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r11)
            r3 = 2
            androidx.compose.runtime.MutableState r3 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r2, r12, r3, r12)
            r8.updateRememberedValue(r3)
        L_0x0052:
            r23.endReplaceableGroup()
            androidx.compose.runtime.MutableState r3 = (androidx.compose.runtime.MutableState) r3
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r2 = r0.$transition
            java.lang.Object r2 = r2.getCurrentState()
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r4 = r0.$transition
            java.lang.Object r4 = r4.getTargetState()
            r13 = 1
            if (r2 != r4) goto L_0x0072
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r2 = r0.$transition
            boolean r2 = r2.isSeeking()
            if (r2 != 0) goto L_0x0072
            invoke$lambda$2(r3, r11)
            goto L_0x0085
        L_0x0072:
            androidx.compose.runtime.State<androidx.compose.animation.ChangeSize> r2 = r0.$expand
            java.lang.Object r2 = r2.getValue()
            if (r2 != 0) goto L_0x0082
            androidx.compose.runtime.State<androidx.compose.animation.ChangeSize> r2 = r0.$shrink
            java.lang.Object r2 = r2.getValue()
            if (r2 == 0) goto L_0x0085
        L_0x0082:
            invoke$lambda$2(r3, r13)
        L_0x0085:
            boolean r2 = invoke$lambda$1(r3)
            if (r2 == 0) goto L_0x0219
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r2 = r0.$transition
            androidx.compose.animation.core.Transition$Segment r2 = r2.getSegment()
            androidx.compose.animation.EnterExitState r3 = androidx.compose.animation.EnterExitState.PreEnter
            androidx.compose.animation.EnterExitState r4 = androidx.compose.animation.EnterExitState.Visible
            boolean r2 = r2.isTransitioningTo(r3, r4)
            androidx.compose.runtime.State<androidx.compose.animation.ChangeSize> r3 = r0.$expand
            androidx.compose.runtime.State<androidx.compose.animation.ChangeSize> r4 = r0.$shrink
            if (r2 == 0) goto L_0x00ba
            java.lang.Object r2 = r3.getValue()
            androidx.compose.animation.ChangeSize r2 = (androidx.compose.animation.ChangeSize) r2
            if (r2 == 0) goto L_0x00ad
            androidx.compose.ui.Alignment r2 = r2.getAlignment()
            if (r2 != 0) goto L_0x00d6
        L_0x00ad:
            java.lang.Object r2 = r4.getValue()
            androidx.compose.animation.ChangeSize r2 = (androidx.compose.animation.ChangeSize) r2
            if (r2 == 0) goto L_0x00d5
            androidx.compose.ui.Alignment r2 = r2.getAlignment()
            goto L_0x00d6
        L_0x00ba:
            java.lang.Object r2 = r4.getValue()
            androidx.compose.animation.ChangeSize r2 = (androidx.compose.animation.ChangeSize) r2
            if (r2 == 0) goto L_0x00c8
            androidx.compose.ui.Alignment r2 = r2.getAlignment()
            if (r2 != 0) goto L_0x00d6
        L_0x00c8:
            java.lang.Object r2 = r3.getValue()
            androidx.compose.animation.ChangeSize r2 = (androidx.compose.animation.ChangeSize) r2
            if (r2 == 0) goto L_0x00d5
            androidx.compose.ui.Alignment r2 = r2.getAlignment()
            goto L_0x00d6
        L_0x00d5:
            r2 = r12
        L_0x00d6:
            androidx.compose.runtime.State r20 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(r2, r8, r11)
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r2 = r0.$transition
            androidx.compose.ui.unit.IntSize$Companion r3 = androidx.compose.ui.unit.IntSize.Companion
            androidx.compose.animation.core.TwoWayConverter r3 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter((androidx.compose.ui.unit.IntSize.Companion) r3)
            java.lang.String r4 = r0.$labelPrefix
            r14 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r8.startReplaceableGroup(r14)
            java.lang.String r15 = "C(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r8, r15)
            java.lang.Object r5 = r23.rememberedValue()
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r6 = r6.getEmpty()
            if (r5 != r6) goto L_0x0111
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.String r5 = " shrink/expand"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = r4.toString()
            r8.updateRememberedValue(r5)
        L_0x0111:
            r23.endReplaceableGroup()
            r4 = r5
            java.lang.String r4 = (java.lang.String) r4
            r6 = 448(0x1c0, float:6.28E-43)
            r7 = 0
            r5 = r23
            androidx.compose.animation.core.Transition$DeferredAnimation r16 = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(r2, r3, r4, r5, r6, r7)
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r2 = r0.$transition
            java.lang.Object r2 = r2.getCurrentState()
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r3 = r0.$transition
            java.lang.Object r3 = r3.getTargetState()
            if (r2 != r3) goto L_0x012f
            r11 = r13
        L_0x012f:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r11)
            r3 = -1553213624(0xffffffffa36bd748, float:-1.2784963E-17)
            r8.startMovableGroup(r3, r2)
            java.lang.String r2 = "1065@45497L54,1063@45413L152"
            androidx.compose.runtime.ComposerKt.sourceInformation(r8, r2)
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r2 = r0.$transition
            androidx.compose.ui.unit.IntOffset$Companion r3 = androidx.compose.ui.unit.IntOffset.Companion
            androidx.compose.animation.core.TwoWayConverter r3 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter((androidx.compose.ui.unit.IntOffset.Companion) r3)
            java.lang.String r4 = r0.$labelPrefix
            r8.startReplaceableGroup(r14)
            androidx.compose.runtime.ComposerKt.sourceInformation(r8, r15)
            java.lang.Object r5 = r23.rememberedValue()
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r6 = r6.getEmpty()
            if (r5 != r6) goto L_0x0170
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.String r5 = " InterruptionHandlingOffset"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = r4.toString()
            r8.updateRememberedValue(r5)
        L_0x0170:
            r23.endReplaceableGroup()
            r4 = r5
            java.lang.String r4 = (java.lang.String) r4
            r6 = 448(0x1c0, float:6.28E-43)
            r7 = 0
            r5 = r23
            androidx.compose.animation.core.Transition$DeferredAnimation r2 = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(r2, r3, r4, r5, r6, r7)
            r23.endMovableGroup()
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r3 = r0.$transition
            androidx.compose.runtime.State<androidx.compose.animation.ChangeSize> r4 = r0.$expand
            androidx.compose.runtime.State<androidx.compose.animation.ChangeSize> r5 = r0.$shrink
            r8.startReplaceableGroup(r9)
            androidx.compose.runtime.ComposerKt.sourceInformation(r8, r10)
            boolean r3 = r8.changed((java.lang.Object) r3)
            java.lang.Object r6 = r23.rememberedValue()
            if (r3 != 0) goto L_0x01a0
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r3 = r3.getEmpty()
            if (r6 != r3) goto L_0x01b3
        L_0x01a0:
            androidx.compose.animation.ExpandShrinkModifier r6 = new androidx.compose.animation.ExpandShrinkModifier
            r14 = r6
            r15 = r16
            r16 = r2
            r17 = r4
            r18 = r5
            r19 = r20
            r14.<init>(r15, r16, r17, r18, r19)
            r8.updateRememberedValue(r6)
        L_0x01b3:
            r23.endReplaceableGroup()
            androidx.compose.animation.ExpandShrinkModifier r6 = (androidx.compose.animation.ExpandShrinkModifier) r6
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r2 = r0.$transition
            java.lang.Object r2 = r2.getCurrentState()
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r3 = r0.$transition
            java.lang.Object r3 = r3.getTargetState()
            if (r2 != r3) goto L_0x01ca
            r6.setCurrentAlignment(r12)
            goto L_0x01e1
        L_0x01ca:
            androidx.compose.ui.Alignment r2 = r6.getCurrentAlignment()
            if (r2 != 0) goto L_0x01e1
            java.lang.Object r2 = r20.getValue()
            androidx.compose.ui.Alignment r2 = (androidx.compose.ui.Alignment) r2
            if (r2 != 0) goto L_0x01de
            androidx.compose.ui.Alignment$Companion r2 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment r2 = r2.getTopStart()
        L_0x01de:
            r6.setCurrentAlignment(r2)
        L_0x01e1:
            androidx.compose.runtime.State<androidx.compose.animation.ChangeSize> r2 = r0.$expand
            java.lang.Object r2 = r2.getValue()
            androidx.compose.animation.ChangeSize r2 = (androidx.compose.animation.ChangeSize) r2
            if (r2 == 0) goto L_0x01f2
            boolean r2 = r2.getClip()
            if (r2 != 0) goto L_0x01f2
            goto L_0x0202
        L_0x01f2:
            androidx.compose.runtime.State<androidx.compose.animation.ChangeSize> r2 = r0.$shrink
            java.lang.Object r2 = r2.getValue()
            androidx.compose.animation.ChangeSize r2 = (androidx.compose.animation.ChangeSize) r2
            if (r2 == 0) goto L_0x0207
            boolean r2 = r2.getClip()
            if (r2 != 0) goto L_0x0207
        L_0x0202:
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r2 = (androidx.compose.ui.Modifier) r2
            goto L_0x020f
        L_0x0207:
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r2 = (androidx.compose.ui.Modifier) r2
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.draw.ClipKt.clipToBounds(r2)
        L_0x020f:
            androidx.compose.ui.Modifier r1 = r1.then(r2)
            androidx.compose.ui.Modifier r6 = (androidx.compose.ui.Modifier) r6
            androidx.compose.ui.Modifier r1 = r1.then(r6)
        L_0x0219:
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x0222
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0222:
            r23.endReplaceableGroup()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.EnterExitTransitionKt$shrinkExpand$1.invoke(androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):androidx.compose.ui.Modifier");
    }
}
