package streams.jav;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sorted {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 7, 8, 9, 5, 6,3, 4 , 10);
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        List<String> stringList = List.of("Apple","kiwi","Mango","Pineapple","banana");
        stringList.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);
    }
}
