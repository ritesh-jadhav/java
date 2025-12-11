package streams.jav;

import java.util.stream.Stream;

public class Count {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of( 6, 7, 8, 9, 10);
        System.out.println(stream.count());
    }
}
