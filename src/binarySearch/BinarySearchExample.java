package binarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BinarySearchExample {
    public static void main(String[] args) {



        Employee emp1 = new Employee("Stanislaw", 2000.5, 1);
        Employee emp2 = new Employee("Mark", 1678.3, 2);
        Employee emp3 = new Employee("Pavel", 1972.4, 3);
        Employee emp4 = new Employee("Ksu", 1500, 4);
        Employee emp5 = new Employee("Karina", 2000, 5);
        Employee emp6 = new Employee("Artem", 1400, 6);
        Employee emp7 = new Employee("Vitaliy", 1563.7, 7);


        ArrayList<Employee> list = new ArrayList<>();

        BinarySearchExample.addToArrayList(list,emp1);
        BinarySearchExample.addToArrayList(list,emp2);
        BinarySearchExample.addToArrayList(list,emp3);
        BinarySearchExample.addToArrayList(list,emp4);
        BinarySearchExample.addToArrayList(list,emp5);
        BinarySearchExample.addToArrayList(list,emp6);
        BinarySearchExample.addToArrayList(list,emp7);


        Collections.sort(list);

        BinarySearchExample.showArrayList(list);

        int index = Collections.binarySearch(list,new Employee("Ksu", 1500, 4));

        System.out.println(index);

        int [] array = {-3,8,12,-8,0,5,10,1,150,-30,19};
        System.out.println(Arrays.toString(array));

        Arrays.sort(array);

        System.out.println(Arrays.toString(array));

        System.out.println(Arrays.binarySearch(array,150));

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(8);
        list1.add(3);
        list1.add(-19);
        list1.add(32);
        list1.add(12);
        list1.add(-7);

        Collections.sort(list1);
        System.out.println(list1);

        //элементы с конца в начало(реверс)
        Collections.reverse(list1);
        System.out.println(list1);

        // элементы перемешиваются беспорядочно
        Collections.shuffle(list1);
        System.out.println(list1);

    }




    public static <T> void addToArrayList(ArrayList<T> list, T element){
        list.add(element);
    }

    public static <T> void showArrayList(ArrayList<T>list){

        for(T element : list){
            System.out.println(element);
        }
    }
    }

    class Employee implements Comparable<Employee>{
        private String name;
        private double salary;
        private int id;

        public int getId(){
            return id;

        }

        public double getSalary(){
            return salary;

        }

        public String getName() {
            return name;
        }

        public Employee(String name,double salary,int id){
            this.name = name;
            this.salary = salary;
            this.id = id;
        }

        public String toString(){
            return "Employee: name " + name + ", salary" +
                    salary + ", id " + id;

        }



        public int compareTo(Employee emp) {
            int result  = this.name.compareTo(emp.name);
            return result;
        }

    }


