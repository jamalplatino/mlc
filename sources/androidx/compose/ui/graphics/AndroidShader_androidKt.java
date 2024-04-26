package androidx.compose.ui.graphics;

import android.graphics.BitmapShader;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import androidx.compose.ui.geometry.Offset;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a1\u0010\u0000\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001aO\u0010\n\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001aO\u0010\u0016\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00122\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a?\u0010\u001b\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0017\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000fH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0019\u0010\u001e\u001a\u00020\u001f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0001ø\u0001\u0001\u001a!\u0010 \u001a\u00020!2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\"\u001a\u00020\u001fH\u0001ø\u0001\u0001\u001a3\u0010#\u001a\u0004\u0018\u00010$2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\"\u001a\u00020\u001fH\u0001ø\u0001\u0001\u001a)\u0010&\u001a\u00020'2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000fH\u0002ø\u0001\u0001*\n\u0010(\"\u00020\u00012\u00020\u0001\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006)"}, d2 = {"ActualImageShader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "tileModeX", "Landroidx/compose/ui/graphics/TileMode;", "tileModeY", "ActualImageShader-F49vj9s", "(Landroidx/compose/ui/graphics/ImageBitmap;II)Landroid/graphics/Shader;", "ActualLinearGradientShader", "from", "Landroidx/compose/ui/geometry/Offset;", "to", "colors", "", "Landroidx/compose/ui/graphics/Color;", "colorStops", "", "tileMode", "ActualLinearGradientShader-VjE6UOU", "(JJLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "ActualRadialGradientShader", "center", "radius", "ActualRadialGradientShader-8uybcMk", "(JFLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "ActualSweepGradientShader", "ActualSweepGradientShader-9KIMszo", "(JLjava/util/List;Ljava/util/List;)Landroid/graphics/Shader;", "countTransparentColors", "", "makeTransparentColors", "", "numTransparentColors", "makeTransparentStops", "", "stops", "validateColorStops", "", "Shader", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: AndroidShader.android.kt */
public final class AndroidShader_androidKt {
    public static final int countTransparentColors(List<Color> list) {
        Intrinsics.checkNotNullParameter(list, "colors");
        return 0;
    }

    /* renamed from: ActualLinearGradientShader-VjE6UOU  reason: not valid java name */
    public static final Shader m2713ActualLinearGradientShaderVjE6UOU(long j, long j2, List<Color> list, List<Float> list2, int i) {
        List<Color> list3 = list;
        Intrinsics.checkNotNullParameter(list, "colors");
        validateColorStops(list, list2);
        int countTransparentColors = countTransparentColors(list);
        return new LinearGradient(Offset.m2572getXimpl(j), Offset.m2573getYimpl(j), Offset.m2572getXimpl(j2), Offset.m2573getYimpl(j2), makeTransparentColors(list, countTransparentColors), makeTransparentStops(list2, list, countTransparentColors), AndroidTileMode_androidKt.m2717toAndroidTileMode0vamqd0(i));
    }

    /* renamed from: ActualRadialGradientShader-8uybcMk  reason: not valid java name */
    public static final Shader m2714ActualRadialGradientShader8uybcMk(long j, float f, List<Color> list, List<Float> list2, int i) {
        Intrinsics.checkNotNullParameter(list, "colors");
        validateColorStops(list, list2);
        int countTransparentColors = countTransparentColors(list);
        return new RadialGradient(Offset.m2572getXimpl(j), Offset.m2573getYimpl(j), f, makeTransparentColors(list, countTransparentColors), makeTransparentStops(list2, list, countTransparentColors), AndroidTileMode_androidKt.m2717toAndroidTileMode0vamqd0(i));
    }

    /* renamed from: ActualSweepGradientShader-9KIMszo  reason: not valid java name */
    public static final Shader m2715ActualSweepGradientShader9KIMszo(long j, List<Color> list, List<Float> list2) {
        Intrinsics.checkNotNullParameter(list, "colors");
        validateColorStops(list, list2);
        int countTransparentColors = countTransparentColors(list);
        return new SweepGradient(Offset.m2572getXimpl(j), Offset.m2573getYimpl(j), makeTransparentColors(list, countTransparentColors), makeTransparentStops(list2, list, countTransparentColors));
    }

    /* renamed from: ActualImageShader-F49vj9s  reason: not valid java name */
    public static final Shader m2712ActualImageShaderF49vj9s(ImageBitmap imageBitmap, int i, int i2) {
        Intrinsics.checkNotNullParameter(imageBitmap, "image");
        return new BitmapShader(AndroidImageBitmap_androidKt.asAndroidBitmap(imageBitmap), AndroidTileMode_androidKt.m2717toAndroidTileMode0vamqd0(i), AndroidTileMode_androidKt.m2717toAndroidTileMode0vamqd0(i2));
    }

    public static final int[] makeTransparentColors(List<Color> list, int i) {
        Intrinsics.checkNotNullParameter(list, "colors");
        int size = list.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = ColorKt.m2875toArgb8_81llA(list.get(i2).m2831unboximpl());
        }
        return iArr;
    }

    public static final float[] makeTransparentStops(List<Float> list, List<Color> list2, int i) {
        Intrinsics.checkNotNullParameter(list2, "colors");
        if (i != 0) {
            float[] fArr = new float[(list2.size() + i)];
            fArr[0] = list != null ? list.get(0).floatValue() : 0.0f;
            int lastIndex = CollectionsKt.getLastIndex(list2);
            int i2 = 1;
            for (int i3 = 1; i3 < lastIndex; i3++) {
                long r4 = list2.get(i3).m2831unboximpl();
                float floatValue = list != null ? list.get(i3).floatValue() : ((float) i3) / ((float) CollectionsKt.getLastIndex(list2));
                int i4 = i2 + 1;
                fArr[i2] = floatValue;
                if (Color.m2823getAlphaimpl(r4) == 0.0f) {
                    i2 += 2;
                    fArr[i4] = floatValue;
                } else {
                    i2 = i4;
                }
            }
            fArr[i2] = list != null ? list.get(CollectionsKt.getLastIndex(list2)).floatValue() : 1.0f;
            return fArr;
        } else if (list != null) {
            return CollectionsKt.toFloatArray(list);
        } else {
            return null;
        }
    }

    private static final void validateColorStops(List<Color> list, List<Float> list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }
}
