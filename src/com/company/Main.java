package com.company;

import java.util.Scanner;

public class Main extends MagicSquareCreator {

    public static void main(String[] args) {

        System.out.println("n = number of rows and columns (Ex. n = 2;  Matrix = 2x2)");
        System.out.println("m = magic number (number that all numbers in each row/column add up too)" + "\n");
        int n = 0;

        for (int i = 0; i < 1; i++)
        {
            try
            {
                Scanner in = new Scanner(System.in);
                System.out.print("Enter Integer Value for 'n' :: ");
                n = in.nextInt();
            } catch (Exception e)
            {
                System.out.println("Please Enter an Integer" + "\n");
                i--;
            }
        }

        int m = 0;

        for (int i = 0; i < 1; i++)
        {
            try
            {
                Scanner in = new Scanner(System.in);
                System.out.print("Enter Integer Value for 'm' :: ");
                m = in.nextInt();
            } catch (Exception e)
            {
                System.out.println("Please Enter an Integer" + "\n");
                i--;
            }
        }
        createMagicSquare(n, m);
    }
}
