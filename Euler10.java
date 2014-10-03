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

        /** Para cada n entre 2 e 2 milhões, caso n seja primo, incremanta o valor de n à variável count */
        for (int n=2; n<2000000; n++) {
            if (primo(n) == true){           
                count += n;
            }
                              
        }
        System.out.println(count);
    }
    

    /** @return true se n for primo */
    public static boolean primo(int n) {

        boolean eprimo = true;
        int i = 2;

        /** Se o resto da divisão de n por i for resto zero, significa que o número tem mais divisores além dele mesmo (n). 
        Caso contrário, incrementa-se o valor de i e repete-se o ciclo para todos os valores até a raíz quadrada de n */
        while ((eprimo == true) && (i <= (Math.sqrt(n)))) {
            if ((n % i) == 0)
                eprimo = false;
            else i++;
    }
        return (eprimo); 
  }
}