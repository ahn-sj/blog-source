package nested;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class InnerExample {
    public static void main(String[] args) throws IOException {

        // test2();

        Outer.StaticInner staticInner1 = createStaticInner();
        Outer.StaticInner staticInner2 = createStaticInner();
        Outer.StaticInner staticInner3 = createStaticInner();
        Outer.StaticInner staticInner4 = createStaticInner();
        Outer.StaticInner staticInner5 = createStaticInner();

        System.gc();

        System.out.println("GC 동작 완료");
        System.in.read(); // VisualVm HeapDump 시점

        System.out.println("staticInner1 = " + staticInner1);
        System.out.println("staticInner2 = " + staticInner2);
        System.out.println("staticInner3 = " + staticInner3);
        System.out.println("staticInner4 = " + staticInner4);
        System.out.println("staticInner5 = " + staticInner5);
    }


    private static Outer.StaticInner createStaticInner() {
        return new Outer.StaticInner();
    }

    private static Outer.NonStaticInner createNonStaticInner() {
        return new Outer().new NonStaticInner();
    }

    private static void test2() {
//        List<Outer.NonStaticInner> list = new ArrayList<>();
//        List<Outer.StaticInner> list = new ArrayList<>();
//
//        for (int i = 0; i < 100; i++) {
//            System.out.println(i);
//            list.add(new Outer().new NonStaticInner());
//            list.add(new Outer.StaticInner());
//        }
    }
}

class Outer {
    private int out = 10;
    private int[] ints = new int[100000000];

    static class StaticInner {
        private int in = 30;

        void printOuterField() {
            // System.out.println("Outer.out = " + Outer.this.out);
        }
    }

    class NonStaticInner { // 내부 클래스
        private int in = 20;

        void printOuterField() {
            System.out.println("Outer.out = " + Outer.this.out);
        }

    }
}
