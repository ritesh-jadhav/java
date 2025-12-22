package streams.jav.iq.l3;

// Given a list of integers calculate the sum of every four element using sliding window
/*

        2 + 34 + 34 + (-2) = 68
        34 + 34 + (-2) + (-5) = 61
        34 + (-2) + (-5) + 58 = 85
        -2 + (-5) + 58 + 12 = 63
        -5 + 58 + 12 + (-4) = 61
        58 + 12 + (-4) + 0 = 66
        12 + (-4) + 0 + 3 = 11

        [68, 61, 85, 63, 61, 66, 11]
*/

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SumOf4ElementSlidingWindow {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 34, 34, -2, -5, 58, 12, -4, 0, 3);
        int windowSize = 4;
        // IntStream.range(0, n - k + 1)
        //
        List<Integer> list1 = IntStream.range(0, list.size() - windowSize + 1)
                .mapToObj(i ->
                        IntStream.range(0, windowSize)
                                .map(j -> list.get(i + j))
                                .sum()
                )
                .toList();

        System.out.println(list1);
    }

}
