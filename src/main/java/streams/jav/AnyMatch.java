package streams.jav;

import java.util.stream.Stream;

public class AnyMatch {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        var res = stream.anyMatch(x -> x==10);
        System.out.println(res);
    }
}
