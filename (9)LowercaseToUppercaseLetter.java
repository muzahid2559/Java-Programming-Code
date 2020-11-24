package javaapplication;

import java.util.Scanner;

public class LowercaseToUppercaseLetter {

    public static void main(String[] args) {
        char lowercase, uppercase;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Lowercase Letter:");
        lowercase = input.next().charAt(0);
        uppercase = (char) (lowercase - 32);
        System.out.print("The Uppercase Letter is: " + uppercase);
        System.out.println("");

    }

}
