package lesson0.eolymp;

import java.util.Scanner;

public class Pr10146 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    }
}

class TreeNode10146 {
    int val;
    TreeNode10146 left, right, parent;

    public TreeNode10146(int val, TreeNode10146 parent){
        this.val = val;
        this.parent = parent;
        this.left = null;
        this.right = null;
    }

    public TreeNode10146 Prev(TreeNode10146 tree){
        TreeNode10146 cur = tree;
        while(true){
            tree = tree.parent;
            if(tree != null && tree.val <= cur.val){
                break;
            }
            else if(tree == null){
                break;
            }
        }
        return tree;
    }

    public TreeNode10146 Next(TreeNode10146 tree){
        if(tree != null && tree.right != null){
            TreeNode10146 cur = tree.right;
            while(cur.left != null){
                cur = cur.left;
            }
            return cur;
        }
        else {
            TreeNode10146 cur = tree;
            while (true) {
                tree = tree.parent;
                if (tree != null && tree.val >= cur.val) {
                    break;
                } else if (tree == null) {
                    break;
                }
            }
            return tree;
        }
    }
}