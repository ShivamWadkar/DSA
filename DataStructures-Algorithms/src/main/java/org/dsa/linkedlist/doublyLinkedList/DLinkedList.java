package org.dsa.linkedlist.doublyLinkedList;

public class DLinkedList {
    private DNode head;
    private DNode tail;

    public void insertFirst(int data) {
        DNode newNode = new DNode(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        }
    }

    @Override
    public String toString() {
        String str = "";
        DNode trav = head;
        while(trav != null) {
            str += trav;
            trav = trav.getNext();
        }
        return str;
    }
}
