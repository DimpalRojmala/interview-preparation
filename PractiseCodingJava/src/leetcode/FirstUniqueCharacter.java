package leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class FirstUniqueCharacter {

    public static void main(String[] args) {
        System.out.println(" = " + extracted());
    }

    private static int extracted() {
        String s = "lovevleettcode";
        /*HashMap<Character,Integer> ansMap = new HashMap<>();

        for(int index=0;index<=s.length()-1;index++)
        {
            if(ansMap.containsKey(s.charAt(index)))
            {
                ansMap.put(s.charAt(index),ansMap.get(s.charAt(index))+1);
            }
            else
            {
                ansMap.put(s.charAt(index),1);

            }

        }
        List<Character> s1= ansMap.keySet().stream().filter(key->ansMap.get(key)==1).collect(Collectors.toList());
        int min = s.indexOf(s1.get(0));

        for(int i=0;i<s1.size();i++)
        {
            if(min<s.indexOf(s1.get(i)))
            {
                min=min;
            }
            else
            {
                min=s.indexOf(s1.get(i));
            }
        }
            return min;
    }*/

        int freq[] = new int[256];
        for (int i = 0; i < s.length(); i++)
            freq[s.charAt(i) ]++;
        for (int i = 0; i < s.length(); i++)
            if (freq[s.charAt(i)] == 1)
                return i;
        return -1;
    }
}
