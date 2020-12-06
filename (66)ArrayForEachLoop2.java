
package javaapplication;

public class ArrayForEachLoop2 {
    public static void main(String[] args) {
        int []num=new int[5];
        num[0]=4;
        num[1]=5;
        num[2]=46;
        num[3]=47;
        num[4]=48;
        int sum=0;
        for(int x:num)
        {
            sum=sum+x;
        }
        System.out.println("Sum="+sum);
    }
}
