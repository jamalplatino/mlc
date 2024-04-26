package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.HistoricalChange;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u001a,\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002\u001a\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0002\u001a2\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\u0011\u001a\u00020\u0001H\u0000\u001a\u0012\u0010\u0012\u001a\u00020\u0013*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016\u001a1\u0010\u0017\u001a\u00020\u0013*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0003H\u0002¢\u0006\u0002\u0010\u001d\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"AssumePointerMoveStoppedMilliseconds", "", "DefaultWeight", "", "HistorySize", "HorizonMilliseconds", "calculateImpulseVelocity", "dataPoints", "", "time", "isDataDifferential", "", "kineticEnergyToVelocity", "kineticEnergy", "polyFitLeastSquares", "x", "y", "degree", "addPointerInputChange", "", "Landroidx/compose/ui/input/pointer/util/VelocityTracker;", "event", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "set", "", "Landroidx/compose/ui/input/pointer/util/DataPointAtTime;", "index", "", "dataPoint", "([Landroidx/compose/ui/input/pointer/util/DataPointAtTime;IJF)V", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: VelocityTracker.kt */
public final class VelocityTrackerKt {
    private static final int AssumePointerMoveStoppedMilliseconds = 40;
    private static final float DefaultWeight = 1.0f;
    private static final int HistorySize = 20;
    private static final int HorizonMilliseconds = 100;

    /* access modifiers changed from: private */
    public static final void set(DataPointAtTime[] dataPointAtTimeArr, int i, long j, float f) {
        DataPointAtTime dataPointAtTime = dataPointAtTimeArr[i];
        if (dataPointAtTime == null) {
            dataPointAtTimeArr[i] = new DataPointAtTime(j, f);
            return;
        }
        dataPointAtTime.setTime(j);
        dataPointAtTime.setDataPoint(f);
    }

