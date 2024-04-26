package org.apache.tvm;

import java.util.HashMap;
import java.util.Map;

public final class API {
    private static ThreadLocal<Map<String, Function>> apiFuncs = new ThreadLocal<Map<String, Function>>() {
        /* access modifiers changed from: protected */
        public Map<String, Function> initialValue() {
            return new HashMap();
        }
    };

    public static Function get(String str) {
        Function function = (Function) apiFuncs.get().get(str);
        if (function != null) {
            return function;
        }
        Function function2 = Function.getFunction(str);
        apiFuncs.get().put(str, function2);
        return function2;
    }

    private API() {
    }
}
