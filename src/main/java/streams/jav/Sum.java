package streams.jav;

import java.util.stream.Stream;

public class Sum {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of( 6, 7, 8, 9, 10);
        var res = stream.mapToInt(Integer::intValue).sum();
        System.out.println(res);
    }
}
