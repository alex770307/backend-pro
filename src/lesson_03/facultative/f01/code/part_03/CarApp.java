package lesson_03.facultative.f01.code.part_03;

public class CarApp {
    public static void main(String[] args) {
        var ferrari = new Car("Ferrari");
        var bmw = new Car("BMW");
        ferrari.start();
        bmw.start();

        System.out.println("Method continue execution... Main method is executed by thread " + Thread.currentThread().getName());
    }
}
