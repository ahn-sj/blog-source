package generic;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample10 {
    public static void main(String[] args) {

        List<Language> languageList = new ArrayList<>();
        List<JVM> jvmList = new ArrayList<>();
        List<Java> javaList = new ArrayList<>();

        LangUtil.printLanguage(languageList);
        LangUtil.printLanguage(jvmList);
//        LangUtil.printLanguage(javaList);




//        Printer<A4> a4Printer = new Printer<>();
//        PrinterUtil.getPaper(a4Printer);
    }
}

class LangUtil {
    static void printLanguage(List<? super JVM> list) {}
}

class Language {}
class JVM extends Language{}
class Java extends JVM {}

class PrinterUtil {
//    public static void getPaper(Printer<? extends Paper> printer) {
        // 타입을 안전하게 가져올 수 있다. 이 말은 생성한 인스턴스에 값을 담아줄때 적절하다.
        // Printer 타입 매개변수를 Paper로 상한 제한을 했을 때 최상위 타입이 Noodle만 들어오기 때문에 해당 타입을 안전하게 가지고 올 수 있다.
        // 그런데 만약 저장을 한다고 하면, 프린터에 매개변수화된 타입이 네모라면 setPaper에 네모가 들어올지 용지(paper)가 들어올지 모른다.
        // 즉, 하위 타입에 상위 타입을 대입할 위험이 있다는 것이다.
//        Paper paper = printer.get(); // 읽기 O
//        printer.set(new Paper());          // 저장 X
//    }

//    public void setPaper(Printer<? super Paper> printer) { // 하한경계이므로 안전하게 값을 저장할 수 있다. 즉 인스턴스 리스트의 원소를 소비하기 때문에 적절하다.
        // Printer 타입 매개변수를 Paper 타입으로 하한 제한을 했는데 이때 Printer 의 매개변수화된 타입이 Paper 이거나 그에 상위 타입들만 올 수 있기 때문에 안전하게 저장할 수 있다.
        // 그러나 값을 꺼내서 Paper로 형변환을 한다고 하면 Paper보다 상위 타입이 올 수 있어서 컴파일 에러가 발생하게 된다.
//        printer.set(new Paper());       // 저장 O
//        Paper paper = printer.get(); // 읽기 X
//    }
}

class Printer<T> {
    private T t;

    public T get() {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }
}

class Nemo {}
class Paper extends Nemo {}
class A4 extends Paper {}
class A3 extends Paper {}
