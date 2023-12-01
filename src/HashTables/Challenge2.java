package HashTables;

import util.Employee;

import java.util.HashMap;
import java.util.LinkedList;

public class Challenge2 {
    public static void main(String[] args) {

        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee("Jane", "Jones", 123));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Mike", "Wilson", 45));
        employees.add(new Employee("Mary", "Smith", 5555));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Bill", "End", 3948));
        employees.add(new Employee("Jane", "Jones", 123));

        //employees.forEach(e -> System.out.println(e));
        System.out.println("Before removed duplicates: "+employees);

        LinkedList<Employee> employeeListNoDups = removeDuplicates(employees);

        System.out.println("After removed duplicates: "+employeeListNoDups);



    }
    public static LinkedList<Employee> removeDuplicates(LinkedList<Employee>employees){
        HashMap map=new HashMap<>();
        for (Employee employee : employees) {
            if(!map.containsKey(employee.id())){
                map.putIfAbsent(employee.id(),employee);
            }
        }
        return new LinkedList<>(map.values());
    }

}
