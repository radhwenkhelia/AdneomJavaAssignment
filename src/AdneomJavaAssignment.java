import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;
import static java.util.stream.IntStream.range;

public class AdneomJavaAssignment {
    public static void main(String[] args) {
        Integer size = 2;
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        Collection<List<Integer>> partitions = partition(numbers, size);
        System.out.println(partitions);
    }

    public static List<List<Integer>> partition(List<Integer> numbers, Integer size) {
        if (numbers == null || size < 1) return new ArrayList<>();
        return range(0, numbers.size())
                .boxed()
                .collect(groupingBy(index -> index / size))
                .values()
                .stream()
                .map(indices -> indices
                        .stream()
                        .map(numbers::get)
                        .collect(toList()))
                .collect(toList());
    }
}
