import java.math.BigInteger;

public class Euler56{


	// Calcula a^b para cada a e b < 100####
    public String calcPow() {
        int max = 0;
        for (int a = 1; a < 100; a++) {
            for (int b = 1; b < 100; b++) {
                BigInteger pow = BigInteger.valueOf(a).pow(b);
                max = Math.max(totalSum(pow), max);  // retorna o maior valorr
            }
        }
        return Integer.toString(max);
    }

    // Soma os números retirandos zeros.
    public int totalSum(BigInteger result) {
            int sum = 0;
            String strResult = result.toString();
            for (int i = 0; i < strResult.length(); i++)
                    sum += strResult.charAt(i) - '0';
            return sum;
    }
     
    public static void main(String[] args) {
        Euler56 x = new Euler56();
        System.out.println(x.calcPow());
    }
}