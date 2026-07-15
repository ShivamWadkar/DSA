package org.dsa.stack;

public class StackMain {

    public static void main(String[] args){
        Stack stack = new Stack(5);
        stack.push(2);
        stack.push(5);
        stack.push(8);
        stack.push(7);
        stack.push(10);
        stack.push(11);
        stack.pop();

        stack.print();
    }
}
