package com.javacoban.main;

import java.util.Arrays;

public class SortAlgorithm {
    public static void main(String[] args) {


        int[] A = {3, 7, 21, 1, 6, 19, 23, 4, 32, 14};
        Arrays.sort(A);
        // A: {1, 3, 4, 6, 7, 14, 19, 21, 23, 32}
        int index = Arrays.binarySearch(A, 4);
        System.out.println(index);

    }



}
