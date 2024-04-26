package org.apache.tvm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.tvm.Base;

public class Function extends TVMValue {
    final long handle;
    private boolean isReleased;
    public final boolean isResident;

    public interface Callback {
        Object invoke(TVMValue... tVMValueArr);
    }

    public Function asFunction() {
        return this;
    }

    /* access modifiers changed from: package-private */
    public long asHandle() {
        return this.handle;
    }

    public static Function getFunction(String str) {
        for (String next : listGlobalFuncNames()) {
            if (next.equals(str)) {
                return getGlobalFunc(next, true, false);
            }
        }
        return null;
    }

    private static List<String> listGlobalFuncNames() {
        ArrayList arrayList = new ArrayList();
        Base.checkCall(Base._LIB.tvmFuncListGlobalNames(arrayList));
        return Collections.unmodifiableList(arrayList);
    }

    private static Function getGlobalFunc(String str, boolean z, boolean z2) {
        Base.RefLong refLong = new Base.RefLong();
        Base.checkCall(Base._LIB.tvmFuncGetGlobal(str, refLong));
        if (refLong.value != 0) {
            return new Function(refLong.value, z);
        }
        if (z2) {
            return null;
        }
        throw new IllegalArgumentException("Cannot find global function " + str);
    }

    Function(long j, boolean z) {
        super(ArgTypeCode.FUNC_HANDLE);
        this.isReleased = false;
        this.handle = j;
        this.isResident = z;
    }

    Function(long j) {
        this(j, false);
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        release();
        super.finalize();
    }

    public void release() {
        if (!this.isReleased && !this.isResident) {
            Base.checkCall(Base._LIB.tvmFuncFree(this.handle));
            this.isReleased = true;
        }
    }

    public TVMValue invoke() {
        Base.RefTVMValue refTVMValue = new Base.RefTVMValue();
        Base.checkCall(Base._LIB.tvmFuncCall(this.handle, refTVMValue));
        return refTVMValue.value;
    }

    public Function pushArg(int i) {
        Base._LIB.tvmFuncPushArgLong((long) i);
        return this;
    }

    public Function pushArg(long j) {
        Base._LIB.tvmFuncPushArgLong(j);
        return this;
    }

    public Function pushArg(float f) {
        Base._LIB.tvmFuncPushArgDouble((double) f);
        return this;
    }

    public Function pushArg(double d) {
        Base._LIB.tvmFuncPushArgDouble(d);
        return this;
    }

    public Function pushArg(String str) {
        Base._LIB.tvmFuncPushArgString(str);
        return this;
    }

    public Function pushArg(NDArrayBase nDArrayBase) {
        Base._LIB.tvmFuncPushArgHandle(nDArrayBase.handle, (nDArrayBase.isView ? ArgTypeCode.ARRAY_HANDLE : ArgTypeCode.NDARRAY_CONTAINER).id);
        return this;
    }

    public Function pushArg(Module module) {
        Base._LIB.tvmFuncPushArgHandle(module.handle, ArgTypeCode.MODULE_HANDLE.id);
        return this;
    }

    public Function pushArg(Function function) {
        Base._LIB.tvmFuncPushArgHandle(function.handle, ArgTypeCode.FUNC_HANDLE.id);
        return this;
    }

    public Function pushArg(byte[] bArr) {
        Base._LIB.tvmFuncPushArgBytes(bArr);
        return this;
    }

    public TVMValue call(Object... objArr) {
        for (Object pushArgToStack : objArr) {
            pushArgToStack(pushArgToStack);
        }
        return invoke();
    }

