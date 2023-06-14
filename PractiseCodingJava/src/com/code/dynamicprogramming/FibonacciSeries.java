package com.code.dynamicprogramming;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n=5;
        int answer = getFibonacci(n);
        int ans = getFibonacci(n,new int[n+1]);
        System.out.println("answer = " + answer);
        System.out.println("ans = " + ans);
    }

    //Recursive
    private static int getFibonacci(int n) {
        
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
        
        return getFibonacci(n-1)+getFibonacci(n-2);
        
    }

    // Dynamic approach
    private static int getFibonacci(int n,int[] dp) {
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2;i<=n;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];

        }
        return dp[n];

    }
}
