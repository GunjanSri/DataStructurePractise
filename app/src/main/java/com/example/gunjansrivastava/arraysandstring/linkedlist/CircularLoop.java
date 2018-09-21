package com.example.gunjansrivastava.arraysandstring.linkedlist;

public class CircularLoop implements Cloneable{
    static Node head;
    static Node tail;
    int size;

    public static void main(String[] args){
        CircularLoop circularLoop = new CircularLoop();
        circularLoop.initializeList(new Node(50));
        circularLoop.initializeList(new Node(20));
        circularLoop.initializeList(new Node(15));
        circularLoop.initializeList(new Node(4));
        circularLoop.initializeList(new Node(14));
        circularLoop.initializeList(new Node(10));
        circularLoop.initializeList(new Node(11));
        circularLoop.initializeList(new Node(7));
        circularLoop.initializeList(new Node(14));
        circularLoop.initializeList(new Node(16));

        tail.next = head.next.next.next.next;
        circularLoop.findLoop();
        //circularLoop.printList();
    }

    private void initializeList(Node node){
        if(head == null){
            head = node;
            tail = node;
        }else{
            tail.next = node;
            tail = node;
        }
        size++;
    }

    private void printList(){
        while(head != null){
            System.out.println(head.data);
            head = head.next;
        }
    }

    private void findLoop(){
        Node ptr1 = head;
        Node ptr2 = head;

        while(ptr1 != null && ptr2 != null && ptr2.next != null){
            ptr1 = ptr1.next;
            ptr2 = ptr2.next.next;

            if(ptr1 == ptr2){
                System.out.println("Loop detected");

                ptr1 = head;
                while(ptr1 != ptr2){
                    ptr1 = ptr1.next;
                    ptr2 = ptr2.next;
                }
                System.out.print(ptr1.data);
                return;
            }
        }
    }

    private Node remove(Node current , Node loopNode){
        while(current != loopNode){
           current = current.next;
           loopNode = loopNode.next;
        }
        return loopNode;
    }

    private void removeLoop(Node loop , Node head){
        Node current = head;
        Node ptr1 = head;
        Node ptr2 = loop;

        while(1 == 1) {
            while (ptr2.next != loop && ptr2.next != ptr1) {
                ptr2 = ptr2.next;
            }
            if(ptr2.next == ptr1){
                break;
            }
            ptr1 = ptr1.next;
        }
        ptr2.next = null;
        head = current;
    }
}
