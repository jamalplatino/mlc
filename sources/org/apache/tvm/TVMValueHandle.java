package org.apache.tvm;

public class TVMValueHandle extends TVMValue {
    public final long value;

    public long asHandle() {
        return this.value;
    }

    public TVMValueHandle(long j) {
        super(ArgTypeCode.HANDLE);
        this.value = j;
    }
}
