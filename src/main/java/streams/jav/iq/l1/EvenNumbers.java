package streams.jav.iq.l1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenNumbers {

    public static void main(String[] args) {
    List<Integer> list =  Stream.iterate(0, i -> i + 1)
                .limit(40)
                .filter(i -> i % 2 == 0)
                .toList();
    list.forEach(System.out::println);


    }
}
