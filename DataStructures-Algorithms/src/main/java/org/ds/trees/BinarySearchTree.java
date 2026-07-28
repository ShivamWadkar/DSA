package org.ds.trees;

public class BinarySearchTree {
    Node root;

    public Node insert(Node root, int value){
        if (root == null) return new Node(value);

        if(value < root.getData()){
            root.setLeft(insert(root.getLeft(), value));
        } else if (value > root.getData()) {
            root.setRight(insert(root.getRight(), value));
        }
        return root;
    }

    public boolean search(Node root, int target){
        if (root == null) return false;
        if(target == root.getData()) return true;

        if(target < root.getData()){
            return search(root.getLeft(), target);
        }

        return search(root.getRight(), target);
    }

    // ==============================
    // Height
    // ==============================
    public int height(Node root) {

        if (root == null)
            return 0;

        return 1 + Math.max(height(root.getLeft()), height(root.getRight()));
    }

    // ==============================
    // Count Nodes
    // ==============================
    public int countNodes(Node root) {

        if (root == null)
            return 0;

        return 1 + countNodes(root.getLeft()) + countNodes(root.getRight());
    }

    // ==============================
    // Validate BST
    // ==============================
    public boolean isBST(Node root) {

        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean validate(Node root, long min, long max) {

        if (root == null)
            return true;

        if (root.getData() <= min || root.getData() >= max)
            return false;

        return validate(root.getLeft(), min, root.getData())
                && validate(root.getRight(), root.getData(), max);
    }

    // ==============================
    // Lowest Common Ancestor
    // ==============================
    public Node lca(Node root, int p, int q) {

        while (root != null) {

            if (p < root.getData() && q < root.getData())
                root = root.getLeft();

            else if (p > root.getData() && q > root.getData())
                root = root.getRight();

            else
                return root;
        }

        return null;
    }
}
