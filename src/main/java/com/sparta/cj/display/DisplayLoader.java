package com.sparta.cj.display;

import com.sparta.cj.factory.SortFactoryManager;
import java.util.Arrays;

public class DisplayLoader {
    public static void printQuestionArraySize() {
        System.out.println("Pleas Select the array Length (Max 1000 Min 1) ");
    }

    public static void printQuestionWhichSort() {
        System.out.println("Please Select what Sorting Method you would like to use");
        System.out.println("1: for BubbleSorter");
        System.out.println("2: for BinarySorter");
        System.out.println("3: for MergeSorter");
    }

    public static void printOriginalArray(int[] array){
        System.out.println("Original array is:");
        System.out.println(Arrays.toString(array));
    }
    public static void printArraySortUsed(String string){
        System.out.println("The array sort used was: " + string);
    }

    public static void printSortedArray(int[] array){
        System.out.println("Sorted array is: ");
        System.out.println(Arrays.toString(array));
        SortFactoryManager.userInterface();
    }

    public static void printMicroTime(long microTime){
        System.out.println("Time Taken to Execute (MicroSeconds) : " + microTime/1000 + "µs");
    }
}
