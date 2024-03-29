package lesson0.tree;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    // if it is a tree, one node can be reached from only one node
    // if there is a cycle, it is not a tree
    // if it is a tree, there is a way to go from root node to every node (connected)
    // binary tree - each node has no more than two child nodes
    // binary search tree - left node is less than root node
    // which it less than all the right nodes
    // if it is a tree, (number of edges)/2 must be equal to n-1 (n = total number of nodes)
    private Node head;

    public void addLoop(int value){
        Node newNode = new Node(value);

        if(head == null) head = newNode;
        else {
            Node cur = head;

            while (true) {
                if (value < cur.value) {
                    if (cur.left == null) {
                        cur.left = newNode;
                        break;
                    } else {
                        cur = cur.left;
                    }
                } else {
                    if (cur.right == null) {
                        cur.right = newNode;
                        break;
                    } else {
                        cur = cur.right;
                    }
                }
            }
        }
    }

    public void addRecursion(Node cur, int value){
        Node newNode = new Node(value);

        if(cur == head && cur == null) {
            head = newNode;
            return;
        }

        if(value < cur.value){
            if(cur.left == null){
                cur.left = newNode;
            } else {
                addRecursion(cur.left, value);
            }
        } else {
            if(cur.right == null){
                cur.right = newNode;
            } else {
                addRecursion(cur.right, value);
            }
        }
    }

    public void printPreOrderTraversal(Node cur){
        // https://www.eolymp.com/en/problems/10057
        if(cur == head) System.out.print("printPreOrderTraversal: ");

        if(cur != null) System.out.print(cur.value + " ");
        else return;

        printPreOrderTraversal(cur.left);
        printPreOrderTraversal(cur.right);
    }

    public void printInOrderTraversal(Node cur){
        // https://www.eolymp.com/en/problems/10059
        if(cur == head) System.out.print("printInOrder: ");

        if(cur == null) return;
        printInOrderTraversal(cur.left);
        System.out.print(cur.value + " ");
        printInOrderTraversal(cur.right);
    }

    public void printPostOrderTraversal(Node cur){
        // https://www.eolymp.com/en/problems/10060
        if(cur == head) System.out.print("printPostOrderTraversal: ");

        if(cur == null) return;
        printPostOrderTraversal(cur.left);
        printPostOrderTraversal(cur.right);
        System.out.print(cur.value + " ");
    }

    public Node getHead(){
        return head;
    }

    public Node minimum(){
        // https://www.eolymp.com/en/problems/10061
        if(head == null) return null;

        Node min = head;
        while(min.left != null) min = min.left;
        return min;
    }

    public Node maximum(){
        // https://www.eolymp.com/en/problems/10062
        if(head == null) return null;

        Node min = head;
        while(min.right != null) min = min.right;
        return min;
    }

    public int sumLeftLeaves(Node cur){
        // https://www.eolymp.com/en/problems/10111

        if(cur != null &&
                cur.left != null &&
                cur.left.left == null &&
                cur.left.right == null) return cur.left.value + sumLeftLeaves(cur.left) + sumLeftLeaves(cur.right);
        return 0;
    }

    public int sumLeaves(Node cur){
        // https://www.eolymp.com/en/problems/10113

        if(cur == null) return 0;
        if(cur.left == null &&
                cur.right == null) return cur.value;
        else return sumLeaves(cur.left) + sumLeaves(cur.right);
    }

    public int sum(Node cur){
        // https://www.eolymp.com/en/problems/10064
        if(cur == null) return 0;
        return cur.value + sum(cur.left) + sum(cur.right);
    }

    public Node contains(Node cur, int element){
        // https://www.eolymp.com/en/problems/10063
        if(cur == null) return null;
        if(cur.value == element) return cur;
        else if(element < cur.value) return contains(cur.left, element);
        else return contains(cur.right, element);
    }

    public int minDepth(Node cur){
        // https://www.eolymp.com/en/problems/10109

        if(cur == null) return 0;
        if(cur.left == null && cur.right == null) return 1;

        if(cur.left == null) return 1 + minDepth(cur.right);
        else if(cur.right == null) return 1 + minDepth(cur.left);
        else return 1 + Math.min(minDepth(cur.left), minDepth(cur.right));
    }

    public int maxDepth(Node cur){
        // https://www.eolymp.com/en/problems/10110

        if(cur == null) return 0;
        if(cur.left == null && cur.right == null) return 1;

        else if(cur.left != null && cur.right != null) return 1 + Math.max(maxDepth(cur.left), maxDepth(cur.right));
        else if(cur.left != null) return 1 + maxDepth(cur.left);
        else return 1 + maxDepth(cur.right);
    }

    public Node invert(Node cur){
        // https://www.eolymp.com/en/problems/10114

        if(cur != null) {
            Node temp = cur.left;
            cur.left = cur.right;
            cur.right = temp;

            invert(cur.left);
            invert(cur.right);
        }
        return cur;
    }

    public boolean isSymmetric(Node cur){
        // https://www.eolymp.com/en/problems/10115

        if(cur == null) return true;
        if(cur.left == null && cur.right == null) return true;
        if(cur.left != null && cur.right == null) return false;
        if(cur.left == null && cur.right != null) return false;
        if(cur.left != null && cur.right != null && cur.left.value != cur.right.value) return false;
        if(cur.left.left == null && cur.right.right != null) return false;
        if(cur.left.left != null && cur.right.right == null) return false;
        if(cur.left.left != null && cur.right.right != null && cur.left.left.value != cur.right.right.value) return false;
        return isSymmetric(cur.left) && isSymmetric(cur.right);
    }

    public boolean isSymmetricWithQueue(){
        if(head == null) return true;
        if(head.left == null && head.right == null) return true;

        Queue<Node> q = new LinkedList<>();
        q.add(head.left);
        q.add(head.right);

        while(!q.isEmpty()){
            Node tempLeft = q.remove();
            Node tempRight = q.remove();

            if(tempLeft == null && tempRight == null) continue;
            if( (tempLeft == null) != (tempRight == null) ) return false;
            if(tempLeft.value != tempRight.value) return false;

            q.add(tempLeft.left);
            q.add(tempRight.right);
            q.add(tempLeft.right);
            q.add(tempRight.left);
        }
        return true;
    }

    public boolean isBalanced(Node cur){
        // https://www.eolymp.com/en/problems/10112

        if(cur == null) return true;
        if(cur.left == null && cur.right == null) return true;
        if(cur.left == null &&
                (cur.right.left != null || cur.right.right != null)) return false;

        if(cur.right == null &&
                (cur.left.left != null || cur.left.right != null)) return false;

        return isBalanced(cur.left) && isBalanced(cur.right);
    }

    public boolean isSame(Node tree1, Node tree2){
        // https://www.eolymp.com/en/problems/10108

        if(tree1 == null && tree2 == null) return true;
        else if(tree1 != null && tree2 == null) return false;
        else if(tree1 == null && tree2 != null) return false;
        else if(tree1.value != tree2.value) return false;

        return isSame(tree1.left, tree2.left) && isSame(tree1.right, tree2.right);
    }
}