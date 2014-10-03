/*
 * Largest prime factor
 * 
 * Problem 3
 * 
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 *
 * Expected result: 6857
 */
public class Euler3{
    
    public static void main(String[] args){
        
        long factor = 2;
        long number = 600851475143L;
        
        for(long i = 2; i<=number; i++){
            while(number%i == 0){
                factor = i;
                number /= i;
            }
        }
        System.out.println(factor);        
    }
}