/* 
Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.
How many such routes are there through a 20×20 grid?
*/


package euler15;

public class Euler15 {

    public static long count(int x, int y) {

        // x =  Numero de Quadrados
        // y =  Tamannho da GRID y*y
        
        if (y > (x-y))
        y = x - y;
        long c = 1;
        
        for (int i = 0; i < y; i++){
            c = c * (x-i);
            c = c / (i+1);	
        }
        return c;
    }
    
    public static void main (String[] args){
        //Incia e chama a funcão COUNT(Conta as possibilidades de caminhos para obter a diagonal).
        System.out.println(count(40,20));
    }
}