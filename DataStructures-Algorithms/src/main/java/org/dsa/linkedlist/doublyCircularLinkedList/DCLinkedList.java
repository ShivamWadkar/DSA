package org.dsa.linkedlist.doublyCircularLinkedList;

import org.dsa.linkedlist.doublyLinkedList.DNode;

public class DCLinkedList {

    private DCNode head;
    private DCNode tail;

    public void insertFirst(int data) {
        DCNode newNode = new DCNode(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.setNext(head);
            head.setPrev(tail);
        } else {
            newNode.setNext(head);
            newNode.setPrev(tail);
            head.setPrev(newNode);
            tail.setNext(newNode);
            head = newNode;
        }
    }

    public void insertLast(int data) {
        DCNode newNode = new DCNode(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.setNext(head);
            head.setPrev(tail);
        } else {
            newNode.setPrev(tail);
            newNode.setNext(head);
            tail.setNext(newNode);
            tail = newNode;
            head.setPrev(tail);
        }
    }

    public void insertByPosition(int data, int pos) {
        if (pos == 1) {
            insertFirst(data);
        } else if (pos == noOfNodes() + 1) {
            insertLast(data);
        } else if (pos > 1 && pos < noOfNodes() + 1) {
            DCNode newNode = new DCNode(data);
            DCNode trav = head;
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
        if (head == null) {
            System.out.println("DCLL is empty");
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            DCNode temp = head.getNext();
            tail.setNext(temp);
            temp.setPrev(tail);
            head.setNext(null);
            head.setPrev(null);
            head = temp;
        }
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("DCLL is empty");
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            DCNode temp = tail.getPrev();
            temp.setNext(head);
            head.setPrev(temp);
            tail.setNext(null);
            tail.setPrev(null);
            tail = temp;
        }
    }

    public void deleteByPosition(int pos) {
        if (pos == 1) {
            deleteFirst();
        } else if (pos == noOfNodes()) {
            deleteLast();
        } else if (pos > 1 && pos < noOfNodes()) {
            DCNode trav = head;
            int count = 1;
            while (count < pos - 1) {
                trav = trav.getNext();
                count++;
            }
            DCNode temp = trav.getNext();
            trav.setNext(temp.getNext());
            temp.getNext().setPrev(trav);
            temp.setNext(null);
            temp.setPrev(null);
        }
    }

    public void reverse() {
        if (head == null) {
            System.out.println("DCLL is empty");
        } else {
            DCNode trav = head;
            do {
                DCNode temp = trav.getNext();
                trav.setNext(trav.getPrev());
                trav.setPrev(temp);
                trav = temp;
            } while (trav != head);
            DCNode temp = head;
            head = tail;
            tail = temp;
        }
    }

    public void empty() {
        if(head == null){
            System.out.println("DCLL is empty");
        } else {
            DCNode trav = head;
            do{
                DCNode temp = trav.getNext();
                trav.setNext(null);
                trav.setPrev(null);
                trav = temp;
            }while(trav != head);
            head = tail = null;
        }
    }

    private int noOfNodes() {
        DCNode trav = head;
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
            return "DCLL is empty";
        else {
            DCNode trav = head;
            do {
                str += trav;
                trav = trav.getNext();
            } while (trav != head);
            return str;
        }
    }
}
