package lesson_03.multiThread.part_04.monotor;

public class SynchronizedExample1 {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();

        Runnable task = () -> {
            synchronized (lock) {
                System.out.println("thread");
            }
        };

        Thread th1 = new Thread(task);
        th1.start();

        for (int i = 0; i < 100000; i++) {
//            // просто для небольшой задержки между запуском потока и захватом
//            // объекта lock
        }

        synchronized (lock) {
            for (int i = 0; i < 8; i++) {
                Thread.currentThread().sleep(1000);
                System.out.print(" " + i);
            }
            System.out.println(" ... ");
        }
    }

}
