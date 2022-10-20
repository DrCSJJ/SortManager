package com.sparta.cj.binary_tree;

import com.sparta.cj.factory.Sortable;

public class BinarySearch implements Sortable {

    @Override
    public int[] sort(int[] array) {

        String sortedTree;
        TreeSort treeSort = new TreeSort(array[0]);
        createTree(array, treeSort);

        StringBuilder sortedStringBuilder = new StringBuilder();
        sortedTree = treeSort.getSortedArrayAsc(sortedStringBuilder);

        String[] stringOfInts = sortedTree.split(" ");
        for (int i = 0; i<stringOfInts.length; i++){
            array[i] = Integer.parseInt(stringOfInts[i]);
        }

        return array;
    }




    private void createTree(int[] array, TreeSort treeSort) {
        for (int i = 1; i < array.length; i++ ){
            treeSort.addElementToTree(array[i]);
        }
    }
}
