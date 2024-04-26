package androidx.compose.ui.unit;

import kotlin.Metadata;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\u001a8\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0002\u001a\u001f\u0010\u000b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a!\u0010\u000b\u001a\u00020\u000f*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000e\u001a!\u0010\u0012\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0003H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a!\u0010\u0016\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0003H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0015\u001a!\u0010\u0019\u001a\u00020\u001a*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a-\u0010\u001d\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u0003H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Constraints", "Landroidx/compose/ui/unit/Constraints;", "minWidth", "", "maxWidth", "minHeight", "maxHeight", "(IIII)J", "addMaxWithMinimum", "max", "value", "constrain", "otherConstraints", "constrain-N9IONVI", "(JJ)J", "Landroidx/compose/ui/unit/IntSize;", "size", "constrain-4WqzIAM", "constrainHeight", "height", "constrainHeight-K40F9xA", "(JI)I", "constrainWidth", "width", "constrainWidth-K40F9xA", "isSatisfiedBy", "", "isSatisfiedBy-4WqzIAM", "(JJ)Z", "offset", "horizontal", "vertical", "offset-NN6Ew-U", "(JII)J", "ui-unit_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Constraints.kt */
public final class ConstraintsKt {
    public static /* synthetic */ long Constraints$default(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return Constraints(i, i2, i3, i4);
    }

    public static final long Constraints(int i, int i2, int i3, int i4) {
        if (i2 < i) {
            throw new IllegalArgumentException(("maxWidth(" + i2 + ") must be >= than minWidth(" + i + ')').toString());
        } else if (i4 < i3) {
            throw new IllegalArgumentException(("maxHeight(" + i4 + ") must be >= than minHeight(" + i3 + ')').toString());
        } else if (i >= 0 && i3 >= 0) {
            return Constraints.Companion.m5577createConstraintsZbe2FdA$ui_unit_release(i, i2, i3, i4);
        } else {
            throw new IllegalArgumentException(("minWidth(" + i + ") and minHeight(" + i3 + ") must be >= 0").toString());
        }
    }

    /* renamed from: constrain-N9IONVI  reason: not valid java name */
    public static final long m5582constrainN9IONVI(long j, long j2) {
        return Constraints(RangesKt.coerceIn(Constraints.m5572getMinWidthimpl(j2), Constraints.m5572getMinWidthimpl(j), Constraints.m5570getMaxWidthimpl(j)), RangesKt.coerceIn(Constraints.m5570getMaxWidthimpl(j2), Constraints.m5572getMinWidthimpl(j), Constraints.m5570getMaxWidthimpl(j)), RangesKt.coerceIn(Constraints.m5571getMinHeightimpl(j2), Constraints.m5571getMinHeightimpl(j), Constraints.m5569getMaxHeightimpl(j)), RangesKt.coerceIn(Constraints.m5569getMaxHeightimpl(j2), Constraints.m5571getMinHeightimpl(j), Constraints.m5569getMaxHeightimpl(j)));
    }

    /* renamed from: constrain-4WqzIAM  reason: not valid java name */
    public static final long m5581constrain4WqzIAM(long j, long j2) {
        return IntSizeKt.IntSize(RangesKt.coerceIn(IntSize.m5786getWidthimpl(j2), Constraints.m5572getMinWidthimpl(j), Constraints.m5570getMaxWidthimpl(j)), RangesKt.coerceIn(IntSize.m5785getHeightimpl(j2), Constraints.m5571getMinHeightimpl(j), Constraints.m5569getMaxHeightimpl(j)));
    }

    /* renamed from: constrainWidth-K40F9xA  reason: not valid java name */
    public static final int m5584constrainWidthK40F9xA(long j, int i) {
        return RangesKt.coerceIn(i, Constraints.m5572getMinWidthimpl(j), Constraints.m5570getMaxWidthimpl(j));
    }

    /* renamed from: constrainHeight-K40F9xA  reason: not valid java name */
    public static final int m5583constrainHeightK40F9xA(long j, int i) {
        return RangesKt.coerceIn(i, Constraints.m5571getMinHeightimpl(j), Constraints.m5569getMaxHeightimpl(j));
    }

    /* renamed from: isSatisfiedBy-4WqzIAM  reason: not valid java name */
    public static final boolean m5585isSatisfiedBy4WqzIAM(long j, long j2) {
        int r0 = Constraints.m5572getMinWidthimpl(j);
        int r1 = Constraints.m5570getMaxWidthimpl(j);
        int r2 = IntSize.m5786getWidthimpl(j2);
        if (r0 <= r2 && r2 <= r1) {
            int r02 = Constraints.m5571getMinHeightimpl(j);
            int r3 = Constraints.m5569getMaxHeightimpl(j);
            int r4 = IntSize.m5785getHeightimpl(j2);
            return r02 <= r4 && r4 <= r3;
        }
    }

    /* renamed from: offset-NN6Ew-U$default  reason: not valid java name */
    public static /* synthetic */ long m5587offsetNN6EwU$default(long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return m5586offsetNN6EwU(j, i, i2);
    }

    /* renamed from: offset-NN6Ew-U  reason: not valid java name */
    public static final long m5586offsetNN6EwU(long j, int i, int i2) {
        return Constraints(RangesKt.coerceAtLeast(Constraints.m5572getMinWidthimpl(j) + i, 0), addMaxWithMinimum(Constraints.m5570getMaxWidthimpl(j), i), RangesKt.coerceAtLeast(Constraints.m5571getMinHeightimpl(j) + i2, 0), addMaxWithMinimum(Constraints.m5569getMaxHeightimpl(j), i2));
    }

    private static final int addMaxWithMinimum(int i, int i2) {
        return i == Integer.MAX_VALUE ? i : RangesKt.coerceAtLeast(i + i2, 0);
    }
}
