package leetcode;

public class ReverseString {

    public static void main(String[] args) {
        reverseString( new char[] {'H','a','n','n','a','h'} );
    }

    public static String reverseString(char[] s) {
        int n=s.length/2;
        for(int i=0;i<=n;i++)
        {
            //swap two element
            // swap s[i]<->s[s.length-1]
            Character temp = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = temp;

        }
        System.out.print(s);
        return s.toString();

    }
}
