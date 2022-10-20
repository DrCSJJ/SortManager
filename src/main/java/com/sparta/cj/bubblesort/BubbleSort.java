package com.sparta.cj.bubblesort;

import com.sparta.cj.factory.Sortable;
import com.sparta.cj.logging.CustomLoggerConfiguration;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BubbleSort implements Sortable {
    private static final Logger logger = Logger.getLogger("BubbleSort-Logger");

    @Override
    public int[] sort(int[] array) {
        CustomLoggerConfiguration.configureLogger(logger);
        boolean sorted = false;
        int count = 0;

        logger.log(Level.INFO, "Method has started");
        logger.log(Level.INFO, "This is the unsorted array: " + Arrays.toString(array));

        if (array.length == 0) {
            logger.log(Level.FINE, "Array is empty");
            return array;
        } else if (array.length == 1) {
            logger.log(Level.FINE, "Single item array");
            return array;
        } else isSorted(array, sorted, count);
        logger.log(Level.FINE, "Sorted array is: " + Arrays.toString(array));
        return array;
    }

    private void isSorted(int[] array, boolean sorted, int count) {
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1 - count; i++) {
                if (array[i] > array[i + 1]) {
                    sorted = sortBubble(array, i);
                }
                if (i == array.length - 1) {
                    count++;
                }
            }
        }
    }


    private boolean sortBubble(int[] unsorted, int i) {
        int temp;
        temp = unsorted[i];
        unsorted[i] = unsorted[i + 1];
        unsorted[i + 1] = temp;
        logger.log(Level.FINEST, "Bubble swap occurred");
        return false;
    }
}

