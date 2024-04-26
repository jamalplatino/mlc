package androidx.compose.material3;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupProperties;
import androidx.compose.ui.window.SecureFlagPolicy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\u001a\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00112\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0015H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001aq\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u000726\u0010\u001c\u001a2\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0013\u0012\u00110!¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00010\u001d2!\u0010#\u001a\u001d\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00010\u0013H\u0003\u001a.\u0010$\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0011H\u0001¢\u0006\u0002\u0010%\u001a3\u0010&\u001a\u00020\u00012\u0006\u0010'\u001a\u00020\u000b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010(\u001a\u00020)H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010+\u001a-\u0010,\u001a\u00020\u00072\b\b\u0002\u0010-\u001a\u00020)2\u0014\b\u0002\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020)0\u0013H\u0007¢\u0006\u0002\u0010/\u001a`\u00100\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u00102\u001a\u00020!2\u0006\u00103\u001a\u00020!2,\u00104\u001a(\u0012\u0004\u0012\u000205\u0012\u0013\u0012\u00110!¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00010\u001d¢\u0006\u0002\b\u0015H\u0003\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00066"}, d2 = {"ModalBottomSheet", "", "onDismissRequest", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "sheetState", "Landroidx/compose/material3/SheetState;", "shape", "Landroidx/compose/ui/graphics/Shape;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "tonalElevation", "Landroidx/compose/ui/unit/Dp;", "scrimColor", "dragHandle", "Landroidx/compose/runtime/Composable;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "ModalBottomSheet-xOkiWaM", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SheetState;Landroidx/compose/ui/graphics/Shape;JJFJLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ModalBottomSheetAnchorChangeHandler", "Landroidx/compose/material3/AnchorChangeHandler;", "Landroidx/compose/material3/SheetValue;", "state", "animateTo", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "target", "", "velocity", "snapTo", "ModalBottomSheetPopup", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Scrim", "color", "visible", "", "Scrim-3J-VO9M", "(JLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "rememberModalBottomSheetState", "skipPartiallyExpanded", "confirmValueChange", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;", "modalBottomSheetSwipeable", "anchorChangeHandler", "screenHeight", "bottomPadding", "onDragStopped", "Lkotlinx/coroutines/CoroutineScope;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: ModalBottomSheet.android.kt */
public final class ModalBottomSheet_androidKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v0, resolved type: kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: androidx.compose.material3.AnchorChangeHandler} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v1, resolved type: kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v3, resolved type: kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v4, resolved type: kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v5, resolved type: kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v6, resolved type: kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0270  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0347  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x037d  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0385  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x039e  */
    /* JADX WARNING: Removed duplicated region for block: B:190:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0122  */
    /* renamed from: ModalBottomSheet-xOkiWaM  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1435ModalBottomSheetxOkiWaM(kotlin.jvm.functions.Function0<kotlin.Unit> r33, androidx.compose.ui.Modifier r34, androidx.compose.material3.SheetState r35, androidx.compose.ui.graphics.Shape r36, long r37, long r39, float r41, long r42, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r44, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r45, androidx.compose.runtime.Composer r46, int r47, int r48) {
        /*
            r1 = r33
            r0 = r45
            r15 = r47
            r13 = r48
            java.lang.String r2 = "onDismissRequest"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.lang.String r2 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            r2 = -1311611302(0xffffffffb1d2665a, float:-6.1234404E-9)
            r3 = r46
            androidx.compose.runtime.Composer r14 = r3.startRestartGroup(r2)
            java.lang.String r3 = "C(ModalBottomSheet)P(5,4,8,7,0:c#ui.graphics.Color,2:c#ui.graphics.Color,9:c#ui.unit.Dp,6:c#ui.graphics.Color,3)95@4558L31,96@4630L13,97@4693L14,98@4735L31,100@4868L10,104@5031L24,121@5656L344,130@6040L29,130@6093L7,132@6107L4586,229@10768L41,229@10741L68:ModalBottomSheet.android.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r3)
            r3 = r13 & 1
            if (r3 == 0) goto L_0x0029
            r3 = r15 | 6
            goto L_0x0039
        L_0x0029:
            r3 = r15 & 14
            if (r3 != 0) goto L_0x0038
            boolean r3 = r14.changedInstance(r1)
            if (r3 == 0) goto L_0x0035
            r3 = 4
            goto L_0x0036
        L_0x0035:
            r3 = 2
        L_0x0036:
            r3 = r3 | r15
            goto L_0x0039
        L_0x0038:
            r3 = r15
        L_0x0039:
            r4 = r13 & 2
            if (r4 == 0) goto L_0x0040
            r3 = r3 | 48
            goto L_0x0053
        L_0x0040:
            r5 = r15 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0053
            r5 = r34
            boolean r6 = r14.changed((java.lang.Object) r5)
            if (r6 == 0) goto L_0x004f
            r6 = 32
            goto L_0x0051
        L_0x004f:
            r6 = 16
        L_0x0051:
            r3 = r3 | r6
            goto L_0x0055
        L_0x0053:
            r5 = r34
        L_0x0055:
            r6 = r15 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x006e
            r6 = r13 & 4
            if (r6 != 0) goto L_0x0068
            r6 = r35
            boolean r7 = r14.changed((java.lang.Object) r6)
            if (r7 == 0) goto L_0x006a
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x006c
        L_0x0068:
            r6 = r35
        L_0x006a:
            r7 = 128(0x80, float:1.794E-43)
        L_0x006c:
            r3 = r3 | r7
            goto L_0x0070
        L_0x006e:
            r6 = r35
        L_0x0070:
            r7 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0089
            r7 = r13 & 8
            if (r7 != 0) goto L_0x0083
            r7 = r36
            boolean r8 = r14.changed((java.lang.Object) r7)
            if (r8 == 0) goto L_0x0085
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0087
        L_0x0083:
            r7 = r36
        L_0x0085:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0087:
            r3 = r3 | r8
            goto L_0x008b
        L_0x0089:
            r7 = r36
        L_0x008b:
            r8 = 57344(0xe000, float:8.0356E-41)
            r8 = r8 & r15
            if (r8 != 0) goto L_0x00a6
            r8 = r13 & 16
            if (r8 != 0) goto L_0x00a0
            r8 = r37
            boolean r10 = r14.changed((long) r8)
            if (r10 == 0) goto L_0x00a2
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a4
        L_0x00a0:
            r8 = r37
        L_0x00a2:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x00a4:
            r3 = r3 | r10
            goto L_0x00a8
        L_0x00a6:
            r8 = r37
        L_0x00a8:
            r10 = 458752(0x70000, float:6.42848E-40)
            r10 = r10 & r15
            if (r10 != 0) goto L_0x00c2
            r10 = r13 & 32
            if (r10 != 0) goto L_0x00bc
            r10 = r39
            boolean r12 = r14.changed((long) r10)
            if (r12 == 0) goto L_0x00be
            r12 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c0
        L_0x00bc:
            r10 = r39
        L_0x00be:
            r12 = 65536(0x10000, float:9.18355E-41)
        L_0x00c0:
            r3 = r3 | r12
            goto L_0x00c4
        L_0x00c2:
            r10 = r39
        L_0x00c4:
            r12 = r13 & 64
            if (r12 == 0) goto L_0x00cf
            r16 = 1572864(0x180000, float:2.204052E-39)
            r3 = r3 | r16
            r2 = r41
            goto L_0x00e4
        L_0x00cf:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r15 & r16
            r2 = r41
            if (r16 != 0) goto L_0x00e4
            boolean r17 = r14.changed((float) r2)
            if (r17 == 0) goto L_0x00e0
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e2
        L_0x00e0:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00e2:
            r3 = r3 | r17
        L_0x00e4:
            r17 = 29360128(0x1c00000, float:7.052966E-38)
            r17 = r15 & r17
            if (r17 != 0) goto L_0x00fd
            r2 = r13 & 128(0x80, float:1.794E-43)
            r5 = r42
            if (r2 != 0) goto L_0x00f9
            boolean r2 = r14.changed((long) r5)
            if (r2 == 0) goto L_0x00f9
            r2 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fb
        L_0x00f9:
            r2 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fb:
            r3 = r3 | r2
            goto L_0x00ff
        L_0x00fd:
            r5 = r42
        L_0x00ff:
            r2 = r13 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x010a
            r17 = 100663296(0x6000000, float:2.4074124E-35)
            r3 = r3 | r17
            r5 = r44
            goto L_0x011e
        L_0x010a:
            r17 = 234881024(0xe000000, float:1.5777218E-30)
            r17 = r15 & r17
            r5 = r44
            if (r17 != 0) goto L_0x011e
            boolean r6 = r14.changedInstance(r5)
            if (r6 == 0) goto L_0x011b
            r6 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011d
        L_0x011b:
            r6 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011d:
            r3 = r3 | r6
        L_0x011e:
            r6 = r13 & 512(0x200, float:7.175E-43)
            if (r6 == 0) goto L_0x0126
            r6 = 805306368(0x30000000, float:4.656613E-10)
        L_0x0124:
            r3 = r3 | r6
            goto L_0x0137
        L_0x0126:
            r6 = 1879048192(0x70000000, float:1.58456325E29)
            r6 = r6 & r15
            if (r6 != 0) goto L_0x0137
            boolean r6 = r14.changedInstance(r0)
            if (r6 == 0) goto L_0x0134
            r6 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0124
        L_0x0134:
            r6 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0124
        L_0x0137:
            r6 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r6 = r6 & r3
            r0 = 306783378(0x12492492, float:6.3469493E-28)
            if (r6 != r0) goto L_0x0159
            boolean r0 = r14.getSkipping()
            if (r0 != 0) goto L_0x0147
            goto L_0x0159
        L_0x0147:
            r14.skipToGroupEnd()
            r2 = r34
            r3 = r35
            r12 = r5
            r4 = r7
            r5 = r8
            r7 = r10
            r0 = r14
            r9 = r41
            r10 = r42
            goto L_0x0397
        L_0x0159:
            r14.startDefaults()
            r0 = r15 & 1
            r17 = -458753(0xfffffffffff8ffff, float:NaN)
            r18 = -57345(0xffffffffffff1fff, float:NaN)
            r6 = 0
            if (r0 == 0) goto L_0x01b7
            boolean r0 = r14.getDefaultsInvalid()
            if (r0 == 0) goto L_0x016e
            goto L_0x01b7
        L_0x016e:
            r14.skipToGroupEnd()
            r0 = r13 & 4
            if (r0 == 0) goto L_0x0177
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0177:
            r0 = r13 & 8
            if (r0 == 0) goto L_0x017d
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x017d:
            r0 = r13 & 16
            if (r0 == 0) goto L_0x0183
            r3 = r3 & r18
        L_0x0183:
            r0 = r13 & 32
            if (r0 == 0) goto L_0x0189
            r3 = r3 & r17
        L_0x0189:
            r0 = r13 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x01a4
            r0 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r0 = r0 & r3
            r12 = r35
            r26 = r41
            r27 = r42
            r29 = r5
            r21 = r7
            r22 = r8
            r24 = r10
            r7 = r0
            r0 = r34
            goto L_0x023b
        L_0x01a4:
            r0 = r34
            r12 = r35
            r26 = r41
            r27 = r42
            r29 = r5
            r21 = r7
            r22 = r8
            r24 = r10
        L_0x01b4:
            r7 = r3
            goto L_0x023b
        L_0x01b7:
            if (r4 == 0) goto L_0x01be
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            goto L_0x01c0
        L_0x01be:
            r0 = r34
        L_0x01c0:
            r4 = r13 & 4
            if (r4 == 0) goto L_0x01cf
            r4 = 3
            r34 = r0
            r0 = 0
            androidx.compose.material3.SheetState r0 = rememberModalBottomSheetState(r0, r6, r14, r0, r4)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x01d3
        L_0x01cf:
            r34 = r0
            r0 = r35
        L_0x01d3:
            r4 = r13 & 8
            r6 = 6
            if (r4 == 0) goto L_0x01e1
            androidx.compose.material3.BottomSheetDefaults r4 = androidx.compose.material3.BottomSheetDefaults.INSTANCE
            androidx.compose.ui.graphics.Shape r4 = r4.getExpandedShape(r14, r6)
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x01e2
        L_0x01e1:
            r4 = r7
        L_0x01e2:
            r7 = r13 & 16
            if (r7 == 0) goto L_0x01ef
            androidx.compose.material3.BottomSheetDefaults r7 = androidx.compose.material3.BottomSheetDefaults.INSTANCE
            long r7 = r7.getContainerColor(r14, r6)
            r3 = r3 & r18
            goto L_0x01f0
        L_0x01ef:
            r7 = r8
        L_0x01f0:
            r9 = r13 & 32
            if (r9 == 0) goto L_0x01ff
            int r9 = r3 >> 12
            r9 = r9 & 14
            long r9 = androidx.compose.material3.ColorSchemeKt.m1242contentColorForek8zF_U(r7, r14, r9)
            r3 = r3 & r17
            goto L_0x0200
        L_0x01ff:
            r9 = r10
        L_0x0200:
            if (r12 == 0) goto L_0x0209
            androidx.compose.material3.BottomSheetDefaults r11 = androidx.compose.material3.BottomSheetDefaults.INSTANCE
            float r11 = r11.m1141getElevationD9Ej5fM()
            goto L_0x020b
        L_0x0209:
            r11 = r41
        L_0x020b:
            r12 = r13 & 128(0x80, float:1.794E-43)
            if (r12 == 0) goto L_0x021a
            androidx.compose.material3.BottomSheetDefaults r12 = androidx.compose.material3.BottomSheetDefaults.INSTANCE
            long r17 = r12.getScrimColor(r14, r6)
            r6 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r3 = r3 & r6
            goto L_0x021c
        L_0x021a:
            r17 = r42
        L_0x021c:
            if (r2 == 0) goto L_0x022a
            androidx.compose.material3.ComposableSingletons$ModalBottomSheet_androidKt r2 = androidx.compose.material3.ComposableSingletons$ModalBottomSheet_androidKt.INSTANCE
            kotlin.jvm.functions.Function2 r2 = r2.m1265getLambda1$material3_release()
            r12 = r0
            r29 = r2
            r21 = r4
            goto L_0x022f
        L_0x022a:
            r12 = r0
            r21 = r4
            r29 = r5
        L_0x022f:
            r22 = r7
            r24 = r9
            r26 = r11
            r27 = r17
            r0 = r34
            goto L_0x01b4
        L_0x023b:
            r14.endDefaults()
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x024e
            r2 = -1
            java.lang.String r3 = "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:92)"
            r4 = -1311611302(0xffffffffb1d2665a, float:-6.1234404E-9)
            androidx.compose.runtime.ComposerKt.traceEventStart(r4, r7, r2, r3)
        L_0x024e:
            r2 = 773894976(0x2e20b340, float:3.6538994E-11)
            r14.startReplaceableGroup(r2)
            java.lang.String r2 = "CC(rememberCoroutineScope)476@19869L144:Effects.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r2)
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r14.startReplaceableGroup(r2)
            java.lang.String r2 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r2)
            java.lang.Object r2 = r14.rememberedValue()
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r3 = r3.getEmpty()
            if (r2 != r3) goto L_0x0281
            kotlin.coroutines.EmptyCoroutineContext r2 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlin.coroutines.CoroutineContext r2 = (kotlin.coroutines.CoroutineContext) r2
            kotlinx.coroutines.CoroutineScope r2 = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(r2, r14)
            androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller r3 = new androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller
            r3.<init>(r2)
            r14.updateRememberedValue(r3)
            r2 = r3
        L_0x0281:
            r14.endReplaceableGroup()
            androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller r2 = (androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) r2
            kotlinx.coroutines.CoroutineScope r11 = r2.getCoroutineScope()
            r14.endReplaceableGroup()
            androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$animateToDismiss$1 r2 = new androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$animateToDismiss$1
            r2.<init>(r12, r11, r1)
            r5 = r2
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$settleToDismiss$1 r2 = new androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$settleToDismiss$1
            r2.<init>(r11, r12, r1)
            r16 = r2
            kotlin.jvm.functions.Function1 r16 = (kotlin.jvm.functions.Function1) r16
            int r2 = r7 >> 6
            r2 = r2 & 14
            r8 = r2 | 64
            r2 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r14.startReplaceableGroup(r2)
            java.lang.String r2 = "CC(remember)P(1,2):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r2)
            boolean r2 = r14.changed((java.lang.Object) r12)
            boolean r3 = r14.changed((java.lang.Object) r11)
            r2 = r2 | r3
            java.lang.Object r3 = r14.rememberedValue()
            if (r2 != 0) goto L_0x02c6
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r3 != r2) goto L_0x02db
        L_0x02c6:
            androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$anchorChangeHandler$1$1 r2 = new androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$anchorChangeHandler$1$1
            r2.<init>(r11, r12)
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$anchorChangeHandler$1$2 r3 = new androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$anchorChangeHandler$1$2
            r3.<init>(r11, r12)
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            androidx.compose.material3.AnchorChangeHandler r3 = ModalBottomSheetAnchorChangeHandler(r12, r2, r3)
            r14.updateRememberedValue(r3)
        L_0x02db:
            r14.endReplaceableGroup()
            r9 = r3
            androidx.compose.material3.AnchorChangeHandler r9 = (androidx.compose.material3.AnchorChangeHandler) r9
            androidx.compose.foundation.layout.WindowInsets$Companion r2 = androidx.compose.foundation.layout.WindowInsets.Companion
            r3 = 8
            androidx.compose.foundation.layout.WindowInsets r2 = androidx.compose.material3.SystemBarsDefaultInsets_androidKt.getSystemBarsForVisualComponents(r2, r14, r3)
            androidx.compose.runtime.ProvidableCompositionLocal r3 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r3 = (androidx.compose.runtime.CompositionLocal) r3
            r4 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r6 = "CC:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r14, r4, r6)
            java.lang.Object r3 = r14.consume(r3)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r14)
            androidx.compose.ui.unit.Density r3 = (androidx.compose.ui.unit.Density) r3
            int r10 = r2.getBottom(r3)
            androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$1 r2 = new androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$1
            r2.<init>(r12, r11, r1)
            r6 = r2
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$2 r3 = new androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$2
            r2 = r3
            r1 = r3
            r3 = r27
            r30 = r6
            r6 = r12
            r31 = r8
            r8 = r0
            r20 = r11
            r11 = r16
            r34 = r12
            r12 = r21
            r35 = r0
            r0 = r14
            r13 = r22
            r15 = r24
            r17 = r26
            r18 = r29
            r19 = r45
            r2.<init>(r3, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r17, r18, r19, r20)
            r2 = -620400863(0xffffffffdb056f21, float:-3.7558359E16)
            r3 = 1
            androidx.compose.runtime.internal.ComposableLambda r1 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r0, r2, r3, r1)
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            r2 = 48
            r3 = r30
            ModalBottomSheetPopup(r3, r1, r0, r2)
            boolean r1 = r34.getHasExpandedState()
            if (r1 == 0) goto L_0x037d
            r1 = 1157296644(0x44faf204, float:2007.563)
            r0.startReplaceableGroup(r1)
            java.lang.String r1 = "CC(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r0, r1)
            r1 = r34
            boolean r2 = r0.changed((java.lang.Object) r1)
            java.lang.Object r3 = r0.rememberedValue()
            if (r2 != 0) goto L_0x0366
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r3 != r2) goto L_0x0372
        L_0x0366:
            androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$3$1 r2 = new androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$3$1
            r3 = 0
            r2.<init>(r1, r3)
            r3 = r2
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
            r0.updateRememberedValue(r3)
        L_0x0372:
            r0.endReplaceableGroup()
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
            r2 = r31
            androidx.compose.runtime.EffectsKt.LaunchedEffect((java.lang.Object) r1, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) r3, (androidx.compose.runtime.Composer) r0, (int) r2)
            goto L_0x037f
        L_0x037d:
            r1 = r34
        L_0x037f:
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x0388
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0388:
            r2 = r35
            r3 = r1
            r4 = r21
            r5 = r22
            r7 = r24
            r9 = r26
            r10 = r27
            r12 = r29
        L_0x0397:
            androidx.compose.runtime.ScopeUpdateScope r15 = r0.endRestartGroup()
            if (r15 != 0) goto L_0x039e
            goto L_0x03b8
        L_0x039e:
            androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$4 r16 = new androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$4
            r0 = r16
            r1 = r33
            r13 = r45
            r14 = r47
            r32 = r15
            r15 = r48
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r10, r12, r13, r14, r15)
            r0 = r16
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1 = r32
            r1.updateScope(r0)
        L_0x03b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ModalBottomSheet_androidKt.m1435ModalBottomSheetxOkiWaM(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.material3.SheetState, androidx.compose.ui.graphics.Shape, long, long, float, long, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final SheetState rememberModalBottomSheetState(boolean z, Function1<? super SheetValue, Boolean> function1, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1261794383);
        ComposerKt.sourceInformation(composer, "C(rememberModalBottomSheetState)P(1)248@11461L69:ModalBottomSheet.android.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i2 & 2) != 0) {
            function1 = ModalBottomSheet_androidKt$rememberModalBottomSheetState$1.INSTANCE;
        }
        Function1<? super SheetValue, Boolean> function12 = function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1261794383, i, -1, "androidx.compose.material3.rememberModalBottomSheetState (ModalBottomSheet.android.kt:245)");
        }
        SheetState rememberSheetState = SheetDefaultsKt.rememberSheetState(z2, function12, SheetValue.Hidden, false, composer, (i & 14) | 384 | (i & 112), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberSheetState;
    }

    /* access modifiers changed from: private */
    /* renamed from: Scrim-3J-VO9M  reason: not valid java name */
    public static final void m1436Scrim3JVO9M(long j, Function0<Unit> function0, boolean z, Composer composer, int i) {
        int i2;
        Modifier modifier;
        Composer startRestartGroup = composer.startRestartGroup(1053897700);
        ComposerKt.sourceInformation(startRestartGroup, "C(Scrim)P(0:c#ui.graphics.Color)257@11690L121,275@12234L62,271@12128L168:ModalBottomSheet.android.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1053897700, i2, -1, "androidx.compose.material3.Scrim (ModalBottomSheet.android.kt:251)");
            }
            if (j != Color.Companion.m2857getUnspecified0d7_KjU()) {
                State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, new TweenSpec(0, 0, (Easing) null, 7, (DefaultConstructorMarker) null), 0.0f, (String) null, (Function1<? super Float, Unit>) null, startRestartGroup, 48, 28);
                startRestartGroup.startReplaceableGroup(-1858724388);
                ComposerKt.sourceInformation(startRestartGroup, "263@11923L124");
                if (z) {
                    Modifier modifier2 = Modifier.Companion;
                    startRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    boolean changed = startRestartGroup.changed((Object) function0);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new ModalBottomSheet_androidKt$Scrim$dismissSheet$1$1(function0, (Continuation<? super ModalBottomSheet_androidKt$Scrim$dismissSheet$1$1>) null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceableGroup();
                    modifier = SemanticsModifierKt.clearAndSetSemantics(SuspendingPointerInputFilterKt.pointerInput(modifier2, (Object) function0, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) (Function2) rememberedValue), ModalBottomSheet_androidKt$Scrim$dismissSheet$2.INSTANCE);
                } else {
                    modifier = Modifier.Companion;
                }
                startRestartGroup.endReplaceableGroup();
                Modifier then = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null).then(modifier);
                Color r2 = Color.m2811boximpl(j);
                startRestartGroup.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                boolean changed2 = startRestartGroup.changed((Object) r2) | startRestartGroup.changed((Object) animateFloatAsState);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new ModalBottomSheet_androidKt$Scrim$1$1(j, animateFloatAsState);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(then, (Function1) rememberedValue2, startRestartGroup, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ModalBottomSheet_androidKt$Scrim$2(j, function0, z, i));
        }
    }

    /* access modifiers changed from: private */
    public static final Modifier modalBottomSheetSwipeable(Modifier modifier, SheetState sheetState, AnchorChangeHandler<SheetValue> anchorChangeHandler, float f, float f2, Function2<? super CoroutineScope, ? super Float, Unit> function2) {
        SheetState sheetState2 = sheetState;
        float f3 = f;
        AnchorChangeHandler<SheetValue> anchorChangeHandler2 = anchorChangeHandler;
        return SwipeableV2Kt.swipeAnchors(DraggableKt.draggable$default(modifier, sheetState.getSwipeableState$material3_release().getSwipeDraggableState$material3_release(), Orientation.Vertical, sheetState.isVisible(), (MutableInteractionSource) null, sheetState.getSwipeableState$material3_release().isAnimationRunning(), (Function3) null, new ModalBottomSheet_androidKt$modalBottomSheetSwipeable$1(function2), false, 168, (Object) null), sheetState.getSwipeableState$material3_release(), SetsKt.setOf(SheetValue.Hidden, SheetValue.PartiallyExpanded, SheetValue.Expanded), anchorChangeHandler, new ModalBottomSheet_androidKt$modalBottomSheetSwipeable$2(f, f2, sheetState));
    }

    /* access modifiers changed from: private */
    public static final AnchorChangeHandler<SheetValue> ModalBottomSheetAnchorChangeHandler(SheetState sheetState, Function2<? super SheetValue, ? super Float, Unit> function2, Function1<? super SheetValue, Unit> function1) {
        return new ModalBottomSheet_androidKt$ModalBottomSheetAnchorChangeHandler$1(sheetState, function2, function1);
    }

    public static final void ModalBottomSheetPopup(Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i) {
        int i2;
        Function0<Unit> function02 = function0;
        Function2<? super Composer, ? super Integer, Unit> function22 = function2;
        int i3 = i;
        Intrinsics.checkNotNullParameter(function02, "onDismissRequest");
        Intrinsics.checkNotNullParameter(function22, "content");
        Composer startRestartGroup = composer.startRestartGroup(-2079923476);
        ComposerKt.sourceInformation(startRestartGroup, "C(ModalBottomSheetPopup)P(1)349@14958L123:ModalBottomSheet.android.kt#uh7d8r");
        if ((i3 & 14) == 0) {
            i2 = (startRestartGroup.changedInstance(function02) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i3 & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(function22) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2079923476, i2, -1, "androidx.compose.material3.ModalBottomSheetPopup (ModalBottomSheet.android.kt:346)");
            }
            AndroidPopup_androidKt.m5870PopupK5zGePQ((Alignment) null, 0, function0, new PopupProperties(true, false, false, (SecureFlagPolicy) null, false, false, 62, (DefaultConstructorMarker) null), function2, startRestartGroup, ((i2 << 6) & 896) | 3072 | ((i2 << 9) & 57344), 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ModalBottomSheet_androidKt$ModalBottomSheetPopup$1(function02, function22, i3));
        }
    }

    /* access modifiers changed from: private */
    public static final float Scrim_3J_VO9M$lambda$2(State<Float> state) {
        return state.getValue().floatValue();
    }
}
