package lesson_03.facultative.f02.code.part_04.synch.synchExample4;

public class Producer implements Runnable{
    Store store;

    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            store.put();
        }

    }
}
