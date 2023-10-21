package org.dsa.linkedlist.doublyLinkedList;

public class DLinkedList {
    private DNode head;
    private DNode tail;

    public void insertFirst(int data) {
        DNode newNode = new DNode(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        }
    }

    public void insertLast(int data) {
        if (head == null) {
            insertFirst(data);
        } else {
            DNode newNode = new DNode(data);
            newNode.setPrev(tail);
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    public void insertByPosition(int data, int pos) {
        if (pos == 1) {
            insertFirst(data);
        } else if (pos == noOfNodes() + 1) {
            insertLast(data);
        } else if (pos > 1 && pos < noOfNodes() + 1) {
            DNode newNode = new DNode(data);
            DNode trav = head;
            int count = 1;
            while (count < pos - 1) {
                trav = trav.getNext();
                count++;
            }
            newNode.setPrev(trav);
            newNode.setNext(trav.getNext());
            trav.getNext().setPrev(newNode);
            trav.setNext(newNode);
        } else {
            System.out.println("Invalid Position");
        }
    }

    public void deleteFirst() {
        if (head == tail) {
            System.out.println("DLL is empty");
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            DNode temp = head;
            head = head.getNext();
            head.setPrev(null);
            temp.setNext(null);
        }
    }

    public void deleteLast() {
        if (head == tail) {
            System.out.println("DLL is empty");
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            DNode temp = tail;
            tail = tail.getPrev();
            tail.setNext(null);
            temp.setPrev(null);
        }
    }

    public void deleteByPosition(int pos) {
        if (pos == 1) {
            deleteFirst();
        } else if (pos == noOfNodes()) {
            deleteLast();
        } else if (pos > 1 && pos < noOfNodes()) {
            DNode trav = head;
            int count = 1;
            while (count < pos - 1) {
                trav = trav.getNext();
                count++;
            }
            DNode temp = trav.getNext();
            trav.setNext(temp.getNext());
            temp.getNext().setPrev(trav);
            temp.setNext(null);
            temp.setPrev(null);
        }
    }

    public void reverse() {
        DNode trav = head;
        while (trav != null) {
            DNode temp = trav.getNext();
            trav.setNext(trav.getPrev());
            trav.setPrev(temp);
            trav = temp;
        }
        DNode temp = head;
        head = tail;
        tail = temp;
    }

    public void empty() {
        DNode trav = head;
        DNode travn = head.getNext();
        while (travn != null) {
            trav.setNext(null);
            trav.setPrev(null);
            trav = travn;
            travn = travn.getNext();
        }
        head = tail = null;
    }

    private int noOfNodes() {
        DNode trav = head;
        int count = 0;
        while (trav != null) {
            trav = trav.getNext();
            count++;
        }
        return count;
    }

    @Override
    public String toString() {
        String str = "";
        DNode trav = head;
        while (trav != null) {
            str += trav;
            trav = trav.getNext();
        }
        return str;
    }
}
