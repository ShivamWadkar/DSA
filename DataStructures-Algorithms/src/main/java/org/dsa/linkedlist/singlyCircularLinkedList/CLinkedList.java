package org.dsa.linkedlist.singlyCircularLinkedList;

import org.dsa.linkedlist.singlyLinkedList.Node;

public class CLinkedList {

    private CNode head;
    private CNode tail;

    public void insertFirst(int data) {
        CNode newNode = new CNode(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.setNext(head);
        } else {
            newNode.setNext(head);
            head = newNode;
            tail.setNext(head);
        }
    }

    public void insertLast(int data) {
        if (head == null) {
            insertFirst(data);
        } else {
            CNode newNode = new CNode(data);
            tail.setNext(newNode);
            tail = newNode;
            tail.setNext(head);
        }
    }

    public void insertByPos(int data, int pos) {
        if (pos == 1) {
            insertFirst(data);
        } else if (pos == (noOfNodes() + 1)) {
            insertLast(data);
        } else if ((pos > 1) && (pos < (noOfNodes() + 1))) {
            CNode newNode = new CNode(data);
            CNode trav = head;
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
        if (head == null) {
            System.out.println("SCLL is empty");
        } else if (head == tail) {
            tail = null;
            head = null;
        } else {
            CNode temp = head.getNext();
            tail.setNext(temp);
            head.setNext(null);
            head = temp;
        }
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("SCLL is empty");
        } else if (head == tail) {
            tail = null;
            head = null;
        } else {
            CNode trav = head;
            while (trav.getNext() != tail) {
                trav = trav.getNext();
            }
            trav.setNext(head);
            tail.setNext(null);
            tail = trav;
        }
    }

    public void deleteByPos(int pos) {
        if (pos == 1) {
            deleteFirst();
        } else if (pos == (noOfNodes())) {
            deleteLast();
        } else if (pos > 1 && pos < noOfNodes()) {
            CNode trav = head;
            int count = 1;
            while (count < pos - 1) {
                trav = trav.getNext();
                count++;
            }
            CNode temp = trav.getNext();
            trav.setNext(temp.getNext());
            temp.setNext(null);
        } else {
            System.out.println("Invalid position");
        }
    }

    public void reverse() {
        CNode travp = tail;
        CNode trav = head;
        CNode travn = head;
        do {
            travn = travn.getNext();
            trav.setNext(travp);
            travp = trav;
            trav = travn;
        } while (trav != head);
        tail = head;
        head = travp;
    }

    public void empty() {
        if (head == null) {
            System.out.println("SCLL is empty");
        } else {
            CNode trav = head;
            CNode travn = head.getNext();
            while (travn.getNext() != null) {
                trav.setNext(null);
                trav = travn;
                travn = travn.getNext();
            }
            head = tail = null;
        }
    }

    private int noOfNodes() {
        CNode trav = head;
        int count = 0;
        do {
            trav = trav.getNext();
            count++;
        } while (trav != head);
        return count;
    }

    @Override
    public String toString() {
        String str = "";
        if (head == null)
            return str += "SCLL is empty";
        CNode trav = head;
        do {
            str += trav;
            trav = trav.getNext();
        } while (trav != head);
        return str;
    }
}
