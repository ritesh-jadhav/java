package streams.jav.devoxx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class LambdaEx {
    public static void main(String[] args) {

//        Thread thread = new Thread( () -> System.out.println("Inside Another"));
//        thread.start();
//        System.out.println("Inside main");

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

//  External iterator -> full controls

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

//  External iterator also

//        for (Integer integer : list) {
//            System.out.println(integer);
//        }

//  Internal iterator -> instead of passing collection, iterate over it

//  list.forEach( System.out::println);

        var res = list.stream()
                .filter(e -> e % 2 == 0)
                .map(e -> e * e)
                .reduce(0, Integer::sum);

        System.out.println(res);

    }
}
