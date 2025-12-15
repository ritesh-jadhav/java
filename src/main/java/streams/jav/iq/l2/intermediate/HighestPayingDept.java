package streams.jav.iq.l2.intermediate;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import streams.jav.dto.Employee;

public class HighestPayingDept {
    public static void main(String[] args) {
        List<Employee> list = List.of(
                new Employee("John", "DEV", 75000L),
                new Employee("Alice", "QA", 65000L),
                new Employee("Bob", "DEV", 82000L),
                new Employee("Carol", "HR", 60000L),
                new Employee("David", "DEV", 90000L),
                new Employee("Eva", "QA", 68000L),
                new Employee("Frank", "HR", 72000L),
                new Employee("Grace", "DEV", 88000L),
                new Employee("Hannah", "QA", 70000L),
                new Employee("Ian", "HR", 65000L)
        );

        Map.Entry<String, Double> entry = list.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDept,
                        Collectors.averagingDouble(Employee::getSalary)
                )).entrySet().stream().max(Map.Entry.comparingByValue()).orElseThrow();
        System.out.println(entry   );

    }
}