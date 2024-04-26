package androidx.compose.ui.text;

import android.graphics.RectF;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.android.LayoutIntrinsics;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.android.selection.WordBoundary;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.platform.AndroidParagraphHelper_androidKt;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import androidx.compose.ui.text.platform.style.ShaderBrushSpan;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001Bj\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\b0\u0007\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015ø\u0001\u0000¢\u0006\u0002\u0010\u0016B(\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011ø\u0001\u0000¢\u0006\u0002\u0010\u0019JJ\u0010Q\u001a\u0002002\u0006\u0010R\u001a\u00020\r2\u0006\u0010S\u001a\u00020\r2\b\u0010T\u001a\u0004\u0018\u00010U2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010V\u001a\u00020\r2\u0006\u0010W\u001a\u00020\r2\u0006\u0010X\u001a\u00020\r2\u0006\u0010Y\u001a\u00020\rH\u0002J+\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020]2\u0006\u0010^\u001a\u00020_2\u0006\u0010`\u001a\u00020\rø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\ba\u0010bJ\u0010\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u00020\rH\u0016J\u0010\u0010f\u001a\u00020<2\u0006\u0010e\u001a\u00020\rH\u0016J\u0010\u0010g\u001a\u00020<2\u0006\u0010e\u001a\u00020\rH\u0016J\u0018\u0010h\u001a\u00020(2\u0006\u0010e\u001a\u00020\r2\u0006\u0010i\u001a\u00020\u000fH\u0016J\u0015\u0010j\u001a\u00020(2\u0006\u0010k\u001a\u00020\rH\u0000¢\u0006\u0002\blJ\u0015\u0010m\u001a\u00020(2\u0006\u0010k\u001a\u00020\rH\u0000¢\u0006\u0002\bnJ\u0010\u0010o\u001a\u00020(2\u0006\u0010k\u001a\u00020\rH\u0016J\u0015\u0010p\u001a\u00020(2\u0006\u0010k\u001a\u00020\rH\u0000¢\u0006\u0002\bqJ\u0018\u0010r\u001a\u00020\r2\u0006\u0010k\u001a\u00020\r2\u0006\u0010s\u001a\u00020\u000fH\u0016J\u0010\u0010t\u001a\u00020\r2\u0006\u0010e\u001a\u00020\rH\u0016J\u0010\u0010u\u001a\u00020\r2\u0006\u0010v\u001a\u00020(H\u0016J\u0010\u0010w\u001a\u00020(2\u0006\u0010k\u001a\u00020\rH\u0016J\u0010\u0010x\u001a\u00020(2\u0006\u0010k\u001a\u00020\rH\u0016J\u0010\u0010y\u001a\u00020(2\u0006\u0010k\u001a\u00020\rH\u0016J\u0010\u0010z\u001a\u00020\r2\u0006\u0010k\u001a\u00020\rH\u0016J\u0010\u0010{\u001a\u00020(2\u0006\u0010k\u001a\u00020\rH\u0016J\u0010\u0010|\u001a\u00020(2\u0006\u0010k\u001a\u00020\rH\u0016J\u001f\u0010}\u001a\u00020\r2\u0006\u0010~\u001a\u00020H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0001\u0010\u0001J\u0011\u0010\u0001\u001a\u00020d2\u0006\u0010e\u001a\u00020\rH\u0016J\u001c\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020\r2\u0007\u0010\u0001\u001a\u00020\rH\u0016J\"\u0010M\u001a\u00020]2\u0006\u0010e\u001a\u00020\rH\u0016ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0001\u0010\u0001J\u0011\u0010\u0001\u001a\u00020\u000f2\u0006\u0010k\u001a\u00020\rH\u0016J\u0013\u0010\u0001\u001a\u00020[2\b\u0010\u0001\u001a\u00030\u0001H\u0002Jc\u0010\u0001\u001a\u00020[2\b\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020(2\n\u0010\u0001\u001a\u0005\u0018\u00010\u00012\n\u0010\u0001\u001a\u0005\u0018\u00010\u00012\n\u0010\u0001\u001a\u0005\u0018\u00010\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0001\u0010\u0001JD\u0010\u0001\u001a\u00020[2\b\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u00012\n\u0010\u0001\u001a\u0005\u0018\u00010\u00012\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0001\u0010\u0001JZ\u0010\u0001\u001a\u00020[2\b\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u00012\n\u0010\u0001\u001a\u0005\u0018\u00010\u00012\n\u0010\u0001\u001a\u0005\u0018\u00010\u00012\n\u0010\u0001\u001a\u0005\u0018\u00010\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0001\u0010\u0001J\u001b\u0010 \u0001\u001a\n\u0012\u0005\u0012\u00030¢\u00010¡\u0001*\u000200H\u0002¢\u0006\u0003\u0010£\u0001R\u001c\u0010\u001a\u001a\u00020\u001b8\u0000X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0010\u001a\u00020\u0011ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\u000f8VX\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0014\u0010'\u001a\u00020(8VX\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020(8VX\u0004¢\u0006\u0006\u001a\u0004\b,\u0010*R\u0014\u0010-\u001a\u00020(8VX\u0004¢\u0006\u0006\u001a\u0004\b.\u0010*R\u000e\u0010/\u001a\u000200X\u0004¢\u0006\u0002\n\u0000R\u0014\u00101\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00104\u001a\u00020(8VX\u0004¢\u0006\u0006\u001a\u0004\b5\u0010*R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b6\u00103R\u0014\u00107\u001a\u00020(8VX\u0004¢\u0006\u0006\u001a\u0004\b8\u0010*R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u001c\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010<0\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u001a\u0010?\u001a\u00020@8@X\u0004¢\u0006\f\u0012\u0004\bA\u0010\u001d\u001a\u0004\bB\u0010CR\u001a\u0010D\u001a\u00020E8@X\u0004¢\u0006\f\u0012\u0004\bF\u0010\u001d\u001a\u0004\bG\u0010HR\u0014\u0010I\u001a\u00020(8VX\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010*R\u001b\u0010K\u001a\u00020L8BX\u0002¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bM\u0010N\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006¤\u0001"}, d2 = {"Landroidx/compose/ui/text/AndroidParagraph;", "Landroidx/compose/ui/text/Paragraph;", "text", "", "style", "Landroidx/compose/ui/text/TextStyle;", "spanStyles", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "placeholders", "Landroidx/compose/ui/text/Placeholder;", "maxLines", "", "ellipsis", "", "constraints", "Landroidx/compose/ui/unit/Constraints;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "density", "Landroidx/compose/ui/unit/Density;", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Ljava/util/List;IZJLandroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/ui/unit/Density;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "paragraphIntrinsics", "Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;", "(Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;IZJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "charSequence", "", "getCharSequence$ui_text_release$annotations", "()V", "getCharSequence$ui_text_release", "()Ljava/lang/CharSequence;", "getConstraints-msEJaDk", "()J", "J", "didExceedMaxLines", "getDidExceedMaxLines", "()Z", "getEllipsis", "firstBaseline", "", "getFirstBaseline", "()F", "height", "getHeight", "lastBaseline", "getLastBaseline", "layout", "Landroidx/compose/ui/text/android/TextLayout;", "lineCount", "getLineCount", "()I", "maxIntrinsicWidth", "getMaxIntrinsicWidth", "getMaxLines", "minIntrinsicWidth", "getMinIntrinsicWidth", "getParagraphIntrinsics", "()Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;", "placeholderRects", "Landroidx/compose/ui/geometry/Rect;", "getPlaceholderRects", "()Ljava/util/List;", "textLocale", "Ljava/util/Locale;", "getTextLocale$ui_text_release$annotations", "getTextLocale$ui_text_release", "()Ljava/util/Locale;", "textPaint", "Landroidx/compose/ui/text/platform/AndroidTextPaint;", "getTextPaint$ui_text_release$annotations", "getTextPaint$ui_text_release", "()Landroidx/compose/ui/text/platform/AndroidTextPaint;", "width", "getWidth", "wordBoundary", "Landroidx/compose/ui/text/android/selection/WordBoundary;", "getWordBoundary", "()Landroidx/compose/ui/text/android/selection/WordBoundary;", "wordBoundary$delegate", "Lkotlin/Lazy;", "constructTextLayout", "alignment", "justificationMode", "ellipsize", "Landroid/text/TextUtils$TruncateAt;", "hyphens", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", "fillBoundingBoxes", "", "range", "Landroidx/compose/ui/text/TextRange;", "array", "", "arrayStart", "fillBoundingBoxes-8ffj60Q", "(J[FI)V", "getBidiRunDirection", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "offset", "getBoundingBox", "getCursorRect", "getHorizontalPosition", "usePrimaryDirection", "getLineAscent", "lineIndex", "getLineAscent$ui_text_release", "getLineBaseline", "getLineBaseline$ui_text_release", "getLineBottom", "getLineDescent", "getLineDescent$ui_text_release", "getLineEnd", "visibleEnd", "getLineForOffset", "getLineForVerticalPosition", "vertical", "getLineHeight", "getLineLeft", "getLineRight", "getLineStart", "getLineTop", "getLineWidth", "getOffsetForPosition", "position", "Landroidx/compose/ui/geometry/Offset;", "getOffsetForPosition-k-4lQ0M", "(J)I", "getParagraphDirection", "getPathForRange", "Landroidx/compose/ui/graphics/Path;", "start", "end", "getWordBoundary--jx7JFs", "(I)J", "isLineEllipsized", "paint", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "brush", "Landroidx/compose/ui/graphics/Brush;", "alpha", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "paint-hn5TExg", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "color", "Landroidx/compose/ui/graphics/Color;", "paint-RPmYEkk", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;)V", "paint-LG529CI", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "getShaderBrushSpans", "", "Landroidx/compose/ui/text/platform/style/ShaderBrushSpan;", "(Landroidx/compose/ui/text/android/TextLayout;)[Landroidx/compose/ui/text/platform/style/ShaderBrushSpan;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: AndroidParagraph.android.kt */
public final class AndroidParagraph implements Paragraph {
    private final CharSequence charSequence;
    private final long constraints;
    private final boolean ellipsis;
    /* access modifiers changed from: private */
    public final TextLayout layout;
    private final int maxLines;
    private final AndroidParagraphIntrinsics paragraphIntrinsics;
    private final List<Rect> placeholderRects;
    private final Lazy wordBoundary$delegate;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* compiled from: AndroidParagraph.android.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                androidx.compose.ui.text.style.ResolvedTextDirection[] r0 = androidx.compose.ui.text.style.ResolvedTextDirection.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.text.style.ResolvedTextDirection r1 = androidx.compose.ui.text.style.ResolvedTextDirection.Ltr     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.text.style.ResolvedTextDirection r1 = androidx.compose.ui.text.style.ResolvedTextDirection.Rtl     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.AndroidParagraph.WhenMappings.<clinit>():void");
        }
    }

    public /* synthetic */ AndroidParagraph(AndroidParagraphIntrinsics androidParagraphIntrinsics, int i, boolean z, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(androidParagraphIntrinsics, i, z, j);
    }

    public /* synthetic */ AndroidParagraph(String str, TextStyle textStyle, List list, List list2, int i, boolean z, long j, FontFamily.Resolver resolver, Density density, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textStyle, list, list2, i, z, j, resolver, density);
    }

    public static /* synthetic */ void getCharSequence$ui_text_release$annotations() {
    }

    public static /* synthetic */ void getTextLocale$ui_text_release$annotations() {
    }

    public static /* synthetic */ void getTextPaint$ui_text_release$annotations() {
    }

    public final CharSequence getCharSequence$ui_text_release() {
        return this.charSequence;
    }

    /* renamed from: getConstraints-msEJaDk  reason: not valid java name */
    public final long m4987getConstraintsmsEJaDk() {
        return this.constraints;
    }

    public final boolean getEllipsis() {
        return this.ellipsis;
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final AndroidParagraphIntrinsics getParagraphIntrinsics() {
        return this.paragraphIntrinsics;
    }

    public List<Rect> getPlaceholderRects() {
        return this.placeholderRects;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.util.Collection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: java.util.List<androidx.compose.ui.geometry.Rect>} */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0221, code lost:
        r11 = r11 + r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x024c, code lost:
        r11 = r10 - ((float) r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x024f, code lost:
        r10 = new androidx.compose.ui.geometry.Rect(r6, r11, r7, ((float) r5.getHeightPx()) + r11);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private AndroidParagraph(androidx.compose.ui.text.platform.AndroidParagraphIntrinsics r25, int r26, boolean r27, long r28) {
        /*
            r24 = this;
            r9 = r24
            r10 = r26
            r11 = r27
            r24.<init>()
            r0 = r25
            r9.paragraphIntrinsics = r0
            r9.maxLines = r10
            r9.ellipsis = r11
            r12 = r28
            r9.constraints = r12
            int r1 = androidx.compose.ui.unit.Constraints.m5571getMinHeightimpl(r28)
            if (r1 != 0) goto L_0x0285
            int r1 = androidx.compose.ui.unit.Constraints.m5572getMinWidthimpl(r28)
            if (r1 != 0) goto L_0x0285
            r14 = 1
            if (r10 < r14) goto L_0x0279
            androidx.compose.ui.text.TextStyle r15 = r25.getStyle()
            boolean r1 = androidx.compose.ui.text.AndroidParagraph_androidKt.shouldAttachIndentationFixSpan(r15, r11)
            if (r1 == 0) goto L_0x0037
            java.lang.CharSequence r0 = r25.getCharSequence$ui_text_release()
            java.lang.CharSequence r0 = androidx.compose.ui.text.AndroidParagraph_androidKt.attachIndentationFixSpan(r0)
            goto L_0x003b
        L_0x0037:
            java.lang.CharSequence r0 = r25.getCharSequence$ui_text_release()
        L_0x003b:
            r9.charSequence = r0
            androidx.compose.ui.text.style.TextAlign r0 = r15.m5159getTextAlignbuA522U()
            int r16 = androidx.compose.ui.text.AndroidParagraph_androidKt.m4998toLayoutAlignAMY3VfE(r0)
            androidx.compose.ui.text.style.TextAlign r0 = r15.m5159getTextAlignbuA522U()
            androidx.compose.ui.text.style.TextAlign$Companion r1 = androidx.compose.ui.text.style.TextAlign.Companion
            int r1 = r1.m5508getJustifye0LSkKk()
            r8 = 0
            if (r0 != 0) goto L_0x0055
            r17 = r8
            goto L_0x005f
        L_0x0055:
            int r0 = r0.m5505unboximpl()
            boolean r0 = androidx.compose.ui.text.style.TextAlign.m5502equalsimpl0(r0, r1)
            r17 = r0
        L_0x005f:
            androidx.compose.ui.text.ParagraphStyle r0 = r15.getParagraphStyle$ui_text_release()
            androidx.compose.ui.text.style.Hyphens r0 = r0.m5043getHyphensEaSxIns()
            int r18 = androidx.compose.ui.text.AndroidParagraph_androidKt.m5000toLayoutHyphenationFrequency0_XeFpE(r0)
            androidx.compose.ui.text.style.LineBreak r0 = r15.m5157getLineBreakLgCVezo()
            r19 = 0
            if (r0 == 0) goto L_0x0080
            int r0 = r0.m5435unboximpl()
            int r0 = androidx.compose.ui.text.style.LineBreak.m5430getStrategyfcGXIks(r0)
            androidx.compose.ui.text.style.LineBreak$Strategy r0 = androidx.compose.ui.text.style.LineBreak.Strategy.m5439boximpl(r0)
            goto L_0x0082
        L_0x0080:
            r0 = r19
        L_0x0082:
            int r20 = androidx.compose.ui.text.AndroidParagraph_androidKt.m4999toLayoutBreakStrategyu6PBz3U(r0)
            androidx.compose.ui.text.style.LineBreak r0 = r15.m5157getLineBreakLgCVezo()
            if (r0 == 0) goto L_0x0099
            int r0 = r0.m5435unboximpl()
            int r0 = androidx.compose.ui.text.style.LineBreak.m5431getStrictnessusljTpc(r0)
            androidx.compose.ui.text.style.LineBreak$Strictness r0 = androidx.compose.ui.text.style.LineBreak.Strictness.m5449boximpl(r0)
            goto L_0x009b
        L_0x0099:
            r0 = r19
        L_0x009b:
            int r21 = androidx.compose.ui.text.AndroidParagraph_androidKt.m5001toLayoutLineBreakStyle4a2g8L8(r0)
            androidx.compose.ui.text.style.LineBreak r0 = r15.m5157getLineBreakLgCVezo()
            if (r0 == 0) goto L_0x00b2
            int r0 = r0.m5435unboximpl()
            int r0 = androidx.compose.ui.text.style.LineBreak.m5432getWordBreakjp8hJ3c(r0)
            androidx.compose.ui.text.style.LineBreak$WordBreak r0 = androidx.compose.ui.text.style.LineBreak.WordBreak.m5460boximpl(r0)
            goto L_0x00b4
        L_0x00b2:
            r0 = r19
        L_0x00b4:
            int r22 = androidx.compose.ui.text.AndroidParagraph_androidKt.m5002toLayoutLineBreakWordStylegvcdTPQ(r0)
            if (r11 == 0) goto L_0x00bf
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r23 = r0
            goto L_0x00c1
        L_0x00bf:
            r23 = r19
        L_0x00c1:
            r0 = r24
            r1 = r16
            r2 = r17
            r3 = r23
            r4 = r26
            r5 = r18
            r6 = r20
            r7 = r21
            r8 = r22
            androidx.compose.ui.text.android.TextLayout r0 = r0.constructTextLayout(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r11 == 0) goto L_0x010c
            int r1 = r0.getHeight()
            int r2 = androidx.compose.ui.unit.Constraints.m5569getMaxHeightimpl(r28)
            if (r1 <= r2) goto L_0x010c
            if (r10 <= r14) goto L_0x010c
            int r1 = androidx.compose.ui.unit.Constraints.m5569getMaxHeightimpl(r28)
            int r1 = androidx.compose.ui.text.AndroidParagraph_androidKt.numberOfLinesThatFitMaxHeight(r0, r1)
            if (r1 < 0) goto L_0x0109
            if (r1 == r10) goto L_0x0109
            int r4 = kotlin.ranges.RangesKt.coerceAtLeast((int) r1, (int) r14)
            r0 = r24
            r1 = r16
            r2 = r17
            r3 = r23
            r5 = r18
            r6 = r20
            r7 = r21
            r8 = r22
            androidx.compose.ui.text.android.TextLayout r0 = r0.constructTextLayout(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x0109:
            r9.layout = r0
            goto L_0x010e
        L_0x010c:
            r9.layout = r0
        L_0x010e:
            androidx.compose.ui.text.platform.AndroidTextPaint r0 = r24.getTextPaint$ui_text_release()
            androidx.compose.ui.graphics.Brush r1 = r15.getBrush()
            float r2 = r24.getWidth()
            float r3 = r24.getHeight()
            long r2 = androidx.compose.ui.geometry.SizeKt.Size(r2, r3)
            float r4 = r15.getAlpha()
            r0.m5372setBrush12SF9DM(r1, r2, r4)
            androidx.compose.ui.text.android.TextLayout r0 = r9.layout
            androidx.compose.ui.text.platform.style.ShaderBrushSpan[] r0 = r9.getShaderBrushSpans(r0)
            int r1 = r0.length
            r8 = 0
        L_0x0131:
            if (r8 >= r1) goto L_0x0147
            r2 = r0[r8]
            float r3 = r24.getWidth()
            float r4 = r24.getHeight()
            long r3 = androidx.compose.ui.geometry.SizeKt.Size(r3, r4)
            r2.m5393setSizeuvyYCjk(r3)
            int r8 = r8 + 1
            goto L_0x0131
        L_0x0147:
            java.lang.CharSequence r0 = r9.charSequence
            boolean r1 = r0 instanceof android.text.Spanned
            if (r1 != 0) goto L_0x0153
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            goto L_0x0267
        L_0x0153:
            r1 = r0
            android.text.Spanned r1 = (android.text.Spanned) r1
            int r0 = r0.length()
            java.lang.Class<androidx.compose.ui.text.android.style.PlaceholderSpan> r2 = androidx.compose.ui.text.android.style.PlaceholderSpan.class
            r3 = 0
            java.lang.Object[] r0 = r1.getSpans(r3, r0, r2)
            java.lang.String r2 = "getSpans(0, length, PlaceholderSpan::class.java)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r4 = r0.length
            r2.<init>(r4)
            java.util.Collection r2 = (java.util.Collection) r2
            int r4 = r0.length
            r8 = r3
        L_0x0170:
            if (r8 >= r4) goto L_0x0264
            r5 = r0[r8]
            androidx.compose.ui.text.android.style.PlaceholderSpan r5 = (androidx.compose.ui.text.android.style.PlaceholderSpan) r5
            int r6 = r1.getSpanStart(r5)
            int r7 = r1.getSpanEnd(r5)
            androidx.compose.ui.text.android.TextLayout r10 = r9.layout
            int r10 = r10.getLineForOffset(r6)
            int r11 = r9.maxLines
            if (r10 < r11) goto L_0x018a
            r11 = r14
            goto L_0x018b
        L_0x018a:
            r11 = r3
        L_0x018b:
            androidx.compose.ui.text.android.TextLayout r12 = r9.layout
            int r12 = r12.getLineEllipsisCount(r10)
            if (r12 <= 0) goto L_0x019d
            androidx.compose.ui.text.android.TextLayout r12 = r9.layout
            int r12 = r12.getLineEllipsisOffset(r10)
            if (r7 <= r12) goto L_0x019d
            r12 = r14
            goto L_0x019e
        L_0x019d:
            r12 = r3
        L_0x019e:
            androidx.compose.ui.text.android.TextLayout r13 = r9.layout
            int r13 = r13.getLineEnd(r10)
            if (r7 <= r13) goto L_0x01a8
            r7 = r14
            goto L_0x01a9
        L_0x01a8:
            r7 = r3
        L_0x01a9:
            if (r12 != 0) goto L_0x025b
            if (r7 != 0) goto L_0x025b
            if (r11 == 0) goto L_0x01b1
            goto L_0x025b
        L_0x01b1:
            androidx.compose.ui.text.style.ResolvedTextDirection r7 = r9.getBidiRunDirection(r6)
            int[] r11 = androidx.compose.ui.text.AndroidParagraph.WhenMappings.$EnumSwitchMapping$0
            int r7 = r7.ordinal()
            r7 = r11[r7]
            r11 = 2
            if (r7 == r14) goto L_0x01d3
            if (r7 != r11) goto L_0x01cd
            float r6 = r9.getHorizontalPosition(r6, r14)
            int r7 = r5.getWidthPx()
            float r7 = (float) r7
            float r6 = r6 - r7
            goto L_0x01d7
        L_0x01cd:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01d3:
            float r6 = r9.getHorizontalPosition(r6, r14)
        L_0x01d7:
            int r7 = r5.getWidthPx()
            float r7 = (float) r7
            float r7 = r7 + r6
            androidx.compose.ui.text.android.TextLayout r12 = r9.layout
            int r13 = r5.getVerticalAlign()
            switch(r13) {
                case 0: goto L_0x0244;
                case 1: goto L_0x023f;
                case 2: goto L_0x0236;
                case 3: goto L_0x0223;
                case 4: goto L_0x0216;
                case 5: goto L_0x0203;
                case 6: goto L_0x01ee;
                default: goto L_0x01e6;
            }
        L_0x01e6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "unexpected verticalAlignment"
            r0.<init>(r1)
            throw r0
        L_0x01ee:
            android.graphics.Paint$FontMetricsInt r13 = r5.getFontMetrics()
            int r15 = r13.ascent
            int r13 = r13.descent
            int r15 = r15 + r13
            int r13 = r5.getHeightPx()
            int r15 = r15 - r13
            int r15 = r15 / r11
            float r11 = (float) r15
            float r10 = r12.getLineBaseline(r10)
            goto L_0x0221
        L_0x0203:
            android.graphics.Paint$FontMetricsInt r11 = r5.getFontMetrics()
            int r11 = r11.descent
            float r11 = (float) r11
            float r10 = r12.getLineBaseline(r10)
            float r11 = r11 + r10
            int r10 = r5.getHeightPx()
            float r10 = (float) r10
            float r11 = r11 - r10
            goto L_0x024f
        L_0x0216:
            android.graphics.Paint$FontMetricsInt r11 = r5.getFontMetrics()
            int r11 = r11.ascent
            float r11 = (float) r11
            float r10 = r12.getLineBaseline(r10)
        L_0x0221:
            float r11 = r11 + r10
            goto L_0x024f
        L_0x0223:
            float r13 = r12.getLineTop(r10)
            float r10 = r12.getLineBottom(r10)
            float r13 = r13 + r10
            int r10 = r5.getHeightPx()
            float r10 = (float) r10
            float r13 = r13 - r10
            float r10 = (float) r11
            float r11 = r13 / r10
            goto L_0x024f
        L_0x0236:
            float r10 = r12.getLineBottom(r10)
            int r11 = r5.getHeightPx()
            goto L_0x024c
        L_0x023f:
            float r11 = r12.getLineTop(r10)
            goto L_0x024f
        L_0x0244:
            float r10 = r12.getLineBaseline(r10)
            int r11 = r5.getHeightPx()
        L_0x024c:
            float r11 = (float) r11
            float r11 = r10 - r11
        L_0x024f:
            int r5 = r5.getHeightPx()
            float r5 = (float) r5
            float r5 = r5 + r11
            androidx.compose.ui.geometry.Rect r10 = new androidx.compose.ui.geometry.Rect
            r10.<init>(r6, r11, r7, r5)
            goto L_0x025d
        L_0x025b:
            r10 = r19
        L_0x025d:
            r2.add(r10)
            int r8 = r8 + 1
            goto L_0x0170
        L_0x0264:
            r0 = r2
            java.util.List r0 = (java.util.List) r0
        L_0x0267:
            r9.placeholderRects = r0
            kotlin.LazyThreadSafetyMode r0 = kotlin.LazyThreadSafetyMode.NONE
            androidx.compose.ui.text.AndroidParagraph$wordBoundary$2 r1 = new androidx.compose.ui.text.AndroidParagraph$wordBoundary$2
            r1.<init>(r9)
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            kotlin.Lazy r0 = kotlin.LazyKt.lazy((kotlin.LazyThreadSafetyMode) r0, r1)
            r9.wordBoundary$delegate = r0
            return
        L_0x0279:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "maxLines should be greater than 0"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0285:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.AndroidParagraph.<init>(androidx.compose.ui.text.platform.AndroidParagraphIntrinsics, int, boolean, long):void");
    }

    private AndroidParagraph(String str, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, int i, boolean z, long j, FontFamily.Resolver resolver, Density density) {
        this(new AndroidParagraphIntrinsics(str, textStyle, list, list2, resolver, density), i, z, j, (DefaultConstructorMarker) null);
    }

    public float getWidth() {
        return (float) Constraints.m5570getMaxWidthimpl(this.constraints);
    }

    public float getHeight() {
        return (float) this.layout.getHeight();
    }

    public float getMaxIntrinsicWidth() {
        return this.paragraphIntrinsics.getMaxIntrinsicWidth();
    }

    public float getMinIntrinsicWidth() {
        return this.paragraphIntrinsics.getMinIntrinsicWidth();
    }

    public float getFirstBaseline() {
        return getLineBaseline$ui_text_release(0);
    }

    public float getLastBaseline() {
        return getLineBaseline$ui_text_release(getLineCount() - 1);
    }

    public boolean getDidExceedMaxLines() {
        return this.layout.getDidExceedMaxLines();
    }

    public final Locale getTextLocale$ui_text_release() {
        Locale textLocale = this.paragraphIntrinsics.getTextPaint$ui_text_release().getTextLocale();
        Intrinsics.checkNotNullExpressionValue(textLocale, "paragraphIntrinsics.textPaint.textLocale");
        return textLocale;
    }

    public int getLineCount() {
        return this.layout.getLineCount();
    }

    public final AndroidTextPaint getTextPaint$ui_text_release() {
        return this.paragraphIntrinsics.getTextPaint$ui_text_release();
    }

    public int getLineForVerticalPosition(float f) {
        return this.layout.getLineForVertical((int) f);
    }

    /* renamed from: getOffsetForPosition-k-4lQ0M  reason: not valid java name */
    public int m4988getOffsetForPositionk4lQ0M(long j) {
        return this.layout.getOffsetForHorizontal(this.layout.getLineForVertical((int) Offset.m2573getYimpl(j)), Offset.m2572getXimpl(j));
    }

    public Rect getBoundingBox(int i) {
        RectF boundingBox = this.layout.getBoundingBox(i);
        return new Rect(boundingBox.left, boundingBox.top, boundingBox.right, boundingBox.bottom);
    }

    /* renamed from: fillBoundingBoxes-8ffj60Q  reason: not valid java name */
    public final void m4986fillBoundingBoxes8ffj60Q(long j, float[] fArr, int i) {
        Intrinsics.checkNotNullParameter(fArr, "array");
        this.layout.fillBoundingBoxes(TextRange.m5129getMinimpl(j), TextRange.m5128getMaximpl(j), fArr, i);
    }

    public Path getPathForRange(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.charSequence.length()) {
            throw new AssertionError("Start(" + i + ") or End(" + i2 + ") is out of Range(0.." + this.charSequence.length() + "), or start > end!");
        }
        android.graphics.Path path = new android.graphics.Path();
        this.layout.getSelectionPath(i, i2, path);
        return AndroidPath_androidKt.asComposePath(path);
    }

    public Rect getCursorRect(int i) {
        if (i < 0 || i > this.charSequence.length()) {
            throw new AssertionError("offset(" + i + ") is out of bounds (0," + this.charSequence.length());
        }
        float primaryHorizontal$default = TextLayout.getPrimaryHorizontal$default(this.layout, i, false, 2, (Object) null);
        int lineForOffset = this.layout.getLineForOffset(i);
        return new Rect(primaryHorizontal$default, this.layout.getLineTop(lineForOffset), primaryHorizontal$default, this.layout.getLineBottom(lineForOffset));
    }

    private final WordBoundary getWordBoundary() {
        return (WordBoundary) this.wordBoundary$delegate.getValue();
    }

    /* renamed from: getWordBoundary--jx7JFs  reason: not valid java name */
    public long m4989getWordBoundaryjx7JFs(int i) {
        return TextRangeKt.TextRange(getWordBoundary().getWordStart(i), getWordBoundary().getWordEnd(i));
    }

    public float getLineLeft(int i) {
        return this.layout.getLineLeft(i);
    }

    public float getLineRight(int i) {
        return this.layout.getLineRight(i);
    }

    public float getLineTop(int i) {
        return this.layout.getLineTop(i);
    }

    public final float getLineAscent$ui_text_release(int i) {
        return this.layout.getLineAscent(i);
    }

    public final float getLineBaseline$ui_text_release(int i) {
        return this.layout.getLineBaseline(i);
    }

    public final float getLineDescent$ui_text_release(int i) {
        return this.layout.getLineDescent(i);
    }

    public float getLineBottom(int i) {
        return this.layout.getLineBottom(i);
    }

    public float getLineHeight(int i) {
        return this.layout.getLineHeight(i);
    }

    public float getLineWidth(int i) {
        return this.layout.getLineWidth(i);
    }

    public int getLineStart(int i) {
        return this.layout.getLineStart(i);
    }

    public int getLineEnd(int i, boolean z) {
        if (z) {
            return this.layout.getLineVisibleEnd(i);
        }
        return this.layout.getLineEnd(i);
    }

    public boolean isLineEllipsized(int i) {
        return this.layout.isLineEllipsized(i);
    }

    public int getLineForOffset(int i) {
        return this.layout.getLineForOffset(i);
    }

    public float getHorizontalPosition(int i, boolean z) {
        if (z) {
            return TextLayout.getPrimaryHorizontal$default(this.layout, i, false, 2, (Object) null);
        }
        return TextLayout.getSecondaryHorizontal$default(this.layout, i, false, 2, (Object) null);
    }

    public ResolvedTextDirection getParagraphDirection(int i) {
        return this.layout.getParagraphDirection(this.layout.getLineForOffset(i)) == 1 ? ResolvedTextDirection.Ltr : ResolvedTextDirection.Rtl;
    }

    public ResolvedTextDirection getBidiRunDirection(int i) {
        if (this.layout.isRtlCharAt(i)) {
            return ResolvedTextDirection.Rtl;
        }
        return ResolvedTextDirection.Ltr;
    }

    private final ShaderBrushSpan[] getShaderBrushSpans(TextLayout textLayout) {
        if (!(textLayout.getText() instanceof Spanned)) {
            return new ShaderBrushSpan[0];
        }
        CharSequence text = textLayout.getText();
        Intrinsics.checkNotNull(text, "null cannot be cast to non-null type android.text.Spanned");
        ShaderBrushSpan[] shaderBrushSpanArr = (ShaderBrushSpan[]) ((Spanned) text).getSpans(0, textLayout.getText().length(), ShaderBrushSpan.class);
        Intrinsics.checkNotNullExpressionValue(shaderBrushSpanArr, "brushSpans");
        return shaderBrushSpanArr.length == 0 ? new ShaderBrushSpan[0] : shaderBrushSpanArr;
    }

    /* renamed from: paint-RPmYEkk  reason: not valid java name */
    public void m4991paintRPmYEkk(Canvas canvas, long j, Shadow shadow, TextDecoration textDecoration) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        AndroidTextPaint textPaint$ui_text_release = getTextPaint$ui_text_release();
        textPaint$ui_text_release.m5373setColor8_81llA(j);
        textPaint$ui_text_release.setShadow(shadow);
        textPaint$ui_text_release.setTextDecoration(textDecoration);
        paint(canvas);
    }

    /* renamed from: paint-LG529CI  reason: not valid java name */
    public void m4990paintLG529CI(Canvas canvas, long j, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int r0 = getTextPaint$ui_text_release().m5370getBlendMode0nO6VwU();
        AndroidTextPaint textPaint$ui_text_release = getTextPaint$ui_text_release();
        textPaint$ui_text_release.m5373setColor8_81llA(j);
        textPaint$ui_text_release.setShadow(shadow);
        textPaint$ui_text_release.setTextDecoration(textDecoration);
        textPaint$ui_text_release.setDrawStyle(drawStyle);
        textPaint$ui_text_release.m5371setBlendModes9anfk8(i);
        paint(canvas);
        getTextPaint$ui_text_release().m5371setBlendModes9anfk8(r0);
    }

    /* renamed from: paint-hn5TExg  reason: not valid java name */
    public void m4992painthn5TExg(Canvas canvas, Brush brush, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(brush, "brush");
        int r0 = getTextPaint$ui_text_release().m5370getBlendMode0nO6VwU();
        AndroidTextPaint textPaint$ui_text_release = getTextPaint$ui_text_release();
        textPaint$ui_text_release.m5372setBrush12SF9DM(brush, SizeKt.Size(getWidth(), getHeight()), f);
        textPaint$ui_text_release.setShadow(shadow);
        textPaint$ui_text_release.setTextDecoration(textDecoration);
        textPaint$ui_text_release.setDrawStyle(drawStyle);
        textPaint$ui_text_release.m5371setBlendModes9anfk8(i);
        paint(canvas);
        getTextPaint$ui_text_release().m5371setBlendModes9anfk8(r0);
    }

    private final void paint(Canvas canvas) {
        android.graphics.Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        if (getDidExceedMaxLines()) {
            nativeCanvas.save();
            nativeCanvas.clipRect(0.0f, 0.0f, getWidth(), getHeight());
        }
        this.layout.paint(nativeCanvas);
        if (getDidExceedMaxLines()) {
            nativeCanvas.restore();
        }
    }

    private final TextLayout constructTextLayout(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7) {
        TextUtils.TruncateAt truncateAt2 = truncateAt;
        int i8 = i3;
        int i9 = i4;
        int i10 = i5;
        int i11 = i6;
        int i12 = i7;
        CharSequence charSequence2 = this.charSequence;
        float width = getWidth();
        AndroidTextPaint textPaint$ui_text_release = getTextPaint$ui_text_release();
        int textDirectionHeuristic$ui_text_release = this.paragraphIntrinsics.getTextDirectionHeuristic$ui_text_release();
        LayoutIntrinsics layoutIntrinsics$ui_text_release = this.paragraphIntrinsics.getLayoutIntrinsics$ui_text_release();
        return new TextLayout(charSequence2, width, textPaint$ui_text_release, i, truncateAt2, textDirectionHeuristic$ui_text_release, 1.0f, 0.0f, AndroidParagraphHelper_androidKt.isIncludeFontPaddingEnabled(this.paragraphIntrinsics.getStyle()), true, i8, i10, i11, i12, i9, i2, (int[]) null, (int[]) null, layoutIntrinsics$ui_text_release, 196736, (DefaultConstructorMarker) null);
    }
}
