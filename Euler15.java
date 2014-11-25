package euler15;

public class Euler15 {

    public static long binomialCoefficient(int n, int k) {
        
        if (k > (n-k))
        k = n - k;
        long c = 1;
        
        for (int i = 0; i < k; i++){
            c = c * (n-i);
            c = c / (i+1);	
        }
        return c;
    }
    
    public static void main (String[] args){

        System.out.println(binomialCoefficient(40,20));
    }
}