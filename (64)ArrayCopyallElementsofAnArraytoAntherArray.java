
package javaapplication;

import java.util.Scanner;

public class ArrayCopyallElementsofAnArraytoAntherArray {
    public static void main(String[] args) {
        int []arry1=new int[30];
        int []arry2=new int[30];
        int n;
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter how many integer you want to read:");
        n=input.nextInt();
        System.out.println("Enter the value:");
        for (int i=0;i<n;i++)
        {
            arry1[i]=input.nextInt();
        }
        System.out.println("Arry1:");
        for (int i=0;i<n;i++)
        {
            System.out.println(arry1[i]);
        }
        for (int i=0;i<n;i++)
        {
            arry2=arry1;
        }
        System.out.println("Arry2:");
        for (int i=0;i<n;i++)
        {
            System.out.println(arry2[i]);
        }



    }
}
