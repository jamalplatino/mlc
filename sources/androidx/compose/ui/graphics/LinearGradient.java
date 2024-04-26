package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001BD\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0002\u0010\fJ!\u0010\u0013\u001a\u00060\u0014j\u0002`\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000R\u0019\u0010\t\u001a\u00020\bX\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\rR\u001d\u0010\u000e\u001a\u00020\u000f8VX\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0007\u001a\u00020\bX\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\rR\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\n\u001a\u00020\u000bX\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0012\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/ui/graphics/LinearGradient;", "Landroidx/compose/ui/graphics/ShaderBrush;", "colors", "", "Landroidx/compose/ui/graphics/Color;", "stops", "", "start", "Landroidx/compose/ui/geometry/Offset;", "end", "tileMode", "Landroidx/compose/ui/graphics/TileMode;", "(Ljava/util/List;Ljava/util/List;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "intrinsicSize", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "I", "createShader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "size", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: Brush.kt */
public final class LinearGradient extends ShaderBrush {
    private final List<Color> colors;
    private final long end;
    private final long start;
    private final List<Float> stops;
    private final int tileMode;

    public /* synthetic */ LinearGradient(List list, List list2, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, j, j2, i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LinearGradient(List list, List list2, long j, long j2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i2 & 2) != 0 ? null : list2, j, j2, (i2 & 16) != 0 ? TileMode.Companion.m3225getClamp3opZhB0() : i, (DefaultConstructorMarker) null);
    }

    private LinearGradient(List<Color> list, List<Float> list2, long j, long j2, int i) {
        this.colors = list;
        this.stops = list2;
        this.start = j;
        this.end = j2;
        this.tileMode = i;
    }

    /* renamed from: getIntrinsicSize-NH-jbRc  reason: not valid java name */
    public long m3045getIntrinsicSizeNHjbRc() {
        float f;
        float r0 = Offset.m2572getXimpl(this.start);
        float f2 = Float.NaN;
        if (!Float.isInfinite(r0) && !Float.isNaN(r0)) {
            float r02 = Offset.m2572getXimpl(this.end);
            if (!Float.isInfinite(r02) && !Float.isNaN(r02)) {
                f = Math.abs(Offset.m2572getXimpl(this.start) - Offset.m2572getXimpl(this.end));
                float r1 = Offset.m2573getYimpl(this.start);
                if (!Float.isInfinite(r1) && !Float.isNaN(r1)) {
                    float r12 = Offset.m2573getYimpl(this.end);
                    if (!Float.isInfinite(r12) && !Float.isNaN(r12)) {
                        f2 = Math.abs(Offset.m2573getYimpl(this.start) - Offset.m2573getYimpl(this.end));
                    }
                }
                return SizeKt.Size(f, f2);
            }
        }
        f = Float.NaN;
        float r13 = Offset.m2573getYimpl(this.start);
        float r122 = Offset.m2573getYimpl(this.end);
        f2 = Math.abs(Offset.m2573getYimpl(this.start) - Offset.m2573getYimpl(this.end));
        return SizeKt.Size(f, f2);
    }

    /* renamed from: createShader-uvyYCjk  reason: not valid java name */
    public Shader m3044createShaderuvyYCjk(long j) {
        return ShaderKt.m3163LinearGradientShaderVjE6UOU(OffsetKt.Offset(Offset.m2572getXimpl(this.start) == Float.POSITIVE_INFINITY ? Size.m2641getWidthimpl(j) : Offset.m2572getXimpl(this.start), Offset.m2573getYimpl(this.start) == Float.POSITIVE_INFINITY ? Size.m2638getHeightimpl(j) : Offset.m2573getYimpl(this.start)), OffsetKt.Offset(Offset.m2572getXimpl(this.end) == Float.POSITIVE_INFINITY ? Size.m2641getWidthimpl(j) : Offset.m2572getXimpl(this.end), Offset.m2573getYimpl(this.end) == Float.POSITIVE_INFINITY ? Size.m2638getHeightimpl(j) : Offset.m2573getYimpl(this.end)), this.colors, this.stops, this.tileMode);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinearGradient)) {
            return false;
        }
        LinearGradient linearGradient = (LinearGradient) obj;
        return Intrinsics.areEqual((Object) this.colors, (Object) linearGradient.colors) && Intrinsics.areEqual((Object) this.stops, (Object) linearGradient.stops) && Offset.m2569equalsimpl0(this.start, linearGradient.start) && Offset.m2569equalsimpl0(this.end, linearGradient.end) && TileMode.m3221equalsimpl0(this.tileMode, linearGradient.tileMode);
    }

    public int hashCode() {
        int hashCode = this.colors.hashCode() * 31;
        List<Float> list = this.stops;
        return ((((((hashCode + (list != null ? list.hashCode() : 0)) * 31) + Offset.m2574hashCodeimpl(this.start)) * 31) + Offset.m2574hashCodeimpl(this.end)) * 31) + TileMode.m3222hashCodeimpl(this.tileMode);
    }

    public String toString() {
        String str = "";
        String str2 = OffsetKt.m2589isFinitek4lQ0M(this.start) ? "start=" + Offset.m2580toStringimpl(this.start) + ", " : str;
        if (OffsetKt.m2589isFinitek4lQ0M(this.end)) {
            str = "end=" + Offset.m2580toStringimpl(this.end) + ", ";
        }
        return "LinearGradient(colors=" + this.colors + ", stops=" + this.stops + ", " + str2 + str + "tileMode=" + TileMode.m3223toStringimpl(this.tileMode) + ')';
    }
}
