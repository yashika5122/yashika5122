package FunctionalInerfaceExample.sort;

import FunctionalInerfaceExample.EmployeeOperation.Employee;
import FunctionalInerfaceExample.EmployeeOperation.EmployeeDataBase;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListForNonPrimitive {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeDataBase.getEmployee();
        /*Approach 1
        * Implement Comparator in class and call that object
        * */
//        Collections.sort(employees,new MyComparator());
//        System.out.println("------------Approach 1-----------------");
//        System.out.println(employees);

        /*Approach 2
        * direct implement comparator method from lambda expression
        * */
        Collections.sort(employees,(o1, o2) -> (int) (o2.getSalary()- o1.getSalary()));
        System.out.println("------------Approach 2-----------------");
        System.out.println(employees);

        /*Approach 3
        * Sort from Stream api
        *  */
        System.out.println("--------------Approach 3---------------");
        employees.stream().sorted((o1, o2) -> (int) (o2.getSalary()- o1.getSalary())).forEach(t-> System.out.println(t));

        /*Approach 4
        * Sort from Stream API using comparator
        * */
        System.out.println("------------Approach 4-----------------");
        employees.stream().sorted(Comparator.comparing(employee -> employee.getSalary()))
                .forEach(t-> System.out.println(t));

        /*Approach 5
         * Sort from Stream API using comparator using method reference
         * */
        System.out.println("--------------Approach 5---------------");
        employees.stream().sorted(Comparator.comparing(Employee::getName))
                .forEach(t-> System.out.println(t));

        /*to reverse*/
        System.out.println("------------reverse-----------------");
        employees.stream().sorted(Comparator.comparing(Employee::getName).reversed())
                .forEach(t-> System.out.println(t));
    }
}

//use for Approach 1
class MyComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) (o1.getSalary()- o2.getSalary());
    }
}
