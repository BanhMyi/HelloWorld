package com.javacoban.main;

public class SearchAlgorithm {

    public static void main(String[] args) {
        int[] A = {5, 7, 9, 11, 20, 30, 31, 33, 44, 52};

//        int result = linearSearch(A, 10);
//        int result = binarySearchWithRecursion(A, 10, 0, A.length - 1);
        int result = binarySearchWithoutRecursion(A, 10, 0, A.length-1);
        System.out.println("result :" + result);
    }

    public static int linearSearch(int[] A, int element) {
        for (int i = 0; i < A.length; i++ ) {
            if (A[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearchWithRecursion(int[] A, int element, int first, int last) {
        if (last >= first) {
            int middle = first + (last-first)/2;
            if (A[middle] == element) {
                return middle;
            } else if (A[middle] > element) {
                return binarySearchWithRecursion(A, element, first, middle-1);
            } else {
                return binarySearchWithRecursion(A, element, middle + 1, last);
            }
        } else {
            return -1;
        }

    }
    public static int binarySearchWithoutRecursion(int[] A, int element, int first, int last) {
        int found = -1;
        int middle = (last-first)/2;
        while (last >= first && found == -1) {
            if (A[middle] == element) {
                return middle;
            }
            if (A[middle] > element) {
                last = middle-1;
            } else {
                first = middle + 1;
            }
            middle = first + (last - first)/2;
        }
        return found;
    }
}
