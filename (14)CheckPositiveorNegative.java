
package javaapplication;

import java.util.Scanner;

public class CheckPositiveorNegative {
    public static void main(String[] args) {
        int num;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter  Number:");
        num=input.nextInt();
        if(num>0)
        {
            System.out.println(num+" is Positive");
        }
        else if(num<0)
        {
            System.out.println(num+" is Negative");
        }
        else
        {
            System.out.println("is zero,neither positive or negative"); 
        }
            
    }
}
