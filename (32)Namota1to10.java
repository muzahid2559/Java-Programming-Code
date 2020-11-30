
package javaapplication;

import java.util.Scanner;

public class Namota1to10 {
    public static void main(String[] args) {
         int num;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Number:");
        num=input.nextInt();
        for(int i=1;i<=num;i++)
        {
         for(int j=1;j<=10;j++)
         {
            System.out.println(i+"X"+j+"="+i*j);
            
         }
            System.out.println("");
        }
    }
 
}
