/*
 * Sum square difference
 * 
 * Problem 6
 * 
 * The sum of the squares of the first ten natural numbers is, 1^2 + 2^2 + ... + 10^2 = 385
 * The square of the sum of the first ten natural numbers is, (1 + 2 + ... + 10)^2 = 552 = 3025
 * 
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 * 
 * Expected result: 25164150
 */
public class Euler6 {
    
    public static void main(String[] args) {
        
        int sumA = 0;         // A soma dos quadrados
        int sumB = 0;        // O quadrado da soma
        int result = 0;     // A diferença entre sumA e sumB
        
        /** Para da valor i neste intervalo, incremanta-se sumA com o quadrado de i e sumB com i */
        for(int i = 0; i <= 100; i++){
            sumA += i*i;
            sumB += i;
        }
        sumB = sumB*sumB;       // O quadrado de sumB
        result = sumB - sumA;
       
        System.out.println(result);
    }    
}