package org.apache.tvm.rpc;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.BindException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class ConnectTrackerServerProcessor implements ServerProcessor {
    public static final int HARD_TIMEOUT_DEFAULT = 300;
    public static final int MAX_SERVER_PORT = 5555;
    public static final int RETRY_PERIOD = 6000;
    public static final int STALE_TRACKER_TIMEOUT = 300000;
    public static final int TRACKER_TIMEOUT = 6000;
    private final String key;
    private final String matchKey;
    private ServerSocket server;
    private int serverPort = 5001;
    private final String trackerHost;
    private final int trackerPort;
    private Socket trackerSocket;
    private RPCWatchdog watchdog;

    public String getMatchKey() {
        return this.matchKey;
    }

    public ConnectTrackerServerProcessor(String str, int i, String str2, RPCWatchdog rPCWatchdog) throws IOException {
        int i2;
        do {
            try {
                ServerSocket serverSocket = new ServerSocket(this.serverPort);
                this.server = serverSocket;
                serverSocket.setSoTimeout(STALE_TRACKER_TIMEOUT);
                System.err.println("using port: " + this.serverPort);
                this.trackerHost = str;
                this.trackerPort = i;
                this.key = str2;
                this.matchKey = str2 + ":" + Math.random();
                this.watchdog = rPCWatchdog;
                return;
            } catch (BindException e) {
                System.err.println(this.serverPort);
                System.err.println(e);
                i2 = this.serverPort + 1;
                this.serverPort = i2;
                if (i2 > 5555) {
                    throw e;
                }
            }
        } while (i2 > 5555);
        throw e;
    }

    public void terminate() {
        try {
            this.server.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:41|40|42|43|44|45|46|47|(1:49)|50|65) */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        java.lang.System.err.println("no incoming connections, refreshing...");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0179, code lost:
        if (needRefreshKey() == false) goto L_0x017b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x017b, code lost:
        java.lang.System.err.println("reregistering...");
        register();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x016e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x01a5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r9 = this;
            java.net.Socket r0 = r9.connectToTracker()     // Catch:{ ConnectException -> 0x019f, all -> 0x0187 }
            r9.trackerSocket = r0     // Catch:{ ConnectException -> 0x019f, all -> 0x0187 }
            r9.register()     // Catch:{ ConnectException -> 0x019f, all -> 0x0187 }
        L_0x0009:
            java.io.PrintStream r0 = java.lang.System.err     // Catch:{ SocketTimeoutException -> 0x016e }
            java.lang.String r1 = "waiting for requests..."
            r0.println(r1)     // Catch:{ SocketTimeoutException -> 0x016e }
            java.net.ServerSocket r0 = r9.server     // Catch:{ SocketTimeoutException -> 0x016e }
            java.net.Socket r0 = r0.accept()     // Catch:{ SocketTimeoutException -> 0x016e }
            java.io.InputStream r1 = r0.getInputStream()     // Catch:{ SocketTimeoutException -> 0x016e }
            java.io.OutputStream r2 = r0.getOutputStream()     // Catch:{ SocketTimeoutException -> 0x016e }
            r3 = 4
            byte[] r3 = org.apache.tvm.rpc.Utils.recvAll(r1, r3)     // Catch:{ SocketTimeoutException -> 0x016e }
            java.nio.ByteBuffer r3 = org.apache.tvm.rpc.Utils.wrapBytes(r3)     // Catch:{ SocketTimeoutException -> 0x016e }
            int r3 = r3.getInt()     // Catch:{ SocketTimeoutException -> 0x016e }
            r4 = 1045105(0xff271, float:1.464504E-39)
            r5 = 1045107(0xff273, float:1.464507E-39)
            if (r3 == r4) goto L_0x0045
            byte[] r1 = org.apache.tvm.rpc.Utils.toBytes((int) r5)     // Catch:{ SocketTimeoutException -> 0x016e }
            r2.write(r1)     // Catch:{ SocketTimeoutException -> 0x016e }
            java.io.PrintStream r1 = java.lang.System.err     // Catch:{ SocketTimeoutException -> 0x016e }
            java.lang.String r2 = "incorrect RPC magic"
            r1.println(r2)     // Catch:{ SocketTimeoutException -> 0x016e }
            org.apache.tvm.rpc.Utils.closeQuietly(r0)     // Catch:{ SocketTimeoutException -> 0x016e }
            goto L_0x0009
        L_0x0045:
            java.lang.String r1 = org.apache.tvm.rpc.Utils.recvString(r1)     // Catch:{ SocketTimeoutException -> 0x016e }
            java.io.PrintStream r3 = java.lang.System.err     // Catch:{ SocketTimeoutException -> 0x016e }
            java.lang.String r6 = r9.matchKey     // Catch:{ SocketTimeoutException -> 0x016e }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x016e }
            r7.<init>()     // Catch:{ SocketTimeoutException -> 0x016e }
            java.lang.String r8 = "matchKey:"
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch:{ SocketTimeoutException -> 0x016e }
            java.lang.StringBuilder r6 = r7.append(r6)     // Catch:{ SocketTimeoutException -> 0x016e }
            java.lang.String r6 = r6.toString()     // Catch:{ SocketTimeoutException -> 0x016e }
            r3.println(r6)     // Catch:{ SocketTimeoutException -> 0x016e }
            java.io.PrintStream r3 = java.lang.System.err     // Catch:{ SocketTimeoutException -> 0x016e }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x016e }
            r6.<init>()     // Catch:{ SocketTimeoutException -> 0x016e }
            java.lang.String r7 = "key: "
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch:{ SocketTimeoutException -> 0x016e }
            java.lang.StringBuilder r6 = r6.append(r1)     // Catch:{ SocketTimeoutException -> 0x016e }
            java.lang.String r6 = r6.toString()     // Catch:{ SocketTimeoutException -> 0x016e }
            r3.println(r6)     // Catch:{ SocketTimeoutException -> 0x016e }
            java.lang.String r3 = r9.matchKey     // Catch:{ SocketTimeoutException -> 0x016e }
            int r3 = r1.indexOf(r3)     // Catch:{ SocketTimeoutException -> 0x016e }
            r6 = -1
            if (r3 != r6) goto L_0x00b4
            byte[] r3 = org.apache.tvm.rpc.Utils.toBytes((int) r5)     // Catch:{ SocketTimeoutException -> 0x016e }
            r2.write(r3)     // Catch:{ SocketTimeoutException -> 0x016e }
            java.io.PrintStream r2 = java.lang.System.err     // Catch:{ SocketTimeoutException -> 0x016e }
            java.lang.String r3 = r9.matchKey     // Catch:{ SocketTimeoutException -> 0x016e }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x016e }
            r4.<init>()     // Catch:{ SocketTimeoutException -> 0x016e }
            java.lang.String r5 = "key mismatch, expected: "
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch:{ SocketTimeoutException -> 0x016e }
            java.lang.StringBuilder r3 = r4.append(r3)     // Catch:{ SocketTimeoutException -> 0x016e }
            java.lang.String r4 = " got: "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch:{ SocketTimeoutException -> 0x016e }
            java.lang.StringBuilder r1 = r3.append(r1)     // Catch:{ SocketTimeoutException -> 0x016e }
            java.lang.String r1 = r1.toString()     // Catch:{ SocketTimeoutException -> 0x016e }
            r2.println(r1)     // Catch:{ SocketTimeoutException -> 0x016e }
            org.apache.tvm.rpc.Utils.closeQuietly(r0)     // Catch:{ SocketTimeoutException -> 0x016e }
            goto L_0x0009
        L_0x00b4:
            java.lang.String r3 = "-timeout="
            int r3 = r1.indexOf(r3)     // Catch:{ ConnectException -> 0x019f, all -> 0x0187 }
            if (r3 == r6) goto L_0x00c7
            int r3 = r3 + 9
            java.lang.String r3 = r1.substring(r3)     // Catch:{ ConnectException -> 0x019f, all -> 0x0187 }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ ConnectException -> 0x019f, all -> 0x0187 }
            goto L_0x00c9
        L_0x00c7:
            r3 = 300(0x12c, float:4.2E-43)
        L_0x00c9:
            java.io.PrintStream r6 = java.lang.System.err     // Catch:{ ConnectException -> 0x019f, all -> 0x0187 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ ConnectException -> 0x019f, all -> 0x0187 }
            r7.<init>()     // Catch:{ ConnectException -> 0x019f, all -> 0x0187 }
            java.lang.String r8 = "alloted timeout: "
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch:{ ConnectException -> 0x019f, all -> 0x0187 }
            java.lang.StringBuilder r7 = r7.append(r3)     // Catch:{ ConnectException -> 0x019f, all -> 0x0187 }
            java.lang.String r7 = r7.toString()     // Catch:{ ConnectException -> 0x019f, all -> 0x0187 }
            r6.println(r7)     // Catch:{ ConnectException -> 0x019f, all -> 0x0187 }
            java.lang.String r6 = "client:"
            boolean r6 = r1.startsWith(r6)     // Catch:{ ConnectException -> 0x019f, all -> 0x0187 }
            if (r6 != 0) goto L_0x00f8
            java.io.PrintStream r1 = java.lang.System.err     // Catch:{ ConnectException -> 0x019f, all -> 0x0187 }
            java.lang.String r4 = "recv key mismatch..."
            r1.println(r4)     // Catch:{ ConnectException -> 0x019f, all -> 0x0187 }
            byte[] r1 = org.apache.tvm.rpc.Utils.toBytes((int) r5)     // Catch:{ ConnectException -> 0x019f, all -> 0x0187 }
            r2.write(r1)     // Catch:{ ConnectException -> 0x019f, all -> 0x0187 }
            goto L_0x0102
        L_0x00f8:
            byte[] r4 = org.apache.tvm.rpc.Utils.toBytes((int) r4)     // Catch:{ ConnectException -> 0x019f, all -> 0x0187 }
            r2.write(r4)     // Catch:{ ConnectException -> 0x019f, all -> 0x0187 }
            org.apache.tvm.rpc.Utils.sendString(r2, r1)     // Catch:{ ConnectException -> 0x019f, all -> 0x0187 }
        L_0x0102:
            java.io.PrintStream r1 = java.lang.System.err     // Catch:{ ConnectException -> 0x019f, all -> 0x0187 }
            java.net.SocketAddress r2 = r0.getRemoteSocketAddress()     // Catch:{ ConnectException -> 0x019f, all -> 0x0187 }
            java.lang.String r2 = r2.toString()     // Catch:{ ConnectException -> 0x019f, all -> 0x0187 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ ConnectException -> 0x019f, all -> 0x0187 }
            r4.<init>()     // Catch:{ ConnectException -> 0x019f, all -> 0x0187 }
            java.lang.String r5 = "Connection from "
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch:{ ConnectException -> 0x019f, all -> 0x0187 }
            java.lang.StringBuilder r2 = r4.append(r2)     // Catch:{ ConnectException -> 0x019f, all -> 0x0187 }
            java.lang.String r2 = r2.toString()     // Catch:{ ConnectException -> 0x019f, all -> 0x0187 }
            r1.println(r2)     // Catch:{ ConnectException -> 0x019f, all -> 0x0187 }
            org.apache.tvm.rpc.RPCWatchdog r1 = r9.watchdog     // Catch:{ ConnectException -> 0x019f, all -> 0x0187 }
            int r3 = r3 * 1000
            r1.startTimeout(r3)     // Catch:{ ConnectException -> 0x019f, all -> 0x0187 }
            org.apache.tvm.rpc.SocketChannel r1 = new org.apache.tvm.rpc.SocketChannel     // Catch:{ ConnectException -> 0x019f, all -> 0x0187 }
            r1.<init>(r0)     // Catch:{ ConnectException -> 0x019f, all -> 0x0187 }
            org.apache.tvm.rpc.NativeServerLoop r2 = new org.apache.tvm.rpc.NativeServerLoop     // Catch:{ ConnectException -> 0x019f, all -> 0x0187 }
            org.apache.tvm.Function r3 = r1.getFsend()     // Catch:{ ConnectException -> 0x019f, all -> 0x0187 }
            org.apache.tvm.Function r1 = r1.getFrecv()     // Catch:{ ConnectException -> 0x019f, all -> 0x0187 }
            r2.<init>(r3, r1)     // Catch:{ ConnectException -> 0x019f, all -> 0x0187 }
            r2.run()     // Catch:{ ConnectException -> 0x019f, all -> 0x0187 }
            java.io.PrintStream r1 = java.lang.System.err     // Catch:{ ConnectException -> 0x019f, all -> 0x0187 }
            java.net.SocketAddress r2 = r0.getRemoteSocketAddress()     // Catch:{ ConnectException -> 0x019f, all -> 0x0187 }
            java.lang.String r2 = r2.toString()     // Catch:{ ConnectException -> 0x019f, all -> 0x0187 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ ConnectException -> 0x019f, all -> 0x0187 }
            r3.<init>()     // Catch:{ ConnectException -> 0x019f, all -> 0x0187 }
            java.lang.String r4 = "Finish serving "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch:{ ConnectException -> 0x019f, all -> 0x0187 }
            java.lang.StringBuilder r2 = r3.append(r2)     // Catch:{ ConnectException -> 0x019f, all -> 0x0187 }
            java.lang.String r2 = r2.toString()     // Catch:{ ConnectException -> 0x019f, all -> 0x0187 }
            r1.println(r2)     // Catch:{ ConnectException -> 0x019f, all -> 0x0187 }
            org.apache.tvm.rpc.Utils.closeQuietly(r0)     // Catch:{ ConnectException -> 0x019f, all -> 0x0187 }
            java.net.Socket r0 = r9.trackerSocket     // Catch:{ all -> 0x0198 }
            if (r0 == 0) goto L_0x0168
            r0.close()     // Catch:{ all -> 0x0198 }
        L_0x0168:
            java.net.ServerSocket r0 = r9.server     // Catch:{ all -> 0x0198 }
            r0.close()     // Catch:{ all -> 0x0198 }
            goto L_0x01b8
        L_0x016e:
            java.io.PrintStream r0 = java.lang.System.err     // Catch:{ ConnectException -> 0x019f, all -> 0x0187 }
            java.lang.String r1 = "no incoming connections, refreshing..."
            r0.println(r1)     // Catch:{ ConnectException -> 0x019f, all -> 0x0187 }
            boolean r0 = r9.needRefreshKey()     // Catch:{ ConnectException -> 0x019f, all -> 0x0187 }
            if (r0 != 0) goto L_0x0009
            java.io.PrintStream r0 = java.lang.System.err     // Catch:{ ConnectException -> 0x019f, all -> 0x0187 }
            java.lang.String r1 = "reregistering..."
            r0.println(r1)     // Catch:{ ConnectException -> 0x019f, all -> 0x0187 }
            r9.register()     // Catch:{ ConnectException -> 0x019f, all -> 0x0187 }
            goto L_0x0009
        L_0x0187:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x019d }
            java.net.Socket r0 = r9.trackerSocket     // Catch:{ all -> 0x0198 }
            if (r0 == 0) goto L_0x0192
            r0.close()     // Catch:{ all -> 0x0198 }
        L_0x0192:
            java.net.ServerSocket r0 = r9.server     // Catch:{ all -> 0x0198 }
            r0.close()     // Catch:{ all -> 0x0198 }
            goto L_0x01b8
        L_0x0198:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x01b8
        L_0x019d:
            r0 = move-exception
            goto L_0x01b9
        L_0x019f:
            r0 = 6000(0x1770, double:2.9644E-320)
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x01a5 }
            goto L_0x01ac
        L_0x01a5:
            java.io.PrintStream r0 = java.lang.System.err     // Catch:{ all -> 0x019d }
            java.lang.String r1 = "interrupted before retrying to connect to tracker..."
            r0.println(r1)     // Catch:{ all -> 0x019d }
        L_0x01ac:
            java.net.Socket r0 = r9.trackerSocket     // Catch:{ all -> 0x0198 }
            if (r0 == 0) goto L_0x01b3
            r0.close()     // Catch:{ all -> 0x0198 }
        L_0x01b3:
            java.net.ServerSocket r0 = r9.server     // Catch:{ all -> 0x0198 }
            r0.close()     // Catch:{ all -> 0x0198 }
        L_0x01b8:
            return
        L_0x01b9:
            java.net.Socket r1 = r9.trackerSocket     // Catch:{ all -> 0x01c6 }
            if (r1 == 0) goto L_0x01c0
            r1.close()     // Catch:{ all -> 0x01c6 }
        L_0x01c0:
            java.net.ServerSocket r1 = r9.server     // Catch:{ all -> 0x01c6 }
            r1.close()     // Catch:{ all -> 0x01c6 }
            goto L_0x01ca
        L_0x01c6:
            r1 = move-exception
            r1.printStackTrace()
        L_0x01ca:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tvm.rpc.ConnectTrackerServerProcessor.run():void");
    }

    private Socket connectToTracker() throws IOException {
        this.trackerSocket = new Socket();
        this.trackerSocket.connect(new InetSocketAddress(this.trackerHost, this.trackerPort), 6000);
        InputStream inputStream = this.trackerSocket.getInputStream();
        OutputStream outputStream = this.trackerSocket.getOutputStream();
        outputStream.write(Utils.toBytes((int) RPC.RPC_TRACKER_MAGIC));
        if (Utils.wrapBytes(Utils.recvAll(inputStream, 4)).getInt() == 193137) {
            Utils.sendString(outputStream, generateCinfo(this.key));
            if (Integer.parseInt(Utils.recvString(inputStream)) == 0) {
                return this.trackerSocket;
            }
            throw new SocketException("failed to connect to tracker (not SUCCESS)");
        }
        throw new SocketException("failed to connect to tracker (WRONG MAGIC)");
    }

    private void register() throws IOException {
        InputStream inputStream = this.trackerSocket.getInputStream();
        Utils.sendString(this.trackerSocket.getOutputStream(), generatePut(3, this.key, this.serverPort, this.matchKey));
        if (Integer.parseInt(Utils.recvString(inputStream)) == 0) {
            System.err.println("registered with tracker...");
            return;
        }
        throw new SocketException("failed to register with tracker (not SUCCESS)");
    }

    private boolean needRefreshKey() throws IOException {
        InputStream inputStream = this.trackerSocket.getInputStream();
        Utils.sendString(this.trackerSocket.getOutputStream(), generateGetPendingMatchKeys(7));
        String recvString = Utils.recvString(inputStream);
        System.err.println("pending matchkeys: " + recvString);
        return recvString.indexOf(this.matchKey) != -1;
    }

    private String generateCinfo(String str) {
        return "[5, " + ("{\"key\" : \"server:" + str + "\", \"addr\": [null, \"" + this.serverPort + "\"]}") + "]";
    }

    private String generatePut(int i, String str, int i2, String str2) {
        return "[" + i + ", \"" + str + "\", [" + i2 + ", \"" + str2 + "\"], null]";
    }

    private String generateGetPendingMatchKeys(int i) {
        return "[" + i + "]";
    }
}
