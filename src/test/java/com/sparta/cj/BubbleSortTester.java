package com.sparta.cj;

import com.sparta.cj.factory.SortFactory;
import com.sparta.cj.factory.Sortable;
import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.Random;

public class BubbleSortTester {

    private static Sortable sortable;
    private int[] unsortedArray;

    @BeforeAll
    public static void setSorter(){
        sortable = SortFactory.getSort(1);
    }

    @BeforeEach
    public void arrayInitialise(){
        Random rd = new Random();
        unsortedArray = new int[8];
        for (int i = 0; i < 8; i++) {
            unsortedArray[i] = rd.nextInt(100);
        }
    }

    @Test
    @DisplayName("Check that this Random array is sorted")
    void CheckThatThisRandomArrayIsSorted() {
        int[] sortedArray = Arrays.copyOf(unsortedArray,8);
        Arrays.sort(sortedArray);
        Assertions.assertArrayEquals((sortedArray), (sortable.sort(unsortedArray)));
    }

    @Test
    @DisplayName("Check that this backwards array is sorted ")
    void CheckThatThisBackwardsArrayIsSorted() {
        Assertions.assertArrayEquals((new int[]{1, 2, 3, 4, 5, 6}), (sortable.sort(new int[]{6, 5, 4, 3, 2, 1})));
    }

    @Test
    @DisplayName("Check that this Sorted Array remains the same")
    void CheckThatThisSortedArrayRemainsTheSame() {
        Assertions.assertArrayEquals((new int[]{1, 2, 3, 4, 5, 6}), (sortable.sort(new int[]{1, 2, 3, 4, 5, 6})));
    }

    @Test
    @DisplayName("Check that this blank array does not break my code")
    void CheckThatThisBlankArrayDoesNotBreakCode() {
        Assertions.assertArrayEquals((new int[]{}), (sortable.sort(new int[]{})));
    }
    @Test
    @DisplayName("Check that this single number array does not break my code")
    void CheckThatThisSingleNumberArrayDoesNotBreakCode() {
        Assertions.assertArrayEquals((new int[]{1}), (sortable.sort(new int[]{1})));
    }
}
