
package javaapplication;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateCurrent {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        
        
        DateFormat dateFormat = new SimpleDateFormat("DD/MM/YYYY");
        String CurrentDate = dateFormat.format(date);
        System.out.println(CurrentDate);
        
    }
}
