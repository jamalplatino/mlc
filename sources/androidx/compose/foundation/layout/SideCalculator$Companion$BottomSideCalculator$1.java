package androidx.compose.foundation.layout;

import android.graphics.Insets;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0003H\u0016\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"androidx/compose/foundation/layout/SideCalculator$Companion$BottomSideCalculator$1", "Landroidx/compose/foundation/layout/SideCalculator;", "adjustInsets", "Landroid/graphics/Insets;", "oldInsets", "newValue", "", "consumedOffsets", "Landroidx/compose/ui/geometry/Offset;", "available", "consumedOffsets-MK-Hz9U", "(J)J", "consumedVelocity", "Landroidx/compose/ui/unit/Velocity;", "remaining", "", "consumedVelocity-QWom1Mo", "(JF)J", "motionOf", "x", "y", "valueOf", "insets", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: WindowInsetsConnection.android.kt */
public final class SideCalculator$Companion$BottomSideCalculator$1 implements SideCalculator {
    public float motionOf(float f, float f2) {
        return -f2;
    }

    SideCalculator$Companion$BottomSideCalculator$1() {
    }

    public int valueOf(Insets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        return insets.bottom;
    }

    public Insets adjustInsets(Insets insets, int i) {
        Intrinsics.checkNotNullParameter(insets, "oldInsets");
        Insets of = Insets.of(insets.left, insets.top, insets.right, i);
        Intrinsics.checkNotNullExpressionValue(of, "of(oldInsets.left, oldIn…ldInsets.right, newValue)");
        return of;
    }

    /* renamed from: consumedOffsets-MK-Hz9U  reason: not valid java name */
    public long m539consumedOffsetsMKHz9U(long j) {
        return OffsetKt.Offset(0.0f, Offset.m2573getYimpl(j));
    }

    /* renamed from: consumedVelocity-QWom1Mo  reason: not valid java name */
    public long m540consumedVelocityQWom1Mo(long j, float f) {
        return VelocityKt.Velocity(0.0f, Velocity.m5852getYimpl(j) + f);
    }
}
