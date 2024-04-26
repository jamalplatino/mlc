package androidx.compose.foundation.text;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00062\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001ay\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00062\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a!\u0010\u0017\u001a\u00020\f*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"ClickableText", "", "text", "Landroidx/compose/ui/text/AnnotatedString;", "onHover", "Lkotlin/Function1;", "", "modifier", "Landroidx/compose/ui/Modifier;", "style", "Landroidx/compose/ui/text/TextStyle;", "softWrap", "", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "maxLines", "onTextLayout", "Landroidx/compose/ui/text/TextLayoutResult;", "onClick", "ClickableText-03UYbkw", "(Landroidx/compose/ui/text/AnnotatedString;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "ClickableText-4YKlhWE", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "containsWithinBounds", "Landroidx/compose/ui/text/MultiParagraph;", "positionOffset", "Landroidx/compose/ui/geometry/Offset;", "containsWithinBounds-Uv8p0NA", "(Landroidx/compose/ui/text/MultiParagraph;J)Z", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: ClickableText.kt */
public final class ClickableTextKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0124  */
    /* renamed from: ClickableText-4YKlhWE  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m860ClickableText4YKlhWE(androidx.compose.ui.text.AnnotatedString r25, androidx.compose.ui.Modifier r26, androidx.compose.ui.text.TextStyle r27, boolean r28, int r29, int r30, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> r31, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r32, androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            r12 = r25
            r13 = r32
            r14 = r34
            r15 = r35
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r0 = -246609449(0xfffffffff14d09d7, float:-1.0153012E30)
            r1 = r33
            androidx.compose.runtime.Composer r11 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(ClickableText)P(7,1,6,5,4:c#ui.text.style.TextOverflow!1,3)79@3637L52,80@3746L184,95@4151L76,88@3936L297:ClickableText.kt#423gt5"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r1)
            r1 = r15 & 1
            if (r1 == 0) goto L_0x0029
            r1 = r14 | 6
            goto L_0x0039
        L_0x0029:
            r1 = r14 & 14
            if (r1 != 0) goto L_0x0038
            boolean r1 = r11.changed((java.lang.Object) r12)
            if (r1 == 0) goto L_0x0035
            r1 = 4
            goto L_0x0036
        L_0x0035:
            r1 = 2
        L_0x0036:
            r1 = r1 | r14
            goto L_0x0039
        L_0x0038:
            r1 = r14
        L_0x0039:
            r3 = r15 & 2
            if (r3 == 0) goto L_0x0040
            r1 = r1 | 48
            goto L_0x0053
        L_0x0040:
            r4 = r14 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0053
            r4 = r26
            boolean r5 = r11.changed((java.lang.Object) r4)
            if (r5 == 0) goto L_0x004f
            r5 = 32
            goto L_0x0051
        L_0x004f:
            r5 = 16
        L_0x0051:
            r1 = r1 | r5
            goto L_0x0055
        L_0x0053:
            r4 = r26
        L_0x0055:
            r5 = r15 & 4
            if (r5 == 0) goto L_0x005c
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x006f
        L_0x005c:
            r6 = r14 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x006f
            r6 = r27
            boolean r7 = r11.changed((java.lang.Object) r6)
            if (r7 == 0) goto L_0x006b
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x006d
        L_0x006b:
            r7 = 128(0x80, float:1.794E-43)
        L_0x006d:
            r1 = r1 | r7
            goto L_0x0071
        L_0x006f:
            r6 = r27
        L_0x0071:
            r7 = r15 & 8
            if (r7 == 0) goto L_0x0078
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x008b
        L_0x0078:
            r8 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x008b
            r8 = r28
            boolean r9 = r11.changed((boolean) r8)
            if (r9 == 0) goto L_0x0087
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0089
        L_0x0087:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0089:
            r1 = r1 | r9
            goto L_0x008d
        L_0x008b:
            r8 = r28
        L_0x008d:
            r9 = r15 & 16
            r10 = 57344(0xe000, float:8.0356E-41)
            if (r9 == 0) goto L_0x0099
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            r10 = r29
            goto L_0x00ac
        L_0x0099:
            r16 = r14 & r10
            r10 = r29
            if (r16 != 0) goto L_0x00ac
            boolean r16 = r11.changed((int) r10)
            if (r16 == 0) goto L_0x00a8
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00aa
        L_0x00a8:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x00aa:
            r1 = r1 | r16
        L_0x00ac:
            r16 = r15 & 32
            r17 = 458752(0x70000, float:6.42848E-40)
            if (r16 == 0) goto L_0x00b9
            r18 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r18
            r2 = r30
            goto L_0x00cc
        L_0x00b9:
            r18 = r14 & r17
            r2 = r30
            if (r18 != 0) goto L_0x00cc
            boolean r19 = r11.changed((int) r2)
            if (r19 == 0) goto L_0x00c8
            r19 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ca
        L_0x00c8:
            r19 = 65536(0x10000, float:9.18355E-41)
        L_0x00ca:
            r1 = r1 | r19
        L_0x00cc:
            r19 = r15 & 64
            r20 = 3670016(0x380000, float:5.142788E-39)
            if (r19 == 0) goto L_0x00d9
            r21 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r21
            r0 = r31
            goto L_0x00ec
        L_0x00d9:
            r21 = r14 & r20
            r0 = r31
            if (r21 != 0) goto L_0x00ec
            boolean r22 = r11.changedInstance(r0)
            if (r22 == 0) goto L_0x00e8
            r22 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ea
        L_0x00e8:
            r22 = 524288(0x80000, float:7.34684E-40)
        L_0x00ea:
            r1 = r1 | r22
        L_0x00ec:
            r0 = r15 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00f4
            r0 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x00f2:
            r1 = r1 | r0
            goto L_0x0105
        L_0x00f4:
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r0 & r14
            if (r0 != 0) goto L_0x0105
            boolean r0 = r11.changedInstance(r13)
            if (r0 == 0) goto L_0x0102
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f2
        L_0x0102:
            r0 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x00f2
        L_0x0105:
            r0 = 23967451(0x16db6db, float:4.3661218E-38)
            r0 = r0 & r1
            r2 = 4793490(0x492492, float:6.71711E-39)
            if (r0 != r2) goto L_0x0124
            boolean r0 = r11.getSkipping()
            if (r0 != 0) goto L_0x0115
            goto L_0x0124
        L_0x0115:
            r11.skipToGroupEnd()
            r7 = r31
            r2 = r4
            r3 = r6
            r4 = r8
            r5 = r10
            r17 = r11
            r6 = r30
            goto L_0x0249
        L_0x0124:
            if (r3 == 0) goto L_0x012b
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            r4 = r0
        L_0x012b:
            if (r5 == 0) goto L_0x0136
            androidx.compose.ui.text.TextStyle$Companion r0 = androidx.compose.ui.text.TextStyle.Companion
            androidx.compose.ui.text.TextStyle r0 = r0.getDefault()
            r22 = r0
            goto L_0x0138
        L_0x0136:
            r22 = r6
        L_0x0138:
            if (r7 == 0) goto L_0x013e
            r0 = 1
            r23 = r0
            goto L_0x0140
        L_0x013e:
            r23 = r8
        L_0x0140:
            if (r9 == 0) goto L_0x014b
            androidx.compose.ui.text.style.TextOverflow$Companion r0 = androidx.compose.ui.text.style.TextOverflow.Companion
            int r0 = r0.m5555getClipgIe3tQ8()
            r24 = r0
            goto L_0x014d
        L_0x014b:
            r24 = r10
        L_0x014d:
            if (r16 == 0) goto L_0x0155
            r0 = 2147483647(0x7fffffff, float:NaN)
            r16 = r0
            goto L_0x0157
        L_0x0155:
            r16 = r30
        L_0x0157:
            if (r19 == 0) goto L_0x015f
            androidx.compose.foundation.text.ClickableTextKt$ClickableText$1 r0 = androidx.compose.foundation.text.ClickableTextKt$ClickableText$1.INSTANCE
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r10 = r0
            goto L_0x0161
        L_0x015f:
            r10 = r31
        L_0x0161:
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0171
            r0 = -1
            java.lang.String r2 = "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)"
            r3 = -246609449(0xfffffffff14d09d7, float:-1.0153012E30)
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r1, r0, r2)
        L_0x0171:
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r11.startReplaceableGroup(r0)
            java.lang.String r0 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r0)
            java.lang.Object r0 = r11.rememberedValue()
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            r3 = 0
            if (r0 != r2) goto L_0x0191
            r2 = 2
            androidx.compose.runtime.MutableState r0 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r3, r3, r2, r3)
            r11.updateRememberedValue(r0)
        L_0x0191:
            r11.endReplaceableGroup()
            androidx.compose.runtime.MutableState r0 = (androidx.compose.runtime.MutableState) r0
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r2 = (androidx.compose.ui.Modifier) r2
            r5 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r11.startReplaceableGroup(r5)
            java.lang.String r6 = "CC(remember)P(1,2):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r6)
            boolean r7 = r11.changed((java.lang.Object) r0)
            boolean r8 = r11.changed((java.lang.Object) r13)
            r7 = r7 | r8
            java.lang.Object r8 = r11.rememberedValue()
            if (r7 != 0) goto L_0x01bc
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r7 = r7.getEmpty()
            if (r8 != r7) goto L_0x01c7
        L_0x01bc:
            androidx.compose.foundation.text.ClickableTextKt$ClickableText$pressIndicator$1$1 r7 = new androidx.compose.foundation.text.ClickableTextKt$ClickableText$pressIndicator$1$1
            r7.<init>(r0, r13, r3)
            r8 = r7
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            r11.updateRememberedValue(r8)
        L_0x01c7:
            r11.endReplaceableGroup()
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput((androidx.compose.ui.Modifier) r2, (java.lang.Object) r13, (kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) r8)
            androidx.compose.ui.Modifier r2 = r4.then(r2)
            r11.startReplaceableGroup(r5)
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r6)
            boolean r3 = r11.changed((java.lang.Object) r0)
            boolean r5 = r11.changed((java.lang.Object) r10)
            r3 = r3 | r5
            java.lang.Object r5 = r11.rememberedValue()
            if (r3 != 0) goto L_0x01f1
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r3 = r3.getEmpty()
            if (r5 != r3) goto L_0x01fc
        L_0x01f1:
            androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1 r3 = new androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
            r3.<init>(r0, r10)
            r5 = r3
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            r11.updateRememberedValue(r5)
        L_0x01fc:
            r11.endReplaceableGroup()
            r3 = r5
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            r7 = 0
            r8 = 0
            r0 = r1 & 14
            r5 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r5
            r5 = 57344(0xe000, float:8.0356E-41)
            r5 = r5 & r1
            r0 = r0 | r5
            int r5 = r1 << 6
            r5 = r5 & r17
            r0 = r0 | r5
            int r1 = r1 << 3
            r1 = r1 & r20
            r17 = r0 | r1
            r18 = 384(0x180, float:5.38E-43)
            r0 = r25
            r1 = r2
            r2 = r22
            r19 = r4
            r4 = r24
            r5 = r23
            r6 = r16
            r9 = r11
            r20 = r10
            r10 = r17
            r17 = r11
            r11 = r18
            androidx.compose.foundation.text.BasicTextKt.m858BasicTextVhcvRP8(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x023d
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x023d:
            r6 = r16
            r2 = r19
            r7 = r20
            r3 = r22
            r4 = r23
            r5 = r24
        L_0x0249:
            androidx.compose.runtime.ScopeUpdateScope r11 = r17.endRestartGroup()
            if (r11 != 0) goto L_0x0250
            goto L_0x0266
        L_0x0250:
            androidx.compose.foundation.text.ClickableTextKt$ClickableText$3 r16 = new androidx.compose.foundation.text.ClickableTextKt$ClickableText$3
            r0 = r16
            r1 = r25
            r8 = r32
            r9 = r34
            r10 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = r16
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r11.updateScope(r0)
        L_0x0266:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.ClickableTextKt.m860ClickableText4YKlhWE(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, boolean, int, int, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0299  */
    /* JADX WARNING: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0149  */
    /* renamed from: ClickableText-03UYbkw  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m859ClickableText03UYbkw(androidx.compose.ui.text.AnnotatedString r25, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r26, androidx.compose.ui.Modifier r27, androidx.compose.ui.text.TextStyle r28, boolean r29, int r30, int r31, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> r32, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r33, androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            r12 = r25
            r13 = r26
            r14 = r33
            r15 = r35
            r11 = r36
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "onHover"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            r0 = 1020774372(0x3cd7c7e4, float:0.026340432)
            r1 = r34
            androidx.compose.runtime.Composer r10 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(ClickableText)P(8,3,1,7,6,5:c#ui.text.style.TextOverflow!1,4)153@6860L52,154@6938L24,183@7878L76,176@7657L303:ClickableText.kt#423gt5"
            androidx.compose.runtime.ComposerKt.sourceInformation(r10, r1)
            r1 = r11 & 1
            if (r1 == 0) goto L_0x0031
            r1 = r15 | 6
            goto L_0x0041
        L_0x0031:
            r1 = r15 & 14
            if (r1 != 0) goto L_0x0040
            boolean r1 = r10.changed((java.lang.Object) r12)
            if (r1 == 0) goto L_0x003d
            r1 = 4
            goto L_0x003e
        L_0x003d:
            r1 = 2
        L_0x003e:
            r1 = r1 | r15
            goto L_0x0041
        L_0x0040:
            r1 = r15
        L_0x0041:
            r3 = r11 & 2
            if (r3 == 0) goto L_0x0048
            r1 = r1 | 48
            goto L_0x0058
        L_0x0048:
            r3 = r15 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0058
            boolean r3 = r10.changedInstance(r13)
            if (r3 == 0) goto L_0x0055
            r3 = 32
            goto L_0x0057
        L_0x0055:
            r3 = 16
        L_0x0057:
            r1 = r1 | r3
        L_0x0058:
            r3 = r11 & 4
            if (r3 == 0) goto L_0x005f
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0072
        L_0x005f:
            r4 = r15 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0072
            r4 = r27
            boolean r5 = r10.changed((java.lang.Object) r4)
            if (r5 == 0) goto L_0x006e
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0070
        L_0x006e:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0070:
            r1 = r1 | r5
            goto L_0x0074
        L_0x0072:
            r4 = r27
        L_0x0074:
            r5 = r11 & 8
            if (r5 == 0) goto L_0x007b
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x008e
        L_0x007b:
            r6 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r6 != 0) goto L_0x008e
            r6 = r28
            boolean r7 = r10.changed((java.lang.Object) r6)
            if (r7 == 0) goto L_0x008a
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x008c
        L_0x008a:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x008c:
            r1 = r1 | r7
            goto L_0x0090
        L_0x008e:
            r6 = r28
        L_0x0090:
            r7 = r11 & 16
            r8 = 57344(0xe000, float:8.0356E-41)
            if (r7 == 0) goto L_0x009a
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00ae
        L_0x009a:
            r9 = r15 & r8
            if (r9 != 0) goto L_0x00ae
            r9 = r29
            boolean r16 = r10.changed((boolean) r9)
            if (r16 == 0) goto L_0x00a9
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00ab
        L_0x00a9:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x00ab:
            r1 = r1 | r16
            goto L_0x00b0
        L_0x00ae:
            r9 = r29
        L_0x00b0:
            r16 = r11 & 32
            r17 = 458752(0x70000, float:6.42848E-40)
            if (r16 == 0) goto L_0x00bd
            r18 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r18
            r8 = r30
            goto L_0x00d0
        L_0x00bd:
            r18 = r15 & r17
            r8 = r30
            if (r18 != 0) goto L_0x00d0
            boolean r18 = r10.changed((int) r8)
            if (r18 == 0) goto L_0x00cc
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ce
        L_0x00cc:
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x00ce:
            r1 = r1 | r18
        L_0x00d0:
            r18 = r11 & 64
            r19 = 3670016(0x380000, float:5.142788E-39)
            if (r18 == 0) goto L_0x00dd
            r20 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r20
            r2 = r31
            goto L_0x00f0
        L_0x00dd:
            r20 = r15 & r19
            r2 = r31
            if (r20 != 0) goto L_0x00f0
            boolean r21 = r10.changed((int) r2)
            if (r21 == 0) goto L_0x00ec
            r21 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ee
        L_0x00ec:
            r21 = 524288(0x80000, float:7.34684E-40)
        L_0x00ee:
            r1 = r1 | r21
        L_0x00f0:
            r0 = r11 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00fb
            r22 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r22
            r2 = r32
            goto L_0x0110
        L_0x00fb:
            r22 = 29360128(0x1c00000, float:7.052966E-38)
            r22 = r15 & r22
            r2 = r32
            if (r22 != 0) goto L_0x0110
            boolean r22 = r10.changedInstance(r2)
            if (r22 == 0) goto L_0x010c
            r22 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x010e
        L_0x010c:
            r22 = 4194304(0x400000, float:5.877472E-39)
        L_0x010e:
            r1 = r1 | r22
        L_0x0110:
            r2 = r11 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x0118
            r2 = 100663296(0x6000000, float:2.4074124E-35)
        L_0x0116:
            r1 = r1 | r2
            goto L_0x0129
        L_0x0118:
            r2 = 234881024(0xe000000, float:1.5777218E-30)
            r2 = r2 & r15
            if (r2 != 0) goto L_0x0129
            boolean r2 = r10.changedInstance(r14)
            if (r2 == 0) goto L_0x0126
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0116
        L_0x0126:
            r2 = 33554432(0x2000000, float:9.403955E-38)
            goto L_0x0116
        L_0x0129:
            r2 = 191739611(0xb6db6db, float:4.5782105E-32)
            r2 = r2 & r1
            r4 = 38347922(0x2492492, float:1.4777643E-37)
            if (r2 != r4) goto L_0x0149
            boolean r2 = r10.getSkipping()
            if (r2 != 0) goto L_0x0139
            goto L_0x0149
        L_0x0139:
            r10.skipToGroupEnd()
            r3 = r27
            r7 = r31
            r4 = r6
            r6 = r8
            r5 = r9
            r24 = r10
            r8 = r32
            goto L_0x0292
        L_0x0149:
            if (r3 == 0) goto L_0x0151
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r2 = (androidx.compose.ui.Modifier) r2
            r4 = r2
            goto L_0x0153
        L_0x0151:
            r4 = r27
        L_0x0153:
            if (r5 == 0) goto L_0x015e
            androidx.compose.ui.text.TextStyle$Companion r2 = androidx.compose.ui.text.TextStyle.Companion
            androidx.compose.ui.text.TextStyle r2 = r2.getDefault()
            r22 = r2
            goto L_0x0160
        L_0x015e:
            r22 = r6
        L_0x0160:
            if (r7 == 0) goto L_0x0166
            r2 = 1
            r23 = r2
            goto L_0x0168
        L_0x0166:
            r23 = r9
        L_0x0168:
            if (r16 == 0) goto L_0x0173
            androidx.compose.ui.text.style.TextOverflow$Companion r2 = androidx.compose.ui.text.style.TextOverflow.Companion
            int r2 = r2.m5555getClipgIe3tQ8()
            r16 = r2
            goto L_0x0175
        L_0x0173:
            r16 = r8
        L_0x0175:
            if (r18 == 0) goto L_0x017d
            r2 = 2147483647(0x7fffffff, float:NaN)
            r18 = r2
            goto L_0x017f
        L_0x017d:
            r18 = r31
        L_0x017f:
            if (r0 == 0) goto L_0x0187
            androidx.compose.foundation.text.ClickableTextKt$ClickableText$4 r0 = androidx.compose.foundation.text.ClickableTextKt$ClickableText$4.INSTANCE
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r9 = r0
            goto L_0x0189
        L_0x0187:
            r9 = r32
        L_0x0189:
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0199
            r0 = -1
            java.lang.String r2 = "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)"
            r3 = 1020774372(0x3cd7c7e4, float:0.026340432)
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r1, r0, r2)
        L_0x0199:
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r10.startReplaceableGroup(r0)
            java.lang.String r2 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r10, r2)
            java.lang.Object r3 = r10.rememberedValue()
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r5 = r5.getEmpty()
            if (r3 != r5) goto L_0x01b9
            r3 = 0
            r5 = 2
            androidx.compose.runtime.MutableState r3 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r3, r3, r5, r3)
            r10.updateRememberedValue(r3)
        L_0x01b9:
            r10.endReplaceableGroup()
            androidx.compose.runtime.MutableState r3 = (androidx.compose.runtime.MutableState) r3
            r5 = 773894976(0x2e20b340, float:3.6538994E-11)
            r10.startReplaceableGroup(r5)
            java.lang.String r5 = "CC(rememberCoroutineScope)476@19869L144:Effects.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r10, r5)
            r10.startReplaceableGroup(r0)
            androidx.compose.runtime.ComposerKt.sourceInformation(r10, r2)
            java.lang.Object r0 = r10.rememberedValue()
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r0 != r2) goto L_0x01ec
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlin.coroutines.CoroutineContext r0 = (kotlin.coroutines.CoroutineContext) r0
            kotlinx.coroutines.CoroutineScope r0 = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(r0, r10)
            androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller r2 = new androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller
            r2.<init>(r0)
            r10.updateRememberedValue(r2)
            r0 = r2
        L_0x01ec:
            r10.endReplaceableGroup()
            androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller r0 = (androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) r0
            kotlinx.coroutines.CoroutineScope r0 = r0.getCoroutineScope()
            r10.endReplaceableGroup()
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r2 = (androidx.compose.ui.Modifier) r2
            androidx.compose.foundation.text.ClickableTextKt$ClickableText$pointerInputModifier$1 r5 = new androidx.compose.foundation.text.ClickableTextKt$ClickableText$pointerInputModifier$1
            r6 = 0
            r27 = r5
            r28 = r0
            r29 = r26
            r30 = r3
            r31 = r33
            r32 = r6
            r27.<init>(r28, r29, r30, r31, r32)
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(r2, r14, r13, r5)
            androidx.compose.ui.Modifier r2 = r4.then(r0)
            r0 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r10.startReplaceableGroup(r0)
            java.lang.String r0 = "CC(remember)P(1,2):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r10, r0)
            boolean r0 = r10.changed((java.lang.Object) r3)
            boolean r5 = r10.changed((java.lang.Object) r9)
            r0 = r0 | r5
            java.lang.Object r5 = r10.rememberedValue()
            if (r0 != 0) goto L_0x023a
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r0 = r0.getEmpty()
            if (r5 != r0) goto L_0x0245
        L_0x023a:
            androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1 r0 = new androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
            r0.<init>(r3, r9)
            r5 = r0
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            r10.updateRememberedValue(r5)
        L_0x0245:
            r10.endReplaceableGroup()
            r3 = r5
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            r7 = 0
            r8 = 0
            r0 = r1 & 14
            int r5 = r1 >> 3
            r6 = r5 & 896(0x380, float:1.256E-42)
            r0 = r0 | r6
            r6 = 57344(0xe000, float:8.0356E-41)
            r5 = r5 & r6
            r0 = r0 | r5
            int r5 = r1 << 3
            r5 = r5 & r17
            r0 = r0 | r5
            r1 = r1 & r19
            r17 = r0 | r1
            r19 = 384(0x180, float:5.38E-43)
            r0 = r25
            r1 = r2
            r2 = r22
            r20 = r4
            r4 = r16
            r5 = r23
            r6 = r18
            r21 = r9
            r9 = r10
            r24 = r10
            r10 = r17
            r11 = r19
            androidx.compose.foundation.text.BasicTextKt.m858BasicTextVhcvRP8(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0286
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0286:
            r6 = r16
            r7 = r18
            r3 = r20
            r8 = r21
            r4 = r22
            r5 = r23
        L_0x0292:
            androidx.compose.runtime.ScopeUpdateScope r11 = r24.endRestartGroup()
            if (r11 != 0) goto L_0x0299
            goto L_0x02b2
        L_0x0299:
            androidx.compose.foundation.text.ClickableTextKt$ClickableText$6 r16 = new androidx.compose.foundation.text.ClickableTextKt$ClickableText$6
            r0 = r16
            r1 = r25
            r2 = r26
            r9 = r33
            r10 = r35
            r12 = r11
            r11 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = r16
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r12.updateScope(r0)
        L_0x02b2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.ClickableTextKt.m859ClickableText03UYbkw(androidx.compose.ui.text.AnnotatedString, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, boolean, int, int, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final Integer ClickableText_03UYbkw$getOffset(MutableState<TextLayoutResult> mutableState, long j) {
        MultiParagraph multiParagraph;
        TextLayoutResult value = mutableState.getValue();
        if (value == null || (multiParagraph = value.getMultiParagraph()) == null) {
            return null;
        }
        if (!m861containsWithinBoundsUv8p0NA(multiParagraph, j)) {
            multiParagraph = null;
        }
        if (multiParagraph != null) {
            return Integer.valueOf(multiParagraph.m5016getOffsetForPositionk4lQ0M(j));
        }
        return null;
    }

    /* renamed from: containsWithinBounds-Uv8p0NA  reason: not valid java name */
    private static final boolean m861containsWithinBoundsUv8p0NA(MultiParagraph multiParagraph, long j) {
        float r0 = Offset.m2562component1impl(j);
        float r3 = Offset.m2563component2impl(j);
        return r0 > 0.0f && r3 >= 0.0f && r0 <= multiParagraph.getWidth() && r3 <= multiParagraph.getHeight();
    }
}
