package com.example.gunjansrivastava.arraysandstring.linkedlist;

public class DoubleLinkedList {

    DNode head;
    DNode tail;
    int size;
    public static void main(String[] args){
        DoubleLinkedList dll = new DoubleLinkedList();
        for(int i = 0 ; i < 10 ; i++){
            dll.insertValuesInDLL(new DNode(i));
        }

        /*dll.insertNodeAtBeg(new DNode(10));
        dll.insertNodeAtLast(new DNode(20));
        dll.insertNodeBeforeANode(3 , new DNode(30));
        dll.insertNodeAfterANode(3,new DNode(40));*/
        //dll.deleteNodeAtFirst();
        //dll.deleteNodeAtLast();
        dll.deleteNodeAtIndex(1);
        dll.printValuesInDll();
    }

    private void insertValuesInDLL(DNode node){
        if(head == null){
            head = node;
            tail = node;
        }else{
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        size++;
    }

    private void printValuesInDll(){
        while(size > 0){
            System.out.println(head.data);
            head = head.next;
            size--;
        }
    }

    private void insertNodeAtBeg(DNode node){
        node.prev = null;
        node.next = head;
        head = node;
        size++;
    }

    private void insertNodeAtLast(DNode node){
        tail.next = node;
        node.prev = tail;
        node.next = null;
        tail = node;
        size++;
    }

    private void insertNodeBeforeANode(int index , DNode node){
        DNode temp = head;
        for(int i = 0 ; i < index ; i++){
            temp = temp.next;
        }
        temp.prev.next = node;
        node.prev = temp.prev;
        node.next = temp;
        temp.prev = node;
        size++;
    }

    private void insertNodeAfterANode(int index , DNode node){
        DNode temp = head;
        for(int i = 0 ; i < index; i++){
            temp = temp.next;
        }
        node.next = temp.next;
        node.prev = temp;
        temp.next = node;
        size++;
    }

    private void deleteNodeAtFirst(){
        head = head.next;
        head.prev = null;
        size--;
    }

    private void deleteNodeAtLast(){
        tail.prev = null;
        size--;
    }

    private void deleteNodeAtIndex(int index){
        DNode temp = head;
        for(int i = 0 ; i < index; i++){
            temp = temp.next;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        size--;
    }
}
