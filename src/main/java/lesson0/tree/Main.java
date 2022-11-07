package lesson0.tree;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.addLoop(4);
        tree.addLoop(2);
        tree.addLoop(1);
        tree.addLoop(3);
        tree.addLoop(10);
        tree.addLoop(9);
        tree.addLoop(16);

        tree.printPreOrderTraversal(tree.getHead());
        System.out.println();
        tree.printInOrderTraversal(tree.getHead());
        System.out.println();
        tree.printPostOrderTraversal(tree.getHead());
        System.out.println();

        tree.addRecursion(tree.getHead(), 20);
        tree.printPreOrderTraversal(tree.getHead());
    }
}
