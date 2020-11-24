package javaapplication;

import java.util.Scanner;

public class FarenheightToCelsius {
    public static void main(String[] args) {
        double Celsius,Farenheight;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter farenheight:");
        Farenheight=input.nextDouble();
        Celsius=0.55*Farenheight-32;
        System.out.println("Celsius To Farenheight = "+Celsius);

    }
}
