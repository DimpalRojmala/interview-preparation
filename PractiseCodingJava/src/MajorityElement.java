import java.util.Arrays;
import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int[] input = new int[]{4,4,3,4,7,3,5,4,7,5,4,7,8,4};

        HashMap<Integer,Integer> frequencyMap = new HashMap<Integer,Integer>();

        System.out.println(isThereElement(input, frequencyMap));




    }

    private static int isThereElement(int[] input,  HashMap<Integer, Integer> frequencyMap) {
        int ans = 0;

        for (int i = 0; i< input.length ; i++)
        {
            if(frequencyMap.containsKey(input[i]))
            {
                frequencyMap.put(input[i], frequencyMap.get(input[i])+1);

                if(frequencyMap.get(input[i])>(input.length/2))
                {
                    System.out.println("ans is = " + input[i]);
                    ans = input[i];

                    return ans;


                }


            }
            else
            {
                frequencyMap.put(input[i],1);
            }


        }
        return  -1;


    }
}
