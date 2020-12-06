
package javaapplication;

import java.util.Scanner;

public class ArrayFindingSumandAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double sum=0;
        double []num = new double[10];
        System.out.println("Enter 10 Number:");
        for (int i=0;i<10;i++)
        {
            num[i]=input.nextDouble();
        }
        for(int i=0;i<10;i++)
        {
            sum=sum+num[i];
        }
        double Average = sum/10;
        System.out.println("Sum = "+sum);
        System.out.println("Average = "+Average);
        
    }
}
