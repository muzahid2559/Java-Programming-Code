
package javaapplication;

import java.util.Scanner;

public class SeriesDemo3 {
    public static void main(String[] args) {
        int n,sum,odd=0,even=0;
        Scanner input=new Scanner(System.in);
        System.out.println("1-2+3-4+5-6....+n= ?");

        System.out.println("Enter The End Number:");
        n=input.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
               System.out.print(i+"+");
                even+=i;
            }
            else
            {
                System.out.print(i+"-");
                odd+=i;
            }
        }
        sum=odd-even;
        System.out.println("= "+sum);
        



    }
 
}
