package com.company;

import java.util.Random;

public class MagicSquareCreator
{
    static int sum = 0;

    public static void createMagicSquare(int n, int m)
    {
        int[][] magicSquare = new int[n][n];

        for (int thisProgramIsSlow = 0; thisProgramIsSlow < 1; thisProgramIsSlow++)
        {
            int temporary = thisProgramIsSlow-1;
            for (int i = 0; i < n; i++)
            {
                int temp = i-1;

                for (int j = 0; j < n; j++)
                {
                    Random r = new Random();
                    magicSquare[i][j] = r.nextInt((m+1));
                }
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
        }
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