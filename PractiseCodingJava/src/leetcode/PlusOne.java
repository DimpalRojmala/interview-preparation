package leetcode;

import java.util.Arrays;

public class PlusOne {

    public static int[] plusOne(int[] digits) {

        String input = "";
        for(int digit:digits)
        {
           input = input+""+digit;
        }
        int ans = Integer.parseInt(input)+1;
        String ansStr=ans+"";
         int[] ansArray=new int[ansStr.length()];

         for(int i=0;i<ansStr.length();i++)
         {
             ansArray[i]=Integer.parseInt(String.valueOf(ansStr.charAt(i)));
         }
         return ansArray;



    }

    public static void main(String[] args) {
        System.out.println(plusOne(new int[]{9,9,9}));
        PlusOneOptimised(new int[]{1,0,9});
    }


    public static void PlusOneOptimised(int[] input)
    {

        for(int i=input.length-1;i>=0;i--)
        {

            if(input[i]<9)
            {
                input[i]++;
                break;
            }
            else
            {
                input[i]=0;

            }

        }
        if(input[0]==0)
        {
            //we need new array
            int ans[] = new int[input.length+1];
            ans[0]=1;
        }


       // Arrays.stream(input).forEach(System.out::print);
     //   System.out.println("--------------------");
       // Arrays.stream(ans).forEach(System.out::print);

    }
}
