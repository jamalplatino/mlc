package org.apache.tvm.rpc;

import java.util.HashMap;
import java.util.Map;
import org.apache.tvm.Function;

public class RPC {
    public static final int RPC_CODE_MISMATCH = 1045107;
    public static final int RPC_MAGIC = 1045105;
    public static final int RPC_SESS_MASK = 128;
    public static final int RPC_TRACKER_MAGIC = 193137;
    public static final String TIMEOUT_ARG = "-timeout=";
    private static ThreadLocal<Map<String, Function>> apiFuncs = new ThreadLocal<Map<String, Function>>() {
        /* access modifiers changed from: protected */
        public Map<String, Function> initialValue() {
            return new HashMap();
        }
    };

    public class TrackerCode {
        public static final int GET_PENDING_MATCHKEYS = 7;
        public static final int PUT = 3;
        public static final int SUCCESS = 0;
        public static final int UPDATE_INFO = 5;

        public TrackerCode() {
        }
    }

    static Function getApi(String str) {
        Function function = (Function) apiFuncs.get().get(str);
        if (function == null) {
            function = Function.getFunction("rpc." + str);
            if (function == null) {
                return null;
            }
            apiFuncs.get().put(str, function);
        }
        return function;
    }
}
