package androidx.compose.material3;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001aQ\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0002\u0010\u000f\u001a6\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00040\bH\u0002\u001aE\u0010\u0018\u001a\u00020\n*\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u001bH\u0003¢\u0006\u0002\u0010\u001e\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"ExposedDropdownMenuItemHorizontalPadding", "Landroidx/compose/ui/unit/Dp;", "F", "ExposedDropdownMenuBox", "", "expanded", "", "onExpandedChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Landroidx/compose/material3/ExposedDropdownMenuBoxScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "updateHeight", "view", "Landroid/view/View;", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "verticalMarginInPx", "", "onHeightUpdate", "expandable", "Lkotlin/Function0;", "menuDescription", "", "expandedDescription", "collapsedDescription", "(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: ExposedDropdownMenu.kt */
public final class ExposedDropdownMenuKt {
    /* access modifiers changed from: private */
    public static final float ExposedDropdownMenuItemHorizontalPadding = Dp.m5626constructorimpl((float) 16);

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0364  */
    /* JADX WARNING: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void ExposedDropdownMenuBox(boolean r23, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r24, androidx.compose.ui.Modifier r25, kotlin.jvm.functions.Function3<? super androidx.compose.material3.ExposedDropdownMenuBoxScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r26, androidx.compose.runtime.Composer r27, int r28, int r29) {
        /*
            r11 = r23
            r12 = r24
            r13 = r26
            r14 = r28
            java.lang.String r0 = "onExpandedChange"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r0 = -1990697039(0xffffffff89585fb1, float:-2.6045048E-33)
            r1 = r27
            androidx.compose.runtime.Composer r15 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(ExposedDropdownMenuBox)P(1,3,2)106@5045L7,107@5078L7,108@5103L30,109@5156L30,111@5287L37,113@5351L29,115@5398L1392,149@6796L45,153@6858L59,153@6847L70,157@6923L379:ExposedDropdownMenu.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r15, r1)
            r1 = r29 & 1
            r2 = 2
            if (r1 == 0) goto L_0x002a
            r1 = r14 | 6
            goto L_0x003a
        L_0x002a:
            r1 = r14 & 14
            if (r1 != 0) goto L_0x0039
            boolean r1 = r15.changed((boolean) r11)
            if (r1 == 0) goto L_0x0036
            r1 = 4
            goto L_0x0037
        L_0x0036:
            r1 = r2
        L_0x0037:
            r1 = r1 | r14
            goto L_0x003a
        L_0x0039:
            r1 = r14
        L_0x003a:
            r3 = r29 & 2
            if (r3 == 0) goto L_0x0041
            r1 = r1 | 48
            goto L_0x0051
        L_0x0041:
            r3 = r14 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0051
            boolean r3 = r15.changedInstance(r12)
            if (r3 == 0) goto L_0x004e
            r3 = 32
            goto L_0x0050
        L_0x004e:
            r3 = 16
        L_0x0050:
            r1 = r1 | r3
        L_0x0051:
            r3 = r29 & 4
            if (r3 == 0) goto L_0x0058
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x006b
        L_0x0058:
            r4 = r14 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x006b
            r4 = r25
            boolean r5 = r15.changed((java.lang.Object) r4)
            if (r5 == 0) goto L_0x0067
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0069
        L_0x0067:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0069:
            r1 = r1 | r5
            goto L_0x006d
        L_0x006b:
            r4 = r25
        L_0x006d:
            r5 = r29 & 8
            if (r5 == 0) goto L_0x0074
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0084
        L_0x0074:
            r5 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x0084
            boolean r5 = r15.changedInstance(r13)
            if (r5 == 0) goto L_0x0081
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x0083
        L_0x0081:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x0083:
            r1 = r1 | r5
        L_0x0084:
            r10 = r1
            r1 = r10 & 5851(0x16db, float:8.199E-42)
            r5 = 1170(0x492, float:1.64E-42)
            if (r1 != r5) goto L_0x0099
            boolean r1 = r15.getSkipping()
            if (r1 != 0) goto L_0x0092
            goto L_0x0099
        L_0x0092:
            r15.skipToGroupEnd()
            r3 = r4
            r1 = r11
            goto L_0x035d
        L_0x0099:
            if (r3 == 0) goto L_0x00a2
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
            r16 = r1
            goto L_0x00a4
        L_0x00a2:
            r16 = r4
        L_0x00a4:
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x00b1
            r1 = -1
            java.lang.String r3 = "androidx.compose.material3.ExposedDropdownMenuBox (ExposedDropdownMenu.kt:100)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r10, r1, r3)
        L_0x00b1:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r0 = (androidx.compose.runtime.CompositionLocal) r0
            r9 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r1 = "CC:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r15, r9, r1)
            java.lang.Object r0 = r15.consume(r0)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r15)
            r8 = r0
            androidx.compose.ui.unit.Density r8 = (androidx.compose.ui.unit.Density) r8
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalView()
            androidx.compose.runtime.CompositionLocal r0 = (androidx.compose.runtime.CompositionLocal) r0
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r15, r9, r1)
            java.lang.Object r0 = r15.consume(r0)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r15)
            r7 = r0
            android.view.View r7 = (android.view.View) r7
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r15.startReplaceableGroup(r0)
            java.lang.String r1 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r15, r1)
            java.lang.Object r3 = r15.rememberedValue()
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r4 = r4.getEmpty()
            r5 = 0
            r6 = 0
            if (r3 != r4) goto L_0x0100
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            androidx.compose.runtime.MutableState r3 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r3, r5, r2, r5)
            r15.updateRememberedValue(r3)
        L_0x0100:
            r15.endReplaceableGroup()
            r17 = r3
            androidx.compose.runtime.MutableState r17 = (androidx.compose.runtime.MutableState) r17
            r15.startReplaceableGroup(r0)
            androidx.compose.runtime.ComposerKt.sourceInformation(r15, r1)
            java.lang.Object r3 = r15.rememberedValue()
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r4 = r4.getEmpty()
            if (r3 != r4) goto L_0x0124
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            androidx.compose.runtime.MutableState r3 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r3, r5, r2, r5)
            r15.updateRememberedValue(r3)
        L_0x0124:
            r15.endReplaceableGroup()
            r5 = r3
            androidx.compose.runtime.MutableState r5 = (androidx.compose.runtime.MutableState) r5
            float r2 = androidx.compose.material3.MenuKt.getMenuVerticalMargin()
            int r4 = r8.m5601roundToPx0680j_4(r2)
            r15.startReplaceableGroup(r0)
            androidx.compose.runtime.ComposerKt.sourceInformation(r15, r1)
            java.lang.Object r2 = r15.rememberedValue()
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r3 = r3.getEmpty()
            if (r2 != r3) goto L_0x014c
            androidx.compose.ui.node.Ref r2 = new androidx.compose.ui.node.Ref
            r2.<init>()
            r15.updateRememberedValue(r2)
        L_0x014c:
            r15.endReplaceableGroup()
            r3 = r2
            androidx.compose.ui.node.Ref r3 = (androidx.compose.ui.node.Ref) r3
            r15.startReplaceableGroup(r0)
            androidx.compose.runtime.ComposerKt.sourceInformation(r15, r1)
            java.lang.Object r0 = r15.rememberedValue()
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r0 != r1) goto L_0x016c
            androidx.compose.ui.focus.FocusRequester r0 = new androidx.compose.ui.focus.FocusRequester
            r0.<init>()
            r15.updateRememberedValue(r0)
        L_0x016c:
            r15.endReplaceableGroup()
            r2 = r0
            androidx.compose.ui.focus.FocusRequester r2 = (androidx.compose.ui.focus.FocusRequester) r2
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r23)
            int r1 = ExposedDropdownMenuBox$lambda$4(r5)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r18 = ExposedDropdownMenuBox$lambda$1(r17)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r18)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r12, r8, r1, r6}
            r1 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r15.startReplaceableGroup(r1)
            java.lang.String r1 = "CC(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r15, r1)
            r1 = 0
            r6 = 0
        L_0x0197:
            r9 = 5
            if (r1 >= r9) goto L_0x01a4
            r9 = r0[r1]
            boolean r9 = r15.changed((java.lang.Object) r9)
            r6 = r6 | r9
            int r1 = r1 + 1
            goto L_0x0197
        L_0x01a4:
            java.lang.Object r0 = r15.rememberedValue()
            if (r6 != 0) goto L_0x01c2
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r0 != r1) goto L_0x01b3
            goto L_0x01c2
        L_0x01b3:
            r12 = r2
            r18 = r3
            r19 = r4
            r20 = r5
            r21 = r7
            r17 = r10
            r11 = 2023513938(0x789c5f52, float:2.5372864E34)
            goto L_0x01f0
        L_0x01c2:
            androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1 r9 = new androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1
            r0 = r9
            r1 = r23
            r6 = r2
            r2 = r24
            r18 = r3
            r3 = r10
            r19 = r4
            r4 = r6
            r20 = r5
            r5 = r18
            r12 = r6
            r14 = 0
            r6 = r7
            r21 = r7
            r7 = r19
            r22 = r8
            r8 = r17
            r14 = r9
            r11 = 2023513938(0x789c5f52, float:2.5372864E34)
            r9 = r20
            r17 = r10
            r10 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r15.updateRememberedValue(r14)
            r0 = r14
        L_0x01f0:
            r15.endReplaceableGroup()
            androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1 r0 = (androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1) r0
            int r1 = r17 >> 6
            r2 = r1 & 14
            r3 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r15.startReplaceableGroup(r3)
            java.lang.String r3 = "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformation(r15, r3)
            androidx.compose.ui.Alignment$Companion r3 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment r3 = r3.getTopStart()
            int r4 = r2 >> 3
            r5 = r4 & 14
            r4 = r4 & 112(0x70, float:1.57E-43)
            r4 = r4 | r5
            r5 = 0
            androidx.compose.ui.layout.MeasurePolicy r3 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(r3, r5, r15, r4)
            int r2 = r2 << 3
            r2 = r2 & 112(0x70, float:1.57E-43)
            r4 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r15.startReplaceableGroup(r4)
            java.lang.String r4 = "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh"
            androidx.compose.runtime.ComposerKt.sourceInformation(r15, r4)
            androidx.compose.runtime.ProvidableCompositionLocal r4 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r4 = (androidx.compose.runtime.CompositionLocal) r4
            java.lang.String r5 = "C:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r15, r11, r5)
            java.lang.Object r4 = r15.consume(r4)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r15)
            androidx.compose.ui.unit.Density r4 = (androidx.compose.ui.unit.Density) r4
            androidx.compose.runtime.ProvidableCompositionLocal r6 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            androidx.compose.runtime.CompositionLocal r6 = (androidx.compose.runtime.CompositionLocal) r6
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r15, r11, r5)
            java.lang.Object r6 = r15.consume(r6)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r15)
            androidx.compose.ui.unit.LayoutDirection r6 = (androidx.compose.ui.unit.LayoutDirection) r6
            androidx.compose.runtime.ProvidableCompositionLocal r7 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            androidx.compose.runtime.CompositionLocal r7 = (androidx.compose.runtime.CompositionLocal) r7
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r15, r11, r5)
            java.lang.Object r5 = r15.consume(r7)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r15)
            androidx.compose.ui.platform.ViewConfiguration r5 = (androidx.compose.ui.platform.ViewConfiguration) r5
            androidx.compose.ui.node.ComposeUiNode$Companion r7 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function0 r7 = r7.getConstructor()
            kotlin.jvm.functions.Function3 r8 = androidx.compose.ui.layout.LayoutKt.materializerOf(r16)
            int r2 = r2 << 9
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | 6
            androidx.compose.runtime.Applier r9 = r15.getApplier()
            boolean r9 = r9 instanceof androidx.compose.runtime.Applier
            if (r9 != 0) goto L_0x0278
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x0278:
            r15.startReusableNode()
            boolean r9 = r15.getInserting()
            if (r9 == 0) goto L_0x0285
            r15.createNode(r7)
            goto L_0x0288
        L_0x0285:
            r15.useNode()
        L_0x0288:
            r15.disableReusing()
            androidx.compose.runtime.Composer r7 = androidx.compose.runtime.Updater.m2444constructorimpl(r15)
            androidx.compose.ui.node.ComposeUiNode$Companion r9 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r9 = r9.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r7, r3, r9)
            androidx.compose.ui.node.ComposeUiNode$Companion r3 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r3 = r3.getSetDensity()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r7, r4, r3)
            androidx.compose.ui.node.ComposeUiNode$Companion r3 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r3 = r3.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r7, r6, r3)
            androidx.compose.ui.node.ComposeUiNode$Companion r3 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r3 = r3.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r7, r5, r3)
            r15.enableReusing()
            androidx.compose.runtime.Composer r3 = androidx.compose.runtime.SkippableUpdater.m2436constructorimpl(r15)
            androidx.compose.runtime.SkippableUpdater r3 = androidx.compose.runtime.SkippableUpdater.m2435boximpl(r3)
            int r2 = r2 >> 3
            r2 = r2 & 112(0x70, float:1.57E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r8.invoke(r3, r15, r2)
            r2 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r15.startReplaceableGroup(r2)
            r2 = -1253629305(0xffffffffb5472287, float:-7.418352E-7)
            java.lang.String r3 = "C72@3384L9:Box.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r15, r2, r3)
            androidx.compose.foundation.layout.BoxScopeInstance r2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE
            androidx.compose.foundation.layout.BoxScope r2 = (androidx.compose.foundation.layout.BoxScope) r2
            r2 = 1004941959(0x3be63287, float:0.0070250663)
            java.lang.String r3 = "C150@6826L9:ExposedDropdownMenu.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r15, r2, r3)
            r1 = r1 & 112(0x70, float:1.57E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r13.invoke(r0, r15, r1)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r15)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r15)
            r15.endReplaceableGroup()
            r15.endNode()
            r15.endReplaceableGroup()
            r15.endReplaceableGroup()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r23)
            r1 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r15.startReplaceableGroup(r1)
            java.lang.String r1 = "CC(remember)P(1,2):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r15, r1)
            boolean r0 = r15.changed((java.lang.Object) r0)
            boolean r1 = r15.changed((java.lang.Object) r12)
            r0 = r0 | r1
            java.lang.Object r1 = r15.rememberedValue()
            if (r0 != 0) goto L_0x0329
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r0 = r0.getEmpty()
            if (r1 != r0) goto L_0x0325
            goto L_0x0329
        L_0x0325:
            r0 = r1
            r1 = r23
            goto L_0x0335
        L_0x0329:
            androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$2$1 r0 = new androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$2$1
            r1 = r23
            r0.<init>(r1, r12)
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            r15.updateRememberedValue(r0)
        L_0x0335:
            r15.endReplaceableGroup()
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            r2 = 0
            androidx.compose.runtime.EffectsKt.SideEffect(r0, r15, r2)
            androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$3 r0 = new androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$3
            r5 = r18
            r4 = r19
            r3 = r20
            r2 = r21
            r0.<init>(r2, r5, r4, r3)
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r3 = 8
            androidx.compose.runtime.EffectsKt.DisposableEffect((java.lang.Object) r2, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) r0, (androidx.compose.runtime.Composer) r15, (int) r3)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x035b
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x035b:
            r3 = r16
        L_0x035d:
            androidx.compose.runtime.ScopeUpdateScope r7 = r15.endRestartGroup()
            if (r7 != 0) goto L_0x0364
            goto L_0x0379
        L_0x0364:
            androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$4 r8 = new androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$4
            r0 = r8
            r1 = r23
            r2 = r24
            r4 = r26
            r5 = r28
            r6 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6)
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            r7.updateScope(r8)
        L_0x0379:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ExposedDropdownMenuKt.ExposedDropdownMenuBox(boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final int ExposedDropdownMenuBox$lambda$1(MutableState<Integer> mutableState) {
        return ((Number) mutableState.getValue()).intValue();
    }

    /* access modifiers changed from: private */
    public static final void ExposedDropdownMenuBox$lambda$2(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* access modifiers changed from: private */
    public static final int ExposedDropdownMenuBox$lambda$4(MutableState<Integer> mutableState) {
        return ((Number) mutableState.getValue()).intValue();
    }

    /* access modifiers changed from: private */
    public static final void ExposedDropdownMenuBox$lambda$5(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* access modifiers changed from: private */
    public static final Modifier expandable(Modifier modifier, boolean z, Function0<Unit> function0, String str, String str2, String str3, Composer composer, int i, int i2) {
        Function0<Unit> function02 = function0;
        Composer composer2 = composer;
        composer2.startReplaceableGroup(1006563320);
        ComposerKt.sourceInformation(composer2, "C(expandable)P(1,4,3,2)1017@60116L38,1018@60190L31,1019@60258L32,1020@60315L365,1030@60691L187:ExposedDropdownMenu.kt#uh7d8r");
        String r4 = (i2 & 4) != 0 ? Strings_androidKt.m1632getStringNWtq28(Strings.Companion.m1609getExposedDropdownMenuadMyvUU(), composer2, 6) : str;
        String r3 = (i2 & 8) != 0 ? Strings_androidKt.m1632getStringNWtq28(Strings.Companion.m1611getMenuExpandedadMyvUU(), composer2, 6) : str2;
        String r7 = (i2 & 16) != 0 ? Strings_androidKt.m1632getStringNWtq28(Strings.Companion.m1610getMenuCollapsedadMyvUU(), composer2, 6) : str3;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1006563320, i, -1, "androidx.compose.material3.expandable (ExposedDropdownMenu.kt:1014)");
        }
        Unit unit = Unit.INSTANCE;
        composer2.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed = composer2.changed((Object) function0);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new ExposedDropdownMenuKt$expandable$1$1(function0, (Continuation<? super ExposedDropdownMenuKt$expandable$1$1>) null);
            composer2.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Modifier modifier2 = modifier;
        Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(modifier, (Object) unit, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) (Function2) rememberedValue);
        Object[] objArr = {Boolean.valueOf(z), r3, r7, r4, function0};
        composer2.startReplaceableGroup(-568225417);
        ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean z2 = false;
        for (int i3 = 0; i3 < 5; i3++) {
            z2 |= composer2.changed(objArr[i3]);
        }
        Object rememberedValue2 = composer.rememberedValue();
        if (z2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new ExposedDropdownMenuKt$expandable$2$1(z, r3, r7, r4, function0);
            composer2.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        Modifier semantics$default = SemanticsModifierKt.semantics$default(pointerInput, false, (Function1) rememberedValue2, 1, (Object) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return semantics$default;
    }

    /* access modifiers changed from: private */
    public static final void updateHeight(View view, LayoutCoordinates layoutCoordinates, int i, Function1<? super Integer, Unit> function1) {
        if (layoutCoordinates != null) {
            Rect rect = new Rect();
            view.getWindowVisibleDisplayFrame(rect);
            function1.invoke(Integer.valueOf(((int) Math.max(LayoutCoordinatesKt.boundsInWindow(layoutCoordinates).getTop() - ((float) rect.top), ((float) (rect.bottom - rect.top)) - LayoutCoordinatesKt.boundsInWindow(layoutCoordinates).getBottom())) - i));
        }
    }
}
