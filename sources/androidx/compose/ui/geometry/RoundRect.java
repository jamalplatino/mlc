package androidx.compose.ui.geometry;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 >2\u00020\u0001:\u0001>BP\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\bø\u0001\u0000¢\u0006\u0002\u0010\fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u0019\u0010!\u001a\u00020\bHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010\u0011J\u0019\u0010#\u001a\u00020\bHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b$\u0010\u0011J\u0019\u0010%\u001a\u00020\bHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010\u0011J\u0019\u0010'\u001a\u00020\bHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010\u0011J\u001e\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b-\u0010.Jf\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b0\u00101J\u0013\u00102\u001a\u00020*2\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u000205HÖ\u0001J(\u00106\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00032\u0006\u00108\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u0003H\u0002J\b\u0010;\u001a\u00020\u0000H\u0002J\b\u0010<\u001a\u00020=H\u0016R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0000X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u000b\u001a\u00020\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\n\u001a\u00020\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000fR\u001c\u0010\u0007\u001a\u00020\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0019\u0010\u0011R\u001c\u0010\t\u001a\u00020\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u001a\u0010\u0011R\u0011\u0010\u001b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u000f\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006?"}, d2 = {"Landroidx/compose/ui/geometry/RoundRect;", "", "left", "", "top", "right", "bottom", "topLeftCornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "topRightCornerRadius", "bottomRightCornerRadius", "bottomLeftCornerRadius", "(FFFFJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "_scaledRadiiRect", "getBottom", "()F", "getBottomLeftCornerRadius-kKHJgLs", "()J", "J", "getBottomRightCornerRadius-kKHJgLs", "height", "getHeight", "getLeft", "getRight", "getTop", "getTopLeftCornerRadius-kKHJgLs", "getTopRightCornerRadius-kKHJgLs", "width", "getWidth", "component1", "component2", "component3", "component4", "component5", "component5-kKHJgLs", "component6", "component6-kKHJgLs", "component7", "component7-kKHJgLs", "component8", "component8-kKHJgLs", "contains", "", "point", "Landroidx/compose/ui/geometry/Offset;", "contains-k-4lQ0M", "(J)Z", "copy", "copy-MDFrsts", "(FFFFJJJJ)Landroidx/compose/ui/geometry/RoundRect;", "equals", "other", "hashCode", "", "minRadius", "min", "radius1", "radius2", "limit", "scaledRadiiRect", "toString", "", "Companion", "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: RoundRect.kt */
public final class RoundRect {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final RoundRect Zero = RoundRectKt.m2626RoundRectgG7oq9Y(0.0f, 0.0f, 0.0f, 0.0f, CornerRadius.Companion.m2557getZerokKHJgLs());
    private RoundRect _scaledRadiiRect;
    private final float bottom;
    private final long bottomLeftCornerRadius;
    private final long bottomRightCornerRadius;
    private final float left;
    private final float right;
    private final float top;
    private final long topLeftCornerRadius;
    private final long topRightCornerRadius;

