package org.apache.tvm;

public class TVMValueLong extends TVMValue {
    public final long value;

    public long asLong() {
        return this.value;
    }

    public TVMValueLong(long j) {
        super(ArgTypeCode.INT);
        this.value = j;
    }
}
