package androidx.compose.ui.graphics.colorspace;

import androidx.autofill.HintConstants;
import androidx.compose.ui.graphics.ColorKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 ^2\u00020\u0001:\u0001^B?\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\nBW\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0002\u0010\u0011B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014B'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0015B/\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0002\u0010\u0018B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\b¢\u0006\u0002\u0010\u001aB'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u0019\u001a\u00020\b¢\u0006\u0002\u0010\u001bB?\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u0019\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0002\u0010\u001cB\u001f\b\u0010\u0012\u0006\u0010\u001d\u001a\u00020\u0000\u0012\u0006\u0010\u001e\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u001fB[\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020 \u0012\u0006\u0010\t\u001a\u00020 \u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0002\u0010\"J\u0013\u0010<\u001a\u00020.2\b\u0010=\u001a\u0004\u0018\u00010>H\u0002J\u001e\u0010?\u001a\u00020\u00052\u0006\u0010@\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020\u000fJ\u000e\u0010?\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u0005J\u0010\u0010D\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u0005H\u0016J\u0006\u0010E\u001a\u00020\u0005J\u000e\u0010E\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u0005J\u0010\u0010F\u001a\u00020\u000f2\u0006\u0010G\u001a\u00020\u0017H\u0016J\u0010\u0010H\u001a\u00020\u000f2\u0006\u0010G\u001a\u00020\u0017H\u0016J\u0006\u0010I\u001a\u00020\u0005J\u000e\u0010I\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010J\u001a\u00020\u0005J\u000e\u0010J\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0005J\b\u0010K\u001a\u00020\u0017H\u0016J\u001e\u0010L\u001a\u00020\u00052\u0006\u0010@\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020\u000fJ\u000e\u0010L\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u0005J%\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020\u000f2\u0006\u0010P\u001a\u00020\u000f2\u0006\u0010Q\u001a\u00020\u000fH\u0010¢\u0006\u0002\bRJ\u0010\u0010S\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u0005H\u0016J%\u0010T\u001a\u00020\u000f2\u0006\u0010O\u001a\u00020\u000f2\u0006\u0010P\u001a\u00020\u000f2\u0006\u0010Q\u001a\u00020\u000fH\u0010¢\u0006\u0002\bUJ@\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020\u000f2\u0006\u0010Y\u001a\u00020\u000f2\u0006\u0010Z\u001a\u00020\u000f2\u0006\u0010[\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\\\u0010]R\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020 X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020 X\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010'R\u0014\u0010*\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020.X\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010/R\u0014\u00100\u001a\u00020.X\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010/R\u000e\u0010\u0010\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b1\u0010$R\u0014\u00102\u001a\u00020 X\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010'R\u0014\u00104\u001a\u00020 X\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010'R\u0014\u0010\u000b\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010,R\u0013\u0010!\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0014\u0010\u001e\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010,R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006_"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Rgb;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "name", "", "toXYZ", "", "oetf", "Lkotlin/Function1;", "", "eotf", "(Ljava/lang/String;[FLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "primaries", "whitePoint", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "min", "", "max", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FF)V", "function", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/TransferParameters;)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/TransferParameters;)V", "id", "", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/TransferParameters;I)V", "gamma", "(Ljava/lang/String;[FD)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;D)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;DFFI)V", "colorSpace", "transform", "(Landroidx/compose/ui/graphics/colorspace/Rgb;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;)V", "Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "transferParameters", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;[FLandroidx/compose/ui/graphics/colorspace/DoubleFunction;Landroidx/compose/ui/graphics/colorspace/DoubleFunction;FFLandroidx/compose/ui/graphics/colorspace/TransferParameters;I)V", "getEotf", "()Lkotlin/jvm/functions/Function1;", "eotfFunc", "getEotfFunc$ui_graphics_release", "()Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "eotfOrig", "getEotfOrig$ui_graphics_release", "inverseTransform", "getInverseTransform$ui_graphics_release", "()[F", "isSrgb", "", "()Z", "isWideGamut", "getOetf", "oetfFunc", "getOetfFunc$ui_graphics_release", "oetfOrig", "getOetfOrig$ui_graphics_release", "getPrimaries$ui_graphics_release", "getTransferParameters", "()Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "getTransform$ui_graphics_release", "getWhitePoint", "()Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "equals", "other", "", "fromLinear", "r", "g", "b", "v", "fromXyz", "getInverseTransform", "getMaxValue", "component", "getMinValue", "getPrimaries", "getTransform", "hashCode", "toLinear", "toXy", "", "v0", "v1", "v2", "toXy$ui_graphics_release", "toXyz", "toZ", "toZ$ui_graphics_release", "xyzaToColor", "Landroidx/compose/ui/graphics/Color;", "x", "y", "z", "a", "xyzaToColor-JlNiLsg$ui_graphics_release", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: Rgb.kt */
public final class Rgb extends ColorSpace {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final DoubleFunction DoubleIdentity = new Rgb$$ExternalSyntheticLambda1();
    private final Function1<Double, Double> eotf;
    private final DoubleFunction eotfFunc;
    private final DoubleFunction eotfOrig;
    private final float[] inverseTransform;
    private final boolean isSrgb;
    private final boolean isWideGamut;
    /* access modifiers changed from: private */
    public final float max;
    /* access modifiers changed from: private */
    public final float min;
    private final Function1<Double, Double> oetf;
    private final DoubleFunction oetfFunc;
    private final DoubleFunction oetfOrig;
    private final float[] primaries;
    private final TransferParameters transferParameters;
    private final float[] transform;
    private final WhitePoint whitePoint;

    /* access modifiers changed from: private */
    public static final double DoubleIdentity$lambda$12(double d) {
        return d;
    }

    public final Function1<Double, Double> getEotf() {
        return this.eotf;
    }

    public final DoubleFunction getEotfFunc$ui_graphics_release() {
        return this.eotfFunc;
    }

    public final DoubleFunction getEotfOrig$ui_graphics_release() {
        return this.eotfOrig;
    }

    public final float[] getInverseTransform$ui_graphics_release() {
        return this.inverseTransform;
    }

    public float getMaxValue(int i) {
        return this.max;
    }

    public float getMinValue(int i) {
        return this.min;
    }

    public final Function1<Double, Double> getOetf() {
        return this.oetf;
    }

    public final DoubleFunction getOetfFunc$ui_graphics_release() {
        return this.oetfFunc;
    }

    public final DoubleFunction getOetfOrig$ui_graphics_release() {
        return this.oetfOrig;
    }

    public final float[] getPrimaries$ui_graphics_release() {
        return this.primaries;
    }

    public final TransferParameters getTransferParameters() {
        return this.transferParameters;
    }

    public final float[] getTransform$ui_graphics_release() {
        return this.transform;
    }

    public final WhitePoint getWhitePoint() {
        return this.whitePoint;
    }

    public boolean isSrgb() {
        return this.isSrgb;
    }

    public boolean isWideGamut() {
        return this.isWideGamut;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Rgb(java.lang.String r16, float[] r17, androidx.compose.ui.graphics.colorspace.WhitePoint r18, float[] r19, androidx.compose.ui.graphics.colorspace.DoubleFunction r20, androidx.compose.ui.graphics.colorspace.DoubleFunction r21, float r22, float r23, androidx.compose.ui.graphics.colorspace.TransferParameters r24, int r25) {
        /*
            r15 = this;
            r6 = r15
            r7 = r17
            r9 = r18
            r8 = r19
            r10 = r20
            r11 = r21
            r12 = r22
            r13 = r23
            java.lang.String r0 = "name"
            r1 = r16
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "primaries"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "whitePoint"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "oetf"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "eotf"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            androidx.compose.ui.graphics.colorspace.ColorModel$Companion r0 = androidx.compose.ui.graphics.colorspace.ColorModel.Companion
            long r2 = r0.m3266getRgbxdoWZVw()
            r5 = 0
            r0 = r15
            r4 = r25
            r0.<init>(r1, r2, r4, r5)
            r6.whitePoint = r9
            r6.min = r12
            r6.max = r13
            r0 = r24
            r6.transferParameters = r0
            r6.oetfOrig = r10
            androidx.compose.ui.graphics.colorspace.Rgb$oetf$1 r0 = new androidx.compose.ui.graphics.colorspace.Rgb$oetf$1
            r0.<init>(r15)
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r6.oetf = r0
            androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda7 r0 = new androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda7
            r0.<init>(r15)
            r6.oetfFunc = r0
            r6.eotfOrig = r11
            androidx.compose.ui.graphics.colorspace.Rgb$eotf$1 r0 = new androidx.compose.ui.graphics.colorspace.Rgb$eotf$1
            r0.<init>(r15)
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r6.eotf = r0
            androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda8 r0 = new androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda8
            r0.<init>(r15)
            r6.eotfFunc = r0
            int r0 = r7.length
            r1 = 6
            r2 = 9
            if (r0 == r1) goto L_0x007c
            int r0 = r7.length
            if (r0 != r2) goto L_0x0074
            goto L_0x007c
        L_0x0074:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ"
            r0.<init>(r1)
            throw r0
        L_0x007c:
            int r0 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x00cf
            androidx.compose.ui.graphics.colorspace.Rgb$Companion r0 = Companion
            float[] r1 = r0.xyPrimaries(r7)
            r6.primaries = r1
            if (r8 != 0) goto L_0x0091
            float[] r2 = r0.computeXYZMatrix(r1, r9)
            r6.transform = r2
            goto L_0x0096
        L_0x0091:
            int r3 = r8.length
            if (r3 != r2) goto L_0x00b9
            r6.transform = r8
        L_0x0096:
            float[] r2 = r6.transform
            float[] r2 = androidx.compose.ui.graphics.colorspace.ColorSpaceKt.inverse3x3(r2)
            r6.inverseTransform = r2
            boolean r2 = r0.isWideGamut(r1, r12, r13)
            r6.isWideGamut = r2
            r7 = r0
            r8 = r1
            r9 = r18
            r10 = r20
            r11 = r21
            r12 = r22
            r13 = r23
            r14 = r25
            boolean r0 = r7.isSrgb(r8, r9, r10, r11, r12, r13, r14)
            r6.isSrgb = r0
            return
        L_0x00b9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Transform must have 9 entries! Has "
            r1.<init>(r2)
            int r2 = r8.length
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00cf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid range: min="
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r12)
            java.lang.String r2 = ", max="
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r13)
            java.lang.String r2 = "; min must be strictly < max"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], androidx.compose.ui.graphics.colorspace.WhitePoint, float[], androidx.compose.ui.graphics.colorspace.DoubleFunction, androidx.compose.ui.graphics.colorspace.DoubleFunction, float, float, androidx.compose.ui.graphics.colorspace.TransferParameters, int):void");
    }

    /* access modifiers changed from: private */
    public static final double oetfFunc$lambda$0(Rgb rgb, double d) {
        Intrinsics.checkNotNullParameter(rgb, "this$0");
        return RangesKt.coerceIn(rgb.oetfOrig.invoke(d), (double) rgb.min, (double) rgb.max);
    }

    /* access modifiers changed from: private */
    public static final double eotfFunc$lambda$1(Rgb rgb, double d) {
        Intrinsics.checkNotNullParameter(rgb, "this$0");
        return rgb.eotfOrig.invoke(RangesKt.coerceIn(d, (double) rgb.min, (double) rgb.max));
    }

    public final float[] getPrimaries() {
        float[] fArr = this.primaries;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    public final float[] getTransform() {
        float[] fArr = this.transform;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    public final float[] getInverseTransform() {
        float[] fArr = this.inverseTransform;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Rgb(java.lang.String r16, float[] r17, kotlin.jvm.functions.Function1<? super java.lang.Double, java.lang.Double> r18, kotlin.jvm.functions.Function1<? super java.lang.Double, java.lang.Double> r19) {
        /*
            r15 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.String r3 = "name"
            r5 = r16
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)
            java.lang.String r3 = "toXYZ"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            java.lang.String r3 = "oetf"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            java.lang.String r3 = "eotf"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            androidx.compose.ui.graphics.colorspace.Rgb$Companion r3 = Companion
            float[] r6 = r3.computePrimaries$ui_graphics_release(r0)
            androidx.compose.ui.graphics.colorspace.WhitePoint r7 = r3.computeWhitePoint(r0)
            r8 = 0
            androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda5 r9 = new androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda5
            r9.<init>(r1)
            androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda6 r10 = new androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda6
            r10.<init>(r2)
            r11 = 0
            r12 = 1065353216(0x3f800000, float:1.0)
            r13 = 0
            r14 = -1
            r4 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):void");
    }

    /* access modifiers changed from: private */
    public static final double _init_$lambda$2(Function1 function1, double d) {
        Intrinsics.checkNotNullParameter(function1, "$oetf");
        return ((Number) function1.invoke(Double.valueOf(d))).doubleValue();
    }

    /* access modifiers changed from: private */
    public static final double _init_$lambda$3(Function1 function1, double d) {
        Intrinsics.checkNotNullParameter(function1, "$eotf");
        return ((Number) function1.invoke(Double.valueOf(d))).doubleValue();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Rgb(java.lang.String r15, float[] r16, androidx.compose.ui.graphics.colorspace.WhitePoint r17, kotlin.jvm.functions.Function1<? super java.lang.Double, java.lang.Double> r18, kotlin.jvm.functions.Function1<? super java.lang.Double, java.lang.Double> r19, float r20, float r21) {
        /*
            r14 = this;
            r0 = r18
            r1 = r19
            java.lang.String r2 = "name"
            r4 = r15
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r2)
            java.lang.String r2 = "primaries"
            r5 = r16
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            java.lang.String r2 = "whitePoint"
            r6 = r17
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            java.lang.String r2 = "oetf"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            java.lang.String r2 = "eotf"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r7 = 0
            androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda0 r8 = new androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda0
            r8.<init>(r0)
            androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda4 r9 = new androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda4
            r9.<init>(r1)
            r12 = 0
            r13 = -1
            r3 = r14
            r10 = r20
            r11 = r21
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], androidx.compose.ui.graphics.colorspace.WhitePoint, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, float, float):void");
    }

    /* access modifiers changed from: private */
    public static final double _init_$lambda$4(Function1 function1, double d) {
        Intrinsics.checkNotNullParameter(function1, "$oetf");
        return ((Number) function1.invoke(Double.valueOf(d))).doubleValue();
    }

    /* access modifiers changed from: private */
    public static final double _init_$lambda$5(Function1 function1, double d) {
        Intrinsics.checkNotNullParameter(function1, "$eotf");
        return ((Number) function1.invoke(Double.valueOf(d))).doubleValue();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Rgb(java.lang.String r8, float[] r9, androidx.compose.ui.graphics.colorspace.TransferParameters r10) {
        /*
            r7 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "toXYZ"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "function"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            androidx.compose.ui.graphics.colorspace.Rgb$Companion r0 = Companion
            float[] r3 = r0.computePrimaries$ui_graphics_release(r9)
            androidx.compose.ui.graphics.colorspace.WhitePoint r4 = r0.computeWhitePoint(r9)
            r6 = -1
            r1 = r7
            r2 = r8
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], androidx.compose.ui.graphics.colorspace.TransferParameters):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Rgb(String str, float[] fArr, WhitePoint whitePoint2, TransferParameters transferParameters2) {
        this(str, fArr, whitePoint2, transferParameters2, -1);
        Intrinsics.checkNotNullParameter(str, HintConstants.AUTOFILL_HINT_NAME);
        Intrinsics.checkNotNullParameter(fArr, "primaries");
        Intrinsics.checkNotNullParameter(whitePoint2, "whitePoint");
        Intrinsics.checkNotNullParameter(transferParameters2, "function");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Rgb(java.lang.String r13, float[] r14, androidx.compose.ui.graphics.colorspace.WhitePoint r15, androidx.compose.ui.graphics.colorspace.TransferParameters r16, int r17) {
        /*
            r12 = this;
            r9 = r16
            java.lang.String r0 = "name"
            r1 = r13
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "primaries"
            r2 = r14
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "whitePoint"
            r3 = r15
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "function"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r4 = 0
            double r5 = r16.getE()
            r7 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0036
            double r5 = r16.getF()
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0036
            androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda9 r0 = new androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda9
            r0.<init>(r9)
            goto L_0x003b
        L_0x0036:
            androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda10 r0 = new androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda10
            r0.<init>(r9)
        L_0x003b:
            r5 = r0
            double r10 = r16.getE()
            int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0052
            double r10 = r16.getF()
            int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0052
            androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda11 r0 = new androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda11
            r0.<init>(r9)
            goto L_0x0057
        L_0x0052:
            androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda12 r0 = new androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda12
            r0.<init>(r9)
        L_0x0057:
            r6 = r0
            r7 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r9 = r16
            r10 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], androidx.compose.ui.graphics.colorspace.WhitePoint, androidx.compose.ui.graphics.colorspace.TransferParameters, int):void");
    }

    /* access modifiers changed from: private */
    public static final double _init_$lambda$6(TransferParameters transferParameters2, double d) {
        Intrinsics.checkNotNullParameter(transferParameters2, "$function");
        return ColorSpaceKt.rcpResponse(d, transferParameters2.getA(), transferParameters2.getB(), transferParameters2.getC(), transferParameters2.getD(), transferParameters2.getGamma());
    }

    /* access modifiers changed from: private */
    public static final double _init_$lambda$7(TransferParameters transferParameters2, double d) {
        Intrinsics.checkNotNullParameter(transferParameters2, "$function");
        return ColorSpaceKt.rcpResponse(d, transferParameters2.getA(), transferParameters2.getB(), transferParameters2.getC(), transferParameters2.getD(), transferParameters2.getE(), transferParameters2.getF(), transferParameters2.getGamma());
    }

    /* access modifiers changed from: private */
    public static final double _init_$lambda$8(TransferParameters transferParameters2, double d) {
        Intrinsics.checkNotNullParameter(transferParameters2, "$function");
        return ColorSpaceKt.response(d, transferParameters2.getA(), transferParameters2.getB(), transferParameters2.getC(), transferParameters2.getD(), transferParameters2.getGamma());
    }

    /* access modifiers changed from: private */
    public static final double _init_$lambda$9(TransferParameters transferParameters2, double d) {
        Intrinsics.checkNotNullParameter(transferParameters2, "$function");
        return ColorSpaceKt.response(d, transferParameters2.getA(), transferParameters2.getB(), transferParameters2.getC(), transferParameters2.getD(), transferParameters2.getE(), transferParameters2.getF(), transferParameters2.getGamma());
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Rgb(java.lang.String r11, float[] r12, double r13) {
        /*
            r10 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "toXYZ"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            androidx.compose.ui.graphics.colorspace.Rgb$Companion r0 = Companion
            float[] r3 = r0.computePrimaries$ui_graphics_release(r12)
            androidx.compose.ui.graphics.colorspace.WhitePoint r4 = r0.computeWhitePoint(r12)
            r7 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = -1
            r1 = r10
            r2 = r11
            r5 = r13
            r1.<init>((java.lang.String) r2, (float[]) r3, (androidx.compose.ui.graphics.colorspace.WhitePoint) r4, (double) r5, (float) r7, (float) r8, (int) r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], double):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Rgb(String str, float[] fArr, WhitePoint whitePoint2, double d) {
        this(str, fArr, whitePoint2, d, 0.0f, 1.0f, -1);
        Intrinsics.checkNotNullParameter(str, HintConstants.AUTOFILL_HINT_NAME);
        Intrinsics.checkNotNullParameter(fArr, "primaries");
        Intrinsics.checkNotNullParameter(whitePoint2, "whitePoint");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Rgb(java.lang.String r24, float[] r25, androidx.compose.ui.graphics.colorspace.WhitePoint r26, double r27, float r29, float r30, int r31) {
        /*
            r23 = this;
            r1 = r27
            java.lang.String r0 = "name"
            r15 = r24
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "primaries"
            r13 = r25
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "whitePoint"
            r14 = r26
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            r17 = 0
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0025
            androidx.compose.ui.graphics.colorspace.DoubleFunction r3 = DoubleIdentity
            goto L_0x002a
        L_0x0025:
            androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda2 r3 = new androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda2
            r3.<init>(r1)
        L_0x002a:
            r18 = r3
            if (r0 != 0) goto L_0x0031
            androidx.compose.ui.graphics.colorspace.DoubleFunction r0 = DoubleIdentity
            goto L_0x0036
        L_0x0031:
            androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda3 r0 = new androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda3
            r0.<init>(r1)
        L_0x0036:
            r19 = r0
            androidx.compose.ui.graphics.colorspace.TransferParameters r20 = new androidx.compose.ui.graphics.colorspace.TransferParameters
            r0 = r20
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r5 = 0
            r7 = 0
            r9 = 0
            r11 = 0
            r21 = 0
            r13 = r21
            r16 = 96
            r15 = r16
            r16 = 0
            r1 = r27
            r0.<init>(r1, r3, r5, r7, r9, r11, r13, r15, r16)
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r29
            r9 = r30
            r10 = r20
            r11 = r31
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], androidx.compose.ui.graphics.colorspace.WhitePoint, double, float, float, int):void");
    }

    /* access modifiers changed from: private */
    public static final double _init_$lambda$10(double d, double d2) {
        if (d2 < 0.0d) {
            d2 = 0.0d;
        }
        return Math.pow(d2, 1.0d / d);
    }

    /* access modifiers changed from: private */
    public static final double _init_$lambda$11(double d, double d2) {
        if (d2 < 0.0d) {
            d2 = 0.0d;
        }
        return Math.pow(d2, d);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Rgb(Rgb rgb, float[] fArr, WhitePoint whitePoint2) {
        this(rgb.getName(), rgb.primaries, whitePoint2, fArr, rgb.oetfOrig, rgb.eotfOrig, rgb.min, rgb.max, rgb.transferParameters, -1);
        Intrinsics.checkNotNullParameter(rgb, "colorSpace");
        Intrinsics.checkNotNullParameter(fArr, "transform");
        Intrinsics.checkNotNullParameter(whitePoint2, "whitePoint");
    }

    public final float[] getPrimaries(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "primaries");
        return ArraysKt.copyInto$default(this.primaries, fArr, 0, 0, 0, 14, (Object) null);
    }

    public final float[] getTransform(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "transform");
        return ArraysKt.copyInto$default(this.transform, fArr, 0, 0, 0, 14, (Object) null);
    }

    public final float[] getInverseTransform(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "inverseTransform");
        return ArraysKt.copyInto$default(this.inverseTransform, fArr, 0, 0, 0, 14, (Object) null);
    }

    public final float[] toLinear(float f, float f2, float f3) {
        return toLinear(new float[]{f, f2, f3});
    }

    public final float[] toLinear(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "v");
        fArr[0] = (float) this.eotfFunc.invoke((double) fArr[0]);
        fArr[1] = (float) this.eotfFunc.invoke((double) fArr[1]);
        fArr[2] = (float) this.eotfFunc.invoke((double) fArr[2]);
        return fArr;
    }

    public final float[] fromLinear(float f, float f2, float f3) {
        return fromLinear(new float[]{f, f2, f3});
    }

    public final float[] fromLinear(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "v");
        fArr[0] = (float) this.oetfFunc.invoke((double) fArr[0]);
        fArr[1] = (float) this.oetfFunc.invoke((double) fArr[1]);
        fArr[2] = (float) this.oetfFunc.invoke((double) fArr[2]);
        return fArr;
    }

    public float[] toXyz(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "v");
        fArr[0] = (float) this.eotfFunc.invoke((double) fArr[0]);
        fArr[1] = (float) this.eotfFunc.invoke((double) fArr[1]);
        fArr[2] = (float) this.eotfFunc.invoke((double) fArr[2]);
        return ColorSpaceKt.mul3x3Float3(this.transform, fArr);
    }

    public long toXy$ui_graphics_release(float f, float f2, float f3) {
        float invoke = (float) this.eotfFunc.invoke((double) f);
        float invoke2 = (float) this.eotfFunc.invoke((double) f2);
        float invoke3 = (float) this.eotfFunc.invoke((double) f3);
        return (((long) Float.floatToIntBits(ColorSpaceKt.mul3x3Float3_0(this.transform, invoke, invoke2, invoke3))) << 32) | (((long) Float.floatToIntBits(ColorSpaceKt.mul3x3Float3_1(this.transform, invoke, invoke2, invoke3))) & 4294967295L);
    }

    public float toZ$ui_graphics_release(float f, float f2, float f3) {
        return ColorSpaceKt.mul3x3Float3_2(this.transform, (float) this.eotfFunc.invoke((double) f), (float) this.eotfFunc.invoke((double) f2), (float) this.eotfFunc.invoke((double) f3));
    }

    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics_release  reason: not valid java name */
    public long m3297xyzaToColorJlNiLsg$ui_graphics_release(float f, float f2, float f3, float f4, ColorSpace colorSpace) {
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        return ColorKt.Color((float) this.oetfFunc.invoke((double) ColorSpaceKt.mul3x3Float3_0(this.inverseTransform, f, f2, f3)), (float) this.oetfFunc.invoke((double) ColorSpaceKt.mul3x3Float3_1(this.inverseTransform, f, f2, f3)), (float) this.oetfFunc.invoke((double) ColorSpaceKt.mul3x3Float3_2(this.inverseTransform, f, f2, f3)), f4, colorSpace);
    }

    public float[] fromXyz(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "v");
        ColorSpaceKt.mul3x3Float3(this.inverseTransform, fArr);
        fArr[0] = (float) this.oetfFunc.invoke((double) fArr[0]);
        fArr[1] = (float) this.oetfFunc.invoke((double) fArr[1]);
        fArr[2] = (float) this.oetfFunc.invoke((double) fArr[2]);
        return fArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        Rgb rgb = (Rgb) obj;
        if (Float.compare(rgb.min, this.min) != 0 || Float.compare(rgb.max, this.max) != 0 || !Intrinsics.areEqual((Object) this.whitePoint, (Object) rgb.whitePoint) || !Arrays.equals(this.primaries, rgb.primaries)) {
            return false;
        }
        TransferParameters transferParameters2 = this.transferParameters;
        if (transferParameters2 != null) {
            return Intrinsics.areEqual((Object) transferParameters2, (Object) rgb.transferParameters);
        }
        if (rgb.transferParameters == null) {
            return true;
        }
        if (!Intrinsics.areEqual((Object) this.oetfOrig, (Object) rgb.oetfOrig)) {
            return false;
        }
        return Intrinsics.areEqual((Object) this.eotfOrig, (Object) rgb.eotfOrig);
    }

    public int hashCode() {
        int i;
        int i2;
        int hashCode = ((((super.hashCode() * 31) + this.whitePoint.hashCode()) * 31) + Arrays.hashCode(this.primaries)) * 31;
        float f = this.min;
        int i3 = 0;
        if (f == 0.0f) {
            i = 0;
        } else {
            i = Float.floatToIntBits(f);
        }
        int i4 = (hashCode + i) * 31;
        float f2 = this.max;
        if (f2 == 0.0f) {
            i2 = 0;
        } else {
            i2 = Float.floatToIntBits(f2);
        }
        int i5 = (i4 + i2) * 31;
        TransferParameters transferParameters2 = this.transferParameters;
        if (transferParameters2 != null) {
            i3 = transferParameters2.hashCode();
        }
        int i6 = i5 + i3;
        return this.transferParameters == null ? (((i6 * 31) + this.oetfOrig.hashCode()) * 31) + this.eotfOrig.hashCode() : i6;
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J\u0015\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0000¢\u0006\u0002\b\u0011J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\bH\u0002J\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0013H\u0002J\u0018\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bH\u0002J(\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006H\u0002J@\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020$H\u0002J \u0010%\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0006H\u0002J\u0010\u0010&\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Rgb$Companion;", "", "()V", "DoubleIdentity", "Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "area", "", "primaries", "", "compare", "", "point", "", "a", "b", "computePrimaries", "toXYZ", "computePrimaries$ui_graphics_release", "computeWhitePoint", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "computeXYZMatrix", "whitePoint", "contains", "p1", "p2", "cross", "ax", "ay", "bx", "by", "isSrgb", "OETF", "EOTF", "min", "max", "id", "", "isWideGamut", "xyPrimaries", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: Rgb.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final float cross(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        private Companion() {
        }

        /* access modifiers changed from: private */
        public final boolean isSrgb(float[] fArr, WhitePoint whitePoint, DoubleFunction doubleFunction, DoubleFunction doubleFunction2, float f, float f2, int i) {
            if (i == 0) {
                return true;
            }
            if (!ColorSpaceKt.compare(fArr, ColorSpaces.INSTANCE.getSrgbPrimaries$ui_graphics_release()) || !ColorSpaceKt.compare(whitePoint, Illuminant.INSTANCE.getD65()) || f != 0.0f || f2 != 1.0f) {
                return false;
            }
            Rgb srgb = ColorSpaces.INSTANCE.getSrgb();
            for (double d = 0.0d; d <= 1.0d; d += 0.00392156862745098d) {
                if (!compare(d, doubleFunction, srgb.getOetfOrig$ui_graphics_release()) || !compare(d, doubleFunction2, srgb.getEotfOrig$ui_graphics_release())) {
                    return false;
                }
            }
            return true;
        }

        private final boolean compare(double d, DoubleFunction doubleFunction, DoubleFunction doubleFunction2) {
            return Math.abs(doubleFunction.invoke(d) - doubleFunction2.invoke(d)) <= 0.001d;
        }

        /* access modifiers changed from: private */
        public final boolean isWideGamut(float[] fArr, float f, float f2) {
            return (area(fArr) / area(ColorSpaces.INSTANCE.getNtsc1953Primaries$ui_graphics_release()) > 0.9f && contains(fArr, ColorSpaces.INSTANCE.getSrgbPrimaries$ui_graphics_release())) || (f < 0.0f && f2 > 1.0f);
        }

        private final float area(float[] fArr) {
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            float f4 = fArr[3];
            float f5 = fArr[4];
            float f6 = fArr[5];
            float f7 = ((((((f * f4) + (f2 * f5)) + (f3 * f6)) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
            return f7 < 0.0f ? -f7 : f7;
        }

        private final boolean contains(float[] fArr, float[] fArr2) {
            float f = fArr[0] - fArr2[0];
            float f2 = fArr[1] - fArr2[1];
            float[] fArr3 = {f, f2, fArr[2] - fArr2[2], fArr[3] - fArr2[3], fArr[4] - fArr2[4], fArr[5] - fArr2[5]};
            if (cross(f, f2, fArr2[0] - fArr2[4], fArr2[1] - fArr2[5]) < 0.0f || cross(fArr2[0] - fArr2[2], fArr2[1] - fArr2[3], fArr3[0], fArr3[1]) < 0.0f || cross(fArr3[2], fArr3[3], fArr2[2] - fArr2[0], fArr2[3] - fArr2[1]) < 0.0f || cross(fArr2[2] - fArr2[4], fArr2[3] - fArr2[5], fArr3[2], fArr3[3]) < 0.0f || cross(fArr3[4], fArr3[5], fArr2[4] - fArr2[2], fArr2[5] - fArr2[3]) < 0.0f || cross(fArr2[4] - fArr2[0], fArr2[5] - fArr2[1], fArr3[4], fArr3[5]) < 0.0f) {
                return false;
            }
            return true;
        }

        public final float[] computePrimaries$ui_graphics_release(float[] fArr) {
            Intrinsics.checkNotNullParameter(fArr, "toXYZ");
            float[] mul3x3Float3 = ColorSpaceKt.mul3x3Float3(fArr, new float[]{1.0f, 0.0f, 0.0f});
            float[] mul3x3Float32 = ColorSpaceKt.mul3x3Float3(fArr, new float[]{0.0f, 1.0f, 0.0f});
            float[] mul3x3Float33 = ColorSpaceKt.mul3x3Float3(fArr, new float[]{0.0f, 0.0f, 1.0f});
            float f = mul3x3Float3[0];
            float f2 = mul3x3Float3[1];
            float f3 = f + f2 + mul3x3Float3[2];
            float f4 = mul3x3Float32[0] + mul3x3Float32[1] + mul3x3Float32[2];
            float f5 = mul3x3Float33[0] + mul3x3Float33[1] + mul3x3Float33[2];
            return new float[]{f / f3, f2 / f3, mul3x3Float32[0] / f4, mul3x3Float32[1] / f4, mul3x3Float33[0] / f5, mul3x3Float33[1] / f5};
        }

        /* access modifiers changed from: private */
        public final WhitePoint computeWhitePoint(float[] fArr) {
            float[] mul3x3Float3 = ColorSpaceKt.mul3x3Float3(fArr, new float[]{1.0f, 1.0f, 1.0f});
            float f = mul3x3Float3[0] + mul3x3Float3[1] + mul3x3Float3[2];
            return new WhitePoint(mul3x3Float3[0] / f, mul3x3Float3[1] / f);
        }

        /* access modifiers changed from: private */
        public final float[] xyPrimaries(float[] fArr) {
            float[] fArr2 = new float[6];
            if (fArr.length == 9) {
                float f = fArr[0];
                float f2 = fArr[1];
                float f3 = f + f2 + fArr[2];
                fArr2[0] = f / f3;
                fArr2[1] = f2 / f3;
                float f4 = fArr[3];
                float f5 = fArr[4];
                float f6 = f4 + f5 + fArr[5];
                fArr2[2] = f4 / f6;
                fArr2[3] = f5 / f6;
                float f7 = fArr[6];
                float f8 = fArr[7];
                float f9 = f7 + f8 + fArr[8];
                fArr2[4] = f7 / f9;
                fArr2[5] = f8 / f9;
            } else {
                ArraysKt.copyInto$default(fArr, fArr2, 0, 0, 6, 6, (Object) null);
            }
            return fArr2;
        }

        /* access modifiers changed from: private */
        public final float[] computeXYZMatrix(float[] fArr, WhitePoint whitePoint) {
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            float f4 = fArr[3];
            float f5 = fArr[4];
            float f6 = fArr[5];
            float x = whitePoint.getX();
            float y = whitePoint.getY();
            float f7 = (float) 1;
            float f8 = (f7 - f) / f2;
            float f9 = f / f2;
            float f10 = (f3 / f4) - f9;
            float f11 = (x / y) - f9;
            float f12 = ((f7 - f3) / f4) - f8;
            float f13 = (f5 / f6) - f9;
            float f14 = (((((f7 - x) / y) - f8) * f10) - (f11 * f12)) / (((((f7 - f5) / f6) - f8) * f10) - (f12 * f13));
            float f15 = (f11 - (f13 * f14)) / f10;
            float f16 = (1.0f - f15) - f14;
            float f17 = f16 / f2;
            float f18 = f15 / f4;
            float f19 = f14 / f6;
            return new float[]{f17 * f, f16, f17 * ((1.0f - f) - f2), f18 * f3, f15, f18 * ((1.0f - f3) - f4), f19 * f5, f14, f19 * ((1.0f - f5) - f6)};
        }
    }
}
