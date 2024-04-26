package org.apache.tvm.rpc;

import org.apache.tvm.Function;

public class Client {
    public static RPCSession connect(String str, int i, String str2) {
        Function api = RPC.getApi("Connect");
        if (api != null) {
            return new RPCSession(api.pushArg(str).pushArg(i).pushArg(str2).invoke().asModule());
        }
        throw new RuntimeException("Please compile with USE_RPC=1");
    }

    public static RPCSession connect(String str, int i) {
        return connect(str, i, "");
    }
}
