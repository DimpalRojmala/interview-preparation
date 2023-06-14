package leetcode;

import java.util.ArrayList;

public class SumOfTwo {

    public static void main(String[] args) {
        int num[]={2,11,7,15};
        int target = 9;
        twoSum(num,target);
        //System.out.println(twoSum(num,target));


    }

    public static int[] twoSum(int[] nums, int target) {
        int ans[]=new int[nums.length];
        ArrayList list=new ArrayList();
        for(int i=0;i<nums.length;i++)
        {
            for(int j=1;j<nums.length-1;j++)
            {

                if(nums[i]+nums[j]==target)
                {
                    list.add(i);
                    list.add(j);
                }
            }

        }
        System.out.println(list);
        return ans;


    }
}
