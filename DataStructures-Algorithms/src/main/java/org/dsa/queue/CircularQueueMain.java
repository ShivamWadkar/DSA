package org.dsa.queue;

public class CircularQueueMain {

    public static void main(String[] args){
        CircularQueue circularQueue = new CircularQueue(2);
        circularQueue.insert(1);
        circularQueue.insert(2);
        circularQueue.delete();
        circularQueue.insert(3);

        circularQueue.print();
    }
}
