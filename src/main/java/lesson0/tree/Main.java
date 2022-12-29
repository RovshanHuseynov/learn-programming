package lesson0.tree;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        /*tree.addLoop(4);
        tree.addLoop(2);
        tree.addLoop(1);
        tree.addLoop(3);
        tree.addLoop(10);
        tree.addLoop(9);
        tree.addLoop(0);
        tree.addLoop(16);*/
        tree.addLoop(5);
        tree.addLoop(3);
        //tree.addLoop(10);
        //tree.addLoop(1);
        //tree.addLoop(4);
        //tree.addLoop(11);
        //tree.addLoop(9);
        //tree.addLoop(12);

        Tree tree2 = new Tree();
        tree2.addLoop(5);
        tree2.addLoop(3);
        //tree2.addLoop(10);
        //tree2.addLoop(1);
        //tree2.addLoop(4);
        //tree2.addLoop(11);
        //tree2.addLoop(9);
        System.out.println(tree.isSame(tree.getHead(), tree2.getHead()));

        //System.out.println("minDepth: " + tree.minDepth(tree.getHead()));
        //System.out.println("maxDepth: " + tree.maxDepth(tree.getHead()));
        //System.out.println("isBalanced: " + tree.isBalanced(tree.getHead()));
        //System.out.println("isSymmetric: " + tree.isSymmetric(tree.getHead()));
        //System.out.println("isSymmetricWithQueue: " + tree.isSymmetricWithQueue());

        /*tree.printPreOrderTraversal(tree.getHead());
        System.out.println();
        tree.printInOrderTraversal(tree.getHead());
        System.out.println();
        tree.printPostOrderTraversal(tree.getHead());
        System.out.println();*/

        //tree.addRecursion(tree.getHead(), 20);
        //tree.addRecursion(tree.getHead(), 5);
        //tree.printPreOrderTraversal(tree.getHead());
        //System.out.println();

        //System.out.println("minimum: " + tree.minimum());
        //System.out.println("maximum: " + tree.maximum());
        //System.out.println("contains: " + tree.contains(tree.getHead(), 9));
        //System.out.println("sum: " + tree.sum(tree.getHead()));
        //System.out.println("sumLeft: " + tree.sumLeft(tree.getHead()));
        //System.out.println("sumLeaves: " + tree.sumLeaves(tree.getHead()));
    }
}
