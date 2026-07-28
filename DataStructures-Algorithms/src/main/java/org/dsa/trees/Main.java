package org.dsa.trees;

import javax.sound.midi.SysexMessage;

public class Main {

    public static void main(String[] args){
        BinaryTree binaryTree = new BinaryTree();
        Node root = binaryTree.createTree();
        System.out.println("Pre order");
        binaryTree.preOrder(root);
        System.out.println("Post order");
        binaryTree.postOrder(root);
        System.out.println("In order");
        binaryTree.inOrder(root);
        System.out.println("Level order");
        binaryTree.levelOrder(root);
        System.out.println();
        System.out.println("Height: "+binaryTree.heightOfTree(root));
        System.out.println("Node count: "+binaryTree.countNodes(root));
        System.out.println("Sum: "+binaryTree.sum(root));
    }
}
