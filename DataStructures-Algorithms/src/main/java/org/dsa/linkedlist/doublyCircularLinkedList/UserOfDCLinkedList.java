package org.dsa.linkedlist.doublyCircularLinkedList;

public class UserOfDCLinkedList {

    public static void main(String[] args) {
        DCLinkedList linkedList = new DCLinkedList();

        linkedList.insertFirst(4);
        linkedList.insertFirst(3);
        linkedList.insertFirst(2);
        linkedList.insertFirst(1);

        linkedList.insertLast(10);

        linkedList.insertByPosition(20, 4);

        linkedList.deleteFirst();
        linkedList.deleteLast();
        linkedList.deleteByPosition(3);

        linkedList.reverse();

        linkedList.empty();

        System.out.println(linkedList);
    }
}
