package streams.jav.iq.l3;

import streams.jav.dto.Employee;

import java.util.*;
import java.util.stream.Collectors;
//Find the most frequent initial letter among all employee name

public class MostCommonFirstLetter {
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

        Optional<Map.Entry<Character, Long>> first = list.stream()
                .map(employee -> employee.getName().charAt(0))
                .collect(Collectors.groupingBy(Character::toLowerCase, Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue());

        System.out.println(first);


    }
}
