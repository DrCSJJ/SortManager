package com.sparta.cj.start;

import com.sparta.cj.bubblesort.BubbleSort;

import java.util.Random;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
//        SortScanner sortScanner = new SortScanner();
//        sortScanner.scannerEntry();

        Random rd = new Random();
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt();

        }
        BubbleSort.bubbleSortArray(array);
    }
}
