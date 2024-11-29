package collection;

import java.util.*;

class Student{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
public class DemoComparator {
    public static void main(String[] args) {

//        Comparator<Student> com= new Comparator<Student>(){
//            public int compare(Student i, Student j){
//                if(i.age > j.age)
//                    return 1;
//                else
//                    return -1;
//            }
//        };

        Comparator<Student> com = (i, j) -> i.age > j.age ? 1: -1; // above function using lambda

        List<Student> studs = new ArrayList<>();
        studs.add(new Student(25, "Ram"));
        studs.add(new Student(30, "Abhay"));
        studs.add(new Student(24, "Nikhil"));
        studs.add(new Student(18, "Priya"));

        //System.out.println(studs);

        Collections.sort(studs, com);

        for(Student s: studs)
            System.out.println(s);
    }
}
