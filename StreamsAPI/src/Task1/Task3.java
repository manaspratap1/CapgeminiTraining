//Second Highest Number
package Task1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2, 4, 5, 9, 1, 5, 6, 2, 3);

        Optional<Integer> result = nums.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        System.out.println(result);
    }
}
