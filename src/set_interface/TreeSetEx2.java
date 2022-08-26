package set_interface;

import java.util.Objects;
import java.util.TreeSet;

public class TreeSetEx2 {
    public static void main(String[] args) {

        TreeSet<Student> ts = new TreeSet<>();
        Student st1 = new Student("Zaur",5);
        Student st2 = new Student("Misha",1);
        Student st3 = new Student("Igor",2);
        Student st4 = new Student("Marina",3);
        Student st5 = new Student("Olya",4);

        ts.add(st1);
        ts.add(st2);
        ts.add(st3);
        ts.add(st4);
        ts.add(st5);

        System.out.println(ts);

        System.out.println(ts.first());

        System.out.println(ts.last());

//        System.out.println(ts.headSet(st6));
//
//        System.out.println(ts.tailSet(st6));

        Student st6 = new Student("Oleg",2);
        Student st7 = new Student("Ivan",4);

        System.out.println(ts.subSet(st6,st7));


    }


}

class Student implements Comparable<Student>{
    private String name;
    private int course;

    public Student(String name,int course){
        this.name = name;
        this.course = course;

    }

    public String getName(){
        return name;

    }

    public void setName(String name){
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int compareTo(Student st){
        int result = this.course - st.course;
        if(result==0){
            result = this.name.compareTo(st.name);
        }
        return result;

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course);
    }
}
