import java.util.ArrayList;

public class Euler29 {

    public static void main(String[] args){
        
        ArrayList<Double> numList = new ArrayList<Double>();
        
        //Vai rolar um overflow, mas nesse caso não nos interessa o valor de a**b e sim o size de numList.
        for(int a = 2; a <= 100; a++){
            for(int b = 2; b <= 100; b++){
                double x = Math.pow(a, b);
                if(!numList.contains(x)){
                    numList.add(x);
                }
            }
        }
        System.out.println(numList.size());
    }
}