package lesson_03.facultative.f02.code.part_05.wait;

public class WaitExample {
    public static void main(String []args) throws InterruptedException {
        Object lock = new Object();
        // task будет ждать, пока его не оповестят через lock
        Runnable task = () -> {
            synchronized(lock) {
                try {
                    System.out.println("Наш поток начал свою работу, но готов временно передать объект в поток main");

                    lock.wait();

                    System.out.println("Нашему потоку вернули доступ к объекту из потока main");

                } catch(InterruptedException e) {
                    System.out.println("interrupted");
                }
            }
            // После оповещения нас мы будем ждать, пока сможем взять лок
            System.out.println("thread");
        };

        Thread taskThread = new Thread(task);
        taskThread.start();
        // Ждём и после этого забираем себе лок, оповещаем и отдаём лок
        Thread.currentThread().sleep(3000);
        System.out.println("main");
        synchronized(lock) {
            System.out.println("Наш метод main сделал свою работу и готов вернуть объект в другой поток");
            lock.notify();
        }
    }
}
