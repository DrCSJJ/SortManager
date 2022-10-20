package com.sparta.cj.binary_tree;

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

    public String getSortedArrayAsc(StringBuilder stringBuilder){
        String string;
        return string = getSortedArrayAscRecursion(rootNode, stringBuilder);
    }

    private String getSortedArrayAscRecursion(Node node, StringBuilder stringBuilder){
        if(node == null){
            return null;
        }
        getSortedArrayAscRecursion(node.getLeftChild(),stringBuilder);

        stringBuilder.append( node.getValue() + " ");

        getSortedArrayAscRecursion(node.getRightChild(), stringBuilder);
        return stringBuilder.toString();
    }

    public int getNumberOfElements(Node rootNode){
        if(rootNode == null){
            return 0;
        }
        return 1 + getNumberOfElements(rootNode.getLeftChild()) + getNumberOfElements(rootNode.getRightChild());
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

