package org.dsa.linkedlist.doublyLinkedList;

public class DNode {
    private int data;
    private DNode prev;
    private DNode next;

    public DNode(int data) {
        this.data = data;
        prev = null;
        next = null;
    }

    public DNode getPrev() {
        return prev;
    }

    public DNode getNext() {
        return next;
    }

    public void setPrev(DNode prev) {
        this.prev = prev;
    }

    public void setNext(DNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return this.data + "-->";
    }
}
