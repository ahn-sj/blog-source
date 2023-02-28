package generic;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample1 {
    public static void main(String[] args) {

        List priceList = new ArrayList<>();
        priceList.add(new Integer(10000));
        priceList.add(new Integer(20000));
        priceList.add("30000");

        Integer integer = (Integer) priceList.get(0) +
                (Integer) priceList.get(1) + // java.lang.ClassCastException
                (Integer) priceList.get(2);  // Runtime Error

        List<Integer> priceList1 = new ArrayList<>();
        priceList1.add(new Integer(10000));
        priceList1.add(new Integer(20000));
//        priceList1.add("30000"); // Compile Error

    }
}
