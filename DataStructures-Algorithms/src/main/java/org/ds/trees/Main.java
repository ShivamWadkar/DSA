package org.ds.trees;

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

        BinarySearchTree bst = new BinarySearchTree();

        int[] values = {50, 30, 70, 20, 40, 60, 80};

        for (int value : values) {
            bst.root = bst.insert(bst.root, value);
        }

        binaryTree.inOrder(bst.root);

        System.out.println(bst.search(bst.root, 70));
    }
}
