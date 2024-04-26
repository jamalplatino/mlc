package org.apache.tvm.rpc;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ConnectProxyServerProcessor implements ServerProcessor {
    private Runnable callback;
    private volatile Socket currSocket = new Socket();
    private final String host;
    private final String key;
    private final int port;

    public void setStartTimeCallback(Runnable runnable) {
        this.callback = runnable;
    }

    public ConnectProxyServerProcessor(String str, int i, String str2) {
        this.host = str;
        this.port = i;
        this.key = "server:" + str2;
    }

    public void terminate() {
        Utils.closeQuietly(this.currSocket);
    }

    public void run() {
        try {
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.host, this.port);
            this.currSocket.connect(inetSocketAddress, 6000);
            InputStream inputStream = this.currSocket.getInputStream();
            OutputStream outputStream = this.currSocket.getOutputStream();
            outputStream.write(Utils.toBytes((int) RPC.RPC_MAGIC));
            outputStream.write(Utils.toBytes(this.key.length()));
            outputStream.write(Utils.toBytes(this.key));
            int i = Utils.wrapBytes(Utils.recvAll(inputStream, 4)).getInt();
            if (i != 1045106) {
                if (i == 1045107) {
                    System.err.println("RPCProxy do not have matching client key " + this.key);
                } else if (i != 1045105) {
                    throw new RuntimeException(inetSocketAddress + " is not RPC Proxy");
                }
                Utils.decodeToStr(Utils.recvAll(inputStream, Utils.wrapBytes(Utils.recvAll(inputStream, 4)).getInt()));
                System.err.println("RPCProxy connected to " + inetSocketAddress);
                Runnable runnable = this.callback;
                if (runnable != null) {
                    runnable.run();
                }
                SocketChannel socketChannel = new SocketChannel(this.currSocket);
                new NativeServerLoop(socketChannel.getFsend(), socketChannel.getFrecv()).run();
                System.err.println("Finish serving " + inetSocketAddress);
                terminate();
                return;
            }
            throw new RuntimeException(String.format("key: %s has already been used in proxy", new Object[]{this.key}));
        } catch (Throwable th) {
            terminate();
            throw th;
        }
    }
}
