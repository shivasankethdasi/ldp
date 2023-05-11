package singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Singleton {

    private static class HashcodePrinter implements Runnable {
        private final int threadId;

        public HashcodePrinter(int threadId) {
            this.threadId = threadId;
        }

        public void run() {
            SingletonObject obj1 = SingletonObject.getInstance();
            System.out.println(threadId + " " + obj1.hashCode());
        }
    }

    public static void main(String[] args) {
        int threads = 5;
        ExecutorService executor = Executors.newFixedThreadPool(threads);
        for(int i=0;i<threads;i++) {
            executor.execute(new HashcodePrinter(i));
        }
        executor.shutdown();

    }
}
