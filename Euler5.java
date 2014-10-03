/*
 * Smallest multiple
 * 
 * Problem 5
 * 
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 *
 * Expected result: 232792560
 */
public class Euler5 {

    public static void main(String[] args) {
        
        boolean evalor = false;
        int i = 1;
        int n = 2520;
        
        /** Se o resto da divisão de n por i for igual a zero, incrementa o valor de i
         e repete o ciclo até o valor de i igual a 20 */
        while (evalor == false){
            if(n%i==0){
                i++;
                if(i == 20){
                    evalor = true;
                }
            // caso o resto da divisão seja diferente de zero, incrementa o valor de n e reinicia o valor da variável i
            }else{
                n++;
                i = 1;
                }
            }
        System.out.println(n);
    }
}