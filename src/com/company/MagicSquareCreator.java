package com.company;

import java.util.Random;

public class MagicSquareCreator
{

    //THIS GETS VERY SLOW AFTER YOU USE 6 FOR N & M - there is a much better way to do this :/
    //THIS GETS VERY SLOW AFTER YOU USE 6 FOR N & M - there is a much better way to do this :/

    static int sum = 0;

    public static void createMagicSquare(int n, int m)
    {
        int[][] magicSquare = new int[n][n];

        for (int thisProgramIsSlow = 0; thisProgramIsSlow < 1; thisProgramIsSlow++)
        {
            int temporary = thisProgramIsSlow-1;
            //creates magic square values
            for (int i = 0; i < n; i++)
            {
                int temp = i-1;

                for (int j = 0; j < n; j++)
                {
                    Random r = new Random();
                    magicSquare[i][j] = r.nextInt((m+1));
                }
                //checks rows
                for (int k = 0; k < n; k++)
                {
                    sum += magicSquare[i][k];
                }
                if (!(sum == m))
                {
                    i = temp;
                }
                sum = 0;
            }
            //checks columns
            for (int i = 0; i < n; i++)
            {
                for (int k = 0; k < n; k++)
                {
                    sum += magicSquare[k][i];
                }
                if (!(sum == m))
                {
                    thisProgramIsSlow = temporary;
                }
                sum = 0;
            }
            //checks diagonal top left - bottom right
            for (int i = 0; i < n; i++)
            {
                for (int k = 0; k < n; k++)
                {
                    sum += magicSquare[k][k];
                }
                if (!(sum == m))
                {
                    thisProgramIsSlow = temporary;
                }
                sum = 0;
            }
            //checks diagonal bottom left - top right
            int index = (n-1);
            for (int k = 0; k < n; k++)
            {
                sum += magicSquare[index][k];
                index -= 1;
            }
            if (!(sum == m))
            {
                thisProgramIsSlow = temporary;
            }
            sum = 0;
        }
        //prints out result
        for (int p = 0; p < magicSquare.length; p++)
        {
            for (int q = 0; q < magicSquare[0].length; q++)
            {
                System.out.print(magicSquare[p][q] + "  ");
            }
            System.out.println();
        }
    }
}