package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aî\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00132\b\b\u0002\u0010\u001c\u001a\u00020\u001323\b\u0002\u0010\u001d\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00010\u001e¢\u0006\u0002\b\u001f¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u001fH\u0001¢\u0006\u0002\u0010#\u001a0\u0010$\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010%\u001a\u00020&2\u0011\u0010'\u001a\r\u0012\u0004\u0012\u00020\u00010\u001e¢\u0006\u0002\b\u001fH\u0003¢\u0006\u0002\u0010(\u001a\u001d\u0010)\u001a\u00020\u00012\u0006\u0010%\u001a\u00020&2\u0006\u0010*\u001a\u00020\u0013H\u0003¢\u0006\u0002\u0010+\u001a\u0015\u0010,\u001a\u00020\u00012\u0006\u0010%\u001a\u00020&H\u0001¢\u0006\u0002\u0010-\u001a \u0010.\u001a\u00020\u00012\u0006\u0010/\u001a\u0002002\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u00101\u001a\u000202H\u0002\u001a0\u00103\u001a\u00020\u00012\u0006\u00104\u001a\u0002052\u0006\u0010/\u001a\u0002002\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u00101\u001a\u000202H\u0002\u001a\u0010\u00106\u001a\u00020\u00012\u0006\u0010/\u001a\u000200H\u0002\u001a \u00107\u001a\u00020\u00012\u0006\u0010/\u001a\u0002002\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u0013H\u0002\u001a5\u0010;\u001a\u00020\u0001*\u00020<2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020\r2\u0006\u00101\u001a\u000202H@ø\u0001\u0000¢\u0006\u0002\u0010@\u001a\u001c\u0010A\u001a\u00020\u0007*\u00020\u00072\u0006\u0010/\u001a\u0002002\u0006\u0010%\u001a\u00020&H\u0002\u0002\u0004\n\u0002\b\u0019¨\u0006B"}, d2 = {"CoreTextField", "", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "onTextLayout", "Landroidx/compose/ui/text/TextLayoutResult;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "cursorBrush", "Landroidx/compose/ui/graphics/Brush;", "softWrap", "", "maxLines", "", "minLines", "imeOptions", "Landroidx/compose/ui/text/input/ImeOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "enabled", "readOnly", "decorationBox", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ParameterName;", "name", "innerTextField", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;ZIILandroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/foundation/text/KeyboardActions;ZZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "CoreTextFieldRootBox", "manager", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "content", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "SelectionToolbarAndHandles", "show", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;ZLandroidx/compose/runtime/Composer;I)V", "TextFieldCursorHandle", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/runtime/Composer;I)V", "notifyFocusedRect", "state", "Landroidx/compose/foundation/text/TextFieldState;", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "notifyTextInputServiceOnFocusChange", "textInputService", "Landroidx/compose/ui/text/input/TextInputService;", "onBlur", "tapToFocus", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "allowKeyboard", "bringSelectionEndIntoView", "Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "textDelegate", "Landroidx/compose/foundation/text/TextDelegate;", "textLayoutResult", "(Landroidx/compose/foundation/relocation/BringIntoViewRequester;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/text/TextDelegate;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/text/input/OffsetMapping;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "previewKeyEventToDeselectOnBack", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: CoreTextField.kt */
public final class CoreTextFieldKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v1, resolved type: kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r49v1, resolved type: androidx.compose.runtime.saveable.Saver<androidx.compose.foundation.text.TextFieldScrollerPosition, java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v2, resolved type: kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v3, resolved type: kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v4, resolved type: kotlin.jvm.functions.Function3<kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v5, resolved type: kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v6, resolved type: kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v7, resolved type: kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0354  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0374  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x048b  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x0490  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x04e5  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0559  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x058f  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x061a  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x064c  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x06a1  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x06d6  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x078d  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x0790  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x07e7  */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x07ea  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x07ee  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x07f7  */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x085b  */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x0881  */
    /* JADX WARNING: Removed duplicated region for block: B:312:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x013e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void CoreTextField(androidx.compose.ui.text.input.TextFieldValue r46, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> r47, androidx.compose.ui.Modifier r48, androidx.compose.ui.text.TextStyle r49, androidx.compose.ui.text.input.VisualTransformation r50, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> r51, androidx.compose.foundation.interaction.MutableInteractionSource r52, androidx.compose.ui.graphics.Brush r53, boolean r54, int r55, int r56, androidx.compose.ui.text.input.ImeOptions r57, androidx.compose.foundation.text.KeyboardActions r58, boolean r59, boolean r60, kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r61, androidx.compose.runtime.Composer r62, int r63, int r64, int r65) {
        /*
            r15 = r46
            r14 = r47
            r13 = r63
            r12 = r64
            r11 = r65
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "onValueChange"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            r0 = -958708118(0xffffffffc6db466a, float:-28067.207)
            r1 = r62
            androidx.compose.runtime.Composer r10 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(CoreTextField)P(14,10,8,13,15,9,4!1,12,6,7,3,5,2,11)199@11108L29,204@11381L7,205@11442L7,206@11510L7,207@11575L7,215@11884L42,212@11791L135,218@11967L268,230@12540L21,231@12578L324,259@13301L26,262@13387L51,268@13690L7,269@13741L7,270@13798L7,274@13909L24,275@13967L37,512@23161L86,516@23253L515,563@24957L4554:CoreTextField.kt#423gt5"
            androidx.compose.runtime.ComposerKt.sourceInformation(r10, r1)
            r1 = r11 & 1
            if (r1 == 0) goto L_0x002b
            r1 = r13 | 6
            goto L_0x003b
        L_0x002b:
            r1 = r13 & 14
            if (r1 != 0) goto L_0x003a
            boolean r1 = r10.changed((java.lang.Object) r15)
            if (r1 == 0) goto L_0x0037
            r1 = 4
            goto L_0x0038
        L_0x0037:
            r1 = 2
        L_0x0038:
            r1 = r1 | r13
            goto L_0x003b
        L_0x003a:
            r1 = r13
        L_0x003b:
            r4 = r11 & 2
            if (r4 == 0) goto L_0x0042
            r1 = r1 | 48
            goto L_0x0052
        L_0x0042:
            r4 = r13 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0052
            boolean r4 = r10.changedInstance(r14)
            if (r4 == 0) goto L_0x004f
            r4 = 32
            goto L_0x0051
        L_0x004f:
            r4 = 16
        L_0x0051:
            r1 = r1 | r4
        L_0x0052:
            r4 = r11 & 4
            if (r4 == 0) goto L_0x0059
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x006d
        L_0x0059:
            r9 = r13 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x006d
            r9 = r48
            boolean r16 = r10.changed((java.lang.Object) r9)
            if (r16 == 0) goto L_0x0068
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x006a
        L_0x0068:
            r16 = 128(0x80, float:1.794E-43)
        L_0x006a:
            r1 = r1 | r16
            goto L_0x006f
        L_0x006d:
            r9 = r48
        L_0x006f:
            r16 = r11 & 8
            r17 = 1024(0x400, float:1.435E-42)
            r18 = 2048(0x800, float:2.87E-42)
            if (r16 == 0) goto L_0x007a
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x008e
        L_0x007a:
            r2 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x008e
            r2 = r49
            boolean r19 = r10.changed((java.lang.Object) r2)
            if (r19 == 0) goto L_0x0089
            r19 = r18
            goto L_0x008b
        L_0x0089:
            r19 = r17
        L_0x008b:
            r1 = r1 | r19
            goto L_0x0090
        L_0x008e:
            r2 = r49
        L_0x0090:
            r19 = r11 & 16
            r20 = 16384(0x4000, float:2.2959E-41)
            r21 = 8192(0x2000, float:1.14794E-41)
            if (r19 == 0) goto L_0x009d
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            r5 = r50
            goto L_0x00b3
        L_0x009d:
            r22 = 57344(0xe000, float:8.0356E-41)
            r22 = r13 & r22
            r5 = r50
            if (r22 != 0) goto L_0x00b3
            boolean r23 = r10.changed((java.lang.Object) r5)
            if (r23 == 0) goto L_0x00af
            r23 = r20
            goto L_0x00b1
        L_0x00af:
            r23 = r21
        L_0x00b1:
            r1 = r1 | r23
        L_0x00b3:
            r23 = r11 & 32
            if (r23 == 0) goto L_0x00be
            r24 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r24
            r6 = r51
            goto L_0x00d3
        L_0x00be:
            r24 = 458752(0x70000, float:6.42848E-40)
            r24 = r13 & r24
            r6 = r51
            if (r24 != 0) goto L_0x00d3
            boolean r25 = r10.changedInstance(r6)
            if (r25 == 0) goto L_0x00cf
            r25 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00d1
        L_0x00cf:
            r25 = 65536(0x10000, float:9.18355E-41)
        L_0x00d1:
            r1 = r1 | r25
        L_0x00d3:
            r25 = r11 & 64
            if (r25 == 0) goto L_0x00de
            r26 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r26
            r7 = r52
            goto L_0x00f3
        L_0x00de:
            r26 = 3670016(0x380000, float:5.142788E-39)
            r26 = r13 & r26
            r7 = r52
            if (r26 != 0) goto L_0x00f3
            boolean r27 = r10.changed((java.lang.Object) r7)
            if (r27 == 0) goto L_0x00ef
            r27 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00f1
        L_0x00ef:
            r27 = 524288(0x80000, float:7.34684E-40)
        L_0x00f1:
            r1 = r1 | r27
        L_0x00f3:
            r8 = r11 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x00fe
            r28 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r28
            r3 = r53
            goto L_0x0113
        L_0x00fe:
            r28 = 29360128(0x1c00000, float:7.052966E-38)
            r28 = r13 & r28
            r3 = r53
            if (r28 != 0) goto L_0x0113
            boolean r29 = r10.changed((java.lang.Object) r3)
            if (r29 == 0) goto L_0x010f
            r29 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0111
        L_0x010f:
            r29 = 4194304(0x400000, float:5.877472E-39)
        L_0x0111:
            r1 = r1 | r29
        L_0x0113:
            r0 = r11 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x011e
            r30 = 100663296(0x6000000, float:2.4074124E-35)
            r1 = r1 | r30
            r2 = r54
            goto L_0x0133
        L_0x011e:
            r30 = 234881024(0xe000000, float:1.5777218E-30)
            r30 = r13 & r30
            r2 = r54
            if (r30 != 0) goto L_0x0133
            boolean r30 = r10.changed((boolean) r2)
            if (r30 == 0) goto L_0x012f
            r30 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0131
        L_0x012f:
            r30 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0131:
            r1 = r1 | r30
        L_0x0133:
            r2 = r11 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x013e
            r30 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r1 | r30
            r3 = r55
            goto L_0x0153
        L_0x013e:
            r30 = 1879048192(0x70000000, float:1.58456325E29)
            r30 = r13 & r30
            r3 = r55
            if (r30 != 0) goto L_0x0153
            boolean r30 = r10.changed((int) r3)
            if (r30 == 0) goto L_0x014f
            r30 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0151
        L_0x014f:
            r30 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0151:
            r1 = r1 | r30
        L_0x0153:
            r3 = r11 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x015c
            r30 = r12 | 6
            r5 = r56
            goto L_0x0172
        L_0x015c:
            r30 = r12 & 14
            r5 = r56
            if (r30 != 0) goto L_0x0170
            boolean r30 = r10.changed((int) r5)
            if (r30 == 0) goto L_0x016b
            r30 = 4
            goto L_0x016d
        L_0x016b:
            r30 = 2
        L_0x016d:
            r30 = r12 | r30
            goto L_0x0172
        L_0x0170:
            r30 = r12
        L_0x0172:
            r31 = r12 & 112(0x70, float:1.57E-43)
            if (r31 != 0) goto L_0x018c
            r5 = r11 & 2048(0x800, float:2.87E-42)
            if (r5 != 0) goto L_0x0185
            r5 = r57
            boolean r31 = r10.changed((java.lang.Object) r5)
            if (r31 == 0) goto L_0x0187
            r22 = 32
            goto L_0x0189
        L_0x0185:
            r5 = r57
        L_0x0187:
            r22 = 16
        L_0x0189:
            r30 = r30 | r22
            goto L_0x018e
        L_0x018c:
            r5 = r57
        L_0x018e:
            r5 = r30
            r6 = r11 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L_0x0197
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x01ab
        L_0x0197:
            r7 = r12 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x01ab
            r7 = r58
            boolean r22 = r10.changed((java.lang.Object) r7)
            if (r22 == 0) goto L_0x01a6
            r26 = 256(0x100, float:3.59E-43)
            goto L_0x01a8
        L_0x01a6:
            r26 = 128(0x80, float:1.794E-43)
        L_0x01a8:
            r5 = r5 | r26
            goto L_0x01ad
        L_0x01ab:
            r7 = r58
        L_0x01ad:
            r7 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r7 == 0) goto L_0x01b4
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            goto L_0x01c5
        L_0x01b4:
            r9 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x01c5
            r9 = r59
            boolean r22 = r10.changed((boolean) r9)
            if (r22 == 0) goto L_0x01c2
            r17 = r18
        L_0x01c2:
            r5 = r5 | r17
            goto L_0x01c7
        L_0x01c5:
            r9 = r59
        L_0x01c7:
            r9 = r11 & 16384(0x4000, float:2.2959E-41)
            if (r9 == 0) goto L_0x01d0
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
            r14 = r60
            goto L_0x01e4
        L_0x01d0:
            r17 = 57344(0xe000, float:8.0356E-41)
            r17 = r12 & r17
            r14 = r60
            if (r17 != 0) goto L_0x01e4
            boolean r17 = r10.changed((boolean) r14)
            if (r17 == 0) goto L_0x01e0
            goto L_0x01e2
        L_0x01e0:
            r20 = r21
        L_0x01e2:
            r5 = r5 | r20
        L_0x01e4:
            r17 = 32768(0x8000, float:4.5918E-41)
            r17 = r11 & r17
            if (r17 == 0) goto L_0x01f2
            r18 = 196608(0x30000, float:2.75506E-40)
            r5 = r5 | r18
            r12 = r61
            goto L_0x0207
        L_0x01f2:
            r18 = 458752(0x70000, float:6.42848E-40)
            r18 = r12 & r18
            r12 = r61
            if (r18 != 0) goto L_0x0207
            boolean r18 = r10.changedInstance(r12)
            if (r18 == 0) goto L_0x0203
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0205
        L_0x0203:
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x0205:
            r5 = r5 | r18
        L_0x0207:
            r18 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r12 = r1 & r18
            r14 = 306783378(0x12492492, float:6.3469493E-28)
            if (r12 != r14) goto L_0x0243
            r12 = 374491(0x5b6db, float:5.24774E-40)
            r12 = r12 & r5
            r14 = 74898(0x12492, float:1.04954E-40)
            if (r12 != r14) goto L_0x0243
            boolean r12 = r10.getSkipping()
            if (r12 != 0) goto L_0x0221
            goto L_0x0243
        L_0x0221:
            r10.skipToGroupEnd()
            r3 = r48
            r4 = r49
            r5 = r50
            r6 = r51
            r7 = r52
            r8 = r53
            r9 = r54
            r11 = r56
            r12 = r57
            r13 = r58
            r14 = r59
            r15 = r60
            r16 = r61
            r1 = r10
            r10 = r55
            goto L_0x087a
        L_0x0243:
            r10.startDefaults()
            r12 = r13 & 1
            if (r12 == 0) goto L_0x0298
            boolean r12 = r10.getDefaultsInvalid()
            if (r12 == 0) goto L_0x0251
            goto L_0x0298
        L_0x0251:
            r10.skipToGroupEnd()
            r0 = r11 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0279
            r0 = r5 & -113(0xffffffffffffff8f, float:NaN)
            r15 = r48
            r21 = r49
            r14 = r50
            r23 = r51
            r12 = r52
            r24 = r53
            r25 = r54
            r9 = r55
            r26 = r56
            r8 = r57
            r27 = r58
            r7 = r59
            r30 = r60
            r31 = r61
            r2 = r0
            goto L_0x034b
        L_0x0279:
            r15 = r48
            r21 = r49
            r14 = r50
            r23 = r51
            r12 = r52
            r24 = r53
            r25 = r54
            r9 = r55
            r26 = r56
            r8 = r57
            r27 = r58
            r7 = r59
            r30 = r60
            r31 = r61
        L_0x0295:
            r2 = r5
            goto L_0x034b
        L_0x0298:
            if (r4 == 0) goto L_0x029f
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r4 = (androidx.compose.ui.Modifier) r4
            goto L_0x02a1
        L_0x029f:
            r4 = r48
        L_0x02a1:
            if (r16 == 0) goto L_0x02aa
            androidx.compose.ui.text.TextStyle$Companion r12 = androidx.compose.ui.text.TextStyle.Companion
            androidx.compose.ui.text.TextStyle r12 = r12.getDefault()
            goto L_0x02ac
        L_0x02aa:
            r12 = r49
        L_0x02ac:
            if (r19 == 0) goto L_0x02b5
            androidx.compose.ui.text.input.VisualTransformation$Companion r16 = androidx.compose.ui.text.input.VisualTransformation.Companion
            androidx.compose.ui.text.input.VisualTransformation r16 = r16.getNone()
            goto L_0x02b7
        L_0x02b5:
            r16 = r50
        L_0x02b7:
            if (r23 == 0) goto L_0x02be
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$1 r19 = androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$1.INSTANCE
            kotlin.jvm.functions.Function1 r19 = (kotlin.jvm.functions.Function1) r19
            goto L_0x02c0
        L_0x02be:
            r19 = r51
        L_0x02c0:
            if (r25 == 0) goto L_0x02c5
            r20 = 0
            goto L_0x02c7
        L_0x02c5:
            r20 = r52
        L_0x02c7:
            if (r8 == 0) goto L_0x02db
            androidx.compose.ui.graphics.SolidColor r8 = new androidx.compose.ui.graphics.SolidColor
            androidx.compose.ui.graphics.Color$Companion r21 = androidx.compose.ui.graphics.Color.Companion
            long r14 = r21.m2857getUnspecified0d7_KjU()
            r48 = r4
            r4 = 0
            r8.<init>(r14, r4)
            r4 = r8
            androidx.compose.ui.graphics.Brush r4 = (androidx.compose.ui.graphics.Brush) r4
            goto L_0x02df
        L_0x02db:
            r48 = r4
            r4 = r53
        L_0x02df:
            if (r0 == 0) goto L_0x02e3
            r0 = 1
            goto L_0x02e5
        L_0x02e3:
            r0 = r54
        L_0x02e5:
            if (r2 == 0) goto L_0x02eb
            r2 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x02ed
        L_0x02eb:
            r2 = r55
        L_0x02ed:
            if (r3 == 0) goto L_0x02f1
            r3 = 1
            goto L_0x02f3
        L_0x02f1:
            r3 = r56
        L_0x02f3:
            r8 = r11 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x0300
            androidx.compose.ui.text.input.ImeOptions$Companion r8 = androidx.compose.ui.text.input.ImeOptions.Companion
            androidx.compose.ui.text.input.ImeOptions r8 = r8.getDefault()
            r5 = r5 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x0302
        L_0x0300:
            r8 = r57
        L_0x0302:
            if (r6 == 0) goto L_0x030b
            androidx.compose.foundation.text.KeyboardActions$Companion r6 = androidx.compose.foundation.text.KeyboardActions.Companion
            androidx.compose.foundation.text.KeyboardActions r6 = r6.getDefault()
            goto L_0x030d
        L_0x030b:
            r6 = r58
        L_0x030d:
            if (r7 == 0) goto L_0x0311
            r7 = 1
            goto L_0x0313
        L_0x0311:
            r7 = r59
        L_0x0313:
            if (r9 == 0) goto L_0x0317
            r9 = 0
            goto L_0x0319
        L_0x0317:
            r9 = r60
        L_0x0319:
            if (r17 == 0) goto L_0x0332
            androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt r14 = androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt.INSTANCE
            kotlin.jvm.functions.Function3 r14 = r14.m870getLambda1$foundation_release()
            r15 = r48
            r25 = r0
            r26 = r3
            r24 = r4
            r27 = r6
            r30 = r9
            r21 = r12
            r31 = r14
            goto L_0x0342
        L_0x0332:
            r15 = r48
            r31 = r61
            r25 = r0
            r26 = r3
            r24 = r4
            r27 = r6
            r30 = r9
            r21 = r12
        L_0x0342:
            r14 = r16
            r23 = r19
            r12 = r20
            r9 = r2
            goto L_0x0295
        L_0x034b:
            r10.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x035d
            java.lang.String r0 = "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:180)"
            r3 = -958708118(0xffffffffc6db466a, float:-28067.207)
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r1, r2, r0)
        L_0x035d:
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r10.startReplaceableGroup(r0)
            java.lang.String r1 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r10, r1)
            java.lang.Object r3 = r10.rememberedValue()
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r4 = r4.getEmpty()
            if (r3 != r4) goto L_0x037c
            androidx.compose.ui.focus.FocusRequester r3 = new androidx.compose.ui.focus.FocusRequester
            r3.<init>()
            r10.updateRememberedValue(r3)
        L_0x037c:
            r10.endReplaceableGroup()
            androidx.compose.ui.focus.FocusRequester r3 = (androidx.compose.ui.focus.FocusRequester) r3
            r4 = -55012947(0xfffffffffcb891ad, float:-7.666698E36)
            r10.startReplaceableGroup(r4)
            java.lang.String r4 = "203@11342L7"
            androidx.compose.runtime.ComposerKt.sourceInformation(r10, r4)
            java.lang.String r4 = "CC:CompositionLocal.kt#9igjgp"
            r5 = 2023513938(0x789c5f52, float:2.5372864E34)
            if (r7 == 0) goto L_0x03a9
            if (r30 == 0) goto L_0x0396
            goto L_0x03a9
        L_0x0396:
            androidx.compose.runtime.ProvidableCompositionLocal r6 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalTextInputService()
            androidx.compose.runtime.CompositionLocal r6 = (androidx.compose.runtime.CompositionLocal) r6
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r10, r5, r4)
            java.lang.Object r6 = r10.consume(r6)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r10)
            androidx.compose.ui.text.input.TextInputService r6 = (androidx.compose.ui.text.input.TextInputService) r6
            goto L_0x03aa
        L_0x03a9:
            r6 = 0
        L_0x03aa:
            r10.endReplaceableGroup()
            androidx.compose.runtime.ProvidableCompositionLocal r16 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            r0 = r16
            androidx.compose.runtime.CompositionLocal r0 = (androidx.compose.runtime.CompositionLocal) r0
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r10, r5, r4)
            java.lang.Object r0 = r10.consume(r0)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r10)
            r20 = r0
            androidx.compose.ui.unit.Density r20 = (androidx.compose.ui.unit.Density) r20
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalFontFamilyResolver()
            androidx.compose.runtime.CompositionLocal r0 = (androidx.compose.runtime.CompositionLocal) r0
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r10, r5, r4)
            java.lang.Object r0 = r10.consume(r0)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r10)
            androidx.compose.ui.text.font.FontFamily$Resolver r0 = (androidx.compose.ui.text.font.FontFamily.Resolver) r0
            androidx.compose.runtime.ProvidableCompositionLocal r16 = androidx.compose.foundation.text.selection.TextSelectionColorsKt.getLocalTextSelectionColors()
            r11 = r16
            androidx.compose.runtime.CompositionLocal r11 = (androidx.compose.runtime.CompositionLocal) r11
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r10, r5, r4)
            java.lang.Object r11 = r10.consume(r11)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r10)
            androidx.compose.foundation.text.selection.TextSelectionColors r11 = (androidx.compose.foundation.text.selection.TextSelectionColors) r11
            long r16 = r11.m1090getBackgroundColor0d7_KjU()
            androidx.compose.runtime.ProvidableCompositionLocal r11 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalFocusManager()
            androidx.compose.runtime.CompositionLocal r11 = (androidx.compose.runtime.CompositionLocal) r11
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r10, r5, r4)
            java.lang.Object r11 = r10.consume(r11)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r10)
            androidx.compose.ui.focus.FocusManager r11 = (androidx.compose.ui.focus.FocusManager) r11
            r5 = 1
            if (r9 != r5) goto L_0x040d
            if (r25 != 0) goto L_0x040d
            boolean r5 = r8.getSingleLine()
            if (r5 == 0) goto L_0x040d
            androidx.compose.foundation.gestures.Orientation r5 = androidx.compose.foundation.gestures.Orientation.Horizontal
            goto L_0x040f
        L_0x040d:
            androidx.compose.foundation.gestures.Orientation r5 = androidx.compose.foundation.gestures.Orientation.Vertical
        L_0x040f:
            java.lang.Object[] r19 = new java.lang.Object[]{r5}
            androidx.compose.foundation.text.TextFieldScrollerPosition$Companion r29 = androidx.compose.foundation.text.TextFieldScrollerPosition.Companion
            androidx.compose.runtime.saveable.Saver r29 = r29.getSaver()
            r32 = 0
            r13 = 1157296644(0x44faf204, float:2007.563)
            r10.startReplaceableGroup(r13)
            java.lang.String r13 = "CC(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r10, r13)
            boolean r13 = r10.changed((java.lang.Object) r5)
            r33 = r15
            java.lang.Object r15 = r10.rememberedValue()
            if (r13 != 0) goto L_0x043a
            androidx.compose.runtime.Composer$Companion r13 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r13 = r13.getEmpty()
            if (r15 != r13) goto L_0x0445
        L_0x043a:
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$scrollerPosition$1$1 r13 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$scrollerPosition$1$1
            r13.<init>(r5)
            r15 = r13
            kotlin.jvm.functions.Function0 r15 = (kotlin.jvm.functions.Function0) r15
            r10.updateRememberedValue(r15)
        L_0x0445:
            r10.endReplaceableGroup()
            r5 = r15
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            r13 = 72
            r15 = 4
            r48 = r19
            r49 = r29
            r50 = r32
            r51 = r5
            r52 = r10
            r53 = r13
            r54 = r15
            java.lang.Object r5 = androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable((java.lang.Object[]) r48, r49, (java.lang.String) r50, r51, (androidx.compose.runtime.Composer) r52, (int) r53, (int) r54)
            r13 = r5
            androidx.compose.foundation.text.TextFieldScrollerPosition r13 = (androidx.compose.foundation.text.TextFieldScrollerPosition) r13
            r5 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r10.startReplaceableGroup(r5)
            java.lang.String r5 = "CC(remember)P(1,2):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r10, r5)
            r15 = r46
            boolean r5 = r10.changed((java.lang.Object) r15)
            boolean r19 = r10.changed((java.lang.Object) r14)
            r5 = r5 | r19
            r19 = r13
            java.lang.Object r13 = r10.rememberedValue()
            if (r5 != 0) goto L_0x0490
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r5 = r5.getEmpty()
            if (r13 != r5) goto L_0x048b
            goto L_0x0490
        L_0x048b:
            r32 = r9
            r29 = r12
            goto L_0x04b9
        L_0x0490:
            androidx.compose.ui.text.AnnotatedString r5 = r46.getAnnotatedString()
            androidx.compose.ui.text.input.TransformedText r5 = androidx.compose.foundation.text.ValidatingOffsetMappingKt.filterWithValidation(r14, r5)
            androidx.compose.ui.text.TextRange r13 = r46.m5351getCompositionMzsxiRA()
            if (r13 == 0) goto L_0x04b1
            r29 = r12
            long r12 = r13.m5135unboximpl()
            r32 = r9
            androidx.compose.foundation.text.TextFieldDelegate$Companion r9 = androidx.compose.foundation.text.TextFieldDelegate.Companion
            androidx.compose.ui.text.input.TransformedText r9 = r9.m941applyCompositionDecoration72CqOWE(r12, r5)
            if (r9 != 0) goto L_0x04af
            goto L_0x04b5
        L_0x04af:
            r13 = r9
            goto L_0x04b6
        L_0x04b1:
            r32 = r9
            r29 = r12
        L_0x04b5:
            r13 = r5
        L_0x04b6:
            r10.updateRememberedValue(r13)
        L_0x04b9:
            r10.endReplaceableGroup()
            r5 = r13
            androidx.compose.ui.text.input.TransformedText r5 = (androidx.compose.ui.text.input.TransformedText) r5
            androidx.compose.ui.text.AnnotatedString r9 = r5.getText()
            androidx.compose.ui.text.input.OffsetMapping r13 = r5.getOffsetMapping()
            r34 = r2
            r12 = 0
            androidx.compose.runtime.RecomposeScope r2 = androidx.compose.runtime.ComposablesKt.getCurrentRecomposeScope(r10, r12)
            r12 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r10.startReplaceableGroup(r12)
            androidx.compose.runtime.ComposerKt.sourceInformation(r10, r1)
            java.lang.Object r12 = r10.rememberedValue()
            androidx.compose.runtime.Composer$Companion r35 = androidx.compose.runtime.Composer.Companion
            r36 = r5
            java.lang.Object r5 = r35.getEmpty()
            if (r12 != r5) goto L_0x0516
            androidx.compose.foundation.text.TextFieldState r12 = new androidx.compose.foundation.text.TextFieldState
            androidx.compose.foundation.text.TextDelegate r5 = new androidx.compose.foundation.text.TextDelegate
            r35 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 300(0x12c, float:4.2E-43)
            r41 = 0
            r48 = r5
            r49 = r9
            r50 = r21
            r51 = r35
            r52 = r37
            r53 = r25
            r54 = r38
            r55 = r20
            r56 = r0
            r57 = r39
            r58 = r40
            r59 = r41
            r48.<init>(r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59)
            r12.<init>(r5, r2)
            r10.updateRememberedValue(r12)
        L_0x0516:
            r10.endReplaceableGroup()
            r5 = r12
            androidx.compose.foundation.text.TextFieldState r5 = (androidx.compose.foundation.text.TextFieldState) r5
            androidx.compose.ui.text.AnnotatedString r2 = r46.getAnnotatedString()
            r48 = r5
            r49 = r2
            r50 = r9
            r51 = r21
            r52 = r25
            r53 = r20
            r54 = r0
            r55 = r47
            r56 = r27
            r57 = r11
            r58 = r16
            r48.m959updatefnh65Uc(r49, r50, r51, r52, r53, r54, r55, r56, r57, r58)
            androidx.compose.ui.text.input.EditProcessor r0 = r5.getProcessor()
            androidx.compose.ui.text.input.TextInputSession r2 = r5.getInputSession()
            r0.reset(r15, r2)
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r10.startReplaceableGroup(r0)
            androidx.compose.runtime.ComposerKt.sourceInformation(r10, r1)
            java.lang.Object r0 = r10.rememberedValue()
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r0 != r2) goto L_0x0564
            androidx.compose.foundation.text.UndoManager r0 = new androidx.compose.foundation.text.UndoManager
            r2 = 0
            r9 = 0
            r12 = 1
            r0.<init>(r9, r12, r2)
            r10.updateRememberedValue(r0)
        L_0x0564:
            r10.endReplaceableGroup()
            androidx.compose.foundation.text.UndoManager r0 = (androidx.compose.foundation.text.UndoManager) r0
            r16 = 0
            r2 = 2
            r9 = 0
            r48 = r0
            r49 = r46
            r50 = r16
            r52 = r2
            r53 = r9
            androidx.compose.foundation.text.UndoManager.snapshotIfNeeded$default(r48, r49, r50, r52, r53)
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r10.startReplaceableGroup(r2)
            androidx.compose.runtime.ComposerKt.sourceInformation(r10, r1)
            java.lang.Object r2 = r10.rememberedValue()
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r9 = r9.getEmpty()
            if (r2 != r9) goto L_0x0597
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r2 = new androidx.compose.foundation.text.selection.TextFieldSelectionManager
            r2.<init>(r0)
            r10.updateRememberedValue(r2)
        L_0x0597:
            r10.endReplaceableGroup()
            r12 = r2
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r12 = (androidx.compose.foundation.text.selection.TextFieldSelectionManager) r12
            r12.setOffsetMapping$foundation_release(r13)
            r12.setVisualTransformation$foundation_release(r14)
            kotlin.jvm.functions.Function1 r2 = r5.getOnValueChange()
            r12.setOnValueChange$foundation_release(r2)
            r12.setState$foundation_release(r5)
            r12.setValue$foundation_release(r15)
            androidx.compose.runtime.ProvidableCompositionLocal r2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalClipboardManager()
            androidx.compose.runtime.CompositionLocal r2 = (androidx.compose.runtime.CompositionLocal) r2
            r9 = 2023513938(0x789c5f52, float:2.5372864E34)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r10, r9, r4)
            java.lang.Object r2 = r10.consume(r2)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r10)
            androidx.compose.ui.platform.ClipboardManager r2 = (androidx.compose.ui.platform.ClipboardManager) r2
            r12.setClipboardManager$foundation_release(r2)
            androidx.compose.runtime.ProvidableCompositionLocal r2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalTextToolbar()
            androidx.compose.runtime.CompositionLocal r2 = (androidx.compose.runtime.CompositionLocal) r2
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r10, r9, r4)
            java.lang.Object r2 = r10.consume(r2)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r10)
            androidx.compose.ui.platform.TextToolbar r2 = (androidx.compose.ui.platform.TextToolbar) r2
            r12.setTextToolbar(r2)
            androidx.compose.runtime.ProvidableCompositionLocal r2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalHapticFeedback()
            androidx.compose.runtime.CompositionLocal r2 = (androidx.compose.runtime.CompositionLocal) r2
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r10, r9, r4)
            java.lang.Object r2 = r10.consume(r2)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r10)
            androidx.compose.ui.hapticfeedback.HapticFeedback r2 = (androidx.compose.ui.hapticfeedback.HapticFeedback) r2
            r12.setHapticFeedBack(r2)
            r12.setFocusRequester(r3)
            r2 = r30 ^ 1
            r12.setEditable(r2)
            r2 = 773894976(0x2e20b340, float:3.6538994E-11)
            r10.startReplaceableGroup(r2)
            java.lang.String r2 = "CC(rememberCoroutineScope)476@19869L144:Effects.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r10, r2)
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r10.startReplaceableGroup(r2)
            androidx.compose.runtime.ComposerKt.sourceInformation(r10, r1)
            java.lang.Object r2 = r10.rememberedValue()
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r4 = r4.getEmpty()
            if (r2 != r4) goto L_0x062b
            kotlin.coroutines.EmptyCoroutineContext r2 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlin.coroutines.CoroutineContext r2 = (kotlin.coroutines.CoroutineContext) r2
            kotlinx.coroutines.CoroutineScope r2 = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(r2, r10)
            androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller r4 = new androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller
            r4.<init>(r2)
            r10.updateRememberedValue(r4)
            r2 = r4
        L_0x062b:
            r10.endReplaceableGroup()
            androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller r2 = (androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) r2
            kotlinx.coroutines.CoroutineScope r2 = r2.getCoroutineScope()
            r10.endReplaceableGroup()
            r4 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r10.startReplaceableGroup(r4)
            androidx.compose.runtime.ComposerKt.sourceInformation(r10, r1)
            java.lang.Object r1 = r10.rememberedValue()
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r4 = r4.getEmpty()
            if (r1 != r4) goto L_0x0653
            androidx.compose.foundation.relocation.BringIntoViewRequester r1 = androidx.compose.foundation.relocation.BringIntoViewRequesterKt.BringIntoViewRequester()
            r10.updateRememberedValue(r1)
        L_0x0653:
            r10.endReplaceableGroup()
            r16 = r1
            androidx.compose.foundation.relocation.BringIntoViewRequester r16 = (androidx.compose.foundation.relocation.BringIntoViewRequester) r16
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1 r4 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1
            r48 = r4
            r49 = r5
            r50 = r6
            r51 = r46
            r52 = r8
            r53 = r13
            r54 = r12
            r55 = r2
            r56 = r16
            r48.<init>(r49, r50, r51, r52, r53, r54, r55, r56)
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            r9 = r29
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.text.TextFieldGestureModifiersKt.textFieldFocusModifier(r1, r7, r3, r9, r4)
            r2 = -55008430(0xfffffffffcb8a352, float:-7.669561E36)
            r10.startReplaceableGroup(r2)
            java.lang.String r2 = "324@16009L163"
            androidx.compose.runtime.ComposerKt.sourceInformation(r10, r2)
            r2 = 8
            if (r7 == 0) goto L_0x0698
            if (r30 != 0) goto L_0x0698
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2 r4 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2
            r4.<init>(r5)
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            androidx.compose.runtime.EffectsKt.DisposableEffect((java.lang.Object) r5, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) r4, (androidx.compose.runtime.Composer) r10, (int) r2)
        L_0x0698:
            r10.endReplaceableGroup()
            boolean r4 = androidx.compose.foundation.text.TouchMode_androidKt.isInTouchMode()
            if (r4 == 0) goto L_0x06d6
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r4 = (androidx.compose.ui.Modifier) r4
            androidx.compose.foundation.text.TextDragObserver r2 = r12.getTouchSelectionObserver$foundation_release()
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.text.TextFieldGestureModifiersKt.longPressDragGestureFilter(r4, r2, r7)
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r4 = (androidx.compose.ui.Modifier) r4
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$1 r17 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$1
            r48 = r17
            r49 = r5
            r50 = r3
            r51 = r30
            r52 = r12
            r53 = r13
            r48.<init>(r49, r50, r51, r52, r53)
            r60 = r11
            r11 = r17
            kotlin.jvm.functions.Function1 r11 = (kotlin.jvm.functions.Function1) r11
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.text.TextFieldPressGestureFilterKt.tapPressTextFieldModifier(r4, r9, r7, r11)
            androidx.compose.ui.Modifier r2 = r4.then(r2)
            r61 = r1
            r29 = r9
            r1 = 0
            goto L_0x06f3
        L_0x06d6:
            r60 = r11
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r2 = (androidx.compose.ui.Modifier) r2
            androidx.compose.foundation.text.selection.MouseSelectionObserver r4 = r12.getMouseSelectionObserver$foundation_release()
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.text.TextFieldGestureModifiersKt.mouseDragGestureDetector(r2, r4, r7)
            androidx.compose.ui.input.pointer.PointerIcon r4 = androidx.compose.foundation.text.TextPointerIcon_androidKt.getTextPointerIcon()
            r61 = r1
            r29 = r9
            r1 = 0
            r9 = 0
            r11 = 2
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.input.pointer.PointerIconKt.pointerHoverIcon$default(r2, r4, r1, r11, r9)
        L_0x06f3:
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r4 = (androidx.compose.ui.Modifier) r4
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$drawModifier$1 r9 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$drawModifier$1
            r9.<init>(r5, r15, r13)
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            androidx.compose.ui.Modifier r11 = androidx.compose.ui.draw.DrawModifierKt.drawBehind(r4, r9)
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r4 = (androidx.compose.ui.Modifier) r4
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$onPositionedModifier$1 r9 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$onPositionedModifier$1
            r48 = r9
            r49 = r5
            r50 = r7
            r51 = r12
            r52 = r46
            r53 = r13
            r48.<init>(r49, r50, r51, r52, r53)
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            androidx.compose.ui.Modifier r17 = androidx.compose.ui.layout.OnGloballyPositionedModifierKt.onGloballyPositioned(r4, r9)
            boolean r4 = r14 instanceof androidx.compose.ui.text.input.PasswordVisualTransformation
            androidx.compose.ui.Modifier$Companion r9 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r9 = (androidx.compose.ui.Modifier) r9
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1 r18 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1
            r48 = r18
            r49 = r8
            r50 = r36
            r51 = r46
            r52 = r7
            r53 = r4
            r54 = r30
            r55 = r5
            r56 = r13
            r57 = r12
            r58 = r3
            r48.<init>(r49, r50, r51, r52, r53, r54, r55, r56, r57, r58)
            r3 = r18
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            r4 = 1
            androidx.compose.ui.Modifier r3 = androidx.compose.ui.semantics.SemanticsModifierKt.semantics(r9, r4, r3)
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r4 = (androidx.compose.ui.Modifier) r4
            if (r7 == 0) goto L_0x0751
            if (r30 != 0) goto L_0x0751
            r9 = 1
            goto L_0x0752
        L_0x0751:
            r9 = r1
        L_0x0752:
            r48 = r4
            r49 = r5
            r50 = r46
            r51 = r13
            r52 = r24
            r53 = r9
            androidx.compose.ui.Modifier r18 = androidx.compose.foundation.text.TextFieldCursorKt.cursor(r48, r49, r50, r51, r52, r53)
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3 r4 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3
            r4.<init>(r12)
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            r9 = 8
            androidx.compose.runtime.EffectsKt.DisposableEffect((java.lang.Object) r12, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) r4, (androidx.compose.runtime.Composer) r10, (int) r9)
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4 r4 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4
            r4.<init>(r6, r5, r15, r8)
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            int r6 = r34 >> 3
            r6 = r6 & 14
            androidx.compose.runtime.EffectsKt.DisposableEffect((java.lang.Object) r8, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) r4, (androidx.compose.runtime.Composer) r10, (int) r6)
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r4 = (androidx.compose.ui.Modifier) r4
            kotlin.jvm.functions.Function1 r6 = r5.getOnValueChange()
            r9 = r30 ^ 1
            r62 = r10
            r10 = r32
            r15 = 1
            if (r10 != r15) goto L_0x0790
            r22 = r15
            goto L_0x0792
        L_0x0790:
            r22 = r1
        L_0x0792:
            r48 = r4
            r49 = r5
            r50 = r12
            r51 = r46
            r52 = r6
            r53 = r9
            r54 = r22
            r55 = r13
            r56 = r0
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.text.TextFieldKeyInputKt.textFieldKeyInput(r48, r49, r50, r51, r52, r53, r54, r55, r56)
            r4 = r61
            r9 = r33
            androidx.compose.ui.Modifier r4 = r9.then(r4)
            r6 = r60
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.text.TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(r4, r5, r6)
            androidx.compose.ui.Modifier r4 = previewKeyEventToDeselectOnBack(r4, r5, r12)
            androidx.compose.ui.Modifier r0 = r4.then(r0)
            r6 = r19
            r4 = r29
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.text.TextFieldScrollKt.textFieldScrollable(r0, r6, r4, r7)
            androidx.compose.ui.Modifier r0 = r0.then(r2)
            androidx.compose.ui.Modifier r0 = r0.then(r3)
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$decorationBoxModifier$1 r2 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$decorationBoxModifier$1
            r2.<init>(r5)
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            androidx.compose.ui.Modifier r3 = androidx.compose.ui.layout.OnGloballyPositionedModifierKt.onGloballyPositioned(r0, r2)
            if (r7 == 0) goto L_0x07ea
            boolean r0 = r5.getHasFocus()
            if (r0 == 0) goto L_0x07ea
            boolean r0 = androidx.compose.foundation.text.TouchMode_androidKt.isInTouchMode()
            if (r0 == 0) goto L_0x07ea
            r19 = r15
            goto L_0x07ec
        L_0x07ea:
            r19 = r1
        L_0x07ec:
            if (r19 == 0) goto L_0x07f7
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt.textFieldMagnifier(r0, r12)
            goto L_0x07fb
        L_0x07f7:
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
        L_0x07fb:
            r22 = r0
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5 r2 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5
            r0 = r2
            r1 = r31
            r42 = r2
            r2 = r34
            r43 = r3
            r3 = r5
            r28 = r4
            r4 = r21
            r5 = r26
            r29 = r6
            r6 = r10
            r32 = r7
            r7 = r29
            r29 = r8
            r8 = r46
            r34 = r9
            r33 = r28
            r28 = r10
            r9 = r14
            r44 = r62
            r10 = r18
            r48 = r12
            r12 = r17
            r35 = r13
            r13 = r22
            r22 = r14
            r14 = r16
            r15 = r48
            r16 = r19
            r17 = r30
            r18 = r23
            r19 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r0 = -374338080(0xffffffffe9b00de0, float:-2.6604558E25)
            r2 = r42
            r1 = r44
            r3 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r1, r0, r3, r2)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r2 = 448(0x1c0, float:6.28E-43)
            r3 = r48
            r4 = r43
            CoreTextFieldRootBox(r4, r3, r0, r1, r2)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x085e
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x085e:
            r4 = r21
            r5 = r22
            r6 = r23
            r8 = r24
            r9 = r25
            r11 = r26
            r13 = r27
            r10 = r28
            r12 = r29
            r15 = r30
            r16 = r31
            r14 = r32
            r7 = r33
            r3 = r34
        L_0x087a:
            androidx.compose.runtime.ScopeUpdateScope r2 = r1.endRestartGroup()
            if (r2 != 0) goto L_0x0881
            goto L_0x089d
        L_0x0881:
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$6 r20 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$6
            r0 = r20
            r1 = r46
            r45 = r2
            r2 = r47
            r17 = r63
            r18 = r64
            r19 = r65
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r0 = r20
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1 = r45
            r1.updateScope(r0)
        L_0x089d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.input.VisualTransformation, kotlin.jvm.functions.Function1, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, boolean, int, int, androidx.compose.ui.text.input.ImeOptions, androidx.compose.foundation.text.KeyboardActions, boolean, boolean, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final void CoreTextFieldRootBox(Modifier modifier, TextFieldSelectionManager textFieldSelectionManager, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-20551815);
        ComposerKt.sourceInformation(startRestartGroup, "C(CoreTextFieldRootBox)P(2,1)668@29669L95:CoreTextField.kt#423gt5");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-20551815, i, -1, "androidx.compose.foundation.text.CoreTextFieldRootBox (CoreTextField.kt:663)");
        }
        int i2 = (i & 14) | 384;
        startRestartGroup.startReplaceableGroup(733328855);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
        int i3 = i2 >> 3;
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), true, startRestartGroup, (i3 & 112) | (i3 & 14));
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
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(modifier);
        int i4 = ((((i2 << 3) & 112) << 9) & 7168) | 6;
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
        Composer r4 = Updater.m2444constructorimpl(startRestartGroup);
        Updater.m2451setimpl(r4, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m2451setimpl(r4, density, ComposeUiNode.Companion.getSetDensity());
        Updater.m2451setimpl(r4, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
        Updater.m2451setimpl(r4, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i4 >> 3) & 112));
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
        BoxScope boxScope = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1087272644, "C669@29725L33:CoreTextField.kt#423gt5");
        ContextMenu_androidKt.ContextMenuArea(textFieldSelectionManager, function2, startRestartGroup, ((i >> 3) & 112) | 8);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new CoreTextFieldKt$CoreTextFieldRootBox$2(modifier, textFieldSelectionManager, function2, i));
        }
    }

    private static final Modifier previewKeyEventToDeselectOnBack(Modifier modifier, TextFieldState textFieldState, TextFieldSelectionManager textFieldSelectionManager) {
        return KeyInputModifierKt.onPreviewKeyEvent(modifier, new CoreTextFieldKt$previewKeyEventToDeselectOnBack$1(textFieldState, textFieldSelectionManager));
    }

    /* access modifiers changed from: private */
    public static final void tapToFocus(TextFieldState textFieldState, FocusRequester focusRequester, boolean z) {
        TextInputSession inputSession;
        if (!textFieldState.getHasFocus()) {
            focusRequester.requestFocus();
        } else if (z && (inputSession = textFieldState.getInputSession()) != null) {
            inputSession.showSoftwareKeyboard();
        }
    }

    /* access modifiers changed from: private */
    public static final void notifyTextInputServiceOnFocusChange(TextInputService textInputService, TextFieldState textFieldState, TextFieldValue textFieldValue, ImeOptions imeOptions, OffsetMapping offsetMapping) {
        if (textFieldState.getHasFocus()) {
            textFieldState.setInputSession(TextFieldDelegate.Companion.onFocus$foundation_release(textInputService, textFieldValue, textFieldState.getProcessor(), imeOptions, textFieldState.getOnValueChange(), textFieldState.getOnImeActionPerformed()));
            notifyFocusedRect(textFieldState, textFieldValue, offsetMapping);
            return;
        }
        onBlur(textFieldState);
    }

    /* access modifiers changed from: private */
    public static final void onBlur(TextFieldState textFieldState) {
        TextInputSession inputSession = textFieldState.getInputSession();
        if (inputSession != null) {
            TextFieldDelegate.Companion.onBlur$foundation_release(inputSession, textFieldState.getProcessor(), textFieldState.getOnValueChange());
        }
        textFieldState.setInputSession((TextInputSession) null);
    }

    public static final Object bringSelectionEndIntoView(BringIntoViewRequester bringIntoViewRequester, TextFieldValue textFieldValue, TextDelegate textDelegate, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, Continuation<? super Unit> continuation) {
        Rect rect;
        int originalToTransformed = offsetMapping.originalToTransformed(TextRange.m5128getMaximpl(textFieldValue.m5352getSelectiond9O1mEE()));
        if (originalToTransformed < textLayoutResult.getLayoutInput().getText().length()) {
            rect = textLayoutResult.getBoundingBox(originalToTransformed);
        } else if (originalToTransformed != 0) {
            rect = textLayoutResult.getBoundingBox(originalToTransformed - 1);
        } else {
            rect = new Rect(0.0f, 0.0f, 1.0f, (float) IntSize.m5785getHeightimpl(TextFieldDelegateKt.computeSizeForDefaultText$default(textDelegate.getStyle(), textDelegate.getDensity(), textDelegate.getFontFamilyResolver(), (String) null, 0, 24, (Object) null)));
        }
        Object bringIntoView = bringIntoViewRequester.bringIntoView(rect, continuation);
        return bringIntoView == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? bringIntoView : Unit.INSTANCE;
    }

    /* access modifiers changed from: private */
    public static final void SelectionToolbarAndHandles(TextFieldSelectionManager textFieldSelectionManager, boolean z, Composer composer, int i) {
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        Composer startRestartGroup = composer.startRestartGroup(626339208);
        ComposerKt.sourceInformation(startRestartGroup, "C(SelectionToolbarAndHandles)1010@43460L202:CoreTextField.kt#423gt5");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(626339208, i, -1, "androidx.compose.foundation.text.SelectionToolbarAndHandles (CoreTextField.kt:991)");
        }
        if (z) {
            TextFieldState state$foundation_release = textFieldSelectionManager.getState$foundation_release();
            TextLayoutResult textLayoutResult = null;
            if (!(state$foundation_release == null || (layoutResult = state$foundation_release.getLayoutResult()) == null || (value = layoutResult.getValue()) == null)) {
                TextFieldState state$foundation_release2 = textFieldSelectionManager.getState$foundation_release();
                if (!(state$foundation_release2 != null ? state$foundation_release2.isLayoutResultStale() : true)) {
                    textLayoutResult = value;
                }
            }
            if (textLayoutResult != null) {
                if (!TextRange.m5125getCollapsedimpl(textFieldSelectionManager.getValue$foundation_release().m5352getSelectiond9O1mEE())) {
                    int originalToTransformed = textFieldSelectionManager.getOffsetMapping$foundation_release().originalToTransformed(TextRange.m5131getStartimpl(textFieldSelectionManager.getValue$foundation_release().m5352getSelectiond9O1mEE()));
                    int originalToTransformed2 = textFieldSelectionManager.getOffsetMapping$foundation_release().originalToTransformed(TextRange.m5126getEndimpl(textFieldSelectionManager.getValue$foundation_release().m5352getSelectiond9O1mEE()));
                    ResolvedTextDirection bidiRunDirection = textLayoutResult.getBidiRunDirection(originalToTransformed);
                    ResolvedTextDirection bidiRunDirection2 = textLayoutResult.getBidiRunDirection(Math.max(originalToTransformed2 - 1, 0));
                    startRestartGroup.startReplaceableGroup(-498391544);
                    ComposerKt.sourceInformation(startRestartGroup, "1003@43137L203");
                    TextFieldState state$foundation_release3 = textFieldSelectionManager.getState$foundation_release();
                    if (state$foundation_release3 != null && state$foundation_release3.getShowSelectionHandleStart()) {
                        TextFieldSelectionManagerKt.TextFieldSelectionHandle(true, bidiRunDirection, textFieldSelectionManager, startRestartGroup, 518);
                    }
                    startRestartGroup.endReplaceableGroup();
                    TextFieldState state$foundation_release4 = textFieldSelectionManager.getState$foundation_release();
                    if (state$foundation_release4 != null && state$foundation_release4.getShowSelectionHandleEnd()) {
                        TextFieldSelectionManagerKt.TextFieldSelectionHandle(false, bidiRunDirection2, textFieldSelectionManager, startRestartGroup, 518);
                    }
                }
                TextFieldState state$foundation_release5 = textFieldSelectionManager.getState$foundation_release();
                if (state$foundation_release5 != null) {
                    if (textFieldSelectionManager.isTextChanged$foundation_release()) {
                        state$foundation_release5.setShowFloatingToolbar(false);
                    }
                    if (state$foundation_release5.getHasFocus()) {
                        if (state$foundation_release5.getShowFloatingToolbar()) {
                            textFieldSelectionManager.showSelectionToolbar$foundation_release();
                        } else {
                            textFieldSelectionManager.hideSelectionToolbar$foundation_release();
                        }
                    }
                }
            }
        } else {
            textFieldSelectionManager.hideSelectionToolbar$foundation_release();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new CoreTextFieldKt$SelectionToolbarAndHandles$2(textFieldSelectionManager, z, i));
        }
    }

    public static final void TextFieldCursorHandle(TextFieldSelectionManager textFieldSelectionManager, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(textFieldSelectionManager, "manager");
        Composer startRestartGroup = composer.startRestartGroup(-1436003720);
        ComposerKt.sourceInformation(startRestartGroup, "C(TextFieldCursorHandle)1036@44505L50,1037@44618L7,1044@44875L205,1038@44635L483:CoreTextField.kt#423gt5");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1436003720, i, -1, "androidx.compose.foundation.text.TextFieldCursorHandle (CoreTextField.kt:1034)");
        }
        TextFieldState state$foundation_release = textFieldSelectionManager.getState$foundation_release();
        if (state$foundation_release != null && state$foundation_release.getShowCursorHandle()) {
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed((Object) textFieldSelectionManager);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = textFieldSelectionManager.cursorDragObserver$foundation_release();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            TextDragObserver textDragObserver = (TextDragObserver) rememberedValue;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            long r5 = textFieldSelectionManager.m1071getCursorPositiontuRUvjQ$foundation_release((Density) consume);
            Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput((Modifier) Modifier.Companion, (Object) textDragObserver, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) new CoreTextFieldKt$TextFieldCursorHandle$1(textDragObserver, (Continuation<? super CoreTextFieldKt$TextFieldCursorHandle$1>) null));
            Offset r4 = Offset.m2561boximpl(r5);
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed2 = startRestartGroup.changed((Object) r4);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new CoreTextFieldKt$TextFieldCursorHandle$2$1(r5);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            AndroidCursorHandle_androidKt.m854CursorHandleULxng0E(r5, SemanticsModifierKt.semantics$default(pointerInput, false, (Function1) rememberedValue2, 1, (Object) null), (Function2<? super Composer, ? super Integer, Unit>) null, startRestartGroup, 384);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new CoreTextFieldKt$TextFieldCursorHandle$3(textFieldSelectionManager, i));
        }
    }

    /* access modifiers changed from: private */
    public static final void notifyFocusedRect(TextFieldState textFieldState, TextFieldValue textFieldValue, OffsetMapping offsetMapping) {
        Snapshot makeCurrent;
        Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
        try {
            makeCurrent = createNonObservableSnapshot.makeCurrent();
            TextLayoutResultProxy layoutResult = textFieldState.getLayoutResult();
            if (layoutResult == null) {
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
                createNonObservableSnapshot.dispose();
                return;
            }
            TextInputSession inputSession = textFieldState.getInputSession();
            if (inputSession == null) {
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
                createNonObservableSnapshot.dispose();
                return;
            }
            LayoutCoordinates layoutCoordinates = textFieldState.getLayoutCoordinates();
            if (layoutCoordinates == null) {
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
                createNonObservableSnapshot.dispose();
                return;
            }
            TextFieldDelegate.Companion.notifyFocusedRect$foundation_release(textFieldValue, textFieldState.getTextDelegate(), layoutResult.getValue(), layoutCoordinates, inputSession, textFieldState.getHasFocus(), offsetMapping);
            Unit unit = Unit.INSTANCE;
            createNonObservableSnapshot.restoreCurrent(makeCurrent);
            createNonObservableSnapshot.dispose();
        } catch (Throwable th) {
            createNonObservableSnapshot.dispose();
            throw th;
        }
    }
}
