/*
 * 1000-digit Fibonacci number
 *
 * Problem 25
 * 
 * The 12th term, F12, is the first term to contain three digits.
 *
 * What is the first term in the Fibonacci sequence to contain 1000 digits?
 * 
 * Expected result: 4782
 */
import java.math.BigInteger;

public class Euler25 {

    public static void main(String[] args){

        BigInteger f1 = BigInteger.valueOf(1);
        BigInteger f2 = BigInteger.valueOf(2);
        BigInteger f3 = BigInteger.valueOf(0);

        int i = 3;
        
        for (i = 3; f3.toString().length()<1000; i++){
            f3 = f1.add(f2);
            f1 = f2;
            f2 = f3;
        }
        System.out.println(i);
    }
}