package com.sparta.cj.bubblesort;

import com.sparta.cj.display.DisplayLoader;
import com.sparta.cj.factory.Sortable;
import com.sparta.cj.start.Utils;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BubbleSort implements Sortable {
    private static final Logger logger = Logger.getLogger("SortManagerLogger");

    static {
        logger.log(Level.INFO, "Method has started");
    }

    @Override
    public int[] sort(int[] array) {
        boolean sorted = false;
        int count = 0;
        long endTime;
        long elapsedTime;
        long startTime = Utils.getNanoTime();

        if (array.length == 0) {
            logger.log(Level.FINE, "Array is empty");
            return array;
        } else if (array.length == 1) {
            logger.log(Level.FINE, "Single item array");
            return array;
        } else isSorted(array, sorted, count);
        logger.log(Level.FINE, "Returning sorted array");


        endTime = Utils.getNanoTime();
        elapsedTime  = endTime - startTime;
        DisplayLoader.printMicroTime(elapsedTime);


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

        return false;
    }
}

