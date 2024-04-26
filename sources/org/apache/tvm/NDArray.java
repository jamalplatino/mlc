package org.apache.tvm;

import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import org.apache.tvm.Base;

public class NDArray extends NDArrayBase {
    private final Device device;
    private final TVMType dtype;

    public Device device() {
        return this.device;
    }

    NDArray(long j, boolean z, TVMType tVMType, Device device2) {
        super(j, z);
        this.dtype = tVMType;
        this.device = device2;
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        super.finalize();
    }

    public void copyFrom(double[] dArr) {
        checkCopySize(dArr.length);
        if (this.dtype.typeCode == 2 && this.dtype.bits == 64) {
            byte[] bArr = new byte[(dArr.length * this.dtype.numOfBytes)];
            for (int i = 0; i < dArr.length; i++) {
                wrapBytes(bArr, this.dtype.numOfBytes * i, this.dtype.numOfBytes).putDouble(dArr[i]);
            }
            NDArray empty = empty(shape(), this.dtype);
            Base.checkCall(Base._LIB.tvmArrayCopyFromJArray(bArr, empty.handle, this.handle));
            empty.release();
            return;
        }
        throw new IllegalArgumentException("Cannot set double[] for " + this.dtype.toString() + " array");
    }

    public void copyFrom(float[] fArr) {
        checkCopySize(fArr.length);
        if (this.dtype.typeCode == 2 && this.dtype.bits == 32) {
            byte[] bArr = new byte[(fArr.length * this.dtype.numOfBytes)];
            for (int i = 0; i < fArr.length; i++) {
                wrapBytes(bArr, this.dtype.numOfBytes * i, this.dtype.numOfBytes).putFloat(fArr[i]);
            }
            NDArray empty = empty(shape(), this.dtype);
            Base.checkCall(Base._LIB.tvmArrayCopyFromJArray(bArr, empty.handle, this.handle));
            empty.release();
            return;
        }
        throw new IllegalArgumentException("Cannot set float[] for " + this.dtype.toString() + " array");
    }

    public void copyFrom(long[] jArr) {
        checkCopySize(jArr.length);
        if (this.dtype.typeCode == 0 && this.dtype.bits == 64) {
            byte[] bArr = new byte[(jArr.length * this.dtype.numOfBytes)];
            for (int i = 0; i < jArr.length; i++) {
                wrapBytes(bArr, this.dtype.numOfBytes * i, this.dtype.numOfBytes).putLong(jArr[i]);
            }
            NDArray empty = empty(shape(), this.dtype);
            Base.checkCall(Base._LIB.tvmArrayCopyFromJArray(bArr, empty.handle, this.handle));
            empty.release();
            return;
        }
        throw new IllegalArgumentException("Cannot set long[] for " + this.dtype.toString() + " array");
    }

    public void copyFrom(int[] iArr) {
        checkCopySize(iArr.length);
        if (this.dtype.typeCode == 0 && this.dtype.bits == 32) {
            byte[] bArr = new byte[(iArr.length * this.dtype.numOfBytes)];
            for (int i = 0; i < iArr.length; i++) {
                wrapBytes(bArr, this.dtype.numOfBytes * i, this.dtype.numOfBytes).putInt(iArr[i]);
            }
            NDArray empty = empty(shape(), this.dtype);
            Base.checkCall(Base._LIB.tvmArrayCopyFromJArray(bArr, empty.handle, this.handle));
            empty.release();
            return;
        }
        throw new IllegalArgumentException("Cannot set int[] for " + this.dtype.toString() + " array");
    }

