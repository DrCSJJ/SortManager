package com.sparta.cj.binary_tree;

public class Node {
    private final int value;
    private Node leftChild; //object type so can be null but should avoid null
    private Node rightChild;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() { // final so no setter auto done by intellij
        return value;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public boolean isLeftChildEmpty(){
        if (leftChild == null){
            return true;
        } else {
            return false;
        }
    }
    public boolean isRightChildEmpty(){
        if (rightChild == null){
            return true;
        } else {
            return false;
        }
    }

}
