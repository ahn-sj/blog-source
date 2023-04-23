package nested;

public class NestedClass {
    public static void main(String[] args) {
        Out.In inner = new Out.In();
    }
}

class Out {
    private int ov;      // outer variable

    static class In {
        private int iv; // inner variable
    }
}
