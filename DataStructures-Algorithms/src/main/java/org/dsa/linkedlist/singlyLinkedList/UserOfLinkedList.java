package org.dsa.linkedlist.singlyLinkedList;

public class UserOfLinkedList {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);

        linkedList.insertLast(4);
        linkedList.insertLast(5);
        linkedList.insertFirst(6);
        linkedList.insertByPos(10, 6);

        linkedList.deleteFirst();
        linkedList.deleteLast();
        linkedList.deleteByPos(3);

        linkedList.reverse();

        linkedList.insertLast(20);

        System.out.println(linkedList);

    }
}
