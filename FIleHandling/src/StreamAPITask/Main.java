package StreamAPITask;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        // 🔹 Adding Employees manually
        employees.add(new Employee(1, "Ram", "IT", "Manager",
                35, 10, 150000, 7, 2023));

        employees.add(new Employee(2, "Shyam", "HR", "Manager",
                30, 5, 90000, 9, 2022));

        employees.add(new Employee(3, "Mohan", "IT", "Developer",
                28, 6, 110000, 6, 2021));

        employees.add(new Employee(4, "Amit", "Finance", "Manager",
                40, 15, 200000, 5, 2024));

        employees.add(new Employee(5, "Ravi", "Testing", "Tester",
                26, 3, 75000, 6, 2023));

        employees.add(new Employee(6, "Neha", "IT", "Developer",
                29, 4, 95000, 7, 2022));


        // 🔹 Call Task 1
        List<String> result1 = Task1.processEmployees(employees);
        System.out.println("Task 1 Result (Reversed Names):");
        System.out.println(result1);

        // 🔹 Call Task 2
        List<Integer> result2 = Task2.processEmployees(employees);
        System.out.println("\nTask 2 Result (Employee IDs):");
        System.out.println(result2);
    }
}