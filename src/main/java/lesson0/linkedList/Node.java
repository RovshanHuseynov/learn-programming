package lesson0.linkedList;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if(o == null) return false;
        if (this == o) return true;
        if(!(o instanceof Node)) return false;

        Node<T> that = (Node<T>) o;
        return Objects.equals(this.value, that.value) &&
                Objects.equals(this.next, that.next);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = result * 31 + value.hashCode();
        //result = result * 31 + (next == null ? 0 : next.hashCode());
        return result;
    }
}
