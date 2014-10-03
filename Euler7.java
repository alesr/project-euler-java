/*
 * 10001st prime
 * 
 * Problem 7
 * 
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 *
 * What is the 10 001st prime number?
 * 
 * Expected result: 104743
 */
public class Euler7 {

    public static void main(String[] args) {

        int count = 0;
        for (int n=1; n>0; n++) {
            if (primo(n) == true){           // chama a função que verifica se é primo e em caso positivo continua..
                count++;
                if (count-1 == 10001){   		// para quando chegar no 10001º primo
                    System.out.println(n);
                    break;
                }                          
            }        
        } 
    }

    public static boolean primo(int n) {

        boolean eprimo = true;
        int i = 2;
        while ((eprimo == true) && (i <= (Math.sqrt(n)))) {
            if ((n % i) == 0){  
                eprimo = false;
            }
            else{ i++;
            }
        }
        return (eprimo); 
    }
}