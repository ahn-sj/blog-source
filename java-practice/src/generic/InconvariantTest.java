package generic;

import java.util.ArrayList;
import java.util.List;

/**
 * 제네릭은 불공변
 *
 * 서로 다른 타입 T1과 T2가 존재한다면,
 * List<T1>은 List<T2>의 하위 타입도, 상위 타입도 아니다.
 * 다시 말해, List<T1>과 List<T2>는 서로 다르다.
 */

/**
 * Q. 다형성을 포기하면서 왜 이러한 특징(불공변)으로 제네릭이 만들어졌는가?
 * A. 타입 안전성에 대한 문제를 해결하기 위함
 */
public class InconvariantTest {
    public static void main(String[] args) {
        List<Object> ol = new ArrayList<Long>(); // 컴파일 에러
        ol.add("Hello");

        // why use Inconvariant
        List<Dog> dogs = new ArrayList<>();
        List<Animal> animals = dogs; // 불공변이므로 컴파일 에러 발생
        animals.add(new Cat());
        Dog dog = dogs.get(0);

    }

    class Animal {}
    class Dog extends Animal {}
    class Cat extends Animal {}
}