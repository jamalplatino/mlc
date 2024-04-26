package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.tokens.OutlinedTextFieldTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b)\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JS\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u0004H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0002\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020!2\u0011\u0010\"\u001a\r\u0012\u0004\u0012\u00020\u00130#¢\u0006\u0002\b$2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00020'2\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u0015\b\u0002\u0010(\u001a\u000f\u0012\u0004\u0012\u00020\u0013\u0018\u00010#¢\u0006\u0002\b$2\u0015\b\u0002\u0010)\u001a\u000f\u0012\u0004\u0012\u00020\u0013\u0018\u00010#¢\u0006\u0002\b$2\u0015\b\u0002\u0010*\u001a\u000f\u0012\u0004\u0012\u00020\u0013\u0018\u00010#¢\u0006\u0002\b$2\u0015\b\u0002\u0010+\u001a\u000f\u0012\u0004\u0012\u00020\u0013\u0018\u00010#¢\u0006\u0002\b$2\u0015\b\u0002\u0010,\u001a\u000f\u0012\u0004\u0012\u00020\u0013\u0018\u00010#¢\u0006\u0002\b$2\u0015\b\u0002\u0010-\u001a\u000f\u0012\u0004\u0012\u00020\u0013\u0018\u00010#¢\u0006\u0002\b$2\u0015\b\u0002\u0010.\u001a\u000f\u0012\u0004\u0012\u00020\u0013\u0018\u00010#¢\u0006\u0002\b$2\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010/\u001a\u0002002\u0013\b\u0002\u00101\u001a\r\u0012\u0004\u0012\u00020\u00130#¢\u0006\u0002\b$H\u0007¢\u0006\u0002\u00102JÃ\u0003\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u0002042\b\b\u0002\u00106\u001a\u0002042\b\b\u0002\u00107\u001a\u0002042\b\b\u0002\u00108\u001a\u0002042\b\b\u0002\u00109\u001a\u0002042\b\b\u0002\u0010:\u001a\u0002042\b\b\u0002\u0010;\u001a\u0002042\b\b\u0002\u0010<\u001a\u0002042\b\b\u0002\u0010=\u001a\u0002042\b\b\u0002\u0010>\u001a\u00020?2\b\b\u0002\u0010@\u001a\u0002042\b\b\u0002\u0010A\u001a\u0002042\b\b\u0002\u0010B\u001a\u0002042\b\b\u0002\u0010C\u001a\u0002042\b\b\u0002\u0010D\u001a\u0002042\b\b\u0002\u0010E\u001a\u0002042\b\b\u0002\u0010F\u001a\u0002042\b\b\u0002\u0010G\u001a\u0002042\b\b\u0002\u0010H\u001a\u0002042\b\b\u0002\u0010I\u001a\u0002042\b\b\u0002\u0010J\u001a\u0002042\b\b\u0002\u0010K\u001a\u0002042\b\b\u0002\u0010L\u001a\u0002042\b\b\u0002\u0010M\u001a\u0002042\b\b\u0002\u0010N\u001a\u0002042\b\b\u0002\u0010O\u001a\u0002042\b\b\u0002\u0010P\u001a\u0002042\b\b\u0002\u0010Q\u001a\u0002042\b\b\u0002\u0010R\u001a\u0002042\b\b\u0002\u0010S\u001a\u0002042\b\b\u0002\u0010T\u001a\u0002042\b\b\u0002\u0010U\u001a\u0002042\b\b\u0002\u0010V\u001a\u0002042\b\b\u0002\u0010W\u001a\u0002042\b\b\u0002\u0010X\u001a\u0002042\b\b\u0002\u0010Y\u001a\u0002042\b\b\u0002\u0010Z\u001a\u0002042\b\b\u0002\u0010[\u001a\u0002042\b\b\u0002\u0010\\\u001a\u0002042\b\b\u0002\u0010]\u001a\u0002042\b\b\u0002\u0010^\u001a\u0002042\b\b\u0002\u0010_\u001a\u000204H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b`\u0010aJ;\u0010/\u001a\u0002002\b\b\u0002\u0010b\u001a\u00020\u00042\b\b\u0002\u0010c\u001a\u00020\u00042\b\b\u0002\u0010d\u001a\u00020\u00042\b\b\u0002\u0010e\u001a\u00020\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bf\u0010gR\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u001c\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u0011\u0010\u000e\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006h"}, d2 = {"Landroidx/compose/material3/OutlinedTextFieldDefaults;", "", "()V", "FocusedBorderThickness", "Landroidx/compose/ui/unit/Dp;", "getFocusedBorderThickness-D9Ej5fM", "()F", "F", "MinHeight", "getMinHeight-D9Ej5fM", "MinWidth", "getMinWidth-D9Ej5fM", "UnfocusedBorderThickness", "getUnfocusedBorderThickness-D9Ej5fM", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "ContainerBox", "", "enabled", "", "isError", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "colors", "Landroidx/compose/material3/TextFieldColors;", "focusedBorderThickness", "unfocusedBorderThickness", "ContainerBox-nbWgWpA", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/ui/graphics/Shape;FFLandroidx/compose/runtime/Composer;II)V", "DecorationBox", "value", "", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "singleLine", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "label", "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "container", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "focusedTextColor", "Landroidx/compose/ui/graphics/Color;", "unfocusedTextColor", "disabledTextColor", "errorTextColor", "focusedContainerColor", "unfocusedContainerColor", "disabledContainerColor", "errorContainerColor", "cursorColor", "errorCursorColor", "selectionColors", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "errorPlaceholderColor", "focusedSupportingTextColor", "unfocusedSupportingTextColor", "disabledSupportingTextColor", "errorSupportingTextColor", "focusedPrefixColor", "unfocusedPrefixColor", "disabledPrefixColor", "errorPrefixColor", "focusedSuffixColor", "unfocusedSuffixColor", "disabledSuffixColor", "errorSuffixColor", "colors-0hiis_0", "(JJJJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIIIIII)Landroidx/compose/material3/TextFieldColors;", "start", "top", "end", "bottom", "contentPadding-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: TextFieldDefaults.kt */
public final class OutlinedTextFieldDefaults {
    public static final int $stable = 0;
    private static final float FocusedBorderThickness = Dp.m5626constructorimpl((float) 2);
    public static final OutlinedTextFieldDefaults INSTANCE = new OutlinedTextFieldDefaults();
    private static final float MinHeight = Dp.m5626constructorimpl((float) 56);
    private static final float MinWidth = Dp.m5626constructorimpl((float) 280);
    private static final float UnfocusedBorderThickness = Dp.m5626constructorimpl((float) 1);

