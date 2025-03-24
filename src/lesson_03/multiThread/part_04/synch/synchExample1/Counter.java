package lesson_03.multiThread.part_04.synch.synchExample1;

public class Counter {
    private long counter = 0L;

    public synchronized void increaseCounter() {

        counter++;
    }

    public long getCounter() {
        return counter;
    }
}
