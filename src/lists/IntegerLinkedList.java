package lists;

import util.Employee;

import java.util.Objects;

public class IntegerLinkedList {
    private IntegerNode head;

    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void addToFront(Integer integer){
        IntegerNode node=new IntegerNode(integer);
        node.setNext(head);
        head=node;
        size++;
    }

    public void print(){
        IntegerNode current=head;
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

    public IntegerNode removeFromFront(){
        if (isEmpty()) return head;

        IntegerNode removedNode=head;
        head=head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;

    }

    public void insertSorted(Integer integer){
        if (isEmpty()){
            addToFront(integer);
        }else{
            if(integer<head.getInteger()){
                addToFront(integer);
            }else {
                IntegerNode previousNode=findNodeToInsertAfter(integer);
                addAfter(integer,previousNode);
            }
        }
    }

    private void addAfter(Integer integer, IntegerNode previousNode) {
        IntegerNode newNode=new IntegerNode(integer);
        IntegerNode aux = previousNode.getNext();
        previousNode.setNext(newNode);
        newNode.setNext(aux);
        size++;
    }

    private IntegerNode findNodeToInsertAfter(Integer integer) {
        IntegerNode node=head;
        while (node!=null){
            if( node.getInteger()<=integer&&
                node.getNext()!=null&&
                node.getNext().getInteger()>integer)
                return node;
            if (node.getNext()==null)
                return node;
            node=node.getNext();
        }
        return null;
    }
}
