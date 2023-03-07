package generic;

import java.util.ArrayList;
import java.util.List;

// **
public class GenericsExample12 {
    public static void main(String[] args) {
        ShoeBox<Shoe> shoeBox = new ShoeBox<>();
        ShoeBox<Jordon> jordonBox = new ShoeBox<>();
        // ShoeBox<Cap> capBox = new ShoeBox<>();

        shoeBox.add(new Shoe("운동화"));
        jordonBox.add(new Jordon("조던1"));

        Utils.printShoe(shoeBox);
        Utils.printShoe(jordonBox);
    }
}

class Utils {
//    static <T extends Shoe> void printShoe(ShoeBox<T> shoeBox) {
    static void printShoe(ShoeBox<? extends Shoe> shoeBox) {
        StringBuilder sb = new StringBuilder();

        for (Shoe shoe : shoeBox.get()) {
            sb.append(shoe).append(" ");
        }
        System.out.println(sb);
    }
}

class ShoeBox<T extends Shoe> {
    List<T> list = new ArrayList<T>();

    public List<T> get() {
        return this.list;
    }
    public void add(T t) {
        this.list.add(t);
    }
}

class Shoe {
    private String name;

    public Shoe(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Shoe{" +
                "name='" + name + '\'' +
                '}';
    }
}
class Jordon extends Shoe {
    public Jordon(String name) {
        super(name);
    }
}


class AirForce extends Shoe {
    public AirForce(String name) {
        super(name);
    }
}

class Cap {}