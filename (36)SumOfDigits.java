
package javaapplication;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        int num,sum=0,reminder,temp;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Any  Number:");
        num=input.nextInt();
        temp=num;
        while(temp!=0)
        {
            reminder=temp%10;
            sum=sum+reminder;
            temp=temp/10;
        }
        System.out.println("Sum of Digits = "+sum);
    }
}
