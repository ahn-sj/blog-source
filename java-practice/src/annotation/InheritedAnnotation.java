package annotation;

import java.lang.annotation.*;

//@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface InheritedAnnotation {
    String value() default "inheritance";
}
