package annotation;

public class InheritedTest {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        InheritedAnnotation parentAnnotation = parent.getClass().getAnnotation(InheritedAnnotation.class);
        InheritedAnnotation childAnnotation = child.getClass().getAnnotation(InheritedAnnotation.class);

        String parentVal = parentAnnotation.value();
        String childVal = childAnnotation.value();

        System.out.println("parentVal = " + parentVal);
        System.out.println("childVal = " + childVal);

    }
}

@InheritedAnnotation(value = "parent")
class Parent {}
class Child extends Parent {}
