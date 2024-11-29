package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students implements Comparable<Students> {
    int age;
    String name;

    public Students(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int compareTo(Students that) {
        if (this.age > that.age)
            return 1;
        else
            return -1;
    }
}

public class DemoComparable {
    public static void main(String[] args) {

        List<Students> studs = new ArrayList<>();
        studs.add(new Students(25, "Ram"));
        studs.add(new Students(30, "Abhay"));
        studs.add(new Students(24, "Nikhil"));
        studs.add(new Students(18, "Priya"));

        //System.out.println(studs);

        Collections.sort(studs);

        for (Students s : studs)
            System.out.println(s);
    }
}
