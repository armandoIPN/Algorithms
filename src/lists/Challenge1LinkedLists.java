package lists;

import util.Employee;

public class Challenge1LinkedLists {

    public static void main(String[] args) {
        Employee e1=new Employee("F1","L1",1);
        Employee e2=new Employee("F2","L2",2);
        Employee e3=new Employee("F3","L3",3);
        Employee e4=new Employee("F4","L4",4);

        Employee e0=new Employee("F0","L0",0);
        Employee e_1=new Employee("F-1","L-1",-1);

        EmployeeDoublyLinkedList list=new EmployeeDoublyLinkedList();
        System.out.println(list.isEmpty());
        list.addToEnd(e1);
        list.addToEnd(e2);
        list.addToEnd(e3);
        list.addToEnd(e4);
        list.print();
        System.out.println(list.getSize());
        System.out.println(list.isEmpty());

        //System.out.println(list.removeFromFront());
        System.out.println(list.getSize());


        Employee e5=new Employee("F5","L5",5);

        System.out.println(list.addBefore(e0,e1));
        list.print();
        System.out.println(list.getSize());

        System.out.println(list.addBefore(e_1,e4));
        list.print();
        System.out.println(list.getSize());

        System.out.println(list.addBefore(e5,e5));
        list.print();
        System.out.println(list.getSize());

    }

}
