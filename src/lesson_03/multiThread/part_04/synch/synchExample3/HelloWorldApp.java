package lesson_03.multiThread.part_04.synch.synchExample3;

public class HelloWorldApp {
    public static void main(String[] args) {
        Object object = new Object();

        synchronized (object) {
            System.out.println("Hello World!");
        }
    }
}
