package streams.jav.iq.l2;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOfEachElement {
    public static void main(String[] args) {
    List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,8, 9, 10,5, 6, 7, 8,1 );

    List<String> stringList = List.of("apple","orange","banana", "apple","orange","banana","mango");
        Map<Integer, Long> collect = list.stream()
                .collect(Collectors.groupingBy(
                        p -> p,
                        Collectors.counting()
                ));
        Map<String, Long> collect1 = stringList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect1);
    }
}
