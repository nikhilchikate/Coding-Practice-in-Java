package collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class DemoIterator {
    public static void main(String[] args) {
        Set<Integer> nums = new TreeSet<>();
        nums.add(101);
        nums.add(89);
        nums.add(66);
        nums.add(33);
        nums.add(55);

        Iterator<Integer> it = nums.iterator();

        while(it.hasNext())
            System.out.println(it.next());

    }
}
