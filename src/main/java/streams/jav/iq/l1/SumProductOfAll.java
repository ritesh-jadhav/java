package streams.jav.iq.l1;

import java.util.stream.Stream;

public class SumProductOfAll {
    public static void main(String[] args) {
        Integer reduce = Stream.iterate(1, i -> i + 1)
                .limit(20)
                .map(i -> i * i)
                .reduce(0, Integer::sum);
        System.out.println(reduce);
        EvenListSum();
        squareSumOfEvenList();
    }

    public static void EvenListSum(){
        Stream.iterate(1, i -> i + 1)
                .limit(10)
                .filter(i -> i % 2 == 0)
                .max(Integer::compareTo)
            .ifPresent(System.out::println);
    }
    public static void squareSumOfEvenList(){
        Integer reduce = Stream.iterate(1, i -> i + 1)
                .limit(20)
                .filter(i -> i % 2 == 0)
                .map(i -> i * i)
                .reduce(0, Integer::sum);
        System.out.println(reduce);
    }
}
