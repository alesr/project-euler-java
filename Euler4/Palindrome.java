public class Palindrome {
    
    /**
     * @param n produto i*j 
     * @param s string inversa do produto   
     * @return  true se n == s
     */
    public boolean checkPalindrome(int n, String s){  
        String nStr = Integer.toString(n);        // Converte o produto em string
        return(nStr.equals(s));                  // Retorna true se o produto for igual à ao produto invertida
    }
}
