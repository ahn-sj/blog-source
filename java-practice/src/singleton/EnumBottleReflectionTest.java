package singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class EnumBottleReflectionTest {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        EnumBottle bottle = EnumBottle.INSTANCE;

        Constructor<?> bottleConstructor = bottle.getClass().getDeclaredConstructors()[0];
        bottleConstructor.setAccessible(true);
        EnumBottle newBottle = (EnumBottle) bottleConstructor.newInstance();

        System.out.println("getBottle.hashCode() = " + bottle.hashCode());
        System.out.println("newBottle.hashCode() = " + newBottle.hashCode());
    }
}

enum EnumBottle {
    INSTANCE
}
