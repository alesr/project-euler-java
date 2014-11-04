public class Euler30 {
    
    public static void main(String[] args){
    
        int totalSum = 0;
    
        for(int i = 2; i < 1000000; i++){
            int sumDigit = 0;
            String numStr = String.valueOf(i);

            for(int j = 0; j < numStr.length(); j++){
                int pow = Integer.parseInt(String.valueOf(numStr.charAt(j)));
                sumDigit += Math.pow(pow, 5);
            }
            if(sumDigit == i){
                totalSum += sumDigit;
            }
        }
        System.out.println(totalSum);
    }
}