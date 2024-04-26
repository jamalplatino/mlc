package org.apache.tvm;

import java.util.HashMap;
import java.util.Map;
import org.apache.tvm.Base;

public class Module extends TVMValue {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static ThreadLocal<Map<String, Function>> apiFuncs = new ThreadLocal<Map<String, Function>>() {
        /* access modifiers changed from: protected */
        public Map<String, Function> initialValue() {
            return new HashMap();
        }
    };
    private Function entry = null;
    private final String entryName = "__tvm_main__";
    public final long handle;
    private boolean isReleased = false;

    /* access modifiers changed from: package-private */
    public long asHandle() {
        return this.handle;
    }

    public Module asModule() {
        return this;
    }

    private static Function getApi(String str) {
        Function function = (Function) apiFuncs.get().get(str);
        if (function != null) {
            return function;
        }
        Function function2 = Function.getFunction("runtime." + str);
        apiFuncs.get().put(str, function2);
        return function2;
    }

    Module(long j) {
        super(ArgTypeCode.MODULE_HANDLE);
        this.handle = j;
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        release();
        super.finalize();
    }

    public void release() {
        if (!this.isReleased) {
            Base.checkCall(Base._LIB.tvmModFree(this.handle));
            this.isReleased = true;
        }
    }

    public Function entryFunc() {
        if (this.entry == null) {
            this.entry = getFunction("__tvm_main__");
        }
        return this.entry;
    }

    public Function getFunction(String str, boolean z) {
        Base.RefLong refLong = new Base.RefLong();
        Base.checkCall(Base._LIB.tvmModGetFunction(this.handle, str, z ? 1 : 0, refLong));
        if (refLong.value != 0) {
            return new Function(refLong.value, false);
        }
        throw new IllegalArgumentException("Module has no function " + str);
    }

    public Function getFunction(String str) {
        return getFunction(str, false);
    }

    public void importModule(Module module) {
        Base.checkCall(Base._LIB.tvmModImport(this.handle, module.handle));
    }

    public String typeKey() {
        return getApi("ModuleGetTypeKey").pushArg(this).invoke().asString();
    }

    public static Module load(String str, String str2) {
        return getApi("ModuleLoadFromFile").pushArg(str).pushArg(str2).invoke().asModule();
    }

    public static Module load(String str) {
        return load(str, "");
    }

    public static boolean enabled(String str) {
        return getApi("RuntimeEnabled").pushArg(str).invoke().asLong() != 0;
    }
}
