
package javaapplication;

import java.util.Scanner;

public class PrintEvenNumberfromMtoN {
    public static void main(String[] args) {
        int sum=0;
        int m,n;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Initial Number:");
        m=input.nextInt();
        System.out.print("Enter Ending Number:");
        n=input.nextInt();
        
        for(int i=m;i<=n;i++)
        {
            if(i%2==0)
            {
                sum=sum+i;
                System.out.println(i);

            }
        }
        System.out.println("The sum of Even is = "+sum);


    }
}
