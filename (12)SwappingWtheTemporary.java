
package javaapplication;

import java.util.Scanner;


public class SwappingWtheTemporary {
    public static void main(String[] args) {
        int num1,num2,temp;
        Scanner input=new Scanner(System.in);
        System.out.print("Please Enter Num1:");
        num1=input.nextInt();
        System.out.print("Please Enter Num2:");
        num2=input.nextInt();
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("Num1: "+num1);
        System.out.println("Num2: "+num2);
    }
}
