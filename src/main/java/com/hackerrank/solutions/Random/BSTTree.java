package com.hackerrank.solutions.Random;

class Node {
    int key;
    Node left, right;

    public Node(int key) {
        this.key = key;
        left = right = null;
    }
}

public class BSTTree {
    public static void main(String[] args) {
        BSTTree bstTree = new BSTTree();
        Node rootNode = new Node(1);
        rootNode.left = new Node(2);
        rootNode.right = new Node(3);
        rootNode.left.left = new Node(4);
        rootNode.left.right = new Node(5);
        bstTree.postOrderTraverse(rootNode);
    }

    private void postOrderTraverse(Node node) {
        if (node == null) {
            return;
        }
        postOrderTraverse(node.left);
        postOrderTraverse(node.right);
        System.out.println(node.key + " ");
    }
}
