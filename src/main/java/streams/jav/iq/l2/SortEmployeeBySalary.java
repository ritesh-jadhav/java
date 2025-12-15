package streams.jav.iq.l2;

import streams.jav.dto.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortEmployeeBySalary {
    public static void main(String[] args) {
        List<Employee>  list = List.of(
                new Employee("John",   "DEV", 75000L),
                new Employee("Alice",  "QA", 65000L),
                new Employee("Bob",    "DEV", 82000L),
                new Employee("Carol",  "HR", 60000L),
                new Employee("David",  "DEV", 90000L),
                new Employee("Eva",    "QA", 68000L),
                new Employee("Frank",  "HR", 72000L),
                new Employee("Grace",  "DEV", 88000L),
                new Employee("Hannah", "QA", 70000L),
                new Employee("Ian",    "HR", 65000L)
        );
        List<Employee> sortedList = list.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .toList();

        System.out.println(sortedList);
    }
}
