package lesson_03.facultative.f02.code.part_04.synch.synchExample2;

public class CommonResource {
    int x;

    synchronized void increment() {
        x = 1;
        for (int i = 1; i < 5; i++) {
            System.out.printf("%s %d\n", Thread.currentThread().getName(), x);
            x++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {

            }
        }
    }
}
