package org.apache.tvm.rpc;

import java.io.IOException;
import java.net.Socket;
import org.apache.tvm.Function;
import org.apache.tvm.TVMValue;
import org.apache.tvm.TVMValueBytes;

public class SocketChannel {
    private Function frecv = Function.convertFunc(new Function.Callback() {
        public Object invoke(TVMValue... tVMValueArr) {
            try {
                return new TVMValueBytes(Utils.recvAll(SocketChannel.this.socket.getInputStream(), (int) tVMValueArr[0].asLong()));
            } catch (IOException e) {
                e.printStackTrace();
                return -1;
            }
        }
    });
    private Function fsend = Function.convertFunc(new Function.Callback() {
        public Object invoke(TVMValue... tVMValueArr) {
            byte[] asBytes = tVMValueArr[0].asBytes();
            try {
                SocketChannel.this.socket.getOutputStream().write(asBytes);
                return Integer.valueOf(asBytes.length);
            } catch (IOException e) {
                e.printStackTrace();
                return -1;
            }
        }
    });
    /* access modifiers changed from: private */
    public final Socket socket;

    public Function getFrecv() {
        return this.frecv;
    }

    public Function getFsend() {
        return this.fsend;
    }

    SocketChannel(Socket socket2) {
        this.socket = socket2;
    }
}
