package FunctionalInerfaceExample.EmployeeOperation;

import FunctionalInerfaceExample.EmployeeOperation.Employee;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

/*Assume you have list of employee in various dept, WAP to find highest paid employee from each dept*/

public class HighestPaidEmpPerDept {
    public static void main(String[] args) {

        List<Employee> employees = Stream.of(
                new Employee(1, "Basant", "DEV", 50000),
                new Employee(8, "santosh", "DEV", 80000),
                new Employee(4, "pratik", "QA", 60000),
                new Employee(3, "Dipak", "QA", 90000),
                new Employee(9, "Bikash", "DEVOPS", 40000))
                .collect(Collectors.toList());

        Map<String, List<Employee>> collect = employees.stream().collect(groupingBy(Employee::getDept));
        System.out.println("collect"+collect);

//       get Employee by dept
        employees.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);

        Map<Double, Optional<Employee>> collect1 = employees.stream().collect(groupingBy(Employee::getSalary,
                reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));
        System.out.println("get Employee by dept .........."+ collect1);
//        System.out.println(sorted);

//        Approach 1
        Comparator<Employee> comparing = Comparator.comparing(Employee::getSalary);
        Map<String, Optional<Employee>> empMax = employees.stream().
                collect(
                        groupingBy(Employee::getDept, Collectors.reducing(BinaryOperator.maxBy(comparing)))
                );

        System.out.println("Approach 1 ..........");
        System.out.println(empMax);

//        Approach 2
        Map<String, Employee> employeeMap = employees.stream().
                collect(
                        groupingBy(Employee::getDept,
                                collectingAndThen(maxBy(Comparator.comparingDouble(Employee::getSalary)),
                                        Optional::get))
                );
        System.out.println("Approach 2 ..........");
        System.out.println(employeeMap);

        System.out.println("SOrt on name then dept then salary ..........");
        employees.sort(Comparator.comparing(Employee::getName)
                .thenComparing(Employee::getSalary)
                .thenComparing(Employee::getDept));
        employees.forEach(System.out::println);


    }
}
