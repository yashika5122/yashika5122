package FunctionalInerfaceExample.MapAndReduce;

import FunctionalInerfaceExample.EmployeeOperation.Employee;
import FunctionalInerfaceExample.EmployeeOperation.EmployeeDataBase;

import java.util.OptionalDouble;

public class FindTotalSalaryOfDept {
    public static void main(String[] args) {
        OptionalDouble averageSalary = EmployeeDataBase.getEmployee().stream()
                .filter(t -> t.getDept().equalsIgnoreCase("IT"))
                .map(employee -> employee.getSalary())
                .mapToDouble(i -> i)
                .average();
        System.out.println("Average of Salary of IT dept :"+averageSalary.getAsDouble());

        double TotalSum = EmployeeDataBase.getEmployee().stream()
                .filter(t -> t.getDept().equalsIgnoreCase("IT"))
                .map(Employee::getSalary)
                .mapToDouble(i -> i)
                .sum();
        System.out.println("Total sum of IT dept :"+TotalSum);
    }
}
