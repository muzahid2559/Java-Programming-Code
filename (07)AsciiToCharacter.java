
package javaapplication;

import java.util.Scanner;

public class AsciiToCharacter {
    public static void main(String[] args) {
        int num;
        Scanner input=new Scanner(System.in);
        System.out.print("Please Enter Any Ascii Value:");
        num=input.nextInt();
        System.out.print("The Ascii Character is:");
        System.out.println((char)num);
    }
}
