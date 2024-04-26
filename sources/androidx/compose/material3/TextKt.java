package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u000b\u001aé\u0001\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020&2\u0014\b\u0002\u0010(\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)2\u0014\b\u0002\u0010,\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00060-2\b\b\u0002\u0010/\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101\u001aß\u0001\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\u0014\b\u0002\u0010(\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)2\u0014\b\u0002\u0010,\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00060-2\b\b\u0002\u0010/\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u00103\u001aÉ\u0001\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020*2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\u0014\b\u0002\u0010,\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00060-2\b\b\u0002\u0010/\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u00105\u001aÓ\u0001\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020*2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020&2\u0014\b\u0002\u0010,\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00060-2\b\b\u0002\u0010/\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u00106\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00067"}, d2 = {"LocalTextStyle", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/text/TextStyle;", "getLocalTextStyle", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "ProvideTextStyle", "", "value", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Text", "text", "Landroidx/compose/ui/text/AnnotatedString;", "modifier", "Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", "fontSize", "Landroidx/compose/ui/unit/TextUnit;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "letterSpacing", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", "lineHeight", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "", "minLines", "inlineContent", "", "", "Landroidx/compose/foundation/text/InlineTextContent;", "onTextLayout", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "style", "Text-IbK3jfQ", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "Text--4IGK_g", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZILjava/util/Map;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "Text-fLXpl1I", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Text.kt */
public final class TextKt {
    private static final ProvidableCompositionLocal<TextStyle> LocalTextStyle = CompositionLocalKt.compositionLocalOf(SnapshotStateKt.structuralEqualityPolicy(), TextKt$LocalTextStyle$1.INSTANCE);

