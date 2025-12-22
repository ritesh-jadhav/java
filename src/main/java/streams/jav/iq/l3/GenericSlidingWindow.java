package streams.jav.iq.l3;

import java.util.*;
import java.util.stream.IntStream;

public class GenericSlidingWindow {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,8,15,16,23,42,23,11);
        int windowSize = 3;
        List<Integer> list1 = IntStream.range(0, (list.size() - windowSize + 1))
                .mapToObj(i -> list.subList(i, i + windowSize))
                .map(
                        window -> window.stream().
                                mapToInt(Integer::intValue)
                                .sum()
                ).toList();
        System.out.println(list1);
    }


}
