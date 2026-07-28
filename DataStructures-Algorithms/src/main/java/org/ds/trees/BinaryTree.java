package org.ds.trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    private Node root;

    public Node createTree(){
        root = new Node(40);
        root.setLeft(new Node(10));
        root.setRight(new Node(60));

        root.getLeft().setLeft(new Node(5));
        root.getLeft().setRight(new Node(35));

        root.getRight().setRight(new Node(70));
        return root;
    }

    // Traversal - DFS

    // VLR
    public void preOrder(Node root) {
        if (root == null) return;

        System.out.print(root.getData()+ ",");
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }

    // LRV
    public void postOrder(Node root){
        if (root == null) return;

        postOrder(root.getLeft());
        postOrder(root.getRight());
        System.out.print(root.getData()+ ",");
    }

    // LVR
    public void inOrder(Node root){
        if(root == null) return;

        inOrder(root.getLeft());
        System.out.print(root.getData()+ ",");
        inOrder(root.getRight());
    }

    // BFS
    public void levelOrder(Node root){
        if (root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            Node current = queue.poll();
            System.out.print(current.getData() + ",");

            if(current.getLeft() != null) queue.offer(current.getLeft());
            if(current.getRight() != null) queue.offer(current.getRight());
        }
    }

    public int heightOfTree(Node root){
        if (root == null) return 0;
        return 1 + Math.max(heightOfTree(root.getLeft()), heightOfTree(root.getRight()));
    }

    public int countNodes(Node root){
        if (root == null) return 0;
        return 1 + countNodes(root.getLeft()) + countNodes(root.getRight());
    }

    public int sum(Node root){
        if (root == null) return 0;
        return root.getData() + sum(root.getLeft()) + sum(root.getRight());
    }
}
