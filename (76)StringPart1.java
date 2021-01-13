
package javaapplication;


public class StringPart1 {
    public static void main(String[] args) {
        String s1 = "Muzahidul Islam";
        String s2 = new String ("Muzahidul Islam");
        
        System.out.println("S1 = "+s1);
        System.out.println("S2 = "+s2);
        
        
        //Len operator
        int len= s1.length();
        System.out.println("Length of S1 = "+len);
        
        //Equal Operator
        if(s1.equals(s2)){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
        
        //Equal Operator
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
        //contains operator
        boolean con =s1.contains("Islam");
        System.out.println(con);
    }
}
