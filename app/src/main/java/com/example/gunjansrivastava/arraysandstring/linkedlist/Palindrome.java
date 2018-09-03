package com.example.gunjansrivastava.arraysandstring.linkedlist;

public class Palindrome {

    static Node head;
    Node tail;
    int size;

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        palindrome.initializeList(new Node(1));
        palindrome.initializeList(new Node(3));
        palindrome.initializeList(new Node(5));
        palindrome.initializeList(new Node(8));
        palindrome.initializeList(new Node(5));
        palindrome.initializeList(new Node(3));
        palindrome.initializeList(new Node(1));

        Node reversedList = palindrome.reverseList(head);
        System.out.println(palindrome.compareList(reversedList));
    }

    private void initializeList(Node node) {
        if (head == null) {
            head = node;
            tail = head;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    // reverse list
    private Node reverseList(Node node) {
        Node head = null;
        while (node != null) {
            Node n = new Node(node.data);
            n.next = head;
            head = n;
            node = node.next;
        }
        return head;
    }

    private boolean compareList(Node reverseHead) {
        for(int i = 0 ; i < size/2 ; i++){
            if(head.data != reverseHead.data)
                return false;
            head = head.next;
            reverseHead = reverseHead.next;
        }
        return true;
    }
}
