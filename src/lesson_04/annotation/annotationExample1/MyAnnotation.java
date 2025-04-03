package lesson_04.annotation.annotationExample1;

import java.lang.annotation.*;

@Target(value = ElementType.TYPE)
@Retention(value = RetentionPolicy.RUNTIME)
@Documented
//@Inherited
public @interface MyAnnotation {
}
