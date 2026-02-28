package StreamAPITask;

import java.time.Year;
import java.util.List;

public class Task1 {

    public static List<String> processEmployees(List<Employee> employees) {

        int currentYear = Year.now().getValue();

        return employees.stream()

                .filter(e ->
                        e.getJobTitle().equalsIgnoreCase("Manager") &&
                                e.getSalary() > 100000 &&
                                (currentYear - e.getYearOfJoining()) <= 3
                )

                .sorted((e1, e2) -> {
                    if (e1.getYearsOfExperience() != e2.getYearsOfExperience()) {
                        return e2.getYearsOfExperience() - e1.getYearsOfExperience();
                    } else {
                        return e1.getPerformanceRating() - e2.getPerformanceRating();
                    }
                })

                .map(e -> new StringBuilder(e.getName())
                        .reverse()
                        .toString()
                        .toUpperCase())

                .toList();
    }
}