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

        /** Caso n seja um número primo, incrementa count até encontrar o 10001º número primo */
        int count = 0;
        for (int n=1; n>0; n++) {
            if (primo(n) == true){                   
                count++;
                if (count-1 == 10001){   	
                    System.out.println(n);
                    break;
                }                          
            }        
        } 
    }

    /** @return true se n for primo */
    public static boolean primo(int n) {

        boolean eprimo = true;
        int i = 2;

        /** Se o resto da divisão de n por i for resto zero, significa que o número tem mais divisores além dele mesmo (n). 
        Caso contrário, incrementa-se o valor de i e repete-se o ciclo para todos os valores até a raíz quadrada de n */
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