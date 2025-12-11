package streams.jav.devoxx;

import java.util.Arrays;
import java.util.List;

public class Streams {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(23, 43, 65, 89, 61, 13, 23, 21, 1, 27, 22, 78, 10, 8);

        var res = list.stream().filter(x -> x % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println(res);
    }
}
