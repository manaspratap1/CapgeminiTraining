package StreamAPITask;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfElements {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};

        Map<Integer, Long> frequency = Arrays.stream(arr)
                .boxed()   // convert int → Integer
                .collect(Collectors.groupingBy(
                        n -> n,
                        Collectors.counting()
                ));

        System.out.println(frequency);
    }
}
