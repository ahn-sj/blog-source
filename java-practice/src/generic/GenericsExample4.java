package generic;

import java.util.ArrayList;

public class GenericsExample4 {
    public static void main(String[] args) {

        Number[] numbers = new Number[4];

        numbers[0] = new Byte((byte) 0);
        numbers[1] = new Integer(1);
        numbers[2] = new Long(2L);
        numbers[3] = new Double(3.3);

        Integer[] ints = {1, 2, 3, 4};
        numbers = ints; // OK

        Box<Unit> units = new Box<Unit>();
        Box<GroundUnit> groundUnits = new Box<GroundUnit>();
        Box<Marin> marins = new Box<Marin>();

        Box<? extends GroundUnit> upperBoundedGroundUnits = new Box<GroundUnit>();
        Box<? super GroundUnit> lowerBoundedGroundUnits = new Box<GroundUnit>();

//        groundUnits = units;
//        groundUnits = marins;

        upperBoundedGroundUnits = marins;
        lowerBoundedGroundUnits = units;



    }
}

//class Box<T> {}

class Unit {}
class GroundUnit extends Unit {}
class Marin extends GroundUnit {}

class A {}
class B extends A{}