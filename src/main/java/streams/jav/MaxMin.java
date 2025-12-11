package streams.jav;

import java.util.Arrays;
import java.util.List;

public class MaxMin {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        var min = numberList.stream().min(Integer::compareTo).get();
        var max =  numberList.stream().max(Integer::compareTo).get();
        System.out.println(min);
        System.out.println(max);
    }
}


