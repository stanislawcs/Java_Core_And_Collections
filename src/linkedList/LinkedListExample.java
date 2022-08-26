package linkedList;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        Student2 st1 = new Student2("Anton",4);
        Student2 st2 = new Student2("Stanislaw",2);
        Student2 st3 = new Student2("Carina",2);
        Student2 st4 = new Student2("Ksuysha",3);
        Student2 st5 = new Student2("Ivan",1);

        System.out.println(st1.getName());
        LinkedList<Student2> student2LinkedList = new LinkedList<>();
        student2LinkedList.add(st1);
        student2LinkedList.add(st2);
        student2LinkedList.add(st3);
        student2LinkedList.add(st4);
        student2LinkedList.add(st5);

        System.out.println("LinkedList = " + student2LinkedList);

        System.out.println(student2LinkedList.get(2));

        Student2 st6 = new Student2("Zaur",4);
        Student2 st7 = new Student2("Igor",2);

        student2LinkedList.add(st6);

        System.out.println("LinkedList = " + student2LinkedList);

        System.out.println(st6);



    }

}
class Student2{
    String name;
    int course;

    public Student2(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String toString(){
        return "Student : name " + name +
                ", course " + course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
}