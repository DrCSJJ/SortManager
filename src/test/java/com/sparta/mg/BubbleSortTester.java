package com.sparta.mg;

import com.sparta.mg.bubblesort.BubbleSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BubbleSortTester {

    @Test
    @DisplayName("Check that this backwards array is sorted ")
    void CheckThatThisBackwardsArrayIsSorted() {
        Assertions.assertArrayEquals((new int[]{1, 2, 3, 4, 5, 6}), (BubbleSort.bubbleSortArray(new int[]{6, 5, 4, 3, 2, 1})));
    }

    @Test
    @DisplayName("Check that this Sorted Array remains the same")
    void CheckThatThisSortedArrayRemainsTheSame() {
        Assertions.assertArrayEquals((new int[]{1, 2, 3, 4, 5, 6}), (BubbleSort.bubbleSortArray(new int[]{1, 2, 3, 4, 5, 6})));
    }

    @Test
    @DisplayName("Check that this blank array does not break my code")
    void CheckThatThisBlankArrayDoesNotBreakCode() {
        Assertions.assertArrayEquals((new int[]{}), (BubbleSort.bubbleSortArray(new int[]{})));
    }
    @Test
    @DisplayName("Check that this single number array does not break my code")
    void CheckThatThisSingleNumberArrayDoesNotBreakCode() {
        Assertions.assertArrayEquals((new int[]{1}), (BubbleSort.bubbleSortArray(new int[]{1})));
    }
}
