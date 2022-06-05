package FunctionalInerfaceExample.EmployeeOperation;

import java.util.List;
import java.util.stream.Collectors;

public class FindTaxPayer {
    /*Those salary is > 5 lac is eligible for tax*/
    public static List<Employee> evaluateTaxUser() {
        return EmployeeDataBase.getEmployee().stream().filter(t -> t.getSalary() > 500000).collect(Collectors.toList());
    }

    /*Find tax payer on some input basis ,Those salary is > 5 lac is eligible for tax*/
    public static List<Employee> evaluateTaxOnInput(String s) {
        return s.equalsIgnoreCase("tax")
                ? EmployeeDataBase.getEmployee().stream().filter(t -> t.getSalary() > 500000).collect(Collectors.toList())
                : EmployeeDataBase.getEmployee().stream().filter(t -> t.getSalary() <= 500000).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(evaluateTaxUser());
        System.out.println("----------------");
        System.out.println(evaluateTaxOnInput("no tax"));
    }
}
