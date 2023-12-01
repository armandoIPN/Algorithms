package lists;

import util.Employee;

public class IntegerNode {

    private Integer integer;
    private IntegerNode next;
    private IntegerNode previous;

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    public IntegerNode getNext() {
        return next;
    }

    public void setNext(IntegerNode next) {
        this.next = next;
    }

    public IntegerNode getPrevious() {
        return previous;
    }

    public void setPrevious(IntegerNode previous) {
        this.previous = previous;
    }

    public IntegerNode(Integer integer) {
        this.integer = integer;
    }

    @Override
    public String toString() {
        return integer.toString();
    }
}
