
package javaapplication;

import java.util.Scanner;


public class GettingInputfor2DArray {
    public static void main(String[] args) {
        int m,n;
        int [][]num=new int[10][10];
        Scanner input = new Scanner (System.in);
        System.out.println("How many row do you want?:");
        m=input.nextInt();
        System.out.println("How many coloum do you want?:");
        n=input.nextInt();
        System.out.println("Input Values:");
        for(int r=0;r<m;r++)
        {
            for(int c=0;c<n;c++)
            {
                
                num[r][c]=input.nextInt();
            }
        }
        System.out.println("Output The Matrix:");
        for(int r=0;r<m;r++)
        {
            for(int c=0;c<n;c++)
            {
                System.out.print(" "+num[r][c]);
            }
            System.out.println();
        }

    }
}
