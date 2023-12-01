package lists;

import util.Employee;

import java.util.Objects;

public class EmployeeDoublyLinkedList {
    private EmployeeNode head;
    private EmployeeNode tail;

    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);

        if (head == null) {
            tail = node;
        } else {
            head.setPrevious(node);
            node.setNext(head);
        }
        head = node;
        size++;
    }

    public void print() {
        EmployeeNode current = head;
        System.out.println("Head-> ");
        while (current != null) {
            System.out.println(current);
            System.out.println("<=> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

    public boolean isEmpty() {
        return Objects.isNull(head);
    }

    public EmployeeNode removeFromFront() {
        if (isEmpty()) return head;

        EmployeeNode removedNode = head;

        if (head.getNext()==null){
            tail=null;
        }else{
            head.getNext().setPrevious(null);
        }

        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;

    }

    public void addToEnd(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        if(tail==null){
            head=node;
        }else{
            tail.setNext(node);
            node.setPrevious(tail);
        }
        tail=node;
        size++;
    }

    public boolean addBefore(Employee employeeToAdd,Employee existingEmployee){
        if(head==null)
            return false;
        EmployeeNode node = new EmployeeNode(employeeToAdd);
        if(head.getEmployee().id()==existingEmployee.id()){
            head.setPrevious(node);
            node.setPrevious(null);
            node.setNext(head);
            head=node;
            size++;
        }else{
            EmployeeNode existingNode=findNode(existingEmployee);
            if (existingNode==null)
                return false;
            EmployeeNode currentPrevious=existingNode.getPrevious();
            existingNode.setPrevious(node);
            currentPrevious.setNext(node);
            node.setPrevious(currentPrevious);
            node.setNext(existingNode);
            size++;
        }
        return true;
    }

    private EmployeeNode findNode(Employee existingEmployee) {
        EmployeeNode node=head;
        while(node!=null){
            if(node.getEmployee().id()==existingEmployee.id())
                return node;
            node=node.getNext();
        }
        return null;
    }

    public EmployeeNode removeFromEnd() {
        if (isEmpty()) return tail;

        EmployeeNode removedNode = head;
        if (tail.getPrevious()==null){
            head=null;
        }else{
            tail.getPrevious().setNext(null);
        }
        tail = tail.getPrevious();
        size--;
        removedNode.setPrevious(null);
        return removedNode;
    }


    }