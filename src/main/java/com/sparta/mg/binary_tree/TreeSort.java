package com.sparta.mg.binary_tree;

public class TreeSort {
    private final Node rootNode;

    public TreeSort(int element) {
        this.rootNode = new Node(element);
    }

    public void addElementToTree(int element){
        addNodeToTree(rootNode,element);
    }

    //add node to tree
    private void addNodeToTree(Node node, int element){
        if(element <= node.getValue()){ // Smaller so go left child
            if (node.isLeftChildEmpty()){   //is left child free
                node.setLeftChild(new Node(element));   // set node as left
            } else {
                addNodeToTree(node.getLeftChild(), element);    //recursive element
            }
        } else if(element > node.getValue()){
            if(node.isRightChildEmpty()){
                node.setRightChild(new Node(element));
            } else {
                addNodeToTree(node.getRightChild(), element);
            }
        }
    }

    public boolean findElement(int element){
        Node node = findNode(element);
        if (node != null){
            return true;
        } else {
            return false;
        }
    }


    private Node findNode(int element){
        Node node = rootNode;
        while(node != null){
            if (element == node.getValue()){
                return node;
            }
            if (element < node.getValue()){
                node = node.getLeftChild();
            } else if (element > node.getValue()){
                node = node.getRightChild();
            }
        }
        return null;
    }
}

