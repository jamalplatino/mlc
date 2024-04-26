package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001aX\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0002\b\u0010H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001aD\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00142\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u0015\u001a(\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00022\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0002\b\u0010H\u0001¢\u0006\u0002\u0010\u0018\u001a+\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001b2\u0013\b\b\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0002\b\u0010H\b¢\u0006\u0002\u0010\u001c\u001a\u001a\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0002\u001a\f\u0010\"\u001a\u00020\u001e*\u00020 H\u0000\u001a\f\u0010#\u001a\u00020$*\u00020%H\u0002\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006&"}, d2 = {"LocalPopupTestTag", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "getLocalPopupTestTag", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "Popup", "", "alignment", "Landroidx/compose/ui/Alignment;", "offset", "Landroidx/compose/ui/unit/IntOffset;", "onDismissRequest", "Lkotlin/Function0;", "properties", "Landroidx/compose/ui/window/PopupProperties;", "content", "Landroidx/compose/runtime/Composable;", "Popup-K5zGePQ", "(Landroidx/compose/ui/Alignment;JLkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "popupPositionProvider", "Landroidx/compose/ui/window/PopupPositionProvider;", "(Landroidx/compose/ui/window/PopupPositionProvider;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "PopupTestTag", "tag", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "SimpleStack", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "isPopupLayout", "", "view", "Landroid/view/View;", "testTag", "isFlagSecureEnabled", "toIntBounds", "Landroidx/compose/ui/unit/IntRect;", "Landroid/graphics/Rect;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: AndroidPopup.android.kt */
public final class AndroidPopup_androidKt {
    private static final ProvidableCompositionLocal<String> LocalPopupTestTag = CompositionLocalKt.compositionLocalOf$default((SnapshotMutationPolicy) null, AndroidPopup_androidKt$LocalPopupTestTag$1.INSTANCE, 1, (Object) null);

    public static final ProvidableCompositionLocal<String> getLocalPopupTestTag() {
        return LocalPopupTestTag;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* renamed from: Popup-K5zGePQ  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m5870PopupK5zGePQ(androidx.compose.ui.Alignment r24, long r25, kotlin.jvm.functions.Function0<kotlin.Unit> r27, androidx.compose.ui.window.PopupProperties r28, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            r7 = r29
            r8 = r31
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 295309329(0x119a1011, float:2.4306818E-28)
            r1 = r30
            androidx.compose.runtime.Composer r9 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(Popup)P(!1,2:c#ui.unit.IntOffset,3,4)193@8637L128,200@8771L165:AndroidPopup.android.kt#2oxthz"
            androidx.compose.runtime.ComposerKt.sourceInformation(r9, r1)
            r1 = r32 & 1
            if (r1 == 0) goto L_0x0021
            r2 = r8 | 6
            r3 = r2
            r2 = r24
            goto L_0x0035
        L_0x0021:
            r2 = r8 & 14
            if (r2 != 0) goto L_0x0032
            r2 = r24
            boolean r3 = r9.changed((java.lang.Object) r2)
            if (r3 == 0) goto L_0x002f
            r3 = 4
            goto L_0x0030
        L_0x002f:
            r3 = 2
        L_0x0030:
            r3 = r3 | r8
            goto L_0x0035
        L_0x0032:
            r2 = r24
            r3 = r8
        L_0x0035:
            r4 = r32 & 2
            if (r4 == 0) goto L_0x003c
            r3 = r3 | 48
            goto L_0x004f
        L_0x003c:
            r5 = r8 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x004f
            r5 = r25
            boolean r10 = r9.changed((long) r5)
            if (r10 == 0) goto L_0x004b
            r10 = 32
            goto L_0x004d
        L_0x004b:
            r10 = 16
        L_0x004d:
            r3 = r3 | r10
            goto L_0x0051
        L_0x004f:
            r5 = r25
        L_0x0051:
            r10 = r32 & 4
            if (r10 == 0) goto L_0x0058
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x006b
        L_0x0058:
            r11 = r8 & 896(0x380, float:1.256E-42)
            if (r11 != 0) goto L_0x006b
            r11 = r27
            boolean r12 = r9.changedInstance(r11)
            if (r12 == 0) goto L_0x0067
            r12 = 256(0x100, float:3.59E-43)
            goto L_0x0069
        L_0x0067:
            r12 = 128(0x80, float:1.794E-43)
        L_0x0069:
            r3 = r3 | r12
            goto L_0x006d
        L_0x006b:
            r11 = r27
        L_0x006d:
            r12 = r32 & 8
            if (r12 == 0) goto L_0x0074
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0087
        L_0x0074:
            r13 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r13 != 0) goto L_0x0087
            r13 = r28
            boolean r14 = r9.changed((java.lang.Object) r13)
            if (r14 == 0) goto L_0x0083
            r14 = 2048(0x800, float:2.87E-42)
            goto L_0x0085
        L_0x0083:
            r14 = 1024(0x400, float:1.435E-42)
        L_0x0085:
            r3 = r3 | r14
            goto L_0x0089
        L_0x0087:
            r13 = r28
        L_0x0089:
            r14 = r32 & 16
            if (r14 == 0) goto L_0x0090
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a2
        L_0x0090:
            r14 = 57344(0xe000, float:8.0356E-41)
            r14 = r14 & r8
            if (r14 != 0) goto L_0x00a2
            boolean r14 = r9.changedInstance(r7)
            if (r14 == 0) goto L_0x009f
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a1
        L_0x009f:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x00a1:
            r3 = r3 | r14
        L_0x00a2:
            r14 = 46811(0xb6db, float:6.5596E-41)
            r14 = r14 & r3
            r15 = 9362(0x2492, float:1.3119E-41)
            if (r14 != r15) goto L_0x00ba
            boolean r14 = r9.getSkipping()
            if (r14 != 0) goto L_0x00b1
            goto L_0x00ba
        L_0x00b1:
            r9.skipToGroupEnd()
            r1 = r2
            r2 = r5
            r4 = r11
            r5 = r13
            goto L_0x0150
        L_0x00ba:
            if (r1 == 0) goto L_0x00c4
            androidx.compose.ui.Alignment$Companion r1 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment r1 = r1.getTopStart()
            r14 = r1
            goto L_0x00c5
        L_0x00c4:
            r14 = r2
        L_0x00c5:
            if (r4 == 0) goto L_0x00cd
            r1 = 0
            long r1 = androidx.compose.ui.unit.IntOffsetKt.IntOffset(r1, r1)
            r5 = r1
        L_0x00cd:
            r1 = 0
            if (r10 == 0) goto L_0x00d1
            r11 = r1
        L_0x00d1:
            if (r12 == 0) goto L_0x00ea
            androidx.compose.ui.window.PopupProperties r2 = new androidx.compose.ui.window.PopupProperties
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 63
            r23 = 0
            r15 = r2
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            r13 = r2
        L_0x00ea:
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x00f6
            r2 = -1
            java.lang.String r4 = "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:186)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r3, r2, r4)
        L_0x00f6:
            androidx.compose.ui.unit.IntOffset r0 = androidx.compose.ui.unit.IntOffset.m5735boximpl(r5)
            r2 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r9.startReplaceableGroup(r2)
            java.lang.String r2 = "CC(remember)P(1,2):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r9, r2)
            boolean r2 = r9.changed((java.lang.Object) r14)
            boolean r0 = r9.changed((java.lang.Object) r0)
            r0 = r0 | r2
            java.lang.Object r2 = r9.rememberedValue()
            if (r0 != 0) goto L_0x011c
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r0 = r0.getEmpty()
            if (r2 != r0) goto L_0x0124
        L_0x011c:
            androidx.compose.ui.window.AlignmentOffsetPositionProvider r2 = new androidx.compose.ui.window.AlignmentOffsetPositionProvider
            r2.<init>(r14, r5, r1)
            r9.updateRememberedValue(r2)
        L_0x0124:
            r9.endReplaceableGroup()
            androidx.compose.ui.window.AlignmentOffsetPositionProvider r2 = (androidx.compose.ui.window.AlignmentOffsetPositionProvider) r2
            r0 = r2
            androidx.compose.ui.window.PopupPositionProvider r0 = (androidx.compose.ui.window.PopupPositionProvider) r0
            int r1 = r3 >> 3
            r2 = r1 & 112(0x70, float:1.57E-43)
            r3 = r1 & 896(0x380, float:1.256E-42)
            r2 = r2 | r3
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r10 = r2 | r1
            r12 = 0
            r1 = r11
            r2 = r13
            r3 = r29
            r4 = r9
            r15 = r5
            r5 = r10
            r6 = r12
            Popup(r0, r1, r2, r3, r4, r5, r6)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x014c
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x014c:
            r4 = r11
            r5 = r13
            r1 = r14
            r2 = r15
        L_0x0150:
            androidx.compose.runtime.ScopeUpdateScope r9 = r9.endRestartGroup()
            if (r9 != 0) goto L_0x0157
            goto L_0x0168
        L_0x0157:
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$1 r10 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$1
            r0 = r10
            r6 = r29
            r7 = r31
            r8 = r32
            r0.<init>(r1, r2, r4, r5, r6, r7, r8)
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            r9.updateScope(r10)
        L_0x0168:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.AndroidPopup_androidKt.m5870PopupK5zGePQ(androidx.compose.ui.Alignment, long, kotlin.jvm.functions.Function0, androidx.compose.ui.window.PopupProperties, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x02d1  */
    /* JADX WARNING: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void Popup(androidx.compose.ui.window.PopupPositionProvider r36, kotlin.jvm.functions.Function0<kotlin.Unit> r37, androidx.compose.ui.window.PopupProperties r38, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r39, androidx.compose.runtime.Composer r40, int r41, int r42) {
        /*
            r11 = r36
            r12 = r39
            r13 = r41
            java.lang.String r0 = "popupPositionProvider"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = -830247068(0xffffffffce836f64, float:-1.1025577E9)
            r1 = r40
            androidx.compose.runtime.Composer r14 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(Popup)P(2,1,3)227@9660L7,228@9699L7,229@9743L7,230@9798L7,231@9834L28,232@9889L29,233@9937L38,234@9998L944,262@10948L417,277@11371L229,286@11606L166,298@12335L175,308@12688L771:AndroidPopup.android.kt#2oxthz"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r1)
            r1 = r42 & 1
            if (r1 == 0) goto L_0x0025
            r1 = r13 | 6
            goto L_0x0035
        L_0x0025:
            r1 = r13 & 14
            if (r1 != 0) goto L_0x0034
            boolean r1 = r14.changed((java.lang.Object) r11)
            if (r1 == 0) goto L_0x0031
            r1 = 4
            goto L_0x0032
        L_0x0031:
            r1 = 2
        L_0x0032:
            r1 = r1 | r13
            goto L_0x0035
        L_0x0034:
            r1 = r13
        L_0x0035:
            r2 = r42 & 2
            if (r2 == 0) goto L_0x003c
            r1 = r1 | 48
            goto L_0x004f
        L_0x003c:
            r3 = r13 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x004f
            r3 = r37
            boolean r4 = r14.changedInstance(r3)
            if (r4 == 0) goto L_0x004b
            r4 = 32
            goto L_0x004d
        L_0x004b:
            r4 = 16
        L_0x004d:
            r1 = r1 | r4
            goto L_0x0051
        L_0x004f:
            r3 = r37
        L_0x0051:
            r4 = r42 & 4
            if (r4 == 0) goto L_0x0058
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x006b
        L_0x0058:
            r5 = r13 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x006b
            r5 = r38
            boolean r6 = r14.changed((java.lang.Object) r5)
            if (r6 == 0) goto L_0x0067
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0069
        L_0x0067:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0069:
            r1 = r1 | r6
            goto L_0x006d
        L_0x006b:
            r5 = r38
        L_0x006d:
            r6 = r42 & 8
            if (r6 == 0) goto L_0x0074
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0084
        L_0x0074:
            r6 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r6 != 0) goto L_0x0084
            boolean r6 = r14.changedInstance(r12)
            if (r6 == 0) goto L_0x0081
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x0083
        L_0x0081:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x0083:
            r1 = r1 | r6
        L_0x0084:
            r15 = r1
            r1 = r15 & 5851(0x16db, float:8.199E-42)
            r6 = 1170(0x492, float:1.64E-42)
            if (r1 != r6) goto L_0x0099
            boolean r1 = r14.getSkipping()
            if (r1 != 0) goto L_0x0092
            goto L_0x0099
        L_0x0092:
            r14.skipToGroupEnd()
            r2 = r3
            r3 = r5
            goto L_0x02ca
        L_0x0099:
            r10 = 0
            if (r2 == 0) goto L_0x009f
            r22 = r10
            goto L_0x00a1
        L_0x009f:
            r22 = r3
        L_0x00a1:
            if (r4 == 0) goto L_0x00bb
            androidx.compose.ui.window.PopupProperties r1 = new androidx.compose.ui.window.PopupProperties
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 63
            r31 = 0
            r23 = r1
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31)
            goto L_0x00bd
        L_0x00bb:
            r23 = r5
        L_0x00bd:
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x00c9
            r1 = -1
            java.lang.String r2 = "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:221)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r15, r1, r2)
        L_0x00c9:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalView()
            androidx.compose.runtime.CompositionLocal r0 = (androidx.compose.runtime.CompositionLocal) r0
            r9 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r8 = "CC:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r14, r9, r8)
            java.lang.Object r0 = r14.consume(r0)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r14)
            r16 = r0
            android.view.View r16 = (android.view.View) r16
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r0 = (androidx.compose.runtime.CompositionLocal) r0
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r14, r9, r8)
            java.lang.Object r0 = r14.consume(r0)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r14)
            r17 = r0
            androidx.compose.ui.unit.Density r17 = (androidx.compose.ui.unit.Density) r17
            androidx.compose.runtime.ProvidableCompositionLocal<java.lang.String> r0 = LocalPopupTestTag
            androidx.compose.runtime.CompositionLocal r0 = (androidx.compose.runtime.CompositionLocal) r0
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r14, r9, r8)
            java.lang.Object r0 = r14.consume(r0)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r14)
            r24 = r0
            java.lang.String r24 = (java.lang.String) r24
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            androidx.compose.runtime.CompositionLocal r0 = (androidx.compose.runtime.CompositionLocal) r0
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r14, r9, r8)
            java.lang.Object r0 = r14.consume(r0)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r14)
            androidx.compose.ui.unit.LayoutDirection r0 = (androidx.compose.ui.unit.LayoutDirection) r0
            r7 = 0
            androidx.compose.runtime.CompositionContext r6 = androidx.compose.runtime.ComposablesKt.rememberCompositionContext(r14, r7)
            int r1 = r15 >> 9
            r1 = r1 & 14
            androidx.compose.runtime.State r5 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(r12, r14, r1)
            java.lang.Object[] r1 = new java.lang.Object[r7]
            r2 = 0
            r3 = 0
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupId$1 r4 = androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupId$1.INSTANCE
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r18 = 3080(0xc08, float:4.316E-42)
            r19 = 6
            r32 = r5
            r5 = r14
            r33 = r6
            r6 = r18
            r7 = r19
            java.lang.Object r1 = androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable((java.lang.Object[]) r1, r2, (java.lang.String) r3, r4, (androidx.compose.runtime.Composer) r5, (int) r6, (int) r7)
            r7 = r1
            java.util.UUID r7 = (java.util.UUID) r7
            r1 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r14.startReplaceableGroup(r1)
            java.lang.String r1 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r1)
            java.lang.Object r1 = r14.rememberedValue()
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r1 != r2) goto L_0x01a2
            androidx.compose.ui.window.PopupLayout r6 = new androidx.compose.ui.window.PopupLayout
            java.lang.String r1 = "popupId"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r1)
            r18 = 0
            r19 = 128(0x80, float:1.794E-43)
            r20 = 0
            r5 = r0
            r0 = r6
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r16
            r37 = r5
            r5 = r17
            r34 = r6
            r6 = r36
            r35 = r8
            r8 = r18
            r9 = r19
            r12 = r10
            r10 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1 r0 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1
            r1 = r32
            r2 = r34
            r0.<init>(r2, r1)
            r1 = 1302892335(0x4da88f2f, float:3.53494496E8)
            r3 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(r1, r3, r0)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1 = r33
            r2.setContent(r1, r0)
            r14.updateRememberedValue(r2)
            r1 = r2
            goto L_0x01a7
        L_0x01a2:
            r37 = r0
            r35 = r8
            r12 = r10
        L_0x01a7:
            r14.endReplaceableGroup()
            androidx.compose.ui.window.PopupLayout r1 = (androidx.compose.ui.window.PopupLayout) r1
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2 r0 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2
            r16 = r0
            r17 = r1
            r18 = r22
            r19 = r23
            r20 = r24
            r21 = r37
            r16.<init>(r17, r18, r19, r20, r21)
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r2 = 8
            androidx.compose.runtime.EffectsKt.DisposableEffect((java.lang.Object) r1, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) r0, (androidx.compose.runtime.Composer) r14, (int) r2)
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3 r0 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21)
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            r2 = 0
            androidx.compose.runtime.EffectsKt.SideEffect(r0, r14, r2)
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4 r0 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4
            r0.<init>(r1, r11)
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r3 = r15 & 14
            androidx.compose.runtime.EffectsKt.DisposableEffect((java.lang.Object) r11, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) r0, (androidx.compose.runtime.Composer) r14, (int) r3)
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5 r0 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5
            r0.<init>(r1, r12)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r3 = 72
            androidx.compose.runtime.EffectsKt.LaunchedEffect((java.lang.Object) r1, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) r0, (androidx.compose.runtime.Composer) r14, (int) r3)
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7 r3 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7
            r3.<init>(r1)
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.layout.OnGloballyPositionedModifierKt.onGloballyPositioned(r0, r3)
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8 r3 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8
            r4 = r37
            r3.<init>(r1, r4)
            androidx.compose.ui.layout.MeasurePolicy r3 = (androidx.compose.ui.layout.MeasurePolicy) r3
            r1 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r14.startReplaceableGroup(r1)
            java.lang.String r1 = "CC(Layout)P(!1,2)73@2855L7,74@2910L7,75@2969L7,76@2981L460:Layout.kt#80mrfh"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r1)
            androidx.compose.runtime.ProvidableCompositionLocal r1 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r1 = (androidx.compose.runtime.CompositionLocal) r1
            r4 = r35
            r5 = 2023513938(0x789c5f52, float:2.5372864E34)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r14, r5, r4)
            java.lang.Object r1 = r14.consume(r1)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r14)
            androidx.compose.ui.unit.Density r1 = (androidx.compose.ui.unit.Density) r1
            androidx.compose.runtime.ProvidableCompositionLocal r6 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            androidx.compose.runtime.CompositionLocal r6 = (androidx.compose.runtime.CompositionLocal) r6
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r14, r5, r4)
            java.lang.Object r6 = r14.consume(r6)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r14)
            androidx.compose.ui.unit.LayoutDirection r6 = (androidx.compose.ui.unit.LayoutDirection) r6
            androidx.compose.runtime.ProvidableCompositionLocal r7 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            androidx.compose.runtime.CompositionLocal r7 = (androidx.compose.runtime.CompositionLocal) r7
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r14, r5, r4)
            java.lang.Object r4 = r14.consume(r7)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r14)
            androidx.compose.ui.platform.ViewConfiguration r4 = (androidx.compose.ui.platform.ViewConfiguration) r4
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function0 r5 = r5.getConstructor()
            kotlin.jvm.functions.Function3 r0 = androidx.compose.ui.layout.LayoutKt.materializerOf(r0)
            androidx.compose.runtime.Applier r7 = r14.getApplier()
            boolean r7 = r7 instanceof androidx.compose.runtime.Applier
            if (r7 != 0) goto L_0x025c
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x025c:
            r14.startReusableNode()
            boolean r7 = r14.getInserting()
            if (r7 == 0) goto L_0x0269
            r14.createNode(r5)
            goto L_0x026c
        L_0x0269:
            r14.useNode()
        L_0x026c:
            androidx.compose.runtime.Composer r5 = androidx.compose.runtime.Updater.m2444constructorimpl(r14)
            androidx.compose.ui.node.ComposeUiNode$Companion r7 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r7 = r7.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r5, r3, r7)
            androidx.compose.ui.node.ComposeUiNode$Companion r3 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r3 = r3.getSetDensity()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r5, r1, r3)
            androidx.compose.ui.node.ComposeUiNode$Companion r1 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r1 = r1.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r5, r6, r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r1 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r1 = r1.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r5, r4, r1)
            androidx.compose.runtime.Composer r1 = androidx.compose.runtime.SkippableUpdater.m2436constructorimpl(r14)
            androidx.compose.runtime.SkippableUpdater r1 = androidx.compose.runtime.SkippableUpdater.m2435boximpl(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.invoke(r1, r14, r2)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r14.startReplaceableGroup(r0)
            r0 = 1097164901(0x41656865, float:14.337987)
            java.lang.String r1 = "C:AndroidPopup.android.kt#2oxthz"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r14, r0, r1)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r14)
            r14.endReplaceableGroup()
            r14.endNode()
            r14.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x02c6
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x02c6:
            r2 = r22
            r3 = r23
        L_0x02ca:
            androidx.compose.runtime.ScopeUpdateScope r7 = r14.endRestartGroup()
            if (r7 != 0) goto L_0x02d1
            goto L_0x02e4
        L_0x02d1:
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$9 r8 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$9
            r0 = r8
            r1 = r36
            r4 = r39
            r5 = r41
            r6 = r42
            r0.<init>(r1, r2, r3, r4, r5, r6)
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            r7.updateScope(r8)
        L_0x02e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.AndroidPopup_androidKt.Popup(androidx.compose.ui.window.PopupPositionProvider, kotlin.jvm.functions.Function0, androidx.compose.ui.window.PopupProperties, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void PopupTestTag(String str, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(str, "tag");
        Intrinsics.checkNotNullParameter(function2, "content");
        Composer startRestartGroup = composer.startRestartGroup(-498879600);
        ComposerKt.sourceInformation(startRestartGroup, "C(PopupTestTag)P(1)332@13834L75:AndroidPopup.android.kt#2oxthz");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed((Object) str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-498879600, i2, -1, "androidx.compose.ui.window.PopupTestTag (AndroidPopup.android.kt:331)");
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{LocalPopupTestTag.provides(str)}, function2, startRestartGroup, (i2 & 112) | 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new AndroidPopup_androidKt$PopupTestTag$1(str, function2, i));
        }
    }

    private static final void SimpleStack(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i) {
        composer.startReplaceableGroup(1406149896);
        ComposerKt.sourceInformation(composer, "CC(SimpleStack)P(1)340@14172L979:AndroidPopup.android.kt#2oxthz");
        MeasurePolicy measurePolicy = AndroidPopup_androidKt$SimpleStack$1.INSTANCE;
        composer.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(composer, "CC(Layout)P(!1,2)73@2855L7,74@2910L7,75@2969L7,76@2981L460:Layout.kt#80mrfh");
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(CompositionLocalsKt.getLocalDensity());
        ComposerKt.sourceInformationMarkerEnd(composer);
        Density density = (Density) consume;
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume2 = composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ComposerKt.sourceInformationMarkerEnd(composer);
        LayoutDirection layoutDirection = (LayoutDirection) consume2;
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume3 = composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposerKt.sourceInformationMarkerEnd(composer);
        ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
        Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(modifier);
        int i2 = (((((i << 3) & 112) | ((i >> 3) & 14)) << 9) & 7168) | 6;
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer r3 = Updater.m2444constructorimpl(composer);
        Updater.m2451setimpl(r3, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m2451setimpl(r3, density, ComposeUiNode.Companion.getSetDensity());
        Updater.m2451setimpl(r3, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
        Updater.m2451setimpl(r3, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
        materializerOf.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(composer)), composer, Integer.valueOf((i2 >> 3) & 112));
        composer.startReplaceableGroup(2058660585);
        function2.invoke(composer, Integer.valueOf((i2 >> 9) & 14));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    public static final boolean isFlagSecureEnabled(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        if (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static final IntRect toIntBounds(Rect rect) {
        return new IntRect(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static /* synthetic */ boolean isPopupLayout$default(View view, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return isPopupLayout(view, str);
    }

    public static final boolean isPopupLayout(View view, String str) {
        Intrinsics.checkNotNullParameter(view, "view");
        return (view instanceof PopupLayout) && (str == null || Intrinsics.areEqual((Object) str, (Object) ((PopupLayout) view).getTestTag()));
    }

    /* access modifiers changed from: private */
    public static final Function2<Composer, Integer, Unit> Popup$lambda$1(State<? extends Function2<? super Composer, ? super Integer, Unit>> state) {
        return (Function2) state.getValue();
    }
}
