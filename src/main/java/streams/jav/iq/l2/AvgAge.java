package streams.jav.iq.l2;

import streams.jav.dto.Person;

import java.util.List;

public class AvgAge {
    public static void main(String[] args) {

    List<Person> personList = List.of(
            new Person("John",34,'M'),
            new Person("Devil",24,'F'),
            new Person("Krish",42,'M'),
            new Person("Tom",63,'F'),
            new Person("Smith",35,'M'),
            new Person("Gorge",28,'M'),
            new Person("Peter",23,'F'),
            new Person("Lee",19,'F')

    ) ;
    personList.stream()
            .mapToInt(Person::getAge)
            .average()
            .ifPresent(System.out::println);

    }

}
