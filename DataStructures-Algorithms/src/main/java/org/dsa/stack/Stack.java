package org.dsa.stack;

public class Stack {
    private int top;
    private final int[] arr;

    public Stack(){
        top = -1;
        arr = new int[5];
    }

    public Stack(int size){
        top = -1;
        arr = new int[size];
    }

    public void push(int value){
        if(top == arr.length - 1){
            System.out.println("Stack overflow");
        } else {
            top++;
            arr[top] = value;
        }
    }

    public int pop(){
        int value = -1;
        if(top == -1){
            System.out.println("Stack underflow");
        } else {
            value = arr[top];
            top--;
        }
        return value;
    }

    public void print(){
        // Empty logic
        for(int i = 0; i <= top;i++){
            System.out.println(arr[i]);
        }
    }
}
