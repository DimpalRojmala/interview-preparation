package leetcode;

/*A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

        Given a string s, return true if it is a palindrome, or false otherwise.*/

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    private static boolean isPalindrome(String s) {

        s= s.toLowerCase();

        s= s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println("s = " + s);
        String reversed= String.valueOf(new StringBuffer(s).reverse());
        System.out.println("reversed = " + reversed.toString());
       return s.equals(reversed)?true:false;
    }


}
