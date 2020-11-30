package javaapplication;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num,sum=0,reminder,temp;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Any  Number:");
        num=input.nextInt();
        temp=num;
        while(temp!=0)
        {
            reminder=temp%10;
            sum=sum*10+reminder;
            temp=temp/10;
        }
        if(num==sum)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}
