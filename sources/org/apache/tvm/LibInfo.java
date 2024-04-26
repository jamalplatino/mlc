package org.apache.tvm;

import java.util.List;
import org.apache.tvm.Base;
import org.apache.tvm.Function;

class LibInfo {
    /* access modifiers changed from: package-private */
    public native int nativeLibInit(String str);

    /* access modifiers changed from: package-private */
    public native int shutdown();

    /* access modifiers changed from: package-private */
    public native int tvmArrayAlloc(long[] jArr, int i, int i2, int i3, int i4, int i5, Base.RefLong refLong);

    /* access modifiers changed from: package-private */
    public native int tvmArrayCopyFromJArray(byte[] bArr, long j, long j2);

    /* access modifiers changed from: package-private */
    public native int tvmArrayCopyFromTo(long j, long j2);

    /* access modifiers changed from: package-private */
    public native int tvmArrayCopyToJArray(long j, byte[] bArr);

    /* access modifiers changed from: package-private */
    public native int tvmArrayFree(long j);

    /* access modifiers changed from: package-private */
    public native int tvmArrayGetShape(long j, List<Long> list);

    /* access modifiers changed from: package-private */
    public native int tvmFuncCall(long j, Base.RefTVMValue refTVMValue);

    /* access modifiers changed from: package-private */
    public native int tvmFuncCreateFromCFunc(Function.Callback callback, Base.RefLong refLong);

    /* access modifiers changed from: package-private */
    public native int tvmFuncFree(long j);

    /* access modifiers changed from: package-private */
    public native int tvmFuncGetGlobal(String str, Base.RefLong refLong);

    /* access modifiers changed from: package-private */
    public native int tvmFuncListGlobalNames(List<String> list);

    /* access modifiers changed from: package-private */
    public native void tvmFuncPushArgBytes(byte[] bArr);

    /* access modifiers changed from: package-private */
    public native void tvmFuncPushArgDouble(double d);

    /* access modifiers changed from: package-private */
    public native void tvmFuncPushArgHandle(long j, int i);

    /* access modifiers changed from: package-private */
    public native void tvmFuncPushArgLong(long j);

    /* access modifiers changed from: package-private */
    public native void tvmFuncPushArgString(String str);

    /* access modifiers changed from: package-private */
    public native int tvmFuncRegisterGlobal(String str, long j, int i);

    /* access modifiers changed from: package-private */
    public native String tvmGetLastError();

    /* access modifiers changed from: package-private */
    public native int tvmModFree(long j);

    /* access modifiers changed from: package-private */
    public native int tvmModGetFunction(long j, String str, int i, Base.RefLong refLong);

    /* access modifiers changed from: package-private */
    public native int tvmModImport(long j, long j2);

    /* access modifiers changed from: package-private */
    public native int tvmSynchronize(int i, int i2);

    LibInfo() {
    }
}
