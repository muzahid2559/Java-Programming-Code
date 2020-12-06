
package javaapplication;

public class ArrayForEachLoop1 {
    public static void main(String[] args) {
       // String[]names=new String[4];
       String[]names=new String[4];
       names[0]="muzahid";
       names[1]="sadik";
       names[2]="moshiur";
       names[3]="ripon";
       
       for(String x:names)
       {
           System.out.println(x);
       }
    }
}
