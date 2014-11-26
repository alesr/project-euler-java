import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Euler42 {
    
    // Gera uma lista de valores triangulares até o limite do valor da maior palavra.
    private ArrayList<Double> triangleList(int n){
        ArrayList<Double> t = new ArrayList<Double>();

        for(int i=0; i<=n; i++){
            t.add(0.5*i*(i+1));
        }
        return t;
    }
    
    // Converte a string num valor numérico com A==1.
    private int nameConversor(String name){
        int nameValue = 0;
        for(int i = 0; i<name.length();i++){
            nameValue += Character.getNumericValue(name.charAt(i))-9;
        }
        return nameValue; 
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException{
        
        BufferedReader in = new BufferedReader(new FileReader("p042_words.txt"));
        String[] nameList = in.readLine().split("\",\"");
        
        nameList[0] = nameList[0].substring(1); // corrige a aspa adicional na primeira palavra.
        // retira a última aspa.
        
        nameList[nameList.length-1] = nameList[nameList.length-1].substring(0, nameList[nameList.length-1].length()-1);
        
        Euler42 a = new Euler42();
        ArrayList<Integer> valuesIndex = new ArrayList<Integer>();
        
        // Soma os valores correspondentes à cada palavra e organiza numa arraylist.
        for(int i=0; i<nameList.length;i++){
            valuesIndex.add(a.nameConversor(nameList[i]));
        }
        
        // Verifica qual é o maior valor do array.
        Collections.sort(valuesIndex);
        int maxValue = valuesIndex.get(valuesIndex.size()-1);
        
        int listSize = a.triangleList(maxValue).size();
        
        int count = 0;
        for(int i=0;i<valuesIndex.size();i++){
            double v = valuesIndex.get(i);
            for(int j=0;j<listSize; j++){
                double t = a.triangleList(maxValue).get(j);
                if(v==t){
                    count++;
                }
            }
        }
        System.out.println(count);   
    }
}