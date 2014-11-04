import java.math.BigInteger;
// Vide Euler16, BigIntergers POW
public class Euler48 {
    public static void main(String[] args){
    
        BigInteger power = BigInteger.ZERO;
        BigInteger sum = BigInteger.ZERO; 
        for(int i = 1; i <= 1000; i++){
            sum = sum.add(BigInteger.valueOf(i).pow(i)) ;
        }
        String sumStr = sum.toString();
        System.out.println(sumStr.substring(sumStr.length()-10));   
    }
}