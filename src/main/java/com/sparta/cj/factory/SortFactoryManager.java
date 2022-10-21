package com.sparta.cj.factory;

import com.sparta.cj.display.DisplayLoader;
import com.sparta.cj.start.Utils;

public class SortFactoryManager {

    public static void userInterface(){
        int whichSort;
        int arraySize;
        int[] unSortedArray;
        int[] sortedArray;
        long startTime = 0;
        long endTime = 0;
        long elapsedTime =0;


        whichSort = userQueryWhichSort();
        arraySize =  userQueryWhatSizeArray();
        unSortedArray = Utils.randomNumberArray(arraySize);

        printWhatSortToDisplay(whichSort);
        DisplayLoader.printOriginalArray(unSortedArray);

        if(whichSort == 3) {
            startTime = Utils.getNanoTime();
        }
        Sortable sortable = SortFactory.getSort(whichSort);
        sortedArray = sortable.sort(unSortedArray);


        if(whichSort == 3) {
            endTime = Utils.getNanoTime();
            elapsedTime = endTime - startTime;
            DisplayLoader.printMicroTime(elapsedTime);
        }

        DisplayLoader.printSortedArray(sortedArray);
    }



    private static void printWhatSortToDisplay(int whichSort) {
        switch (whichSort){
            case 1 -> DisplayLoader.printArraySortUsed("BubbleSort");
            case 2 -> DisplayLoader.printArraySortUsed("BinarySort");
            case 3 -> DisplayLoader.printArraySortUsed("MergeSort");
        }
    }

    private static int userQueryWhatSizeArray() {
        int arraySize;
        DisplayLoader.printQuestionArraySize();
        arraySize = Utils.scannedInteger();
        while (arraySize < 1 || arraySize > 1000){
            System.out.println("Please enter a valid integer between 1 & 3");
            arraySize = Utils.scannedInteger();
        }
        return arraySize;
    }

    private static int userQueryWhichSort() {
        int whichSort;
        DisplayLoader.printQuestionWhichSort();
        whichSort = Utils.scannedInteger();
        while (whichSort < 1 || whichSort > 3){
            System.out.println("Please enter a valid integer between 1 & 3");
            whichSort = Utils.scannedInteger();
        }
        return whichSort;
    }
}
