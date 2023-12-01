package lists;

import util.Employee;

public class MainLinkedList {

    public static void main(String[] args) {
        Employee e1=new Employee("F1","L1",1);
        Employee e2=new Employee("F2","L2",2);
        Employee e3=new Employee("F3","L3",3);
        Employee e4=new Employee("F4","L4",4);

        EmployeeLinkedList list=new EmployeeLinkedList();
        System.out.println(list.isEmpty());
        list.addToFront(e1);
        list.addToFront(e2);
        list.addToFront(e3);
        list.addToFront(e4);
        list.print();
        System.out.println(list.getSize());
        System.out.println(list.isEmpty());

        System.out.println(list.removeFromFront());
        System.out.println(list.getSize());

    }

}
