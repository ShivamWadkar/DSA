package org.dsa.linkedlist.singlyLinkedList;

public class LinkedList {
    private Node head;
    private Node tail;

    public void insertFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
    }

    public void insertLast(int data) {
        Node newNode = new Node(data);
        if (tail != null) {
            tail.setNext(newNode);
            tail = newNode;
        } else {
            insertFirst(data);
        }
    }

    public void insertByPos(int data, int pos) {
        if (pos == 1) {
            insertFirst(data);
        } else if (pos == (noOfNodes() + 1)) {
            insertLast(data);
        } else if ((pos > 1) && (pos < (noOfNodes() + 1))) {
            Node newNode = new Node(data);
            Node trav = head;
            int count = 1;
            while (count < pos - 1) {
                trav = trav.getNext();
                count++;
            }
            newNode.setNext(trav.getNext());
            trav.setNext(newNode);
        } else {
            System.out.println("Invalid position");
        }
    }

    public void deleteFirst() {
        if (head == null)
            System.out.println("SLL is empty");
        else if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.getNext();
        }
    }

    public void deleteLast() {
        if (head == null)
            System.out.println("SLL is empty");
        else if (head == tail) {
            head = null;
            tail = null;
        } else {
            Node trav = head;
            while (trav.getNext() != tail) {
                trav = trav.getNext();
            }
            tail = trav;
            tail.setNext(null);
        }
    }

    public void deleteByPos(int pos) {
        if (pos == 1) {
            deleteFirst();
        } else if (pos == (noOfNodes())) {
            deleteLast();
        } else {
            Node trav = head;
            int count = 1;
            while(count < pos -1) {
                trav = trav.getNext();
                count++;
            }
            Node temp = trav.getNext();
            trav.setNext(temp.getNext());
            temp.setNext(null);
        }
    }

    public void reverse() {
        Node travp = null;
        Node trav = head;
        Node travn = head;
        tail = head;
        while(trav != null) {
            travn = travn.getNext();
            trav.setNext(travp);
            travp = trav;
            trav = travn;
        }
        head = travp;
    }

    private int noOfNodes() {
        int count = 1;
        Node trav = head;
        while (trav.getNext() != null) {
            trav = trav.getNext();
            count++;
        }
        return count;
    }

    @Override
    public String toString() {
        String str = "";
        Node trav = head;
        while (trav != null) {
            str += trav;
            trav = trav.getNext();
        }
        return str;
    }
}
