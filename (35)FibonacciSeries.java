
package javaapplication;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int num;
        Scanner input=new Scanner(System.in);
        System.out.println("How many  Number:");
        num=input.nextInt();
        int first=0;
        int second=1;
        int fibo;
        System.out.print(first+" "+second);
        for(int i=3;i<=num;i++)
        {
            fibo= first+second;
            System.out.print(" "+fibo);
            first=second;
            second=fibo;
        }
        System.out.println(" ");
    }
            
}
