/*
Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable numbers.

For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.

Evaluate the sum of all the amicable numbers under 10000.
*/
package euler21;

import java.util.ArrayList;
import java.util.List;

public class Euler21 {

    public static void main(String args[]){
        int tally = 0;
        for(int y = 1; y <= 10000; y ++){
            List<Integer> x = factors(y);
            int x1 = get_total(x);
            List<Integer> x3 = factors(x1);
            int x4 = get_total(x3);
            if((y == x4) && (y != x1)){
                tally += y;
            }
        }
        System.out.format("VALOR = %d%n", tally);
    }
     
    public static List<Integer> factors(int number){
        List<Integer> L = new ArrayList<Integer>();
        for(int i = 1; i <= ((number / 2) + 1); i ++){
            if(number % i == 0){
                L.add(i);
            }
        }
        return L;
    }
     
    public static Integer get_total(List<Integer> list) {
             Integer sum= 0;
             for (Integer i:list)
                 sum = sum + i;
             return sum;
    }
}