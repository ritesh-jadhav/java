package streams.jav.iq.l2.intermediate;
import streams.jav.dto.Employee;

import  java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class GetDeptByEmpCount {
    // get the list of department whose is having more that 2 employee

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

        Map<String, Long> collect = list.stream()
                .collect(Collectors.groupingBy(Employee::getDept, Collectors.counting())
                );
        List<String> list1 = collect.entrySet().stream()
                .filter(e -> e.getValue() > 2)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println(list1);
    }
}
