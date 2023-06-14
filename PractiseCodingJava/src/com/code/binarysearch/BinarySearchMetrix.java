package com.code.binarysearch;

public class BinarySearchMetrix {
    public static void main(String[] args) {

        int[][] input = new int[][]{{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        int target = 11;
        boolean isThere = findInMetric(input,target);
        System.out.println("isThere = " + isThere);
    }

    private static boolean findInMetric(int[][] input, int target) {

        int i=0;
        int j=input[0].length-1;

        while(i<input.length-1&&j>=0)
        {
            if(target==input[i][j])
            {
                return true;
            } else if (target>input[i][j]) {

                //move downwards as all elements in that row will be small then target
                i++;
            } else if (target<input[i][j]) {
                //move left side as all elements in that column will be larger then target
                j--;
            }

        }

        return false;

    }
}
