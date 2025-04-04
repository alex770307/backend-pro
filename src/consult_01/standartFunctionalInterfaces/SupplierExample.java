package consult_01.standartFunctionalInterfaces;


import lesson_01.appStructureVar1.front.menu.UserInput;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Double> myRandomValue = () -> {
            Double result = Math.random() * 56.75;
            result = Math.pow(result, 3);
            return result;
        };

        System.out.println(myRandomValue.get());


        Supplier<User> createUser = () -> {
            UserInput ui = new UserInput();
            String userName = ui.userText("Введите имя пользователя: ");
            return new User(userName);
        };

        System.out.println(createUser.get());
    }
}
