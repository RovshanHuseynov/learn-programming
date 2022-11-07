package lesson0.linkedList;

import java.util.HashSet;
import java.util.Set;

public class MyLinkedList<T> {
    // https://www.eolymp.com/en/problems/10045
    private Node<T> head;

    public void addLast(T value){
        Node<T> newNode = new Node<>(value);

        if(head == null){
            head = newNode;
        } else {
            Node<T> cur = head;
            while (cur.next != null){
                cur = cur.next;
            }

            if(contains(value) != null){
                cur.next = contains(value);
            }
            else {
                cur.next = newNode;
            }
        }

        System.out.println("addLast: " + value);
    }

    public void addFirst(T val){
        Node<T> newNode = new Node<>(val);

        if(head != null) {
            newNode.next = head;
        }
        head = newNode;
    }

    public boolean removeFirst() {
        if(head == null) return false;

        head = head.next;
        return true;
    }

    public boolean removeLast() {
        Node<T> cur = head;
        while (true) {
            if (cur == null || cur.next == null) {
                return false;
            } else if (cur.next.next == null) {
                cur.next = null;
                return true;
            }
            cur = cur.next;
        }
    }

    public T getTail(){
        if(head == null) return null;

        Node<T> cur = head;
        while (cur.next != null){
            cur = cur.next;
        }
        return cur.value;
    }

    public Node<T> getHead(){
        return head;
    }

    public int sizeLoop(){
        int cnt = 0;
        Node<T> cur = head;

        while (cur != null){
            cnt++;
            cur = cur.next;
        }

        System.out.println("sizeLoop: " + cnt);
        return cnt;
    }

    public int sizeRecursion(Node<T> curNode){
        if(curNode == null) {
            return 0;
        }
        return 1 + sizeRecursion(curNode.next);
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void printLoop(){
        System.out.print("printLoop: ");
        Node<T> cur = head;

        while(cur != null){
            System.out.print(cur.value + ", ");
            cur = cur.next;
        }
        System.out.println();
    }

    public void printRecursion(Node<T> curNode){
        if(curNode == head){
            System.out.print("printRecursion: ");
        }

        if(curNode != null){
            System.out.print(curNode.value + ", ");
            printRecursion(curNode.next);
        } else {
            System.out.println();
        }
    }

    public void printReverseRecursion(Node<T> cur){
        // https://www.eolymp.com/en/problems/10041
        if(cur == null) {
            System.out.print("printReverseRecursion: ");
            return;
        }

        printReverseRecursion(cur.next);
        if(cur == head){
            System.out.println(cur.value);
        } else {
            System.out.print(cur.value + ", ");
        }
    }

    public void reverseLoop(){
        System.out.println("reverse");
        // https://www.eolymp.com/en/problems/10046

        Node<T> cur = head;
        Node<T> prev = null;
        Node<T> next;

        while(cur != null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        head = prev;
    }

    public void reverseRecursion(){
    }

    public int sum(){
        int sum = 0;
        Node<T> cur = head;

        while(cur != null){
            sum += (int) cur.value;
            cur = cur.next;
        }

        return sum;
    }

    public Node<T> contains(T value){
        Node<T> cur = head;

        while(cur != null){
            if(cur.value.equals(value)) return cur;
            cur = cur.next;
        }
        return null;
    }

    public boolean hasCycle() {
        // https://www.eolymp.com/en/problems/10042 (with hashSet)
        Set<T> set = new HashSet<>();
        Node<T> cur = head;

        while(cur != null){
            if(set.contains(cur.value)) return true;

            set.add(cur.value);
            cur = cur.next;
        }
        return false;
    }

    public boolean hasCycle2(){
        // Two-Pointers Approach. Hare and Tortoise. Floyd’s Cycle-Finding Algorithm
        // https://www.eolymp.com/en/problems/10042
        if(head == null) return false;
        Node<T> curSlow = head;
        Node<T> curFast = head;

        while(true){
            curSlow = curSlow.next;

            if(curFast.next == null) return false;
            curFast = curFast.next.next;

            if(curSlow == null || curFast == null) return false;
            if(curSlow.value.equals(curFast.value)) return true;
        }
    }

    public Node<T> detectCycle(){
        // https://www.eolymp.com/en/problems/10043
        Set<T> set = new HashSet<>();
        Node<T> cur = head;

        while(cur != null){
            if(set.contains(cur.value)) return cur;

            set.add(cur.value);
            cur = cur.next;
        }
        return null;
    }

    public Node<T> intersection(Node<T> head1, Node<T> head2){
        // https://www.eolymp.com/en/problems/10047

        Node<T> cur1 = head1;
        Node<T> cur2 = head2;
        while(true){
            if(cur1 == null || cur2 == null) return null;

            if((int) cur1.value < (int) cur2.value) cur1 = cur1.next;
            else if((int) cur1.value > (int) cur2.value) cur2 = cur2.next;
            else if(cur1.value == cur2.value) return cur1;
        }
    }

    public Node<T> merge(Node<T> cur1, Node<T> cur2){
        // https://www.eolymp.com/en/problems/10044
        return null;
    }
}
