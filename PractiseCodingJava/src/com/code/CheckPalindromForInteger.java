package com.code;

public class CheckPalindromForInteger {

    public static void main(String[] args) {

        int input=11112;
        System.out.println("is = " + isPalindrom(input));


    }

     static boolean isPalindrom(int input)
    {
        int temp=input;
        int output=0;
            while (input!=0)
            {
                output=output*10+(input%10);
                input=input/10;
            }

        return (temp == output) ? true : false;


    }

}
