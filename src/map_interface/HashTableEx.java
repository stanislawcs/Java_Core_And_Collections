package map_interface;

import java.util.Hashtable;

public class HashTableEx {
    public static void main(String[] args) {
        Hashtable<Double,Student> ht = new Hashtable<>();

        Student st1 = new Student("Stanislaw","Shukan",2);
        Student st2 = new Student("Ksuysha","Aristova",1);
        Student st3 = new Student("Karina","Lemeshevskaya",2);
        Student st4 = new Student("Igor","Sidorov",2);

        ht.put(7.8,st1);
        ht.put(9.3,st2);
        ht.put(5.8,st3);
        ht.put(6.0,st4);


        System.out.println(ht);


    }
}
