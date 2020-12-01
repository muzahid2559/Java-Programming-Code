
package javaapplication;

import java.util.Scanner;

public class SeriesDemo2 {
    public static void main(String[] args) {
        int n,sum=0;
        Scanner input=new Scanner(System.in);
        System.out.println("1^2+2^2+3^2+....+n^2= ?");

        System.out.println("Enter The End Number:");
        n=input.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            System.out.print(i+" ");
            sum=sum+i*i;
        }
        System.out.println("= "+sum);
        



    }
 
}
