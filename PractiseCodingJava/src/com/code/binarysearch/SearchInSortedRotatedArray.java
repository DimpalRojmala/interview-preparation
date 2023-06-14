package com.code.binarysearch;

public class SearchInSortedRotatedArray {
    public static void main(String[] args) {

        int[] arr = new int[]{7, 8, 9, 10, 11, 12, 3, 4, 5};
        int min = findMinimumIndex(arr);
        int target = 6;
        System.out.println("index for minimum element :" + min);
        int index = binarySearch(arr, 0, min - 1, target);
        if (index == -1) {
            index = binarySearch(arr, min, arr.length - 1, target);
        }
        System.out.println("index = " + index);


    }

    private static int binarySearch(int[] arr, int left, int right, int target) {
        int index = -1;
        while (left <= right) {
            int mid = (left + right) / 2;

            if (target < arr[mid]) {
                //discard right
                right = mid - 1;

            } else if (target > arr[mid]) {
                //discard left
                left = mid + 1;
            } else if (target == arr[mid]) {
                return mid;

            }

        }
        return index;

    }

    private static int findMinimumIndex(int[] arr) {

        int ans = arr[0];
        int index = 0;
        for (int i = 1; i <= arr.length - 1; i++) {
            if (arr[i] <= ans) {
                ans = arr[i];
                index = i;
            }

        }
        return index;
    }
}
