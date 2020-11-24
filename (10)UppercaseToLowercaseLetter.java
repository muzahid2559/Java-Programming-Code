
package javaapplication;

import java.util.Scanner;

public class UppercaseToLowercaseLetter {
    public static void main(String[] args) {
        char lowercase, uppercase;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Uppercase Letter:");
        uppercase = input.next().charAt(0);
        lowercase = (char) (uppercase + 32);
        System.out.print("The Lowercase Letter is: " + lowercase);
        System.out.println("");
    }
}
