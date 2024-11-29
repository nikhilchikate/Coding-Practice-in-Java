package collection;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class DemoStreamAPI {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 5, 1, 8);

//        Stream<Integer> s1 = nums.stream();
//        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
//        Stream<Integer> s3 = s2.map(n -> n * 2);
//
//        int res = s3.reduce(0, (c, e) -> c + e);
//        System.out.println(res);

        int res = nums.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .reduce(0, (c, e) -> c + e);

        System.out.println(res);


        //s3.forEach(n -> System.out.println(n));

//        Consumer<Integer> con = new Consumer<Integer>() {
//            @Override
//            public void accept(Integer n) {
//                System.out.println(n);
//            }
//        };

//        Consumer<Integer> con = n -> System.out.println(n); // same above fn using lambda
//
//        nums.forEach(con);

        //nums.forEach(n -> System.out.println(n));

//        // to apply filter
//        int sum = 0;
//        for (int n : nums){
//            if(n%2 == 0) {
//                n *= 2;
//                sum += 1;
//            }
//        }
//
//        System.out.println(sum);

    }
}
