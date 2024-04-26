package org.apache.tvm.rpc;

import java.io.File;
import java.io.IOException;
import org.apache.tvm.Function;
import org.apache.tvm.Module;
import org.apache.tvm.TVMValue;

public class NativeServerLoop implements Runnable {
    private final Function frecv;
    private final Function fsend;

    public NativeServerLoop(Function function, Function function2) {
        this.fsend = function;
        this.frecv = function2;
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public void run() {
        /*
            r10 = this;
            java.lang.String r0 = "[WARN] Couldn't delete temporary file "
            java.lang.String r1 = "[WARN] Couldn't delete temporary directory "
            r2 = 0
            r3 = 0
            java.io.File r3 = serverEnv()     // Catch:{ IOException -> 0x007f }
            java.io.PrintStream r4 = java.lang.System.err     // Catch:{ IOException -> 0x007f }
            java.lang.String r5 = "starting server loop..."
            r4.println(r5)     // Catch:{ IOException -> 0x007f }
            java.lang.String r4 = "ServerLoop"
            org.apache.tvm.Function r4 = org.apache.tvm.rpc.RPC.getApi(r4)     // Catch:{ IOException -> 0x007f }
            org.apache.tvm.Function r5 = r10.fsend     // Catch:{ IOException -> 0x007f }
            org.apache.tvm.Function r4 = r4.pushArg((org.apache.tvm.Function) r5)     // Catch:{ IOException -> 0x007f }
            org.apache.tvm.Function r5 = r10.frecv     // Catch:{ IOException -> 0x007f }
            org.apache.tvm.Function r4 = r4.pushArg((org.apache.tvm.Function) r5)     // Catch:{ IOException -> 0x007f }
            r4.invoke()     // Catch:{ IOException -> 0x007f }
            java.io.PrintStream r4 = java.lang.System.err     // Catch:{ IOException -> 0x007f }
            java.lang.String r5 = "done server loop..."
            r4.println(r5)     // Catch:{ IOException -> 0x007f }
            if (r3 == 0) goto L_0x00c8
            java.lang.String[] r4 = r3.list()
            int r5 = r4.length
        L_0x0034:
            if (r2 >= r5) goto L_0x0060
            r6 = r4[r2]
            java.io.File r7 = new java.io.File
            java.lang.String r8 = r3.getPath()
            r7.<init>(r8, r6)
            boolean r6 = r7.delete()
            if (r6 != 0) goto L_0x005d
            java.io.PrintStream r6 = java.lang.System.err
            java.lang.String r7 = r7.getAbsolutePath()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r0)
            java.lang.StringBuilder r7 = r8.append(r7)
            java.lang.String r7 = r7.toString()
            r6.println(r7)
        L_0x005d:
            int r2 = r2 + 1
            goto L_0x0034
        L_0x0060:
            boolean r0 = r3.delete()
            if (r0 != 0) goto L_0x00c8
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.String r2 = r3.getAbsolutePath()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
        L_0x0071:
            java.lang.StringBuilder r1 = r3.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            goto L_0x00c8
        L_0x007d:
            r4 = move-exception
            goto L_0x00c9
        L_0x007f:
            r4 = move-exception
            r4.printStackTrace()     // Catch:{ all -> 0x007d }
            if (r3 == 0) goto L_0x00c8
            java.lang.String[] r4 = r3.list()
            int r5 = r4.length
        L_0x008a:
            if (r2 >= r5) goto L_0x00b6
            r6 = r4[r2]
            java.io.File r7 = new java.io.File
            java.lang.String r8 = r3.getPath()
            r7.<init>(r8, r6)
            boolean r6 = r7.delete()
            if (r6 != 0) goto L_0x00b3
            java.io.PrintStream r6 = java.lang.System.err
            java.lang.String r7 = r7.getAbsolutePath()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r0)
            java.lang.StringBuilder r7 = r8.append(r7)
            java.lang.String r7 = r7.toString()
            r6.println(r7)
        L_0x00b3:
            int r2 = r2 + 1
            goto L_0x008a
        L_0x00b6:
            boolean r0 = r3.delete()
            if (r0 != 0) goto L_0x00c8
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.String r2 = r3.getAbsolutePath()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            goto L_0x0071
        L_0x00c8:
            return
        L_0x00c9:
            if (r3 == 0) goto L_0x0118
            java.lang.String[] r5 = r3.list()
            int r6 = r5.length
        L_0x00d0:
            if (r2 >= r6) goto L_0x00fc
            r7 = r5[r2]
            java.io.File r8 = new java.io.File
            java.lang.String r9 = r3.getPath()
            r8.<init>(r9, r7)
            boolean r7 = r8.delete()
            if (r7 != 0) goto L_0x00f9
            java.io.PrintStream r7 = java.lang.System.err
            java.lang.String r8 = r8.getAbsolutePath()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r0)
            java.lang.StringBuilder r8 = r9.append(r8)
            java.lang.String r8 = r8.toString()
            r7.println(r8)
        L_0x00f9:
            int r2 = r2 + 1
            goto L_0x00d0
        L_0x00fc:
            boolean r0 = r3.delete()
            if (r0 != 0) goto L_0x0118
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.String r2 = r3.getAbsolutePath()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            java.lang.StringBuilder r1 = r3.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
        L_0x0118:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tvm.rpc.NativeServerLoop.run():void");
    }

    private static File serverEnv() throws IOException {
        final File createTempFile = File.createTempFile("tvm4j_rpc_", "");
        if (!createTempFile.delete() || !createTempFile.mkdir()) {
            throw new IOException("Couldn't create directory " + createTempFile.getAbsolutePath());
        }
        Function.register("tvm.rpc.server.workpath", new Function.Callback() {
            public Object invoke(TVMValue... tVMValueArr) {
                File file = createTempFile;
                String str = File.separator;
                return file + str + tVMValueArr[0].asString();
            }
        }, true);
        Function.register("tvm.rpc.server.load_module", new Function.Callback() {
            public Object invoke(TVMValue... tVMValueArr) {
                String asString = tVMValueArr[0].asString();
                String str = createTempFile + File.separator + asString;
                System.err.println("Load module from " + str);
                return Module.load(str);
            }
        }, true);
        return createTempFile;
    }
}
