package generic;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class InconvariantTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);
//        printCollection(list); // Compile Error!
    }

    private static void printCollection(Collection<Object> objects) {
        for (Object object : objects) {
            System.out.println("object = " + object);
        }
    }
}
