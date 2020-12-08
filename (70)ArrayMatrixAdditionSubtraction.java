
package javaapplication;

import java.util.Scanner;


public class ArrayMatrixAdditionSubtraction {
    public static void main(String[] args) {
          int m,n;
        int [][]a=new int[10][10];
        int [][]b=new int[10][10];
        Scanner input = new Scanner (System.in);
        System.out.println("How many row do you want:");
        m=input.nextInt();
        System.out.println("How many coloum do you want:");
        n=input.nextInt();
        
        //Scan A
        System.out.println("A:");
        for(int row=0;row<m;row++)
        {
            for(int col=0;col<n;col++)
            {
                
                System.out.printf("A[%d][%d]=",row,col);
                a[row][col]=input.nextInt();
            }
        }
        //Scan B
        System.out.println("A:");
        for(int row=0;row<m;row++)
        {
            for(int col=0;col<n;col++)
            {
                
                System.out.printf("B[%d][%d]=",row,col);
                b[row][col]=input.nextInt();
            }
        }
        
        //print A
        System.out.println("\n");
        System.out.print("A:");
        for(int row=0;row<m;row++)
        {
            for(int col=0;col<n;col++)
            {
                System.out.print("\t"+a[row][col]);
            }
            System.out.println();
        }
        
        //print B
        System.out.println("\n");
        System.out.print("B:");
          for(int row=0;row<m;row++)
        {
            for(int col=0;col<n;col++)
            {
                System.out.print("\t"+b[row][col]);
            }
            System.out.println();
        }
          
        //Addition
        System.out.println("\n");
        System.out.print("A+B:");
        for(int row=0;row<m;row++)
        {
            for(int col=0;col<n;col++)
            {
                System.out.print("\t"+(a[row][col]+b[row][col]));
            }
            System.out.println();
        }
        
        //Subtraction
        System.out.println("\n");
        System.out.print("A-B:");
        for(int row=0;row<m;row++)
        {
            for(int col=0;col<n;col++)
            {
                System.out.print("\t"+(a[row][col]-b[row][col]));
            }
            System.out.println();
        }

    }
}
