package generic;

public class GenericsExample8 {
    public static void main(String[] args) {
        ShoeBox<Jordon> jordonBox = new ShoeBox<Jordon>();
        ShoeBox<AirForce> airForceBox = new ShoeBox<AirForce>();

//        ShoeBox<Cap> capBox = new ShoeBox<Cap>(); // 컴파일 에러

    }
}

//class ShoeBox<T extends Shoe> {
//    private T t;
//
//    public T get() {
//        return t;
//    }
//
//    public void set(T t) {
//        this.t = t;
//    }
//}
//
//class Shoe {}
//class Jordon extends Shoe {}
//class AirForce extends Shoe {}
//
//class Cap {}


