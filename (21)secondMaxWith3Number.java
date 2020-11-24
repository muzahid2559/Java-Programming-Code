package javaapplication;

import java.util.Scanner;

public class secondMaxWith3Number {
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
            if(b>c)
            {
                System.out.println(b+" is the Second maximum");
            }
            else
            {
                if(c<a)
                {
                    System.out.println(c+" is the Second maximum");
                }
                else
                {
                System.out.println(a+" is the Second maximum");
                }
            }
        }
        else
        {
            if(b<c)
            {
                System.out.println(b+" is the Second maximum");
            }
            else
            {
                if(c>a)
                {
                    System.out.println(c+" is the Second maximum");
                }
                else
                {
                    System.out.println(a+" is the Second maximum");
                }
            }
        }
    }
}
