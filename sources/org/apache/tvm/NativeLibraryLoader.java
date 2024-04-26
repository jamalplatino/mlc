package org.apache.tvm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

class NativeLibraryLoader {
    private static final String libPathInJar = "/lib/native/";
    /* access modifiers changed from: private */
    public static File tempDir;

    interface Action {
        void invoke(File file);
    }

    NativeLibraryLoader() {
    }

    static {
        try {
            File createTempFile = File.createTempFile("tvm4j", "");
            tempDir = createTempFile;
            if (!createTempFile.delete() || !tempDir.mkdir()) {
                throw new IOException("Couldn't create directory " + tempDir.getAbsolutePath());
            } else if (!"Windows".equals(getUnifiedOSName())) {
                Runtime.getRuntime().addShutdownHook(new Thread() {
                    public void run() {
                        for (File file : NativeLibraryLoader.tempDir.listFiles()) {
                            System.err.println("Deleting " + file.getAbsolutePath());
                            if (!file.delete()) {
                                System.err.println("[WARN] Couldn't delete temporary file " + file.getAbsolutePath());
                            }
                        }
                        System.err.println("Deleting " + NativeLibraryLoader.tempDir.getAbsolutePath());
                        if (!NativeLibraryLoader.tempDir.delete()) {
                            System.err.println("[WARN] Couldn't delete temporary directory " + NativeLibraryLoader.tempDir.getAbsolutePath());
                        }
                    }
                });
            } else {
                throw new RuntimeException("Windows not supported yet.");
            }
        } catch (IOException e) {
            System.err.println("Couldn't create temporary directory: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public static void loadLibrary(String str) throws UnsatisfiedLinkError, IOException {
        String mapLibraryName = System.mapLibraryName(str);
        if (mapLibraryName.endsWith("dylib")) {
            System.err.println("Replaced .dylib with .jnilib");
            mapLibraryName = mapLibraryName.replace(".dylib", ".jnilib");
        }
        System.err.println("Attempting to load " + mapLibraryName);
        extractResourceFileToTempDir(mapLibraryName, new Action() {
            public void invoke(File file) {
                System.err.println("Loading library from " + file.getPath());
                System.load(file.getPath());
            }
        });
    }

    private static String unifyOSName(String str) {
        return str.startsWith("Windows") ? "Windows" : str;
    }

    private static String getUnifiedOSName() {
        return unifyOSName(System.getProperty("os.name"));
    }

    private static File createTempFile(String str) throws IOException {
        File file = tempDir;
        return new File(file + File.separator + str);
    }

    public static void extractResourceFileToTempDir(String str, Action action) throws IOException {
        InputStream resourceAsStream = NativeLibraryLoader.class.getResourceAsStream(libPathInJar + str);
        if (resourceAsStream != null) {
            System.err.println(String.format("Loading %s from %s", new Object[]{str, libPathInJar}));
            try {
                File createTempFile = createTempFile(str);
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                long currentTimeMillis = System.currentTimeMillis();
                byte[] bArr = new byte[8192];
                for (int read = resourceAsStream.read(bArr); read > 0; read = resourceAsStream.read(bArr)) {
                    fileOutputStream.write(bArr, 0, read);
                }
                fileOutputStream.flush();
                FileInputStream fileInputStream = new FileInputStream(createTempFile);
                fileOutputStream.close();
                System.err.println(String.format("Copying took %.2f seconds.", new Object[]{Double.valueOf(((double) (System.currentTimeMillis() - currentTimeMillis)) / 1000.0d)}));
                action.invoke(createTempFile);
                fileInputStream.close();
            } catch (IOException e) {
                System.err.println("[ERROR] Could not create the temp file: " + e.toString());
                throw e;
            } catch (UnsatisfiedLinkError e2) {
                System.err.println("Couldn't load copied link file: " + e2.toString());
                throw e2;
            }
        } else {
            throw new UnsatisfiedLinkError("Couldn't find the resource " + str);
        }
    }
}
