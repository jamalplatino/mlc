package androidx.compose.ui.input.pointer.util;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001cB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0000\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J$\u0010\u0016\u001a\u00020\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u0018H\u0002J\u0006\u0010\u001a\u001a\u00020\u0015J\u0006\u0010\u001b\u001a\u00020\u0011R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u000e\u0010\u000b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rX\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/input/pointer/util/VelocityTracker1D;", "", "isDataDifferential", "", "(Z)V", "strategy", "Landroidx/compose/ui/input/pointer/util/VelocityTracker1D$Strategy;", "(ZLandroidx/compose/ui/input/pointer/util/VelocityTracker1D$Strategy;)V", "index", "", "()Z", "minSampleSize", "samples", "", "Landroidx/compose/ui/input/pointer/util/DataPointAtTime;", "[Landroidx/compose/ui/input/pointer/util/DataPointAtTime;", "addDataPoint", "", "timeMillis", "", "dataPoint", "", "calculateLeastSquaresVelocity", "dataPoints", "", "time", "calculateVelocity", "resetTracking", "Strategy", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: VelocityTracker.kt */
public final class VelocityTracker1D {
    public static final int $stable = 8;
    private int index;
    private final boolean isDataDifferential;
    private final int minSampleSize;
    private final DataPointAtTime[] samples;
    private final Strategy strategy;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/input/pointer/util/VelocityTracker1D$Strategy;", "", "(Ljava/lang/String;I)V", "Lsq2", "Impulse", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: VelocityTracker.kt */
    public enum Strategy {
        Lsq2,
        Impulse
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* compiled from: VelocityTracker.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                androidx.compose.ui.input.pointer.util.VelocityTracker1D$Strategy[] r0 = androidx.compose.ui.input.pointer.util.VelocityTracker1D.Strategy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.input.pointer.util.VelocityTracker1D$Strategy r1 = androidx.compose.ui.input.pointer.util.VelocityTracker1D.Strategy.Impulse     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.input.pointer.util.VelocityTracker1D$Strategy r1 = androidx.compose.ui.input.pointer.util.VelocityTracker1D.Strategy.Lsq2     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.util.VelocityTracker1D.WhenMappings.<clinit>():void");
        }
    }

    public VelocityTracker1D() {
        this(false, (Strategy) null, 3, (DefaultConstructorMarker) null);
    }

    public final boolean isDataDifferential() {
        return this.isDataDifferential;
    }

    public VelocityTracker1D(boolean z, Strategy strategy2) {
        Intrinsics.checkNotNullParameter(strategy2, "strategy");
        this.isDataDifferential = z;
        this.strategy = strategy2;
        if (!z || !strategy2.equals(Strategy.Lsq2)) {
            int i = WhenMappings.$EnumSwitchMapping$0[strategy2.ordinal()];
            int i2 = 2;
            if (i != 1) {
                if (i == 2) {
                    i2 = 3;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            this.minSampleSize = i2;
            DataPointAtTime[] dataPointAtTimeArr = new DataPointAtTime[20];
            for (int i3 = 0; i3 < 20; i3++) {
                dataPointAtTimeArr[i3] = null;
            }
            this.samples = dataPointAtTimeArr;
            return;
        }
        throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VelocityTracker1D(boolean z, Strategy strategy2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? Strategy.Lsq2 : strategy2);
    }

    public VelocityTracker1D(boolean z) {
        this(z, Strategy.Impulse);
    }

    public final void addDataPoint(long j, float f) {
        int i = (this.index + 1) % 20;
        this.index = i;
        VelocityTrackerKt.set(this.samples, i, j, f);
    }

    public final float calculateVelocity() {
        float f;
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        int i = this.index;
        DataPointAtTime dataPointAtTime = this.samples[i];
        if (dataPointAtTime == null) {
            return 0.0f;
        }
        int i2 = 0;
        DataPointAtTime dataPointAtTime2 = dataPointAtTime;
        while (true) {
            DataPointAtTime dataPointAtTime3 = this.samples[i];
            if (dataPointAtTime3 != null) {
                float time = (float) (dataPointAtTime.getTime() - dataPointAtTime3.getTime());
                float abs = (float) Math.abs(dataPointAtTime3.getTime() - dataPointAtTime2.getTime());
                if (time > 100.0f || abs > 40.0f) {
                    break;
                }
                arrayList.add(Float.valueOf(dataPointAtTime3.getDataPoint()));
                arrayList2.add(Float.valueOf(-time));
                if (i == 0) {
                    i = 20;
                }
                i--;
                i2++;
                if (i2 >= 20) {
                    break;
                }
                dataPointAtTime2 = dataPointAtTime3;
            } else {
                break;
            }
        }
        if (i2 < this.minSampleSize) {
            return 0.0f;
        }
        int i3 = WhenMappings.$EnumSwitchMapping$0[this.strategy.ordinal()];
        if (i3 == 1) {
            f = VelocityTrackerKt.calculateImpulseVelocity(arrayList, arrayList2, this.isDataDifferential);
        } else if (i3 == 2) {
            f = calculateLeastSquaresVelocity(arrayList, arrayList2);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return f * ((float) 1000);
    }

    public final void resetTracking() {
        ArraysKt.fill$default((Object[]) this.samples, (Object) null, 0, 0, 6, (Object) null);
        this.index = 0;
    }

    private final float calculateLeastSquaresVelocity(List<Float> list, List<Float> list2) {
        try {
            return VelocityTrackerKt.polyFitLeastSquares(list2, list, 2).get(1).floatValue();
        } catch (IllegalArgumentException unused) {
            return 0.0f;
        }
    }
}
