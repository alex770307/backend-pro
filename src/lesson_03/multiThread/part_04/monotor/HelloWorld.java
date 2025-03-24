package lesson_03.multiThread.part_04.monotor;

public class HelloWorld {
    public static void main(String[] args) {
        Object object = new Object();

        synchronized (object) {
            System.out.println("Hello World");
        }
    }
}
