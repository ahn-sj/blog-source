package generic;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class GenericsTypeErasure {
    public static void main(String[] args) throws NoSuchMethodException {

//        List<String> strings = new ArrayList<>();
//        List<Integer> integers = new ArrayList<>();
//
//        Item<Long> longItem = new Item<>();
//        longItem.setObject(Long.MAX_VALUE);
//        System.out.println("longItem.getObject() = " + longItem.getObject());

        Class<Item> itemClass = Item.class;
        Class<?> returnType = itemClass.getMethod("getObject").getReturnType();
        System.out.println("returnType.getTypeName() = " + returnType.getTypeName());
    }
}

class Item<T> {

    private T object;

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }
}