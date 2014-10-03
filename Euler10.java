/*
 * Summation of primes
 * 
 * Problem 10
 * 
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 * 
 * Expected result: 142913828922
 */
public class Euler10 {

    public static void main(String[] args) {
   
        long count = 0;
        for (int n=2; n<2000000; n++) {
            if (primo(n) == true){           
                count = count + n;
            }
                              
        }
        System.out.println(count);
    }
    
    public static boolean primo(int n) {
        boolean eprimo = true;
        int i = 2;
        while ((eprimo == true) && (i <= (Math.sqrt(n)))) {
            if ((n % i) == 0)
                eprimo = false;
            else i++;
    }
        return (eprimo); 
  }
}