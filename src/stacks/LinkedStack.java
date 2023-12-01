package stacks;

import util.Employee;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.LinkedList;

public class LinkedStack {

    private LinkedList<Employee>stack;
    private int top;

    public LinkedStack() {
        this.stack = new LinkedList<>();
    }

    public void push(Employee emp){
        stack.push(emp);
    }

    public Employee pop() {
        return stack.pop();
    }

    public Employee peek(){
        return stack.peek();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public int size(){
        return stack.size();
    }

    public void print(){
        System.out.println(stack);
    }
}
