package lesson_04.reflection.human;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class HumanReflectionVariable {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        Human john = new Human("John", "London");

        Class humanClass = john.getClass();

        Field[] fields = humanClass.getDeclaredFields();

        for (Field currentField : fields){
            System.out.println(currentField);

            if (currentField.getName().contains("name")){
                System.out.println("Private field 'name' was find!");
                currentField.setAccessible(true);
                currentField.set(john, "Robert");
            }

        }

        System.out.println(john);
    }
}
