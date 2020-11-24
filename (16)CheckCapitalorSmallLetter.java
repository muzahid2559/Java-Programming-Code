package javaapplication;

import java.util.Scanner;

public class CheckCapitalorSmallLetter {
    public static void main(String[] args) {
        char ch;
        Scanner input=new Scanner(System.in);
        ch=input.next().charAt(0);
        if(ch>='A'&& ch<='Z')
        {
            System.out.println(ch+" is Capital Letter");
        }
        else if(ch>='a'&& ch<='z')
        {
            System.out.println(ch+" is Small Letter");
        }

    }
}
