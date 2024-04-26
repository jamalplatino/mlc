package androidx.compose.material3;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.material3.tokens.MenuTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000j\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aT\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000e0\u0018¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001bH\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a\u0001\u0010\u001d\u001a\u00020\u000e2\u0011\u0010\u001e\u001a\r\u0012\u0004\u0012\u00020\u000e0\u001f¢\u0006\u0002\b\u001a2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\u001f2\u0006\u0010\u0015\u001a\u00020\u00162\u0013\u0010!\u001a\u000f\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u001f¢\u0006\u0002\b\u001a2\u0013\u0010\"\u001a\u000f\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u001f¢\u0006\u0002\b\u001a2\u0006\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0001¢\u0006\u0002\u0010*\u001a \u0010+\u001a\u00020\u00142\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-H\u0000ø\u0001\u0000¢\u0006\u0002\u0010/\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0019\u0010\u0005\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u000e\u0010\b\u001a\u00020\tXT¢\u0006\u0002\n\u0000\"\u0019\u0010\n\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0002\u001a\u0004\b\u000b\u0010\u0007\"\u000e\u0010\f\u001a\u00020\tXT¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u00060"}, d2 = {"DropdownMenuItemDefaultMaxWidth", "Landroidx/compose/ui/unit/Dp;", "F", "DropdownMenuItemDefaultMinWidth", "DropdownMenuItemHorizontalPadding", "DropdownMenuVerticalPadding", "getDropdownMenuVerticalPadding", "()F", "InTransitionDuration", "", "MenuVerticalMargin", "getMenuVerticalMargin", "OutTransitionDuration", "DropdownMenuContent", "", "expandedStates", "Landroidx/compose/animation/core/MutableTransitionState;", "", "transformOriginState", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/ui/graphics/TransformOrigin;", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DropdownMenuItemContent", "text", "Lkotlin/Function0;", "onClick", "leadingIcon", "trailingIcon", "enabled", "colors", "Landroidx/compose/material3/MenuItemColors;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/MenuItemColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;I)V", "calculateTransformOrigin", "parentBounds", "Landroidx/compose/ui/unit/IntRect;", "menuBounds", "(Landroidx/compose/ui/unit/IntRect;Landroidx/compose/ui/unit/IntRect;)J", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Menu.kt */
public final class MenuKt {
    private static final float DropdownMenuItemDefaultMaxWidth = Dp.m5626constructorimpl((float) 280);
    private static final float DropdownMenuItemDefaultMinWidth = Dp.m5626constructorimpl((float) 112);
    /* access modifiers changed from: private */
    public static final float DropdownMenuItemHorizontalPadding = Dp.m5626constructorimpl((float) 12);
    private static final float DropdownMenuVerticalPadding = Dp.m5626constructorimpl((float) 8);
    public static final int InTransitionDuration = 120;
    private static final float MenuVerticalMargin = Dp.m5626constructorimpl((float) 48);
    public static final int OutTransitionDuration = 75;

    public static final float getDropdownMenuVerticalPadding() {
        return DropdownMenuVerticalPadding;
    }

    public static final float getMenuVerticalMargin() {
        return MenuVerticalMargin;
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x02c2  */
    /* JADX WARNING: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x009c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void DropdownMenuContent(androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean> r22, androidx.compose.runtime.MutableState<androidx.compose.ui.graphics.TransformOrigin> r23, androidx.compose.ui.Modifier r24, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r25, androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            r1 = r22
            r2 = r23
            r4 = r25
            r5 = r27
            java.lang.String r0 = "expandedStates"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "transformOriginState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = -159754260(0xfffffffff67a57ec, float:-1.2693921E33)
            r3 = r26
            androidx.compose.runtime.Composer r3 = r3.startRestartGroup(r0)
            java.lang.String r6 = "C(DropdownMenuContent)P(1,3,2)72@3078L48,74@3156L666,100@3852L477,120@4385L153,126@4582L9,127@4623L11,119@4334L715:Menu.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r3, r6)
            r6 = r28 & 1
            if (r6 == 0) goto L_0x002f
            r6 = r5 | 6
            goto L_0x003f
        L_0x002f:
            r6 = r5 & 14
            if (r6 != 0) goto L_0x003e
            boolean r6 = r3.changed((java.lang.Object) r1)
            if (r6 == 0) goto L_0x003b
            r6 = 4
            goto L_0x003c
        L_0x003b:
            r6 = 2
        L_0x003c:
            r6 = r6 | r5
            goto L_0x003f
        L_0x003e:
            r6 = r5
        L_0x003f:
            r7 = r28 & 2
            if (r7 == 0) goto L_0x0046
            r6 = r6 | 48
            goto L_0x0056
        L_0x0046:
            r7 = r5 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x0056
            boolean r7 = r3.changed((java.lang.Object) r2)
            if (r7 == 0) goto L_0x0053
            r7 = 32
            goto L_0x0055
        L_0x0053:
            r7 = 16
        L_0x0055:
            r6 = r6 | r7
        L_0x0056:
            r7 = r28 & 4
            if (r7 == 0) goto L_0x005d
            r6 = r6 | 384(0x180, float:5.38E-43)
            goto L_0x0070
        L_0x005d:
            r8 = r5 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x0070
            r8 = r24
            boolean r9 = r3.changed((java.lang.Object) r8)
            if (r9 == 0) goto L_0x006c
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x006e
        L_0x006c:
            r9 = 128(0x80, float:1.794E-43)
        L_0x006e:
            r6 = r6 | r9
            goto L_0x0072
        L_0x0070:
            r8 = r24
        L_0x0072:
            r9 = r28 & 8
            if (r9 == 0) goto L_0x0079
            r6 = r6 | 3072(0xc00, float:4.305E-42)
            goto L_0x0089
        L_0x0079:
            r9 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x0089
            boolean r9 = r3.changedInstance(r4)
            if (r9 == 0) goto L_0x0086
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0088
        L_0x0086:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0088:
            r6 = r6 | r9
        L_0x0089:
            r14 = r6
            r6 = r14 & 5851(0x16db, float:8.199E-42)
            r9 = 1170(0x492, float:1.64E-42)
            if (r6 != r9) goto L_0x009c
            boolean r6 = r3.getSkipping()
            if (r6 != 0) goto L_0x0097
            goto L_0x009c
        L_0x0097:
            r3.skipToGroupEnd()
            goto L_0x02bb
        L_0x009c:
            if (r7 == 0) goto L_0x00a4
            androidx.compose.ui.Modifier$Companion r6 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r6 = (androidx.compose.ui.Modifier) r6
            r15 = r6
            goto L_0x00a5
        L_0x00a4:
            r15 = r8
        L_0x00a5:
            boolean r6 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            r13 = -1
            if (r6 == 0) goto L_0x00b2
            java.lang.String r6 = "androidx.compose.material3.DropdownMenuContent (Menu.kt:65)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r14, r13, r6)
        L_0x00b2:
            int r0 = androidx.compose.animation.core.MutableTransitionState.$stable
            r0 = r0 | 48
            r6 = r14 & 14
            r0 = r0 | r6
            java.lang.String r6 = "DropDownMenu"
            r12 = 0
            androidx.compose.animation.core.Transition r0 = androidx.compose.animation.core.TransitionKt.updateTransition(r1, (java.lang.String) r6, (androidx.compose.runtime.Composer) r3, (int) r0, (int) r12)
            androidx.compose.material3.MenuKt$DropdownMenuContent$scale$2 r6 = androidx.compose.material3.MenuKt$DropdownMenuContent$scale$2.INSTANCE
            kotlin.jvm.functions.Function3 r6 = (kotlin.jvm.functions.Function3) r6
            r11 = -1338768149(0xffffffffb03404eb, float:-6.549061E-10)
            r3.startReplaceableGroup(r11)
            java.lang.String r10 = "CC(animateFloat)P(2)938@37489L78:Transition.kt#pdpnli"
            androidx.compose.runtime.ComposerKt.sourceInformation(r3, r10)
            java.lang.String r16 = "FloatAnimation"
            kotlin.jvm.internal.FloatCompanionObject r7 = kotlin.jvm.internal.FloatCompanionObject.INSTANCE
            androidx.compose.animation.core.TwoWayConverter r17 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter((kotlin.jvm.internal.FloatCompanionObject) r7)
            r9 = -142660079(0xfffffffff77f2e11, float:-5.1756642E33)
            r3.startReplaceableGroup(r9)
            java.lang.String r8 = "CC(animateValue)P(3,2)856@34079L32,857@34134L31,858@34190L23,860@34226L89:Transition.kt#pdpnli"
            androidx.compose.runtime.ComposerKt.sourceInformation(r3, r8)
            java.lang.Object r7 = r0.getCurrentState()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r9 = 1808111696(0x6bc59850, float:4.7775532E26)
            r3.startReplaceableGroup(r9)
            java.lang.String r9 = "C:Menu.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r3, r9)
            boolean r18 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            java.lang.String r11 = "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:90)"
            if (r18 == 0) goto L_0x0106
            r1 = 1808111696(0x6bc59850, float:4.7775532E26)
            androidx.compose.runtime.ComposerKt.traceEventStart(r1, r12, r13, r11)
        L_0x0106:
            r18 = 1065353216(0x3f800000, float:1.0)
            if (r7 == 0) goto L_0x010d
            r7 = r18
            goto L_0x0110
        L_0x010d:
            r7 = 1061997773(0x3f4ccccd, float:0.8)
        L_0x0110:
            boolean r19 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r19 == 0) goto L_0x0119
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0119:
            r3.endReplaceableGroup()
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            java.lang.Object r19 = r0.getTargetState()
            java.lang.Boolean r19 = (java.lang.Boolean) r19
            boolean r19 = r19.booleanValue()
            r1 = 1808111696(0x6bc59850, float:4.7775532E26)
            r3.startReplaceableGroup(r1)
            androidx.compose.runtime.ComposerKt.sourceInformation(r3, r9)
            boolean r20 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r20 == 0) goto L_0x013c
            androidx.compose.runtime.ComposerKt.traceEventStart(r1, r12, r13, r11)
        L_0x013c:
            if (r19 == 0) goto L_0x0141
            r1 = r18
            goto L_0x0144
        L_0x0141:
            r1 = 1061997773(0x3f4ccccd, float:0.8)
        L_0x0144:
            boolean r11 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r11 == 0) goto L_0x014d
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x014d:
            r3.endReplaceableGroup()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            androidx.compose.animation.core.Transition$Segment r11 = r0.getSegment()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            java.lang.Object r6 = r6.invoke(r11, r3, r13)
            r11 = r6
            androidx.compose.animation.core.FiniteAnimationSpec r11 = (androidx.compose.animation.core.FiniteAnimationSpec) r11
            r19 = 0
            r6 = r0
            r13 = r8
            r8 = r1
            r21 = r9
            r1 = -142660079(0xfffffffff77f2e11, float:-5.1756642E33)
            r9 = r11
            r11 = r10
            r10 = r17
            r1 = r11
            r11 = r16
            r5 = r12
            r12 = r3
            r5 = r13
            r4 = -1
            r13 = r19
            androidx.compose.runtime.State r13 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(r6, r7, r8, r9, r10, r11, r12, r13)
            r3.endReplaceableGroup()
            r3.endReplaceableGroup()
            androidx.compose.material3.MenuKt$DropdownMenuContent$alpha$2 r6 = androidx.compose.material3.MenuKt$DropdownMenuContent$alpha$2.INSTANCE
            kotlin.jvm.functions.Function3 r6 = (kotlin.jvm.functions.Function3) r6
            r7 = -1338768149(0xffffffffb03404eb, float:-6.549061E-10)
            r3.startReplaceableGroup(r7)
            androidx.compose.runtime.ComposerKt.sourceInformation(r3, r1)
            java.lang.String r11 = "FloatAnimation"
            kotlin.jvm.internal.FloatCompanionObject r1 = kotlin.jvm.internal.FloatCompanionObject.INSTANCE
            androidx.compose.animation.core.TwoWayConverter r10 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter((kotlin.jvm.internal.FloatCompanionObject) r1)
            r1 = -142660079(0xfffffffff77f2e11, float:-5.1756642E33)
            r3.startReplaceableGroup(r1)
            androidx.compose.runtime.ComposerKt.sourceInformation(r3, r5)
            java.lang.Object r1 = r0.getCurrentState()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r5 = 1864763068(0x6f2606bc, float:5.1382653E28)
            r3.startReplaceableGroup(r5)
            r7 = r21
            androidx.compose.runtime.ComposerKt.sourceInformation(r3, r7)
            boolean r8 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            java.lang.String r9 = "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:110)"
            if (r8 == 0) goto L_0x01c4
            r8 = 0
            androidx.compose.runtime.ComposerKt.traceEventStart(r5, r8, r4, r9)
        L_0x01c4:
            r8 = 0
            if (r1 == 0) goto L_0x01ca
            r1 = r18
            goto L_0x01cb
        L_0x01ca:
            r1 = r8
        L_0x01cb:
            boolean r12 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r12 == 0) goto L_0x01d4
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x01d4:
            r3.endReplaceableGroup()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.lang.Object r12 = r0.getTargetState()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            r3.startReplaceableGroup(r5)
            androidx.compose.runtime.ComposerKt.sourceInformation(r3, r7)
            boolean r7 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r7 == 0) goto L_0x01f5
            r7 = 0
            androidx.compose.runtime.ComposerKt.traceEventStart(r5, r7, r4, r9)
        L_0x01f5:
            if (r12 == 0) goto L_0x01f8
            goto L_0x01fa
        L_0x01f8:
            r18 = r8
        L_0x01fa:
            boolean r4 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r4 == 0) goto L_0x0203
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0203:
            r3.endReplaceableGroup()
            java.lang.Float r8 = java.lang.Float.valueOf(r18)
            androidx.compose.animation.core.Transition$Segment r4 = r0.getSegment()
            r5 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r4 = r6.invoke(r4, r3, r5)
            r9 = r4
            androidx.compose.animation.core.FiniteAnimationSpec r9 = (androidx.compose.animation.core.FiniteAnimationSpec) r9
            r6 = r0
            r7 = r1
            r12 = r3
            r0 = r13
            r13 = r19
            androidx.compose.runtime.State r1 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(r6, r7, r8, r9, r10, r11, r12, r13)
            r3.endReplaceableGroup()
            r3.endReplaceableGroup()
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r4 = (androidx.compose.ui.Modifier) r4
            r5 = 1618982084(0x607fb4c4, float:7.370227E19)
            r3.startReplaceableGroup(r5)
            java.lang.String r5 = "CC(remember)P(1,2,3):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r3, r5)
            boolean r5 = r3.changed((java.lang.Object) r0)
            boolean r6 = r3.changed((java.lang.Object) r1)
            r5 = r5 | r6
            boolean r6 = r3.changed((java.lang.Object) r2)
            r5 = r5 | r6
            java.lang.Object r6 = r3.rememberedValue()
            if (r5 != 0) goto L_0x0255
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r5 = r5.getEmpty()
            if (r6 != r5) goto L_0x0260
        L_0x0255:
            androidx.compose.material3.MenuKt$DropdownMenuContent$1$1 r5 = new androidx.compose.material3.MenuKt$DropdownMenuContent$1$1
            r5.<init>(r2, r0, r1)
            r6 = r5
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            r3.updateRememberedValue(r6)
        L_0x0260:
            r3.endReplaceableGroup()
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            androidx.compose.ui.Modifier r6 = androidx.compose.ui.graphics.GraphicsLayerModifierKt.graphicsLayer(r4, r6)
            androidx.compose.material3.tokens.MenuTokens r0 = androidx.compose.material3.tokens.MenuTokens.INSTANCE
            androidx.compose.material3.tokens.ShapeKeyTokens r0 = r0.getContainerShape()
            r1 = 6
            androidx.compose.ui.graphics.Shape r7 = androidx.compose.material3.ShapesKt.toShape(r0, r3, r1)
            androidx.compose.material3.MaterialTheme r0 = androidx.compose.material3.MaterialTheme.INSTANCE
            androidx.compose.material3.ColorScheme r0 = r0.getColorScheme(r3, r1)
            androidx.compose.material3.tokens.MenuTokens r1 = androidx.compose.material3.tokens.MenuTokens.INSTANCE
            androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = r1.getContainerColor()
            long r8 = androidx.compose.material3.ColorSchemeKt.fromToken(r0, r1)
            r10 = 0
            androidx.compose.material3.tokens.MenuTokens r0 = androidx.compose.material3.tokens.MenuTokens.INSTANCE
            float r12 = r0.m2140getContainerElevationD9Ej5fM()
            androidx.compose.material3.tokens.MenuTokens r0 = androidx.compose.material3.tokens.MenuTokens.INSTANCE
            float r13 = r0.m2140getContainerElevationD9Ej5fM()
            r0 = 0
            androidx.compose.material3.MenuKt$DropdownMenuContent$2 r1 = new androidx.compose.material3.MenuKt$DropdownMenuContent$2
            r4 = r25
            r1.<init>(r15, r4, r14)
            r5 = -1651673913(0xffffffff9d8d74c7, float:-3.7443134E-21)
            r14 = 1
            androidx.compose.runtime.internal.ComposableLambda r1 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r3, r5, r14, r1)
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            r17 = 12804096(0xc36000, float:1.794236E-38)
            r18 = 72
            r14 = r0
            r0 = r15
            r15 = r1
            r16 = r3
            androidx.compose.material3.SurfaceKt.m1641SurfaceT9BRK9s(r6, r7, r8, r10, r12, r13, r14, r15, r16, r17, r18)
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x02ba
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x02ba:
            r8 = r0
        L_0x02bb:
            androidx.compose.runtime.ScopeUpdateScope r7 = r3.endRestartGroup()
            if (r7 != 0) goto L_0x02c2
            goto L_0x02d8
        L_0x02c2:
            androidx.compose.material3.MenuKt$DropdownMenuContent$3 r9 = new androidx.compose.material3.MenuKt$DropdownMenuContent$3
            r0 = r9
            r1 = r22
            r2 = r23
            r3 = r8
            r4 = r25
            r5 = r27
            r6 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6)
            kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
            r7.updateScope(r9)
        L_0x02d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.MenuKt.DropdownMenuContent(androidx.compose.animation.core.MutableTransitionState, androidx.compose.runtime.MutableState, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void DropdownMenuItemContent(Function2<? super Composer, ? super Integer, Unit> function2, Function0<Unit> function0, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, boolean z, MenuItemColors menuItemColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Composer composer, int i) {
        int i2;
        Composer composer2;
        Function2<? super Composer, ? super Integer, Unit> function24 = function2;
        Function0<Unit> function02 = function0;
        Modifier modifier2 = modifier;
        MenuItemColors menuItemColors2 = menuItemColors;
        PaddingValues paddingValues2 = paddingValues;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        int i3 = i;
        Intrinsics.checkNotNullParameter(function24, "text");
        Intrinsics.checkNotNullParameter(function02, "onClick");
        Intrinsics.checkNotNullParameter(modifier2, "modifier");
        Intrinsics.checkNotNullParameter(menuItemColors2, "colors");
        Intrinsics.checkNotNullParameter(paddingValues2, "contentPadding");
        Intrinsics.checkNotNullParameter(mutableInteractionSource2, "interactionSource");
        Composer startRestartGroup = composer.startRestartGroup(-1564716777);
        ComposerKt.sourceInformation(startRestartGroup, "C(DropdownMenuItemContent)P(7,6,5,4,8,2)159@5627L20,153@5416L2336:Menu.kt#uh7d8r");
        if ((i3 & 14) == 0) {
            i2 = (startRestartGroup.changedInstance(function24) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i3 & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 32 : 16;
        }
        if ((i3 & 896) == 0) {
            i2 |= startRestartGroup.changed((Object) modifier2) ? 256 : 128;
        }
        Function2<? super Composer, ? super Integer, Unit> function25 = function22;
        if ((i3 & 7168) == 0) {
            i2 |= startRestartGroup.changedInstance(function25) ? 2048 : 1024;
        }
        Function2<? super Composer, ? super Integer, Unit> function26 = function23;
        if ((57344 & i3) == 0) {
            i2 |= startRestartGroup.changedInstance(function26) ? 16384 : 8192;
        }
        boolean z2 = z;
        if ((458752 & i3) == 0) {
            i2 |= startRestartGroup.changed(z2) ? 131072 : 65536;
        }
        if ((3670016 & i3) == 0) {
            i2 |= startRestartGroup.changed((Object) menuItemColors2) ? 1048576 : 524288;
        }
        if ((29360128 & i3) == 0) {
            i2 |= startRestartGroup.changed((Object) paddingValues2) ? 8388608 : 4194304;
        }
        if ((234881024 & i3) == 0) {
            i2 |= startRestartGroup.changed((Object) mutableInteractionSource2) ? 67108864 : 33554432;
        }
        int i4 = i2;
        if ((191739611 & i4) != 38347922 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1564716777, i4, -1, "androidx.compose.material3.DropdownMenuItemContent (Menu.kt:142)");
            }
            int i5 = i4;
            Modifier padding = PaddingKt.padding(SizeKt.m567sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m204clickableO2vRcR0$default(modifier, mutableInteractionSource, RippleKt.m1106rememberRipple9IZ8Weo(true, 0.0f, 0, startRestartGroup, 6, 6), z, (String) null, (Role) null, function0, 24, (Object) null), 0.0f, 1, (Object) null), DropdownMenuItemDefaultMinWidth, MenuTokens.INSTANCE.m2141getListItemContainerHeightD9Ej5fM(), DropdownMenuItemDefaultMaxWidth, 0.0f, 8, (Object) null), paddingValues2);
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            startRestartGroup.startReplaceableGroup(693286680);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Row)P(2,1,3)78@3913L58,79@3976L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
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
            Composer r13 = Updater.m2444constructorimpl(startRestartGroup);
            Updater.m2451setimpl(r13, rowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2451setimpl(r13, density, ComposeUiNode.Companion.getSetDensity());
            Updater.m2451setimpl(r13, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2451setimpl(r13, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -326682283, "C80@4021L9:Row.kt#2w3rfo");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1557318497, "C171@6130L10,171@6099L1647:Menu.kt#uh7d8r");
            composer2 = startRestartGroup;
            TextKt.ProvideTextStyle(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), MenuTokens.INSTANCE.getListItemLabelTextFont()), ComposableLambdaKt.composableLambda(composer2, 1065051884, true, new MenuKt$DropdownMenuItemContent$1$1(function22, menuItemColors, z, i5, function23, RowScopeInstance.INSTANCE, function2)), composer2, 48);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new MenuKt$DropdownMenuItemContent$2(function2, function0, modifier, function22, function23, z, menuItemColors, paddingValues, mutableInteractionSource, i));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0061  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long calculateTransformOrigin(androidx.compose.ui.unit.IntRect r5, androidx.compose.ui.unit.IntRect r6) {
        /*
            java.lang.String r0 = "parentBounds"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "menuBounds"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            int r0 = r6.getLeft()
            int r1 = r5.getRight()
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            if (r0 < r1) goto L_0x001b
        L_0x0019:
            r0 = r3
            goto L_0x0055
        L_0x001b:
            int r0 = r6.getRight()
            int r1 = r5.getLeft()
            if (r0 > r1) goto L_0x0027
            r0 = r2
            goto L_0x0055
        L_0x0027:
            int r0 = r6.getWidth()
            if (r0 != 0) goto L_0x002e
            goto L_0x0019
        L_0x002e:
            int r0 = r5.getLeft()
            int r1 = r6.getLeft()
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r5.getRight()
            int r4 = r6.getRight()
            int r1 = java.lang.Math.min(r1, r4)
            int r0 = r0 + r1
            int r0 = r0 / 2
            int r1 = r6.getLeft()
            int r0 = r0 - r1
            float r0 = (float) r0
            int r1 = r6.getWidth()
            float r1 = (float) r1
            float r0 = r0 / r1
        L_0x0055:
            int r1 = r6.getTop()
            int r4 = r5.getBottom()
            if (r1 < r4) goto L_0x0061
        L_0x005f:
            r2 = r3
            goto L_0x009b
        L_0x0061:
            int r1 = r6.getBottom()
            int r4 = r5.getTop()
            if (r1 > r4) goto L_0x006c
            goto L_0x009b
        L_0x006c:
            int r1 = r6.getHeight()
            if (r1 != 0) goto L_0x0073
            goto L_0x005f
        L_0x0073:
            int r1 = r5.getTop()
            int r2 = r6.getTop()
            int r1 = java.lang.Math.max(r1, r2)
            int r5 = r5.getBottom()
            int r2 = r6.getBottom()
            int r5 = java.lang.Math.min(r5, r2)
            int r1 = r1 + r5
            int r1 = r1 / 2
            int r5 = r6.getTop()
            int r1 = r1 - r5
            float r5 = (float) r1
            int r6 = r6.getHeight()
            float r6 = (float) r6
            float r2 = r5 / r6
        L_0x009b:
            long r5 = androidx.compose.ui.graphics.TransformOriginKt.TransformOrigin(r0, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.MenuKt.calculateTransformOrigin(androidx.compose.ui.unit.IntRect, androidx.compose.ui.unit.IntRect):long");
    }

    /* access modifiers changed from: private */
    public static final float DropdownMenuContent$lambda$1(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* access modifiers changed from: private */
    public static final float DropdownMenuContent$lambda$3(State<Float> state) {
        return state.getValue().floatValue();
    }
}
