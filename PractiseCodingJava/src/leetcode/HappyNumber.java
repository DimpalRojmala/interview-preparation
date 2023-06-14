package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HappyNumber {

    public static void main(String[] args) {
      //  List<Integer> quotientListIn = new ArrayList();
      //  List<Integer> quotientList = getQuotient(1900,quotientListIn);
     //   quotientList.stream().forEach(System.out::println);
        System.out.println("is Happy = " + isHappyNumber(19));

    }

    private static boolean isHappyNumber(int number) {

       HashSet<Integer> seen = new HashSet<>();
       while (number!=1)
       {
           int current = number;
           int sum =0;
           while (current!=0)
           {
               sum = sum + (current%10)*(current%10);
               current = current/10;
           }
           if(seen.contains(sum))
           {
               return false;
           }
           seen.add(sum);
           number = sum;


       }
       return true;

    }

    public static List<Integer> getQuotient(int number,List<Integer> quotientList)
    {
        if(number<10)
        {
            quotientList.add(number);
            return quotientList;
        }

        getQuotient(number/10,quotientList);
        quotientList.add(number%10);
        return quotientList;

    }
}
