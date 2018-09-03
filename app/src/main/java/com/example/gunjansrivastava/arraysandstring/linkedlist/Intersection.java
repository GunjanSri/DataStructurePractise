package com.example.gunjansrivastava.arraysandstring.linkedlist;

public class Intersection {
    private Node firstHead;
    private Node secondHead;
    private Node firstTail;
    private Node secondTail;
    private int firstListSize;
    private int secondListSize;

    public static void main(String[] args) {
        Intersection list = new Intersection();
        list.initializeFirstList(new Node(3));
        list.initializeFirstList(new Node(6));
        list.initializeFirstList(new Node(14));
        list.initializeFirstList(new Node(15));
        list.initializeFirstList(new Node(30));

        list.initializeSecondList(new Node(14));
        list.initializeSecondList(new Node(15));
        list.initializeSecondList(new Node(30));

        list.findIntersectNode();
    }

    private void initializeFirstList(Node node) {
        if (firstHead == null) {
            firstHead = node;
            firstTail = node;
        } else {
            firstTail.next = node;
            firstTail = node;
        }
        firstListSize++;
    }

    private void initializeSecondList(Node node) {
        if (secondHead == null) {
            secondHead = node;
            secondTail = node;
        } else {
            secondTail.next = node;
            secondTail = node;
        }
        secondListSize++;
    }

    private void findIntersectNode() {
        if (firstTail.data != secondTail.data) {
            System.out.println("Tail is not equal , intersection not possible");
        }
        int d = 0;
        int result = 0;
        if (firstListSize > secondListSize) {
            d = firstListSize - secondListSize;
            result = intersectNode(d, firstHead, secondHead);
        } else {
            d = secondListSize - firstListSize;
            result = intersectNode(d, secondHead, firstHead);
        }
        System.out.println("Result:" + result);
    }

    private int intersectNode(int diff, Node longer, Node shorter) {
        for (int i = 0; i < diff; i++) {
            longer = longer.next;
        }
        while (longer != null && shorter != null) {
            if (longer.data == shorter.data) {
                return longer.data;
            }
            longer = longer.next;
            shorter = shorter.next;
        }
        return 0;
    }
}
