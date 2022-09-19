import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,23,6,0,12,123,6,5,1,99,3,4,1,2);

        Integer sum = list.stream().mapToInt(Integer::intValue).sum();

        double arithmeticMean = list.stream().mapToDouble(d -> d).average().orElse(0.0);

        Set<Integer> items = list.stream().filter(i -> Collections.frequency(list, i) > 1)
                .collect(Collectors.toSet());


        System.out.println("Sum: "+sum);
        System.out.printf("Arithmetic mean: %.2f", arithmeticMean);
        System.out.print("\nDuplicate numbers: ");
        items.forEach(x -> System.out.print(x+ ", "));
        System.out.println();
        System.out.println();

    }
}