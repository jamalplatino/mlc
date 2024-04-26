package androidx.compose.ui.text.android;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.compose.ui.text.android.style.BaselineShiftSpan;
import androidx.compose.ui.text.android.style.IndentationFixSpanKt;
import androidx.compose.ui.text.android.style.LineHeightStyleSpan;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00012\u00020\u0001:\u0002\u0001BÅ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t\u0012\b\b\u0002\u0010\u0014\u001a\u00020\t\u0012\b\b\u0002\u0010\u0015\u001a\u00020\t\u0012\b\b\u0002\u0010\u0016\u001a\u00020\t\u0012\b\b\u0002\u0010\u0017\u001a\u00020\t\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001c¢\u0006\u0002\u0010\u001dJ&\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020\t2\u0006\u0010S\u001a\u00020\t2\u0006\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020\tJ\u000e\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020\tJ\u0010\u0010Z\u001a\u00020\u00052\u0006\u0010[\u001a\u00020\tH\u0002J\u000e\u0010\\\u001a\u00020\u00052\u0006\u0010[\u001a\u00020\tJ\u000e\u0010]\u001a\u00020\u00052\u0006\u0010[\u001a\u00020\tJ\u000e\u0010^\u001a\u00020\u00052\u0006\u0010[\u001a\u00020\tJ\u000e\u0010_\u001a\u00020\u00052\u0006\u0010[\u001a\u00020\tJ\u000e\u0010`\u001a\u00020\t2\u0006\u0010a\u001a\u00020\tJ\u000e\u0010b\u001a\u00020\t2\u0006\u0010a\u001a\u00020\tJ\u000e\u0010c\u001a\u00020\t2\u0006\u0010a\u001a\u00020\tJ\u000e\u0010d\u001a\u00020\t2\u0006\u0010Y\u001a\u00020\tJ\u000e\u0010e\u001a\u00020\t2\u0006\u0010f\u001a\u00020\tJ\u000e\u0010g\u001a\u00020\u00052\u0006\u0010a\u001a\u00020\tJ\u000e\u0010h\u001a\u00020\u00052\u0006\u0010a\u001a\u00020\tJ\u000e\u0010i\u001a\u00020\u00052\u0006\u0010a\u001a\u00020\tJ\u000e\u0010j\u001a\u00020\t2\u0006\u0010a\u001a\u00020\tJ\u000e\u0010k\u001a\u00020\u00052\u0006\u0010[\u001a\u00020\tJ\u000e\u0010l\u001a\u00020\t2\u0006\u0010a\u001a\u00020\tJ\u000e\u0010m\u001a\u00020\u00052\u0006\u0010a\u001a\u00020\tJ\u0016\u0010n\u001a\u00020\t2\u0006\u0010[\u001a\u00020\t2\u0006\u0010o\u001a\u00020\u0005J\u000e\u0010p\u001a\u00020\t2\u0006\u0010[\u001a\u00020\tJ\u0018\u0010q\u001a\u00020\u00052\u0006\u0010Y\u001a\u00020\t2\b\b\u0002\u0010r\u001a\u00020\u0010J\u0018\u0010s\u001a\u00020\u00052\u0006\u0010Y\u001a\u00020\t2\b\b\u0002\u0010r\u001a\u00020\u0010J\u001e\u0010t\u001a\u00020Q2\u0006\u0010u\u001a\u00020\t2\u0006\u0010v\u001a\u00020\t2\u0006\u0010w\u001a\u00020xJ\r\u0010y\u001a\u00020\u0010H\u0000¢\u0006\u0002\bzJ\u000e\u0010{\u001a\u00020\u00102\u0006\u0010a\u001a\u00020\tJ\u000e\u0010|\u001a\u00020\u00102\u0006\u0010Y\u001a\u00020\tJ\u000e\u0010}\u001a\u00020Q2\u0006\u0010~\u001a\u00020R\u001c\u0010\u001e\u001a\u00020\t8\u0000X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0011\u0010'\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b(\u0010\"R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b)\u0010%R\u000e\u0010*\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010.\u001a\u00020/8\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b0\u0010 \u001a\u0004\b1\u00102R\u001b\u00103\u001a\u0002048BX\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b5\u00106R\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u000e\u0010;\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010<\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b=\u0010\"R\u0016\u0010>\u001a\b\u0012\u0004\u0012\u00020@0?X\u0004¢\u0006\u0004\n\u0002\u0010AR\u0011\u0010B\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0011\u0010E\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bF\u0010DR\u000e\u0010G\u001a\u00020HX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010J\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bK\u0010LR\u001c\u0010M\u001a\u00020\t8\u0000X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bN\u0010 \u001a\u0004\bO\u0010\"¨\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/android/TextLayout;", "", "charSequence", "", "width", "", "textPaint", "Landroid/text/TextPaint;", "alignment", "", "ellipsize", "Landroid/text/TextUtils$TruncateAt;", "textDirectionHeuristic", "lineSpacingMultiplier", "lineSpacingExtra", "includePadding", "", "fallbackLineSpacing", "maxLines", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", "hyphenationFrequency", "justificationMode", "leftIndents", "", "rightIndents", "layoutIntrinsics", "Landroidx/compose/ui/text/android/LayoutIntrinsics;", "(Ljava/lang/CharSequence;FLandroid/text/TextPaint;ILandroid/text/TextUtils$TruncateAt;IFFZZIIIIII[I[ILandroidx/compose/ui/text/android/LayoutIntrinsics;)V", "bottomPadding", "getBottomPadding$ui_text_release$annotations", "()V", "getBottomPadding$ui_text_release", "()I", "didExceedMaxLines", "getDidExceedMaxLines", "()Z", "getFallbackLineSpacing", "height", "getHeight", "getIncludePadding", "isBoringLayout", "lastLineExtra", "lastLineFontMetrics", "Landroid/graphics/Paint$FontMetricsInt;", "layout", "Landroid/text/Layout;", "getLayout$annotations", "getLayout", "()Landroid/text/Layout;", "layoutHelper", "Landroidx/compose/ui/text/android/LayoutHelper;", "getLayoutHelper", "()Landroidx/compose/ui/text/android/LayoutHelper;", "layoutHelper$delegate", "Lkotlin/Lazy;", "getLayoutIntrinsics", "()Landroidx/compose/ui/text/android/LayoutIntrinsics;", "leftPadding", "lineCount", "getLineCount", "lineHeightSpans", "", "Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;", "[Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;", "maxIntrinsicWidth", "getMaxIntrinsicWidth", "()F", "minIntrinsicWidth", "getMinIntrinsicWidth", "rect", "Landroid/graphics/Rect;", "rightPadding", "text", "getText", "()Ljava/lang/CharSequence;", "topPadding", "getTopPadding$ui_text_release$annotations", "getTopPadding$ui_text_release", "fillBoundingBoxes", "", "startOffset", "endOffset", "array", "", "arrayStart", "getBoundingBox", "Landroid/graphics/RectF;", "offset", "getHorizontalPadding", "line", "getLineAscent", "getLineBaseline", "getLineBottom", "getLineDescent", "getLineEllipsisCount", "lineIndex", "getLineEllipsisOffset", "getLineEnd", "getLineForOffset", "getLineForVertical", "vertical", "getLineHeight", "getLineLeft", "getLineRight", "getLineStart", "getLineTop", "getLineVisibleEnd", "getLineWidth", "getOffsetForHorizontal", "horizontal", "getParagraphDirection", "getPrimaryHorizontal", "upstream", "getSecondaryHorizontal", "getSelectionPath", "start", "end", "dest", "Landroid/graphics/Path;", "isFallbackLinespacingApplied", "isFallbackLinespacingApplied$ui_text_release", "isLineEllipsized", "isRtlCharAt", "paint", "canvas", "Landroid/graphics/Canvas;", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: TextLayout.kt */
public final class TextLayout {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final int bottomPadding;
    private final boolean didExceedMaxLines;
    private final boolean fallbackLineSpacing;
    private final boolean includePadding;
    private final boolean isBoringLayout;
    private final int lastLineExtra;
    private final Paint.FontMetricsInt lastLineFontMetrics;
    private final Layout layout;
    private final Lazy layoutHelper$delegate;
    private final LayoutIntrinsics layoutIntrinsics;
    private final float leftPadding;
    private final int lineCount;
    private final LineHeightStyleSpan[] lineHeightSpans;
    private final Rect rect;
    private final float rightPadding;
    private final int topPadding;

    public static /* synthetic */ void getBottomPadding$ui_text_release$annotations() {
    }

    private final float getHorizontalPadding(int i) {
        if (i == this.lineCount - 1) {
            return this.leftPadding + this.rightPadding;
        }
        return 0.0f;
    }

    public static /* synthetic */ void getLayout$annotations() {
    }

    public static /* synthetic */ void getTopPadding$ui_text_release$annotations() {
    }

    public final int getBottomPadding$ui_text_release() {
        return this.bottomPadding;
    }

    public final boolean getDidExceedMaxLines() {
        return this.didExceedMaxLines;
    }

    public final boolean getFallbackLineSpacing() {
        return this.fallbackLineSpacing;
    }

    public final boolean getIncludePadding() {
        return this.includePadding;
    }

    public final Layout getLayout() {
        return this.layout;
    }

    public final LayoutIntrinsics getLayoutIntrinsics() {
        return this.layoutIntrinsics;
    }

    public final int getLineCount() {
        return this.lineCount;
    }

    public final int getTopPadding$ui_text_release() {
        return this.topPadding;
    }

    /* JADX INFO: finally extract failed */
    public TextLayout(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, float f2, float f3, boolean z, boolean z2, int i3, int i4, int i5, int i6, int i7, int i8, int[] iArr, int[] iArr2, LayoutIntrinsics layoutIntrinsics2) {
        TextDirectionHeuristic textDirectionHeuristic;
        boolean z3;
        boolean z4;
        Layout layout2;
        boolean z5;
        CharSequence charSequence2 = charSequence;
        float f4 = f;
        int i9 = i3;
        LayoutIntrinsics layoutIntrinsics3 = layoutIntrinsics2;
        Intrinsics.checkNotNullParameter(charSequence2, "charSequence");
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        Intrinsics.checkNotNullParameter(layoutIntrinsics3, "layoutIntrinsics");
        this.includePadding = z;
        this.fallbackLineSpacing = z2;
        this.layoutIntrinsics = layoutIntrinsics3;
        this.rect = new Rect();
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristic2 = TextLayoutKt.getTextDirectionHeuristic(i2);
        Layout.Alignment alignment = TextAlignmentAdapter.INSTANCE.get(i);
        boolean z6 = (charSequence2 instanceof Spanned) && ((Spanned) charSequence2).nextSpanTransition(-1, length, BaselineShiftSpan.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics boringMetrics = layoutIntrinsics2.getBoringMetrics();
            TextDirectionHeuristic textDirectionHeuristic3 = textDirectionHeuristic2;
            double d = (double) f4;
            Layout.Alignment alignment2 = alignment;
            int ceil = (int) ((float) Math.ceil(d));
            if (boringMetrics == null || layoutIntrinsics2.getMaxIntrinsicWidth() > f4 || z6) {
                int i10 = ceil;
                z4 = true;
                TextDirectionHeuristic textDirectionHeuristic4 = textDirectionHeuristic3;
                this.isBoringLayout = false;
                z3 = false;
                textDirectionHeuristic = textDirectionHeuristic4;
                layout2 = StaticLayoutFactory.INSTANCE.create(charSequence, 0, charSequence.length(), textPaint, i10, textDirectionHeuristic4, alignment2, i3, truncateAt, (int) ((float) Math.ceil(d)), f2, f3, i8, z, z2, i4, i5, i6, i7, iArr, iArr2);
            } else {
                this.isBoringLayout = true;
                z4 = true;
                layout2 = BoringLayoutFactory.INSTANCE.create(charSequence, textPaint, ceil, boringMetrics, alignment2, z, z2, truncateAt, ceil);
                z3 = false;
                textDirectionHeuristic = textDirectionHeuristic3;
            }
            this.layout = layout2;
            Trace.endSection();
            int i11 = i3;
            int min = Math.min(layout2.getLineCount(), i11);
            this.lineCount = min;
            if (min >= i11 && (layout2.getEllipsisCount(min - 1) > 0 || layout2.getLineEnd(min - 1) != charSequence.length())) {
                z5 = z4;
            } else {
                z5 = z3;
            }
            this.didExceedMaxLines = z5;
            Pair access$getVerticalPaddings = TextLayoutKt.getVerticalPaddings(this);
            LineHeightStyleSpan[] access$getLineHeightSpans = TextLayoutKt.getLineHeightSpans(this);
            this.lineHeightSpans = access$getLineHeightSpans;
            Pair access$getLineHeightPaddings = TextLayoutKt.getLineHeightPaddings(this, access$getLineHeightSpans);
            this.topPadding = Math.max(((Number) access$getVerticalPaddings.getFirst()).intValue(), ((Number) access$getLineHeightPaddings.getFirst()).intValue());
            this.bottomPadding = Math.max(((Number) access$getVerticalPaddings.getSecond()).intValue(), ((Number) access$getLineHeightPaddings.getSecond()).intValue());
            Pair access$getLastLineMetrics = TextLayoutKt.getLastLineMetrics(this, textPaint, textDirectionHeuristic, access$getLineHeightSpans);
            this.lastLineFontMetrics = (Paint.FontMetricsInt) access$getLastLineMetrics.getFirst();
            this.lastLineExtra = ((Number) access$getLastLineMetrics.getSecond()).intValue();
            this.leftPadding = IndentationFixSpanKt.getEllipsizedLeftPadding$default(layout2, min - 1, (Paint) null, 2, (Object) null);
            this.rightPadding = IndentationFixSpanKt.getEllipsizedRightPadding$default(layout2, min - 1, (Paint) null, 2, (Object) null);
            this.layoutHelper$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, new TextLayout$layoutHelper$2(this));
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TextLayout(java.lang.CharSequence r24, float r25, android.text.TextPaint r26, int r27, android.text.TextUtils.TruncateAt r28, int r29, float r30, float r31, boolean r32, boolean r33, int r34, int r35, int r36, int r37, int r38, int r39, int[] r40, int[] r41, androidx.compose.ui.text.android.LayoutIntrinsics r42, int r43, kotlin.jvm.internal.DefaultConstructorMarker r44) {
        /*
            r23 = this;
            r0 = r43
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r5 = r2
            goto L_0x000b
        L_0x0009:
            r5 = r25
        L_0x000b:
            r1 = r0 & 8
            r3 = 0
            if (r1 == 0) goto L_0x0012
            r7 = r3
            goto L_0x0014
        L_0x0012:
            r7 = r27
        L_0x0014:
            r1 = r0 & 16
            r4 = 0
            if (r1 == 0) goto L_0x001b
            r8 = r4
            goto L_0x001d
        L_0x001b:
            r8 = r28
        L_0x001d:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0024
            r1 = 2
            r9 = r1
            goto L_0x0026
        L_0x0024:
            r9 = r29
        L_0x0026:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x002e
            r1 = 1065353216(0x3f800000, float:1.0)
            r10 = r1
            goto L_0x0030
        L_0x002e:
            r10 = r30
        L_0x0030:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0036
            r11 = r2
            goto L_0x0038
        L_0x0036:
            r11 = r31
        L_0x0038:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x003e
            r12 = r3
            goto L_0x0040
        L_0x003e:
            r12 = r32
        L_0x0040:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0047
            r1 = 1
            r13 = r1
            goto L_0x0049
        L_0x0047:
            r13 = r33
        L_0x0049:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0052
            r1 = 2147483647(0x7fffffff, float:NaN)
            r14 = r1
            goto L_0x0054
        L_0x0052:
            r14 = r34
        L_0x0054:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x005a
            r15 = r3
            goto L_0x005c
        L_0x005a:
            r15 = r35
        L_0x005c:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0063
            r16 = r3
            goto L_0x0065
        L_0x0063:
            r16 = r36
        L_0x0065:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x006c
            r17 = r3
            goto L_0x006e
        L_0x006c:
            r17 = r37
        L_0x006e:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x0075
            r18 = r3
            goto L_0x0077
        L_0x0075:
            r18 = r38
        L_0x0077:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0080
            r19 = r3
            goto L_0x0082
        L_0x0080:
            r19 = r39
        L_0x0082:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x008a
            r20 = r4
            goto L_0x008c
        L_0x008a:
            r20 = r40
        L_0x008c:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0094
            r21 = r4
            goto L_0x0096
        L_0x0094:
            r21 = r41
        L_0x0096:
            r1 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x00a7
            androidx.compose.ui.text.android.LayoutIntrinsics r0 = new androidx.compose.ui.text.android.LayoutIntrinsics
            r1 = r24
            r2 = r26
            r0.<init>(r1, r2, r9)
            r22 = r0
            goto L_0x00ad
        L_0x00a7:
            r1 = r24
            r2 = r26
            r22 = r42
        L_0x00ad:
            r3 = r23
            r4 = r24
            r6 = r26
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.android.TextLayout.<init>(java.lang.CharSequence, float, android.text.TextPaint, int, android.text.TextUtils$TruncateAt, int, float, float, boolean, boolean, int, int, int, int, int, int, int[], int[], androidx.compose.ui.text.android.LayoutIntrinsics, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J@\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0007¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/text/android/TextLayout$Companion;", "", "()V", "constructStaticLayout", "Landroid/text/StaticLayout;", "charSequence", "", "width", "", "textPaint", "Landroid/text/TextPaint;", "hyphenationFrequency", "lineBreakStyle", "breakStrategy", "lineBreakWordStyle", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: TextLayout.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final StaticLayout constructStaticLayout(CharSequence charSequence, int i, TextPaint textPaint, int i2, int i3, int i4, int i5) {
            TextPaint textPaint2 = textPaint;
            int i6 = i3;
            int i7 = i4;
            int i8 = i5;
            Intrinsics.checkNotNullParameter(charSequence, "charSequence");
            Intrinsics.checkNotNullParameter(textPaint, "textPaint");
            return StaticLayoutFactory.create$default(StaticLayoutFactory.INSTANCE, charSequence, 0, 0, textPaint2, i, (TextDirectionHeuristic) null, (Layout.Alignment) null, 0, (TextUtils.TruncateAt) null, 0, 0.0f, 0.0f, 0, false, false, i7, i6, i8, i2, (int[]) null, (int[]) null, 1605606, (Object) null);
        }
    }

    public final float getMaxIntrinsicWidth() {
        return this.layoutIntrinsics.getMaxIntrinsicWidth();
    }

    public final float getMinIntrinsicWidth() {
        return this.layoutIntrinsics.getMinIntrinsicWidth();
    }

    private final LayoutHelper getLayoutHelper() {
        return (LayoutHelper) this.layoutHelper$delegate.getValue();
    }

    public final CharSequence getText() {
        CharSequence text = this.layout.getText();
        Intrinsics.checkNotNullExpressionValue(text, "layout.text");
        return text;
    }

    public final int getHeight() {
        int i;
        if (this.didExceedMaxLines) {
            i = this.layout.getLineBottom(this.lineCount - 1);
        } else {
            i = this.layout.getHeight();
        }
        return i + this.topPadding + this.bottomPadding + this.lastLineExtra;
    }

    public final float getLineLeft(int i) {
        return this.layout.getLineLeft(i) + (i == this.lineCount + -1 ? this.leftPadding : 0.0f);
    }

    public final float getLineRight(int i) {
        return this.layout.getLineRight(i) + (i == this.lineCount + -1 ? this.rightPadding : 0.0f);
    }

    public final float getLineTop(int i) {
        return ((float) this.layout.getLineTop(i)) + ((float) (i == 0 ? 0 : this.topPadding));
    }

    public final float getLineBottom(int i) {
        if (i == this.lineCount - 1 && this.lastLineFontMetrics != null) {
            return ((float) this.layout.getLineBottom(i - 1)) + ((float) this.lastLineFontMetrics.bottom);
        }
        return ((float) this.topPadding) + ((float) this.layout.getLineBottom(i)) + ((float) (i == this.lineCount + -1 ? this.bottomPadding : 0));
    }

    public final float getLineAscent(int i) {
        int i2;
        Paint.FontMetricsInt fontMetricsInt;
        if (i != this.lineCount - 1 || (fontMetricsInt = this.lastLineFontMetrics) == null) {
            i2 = this.layout.getLineAscent(i);
        } else {
            i2 = fontMetricsInt.ascent;
        }
        return (float) i2;
    }

    public final float getLineBaseline(int i) {
        float f;
        float f2 = (float) this.topPadding;
        if (i != this.lineCount - 1 || this.lastLineFontMetrics == null) {
            f = (float) this.layout.getLineBaseline(i);
        } else {
            f = getLineTop(i) - ((float) this.lastLineFontMetrics.ascent);
        }
        return f2 + f;
    }

    public final float getLineDescent(int i) {
        int i2;
        Paint.FontMetricsInt fontMetricsInt;
        if (i != this.lineCount - 1 || (fontMetricsInt = this.lastLineFontMetrics) == null) {
            i2 = this.layout.getLineDescent(i);
        } else {
            i2 = fontMetricsInt.descent;
        }
        return (float) i2;
    }

    public final float getLineHeight(int i) {
        return getLineBottom(i) - getLineTop(i);
    }

    public final float getLineWidth(int i) {
        return this.layout.getLineWidth(i);
    }

    public final int getLineStart(int i) {
        return this.layout.getLineStart(i);
    }

    public final int getLineEnd(int i) {
        if (this.layout.getEllipsisStart(i) == 0) {
            return this.layout.getLineEnd(i);
        }
        return this.layout.getText().length();
    }

    public final int getLineVisibleEnd(int i) {
        if (this.layout.getEllipsisStart(i) == 0) {
            return this.layout.getLineVisibleEnd(i);
        }
        return this.layout.getEllipsisStart(i) + this.layout.getLineStart(i);
    }

    public final boolean isLineEllipsized(int i) {
        return TextLayoutKt.isLineEllipsized(this.layout, i);
    }

    public final int getLineEllipsisOffset(int i) {
        return this.layout.getEllipsisStart(i);
    }

    public final int getLineEllipsisCount(int i) {
        return this.layout.getEllipsisCount(i);
    }

    public final int getLineForVertical(int i) {
        return this.layout.getLineForVertical(this.topPadding + i);
    }

    public final int getOffsetForHorizontal(int i, float f) {
        return this.layout.getOffsetForHorizontal(i, f + (((float) -1) * getHorizontalPadding(i)));
    }

    public static /* synthetic */ float getPrimaryHorizontal$default(TextLayout textLayout, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return textLayout.getPrimaryHorizontal(i, z);
    }

    public final float getPrimaryHorizontal(int i, boolean z) {
        return getLayoutHelper().getHorizontalPosition(i, true, z) + getHorizontalPadding(getLineForOffset(i));
    }

    public static /* synthetic */ float getSecondaryHorizontal$default(TextLayout textLayout, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return textLayout.getSecondaryHorizontal(i, z);
    }

    public final float getSecondaryHorizontal(int i, boolean z) {
        return getLayoutHelper().getHorizontalPosition(i, false, z) + getHorizontalPadding(getLineForOffset(i));
    }

    public final int getLineForOffset(int i) {
        return this.layout.getLineForOffset(i);
    }

    public final boolean isRtlCharAt(int i) {
        return this.layout.isRtlCharAt(i);
    }

    public final int getParagraphDirection(int i) {
        return this.layout.getParagraphDirection(i);
    }

    public final void getSelectionPath(int i, int i2, Path path) {
        Intrinsics.checkNotNullParameter(path, "dest");
        this.layout.getSelectionPath(i, i2, path);
        if (this.topPadding != 0 && !path.isEmpty()) {
            path.offset(0.0f, (float) this.topPadding);
        }
    }

    public final void fillBoundingBoxes(int i, int i2, float[] fArr, int i3) {
        float f;
        float f2;
        Intrinsics.checkNotNullParameter(fArr, "array");
        int length = getText().length();
        if (i < 0) {
            throw new IllegalArgumentException("startOffset must be > 0".toString());
        } else if (i >= length) {
            throw new IllegalArgumentException("startOffset must be less than text length".toString());
        } else if (i2 <= i) {
            throw new IllegalArgumentException("endOffset must be greater than startOffset".toString());
        } else if (i2 <= length) {
            if (fArr.length - i3 >= (i2 - i) * 4) {
                int lineForOffset = getLineForOffset(i);
                int lineForOffset2 = getLineForOffset(i2 - 1);
                HorizontalPositionCache horizontalPositionCache = new HorizontalPositionCache(this);
                if (lineForOffset <= lineForOffset2) {
                    while (true) {
                        int lineStart = getLineStart(lineForOffset);
                        int lineEnd = getLineEnd(lineForOffset);
                        int min = Math.min(i2, lineEnd);
                        float lineTop = getLineTop(lineForOffset);
                        float lineBottom = getLineBottom(lineForOffset);
                        boolean z = true;
                        if (getParagraphDirection(lineForOffset) != 1) {
                            z = false;
                        }
                        boolean z2 = !z;
                        for (int max = Math.max(i, lineStart); max < min; max++) {
                            boolean isRtlCharAt = isRtlCharAt(max);
                            if (z && !isRtlCharAt) {
                                f2 = horizontalPositionCache.getPrimaryDownstream(max);
                                f = horizontalPositionCache.getPrimaryUpstream(max + 1);
                            } else if (z && isRtlCharAt) {
                                f = horizontalPositionCache.getSecondaryDownstream(max);
                                f2 = horizontalPositionCache.getSecondaryUpstream(max + 1);
                            } else if (!z2 || !isRtlCharAt) {
                                f2 = horizontalPositionCache.getSecondaryDownstream(max);
                                f = horizontalPositionCache.getSecondaryUpstream(max + 1);
                            } else {
                                f = horizontalPositionCache.getPrimaryDownstream(max);
                                f2 = horizontalPositionCache.getPrimaryUpstream(max + 1);
                            }
                            fArr[i3] = f2;
                            fArr[i3 + 1] = lineTop;
                            fArr[i3 + 2] = f;
                            fArr[i3 + 3] = lineBottom;
                            i3 += 4;
                        }
                        if (lineForOffset != lineForOffset2) {
                            lineForOffset++;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                throw new IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4".toString());
            }
        } else {
            throw new IllegalArgumentException("endOffset must be smaller or equal to text length".toString());
        }
    }

    public final RectF getBoundingBox(int i) {
        float f;
        float f2;
        float f3;
        float f4;
        int lineForOffset = getLineForOffset(i);
        float lineTop = getLineTop(lineForOffset);
        float lineBottom = getLineBottom(lineForOffset);
        boolean z = getParagraphDirection(lineForOffset) == 1;
        boolean isRtlCharAt = this.layout.isRtlCharAt(i);
        if (!z || isRtlCharAt) {
            if (z && isRtlCharAt) {
                f4 = getSecondaryHorizontal(i, false);
                f3 = getSecondaryHorizontal(i + 1, true);
            } else if (isRtlCharAt) {
                f4 = getPrimaryHorizontal(i, false);
                f3 = getPrimaryHorizontal(i + 1, true);
            } else {
                f2 = getSecondaryHorizontal(i, false);
                f = getSecondaryHorizontal(i + 1, true);
            }
            float f5 = f4;
            f2 = f3;
            f = f5;
        } else {
            f2 = getPrimaryHorizontal(i, false);
            f = getPrimaryHorizontal(i + 1, true);
        }
        return new RectF(f2, lineTop, f, lineBottom);
    }

    public final void paint(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (canvas.getClipBounds(this.rect)) {
            int i = this.topPadding;
            if (i != 0) {
                canvas.translate(0.0f, (float) i);
            }
            TextAndroidCanvas access$getSharedTextAndroidCanvas$p = TextLayoutKt.SharedTextAndroidCanvas;
            access$getSharedTextAndroidCanvas$p.setCanvas(canvas);
            this.layout.draw(access$getSharedTextAndroidCanvas$p);
            int i2 = this.topPadding;
            if (i2 != 0) {
                canvas.translate(0.0f, ((float) -1) * ((float) i2));
            }
        }
    }

    public final boolean isFallbackLinespacingApplied$ui_text_release() {
        if (this.isBoringLayout) {
            BoringLayoutFactory boringLayoutFactory = BoringLayoutFactory.INSTANCE;
            Layout layout2 = this.layout;
            Intrinsics.checkNotNull(layout2, "null cannot be cast to non-null type android.text.BoringLayout");
            return boringLayoutFactory.isFallbackLineSpacingEnabled((BoringLayout) layout2);
        }
        StaticLayoutFactory staticLayoutFactory = StaticLayoutFactory.INSTANCE;
        Layout layout3 = this.layout;
        Intrinsics.checkNotNull(layout3, "null cannot be cast to non-null type android.text.StaticLayout");
        return staticLayoutFactory.isFallbackLineSpacingEnabled((StaticLayout) layout3, this.fallbackLineSpacing);
    }
}
