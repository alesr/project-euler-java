package euler72;

public class Euler72 {
    public static void main(String[]args){
    
        int LIMIT = 1000001;

        int[] totient = new int[LIMIT];
        for (int i = 1; i < LIMIT; ++i) {
            totient[i] = i;
        }

        long sum = 0;
        int tempNum = 1;

        for (int i = 2; i < LIMIT; ++i) {
            if (totient[i] == i) {
                --totient[i];
                tempNum = i - 1;
                for (int j = i << 1; j < LIMIT; j += i) {
                    totient[j] = totient[j] / i * tempNum;
                }
            }
            sum += totient[i];
        }

        System.out.println(sum);
    }
}