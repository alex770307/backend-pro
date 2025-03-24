package lesson_03.facultative.f01.code.part_01;

public class ex3_ThreadExampleWithLambda {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("Thread is running!"));
        thread.start();
    }
}
