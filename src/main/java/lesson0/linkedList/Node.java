package lesson0.linkedList;

public class Node<T> {
    T value;
    Node<T> next;

    public Node(T value) {
        this.value = value;
        this.next = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
}
