package singleton;

public class EnumBottleTest {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("EnumBottle.hashCode = " + EnumBottle.INSTANCE.hashCode());
        };

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
