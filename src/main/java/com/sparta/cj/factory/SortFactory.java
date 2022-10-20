package com.sparta.cj.factory;

import com.sparta.cj.binary_tree.BinarySearch;
import com.sparta.cj.bubblesort.BubbleSort;
import com.sparta.cj.mergesort.MergeSort;


public class SortFactory {
    public static Sortable getSort(int choice) {
        return switch (choice) {
            case 1 -> new BubbleSort();
            case 2 -> new BinarySearch();
            case 3 -> new MergeSort();
            default -> null;
        };
    }

}
