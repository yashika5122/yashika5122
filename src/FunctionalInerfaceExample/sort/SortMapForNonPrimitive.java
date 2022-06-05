package FunctionalInerfaceExample.sort;

import FunctionalInerfaceExample.EmployeeOperation.Employee;
import FunctionalInerfaceExample.EmployeeOperation.EmployeeDataBase;

import java.util.*;

public class SortMapForNonPrimitive {
    public static void main(String[] args) {
        /*Approach 1
         * Traditional Approach*/
        Map<Employee, Integer> employees = new TreeMap<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getSalary() - o2.getSalary());
            }
        });

        employees.put(new Employee(123, "Roshan", "IT", 400000), 45);
        employees.put(new Employee(456, "Deepak", "Civil", 500000), 60);
        employees.put(new Employee(345, "Sonali", "Defence", 350000), 70);
        employees.put(new Employee(234, "Rashmi", "Core", 700000), 20);
        employees.put(new Employee(98, "Sohan", "Social", 550000), 50);
        employees.put(new Employee(390, "Anjali", "IT", 200000), 40);

        System.out.println("--------------Approach 1---------------");
        System.out.println(employees);

        /*Approach 2
         * Implement Lambda*/
        Map<Employee, Integer> employeeMap = new TreeMap<>((o1, o2) -> (int) (o1.getSalary() - o2.getSalary()));
        employeeMap.put(new Employee(123, "Roshan", "IT", 400000), 45);
        employeeMap.put(new Employee(456, "Deepak", "Civil", 500000), 60);
        employeeMap.put(new Employee(345, "Sonali", "Defence", 350000), 70);
        employeeMap.put(new Employee(234, "Rashmi", "Core", 700000), 20);
        employeeMap.put(new Employee(98, "Sohan", "Social", 550000), 50);
        employeeMap.put(new Employee(390, "Anjali", "IT", 200000), 40);

        System.out.println("--------------Approach 2---------------");
        System.out.println(employeeMap);

        /*Approach 3
         * Stream API*/
        System.out.println("--------------Approach 3---------------");
        employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary)))
                .forEach(System.out::println);
        System.out.println("--------------Reversed---------------"); //change comparingByKey to comparingByValue give error coz it is primitive data type
        employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed()))
                .forEach(System.out::println);
    }
}
