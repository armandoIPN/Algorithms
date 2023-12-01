package stacks;

import util.Employee;

public class LinkedStackMain {
    public static void main(String[] args) {
        Employee e1=new Employee("F1","L1",1);
        Employee e2=new Employee("F2","L2",2);
        Employee e3=new Employee("F3","L3",3);
        Employee e4=new Employee("F4","L4",4);
        Employee e5=new Employee("F5","L5",5);

        LinkedStack stack=new LinkedStack();
        stack.push(e1);
        stack.push(e2);
        stack.push(e3);
        stack.push(e4);
        stack.push(e5);

        stack.print();

        System.out.println("Peek: "+stack.peek());

        stack.print();

        System.out.println("Pop: "+stack.pop());
        System.out.println("Peek: "+stack.peek());

        stack.print();


    }
}
