package com.sparta.cj.start;

import java.util.Random;
import java.util.Scanner;

public class Utils {
    public static int[] randomNumberArray(int numberOfElements) {
        Random rd = new Random();
        int[] array = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            array[i] = rd.nextInt(1000);

        }
        return array;
    }

    public static int scannedInteger() {
        Scanner intScanner = new java.util.Scanner(System.in);
        int scannedInt;

        while (!intScanner.hasNextInt()) {
            intScanner.nextLine();
        }
        scannedInt = intScanner.nextInt();
        return scannedInt;
    }

    public static long getNanoTime() {
        return System.nanoTime();
    }
}

