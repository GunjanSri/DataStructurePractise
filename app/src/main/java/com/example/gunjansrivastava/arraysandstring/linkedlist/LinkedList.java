package com.example.gunjansrivastava.arraysandstring.linkedlist;

import java.util.HashSet;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for (int i = 0; i < 10; i++) {
            Node node = new Node(i);
            list.insertElement(node);
        }

        /*list.insertAtFirst(new Node(50));
        list.insertAtLast(new Node(60));
        list.insertAtIndex(2, new Node(80));
        list.insertAtIndex(3, new Node(100));
        list.deleteAtFirst();
        list.deleteAtLast();
        list.deleteAtIndex(2);
        list.deleteAtIndex(3);
        list.reverse();*/
        list.insertAtIndex(2, new Node(0));
        list.removeDuplicatesWithoutUsingBuffer();
        list.printList();
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

    private void printList() {
        Node iterator = head;
        while (iterator != null) {
            System.out.println(iterator.data);
            iterator = iterator.next;
        }
    }

    private void insertAtFirst(Node node) {
        node.next = head;
        head = node;
        size++;
    }

    private void insertAtLast(Node node) {
        tail.next = node;
        tail = node;
        size++;
    }

    private void insertAtIndex(int index, Node node) {
        if (index < 0 && index > size) {
            System.out.println("Index is out of bound");
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
        }
    }

    private void deleteAtFirst() {
        head = head.next;
        size--;
    }

    private void deleteAtLast() {
        Node temp = head;
        for (int i = 0; i < size - 1; i++) {
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;
        size--;
    }

    private void deleteAtIndex(int index) {
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    private void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    private void removeDuplicatesUsingBuffer() {
        HashSet<Integer> hashSet = new HashSet<>();
        Node temp = head;
        Node prev = null;
        for (int i = 0; i < size; i++) {
            int data = temp.data;

            if (hashSet.contains(data)) {
                prev.next = temp.next;
            } else {
                hashSet.add(data);
                prev = temp;
            }
            temp = temp.next;
        }
    }

    private void removeDuplicatesWithoutUsingBuffer() {
        Node current = head;
        Node prev = current;
        Node next = current.next;
        while (current.next != null) {
            while (next != null) {
                if (current.data == next.data) {
                    prev.next = next.next;
                    next = prev.next;
                }
                prev = next;
                next = next.next;
            }
            current = current.next;
        }
    }
}
