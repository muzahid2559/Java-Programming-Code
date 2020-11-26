package javaapplication;

import java.util.Scanner;

public class SwitchMenuBasedTemperatureConversion {
    public static void main(String[] args) {
        int choice;
        float temp,ConvertedTemp;
        Scanner input=new Scanner(System.in);
        System.out.println("--------Temperature Conversion Menu---------");
        System.out.println("1.Celsius To Farenheight");
        System.out.println("2.Farenheight To Celsius ");
        System.out.println("Enter Your Choice:");
        choice=input.nextInt();
        
        switch(choice){
            
            case 1:
            {
                System.out.println("Enter the Celsius Temperature :");
                temp=input.nextFloat();
                ConvertedTemp=(float) ((9*temp+160)/5);
                System.out.println("The temperature in Fahrenheit is: "+ConvertedTemp);
                break;
            }
            case 2:
            {
                System.out.println("Enter the Fahrenheit temperature :");
                temp=input.nextFloat();
                ConvertedTemp=(float) ((5*temp-160)/9);
                System.out.println("The temperature in Celsius is: "+ConvertedTemp);
                break;
            }
            default:
                System.out.println("Not a correct option");
        }
    }
}
