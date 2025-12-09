package streams.jav;

import java.util.Arrays;
import java.util.List;

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
           Integer sum = list.stream()
                .reduce(0, Integer::sum);
            System.out.println(sum);

    }

}
