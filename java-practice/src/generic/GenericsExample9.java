package generic;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample9 {
    public static void main(String[] args) {
//        FruitBox<Fruit> fruitBox = new FruitBox<>();
//        FruitBox<Apple> appleBox = new FruitBox<>();
//
//        System.out.println(Juicer.makeJuice(fruitBox));
//        System.out.println(Juicer.makeJuice(appleBox));
    }
}

class Juicer {
//    static <T extends Fruit> Juice makeJuice(FruitBox<T> box) {
//        return new Juice("juice");
//    }
}

class Fruit {}
class Apple extends Fruit {}

//class FruitBox<T extends Fruit> extends Box<T> {}
class Juice {
    String name;

    public Juice(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Juice{" +
                "name='" + name + '\'' +
                '}';
    }
}

//
//class AdeUtil<T> {
//    public static Item buyItem(T items) {
//        StringBuilder sb = new StringBuilder();
//
//        for (T t : items.get()) {
//            sb.append(t + " ");
//        }
//        return new Item(sb + "");
//    }
//
////    public static Bike buyItem(Category<Bike> bikes) {
////        StringBuilder sb = new StringBuilder();
////
////        for (Bike bike : bikes.get()) {
////            sb.append(bike + " ");
////        }
////        return new Bike(sb + "");
////    }
//}
//
//class Item {
//    private String kind;
//
//    public Item(String kind) {
//        this.kind = kind;
//    }
//}
//
//class Car {
//    private String kind;
//
//    public Car(String kind) {
//        this.kind = kind;
//    }
//}
//class Bike {
//    private String kind;
//
//    public Bike(String kind) {
//        this.kind = kind;
//    }
//}
//
//class Category<T> {
//    List<T> items = new ArrayList<>();
//
//    public List<T> get() {
//        return items;
//    }
//}
//
