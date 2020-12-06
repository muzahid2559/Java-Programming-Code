
package javaapplication;

import java.util.Scanner;

public class ArrayFibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int n;
        int []num=new int[30];
        System.out.print("How many Fibonacci Number:");
        n=input.nextInt();
        
        num[0]=0;
        num[1]=1;
        for(int i=2;i<n;i++)
        {
            num[i]=num[i-1]+num[i-2];
        }
        
        for(int i=0;i<n;i++)
        {
            System.out.print(" "+num[i]);
        }
        
            System.out.println("");


    }
}
