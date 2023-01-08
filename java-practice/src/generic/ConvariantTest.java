package generic;

public class ConvariantTest {
    public static void main(String[] args) {
        Integer[] integers = new Integer[]{1, 2, 3};
        printArray(integers);
    }

    private static void printArray(Object[] integers) {
        for (Object object : integers) {
            System.out.println("object = " + object);
        }
    }
}
