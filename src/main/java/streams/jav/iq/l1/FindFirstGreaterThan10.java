package streams.jav.iq.l1;

import java.util.Arrays;
import java.util.List;

public class FindFirstGreaterThan10 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,23,12,10,21,17,6,7,90);
//        list.stream()
//                .filter(e -> e > 10 )
//                .findFirst()
//                .ifPresent(System.out::println);
//

        long count = list.stream()
                .filter(i -> i > 10)
                .count();
        System.out.println(count);




    }
}

