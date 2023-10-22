package org.dsa.linkedlist.singlyCircularLinkedList;

public class CNode {

    private int data;
    private CNode next;

    public CNode(int data) {
        this.data = data;
        next = null;
    }

    public CNode getNext() {
        return next;
    }

    public void setNext(CNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return this.data + "-->";
    }
}
