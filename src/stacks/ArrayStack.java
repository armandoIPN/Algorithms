package stacks;

import util.Employee;

import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStack {

    private Employee[]stack;
    private int top;

    public ArrayStack(int capacity) {
        this.stack = new Employee[capacity];
    }

    public void push(Employee emp){
        if(top == stack.length){
            Employee[]newArray=new Employee[2* stack.length];
            System.arraycopy(stack,0,newArray,0,stack.length);
            stack=newArray;
        }
        stack[top++]=emp;
    }

    public Employee pop() {
        if(isEmpty())
            throw new EmptyStackException();

        Employee employee=stack[--top];
        stack[top]=null;
        return employee;
    }

    public Employee peek(){
        if(isEmpty())
            throw new EmptyStackException();
        return stack[top-1];
    }

    public boolean isEmpty(){
        return top==0;
    }

    public int size(){
        return top;
    }

    public void print(){
        Arrays.stream(stack).limit(top).forEach(System.out::println);
    }
}
