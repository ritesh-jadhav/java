package streams.jav.iq.l3;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseWord {
    public static void main(String[] args) {
        String input = "!This is 'dummy input!";


        String collect = Arrays.stream(input.toLowerCase()
                        .replaceAll("[^a-z\\s]", "")
                        .split(" "))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));

            System.out.println(collect);
     }
}
