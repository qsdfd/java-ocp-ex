package ocp.concurrency.streams;

import java.util.Arrays;

public class ReduceDemo {
    public static void main(String[] args) {
        System.out.println(Arrays.asList('w', 'o', 'l', 'f')
                .stream()
                .reduce("",(c,s1) -> c + s1,
                        (s2,s3) -> s2 + s3));
    }
}
