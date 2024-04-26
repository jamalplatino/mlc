package org.apache.tvm;

public class TVMValueString extends TVMValue {
    public final String value;

    public String asString() {
        return this.value;
    }

    public TVMValueString(String str) {
        super(ArgTypeCode.STR);
        this.value = str;
    }
}
