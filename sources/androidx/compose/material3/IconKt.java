package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.IconButtonTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.PainterModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a;\u0010\u0002\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\u000f\u001a;\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\u0012\u001a\u0014\u0010\u0013\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0002\u001a\u0019\u0010\u0014\u001a\u00020\u0015*\u00020\u0016H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"DefaultIconSizeModifier", "Landroidx/compose/ui/Modifier;", "Icon", "", "bitmap", "Landroidx/compose/ui/graphics/ImageBitmap;", "contentDescription", "", "modifier", "tint", "Landroidx/compose/ui/graphics/Color;", "Icon-ww6aTOc", "(Landroidx/compose/ui/graphics/ImageBitmap;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "imageVector", "Landroidx/compose/ui/graphics/vector/ImageVector;", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "defaultSizeFor", "isInfinite", "", "Landroidx/compose/ui/geometry/Size;", "isInfinite-uvyYCjk", "(J)Z", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Icon.kt */
public final class IconKt {
    private static final Modifier DefaultIconSizeModifier = SizeKt.m563size3ABfNKs(Modifier.Companion, IconButtonTokens.INSTANCE.m2115getIconSizeD9Ej5fM());

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* renamed from: Icon-ww6aTOc  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1389Iconww6aTOc(androidx.compose.ui.graphics.vector.ImageVector r17, java.lang.String r18, androidx.compose.ui.Modifier r19, long r20, androidx.compose.runtime.Composer r22, int r23, int r24) {
        /*
            r1 = r17
            r6 = r23
            java.lang.String r0 = "imageVector"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = -126890956(0xfffffffff86fcc34, float:-1.9454698E34)
            r2 = r22
            androidx.compose.runtime.Composer r2 = r2.startRestartGroup(r0)
            java.lang.String r3 = "C(Icon)P(1!,3:c#ui.graphics.Color)64@3206L7,67@3246L34,66@3222L163:Icon.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r3)
            r3 = r24 & 1
            if (r3 == 0) goto L_0x001f
            r3 = r6 | 6
            goto L_0x002f
        L_0x001f:
            r3 = r6 & 14
            if (r3 != 0) goto L_0x002e
            boolean r3 = r2.changed((java.lang.Object) r1)
            if (r3 == 0) goto L_0x002b
            r3 = 4
            goto L_0x002c
        L_0x002b:
            r3 = 2
        L_0x002c:
            r3 = r3 | r6
            goto L_0x002f
        L_0x002e:
            r3 = r6
        L_0x002f:
            r4 = r24 & 2
            if (r4 == 0) goto L_0x0036
            r3 = r3 | 48
            goto L_0x0049
        L_0x0036:
            r4 = r6 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0049
            r4 = r18
            boolean r5 = r2.changed((java.lang.Object) r4)
            if (r5 == 0) goto L_0x0045
            r5 = 32
            goto L_0x0047
        L_0x0045:
            r5 = 16
        L_0x0047:
            r3 = r3 | r5
            goto L_0x004b
        L_0x0049:
            r4 = r18
        L_0x004b:
            r5 = r24 & 4
            if (r5 == 0) goto L_0x0052
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0065
        L_0x0052:
            r7 = r6 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0065
            r7 = r19
            boolean r8 = r2.changed((java.lang.Object) r7)
            if (r8 == 0) goto L_0x0061
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r3 = r3 | r8
            goto L_0x0067
        L_0x0065:
            r7 = r19
        L_0x0067:
            r8 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0080
            r8 = r24 & 8
            if (r8 != 0) goto L_0x007a
            r8 = r20
            boolean r10 = r2.changed((long) r8)
            if (r10 == 0) goto L_0x007c
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x007e
        L_0x007a:
            r8 = r20
        L_0x007c:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x007e:
            r3 = r3 | r10
            goto L_0x0082
        L_0x0080:
            r8 = r20
        L_0x0082:
            r10 = r3 & 5851(0x16db, float:8.199E-42)
            r11 = 1170(0x492, float:1.64E-42)
            if (r10 != r11) goto L_0x0095
            boolean r10 = r2.getSkipping()
            if (r10 != 0) goto L_0x008f
            goto L_0x0095
        L_0x008f:
            r2.skipToGroupEnd()
            r3 = r7
            goto L_0x0113
        L_0x0095:
            r2.startDefaults()
            r10 = r6 & 1
            if (r10 == 0) goto L_0x00ae
            boolean r10 = r2.getDefaultsInvalid()
            if (r10 == 0) goto L_0x00a3
            goto L_0x00ae
        L_0x00a3:
            r2.skipToGroupEnd()
            r5 = r24 & 8
            if (r5 == 0) goto L_0x00ac
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00ac:
            r5 = r7
            goto L_0x00d9
        L_0x00ae:
            if (r5 == 0) goto L_0x00b5
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r5 = (androidx.compose.ui.Modifier) r5
            goto L_0x00b6
        L_0x00b5:
            r5 = r7
        L_0x00b6:
            r7 = r24 & 8
            if (r7 == 0) goto L_0x00d9
            androidx.compose.runtime.ProvidableCompositionLocal r7 = androidx.compose.material3.ContentColorKt.getLocalContentColor()
            androidx.compose.runtime.CompositionLocal r7 = (androidx.compose.runtime.CompositionLocal) r7
            r8 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r9 = "CC:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r8, r9)
            java.lang.Object r7 = r2.consume(r7)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.ui.graphics.Color r7 = (androidx.compose.ui.graphics.Color) r7
            long r7 = r7.m2831unboximpl()
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            r15 = r7
            goto L_0x00da
        L_0x00d9:
            r15 = r8
        L_0x00da:
            r2.endDefaults()
            boolean r7 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r7 == 0) goto L_0x00ea
            r7 = -1
            java.lang.String r8 = "androidx.compose.material3.Icon (Icon.kt:60)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r3, r7, r8)
        L_0x00ea:
            r0 = r3 & 14
            androidx.compose.ui.graphics.vector.VectorPainter r0 = androidx.compose.ui.graphics.vector.VectorPainterKt.rememberVectorPainter(r1, r2, r0)
            r7 = r0
            androidx.compose.ui.graphics.painter.Painter r7 = (androidx.compose.ui.graphics.painter.Painter) r7
            int r0 = androidx.compose.ui.graphics.vector.VectorPainter.$stable
            r8 = r3 & 112(0x70, float:1.57E-43)
            r0 = r0 | r8
            r8 = r3 & 896(0x380, float:1.256E-42)
            r0 = r0 | r8
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r13 = r0 | r3
            r14 = 0
            r8 = r18
            r9 = r5
            r10 = r15
            r12 = r2
            m1388Iconww6aTOc((androidx.compose.ui.graphics.painter.Painter) r7, (java.lang.String) r8, (androidx.compose.ui.Modifier) r9, (long) r10, (androidx.compose.runtime.Composer) r12, (int) r13, (int) r14)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0111
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0111:
            r3 = r5
            r8 = r15
        L_0x0113:
            androidx.compose.runtime.ScopeUpdateScope r10 = r2.endRestartGroup()
            if (r10 != 0) goto L_0x011a
            goto L_0x012e
        L_0x011a:
            androidx.compose.material3.IconKt$Icon$1 r11 = new androidx.compose.material3.IconKt$Icon$1
            r0 = r11
            r1 = r17
            r2 = r18
            r4 = r8
            r6 = r23
            r7 = r24
            r0.<init>(r1, r2, r3, r4, r6, r7)
            kotlin.jvm.functions.Function2 r11 = (kotlin.jvm.functions.Function2) r11
            r10.updateScope(r11)
        L_0x012e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.IconKt.m1389Iconww6aTOc(androidx.compose.ui.graphics.vector.ImageVector, java.lang.String, androidx.compose.ui.Modifier, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: Icon-ww6aTOc  reason: not valid java name */
    public static final void m1387Iconww6aTOc(ImageBitmap imageBitmap, String str, Modifier modifier, long j, Composer composer, int i, int i2) {
        long j2;
        int i3;
        ImageBitmap imageBitmap2 = imageBitmap;
        Intrinsics.checkNotNullParameter(imageBitmap2, "bitmap");
        Composer startRestartGroup = composer.startRestartGroup(-1092052280);
        ComposerKt.sourceInformation(startRestartGroup, "C(Icon)P(!,3:c#ui.graphics.Color)99@4907L7,101@4937L42,102@4984L136:Icon.kt#uh7d8r");
        Modifier modifier2 = (i2 & 4) != 0 ? Modifier.Companion : modifier;
        if ((i2 & 8) != 0) {
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(ContentColorKt.getLocalContentColor());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            j2 = ((Color) consume).m2831unboximpl();
            i3 = i & -7169;
        } else {
            j2 = j;
            i3 = i;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1092052280, i3, -1, "androidx.compose.material3.Icon (Icon.kt:95)");
        }
        startRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed = startRestartGroup.changed((Object) imageBitmap2);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            BitmapPainter bitmapPainter = new BitmapPainter(imageBitmap, 0, 0, 6, (DefaultConstructorMarker) null);
            startRestartGroup.updateRememberedValue(bitmapPainter);
            rememberedValue = bitmapPainter;
        }
        startRestartGroup.endReplaceableGroup();
        Composer composer2 = startRestartGroup;
        m1388Iconww6aTOc((Painter) (BitmapPainter) rememberedValue, str, modifier2, j2, startRestartGroup, (i3 & 112) | 8 | (i3 & 896) | (i3 & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new IconKt$Icon$2(imageBitmap, str, modifier2, j2, i, i2));
        }
    }

    /* renamed from: Icon-ww6aTOc  reason: not valid java name */
    public static final void m1388Iconww6aTOc(Painter painter, String str, Modifier modifier, long j, Composer composer, int i, int i2) {
        long j2;
        int i3;
        Modifier modifier2;
        Painter painter2 = painter;
        String str2 = str;
        Intrinsics.checkNotNullParameter(painter2, "painter");
        Composer startRestartGroup = composer.startRestartGroup(-2142239481);
        ComposerKt.sourceInformation(startRestartGroup, "C(Icon)P(2!,3:c#ui.graphics.Color)135@6639L7,147@6998L217:Icon.kt#uh7d8r");
        Modifier modifier3 = (i2 & 4) != 0 ? Modifier.Companion : modifier;
        if ((i2 & 8) != 0) {
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(ContentColorKt.getLocalContentColor());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            i3 = i & -7169;
            j2 = ((Color) consume).m2831unboximpl();
        } else {
            j2 = j;
            i3 = i;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2142239481, i3, -1, "androidx.compose.material3.Icon (Icon.kt:131)");
        }
        ColorFilter r6 = Color.m2822equalsimpl0(j2, Color.Companion.m2857getUnspecified0d7_KjU()) ? null : ColorFilter.Companion.m2862tintxETnrds$default(ColorFilter.Companion, j2, 0, 2, (Object) null);
        startRestartGroup.startReplaceableGroup(69356817);
        ComposerKt.sourceInformation(startRestartGroup, "140@6830L115");
        if (str2 != null) {
            Modifier modifier4 = Modifier.Companion;
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed((Object) str2);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new IconKt$Icon$semantics$1$1(str2);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            modifier2 = SemanticsModifierKt.semantics$default(modifier4, false, (Function1) rememberedValue, 1, (Object) null);
        } else {
            modifier2 = Modifier.Companion;
        }
        startRestartGroup.endReplaceableGroup();
        long j3 = j2;
        BoxKt.Box(PainterModifierKt.paint$default(defaultSizeFor(GraphicsLayerModifierKt.toolingGraphicsLayer(modifier3), painter2), painter, false, (Alignment) null, ContentScale.Companion.getFit(), 0.0f, r6, 22, (Object) null).then(modifier2), startRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new IconKt$Icon$3(painter, str, modifier3, j3, i, i2));
        }
    }

    private static final Modifier defaultSizeFor(Modifier modifier, Painter painter) {
        return modifier.then((Size.m2637equalsimpl0(painter.m3524getIntrinsicSizeNHjbRc(), Size.Companion.m2649getUnspecifiedNHjbRc()) || m1390isInfiniteuvyYCjk(painter.m3524getIntrinsicSizeNHjbRc())) ? DefaultIconSizeModifier : Modifier.Companion);
    }

    /* renamed from: isInfinite-uvyYCjk  reason: not valid java name */
    private static final boolean m1390isInfiniteuvyYCjk(long j) {
        return Float.isInfinite(Size.m2641getWidthimpl(j)) && Float.isInfinite(Size.m2638getHeightimpl(j));
    }
}
