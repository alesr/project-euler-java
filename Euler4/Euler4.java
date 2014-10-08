/*
 * Largest palindrome product
 * 
 * Problem 4  
 * 
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * 
 * Expected result: 906609
 */
public class Euler4 {
    
    public static void main(String[] args){
        
        int product;  
        String n;
        boolean m;
        int maxPalindrome = 0;
        
        /** */
        for(int i = 999; i>=100; i--){
            
            for(int j = 999; j>=100; j--){
                
                product = i * j;
                
                ReverseString a = new ReverseString();  // Converte o int produto numa string com o valor invertido
                n = a.reverseString(product);
                
                Palindrome b = new Palindrome();        // Verifica se o produto é igual ao seu valor invertido.
                m = b.checkPalindrome(product, n);
                
                if(m && product>maxPalindrome){         // Condição de saída do ciclo.
                    maxPalindrome = product;
                    break;
                }
            }
        }
        System.out.println(maxPalindrome);
    }
}