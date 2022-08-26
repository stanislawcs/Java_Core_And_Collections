package map_interface;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeEx1 {
    public static void main(String[] args) {
        Map<Student,Double> map = new HashMap<>();

        Student st1 = new Student("Stanislaw","Shukan",2);
        Student st2 = new Student("Ksuysha","Aristova",1);
        Student st3 = new Student("Karina","Lemeshevskaya",2);

        map.put(st1,7.1);
        map.put(st2,8.0);
        map.put(st3,8.3);

        System.out.println(map);

        Student st4 = new Student("Stanislaw","Shukan",2);
        Student st5 = new Student("Igoraz","Sidorov",4);

//        boolean result = map.containsKey(st4);
//
//        System.out.println("result = " + result);
//

        System.out.println(st1.hashCode());
        System.out.println(st4.hashCode());
        System.out.println(st5.hashCode());

        for(Map.Entry<Student,Double> entry : map.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }

}

class Student implements Comparable<Student>{
    private String name;
    private String surname;
    private int course;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int compareTo(Student st){
        return this.name.compareTo(st.name);

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,surname,course);
    }
}
