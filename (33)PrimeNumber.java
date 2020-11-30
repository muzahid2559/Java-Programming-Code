package javaapplication;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int num,count=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Number:");
        num=input.nextInt();
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                count++;
                break;
            }
        }
        if(count==0)
        {
            System.out.println(num+" is Prime Number");
        }
        else
        {
            System.out.println(num+" is Not Prime");
        }
    }
}