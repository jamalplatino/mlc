package org.apache.tvm;

public enum ArgTypeCode {
    INT(0),
    UINT(1),
    FLOAT(2),
    HANDLE(3),
    NULL(4),
    TVM_TYPE(5),
    DLDEVICE(6),
    ARRAY_HANDLE(7),
    NODE_HANDLE(8),
    MODULE_HANDLE(9),
    FUNC_HANDLE(10),
    STR(11),
    BYTES(12),
    NDARRAY_CONTAINER(13);
    
    public final int id;

    private ArgTypeCode(int i) {
        this.id = i;
    }

    public String toString() {
        return String.valueOf(this.id);
    }
}
