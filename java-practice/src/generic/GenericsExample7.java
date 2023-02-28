package generic;

public class GenericsExample7 {
    public static void main(String[] args) {
//        popBook();
//        pushBook();
    }

//    private static void pushBook(Category<? super Book> category) {
//        category.set(new Book());
//        Book book = category.get();
//    }

    // 상한 제한
//    private static void popBook(Category<? extends Book> category) {
//        Book book = category.get();
//        category.set(new Book());
//    }
}

class Book {}

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
//}