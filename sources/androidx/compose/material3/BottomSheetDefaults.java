package androidx.compose.material3;

import androidx.compose.material3.tokens.ScrimTokens;
import androidx.compose.material3.tokens.SheetBottomTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JG\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020\r2\b\b\u0002\u0010\u001d\u001a\u00020\u0004H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00048Gø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u00020\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\f\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u00048Gø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0006R\u001c\u0010\u0014\u001a\u00020\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0015\u0010\n\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/compose/material3/BottomSheetDefaults;", "", "()V", "ContainerColor", "Landroidx/compose/ui/graphics/Color;", "getContainerColor", "(Landroidx/compose/runtime/Composer;I)J", "Elevation", "Landroidx/compose/ui/unit/Dp;", "getElevation-D9Ej5fM", "()F", "F", "ExpandedShape", "Landroidx/compose/ui/graphics/Shape;", "getExpandedShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "HiddenShape", "getHiddenShape", "ScrimColor", "getScrimColor", "SheetPeekHeight", "getSheetPeekHeight-D9Ej5fM", "DragHandle", "", "modifier", "Landroidx/compose/ui/Modifier;", "width", "height", "shape", "color", "DragHandle-lgZ2HuY", "(Landroidx/compose/ui/Modifier;FFLandroidx/compose/ui/graphics/Shape;JLandroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: SheetDefaults.kt */
public final class BottomSheetDefaults {
    public static final int $stable = 0;
    private static final float Elevation = SheetBottomTokens.INSTANCE.m2290getDockedModalContainerElevationD9Ej5fM();
    public static final BottomSheetDefaults INSTANCE = new BottomSheetDefaults();
    private static final float SheetPeekHeight = Dp.m5626constructorimpl((float) 56);

    /* renamed from: getElevation-D9Ej5fM  reason: not valid java name */
    public final float m1141getElevationD9Ej5fM() {
        return Elevation;
    }

    /* renamed from: getSheetPeekHeight-D9Ej5fM  reason: not valid java name */
    public final float m1142getSheetPeekHeightD9Ej5fM() {
        return SheetPeekHeight;
    }

    private BottomSheetDefaults() {
    }

