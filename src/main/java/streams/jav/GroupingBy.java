package streams.jav;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.lang.System.*;

public class GroupingBy {
    public static void main(String[] args) {
        List<employee> employeeList = Arrays.asList(
                new employee("devil", "IT-S", 32422),
                new employee("avi m", "HR", 83422),
                new employee("kelvin shaw", "HR", 534321),
                new employee("david gutta", "RMG", 73242)
        );
        Map<String, List<employee>> groupedByDept =
                employeeList.stream()
                        .collect(Collectors.groupingBy(employee::getDept));

        groupedByDept.
                forEach((department,employlist) -> {
                    out.println(department);
                    employlist.forEach(out::println);

                });

        Map<Boolean, List<employee>> partition = employeeList.stream().collect(Collectors.partitioningBy(employee -> employee.getSal()> 50000));
        System.out.println(partition);
    }

    static class employee {
        String name;
        String dept;
        double sal;

        employee(String name, String dept, double sal) {
            this.name = name;
            this.dept = dept;
            this.sal = sal;
        }
        @Override
        public String toString() {
            return "name: " + name + ", dept: " + dept + ", sal: " + sal;
        }
        public String getName() {
            return name;
        }
        public String getDept() {
            return dept;
        }
        public double getSal() {
                return sal;
        }


    }
}
