package org.apache.tvm;

public class TVMValue {
    public final ArgTypeCode typeCode;

    public void release() {
    }

    public TVMValue(ArgTypeCode argTypeCode) {
        this.typeCode = argTypeCode;
    }

    public long asLong() {
        throw new UnsupportedOperationException();
    }

    public double asDouble() {
        throw new UnsupportedOperationException();
    }

    public byte[] asBytes() {
        throw new UnsupportedOperationException();
    }

    public Module asModule() {
        throw new UnsupportedOperationException();
    }

    public Function asFunction() {
        throw new UnsupportedOperationException();
    }

    public NDArrayBase asNDArray() {
        throw new UnsupportedOperationException();
    }

    public String asString() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public long asHandle() {
        throw new UnsupportedOperationException();
    }
}
