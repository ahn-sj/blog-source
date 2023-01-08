package equalityandidentity;

public class EqalAndIdenEx2 {
    public static void main(String[] args) {

        String jae1 = "jae";
        String jae2 = "jae";
        String newJae = new String("jae");
        System.out.println(jae1 == jae2);   // 0x100 == 0x100 >> true
        System.out.println(jae1 == newJae); // 0x100 == 0x200 >> false

        Person mum1 = new Person("mum");
        Person mum2 = new Person("mum");

        System.out.println(mum1 == mum2); // 0x101 == 0x201 >> false

    }
}

class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }
}

