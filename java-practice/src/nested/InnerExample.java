package nested;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InnerExample {
    public static void main(String[] args) throws IOException {

//        List<Outer.NonStaticInner> list = new ArrayList<>();
//        List<Outer.StaticInner> list = new ArrayList<>();

//        for (int i = 0; i < 100; i++) {
//            System.out.println(i);
//            list.add(new Outer().new NonStaticInner());
//            list.add(new Outer.StaticInner());
//        }

        Outer.StaticInner staticInner = new Outer.StaticInner();
        Outer.NonStaticInner nonStaticInner = new Outer().new NonStaticInner();

        System.gc();
        System.out.println("GC 동작 완료");

        staticInner.printOuterField();
        nonStaticInner.printOuterField();

//         System.in.read(); // VisualVm HeapDump 시점
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
