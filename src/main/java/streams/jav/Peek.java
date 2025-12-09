package streams.jav;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Peek {

    public static void main(String[] args) {

       List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

       List<Integer> squareList = numbers.stream()
               .map(n-> n*n)
               .peek(System.out::println)
               .collect(Collectors.toList());


    }

}
