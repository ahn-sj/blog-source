package singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BottleTest {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        callMultiThread();

        // attackReflection();
    }

    private static void attackReflection() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Bottle getBottle = Bottle.getInstance();

        Constructor<? extends Bottle> bottleConstructor = getBottle.getClass().getDeclaredConstructor();
        bottleConstructor.setAccessible(true);

        Bottle newBottle = bottleConstructor.newInstance();

        System.out.println("getBottle.hashCode() = " + getBottle.hashCode());
        System.out.println("newBottle.hashCode() = " + newBottle.hashCode());
    }

    private static void callMultiThread() {
        Runnable runnable = new Creator();

        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
    }
}

class Creator implements Runnable {
    @Override
    public void run() {
        System.out.println("Bottle.hashCode = " + Bottle.getInstance().hashCode());
    }
}

class Bottle {
    private static class HolderBottle {
        private static Bottle instance = new Bottle();
    }

    private Bottle() {}

    public static Bottle getInstance() {
        return HolderBottle.instance;
    }
}