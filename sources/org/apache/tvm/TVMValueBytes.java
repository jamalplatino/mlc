package org.apache.tvm;

public class TVMValueBytes extends TVMValue {
    public final byte[] value;

    public byte[] asBytes() {
        return this.value;
    }

    public TVMValueBytes(byte[] bArr) {
        super(ArgTypeCode.BYTES);
        this.value = bArr;
    }
}
