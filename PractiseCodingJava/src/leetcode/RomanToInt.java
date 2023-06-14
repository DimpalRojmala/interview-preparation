package leetcode;

import java.util.HashMap;

public class RomanToInt {
    public static void main(String[] args) {
        System.out.println("ans = " + convertRomanToInt("MCMXCIV"));
    }
    public  static int convertRomanToInt(String s)
    {
        HashMap<Character,Integer> newMap = new HashMap<>();
        newMap.put('I',1);
        newMap.put('V',5);
        newMap.put('X',10);
        newMap.put('L',50);
        newMap.put('C',100);
        newMap.put('D',500);
        newMap.put('M',1000);

        int ans=0;
        int previous=0;
        int current= 0;
        for (int i=s.length()-1;i>=0;i--) {

            char currentChar = s.charAt(i);
             current = newMap.get(currentChar);
            
            if(previous>current)
            {
                ans = ans - current;
            } else if (previous<=current) {
                ans = ans + current;
            }
            previous = current;


        }
        return ans;

    }
}
