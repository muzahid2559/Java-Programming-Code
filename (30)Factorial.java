
package javaapplication;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int num,fact=1;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Number:");
        num=input.nextInt();
        for(int i=num;i>=1;i--)
        {
          fact=fact*i;
        }
        System.out.println("Factorial="+fact);
    }
}
