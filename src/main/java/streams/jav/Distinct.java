package streams.jav;

import java.util.Arrays;
import java.util.List;

public class Distinct {
    public static void main(String[] args) {
    List<String> list = Arrays.asList("A","B","C","D","E","F","E","F");
    list.stream().distinct().forEach(System.out::println);
    String str = "madam";



    }

}
