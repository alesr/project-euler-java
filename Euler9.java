/*
 * Special Pythagorean triplet
 *
 * Problem 9
 *
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 *                                                                 a^2 + b^2 = c^2
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 * 
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 *
 * Expected result: 31875000
 */
public class Euler9 {

    public static void main(String[] args){
    int result = 0;
        for(int a = 1; a<=500; a++){
            for(int b = 1; b<=500; b++){
                for(int c = 1; c<=a+b; c++){
                    if(a+b+c == 1000 && (a*a) + (b*b) == (c*c) ){
                        result = a*c*b;          
                    }
                }     
            }
        }
        System.out.println(result);
    }
}
