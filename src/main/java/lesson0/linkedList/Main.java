package lesson0.linkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> linkedListInteger = new MyLinkedList<>();
        linkedListInteger.sizeLoop();
        System.out.println("sizeRecursion: " + linkedListInteger.sizeRecursion(linkedListInteger.getHead()));
        linkedListInteger.addLast(4);
        linkedListInteger.sizeLoop();
        System.out.println("sizeRecursion: " + linkedListInteger.sizeRecursion(linkedListInteger.getHead()));
        linkedListInteger.addLast(3);
        linkedListInteger.sizeLoop();
        System.out.println("sizeRecursion: " + linkedListInteger.sizeRecursion(linkedListInteger.getHead()));
        linkedListInteger.addLast(2);
        linkedListInteger.sizeLoop();
        System.out.println("sizeRecursion: " + linkedListInteger.sizeRecursion(linkedListInteger.getHead()));
        linkedListInteger.addLast(10);

        System.out.println("sizeRecursion: " + linkedListInteger.sizeRecursion(linkedListInteger.getHead()));
        System.out.println("sum: " + linkedListInteger.sum());

        System.out.println("hasCycle: " + linkedListInteger.hasCycle());
        System.out.println("hasCycle2: " + linkedListInteger.hasCycle2());
        System.out.println("detectCycle: " + linkedListInteger.detectCycle());
        linkedListInteger.printLoop();

        System.out.println("--------------------------------------");
        MyLinkedList<String> linkedListString = new MyLinkedList<>();
        printLinkedList(linkedListString);
        linkedListString.addLast("first");
        printLinkedList(linkedListString);
        linkedListString.addLast("second");
        printLinkedList(linkedListString);
        linkedListString.addLast("third");
        printLinkedList(linkedListString);
        linkedListString.addLast("fourth");
        printLinkedList(linkedListString);
        linkedListString.addFirst("zero");

        printLinkedList(linkedListString);
        System.out.println("hasCycle: " + linkedListString.hasCycle());
        System.out.println("hasCycle2: " + linkedListString.hasCycle2());
        System.out.println("detectCycle: " + linkedListString.detectCycle());
        printLinkedList(linkedListString);
        System.out.println("removeFirst: " + linkedListString.removeFirst());
        System.out.println("removeFirst: " + linkedListString.removeFirst());
        System.out.println("removeFirst: " + linkedListString.removeFirst());
        System.out.println("removeLast: " + linkedListString.removeLast());
        System.out.println("removeLast: " + linkedListString.removeLast());
        printLinkedList(linkedListString);
        System.out.println("isEmpty: " + linkedListString.isEmpty());

        System.out.println("getTail: " + linkedListString.getTail());
        System.out.println("getHead: " + linkedListString.getHead());
    }

    public static void printLinkedList(MyLinkedList<String> linkedList){
        linkedList.sizeLoop();
        System.out.println("sizeRecursion: " + linkedList.sizeRecursion(linkedList.getHead()));
        linkedList.printLoop();
        linkedList.printRecursion(linkedList.getHead());
        linkedList.printReverseRecursion(linkedList.getHead());
    }
}
