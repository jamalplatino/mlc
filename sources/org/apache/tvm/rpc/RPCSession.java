package org.apache.tvm.rpc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.apache.tvm.Device;
import org.apache.tvm.Function;
import org.apache.tvm.Module;

public class RPCSession {
    private final Map<String, Function> remoteFuncs = new HashMap();
    private final Module session;
    private final int tblIndex;

    RPCSession(Module module) {
        this.session = module;
        this.tblIndex = (int) RPC.getApi("SessTableIndex").pushArg(module).invoke().asLong();
    }

    public Function getFunction(String str) {
        return this.session.getFunction(str);
    }

    public Device device(String str, int i) {
        return new TVMRemoteDevice(new Device(str, i).deviceType + ((this.tblIndex + 1) * 128), i, this);
    }

    public Device device(String str) {
        return device(str, 0);
    }

    public Device device(int i, int i2) {
        return new TVMRemoteDevice(i + ((this.tblIndex + 1) * 128), i2, this);
    }

    public Device device(int i) {
        return device(i, 0);
    }

    public Device cpu(int i) {
        return Device.cpu(i);
    }

    public Device cpu() {
        return cpu(0);
    }

    public Device cuda(int i) {
        return Device.cuda(i);
    }

    public Device cuda() {
        return cuda(0);
    }

    public Device cl(int i) {
        return Device.opencl(i);
    }

    public Device cl() {
        return cl(0);
    }

    public Device vulkan(int i) {
        return Device.vulkan(i);
    }

    public Device vulkan() {
        return vulkan(0);
    }

    public Device metal(int i) {
        return Device.metal(i);
    }

    public Device metal() {
        return metal(0);
    }

    public void upload(byte[] bArr, String str) {
        if (str != null) {
            Function function = this.remoteFuncs.get("upload");
            if (function == null) {
                function = getFunction("tvm.rpc.server.upload");
                this.remoteFuncs.put("upload", function);
            }
            function.pushArg(str).pushArg(bArr).invoke();
            return;
        }
        throw new IllegalArgumentException("Please specify the upload target");
    }

    public void upload(File file, String str) throws IOException {
        upload(getBytesFromFile(file), str);
    }

    public void upload(File file) throws IOException {
        upload(file, file.getName());
    }

    public byte[] download(String str) {
        Function function = this.remoteFuncs.get("download");
        if (function == null) {
            function = getFunction("tvm.rpc.server.download");
            this.remoteFuncs.put("download", function);
        }
        return function.pushArg(str).invoke().asBytes();
    }

    public Module loadModule(String str) {
        return RPC.getApi("LoadRemoteModule").pushArg(this.session).pushArg(str).invoke().asModule();
    }

    private static byte[] getBytesFromFile(File file) throws IOException {
        long length = file.length();
        if (length <= 2147483647L) {
            int i = (int) length;
            byte[] bArr = new byte[i];
            FileInputStream fileInputStream = new FileInputStream(file);
            int i2 = 0;
            while (i2 < i) {
                try {
                    int read = fileInputStream.read(bArr, i2, i - i2);
                    if (read < 0) {
                        break;
                    }
                    i2 += read;
                } catch (Throwable th) {
                    fileInputStream.close();
                    throw th;
                }
            }
            fileInputStream.close();
            if (i2 >= i) {
                return bArr;
            }
            throw new IOException("Could not completely read file " + file.getName());
        }
        throw new IOException("File " + file.getName() + " is too large!");
    }
}
