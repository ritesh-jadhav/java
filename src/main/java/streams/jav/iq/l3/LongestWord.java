package streams.jav.iq.l3;

// Find the longest word in a sentence ignoring case and punctuation

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class LongestWord {
    public static void main(String[] args) {

     String input = "Hey world it's another, new time year! to celebrate";
        String max = Arrays.stream(
                input.toLowerCase()
                        .replaceAll("[^a-zA-Z ]", "")
                        .split(" ")
        ).max(Comparator.comparing(String::length)).orElse("NOT VALID ERROR");

        System.out.println(max);
    }

}
