package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: AppBar.kt */
final class AppBarKt$TwoRowsTopAppBar$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function2<Composer, Integer, Unit> $actionsRow;
    final /* synthetic */ float $bottomTitleAlpha;
    final /* synthetic */ TopAppBarColors $colors;
    final /* synthetic */ boolean $hideBottomRowSemantics;
    final /* synthetic */ boolean $hideTopRowSemantics;
    final /* synthetic */ Ref.FloatRef $maxHeightPx;
    final /* synthetic */ Function2<Composer, Integer, Unit> $navigationIcon;
    final /* synthetic */ Ref.FloatRef $pinnedHeightPx;
    final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
    final /* synthetic */ Function2<Composer, Integer, Unit> $smallTitle;
    final /* synthetic */ TextStyle $smallTitleTextStyle;
    final /* synthetic */ Function2<Composer, Integer, Unit> $title;
    final /* synthetic */ Ref.IntRef $titleBottomPaddingPx;
    final /* synthetic */ TextStyle $titleTextStyle;
    final /* synthetic */ float $topTitleAlpha;
    final /* synthetic */ WindowInsets $windowInsets;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AppBarKt$TwoRowsTopAppBar$3(WindowInsets windowInsets, Ref.FloatRef floatRef, TopAppBarColors topAppBarColors, Function2<? super Composer, ? super Integer, Unit> function2, TextStyle textStyle, float f, boolean z, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, int i, Ref.FloatRef floatRef2, TopAppBarScrollBehavior topAppBarScrollBehavior, Function2<? super Composer, ? super Integer, Unit> function24, TextStyle textStyle2, float f2, Ref.IntRef intRef, boolean z2) {
        super(2);
        this.$windowInsets = windowInsets;
        this.$pinnedHeightPx = floatRef;
        this.$colors = topAppBarColors;
        this.$smallTitle = function2;
        this.$smallTitleTextStyle = textStyle;
        this.$topTitleAlpha = f;
        this.$hideTopRowSemantics = z;
        this.$navigationIcon = function22;
        this.$actionsRow = function23;
        this.$$dirty = i;
        this.$maxHeightPx = floatRef2;
        this.$scrollBehavior = topAppBarScrollBehavior;
        this.$title = function24;
        this.$titleTextStyle = textStyle2;
        this.$bottomTitleAlpha = f2;
        this.$titleBottomPaddingPx = intRef;
        this.$hideBottomRowSemantics = z2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x01ea, code lost:
        r0 = r22.getState();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.runtime.Composer r38, int r39) {
        /*
            r37 = this;
            r0 = r37
            r15 = r38
            r1 = r39
            java.lang.String r2 = "C1204@54309L2201:AppBar.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r15, r2)
            r2 = r1 & 11
            r3 = 2
            if (r2 != r3) goto L_0x001c
            boolean r2 = r38.getSkipping()
            if (r2 != 0) goto L_0x0017
            goto L_0x001c
        L_0x0017:
            r38.skipToGroupEnd()
            goto L_0x0253
        L_0x001c:
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x002c
            r2 = -1
            java.lang.String r3 = "androidx.compose.material3.TwoRowsTopAppBar.<anonymous> (AppBar.kt:1203)"
            r4 = 1985938853(0x765f05a5, float:1.1308561E33)
            androidx.compose.runtime.ComposerKt.traceEventStart(r4, r1, r2, r3)
        L_0x002c:
            androidx.compose.foundation.layout.WindowInsets r11 = r0.$windowInsets
            kotlin.jvm.internal.Ref$FloatRef r10 = r0.$pinnedHeightPx
            androidx.compose.material3.TopAppBarColors r9 = r0.$colors
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> r14 = r0.$smallTitle
            androidx.compose.ui.text.TextStyle r13 = r0.$smallTitleTextStyle
            float r12 = r0.$topTitleAlpha
            boolean r7 = r0.$hideTopRowSemantics
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> r8 = r0.$navigationIcon
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> r5 = r0.$actionsRow
            int r6 = r0.$$dirty
            kotlin.jvm.internal.Ref$FloatRef r3 = r0.$maxHeightPx
            androidx.compose.material3.TopAppBarScrollBehavior r4 = r0.$scrollBehavior
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> r2 = r0.$title
            androidx.compose.ui.text.TextStyle r1 = r0.$titleTextStyle
            r16 = r14
            float r14 = r0.$bottomTitleAlpha
            r17 = r14
            kotlin.jvm.internal.Ref$IntRef r14 = r0.$titleBottomPaddingPx
            r18 = r14
            boolean r14 = r0.$hideBottomRowSemantics
            r0 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r15.startReplaceableGroup(r0)
            java.lang.String r0 = "CC(Column)P(2,3,1)77@3913L61,78@3979L133:Column.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformation(r15, r0)
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            androidx.compose.foundation.layout.Arrangement r19 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            r20 = r1
            androidx.compose.foundation.layout.Arrangement$Vertical r1 = r19.getTop()
            androidx.compose.ui.Alignment$Companion r19 = androidx.compose.ui.Alignment.Companion
            r39 = r2
            androidx.compose.ui.Alignment$Horizontal r2 = r19.getStart()
            r19 = r3
            r3 = 0
            androidx.compose.ui.layout.MeasurePolicy r1 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(r1, r2, r15, r3)
            r2 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r15.startReplaceableGroup(r2)
            java.lang.String r2 = "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh"
            androidx.compose.runtime.ComposerKt.sourceInformation(r15, r2)
            androidx.compose.runtime.ProvidableCompositionLocal r2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r2 = (androidx.compose.runtime.CompositionLocal) r2
            r3 = 2023513938(0x789c5f52, float:2.5372864E34)
            r22 = r4
            java.lang.String r4 = "C:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r15, r3, r4)
            java.lang.Object r2 = r15.consume(r2)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r38)
            androidx.compose.ui.unit.Density r2 = (androidx.compose.ui.unit.Density) r2
            androidx.compose.runtime.ProvidableCompositionLocal r23 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            r24 = r5
            r5 = r23
            androidx.compose.runtime.CompositionLocal r5 = (androidx.compose.runtime.CompositionLocal) r5
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r15, r3, r4)
            java.lang.Object r5 = r15.consume(r5)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r38)
            androidx.compose.ui.unit.LayoutDirection r5 = (androidx.compose.ui.unit.LayoutDirection) r5
            androidx.compose.runtime.ProvidableCompositionLocal r23 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            r25 = r6
            r6 = r23
            androidx.compose.runtime.CompositionLocal r6 = (androidx.compose.runtime.CompositionLocal) r6
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r15, r3, r4)
            java.lang.Object r3 = r15.consume(r6)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r38)
            androidx.compose.ui.platform.ViewConfiguration r3 = (androidx.compose.ui.platform.ViewConfiguration) r3
            androidx.compose.ui.node.ComposeUiNode$Companion r4 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function0 r4 = r4.getConstructor()
            kotlin.jvm.functions.Function3 r0 = androidx.compose.ui.layout.LayoutKt.materializerOf(r0)
            androidx.compose.runtime.Applier r6 = r38.getApplier()
            boolean r6 = r6 instanceof androidx.compose.runtime.Applier
            if (r6 != 0) goto L_0x00df
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x00df:
            r38.startReusableNode()
            boolean r6 = r38.getInserting()
            if (r6 == 0) goto L_0x00ec
            r15.createNode(r4)
            goto L_0x00ef
        L_0x00ec:
            r38.useNode()
        L_0x00ef:
            r38.disableReusing()
            androidx.compose.runtime.Composer r4 = androidx.compose.runtime.Updater.m2444constructorimpl(r38)
            androidx.compose.ui.node.ComposeUiNode$Companion r6 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r6 = r6.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r4, r1, r6)
            androidx.compose.ui.node.ComposeUiNode$Companion r1 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r1 = r1.getSetDensity()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r4, r2, r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r1 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r1 = r1.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r4, r5, r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r1 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r1 = r1.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r4, r3, r1)
            r38.enableReusing()
            androidx.compose.runtime.Composer r1 = androidx.compose.runtime.SkippableUpdater.m2436constructorimpl(r38)
            androidx.compose.runtime.SkippableUpdater r1 = androidx.compose.runtime.SkippableUpdater.m2435boximpl(r1)
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.invoke(r1, r15, r2)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r15.startReplaceableGroup(r0)
            r0 = 276693704(0x107e02c8, float:5.009481E-29)
            java.lang.String r1 = "C79@4027L9:Column.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r15, r0, r1)
            androidx.compose.foundation.layout.ColumnScopeInstance r0 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE
            androidx.compose.foundation.layout.ColumnScope r0 = (androidx.compose.foundation.layout.ColumnScope) r0
            r0 = 1863905175(0x6f18ef97, float:4.733137E28)
            java.lang.String r1 = "C1205@54330L982,1226@55325L1175:AppBar.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r15, r0, r1)
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.WindowInsetsPaddingKt.windowInsetsPadding(r0, r11)
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.draw.ClipKt.clipToBounds(r0)
            r0 = r20
            float r2 = r10.element
            r21 = r39
            long r3 = r9.m1848getNavigationIconContentColor0d7_KjU$material3_release()
            r5 = r19
            long r19 = r9.m1849getTitleContentColor0d7_KjU$material3_release()
            r26 = r5
            r23 = r24
            r24 = r25
            r5 = r19
            long r19 = r9.m1847getActionIconContentColor0d7_KjU$material3_release()
            r25 = r7
            r27 = r8
            r7 = r19
            androidx.compose.foundation.layout.Arrangement r19 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical r19 = r19.getCenter()
            androidx.compose.foundation.layout.Arrangement$Vertical r19 = (androidx.compose.foundation.layout.Arrangement.Vertical) r19
            r28 = r12
            r12 = r19
            androidx.compose.foundation.layout.Arrangement r19 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            androidx.compose.foundation.layout.Arrangement$Horizontal r19 = r19.getStart()
            r29 = r13
            r13 = r19
            r19 = 0
            r39 = r0
            r31 = r14
            r30 = r17
            r0 = r18
            r14 = r19
            int r17 = r24 << 3
            r32 = 458752(0x70000, float:6.42848E-40)
            r18 = r17 & r32
            r33 = 905969664(0x36000000, float:1.9073486E-6)
            r18 = r18 | r33
            r34 = 3670016(0x380000, float:5.142788E-39)
            r17 = r17 & r34
            r19 = r18 | r17
            int r14 = r24 >> 12
            r14 = r14 & 896(0x380, float:1.256E-42)
            r14 = r14 | 3078(0xc06, float:4.313E-42)
            r20 = r14
            r35 = r9
            r9 = r16
            r14 = r10
            r10 = r29
            r36 = r11
            r11 = r28
            r15 = r25
            r16 = r27
            r17 = r23
            r18 = r38
            r23 = r0
            r0 = r14
            r14 = 0
            androidx.compose.material3.AppBarKt.m1125TopAppBarLayoutkXwM9vE(r1, r2, r3, r5, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
            androidx.compose.foundation.layout.WindowInsetsSides$Companion r2 = androidx.compose.foundation.layout.WindowInsetsSides.Companion
            int r2 = r2.m607getHorizontalJoeWqyM()
            r3 = r36
            androidx.compose.foundation.layout.WindowInsets r2 = androidx.compose.foundation.layout.WindowInsetsKt.m583onlybOOhFvg(r3, r2)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.WindowInsetsPaddingKt.windowInsetsPadding(r1, r2)
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.draw.ClipKt.clipToBounds(r1)
            r2 = r26
            float r2 = r2.element
            float r0 = r0.element
            float r2 = r2 - r0
            if (r22 == 0) goto L_0x01f5
            androidx.compose.material3.TopAppBarState r0 = r22.getState()
            if (r0 == 0) goto L_0x01f5
            float r0 = r0.getHeightOffset()
            goto L_0x01f6
        L_0x01f5:
            r0 = 0
        L_0x01f6:
            float r2 = r2 + r0
            long r3 = r35.m1848getNavigationIconContentColor0d7_KjU$material3_release()
            long r5 = r35.m1849getTitleContentColor0d7_KjU$material3_release()
            long r7 = r35.m1847getActionIconContentColor0d7_KjU$material3_release()
            androidx.compose.foundation.layout.Arrangement r0 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            androidx.compose.foundation.layout.Arrangement$Vertical r12 = r0.getBottom()
            androidx.compose.foundation.layout.Arrangement r0 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            androidx.compose.foundation.layout.Arrangement$Horizontal r13 = r0.getStart()
            r0 = r23
            int r14 = r0.element
            androidx.compose.material3.ComposableSingletons$AppBarKt r0 = androidx.compose.material3.ComposableSingletons$AppBarKt.INSTANCE
            kotlin.jvm.functions.Function2 r16 = r0.m1250getLambda11$material3_release()
            androidx.compose.material3.ComposableSingletons$AppBarKt r0 = androidx.compose.material3.ComposableSingletons$AppBarKt.INSTANCE
            kotlin.jvm.functions.Function2 r17 = r0.m1251getLambda12$material3_release()
            int r0 = r24 << 12
            r9 = r0 & r32
            r9 = r9 | r33
            r0 = r0 & r34
            r19 = r9 | r0
            r20 = 3456(0xd80, float:4.843E-42)
            r9 = r21
            r10 = r39
            r11 = r30
            r15 = r31
            r18 = r38
            androidx.compose.material3.AppBarKt.m1125TopAppBarLayoutkXwM9vE(r1, r2, r3, r5, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r38)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r38)
            r38.endReplaceableGroup()
            r38.endNode()
            r38.endReplaceableGroup()
            r38.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0253
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0253:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$3.invoke(androidx.compose.runtime.Composer, int):void");
    }
}
