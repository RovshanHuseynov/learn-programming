package lesson0.tree;

public class Tree {
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

        System.out.print(cur.value + " ");
        if(cur.left != null) printPreOrderTraversal(cur.left);
        if(cur.right != null) printPreOrderTraversal(cur.right);
    }

    public void printInOrderTraversal(Node cur){
        // https://www.eolymp.com/en/problems/10059
        if(cur == head) System.out.print("printInOrder: ");

        if(cur.left != null) printInOrderTraversal(cur.left);
        System.out.print(cur.value + " ");
        if(cur.right != null) printInOrderTraversal(cur.right);
    }

    public void printPostOrderTraversal(Node cur){
        // https://www.eolymp.com/en/problems/10060
        if(cur == head) System.out.print("printPostOrderTraversal: ");

        if(cur.left != null) printPostOrderTraversal(cur.left);
        if(cur.right != null) printPostOrderTraversal(cur.right);
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

    public int sumLeft(Node cur){
        // https://www.eolymp.com/en/problems/10111

        if(cur != null &&
                cur.left != null &&
                cur.left.left == null &&
                cur.left.right == null) return cur.left.value + sumLeft(cur.left) + sumLeft(cur.right);
        return 0;
    }

    public int sumLeaves(Node cur){
        // https://www.eolymp.com/en/problems/10113

        if(cur == null) return 0;
        if(cur.left == null &&
                cur.right == null) return cur.value + sumLeaves(cur.left) + sumLeaves(cur.right);
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
        return 0;
    }

    public int maxDepth(Node cur){
        // https://www.eolymp.com/en/problems/10110
        return 0;
    }

    public Node invert(Node cur){
        // https://www.eolymp.com/en/problems/10114
        return null;
    }

    public boolean isSymmetric(Node cur){
        // https://www.eolymp.com/en/problems/10115
        return false;
    }

    public boolean isBalanced(Node cur){
        // https://www.eolymp.com/en/problems/10112
        return false;
    }

    public boolean isSame(Node cur1, Node cur2){
        // https://www.eolymp.com/en/problems/10108
        return false;
    }
}