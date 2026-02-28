package StreamAPITask;

import java.time.Year;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {

    public static List<Integer> processEmployees(List<Employee> employees) {

        int currentYear = Year.now().getValue();

        return employees.stream()

                .filter(e ->
                        (currentYear - e.getYearOfJoining()) <= 5 &&
                                e.getPerformanceRating() < 8 &&
                                e.getSalary() >= 60000 &&
                                e.getSalary() <= 120000
                )

                .sorted(Comparator
                        .comparing(Employee::getSalary)
                        .thenComparing(Comparator
                                .comparing(Employee::getYearsOfExperience)
                                .reversed()))

                .map(Employee::getId)

                .collect(Collectors.toList());
    }
}