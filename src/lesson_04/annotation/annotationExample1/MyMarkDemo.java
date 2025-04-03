package lesson_04.annotation.annotationExample1;

public class MyMarkDemo {
    public static void main(String[] args) {

        Parent parent = new Parent();
        Child child = new Child();

//        testInterface(parent);
//        testInterface(child);

        testAnnotation(parent);
        testAnnotation(child);

    }


    static void testInterface(MyMark markedObject){
        System.out.println("метод testInterface завершен успешно");
    }

    static void testAnnotation(Object object){
        if (object.getClass().isAnnotationPresent(MyAnnotation.class)) {
            System.out.println("Метод testAnnotation завершен успешно для объекта " + object.getClass().getName());
        } else {
            throw new RuntimeException("Объект " + object.getClass().getName() + " не аннотирован аннотацией 'MyAnnotation'");
        }
    }

}
