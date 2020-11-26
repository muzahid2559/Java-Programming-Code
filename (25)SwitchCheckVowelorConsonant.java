package javaapplication;

import java.util.Scanner;

public class SwitchCheckVowelorConsonant {
    public static void main(String[] args) {
        char ch;
        Scanner input=new Scanner(System.in);
        ch=input.next().charAt(0);
        
        switch(ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
                
        }
    }
}
