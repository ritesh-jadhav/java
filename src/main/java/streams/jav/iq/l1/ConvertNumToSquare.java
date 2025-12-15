package streams.jav.iq.l1;

import java.util.stream.Stream;

public class ConvertNumToSquare {
    public static void main(String[] args) {
    //    Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).map(i -> i * i).forEach(System.out::println);

    //only even
        Stream.iterate(1, i -> i + 1)
                .limit(10)
                .filter(i -> i % 2 == 0)
                .map(i -> i * i)
                .forEach(System.out::println);
         }
}
