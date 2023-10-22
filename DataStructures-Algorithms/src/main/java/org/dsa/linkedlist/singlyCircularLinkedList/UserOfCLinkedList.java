package org.dsa.linkedlist.singlyCircularLinkedList;

public class UserOfCLinkedList {

    public static void main(String[] args) {
        CLinkedList linkedList = new CLinkedList();
        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
        linkedList.insertFirst(4);
        linkedList.insertFirst(5);

        linkedList.insertLast(10);

        linkedList.insertByPos(50, 3);

        linkedList.deleteFirst();
        linkedList.deleteLast();
        linkedList.deleteByPos(2);

        linkedList.reverse();

        linkedList.empty();

        System.out.println(linkedList);
    }
}
