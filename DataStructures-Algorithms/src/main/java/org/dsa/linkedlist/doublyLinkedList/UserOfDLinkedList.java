package org.dsa.linkedlist.doublyLinkedList;

public class UserOfDLinkedList {

    public static void main(String[] args) {
        DLinkedList linkedList = new DLinkedList();
        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);

        System.out.println(linkedList);
    }
}
