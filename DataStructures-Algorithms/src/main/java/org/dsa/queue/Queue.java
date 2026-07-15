package org.dsa.queue;

public class Queue {

    private int f;
    private int r;
    private int[] arr;

    public Queue(){
        f = r = -1;
        arr = new int[5];
    }

    public Queue(int size){
        f = r = -1;
        arr = new int[size];
    }

    public void insert(int value){
        if(r == arr.length - 1){
            System.out.println("Queue is full");
        } else if(r == -1){
            f++; r++;
            arr[r] = value;
        } else {
            r++;
            arr[r] = value;
        }
    }

    public int delete(){
        int value = -1;
        if(f == -1){
            System.out.println("Queue is empty");
        } else if(f == r){
            value = arr[f];
            f = r = -1;
        } else {
            value = arr[f];
            f++;
        }
        return value;
    }

    public void print(){
        if(f == -1){
            System.out.println("Queue is empty");
        }
        int curr = f;
        while(curr <= r){
            System.out.println(arr[curr]);
            curr++;
        }
    }
}
