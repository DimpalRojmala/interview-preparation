package leetcode;

public class ClimbStairs {
    public static void main(String[] args) {
        int n=7;
       int ans= climbStairs(n);
        System.out.println("ans = " + ans);

    }
    public static int climbStairs(int n) {


       int[] ans=new int[n+1];
       ans[0]=1;
       ans[1]=1;

       for(int i=2;i<=n;i++)
       {
           ans[i]=ans[i-1]+ans[i-2];
       }
       return ans[n];


    }
}