    public void copyFrom(short[] sArr) {
        checkCopySize(sArr.length);
        if (this.dtype.typeCode == 0 && this.dtype.bits == 16) {
            byte[] bArr = new byte[(sArr.length * this.dtype.numOfBytes)];
            for (int i = 0; i < sArr.length; i++) {
                wrapBytes(bArr, this.dtype.numOfBytes * i, this.dtype.numOfBytes).putShort(sArr[i]);
            }
            NDArray empty = empty(shape(), this.dtype);
            Base.checkCall(Base._LIB.tvmArrayCopyFromJArray(bArr, empty.handle, this.handle));
            empty.release();
            return;
        }
        throw new IllegalArgumentException("Cannot set short[] for " + this.dtype.toString() + " array");
    }

    public void copyFrom(byte[] bArr) {
        checkCopySize(bArr.length);
        if (this.dtype.typeCode == 0 && this.dtype.bits == 8) {
            copyFromRaw(bArr);
        } else {
            throw new IllegalArgumentException("Cannot set byte[] for " + this.dtype.toString() + " array");
        }
    }

    public void copyFrom(char[] cArr) {
        checkCopySize(cArr.length);
        if (this.dtype.typeCode == 1 && this.dtype.bits == 16) {
            byte[] bArr = new byte[(cArr.length * this.dtype.numOfBytes)];
            for (int i = 0; i < cArr.length; i++) {
                wrapBytes(bArr, this.dtype.numOfBytes * i, this.dtype.numOfBytes).putChar(cArr[i]);
            }
            NDArray empty = empty(shape(), this.dtype);
            Base.checkCall(Base._LIB.tvmArrayCopyFromJArray(bArr, empty.handle, this.handle));
            empty.release();
            return;
        }
        throw new IllegalArgumentException("Cannot set char[] for " + this.dtype.toString() + " array");
    }

    private void checkCopySize(int i) {
        if (size() != ((long) i)) {
            throw new IllegalArgumentException(String.format("Array shape size not match: %d v.s. %d", new Object[]{Integer.valueOf(i), Long.valueOf(size())}));
        }
    }

    public void copyFromRaw(byte[] bArr) {
        NDArray empty = empty(shape(), this.dtype);
        Base.checkCall(Base._LIB.tvmArrayCopyFromJArray(bArr, empty.handle, this.handle));
        empty.release();
    }

