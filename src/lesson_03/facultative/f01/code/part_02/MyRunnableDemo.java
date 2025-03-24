package lesson_03.facultative.f01.code.part_02;

public class MyRunnableDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }
}
