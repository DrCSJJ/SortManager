package com.sparta.cj.mergesort;

import com.sparta.cj.factory.Sortable;

public class MergeSort implements Sortable {
    @Override
    public int[] sort(int[] array){

        int arrayLength = array.length;
        if (arrayLength < 2) {
            return array;
        }

        int midPointArray = arrayLength/2;
        int arrayFinal[] = new int[arrayLength];
        int[] leftArr = new int[midPointArray];
        int[] rightArr = new int[arrayLength-midPointArray];

        for(int lCounter = 0; lCounter < midPointArray; lCounter++){
            leftArr[lCounter] = array[lCounter];
        }
        for(int rCounter = midPointArray; rCounter < arrayLength; rCounter++){
            rightArr[rCounter-midPointArray] = array[rCounter];
        }
        sort(leftArr);
        sort(rightArr);

        arrayFinal = mergeSortCombine(array, leftArr,rightArr, midPointArray, arrayLength-midPointArray);
        return arrayFinal;
    }

    private static int[] mergeSortCombine(int[] array, int[] leftArr, int[] rightArr, int left, int right) {
        int leftCount = 0;
        int rightCount = 0;
        int arrayCount = 0;

        while(leftCount < left && rightCount < right){
            if(leftArr[leftCount] <= rightArr[rightCount]){
                array[arrayCount++] = leftArr[leftCount++];
            }else {
                array[arrayCount++] = rightArr[rightCount++];
            }
        }
        while (leftCount < left){
            array[arrayCount++] = leftArr[leftCount++];
        }
        while (rightCount < right){
            array[arrayCount++] = rightArr[rightCount++];
        }
        return array;
    }
}
