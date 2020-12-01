
package javaapplication;

import java.util.Scanner;

public class PatternDemo15 {
    public static void main(String[] args) {
        int num;
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter Line Number:");
        num=input.nextInt();
        for(int row=1;row<=num;row++)
        {
            for(int colum=1;colum<=num;colum++)
            {
               if(row==1 || row==num || colum==1 || colum==num )
               {
                System.out.print("*");
               }
               else
               {
                   System.out.print(" ");
               }
            }
            System.out.println("");
        }
    }
}
