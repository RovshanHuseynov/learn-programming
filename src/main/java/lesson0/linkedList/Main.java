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
        linkedListInteger.reverseLoop();
        linkedListInteger.printLoop();
        linkedListInteger.reverseRecursionV1(linkedListInteger.getHead());
        linkedListInteger.printLoop();
        linkedListInteger.reverseRecursionV2(linkedListInteger.getHead());
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

        System.out.println("--------------------------------------");
        MyLinkedList<Integer> test1 = new MyLinkedList<>();
        test1.addLast(1);
        test1.addLast(2);
        test1.addLast(3);
        test1.addLast(4);
        test1.addLast(7);
        test1.addLast(8);
        test1.addLast(9);
        MyLinkedList<Integer> test2 = new MyLinkedList<>();
        test2.addLast(5);
        test2.addLast(6);
        test2.addLast(7);
        test2.addLast(8);
        test2.addLast(9);
        System.out.println(test1.intersection(test1.getHead(), test2.getHead()));

        System.out.println("--------------------------------------");
        MyLinkedList<Integer> test3 = new MyLinkedList<>();
        test3.addLast(1);
        test3.addLast(4);
        test3.addLast(7);
        test3.addLast(8);
        test3.addLast(9);
        MyLinkedList<Integer> test4 = new MyLinkedList<>();
        test4.addLast(2);
        test4.addLast(6);
        test4.addLast(8);
        test4.addLast(10);
        test3.printWithGivenHead(test3.merge(test3.getHead(), test4.getHead()));

        System.out.println("--------------------------------------");
        MyLinkedList<Integer> test5 = new MyLinkedList<>();
        test5.addLast(1);
        test5.addLast(2);
        test5.addLast(5);
        test5.addLast(1);
        System.out.println(test5.DeleteFirstElement(test5.getHead(), 1));

        MyLinkedList<Integer> test6 = new MyLinkedList<>();
        test6.addLast(1);
        test6.addLast(2);
        test6.addLast(3);
        test6.addLast(4);
        test6.addLast(5);
        System.out.println(test6.MiddleElement(test6.getHead()));

        MyLinkedList<Integer> test7 = new MyLinkedList<>();
        test7.addLast(1);
        test7.addLast(2);
        test7.addLast(3);
        test7.addLast(4);
        test7.addLast(5);
        test7.addLast(3);
        System.out.println(test7.CycleLength(test7.getHead()));

        MyLinkedList<Integer> test8 = new MyLinkedList<>();
        test8.addLast(1);
        test8.addLast(2);
        test8.addLast(3);
        test8.addLast(4);
        test8.addLast(5);
        test8.addLast(3);
        System.out.println(test8.DistanceToCycle(test8.getHead()));

        MyLinkedList<Integer> test9 = new MyLinkedList<>();
        test9.addLast(1);
        test9.addLast(2);
        test9.addLast(3);
        test9.addLast(4);
        test9.addLast(5);
        test9.addLast(3);
        System.out.println(test9.DistanceToCycle2(test9.getHead()));

        MyLinkedList<Integer> test10 = new MyLinkedList<>();
        test10.addLast(1);
        test10.addLast(2);
        test10.addLast(3);
        test10.addLast(4);
        test10.addLast(5);
        test10.addLast(3);
        System.out.println(test10.removeCycle(test10.getHead()));
    }

    public static void printLinkedList(MyLinkedList<String> linkedList){
        linkedList.sizeLoop();
        System.out.println("sizeRecursion: " + linkedList.sizeRecursion(linkedList.getHead()));
        linkedList.printLoop();
        linkedList.printRecursion(linkedList.getHead());
        linkedList.printReverseRecursion(linkedList.getHead());
    }
}
