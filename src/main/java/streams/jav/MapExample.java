package streams.jav;

import java.util.List;

public class MapExample {
    public static void main(String[] args) {
        List<String> names = List.of("alis","bob","candy");
        names.stream()
                .map((n) -> n.toUpperCase())
                .forEach(System.out::println);

    }
}
