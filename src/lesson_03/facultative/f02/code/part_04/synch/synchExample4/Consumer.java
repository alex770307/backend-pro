package lesson_03.facultative.f02.code.part_04.synch.synchExample4;

public class Consumer implements Runnable{
    Store store;

    public Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            store.get();
        }

    }
}