    public long[] shape() {
        ArrayList arrayList = new ArrayList();
        Base.checkCall(Base._LIB.tvmArrayGetShape(this.handle, arrayList));
        int size = arrayList.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = ((Long) arrayList.get(i)).longValue();
        }
        return jArr;
    }

    public long size() {
        long j = 1;
        for (long j2 : shape()) {
            j *= j2;
        }
        return j;
    }

    public double[] asDoubleArray() {
        if (this.dtype.typeCode == 2 && this.dtype.bits == 64) {
            byte[][] groupInternalBytes = groupInternalBytes();
            double[] dArr = new double[groupInternalBytes.length];
            for (int i = 0; i < groupInternalBytes.length; i++) {
                dArr[i] = wrapBytes(groupInternalBytes[i]).getDouble();
            }
            return dArr;
        }
        throw new IllegalArgumentException("Cannot set convert to double[] for " + this.dtype.toString() + " array");
    }

    public float[] asFloatArray() {
        if (this.dtype.typeCode == 2 && this.dtype.bits == 32) {
            byte[][] groupInternalBytes = groupInternalBytes();
            float[] fArr = new float[groupInternalBytes.length];
            for (int i = 0; i < groupInternalBytes.length; i++) {
                fArr[i] = wrapBytes(groupInternalBytes[i]).getFloat();
            }
            return fArr;
        }
        throw new IllegalArgumentException("Cannot set convert to float[] for " + this.dtype.toString() + " array");
    }

    public long[] asLongArray() {
        if (this.dtype.typeCode == 0 && this.dtype.bits == 64) {
            byte[][] groupInternalBytes = groupInternalBytes();
            long[] jArr = new long[groupInternalBytes.length];
            for (int i = 0; i < groupInternalBytes.length; i++) {
                jArr[i] = wrapBytes(groupInternalBytes[i]).getLong();
            }
            return jArr;
        }
        throw new IllegalArgumentException("Cannot set convert to long[] for " + this.dtype.toString() + " array");
    }

    public int[] asIntArray() {
        if (this.dtype.typeCode == 0 && this.dtype.bits == 32) {
            byte[][] groupInternalBytes = groupInternalBytes();
            int[] iArr = new int[groupInternalBytes.length];
            for (int i = 0; i < groupInternalBytes.length; i++) {
                iArr[i] = wrapBytes(groupInternalBytes[i]).getInt();
            }
            return iArr;
        }
        throw new IllegalArgumentException("Cannot set convert to int[] for " + this.dtype.toString() + " array");
    }

    public short[] asShortArray() {
        if (this.dtype.typeCode == 0 && this.dtype.bits == 16) {
            byte[][] groupInternalBytes = groupInternalBytes();
            short[] sArr = new short[groupInternalBytes.length];
            for (int i = 0; i < groupInternalBytes.length; i++) {
                sArr[i] = wrapBytes(groupInternalBytes[i]).getShort();
            }
            return sArr;
        }
        throw new IllegalArgumentException("Cannot set convert to short[] for " + this.dtype.toString() + " array");
    }

    public char[] asCharArray() {
        if (this.dtype.typeCode == 1 && this.dtype.bits == 16) {
            byte[][] groupInternalBytes = groupInternalBytes();
            char[] cArr = new char[groupInternalBytes.length];
            for (int i = 0; i < groupInternalBytes.length; i++) {
                cArr[i] = wrapBytes(groupInternalBytes[i]).getChar();
            }
            return cArr;
        }
        throw new IllegalArgumentException("Cannot set convert to char[] for " + this.dtype.toString() + " array");
    }

    public byte[] asByteArray() {
        if (this.dtype.typeCode == 0 && this.dtype.bits == 8) {
            return internal();
        }
        throw new IllegalArgumentException("Cannot set convert to byte[] for " + this.dtype.toString() + " array");
    }

    public byte[] internal() {
        NDArray empty = empty(shape(), this.dtype);
        copyTo(empty);
        byte[] bArr = new byte[(this.dtype.numOfBytes * ((int) size()))];
        Base.checkCall(Base._LIB.tvmArrayCopyToJArray(empty.handle, bArr));
        return bArr;
    }

    private byte[][] groupInternalBytes() {
        byte[] internal = internal();
        int i = this.dtype.numOfBytes;
        if (internal.length <= 0 || internal.length % i != 0) {
            throw new IllegalArgumentException(String.format("%s size %d cannot divide byte array size %d", new Object[]{this.dtype.toString(), Integer.valueOf(i), Integer.valueOf(internal.length)}));
        }
        int length = internal.length / i;
        byte[][] bArr = (byte[][]) Array.newInstance(Byte.TYPE, new int[]{length, i});
        for (int i2 = 0; i2 < length; i2++) {
            System.arraycopy(internal, i2 * i, bArr[i2], 0, i);
        }
        return bArr;
    }

    public static NDArray empty(long[] jArr, TVMType tVMType, Device device2) {
        Base.RefLong refLong = new Base.RefLong();
        Base.checkCall(Base._LIB.tvmArrayAlloc(jArr, tVMType.typeCode, tVMType.bits, tVMType.lanes, device2.deviceType, device2.deviceId, refLong));
        return new NDArray(refLong.value, false, tVMType, device2);
    }

    public static NDArray empty(long[] jArr, TVMType tVMType) {
        return empty(jArr, tVMType, Device.cpu(0));
    }

    public static NDArray empty(long[] jArr) {
        return empty(jArr, new TVMType("float32", 1), Device.cpu(0));
    }

    public static NDArray empty(long[] jArr, Device device2) {
        return empty(jArr, new TVMType("float32", 1), device2);
    }

    private static ByteBuffer wrapBytes(byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return wrap;
    }

    private static ByteBuffer wrapBytes(byte[] bArr, int i, int i2) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, i2);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return wrap;
    }
}
