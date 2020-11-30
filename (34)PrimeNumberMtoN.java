package javaapplication;

import java.util.Scanner;

public class PrimeNumberMtoN {

    public static void main(String[] args) {
        int m, n, count = 0, TotalPrime = 0,TotalNotPrime=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter initial Number:");
        m = input.nextInt();
        System.out.println("Enter ending Number:");
        n = input.nextInt();
        for (int i = m; i <= n; i++) {
            for (int j = 2; j <= i - 1; j++) {

                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(i + " is Prime Number");
                TotalPrime++;
            } else {
                System.out.println(i + " is Not Prime");
                TotalNotPrime++;
            }

            count = 0;
        }
        System.out.println("Total Prime Number=" + TotalPrime);
        System.out.println("Total  Not Prime Number=" +TotalNotPrime);
    }
}
