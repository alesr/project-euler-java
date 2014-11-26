public class Euler17 {
    
    public static void main(String[] args){
        
        // "one","two","three","four","five","six","seven","eight","nine"
        int n_1_9 = 3+3+5+4+4+3+5+5+4;
        // "ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"
        int n_10_19 = 3+6+6+8+8+7+7+9+8+8;
        // "twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"
        int n_20_90 = 6+6+5+5+5+7+6+6;
        // "hundred"
        int n_100 = 7;
        // "one thousand"
        int n_1000 = 11;
        // "and"
        int and = 3;
        
        int n_20_99x = 10*n_20_90 + n_1_9*8; //"twenty one"...,"thirty two"....,"forty three"...
        int n_100_999x = (n_1_9*100)+  //n_1_9 aparecem 100x  (KKX)
                         (n_1_9 + n_10_19 + n_20_99x)*9 + //
                         9*n_100 + 
                         (n_100+and)*9*99; //"one hundred and one"...,"*two hundred and four"...
        
        int sum = n_1_9 + n_10_19 + n_20_99x + n_100_999x + n_1000;
        System.out.println(sum);
    }
}
