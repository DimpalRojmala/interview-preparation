package com.code.recursionandbacktracking;

import java.util.ArrayList;

public class PrintAllPermutationArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        printAllPermutation(arr,0,new boolean[arr.length],new ArrayList<Integer>());

    }

    private static void printAllPermutation(int[] arr, int position, boolean[] booleans, ArrayList<Integer> ans) {
        if(position==arr.length)
        {
            System.out.println("ans = " + ans);
            return;
        }

        for (int i = 0; i < arr.length; i++)
        {
            if(booleans[i]==false)
            {
                booleans[i] = true;
                ans.add(arr[i]);
                printAllPermutation(arr,position+1,booleans,ans);
                booleans[i] = false;
                ans.remove(ans.size()-1);

            }


        }





    }
}
