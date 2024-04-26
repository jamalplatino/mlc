package org.apache.tvm;

public class NDArrayBase extends TVMValue {
    protected final long handle;
    private boolean isReleased;
    protected final boolean isView;

    /* access modifiers changed from: package-private */
    public long asHandle() {
        return this.handle;
    }

    public NDArrayBase asNDArray() {
        return this;
    }

    NDArrayBase(long j, boolean z) {
        super(ArgTypeCode.ARRAY_HANDLE);
        this.isReleased = false;
        this.handle = j;
        this.isView = z;
    }

    NDArrayBase(long j) {
        this(j, true);
    }

    public NDArrayBase copyTo(NDArrayBase nDArrayBase) {
        Base.checkCall(Base._LIB.tvmArrayCopyFromTo(this.handle, nDArrayBase.handle));
        return nDArrayBase;
    }

    public void release() {
        if (!this.isReleased && !this.isView) {
            Base.checkCall(Base._LIB.tvmArrayFree(this.handle));
            this.isReleased = true;
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        release();
        super.finalize();
    }
}
