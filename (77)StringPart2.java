
package javaapplication;


public class StringPart2 {
    public static void main(String[] args) {
        String firstName = "Muzahidul";
        String LastName = " Islam";
        
        String FullName = firstName.concat(LastName);
        System.out.println("Full Name = "+FullName);
        
        //Uppercase Methods
        String upperName = FullName.toUpperCase();
        System.out.println("UpperName = "+upperName);
        
       // Lowercase Methods
        String LowerName = FullName.toLowerCase();
        System.out.println("LowerName = "+LowerName);
        
        //startWith Methodsd
        boolean start = firstName.startsWith("M");
        System.out.println("Name Start = "+start);
        
        boolean end = LastName.endsWith("m");
        System.out.println("Name end = "+end);
    }
}
