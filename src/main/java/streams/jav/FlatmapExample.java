package streams.jav;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class FlatmapExample {
    public static void main(String[] args) {

        List<List<String>> listOfList = List.of(
                Arrays.asList("A","B"),
                Arrays.asList("C","D"),
                Arrays.asList("E","F")
        );
    System.out.println(listOfList);
        listOfList.stream().
            flatMap(Collection::stream)
                .map(String::toLowerCase)
                .forEach(System.out::println);

    }

}
