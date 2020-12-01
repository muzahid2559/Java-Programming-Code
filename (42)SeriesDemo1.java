
package javaapplication;

import java.util.Scanner;

public class SeriesDemo1 {
    public static void main(String[] args) {
        int n,sum=0;
        Scanner input=new Scanner(System.in);
        System.out.println("1+3+5+7....+n= ?");

        System.out.println("Enter The End Number:");
        n=input.nextInt();
        
        for(int i=1;i<=n;i=i+2)
        {
            System.out.print(i+" ");
            sum=sum+i;
        }
        System.out.println("= "+sum);
        



    }
 
}