    public /* synthetic */ RoundRect(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, j, j2, j3, j4);
    }

    /* renamed from: copy-MDFrsts$default  reason: not valid java name */
    public static /* synthetic */ RoundRect m2613copyMDFrsts$default(RoundRect roundRect, float f, float f2, float f3, float f4, long j, long j2, long j3, long j4, int i, Object obj) {
        RoundRect roundRect2 = roundRect;
        int i2 = i;
        return roundRect.m2619copyMDFrsts((i2 & 1) != 0 ? roundRect2.left : f, (i2 & 2) != 0 ? roundRect2.top : f2, (i2 & 4) != 0 ? roundRect2.right : f3, (i2 & 8) != 0 ? roundRect2.bottom : f4, (i2 & 16) != 0 ? roundRect2.topLeftCornerRadius : j, (i2 & 32) != 0 ? roundRect2.topRightCornerRadius : j2, (i2 & 64) != 0 ? roundRect2.bottomRightCornerRadius : j3, (i2 & 128) != 0 ? roundRect2.bottomLeftCornerRadius : j4);
    }

    public static final RoundRect getZero() {
        return Companion.getZero();
    }

    public final float component1() {
        return this.left;
    }

    public final float component2() {
        return this.top;
    }

    public final float component3() {
        return this.right;
    }

    public final float component4() {
        return this.bottom;
    }

    /* renamed from: component5-kKHJgLs  reason: not valid java name */
    public final long m2614component5kKHJgLs() {
        return this.topLeftCornerRadius;
    }

    /* renamed from: component6-kKHJgLs  reason: not valid java name */
    public final long m2615component6kKHJgLs() {
        return this.topRightCornerRadius;
    }

    /* renamed from: component7-kKHJgLs  reason: not valid java name */
    public final long m2616component7kKHJgLs() {
        return this.bottomRightCornerRadius;
    }

    /* renamed from: component8-kKHJgLs  reason: not valid java name */
    public final long m2617component8kKHJgLs() {
        return this.bottomLeftCornerRadius;
    }

    /* renamed from: copy-MDFrsts  reason: not valid java name */
    public final RoundRect m2619copyMDFrsts(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        return new RoundRect(f, f2, f3, f4, j, j2, j3, j4, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoundRect)) {
            return false;
        }
        RoundRect roundRect = (RoundRect) obj;
        return Float.compare(this.left, roundRect.left) == 0 && Float.compare(this.top, roundRect.top) == 0 && Float.compare(this.right, roundRect.right) == 0 && Float.compare(this.bottom, roundRect.bottom) == 0 && CornerRadius.m2546equalsimpl0(this.topLeftCornerRadius, roundRect.topLeftCornerRadius) && CornerRadius.m2546equalsimpl0(this.topRightCornerRadius, roundRect.topRightCornerRadius) && CornerRadius.m2546equalsimpl0(this.bottomRightCornerRadius, roundRect.bottomRightCornerRadius) && CornerRadius.m2546equalsimpl0(this.bottomLeftCornerRadius, roundRect.bottomLeftCornerRadius);
    }

    public final float getBottom() {
        return this.bottom;
    }

    /* renamed from: getBottomLeftCornerRadius-kKHJgLs  reason: not valid java name */
    public final long m2620getBottomLeftCornerRadiuskKHJgLs() {
        return this.bottomLeftCornerRadius;
    }

    /* renamed from: getBottomRightCornerRadius-kKHJgLs  reason: not valid java name */
    public final long m2621getBottomRightCornerRadiuskKHJgLs() {
        return this.bottomRightCornerRadius;
    }

    public final float getHeight() {
        return this.bottom - this.top;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getRight() {
        return this.right;
    }

    public final float getTop() {
        return this.top;
    }

    /* renamed from: getTopLeftCornerRadius-kKHJgLs  reason: not valid java name */
    public final long m2622getTopLeftCornerRadiuskKHJgLs() {
        return this.topLeftCornerRadius;
    }

    /* renamed from: getTopRightCornerRadius-kKHJgLs  reason: not valid java name */
    public final long m2623getTopRightCornerRadiuskKHJgLs() {
        return this.topRightCornerRadius;
    }

    public final float getWidth() {
        return this.right - this.left;
    }

    public int hashCode() {
        return (((((((((((((Float.hashCode(this.left) * 31) + Float.hashCode(this.top)) * 31) + Float.hashCode(this.right)) * 31) + Float.hashCode(this.bottom)) * 31) + CornerRadius.m2549hashCodeimpl(this.topLeftCornerRadius)) * 31) + CornerRadius.m2549hashCodeimpl(this.topRightCornerRadius)) * 31) + CornerRadius.m2549hashCodeimpl(this.bottomRightCornerRadius)) * 31) + CornerRadius.m2549hashCodeimpl(this.bottomLeftCornerRadius);
    }

    private RoundRect(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.left = f;
        this.top = f2;
        this.right = f3;
        this.bottom = f4;
        this.topLeftCornerRadius = j;
        this.topRightCornerRadius = j2;
        this.bottomRightCornerRadius = j3;
        this.bottomLeftCornerRadius = j4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ RoundRect(float r18, float r19, float r20, float r21, long r22, long r24, long r26, long r28, int r30, kotlin.jvm.internal.DefaultConstructorMarker r31) {
        /*
            r17 = this;
            r0 = r30
            r1 = r0 & 16
            if (r1 == 0) goto L_0x000e
            androidx.compose.ui.geometry.CornerRadius$Companion r1 = androidx.compose.ui.geometry.CornerRadius.Companion
            long r1 = r1.m2557getZerokKHJgLs()
            r8 = r1
            goto L_0x0010
        L_0x000e:
            r8 = r22
        L_0x0010:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x001c
            androidx.compose.ui.geometry.CornerRadius$Companion r1 = androidx.compose.ui.geometry.CornerRadius.Companion
            long r1 = r1.m2557getZerokKHJgLs()
            r10 = r1
            goto L_0x001e
        L_0x001c:
            r10 = r24
        L_0x001e:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x002a
            androidx.compose.ui.geometry.CornerRadius$Companion r1 = androidx.compose.ui.geometry.CornerRadius.Companion
            long r1 = r1.m2557getZerokKHJgLs()
            r12 = r1
            goto L_0x002c
        L_0x002a:
            r12 = r26
        L_0x002c:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0038
            androidx.compose.ui.geometry.CornerRadius$Companion r0 = androidx.compose.ui.geometry.CornerRadius.Companion
            long r0 = r0.m2557getZerokKHJgLs()
            r14 = r0
            goto L_0x003a
        L_0x0038:
            r14 = r28
        L_0x003a:
            r16 = 0
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r3.<init>(r4, r5, r6, r7, r8, r10, r12, r14, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.geometry.RoundRect.<init>(float, float, float, float, long, long, long, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    private final RoundRect scaledRadiiRect() {
        RoundRect roundRect = this._scaledRadiiRect;
        if (roundRect != null) {
            return roundRect;
        }
        RoundRect roundRect2 = this;
        float minRadius = minRadius(minRadius(minRadius(minRadius(1.0f, CornerRadius.m2548getYimpl(this.bottomLeftCornerRadius), CornerRadius.m2548getYimpl(this.topLeftCornerRadius), getHeight()), CornerRadius.m2547getXimpl(this.topLeftCornerRadius), CornerRadius.m2547getXimpl(this.topRightCornerRadius), getWidth()), CornerRadius.m2548getYimpl(this.topRightCornerRadius), CornerRadius.m2548getYimpl(this.bottomRightCornerRadius), getHeight()), CornerRadius.m2547getXimpl(this.bottomRightCornerRadius), CornerRadius.m2547getXimpl(this.bottomLeftCornerRadius), getWidth());
        RoundRect roundRect3 = r2;
        RoundRect roundRect4 = new RoundRect(this.left * minRadius, this.top * minRadius, this.right * minRadius, this.bottom * minRadius, CornerRadiusKt.CornerRadius(CornerRadius.m2547getXimpl(this.topLeftCornerRadius) * minRadius, CornerRadius.m2548getYimpl(this.topLeftCornerRadius) * minRadius), CornerRadiusKt.CornerRadius(CornerRadius.m2547getXimpl(this.topRightCornerRadius) * minRadius, CornerRadius.m2548getYimpl(this.topRightCornerRadius) * minRadius), CornerRadiusKt.CornerRadius(CornerRadius.m2547getXimpl(this.bottomRightCornerRadius) * minRadius, CornerRadius.m2548getYimpl(this.bottomRightCornerRadius) * minRadius), CornerRadiusKt.CornerRadius(CornerRadius.m2547getXimpl(this.bottomLeftCornerRadius) * minRadius, CornerRadius.m2548getYimpl(this.bottomLeftCornerRadius) * minRadius), (DefaultConstructorMarker) null);
        RoundRect roundRect5 = roundRect3;
        this._scaledRadiiRect = roundRect5;
        return roundRect5;
    }

    private final float minRadius(float f, float f2, float f3, float f4) {
        float f5 = f2 + f3;
        return (f5 <= f4 || f5 == 0.0f) ? f : Math.min(f, f4 / f5);
    }

    /* renamed from: contains-k-4lQ0M  reason: not valid java name */
    public final boolean m2618containsk4lQ0M(long j) {
        float f;
        float f2;
        float f3;
        float f4;
        if (Offset.m2572getXimpl(j) < this.left || Offset.m2572getXimpl(j) >= this.right || Offset.m2573getYimpl(j) < this.top || Offset.m2573getYimpl(j) >= this.bottom) {
            return false;
        }
        RoundRect scaledRadiiRect = scaledRadiiRect();
        if (Offset.m2572getXimpl(j) < this.left + CornerRadius.m2547getXimpl(scaledRadiiRect.topLeftCornerRadius) && Offset.m2573getYimpl(j) < this.top + CornerRadius.m2548getYimpl(scaledRadiiRect.topLeftCornerRadius)) {
            f3 = (Offset.m2572getXimpl(j) - this.left) - CornerRadius.m2547getXimpl(scaledRadiiRect.topLeftCornerRadius);
            f2 = (Offset.m2573getYimpl(j) - this.top) - CornerRadius.m2548getYimpl(scaledRadiiRect.topLeftCornerRadius);
            f = CornerRadius.m2547getXimpl(scaledRadiiRect.topLeftCornerRadius);
            f4 = CornerRadius.m2548getYimpl(scaledRadiiRect.topLeftCornerRadius);
        } else if (Offset.m2572getXimpl(j) > this.right - CornerRadius.m2547getXimpl(scaledRadiiRect.topRightCornerRadius) && Offset.m2573getYimpl(j) < this.top + CornerRadius.m2548getYimpl(scaledRadiiRect.topRightCornerRadius)) {
            f3 = (Offset.m2572getXimpl(j) - this.right) + CornerRadius.m2547getXimpl(scaledRadiiRect.topRightCornerRadius);
            f2 = (Offset.m2573getYimpl(j) - this.top) - CornerRadius.m2548getYimpl(scaledRadiiRect.topRightCornerRadius);
            f = CornerRadius.m2547getXimpl(scaledRadiiRect.topRightCornerRadius);
            f4 = CornerRadius.m2548getYimpl(scaledRadiiRect.topRightCornerRadius);
        } else if (Offset.m2572getXimpl(j) > this.right - CornerRadius.m2547getXimpl(scaledRadiiRect.bottomRightCornerRadius) && Offset.m2573getYimpl(j) > this.bottom - CornerRadius.m2548getYimpl(scaledRadiiRect.bottomRightCornerRadius)) {
            f3 = (Offset.m2572getXimpl(j) - this.right) + CornerRadius.m2547getXimpl(scaledRadiiRect.bottomRightCornerRadius);
            f2 = (Offset.m2573getYimpl(j) - this.bottom) + CornerRadius.m2548getYimpl(scaledRadiiRect.bottomRightCornerRadius);
            f = CornerRadius.m2547getXimpl(scaledRadiiRect.bottomRightCornerRadius);
            f4 = CornerRadius.m2548getYimpl(scaledRadiiRect.bottomRightCornerRadius);
        } else if (Offset.m2572getXimpl(j) >= this.left + CornerRadius.m2547getXimpl(scaledRadiiRect.bottomLeftCornerRadius) || Offset.m2573getYimpl(j) <= this.bottom - CornerRadius.m2548getYimpl(scaledRadiiRect.bottomLeftCornerRadius)) {
            return true;
        } else {
            f3 = (Offset.m2572getXimpl(j) - this.left) - CornerRadius.m2547getXimpl(scaledRadiiRect.bottomLeftCornerRadius);
            f2 = (Offset.m2573getYimpl(j) - this.bottom) + CornerRadius.m2548getYimpl(scaledRadiiRect.bottomLeftCornerRadius);
            f = CornerRadius.m2547getXimpl(scaledRadiiRect.bottomLeftCornerRadius);
            f4 = CornerRadius.m2548getYimpl(scaledRadiiRect.bottomLeftCornerRadius);
        }
        float f5 = f3 / f;
        float f6 = f2 / f4;
        if ((f5 * f5) + (f6 * f6) <= 1.0f) {
            return true;
        }
        return false;
    }

    public String toString() {
        long j = this.topLeftCornerRadius;
        long j2 = this.topRightCornerRadius;
        long j3 = this.bottomRightCornerRadius;
        long j4 = this.bottomLeftCornerRadius;
        String str = GeometryUtilsKt.toStringAsFixed(this.left, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.top, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.right, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.bottom, 1);
        if (!CornerRadius.m2546equalsimpl0(j, j2) || !CornerRadius.m2546equalsimpl0(j2, j3) || !CornerRadius.m2546equalsimpl0(j3, j4)) {
            return "RoundRect(rect=" + str + ", topLeft=" + CornerRadius.m2553toStringimpl(j) + ", topRight=" + CornerRadius.m2553toStringimpl(j2) + ", bottomRight=" + CornerRadius.m2553toStringimpl(j3) + ", bottomLeft=" + CornerRadius.m2553toStringimpl(j4) + ')';
        }
        if (CornerRadius.m2547getXimpl(j) == CornerRadius.m2548getYimpl(j)) {
            return "RoundRect(rect=" + str + ", radius=" + GeometryUtilsKt.toStringAsFixed(CornerRadius.m2547getXimpl(j), 1) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + GeometryUtilsKt.toStringAsFixed(CornerRadius.m2547getXimpl(j), 1) + ", y=" + GeometryUtilsKt.toStringAsFixed(CornerRadius.m2548getYimpl(j), 1) + ')';
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/geometry/RoundRect$Companion;", "", "()V", "Zero", "Landroidx/compose/ui/geometry/RoundRect;", "getZero$annotations", "getZero", "()Landroidx/compose/ui/geometry/RoundRect;", "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: RoundRect.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getZero$annotations() {
        }

        private Companion() {
        }

        public final RoundRect getZero() {
            return RoundRect.Zero;
        }
    }
}
