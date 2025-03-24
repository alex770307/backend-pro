package lesson_03.solid.dip;

public class Worker implements Employee{

    @Override
    public void work() {
        System.out.println("рабочий работает ...");
    }
}
