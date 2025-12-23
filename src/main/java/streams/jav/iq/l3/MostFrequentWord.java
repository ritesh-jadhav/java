package streams.jav.iq.l3;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MostFrequentWord {
    public static void main(String[] args) {
        String str = "On a quiet afternoon, the city seemed to pause between moments, as if holding its breath. Sunlight slipped through the gaps between buildings, catching dust in the air and turning it into something almost magical. Somewhere in the distance, a horn echoed, reminding everyone that life was still moving forward. People walked past each other with stories they would never share, each step adding to an invisible rhythm that kept the day alive.";

        List<Map.Entry<String, Long>> list = Arrays.stream(
                str.toLowerCase()
                        .replaceAll("[^a-z\\s]", "")
                        .split(" ")
        ).collect(Collectors.groupingBy(
                Function.identity(),
                Collectors.counting()
        )).entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed()).limit(3).toList();
        System.out.println(list);
    }
}
