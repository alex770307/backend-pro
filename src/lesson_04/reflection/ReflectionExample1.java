package lesson_04.reflection;

import java.lang.reflect.Method;

public class ReflectionExample1 {
    public static void main(String[] args) {
        Class stringClass = String.class;

        Method[] methods = stringClass.getMethods();

        System.out.println("Всего в классе String " + methods.length + " методов");

        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i]);
        }
    }
}
