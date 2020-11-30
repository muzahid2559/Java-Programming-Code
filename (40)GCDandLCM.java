
package javaapplication;

import java.util.Scanner;

public class GCDandLCM {
    public static void main(String[] args) {
        int num1,num2,n1,n2,rem,gcd,lcm;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Two Number:");
        num1=input.nextInt();
        num2=input.nextInt();
        
        n1=num1;
        n2=num2;
        
        while(n2!=0)
        {
            rem=n1%n2;
            n1=n2;
            n2=rem;
        }
        gcd=n1;
        lcm=(num1*num2)/gcd;

        System.out.println("GCD = "+gcd);
        System.out.println("LCM = "+lcm);
    
    }
}
