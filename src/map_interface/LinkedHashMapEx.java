package map_interface;

import java.util.LinkedHashMap;

public class LinkedHashMapEx {
    public static void main(String[] args) {

        LinkedHashMap<Double,Student> lhm = new LinkedHashMap<>(16,0.75f,true);
        Student st1 = new Student("Stanislaw","Shukan",2);
        Student st2 = new Student("Ksuysha","Aristova",1);
        Student st3 = new Student("Karina","Lemeshevskaya",2);
        Student st4 = new Student("Igor","Sidorov",2);



        lhm.put(5.8,st1);
        lhm.put(6.4,st2);
        lhm.put(7.2,st3);
        lhm.put(7.5,st4);

        System.out.println(lhm);

        System.out.println(lhm.get(5.8));
        System.out.println(lhm.get(7.5));

        System.out.println(lhm);
    }
}
