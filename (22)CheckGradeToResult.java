
package javaapplication;

import java.util.Scanner;

public class CheckGradeToResult {
    public static void main(String[] args) {
        int mark;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Mark:");
        mark=input.nextInt();
        if(mark>100 || mark<0)
        {
            System.out.println("Invalid Mark");
        }
        else if(mark>=80 && mark<=100)
        {
            System.out.println("A+");
        }
        else if(mark>=70 && mark<=79)
        {
            System.out.println("A");
        }
         else if(mark>=60 && mark<=69)
        {
            System.out.println("A-");
        }
        else if(mark>=50 && mark<=59)
        {
            System.out.println("B");
        }
        else if(mark>=40 && mark<=49)
        {
            System.out.println("C");
        }
        else if(mark>=33 && mark<=39)
        {
            System.out.println("D");
        }
        else
        {
            System.out.println("F");
        }
    }
 
}
