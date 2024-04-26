package org.apache.tvm.contrib;

import org.apache.tvm.Device;
import org.apache.tvm.Function;
import org.apache.tvm.Module;
import org.apache.tvm.NDArray;
import org.apache.tvm.NDArrayBase;

public class GraphModule {
    private Device device;
    private Function fdebugGetOutput;
    private Function fgetInput;
    private Function fgetOutput;
    private Function floadParams;
    private Function frun;
    private Function fsetInput;
    private Module module;

    GraphModule(Module module2, Device device2) {
        this.module = module2;
        this.device = device2;
        this.fsetInput = module2.getFunction("set_input");
        this.frun = module2.getFunction("run");
        this.fgetInput = module2.getFunction("get_input");
        this.fgetOutput = module2.getFunction("get_output");
        try {
            this.fdebugGetOutput = module2.getFunction("debug_get_output");
        } catch (IllegalArgumentException unused) {
        }
        this.floadParams = module2.getFunction("load_params");
    }

    public void release() {
        this.fsetInput.release();
        this.frun.release();
        this.fgetInput.release();
        this.fgetOutput.release();
        Function function = this.fdebugGetOutput;
        if (function != null) {
            function.release();
        }
        this.floadParams.release();
        this.module.release();
    }

    public GraphModule setInput(String str, NDArray nDArray) {
        if (!nDArray.device().equals(this.device)) {
            NDArray empty = NDArray.empty(nDArray.shape(), this.device);
            nDArray.copyTo(empty);
            nDArray = empty;
        }
        this.fsetInput.pushArg(str).pushArg((NDArrayBase) nDArray).invoke();
        return this;
    }

    public GraphModule setInput(int i, NDArray nDArray) {
        if (!nDArray.device().equals(this.device)) {
            NDArray empty = NDArray.empty(nDArray.shape(), this.device);
            nDArray.copyTo(empty);
            nDArray = empty;
        }
        this.fsetInput.pushArg(i).pushArg((NDArrayBase) nDArray).invoke();
        return this;
    }

    public GraphModule run() {
        this.frun.invoke();
        return this;
    }

    public NDArray getInput(int i, NDArray nDArray) {
        this.fgetInput.pushArg(i).pushArg((NDArrayBase) nDArray).invoke();
        return nDArray;
    }

    public NDArray getOutput(int i, NDArray nDArray) {
        this.fgetOutput.pushArg(i).pushArg((NDArrayBase) nDArray).invoke();
        return nDArray;
    }

    public NDArray debugGetOutput(String str, NDArray nDArray) {
        Function function = this.fdebugGetOutput;
        if (function != null) {
            function.pushArg(str).pushArg((NDArrayBase) nDArray).invoke();
            return nDArray;
        }
        throw new RuntimeException("Please compile runtime with USE_PROFILER = ON");
    }

    public NDArray debugGetOutput(int i, NDArray nDArray) {
        Function function = this.fdebugGetOutput;
        if (function != null) {
            function.pushArg(i).pushArg((NDArrayBase) nDArray).invoke();
            return nDArray;
        }
        throw new RuntimeException("Please compile runtime with USE_PROFILER = ON");
    }

    public GraphModule loadParams(byte[] bArr) {
        this.floadParams.pushArg(bArr).invoke();
        return this;
    }

    public Function getFunction(String str) {
        return this.module.getFunction(str);
    }
}
