package streams.jav.iq.l2.intermediate;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MostFrequentChar {
    // Most frequent character in the steam
    public static void main(String[] args) {
        String str = "banana";
        Optional<Map.Entry<Character, Long>> max = str.chars().mapToObj(i -> (char) i).collect(
                        Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting())).entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());

        max.ifPresent(entry ->
                System.out.println(entry.getKey())
        );

    }
}
