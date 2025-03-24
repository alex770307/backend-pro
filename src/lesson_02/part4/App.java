package lesson_02.part4;

public class App {
    public static void main(String[] args) {
        var worker = new Thread(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            var threadName = Thread.currentThread().getName();
            System.out.println("Thread is finishing its execution with name: " + threadName);
        }, "Worker");

        var daemon = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                var threadName = Thread.currentThread().getName();
                System.out.println("Thread is executing with name: " + threadName);
            }
        }, "Daemon");

        daemon.setDaemon(true);
        worker.start();
        daemon.start();

        var threadName = Thread.currentThread().getName();
        System.out.println("Thread is executing with name: " + threadName);
    }


}
