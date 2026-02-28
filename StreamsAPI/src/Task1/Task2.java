package Task1;
import javax.swing.*;
import java.util.*;
import java.util.stream.Collectors;

class Employee{
    private String name;
    private double salary;
    private String department;

    public Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment(){
        return department;
    }

    @Override
    public String toString() {
        return name + " - " + salary;
    }
}

public class Task2 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Manas", 50000, "Development"));
        employees.add(new Employee("Aman", 70000, "Management"));
        employees.add(new Employee("Rohit", 60000, "Research"));
        employees.add(new Employee("Sahil", 80000, "Management"));
        employees.add(new Employee("Karan", 55000, "Management"));

        //Top 3 employees earning highest salary
//        List<Employee> top3 = employees.stream()
//                .sorted(Comparator.comparing(Employee::getSalary).reversed())
//                .limit(3)
//                .collect(Collectors.toList());

//        System.out.println(top3);

        //Group employees by their department
//
//        Map<String, List<Employee>> groupByDepartment = employees.stream()
//                .collect(Collectors.groupingBy(Employee::getDepartment));
//
//        System.out.println(groupByDepartment);


        //Salary based sorting top to bottom

//        employees.sort(Comparator.comparing(Employee::getSalary).reversed());
//
//        employees.forEach(employee-> System.out.println(employee.getSalary()));

//        Sort by:
//           Department (ascending)
//           Salary (descending)
//           Name (ascending)

        employees.sort(Comparator.comparing(Employee::getDepartment)
                .thenComparing(
                        Comparator.comparing(Employee::getSalary).reversed()
                ).thenComparing(
                        Employee::getName
                ));

        employees.forEach(employee-> System.out.println(employee.getName() + " " + employee.getSalary() + " " + employee.getDepartment()));

    }
}
