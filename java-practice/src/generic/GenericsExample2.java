package generic;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample2 {
    public static void main(String[] args) {
        List priceList = new ArrayList<>();
        priceList.add(new Integer(10000));
        priceList.add(new Integer(20000));

        Integer integer = (Integer) priceList.get(0) + (Integer) priceList.get(1); // 생략 불가능

        List<Integer> priceList1 = new ArrayList<>();
        priceList1.add(new Integer(10000));
        priceList1.add(new Integer(20000));

        Integer integer2 = priceList1.get(0) + priceList1.get(1); // 생략 가능

    }
}
