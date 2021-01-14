
package javaapplication;

import java.util.Random;


public class RandomNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        
        //System = 1
        int randomNumber = rand.nextInt(10);
        System.out.println("Random Number = "+randomNumber);
        
        
        //System = 2
        int randomnumber = (int) (Math.random()*(10));
        System.out.println("Random Number = "+randomnumber);
        
    }
}
