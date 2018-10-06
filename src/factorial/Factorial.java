/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;
import java.math.BigInteger;
import java.lang.Math;
import java.util.Scanner;
/**
 *
 * @author Liza
 * The program calculates inverse factorial of 2000! in 2 seconds.
 * I use BigInteger class to be able to work with extremly long numbers.
 * 
 * The inverseFactorial method gets input number as an argument and
 * calculates inverse factorial by dividing factorial by n in the loop 
 * until the factorial is 1. Variation n is incremented previously. 
 * For example: 
 *  Given number n! is 24, need to find n.  
 *  24/1=24
 *  24/2=12
 *  12/3=4
 *  4/4=1 - the result of dividing is 1, so n is 4.
 */
public class Factorial {
    
    public static int inverseFactorial(BigInteger number) {
        
        int n = 1;
        
        while (number.compareTo(BigInteger.ONE)==1){
            n++;
            number = number.divide(BigInteger.valueOf(n));
        }
    return n;
    }
    
    public static void main(String[] args) {
        
        System.out.print("Input factorial n! (n must be natural number from 1 to 2000): ");
        
        Scanner in = new Scanner(System.in); 
        BigInteger number = new BigInteger(in.next());
     
        System.out.println("Congratulations! The result (n) is: " 
                            +inverseFactorial(number));
    }
}
