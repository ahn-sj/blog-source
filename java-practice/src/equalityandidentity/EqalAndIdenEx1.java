package equalityandidentity;

public class EqalAndIdenEx1 {
    public static void main(String[] args) {

        boolean isTrue = true;
        boolean isFalse = false;

        System.out.println(isTrue == isFalse); // true == false >> false
        System.out.println(isTrue == true);    // true == true >> true

        int zero = 0;
        int one = 1;

        System.out.println(zero == one); // 0 == 1 >> false
        System.out.println(zero == 0);   // 1 == 1 >> true
    }
}
