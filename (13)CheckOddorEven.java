package javaapplication;

import java.util.Scanner;

public class CheckOddorEven {
    public static void main(String[] args) {
         int num;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter  Number:");
        num=input.nextInt();
        if(num%2==0)
        {
            System.out.println(num+" is Even");
        }
        else if(num%2==1)
        {
            System.out.println(num+" is Odd");
        }
    }
 
}
