package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0017\u001a\u0002\u0010\u0000\u001a\u00020\u00012\u001c\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\f2\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0015¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00172\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0015¢\u0006\u0002\b\u00052\u0019\b\u0002\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00102\b\b\u0002\u0010\u001c\u001a\u00020\u00102\u0017\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 \u001aq\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010$\u001a\u00020%26\u0010&\u001a2\u0012\u0013\u0012\u00110#¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0013\u0012\u00110+¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u00010'2!\u0010-\u001a\u001d\u0012\u0013\u0012\u00110#¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020\u00010\u0003H\u0003\u001aÃ\u0001\u0010.\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0013\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0015¢\u0006\u0002\b\u00052&\u0010/\u001a\"\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052&\u00101\u001a\"\u0012\u0013\u0012\u001102¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(3\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u00052\u0006\u0010\u000b\u001a\u00020\f2\f\u00104\u001a\b\u0012\u0004\u0012\u00020+0\u00152\u0006\u00105\u001a\u00020%2\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0010H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b6\u00107\u001a\u0001\u00108\u001a\u00020\u00012\u0006\u0010$\u001a\u00020%2\u0006\u00109\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u00103\u001a\u00020+2\u0006\u0010:\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010;\u001a\u00020\f2\u0006\u0010<\u001a\u00020\f2\u0013\u0010=\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0015¢\u0006\u0002\b\u00052\u001c\u0010\u001d\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u0006H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b>\u0010?\u001a!\u0010@\u001a\u00020\n2\b\b\u0002\u0010A\u001a\u00020%2\b\b\u0002\u0010B\u001a\u00020\u001aH\u0007¢\u0006\u0002\u0010C\u001a7\u0010D\u001a\u00020%2\b\b\u0002\u0010E\u001a\u00020#2\u0014\b\u0002\u0010F\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00170\u00032\b\b\u0002\u0010G\u001a\u00020\u0017H\u0007¢\u0006\u0002\u0010H\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006I"}, d2 = {"BottomSheetScaffold", "", "sheetContent", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "modifier", "Landroidx/compose/ui/Modifier;", "scaffoldState", "Landroidx/compose/material3/BottomSheetScaffoldState;", "sheetPeekHeight", "Landroidx/compose/ui/unit/Dp;", "sheetShape", "Landroidx/compose/ui/graphics/Shape;", "sheetContainerColor", "Landroidx/compose/ui/graphics/Color;", "sheetContentColor", "sheetTonalElevation", "sheetShadowElevation", "sheetDragHandle", "Lkotlin/Function0;", "sheetSwipeEnabled", "", "topBar", "snackbarHost", "Landroidx/compose/material3/SnackbarHostState;", "containerColor", "contentColor", "content", "Landroidx/compose/foundation/layout/PaddingValues;", "BottomSheetScaffold-6cEcpDs", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/BottomSheetScaffoldState;FLandroidx/compose/ui/graphics/Shape;JJFFLkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;JJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "BottomSheetScaffoldAnchorChangeHandler", "Landroidx/compose/material3/AnchorChangeHandler;", "Landroidx/compose/material3/SheetValue;", "state", "Landroidx/compose/material3/SheetState;", "animateTo", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "target", "", "velocity", "snapTo", "BottomSheetScaffoldLayout", "body", "innerPadding", "bottomSheet", "", "layoutHeight", "sheetOffset", "sheetState", "BottomSheetScaffoldLayout-PxNyym8", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;FLkotlin/jvm/functions/Function0;Landroidx/compose/material3/SheetState;JJLandroidx/compose/runtime/Composer;I)V", "StandardBottomSheet", "peekHeight", "shape", "tonalElevation", "shadowElevation", "dragHandle", "StandardBottomSheet-8oydGBM", "(Landroidx/compose/material3/SheetState;FZFLandroidx/compose/ui/graphics/Shape;JJFFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "rememberBottomSheetScaffoldState", "bottomSheetState", "snackbarHostState", "(Landroidx/compose/material3/SheetState;Landroidx/compose/material3/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/BottomSheetScaffoldState;", "rememberStandardBottomSheetState", "initialValue", "confirmValueChange", "skipHiddenState", "(Landroidx/compose/material3/SheetValue;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: BottomSheetScaffold.kt */
public final class BottomSheetScaffoldKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v16, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v15, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v55, resolved type: int} */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x01b6, code lost:
        if (r2.changed(r45) != false) goto L_0x01bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x01d3, code lost:
        if (r2.changed(r47) != false) goto L_0x01da;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x0462  */
    /* JADX WARNING: Removed duplicated region for block: B:260:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0139  */
    /* renamed from: BottomSheetScaffold-6cEcpDs  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1143BottomSheetScaffold6cEcpDs(kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r30, androidx.compose.ui.Modifier r31, androidx.compose.material3.BottomSheetScaffoldState r32, float r33, androidx.compose.ui.graphics.Shape r34, long r35, long r37, float r39, float r40, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r41, boolean r42, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r43, kotlin.jvm.functions.Function3<? super androidx.compose.material3.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r44, long r45, long r47, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.PaddingValues, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r49, androidx.compose.runtime.Composer r50, int r51, int r52, int r53) {
        /*
            r1 = r30
            r15 = r49
            r14 = r51
            r13 = r52
            r12 = r53
            java.lang.String r0 = "sheetContent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            r0 = 144898711(0x8a2fa97, float:9.808934E-34)
            r2 = r50
            androidx.compose.runtime.Composer r2 = r2.startRestartGroup(r0)
            java.lang.String r3 = "C(BottomSheetScaffold)P(6,3,4,9:c#ui.unit.Dp,11,5:c#ui.graphics.Color,7:c#ui.graphics.Color,13:c#ui.unit.Dp,10:c#ui.unit.Dp,8,12,15,14,0:c#ui.graphics.Color,2:c#ui.graphics.Color)99@5165L34,101@5308L13,102@5376L14,103@5423L36,110@5880L11,111@5927L31,122@6281L50,114@6017L1096:BottomSheetScaffold.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r3)
            r3 = r12 & 1
            if (r3 == 0) goto L_0x002b
            r3 = r14 | 6
            goto L_0x003b
        L_0x002b:
            r3 = r14 & 14
            if (r3 != 0) goto L_0x003a
            boolean r3 = r2.changedInstance(r1)
            if (r3 == 0) goto L_0x0037
            r3 = 4
            goto L_0x0038
        L_0x0037:
            r3 = 2
        L_0x0038:
            r3 = r3 | r14
            goto L_0x003b
        L_0x003a:
            r3 = r14
        L_0x003b:
            r6 = r12 & 2
            if (r6 == 0) goto L_0x0042
            r3 = r3 | 48
            goto L_0x0055
        L_0x0042:
            r9 = r14 & 112(0x70, float:1.57E-43)
            if (r9 != 0) goto L_0x0055
            r9 = r31
            boolean r10 = r2.changed((java.lang.Object) r9)
            if (r10 == 0) goto L_0x0051
            r10 = 32
            goto L_0x0053
        L_0x0051:
            r10 = 16
        L_0x0053:
            r3 = r3 | r10
            goto L_0x0057
        L_0x0055:
            r9 = r31
        L_0x0057:
            r10 = r14 & 896(0x380, float:1.256E-42)
            r16 = 128(0x80, float:1.794E-43)
            if (r10 != 0) goto L_0x0073
            r10 = r12 & 4
            if (r10 != 0) goto L_0x006c
            r10 = r32
            boolean r17 = r2.changed((java.lang.Object) r10)
            if (r17 == 0) goto L_0x006e
            r17 = 256(0x100, float:3.59E-43)
            goto L_0x0070
        L_0x006c:
            r10 = r32
        L_0x006e:
            r17 = r16
        L_0x0070:
            r3 = r3 | r17
            goto L_0x0075
        L_0x0073:
            r10 = r32
        L_0x0075:
            r17 = r12 & 8
            r18 = 2048(0x800, float:2.87E-42)
            r19 = 1024(0x400, float:1.435E-42)
            if (r17 == 0) goto L_0x0080
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0094
        L_0x0080:
            r4 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r4 != 0) goto L_0x0094
            r4 = r33
            boolean r20 = r2.changed((float) r4)
            if (r20 == 0) goto L_0x008f
            r20 = r18
            goto L_0x0091
        L_0x008f:
            r20 = r19
        L_0x0091:
            r3 = r3 | r20
            goto L_0x0096
        L_0x0094:
            r4 = r33
        L_0x0096:
            r20 = 57344(0xe000, float:8.0356E-41)
            r20 = r14 & r20
            r21 = 16384(0x4000, float:2.2959E-41)
            r22 = 8192(0x2000, float:1.14794E-41)
            if (r20 != 0) goto L_0x00b5
            r20 = r12 & 16
            r5 = r34
            if (r20 != 0) goto L_0x00b0
            boolean r23 = r2.changed((java.lang.Object) r5)
            if (r23 == 0) goto L_0x00b0
            r23 = r21
            goto L_0x00b2
        L_0x00b0:
            r23 = r22
        L_0x00b2:
            r3 = r3 | r23
            goto L_0x00b7
        L_0x00b5:
            r5 = r34
        L_0x00b7:
            r23 = 458752(0x70000, float:6.42848E-40)
            r24 = r14 & r23
            if (r24 != 0) goto L_0x00d1
            r24 = r12 & 32
            r7 = r35
            if (r24 != 0) goto L_0x00cc
            boolean r26 = r2.changed((long) r7)
            if (r26 == 0) goto L_0x00cc
            r26 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ce
        L_0x00cc:
            r26 = 65536(0x10000, float:9.18355E-41)
        L_0x00ce:
            r3 = r3 | r26
            goto L_0x00d3
        L_0x00d1:
            r7 = r35
        L_0x00d3:
            r26 = 3670016(0x380000, float:5.142788E-39)
            r26 = r14 & r26
            if (r26 != 0) goto L_0x00ed
            r26 = r12 & 64
            r0 = r37
            if (r26 != 0) goto L_0x00e8
            boolean r27 = r2.changed((long) r0)
            if (r27 == 0) goto L_0x00e8
            r27 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ea
        L_0x00e8:
            r27 = 524288(0x80000, float:7.34684E-40)
        L_0x00ea:
            r3 = r3 | r27
            goto L_0x00ef
        L_0x00ed:
            r0 = r37
        L_0x00ef:
            r11 = r12 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x00fa
            r28 = 12582912(0xc00000, float:1.7632415E-38)
            r3 = r3 | r28
            r0 = r39
            goto L_0x010e
        L_0x00fa:
            r28 = 29360128(0x1c00000, float:7.052966E-38)
            r28 = r14 & r28
            r0 = r39
            if (r28 != 0) goto L_0x010e
            boolean r1 = r2.changed((float) r0)
            if (r1 == 0) goto L_0x010b
            r1 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x010d
        L_0x010b:
            r1 = 4194304(0x400000, float:5.877472E-39)
        L_0x010d:
            r3 = r3 | r1
        L_0x010e:
            r1 = r12 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0119
            r28 = 100663296(0x6000000, float:2.4074124E-35)
            r3 = r3 | r28
            r0 = r40
            goto L_0x012e
        L_0x0119:
            r28 = 234881024(0xe000000, float:1.5777218E-30)
            r28 = r14 & r28
            r0 = r40
            if (r28 != 0) goto L_0x012e
            boolean r28 = r2.changed((float) r0)
            if (r28 == 0) goto L_0x012a
            r28 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x012c
        L_0x012a:
            r28 = 33554432(0x2000000, float:9.403955E-38)
        L_0x012c:
            r3 = r3 | r28
        L_0x012e:
            r0 = r12 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0139
            r28 = 805306368(0x30000000, float:4.656613E-10)
            r3 = r3 | r28
            r4 = r41
            goto L_0x014e
        L_0x0139:
            r28 = 1879048192(0x70000000, float:1.58456325E29)
            r28 = r14 & r28
            r4 = r41
            if (r28 != 0) goto L_0x014e
            boolean r28 = r2.changedInstance(r4)
            if (r28 == 0) goto L_0x014a
            r28 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x014c
        L_0x014a:
            r28 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x014c:
            r3 = r3 | r28
        L_0x014e:
            r4 = r12 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L_0x0157
            r20 = r13 | 6
            r5 = r42
            goto L_0x016d
        L_0x0157:
            r28 = r13 & 14
            r5 = r42
            if (r28 != 0) goto L_0x016b
            boolean r28 = r2.changed((boolean) r5)
            if (r28 == 0) goto L_0x0166
            r20 = 4
            goto L_0x0168
        L_0x0166:
            r20 = 2
        L_0x0168:
            r20 = r13 | r20
            goto L_0x016d
        L_0x016b:
            r20 = r13
        L_0x016d:
            r5 = r12 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x0176
            r20 = r20 | 48
            r7 = r43
            goto L_0x0189
        L_0x0176:
            r28 = r13 & 112(0x70, float:1.57E-43)
            r7 = r43
            if (r28 != 0) goto L_0x0189
            boolean r8 = r2.changedInstance(r7)
            if (r8 == 0) goto L_0x0185
            r24 = 32
            goto L_0x0187
        L_0x0185:
            r24 = 16
        L_0x0187:
            r20 = r20 | r24
        L_0x0189:
            r8 = r20
            r7 = r12 & 4096(0x1000, float:5.74E-42)
            if (r7 == 0) goto L_0x0192
            r8 = r8 | 384(0x180, float:5.38E-43)
            goto L_0x01a6
        L_0x0192:
            r9 = r13 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x01a6
            r9 = r44
            boolean r20 = r2.changedInstance(r9)
            if (r20 == 0) goto L_0x01a1
            r27 = 256(0x100, float:3.59E-43)
            goto L_0x01a3
        L_0x01a1:
            r27 = r16
        L_0x01a3:
            r8 = r8 | r27
            goto L_0x01a8
        L_0x01a6:
            r9 = r44
        L_0x01a8:
            r9 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x01c0
            r9 = r12 & 8192(0x2000, float:1.14794E-41)
            if (r9 != 0) goto L_0x01b9
            r9 = r45
            boolean r16 = r2.changed((long) r9)
            if (r16 == 0) goto L_0x01bb
            goto L_0x01bd
        L_0x01b9:
            r9 = r45
        L_0x01bb:
            r18 = r19
        L_0x01bd:
            r8 = r8 | r18
            goto L_0x01c2
        L_0x01c0:
            r9 = r45
        L_0x01c2:
            r16 = 57344(0xe000, float:8.0356E-41)
            r16 = r13 & r16
            if (r16 != 0) goto L_0x01dd
            r9 = r12 & 16384(0x4000, float:2.2959E-41)
            if (r9 != 0) goto L_0x01d6
            r9 = r47
            boolean r16 = r2.changed((long) r9)
            if (r16 == 0) goto L_0x01d8
            goto L_0x01da
        L_0x01d6:
            r9 = r47
        L_0x01d8:
            r21 = r22
        L_0x01da:
            r8 = r8 | r21
            goto L_0x01df
        L_0x01dd:
            r9 = r47
        L_0x01df:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r12 & r16
            if (r16 == 0) goto L_0x01eb
            r16 = 196608(0x30000, float:2.75506E-40)
        L_0x01e8:
            r8 = r8 | r16
            goto L_0x01fb
        L_0x01eb:
            r16 = r13 & r23
            if (r16 != 0) goto L_0x01fb
            boolean r16 = r2.changedInstance(r15)
            if (r16 == 0) goto L_0x01f8
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01e8
        L_0x01f8:
            r16 = 65536(0x10000, float:9.18355E-41)
            goto L_0x01e8
        L_0x01fb:
            r16 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r9 = r3 & r16
            r10 = 306783378(0x12492492, float:6.3469493E-28)
            if (r9 != r10) goto L_0x0236
            r9 = 374491(0x5b6db, float:5.24774E-40)
            r9 = r9 & r8
            r10 = 74898(0x12492, float:1.04954E-40)
            if (r9 != r10) goto L_0x0236
            boolean r9 = r2.getSkipping()
            if (r9 != 0) goto L_0x0215
            goto L_0x0236
        L_0x0215:
            r2.skipToGroupEnd()
            r3 = r31
            r4 = r32
            r5 = r33
            r6 = r34
            r9 = r35
            r19 = r37
            r11 = r39
            r12 = r40
            r13 = r41
            r14 = r42
            r17 = r43
            r15 = r44
            r21 = r45
            r24 = r47
            goto L_0x045b
        L_0x0236:
            r2.startDefaults()
            r9 = r14 & 1
            if (r9 == 0) goto L_0x0293
            boolean r9 = r2.getDefaultsInvalid()
            if (r9 == 0) goto L_0x0244
            goto L_0x0293
        L_0x0244:
            r2.skipToGroupEnd()
            r0 = r12 & 4
            if (r0 == 0) goto L_0x024d
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x024d:
            r0 = r12 & 16
            if (r0 == 0) goto L_0x0255
            r0 = -57345(0xffffffffffff1fff, float:NaN)
            r3 = r3 & r0
        L_0x0255:
            r0 = r12 & 32
            if (r0 == 0) goto L_0x025d
            r0 = -458753(0xfffffffffff8ffff, float:NaN)
            r3 = r3 & r0
        L_0x025d:
            r0 = r12 & 64
            if (r0 == 0) goto L_0x0265
            r0 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = r3 & r0
        L_0x0265:
            r0 = r12 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x026b
            r8 = r8 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x026b:
            r0 = r12 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0273
            r0 = -57345(0xffffffffffff1fff, float:NaN)
            r8 = r8 & r0
        L_0x0273:
            r0 = r31
            r1 = r32
            r4 = r34
            r9 = r35
            r19 = r37
            r6 = r39
            r5 = r40
            r7 = r41
            r17 = r43
            r11 = r44
            r21 = r45
            r24 = r47
            r12 = r3
            r13 = r8
            r3 = r33
            r8 = r42
            goto L_0x0389
        L_0x0293:
            if (r6 == 0) goto L_0x029a
            androidx.compose.ui.Modifier$Companion r6 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r6 = (androidx.compose.ui.Modifier) r6
            goto L_0x029c
        L_0x029a:
            r6 = r31
        L_0x029c:
            r9 = r12 & 4
            r10 = 0
            if (r9 == 0) goto L_0x02ac
            r9 = 0
            r31 = r6
            r6 = 3
            androidx.compose.material3.BottomSheetScaffoldState r6 = rememberBottomSheetScaffoldState(r10, r10, r2, r9, r6)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x02b0
        L_0x02ac:
            r31 = r6
            r6 = r32
        L_0x02b0:
            if (r17 == 0) goto L_0x02b9
            androidx.compose.material3.BottomSheetDefaults r9 = androidx.compose.material3.BottomSheetDefaults.INSTANCE
            float r9 = r9.m1142getSheetPeekHeightD9Ej5fM()
            goto L_0x02bb
        L_0x02b9:
            r9 = r33
        L_0x02bb:
            r17 = r12 & 16
            if (r17 == 0) goto L_0x02ce
            androidx.compose.material3.BottomSheetDefaults r10 = androidx.compose.material3.BottomSheetDefaults.INSTANCE
            r32 = r6
            r6 = 6
            androidx.compose.ui.graphics.Shape r10 = r10.getExpandedShape(r2, r6)
            r16 = -57345(0xffffffffffff1fff, float:NaN)
            r3 = r3 & r16
            goto L_0x02d3
        L_0x02ce:
            r32 = r6
            r6 = 6
            r10 = r34
        L_0x02d3:
            r16 = r12 & 32
            r33 = r9
            if (r16 == 0) goto L_0x02e8
            androidx.compose.material3.BottomSheetDefaults r9 = androidx.compose.material3.BottomSheetDefaults.INSTANCE
            long r19 = r9.getContainerColor(r2, r6)
            r6 = -458753(0xfffffffffff8ffff, float:NaN)
            r3 = r3 & r6
            r34 = r10
            r9 = r19
            goto L_0x02ec
        L_0x02e8:
            r34 = r10
            r9 = r35
        L_0x02ec:
            r6 = r12 & 64
            if (r6 == 0) goto L_0x02fd
            int r6 = r3 >> 15
            r6 = r6 & 14
            long r19 = androidx.compose.material3.ColorSchemeKt.m1242contentColorForek8zF_U(r9, r2, r6)
            r6 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = r3 & r6
            goto L_0x02ff
        L_0x02fd:
            r19 = r37
        L_0x02ff:
            if (r11 == 0) goto L_0x0308
            androidx.compose.material3.BottomSheetDefaults r6 = androidx.compose.material3.BottomSheetDefaults.INSTANCE
            float r6 = r6.m1141getElevationD9Ej5fM()
            goto L_0x030a
        L_0x0308:
            r6 = r39
        L_0x030a:
            if (r1 == 0) goto L_0x0313
            androidx.compose.material3.BottomSheetDefaults r1 = androidx.compose.material3.BottomSheetDefaults.INSTANCE
            float r1 = r1.m1141getElevationD9Ej5fM()
            goto L_0x0315
        L_0x0313:
            r1 = r40
        L_0x0315:
            if (r0 == 0) goto L_0x031e
            androidx.compose.material3.ComposableSingletons$BottomSheetScaffoldKt r0 = androidx.compose.material3.ComposableSingletons$BottomSheetScaffoldKt.INSTANCE
            kotlin.jvm.functions.Function2 r0 = r0.m1260getLambda1$material3_release()
            goto L_0x0320
        L_0x031e:
            r0 = r41
        L_0x0320:
            if (r4 == 0) goto L_0x0324
            r4 = 1
            goto L_0x0326
        L_0x0324:
            r4 = r42
        L_0x0326:
            if (r5 == 0) goto L_0x032b
            r17 = 0
            goto L_0x032d
        L_0x032b:
            r17 = r43
        L_0x032d:
            if (r7 == 0) goto L_0x0336
            androidx.compose.material3.ComposableSingletons$BottomSheetScaffoldKt r5 = androidx.compose.material3.ComposableSingletons$BottomSheetScaffoldKt.INSTANCE
            kotlin.jvm.functions.Function3 r5 = r5.m1261getLambda2$material3_release()
            goto L_0x0338
        L_0x0336:
            r5 = r44
        L_0x0338:
            r7 = r12 & 8192(0x2000, float:1.14794E-41)
            if (r7 == 0) goto L_0x034d
            androidx.compose.material3.MaterialTheme r7 = androidx.compose.material3.MaterialTheme.INSTANCE
            r11 = 6
            androidx.compose.material3.ColorScheme r7 = r7.getColorScheme(r2, r11)
            long r21 = r7.m1206getSurface0d7_KjU()
            r8 = r8 & -7169(0xffffffffffffe3ff, float:NaN)
            r11 = r8
            r7 = r21
            goto L_0x0350
        L_0x034d:
            r11 = r8
            r7 = r45
        L_0x0350:
            r35 = r0
            r0 = r12 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0376
            int r0 = r11 >> 9
            r0 = r0 & 14
            long r21 = androidx.compose.material3.ColorSchemeKt.m1242contentColorForek8zF_U(r7, r2, r0)
            r0 = -57345(0xffffffffffff1fff, float:NaN)
            r0 = r0 & r11
            r13 = r0
            r12 = r3
            r11 = r5
            r24 = r21
            r0 = r31
            r3 = r33
            r5 = r1
            r21 = r7
            r1 = r32
            r7 = r35
            r8 = r4
            r4 = r34
            goto L_0x0389
        L_0x0376:
            r0 = r31
            r24 = r47
            r12 = r3
            r21 = r7
            r13 = r11
            r3 = r33
            r7 = r35
            r8 = r4
            r11 = r5
            r4 = r34
            r5 = r1
            r1 = r32
        L_0x0389:
            r2.endDefaults()
            boolean r27 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r27 == 0) goto L_0x039b
            java.lang.String r14 = "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:96)"
            r15 = 144898711(0x8a2fa97, float:9.808934E-34)
            androidx.compose.runtime.ComposerKt.traceEventStart(r15, r12, r13, r14)
        L_0x039b:
            androidx.compose.material3.SheetState r14 = r1.getBottomSheetState()
            androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffold$1 r15 = new androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffold$1
            r31 = r15
            r32 = r1
            r33 = r3
            r34 = r8
            r35 = r4
            r36 = r9
            r38 = r19
            r40 = r6
            r41 = r5
            r42 = r7
            r43 = r30
            r44 = r12
            r45 = r13
            r31.<init>(r32, r33, r34, r35, r36, r38, r40, r41, r42, r43, r44, r45)
            r45 = r4
            r4 = 106433656(0x6580c78, float:4.0634245E-35)
            r46 = r5
            r5 = 1
            androidx.compose.runtime.internal.ComposableLambda r4 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r2, r4, r5, r15)
            kotlin.jvm.functions.Function3 r4 = (kotlin.jvm.functions.Function3) r4
            androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffold$2 r15 = new androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffold$2
            r15.<init>(r11, r1, r13)
            r47 = r6
            r6 = -1629779374(0xffffffff9edb8a52, float:-2.3244735E-20)
            androidx.compose.runtime.internal.ComposableLambda r5 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r2, r6, r5, r15)
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            r6 = 1157296644(0x44faf204, float:2007.563)
            r2.startReplaceableGroup(r6)
            java.lang.String r6 = "CC(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r6)
            boolean r6 = r2.changed((java.lang.Object) r1)
            java.lang.Object r15 = r2.rememberedValue()
            if (r6 != 0) goto L_0x03f9
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r6 = r6.getEmpty()
            if (r15 != r6) goto L_0x0404
        L_0x03f9:
            androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffold$3$1 r6 = new androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffold$3$1
            r6.<init>(r1)
            r15 = r6
            kotlin.jvm.functions.Function0 r15 = (kotlin.jvm.functions.Function0) r15
            r2.updateRememberedValue(r15)
        L_0x0404:
            r2.endReplaceableGroup()
            r6 = r15
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            int r15 = r12 >> 3
            r15 = r15 & 14
            r15 = r15 | 27648(0x6c00, float:3.8743E-41)
            r18 = r13 & 112(0x70, float:1.57E-43)
            r15 = r15 | r18
            r48 = r1
            int r1 = r13 >> 9
            r1 = r1 & 896(0x380, float:1.256E-42)
            r1 = r1 | r15
            r15 = 6
            int r12 = r12 << r15
            r12 = r12 & r23
            r1 = r1 | r12
            int r12 = r13 << 15
            r13 = 234881024(0xe000000, float:1.5777218E-30)
            r13 = r13 & r12
            r1 = r1 | r13
            r13 = 1879048192(0x70000000, float:1.58456325E29)
            r12 = r12 & r13
            r1 = r1 | r12
            r31 = r0
            r32 = r17
            r33 = r49
            r34 = r4
            r35 = r5
            r36 = r3
            r37 = r6
            r38 = r14
            r39 = r21
            r41 = r24
            r43 = r2
            r44 = r1
            m1144BottomSheetScaffoldLayoutPxNyym8(r31, r32, r33, r34, r35, r36, r37, r38, r39, r41, r43, r44)
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x044e
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x044e:
            r6 = r45
            r12 = r46
            r4 = r48
            r5 = r3
            r13 = r7
            r14 = r8
            r15 = r11
            r11 = r47
            r3 = r0
        L_0x045b:
            androidx.compose.runtime.ScopeUpdateScope r8 = r2.endRestartGroup()
            if (r8 != 0) goto L_0x0462
            goto L_0x0490
        L_0x0462:
            androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffold$4 r26 = new androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffold$4
            r0 = r26
            r1 = r30
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r9
            r10 = r8
            r8 = r19
            r29 = r10
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r14
            r14 = r17
            r16 = r21
            r18 = r24
            r20 = r49
            r21 = r51
            r22 = r52
            r23 = r53
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r10, r11, r12, r13, r14, r15, r16, r18, r20, r21, r22, r23)
            r0 = r26
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1 = r29
            r1.updateScope(r0)
        L_0x0490:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.BottomSheetScaffoldKt.m1143BottomSheetScaffold6cEcpDs(kotlin.jvm.functions.Function3, androidx.compose.ui.Modifier, androidx.compose.material3.BottomSheetScaffoldState, float, androidx.compose.ui.graphics.Shape, long, long, float, float, kotlin.jvm.functions.Function2, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, long, long, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final BottomSheetScaffoldState rememberBottomSheetScaffoldState(SheetState sheetState, SnackbarHostState snackbarHostState, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1474606134);
        ComposerKt.sourceInformation(composer, "C(rememberBottomSheetScaffoldState)167@7874L34,168@7953L32,170@8027L196:BottomSheetScaffold.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            sheetState = rememberStandardBottomSheetState((SheetValue) null, (Function1<? super SheetValue, Boolean>) null, false, composer, 0, 7);
        }
        if ((i2 & 2) != 0) {
            composer.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new SnackbarHostState();
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            snackbarHostState = (SnackbarHostState) rememberedValue;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1474606134, i, -1, "androidx.compose.material3.rememberBottomSheetScaffoldState (BottomSheetScaffold.kt:166)");
        }
        composer.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
        boolean changed = composer.changed((Object) sheetState) | composer.changed((Object) snackbarHostState);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new BottomSheetScaffoldState(sheetState, snackbarHostState);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        BottomSheetScaffoldState bottomSheetScaffoldState = (BottomSheetScaffoldState) rememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return bottomSheetScaffoldState;
    }

    public static final SheetState rememberStandardBottomSheetState(SheetValue sheetValue, Function1<? super SheetValue, Boolean> function1, boolean z, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(678511581);
        ComposerKt.sourceInformation(composer, "C(rememberStandardBottomSheetState)P(1)192@8853L76:BottomSheetScaffold.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            sheetValue = SheetValue.PartiallyExpanded;
        }
        SheetValue sheetValue2 = sheetValue;
        if ((i2 & 2) != 0) {
            function1 = BottomSheetScaffoldKt$rememberStandardBottomSheetState$1.INSTANCE;
        }
        Function1<? super SheetValue, Boolean> function12 = function1;
        if ((i2 & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(678511581, i, -1, "androidx.compose.material3.rememberStandardBottomSheetState (BottomSheetScaffold.kt:188)");
        }
        SheetState rememberSheetState = SheetDefaultsKt.rememberSheetState(false, function12, sheetValue2, z2, composer, (i & 112) | 6 | ((i << 6) & 896) | ((i << 3) & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberSheetState;
    }

    /* access modifiers changed from: private */
    /* renamed from: StandardBottomSheet-8oydGBM  reason: not valid java name */
    public static final void m1145StandardBottomSheet8oydGBM(SheetState sheetState, float f, boolean z, float f2, Shape shape, long j, long j2, float f3, float f4, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i, int i2) {
        int i3;
        int i4;
        SheetState sheetState2 = sheetState;
        float f5 = f;
        float f6 = f2;
        int i5 = i;
        Composer startRestartGroup = composer.startRestartGroup(-763942484);
        ComposerKt.sourceInformation(startRestartGroup, "C(StandardBottomSheet)P(9,5:c#ui.unit.Dp,8,4,7,0:c#ui.graphics.Color,2:c#ui.graphics.Color,10:c#ui.unit.Dp,6:c#ui.unit.Dp,3)209@9346L24,*210@9412L7,214@9580L467,235@10256L318,252@10976L530,229@10052L3768:BottomSheetScaffold.kt#uh7d8r");
        int i6 = 4;
        if ((i5 & 14) == 0) {
            i3 = (startRestartGroup.changed((Object) sheetState2) ? 4 : 2) | i5;
        } else {
            i3 = i5;
        }
        if ((i5 & 112) == 0) {
            i3 |= startRestartGroup.changed(f5) ? 32 : 16;
        }
        boolean z2 = z;
        if ((i5 & 896) == 0) {
            i3 |= startRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i5 & 7168) == 0) {
            i3 |= startRestartGroup.changed(f6) ? 2048 : 1024;
        }
        Shape shape2 = shape;
        if ((i5 & 57344) == 0) {
            i3 |= startRestartGroup.changed((Object) shape2) ? 16384 : 8192;
        }
        long j3 = j;
        if ((i5 & 458752) == 0) {
            i3 |= startRestartGroup.changed(j3) ? 131072 : 65536;
        }
        if ((3670016 & i5) == 0) {
            i3 |= startRestartGroup.changed(j2) ? 1048576 : 524288;
        } else {
            long j4 = j2;
        }
        if ((29360128 & i5) == 0) {
            i3 |= startRestartGroup.changed(f3) ? 8388608 : 4194304;
        } else {
            float f7 = f3;
        }
        float f8 = f4;
        if ((i5 & 234881024) == 0) {
            i3 |= startRestartGroup.changed(f8) ? 67108864 : 33554432;
        }
        Function2<? super Composer, ? super Integer, Unit> function22 = function2;
        if ((i5 & 1879048192) == 0) {
            i3 |= startRestartGroup.changedInstance(function22) ? 536870912 : 268435456;
        }
        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function32 = function3;
        if ((i2 & 14) == 0) {
            if (!startRestartGroup.changedInstance(function32)) {
                i6 = 2;
            }
            i4 = i2 | i6;
        } else {
            i4 = i2;
        }
        if ((i3 & 1533916891) == 306783378 && (i4 & 11) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-763942484, i3, i4, "androidx.compose.material3.StandardBottomSheet (BottomSheetScaffold.kt:196)");
            }
            startRestartGroup.startReplaceableGroup(773894976);
            ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)476@19869L144:Effects.kt#9igjgp");
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            startRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            startRestartGroup.endReplaceableGroup();
            int i7 = i3;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            float r0 = ((Density) consume).m5607toPx0680j_4(f5);
            Orientation orientation = Orientation.Vertical;
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed((Object) sheetState2) | startRestartGroup.changed((Object) coroutineScope);
            int i8 = i4;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = BottomSheetScaffoldAnchorChangeHandler(sheetState2, new BottomSheetScaffoldKt$StandardBottomSheet$anchorChangeHandler$1$1(coroutineScope, sheetState2), new BottomSheetScaffoldKt$StandardBottomSheet$anchorChangeHandler$1$2(coroutineScope, sheetState2));
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            AnchorChangeHandler anchorChangeHandler = (AnchorChangeHandler) rememberedValue2;
            Modifier r3 = SizeKt.m554requiredHeightInVpY3zN4$default(SizeKt.fillMaxWidth$default(SizeKt.m570widthInVpY3zN4$default(Modifier.Companion, 0.0f, SheetDefaultsKt.getBottomSheetMaxWidth(), 1, (Object) null), 0.0f, 1, (Object) null), f5, 0.0f, 2, (Object) null);
            SwipeableV2State<SheetValue> swipeableState$material3_release = sheetState.getSwipeableState$material3_release();
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed2 = startRestartGroup.changed((Object) swipeableState$material3_release);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = SheetDefaultsKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(sheetState2, orientation, new BottomSheetScaffoldKt$StandardBottomSheet$1$1(coroutineScope, sheetState2));
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier swipeableV2$default = SwipeableV2Kt.swipeableV2$default(NestedScrollModifierKt.nestedScroll$default(r3, (NestedScrollConnection) rememberedValue3, (NestedScrollDispatcher) null, 2, (Object) null), sheetState.getSwipeableState$material3_release(), orientation, z, false, (MutableInteractionSource) null, 24, (Object) null);
            SwipeableV2State<SheetValue> swipeableState$material3_release2 = sheetState.getSwipeableState$material3_release();
            Set of = SetsKt.setOf(SheetValue.Hidden, SheetValue.PartiallyExpanded, SheetValue.Expanded);
            Float valueOf = Float.valueOf(f2);
            Float valueOf2 = Float.valueOf(r0);
            startRestartGroup.startReplaceableGroup(1618982084);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
            boolean changed3 = startRestartGroup.changed((Object) valueOf) | startRestartGroup.changed((Object) sheetState2) | startRestartGroup.changed((Object) valueOf2);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue4 == Composer.Companion.getEmpty()) {
                rememberedValue4 = new BottomSheetScaffoldKt$StandardBottomSheet$2$1(sheetState2, f6, r0);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier swipeAnchors = SwipeableV2Kt.swipeAnchors(swipeableV2$default, swipeableState$material3_release2, of, anchorChangeHandler, (Function2) rememberedValue4);
            int i9 = i7;
            BottomSheetScaffoldKt$StandardBottomSheet$3 bottomSheetScaffoldKt$StandardBottomSheet$3 = r0;
            BottomSheetScaffoldKt$StandardBottomSheet$3 bottomSheetScaffoldKt$StandardBottomSheet$32 = new BottomSheetScaffoldKt$StandardBottomSheet$3(function2, function3, i8, sheetState, z, coroutineScope, i9);
            int i10 = i9 >> 9;
            SurfaceKt.m1641SurfaceT9BRK9s(swipeAnchors, shape, j, j2, f3, f4, (BorderStroke) null, ComposableLambdaKt.composableLambda(startRestartGroup, -1381492089, true, bottomSheetScaffoldKt$StandardBottomSheet$3), startRestartGroup, (i10 & 112) | 12582912 | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (i10 & 458752), 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new BottomSheetScaffoldKt$StandardBottomSheet$4(sheetState, f, z, f2, shape, j, j2, f3, f4, function2, function3, i, i2));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: BottomSheetScaffoldLayout-PxNyym8  reason: not valid java name */
    public static final void m1144BottomSheetScaffoldLayoutPxNyym8(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, Function3<? super Integer, ? super Composer, ? super Integer, Unit> function32, Function2<? super Composer, ? super Integer, Unit> function22, float f, Function0<Float> function0, SheetState sheetState, long j, long j2, Composer composer, int i) {
        int i2;
        int i3 = i;
        Composer startRestartGroup = composer.startRestartGroup(-1120561936);
        ComposerKt.sourceInformation(startRestartGroup, "C(BottomSheetScaffoldLayout)P(4,9!2,8,6:c#ui.unit.Dp,5,7,2:c#ui.graphics.Color,3:c#ui.graphics.Color)328@14299L1935,328@14282L1952:BottomSheetScaffold.kt#uh7d8r");
        if ((i3 & 14) == 0) {
            i2 = (startRestartGroup.changed((Object) modifier) ? 4 : 2) | i3;
        } else {
            Modifier modifier2 = modifier;
            i2 = i3;
        }
        Function2<? super Composer, ? super Integer, Unit> function23 = function2;
        if ((i3 & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(function23) ? 32 : 16;
        }
        Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function33 = function3;
        if ((i3 & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(function33) ? 256 : 128;
        }
        Function3<? super Integer, ? super Composer, ? super Integer, Unit> function34 = function32;
        if ((i3 & 7168) == 0) {
            i2 |= startRestartGroup.changedInstance(function34) ? 2048 : 1024;
        }
        Function2<? super Composer, ? super Integer, Unit> function24 = function22;
        if ((57344 & i3) == 0) {
            i2 |= startRestartGroup.changedInstance(function24) ? 16384 : 8192;
        }
        float f2 = f;
        if ((458752 & i3) == 0) {
            i2 |= startRestartGroup.changed(f2) ? 131072 : 65536;
        }
        Function0<Float> function02 = function0;
        if ((3670016 & i3) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 1048576 : 524288;
        }
        SheetState sheetState2 = sheetState;
        if ((29360128 & i3) == 0) {
            i2 |= startRestartGroup.changed((Object) sheetState2) ? 8388608 : 4194304;
        }
        long j3 = j;
        if ((234881024 & i3) == 0) {
            i2 |= startRestartGroup.changed(j3) ? 67108864 : 33554432;
        }
        if ((1879048192 & i3) == 0) {
            i2 |= startRestartGroup.changed(j2) ? 536870912 : 268435456;
        } else {
            long j4 = j2;
        }
        if ((i2 & 1533916891) != 306783378 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1120561936, i2, -1, "androidx.compose.material3.BottomSheetScaffoldLayout (BottomSheetScaffold.kt:316)");
            }
            int i4 = i2;
            Object[] objArr = {function32, function0, function2, modifier, Color.m2811boximpl(j), Color.m2811boximpl(j2), function3, Dp.m5624boximpl(f), function22, sheetState};
            startRestartGroup.startReplaceableGroup(-568225417);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean z = false;
            for (int i5 = 0; i5 < 10; i5++) {
                z |= startRestartGroup.changed(objArr[i5]);
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1(function0, function2, function22, sheetState, function32, i4, modifier, j, j2, function3, f);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout((Modifier) null, (Function2) rememberedValue, startRestartGroup, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2(modifier, function2, function3, function32, function22, f, function0, sheetState, j, j2, i));
        }
    }

    /* access modifiers changed from: private */
    public static final AnchorChangeHandler<SheetValue> BottomSheetScaffoldAnchorChangeHandler(SheetState sheetState, Function2<? super SheetValue, ? super Float, Unit> function2, Function1<? super SheetValue, Unit> function1) {
        return new BottomSheetScaffoldKt$BottomSheetScaffoldAnchorChangeHandler$1(sheetState, function2, function1);
    }
}
