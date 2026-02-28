package Task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("manas", "rahul", "shivam", "modi", "rishabh");

        List<String> result = names.stream()
                                   .filter(name-> name.startsWith("r"))
                                   .map(String::toUpperCase)
                                   .collect(Collectors.toList());

        System.out.println(result);
        System.out.println(names);
    }

}
