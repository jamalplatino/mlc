package androidx.compose.material3;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aU\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102 \b\u0002\u0010\u0012\u001a\u001a\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\f\u0018\u00010\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001aS\u0010\u0019\u001a\u00020\f2\u001c\u0010\u001a\u001a\u0018\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\f0\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010\r\u001a\u00020\u000e2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\f0\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010\u001c\"\u0019\u0010\u0000\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\"\u0019\u0010\u0005\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0006\u0010\u0003\"\u0019\u0010\u0007\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\b\u0010\u0003\"\u0019\u0010\t\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\n\u0010\u0003\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"BadgeOffset", "Landroidx/compose/ui/unit/Dp;", "getBadgeOffset", "()F", "F", "BadgeWithContentHorizontalOffset", "getBadgeWithContentHorizontalOffset", "BadgeWithContentHorizontalPadding", "getBadgeWithContentHorizontalPadding", "BadgeWithContentVerticalOffset", "getBadgeWithContentVerticalOffset", "Badge", "", "modifier", "Landroidx/compose/ui/Modifier;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "Badge-eopBjH0", "(Landroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "BadgedBox", "badge", "Landroidx/compose/foundation/layout/BoxScope;", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Badge.kt */
public final class BadgeKt {
    private static final float BadgeOffset = Dp.m5626constructorimpl((float) 0);
    private static final float BadgeWithContentHorizontalOffset;
    private static final float BadgeWithContentHorizontalPadding;
    private static final float BadgeWithContentVerticalOffset;

    public static final float getBadgeOffset() {
        return BadgeOffset;
    }

    public static final float getBadgeWithContentHorizontalOffset() {
        return BadgeWithContentHorizontalOffset;
    }

    public static final float getBadgeWithContentHorizontalPadding() {
        return BadgeWithContentHorizontalPadding;
    }

