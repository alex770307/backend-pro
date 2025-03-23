package lesson02.part1.classThread;

public class Car extends Thread{
    private String model;

    public Car(String model) {
        this.model = model;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);// "усыпим" наш поток на 1 сек (1000 миллисек) -
            // временно остановим выполнение кода нашего потока
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Car " + model + " is being driven by thread " + Thread.currentThread().getName());
    }
}
