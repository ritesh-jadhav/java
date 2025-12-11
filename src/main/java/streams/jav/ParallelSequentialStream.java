package streams.jav;

import java.util.Arrays;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class ParallelSequentialStream {
    // stream creation
    // dummy data insertion
    public static void main(String[] args) {
        long[] arr = new long[2000];
        for (int i = 0 ; i < arr.length ; i++) {
            arr[i] = i+1;
        }
        //calculate sum of factorial using sequential stream
        long startTime = System.currentTimeMillis();
        long sequentialStream = Arrays.stream(arr)
                .map(ParallelSequentialStream::factorial)
                .sum();
        long endTime = System.currentTimeMillis();
        System.out.println("startTime :: "+startTime);
        System.out.println("endTime :: "+endTime);
        System.out.println("sequentialStream result:: "+sequentialStream);

        //calculate sum of factorial using parallel stream
        long startTimeParallel = System.currentTimeMillis();
        long parallelStream = Arrays.stream(arr)
                .parallel()
                .map(ParallelSequentialStream::factorial)
                .sum();
        long endTimeParallel = System.currentTimeMillis();
        System.out.println("startTimeParallel:: "+startTimeParallel);
        System.out.println("endTimeParallel :: "+endTimeParallel);
    }


    public static long factorial(long number)
    {
        return LongStream.rangeClosed(1,number)
                .reduce(1,(long a, long b) -> a*b);
    }

}
