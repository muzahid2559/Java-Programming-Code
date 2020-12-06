package javaapplication;

import java.util.Scanner;

public class ArraySearchingAnumberLinearSearch {

    public static void main(String[] args) {
        int  n, searchnum;
        int[] a = new int[100];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many integer you want to read:");
        n = input.nextInt();
        System.out.println("Enter the value:");
        for (int i = 1; i <=n; i++) {
            a[i] = input.nextInt();
        }
        System.out.print("Enter the value you want search:");
        searchnum = input.nextInt();
        int flag = 0;
        for (int i = 1; i <= n; i++) {
            if (searchnum == a[i]) {
                System.out.println("Found");
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Not Found");
        }
    }
}
