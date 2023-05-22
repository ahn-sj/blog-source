package firstclasscollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MutableMain {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("감자", "당근");
        List<String> mutableList = Collections.unmodifiableList(new ArrayList<>(list));

        mutableList.add("감자");
        mutableList.remove(0);

        mutableList = Arrays.asList("휴대폰", "TV");
        System.out.println("mutableList = " + mutableList);


    }
}

