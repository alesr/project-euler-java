/*
 * Power digit sum
 * 
 * Problem 16  
 * 
 * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * What is the sum of the digits of the number 2^1000?
 * 
 * Expected result: 1366
 */
import java.math.BigInteger;

public class Euler16 {
    
    public static void main(String[] args){
     	
     	// Calcula 2^1000.   
        BigInteger n = BigInteger.valueOf(2);
        n = n.pow(1000);

        String s;
        int r;
        
        SumDigits b = new SumDigits();
        r = b.sumD(n);
        
        System.out.println(r);
    }
}