    public static final float getBadgeWithContentVerticalOffset() {
        return BadgeWithContentVerticalOffset;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0389  */
    /* JADX WARNING: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void BadgedBox(kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.BoxScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r19, androidx.compose.ui.Modifier r20, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.BoxScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r21, androidx.compose.runtime.Composer r22, int r23, int r24) {
        /*
            r1 = r19
            r3 = r21
            r4 = r23
            java.lang.String r0 = "badge"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r2 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            r2 = 1404022535(0x53afaf07, float:1.5091115E12)
            r5 = r22
            androidx.compose.runtime.Composer r5 = r5.startRestartGroup(r2)
            java.lang.String r6 = "C(BadgedBox)P(!1,2)66@2566L2114:Badge.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r5, r6)
            r6 = r24 & 1
            if (r6 == 0) goto L_0x0027
            r6 = r4 | 6
            goto L_0x0037
        L_0x0027:
            r6 = r4 & 14
            if (r6 != 0) goto L_0x0036
            boolean r6 = r5.changedInstance(r1)
            if (r6 == 0) goto L_0x0033
            r6 = 4
            goto L_0x0034
        L_0x0033:
            r6 = 2
        L_0x0034:
            r6 = r6 | r4
            goto L_0x0037
        L_0x0036:
            r6 = r4
        L_0x0037:
            r7 = r24 & 2
            if (r7 == 0) goto L_0x003e
            r6 = r6 | 48
            goto L_0x0051
        L_0x003e:
            r8 = r4 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x0051
            r8 = r20
            boolean r9 = r5.changed((java.lang.Object) r8)
            if (r9 == 0) goto L_0x004d
            r9 = 32
            goto L_0x004f
        L_0x004d:
            r9 = 16
        L_0x004f:
            r6 = r6 | r9
            goto L_0x0053
        L_0x0051:
            r8 = r20
        L_0x0053:
            r9 = r24 & 4
            if (r9 == 0) goto L_0x005a
            r6 = r6 | 384(0x180, float:5.38E-43)
            goto L_0x006a
        L_0x005a:
            r9 = r4 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x006a
            boolean r9 = r5.changedInstance(r3)
            if (r9 == 0) goto L_0x0067
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0069
        L_0x0067:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0069:
            r6 = r6 | r9
        L_0x006a:
            r9 = r6 & 731(0x2db, float:1.024E-42)
            r10 = 146(0x92, float:2.05E-43)
            if (r9 != r10) goto L_0x007f
            boolean r9 = r5.getSkipping()
            if (r9 != 0) goto L_0x0077
            goto L_0x007f
        L_0x0077:
            r5.skipToGroupEnd()
            r2 = r1
            r18 = r8
            goto L_0x0382
        L_0x007f:
            if (r7 == 0) goto L_0x0086
            androidx.compose.ui.Modifier$Companion r7 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r7 = (androidx.compose.ui.Modifier) r7
            goto L_0x0087
        L_0x0086:
            r7 = r8
        L_0x0087:
            boolean r8 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r8 == 0) goto L_0x0094
            r8 = -1
            java.lang.String r9 = "androidx.compose.material3.BadgedBox (Badge.kt:61)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r6, r8, r9)
        L_0x0094:
            androidx.compose.material3.BadgeKt$BadgedBox$2 r2 = androidx.compose.material3.BadgeKt$BadgedBox$2.INSTANCE
            androidx.compose.ui.layout.MeasurePolicy r2 = (androidx.compose.ui.layout.MeasurePolicy) r2
            r8 = r6 & 112(0x70, float:1.57E-43)
            r9 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r5.startReplaceableGroup(r9)
            java.lang.String r10 = "CC(Layout)P(!1,2)73@2855L7,74@2910L7,75@2969L7,76@2981L460:Layout.kt#80mrfh"
            androidx.compose.runtime.ComposerKt.sourceInformation(r5, r10)
            androidx.compose.runtime.ProvidableCompositionLocal r10 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r10 = (androidx.compose.runtime.CompositionLocal) r10
            r11 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r12 = "CC:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r5, r11, r12)
            java.lang.Object r10 = r5.consume(r10)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r5)
            androidx.compose.ui.unit.Density r10 = (androidx.compose.ui.unit.Density) r10
            androidx.compose.runtime.ProvidableCompositionLocal r13 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            androidx.compose.runtime.CompositionLocal r13 = (androidx.compose.runtime.CompositionLocal) r13
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r5, r11, r12)
            java.lang.Object r13 = r5.consume(r13)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r5)
            androidx.compose.ui.unit.LayoutDirection r13 = (androidx.compose.ui.unit.LayoutDirection) r13
            androidx.compose.runtime.ProvidableCompositionLocal r14 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            androidx.compose.runtime.CompositionLocal r14 = (androidx.compose.runtime.CompositionLocal) r14
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r5, r11, r12)
            java.lang.Object r12 = r5.consume(r14)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r5)
            androidx.compose.ui.platform.ViewConfiguration r12 = (androidx.compose.ui.platform.ViewConfiguration) r12
            androidx.compose.ui.node.ComposeUiNode$Companion r14 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function0 r14 = r14.getConstructor()
            kotlin.jvm.functions.Function3 r15 = androidx.compose.ui.layout.LayoutKt.materializerOf(r7)
            int r8 = r8 << 9
            r8 = r8 & 7168(0x1c00, float:1.0045E-41)
            r8 = r8 | 6
            androidx.compose.runtime.Applier r11 = r5.getApplier()
            boolean r11 = r11 instanceof androidx.compose.runtime.Applier
            if (r11 != 0) goto L_0x00fb
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x00fb:
            r5.startReusableNode()
            boolean r11 = r5.getInserting()
            if (r11 == 0) goto L_0x0108
            r5.createNode(r14)
            goto L_0x010b
        L_0x0108:
            r5.useNode()
        L_0x010b:
            androidx.compose.runtime.Composer r11 = androidx.compose.runtime.Updater.m2444constructorimpl(r5)
            androidx.compose.ui.node.ComposeUiNode$Companion r14 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r14 = r14.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r11, r2, r14)
            androidx.compose.ui.node.ComposeUiNode$Companion r2 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r2 = r2.getSetDensity()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r11, r10, r2)
            androidx.compose.ui.node.ComposeUiNode$Companion r2 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r2 = r2.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r11, r13, r2)
            androidx.compose.ui.node.ComposeUiNode$Companion r2 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r2 = r2.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r11, r12, r2)
            androidx.compose.runtime.Composer r2 = androidx.compose.runtime.SkippableUpdater.m2436constructorimpl(r5)
            androidx.compose.runtime.SkippableUpdater r2 = androidx.compose.runtime.SkippableUpdater.m2435boximpl(r2)
            int r8 = r8 >> 3
            r8 = r8 & 112(0x70, float:1.57E-43)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r15.invoke(r2, r5, r8)
            r2 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r5.startReplaceableGroup(r2)
            r8 = 1541063998(0x5bdac53e, float:1.2315683E17)
            java.lang.String r10 = "C68@2596L161,73@2770L105:Badge.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r5, r8, r10)
            androidx.compose.ui.Modifier$Companion r8 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r8 = (androidx.compose.ui.Modifier) r8
            java.lang.String r10 = "anchor"
            androidx.compose.ui.Modifier r8 = androidx.compose.ui.layout.LayoutIdKt.layoutId(r8, r10)
            androidx.compose.ui.Alignment$Companion r10 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment r10 = r10.getCenter()
            int r11 = r6 << 3
            r11 = r11 & 7168(0x1c00, float:1.0045E-41)
            r11 = r11 | 54
            r12 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r5.startReplaceableGroup(r12)
            java.lang.String r13 = "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformation(r5, r13)
            int r14 = r11 >> 3
            r15 = r14 & 14
            r14 = r14 & 112(0x70, float:1.57E-43)
            r14 = r14 | r15
            r15 = 0
            androidx.compose.ui.layout.MeasurePolicy r10 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(r10, r15, r5, r14)
            int r14 = r11 << 3
            r14 = r14 & 112(0x70, float:1.57E-43)
            r5.startReplaceableGroup(r9)
            java.lang.String r9 = "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh"
            androidx.compose.runtime.ComposerKt.sourceInformation(r5, r9)
            androidx.compose.runtime.ProvidableCompositionLocal r16 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            r15 = r16
            androidx.compose.runtime.CompositionLocal r15 = (androidx.compose.runtime.CompositionLocal) r15
            java.lang.String r12 = "C:CompositionLocal.kt#9igjgp"
            r2 = 2023513938(0x789c5f52, float:2.5372864E34)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r5, r2, r12)
            java.lang.Object r15 = r5.consume(r15)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r5)
            androidx.compose.ui.unit.Density r15 = (androidx.compose.ui.unit.Density) r15
            androidx.compose.runtime.ProvidableCompositionLocal r17 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            r4 = r17
            androidx.compose.runtime.CompositionLocal r4 = (androidx.compose.runtime.CompositionLocal) r4
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r5, r2, r12)
            java.lang.Object r4 = r5.consume(r4)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r5)
            androidx.compose.ui.unit.LayoutDirection r4 = (androidx.compose.ui.unit.LayoutDirection) r4
            androidx.compose.runtime.ProvidableCompositionLocal r17 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            r18 = r7
            r7 = r17
            androidx.compose.runtime.CompositionLocal r7 = (androidx.compose.runtime.CompositionLocal) r7
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r5, r2, r12)
            java.lang.Object r2 = r5.consume(r7)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r5)
            androidx.compose.ui.platform.ViewConfiguration r2 = (androidx.compose.ui.platform.ViewConfiguration) r2
            androidx.compose.ui.node.ComposeUiNode$Companion r7 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function0 r7 = r7.getConstructor()
            kotlin.jvm.functions.Function3 r8 = androidx.compose.ui.layout.LayoutKt.materializerOf(r8)
            int r14 = r14 << 9
            r14 = r14 & 7168(0x1c00, float:1.0045E-41)
            r14 = r14 | 6
            androidx.compose.runtime.Applier r1 = r5.getApplier()
            boolean r1 = r1 instanceof androidx.compose.runtime.Applier
            if (r1 != 0) goto L_0x01ec
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x01ec:
            r5.startReusableNode()
            boolean r1 = r5.getInserting()
            if (r1 == 0) goto L_0x01f9
            r5.createNode(r7)
            goto L_0x01fc
        L_0x01f9:
            r5.useNode()
        L_0x01fc:
            r5.disableReusing()
            androidx.compose.runtime.Composer r1 = androidx.compose.runtime.Updater.m2444constructorimpl(r5)
            androidx.compose.ui.node.ComposeUiNode$Companion r7 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r7 = r7.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r1, r10, r7)
            androidx.compose.ui.node.ComposeUiNode$Companion r7 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r7 = r7.getSetDensity()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r1, r15, r7)
            androidx.compose.ui.node.ComposeUiNode$Companion r7 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r7 = r7.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r1, r4, r7)
            androidx.compose.ui.node.ComposeUiNode$Companion r4 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r4 = r4.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r1, r2, r4)
            r5.enableReusing()
            androidx.compose.runtime.Composer r1 = androidx.compose.runtime.SkippableUpdater.m2436constructorimpl(r5)
            androidx.compose.runtime.SkippableUpdater r1 = androidx.compose.runtime.SkippableUpdater.m2435boximpl(r1)
            int r2 = r14 >> 3
            r2 = r2 & 112(0x70, float:1.57E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r8.invoke(r1, r5, r2)
            r1 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r5.startReplaceableGroup(r1)
            r1 = -1253629305(0xffffffffb5472287, float:-7.418352E-7)
            java.lang.String r2 = "C72@3384L9:Box.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r5, r1, r2)
            androidx.compose.foundation.layout.BoxScopeInstance r4 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE
            int r7 = r11 >> 6
            r7 = r7 & 112(0x70, float:1.57E-43)
            r7 = r7 | 6
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r3.invoke(r4, r5, r7)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r5)
            r5.endReplaceableGroup()
            r5.endNode()
            r5.endReplaceableGroup()
            r5.endReplaceableGroup()
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r4 = (androidx.compose.ui.Modifier) r4
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.layout.LayoutIdKt.layoutId(r4, r0)
            int r4 = r6 << 9
            r4 = r4 & 7168(0x1c00, float:1.0045E-41)
            r4 = r4 | 6
            r6 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r5.startReplaceableGroup(r6)
            androidx.compose.runtime.ComposerKt.sourceInformation(r5, r13)
            androidx.compose.ui.Alignment$Companion r6 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment r6 = r6.getTopStart()
            int r7 = r4 >> 3
            r8 = r7 & 14
            r7 = r7 & 112(0x70, float:1.57E-43)
            r7 = r7 | r8
            r8 = 0
            androidx.compose.ui.layout.MeasurePolicy r6 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(r6, r8, r5, r7)
            int r7 = r4 << 3
            r7 = r7 & 112(0x70, float:1.57E-43)
            r8 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r5.startReplaceableGroup(r8)
            androidx.compose.runtime.ComposerKt.sourceInformation(r5, r9)
            androidx.compose.runtime.ProvidableCompositionLocal r8 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r8 = (androidx.compose.runtime.CompositionLocal) r8
            r9 = 2023513938(0x789c5f52, float:2.5372864E34)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r5, r9, r12)
            java.lang.Object r8 = r5.consume(r8)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r5)
            androidx.compose.ui.unit.Density r8 = (androidx.compose.ui.unit.Density) r8
            androidx.compose.runtime.ProvidableCompositionLocal r10 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            androidx.compose.runtime.CompositionLocal r10 = (androidx.compose.runtime.CompositionLocal) r10
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r5, r9, r12)
            java.lang.Object r10 = r5.consume(r10)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r5)
            androidx.compose.ui.unit.LayoutDirection r10 = (androidx.compose.ui.unit.LayoutDirection) r10
            androidx.compose.runtime.ProvidableCompositionLocal r11 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            androidx.compose.runtime.CompositionLocal r11 = (androidx.compose.runtime.CompositionLocal) r11
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r5, r9, r12)
            java.lang.Object r9 = r5.consume(r11)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r5)
            androidx.compose.ui.platform.ViewConfiguration r9 = (androidx.compose.ui.platform.ViewConfiguration) r9
            androidx.compose.ui.node.ComposeUiNode$Companion r11 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function0 r11 = r11.getConstructor()
            kotlin.jvm.functions.Function3 r0 = androidx.compose.ui.layout.LayoutKt.materializerOf(r0)
            int r7 = r7 << 9
            r7 = r7 & 7168(0x1c00, float:1.0045E-41)
            r7 = r7 | 6
            androidx.compose.runtime.Applier r12 = r5.getApplier()
            boolean r12 = r12 instanceof androidx.compose.runtime.Applier
            if (r12 != 0) goto L_0x02f3
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x02f3:
            r5.startReusableNode()
            boolean r12 = r5.getInserting()
            if (r12 == 0) goto L_0x0300
            r5.createNode(r11)
            goto L_0x0303
        L_0x0300:
            r5.useNode()
        L_0x0303:
            r5.disableReusing()
            androidx.compose.runtime.Composer r11 = androidx.compose.runtime.Updater.m2444constructorimpl(r5)
            androidx.compose.ui.node.ComposeUiNode$Companion r12 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r12 = r12.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r11, r6, r12)
            androidx.compose.ui.node.ComposeUiNode$Companion r6 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r6 = r6.getSetDensity()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r11, r8, r6)
            androidx.compose.ui.node.ComposeUiNode$Companion r6 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r6 = r6.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r11, r10, r6)
            androidx.compose.ui.node.ComposeUiNode$Companion r6 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r6 = r6.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r11, r9, r6)
            r5.enableReusing()
            androidx.compose.runtime.Composer r6 = androidx.compose.runtime.SkippableUpdater.m2436constructorimpl(r5)
            androidx.compose.runtime.SkippableUpdater r6 = androidx.compose.runtime.SkippableUpdater.m2435boximpl(r6)
            int r7 = r7 >> 3
            r7 = r7 & 112(0x70, float:1.57E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r0.invoke(r6, r5, r7)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r5.startReplaceableGroup(r0)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r5, r1, r2)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE
            int r1 = r4 >> 6
            r1 = r1 & 112(0x70, float:1.57E-43)
            r1 = r1 | 6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = r19
            r2.invoke(r0, r5, r1)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r5)
            r5.endReplaceableGroup()
            r5.endNode()
            r5.endReplaceableGroup()
            r5.endReplaceableGroup()
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r5)
            r5.endReplaceableGroup()
            r5.endNode()
            r5.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0382
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0382:
            androidx.compose.runtime.ScopeUpdateScope r6 = r5.endRestartGroup()
            if (r6 != 0) goto L_0x0389
            goto L_0x039e
        L_0x0389:
            androidx.compose.material3.BadgeKt$BadgedBox$3 r7 = new androidx.compose.material3.BadgeKt$BadgedBox$3
            r0 = r7
            r1 = r19
            r2 = r18
            r3 = r21
            r4 = r23
            r5 = r24
            r0.<init>(r1, r2, r3, r4, r5)
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            r6.updateScope(r7)
        L_0x039e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.BadgeKt.BadgedBox(kotlin.jvm.functions.Function3, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0288  */
    /* renamed from: Badge-eopBjH0  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1137BadgeeopBjH0(androidx.compose.ui.Modifier r17, long r18, long r20, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r22, androidx.compose.runtime.Composer r23, int r24, int r25) {
        /*
            r7 = r24
            r0 = 1298144073(0x4d601b49, float:2.34992784E8)
            r1 = r23
            androidx.compose.runtime.Composer r1 = r1.startRestartGroup(r0)
            java.lang.String r2 = "C(Badge)P(3,0:c#ui.graphics.Color,2:c#ui.graphics.Color)141@5648L14,142@5690L31,153@6032L1119:Badge.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r2)
            r2 = r25 & 1
            r3 = 2
            if (r2 == 0) goto L_0x001b
            r4 = r7 | 6
            r5 = r4
            r4 = r17
            goto L_0x002f
        L_0x001b:
            r4 = r7 & 14
            if (r4 != 0) goto L_0x002c
            r4 = r17
            boolean r5 = r1.changed((java.lang.Object) r4)
            if (r5 == 0) goto L_0x0029
            r5 = 4
            goto L_0x002a
        L_0x0029:
            r5 = r3
        L_0x002a:
            r5 = r5 | r7
            goto L_0x002f
        L_0x002c:
            r4 = r17
            r5 = r7
        L_0x002f:
            r6 = r7 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0046
            r6 = r25 & 2
            r8 = r18
            if (r6 != 0) goto L_0x0042
            boolean r6 = r1.changed((long) r8)
            if (r6 == 0) goto L_0x0042
            r6 = 32
            goto L_0x0044
        L_0x0042:
            r6 = 16
        L_0x0044:
            r5 = r5 | r6
            goto L_0x0048
        L_0x0046:
            r8 = r18
        L_0x0048:
            r6 = r7 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x005f
            r6 = r25 & 4
            r10 = r20
            if (r6 != 0) goto L_0x005b
            boolean r6 = r1.changed((long) r10)
            if (r6 == 0) goto L_0x005b
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r6 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r5 = r5 | r6
            goto L_0x0061
        L_0x005f:
            r10 = r20
        L_0x0061:
            r6 = r25 & 8
            if (r6 == 0) goto L_0x0068
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            goto L_0x007b
        L_0x0068:
            r12 = r7 & 7168(0x1c00, float:1.0045E-41)
            if (r12 != 0) goto L_0x007b
            r12 = r22
            boolean r13 = r1.changedInstance(r12)
            if (r13 == 0) goto L_0x0077
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r5 = r5 | r13
            goto L_0x007d
        L_0x007b:
            r12 = r22
        L_0x007d:
            r13 = r5 & 5851(0x16db, float:8.199E-42)
            r14 = 1170(0x492, float:1.64E-42)
            if (r13 != r14) goto L_0x0092
            boolean r13 = r1.getSkipping()
            if (r13 != 0) goto L_0x008a
            goto L_0x0092
        L_0x008a:
            r1.skipToGroupEnd()
            r2 = r4
        L_0x008e:
            r4 = r10
            r6 = r12
            goto L_0x0281
        L_0x0092:
            r1.startDefaults()
            r13 = r7 & 1
            r14 = 0
            r15 = 6
            if (r13 == 0) goto L_0x00b3
            boolean r13 = r1.getDefaultsInvalid()
            if (r13 == 0) goto L_0x00a2
            goto L_0x00b3
        L_0x00a2:
            r1.skipToGroupEnd()
            r2 = r25 & 2
            if (r2 == 0) goto L_0x00ab
            r5 = r5 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00ab:
            r2 = r25 & 4
            if (r2 == 0) goto L_0x00b1
            r5 = r5 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00b1:
            r2 = r4
            goto L_0x00d9
        L_0x00b3:
            if (r2 == 0) goto L_0x00ba
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r2 = (androidx.compose.ui.Modifier) r2
            goto L_0x00bb
        L_0x00ba:
            r2 = r4
        L_0x00bb:
            r4 = r25 & 2
            if (r4 == 0) goto L_0x00c7
            androidx.compose.material3.BadgeDefaults r4 = androidx.compose.material3.BadgeDefaults.INSTANCE
            long r8 = r4.getContainerColor(r1, r15)
            r5 = r5 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00c7:
            r4 = r25 & 4
            if (r4 == 0) goto L_0x00d6
            int r4 = r5 >> 3
            r4 = r4 & 14
            long r10 = androidx.compose.material3.ColorSchemeKt.m1242contentColorForek8zF_U(r8, r1, r4)
            r4 = r5 & -897(0xfffffffffffffc7f, float:NaN)
            r5 = r4
        L_0x00d6:
            if (r6 == 0) goto L_0x00d9
            r12 = r14
        L_0x00d9:
            r1.endDefaults()
            boolean r4 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r4 == 0) goto L_0x00e9
            r4 = -1
            java.lang.String r6 = "androidx.compose.material3.Badge (Badge.kt:139)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r5, r4, r6)
        L_0x00e9:
            androidx.compose.material3.tokens.BadgeTokens r0 = androidx.compose.material3.tokens.BadgeTokens.INSTANCE
            if (r12 == 0) goto L_0x00f2
            float r0 = r0.m1873getLargeSizeD9Ej5fM()
            goto L_0x00f6
        L_0x00f2:
            float r0 = r0.m1874getSizeD9Ej5fM()
        L_0x00f6:
            if (r12 == 0) goto L_0x0111
            r4 = 1947275116(0x74110f6c, float:4.5971426E31)
            r1.startReplaceableGroup(r4)
            java.lang.String r4 = "147@5933L9"
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r4)
            androidx.compose.material3.tokens.BadgeTokens r4 = androidx.compose.material3.tokens.BadgeTokens.INSTANCE
            androidx.compose.material3.tokens.ShapeKeyTokens r4 = r4.getLargeShape()
            androidx.compose.ui.graphics.Shape r4 = androidx.compose.material3.ShapesKt.toShape(r4, r1, r15)
            r1.endReplaceableGroup()
            goto L_0x0129
        L_0x0111:
            r4 = 1947275170(0x74110fa2, float:4.5971687E31)
            r1.startReplaceableGroup(r4)
            java.lang.String r4 = "149@5982L9"
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r4)
            androidx.compose.material3.tokens.BadgeTokens r4 = androidx.compose.material3.tokens.BadgeTokens.INSTANCE
            androidx.compose.material3.tokens.ShapeKeyTokens r4 = r4.getShape()
            androidx.compose.ui.graphics.Shape r4 = androidx.compose.material3.ShapesKt.toShape(r4, r1, r15)
            r1.endReplaceableGroup()
        L_0x0129:
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.m547defaultMinSizeVpY3zN4(r2, r0, r0)
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.BackgroundKt.m181backgroundbw27NRU(r0, r8, r4)
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.draw.ClipKt.clip(r0, r4)
            if (r12 == 0) goto L_0x0143
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r4 = (androidx.compose.ui.Modifier) r4
            float r6 = BadgeWithContentHorizontalPadding
            r13 = 0
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.PaddingKt.m495paddingVpY3zN4$default(r4, r6, r13, r3, r14)
            goto L_0x0147
        L_0x0143:
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r3 = (androidx.compose.ui.Modifier) r3
        L_0x0147:
            androidx.compose.ui.Modifier r0 = r0.then(r3)
            androidx.compose.ui.Alignment$Companion r3 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment$Vertical r3 = r3.getCenterVertically()
            androidx.compose.foundation.layout.Arrangement r4 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical r4 = r4.getCenter()
            r6 = 693286680(0x2952b718, float:4.6788176E-14)
            r1.startReplaceableGroup(r6)
            java.lang.String r6 = "CC(Row)P(2,1,3)78@3913L58,79@3976L130:Row.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r6)
            androidx.compose.foundation.layout.Arrangement$Horizontal r4 = (androidx.compose.foundation.layout.Arrangement.Horizontal) r4
            r6 = 54
            androidx.compose.ui.layout.MeasurePolicy r3 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(r4, r3, r1, r6)
            r4 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1.startReplaceableGroup(r4)
            java.lang.String r4 = "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh"
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r4)
            androidx.compose.runtime.ProvidableCompositionLocal r4 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r4 = (androidx.compose.runtime.CompositionLocal) r4
            r6 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r13 = "C:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r1, r6, r13)
            java.lang.Object r4 = r1.consume(r4)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r1)
            androidx.compose.ui.unit.Density r4 = (androidx.compose.ui.unit.Density) r4
            androidx.compose.runtime.ProvidableCompositionLocal r14 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            androidx.compose.runtime.CompositionLocal r14 = (androidx.compose.runtime.CompositionLocal) r14
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r1, r6, r13)
            java.lang.Object r14 = r1.consume(r14)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r1)
            androidx.compose.ui.unit.LayoutDirection r14 = (androidx.compose.ui.unit.LayoutDirection) r14
            androidx.compose.runtime.ProvidableCompositionLocal r16 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            r15 = r16
            androidx.compose.runtime.CompositionLocal r15 = (androidx.compose.runtime.CompositionLocal) r15
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r1, r6, r13)
            java.lang.Object r6 = r1.consume(r15)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r1)
            androidx.compose.ui.platform.ViewConfiguration r6 = (androidx.compose.ui.platform.ViewConfiguration) r6
            androidx.compose.ui.node.ComposeUiNode$Companion r13 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function0 r13 = r13.getConstructor()
            kotlin.jvm.functions.Function3 r0 = androidx.compose.ui.layout.LayoutKt.materializerOf(r0)
            androidx.compose.runtime.Applier r15 = r1.getApplier()
            boolean r15 = r15 instanceof androidx.compose.runtime.Applier
            if (r15 != 0) goto L_0x01c7
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x01c7:
            r1.startReusableNode()
            boolean r15 = r1.getInserting()
            if (r15 == 0) goto L_0x01d4
            r1.createNode(r13)
            goto L_0x01d7
        L_0x01d4:
            r1.useNode()
        L_0x01d7:
            r1.disableReusing()
            androidx.compose.runtime.Composer r13 = androidx.compose.runtime.Updater.m2444constructorimpl(r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r15 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r15 = r15.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r13, r3, r15)
            androidx.compose.ui.node.ComposeUiNode$Companion r3 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r3 = r3.getSetDensity()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r13, r4, r3)
            androidx.compose.ui.node.ComposeUiNode$Companion r3 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r3 = r3.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r13, r14, r3)
            androidx.compose.ui.node.ComposeUiNode$Companion r3 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r3 = r3.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r13, r6, r3)
            r1.enableReusing()
            androidx.compose.runtime.Composer r3 = androidx.compose.runtime.SkippableUpdater.m2436constructorimpl(r1)
            androidx.compose.runtime.SkippableUpdater r3 = androidx.compose.runtime.SkippableUpdater.m2435boximpl(r3)
            r4 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r0.invoke(r3, r1, r6)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r1.startReplaceableGroup(r0)
            r0 = -326682283(0xffffffffec873955, float:-1.3078058E27)
            java.lang.String r3 = "C80@4021L9:Row.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r1, r0, r3)
            androidx.compose.foundation.layout.RowScopeInstance r0 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE
            androidx.compose.foundation.layout.RowScope r0 = (androidx.compose.foundation.layout.RowScope) r0
            r3 = -193559524(0xfffffffff476841c, float:-7.8124055E31)
            java.lang.String r6 = "C:Badge.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r1, r3, r6)
            r3 = 1947275771(0x741111fb, float:4.5974593E31)
            r1.startReplaceableGroup(r3)
            java.lang.String r3 = "170@6681L454"
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r3)
            if (r12 == 0) goto L_0x0261
            r3 = 1
            androidx.compose.runtime.ProvidedValue[] r6 = new androidx.compose.runtime.ProvidedValue[r3]
            androidx.compose.runtime.ProvidableCompositionLocal r13 = androidx.compose.material3.ContentColorKt.getLocalContentColor()
            androidx.compose.ui.graphics.Color r14 = androidx.compose.ui.graphics.Color.m2811boximpl(r10)
            androidx.compose.runtime.ProvidedValue r13 = r13.provides(r14)
            r6[r4] = r13
            androidx.compose.material3.BadgeKt$Badge$1$1 r4 = new androidx.compose.material3.BadgeKt$Badge$1$1
            r13 = 6
            r4.<init>(r12, r0, r13, r5)
            r0 = 5609066(0x55966a, float:7.859976E-39)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r1, r0, r3, r4)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r3 = 56
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) r6, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) r0, (androidx.compose.runtime.Composer) r1, (int) r3)
        L_0x0261:
            r1.endReplaceableGroup()
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r1)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r1)
            r1.endReplaceableGroup()
            r1.endNode()
            r1.endReplaceableGroup()
            r1.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x008e
            androidx.compose.runtime.ComposerKt.traceEventEnd()
            goto L_0x008e
        L_0x0281:
            androidx.compose.runtime.ScopeUpdateScope r10 = r1.endRestartGroup()
            if (r10 != 0) goto L_0x0288
            goto L_0x0299
        L_0x0288:
            androidx.compose.material3.BadgeKt$Badge$2 r11 = new androidx.compose.material3.BadgeKt$Badge$2
            r0 = r11
            r1 = r2
            r2 = r8
            r7 = r24
            r8 = r25
            r0.<init>(r1, r2, r4, r6, r7, r8)
            kotlin.jvm.functions.Function2 r11 = (kotlin.jvm.functions.Function2) r11
            r10.updateScope(r11)
        L_0x0299:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.BadgeKt.m1137BadgeeopBjH0(androidx.compose.ui.Modifier, long, long, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    static {
        float f = (float) 4;
        BadgeWithContentHorizontalPadding = Dp.m5626constructorimpl(f);
        BadgeWithContentHorizontalOffset = Dp.m5626constructorimpl(-Dp.m5626constructorimpl(f));
        BadgeWithContentVerticalOffset = Dp.m5626constructorimpl(-Dp.m5626constructorimpl(f));
    }
}
