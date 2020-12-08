
package javaapplication;

import java.util.Scanner;


public class ArrayMatrixMultiplication {
    public static void main(String[] args) {
        int r1,c1,r2,c2,sum=0;
        int [][]a=new int[10][10];
        int [][]b=new int[10][10];
        int [][]Multiple=new int[10][10];
        Scanner input = new Scanner (System.in);
        System.out.print("How many row do you want in First Matrix:");
        r1=input.nextInt();
        System.out.print("How many coloum do you want First Matrix:");
        c1=input.nextInt();
        
        System.out.print("How many row do you want Sceond Matrix:");
        r2=input.nextInt();
        System.out.print("How many coloum do you want Sceond Matrix:");
        c2=input.nextInt();
        
        while(c1!=r2)
        {
        System.out.println("Error! ");
        System.out.print("How many row do you want in First Matrix:");
        r1=input.nextInt();
        System.out.print("How many coloum do you want First Matrix:");
        c1=input.nextInt();
        
        System.out.print("How many row do you want Sceond Matrix:");
        r2=input.nextInt();
        System.out.print("How many coloum do you want Sceond Matrix:");
        c2=input.nextInt();
        }
        
        System.out.println("A:");
        for(int row=0;row<r1;row++)
        {
            for(int col=0;col<c1;col++)
            {
                
                System.out.printf("A[%d][%d]=",row,col);
                a[row][col]=input.nextInt();
            }
        }
      
        System.out.println("B:");
        for(int row=0;row<r2;row++)
        {
            for(int col=0;col<c2;col++)
            {
                
                System.out.printf("B[%d][%d]=",row,col);
                b[row][col]=input.nextInt();
            }
        }
        
        
         System.out.print("A:");
        for(int row=0;row<r1;row++)
        {
            for(int col=0;col<c1;col++)
            {
                System.out.print("\t"+a[row][col]);
            }
            System.out.println();
        }
        System.out.print("B:");
          for(int row=0;row<r2;row++)
        {
            for(int col=0;col<c2;col++)
            {
                System.out.print("\t"+b[row][col]);
            }
            System.out.println();
        }
          
        for(int row=0;row<r1;row++)
        {
            for(int col=0;col<c2;col++)
            {
                for(int k=0;k<c1;k++)
                {
                    sum=sum+a[row][k]*b[k][col] ;  
                   
                }
                 Multiple[row][col]=sum;
                 sum=0;
            }
            System.out.println("");
                    
        }
        System.out.println("Multiple:");
        for(int row=0;row<r1;row++)
        {
            for(int col=0;col<c2;col++)
            {
                System.out.print("\t"+Multiple[row][col]);
            }
            System.out.println();
        }
    }
        
    }

