package javaapplication;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        double base,height,Area;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter base:");
        base=input.nextDouble();
        System.out.println("Enter height:");
        height=input.nextDouble();
        Area=0.5*base*height;
        System.out.println("Area of Traiangle = "+Area);
    }
}
