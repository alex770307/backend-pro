package lesson_04.annotation.depricatedAnnotation;

public class Child extends Parent{
    @Override
    @Deprecated(since = "1.2", forRemoval = true)
    // встроенная аннотация, которая сообщает, что этот метод больше на рекомендуется к использованию
    public void printData() {
        System.out.println("класс наследник");
    }
}
