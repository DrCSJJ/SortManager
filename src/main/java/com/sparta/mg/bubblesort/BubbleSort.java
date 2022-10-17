package com.sparta.mg.bubblesort;

public class BubbleSort {
    public static int[] bubbleSortArray(int[] array) {
        boolean sorted = false;
        int count = 0;

        if(array.length == 0){
            return array;
        }
        if(array.length == 1){
            return array;
        }

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
        return array;
    }


    private static boolean sortBubble(int[] unsorted, int i) {
        int temp;
        temp = unsorted[i];
        unsorted[i] = unsorted[i +1];
        unsorted[i +1] = temp;
        return false;
    }
}
