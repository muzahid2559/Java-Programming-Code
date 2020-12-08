
package javaapplication;

import java.util.ArrayList;

public class ArraylistUseMethods {
    public static void main(String[] args) {
        
        ArrayList<Integer>num=new ArrayList<>();
        System.out.println("Size = "+num.size());
        
        
        //Adding Element
        num.add(10);
        num.add(12);
        num.add(0, 14);
        num.add(2, 16);
        num.add(3, 18);
        
        //Normal Print
        System.out.println("ArrayList Contains : "+num);
        
        //isEmpty Method(check value)
        boolean check=num.isEmpty();
        System.out.println("check arrayList Empty : "+check);
        
        
        //contains Method
        boolean CheckValue=num.contains(12);
        System.out.println("12 is in the list : "+CheckValue);
        
       // indexOf Method
       int position=num.indexOf(12);
       System.out.println("The index of 12 is : "+position);
       
       //ser method(repleace)
       num.set(2, 15);
       System.out.println("After satting"+num);
       
       
       
       int x=num.get(0);
       System.out.println("Index 0 : "+x);
    }
}
