package com.example.gunjansrivastava.arraysandstring.linkedlist;

public class Partition {
    private Node head;
    private Node tail;
    private int size;

    public static void main(String[] args) {
        Partition list = new Partition();
        list.insertElement(new Node(3));
        list.insertElement(new Node(5));
        list.insertElement(new Node(8));
        list.insertElement(new Node(10));
        list.insertElement(new Node(5));
        list.insertElement(new Node(2));
        list.insertElement(new Node(1));

        Node result = list.partition(5);
        list.printList(result);
        //list.partition(5);
    }

    private void insertElement(Node node) {
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    private void printList(Node node) {
        Node iterator = node;
        while (iterator != null) {
            System.out.println(iterator.data);
            iterator = iterator.next;
        }
    }

    private Node partition(int pivot) {
        Node headNode = head;
        Node tailNode = head;
        while (head != null) {
            Node next = head.next;
            if (head.data < pivot) {
                head.next = headNode;
                headNode = head;
            } else {
                tailNode.next = head;
                tailNode = head;
            }
            head = next;
        }
        tailNode.next = null;

        return headNode;
    }

    private Node partitionList(int pivot) {
        Node beforeStart = null;
        Node beforeEnd = null;
        Node afterStart = null;
        Node afterEnd = null;

        while (head != null) {
            Node next = head.next;
            head.next = null;
            if (head.data < pivot) {
                if (beforeStart == null) {
                    beforeStart = head;
                    beforeEnd = beforeStart;
                } else {
                    beforeEnd.next = head;
                    beforeEnd = head;
                }
            } else {
                if (afterStart == null) {
                    afterStart = head;
                    afterEnd = afterStart;
                } else {
                    afterEnd.next = head;
                    afterEnd = head;
                }
            }
            head = next;
        }
        if (beforeStart == null) {
            return afterStart;
        }
        beforeEnd.next = afterStart;
        return beforeStart;
    }
}
