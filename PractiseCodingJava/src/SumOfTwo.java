import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SumOfTwo {
    public static void main(String[] args) {

        int[] inputArray = {7,3,5,1,9};
        int target = 8;
        int ans[] = new int[2];
        HashMap<Integer,Integer> ansMap = new HashMap<Integer, Integer>();
        HashMap<Integer,Integer> hashMap = new HashMap<Integer, Integer>();


        for(int i=0 ; i<inputArray.length;i++)
        {

               int secondNumber = target - inputArray[i];
               if(hashMap.containsKey(secondNumber))
               {
                   ans[0] = hashMap.get(secondNumber);
                   ans[1] = i;
                   ansMap.put(hashMap.get(secondNumber),i);
               }
               else {
                   hashMap.put(inputArray[i], i);
               }
        }
      /*  for (int an : ans) {
            System.out.println(an);
        }*/

       ansMap.keySet().stream().forEach(key->{
                System.out.println(key + " and " + ansMap.get(key));
       }

        );


    }
}
