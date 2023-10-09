package task2;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Integer[] integers = new Integer[]{1,40,3,234,23,6,65,8,9,10,11,12,4,14,15,6,17,8,100,20};

        List<Integer> sorted = Arrays.stream(integers).sorted(Comparator.comparing(i -> i)).collect(Collectors.toList());
        System.out.println("Sorted array:");
        System.out.println(sorted);


        List<Integer> modalDivide3 = Arrays.stream(integers).filter(i->i%3==0).collect(Collectors.toList());
        System.out.println("Modal divide 3 array:");
        System.out.println(modalDivide3);
        List<Integer> modalDivide10 = Arrays.stream(integers).filter(i -> i % 10 == 0).collect(Collectors.toList());
        System.out.println("Modal divide 10 array:");
        System.out.println(modalDivide10);
        List<Integer> collect = Arrays.stream(integers).collect(Collectors.toList());
        System.out.println(".foreach() method:");
        collect.forEach(i-> System.out.print(i+", "));
        System.out.println();
        List<Integer> mappedCollect = Arrays.stream(integers).map(integer -> integer * 3).collect(Collectors.toList());
        System.out.println("Mapped array:");
        System.out.println(mappedCollect);

    }
}
