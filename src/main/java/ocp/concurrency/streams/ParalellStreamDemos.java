package ocp.concurrency.streams;

import java.util.Arrays;

public class ParalellStreamDemos {
    public static void main(String[] args) {
        System.out.println("normal");
        Arrays.asList(1,2,3,4,5,6)
                .stream()
                .forEach(s -> System.out.print(s+" "));

        System.out.println();
        System.out.println("----------------");
        System.out.println("parallel");
        Arrays.asList(1,2,3,4,5,6)
                .parallelStream()
                .forEach(s -> System.out.print(s+" "));

        System.out.println();
        System.out.println("----------------");
        System.out.println("ordered foreach");
        Arrays.asList(1,2,3,4,5,6)
                .parallelStream()
                .forEachOrdered(s -> System.out.print(s+" "));
    }
}
