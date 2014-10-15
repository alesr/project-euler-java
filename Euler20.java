/*
 * Factorial digit sum
 *
 * Problem 20
 *
 * n! means n × (n − 1) × ... × 3 × 2 × 1
 *
 * For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
 * and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
 *
 * Find the sum of the digits in the number 100!
 *
 * Expected result: 648
 */
import java.math.BigInteger;

public class Euler20 {
    
    public static void main(String[] args){
         
        /** Calcula factorial */
        BigInteger factorial = BigInteger.ONE;            // Inicializa factiorial com 1
        int i = 2;
        while(i<=100){                               
            BigInteger bigI = BigInteger.valueOf(i);   // Atribui a bigI o correspondente BigInteger de i
            factorial = factorial.multiply(bigI);     // Multiplica o valor agregado de factoria por bigI
            i++;
        }
        
        String factStr = factorial.toString();      // BigInt factorial para String.
        int sum = 0;    
        int strLen = factStr.length();            
        int j = 0;
        /** Para cada j em factStr até o limite de strLen, soma o valor inteiro do char na posição inteiro a sum. */
        while(j<strLen){
            sum += Integer.parseInt(String.valueOf(factStr.charAt(j)));
            j++;
        }
        System.out.println(sum);
    }
}