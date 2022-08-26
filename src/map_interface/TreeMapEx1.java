package map_interface;


import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapEx1 {
    public static void main(String[] args) {
        TreeMap<Double,Student> treeMap = new TreeMap<>();

        Student st1 = new Student("Stanislaw","Shukan",2);
        Student st2 = new Student("Ksuysha","Aristova",1);
        Student st3 = new Student("Karina","Lemeshevskaya",2);
        Student st4 = new Student("Igor","Sidorov",2);
        Student st5 = new Student("Vasiliy","Smirnoff",1);
        Student st6 = new Student("Alexander","Kapustin",3);
        Student st7 = new Student("Elena","Sidorova",4);
        //Student st8 = new Student("Elena","Sidorova",4);
        //Student st8 = new Student("Petr","Sidorov",4);

        treeMap.put(5.8,st1);
        treeMap.put(6.4,st2);
        treeMap.put(7.2,st3);
        treeMap.put(7.5,st4);
        treeMap.put(7.9,st5);
        treeMap.put(8.2,st6);
        treeMap.put(9.1,st7);


        System.out.println(treeMap);

//        System.out.println(treeMap.get(6.4));
//
//        treeMap.remove(5.8);
//
//        System.out.println(treeMap);
//
//        System.out.println(treeMap.descendingMap());
//
//        System.out.println(treeMap.tailMap(7.2));
//
//        System.out.println(treeMap.headMap(7.3));
//
//        System.out.println(treeMap.lastEntry());
//
//        System.out.println(treeMap.firstEntry());

//        System.out.println(treeMap.containsKey(st8));



    }
}
