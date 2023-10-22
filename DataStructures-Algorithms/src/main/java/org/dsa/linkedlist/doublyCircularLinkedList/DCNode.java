package org.dsa.linkedlist.doublyCircularLinkedList;

public class DCNode {
    private int data;
    private DCNode prev;
    private DCNode next;

    public DCNode(int data) {
        this.data = data;
        prev = null;
        next = null;
    }

    public DCNode getPrev() {
        return prev;
    }

    public DCNode getNext() {
        return next;
    }

    public void setPrev(DCNode prev) {
        this.prev = prev;
    }

    public void setNext(DCNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return this.data + "-->";
    }
}
