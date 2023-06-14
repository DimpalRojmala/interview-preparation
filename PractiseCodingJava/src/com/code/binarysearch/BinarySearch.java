package com.code.binarysearch;

import java.util.Arrays;

public class BinarySearch {

    //we have sorted array and want to find first and last index of target

    //Time complexity for binary search O(logn)
    // Space complexity is O(1)


    public static void main(String[] args) {
        int[] arr={1,2,3,3,5,5,5,5,5,8};
        firstAndLastPosition(arr,5);
        
    }

    private static void firstAndLastPosition(int[] arr, int target) {
        int left=0;
        int right = arr.length-1;

        int first=-1;

        while(left<=right)
        {
            int mid = left+right/2;

            if(target>arr[mid])
            {
                //discard left
                left =mid+1;

            }
            else if(target<arr[mid])
            {
                //discard right
                right = mid -1;

            }
            else if(target==arr[mid])
            {
                // as we want first index keep looking into left
                first =mid;
                right = mid-1;
            }


        }
        System.out.println("first = " + first);

        left =0;
        right = arr.length-1;
        int last=-1;

        while(left<=right)
        {
            int mid = (left+right)/2;
            if(target<arr[mid])
            {
             left =mid+1;
            } else if (target>arr[mid]) {
                right =mid-1;

            } else if (target==arr[mid]) {
                //as we want last index keep looking into right
                left=mid+1;
                last =mid;

            }


        }
        System.out.println("last = "+last);

    }
}
