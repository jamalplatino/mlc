package org.apache.tvm;

public class TVMValueDouble extends TVMValue {
    public final double value;

    public double asDouble() {
        return this.value;
    }

    public TVMValueDouble(double d) {
        super(ArgTypeCode.FLOAT);
        this.value = d;
    }
}
