package lesson_02.part3;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        int result = thread1.getResult() + thread2.getResult();
        System.out.println("Result: " + result);
    }

}
