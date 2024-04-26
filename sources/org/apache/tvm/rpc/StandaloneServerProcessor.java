package org.apache.tvm.rpc;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class StandaloneServerProcessor implements ServerProcessor {
    private final ServerSocket server;

    public StandaloneServerProcessor(int i) throws IOException {
        this.server = new ServerSocket(i);
    }

    public void terminate() {
        try {
            this.server.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void run() {
        try {
            Socket accept = this.server.accept();
            InputStream inputStream = accept.getInputStream();
            OutputStream outputStream = accept.getOutputStream();
            if (Utils.wrapBytes(Utils.recvAll(inputStream, 4)).getInt() != 1045105) {
                Utils.closeQuietly(accept);
                return;
            }
            if (!Utils.decodeToStr(Utils.recvAll(inputStream, Utils.wrapBytes(Utils.recvAll(inputStream, 4)).getInt())).startsWith("client:")) {
                outputStream.write(Utils.toBytes((int) RPC.RPC_CODE_MISMATCH));
            } else {
                outputStream.write(Utils.toBytes((int) RPC.RPC_MAGIC));
                outputStream.write(Utils.toBytes(11));
                outputStream.write(Utils.toBytes("server:java"));
            }
            SocketChannel socketChannel = new SocketChannel(accept);
            System.err.println("Connection from " + accept.getRemoteSocketAddress().toString());
            new NativeServerLoop(socketChannel.getFsend(), socketChannel.getFrecv()).run();
            System.err.println("Finish serving " + accept.getRemoteSocketAddress().toString());
            Utils.closeQuietly(accept);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
