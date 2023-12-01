package lists;

public class Challenge2LinkedLists {

    public static void main(String[] args) {

        IntegerLinkedList list=new IntegerLinkedList();
        System.out.println(list.isEmpty());
        list.insertSorted(100);
        list.insertSorted(200);
        list.insertSorted(1);
        list.insertSorted(5);
        list.insertSorted(-1);
        list.insertSorted(8);
        list.insertSorted(0);
        list.insertSorted(100);
        list.insertSorted(-100);
        list.print();

    }

}
