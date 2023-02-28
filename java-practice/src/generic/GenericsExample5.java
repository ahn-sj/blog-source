package generic;

public class GenericsExample5 {
    public static void main(String[] args) {
//        Category<Computer> computerCategory = new Category<>();
//        computerCategory.set(new Computer());
//        computerCategory.printClassName(new Food());

//        Category<Toy> toyCategory = new Category<>(); // ????
    }
}

class Computer {}
class Food {}

class Toy{}

//class Category<T> {
//    private T t;
//
//    public void set(T t) {
//        this.t = t;
//    }
//
//    public T get() {
//        return t;
//    }
//
//    public <T> void printClassName(T t) {
//        System.out.println("클래스 필드에 정의된 타입          = " + this.t.getClass().getName());
//        System.out.println("제네릭 메서드 매개변수에 정의된 타입 = " + t.getClass().getName());
//    }
//}

