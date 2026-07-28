package org.ds.trees;

public class Node {
    private int data;
    private Node left;
    private Node right;

    public Node(int data) {
        this.data = data;
    }

    public int getData(){
        return this.data;
    }

    public Node getLeft(){
        return this.left;
    }

    public Node getRight(){
        return this.right;
    }

    public void setData(int data){
        this.data = data;
    }

    public void setLeft(Node node){
        this.left = node;
    }

    public void setRight(Node node){
        this.right = node;
    }
}
