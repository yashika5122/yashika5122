package FunctionalInerfaceExample.EmployeeOperation;

import FunctionalInerfaceExample.EmployeeOperation.Employee;

import java.util.ArrayList;
import java.util.List;

//DAO Layer
public class EmployeeDataBase {
    public static List<Employee> getEmployee(){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(123,"Roshan","IT",400000));
        employees.add(new Employee(456,"Deepak","Civil",500000));
        employees.add(new Employee(345,"Sonali","Defence",350000));
        employees.add(new Employee(234,"Rashmi","Core",700000));
        employees.add(new Employee(98,"Sohan","Social",550000));
        employees.add(new Employee(390,"Anjali","IT",200000));
        return employees;
    }
}
