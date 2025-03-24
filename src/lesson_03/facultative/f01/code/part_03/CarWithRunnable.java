package lesson_03.facultative.f01.code.part_03;

public class CarWithRunnable implements Runnable{
    private final String model;

    public CarWithRunnable(String model) {
        this.model = model;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Car " + model + " is being driven by thread " + Thread.currentThread().getName());
    }
}
