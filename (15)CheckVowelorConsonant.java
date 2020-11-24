
package javaapplication;

import java.util.Scanner;


public class CheckVowelorConsonant {
    public static void main(String[] args) {
        char ch;
        Scanner input=new Scanner(System.in);
        ch=input.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            System.out.println("Vowel");
        }
        else if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        {
            System.out.println("vowel");
        }
        else
        {
            System.out.println("Consonant");
        }
    }
}
