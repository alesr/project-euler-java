
/*
The series, 11 + 22 + 33 + ... + 1010 = 10405071317.

Find the last ten digits of the series, 11 + 22 + 33 + ... + 10001000.
*/

import java.math.BigInteger;

public class Euler48 {
    public static void main(String[] args){
    
        BigInteger power = BigInteger.ZERO;
        BigInteger sum = BigInteger.ZERO; 

        /* para cada valor faz a sua até ao valor de 100*/
        for(int i = 1; i <= 1000; i++){
            sum = sum.add(BigInteger.valueOf(i).pow(i)) ;
        }
        String sumStr = sum.toString();
        System.out.println(sumStr.substring(sumStr.length()-10));   
    }
}