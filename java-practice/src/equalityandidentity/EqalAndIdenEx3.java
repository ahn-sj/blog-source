package equalityandidentity;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class EqalAndIdenEx3 {
    public static void main(String[] args) {
        Set set = new HashSet();

        Disney lionKing1 = new Disney("lion king");
        Disney lionKing2 = new Disney("lion king");

        set.add(lionKing1);
        set.add(lionKing2);

        System.out.println(set);
        System.out.println(lionKing1.equals(lionKing2)); // true
    }
}

class Disney {
    String name;

    public Disney(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        Disney disney = (Disney) o;
        return this.name.equals(disney.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Disney{" +
                "name='" + name + '\'' +
                '}';
    }
}