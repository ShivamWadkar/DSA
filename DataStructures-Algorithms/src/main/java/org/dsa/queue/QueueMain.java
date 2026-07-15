package org.dsa.queue;

public class QueueMain {

    public static void main(String[] args){
        Queue queue = new Queue(2);
        queue.insert(1);
        queue.insert(2);
        queue.delete();
        queue.insert(3);

        queue.print();
    }
}
