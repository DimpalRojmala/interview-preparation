import java.util.Arrays;

public class SmallestNumber {

    public static void main(String args[])
    {
        int a[] = {-11,-1,-2,3,5,2};
    //    Arrays.sort(a);
    //    System.out.println(a[0]);
    //    int temp = Integer.MAX_VALUE;
        int temp = a[0];
        for(int i=0 ;i < a.length;i++)
        {
            if(a[i]<temp)
            {
                temp=a[i];
            }
        }
        System.out.println(temp);
    }
}
