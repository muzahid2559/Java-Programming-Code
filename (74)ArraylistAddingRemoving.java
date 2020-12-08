
package javaapplication;

import java.util.ArrayList;
import java.util.Iterator;


public class ArraylistAddingRemoving {
    public static void main(String[] args) {
        ArrayList<Integer>num=new ArrayList<>();
        System.out.println("Size = "+num.size());
        
        
        //Adding Element
        num.add(10);
        num.add(121);
        num.add(0, 14);
        
        //Normal Print
        System.out.println("ArrayList Contains : "+num);
        
        //for each loop print
        for(int x:num)
        {
            System.out.print(" "+x);
        }
        System.out.println("");
        
        
        //Iterator print
        Iterator KM=num.iterator();
        while(KM.hasNext())
        {
            System.out.print(" "+KM.next());
        }
         System.out.println("");
        
        //size
        System.out.println("Size = "+num.size());
        
        //remove element 
        
        num.remove(2);
        System.out.print("After removing arraylist contains : "+num);
        System.out.println("");
        
        num.removeAll(num);
        System.out.println("After removing All : "+num);
    }
}
