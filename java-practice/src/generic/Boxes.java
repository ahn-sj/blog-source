package generic;

import java.util.ArrayList;

public class Boxes {
    public static void main(String[] args) {

        Box<Toy> toyBox = new Box<>();       // OK
//        Box<Animal> animalBox = new Box<>(); // ERROR
//        Box<Car> carBox = new Box<>();       // ERROR
    }
}

class Toy {
}
class RobotToy extends Toy {}

class Animal {}
class Car {}

class Box<T extends Toy> {
    ArrayList<T> list = new ArrayList<>();

    void add(T item) {
        list.add(item);
    }

    T get(int i) {
        return list.get(i);
    }

    ArrayList<T> getList() {
        return list;
    }

    int size() {
        return list.size();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}