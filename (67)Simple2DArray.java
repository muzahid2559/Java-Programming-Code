
package javaapplication;

public class Simple2DArray {
    public static void main(String[] args) {
        int [][]num=new int[2][3];
        num[0][0]=1;
        num[0][1]=2;
        num[0][2]=3;
        num[1][0]=4;
        num[1][1]=5;
        num[1][2]=6;
        for(int r=0;r<2;r++)
        {
            for(int c=0;c<3;c++)
            {
                System.out.print(" "+num[r][c]);
            }
          System.out.println();

        }
    }
}