    private static void pushArgToStack(Object obj) {
        if (obj instanceof Integer) {
            Base._LIB.tvmFuncPushArgLong((long) ((Integer) obj).intValue());
        } else if (obj instanceof Long) {
            Base._LIB.tvmFuncPushArgLong(((Long) obj).longValue());
        } else if (obj instanceof Float) {
            Base._LIB.tvmFuncPushArgDouble((double) ((Float) obj).floatValue());
        } else if (obj instanceof Double) {
            Base._LIB.tvmFuncPushArgDouble(((Double) obj).doubleValue());
        } else if (obj instanceof String) {
            Base._LIB.tvmFuncPushArgString((String) obj);
        } else if (obj instanceof byte[]) {
            Base._LIB.tvmFuncPushArgBytes((byte[]) obj);
        } else if (obj instanceof NDArrayBase) {
            NDArrayBase nDArrayBase = (NDArrayBase) obj;
            Base._LIB.tvmFuncPushArgHandle(nDArrayBase.handle, (nDArrayBase.isView ? ArgTypeCode.ARRAY_HANDLE : ArgTypeCode.NDARRAY_CONTAINER).id);
        } else if (obj instanceof Module) {
            Base._LIB.tvmFuncPushArgHandle(((Module) obj).handle, ArgTypeCode.MODULE_HANDLE.id);
        } else if (obj instanceof Function) {
            Base._LIB.tvmFuncPushArgHandle(((Function) obj).handle, ArgTypeCode.FUNC_HANDLE.id);
        } else if (obj instanceof TVMValue) {
            TVMValue tVMValue = (TVMValue) obj;
            switch (AnonymousClass1.$SwitchMap$org$apache$tvm$ArgTypeCode[tVMValue.typeCode.ordinal()]) {
                case 1:
                case 2:
                    Base._LIB.tvmFuncPushArgLong(tVMValue.asLong());
                    return;
                case 3:
                    Base._LIB.tvmFuncPushArgDouble(tVMValue.asDouble());
                    return;
                case 4:
                    Base._LIB.tvmFuncPushArgString(tVMValue.asString());
                    return;
                case 5:
                    Base._LIB.tvmFuncPushArgBytes(tVMValue.asBytes());
                    return;
                case 6:
                case 7:
                case 8:
                case 9:
                    Base._LIB.tvmFuncPushArgHandle(tVMValue.asHandle(), tVMValue.typeCode.id);
                    return;
                default:
                    throw new IllegalArgumentException("Invalid argument: " + obj);
            }
        } else {
            throw new IllegalArgumentException("Invalid argument: " + obj);
        }
    }

    /* renamed from: org.apache.tvm.Function$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$apache$tvm$ArgTypeCode;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                org.apache.tvm.ArgTypeCode[] r0 = org.apache.tvm.ArgTypeCode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$org$apache$tvm$ArgTypeCode = r0
                org.apache.tvm.ArgTypeCode r1 = org.apache.tvm.ArgTypeCode.UINT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$org$apache$tvm$ArgTypeCode     // Catch:{ NoSuchFieldError -> 0x001d }
                org.apache.tvm.ArgTypeCode r1 = org.apache.tvm.ArgTypeCode.INT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$org$apache$tvm$ArgTypeCode     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.apache.tvm.ArgTypeCode r1 = org.apache.tvm.ArgTypeCode.FLOAT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$org$apache$tvm$ArgTypeCode     // Catch:{ NoSuchFieldError -> 0x0033 }
                org.apache.tvm.ArgTypeCode r1 = org.apache.tvm.ArgTypeCode.STR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$org$apache$tvm$ArgTypeCode     // Catch:{ NoSuchFieldError -> 0x003e }
                org.apache.tvm.ArgTypeCode r1 = org.apache.tvm.ArgTypeCode.BYTES     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$org$apache$tvm$ArgTypeCode     // Catch:{ NoSuchFieldError -> 0x0049 }
                org.apache.tvm.ArgTypeCode r1 = org.apache.tvm.ArgTypeCode.HANDLE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$org$apache$tvm$ArgTypeCode     // Catch:{ NoSuchFieldError -> 0x0054 }
                org.apache.tvm.ArgTypeCode r1 = org.apache.tvm.ArgTypeCode.ARRAY_HANDLE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = $SwitchMap$org$apache$tvm$ArgTypeCode     // Catch:{ NoSuchFieldError -> 0x0060 }
                org.apache.tvm.ArgTypeCode r1 = org.apache.tvm.ArgTypeCode.MODULE_HANDLE     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = $SwitchMap$org$apache$tvm$ArgTypeCode     // Catch:{ NoSuchFieldError -> 0x006c }
                org.apache.tvm.ArgTypeCode r1 = org.apache.tvm.ArgTypeCode.FUNC_HANDLE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.apache.tvm.Function.AnonymousClass1.<clinit>():void");
        }
    }

    public static void register(String str, Callback callback, boolean z) {
        Base.RefLong refLong = new Base.RefLong();
        Base.checkCall(Base._LIB.tvmFuncCreateFromCFunc(callback, refLong));
        Base.checkCall(Base._LIB.tvmFuncRegisterGlobal(str, refLong.value, z ? 1 : 0));
    }

    public static void register(String str, Callback callback) {
        register(str, callback, false);
    }

    public static Function convertFunc(Callback callback) {
        Base.RefLong refLong = new Base.RefLong();
        Base.checkCall(Base._LIB.tvmFuncCreateFromCFunc(callback, refLong));
        return new Function(refLong.value);
    }

    private static Object invokeRegisteredCbFunc(Callback callback, TVMValue[] tVMValueArr) {
        if (callback != null) {
            return callback.invoke(tVMValueArr);
        }
        System.err.println("[ERROR] Failed to get registered function");
        return null;
    }
}