    /* renamed from: getFocusedBorderThickness-D9Ej5fM  reason: not valid java name */
    public final float m1476getFocusedBorderThicknessD9Ej5fM() {
        return FocusedBorderThickness;
    }

    /* renamed from: getMinHeight-D9Ej5fM  reason: not valid java name */
    public final float m1477getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM  reason: not valid java name */
    public final float m1478getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    /* renamed from: getUnfocusedBorderThickness-D9Ej5fM  reason: not valid java name */
    public final float m1479getUnfocusedBorderThicknessD9Ej5fM() {
        return UnfocusedBorderThickness;
    }

    private OutlinedTextFieldDefaults() {
    }

    public final Shape getShape(Composer composer, int i) {
        composer.startReplaceableGroup(-1066756961);
        ComposerKt.sourceInformation(composer, "C1347@74442L9:TextFieldDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1066756961, i, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.<get-shape> (TextFieldDefaults.kt:1347)");
        }
        Shape shape = ShapesKt.toShape(OutlinedTextFieldTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    /* JADX WARNING: Removed duplicated region for block: B:114:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01da  */
    /* renamed from: ContainerBox-nbWgWpA  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m1473ContainerBoxnbWgWpA(boolean r21, boolean r22, androidx.compose.foundation.interaction.InteractionSource r23, androidx.compose.material3.TextFieldColors r24, androidx.compose.ui.graphics.Shape r25, float r26, float r27, androidx.compose.runtime.Composer r28, int r29, int r30) {
        /*
            r20 = this;
            r8 = r23
            r9 = r24
            r10 = r29
            r11 = r30
            java.lang.String r0 = "interactionSource"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "colors"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 1461761386(0x5720b56a, float:1.76701028E14)
            r1 = r28
            androidx.compose.runtime.Composer r12 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(ContainerBox)P(1,4,3!1,5,2:c#ui.unit.Dp,6:c#ui.unit.Dp)1394@76327L9,1398@76498L203,1410@76843L51,1406@76710L199:TextFieldDefaults.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r12, r1)
            r1 = r11 & 1
            if (r1 == 0) goto L_0x002b
            r1 = r10 | 6
            r13 = r21
            goto L_0x003d
        L_0x002b:
            r1 = r10 & 14
            r13 = r21
            if (r1 != 0) goto L_0x003c
            boolean r1 = r12.changed((boolean) r13)
            if (r1 == 0) goto L_0x0039
            r1 = 4
            goto L_0x003a
        L_0x0039:
            r1 = 2
        L_0x003a:
            r1 = r1 | r10
            goto L_0x003d
        L_0x003c:
            r1 = r10
        L_0x003d:
            r2 = r11 & 2
            if (r2 == 0) goto L_0x0046
            r1 = r1 | 48
            r14 = r22
            goto L_0x0058
        L_0x0046:
            r2 = r10 & 112(0x70, float:1.57E-43)
            r14 = r22
            if (r2 != 0) goto L_0x0058
            boolean r2 = r12.changed((boolean) r14)
            if (r2 == 0) goto L_0x0055
            r2 = 32
            goto L_0x0057
        L_0x0055:
            r2 = 16
        L_0x0057:
            r1 = r1 | r2
        L_0x0058:
            r2 = r11 & 4
            if (r2 == 0) goto L_0x005f
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x006f
        L_0x005f:
            r2 = r10 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x006f
            boolean r2 = r12.changed((java.lang.Object) r8)
            if (r2 == 0) goto L_0x006c
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x006e
        L_0x006c:
            r2 = 128(0x80, float:1.794E-43)
        L_0x006e:
            r1 = r1 | r2
        L_0x006f:
            r2 = r11 & 8
            if (r2 == 0) goto L_0x0076
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0086
        L_0x0076:
            r2 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x0086
            boolean r2 = r12.changed((java.lang.Object) r9)
            if (r2 == 0) goto L_0x0083
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x0085
        L_0x0083:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0085:
            r1 = r1 | r2
        L_0x0086:
            r2 = 57344(0xe000, float:8.0356E-41)
            r3 = r10 & r2
            if (r3 != 0) goto L_0x00a2
            r3 = r11 & 16
            if (r3 != 0) goto L_0x009c
            r3 = r25
            boolean r4 = r12.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x009e
            r4 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a0
        L_0x009c:
            r3 = r25
        L_0x009e:
            r4 = 8192(0x2000, float:1.14794E-41)
        L_0x00a0:
            r1 = r1 | r4
            goto L_0x00a4
        L_0x00a2:
            r3 = r25
        L_0x00a4:
            r4 = 458752(0x70000, float:6.42848E-40)
            r5 = r10 & r4
            if (r5 != 0) goto L_0x00bf
            r5 = r11 & 32
            if (r5 != 0) goto L_0x00b9
            r5 = r26
            boolean r6 = r12.changed((float) r5)
            if (r6 == 0) goto L_0x00bb
            r6 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bd
        L_0x00b9:
            r5 = r26
        L_0x00bb:
            r6 = 65536(0x10000, float:9.18355E-41)
        L_0x00bd:
            r1 = r1 | r6
            goto L_0x00c1
        L_0x00bf:
            r5 = r26
        L_0x00c1:
            r6 = 3670016(0x380000, float:5.142788E-39)
            r6 = r6 & r10
            if (r6 != 0) goto L_0x00db
            r6 = r11 & 64
            if (r6 != 0) goto L_0x00d5
            r6 = r27
            boolean r7 = r12.changed((float) r6)
            if (r7 == 0) goto L_0x00d7
            r7 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d9
        L_0x00d5:
            r6 = r27
        L_0x00d7:
            r7 = 524288(0x80000, float:7.34684E-40)
        L_0x00d9:
            r1 = r1 | r7
            goto L_0x00dd
        L_0x00db:
            r6 = r27
        L_0x00dd:
            r7 = r11 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x00e7
            r7 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r7
            r15 = r20
            goto L_0x00fa
        L_0x00e7:
            r7 = 29360128(0x1c00000, float:7.052966E-38)
            r7 = r7 & r10
            r15 = r20
            if (r7 != 0) goto L_0x00fa
            boolean r7 = r12.changed((java.lang.Object) r15)
            if (r7 == 0) goto L_0x00f7
            r7 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f9
        L_0x00f7:
            r7 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f9:
            r1 = r1 | r7
        L_0x00fa:
            r7 = 23967451(0x16db6db, float:4.3661218E-38)
            r7 = r7 & r1
            r4 = 4793490(0x492492, float:6.71711E-39)
            if (r7 != r4) goto L_0x0112
            boolean r4 = r12.getSkipping()
            if (r4 != 0) goto L_0x010a
            goto L_0x0112
        L_0x010a:
            r12.skipToGroupEnd()
            r7 = r5
            r8 = r6
            r6 = r3
            goto L_0x01e2
        L_0x0112:
            r12.startDefaults()
            r4 = r10 & 1
            r7 = -3670017(0xffffffffffc7ffff, float:NaN)
            r16 = -458753(0xfffffffffff8ffff, float:NaN)
            r17 = -57345(0xffffffffffff1fff, float:NaN)
            if (r4 == 0) goto L_0x013e
            boolean r4 = r12.getDefaultsInvalid()
            if (r4 == 0) goto L_0x0129
            goto L_0x013e
        L_0x0129:
            r12.skipToGroupEnd()
            r4 = r11 & 16
            if (r4 == 0) goto L_0x0132
            r1 = r1 & r17
        L_0x0132:
            r4 = r11 & 32
            if (r4 == 0) goto L_0x0138
            r1 = r1 & r16
        L_0x0138:
            r4 = r11 & 64
            if (r4 == 0) goto L_0x0165
            r1 = r1 & r7
            goto L_0x0165
        L_0x013e:
            r4 = r11 & 16
            if (r4 == 0) goto L_0x014f
            androidx.compose.material3.tokens.OutlinedTextFieldTokens r3 = androidx.compose.material3.tokens.OutlinedTextFieldTokens.INSTANCE
            androidx.compose.material3.tokens.ShapeKeyTokens r3 = r3.getContainerShape()
            r4 = 6
            androidx.compose.ui.graphics.Shape r3 = androidx.compose.material3.ShapesKt.toShape(r3, r12, r4)
            r1 = r1 & r17
        L_0x014f:
            r4 = r11 & 32
            if (r4 == 0) goto L_0x0158
            float r4 = FocusedBorderThickness
            r1 = r1 & r16
            r5 = r4
        L_0x0158:
            r4 = r11 & 64
            if (r4 == 0) goto L_0x0165
            float r4 = UnfocusedBorderThickness
            r1 = r1 & r7
            r7 = r3
            r17 = r4
            r16 = r5
            goto L_0x016a
        L_0x0165:
            r7 = r3
            r16 = r5
            r17 = r6
        L_0x016a:
            r12.endDefaults()
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L_0x017a
            r3 = -1
            java.lang.String r4 = "androidx.compose.material3.OutlinedTextFieldDefaults.ContainerBox (TextFieldDefaults.kt:1389)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r1, r3, r4)
        L_0x017a:
            r0 = r1 & 14
            r3 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r3
            r3 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r3
            r3 = r1 & 7168(0x1c00, float:1.0045E-41)
            r18 = r0 | r3
            int r0 = r1 >> 3
            r1 = r0 & r2
            r1 = r18 | r1
            r2 = 458752(0x70000, float:6.42848E-40)
            r0 = r0 & r2
            r19 = r1 | r0
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r16
            r5 = r17
            r6 = r12
            r8 = r7
            r7 = r19
            androidx.compose.runtime.State r0 = androidx.compose.material3.TextFieldDefaultsKt.m1715animateBorderStrokeAsStateNuRrP5Q(r0, r1, r2, r3, r4, r5, r6, r7)
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
            java.lang.Object r0 = r0.getValue()
            androidx.compose.foundation.BorderStroke r0 = (androidx.compose.foundation.BorderStroke) r0
            androidx.compose.ui.Modifier r6 = androidx.compose.foundation.BorderKt.border(r1, r0, r8)
            r0 = r24
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r12
            r5 = r18
            androidx.compose.runtime.State r0 = r0.containerColor$material3_release(r1, r2, r3, r4, r5)
            java.lang.Object r0 = r0.getValue()
            androidx.compose.ui.graphics.Color r0 = (androidx.compose.ui.graphics.Color) r0
            long r0 = r0.m2831unboximpl()
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.BackgroundKt.m181backgroundbw27NRU(r6, r0, r8)
            r1 = 0
            androidx.compose.foundation.layout.BoxKt.Box(r0, r12, r1)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01dd
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x01dd:
            r6 = r8
            r7 = r16
            r8 = r17
        L_0x01e2:
            androidx.compose.runtime.ScopeUpdateScope r12 = r12.endRestartGroup()
            if (r12 != 0) goto L_0x01e9
            goto L_0x0205
        L_0x01e9:
            androidx.compose.material3.OutlinedTextFieldDefaults$ContainerBox$1 r16 = new androidx.compose.material3.OutlinedTextFieldDefaults$ContainerBox$1
            r0 = r16
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r9 = r29
            r10 = r30
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = r16
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r12.updateScope(r0)
        L_0x0205:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OutlinedTextFieldDefaults.m1473ContainerBoxnbWgWpA(boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.material3.TextFieldColors, androidx.compose.ui.graphics.Shape, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: contentPadding-a9UjIt4$default  reason: not valid java name */
    public static /* synthetic */ PaddingValues m1472contentPaddinga9UjIt4$default(OutlinedTextFieldDefaults outlinedTextFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        return outlinedTextFieldDefaults.m1475contentPaddinga9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: contentPadding-a9UjIt4  reason: not valid java name */
    public final PaddingValues m1475contentPaddinga9UjIt4(float f, float f2, float f3, float f4) {
        return PaddingKt.m489PaddingValuesa9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: colors-0hiis_0  reason: not valid java name */
    public final TextFieldColors m1474colors0hiis_0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, TextSelectionColors textSelectionColors, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, Composer composer, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        TextSelectionColors textSelectionColors2;
        Composer composer2 = composer;
        int i8 = i6;
        int i9 = i7;
        composer2.startReplaceableGroup(1767617725);
        ComposerKt.sourceInformation(composer2, "C(colors)P(30:c#ui.graphics.Color,41:c#ui.graphics.Color,9:c#ui.graphics.Color,20:c#ui.graphics.Color,23:c#ui.graphics.Color,34:c#ui.graphics.Color,2:c#ui.graphics.Color,12:c#ui.graphics.Color,0:c#ui.graphics.Color,13:c#ui.graphics.Color,32,22:c#ui.graphics.Color,33:c#ui.graphics.Color,1:c#ui.graphics.Color,11:c#ui.graphics.Color,25:c#ui.graphics.Color,36:c#ui.graphics.Color,4:c#ui.graphics.Color,15:c#ui.graphics.Color,31:c#ui.graphics.Color,42:c#ui.graphics.Color,10:c#ui.graphics.Color,21:c#ui.graphics.Color,24:c#ui.graphics.Color,35:c#ui.graphics.Color,3:c#ui.graphics.Color,14:c#ui.graphics.Color,26:c#ui.graphics.Color,37:c#ui.graphics.Color,5:c#ui.graphics.Color,16:c#ui.graphics.Color,29:c#ui.graphics.Color,40:c#ui.graphics.Color,8:c#ui.graphics.Color,19:c#ui.graphics.Color,27:c#ui.graphics.Color,38:c#ui.graphics.Color,6:c#ui.graphics.Color,17:c#ui.graphics.Color,28:c#ui.graphics.Color,39:c#ui.graphics.Color,7:c#ui.graphics.Color,18:c#ui.graphics.Color)1479@81602L9,1480@81684L9,1481@81773L9,1483@81928L9,1488@82236L9,1489@82326L9,1490@82409L7,1491@82496L9,1492@82582L9,1493@82675L9,1495@82836L9,1496@82934L9,1497@83029L9,1498@83131L9,1500@83305L9,1501@83405L9,1502@83502L9,1504@83619L9,1505@83783L9,1506@83869L9,1507@83952L9,1508@84042L9,1510@84198L9,1511@84296L9,1512@84396L9,1513@84492L9,1515@84660L9,1516@84760L9,1517@84857L9,1519@84974L9,1520@85136L9,1521@85224L9,1522@85314L9,1523@85403L9,1525@85561L9,1526@85649L9,1527@85739L9,1528@85828L9,1530@85986L9:TextFieldDefaults.kt#uh7d8r");
        long color = (i8 & 1) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusInputColor(), composer2, 6) : j;
        long color2 = (i8 & 2) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputColor(), composer2, 6) : j2;
        long r13 = (i8 & 4) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledInputColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j3;
        long color3 = (i8 & 8) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorInputColor(), composer2, 6) : j4;
        long r17 = (i8 & 16) != 0 ? Color.Companion.m2856getTransparent0d7_KjU() : j5;
        long r19 = (i8 & 32) != 0 ? Color.Companion.m2856getTransparent0d7_KjU() : j6;
        long r21 = (i8 & 64) != 0 ? Color.Companion.m2856getTransparent0d7_KjU() : j7;
        long r23 = (i8 & 128) != 0 ? Color.Companion.m2856getTransparent0d7_KjU() : j8;
        long color4 = (i8 & 256) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getCaretColor(), composer2, 6) : j9;
        long color5 = (i8 & 512) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorFocusCaretColor(), composer2, 6) : j10;
        if ((i8 & 1024) != 0) {
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = composer2.consume(TextSelectionColorsKt.getLocalTextSelectionColors());
            ComposerKt.sourceInformationMarkerEnd(composer);
            textSelectionColors2 = (TextSelectionColors) consume;
        } else {
            textSelectionColors2 = textSelectionColors;
        }
        long color6 = (i8 & 2048) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusOutlineColor(), composer2, 6) : j11;
        long color7 = (i8 & 4096) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getOutlineColor(), composer2, 6) : j12;
        long r34 = (i8 & 8192) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledOutlineColor(), composer2, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j13;
        long color8 = (i8 & 16384) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorOutlineColor(), composer2, 6) : j14;
        long color9 = (32768 & i8) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusLeadingIconColor(), composer2, 6) : j15;
        long color10 = (65536 & i8) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getLeadingIconColor(), composer2, 6) : j16;
        long r42 = (131072 & i8) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j17;
        long color11 = (262144 & i8) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorLeadingIconColor(), composer2, 6) : j18;
        long color12 = (524288 & i8) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusTrailingIconColor(), composer2, 6) : j19;
        long color13 = (1048576 & i8) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getTrailingIconColor(), composer2, 6) : j20;
        long r50 = (2097152 & i8) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j21;
        long color14 = (4194304 & i8) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorTrailingIconColor(), composer2, 6) : j22;
        long color15 = (8388608 & i8) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusLabelColor(), composer2, 6) : j23;
        long color16 = (16777216 & i8) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getLabelColor(), composer2, 6) : j24;
        long r58 = (33554432 & i8) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledLabelColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j25;
        long color17 = (67108864 & i8) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorLabelColor(), composer2, 6) : j26;
        long color18 = (134217728 & i8) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer2, 6) : j27;
        long color19 = (268435456 & i8) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer2, 6) : j28;
        long r66 = (536870912 & i8) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledInputColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j29;
        long color20 = (i8 & BasicMeasure.EXACTLY) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer2, 6) : j30;
        long color21 = (i9 & 1) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusSupportingColor(), composer2, 6) : j31;
        long color22 = (i9 & 2) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getSupportingColor(), composer2, 6) : j32;
        long r74 = (i9 & 4) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledSupportingColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j33;
        long color23 = (i9 & 8) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorSupportingColor(), composer2, 6) : j34;
        long color24 = (i9 & 16) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer2, 6) : j35;
        long color25 = (i9 & 32) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer2, 6) : j36;
        long r82 = (i9 & 64) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j37;
        long color26 = (i9 & 128) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer2, 6) : j38;
        long color27 = (i9 & 256) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer2, 6) : j39;
        long color28 = (i9 & 512) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer2, 6) : j40;
        long r90 = (i9 & 1024) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j41;
        long color29 = (i9 & 2048) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer2, 6) : j42;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1767617725, i, i2, "androidx.compose.material3.OutlinedTextFieldDefaults.colors (TextFieldDefaults.kt:1478)");
        }
        TextFieldColors textFieldColors = new TextFieldColors(color, color2, r13, color3, r17, r19, r21, r23, color4, color5, textSelectionColors2, color6, color7, r34, color8, color9, color10, r42, color11, color12, color13, r50, color14, color15, color16, r58, color17, color18, color19, r66, color20, color21, color22, r74, color23, color24, color25, r82, color26, color27, color28, r90, color29, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textFieldColors;
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0231  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x0486  */
    /* JADX WARNING: Removed duplicated region for block: B:251:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0147  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DecorationBox(java.lang.String r117, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r118, boolean r119, boolean r120, androidx.compose.ui.text.input.VisualTransformation r121, androidx.compose.foundation.interaction.InteractionSource r122, boolean r123, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r124, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r125, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r126, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r127, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r128, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r129, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r130, androidx.compose.material3.TextFieldColors r131, androidx.compose.foundation.layout.PaddingValues r132, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r133, androidx.compose.runtime.Composer r134, int r135, int r136, int r137) {
        /*
            r116 = this;
            r15 = r117
            r14 = r118
            r13 = r121
            r12 = r122
            r11 = r135
            r10 = r136
            r9 = r137
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "innerTextField"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "visualTransformation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "interactionSource"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = -350442135(0xffffffffeb1cad69, float:-1.8941133E26)
            r1 = r134
            androidx.compose.runtime.Composer r8 = r1.startRestartGroup(r0)
            java.lang.String r0 = "C(DecorationBox)P(15,4,3,11,16,5,6,7,9,8,14,10,12,13!1,2)1652@93520L8,1663@93808L709:TextFieldDefaults.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r8, r0)
            r0 = r9 & 1
            if (r0 == 0) goto L_0x003b
            r0 = r11 | 6
            goto L_0x004b
        L_0x003b:
            r0 = r11 & 14
            if (r0 != 0) goto L_0x004a
            boolean r0 = r8.changed((java.lang.Object) r15)
            if (r0 == 0) goto L_0x0047
            r0 = 4
            goto L_0x0048
        L_0x0047:
            r0 = 2
        L_0x0048:
            r0 = r0 | r11
            goto L_0x004b
        L_0x004a:
            r0 = r11
        L_0x004b:
            r3 = r9 & 2
            if (r3 == 0) goto L_0x0052
            r0 = r0 | 48
            goto L_0x0062
        L_0x0052:
            r3 = r11 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0062
            boolean r3 = r8.changedInstance(r14)
            if (r3 == 0) goto L_0x005f
            r3 = 32
            goto L_0x0061
        L_0x005f:
            r3 = 16
        L_0x0061:
            r0 = r0 | r3
        L_0x0062:
            r3 = r9 & 4
            if (r3 == 0) goto L_0x0069
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x007d
        L_0x0069:
            r3 = r11 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x007d
            r3 = r119
            boolean r16 = r8.changed((boolean) r3)
            if (r16 == 0) goto L_0x0078
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x007a
        L_0x0078:
            r16 = 128(0x80, float:1.794E-43)
        L_0x007a:
            r0 = r0 | r16
            goto L_0x007f
        L_0x007d:
            r3 = r119
        L_0x007f:
            r16 = r9 & 8
            r17 = 2048(0x800, float:2.87E-42)
            r18 = 1024(0x400, float:1.435E-42)
            if (r16 == 0) goto L_0x008a
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x009e
        L_0x008a:
            r1 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r1 != 0) goto L_0x009e
            r1 = r120
            boolean r16 = r8.changed((boolean) r1)
            if (r16 == 0) goto L_0x0099
            r16 = r17
            goto L_0x009b
        L_0x0099:
            r16 = r18
        L_0x009b:
            r0 = r0 | r16
            goto L_0x00a0
        L_0x009e:
            r1 = r120
        L_0x00a0:
            r16 = r9 & 16
            r19 = 8192(0x2000, float:1.14794E-41)
            r110 = 57344(0xe000, float:8.0356E-41)
            r20 = 16384(0x4000, float:2.2959E-41)
            if (r16 == 0) goto L_0x00ae
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00bf
        L_0x00ae:
            r16 = r11 & r110
            if (r16 != 0) goto L_0x00bf
            boolean r16 = r8.changed((java.lang.Object) r13)
            if (r16 == 0) goto L_0x00bb
            r16 = r20
            goto L_0x00bd
        L_0x00bb:
            r16 = r19
        L_0x00bd:
            r0 = r0 | r16
        L_0x00bf:
            r16 = r9 & 32
            r21 = 65536(0x10000, float:9.18355E-41)
            r111 = 458752(0x70000, float:6.42848E-40)
            if (r16 == 0) goto L_0x00cc
            r16 = 196608(0x30000, float:2.75506E-40)
        L_0x00c9:
            r0 = r0 | r16
            goto L_0x00dc
        L_0x00cc:
            r16 = r11 & r111
            if (r16 != 0) goto L_0x00dc
            boolean r16 = r8.changed((java.lang.Object) r12)
            if (r16 == 0) goto L_0x00d9
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c9
        L_0x00d9:
            r16 = r21
            goto L_0x00c9
        L_0x00dc:
            r16 = r9 & 64
            r112 = 3670016(0x380000, float:5.142788E-39)
            if (r16 == 0) goto L_0x00e9
            r22 = 1572864(0x180000, float:2.204052E-39)
            r0 = r0 | r22
            r2 = r123
            goto L_0x00fc
        L_0x00e9:
            r22 = r11 & r112
            r2 = r123
            if (r22 != 0) goto L_0x00fc
            boolean r23 = r8.changed((boolean) r2)
            if (r23 == 0) goto L_0x00f8
            r23 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00fa
        L_0x00f8:
            r23 = 524288(0x80000, float:7.34684E-40)
        L_0x00fa:
            r0 = r0 | r23
        L_0x00fc:
            r4 = r9 & 128(0x80, float:1.794E-43)
            r113 = 29360128(0x1c00000, float:7.052966E-38)
            if (r4 == 0) goto L_0x0109
            r24 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r0 | r24
            r5 = r124
            goto L_0x011c
        L_0x0109:
            r24 = r11 & r113
            r5 = r124
            if (r24 != 0) goto L_0x011c
            boolean r25 = r8.changedInstance(r5)
            if (r25 == 0) goto L_0x0118
            r25 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x011a
        L_0x0118:
            r25 = 4194304(0x400000, float:5.877472E-39)
        L_0x011a:
            r0 = r0 | r25
        L_0x011c:
            r6 = r9 & 256(0x100, float:3.59E-43)
            if (r6 == 0) goto L_0x0127
            r26 = 100663296(0x6000000, float:2.4074124E-35)
            r0 = r0 | r26
            r7 = r125
            goto L_0x013c
        L_0x0127:
            r26 = 234881024(0xe000000, float:1.5777218E-30)
            r26 = r11 & r26
            r7 = r125
            if (r26 != 0) goto L_0x013c
            boolean r27 = r8.changedInstance(r7)
            if (r27 == 0) goto L_0x0138
            r27 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x013a
        L_0x0138:
            r27 = 33554432(0x2000000, float:9.403955E-38)
        L_0x013a:
            r0 = r0 | r27
        L_0x013c:
            r1 = r9 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0147
            r27 = 805306368(0x30000000, float:4.656613E-10)
            r0 = r0 | r27
            r2 = r126
            goto L_0x015c
        L_0x0147:
            r27 = 1879048192(0x70000000, float:1.58456325E29)
            r27 = r11 & r27
            r2 = r126
            if (r27 != 0) goto L_0x015c
            boolean r27 = r8.changedInstance(r2)
            if (r27 == 0) goto L_0x0158
            r27 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x015a
        L_0x0158:
            r27 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x015a:
            r0 = r0 | r27
        L_0x015c:
            r2 = r9 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x0165
            r22 = r10 | 6
            r3 = r127
            goto L_0x017b
        L_0x0165:
            r27 = r10 & 14
            r3 = r127
            if (r27 != 0) goto L_0x0179
            boolean r27 = r8.changedInstance(r3)
            if (r27 == 0) goto L_0x0174
            r22 = 4
            goto L_0x0176
        L_0x0174:
            r22 = 2
        L_0x0176:
            r22 = r10 | r22
            goto L_0x017b
        L_0x0179:
            r22 = r10
        L_0x017b:
            r3 = r9 & 2048(0x800, float:2.87E-42)
            if (r3 == 0) goto L_0x0182
            r22 = r22 | 48
            goto L_0x0195
        L_0x0182:
            r27 = r10 & 112(0x70, float:1.57E-43)
            r5 = r128
            if (r27 != 0) goto L_0x0195
            boolean r27 = r8.changedInstance(r5)
            if (r27 == 0) goto L_0x0191
            r23 = 32
            goto L_0x0193
        L_0x0191:
            r23 = 16
        L_0x0193:
            r22 = r22 | r23
        L_0x0195:
            r5 = r22
            r7 = r9 & 4096(0x1000, float:5.74E-42)
            if (r7 == 0) goto L_0x019e
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x01b2
        L_0x019e:
            r12 = r10 & 896(0x380, float:1.256E-42)
            if (r12 != 0) goto L_0x01b2
            r12 = r129
            boolean r22 = r8.changedInstance(r12)
            if (r22 == 0) goto L_0x01ad
            r26 = 256(0x100, float:3.59E-43)
            goto L_0x01af
        L_0x01ad:
            r26 = 128(0x80, float:1.794E-43)
        L_0x01af:
            r5 = r5 | r26
            goto L_0x01b4
        L_0x01b2:
            r12 = r129
        L_0x01b4:
            r12 = r9 & 8192(0x2000, float:1.14794E-41)
            if (r12 == 0) goto L_0x01bb
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            goto L_0x01cd
        L_0x01bb:
            r13 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r13 != 0) goto L_0x01cd
            r13 = r130
            boolean r22 = r8.changedInstance(r13)
            if (r22 == 0) goto L_0x01c8
            goto L_0x01ca
        L_0x01c8:
            r17 = r18
        L_0x01ca:
            r5 = r5 | r17
            goto L_0x01cf
        L_0x01cd:
            r13 = r130
        L_0x01cf:
            r17 = r10 & r110
            if (r17 != 0) goto L_0x01e7
            r13 = r9 & 16384(0x4000, float:2.2959E-41)
            if (r13 != 0) goto L_0x01e2
            r13 = r131
            boolean r17 = r8.changed((java.lang.Object) r13)
            if (r17 == 0) goto L_0x01e4
            r19 = r20
            goto L_0x01e4
        L_0x01e2:
            r13 = r131
        L_0x01e4:
            r5 = r5 | r19
            goto L_0x01e9
        L_0x01e7:
            r13 = r131
        L_0x01e9:
            r17 = r10 & r111
            if (r17 != 0) goto L_0x0204
            r17 = 32768(0x8000, float:4.5918E-41)
            r17 = r9 & r17
            r13 = r132
            if (r17 != 0) goto L_0x01ff
            boolean r17 = r8.changed((java.lang.Object) r13)
            if (r17 == 0) goto L_0x01ff
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0201
        L_0x01ff:
            r17 = r21
        L_0x0201:
            r5 = r5 | r17
            goto L_0x0206
        L_0x0204:
            r13 = r132
        L_0x0206:
            r114 = r9 & r21
            if (r114 == 0) goto L_0x0211
            r17 = 1572864(0x180000, float:2.204052E-39)
            r5 = r5 | r17
            r13 = r133
            goto L_0x0224
        L_0x0211:
            r17 = r10 & r112
            r13 = r133
            if (r17 != 0) goto L_0x0224
            boolean r17 = r8.changedInstance(r13)
            if (r17 == 0) goto L_0x0220
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0222
        L_0x0220:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x0222:
            r5 = r5 | r17
        L_0x0224:
            r17 = 131072(0x20000, float:1.83671E-40)
            r17 = r9 & r17
            if (r17 == 0) goto L_0x0231
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            r5 = r5 | r17
            r15 = r116
            goto L_0x0244
        L_0x0231:
            r17 = r10 & r113
            r15 = r116
            if (r17 != 0) goto L_0x0244
            boolean r17 = r8.changed((java.lang.Object) r15)
            if (r17 == 0) goto L_0x0240
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0242
        L_0x0240:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x0242:
            r5 = r5 | r17
        L_0x0244:
            r17 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r10 = r0 & r17
            r13 = 306783378(0x12492492, float:6.3469493E-28)
            if (r10 != r13) goto L_0x027b
            r10 = 23967451(0x16db6db, float:4.3661218E-38)
            r10 = r10 & r5
            r13 = 4793490(0x492492, float:6.71711E-39)
            if (r10 != r13) goto L_0x027b
            boolean r10 = r8.getSkipping()
            if (r10 != 0) goto L_0x025e
            goto L_0x027b
        L_0x025e:
            r8.skipToGroupEnd()
            r9 = r124
            r10 = r125
            r11 = r126
            r12 = r127
            r13 = r128
            r14 = r129
            r15 = r130
            r16 = r131
            r17 = r132
            r18 = r133
            r33 = r8
            r8 = r123
            goto L_0x047f
        L_0x027b:
            r8.startDefaults()
            r10 = r11 & 1
            if (r10 == 0) goto L_0x02b6
            boolean r10 = r8.getDefaultsInvalid()
            if (r10 == 0) goto L_0x0289
            goto L_0x02b6
        L_0x0289:
            r8.skipToGroupEnd()
            r1 = r9 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x0294
            r1 = -57345(0xffffffffffff1fff, float:NaN)
            r5 = r5 & r1
        L_0x0294:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r9
            if (r1 == 0) goto L_0x029e
            r1 = -458753(0xfffffffffff8ffff, float:NaN)
            r5 = r5 & r1
        L_0x029e:
            r22 = r123
            r23 = r124
            r24 = r125
            r25 = r126
            r26 = r127
            r27 = r128
            r28 = r129
            r29 = r130
            r30 = r131
            r31 = r132
            r32 = r133
            goto L_0x03d8
        L_0x02b6:
            if (r16 == 0) goto L_0x02ba
            r10 = 0
            goto L_0x02bc
        L_0x02ba:
            r10 = r123
        L_0x02bc:
            r13 = 0
            if (r4 == 0) goto L_0x02c1
            r4 = r13
            goto L_0x02c3
        L_0x02c1:
            r4 = r124
        L_0x02c3:
            if (r6 == 0) goto L_0x02c7
            r6 = r13
            goto L_0x02c9
        L_0x02c7:
            r6 = r125
        L_0x02c9:
            if (r1 == 0) goto L_0x02cd
            r1 = r13
            goto L_0x02cf
        L_0x02cd:
            r1 = r126
        L_0x02cf:
            if (r2 == 0) goto L_0x02d3
            r2 = r13
            goto L_0x02d5
        L_0x02d3:
            r2 = r127
        L_0x02d5:
            if (r3 == 0) goto L_0x02d9
            r3 = r13
            goto L_0x02db
        L_0x02d9:
            r3 = r128
        L_0x02db:
            if (r7 == 0) goto L_0x02df
            r7 = r13
            goto L_0x02e1
        L_0x02df:
            r7 = r129
        L_0x02e1:
            if (r12 == 0) goto L_0x02e4
            goto L_0x02e6
        L_0x02e4:
            r13 = r130
        L_0x02e6:
            r12 = r9 & 16384(0x4000, float:2.2959E-41)
            if (r12 == 0) goto L_0x0361
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r33 = 0
            r35 = 0
            r37 = 0
            r38 = 0
            r40 = 0
            r42 = 0
            r44 = 0
            r46 = 0
            r48 = 0
            r50 = 0
            r52 = 0
            r54 = 0
            r56 = 0
            r58 = 0
            r60 = 0
            r62 = 0
            r64 = 0
            r66 = 0
            r68 = 0
            r70 = 0
            r72 = 0
            r74 = 0
            r76 = 0
            r78 = 0
            r80 = 0
            r82 = 0
            r84 = 0
            r86 = 0
            r88 = 0
            r90 = 0
            r92 = 0
            r94 = 0
            r96 = 0
            r98 = 0
            r100 = 0
            r103 = 0
            r104 = 0
            r105 = 0
            r106 = 0
            int r12 = r5 >> 12
            r12 = r12 & 7168(0x1c00, float:1.0045E-41)
            r107 = r12
            r108 = 2147483647(0x7fffffff, float:NaN)
            r109 = 4095(0xfff, float:5.738E-42)
            r16 = r116
            r102 = r8
            androidx.compose.material3.TextFieldColors r12 = r16.m1474colors0hiis_0(r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r38, r40, r42, r44, r46, r48, r50, r52, r54, r56, r58, r60, r62, r64, r66, r68, r70, r72, r74, r76, r78, r80, r82, r84, r86, r88, r90, r92, r94, r96, r98, r100, r102, r103, r104, r105, r106, r107, r108, r109)
            r16 = -57345(0xffffffffffff1fff, float:NaN)
            r5 = r5 & r16
            goto L_0x0363
        L_0x0361:
            r12 = r131
        L_0x0363:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r9 & r16
            if (r16 == 0) goto L_0x038e
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 15
            r21 = 0
            r123 = r116
            r124 = r16
            r125 = r17
            r126 = r18
            r127 = r19
            r128 = r20
            r129 = r21
            androidx.compose.foundation.layout.PaddingValues r16 = m1472contentPaddinga9UjIt4$default(r123, r124, r125, r126, r127, r128, r129)
            r17 = -458753(0xfffffffffff8ffff, float:NaN)
            r5 = r5 & r17
            goto L_0x0390
        L_0x038e:
            r16 = r132
        L_0x0390:
            r134 = r1
            if (r114 == 0) goto L_0x03be
            androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1 r1 = new androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
            r123 = r1
            r124 = r119
            r125 = r10
            r126 = r122
            r127 = r12
            r128 = r0
            r129 = r5
            r123.<init>(r124, r125, r126, r127, r128, r129)
            r123 = r2
            r2 = -1448570018(0xffffffffa9a8935e, float:-7.486263E-14)
            r124 = r3
            r3 = 1
            androidx.compose.runtime.internal.ComposableLambda r1 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r8, r2, r3, r1)
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            r26 = r123
            r27 = r124
            r25 = r134
            r32 = r1
            goto L_0x03ca
        L_0x03be:
            r123 = r2
            r124 = r3
            r26 = r123
            r27 = r124
            r32 = r133
            r25 = r134
        L_0x03ca:
            r23 = r4
            r24 = r6
            r28 = r7
            r22 = r10
            r30 = r12
            r29 = r13
            r31 = r16
        L_0x03d8:
            r8.endDefaults()
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x03ea
            r1 = -350442135(0xffffffffeb1cad69, float:-1.8941133E26)
            java.lang.String r2 = "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r1, r0, r5, r2)
        L_0x03ea:
            androidx.compose.material3.TextFieldType r1 = androidx.compose.material3.TextFieldType.Outlined
            r2 = r0
            r0 = r1
            int r1 = r2 << 3
            r3 = r1 & 112(0x70, float:1.57E-43)
            r3 = r3 | 6
            r1 = r1 & 896(0x380, float:1.256E-42)
            r1 = r1 | r3
            int r3 = r2 >> 3
            r4 = r3 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r4
            int r4 = r2 >> 9
            r6 = r4 & r110
            r1 = r1 | r6
            r6 = r4 & r111
            r1 = r1 | r6
            r6 = r4 & r112
            r1 = r1 | r6
            int r6 = r5 << 21
            r7 = r6 & r113
            r1 = r1 | r7
            r7 = 234881024(0xe000000, float:1.5777218E-30)
            r7 = r7 & r6
            r1 = r1 | r7
            r7 = 1879048192(0x70000000, float:1.58456325E29)
            r6 = r6 & r7
            r19 = r1 | r6
            int r1 = r5 >> 9
            r1 = r1 & 14
            int r6 = r2 >> 6
            r6 = r6 & 112(0x70, float:1.57E-43)
            r1 = r1 | r6
            r2 = r2 & 896(0x380, float:1.256E-42)
            r1 = r1 | r2
            r2 = r4 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r2
            r2 = r3 & r110
            r1 = r1 | r2
            r2 = r5 & r111
            r1 = r1 | r2
            int r2 = r5 << 6
            r2 = r2 & r112
            r1 = r1 | r2
            int r2 = r5 << 3
            r2 = r2 & r113
            r20 = r1 | r2
            r21 = 0
            r1 = r117
            r2 = r118
            r3 = r121
            r4 = r23
            r5 = r24
            r6 = r25
            r7 = r26
            r33 = r8
            r8 = r27
            r9 = r28
            r10 = r29
            r11 = r120
            r12 = r119
            r13 = r22
            r14 = r122
            r15 = r31
            r16 = r30
            r17 = r32
            r18 = r33
            androidx.compose.material3.TextFieldImplKt.CommonDecorationBox(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0469
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0469:
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            r12 = r26
            r13 = r27
            r14 = r28
            r15 = r29
            r16 = r30
            r17 = r31
            r18 = r32
        L_0x047f:
            androidx.compose.runtime.ScopeUpdateScope r7 = r33.endRestartGroup()
            if (r7 != 0) goto L_0x0486
            goto L_0x04ac
        L_0x0486:
            androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$2 r22 = new androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$2
            r0 = r22
            r1 = r116
            r2 = r117
            r3 = r118
            r4 = r119
            r5 = r120
            r6 = r121
            r115 = r7
            r7 = r122
            r19 = r135
            r20 = r136
            r21 = r137
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r0 = r22
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1 = r115
            r1.updateScope(r0)
        L_0x04ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox(java.lang.String, kotlin.jvm.functions.Function2, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.material3.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
