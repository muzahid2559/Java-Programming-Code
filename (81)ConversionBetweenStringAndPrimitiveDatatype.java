
package javaapplication;

public class ConversionBetweenStringAndPrimitiveDatatype {
    public static void main(String[] args) {
        //primitive to string datatype
        int i = 100;
        String S = Integer.toString(i);
        System.out.println(S);
        
        double j = 125.26;
        String k = Double.toString(j);
        System.out.println(k);
        
        boolean b = true;
        String M = Boolean.toString(b);
        System.out.println(M);
        
        //string to primitive datatype
        String U = "33";
        int V = Integer.parseInt(U);
        System.out.println(V);
        
        String W = "23.23";
        double X = Double.parseDouble(W);
        System.out.println(X);
    }
}
