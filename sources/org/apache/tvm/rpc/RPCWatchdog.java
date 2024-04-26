package org.apache.tvm.rpc;

public class RPCWatchdog extends Thread {
    private boolean started = false;
    private int timeout = 0;

    public synchronized void startTimeout(int i) {
        this.timeout = i;
        this.started = true;
        notify();
    }

    public synchronized void finishTimeout() {
        this.started = false;
        notify();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:4|5|6|7|32|29|2|1) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        java.lang.System.err.println("watchdog interrupted...");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0001, code lost:
        continue;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0055 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0009 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r4 = this;
        L_0x0000:
            monitor-enter(r4)
        L_0x0001:
            boolean r0 = r4.started     // Catch:{ all -> 0x0062 }
            if (r0 != 0) goto L_0x0011
            r4.wait()     // Catch:{ InterruptedException -> 0x0009 }
            goto L_0x0001
        L_0x0009:
            java.io.PrintStream r0 = java.lang.System.err     // Catch:{ all -> 0x0062 }
            java.lang.String r1 = "watchdog interrupted..."
            r0.println(r1)     // Catch:{ all -> 0x0062 }
            goto L_0x0001
        L_0x0011:
            monitor-exit(r4)     // Catch:{ all -> 0x0062 }
            monitor-enter(r4)
        L_0x0013:
            boolean r0 = r4.started     // Catch:{ all -> 0x005f }
            if (r0 == 0) goto L_0x005d
            java.io.PrintStream r0 = java.lang.System.err     // Catch:{ InterruptedException -> 0x0055 }
            int r1 = r4.timeout     // Catch:{ InterruptedException -> 0x0055 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x0055 }
            r2.<init>()     // Catch:{ InterruptedException -> 0x0055 }
            java.lang.String r3 = "waiting for timeout: "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch:{ InterruptedException -> 0x0055 }
            java.lang.StringBuilder r1 = r2.append(r1)     // Catch:{ InterruptedException -> 0x0055 }
            java.lang.String r1 = r1.toString()     // Catch:{ InterruptedException -> 0x0055 }
            r0.println(r1)     // Catch:{ InterruptedException -> 0x0055 }
            int r0 = r4.timeout     // Catch:{ InterruptedException -> 0x0055 }
            long r0 = (long) r0     // Catch:{ InterruptedException -> 0x0055 }
            r4.wait(r0)     // Catch:{ InterruptedException -> 0x0055 }
            boolean r0 = r4.started     // Catch:{ InterruptedException -> 0x0055 }
            if (r0 != 0) goto L_0x0043
            java.io.PrintStream r0 = java.lang.System.err     // Catch:{ InterruptedException -> 0x0055 }
            java.lang.String r1 = "watchdog woken up, ok..."
            r0.println(r1)     // Catch:{ InterruptedException -> 0x0055 }
            goto L_0x0013
        L_0x0043:
            java.io.PrintStream r0 = java.lang.System.err     // Catch:{ InterruptedException -> 0x0055 }
            java.lang.String r1 = "watchdog woke up!"
            r0.println(r1)     // Catch:{ InterruptedException -> 0x0055 }
            java.io.PrintStream r0 = java.lang.System.err     // Catch:{ InterruptedException -> 0x0055 }
            java.lang.String r1 = "terminating..."
            r0.println(r1)     // Catch:{ InterruptedException -> 0x0055 }
            r4.terminate()     // Catch:{ InterruptedException -> 0x0055 }
            goto L_0x0013
        L_0x0055:
            java.io.PrintStream r0 = java.lang.System.err     // Catch:{ all -> 0x005f }
            java.lang.String r1 = "watchdog interrupted..."
            r0.println(r1)     // Catch:{ all -> 0x005f }
            goto L_0x0013
        L_0x005d:
            monitor-exit(r4)     // Catch:{ all -> 0x005f }
            goto L_0x0000
        L_0x005f:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x005f }
            throw r0
        L_0x0062:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0062 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tvm.rpc.RPCWatchdog.run():void");
    }

    /* access modifiers changed from: protected */
    public void terminate() {
        System.exit(0);
    }
}
