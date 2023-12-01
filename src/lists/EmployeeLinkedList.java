package lists;

import util.Employee;

import java.util.Objects;

public class EmployeeLinkedList {
    private EmployeeNode head;

    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void addToFront(Employee employee){
        EmployeeNode node=new EmployeeNode(employee);
        node.setNext(head);
        head=node;
        size++;
    }

    public void print(){
        EmployeeNode current=head;
        System.out.println("Head-> ");
        while(current!=null){
            System.out.println(current);
            System.out.println("-> ");
            current=current.getNext();
        }
        System.out.println("null");
    }

    public boolean isEmpty(){
        return Objects.isNull(head);
    }

    public EmployeeNode removeFromFront(){
        if (isEmpty()) return head;

        EmployeeNode removedNode=head;
        head=head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;

    }
}
