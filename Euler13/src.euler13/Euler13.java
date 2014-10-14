/*
 * Large sum
 *
 * Problem 13
 *
 * Work out the first ten digits of the sum of the following one-hundred 50-digit numbers.
 * 
 * 37107287533902102798797998220837590246510135740250
 * 46376937677490009712648124896970078050417018260538
 * 74324986199524741059474233309513058123726617309629
 * 919422133635741...
 *
 * Expected result: 5537376230
 */
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

public class Euler13 {
    
    public static void main(String[] args) throws FileNotFoundException, IOException{
        
        BufferedReader in = new BufferedReader(new FileReader("Digits.txt"));
        ArrayList<String> numList = new ArrayList<String>();
        String line;
       
        /** Lê as linhas do ficheiro txt e adiciona as linhas ao arraylist numList. */
        int i = 0;        
        while((line = in.readLine()) != null){
            numList.add(line);
        }
        
        BigInteger sum = BigInteger.ZERO;                           // Inicializa sum com zero
        int size = numList.size();
        
        for(int k = 0; k < size; k++){                             // Incrementa as linhas ao valor à soma
            sum = sum.add(new BigInteger(numList.get(k)));
        }
        
        String result = String.valueOf(sum);                      
        System.out.println(result.substring(0, 10));
    }
}