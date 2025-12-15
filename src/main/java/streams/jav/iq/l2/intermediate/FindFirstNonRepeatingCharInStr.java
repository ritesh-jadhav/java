package streams.jav.iq.l2.intermediate;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatingCharInStr {
    public static void main(String[] args) {
        String str = "I am the one who wrote the code";
        Optional<Map.Entry<Character, Long>> collect = str.chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                )).entrySet().stream().filter(i -> i.getValue() == 1).findFirst();


        System.out.println(collect);
    }
}
