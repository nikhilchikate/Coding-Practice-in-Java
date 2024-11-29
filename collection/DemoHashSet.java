package collection;

import java.util.HashSet;
import java.util.Set;

public class DemoHashSet {
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<>();
        nums.add(101);
        nums.add(89);
        nums.add(66);
        nums.add(33);
        nums.add(55);
        //nums.add(2); // cant add duplicate elements

        //System.out.println(nums);

        for(Object n : nums){
            System.out.println(n); // values are not sorted
        }
    }
}
