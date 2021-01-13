
package javaapplication;

public class StringPart3 {
    public static void main(String[] args) {
        String country = "   Bangladesh is my country    ";
        System.out.println(country);
        
        String s2 = country.trim();//spece remove method
        System.out.println(s2);
        
        char ch = country.charAt(0);
        System.out.println("ch = "+ch);
        
        int value = country.codePointAt(0);
        System.out.println("Value = "+value);
        
        int pos = country.indexOf("is");
        System.out.println("First position of B = "+pos);
        
        pos = country.lastIndexOf("n");
        System.out.println("Last position of n = "+pos);
    }
}
