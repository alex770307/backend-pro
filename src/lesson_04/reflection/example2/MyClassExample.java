package lesson_04.reflection.example2;

import java.lang.reflect.Field;

public class MyClassExample {
    public static void main(String[] args) {

        MyClass myClass = new MyClass();

        int number = myClass.getNumber();
        String name = null; // нет геттера на поле name
        System.out.println(name + ", " + number); // null, 0

        try {
            Field field = myClass.getClass().getDeclaredField("name");
            field.setAccessible(true);
            name = (String) field.get(myClass);
        } catch (NoSuchFieldException | IllegalAccessException e){}

        System.out.println(name + ", " + number); // default value, 0


    }
}
