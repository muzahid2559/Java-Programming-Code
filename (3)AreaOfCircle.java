
package javaapplication;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        double pi=3.1416, R,Area;
        Scanner input=new Scanner(System.in);
        R=input.nextDouble();
        Area=pi*(R*R);
        System.out.println("Area of Circle = "+Area);
    }
}