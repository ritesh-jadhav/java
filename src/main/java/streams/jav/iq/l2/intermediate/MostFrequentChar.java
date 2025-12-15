package streams.jav.iq.l2.intermediate;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MostFrequentChar {
    // Most frequent character in the steam
    public static void main(String[] args) {
        String str = "banana";
        Map<Character, Long> collect = str.chars().mapToObj(i -> (char) i).collect(
                Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()

                )
        );
        System.out.println(collect);

        collect.forEach((key, value) -> {
            System.out.println(key + " : " + value);
        });





    }
}
