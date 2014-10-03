/*
 * Multiples of 3 and 5

 * Problem 1

 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 * 
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 * Expected result: 233168
 */
public class Euler1 {

    public static void main(String[] args){
        
        int i = 0;
        int sum = 0;
        
        /** Enquanto i for menor que 1000, verifica se i é divisível por 3 ou por 5 e caso positivo, incrementa i. */
        while(i<1000){
            if(i%3==0 || i%5==0 ){      // "OU" para não existirem valores duplicados.
                sum += i;    
            }
            i++;
        }    
        System.out.println(sum);    
    }
}
