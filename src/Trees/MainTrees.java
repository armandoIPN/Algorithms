package Trees;

public class MainTrees {
    public static void main(String[] args) {
        Tree tree=new Tree();
        tree.insert(25);
        tree.insert(20);
        tree.insert(15);
        tree.insert(27);
        tree.insert(30);
        tree.insert(29);
        tree.insert(22);
        tree.insert(32);
        tree.insert(17);

        System.out.println("InOrder");
        tree.traverseInOrder();
        System.out.println("PreOrder");
        tree.traversePreOrder();

        System.out.println("Doing get.");
        System.out.println(tree.get(27));
        System.out.println(tree.get(17));
        System.out.println(tree.get(8888));

        System.out.println("Min: "+tree.min());
        System.out.println("Max: "+tree.max());

        System.out.println("Deleting 17..");
        tree.delete(17);
        tree.traverseInOrder();

        System.out.println("Deleting 25..");
        tree.delete(25);
        tree.traverseInOrder();

        System.out.println("Deleting 8888..");
        tree.delete(8888);
        tree.traverseInOrder();


    }
}
