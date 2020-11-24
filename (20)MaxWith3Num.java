package javaapplication;

import java.util.Scanner;

public class MaxWith3Num {
    public static void main(String[] args) {
        int a,b,c;
         Scanner input=new Scanner(System.in);
        System.out.println("Enter Number1:");
        a=input.nextInt();
        System.out.println("Enter Number2:");
        b=input.nextInt();
        System.out.println("Enter Number3:");
        c=input.nextInt();
        if(a>b)
        {
            if(a>c)
            {
                System.out.println(a+"is the maximum");
            }
            else
            {
                System.out.println(c+"is the maximum");
            }
        }
        else
        {
            if(b>c)
            {
                System.out.println(b+"is the maximum");
            }
            else
            {
                System.out.println(c+"is the maximum");
            }
        }

    }
}