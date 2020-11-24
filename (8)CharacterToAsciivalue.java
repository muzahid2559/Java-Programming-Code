
package javaapplication;

import java.util.Scanner;

public class CharacterToAsciivalue {
    public static void main(String[] args) {
        char num;
        Scanner input=new Scanner(System.in);
        System.out.print("Please Enter Any Ascii Value:");
        num=input.next().charAt(0);
        System.out.print("The  Character Ascii is:");
        System.out.println((int)num);
    }
}
