package uml;

public class User {
    private int age;
    private String name;

    public static boolean isBorn = true;
    private final Country birthplace = Country.KOREA;

    public void introduce() {
        System.out.println("나의 이름은 " + name + "이고, 나이는 " + age + " 이야.");
        System.out.println("출생지는 " + birthplace + "이고, 나는 살아있어 = " + isBorn);
    }
}

enum Country {
    KOREA;
}