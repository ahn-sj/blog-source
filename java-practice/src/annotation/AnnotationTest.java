package annotation;

public class AnnotationTest {

    @CustomAnnotation(name = "스터디")
    static class MyClass {}

    @CustomAnnotation
    static class DefaultClass {}

    public static void main(String[] args) {
        DefaultClass defaultClass = new DefaultClass();
        CustomAnnotation customAnnotation = defaultClass.getClass().getAnnotation(CustomAnnotation.class);
        String 기본값 = customAnnotation.name();
        System.out.println("[Default] customAnnotation.name() = " + 기본값);

        MyClass myClass = new MyClass();
        customAnnotation = myClass.getClass().getAnnotation(CustomAnnotation.class);
        String 스터디 = customAnnotation.name();
        System.out.println("[Assign]  customAnnotation.name() = " + 스터디);
    }
}