    public static final void addPointerInputChange(VelocityTracker velocityTracker, PointerInputChange pointerInputChange) {
        Intrinsics.checkNotNullParameter(velocityTracker, "<this>");
        Intrinsics.checkNotNullParameter(pointerInputChange, NotificationCompat.CATEGORY_EVENT);
        if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange)) {
            velocityTracker.m4447setCurrentPointerPositionAccumulatork4lQ0M$ui_release(pointerInputChange.m4324getPositionF1C5BW0());
            velocityTracker.resetTracking();
        }
        long r0 = pointerInputChange.m4325getPreviousPositionF1C5BW0();
        List<HistoricalChange> historical = pointerInputChange.getHistorical();
        int size = historical.size();
        int i = 0;
        while (i < size) {
            HistoricalChange historicalChange = historical.get(i);
            long r02 = Offset.m2576minusMKHz9U(historicalChange.m4254getPositionF1C5BW0(), r0);
            long r6 = historicalChange.m4254getPositionF1C5BW0();
            velocityTracker.m4447setCurrentPointerPositionAccumulatork4lQ0M$ui_release(Offset.m2577plusMKHz9U(velocityTracker.m4446getCurrentPointerPositionAccumulatorF1C5BW0$ui_release(), r02));
            velocityTracker.m4444addPositionUv8p0NA(historicalChange.getUptimeMillis(), velocityTracker.m4446getCurrentPointerPositionAccumulatorF1C5BW0$ui_release());
            i++;
            r0 = r6;
        }
        velocityTracker.m4447setCurrentPointerPositionAccumulatork4lQ0M$ui_release(Offset.m2577plusMKHz9U(velocityTracker.m4446getCurrentPointerPositionAccumulatorF1C5BW0$ui_release(), Offset.m2576minusMKHz9U(pointerInputChange.m4324getPositionF1C5BW0(), r0)));
        velocityTracker.m4444addPositionUv8p0NA(pointerInputChange.getUptimeMillis(), velocityTracker.m4446getCurrentPointerPositionAccumulatorF1C5BW0$ui_release());
    }

    public static final List<Float> polyFitLeastSquares(List<Float> list, List<Float> list2, int i) {
        float f;
        List<Float> list3 = list;
        List<Float> list4 = list2;
        int i2 = i;
        Intrinsics.checkNotNullParameter(list3, "x");
        Intrinsics.checkNotNullParameter(list4, "y");
        if (i2 < 1) {
            throw new IllegalArgumentException("The degree must be at positive integer");
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("x and y must be the same length");
        } else if (!list.isEmpty()) {
            int size = i2 >= list.size() ? list.size() - 1 : i2;
            int i3 = i2 + 1;
            ArrayList arrayList = new ArrayList(i3);
            for (int i4 = 0; i4 < i3; i4++) {
                arrayList.add(Float.valueOf(0.0f));
            }
            List<Float> list5 = arrayList;
            int size2 = list.size();
            int i5 = size + 1;
            Matrix matrix = new Matrix(i5, size2);
            for (int i6 = 0; i6 < size2; i6++) {
                matrix.set(0, i6, 1.0f);
                for (int i7 = 1; i7 < i5; i7++) {
                    matrix.set(i7, i6, matrix.get(i7 - 1, i6) * list3.get(i6).floatValue());
                }
            }
            Matrix matrix2 = new Matrix(i5, size2);
            Matrix matrix3 = new Matrix(i5, i5);
            int i8 = 0;
            while (i8 < i5) {
                for (int i9 = 0; i9 < size2; i9++) {
                    matrix2.set(i8, i9, matrix.get(i8, i9));
                }
                for (int i10 = 0; i10 < i8; i10++) {
                    float times = matrix2.getRow(i8).times(matrix2.getRow(i10));
                    for (int i11 = 0; i11 < size2; i11++) {
                        matrix2.set(i8, i11, matrix2.get(i8, i11) - (matrix2.get(i10, i11) * times));
                    }
                }
                float norm = matrix2.getRow(i8).norm();
                if (((double) norm) >= 1.0E-6d) {
                    float f2 = 1.0f / norm;
                    for (int i12 = 0; i12 < size2; i12++) {
                        matrix2.set(i8, i12, matrix2.get(i8, i12) * f2);
                    }
                    for (int i13 = 0; i13 < i5; i13++) {
                        if (i13 < i8) {
                            f = 0.0f;
                        } else {
                            f = matrix2.getRow(i8).times(matrix.getRow(i13));
                        }
                        matrix3.set(i8, i13, f);
                    }
                    i8++;
                } else {
                    throw new IllegalArgumentException("Vectors are linearly dependent or zero so no solution. TODO(shepshapard), actually determine what this means");
                }
            }
            Vector vector = new Vector(size2);
            for (int i14 = 0; i14 < size2; i14++) {
                vector.set(i14, list4.get(i14).floatValue() * 1.0f);
            }
            for (int i15 = size; -1 < i15; i15--) {
                list5.set(i15, Float.valueOf(matrix2.getRow(i15).times(vector)));
                int i16 = i15 + 1;
                if (i16 <= size) {
                    int i17 = size;
                    while (true) {
                        list5.set(i15, Float.valueOf(list5.get(i15).floatValue() - (matrix3.get(i15, i17) * list5.get(i17).floatValue())));
                        if (i17 == i16) {
                            break;
                        }
                        i17--;
                    }
                }
                list5.set(i15, Float.valueOf(list5.get(i15).floatValue() / matrix3.get(i15, i15)));
            }
            return list5;
        } else {
            throw new IllegalArgumentException("At least one point must be provided");
        }
    }

    /* access modifiers changed from: private */
    public static final float calculateImpulseVelocity(List<Float> list, List<Float> list2, boolean z) {
        float f;
        float f2;
        int size = list.size();
        float f3 = 0.0f;
        if (size < 2) {
            return 0.0f;
        }
        if (size != 2) {
            int i = size - 1;
            for (int i2 = i; i2 > 0; i2--) {
                int i3 = i2 - 1;
                if (list2.get(i2).floatValue() != list2.get(i3).floatValue()) {
                    float kineticEnergyToVelocity = kineticEnergyToVelocity(f3);
                    if (z) {
                        f = -list.get(i3).floatValue();
                    } else {
                        f = list.get(i2).floatValue() - list.get(i3).floatValue();
                    }
                    float floatValue = f / (list2.get(i2).floatValue() - list2.get(i3).floatValue());
                    f3 += (floatValue - kineticEnergyToVelocity) * Math.abs(floatValue);
                    if (i2 == i) {
                        f3 *= 0.5f;
                    }
                }
            }
            return kineticEnergyToVelocity(f3);
        } else if (list2.get(0).floatValue() == list2.get(1).floatValue()) {
            return 0.0f;
        } else {
            if (z) {
                f2 = list.get(0).floatValue();
            } else {
                f2 = list.get(0).floatValue() - list.get(1).floatValue();
            }
            return f2 / (list2.get(0).floatValue() - list2.get(1).floatValue());
        }
    }

    private static final float kineticEnergyToVelocity(float f) {
        return Math.signum(f) * ((float) Math.sqrt((double) (((float) 2) * Math.abs(f))));
    }
}
