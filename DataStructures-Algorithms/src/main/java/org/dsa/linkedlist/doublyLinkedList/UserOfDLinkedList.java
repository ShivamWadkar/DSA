package org.dsa.linkedlist.doublyLinkedList;

public class UserOfDLinkedList {

    public static void main(String[] args) {
        DLinkedList linkedList = new DLinkedList();
        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
        linkedList.insertLast(10);
        linkedList.insertLast(20);

        linkedList.insertByPosition(30, 3);

        linkedList.deleteFirst();
        linkedList.deleteLast();

        linkedList.deleteByPosition(3);

        linkedList.reverse();

        linkedList.empty();

        System.out.println(linkedList);
    }
}
