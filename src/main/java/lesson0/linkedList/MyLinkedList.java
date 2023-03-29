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
        System.out.print("reverseLoop: ");
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
        System.out.println("done");
    }

    public void reverseRecursionV1(Node<T> cur){
        if(cur == null) return;
        else if(cur.next == null) {
            head = cur;
            System.out.println("done");
            return;
        }
        else if(cur == head) System.out.print("reverseRecursion: ");

        if(cur.next != null) reverseRecursionV1(cur.next);
        else head = cur;

        cur.next.next = cur;
        cur.next = null;
    }

    public void reverseRecursionV2(Node<T> cur){
        if(cur == null) return;
        else if(cur == head) System.out.print("reverseRecursion: ");

        if(cur.next != null) reverseRecursionV2(cur.next);
        else head = cur;

        Node<T> prev = cur;
        cur = cur.next;
        Node<T> next = null;
        if(cur != null) next = cur.next;

        if(next != null) next.next = cur;
        if(cur != null) cur.next = prev;
        prev.next = null;

        if(cur == null) System.out.println("done");
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
        while(cur1 != null && cur2 != null){
            if((int) cur1.value < (int) cur2.value) cur1 = cur1.next;
            else if((int) cur1.value > (int) cur2.value) cur2 = cur2.next;
            else if(cur1.value == cur2.value) return cur1;
        }
        return null;
    }

    public Node<T> merge(Node<T> cur1, Node<T> cur2){
        // https://www.eolymp.com/en/problems/10044

        if(cur1 == null) return cur2;
        if(cur2 == null) return cur1;
        if((int) cur1.value <= (int) cur2.value){
            cur1.next = merge(cur1.next, cur2);
            return cur1;
        } else {
            cur2.next = merge(cur1, cur2.next);
            return cur2;
        }
    }

    public void printWithGivenHead(Node<T> head){
        System.out.print("printWithHead: ");
        Node<T> cur = head;
        while(cur != null){
            System.out.print(cur.value + ", ");
            cur = cur.next;
        }
        System.out.println();
    }

    public Node<T> deleteFirstElement(Node<T> head, int element){
        Node<T> cur = head;
        Node<T> prev = head;

        while(cur != null){
            if(cur.value.equals(element)){
                if(prev == head) return null;
                else prev.next = cur.next;
            }
            prev = cur;
            cur = cur.next;
        }

        return head;
    }

    public Node<T> MiddleElement(Node<T> head){
        // https://www.eolymp.com/en/problems/10380
        int cnt = 0;
        Node<T> cur = head;
        while(cur != null){
            cnt++;
            cur = cur.next;
        }

        if(cnt%2 == 1) cnt++;
        int mid = cnt / 2;
        cnt = 1;
        cur = head;
        while(cur != null){
            cnt++;
            cur = cur.next;

            if(cnt == mid) {
                return cur;
            }
        }
        return head;
    }

    public int CycleLength(Node<T> head) {
        // https://www.eolymp.com/en/problems/10763
        Set<Node<T>> set = new HashSet<>();
        Node<T> cur = head;
        int cnt = -1;
        Node<T> cycleBegin;

        while(cur != null){
            if(set.contains(cur)){
                cycleBegin = cur;
                cnt = 1;
                while(true){
                    cur = cur.next;
                    if(cycleBegin.equals(cur)){
                        return cnt;
                    }
                    cnt++;
                }
            } else{
                set.add(cur);
                cur = cur.next;
            }
        }
        return cnt;
    }
}