    public final Shape getHiddenShape(Composer composer, int i) {
        composer.startReplaceableGroup(-1971658024);
        ComposerKt.sourceInformation(composer, "C277@10064L9:SheetDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1971658024, i, -1, "androidx.compose.material3.BottomSheetDefaults.<get-HiddenShape> (SheetDefaults.kt:276)");
        }
        Shape shape = ShapesKt.toShape(SheetBottomTokens.INSTANCE.getDockedMinimizedContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    public final Shape getExpandedShape(Composer composer, int i) {
        composer.startReplaceableGroup(1683783414);
        ComposerKt.sourceInformation(composer, "C282@10274L9:SheetDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1683783414, i, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ExpandedShape> (SheetDefaults.kt:281)");
        }
        Shape shape = ShapesKt.toShape(SheetBottomTokens.INSTANCE.getDockedContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    public final long getContainerColor(Composer composer, int i) {
        composer.startReplaceableGroup(433375448);
        ComposerKt.sourceInformation(composer, "C287@10449L9:SheetDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(433375448, i, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ContainerColor> (SheetDefaults.kt:286)");
        }
        long color = ColorSchemeKt.toColor(SheetBottomTokens.INSTANCE.getDockedContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return color;
    }

    public final long getScrimColor(Composer composer, int i) {
        composer.startReplaceableGroup(-2040719176);
        ComposerKt.sourceInformation(composer, "C295@10745L9:SheetDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2040719176, i, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ScrimColor> (SheetDefaults.kt:294)");
        }
        long r0 = Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(ScrimTokens.INSTANCE.getContainerColor(), composer, 6), 0.32f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return r0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01c4  */
    /* renamed from: DragHandle-lgZ2HuY  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m1140DragHandlelgZ2HuY(androidx.compose.ui.Modifier r25, float r26, float r27, androidx.compose.ui.graphics.Shape r28, long r29, androidx.compose.runtime.Composer r31, int r32, int r33) {
        /*
            r24 = this;
            r8 = r32
            r0 = -1364277227(0xffffffffaeaec815, float:-7.9481456E-11)
            r1 = r31
            androidx.compose.runtime.Composer r1 = r1.startRestartGroup(r0)
            java.lang.String r2 = "C(DragHandle)P(2,4:c#ui.unit.Dp,1:c#ui.unit.Dp,3,0:c#ui.graphics.Color)310@11251L6,311@11333L9,314@11449L51,318@11640L46,315@11509L437:SheetDefaults.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r2)
            r2 = r33 & 1
            if (r2 == 0) goto L_0x001a
            r3 = r8 | 6
            r4 = r3
            r3 = r25
            goto L_0x002e
        L_0x001a:
            r3 = r8 & 14
            if (r3 != 0) goto L_0x002b
            r3 = r25
            boolean r4 = r1.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x0028
            r4 = 4
            goto L_0x0029
        L_0x0028:
            r4 = 2
        L_0x0029:
            r4 = r4 | r8
            goto L_0x002e
        L_0x002b:
            r3 = r25
            r4 = r8
        L_0x002e:
            r5 = r33 & 2
            if (r5 == 0) goto L_0x0035
            r4 = r4 | 48
            goto L_0x0048
        L_0x0035:
            r6 = r8 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0048
            r6 = r26
            boolean r7 = r1.changed((float) r6)
            if (r7 == 0) goto L_0x0044
            r7 = 32
            goto L_0x0046
        L_0x0044:
            r7 = 16
        L_0x0046:
            r4 = r4 | r7
            goto L_0x004a
        L_0x0048:
            r6 = r26
        L_0x004a:
            r7 = r33 & 4
            if (r7 == 0) goto L_0x0051
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x0064
        L_0x0051:
            r9 = r8 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x0064
            r9 = r27
            boolean r10 = r1.changed((float) r9)
            if (r10 == 0) goto L_0x0060
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r4 = r4 | r10
            goto L_0x0066
        L_0x0064:
            r9 = r27
        L_0x0066:
            r10 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r10 != 0) goto L_0x007f
            r10 = r33 & 8
            if (r10 != 0) goto L_0x0079
            r10 = r28
            boolean r11 = r1.changed((java.lang.Object) r10)
            if (r11 == 0) goto L_0x007b
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x0079:
            r10 = r28
        L_0x007b:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r4 = r4 | r11
            goto L_0x0081
        L_0x007f:
            r10 = r28
        L_0x0081:
            r11 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r8
            if (r11 != 0) goto L_0x009c
            r11 = r33 & 16
            if (r11 != 0) goto L_0x0096
            r11 = r29
            boolean r13 = r1.changed((long) r11)
            if (r13 == 0) goto L_0x0098
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009a
        L_0x0096:
            r11 = r29
        L_0x0098:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x009a:
            r4 = r4 | r13
            goto L_0x009e
        L_0x009c:
            r11 = r29
        L_0x009e:
            r13 = 46811(0xb6db, float:6.5596E-41)
            r13 = r13 & r4
            r14 = 9362(0x2492, float:1.3119E-41)
            if (r13 != r14) goto L_0x00b7
            boolean r13 = r1.getSkipping()
            if (r13 != 0) goto L_0x00ad
            goto L_0x00b7
        L_0x00ad:
            r1.skipToGroupEnd()
            r2 = r3
            r3 = r6
            r4 = r9
            r5 = r10
            r6 = r11
            goto L_0x01bd
        L_0x00b7:
            r1.startDefaults()
            r13 = r8 & 1
            r14 = -57345(0xffffffffffff1fff, float:NaN)
            r15 = 6
            if (r13 == 0) goto L_0x00de
            boolean r13 = r1.getDefaultsInvalid()
            if (r13 == 0) goto L_0x00c9
            goto L_0x00de
        L_0x00c9:
            r1.skipToGroupEnd()
            r2 = r33 & 8
            if (r2 == 0) goto L_0x00d2
            r4 = r4 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00d2:
            r2 = r33 & 16
            if (r2 == 0) goto L_0x00d7
            r4 = r4 & r14
        L_0x00d7:
            r2 = r3
        L_0x00d8:
            r5 = r4
            r3 = r9
            r4 = r10
            r22 = r11
            goto L_0x012c
        L_0x00de:
            if (r2 == 0) goto L_0x00e5
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r2 = (androidx.compose.ui.Modifier) r2
            goto L_0x00e6
        L_0x00e5:
            r2 = r3
        L_0x00e6:
            if (r5 == 0) goto L_0x00ef
            androidx.compose.material3.tokens.SheetBottomTokens r3 = androidx.compose.material3.tokens.SheetBottomTokens.INSTANCE
            float r3 = r3.m2289getDockedDragHandleWidthD9Ej5fM()
            r6 = r3
        L_0x00ef:
            if (r7 == 0) goto L_0x00f8
            androidx.compose.material3.tokens.SheetBottomTokens r3 = androidx.compose.material3.tokens.SheetBottomTokens.INSTANCE
            float r3 = r3.m2288getDockedDragHandleHeightD9Ej5fM()
            r9 = r3
        L_0x00f8:
            r3 = r33 & 8
            if (r3 == 0) goto L_0x010b
            androidx.compose.material3.MaterialTheme r3 = androidx.compose.material3.MaterialTheme.INSTANCE
            androidx.compose.material3.Shapes r3 = r3.getShapes(r1, r15)
            androidx.compose.foundation.shape.CornerBasedShape r3 = r3.getExtraLarge()
            androidx.compose.ui.graphics.Shape r3 = (androidx.compose.ui.graphics.Shape) r3
            r4 = r4 & -7169(0xffffffffffffe3ff, float:NaN)
            r10 = r3
        L_0x010b:
            r3 = r33 & 16
            if (r3 == 0) goto L_0x00d8
            androidx.compose.material3.tokens.SheetBottomTokens r3 = androidx.compose.material3.tokens.SheetBottomTokens.INSTANCE
            androidx.compose.material3.tokens.ColorSchemeKeyTokens r3 = r3.getDockedDragHandleColor()
            long r16 = androidx.compose.material3.ColorSchemeKt.toColor(r3, r1, r15)
            r18 = 1053609165(0x3ecccccd, float:0.4)
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 14
            r23 = 0
            long r11 = androidx.compose.ui.graphics.Color.m2820copywmQWz5c$default(r16, r18, r19, r20, r21, r22, r23)
            r4 = r4 & r14
            goto L_0x00d8
        L_0x012c:
            r1.endDefaults()
            boolean r7 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r7 == 0) goto L_0x013c
            r7 = -1
            java.lang.String r9 = "androidx.compose.material3.BottomSheetDefaults.DragHandle (SheetDefaults.kt:306)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r5, r7, r9)
        L_0x013c:
            androidx.compose.material3.Strings$Companion r0 = androidx.compose.material3.Strings.Companion
            int r0 = r0.m1571getBottomSheetDragHandleDescriptionadMyvUU()
            java.lang.String r0 = androidx.compose.material3.Strings_androidKt.m1632getStringNWtq28(r0, r1, r15)
            r7 = 0
            float r9 = androidx.compose.material3.SheetDefaultsKt.DragHandleVerticalPadding
            r10 = 1
            r11 = 0
            androidx.compose.ui.Modifier r7 = androidx.compose.foundation.layout.PaddingKt.m495paddingVpY3zN4$default(r2, r7, r9, r10, r11)
            r9 = 1157296644(0x44faf204, float:2007.563)
            r1.startReplaceableGroup(r9)
            java.lang.String r9 = "CC(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r9)
            boolean r9 = r1.changed((java.lang.Object) r0)
            java.lang.Object r12 = r1.rememberedValue()
            if (r9 != 0) goto L_0x016e
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r9 = r9.getEmpty()
            if (r12 != r9) goto L_0x0179
        L_0x016e:
            androidx.compose.material3.BottomSheetDefaults$DragHandle$1$1 r9 = new androidx.compose.material3.BottomSheetDefaults$DragHandle$1$1
            r9.<init>(r0)
            r12 = r9
            kotlin.jvm.functions.Function1 r12 = (kotlin.jvm.functions.Function1) r12
            r1.updateRememberedValue(r12)
        L_0x0179:
            r1.endReplaceableGroup()
            kotlin.jvm.functions.Function1 r12 = (kotlin.jvm.functions.Function1) r12
            r0 = 0
            androidx.compose.ui.Modifier r9 = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(r7, r0, r12, r10, r11)
            r13 = 0
            r0 = 0
            r16 = 0
            r17 = 0
            androidx.compose.material3.BottomSheetDefaults$DragHandle$2 r7 = new androidx.compose.material3.BottomSheetDefaults$DragHandle$2
            r7.<init>(r6, r3)
            r11 = -1039573072(0xffffffffc2095fb0, float:-34.343445)
            androidx.compose.runtime.internal.ComposableLambda r7 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r1, r11, r10, r7)
            r18 = r7
            kotlin.jvm.functions.Function2 r18 = (kotlin.jvm.functions.Function2) r18
            int r5 = r5 >> r15
            r7 = r5 & 112(0x70, float:1.57E-43)
            r10 = 12582912(0xc00000, float:1.7632415E-38)
            r7 = r7 | r10
            r5 = r5 & 896(0x380, float:1.256E-42)
            r20 = r7 | r5
            r21 = 120(0x78, float:1.68E-43)
            r10 = r4
            r11 = r22
            r15 = r0
            r19 = r1
            androidx.compose.material3.SurfaceKt.m1641SurfaceT9BRK9s(r9, r10, r11, r13, r15, r16, r17, r18, r19, r20, r21)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01b8
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x01b8:
            r5 = r4
            r4 = r3
            r3 = r6
            r6 = r22
        L_0x01bd:
            androidx.compose.runtime.ScopeUpdateScope r10 = r1.endRestartGroup()
            if (r10 != 0) goto L_0x01c4
            goto L_0x01d5
        L_0x01c4:
            androidx.compose.material3.BottomSheetDefaults$DragHandle$3 r11 = new androidx.compose.material3.BottomSheetDefaults$DragHandle$3
            r0 = r11
            r1 = r24
            r8 = r32
            r9 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r9)
            kotlin.jvm.functions.Function2 r11 = (kotlin.jvm.functions.Function2) r11
            r10.updateScope(r11)
        L_0x01d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.BottomSheetDefaults.m1140DragHandlelgZ2HuY(androidx.compose.ui.Modifier, float, float, androidx.compose.ui.graphics.Shape, long, androidx.compose.runtime.Composer, int, int):void");
    }
}
