package androidx.compose.material3;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\t\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JÊ\u0001\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0002\b\f2\u0006\u0010\r\u001a\u00020\u000e2z\u0010\u000f\u001av\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00040\u0010¢\u0006\u0002\b\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Landroidx/compose/material3/TextFieldTransitionScope;", "", "()V", "Transition", "", "inputState", "Landroidx/compose/material3/InputPhase;", "focusedTextStyleColor", "Landroidx/compose/ui/graphics/Color;", "unfocusedTextStyleColor", "contentColor", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composable;", "showLabel", "", "content", "Lkotlin/Function5;", "", "Lkotlin/ParameterName;", "name", "labelProgress", "labelTextStyleColor", "labelContentColor", "placeholderOpacity", "prefixSuffixOpacity", "Transition-DTcfvLk", "(Landroidx/compose/material3/InputPhase;JJLkotlin/jvm/functions/Function3;ZLkotlin/jvm/functions/Function7;Landroidx/compose/runtime/Composer;I)V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: TextFieldImpl.kt */
final class TextFieldTransitionScope {
    public static final TextFieldTransitionScope INSTANCE = new TextFieldTransitionScope();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* compiled from: TextFieldImpl.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.compose.material3.InputPhase[] r0 = androidx.compose.material3.InputPhase.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.material3.InputPhase r1 = androidx.compose.material3.InputPhase.Focused     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.material3.InputPhase r1 = androidx.compose.material3.InputPhase.UnfocusedEmpty     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.material3.InputPhase r1 = androidx.compose.material3.InputPhase.UnfocusedNotEmpty     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldTransitionScope.WhenMappings.<clinit>():void");
        }
    }

    private TextFieldTransitionScope() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: androidx.compose.animation.core.TwoWayConverter} */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0248, code lost:
        if (r8 != false) goto L_0x0240;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0201, code lost:
        if (r8 != false) goto L_0x01f9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02c4  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x02dd  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02f9  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x030b  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0322  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0377  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0386  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0389  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0391  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x03e8  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x03f7  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x03fa  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0402  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x041e  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x042d  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0430  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0438  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0564  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x020c  */
    /* renamed from: Transition-DTcfvLk  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m1725TransitionDTcfvLk(androidx.compose.material3.InputPhase r26, long r27, long r29, kotlin.jvm.functions.Function3<? super androidx.compose.material3.InputPhase, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, androidx.compose.ui.graphics.Color> r31, boolean r32, kotlin.jvm.functions.Function7<? super java.lang.Float, ? super androidx.compose.ui.graphics.Color, ? super androidx.compose.ui.graphics.Color, ? super java.lang.Float, ? super java.lang.Float, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r33, androidx.compose.runtime.Composer r34, int r35) {
        /*
            r25 = this;
            r2 = r26
            r7 = r31
            r8 = r32
            r5 = r33
            r6 = r35
            java.lang.String r0 = "inputState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "contentColor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = -995111872(0xffffffffc4afcc40, float:-1406.3828)
            r1 = r34
            androidx.compose.runtime.Composer r0 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(Transition)P(3,2:c#ui.graphics.Color,5:c#ui.graphics.Color,1,4)310@12822L59,312@12923L325,323@13295L1101,351@14444L354,362@14846L299,372@15191L186,378@15387L174:TextFieldImpl.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r0, r1)
            r1 = r6 & 14
            if (r1 != 0) goto L_0x0039
            boolean r1 = r0.changed((java.lang.Object) r2)
            if (r1 == 0) goto L_0x0036
            r1 = 4
            goto L_0x0037
        L_0x0036:
            r1 = 2
        L_0x0037:
            r1 = r1 | r6
            goto L_0x003a
        L_0x0039:
            r1 = r6
        L_0x003a:
            r4 = r6 & 112(0x70, float:1.57E-43)
            r14 = r27
            if (r4 != 0) goto L_0x004c
            boolean r4 = r0.changed((long) r14)
            if (r4 == 0) goto L_0x0049
            r4 = 32
            goto L_0x004b
        L_0x0049:
            r4 = 16
        L_0x004b:
            r1 = r1 | r4
        L_0x004c:
            r4 = r6 & 896(0x380, float:1.256E-42)
            r12 = r29
            if (r4 != 0) goto L_0x005e
            boolean r4 = r0.changed((long) r12)
            if (r4 == 0) goto L_0x005b
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r4 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r1 = r1 | r4
        L_0x005e:
            r4 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r4 != 0) goto L_0x006e
            boolean r4 = r0.changedInstance(r7)
            if (r4 == 0) goto L_0x006b
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x006d
        L_0x006b:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x006d:
            r1 = r1 | r4
        L_0x006e:
            r4 = 57344(0xe000, float:8.0356E-41)
            r9 = r6 & r4
            if (r9 != 0) goto L_0x0081
            boolean r9 = r0.changed((boolean) r8)
            if (r9 == 0) goto L_0x007e
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0080
        L_0x007e:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x0080:
            r1 = r1 | r9
        L_0x0081:
            r17 = 458752(0x70000, float:6.42848E-40)
            r9 = r6 & r17
            if (r9 != 0) goto L_0x0093
            boolean r9 = r0.changedInstance(r5)
            if (r9 == 0) goto L_0x0090
            r9 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0092
        L_0x0090:
            r9 = 65536(0x10000, float:9.18355E-41)
        L_0x0092:
            r1 = r1 | r9
        L_0x0093:
            r9 = 374491(0x5b6db, float:5.24774E-40)
            r9 = r9 & r1
            r10 = 74898(0x12492, float:1.04954E-40)
            if (r9 != r10) goto L_0x00a8
            boolean r9 = r0.getSkipping()
            if (r9 != 0) goto L_0x00a3
            goto L_0x00a8
        L_0x00a3:
            r0.skipToGroupEnd()
            goto L_0x0567
        L_0x00a8:
            boolean r9 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            r11 = -1
            if (r9 == 0) goto L_0x00b8
            r9 = -995111872(0xffffffffc4afcc40, float:-1406.3828)
            java.lang.String r10 = "androidx.compose.material3.TextFieldTransitionScope.Transition (TextFieldImpl.kt:293)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r9, r1, r11, r10)
        L_0x00b8:
            r9 = r1 & 14
            r9 = r9 | 48
            java.lang.String r10 = "TextFieldInputState"
            r4 = 0
            androidx.compose.animation.core.Transition r18 = androidx.compose.animation.core.TransitionKt.updateTransition(r2, (java.lang.String) r10, (androidx.compose.runtime.Composer) r0, (int) r9, (int) r4)
            androidx.compose.material3.TextFieldTransitionScope$Transition$labelProgress$2 r9 = androidx.compose.material3.TextFieldTransitionScope$Transition$labelProgress$2.INSTANCE
            kotlin.jvm.functions.Function3 r9 = (kotlin.jvm.functions.Function3) r9
            java.lang.String r16 = "LabelProgress"
            r10 = -1338768149(0xffffffffb03404eb, float:-6.549061E-10)
            r0.startReplaceableGroup(r10)
            java.lang.String r3 = "CC(animateFloat)P(2)938@37489L78:Transition.kt#pdpnli"
            androidx.compose.runtime.ComposerKt.sourceInformation(r0, r3)
            kotlin.jvm.internal.FloatCompanionObject r19 = kotlin.jvm.internal.FloatCompanionObject.INSTANCE
            androidx.compose.animation.core.TwoWayConverter r19 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter((kotlin.jvm.internal.FloatCompanionObject) r19)
            r4 = -142660079(0xfffffffff77f2e11, float:-5.1756642E33)
            r0.startReplaceableGroup(r4)
            java.lang.String r4 = "CC(animateValue)P(3,2)856@34079L32,857@34134L31,858@34190L23,860@34226L89:Transition.kt#pdpnli"
            androidx.compose.runtime.ComposerKt.sourceInformation(r0, r4)
            java.lang.Object r20 = r18.getCurrentState()
            androidx.compose.material3.InputPhase r20 = (androidx.compose.material3.InputPhase) r20
            r10 = 240378898(0xe53e412, float:2.611757E-30)
            r0.startReplaceableGroup(r10)
            java.lang.String r10 = "C:TextFieldImpl.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r0, r10)
            boolean r23 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r23 == 0) goto L_0x0106
            java.lang.String r2 = "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:315)"
            r5 = 240378898(0xe53e412, float:2.611757E-30)
            r6 = 0
            androidx.compose.runtime.ComposerKt.traceEventStart(r5, r6, r11, r2)
        L_0x0106:
            int[] r2 = androidx.compose.material3.TextFieldTransitionScope.WhenMappings.$EnumSwitchMapping$0
            int r5 = r20.ordinal()
            r2 = r2[r5]
            r6 = 3
            r5 = 1
            r23 = 1065353216(0x3f800000, float:1.0)
            if (r2 == r5) goto L_0x0122
            r5 = 2
            if (r2 == r5) goto L_0x0120
            if (r2 != r6) goto L_0x011a
            goto L_0x0122
        L_0x011a:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0120:
            r2 = 0
            goto L_0x0124
        L_0x0122:
            r2 = r23
        L_0x0124:
            boolean r5 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r5 == 0) goto L_0x012d
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x012d:
            r0.endReplaceableGroup()
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.Object r5 = r18.getTargetState()
            androidx.compose.material3.InputPhase r5 = (androidx.compose.material3.InputPhase) r5
            r6 = 240378898(0xe53e412, float:2.611757E-30)
            r0.startReplaceableGroup(r6)
            androidx.compose.runtime.ComposerKt.sourceInformation(r0, r10)
            boolean r22 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r22 == 0) goto L_0x0153
            r22 = r10
            java.lang.String r10 = "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:315)"
            r12 = 0
            androidx.compose.runtime.ComposerKt.traceEventStart(r6, r12, r11, r10)
            goto L_0x0155
        L_0x0153:
            r22 = r10
        L_0x0155:
            int[] r6 = androidx.compose.material3.TextFieldTransitionScope.WhenMappings.$EnumSwitchMapping$0
            int r5 = r5.ordinal()
            r5 = r6[r5]
            r6 = 1
            if (r5 == r6) goto L_0x016f
            r6 = 2
            if (r5 == r6) goto L_0x016d
            r6 = 3
            if (r5 != r6) goto L_0x0167
            goto L_0x016f
        L_0x0167:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x016d:
            r5 = 0
            goto L_0x0171
        L_0x016f:
            r5 = r23
        L_0x0171:
            boolean r6 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r6 == 0) goto L_0x017a
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x017a:
            r0.endReplaceableGroup()
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            androidx.compose.animation.core.Transition$Segment r6 = r18.getSegment()
            r10 = 0
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            java.lang.Object r6 = r9.invoke(r6, r0, r12)
            r12 = r6
            androidx.compose.animation.core.FiniteAnimationSpec r12 = (androidx.compose.animation.core.FiniteAnimationSpec) r12
            r6 = 196608(0x30000, float:2.75506E-40)
            r9 = r18
            r24 = r22
            r13 = -1338768149(0xffffffffb03404eb, float:-6.549061E-10)
            r10 = r2
            r2 = r11
            r11 = r5
            r5 = r13
            r13 = r19
            r14 = r16
            r15 = r0
            r16 = r6
            androidx.compose.runtime.State r19 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(r9, r10, r11, r12, r13, r14, r15, r16)
            r0.endReplaceableGroup()
            r0.endReplaceableGroup()
            androidx.compose.material3.TextFieldTransitionScope$Transition$placeholderOpacity$2 r9 = androidx.compose.material3.TextFieldTransitionScope$Transition$placeholderOpacity$2.INSTANCE
            kotlin.jvm.functions.Function3 r9 = (kotlin.jvm.functions.Function3) r9
            java.lang.String r14 = "PlaceholderOpacity"
            r0.startReplaceableGroup(r5)
            androidx.compose.runtime.ComposerKt.sourceInformation(r0, r3)
            kotlin.jvm.internal.FloatCompanionObject r10 = kotlin.jvm.internal.FloatCompanionObject.INSTANCE
            androidx.compose.animation.core.TwoWayConverter r13 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter((kotlin.jvm.internal.FloatCompanionObject) r10)
            r10 = -142660079(0xfffffffff77f2e11, float:-5.1756642E33)
            r0.startReplaceableGroup(r10)
            androidx.compose.runtime.ComposerKt.sourceInformation(r0, r4)
            java.lang.Object r10 = r18.getCurrentState()
            androidx.compose.material3.InputPhase r10 = (androidx.compose.material3.InputPhase) r10
            r11 = 2067512179(0x7b3bbb73, float:9.747614E35)
            r0.startReplaceableGroup(r11)
            r15 = r24
            androidx.compose.runtime.ComposerKt.sourceInformation(r0, r15)
            boolean r12 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r12 == 0) goto L_0x01e8
            java.lang.String r12 = "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:343)"
            r5 = 0
            androidx.compose.runtime.ComposerKt.traceEventStart(r11, r5, r2, r12)
        L_0x01e8:
            int[] r5 = androidx.compose.material3.TextFieldTransitionScope.WhenMappings.$EnumSwitchMapping$0
            int r10 = r10.ordinal()
            r5 = r5[r10]
            r10 = 1
            if (r5 == r10) goto L_0x0204
            r10 = 2
            if (r5 == r10) goto L_0x0201
            r10 = 3
            if (r5 != r10) goto L_0x01fb
        L_0x01f9:
            r5 = 0
            goto L_0x0206
        L_0x01fb:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0201:
            if (r8 == 0) goto L_0x0204
            goto L_0x01f9
        L_0x0204:
            r5 = r23
        L_0x0206:
            boolean r10 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r10 == 0) goto L_0x020f
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x020f:
            r0.endReplaceableGroup()
            java.lang.Float r10 = java.lang.Float.valueOf(r5)
            java.lang.Object r5 = r18.getTargetState()
            androidx.compose.material3.InputPhase r5 = (androidx.compose.material3.InputPhase) r5
            r0.startReplaceableGroup(r11)
            androidx.compose.runtime.ComposerKt.sourceInformation(r0, r15)
            boolean r12 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r12 == 0) goto L_0x022f
            java.lang.String r12 = "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:343)"
            r6 = 0
            androidx.compose.runtime.ComposerKt.traceEventStart(r11, r6, r2, r12)
        L_0x022f:
            int[] r6 = androidx.compose.material3.TextFieldTransitionScope.WhenMappings.$EnumSwitchMapping$0
            int r5 = r5.ordinal()
            r5 = r6[r5]
            r6 = 1
            if (r5 == r6) goto L_0x024b
            r6 = 2
            if (r5 == r6) goto L_0x0248
            r6 = 3
            if (r5 != r6) goto L_0x0242
        L_0x0240:
            r5 = 0
            goto L_0x024d
        L_0x0242:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0248:
            if (r8 == 0) goto L_0x024b
            goto L_0x0240
        L_0x024b:
            r5 = r23
        L_0x024d:
            boolean r6 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r6 == 0) goto L_0x0256
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0256:
            r0.endReplaceableGroup()
            java.lang.Float r11 = java.lang.Float.valueOf(r5)
            androidx.compose.animation.core.Transition$Segment r5 = r18.getSegment()
            r6 = 0
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
            java.lang.Object r5 = r9.invoke(r5, r0, r12)
            r12 = r5
            androidx.compose.animation.core.FiniteAnimationSpec r12 = (androidx.compose.animation.core.FiniteAnimationSpec) r12
            r9 = r18
            r5 = r15
            r15 = r0
            r6 = 196608(0x30000, float:2.75506E-40)
            r16 = r6
            androidx.compose.runtime.State r6 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(r9, r10, r11, r12, r13, r14, r15, r16)
            r0.endReplaceableGroup()
            r0.endReplaceableGroup()
            androidx.compose.material3.TextFieldTransitionScope$Transition$prefixSuffixOpacity$2 r9 = androidx.compose.material3.TextFieldTransitionScope$Transition$prefixSuffixOpacity$2.INSTANCE
            kotlin.jvm.functions.Function3 r9 = (kotlin.jvm.functions.Function3) r9
            java.lang.String r14 = "PrefixSuffixOpacity"
            r10 = -1338768149(0xffffffffb03404eb, float:-6.549061E-10)
            r0.startReplaceableGroup(r10)
            androidx.compose.runtime.ComposerKt.sourceInformation(r0, r3)
            kotlin.jvm.internal.FloatCompanionObject r3 = kotlin.jvm.internal.FloatCompanionObject.INSTANCE
            androidx.compose.animation.core.TwoWayConverter r13 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter((kotlin.jvm.internal.FloatCompanionObject) r3)
            r3 = -142660079(0xfffffffff77f2e11, float:-5.1756642E33)
            r0.startReplaceableGroup(r3)
            androidx.compose.runtime.ComposerKt.sourceInformation(r0, r4)
            java.lang.Object r3 = r18.getCurrentState()
            androidx.compose.material3.InputPhase r3 = (androidx.compose.material3.InputPhase) r3
            r10 = 5829913(0x58f519, float:8.169448E-39)
            r0.startReplaceableGroup(r10)
            androidx.compose.runtime.ComposerKt.sourceInformation(r0, r5)
            boolean r11 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r11 == 0) goto L_0x02b9
            java.lang.String r11 = "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:354)"
            r12 = 0
            androidx.compose.runtime.ComposerKt.traceEventStart(r10, r12, r2, r11)
        L_0x02b9:
            int[] r11 = androidx.compose.material3.TextFieldTransitionScope.WhenMappings.$EnumSwitchMapping$0
            int r3 = r3.ordinal()
            r3 = r11[r3]
            r11 = 1
            if (r3 == r11) goto L_0x02d5
            r11 = 2
            if (r3 == r11) goto L_0x02d1
            r11 = 3
            if (r3 != r11) goto L_0x02cb
            goto L_0x02d5
        L_0x02cb:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x02d1:
            if (r8 == 0) goto L_0x02d5
            r3 = 0
            goto L_0x02d7
        L_0x02d5:
            r3 = r23
        L_0x02d7:
            boolean r11 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r11 == 0) goto L_0x02e0
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x02e0:
            r0.endReplaceableGroup()
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            java.lang.Object r11 = r18.getTargetState()
            androidx.compose.material3.InputPhase r11 = (androidx.compose.material3.InputPhase) r11
            r0.startReplaceableGroup(r10)
            androidx.compose.runtime.ComposerKt.sourceInformation(r0, r5)
            boolean r12 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r12 == 0) goto L_0x0300
            java.lang.String r12 = "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:354)"
            r15 = 0
            androidx.compose.runtime.ComposerKt.traceEventStart(r10, r15, r2, r12)
        L_0x0300:
            int[] r10 = androidx.compose.material3.TextFieldTransitionScope.WhenMappings.$EnumSwitchMapping$0
            int r11 = r11.ordinal()
            r10 = r10[r11]
            r11 = 1
            if (r10 == r11) goto L_0x031c
            r11 = 2
            if (r10 == r11) goto L_0x0318
            r11 = 3
            if (r10 != r11) goto L_0x0312
            goto L_0x031c
        L_0x0312:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0318:
            if (r8 == 0) goto L_0x031c
            r23 = 0
        L_0x031c:
            boolean r10 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r10 == 0) goto L_0x0325
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0325:
            r0.endReplaceableGroup()
            java.lang.Float r11 = java.lang.Float.valueOf(r23)
            androidx.compose.animation.core.Transition$Segment r10 = r18.getSegment()
            r12 = 0
            java.lang.Integer r15 = java.lang.Integer.valueOf(r12)
            java.lang.Object r9 = r9.invoke(r10, r0, r15)
            r12 = r9
            androidx.compose.animation.core.FiniteAnimationSpec r12 = (androidx.compose.animation.core.FiniteAnimationSpec) r12
            r9 = r18
            r10 = r3
            r15 = r0
            r3 = 196608(0x30000, float:2.75506E-40)
            r16 = r3
            androidx.compose.runtime.State r3 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(r9, r10, r11, r12, r13, r14, r15, r16)
            r0.endReplaceableGroup()
            r0.endReplaceableGroup()
            androidx.compose.material3.TextFieldTransitionScope$Transition$labelTextStyleColor$2 r9 = androidx.compose.material3.TextFieldTransitionScope$Transition$labelTextStyleColor$2.INSTANCE
            kotlin.jvm.functions.Function3 r9 = (kotlin.jvm.functions.Function3) r9
            java.lang.String r14 = "LabelTextStyleColor"
            r10 = -1939694975(0xffffffff8c629a81, float:-1.7456901E-31)
            r0.startReplaceableGroup(r10)
            java.lang.String r10 = "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1"
            androidx.compose.runtime.ComposerKt.sourceInformation(r0, r10)
            java.lang.Object r10 = r18.getTargetState()
            androidx.compose.material3.InputPhase r10 = (androidx.compose.material3.InputPhase) r10
            r11 = -1468066062(0xffffffffa87f16f2, float:-1.4160319E-14)
            r0.startReplaceableGroup(r11)
            androidx.compose.runtime.ComposerKt.sourceInformation(r0, r5)
            boolean r12 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            java.lang.String r13 = "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:365)"
            if (r12 == 0) goto L_0x037b
            r12 = 0
            androidx.compose.runtime.ComposerKt.traceEventStart(r11, r12, r2, r13)
        L_0x037b:
            int[] r12 = androidx.compose.material3.TextFieldTransitionScope.WhenMappings.$EnumSwitchMapping$0
            int r10 = r10.ordinal()
            r10 = r12[r10]
            r12 = 1
            if (r10 != r12) goto L_0x0389
            r15 = r27
            goto L_0x038b
        L_0x0389:
            r15 = r29
        L_0x038b:
            boolean r10 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r10 == 0) goto L_0x0394
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0394:
            r0.endReplaceableGroup()
            androidx.compose.ui.graphics.colorspace.ColorSpace r10 = androidx.compose.ui.graphics.Color.m2825getColorSpaceimpl(r15)
            r12 = 1157296644(0x44faf204, float:2007.563)
            r0.startReplaceableGroup(r12)
            java.lang.String r12 = "C(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r0, r12)
            boolean r12 = r0.changed((java.lang.Object) r10)
            java.lang.Object r15 = r0.rememberedValue()
            if (r12 != 0) goto L_0x03b8
            androidx.compose.runtime.Composer$Companion r12 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r12 = r12.getEmpty()
            if (r15 != r12) goto L_0x03c8
        L_0x03b8:
            androidx.compose.ui.graphics.Color$Companion r12 = androidx.compose.ui.graphics.Color.Companion
            kotlin.jvm.functions.Function1 r12 = androidx.compose.animation.ColorVectorConverterKt.getVectorConverter(r12)
            java.lang.Object r10 = r12.invoke(r10)
            r15 = r10
            androidx.compose.animation.core.TwoWayConverter r15 = (androidx.compose.animation.core.TwoWayConverter) r15
            r0.updateRememberedValue(r15)
        L_0x03c8:
            r0.endReplaceableGroup()
            androidx.compose.animation.core.TwoWayConverter r15 = (androidx.compose.animation.core.TwoWayConverter) r15
            r10 = -142660079(0xfffffffff77f2e11, float:-5.1756642E33)
            r0.startReplaceableGroup(r10)
            androidx.compose.runtime.ComposerKt.sourceInformation(r0, r4)
            java.lang.Object r10 = r18.getCurrentState()
            androidx.compose.material3.InputPhase r10 = (androidx.compose.material3.InputPhase) r10
            r0.startReplaceableGroup(r11)
            androidx.compose.runtime.ComposerKt.sourceInformation(r0, r5)
            boolean r12 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r12 == 0) goto L_0x03ec
            r12 = 0
            androidx.compose.runtime.ComposerKt.traceEventStart(r11, r12, r2, r13)
        L_0x03ec:
            int[] r12 = androidx.compose.material3.TextFieldTransitionScope.WhenMappings.$EnumSwitchMapping$0
            int r10 = r10.ordinal()
            r10 = r12[r10]
            r12 = 1
            if (r10 != r12) goto L_0x03fa
            r20 = r27
            goto L_0x03fc
        L_0x03fa:
            r20 = r29
        L_0x03fc:
            boolean r10 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r10 == 0) goto L_0x0405
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0405:
            r0.endReplaceableGroup()
            androidx.compose.ui.graphics.Color r10 = androidx.compose.ui.graphics.Color.m2811boximpl(r20)
            java.lang.Object r12 = r18.getTargetState()
            androidx.compose.material3.InputPhase r12 = (androidx.compose.material3.InputPhase) r12
            r0.startReplaceableGroup(r11)
            androidx.compose.runtime.ComposerKt.sourceInformation(r0, r5)
            boolean r5 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r5 == 0) goto L_0x0422
            r5 = 0
            androidx.compose.runtime.ComposerKt.traceEventStart(r11, r5, r2, r13)
        L_0x0422:
            int[] r2 = androidx.compose.material3.TextFieldTransitionScope.WhenMappings.$EnumSwitchMapping$0
            int r5 = r12.ordinal()
            r2 = r2[r5]
            r5 = 1
            if (r2 != r5) goto L_0x0430
            r11 = r27
            goto L_0x0432
        L_0x0430:
            r11 = r29
        L_0x0432:
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x043b
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x043b:
            r0.endReplaceableGroup()
            androidx.compose.ui.graphics.Color r11 = androidx.compose.ui.graphics.Color.m2811boximpl(r11)
            androidx.compose.animation.core.Transition$Segment r2 = r18.getSegment()
            r5 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r2 = r9.invoke(r2, r0, r5)
            r12 = r2
            androidx.compose.animation.core.FiniteAnimationSpec r12 = (androidx.compose.animation.core.FiniteAnimationSpec) r12
            r16 = 229376(0x38000, float:3.21424E-40)
            r9 = r18
            r13 = r15
            r15 = r0
            androidx.compose.runtime.State r2 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(r9, r10, r11, r12, r13, r14, r15, r16)
            r0.endReplaceableGroup()
            r0.endReplaceableGroup()
            androidx.compose.material3.TextFieldTransitionScope$Transition$labelContentColor$2 r5 = androidx.compose.material3.TextFieldTransitionScope$Transition$labelContentColor$2.INSTANCE
            kotlin.jvm.functions.Function3 r5 = (kotlin.jvm.functions.Function3) r5
            java.lang.String r14 = "LabelContentColor"
            r9 = r1 & 7168(0x1c00, float:1.0045E-41)
            r9 = r9 | 384(0x180, float:5.38E-43)
            r10 = -1939694975(0xffffffff8c629a81, float:-1.7456901E-31)
            r0.startReplaceableGroup(r10)
            java.lang.String r10 = "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1"
            androidx.compose.runtime.ComposerKt.sourceInformation(r0, r10)
            java.lang.Object r10 = r18.getTargetState()
            int r11 = r9 >> 6
            r11 = r11 & 112(0x70, float:1.57E-43)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Object r10 = r7.invoke(r10, r0, r11)
            androidx.compose.ui.graphics.Color r10 = (androidx.compose.ui.graphics.Color) r10
            long r10 = r10.m2831unboximpl()
            androidx.compose.ui.graphics.colorspace.ColorSpace r10 = androidx.compose.ui.graphics.Color.m2825getColorSpaceimpl(r10)
            r11 = 1157296644(0x44faf204, float:2007.563)
            r0.startReplaceableGroup(r11)
            java.lang.String r11 = "C(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r0, r11)
            boolean r11 = r0.changed((java.lang.Object) r10)
            java.lang.Object r12 = r0.rememberedValue()
            if (r11 != 0) goto L_0x04af
            androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r11 = r11.getEmpty()
            if (r12 != r11) goto L_0x04bf
        L_0x04af:
            androidx.compose.ui.graphics.Color$Companion r11 = androidx.compose.ui.graphics.Color.Companion
            kotlin.jvm.functions.Function1 r11 = androidx.compose.animation.ColorVectorConverterKt.getVectorConverter(r11)
            java.lang.Object r10 = r11.invoke(r10)
            r12 = r10
            androidx.compose.animation.core.TwoWayConverter r12 = (androidx.compose.animation.core.TwoWayConverter) r12
            r0.updateRememberedValue(r12)
        L_0x04bf:
            r0.endReplaceableGroup()
            r13 = r12
            androidx.compose.animation.core.TwoWayConverter r13 = (androidx.compose.animation.core.TwoWayConverter) r13
            r10 = r9 & 14
            r10 = r10 | 64
            r11 = 3
            int r9 = r9 << r11
            r11 = r9 & 896(0x380, float:1.256E-42)
            r10 = r10 | r11
            r11 = r9 & 7168(0x1c00, float:1.0045E-41)
            r10 = r10 | r11
            r11 = 57344(0xe000, float:8.0356E-41)
            r9 = r9 & r11
            r9 = r9 | r10
            r10 = -142660079(0xfffffffff77f2e11, float:-5.1756642E33)
            r0.startReplaceableGroup(r10)
            androidx.compose.runtime.ComposerKt.sourceInformation(r0, r4)
            java.lang.Object r4 = r18.getCurrentState()
            int r10 = r9 >> 9
            r10 = r10 & 112(0x70, float:1.57E-43)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            java.lang.Object r4 = r7.invoke(r4, r0, r11)
            java.lang.Object r11 = r18.getTargetState()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Object r11 = r7.invoke(r11, r0, r10)
            androidx.compose.animation.core.Transition$Segment r10 = r18.getSegment()
            int r12 = r9 >> 3
            r12 = r12 & 112(0x70, float:1.57E-43)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Object r5 = r5.invoke(r10, r0, r12)
            r12 = r5
            androidx.compose.animation.core.FiniteAnimationSpec r12 = (androidx.compose.animation.core.FiniteAnimationSpec) r12
            r5 = r9 & 14
            int r10 = r9 << 9
            r15 = 57344(0xe000, float:8.0356E-41)
            r10 = r10 & r15
            r5 = r5 | r10
            int r9 = r9 << 6
            r9 = r9 & r17
            r16 = r5 | r9
            r9 = r18
            r10 = r4
            r15 = r0
            androidx.compose.runtime.State r4 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(r9, r10, r11, r12, r13, r14, r15, r16)
            r0.endReplaceableGroup()
            r0.endReplaceableGroup()
            float r5 = Transition_DTcfvLk$lambda$1(r19)
            java.lang.Float r10 = java.lang.Float.valueOf(r5)
            long r11 = Transition_DTcfvLk$lambda$7(r2)
            androidx.compose.ui.graphics.Color r11 = androidx.compose.ui.graphics.Color.m2811boximpl(r11)
            long r4 = Transition_DTcfvLk$lambda$8(r4)
            androidx.compose.ui.graphics.Color r12 = androidx.compose.ui.graphics.Color.m2811boximpl(r4)
            float r2 = Transition_DTcfvLk$lambda$3(r6)
            java.lang.Float r13 = java.lang.Float.valueOf(r2)
            float r2 = Transition_DTcfvLk$lambda$5(r3)
            java.lang.Float r14 = java.lang.Float.valueOf(r2)
            r1 = r1 & r17
            java.lang.Integer r16 = java.lang.Integer.valueOf(r1)
            r9 = r33
            r9.invoke(r10, r11, r12, r13, r14, r15, r16)
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x0567
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0567:
            androidx.compose.runtime.ScopeUpdateScope r11 = r0.endRestartGroup()
            if (r11 != 0) goto L_0x056e
            goto L_0x0589
        L_0x056e:
            androidx.compose.material3.TextFieldTransitionScope$Transition$1 r12 = new androidx.compose.material3.TextFieldTransitionScope$Transition$1
            r0 = r12
            r1 = r25
            r2 = r26
            r3 = r27
            r5 = r29
            r7 = r31
            r8 = r32
            r9 = r33
            r10 = r35
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10)
            kotlin.jvm.functions.Function2 r12 = (kotlin.jvm.functions.Function2) r12
            r11.updateScope(r12)
        L_0x0589:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldTransitionScope.m1725TransitionDTcfvLk(androidx.compose.material3.InputPhase, long, long, kotlin.jvm.functions.Function3, boolean, kotlin.jvm.functions.Function7, androidx.compose.runtime.Composer, int):void");
    }

    private static final float Transition_DTcfvLk$lambda$1(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final float Transition_DTcfvLk$lambda$3(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final float Transition_DTcfvLk$lambda$5(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final long Transition_DTcfvLk$lambda$7(State<Color> state) {
        return state.getValue().m2831unboximpl();
    }

    private static final long Transition_DTcfvLk$lambda$8(State<Color> state) {
        return state.getValue().m2831unboximpl();
    }
}
