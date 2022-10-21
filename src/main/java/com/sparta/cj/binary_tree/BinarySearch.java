package com.sparta.cj.binary_tree;

import com.sparta.cj.display.DisplayLoader;
import com.sparta.cj.factory.Sortable;
import com.sparta.cj.start.Utils;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BinarySearch implements Sortable {
    private static final Logger logger = Logger.getLogger("SortManagerLogger");

    static {
        logger.log(Level.INFO, "Method has started");
    }

    @Override
    public int[] sort(int[] array) {
        long endTime;
        long elapsedTime;
        long startTime;

        if (array.length <= 1 ){
            return array;
        }


        String sortedTree;
        TreeSort treeSort = new TreeSort(array[0]);
        createTree(array, treeSort);

        startTime = Utils.getNanoTime();

        StringBuilder sortedStringBuilder = new StringBuilder();
        sortedTree = treeSort.getSortedArrayAsc(sortedStringBuilder);

        String[] stringOfInts = sortedTree.split(" ");
        for (int i = 0; i<stringOfInts.length; i++) {
            array[i] = Integer.parseInt(stringOfInts[i]);
        }

        endTime = Utils.getNanoTime();
        elapsedTime  = endTime - startTime;
        DisplayLoader.printMicroTime(elapsedTime);

        return array;
    }

    private void createTree(int[] array, TreeSort treeSort) {
        for (int i = 1; i < array.length; i++ ){
            treeSort.addElementToTree(array[i]);
        }
    }
}
