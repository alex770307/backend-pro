package lesson_03.multiThread.part_02;

public class DaemonApp {
    public static void main(String[] args) throws InterruptedException {
        var worker = new Thread(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
            }
            var threadName = Thread.currentThread().getName();
            System.out.println("Thread name " + threadName + " is executing!");
            System.out.println("Поток " + threadName + " завершил свою работу");
        }, "Worker");

        var daemon = new Thread(() -> {
            int count = 0;
            while (count < 10) {
                count++;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("прервали");
                }
                var threadName = Thread.currentThread().getName();
                System.out.println("Thread name " + threadName + " is executing!");
            }
        }, "daemon");


        daemon.setDaemon(true); // устанавливаем статус, что данный поток должен стать daemon
        worker.start();
        daemon.start();

        System.out.println("Метод main завершил свою работу");
    }
}
