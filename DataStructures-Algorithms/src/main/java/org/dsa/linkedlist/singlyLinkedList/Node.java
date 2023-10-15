package org.dsa.linkedlist.singlyLinkedList;

public class Node {

    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return this.data + "-->";
    }
}
