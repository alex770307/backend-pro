package lesson_03.multiThread.part_03.interrupt;

public class Example2 {
    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Working...");
                for (int i = 0; i < 2000000000; i++) {

                }
                // Делаем какой-то код
            }
            System.out.println("Thread finished ...");
        };

        Thread thread = new Thread(task);
        thread.start();
        Thread.sleep(2);
        thread.interrupt();
    }
}
