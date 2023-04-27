package singleton;

import java.io.*;

public class EnumBottleSerializableTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        EnumBottle bottle = EnumBottle.INSTANCE;

        String file = "bottle.obj";

        // 직렬화
        ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
        out.writeObject(bottle);
        out.close();

        // 역직렬화
        ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
        EnumBottle newBottle = (EnumBottle) in.readObject();
        in.close();

        System.out.println("bottle    = " + bottle.hashCode());
        System.out.println("newBottle = " + newBottle.hashCode());
    }
}
