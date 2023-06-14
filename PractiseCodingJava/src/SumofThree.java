import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class SumofThree {

    public static void main(String[] args) {
        int[] inputArray = {7,-6,-6,3,3,8,-1,8,-11};
       //int[] inputArray = {1,2,3,4,5,6,7,8,9};
        int target = 0;
        int ans[] = new int[2];
        HashMap<Integer, Integer> ansMap = new HashMap<Integer, Integer>();
        Arrays.sort(inputArray);
        System.out.println(Arrays.toString(inputArray));
        for(int i=0;i<inputArray.length-1;i++)
        {
            //for ignoring duplicates of i
            if(inputArray[i]==inputArray[i+1])
            {
                continue;
            }
            int j=i+1;
            int k=inputArray.length-1;
            //This is two pointer approach
            while(j<k)
            {
                if(inputArray[i]==target-(inputArray[j]+inputArray[k]))
                {
                    System.out.println(inputArray[i] +","+inputArray[j]+","+inputArray[k]);
                    //for ignoring duplicates
                    while( inputArray[j]==inputArray[j+1])
                    {
                        j++;
                    }
                    while ( inputArray[k]==inputArray[k-1])
                    {
                        k--;
                    }
                    j++;
                    k--;

                }
                else if(target-inputArray[i]<(inputArray[j]+inputArray[k]))
                {
                    k--;
                }
                else{
                    j++;
                }




            }



        }

    }

}
