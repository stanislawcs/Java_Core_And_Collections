package map_interface;

import java.util.HashMap;

public class HashMapEx1 {
    public static void main(String[] args) {
        HashMap<Integer,String> map1 = new HashMap<>();

        map1.put(1000,"Stanislaw Shukan");
        map1.put(3568,"Mark Volkonovski");
        map1.put(6578,"Pavel Mikhno");
        map1.put(5897,"Karina Lemeshevskaya");
        map1.putIfAbsent(5897,"Ksuysha Levitskaya");


        System.out.println(map1);

        System.out.println(map1.get(5897));

        map1.remove(6578);

        System.out.println(map1);

        boolean result = map1.containsValue("Stanislaw Shukan");

        System.out.println(result);

        result = map1.containsKey(500);

        System.out.println(result);

        System.out.println(map1.keySet());

        System.out.println(map1.values());



    }
}
