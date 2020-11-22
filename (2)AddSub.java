
package javaapplication;

import java.util.Scanner;

public class AddSub {
    public static void main(String[] args) {
        int A,B,X;
        String C,D,Z;
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Integers Input:");
        A=input.nextInt();
        B=input.nextInt();
       
        X=(A+B);
        System.out.println(A+"+"+B+"="+X);
        X=(A-B);
        System.out.println(A+"-"+B+"="+X);
        X=A*B;
        System.out.println(A+"*"+B+"="+X);
        X=A/B; 
        System.out.println(A+"/"+B+"="+X);
        double X1=(double) A%B;
        System.out.println(A+"%"+B+"="+X1);
        System.out.println("Stings Input:");
        C=input.next();
        D=input.next();
        Z=C+D;
        System.out.println(C+"+"+D+"="+X);

    }
}
