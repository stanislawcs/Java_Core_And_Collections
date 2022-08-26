package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Stanislaw");
        list.add("Mark");

        GenericsExample.myMethod(list);

        List<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);


        GenericsExample.myMethod(list1);

    }

    public static <T> void myMethod(List<T> list) {
        for (T list1 : list) {
            System.out.println(list1);
        }
    }
}
