package com.code.binarysearch;

public class FindMinwithBinarySearch {
    public static void main(String[] args) {
        //int[] arr = new int[] {7,8,9,10,11,1,2,3,4};
        int[] arr = new int[] {1,2,3,4,5,6,7,8,9};
        int min = findMin(arr);
        System.out.println("min = " + min);
    }

    private static int findMin(int[] arr) {
        int left=0;
        int right=arr.length-1;
        int ans=-1;
        while(left<right)
        {
            int mid =(left+right)/2;

            if(arr[mid]>arr[right])
            {
                //discard left
                left=mid+1;
            } else if (arr[mid]<arr[right]) {
                    //ans =arr[mid];
                    //discard right
                    right=mid;

                }


            }
        return right;


        }

    }

