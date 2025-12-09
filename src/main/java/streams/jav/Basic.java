package streams.jav;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Basic {

    public static void main(String[] args) {
        System.out.println("Hello World");
        // 1. list -> stream
        List<String> names = Arrays.asList("Bob","Michel");
        Stream<String> stream = names.stream();
        stream.forEach(System.out::println);
        // 2. arr -> stream
        String[] arr = {"John","Smith","Mathew"} ;  //arr strict type with same type of element
        Stream<String> arrStream = Arrays.stream(arr);
        arrStream.forEach(System.out::println);
        // 3. stream of
        Stream.of(arr).forEach(System.out::println);
        Stream.of(names).forEach(System.out::println);
        Stream.of(1,2,3,"sa").forEach(System.out::println); // return Stream<Object>
        // 4. generate
        Stream.generate(Math::random).limit(5).forEach(System.out::println);

    }

}

/**
 * 🔥 Key Differences
 * Feature      Array	        Stream
 * Type         Homogeneous	    Can be mixed if Stream<Object>
 * Size	        Fixed           Not stored (computed on demand)
 * Purpose	    Store data	    Process data
 * Operations	Basic loops	    Rich functional operations
 * Evaluation	Eager	        Lazy
 * */
