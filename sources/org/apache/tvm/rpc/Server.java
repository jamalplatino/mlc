package org.apache.tvm.rpc;

import java.io.IOException;

public class Server {
    private final WorkerThread worker;

    private static class WorkerThread extends Thread {
        private final ServerProcessor processor;
        private volatile boolean running = true;

        public WorkerThread(ServerProcessor serverProcessor) {
            this.processor = serverProcessor;
        }

        public void run() {
            while (this.running) {
                this.processor.run();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public void terminate() {
            this.running = false;
            this.processor.terminate();
        }
    }

    public Server(int i) throws IOException {
        this.worker = new WorkerThread(new StandaloneServerProcessor(i));
    }

    public Server(String str, int i, String str2) {
        this.worker = new WorkerThread(new ConnectProxyServerProcessor(str, i, str2));
    }

    public void start() {
        this.worker.start();
    }

    public void terminate() {
        this.worker.terminate();
    }
}
