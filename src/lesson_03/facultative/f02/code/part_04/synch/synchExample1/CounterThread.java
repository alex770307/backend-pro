package lesson_03.facultative.f02.code.part_04.synch.synchExample1;

public class CounterThread extends Thread{
    private Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increaseCounter();
        }
    }
}
