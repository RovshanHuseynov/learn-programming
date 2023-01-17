package lesson0.tree;

import java.util.Objects;

public class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(o == null) return false;
        if (this == o) return true;
        if (!(o instanceof Node)) return false;

        Node that = (Node) o;
        return this.value == that.value;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = result * 31 + value;
        return result;
    }
}
