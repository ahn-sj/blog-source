package generic;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample11 {
    public static void main(String[] args) {
        List<I> ist = new ArrayList<I>();
        ist.add(new J());
    }

    private void test1(final List<?> drinks) {
        final Object o = drinks.get(0);
    }

    private <T> void test2(final List<T> drinks) {
        final T t = drinks.get(0);
    }
}

class I {}
class J extends I {}