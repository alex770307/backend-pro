package lesson_04.reflection.human;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class HumanReflectionMethods {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        Human john = new Human("John", "London");

        Class humanClass = john.getClass();

        Method[] methods = humanClass.getDeclaredMethods();

        for (Method currentMethod : methods){
            System.out.println(currentMethod);

            if (currentMethod.getName().contains("Secret")){
                System.out.println("Private method was find!");
                currentMethod.setAccessible(true);
                int secretCode = (int) currentMethod.invoke(john, "Our private method made public");
                System.out.println(secretCode);
            }

        }
    }
}
