
package javaapplication;


public class WrapperClassAutoboxingUnboxing {
    public static void main(String[] args) {
        int x = 30;
        System.out.println(x);
        
        //premitive to object(Autoboxing)
        Integer y =Integer.valueOf(x);
        System.out.println(y);
        
        Integer z = x;
        System.out.println(z);
        
        //object to premitive datatype(unboxing)
        Double d = new Double(23.5);
        System.out.println(d);
        
        Double e = d;
        System.out.println(e);
 
    }
}
