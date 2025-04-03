package lesson_04.annotation.annotationExample2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
public class JavaFileDemo {
    public static void main(String[] args) throws NoSuchMethodException {

        Class<JaveFile1> javeFile1Class = JaveFile1.class;

        Annotation[] annotations = javeFile1Class.getAnnotations();

        for (Annotation currentAnnotation : annotations){
            if (currentAnnotation instanceof JavaFileInfo javaFileInfo){
                System.out.println("Для класса : " + javeFile1Class.getName() + " есть информация об его авторе и версии");

                System.out.println("Автор: " + javaFileInfo.name());
                System.out.println("Версия: " + javaFileInfo.value());
            }
        }

        Method method = javeFile1Class.getMethod("printData");

        annotations = method.getAnnotations();
        for (Annotation currentAnnotation : annotations){
            if (currentAnnotation instanceof JavaFileInfo javaFileInfo){
                System.out.println("Для метода : " + method.getName() + " есть информация об его авторе и версии");

                System.out.println("Автор: " + javaFileInfo.name());
                System.out.println("Версия: " + javaFileInfo.value());
            }
        }
    }
}
