
package javaapplication;

import java.util.Scanner;

public class SumofDiagonalUppertriangleandLowertriangleelements {
    public static void main(String[] args) {
         int m,n,sumOFDiagonal=0,sumOfUppertrigle=0,sumOfLowertriangle=0;
        int [][]A=new int[10][10];
        Scanner input = new Scanner (System.in);
        System.out.print("How many row do you want:");
        m=input.nextInt();
        System.out.print("How many coloum do you want:");
        n=input.nextInt();
        System.out.println("Input Values:");
        
        //input A
        for(int row=0;row<m;row++)
        {
            for(int col=0;col<n;col++)
            {
                System.out.printf("A[%d][%d]=",row,col);
                A[row][col]=input.nextInt();
            }
        }
        
        //output A
        System.out.print("A:");
        for(int row=0;row<m;row++)
        {
            for(int col=0;col<n;col++)
            {
                System.out.print("\t"+A[row][col]);
            }
            System.out.println();
        }
        
        
        for(int row=0;row<m;row++)
        {
            for(int col=0;col<n;col++)
            {
                
                if (row==col)
                {
                    sumOFDiagonal=sumOFDiagonal+A[row][col];
                }
                if(row<col)
                {
                    sumOfUppertrigle=sumOfUppertrigle+A[row][col];
                }
                if(row>col)
                {
                    sumOfLowertriangle=sumOfLowertriangle+A[row][col];
                }
            }
        }
        
        System.out.println("Sum of Diagonal Elements : "+sumOFDiagonal);
        System.out.println("Sum of Uppertriangle Elements : "+sumOfUppertrigle);
        System.out.println("Sum of Lowertriangle Elements : "+sumOfLowertriangle);
    }
}
