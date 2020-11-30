
package javaapplication;

import java.util.Scanner;

public class NamotaProgram {
    public static void main(String[] args) {
        
        int num;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Number:");
        num=input.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(num+"X"+i+"="+num*i);
        }
    }
 
}
