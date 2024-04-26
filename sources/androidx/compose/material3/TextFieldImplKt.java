package androidx.compose.material3;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.LayoutIdParentData;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0002\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u00032\u0011\u00102\u001a\r\u0012\u0004\u0012\u00020.03¢\u0006\u0002\b42\u0006\u00105\u001a\u0002062\u0013\u00107\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103¢\u0006\u0002\b42\u0015\b\u0002\u00108\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103¢\u0006\u0002\b42\u0015\b\u0002\u00109\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103¢\u0006\u0002\b42\u0015\b\u0002\u0010:\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103¢\u0006\u0002\b42\u0015\b\u0002\u0010;\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103¢\u0006\u0002\b42\u0015\b\u0002\u0010<\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103¢\u0006\u0002\b42\u0015\b\u0002\u0010=\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103¢\u0006\u0002\b42\b\b\u0002\u0010>\u001a\u00020?2\b\b\u0002\u0010@\u001a\u00020?2\b\b\u0002\u0010A\u001a\u00020?2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020G2\u0011\u0010H\u001a\r\u0012\u0004\u0012\u00020.03¢\u0006\u0002\b4H\u0001¢\u0006\u0002\u0010I\u001a<\u0010J\u001a\u00020.2\u0006\u0010K\u001a\u00020L2\n\b\u0002\u0010M\u001a\u0004\u0018\u00010N2\u0011\u0010O\u001a\r\u0012\u0004\u0012\u00020.03¢\u0006\u0002\b4H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bP\u0010Q\u001a\u0012\u0010R\u001a\u00020\u00012\b\u0010S\u001a\u0004\u0018\u00010TH\u0000\u001a\u0012\u0010U\u001a\u00020\u00012\b\u0010S\u001a\u0004\u0018\u00010TH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003XT¢\u0006\u0002\n\u0000\"\u0019\u0010\u0004\u001a\u00020\u0005X\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\"\u0014\u0010\t\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u000e\u0010\r\u001a\u00020\u0003XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0003XT¢\u0006\u0002\n\u0000\"\u0019\u0010\u000f\u001a\u00020\u0005X\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0010\u0010\u0007\"\u0019\u0010\u0011\u001a\u00020\u0005X\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0012\u0010\u0007\"\u0019\u0010\u0013\u001a\u00020\u0005X\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0014\u0010\u0007\"\u000e\u0010\u0015\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0003XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0003XT¢\u0006\u0002\n\u0000\"\u0019\u0010\u0019\u001a\u00020\u0005X\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u001a\u0010\u0007\"\u000e\u0010\u001b\u001a\u00020\u0003XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0003XT¢\u0006\u0002\n\u0000\"\u0019\u0010\u001d\u001a\u00020\u0005X\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u001e\u0010\u0007\"\u000e\u0010\u001f\u001a\u00020\u0003XT¢\u0006\u0002\n\u0000\"\u0019\u0010 \u001a\u00020\u0005X\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b!\u0010\u0007\"\u000e\u0010\"\u001a\u00020\u0003XT¢\u0006\u0002\n\u0000\"\u0019\u0010#\u001a\u00020$X\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&\"\u001a\u0010(\u001a\u0004\u0018\u00010)*\u00020*8@X\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006V"}, d2 = {"AnimationDuration", "", "ContainerId", "", "HorizontalIconPadding", "Landroidx/compose/ui/unit/Dp;", "getHorizontalIconPadding", "()F", "F", "IconDefaultSizeModifier", "Landroidx/compose/ui/Modifier;", "getIconDefaultSizeModifier", "()Landroidx/compose/ui/Modifier;", "LabelId", "LeadingId", "MinFocusedLabelLineHeight", "getMinFocusedLabelLineHeight", "MinSupportingTextLineHeight", "getMinSupportingTextLineHeight", "MinTextLineHeight", "getMinTextLineHeight", "PlaceholderAnimationDelayOrDuration", "PlaceholderAnimationDuration", "PlaceholderId", "PrefixId", "PrefixSuffixTextPadding", "getPrefixSuffixTextPadding", "SuffixId", "SupportingId", "SupportingTopPadding", "getSupportingTopPadding", "TextFieldId", "TextFieldPadding", "getTextFieldPadding", "TrailingId", "ZeroConstraints", "Landroidx/compose/ui/unit/Constraints;", "getZeroConstraints", "()J", "J", "layoutId", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "getLayoutId", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;", "CommonDecorationBox", "", "type", "Landroidx/compose/material3/TextFieldType;", "value", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "label", "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "singleLine", "", "enabled", "isError", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "colors", "Landroidx/compose/material3/TextFieldColors;", "container", "(Landroidx/compose/material3/TextFieldType;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/material3/TextFieldColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "Decoration", "contentColor", "Landroidx/compose/ui/graphics/Color;", "typography", "Landroidx/compose/ui/text/TextStyle;", "content", "Decoration-KTwxG1Y", "(JLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "heightOrZero", "placeable", "Landroidx/compose/ui/layout/Placeable;", "widthOrZero", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: TextFieldImpl.kt */
public final class TextFieldImplKt {
    public static final int AnimationDuration = 150;
    public static final String ContainerId = "Container";
    private static final float HorizontalIconPadding = Dp.m5626constructorimpl((float) 12);
    private static final Modifier IconDefaultSizeModifier;
    public static final String LabelId = "Label";
    public static final String LeadingId = "Leading";
    private static final float MinFocusedLabelLineHeight;
    private static final float MinSupportingTextLineHeight;
    private static final float MinTextLineHeight = Dp.m5626constructorimpl((float) 24);
    private static final int PlaceholderAnimationDelayOrDuration = 67;
    private static final int PlaceholderAnimationDuration = 83;
    public static final String PlaceholderId = "Hint";
    public static final String PrefixId = "Prefix";
    private static final float PrefixSuffixTextPadding = Dp.m5626constructorimpl((float) 2);
    public static final String SuffixId = "Suffix";
    public static final String SupportingId = "Supporting";
    private static final float SupportingTopPadding = Dp.m5626constructorimpl((float) 4);
    public static final String TextFieldId = "TextField";
    private static final float TextFieldPadding;
    public static final String TrailingId = "Trailing";
    private static final long ZeroConstraints = ConstraintsKt.Constraints(0, 0, 0, 0);

    public static final float getHorizontalIconPadding() {
        return HorizontalIconPadding;
    }

    public static final Modifier getIconDefaultSizeModifier() {
        return IconDefaultSizeModifier;
    }

    public static final float getMinFocusedLabelLineHeight() {
        return MinFocusedLabelLineHeight;
    }

    public static final float getMinSupportingTextLineHeight() {
        return MinSupportingTextLineHeight;
    }

    public static final float getMinTextLineHeight() {
        return MinTextLineHeight;
    }

    public static final float getPrefixSuffixTextPadding() {
        return PrefixSuffixTextPadding;
    }

    public static final float getSupportingTopPadding() {
        return SupportingTopPadding;
    }

    public static final float getTextFieldPadding() {
        return TextFieldPadding;
    }

    public static final long getZeroConstraints() {
        return ZeroConstraints;
    }

    /* JADX WARNING: Removed duplicated region for block: B:132:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x04b0  */
    /* JADX WARNING: Removed duplicated region for block: B:263:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void CommonDecorationBox(androidx.compose.material3.TextFieldType r43, java.lang.String r44, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r45, androidx.compose.ui.text.input.VisualTransformation r46, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r47, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r48, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r49, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r50, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r51, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r52, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r53, boolean r54, boolean r55, boolean r56, androidx.compose.foundation.interaction.InteractionSource r57, androidx.compose.foundation.layout.PaddingValues r58, androidx.compose.material3.TextFieldColors r59, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r60, androidx.compose.runtime.Composer r61, int r62, int r63, int r64) {
        /*
            r15 = r43
            r14 = r44
            r13 = r45
            r12 = r46
            r11 = r47
            r10 = r57
            r9 = r58
            r8 = r59
            r7 = r60
            r6 = r62
            r5 = r63
            r4 = r64
            java.lang.String r0 = "type"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "innerTextField"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "visualTransformation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "interactionSource"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "contentPadding"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "colors"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "container"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = -947035500(0xffffffffc78d6294, float:-72389.16)
            r1 = r61
            androidx.compose.runtime.Composer r3 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(CommonDecorationBox)P(15,16,4,17,7,9,8,14,10,12,13,11,3,6,5,2)81@3217L105,85@3372L25,96@3756L10,103@4099L7282:TextFieldImpl.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r3, r1)
            r1 = r4 & 1
            r16 = 2
            if (r1 == 0) goto L_0x005f
            r1 = r6 | 6
            goto L_0x0070
        L_0x005f:
            r1 = r6 & 14
            if (r1 != 0) goto L_0x006f
            boolean r1 = r3.changed((java.lang.Object) r15)
            if (r1 == 0) goto L_0x006b
            r1 = 4
            goto L_0x006d
        L_0x006b:
            r1 = r16
        L_0x006d:
            r1 = r1 | r6
            goto L_0x0070
        L_0x006f:
            r1 = r6
        L_0x0070:
            r17 = r4 & 2
            r18 = 32
            r19 = 16
            if (r17 == 0) goto L_0x007b
            r1 = r1 | 48
            goto L_0x008c
        L_0x007b:
            r17 = r6 & 112(0x70, float:1.57E-43)
            if (r17 != 0) goto L_0x008c
            boolean r17 = r3.changed((java.lang.Object) r14)
            if (r17 == 0) goto L_0x0088
            r17 = r18
            goto L_0x008a
        L_0x0088:
            r17 = r19
        L_0x008a:
            r1 = r1 | r17
        L_0x008c:
            r17 = r4 & 4
            r20 = 256(0x100, float:3.59E-43)
            r21 = 128(0x80, float:1.794E-43)
            if (r17 == 0) goto L_0x0097
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x00a7
        L_0x0097:
            r2 = r6 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x00a7
            boolean r2 = r3.changedInstance(r13)
            if (r2 == 0) goto L_0x00a4
            r2 = r20
            goto L_0x00a6
        L_0x00a4:
            r2 = r21
        L_0x00a6:
            r1 = r1 | r2
        L_0x00a7:
            r2 = r4 & 8
            r17 = 2048(0x800, float:2.87E-42)
            r22 = 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x00b2
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x00c2
        L_0x00b2:
            r2 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x00c2
            boolean r2 = r3.changed((java.lang.Object) r12)
            if (r2 == 0) goto L_0x00bf
            r2 = r17
            goto L_0x00c1
        L_0x00bf:
            r2 = r22
        L_0x00c1:
            r1 = r1 | r2
        L_0x00c2:
            r2 = r4 & 16
            r23 = 16384(0x4000, float:2.2959E-41)
            r24 = 8192(0x2000, float:1.14794E-41)
            if (r2 == 0) goto L_0x00cd
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00df
        L_0x00cd:
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r6
            if (r2 != 0) goto L_0x00df
            boolean r2 = r3.changedInstance(r11)
            if (r2 == 0) goto L_0x00dc
            r2 = r23
            goto L_0x00de
        L_0x00dc:
            r2 = r24
        L_0x00de:
            r1 = r1 | r2
        L_0x00df:
            r2 = r4 & 32
            r25 = 131072(0x20000, float:1.83671E-40)
            r26 = 65536(0x10000, float:9.18355E-41)
            if (r2 == 0) goto L_0x00ee
            r27 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r27
            r0 = r48
            goto L_0x0103
        L_0x00ee:
            r27 = 458752(0x70000, float:6.42848E-40)
            r27 = r6 & r27
            r0 = r48
            if (r27 != 0) goto L_0x0103
            boolean r28 = r3.changedInstance(r0)
            if (r28 == 0) goto L_0x00ff
            r28 = r25
            goto L_0x0101
        L_0x00ff:
            r28 = r26
        L_0x0101:
            r1 = r1 | r28
        L_0x0103:
            r28 = r4 & 64
            if (r28 == 0) goto L_0x010e
            r29 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r29
            r0 = r49
            goto L_0x0123
        L_0x010e:
            r29 = 3670016(0x380000, float:5.142788E-39)
            r29 = r6 & r29
            r0 = r49
            if (r29 != 0) goto L_0x0123
            boolean r29 = r3.changedInstance(r0)
            if (r29 == 0) goto L_0x011f
            r29 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0121
        L_0x011f:
            r29 = 524288(0x80000, float:7.34684E-40)
        L_0x0121:
            r1 = r1 | r29
        L_0x0123:
            r0 = r4 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x012e
            r29 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r29
            r13 = r50
            goto L_0x0143
        L_0x012e:
            r29 = 29360128(0x1c00000, float:7.052966E-38)
            r29 = r6 & r29
            r13 = r50
            if (r29 != 0) goto L_0x0143
            boolean r29 = r3.changedInstance(r13)
            if (r29 == 0) goto L_0x013f
            r29 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0141
        L_0x013f:
            r29 = 4194304(0x400000, float:5.877472E-39)
        L_0x0141:
            r1 = r1 | r29
        L_0x0143:
            r13 = r4 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L_0x014e
            r29 = 100663296(0x6000000, float:2.4074124E-35)
            r1 = r1 | r29
            r15 = r51
            goto L_0x0163
        L_0x014e:
            r29 = 234881024(0xe000000, float:1.5777218E-30)
            r29 = r6 & r29
            r15 = r51
            if (r29 != 0) goto L_0x0163
            boolean r29 = r3.changedInstance(r15)
            if (r29 == 0) goto L_0x015f
            r29 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0161
        L_0x015f:
            r29 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0161:
            r1 = r1 | r29
        L_0x0163:
            r15 = r4 & 512(0x200, float:7.175E-43)
            if (r15 == 0) goto L_0x016e
            r29 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r1 | r29
            r6 = r52
            goto L_0x0183
        L_0x016e:
            r29 = 1879048192(0x70000000, float:1.58456325E29)
            r29 = r6 & r29
            r6 = r52
            if (r29 != 0) goto L_0x0183
            boolean r29 = r3.changedInstance(r6)
            if (r29 == 0) goto L_0x017f
            r29 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0181
        L_0x017f:
            r29 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0181:
            r1 = r1 | r29
        L_0x0183:
            r6 = r4 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L_0x018c
            r16 = r5 | 6
            r11 = r53
            goto L_0x019f
        L_0x018c:
            r29 = r5 & 14
            r11 = r53
            if (r29 != 0) goto L_0x019d
            boolean r29 = r3.changedInstance(r11)
            if (r29 == 0) goto L_0x019a
            r16 = 4
        L_0x019a:
            r16 = r5 | r16
            goto L_0x019f
        L_0x019d:
            r16 = r5
        L_0x019f:
            r11 = r4 & 2048(0x800, float:2.87E-42)
            if (r11 == 0) goto L_0x01a6
            r16 = r16 | 48
            goto L_0x01b7
        L_0x01a6:
            r29 = r5 & 112(0x70, float:1.57E-43)
            r12 = r54
            if (r29 != 0) goto L_0x01b7
            boolean r29 = r3.changed((boolean) r12)
            if (r29 == 0) goto L_0x01b3
            goto L_0x01b5
        L_0x01b3:
            r18 = r19
        L_0x01b5:
            r16 = r16 | r18
        L_0x01b7:
            r12 = r16
            r14 = r4 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x01c2
            r12 = r12 | 384(0x180, float:5.38E-43)
            r16 = r14
            goto L_0x01d6
        L_0x01c2:
            r16 = r14
            r14 = r5 & 896(0x380, float:1.256E-42)
            if (r14 != 0) goto L_0x01d6
            r14 = r55
            boolean r18 = r3.changed((boolean) r14)
            if (r18 == 0) goto L_0x01d1
            goto L_0x01d3
        L_0x01d1:
            r20 = r21
        L_0x01d3:
            r12 = r12 | r20
            goto L_0x01d8
        L_0x01d6:
            r14 = r55
        L_0x01d8:
            r14 = r4 & 8192(0x2000, float:1.14794E-41)
            if (r14 == 0) goto L_0x01e1
            r12 = r12 | 3072(0xc00, float:4.305E-42)
            r18 = r14
            goto L_0x01f5
        L_0x01e1:
            r18 = r14
            r14 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r14 != 0) goto L_0x01f5
            r14 = r56
            boolean r19 = r3.changed((boolean) r14)
            if (r19 == 0) goto L_0x01f0
            goto L_0x01f2
        L_0x01f0:
            r17 = r22
        L_0x01f2:
            r12 = r12 | r17
            goto L_0x01f7
        L_0x01f5:
            r14 = r56
        L_0x01f7:
            r14 = r4 & 16384(0x4000, float:2.2959E-41)
            if (r14 == 0) goto L_0x01fe
            r12 = r12 | 24576(0x6000, float:3.4438E-41)
            goto L_0x020f
        L_0x01fe:
            r14 = 57344(0xe000, float:8.0356E-41)
            r14 = r14 & r5
            if (r14 != 0) goto L_0x020f
            boolean r14 = r3.changed((java.lang.Object) r10)
            if (r14 == 0) goto L_0x020b
            goto L_0x020d
        L_0x020b:
            r23 = r24
        L_0x020d:
            r12 = r12 | r23
        L_0x020f:
            r14 = 32768(0x8000, float:4.5918E-41)
            r14 = r14 & r4
            if (r14 == 0) goto L_0x0219
            r14 = 196608(0x30000, float:2.75506E-40)
        L_0x0217:
            r12 = r12 | r14
            goto L_0x022a
        L_0x0219:
            r14 = 458752(0x70000, float:6.42848E-40)
            r14 = r14 & r5
            if (r14 != 0) goto L_0x022a
            boolean r14 = r3.changed((java.lang.Object) r9)
            if (r14 == 0) goto L_0x0227
            r14 = r25
            goto L_0x0217
        L_0x0227:
            r14 = r26
            goto L_0x0217
        L_0x022a:
            r14 = r4 & r26
            if (r14 == 0) goto L_0x0232
            r14 = 1572864(0x180000, float:2.204052E-39)
        L_0x0230:
            r12 = r12 | r14
            goto L_0x0243
        L_0x0232:
            r14 = 3670016(0x380000, float:5.142788E-39)
            r14 = r14 & r5
            if (r14 != 0) goto L_0x0243
            boolean r14 = r3.changed((java.lang.Object) r8)
            if (r14 == 0) goto L_0x0240
            r14 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0230
        L_0x0240:
            r14 = 524288(0x80000, float:7.34684E-40)
            goto L_0x0230
        L_0x0243:
            r14 = r4 & r25
            if (r14 == 0) goto L_0x024b
            r14 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x0249:
            r12 = r12 | r14
            goto L_0x025c
        L_0x024b:
            r14 = 29360128(0x1c00000, float:7.052966E-38)
            r14 = r14 & r5
            if (r14 != 0) goto L_0x025c
            boolean r14 = r3.changedInstance(r7)
            if (r14 == 0) goto L_0x0259
            r14 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0249
        L_0x0259:
            r14 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x0249
        L_0x025c:
            r14 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r14 = r14 & r1
            r4 = 306783378(0x12492492, float:6.3469493E-28)
            if (r14 != r4) goto L_0x028d
            r4 = 23967451(0x16db6db, float:4.3661218E-38)
            r4 = r4 & r12
            r14 = 4793490(0x492492, float:6.71711E-39)
            if (r4 != r14) goto L_0x028d
            boolean r4 = r3.getSkipping()
            if (r4 != 0) goto L_0x0275
            goto L_0x028d
        L_0x0275:
            r3.skipToGroupEnd()
            r6 = r48
            r7 = r49
            r8 = r50
            r9 = r51
            r10 = r52
            r11 = r53
            r30 = r54
            r13 = r55
            r14 = r56
            r12 = r3
            goto L_0x04a9
        L_0x028d:
            r4 = 0
            if (r2 == 0) goto L_0x0293
            r23 = r4
            goto L_0x0295
        L_0x0293:
            r23 = r48
        L_0x0295:
            if (r28 == 0) goto L_0x029a
            r24 = r4
            goto L_0x029c
        L_0x029a:
            r24 = r49
        L_0x029c:
            if (r0 == 0) goto L_0x02a1
            r25 = r4
            goto L_0x02a3
        L_0x02a1:
            r25 = r50
        L_0x02a3:
            if (r13 == 0) goto L_0x02a8
            r26 = r4
            goto L_0x02aa
        L_0x02a8:
            r26 = r51
        L_0x02aa:
            if (r15 == 0) goto L_0x02af
            r28 = r4
            goto L_0x02b1
        L_0x02af:
            r28 = r52
        L_0x02b1:
            if (r6 == 0) goto L_0x02b6
            r29 = r4
            goto L_0x02b8
        L_0x02b6:
            r29 = r53
        L_0x02b8:
            if (r11 == 0) goto L_0x02bd
            r30 = 0
            goto L_0x02bf
        L_0x02bd:
            r30 = r54
        L_0x02bf:
            if (r16 == 0) goto L_0x02c4
            r31 = 1
            goto L_0x02c6
        L_0x02c4:
            r31 = r55
        L_0x02c6:
            if (r18 == 0) goto L_0x02cb
            r32 = 0
            goto L_0x02cd
        L_0x02cb:
            r32 = r56
        L_0x02cd:
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x02dc
            java.lang.String r2 = "androidx.compose.material3.CommonDecorationBox (TextFieldImpl.kt:61)"
            r4 = -947035500(0xffffffffc78d6294, float:-72389.16)
            androidx.compose.runtime.ComposerKt.traceEventStart(r4, r1, r12, r2)
        L_0x02dc:
            r2 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r3.startReplaceableGroup(r2)
            java.lang.String r2 = "CC(remember)P(1,2):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r3, r2)
            r14 = r44
            boolean r2 = r3.changed((java.lang.Object) r14)
            r13 = r46
            boolean r4 = r3.changed((java.lang.Object) r13)
            r2 = r2 | r4
            java.lang.Object r4 = r3.rememberedValue()
            if (r2 != 0) goto L_0x0302
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r4 != r2) goto L_0x031f
        L_0x0302:
            androidx.compose.ui.text.AnnotatedString r2 = new androidx.compose.ui.text.AnnotatedString
            r4 = 0
            r6 = 0
            r11 = 6
            r16 = 0
            r48 = r2
            r49 = r44
            r50 = r4
            r51 = r6
            r52 = r11
            r53 = r16
            r48.<init>(r49, r50, r51, r52, r53)
            androidx.compose.ui.text.input.TransformedText r4 = r13.filter(r2)
            r3.updateRememberedValue(r4)
        L_0x031f:
            r3.endReplaceableGroup()
            androidx.compose.ui.text.input.TransformedText r4 = (androidx.compose.ui.text.input.TransformedText) r4
            androidx.compose.ui.text.AnnotatedString r2 = r4.getText()
            java.lang.String r4 = r2.getText()
            int r2 = r12 >> 12
            r2 = r2 & 14
            androidx.compose.runtime.State r2 = androidx.compose.foundation.interaction.FocusInteractionKt.collectIsFocusedAsState(r10, r3, r2)
            java.lang.Object r2 = r2.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0344
            androidx.compose.material3.InputPhase r2 = androidx.compose.material3.InputPhase.Focused
        L_0x0342:
            r11 = r2
            goto L_0x0353
        L_0x0344:
            r2 = r4
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r2 = r2.length()
            if (r2 != 0) goto L_0x0350
            androidx.compose.material3.InputPhase r2 = androidx.compose.material3.InputPhase.UnfocusedEmpty
            goto L_0x0342
        L_0x0350:
            androidx.compose.material3.InputPhase r2 = androidx.compose.material3.InputPhase.UnfocusedNotEmpty
            goto L_0x0342
        L_0x0353:
            androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$labelColor$1 r2 = new androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$labelColor$1
            r48 = r2
            r49 = r59
            r50 = r31
            r51 = r32
            r52 = r57
            r53 = r12
            r48.<init>(r49, r50, r51, r52, r53)
            r6 = r2
            kotlin.jvm.functions.Function3 r6 = (kotlin.jvm.functions.Function3) r6
            androidx.compose.material3.MaterialTheme r2 = androidx.compose.material3.MaterialTheme.INSTANCE
            r15 = 6
            androidx.compose.material3.Typography r2 = r2.getTypography(r3, r15)
            androidx.compose.ui.text.TextStyle r20 = r2.getBodyLarge()
            androidx.compose.ui.text.TextStyle r21 = r2.getBodySmall()
            r61 = r1
            long r0 = r20.m5151getColor0d7_KjU()
            androidx.compose.ui.graphics.Color$Companion r2 = androidx.compose.ui.graphics.Color.Companion
            long r7 = r2.m2857getUnspecified0d7_KjU()
            boolean r0 = androidx.compose.ui.graphics.Color.m2822equalsimpl0(r0, r7)
            if (r0 == 0) goto L_0x0398
            long r0 = r21.m5151getColor0d7_KjU()
            androidx.compose.ui.graphics.Color$Companion r2 = androidx.compose.ui.graphics.Color.Companion
            long r7 = r2.m2857getUnspecified0d7_KjU()
            boolean r0 = androidx.compose.ui.graphics.Color.m2822equalsimpl0(r0, r7)
            if (r0 == 0) goto L_0x03b8
        L_0x0398:
            long r0 = r20.m5151getColor0d7_KjU()
            androidx.compose.ui.graphics.Color$Companion r2 = androidx.compose.ui.graphics.Color.Companion
            long r7 = r2.m2857getUnspecified0d7_KjU()
            boolean r0 = androidx.compose.ui.graphics.Color.m2822equalsimpl0(r0, r7)
            if (r0 != 0) goto L_0x03bb
            long r0 = r21.m5151getColor0d7_KjU()
            androidx.compose.ui.graphics.Color$Companion r2 = androidx.compose.ui.graphics.Color.Companion
            long r7 = r2.m2857getUnspecified0d7_KjU()
            boolean r0 = androidx.compose.ui.graphics.Color.m2822equalsimpl0(r0, r7)
            if (r0 == 0) goto L_0x03bb
        L_0x03b8:
            r19 = 1
            goto L_0x03bd
        L_0x03bb:
            r19 = 0
        L_0x03bd:
            androidx.compose.material3.TextFieldTransitionScope r27 = androidx.compose.material3.TextFieldTransitionScope.INSTANCE
            r0 = -646388253(0xffffffffd978e5e3, float:-4.37865983E15)
            r3.startReplaceableGroup(r0)
            java.lang.String r0 = "*105@4195L10,106@4289L22"
            androidx.compose.runtime.ComposerKt.sourceInformation(r3, r0)
            androidx.compose.material3.MaterialTheme r0 = androidx.compose.material3.MaterialTheme.INSTANCE
            androidx.compose.material3.Typography r0 = r0.getTypography(r3, r15)
            androidx.compose.ui.text.TextStyle r0 = r0.getBodySmall()
            long r0 = r0.m5151getColor0d7_KjU()
            if (r19 == 0) goto L_0x03f4
            androidx.compose.ui.graphics.Color$Companion r2 = androidx.compose.ui.graphics.Color.Companion
            long r7 = r2.m2857getUnspecified0d7_KjU()
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x03e5
            goto L_0x03f4
        L_0x03e5:
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r6.invoke(r11, r3, r1)
            androidx.compose.ui.graphics.Color r0 = (androidx.compose.ui.graphics.Color) r0
            long r0 = r0.m2831unboximpl()
        L_0x03f4:
            r33 = r0
            r3.endReplaceableGroup()
            r0 = -646388060(0xffffffffd978e6a4, float:-4.37871164E15)
            r3.startReplaceableGroup(r0)
            java.lang.String r0 = "*108@4388L10,109@4482L22"
            androidx.compose.runtime.ComposerKt.sourceInformation(r3, r0)
            androidx.compose.material3.MaterialTheme r0 = androidx.compose.material3.MaterialTheme.INSTANCE
            androidx.compose.material3.Typography r0 = r0.getTypography(r3, r15)
            androidx.compose.ui.text.TextStyle r0 = r0.getBodyLarge()
            long r0 = r0.m5151getColor0d7_KjU()
            if (r19 == 0) goto L_0x042f
            androidx.compose.ui.graphics.Color$Companion r2 = androidx.compose.ui.graphics.Color.Companion
            long r7 = r2.m2857getUnspecified0d7_KjU()
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x041f
            goto L_0x042f
        L_0x041f:
            r2 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r6.invoke(r11, r3, r0)
            androidx.compose.ui.graphics.Color r0 = (androidx.compose.ui.graphics.Color) r0
            long r0 = r0.m2831unboximpl()
            goto L_0x0430
        L_0x042f:
            r2 = 0
        L_0x0430:
            r35 = r0
            r3.endReplaceableGroup()
            if (r47 == 0) goto L_0x043a
            r37 = 1
            goto L_0x043c
        L_0x043a:
            r37 = r2
        L_0x043c:
            androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3 r15 = new androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3
            r0 = r15
            r18 = r61
            r1 = r47
            r2 = r23
            r8 = r3
            r3 = r4
            r4 = r59
            r5 = r31
            r38 = r6
            r6 = r32
            r7 = r57
            r39 = r8
            r8 = r12
            r9 = r26
            r10 = r28
            r40 = r11
            r11 = r24
            r12 = r25
            r13 = r29
            r14 = r43
            r41 = r15
            r15 = r45
            r16 = r30
            r17 = r58
            r22 = r60
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r0 = 1290853831(0x4cf0ddc7, float:1.2628332E8)
            r12 = r39
            r1 = r41
            r2 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r12, r0, r2, r1)
            r9 = r0
            kotlin.jvm.functions.Function7 r9 = (kotlin.jvm.functions.Function7) r9
            r11 = 1769472(0x1b0000, float:2.479558E-39)
            r1 = r27
            r2 = r40
            r3 = r33
            r5 = r35
            r7 = r38
            r8 = r37
            r10 = r12
            r1.m1725TransitionDTcfvLk(r2, r3, r5, r7, r8, r9, r10, r11)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0499
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0499:
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r28
            r11 = r29
            r13 = r31
            r14 = r32
        L_0x04a9:
            androidx.compose.runtime.ScopeUpdateScope r15 = r12.endRestartGroup()
            if (r15 != 0) goto L_0x04b0
            goto L_0x04dc
        L_0x04b0:
            androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$4 r22 = new androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$4
            r0 = r22
            r1 = r43
            r2 = r44
            r3 = r45
            r4 = r46
            r5 = r47
            r12 = r30
            r42 = r15
            r15 = r57
            r16 = r58
            r17 = r59
            r18 = r60
            r19 = r62
            r20 = r63
            r21 = r64
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r0 = r22
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1 = r42
            r1.updateScope(r0)
        L_0x04dc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldImplKt.CommonDecorationBox(androidx.compose.material3.TextFieldType, java.lang.String, kotlin.jvm.functions.Function2, androidx.compose.ui.text.input.VisualTransformation, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.foundation.layout.PaddingValues, androidx.compose.material3.TextFieldColors, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* renamed from: Decoration-KTwxG1Y  reason: not valid java name */
    public static final void m1716DecorationKTwxG1Y(long j, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(function2, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1520066345);
        ComposerKt.sourceInformation(startRestartGroup, "C(Decoration)P(1:c#ui.graphics.Color,2):TextFieldImpl.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed((Object) textStyle) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i3 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                textStyle = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1520066345, i3, -1, "androidx.compose.material3.Decoration (TextFieldImpl.kt:274)");
            }
            Function2 composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, 1449369305, true, new TextFieldImplKt$Decoration$contentWithColor$1(j, function2, i3));
            if (textStyle != null) {
                startRestartGroup.startReplaceableGroup(1830468032);
                ComposerKt.sourceInformation(startRestartGroup, "285@11827L46");
                TextKt.ProvideTextStyle(textStyle, composableLambda, startRestartGroup, ((i3 >> 3) & 14) | 48);
            } else {
                startRestartGroup.startReplaceableGroup(1830468084);
                ComposerKt.sourceInformation(startRestartGroup, "285@11879L18");
                composableLambda.invoke(startRestartGroup, 6);
            }
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        TextStyle textStyle2 = textStyle;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TextFieldImplKt$Decoration$1(j, textStyle2, function2, i, i2));
        }
    }

    public static final int widthOrZero(Placeable placeable) {
        if (placeable != null) {
            return placeable.getWidth();
        }
        return 0;
    }

    public static final int heightOrZero(Placeable placeable) {
        if (placeable != null) {
            return placeable.getHeight();
        }
        return 0;
    }

    public static final Object getLayoutId(IntrinsicMeasurable intrinsicMeasurable) {
        Intrinsics.checkNotNullParameter(intrinsicMeasurable, "<this>");
        Object parentData = intrinsicMeasurable.getParentData();
        LayoutIdParentData layoutIdParentData = parentData instanceof LayoutIdParentData ? (LayoutIdParentData) parentData : null;
        if (layoutIdParentData != null) {
            return layoutIdParentData.getLayoutId();
        }
        return null;
    }

    static {
        float f = (float) 16;
        TextFieldPadding = Dp.m5626constructorimpl(f);
        MinFocusedLabelLineHeight = Dp.m5626constructorimpl(f);
        MinSupportingTextLineHeight = Dp.m5626constructorimpl(f);
        float f2 = (float) 48;
        IconDefaultSizeModifier = SizeKt.m547defaultMinSizeVpY3zN4(Modifier.Companion, Dp.m5626constructorimpl(f2), Dp.m5626constructorimpl(f2));
    }
}
