package generic;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample13 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("foo");
        stringList.add("bar");
        // Utils.printList(stringList, "baz");

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
//        Utils.printList(integerList, "baz");
    }
}

//class Utils {
//
//    public static <T> void printList(List<T> list, T value) {
//        for (T element : list) {
//            System.out.println(element);
//        }
//        System.out.println(value);
//    }
//}