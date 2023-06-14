import java.util.HashMap;

public class SmallestNumberWhereProductofDigits {

    public static void main(String args[])
    {
        int number=81000;
        HashMap<Integer,Integer> ansMap = new HashMap<Integer, Integer>();


        for(int i=9 ; i>=2 ; i--)
        {
           number = getNumber(number, ansMap, i);
        }
        StringBuilder ans= new StringBuilder();
        ansMap.keySet().stream().forEach(key -> {

            for(int i=ansMap.get(key);i>0;i--)
            {
               ans.append(key);
            }

        });
        System.out.println(ans);

        System.out.println(ansMap);





    }

    private static int getNumber(int number, HashMap<Integer, Integer> ansMap, int i) {
        while(number==1)
        {
            return 1;
        }

        if (number % i ==0)
        {
            number = number / i;
            if(ansMap.containsKey(i))
            {
                ansMap.put(i, ansMap.get(i)+1);
            }
            else {
                ansMap.put(i, 1);
            }


            return  getNumber(number,ansMap,i);
        }


        return number;
    }
}
