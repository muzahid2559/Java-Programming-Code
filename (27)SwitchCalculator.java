
package javaapplication;

import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
        double num1,num2;
        char op;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a Operator(+,-,*,/):");
        op=input.next().charAt(0);

        
        
        switch(op){
            case '+':
            {
                System.out.print("Enter number 1:");
                num1=input.nextDouble();
                System.out.print("Enter number 2:");
                num2=input.nextDouble();
                System.out.print(num1+num2);
                System.out.println("");
                break;
            }
            case '-':
            {
                System.out.print("Enter number 1:");
                num1=input.nextDouble();
                System.out.print("Enter number 2:");
                num2=input.nextDouble();
                System.out.print(num1-num2);
                System.out.println("");
                break;
            }
            case '*':
            {
                System.out.print("Enter number 1:");
                num1=input.nextDouble();
                System.out.print("Enter number 2:");
                num2=input.nextDouble();
                System.out.print(num1*num2);
                System.out.println("");
                break;
            }
            case '/':
            {
                System.out.print("Enter number 1:");
                num1=input.nextDouble();
                System.out.print("Enter number 2:");
                num2=input.nextDouble();
                System.out.print(num1/num2);
                System.out.println("");
                break;
            }
            default:
                System.out.println("Not a Valid Operator");
        }
    }
}
