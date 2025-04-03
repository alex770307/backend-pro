package consult_01.streamAPI.streamAPI;

import java.util.stream.IntStream;

public class Stream2 {
    public static void main(String[] args) {
       int[] arr = {50,60,70,80,90,100,110,120};

       /*
       вывести на экран числа, которые больше или равны 90
       при этом каждое число увеличить на 10
       и оставить только первые три числа

       ожидаем результат: 100,110,120
        */

        // делаем с помощью циклов

        System.out.println("делаем с помощью циклов:");

        int counter = 0;

        for (int x : arr){
            if (x >= 90) {
                x = x + 10;
                counter++;
                if (counter > 3) break;
                System.out.println(x);
            }
        }

        System.out.println("делаем с помощью STREAM API:");

        IntStream.of(50,60,70,80,90,100,110,120)
                .filter(x -> x >=90) // 90,100,110,120
                .map(x -> x + 10)  // 100,110,120,130
                .limit(3) // 100,110,120
                .forEach(x -> System.out.println(x));
     }
}
