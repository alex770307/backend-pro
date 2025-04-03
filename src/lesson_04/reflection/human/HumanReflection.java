package lesson_04.reflection.human;

public class HumanReflection {
    public static void main(String[] args) {

        Human john = new Human("John", "London");

        Class humanClass = john.getClass();

        System.out.println(humanClass);

        /*
        - getClass() - возвращает имя и пакет класса
        - getSimpleName() - возвращает имя класса
        - getPackage() - возвращает имя пакета
        - getModifiers() - возвращает модификаторы класса
        - getSuperClass() - возвращает родительский класс
        - getInterfaces() - возвращает список интерфейсов, которые класс использует
        - getConstructors() - возвращает список конструкторов
        - getFields() - возвращает список публичных полей класса
        - getDeclaredFields() - возвращает список всех полей класса
        - getMethods() - возвращает список публичных методов класса
        - getDeclaredMethods() - возвращает список всех методов класса
         */
    }
}
