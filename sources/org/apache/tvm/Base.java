package org.apache.tvm;

final class Base {
    public static final LibInfo _LIB = new LibInfo();

    public static class RefLong {
        public final long value;

        public RefLong(long j) {
            this.value = j;
        }

        public RefLong() {
            this(0);
        }
    }

    public static class RefTVMValue {
        public final TVMValue value;

        public RefTVMValue(TVMValue tVMValue) {
            this.value = tVMValue;
        }

        public RefTVMValue() {
            this((TVMValue) null);
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000f */
    static {
        /*
            java.lang.String r0 = "tvm4j"
            org.apache.tvm.LibInfo r1 = new org.apache.tvm.LibInfo
            r1.<init>()
            _LIB = r1
            tryLoadLibraryOS(r0)     // Catch:{ UnsatisfiedLinkError -> 0x000f }
            goto L_0x0019
        L_0x000d:
            r0 = move-exception
            goto L_0x001b
        L_0x000f:
            java.io.PrintStream r1 = java.lang.System.err     // Catch:{ all -> 0x000d }
            java.lang.String r2 = "[WARN] TVM native library not found in path. Copying native library from the archive. Consider installing the library somewhere in the path (for Windows: PATH, for Linux: LD_LIBRARY_PATH), or specifying by Java cmd option -Djava.library.path=[lib path]."
            r1.println(r2)     // Catch:{ all -> 0x000d }
            org.apache.tvm.NativeLibraryLoader.loadLibrary(r0)     // Catch:{ all -> 0x000d }
        L_0x0019:
            r0 = 1
            goto L_0x0032
        L_0x001b:
            java.io.PrintStream r1 = java.lang.System.err
            java.lang.String r2 = "[WARN] Couldn't find native library tvm4j."
            r1.println(r2)
            r0.printStackTrace()
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.String r1 = "Try to load tvm4j (runtime packed version) ..."
            r0.println(r1)
            java.lang.String r0 = "tvm4j_runtime_packed"
            java.lang.System.loadLibrary(r0)     // Catch:{ UnsatisfiedLinkError -> 0x00ad }
            r0 = 0
        L_0x0032:
            java.io.PrintStream r1 = java.lang.System.err
            java.lang.String r2 = "libtvm4j loads successfully."
            r1.println(r2)
            if (r0 == 0) goto L_0x009a
            java.lang.String r0 = "libtvm.so.path"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto L_0x0056
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r1 = r1.isFile()
            if (r1 == 0) goto L_0x0056
            org.apache.tvm.LibInfo r1 = _LIB
            int r0 = r1.nativeLibInit(r0)
            if (r0 == 0) goto L_0x00a0
        L_0x0056:
            java.lang.String r0 = "os.name"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch:{ IOException -> 0x0093 }
            java.lang.String r1 = "Linux"
            boolean r1 = r0.startsWith(r1)     // Catch:{ IOException -> 0x0093 }
            if (r1 == 0) goto L_0x0067
            java.lang.String r0 = "libtvm_runtime.so"
            goto L_0x0071
        L_0x0067:
            java.lang.String r1 = "Mac"
            boolean r1 = r0.startsWith(r1)     // Catch:{ IOException -> 0x0093 }
            if (r1 == 0) goto L_0x007a
            java.lang.String r0 = "libtvm_runtime.dylib"
        L_0x0071:
            org.apache.tvm.Base$1 r1 = new org.apache.tvm.Base$1     // Catch:{ IOException -> 0x0093 }
            r1.<init>()     // Catch:{ IOException -> 0x0093 }
            org.apache.tvm.NativeLibraryLoader.extractResourceFileToTempDir(r0, r1)     // Catch:{ IOException -> 0x0093 }
            goto L_0x00a0
        L_0x007a:
            java.lang.UnsatisfiedLinkError r1 = new java.lang.UnsatisfiedLinkError     // Catch:{ IOException -> 0x0093 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0093 }
            r2.<init>()     // Catch:{ IOException -> 0x0093 }
            java.lang.StringBuilder r0 = r2.append(r0)     // Catch:{ IOException -> 0x0093 }
            java.lang.String r2 = " not supported currently"
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch:{ IOException -> 0x0093 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x0093 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0093 }
            throw r1     // Catch:{ IOException -> 0x0093 }
        L_0x0093:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x009a:
            org.apache.tvm.LibInfo r0 = _LIB
            r1 = 0
            r0.nativeLibInit(r1)
        L_0x00a0:
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            org.apache.tvm.Base$2 r1 = new org.apache.tvm.Base$2
            r1.<init>()
            r0.addShutdownHook(r1)
            return
        L_0x00ad:
            r0 = move-exception
            java.io.PrintStream r1 = java.lang.System.err
            java.lang.String r2 = "[ERROR] Couldn't find native library tvm4j_runtime_packed."
            r1.println(r2)
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tvm.Base.<clinit>():void");
    }

    private static void tryLoadLibraryOS(String str) throws UnsatisfiedLinkError {
        try {
            System.err.println(String.format("Try loading %s from native path.", new Object[]{str}));
            System.loadLibrary(str);
        } catch (UnsatisfiedLinkError unused) {
            String property = System.getProperty("os.name");
            if (property.startsWith("Linux")) {
                tryLoadLibraryXPU(str, "linux-x86_64");
            } else if (property.startsWith("Mac")) {
                tryLoadLibraryXPU(str, "osx-x86_64");
            } else {
                throw new UnsatisfiedLinkError("Windows not supported currently");
            }
        }
    }

    private static void tryLoadLibraryXPU(String str, String str2) throws UnsatisfiedLinkError {
        System.err.println(String.format("Try loading %s-%s from native path.", new Object[]{str, str2}));
        System.loadLibrary(String.format("%s-%s", new Object[]{str, str2}));
    }

    public static void checkCall(int i) throws TVMError {
        if (i != 0) {
            throw new TVMError(_LIB.tvmGetLastError());
        }
    }

    static class TVMError extends RuntimeException {
        public TVMError(String str) {
            super(str);
        }
    }

    private Base() {
    }
}
