package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a{\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001ae\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00142\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001ao\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00142\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u001c\u001a\u001e\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f0\u001e2\b\u0010 \u001a\u0004\u0018\u00010!H\u0002\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\""}, d2 = {"BasicText", "", "text", "Landroidx/compose/ui/text/AnnotatedString;", "modifier", "Landroidx/compose/ui/Modifier;", "style", "Landroidx/compose/ui/text/TextStyle;", "onTextLayout", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "", "minLines", "inlineContent", "", "", "Landroidx/compose/foundation/text/InlineTextContent;", "BasicText-VhcvRP8", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Landroidx/compose/runtime/Composer;II)V", "BasicText-4YKlhWE", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZILjava/util/Map;Landroidx/compose/runtime/Composer;II)V", "BasicText-BpD7jsM", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZILandroidx/compose/runtime/Composer;II)V", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/runtime/Composer;II)V", "selectionIdSaver", "Landroidx/compose/runtime/saveable/Saver;", "", "selectionRegistrar", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: BasicText.kt */
public final class BasicTextKt {
    /* JADX WARNING: Removed duplicated region for block: B:142:0x039a  */
    /* JADX WARNING: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0122  */
    /* renamed from: BasicText-4YKlhWE  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m856BasicText4YKlhWE(java.lang.String r31, androidx.compose.ui.Modifier r32, androidx.compose.ui.text.TextStyle r33, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> r34, int r35, boolean r36, int r37, int r38, androidx.compose.runtime.Composer r39, int r40, int r41) {
        /*
            r9 = r31
            r10 = r40
            r11 = r41
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 1542716361(0x5bf3fbc9, float:1.3735052E17)
            r1 = r39
            androidx.compose.runtime.Composer r12 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(BasicText)P(7,2,6,3,4:c#ui.text.style.TextOverflow,5)80@4041L7,81@4080L7,82@4141L7,102@5126L514,141@6375L96:BasicText.kt#423gt5"
            androidx.compose.runtime.ComposerKt.sourceInformation(r12, r1)
            r1 = r11 & 1
            if (r1 == 0) goto L_0x0021
            r1 = r10 | 6
            goto L_0x0031
        L_0x0021:
            r1 = r10 & 14
            if (r1 != 0) goto L_0x0030
            boolean r1 = r12.changed((java.lang.Object) r9)
            if (r1 == 0) goto L_0x002d
            r1 = 4
            goto L_0x002e
        L_0x002d:
            r1 = 2
        L_0x002e:
            r1 = r1 | r10
            goto L_0x0031
        L_0x0030:
            r1 = r10
        L_0x0031:
            r2 = r11 & 2
            if (r2 == 0) goto L_0x0038
            r1 = r1 | 48
            goto L_0x004b
        L_0x0038:
            r3 = r10 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x004b
            r3 = r32
            boolean r4 = r12.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x0047
            r4 = 32
            goto L_0x0049
        L_0x0047:
            r4 = 16
        L_0x0049:
            r1 = r1 | r4
            goto L_0x004d
        L_0x004b:
            r3 = r32
        L_0x004d:
            r4 = r11 & 4
            if (r4 == 0) goto L_0x0054
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0067
        L_0x0054:
            r5 = r10 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0067
            r5 = r33
            boolean r6 = r12.changed((java.lang.Object) r5)
            if (r6 == 0) goto L_0x0063
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r1 = r1 | r6
            goto L_0x0069
        L_0x0067:
            r5 = r33
        L_0x0069:
            r6 = r11 & 8
            if (r6 == 0) goto L_0x0070
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0083
        L_0x0070:
            r7 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0083
            r7 = r34
            boolean r8 = r12.changedInstance(r7)
            if (r8 == 0) goto L_0x007f
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007f:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r1 = r1 | r8
            goto L_0x0085
        L_0x0083:
            r7 = r34
        L_0x0085:
            r8 = r11 & 16
            if (r8 == 0) goto L_0x008c
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a1
        L_0x008c:
            r13 = 57344(0xe000, float:8.0356E-41)
            r13 = r13 & r10
            if (r13 != 0) goto L_0x00a1
            r13 = r35
            boolean r14 = r12.changed((int) r13)
            if (r14 == 0) goto L_0x009d
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009f
        L_0x009d:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x009f:
            r1 = r1 | r14
            goto L_0x00a3
        L_0x00a1:
            r13 = r35
        L_0x00a3:
            r14 = r11 & 32
            if (r14 == 0) goto L_0x00ab
            r15 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r15
            goto L_0x00c0
        L_0x00ab:
            r15 = 458752(0x70000, float:6.42848E-40)
            r15 = r15 & r10
            if (r15 != 0) goto L_0x00c0
            r15 = r36
            boolean r16 = r12.changed((boolean) r15)
            if (r16 == 0) goto L_0x00bb
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bd
        L_0x00bb:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00bd:
            r1 = r1 | r16
            goto L_0x00c2
        L_0x00c0:
            r15 = r36
        L_0x00c2:
            r16 = r11 & 64
            if (r16 == 0) goto L_0x00cd
            r17 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r17
            r0 = r37
            goto L_0x00e2
        L_0x00cd:
            r17 = 3670016(0x380000, float:5.142788E-39)
            r17 = r10 & r17
            r0 = r37
            if (r17 != 0) goto L_0x00e2
            boolean r18 = r12.changed((int) r0)
            if (r18 == 0) goto L_0x00de
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e0
        L_0x00de:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x00e0:
            r1 = r1 | r18
        L_0x00e2:
            r0 = r11 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00ed
            r18 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r18
            r3 = r38
            goto L_0x0102
        L_0x00ed:
            r18 = 29360128(0x1c00000, float:7.052966E-38)
            r18 = r10 & r18
            r3 = r38
            if (r18 != 0) goto L_0x0102
            boolean r18 = r12.changed((int) r3)
            if (r18 == 0) goto L_0x00fe
            r18 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0100
        L_0x00fe:
            r18 = 4194304(0x400000, float:5.877472E-39)
        L_0x0100:
            r1 = r1 | r18
        L_0x0102:
            r18 = 23967451(0x16db6db, float:4.3661218E-38)
            r1 = r1 & r18
            r3 = 4793490(0x492492, float:6.71711E-39)
            if (r1 != r3) goto L_0x0122
            boolean r1 = r12.getSkipping()
            if (r1 != 0) goto L_0x0113
            goto L_0x0122
        L_0x0113:
            r12.skipToGroupEnd()
            r2 = r32
            r8 = r38
            r3 = r5
            r4 = r7
            r5 = r13
            r6 = r15
            r7 = r37
            goto L_0x0393
        L_0x0122:
            if (r2 == 0) goto L_0x012a
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
            r3 = r1
            goto L_0x012c
        L_0x012a:
            r3 = r32
        L_0x012c:
            if (r4 == 0) goto L_0x0137
            androidx.compose.ui.text.TextStyle$Companion r1 = androidx.compose.ui.text.TextStyle.Companion
            androidx.compose.ui.text.TextStyle r1 = r1.getDefault()
            r30 = r1
            goto L_0x0139
        L_0x0137:
            r30 = r5
        L_0x0139:
            if (r6 == 0) goto L_0x0140
            androidx.compose.foundation.text.BasicTextKt$BasicText$1 r1 = androidx.compose.foundation.text.BasicTextKt$BasicText$1.INSTANCE
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            r7 = r1
        L_0x0140:
            if (r8 == 0) goto L_0x0149
            androidx.compose.ui.text.style.TextOverflow$Companion r1 = androidx.compose.ui.text.style.TextOverflow.Companion
            int r1 = r1.m5555getClipgIe3tQ8()
            r13 = r1
        L_0x0149:
            r1 = 1
            if (r14 == 0) goto L_0x014d
            r15 = r1
        L_0x014d:
            if (r16 == 0) goto L_0x0154
            r2 = 2147483647(0x7fffffff, float:NaN)
            r14 = r2
            goto L_0x0156
        L_0x0154:
            r14 = r37
        L_0x0156:
            if (r0 == 0) goto L_0x015a
            r8 = r1
            goto L_0x015c
        L_0x015a:
            r8 = r38
        L_0x015c:
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x016c
            r0 = -1
            java.lang.String r1 = "androidx.compose.foundation.text.BasicText (BasicText.kt:60)"
            r2 = 1542716361(0x5bf3fbc9, float:1.3735052E17)
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r10, r0, r1)
        L_0x016c:
            androidx.compose.foundation.text.HeightInLinesModifierKt.validateMinMaxLines(r8, r14)
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.foundation.text.selection.SelectionRegistrarKt.getLocalSelectionRegistrar()
            androidx.compose.runtime.CompositionLocal r0 = (androidx.compose.runtime.CompositionLocal) r0
            r6 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r5 = "CC:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r12, r6, r5)
            java.lang.Object r0 = r12.consume(r0)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r12)
            r4 = r0
            androidx.compose.foundation.text.selection.SelectionRegistrar r4 = (androidx.compose.foundation.text.selection.SelectionRegistrar) r4
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r0 = (androidx.compose.runtime.CompositionLocal) r0
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r12, r6, r5)
            java.lang.Object r0 = r12.consume(r0)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r12)
            r16 = r0
            androidx.compose.ui.unit.Density r16 = (androidx.compose.ui.unit.Density) r16
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalFontFamilyResolver()
            androidx.compose.runtime.CompositionLocal r0 = (androidx.compose.runtime.CompositionLocal) r0
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r12, r6, r5)
            java.lang.Object r0 = r12.consume(r0)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r12)
            r17 = r0
            androidx.compose.ui.text.font.FontFamily$Resolver r17 = (androidx.compose.ui.text.font.FontFamily.Resolver) r17
            r0 = 959238681(0x392cd219, float:1.6481466E-4)
            r12.startReplaceableGroup(r0)
            java.lang.String r0 = "97@4947L150"
            androidx.compose.runtime.ComposerKt.sourceInformation(r12, r0)
            if (r4 != 0) goto L_0x01bf
            r0 = 0
            goto L_0x01eb
        L_0x01bf:
            java.lang.Object[] r0 = new java.lang.Object[]{r9, r4}
            androidx.compose.runtime.saveable.Saver r1 = selectionIdSaver(r4)
            r2 = 0
            androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1 r6 = new androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
            r6.<init>(r4)
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r18 = 72
            r19 = 4
            r32 = r0
            r33 = r1
            r34 = r2
            r35 = r6
            r36 = r12
            r37 = r18
            r38 = r19
            java.lang.Object r0 = androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable((java.lang.Object[]) r32, r33, (java.lang.String) r34, r35, (androidx.compose.runtime.Composer) r36, (int) r37, (int) r38)
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
        L_0x01eb:
            r12.endReplaceableGroup()
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r12.startReplaceableGroup(r2)
            java.lang.String r2 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r12, r2)
            java.lang.Object r2 = r12.rememberedValue()
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r6 = r6.getEmpty()
            if (r2 != r6) goto L_0x0249
            androidx.compose.foundation.text.TextController r2 = new androidx.compose.foundation.text.TextController
            androidx.compose.foundation.text.TextState r6 = new androidx.compose.foundation.text.TextState
            androidx.compose.ui.text.AnnotatedString r19 = new androidx.compose.ui.text.AnnotatedString
            r18 = 0
            r20 = 0
            r21 = 6
            r22 = 0
            r32 = r19
            r33 = r31
            r34 = r18
            r35 = r20
            r36 = r21
            r37 = r22
            r32.<init>(r33, r34, r35, r36, r37)
            r32 = r3
            androidx.compose.foundation.text.TextDelegate r3 = new androidx.compose.foundation.text.TextDelegate
            r27 = 0
            r28 = 256(0x100, float:3.59E-43)
            r29 = 0
            r18 = r3
            r20 = r30
            r21 = r14
            r22 = r8
            r23 = r15
            r24 = r13
            r25 = r16
            r26 = r17
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r6.<init>(r3, r0)
            r2.<init>(r6)
            r12.updateRememberedValue(r2)
            goto L_0x024b
        L_0x0249:
            r32 = r3
        L_0x024b:
            r12.endReplaceableGroup()
            r6 = r2
            androidx.compose.foundation.text.TextController r6 = (androidx.compose.foundation.text.TextController) r6
            androidx.compose.foundation.text.TextState r3 = r6.getState()
            boolean r0 = r12.getInserting()
            if (r0 != 0) goto L_0x027f
            androidx.compose.foundation.text.TextDelegate r0 = r3.getTextDelegate()
            r1 = r31
            r2 = r30
            r10 = r32
            r9 = r3
            r3 = r16
            r11 = r4
            r4 = r17
            r10 = r5
            r5 = r15
            r33 = r15
            r15 = r6
            r6 = r13
            r34 = r13
            r13 = r7
            r7 = r14
            r16 = r8
            androidx.compose.foundation.text.TextDelegate r0 = androidx.compose.foundation.text.CoreTextKt.m876updateTextDelegatex_uQXYA(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r15.setTextDelegate(r0)
            goto L_0x028a
        L_0x027f:
            r9 = r3
            r11 = r4
            r10 = r5
            r16 = r8
            r34 = r13
            r33 = r15
            r15 = r6
            r13 = r7
        L_0x028a:
            r9.setOnTextLayout(r13)
            r15.update(r11)
            r0 = 959240076(0x392cd78c, float:1.6483496E-4)
            r12.startReplaceableGroup(r0)
            java.lang.String r0 = "138@6340L7"
            androidx.compose.runtime.ComposerKt.sourceInformation(r12, r0)
            if (r11 == 0) goto L_0x02ba
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.foundation.text.selection.TextSelectionColorsKt.getLocalTextSelectionColors()
            androidx.compose.runtime.CompositionLocal r0 = (androidx.compose.runtime.CompositionLocal) r0
            r1 = 2023513938(0x789c5f52, float:2.5372864E34)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r12, r1, r10)
            java.lang.Object r0 = r12.consume(r0)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r12)
            androidx.compose.foundation.text.selection.TextSelectionColors r0 = (androidx.compose.foundation.text.selection.TextSelectionColors) r0
            long r2 = r0.m1090getBackgroundColor0d7_KjU()
            r9.m972setSelectionBackgroundColor8_81llA(r2)
            goto L_0x02bd
        L_0x02ba:
            r1 = 2023513938(0x789c5f52, float:2.5372864E34)
        L_0x02bd:
            r12.endReplaceableGroup()
            androidx.compose.ui.Modifier r0 = r15.getModifiers()
            r2 = r32
            androidx.compose.ui.Modifier r0 = r2.then(r0)
            androidx.compose.ui.layout.MeasurePolicy r3 = r15.getMeasurePolicy()
            r4 = 544976794(0x207baf9a, float:2.1318629E-19)
            r12.startReplaceableGroup(r4)
            java.lang.String r4 = "CC(Layout)P(1)119@4537L7,120@4592L7,121@4651L7,123@4724L439:Layout.kt#80mrfh"
            androidx.compose.runtime.ComposerKt.sourceInformation(r12, r4)
            androidx.compose.runtime.ProvidableCompositionLocal r4 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r4 = (androidx.compose.runtime.CompositionLocal) r4
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r12, r1, r10)
            java.lang.Object r4 = r12.consume(r4)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r12)
            androidx.compose.ui.unit.Density r4 = (androidx.compose.ui.unit.Density) r4
            androidx.compose.runtime.ProvidableCompositionLocal r5 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            androidx.compose.runtime.CompositionLocal r5 = (androidx.compose.runtime.CompositionLocal) r5
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r12, r1, r10)
            java.lang.Object r5 = r12.consume(r5)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r12)
            androidx.compose.ui.unit.LayoutDirection r5 = (androidx.compose.ui.unit.LayoutDirection) r5
            androidx.compose.runtime.ProvidableCompositionLocal r6 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            androidx.compose.runtime.CompositionLocal r6 = (androidx.compose.runtime.CompositionLocal) r6
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r12, r1, r10)
            java.lang.Object r1 = r12.consume(r6)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r12)
            androidx.compose.ui.platform.ViewConfiguration r1 = (androidx.compose.ui.platform.ViewConfiguration) r1
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.ComposedModifierKt.materialize(r12, r0)
            androidx.compose.ui.node.ComposeUiNode$Companion r6 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function0 r6 = r6.getConstructor()
            r7 = 1405779621(0x53ca7ea5, float:1.73941627E12)
            r12.startReplaceableGroup(r7)
            java.lang.String r7 = "CC(ReusableComposeNode):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r12, r7)
            androidx.compose.runtime.Applier r7 = r12.getApplier()
            boolean r7 = r7 instanceof androidx.compose.runtime.Applier
            if (r7 != 0) goto L_0x032f
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x032f:
            r12.startReusableNode()
            boolean r7 = r12.getInserting()
            if (r7 == 0) goto L_0x0343
            androidx.compose.foundation.text.BasicTextKt$BasicText-4YKlhWE$$inlined$Layout$1 r7 = new androidx.compose.foundation.text.BasicTextKt$BasicText-4YKlhWE$$inlined$Layout$1
            r7.<init>(r6)
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            r12.createNode(r7)
            goto L_0x0346
        L_0x0343:
            r12.useNode()
        L_0x0346:
            androidx.compose.runtime.Composer r6 = androidx.compose.runtime.Updater.m2444constructorimpl(r12)
            androidx.compose.ui.node.ComposeUiNode$Companion r7 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r7 = r7.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r6, r3, r7)
            androidx.compose.ui.node.ComposeUiNode$Companion r3 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r3 = r3.getSetDensity()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r6, r4, r3)
            androidx.compose.ui.node.ComposeUiNode$Companion r3 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r3 = r3.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r6, r5, r3)
            androidx.compose.ui.node.ComposeUiNode$Companion r3 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r3 = r3.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r6, r1, r3)
            androidx.compose.ui.node.ComposeUiNode$Companion r1 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r1 = r1.getSetModifier()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r6, r0, r1)
            r12.endNode()
            r12.endReplaceableGroup()
            r12.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0389
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0389:
            r6 = r33
            r5 = r34
            r4 = r13
            r7 = r14
            r8 = r16
            r3 = r30
        L_0x0393:
            androidx.compose.runtime.ScopeUpdateScope r11 = r12.endRestartGroup()
            if (r11 != 0) goto L_0x039a
            goto L_0x03ab
        L_0x039a:
            androidx.compose.foundation.text.BasicTextKt$BasicText$2 r12 = new androidx.compose.foundation.text.BasicTextKt$BasicText$2
            r0 = r12
            r1 = r31
            r9 = r40
            r10 = r41
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            kotlin.jvm.functions.Function2 r12 = (kotlin.jvm.functions.Function2) r12
            r11.updateScope(r12)
        L_0x03ab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.m856BasicText4YKlhWE(java.lang.String, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function1, int, boolean, int, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:149:0x03ee  */
    /* JADX WARNING: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0133  */
    /* renamed from: BasicText-VhcvRP8  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m858BasicTextVhcvRP8(androidx.compose.ui.text.AnnotatedString r33, androidx.compose.ui.Modifier r34, androidx.compose.ui.text.TextStyle r35, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> r36, int r37, boolean r38, int r39, int r40, java.util.Map<java.lang.String, androidx.compose.foundation.text.InlineTextContent> r41, androidx.compose.runtime.Composer r42, int r43, int r44) {
        /*
            r11 = r33
            r12 = r43
            r13 = r44
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = 851408699(0x32bf773b, float:2.2289546E-8)
            r1 = r42
            androidx.compose.runtime.Composer r14 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(BasicText)P(8,3,7,4,5:c#ui.text.style.TextOverflow,6,1,2)187@9049L7,188@9088L7,189@9149L7,190@9217L7,212@10305L545,252@11559L270:BasicText.kt#423gt5"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r1)
            r1 = r13 & 1
            if (r1 == 0) goto L_0x0021
            r1 = r12 | 6
            goto L_0x0031
        L_0x0021:
            r1 = r12 & 14
            if (r1 != 0) goto L_0x0030
            boolean r1 = r14.changed((java.lang.Object) r11)
            if (r1 == 0) goto L_0x002d
            r1 = 4
            goto L_0x002e
        L_0x002d:
            r1 = 2
        L_0x002e:
            r1 = r1 | r12
            goto L_0x0031
        L_0x0030:
            r1 = r12
        L_0x0031:
            r2 = r13 & 2
            if (r2 == 0) goto L_0x0038
            r1 = r1 | 48
            goto L_0x004b
        L_0x0038:
            r3 = r12 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x004b
            r3 = r34
            boolean r4 = r14.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x0047
            r4 = 32
            goto L_0x0049
        L_0x0047:
            r4 = 16
        L_0x0049:
            r1 = r1 | r4
            goto L_0x004d
        L_0x004b:
            r3 = r34
        L_0x004d:
            r4 = r13 & 4
            if (r4 == 0) goto L_0x0054
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0067
        L_0x0054:
            r6 = r12 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0067
            r6 = r35
            boolean r7 = r14.changed((java.lang.Object) r6)
            if (r7 == 0) goto L_0x0063
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r1 = r1 | r7
            goto L_0x0069
        L_0x0067:
            r6 = r35
        L_0x0069:
            r7 = r13 & 8
            if (r7 == 0) goto L_0x0070
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0083
        L_0x0070:
            r8 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0083
            r8 = r36
            boolean r9 = r14.changedInstance(r8)
            if (r9 == 0) goto L_0x007f
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007f:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r1 = r1 | r9
            goto L_0x0085
        L_0x0083:
            r8 = r36
        L_0x0085:
            r9 = r13 & 16
            if (r9 == 0) goto L_0x008c
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a1
        L_0x008c:
            r10 = 57344(0xe000, float:8.0356E-41)
            r10 = r10 & r12
            if (r10 != 0) goto L_0x00a1
            r10 = r37
            boolean r15 = r14.changed((int) r10)
            if (r15 == 0) goto L_0x009d
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009f
        L_0x009d:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x009f:
            r1 = r1 | r15
            goto L_0x00a3
        L_0x00a1:
            r10 = r37
        L_0x00a3:
            r15 = r13 & 32
            if (r15 == 0) goto L_0x00ae
            r16 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r16
            r0 = r38
            goto L_0x00c3
        L_0x00ae:
            r16 = 458752(0x70000, float:6.42848E-40)
            r16 = r12 & r16
            r0 = r38
            if (r16 != 0) goto L_0x00c3
            boolean r17 = r14.changed((boolean) r0)
            if (r17 == 0) goto L_0x00bf
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c1
        L_0x00bf:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x00c1:
            r1 = r1 | r17
        L_0x00c3:
            r17 = r13 & 64
            if (r17 == 0) goto L_0x00ce
            r18 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r18
            r5 = r39
            goto L_0x00e3
        L_0x00ce:
            r18 = 3670016(0x380000, float:5.142788E-39)
            r18 = r12 & r18
            r5 = r39
            if (r18 != 0) goto L_0x00e3
            boolean r18 = r14.changed((int) r5)
            if (r18 == 0) goto L_0x00df
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e1
        L_0x00df:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x00e1:
            r1 = r1 | r18
        L_0x00e3:
            r0 = r13 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00ee
            r18 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r18
            r3 = r40
            goto L_0x0103
        L_0x00ee:
            r18 = 29360128(0x1c00000, float:7.052966E-38)
            r18 = r12 & r18
            r3 = r40
            if (r18 != 0) goto L_0x0103
            boolean r18 = r14.changed((int) r3)
            if (r18 == 0) goto L_0x00ff
            r18 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0101
        L_0x00ff:
            r18 = 4194304(0x400000, float:5.877472E-39)
        L_0x0101:
            r1 = r1 | r18
        L_0x0103:
            r3 = r13 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x010b
            r18 = 33554432(0x2000000, float:9.403955E-38)
            r1 = r1 | r18
        L_0x010b:
            r5 = 256(0x100, float:3.59E-43)
            if (r3 != r5) goto L_0x0133
            r5 = 191739611(0xb6db6db, float:4.5782105E-32)
            r5 = r5 & r1
            r6 = 38347922(0x2492492, float:1.4777643E-37)
            if (r5 != r6) goto L_0x0133
            boolean r5 = r14.getSkipping()
            if (r5 != 0) goto L_0x011f
            goto L_0x0133
        L_0x011f:
            r14.skipToGroupEnd()
            r2 = r34
            r3 = r35
            r6 = r38
            r7 = r39
            r9 = r41
            r4 = r8
            r5 = r10
            r1 = r11
            r8 = r40
            goto L_0x03e7
        L_0x0133:
            if (r2 == 0) goto L_0x013b
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r2 = (androidx.compose.ui.Modifier) r2
            r6 = r2
            goto L_0x013d
        L_0x013b:
            r6 = r34
        L_0x013d:
            if (r4 == 0) goto L_0x0148
            androidx.compose.ui.text.TextStyle$Companion r2 = androidx.compose.ui.text.TextStyle.Companion
            androidx.compose.ui.text.TextStyle r2 = r2.getDefault()
            r18 = r2
            goto L_0x014a
        L_0x0148:
            r18 = r35
        L_0x014a:
            if (r7 == 0) goto L_0x0151
            androidx.compose.foundation.text.BasicTextKt$BasicText$3 r2 = androidx.compose.foundation.text.BasicTextKt$BasicText$3.INSTANCE
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r8 = r2
        L_0x0151:
            if (r9 == 0) goto L_0x015c
            androidx.compose.ui.text.style.TextOverflow$Companion r2 = androidx.compose.ui.text.style.TextOverflow.Companion
            int r2 = r2.m5555getClipgIe3tQ8()
            r19 = r2
            goto L_0x015e
        L_0x015c:
            r19 = r10
        L_0x015e:
            if (r15 == 0) goto L_0x0162
            r15 = 1
            goto L_0x0164
        L_0x0162:
            r15 = r38
        L_0x0164:
            if (r17 == 0) goto L_0x016b
            r2 = 2147483647(0x7fffffff, float:NaN)
            r9 = r2
            goto L_0x016d
        L_0x016b:
            r9 = r39
        L_0x016d:
            if (r0 == 0) goto L_0x0171
            r7 = 1
            goto L_0x0173
        L_0x0171:
            r7 = r40
        L_0x0173:
            if (r3 == 0) goto L_0x017b
            java.util.Map r0 = kotlin.collections.MapsKt.emptyMap()
            r5 = r0
            goto L_0x017d
        L_0x017b:
            r5 = r41
        L_0x017d:
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x018d
            r0 = -1
            java.lang.String r2 = "androidx.compose.foundation.text.BasicText (BasicText.kt:170)"
            r3 = 851408699(0x32bf773b, float:2.2289546E-8)
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r1, r0, r2)
        L_0x018d:
            androidx.compose.foundation.text.HeightInLinesModifierKt.validateMinMaxLines(r7, r9)
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.foundation.text.selection.SelectionRegistrarKt.getLocalSelectionRegistrar()
            androidx.compose.runtime.CompositionLocal r0 = (androidx.compose.runtime.CompositionLocal) r0
            r4 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r3 = "CC:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r14, r4, r3)
            java.lang.Object r0 = r14.consume(r0)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r14)
            r2 = r0
            androidx.compose.foundation.text.selection.SelectionRegistrar r2 = (androidx.compose.foundation.text.selection.SelectionRegistrar) r2
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r0 = (androidx.compose.runtime.CompositionLocal) r0
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r14, r4, r3)
            java.lang.Object r0 = r14.consume(r0)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r14)
            r16 = r0
            androidx.compose.ui.unit.Density r16 = (androidx.compose.ui.unit.Density) r16
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalFontFamilyResolver()
            androidx.compose.runtime.CompositionLocal r0 = (androidx.compose.runtime.CompositionLocal) r0
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r14, r4, r3)
            java.lang.Object r0 = r14.consume(r0)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r14)
            r17 = r0
            androidx.compose.ui.text.font.FontFamily$Resolver r17 = (androidx.compose.ui.text.font.FontFamily.Resolver) r17
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.foundation.text.selection.TextSelectionColorsKt.getLocalTextSelectionColors()
            androidx.compose.runtime.CompositionLocal r0 = (androidx.compose.runtime.CompositionLocal) r0
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r14, r4, r3)
            java.lang.Object r0 = r14.consume(r0)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r14)
            androidx.compose.foundation.text.selection.TextSelectionColors r0 = (androidx.compose.foundation.text.selection.TextSelectionColors) r0
            long r12 = r0.m1090getBackgroundColor0d7_KjU()
            kotlin.Pair r0 = androidx.compose.foundation.text.CoreTextKt.resolveInlineContent(r11, r5)
            java.lang.Object r20 = r0.component1()
            java.util.List r20 = (java.util.List) r20
            java.lang.Object r0 = r0.component2()
            java.util.List r0 = (java.util.List) r0
            r4 = 959243860(0x392ce654, float:1.6489002E-4)
            r14.startReplaceableGroup(r4)
            java.lang.String r4 = "207@10126L150"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r4)
            if (r2 != 0) goto L_0x0206
            r21 = 0
            goto L_0x0233
        L_0x0206:
            java.lang.Object[] r4 = new java.lang.Object[]{r11, r2}
            androidx.compose.runtime.saveable.Saver r21 = selectionIdSaver(r2)
            r22 = 0
            androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$2 r10 = new androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$2
            r10.<init>(r2)
            kotlin.jvm.functions.Function0 r10 = (kotlin.jvm.functions.Function0) r10
            r23 = 72
            r24 = 4
            r34 = r4
            r35 = r21
            r36 = r22
            r37 = r10
            r38 = r14
            r39 = r23
            r40 = r24
            java.lang.Object r4 = androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable((java.lang.Object[]) r34, r35, (java.lang.String) r36, r37, (androidx.compose.runtime.Composer) r38, (int) r39, (int) r40)
            java.lang.Number r4 = (java.lang.Number) r4
            long r21 = r4.longValue()
        L_0x0233:
            r25 = r21
            r14.endReplaceableGroup()
            r4 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r14.startReplaceableGroup(r4)
            java.lang.String r4 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r4)
            java.lang.Object r4 = r14.rememberedValue()
            androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r10 = r10.getEmpty()
            if (r4 != r10) goto L_0x0297
            androidx.compose.foundation.text.TextController r10 = new androidx.compose.foundation.text.TextController
            androidx.compose.foundation.text.TextState r4 = new androidx.compose.foundation.text.TextState
            r34 = r10
            androidx.compose.foundation.text.TextDelegate r10 = new androidx.compose.foundation.text.TextDelegate
            r21 = 0
            r35 = r0
            r0 = r10
            r27 = r1
            r1 = r33
            r28 = r2
            r2 = r18
            r29 = r3
            r3 = r9
            r30 = r4
            r4 = r7
            r22 = r5
            r5 = r15
            r31 = r6
            r6 = r19
            r23 = r7
            r7 = r16
            r32 = r8
            r8 = r17
            r24 = r9
            r9 = r20
            r11 = r34
            r36 = r12
            r13 = 1
            r12 = r10
            r10 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = r25
            r2 = r30
            r2.<init>(r12, r0)
            r11.<init>(r2)
            r14.updateRememberedValue(r11)
            r4 = r11
            goto L_0x02ac
        L_0x0297:
            r35 = r0
            r27 = r1
            r28 = r2
            r29 = r3
            r22 = r5
            r31 = r6
            r23 = r7
            r32 = r8
            r24 = r9
            r36 = r12
            r13 = 1
        L_0x02ac:
            r14.endReplaceableGroup()
            r10 = r4
            androidx.compose.foundation.text.TextController r10 = (androidx.compose.foundation.text.TextController) r10
            androidx.compose.foundation.text.TextState r11 = r10.getState()
            boolean r0 = r14.getInserting()
            if (r0 != 0) goto L_0x02d8
            androidx.compose.foundation.text.TextDelegate r0 = r11.getTextDelegate()
            r1 = r33
            r2 = r18
            r3 = r16
            r4 = r17
            r5 = r15
            r6 = r19
            r7 = r24
            r8 = r23
            r9 = r20
            androidx.compose.foundation.text.TextDelegate r0 = androidx.compose.foundation.text.CoreTextKt.m874updateTextDelegaterm0N8CA(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.setTextDelegate(r0)
        L_0x02d8:
            r8 = r32
            r11.setOnTextLayout(r8)
            r0 = r36
            r11.m972setSelectionBackgroundColor8_81llA(r0)
            r0 = r28
            r10.update(r0)
            boolean r0 = r35.isEmpty()
            if (r0 == 0) goto L_0x02f6
            androidx.compose.foundation.text.ComposableSingletons$BasicTextKt r0 = androidx.compose.foundation.text.ComposableSingletons$BasicTextKt.INSTANCE
            kotlin.jvm.functions.Function2 r0 = r0.m869getLambda1$foundation_release()
            r1 = r33
            goto L_0x030a
        L_0x02f6:
            androidx.compose.foundation.text.BasicTextKt$BasicText$4 r0 = new androidx.compose.foundation.text.BasicTextKt$BasicText$4
            r1 = r33
            r3 = r35
            r2 = r27
            r0.<init>(r1, r3, r2)
            r2 = 1749415830(0x6845f796, float:3.7394934E24)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r14, r2, r13, r0)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
        L_0x030a:
            androidx.compose.ui.Modifier r2 = r10.getModifiers()
            r3 = r31
            androidx.compose.ui.Modifier r2 = r3.then(r2)
            androidx.compose.ui.layout.MeasurePolicy r4 = r10.getMeasurePolicy()
            r5 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r14.startReplaceableGroup(r5)
            java.lang.String r5 = "CC(Layout)P(!1,2)73@2855L7,74@2910L7,75@2969L7,76@2981L460:Layout.kt#80mrfh"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r5)
            androidx.compose.runtime.ProvidableCompositionLocal r5 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r5 = (androidx.compose.runtime.CompositionLocal) r5
            r6 = r29
            r7 = 2023513938(0x789c5f52, float:2.5372864E34)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r14, r7, r6)
            java.lang.Object r5 = r14.consume(r5)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r14)
            androidx.compose.ui.unit.Density r5 = (androidx.compose.ui.unit.Density) r5
            androidx.compose.runtime.ProvidableCompositionLocal r9 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            androidx.compose.runtime.CompositionLocal r9 = (androidx.compose.runtime.CompositionLocal) r9
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r14, r7, r6)
            java.lang.Object r9 = r14.consume(r9)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r14)
            androidx.compose.ui.unit.LayoutDirection r9 = (androidx.compose.ui.unit.LayoutDirection) r9
            androidx.compose.runtime.ProvidableCompositionLocal r10 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            androidx.compose.runtime.CompositionLocal r10 = (androidx.compose.runtime.CompositionLocal) r10
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r14, r7, r6)
            java.lang.Object r6 = r14.consume(r10)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r14)
            androidx.compose.ui.platform.ViewConfiguration r6 = (androidx.compose.ui.platform.ViewConfiguration) r6
            androidx.compose.ui.node.ComposeUiNode$Companion r7 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function0 r7 = r7.getConstructor()
            kotlin.jvm.functions.Function3 r2 = androidx.compose.ui.layout.LayoutKt.materializerOf(r2)
            androidx.compose.runtime.Applier r10 = r14.getApplier()
            boolean r10 = r10 instanceof androidx.compose.runtime.Applier
            if (r10 != 0) goto L_0x0373
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x0373:
            r14.startReusableNode()
            boolean r10 = r14.getInserting()
            if (r10 == 0) goto L_0x0380
            r14.createNode(r7)
            goto L_0x0383
        L_0x0380:
            r14.useNode()
        L_0x0383:
            androidx.compose.runtime.Composer r7 = androidx.compose.runtime.Updater.m2444constructorimpl(r14)
            androidx.compose.ui.node.ComposeUiNode$Companion r10 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r10 = r10.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r7, r4, r10)
            androidx.compose.ui.node.ComposeUiNode$Companion r4 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r4 = r4.getSetDensity()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r7, r5, r4)
            androidx.compose.ui.node.ComposeUiNode$Companion r4 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r4 = r4.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r7, r9, r4)
            androidx.compose.ui.node.ComposeUiNode$Companion r4 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r4 = r4.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r7, r6, r4)
            androidx.compose.runtime.Composer r4 = androidx.compose.runtime.SkippableUpdater.m2436constructorimpl(r14)
            androidx.compose.runtime.SkippableUpdater r4 = androidx.compose.runtime.SkippableUpdater.m2435boximpl(r4)
            r5 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r2.invoke(r4, r14, r6)
            r2 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r14.startReplaceableGroup(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r0.invoke(r14, r2)
            r14.endReplaceableGroup()
            r14.endNode()
            r14.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x03da
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x03da:
            r2 = r3
            r4 = r8
            r6 = r15
            r3 = r18
            r5 = r19
            r9 = r22
            r8 = r23
            r7 = r24
        L_0x03e7:
            androidx.compose.runtime.ScopeUpdateScope r12 = r14.endRestartGroup()
            if (r12 != 0) goto L_0x03ee
            goto L_0x03ff
        L_0x03ee:
            androidx.compose.foundation.text.BasicTextKt$BasicText$5 r13 = new androidx.compose.foundation.text.BasicTextKt$BasicText$5
            r0 = r13
            r1 = r33
            r10 = r43
            r11 = r44
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            kotlin.jvm.functions.Function2 r13 = (kotlin.jvm.functions.Function2) r13
            r12.updateScope(r13)
        L_0x03ff:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.m858BasicTextVhcvRP8(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function1, int, boolean, int, int, java.util.Map, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00ff  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: BasicText-BpD7jsM  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void m857BasicTextBpD7jsM(java.lang.String r23, androidx.compose.ui.Modifier r24, androidx.compose.ui.text.TextStyle r25, kotlin.jvm.functions.Function1 r26, int r27, boolean r28, int r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            r11 = r23
            r12 = r31
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = 1022429478(0x3cf10926, float:0.029423308)
            r1 = r30
            androidx.compose.runtime.Composer r13 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(BasicText)P(6,1,5,2,3:c#ui.text.style.TextOverflow,4)274@12210L234:BasicText.kt#423gt5"
            androidx.compose.runtime.ComposerKt.sourceInformation(r13, r1)
            r1 = r32 & 1
            if (r1 == 0) goto L_0x001f
            r1 = r12 | 6
            goto L_0x002f
        L_0x001f:
            r1 = r12 & 14
            if (r1 != 0) goto L_0x002e
            boolean r1 = r13.changed((java.lang.Object) r11)
            if (r1 == 0) goto L_0x002b
            r1 = 4
            goto L_0x002c
        L_0x002b:
            r1 = 2
        L_0x002c:
            r1 = r1 | r12
            goto L_0x002f
        L_0x002e:
            r1 = r12
        L_0x002f:
            r2 = r32 & 2
            if (r2 == 0) goto L_0x0036
            r1 = r1 | 48
            goto L_0x0049
        L_0x0036:
            r3 = r12 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0049
            r3 = r24
            boolean r4 = r13.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x0045
            r4 = 32
            goto L_0x0047
        L_0x0045:
            r4 = 16
        L_0x0047:
            r1 = r1 | r4
            goto L_0x004b
        L_0x0049:
            r3 = r24
        L_0x004b:
            r4 = r32 & 4
            if (r4 == 0) goto L_0x0052
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0065
        L_0x0052:
            r5 = r12 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0065
            r5 = r25
            boolean r6 = r13.changed((java.lang.Object) r5)
            if (r6 == 0) goto L_0x0061
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r1 = r1 | r6
            goto L_0x0067
        L_0x0065:
            r5 = r25
        L_0x0067:
            r6 = r32 & 8
            if (r6 == 0) goto L_0x006e
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0081
        L_0x006e:
            r7 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0081
            r7 = r26
            boolean r8 = r13.changedInstance(r7)
            if (r8 == 0) goto L_0x007d
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x007f
        L_0x007d:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x007f:
            r1 = r1 | r8
            goto L_0x0083
        L_0x0081:
            r7 = r26
        L_0x0083:
            r8 = r32 & 16
            r9 = 57344(0xe000, float:8.0356E-41)
            if (r8 == 0) goto L_0x008d
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a0
        L_0x008d:
            r10 = r12 & r9
            if (r10 != 0) goto L_0x00a0
            r10 = r27
            boolean r14 = r13.changed((int) r10)
            if (r14 == 0) goto L_0x009c
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009c:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r1 = r1 | r14
            goto L_0x00a2
        L_0x00a0:
            r10 = r27
        L_0x00a2:
            r14 = r32 & 32
            r15 = 458752(0x70000, float:6.42848E-40)
            if (r14 == 0) goto L_0x00af
            r16 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r16
            r15 = r28
            goto L_0x00c2
        L_0x00af:
            r16 = r12 & r15
            r15 = r28
            if (r16 != 0) goto L_0x00c2
            boolean r16 = r13.changed((boolean) r15)
            if (r16 == 0) goto L_0x00be
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c0
        L_0x00be:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00c0:
            r1 = r1 | r16
        L_0x00c2:
            r16 = r32 & 64
            r17 = 3670016(0x380000, float:5.142788E-39)
            if (r16 == 0) goto L_0x00cf
            r18 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r18
            r9 = r29
            goto L_0x00e2
        L_0x00cf:
            r18 = r12 & r17
            r9 = r29
            if (r18 != 0) goto L_0x00e2
            boolean r19 = r13.changed((int) r9)
            if (r19 == 0) goto L_0x00de
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e0
        L_0x00de:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x00e0:
            r1 = r1 | r19
        L_0x00e2:
            r19 = 2995931(0x2db6db, float:4.198194E-39)
            r0 = r1 & r19
            r3 = 599186(0x92492, float:8.39638E-40)
            if (r0 != r3) goto L_0x00ff
            boolean r0 = r13.getSkipping()
            if (r0 != 0) goto L_0x00f3
            goto L_0x00ff
        L_0x00f3:
            r13.skipToGroupEnd()
            r2 = r24
            r3 = r5
            r4 = r7
            r7 = r9
            r5 = r10
            r6 = r15
            goto L_0x018b
        L_0x00ff:
            if (r2 == 0) goto L_0x0108
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            r19 = r0
            goto L_0x010a
        L_0x0108:
            r19 = r24
        L_0x010a:
            if (r4 == 0) goto L_0x0115
            androidx.compose.ui.text.TextStyle$Companion r0 = androidx.compose.ui.text.TextStyle.Companion
            androidx.compose.ui.text.TextStyle r0 = r0.getDefault()
            r20 = r0
            goto L_0x0117
        L_0x0115:
            r20 = r5
        L_0x0117:
            if (r6 == 0) goto L_0x0120
            androidx.compose.foundation.text.BasicTextKt$BasicText$6 r0 = androidx.compose.foundation.text.BasicTextKt$BasicText$6.INSTANCE
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r21 = r0
            goto L_0x0122
        L_0x0120:
            r21 = r7
        L_0x0122:
            if (r8 == 0) goto L_0x012d
            androidx.compose.ui.text.style.TextOverflow$Companion r0 = androidx.compose.ui.text.style.TextOverflow.Companion
            int r0 = r0.m5555getClipgIe3tQ8()
            r22 = r0
            goto L_0x012f
        L_0x012d:
            r22 = r10
        L_0x012f:
            if (r14 == 0) goto L_0x0133
            r0 = 1
            r15 = r0
        L_0x0133:
            if (r16 == 0) goto L_0x013a
            r0 = 2147483647(0x7fffffff, float:NaN)
            r14 = r0
            goto L_0x013b
        L_0x013a:
            r14 = r9
        L_0x013b:
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x014b
            r0 = -1
            java.lang.String r2 = "androidx.compose.foundation.text.BasicText (BasicText.kt:265)"
            r3 = 1022429478(0x3cf10926, float:0.029423308)
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r1, r0, r2)
        L_0x014b:
            r7 = 1
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            r2 = r1 & 14
            r0 = r0 | r2
            r2 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r1
            r0 = r0 | r2
            r2 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r1
            r0 = r0 | r2
            r1 = r1 & r17
            r9 = r0 | r1
            r10 = 0
            r0 = r23
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r15
            r6 = r14
            r8 = r13
            m856BasicText4YKlhWE((java.lang.String) r0, (androidx.compose.ui.Modifier) r1, (androidx.compose.ui.text.TextStyle) r2, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) r3, (int) r4, (boolean) r5, (int) r6, (int) r7, (androidx.compose.runtime.Composer) r8, (int) r9, (int) r10)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0181
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0181:
            r7 = r14
            r6 = r15
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
        L_0x018b:
            androidx.compose.runtime.ScopeUpdateScope r10 = r13.endRestartGroup()
            if (r10 != 0) goto L_0x0192
            goto L_0x01a3
        L_0x0192:
            androidx.compose.foundation.text.BasicTextKt$BasicText$7 r13 = new androidx.compose.foundation.text.BasicTextKt$BasicText$7
            r0 = r13
            r1 = r23
            r8 = r31
            r9 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            kotlin.jvm.functions.Function2 r13 = (kotlin.jvm.functions.Function2) r13
            r10.updateScope(r13)
        L_0x01a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.m857BasicTextBpD7jsM(java.lang.String, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function1, int, boolean, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:115:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0110  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: BasicText-4YKlhWE  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void m855BasicText4YKlhWE(androidx.compose.ui.text.AnnotatedString r26, androidx.compose.ui.Modifier r27, androidx.compose.ui.text.TextStyle r28, kotlin.jvm.functions.Function1 r29, int r30, boolean r31, int r32, java.util.Map r33, androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            r12 = r26
            r13 = r35
            r14 = r36
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = -648605928(0xffffffffd9570f18, float:-3.78335723E15)
            r1 = r34
            androidx.compose.runtime.Composer r15 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(BasicText)P(7,2,6,3,4:c#ui.text.style.TextOverflow,5,1)298@12896L273:BasicText.kt#423gt5"
            androidx.compose.runtime.ComposerKt.sourceInformation(r15, r1)
            r1 = r14 & 1
            if (r1 == 0) goto L_0x0021
            r1 = r13 | 6
            goto L_0x0031
        L_0x0021:
            r1 = r13 & 14
            if (r1 != 0) goto L_0x0030
            boolean r1 = r15.changed((java.lang.Object) r12)
            if (r1 == 0) goto L_0x002d
            r1 = 4
            goto L_0x002e
        L_0x002d:
            r1 = 2
        L_0x002e:
            r1 = r1 | r13
            goto L_0x0031
        L_0x0030:
            r1 = r13
        L_0x0031:
            r2 = r14 & 2
            if (r2 == 0) goto L_0x0038
            r1 = r1 | 48
            goto L_0x004b
        L_0x0038:
            r3 = r13 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x004b
            r3 = r27
            boolean r4 = r15.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x0047
            r4 = 32
            goto L_0x0049
        L_0x0047:
            r4 = 16
        L_0x0049:
            r1 = r1 | r4
            goto L_0x004d
        L_0x004b:
            r3 = r27
        L_0x004d:
            r4 = r14 & 4
            if (r4 == 0) goto L_0x0054
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0067
        L_0x0054:
            r6 = r13 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0067
            r6 = r28
            boolean r7 = r15.changed((java.lang.Object) r6)
            if (r7 == 0) goto L_0x0063
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r1 = r1 | r7
            goto L_0x0069
        L_0x0067:
            r6 = r28
        L_0x0069:
            r7 = r14 & 8
            if (r7 == 0) goto L_0x0070
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0083
        L_0x0070:
            r8 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0083
            r8 = r29
            boolean r9 = r15.changedInstance(r8)
            if (r9 == 0) goto L_0x007f
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007f:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r1 = r1 | r9
            goto L_0x0085
        L_0x0083:
            r8 = r29
        L_0x0085:
            r9 = r14 & 16
            r10 = 57344(0xe000, float:8.0356E-41)
            if (r9 == 0) goto L_0x008f
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a3
        L_0x008f:
            r11 = r13 & r10
            if (r11 != 0) goto L_0x00a3
            r11 = r30
            boolean r16 = r15.changed((int) r11)
            if (r16 == 0) goto L_0x009e
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a0
        L_0x009e:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x00a0:
            r1 = r1 | r16
            goto L_0x00a5
        L_0x00a3:
            r11 = r30
        L_0x00a5:
            r16 = r14 & 32
            r17 = 458752(0x70000, float:6.42848E-40)
            if (r16 == 0) goto L_0x00b2
            r18 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r18
            r10 = r31
            goto L_0x00c5
        L_0x00b2:
            r18 = r13 & r17
            r10 = r31
            if (r18 != 0) goto L_0x00c5
            boolean r18 = r15.changed((boolean) r10)
            if (r18 == 0) goto L_0x00c1
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c3
        L_0x00c1:
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x00c3:
            r1 = r1 | r18
        L_0x00c5:
            r18 = r14 & 64
            r19 = 3670016(0x380000, float:5.142788E-39)
            if (r18 == 0) goto L_0x00d2
            r20 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r20
            r0 = r32
            goto L_0x00e5
        L_0x00d2:
            r20 = r13 & r19
            r0 = r32
            if (r20 != 0) goto L_0x00e5
            boolean r21 = r15.changed((int) r0)
            if (r21 == 0) goto L_0x00e1
            r21 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e3
        L_0x00e1:
            r21 = 524288(0x80000, float:7.34684E-40)
        L_0x00e3:
            r1 = r1 | r21
        L_0x00e5:
            r5 = r14 & 128(0x80, float:1.794E-43)
            if (r5 == 0) goto L_0x00ed
            r22 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 | r22
        L_0x00ed:
            r0 = 128(0x80, float:1.794E-43)
            if (r5 != r0) goto L_0x0110
            r0 = 23967451(0x16db6db, float:4.3661218E-38)
            r0 = r0 & r1
            r3 = 4793490(0x492492, float:6.71711E-39)
            if (r0 != r3) goto L_0x0110
            boolean r0 = r15.getSkipping()
            if (r0 != 0) goto L_0x0101
            goto L_0x0110
        L_0x0101:
            r15.skipToGroupEnd()
            r2 = r27
            r7 = r32
            r3 = r6
            r4 = r8
            r6 = r10
            r5 = r11
            r8 = r33
            goto L_0x01b4
        L_0x0110:
            if (r2 == 0) goto L_0x0119
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            r21 = r0
            goto L_0x011b
        L_0x0119:
            r21 = r27
        L_0x011b:
            if (r4 == 0) goto L_0x0126
            androidx.compose.ui.text.TextStyle$Companion r0 = androidx.compose.ui.text.TextStyle.Companion
            androidx.compose.ui.text.TextStyle r0 = r0.getDefault()
            r22 = r0
            goto L_0x0128
        L_0x0126:
            r22 = r6
        L_0x0128:
            if (r7 == 0) goto L_0x0131
            androidx.compose.foundation.text.BasicTextKt$BasicText$8 r0 = androidx.compose.foundation.text.BasicTextKt$BasicText$8.INSTANCE
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r23 = r0
            goto L_0x0133
        L_0x0131:
            r23 = r8
        L_0x0133:
            if (r9 == 0) goto L_0x013e
            androidx.compose.ui.text.style.TextOverflow$Companion r0 = androidx.compose.ui.text.style.TextOverflow.Companion
            int r0 = r0.m5555getClipgIe3tQ8()
            r24 = r0
            goto L_0x0140
        L_0x013e:
            r24 = r11
        L_0x0140:
            if (r16 == 0) goto L_0x0146
            r0 = 1
            r16 = r0
            goto L_0x0148
        L_0x0146:
            r16 = r10
        L_0x0148:
            if (r18 == 0) goto L_0x0150
            r0 = 2147483647(0x7fffffff, float:NaN)
            r18 = r0
            goto L_0x0152
        L_0x0150:
            r18 = r32
        L_0x0152:
            if (r5 == 0) goto L_0x015b
            java.util.Map r0 = kotlin.collections.MapsKt.emptyMap()
            r25 = r0
            goto L_0x015d
        L_0x015b:
            r25 = r33
        L_0x015d:
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x016d
            r0 = -1
            java.lang.String r2 = "androidx.compose.foundation.text.BasicText (BasicText.kt:288)"
            r3 = -648605928(0xffffffffd9570f18, float:-3.78335723E15)
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r1, r0, r2)
        L_0x016d:
            r7 = 1
            r0 = 146800640(0x8c00000, float:1.155558E-33)
            r2 = r1 & 14
            r0 = r0 | r2
            r2 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r1
            r0 = r0 | r2
            r2 = r1 & r17
            r0 = r0 | r2
            r1 = r1 & r19
            r10 = r0 | r1
            r11 = 0
            r0 = r26
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r16
            r6 = r18
            r8 = r25
            r9 = r15
            m858BasicTextVhcvRP8(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01a6
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x01a6:
            r6 = r16
            r7 = r18
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r8 = r25
        L_0x01b4:
            androidx.compose.runtime.ScopeUpdateScope r11 = r15.endRestartGroup()
            if (r11 != 0) goto L_0x01bb
            goto L_0x01cc
        L_0x01bb:
            androidx.compose.foundation.text.BasicTextKt$BasicText$9 r15 = new androidx.compose.foundation.text.BasicTextKt$BasicText$9
            r0 = r15
            r1 = r26
            r9 = r35
            r10 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            kotlin.jvm.functions.Function2 r15 = (kotlin.jvm.functions.Function2) r15
            r11.updateScope(r15)
        L_0x01cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.m855BasicText4YKlhWE(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function1, int, boolean, int, java.util.Map, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final Saver<Long, Long> selectionIdSaver(SelectionRegistrar selectionRegistrar) {
        return SaverKt.Saver(new BasicTextKt$selectionIdSaver$1(selectionRegistrar), BasicTextKt$selectionIdSaver$2.INSTANCE);
    }
}
