package lesson_02.part1.classThread;

public class ThreadExample1 extends Thread{

    @Override
    public void run() {
        System.out.println("Привет!Я - поток с именем:  " + getName()
                +"Thread:  "+ Thread.currentThread());
//        System.out.println();
    }
}
