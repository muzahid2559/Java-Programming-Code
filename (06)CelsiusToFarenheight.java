package javaapplication;

import java.util.Scanner;

public class CelsiusToFarenheight {
    public static void main(String[] args) {
        double Celsius,Farenheight;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Celsius:");
        Celsius=input.nextDouble();
        Farenheight=1.8*Celsius+32;
        System.out.println("Celsius To Farenheight = "+Farenheight);
    }
}