    public static final ProvidableCompositionLocal<TextStyle> getLocalTextStyle() {
        return LocalTextStyle;
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0357  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0363  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x037a  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x037f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x0425  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x0448  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:260:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x013a  */
    /* renamed from: Text--4IGK_g  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1727Text4IGK_g(java.lang.String r65, androidx.compose.ui.Modifier r66, long r67, long r69, androidx.compose.ui.text.font.FontStyle r71, androidx.compose.ui.text.font.FontWeight r72, androidx.compose.ui.text.font.FontFamily r73, long r74, androidx.compose.ui.text.style.TextDecoration r76, androidx.compose.ui.text.style.TextAlign r77, long r78, int r80, boolean r81, int r82, int r83, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> r84, androidx.compose.ui.text.TextStyle r85, androidx.compose.runtime.Composer r86, int r87, int r88, int r89) {
        /*
            r1 = r65
            r14 = r87
            r15 = r88
            r13 = r89
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = -2055108902(0xffffffff858186da, float:-1.2180638E-35)
            r2 = r86
            androidx.compose.runtime.Composer r2 = r2.startRestartGroup(r0)
            java.lang.String r3 = "C(Text)P(14,9,0:c#ui.graphics.Color,2:c#ui.unit.TextUnit,3:c#ui.text.font.FontStyle,4!1,5:c#ui.unit.TextUnit,16,15:c#ui.text.style.TextAlign,6:c#ui.unit.TextUnit,11:c#ui.text.style.TextOverflow,12)108@5583L7,131@6301L162:Text.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r3)
            r3 = r13 & 1
            if (r3 == 0) goto L_0x0023
            r3 = r14 | 6
            goto L_0x0033
        L_0x0023:
            r3 = r14 & 14
            if (r3 != 0) goto L_0x0032
            boolean r3 = r2.changed((java.lang.Object) r1)
            if (r3 == 0) goto L_0x002f
            r3 = 4
            goto L_0x0030
        L_0x002f:
            r3 = 2
        L_0x0030:
            r3 = r3 | r14
            goto L_0x0033
        L_0x0032:
            r3 = r14
        L_0x0033:
            r6 = r13 & 2
            if (r6 == 0) goto L_0x003a
            r3 = r3 | 48
            goto L_0x004d
        L_0x003a:
            r9 = r14 & 112(0x70, float:1.57E-43)
            if (r9 != 0) goto L_0x004d
            r9 = r66
            boolean r10 = r2.changed((java.lang.Object) r9)
            if (r10 == 0) goto L_0x0049
            r10 = 32
            goto L_0x004b
        L_0x0049:
            r10 = 16
        L_0x004b:
            r3 = r3 | r10
            goto L_0x004f
        L_0x004d:
            r9 = r66
        L_0x004f:
            r10 = r13 & 4
            if (r10 == 0) goto L_0x0058
            r3 = r3 | 384(0x180, float:5.38E-43)
            r7 = r67
            goto L_0x006b
        L_0x0058:
            r4 = r14 & 896(0x380, float:1.256E-42)
            r7 = r67
            if (r4 != 0) goto L_0x006b
            boolean r17 = r2.changed((long) r7)
            if (r17 == 0) goto L_0x0067
            r17 = 256(0x100, float:3.59E-43)
            goto L_0x0069
        L_0x0067:
            r17 = 128(0x80, float:1.794E-43)
        L_0x0069:
            r3 = r3 | r17
        L_0x006b:
            r17 = r13 & 8
            r18 = 2048(0x800, float:2.87E-42)
            r19 = 1024(0x400, float:1.435E-42)
            if (r17 == 0) goto L_0x0078
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            r11 = r69
            goto L_0x008b
        L_0x0078:
            r4 = r14 & 7168(0x1c00, float:1.0045E-41)
            r11 = r69
            if (r4 != 0) goto L_0x008b
            boolean r22 = r2.changed((long) r11)
            if (r22 == 0) goto L_0x0087
            r22 = r18
            goto L_0x0089
        L_0x0087:
            r22 = r19
        L_0x0089:
            r3 = r3 | r22
        L_0x008b:
            r22 = r13 & 16
            r23 = 16384(0x4000, float:2.2959E-41)
            r24 = 8192(0x2000, float:1.14794E-41)
            r25 = 57344(0xe000, float:8.0356E-41)
            if (r22 == 0) goto L_0x009b
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            r4 = r71
            goto L_0x00ae
        L_0x009b:
            r26 = r14 & r25
            r4 = r71
            if (r26 != 0) goto L_0x00ae
            boolean r27 = r2.changed((java.lang.Object) r4)
            if (r27 == 0) goto L_0x00aa
            r27 = r23
            goto L_0x00ac
        L_0x00aa:
            r27 = r24
        L_0x00ac:
            r3 = r3 | r27
        L_0x00ae:
            r27 = r13 & 32
            r28 = 458752(0x70000, float:6.42848E-40)
            r29 = 65536(0x10000, float:9.18355E-41)
            if (r27 == 0) goto L_0x00bd
            r30 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r30
            r5 = r72
            goto L_0x00d0
        L_0x00bd:
            r30 = r14 & r28
            r5 = r72
            if (r30 != 0) goto L_0x00d0
            boolean r31 = r2.changed((java.lang.Object) r5)
            if (r31 == 0) goto L_0x00cc
            r31 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ce
        L_0x00cc:
            r31 = r29
        L_0x00ce:
            r3 = r3 | r31
        L_0x00d0:
            r31 = r13 & 64
            r32 = 3670016(0x380000, float:5.142788E-39)
            if (r31 == 0) goto L_0x00dd
            r33 = 1572864(0x180000, float:2.204052E-39)
            r3 = r3 | r33
            r0 = r73
            goto L_0x00f0
        L_0x00dd:
            r33 = r14 & r32
            r0 = r73
            if (r33 != 0) goto L_0x00f0
            boolean r34 = r2.changed((java.lang.Object) r0)
            if (r34 == 0) goto L_0x00ec
            r34 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ee
        L_0x00ec:
            r34 = 524288(0x80000, float:7.34684E-40)
        L_0x00ee:
            r3 = r3 | r34
        L_0x00f0:
            r0 = r13 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00fb
            r34 = 12582912(0xc00000, float:1.7632415E-38)
            r3 = r3 | r34
            r4 = r74
            goto L_0x0110
        L_0x00fb:
            r34 = 29360128(0x1c00000, float:7.052966E-38)
            r34 = r14 & r34
            r4 = r74
            if (r34 != 0) goto L_0x0110
            boolean r34 = r2.changed((long) r4)
            if (r34 == 0) goto L_0x010c
            r34 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x010e
        L_0x010c:
            r34 = 4194304(0x400000, float:5.877472E-39)
        L_0x010e:
            r3 = r3 | r34
        L_0x0110:
            r1 = r13 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x011b
            r34 = 100663296(0x6000000, float:2.4074124E-35)
            r3 = r3 | r34
            r4 = r76
            goto L_0x012f
        L_0x011b:
            r34 = 234881024(0xe000000, float:1.5777218E-30)
            r34 = r14 & r34
            r4 = r76
            if (r34 != 0) goto L_0x012f
            boolean r5 = r2.changed((java.lang.Object) r4)
            if (r5 == 0) goto L_0x012c
            r5 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x012e
        L_0x012c:
            r5 = 33554432(0x2000000, float:9.403955E-38)
        L_0x012e:
            r3 = r3 | r5
        L_0x012f:
            r5 = r13 & 512(0x200, float:7.175E-43)
            if (r5 == 0) goto L_0x013a
            r34 = 805306368(0x30000000, float:4.656613E-10)
            r3 = r3 | r34
            r4 = r77
            goto L_0x014f
        L_0x013a:
            r34 = 1879048192(0x70000000, float:1.58456325E29)
            r34 = r14 & r34
            r4 = r77
            if (r34 != 0) goto L_0x014f
            boolean r34 = r2.changed((java.lang.Object) r4)
            if (r34 == 0) goto L_0x014b
            r34 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x014d
        L_0x014b:
            r34 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x014d:
            r3 = r3 | r34
        L_0x014f:
            r4 = r13 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L_0x0158
            r30 = r15 | 6
            r7 = r78
            goto L_0x016e
        L_0x0158:
            r34 = r15 & 14
            r7 = r78
            if (r34 != 0) goto L_0x016c
            boolean r34 = r2.changed((long) r7)
            if (r34 == 0) goto L_0x0167
            r30 = 4
            goto L_0x0169
        L_0x0167:
            r30 = 2
        L_0x0169:
            r30 = r15 | r30
            goto L_0x016e
        L_0x016c:
            r30 = r15
        L_0x016e:
            r7 = r13 & 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto L_0x0175
            r30 = r30 | 48
            goto L_0x018b
        L_0x0175:
            r8 = r15 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x0189
            r8 = r80
            boolean r34 = r2.changed((int) r8)
            if (r34 == 0) goto L_0x0184
            r16 = 32
            goto L_0x0186
        L_0x0184:
            r16 = 16
        L_0x0186:
            r30 = r30 | r16
            goto L_0x018b
        L_0x0189:
            r8 = r80
        L_0x018b:
            r8 = r30
            r9 = r13 & 4096(0x1000, float:5.74E-42)
            if (r9 == 0) goto L_0x0194
            r8 = r8 | 384(0x180, float:5.38E-43)
            goto L_0x01a8
        L_0x0194:
            r11 = r15 & 896(0x380, float:1.256E-42)
            if (r11 != 0) goto L_0x01a8
            r11 = r81
            boolean r12 = r2.changed((boolean) r11)
            if (r12 == 0) goto L_0x01a3
            r26 = 256(0x100, float:3.59E-43)
            goto L_0x01a5
        L_0x01a3:
            r26 = 128(0x80, float:1.794E-43)
        L_0x01a5:
            r8 = r8 | r26
            goto L_0x01aa
        L_0x01a8:
            r11 = r81
        L_0x01aa:
            r12 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r12 == 0) goto L_0x01b1
            r8 = r8 | 3072(0xc00, float:4.305E-42)
            goto L_0x01c3
        L_0x01b1:
            r11 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r11 != 0) goto L_0x01c3
            r11 = r82
            boolean r16 = r2.changed((int) r11)
            if (r16 == 0) goto L_0x01be
            goto L_0x01c0
        L_0x01be:
            r18 = r19
        L_0x01c0:
            r8 = r8 | r18
            goto L_0x01c5
        L_0x01c3:
            r11 = r82
        L_0x01c5:
            r11 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r11 == 0) goto L_0x01cc
            r8 = r8 | 24576(0x6000, float:3.4438E-41)
            goto L_0x01e0
        L_0x01cc:
            r16 = r15 & r25
            if (r16 != 0) goto L_0x01e0
            r16 = r11
            r11 = r83
            boolean r18 = r2.changed((int) r11)
            if (r18 == 0) goto L_0x01db
            goto L_0x01dd
        L_0x01db:
            r23 = r24
        L_0x01dd:
            r8 = r8 | r23
            goto L_0x01e4
        L_0x01e0:
            r16 = r11
            r11 = r83
        L_0x01e4:
            r18 = 32768(0x8000, float:4.5918E-41)
            r18 = r13 & r18
            if (r18 == 0) goto L_0x01f2
            r19 = 196608(0x30000, float:2.75506E-40)
            r8 = r8 | r19
            r11 = r84
            goto L_0x0205
        L_0x01f2:
            r19 = r15 & r28
            r11 = r84
            if (r19 != 0) goto L_0x0205
            boolean r19 = r2.changedInstance(r11)
            if (r19 == 0) goto L_0x0201
            r19 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0203
        L_0x0201:
            r19 = r29
        L_0x0203:
            r8 = r8 | r19
        L_0x0205:
            r19 = r15 & r32
            if (r19 != 0) goto L_0x021d
            r19 = r13 & r29
            r11 = r85
            if (r19 != 0) goto L_0x0218
            boolean r19 = r2.changed((java.lang.Object) r11)
            if (r19 == 0) goto L_0x0218
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x021a
        L_0x0218:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x021a:
            r8 = r8 | r19
            goto L_0x021f
        L_0x021d:
            r11 = r85
        L_0x021f:
            r19 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r11 = r3 & r19
            r15 = 306783378(0x12492492, float:6.3469493E-28)
            if (r11 != r15) goto L_0x025e
            r11 = 2995931(0x2db6db, float:4.198194E-39)
            r11 = r11 & r8
            r15 = 599186(0x92492, float:8.39638E-40)
            if (r11 != r15) goto L_0x025e
            boolean r11 = r2.getSkipping()
            if (r11 != 0) goto L_0x0239
            goto L_0x025e
        L_0x0239:
            r2.skipToGroupEnd()
            r6 = r66
            r3 = r67
            r19 = r69
            r7 = r71
            r8 = r72
            r9 = r73
            r10 = r74
            r12 = r76
            r13 = r77
            r14 = r78
            r16 = r80
            r17 = r81
            r18 = r82
            r21 = r83
            r22 = r84
            r23 = r85
            goto L_0x0441
        L_0x025e:
            r2.startDefaults()
            r11 = r14 & 1
            if (r11 == 0) goto L_0x029a
            boolean r11 = r2.getDefaultsInvalid()
            if (r11 == 0) goto L_0x026c
            goto L_0x029a
        L_0x026c:
            r2.skipToGroupEnd()
            r0 = r13 & r29
            if (r0 == 0) goto L_0x0277
            r0 = -3670017(0xffffffffffc7ffff, float:NaN)
            r8 = r8 & r0
        L_0x0277:
            r6 = r66
            r10 = r67
            r19 = r69
            r17 = r71
            r21 = r72
            r22 = r73
            r23 = r74
            r0 = r76
            r15 = r77
            r4 = r78
            r1 = r80
            r9 = r81
            r12 = r82
            r7 = r83
            r16 = r84
        L_0x0295:
            r13 = r8
            r8 = r85
            goto L_0x034e
        L_0x029a:
            if (r6 == 0) goto L_0x02a1
            androidx.compose.ui.Modifier$Companion r6 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r6 = (androidx.compose.ui.Modifier) r6
            goto L_0x02a3
        L_0x02a1:
            r6 = r66
        L_0x02a3:
            if (r10 == 0) goto L_0x02ac
            androidx.compose.ui.graphics.Color$Companion r10 = androidx.compose.ui.graphics.Color.Companion
            long r10 = r10.m2857getUnspecified0d7_KjU()
            goto L_0x02ae
        L_0x02ac:
            r10 = r67
        L_0x02ae:
            if (r17 == 0) goto L_0x02b7
            androidx.compose.ui.unit.TextUnit$Companion r15 = androidx.compose.ui.unit.TextUnit.Companion
            long r19 = r15.m5818getUnspecifiedXSAIIZE()
            goto L_0x02b9
        L_0x02b7:
            r19 = r69
        L_0x02b9:
            r15 = 0
            if (r22 == 0) goto L_0x02bf
            r17 = r15
            goto L_0x02c1
        L_0x02bf:
            r17 = r71
        L_0x02c1:
            if (r27 == 0) goto L_0x02c6
            r21 = r15
            goto L_0x02c8
        L_0x02c6:
            r21 = r72
        L_0x02c8:
            if (r31 == 0) goto L_0x02cd
            r22 = r15
            goto L_0x02cf
        L_0x02cd:
            r22 = r73
        L_0x02cf:
            if (r0 == 0) goto L_0x02d8
            androidx.compose.ui.unit.TextUnit$Companion r0 = androidx.compose.ui.unit.TextUnit.Companion
            long r23 = r0.m5818getUnspecifiedXSAIIZE()
            goto L_0x02da
        L_0x02d8:
            r23 = r74
        L_0x02da:
            if (r1 == 0) goto L_0x02de
            r0 = r15
            goto L_0x02e0
        L_0x02de:
            r0 = r76
        L_0x02e0:
            if (r5 == 0) goto L_0x02e3
            goto L_0x02e5
        L_0x02e3:
            r15 = r77
        L_0x02e5:
            if (r4 == 0) goto L_0x02ee
            androidx.compose.ui.unit.TextUnit$Companion r1 = androidx.compose.ui.unit.TextUnit.Companion
            long r4 = r1.m5818getUnspecifiedXSAIIZE()
            goto L_0x02f0
        L_0x02ee:
            r4 = r78
        L_0x02f0:
            if (r7 == 0) goto L_0x02f9
            androidx.compose.ui.text.style.TextOverflow$Companion r1 = androidx.compose.ui.text.style.TextOverflow.Companion
            int r1 = r1.m5555getClipgIe3tQ8()
            goto L_0x02fb
        L_0x02f9:
            r1 = r80
        L_0x02fb:
            r7 = 1
            if (r9 == 0) goto L_0x0300
            r9 = r7
            goto L_0x0302
        L_0x0300:
            r9 = r81
        L_0x0302:
            if (r12 == 0) goto L_0x0308
            r12 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x030a
        L_0x0308:
            r12 = r82
        L_0x030a:
            if (r16 == 0) goto L_0x030d
            goto L_0x030f
        L_0x030d:
            r7 = r83
        L_0x030f:
            if (r18 == 0) goto L_0x0316
            androidx.compose.material3.TextKt$Text$1 r16 = androidx.compose.material3.TextKt$Text$1.INSTANCE
            kotlin.jvm.functions.Function1 r16 = (kotlin.jvm.functions.Function1) r16
            goto L_0x0318
        L_0x0316:
            r16 = r84
        L_0x0318:
            r18 = r13 & r29
            if (r18 == 0) goto L_0x0346
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.text.TextStyle> r18 = LocalTextStyle
            r66 = r0
            r0 = r18
            androidx.compose.runtime.CompositionLocal r0 = (androidx.compose.runtime.CompositionLocal) r0
            r67 = r1
            r1 = 2023513938(0x789c5f52, float:2.5372864E34)
            r68 = r4
            java.lang.String r4 = "CC:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r1, r4)
            java.lang.Object r0 = r2.consume(r0)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.ui.text.TextStyle r0 = (androidx.compose.ui.text.TextStyle) r0
            r1 = -3670017(0xffffffffffc7ffff, float:NaN)
            r8 = r8 & r1
            r1 = r67
            r4 = r68
            r13 = r8
            r8 = r0
            r0 = r66
            goto L_0x034e
        L_0x0346:
            r66 = r0
            r67 = r1
            r68 = r4
            goto L_0x0295
        L_0x034e:
            r2.endDefaults()
            boolean r18 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r18 == 0) goto L_0x0363
            java.lang.String r14 = "androidx.compose.material3.Text (Text.kt:91)"
            r77 = r7
            r7 = -2055108902(0xffffffff858186da, float:-1.2180638E-35)
            androidx.compose.runtime.ComposerKt.traceEventStart(r7, r3, r13, r14)
            goto L_0x0365
        L_0x0363:
            r77 = r7
        L_0x0365:
            r7 = 79582822(0x4be5666, float:4.474813E-36)
            r2.startReplaceableGroup(r7)
            java.lang.String r7 = "*113@5698L7"
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r7)
            androidx.compose.ui.graphics.Color$Companion r7 = androidx.compose.ui.graphics.Color.Companion
            long r26 = r7.m2857getUnspecified0d7_KjU()
            int r7 = (r10 > r26 ? 1 : (r10 == r26 ? 0 : -1))
            if (r7 == 0) goto L_0x037f
            r78 = r10
            r35 = r78
            goto L_0x03af
        L_0x037f:
            long r26 = r8.m5151getColor0d7_KjU()
            androidx.compose.ui.graphics.Color$Companion r7 = androidx.compose.ui.graphics.Color.Companion
            long r29 = r7.m2857getUnspecified0d7_KjU()
            int r7 = (r26 > r29 ? 1 : (r26 == r29 ? 0 : -1))
            if (r7 == 0) goto L_0x0390
            r78 = r10
            goto L_0x03ad
        L_0x0390:
            androidx.compose.runtime.ProvidableCompositionLocal r7 = androidx.compose.material3.ContentColorKt.getLocalContentColor()
            androidx.compose.runtime.CompositionLocal r7 = (androidx.compose.runtime.CompositionLocal) r7
            r14 = 2023513938(0x789c5f52, float:2.5372864E34)
            r78 = r10
            java.lang.String r10 = "CC:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r14, r10)
            java.lang.Object r7 = r2.consume(r7)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.ui.graphics.Color r7 = (androidx.compose.ui.graphics.Color) r7
            long r26 = r7.m2831unboximpl()
        L_0x03ad:
            r35 = r26
        L_0x03af:
            r2.endReplaceableGroup()
            androidx.compose.ui.text.TextStyle r7 = new androidx.compose.ui.text.TextStyle
            r34 = r7
            r41 = 0
            r43 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r52 = 0
            r54 = 0
            r57 = 0
            r58 = 0
            r59 = 0
            r60 = 0
            r61 = 0
            r62 = 4108112(0x3eaf50, float:5.756691E-39)
            r63 = 0
            r37 = r19
            r39 = r21
            r40 = r17
            r42 = r22
            r44 = r23
            r51 = r0
            r53 = r15
            r55 = r4
            r34.<init>((long) r35, (long) r37, (androidx.compose.ui.text.font.FontWeight) r39, (androidx.compose.ui.text.font.FontStyle) r40, (androidx.compose.ui.text.font.FontSynthesis) r41, (androidx.compose.ui.text.font.FontFamily) r42, (java.lang.String) r43, (long) r44, (androidx.compose.ui.text.style.BaselineShift) r46, (androidx.compose.ui.text.style.TextGeometricTransform) r47, (androidx.compose.ui.text.intl.LocaleList) r48, (long) r49, (androidx.compose.ui.text.style.TextDecoration) r51, (androidx.compose.ui.graphics.Shadow) r52, (androidx.compose.ui.text.style.TextAlign) r53, (androidx.compose.ui.text.style.TextDirection) r54, (long) r55, (androidx.compose.ui.text.style.TextIndent) r57, (androidx.compose.ui.text.PlatformTextStyle) r58, (androidx.compose.ui.text.style.LineHeightStyle) r59, (androidx.compose.ui.text.style.LineBreak) r60, (androidx.compose.ui.text.style.Hyphens) r61, (int) r62, (kotlin.jvm.internal.DefaultConstructorMarker) r63)
            androidx.compose.ui.text.TextStyle r7 = r8.merge((androidx.compose.ui.text.TextStyle) r7)
            r10 = r3 & 14
            r3 = r3 & 112(0x70, float:1.57E-43)
            r3 = r3 | r10
            int r10 = r13 >> 6
            r10 = r10 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | r10
            int r10 = r13 << 9
            r11 = r10 & r25
            r3 = r3 | r11
            r11 = r10 & r28
            r3 = r3 | r11
            r11 = r10 & r32
            r3 = r3 | r11
            r11 = 29360128(0x1c00000, float:7.052966E-38)
            r10 = r10 & r11
            r3 = r3 | r10
            r10 = 0
            r66 = r65
            r67 = r6
            r68 = r7
            r69 = r16
            r70 = r1
            r71 = r9
            r72 = r12
            r73 = r77
            r74 = r2
            r75 = r3
            r76 = r10
            androidx.compose.foundation.text.BasicTextKt.m856BasicText4YKlhWE((java.lang.String) r66, (androidx.compose.ui.Modifier) r67, (androidx.compose.ui.text.TextStyle) r68, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) r69, (int) r70, (boolean) r71, (int) r72, (int) r73, (androidx.compose.runtime.Composer) r74, (int) r75, (int) r76)
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L_0x0428
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0428:
            r18 = r12
            r13 = r15
            r7 = r17
            r10 = r23
            r12 = r0
            r14 = r4
            r23 = r8
            r17 = r9
            r8 = r21
            r9 = r22
            r21 = r77
            r3 = r78
            r22 = r16
            r16 = r1
        L_0x0441:
            androidx.compose.runtime.ScopeUpdateScope r5 = r2.endRestartGroup()
            if (r5 != 0) goto L_0x0448
            goto L_0x046b
        L_0x0448:
            androidx.compose.material3.TextKt$Text$2 r25 = new androidx.compose.material3.TextKt$Text$2
            r0 = r25
            r1 = r65
            r2 = r6
            r64 = r5
            r5 = r19
            r19 = r21
            r20 = r22
            r21 = r23
            r22 = r87
            r23 = r88
            r24 = r89
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r0 = r25
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1 = r64
            r1.updateScope(r0)
        L_0x046b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextKt.m1727Text4IGK_g(java.lang.String, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontFamily, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.text.style.TextAlign, long, int, boolean, int, int, kotlin.jvm.functions.Function1, androidx.compose.ui.text.TextStyle, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x03d9  */
    /* JADX WARNING: Removed duplicated region for block: B:238:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0138  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    /* renamed from: Text-fLXpl1I  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void m1729TextfLXpl1I(java.lang.String r49, androidx.compose.ui.Modifier r50, long r51, long r53, androidx.compose.ui.text.font.FontStyle r55, androidx.compose.ui.text.font.FontWeight r56, androidx.compose.ui.text.font.FontFamily r57, long r58, androidx.compose.ui.text.style.TextDecoration r60, androidx.compose.ui.text.style.TextAlign r61, long r62, int r64, boolean r65, int r66, kotlin.jvm.functions.Function1 r67, androidx.compose.ui.text.TextStyle r68, androidx.compose.runtime.Composer r69, int r70, int r71, int r72) {
        /*
            r15 = r49
            r13 = r70
            r14 = r71
            r12 = r72
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            r0 = 1968784669(0x7559451d, float:2.7542241E32)
            r1 = r69
            androidx.compose.runtime.Composer r11 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(Text)P(13,8,0:c#ui.graphics.Color,2:c#ui.unit.TextUnit,3:c#ui.text.font.FontStyle,4!1,5:c#ui.unit.TextUnit,15,14:c#ui.text.style.TextAlign,6:c#ui.unit.TextUnit,10:c#ui.text.style.TextOverflow,11)164@7243L7,166@7259L322:Text.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r1)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0023
            r1 = r13 | 6
            goto L_0x0033
        L_0x0023:
            r1 = r13 & 14
            if (r1 != 0) goto L_0x0032
            boolean r1 = r11.changed((java.lang.Object) r15)
            if (r1 == 0) goto L_0x002f
            r1 = 4
            goto L_0x0030
        L_0x002f:
            r1 = 2
        L_0x0030:
            r1 = r1 | r13
            goto L_0x0033
        L_0x0032:
            r1 = r13
        L_0x0033:
            r4 = r12 & 2
            if (r4 == 0) goto L_0x003a
            r1 = r1 | 48
            goto L_0x004d
        L_0x003a:
            r7 = r13 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x004d
            r7 = r50
            boolean r8 = r11.changed((java.lang.Object) r7)
            if (r8 == 0) goto L_0x0049
            r8 = 32
            goto L_0x004b
        L_0x0049:
            r8 = 16
        L_0x004b:
            r1 = r1 | r8
            goto L_0x004f
        L_0x004d:
            r7 = r50
        L_0x004f:
            r8 = r12 & 4
            if (r8 == 0) goto L_0x0058
            r1 = r1 | 384(0x180, float:5.38E-43)
            r5 = r51
            goto L_0x006b
        L_0x0058:
            r2 = r13 & 896(0x380, float:1.256E-42)
            r5 = r51
            if (r2 != 0) goto L_0x006b
            boolean r17 = r11.changed((long) r5)
            if (r17 == 0) goto L_0x0067
            r17 = 256(0x100, float:3.59E-43)
            goto L_0x0069
        L_0x0067:
            r17 = 128(0x80, float:1.794E-43)
        L_0x0069:
            r1 = r1 | r17
        L_0x006b:
            r17 = r12 & 8
            r18 = 2048(0x800, float:2.87E-42)
            r19 = 1024(0x400, float:1.435E-42)
            if (r17 == 0) goto L_0x0078
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            r9 = r53
            goto L_0x008b
        L_0x0078:
            r2 = r13 & 7168(0x1c00, float:1.0045E-41)
            r9 = r53
            if (r2 != 0) goto L_0x008b
            boolean r22 = r11.changed((long) r9)
            if (r22 == 0) goto L_0x0087
            r22 = r18
            goto L_0x0089
        L_0x0087:
            r22 = r19
        L_0x0089:
            r1 = r1 | r22
        L_0x008b:
            r22 = r12 & 16
            r23 = 16384(0x4000, float:2.2959E-41)
            r24 = 8192(0x2000, float:1.14794E-41)
            r25 = 57344(0xe000, float:8.0356E-41)
            if (r22 == 0) goto L_0x009b
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            r2 = r55
            goto L_0x00ae
        L_0x009b:
            r26 = r13 & r25
            r2 = r55
            if (r26 != 0) goto L_0x00ae
            boolean r27 = r11.changed((java.lang.Object) r2)
            if (r27 == 0) goto L_0x00aa
            r27 = r23
            goto L_0x00ac
        L_0x00aa:
            r27 = r24
        L_0x00ac:
            r1 = r1 | r27
        L_0x00ae:
            r27 = r12 & 32
            r28 = 458752(0x70000, float:6.42848E-40)
            if (r27 == 0) goto L_0x00bb
            r29 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r29
            r3 = r56
            goto L_0x00ce
        L_0x00bb:
            r29 = r13 & r28
            r3 = r56
            if (r29 != 0) goto L_0x00ce
            boolean r30 = r11.changed((java.lang.Object) r3)
            if (r30 == 0) goto L_0x00ca
            r30 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00cc
        L_0x00ca:
            r30 = 65536(0x10000, float:9.18355E-41)
        L_0x00cc:
            r1 = r1 | r30
        L_0x00ce:
            r30 = r12 & 64
            r31 = 3670016(0x380000, float:5.142788E-39)
            if (r30 == 0) goto L_0x00db
            r32 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r32
            r0 = r57
            goto L_0x00ee
        L_0x00db:
            r32 = r13 & r31
            r0 = r57
            if (r32 != 0) goto L_0x00ee
            boolean r33 = r11.changed((java.lang.Object) r0)
            if (r33 == 0) goto L_0x00ea
            r33 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ec
        L_0x00ea:
            r33 = 524288(0x80000, float:7.34684E-40)
        L_0x00ec:
            r1 = r1 | r33
        L_0x00ee:
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00f9
            r33 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r33
            r2 = r58
            goto L_0x010e
        L_0x00f9:
            r33 = 29360128(0x1c00000, float:7.052966E-38)
            r33 = r13 & r33
            r2 = r58
            if (r33 != 0) goto L_0x010e
            boolean r33 = r11.changed((long) r2)
            if (r33 == 0) goto L_0x010a
            r33 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x010c
        L_0x010a:
            r33 = 4194304(0x400000, float:5.877472E-39)
        L_0x010c:
            r1 = r1 | r33
        L_0x010e:
            r2 = r12 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x0116
            r3 = 100663296(0x6000000, float:2.4074124E-35)
            r1 = r1 | r3
            goto L_0x012b
        L_0x0116:
            r3 = 234881024(0xe000000, float:1.5777218E-30)
            r3 = r3 & r13
            if (r3 != 0) goto L_0x012b
            r3 = r60
            boolean r33 = r11.changed((java.lang.Object) r3)
            if (r33 == 0) goto L_0x0126
            r33 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0128
        L_0x0126:
            r33 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0128:
            r1 = r1 | r33
            goto L_0x012d
        L_0x012b:
            r3 = r60
        L_0x012d:
            r3 = r12 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x0138
            r33 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r1 | r33
            r5 = r61
            goto L_0x014c
        L_0x0138:
            r33 = 1879048192(0x70000000, float:1.58456325E29)
            r33 = r13 & r33
            r5 = r61
            if (r33 != 0) goto L_0x014c
            boolean r6 = r11.changed((java.lang.Object) r5)
            if (r6 == 0) goto L_0x0149
            r6 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x014b
        L_0x0149:
            r6 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x014b:
            r1 = r1 | r6
        L_0x014c:
            r6 = r12 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L_0x0155
            r29 = r14 | 6
            r9 = r62
            goto L_0x016b
        L_0x0155:
            r33 = r14 & 14
            r9 = r62
            if (r33 != 0) goto L_0x0169
            boolean r33 = r11.changed((long) r9)
            if (r33 == 0) goto L_0x0164
            r29 = 4
            goto L_0x0166
        L_0x0164:
            r29 = 2
        L_0x0166:
            r29 = r14 | r29
            goto L_0x016b
        L_0x0169:
            r29 = r14
        L_0x016b:
            r5 = r12 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x0172
            r29 = r29 | 48
            goto L_0x0185
        L_0x0172:
            r33 = r14 & 112(0x70, float:1.57E-43)
            r7 = r64
            if (r33 != 0) goto L_0x0185
            boolean r33 = r11.changed((int) r7)
            if (r33 == 0) goto L_0x0181
            r16 = 32
            goto L_0x0183
        L_0x0181:
            r16 = 16
        L_0x0183:
            r29 = r29 | r16
        L_0x0185:
            r7 = r29
            r9 = r12 & 4096(0x1000, float:5.74E-42)
            if (r9 == 0) goto L_0x018e
            r7 = r7 | 384(0x180, float:5.38E-43)
            goto L_0x01a2
        L_0x018e:
            r10 = r14 & 896(0x380, float:1.256E-42)
            if (r10 != 0) goto L_0x01a2
            r10 = r65
            boolean r16 = r11.changed((boolean) r10)
            if (r16 == 0) goto L_0x019d
            r26 = 256(0x100, float:3.59E-43)
            goto L_0x019f
        L_0x019d:
            r26 = 128(0x80, float:1.794E-43)
        L_0x019f:
            r7 = r7 | r26
            goto L_0x01a4
        L_0x01a2:
            r10 = r65
        L_0x01a4:
            r10 = r12 & 8192(0x2000, float:1.14794E-41)
            if (r10 == 0) goto L_0x01ab
            r7 = r7 | 3072(0xc00, float:4.305E-42)
            goto L_0x01bd
        L_0x01ab:
            r15 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r15 != 0) goto L_0x01bd
            r15 = r66
            boolean r16 = r11.changed((int) r15)
            if (r16 == 0) goto L_0x01b8
            goto L_0x01ba
        L_0x01b8:
            r18 = r19
        L_0x01ba:
            r7 = r7 | r18
            goto L_0x01bf
        L_0x01bd:
            r15 = r66
        L_0x01bf:
            r15 = r12 & 16384(0x4000, float:2.2959E-41)
            if (r15 == 0) goto L_0x01c6
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
            goto L_0x01da
        L_0x01c6:
            r16 = r14 & r25
            if (r16 != 0) goto L_0x01da
            r16 = r15
            r15 = r67
            boolean r18 = r11.changedInstance(r15)
            if (r18 == 0) goto L_0x01d5
            goto L_0x01d7
        L_0x01d5:
            r23 = r24
        L_0x01d7:
            r7 = r7 | r23
            goto L_0x01de
        L_0x01da:
            r16 = r15
            r15 = r67
        L_0x01de:
            r18 = r14 & r28
            r19 = 32768(0x8000, float:4.5918E-41)
            if (r18 != 0) goto L_0x01f9
            r18 = r12 & r19
            r14 = r68
            if (r18 != 0) goto L_0x01f4
            boolean r18 = r11.changed((java.lang.Object) r14)
            if (r18 == 0) goto L_0x01f4
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01f6
        L_0x01f4:
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x01f6:
            r7 = r7 | r18
            goto L_0x01fb
        L_0x01f9:
            r14 = r68
        L_0x01fb:
            r18 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r14 = r1 & r18
            r15 = 306783378(0x12492492, float:6.3469493E-28)
            if (r14 != r15) goto L_0x023a
            r14 = 374491(0x5b6db, float:5.24774E-40)
            r14 = r14 & r7
            r15 = 74898(0x12492, float:1.04954E-40)
            if (r14 != r15) goto L_0x023a
            boolean r14 = r11.getSkipping()
            if (r14 != 0) goto L_0x0215
            goto L_0x023a
        L_0x0215:
            r11.skipToGroupEnd()
            r2 = r50
            r3 = r51
            r5 = r53
            r7 = r55
            r8 = r56
            r9 = r57
            r12 = r60
            r13 = r61
            r14 = r62
            r16 = r64
            r17 = r65
            r18 = r66
            r19 = r67
            r20 = r68
            r25 = r11
            r10 = r58
            goto L_0x03d2
        L_0x023a:
            r11.startDefaults()
            r14 = r13 & 1
            if (r14 == 0) goto L_0x0273
            boolean r14 = r11.getDefaultsInvalid()
            if (r14 == 0) goto L_0x0248
            goto L_0x0273
        L_0x0248:
            r11.skipToGroupEnd()
            r0 = r12 & r19
            if (r0 == 0) goto L_0x0253
            r0 = -458753(0xfffffffffff8ffff, float:NaN)
            r7 = r7 & r0
        L_0x0253:
            r26 = r50
            r29 = r51
            r33 = r53
            r27 = r55
            r35 = r56
            r36 = r57
            r37 = r58
            r39 = r60
            r40 = r61
            r41 = r62
            r43 = r64
            r44 = r65
            r45 = r66
            r46 = r67
            r47 = r68
            goto L_0x0337
        L_0x0273:
            if (r4 == 0) goto L_0x027a
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r4 = (androidx.compose.ui.Modifier) r4
            goto L_0x027c
        L_0x027a:
            r4 = r50
        L_0x027c:
            if (r8 == 0) goto L_0x0285
            androidx.compose.ui.graphics.Color$Companion r8 = androidx.compose.ui.graphics.Color.Companion
            long r14 = r8.m2857getUnspecified0d7_KjU()
            goto L_0x0287
        L_0x0285:
            r14 = r51
        L_0x0287:
            if (r17 == 0) goto L_0x0290
            androidx.compose.ui.unit.TextUnit$Companion r8 = androidx.compose.ui.unit.TextUnit.Companion
            long r17 = r8.m5818getUnspecifiedXSAIIZE()
            goto L_0x0292
        L_0x0290:
            r17 = r53
        L_0x0292:
            r8 = 0
            if (r22 == 0) goto L_0x0298
            r20 = r8
            goto L_0x029a
        L_0x0298:
            r20 = r55
        L_0x029a:
            if (r27 == 0) goto L_0x029f
            r21 = r8
            goto L_0x02a1
        L_0x029f:
            r21 = r56
        L_0x02a1:
            if (r30 == 0) goto L_0x02a6
            r22 = r8
            goto L_0x02a8
        L_0x02a6:
            r22 = r57
        L_0x02a8:
            if (r0 == 0) goto L_0x02b1
            androidx.compose.ui.unit.TextUnit$Companion r0 = androidx.compose.ui.unit.TextUnit.Companion
            long r23 = r0.m5818getUnspecifiedXSAIIZE()
            goto L_0x02b3
        L_0x02b1:
            r23 = r58
        L_0x02b3:
            if (r2 == 0) goto L_0x02b7
            r0 = r8
            goto L_0x02b9
        L_0x02b7:
            r0 = r60
        L_0x02b9:
            if (r3 == 0) goto L_0x02bc
            goto L_0x02be
        L_0x02bc:
            r8 = r61
        L_0x02be:
            if (r6 == 0) goto L_0x02c7
            androidx.compose.ui.unit.TextUnit$Companion r2 = androidx.compose.ui.unit.TextUnit.Companion
            long r2 = r2.m5818getUnspecifiedXSAIIZE()
            goto L_0x02c9
        L_0x02c7:
            r2 = r62
        L_0x02c9:
            if (r5 == 0) goto L_0x02d2
            androidx.compose.ui.text.style.TextOverflow$Companion r5 = androidx.compose.ui.text.style.TextOverflow.Companion
            int r5 = r5.m5555getClipgIe3tQ8()
            goto L_0x02d4
        L_0x02d2:
            r5 = r64
        L_0x02d4:
            if (r9 == 0) goto L_0x02d8
            r6 = 1
            goto L_0x02da
        L_0x02d8:
            r6 = r65
        L_0x02da:
            if (r10 == 0) goto L_0x02e0
            r9 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x02e2
        L_0x02e0:
            r9 = r66
        L_0x02e2:
            if (r16 == 0) goto L_0x02e9
            androidx.compose.material3.TextKt$Text$3 r10 = androidx.compose.material3.TextKt$Text$3.INSTANCE
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            goto L_0x02eb
        L_0x02e9:
            r10 = r67
        L_0x02eb:
            r16 = r12 & r19
            if (r16 == 0) goto L_0x0315
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.text.TextStyle> r16 = LocalTextStyle
            r50 = r0
            r0 = r16
            androidx.compose.runtime.CompositionLocal r0 = (androidx.compose.runtime.CompositionLocal) r0
            r51 = r2
            r2 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r3 = "CC:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r11, r2, r3)
            java.lang.Object r0 = r11.consume(r0)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r11)
            androidx.compose.ui.text.TextStyle r0 = (androidx.compose.ui.text.TextStyle) r0
            r2 = -458753(0xfffffffffff8ffff, float:NaN)
            r7 = r7 & r2
            r39 = r50
            r41 = r51
            r47 = r0
            goto L_0x031f
        L_0x0315:
            r50 = r0
            r51 = r2
            r39 = r50
            r41 = r51
            r47 = r68
        L_0x031f:
            r26 = r4
            r43 = r5
            r44 = r6
            r40 = r8
            r45 = r9
            r46 = r10
            r29 = r14
            r33 = r17
            r27 = r20
            r35 = r21
            r36 = r22
            r37 = r23
        L_0x0337:
            r11.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0349
            java.lang.String r0 = "androidx.compose.material3.Text (Text.kt:148)"
            r2 = 1968784669(0x7559451d, float:2.7542241E32)
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r1, r7, r0)
        L_0x0349:
            r18 = 1
            r0 = r1 & 14
            r2 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            r2 = r1 & r25
            r0 = r0 | r2
            r2 = r1 & r28
            r0 = r0 | r2
            r2 = r1 & r31
            r0 = r0 | r2
            r2 = 29360128(0x1c00000, float:7.052966E-38)
            r2 = r2 & r1
            r0 = r0 | r2
            r2 = 234881024(0xe000000, float:1.5777218E-30)
            r2 = r2 & r1
            r0 = r0 | r2
            r2 = 1879048192(0x70000000, float:1.58456325E29)
            r1 = r1 & r2
            r22 = r0 | r1
            r0 = r7 & 14
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            r1 = r7 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            r1 = r7 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            r1 = r7 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r1
            int r1 = r7 << 3
            r2 = r1 & r28
            r0 = r0 | r2
            r1 = r1 & r31
            r23 = r0 | r1
            r24 = 0
            r0 = r49
            r1 = r26
            r2 = r29
            r4 = r33
            r6 = r27
            r7 = r35
            r8 = r36
            r9 = r37
            r25 = r11
            r11 = r39
            r12 = r40
            r13 = r41
            r15 = r43
            r16 = r44
            r17 = r45
            r19 = r46
            r20 = r47
            r21 = r25
            m1727Text4IGK_g((java.lang.String) r0, (androidx.compose.ui.Modifier) r1, (long) r2, (long) r4, (androidx.compose.ui.text.font.FontStyle) r6, (androidx.compose.ui.text.font.FontWeight) r7, (androidx.compose.ui.text.font.FontFamily) r8, (long) r9, (androidx.compose.ui.text.style.TextDecoration) r11, (androidx.compose.ui.text.style.TextAlign) r12, (long) r13, (int) r15, (boolean) r16, (int) r17, (int) r18, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) r19, (androidx.compose.ui.text.TextStyle) r20, (androidx.compose.runtime.Composer) r21, (int) r22, (int) r23, (int) r24)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x03b4
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x03b4:
            r2 = r26
            r7 = r27
            r3 = r29
            r5 = r33
            r8 = r35
            r9 = r36
            r10 = r37
            r12 = r39
            r13 = r40
            r14 = r41
            r16 = r43
            r17 = r44
            r18 = r45
            r19 = r46
            r20 = r47
        L_0x03d2:
            androidx.compose.runtime.ScopeUpdateScope r1 = r25.endRestartGroup()
            if (r1 != 0) goto L_0x03d9
            goto L_0x03f3
        L_0x03d9:
            androidx.compose.material3.TextKt$Text$4 r24 = new androidx.compose.material3.TextKt$Text$4
            r0 = r24
            r48 = r1
            r1 = r49
            r21 = r70
            r22 = r71
            r23 = r72
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23)
            r0 = r24
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1 = r48
            r1.updateScope(r0)
        L_0x03f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextKt.m1729TextfLXpl1I(java.lang.String, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontFamily, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.text.style.TextAlign, long, int, boolean, int, kotlin.jvm.functions.Function1, androidx.compose.ui.text.TextStyle, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0373  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x037f  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x0396  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x039b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x0446  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x046b  */
    /* JADX WARNING: Removed duplicated region for block: B:269:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x013c  */
    /* renamed from: Text-IbK3jfQ  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1728TextIbK3jfQ(androidx.compose.ui.text.AnnotatedString r67, androidx.compose.ui.Modifier r68, long r69, long r71, androidx.compose.ui.text.font.FontStyle r73, androidx.compose.ui.text.font.FontWeight r74, androidx.compose.ui.text.font.FontFamily r75, long r76, androidx.compose.ui.text.style.TextDecoration r78, androidx.compose.ui.text.style.TextAlign r79, long r80, int r82, boolean r83, int r84, int r85, java.util.Map<java.lang.String, androidx.compose.foundation.text.InlineTextContent> r86, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> r87, androidx.compose.ui.text.TextStyle r88, androidx.compose.runtime.Composer r89, int r90, int r91, int r92) {
        /*
            r1 = r67
            r14 = r90
            r15 = r91
            r13 = r92
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = 2027001676(0x78d1974c, float:3.4008085E34)
            r2 = r89
            androidx.compose.runtime.Composer r2 = r2.startRestartGroup(r0)
            java.lang.String r3 = "C(Text)P(15,10,0:c#ui.graphics.Color,2:c#ui.unit.TextUnit,3:c#ui.text.font.FontStyle,4!1,6:c#ui.unit.TextUnit,17,16:c#ui.text.style.TextAlign,7:c#ui.unit.TextUnit,12:c#ui.text.style.TextOverflow,13,8,9)258@11733L7,280@12450L286:Text.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r3)
            r3 = r13 & 1
            if (r3 == 0) goto L_0x0023
            r3 = r14 | 6
            goto L_0x0033
        L_0x0023:
            r3 = r14 & 14
            if (r3 != 0) goto L_0x0032
            boolean r3 = r2.changed((java.lang.Object) r1)
            if (r3 == 0) goto L_0x002f
            r3 = 4
            goto L_0x0030
        L_0x002f:
            r3 = 2
        L_0x0030:
            r3 = r3 | r14
            goto L_0x0033
        L_0x0032:
            r3 = r14
        L_0x0033:
            r6 = r13 & 2
            if (r6 == 0) goto L_0x003a
            r3 = r3 | 48
            goto L_0x004d
        L_0x003a:
            r9 = r14 & 112(0x70, float:1.57E-43)
            if (r9 != 0) goto L_0x004d
            r9 = r68
            boolean r10 = r2.changed((java.lang.Object) r9)
            if (r10 == 0) goto L_0x0049
            r10 = 32
            goto L_0x004b
        L_0x0049:
            r10 = 16
        L_0x004b:
            r3 = r3 | r10
            goto L_0x004f
        L_0x004d:
            r9 = r68
        L_0x004f:
            r10 = r13 & 4
            if (r10 == 0) goto L_0x0058
            r3 = r3 | 384(0x180, float:5.38E-43)
            r7 = r69
            goto L_0x006b
        L_0x0058:
            r4 = r14 & 896(0x380, float:1.256E-42)
            r7 = r69
            if (r4 != 0) goto L_0x006b
            boolean r17 = r2.changed((long) r7)
            if (r17 == 0) goto L_0x0067
            r17 = 256(0x100, float:3.59E-43)
            goto L_0x0069
        L_0x0067:
            r17 = 128(0x80, float:1.794E-43)
        L_0x0069:
            r3 = r3 | r17
        L_0x006b:
            r17 = r13 & 8
            r18 = 2048(0x800, float:2.87E-42)
            r19 = 1024(0x400, float:1.435E-42)
            if (r17 == 0) goto L_0x0078
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            r11 = r71
            goto L_0x008b
        L_0x0078:
            r4 = r14 & 7168(0x1c00, float:1.0045E-41)
            r11 = r71
            if (r4 != 0) goto L_0x008b
            boolean r22 = r2.changed((long) r11)
            if (r22 == 0) goto L_0x0087
            r22 = r18
            goto L_0x0089
        L_0x0087:
            r22 = r19
        L_0x0089:
            r3 = r3 | r22
        L_0x008b:
            r22 = r13 & 16
            r23 = 16384(0x4000, float:2.2959E-41)
            r24 = 8192(0x2000, float:1.14794E-41)
            r25 = 57344(0xe000, float:8.0356E-41)
            if (r22 == 0) goto L_0x009b
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            r4 = r73
            goto L_0x00ae
        L_0x009b:
            r26 = r14 & r25
            r4 = r73
            if (r26 != 0) goto L_0x00ae
            boolean r27 = r2.changed((java.lang.Object) r4)
            if (r27 == 0) goto L_0x00aa
            r27 = r23
            goto L_0x00ac
        L_0x00aa:
            r27 = r24
        L_0x00ac:
            r3 = r3 | r27
        L_0x00ae:
            r27 = r13 & 32
            r28 = 65536(0x10000, float:9.18355E-41)
            r29 = 131072(0x20000, float:1.83671E-40)
            if (r27 == 0) goto L_0x00bd
            r30 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r30
            r5 = r74
            goto L_0x00d2
        L_0x00bd:
            r30 = 458752(0x70000, float:6.42848E-40)
            r30 = r14 & r30
            r5 = r74
            if (r30 != 0) goto L_0x00d2
            boolean r31 = r2.changed((java.lang.Object) r5)
            if (r31 == 0) goto L_0x00ce
            r31 = r29
            goto L_0x00d0
        L_0x00ce:
            r31 = r28
        L_0x00d0:
            r3 = r3 | r31
        L_0x00d2:
            r31 = r13 & 64
            r32 = 3670016(0x380000, float:5.142788E-39)
            if (r31 == 0) goto L_0x00df
            r33 = 1572864(0x180000, float:2.204052E-39)
            r3 = r3 | r33
            r0 = r75
            goto L_0x00f2
        L_0x00df:
            r33 = r14 & r32
            r0 = r75
            if (r33 != 0) goto L_0x00f2
            boolean r34 = r2.changed((java.lang.Object) r0)
            if (r34 == 0) goto L_0x00ee
            r34 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00f0
        L_0x00ee:
            r34 = 524288(0x80000, float:7.34684E-40)
        L_0x00f0:
            r3 = r3 | r34
        L_0x00f2:
            r0 = r13 & 128(0x80, float:1.794E-43)
            r34 = 29360128(0x1c00000, float:7.052966E-38)
            if (r0 == 0) goto L_0x00ff
            r35 = 12582912(0xc00000, float:1.7632415E-38)
            r3 = r3 | r35
            r4 = r76
            goto L_0x0112
        L_0x00ff:
            r35 = r14 & r34
            r4 = r76
            if (r35 != 0) goto L_0x0112
            boolean r35 = r2.changed((long) r4)
            if (r35 == 0) goto L_0x010e
            r35 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0110
        L_0x010e:
            r35 = 4194304(0x400000, float:5.877472E-39)
        L_0x0110:
            r3 = r3 | r35
        L_0x0112:
            r1 = r13 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x011d
            r35 = 100663296(0x6000000, float:2.4074124E-35)
            r3 = r3 | r35
            r4 = r78
            goto L_0x0131
        L_0x011d:
            r35 = 234881024(0xe000000, float:1.5777218E-30)
            r35 = r14 & r35
            r4 = r78
            if (r35 != 0) goto L_0x0131
            boolean r5 = r2.changed((java.lang.Object) r4)
            if (r5 == 0) goto L_0x012e
            r5 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0130
        L_0x012e:
            r5 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0130:
            r3 = r3 | r5
        L_0x0131:
            r5 = r13 & 512(0x200, float:7.175E-43)
            if (r5 == 0) goto L_0x013c
            r35 = 805306368(0x30000000, float:4.656613E-10)
            r3 = r3 | r35
            r4 = r79
            goto L_0x0151
        L_0x013c:
            r35 = 1879048192(0x70000000, float:1.58456325E29)
            r35 = r14 & r35
            r4 = r79
            if (r35 != 0) goto L_0x0151
            boolean r35 = r2.changed((java.lang.Object) r4)
            if (r35 == 0) goto L_0x014d
            r35 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x014f
        L_0x014d:
            r35 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x014f:
            r3 = r3 | r35
        L_0x0151:
            r4 = r13 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L_0x015a
            r30 = r15 | 6
            r7 = r80
            goto L_0x0170
        L_0x015a:
            r35 = r15 & 14
            r7 = r80
            if (r35 != 0) goto L_0x016e
            boolean r35 = r2.changed((long) r7)
            if (r35 == 0) goto L_0x0169
            r30 = 4
            goto L_0x016b
        L_0x0169:
            r30 = 2
        L_0x016b:
            r30 = r15 | r30
            goto L_0x0170
        L_0x016e:
            r30 = r15
        L_0x0170:
            r7 = r13 & 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto L_0x0177
            r30 = r30 | 48
            goto L_0x018d
        L_0x0177:
            r8 = r15 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x018b
            r8 = r82
            boolean r35 = r2.changed((int) r8)
            if (r35 == 0) goto L_0x0186
            r16 = 32
            goto L_0x0188
        L_0x0186:
            r16 = 16
        L_0x0188:
            r30 = r30 | r16
            goto L_0x018d
        L_0x018b:
            r8 = r82
        L_0x018d:
            r8 = r30
            r9 = r13 & 4096(0x1000, float:5.74E-42)
            if (r9 == 0) goto L_0x0196
            r8 = r8 | 384(0x180, float:5.38E-43)
            goto L_0x01aa
        L_0x0196:
            r11 = r15 & 896(0x380, float:1.256E-42)
            if (r11 != 0) goto L_0x01aa
            r11 = r83
            boolean r12 = r2.changed((boolean) r11)
            if (r12 == 0) goto L_0x01a5
            r26 = 256(0x100, float:3.59E-43)
            goto L_0x01a7
        L_0x01a5:
            r26 = 128(0x80, float:1.794E-43)
        L_0x01a7:
            r8 = r8 | r26
            goto L_0x01ac
        L_0x01aa:
            r11 = r83
        L_0x01ac:
            r12 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r12 == 0) goto L_0x01b3
            r8 = r8 | 3072(0xc00, float:4.305E-42)
            goto L_0x01c5
        L_0x01b3:
            r11 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r11 != 0) goto L_0x01c5
            r11 = r84
            boolean r16 = r2.changed((int) r11)
            if (r16 == 0) goto L_0x01c0
            goto L_0x01c2
        L_0x01c0:
            r18 = r19
        L_0x01c2:
            r8 = r8 | r18
            goto L_0x01c7
        L_0x01c5:
            r11 = r84
        L_0x01c7:
            r11 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r11 == 0) goto L_0x01ce
            r8 = r8 | 24576(0x6000, float:3.4438E-41)
            goto L_0x01e2
        L_0x01ce:
            r16 = r15 & r25
            if (r16 != 0) goto L_0x01e2
            r16 = r11
            r11 = r85
            boolean r18 = r2.changed((int) r11)
            if (r18 == 0) goto L_0x01dd
            goto L_0x01df
        L_0x01dd:
            r23 = r24
        L_0x01df:
            r8 = r8 | r23
            goto L_0x01e6
        L_0x01e2:
            r16 = r11
            r11 = r85
        L_0x01e6:
            r18 = 32768(0x8000, float:4.5918E-41)
            r11 = r13 & r18
            if (r11 == 0) goto L_0x01ef
            r8 = r8 | r28
        L_0x01ef:
            r18 = r13 & r28
            if (r18 == 0) goto L_0x01f8
            r19 = 1572864(0x180000, float:2.204052E-39)
            r8 = r8 | r19
            goto L_0x020e
        L_0x01f8:
            r19 = r15 & r32
            if (r19 != 0) goto L_0x020e
            r19 = r12
            r12 = r87
            boolean r20 = r2.changedInstance(r12)
            if (r20 == 0) goto L_0x0209
            r20 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x020b
        L_0x0209:
            r20 = 524288(0x80000, float:7.34684E-40)
        L_0x020b:
            r8 = r8 | r20
            goto L_0x0212
        L_0x020e:
            r19 = r12
            r12 = r87
        L_0x0212:
            r20 = r15 & r34
            if (r20 != 0) goto L_0x022a
            r20 = r13 & r29
            r12 = r88
            if (r20 != 0) goto L_0x0225
            boolean r20 = r2.changed((java.lang.Object) r12)
            if (r20 == 0) goto L_0x0225
            r20 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0227
        L_0x0225:
            r20 = 4194304(0x400000, float:5.877472E-39)
        L_0x0227:
            r8 = r8 | r20
            goto L_0x022c
        L_0x022a:
            r12 = r88
        L_0x022c:
            r12 = 32768(0x8000, float:4.5918E-41)
            if (r11 != r12) goto L_0x0271
            r12 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r12 = r12 & r3
            r15 = 306783378(0x12492492, float:6.3469493E-28)
            if (r12 != r15) goto L_0x0271
            r12 = 23967451(0x16db6db, float:4.3661218E-38)
            r12 = r12 & r8
            r15 = 4793490(0x492492, float:6.71711E-39)
            if (r12 != r15) goto L_0x0271
            boolean r12 = r2.getSkipping()
            if (r12 != 0) goto L_0x024a
            goto L_0x0271
        L_0x024a:
            r2.skipToGroupEnd()
            r6 = r68
            r3 = r69
            r23 = r71
            r7 = r73
            r8 = r74
            r9 = r75
            r10 = r76
            r12 = r78
            r13 = r79
            r14 = r80
            r16 = r82
            r17 = r83
            r18 = r84
            r19 = r85
            r20 = r86
            r21 = r87
            r22 = r88
            goto L_0x0464
        L_0x0271:
            r2.startDefaults()
            r12 = r14 & 1
            if (r12 == 0) goto L_0x02af
            boolean r12 = r2.getDefaultsInvalid()
            if (r12 == 0) goto L_0x027f
            goto L_0x02af
        L_0x027f:
            r2.skipToGroupEnd()
            r0 = r13 & r29
            if (r0 == 0) goto L_0x028a
            r0 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r8 = r8 & r0
        L_0x028a:
            r6 = r68
            r20 = r69
            r23 = r71
            r12 = r73
            r15 = r74
            r17 = r75
            r26 = r76
            r0 = r78
            r10 = r79
            r4 = r80
            r1 = r82
            r9 = r83
            r19 = r84
            r7 = r85
            r11 = r86
            r16 = r87
        L_0x02aa:
            r13 = r8
            r8 = r88
            goto L_0x036a
        L_0x02af:
            if (r6 == 0) goto L_0x02b6
            androidx.compose.ui.Modifier$Companion r6 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r6 = (androidx.compose.ui.Modifier) r6
            goto L_0x02b8
        L_0x02b6:
            r6 = r68
        L_0x02b8:
            if (r10 == 0) goto L_0x02c1
            androidx.compose.ui.graphics.Color$Companion r10 = androidx.compose.ui.graphics.Color.Companion
            long r20 = r10.m2857getUnspecified0d7_KjU()
            goto L_0x02c3
        L_0x02c1:
            r20 = r69
        L_0x02c3:
            if (r17 == 0) goto L_0x02cc
            androidx.compose.ui.unit.TextUnit$Companion r10 = androidx.compose.ui.unit.TextUnit.Companion
            long r23 = r10.m5818getUnspecifiedXSAIIZE()
            goto L_0x02ce
        L_0x02cc:
            r23 = r71
        L_0x02ce:
            r10 = 0
            if (r22 == 0) goto L_0x02d3
            r12 = r10
            goto L_0x02d5
        L_0x02d3:
            r12 = r73
        L_0x02d5:
            if (r27 == 0) goto L_0x02d9
            r15 = r10
            goto L_0x02db
        L_0x02d9:
            r15 = r74
        L_0x02db:
            if (r31 == 0) goto L_0x02e0
            r17 = r10
            goto L_0x02e2
        L_0x02e0:
            r17 = r75
        L_0x02e2:
            if (r0 == 0) goto L_0x02eb
            androidx.compose.ui.unit.TextUnit$Companion r0 = androidx.compose.ui.unit.TextUnit.Companion
            long r26 = r0.m5818getUnspecifiedXSAIIZE()
            goto L_0x02ed
        L_0x02eb:
            r26 = r76
        L_0x02ed:
            if (r1 == 0) goto L_0x02f1
            r0 = r10
            goto L_0x02f3
        L_0x02f1:
            r0 = r78
        L_0x02f3:
            if (r5 == 0) goto L_0x02f6
            goto L_0x02f8
        L_0x02f6:
            r10 = r79
        L_0x02f8:
            if (r4 == 0) goto L_0x0301
            androidx.compose.ui.unit.TextUnit$Companion r1 = androidx.compose.ui.unit.TextUnit.Companion
            long r4 = r1.m5818getUnspecifiedXSAIIZE()
            goto L_0x0303
        L_0x0301:
            r4 = r80
        L_0x0303:
            if (r7 == 0) goto L_0x030c
            androidx.compose.ui.text.style.TextOverflow$Companion r1 = androidx.compose.ui.text.style.TextOverflow.Companion
            int r1 = r1.m5555getClipgIe3tQ8()
            goto L_0x030e
        L_0x030c:
            r1 = r82
        L_0x030e:
            r7 = 1
            if (r9 == 0) goto L_0x0313
            r9 = r7
            goto L_0x0315
        L_0x0313:
            r9 = r83
        L_0x0315:
            if (r19 == 0) goto L_0x031b
            r19 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x031d
        L_0x031b:
            r19 = r84
        L_0x031d:
            if (r16 == 0) goto L_0x0320
            goto L_0x0322
        L_0x0320:
            r7 = r85
        L_0x0322:
            if (r11 == 0) goto L_0x0329
            java.util.Map r11 = kotlin.collections.MapsKt.emptyMap()
            goto L_0x032b
        L_0x0329:
            r11 = r86
        L_0x032b:
            if (r18 == 0) goto L_0x0332
            androidx.compose.material3.TextKt$Text$5 r16 = androidx.compose.material3.TextKt$Text$5.INSTANCE
            kotlin.jvm.functions.Function1 r16 = (kotlin.jvm.functions.Function1) r16
            goto L_0x0334
        L_0x0332:
            r16 = r87
        L_0x0334:
            r18 = r13 & r29
            if (r18 == 0) goto L_0x0362
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.text.TextStyle> r18 = LocalTextStyle
            r68 = r0
            r0 = r18
            androidx.compose.runtime.CompositionLocal r0 = (androidx.compose.runtime.CompositionLocal) r0
            r69 = r1
            r1 = 2023513938(0x789c5f52, float:2.5372864E34)
            r70 = r4
            java.lang.String r4 = "CC:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r1, r4)
            java.lang.Object r0 = r2.consume(r0)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.ui.text.TextStyle r0 = (androidx.compose.ui.text.TextStyle) r0
            r1 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r8 = r8 & r1
            r1 = r69
            r4 = r70
            r13 = r8
            r8 = r0
            r0 = r68
            goto L_0x036a
        L_0x0362:
            r68 = r0
            r69 = r1
            r70 = r4
            goto L_0x02aa
        L_0x036a:
            r2.endDefaults()
            boolean r18 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r18 == 0) goto L_0x037f
            java.lang.String r14 = "androidx.compose.material3.Text (Text.kt:240)"
            r80 = r11
            r11 = 2027001676(0x78d1974c, float:3.4008085E34)
            androidx.compose.runtime.ComposerKt.traceEventStart(r11, r3, r13, r14)
            goto L_0x0381
        L_0x037f:
            r80 = r11
        L_0x0381:
            r11 = 79588971(0x4be6e6b, float:4.477019E-36)
            r2.startReplaceableGroup(r11)
            java.lang.String r11 = "*262@11847L7"
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r11)
            androidx.compose.ui.graphics.Color$Companion r11 = androidx.compose.ui.graphics.Color.Companion
            long r28 = r11.m2857getUnspecified0d7_KjU()
            int r11 = (r20 > r28 ? 1 : (r20 == r28 ? 0 : -1))
            if (r11 == 0) goto L_0x039b
            r81 = r7
            r36 = r20
            goto L_0x03cb
        L_0x039b:
            long r28 = r8.m5151getColor0d7_KjU()
            androidx.compose.ui.graphics.Color$Companion r11 = androidx.compose.ui.graphics.Color.Companion
            long r30 = r11.m2857getUnspecified0d7_KjU()
            int r11 = (r28 > r30 ? 1 : (r28 == r30 ? 0 : -1))
            if (r11 == 0) goto L_0x03ac
            r81 = r7
            goto L_0x03c9
        L_0x03ac:
            androidx.compose.runtime.ProvidableCompositionLocal r11 = androidx.compose.material3.ContentColorKt.getLocalContentColor()
            androidx.compose.runtime.CompositionLocal r11 = (androidx.compose.runtime.CompositionLocal) r11
            r14 = 2023513938(0x789c5f52, float:2.5372864E34)
            r81 = r7
            java.lang.String r7 = "CC:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r14, r7)
            java.lang.Object r7 = r2.consume(r11)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.ui.graphics.Color r7 = (androidx.compose.ui.graphics.Color) r7
            long r28 = r7.m2831unboximpl()
        L_0x03c9:
            r36 = r28
        L_0x03cb:
            r2.endReplaceableGroup()
            androidx.compose.ui.text.TextStyle r7 = new androidx.compose.ui.text.TextStyle
            r35 = r7
            r42 = 0
            r44 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r53 = 0
            r55 = 0
            r58 = 0
            r59 = 0
            r60 = 0
            r61 = 0
            r62 = 0
            r63 = 4108112(0x3eaf50, float:5.756691E-39)
            r64 = 0
            r38 = r23
            r40 = r15
            r41 = r12
            r43 = r17
            r45 = r26
            r52 = r0
            r54 = r10
            r56 = r4
            r35.<init>((long) r36, (long) r38, (androidx.compose.ui.text.font.FontWeight) r40, (androidx.compose.ui.text.font.FontStyle) r41, (androidx.compose.ui.text.font.FontSynthesis) r42, (androidx.compose.ui.text.font.FontFamily) r43, (java.lang.String) r44, (long) r45, (androidx.compose.ui.text.style.BaselineShift) r47, (androidx.compose.ui.text.style.TextGeometricTransform) r48, (androidx.compose.ui.text.intl.LocaleList) r49, (long) r50, (androidx.compose.ui.text.style.TextDecoration) r52, (androidx.compose.ui.graphics.Shadow) r53, (androidx.compose.ui.text.style.TextAlign) r54, (androidx.compose.ui.text.style.TextDirection) r55, (long) r56, (androidx.compose.ui.text.style.TextIndent) r58, (androidx.compose.ui.text.PlatformTextStyle) r59, (androidx.compose.ui.text.style.LineHeightStyle) r60, (androidx.compose.ui.text.style.LineBreak) r61, (androidx.compose.ui.text.style.Hyphens) r62, (int) r63, (kotlin.jvm.internal.DefaultConstructorMarker) r64)
            androidx.compose.ui.text.TextStyle r7 = r8.merge((androidx.compose.ui.text.TextStyle) r7)
            r11 = 134217728(0x8000000, float:3.85186E-34)
            r14 = r3 & 14
            r11 = r11 | r14
            r3 = r3 & 112(0x70, float:1.57E-43)
            r3 = r3 | r11
            int r11 = r13 >> 9
            r11 = r11 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | r11
            int r11 = r13 << 9
            r13 = r11 & r25
            r3 = r3 | r13
            r13 = 458752(0x70000, float:6.42848E-40)
            r13 = r13 & r11
            r3 = r3 | r13
            r13 = r11 & r32
            r3 = r3 | r13
            r11 = r11 & r34
            r3 = r3 | r11
            r11 = 0
            r68 = r67
            r69 = r6
            r70 = r7
            r71 = r16
            r72 = r1
            r73 = r9
            r74 = r19
            r75 = r81
            r76 = r80
            r77 = r2
            r78 = r3
            r79 = r11
            androidx.compose.foundation.text.BasicTextKt.m858BasicTextVhcvRP8(r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79)
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L_0x0449
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0449:
            r22 = r8
            r13 = r10
            r7 = r12
            r8 = r15
            r18 = r19
            r10 = r26
            r19 = r81
            r12 = r0
            r14 = r4
            r3 = r20
            r20 = r80
            r21 = r16
            r16 = r1
            r66 = r17
            r17 = r9
            r9 = r66
        L_0x0464:
            androidx.compose.runtime.ScopeUpdateScope r5 = r2.endRestartGroup()
            if (r5 != 0) goto L_0x046b
            goto L_0x0488
        L_0x046b:
            androidx.compose.material3.TextKt$Text$6 r26 = new androidx.compose.material3.TextKt$Text$6
            r0 = r26
            r1 = r67
            r2 = r6
            r65 = r5
            r5 = r23
            r23 = r90
            r24 = r91
            r25 = r92
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r0 = r26
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1 = r65
            r1.updateScope(r0)
        L_0x0488:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextKt.m1728TextIbK3jfQ(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontFamily, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.text.style.TextAlign, long, int, boolean, int, int, java.util.Map, kotlin.jvm.functions.Function1, androidx.compose.ui.text.TextStyle, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x03f8  */
    /* JADX WARNING: Removed duplicated region for block: B:247:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0136  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    /* renamed from: Text--4IGK_g  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void m1726Text4IGK_g(androidx.compose.ui.text.AnnotatedString r51, androidx.compose.ui.Modifier r52, long r53, long r55, androidx.compose.ui.text.font.FontStyle r57, androidx.compose.ui.text.font.FontWeight r58, androidx.compose.ui.text.font.FontFamily r59, long r60, androidx.compose.ui.text.style.TextDecoration r62, androidx.compose.ui.text.style.TextAlign r63, long r64, int r66, boolean r67, int r68, java.util.Map r69, kotlin.jvm.functions.Function1 r70, androidx.compose.ui.text.TextStyle r71, androidx.compose.runtime.Composer r72, int r73, int r74, int r75) {
        /*
            r15 = r51
            r13 = r73
            r14 = r74
            r12 = r75
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            r0 = 224529679(0xd620d0f, float:6.9657345E-31)
            r1 = r72
            androidx.compose.runtime.Composer r11 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(Text)P(14,9,0:c#ui.graphics.Color,2:c#ui.unit.TextUnit,3:c#ui.text.font.FontStyle,4!1,6:c#ui.unit.TextUnit,16,15:c#ui.text.style.TextAlign,7:c#ui.unit.TextUnit,11:c#ui.text.style.TextOverflow,12,8)315@13586L7,317@13602L345:Text.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r1)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0023
            r1 = r13 | 6
            goto L_0x0033
        L_0x0023:
            r1 = r13 & 14
            if (r1 != 0) goto L_0x0032
            boolean r1 = r11.changed((java.lang.Object) r15)
            if (r1 == 0) goto L_0x002f
            r1 = 4
            goto L_0x0030
        L_0x002f:
            r1 = 2
        L_0x0030:
            r1 = r1 | r13
            goto L_0x0033
        L_0x0032:
            r1 = r13
        L_0x0033:
            r4 = r12 & 2
            if (r4 == 0) goto L_0x003a
            r1 = r1 | 48
            goto L_0x004d
        L_0x003a:
            r7 = r13 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x004d
            r7 = r52
            boolean r8 = r11.changed((java.lang.Object) r7)
            if (r8 == 0) goto L_0x0049
            r8 = 32
            goto L_0x004b
        L_0x0049:
            r8 = 16
        L_0x004b:
            r1 = r1 | r8
            goto L_0x004f
        L_0x004d:
            r7 = r52
        L_0x004f:
            r8 = r12 & 4
            if (r8 == 0) goto L_0x0058
            r1 = r1 | 384(0x180, float:5.38E-43)
            r5 = r53
            goto L_0x006b
        L_0x0058:
            r2 = r13 & 896(0x380, float:1.256E-42)
            r5 = r53
            if (r2 != 0) goto L_0x006b
            boolean r17 = r11.changed((long) r5)
            if (r17 == 0) goto L_0x0067
            r17 = 256(0x100, float:3.59E-43)
            goto L_0x0069
        L_0x0067:
            r17 = 128(0x80, float:1.794E-43)
        L_0x0069:
            r1 = r1 | r17
        L_0x006b:
            r17 = r12 & 8
            r18 = 2048(0x800, float:2.87E-42)
            r19 = 1024(0x400, float:1.435E-42)
            if (r17 == 0) goto L_0x0078
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            r9 = r55
            goto L_0x008b
        L_0x0078:
            r2 = r13 & 7168(0x1c00, float:1.0045E-41)
            r9 = r55
            if (r2 != 0) goto L_0x008b
            boolean r22 = r11.changed((long) r9)
            if (r22 == 0) goto L_0x0087
            r22 = r18
            goto L_0x0089
        L_0x0087:
            r22 = r19
        L_0x0089:
            r1 = r1 | r22
        L_0x008b:
            r22 = r12 & 16
            if (r22 == 0) goto L_0x0094
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            r3 = r57
            goto L_0x00aa
        L_0x0094:
            r24 = 57344(0xe000, float:8.0356E-41)
            r24 = r13 & r24
            r3 = r57
            if (r24 != 0) goto L_0x00aa
            boolean r25 = r11.changed((java.lang.Object) r3)
            if (r25 == 0) goto L_0x00a6
            r25 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a8
        L_0x00a6:
            r25 = 8192(0x2000, float:1.14794E-41)
        L_0x00a8:
            r1 = r1 | r25
        L_0x00aa:
            r25 = r12 & 32
            r26 = 458752(0x70000, float:6.42848E-40)
            r27 = 65536(0x10000, float:9.18355E-41)
            if (r25 == 0) goto L_0x00b9
            r28 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r28
            r0 = r58
            goto L_0x00cc
        L_0x00b9:
            r28 = r13 & r26
            r0 = r58
            if (r28 != 0) goto L_0x00cc
            boolean r29 = r11.changed((java.lang.Object) r0)
            if (r29 == 0) goto L_0x00c8
            r29 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ca
        L_0x00c8:
            r29 = r27
        L_0x00ca:
            r1 = r1 | r29
        L_0x00cc:
            r29 = r12 & 64
            r30 = 3670016(0x380000, float:5.142788E-39)
            if (r29 == 0) goto L_0x00d9
            r31 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r31
            r2 = r59
            goto L_0x00ec
        L_0x00d9:
            r31 = r13 & r30
            r2 = r59
            if (r31 != 0) goto L_0x00ec
            boolean r32 = r11.changed((java.lang.Object) r2)
            if (r32 == 0) goto L_0x00e8
            r32 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ea
        L_0x00e8:
            r32 = 524288(0x80000, float:7.34684E-40)
        L_0x00ea:
            r1 = r1 | r32
        L_0x00ec:
            r0 = r12 & 128(0x80, float:1.794E-43)
            r32 = 29360128(0x1c00000, float:7.052966E-38)
            if (r0 == 0) goto L_0x00f9
            r33 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r33
            r2 = r60
            goto L_0x010c
        L_0x00f9:
            r33 = r13 & r32
            r2 = r60
            if (r33 != 0) goto L_0x010c
            boolean r33 = r11.changed((long) r2)
            if (r33 == 0) goto L_0x0108
            r33 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x010a
        L_0x0108:
            r33 = 4194304(0x400000, float:5.877472E-39)
        L_0x010a:
            r1 = r1 | r33
        L_0x010c:
            r2 = r12 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x0114
            r3 = 100663296(0x6000000, float:2.4074124E-35)
            r1 = r1 | r3
            goto L_0x0129
        L_0x0114:
            r3 = 234881024(0xe000000, float:1.5777218E-30)
            r3 = r3 & r13
            if (r3 != 0) goto L_0x0129
            r3 = r62
            boolean r33 = r11.changed((java.lang.Object) r3)
            if (r33 == 0) goto L_0x0124
            r33 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0126
        L_0x0124:
            r33 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0126:
            r1 = r1 | r33
            goto L_0x012b
        L_0x0129:
            r3 = r62
        L_0x012b:
            r3 = r12 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x0136
            r33 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r1 | r33
            r5 = r63
            goto L_0x014a
        L_0x0136:
            r33 = 1879048192(0x70000000, float:1.58456325E29)
            r33 = r13 & r33
            r5 = r63
            if (r33 != 0) goto L_0x014a
            boolean r6 = r11.changed((java.lang.Object) r5)
            if (r6 == 0) goto L_0x0147
            r6 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0149
        L_0x0147:
            r6 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0149:
            r1 = r1 | r6
        L_0x014a:
            r6 = r12 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L_0x0153
            r24 = r14 | 6
            r9 = r64
            goto L_0x0169
        L_0x0153:
            r33 = r14 & 14
            r9 = r64
            if (r33 != 0) goto L_0x0167
            boolean r33 = r11.changed((long) r9)
            if (r33 == 0) goto L_0x0162
            r24 = 4
            goto L_0x0164
        L_0x0162:
            r24 = 2
        L_0x0164:
            r24 = r14 | r24
            goto L_0x0169
        L_0x0167:
            r24 = r14
        L_0x0169:
            r5 = r12 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x0170
            r24 = r24 | 48
            goto L_0x0183
        L_0x0170:
            r33 = r14 & 112(0x70, float:1.57E-43)
            r7 = r66
            if (r33 != 0) goto L_0x0183
            boolean r33 = r11.changed((int) r7)
            if (r33 == 0) goto L_0x017f
            r16 = 32
            goto L_0x0181
        L_0x017f:
            r16 = 16
        L_0x0181:
            r24 = r24 | r16
        L_0x0183:
            r7 = r24
            r9 = r12 & 4096(0x1000, float:5.74E-42)
            if (r9 == 0) goto L_0x018c
            r7 = r7 | 384(0x180, float:5.38E-43)
            goto L_0x01a0
        L_0x018c:
            r10 = r14 & 896(0x380, float:1.256E-42)
            if (r10 != 0) goto L_0x01a0
            r10 = r67
            boolean r16 = r11.changed((boolean) r10)
            if (r16 == 0) goto L_0x019b
            r23 = 256(0x100, float:3.59E-43)
            goto L_0x019d
        L_0x019b:
            r23 = 128(0x80, float:1.794E-43)
        L_0x019d:
            r7 = r7 | r23
            goto L_0x01a2
        L_0x01a0:
            r10 = r67
        L_0x01a2:
            r10 = r12 & 8192(0x2000, float:1.14794E-41)
            if (r10 == 0) goto L_0x01a9
            r7 = r7 | 3072(0xc00, float:4.305E-42)
            goto L_0x01bb
        L_0x01a9:
            r15 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r15 != 0) goto L_0x01bb
            r15 = r68
            boolean r16 = r11.changed((int) r15)
            if (r16 == 0) goto L_0x01b6
            goto L_0x01b8
        L_0x01b6:
            r18 = r19
        L_0x01b8:
            r7 = r7 | r18
            goto L_0x01bd
        L_0x01bb:
            r15 = r68
        L_0x01bd:
            r15 = r12 & 16384(0x4000, float:2.2959E-41)
            if (r15 == 0) goto L_0x01c3
            r7 = r7 | 8192(0x2000, float:1.14794E-41)
        L_0x01c3:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r12 & r16
            if (r16 == 0) goto L_0x01cf
            r18 = 196608(0x30000, float:2.75506E-40)
            r7 = r7 | r18
            goto L_0x01e5
        L_0x01cf:
            r18 = r14 & r26
            if (r18 != 0) goto L_0x01e5
            r18 = r10
            r10 = r70
            boolean r19 = r11.changedInstance(r10)
            if (r19 == 0) goto L_0x01e0
            r19 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01e2
        L_0x01e0:
            r19 = r27
        L_0x01e2:
            r7 = r7 | r19
            goto L_0x01e9
        L_0x01e5:
            r18 = r10
            r10 = r70
        L_0x01e9:
            r19 = r14 & r30
            if (r19 != 0) goto L_0x0201
            r19 = r12 & r27
            r10 = r71
            if (r19 != 0) goto L_0x01fc
            boolean r19 = r11.changed((java.lang.Object) r10)
            if (r19 == 0) goto L_0x01fc
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x01fe
        L_0x01fc:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x01fe:
            r7 = r7 | r19
            goto L_0x0203
        L_0x0201:
            r10 = r71
        L_0x0203:
            r10 = 16384(0x4000, float:2.2959E-41)
            if (r15 != r10) goto L_0x0247
            r10 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r10 = r10 & r1
            r14 = 306783378(0x12492492, float:6.3469493E-28)
            if (r10 != r14) goto L_0x0247
            r10 = 2995931(0x2db6db, float:4.198194E-39)
            r10 = r10 & r7
            r14 = 599186(0x92492, float:8.39638E-40)
            if (r10 != r14) goto L_0x0247
            boolean r10 = r11.getSkipping()
            if (r10 != 0) goto L_0x0220
            goto L_0x0247
        L_0x0220:
            r11.skipToGroupEnd()
            r2 = r52
            r3 = r53
            r5 = r55
            r7 = r57
            r8 = r58
            r9 = r59
            r12 = r62
            r13 = r63
            r14 = r64
            r16 = r66
            r17 = r67
            r18 = r68
            r19 = r69
            r20 = r70
            r21 = r71
            r26 = r11
            r10 = r60
            goto L_0x03f1
        L_0x0247:
            r11.startDefaults()
            r10 = r13 & 1
            if (r10 == 0) goto L_0x0282
            boolean r10 = r11.getDefaultsInvalid()
            if (r10 == 0) goto L_0x0255
            goto L_0x0282
        L_0x0255:
            r11.skipToGroupEnd()
            r0 = r12 & r27
            if (r0 == 0) goto L_0x0260
            r0 = -3670017(0xffffffffffc7ffff, float:NaN)
            r7 = r7 & r0
        L_0x0260:
            r27 = r52
            r33 = r53
            r35 = r55
            r29 = r57
            r31 = r58
            r37 = r59
            r38 = r60
            r40 = r62
            r41 = r63
            r42 = r64
            r44 = r66
            r45 = r67
            r46 = r68
            r47 = r69
            r48 = r70
            r49 = r71
            goto L_0x034f
        L_0x0282:
            if (r4 == 0) goto L_0x0289
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r4 = (androidx.compose.ui.Modifier) r4
            goto L_0x028b
        L_0x0289:
            r4 = r52
        L_0x028b:
            if (r8 == 0) goto L_0x0294
            androidx.compose.ui.graphics.Color$Companion r8 = androidx.compose.ui.graphics.Color.Companion
            long r19 = r8.m2857getUnspecified0d7_KjU()
            goto L_0x0296
        L_0x0294:
            r19 = r53
        L_0x0296:
            if (r17 == 0) goto L_0x029f
            androidx.compose.ui.unit.TextUnit$Companion r8 = androidx.compose.ui.unit.TextUnit.Companion
            long r23 = r8.m5818getUnspecifiedXSAIIZE()
            goto L_0x02a1
        L_0x029f:
            r23 = r55
        L_0x02a1:
            r8 = 0
            if (r22 == 0) goto L_0x02a6
            r10 = r8
            goto L_0x02a8
        L_0x02a6:
            r10 = r57
        L_0x02a8:
            if (r25 == 0) goto L_0x02ac
            r14 = r8
            goto L_0x02ae
        L_0x02ac:
            r14 = r58
        L_0x02ae:
            if (r29 == 0) goto L_0x02b3
            r17 = r8
            goto L_0x02b5
        L_0x02b3:
            r17 = r59
        L_0x02b5:
            if (r0 == 0) goto L_0x02be
            androidx.compose.ui.unit.TextUnit$Companion r0 = androidx.compose.ui.unit.TextUnit.Companion
            long r21 = r0.m5818getUnspecifiedXSAIIZE()
            goto L_0x02c0
        L_0x02be:
            r21 = r60
        L_0x02c0:
            if (r2 == 0) goto L_0x02c4
            r0 = r8
            goto L_0x02c6
        L_0x02c4:
            r0 = r62
        L_0x02c6:
            if (r3 == 0) goto L_0x02c9
            goto L_0x02cb
        L_0x02c9:
            r8 = r63
        L_0x02cb:
            if (r6 == 0) goto L_0x02d4
            androidx.compose.ui.unit.TextUnit$Companion r2 = androidx.compose.ui.unit.TextUnit.Companion
            long r2 = r2.m5818getUnspecifiedXSAIIZE()
            goto L_0x02d6
        L_0x02d4:
            r2 = r64
        L_0x02d6:
            if (r5 == 0) goto L_0x02df
            androidx.compose.ui.text.style.TextOverflow$Companion r5 = androidx.compose.ui.text.style.TextOverflow.Companion
            int r5 = r5.m5555getClipgIe3tQ8()
            goto L_0x02e1
        L_0x02df:
            r5 = r66
        L_0x02e1:
            if (r9 == 0) goto L_0x02e5
            r6 = 1
            goto L_0x02e7
        L_0x02e5:
            r6 = r67
        L_0x02e7:
            if (r18 == 0) goto L_0x02ed
            r9 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x02ef
        L_0x02ed:
            r9 = r68
        L_0x02ef:
            if (r15 == 0) goto L_0x02f6
            java.util.Map r15 = kotlin.collections.MapsKt.emptyMap()
            goto L_0x02f8
        L_0x02f6:
            r15 = r69
        L_0x02f8:
            if (r16 == 0) goto L_0x02ff
            androidx.compose.material3.TextKt$Text$7 r16 = androidx.compose.material3.TextKt$Text$7.INSTANCE
            kotlin.jvm.functions.Function1 r16 = (kotlin.jvm.functions.Function1) r16
            goto L_0x0301
        L_0x02ff:
            r16 = r70
        L_0x0301:
            r18 = r12 & r27
            if (r18 == 0) goto L_0x032b
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.text.TextStyle> r18 = LocalTextStyle
            r52 = r0
            r0 = r18
            androidx.compose.runtime.CompositionLocal r0 = (androidx.compose.runtime.CompositionLocal) r0
            r53 = r2
            r2 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r3 = "CC:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r11, r2, r3)
            java.lang.Object r0 = r11.consume(r0)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r11)
            androidx.compose.ui.text.TextStyle r0 = (androidx.compose.ui.text.TextStyle) r0
            r2 = -3670017(0xffffffffffc7ffff, float:NaN)
            r7 = r7 & r2
            r40 = r52
            r42 = r53
            r49 = r0
            goto L_0x0335
        L_0x032b:
            r52 = r0
            r53 = r2
            r40 = r52
            r42 = r53
            r49 = r71
        L_0x0335:
            r27 = r4
            r44 = r5
            r45 = r6
            r41 = r8
            r46 = r9
            r29 = r10
            r31 = r14
            r47 = r15
            r48 = r16
            r37 = r17
            r33 = r19
            r38 = r21
            r35 = r23
        L_0x034f:
            r11.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0361
            java.lang.String r0 = "androidx.compose.material3.Text (Text.kt:298)"
            r2 = 224529679(0xd620d0f, float:6.9657345E-31)
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r1, r7, r0)
        L_0x0361:
            r18 = 1
            r0 = r1 & 14
            r2 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r1
            r0 = r0 | r2
            r2 = r1 & r26
            r0 = r0 | r2
            r2 = r1 & r30
            r0 = r0 | r2
            r2 = r1 & r32
            r0 = r0 | r2
            r2 = 234881024(0xe000000, float:1.5777218E-30)
            r2 = r2 & r1
            r0 = r0 | r2
            r2 = 1879048192(0x70000000, float:1.58456325E29)
            r1 = r1 & r2
            r23 = r0 | r1
            r0 = 286720(0x46000, float:4.0178E-40)
            r1 = r7 & 14
            r0 = r0 | r1
            r1 = r7 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            r1 = r7 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            r1 = r7 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r1
            int r1 = r7 << 3
            r2 = r1 & r30
            r0 = r0 | r2
            r1 = r1 & r32
            r24 = r0 | r1
            r25 = 0
            r0 = r51
            r1 = r27
            r2 = r33
            r4 = r35
            r6 = r29
            r7 = r31
            r8 = r37
            r9 = r38
            r26 = r11
            r11 = r40
            r12 = r41
            r13 = r42
            r15 = r44
            r16 = r45
            r17 = r46
            r19 = r47
            r20 = r48
            r21 = r49
            r22 = r26
            m1728TextIbK3jfQ(r0, r1, r2, r4, r6, r7, r8, r9, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x03d1
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x03d1:
            r2 = r27
            r7 = r29
            r8 = r31
            r3 = r33
            r5 = r35
            r9 = r37
            r10 = r38
            r12 = r40
            r13 = r41
            r14 = r42
            r16 = r44
            r17 = r45
            r18 = r46
            r19 = r47
            r20 = r48
            r21 = r49
        L_0x03f1:
            androidx.compose.runtime.ScopeUpdateScope r1 = r26.endRestartGroup()
            if (r1 != 0) goto L_0x03f8
            goto L_0x0412
        L_0x03f8:
            androidx.compose.material3.TextKt$Text$8 r25 = new androidx.compose.material3.TextKt$Text$8
            r0 = r25
            r50 = r1
            r1 = r51
            r22 = r73
            r23 = r74
            r24 = r75
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r0 = r25
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1 = r50
            r1.updateScope(r0)
        L_0x0412:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextKt.m1726Text4IGK_g(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontFamily, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.text.style.TextAlign, long, int, boolean, int, java.util.Map, kotlin.jvm.functions.Function1, androidx.compose.ui.text.TextStyle, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final void ProvideTextStyle(TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(textStyle, "value");
        Intrinsics.checkNotNullParameter(function2, "content");
        Composer startRestartGroup = composer.startRestartGroup(-460300127);
        ComposerKt.sourceInformation(startRestartGroup, "C(ProvideTextStyle)P(1)358@14903L7,359@14928L80:Text.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed((Object) textStyle) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-460300127, i2, -1, "androidx.compose.material3.ProvideTextStyle (Text.kt:357)");
            }
            ProvidableCompositionLocal<TextStyle> providableCompositionLocal = LocalTextStyle;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(providableCompositionLocal);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{providableCompositionLocal.provides(((TextStyle) consume).merge(textStyle))}, function2, startRestartGroup, (i2 & 112) | 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TextKt$ProvideTextStyle$1(textStyle, function2, i));
        }
    }
}
