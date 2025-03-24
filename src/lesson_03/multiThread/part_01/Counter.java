package lesson_03.multiThread.part_01;

public class Counter {
    private int count = 0;

    public synchronized void increment(){
        count++;
    }

    public synchronized void decrement(){
        count--;
    }

    public int getCount() {
        return count;
    }
}
