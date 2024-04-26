package org.apache.tvm.rpc;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

class Utils {
    Utils() {
    }

    public static byte[] recvAll(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            i2 += inputStream.read(bArr, i2, Math.min(i - i2, 1024));
        }
        return bArr;
    }

    public static void closeQuietly(Socket socket) {
        if (socket != null) {
            try {
                socket.shutdownInput();
                socket.shutdownOutput();
                socket.close();
            } catch (IOException unused) {
            }
        }
    }

    public static ByteBuffer wrapBytes(byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return wrap;
    }

    public static byte[] toBytes(int i) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        return allocate.putInt(i).array();
    }

    public static byte[] toBytes(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            bArr[i] = (byte) str.charAt(i);
        }
        return bArr;
    }

    public static String decodeToStr(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append((char) b);
        }
        return sb.toString();
    }

    public static String recvString(InputStream inputStream) throws IOException {
        return decodeToStr(recvAll(inputStream, wrapBytes(recvAll(inputStream, 4)).getInt()));
    }

    public static void sendString(OutputStream outputStream, String str) throws IOException {
        outputStream.write(toBytes(str.length()));
        outputStream.write(toBytes(str));
    }
}
