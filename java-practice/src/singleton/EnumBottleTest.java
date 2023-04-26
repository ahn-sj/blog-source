package singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class EnumBottleTest {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {

        EnumBottle bottle = EnumBottle.INSTANCE;

        Constructor<?>[] bottleConstructors = bottle.getClass().getDeclaredConstructors();
//        Constructor<? extends Bottl> bottleConstructor = bottl.getClass().getDeclaredConstructor();

        for (Constructor<?> bottleConstructor : bottleConstructors) {
            bottleConstructor.setAccessible(true);

            // IllegalArgumentException: Cannot reflectively create enum objects
            EnumBottle newBottle = (EnumBottle) bottleConstructor.newInstance();

            System.out.println("getBottle.hashCode() = " + bottle.hashCode());
            System.out.println("newBottle.hashCode() = " + newBottle.hashCode());
        }
    }
}

enum EnumBottle {
    INSTANCE
}
