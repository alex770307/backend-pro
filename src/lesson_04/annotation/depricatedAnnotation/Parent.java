package lesson_04.annotation.depricatedAnnotation;

public class Parent {
    public void printData(){}

    @DepricatedAnnotation
    public void oldMethod() {
        System.out.println("Старый метод, лучше не использовать");
    }
}
