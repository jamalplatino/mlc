package androidx.compose.foundation.text;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000l\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\u001aâ\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b23\b\u0002\u0010\u001c\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00010\u001d¢\u0006\u0002\b\u001e¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u001eH\u0007¢\u0006\u0002\u0010\"\u001aì\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010#\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b23\b\u0002\u0010\u001c\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00010\u001d¢\u0006\u0002\b\u001e¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u001eH\u0007¢\u0006\u0002\u0010$\u001aâ\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020%2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b23\b\u0002\u0010\u001c\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00010\u001d¢\u0006\u0002\b\u001e¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u001eH\u0007¢\u0006\u0002\u0010&\u001aì\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020%2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010#\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b23\b\u0002\u0010\u001c\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00010\u001d¢\u0006\u0002\b\u001e¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u001eH\u0007¢\u0006\u0002\u0010'¨\u0006("}, d2 = {"BasicTextField", "", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "readOnly", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "singleLine", "maxLines", "", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "onTextLayout", "Landroidx/compose/ui/text/TextLayoutResult;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "cursorBrush", "Landroidx/compose/ui/graphics/Brush;", "decorationBox", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ParameterName;", "name", "innerTextField", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "minLines", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: BasicTextField.kt */
public final class BasicTextFieldKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v0, resolved type: kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v1, resolved type: kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v2, resolved type: kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v3, resolved type: kotlin.jvm.functions.Function3<kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v28, resolved type: androidx.compose.foundation.interaction.MutableInteractionSource} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v4, resolved type: kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x04de  */
    /* JADX WARNING: Removed duplicated region for block: B:267:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0139  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void BasicTextField(java.lang.String r40, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r41, androidx.compose.ui.Modifier r42, boolean r43, boolean r44, androidx.compose.ui.text.TextStyle r45, androidx.compose.foundation.text.KeyboardOptions r46, androidx.compose.foundation.text.KeyboardActions r47, boolean r48, int r49, int r50, androidx.compose.ui.text.input.VisualTransformation r51, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> r52, androidx.compose.foundation.interaction.MutableInteractionSource r53, androidx.compose.ui.graphics.Brush r54, kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r55, androidx.compose.runtime.Composer r56, int r57, int r58, int r59) {
        /*
            r1 = r40
            r2 = r41
            r15 = r57
            r14 = r58
            r13 = r59
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "onValueChange"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 945255183(0x3857730f, float:5.136715E-5)
            r3 = r56
            androidx.compose.runtime.Composer r3 = r3.startRestartGroup(r0)
            java.lang.String r4 = "C(BasicTextField)P(14,10,8,2,11,13,5,4,12,6,7,15,9,3)136@7932L39,143@8326L57,149@8679L216,149@8668L227,158@9216L41,162@9334L373,160@9263L1032:BasicTextField.kt#423gt5"
            androidx.compose.runtime.ComposerKt.sourceInformation(r3, r4)
            r4 = r13 & 1
            if (r4 == 0) goto L_0x002b
            r4 = r15 | 6
            goto L_0x003b
        L_0x002b:
            r4 = r15 & 14
            if (r4 != 0) goto L_0x003a
            boolean r4 = r3.changed((java.lang.Object) r1)
            if (r4 == 0) goto L_0x0037
            r4 = 4
            goto L_0x0038
        L_0x0037:
            r4 = 2
        L_0x0038:
            r4 = r4 | r15
            goto L_0x003b
        L_0x003a:
            r4 = r15
        L_0x003b:
            r7 = r13 & 2
            if (r7 == 0) goto L_0x0042
            r4 = r4 | 48
            goto L_0x0052
        L_0x0042:
            r7 = r15 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x0052
            boolean r7 = r3.changedInstance(r2)
            if (r7 == 0) goto L_0x004f
            r7 = 32
            goto L_0x0051
        L_0x004f:
            r7 = 16
        L_0x0051:
            r4 = r4 | r7
        L_0x0052:
            r7 = r13 & 4
            if (r7 == 0) goto L_0x0059
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x006d
        L_0x0059:
            r12 = r15 & 896(0x380, float:1.256E-42)
            if (r12 != 0) goto L_0x006d
            r12 = r42
            boolean r16 = r3.changed((java.lang.Object) r12)
            if (r16 == 0) goto L_0x0068
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x006a
        L_0x0068:
            r16 = 128(0x80, float:1.794E-43)
        L_0x006a:
            r4 = r4 | r16
            goto L_0x006f
        L_0x006d:
            r12 = r42
        L_0x006f:
            r16 = r13 & 8
            r17 = 2048(0x800, float:2.87E-42)
            r18 = 1024(0x400, float:1.435E-42)
            if (r16 == 0) goto L_0x007a
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x008e
        L_0x007a:
            r5 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x008e
            r5 = r43
            boolean r19 = r3.changed((boolean) r5)
            if (r19 == 0) goto L_0x0089
            r19 = r17
            goto L_0x008b
        L_0x0089:
            r19 = r18
        L_0x008b:
            r4 = r4 | r19
            goto L_0x0090
        L_0x008e:
            r5 = r43
        L_0x0090:
            r19 = r13 & 16
            r20 = 16384(0x4000, float:2.2959E-41)
            r21 = 8192(0x2000, float:1.14794E-41)
            r22 = 57344(0xe000, float:8.0356E-41)
            if (r19 == 0) goto L_0x00a0
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            r8 = r44
            goto L_0x00b3
        L_0x00a0:
            r23 = r15 & r22
            r8 = r44
            if (r23 != 0) goto L_0x00b3
            boolean r24 = r3.changed((boolean) r8)
            if (r24 == 0) goto L_0x00af
            r24 = r20
            goto L_0x00b1
        L_0x00af:
            r24 = r21
        L_0x00b1:
            r4 = r4 | r24
        L_0x00b3:
            r24 = r13 & 32
            r25 = 458752(0x70000, float:6.42848E-40)
            if (r24 == 0) goto L_0x00c0
            r26 = 196608(0x30000, float:2.75506E-40)
            r4 = r4 | r26
            r9 = r45
            goto L_0x00d3
        L_0x00c0:
            r26 = r15 & r25
            r9 = r45
            if (r26 != 0) goto L_0x00d3
            boolean r27 = r3.changed((java.lang.Object) r9)
            if (r27 == 0) goto L_0x00cf
            r27 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00d1
        L_0x00cf:
            r27 = 65536(0x10000, float:9.18355E-41)
        L_0x00d1:
            r4 = r4 | r27
        L_0x00d3:
            r27 = r13 & 64
            if (r27 == 0) goto L_0x00de
            r28 = 1572864(0x180000, float:2.204052E-39)
            r4 = r4 | r28
            r10 = r46
            goto L_0x00f3
        L_0x00de:
            r28 = 3670016(0x380000, float:5.142788E-39)
            r28 = r15 & r28
            r10 = r46
            if (r28 != 0) goto L_0x00f3
            boolean r29 = r3.changed((java.lang.Object) r10)
            if (r29 == 0) goto L_0x00ef
            r29 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00f1
        L_0x00ef:
            r29 = 524288(0x80000, float:7.34684E-40)
        L_0x00f1:
            r4 = r4 | r29
        L_0x00f3:
            r11 = r13 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x00fe
            r30 = 12582912(0xc00000, float:1.7632415E-38)
            r4 = r4 | r30
            r6 = r47
            goto L_0x0113
        L_0x00fe:
            r30 = 29360128(0x1c00000, float:7.052966E-38)
            r30 = r15 & r30
            r6 = r47
            if (r30 != 0) goto L_0x0113
            boolean r31 = r3.changed((java.lang.Object) r6)
            if (r31 == 0) goto L_0x010f
            r31 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0111
        L_0x010f:
            r31 = 4194304(0x400000, float:5.877472E-39)
        L_0x0111:
            r4 = r4 | r31
        L_0x0113:
            r0 = r13 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x011e
            r32 = 100663296(0x6000000, float:2.4074124E-35)
            r4 = r4 | r32
            r5 = r48
            goto L_0x0133
        L_0x011e:
            r32 = 234881024(0xe000000, float:1.5777218E-30)
            r32 = r15 & r32
            r5 = r48
            if (r32 != 0) goto L_0x0133
            boolean r32 = r3.changed((boolean) r5)
            if (r32 == 0) goto L_0x012f
            r32 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0131
        L_0x012f:
            r32 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0131:
            r4 = r4 | r32
        L_0x0133:
            r32 = 1879048192(0x70000000, float:1.58456325E29)
            r32 = r15 & r32
            if (r32 != 0) goto L_0x014f
            r5 = r13 & 512(0x200, float:7.175E-43)
            if (r5 != 0) goto L_0x0148
            r5 = r49
            boolean r32 = r3.changed((int) r5)
            if (r32 == 0) goto L_0x014a
            r32 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x014c
        L_0x0148:
            r5 = r49
        L_0x014a:
            r32 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x014c:
            r4 = r4 | r32
            goto L_0x0151
        L_0x014f:
            r5 = r49
        L_0x0151:
            r5 = r13 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L_0x015a
            r32 = r14 | 6
            r6 = r50
            goto L_0x0170
        L_0x015a:
            r32 = r14 & 14
            r6 = r50
            if (r32 != 0) goto L_0x016e
            boolean r32 = r3.changed((int) r6)
            if (r32 == 0) goto L_0x0169
            r32 = 4
            goto L_0x016b
        L_0x0169:
            r32 = 2
        L_0x016b:
            r32 = r14 | r32
            goto L_0x0170
        L_0x016e:
            r32 = r14
        L_0x0170:
            r6 = r13 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x0177
            r32 = r32 | 48
            goto L_0x018a
        L_0x0177:
            r33 = r14 & 112(0x70, float:1.57E-43)
            r8 = r51
            if (r33 != 0) goto L_0x018a
            boolean r33 = r3.changed((java.lang.Object) r8)
            if (r33 == 0) goto L_0x0186
            r23 = 32
            goto L_0x0188
        L_0x0186:
            r23 = 16
        L_0x0188:
            r32 = r32 | r23
        L_0x018a:
            r8 = r32
            r9 = r13 & 4096(0x1000, float:5.74E-42)
            if (r9 == 0) goto L_0x0193
            r8 = r8 | 384(0x180, float:5.38E-43)
            goto L_0x01a7
        L_0x0193:
            r10 = r14 & 896(0x380, float:1.256E-42)
            if (r10 != 0) goto L_0x01a7
            r10 = r52
            boolean r23 = r3.changedInstance(r10)
            if (r23 == 0) goto L_0x01a2
            r28 = 256(0x100, float:3.59E-43)
            goto L_0x01a4
        L_0x01a2:
            r28 = 128(0x80, float:1.794E-43)
        L_0x01a4:
            r8 = r8 | r28
            goto L_0x01a9
        L_0x01a7:
            r10 = r52
        L_0x01a9:
            r10 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r10 == 0) goto L_0x01b0
            r8 = r8 | 3072(0xc00, float:4.305E-42)
            goto L_0x01c2
        L_0x01b0:
            r12 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r12 != 0) goto L_0x01c2
            r12 = r53
            boolean r23 = r3.changed((java.lang.Object) r12)
            if (r23 == 0) goto L_0x01bd
            goto L_0x01bf
        L_0x01bd:
            r17 = r18
        L_0x01bf:
            r8 = r8 | r17
            goto L_0x01c4
        L_0x01c2:
            r12 = r53
        L_0x01c4:
            r12 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r12 == 0) goto L_0x01cd
            r8 = r8 | 24576(0x6000, float:3.4438E-41)
            r2 = r54
            goto L_0x01de
        L_0x01cd:
            r17 = r14 & r22
            r2 = r54
            if (r17 != 0) goto L_0x01de
            boolean r17 = r3.changed((java.lang.Object) r2)
            if (r17 == 0) goto L_0x01da
            goto L_0x01dc
        L_0x01da:
            r20 = r21
        L_0x01dc:
            r8 = r8 | r20
        L_0x01de:
            r17 = 32768(0x8000, float:4.5918E-41)
            r17 = r13 & r17
            if (r17 == 0) goto L_0x01ec
            r18 = 196608(0x30000, float:2.75506E-40)
            r8 = r8 | r18
            r2 = r55
            goto L_0x01ff
        L_0x01ec:
            r18 = r14 & r25
            r2 = r55
            if (r18 != 0) goto L_0x01ff
            boolean r18 = r3.changedInstance(r2)
            if (r18 == 0) goto L_0x01fb
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01fd
        L_0x01fb:
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x01fd:
            r8 = r8 | r18
        L_0x01ff:
            r18 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r2 = r4 & r18
            r14 = 306783378(0x12492492, float:6.3469493E-28)
            if (r2 != r14) goto L_0x023c
            r2 = 374491(0x5b6db, float:5.24774E-40)
            r2 = r2 & r8
            r14 = 74898(0x12492, float:1.04954E-40)
            if (r2 != r14) goto L_0x023c
            boolean r2 = r3.getSkipping()
            if (r2 != 0) goto L_0x0219
            goto L_0x023c
        L_0x0219:
            r3.skipToGroupEnd()
            r5 = r41
            r4 = r42
            r7 = r43
            r6 = r44
            r8 = r45
            r9 = r46
            r11 = r47
            r10 = r48
            r12 = r49
            r13 = r50
            r14 = r51
            r15 = r52
            r36 = r53
            r37 = r54
            r16 = r55
            goto L_0x04d7
        L_0x023c:
            r3.startDefaults()
            r2 = r15 & 1
            r18 = 1
            if (r2 == 0) goto L_0x0276
            boolean r2 = r3.getDefaultsInvalid()
            if (r2 == 0) goto L_0x024c
            goto L_0x0276
        L_0x024c:
            r3.skipToGroupEnd()
            r0 = r13 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0257
            r0 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r4 = r4 & r0
        L_0x0257:
            r2 = r42
            r7 = r43
            r0 = r44
            r5 = r46
            r11 = r47
            r6 = r48
            r14 = r49
            r49 = r50
            r10 = r51
            r12 = r52
            r36 = r53
            r37 = r54
            r38 = r55
            r9 = r4
            r4 = r45
            goto L_0x0351
        L_0x0276:
            if (r7 == 0) goto L_0x027d
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r2 = (androidx.compose.ui.Modifier) r2
            goto L_0x027f
        L_0x027d:
            r2 = r42
        L_0x027f:
            if (r16 == 0) goto L_0x0284
            r7 = r18
            goto L_0x0286
        L_0x0284:
            r7 = r43
        L_0x0286:
            if (r19 == 0) goto L_0x028b
            r16 = 0
            goto L_0x028d
        L_0x028b:
            r16 = r44
        L_0x028d:
            if (r24 == 0) goto L_0x0296
            androidx.compose.ui.text.TextStyle$Companion r19 = androidx.compose.ui.text.TextStyle.Companion
            androidx.compose.ui.text.TextStyle r19 = r19.getDefault()
            goto L_0x0298
        L_0x0296:
            r19 = r45
        L_0x0298:
            if (r27 == 0) goto L_0x02a1
            androidx.compose.foundation.text.KeyboardOptions$Companion r20 = androidx.compose.foundation.text.KeyboardOptions.Companion
            androidx.compose.foundation.text.KeyboardOptions r20 = r20.getDefault()
            goto L_0x02a3
        L_0x02a1:
            r20 = r46
        L_0x02a3:
            if (r11 == 0) goto L_0x02ac
            androidx.compose.foundation.text.KeyboardActions$Companion r11 = androidx.compose.foundation.text.KeyboardActions.Companion
            androidx.compose.foundation.text.KeyboardActions r11 = r11.getDefault()
            goto L_0x02ae
        L_0x02ac:
            r11 = r47
        L_0x02ae:
            if (r0 == 0) goto L_0x02b2
            r0 = 0
            goto L_0x02b4
        L_0x02b2:
            r0 = r48
        L_0x02b4:
            r14 = r13 & 512(0x200, float:7.175E-43)
            if (r14 == 0) goto L_0x02c6
            if (r0 == 0) goto L_0x02bd
            r14 = r18
            goto L_0x02c0
        L_0x02bd:
            r14 = 2147483647(0x7fffffff, float:NaN)
        L_0x02c0:
            r23 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r4 = r4 & r23
            goto L_0x02c8
        L_0x02c6:
            r14 = r49
        L_0x02c8:
            if (r5 == 0) goto L_0x02cd
            r5 = r18
            goto L_0x02cf
        L_0x02cd:
            r5 = r50
        L_0x02cf:
            if (r6 == 0) goto L_0x02d8
            androidx.compose.ui.text.input.VisualTransformation$Companion r6 = androidx.compose.ui.text.input.VisualTransformation.Companion
            androidx.compose.ui.text.input.VisualTransformation r6 = r6.getNone()
            goto L_0x02da
        L_0x02d8:
            r6 = r51
        L_0x02da:
            if (r9 == 0) goto L_0x02e1
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$1 r9 = androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$1.INSTANCE
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            goto L_0x02e3
        L_0x02e1:
            r9 = r52
        L_0x02e3:
            if (r10 == 0) goto L_0x030c
            r10 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r3.startReplaceableGroup(r10)
            java.lang.String r10 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r3, r10)
            java.lang.Object r10 = r3.rememberedValue()
            androidx.compose.runtime.Composer$Companion r23 = androidx.compose.runtime.Composer.Companion
            r42 = r0
            java.lang.Object r0 = r23.getEmpty()
            if (r10 != r0) goto L_0x0305
            androidx.compose.foundation.interaction.MutableInteractionSource r10 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r3.updateRememberedValue(r10)
        L_0x0305:
            r3.endReplaceableGroup()
            r0 = r10
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = (androidx.compose.foundation.interaction.MutableInteractionSource) r0
            goto L_0x0310
        L_0x030c:
            r42 = r0
            r0 = r53
        L_0x0310:
            if (r12 == 0) goto L_0x0326
            androidx.compose.ui.graphics.SolidColor r10 = new androidx.compose.ui.graphics.SolidColor
            androidx.compose.ui.graphics.Color$Companion r12 = androidx.compose.ui.graphics.Color.Companion
            r43 = r4
            r44 = r5
            long r4 = r12.m2847getBlack0d7_KjU()
            r12 = 0
            r10.<init>(r4, r12)
            r4 = r10
            androidx.compose.ui.graphics.Brush r4 = (androidx.compose.ui.graphics.Brush) r4
            goto L_0x032c
        L_0x0326:
            r43 = r4
            r44 = r5
            r4 = r54
        L_0x032c:
            if (r17 == 0) goto L_0x033d
            androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt r5 = androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt.INSTANCE
            kotlin.jvm.functions.Function3 r5 = r5.m865getLambda1$foundation_release()
            r49 = r44
            r36 = r0
            r37 = r4
            r38 = r5
            goto L_0x0345
        L_0x033d:
            r49 = r44
            r38 = r55
            r36 = r0
            r37 = r4
        L_0x0345:
            r10 = r6
            r12 = r9
            r0 = r16
            r4 = r19
            r5 = r20
            r6 = r42
            r9 = r43
        L_0x0351:
            r3.endDefaults()
            boolean r16 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r16 == 0) goto L_0x0366
            java.lang.String r13 = "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:122)"
            r50 = r14
            r14 = 945255183(0x3857730f, float:5.136715E-5)
            androidx.compose.runtime.ComposerKt.traceEventStart(r14, r9, r8, r13)
            goto L_0x0368
        L_0x0366:
            r50 = r14
        L_0x0368:
            r13 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r3.startReplaceableGroup(r13)
            java.lang.String r13 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r3, r13)
            java.lang.Object r13 = r3.rememberedValue()
            androidx.compose.runtime.Composer$Companion r14 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r14 = r14.getEmpty()
            if (r13 != r14) goto L_0x03a0
            androidx.compose.ui.text.input.TextFieldValue r13 = new androidx.compose.ui.text.input.TextFieldValue
            r16 = 0
            r14 = 0
            r19 = 6
            r20 = 0
            r42 = r13
            r43 = r40
            r44 = r16
            r46 = r14
            r47 = r19
            r48 = r20
            r42.<init>((java.lang.String) r43, (long) r44, (androidx.compose.ui.text.TextRange) r46, (int) r47, (kotlin.jvm.internal.DefaultConstructorMarker) r48)
            r14 = 0
            r15 = 2
            androidx.compose.runtime.MutableState r13 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r13, r14, r15, r14)
            r3.updateRememberedValue(r13)
        L_0x03a0:
            r3.endReplaceableGroup()
            androidx.compose.runtime.MutableState r13 = (androidx.compose.runtime.MutableState) r13
            androidx.compose.ui.text.input.TextFieldValue r14 = BasicTextField$lambda$2(r13)
            r15 = 0
            r17 = 0
            r19 = 6
            r20 = 0
            r42 = r14
            r43 = r40
            r44 = r15
            r46 = r17
            r47 = r19
            r48 = r20
            androidx.compose.ui.text.input.TextFieldValue r14 = androidx.compose.ui.text.input.TextFieldValue.m5348copy3r_uNRQ$default((androidx.compose.ui.text.input.TextFieldValue) r42, (java.lang.String) r43, (long) r44, (androidx.compose.ui.text.TextRange) r46, (int) r47, (java.lang.Object) r48)
            r15 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r3.startReplaceableGroup(r15)
            java.lang.String r15 = "CC(remember)P(1,2):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r3, r15)
            boolean r15 = r3.changed((java.lang.Object) r14)
            boolean r16 = r3.changed((java.lang.Object) r13)
            r15 = r15 | r16
            r42 = r0
            java.lang.Object r0 = r3.rememberedValue()
            if (r15 != 0) goto L_0x03e6
            androidx.compose.runtime.Composer$Companion r15 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r15 = r15.getEmpty()
            if (r0 != r15) goto L_0x03f0
        L_0x03e6:
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1 r0 = new androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
            r0.<init>(r14, r13)
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            r3.updateRememberedValue(r0)
        L_0x03f0:
            r3.endReplaceableGroup()
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            r15 = 0
            androidx.compose.runtime.EffectsKt.SideEffect(r0, r3, r15)
            r0 = 1157296644(0x44faf204, float:2007.563)
            r3.startReplaceableGroup(r0)
            java.lang.String r0 = "CC(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r3, r0)
            boolean r0 = r3.changed((java.lang.Object) r1)
            java.lang.Object r15 = r3.rememberedValue()
            if (r0 != 0) goto L_0x0416
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r0 = r0.getEmpty()
            if (r15 != r0) goto L_0x041f
        L_0x0416:
            r0 = 0
            r15 = 2
            androidx.compose.runtime.MutableState r15 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r1, r0, r15, r0)
            r3.updateRememberedValue(r15)
        L_0x041f:
            r3.endReplaceableGroup()
            androidx.compose.runtime.MutableState r15 = (androidx.compose.runtime.MutableState) r15
            androidx.compose.ui.text.input.ImeOptions r27 = r5.toImeOptions$foundation_release(r6)
            r24 = r6 ^ 1
            if (r6 == 0) goto L_0x042f
            r26 = r18
            goto L_0x0431
        L_0x042f:
            r26 = r49
        L_0x0431:
            if (r6 == 0) goto L_0x0436
            r0 = r18
            goto L_0x0438
        L_0x0436:
            r0 = r50
        L_0x0438:
            r1 = 1618982084(0x607fb4c4, float:7.370227E19)
            r3.startReplaceableGroup(r1)
            java.lang.String r1 = "CC(remember)P(1,2,3):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r3, r1)
            boolean r1 = r3.changed((java.lang.Object) r13)
            boolean r16 = r3.changed((java.lang.Object) r15)
            r1 = r1 | r16
            r43 = r5
            r5 = r41
            boolean r16 = r3.changed((java.lang.Object) r5)
            r1 = r1 | r16
            r44 = r6
            java.lang.Object r6 = r3.rememberedValue()
            if (r1 != 0) goto L_0x0467
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r6 != r1) goto L_0x0472
        L_0x0467:
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1 r1 = new androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1
            r1.<init>(r5, r13, r15)
            r6 = r1
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            r3.updateRememberedValue(r6)
        L_0x0472:
            r3.endReplaceableGroup()
            r17 = r6
            kotlin.jvm.functions.Function1 r17 = (kotlin.jvm.functions.Function1) r17
            r1 = r9 & 896(0x380, float:1.256E-42)
            int r6 = r9 >> 6
            r6 = r6 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r6
            int r6 = r8 << 9
            r13 = r6 & r22
            r1 = r1 | r13
            r13 = r6 & r25
            r1 = r1 | r13
            r13 = 3670016(0x380000, float:5.142788E-39)
            r13 = r13 & r6
            r1 = r1 | r13
            r13 = 29360128(0x1c00000, float:7.052966E-38)
            r6 = r6 & r13
            r33 = r1 | r6
            int r1 = r9 >> 15
            r1 = r1 & 896(0x380, float:1.256E-42)
            r6 = r9 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r6
            r6 = r9 & r22
            r1 = r1 | r6
            r6 = r8 & r25
            r34 = r1 | r6
            r35 = 0
            r16 = r14
            r18 = r2
            r19 = r4
            r20 = r10
            r21 = r12
            r22 = r36
            r23 = r37
            r25 = r0
            r28 = r11
            r29 = r7
            r30 = r42
            r31 = r38
            r32 = r3
            androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x04c7
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x04c7:
            r6 = r42
            r9 = r43
            r13 = r49
            r8 = r4
            r14 = r10
            r15 = r12
            r16 = r38
            r10 = r44
            r12 = r50
            r4 = r2
        L_0x04d7:
            androidx.compose.runtime.ScopeUpdateScope r3 = r3.endRestartGroup()
            if (r3 != 0) goto L_0x04de
            goto L_0x0512
        L_0x04de:
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$5 r20 = new androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$5
            r0 = r20
            r1 = r40
            r2 = r41
            r5 = r3
            r3 = r4
            r4 = r7
            r7 = r5
            r5 = r6
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r8
            r8 = r11
            r11 = r9
            r9 = r10
            r10 = r12
            r12 = r11
            r11 = r13
            r13 = r12
            r12 = r14
            r14 = r13
            r13 = r15
            r15 = r14
            r14 = r36
            r39 = r15
            r15 = r37
            r17 = r57
            r18 = r58
            r19 = r59
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r0 = r20
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1 = r39
            r1.updateScope(r0)
        L_0x0512:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.ui.text.input.VisualTransformation, kotlin.jvm.functions.Function1, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final TextFieldValue BasicTextField$lambda$2(MutableState<TextFieldValue> mutableState) {
        return (TextFieldValue) mutableState.getValue();
    }

    /* access modifiers changed from: private */
    public static final String BasicTextField$lambda$6(MutableState<String> mutableState) {
        return (String) mutableState.getValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v0, resolved type: kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v1, resolved type: kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v2, resolved type: kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v3, resolved type: kotlin.jvm.functions.Function3<kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: androidx.compose.foundation.interaction.MutableInteractionSource} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v4, resolved type: kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x042a  */
    /* JADX WARNING: Removed duplicated region for block: B:253:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0139  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void BasicTextField(androidx.compose.ui.text.input.TextFieldValue r36, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> r37, androidx.compose.ui.Modifier r38, boolean r39, boolean r40, androidx.compose.ui.text.TextStyle r41, androidx.compose.foundation.text.KeyboardOptions r42, androidx.compose.foundation.text.KeyboardActions r43, boolean r44, int r45, int r46, androidx.compose.ui.text.input.VisualTransformation r47, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> r48, androidx.compose.foundation.interaction.MutableInteractionSource r49, androidx.compose.ui.graphics.Brush r50, kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r51, androidx.compose.runtime.Composer r52, int r53, int r54, int r55) {
        /*
            r15 = r36
            r14 = r37
            r13 = r53
            r12 = r54
            r11 = r55
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "onValueChange"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            r0 = 1804514146(0x6b8eb362, float:3.4502916E26)
            r1 = r52
            androidx.compose.runtime.Composer r10 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(BasicTextField)P(14,10,8,2,11,13,5,4,12,6,7,15,9,3)282@16342L39,289@16644L90,287@16582L740:BasicTextField.kt#423gt5"
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
            r9 = r38
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
            r9 = r38
        L_0x006f:
            r16 = r11 & 8
            r17 = 2048(0x800, float:2.87E-42)
            r18 = 1024(0x400, float:1.435E-42)
            if (r16 == 0) goto L_0x007a
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x008e
        L_0x007a:
            r2 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x008e
            r2 = r39
            boolean r19 = r10.changed((boolean) r2)
            if (r19 == 0) goto L_0x0089
            r19 = r17
            goto L_0x008b
        L_0x0089:
            r19 = r18
        L_0x008b:
            r1 = r1 | r19
            goto L_0x0090
        L_0x008e:
            r2 = r39
        L_0x0090:
            r19 = r11 & 16
            r20 = 16384(0x4000, float:2.2959E-41)
            r21 = 8192(0x2000, float:1.14794E-41)
            r22 = 57344(0xe000, float:8.0356E-41)
            if (r19 == 0) goto L_0x00a0
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            r3 = r40
            goto L_0x00b3
        L_0x00a0:
            r23 = r13 & r22
            r3 = r40
            if (r23 != 0) goto L_0x00b3
            boolean r24 = r10.changed((boolean) r3)
            if (r24 == 0) goto L_0x00af
            r24 = r20
            goto L_0x00b1
        L_0x00af:
            r24 = r21
        L_0x00b1:
            r1 = r1 | r24
        L_0x00b3:
            r24 = r11 & 32
            r25 = 458752(0x70000, float:6.42848E-40)
            if (r24 == 0) goto L_0x00c0
            r26 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r26
            r5 = r41
            goto L_0x00d3
        L_0x00c0:
            r26 = r13 & r25
            r5 = r41
            if (r26 != 0) goto L_0x00d3
            boolean r27 = r10.changed((java.lang.Object) r5)
            if (r27 == 0) goto L_0x00cf
            r27 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00d1
        L_0x00cf:
            r27 = 65536(0x10000, float:9.18355E-41)
        L_0x00d1:
            r1 = r1 | r27
        L_0x00d3:
            r27 = r11 & 64
            if (r27 == 0) goto L_0x00de
            r28 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r28
            r6 = r42
            goto L_0x00f3
        L_0x00de:
            r28 = 3670016(0x380000, float:5.142788E-39)
            r28 = r13 & r28
            r6 = r42
            if (r28 != 0) goto L_0x00f3
            boolean r29 = r10.changed((java.lang.Object) r6)
            if (r29 == 0) goto L_0x00ef
            r29 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00f1
        L_0x00ef:
            r29 = 524288(0x80000, float:7.34684E-40)
        L_0x00f1:
            r1 = r1 | r29
        L_0x00f3:
            r7 = r11 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x00fe
            r30 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r30
            r8 = r43
            goto L_0x0113
        L_0x00fe:
            r30 = 29360128(0x1c00000, float:7.052966E-38)
            r30 = r13 & r30
            r8 = r43
            if (r30 != 0) goto L_0x0113
            boolean r31 = r10.changed((java.lang.Object) r8)
            if (r31 == 0) goto L_0x010f
            r31 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0111
        L_0x010f:
            r31 = 4194304(0x400000, float:5.877472E-39)
        L_0x0111:
            r1 = r1 | r31
        L_0x0113:
            r0 = r11 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x011e
            r32 = 100663296(0x6000000, float:2.4074124E-35)
            r1 = r1 | r32
            r2 = r44
            goto L_0x0133
        L_0x011e:
            r32 = 234881024(0xe000000, float:1.5777218E-30)
            r32 = r13 & r32
            r2 = r44
            if (r32 != 0) goto L_0x0133
            boolean r32 = r10.changed((boolean) r2)
            if (r32 == 0) goto L_0x012f
            r32 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0131
        L_0x012f:
            r32 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0131:
            r1 = r1 | r32
        L_0x0133:
            r32 = 1879048192(0x70000000, float:1.58456325E29)
            r32 = r13 & r32
            if (r32 != 0) goto L_0x014f
            r2 = r11 & 512(0x200, float:7.175E-43)
            if (r2 != 0) goto L_0x0148
            r2 = r45
            boolean r32 = r10.changed((int) r2)
            if (r32 == 0) goto L_0x014a
            r32 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x014c
        L_0x0148:
            r2 = r45
        L_0x014a:
            r32 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x014c:
            r1 = r1 | r32
            goto L_0x0151
        L_0x014f:
            r2 = r45
        L_0x0151:
            r2 = r11 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x015a
            r23 = r12 | 6
            r3 = r46
            goto L_0x0170
        L_0x015a:
            r32 = r12 & 14
            r3 = r46
            if (r32 != 0) goto L_0x016e
            boolean r32 = r10.changed((int) r3)
            if (r32 == 0) goto L_0x0169
            r23 = 4
            goto L_0x016b
        L_0x0169:
            r23 = 2
        L_0x016b:
            r23 = r12 | r23
            goto L_0x0170
        L_0x016e:
            r23 = r12
        L_0x0170:
            r3 = r11 & 2048(0x800, float:2.87E-42)
            if (r3 == 0) goto L_0x0177
            r23 = r23 | 48
            goto L_0x018a
        L_0x0177:
            r32 = r12 & 112(0x70, float:1.57E-43)
            r5 = r47
            if (r32 != 0) goto L_0x018a
            boolean r32 = r10.changed((java.lang.Object) r5)
            if (r32 == 0) goto L_0x0186
            r28 = 32
            goto L_0x0188
        L_0x0186:
            r28 = 16
        L_0x0188:
            r23 = r23 | r28
        L_0x018a:
            r5 = r23
            r6 = r11 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L_0x0193
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x01a7
        L_0x0193:
            r8 = r12 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x01a7
            r8 = r48
            boolean r23 = r10.changedInstance(r8)
            if (r23 == 0) goto L_0x01a2
            r29 = 256(0x100, float:3.59E-43)
            goto L_0x01a4
        L_0x01a2:
            r29 = 128(0x80, float:1.794E-43)
        L_0x01a4:
            r5 = r5 | r29
            goto L_0x01a9
        L_0x01a7:
            r8 = r48
        L_0x01a9:
            r8 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r8 == 0) goto L_0x01b0
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            goto L_0x01c2
        L_0x01b0:
            r9 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x01c2
            r9 = r49
            boolean r23 = r10.changed((java.lang.Object) r9)
            if (r23 == 0) goto L_0x01bd
            goto L_0x01bf
        L_0x01bd:
            r17 = r18
        L_0x01bf:
            r5 = r5 | r17
            goto L_0x01c4
        L_0x01c2:
            r9 = r49
        L_0x01c4:
            r9 = r11 & 16384(0x4000, float:2.2959E-41)
            if (r9 == 0) goto L_0x01cd
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
            r14 = r50
            goto L_0x01de
        L_0x01cd:
            r17 = r12 & r22
            r14 = r50
            if (r17 != 0) goto L_0x01de
            boolean r17 = r10.changed((java.lang.Object) r14)
            if (r17 == 0) goto L_0x01da
            goto L_0x01dc
        L_0x01da:
            r20 = r21
        L_0x01dc:
            r5 = r5 | r20
        L_0x01de:
            r17 = 32768(0x8000, float:4.5918E-41)
            r17 = r11 & r17
            if (r17 == 0) goto L_0x01ec
            r18 = 196608(0x30000, float:2.75506E-40)
            r5 = r5 | r18
            r12 = r51
            goto L_0x01ff
        L_0x01ec:
            r18 = r12 & r25
            r12 = r51
            if (r18 != 0) goto L_0x01ff
            boolean r18 = r10.changedInstance(r12)
            if (r18 == 0) goto L_0x01fb
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01fd
        L_0x01fb:
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x01fd:
            r5 = r5 | r18
        L_0x01ff:
            r18 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r12 = r1 & r18
            r14 = 306783378(0x12492492, float:6.3469493E-28)
            if (r12 != r14) goto L_0x023c
            r12 = 374491(0x5b6db, float:5.24774E-40)
            r12 = r12 & r5
            r14 = 74898(0x12492, float:1.04954E-40)
            if (r12 != r14) goto L_0x023c
            boolean r12 = r10.getSkipping()
            if (r12 != 0) goto L_0x0219
            goto L_0x023c
        L_0x0219:
            r10.skipToGroupEnd()
            r3 = r38
            r4 = r39
            r5 = r40
            r6 = r41
            r7 = r42
            r8 = r43
            r9 = r44
            r11 = r46
            r12 = r47
            r13 = r48
            r14 = r49
            r15 = r50
            r16 = r51
            r22 = r10
            r10 = r45
            goto L_0x0423
        L_0x023c:
            r10.startDefaults()
            r12 = r13 & 1
            if (r12 == 0) goto L_0x0274
            boolean r12 = r10.getDefaultsInvalid()
            if (r12 == 0) goto L_0x024a
            goto L_0x0274
        L_0x024a:
            r10.skipToGroupEnd()
            r0 = r11 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0255
            r0 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r1 = r1 & r0
        L_0x0255:
            r20 = r38
            r21 = r39
            r23 = r40
            r24 = r41
            r14 = r42
            r26 = r43
            r12 = r44
            r27 = r45
            r28 = r46
            r29 = r47
            r30 = r48
            r32 = r49
            r33 = r50
            r34 = r51
            r0 = r1
            goto L_0x0354
        L_0x0274:
            if (r4 == 0) goto L_0x027b
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r4 = (androidx.compose.ui.Modifier) r4
            goto L_0x027d
        L_0x027b:
            r4 = r38
        L_0x027d:
            if (r16 == 0) goto L_0x0281
            r12 = 1
            goto L_0x0283
        L_0x0281:
            r12 = r39
        L_0x0283:
            if (r19 == 0) goto L_0x0288
            r16 = 0
            goto L_0x028a
        L_0x0288:
            r16 = r40
        L_0x028a:
            if (r24 == 0) goto L_0x0293
            androidx.compose.ui.text.TextStyle$Companion r18 = androidx.compose.ui.text.TextStyle.Companion
            androidx.compose.ui.text.TextStyle r18 = r18.getDefault()
            goto L_0x0295
        L_0x0293:
            r18 = r41
        L_0x0295:
            if (r27 == 0) goto L_0x029e
            androidx.compose.foundation.text.KeyboardOptions$Companion r19 = androidx.compose.foundation.text.KeyboardOptions.Companion
            androidx.compose.foundation.text.KeyboardOptions r19 = r19.getDefault()
            goto L_0x02a0
        L_0x029e:
            r19 = r42
        L_0x02a0:
            if (r7 == 0) goto L_0x02a9
            androidx.compose.foundation.text.KeyboardActions$Companion r7 = androidx.compose.foundation.text.KeyboardActions.Companion
            androidx.compose.foundation.text.KeyboardActions r7 = r7.getDefault()
            goto L_0x02ab
        L_0x02a9:
            r7 = r43
        L_0x02ab:
            if (r0 == 0) goto L_0x02af
            r0 = 0
            goto L_0x02b1
        L_0x02af:
            r0 = r44
        L_0x02b1:
            r14 = r11 & 512(0x200, float:7.175E-43)
            if (r14 == 0) goto L_0x02c2
            if (r0 == 0) goto L_0x02b9
            r14 = 1
            goto L_0x02bc
        L_0x02b9:
            r14 = 2147483647(0x7fffffff, float:NaN)
        L_0x02bc:
            r20 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r1 = r1 & r20
            goto L_0x02c4
        L_0x02c2:
            r14 = r45
        L_0x02c4:
            if (r2 == 0) goto L_0x02c8
            r2 = 1
            goto L_0x02ca
        L_0x02c8:
            r2 = r46
        L_0x02ca:
            if (r3 == 0) goto L_0x02d3
            androidx.compose.ui.text.input.VisualTransformation$Companion r3 = androidx.compose.ui.text.input.VisualTransformation.Companion
            androidx.compose.ui.text.input.VisualTransformation r3 = r3.getNone()
            goto L_0x02d5
        L_0x02d3:
            r3 = r47
        L_0x02d5:
            if (r6 == 0) goto L_0x02dc
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$6 r6 = androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$6.INSTANCE
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            goto L_0x02de
        L_0x02dc:
            r6 = r48
        L_0x02de:
            if (r8 == 0) goto L_0x0307
            r8 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r10.startReplaceableGroup(r8)
            java.lang.String r8 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r10, r8)
            java.lang.Object r8 = r10.rememberedValue()
            androidx.compose.runtime.Composer$Companion r20 = androidx.compose.runtime.Composer.Companion
            r38 = r0
            java.lang.Object r0 = r20.getEmpty()
            if (r8 != r0) goto L_0x0300
            androidx.compose.foundation.interaction.MutableInteractionSource r8 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r10.updateRememberedValue(r8)
        L_0x0300:
            r10.endReplaceableGroup()
            r0 = r8
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = (androidx.compose.foundation.interaction.MutableInteractionSource) r0
            goto L_0x030b
        L_0x0307:
            r38 = r0
            r0 = r49
        L_0x030b:
            if (r9 == 0) goto L_0x0321
            androidx.compose.ui.graphics.SolidColor r8 = new androidx.compose.ui.graphics.SolidColor
            androidx.compose.ui.graphics.Color$Companion r9 = androidx.compose.ui.graphics.Color.Companion
            r40 = r0
            r39 = r1
            long r0 = r9.m2847getBlack0d7_KjU()
            r9 = 0
            r8.<init>(r0, r9)
            r0 = r8
            androidx.compose.ui.graphics.Brush r0 = (androidx.compose.ui.graphics.Brush) r0
            goto L_0x0327
        L_0x0321:
            r40 = r0
            r39 = r1
            r0 = r50
        L_0x0327:
            if (r17 == 0) goto L_0x0336
            androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt r1 = androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt.INSTANCE
            kotlin.jvm.functions.Function3 r1 = r1.m866getLambda2$foundation_release()
            r32 = r40
            r33 = r0
            r34 = r1
            goto L_0x033c
        L_0x0336:
            r32 = r40
            r34 = r51
            r33 = r0
        L_0x033c:
            r28 = r2
            r29 = r3
            r20 = r4
            r30 = r6
            r26 = r7
            r21 = r12
            r27 = r14
            r23 = r16
            r24 = r18
            r14 = r19
            r12 = r38
            r0 = r39
        L_0x0354:
            r10.endDefaults()
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x0366
            java.lang.String r1 = "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:268)"
            r2 = 1804514146(0x6b8eb362, float:3.4502916E26)
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r0, r5, r1)
        L_0x0366:
            androidx.compose.ui.text.input.ImeOptions r16 = r14.toImeOptions$foundation_release(r12)
            r8 = r12 ^ 1
            if (r12 == 0) goto L_0x0371
            r31 = 1
            goto L_0x0373
        L_0x0371:
            r31 = r28
        L_0x0373:
            if (r12 == 0) goto L_0x0377
            r9 = 1
            goto L_0x0379
        L_0x0377:
            r9 = r27
        L_0x0379:
            r2 = r0 & 14
            r1 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r10.startReplaceableGroup(r1)
            java.lang.String r1 = "CC(remember)P(1,2):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r10, r1)
            boolean r1 = r10.changed((java.lang.Object) r15)
            r7 = r37
            boolean r3 = r10.changed((java.lang.Object) r7)
            r1 = r1 | r3
            java.lang.Object r3 = r10.rememberedValue()
            if (r1 != 0) goto L_0x039f
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r3 != r1) goto L_0x03aa
        L_0x039f:
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8$1 r1 = new androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8$1
            r1.<init>(r15, r7)
            r3 = r1
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            r10.updateRememberedValue(r3)
        L_0x03aa:
            r10.endReplaceableGroup()
            r1 = r3
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            r3 = r0 & 896(0x380, float:1.256E-42)
            r2 = r2 | r3
            int r3 = r0 >> 6
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r3
            int r3 = r5 << 9
            r4 = r3 & r22
            r2 = r2 | r4
            r4 = r3 & r25
            r2 = r2 | r4
            r4 = 3670016(0x380000, float:5.142788E-39)
            r4 = r4 & r3
            r2 = r2 | r4
            r4 = 29360128(0x1c00000, float:7.052966E-38)
            r3 = r3 & r4
            r17 = r2 | r3
            int r2 = r0 >> 15
            r2 = r2 & 896(0x380, float:1.256E-42)
            r3 = r0 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r3
            r0 = r0 & r22
            r0 = r0 | r2
            r2 = r5 & r25
            r18 = r0 | r2
            r19 = 0
            r0 = r36
            r2 = r20
            r3 = r24
            r4 = r29
            r5 = r30
            r6 = r32
            r7 = r33
            r22 = r10
            r10 = r31
            r11 = r16
            r25 = r12
            r12 = r26
            r13 = r21
            r31 = r14
            r14 = r23
            r15 = r34
            r16 = r22
            androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0407
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0407:
            r3 = r20
            r4 = r21
            r5 = r23
            r6 = r24
            r9 = r25
            r8 = r26
            r10 = r27
            r11 = r28
            r12 = r29
            r13 = r30
            r7 = r31
            r14 = r32
            r15 = r33
            r16 = r34
        L_0x0423:
            androidx.compose.runtime.ScopeUpdateScope r2 = r22.endRestartGroup()
            if (r2 != 0) goto L_0x042a
            goto L_0x0446
        L_0x042a:
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$9 r20 = new androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$9
            r0 = r20
            r1 = r36
            r35 = r2
            r2 = r37
            r17 = r53
            r18 = r54
            r19 = r55
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r0 = r20
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1 = r35
            r1.updateScope(r0)
        L_0x0446:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.ui.text.input.VisualTransformation, kotlin.jvm.functions.Function1, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0368  */
    /* JADX WARNING: Removed duplicated region for block: B:214:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x013e  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void BasicTextField(java.lang.String r37, kotlin.jvm.functions.Function1 r38, androidx.compose.ui.Modifier r39, boolean r40, boolean r41, androidx.compose.ui.text.TextStyle r42, androidx.compose.foundation.text.KeyboardOptions r43, androidx.compose.foundation.text.KeyboardActions r44, boolean r45, int r46, androidx.compose.ui.text.input.VisualTransformation r47, kotlin.jvm.functions.Function1 r48, androidx.compose.foundation.interaction.MutableInteractionSource r49, androidx.compose.ui.graphics.Brush r50, kotlin.jvm.functions.Function3 r51, androidx.compose.runtime.Composer r52, int r53, int r54, int r55) {
        /*
            r15 = r37
            r14 = r38
            r13 = r53
            r12 = r54
            r11 = r55
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "onValueChange"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            r0 = -454732590(0xffffffffe4e554d2, float:-3.384333E22)
            r1 = r52
            androidx.compose.runtime.Composer r9 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(BasicTextField)P(13,9,7,2,10,12,5,4,11,6,14,8,3)326@18012L39,331@18252L579:BasicTextField.kt#423gt5"
            androidx.compose.runtime.ComposerKt.sourceInformation(r9, r1)
            r1 = r11 & 1
            if (r1 == 0) goto L_0x002b
            r1 = r13 | 6
            goto L_0x003b
        L_0x002b:
            r1 = r13 & 14
            if (r1 != 0) goto L_0x003a
            boolean r1 = r9.changed((java.lang.Object) r15)
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
            boolean r4 = r9.changedInstance(r14)
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
            r10 = r13 & 896(0x380, float:1.256E-42)
            if (r10 != 0) goto L_0x006d
            r10 = r39
            boolean r16 = r9.changed((java.lang.Object) r10)
            if (r16 == 0) goto L_0x0068
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x006a
        L_0x0068:
            r16 = 128(0x80, float:1.794E-43)
        L_0x006a:
            r1 = r1 | r16
            goto L_0x006f
        L_0x006d:
            r10 = r39
        L_0x006f:
            r16 = r11 & 8
            r17 = 2048(0x800, float:2.87E-42)
            r18 = 1024(0x400, float:1.435E-42)
            if (r16 == 0) goto L_0x007a
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x008e
        L_0x007a:
            r2 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x008e
            r2 = r40
            boolean r19 = r9.changed((boolean) r2)
            if (r19 == 0) goto L_0x0089
            r19 = r17
            goto L_0x008b
        L_0x0089:
            r19 = r18
        L_0x008b:
            r1 = r1 | r19
            goto L_0x0090
        L_0x008e:
            r2 = r40
        L_0x0090:
            r19 = r11 & 16
            r20 = 16384(0x4000, float:2.2959E-41)
            r21 = 8192(0x2000, float:1.14794E-41)
            r22 = 57344(0xe000, float:8.0356E-41)
            if (r19 == 0) goto L_0x00a0
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            r3 = r41
            goto L_0x00b3
        L_0x00a0:
            r23 = r13 & r22
            r3 = r41
            if (r23 != 0) goto L_0x00b3
            boolean r24 = r9.changed((boolean) r3)
            if (r24 == 0) goto L_0x00af
            r24 = r20
            goto L_0x00b1
        L_0x00af:
            r24 = r21
        L_0x00b1:
            r1 = r1 | r24
        L_0x00b3:
            r24 = r11 & 32
            r25 = 458752(0x70000, float:6.42848E-40)
            if (r24 == 0) goto L_0x00c0
            r26 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r26
            r5 = r42
            goto L_0x00d3
        L_0x00c0:
            r26 = r13 & r25
            r5 = r42
            if (r26 != 0) goto L_0x00d3
            boolean r27 = r9.changed((java.lang.Object) r5)
            if (r27 == 0) goto L_0x00cf
            r27 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00d1
        L_0x00cf:
            r27 = 65536(0x10000, float:9.18355E-41)
        L_0x00d1:
            r1 = r1 | r27
        L_0x00d3:
            r27 = r11 & 64
            if (r27 == 0) goto L_0x00de
            r28 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r28
            r6 = r43
            goto L_0x00f3
        L_0x00de:
            r28 = 3670016(0x380000, float:5.142788E-39)
            r28 = r13 & r28
            r6 = r43
            if (r28 != 0) goto L_0x00f3
            boolean r29 = r9.changed((java.lang.Object) r6)
            if (r29 == 0) goto L_0x00ef
            r29 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00f1
        L_0x00ef:
            r29 = 524288(0x80000, float:7.34684E-40)
        L_0x00f1:
            r1 = r1 | r29
        L_0x00f3:
            r7 = r11 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x00fe
            r30 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r30
            r8 = r44
            goto L_0x0113
        L_0x00fe:
            r30 = 29360128(0x1c00000, float:7.052966E-38)
            r30 = r13 & r30
            r8 = r44
            if (r30 != 0) goto L_0x0113
            boolean r31 = r9.changed((java.lang.Object) r8)
            if (r31 == 0) goto L_0x010f
            r31 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0111
        L_0x010f:
            r31 = 4194304(0x400000, float:5.877472E-39)
        L_0x0111:
            r1 = r1 | r31
        L_0x0113:
            r0 = r11 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x011e
            r32 = 100663296(0x6000000, float:2.4074124E-35)
            r1 = r1 | r32
            r2 = r45
            goto L_0x0133
        L_0x011e:
            r32 = 234881024(0xe000000, float:1.5777218E-30)
            r32 = r13 & r32
            r2 = r45
            if (r32 != 0) goto L_0x0133
            boolean r32 = r9.changed((boolean) r2)
            if (r32 == 0) goto L_0x012f
            r32 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0131
        L_0x012f:
            r32 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0131:
            r1 = r1 | r32
        L_0x0133:
            r2 = r11 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x013e
            r32 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r1 | r32
            r3 = r46
            goto L_0x0153
        L_0x013e:
            r32 = 1879048192(0x70000000, float:1.58456325E29)
            r32 = r13 & r32
            r3 = r46
            if (r32 != 0) goto L_0x0153
            boolean r32 = r9.changed((int) r3)
            if (r32 == 0) goto L_0x014f
            r32 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0151
        L_0x014f:
            r32 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0151:
            r1 = r1 | r32
        L_0x0153:
            r3 = r11 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x015c
            r23 = r12 | 6
            r5 = r47
            goto L_0x0172
        L_0x015c:
            r32 = r12 & 14
            r5 = r47
            if (r32 != 0) goto L_0x0170
            boolean r32 = r9.changed((java.lang.Object) r5)
            if (r32 == 0) goto L_0x016b
            r23 = 4
            goto L_0x016d
        L_0x016b:
            r23 = 2
        L_0x016d:
            r23 = r12 | r23
            goto L_0x0172
        L_0x0170:
            r23 = r12
        L_0x0172:
            r5 = r11 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x0179
            r23 = r23 | 48
            goto L_0x018c
        L_0x0179:
            r32 = r12 & 112(0x70, float:1.57E-43)
            r6 = r48
            if (r32 != 0) goto L_0x018c
            boolean r32 = r9.changedInstance(r6)
            if (r32 == 0) goto L_0x0188
            r26 = 32
            goto L_0x018a
        L_0x0188:
            r26 = 16
        L_0x018a:
            r23 = r23 | r26
        L_0x018c:
            r6 = r23
            r8 = r11 & 4096(0x1000, float:5.74E-42)
            if (r8 == 0) goto L_0x0195
            r6 = r6 | 384(0x180, float:5.38E-43)
            goto L_0x01a9
        L_0x0195:
            r10 = r12 & 896(0x380, float:1.256E-42)
            if (r10 != 0) goto L_0x01a9
            r10 = r49
            boolean r23 = r9.changed((java.lang.Object) r10)
            if (r23 == 0) goto L_0x01a4
            r29 = 256(0x100, float:3.59E-43)
            goto L_0x01a6
        L_0x01a4:
            r29 = 128(0x80, float:1.794E-43)
        L_0x01a6:
            r6 = r6 | r29
            goto L_0x01ab
        L_0x01a9:
            r10 = r49
        L_0x01ab:
            r10 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r10 == 0) goto L_0x01b2
            r6 = r6 | 3072(0xc00, float:4.305E-42)
            goto L_0x01c4
        L_0x01b2:
            r13 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r13 != 0) goto L_0x01c4
            r13 = r50
            boolean r23 = r9.changed((java.lang.Object) r13)
            if (r23 == 0) goto L_0x01bf
            goto L_0x01c1
        L_0x01bf:
            r17 = r18
        L_0x01c1:
            r6 = r6 | r17
            goto L_0x01c6
        L_0x01c4:
            r13 = r50
        L_0x01c6:
            r13 = r11 & 16384(0x4000, float:2.2959E-41)
            if (r13 == 0) goto L_0x01cf
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
            r11 = r51
            goto L_0x01e0
        L_0x01cf:
            r17 = r12 & r22
            r11 = r51
            if (r17 != 0) goto L_0x01e0
            boolean r17 = r9.changedInstance(r11)
            if (r17 == 0) goto L_0x01dc
            goto L_0x01de
        L_0x01dc:
            r20 = r21
        L_0x01de:
            r6 = r6 | r20
        L_0x01e0:
            r17 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r11 = r1 & r17
            r12 = 306783378(0x12492492, float:6.3469493E-28)
            if (r11 != r12) goto L_0x021a
            r11 = 46811(0xb6db, float:6.5596E-41)
            r11 = r11 & r6
            r12 = 9362(0x2492, float:1.3119E-41)
            if (r11 != r12) goto L_0x021a
            boolean r11 = r9.getSkipping()
            if (r11 != 0) goto L_0x01f9
            goto L_0x021a
        L_0x01f9:
            r9.skipToGroupEnd()
            r3 = r39
            r4 = r40
            r5 = r41
            r6 = r42
            r7 = r43
            r8 = r44
            r10 = r46
            r11 = r47
            r12 = r48
            r13 = r49
            r14 = r50
            r15 = r51
            r22 = r9
            r9 = r45
            goto L_0x0361
        L_0x021a:
            if (r4 == 0) goto L_0x0223
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r4 = (androidx.compose.ui.Modifier) r4
            r20 = r4
            goto L_0x0225
        L_0x0223:
            r20 = r39
        L_0x0225:
            if (r16 == 0) goto L_0x022b
            r4 = 1
            r21 = r4
            goto L_0x022d
        L_0x022b:
            r21 = r40
        L_0x022d:
            if (r19 == 0) goto L_0x0233
            r4 = 0
            r23 = r4
            goto L_0x0235
        L_0x0233:
            r23 = r41
        L_0x0235:
            if (r24 == 0) goto L_0x0240
            androidx.compose.ui.text.TextStyle$Companion r4 = androidx.compose.ui.text.TextStyle.Companion
            androidx.compose.ui.text.TextStyle r4 = r4.getDefault()
            r24 = r4
            goto L_0x0242
        L_0x0240:
            r24 = r42
        L_0x0242:
            if (r27 == 0) goto L_0x024d
            androidx.compose.foundation.text.KeyboardOptions$Companion r4 = androidx.compose.foundation.text.KeyboardOptions.Companion
            androidx.compose.foundation.text.KeyboardOptions r4 = r4.getDefault()
            r26 = r4
            goto L_0x024f
        L_0x024d:
            r26 = r43
        L_0x024f:
            if (r7 == 0) goto L_0x025a
            androidx.compose.foundation.text.KeyboardActions$Companion r4 = androidx.compose.foundation.text.KeyboardActions.Companion
            androidx.compose.foundation.text.KeyboardActions r4 = r4.getDefault()
            r27 = r4
            goto L_0x025c
        L_0x025a:
            r27 = r44
        L_0x025c:
            if (r0 == 0) goto L_0x0262
            r0 = 0
            r28 = r0
            goto L_0x0264
        L_0x0262:
            r28 = r45
        L_0x0264:
            if (r2 == 0) goto L_0x026c
            r0 = 2147483647(0x7fffffff, float:NaN)
            r29 = r0
            goto L_0x026e
        L_0x026c:
            r29 = r46
        L_0x026e:
            if (r3 == 0) goto L_0x0279
            androidx.compose.ui.text.input.VisualTransformation$Companion r0 = androidx.compose.ui.text.input.VisualTransformation.Companion
            androidx.compose.ui.text.input.VisualTransformation r0 = r0.getNone()
            r30 = r0
            goto L_0x027b
        L_0x0279:
            r30 = r47
        L_0x027b:
            if (r5 == 0) goto L_0x0284
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$10 r0 = androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$10.INSTANCE
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r32 = r0
            goto L_0x0286
        L_0x0284:
            r32 = r48
        L_0x0286:
            if (r8 == 0) goto L_0x02ae
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r9.startReplaceableGroup(r0)
            java.lang.String r0 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r9, r0)
            java.lang.Object r0 = r9.rememberedValue()
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r0 != r2) goto L_0x02a6
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r9.updateRememberedValue(r0)
        L_0x02a6:
            r9.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = (androidx.compose.foundation.interaction.MutableInteractionSource) r0
            r33 = r0
            goto L_0x02b0
        L_0x02ae:
            r33 = r49
        L_0x02b0:
            if (r10 == 0) goto L_0x02c3
            androidx.compose.ui.graphics.SolidColor r0 = new androidx.compose.ui.graphics.SolidColor
            androidx.compose.ui.graphics.Color$Companion r2 = androidx.compose.ui.graphics.Color.Companion
            long r2 = r2.m2847getBlack0d7_KjU()
            r4 = 0
            r0.<init>(r2, r4)
            androidx.compose.ui.graphics.Brush r0 = (androidx.compose.ui.graphics.Brush) r0
            r34 = r0
            goto L_0x02c5
        L_0x02c3:
            r34 = r50
        L_0x02c5:
            if (r13 == 0) goto L_0x02d0
            androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt r0 = androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt.INSTANCE
            kotlin.jvm.functions.Function3 r0 = r0.m867getLambda3$foundation_release()
            r35 = r0
            goto L_0x02d2
        L_0x02d0:
            r35 = r51
        L_0x02d2:
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x02e1
            java.lang.String r0 = "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:313)"
            r2 = -454732590(0xffffffffe4e554d2, float:-3.384333E22)
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r1, r6, r0)
        L_0x02e1:
            r10 = 1
            r0 = r1 & 14
            r2 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            r2 = r1 & r22
            r0 = r0 | r2
            r2 = r1 & r25
            r0 = r0 | r2
            r2 = 3670016(0x380000, float:5.142788E-39)
            r2 = r2 & r1
            r0 = r0 | r2
            r2 = 29360128(0x1c00000, float:7.052966E-38)
            r2 = r2 & r1
            r0 = r0 | r2
            r2 = 234881024(0xe000000, float:1.5777218E-30)
            r2 = r2 & r1
            r0 = r0 | r2
            r2 = 1879048192(0x70000000, float:1.58456325E29)
            r1 = r1 & r2
            r17 = r0 | r1
            int r0 = r6 << 3
            r1 = r0 & 112(0x70, float:1.57E-43)
            r1 = r1 | 6
            r2 = r0 & 896(0x380, float:1.256E-42)
            r1 = r1 | r2
            r2 = r0 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r2
            r2 = r0 & r22
            r1 = r1 | r2
            r0 = r0 & r25
            r18 = r1 | r0
            r19 = 0
            r0 = r37
            r1 = r38
            r2 = r20
            r3 = r21
            r4 = r23
            r5 = r24
            r6 = r26
            r7 = r27
            r8 = r28
            r22 = r9
            r9 = r29
            r11 = r30
            r12 = r32
            r13 = r33
            r14 = r34
            r15 = r35
            r16 = r22
            BasicTextField((java.lang.String) r0, (kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>) r1, (androidx.compose.ui.Modifier) r2, (boolean) r3, (boolean) r4, (androidx.compose.ui.text.TextStyle) r5, (androidx.compose.foundation.text.KeyboardOptions) r6, (androidx.compose.foundation.text.KeyboardActions) r7, (boolean) r8, (int) r9, (int) r10, (androidx.compose.ui.text.input.VisualTransformation) r11, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) r12, (androidx.compose.foundation.interaction.MutableInteractionSource) r13, (androidx.compose.ui.graphics.Brush) r14, (kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) r15, (androidx.compose.runtime.Composer) r16, (int) r17, (int) r18, (int) r19)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0347
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0347:
            r3 = r20
            r4 = r21
            r5 = r23
            r6 = r24
            r7 = r26
            r8 = r27
            r9 = r28
            r10 = r29
            r11 = r30
            r12 = r32
            r13 = r33
            r14 = r34
            r15 = r35
        L_0x0361:
            androidx.compose.runtime.ScopeUpdateScope r2 = r22.endRestartGroup()
            if (r2 != 0) goto L_0x0368
            goto L_0x0384
        L_0x0368:
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$12 r19 = new androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$12
            r0 = r19
            r1 = r37
            r36 = r2
            r2 = r38
            r16 = r53
            r17 = r54
            r18 = r55
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r0 = r19
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1 = r36
            r1.updateScope(r0)
        L_0x0384:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.ui.text.input.VisualTransformation, kotlin.jvm.functions.Function1, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0368  */
    /* JADX WARNING: Removed duplicated region for block: B:214:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x013e  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void BasicTextField(androidx.compose.ui.text.input.TextFieldValue r37, kotlin.jvm.functions.Function1 r38, androidx.compose.ui.Modifier r39, boolean r40, boolean r41, androidx.compose.ui.text.TextStyle r42, androidx.compose.foundation.text.KeyboardOptions r43, androidx.compose.foundation.text.KeyboardActions r44, boolean r45, int r46, androidx.compose.ui.text.input.VisualTransformation r47, kotlin.jvm.functions.Function1 r48, androidx.compose.foundation.interaction.MutableInteractionSource r49, androidx.compose.ui.graphics.Brush r50, kotlin.jvm.functions.Function3 r51, androidx.compose.runtime.Composer r52, int r53, int r54, int r55) {
        /*
            r15 = r37
            r14 = r38
            r13 = r53
            r12 = r54
            r11 = r55
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "onValueChange"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            r0 = -560482651(0xffffffffde97b6a5, float:-5.4660533E18)
            r1 = r52
            androidx.compose.runtime.Composer r9 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(BasicTextField)P(13,9,7,2,10,12,5,4,11,6,14,8,3)366@19537L39,371@19777L579:BasicTextField.kt#423gt5"
            androidx.compose.runtime.ComposerKt.sourceInformation(r9, r1)
            r1 = r11 & 1
            if (r1 == 0) goto L_0x002b
            r1 = r13 | 6
            goto L_0x003b
        L_0x002b:
            r1 = r13 & 14
            if (r1 != 0) goto L_0x003a
            boolean r1 = r9.changed((java.lang.Object) r15)
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
            boolean r4 = r9.changedInstance(r14)
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
            r10 = r13 & 896(0x380, float:1.256E-42)
            if (r10 != 0) goto L_0x006d
            r10 = r39
            boolean r16 = r9.changed((java.lang.Object) r10)
            if (r16 == 0) goto L_0x0068
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x006a
        L_0x0068:
            r16 = 128(0x80, float:1.794E-43)
        L_0x006a:
            r1 = r1 | r16
            goto L_0x006f
        L_0x006d:
            r10 = r39
        L_0x006f:
            r16 = r11 & 8
            r17 = 2048(0x800, float:2.87E-42)
            r18 = 1024(0x400, float:1.435E-42)
            if (r16 == 0) goto L_0x007a
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x008e
        L_0x007a:
            r2 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x008e
            r2 = r40
            boolean r19 = r9.changed((boolean) r2)
            if (r19 == 0) goto L_0x0089
            r19 = r17
            goto L_0x008b
        L_0x0089:
            r19 = r18
        L_0x008b:
            r1 = r1 | r19
            goto L_0x0090
        L_0x008e:
            r2 = r40
        L_0x0090:
            r19 = r11 & 16
            r20 = 16384(0x4000, float:2.2959E-41)
            r21 = 8192(0x2000, float:1.14794E-41)
            r22 = 57344(0xe000, float:8.0356E-41)
            if (r19 == 0) goto L_0x00a0
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            r3 = r41
            goto L_0x00b3
        L_0x00a0:
            r23 = r13 & r22
            r3 = r41
            if (r23 != 0) goto L_0x00b3
            boolean r24 = r9.changed((boolean) r3)
            if (r24 == 0) goto L_0x00af
            r24 = r20
            goto L_0x00b1
        L_0x00af:
            r24 = r21
        L_0x00b1:
            r1 = r1 | r24
        L_0x00b3:
            r24 = r11 & 32
            r25 = 458752(0x70000, float:6.42848E-40)
            if (r24 == 0) goto L_0x00c0
            r26 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r26
            r5 = r42
            goto L_0x00d3
        L_0x00c0:
            r26 = r13 & r25
            r5 = r42
            if (r26 != 0) goto L_0x00d3
            boolean r27 = r9.changed((java.lang.Object) r5)
            if (r27 == 0) goto L_0x00cf
            r27 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00d1
        L_0x00cf:
            r27 = 65536(0x10000, float:9.18355E-41)
        L_0x00d1:
            r1 = r1 | r27
        L_0x00d3:
            r27 = r11 & 64
            if (r27 == 0) goto L_0x00de
            r28 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r28
            r6 = r43
            goto L_0x00f3
        L_0x00de:
            r28 = 3670016(0x380000, float:5.142788E-39)
            r28 = r13 & r28
            r6 = r43
            if (r28 != 0) goto L_0x00f3
            boolean r29 = r9.changed((java.lang.Object) r6)
            if (r29 == 0) goto L_0x00ef
            r29 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00f1
        L_0x00ef:
            r29 = 524288(0x80000, float:7.34684E-40)
        L_0x00f1:
            r1 = r1 | r29
        L_0x00f3:
            r7 = r11 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x00fe
            r30 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r30
            r8 = r44
            goto L_0x0113
        L_0x00fe:
            r30 = 29360128(0x1c00000, float:7.052966E-38)
            r30 = r13 & r30
            r8 = r44
            if (r30 != 0) goto L_0x0113
            boolean r31 = r9.changed((java.lang.Object) r8)
            if (r31 == 0) goto L_0x010f
            r31 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0111
        L_0x010f:
            r31 = 4194304(0x400000, float:5.877472E-39)
        L_0x0111:
            r1 = r1 | r31
        L_0x0113:
            r0 = r11 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x011e
            r32 = 100663296(0x6000000, float:2.4074124E-35)
            r1 = r1 | r32
            r2 = r45
            goto L_0x0133
        L_0x011e:
            r32 = 234881024(0xe000000, float:1.5777218E-30)
            r32 = r13 & r32
            r2 = r45
            if (r32 != 0) goto L_0x0133
            boolean r32 = r9.changed((boolean) r2)
            if (r32 == 0) goto L_0x012f
            r32 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0131
        L_0x012f:
            r32 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0131:
            r1 = r1 | r32
        L_0x0133:
            r2 = r11 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x013e
            r32 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r1 | r32
            r3 = r46
            goto L_0x0153
        L_0x013e:
            r32 = 1879048192(0x70000000, float:1.58456325E29)
            r32 = r13 & r32
            r3 = r46
            if (r32 != 0) goto L_0x0153
            boolean r32 = r9.changed((int) r3)
            if (r32 == 0) goto L_0x014f
            r32 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0151
        L_0x014f:
            r32 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0151:
            r1 = r1 | r32
        L_0x0153:
            r3 = r11 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x015c
            r23 = r12 | 6
            r5 = r47
            goto L_0x0172
        L_0x015c:
            r32 = r12 & 14
            r5 = r47
            if (r32 != 0) goto L_0x0170
            boolean r32 = r9.changed((java.lang.Object) r5)
            if (r32 == 0) goto L_0x016b
            r23 = 4
            goto L_0x016d
        L_0x016b:
            r23 = 2
        L_0x016d:
            r23 = r12 | r23
            goto L_0x0172
        L_0x0170:
            r23 = r12
        L_0x0172:
            r5 = r11 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x0179
            r23 = r23 | 48
            goto L_0x018c
        L_0x0179:
            r32 = r12 & 112(0x70, float:1.57E-43)
            r6 = r48
            if (r32 != 0) goto L_0x018c
            boolean r32 = r9.changedInstance(r6)
            if (r32 == 0) goto L_0x0188
            r26 = 32
            goto L_0x018a
        L_0x0188:
            r26 = 16
        L_0x018a:
            r23 = r23 | r26
        L_0x018c:
            r6 = r23
            r8 = r11 & 4096(0x1000, float:5.74E-42)
            if (r8 == 0) goto L_0x0195
            r6 = r6 | 384(0x180, float:5.38E-43)
            goto L_0x01a9
        L_0x0195:
            r10 = r12 & 896(0x380, float:1.256E-42)
            if (r10 != 0) goto L_0x01a9
            r10 = r49
            boolean r23 = r9.changed((java.lang.Object) r10)
            if (r23 == 0) goto L_0x01a4
            r29 = 256(0x100, float:3.59E-43)
            goto L_0x01a6
        L_0x01a4:
            r29 = 128(0x80, float:1.794E-43)
        L_0x01a6:
            r6 = r6 | r29
            goto L_0x01ab
        L_0x01a9:
            r10 = r49
        L_0x01ab:
            r10 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r10 == 0) goto L_0x01b2
            r6 = r6 | 3072(0xc00, float:4.305E-42)
            goto L_0x01c4
        L_0x01b2:
            r13 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r13 != 0) goto L_0x01c4
            r13 = r50
            boolean r23 = r9.changed((java.lang.Object) r13)
            if (r23 == 0) goto L_0x01bf
            goto L_0x01c1
        L_0x01bf:
            r17 = r18
        L_0x01c1:
            r6 = r6 | r17
            goto L_0x01c6
        L_0x01c4:
            r13 = r50
        L_0x01c6:
            r13 = r11 & 16384(0x4000, float:2.2959E-41)
            if (r13 == 0) goto L_0x01cf
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
            r11 = r51
            goto L_0x01e0
        L_0x01cf:
            r17 = r12 & r22
            r11 = r51
            if (r17 != 0) goto L_0x01e0
            boolean r17 = r9.changedInstance(r11)
            if (r17 == 0) goto L_0x01dc
            goto L_0x01de
        L_0x01dc:
            r20 = r21
        L_0x01de:
            r6 = r6 | r20
        L_0x01e0:
            r17 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r11 = r1 & r17
            r12 = 306783378(0x12492492, float:6.3469493E-28)
            if (r11 != r12) goto L_0x021a
            r11 = 46811(0xb6db, float:6.5596E-41)
            r11 = r11 & r6
            r12 = 9362(0x2492, float:1.3119E-41)
            if (r11 != r12) goto L_0x021a
            boolean r11 = r9.getSkipping()
            if (r11 != 0) goto L_0x01f9
            goto L_0x021a
        L_0x01f9:
            r9.skipToGroupEnd()
            r3 = r39
            r4 = r40
            r5 = r41
            r6 = r42
            r7 = r43
            r8 = r44
            r10 = r46
            r11 = r47
            r12 = r48
            r13 = r49
            r14 = r50
            r15 = r51
            r22 = r9
            r9 = r45
            goto L_0x0361
        L_0x021a:
            if (r4 == 0) goto L_0x0223
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r4 = (androidx.compose.ui.Modifier) r4
            r20 = r4
            goto L_0x0225
        L_0x0223:
            r20 = r39
        L_0x0225:
            if (r16 == 0) goto L_0x022b
            r4 = 1
            r21 = r4
            goto L_0x022d
        L_0x022b:
            r21 = r40
        L_0x022d:
            if (r19 == 0) goto L_0x0233
            r4 = 0
            r23 = r4
            goto L_0x0235
        L_0x0233:
            r23 = r41
        L_0x0235:
            if (r24 == 0) goto L_0x0240
            androidx.compose.ui.text.TextStyle$Companion r4 = androidx.compose.ui.text.TextStyle.Companion
            androidx.compose.ui.text.TextStyle r4 = r4.getDefault()
            r24 = r4
            goto L_0x0242
        L_0x0240:
            r24 = r42
        L_0x0242:
            if (r27 == 0) goto L_0x024d
            androidx.compose.foundation.text.KeyboardOptions$Companion r4 = androidx.compose.foundation.text.KeyboardOptions.Companion
            androidx.compose.foundation.text.KeyboardOptions r4 = r4.getDefault()
            r26 = r4
            goto L_0x024f
        L_0x024d:
            r26 = r43
        L_0x024f:
            if (r7 == 0) goto L_0x025a
            androidx.compose.foundation.text.KeyboardActions$Companion r4 = androidx.compose.foundation.text.KeyboardActions.Companion
            androidx.compose.foundation.text.KeyboardActions r4 = r4.getDefault()
            r27 = r4
            goto L_0x025c
        L_0x025a:
            r27 = r44
        L_0x025c:
            if (r0 == 0) goto L_0x0262
            r0 = 0
            r28 = r0
            goto L_0x0264
        L_0x0262:
            r28 = r45
        L_0x0264:
            if (r2 == 0) goto L_0x026c
            r0 = 2147483647(0x7fffffff, float:NaN)
            r29 = r0
            goto L_0x026e
        L_0x026c:
            r29 = r46
        L_0x026e:
            if (r3 == 0) goto L_0x0279
            androidx.compose.ui.text.input.VisualTransformation$Companion r0 = androidx.compose.ui.text.input.VisualTransformation.Companion
            androidx.compose.ui.text.input.VisualTransformation r0 = r0.getNone()
            r30 = r0
            goto L_0x027b
        L_0x0279:
            r30 = r47
        L_0x027b:
            if (r5 == 0) goto L_0x0284
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$13 r0 = androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$13.INSTANCE
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r32 = r0
            goto L_0x0286
        L_0x0284:
            r32 = r48
        L_0x0286:
            if (r8 == 0) goto L_0x02ae
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r9.startReplaceableGroup(r0)
            java.lang.String r0 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r9, r0)
            java.lang.Object r0 = r9.rememberedValue()
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r0 != r2) goto L_0x02a6
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r9.updateRememberedValue(r0)
        L_0x02a6:
            r9.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = (androidx.compose.foundation.interaction.MutableInteractionSource) r0
            r33 = r0
            goto L_0x02b0
        L_0x02ae:
            r33 = r49
        L_0x02b0:
            if (r10 == 0) goto L_0x02c3
            androidx.compose.ui.graphics.SolidColor r0 = new androidx.compose.ui.graphics.SolidColor
            androidx.compose.ui.graphics.Color$Companion r2 = androidx.compose.ui.graphics.Color.Companion
            long r2 = r2.m2847getBlack0d7_KjU()
            r4 = 0
            r0.<init>(r2, r4)
            androidx.compose.ui.graphics.Brush r0 = (androidx.compose.ui.graphics.Brush) r0
            r34 = r0
            goto L_0x02c5
        L_0x02c3:
            r34 = r50
        L_0x02c5:
            if (r13 == 0) goto L_0x02d0
            androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt r0 = androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt.INSTANCE
            kotlin.jvm.functions.Function3 r0 = r0.m868getLambda4$foundation_release()
            r35 = r0
            goto L_0x02d2
        L_0x02d0:
            r35 = r51
        L_0x02d2:
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x02e1
            java.lang.String r0 = "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:353)"
            r2 = -560482651(0xffffffffde97b6a5, float:-5.4660533E18)
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r1, r6, r0)
        L_0x02e1:
            r10 = 1
            r0 = r1 & 14
            r2 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            r2 = r1 & r22
            r0 = r0 | r2
            r2 = r1 & r25
            r0 = r0 | r2
            r2 = 3670016(0x380000, float:5.142788E-39)
            r2 = r2 & r1
            r0 = r0 | r2
            r2 = 29360128(0x1c00000, float:7.052966E-38)
            r2 = r2 & r1
            r0 = r0 | r2
            r2 = 234881024(0xe000000, float:1.5777218E-30)
            r2 = r2 & r1
            r0 = r0 | r2
            r2 = 1879048192(0x70000000, float:1.58456325E29)
            r1 = r1 & r2
            r17 = r0 | r1
            int r0 = r6 << 3
            r1 = r0 & 112(0x70, float:1.57E-43)
            r1 = r1 | 6
            r2 = r0 & 896(0x380, float:1.256E-42)
            r1 = r1 | r2
            r2 = r0 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r2
            r2 = r0 & r22
            r1 = r1 | r2
            r0 = r0 & r25
            r18 = r1 | r0
            r19 = 0
            r0 = r37
            r1 = r38
            r2 = r20
            r3 = r21
            r4 = r23
            r5 = r24
            r6 = r26
            r7 = r27
            r8 = r28
            r22 = r9
            r9 = r29
            r11 = r30
            r12 = r32
            r13 = r33
            r14 = r34
            r15 = r35
            r16 = r22
            BasicTextField((androidx.compose.ui.text.input.TextFieldValue) r0, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit>) r1, (androidx.compose.ui.Modifier) r2, (boolean) r3, (boolean) r4, (androidx.compose.ui.text.TextStyle) r5, (androidx.compose.foundation.text.KeyboardOptions) r6, (androidx.compose.foundation.text.KeyboardActions) r7, (boolean) r8, (int) r9, (int) r10, (androidx.compose.ui.text.input.VisualTransformation) r11, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) r12, (androidx.compose.foundation.interaction.MutableInteractionSource) r13, (androidx.compose.ui.graphics.Brush) r14, (kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) r15, (androidx.compose.runtime.Composer) r16, (int) r17, (int) r18, (int) r19)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0347
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0347:
            r3 = r20
            r4 = r21
            r5 = r23
            r6 = r24
            r7 = r26
            r8 = r27
            r9 = r28
            r10 = r29
            r11 = r30
            r12 = r32
            r13 = r33
            r14 = r34
            r15 = r35
        L_0x0361:
            androidx.compose.runtime.ScopeUpdateScope r2 = r22.endRestartGroup()
            if (r2 != 0) goto L_0x0368
            goto L_0x0384
        L_0x0368:
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$15 r19 = new androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$15
            r0 = r19
            r1 = r37
            r36 = r2
            r2 = r38
            r16 = r53
            r17 = r54
            r18 = r55
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r0 = r19
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1 = r36
            r1.updateScope(r0)
        L_0x0384:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.ui.text.input.VisualTransformation, kotlin.jvm.functions.Function1, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final void BasicTextField$lambda$3(MutableState<TextFieldValue> mutableState, TextFieldValue textFieldValue) {
        mutableState.setValue(textFieldValue);
    }

    /* access modifiers changed from: private */
    public static final void BasicTextField$lambda$7(MutableState<String> mutableState, String str) {
        mutableState.setValue(str);
    }
}
