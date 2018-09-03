package com.example.gunjansrivastava.arraysandstring.linkedlist;

public class SumList {
    private Node listOneHead;
    private Node listOneTail;
    private int listOneSize;
    private int listTwoSize;
    private Node listTwoHead;
    private Node listTwoTail;

    public static void main(String[] args) {
        SumList sumList = new SumList();
        sumList.sumList(617, 421);

        sumList.printList();
    }

    private void printList() {
        while (listOneHead != null) {
            System.out.println(listOneHead.data);
            listOneHead = listOneHead.next;
        }
    }

    private void sumList(int num1, int num2) {
        while (num1 != 0) {
            int mod = num1 % 10;

            Node node = new Node(mod);
            if (listOneHead == null) {
                listOneHead = node;
                listOneTail = listOneHead;
            } else {
                listOneTail.next = node;
                listOneTail = node;
            }
            num1 = num1 / 10;
            listOneSize++;
        }
        while (num2 != 0) {
            int mod = num2 % 10;

            Node node = new Node(mod);
            if (listTwoHead == null) {
                listTwoHead = node;
                listTwoTail = listTwoHead;
            } else {
                listTwoTail.next = node;
                listTwoTail = node;
            }
            num2 = num2 / 10;
            listTwoSize++;
        }

        if (listOneSize == listTwoSize) {
            int carry = 0;
            Node listOneTemp = listOneHead;
            while (listOneTemp != null && listTwoHead != null) {
                int sum = listOneTemp.data + listTwoHead.data + carry;
                if (sum > 10) {
                    carry = sum / 10;
                    listOneTemp.data = sum % 10;
                } else {
                    listOneTemp.data = sum;
                }
                listOneTemp = listOneTemp.next;
                listTwoHead = listTwoHead.next;
            }
        }

        reverseList();
    }

    private void reverseList() {
        Node current = listOneHead;
        Node prev = null;
        Node next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        listOneHead = prev;
    }
}
