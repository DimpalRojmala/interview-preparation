package com.code.recursionandbacktracking;

public class NQueenProblem {

    public static void main(String[] args) {
        int n=4;
        char[][] input=new char[n][n];
        for(int i=0;i<input.length;i++)
        {
            for(int j=0;j<input.length;j++)
            {
                input[i][j] = '.';
            }
        }
        NQueenPlacement(input,0);
    }

    private  static void print(char[][] input)
    {
        for(int i=0;i<input.length;i++)
        {
            for(int j=0;j<input.length;j++)
            {
                System.out.print(input[i][j]);
            }
            System.out.println();
        }

    }

    private static void NQueenPlacement(char[][] input, int row) {

        if(row == input.length)
        {
            print(input);
            System.out.println("------");
            return;

        }

        for(int col=0;col<input.length;col++)
        {
            if(isSafe(col,row,input)==true)
            {
                input[row][col] ='Q';
                NQueenPlacement(input,row+1);
                input[row][col] = '.';

            }

        }


    }

    private static boolean isSafe(int col, int row, char[][] input) {

        //check the column
        for (int i = row - 1; i >= 0; i--) {
            if (input[i][col] == 'Q') {
                return false;
            }

        }
        //check for diagonal 1
        for (int i = row - 1, j = col + 1;i >= 0 && j < input[0].length;i--,j++)
        {
            if(input[i][j]=='Q')
            {
                return false;
            }
        }
        for (int i = row - 1, j = col - 1;i >= 0 && j >=0;i--,j--)
        {
            if(input[i][j]=='Q')
            {
                return false;
            }
        }
        return true;
    }
}
