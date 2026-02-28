package Task1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task4 {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 6, 3, 7, 9, 8, 12, 34, 54, 31);

        List<Integer> result = nums.stream()
                .distinct()
                .filter(n -> n%2 == 0)
                .map(n -> n*10)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
