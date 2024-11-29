package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class DemoMap {
    public static void main(String[] args) {
        Map<String,Integer> students = new HashMap<>();
        students.put("Nikhil", 101);
        students.put("Abhi", 102);
        students.put("Ramesh", 103);
        students.put("Amol", 104);
        students.put("Suresh", 105);

        System.out.println(students);

        for (String key : students.keySet())
            System.out.println(key + " has id : " + students.get(key));
    }
}
