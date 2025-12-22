package streams.jav.iq.l3;

// Given a list of integer, compute the average of every 3-element sliding window

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// 1-2-3 = 6
// 2-3-4 = 9
// 3-4-5 = 12
// 4-5-6 = 15

public class AvgOf3Element {

    public static void main(String[] args) {
        // n = 5 -3 = 2
        // 3 element = n - 2
        List<Integer> list = Arrays.asList(4,8,15,16,23,42);
        List<Double> avg = IntStream.range(0, list.size() - 2)
                .mapToObj(i -> Double.valueOf((double) (list.get(i) + list.get(i + 1) + list.get(i + 2)) / 3)).toList();

        System.out.println(avg);


    }


}
