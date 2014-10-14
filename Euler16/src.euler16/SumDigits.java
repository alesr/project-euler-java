/**Recebe n = 2^1000 e retorna a soma dos dígitos de n. */
public class SumDigits {

    int sum;
    int len;  
    String s;
    
    public int sumD(java.math.BigInteger n){
        
        s = n.toString();                      // Converte n=2^1000 para string s
        len = s.length();
        String tmp;

        int i = 0;
        while(i<len){
            tmp = String.valueOf(s.charAt(i));            // Valor em String do char na posição i
            sum += Integer.parseInt(tmp);                // Retorna o valor int de tmp
            
            i++;
        }    
        return sum;
    }
}