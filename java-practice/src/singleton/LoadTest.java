package singleton;

public class LoadTest {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        System.out.println("=================");
        outerClass.getInnerClass();

        double l = Double.MAX_VALUE + Double.MAX_VALUE;
        System.out.println("l = " + l);
    }
}

class OuterClass {                                        // 1
    private static final String SEQ01 = "SEQ01 VARIABLE"; // 2

    static {
        System.out.println("SEQ01 >>>>>>> " + SEQ01);     // 3
    }

    public OuterClass() {                                 // 4
        System.out.println("SEQ02 >>>>>>> SEQ02");
    }

    // -----------------------------------------------------
    // | 현재 InnerClass 는 Load, Initialization 이 되지 않음 |
    // -----------------------------------------------------

    public void getInnerClass() {
        System.out.println("SEQ03 >>>>>>> " + InnerClass.class); // 5, 로드 O, 초기화 X
        System.out.println("================================");
        System.out.println("SEQ05 >>>>>>> " + InnerClass.getSeq05()); // 6. getSeq03 을 호출 할 때 클래스가 초기화된다.
                                                                      // 7. 이때, static 초기화 블럭이 먼저 호출되고
                                                                      // 8. getSeq05 를 반환한다.
    }

    private static class InnerClass {
        private static final String SEQ03 = "SEQ03";

        static {                                                      // 7. InnerClass.getSeq05 가 호출될 때 실행
            System.out.println("SEQ04 >>>>>>> " + SEQ03);
        }

        public static String getSeq05() {                             // 8. static 초기화 블럭 실행 후에 동작
            return "SEQ04";
        }
    }
}