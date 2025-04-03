package consult_01.standartFunctionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        UnaryOperator<Integer> square = x -> x * x;

        for (int i = 1; i <=5 ; i++) {

            printResult(i, square);

        }



        UnaryOperator<Integer> triple = x -> x * x * x;

        for (int i = 1; i <=5 ; i++) {

            printResult(i, triple);

        }



    }

    public static void printResult(Integer x, UnaryOperator<Integer> unaryOperator){
        System.out.println(unaryOperator.apply(x));
    }
}
