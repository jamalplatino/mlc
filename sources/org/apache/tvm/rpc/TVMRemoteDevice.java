package org.apache.tvm.rpc;

import org.apache.tvm.Device;

public class TVMRemoteDevice extends Device {
    public final RPCSession rpcSession;

    TVMRemoteDevice(int i, int i2, RPCSession rPCSession) {
        super(i, i2);
        this.rpcSession = rPCSession;
    }
}
