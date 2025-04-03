package consult_01.standartFunctionalInterfaces;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        BinaryOperator<Double> div = (x,y) -> x / y;

        System.out.println(div.apply(5.4,2.0));
    }
}
