/** Recebe o produto de i*j e retorna uma string com o valor invertido */
public class ReverseString{
    
    String prodStr = "";
    String prodReverse = "";
    int prodLen = 0;

    public String reverseString(int n){
       
        prodStr = Integer.toString(n);
        prodLen = prodStr.length();
        
        /** Percorre o length da string em sentido contrário e adiciona cada i à variável prodReverse */
        for(int i = prodLen-1; i>=0; i--){         
            prodReverse += prodStr.charAt(i);
        }
        return prodReverse;
    }
}