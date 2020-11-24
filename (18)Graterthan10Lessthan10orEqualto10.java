
package javaapplication;

import java.util.Scanner;

public class Graterthan10Lessthan10orEqualto10 {
    public static void main(String[] args) {
        int num;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Number:");
        num=input.nextInt();
        if(num>10)
        {
            System.out.println(num+" is Grater than 10");
        }
        else if(num<10)
        {
            System.out.println(num+" is Less than 10");
        }
        else
        {
            System.out.println(num+" is Equal to 10");
        }
    }
}