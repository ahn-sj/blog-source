package generic;

/**
 * 배열은 공변
 *
 * Sub가 Super의 하위 타입이면,
 * 배열 Sub[] 은 배열 Super[]의 하위 타입이다.
 * (다형성의 이점을 가짐)
 */
public class ConvariantTest {
    public static void main(String[] args) {
        // Object > Number > Long

        Object[] objects = new Long[1];
        objects[0] = "Hello"; // 런타임 에러
        // java.lang.ArrayStoreException: java.lang.String
    }
}
