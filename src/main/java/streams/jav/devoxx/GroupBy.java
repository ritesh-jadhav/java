package streams.jav.devoxx;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class GroupBy {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,12,23,12,32,43,4);
        Optional<Integer> first = list.stream()
                .filter(e -> e <= 10)
                .filter(x -> x % 2 == 0)
                .map(x -> x * x)
                .findFirst();
        System.out.println(first);

    String str = "abcde";

    }
}
