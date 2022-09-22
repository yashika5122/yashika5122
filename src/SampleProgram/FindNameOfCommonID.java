package SampleProgram;

import FunctionalInerfaceExample.EmployeeOperation.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindNameOfCommonID {
    public static void main(String[] args) {
//     list   employee id, name ,
//        list Id
        List<Employee> emplList = new ArrayList<>();
        emplList.add(new Employee(1, "yashika","IT",2000));
        emplList.add(new Employee(3, "Chandra","Core",30000));

        List<Integer> idList = new ArrayList<>();
        idList.add(2);
        idList.add(3);
        idList.add(1);

        List<Employee> filteredList = emplList.stream()
                .filter(empl -> idList.stream().anyMatch(id -> empl.getId() == id))
                .collect(Collectors.toList());
        System.out.println(filteredList);
//        4 core - 2core 2 core  1core
    }
}
