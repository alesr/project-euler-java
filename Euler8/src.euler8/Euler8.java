/*
 * Largest product in a series
 *
 * Problem 8
 *
 * The four adjacent digits in the 1000-digit number that have the greatest product are 9 × 9 × 8 × 9 = 5832. 
 * Find the thirteen adjacent digits in the 1000-digit number that have the greatest product. What is the value of this product?
 *
 * Expected result: 2351464000
 */
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Euler8 {
    
    public static void main(String[] args) throws FileNotFoundException, IOException{
    
        BufferedReader in = new BufferedReader(new FileReader("digits.txt"));
        
        ArrayList<Integer> numList = new ArrayList<Integer>();
        
        String line;
        long product = 1;
        long maxProd = 0;
        
        /** Lê as linhas do ficheiro txt e adiciona os dígitos ao arraylist numList. */
        int i = 0;
        while((line = in.readLine()) != null){
            for(int j = 0; j<line.length(); j++){         
                numList.add(Integer.parseInt(String.valueOf(line.charAt(j))));        
            }             
            i++;
        }

        /** Calcula o produto da sequência de 13 dígitos e comparar com o produto máximo */
        int chunk = 13;
        for(int x = 0; x<numList.size(); x++){
            for(int y = x; y<chunk+x && y < numList.size(); y++){
                product *= numList.get(y);
            }
            if(product > maxProd){
                maxProd = product;
            }
            product = 1;
        } 
        System.out.println(maxProd);
    }  
}
