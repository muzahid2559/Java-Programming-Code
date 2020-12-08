
package javaapplication;

import java.util.Scanner;


public class ArrayTransposeMatrix {
    public static void main(String[] args) {
        int m,n;
        int [][]a=new int[10][10];
        int [][]Transpose=new int[10][10];
        Scanner input = new Scanner (System.in);
        System.out.print("How many row do you want:");
        m=input.nextInt();
        System.out.print("How many coloum do you want:");
        n=input.nextInt();
        System.out.println("A:");
        for(int row=0;row<m;row++)
        {
            for(int col=0;col<n;col++)
            {
                
                System.out.printf("A[%d][%d]=",row,col);
                a[row][col]=input.nextInt();
            }
        }
        System.out.print("A:");
        for(int row=0;row<m;row++)
        {
            for(int col=0;col<n;col++)
            {
                System.out.print("\t"+a[row][col]);
            }
            System.out.println();
        }
        for(int row=0;row<m;row++)
        {
            for(int col=0;col<n;col++)
            {
                
                Transpose[col][row]=a[row][col];
            }
        }
        
        System.out.println("Transpose Matrix:");
        for(int row=0;row<n;row++)
        {
            for(int col=0;col<m;col++)
            {
                
                System.out.print("\t"+Transpose[row][col]);
            }
            System.out.println("");
        }
    }
}
