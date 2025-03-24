package lesson_02.part3;

public class MyThread extends Thread{

    private int result;

    public void run() {
        result = 0;
        for (int i = 1; i <= 10; i++) {
            result += i;
        }
    }

    public int getResult() {
        return result;
    }
}


