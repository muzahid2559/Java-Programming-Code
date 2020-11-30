
package javaapplication;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        int num,sum=0,reminder,temp;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Any  Number:");
        num=input.nextInt();
        temp=num;
        while(temp!=0)
        {
            reminder=temp%10;
            int fact = 1;
            int i;
            for(i=1;i<=reminder;i++)
            {
                fact=fact*i;
            }
            sum=sum+fact;
            temp=temp/10;
        }
        if(sum==num)
        {
            System.out.println(num+" is a Strong number");
        }
        else
        {
           System.out.println(num+" is not a Strong number");

        }
    }
}
