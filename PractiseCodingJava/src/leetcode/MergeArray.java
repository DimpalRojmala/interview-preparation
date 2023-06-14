package leetcode;

import java.util.Arrays;

public class MergeArray {

    public static void main(String[] args) {
        merge(new int[]{1,2,3,0,0,0},3,new int[]{2,3,6},3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {


        int i=m-1;
        int j=n-1;

        if(m==0)
        {
            nums1= nums2;
        }
        if(n==0)
        {
            nums1= nums1;
        }
        else{

            int k=n+m-1;
            while (j>=0)
            {

                if(nums1[i]<nums2[j]&&i>=0)
                {
                    nums1[k]=nums2[j];
                    j--;
                    k--;

                }
                else
                {

                    nums1[k]=nums1[i];
                    i--;
                    k--;
                }


            }
        }

        Arrays.stream(nums1).forEach(System.out::println);
    }
}
